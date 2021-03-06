import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("if")
@Implements("ItemComposition")
public class ItemComposition extends CacheableNode {
   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("items")
   public static NodeCache items;
   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("itemModelCache")
   public static NodeCache itemModelCache;
   @ObfuscatedName("m")
   @ObfuscatedSignature(
      signature = "Lgs;"
   )
   @Export("itemSpriteCache")
   public static NodeCache itemSpriteCache;
   @ObfuscatedName("l")
   @Export("isMembersWorld")
   public static boolean isMembersWorld;
   @ObfuscatedName("ov")
   @ObfuscatedSignature(
      signature = "Lkp;"
   )
   static SpritePixels field3531;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 273775035
   )
   public static int field3520;
   @ObfuscatedName("am")
   @ObfuscatedGetter(
      intValue = -1601314467
   )
   @Export("maleHeadModel")
   int maleHeadModel;
   @ObfuscatedName("aj")
   @ObfuscatedGetter(
      intValue = -1769217833
   )
   @Export("maleModel")
   int maleModel;
   @ObfuscatedName("r")
   @ObfuscatedGetter(
      intValue = -892374715
   )
   @Export("inventoryModel")
   int inventoryModel;
   @ObfuscatedName("aa")
   @Export("countObj")
   int[] countObj;
   @ObfuscatedName("ab")
   @ObfuscatedGetter(
      intValue = -1582325727
   )
   @Export("team")
   int team;
   @ObfuscatedName("bn")
   @ObfuscatedSignature(
      signature = "Lgd;"
   )
   IterableHashTable field3525;
   @ObfuscatedName("ah")
   @ObfuscatedGetter(
      intValue = 1828835589
   )
   @Export("maleHeadModel2")
   int maleHeadModel2;
   @ObfuscatedName("ae")
   @ObfuscatedGetter(
      intValue = -1215994739
   )
   @Export("maleModel1")
   int maleModel1;
   @ObfuscatedName("az")
   @ObfuscatedGetter(
      intValue = -2059791531
   )
   @Export("maleModel2")
   int maleModel2;
   @ObfuscatedName("ag")
   @Export("inventoryActions")
   public String[] inventoryActions;
   @ObfuscatedName("e")
   @Export("name")
   public String name;
   @ObfuscatedName("ap")
   @ObfuscatedGetter(
      intValue = 85782419
   )
   @Export("femaleHeadModel")
   int femaleHeadModel;
   @ObfuscatedName("z")
   @ObfuscatedGetter(
      intValue = 1261131743
   )
   @Export("zoom2d")
   public int zoom2d;
   @ObfuscatedName("s")
   @ObfuscatedGetter(
      intValue = -195586667
   )
   @Export("id")
   public int id;
   @ObfuscatedName("ad")
   @ObfuscatedGetter(
      intValue = -142924429
   )
   @Export("femaleHeadModel2")
   int femaleHeadModel2;
   @ObfuscatedName("as")
   @ObfuscatedGetter(
      intValue = -1341833221
   )
   @Export("femaleModel")
   int femaleModel;
   @ObfuscatedName("aw")
   @Export("countCo")
   int[] countCo;
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      intValue = -1346641473
   )
   @Export("femaleModel1")
   int femaleModel1;
   @ObfuscatedName("al")
   @ObfuscatedGetter(
      intValue = -758000691
   )
   @Export("femaleModel2")
   int femaleModel2;
   @ObfuscatedName("u")
   @ObfuscatedGetter(
      intValue = 1943406797
   )
   @Export("xan2d")
   public int xan2d;
   @ObfuscatedName("ak")
   @ObfuscatedGetter(
      intValue = -659715161
   )
   @Export("resizeX")
   int resizeX;
   @ObfuscatedName("k")
   @ObfuscatedGetter(
      intValue = -1257254451
   )
   @Export("yan2d")
   public int yan2d;
   @ObfuscatedName("n")
   @ObfuscatedGetter(
      intValue = 1579117451
   )
   @Export("offsetX2d")
   public int offsetX2d;
   @ObfuscatedName("ax")
   @ObfuscatedGetter(
      intValue = -240448859
   )
   @Export("isStackable")
   public int isStackable;
   @ObfuscatedName("ac")
   @ObfuscatedGetter(
      intValue = 200916237
   )
   @Export("resizeY")
   int resizeY;
   @ObfuscatedName("d")
   @ObfuscatedGetter(
      intValue = 392716113
   )
   @Export("offsetY2d")
   public int offsetY2d;
   @ObfuscatedName("q")
   @ObfuscatedGetter(
      intValue = 1067705123
   )
   @Export("zan2d")
   public int zan2d;
   @ObfuscatedName("an")
   @Export("isMembers")
   public boolean isMembers;
   @ObfuscatedName("ao")
   @ObfuscatedGetter(
      intValue = 1377514943
   )
   @Export("price")
   public int price;
   @ObfuscatedName("ay")
   @ObfuscatedGetter(
      intValue = -1672614075
   )
   @Export("resizeZ")
   int resizeZ;
   @ObfuscatedName("a")
   @Export("colourToReplace")
   short[] colourToReplace;
   @ObfuscatedName("at")
   @ObfuscatedGetter(
      intValue = 1650530357
   )
   @Export("maleOffset")
   int maleOffset;
   @ObfuscatedName("t")
   @Export("textureToReplace")
   short[] textureToReplace;
   @ObfuscatedName("ai")
   @ObfuscatedGetter(
      intValue = 765762299
   )
   @Export("notedTemplate")
   public int notedTemplate;
   @ObfuscatedName("ar")
   @Export("groundActions")
   public String[] groundActions;
   @ObfuscatedName("v")
   @Export("colourToReplaceWith")
   short[] colourToReplaceWith;
   @ObfuscatedName("au")
   @ObfuscatedGetter(
      intValue = 1601686325
   )
   @Export("femaleOffset")
   int femaleOffset;
   @ObfuscatedName("y")
   @Export("textToReplaceWith")
   short[] textToReplaceWith;
   @ObfuscatedName("by")
   public boolean field3508;
   @ObfuscatedName("bk")
   @ObfuscatedGetter(
      intValue = -917942205
   )
   @Export("ambient")
   public int ambient;
   @ObfuscatedName("bh")
   @ObfuscatedGetter(
      intValue = 1789689555
   )
   @Export("notedId")
   int notedId;
   @ObfuscatedName("bi")
   @ObfuscatedGetter(
      intValue = 280546119
   )
   @Export("contrast")
   public int contrast;
   @ObfuscatedName("aq")
   @ObfuscatedGetter(
      intValue = 845942859
   )
   @Export("note")
   public int note;
   @ObfuscatedName("bc")
   @ObfuscatedGetter(
      intValue = 165191337
   )
   @Export("unnotedId")
   int unnotedId;
   @ObfuscatedName("ba")
   @ObfuscatedGetter(
      intValue = -1552925669
   )
   public int field3524;
   @ObfuscatedName("bj")
   @ObfuscatedGetter(
      intValue = -1555424877
   )
   public int field3530;
   @ObfuscatedName("bw")
   @ObfuscatedGetter(
      intValue = 229726689
   )
   public int field3529;

   static {
      items = new NodeCache(64);
      itemModelCache = new NodeCache(50);
      itemSpriteCache = new NodeCache(200);
   }

   ItemComposition() {
      this.name = "null";
      this.zoom2d = 2000;
      this.xan2d = 0;
      this.yan2d = 0;
      this.zan2d = 0;
      this.offsetX2d = 0;
      this.offsetY2d = 0;
      this.isStackable = 0;
      this.price = 1;
      this.isMembers = false;
      this.groundActions = new String[]{null, null, "Take", null, null};
      this.inventoryActions = new String[]{null, null, null, null, "Drop"};
      this.team = -2;
      this.maleModel = -1;
      this.maleModel1 = -1;
      this.maleOffset = 0;
      this.femaleModel = -1;
      this.femaleModel1 = -1;
      this.femaleOffset = 0;
      this.maleModel2 = -1;
      this.femaleModel2 = -1;
      this.maleHeadModel = -1;
      this.maleHeadModel2 = -1;
      this.femaleHeadModel = -1;
      this.femaleHeadModel2 = -1;
      this.note = -1;
      this.notedTemplate = -1;
      this.resizeX = 128;
      this.resizeY = 128;
      this.resizeZ = 128;
      this.ambient = 0;
      this.contrast = 0;
      this.field3524 = 0;
      this.field3508 = false;
      this.unnotedId = -1;
      this.notedId = -1;
      this.field3529 = -1;
      this.field3530 = -1;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      signature = "(Lfb;II)V",
      garbageValue = "1332452293"
   )
   @Export("populateFromBuffer")
   void populateFromBuffer(Buffer var1, int var2) {
      if(var2 == 1) {
         this.inventoryModel = var1.readUnsignedShort();
      } else if(var2 == 2) {
         this.name = var1.readString();
      } else if(var2 == 4) {
         this.zoom2d = var1.readUnsignedShort();
      } else if(var2 == 5) {
         this.xan2d = var1.readUnsignedShort();
      } else if(var2 == 6) {
         this.yan2d = var1.readUnsignedShort();
      } else if(var2 == 7) {
         this.offsetX2d = var1.readUnsignedShort();
         if(this.offsetX2d > 32767) {
            this.offsetX2d -= 65536;
         }
      } else if(var2 == 8) {
         this.offsetY2d = var1.readUnsignedShort();
         if(this.offsetY2d > 32767) {
            this.offsetY2d -= 65536;
         }
      } else if(var2 == 11) {
         this.isStackable = 1;
      } else if(var2 == 12) {
         this.price = var1.readInt();
      } else if(var2 == 16) {
         this.isMembers = true;
      } else if(var2 == 23) {
         this.maleModel = var1.readUnsignedShort();
         this.maleOffset = var1.readUnsignedByte();
      } else if(var2 == 24) {
         this.maleModel1 = var1.readUnsignedShort();
      } else if(var2 == 25) {
         this.femaleModel = var1.readUnsignedShort();
         this.femaleOffset = var1.readUnsignedByte();
      } else if(var2 == 26) {
         this.femaleModel1 = var1.readUnsignedShort();
      } else if(var2 >= 30 && var2 < 35) {
         this.groundActions[var2 - 30] = var1.readString();
         if(this.groundActions[var2 - 30].equalsIgnoreCase("Hidden")) {
            this.groundActions[var2 - 30] = null;
         }
      } else if(var2 >= 35 && var2 < 40) {
         this.inventoryActions[var2 - 35] = var1.readString();
      } else {
         int var3;
         int var4;
         if(var2 == 40) {
            var3 = var1.readUnsignedByte();
            this.colourToReplace = new short[var3];
            this.colourToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.colourToReplace[var4] = (short)var1.readUnsignedShort();
               this.colourToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 41) {
            var3 = var1.readUnsignedByte();
            this.textureToReplace = new short[var3];
            this.textToReplaceWith = new short[var3];

            for(var4 = 0; var4 < var3; ++var4) {
               this.textureToReplace[var4] = (short)var1.readUnsignedShort();
               this.textToReplaceWith[var4] = (short)var1.readUnsignedShort();
            }
         } else if(var2 == 42) {
            this.team = var1.readByte();
         } else if(var2 == 65) {
            this.field3508 = true;
         } else if(var2 == 78) {
            this.maleModel2 = var1.readUnsignedShort();
         } else if(var2 == 79) {
            this.femaleModel2 = var1.readUnsignedShort();
         } else if(var2 == 90) {
            this.maleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 91) {
            this.femaleHeadModel = var1.readUnsignedShort();
         } else if(var2 == 92) {
            this.maleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 93) {
            this.femaleHeadModel2 = var1.readUnsignedShort();
         } else if(var2 == 95) {
            this.zan2d = var1.readUnsignedShort();
         } else if(var2 == 97) {
            this.note = var1.readUnsignedShort();
         } else if(var2 == 98) {
            this.notedTemplate = var1.readUnsignedShort();
         } else if(var2 >= 100 && var2 < 110) {
            if(this.countObj == null) {
               this.countObj = new int[10];
               this.countCo = new int[10];
            }

            this.countObj[var2 - 100] = var1.readUnsignedShort();
            this.countCo[var2 - 100] = var1.readUnsignedShort();
         } else if(var2 == 110) {
            this.resizeX = var1.readUnsignedShort();
         } else if(var2 == 111) {
            this.resizeY = var1.readUnsignedShort();
         } else if(var2 == 112) {
            this.resizeZ = var1.readUnsignedShort();
         } else if(var2 == 113) {
            this.ambient = var1.readByte();
         } else if(var2 == 114) {
            this.contrast = var1.readByte() * 5;
         } else if(var2 == 115) {
            this.field3524 = var1.readUnsignedByte();
         } else if(var2 == 139) {
            this.unnotedId = var1.readUnsignedShort();
         } else if(var2 == 140) {
            this.notedId = var1.readUnsignedShort();
         } else if(var2 == 148) {
            this.field3529 = var1.readUnsignedShort();
         } else if(var2 == 149) {
            this.field3530 = var1.readUnsignedShort();
         } else if(var2 == 249) {
            this.field3525 = FileRequest.method4109(var1, this.field3525);
         }
      }

   }

   @ObfuscatedName("b")
   @ObfuscatedSignature(
      signature = "(IB)Leo;",
      garbageValue = "96"
   )
   @Export("getModel")
   public final Model getModel(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return SoundTask.getItemDefinition(var2).getModel(1);
         }
      }

      Model var5 = (Model)itemModelCache.get((long)this.id);
      if(var5 != null) {
         return var5;
      } else {
         ModelData var6 = ModelData.method2431(class3.field19, this.inventoryModel, 0);
         if(var6 == null) {
            return null;
         } else {
            if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
               var6.method2448(this.resizeX, this.resizeY, this.resizeZ);
            }

            int var4;
            if(this.colourToReplace != null) {
               for(var4 = 0; var4 < this.colourToReplace.length; ++var4) {
                  var6.recolor(this.colourToReplace[var4], this.colourToReplaceWith[var4]);
               }
            }

            if(this.textureToReplace != null) {
               for(var4 = 0; var4 < this.textureToReplace.length; ++var4) {
                  var6.method2446(this.textureToReplace[var4], this.textToReplaceWith[var4]);
               }
            }

            var5 = var6.light(this.ambient + 64, this.contrast + 768, -50, -10, -50);
            var5.field1990 = true;
            itemModelCache.put(var5, (long)this.id);
            return var5;
         }
      }
   }

   @ObfuscatedName("w")
   @ObfuscatedSignature(
      signature = "(IB)Ldi;",
      garbageValue = "-66"
   )
   public final ModelData method4594(int var1) {
      int var3;
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return SoundTask.getItemDefinition(var2).method4594(1);
         }
      }

      ModelData var4 = ModelData.method2431(class3.field19, this.inventoryModel, 0);
      if(var4 == null) {
         return null;
      } else {
         if(this.resizeX != 128 || this.resizeY != 128 || this.resizeZ != 128) {
            var4.method2448(this.resizeX, this.resizeY, this.resizeZ);
         }

         if(this.colourToReplace != null) {
            for(var3 = 0; var3 < this.colourToReplace.length; ++var3) {
               var4.recolor(this.colourToReplace[var3], this.colourToReplaceWith[var3]);
            }
         }

         if(this.textureToReplace != null) {
            for(var3 = 0; var3 < this.textureToReplace.length; ++var3) {
               var4.method2446(this.textureToReplace[var3], this.textToReplaceWith[var3]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "-1762190236"
   )
   public final boolean method4605(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var4 = true;
         if(!class3.field19.method4115(var2, 0)) {
            var4 = false;
         }

         if(var3 != -1 && !class3.field19.method4115(var3, 0)) {
            var4 = false;
         }

         return var4;
      }
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      signature = "(I)V",
      garbageValue = "1057041403"
   )
   @Export("post")
   void post() {
   }

   @ObfuscatedName("t")
   @ObfuscatedSignature(
      signature = "(ZI)Ldi;",
      garbageValue = "-263364235"
   )
   public final ModelData method4606(boolean var1) {
      int var2 = this.maleHeadModel;
      int var3 = this.maleHeadModel2;
      if(var1) {
         var2 = this.femaleHeadModel;
         var3 = this.femaleHeadModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var4 = ModelData.method2431(class3.field19, var2, 0);
         if(var3 != -1) {
            ModelData var5 = ModelData.method2431(class3.field19, var3, 0);
            ModelData[] var6 = new ModelData[]{var4, var5};
            var4 = new ModelData(var6, 2);
         }

         int var7;
         if(this.colourToReplace != null) {
            for(var7 = 0; var7 < this.colourToReplace.length; ++var7) {
               var4.recolor(this.colourToReplace[var7], this.colourToReplaceWith[var7]);
            }
         }

         if(this.textureToReplace != null) {
            for(var7 = 0; var7 < this.textureToReplace.length; ++var7) {
               var4.method2446(this.textureToReplace[var7], this.textToReplaceWith[var7]);
            }
         }

         return var4;
      }
   }

   @ObfuscatedName("p")
   @ObfuscatedSignature(
      signature = "(Lfb;I)V",
      garbageValue = "-1345276980"
   )
   @Export("loadBuffer")
   void loadBuffer(Buffer var1) {
      while(true) {
         int var2 = var1.readUnsignedByte();
         if(var2 == 0) {
            return;
         }

         this.populateFromBuffer(var1, var2);
      }
   }

   @ObfuscatedName("e")
   @ObfuscatedSignature(
      signature = "(ZI)Z",
      garbageValue = "-846184118"
   )
   @Export("readyWorn")
   public final boolean readyWorn(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return true;
      } else {
         boolean var5 = true;
         if(!class3.field19.method4115(var2, 0)) {
            var5 = false;
         }

         if(var3 != -1 && !class3.field19.method4115(var3, 0)) {
            var5 = false;
         }

         if(var4 != -1 && !class3.field19.method4115(var4, 0)) {
            var5 = false;
         }

         return var5;
      }
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      signature = "(ZI)Ldi;",
      garbageValue = "-1704873665"
   )
   @Export("getWornModelData")
   public final ModelData getWornModelData(boolean var1) {
      int var2 = this.maleModel;
      int var3 = this.maleModel1;
      int var4 = this.maleModel2;
      if(var1) {
         var2 = this.femaleModel;
         var3 = this.femaleModel1;
         var4 = this.femaleModel2;
      }

      if(var2 == -1) {
         return null;
      } else {
         ModelData var5 = ModelData.method2431(class3.field19, var2, 0);
         if(var3 != -1) {
            ModelData var6 = ModelData.method2431(class3.field19, var3, 0);
            if(var4 != -1) {
               ModelData var7 = ModelData.method2431(class3.field19, var4, 0);
               ModelData[] var8 = new ModelData[]{var5, var6, var7};
               var5 = new ModelData(var8, 3);
            } else {
               ModelData[] var10 = new ModelData[]{var5, var6};
               var5 = new ModelData(var10, 2);
            }
         }

         if(!var1 && this.maleOffset != 0) {
            var5.method2444(0, this.maleOffset, 0);
         }

         if(var1 && this.femaleOffset != 0) {
            var5.method2444(0, this.femaleOffset, 0);
         }

         int var9;
         if(this.colourToReplace != null) {
            for(var9 = 0; var9 < this.colourToReplace.length; ++var9) {
               var5.recolor(this.colourToReplace[var9], this.colourToReplaceWith[var9]);
            }
         }

         if(this.textureToReplace != null) {
            for(var9 = 0; var9 < this.textureToReplace.length; ++var9) {
               var5.method2446(this.textureToReplace[var9], this.textToReplaceWith[var9]);
            }
         }

         return var5;
      }
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      signature = "(Lif;Lif;B)V",
      garbageValue = "-25"
   )
   void method4597(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.price = var2.price;
      this.isStackable = 1;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      signature = "(Lif;Lif;S)V",
      garbageValue = "1491"
   )
   void method4598(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var2.colourToReplace;
      this.colourToReplaceWith = var2.colourToReplaceWith;
      this.textureToReplace = var2.textureToReplace;
      this.textToReplaceWith = var2.textToReplaceWith;
      this.name = var2.name;
      this.isMembers = var2.isMembers;
      this.isStackable = var2.isStackable;
      this.maleModel = var2.maleModel;
      this.maleModel1 = var2.maleModel1;
      this.maleModel2 = var2.maleModel2;
      this.femaleModel = var2.femaleModel;
      this.femaleModel1 = var2.femaleModel1;
      this.femaleModel2 = var2.femaleModel2;
      this.maleHeadModel = var2.maleHeadModel;
      this.maleHeadModel2 = var2.maleHeadModel2;
      this.femaleHeadModel = var2.femaleHeadModel;
      this.femaleHeadModel2 = var2.femaleHeadModel2;
      this.field3524 = var2.field3524;
      this.groundActions = var2.groundActions;
      this.inventoryActions = new String[5];
      if(var2.inventoryActions != null) {
         for(int var3 = 0; var3 < 4; ++var3) {
            this.inventoryActions[var3] = var2.inventoryActions[var3];
         }
      }

      this.inventoryActions[4] = "Discard";
      this.price = 0;
   }

   @ObfuscatedName("l")
   @ObfuscatedSignature(
      signature = "(Lif;Lif;B)V",
      garbageValue = "127"
   )
   void method4632(ItemComposition var1, ItemComposition var2) {
      this.inventoryModel = var1.inventoryModel;
      this.zoom2d = var1.zoom2d;
      this.xan2d = var1.xan2d;
      this.yan2d = var1.yan2d;
      this.zan2d = var1.zan2d;
      this.offsetX2d = var1.offsetX2d;
      this.offsetY2d = var1.offsetY2d;
      this.colourToReplace = var1.colourToReplace;
      this.colourToReplaceWith = var1.colourToReplaceWith;
      this.textureToReplace = var1.textureToReplace;
      this.textToReplaceWith = var1.textToReplaceWith;
      this.isStackable = var1.isStackable;
      this.name = var2.name;
      this.price = 0;
      this.isMembers = false;
      this.field3508 = false;
   }

   @ObfuscatedName("o")
   @ObfuscatedSignature(
      signature = "(IB)Lif;",
      garbageValue = "-103"
   )
   public ItemComposition method4595(int var1) {
      if(this.countObj != null && var1 > 1) {
         int var2 = -1;

         for(int var3 = 0; var3 < 10; ++var3) {
            if(var1 >= this.countCo[var3] && this.countCo[var3] != 0) {
               var2 = this.countObj[var3];
            }
         }

         if(var2 != -1) {
            return SoundTask.getItemDefinition(var2);
         }
      }

      return this;
   }

   @ObfuscatedName("n")
   @ObfuscatedSignature(
      signature = "(I)I",
      garbageValue = "-439661958"
   )
   public int method4615() {
      return this.team != -1 && this.inventoryActions != null?(this.team >= 0?(this.inventoryActions[this.team] != null?this.team:-1):("Drop".equalsIgnoreCase(this.inventoryActions[4])?4:-1)):-1;
   }

   @ObfuscatedName("y")
   @ObfuscatedSignature(
      signature = "(III)I",
      garbageValue = "-110817133"
   )
   public int method4607(int var1, int var2) {
      return ChatLineBuffer.method1892(this.field3525, var1, var2);
   }

   @ObfuscatedName("u")
   @ObfuscatedSignature(
      signature = "(ILjava/lang/String;B)Ljava/lang/String;",
      garbageValue = "-18"
   )
   public String method4657(int var1, String var2) {
      return class29.method261(this.field3525, var1, var2);
   }
}
