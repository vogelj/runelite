/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.deob.deobfuscators.cfg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import net.runelite.asm.attributes.Code;
import net.runelite.asm.attributes.code.Exception;
import net.runelite.asm.attributes.code.Exceptions;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Instructions;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instruction.types.JumpingInstruction;
import net.runelite.asm.attributes.code.instruction.types.ReturnInstruction;
import net.runelite.asm.attributes.code.instructions.AThrow;

public class ControlFlowGraph
{
	private Map<Label, Block> blocks = new HashMap<>();
	private List<Block> allBlocks = new ArrayList<>();
	private final Block head;

	public ControlFlowGraph(Block head)
	{
		this.head = head;
	}

	public Block getBlock(Label label)
	{
		return blocks.get(label);
	}

	public Collection<Block> getBlocks()
	{
		return allBlocks;
	}

	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for (Block b : allBlocks)
		{
			sb.append(b.toString());
		}
		return sb.toString();
	}

	public Block getHead()
	{
		return head;
	}

	public static ControlFlowGraph build(Code code)
	{
		Map<Label, Block> blocks = new HashMap<>();
		List<Block> allblocks = new ArrayList<>();

		int id = 0;
		for (Instruction i : code.getInstructions().getInstructions())
		{
			if (i instanceof Label)
			{
				// blocks always begin at labels, so create initial blocks
				Block block = new Block();
				blocks.put((Label) i, block);
				allblocks.add(block);
			}
		}

		Block cur = null;
		Block head = null;

		for (Instruction i : code.getInstructions().getInstructions())
		{
			if (i instanceof Label)
			{
				Block next = blocks.get((Label) i);
				assert next != null;

				if (next.getId() == -1)
				{
					next.setId(id++);
				}

				if (head == null)
				{
					head = cur = next;
				}
				else if (next != cur)
				{
					assert cur != null;

					if (!cur.getInstructions().get(cur.getInstructions().size() - 1).isTerminal())
					{
						assert next.getFlowsFrom() == null;
						assert cur.getFlowsInto() == null;

						// previous block flows directly into next
						next.setFlowsFrom(cur);
						cur.setFlowsInto(next);
					}

					cur = next;
				}
			}

			assert cur != null : "code doesn't start with a label";
			cur.addInstruction(i);

			if (i instanceof JumpingInstruction || i.isTerminal())
			{
				assert i instanceof JumpingInstruction || i instanceof AThrow || i instanceof ReturnInstruction;

				if (i instanceof JumpingInstruction)
				{
					JumpingInstruction ji = (JumpingInstruction) i;

					for (Label l : ji.getJumps())
					{
						Block next = blocks.get(l);

						if (next.getId() == -1)
						{
							next.setId(id++);
						}

						cur.addNext(next);
						next.addPrev(cur);
					}
				}
			}
		}

		assert head != null : "no instructions in code";
		assert head.getFlowsFrom() == null;

		for (Block b : allblocks)
		{
			buildExceptions(code, b);
		}

		ControlFlowGraph cfg = new ControlFlowGraph(head);
		cfg.blocks = blocks;
		cfg.allBlocks = allblocks;
		return cfg;
	}

	private static void buildExceptions(Code code, Block block)
	{
		Instruction first = block.getInstructions().get(0),
			last = block.getInstructions().get(block.getInstructions().size() - 1);

		List<ExceptionHandler> exFirst = findExceptionsFor(code, first),
			exLast = findExceptionsFor(code, last);

		assert exFirst.equals(exLast) : "exceptions for first instructions don't match last"; // this means block passes exception boundaries

		block.setExceptions(exFirst);
	}

	/**
	 * Find the exception handlers that protect a given instruction.
	 *
	 * @param code
	 * @param i
	 * @return The list of {type, handler}, ordered so the outer-most
	 * exception is first.
	 */
	private static List<ExceptionHandler> findExceptionsFor(Code code, Instruction i)
	{
		Instructions instructions = code.getInstructions();
		Exceptions exceptions = code.getExceptions();

		List<Exception> ex = new ArrayList<>();
		int iidx = instructions.getInstructions().indexOf(i);

		for (Exception e : exceptions.getExceptions())
		{
			int sidx = instructions.getInstructions().indexOf(e.getStart());
			int eidx = instructions.getInstructions().indexOf(e.getEnd());

			if (iidx >= sidx && iidx < eidx)
			{
				ex.add(e);
			}
		}

		// Assert that exceptions don't overlap each other (can this ever happen?)
		for (Exception ex1 : ex)
		{
			for (Exception ex2 : ex)
			{
				if (ex1 == ex2)
				{
					continue;
				}

				int sidx = instructions.getInstructions().indexOf(ex1.getStart());
				int eidx = instructions.getInstructions().indexOf(ex1.getEnd());

				int sidx2 = instructions.getInstructions().indexOf(ex2.getStart());
				int eidx2 = instructions.getInstructions().indexOf(ex2.getEnd());

				assert (sidx2 >= sidx && eidx2 <= eidx)
					|| (sidx >= sidx2 && eidx <= eidx2) : "overlapping exception ranges";
			}
		}

		// Sort exceptions so that the largest range exception is first
		ex.sort((ex1, ex2) ->
		{
			int sidx = instructions.getInstructions().indexOf(ex1.getStart());
			int eidx = instructions.getInstructions().indexOf(ex1.getEnd());

			int sidx2 = instructions.getInstructions().indexOf(ex2.getStart());
			int eidx2 = instructions.getInstructions().indexOf(ex2.getEnd());

			return Integer.compare(eidx2 - sidx2, eidx - sidx);
		});

		// This just asserts the above sort worked..
		Exception prev = null;
		for (Exception e : ex)
		{
			if (prev == null)
			{
				prev = e;
				continue;
			}

			// this must be inside of prev
			int sidx = instructions.getInstructions().indexOf(e.getStart());
			int eidx = instructions.getInstructions().indexOf(e.getEnd());

			int sidx2 = instructions.getInstructions().indexOf(prev.getStart());
			int eidx2 = instructions.getInstructions().indexOf(prev.getEnd());

			assert sidx >= sidx2;
			assert eidx <= eidx2;

			prev = e;
		}

		return ex
			.stream()
			.map(ex2 -> new ExceptionHandler(ex2.getCatchType(), ex2.getHandler()))
			.collect(Collectors.toList());
	}
}
