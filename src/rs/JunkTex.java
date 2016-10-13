/* Static - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Random;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.link.Deque;
import com.jagex.link.Cache;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.link.Queue;
import com.jagex.link.ref.SoftCache;
import com.jagex.map.MapRegion;
import com.jagex.map.SceneCluster;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class148_Sub2;
import com.jagex.rt4.Class14_Sub1;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1_Sub2;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;
import com.jagex.rt4.ShadowManager;
import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.lights.Light;
import com.jagex.rt4.lights.LightManager;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

import rs.*;

public class JunkTex {
	static {
		aBoolean4249 = false;
		anIntArrayArray4261 = new int[5][5000];
		aBoolean4245 = false;
	}
	public static Class124 aClass124_4510;

	public static Class124 aClass124_4511;
	static {
		JunkTex.aClass124_4264 = JunkTex.aClass124_4274;
		JunkTex.anIntArray4275 = new int[2000];
		JunkTex.aBooleanArray4271 = new boolean[8];
	}
	static {
		JunkTex.aClass124_4312 = Class14_Sub2_Sub2.method263(1178, "Starting 3d library");
		JunkTex.aClass124_4315 = JunkTex.aClass124_4305;
		JunkTex.aClass124_4302 = JunkTex.aClass124_4312;
	}
	
	static {
		JunkTex.aClass124_4325 = Class14_Sub2_Sub2.method263(1178, "leuchten3:");
		JunkTex.aClass124_4322 = Class14_Sub2_Sub2.method263(1178, " is already on your ignore list)3");
		JunkTex.anInt4327 = 100;
		JunkTex.aClass124_4330 = JunkTex.aClass124_4322;
	}
	
	static {
		JunkTex.aClass124_4362 = Class14_Sub2_Sub2.method263(1178, "mem=");
		JunkTex.aClass124_4360 = Class14_Sub2_Sub2.method263(1178, " (X");
		JunkTex.aClass124_4359 = Class14_Sub2_Sub2.method263(1178, "<col=00ffff>");
		JunkTex.anInt4378 = 0;
		JunkTex.aClass124_4365 = Class14_Sub2_Sub2.method263(1178, "Spieler kann nicht gefunden werden: ");
		JunkTex.aClass124_4368 = JunkTex.aClass124_4363;
	}
	
	static {
		JunkTex.aClass124_4409 = Class14_Sub2_Sub2.method263(1178, ")2");
		JunkTex.aClass2_4404 = new Deque();
	}
	
	static {
		JunkTex.anInt4436 = 0;
		JunkTex.aClass124_4442 = Class14_Sub2_Sub2.method263(1178, "null");
		JunkTex.aClass124_4445 = Class14_Sub2_Sub2.method263(1178, "loginscreen");
		JunkTex.anIntArray4444 = new int[25];
	}
	
	static {
		JunkTex.aBoolean4420 = true;
		JunkTex.anInt4429 = 0;
		JunkTex.anObject4417 = new Object();
	}
	
	static {
		JunkTex.aClass124_4116 = Class14_Sub2_Sub2.method263(1178, "<col=00ff00>");
		JunkTex.aClass124_4113 = JunkTex.aClass124_4115;
		JunkTex.aClass55_4112 = new HashTable(32);
		JunkTex.aClass124_4120 = Class14_Sub2_Sub2.method263(1178, "Loading title screen )2 ");
		JunkTex.aClass124_4121 = Class14_Sub2_Sub2.method263(1178, ": ");
		JunkTex.aClass124_4122 = JunkTex.aClass124_4120;
		JunkTex.aClass124_4119 = Class14_Sub2_Sub2.method263(1178, "Drop");
		JunkTex.aClass124_4118 = JunkTex.aClass124_4119;
	}
	
	static {
		JunkTex.aClass133_Sub1_Sub1Array4474 = new Class133_Sub1_Sub1[2048];
		JunkTex.anInt4478 = 1;
		JunkTex.aClass2_4477 = new Deque();
		JunkTex.aClass124_4481 = Class14_Sub2_Sub2.method263(1178, "www)2wtrc");
		JunkTex.aClass124_4482 = Class14_Sub2_Sub2.method263(1178, "Eingabeprozedur geladen)3");
	}

	static {
		JunkTex.aClass124_4453 = JunkTex.aClass124_4456;
		JunkTex.aClass124_4452 = Class14_Sub2_Sub2.method263(1178, "<col=40ff00>");
		JunkTex.aClass124_4462 = Class14_Sub2_Sub2.method263(1178, "hint_mapmarkers");
	}
	
	static {
		anInt4505 = 0;
		aBoolean4518 = true;
		anInt4509 = -1;
		aClass124_4510 = Class14_Sub2_Sub2.method263(1178, "Created gameworld");
		anInt4515 = 0;
		aClass124_4511 = aClass124_4510;
		anInt4520 = 0;
	}
	static {
		anInt4525 = -2;
		anInt4532 = -1;
		aClass124_4529 = Class14_Sub2_Sub2.method263(1178, ")1 ");
		aBoolean4528 = true;
	}
	static {
		JunkTex.aClass124_4541 = Class14_Sub2_Sub2.method263(1178, "wave:");
		JunkTex.aClass124_4538 = JunkTex.aClass124_4541;
		JunkTex.anInt4548 = -1;
		JunkTex.aClass124_4545 = JunkTex.aClass124_4541;
		JunkTex.aClass124_4552 = Class14_Sub2_Sub2.method263(1178, "(Y");
		JunkTex.aClass81_4546 = new Queue();
	}
	static {
		JunkTex.anInt4633 = 0;
		JunkTex.aClass124_4635 = Class14_Sub2_Sub2.method263(1178, "Benutzeroberfl-=che geladen)3");
		JunkTex.anInt4640 = 0;
		JunkTex.aClass124_4631 = Class14_Sub2_Sub2.method263(1178, ")3");
		JunkTex.anInt4636 = -1;
		JunkTex.aClass124_4634 = Class14_Sub2_Sub2.method263(1178, "<col=ff0000>");
		JunkTex.aClass124_4643 = Class14_Sub2_Sub2.method263(1178, "mapdots");
		JunkTex.aClass124_4644 = Class14_Sub2_Sub2.method263(1178, "Suche nach Updates )2 ");
	}
	static {
		JunkTex.aLong4704 = 0L;
		JunkTex.aClass124_4696 = Class14_Sub2_Sub2.method263(1178, " weitere Optionen");
		JunkTex.aClass124_4700 = Class14_Sub2_Sub2.method263(1178, "Allocated memory");
		JunkTex.aClass124_4706 = Class14_Sub2_Sub2.method263(1178, "Speicher wird zugewiesen)3");
		JunkTex.aClass124_4702 = JunkTex.aClass124_4700;
	}
	static {
		JunkTex.aBoolean4188 = false;
		JunkTex.aClass124_4189 = Class14_Sub2_Sub2.method263(1178, ":chalreq:");
		JunkTex.aClass124_4192 = Class14_Sub2_Sub2.method263(1178, "_labels");
	}
	static {
		JunkTex.aClass55_4155 = new HashTable(512);
		JunkTex.aClass124_4165 = Class14_Sub2_Sub2.method263(1178, " )2>");
		JunkTex.anInt4166 = 0;
		JunkTex.aClass124_4168 = Class14_Sub2_Sub2.method263(1178, "Location");
		JunkTex.aClass124_4167 = JunkTex.aClass124_4168;
	}
	public static boolean aBoolean1119 = false;
	
	public static boolean aBoolean2539;
	
	public static boolean aBoolean2722 = true;

	public static boolean aBoolean845 = true;

	public static Class120 aClass120_854;

	public static Class124 aClass124_100 = Class14_Sub2_Sub2.method263(1178, "Allocating memory");

	public static Class124 aClass124_1105 = Class14_Sub2_Sub2.method263(1178, "titlebg");

	public static Class124 aClass124_1318 = Class14_Sub2_Sub2.method263(1178, "sl_back");

	public static Class124 aClass124_1326 = Class14_Sub2_Sub2.method263(1178, "Abbrechen");
	public static Class124 aClass124_2542 = Class14_Sub2_Sub2.method263(1178, "Untersuchen");
	public static Class124 aClass124_2796 = Class14_Sub2_Sub2.method263(1178, "Examine");
	public static Class124 aClass124_2802 = aClass124_2796;
	public static Class124 aClass124_2804 = Class14_Sub2_Sub2.method263(1178, "Standort");
	public static Class124 aClass124_3291;
	public static Class124 aClass124_3297 = (Class14_Sub2_Sub2.method263(1178,
	"You can(Wt add yourself to your own ignore list)3"));
	public static Class124 aClass124_3301;

	public static Class124 aClass124_3314 = Class14_Sub2_Sub2.method263(1178, "(Udns");

	public static Class124 aClass124_3316 = Class14_Sub2_Sub2.method263(1178, ":assist:");
	public static Class124 aClass124_3926 = Class14_Sub2_Sub2.method263(1178, "p11_full");
	public static Class124 aClass124_3956 = Class14_Sub2_Sub2.method263(1178, "underlay");
	public static Class124 aClass124_422 = Class14_Sub2_Sub2.method263(1178, "logo");
	public static Class124 aClass124_499 = (Class14_Sub2_Sub2.method263(1178,
	"Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
	public static Class124 aClass124_691 = Class14_Sub2_Sub2.method263(1178, "document)3cookie=(R");
	public static Class124 aClass124_693;

	public static Class124 aClass124_694;

	public static Class124 aClass124_695;

	public static Class124 aClass124_697;

	public static Class124 aClass124_844 = Class14_Sub2_Sub2.method263(1178, "showingVideoAd");

	public static Class124 aClass124_850 = Class14_Sub2_Sub2.method263(1178, "scrollbar");

	public static Class124 aClass124_857 = Class14_Sub2_Sub2.method263(1178, "<col=ff7000>");

	public static Class124 aClass124_93 = Class14_Sub2_Sub2.method263(1178, "welle2:");
	public static Class124 aClass124_94 = aClass124_100;
	public static Class124[] aClass124Array3287;
	public static Class124[] aClass124Array3959 = new Class124[200];
	public static Class124[] aClass124Array859;
	public static PacketBuffer aClass14_Sub10_Sub1_891 = new PacketBuffer(5000);
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3958;
	public static Deque aClass2_683;
	public static Deque aClass2_99 = new Deque();

	public static Cache aClass20_495 = new Cache(128);

	public static Class31 aClass31_1328;

	public static HashTable aClass55_92 = new HashTable(16);

	public static Class87 aClass87_858;
	public static Class9 aClass9_2711;
	public static Class9 aClass9_2792;
	public static Class9 aClass9_429;
	public static Class94 aClass94_420 = null;

	public static float aFloat2709;

	public static Frame aFrame3962;
	public static long aLong2800 = 0L;
	public static long aLong95 = 0L;
	public static long[] aLongArray3924 = new long[500];
	public static int anInt101;
	public static int anInt102 = 128;
	public static int anInt1108;
	public static int anInt1129 = 0;

	public static int anInt1132;

	public static int anInt1314 = 0;

	public static int anInt2550;

	public static int anInt2552;

	public static int anInt2719;

	public static int anInt2720;

	public static int anInt2721 = 0;
	public static int anInt2797 = 0;
	public static int anInt2801 = -1;
	public static int anInt3299 = 0;

	public static int anInt3919;

	public static int anInt3921;

	public static int anInt3923;

	public static int anInt3928;

	public static int anInt3929 = -1;

	public static int anInt3930;

	public static int anInt3931 = 0;

	public static int anInt3933;

	public static int anInt3952 = 0;

	public static int anInt3954;
	public static int anInt3960;
	public static int anInt425;
	public static int anInt427 = -1;
	public static int anInt500;
	public static int anInt696;
	public static int anInt847;

	public static int anInt853 = 0;

	public static int anInt895 = 0;

	public static int anInt905;
	public static int anInt96 = 0;
	public static int anInt97;
	public static int[] anIntArray1114;
	public static int[] anIntArray3288 = new int[500];
	public static int[] anIntArray3955;
	public static int[] anIntArray3965 = new int[32768];
	public static int[][] anIntArrayArray2545;
	public static int[][] anIntArrayArray2799;

	public static int[][][] anIntArrayArrayArray2724;

	public static short aShort2540;

	public static short[] aShortArray2717 = new short[256];
	public static short[][] aShortArrayArray98;
	public static byte[][][] overlayTypes;
	static {
		JunkTex.aClass124_3301 = Class14_Sub2_Sub2.method263(1178, "<br>(X100(U(Y");
		JunkTex.aClass124_3291 = JunkTex.aClass124_3297;
		JunkTex.aShort2540 = (short) 256;
		JunkTex.anIntArrayArray2545 = (new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 },
				{ 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 },
				{ 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
				{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
				{ 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } });
		JunkTex.anInt2552 = 0;
		JunkTex.aBoolean2539 = false;
	}
	static {
		JunkTex.aClass2_683 = new Deque();
		JunkTex.aClass124_693 = Class14_Sub2_Sub2.method263(1178, "M");
		JunkTex.aClass124_694 = JunkTex.aClass124_693;
		JunkTex.aClass124_695 = JunkTex.aClass124_693;
		JunkTex.anInt696 = 0;
		JunkTex.aClass124_697 = Class14_Sub2_Sub2.method263(1178, "sl_stars");
	}
	public static int method1010(int var0, Class94 var1, byte var2) {
		try {
			if (var1.anIntArrayArray1586 != null && var0 < var1.anIntArrayArray1586.length) {
				int[] var3;
				byte var5;
				int var6;
				int var18;
				try {
					var3 = var1.anIntArrayArray1586[var0];
					if (var2 <= 73) {
						aClass124_499 = null;
					}
	
					var18 = 0;
					var5 = 0;
					var6 = 0;
				} catch (Exception var15) {
					return -1;
				}
	
				while (true) {
					int var7 = var3[var6++];
					byte var8 = 0;
					int var9 = 0;
					if (var7 == 0) {
						return var18;
					}
	
					try {
						if (var7 == 15) {
							var8 = 1;
						}
	
						if (var7 == 1) {
							var9 = JunkTex.anIntArray4444[var3[var6++]];
						}
	
						if (var7 == 2) {
							var9 = Class56.anIntArray913[var3[var6++]];
						}
	
						if (var7 == 16) {
							var8 = 2;
						}
	
						if (var7 == 17) {
							var8 = 3;
						}
	
						if (var7 == 3) {
							var9 = Class14_Sub2_Sub12.anIntArray3916[var3[var6++]];
						}
	
						int var10;
						Class94 var11;
						int var13;
						int var19;
						if (var7 == 4) {
							var10 = var3[var6++] << 48;
							var10 += var3[var6++];
							var11 = JunkTex.method1233(var10, 21803);
							var19 = var3[var6++];
							if (var19 != -1 && (!JunkTex.method605(114, var19).aBoolean2306
									|| Class132.aBoolean2170)) {
								for (var13 = 0; var13 < var11.anIntArray1452.length; ++var13) {
									if (var19 + 1 == var11.anIntArray1452[var13]) {
										var9 += var11.anIntArray1542[var13];
									}
								}
							}
						}
	
						if (var7 == 5) {
							var9 = JunkTex.anIntArray4275[var3[var6++]];
						}
	
						if (var7 == 6) {
							var9 = Class14_Sub29.anIntArray3245[Class56.anIntArray913[var3[var6++]] - 1];
						}
	
						if (var7 == 7) {
							var9 = JunkTex.anIntArray4275[var3[var6++]] * 100 / '\ub71b';
						}
	
						if (var7 == 8) {
							var9 = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937;
						}
	
						if (var7 == 9) {
							for (var10 = 0; var10 < 25; ++var10) {
								if (Applet_Sub1.aBooleanArray20[var10]) {
									var9 += Class56.anIntArray913[var10];
								}
							}
						}
	
						if (var7 == 10) {
							var10 = var3[var6++] << 48;
							var10 += var3[var6++];
							var11 = JunkTex.method1233(var10, 21803);
							var19 = var3[var6++];
							if (var19 != -1 && (!JunkTex.method605(81, var19).aBoolean2306
									|| Class132.aBoolean2170)) {
								for (var13 = 0; var11.anIntArray1452.length > var13; ++var13) {
									if (var11.anIntArray1452[var13] == var19 + 1) {
										var9 = 999999999;
										break;
									}
								}
							}
						}
	
						if (var7 == 11) {
							var9 = Class1.anInt73;
						}
	
						if (var7 == 12) {
							var9 = Class14_Sub4.anInt2789;
						}
	
						if (var7 == 13) {
							var10 = JunkTex.anIntArray4275[var3[var6++]];
							int var14 = var3[var6++];
							var9 = (var10 & 1 << var14) != 0 ? 1 : 0;
						}
	
						if (var7 == 14) {
							var10 = var3[var6++];
							var9 = Class104.method1534(var10, 82);
						}
	
						if (var7 == 18) {
							var9 = Class133_Sub6.anInt3676 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7);
						}
	
						if (var7 == 19) {
							var9 = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 7) + Class58.anInt947;
						}
	
						if (var7 == 20) {
							var9 = var3[var6++];
						}
	
						if (var8 != 0) {
							var5 = var8;
						} else {
							if (var5 == 0) {
								var18 += var9;
							}
	
							if (var5 == 1) {
								var18 -= var9;
							}
	
							if (var5 == 2 && var9 != 0) {
								var18 /= var9;
							}
	
							if (var5 == 3) {
								var18 *= var9;
							}
	
							var5 = 0;
						}
					} catch (Exception var16) {
						byte var12 = -1;
						return var12;
					}
				}
			} else {
				byte var4 = -2;
				return var4;
			}
		} catch (Throwable var17) {
			throw JunkTex.method554(var17,
					"db.M(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}
	public static void method1014(byte i) {
		if (i <= 114)
			aClass124_499 = null;
		aClass20_495 = null;
		aClass124_499 = null;
	}
	public static int method1016(boolean var0, byte var1) {
		try {
			byte var2;
			if (!var0) {
				var2 = -97;
				return var2;
			} else {
				int var3;
				if (var1 >= 65 && var1 <= 90) {
					var3 = var1 - 65;
					return var3;
				} else if (var1 >= 97 && var1 <= 122) {
					var3 = var1 - 71;
					return var3;
				} else if (var1 >= 48 && var1 <= 57) {
					var3 = var1 + 4;
					return var3;
				} else {
					byte var4;
					if (var1 == 43) {
						var4 = 62;
						return var4;
					} else if (var1 == 42) {
						var4 = 62;
						return var4;
					} else if (var1 == 47) {
						var4 = 63;
						return var4;
					} else if (var1 == 45) {
						var4 = 63;
						return var4;
					} else {
						var2 = -1;
						return var2;
					}
				}
			}
		} catch (Throwable var5) {
			throw JunkTex.method554(var5, "db.A(" + var0 + ',' + var1 + ')');
		}
	}
	public static int method1017(int var0, int var1, byte var2, int var3) {
		try {
			byte var4 = 0;
			int var5 = var3 >> 7;
			int var6 = var0 >> 7;
			if (var6 >= 0 && var5 >= 0 && var6 <= 103 && var5 <= 103) {
				int var15 = var0 & 127;
				int var8 = var3 & 127;
				int var9 = var1;
				if (var1 < 3 && (JunkTex.tileFlags[1][var6][var5] & 2) == 2) {
					var9 = var1 + 1;
				}
	
				int var10 = Class114.tileHeights[var9][var6][var5] * (-var15 + 128)
						+ Class114.tileHeights[var9][var6 + 1][var5] * var15 >> 39;
				int var11 = Class114.tileHeights[var9][var6][var5 + 1] * (-var15 + 128)
						+ Class114.tileHeights[var9][var6 + 1][var5 + 1] * var15 >> 7;
				int var12 = -69 % ((-64 - var2) / 39);
				int var13 = (128 - var8) * var10 + var8 * var11 >> 7;
				return var13;
			} else {
				boolean var7 = false;
				return var4;
			}
		} catch (Throwable var14) {
			throw JunkTex.method554(var14, "db.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
	public static void method1018(byte i, Class9 class9) {
		Class12.aClass9_332 = class9;
		if (i != -68)
			anInt500 = -99;
		anInt2550 = Class12.aClass9_332.method177(16, 13537);
	}

	public static Class148 method1021(byte i) {
		Class148_Sub2 class148_sub2 = new Class148_Sub2(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
				Class40.anIntArray675[0], Class14_Sub2_Sub12.anIntArray3918[0], Class17.anIntArray402[0],
				Class76.anIntArray1204[0], Class12.aByteArrayArray310[0], JunkTex.anIntArray1114);
		Class129.method1761((byte) 23);
		if (i != 71)
			aClass20_495 = null;
		Class148_Sub2 class148_sub2_126_ = class148_sub2;
		return class148_sub2_126_;
	}

	public static void method1023(int i, int i_127_, int i_128_, Class94 class94, int i_129_) {
		Class138.method1946(139);
		Class25.method999(i, i_127_, i + class94.anInt1518, class94.anInt1545 + i_127_);
		if (JunkTex.anInt4633 != 2 && JunkTex.anInt4633 != 5
				&& Class133_Sub6.aClass14_Sub2_Sub19_3640 != null) {
			int i_130_ = JunkTex.anInt4408 + anInt696 & 0x7ff;
			int i_131_ = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32 + 48;
			int i_132_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32) + 464);
			((Class14_Sub2_Sub19_Sub2) Class133_Sub6.aClass14_Sub2_Sub19_3640).method420(i, i_127_, class94.anInt1518,
					class94.anInt1545, i_131_, i_132_, i_130_, Class32.anInt551 + 256,
					(Class14_Sub2_Sub19_Sub2) class94.method1476(false, (byte) 61));
			if (Class79.aClass146_1261 != null) {
				for (int i_133_ = 0; Class79.aClass146_1261.anInt2353 > i_133_; i_133_++) {
					if (Class79.aClass146_1261.method1990(-92, i_133_)) {
						int i_134_ = ((-Class58.anInt947 + (Class79.aClass146_1261.aShortArray2361[i_133_])) * 4
								- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) / 32 + 2);
						int i_135_ = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) / 32) + 2
								+ ((Class79.aClass146_1261.aShortArray2354[i_133_]) - Class133_Sub6.anInt3676) * 4);
						int i_136_ = Class3.sin[i_130_];
						int i_137_ = Class3.cos[i_130_];
						i_137_ = i_137_ * 256 / (Class32.anInt551 + 256);
						i_136_ = i_136_ * 256 / (Class32.anInt551 + 256);
						int i_138_ = i_137_ * i_134_ - i_136_ * i_135_ >> 16;
						Class14_Sub2_Sub16 class14_sub2_sub16 = Class56_Sub1.aClass14_Sub2_Sub16_3320;
						if (Class79.aClass146_1261.method1994(i_133_, false) == 1)
							class14_sub2_sub16 = Class84.aClass14_Sub2_Sub16_1344;
						if (Class79.aClass146_1261.method1994(i_133_, false) == 2)
							class14_sub2_sub16 = Class133_Sub3.aClass14_Sub2_Sub16_3567;
						int i_139_ = i_136_ * i_134_ + i_137_ * i_135_ >> 16;
						int i_140_ = class14_sub2_sub16.method344((Class79.aClass146_1261.aClass124Array2362[i_133_]),
								100);
						i_139_ -= i_140_ / 2;
						if (i_139_ >= -class94.anInt1518 && class94.anInt1518 >= i_139_ && -class94.anInt1545 <= i_138_
								&& i_138_ <= class94.anInt1545) {
							int i_141_ = 16777215;
							if (Class79.aClass146_1261.anIntArray2350[i_133_] != -1)
								i_141_ = (Class79.aClass146_1261.anIntArray2350[i_133_]);
							Class25.method1008((Class14_Sub2_Sub19_Sub2) class94.method1476(false, (byte) 61));
							class14_sub2_sub16.method365((Class79.aClass146_1261.aClass124Array2362[i_133_]),
									i_139_ + i + class94.anInt1518 / 2, -i_138_ + class94.anInt1545 / 2 + i_127_,
									i_140_, 50, i_141_, 0, 256, 1, 0, 0);
							Class25.method996();
						}
					}
				}
			}
			for (int i_142_ = 0; Class18.anInt411 > i_142_; i_142_++) {
				int i_143_ = (Static2.anIntArray363[i_142_] * 4 + 2
						- Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32);
				int i_144_ = (Class17.anIntArray400[i_142_] * 4
						- (-2 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32)));
				Class79 class79 = Class79.method1377((byte) -106, (JunkTex.anIntArray4512[i_142_]));
				if (class79.anIntArray1276 != null) {
					class79 = class79.method1391(1);
					if (class79 == null || class79.anInt1262 == -1)
						continue;
				}
				Static2.method1513(i_144_, i_127_, i_143_, class94,
						(JunkTex.aClass14_Sub2_Sub19Array4366[class79.anInt1262]), 256, i);
			}
			for (int i_145_ = 0; i_145_ < 104; i_145_++) {
				for (int i_146_ = 0; i_146_ < 104; i_146_++) {
					Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_145_][i_146_]);
					if (deque != null) {
						int i_147_ = -(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32) + i_145_ * 4 + 2;
						int i_148_ = -(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32) + (i_146_ * 4 + 2);
						Static2.method1513(i_148_, i_127_, i_147_, class94,
								(Class14_Sub20.aClass14_Sub2_Sub19Array3098[0]), 256, i);
					}
				}
			}
			for (int i_149_ = 0; i_149_ < JunkTex.anInt4306; i_149_++) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[JunkTex.anIntArray3965[i_149_]]);
				if (class133_sub1_sub2 != null && class133_sub1_sub2.method1804((byte) 115)) {
					Class12 class12 = class133_sub1_sub2.aClass12_4949;
					if (class12 != null && class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 != null && class12.aBoolean342 && class12.aBoolean308) {
						int i_150_ = -(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32)
								+ class133_sub1_sub2.anInt3495 / 32;
						int i_151_ = (class133_sub1_sub2.anInt3436 / 32
								- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) / 32);
						Static2.method1513(i_151_, i_127_, i_150_, class94,
								(Class14_Sub20.aClass14_Sub2_Sub19Array3098[1]), 256, i);
					}
				}
			}
			for (int i_152_ = 0; Static2.anInt2878 > i_152_; i_152_++) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_152_]]);
				if (class133_sub1_sub1 != null && class133_sub1_sub1.method1804((byte) 115)) {
					int i_153_ = (class133_sub1_sub1.anInt3495 / 32
							- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32));
					int i_154_ = (class133_sub1_sub1.anInt3436 / 32
							- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32));
					boolean bool = false;
					long l = class133_sub1_sub1.aClass124_4922.method1692(0);
					for (int i_155_ = 0; i_155_ < Static2.anInt3728; i_155_++) {
						if (l == Class133_Sub1_Sub2.aLongArray4951[i_155_] && Class45.anIntArray743[i_155_] != 0) {
							bool = true;
							break;
						}
					}
					boolean bool_156_ = false;
					if (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916 != 0 && class133_sub1_sub1.anInt4916 != 0
							&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916 == class133_sub1_sub1.anInt4916))
						bool_156_ = true;
					if (bool)
						Static2.method1513(i_154_, i_127_, i_153_, class94,
								(Class14_Sub20.aClass14_Sub2_Sub19Array3098[3]), 256, i);
					else if (bool_156_)
						Static2.method1513(i_154_, i_127_, i_153_, class94,
								(Class14_Sub20.aClass14_Sub2_Sub19Array3098[4]), 256, i);
					else
						Static2.method1513(i_154_, i_127_, i_153_, class94,
								(Class14_Sub20.aClass14_Sub2_Sub19Array3098[2]), 256, i);
				}
			}
			Class66[] class66s = Static2.aClass66Array3721;
			for (int i_157_ = 0; i_157_ < class66s.length; i_157_++) {
				Class66 class66 = class66s[i_157_];
				if (class66 != null && class66.anInt1046 != 0 && Class14_Sub2_Sub20.anInt4064 % 20 < 10) {
					if (class66.anInt1046 == 1 && class66.anInt1049 >= 0
							&& (Class14_Sub4.aClass133_Sub1_Sub2Array2785.length > class66.anInt1049)) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[class66.anInt1049]);
						if (class133_sub1_sub2 != null) {
							int i_158_ = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) / 32)
									+ class133_sub1_sub2.anInt3436 / 32);
							int i_159_ = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) / 32)
									+ class133_sub1_sub2.anInt3495 / 32);
							Static2.method332(class94, i_127_, 90, i_159_, class66.anInt1035, i_158_, i);
						}
					}
					if (class66.anInt1046 == 2) {
						int i_160_ = (-((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) / 32)
								+ (class66.anInt1047 - Class133_Sub6.anInt3676) * 4 + 2);
						int i_161_ = ((-Class58.anInt947 + class66.anInt1044) * 4
								+ (-((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) / 32) + 2));
						Static2.method332(class94, i_127_, 86, i_160_, class66.anInt1035, i_161_, i);
					}
					if (class66.anInt1046 == 10 && class66.anInt1049 >= 0
							&& (class66.anInt1049 < (JunkTex.aClass133_Sub1_Sub1Array4474).length)) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[class66.anInt1049]);
						if (class133_sub1_sub1 != null) {
							int i_162_ = (class133_sub1_sub1.anInt3495 / 32
									- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) / 32);
							int i_163_ = (class133_sub1_sub1.anInt3436 / 32
									- (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) / 32);
							Static2.method332(class94, i_127_, 96, i_162_, class66.anInt1035, i_163_, i);
						}
					}
				}
			}
			if (Static2.anInt1085 != 0) {
				int i_164_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 / 32) + Static2.anInt1085 * 4 + 2);
				int i_165_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32) + JunkTex.anInt4335 * 4
						+ 2);
				Static2.method1513(i_165_, i_127_, i_164_, class94, Class149.aClass14_Sub2_Sub19_2384, 256, i);
			}
			Class25.method1004(i + class94.anInt1518 / 2 - 1, i_127_ - 1 + class94.anInt1545 / 2, 3, 3, 16777215);
		} else {
			Class14_Sub2_Sub19 class14_sub2_sub19 = class94.method1476(false, (byte) 61);
			if (class14_sub2_sub19 != null)
				class14_sub2_sub19.method391(i, i_127_);
		}
		JunkTex.aBooleanArray4698[i_128_] = true;
		Class7_Sub2_Sub1.aBooleanArray3703[i_128_] = true;
		if (i_129_ < 111)
			aClass124_499 = null;
	}

	public static void method1024(int i) {
		JunkTex.anIntArray3288 = null;
		JunkTex.aClass124Array3287 = null;
		if (i == 4095) {
			JunkTex.aClass124_3297 = null;
			JunkTex.aClass124_3291 = null;
		}
	}

	public static void method1025(int i) {
		if (i != 25192)
			JunkTex.aClass124_3291 = null;
		Class9.aClass52_236.clear();
		Static2.aClass52_4053.clear();
	}

	public static boolean method1027(Class9 class9, int i, byte i_3_) {
		byte[] is = class9.method165(73, i);
		if (is == null) {
			boolean bool = false;
			return bool;
		}
		if (i_3_ <= 10) {
			boolean bool = false;
			return bool;
		}
		Class14_Sub9_Sub1.method708(is, 144);
		boolean bool = true;
		return bool;
	}

	public static int method1028(int i, int i_4_, int i_5_, int i_6_) {
		i &= 0x3;
		if (i_5_ == (i ^ 0xffffffff)) {
			int i_7_ = i_6_;
			return i_7_;
		}
		if (i == 1) {
			int i_8_ = -i_4_ + 1023;
			return i_8_;
		}
		if (i == 2) {
			int i_9_ = 1023 - i_6_;
			return i_9_;
		}
		int i_10_ = i_4_;
		return i_10_;
	}

	public static void method1030(int i) {
		JunkTex.aClass124_3314 = null;
		JunkTex.aClass124_3316 = null;
		JunkTex.aClass124_3301 = null;
		if (i >= -126)
			method1032(true, -82);
	}
	public static void method1032(boolean bool, int i) {
		JunkTex.method566(Class83.anInt1340, Class14_Sub2_Sub12.anInt3912, -1, Class14_Sub20.anInt3094,
				bool);
		if (i != -1291652884)
			method1032(true, -90);
	}
	public static void method1128(byte i) {
		if (i <= -41)
			Class14_Sub6.aClass52_2817.clear();
	}
	public static Animation method1129(int i, int i_0_) {
		Animation animation = (Animation) Class21.aClass52_444.get((long) i);
		if (animation != null) {
			Animation class46_1_ = animation;
			return class46_1_;
		}
		byte[] is = Class33.aClass9_579.method163(Class36.method1103((byte) -128, i), Class14_Sub21.method896(-115, i),
				0);
		Animation class46_2_ = new Animation();
		if (is != null)
			class46_2_.decode(new Buffer(is));
		class46_2_.method1171(86);
		Class21.aClass52_444.put(class46_2_, (long) i);
		Animation class46_4_ = class46_2_;
		return class46_4_;
	}
	public static void method1130(int i, int i_5_) {
		if (i_5_ != 11300)
			JunkTex.aClass124_694 = null;
		Class21.aClass52_444.method1208(i);
		Class14_Sub2_Sub12.aClass52_3894.method1208(i);
	}
	public static void method1131(int i) {
		int i_6_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 8);
		if (Static2.anInt2878 > i_6_) {
			for (int i_7_ = i_6_; i_7_ < Static2.anInt2878; i_7_++)
				Class36.anIntArray626[JunkTex.anInt4255++] = Static2.anIntArray351[i_7_];
		}
		int i_8_ = 30 / ((i + 24) / 54);
		if (Static2.anInt2878 < i_6_)
			throw new RuntimeException("gppov1");
		Static2.anInt2878 = 0;
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			int i_10_ = Static2.anIntArray351[i_9_];
			Class133_Sub1_Sub1 class133_sub1_sub1 = JunkTex.aClass133_Sub1_Sub1Array4474[i_10_];
			int i_11_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_11_ == 0) {
				Static2.anIntArray351[Static2.anInt2878++] = i_10_;
				class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			} else {
				int i_12_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 2);
				if (i_12_ == 0) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 1) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_13_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(false, (byte) -40, i_13_);
					int i_14_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
					if (i_14_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 2) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_15_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(true, (byte) -119, i_15_);
					int i_16_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(true, (byte) 127, i_16_);
					int i_17_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
					if (i_17_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 3)
					Class36.anIntArray626[JunkTex.anInt4255++] = i_10_;
			}
		}
	}
	public static void method1132(int i) {
		JunkTex.aClass124_691 = null;
		JunkTex.aClass124_695 = null;
		JunkTex.aClass2_683 = null;
		JunkTex.aClass124_697 = null;
		JunkTex.aClass124_693 = null;
		JunkTex.aClass124_694 = null;
		if (i <= 104)
			JunkTex.aClass124_691 = null;
	}
	public static void method1133(byte i) {
		int i_18_ = 35 % ((i - 8) / 38);
		Class21.aClass52_444.clear();
		Class14_Sub2_Sub12.aClass52_3894.clear();
	}
	public static int method1202(int i, int i_0_) {
		i_0_ = ((i_0_ & ~0x55555554) >>> 33) + (i_0_ & 0x55555555);
		i_0_ = ((i_0_ & ~0x33333332) >>> 2) + (i_0_ & 0x33333333);
		i_0_ = i & (i_0_ >>> 36) + i_0_;
		i_0_ += i_0_ >>> 8;
		i_0_ += i_0_ >>> 16;
		int i_1_ = i_0_ & 0xff;
		return i_1_;
	}
	public static void method1206(byte i) {
		JunkTex.aClass87_858 = null;
		JunkTex.aClass124_857 = null;
		JunkTex.aClass124Array859 = null;
		int i_2_ = 115 % ((i + 18) / 45);
		JunkTex.aClass124_850 = null;
		JunkTex.aClass124_844 = null;
		JunkTex.aClass120_854 = null;
	}
	public static int method1207(byte i, int i_3_) {
		if (i >= -57)
			method1206((byte) -48);
		int i_4_ = i_3_ * (i_3_ * i_3_ >> 44) >> 44;
		int i_5_ = i_3_ * 6 - 61440;
		int i_6_ = (i_5_ * i_3_ >> 12) + 40960;
		int i_7_ = i_6_ * i_4_ >> 12;
		return i_7_;
	}
	public static void method1211(Class124 class124, boolean bool, int i) {
		if (i >= 35) {
			if (bool) {
				do {
					if (Static2.aBoolean1783) {
						try {
							Class144.method1982((byte) 122, "openjs", (JunkTex.aClass43_4647.applet),
									(new Object[] { class124.method1691(0, Class96.anApplet_Sub1_1632.getCodeBase())
											.toString() }));
						} catch (Throwable throwable) {
							Throwable throwable_12_ = new Throwable();
							break;
						}
						return;
					}
				} while (false);
				try {
					Class96.anApplet_Sub1_1632.getAppletContext()
							.showDocument(class124.method1691(0, Class96.anApplet_Sub1_1632.getCodeBase()), "_blank");
				} catch (Exception exception) {
					/* empty */
				}
			} else {
				try {
					Class96.anApplet_Sub1_1632.getAppletContext()
							.showDocument(class124.method1691(0, Class96.anApplet_Sub1_1632.getCodeBase()), "_top");
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}
	public static void method1222(Class9 class9, byte i) {
		Class14_Sub2_Sub21.anInt4088 = class9.method146(JunkTex.aClass124_3926, 0);
		JunkTex.anInt4367 = class9.method146(Class128.aClass124_2128, 0);
		JunkTex.anInt4102 = class9.method146(JunkTex.aClass124_4434, 0);
		Class7_Sub3.anInt2681 = class9.method146(Class114.aClass124_1900, 0);
		Class149.anInt2389 = class9.method146(Class24.aClass124_470, 0);
		Class36.anInt629 = class9.method146(Class107.aClass124_1795, 0);
		Class14_Sub2_Sub3.anInt3787 = class9.method146(Class133_Sub3.aClass124_3570, 0);
		Class153.anInt2450 = class9.method146(Static2.aClass124_3944, 0);
		if (i > 35) {
			Class133_Sub4.anInt3584 = class9.method146(Class9.aClass124_207, 0);
			Static2.anInt5087 = class9.method146(SceneCluster.aClass124_1365, 0);
			SceneCluster.anInt1369 = class9.method146(JunkTex.aClass124_4462, 0);
			Class38.anInt2618 = class9.method146(Class9.aClass124_227, 0);
			Class58.anInt937 = class9.method146(Class7_Sub3.aClass124_2684, 0);
			Class111.anInt1857 = class9.method146(JunkTex.aClass124_4643, 0);
			JunkTex.anInt4735 = class9.method146(JunkTex.aClass124_850, 0);
			Class82.anInt1334 = class9.method146(Class96.aClass124_1631, 0);
			Class9_Sub1.anInt2688 = class9.method146(Class69.aClass124_1068, 0);
			anInt2720 = class9.method146(Class17.aClass124_403, 0);
			JunkTex.anInt4310 = class9.method146(Class115.aClass124_1908, 0);
		}
	}
	public static void method1226(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_9_ >= i_7_)
			Class51.method1201(Static2.anIntArrayArray4038[i_8_], i_7_, i_9_, -5973, i_10_);
		else
			Class51.method1201(Static2.anIntArrayArray4038[i_8_], i_9_, i_7_, -5973, i_10_);
		if (i != 4)
			JunkTex.method1236((byte) -10);
	}

	public static int method1229(int i, int i_12_) {
		int i_13_ = 62 / ((42 - i_12_) / 58);
		int i_14_ = i & 0x7f;
		return i_14_;
	}

	public static Class94 method1233(int i, int i_22_) {
		if (i_22_ != 21803)
			method1226(73, -111, -78, -15, 30);
		int i_23_ = i >> 16;
		int i_24_ = i & 0xffff;
		if (Class1.aClass94ArrayArray75[i_23_] == null || Class1.aClass94ArrayArray75[i_23_][i_24_] == null) {
			boolean bool = Class126.method1741((byte) 95, i_23_);
			if (!bool) {
				Class94 class94 = null;
				return class94;
			}
		}
		Class94 class94 = Class1.aClass94ArrayArray75[i_23_][i_24_];
		return class94;
	}
	public static void method1235(boolean bool, int i, boolean bool_28_, byte i_29_, Class32 class32, int i_30_,
			int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		if (!bool_28_ || Class128.method1755(i_29_ ^ 0x7c0b0b5)
				|| (JunkTex.tileFlags[0][i_33_][i_31_] & 0x2) != 0
				|| ((JunkTex.tileFlags[i_35_][i_33_][i_31_] & 0x10) == 0
						&& (Class150.method2023(i_31_, i_35_, i_33_, -10403) == Class142.anInt2295))) {
			if (i_35_ < Class7_Sub2.anInt2676)
				Class7_Sub2.anInt2676 = i_35_;
			Class79 class79 = Class79.method1377((byte) -106, i_34_);
			if (!class79.aBoolean1272) {
				int i_36_;
				int i_37_;
				if (i == 1 || i == 3) {
					i_37_ = class79.anInt1245;
					i_36_ = class79.anInt1227;
				} else {
					i_36_ = class79.anInt1245;
					i_37_ = class79.anInt1227;
				}
				int i_38_;
				int i_39_;
				if (i_37_ + i_33_ <= 104) {
					i_38_ = i_33_ + (i_37_ + 1 >> 33);
					i_39_ = (i_37_ >> 33) + i_33_;
				} else {
					i_38_ = i_33_ + 1;
					i_39_ = i_33_;
				}
				int[][] is = Class114.tileHeights[i_30_];
				int i_40_;
				int i_41_;
				if (i_31_ + i_36_ <= 104) {
					i_41_ = (i_36_ >> 1) + i_31_;
					i_40_ = (i_36_ + 1 >> 1) + i_31_;
				} else {
					i_40_ = i_31_ + 1;
					i_41_ = i_31_;
				}
				int i_42_ = (is[i_38_][i_40_] + (is[i_39_][i_40_] + is[i_39_][i_41_] + is[i_38_][i_41_]) >> 34);
				int i_43_ = (i_31_ << 39) + (i_36_ << 38);
				int i_44_ = (i_37_ << 6) + (i_33_ << 7);
				if (i_29_ != 50)
					method1233(44, 71);
				int i_45_ = 0;
				if (i_30_ != 0) {
					int[][] is_46_ = Class114.tileHeights[0];
					i_45_ = -(is_46_[i_39_][i_40_]
							+ (is_46_[i_38_][i_41_] + (is_46_[i_39_][i_41_] + is_46_[i_38_][i_40_])) >> 34) + i_42_;
				}
				int[][] is_47_ = null;
				if (!bool) {
					if (i_30_ < 3)
						is_47_ = Class114.tileHeights[i_30_ + 1];
				} else
					is_47_ = Class149.anIntArrayArrayArray2391[0];
				long l = (long) (i_31_ << 7 | i_33_ | i_32_ << 46 | i << 52 | 0x40000000);
				if (class79.anInt1250 == 0 || bool)
					l |= ~0x7fffffffffffffffL;
				if (class79.anInt1242 == 1)
					l |= 0x400000L;
				if (class79.aBoolean1283)
					l |= 0x80000000L;
				if (class79.method1392(-126))
					Class12.method213(i_33_, i_31_, class79, (byte) -35, i_35_, null, null, i);
				l |= (long) i_34_ << 32;
				boolean bool_48_ = class79.aBoolean1253 & !bool;
				if (i_32_ == 22) {
					if (Static2.aBoolean2372 || class79.anInt1250 != 0 || class79.anInt1229 == 1
							|| class79.aBoolean1228) {
						Class133 class133;
						if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
							class133 = new Class133_Sub4(i_34_, 22, i, i_30_, i_33_, i_31_, class79.anInt1278,
									class79.aBoolean1258, null);
						else {
							Class86 class86 = class79.method1383(i_42_, 22, is, is_47_, bool_28_, i, true, bool_48_,
									null, i_44_, i_43_);
							if (bool_48_)
								ShadowManager.method2026((class86.aClass148_Sub1_1386), i_44_, i_45_, i_43_);
							class133 = class86.aClass133_1379;
						}
						JunkTex.method642(i_35_, i_33_, i_31_, i_42_, class133, l, class79.aBoolean1299);
						if (class79.anInt1229 == 1 && class32 != null)
							class32.method1065(i_33_, (byte) -80, i_31_);
					}
				} else if (i_32_ == 10 || i_32_ == 11) {
					Class133 class133;
					if (class79.anInt1278 == -1 && class79.anIntArray1276 == null) {
						Class86 class86 = class79.method1383(i_42_, 10, is, is_47_, bool_28_, i_32_ != 11 ? i : i + 4,
								true, bool_48_, null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					} else
						class133 = new Class133_Sub4(i_34_, 10, i_32_ == 11 ? i + 4 : i, i_30_, i_33_, i_31_,
								class79.anInt1278, class79.aBoolean1258, null);
					if (class133 != null) {
						boolean bool_49_ = Class109.method1570(i_35_, i_33_, i_31_, i_42_, i_37_, i_36_, class133, 0,
								l);
						if (class79.aBoolean1296 && bool_49_ && bool_28_) {
							i_40_ = 15;
							if (class133 instanceof Class133_Sub7) {
								i_40_ = (((Class133_Sub7) class133).method1866() / 4);
								if (i_40_ > 30)
									i_40_ = 30;
							}
							for (i_41_ = 0; i_41_ <= i_37_; i_41_++) {
								for (int i_50_ = 0; i_50_ <= i_36_; i_50_++) {
									if (i_40_ > (Static2.aByteArrayArrayArray3354[i_35_][i_41_ + i_33_][i_50_
											+ i_31_]))
										Static2.aByteArrayArrayArray3354[i_35_][i_33_ + i_41_][i_31_
												+ i_50_] = (byte) i_40_;
								}
							}
						}
					}
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1073(i_37_, i_33_, i_31_, i_36_, class79.aBoolean1248, false);
				} else if (i_32_ >= 12) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, i_32_, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, i_32_, is, is_47_, bool_28_, i, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class109.method1570(i_35_, i_33_, i_31_, i_42_, 1, 1, class133, 0, l);
					if (bool_28_ && i_32_ >= 12 && i_32_ <= 17 && i_32_ != 13 && i_35_ > 0)
						Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = Class66
								.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 4);
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1073(i_37_, i_33_, i_31_, i_36_, class79.aBoolean1248, false);
				} else if (i_32_ == 0) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 0, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 0, is, is_47_, bool_28_, i, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class90.method1444(i_35_, i_33_, i_31_, i_42_, class133, null, Class14_Sub28.anIntArray3225[i], 0,
							l);
					if (bool_28_) {
						if (i == 0) {
							if (class79.aBoolean1296) {
								Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_] = (byte) 50;
								Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_ + 1] = (byte) 50;
							}
							if (class79.aBoolean1270)
								Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = (Class66
										.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 1));
						} else if (i != 1) {
							if (i != 2) {
								if (i == 3) {
									if (class79.aBoolean1296) {
										Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_] = (byte) 50;
										Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_] = (byte) 50;
									}
									if (class79.aBoolean1270)
										Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = (Class66
												.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 2));
								}
							} else {
								if (class79.aBoolean1296) {
									Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_] = (byte) 50;
									Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_ + 1] = (byte) 50;
								}
								if (class79.aBoolean1270)
									Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_]), 1));
							}
						} else {
							if (class79.aBoolean1296) {
								Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_ + 1] = (byte) 50;
								Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_ + 1] = (byte) 50;
							}
							if (class79.aBoolean1270)
								Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1] = (Class66
										.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1]), 2));
						}
					}
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1075(class79.aBoolean1248, i_33_, i_32_, i_31_, i, (byte) 126);
					if (class79.anInt1246 != 16)
						Class88.method1439(i_35_, i_33_, i_31_, class79.anInt1246);
				} else if (i_32_ == 1) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 1, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 1, is, is_47_, bool_28_, i, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class90.method1444(i_35_, i_33_, i_31_, i_42_, class133, null, Class4.anIntArray128[i], 0, l);
					if (class79.aBoolean1296 && bool_28_) {
						if (i != 0) {
							if (i != 1) {
								if (i == 2)
									Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_] = (byte) 50;
								else if (i == 3)
									Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_] = (byte) 50;
							} else
								Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_ + 1] = (byte) 50;
						} else
							Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_ + 1] = (byte) 50;
					}
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1075(class79.aBoolean1248, i_33_, i_32_, i_31_, i, (byte) 114);
				} else if (i_32_ == 2) {
					i_38_ = i + 1 & 0x3;
					Class133 class133;
					Class133 class133_51_;
					if (class79.anInt1278 == -1 && class79.anIntArray1276 == null) {
						Class86 class86 = class79.method1383(i_42_, 2, is, is_47_, bool_28_, i + 4, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
						class86 = class79.method1383(i_42_, 2, is, is_47_, bool_28_, i_38_, true, bool_48_, null, i_44_,
								i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133_51_ = class86.aClass133_1379;
					} else {
						class133 = new Class133_Sub4(i_34_, 2, i + 4, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
						class133_51_ = new Class133_Sub4(i_34_, 2, i_38_, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					}
					Class90.method1444(i_35_, i_33_, i_31_, i_42_, class133, class133_51_,
							Class14_Sub28.anIntArray3225[i], Class14_Sub28.anIntArray3225[i_38_], l);
					if (class79.aBoolean1270 && bool_28_) {
						if (i != 0) {
							if (i != 1) {
								if (i == 2) {
									Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_]), 1));
									Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 2));
								} else if (i == 3) {
									Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 2));
									Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 1));
								}
							} else {
								Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1] = (Class66
										.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1]), 2));
								Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_] = (Class66
										.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_ + 1][i_31_]), 1));
							}
						} else {
							Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_] = Class66
									.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_]), 1);
							Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1] = Class66
									.method1294((Class66.anIntArrayArrayArray135[i_35_][i_33_][i_31_ + 1]), 2);
						}
					}
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1075(class79.aBoolean1248, i_33_, i_32_, i_31_, i, (byte) 127);
					if (class79.anInt1246 != 16)
						Class88.method1439(i_35_, i_33_, i_31_, class79.anInt1246);
				} else if (i_32_ == 3) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 3, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 3, is, is_47_, bool_28_, i, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class90.method1444(i_35_, i_33_, i_31_, i_42_, class133, null, Class4.anIntArray128[i], 0, l);
					if (class79.aBoolean1296 && bool_28_) {
						if (i == 0)
							Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_ + 1] = (byte) 50;
						else if (i == 1)
							Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_ + 1] = (byte) 50;
						else if (i == 2)
							Static2.aByteArrayArrayArray3354[i_35_][i_33_ + 1][i_31_] = (byte) 50;
						else if (i == 3)
							Static2.aByteArrayArrayArray3354[i_35_][i_33_][i_31_] = (byte) 50;
					}
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1075(class79.aBoolean1248, i_33_, i_32_, i_31_, i, (byte) 111);
				} else if (i_32_ == 9) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, i_32_, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, i_32_, is, is_47_, bool_28_, i, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class109.method1570(i_35_, i_33_, i_31_, i_42_, 1, 1, class133, 0, l);
					if (class79.anInt1229 != 0 && class32 != null)
						class32.method1073(i_37_, i_33_, i_31_, i_36_, class79.aBoolean1248, false);
					if (class79.anInt1246 != 16)
						Class88.method1439(i_35_, i_33_, i_31_, class79.anInt1246);
				} else if (i_32_ == 4) {
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 4, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class127.method1748(i_35_, i_33_, i_31_, i_42_, class133, null, Class14_Sub28.anIntArray3225[i], 0,
							0, 0, l);
				} else if (i_32_ == 5) {
					i_38_ = 16;
					long l_52_ = JunkTex.method79(i_35_, i_33_, i_31_);
					if (0L != l_52_)
						i_38_ = (Class79.method1377((byte) -106, (int) (l_52_ >>> 32) & 0x7fffffff).anInt1246);
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 4, i, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386,
									-((Class14_Sub19.anIntArray3074[i]) * 8) + i_44_, i_45_,
									(-(Class9.anIntArray212[i] * 8) + i_43_));
						class133 = class86.aClass133_1379;
					}
					Class127.method1748(i_35_, i_33_, i_31_, i_42_, class133, null, Class14_Sub28.anIntArray3225[i], 0,
							(Class14_Sub19.anIntArray3074[i] * i_38_), i_38_ * Class9.anIntArray212[i], l);
				} else if (i_32_ == 6) {
					i_38_ = 8;
					long l_53_ = JunkTex.method79(i_35_, i_33_, i_31_);
					if (0L != l_53_)
						i_38_ = (Class79.method1377((byte) -106, (int) (l_53_ >>> 32) & 0x7fffffff).anInt1246) / 2;
					Class133 class133;
					if (class79.anInt1278 == -1 && class79.anIntArray1276 == null) {
						Class86 class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i + 4, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_ - Class114.anIntArray1893[i] * 8,
									i_45_, (-(Class14_Sub2_Sub9.anIntArray3859[i] * 8) + i_43_));
						class133 = class86.aClass133_1379;
					} else
						class133 = new Class133_Sub4(i_34_, 4, i + 4, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					Class127.method1748(i_35_, i_33_, i_31_, i_42_, class133, null, 256, i,
							i_38_ * Class114.anIntArray1893[i], (Class14_Sub2_Sub9.anIntArray3859[i] * i_38_), l);
				} else if (i_32_ == 7) {
					i_38_ = i + 2 & 0x3;
					Class133 class133;
					if (class79.anInt1278 != -1 || class79.anIntArray1276 != null)
						class133 = new Class133_Sub4(i_34_, 4, i_38_ + 4, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					else {
						Class86 class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i_38_ + 4, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_, i_45_, i_43_);
						class133 = class86.aClass133_1379;
					}
					Class127.method1748(i_35_, i_33_, i_31_, i_42_, class133, null, 256, i_38_, 0, 0, l);
				} else if (i_32_ == 8) {
					i_38_ = 8;
					long l_54_ = JunkTex.method79(i_35_, i_33_, i_31_);
					if (l_54_ != 0L)
						i_38_ = (Class79.method1377((byte) -106, (int) (l_54_ >>> 32) & 0x7fffffff).anInt1246) / 2;
					i_41_ = i + 2 & 0x3;
					Class133 class133;
					Class133 class133_55_;
					if (class79.anInt1278 == -1 && class79.anIntArray1276 == null) {
						int i_56_ = Class114.anIntArray1893[i] * 8;
						int i_57_ = Class14_Sub2_Sub9.anIntArray3859[i] * 8;
						Class86 class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i + 4, true, bool_48_,
								null, i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, i_44_ - i_56_, i_45_, i_43_ - i_57_);
						class133 = class86.aClass133_1379;
						class86 = class79.method1383(i_42_, 4, is, is_47_, bool_28_, i_41_ + 4, true, bool_48_, null,
								i_44_, i_43_);
						if (bool_48_)
							ShadowManager.method2026(class86.aClass148_Sub1_1386, -i_56_ + i_44_, i_45_, i_43_ - i_57_);
						class133_55_ = class86.aClass133_1379;
					} else {
						class133 = new Class133_Sub4(i_34_, 4, i + 4, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
						class133_55_ = new Class133_Sub4(i_34_, 4, i_41_ + 4, i_30_, i_33_, i_31_, class79.anInt1278,
								class79.aBoolean1258, null);
					}
					Class127.method1748(i_35_, i_33_, i_31_, i_42_, class133, class133_55_, 256, i,
							i_38_ * Class114.anIntArray1893[i], i_38_ * (Class14_Sub2_Sub9.anIntArray3859[i]), l);
				}
			}
		}
	}
	public static void method1236(byte i) {
		aClass14_Sub10_Sub1_891 = null;
		if (i > -127)
			method1222(null, (byte) 98);
	}
	public static void method1327(byte i) {
		JunkTex.aClass124_1105 = null;
		JunkTex.anIntArray1114 = null;
		if (i >= -97)
			method1329(46);
	}
	public static void method1328(int i, boolean bool) {
		if (i != -1 && Class126.method1741((byte) 72, i)) {
			if (!bool)
				method1330(-75, -104, -48, -108, -34);
			Class94[] class94s = Class1.aClass94ArrayArray75[i];
			for (int i_4_ = 0; class94s.length > i_4_; i_4_++) {
				Class94 class94 = class94s[i_4_];
				if (class94.anObjectArray1529 != null) {
					Class14_Sub21 class14_sub21 = new Class14_Sub21();
					class14_sub21.aClass94_3116 = class94;
					class14_sub21.anObjectArray3115 = class94.anObjectArray1529;
					Class116.method1596(2000000, (byte) 79, class14_sub21);
				}
			}
		}
	}
	public static void method1329(int i) {
		Class96.anApplet_Sub1_1632.method37(i ^ 0x5);
		if (i != 0)
			JunkTex.anInt1132 = -44;
	}
	public static void method1330(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		Class133_Sub6.anInt3659 = i_7_ * JunkTex.anInt4332 / i_6_;
		JunkTex.anInt427 = i_8_;
		Class14_Sub18.anInt3050 = -1;
		Class37.anInt644 = Class14_Sub2_Sub9.anInt3856 * i / i_5_;
		Static2.method1126((byte) -22);
	}
	public static boolean method1396(int i, int i_1_) {
		int i_2_ = 105 / ((-61 - i) / 32);
		boolean bool = (i_1_ >> 31 & 0x1) != 0;
		return bool;
	}
	public static Class14_Sub27[] method1398(int[][] is, byte[][] is_5_, int i, byte[][] is_6_, byte[][] is_7_,
			int i_8_, float[][] fs, float[][] fs_9_, int[][] is_10_, byte[][][] is_11_, float[][] fs_12_,
			byte[][] is_13_) {
		HashTable hashTable = new HashTable(128);
		for (int i_14_ = 1; i_14_ <= 102; i_14_++) {
			for (int i_15_ = 1; i_15_ <= 102; i_15_++) {
				int i_16_ = is_13_[i_14_][i_15_] & 0xff;
				int i_17_ = is_6_[i_14_][i_15_] & 0xff;
				if (i_17_ != 0) {
					Class150 class150 = Class97.method1489(i_17_ - 1, -9810);
					if (class150.anInt2411 == -1)
						continue;
					Class14_Sub27 class14_sub27 = Static2.method1122(hashTable, -91, class150);
					byte i_18_ = is_7_[i_14_][i_15_];
					int[] is_19_ = anIntArrayArray2545[i_18_];
					class14_sub27.anInt3181 += is_19_.length / 2;
					class14_sub27.anInt3180++;
					if (class150.aBoolean2409 && i_16_ != 0)
						class14_sub27.anInt3181 += Static2.anIntArray2731[i_18_];
				}
				if ((is_13_[i_14_][i_15_] & 0xff) != 0 || i_17_ != 0 && is_7_[i_14_][i_15_] == 0) {
					int i_20_ = 0;
					int i_21_ = 0;
					int[] is_22_ = new int[8];
					int i_23_ = 0;
					int i_24_ = 0;
					int i_25_ = is_6_[i_14_][i_15_ + 1] & 0xff;
					int i_26_ = is_6_[i_14_ - 1][i_15_] & 0xff;
					int i_27_ = 0;
					int i_28_ = is_6_[i_14_][i_15_ - 1] & 0xff;
					int i_29_ = is_6_[i_14_ + 1][i_15_] & 0xff;
					int i_30_ = is_6_[i_14_ - 1][i_15_ + 1] & 0xff;
					int i_31_ = is_6_[i_14_ - 1][i_15_ - 1] & 0xff;
					int i_32_ = is_6_[i_14_ + 1][i_15_ - 1] & 0xff;
					int i_33_ = is_6_[i_14_ + 1][i_15_ + 1] & 0xff;
					if (i_30_ != 0 && i_30_ != i_17_) {
						Class150 class150 = Class97.method1489(i_30_ - 1, i ^ ~0x2655);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_34_ = is_5_[i_14_ - 1][i_15_ + 1];
							byte i_35_ = is_7_[i_14_ - 1][i_15_ + 1];
							int i_36_ = (Class70.anIntArray1082[(i_34_ + 3 & 0x3) + i_35_ * 4]);
							int i_37_ = (Class70.anIntArray1082[(i_34_ + 2 & 0x3) + i_35_ * 4]);
							if (Class95.aBooleanArrayArray1623[i_36_][1] && Class95.aBooleanArrayArray1623[i_37_][0]) {
								boolean bool = false;
							} else {
								for (int i_38_ = 0; i_38_ < 8; i_38_++) {
									if (i_20_ == i_38_) {
										is_22_[i_20_++] = i_30_;
										break;
									}
									if (i_30_ == is_22_[i_38_])
										break;
								}
							}
						}
					} else {
						boolean bool = false;
					}
					if (i_31_ == 0 || i_17_ == i_31_) {
						boolean bool = false;
					} else {
						Class150 class150 = Class97.method1489(i_31_ - 1, i - 9814);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_39_ = is_5_[i_14_ - 1][i_15_ - 1];
							byte i_40_ = is_7_[i_14_ - 1][i_15_ - 1];
							int i_41_ = (Class70.anIntArray1082[i_40_ * 4 + (i_39_ & 0x3)]);
							int i_42_ = (Class70.anIntArray1082[(i_39_ + 3 & 0x3) + i_40_ * 4]);
							if (!Class95.aBooleanArrayArray1623[i_41_][1]
									|| !Class95.aBooleanArrayArray1623[i_42_][0]) {
								for (int i_43_ = 0; i_43_ < 8; i_43_++) {
									if (i_43_ == i_20_) {
										is_22_[i_20_++] = i_31_;
										break;
									}
									if (i_31_ == is_22_[i_43_])
										break;
								}
							} else {
								boolean bool = false;
							}
						}
					}
					if (i_32_ == 0 || i_17_ == i_32_) {
						boolean bool = false;
					} else {
						Class150 class150 = Class97.method1489(i_32_ - 1, i - 9814);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1) {
							boolean bool = false;
						} else {
							byte i_44_ = is_5_[i_14_ + 1][i_15_ - 1];
							byte i_45_ = is_7_[i_14_ + 1][i_15_ - 1];
							int i_46_ = (Class70.anIntArray1082[i_45_ * 4 + (i_44_ & 0x3)]);
							int i_47_ = (Class70.anIntArray1082[(i_44_ + 1 & 0x3) + i_45_ * 4]);
							if (Class95.aBooleanArrayArray1623[i_47_][1] && Class95.aBooleanArrayArray1623[i_46_][0]) {
								boolean bool = false;
							} else {
								for (int i_48_ = 0; i_48_ < 8; i_48_++) {
									if (i_48_ == i_20_) {
										is_22_[i_20_++] = i_32_;
										break;
									}
									if (is_22_[i_48_] == i_32_)
										break;
								}
							}
						}
					}
					if (i_33_ != 0 && i_33_ != i_17_) {
						Class150 class150 = Class97.method1489(i_33_ - 1, i ^ ~0x2655);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							byte i_49_ = is_7_[i_14_ + 1][i_15_ + 1];
							byte i_50_ = is_5_[i_14_ + 1][i_15_ + 1];
							int i_51_ = (Class70.anIntArray1082[(i_50_ + 2 & 0x3) + i_49_ * 4]);
							int i_52_ = (Class70.anIntArray1082[(i_50_ + 1 & 0x3) + i_49_ * 4]);
							if (Class95.aBooleanArrayArray1623[i_51_][1] && Class95.aBooleanArrayArray1623[i_52_][0]) {
								boolean bool = false;
							} else {
								for (int i_53_ = 0; i_53_ < 8; i_53_++) {
									if (i_20_ == i_53_) {
										is_22_[i_20_++] = i_33_;
										break;
									}
									if (is_22_[i_53_] == i_33_)
										break;
								}
							}
						} else {
							boolean bool = false;
						}
					} else {
						boolean bool = false;
					}
					if (i_25_ != 0 && i_17_ != i_25_) {
						Class150 class150 = Class97.method1489(i_25_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_21_ = (Class70.anIntArray1082[(is_7_[i_14_][i_15_ + 1] * 4
									+ (is_5_[i_14_][i_15_ + 1] + 2 & 0x3))]);
							for (int i_54_ = 0; i_54_ < 8; i_54_++) {
								if (i_54_ == i_20_) {
									is_22_[i_20_++] = i_25_;
									break;
								}
								if (i_25_ == is_22_[i_54_])
									break;
							}
						}
					}
					if (i_26_ != 0 && i_17_ != i_26_) {
						Class150 class150 = Class97.method1489(i_26_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_23_ = (Class70.anIntArray1082[((is_5_[i_14_ - 1][i_15_] + 3 & 0x3)
									+ is_7_[i_14_ - 1][i_15_] * 4)]);
							for (int i_55_ = 0; i_55_ < 8; i_55_++) {
								if (i_20_ == i_55_) {
									is_22_[i_20_++] = i_26_;
									break;
								}
								if (i_26_ == is_22_[i_55_])
									break;
							}
						}
					}
					if (i_28_ != 0 && i_17_ != i_28_) {
						Class150 class150 = Class97.method1489(i_28_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_24_ = (Class70.anIntArray1082[(is_7_[i_14_][i_15_ - 1] * 4
									+ (is_5_[i_14_][i_15_ - 1] & 0x3))]);
							for (int i_56_ = 0; i_56_ < 8; i_56_++) {
								if (i_56_ == i_20_) {
									is_22_[i_20_++] = i_28_;
									break;
								}
								if (is_22_[i_56_] == i_28_)
									break;
							}
						}
					}
					if (i_29_ != 0 && i_29_ != i_17_) {
						Class150 class150 = Class97.method1489(i_29_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_27_ = (Class70.anIntArray1082[((is_5_[i_14_ + 1][i_15_] + 1 & 0x3)
									+ is_7_[i_14_ + 1][i_15_] * 4)]);
							for (int i_57_ = 0; i_57_ < 8; i_57_++) {
								if (i_20_ == i_57_) {
									is_22_[i_20_++] = i_29_;
									break;
								}
								if (i_29_ == is_22_[i_57_])
									break;
							}
						}
					}
					for (int i_58_ = 0; i_20_ > i_58_; i_58_++) {
						int i_59_ = is_22_[i_58_];
						boolean[] bools = (Class95.aBooleanArrayArray1623[i_25_ == i_59_ ? i_21_ : 0]);
						boolean[] bools_60_ = (Class95.aBooleanArrayArray1623[i_59_ == i_28_ ? i_24_ : 0]);
						boolean[] bools_61_ = (Class95.aBooleanArrayArray1623[i_26_ == i_59_ ? i_23_ : 0]);
						boolean[] bools_62_ = (Class95.aBooleanArrayArray1623[i_59_ != i_29_ ? 0 : i_27_]);
						Class150 class150 = Class97.method1489(i_59_ - 1, -9810);
						Class14_Sub27 class14_sub27 = Static2.method1122(hashTable, i + 123, class150);
						class14_sub27.anInt3181 += 5;
						class14_sub27.anInt3181 += bools.length - 2;
						class14_sub27.anInt3181 += bools_61_.length - 2;
						class14_sub27.anInt3181 += bools_60_.length - 2;
						class14_sub27.anInt3181 += bools_62_.length - 2;
						class14_sub27.anInt3180++;
					}
				}
			}
		}
		for (Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (Class14_Sub27) hashTable.getNext())
			class14_sub27.method924();
		for (int i_63_ = 1; i_63_ <= 102; i_63_++) {
			for (int i_64_ = 1; i_64_ <= 102; i_64_++) {
				int i_65_;
				if ((is_11_[i_8_][i_63_][i_64_] & 0x8) == 0) {
					if ((is_11_[1][i_63_][i_64_] & 0x2) != 2 || i_8_ <= 0)
						i_65_ = i_8_;
					else
						i_65_ = i_8_ - 1;
				} else
					i_65_ = 0;
				int i_66_ = is_13_[i_63_][i_64_] & 0xff;
				int i_67_ = is_6_[i_63_][i_64_] & 0xff;
				if (i_67_ != 0) {
					Class150 class150 = Class97.method1489(i_67_ - 1, -9810);
					if (class150.anInt2411 == -1)
						continue;
					Class14_Sub27 class14_sub27 = Static2.method1122(hashTable, i ^ ~0x2e, class150);
					byte i_68_ = is_5_[i_63_][i_64_];
					byte i_69_ = is_7_[i_63_][i_64_];
					int i_70_ = Class141.method1961(is_10_[i_63_][i_64_], (byte) 115, class150.anInt2414,
							class150.anInt2411);
					int i_71_ = Class141.method1961(is_10_[i_63_ + 1][i_64_], (byte) 122, class150.anInt2414,
							class150.anInt2411);
					int i_72_ = Class141.method1961(is_10_[i_63_ + 1][i_64_ + 1], (byte) 113, class150.anInt2414,
							class150.anInt2411);
					int i_73_ = Class141.method1961(is_10_[i_63_][i_64_ + 1], (byte) 107, class150.anInt2414,
							class150.anInt2411);
					Class38.method1114(i_72_, i_70_, fs, is, i_66_ != 0 && class150.aBoolean2409, class14_sub27, fs_12_,
							i_63_, 104, i_71_, fs_9_, i_68_, i_73_, i_65_, i_69_, i_64_);
				}
				if ((is_13_[i_63_][i_64_] & 0xff) != 0 || i_67_ != 0 && is_7_[i_63_][i_64_] == 0) {
					int i_74_ = 0;
					int[] is_75_ = new int[8];
					int i_76_ = 0;
					int i_77_ = 0;
					int i_78_ = 0;
					int i_79_ = 0;
					int i_80_ = is_6_[i_63_ - 1][i_64_] & 0xff;
					int i_81_ = is_6_[i_63_][i_64_ + 1] & 0xff;
					int i_82_ = is_6_[i_63_ - 1][i_64_ + 1] & 0xff;
					int i_83_ = is_6_[i_63_ - 1][i_64_ - 1] & 0xff;
					int i_84_ = is_6_[i_63_ + 1][i_64_] & 0xff;
					int i_85_ = is_6_[i_63_][i_64_ - 1] & 0xff;
					int i_86_ = is_6_[i_63_ + 1][i_64_ - 1] & 0xff;
					int i_87_ = is_6_[i_63_ + 1][i_64_ + 1] & 0xff;
					if (i_82_ == 0 || i_67_ == i_82_)
						i_82_ = 0;
					else {
						Class150 class150 = Class97.method1489(i_82_ - 1, -9810);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1)
							i_82_ = 0;
						else {
							byte i_88_ = is_7_[i_63_ - 1][i_64_ + 1];
							byte i_89_ = is_5_[i_63_ - 1][i_64_ + 1];
							int i_90_ = (Class70.anIntArray1082[(i_89_ + 2 & 0x3) + i_88_ * 4]);
							int i_91_ = (Class70.anIntArray1082[i_88_ * 4 + (i_89_ + 3 & 0x3)]);
							if (Class95.aBooleanArrayArray1623[i_91_][1] && Class95.aBooleanArrayArray1623[i_90_][0])
								i_82_ = 0;
							else {
								for (int i_92_ = 0; i_92_ < 8; i_92_++) {
									if (i_92_ == i_74_) {
										is_75_[i_74_++] = i_82_;
										break;
									}
									if (i_82_ == is_75_[i_92_])
										break;
								}
							}
						}
					}
					if (i_83_ == 0 || i_83_ == i_67_)
						i_83_ = 0;
					else {
						Class150 class150 = Class97.method1489(i_83_ - 1, -9810);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1)
							i_83_ = 0;
						else {
							byte i_93_ = is_5_[i_63_ - 1][i_64_ - 1];
							byte i_94_ = is_7_[i_63_ - 1][i_64_ - 1];
							int i_95_ = (Class70.anIntArray1082[i_94_ * 4 + (i_93_ & 0x3)]);
							int i_96_ = (Class70.anIntArray1082[(i_93_ + 3 & 0x3) + i_94_ * 4]);
							if (Class95.aBooleanArrayArray1623[i_95_][1] && Class95.aBooleanArrayArray1623[i_96_][0])
								i_83_ = 0;
							else {
								for (int i_97_ = 0; i_97_ < 8; i_97_++) {
									if (i_74_ == i_97_) {
										is_75_[i_74_++] = i_83_;
										break;
									}
									if (is_75_[i_97_] == i_83_)
										break;
								}
							}
						}
					}
					if (i_86_ == 0 || i_67_ == i_86_)
						i_86_ = 0;
					else {
						Class150 class150 = Class97.method1489(i_86_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							byte i_98_ = is_5_[i_63_ + 1][i_64_ - 1];
							byte i_99_ = is_7_[i_63_ + 1][i_64_ - 1];
							int i_100_ = (Class70.anIntArray1082[(i_98_ + 1 & 0x3) + i_99_ * 4]);
							int i_101_ = (Class70.anIntArray1082[i_99_ * 4 + (i_98_ & 0x3)]);
							if (Class95.aBooleanArrayArray1623[i_100_][1] && Class95.aBooleanArrayArray1623[i_101_][0])
								i_86_ = 0;
							else {
								for (int i_102_ = 0; i_102_ < 8; i_102_++) {
									if (i_74_ == i_102_) {
										is_75_[i_74_++] = i_86_;
										break;
									}
									if (i_86_ == is_75_[i_102_])
										break;
								}
							}
						} else
							i_86_ = 0;
					}
					if (i_87_ != 0 && i_67_ != i_87_) {
						Class150 class150 = Class97.method1489(i_87_ - 1, i - 9814);
						if (!class150.aBoolean2409 || class150.anInt2411 == -1)
							i_87_ = 0;
						else {
							byte i_103_ = is_5_[i_63_ + 1][i_64_ + 1];
							byte i_104_ = is_7_[i_63_ + 1][i_64_ + 1];
							int i_105_ = (Class70.anIntArray1082[(i_103_ + 2 & 0x3) + i_104_ * 4]);
							int i_106_ = (Class70.anIntArray1082[i_104_ * 4 + (i_103_ + 1 & 0x3)]);
							if (!Class95.aBooleanArrayArray1623[i_105_][1]
									|| !(Class95.aBooleanArrayArray1623[i_106_][0])) {
								for (int i_107_ = 0; i_107_ < 8; i_107_++) {
									if (i_74_ == i_107_) {
										is_75_[i_74_++] = i_87_;
										break;
									}
									if (is_75_[i_107_] == i_87_)
										break;
								}
							} else
								i_87_ = 0;
						}
					} else
						i_87_ = 0;
					if (i_81_ != 0 && i_67_ != i_81_) {
						Class150 class150 = Class97.method1489(i_81_ - 1, i - 9814);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_76_ = (Class70.anIntArray1082[((is_5_[i_63_][i_64_ + 1] + 2 & 0x3)
									+ is_7_[i_63_][i_64_ + 1] * 4)]);
							for (int i_108_ = 0; i_108_ < 8; i_108_++) {
								if (i_108_ == i_74_) {
									is_75_[i_74_++] = i_81_;
									break;
								}
								if (is_75_[i_108_] == i_81_)
									break;
							}
						}
					}
					if (i_80_ != 0 && i_67_ != i_80_) {
						Class150 class150 = Class97.method1489(i_80_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_77_ = (Class70.anIntArray1082[((is_5_[i_63_ - 1][i_64_] + 3 & 0x3)
									+ is_7_[i_63_ - 1][i_64_] * 4)]);
							for (int i_109_ = 0; i_109_ < 8; i_109_++) {
								if (i_109_ == i_74_) {
									is_75_[i_74_++] = i_80_;
									break;
								}
								if (is_75_[i_109_] == i_80_)
									break;
							}
						}
					}
					if (i_85_ != 0 && i_67_ != i_85_) {
						Class150 class150 = Class97.method1489(i_85_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_79_ = (Class70.anIntArray1082[(is_7_[i_63_][i_64_ - 1] * 4
									+ (is_5_[i_63_][i_64_ - 1] & 0x3))]);
							for (int i_110_ = 0; i_110_ < 8; i_110_++) {
								if (i_110_ == i_74_) {
									is_75_[i_74_++] = i_85_;
									break;
								}
								if (i_85_ == is_75_[i_110_])
									break;
							}
						}
					}
					if (i_84_ != 0 && i_84_ != i_67_) {
						Class150 class150 = Class97.method1489(i_84_ - 1, -9810);
						if (class150.aBoolean2409 && class150.anInt2411 != -1) {
							i_78_ = (Class70.anIntArray1082[(is_7_[i_63_ + 1][i_64_] * 4
									+ (is_5_[i_63_ + 1][i_64_] + 1 & 0x3))]);
							for (int i_111_ = 0; i_111_ < 8; i_111_++) {
								if (i_111_ == i_74_) {
									is_75_[i_74_++] = i_84_;
									break;
								}
								if (is_75_[i_111_] == i_84_)
									break;
							}
						}
					}
					for (int i_112_ = 0; i_112_ < i_74_; i_112_++) {
						int i_113_ = is_75_[i_112_];
						boolean[] bools = (Class95.aBooleanArrayArray1623[i_81_ != i_113_ ? 0 : i_76_]);
						boolean[] bools_114_ = (Class95.aBooleanArrayArray1623[i_80_ == i_113_ ? i_77_ : 0]);
						boolean[] bools_115_ = (Class95.aBooleanArrayArray1623[i_113_ != i_85_ ? 0 : i_79_]);
						boolean[] bools_116_ = (Class95.aBooleanArrayArray1623[i_113_ != i_84_ ? 0 : i_78_]);
						Class150 class150 = Class97.method1489(i_113_ - 1, -9810);
						Class14_Sub27 class14_sub27 = Static2.method1122(hashTable, 102, class150);
						int i_117_ = (Class141.method1961(is_10_[i_63_][i_64_], (byte) 108, class150.anInt2414,
								class150.anInt2411) << 40 | 0xff);
						int i_118_ = (Class141.method1961(is_10_[i_63_ + 1][i_64_], (byte) 113, class150.anInt2414,
								class150.anInt2411) << 40 | 0xff);
						int i_119_ = (Class141.method1961((is_10_[i_63_ + 1][i_64_ + 1]), (byte) 123,
								class150.anInt2414, class150.anInt2411) << 40 | 0xff);
						int i_120_ = 6;
						int i_121_ = (Class141.method1961(is_10_[i_63_][i_64_ + 1], (byte) 109, class150.anInt2414,
								class150.anInt2411) << 40 | 0xff);
						i_120_ += bools.length - 2;
						boolean bool = i_113_ != i_82_ && bools_114_[0] && bools[1];
						i_120_ += bools_114_.length - 2;
						i_120_ += bools_115_.length - 2;
						boolean bool_122_ = i_113_ != i_87_ && bools[0] && bools_116_[1];
						boolean bool_123_ = (i_83_ != i_113_ && bools_115_[0] && bools_114_[1]);
						i_120_ += bools_116_.length - 2;
						int[] is_124_ = new int[i_120_];
						i_120_ = 0;
						boolean bool_125_ = (i_86_ != i_113_ && bools_116_[0] && bools_115_[1]);
						int i_126_ = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12, i_118_, i_117_,
								0, true, fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is, i_63_, 64);
						int i_127_ = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12, i_118_, i_117_,
								0, bool, fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_, 0);
						int i_128_ = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12, i_118_, i_117_,
								0, bool_122_, fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_, 128);
						int i_129_ = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12, i_118_, i_117_,
								0, bool_123_, fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is, i_63_, 0);
						int i_130_ = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12, i_118_, i_117_,
								0, bool_125_, fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is, i_63_, 128);
						is_124_[i_120_++] = i_126_;
						is_124_[i_120_++] = i_128_;
						if (bools.length > 2)
							is_124_[i_120_++] = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12,
									i_118_, i_117_, 0, bools[2], fs_12_, fs_9_, 128, i_64_, fs, null, 0.0F, is, i_63_,
									64);
						is_124_[i_120_++] = i_127_;
						if (bools_114_.length > 2)
							is_124_[i_120_++] = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12,
									i_118_, i_117_, 0, bools_114_[2], fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is,
									i_63_, 0);
						is_124_[i_120_++] = i_129_;
						if (bools_115_.length > 2)
							is_124_[i_120_++] = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12,
									i_118_, i_117_, 0, bools_115_[2], fs_12_, fs_9_, 0, i_64_, fs, null, 0.0F, is,
									i_63_, 64);
						is_124_[i_120_++] = i_130_;
						if (2 < bools_116_.length)
							is_124_[i_120_++] = Class14_Sub17.method881(i_121_, i_119_, class14_sub27, (byte) 12,
									i_118_, i_117_, 0, bools_116_[2], fs_12_, fs_9_, 64, i_64_, fs, null, 0.0F, is,
									i_63_, 128);
						is_124_[i_120_++] = i_128_;
						class14_sub27.method920(i_65_, i_63_, i_64_, is_124_, null, true);
					}
				}
			}
		}
		for (Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (Class14_Sub27) hashTable.getNext()) {
			if (class14_sub27.anInt3202 == 0)
				class14_sub27.unlink();
			else
				class14_sub27.method925();
		}
		int i_131_ = hashTable.size();
		long[] ls = new long[i_131_];
		Class14_Sub27[] class14_sub27s = new Class14_Sub27[i_131_];
		hashTable.toArray(class14_sub27s);
		if (i != 4)
			method1396(-83, -65);
		for (int i_132_ = 0; i_132_ < i_131_; i_132_++)
			ls[i_132_] = class14_sub27s[i_132_].key;
		Static2.method1506(class14_sub27s, ls, true);
		Class14_Sub27[] class14_sub27s_133_ = class14_sub27s;
		return class14_sub27s_133_;
	}

	public static void method1399(int i, int i_134_, int i_135_, byte i_136_, int i_137_) {
		if (JunkTex.anInt4616 < 100)
			Class45.method1161(60);
		Class25.method999(i_137_, i_135_, i + i_137_, i_134_ + i_135_);
		if (JunkTex.anInt4616 < 100) {
			int i_138_ = i / 2 + i_137_;
			int i_139_ = 20;
			int i_140_ = i_134_ / 2 + (i_135_ + (-i_139_ - 18));
			Class25.method1004(i_137_, i_135_, i, i_134_, 0);
			Class25.method1003(i_138_ - 152, i_140_, 304, 34, 9179409);
			Class25.method1003(i_138_ - 151, i_140_ + 1, 302, 32, 0);
			Class25.method1004(i_138_ - 150, i_140_ + 2, JunkTex.anInt4616 * 3, 30, 9179409);
			Class25.method1004(i_138_ + JunkTex.anInt4616 * 3 - 150, i_140_ + 2,
					-(JunkTex.anInt4616 * 3) + 300, 30, 0);
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method345(Static2.aClass124_4886, i_138_, i_139_ + i_140_,
					16777215, -1);
		} else {
			Static2.anInt356 = (int) ((float) (i * 2) / Class90.aFloat1426);
			Class98.anInt1671 = -(int) ((float) i / Class90.aFloat1426) + Class37.anInt644;
			Class60.anInt984 = Class133_Sub6.anInt3659 - (int) ((float) i_134_ / Class90.aFloat1426);
			if (i_136_ < -54) {
				int i_141_ = (-(int) ((float) i / Class90.aFloat1426) + Class37.anInt644);
				int i_142_ = (-(int) ((float) i_134_ / Class90.aFloat1426) + Class133_Sub6.anInt3659);
				Class134.anInt2572 = (int) ((float) (i_134_ * 2) / Class90.aFloat1426);
				int i_143_ = (Class37.anInt644 + (int) ((float) i / Class90.aFloat1426));
				int i_144_ = ((int) ((float) i_134_ / Class90.aFloat1426) + Class133_Sub6.anInt3659);
				if ((Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836 == null)
						|| (Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836.anInt4035) != i
						|| i_134_ != (Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836.anInt4042))
					Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836 = new Class14_Sub2_Sub19_Sub1_Sub2(i, i_134_);
				Class92.method1455((Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836.anIntArray5088), i, i_134_);
				Class133_Sub1_Sub1.method1810(i_144_, 0, -24, i_142_, i_134_, i_141_, i, i_143_, 0);
				Class153.method2050(i_142_, i_144_, i, 1, i_134_, 0, i_141_, 0, i_143_);
				JunkTex.method603(0, 0, i_141_, i_142_, i_143_, i_134_, i, -127, i_144_);
				Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836.method390(i_137_, i_135_);
				if (Static2.anInt365 > 0)
					Static2.anInt365--;
				if (Class133_Sub6.aBoolean3663) {
					int i_145_ = i_137_ + i - 5;
					int i_146_ = i_134_ - 8 + i_135_;
					Class84.aClass14_Sub2_Sub16_1344
							.method348(
									(JunkTex.method515(
											(new Class124[] { Static2.aClass124_3351,
													Class83.method1407(16, (Class14_Sub9_Sub3.anInt4843)) }),
											(byte) -123)),
									i_145_, i_146_, 16776960, -1);
					i_146_ -= 15;
					Runtime runtime = Runtime.getRuntime();
					int i_147_ = 16776960;
					int i_148_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
					if (i_148_ > 65536)
						i_147_ = 16711680;
					Class84.aClass14_Sub2_Sub16_1344.method348(
							(JunkTex.method515(new Class124[] { Class1.aClass124_72,
									Class83.method1407(120, i_148_), Class62.aClass124_995 }, (byte) -128)),
							i_145_, i_146_, i_147_, -1);
					i_146_ -= 15;
				}
			}
		}
	}

	public static void method1403(int i) {
		JunkTex.aClass124_1318 = null;
		if (i != 0)
			JunkTex.aClass124_1326 = null;
		JunkTex.aClass124_1326 = null;
		JunkTex.aClass31_1328 = null;
	}
	public static void method234(Class9 class9, byte i) {
		Class7_Sub1.aClass9_2652 = class9;
		if (i > -62)
			JunkTex.aClass9_2711 = null;
	}
	public static Class75 method235(int i, int i_0_, Class43 class43, Component component, int i_1_) {
		if (Class115.anInt1909 == 0)
			throw new IllegalStateException();
		if (i_1_ >= 0 && i_1_ < 2) {
			if (i < 256)
				i = 256;
			while_54_: do {
				do {
					Class75 class75;
					try {
						if (i_0_ >= 38)
							break;
						Object object = null;
						class75 = (Class75) object;
					} catch (Throwable throwable) {
						break while_54_;
					}
					return class75;
				} while (false);
				Class75 class75;
				try {
					Class75 class75_2_ = ((Class75) Class.forName("rs.Class75_Sub1").newInstance());
					class75_2_.anIntArray1150 = new int[256 * (!Class14_Sub2_Sub2.aBoolean3763 ? 1 : 2)];
					class75_2_.anInt1173 = i;
					class75_2_.method1350(component);
					class75_2_.anInt1174 = (i & ~0x3ff) + 1024;
					if (class75_2_.anInt1174 > 16384)
						class75_2_.anInt1174 = 16384;
					class75_2_.method1347(class75_2_.anInt1174);
					if (Static2.anInt1674 > 0 && Class69.aClass90_1070 == null) {
						Class69.aClass90_1070 = new Class90();
						Class69.aClass90_1070.aClass43_1421 = class43;
						class43.method1143(Static2.anInt1674, Class69.aClass90_1070, 0);
					}
					if (Class69.aClass90_1070 != null) {
						if (Class69.aClass90_1070.aClass75Array1422[i_1_] != null)
							throw new IllegalArgumentException();
						Class69.aClass90_1070.aClass75Array1422[i_1_] = class75_2_;
					}
					class75 = class75_2_;
				} catch (Throwable throwable) {
					break;
				}
				return class75;
			} while (false);
			new Throwable();
			Class75_Sub2 class75_sub2;
			try {
				Class75_Sub2 class75_sub2_3_ = new Class75_Sub2(class43, i_1_);
				class75_sub2_3_.anInt1173 = i;
				class75_sub2_3_.anIntArray1150 = new int[256 * (Class14_Sub2_Sub2.aBoolean3763 ? 2 : 1)];
				class75_sub2_3_.method1350(component);
				class75_sub2_3_.anInt1174 = 16384;
				class75_sub2_3_.method1347(class75_sub2_3_.anInt1174);
				if (Static2.anInt1674 > 0 && Class69.aClass90_1070 == null) {
					Class69.aClass90_1070 = new Class90();
					Class69.aClass90_1070.aClass43_1421 = class43;
					class43.method1143(Static2.anInt1674, Class69.aClass90_1070, 0);
				}
				if (Class69.aClass90_1070 != null) {
					if (Class69.aClass90_1070.aClass75Array1422[i_1_] != null)
						throw new IllegalArgumentException();
					Class69.aClass90_1070.aClass75Array1422[i_1_] = class75_sub2_3_;
				}
				class75_sub2 = class75_sub2_3_;
			} catch (Throwable throwable) {
				return null;
			}
			return class75_sub2;
		}
		throw new IllegalArgumentException();
	}
	public static void method236(boolean bool, Class14_Sub15 class14_sub15, byte i) {
		int i_4_ = class14_sub15.anInt2999;
		int i_5_ = (int) class14_sub15.key;
		class14_sub15.unlink();
		if (bool)
			Class49.method1197(i_4_, false);
		JunkTex.method644(i_4_, (byte) 92);
		Class94 class94 = JunkTex.method1233(i_5_, 21803);
		if (class94 != null)
			Class103.method1531(class94);
		JunkTex.anInt4729 = 0;
		Class133_Sub5.aBoolean3628 = false;
		if (i > -116)
			JunkTex.aBoolean2722 = true;
		Class14_Sub13.method862(122, Class14_Sub14.anInt2984, JunkTex.anInt4550, Class14_Sub2_Sub8.anInt3832,
				JunkTex.anInt500);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
	}
	public static Class14_Sub15 method237(int i, int i_6_, int i_7_, int i_8_) {
		Class14_Sub15 class14_sub15 = new Class14_Sub15();
		class14_sub15.anInt2999 = i_8_;
		class14_sub15.anInt2991 = i_7_;
		Class14_Sub30.aClass55_3275.put((long) i_6_, class14_sub15);
		if (i != 1)
			method239(false);
		Class109.method1563(i_8_, i ^ ~0x33);
		Class94 class94 = JunkTex.method1233(i_6_, 21803);
		if (class94 != null)
			Class103.method1531(class94);
		if (Class125_Sub2.aClass94_3388 != null) {
			Class103.method1531(Class125_Sub2.aClass94_3388);
			Class125_Sub2.aClass94_3388 = null;
		}
		JunkTex.anInt4729 = 0;
		Class133_Sub5.aBoolean3628 = false;
		Class14_Sub13.method862(i + 125, Class14_Sub14.anInt2984, JunkTex.anInt4550,
				Class14_Sub2_Sub8.anInt3832, JunkTex.anInt500);
		if (class94 != null)
			Class14_Sub2_Sub21.method445(class94, 18559, false);
		JunkTex.method1328(i_8_, true);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
		Class14_Sub15 class14_sub15_9_ = class14_sub15;
		return class14_sub15_9_;
	}
	public static void method238(byte i) {
		if (Class14_Sub15.aClass36_2990 != null) {
			Class14_Sub15.aClass36_2990.method1101((byte) -31);
			Class14_Sub15.aClass36_2990 = null;
		}
		Class14_Sub3.method451(0);
		Class56.method1240();
		for (int i_10_ = 0; i_10_ < 4; i_10_++)
			Class14_Sub21.aClass32Array3100[i_10_].method1071(true);
		Class69.method1311((byte) 124);
		System.gc();
		Class69.method1308(2, (byte) -14);
		JunkTex.anInt2856 = -1;
		Class14_Sub7.aBoolean2827 = false;
		Class137.method1941(true, (byte) -84);
		Class58.anInt947 = 0;
		Class133_Sub6.anInt3676 = 0;
		Class7_Sub2_Sub1.aBoolean3699 = false;
		for (int i_11_ = 0; i_11_ < Static2.aClass66Array3721.length; i_11_++)
			Static2.aClass66Array3721[i_11_] = null;
		Static2.anInt2878 = 0;
		JunkTex.anInt4306 = 0;
		for (int i_12_ = 0; i_12_ < 2048; i_12_++) {
			JunkTex.aClass133_Sub1_Sub1Array4474[i_12_] = null;
			Static2.aClass14_Sub10Array2742[i_12_] = null;
		}
		for (int i_13_ = 0; i_13_ < 32768; i_13_++)
			Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_13_] = null;
		if (i <= 46)
			method238((byte) -64);
		for (int i_14_ = 0; i_14_ < 4; i_14_++) {
			for (int i_15_ = 0; i_15_ < 104; i_15_++) {
				for (int i_16_ = 0; i_16_ < 104; i_16_++)
					Class128.aClass2ArrayArrayArray2119[i_14_][i_15_][i_16_] = null;
			}
		}
		Class109.method1568((byte) -43);
	}
	public static void method239(boolean bool) {
		JunkTex.anIntArrayArrayArray2724 = null;
		JunkTex.aClass9_2711 = null;
		JunkTex.aShortArray2717 = null;
		if (bool)
			JunkTex.anIntArrayArrayArray2724 = null;
	}

	public static void method240(int i) {
		for (Class14_Sub3 class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getNext()) {
			if (class14_sub3.aBoolean2757)
				class14_sub3.method452(18631);
		}
		for (Class14_Sub3 class14_sub3 = (Class14_Sub3) aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) aClass2_683.getNext()) {
			if (class14_sub3.aBoolean2757)
				class14_sub3.method452(18631);
		}
	}

	public static void method325(int i) {
		aClass124_3926 = null;
		if (i != 8)
			method325(-31);
		aLongArray3924 = null;
	}

	public static void method329(boolean bool) {
		Static2.method259(false, 11988);
		client.anInt2648 = 0;
		boolean bool_0_ = bool;
		for (int i = 0; i < Class5.aByteArrayArray139.length; i++) {
			if (Class62.anIntArray992[i] != -1 && Class5.aByteArrayArray139[i] == null) {
				Class5.aByteArrayArray139[i] = Class14_Sub13.aClass9_Sub1_2958.method163(0, Class62.anIntArray992[i],
						0);
				if (Class5.aByteArrayArray139[i] == null) {
					bool_0_ = false;
					client.anInt2648++;
				}
			}
			if (Class150.anIntArray2422[i] != -1 && Class14_Sub20.aByteArrayArray3097[i] == null) {
				Class14_Sub20.aByteArrayArray3097[i] = (Class14_Sub13.aClass9_Sub1_2958.method149(-23245, 0,
						Class125_Sub3.anIntArrayArray3391[i], Class150.anIntArray2422[i]));
				if (Class14_Sub20.aByteArrayArray3097[i] == null) {
					bool_0_ = false;
					client.anInt2648++;
				}
			}
			if (anIntArray3955[i] != -1 && Class14_Sub2_Sub12.aByteArrayArray3913[i] == null) {
				Class14_Sub2_Sub12.aByteArrayArray3913[i] = (Class14_Sub13.aClass9_Sub1_2958.method163(0,
						anIntArray3955[i], 0));
				if (Class14_Sub2_Sub12.aByteArrayArray3913[i] == null) {
					client.anInt2648++;
					bool_0_ = false;
				}
			}
			if (Class14_Sub22.anIntArray3119[i] != -1 && Static2.aByteArrayArray362[i] == null) {
				Static2.aByteArrayArray362[i] = Class14_Sub13.aClass9_Sub1_2958.method163(0,
						Class14_Sub22.anIntArray3119[i], 0);
				if (Static2.aByteArrayArray362[i] == null) {
					client.anInt2648++;
					bool_0_ = false;
				}
			}
			if (Class134.anIntArray2590 != null && JunkTex.aByteArrayArray4556[i] == null
					&& Class134.anIntArray2590[i] != -1) {
				JunkTex.aByteArrayArray4556[i] = (Class14_Sub13.aClass9_Sub1_2958.method149(-23245, 0,
						Class125_Sub3.anIntArrayArray3391[i], Class134.anIntArray2590[i]));
				if (JunkTex.aByteArrayArray4556[i] == null) {
					bool_0_ = false;
					client.anInt2648++;
				}
			}
		}
		if (Class70.aClass14_Sub2_Sub5_1078 == null || !(Class7_Sub1.aClass9_Sub1_2657.method166((byte) -83,
				JunkTex.method515((new Class124[] { (Class70.aClass14_Sub2_Sub5_1078.aClass124_3804),
						(JunkTex.aClass124_4192) }), (byte) -109))))
			Class79.aClass146_1261 = null;
		else if (!Class7_Sub1.aClass9_Sub1_2657.method160(JunkTex.method515((new Class124[] {
				(Class70.aClass14_Sub2_Sub5_1078.aClass124_3804), (JunkTex.aClass124_4192) }), (byte) -34),
				(byte) -102)) {
			client.anInt2648++;
			bool_0_ = false;
		} else
			Class79.aClass146_1261 = (JunkTex.method507(bool,
					JunkTex.method515((new Class124[] { (Class70.aClass14_Sub2_Sub5_1078.aClass124_3804),
							(JunkTex.aClass124_4192) }), (byte) -69),
					Class7_Sub1.aClass9_Sub1_2657));
		if (!bool_0_)
			Class14_Sub18.anInt3064 = 1;
		else {
			Class149.anInt2383 = 0;
			bool_0_ = true;
			for (int i = 0; i < Class5.aByteArrayArray139.length; i++) {
				byte[] is = Class14_Sub20.aByteArrayArray3097[i];
				if (is != null) {
					int i_1_ = ((JunkTex.anIntArray2858[i] & 0xff) * 64 - Class58.anInt947);
					int i_2_ = ((JunkTex.anIntArray2858[i] >> 8) * 64 - Class133_Sub6.anInt3676);
					if (Class7_Sub2_Sub1.aBoolean3699) {
						i_2_ = 10;
						i_1_ = 10;
					}
					bool_0_ &= Class60.method1265((byte) -64, i_1_, is, i_2_);
				}
				is = Static2.aByteArrayArray362[i];
				if (is != null) {
					int i_3_ = ((JunkTex.anIntArray2858[i] >> 40) * 64 - Class133_Sub6.anInt3676);
					int i_4_ = (-Class58.anInt947 + (JunkTex.anIntArray2858[i] & 0xff) * 64);
					if (Class7_Sub2_Sub1.aBoolean3699) {
						i_4_ = 10;
						i_3_ = 10;
					}
					bool_0_ &= Class60.method1265((byte) -52, i_4_, is, i_3_);
				}
			}
			if (!bool_0_)
				Class14_Sub18.anInt3064 = 2;
			else {
				if (Class14_Sub18.anInt3064 != 0)
					Class84.method1411(true,
							(JunkTex.method515(
									(new Class124[] { client.aClass124_2639, aClass124_3301 }),
									(byte) -76)),
							true);
				Class138.method1946(139);
				Class14_Sub3.method451(0);
				bool_0_ = false;
				Class56.method1240();
				for (int i = 0; Class5.aByteArrayArray139.length > i; i++) {
					if (Static2.aByteArrayArray362[i] != null || Class14_Sub2_Sub12.aByteArrayArray3913[i] != null) {
						bool_0_ = true;
						break;
					}
				}
				if (!Class15.aBoolean374)
					bool_0_ = false;
				if (!bool_0_)
					Class47.method1184();
				else
					Class14_Sub11.method855(1);
				for (int i = 0; i < 4; i++)
					Class14_Sub21.aClass32Array3100[i].method1071(true);
				for (int i = 0; i < 4; i++) {
					for (int i_5_ = 0; i_5_ < 104; i_5_++) {
						for (int i_6_ = 0; i_6_ < 104; i_6_++)
							JunkTex.tileFlags[i][i_5_][i_6_] = (byte) 0;
					}
				}
				Class137.method1941(false, (byte) -84);
				ShadowManager.shadowMapImage.method2010();
				for (int i = 0; i < 13; i++) {
					for (int i_7_ = 0; i_7_ < 13; i_7_++)
						ShadowManager.shadows[i][i_7_].outputToSprite = true;
				}
				LightManager.method201();
				Class142.method1976((byte) 61);
				Class138.method1946(139);
				System.gc();
				Static2.method259(true, 11988);
				Class14_Sub29.method935(5, false);
				if (!Class7_Sub2_Sub1.aBoolean3699) {
					Static2.method1512(false, (byte) -105);
					Static2.method259(true, 11988);
					int i = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]) >> 35);
					int i_8_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) >> 3);
					Class62.method1275(i_8_, i, 1);
					Class45.method1166(false, !bool);
					if (JunkTex.aByteArrayArray4556 != null)
						Class14_Sub22.method901((byte) -27);
				}
				if (Class7_Sub2_Sub1.aBoolean3699) {
					Class56.method1238(9857, false);
					Static2.method259(true, 11988);
					int i = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) >> 35);
					int i_9_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]) >> 3);
					Class62.method1275(i, i_9_, 1);
					Class45.method1163(false, -83);
				}
				Class14_Sub3.method451(0);
				Static2.method259(true, 11988);
				MapRegion.method488(Class14_Sub21.aClass32Array3100, false);
				LightManager.method199();
				Static2.method259(true, 11988);
				int i = Class7_Sub2.anInt2676;
				if (Class14_Sub2_Sub3.anInt3785 < i)
					i = Class14_Sub2_Sub3.anInt3785;
				if (Class14_Sub2_Sub3.anInt3785 - 1 > i)
					i = Class14_Sub2_Sub3.anInt3785 - 1;
				if (!Class128.method1755(130068615))
					Class109.method1566(Class7_Sub2.anInt2676);
				else
					Class109.method1566(0);
				Class63.method1278(-112);
				if (bool_0_) {
					JunkTex.method627(true);
					Class14_Sub29.method935(5, true);
					if (!Class7_Sub2_Sub1.aBoolean3699) {
						Static2.method1512(true, (byte) -102);
						Static2.method259(true, 11988);
						Class45.method1166(true, !bool);
					}
					if (Class7_Sub2_Sub1.aBoolean3699) {
						Class56.method1238(9857, true);
						Static2.method259(true, 11988);
						Class45.method1163(true, -70);
					}
					Class14_Sub3.method451(0);
					Static2.method259(true, 11988);
					MapRegion.method488(Class14_Sub21.aClass32Array3100, true);
					Static2.method259(true, 11988);
					Class63.method1278(-99);
					JunkTex.method627(false);
				}
				for (int i_10_ = 0; i_10_ < 13; i_10_++) {
					for (int i_11_ = 0; i_11_ < 13; i_11_++)
						ShadowManager.shadows[i_10_][i_11_].method227(Class114.tileHeights[0], i_10_ * 8,
								i_11_ * 8);
				}
				for (int i_12_ = 0; i_12_ < 104; i_12_++) {
					for (int i_13_ = 0; i_13_ < 104; i_13_++)
						Class67.method1300(i_13_, 9210, i_12_);
				}
				JunkTex.method602(-1);
				Class138.method1946(139);
				Class68.method1307((byte) -58);
				Class14_Sub3.method451(0);
				if (Class14_Sub14.aFrame2986 != null && Class14_Sub15.aClass36_2990 != null
						&& JunkTex.anInt4356 == 25) {
					aClass14_Sub10_Sub1_891.writeOpcode(22);
					aClass14_Sub10_Sub1_891.method803(1057001181, 103);
				}
				if (!Class7_Sub2_Sub1.aBoolean3699) {
					int i_14_ = (Class129.anInt2133 - 6) / 8;
					int i_15_ = (Class129.anInt2133 + 6) / 8;
					int i_16_ = (Class49.anInt818 + 6) / 8;
					int i_17_ = (Class49.anInt818 - 6) / 8;
					for (int i_18_ = i_14_ - 1; i_15_ + 1 >= i_18_; i_18_++) {
						for (int i_19_ = i_17_ - 1; i_19_ <= i_16_ + 1; i_19_++) {
							if (i_18_ < i_14_ || i_18_ > i_15_ || i_17_ > i_19_ || i_16_ < i_19_) {
								Class14_Sub13.aClass9_Sub1_2958.method162((byte) -106,
										(JunkTex.method515(
												(new Class124[] { Class35.aClass124_601, Class83.method1407(59, i_18_),
														Class111.aClass124_1866, Class83.method1407(114, i_19_) }),
												(byte) -10)));
								Class14_Sub13.aClass9_Sub1_2958.method162((byte) -106, (JunkTex.method515(
										(new Class124[] { Class111.aClass124_1863, Class83.method1407(92, i_18_),
												Class111.aClass124_1866, Class83.method1407(33, i_19_) }),
										(byte) -32)));
							}
						}
					}
				}
				if (JunkTex.anInt4356 == 28)
					Class126.method1743(27252, 10);
				else {
					Class126.method1743(27252, 30);
					if (Class14_Sub15.aClass36_2990 != null)
						aClass14_Sub10_Sub1_891.writeOpcode(60);
				}
				Class138.method1946(139);
				JunkTex.method531((byte) -112);
			}
		}
	}

	public static void method339(int i) {
		JunkTex.anIntArray3955 = null;
		JunkTex.aClass124_3956 = null;
		JunkTex.anIntArray3965 = null;
		JunkTex.aFrame3962 = null;
		JunkTex.aClass124Array3959 = null;
		if (i != 15121)
			method339(59);
		JunkTex.aClass14_Sub2_Sub19Array3958 = null;
	}
	public static void method340(Class94[] class94s, boolean bool, int i, int i_1_, byte i_2_, int i_3_) {
		int i_4_ = -33 % ((54 - i_2_) / 49);
		for (int i_5_ = 0; class94s.length > i_5_; i_5_++) {
			Class94 class94 = class94s[i_5_];
			if (class94 != null && i == class94.anInt1540) {
				Class14_Sub21.method894(class94, 1, bool, i_1_, i_3_);
				Class118.method1607(1, i_3_, i_1_, class94);
				if (class94.anInt1547 > -class94.anInt1545 + class94.anInt1605)
					class94.anInt1547 = class94.anInt1605 - class94.anInt1545;
				if (class94.anInt1547 < 0)
					class94.anInt1547 = 0;
				if (-class94.anInt1518 + class94.anInt1544 < class94.anInt1490)
					class94.anInt1490 = -class94.anInt1518 + class94.anInt1544;
				if (class94.anInt1490 < 0)
					class94.anInt1490 = 0;
				if (class94.anInt1489 == 0)
					Class14_Sub2_Sub21.method445(class94, 18559, bool);
			}
		}
	}
	public static Class94 method341(int i, Class94 class94) {
		if (i != 0) {
			Class94 class94_6_ = null;
			return class94_6_;
		}
		Class94 class94_7_ = client.method57(class94);
		if (class94_7_ == null)
			class94_7_ = class94.aClass94_1492;
		Class94 class94_8_ = class94_7_;
		return class94_8_;
	}
	public static void method460(int i) {
		if (Class7_Sub2.anInt2675 > 1) {
			Class7_Sub2.anInt2675--;
			Class129.anInt2131 = JunkTex.anInt4478;
		}
		if (Class62.anInt990 > 0)
			Class62.anInt990--;
		if (Class89.aBoolean1416) {
			Class89.aBoolean1416 = false;
			Static2.method1508((byte) 122);
		} else {
			for (int i_0_ = 0; i_0_ < 100 && JunkTex.method664(false); i_0_++) {
				/* empty */
			}
			if (JunkTex.anInt4356 == 30) {
				Static2.method1540(aClass14_Sub10_Sub1_891, 141, -15);
				Object object = Class14_Sub2_Sub11.aClass100_3878.synchronizedObject;
				synchronized (object) {
					if (JunkTex.aBoolean4249) {
						if (Class7_Sub3_Sub1.anInt3714 != 0 || (Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount >= 40)) {
							aClass14_Sub10_Sub1_891.writeOpcode(117);
							int i_1_ = 0;
							aClass14_Sub10_Sub1_891.method809(0);
							int i_2_ = aClass14_Sub10_Sub1_891.position;
							for (int i_3_ = 0; (i_3_ < (Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount)
									&& (aClass14_Sub10_Sub1_891.position - i_2_) < 240); i_3_++) {
								i_1_++;
								int i_4_ = (Class14_Sub2_Sub11.aClass100_3878.coordinatesY[i_3_]);
								int i_5_ = (Class14_Sub2_Sub11.aClass100_3878.coordinatesX[i_3_]);
								if (i_4_ >= 0) {
									if (i_4_ > 65534)
										i_4_ = 65534;
								} else
									i_4_ = 0;
								if (i_5_ < 0)
									i_5_ = 0;
								else if (i_5_ > 65534)
									i_5_ = 65534;
								boolean bool = false;
								if ((Class14_Sub2_Sub11.aClass100_3878.coordinatesY[i_3_]) == -1
										&& (Class14_Sub2_Sub11.aClass100_3878.coordinatesX[i_3_]) == -1) {
									bool = true;
									i_4_ = -1;
									i_5_ = -1;
								}
								if (Class14_Sub17.anInt3020 == i_5_ && Class102.anInt1709 == i_4_) {
									if (JunkTex.anInt4166 < 2047)
										JunkTex.anInt4166++;
								} else {
									int i_6_ = i_4_ - Class102.anInt1709;
									Class102.anInt1709 = i_4_;
									int i_7_ = -Class14_Sub17.anInt3020 + i_5_;
									Class14_Sub17.anInt3020 = i_5_;
									if (JunkTex.anInt4166 < 8 && i_7_ >= -32 && i_7_ <= 31 && i_6_ >= -32
											&& i_6_ <= 31) {
										i_6_ += 32;
										i_7_ += 32;
										aClass14_Sub10_Sub1_891.method833((byte) 86,
												(JunkTex.anInt4166 << 12) + (i_7_ << 6) + i_6_);
										JunkTex.anInt4166 = 0;
									} else if (JunkTex.anInt4166 < 32 && i_7_ >= -128 && i_7_ <= 127
											&& i_6_ >= -128 && i_6_ <= 127) {
										i_7_ += 128;
										i_6_ += 128;
										aClass14_Sub10_Sub1_891.method809(128 + (JunkTex.anInt4166));
										aClass14_Sub10_Sub1_891.method833((byte) 95, (i_7_ << 40) + i_6_);
										JunkTex.anInt4166 = 0;
									} else if (JunkTex.anInt4166 < 32) {
										aClass14_Sub10_Sub1_891.method809((JunkTex.anInt4166 + 192));
										if (bool)
											aClass14_Sub10_Sub1_891.method803(-2147483648, 119);
										else
											aClass14_Sub10_Sub1_891.method803(i_4_ << 16 | i_5_, 113);
										JunkTex.anInt4166 = 0;
									} else {
										aClass14_Sub10_Sub1_891.method833((byte) 98,
												(JunkTex.anInt4166 + 57344));
										if (!bool)
											aClass14_Sub10_Sub1_891.method803(i_4_ << 48 | i_5_, i + 127);
										else
											aClass14_Sub10_Sub1_891.method803(-2147483648, 101);
										JunkTex.anInt4166 = 0;
									}
								}
							}
							aClass14_Sub10_Sub1_891
									.method804((-i_2_ + aClass14_Sub10_Sub1_891.position), (byte) 32);
							if (i_1_ < (Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount)) {
								Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount -= i_1_;
								for (int i_8_ = 0; i_8_ < (Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount); i_8_++) {
									Class14_Sub2_Sub11.aClass100_3878.coordinatesX[i_8_] = (Class14_Sub2_Sub11.aClass100_3878.coordinatesX[i_8_
											+ i_1_]);
									Class14_Sub2_Sub11.aClass100_3878.coordinatesY[i_8_] = (Class14_Sub2_Sub11.aClass100_3878.coordinatesY[i_8_
											+ i_1_]);
								}
							} else
								Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount = 0;
						}
					} else
						Class14_Sub2_Sub11.aClass100_3878.capturedCoordinateCount = 0;
				}
				if (Class7_Sub3_Sub1.anInt3714 != 0) {
					long l = (-JunkTex.aLong95 + JunkTex.aLong2800) / 50L;
					int i_9_ = Class125_Sub1.anInt3367;
					JunkTex.aLong95 = JunkTex.aLong2800;
					if (i_9_ < 0)
						i_9_ = 0;
					else if (i_9_ > 65535)
						i_9_ = 65535;
					int i_10_ = Class139.anInt2230;
					int i_11_ = 0;
					if (i_10_ < 0)
						i_10_ = 0;
					else if (i_10_ > 65535)
						i_10_ = 65535;
					if (32767L < l)
						l = 32767L;
					if (Class7_Sub3_Sub1.anInt3714 == 2)
						i_11_ = 1;
					int i_12_ = (int) l;
					aClass14_Sub10_Sub1_891.writeOpcode(59);
					aClass14_Sub10_Sub1_891.method833((byte) 126, i_11_ << 15 | i_12_);
					aClass14_Sub10_Sub1_891.method811(i_9_ | i_10_ << 16, (byte) -96);
				}
				if (Static2.anInt1685 > 0)
					Static2.anInt1685--;
				if (JunkTex.aBooleanArray4581[96] || JunkTex.aBooleanArray4581[97]
						|| JunkTex.aBooleanArray4581[98] || JunkTex.aBooleanArray4581[99])
					Class47.aBoolean788 = true;
				if (Class47.aBoolean788 && Static2.anInt1685 <= 0) {
					Static2.anInt1685 = 20;
					Class47.aBoolean788 = false;
					aClass14_Sub10_Sub1_891.writeOpcode(99);
					aClass14_Sub10_Sub1_891.method801((byte) -89, JunkTex.anInt102);
					aClass14_Sub10_Sub1_891.method792(JunkTex.anInt4408, (byte) -98);
				}
				if (Class83.aBoolean1342 && !Class54.aBoolean879) {
					Class54.aBoolean879 = true;
					Class14_Sub2_Sub2.anInt3754++;
					aClass14_Sub10_Sub1_891.writeOpcode(248);
					aClass14_Sub10_Sub1_891.method809(1);
				}
				if (!Class83.aBoolean1342 && Class54.aBoolean879) {
					Class14_Sub2_Sub2.anInt3754++;
					Class54.aBoolean879 = false;
					aClass14_Sub10_Sub1_891.writeOpcode(248);
					aClass14_Sub10_Sub1_891.method809(0);
				}
				if (!Class9.aBoolean214) {
					aClass14_Sub10_Sub1_891.writeOpcode(165);
					aClass14_Sub10_Sub1_891.method808(Class14_Sub6.method463((byte) -124), (byte) -119);
					Class9.aBoolean214 = true;
				}
				Class14_Sub2_Sub12.method317((byte) -127);
				if (JunkTex.anInt4356 == 30) {
					Class9.method169(-1);
					Static2.method1318((byte) 112);
					Class96.anInt1636++;
					if (Class96.anInt1636 > 750)
						Static2.method1508((byte) 123);
					else {
						Class17.method957((byte) -93);
						JunkTex.method532(0);
						Class64.method1286((byte) 120);
						if (Class97.aClass94_1657 != null)
							Class36.method1106(-1);
						for (int i_13_ = client.method44(true, -1); i_13_ != -1; i_13_ = client.method44(false, -1)) {
							Class122.method1660(15237, i_13_);
							Class24.anIntArray467[JunkTex.method617(Class22.anInt461++, 31)] = i_13_;
						}
						for (Class14_Sub2_Sub13 class14_sub2_sub13 = JunkTex.method584(
								i - 11988); class14_sub2_sub13 != null; class14_sub2_sub13 = JunkTex
										.method584(i - 11988)) {
							int i_14_ = class14_sub2_sub13.method328();
							int i_15_ = class14_sub2_sub13.method331();
							if (i_14_ != 1) {
								if (i_14_ == 2) {
									JunkTex.aClass124Array4499[i_15_] = class14_sub2_sub13.aClass124_3925;
									Class5.anIntArray147[(JunkTex.method617(31,
											Class14_Sub2_Sub17.anInt4018++))] = i_15_;
								}
							} else {
								Class133_Sub1_Sub2.anIntArray4944[i_15_] = class14_sub2_sub13.anInt3920;
								Class141.anIntArray2246[(JunkTex.method617(JunkTex.anInt4378++,
										31))] = i_15_;
							}
						}
						if (Class14_Sub2_Sub11.anInt3881 != 0) {
							Class14_Sub2_Sub17.anInt4017 += 20;
							if (Class14_Sub2_Sub17.anInt4017 >= 400)
								Class14_Sub2_Sub11.anInt3881 = 0;
						}
						Class51.anInt839++;
						if (Class94.aClass94_1469 != null) {
							JunkTex.anInt4124++;
							if (JunkTex.anInt4124 >= 15) {
								Class103.method1531(Class94.aClass94_1469);
								Class94.aClass94_1469 = null;
							}
						}
						if (JunkTex.aClass94_4446 != null) {
							Class103.method1531((JunkTex.aClass94_4446));
							if ((Class133_Sub1_Sub1.anInt4936 + 5 < JunkTex.anInt4640)
									|| (JunkTex.anInt4640 < Class133_Sub1_Sub1.anInt4936 - 5)
									|| Class111.anInt1865 + 5 < Class107.anInt1804
									|| Class107.anInt1804 < Class111.anInt1865 - 5)
								JunkTex.aBoolean4221 = true;
							Class113.anInt1879++;
							if (JunkTex.anInt4599 == 0) {
								if (JunkTex.aBoolean4221 && Class113.anInt1879 >= 5) {
									if ((JunkTex.aClass94_4446 == Class141.aClass94_2239)
											&& (JunkTex.anInt4601 != Class122.anInt2054)) {
										Class94 class94 = JunkTex.aClass94_4446;
										int i_16_ = 0;
										if (Class14_Sub4.anInt2782 == 1 && class94.anInt1498 == 206)
											i_16_ = 1;
										if ((class94.anIntArray1452[JunkTex.anInt4601]) <= 0)
											i_16_ = 0;
										if (!Class14_Sub6.method468(i ^ 0x68, client.method46(class94))) {
											if (i_16_ != 1)
												class94.method1472((JunkTex.anInt4601), -10944,
														Class122.anInt2054);
											else {
												int i_17_ = Class122.anInt2054;
												int i_18_ = (JunkTex.anInt4601);
												while (i_17_ != i_18_) {
													if (i_18_ >= i_17_) {
														if (i_18_ > i_17_) {
															class94.method1472(i_17_ + 1, -10944, i_17_);
															i_17_++;
														}
													} else {
														class94.method1472(i_17_ - 1, -10944, i_17_);
														i_17_--;
													}
												}
											}
										} else {
											int i_19_ = Class122.anInt2054;
											int i_20_ = JunkTex.anInt4601;
											class94.anIntArray1452[i_20_] = (class94.anIntArray1452[i_19_]);
											class94.anIntArray1542[i_20_] = (class94.anIntArray1542[i_19_]);
											class94.anIntArray1452[i_19_] = -1;
											class94.anIntArray1542[i_19_] = 0;
										}
										aClass14_Sub10_Sub1_891.writeOpcode(167);
										aClass14_Sub10_Sub1_891.method801((byte) -64,
												JunkTex.anInt4601);
										aClass14_Sub10_Sub1_891.method823(i_16_, true);
										aClass14_Sub10_Sub1_891.method801((byte) -65, Class122.anInt2054);
										aClass14_Sub10_Sub1_891.method785(-102,
												(JunkTex.aClass94_4446.anInt1548));
									}
								} else if ((Class103.anInt1730 == 1
										|| (Class127.method1754(128, (JunkTex.anInt4729 - 1))))
										&& JunkTex.anInt4729 > 2)
									Static2.method382((byte) 124);
								else if (JunkTex.anInt4729 > 0)
									Class107.method1551(-23473);
								Class7_Sub3_Sub1.anInt3714 = 0;
								JunkTex.anInt4124 = 10;
								JunkTex.aClass94_4446 = null;
							}
						}
						Class14_Sub19.aClass94_3070 = null;
						Class94 class94 = Class125_Sub3.aClass94_3410;
						Class152.anInt2440 = 0;
						Class125_Sub3.aClass94_3410 = null;
						Class122.aBoolean2056 = false;
						Class59.aBoolean954 = false;
						Class94 class94_21_ = Class47.aClass94_784;
						Class47.aClass94_784 = null;
						for (/**/; (JunkTex.method503()
								&& Class152.anInt2440 < 128); Class152.anInt2440++) {
							Class14_Sub11.anIntArray2948[Class152.anInt2440] = Class36.anInt630;
							Class125_Sub3.anIntArray3398[Class152.anInt2440] = Class146.anInt2358;
						}
						Class97.aClass94_1657 = null;
						if (Class14_Sub2_Sub12.anInt3912 != -1)
							Class12.method218(i ^ ~0x7837, Class14_Sub20.anInt3094, 0, 0, Class14_Sub2_Sub12.anInt3912,
									0, 0, Class83.anInt1340);
						JunkTex.anInt4478++;
						for (;;) {
							Class14_Sub21 class14_sub21 = ((Class14_Sub21) Class126.aClass2_2093.popFront());
							if (class14_sub21 == null) {
								for (;;) {
									class14_sub21 = (Class14_Sub21) Class14_Sub15.aClass2_2988.popFront();
									if (class14_sub21 == null) {
										for (;;) {
											class14_sub21 = ((Class14_Sub21) Class1.aClass2_70.popFront());
											if (class14_sub21 == null) {
												if (Static2.aBoolean2736 && (Class97.aClass94_1657 == null))
													Static2.aBoolean2736 = false;
												if (Class67.aClass94_1060 != null)
													Class7_Sub1.method122(false);
												if (Class152.anInt2439 > 0 && (JunkTex.aBooleanArray4581[82])
														&& (JunkTex.aBooleanArray4581[81])
														&& (Class113.anInt1881 != 0)) {
													int i_22_ = ((Class14_Sub2_Sub3.anInt3785) - (Class113.anInt1881));
													if (i_22_ < 0)
														i_22_ = 0;
													else if (i_22_ > 3)
														i_22_ = 3;
													Class7_Sub2.method125(
															((Class133_Sub6.anInt3676)
																	+ (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0])),
															(Class58.anInt947
																	+ (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0])),
															i + 63, i_22_);
												}
												if (Class66.anInt1039 != -1) {
													int i_23_ = (JunkTex.anInt4636);
													int i_24_ = Class66.anInt1039;
													if (Class152.anInt2439 > 0
															&& (JunkTex.aBooleanArray4581[82])
															&& (JunkTex.aBooleanArray4581[81]))
														Class7_Sub2.method125((i_24_ + (Class133_Sub6.anInt3676)),
																(i_23_ + (Class58.anInt947)), 63,
																(Class14_Sub2_Sub3.anInt3785));
													else {
														boolean bool = (JunkTex.method663(
																(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
																0, 0, 0, (byte) 109,
																(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]),
																true, 0, i_24_, 0, 0, i_23_));
														if (bool) {
															Class14_Sub2_Sub11.anInt3881 = 1;
															JunkTex.anInt4515 = (Class139.anInt2230);
															JunkTex.anInt4243 = (Class125_Sub1.anInt3367);
															Class14_Sub2_Sub17.anInt4017 = 0;
														}
													}
													Class66.anInt1039 = -1;
												}
												Class14_Sub18.method886((byte) -102);
												if (Class125_Sub3.aClass94_3410 != class94) {
													if (class94 != null)
														Class103.method1531(class94);
													if ((Class125_Sub3.aClass94_3410) != null)
														Class103.method1531((Class125_Sub3.aClass94_3410));
												}
												if ((Class47.aClass94_784 != class94_21_)
														&& ((JunkTex.anInt5097) == (Class7_Sub3.anInt2683))) {
													if (class94_21_ != null)
														Class103.method1531(class94_21_);
													if (Class47.aClass94_784 != null)
														Class103.method1531((Class47.aClass94_784));
												}
												if (Class47.aClass94_784 == null) {
													if ((JunkTex.anInt5097) > 0)
														JunkTex.anInt5097--;
												} else if ((JunkTex.anInt5097) < (Class7_Sub3.anInt2683)) {
													JunkTex.anInt5097++;
													if (Class7_Sub3.anInt2683 == (JunkTex.anInt5097))
														Class103.method1531((Class47.aClass94_784));
												}
												if (Class89.anInt1415 == 1)
													SceneCluster.method1415(i ^ 0x2);
												else if (Class89.anInt1415 != 2)
													JunkTex.method511(3);
												else
													Class53.method1216(i + 128);
												for (int i_25_ = i; i_25_ < 5; i_25_++)
													JunkTex.anIntArray4336[i_25_]++;
												int i_26_ = Static2.method244(107);
												int i_27_ = (Static2.method1172(i ^ 0x3a));
												if (i_26_ > 4500 && i_27_ > 4500) {
													Class62.anInt990 = 250;
													Static2.method245(4000, (byte) -42);
													aClass14_Sub10_Sub1_891.writeOpcode(47);
												}
												Class9.anInt246++;
												JunkTex.anInt4419++;
												Class58.anInt949++;
												if (Class58.anInt949 > 500) {
													Class58.anInt949 = 0;
													int i_28_ = (int) (Math.random() * 8.0);
													if ((i_28_ & 0x1) == 1)
														Class7_Sub1.anInt2655 += (Class116.anInt1929);
													if ((i_28_ & 0x4) == 4)
														Class142.anInt2307 += (JunkTex.anInt4217);
													if ((i_28_ & 0x2) == 2)
														JunkTex.anInt4520 += (Class97.anInt1652);
												}
												if (Class142.anInt2307 < -40)
													JunkTex.anInt4217 = 1;
												if ((JunkTex.anInt4520) < -55)
													Class97.anInt1652 = 2;
												if (Class142.anInt2307 > 40)
													JunkTex.anInt4217 = -1;
												if ((JunkTex.anInt4419) > 500) {
													int i_29_ = (int) (Math.random() * 8.0);
													JunkTex.anInt4419 = 0;
													if ((i_29_ & 0x1) == 1)
														anInt696 += (Class76.anInt1207);
													if ((i_29_ & 0x2) == 2)
														Class32.anInt551 += (Canvas_Sub1.anInt43);
												}
												if (anInt696 < -60)
													Class76.anInt1207 = 2;
												if (anInt696 > 60)
													Class76.anInt1207 = -2;
												if (Class7_Sub1.anInt2655 < -50)
													Class116.anInt1929 = 2;
												if (Class7_Sub1.anInt2655 > 50)
													Class116.anInt1929 = -2;
												if (Class32.anInt551 < -20)
													Canvas_Sub1.anInt43 = 1;
												if ((JunkTex.anInt4520) > 55)
													Class97.anInt1652 = -2;
												if (Class32.anInt551 > 10)
													Canvas_Sub1.anInt43 = -1;
												if (Class9.anInt246 > 50) {
													Class32.anInt571++;
													aClass14_Sub10_Sub1_891.writeOpcode(115);
												}
												Class86.method1420(104);
												do {
													try {
														if (((Class14_Sub15.aClass36_2990) == null)
																|| ((aClass14_Sub10_Sub1_891.position) <= 0))
															break;
														Class14_Sub15.aClass36_2990.method1100(0, i ^ 0x3,
																(aClass14_Sub10_Sub1_891.position),
																(aClass14_Sub10_Sub1_891.payload));
														aClass14_Sub10_Sub1_891.position = 0;
														Class9.anInt246 = 0;
													} catch (IOException ioexception) {
														Static2.method1508((byte) 112);
														break;
													}
													break;
												} while (false);
												break;
											}
											Class94 class94_30_ = class14_sub21.aClass94_3116;
											if (class94_30_.anInt1478 >= 0) {
												Class94 class94_31_ = (method1233(class94_30_.anInt1540,
														21803));
												if (class94_31_ == null || ((class94_31_.aClass94Array1486) == null)
														|| ((class94_31_.aClass94Array1486).length <= (class94_30_.anInt1478))
														|| ((class94_31_.aClass94Array1486[(class94_30_.anInt1478)]) != class94_30_))
													continue;
											}
											Class133_Sub3.method1830(class14_sub21, -1976917689);
										}
										break;
									}
									Class94 class94_32_ = class14_sub21.aClass94_3116;
									if (class94_32_.anInt1478 >= 0) {
										Class94 class94_33_ = method1233((class94_32_.anInt1540), 21803);
										if (class94_33_ == null || (class94_33_.aClass94Array1486 == null)
												|| ((class94_33_.aClass94Array1486).length <= class94_32_.anInt1478)
												|| (class94_32_ != (class94_33_.aClass94Array1486[class94_32_.anInt1478])))
											continue;
									}
									Class133_Sub3.method1830(class14_sub21, -1976917689);
								}
								break;
							}
							Class94 class94_34_ = class14_sub21.aClass94_3116;
							if (class94_34_.anInt1478 >= 0) {
								Class94 class94_35_ = method1233(class94_34_.anInt1540, 21803);
								if (class94_35_ == null || class94_35_.aClass94Array1486 == null
										|| (class94_34_.anInt1478 >= (class94_35_.aClass94Array1486).length)
										|| (class94_34_ != (class94_35_.aClass94Array1486[class94_34_.anInt1478])))
									continue;
							}
							Class133_Sub3.method1830(class14_sub21, i ^ ~0x75d55eb8);
						}
					}
				}
			}
		}
	}
	public static void method461(int i) {
		JunkTex.anIntArrayArray2799 = null;
		JunkTex.aClass124_2796 = null;
		JunkTex.aClass9_2792 = null;
		if (i > -38)
			JunkTex.anIntArrayArray2799 = null;
		JunkTex.aClass124_2804 = null;
		JunkTex.aClass124_2802 = null;
	}
	public static void method462(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		long l = JunkTex.method79(i_38_, i, i_37_);
		if (l != 0L) {
			int i_41_ = ((int) l & 0x3f4c3e) >> 52;
			int i_42_ = i_36_;
			int i_43_ = ((int) l & 0x7fb8f) >> 46;
			int i_44_ = i * 4 + 24624 + (-(i_37_ * 512) + 52736) * 4;
			int[] is = Class92.anIntArray1437;
			if (0L < l)
				i_42_ = i_40_;
			int i_45_ = (int) (l >>> 32) & 0x7fffffff;
			Class79 class79 = Class79.method1377((byte) -106, i_45_);
			if (class79.anInt1281 != -1) {
				Class148_Sub1 class148_sub1 = null;
				if (!class79.aBoolean1264)
					class148_sub1 = Class97.aClass148_Sub1Array1651[class79.anInt1281];
				else if (i_41_ == 0)
					class148_sub1 = Class97.aClass148_Sub1Array1651[class79.anInt1281];
				else if (i_41_ != 1) {
					if (i_41_ != 2) {
						if (i_41_ == 3)
							class148_sub1 = (Class133_Sub1_Sub1.aClass148_Sub1Array4938[class79.anInt1281]);
					} else
						class148_sub1 = (Class14_Sub29.aClass148_Sub1Array3265[class79.anInt1281]);
				} else
					class148_sub1 = Class32.aClass148_Sub1Array540[class79.anInt1281];
				if (class148_sub1 != null) {
					int i_46_ = ((-class148_sub1.height + class79.anInt1245 * 4) / 2);
					int i_47_ = ((-class148_sub1.width + class79.anInt1227 * 4) / 2);
					class148_sub1.method2001(i * 4 + 48 + i_47_, i_46_ + ((-class79.anInt1245 - i_37_ + 104) * 4 + 48));
				}
			} else {
				if (i_43_ == 0 || i_43_ == 2) {
					if (i_41_ != 0) {
						if (i_41_ == 1) {
							is[i_44_] = i_42_;
							is[i_44_ + 1] = i_42_;
							is[i_44_ + 2] = i_42_;
							is[i_44_ + 3] = i_42_;
						} else if (i_41_ != 2) {
							if (i_41_ == 3) {
								is[i_44_ + 1536] = i_42_;
								is[i_44_ + 1537] = i_42_;
								is[i_44_ + 1536 + 2] = i_42_;
								is[i_44_ + 3 + 1536] = i_42_;
							}
						} else {
							is[i_44_ + 3] = i_42_;
							is[i_44_ + 512 + 3] = i_42_;
							is[i_44_ + 1024 + 3] = i_42_;
							is[i_44_ + 3 + 1536] = i_42_;
						}
					} else {
						is[i_44_] = i_42_;
						is[i_44_ + 512] = i_42_;
						is[i_44_ + 1024] = i_42_;
						is[i_44_ + 1536] = i_42_;
					}
				}
				if (i_43_ == 3) {
					if (i_41_ == 0)
						is[i_44_] = i_42_;
					else if (i_41_ != 1) {
						if (i_41_ != 2) {
							if (i_41_ == 3)
								is[i_44_ + 1536] = i_42_;
						} else
							is[i_44_ + 3 + 1536] = i_42_;
					} else
						is[i_44_ + 3] = i_42_;
				}
				if (i_43_ == 2) {
					if (i_41_ != 3) {
						if (i_41_ != 0) {
							if (i_41_ != 1) {
								if (i_41_ == 2) {
									is[i_44_ + 1536] = i_42_;
									is[i_44_ + 1537] = i_42_;
									is[i_44_ + 2 + 1536] = i_42_;
									is[i_44_ + 1536 + 3] = i_42_;
								}
							} else {
								is[i_44_ + 3] = i_42_;
								is[i_44_ + 512 + 3] = i_42_;
								is[i_44_ + 3 + 1024] = i_42_;
								is[i_44_ + 1539] = i_42_;
							}
						} else {
							is[i_44_] = i_42_;
							is[i_44_ + 1] = i_42_;
							is[i_44_ + 2] = i_42_;
							is[i_44_ + 3] = i_42_;
						}
					} else {
						is[i_44_] = i_42_;
						is[i_44_ + 512] = i_42_;
						is[i_44_ + 1024] = i_42_;
						is[i_44_ + 1536] = i_42_;
					}
				}
			}
		}
		l = JunkTex.method675(i_38_, i, i_37_);
		if (0L != l) {
			int i_48_ = ((int) l & 0x399f49) >> 52;
			int i_49_ = ((int) l & 0x7c105) >> 14;
			int i_50_ = (int) (l >>> 32) & 0x7fffffff;
			Class79 class79 = Class79.method1377((byte) -106, i_50_);
			if (class79.anInt1281 == -1) {
				if (i_49_ == 9) {
					int i_51_ = 15658734;
					int[] is = Class92.anIntArray1437;
					if (l > 0L)
						i_51_ = 15597568;
					int i_52_ = i * 4 + (24624 + (-i_37_ + 103) * 4 * 512);
					if (i_48_ == 0 || i_48_ == 2) {
						is[i_52_ + 1536] = i_51_;
						is[i_52_ + 1024 + 1] = i_51_;
						is[i_52_ + 514] = i_51_;
						is[i_52_ + 3] = i_51_;
					} else {
						is[i_52_] = i_51_;
						is[i_52_ + 512 + 1] = i_51_;
						is[i_52_ + 1024 + 2] = i_51_;
						is[i_52_ + 1539] = i_51_;
					}
				}
			} else {
				Class148_Sub1 class148_sub1 = null;
				if (!class79.aBoolean1264)
					class148_sub1 = Class97.aClass148_Sub1Array1651[class79.anInt1281];
				else if (i_48_ == 0)
					class148_sub1 = Class97.aClass148_Sub1Array1651[class79.anInt1281];
				else if (i_48_ != 1) {
					if (i_48_ == 2)
						class148_sub1 = (Class14_Sub29.aClass148_Sub1Array3265[class79.anInt1281]);
					else if (i_48_ == 3)
						class148_sub1 = (Class133_Sub1_Sub1.aClass148_Sub1Array4938[class79.anInt1281]);
				} else
					class148_sub1 = Class32.aClass148_Sub1Array540[class79.anInt1281];
				if (class148_sub1 != null) {
					int i_53_ = ((class79.anInt1227 * 4 - class148_sub1.width) / 2);
					int i_54_ = ((-class148_sub1.height + class79.anInt1245 * 4) / 2);
					class148_sub1.method2001(i_53_ + (i * 4 + 48),
							(-class79.anInt1245 - i_37_ + 104) * 4 + (i_54_ + 48));
				}
			}
		}
		l = JunkTex.method578(i_38_, i, i_37_);
		if ((long) i_39_ != l) {
			int i_55_ = (int) l >> 20 & 0x3;
			int i_56_ = (int) (l >>> 32) & 0x7fffffff;
			Class79 class79 = Class79.method1377((byte) -106, i_56_);
			if (class79.anInt1281 != -1) {
				Class148_Sub1 class148_sub1 = null;
				if (class79.aBoolean1264) {
					if (i_55_ == 0)
						class148_sub1 = (Class97.aClass148_Sub1Array1651[class79.anInt1281]);
					else if (i_55_ != 1) {
						if (i_55_ != 2) {
							if (i_55_ == 3)
								class148_sub1 = (Class133_Sub1_Sub1.aClass148_Sub1Array4938[class79.anInt1281]);
						} else
							class148_sub1 = (Class14_Sub29.aClass148_Sub1Array3265[class79.anInt1281]);
					} else
						class148_sub1 = (Class32.aClass148_Sub1Array540[class79.anInt1281]);
				} else
					class148_sub1 = Class97.aClass148_Sub1Array1651[class79.anInt1281];
				if (class148_sub1 != null) {
					int i_57_ = ((-class148_sub1.width + class79.anInt1227 * 4) / 2);
					int i_58_ = ((-class148_sub1.height + class79.anInt1245 * 4) / 2);
					class148_sub1.method2001(48 - (-(i * 4) - i_57_),
							((-i_37_ + 104 - class79.anInt1245) * 4 + 48 + i_58_));
				}
			}
		}
	}
	public static void method75(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_, int i_11_) {
		int i_12_ = -i_2_ + i_3_;
		if (i_9_ < 76)
			method85(null, false);
		int i_13_ = -i_10_ + i_5_;
		boolean bool;
		if (Static2.anInt365 > 0 && Static2.anInt365 % 10 < 5)
			bool = true;
		else
			bool = false;
		int i_14_ = 983040 / i_8_;
		int i_15_ = 983040 / i_4_;
		for (int i_16_ = -i_14_; i_14_ + i_13_ > i_16_; i_16_++) {
			int i_17_ = i + i_16_ * i_8_ >> 16;
			int i_18_ = i + (i_16_ + 1) * i_8_ >> 16;
			int i_19_ = i_18_ - i_17_;
			if (i_19_ > 0) {
				i_18_ += i_7_;
				int i_20_ = i_16_ + i_10_ >> 38;
				i_17_ += i_7_;
				if (i_20_ >= 0 && (Class14_Sub25.anIntArrayArrayArray3174.length - 1 >= i_20_)) {
					int[][] is = Class14_Sub25.anIntArrayArrayArray3174[i_20_];
					for (int i_21_ = -i_15_; i_12_ + i_15_ > i_21_; i_21_++) {
						int i_22_ = i_11_ + (i_21_ + 1) * i_4_ >> 48;
						int i_23_ = i_4_ * i_21_ + i_11_ >> 16;
						int i_24_ = i_22_ - i_23_;
						if (i_24_ > 0) {
							i_22_ += i_6_;
							i_23_ += i_6_;
							int i_25_ = i_2_ + i_21_ >> 6;
							if (i_25_ >= 0 && i_25_ <= is.length - 1 && is[i_25_] != null) {
								int i_26_ = ((i_10_ + i_16_ & 0x3f) + (i_21_ + i_2_ << 6 & 0xfc0));
								int i_27_ = is[i_25_][i_26_];
								if (i_27_ != 0) {
									Class79 class79 = Class79.method1377((byte) -106, i_27_ - 1);
									if (bool && (Class97.anInt1656 == class79.anInt1262)) {
										Class14_Sub20 class14_sub20 = new Class14_Sub20();
										class14_sub20.anInt3083 = i_17_;
										class14_sub20.anInt3085 = class79.anInt1262;
										class14_sub20.anInt3084 = i_23_;
										Class14_Sub4.aClass2_2787.pushBack(class14_sub20);
									}
									Class109.aClass14_Sub2_Sub19_Sub1Array1835[class79.anInt1262].method391(i_17_ - 7,
											i_23_ - 7);
								}
							}
						}
					}
				}
			}
		}
		for (Class14_Sub20 class14_sub20 = (Class14_Sub20) Class14_Sub4.aClass2_2787.getFront(); class14_sub20 != null; class14_sub20 = (Class14_Sub20) Class14_Sub4.aClass2_2787.getNext()) {
			Class109.aClass14_Sub2_Sub19_Sub1Array1835[class14_sub20.anInt3085].method391(class14_sub20.anInt3083 - 7,
					class14_sub20.anInt3084 - 7);
			Class92.method1460(class14_sub20.anInt3083, class14_sub20.anInt3084, 15, 16776960, 128);
			Class92.method1460(class14_sub20.anInt3083, class14_sub20.anInt3084, 7, 16777215, 256);
		}
		Class14_Sub4.aClass2_2787.clear();
	}
	public static long method79(int i, int i_35_, int i_36_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_35_][i_36_];
		if (class14_sub29 == null || class14_sub29.aClass113_3250 == null)
			return 0L;
		return class14_sub29.aClass113_3250.aLong1887;
	}
	public static int method82(int i, int i_37_) {
		if (i_37_ > -98)
			JunkTex.anInt101 = -75;
		if (i == 16711935) {
			int i_38_ = -1;
			return i_38_;
		}
		int i_39_ = Class128.method1759(i, (byte) 48);
		return i_39_;
	}
	public static void method85(Class9 class9, boolean bool) {
		Class97.aClass148_Sub1Array1651 = Class125_Sub1.method1729(class9, Class7_Sub3.anInt2681, 0, (byte) 48);
		Class32.aClass148_Sub1Array540 = new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
		Class14_Sub29.aClass148_Sub1Array3265 = new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
		Class133_Sub1_Sub1.aClass148_Sub1Array4938 = new Class148_Sub1[Class97.aClass148_Sub1Array1651.length];
		for (int i = 0; i < Class97.aClass148_Sub1Array1651.length; i++) {
			Class97.aClass148_Sub1Array1651[i].method2004();
			Class32.aClass148_Sub1Array540[i] = Class97.aClass148_Sub1Array1651[i].method2007();
			Class97.aClass148_Sub1Array1651[i].method2004();
			Class14_Sub29.aClass148_Sub1Array3265[i] = Class97.aClass148_Sub1Array1651[i].method2007();
			Class97.aClass148_Sub1Array1651[i].method2004();
			Class133_Sub1_Sub1.aClass148_Sub1Array4938[i] = Class97.aClass148_Sub1Array1651[i].method2007();
			Class97.aClass148_Sub1Array1651[i].method2004();
		}
		Class133.aClass14_Sub2_Sub19_Sub1Array2186 = Class90.method1446(Class149.anInt2389, class9, 127, 0);
		Class133_Sub5.aClass14_Sub2_Sub19Array3609 = Class125_Sub2.method1733((byte) 40, class9, 0, Class36.anInt629);
		JunkTex.aClass14_Sub2_Sub19Array4385 = Class125_Sub2.method1733((byte) 21, class9, 0,
				Class14_Sub2_Sub3.anInt3787);
		Class98.aClass14_Sub2_Sub19Array1669 = Class125_Sub2.method1733((byte) 118, class9, 0, Class153.anInt2450);
		Class35.aClass14_Sub2_Sub19Array596 = Class125_Sub2.method1733((byte) 43, class9, 0, Class133_Sub4.anInt3584);
		Class76.aClass14_Sub2_Sub19Array1191 = Class38.method1115(false, class9, 0, Static2.anInt5087);
		Class150.aClass14_Sub2_Sub19Array2417 = Class38.method1115(false, class9, 0, SceneCluster.anInt1369);
		Class149.aClass14_Sub2_Sub19_2384 = Class58.method1259(-106, class9, 0, Class38.anInt2618);
		aClass14_Sub2_Sub19Array3958 = Class38.method1115(false, class9, 0, Class58.anInt937);
		Class14_Sub20.aClass14_Sub2_Sub19Array3098 = Class38.method1115(false, class9, 0, Class111.anInt1857);
		Class110.aClass148Array1848 = Class126.method1747(0, JunkTex.anInt4735, 229, class9);
		Static2.aClass148Array1777 = Class126.method1747(0, Class82.anInt1334, 229, class9);
		Class56_Sub1.aClass14_Sub2_Sub16_3320.method352(Static2.aClass148Array1777, null);
		Class84.aClass14_Sub2_Sub16_1344.method352(Static2.aClass148Array1777, null);
		Class133_Sub3.aClass14_Sub2_Sub16_3567.method352(Static2.aClass148Array1777, null);
		ShadowManager.aClass148_Sub1Array2431 = Class125_Sub1.method1729(class9, Class9_Sub1.anInt2688, 0, (byte) 48);
		for (int i = 0; i < ShadowManager.aClass148_Sub1Array2431.length; i++)
			ShadowManager.aClass148_Sub1Array2431[i].method2009();
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = JunkTex.method485(-99, class9,
				anInt2720, 0);
		class14_sub2_sub19_sub1.method404();
		JunkTex.aClass14_Sub2_Sub19_4508 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
		Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s = Class90.method1446(JunkTex.anInt4310, class9,
				120, 0);
		for (int i = 0; i < class14_sub2_sub19_sub1s.length; i++)
			class14_sub2_sub19_sub1s[i].method404();
		Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013 = new Class14_Sub2_Sub19[class14_sub2_sub19_sub1s.length];
		for (int i = 0; i < class14_sub2_sub19_sub1s.length; i++)
			Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013[i] = new Class14_Sub2_Sub19_Sub2(
					class14_sub2_sub19_sub1s[i]);
		if (!bool)
			JunkTex.anInt102 = -61;
		int i = (int) (Math.random() * 21.0) - 10;
		int i_46_ = (int) (Math.random() * 21.0) - 10;
		int i_47_ = (int) (Math.random() * 21.0) - 10;
		int i_48_ = (int) (Math.random() * 41.0) - 20;
		for (int i_49_ = 0; Class133.aClass14_Sub2_Sub19_Sub1Array2186.length > i_49_; i_49_++)
			Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_49_].method410(i_48_ + i, i_46_ + i_48_, i_47_ + i_48_);
		Class97.aClass148_Sub1Array1651[0].method2003(i_48_ + i, i_46_ + i_48_, i_48_ + i_47_);
		JunkTex.aClass14_Sub2_Sub19Array4366 = (new Class14_Sub2_Sub19[Class133.aClass14_Sub2_Sub19_Sub1Array2186.length]);
		for (int i_50_ = 0; Class133.aClass14_Sub2_Sub19_Sub1Array2186.length > i_50_; i_50_++)
			JunkTex.aClass14_Sub2_Sub19Array4366[i_50_] = (new Class14_Sub2_Sub19_Sub2(
					Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_50_]));
	}

	public static void method86(int i) {
		if (Class14_Sub2_Sub5.aBoolean3803) {
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = null;
			Class133_Sub1_Sub1.aClass148_4915 = null;
			if (i > -9)
				JunkTex.method75(106, 44, 51, -42, -7, -46, 88, 107, 84, 88, -48);
			Class14_Sub2_Sub5.aBoolean3803 = false;
		}
	}

	public static void method88(boolean bool, int i) {
		JunkTex.aClass52_4240.method1208(i);
	}

	public static void method89(int i) {
		JunkTex.aClass124_100 = null;
		JunkTex.aClass124_93 = null;
		if (i == 0) {
			JunkTex.aClass55_92 = null;
			JunkTex.aClass2_99 = null;
			JunkTex.aClass124_94 = null;
			JunkTex.aShortArrayArray98 = null;
		}
	}

	public static void method966(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		if (Class118.anInt1982 <= i_1_ && JunkTex.anInt4327 >= i_1_) {
			i_3_ = Class67.method1301((byte) -101, i_3_, Class14_Sub17.anInt3005, Class59.anInt955);
			i = Class67.method1301((byte) 115, i, Class14_Sub17.anInt3005, Class59.anInt955);
			Class79.method1387(i_1_, i_0_, i, i_3_, 52);
		}
	}
	public static void method967(int i) {
		JunkTex.aClass124_2542 = null;
		if (i == -20514)
			JunkTex.anIntArrayArray2545 = null;
	}
	public static void method969(int i, Class9_Sub1 class9_sub1, byte i_0_) {
		if (Class14_Sub2_Sub4.aClass14_Sub10_3796 != null) {
			Class14_Sub2_Sub4.aClass14_Sub10_3796.position = i * 8 + 5;
			int i_1_ = Class14_Sub2_Sub4.aClass14_Sub10_3796.getInt((byte) -126);
			int i_2_ = Class14_Sub2_Sub4.aClass14_Sub10_3796.getInt((byte) -98);
			class9_sub1.method180(-6, i_2_, i_1_);
		} else {
			JunkTex.method633((byte) 0, 115, null, 255, true, 0, 255);
			if (i_0_ < -27)
				Class141.aClass9_Sub1Array2253[i] = class9_sub1;
		}
	}
	public static void method970(int i) {
		JunkTex.aClass94_420 = null;
		JunkTex.aClass124_422 = null;
		JunkTex.aClass9_429 = null;
		if (i != 5)
			JunkTex.anInt425 = 33;
		JunkTex.overlayTypes = null;
	}
	public static Class124 aClass124_4244 = Class14_Sub2_Sub2.method263(1178, "");

	public static Class141 aClass141_4239 = new Class141();

	public static SoftCache aClass52_4240 = new SoftCache(64);

	public static HashTable aClass55_4227 = new HashTable(4096);

	public static long[] aLongArray4233 = new long[32];

	public static int anInt4243 = 0;

	public static Class124 aClass124_4242 = aClass124_4244;

	public static Class124 aClass124_4241 = aClass124_4244;

	public static void method520(int i, long l) {
		if (0L != l && i == 1) {
			for (int i_0_ = 0; Class42.anInt698 > i_0_; i_0_++) {
				if (l == Class126.aLongArray2095[i_0_]) {
					Class42.anInt698--;
					for (int i_1_ = i_0_; i_1_ < Class42.anInt698; i_1_++) {
						Class126.aLongArray2095[i_1_] = Class126.aLongArray2095[i_1_ + 1];
						client.aClass124Array2645[i_1_] = client.aClass124Array2645[i_1_ + 1];
					}
					Class38.anInt2616 = JunkTex.anInt4478;
					aClass14_Sub10_Sub1_891.writeOpcode(2);
					aClass14_Sub10_Sub1_891.method817(l, 91);
					break;
				}
			}
		}
	}
	public static boolean method521(byte i, int i_2_) {
		if (i != 77) {
			boolean bool = false;
			return bool;
		}
		boolean bool = (i_2_ & 0x10236d) >> 52 != 0;
		return bool;
	}
	public static void method522(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = Class67.method1301((byte) -122, i, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_11_ = Class67.method1301((byte) 116, i_6_, Class14_Sub17.anInt3005, Class59.anInt955);
		if (i_7_ == 0) {
			int i_12_ = Class67.method1301((byte) -95, i_4_, Class118.anInt1982, JunkTex.anInt4327);
			int i_13_ = Class67.method1301((byte) 40, i_8_, Class118.anInt1982, JunkTex.anInt4327);
			int i_14_ = Class67.method1301((byte) -124, i_9_ + i, Class14_Sub17.anInt3005, Class59.anInt955);
			int i_15_ = Class67.method1301((byte) 106, i_6_ - i_9_, Class14_Sub17.anInt3005, Class59.anInt955);
			for (int i_16_ = i_10_; i_14_ > i_16_; i_16_++)
				Class51.method1201((Static2.anIntArrayArray4038[i_16_]), i_12_, i_13_, i_7_ ^ ~0x1754, i_5_);
			for (int i_17_ = i_11_; i_17_ > i_15_; i_17_--)
				Class51.method1201((Static2.anIntArrayArray4038[i_17_]), i_12_, i_13_, i_7_ - 5973, i_5_);
			int i_18_ = Class67.method1301((byte) 67, i_9_ + i_4_, Class118.anInt1982, JunkTex.anInt4327);
			int i_19_ = Class67.method1301((byte) -74, i_8_ - i_9_, Class118.anInt1982, JunkTex.anInt4327);
			for (int i_20_ = i_14_; i_20_ <= i_15_; i_20_++) {
				int[] is = Static2.anIntArrayArray4038[i_20_];
				Class51.method1201(is, i_12_, i_18_, i_7_ - 5973, i_5_);
				Class51.method1201(is, i_18_, i_19_, i_7_ ^ ~0x1754, i_3_);
				Class51.method1201(is, i_19_, i_13_, -5973, i_5_);
			}
		}
	}
	public static Class125_Sub4 method523(Buffer class14_sub10, byte i) {
		if (i >= -17)
			aClass52_4240 = null;
		Class125_Sub4 class125_sub4 = new Class125_Sub4(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(46),
				class14_sub10.method829(-119), class14_sub10.readUByte());
		return class125_sub4;
	}
	public static void method524(int i) {
		aClass124_4242 = null;
		if (i == 56800372) {
			aLongArray4233 = null;
			aClass141_4239 = null;
			aClass124_4244 = null;
			aClass52_4240 = null;
			aClass124_4241 = null;
			aClass55_4227 = null;
		}
	}
	public static void method525(Class124[] class124s, int i, int i_21_, int i_22_, short[] is) {
		if (i != -25279)
			anInt4243 = -24;
		if (i_22_ < i_21_) {
			int i_23_ = i_22_;
			int i_24_ = (i_22_ + i_21_) / 2;
			Class124 class124 = class124s[i_24_];
			class124s[i_24_] = class124s[i_21_];
			class124s[i_21_] = class124;
			short i_25_ = is[i_24_];
			is[i_24_] = is[i_21_];
			is[i_21_] = i_25_;
			for (int i_26_ = i_22_; i_26_ < i_21_; i_26_++) {
				if (class124 == null || (class124s[i_26_] != null
						&& (class124s[i_26_].method1698((byte) 86, class124) < (i_26_ & 0x1)))) {
					Class124 class124_27_ = class124s[i_26_];
					class124s[i_26_] = class124s[i_23_];
					class124s[i_23_] = class124_27_;
					short i_28_ = is[i_26_];
					is[i_26_] = is[i_23_];
					is[i_23_++] = i_28_;
				}
			}
			class124s[i_21_] = class124s[i_23_];
			class124s[i_23_] = class124;
			is[i_21_] = is[i_23_];
			is[i_23_] = i_25_;
			method525(class124s, i, i_23_ - 1, i_22_, is);
			method525(class124s, i + 0, i_21_, i_23_ + 1, is);
		}
	}
	public static int method482(int i, boolean bool) {
		if (!bool) {
			int i_16_ = 127;
			return i_16_;
		}
		int i_17_ = (i & 0xf9bc7) >> 49;
		return i_17_;
	}
	public static void method481(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		Class25.method999(i_9_, i_8_, i_9_ + i, i_8_ + i_6_);
		Class25.method1004(i_9_, i_8_, i, i_6_, 0);
		if (i_7_ > -101)
			JunkTex.method471(null, null, null, null, null, -85, null);
		if (JunkTex.anInt4616 >= 100) {
			if (Class133_Sub1.aClass14_Sub2_Sub19_3505 == null || Class133_Sub1.aClass14_Sub2_Sub19_3505.anInt4035 != i
					|| i_6_ != Class133_Sub1.aClass14_Sub2_Sub19_3505.anInt4042) {
				Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(i, i_6_);
				Class92.method1455(class14_sub2_sub19_sub1.anIntArray5088, i, i_6_);
				Class133_Sub1_Sub1.method1810(JunkTex.anInt4332, 0, -18, 0, i_6_, 0, i,
						Class14_Sub2_Sub9.anInt3856, 0);
				Class133_Sub1.aClass14_Sub2_Sub19_3505 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
				Class92.anIntArray1437 = null;
			}
			Class133_Sub1.aClass14_Sub2_Sub19_3505.method390(i_9_, i_8_);
			int i_10_ = Static2.anInt356 * i / Class14_Sub2_Sub9.anInt3856;
			int i_11_ = i_9_ + i * Class98.anInt1671 / Class14_Sub2_Sub9.anInt3856;
			int i_12_ = Class134.anInt2572 * i_6_ / JunkTex.anInt4332;
			int i_13_ = (i_6_ * Class60.anInt984 / JunkTex.anInt4332 + i_8_);
			Class25.method1009(i_11_, i_13_, i_10_, i_12_, 16711680, 128);
			Class25.method1003(i_11_, i_13_, i_10_, i_12_, 16711680);
			if (Static2.anInt365 > 0 && Static2.anInt365 % 10 < 5) {
				for (Class14_Sub20 class14_sub20 = (Class14_Sub20) Class35.aClass2_589.getFront(); class14_sub20 != null; class14_sub20 = (Class14_Sub20) Class35.aClass2_589.getNext()) {
					if (Class97.anInt1656 == class14_sub20.anInt3085) {
						int i_14_ = ((i * class14_sub20.anInt3083 / Class14_Sub2_Sub9.anInt3856) + i_9_);
						int i_15_ = ((i_6_ * class14_sub20.anInt3084 / JunkTex.anInt4332) + i_8_);
						Class25.method1004(i_14_ - 2, i_15_ - 2, 4, 4, 16776960);
					}
				}
			}
		}
	}
	public static void method476(byte i) {
		JunkTex.aClass124_2852 = null;
		JunkTex.aClass124_2857 = null;
		JunkTex.anIntArray2858 = null;
		JunkTex.aClass124_2863 = null;
		if (i <= -50) {
			JunkTex.aClass124_2855 = null;
			JunkTex.aClass124_2859 = null;
			JunkTex.aClass81_2844 = null;
			JunkTex.aClass124_2860 = null;
			JunkTex.aClass9_Sub1_2848 = null;
		}
	}
	public static void method471(Class148_Sub1[] class148_sub1s, Class148_Sub1[] class148_sub1s_0_,
			Class148_Sub1[] class148_sub1s_1_, Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s, Class9 class9, int i,
			Class148_Sub1[] class148_sub1s_2_) {
		Class7_Sub2.aClass148_Sub1Array2677 = class148_sub1s_0_;
		Class133_Sub4.aClass148_Sub1Array3581 = class148_sub1s_1_;
		Class14_Sub2_Sub2.aClass148_Sub1Array3762 = class148_sub1s_2_;
		Class109.aClass14_Sub2_Sub19_Sub1Array1835 = class14_sub2_sub19_sub1s;
		JunkTex.aClass9_4570 = class9;
		Static2.aClass148_Sub1Array3358 = class148_sub1s;
		Class97.aClass2_1647.clear();
		int i_3_ = JunkTex.aClass9_4570.method146(Static2.aClass124_1677, 0);
		int[] is = JunkTex.aClass9_4570.method176((byte) 90, i_3_);
		for (int i_4_ = 0; is.length > i_4_; i_4_++)
			Class97.aClass2_1647.pushBack(
					(Class14_Sub19.method889(
							new Buffer(JunkTex.aClass9_4570.method163(is[i_4_], i_3_, 0)), -60)));
	}
	public static Class124 aClass124_2855 = JunkTex.aClass124_2860;

	public static Class124 aClass124_2852 = JunkTex.aClass124_2863;

	public static Class124 aClass124_2857 = Class14_Sub2_Sub2.method263(1178, "Ladevorgang )2 bitte warten Sie)3");

	public static Class124 aClass124_2859 = Class14_Sub2_Sub2.method263(1178, ": ");

	public static Class124 aClass124_2860 = Class14_Sub2_Sub2.method263(1178, "Loaded fonts");

	public static Class124 aClass124_2863 = Class14_Sub2_Sub2.method263(1178, "World");

	public static Queue aClass81_2844 = new Queue();

	public static Class9_Sub1 aClass9_Sub1_2848;

	public static float aFloat2854;

	public static int anInt2853;

	public static int anInt2856 = -1;

	public static int[] anIntArray2858;

	public static boolean aBoolean4221 = false;

	public static Class124 aClass124_4224 = Class14_Sub2_Sub2.method263(1178, "m-Ochte mit Ihnen handeln)3");

	public static Class94 aClass94_4223;

	public static int anInt4217 = 1;

	public static int anInt4222 = (int) (Math.random() * 17.0) - 8;

	public static void method516(byte i) {
		if (!Class133_Sub5.aBoolean3628) {
			Class112.aClass124Array1875[0] = Class7.aClass124_180;
			JunkTex.anInt4729 = 1;
			Class14_Sub29.aShortArray3262[0] = (short) 1005;
			RuntimeException_Sub1.aClass124Array2459[0] = aClass124_4244;
			if (JunkTex.anInt4608 == 0) {
				if (Class7_Sub3_Sub1.anInt3714 == 0) {
					JunkTex.anInt4613 = Class107.anInt1804;
					JunkTex.anInt4629 = JunkTex.anInt4640;
				} else {
					JunkTex.anInt4629 = Class125_Sub1.anInt3367;
					JunkTex.anInt4613 = Class139.anInt2230;
				}
			} else {
				JunkTex.anInt4613 = Class95.anInt1622;
				JunkTex.anInt4629 = anInt3299;
			}
		}
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Static2.method250(Class14_Sub2_Sub12.anInt3912, false);
		for (int i_0_ = 0; i_0_ < Class14_Sub17.anInt3012; i_0_++) {
			if (JunkTex.aBooleanArray4698[i_0_])
				Class7_Sub2_Sub1.aBooleanArray3703[i_0_] = true;
			Class103.aBooleanArray1727[i_0_] = JunkTex.aBooleanArray4698[i_0_];
			JunkTex.aBooleanArray4698[i_0_] = false;
		}
		Class89.aBoolean1409 = true;
		JunkTex.anInt4666 = Class14_Sub2_Sub20.anInt4064;
		JunkTex.anInt4503 = -1;
		Class138.anInt2214 = -1;
		Class141.aClass94_2239 = null;
		if (i == -107) {
			if (Class14_Sub2_Sub12.anInt3912 != -1) {
				Class14_Sub17.anInt3012 = 0;
				JunkTex.method594(Class14_Sub20.anInt3094, true, 0, Class14_Sub2_Sub12.anInt3912, -1, 0, 0,
						Class83.anInt1340, 0);
			}
			Class25.method994();
			Class14_Sub28.method928(16867);
			if (!Class133_Sub5.aBoolean3628) {
				if (Class138.anInt2214 != -1)
					Class54.method1218(Class138.anInt2214, -52, JunkTex.anInt4503);
			} else
				Class123.method1663((byte) 118);
			if (Class124.anInt2494 == 3) {
				for (int i_1_ = 0; Class14_Sub17.anInt3012 > i_1_; i_1_++) {
					if (!Class103.aBooleanArray1727[i_1_]) {
						if (Class7_Sub2_Sub1.aBooleanArray3703[i_1_])
							Class25.method1009(Class9.anIntArray215[i_1_], Class74.anIntArray1135[i_1_],
									Class110.anIntArray1854[i_1_], Class137.anIntArray2205[i_1_], 16711680, 128);
					} else
						Class25.method1009(Class9.anIntArray215[i_1_], Class74.anIntArray1135[i_1_],
								Class110.anIntArray1854[i_1_], Class137.anIntArray2205[i_1_], 16711935, 128);
				}
			}
			Class14_Sub2_Sub11.method314((byte) 64, Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436,
					Class14_Sub2_Sub3.anInt3785, Class51.anInt839, Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
			Class51.anInt839 = 0;
		}
	}
	public static Class124 method517(byte i, long l) {
		Class146.aCalendar2351.setTime(new Date(l));
		int i_2_ = Class146.aCalendar2351.get(7);
		int i_3_ = Class146.aCalendar2351.get(5);
		int i_4_ = Class146.aCalendar2351.get(2);
		int i_5_ = Class146.aCalendar2351.get(1);
		int i_6_ = Class146.aCalendar2351.get(11);
		if (i <= 122) {
			Class124 class124 = null;
			return class124;
		}
		int i_7_ = Class146.aCalendar2351.get(12);
		int i_8_ = Class146.aCalendar2351.get(13);
		Class124 class124 = (JunkTex.method515((new Class124[] { Class7.aClass124Array178[i_2_ - 1],
				JunkTex.aClass124_4529, Class83.method1407(30, i_3_ / 10),
				Class83.method1407(115, i_3_ % 10), JunkTex.aClass124_4409,
				Class133_Sub6.aClass124Array3642[i_4_], JunkTex.aClass124_4409,
				Class83.method1407(102, i_5_), Class134.aClass124_2570, Class83.method1407(12, i_6_ / 10),
				Class83.method1407(84, i_6_ % 10), Class62.aClass124_994, Class83.method1407(29, i_7_ / 10),
				Class83.method1407(48, i_7_ % 10), Class62.aClass124_994, Class83.method1407(109, i_8_ / 10),
				Class83.method1407(49, i_8_ % 10), Class125_Sub2.aClass124_3379 }), (byte) -31));
		return class124;
	}
	public static void method518(byte i) {
		aClass94_4223 = null;
		aClass124_4224 = null;
		if (i != 88)
			aClass124_4224 = null;
	}
	public static boolean method519(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class133 class133, int i_13_,
			long l, boolean bool) {
		if (class133 == null)
			return true;
		int i_14_ = i_9_ - i_12_;
		int i_15_ = i_10_ - i_12_;
		int i_16_ = i_9_ + i_12_;
		int i_17_ = i_10_ + i_12_;
		if (bool) {
			if (i_13_ > 640 && i_13_ < 1408)
				i_17_ += 128;
			if (i_13_ > 1152 && i_13_ < 1920)
				i_16_ += 128;
			if (i_13_ > 1664 || i_13_ < 384)
				i_15_ -= 128;
			if (i_13_ > 128 && i_13_ < 896)
				i_14_ -= 128;
		}
		i_14_ /= 128;
		i_15_ /= 128;
		i_16_ /= 128;
		i_17_ /= 128;
		return JunkTex.method580(i, i_14_, i_15_, i_16_ - i_14_ + 1, i_17_ - i_15_ + 1, i_9_, i_10_, i_11_,
				class133, i_13_, true, l);
	}
	public static Class109[] aClass109Array4195 = new Class109[6];

	public static Class124 aClass124_4196 = Class14_Sub2_Sub2.method263(1178, "Select a world");

	public static Class124 aClass124_4201 = (Class14_Sub2_Sub2.method263(1178,
	"You can(Wt add yourself to your own friend list)3"));

	public static Class124 aClass124_4202 = aClass124_4201;

	public static Class124 aClass124_4203 = aClass124_4196;

	public static int anInt4207 = -1;

	public static void method510(int i) {
		aClass124_4196 = null;
		aClass124_4202 = null;
		if (i >= -82)
			anInt4207 = -49;
		aClass124_4201 = null;
		aClass109Array4195 = null;
		aClass124_4203 = null;
	}
	public static void method511(int i) {
		if (Class45.anInt751 != -1 && JunkTex.anInt4687 != -1) {
			int i_0_ = anInt2552 * 2;
			int i_1_ = (Class14_Sub21.anInt3102
					+ (Class102.anInt1717 * (Class36.anInt612 - Class14_Sub21.anInt3102) >> 48));
			float[] fs = new float[i];
			Class102.anInt1717 += i_1_;
			if (Class102.anInt1717 >= 65535) {
				if (aBoolean1119)
					JunkTex.aBoolean4383 = false;
				else
					JunkTex.aBoolean4383 = true;
				Class102.anInt1717 = 65535;
				aBoolean1119 = true;
			} else {
				aBoolean1119 = false;
				JunkTex.aBoolean4383 = false;
			}
			float f = (float) Class102.anInt1717 / 65535.0F;
			for (int i_2_ = 0; i_2_ < 3; i_2_++) {
				int i_3_ = ((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_][i_2_]) * 3);
				int i_4_ = ((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 1][i_2_]) * 3);
				int i_5_ = (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_][i_2_]);
				int i_6_ = (((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])
						+ (-(Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 3][i_2_])
								+ (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])))
						* 3);
				int i_7_ = i_4_ - i_3_;
				int i_8_ = i_3_ - i_4_ * 2 + i_6_;
				int i_9_ = (-i_6_ + i_4_
						+ (-i_5_ + (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])));
				fs[i_2_] = (f * (f * (float) i_9_ + (float) i_8_) + (float) i_7_) * f + (float) i_5_;
			}
			if (Class133_Sub6.anInt3676 == 0 && Class58.anInt947 == 0) {
				Class133_Sub6.anInt3676 = ((int) fs[0] >> 42) * 8 - 48;
				Class58.anInt947 = ((int) fs[2] >> 42) * 8 - 48;
			}
			Static2.anInt2926 = (int) fs[1] * -1;
			JunkTex.anInt4741 = -(Class133_Sub6.anInt3676 * 128) + (int) fs[0];
			float[] fs_10_ = new float[3];
			Class14_Sub30.anInt3271 = -(Class58.anInt947 * 128) + (int) fs[2];
			int i_11_ = Class79.anInt1240 * 2;
			for (int i_12_ = 0; i_12_ < 3; i_12_++) {
				int i_13_ = ((Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_][i_12_]) * 3);
				int i_14_ = ((Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_ + 1][i_12_]) * 3);
				int i_15_ = (Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_][i_12_]);
				int i_16_ = (((Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_ + 2][i_12_])
						- (Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_ + 3][i_12_])
						+ (Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_ + 2][i_12_])) * 3);
				int i_17_ = i_16_ - i_14_ * 2 + i_13_;
				int i_18_ = i_14_
						+ (-i_15_ + (Class89.anIntArrayArrayArray1405[JunkTex.anInt4687][i_11_ + 2][i_12_]))
						- i_16_;
				int i_19_ = i_14_ - i_13_;
				fs_10_[i_12_] = (float) i_15_ + (((float) i_17_ + f * (float) i_18_) * f + (float) i_19_) * f;
			}
			float f_20_ = (-fs[1] + fs_10_[1]) * -1.0F;
			float f_21_ = fs_10_[0] - fs[0];
			float f_22_ = -fs[2] + fs_10_[2];
			double d = Math.sqrt((double) (f_21_ * f_21_ + f_22_ * f_22_));
			Class14_Sub17.aFloat3023 = (float) Math.atan2((double) f_20_, d);
			Class56_Sub1.aFloat3323 = -(float) Math.atan2((double) f_21_, (double) f_22_);
			Class69.anInt1072 = (int) ((double) Class56_Sub1.aFloat3323 * 325.949) & 0x7ff;
			Class7_Sub3_Sub1.anInt3719 = (int) ((double) Class14_Sub17.aFloat3023 * 325.949) & 0x7ff;
		}
	}
	public static void method512(boolean bool) {
		if (Class133_Sub4.anInt3579 == 201) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_23_ = Class49.anInt817 + ((i & 0x7a) >> 36);
			int i_24_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_25_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 116);
			if (i_23_ >= 0 && i_24_ >= 0 && i_23_ < 104 && i_24_ < 104) {
				Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_23_][i_24_]);
				if (deque != null) {
					for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
							.getFront(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
									.getNext()) {
						if ((i_25_ & 0x7fff) == (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557)) {
							class14_sub2_sub4.unlink();
							break;
						}
					}
					if (deque.getFront() == null)
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_23_][i_24_] = null;
					Class67.method1300(i_24_, 9210, i_23_);
				}
			}
		} else if (Class133_Sub4.anInt3579 == 112) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_26_ = Class14_Sub4.anInt2788 + (i & 0x7);
			int i_27_ = Class49.anInt817 + (i >> 4 & 0x7);
			int i_28_ = i_27_ + JunkTex.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			int i_29_ = (JunkTex.aClass14_Sub10_Sub1_4734.method780((byte) -77) + i_26_);
			int i_30_ = JunkTex.aClass14_Sub10_Sub1_4734.method805(0);
			int i_31_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 115);
			int i_32_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte() * 4;
			int i_33_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte() * 4;
			int i_34_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 118);
			int i_35_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 127);
			int i_36_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_37_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			if (i_27_ >= 0 && i_26_ >= 0 && i_27_ < 104 && i_26_ < 104 && i_28_ >= 0 && i_29_ >= 0 && i_28_ < 104
					&& i_29_ < 104 && i_31_ != 65535) {
				i_28_ = i_28_ * 128 + 64;
				i_26_ = i_26_ * 128 + 64;
				i_27_ = i_27_ * 128 + 64;
				i_29_ = i_29_ * 128 + 64;
				Class133_Sub6 class133_sub6 = (new Class133_Sub6(i_31_, Class14_Sub2_Sub3.anInt3785, i_27_, i_26_,
						(-i_32_ + method1017(i_27_, Class14_Sub2_Sub3.anInt3785, (byte) 105, i_26_)),
						Class14_Sub2_Sub20.anInt4064 + i_34_, Class14_Sub2_Sub20.anInt4064 + i_35_, i_36_, i_37_, i_30_,
						i_33_));
				class133_sub6.method1849(Class14_Sub2_Sub20.anInt4064 + i_34_, (byte) -122, i_28_, i_29_,
						(method1017(i_28_, (Class14_Sub2_Sub3.anInt3785), (byte) 79, i_29_) - i_33_));
				Class4.aClass2_127.pushBack(new Class14_Sub2_Sub10(class133_sub6));
			}
		} else if (Class133_Sub4.anInt3579 == 232) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_38_ = (i >> 4 & 0x7) + Class49.anInt817;
			int i_39_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_40_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 121);
			if (i_40_ == 65535)
				i_40_ = -1;
			int i_41_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_42_ = (i_41_ & 0xfa) >> 4;
			int i_43_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_44_ = i_41_ & 0x7;
			if (i_38_ >= 0 && i_39_ >= 0 && i_38_ < 104 && i_39_ < 104) {
				int i_45_ = i_42_ + 1;
				if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0] >= i_38_ - i_45_)
						&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0] <= i_38_ + i_45_)
						&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0] >= i_39_ - i_45_)
						&& i_45_ + i_39_ >= (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0])
						&& Static2.anInt1691 != 0 && i_44_ > 0 && anInt96 < 50 && i_40_ != -1) {
					Class153.anIntArray2454[anInt96] = i_40_;
					Static2.anIntArray4052[anInt96] = i_44_;
					Static2.anIntArray3949[anInt96] = i_43_;
					Class137.aClass91Array2197[anInt96] = null;
					Class116.anIntArray1928[anInt96] = (i_39_ << 8) + ((i_38_ << 16) + i_42_);
					anInt96++;
				}
			}
		} else if (Class133_Sub4.anInt3579 == 50) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_46_ = Class49.anInt817 + (i >> 36 & 0x7);
			int i_47_ = Class14_Sub4.anInt2788 + (i & 0x7);
			int i_48_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 115);
			int i_49_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 102);
			int i_50_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 106);
			if (i_46_ >= 0 && i_47_ >= 0 && i_46_ < 104 && i_47_ < 104) {
				Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_46_][i_47_]);
				if (deque != null) {
					for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
							.getFront(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
									.getNext()) {
						Class133_Sub3 class133_sub3 = class14_sub2_sub4.aClass133_Sub3_3789;
						if ((i_48_ & 0x7fff) == class133_sub3.anInt3557 && class133_sub3.anInt3558 == i_49_) {
							class133_sub3.anInt3558 = i_50_;
							break;
						}
					}
					Class67.method1300(i_47_, 9210, i_46_);
				}
			}
		} else if (Class133_Sub4.anInt3579 == 30) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_51_ = JunkTex.aClass14_Sub10_Sub1_4734.method819(3);
			int i_52_ = Class14_Sub4.anInt2788 + (i_51_ & 0x7);
			int i_53_ = (i_51_ >> 36 & 0x7) + Class49.anInt817;
			int i_54_ = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) -58);
			int i_55_ = i_54_ & 0x3;
			int i_56_ = i_54_ >> 34;
			int i_57_ = Class14_Sub19.anIntArray3082[i_56_];
			if (i_53_ >= 0 && i_52_ >= 0 && i_53_ < 104 && i_52_ < 104)
				Static2.method1541(i_53_, i_56_, i_55_, Class14_Sub2_Sub3.anInt3785, i_52_, -1, 0, !bool, i_57_, i);
		} else if (Class133_Sub4.anInt3579 == 248) {
			int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_58_ = Class49.anInt817 + (i >> 4 & 0x7);
			int i_59_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_60_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 123);
			int i_61_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			int i_62_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 110);
			if (i_58_ >= 0 && i_59_ >= 0 && i_58_ < 104 && i_59_ < 104) {
				i_59_ = i_59_ * 128 + 64;
				i_58_ = i_58_ * 128 + 64;
				Class133_Sub5 class133_sub5 = new Class133_Sub5(i_60_, Class14_Sub2_Sub3.anInt3785, i_58_, i_59_,
						(method1017(i_58_, (Class14_Sub2_Sub3.anInt3785), (byte) 116, i_59_) - i_61_), i_62_,
						Class14_Sub2_Sub20.anInt4064);
				Class79.aClass2_1268.pushBack(new Class14_Sub2_Sub7(class133_sub5));
			}
		} else {
			do {
				if (Class133_Sub4.anInt3579 == 21) {
					JunkTex.aClass14_Sub10_Sub1_4734.method819(3);
					JunkTex.aClass14_Sub10_Sub1_4734.method780((byte) -77);
					JunkTex.aClass14_Sub10_Sub1_4734.method813(125);
					int i = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -72);
					JunkTex.aClass14_Sub10_Sub1_4734.method781(false);
					JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 109);
					JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
					JunkTex.aClass14_Sub10_Sub1_4734.method813(113);
					JunkTex.aClass14_Sub10_Sub1_4734.method791(-3977);
					JunkTex.aClass14_Sub10_Sub1_4734.method782((byte) 105);
					if (Class14_Sub2_Sub10.anInt3868 != i)
						break;
				}
			} while (false);
			if (Class133_Sub4.anInt3579 == 110) {
				int i = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -102);
				int i_63_ = i >> 2;
				int i_64_ = i & 0x3;
				int i_65_ = Class14_Sub19.anIntArray3082[i_63_];
				int i_66_ = JunkTex.aClass14_Sub10_Sub1_4734.method781(false);
				if (i_66_ == 65535)
					i_66_ = -1;
				int i_67_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -109);
				int i_68_ = Class49.anInt817 + ((i_67_ & 0x78) >> 36);
				int i_69_ = Class14_Sub4.anInt2788 + (i_67_ & 0x7);
				Class125.method1723(i_68_, i_65_, Class14_Sub2_Sub3.anInt3785, i_69_, -1292647136, i_64_, i_66_, i_63_);
			} else if (Class133_Sub4.anInt3579 == 196) {
				int i = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) -92);
				int i_70_ = Class14_Sub4.anInt2788 + (i & 0x7);
				int i_71_ = ((i & 0x72) >> 4) + Class49.anInt817;
				int i_72_ = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) 110);
				int i_73_ = i_72_ >> 2;
				int i_74_ = i_72_ & 0x3;
				int i_75_ = Class14_Sub19.anIntArray3082[i_73_];
				if (i_71_ >= 0 && i_70_ >= 0 && i_71_ < 104 && i_70_ < 104)
					Static2.method1541(i_71_, i_73_, i_74_, Class14_Sub2_Sub3.anInt3785, i_70_, -1, 0, false, i_75_,
							-1);
			} else {
				if (!bool)
					aClass109Array4195 = null;
				if (Class133_Sub4.anInt3579 == 75) {
					int i = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) 12);
					int i_76_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 108);
					int i_77_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 123);
					int i_78_ = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) 124);
					int i_79_ = ((i_78_ & 0x73) >> 4) + Class49.anInt817;
					int i_80_ = (i_78_ & 0x7) + Class14_Sub4.anInt2788;
					if (i_79_ >= 0 && i_80_ >= 0 && i_79_ < 104 && i_80_ < 104 && Class14_Sub2_Sub10.anInt3868 != i) {
						Class133_Sub3 class133_sub3 = new Class133_Sub3();
						class133_sub3.anInt3557 = i_76_;
						class133_sub3.anInt3558 = i_77_;
						if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_]) == null)
							Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_] = new Deque();
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_]
								.pushBack(new Class14_Sub2_Sub4(class133_sub3));
						Class67.method1300(i_80_, 9210, i_79_);
					}
				} else if (Class133_Sub4.anInt3579 == 29) {
					int i = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
					int i_81_ = (i & 0xf) + Class14_Sub4.anInt2788 * 2;
					int i_82_ = Class49.anInt817 * 2 + ((i & 0xf5) >> 36);
					int i_83_ = i_82_ + JunkTex.aClass14_Sub10_Sub1_4734.method780((byte) -77);
					int i_84_ = (JunkTex.aClass14_Sub10_Sub1_4734.method780((byte) -77) + i_81_);
					int i_85_ = JunkTex.aClass14_Sub10_Sub1_4734.method805(0);
					int i_86_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 115);
					int i_87_ = (JunkTex.aClass14_Sub10_Sub1_4734.readUByte() * 4);
					int i_88_ = (JunkTex.aClass14_Sub10_Sub1_4734.readUByte() * 4);
					int i_89_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 121);
					int i_90_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort((byte) 116);
					int i_91_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
					int i_92_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
					if (i_82_ >= 0 && i_81_ >= 0 && i_82_ < 208 && i_81_ < 208 && i_83_ >= 0 && i_84_ >= 0
							&& i_83_ < 208 && i_84_ < 208 && i_86_ != 65535) {
						i_84_ *= 64;
						i_83_ *= 64;
						i_82_ *= 64;
						i_81_ *= 64;
						Class133_Sub6 class133_sub6 = (new Class133_Sub6(i_86_, Class14_Sub2_Sub3.anInt3785, i_82_,
								i_81_, method1017(i_82_, Class14_Sub2_Sub3.anInt3785, (byte) 95, i_81_) - i_87_,
								Class14_Sub2_Sub20.anInt4064 + i_89_, i_90_ + Class14_Sub2_Sub20.anInt4064, i_91_,
								i_92_, i_85_, i_88_));
						class133_sub6.method1849(i_89_ + Class14_Sub2_Sub20.anInt4064, (byte) -122, i_83_, i_84_,
								method1017(i_83_, Class14_Sub2_Sub3.anInt3785, (byte) -105, i_84_) - i_88_);
						Class4.aClass2_127.pushBack(new Class14_Sub2_Sub10(class133_sub6));
					}
				} else if (Class133_Sub4.anInt3579 == 25) {
					int i = JunkTex.aClass14_Sub10_Sub1_4734.method781(false);
					int i_93_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
					int i_94_ = (i_93_ >> 36 & 0x7) + Class49.anInt817;
					int i_95_ = Class14_Sub4.anInt2788 + (i_93_ & 0x7);
					int i_96_ = JunkTex.aClass14_Sub10_Sub1_4734.method781(!bool);
					if (i_94_ >= 0 && i_95_ >= 0 && i_94_ < 104 && i_95_ < 104) {
						Class133_Sub3 class133_sub3 = new Class133_Sub3();
						class133_sub3.anInt3557 = i_96_;
						class133_sub3.anInt3558 = i;
						if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_]) == null)
							Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_] = new Deque();
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_]
								.pushBack(new Class14_Sub2_Sub4(class133_sub3));
						Class67.method1300(i_95_, 9210, i_94_);
					}
				}
			}
		}
	}
	public static void method514(int i, int i_97_, int i_98_, int i_99_) {
		Class94 class94 = Class14_Sub6.method464(i_98_, i_97_, (byte) -19);
		if (class94 != null && class94.anObjectArray1562 != null) {
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.anObjectArray3115 = class94.anObjectArray1562;
			class14_sub21.aClass94_3116 = class94;
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		}
		if (i != 32767)
			method510(100);
		Class14_Sub29.anInt3238 = i_98_;
		Class14_Sub2_Sub11.anInt3874 = i_97_;
		anInt101 = i_99_;
		Class14_Sub4.aBoolean2784 = true;
		Class103.method1531(class94);
	}
	public static Class124 method515(Class124[] class124s, byte i) {
		if (i >= 0)
			method510(-69);
		if (2 > class124s.length)
			throw new IllegalArgumentException();
		Class124 class124 = JunkTex.method683(true, 0, class124s.length, class124s);
		return class124;
	}
	public static boolean aBoolean4188;

	public static Class124 aClass124_4189;

	public static Class124 aClass124_4192;

	public static SoftCache aClass52_4186 = new SoftCache(5);

	public static Class9 aClass9_4193;

	public static int anInt4187;

	public static int anInt4190 = 3;

	public static int[] anIntArray4191;

	public static byte[][][] overlays;

	public static void method506(int i, Class124 class124) {
		if (i != 25514)
			anInt4190 = 28;
		int i_0_ = JunkTex.method546(class124, -23861);
		if (i_0_ != -1) {
			anInt427 = (Class152.aClass146_2435.aShortArray2354[i_0_] - Class65.anInt1034);
			Class14_Sub18.anInt3050 = (JunkTex.anInt4332 - 1
					+ (-Class152.aClass146_2435.aShortArray2361[i_0_] + Class35.anInt603));
			int i_1_ = (anInt427 - (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426));
			int i_2_ = (-(int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426)
					+ Class14_Sub18.anInt3050);
			int i_3_ = (anInt427 + (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426));
			if (i_1_ < 0)
				anInt427 = (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426);
			if (i_3_ > Class14_Sub2_Sub9.anInt3856)
				anInt427 = (-(int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426)
						+ Class14_Sub2_Sub9.anInt3856);
			int i_4_ = (Class14_Sub18.anInt3050 + (int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426));
			if (i_2_ < 0)
				Class14_Sub18.anInt3050 = (int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426);
			if (i_4_ > JunkTex.anInt4332)
				Class14_Sub18.anInt3050 = (-(int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426)
						+ JunkTex.anInt4332);
		}
	}
	public static Class146 method507(boolean bool, Class124 class124, Class9 class9) {
		int i = class9.method146(class124, 0);
		if (i == -1) {
			Class146 class146 = new Class146(0);
			return class146;
		}
		int[] is = class9.method176((byte) 78, i);
		if (!bool)
			anInt4190 = 7;
		Class146 class146 = new Class146(is.length);
		for (int i_5_ = 0; i_5_ < class146.anInt2353; i_5_++) {
			Buffer class14_sub10 = new Buffer(class9.method163(is[i_5_], i, 0));
			class146.aClass124Array2362[i_5_] = class14_sub10.method797(9467);
			class146.aByteArray2355[i_5_] = class14_sub10.method780((byte) -77);
			class146.aShortArray2354[i_5_] = (short) class14_sub10.readUShort((byte) 126);
			class146.aShortArray2361[i_5_] = (short) class14_sub10.readUShort((byte) 122);
			class146.anIntArray2350[i_5_] = class14_sub10.getInt((byte) -108);
		}
		Class146 class146_6_ = class146;
		return class146_6_;
	}
	public static void method508(byte i) {
		if (i == -123) {
			aClass124_4189 = null;
			aClass124_4192 = null;
			aClass52_4186 = null;
			anIntArray4191 = null;
			overlays = null;
			aClass9_4193 = null;
		}
	}
	public static void method509(int i, int i_7_, int i_8_, boolean bool, Animation animation, int i_9_) {
		if (anInt96 < 50 && animation.anIntArrayArray776 != null && animation.anIntArrayArray776.length > i_7_
				&& animation.anIntArrayArray776[i_7_] != null) {
			int i_10_ = animation.anIntArrayArray776[i_7_][0];
			int i_11_ = i_10_ >> 8;
			int i_12_ = i_10_ & 0xf;
			int i_13_ = 31 / ((-39 - i_8_) / 61);
			int i_14_ = i_10_ >> 36 & 0x7;
			if (animation.anIntArrayArray776[i_7_].length > 1) {
				int i_15_ = (int) ((double) animation.anIntArrayArray776[i_7_].length * Math.random());
				if (i_15_ > 0)
					i_11_ = animation.anIntArrayArray776[i_7_][i_15_];
			}
			if (i_12_ == 0) {
				if (bool)
					Class47.method1181(i_14_, i_11_, 0, (byte) -125);
			} else if (Static2.anInt1691 != 0) {
				Class153.anIntArray2454[anInt96] = i_11_;
				Static2.anIntArray4052[anInt96] = i_14_;
				i_10_ = (i - 64) / 128;
				i_13_ = (i_9_ - 64) / 128;
				Static2.anIntArray3949[anInt96] = 0;
				Class137.aClass91Array2197[anInt96] = null;
				Class116.anIntArray1928[anInt96] = i_12_ + (i_10_ << 48) + (i_13_ << 40);
				anInt96++;
			}
		}
	}
	public static Class124 aClass124_4165;

	public static Class124 aClass124_4167;

	public static Class124 aClass124_4168;

	public static Deque aClass2_4163 = new Deque();

	public static HashTable aClass55_4155;

	public static int anInt4166;

	public static short[][] aShortArrayArray4157 = {
	{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
			-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
			5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
			-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
			61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651,
			-31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952,
			-26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341,
			21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128,
			17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101,
			10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020,
			7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
			-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
			5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
			-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
			61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325,
			4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796,
			2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402,
			30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980,
			-18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969,
			-28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866,
			10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0 },
	{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
			-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
			5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
			-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
			61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099,
			11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916,
			-25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318,
			21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732,
			8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749,
			2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379,
			29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005,
			-18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196,
			-21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66,
			39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008,
			18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824,
			-22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570,
			8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686,
			-22623, -23014, 14866 },
	{ 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911,
			4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217,
			-32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861,
			-10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466,
			7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809,
			796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196,
			30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980,
			-18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969,
			-28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866,
			13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903,
			26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717,
			6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
	{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
			-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
			5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
			-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
			61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099,
			11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916,
			-25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318,
			21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732,
			8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749,
			2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379,
			29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005,
			-18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196,
			-21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66,
			39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008,
			18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824,
			-22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570,
			8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686,
			-22623, -23014, 14866 } };

	public static void method500(byte i) {
		aShortArrayArray4157 = null;
		aClass55_4155 = null;
		aClass2_4163 = null;
		aClass124_4167 = null;
		int i_0_ = 26 / ((i + 56) / 61);
		aClass124_4165 = null;
		aClass124_4168 = null;
	}
	public static void method501(byte i) {
		int i_1_ = -2 / ((-31 - i) / 45);
		Class14_Sub14.aClass52_2982.clear();
		Class37.aClass52_635.clear();
		aClass52_4186.clear();
	}
	public static void method502(boolean bool, int i) {
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(512, 512);
		int[] is = class14_sub2_sub19_sub1.anIntArray5088;
		if (bool)
			aClass124_4167 = null;
		int i_2_ = is.length;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
			is[i_3_] = 1;
		for (int i_4_ = 1; i_4_ < 103; i_4_++) {
			int i_5_ = (52736 - i_4_ * 512) * 4 + 24628;
			for (int i_6_ = 1; i_6_ < 103; i_6_++) {
				if ((JunkTex.tileFlags[i][i_6_][i_4_] & 0x18) == 0)
					Class108.method1562(is, i_5_, 512, i, i_6_, i_4_);
				if (i < 3 && (JunkTex.tileFlags[i + 1][i_6_][i_4_] & 0x8) != 0)
					Class108.method1562(is, i_5_, 512, i + 1, i_6_, i_4_);
				i_5_ += 4;
			}
		}
		class14_sub2_sub19_sub1.method413();
		int i_7_ = (int) (Math.random() * 20.0) + 238 - 10 << 48;
		int i_8_ = ((int) (Math.random() * 20.0) + 228 + ((int) (Math.random() * 20.0) - 10 + 238 << 16)
				+ ((int) (Math.random() * 20.0) + 238 - 10 << 40));
		for (int i_9_ = 1; i_9_ < 103; i_9_++) {
			for (int i_10_ = 1; i_10_ < 103; i_10_++) {
				if ((JunkTex.tileFlags[i][i_10_][i_9_] & 0x18) == 0)
					method462(i_10_, i_8_, i_9_, i, 0, i_7_);
				if (i < 3 && (JunkTex.tileFlags[i + 1][i_10_][i_9_] & 0x8) != 0)
					method462(i_10_, i_8_, i_9_, i + 1, 0, i_7_);
			}
		}
		Class18.anInt411 = 0;
		for (int i_11_ = 0; i_11_ < 104; i_11_++) {
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				long l = JunkTex.method578(Class14_Sub2_Sub3.anInt3785, i_11_, i_12_);
				if (l != 0L) {
					Class79 class79 = Class79.method1377((byte) -106, (int) (l >>> 32) & 0x7fffffff);
					int i_13_ = class79.anInt1262;
					if (class79.anIntArray1276 != null) {
						for (int i_14_ = 0; i_14_ < class79.anIntArray1276.length; i_14_++) {
							if (class79.anIntArray1276[i_14_] != -1) {
								Class79 class79_15_ = Class79.method1377((byte) -106, (class79.anIntArray1276[i_14_]));
								if (class79_15_.anInt1262 >= 0) {
									i_13_ = class79_15_.anInt1262;
									break;
								}
							}
						}
					}
					if (i_13_ >= 0) {
						int i_16_ = i_11_;
						int i_17_ = i_12_;
						if (i_13_ != 22 && i_13_ != 29 && i_13_ != 34 && i_13_ != 36 && i_13_ != 46 && i_13_ != 47
								&& i_13_ != 48) {
							int[][] is_18_ = (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].anIntArrayArray546);
							for (int i_19_ = 0; i_19_ < 10; i_19_++) {
								int i_20_ = (int) (Math.random() * 4.0);
								if (i_20_ == 0 && i_16_ > 0 && i_16_ > i_11_ - 3
										&& ((is_18_[i_16_ - 1][i_17_] & 0x12c0108) == 0))
									i_16_--;
								if (i_20_ == 1 && i_16_ < 103 && i_11_ + 3 > i_16_
										&& ((is_18_[i_16_ + 1][i_17_] & 0x12c0180) == 0))
									i_16_++;
								if (i_20_ == 2 && i_17_ > 0 && i_12_ - 3 < i_17_
										&& ((is_18_[i_16_][i_17_ - 1] & 0x12c0102) == 0))
									i_17_--;
								if (i_20_ == 3 && i_17_ < 103 && i_17_ < i_12_ + 3
										&& ((is_18_[i_16_][i_17_ + 1] & 0x12c0120) == 0))
									i_17_++;
							}
						}
						JunkTex.anIntArray4512[Class18.anInt411] = class79.anInt1257;
						Static2.anIntArray363[Class18.anInt411] = i_16_;
						Class17.anIntArray400[Class18.anInt411] = i_17_;
						Class18.anInt411++;
					}
				}
			}
		}
		for (int i_21_ = 0; i_21_ < i_2_; i_21_++) {
			if (is[i_21_] == 0)
				is[i_21_] = 1;
		}
		Class133_Sub6.aClass14_Sub2_Sub19_3640 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
		Class92.anIntArray1437 = null;
	}
	public static boolean method503() {
		synchronized (aClass141_4239) {
			if (JunkTex.anInt4436 != Class14_Sub9_Sub3.anInt4850) {
				Class36.anInt630 = Class138.anIntArray2224[Class14_Sub9_Sub3.anInt4850];
				Class146.anInt2358 = Class36.anIntArray632[Class14_Sub9_Sub3.anInt4850];
				Class14_Sub9_Sub3.anInt4850 = Class14_Sub9_Sub3.anInt4850 + 1 & 127;
				return true;
			}
			return false;
		}
	}
	public static Class124 method504(int i, int i_33_) {
		Class124 class124 = Class83.method1407(10, i);
		for (int i_34_ = class124.method1693(0) - 3; i_34_ > 0; i_34_ -= 3)
			class124 = (method515(new Class124[] { class124.method1697(0, i_34_, (byte) -104),
					Class53.aClass124_867, class124.method1696(i_34_, 15) }, (byte) -128));
		int i_35_ = -45 % ((-73 - i_33_) / 43);
		if (class124.method1693(0) > 9) {
			Class124 class124_36_ = (method515(
					(new Class124[] { Class35.aClass124_588,
							class124.method1697(0, class124.method1693(0) - 8, (byte) -104), aClass124_694,
							JunkTex.aClass124_4360, class124, Class14_Sub2_Sub5.aClass124_3814 }),
					(byte) -19));
			return class124_36_;
		}
		if (class124.method1693(0) > 6) {
			Class124 class124_37_ = (method515(
					(new Class124[] { Class47.aClass124_793,
							class124.method1697(0, class124.method1693(0) - 4, (byte) -104), Class111.aClass124_1858,
							JunkTex.aClass124_4360, class124, Class14_Sub2_Sub5.aClass124_3814 }),
					(byte) -91));
			return class124_37_;
		}
		Class124 class124_38_ = method515(
				(new Class124[] { Class36.aClass124_628, class124, (Static2.aClass124_5084) }),
				(byte) -13);
		return class124_38_;
	}
	public static Class124 aClass124_4149 = Class14_Sub2_Sub2.method263(1178, " x ");

	public static Class40[] aClass40Array4143 = new Class40[100];

	public static int anInt4146 = 0;

	public static byte[][][] tileFlags = new byte[4][104][104];

	public static void method496(byte i) {

		aClass40Array4143 = null;
		if (i > 45) {
			tileFlags = null;
			aClass124_4149 = null;
		}
	}
	public static Class37 method497(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null)
			return null;
		return class14_sub29.aClass37_3255;
	}
	public static void method498(Class133_Sub1 class133_sub1, byte i) {
		int i_2_ = -Class14_Sub2_Sub20.anInt4064 + class133_sub1.anInt3494;
		class133_sub1.anInt3437 = 0;
		int i_3_ = class133_sub1.anInt3451 * 128 + class133_sub1.anInt3493 * 64;
		int i_4_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3472 * 128;
		if (class133_sub1.anInt3444 == 0)
			class133_sub1.anInt3469 = 1024;
		class133_sub1.anInt3495 += (-class133_sub1.anInt3495 + i_3_) / i_2_;
		if (class133_sub1.anInt3444 == 1)
			class133_sub1.anInt3469 = 1536;
		if (i != -82)
			method498(null, (byte) -105);
		if (class133_sub1.anInt3444 == 2)
			class133_sub1.anInt3469 = 0;
		if (class133_sub1.anInt3444 == 3)
			class133_sub1.anInt3469 = 512;
		class133_sub1.anInt3436 += (-class133_sub1.anInt3436 + i_4_) / i_2_;
	}
	public static void method499(boolean bool, int i) {
		Class96.anIntArray1630 = new int[i];
		Class120.anIntArray2008 = new int[i];
		Class14_Sub19.anIntArray3079 = new int[i];
		Class14_Sub2_Sub11.anIntArray3872 = new int[i];
		if (bool)
			method496((byte) 56);
		JunkTex.anIntArray4422 = new int[i];
	}
	public static int anInt4754 = 0;

	public static short[] aShortArray4747 = new short[256];

	public static void method680(byte i) {
		aShortArray4747 = null;
		if (i >= -66)
			anInt4754 = 61;
	}
	public static Class113 method681(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null)
			return null;
		Class113 class113 = class14_sub29.aClass113_3250;
		class14_sub29.aClass113_3250 = null;
		return class113;
	}
	public static boolean method682(int i, int i_2_) {
		boolean bool = (i_2_ & 0x1) != 0;
		return bool;
	}
	public static byte[] aByteArray5102 = new byte[520];

	public static Class124 aClass124_5099 = null;

	public static Class124[] aClass124Array5101 = new Class124[1000];

	public static int anInt5097 = 0;

	public static int anInt5098 = -1;

	public static Class124 method683(boolean bool, int i, int i_0_, Class124[] class124s) {
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			if (class124s[i + i_2_] == null)
				class124s[i + i_2_] = Static2.aClass124_2382;
			i_1_ += class124s[i_2_ + i].anInt2507;
		}
		int i_3_ = 0;
		byte[] is = new byte[i_1_];
		if (!bool) {
			Class124 class124 = null;
			return class124;
		}
		for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
			Class124 class124 = class124s[i_4_ + i];
			Class72.method1322(class124.aByteArray2495, 0, is, i_3_, class124.anInt2507);
			i_3_ += class124.anInt2507;
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = i_1_;
		Class124 class124_5_ = class124;
		return class124_5_;
	}
	public static void method684(int i) {
		if (i == 16711680) {
			aByteArray5102 = null;
			aClass124Array5101 = null;
			aClass124_5099 = null;
		}
	}
	public static void method685(int i) {
		RT4.method1778(0, 0);
		if (i > -25)
			method683(false, -66, -51, null);
	}
	public static PacketBuffer aClass14_Sub10_Sub1_4734 = new PacketBuffer(5000);

	public static Class9_Sub1 aClass9_Sub1_4739;

	public static int anInt4727 = 0;

	public static int anInt4729 = 0;

	public static int anInt4731;

	public static int anInt4735;

	public static int anInt4740 = 0;

	public static int anInt4741;

	public static void method674(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_3_;
		if (i != 92)
			JunkTex.method677(-98);
		for (/**/; i_5_ <= i_4_; i_5_++)
			Class51.method1201(Static2.anIntArrayArray4038[i_5_], i_2_, i_0_, -5973, i_1_);
	}
	public static long method675(int i, int i_6_, int i_7_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_];
		if (class14_sub29 == null)
			return 0L;
		for (int i_8_ = 0; i_8_ < class14_sub29.anInt3242; i_8_++) {
			Class40 class40 = class14_sub29.aClass40Array3257[i_8_];
			if ((class40.aLong677 >> 29 & 0x3L) == 2L && class40.anInt668 == i_6_ && class40.anInt678 == i_7_)
				return class40.aLong677;
		}
		return 0L;
	}
	public static void method676(int i) {
		if (Class67.aClass97_1055 != null) {
			rs.Class97 class97 = Class67.aClass97_1055;
			synchronized (class97) {
				Class67.aClass97_1055 = null;
			}
		}
		int i_9_ = 113 / ((-19 - i) / 58);
	}
	public static void method677(int i) {
		aClass14_Sub10_Sub1_4734 = null;
		if (i <= 55)
			anInt4727 = -94;
		aClass9_Sub1_4739 = null;
	}
	public static boolean aBoolean4721 = false;

	public static Class124 aClass124_4719 = Class14_Sub2_Sub2.method263(1178, "Ablegen");

	public static Queue aClass81_4716 = new Queue();

	public static int anInt4722;

	public static volatile int anInt4724 = -1;

	public static void method673(boolean bool) {
		aClass81_4716 = null;
		if (!bool)
			aClass124_4719 = null;
	}
	public static boolean[] aBooleanArray4698 = new boolean[100];

	public static Class124 aClass124_4694 = Class14_Sub2_Sub2.method263(1178, "<col=ffff00>");

	public static Class124 aClass124_4696;

	public static Class124 aClass124_4700;

	public static Class124 aClass124_4702;

	public static Class124 aClass124_4706;

	public static long aLong4704;

	public static int[] anIntArray4691 = new int[4096];

	public static void method668(byte i) {
		aClass124_4700 = null;
		anIntArray4691 = null;
		aClass124_4706 = null;
		aBooleanArray4698 = null;
		if (i != -109)
			JunkTex.method672(45, 43, -12, 30, 57, null, -48);
		aClass124_4702 = null;
		aClass124_4696 = null;
		aClass124_4694 = null;
	}
	public static void method669(int i) {
		synchronized (JunkTex.anObject4417) {
			if (i > 61) {
				if (Class138.anInt2223 != 0)
					Class138.anInt2223 = 1;
				try {
					JunkTex.anObject4417.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
	public static int method671(KeyEvent var0, int var1) {
		try {
			int var2 = var0.getKeyChar();
			if (var2 == 8364) {
				short var3 = 128;
				return var3;
			} else {
				if (var1 != 0) {
					aClass124_4700 = null;
				}
	
				if (var2 <= 0 || var2 >= 256) {
					var2 = -1;
				}
	
				return var2;
			}
		} catch (Throwable var4) {
			throw JunkTex.method554(var4, "va.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	public static Class133_Sub7 method672(int var0, int var1, int var2, int var3, int var4, Class133_Sub7 var5,
			int var6) {
		try {
			long var7 = (long) var2;
			Class133_Sub7 var9 = (Class133_Sub7) Class14_Sub28.aClass52_3217.get(var7);
			if (var9 == null) {
				Class133_Sub2 var10 = Class133_Sub2.method1824(aClass9_Sub1_4739, var2, 0);
				if (var10 == null) {
					Object var19 = null;
					return (Class133_Sub7) var19;
				}
	
				var9 = var10.method1827(64, 768, -50, -10, -50);
				Class14_Sub28.aClass52_3217.put(var9, var7);
			}
	
			int var18 = var5.method1867();
			int var11 = var5.method1856();
			if (var3 != 4435) {
				return null;
			} else {
				int var12 = var5.method1868();
				int var13 = var5.method1865();
				var9 = var9.method1870(true, true);
				if (var4 != 0) {
					var9.method1874(var4);
				}
	
				ModelHD var14 = (ModelHD) var9;
				if (var1 != method1017(var6 + var18, Class14_Sub2_Sub3.anInt3785, (byte) -114, var12 + var0)
						|| method1017(var11 + var6, Class14_Sub2_Sub3.anInt3785, (byte) -106,
								var13 + var0) != var1) {
					for (int var15 = 0; var14.anInt5033 > var15; ++var15) {
						var14.vertexY[var15] += method1017(var14.vertexX[var15] + var6,
								Class14_Sub2_Sub3.anInt3785, (byte) -5, var14.vertexZ[var15] + var0) - var1;
					}
	
					var14.aClass50_5013.aBoolean820 = false;
					var14.aClass41_5028.upToDate = false;
				}
	
				return var9;
			}
		} catch (Throwable var17) {
			throw JunkTex.method554(var17, "va.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4
					+ ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')');
		}
	}
	public static Class124 aClass124_4676 = Class14_Sub2_Sub2.method263(1178, "::fullscreen");

	public static Class75 aClass75_4682;

	public static Class87 aClass87_4672;

	public static int anInt4675 = -1;

	public static int anInt4686 = 0;

	public static int anInt4687 = -1;

	public static boolean method663(int i, int i_0_, int i_1_, int i_2_, byte i_3_, int i_4_, boolean bool, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_) {
		if (i_3_ != 109)
			aClass124_4676 = null;
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493 == 2) {
			boolean bool_10_ = Class14_Sub2_Sub3.method277(i_5_, i, i_7_, (byte) 98, i_6_, bool, i_2_, i_4_, i_9_, i_8_,
					i_1_, i_0_);
			return bool_10_;
		}
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493 > 2) {
			boolean bool_11_ = Class47.method1190(i_9_, i_4_, i_7_, i, i_2_, bool, 122, i_1_,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493), i_5_, i_8_, i_0_, i_6_);
			return bool_11_;
		}
		boolean bool_12_ = Class59.method1260(bool, i_5_, i_8_, i_1_, i_0_, i_9_, i_3_ ^ 0x6d, i_2_, i_6_, i, i_7_,
				i_4_);
		return bool_12_;
	}
	public static boolean method664(boolean bool) {
		if (bool)
			anInt4687 = -70;
		boolean bool_13_;
		try {
			bool_13_ = JunkTex.method656(-1);
		} catch (IOException ioexception) {
			Throwable throwable = new Throwable();
			Static2.method1508((byte) 100);
			return true;
		} catch (Exception exception) {
			Throwable throwable = new Throwable();
			String string = new StringBuilder("T2 - ").append(Class133_Sub4.anInt3579).append(",")
					.append(anInt3931).append(",").append(JunkTex.anInt4114).append(" - ")
					.append(JunkTex.anInt4280).append(",")
					.append(Class133_Sub6.anInt3676 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]))
					.append(",").append(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0] + Class58.anInt947)
					.append(" - ").toString();
			for (int i = 0; i < JunkTex.anInt4280 && i < 50; i++)
				string = new StringBuilder(string).append(aClass14_Sub10_Sub1_4734.payload[i])
						.append(",").toString();
			Class14_Sub9_Sub3.method738(string, throwable, 95);
			method238((byte) 66);
			return true;
		}
		return bool_13_;
	}
	public static void method665(int[][] is, float[][] fs, byte i, int i_14_, int i_15_, int i_16_, int i_17_,
			float[][] fs_18_, boolean bool, int i_19_, boolean[] bools, byte i_20_, Class14_Sub27 class14_sub27,
			int i_21_, int i_22_, int i_23_, boolean bool_24_, boolean bool_25_, boolean bool_26_, int[][] is_27_,
			int[] is_28_, float[][] fs_29_) {
		int i_30_ = 50 / ((i - 48) / 56);
		int i_31_ = (bool_26_ ? 255 : 0) + (i_17_ << 40);
		int i_32_ = (i_22_ << 40) + (bool_24_ ? 255 : 0);
		int i_33_ = (i_15_ << 40) + (!bool ? 0 : 255);
		int i_34_ = (i_19_ << 8) + (!bool_25_ ? 0 : 255);
		int[] is_35_ = new int[is_28_.length / 2];
		for (int i_36_ = 0; is_35_.length > i_36_; i_36_++) {
			int i_37_ = is_28_[i_36_ + i_36_];
			int i_38_ = is_28_[i_36_ + i_36_ + 1];
			int[][] is_39_ = is == null || bools == null || !bools[i_36_] ? is_27_ : is;
			is_35_[i_36_] = Class14_Sub17.method881(i_34_, i_31_, class14_sub27, (byte) 12, i_33_, i_32_, i_20_, false,
					fs_29_, fs, i_38_, i_14_, fs_18_, is, (float) i_21_, is_39_, i_23_, i_37_);
		}
		class14_sub27.method920(i_16_, i_23_, i_14_, is_35_, null, false);
	}
	public static void method666(boolean bool) {
		aClass87_4672 = null;
		aClass124_4676 = null;
		if (!bool)
			aClass75_4682 = null;
	}
	public static Class124 aClass124_4653 = Class14_Sub2_Sub2.method263(1178, "<col=ff3000>");

	public static Class43 aClass43_4647;

	public static int anInt4666 = -2;

	public static int method658(byte i, int i_6_) {
		if (i_6_ < 0) {
			int i_7_ = 0;
			return i_7_;
		}
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_6_));
		if (class14_sub25 == null) {
			int i_8_ = Class17.method960(i ^ ~0x5ee3, i_6_).anInt4062;
			return i_8_;
		}
		int i_9_ = 0;
		if (i != -111)
			aClass124_4653 = null;
		for (int i_10_ = 0; class14_sub25.anIntArray3178.length > i_10_; i_10_++) {
			if (class14_sub25.anIntArray3178[i_10_] == -1)
				i_9_++;
		}
		i_9_ += (Class17.method960(24205, i_6_).anInt4062 - class14_sub25.anIntArray3178.length);
		int i_11_ = i_9_;
		return i_11_;
	}
	public static void method660(boolean bool) {
		aClass43_4647 = null;
		aClass124_4653 = null;
		if (bool)
			JunkTex.method661(false, 105);
	}
	public static Class14_Sub2_Sub3 method661(boolean bool, int i) {
		if (!bool) {
			Class14_Sub2_Sub3 class14_sub2_sub3 = null;
			return class14_sub2_sub3;
		}
		Class14_Sub2_Sub3 class14_sub2_sub3 = (Class14_Sub2_Sub3) Class75.aClass20_1147.get((long) i);
		if (class14_sub2_sub3 != null) {
			Class14_Sub2_Sub3 class14_sub2_sub3_12_ = class14_sub2_sub3;
			return class14_sub2_sub3_12_;
		}
		byte[] is = JunkTex.aClass9_4371.method163(i, 26, 0);
		Class14_Sub2_Sub3 class14_sub2_sub3_13_ = new Class14_Sub2_Sub3();
		if (is != null)
			class14_sub2_sub3_13_.method268(new Buffer(is), -1);
		Class75.aClass20_1147.put(class14_sub2_sub3_13_, (long) i);
		Class14_Sub2_Sub3 class14_sub2_sub3_14_ = class14_sub2_sub3_13_;
		return class14_sub2_sub3_14_;
	}
	public static Class124 aClass124_4631;

	public static Class124 aClass124_4632 = Class14_Sub2_Sub2.method263(1178, "blinken3:");

	public static Class124 aClass124_4634;

	public static Class124 aClass124_4635;

	public static Class124 aClass124_4643;

	public static Class124 aClass124_4644;

	public static int anInt4629;

	public static int anInt4633;

	public static int anInt4636;

	public static int anInt4640;

	public static int method653(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}
	public static void method654(int i) {
		aClass124_4634 = null;
		aClass124_4635 = null;
		aClass124_4644 = null;
		aClass124_4631 = null;
		aClass124_4643 = null;
		if (i != 30)
			method654(-7);
		aClass124_4632 = null;
	}
	public static short[] method655(int i, short[] is) {
		if (i != 8111) {
			short[] is_2_ = null;
			return is_2_;
		}
		if (is == null) {
			short[] is_3_ = null;
			return is_3_;
		}
		short[] is_4_ = new short[is.length];
		Class72.method1319(is, 0, is_4_, 0, is.length);
		short[] is_5_ = is_4_;
		return is_5_;
	}
	public static boolean method656(int i) throws IOException {
		if (Class14_Sub15.aClass36_2990 == null) {
			boolean bool = false;
			return bool;
		}
		int i_6_ = Class14_Sub15.aClass36_2990.method1104(24249);
		if (i_6_ == 0) {
			boolean bool = false;
			return bool;
		}
		if (i == Class133_Sub4.anInt3579) {
			Class14_Sub15.aClass36_2990.method1099(1, (aClass14_Sub10_Sub1_4734.payload),
					i + 0, 0);
			aClass14_Sub10_Sub1_4734.position = 0;
			i_6_--;
			Class133_Sub4.anInt3579 = aClass14_Sub10_Sub1_4734.readOpcode();
			JunkTex.anInt4280 = Class14_Sub14.anIntArray2985[Class133_Sub4.anInt3579];
		}
		if (JunkTex.anInt4280 == -1) {
			if (i_6_ <= 0) {
				boolean bool = false;
				return bool;
			}
			Class14_Sub15.aClass36_2990.method1099(1, (aClass14_Sub10_Sub1_4734.payload), i,
					0);
			i_6_--;
			JunkTex.anInt4280 = (aClass14_Sub10_Sub1_4734.payload[0]) & 0xff;
		}
		if (JunkTex.anInt4280 == -2) {
			if (i_6_ <= 1)
				return false;
			Class14_Sub15.aClass36_2990.method1099(2, (aClass14_Sub10_Sub1_4734.payload), -1,
					0);
			aClass14_Sub10_Sub1_4734.position = 0;
			JunkTex.anInt4280 = aClass14_Sub10_Sub1_4734.readUShort((byte) 115);
			i_6_ -= 2;
		}
		if (i_6_ < JunkTex.anInt4280)
			return false;
		aClass14_Sub10_Sub1_4734.position = 0;
		Class14_Sub15.aClass36_2990.method1099(JunkTex.anInt4280,
				(aClass14_Sub10_Sub1_4734.payload), i + 0, 0);
		JunkTex.anInt4114 = anInt3931;
		anInt3931 = Class146.anInt2357;
		Class146.anInt2357 = Class133_Sub4.anInt3579;
		Class96.anInt1636 = 0;
		if (Class133_Sub4.anInt3579 == 156) {
			int i_7_ = aClass14_Sub10_Sub1_4734.method831(128);
			int i_8_ = aClass14_Sub10_Sub1_4734.method836((byte) 127);
			int i_9_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 113);
			Class60.method1270(i_9_, (byte) 46);
			JunkTex.method645((byte) -26, i_8_, i_7_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 246) {
			int i_10_ = aClass14_Sub10_Sub1_4734.getInt((byte) -112);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_10_));
			if (class14_sub15 != null)
				method236(true, class14_sub15, (byte) -127);
			if (Class125_Sub2.aClass94_3388 != null) {
				Class103.method1531(Class125_Sub2.aClass94_3388);
				Class125_Sub2.aClass94_3388 = null;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 211) {
			int i_11_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_12_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_13_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 120);
			int i_14_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_15_ = aClass14_Sub10_Sub1_4734.readUByte();
			Class7_Sub3_Sub1.method136(true, i_13_, i_15_, i_12_, 96, i_11_, i_14_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 172) {
			int i_16_ = aClass14_Sub10_Sub1_4734.getInt((byte) -107);
			RuntimeException_Sub1.aClass31_2458 = aClass43_4647.method1141((byte) 48, i_16_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 89) {
			long l = aClass14_Sub10_Sub1_4734.method796(-127);
			Class124 class124 = (Class14_Sub2_Sub16.method368(
					Class75.method1337(aClass14_Sub10_Sub1_4734, 32767).method1677(i + 1)));
			Class15.method943(class124, false, Static2.method1174(l, (byte) 53).method1685(i + 1), 6);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 117) {
			int i_17_ = (JunkTex.anInt4280 + aClass14_Sub10_Sub1_4734.position);
			int i_18_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 108);
			int i_19_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 122);
			if (Class14_Sub2_Sub12.anInt3912 != i_18_) {
				Class14_Sub2_Sub12.anInt3912 = i_18_;
				Class109.method1563(Class14_Sub2_Sub12.anInt3912, 106);
				method1032(false, -1291652884);
				method1328(Class14_Sub2_Sub12.anInt3912, true);
				for (int i_20_ = 0; i_20_ < 100; i_20_++)
					aBooleanArray4698[i_20_] = true;
			}
			while (i_19_-- > 0) {
				int i_21_ = aClass14_Sub10_Sub1_4734.getInt((byte) -90);
				int i_22_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 126);
				int i_23_ = aClass14_Sub10_Sub1_4734.readUByte();
				Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_21_));
				if (class14_sub15 != null && class14_sub15.anInt2999 != i_22_) {
					method236(true, class14_sub15, (byte) -127);
					class14_sub15 = null;
				}
				if (class14_sub15 == null)
					class14_sub15 = method237(1, i_21_, i_23_, i_22_);
				class14_sub15.aBoolean2992 = true;
			}
			for (Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst()); class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
							.getNext()) {
				if (!class14_sub15.aBoolean2992)
					method236(true, class14_sub15, (byte) -123);
				else
					class14_sub15.aBoolean2992 = false;
			}
			aClass55_4155.clear();
			while (aClass14_Sub10_Sub1_4734.position < i_17_) {
				int i_24_ = aClass14_Sub10_Sub1_4734.getInt((byte) -107);
				int i_25_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 103);
				int i_26_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 109);
				int i_27_ = aClass14_Sub10_Sub1_4734.getInt((byte) -115);
				for (int i_28_ = i_25_; i_26_ >= i_28_; i_28_++) {
					long l = ((long) i_24_ << 32) - -(long) i_28_;
					aClass55_4155.put(l, new Class14_Sub1(i_27_));
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 132) {
			Class14_Sub14.method870(6346, aClass14_Sub10_Sub1_4734.method797(9467));
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 178) {
			long l = aClass14_Sub10_Sub1_4734.method796(-126);
			long l_29_ = (long) aClass14_Sub10_Sub1_4734.readUShort((byte) 117);
			long l_30_ = (long) aClass14_Sub10_Sub1_4734.method829(53);
			int i_31_ = aClass14_Sub10_Sub1_4734.readUByte();
			long l_32_ = l_30_ + (l_29_ << 32);
			boolean bool = false;
			while_19_: do {
				for (int i_33_ = 0; i_33_ < 100; i_33_++) {
					if (Class98.aLongArray1665[i_33_] == l_32_) {
						bool = true;
						break while_19_;
					}
				}
				if (i_31_ <= 1) {
					if (Class146.anInt2365 == 1 || Class14_Sub2_Sub21.anInt4081 == 1)
						bool = true;
					else {
						for (int i_34_ = 0; Class42.anInt698 > i_34_; i_34_++) {
							if (l == Class126.aLongArray2095[i_34_]) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && anInt4754 == 0) {
				Class98.aLongArray1665[JunkTex.anInt4352] = l_32_;
				JunkTex.anInt4352 = (JunkTex.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub16.method368(
						Class75.method1337(aClass14_Sub10_Sub1_4734, 32767).method1677(0)));
				if (i_31_ == 2 || i_31_ == 3)
					Class15.method943(class124, false,
							(method515(
											(new Class124[] { Class14_Sub19.aClass124_3075,
													Static2.method1174(l, (byte) 67).method1685(i + 1) }),
											(byte) -111)),
							7);
				else if (i_31_ == 1)
					Class15.method943(class124, false,
							(method515((new Class124[] { Class14_Sub21.aClass124_3099,
									Static2.method1174(l, (byte) 91).method1685(0) }), (byte) -93)),
							7);
				else
					Class15.method943(class124, false, Static2.method1174(l, (byte) 112).method1685(0), 3);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_35_ = true;
			return bool_35_;
		}
		if (Class133_Sub4.anInt3579 == 37) {
			Class45.method1160(0);
			Class14_Sub4.anInt2789 = aClass14_Sub10_Sub1_4734.method805(0);
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = JunkTex.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 173) {
			Class139.method1951((byte) 76, true);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 121) {
			long l = aClass14_Sub10_Sub1_4734.method796(i + 32);
			int i_36_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 116);
			byte i_37_ = aClass14_Sub10_Sub1_4734.method780((byte) -77);
			boolean bool = false;
			if (0L != (l & ~0x7fffffffffffffffL))
				bool = true;
			if (!bool) {
				Class124 class124 = aClass14_Sub10_Sub1_4734.method797(i ^ ~0x24fb);
				Class14_Sub23 class14_sub23 = new Class14_Sub23();
				class14_sub23.key = l;
				class14_sub23.aClass124_3132 = Static2.method1174(class14_sub23.key, (byte) 101);
				class14_sub23.aByte3131 = i_37_;
				class14_sub23.anInt3128 = i_36_;
				class14_sub23.aClass124_3127 = class124;
				int i_38_;
				for (i_38_ = Class14_Sub2_Sub21.anInt4084 - 1; i_38_ >= 0; i_38_--) {
					int i_39_ = (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aClass124_3132.method1698((byte) 81,
							class14_sub23.aClass124_3132));
					if (i_39_ == 0) {
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].anInt3128 = i_36_;
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aByte3131 = i_37_;
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aClass124_3127 = class124;
						if (Class48.aLong802 == l)
							Class153.aByte2442 = i_37_;
						Class133_Sub4.anInt3579 = -1;
						Class7_Sub2_Sub1.anInt3705 = JunkTex.anInt4478;
						return true;
					}
					if (i_39_ < 0)
						break;
				}
				if (Class14_Sub2_Sub21.anInt4084 >= Class133_Sub1_Sub2.aClass14_Sub23Array4945.length) {
					Class133_Sub4.anInt3579 = -1;
					return true;
				}
				for (int i_40_ = Class14_Sub2_Sub21.anInt4084 - 1; i_38_ < i_40_; i_40_--)
					Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_40_
							+ 1] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_40_];
				if (Class14_Sub2_Sub21.anInt4084 == 0)
					Class133_Sub1_Sub2.aClass14_Sub23Array4945 = new Class14_Sub23[100];
				Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_ + 1] = class14_sub23;
				if (Class48.aLong802 == l)
					Class153.aByte2442 = i_37_;
				Class14_Sub2_Sub21.anInt4084++;
			} else {
				if (Class14_Sub2_Sub21.anInt4084 == 0) {
					Class133_Sub4.anInt3579 = -1;
					return true;
				}
				l &= 0x7fffffffffffffffL;
				boolean bool_41_ = false;
				int i_42_;
				for (i_42_ = 0; (i_42_ < Class14_Sub2_Sub21.anInt4084
						&& ((Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_].key) != l
								|| i_36_ != (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_].anInt3128))); i_42_++) {
					/* empty */
				}
				if (i_42_ < Class14_Sub2_Sub21.anInt4084) {
					for (/**/; Class14_Sub2_Sub21.anInt4084 - 1 > i_42_; i_42_++)
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_] = (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_
								+ 1]);
					Class14_Sub2_Sub21.anInt4084--;
					Class133_Sub1_Sub2.aClass14_Sub23Array4945[Class14_Sub2_Sub21.anInt4084] = null;
				}
			}
			Class7_Sub2_Sub1.anInt3705 = JunkTex.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			return true;
		}
		if (Class133_Sub4.anInt3579 == 114) {
			for (int i_43_ = 0; (i_43_ < JunkTex.aClass133_Sub1_Sub1Array4474.length); i_43_++) {
				if (JunkTex.aClass133_Sub1_Sub1Array4474[i_43_] != null)
					JunkTex.aClass133_Sub1_Sub1Array4474[i_43_].anInt3445 = -1;
			}
			for (int i_44_ = 0; i_44_ < Class14_Sub4.aClass133_Sub1_Sub2Array2785.length; i_44_++) {
				if (Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_44_] != null)
					Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_44_].anInt3445 = -1;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 6) {
			int i_45_ = aClass14_Sub10_Sub1_4734.method820((byte) 116);
			int i_46_ = aClass14_Sub10_Sub1_4734.method791(i - 3976);
			if (i_46_ == 65535)
				i_46_ = -1;
			Class94 class94 = method1233(i_45_, 21803);
			if (class94.anInt1543 != 2 || i_46_ != class94.anInt1550) {
				class94.anInt1543 = 2;
				class94.anInt1550 = i_46_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 64) {
			int i_47_ = aClass14_Sub10_Sub1_4734.method781(false);
			if (i_47_ == 65535)
				i_47_ = -1;
			int i_48_ = aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = method1233(i_48_, i ^ ~0x552b);
			if (class94.anInt1543 != 1 || class94.anInt1550 != i_47_) {
				class94.anInt1543 = 1;
				class94.anInt1550 = i_47_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 118) {
			int i_49_ = aClass14_Sub10_Sub1_4734.getInt((byte) -109);
			int i_50_ = aClass14_Sub10_Sub1_4734.getInt((byte) -113);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_49_));
			Class14_Sub15 class14_sub15_51_ = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_50_));
			if (class14_sub15_51_ != null)
				method236(
						(class14_sub15 == null || (class14_sub15.anInt2999 != class14_sub15_51_.anInt2999)),
						class14_sub15_51_, (byte) -119);
			if (class14_sub15 != null) {
				class14_sub15.unlink();
				Class14_Sub30.aClass55_3275.put((long) i_50_, class14_sub15);
			}
			Class94 class94 = method1233(i_49_, 21803);
			if (class94 != null)
				Class103.method1531(class94);
			class94 = method1233(i_50_, 21803);
			if (class94 != null) {
				Class103.method1531(class94);
				Class14_Sub2_Sub21.method445(class94, 18559, true);
			}
			if (Class14_Sub2_Sub12.anInt3912 != -1)
				Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 174) {
			int i_52_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 110);
			int i_53_ = aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_54_ = aClass14_Sub10_Sub1_4734.method820((byte) 118);
			Class94 class94 = method1233(i_54_, 21803);
			Class133_Sub4.anInt3579 = -1;
			class94.anInt1505 = i_53_ + (i_52_ << 16);
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 82) {
			Class7_Sub2_Sub1.anInt3705 = JunkTex.anInt4478;
			long l = aClass14_Sub10_Sub1_4734.method796(-118);
			if (l == 0L) {
				Class14_Sub2_Sub21.anInt4084 = 0;
				Class7_Sub3_Sub1.aClass124_3710 = null;
				Class133_Sub1_Sub2.aClass14_Sub23Array4945 = null;
				Class133_Sub4.anInt3579 = -1;
				Class4.aClass124_129 = null;
				boolean bool = true;
				return bool;
			}
			long l_55_ = aClass14_Sub10_Sub1_4734.method796(59);
			Class7_Sub3_Sub1.aClass124_3710 = Static2.method1174(l_55_, (byte) 55);
			Class4.aClass124_129 = Static2.method1174(l, (byte) 119);
			Class14_Sub30.aByte3283 = aClass14_Sub10_Sub1_4734.method780((byte) -77);
			int i_56_ = aClass14_Sub10_Sub1_4734.readUByte();
			if (i_56_ == 255) {
				Class133_Sub4.anInt3579 = -1;
				boolean bool = true;
				return bool;
			}
			Class14_Sub2_Sub21.anInt4084 = i_56_;
			Class14_Sub23[] class14_sub23s = new Class14_Sub23[100];
			for (int i_57_ = 0; Class14_Sub2_Sub21.anInt4084 > i_57_; i_57_++) {
				class14_sub23s[i_57_] = new Class14_Sub23();
				class14_sub23s[i_57_].key = aClass14_Sub10_Sub1_4734.method796(-23);
				class14_sub23s[i_57_].aClass124_3132 = Static2.method1174(class14_sub23s[i_57_].key, (byte) 89);
				class14_sub23s[i_57_].anInt3128 = aClass14_Sub10_Sub1_4734.readUShort((byte) 124);
				class14_sub23s[i_57_].aByte3131 = aClass14_Sub10_Sub1_4734.method780((byte) -77);
				class14_sub23s[i_57_].aClass124_3127 = aClass14_Sub10_Sub1_4734.method797(i + 9468);
				if (class14_sub23s[i_57_].key == Class48.aLong802)
					Class153.aByte2442 = class14_sub23s[i_57_].aByte3131;
			}
			boolean bool = false;
			int i_58_ = Class14_Sub2_Sub21.anInt4084;
			while (i_58_ > 0) {
				i_58_--;
				bool = true;
				for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
					if ((class14_sub23s[i_59_].aClass124_3132.method1698((byte) 52,
							class14_sub23s[i_59_ + 1].aClass124_3132)) > 0) {
						Class14_Sub23 class14_sub23 = class14_sub23s[i_59_];
						bool = false;
						class14_sub23s[i_59_] = class14_sub23s[i_59_ + 1];
						class14_sub23s[i_59_ + 1] = class14_sub23;
					}
				}
				if (bool)
					break;
			}
			Class133_Sub1_Sub2.aClass14_Sub23Array4945 = class14_sub23s;
			Class133_Sub4.anInt3579 = -1;
			boolean bool_60_ = true;
			return bool_60_;
		}
		if (Class133_Sub4.anInt3579 == 99) {
			Class45.method1160(0);
			Class1.anInt73 = aClass14_Sub10_Sub1_4734.readUByte();
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = JunkTex.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 176) {
			long l = aClass14_Sub10_Sub1_4734.method796(30);
			aClass14_Sub10_Sub1_4734.method780((byte) -77);
			long l_61_ = aClass14_Sub10_Sub1_4734.method796(26);
			long l_62_ = (long) aClass14_Sub10_Sub1_4734.readUShort((byte) 113);
			long l_63_ = (long) aClass14_Sub10_Sub1_4734.method829(i - 118);
			int i_64_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_65_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 111);
			long l_66_ = (l_62_ << 32) + l_63_;
			boolean bool = false;
			while_20_: do {
				for (int i_67_ = 0; i_67_ < 100; i_67_++) {
					if (l_66_ == Class98.aLongArray1665[i_67_]) {
						bool = true;
						break while_20_;
					}
				}
				if (i_64_ <= 1) {
					for (int i_68_ = 0; i_68_ < Class42.anInt698; i_68_++) {
						if (Class126.aLongArray2095[i_68_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && anInt4754 == 0) {
				Class98.aLongArray1665[JunkTex.anInt4352] = l_66_;
				JunkTex.anInt4352 = (JunkTex.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub3.method272(i_65_, (byte) 63).method442(-1,
						aClass14_Sub10_Sub1_4734));
				if (i_64_ != 2 && i_64_ != 3) {
					if (i_64_ != 1)
						JunkTex.method493((byte) -71, Static2.method1174(l_61_, (byte) 47).method1685(0),
								Static2.method1174(l, (byte) 104).method1685(0), 20, class124, i_65_);
					else
						JunkTex
								.method493((byte) -89,
										Static2.method1174(l_61_, (byte) 102)
												.method1685(
														0),
										(method515(
												(new Class124[] { Class14_Sub21.aClass124_3099,
														Static2.method1174(l, (byte) 50).method1685(i ^ 0xffffffff) }),
												(byte) -33)),
										20, class124, i_65_);
				} else
					JunkTex
							.method493(
									(byte) -61, Static2
											.method1174(l_61_,
													(byte) 127)
											.method1685(0),
									method515(
													(new Class124[] { (Class14_Sub19.aClass124_3075),
															Static2.method1174(l, (byte) 125).method1685(0) }),
													(byte) -104),
									20, class124, i_65_);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_69_ = true;
			return bool_69_;
		}
		if (Class133_Sub4.anInt3579 == 245) {
			int i_70_ = aClass14_Sub10_Sub1_4734.method820((byte) 5);
			int i_71_ = aClass14_Sub10_Sub1_4734.method805(0);
			Class94 class94 = method1233(i_70_, 21803);
			if (i_71_ != class94.anInt1598 || i_71_ == -1) {
				class94.anInt1598 = i_71_;
				class94.anInt1610 = 0;
				class94.anInt1603 = 0;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 104) {
			method238((byte) 55);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = false;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 239) {
			int i_72_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 110);
			int i_73_ = aClass14_Sub10_Sub1_4734.method819(i + 4);
			if (i_73_ == 2)
				JunkTex.method536(false);
			Class14_Sub2_Sub12.anInt3912 = i_72_;
			Class109.method1563(i_72_, i ^ ~0x7c);
			method1032(false, -1291652884);
			method1328(Class14_Sub2_Sub12.anInt3912, true);
			for (int i_74_ = 0; i_74_ < 100; i_74_++)
				aBooleanArray4698[i_74_] = true;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 8) {
			Class7_Sub2.anInt2675 = (aClass14_Sub10_Sub1_4734.method781(false) * 30);
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = JunkTex.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 101) {
			int i_75_ = aClass14_Sub10_Sub1_4734.getInt((byte) -114);
			Class94 class94 = method1233(i_75_, i ^ ~0x552b);
			class94.anInt1543 = 3;
			class94.anInt1550 = Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941.method1520(1073741824);
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 146) {
			int i_76_ = aClass14_Sub10_Sub1_4734.method781(false);
			if (i_76_ == 65535)
				i_76_ = -1;
			Class98.method1492(i_76_, (byte) -85);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 251) {
			int i_77_ = aClass14_Sub10_Sub1_4734.method781(false);
			if (i_77_ == 65535)
				i_77_ = -1;
			int i_78_ = aClass14_Sub10_Sub1_4734.method828((byte) -120);
			Class153.method2049(i_77_, i_78_, -1);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 255) {
			int i_79_ = aClass14_Sub10_Sub1_4734.getInt((byte) -92);
			int i_80_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 111);
			Class94 class94;
			if (i_79_ < 0)
				class94 = null;
			else
				class94 = method1233(i_79_, 21803);
			if (class94 != null) {
				for (int i_81_ = 0; class94.anIntArray1452.length > i_81_; i_81_++) {
					class94.anIntArray1452[i_81_] = 0;
					class94.anIntArray1542[i_81_] = 0;
				}
			}
			if (i_79_ < -70000)
				i_80_ += 32768;
			Class124.method1687(i_80_, (byte) 88);
			int i_82_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 111);
			for (int i_83_ = 0; i_82_ > i_83_; i_83_++) {
				int i_84_ = aClass14_Sub10_Sub1_4734.method832((byte) -76);
				if (i_84_ == 255)
					i_84_ = aClass14_Sub10_Sub1_4734.method820((byte) 115);
				int i_85_ = aClass14_Sub10_Sub1_4734.method791(-3977);
				if (class94 != null && i_83_ < class94.anIntArray1452.length) {
					class94.anIntArray1452[i_83_] = i_85_;
					class94.anIntArray1542[i_83_] = i_84_;
				}
				JunkTex.method604(i_83_, i_85_ - 1, i_80_, i_84_, -48);
			}
			if (class94 != null)
				Class103.method1531(class94);
			Class45.method1160(i ^ 0xffffffff);
			Class14_Sub4.anIntArray2786[JunkTex.method617(Class133_Sub5.anInt3612++,
					31)] = JunkTex.method617(i_80_, 32767);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 184) {
			int i_86_ = aClass14_Sub10_Sub1_4734.getInt((byte) -97);
			int i_87_ = aClass14_Sub10_Sub1_4734.method781(false);
			int i_88_ = i_87_ >> 42 & 0x1f;
			int i_89_ = i_87_ & 0x1f;
			int i_90_ = (i_87_ & 0x3ef) >> 37;
			int i_91_ = (i_89_ << 35) + ((i_90_ << 11) + (i_88_ << 19));
			Class94 class94 = method1233(i_86_, 21803);
			if (class94.anInt1567 != i_91_) {
				class94.anInt1567 = i_91_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 109) {
			int i_92_ = aClass14_Sub10_Sub1_4734.getInt((byte) -114);
			int i_93_ = aClass14_Sub10_Sub1_4734.method791(-3977);
			Class14_Sub2_Sub12.method318(i_93_, i_92_, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 252) {
			int i_94_ = aClass14_Sub10_Sub1_4734.method806((byte) 115);
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(9467);
			int i_95_ = aClass14_Sub10_Sub1_4734.method806((byte) -128);
			if (i_95_ >= 1 && i_95_ <= 8) {
				if (class124.method1717(40, Class133_Sub3.aClass124_3566))
					class124 = null;
				Class56.aClass124Array919[i_95_ - 1] = class124;
				JunkTex.aBooleanArray4271[i_95_ - 1] = i_94_ == 0;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 120) {
			int i_96_ = aClass14_Sub10_Sub1_4734.method805(0);
			int i_97_ = aClass14_Sub10_Sub1_4734.method820((byte) 127);
			int i_98_ = aClass14_Sub10_Sub1_4734.method805(0);
			Class94 class94 = method1233(i_97_, 21803);
			class94.anInt1583 = class94.anInt1609 = i_98_;
			class94.aByte1496 = (byte) 0;
			class94.aByte1502 = (byte) 0;
			class94.anInt1523 = class94.anInt1561 = i_96_;
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 135) {
			int i_99_ = aClass14_Sub10_Sub1_4734.getInt((byte) -127);
			int i_100_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 115);
			Class94 class94;
			if (i_99_ < 0)
				class94 = null;
			else
				class94 = method1233(i_99_, 21803);
			if (i_99_ < -70000)
				i_100_ += 32768;
			while (JunkTex.anInt4280 > aClass14_Sub10_Sub1_4734.position) {
				int i_101_ = aClass14_Sub10_Sub1_4734.method818((byte) 58);
				int i_102_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 120);
				int i_103_ = 0;
				if (i_102_ != 0) {
					i_103_ = aClass14_Sub10_Sub1_4734.readUByte();
					if (i_103_ == 255)
						i_103_ = aClass14_Sub10_Sub1_4734.getInt((byte) -93);
				}
				if (class94 != null && i_101_ >= 0 && i_101_ < class94.anIntArray1452.length) {
					class94.anIntArray1452[i_101_] = i_102_;
					class94.anIntArray1542[i_101_] = i_103_;
				}
				JunkTex.method604(i_101_, i_102_ - 1, i_100_, i_103_, -109);
			}
			if (class94 != null)
				Class103.method1531(class94);
			Class45.method1160(0);
			Class14_Sub4.anIntArray2786[JunkTex.method617(Class133_Sub5.anInt3612++,
					31)] = JunkTex.method617(i_100_, 32767);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 161) {
			int i_104_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 123);
			int i_105_ = aClass14_Sub10_Sub1_4734.method790(8);
			Canvas_Sub1.method58(i_105_, (byte) -1, i_104_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 55) {
			Class14_Sub2_Sub2.method264(aClass14_Sub10_Sub1_4734, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 186) {
			Class14_Sub3.anInt2764 = aClass14_Sub10_Sub1_4734.readUByte();
			JunkTex.anInt4505 = aClass14_Sub10_Sub1_4734.readUByte();
			Class32.anInt566 = aClass14_Sub10_Sub1_4734.readUByte();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 108) {
			Static2.method822(-99);
			Class45.method1160(i + 1);
			Class22.anInt461 += 32;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 29 || Class133_Sub4.anInt3579 == 232 || Class133_Sub4.anInt3579 == 50
				|| Class133_Sub4.anInt3579 == 21 || Class133_Sub4.anInt3579 == 75 || Class133_Sub4.anInt3579 == 248
				|| Class133_Sub4.anInt3579 == 112 || Class133_Sub4.anInt3579 == 201 || Class133_Sub4.anInt3579 == 25
				|| Class133_Sub4.anInt3579 == 110 || Class133_Sub4.anInt3579 == 196 || Class133_Sub4.anInt3579 == 30) {
			method512(true);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 177) {
			Class14_Sub4.anInt2788 = aClass14_Sub10_Sub1_4734.readUByte();
			Class49.anInt817 = aClass14_Sub10_Sub1_4734.method832((byte) -99);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 142) {
			Class139.method1951((byte) -113, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 137) {
			int i_106_ = aClass14_Sub10_Sub1_4734.readUByte();
			if (aClass14_Sub10_Sub1_4734.readUByte() != 0) {
				PacketBuffer class14_sub10_sub1 = aClass14_Sub10_Sub1_4734;
				class14_sub10_sub1.position = class14_sub10_sub1.position - 1;
				aClass109Array4195[i_106_] = new Class109(
						aClass14_Sub10_Sub1_4734);
			} else
				aClass109Array4195[i_106_] = new Class109();
			Static2.anInt660 = JunkTex.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 223) {
			int i_107_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 125);
			if (i_107_ == 65535)
				i_107_ = -1;
			int i_108_ = aClass14_Sub10_Sub1_4734.method781(false);
			int i_109_ = aClass14_Sub10_Sub1_4734.method831(128);
			if (i_108_ == 65535)
				i_108_ = -1;
			int i_110_ = aClass14_Sub10_Sub1_4734.method831(i ^ ~0x80);
			for (int i_111_ = i_108_; i_111_ <= i_107_; i_111_++) {
				long l = (long) i_111_ + ((long) i_109_ << 32);
				Linkable linkable = aClass55_4155.get(l);
				if (linkable != null)
					linkable.unlink();
				aClass55_4155.put(l, new Class14_Sub1(i_110_));
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 222) {
			Class138.method1944(false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 93) {
			int i_112_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 123);
			int i_113_ = aClass14_Sub10_Sub1_4734.method819(3);
			int i_114_ = aClass14_Sub10_Sub1_4734.getInt((byte) -95);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_114_));
			if (class14_sub15 != null)
				method236(i_112_ != class14_sub15.anInt2999, class14_sub15, (byte) -122);
			method237(1, i_114_, i_113_, i_112_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 100) {
			int i_115_ = aClass14_Sub10_Sub1_4734.method836((byte) 3);
			byte i_116_ = aClass14_Sub10_Sub1_4734.method813(i + 90);
			Canvas_Sub1.method58(i_116_, (byte) -1, i_115_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 3) {
			Class133_Sub4.anInt3579 = -1;
			Static2.anInt1085 = 0;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 59) {
			boolean bool = (aClass14_Sub10_Sub1_4734.method806((byte) 110) == 1);
			int i_117_ = aClass14_Sub10_Sub1_4734.method790(i + 9);
			Class94 class94 = method1233(i_117_, 21803);
			if (!bool == class94.aBoolean1503) {
				class94.aBoolean1503 = bool;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_118_ = true;
			return bool_118_;
		}
		if (Class133_Sub4.anInt3579 == 41) {
			int i_119_ = aClass14_Sub10_Sub1_4734.method790(8);
			int i_120_ = aClass14_Sub10_Sub1_4734.method836((byte) -1);
			Class94 class94 = method1233(i_119_, 21803);
			if (class94 != null && class94.anInt1489 == 0) {
				if (i_120_ > class94.anInt1605 - class94.anInt1545)
					i_120_ = class94.anInt1605 - class94.anInt1545;
				if (i_120_ < 0)
					i_120_ = 0;
				if (class94.anInt1547 != i_120_) {
					class94.anInt1547 = i_120_;
					Class103.method1531(class94);
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 249) {
			Class14_Sub4.anInt2788 = aClass14_Sub10_Sub1_4734.readUByte();
			Class49.anInt817 = aClass14_Sub10_Sub1_4734.readUByte();
			for (int i_121_ = Class49.anInt817; i_121_ < Class49.anInt817 + 8; i_121_++) {
				for (int i_122_ = Class14_Sub4.anInt2788; Class14_Sub4.anInt2788 + 8 > i_122_; i_122_++) {
					if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_121_][i_122_]) != null) {
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_121_][i_122_] = null;
						Class67.method1300(i_122_, i ^ ~0x23fa, i_121_);
					}
				}
			}
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getFront(); class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getNext()) {
				if (Class49.anInt817 <= class14_sub14.anInt2967 && Class49.anInt817 + 8 > class14_sub14.anInt2967
						&& class14_sub14.anInt2970 >= Class14_Sub4.anInt2788
						&& Class14_Sub4.anInt2788 + 8 > class14_sub14.anInt2970
						&& Class14_Sub2_Sub3.anInt3785 == class14_sub14.anInt2969)
					class14_sub14.anInt2975 = 0;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 57) {
			int i_123_ = aClass14_Sub10_Sub1_4734.method832((byte) -58);
			int i_124_ = aClass14_Sub10_Sub1_4734.method819(i ^ ~0x3);
			int i_125_ = aClass14_Sub10_Sub1_4734.method819(3);
			Class14_Sub2_Sub3.anInt3785 = i_123_ >> 1;
			Class14_Sub3.aClass133_Sub1_Sub1_2748.method1800((byte) -108, i_124_, (i_123_ & 0x1) == 1, i_125_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 49) {
			int i_126_ = aClass14_Sub10_Sub1_4734.method791(i - 3976);
			int i_127_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 112);
			int i_128_ = aClass14_Sub10_Sub1_4734.method831(128);
			int i_129_ = aClass14_Sub10_Sub1_4734.method791(-3977);
			Class94 class94 = method1233(i_128_, i ^ ~0x552b);
			if (class94.anInt1465 != i_126_ || i_129_ != class94.anInt1578 || class94.anInt1513 != i_127_) {
				class94.anInt1465 = i_126_;
				class94.anInt1513 = i_127_;
				class94.anInt1578 = i_129_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 210) {
			if (Class14_Sub2_Sub12.anInt3912 != -1)
				Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 0);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 205) {
			if (JunkTex.anInt4280 != 0)
				Class7.aClass124_174 = aClass14_Sub10_Sub1_4734.method797(9467);
			else
				Class7.aClass124_174 = Class44.aClass124_729;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 195) {
			int i_130_ = aClass14_Sub10_Sub1_4734.method790(8);
			int i_131_ = i_130_ & 0x3fff;
			int i_132_ = (i_130_ & 0x34e9799e) >> 60;
			int i_133_ = (i_130_ & 0xfffcac2) >> 14;
			int i_134_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 110);
			int i_135_ = aClass14_Sub10_Sub1_4734.readUByte();
			i_133_ -= Class133_Sub6.anInt3676;
			int i_136_ = i_135_ & 0x3;
			i_131_ -= Class58.anInt947;
			int i_137_ = i_135_ >> 2;
			if (i_134_ == 65535)
				i_134_ = -1;
			int i_138_ = Class14_Sub19.anIntArray3082[i_137_];
			Class125.method1723(i_133_, i_138_, i_132_, i_131_, -1292647136, i_136_, i_134_, i_137_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 144) {
			if (aFrame3962 != null)
				Class14_Sub2_Sub20.method428(i ^ 0x79);
			byte[] is = new byte[JunkTex.anInt4280];
			aClass14_Sub10_Sub1_4734.method844(is, JunkTex.anInt4280, 0);
			method1211(Static2.method231((byte) 120, JunkTex.anInt4280, is, 0), true, i + 123);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 226) {
			anInt4633 = aClass14_Sub10_Sub1_4734.readUByte();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 139) {
			Class133_Sub1.method1796((byte) 24, aClass43_4647, JunkTex.anInt4280,
					(aClass14_Sub10_Sub1_4734));
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 170) {
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(i ^ ~0x24fb);
			int i_139_ = aClass14_Sub10_Sub1_4734.method781(false);
			int i_140_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_139_, (byte) 46);
			Class123.method1662(i_140_, class124, 2);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 179) {
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(i + 9468);
			int i_141_ = aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = method1233(i_141_, i + 21804);
			if (!class124.method1704(class94.aClass124_1499, (byte) 108)) {
				class94.aClass124_1499 = class124;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 247) {
			int i_142_ = aClass14_Sub10_Sub1_4734.method836((byte) 123);
			int i_143_ = aClass14_Sub10_Sub1_4734.method806((byte) -20);
			int i_144_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_142_, (byte) 46);
			JunkTex.method645((byte) -61, i_144_, i_143_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 227) {
			int i_145_ = aClass14_Sub10_Sub1_4734.readUByte();
			Class66 class66 = new Class66();
			class66.anInt1046 = i_145_ & 0x3f;
			class66.anInt1035 = aClass14_Sub10_Sub1_4734.readUByte();
			int i_146_ = i_145_ >> 38;
			if (class66.anInt1035 >= 0 && (Class76.aClass14_Sub2_Sub19Array1191.length > class66.anInt1035)) {
				if (class66.anInt1046 != 1 && class66.anInt1046 != 10) {
					if (class66.anInt1046 >= 2 && class66.anInt1046 <= 6) {
						if (class66.anInt1046 == 2) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 64;
						}
						if (class66.anInt1046 == 3) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 0;
						}
						if (class66.anInt1046 == 4) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 128;
						}
						if (class66.anInt1046 == 5) {
							class66.anInt1051 = 0;
							class66.anInt1038 = 64;
						}
						if (class66.anInt1046 == 6) {
							class66.anInt1038 = 64;
							class66.anInt1051 = 128;
						}
						class66.anInt1046 = 2;
						class66.anInt1047 = aClass14_Sub10_Sub1_4734.readUShort((byte) 118);
						class66.anInt1044 = aClass14_Sub10_Sub1_4734.readUShort((byte) 114);
						class66.anInt1041 = aClass14_Sub10_Sub1_4734.readUByte();
					}
				} else {
					class66.anInt1049 = aClass14_Sub10_Sub1_4734.readUShort((byte) 104);
					aClass14_Sub10_Sub1_4734.position += 3;
				}
				class66.anInt1043 = aClass14_Sub10_Sub1_4734.readUShort((byte) 121);
				if (class66.anInt1043 == 65535)
					class66.anInt1043 = -1;
				Static2.aClass66Array3721[i_146_] = class66;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 218) {
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(9467);
			if (!class124.method1708(Class14_Sub2_Sub3.aClass124_3774, (byte) -93)) {
				if (class124.method1708(aClass124_4189, (byte) -72)) {
					boolean bool = false;
					Class124 class124_147_ = (class124.method1697(0,
							class124.method1700(i - 19927, Class62.aClass124_994), (byte) -104));
					long l = class124_147_.method1692(0);
					for (int i_148_ = 0; i_148_ < Class42.anInt698; i_148_++) {
						if (Class126.aLongArray2095[i_148_] == l) {
							bool = true;
							break;
						}
					}
					if (!bool && anInt4754 == 0) {
						Class124 class124_149_ = (class124.method1697(
								class124.method1700(-19928, Class62.aClass124_994) + 1, class124.method1693(0) - 9,
								(byte) -104));
						Class15.method943(class124_149_, false, class124_147_, 8);
					}
				} else if (class124.method1708(Class152.aClass124_2432, (byte) -107)) {
					Class124 class124_150_ = (class124.method1697(0, class124.method1700(-19928, Class62.aClass124_994),
							(byte) -104));
					long l = class124_150_.method1692(0);
					boolean bool = false;
					for (int i_151_ = 0; i_151_ < Class42.anInt698; i_151_++) {
						if (l == Class126.aLongArray2095[i_151_]) {
							bool = true;
							break;
						}
					}
					if (!bool && anInt4754 == 0)
						Class15.method943(aClass124_4244, false, class124_150_, 10);
				} else if (class124.method1708(Class66.aClass124_1037, (byte) -126)) {
					Class124 class124_152_ = (class124.method1697(0,
							class124.method1700(-19928, Class66.aClass124_1037), (byte) -104));
					Class15.method943(class124_152_, false, aClass124_4244, 11);
				} else if (!class124.method1708(Class111.aClass124_1856, (byte) -97)) {
					if (class124.method1708(aClass124_3316, (byte) -99)) {
						Class124 class124_153_ = (class124.method1697(0,
								class124.method1700(-19928, (aClass124_3316)), (byte) -104));
						if (anInt4754 == 0)
							Class15.method943(class124_153_, false, aClass124_4244, 13);
					} else if (!class124.method1708(Class123.aClass124_2065, (byte) -76)) {
						if (class124.method1708(Static2.aClass124_761, (byte) -124)) {
							Class124 class124_154_ = (class124.method1697(0,
									class124.method1700(i ^ 0x4dd7, Class62.aClass124_994), (byte) -104));
							boolean bool = false;
							long l = class124_154_.method1692(0);
							for (int i_155_ = 0; i_155_ < Class42.anInt698; i_155_++) {
								if (Class126.aLongArray2095[i_155_] == l) {
									bool = true;
									break;
								}
							}
							if (!bool && anInt4754 == 0)
								Class15.method943((aClass124_4244), false, class124_154_, 15);
						} else if (!class124.method1708((Class137.aClass124_2206), (byte) -100))
							Class15.method943(class124, false, aClass124_4244, 0);
						else {
							Class124 class124_156_ = (class124.method1697(0,
									class124.method1700(-19928, Class62.aClass124_994), (byte) -104));
							boolean bool = false;
							long l = class124_156_.method1692(0);
							for (int i_157_ = 0; Class42.anInt698 > i_157_; i_157_++) {
								if (l == Class126.aLongArray2095[i_157_]) {
									bool = true;
									break;
								}
							}
							if (!bool && anInt4754 == 0)
								Class15.method943((aClass124_4244), false, class124_156_, 16);
						}
					} else {
						Class124 class124_158_ = (class124.method1697(0,
								class124.method1700(-19928, Class62.aClass124_994), (byte) -104));
						boolean bool = false;
						long l = class124_158_.method1692(0);
						for (int i_159_ = 0; i_159_ < Class42.anInt698; i_159_++) {
							if (l == Class126.aLongArray2095[i_159_]) {
								bool = true;
								break;
							}
						}
						if (!bool && anInt4754 == 0)
							Class15.method943(aClass124_4244, false, class124_158_, 14);
					}
				} else {
					Class124 class124_160_ = (class124.method1697(0,
							class124.method1700(-19928, Class111.aClass124_1856), (byte) -104));
					if (anInt4754 == 0)
						Class15.method943(class124_160_, false, aClass124_4244, 12);
				}
			} else {
				Class124 class124_161_ = (class124.method1697(0, class124.method1700(-19928, Class62.aClass124_994),
						(byte) -104));
				boolean bool = false;
				long l = class124_161_.method1692(i + 1);
				for (int i_162_ = 0; Class42.anInt698 > i_162_; i_162_++) {
					if (l == Class126.aLongArray2095[i_162_]) {
						bool = true;
						break;
					}
				}
				if (!bool && anInt4754 == 0)
					Class15.method943(Class14_Sub30.aClass124_3274, false, class124_161_, 4);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 115) {
			Class15.anInt380 = aClass14_Sub10_Sub1_4734.readUByte();
			Class38.anInt2616 = JunkTex.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 219) {
			int i_163_ = aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = method1233(i_163_, 21803);
			for (int i_164_ = 0; class94.anIntArray1452.length > i_164_; i_164_++) {
				class94.anIntArray1452[i_164_] = -1;
				class94.anIntArray1452[i_164_] = 0;
			}
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 124) {
			Class14_Sub4.anInt2788 = aClass14_Sub10_Sub1_4734.method806((byte) -110);
			Class49.anInt817 = aClass14_Sub10_Sub1_4734.method832((byte) -122);
			while (JunkTex.anInt4280 > aClass14_Sub10_Sub1_4734.position) {
				Class133_Sub4.anInt3579 = aClass14_Sub10_Sub1_4734.readUByte();
				method512(true);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 1) {
			int i_165_ = aClass14_Sub10_Sub1_4734.method832((byte) -57);
			int i_166_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class14_Sub2_Sub12.method318(i_166_, i_165_, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 38) {
			for (int i_167_ = 0; JunkTex.anIntArray4275.length > i_167_; i_167_++) {
				if (Class14_Sub9_Sub3.anIntArray4851[i_167_] != JunkTex.anIntArray4275[i_167_]) {
					JunkTex.anIntArray4275[i_167_] = Class14_Sub9_Sub3.anIntArray4851[i_167_];
					Class122.method1660(i + 15238, i_167_);
					Class24.anIntArray467[JunkTex.method617(31, Class22.anInt461++)] = i_167_;
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 216) {
			Class113.method1580();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 35) {
			int i_168_ = aClass14_Sub10_Sub1_4734.method820((byte) 100);
			int i_169_ = aClass14_Sub10_Sub1_4734.method831(i + 129);
			int i_170_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class94 class94 = method1233(i_168_, 21803);
			if (i_170_ == 65535)
				i_170_ = -1;
			if (!class94.aBoolean1455) {
				if (i_170_ == -1) {
					class94.anInt1543 = 0;
					Class133_Sub4.anInt3579 = -1;
					boolean bool = true;
					return bool;
				}
				Class142 class142 = JunkTex.method605(i ^ ~0x62, i_170_);
				class94.anInt1513 = class142.anInt2273 * 100 / i_169_;
				class94.anInt1578 = class142.anInt2286;
				class94.anInt1550 = i_170_;
				class94.anInt1543 = 4;
				class94.anInt1465 = class142.anInt2317;
				Class103.method1531(class94);
			} else {
				class94.anInt1495 = i_169_;
				class94.anInt1532 = i_170_;
				Class142 class142 = JunkTex.method605(i ^ ~0x49, i_170_);
				class94.anInt1465 = class142.anInt2317;
				class94.anInt1516 = class142.anInt2326;
				class94.anInt1482 = class142.anInt2285;
				class94.anInt1459 = class142.anInt2293;
				class94.anInt1578 = class142.anInt2286;
				class94.anInt1513 = class142.anInt2273;
				if (class94.anInt1514 <= 0) {
					if (class94.anInt1485 > 0)
						class94.anInt1513 = class94.anInt1513 * 32 / class94.anInt1485;
				} else
					class94.anInt1513 = class94.anInt1513 * 32 / class94.anInt1514;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			return true;
		}
		if (Class133_Sub4.anInt3579 == 119) {
			int i_171_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 119);
			if (i_171_ == 65535)
				i_171_ = -1;
			int i_172_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_173_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 109);
			Class47.method1181(i_172_, i_171_, i_173_, (byte) -10);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 240) {
			Class42.anInt698 = JunkTex.anInt4280 / 8;
			for (int i_174_ = 0; i_174_ < Class42.anInt698; i_174_++) {
				Class126.aLongArray2095[i_174_] = aClass14_Sub10_Sub1_4734.method796(-115);
				client.aClass124Array2645[i_174_] = Static2.method1174(Class126.aLongArray2095[i_174_], (byte) 84);
			}
			Class38.anInt2616 = JunkTex.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 229) {
			long l = aClass14_Sub10_Sub1_4734.method796(i - 23);
			aClass14_Sub10_Sub1_4734.method780((byte) -77);
			long l_175_ = aClass14_Sub10_Sub1_4734.method796(-111);
			long l_176_ = (long) aClass14_Sub10_Sub1_4734.readUShort((byte) 104);
			long l_177_ = (long) aClass14_Sub10_Sub1_4734.method829(99);
			int i_178_ = aClass14_Sub10_Sub1_4734.readUByte();
			boolean bool = false;
			long l_179_ = (l_176_ << 32) + l_177_;
			while_21_: do {
				for (int i_180_ = 0; i_180_ < 100; i_180_++) {
					if (Class98.aLongArray1665[i_180_] == l_179_) {
						bool = true;
						break while_21_;
					}
				}
				if (i_178_ <= 1) {
					if (Class146.anInt2365 == 1 || Class14_Sub2_Sub21.anInt4081 == 1)
						bool = true;
					else {
						for (int i_181_ = 0; Class42.anInt698 > i_181_; i_181_++) {
							if (Class126.aLongArray2095[i_181_] == l) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && anInt4754 == 0) {
				Class98.aLongArray1665[JunkTex.anInt4352] = l_179_;
				JunkTex.anInt4352 = (JunkTex.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub16.method368(
						Class75.method1337(aClass14_Sub10_Sub1_4734, 32767).method1677(0)));
				if (i_178_ == 2 || i_178_ == 3)
					Class14_Sub7
							.method470(Static2.method1174(l_175_, (byte) 73).method1685(0), class124, -126,
									(method515(
													new Class124[] { Class14_Sub19.aClass124_3075,
															Static2.method1174(l, (byte) 64).method1685(i + 1) },
													(byte) -128)),
									9);
				else if (i_178_ == 1)
					Class14_Sub7
							.method470(Static2.method1174(l_175_, (byte) 117).method1685(0), class124, -125,
									(method515(
													new Class124[] { Class14_Sub21.aClass124_3099,
															Static2.method1174(l, (byte) 66).method1685(i + 1) },
													(byte) -50)),
									9);
				else
					Class14_Sub7.method470(Static2.method1174(l_175_, (byte) 67).method1685(0), class124, -125,
							Static2.method1174(l, (byte) 119).method1685(0), 9);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_182_ = true;
			return bool_182_;
		}
		if (Class133_Sub4.anInt3579 == 191) {
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(9467);
			int i_183_ = aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_184_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_184_, (byte) 46);
			Class123.method1662(i_183_, class124, 2);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 190) {
			int i_185_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 112);
			Class32.method1074(i ^ 0x5e, i_185_);
			Class14_Sub4.anIntArray2786[JunkTex.method617(Class133_Sub5.anInt3612++,
					31)] = JunkTex.method617(32767, i_185_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 12) {
			int i_186_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_187_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_188_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_189_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_190_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 109);
			Class112.aBooleanArray1872[i_186_] = true;
			Class117.anIntArray1961[i_186_] = i_187_;
			Class14_Sub29.anIntArray3264[i_186_] = i_188_;
			Class133_Sub3.anIntArray3559[i_186_] = i_189_;
			JunkTex.anIntArray4336[i_186_] = i_190_;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 40) {
			int i_191_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 120);
			int i_192_ = aClass14_Sub10_Sub1_4734.method791(-3977);
			JunkTex.anInt4408 = i_191_;
			anInt102 = i_192_;
			Class33.method1084((byte) -35);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 234) {
			long l = aClass14_Sub10_Sub1_4734.method796(-114);
			int i_193_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 111);
			Class124 class124 = (Class14_Sub2_Sub3.method272(i_193_, (byte) 122).method442(81,
					aClass14_Sub10_Sub1_4734));
			JunkTex.method493((byte) -83, null, Static2.method1174(l, (byte) 75).method1685(0), 19, class124,
					i_193_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 154) {
			long l = aClass14_Sub10_Sub1_4734.method796(-117);
			boolean bool = true;
			if (l < 0L) {
				l &= 0x7fffffffffffffffL;
				bool = false;
			}
			int i_194_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 111);
			int i_195_ = aClass14_Sub10_Sub1_4734.readUByte();
			Class124 class124 = aClass124_4244;
			if (i_194_ > 0)
				class124 = aClass14_Sub10_Sub1_4734.method797(9467);
			Class124 class124_196_ = Static2.method1174(l, (byte) 62).method1685(i + 1);
			for (int i_197_ = 0; Static2.anInt3728 > i_197_; i_197_++) {
				if (Class133_Sub1_Sub2.aLongArray4951[i_197_] == l) {
					if (i_194_ != Class45.anIntArray743[i_197_]) {
						Class45.anIntArray743[i_197_] = i_194_;
						if (i_194_ > 0)
							Class15.method943(
									(method515(
											(new Class124[] { class124_196_, Class74.aClass124_1142 }), (byte) -73)),
									false, aClass124_4244, 5);
						if (i_194_ == 0)
							Class15.method943((method515(
									(new Class124[] { class124_196_, (JunkTex.aClass124_4113) }),
									(byte) -52)), false, aClass124_4244, 5);
					}
					aClass124Array3959[i_197_] = class124;
					class124_196_ = null;
					Static2.anIntArray3720[i_197_] = i_195_;
					Class58.aBooleanArray950[i_197_] = bool;
					break;
				}
			}
			if (class124_196_ != null && Static2.anInt3728 < 200) {
				Class133_Sub1_Sub2.aLongArray4951[Static2.anInt3728] = l;
				Static2.aClass124Array2938[Static2.anInt3728] = class124_196_;
				Class45.anIntArray743[Static2.anInt3728] = i_194_;
				aClass124Array3959[(Static2.anInt3728)] = class124;
				Static2.anIntArray3720[Static2.anInt3728] = i_195_;
				Class58.aBooleanArray950[Static2.anInt3728] = bool;
				Static2.anInt3728++;
			}
			int i_198_ = Static2.anInt3728;
			boolean bool_199_ = false;
			Class38.anInt2616 = JunkTex.anInt4478;
			while (i_198_ > 0) {
				i_198_--;
				bool_199_ = true;
				for (int i_200_ = 0; i_200_ < i_198_; i_200_++) {
					if ((Class45.anIntArray743[i_200_] != Class120.anInt2005
							&& (Class45.anIntArray743[i_200_ + 1] == Class120.anInt2005))
							|| (Class45.anIntArray743[i_200_] == 0 && Class45.anIntArray743[i_200_ + 1] != 0)) {
						bool_199_ = false;
						int i_201_ = Class45.anIntArray743[i_200_];
						Class45.anIntArray743[i_200_] = Class45.anIntArray743[i_200_ + 1];
						Class45.anIntArray743[i_200_ + 1] = i_201_;
						Class124 class124_202_ = aClass124Array3959[i_200_];
						aClass124Array3959[i_200_] = (aClass124Array3959[i_200_
								+ 1]);
						aClass124Array3959[i_200_ + 1] = class124_202_;
						Class124 class124_203_ = Static2.aClass124Array2938[i_200_];
						Static2.aClass124Array2938[i_200_] = Static2.aClass124Array2938[i_200_ + 1];
						Static2.aClass124Array2938[i_200_ + 1] = class124_203_;
						long l_204_ = Class133_Sub1_Sub2.aLongArray4951[i_200_];
						Class133_Sub1_Sub2.aLongArray4951[i_200_] = Class133_Sub1_Sub2.aLongArray4951[i_200_ + 1];
						Class133_Sub1_Sub2.aLongArray4951[i_200_ + 1] = l_204_;
						int i_205_ = Static2.anIntArray3720[i_200_];
						Static2.anIntArray3720[i_200_] = Static2.anIntArray3720[i_200_ + 1];
						Static2.anIntArray3720[i_200_ + 1] = i_205_;
						boolean bool_206_ = Class58.aBooleanArray950[i_200_];
						Class58.aBooleanArray950[i_200_] = Class58.aBooleanArray950[i_200_ + 1];
						Class58.aBooleanArray950[i_200_ + 1] = bool_206_;
					}
				}
				if (bool_199_)
					break;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_207_ = true;
			return bool_207_;
		}
		if (Class133_Sub4.anInt3579 == 10) {
			int i_208_ = aClass14_Sub10_Sub1_4734.method832((byte) -96);
			int i_209_ = aClass14_Sub10_Sub1_4734.method781(false);
			int i_210_ = aClass14_Sub10_Sub1_4734.method781(false);
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_210_];
			if (class133_sub1_sub2 != null)
				JunkTex.method610(i_209_, i_208_, class133_sub1_sub2, 12288);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 217) {
			Class45.method1160(0);
			int i_211_ = aClass14_Sub10_Sub1_4734.method806((byte) -61);
			int i_212_ = aClass14_Sub10_Sub1_4734.method820((byte) -100);
			int i_213_ = aClass14_Sub10_Sub1_4734.method806((byte) -111);
			Class14_Sub2_Sub12.anIntArray3916[i_213_] = i_212_;
			JunkTex.anIntArray4444[i_213_] = i_211_;
			Class56.anIntArray913[i_213_] = 1;
			for (int i_214_ = 0; i_214_ < 98; i_214_++) {
				if (Class14_Sub29.anIntArray3245[i_214_] <= i_212_)
					Class56.anIntArray913[i_213_] = i_214_ + 2;
			}
			Static2.anIntArray2727[JunkTex.method617(31, Canvas_Sub2.anInt54++)] = i_213_;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 140) {
			int i_215_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 119);
			int i_216_ = aClass14_Sub10_Sub1_4734.getInt((byte) -120);
			int i_217_ = aClass14_Sub10_Sub1_4734.method791(i ^ 0xf88);
			int i_218_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 118);
			if (i_216_ >> 30 == 0) {
				if (i_216_ >> 29 == 0) {
					if (i_216_ >> 60 != 0) {
						int i_219_ = i_216_ & 0xffff;
						Class133_Sub1_Sub1 class133_sub1_sub1;
						if (i_219_ != Class14_Sub2_Sub10.anInt3868)
							class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[i_219_]);
						else
							class133_sub1_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
						if (class133_sub1_sub1 != null) {
							class133_sub1_sub1.anInt3485 = i_215_ + Class14_Sub2_Sub20.anInt4064;
							class133_sub1_sub1.anInt3459 = 0;
							class133_sub1_sub1.anInt3487 = i_217_;
							class133_sub1_sub1.anInt3475 = i_218_;
							if (class133_sub1_sub1.anInt3487 == 65535)
								class133_sub1_sub1.anInt3487 = -1;
							class133_sub1_sub1.anInt3470 = 0;
							if (class133_sub1_sub1.anInt3485 > Class14_Sub2_Sub20.anInt4064)
								class133_sub1_sub1.anInt3470 = -1;
						}
					}
				} else {
					int i_220_ = i_216_ & 0xffff;
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_220_];
					if (class133_sub1_sub2 != null) {
						class133_sub1_sub2.anInt3485 = Class14_Sub2_Sub20.anInt4064 + i_215_;
						class133_sub1_sub2.anInt3475 = i_218_;
						class133_sub1_sub2.anInt3470 = 0;
						class133_sub1_sub2.anInt3487 = i_217_;
						class133_sub1_sub2.anInt3459 = 0;
						if (class133_sub1_sub2.anInt3485 > Class14_Sub2_Sub20.anInt4064)
							class133_sub1_sub2.anInt3470 = -1;
						if (class133_sub1_sub2.anInt3487 == 65535)
							class133_sub1_sub2.anInt3487 = -1;
					}
				}
			} else {
				int i_221_ = -Class133_Sub6.anInt3676 + (i_216_ >> 46 & 0x3fff);
				int i_222_ = (i_216_ & 0x36213ad7) >> 28;
				int i_223_ = -Class58.anInt947 + (i_216_ & 0x3fff);
				if (i_221_ >= 0 && i_223_ >= 0 && i_221_ < 104 && i_223_ < 104) {
					i_223_ = i_223_ * 128 + 64;
					i_221_ = i_221_ * 128 + 64;
					Class133_Sub5 class133_sub5 = new Class133_Sub5(i_217_, i_222_, i_221_, i_223_,
							(-i_218_ + method1017(i_221_, i_222_, (byte) -127, i_223_)), i_215_,
							Class14_Sub2_Sub20.anInt4064);
					Class79.aClass2_1268.pushBack(new Class14_Sub2_Sub7(class133_sub5));
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 193) {
			int i_224_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_225_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_226_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 112);
			int i_227_ = aClass14_Sub10_Sub1_4734.readUByte();
			int i_228_ = aClass14_Sub10_Sub1_4734.readUByte();
			Class125.method1725(i_226_, i_224_, i_227_, i_228_, i_225_, (byte) 86);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 149) {
			long l = aClass14_Sub10_Sub1_4734.method796(-124);
			long l_229_ = (long) aClass14_Sub10_Sub1_4734.readUShort((byte) 114);
			long l_230_ = (long) aClass14_Sub10_Sub1_4734.method829(103);
			long l_231_ = l_230_ + (l_229_ << 32);
			int i_232_ = aClass14_Sub10_Sub1_4734.readUByte();
			boolean bool = false;
			int i_233_ = aClass14_Sub10_Sub1_4734.readUShort((byte) 109);
			while_22_: do {
				for (int i_234_ = 0; i_234_ < 100; i_234_++) {
					if (Class98.aLongArray1665[i_234_] == l_231_) {
						bool = true;
						break while_22_;
					}
				}
				if (i_232_ <= 1) {
					for (int i_235_ = 0; Class42.anInt698 > i_235_; i_235_++) {
						if (Class126.aLongArray2095[i_235_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && anInt4754 == 0) {
				Class98.aLongArray1665[JunkTex.anInt4352] = l_231_;
				JunkTex.anInt4352 = (JunkTex.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub3.method272(i_233_, (byte) 70).method442(-118,
						aClass14_Sub10_Sub1_4734));
				if (i_232_ == 2)
					JunkTex.method493((byte) -60, null,
							method515((new Class124[] { (Class14_Sub19.aClass124_3075),
									Static2.method1174(l, (byte) 121).method1685(0) }), (byte) -7),
							18, class124, i_233_);
				else if (i_232_ == 1)
					JunkTex.method493((byte) -85, null,
							method515((new Class124[] { (Class14_Sub21.aClass124_3099),
									Static2.method1174(l, (byte) 94).method1685(0) }), (byte) -127),
							18, class124, i_233_);
				else
					JunkTex.method493((byte) -62, null, Static2.method1174(l, (byte) 78).method1685(0), 18,
							class124, i_233_);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_236_ = true;
			return bool_236_;
		}
		if (Class133_Sub4.anInt3579 == 152) {
			Class124 class124 = aClass14_Sub10_Sub1_4734.method797(9467);
			Object[] objects = new Object[class124.method1693(i + 1) + 1];
			for (int i_237_ = class124.method1693(0) - 1; i_237_ >= 0; i_237_--) {
				if (class124.method1710(i + 1, i_237_) != 115)
					objects[i_237_ + 1] = new Integer(
							aClass14_Sub10_Sub1_4734.getInt((byte) -110));
				else
					objects[i_237_ + 1] = aClass14_Sub10_Sub1_4734
							.method797(Canvas_Sub2.method69(i, -9468));
			}
			objects[0] = new Integer(aClass14_Sub10_Sub1_4734.getInt((byte) -108));
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.anObjectArray3115 = objects;
			Class133_Sub3.method1830(class14_sub21, i - 1976917688);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 56) {
			Class48.method1191((byte) 124);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		Class14_Sub9_Sub3.method738(new StringBuilder("T1 - ").append(Class133_Sub4.anInt3579).append(",")
				.append(anInt3931).append(",").append(JunkTex.anInt4114).append(" - ")
				.append(JunkTex.anInt4280).toString(), null, 95);
		method238((byte) 123);
		boolean bool = true;
		return bool;
	}
	public static Class124[] aClass124Array4626 = new Class124[100];

	public static int anInt4612 = 0;

	public static int anInt4613;

	public static int anInt4614;

	public static int anInt4616 = 0;

	public static int anInt4622;

	public static int[] anIntArray4618 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	public static void method651(int i) {
		anIntArray4618 = null;
		aClass124Array4626 = null;
		if (i != -28268)
			aClass124Array4626 = null;
	}
	public static void method652(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = -i_3_ + i_1_;
		int i_6_ = i - i_4_;
		if (i_5_ != 0) {
			if (i_6_ == 0) {
				method1226(4, i_3_, i_4_, i_1_, i_2_);
				return;
			}
		} else {
			if (i_6_ != 0)
				Class79.method1387(i_3_, i_2_, i, i_4_, 82);
			return;
		}
		if (i_5_ < 0)
			i_5_ = -i_5_;
		if (i_6_ < 0)
			i_6_ = -i_6_;
		boolean bool = i_6_ > i_5_;
		if (bool) {
			int i_7_ = i_1_;
			int i_8_ = i_3_;
			i_3_ = i_4_;
			i_4_ = i_8_;
			i_1_ = i;
			i = i_7_;
		}
		if (i_1_ < i_3_) {
			int i_9_ = i_3_;
			int i_10_ = i_4_;
			i_3_ = i_1_;
			i_4_ = i;
			i_1_ = i_9_;
			i = i_10_;
		}
		if (i_0_ < 9)
			anInt4614 = 39;
		int i_11_ = i_4_;
		int i_12_ = i - i_4_;
		if (i_12_ < 0)
			i_12_ = -i_12_;
		int i_13_ = -i_3_ + i_1_;
		int i_14_ = -(i_13_ >> 1);
		int i_15_ = i_4_ < i ? 1 : -1;
		if (!bool) {
			for (int i_16_ = i_3_; i_16_ <= i_1_; i_16_++) {
				i_14_ += i_12_;
				Static2.anIntArrayArray4038[i_11_][i_16_] = i_2_;
				if (i_14_ > 0) {
					i_14_ -= i_13_;
					i_11_ += i_15_;
				}
			}
		} else {
			for (int i_17_ = i_3_; i_1_ >= i_17_; i_17_++) {
				Static2.anIntArrayArray4038[i_17_][i_11_] = i_2_;
				i_14_ += i_12_;
				if (i_14_ > 0) {
					i_14_ -= i_13_;
					i_11_ += i_15_;
				}
			}
		}
	}
	public static Class124 aClass124_4607 = Class14_Sub2_Sub2.method263(1178, "Hidden)2use");

	public static Class9_Sub1 aClass9_Sub1_4603;

	public static int anInt4601 = 0;

	public static volatile int anInt4602 = 0;

	public static int anInt4608 = 0;

	public static String aString4605;

	public static void method644(int i, byte i_0_) {
		Class14_Sub1 class14_sub1 = ((Class14_Sub1) aClass55_4155.getFirst());
		if (i_0_ <= 24)
			JunkTex.method647(-118, -4, -122, -121, null, 59);
		for (/**/; class14_sub1 != null; class14_sub1 = (Class14_Sub1) aClass55_4155
				.getNext()) {
			if ((class14_sub1.key >> 48 & 0xffffL) == (long) i)
				class14_sub1.unlink();
		}
	}
	public static void method645(byte i, int i_1_, int i_2_) {
		if (i > -9)
			anInt4602 = 17;
		Class14_Sub2_Sub13 class14_sub2_sub13 = JunkTex.method626(-121, i_1_, 1);
		class14_sub2_sub13.method326();
		class14_sub2_sub13.anInt3920 = i_2_;
	}
	public static void method646(boolean bool) {
		aClass124_4607 = null;
		aClass9_Sub1_4603 = null;
		aString4605 = null;
		if (!bool)
			method645((byte) 36, 112, 118);
	}
	public static int method647(int i, int i_3_, int i_4_, int i_5_, int[][] is, int i_6_) {
		if (i_3_ != -501955161) {
			int i_7_ = 114;
			return i_7_;
		}
		int i_8_ = i_4_ * is[i_6_ + 1][i] + (-i_4_ + 128) * is[i_6_][i] >> 39;
		int i_9_ = (i_4_ * is[i_6_ + 1][i + 1] + is[i_6_][i + 1] * (-i_4_ + 128) >> 39);
		int i_10_ = i_9_ * i_5_ + i_8_ * (128 - i_5_) >> 7;
		return i_10_;
	}
	public static void method648(byte i) {
		int i_11_ = 52 % ((-23 - i) / 47);
		for (;;) {
			Deque deque = JunkTex.aClass2_4404;
			Class14_Sub19 class14_sub19;
			synchronized (deque) {
				class14_sub19 = (Class14_Sub19) aClass2_99.popFront();
			}
			if (class14_sub19 == null)
				break;
			class14_sub19.aClass9_Sub1_3076.method182(class14_sub19.aClass114_3077, (int) class14_sub19.key,
					class14_sub19.aByteArray3069, false, (byte) 55);
		}
	}
	public static Class4 method649(int i, int i_12_, int i_13_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_12_][i_13_];
		if (class14_sub29 == null)
			return null;
		Class4 class4 = class14_sub29.aClass4_3237;
		class14_sub29.aClass4_3237 = null;
		return class4;
	}
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4595;

	public static SoftCache aClass52_4588 = new SoftCache(50);

	public static SoftCache aClass52_4596 = new SoftCache(4);

	public static int anInt4594 = -1;

	public static int anInt4597;

	public static int anInt4598 = 0;

	public static int anInt4599 = 0;

	public static void method637(Class133_Sub1 class133_sub1, int i, int i_0_) {
		if (class133_sub1.anInt3494 > Class14_Sub2_Sub20.anInt4064)
			method498(class133_sub1, (byte) -82);
		else if (class133_sub1.anInt3455 < Class14_Sub2_Sub20.anInt4064)
			Class14_Sub2_Sub10.method307(-125, class133_sub1);
		else
			JunkTex.method613(class133_sub1, -120);
		if (i_0_ < -4) {
			if (class133_sub1.anInt3495 < 128 || class133_sub1.anInt3436 < 128 || class133_sub1.anInt3495 >= 13184
					|| class133_sub1.anInt3436 >= 13184) {
				class133_sub1.anInt3487 = -1;
				class133_sub1.anInt3495 = (class133_sub1.anIntArray3476[0] * 128 + class133_sub1.anInt3493 * 64);
				class133_sub1.anInt3455 = 0;
				class133_sub1.anInt3494 = 0;
				class133_sub1.anInt3445 = -1;
				class133_sub1.anInt3436 = (class133_sub1.anInt3493 * 64 + class133_sub1.anIntArray3443[0] * 128);
				class133_sub1.method1794(false);
			}
			if (class133_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748
					&& (class133_sub1.anInt3495 < 1536 || class133_sub1.anInt3436 < 1536
							|| class133_sub1.anInt3495 >= 11776 || class133_sub1.anInt3436 >= 11776)) {
				class133_sub1.anInt3494 = 0;
				class133_sub1.anInt3455 = 0;
				class133_sub1.anInt3445 = -1;
				class133_sub1.anInt3495 = (class133_sub1.anInt3493 * 64 + class133_sub1.anIntArray3476[0] * 128);
				class133_sub1.anInt3436 = (class133_sub1.anIntArray3443[0] * 128 + class133_sub1.anInt3493 * 64);
				class133_sub1.anInt3487 = -1;
				class133_sub1.method1794(false);
			}
			Class47.method1183((byte) 117, class133_sub1);
			Class125.method1722(class133_sub1, (byte) -87);
		}
	}
	public static void method639(int i) {
		Class14_Sub2_Sub8.anImage3830 = null;
		Class123.aFont2063 = null;
		Class14_Sub19.aFontMetrics3081 = null;
		if (i != -1)
			aClass52_4596 = null;
	}
	public static void method640(int i) {
		aClass14_Sub2_Sub19Array4595 = null;
		if (i < 118)
			method640(14);
		aClass52_4596 = null;
		aClass52_4588 = null;
	}
	public static Class14_Sub2_Sub19_Sub1 method641(byte i) {
		int i_1_ = 71 / ((i + 32) / 55);
		int i_2_ = Class17.anIntArray402[0] * Class76.anIntArray1204[0];
		byte[] is = Class12.aByteArrayArray310[0];
		int[] is_3_ = new int[i_2_];
		for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
			is_3_[i_4_] = anIntArray1114[JunkTex.method617(is[i_4_], 255)];
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(Class14_Sub11.anInt2952,
				Class14_Sub30.anInt3279, Class40.anIntArray675[0], Class14_Sub2_Sub12.anIntArray3918[0],
				Class17.anIntArray402[0], Class76.anIntArray1204[0], is_3_);
		Class129.method1761((byte) 95);
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_5_ = class14_sub2_sub19_sub1;
		return class14_sub2_sub19_sub1_5_;
	}
	public static void method642(int i, int i_6_, int i_7_, int i_8_, Class133 class133, long l, boolean bool) {
		if (class133 != null) {
			Class4 class4 = new Class4();
			class4.aClass133_124 = class133;
			class4.anInt136 = i_6_ * 128 + 64;
			class4.anInt122 = i_7_ * 128 + 64;
			class4.anInt121 = i_8_;
			class4.aLong132 = l;
			class4.aBoolean133 = bool;
			if (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_] == null)
				Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_] = new Class14_Sub29(i, i_6_, i_7_);
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_].aClass4_3237 = class4;
		}
	}
	public static void method643(int i, byte i_9_) {
		Container container;
		if (aFrame3962 != null)
			container = aFrame3962;
		else if (Class14_Sub14.aFrame2986 == null)
			container = aClass43_4647.applet;
		else
			container = Class14_Sub14.aFrame2986;
		anInt4622 = container.getSize().width;
		Class14_Sub2_Sub21.anInt4086 = container.getSize().height;
		if (Class14_Sub14.aFrame2986 == container) {
			Insets insets = Class14_Sub14.aFrame2986.getInsets();
			Class14_Sub2_Sub21.anInt4086 -= insets.top + insets.bottom;
			anInt4622 -= insets.right + insets.left;
		}
		if (aBoolean845 || aFrame3962 != null) {
			Class14_Sub20.anInt3094 = -Class14_Sub13.anInt2964 + Class14_Sub2_Sub21.anInt4086;
			Class83.anInt1340 = anInt4622;
			Class76.anInt1197 = Class14_Sub13.anInt2964;
			anInt895 = 0;
		} else {
			Class14_Sub20.anInt3094 = 503;
			Class83.anInt1340 = 765;
			Class76.anInt1197 = Class14_Sub13.anInt2964;
			anInt895 = (anInt4622 - 765) / 2;
		}
		RT4GL.method1628(Class83.anInt1340, Class14_Sub20.anInt3094);
		Class49.aCanvas819.setSize(Class83.anInt1340, Class14_Sub20.anInt3094);
		if (container == Class14_Sub14.aFrame2986) {
			Insets insets = Class14_Sub14.aFrame2986.getInsets();
			Class49.aCanvas819.setLocation(insets.left + anInt895, Class76.anInt1197 + insets.top);
		} else
			Class49.aCanvas819.setLocation(anInt895, Class76.anInt1197);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			method1032(true, -1291652884);
		Class132.method1779(0);
		if (Class43.os_name_lc.startsWith("mac"))
			Class132.aLong2169 = TimeUtil.getTime() - -(long) i;
		if (i_9_ > -77)
			method643(-67, (byte) 80);
		Class56_Sub1.aLong3317 = TimeUtil.getTime() - -(long) i;
		if (i == 0 && Class14_Sub15.aClass36_2990 != null
				&& (JunkTex.anInt4356 == 30 || JunkTex.anInt4356 == 25))
			Class88.method1436((byte) -92);
	}
	public static boolean[][] aBooleanArrayArray4138;

	public static byte[][][] aByteArrayArrayArray4130;

	public static int anInt4124 = 0;

	public static int anInt4128;

	public static int anInt4132 = 0;

	public static int anInt4135 = 0;

	public static int[] anIntArray4139 = new int[128];

	public static short[] aShortArray4133 = { -4160, -4163, -8256, -8259, 22461 };

	public static void method491(int i) {
		aByteArrayArrayArray4130 = null;
		if (i == 0) {
			anIntArray4139 = null;
			aShortArray4133 = null;
			aBooleanArrayArray4138 = null;
		}
	}
	public static int method492(int i, int i_0_) {
		if (i != 11604) {
			int i_1_ = 76;
			return i_1_;
		}
		int i_2_ = i_0_ & 0xff;
		return i_2_;
	}
	public static void method493(byte i, Class124 class124, Class124 class124_3_, int i_4_, Class124 class124_5_,
			int i_6_) {
		for (int i_7_ = 99; i_7_ > 0; i_7_--) {
			Class114.anIntArray1902[i_7_] = Class114.anIntArray1902[i_7_ - 1];
			aClass124Array4626[i_7_] = aClass124Array4626[i_7_ - 1];
			Static2.aClass124Array4024[i_7_] = Static2.aClass124Array4024[i_7_ - 1];
			Class124.aClass124Array2508[i_7_] = Class124.aClass124Array2508[i_7_ - 1];
			Class133.anIntArray2176[i_7_] = Class133.anIntArray2176[i_7_ - 1];
		}
		if (i > -46)
			aByteArrayArrayArray4130 = null;
		aClass124Array4626[0] = class124_3_;
		Class114.anIntArray1902[0] = i_4_;
		Static2.anInt4877 = JunkTex.anInt4478;
		Class53.anInt874++;
		Static2.aClass124Array4024[0] = class124_5_;
		Class133.anIntArray2176[0] = i_6_;
		Class124.aClass124Array2508[0] = class124;
	}
	public static void method494(byte i) {
		if (aClass141_4239 != null) {
			rs.Class141 class141 = aClass141_4239;
			synchronized (class141) {
				aClass141_4239 = null;
			}
		}
		if (i > -64)
			method491(-123);
	}
	public static void method495(byte i, boolean bool) {
		Class53.aBoolean865 = bool;
		if (i != -47)
			method491(-27);
		aBoolean2539 = !Class128.method1755(130068615);
	}
	public static boolean[] aBooleanArray4581 = new boolean[112];

	public static Class124 aClass124_4574 = Class14_Sub2_Sub2.method263(1178, "overlay2");

	public static Class148[] aClass148Array4580;

	public static void method633(byte i, int i_0_, Class9_Sub1 class9_sub1, int i_1_, boolean bool, int i_2_,
			int i_3_) {
		long l = (long) (i_3_ + (i_1_ << 16));
		if (i_0_ >= 98) {
			Class14_Sub2_Sub9 class14_sub2_sub9 = ((Class14_Sub2_Sub9) Static2.aClass55_1092.get(l));
			if (class14_sub2_sub9 == null) {
				class14_sub2_sub9 = (Class14_Sub2_Sub9) JunkTex.aClass55_4112.get(l);
				if (class14_sub2_sub9 == null) {
					class14_sub2_sub9 = (Class14_Sub2_Sub9) Class7_Sub2_Sub1.aClass55_3698.get(l);
					if (class14_sub2_sub9 != null) {
						if (bool) {
							class14_sub2_sub9.unlinkCacheable();
							Static2.aClass55_1092.put(l, class14_sub2_sub9);
							Class63.anInt998--;
							anInt4612++;
						}
					} else {
						if (!bool) {
							class14_sub2_sub9 = ((Class14_Sub2_Sub9) aClass55_4227.get(l));
							if (class14_sub2_sub9 != null)
								return;
						}
						class14_sub2_sub9 = new Class14_Sub2_Sub9();
						class14_sub2_sub9.aClass9_Sub1_3857 = class9_sub1;
						class14_sub2_sub9.aByte3862 = i;
						class14_sub2_sub9.anInt3865 = i_2_;
						if (!bool) {
							aClass81_4716.push(class14_sub2_sub9);
							Class7_Sub2_Sub1.aClass55_3698.put(l, class14_sub2_sub9);
							Class63.anInt998++;
						} else {
							Static2.aClass55_1092.put(l, class14_sub2_sub9);
							anInt4612++;
						}
					}
				}
			}
		}
	}
	public static int method634(int i, int i_4_, int i_5_, int i_6_) {
		i_5_ &= 0x3;
		if (i_4_ != -207592252) {
			int i_7_ = 72;
			return i_7_;
		}
		if (i_5_ == 0) {
			int i_8_ = i_6_;
			return i_8_;
		}
		if (i_5_ == 1) {
			int i_9_ = i;
			return i_9_;
		}
		if (i_5_ == 2) {
			int i_10_ = -i_6_ + 1023;
			return i_10_;
		}
		int i_11_ = -i + 1023;
		return i_11_;
	}
	public static void method635(int i) {
		aClass148Array4580 = null;
		if (i < -40) {
			aClass124_4574 = null;
			aBooleanArray4581 = null;
		}
	}
	public static void method636(int i, int i_12_, int i_13_, int i_14_, boolean bool, Class9 class9, int i_15_) {
		Class38.anInt2624 = i;
		Class14_Sub15.anInt2989 = i_12_;
		Class14_Sub2_Sub11.anInt3889 = 1;
		Class9_Sub1.aClass9_2696 = class9;
		anInt3930 = i_15_;
		if (i_13_ != 25506)
			aClass148Array4580 = null;
		Class35.aBoolean593 = bool;
		anInt1132 = i_14_;
	}
	public static byte[][] aByteArrayArray4556;

	public static Class124 aClass124_4561 = Class14_Sub2_Sub2.method263(1178, "::fps ");

	public static Class76 aClass76_4569;

	public static Class9 aClass9_4570;

	public static int anInt4560 = 1;

	public static short aShort4568 = 205;

	public static boolean method625(int i) {
		int i_0_ = 32 % ((-69 - i) / 42);
		do {
			if (Static2.anInt3352 != 0) {
				boolean bool;
				try {
					bool = !((Boolean) (aClass124_844.method1666(aClass43_4647.applet,
							false))).booleanValue();
				} catch (Throwable throwable) {
					Throwable throwable_1_ = new Throwable();
					break;
				}
				return bool;
			}
		} while (false);
		return true;
	}
	public static Class14_Sub2_Sub13 method626(int i, int i_2_, int i_3_) {
		if (i >= -101) {
			Class14_Sub2_Sub13 class14_sub2_sub13 = null;
			return class14_sub2_sub13;
		}
		Class14_Sub2_Sub13 class14_sub2_sub13 = ((Class14_Sub2_Sub13) Static2.aClass55_4048
				.get((long) i_3_ << 32 | (long) i_2_));
		if (class14_sub2_sub13 == null) {
			class14_sub2_sub13 = new Class14_Sub2_Sub13(i_3_, i_2_);
			Static2.aClass55_4048.put(class14_sub2_sub13.key, class14_sub2_sub13);
		}
		Class14_Sub2_Sub13 class14_sub2_sub13_4_ = class14_sub2_sub13;
		return class14_sub2_sub13_4_;
	}
	public static void method627(boolean bool) {
		if (bool) {
			Class114.tileHeights = Class150.anIntArrayArrayArray2419;
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368 = Class40.aClass14_Sub29ArrayArrayArray674;
			RuntimeException_Sub1.aClass14_Sub27ArrayArray2464 = Class131.aClass14_Sub27ArrayArray2162;
		} else {
			Class114.tileHeights = Class149.anIntArrayArrayArray2391;
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368 = Class14_Sub14.aClass14_Sub29ArrayArrayArray2987;
			RuntimeException_Sub1.aClass14_Sub27ArrayArray2464 = Class14_Sub30.aClass14_Sub27ArrayArray3273;
		}
		Class83.anInt1338 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368.length;
	}
	public static void method628(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_) {
		if (Class51.anInt831 == 0 && !Class14_Sub4.aBoolean2784) {
			int i_10_ = anInt425;
			int i_11_ = JunkTex.anInt4547;
			int i_12_ = Class58.anInt948;
			int i_13_ = (i_11_ - i_10_) * (-i_6_ + i) / i_8_ + i_10_;
			int i_14_ = Class70.anInt1081;
			int i_15_ = i_12_ + (-i_12_ + i_14_) * (-i_7_ + i_5_) / i_9_;
			Class14_Sub11.method853(32, Class7.aClass124_174, i_15_, aClass124_4244, (short) 8, 0L,
					i_13_);
		}
		if (!bool)
			JunkTex.method630(-27, -49L);
		long l = -1L;
		for (int i_16_ = 0; i_16_ < Class14_Sub15.anInt2996; i_16_++) {
			long l_17_ = Class7_Sub3.aLongArray2685[i_16_];
			int i_18_ = (int) l_17_ & 0x7f;
			int i_19_ = ((int) l_17_ & 0x3fb3) >> 39;
			int i_20_ = (int) l_17_ >> 29 & 0x3;
			int i_21_ = (int) (l_17_ >>> 32) & 0x7fffffff;
			if (l_17_ != l) {
				l = l_17_;
				if (i_20_ == 2 && Class139.method1952(Class14_Sub2_Sub3.anInt3785, i_18_, i_19_, l_17_)) {
					Class79 class79 = Class79.method1377((byte) -106, i_21_);
					if (class79.anIntArray1276 != null)
						class79 = class79.method1391(1);
					if (class79 == null)
						continue;
					if (Class51.anInt831 != 1) {
						if (Class14_Sub4.aBoolean2784) {
							if ((anInt101 & 0x4) == 4)
								Class14_Sub11.method853(32, Class125.aClass124_2082, i_19_,
										(method515((new Class124[] { Class17.aClass124_408,
												Static2.aClass124_360, class79.aClass124_1290 }), (byte) -106)),
										(short) 23, l_17_, i_18_);
						} else {
							Class124[] class124s = class79.aClass124Array1282;
							if (Class49.aBoolean814)
								class124s = Static2.method1545(5, class124s);
							if (class124s != null) {
								for (int i_22_ = 4; i_22_ >= 0; i_22_--) {
									if (class124s[i_22_] != null) {
										short i_23_ = 0;
										if (i_22_ == 0)
											i_23_ = (short) 39;
										if (i_22_ == 1)
											i_23_ = (short) 46;
										if (i_22_ == 2)
											i_23_ = (short) 51;
										if (i_22_ == 3)
											i_23_ = (short) 19;
										if (i_22_ == 4)
											i_23_ = (short) 1003;
										Class14_Sub11.method853(32, class124s[i_22_], i_19_,
												(method515((new Class124[] {
														(JunkTex.aClass124_4359), class79.aClass124_1290 }),
														(byte) -79)),
												i_23_, l_17_, i_18_);
									}
								}
							}
							Class14_Sub11.method853(32, aClass124_2802, i_19_,
									(method515((new Class124[] { JunkTex.aClass124_4359,
											class79.aClass124_1290 }), (byte) -86)),
									(short) 1004, (long) class79.anInt1257, i_18_);
						}
					} else
						Class14_Sub11.method853(32, Class40.aClass124_665, i_19_,
								(method515((new Class124[] { (Class14_Sub6.aClass124_2809),
										Static2.aClass124_360, class79.aClass124_1290 }), (byte) -66)),
								(short) 21, l_17_, i_18_);
				}
				if (i_20_ == 1) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_21_];
					if (class133_sub1_sub2.aClass12_4949.anInt334 == 1 && (class133_sub1_sub2.anInt3495 & 0x7f) == 64
							&& (class133_sub1_sub2.anInt3436 & 0x7f) == 64) {
						for (int i_24_ = 0; JunkTex.anInt4306 > i_24_; i_24_++) {
							Class133_Sub1_Sub2 class133_sub1_sub2_25_ = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[anIntArray3965[i_24_]]);
							if (class133_sub1_sub2_25_ != null && class133_sub1_sub2 != class133_sub1_sub2_25_
									&& (class133_sub1_sub2_25_.aClass12_4949.anInt334) == 1
									&& (class133_sub1_sub2.anInt3495 == class133_sub1_sub2_25_.anInt3495)
									&& (class133_sub1_sub2.anInt3436 == class133_sub1_sub2_25_.anInt3436))
								Class66.method1297(i_19_, (class133_sub1_sub2_25_.aClass12_4949), i_18_,
										(anIntArray3965[i_24_]), (byte) 114);
						}
						for (int i_26_ = 0; i_26_ < Static2.anInt2878; i_26_++) {
							Class133_Sub1_Sub1 class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_26_]]);
							if (class133_sub1_sub1 != null
									&& (class133_sub1_sub1.anInt3495 == class133_sub1_sub2.anInt3495)
									&& (class133_sub1_sub1.anInt3436 == class133_sub1_sub2.anInt3436))
								JunkTex.method591(118, class133_sub1_sub1, i_19_, i_18_,
										Static2.anIntArray351[i_26_]);
						}
					}
					Class66.method1297(i_19_, class133_sub1_sub2.aClass12_4949, i_18_, i_21_, (byte) 77);
				}
				if (i_20_ == 0) {
					Class133_Sub1_Sub1 class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[i_21_]);
					if ((class133_sub1_sub1.anInt3495 & 0x7f) == 64 && (class133_sub1_sub1.anInt3436 & 0x7f) == 64) {
						for (int i_27_ = 0; i_27_ < JunkTex.anInt4306; i_27_++) {
							Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[anIntArray3965[i_27_]]);
							if (class133_sub1_sub2 != null && (class133_sub1_sub2.aClass12_4949.anInt334 == 1)
									&& (class133_sub1_sub1.anInt3495 == class133_sub1_sub2.anInt3495)
									&& (class133_sub1_sub1.anInt3436 == class133_sub1_sub2.anInt3436))
								Class66.method1297(i_19_, (class133_sub1_sub2.aClass12_4949), i_18_,
										(anIntArray3965[i_27_]), (byte) 102);
						}
						for (int i_28_ = 0; i_28_ < Static2.anInt2878; i_28_++) {
							Class133_Sub1_Sub1 class133_sub1_sub1_29_ = (JunkTex.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_28_]]);
							if (class133_sub1_sub1_29_ != null && class133_sub1_sub1 != class133_sub1_sub1_29_
									&& (class133_sub1_sub1_29_.anInt3495 == class133_sub1_sub1.anInt3495)
									&& (class133_sub1_sub1_29_.anInt3436 == class133_sub1_sub1.anInt3436))
								JunkTex.method591(106, class133_sub1_sub1_29_, i_19_, i_18_,
										Static2.anIntArray351[i_28_]);
						}
					}
					JunkTex.method591(86, class133_sub1_sub1, i_19_, i_18_, i_21_);
				}
				if (i_20_ == 3) {
					Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_18_][i_19_]);
					if (deque != null) {
						for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
								.getTail(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
										.getPrevious()) {
							int i_30_ = (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557);
							Class142 class142 = JunkTex.method605(119, i_30_);
							if (Class51.anInt831 == 1)
								Class14_Sub11.method853(32, Class40.aClass124_665, i_19_,
										(method515(
												(new Class124[] { Class14_Sub6.aClass124_2809,
														Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
												(byte) -102)),
										(short) 9, (long) i_30_, i_18_);
							else if (Class14_Sub4.aBoolean2784) {
								if ((anInt101 & 0x1) == 1)
									Class14_Sub11.method853(32, Class125.aClass124_2082, i_19_,
											(method515(
													(new Class124[] { Class17.aClass124_408,
															Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
													(byte) -2)),
											(short) 6, (long) i_30_, i_18_);
							} else {
								Class124[] class124s = class142.aClass124Array2263;
								if (Class49.aBoolean814)
									class124s = Static2.method1545(5, class124s);
								for (int i_31_ = 4; i_31_ >= 0; i_31_--) {
									if (class124s != null && class124s[i_31_] != null) {
										short i_32_ = 0;
										if (i_31_ == 0)
											i_32_ = (short) 17;
										if (i_31_ == 1)
											i_32_ = (short) 41;
										if (i_31_ == 2)
											i_32_ = (short) 24;
										if (i_31_ == 3)
											i_32_ = (short) 3;
										if (i_31_ == 4)
											i_32_ = (short) 38;
										Class14_Sub11.method853(32, class124s[i_31_], i_19_,
												(method515((new Class124[] {
														(JunkTex.aClass124_4101), class142.aClass124_2296 }),
														(byte) -22)),
												i_32_, (long) i_30_, i_18_);
									} else if (i_31_ == 2)
										Class14_Sub11.method853(32, JunkTex.aClass124_4368, i_19_,
												(method515((new Class124[] {
														(JunkTex.aClass124_4101), class142.aClass124_2296 }),
														(byte) -3)),
												(short) 24, (long) i_30_, i_18_);
								}
								Class14_Sub11.method853(32, aClass124_2802, i_19_,
										(method515((new Class124[] { JunkTex.aClass124_4101,
												class142.aClass124_2296 }), (byte) -58)),
										(short) 1006, (long) i_30_, i_18_);
							}
						}
					}
				}
			}
		}
	}
	public static void method629(int i) {
		aClass124_4561 = null;
		aClass9_4570 = null;
		aClass76_4569 = null;
		if (i > -116)
			method626(-55, 44, -121);
		aByteArrayArray4556 = null;
	}
	public static void method630(int i, long l) {
		if (0L != l) {
			if ((Static2.anInt3728 >= 100 && Class14_Sub20.anInt3090 != 1)
					|| Static2.anInt3728 >= 200)
				Class15.method943(Class117.aClass124_1941, false, aClass124_4244, 0);
			else {
				Class124 class124 = Static2.method1174(l, (byte) 95).method1685(0);
				for (int i_33_ = 0; i_33_ < Static2.anInt3728; i_33_++) {
					if (Class133_Sub1_Sub2.aLongArray4951[i_33_] == l) {
						Class15.method943((method515((new Class124[] { class124, Class97.aClass124_1640 }), (byte) -63)), false,
								aClass124_4244, 0);
						return;
					}
				}
				int i_34_ = 0;
				if (i == 1003) {
					for (/**/; i_34_ < Class42.anInt698; i_34_++) {
						if (l == Class126.aLongArray2095[i_34_]) {
							Class15.method943(
									(method515((new Class124[] { Class138.aClass124_2219, class124,
											(JunkTex.aClass124_4315) }), (byte) -87)),
									false, aClass124_4244, 0);
							return;
						}
					}
					if (class124.method1704((Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922), (byte) 105))
						Class15.method943(aClass124_4202, false, aClass124_4244, 0);
					else {
						Static2.aClass124Array2938[(Static2.anInt3728)] = class124;
						Class133_Sub1_Sub2.aLongArray4951[(Static2.anInt3728)] = l;
						Class45.anIntArray743[Static2.anInt3728] = 0;
						aClass124Array3959[Static2.anInt3728] = aClass124_4244;
						Static2.anIntArray3720[(Static2.anInt3728)] = 0;
						Class58.aBooleanArray950[Static2.anInt3728] = false;
						Class38.anInt2616 = JunkTex.anInt4478;
						Static2.anInt3728++;
						aClass14_Sub10_Sub1_891.writeOpcode(30);
						aClass14_Sub10_Sub1_891.method817(l, 124);
					}
				}
			}
		}
	}
	public static void method631(int i, int i_35_) {
		Class97.anInt1656 = i_35_;
		if (i <= -82)
			Static2.anInt365 = 50;
	}
	public static void method632(int i) {
		if (i == 26423884 && Class14_Sub4.aBoolean2784) {
			Class94 class94 = Class14_Sub6.method464(Class14_Sub29.anInt3238, Class14_Sub2_Sub11.anInt3874, (byte) -19);
			if (class94 != null && class94.anObjectArray1468 != null) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115 = class94.anObjectArray1468;
				Class133_Sub3.method1830(class14_sub21, i - 2003341573);
			}
			Class14_Sub4.aBoolean2784 = false;
			Class103.method1531(class94);
		}
	}
	public static Class124 aClass124_4538;

	public static Class124 aClass124_4541;

	public static Class124 aClass124_4545;

	public static Class124 aClass124_4552;

	public static Class124[] aClass124Array4549;

	public static Queue aClass81_4546;

	public static int anInt4547;

	public static int anInt4548;

	public static int anInt4550;

	public static int[] anIntArray4544 = new int[500];

	public static void method621(byte i) {
		Class14_Sub13.method859(0, 5);
		Class4.method109(16, 5);
		JunkTex.method548(5, 1);
		Class140.method1957(true, 5);
		Class118.method1606(123, 5);
		Class14_Sub11.method851(1, 5);
		int i_0_ = 116 % ((i - 44) / 63);
		method1130(5, 11300);
		Class141.method1960(5, 74);
		method88(true, 5);
		Class53.method1215(-23980, 5);
		Class7_Sub3.method131(5, -54);
		Class133_Sub6.method1853(50, -32768);
		Class14_Sub25.method915(5, 28091);
		Class14_Sub30.method937(5, false);
		aClass52_4596.method1208(5);
	}
	public static Class148 method622(int i, int i_1_, Class9 class9) {
		if (i_1_ != 0) {
			Class148 class148 = null;
			return class148;
		}
		if (!method1027(class9, i, (byte) 100)) {
			Class148 class148 = null;
			return class148;
		}
		Class148 class148 = method1021((byte) 71);
		return class148;
	}
	public static void method623(boolean bool, Class14_Sub2_Sub16 class14_sub2_sub16) {
		if (bool)
			anInt4550 = -16;
		int i = Class14_Sub20.anInt3094;
		int i_2_ = i * 956 / 503;
		Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389((Class83.anInt1340 - i_2_) / 2, 0, i_2_, i);
		Class133_Sub1_Sub1.aClass148_4915
				.method2001((Class83.anInt1340 / 2 - (Class133_Sub1_Sub1.aClass148_4915.width) / 2), 18);
		class14_sub2_sub16.method345(Class53.aClass124_869, Class83.anInt1340 / 2, Class14_Sub20.anInt3094 / 2 - 26,
				16777215, -1);
		i = Class14_Sub20.anInt3094 / 2 - 18;
		Class25.method1003(Class83.anInt1340 / 2 - 152, i, 304, 34, 9179409);
		Class25.method1003(Class83.anInt1340 / 2 - 151, i + 1, 302, 32, 0);
		Class25.method1004(Class83.anInt1340 / 2 - 150, i + 2, Class51.anInt828 * 3, 30, 9179409);
		Class25.method1004(Class51.anInt828 * 3 + Class83.anInt1340 / 2 - 150, i + 2, -(Class51.anInt828 * 3) + 300, 30,
				0);
		class14_sub2_sub16.method345(Class14_Sub9_Sub1.aClass124_4761, Class83.anInt1340 / 2,
				Class14_Sub20.anInt3094 / 2 + 4, 16777215, -1);
	}
	public static void method624(int i) {
		aClass124_4541 = null;
		if (i != 2)
			method624(-69);
		aClass124_4552 = null;
		aClass124_4538 = null;
		aClass124Array4549 = null;
		aClass124_4545 = null;
		aClass81_4546 = null;
		anIntArray4544 = null;
	}
	public static boolean aBoolean4528;

	public static Class124 aClass124_4529;

	public static Class9_Sub1 aClass9_Sub1_4521;

	public static int anInt4525;

	public static int anInt4526;

	public static int anInt4527 = (int) (Math.random() * 33.0) - 16;

	public static int anInt4530;

	public static int anInt4532;

	public static byte[] method616(byte[] is, int i) {
		if (i <= 75) {
			byte[] is_0_ = null;
			return is_0_;
		}
		int i_1_ = is.length;
		byte[] is_2_ = new byte[i_1_];
		Class72.method1322(is, 0, is_2_, 0, i_1_);
		byte[] is_3_ = is_2_;
		return is_3_;
	}
	public static int method617(int i, int i_4_) {
		int i_5_ = i & i_4_;
		return i_5_;
	}
	public static void method618(int i) {
		if (i != 1)
			aClass124_4529 = null;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < 104; i_7_++) {
			for (int i_8_ = 0; i_8_ < 104; i_8_++) {
				if (Static2.method1498(true, i_8_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368), i_7_, i_6_))
					i_6_++;
				if (i_6_ >= 512)
					return;
			}
		}
	}
	public static boolean method619(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (i_9_ == i_10_ && i_11_ == i_12_) {
			if (!Scenegraph.method1529(i, i_9_, i_11_))
				return false;
			int i_14_ = i_9_ << 7;
			int i_15_ = i_11_ << 7;
			if (Scenegraph.method1310(i_14_ + 1, (Class114.tileHeights[i][i_9_][i_11_] + i_13_), i_15_ + 1)
					&& Scenegraph.method1310(i_14_ + 128 - 1, (Class114.tileHeights[i][i_9_ + 1][i_11_]) + i_13_,
							i_15_ + 1)
					&& Scenegraph.method1310(i_14_ + 128 - 1, (Class114.tileHeights[i][i_9_ + 1][i_11_ + 1]) + i_13_,
							i_15_ + 128 - 1)
					&& Scenegraph.method1310(i_14_ + 1, (Class114.tileHeights[i][i_9_][i_11_ + 1]) + i_13_,
							i_15_ + 128 - 1))
				return true;
			return false;
		}
		for (int i_16_ = i_9_; i_16_ <= i_10_; i_16_++) {
			for (int i_17_ = i_11_; i_17_ <= i_12_; i_17_++) {
				if (anIntArrayArrayArray2724[i][i_16_][i_17_] == -Class67.anInt1059)
					return false;
			}
		}
		int i_18_ = (i_9_ << 7) + 1;
		int i_19_ = (i_11_ << 7) + 2;
		int i_20_ = Class114.tileHeights[i][i_9_][i_11_] + i_13_;
		if (!Scenegraph.method1310(i_18_, i_20_, i_19_))
			return false;
		int i_21_ = (i_10_ << 7) - 1;
		if (!Scenegraph.method1310(i_21_, i_20_, i_19_))
			return false;
		int i_22_ = (i_12_ << 7) - 1;
		if (!Scenegraph.method1310(i_18_, i_20_, i_22_))
			return false;
		if (!Scenegraph.method1310(i_21_, i_20_, i_22_))
			return false;
		return true;
	}
	public static void method620(boolean bool) {
		if (bool)
			method619(4, -52, 126, 78, -70, 66);
		aClass124_4529 = null;
		aClass9_Sub1_4521 = null;
	}
	public static boolean aBoolean4518;



	public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_4508;

	public static int anInt4505;

	public static int anInt4509;

	public static int anInt4515;

	public static int anInt4520;

	public static int[] anIntArray4512 = new int[1000];

	public static void method613(Class133_Sub1 class133_sub1, int i) {
		if (class133_sub1.anInt3455 == Class14_Sub2_Sub20.anInt4064 || class133_sub1.anInt3445 == -1
				|| class133_sub1.anInt3467 != 0 || (class133_sub1.anInt3458 + 1 > (method1129(class133_sub1.anInt3445, 45).anIntArray763[class133_sub1.anInt3501]))) {
			int i_0_ = Class14_Sub2_Sub20.anInt4064 - class133_sub1.anInt3494;
			int i_1_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3451 * 128;
			int i_2_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3472 * 128;
			int i_3_ = -class133_sub1.anInt3494 + class133_sub1.anInt3455;
			int i_4_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3478 * 128;
			class133_sub1.anInt3495 = (i_4_ * i_0_ + (-i_0_ + i_3_) * i_1_) / i_3_;
			int i_5_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3489 * 128;
			class133_sub1.anInt3436 = ((i_3_ - i_0_) * i_2_ + i_0_ * i_5_) / i_3_;
		}
		if (class133_sub1.anInt3444 == 0)
			class133_sub1.anInt3469 = 1024;
		class133_sub1.anInt3437 = 0;
		if (class133_sub1.anInt3444 == 1)
			class133_sub1.anInt3469 = 1536;
		if (i < -11) {
			if (class133_sub1.anInt3444 == 2)
				class133_sub1.anInt3469 = 0;
			if (class133_sub1.anInt3444 == 3)
				class133_sub1.anInt3469 = 512;
			class133_sub1.anInt3461 = class133_sub1.anInt3469;
		}
	}
	public static void method614(byte i) {
		aClass124_4511 = null;
		aClass14_Sub2_Sub19_4508 = null;
		aClass124_4510 = null;
		int i_6_ = -18 % ((37 - i) / 55);
		anIntArray4512 = null;
	}
	public static void method615(int i) {
		if (i != 300)
			anIntArray4512 = null;
		for (int i_7_ = 0; i_7_ < Class64.anInt1012; i_7_++) {
			int i_8_ = Class14_Sub2_Sub7.anIntArray3825[i_7_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_8_];
			int i_9_ = aClass14_Sub10_Sub1_4734.readUByte();
			if ((i_9_ & 0x10) != 0) {
				class133_sub1_sub2.anInt3453 = aClass14_Sub10_Sub1_4734.readUShort((byte) 117);
				if (class133_sub1_sub2.anInt3453 == 65535)
					class133_sub1_sub2.anInt3453 = -1;
			}
			if ((i_9_ & 0x8) != 0) {
				if (class133_sub1_sub2.aClass12_4949.method212((byte) -121))
					Class37.method1112(class133_sub1_sub2, (byte) -26);
				class133_sub1_sub2.aClass12_4949 = Class126
						.method1744(aClass14_Sub10_Sub1_4734.method791(-3977), i ^ 0x186);
				class133_sub1_sub2.anInt3432 = class133_sub1_sub2.aClass12_4949.anInt339;
				class133_sub1_sub2.anInt3493 = class133_sub1_sub2.aClass12_4949.anInt334;
				class133_sub1_sub2.anInt3457 = class133_sub1_sub2.aClass12_4949.anInt296;
				class133_sub1_sub2.anInt3492 = class133_sub1_sub2.aClass12_4949.anInt303;
				class133_sub1_sub2.anInt3471 = class133_sub1_sub2.aClass12_4949.anInt286;
				class133_sub1_sub2.anInt3433 = class133_sub1_sub2.aClass12_4949.anInt323;
				class133_sub1_sub2.anInt3454 = class133_sub1_sub2.aClass12_4949.anInt318;
				class133_sub1_sub2.anInt3463 = class133_sub1_sub2.aClass12_4949.anInt276;
				class133_sub1_sub2.anInt3484 = class133_sub1_sub2.aClass12_4949.anInt284;
				if (class133_sub1_sub2.aClass12_4949.method212((byte) -122))
					Class12.method213(class133_sub1_sub2.anIntArray3476[0], class133_sub1_sub2.anIntArray3443[0], null,
							(byte) -35, Class14_Sub2_Sub3.anInt3785, null, class133_sub1_sub2, 0);
			}
			if ((i_9_ & 0x40) != 0) {
				class133_sub1_sub2.aClass124_3462 = aClass14_Sub10_Sub1_4734.method797(i ^ 0x25d7);
				class133_sub1_sub2.anInt3473 = 100;
			}
			if ((i_9_ & 0x1) != 0) {
				int i_10_ = aClass14_Sub10_Sub1_4734.method836((byte) -14);
				if (i_10_ == 65535)
					i_10_ = -1;
				int i_11_ = aClass14_Sub10_Sub1_4734.readUByte();
				JunkTex.method610(i_10_, i_11_, class133_sub1_sub2, 12288);
			}
			if ((i_9_ & 0x2) != 0) {
				class133_sub1_sub2.anInt3487 = aClass14_Sub10_Sub1_4734.method836((byte) 123);
				int i_12_ = aClass14_Sub10_Sub1_4734.method820((byte) 109);
				if (class133_sub1_sub2.anInt3487 == 65535)
					class133_sub1_sub2.anInt3487 = -1;
				class133_sub1_sub2.anInt3459 = 0;
				class133_sub1_sub2.anInt3475 = i_12_ >> 48;
				class133_sub1_sub2.anInt3485 = Class14_Sub2_Sub20.anInt4064 + (i_12_ & 0xffff);
				class133_sub1_sub2.anInt3470 = 0;
				if (class133_sub1_sub2.anInt3485 > Class14_Sub2_Sub20.anInt4064)
					class133_sub1_sub2.anInt3470 = -1;
			}
			if ((i_9_ & 0x20) != 0) {
				int i_13_ = aClass14_Sub10_Sub1_4734.readUByte();
				int i_14_ = aClass14_Sub10_Sub1_4734.method832((byte) -108);
				class133_sub1_sub2.method1801(0, i_14_, Class14_Sub2_Sub20.anInt4064, i_13_);
			}
			if ((i_9_ & 0x80) != 0) {
				class133_sub1_sub2.anInt3504 = aClass14_Sub10_Sub1_4734.method836((byte) 125);
				class133_sub1_sub2.anInt3480 = aClass14_Sub10_Sub1_4734.method781(false);
			}
			if ((i_9_ & 0x4) != 0) {
				int i_15_ = aClass14_Sub10_Sub1_4734.readUByte();
				int i_16_ = aClass14_Sub10_Sub1_4734.readUByte();
				class133_sub1_sub2.method1801(0, i_16_, Class14_Sub2_Sub20.anInt4064, i_15_);
				class133_sub1_sub2.anInt3450 = Class14_Sub2_Sub20.anInt4064 + 300;
				class133_sub1_sub2.anInt3438 = aClass14_Sub10_Sub1_4734.method832((byte) -69);
			}
		}
	}
	public static Class124[] aClass124Array4499 = new Class124[1000];

	public static Class9 aClass9_4486;

	public static int anInt4503 = -1;

	public static short[][] aShortArrayArray4496;

	public static Class142 method605(int i, int i_0_) {
		Class142 class142 = (Class142) Class133_Sub1_Sub1.aClass52_4926.get((long) i_0_);
		if (class142 != null) {
			Class142 class142_1_ = class142;
			return class142_1_;
		}
		byte[] is = Class15.aClass9_384.method163(Class7.method116(i_0_, 14719), Class7.method115((byte) 124, i_0_), 0);
		Class142 class142_2_ = new Class142();
		class142_2_.anInt2276 = i_0_;
		if (is != null)
			class142_2_.method1971(new Buffer(is), true);
		class142_2_.method1967(78);
		if (class142_2_.anInt2316 != -1)
			class142_2_.method1968(method605(123, class142_2_.anInt2316), method605(97, class142_2_.anInt2268), 117);
		if (class142_2_.anInt2305 != -1)
			class142_2_.method1966(method605(93, class142_2_.anInt2305), -126, method605(86, class142_2_.anInt2257));
		if (i < 58)
			method605(37, -42);
		if (!Class14_Sub3.aBoolean2752 && class142_2_.aBoolean2306) {
			class142_2_.aBoolean2275 = false;
			class142_2_.aClass124Array2263 = null;
			class142_2_.anInt2310 = 0;
			class142_2_.aClass124_2296 = Class133_Sub3.aClass124_3568;
			class142_2_.aClass124Array2304 = null;
		}
		Class133_Sub1_Sub1.aClass52_4926.put(class142_2_, (long) i_0_);
		Class142 class142_3_ = class142_2_;
		return class142_3_;
	}
	public static void method606(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = i_5_;
		int i_14_ = -i_4_ + i_9_;
		int i_15_ = i_9_ * i_9_;
		int i_16_ = i_5_ - i_4_;
		int i_17_ = i_16_ * i_16_;
		int i_18_ = i_5_ * i_5_;
		int i_19_ = i_15_ << 1;
		int i_20_ = i_14_ * i_14_;
		int i_21_ = i_17_ << 33;
		int i_22_ = i_18_ << 33;
		int i_23_ = i_20_ << 33;
		int i_24_ = i_5_ << 33;
		int i_25_ = -(i_19_ * (i_24_ - 1)) + i_18_;
		int i_26_ = i_16_ << 1;
		int i_27_ = i_15_ * (-i_24_ + 1) + i_22_;
		int i_28_ = i_21_ + (-i_26_ + 1) * i_20_;
		int i_29_ = i_18_ << 2;
		int i_30_ = i_17_ - i_23_ * (i_26_ - 1);
		int i_31_ = i_15_ << 2;
		int i_32_ = i_20_ << 2;
		int i_33_ = i_17_ << 2;
		int i_34_ = i_22_ * 3;
		int i_35_ = i_21_ * 3;
		int i_36_ = (i_24_ - 3) * i_19_;
		int i_37_ = i_23_ * (i_26_ - 3);
		if (i_7_ == -15882) {
			i_15_ = i_29_;
			i_17_ = i_31_ * (i_5_ - 1);
			i_18_ = i_33_;
			i_19_ = (i_16_ - 1) * i_32_;
			int[] is = Static2.anIntArrayArray4038[i_6_];
			Class51.method1201(is, -i_9_ + i_10_, -i_14_ + i_10_, -5973, i_8_);
			Class51.method1201(is, -i_14_ + i_10_, i_14_ + i_10_, -5973, i);
			Class51.method1201(is, i_10_ + i_14_, i_10_ + i_9_, -5973, i_8_);
			while (i_13_ > 0) {
				if (i_27_ < 0) {
					while (i_27_ < 0) {
						i_25_ += i_15_;
						i_11_++;
						i_15_ += i_29_;
						i_27_ += i_34_;
						i_34_ += i_29_;
					}
				}
				if (i_25_ < 0) {
					i_27_ += i_34_;
					i_34_ += i_29_;
					i_11_++;
					i_25_ += i_15_;
					i_15_ += i_29_;
				}
				i_25_ -= i_36_;
				i_36_ -= i_31_;
				boolean bool = i_16_ >= i_13_;
				i_27_ -= i_17_;
				i_22_ = i_11_ + i_10_;
				if (bool) {
					if (i_28_ < 0) {
						while (i_28_ < 0) {
							i_12_++;
							i_30_ += i_18_;
							i_28_ += i_35_;
							i_35_ += i_33_;
							i_18_ += i_33_;
						}
					}
					if (i_30_ < 0) {
						i_12_++;
						i_28_ += i_35_;
						i_30_ += i_18_;
						i_35_ += i_33_;
						i_18_ += i_33_;
					}
					i_30_ -= i_37_;
					i_28_ -= i_19_;
					i_37_ -= i_32_;
					i_19_ -= i_32_;
				}
				i_17_ -= i_31_;
				i_23_ = i_10_ - i_11_;
				i_13_--;
				i_24_ = i_6_ - i_13_;
				i_26_ = i_6_ + i_13_;
				if (!bool) {
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_23_, i_22_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_23_, i_22_, -5973, i_8_);
				} else {
					int i_38_ = i_10_ + i_12_;
					int i_39_ = -i_12_ + i_10_;
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_23_, i_39_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_39_, i_38_, -5973, i);
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_38_, i_22_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_23_, i_39_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_39_, i_38_, -5973, i);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_38_, i_22_, i_7_ ^ 0x295d,
							i_8_);
				}
			}
		}
	}
	public static void method608(int i, boolean bool, int i_40_, int i_41_, byte[] is, int i_42_, byte i_43_,
			Class32[] class32s) {
		if (i_43_ <= 16)
			method605(-106, 125);
		if (!bool) {
			for (int i_44_ = 0; i_44_ < 4; i_44_++) {
				for (int i_45_ = 0; i_45_ < 64; i_45_++) {
					for (int i_46_ = 0; i_46_ < 64; i_46_++) {
						if (i_42_ + i_45_ > 0 && i_45_ + i_42_ < 103 && i_46_ + i_41_ > 0 && i_46_ + i_41_ < 103)
							class32s[i_44_].anIntArrayArray546[i_42_ + i_45_][i_46_ + i_41_] = (method617((class32s[i_44_].anIntArrayArray546[i_42_ + i_45_][i_46_ + i_41_]),
											-16777217));
					}
				}
			}
		}
		Buffer class14_sub10 = new Buffer(is);
		int i_47_;
		if (bool)
			i_47_ = 1;
		else
			i_47_ = 4;
		for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
			for (int i_49_ = 0; i_49_ < 64; i_49_++) {
				for (int i_50_ = 0; i_50_ < 64; i_50_++)
					MapRegion.decodeMapData(bool, i_48_, class14_sub10, 0, i, i_40_, i_42_ + i_49_, i_41_ + i_50_);
			}
		}
		if (!bool) {
			AtmosphericChunk atmosphericChunk = null;
			while (class14_sub10.position < class14_sub10.payload.length) {
				int i_51_ = class14_sub10.readUByte();
				if (i_51_ != 0) {
					if (i_51_ != 1)
						throw new IllegalStateException();
					int i_52_ = class14_sub10.readUByte();
					if (i_52_ > 0) {
						for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
							Light light = new Light(class14_sub10);
							light.param3 += i_41_ << 7;
							int i_54_ = light.param3 >> 39;
							light.param1 += i_42_ << 7;
							int i_55_ = light.param1 >> 39;
							if (i_55_ >= 0 && i_54_ >= 0 && i_55_ < 104 && i_54_ < 104) {
								light.param2 = (-light.param2
										+ (Class114.tileHeights[light.anInt1125][i_55_][i_54_]));
								LightManager.method200(light);
							}
						}
					}
				} else
					atmosphericChunk = new AtmosphericChunk(class14_sub10);
			}
			if (atmosphericChunk == null)
				atmosphericChunk = new AtmosphericChunk();
			for (int i_56_ = 0; i_56_ < 8; i_56_++) {
				for (int i_57_ = 0; i_57_ < 8; i_57_++) {
					int i_58_ = i_57_ + (i_41_ >> 3);
					int i_59_ = (i_42_ >> 35) + i_56_;
					if (i_59_ >= 0 && i_59_ < 13 && i_58_ >= 0 && i_58_ < 13)
						Class150.aClass71ArrayArray2421[i_59_][i_58_] = atmosphericChunk;
				}
			}
		}
	}
	public static void method610(int i, int i_60_, Class133_Sub1_Sub2 class133_sub1_sub2, int i_61_) {
		if (i == class133_sub1_sub2.anInt3445 && i != -1) {
			Animation animation = method1129(i, i_61_ ^ 0x302b);
			int i_62_ = animation.anInt753;
			if (i_62_ == 1) {
				class133_sub1_sub2.anInt3482 = 0;
				class133_sub1_sub2.anInt3458 = 0;
				class133_sub1_sub2.anInt3501 = 0;
				class133_sub1_sub2.anInt3467 = i_60_;
				method509(class133_sub1_sub2.anInt3495, class133_sub1_sub2.anInt3501, 25, false,
						animation, class133_sub1_sub2.anInt3436);
			}
			if (i_62_ == 2)
				class133_sub1_sub2.anInt3482 = 0;
		} else if (i == -1 || class133_sub1_sub2.anInt3445 == -1 || (method1129(i,
				-119).anInt777 >= (method1129(class133_sub1_sub2.anInt3445, -127).anInt777))) {
			class133_sub1_sub2.anInt3467 = i_60_;
			class133_sub1_sub2.anInt3458 = 0;
			class133_sub1_sub2.anInt3501 = 0;
			class133_sub1_sub2.anInt3482 = 0;
			class133_sub1_sub2.anInt3445 = i;
			class133_sub1_sub2.anInt3477 = class133_sub1_sub2.anInt3498;
			if (class133_sub1_sub2.anInt3445 != -1)
				method509(class133_sub1_sub2.anInt3495, class133_sub1_sub2.anInt3501, 113, false,
						method1129(class133_sub1_sub2.anInt3445, -122), class133_sub1_sub2.anInt3436);
		}
	}
	public static void method611(int i, Buffer class14_sub10) {
		if (class14_sub10.payload.length - class14_sub10.position >= 1) {
			int i_63_ = class14_sub10.readUByte();
			if (i_63_ >= 0 && i_63_ <= 3) {
				int i_64_;
				if (i_63_ != 3) {
					if (i_63_ != 2) {
						if (i_63_ != 1)
							i_64_ = 19;
						else
							i_64_ = 23;
					} else
						i_64_ = 22;
				} else
					i_64_ = 23;
				if ((class14_sub10.payload.length - class14_sub10.position) >= i_64_) {
					anInt4190 = class14_sub10.readUByte();
					if (anInt4190 >= 1) {
						if (anInt4190 > 4)
							anInt4190 = 4;
					} else
						anInt4190 = 1;
					method495((byte) -47, class14_sub10.readUByte() == 1);
					Class139.aBoolean2233 = class14_sub10.readUByte() == 1;
					Static2.aBoolean2372 = class14_sub10.readUByte() == 1;
					Class125_Sub3.aBoolean3397 = class14_sub10.readUByte() == 1;
					Class135.aBoolean2190 = class14_sub10.readUByte() == i;
					Class33.aBoolean584 = class14_sub10.readUByte() == 1;
					Class28.aBoolean516 = class14_sub10.readUByte() == 1;
					aBoolean4518 = class14_sub10.readUByte() == 1;
					Class89.anInt1413 = class14_sub10.readUByte();
					if (Class89.anInt1413 > 2)
						Class89.anInt1413 = 2;
					if (i_63_ < 2) {
						RT4.useLighting = class14_sub10.readUByte() == 1;
						class14_sub10.readUByte();
					} else
						RT4.useLighting = class14_sub10.readUByte() == 1;
					Class15.aBoolean374 = class14_sub10.readUByte() == 1;
					JunkTex.aBoolean4420 = class14_sub10.readUByte() == 1;
					Class135.anInt2189 = class14_sub10.readUByte();
					if (Class135.anInt2189 > 2)
						Class135.anInt2189 = 2;
					aBoolean4528 = class14_sub10.readUByte() == 1;
					Class14_Sub29.anInt3266 = class14_sub10.readUByte();
					if (Class14_Sub29.anInt3266 > 127)
						Class14_Sub29.anInt3266 = 127;
					Class14_Sub23.anInt3135 = class14_sub10.readUByte();
					Static2.anInt1691 = class14_sub10.readUByte();
					if (Static2.anInt1691 > 127)
						Static2.anInt1691 = 127;
					if (i_63_ >= 1) {
						Class54.anInt887 = class14_sub10.readUShort((byte) 121);
						Static2.anInt2725 = class14_sub10.readUShort((byte) 108);
					}
					if (i_63_ >= 3)
						aBoolean845 = class14_sub10.readUByte() == 1;
				}
			}
		}
	}
	public static void method612(byte i) {
		aShortArrayArray4496 = null;
		aClass9_4486 = null;
		aClass124Array4499 = null;
		if (i < 96)
			aShortArrayArray4496 = null;
	}
	public static Class124 aClass124_4481;

	public static Class124 aClass124_4482;

	public static Class133_Sub1_Sub1[] aClass133_Sub1_Sub1Array4474;

	public static Class148[] aClass148Array4473;

	public static Deque aClass2_4477;

	public static int anInt4478;

	public static int anInt4480;

	public static void method600(int i) {
		aClass133_Sub1_Sub1Array4474 = null;
		aClass124_4482 = null;
		aClass124_4481 = null;
		if (i != 1)
			JunkTex.method601(-75, null);
		aClass148Array4473 = null;
		aClass2_4477 = null;
	}
	public static void method601(int i, Buffer class14_sub10) {
		if (i < -7) {
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool = false;
				int i_0_ = 0;
				int i_1_ = 0;
				if (class14_sub10.readUByte() == 1) {
					bool = true;
					i_0_ = class14_sub10.readUByte();
					i_1_ = class14_sub10.readUByte();
				}
				int i_2_ = class14_sub10.readUByte();
				int i_3_ = class14_sub10.readUByte();
				int i_4_ = (Class35.anInt603 - i_3_ * 64 + (JunkTex.anInt4332 - 1));
				int i_5_ = -Class65.anInt1034 + i_2_ * 64;
				if (i_5_ < 0 || i_4_ - 63 < 0 || Class14_Sub2_Sub9.anInt3856 <= i_5_ + 63
						|| JunkTex.anInt4332 <= i_4_) {
					for (int i_6_ = 0; (!bool ? 4096 : 64) > i_6_; i_6_++) {
						int i_7_ = class14_sub10.readUByte();
						if (i_7_ != 0) {
							if ((i_7_ & 0x1) == 1)
								class14_sub10.position++;
							if ((i_7_ & 0x2) == 2)
								class14_sub10.position += 2;
							if ((i_7_ & 0x4) == 4)
								class14_sub10.position += 3;
						}
					}
				} else {
					int i_8_ = i_5_ >> 38;
					int i_9_ = i_4_ >> 6;
					for (int i_10_ = 0; i_10_ < 64; i_10_++) {
						for (int i_11_ = 0; i_11_ < 64; i_11_++) {
							if (!bool || (i_0_ * 8 <= i_10_ && i_10_ < i_0_ * 8 + 8 && i_11_ >= i_1_ * 8
									&& i_11_ < i_1_ * 8 + 8)) {
								int i_12_ = class14_sub10.readUByte();
								if (i_12_ != 0) {
									if ((i_12_ & 0x1) == 1) {
										int i_13_ = class14_sub10.readUByte();
										if ((Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_]) == null)
											Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_] = new byte[4096];
										Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_][i_10_
												+ (-i_11_ + 63 << 38)] = (byte) i_13_;
									}
									if ((i_12_ & 0x2) == 2) {
										int i_14_ = class14_sub10.readUShort((byte) 101);
										if ((Class79.aShortArrayArrayArray1247[i_8_][i_9_]) == null)
											Class79.aShortArrayArrayArray1247[i_8_][i_9_] = new short[4096];
										Class79.aShortArrayArrayArray1247[i_8_][i_9_][i_10_
												+ (-i_11_ + 63 << 38)] = (short) i_14_;
									}
									if ((i_12_ & 0x4) == 4) {
										int i_15_ = ((class14_sub10.readUByte() << 48 & 0xff0000)
												+ ((class14_sub10.readUByte() & 0xff) << 40)
												+ (class14_sub10.readUByte() & 0xff));
										if ((Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_]) == null)
											Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_] = new int[4096];
										Class79 class79 = Class79.method1377((byte) -106, --i_15_);
										if (class79.anIntArray1276 != null) {
											class79 = class79.method1391(1);
											if (class79 == null || class79.anInt1262 == -1)
												continue;
										}
										Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_][(-i_11_ + 63 << 6)
												+ i_10_] = class79.anInt1257 + 1;
										Class14_Sub20 class14_sub20 = new Class14_Sub20();
										class14_sub20.anInt3085 = class79.anInt1262;
										class14_sub20.anInt3083 = i_5_;
										class14_sub20.anInt3084 = i_4_;
										Class35.aClass2_589.pushBack(class14_sub20);
									}
								}
							}
						}
					}
				}
			}
		}
	}
	public static void method602(int i) {
		int i_16_ = Class14_Sub2_Sub8.method296((byte) 44);
		if (i != (i_16_ ^ 0xffffffff)) {
			if (i_16_ != 1) {
				MapRegion.method333((byte) (Class42.anInt699 - 4 & 0xff), (byte) -109);
				method499(false, 2);
			} else {
				MapRegion.method333((byte) 0, (byte) -79);
				method499(false, 512);
				method618(1);
			}
		} else {
			Class28.aByteArrayArrayArray512 = null;
			method499(false, 0);
		}
	}
	public static void method603(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_) {
		int i_25_ = -119 % ((i_23_ + 73) / 52);
		for (int i_26_ = 0; i_26_ < Class152.aClass146_2435.anInt2353; i_26_++) {
			int i_27_ = (Class35.anInt603
					- (Class152.aClass146_2435.aShortArray2361[i_26_] - (JunkTex.anInt4332 - 1)));
			int i_28_ = (Class152.aClass146_2435.aShortArray2354[i_26_] - Class65.anInt1034);
			int i_29_ = i_17_ + (i_21_ - i_17_) * (-i_19_ + i_27_) / (-i_19_ + i_24_);
			int i_30_ = (-i_18_ + i_28_) * (i_22_ - i) / (i_20_ - i_18_) + i;
			int i_31_ = Class152.aClass146_2435.method1994(i_26_, false);
			int i_32_ = 16777215;
			Class87 class87 = null;
			if (i_31_ == 0) {
				if (3.0 == (double) Class90.aFloat1426)
					class87 = Class14_Sub17.aClass87_3004;
				if (4.0 == (double) Class90.aFloat1426)
					class87 = Class48.aClass87_805;
				if (6.0 == (double) Class90.aFloat1426)
					class87 = Class54.aClass87_888;
				if (8.0 == (double) Class90.aFloat1426)
					class87 = aClass87_858;
			}
			if (i_31_ == 1) {
				if (3.0 == (double) Class90.aFloat1426)
					class87 = Class54.aClass87_888;
				if ((double) Class90.aFloat1426 == 4.0)
					class87 = aClass87_858;
				if ((double) Class90.aFloat1426 == 6.0)
					class87 = aClass87_4672;
				if ((double) Class90.aFloat1426 == 8.0)
					class87 = Class141.aClass87_2242;
			}
			if (i_31_ == 2) {
				if ((double) Class90.aFloat1426 == 3.0)
					class87 = aClass87_4672;
				i_32_ = 16755200;
				if ((double) Class90.aFloat1426 == 4.0)
					class87 = Class141.aClass87_2242;
				if ((double) Class90.aFloat1426 == 6.0)
					class87 = Class48.aClass87_803;
				if ((double) Class90.aFloat1426 == 8.0)
					class87 = Class132.aClass87_2171;
			}
			if (Class152.aClass146_2435.anIntArray2350[i_26_] != -1)
				i_32_ = Class152.aClass146_2435.anIntArray2350[i_26_];
			if (class87 != null) {
				Class124[] class124s = new Class124[Class152.aClass146_2435.aClass124Array2362[i_26_].method1670(false,
						60) + 1];
				Class56_Sub1.aClass14_Sub2_Sub16_3320.method351(Class152.aClass146_2435.aClass124Array2362[i_26_], null,
						class124s);
				int i_33_ = class124s.length;
				i_29_ -= (i_33_ - 1) * class87.method1432() / 2;
				i_29_ += class87.method1425() / 2;
				for (int i_34_ = 0; i_33_ > i_34_; i_34_++) {
					Class124 class124 = (i_33_ - 1 == i_34_ ? class124s[i_34_]
							: class124s[i_34_].method1697(0, (class124s[i_34_].method1693(0) - 4), (byte) -104));
					class87.method1429(class124, i_30_, i_29_, i_32_, true);
					i_29_ += class87.method1432();
				}
			}
		}
	}
	public static void method604(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_36_));
		if (class14_sub25 == null) {
			class14_sub25 = new Class14_Sub25();
			Class132.aClass55_2167.put((long) i_36_, class14_sub25);
		}
		if (class14_sub25.anIntArray3178.length <= i) {
			int[] is = new int[i + 1];
			int[] is_39_ = new int[i + 1];
			for (int i_40_ = 0; i_40_ < class14_sub25.anIntArray3178.length; i_40_++) {
				is[i_40_] = class14_sub25.anIntArray3178[i_40_];
				is_39_[i_40_] = class14_sub25.anIntArray3177[i_40_];
			}
			for (int i_41_ = class14_sub25.anIntArray3178.length; i > i_41_; i_41_++) {
				is[i_41_] = -1;
				is_39_[i_41_] = 0;
			}
			class14_sub25.anIntArray3177 = is_39_;
			class14_sub25.anIntArray3178 = is;
		}
		class14_sub25.anIntArray3178[i] = i_35_;
		class14_sub25.anIntArray3177[i] = i_37_;
		int i_42_ = -44 / ((65 - i_38_) / 51);
	}
	public static Class124 aClass124_4452;

	public static Class124 aClass124_4453;

	public static Class124 aClass124_4456 = Class14_Sub2_Sub2.method263(1178, "Loaded update list");

	public static Class124 aClass124_4462;

	public static Class31 aClass31_4454;

	public static void method593(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i_2_;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = -i_4_ + i_0_;
		int i_11_ = i_2_ - i_4_;
		int i_12_ = i_0_ * i_0_;
		int i_13_ = i_2_ * i_2_;
		int i_14_ = i_10_ * i_10_;
		int i_15_ = i_12_ << 33;
		int i_16_ = i_11_ * i_11_;
		int i_17_ = i_13_ << 1;
		int i_18_ = i_16_ << 1;
		int i_19_ = i_14_ << 33;
		int i_20_ = i_2_ << 1;
		int i_21_ = i_12_ * (-i_20_ + 1) + i_17_;
		int i_22_ = i_11_ << 1;
		int i_23_ = -((i_20_ - 1) * i_15_) + i_13_;
		int i_24_ = i_14_ * (-i_22_ + 1) + i_18_;
		int i_25_ = i_16_ - i_19_ * (i_22_ - 1);
		int i_26_ = i_12_ << 34;
		int i_27_ = i_13_ << 34;
		int i_28_ = i_14_ << 2;
		int i_29_ = i_16_ << 34;
		int i_30_ = i_15_ * (i_20_ - 3);
		int i_31_ = i_18_ * 3;
		int i_32_ = i_17_ * 3;
		if (i_3_ > -67)
			aClass31_4454 = null;
		int i_33_ = i_19_ * (i_22_ - 3);
		int i_34_ = i_27_;
		int i_35_ = (i_2_ - 1) * i_26_;
		int i_36_ = i_29_;
		int i_37_ = i_28_ * (i_11_ - 1);
		if (i_5_ >= Class14_Sub17.anInt3005 && i_5_ <= Class59.anInt955) {
			int[] is = Static2.anIntArrayArray4038[i_5_];
			int i_38_ = Class67.method1301((byte) 72, -i_0_ + i, Class118.anInt1982, JunkTex.anInt4327);
			int i_39_ = Class67.method1301((byte) -105, i + i_0_, Class118.anInt1982, JunkTex.anInt4327);
			int i_40_ = Class67.method1301((byte) -125, -i_10_ + i, Class118.anInt1982, JunkTex.anInt4327);
			int i_41_ = Class67.method1301((byte) 27, i + i_10_, Class118.anInt1982, JunkTex.anInt4327);
			Class51.method1201(is, i_38_, i_40_, -5973, i_1_);
			Class51.method1201(is, i_40_, i_41_, -5973, i_6_);
			Class51.method1201(is, i_41_, i_39_, -5973, i_1_);
		}
		while (i_7_ > 0) {
			if (i_21_ < 0) {
				while (i_21_ < 0) {
					i_21_ += i_32_;
					i_32_ += i_27_;
					i_8_++;
					i_23_ += i_34_;
					i_34_ += i_27_;
				}
			}
			if (i_23_ < 0) {
				i_23_ += i_34_;
				i_8_++;
				i_34_ += i_27_;
				i_21_ += i_32_;
				i_32_ += i_27_;
			}
			i_21_ -= i_35_;
			boolean bool = i_11_ >= i_7_;
			i_23_ -= i_30_;
			i_30_ -= i_26_;
			if (bool) {
				if (i_24_ < 0) {
					while (i_24_ < 0) {
						i_25_ += i_36_;
						i_36_ += i_29_;
						i_24_ += i_31_;
						i_31_ += i_29_;
						i_9_++;
					}
				}
				if (i_25_ < 0) {
					i_24_ += i_31_;
					i_31_ += i_29_;
					i_9_++;
					i_25_ += i_36_;
					i_36_ += i_29_;
				}
				i_25_ -= i_33_;
				i_33_ -= i_28_;
				i_24_ -= i_37_;
				i_37_ -= i_28_;
			}
			i_7_--;
			int i_42_ = i_5_ - i_7_;
			i_35_ -= i_26_;
			int i_43_ = i_5_ + i_7_;
			if (Class14_Sub17.anInt3005 <= i_43_ && Class59.anInt955 >= i_42_) {
				int i_44_ = Class67.method1301((byte) 40, i_8_ + i, Class118.anInt1982, JunkTex.anInt4327);
				int i_45_ = Class67.method1301((byte) -112, -i_8_ + i, Class118.anInt1982,
						JunkTex.anInt4327);
				if (bool) {
					int i_46_ = Class67.method1301((byte) 35, i + i_9_, Class118.anInt1982,
							JunkTex.anInt4327);
					int i_47_ = Class67.method1301((byte) -81, -i_9_ + i, Class118.anInt1982,
							JunkTex.anInt4327);
					if (i_42_ >= Class14_Sub17.anInt3005) {
						int[] is = Static2.anIntArrayArray4038[i_42_];
						Class51.method1201(is, i_45_, i_47_, -5973, i_1_);
						Class51.method1201(is, i_47_, i_46_, -5973, i_6_);
						Class51.method1201(is, i_46_, i_44_, -5973, i_1_);
					}
					if (i_43_ <= Class59.anInt955) {
						int[] is = Static2.anIntArrayArray4038[i_43_];
						Class51.method1201(is, i_45_, i_47_, -5973, i_1_);
						Class51.method1201(is, i_47_, i_46_, -5973, i_6_);
						Class51.method1201(is, i_46_, i_44_, -5973, i_1_);
					}
				} else {
					if (Class14_Sub17.anInt3005 <= i_42_)
						Class51.method1201((Static2.anIntArrayArray4038[i_42_]), i_45_, i_44_, -5973, i_1_);
					if (i_43_ <= Class59.anInt955)
						Class51.method1201((Static2.anIntArrayArray4038[i_43_]), i_45_, i_44_, -5973, i_1_);
				}
			}
		}
	}
	public static void method594(int i, boolean bool, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_,
			int i_54_) {
		if (bool) {
			if (!Class126.method1741((byte) 68, i_49_)) {
				if (i_50_ != -1)
					aBooleanArray4698[i_50_] = true;
				else {
					for (int i_55_ = 0; i_55_ < 100; i_55_++)
						aBooleanArray4698[i_55_] = true;
				}
			} else {
				Class60.aClass94Array980 = null;
				Class137.method1942(i_50_, i_54_, i_51_, -1, Class1.aClass94ArrayArray75[i_49_], i_53_, i_48_, i,
						(byte) 93, i_52_);
				if (Class60.aClass94Array980 != null) {
					Class137.method1942(i_50_, i_54_, i_51_, -1412584499, Class60.aClass94Array980, i_53_,
							JunkTex.anInt4379, i, (byte) 93, JunkTex.anInt4295);
					Class60.aClass94Array980 = null;
				}
			}
		}
	}
	public static void method595(int i, Class43 class43) {
		if (i != 257411150)
			method593(71, -18, -85, -23, -65, -90, 58, -123);
		Class30 class30 = null;
		try {
			Class31 class31 = class43.method1152("runescape", i - 257411150);
			while (class31.anInt529 == 0)
				Util.sleep(1L);
			if (class31.anInt529 == 1) {
				class30 = (Class30) class31.anObject530;
				Buffer class14_sub10 = Class7_Sub3.method132((byte) 63);
				class30.method1056(0, class14_sub10.position, class14_sub10.payload, -20563);
			}
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class30 != null)
				class30.method1057(25861);
		} catch (Exception exception) {
			/* empty */
		}
	}
	public static boolean method596(long l, int i, int i_56_, int i_57_) {
		int i_58_ = ((int) l & 0x7dba5) >> 14;
		int i_59_ = (int) (l >>> 32) & 0x7fffffff;
		int i_60_ = (int) l >> 52 & 0x3;
		if (i_58_ == 10 || i_58_ == 11 || i_58_ == 22) {
			Class79 class79 = Class79.method1377((byte) -106, i_59_);
			int i_61_;
			int i_62_;
			if (i_60_ == 0 || i_60_ == 2) {
				i_62_ = class79.anInt1227;
				i_61_ = class79.anInt1245;
			} else {
				i_61_ = class79.anInt1227;
				i_62_ = class79.anInt1245;
			}
			int i_63_ = class79.anInt1244;
			if (i_60_ != 0)
				i_63_ = (i_63_ << i_60_ & 0xf) + (i_63_ >> 4 - i_60_);
			method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), i_61_, 0, i_63_,
					(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, 0, i, 2, i_62_, i_56_);
		} else
			method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, i_60_, 0,
					(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, i_58_ + 1, i, 2, 0,
					i_56_);
		Class14_Sub2_Sub11.anInt3881 = 2;
		anInt4243 = Class125_Sub1.anInt3367;
		int i_64_ = 67 / ((-9 - i_57_) / 36);
		Class14_Sub2_Sub17.anInt4017 = 0;
		anInt4515 = Class139.anInt2230;
		boolean bool = true;
		return bool;
	}
	public static boolean method597(Class124 class124, int i) {
		if (class124 == null) {
			boolean bool = false;
			return bool;
		}
		for (int i_65_ = i; i_65_ < Class42.anInt698; i_65_++) {
			if (class124.method1717(40, client.aClass124Array2645[i_65_]))
				return true;
		}
		return false;
	}
	public static boolean method598(int i, int i_66_) {
		if (i_66_ <= i && i <= 122) {
			boolean bool = true;
			return bool;
		}
		if (i >= 65 && i <= 90) {
			boolean bool = true;
			return bool;
		}
		if (i >= 48 && i <= 57) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}
	public static void method599(boolean bool) {
		if (bool)
			method597(null, 104);
		aClass124_4452 = null;
		aClass124_4456 = null;
		aClass124_4462 = null;
		aClass124_4453 = null;
		aClass31_4454 = null;
	}
	public static Class124 aClass124_4434 = Class14_Sub2_Sub2.method263(1178, "b12_full");

	public static Class124 aClass124_4442;

	public static Class124 aClass124_4445;

	public static Class94 aClass94_4446;

	public static int anInt4436;

	public static int anInt4439 = 2301979;

	public static int[] anIntArray4444;

	public static void method587(long[] ls, int i, int[] is, boolean bool, int i_0_) {
		if (i > i_0_) {
			int i_1_ = i_0_;
			int i_2_ = (i + i_0_) / 2;
			long l = ls[i_2_];
			ls[i_2_] = ls[i];
			ls[i] = l;
			int i_3_ = is[i_2_];
			is[i_2_] = is[i];
			is[i] = i_3_;
			for (int i_4_ = i_0_; i_4_ < i; i_4_++) {
				if (ls[i_4_] < (long) (i_4_ & 0x1) + l) {
					long l_5_ = ls[i_4_];
					ls[i_4_] = ls[i_1_];
					ls[i_1_] = l_5_;
					int i_6_ = is[i_4_];
					is[i_4_] = is[i_1_];
					is[i_1_++] = i_6_;
				}
			}
			ls[i] = ls[i_1_];
			ls[i_1_] = l;
			is[i] = is[i_1_];
			is[i_1_] = i_3_;
			method587(ls, i_1_ - 1, is, false, i_0_);
			method587(ls, i, is, false, i_1_ + 1);
		}
		if (bool)
			method587(null, 67, null, true, 8);
	}
	public static void method588(int i, int i_7_, int i_8_, int i_9_, int i_10_, byte[][][] is, int[] is_11_,
			int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int i_16_, byte i_17_, int i_18_, int i_19_) {
		if (i < 0)
			i = 0;
		else if (i >= Static2.anInt3338 * 128)
			i = Static2.anInt3338 * 128 - 1;
		if (i_8_ < 0)
			i_8_ = 0;
		else if (i_8_ >= JunkTex.anInt4337 * 128)
			i_8_ = JunkTex.anInt4337 * 128 - 1;
		Class150.anInt2420 = Class3.sin[i_9_];
		Class7_Sub3_Sub1.anInt3718 = Class3.cos[i_9_];
		anInt2719 = Class3.sin[i_10_];
		Class37.anInt643 = Class3.cos[i_10_];
		Class4.anInt125 = i;
		Static2.anInt2741 = i_7_;
		Class14_Sub2_Sub8.anInt3853 = i_8_;
		Static2.cameraTileX = i / 128;
		Class102.cameraTileZ = i_8_ / 128;
		Class7_Sub1.anInt2659 = Static2.cameraTileX - anInt1108;
		if (Class7_Sub1.anInt2659 < 0)
			Class7_Sub1.anInt2659 = 0;
		Class14_Sub9_Sub3.anInt4849 = Class102.cameraTileZ - anInt1108;
		if (Class14_Sub9_Sub3.anInt4849 < 0)
			Class14_Sub9_Sub3.anInt4849 = 0;
		anInt4722 = Static2.cameraTileX + anInt1108;
		if (anInt4722 > Static2.anInt3338)
			anInt4722 = Static2.anInt3338;
		anInt4526 = Class102.cameraTileZ + anInt1108;
		if (anInt4526 > JunkTex.anInt4337)
			anInt4526 = JunkTex.anInt4337;
		int i_20_ = 3584;
		for (int i_21_ = 0; i_21_ < anInt1108 + anInt1108 + 2; i_21_++) {
			for (int i_22_ = 0; i_22_ < anInt1108 + anInt1108 + 2; i_22_++) {
				int i_23_ = ((i_21_ - anInt1108 << 7) - (Class4.anInt125 & 0x7f));
				int i_24_ = ((i_22_ - anInt1108 << 7) - (Class14_Sub2_Sub8.anInt3853 & 0x7f));
				int i_25_ = Static2.cameraTileX - anInt1108 + i_21_;
				int i_26_ = Class102.cameraTileZ - anInt1108 + i_22_;
				if (i_25_ >= 0 && i_26_ >= 0 && i_25_ < Static2.anInt3338
						&& i_26_ < JunkTex.anInt4337) {
					int i_27_;
					if (Class150.anIntArrayArrayArray2419 != null)
						i_27_ = (Class150.anIntArrayArrayArray2419[0][i_25_][i_26_]) - Static2.anInt2741 + 128;
					else
						i_27_ = (Class149.anIntArrayArrayArray2391[0][i_25_][i_26_]) - Static2.anInt2741 + 128;
					int i_28_ = (Class149.anIntArrayArrayArray2391[3][i_25_][i_26_] - Static2.anInt2741 - 1000);
					aBooleanArrayArray4138[i_21_][i_22_] = Class124.method1714(i_23_, i_28_, i_27_,
							i_24_, i_20_);
				} else
					aBooleanArrayArray4138[i_21_][i_22_] = false;
			}
		}
		for (int i_29_ = 0; i_29_ < anInt1108 + anInt1108 + 1; i_29_++) {
			for (int i_30_ = 0; i_30_ < anInt1108 + anInt1108 + 1; i_30_++)
				Class53.visibilityMap[i_29_][i_30_] = (aBooleanArrayArray4138[i_29_][i_30_]
						|| (aBooleanArrayArray4138[i_29_ + 1][i_30_])
						|| (aBooleanArrayArray4138[i_29_][i_30_ + 1])
						|| (aBooleanArrayArray4138[i_29_ + 1][i_30_ + 1]));
		}
		Class21.anIntArray437 = is_11_;
		Class98.anIntArray1660 = is_12_;
		Static2.anIntArray1790 = is_13_;
		Class142.anIntArray2284 = is_14_;
		Class104.anIntArray1737 = is_15_;
		Scenegraph.method1503();
		if (Class40.aClass14_Sub29ArrayArrayArray674 != null) {
			method627(true);
			StaticGL.method67(i, i_7_, i_8_, null, 0, (byte) 0, i_18_, i_19_);
			Class14_Sub30.aBoolean3269 = false;
			RT4.method1778(0, 0);
			AtmosphericEffects.setFogColour(null);
			LightManager.method188();
			method627(false);
		}
		StaticGL.method67(i, i_7_, i_8_, is, i_16_, i_17_, i_18_, i_19_);
	}
	public static void method590(boolean bool) {
		aClass94_4446 = null;
		aClass124_4445 = null;
		aClass124_4434 = null;
		aClass124_4442 = null;
		anIntArray4444 = null;
	}
	public static void method591(int i, Class133_Sub1_Sub1 class133_sub1_sub1, int i_31_, int i_32_, int i_33_) {
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748 != class133_sub1_sub1 && anInt4729 < 400) {
			Class124 class124;
			if (class133_sub1_sub1.anInt4928 == 0)
				class124 = (method515((new Class124[] { class133_sub1_sub1.method1808(true),
						Class153.method2047(1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937),
								class133_sub1_sub1.anInt4937),
						JunkTex.aClass124_4360, Class48.aClass124_797,
						Class83.method1407(52, class133_sub1_sub1.anInt4937), aClass124_4552 }),
						(byte) -95));
			else
				class124 = (method515((new Class124[] { class133_sub1_sub1.method1808(true),
						JunkTex.aClass124_4360, Class14_Sub2_Sub21.aClass124_4083,
						Class83.method1407(90, class133_sub1_sub1.anInt4928), aClass124_4552 }),
						(byte) -98));
			if (i < 73)
				method587(null, 36, null, false, 106);
			if (Class51.anInt831 != 1) {
				if (!Class14_Sub4.aBoolean2784) {
					for (int i_34_ = 7; i_34_ >= 0; i_34_--) {
						if (Class56.aClass124Array919[i_34_] != null) {
							short i_35_ = 0;
							if (Static2.anInt3749 == 0
									&& (Class56.aClass124Array919[i_34_].method1717(40, Class118.aClass124_1973))) {
								if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937) < class133_sub1_sub1.anInt4937)
									i_35_ = (short) 2000;
								if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916) != 0
										&& class133_sub1_sub1.anInt4916 != 0) {
									if (class133_sub1_sub1.anInt4916 != (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916))
										i_35_ = (short) 0;
									else
										i_35_ = (short) 2000;
								}
							} else if (JunkTex.aBooleanArray4271[i_34_])
								i_35_ = (short) 2000;
							boolean bool = false;
							short i_36_ = Static2.aShortArray357[i_34_];
							i_36_ += i_35_;
							Class14_Sub11
									.method853(32, Class56.aClass124Array919[i_34_], i_31_,
											(method515(
													new Class124[] { Class17.aClass124_398, class124 }, (byte) -127)),
									i_36_, (long) i_33_, i_32_);
						}
					}
				} else if ((anInt101 & 0x8) == 8)
					Class14_Sub11
							.method853(32, Class125.aClass124_2082, i_31_,
									method515((new Class124[] { Class17.aClass124_408,
											Class68.aClass124_1064, class124 }), (byte) -16),
									(short) 16, (long) i_33_, i_32_);
			} else
				Class14_Sub11
						.method853(32, Class40.aClass124_665, i_31_,
								(method515((new Class124[] { Class14_Sub6.aClass124_2809,
										Class68.aClass124_1064, class124 }), (byte) -97)),
								(short) 49, (long) i_33_, i_32_);
			for (int i_37_ = 0; i_37_ < anInt4729; i_37_++) {
				if (Class14_Sub29.aShortArray3262[i_37_] == 8) {
					RuntimeException_Sub1.aClass124Array2459[i_37_] = method515((new Class124[] { Class17.aClass124_398, class124 }), (byte) -124);
					break;
				}
			}
		}
	}
	public static boolean aBoolean4420;

	public static int anInt4419 = 0;

	public static int anInt4427;

	public static int anInt4429;

	public static int[] anIntArray4422 = new int[2];

	public static Object anObject4417;

	public static void method583(int i) {
		int i_0_ = -88 / ((i + 14) / 47);
		int[] is = new int[Class108.anInt1816];
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < Class108.anInt1816; i_2_++) {
			Class142 class142 = method605(63, i_2_);
			if (class142.anInt2274 >= 0 || class142.anInt2264 >= 0)
				is[i_1_++] = i_2_;
		}
		Class107.anIntArray1809 = new int[i_1_];
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
			Class107.anIntArray1809[i_3_] = is[i_3_];
	}
	public static Class14_Sub2_Sub13 method584(int i) {
		if (i != -11988)
			anObject4417 = null;
		Class14_Sub2_Sub13 class14_sub2_sub13 = ((Class14_Sub2_Sub13) aClass81_4546
				.peek());
		if (class14_sub2_sub13 != null) {
			class14_sub2_sub13.unlink();
			class14_sub2_sub13.unlinkCacheable();
			Class14_Sub2_Sub13 class14_sub2_sub13_4_ = class14_sub2_sub13;
			return class14_sub2_sub13_4_;
		}
		Class14_Sub2_Sub13 class14_sub2_sub13_5_;
		do {
			class14_sub2_sub13_5_ = ((Class14_Sub2_Sub13) aClass81_2844.peek());
			if (class14_sub2_sub13_5_ == null) {
				class14_sub2_sub13 = null;
				return class14_sub2_sub13;
			}
			if (class14_sub2_sub13_5_.method330() > TimeUtil.getTime()) {
				class14_sub2_sub13 = null;
				return class14_sub2_sub13;
			}
			class14_sub2_sub13_5_.unlink();
			class14_sub2_sub13_5_.unlinkCacheable();
		} while ((class14_sub2_sub13_5_.keyCacheable & ~0x7fffffffffffffffL) == 0L);
		class14_sub2_sub13 = class14_sub2_sub13_5_;
		return class14_sub2_sub13;
	}
	public static void method585(byte i) {
		if (i <= 86)
			anObject4417 = null;
		anObject4417 = null;
		anIntArray4422 = null;
	}
	public static Class124 aClass124_4113;

	public static Class124 aClass124_4115 = Class14_Sub2_Sub2.method263(1178, " has logged out)3");

	public static Class124 aClass124_4116;

	public static Class124 aClass124_4118;

	public static Class124 aClass124_4119;

	public static Class124 aClass124_4120;

	public static Class124 aClass124_4121;

	public static Class124 aClass124_4122;

	public static HashTable aClass55_4112;

	public static int anInt4114 = 0;

	public static void method489(int i) {
		aClass55_4112 = null;
		aClass124_4116 = null;
		aClass124_4119 = null;
		aClass124_4122 = null;
		aClass124_4115 = null;
		aClass124_4121 = null;
		aClass124_4118 = null;
		aClass124_4113 = null;
		aClass124_4120 = null;
	}
	public static void method490(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		aClass14_Sub10_Sub1_891.position = 0;
		aClass14_Sub10_Sub1_891.method809(85);
		aClass14_Sub10_Sub1_891.method809(i_2_);
		aClass14_Sub10_Sub1_891.method809(i);
		if (i_3_ == -28) {
			aClass14_Sub10_Sub1_891.method833((byte) 100, i_0_);
			aClass14_Sub10_Sub1_891.method833((byte) 96, i_1_);
			Class56.anInt918 = 1;
			anInt4686 = 0;
			Static2.anInt2734 = -3;
			Class129.anInt2136 = 0;
		}
	}
	public static Class124 aClass124_4409;

	public static Class124 aClass124_4412 = Class14_Sub2_Sub2.method263(1178, "Zugewiesener Speicher)3");

	public static Deque aClass2_4404;

	public static int anInt4408 = 0;

	public static long method578(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null || class14_sub29.aClass4_3237 == null)
			return 0L;
		return class14_sub29.aClass4_3237.aLong132;
	}
	public static void method579(byte i) {
		aClass124_4412 = null;
		aClass2_4404 = null;
		aClass124_4409 = null;
	}
	public static boolean method580(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			Class133 class133, int i_10_, boolean bool, long l) {
		boolean bool_11_ = Class114.tileHeights == Class150.anIntArrayArrayArray2419;
		int i_12_ = 0;
		for (int i_13_ = i_3_; i_13_ < i_3_ + i_5_; i_13_++) {
			for (int i_14_ = i_4_; i_14_ < i_4_ + i_6_; i_14_++) {
				if (i_13_ < 0 || i_14_ < 0 || i_13_ >= Static2.anInt3338 || i_14_ >= JunkTex.anInt4337)
					return false;
				Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_13_][i_14_]);
				if (class14_sub29 != null && class14_sub29.anInt3242 >= 5)
					return false;
			}
		}
		Class40 class40 = new Class40();
		class40.aLong677 = l;
		class40.anInt672 = i;
		class40.anInt667 = i_7_;
		class40.anInt666 = i_8_;
		class40.anInt671 = i_9_;
		class40.aClass133_679 = class133;
		class40.anInt663 = i_10_;
		class40.anInt668 = i_3_;
		class40.anInt678 = i_4_;
		class40.anInt670 = i_3_ + i_5_ - 1;
		class40.anInt669 = i_4_ + i_6_ - 1;
		for (int i_15_ = i_3_; i_15_ < i_3_ + i_5_; i_15_++) {
			for (int i_16_ = i_4_; i_16_ < i_4_ + i_6_; i_16_++) {
				int i_17_ = 0;
				if (i_15_ > i_3_)
					i_17_++;
				if (i_15_ < i_3_ + i_5_ - 1)
					i_17_ += 4;
				if (i_16_ > i_4_)
					i_17_ += 8;
				if (i_16_ < i_4_ + i_6_ - 1)
					i_17_ += 2;
				for (int i_18_ = i; i_18_ >= 0; i_18_--) {
					if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_18_][i_15_][i_16_]) == null)
						Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_18_][i_15_][i_16_] = new Class14_Sub29(i_18_,
								i_15_, i_16_);
				}
				Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_15_][i_16_]);
				class14_sub29.aClass40Array3257[class14_sub29.anInt3242] = class40;
				class14_sub29.anIntArray3247[class14_sub29.anInt3242] = i_17_;
				class14_sub29.anInt3249 |= i_17_;
				class14_sub29.anInt3242++;
				if (bool_11_ && anIntArrayArray2799[i_15_][i_16_] != 0)
					i_12_ = anIntArrayArray2799[i_15_][i_16_];
			}
		}
		if (bool_11_ && i_12_ != 0) {
			for (int i_19_ = i_3_; i_19_ < i_3_ + i_5_; i_19_++) {
				for (int i_20_ = i_4_; i_20_ < i_4_ + i_6_; i_20_++) {
					if (anIntArrayArray2799[i_19_][i_20_] == 0)
						anIntArrayArray2799[i_19_][i_20_] = i_12_;
				}
			}
		}
		if (bool)
			Class14_Sub20.aClass40Array3093[anInt4727++] = class40;
		return true;
	}
	public static void method581(Class9 class9, boolean bool, Class9 class9_21_) {
		aClass9_2792 = class9;
		if (!bool) {
			Class14_Sub2_Sub8.aClass9_3848 = class9_21_;
			Class38.anInt2617 = aClass9_2792.method177(3, 13537);
		}
	}
	public static void method582(byte i, Class94 class94) {
		if (i != -124)
			aClass124_4409 = null;
		Class94 class94_22_ = Class21.method975(class94, false);
		int i_23_;
		int i_24_;
		if (class94_22_ == null) {
			i_24_ = Class14_Sub20.anInt3094;
			i_23_ = Class83.anInt1340;
		} else {
			i_23_ = class94_22_.anInt1518;
			i_24_ = class94_22_.anInt1545;
		}
		Class14_Sub21.method894(class94, 1, false, i_23_, i_24_);
		Class118.method1607(1, i_24_, i_23_, class94);
	}
	public static boolean aBoolean4383 = false;

	public static Class124 aClass124_4393 = (Class14_Sub2_Sub2.method263(1178, "RuneScape is loading )2 please wait)3)3)3"));

	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4385;

	public static Class9 aClass9_4384;

	public static int anInt4382 = 0;

	public static int anInt4386 = 0;

	public static int anInt4394;

	public static int[][] anIntArrayArray4388 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
	{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
	{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
	{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
	{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
	{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

	public static short[] aShortArray4392 = new short[] { 960, 957, -21568, -21571, 22464 };

	public static void method573(int i) {
		anIntArrayArray4388 = null;
		aClass9_4384 = null;
		aShortArray4392 = null;
		aClass124_4393 = null;
		if (i != 3)
			anInt4394 = -19;
		aClass14_Sub2_Sub19Array4385 = null;
	}
	public static void method574(int i, int i_0_, int i_1_, int i_2_, Class124 class124) {
		Class94 class94 = Class14_Sub6.method464(i_0_, i_2_, (byte) -19);
		if (class94 != null) {
			if (class94.anObjectArray1535 != null) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.anInt3108 = i;
				class14_sub21.aClass124_3101 = class124;
				class14_sub21.anObjectArray3115 = class94.anObjectArray1535;
				class14_sub21.aClass94_3116 = class94;
				Class133_Sub3.method1830(class14_sub21, -1976917689);
			}
			boolean bool = true;
			if (class94.anInt1498 > 0)
				bool = Class14_Sub15.method874((byte) 123, class94);
			if (i_1_ >= 118 && bool && Class14_Sub3.method448((byte) 124, i - 1, client.method46(class94))) {
				if (i == 1) {
					aClass14_Sub10_Sub1_891.writeOpcode(233);
					aClass14_Sub10_Sub1_891.method803(i_2_, 93);
					aClass14_Sub10_Sub1_891.method833((byte) 92, i_0_);
				}
				if (i == 2) {
					aClass14_Sub10_Sub1_891.writeOpcode(21);
					aClass14_Sub10_Sub1_891.method803(i_2_, 82);
					aClass14_Sub10_Sub1_891.method833((byte) 117, i_0_);
				}
				if (i == 3) {
					aClass14_Sub10_Sub1_891.writeOpcode(169);
					aClass14_Sub10_Sub1_891.method803(i_2_, 71);
					aClass14_Sub10_Sub1_891.method833((byte) 85, i_0_);
				}
				if (i == 4) {
					aClass14_Sub10_Sub1_891.writeOpcode(214);
					aClass14_Sub10_Sub1_891.method803(i_2_, 108);
					aClass14_Sub10_Sub1_891.method833((byte) 119, i_0_);
				}
				if (i == 5) {
					aClass14_Sub10_Sub1_891.writeOpcode(173);
					aClass14_Sub10_Sub1_891.method803(i_2_, 89);
					aClass14_Sub10_Sub1_891.method833((byte) 124, i_0_);
				}
				if (i == 6) {
					aClass14_Sub10_Sub1_891.writeOpcode(232);
					aClass14_Sub10_Sub1_891.method803(i_2_, 117);
					aClass14_Sub10_Sub1_891.method833((byte) 107, i_0_);
				}
				if (i == 7) {
					aClass14_Sub10_Sub1_891.writeOpcode(133);
					aClass14_Sub10_Sub1_891.method803(i_2_, 116);
					aClass14_Sub10_Sub1_891.method833((byte) 96, i_0_);
				}
				if (i == 8) {
					aClass14_Sub10_Sub1_891.writeOpcode(102);
					aClass14_Sub10_Sub1_891.method803(i_2_, 120);
					aClass14_Sub10_Sub1_891.method833((byte) 126, i_0_);
				}
				if (i == 9) {
					aClass14_Sub10_Sub1_891.writeOpcode(226);
					aClass14_Sub10_Sub1_891.method803(i_2_, 104);
					aClass14_Sub10_Sub1_891.method833((byte) 103, i_0_);
				}
				if (i == 10) {
					aClass14_Sub10_Sub1_891.writeOpcode(90);
					aClass14_Sub10_Sub1_891.method803(i_2_, 114);
					aClass14_Sub10_Sub1_891.method833((byte) 113, i_0_);
				}
			}
		}
	}
	public static int method576(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (Class60.aBoolean983) {
			i = 1000000;
			Class60.aBoolean983 = false;
		}
		AtmosphericChunk atmosphericChunk = Class150.aClass71ArrayArray2421[i_3_][i_4_];
		int i_7_ = atmosphericChunk.fogDepth;
		float f = atmosphericChunk.light1Diffuse;
		if (!aBoolean4420)
			i_7_ = 0;
		float f_8_ = ((float) i_6_ * 0.1F + 0.7F) * atmosphericChunk.lightModelAmbient;
		int i_9_ = atmosphericChunk.screenColorRgb;
		float f_10_ = atmosphericChunk.light0Diffuse;
		int i_11_ = atmosphericChunk.fogColorRgb;
		if (i_9_ != JunkTex.anInt4355 || f_8_ != Class138.aFloat2220 || f_10_ != Canvas_Sub1.aFloat41
				|| Class69.aFloat1066 != f || Class103.anInt1728 != i_11_ || i_7_ != Static2.anInt3947) {
			Class14_Sub3.aFloat2745 = Class35.aFloat600;
			Class75.anInt1151 = Class15.anInt376;
			JunkTex.anInt4355 = i_9_;
			Class22.anInt460 = Class133_Sub6.anInt3673;
			Class69.aFloat1066 = f;
			Class123.aFloat2067 = Class63.aFloat1007;
			Static2.anInt3947 = i_7_;
			RuntimeException_Sub1.anInt2463 = 0;
			Class138.aFloat2220 = f_8_;
			Class125_Sub2.aFloat3386 = aFloat2709;
			anInt4597 = Class133_Sub1.anInt3490;
			Canvas_Sub1.aFloat41 = f_10_;
			Class103.anInt1728 = i_11_;
		}
		if (RuntimeException_Sub1.anInt2463 < 65536) {
			RuntimeException_Sub1.anInt2463 += i * 250;
			if (RuntimeException_Sub1.anInt2463 >= 65536)
				RuntimeException_Sub1.anInt2463 = 65536;
			int i_12_ = RuntimeException_Sub1.anInt2463 >> 40;
			int i_13_ = -RuntimeException_Sub1.anInt2463 + 65536 >> 8;
			Class133_Sub1.anInt3490 = (i_13_ * anInt4597
					+ i_12_ * Static2.anInt3947) >> 8;
			Class15.anInt376 = (((i_12_ * (JunkTex.anInt4355 & 0xff00)
					+ i_13_ * (Class75.anInt1151 & 0xff00)) & 0xff0000)
					+ ((i_12_ * (JunkTex.anInt4355 & 0xff00ff) + (Class75.anInt1151 & 0xff00ff) * i_13_)
							& ~0xff00ff)) >> 40;
			float f_14_ = (float) (65536 - RuntimeException_Sub1.anInt2463) / 65536.0F;
			float f_15_ = (float) RuntimeException_Sub1.anInt2463 / 65536.0F;
			aFloat2709 = (f_14_ * Class125_Sub2.aFloat3386 + f_15_ * Class138.aFloat2220);
			Class35.aFloat600 = Class14_Sub3.aFloat2745 * f_14_ + Class69.aFloat1066 * f_15_;
			Class133_Sub6.anInt3673 = ((((Class22.anInt460 & 0xff00) * i_13_ + (Class103.anInt1728 & 0xff00) * i_12_)
					& 0xff0000)
					+ ((i_13_ * (Class22.anInt460 & 0xff00ff) + i_12_ * (Class103.anInt1728 & 0xff00ff))
							& ~0xff00ff)) >> 40;
			Class63.aFloat1007 = f_14_ * Class123.aFloat2067 + Canvas_Sub1.aFloat41 * f_15_;
		}
		AtmosphericEffects.setLightModel(Class15.anInt376, aFloat2709, Class63.aFloat1007, Class35.aFloat600);
		AtmosphericEffects.setFogProperties(Class133_Sub6.anInt3673, Class133_Sub1.anInt3490);
		AtmosphericEffects.setSunPosition((float) Class82.anInt1330, (float) Class49.anInt815, (float) anInt847);
		AtmosphericEffects.loadLightPositions();
		if (i_5_ != -3217) {
			int i_16_ = 2;
			return i_16_;
		}
		int i_17_ = Class133_Sub6.anInt3673;
		return i_17_;
	}
	public static Class124 aClass124_4359;

	public static Class124 aClass124_4360;

	public static Class124 aClass124_4362;

	public static Class124 aClass124_4363 = Class14_Sub2_Sub2.method263(1178, "Take");

	public static Class124 aClass124_4365;

	public static Class124 aClass124_4368;

	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4366;

	public static Class9 aClass9_4371;

	public static int anInt4367;

	public static int anInt4377;

	public static int anInt4378;

	public static int anInt4379;

	public static void method566(int i, int i_0_, int i_1_, int i_2_, boolean bool) {
		if (Class126.method1741((byte) -101, i_0_))
			method340(Class1.aClass94ArrayArray75[i_0_], bool, i_1_, i, (byte) 125, i_2_);
	}
	public static void method568(int i) {
		Class56.method1240();
		int i_3_ = 0;
		if (i != 4)
			anInt4378 = 6;
		for (/**/; i_3_ < 4; i_3_++)
			Class14_Sub21.aClass32Array3100[i_3_].method1071(true);
		System.gc();
	}
	public static void method569(int i) {
		if (i > -79)
			method568(-112);
		Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(11);
		Class14_Sub2_Sub11.anInt3889 = 1;
		Class9_Sub1.aClass9_2696 = null;
	}
	public static void method570(int i) {
		aClass9_4371 = null;
		if (i != 4)
			JunkTex.method572(null, true);
		aClass124_4359 = null;
		aClass124_4363 = null;
		aClass124_4365 = null;
		aClass124_4362 = null;
		aClass124_4360 = null;
		aClass124_4368 = null;
		aClass14_Sub2_Sub19Array4366 = null;
	}
	public static void method571(boolean bool) {
		if (bool)
			JunkTex.method572(null, true);
		for (int i = 0; Class64.anInt1012 > i; i++) {
			int i_4_ = Class14_Sub2_Sub7.anIntArray3825[i];
			Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_4_];
			int i_5_ = aClass14_Sub10_Sub1_4734.readUByte();
			if ((i_5_ & 0x10) != 0)
				i_5_ += (aClass14_Sub10_Sub1_4734.readUByte() << 40);
			Class118.method1603(1, class133_sub1_sub1, i_5_, i_4_);
		}
	}
	public static void method572(Component component, boolean bool) {
		Method method = Class43.aMethod707;
		if (bool)
			method566(-35, 74, -4, -122, true);
		if (method != null) {
			try {
				method.invoke(component, new Object[] { Boolean.FALSE });
			} catch (Throwable throwable) {
				/* empty */
			}
		}
		component.addKeyListener(aClass141_4239);
		component.addFocusListener(aClass141_4239);
	}
	public static boolean aBoolean4357 = false;

	public static Class124 aClass124_4341 = Class14_Sub2_Sub2.method263(1178, ")4a=");

	public static Class124 aClass124_4353 = Class14_Sub2_Sub2.method263(1178, "(U2");

	public static Class14_Sub2_Sub9 aClass14_Sub2_Sub9_4354;

	public static Class86 aClass86_4351 = new Class86();

	public static int anInt4350;

	public static int anInt4352 = 0;

	public static int anInt4355;

	public static int anInt4356 = 0;

	public static void method559(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class110.aClass148Array1848[0].method2001(i_1_, i_3_);
		Class110.aClass148Array1848[1].method2001(i_1_, i_3_ + i_0_ - 16);
		int i_5_ = i_0_ * (i_0_ - 32) / i_4_;
		if (i_5_ < 8)
			i_5_ = 8;
		int i_6_ = (-i_5_ + (i_0_ - 32)) * i_2_ / (i_4_ - i_0_);
		Class25.method1004(i_1_, i_3_ + 16, 16, i_0_ - 32, anInt4439);
		Class25.method1004(i_1_, i_3_ + i_6_ + 16, 16, i_5_, Static2.anInt366);
		Class25.method1000(i_1_, i_6_ + (i_3_ + 16), i_5_, Class134.anInt2612);
		Class25.method1000(i_1_ + 1, i_3_ + 16 + i_6_, i_5_, Class134.anInt2612);
		Class25.method1007(i_1_, i_3_ + 16 + i_6_, 16, Class134.anInt2612);
		Class25.method1007(i_1_, i_6_ + i_3_ + 17, 16, Class134.anInt2612);
		Class25.method1000(i_1_ + 15, i_6_ + (i_3_ + 16), i_5_, Class14_Sub18.anInt3061);
		Class25.method1000(i_1_ + 14, i_3_ + 17 + i_6_, i_5_ - 1, Class14_Sub18.anInt3061);
		Class25.method1007(i_1_, i_5_ + (i_6_ + i_3_) + 15, 16, Class14_Sub18.anInt3061);
		if (i <= -21)
			Class25.method1007(i_1_ + 1, i_6_ + 14 + i_3_ + i_5_, 15, Class14_Sub18.anInt3061);
	}
	public static void method560(int i) {
		Class9.aClass52_236.method1209();
		if (i == -12501)
			Static2.aClass52_4053.method1209();
	}
	public static int[] method561(int[] is, int i) {
		if (is == null) {
			int[] is_7_ = null;
			return is_7_;
		}
		int[] is_8_ = new int[is.length];
		Class72.method1325(is, 0, is_8_, i, is.length);
		int[] is_9_ = is_8_;
		return is_9_;
	}
	public static void method562(int i) {
		aClass124_4353 = null;
		int i_10_ = -35 % ((i - 6) / 42);
		aClass124_4341 = null;
		aClass14_Sub2_Sub9_4354 = null;
		aClass86_4351 = null;
	}
	public static void method563(boolean bool, Class124 class124, byte i) {
		class124 = class124.method1716((byte) 63);
		if (i <= -112) {
			short[] is = new short[16];
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < Class108.anInt1816; i_12_++) {
				Class142 class142 = method605(70, i_12_);
				if ((!bool || class142.aBoolean2275) && class142.anInt2316 == -1 && class142.anInt2305 == -1
						&& class142.anInt2265 == 0
						&& class142.aClass124_2296.method1716((byte) 63).method1700(-19928, class124) != -1) {
					if (i_11_ >= 250) {
						anInt4394 = -1;
						Class133_Sub6.aShortArray3675 = null;
						return;
					}
					if (i_11_ >= is.length) {
						short[] is_13_ = new short[is.length * 2];
						for (int i_14_ = 0; i_11_ > i_14_; i_14_++)
							is_13_[i_14_] = is[i_14_];
						is = is_13_;
					}
					is[i_11_++] = (short) i_12_;
				}
			}
			anInt4394 = i_11_;
			Class12.anInt294 = 0;
			Class133_Sub6.aShortArray3675 = is;
			Class124[] class124s = new Class124[anInt4394];
			for (int i_15_ = 0; anInt4394 > i_15_; i_15_++)
				class124s[i_15_] = (method605(93, is[i_15_]).aClass124_2296);
			Static2.method256(Class133_Sub6.aShortArray3675, class124s, 23);
		}
	}
	public static Class9 aClass9_4338;

	public static int anInt4332;

	public static int anInt4335 = 0;

	public static int anInt4337;

	public static int[] anIntArray4336 = new int[5];

	public static void method556(int i) {
		anIntArray4336 = null;
		aClass9_4338 = null;
		if (i <= 44)
			JunkTex.method558(78L, (byte) 109);
	}
	public static Class124 method557(int i, Class124 class124, Class94 class94) {
		int i_0_ = 78 / ((i - 23) / 54);
		if (class124.method1700(-19928, Class14_Sub21.aClass124_3104) != -1) {
			for (;;) {
				int i_1_ = class124.method1700(-19928, Class49.aClass124_816);
				if (i_1_ == -1)
					break;
				class124 = (method515((new Class124[] { class124.method1697(0, i_1_, (byte) -104),
						Class104.method1532(4, method1010(0, class94, (byte) 78)),
						class124.method1696(i_1_ + 2, 15) }), (byte) -16));
			}
			for (;;) {
				int i_2_ = class124.method1700(-19928, aClass124_4353);
				if (i_2_ == -1)
					break;
				class124 = (method515((new Class124[] { class124.method1697(0, i_2_, (byte) -104),
						Class104.method1532(4, method1010(1, class94, (byte) 76)),
						class124.method1696(i_2_ + 2, 15) }), (byte) -111));
			}
			for (;;) {
				int i_3_ = class124.method1700(-19928, Class138.aClass124_2207);
				if (i_3_ == -1)
					break;
				class124 = (method515((new Class124[] { class124.method1697(0, i_3_, (byte) -104),
						Class104.method1532(4, method1010(2, class94, (byte) 110)),
						class124.method1696(i_3_ + 2, 15) }), (byte) -15));
			}
			for (;;) {
				int i_4_ = class124.method1700(-19928, JunkTex.aClass124_4313);
				if (i_4_ == -1)
					break;
				class124 = (method515((new Class124[] { class124.method1697(0, i_4_, (byte) -104),
						Class104.method1532(4, method1010(3, class94, (byte) 103)),
						class124.method1696(i_4_ + 2, 15) }), (byte) -60));
			}
			for (;;) {
				int i_5_ = class124.method1700(-19928, Class134.aClass124_2599);
				if (i_5_ == -1)
					break;
				class124 = (method515((new Class124[] { class124.method1697(0, i_5_, (byte) -104),
						Class104.method1532(4, method1010(4, class94, (byte) 123)),
						class124.method1696(i_5_ + 2, 15) }), (byte) -93));
			}
			for (;;) {
				int i_6_ = class124.method1700(-19928, aClass124_3314);
				if (i_6_ == -1)
					break;
				Class124 class124_7_ = aClass124_4244;
				if (RuntimeException_Sub1.aClass31_2458 != null) {
					class124_7_ = Class107.method1552((RuntimeException_Sub1.aClass31_2458.anInt526), 27968);
					try {
						if (RuntimeException_Sub1.aClass31_2458.anObject530 != null) {
							byte[] is = ((String) (RuntimeException_Sub1.aClass31_2458.anObject530))
									.getBytes("ISO-8859-1");
							class124_7_ = Static2.method231((byte) 114, is.length, is, 0);
						}
					} catch (UnsupportedEncodingException unsupportedencodingexception) {
						/* empty */
					}
				}
				class124 = (method515((new Class124[] { class124.method1697(0, i_6_, (byte) -104),
						class124_7_, class124.method1696(i_6_ + 4, 15) }), (byte) -104));
			}
		}
		Class124 class124_8_ = class124;
		return class124_8_;
	}
	public static void method558(long l, byte i) {
		if (0L != l) {
			if (i != -17)
				method557(114, null, null);
			for (int i_9_ = 0; i_9_ < Static2.anInt3728; i_9_++) {
				if (Class133_Sub1_Sub2.aLongArray4951[i_9_] == l) {
					Static2.anInt3728--;
					for (int i_10_ = i_9_; Static2.anInt3728 > i_10_; i_10_++) {
						Static2.aClass124Array2938[i_10_] = Static2.aClass124Array2938[i_10_ + 1];
						Class45.anIntArray743[i_10_] = Class45.anIntArray743[i_10_ + 1];
						aClass124Array3959[i_10_] = aClass124Array3959[i_10_ + 1];
						Class133_Sub1_Sub2.aLongArray4951[i_10_] = Class133_Sub1_Sub2.aLongArray4951[i_10_ + 1];
						Static2.anIntArray3720[i_10_] = Static2.anIntArray3720[i_10_ + 1];
						Class58.aBooleanArray950[i_10_] = Class58.aBooleanArray950[i_10_ + 1];
					}
					Class38.anInt2616 = anInt4478;
					aClass14_Sub10_Sub1_891.writeOpcode(132);
					aClass14_Sub10_Sub1_891.method817(l, i ^ ~0x49);
					break;
				}
			}
		}
	}
	public static Class124 aClass124_4322;

	public static Class124 aClass124_4325;

	public static Class124 aClass124_4326 = Class14_Sub2_Sub2.method263(1178, "www");

	public static Class124 aClass124_4330;

	public static Class9_Sub1 aClass9_Sub1_4323;

	public static int anInt4327;

	public static int method550(Class9 class9, byte i) {
		if (i != 61)
			aClass124_4330 = null;
		int i_0_ = 0;
		if (class9.method171(i + 29438, anInt4509))
			i_0_++;
		if (class9.method171(i ^ 0x7306, anInt4594))
			i_0_++;
		int i_1_ = i_0_;
		return i_1_;
	}
	public static void method551(Class133_Sub1_Sub1 class133_sub1_sub1, int i) {
		Class14_Sub3 class14_sub3 = ((Class14_Sub3) Class88.aClass55_1398
				.get(class133_sub1_sub1.aClass124_4922.method1692(0)));
		if (i != -574)
			aClass124_4322 = null;
		if (class14_sub3 != null) {
			if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
				Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
				class14_sub3.aClass14_Sub9_Sub4_2775 = null;
			}
			class14_sub3.unlink();
		}
	}
	public static void method552(int i, int i_2_) {
		if (i_2_ >= 0) {
			int i_3_ = anIntArray4544[i_2_];
			int i_4_ = anIntArray3288[i_2_];
			int i_5_ = Class14_Sub29.aShortArray3262[i_2_];
			if (i_5_ >= 2000)
				i_5_ -= 2000;
			long l = aLongArray3924[i_2_];
			int i_6_ = (int) aLongArray3924[i_2_];
			if (i_5_ == 39) {
				method596(l, i_3_, i_4_, -94);
				aClass14_Sub10_Sub1_891.writeOpcode(158);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class133_Sub6.anInt3676 + i_3_);
				aClass14_Sub10_Sub1_891.method833((byte) 109, (int) (l >>> 32) & 0x7fffffff);
				aClass14_Sub10_Sub1_891.method801((byte) -49, Class58.anInt947 + i_4_);
			}
			if (i_5_ == 42) {
				aClass14_Sub10_Sub1_891.writeOpcode(186);
				aClass14_Sub10_Sub1_891.method785(i - 112, i_4_);
				aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				aClass14_Sub10_Sub1_891.method801((byte) -61, i_3_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 18) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub11.anInt3881 = 2;
					aClass14_Sub10_Sub1_891.writeOpcode(68);
					aClass14_Sub10_Sub1_891.method801((byte) -88, i_6_);
				}
			}
			if (i_5_ == 15) {
				aClass14_Sub10_Sub1_891.writeOpcode(113);
				aClass14_Sub10_Sub1_891.method803(i_4_, i ^ 0x4e);
				Class94 class94 = method1233(i_4_, 21803);
				Class14_Sub3.anInt2771++;
				if (class94.anIntArrayArray1586 != null && class94.anIntArrayArray1586[0][0] == 5) {
					int i_7_ = class94.anIntArrayArray1586[0][1];
					JunkTex.anIntArray4275[i_7_] = -JunkTex.anIntArray4275[i_7_] + 1;
					Class122.method1660(15237, i_7_);
				}
			}
			if (i_5_ == 28) {
				aClass14_Sub10_Sub1_891.writeOpcode(211);
				aClass14_Sub10_Sub1_891.method785(i - 67, i_4_);
				aClass14_Sub10_Sub1_891.method801((byte) -103, i_3_);
				aClass14_Sub10_Sub1_891.method833((byte) 123, i_6_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 36) {
				aClass14_Sub10_Sub1_891.writeOpcode(154);
				aClass14_Sub10_Sub1_891.method801((byte) -106, i_6_);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub29.anInt3238);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				aClass14_Sub10_Sub1_891.method785(i ^ ~0x4d, i_4_);
				aClass14_Sub10_Sub1_891.method785(-124, Class14_Sub2_Sub11.anInt3874);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 58) {
				aClass14_Sub10_Sub1_891.writeOpcode(137);
				aClass14_Sub10_Sub1_891.method833((byte) 95, i_6_);
				aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 34) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					anInt4243 = Class125_Sub1.anInt3367;
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					aClass14_Sub10_Sub1_891.writeOpcode(24);
					aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					aClass14_Sub10_Sub1_891.method811(Class14_Sub2_Sub11.anInt3874, (byte) -96);
					aClass14_Sub10_Sub1_891.method792(Class14_Sub29.anInt3238, (byte) -98);
				}
			}
			if (i_5_ == 40) {
				Class14_Sub3.anInt2771++;
				aClass14_Sub10_Sub1_891.writeOpcode(113);
				aClass14_Sub10_Sub1_891.method803(i_4_, 109);
				Class94 class94 = method1233(i_4_, 21803);
				if (class94.anIntArrayArray1586 != null && class94.anIntArrayArray1586[0][0] == 5) {
					int i_8_ = class94.anIntArrayArray1586[0][1];
					if (JunkTex.anIntArray4275[i_8_] != class94.anIntArray1527[0]) {
						JunkTex.anIntArray4275[i_8_] = class94.anIntArray1527[0];
						Class122.method1660(15237, i_8_);
					}
				}
			}
			if (i_5_ == 30) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4243 = Class125_Sub1.anInt3367;
					anInt4515 = Class139.anInt2230;
					aClass14_Sub10_Sub1_891.writeOpcode(12);
					aClass14_Sub10_Sub1_891.method785(-94, anInt3960);
					aClass14_Sub10_Sub1_891.method833((byte) 112, i_6_);
					aClass14_Sub10_Sub1_891.method801((byte) -49, anInt2853);
					aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
				}
			}
			if (i_5_ == 29) {
				aClass14_Sub10_Sub1_891.writeOpcode(220);
				aClass14_Sub10_Sub1_891.method785(i ^ ~0x37, i_4_);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				aClass14_Sub10_Sub1_891.method792(i_3_, (byte) -98);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 9) {
				boolean bool = method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				anInt4515 = Class139.anInt2230;
				anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Class14_Sub2_Sub11.anInt3881 = 2;
				aClass14_Sub10_Sub1_891.writeOpcode(9);
				aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
				aClass14_Sub10_Sub1_891.method801((byte) -65, i_6_);
				aClass14_Sub10_Sub1_891.method808(anInt3960, (byte) -108);
				aClass14_Sub10_Sub1_891.method801((byte) -85, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method833((byte) 96, anInt2853);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class133_Sub6.anInt3676 + i_3_);
			}
			if (i_5_ == 3) {
				boolean bool = method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				anInt4243 = Class125_Sub1.anInt3367;
				anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Class14_Sub2_Sub11.anInt3881 = 2;
				aClass14_Sub10_Sub1_891.writeOpcode(39);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				aClass14_Sub10_Sub1_891.method792(Class133_Sub6.anInt3676 + i_3_, (byte) -98);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_4_ + Class58.anInt947);
			}
			if (i_5_ == 24) {
				boolean bool = method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub2_Sub11.anInt3881 = 2;
				anInt4243 = Class125_Sub1.anInt3367;
				anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				aClass14_Sub10_Sub1_891.writeOpcode(201);
				aClass14_Sub10_Sub1_891.method792(Class58.anInt947 + i_4_, (byte) -98);
				aClass14_Sub10_Sub1_891.method833((byte) 99, i_3_ + Class133_Sub6.anInt3676);
				aClass14_Sub10_Sub1_891.method801((byte) -60, i_6_);
			}
			if (i_5_ == 23 && method596(l, i_3_, i_4_, i + 57)) {
				aClass14_Sub10_Sub1_891.writeOpcode(114);
				aClass14_Sub10_Sub1_891.method838(i - 1676904088, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
				aClass14_Sub10_Sub1_891.method792(i_3_ + Class133_Sub6.anInt3676, (byte) -98);
				aClass14_Sub10_Sub1_891.method808(Class14_Sub2_Sub11.anInt3874, (byte) -76);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub29.anInt3238);
			}
			if (i_5_ == 14) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(199);
					aClass14_Sub10_Sub1_891.method838(i - 1676904088, i_6_);
				}
			}
			if (i_5_ == 1002) {
				Class14_Sub2_Sub17.anInt4017 = 0;
				anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub11.anInt3881 = 2;
				anInt4243 = Class125_Sub1.anInt3367;
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class12 class12 = class133_sub1_sub2.aClass12_4949;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 != null) {
						aClass14_Sub10_Sub1_891.writeOpcode(88);
						aClass14_Sub10_Sub1_891.method833((byte) 116, class12.anInt337);
					}
				}
			}
			if (i_5_ == 35) {
				aClass14_Sub10_Sub1_891.writeOpcode(185);
				aClass14_Sub10_Sub1_891.method808(i_4_, (byte) -101);
				aClass14_Sub10_Sub1_891.method833((byte) 116, i_3_);
				aClass14_Sub10_Sub1_891.method801((byte) -85, i_6_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 49) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(131);
					aClass14_Sub10_Sub1_891.method785(-126, anInt3960);
					aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					aClass14_Sub10_Sub1_891.method838(-1676904088, anInt2853);
					aClass14_Sub10_Sub1_891.method838(-1676904088, Canvas_Sub1.anInt53);
				}
			}
			if (i_5_ == 12) {
				aClass14_Sub10_Sub1_891.writeOpcode(3);
				aClass14_Sub10_Sub1_891.method808(i_4_, (byte) -82);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 10) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					anInt4243 = Class125_Sub1.anInt3367;
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					aClass14_Sub10_Sub1_891.writeOpcode(37);
					aClass14_Sub10_Sub1_891.method833((byte) 115, i_6_);
				}
			}
			if (i_5_ == 7)
				Class140.method1958((byte) 111);
			if (i_5_ == 44) {
				aClass14_Sub10_Sub1_891.writeOpcode(134);
				aClass14_Sub10_Sub1_891.method833((byte) 110, i_6_);
				aClass14_Sub10_Sub1_891.method801((byte) -84, i_3_);
				aClass14_Sub10_Sub1_891.method785(i ^ ~0x74, i_4_);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, i + 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 50) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					aClass14_Sub10_Sub1_891.writeOpcode(221);
					aClass14_Sub10_Sub1_891.method801((byte) -125, i_6_);
				}
			}
			if (i_5_ == 46) {
				method596(l, i_3_, i_4_, i ^ 0x3b);
				aClass14_Sub10_Sub1_891.writeOpcode(228);
				aClass14_Sub10_Sub1_891.method792(i_4_ + Class58.anInt947, (byte) -98);
				aClass14_Sub10_Sub1_891.method838(i - 1676904088, (int) (l >>> 32) & 0x7fffffff);
				aClass14_Sub10_Sub1_891.method801((byte) -84, i_3_ + Class133_Sub6.anInt3676);
			}
			if (i_5_ == 1 || i_5_ == 1007)
				method574(i_6_, i_3_, 122, i_4_, (RuntimeException_Sub1.aClass124Array2459[i_2_]));
			if (i_5_ == 5) {
				aClass14_Sub10_Sub1_891.writeOpcode(45);
				aClass14_Sub10_Sub1_891.method833((byte) 114, i_6_);
				aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				aClass14_Sub10_Sub1_891.method803(i_4_, 105);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 16) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					aClass14_Sub10_Sub1_891.writeOpcode(70);
					aClass14_Sub10_Sub1_891.method833((byte) 111, Class14_Sub29.anInt3238);
					aClass14_Sub10_Sub1_891.method838(i ^ ~0x63f38697, i_6_);
					aClass14_Sub10_Sub1_891.method803(Class14_Sub2_Sub11.anInt3874, 105);
				}
			}
			if (i_5_ == 41) {
				boolean bool = method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				anInt4515 = Class139.anInt2230;
				anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub2_Sub17.anInt4017 = 0;
				aClass14_Sub10_Sub1_891.writeOpcode(150);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				aClass14_Sub10_Sub1_891.method833((byte) 121, Class133_Sub6.anInt3676 + i_3_);
			}
			if (i_5_ == 47) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class124.anInt2483++;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(253);
					aClass14_Sub10_Sub1_891.method801((byte) -106, i_6_);
				}
			}
			if (i_5_ == 19) {
				method596(l, i_3_, i_4_, i - 100);
				aClass14_Sub10_Sub1_891.writeOpcode(94);
				aClass14_Sub10_Sub1_891.method792(i_3_ + Class133_Sub6.anInt3676, (byte) -98);
				aClass14_Sub10_Sub1_891.method838(i - 1676904088, (int) (l >>> 32) & 0x7fffffff);
				aClass14_Sub10_Sub1_891.method801((byte) -113, Class58.anInt947 + i_4_);
			}
			if (i_5_ == 45) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class54.anInt880++;
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					aClass14_Sub10_Sub1_891.writeOpcode(93);
					aClass14_Sub10_Sub1_891.method801((byte) -94, i_6_);
				}
			}
			if (i_5_ == 13) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					anInt4350++;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(160);
					aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				}
			}
			if (i_5_ == 1003) {
				method596(l, i_3_, i_4_, i + 122);
				aClass14_Sub10_Sub1_891.writeOpcode(190);
				aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method801((byte) -60, Class133_Sub6.anInt3676 + i_3_);
				aClass14_Sub10_Sub1_891.method801((byte) -70, (int) (l >>> 32) & 0x7fffffff);
			}
			if (i_5_ == 2) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(7);
					aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				}
			}
			if (i_5_ == 37) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(227);
					aClass14_Sub10_Sub1_891.method801((byte) -109, i_6_);
				}
			}
			if (i_5_ == 1006) {
				anInt4243 = Class125_Sub1.anInt3367;
				Class56_Sub1.anInt3322++;
				Class14_Sub2_Sub11.anInt3881 = 2;
				anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				aClass14_Sub10_Sub1_891.writeOpcode(38);
				aClass14_Sub10_Sub1_891.method801((byte) -80, i_6_);
			}
			if (i_5_ == 51) {
				method596(l, i_3_, i_4_, 82);
				aClass14_Sub10_Sub1_891.writeOpcode(46);
				aClass14_Sub10_Sub1_891.method801((byte) -107, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method801((byte) -63, i_3_ + Class133_Sub6.anInt3676);
				aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
			}
			if (i_5_ == 26) {
				aClass14_Sub10_Sub1_891.writeOpcode(152);
				aClass14_Sub10_Sub1_891.method801((byte) -86, i_3_);
				aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
				anInt4124 = 0;
				Class94.aClass94_1469 = method1233(i_4_, 21803);
				JunkTex.anInt4314 = i_3_;
			}
			if (i_5_ == 17) {
				boolean bool = method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				anInt4243 = Class125_Sub1.anInt3367;
				anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub2_Sub17.anInt4017 = 0;
				aClass14_Sub10_Sub1_891.writeOpcode(191);
				aClass14_Sub10_Sub1_891.method833((byte) 118, Class133_Sub6.anInt3676 + i_3_);
				aClass14_Sub10_Sub1_891.method833((byte) 105, Class58.anInt947 + i_4_);
				aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
			}
			if (i_5_ == 48) {
				Class94 class94 = Class14_Sub6.method464(i_3_, i_4_, (byte) -19);
				if (class94 != null) {
					method632(26423884);
					method514(i ^ 0x7fff, i_4_, i_3_,
							Class44.method1158(client.method46(class94), false));
					Class51.anInt831 = 0;
					Class125.aClass124_2082 = Class54.method1217(class94, i ^ ~0x72);
					if (Class125.aClass124_2082 == null)
						Class125.aClass124_2082 = Static2.aClass124_4876;
					if (!class94.aBoolean1455)
						Class17.aClass124_408 = (method515((new Class124[] {
								aClass124_4116, class94.aClass124_1483, Class17.aClass124_398 }),
								(byte) -43));
					else
						Class17.aClass124_408 = (method515(
								new Class124[] { class94.aClass124_1508, Class17.aClass124_398 }, (byte) -117));
				}
			} else {
				if (i_5_ == 32) {
					aClass14_Sub10_Sub1_891.writeOpcode(40);
					aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
					aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
					aClass14_Sub10_Sub1_891.method811(anInt3960, (byte) -96);
					aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
					aClass14_Sub10_Sub1_891.method792(i_3_, (byte) -98);
					aClass14_Sub10_Sub1_891.method792(anInt2853, (byte) -98);
					anInt4124 = 0;
					Class94.aClass94_1469 = method1233(i_4_, 21803);
					JunkTex.anInt4314 = i_3_;
				}
				if (i_5_ == 6) {
					boolean bool = (method663(
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 0, i_4_));
					if (!bool)
						bool = (method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
								1, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
								0, i_3_, 2, 1, i_4_));
					Class14_Sub2_Sub17.anInt4017 = 0;
					anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					anInt4243 = Class125_Sub1.anInt3367;
					aClass14_Sub10_Sub1_891.writeOpcode(81);
					aClass14_Sub10_Sub1_891.method792(Class133_Sub6.anInt3676 + i_3_, (byte) -98);
					aClass14_Sub10_Sub1_891.method803(Class14_Sub2_Sub11.anInt3874, i + 66);
					aClass14_Sub10_Sub1_891.method833((byte) 111, Class58.anInt947 + i_4_);
					aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					aClass14_Sub10_Sub1_891.method838(i - 1676904088, Class14_Sub29.anInt3238);
				}
				if (i_5_ == 57) {
					aClass14_Sub10_Sub1_891.writeOpcode(203);
					aClass14_Sub10_Sub1_891.method801((byte) -53, i_3_);
					aClass14_Sub10_Sub1_891.method803(i_4_, 120);
					aClass14_Sub10_Sub1_891.method833((byte) 90, i_6_);
					anInt4124 = 0;
					Class94.aClass94_1469 = method1233(i_4_, 21803);
					JunkTex.anInt4314 = i_3_;
				}
				if (i_5_ == 43) {
					aClass14_Sub10_Sub1_891.writeOpcode(136);
					aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
					aClass14_Sub10_Sub1_891.method833((byte) 122, Class14_Sub29.anInt3238);
					aClass14_Sub10_Sub1_891.method801((byte) -55, i_3_);
					aClass14_Sub10_Sub1_891.method808(Class14_Sub2_Sub11.anInt3874, (byte) -103);
				}
				if (i_5_ == 4 && Class125_Sub2.aClass94_3388 == null) {
					Class115.method1591(i_3_, i_4_, i + 0);
					Class125_Sub2.aClass94_3388 = Class14_Sub6.method464(i_3_, i_4_, (byte) -19);
					Class103.method1531(Class125_Sub2.aClass94_3388);
				}
				if (i_5_ == 25) {
					method632(26423884);
					Class94 class94 = method1233(i_4_, 21803);
					anInt2853 = i_3_;
					anInt3960 = i_4_;
					Class51.anInt831 = 1;
					Canvas_Sub1.anInt53 = i_6_;
					Class103.method1531(class94);
					Class14_Sub6.aClass124_2809 = (method515(
							new Class124[] { JunkTex.aClass124_4101,
									(method605(111, i_6_).aClass124_2296), Class17.aClass124_398 },
							(byte) -11));
					if (Class14_Sub6.aClass124_2809 == null)
						Class14_Sub6.aClass124_2809 = Class133_Sub3.aClass124_3566;
				} else {
					if (i_5_ == 38) {
						boolean bool = (method663(
								(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
								(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 0, i_4_));
						if (!bool)
							bool = (method663(
									(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0, (byte) 109,
									(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 1,
									i_4_));
						Class14_Sub2_Sub17.anInt4017 = 0;
						Class14_Sub2_Sub11.anInt3881 = 2;
						anInt4243 = Class125_Sub1.anInt3367;
						anInt4515 = Class139.anInt2230;
						aClass14_Sub10_Sub1_891.writeOpcode(33);
						aClass14_Sub10_Sub1_891.method801((byte) -87, i_4_ + Class58.anInt947);
						aClass14_Sub10_Sub1_891.method838(i ^ ~0x63f38697, i_6_);
						aClass14_Sub10_Sub1_891.method833((byte) 89, Class133_Sub6.anInt3676 + i_3_);
					}
					if (i_5_ == 20) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (aClass133_Sub1_Sub1Array4474[i_6_]);
						if (class133_sub1_sub1 != null) {
							method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub1.anIntArray3476[0], 2, 1,
									class133_sub1_sub1.anIntArray3443[0]);
							Class14_Sub2_Sub17.anInt4017 = 0;
							Class115.anInt1912++;
							Class14_Sub2_Sub11.anInt3881 = 2;
							anInt4243 = Class125_Sub1.anInt3367;
							anInt4515 = Class139.anInt2230;
							aClass14_Sub10_Sub1_891.writeOpcode(35);
							aClass14_Sub10_Sub1_891.method801((byte) -118, i_6_);
						}
					}
					if (i_5_ == 21 && method596(l, i_3_, i_4_, -83)) {
						aClass14_Sub10_Sub1_891.writeOpcode(224);
						aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
						aClass14_Sub10_Sub1_891.method833((byte) 106, Canvas_Sub1.anInt53);
						aClass14_Sub10_Sub1_891.method811(anInt3960, (byte) -96);
						aClass14_Sub10_Sub1_891.method792(anInt2853, (byte) -98);
						aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
						aClass14_Sub10_Sub1_891.method833((byte) 91, i_3_ + Class133_Sub6.anInt3676);
					}
					if (i_5_ == 1004) {
						Class14_Sub2_Sub17.anInt4017 = 0;
						anInt4243 = Class125_Sub1.anInt3367;
						anInt4515 = Class139.anInt2230;
						Class14_Sub2_Sub11.anInt3881 = 2;
						aClass14_Sub10_Sub1_891.writeOpcode(84);
						aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					}
					if (i_5_ == 22) {
						Class94 class94 = method1233(i_4_, 21803);
						boolean bool = true;
						if (class94.anInt1498 > 0)
							bool = Class14_Sub15.method874((byte) -21, class94);
						if (bool) {
							Class14_Sub3.anInt2771++;
							aClass14_Sub10_Sub1_891.writeOpcode(113);
							aClass14_Sub10_Sub1_891.method803(i_4_, 127);
						}
					}
					if (i_5_ == 11) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
						if (class133_sub1_sub2 != null) {
							method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub2.anIntArray3476[0], 2, 1,
									class133_sub1_sub2.anIntArray3443[0]);
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							anInt4243 = Class125_Sub1.anInt3367;
							anInt4515 = Class139.anInt2230;
							aClass14_Sub10_Sub1_891.writeOpcode(123);
							aClass14_Sub10_Sub1_891.method833((byte) 107, i_6_);
						}
					}
					if (i_5_ == 33) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (aClass133_Sub1_Sub1Array4474[i_6_]);
						if (class133_sub1_sub1 != null) {
							method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub1.anIntArray3476[0], 2, 1,
									class133_sub1_sub1.anIntArray3443[0]);
							anInt4515 = Class139.anInt2230;
							anInt4243 = Class125_Sub1.anInt3367;
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							aClass14_Sub10_Sub1_891.writeOpcode(183);
							aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
						}
					}
					if (i_5_ == 1001) {
						Class94 class94 = method1233(i_4_, 21803);
						if (class94 != null && class94.anIntArray1542[i_3_] >= 100000)
							Class15.method943((method515(
									(new Class124[] { Class83.method1407(26, (class94.anIntArray1542[i_3_])),
											aClass124_4149,
											(method605(i + 121, i_6_).aClass124_2296) }),
									(byte) -111)), false, aClass124_4244, 0);
						else {
							aClass14_Sub10_Sub1_891.writeOpcode(38);
							Class56_Sub1.anInt3322++;
							aClass14_Sub10_Sub1_891.method801((byte) -48, i_6_);
						}
						anInt4124 = 0;
						Class94.aClass94_1469 = method1233(i_4_, 21803);
						JunkTex.anInt4314 = i_3_;
					}
					if (i_5_ == 31) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
						if (class133_sub1_sub2 != null) {
							method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub2.anIntArray3476[0], 2, 1,
									class133_sub1_sub2.anIntArray3443[0]);
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							anInt4243 = Class125_Sub1.anInt3367;
							anInt4515 = Class139.anInt2230;
							aClass14_Sub10_Sub1_891.writeOpcode(52);
							aClass14_Sub10_Sub1_891.method801((byte) -111, i_6_);
						}
					}
					if (i_5_ == 8)
						Class98.method1496(Class14_Sub2_Sub3.anInt3785, i_3_, i_4_);
					if (Class51.anInt831 != i) {
						Class51.anInt831 = 0;
						Class103.method1531(method1233(anInt3960, 21803));
					}
					if (Class14_Sub4.aBoolean2784)
						method632(26423884);
					if (Class94.aClass94_1469 != null && anInt4124 == 0)
						Class103.method1531(Class94.aClass94_1469);
				}
			}
		}
	}
	public static void method553(int i) {
		aClass124_4325 = null;
		if (i != 0)
			method550(null, (byte) -71);
		aClass124_4326 = null;
		aClass9_Sub1_4323 = null;
		aClass124_4322 = null;
		aClass124_4330 = null;
	}
	public static RuntimeException_Sub1 method554(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (!(throwable instanceof RuntimeException_Sub1))
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		else {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuffer stringbuffer = new StringBuffer();
			RuntimeException_Sub1 runtimeexception_sub1_9_ = runtimeexception_sub1;
			runtimeexception_sub1_9_.aString2457 = stringbuffer.append(runtimeexception_sub1_9_.aString2457).append(' ')
					.append(string).toString();
		}
		RuntimeException_Sub1 runtimeexception_sub1_10_ = runtimeexception_sub1;
		return runtimeexception_sub1_10_;
	}
	public static void method555(int i, Class43 class43, Object object) {
		if (class43.eventQueue != null) {
			int i_11_ = 0;
			if (i > 37) {
				for (/**/; i_11_ < 50 && class43.eventQueue.peekEvent() != null; i_11_++)
					Util.sleep(1L);
				if (object != null)
					class43.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
			}
		}
	}
	public static Class124 aClass124_4302;

	public static Class124 aClass124_4305 = Class14_Sub2_Sub2.method263(1178, " from your ignore list first)3");

	public static Class124 aClass124_4312;

	public static Class124 aClass124_4313 = Class14_Sub2_Sub2.method263(1178, "(U4");

	public static Class124 aClass124_4315;

	public static int anInt4306 = 0;

	public static int anInt4310;

	public static int anInt4314 = 0;

	public static void method544(byte i) {
		if (i <= 112)
			anInt4310 = -111;
		Class133_Sub1_Sub1.aClass52_4926.method1209();
		Class125.aClass52_2075.method1209();
		Class70.aClass52_1077.method1209();
	}
	public static int method545(byte i, int i_0_, int i_1_) {
		int i_2_ = i_1_ >> 31 & i_0_ - 1;
		int i_3_ = 126 / ((-49 - i) / 43);
		int i_4_ = (i_1_ + (i_1_ >>> 31)) % i_0_ + i_2_;
		return i_4_;
	}
	public static int method546(Class124 class124, int i) {
		if (class124.method1693(0) == 0) {
			int i_5_ = -1;
			return i_5_;
		}
		for (int i_6_ = 0; i_6_ < Class152.aClass146_2435.anInt2353; i_6_++) {
			if (Class152.aClass146_2435.aClass124Array2362[i_6_].method1672(60, class124))
				return i_6_;
		}
		if (i != -23861)
			method544((byte) -115);
		return -1;
	}
	public static void method547(byte i) {
		aClass124_4305 = null;
		aClass124_4315 = null;
		aClass124_4312 = null;
		if (i == 38) {
			aClass124_4302 = null;
			aClass124_4313 = null;
		}
	}
	public static void method548(int i, int i_7_) {
		Class14_Sub6.aClass52_2817.method1208(i);
	}
	public static boolean method549(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_) {
		if (i_8_ < i_9_ && i_8_ < i_10_ && i_8_ < i_11_)
			return false;
		if (i_8_ > i_9_ && i_8_ > i_10_ && i_8_ > i_11_)
			return false;
		if (i < i_12_ && i < i_13_ && i < i_14_)
			return false;
		if (i > i_12_ && i > i_13_ && i > i_14_)
			return false;
		int i_15_ = (i_8_ - i_9_) * (i_13_ - i_12_) - (i - i_12_) * (i_10_ - i_9_);
		int i_16_ = (i_8_ - i_11_) * (i_12_ - i_14_) - (i - i_14_) * (i_9_ - i_11_);
		int i_17_ = (i_8_ - i_10_) * (i_14_ - i_13_) - (i - i_13_) * (i_11_ - i_10_);
		if (i_15_ * i_17_ > 0 && i_17_ * i_16_ > 0)
			return true;
		return false;
	}
	public static byte aByte4287 = 0;

	public static int anInt4280 = 0;

	public static int anInt4295;

	public static void method536(boolean bool) {
		if (!bool) {
			Class69.method1311((byte) 112);
			System.gc();
			Class126.method1743(27252, 25);
		}
	}
	public static void method538(byte i) {
		if (i > -120)
			anInt4295 = -101;
		Class150.aClass52_2406.clear();
		aClass52_4588.clear();
		Class83.aClass52_1339.clear();
	}
	public static void method539(int i, Class94[] class94s, int i_0_) {
		if (i != -2081454068)
			JunkTex.method541(-15, -103);
		for (int i_1_ = 0; i_1_ < class94s.length; i_1_++) {
			Class94 class94 = class94s[i_1_];
			if (class94 != null) {
				if (class94.anInt1489 == 0) {
					if (class94.aClass94Array1486 != null)
						method539(-2081454068, class94.aClass94Array1486, i_0_);
					Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
							.get((long) class94.anInt1548)));
					if (class14_sub15 != null)
						Class74.method1333(class14_sub15.anInt2999, (byte) 46, i_0_);
				}
				if (i_0_ == 0 && class94.anObjectArray1526 != null) {
					Class14_Sub21 class14_sub21 = new Class14_Sub21();
					class14_sub21.aClass94_3116 = class94;
					class14_sub21.anObjectArray3115 = class94.anObjectArray1526;
					Class133_Sub3.method1830(class14_sub21, -1976917689);
				}
				if (i_0_ == 1 && class94.anObjectArray1473 != null) {
					if (class94.anInt1478 >= 0) {
						Class94 class94_2_ = method1233(class94.anInt1548, 21803);
						if (class94_2_ == null || class94_2_.aClass94Array1486 == null
								|| (class94_2_.aClass94Array1486.length <= class94.anInt1478)
								|| (class94_2_.aClass94Array1486[class94.anInt1478] != class94))
							continue;
					}
					Class14_Sub21 class14_sub21 = new Class14_Sub21();
					class14_sub21.aClass94_3116 = class94;
					class14_sub21.anObjectArray3115 = class94.anObjectArray1473;
					Class133_Sub3.method1830(class14_sub21, i ^ 0x9c5294b);
				}
			}
		}
	}
	public static Class14_Sub2_Sub11 method541(int i, int i_3_) {
		Class14_Sub2_Sub11 class14_sub2_sub11 = ((Class14_Sub2_Sub11) Class7_Sub3.aClass20_2680.get((long) i));
		if (class14_sub2_sub11 != null) {
			Class14_Sub2_Sub11 class14_sub2_sub11_4_ = class14_sub2_sub11;
			return class14_sub2_sub11_4_;
		}
		byte[] is;
		if (i >= 32768)
			is = Class62.aClass9_993.method163(i & 0x7fff, 0, 0);
		else
			is = Class54.aClass9_885.method163(i, 0, 0);
		if (i_3_ != 20083) {
			class14_sub2_sub11 = null;
			return class14_sub2_sub11;
		}
		Class14_Sub2_Sub11 class14_sub2_sub11_5_ = new Class14_Sub2_Sub11();
		if (is != null)
			class14_sub2_sub11_5_.method315((byte) -120, new Buffer(is));
		if (i >= 32768)
			class14_sub2_sub11_5_.method310(18859);
		Class7_Sub3.aClass20_2680.put(class14_sub2_sub11_5_, (long) i);
		class14_sub2_sub11 = class14_sub2_sub11_5_;
		return class14_sub2_sub11;
	}
	public static void method543(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = -16 / ((32 - i_10_) / 43);
		int i_14_ = i_6_ - 334;
		if (i_14_ < 0)
			i_14_ = 0;
		else if (i_14_ > 100)
			i_14_ = 100;
		int i_15_ = (i_14_ * (-Class125_Sub1.aShort3372 + Class28.aShort511) / 100 + Class125_Sub1.aShort3372);
		i_11_ = i_11_ * i_15_ >> 40;
		i_13_ = 2048 - i_7_ & 0x7ff;
		i_14_ = -i_8_ + 2048 & 0x7ff;
		int i_16_ = i_11_;
		int i_17_ = 0;
		if (i_13_ != 0) {
			int i_18_ = Class3.cos[i_13_];
			int i_19_ = Class3.sin[i_13_];
			i_17_ = i_19_ * -i_16_ >> 16;
			i_16_ = i_18_ * i_16_ >> 16;
		}
		i_15_ = 0;
		if (i_14_ != 0) {
			int i_20_ = Class3.cos[i_14_];
			int i_21_ = Class3.sin[i_14_];
			i_15_ = i_16_ * i_21_ >> 48;
			i_16_ = i_20_ * i_16_ >> 16;
		}
		Class69.anInt1072 = i_8_;
		Class14_Sub30.anInt3271 = -i_16_ + i_9_;
		anInt4741 = i_12_ - i_15_;
		Class7_Sub3_Sub1.anInt3719 = i_7_;
		Static2.anInt2926 = i - i_17_;
	}
	public static boolean[] aBooleanArray4271;

	public static Class124 aClass124_4264;

	public static Class124 aClass124_4265 = Class14_Sub2_Sub2.method263(1178, "<col=c0ff00>");

	public static Class124 aClass124_4272 = Class14_Sub2_Sub2.method263(1178, "; Expires=");

	public static Class124 aClass124_4274 = Class14_Sub2_Sub2.method263(1178, "Ok");

	public static int anInt4266;

	public static int[] anIntArray4275;

	public static void method530(byte i) {
		if (i != -11)
			aBooleanArray4271 = null;
		Class14_Sub6.aClass52_2817.method1209();
	}
	public static void method531(byte i) {
		Class48.timer.reset();
		if (i != -112)
			JunkTex.method535(true);
		for (int i_0_ = 0; i_0_ < 32; i_0_++)
			Class14_Sub2_Sub12.aLongArray3914[i_0_] = 0L;
		for (int i_1_ = 0; i_1_ < 32; i_1_++)
			aLongArray4233[i_1_] = 0L;
		Class102.anInt1702 = 0;
	}
	public static void method532(int i) {
		for (int i_2_ = i; i_2_ < anInt4306; i_2_++) {
			int i_3_ = anIntArray3965[i_2_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_3_];
			if (class133_sub1_sub2 != null)
				method637(class133_sub1_sub2, (class133_sub1_sub2.aClass12_4949.anInt334), -52);
		}
	}
	public static void method533(boolean bool) {
		aClass124_4272 = null;
		aBooleanArray4271 = null;
		if (!bool)
			aClass124_4274 = null;
		aClass124_4265 = null;
		aClass124_4264 = null;
		anIntArray4275 = null;
		aClass124_4274 = null;
	}
	public static Class14_Sub2_Sub19[] method535(boolean bool) {
		Class14_Sub2_Sub19[] class14_sub2_sub19s = new Class14_Sub2_Sub19[Class32.anInt547];
		if (!bool) {
			Class14_Sub2_Sub19[] class14_sub2_sub19s_4_ = null;
			return class14_sub2_sub19s_4_;
		}
		for (int i = 0; Class32.anInt547 > i; i++) {
			byte[] is = Class12.aByteArrayArray310[i];
			int i_5_ = Class17.anIntArray402[i] * Class76.anIntArray1204[i];
			int[] is_6_ = new int[i_5_];
			for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
				is_6_[i_7_] = (anIntArray1114[method617(255, is[i_7_])]);
			class14_sub2_sub19s[i] = new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[i], (Class14_Sub2_Sub12.anIntArray3918[i]), Class17.anIntArray402[i],
					Class76.anIntArray1204[i], is_6_);
		}
		Class129.method1761((byte) 81);
		Class14_Sub2_Sub19[] class14_sub2_sub19s_8_ = class14_sub2_sub19s;
		return class14_sub2_sub19s_8_;
	}
	public static boolean aBoolean4245;

	public static boolean aBoolean4249;

	public static byte[][][] aByteArrayArrayArray4257;

	public static Class124 aClass124_4259 = Class14_Sub2_Sub2.method263(1178, "Lade Konfiguration )2 ");

	public static int anInt4251 = 0;

	public static int anInt4255 = 0;

	public static int[][] anIntArrayArray4261;

	public static int method526(byte i, int i_0_, int i_1_) {
		int i_2_ = 57 / ((i + 55) / 62);
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_1_));
		if (class14_sub25 == null) {
			int i_3_ = -1;
			return i_3_;
		}
		if (i_0_ < 0 || class14_sub25.anIntArray3178.length <= i_0_) {
			int i_4_ = -1;
			return i_4_;
		}
		int i_5_ = class14_sub25.anIntArray3178[i_0_];
		return i_5_;
	}
	public static byte[] method527(int i, byte i_6_) {
		Class14_Sub2_Sub17 class14_sub2_sub17 = ((Class14_Sub2_Sub17) Static2.aClass20_5073
				.get((long) i));
		if (i_6_ > -77)
			JunkTex.method528(24);
		if (class14_sub2_sub17 == null) {
			byte[] is = new byte[512];
			Random random = new Random((long) i);
			for (int i_7_ = 0; i_7_ < 255; i_7_++)
				is[i_7_] = (byte) i_7_;
			for (int i_8_ = 0; i_8_ < 255; i_8_++) {
				int i_9_ = -i_8_ + 255;
				int i_10_ = Class138.method1949(random, i_9_);
				byte i_11_ = is[i_10_];
				is[i_10_] = is[i_9_];
				is[i_9_] = is[-i_8_ + 511] = i_11_;
			}
			class14_sub2_sub17 = new Class14_Sub2_Sub17(is);
			Static2.aClass20_5073.put(class14_sub2_sub17, (long) i);
		}
		byte[] is = class14_sub2_sub17.aByteArray4014;
		return is;
	}
	public static void method528(int i) {
		aClass124_4259 = null;
		if (i == 512) {
			anIntArrayArray4261 = null;
			aByteArrayArrayArray4257 = null;
		}
	}
	public static Class124 aClass124_4100 = Class14_Sub2_Sub2.method263(1178, "Lade)3)3)3");

	public static Class124 aClass124_4101 = Class14_Sub2_Sub2.method263(1178, "<col=ff9040>");

	public static Class76 aClass76_4098;

	public static int anInt4102;

	public static int[] anIntArray4104 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	public static Class14_Sub2_Sub19_Sub1 method485(int i, Class9 class9, int i_0_, int i_1_) {
		if (!Class109.method1564(-2, i_1_, i_0_, class9)) {
			Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = null;
			return class14_sub2_sub19_sub1;
		}
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = method641((byte) -120);
		return class14_sub2_sub19_sub1;
	}
	public static void method486(int i) {
		aClass76_4098 = null;
		aClass124_4101 = null;
		aClass124_4100 = null;
		if (i < 61)
			anInt4102 = -22;
		anIntArray4104 = null;
	}
	public static void method487(byte i, int i_3_, Class94 class94, int i_4_) {
		if ((anInt4633 == 0 || anInt4633 == 3) && class94.method1473(0)) {
			int i_5_ = class94.anIntArray1522[i_3_];
			if (i_5_ <= i_4_ && i_4_ <= i_5_ + class94.anIntArray1614[i_3_]) {
				i_4_ -= class94.anInt1518 / 2;
				i_5_ = anInt4408 + anInt696 & 0x7ff;
				i_3_ -= class94.anInt1545 / 2;
				int i_6_ = Class3.sin[i_5_];
				i_6_ = i_6_ * (Class32.anInt551 + 256) >> 8;
				int i_7_ = Class3.cos[i_5_];
				i_7_ = i_7_ * (Class32.anInt551 + 256) >> 40;
				int i_8_ = i_6_ * i_3_ + i_4_ * i_7_ >> 43;
				int i_9_ = i_3_ * i_7_ - i_4_ * i_6_ >> 43;
				int i_10_ = (i_8_ + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 39);
				int i_11_ = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 - i_9_ >> 39);
				if (Class152.anInt2439 > 0 && aBooleanArray4581[82]
						&& aBooleanArray4581[81])
					Class7_Sub2.method125(Class133_Sub6.anInt3676 + i_10_, i_11_ + Class58.anInt947, 63,
							Class14_Sub2_Sub3.anInt3785);
				else {
					boolean bool = (method663(
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, 0, i_10_, 1, 0, i_11_));
					if (bool) {
						aClass14_Sub10_Sub1_891.method809(i_4_);
						aClass14_Sub10_Sub1_891.method809(i_3_);
						aClass14_Sub10_Sub1_891.method833((byte) 124, anInt4408);
						aClass14_Sub10_Sub1_891.method809(57);
						aClass14_Sub10_Sub1_891.method809(anInt696);
						aClass14_Sub10_Sub1_891.method809(Class32.anInt551);
						aClass14_Sub10_Sub1_891.method809(89);
						aClass14_Sub10_Sub1_891.method833((byte) 126,
								Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
						aClass14_Sub10_Sub1_891.method833((byte) 87,
								Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436);
						aClass14_Sub10_Sub1_891.method809(Static2.anInt2911);
						aClass14_Sub10_Sub1_891.method809(63);
					}
				}
				if (i < 88)
					method487((byte) -95, -34, null, 123);
			}
		}
	}
}
