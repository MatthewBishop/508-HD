/* Static - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.awt.Component;
import java.awt.Frame;
import java.io.IOException;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.link.Deque;
import com.jagex.link.Cache;
import com.jagex.link.HashTable;
import com.jagex.map.MapRegion;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class148_Sub2;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1_Sub2;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;
import com.jagex.rt4.ShadowManager;
import com.jagex.rt4.Class25;
import com.jagex.rt4.lights.LightManager;

import rs.*;

public class Static {

	static {
		Static.aClass124_3301 = Class14_Sub2_Sub2.method263(1178, "<br>(X100(U(Y");
		Static.aClass124_3291 = Static.aClass124_3297;
		Static.aShort2540 = (short) 256;
		Static.anIntArrayArray2545 = (new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 },
				{ 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 },
				{ 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
				{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
				{ 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } });
		Static.anInt2552 = 0;
		Static.aBoolean2539 = false;
	}
	
	static {
		Static.aClass2_683 = new Deque();
		Static.aClass124_693 = Class14_Sub2_Sub2.method263(1178, "M");
		Static.aClass124_694 = Static.aClass124_693;
		Static.aClass124_695 = Static.aClass124_693;
		Static.anInt696 = 0;
		Static.aClass124_697 = Class14_Sub2_Sub2.method263(1178, "sl_stars");
	}
	
	public static void method1133(byte i) {
		int i_18_ = 35 % ((i - 8) / 38);
		Class21.aClass52_444.clear();
		Class14_Sub2_Sub12.aClass52_3894.clear();
	}

	public static void method1132(int i) {
		Static.aClass124_691 = null;
		Static.aClass124_695 = null;
		Static.aClass2_683 = null;
		Static.aClass124_697 = null;
		Static.aClass124_693 = null;
		Static.aClass124_694 = null;
		if (i <= 104)
			Static.aClass124_691 = null;
	}

	public static void method1131(int i) {
		int i_6_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 8);
		if (Static2.anInt2878 > i_6_) {
			for (int i_7_ = i_6_; i_7_ < Static2.anInt2878; i_7_++)
				Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++] = Static2.anIntArray351[i_7_];
		}
		int i_8_ = 30 / ((i + 24) / 54);
		if (Static2.anInt2878 < i_6_)
			throw new RuntimeException("gppov1");
		Static2.anInt2878 = 0;
		for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
			int i_10_ = Static2.anIntArray351[i_9_];
			Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_10_];
			int i_11_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_11_ == 0) {
				Static2.anIntArray351[Static2.anInt2878++] = i_10_;
				class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			} else {
				int i_12_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 2);
				if (i_12_ == 0) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 1) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_13_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(false, (byte) -40, i_13_);
					int i_14_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 1);
					if (i_14_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 2) {
					Static2.anIntArray351[Static2.anInt2878++] = i_10_;
					class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_15_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(true, (byte) -119, i_15_);
					int i_16_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub1.method1799(true, (byte) 127, i_16_);
					int i_17_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 1);
					if (i_17_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_10_;
				} else if (i_12_ == 3)
					Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++] = i_10_;
			}
		}
	}

	public static void method1130(int i, int i_5_) {
		if (i_5_ != 11300)
			Static.aClass124_694 = null;
		Class21.aClass52_444.method1208(i);
		Class14_Sub2_Sub12.aClass52_3894.method1208(i);
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

	public static void method1128(byte i) {
		if (i <= -41)
			Class14_Sub6.aClass52_2817.clear();
	}

	public static int anInt696;
	public static Deque aClass2_683;
	public static Class124 aClass124_697;
	public static Class124 aClass124_695;
	public static Class124 aClass124_694;
	public static Class124 aClass124_693;
	public static Class124 aClass124_691 = Class14_Sub2_Sub2.method263(1178, "document)3cookie=(R");
	public static void method967(int i) {
		Static.aClass124_2542 = null;
		if (i == -20514)
			Static.anIntArrayArray2545 = null;
	}

	public static void method966(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		if (Class118.anInt1982 <= i_1_ && Class14_Sub8_Sub14.anInt4327 >= i_1_) {
			i_3_ = Class67.method1301((byte) -101, i_3_, Class14_Sub17.anInt3005, Class59.anInt955);
			i = Class67.method1301((byte) 115, i, Class14_Sub17.anInt3005, Class59.anInt955);
			Class79.method1387(i_1_, i_0_, i, i_3_, 52);
		}
	}

	public static short aShort2540;
	public static int[][] anIntArrayArray2545;
	public static int anInt2552;
	public static int anInt2550;
	public static Class124 aClass124_2542 = Class14_Sub2_Sub2.method263(1178, "Untersuchen");
	public static boolean aBoolean2539;
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

	public static void method239(boolean bool) {
		Static.anIntArrayArrayArray2724 = null;
		Static.aClass9_2711 = null;
		Static.aShortArray2717 = null;
		if (bool)
			Static.anIntArrayArrayArray2724 = null;
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
		Class14_Sub8.anInt2856 = -1;
		Class14_Sub7.aBoolean2827 = false;
		Class137.method1941(true, (byte) -84);
		Class58.anInt947 = 0;
		Class133_Sub6.anInt3676 = 0;
		Class7_Sub2_Sub1.aBoolean3699 = false;
		for (int i_11_ = 0; i_11_ < Static2.aClass66Array3721.length; i_11_++)
			Static2.aClass66Array3721[i_11_] = null;
		Static2.anInt2878 = 0;
		Class14_Sub8_Sub13.anInt4306 = 0;
		for (int i_12_ = 0; i_12_ < 2048; i_12_++) {
			Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_12_] = null;
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

	public static Class14_Sub15 method237(int i, int i_6_, int i_7_, int i_8_) {
		Class14_Sub15 class14_sub15 = new Class14_Sub15();
		class14_sub15.anInt2999 = i_8_;
		class14_sub15.anInt2991 = i_7_;
		Class14_Sub30.aClass55_3275.put((long) i_6_, class14_sub15);
		if (i != 1)
			method239(false);
		Class109.method1563(i_8_, i ^ ~0x33);
		Class94 class94 = Static.method1233(i_6_, 21803);
		if (class94 != null)
			Class103.method1531(class94);
		if (Class125_Sub2.aClass94_3388 != null) {
			Class103.method1531(Class125_Sub2.aClass94_3388);
			Class125_Sub2.aClass94_3388 = null;
		}
		Class14_Sub8_Sub38.anInt4729 = 0;
		Class133_Sub5.aBoolean3628 = false;
		Class14_Sub13.method862(i + 125, Class14_Sub14.anInt2984, Class14_Sub8_Sub27.anInt4550,
				Class14_Sub2_Sub8.anInt3832, Static.anInt500);
		if (class94 != null)
			Class14_Sub2_Sub21.method445(class94, 18559, false);
		Static.method1328(i_8_, true);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
		Class14_Sub15 class14_sub15_9_ = class14_sub15;
		return class14_sub15_9_;
	}

	public static void method236(boolean bool, Class14_Sub15 class14_sub15, byte i) {
		int i_4_ = class14_sub15.anInt2999;
		int i_5_ = (int) class14_sub15.key;
		class14_sub15.unlink();
		if (bool)
			Class49.method1197(i_4_, false);
		Class14_Sub8_Sub31.method644(i_4_, (byte) 92);
		Class94 class94 = Static.method1233(i_5_, 21803);
		if (class94 != null)
			Class103.method1531(class94);
		Class14_Sub8_Sub38.anInt4729 = 0;
		Class133_Sub5.aBoolean3628 = false;
		if (i > -116)
			Static.aBoolean2722 = true;
		Class14_Sub13.method862(122, Class14_Sub14.anInt2984, Class14_Sub8_Sub27.anInt4550, Class14_Sub2_Sub8.anInt3832,
				Static.anInt500);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
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

	public static void method234(Class9 class9, byte i) {
		Class7_Sub1.aClass9_2652 = class9;
		if (i > -62)
			Static.aClass9_2711 = null;
	}

	public static short[] aShortArray2717 = new short[256];
	public static int[][][] anIntArrayArrayArray2724;
	public static int anInt2721 = 0;
	public static int anInt2720;
	public static int anInt2719;
	public static float aFloat2709;
	public static Class9 aClass9_2711;
	public static boolean aBoolean2722 = true;
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

	public static void method1024(int i) {
		Static.anIntArray3288 = null;
		Static.aClass124Array3287 = null;
		if (i == 4095) {
			Static.aClass124_3297 = null;
			Static.aClass124_3291 = null;
		}
	}

	public static void method1025(int i) {
		if (i != 25192)
			Static.aClass124_3291 = null;
		Class9.aClass52_236.clear();
		Static2.aClass52_4053.clear();
	}

	public static int[] anIntArray3288 = new int[500];
	public static Class124[] aClass124Array3287;
	public static Class124 aClass124_3297 = (Class14_Sub2_Sub2.method263(1178,
	"You can(Wt add yourself to your own ignore list)3"));
	public static Class124 aClass124_3291;
	public static void method1032(boolean bool, int i) {
		Class14_Sub8_Sub17.method566(Class83.anInt1340, Class14_Sub2_Sub12.anInt3912, -1, Class14_Sub20.anInt3094,
				bool);
		if (i != -1291652884)
			method1032(true, -90);
	}

	public static void method1030(int i) {
		Static.aClass124_3314 = null;
		Static.aClass124_3316 = null;
		Static.aClass124_3301 = null;
		if (i >= -126)
			method1032(true, -82);
	}

	public static Class124 aClass124_3301;
	public static int anInt3299 = 0;
	public static Class124 aClass124_3316 = Class14_Sub2_Sub2.method263(1178, ":assist:");
	public static Class124 aClass124_3314 = Class14_Sub2_Sub2.method263(1178, "(Udns");
	public static Class124 aClass124_499 = (Class14_Sub2_Sub2.method263(1178,
	"Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q"));
	public static Cache aClass20_495 = new Cache(128);
	public static int anInt500;
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
							var9 = Class14_Sub8_Sub21.anIntArray4444[var3[var6++]];
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
							var11 = Static.method1233(var10, 21803);
							var19 = var3[var6++];
							if (var19 != -1 && (!Class14_Sub8_Sub24.method605(114, var19).aBoolean2306
									|| Class132.aBoolean2170)) {
								for (var13 = 0; var13 < var11.anIntArray1452.length; ++var13) {
									if (var19 + 1 == var11.anIntArray1452[var13]) {
										var9 += var11.anIntArray1542[var13];
									}
								}
							}
						}
	
						if (var7 == 5) {
							var9 = Class14_Sub8_Sub11.anIntArray4275[var3[var6++]];
						}
	
						if (var7 == 6) {
							var9 = Class14_Sub29.anIntArray3245[Class56.anIntArray913[var3[var6++]] - 1];
						}
	
						if (var7 == 7) {
							var9 = Class14_Sub8_Sub11.anIntArray4275[var3[var6++]] * 100 / '\ub71b';
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
							var11 = Static.method1233(var10, 21803);
							var19 = var3[var6++];
							if (var19 != -1 && (!Class14_Sub8_Sub24.method605(81, var19).aBoolean2306
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
							var10 = Class14_Sub8_Sub11.anIntArray4275[var3[var6++]];
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
			throw Class14_Sub8_Sub14.method554(var17,
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
			throw Class14_Sub8_Sub14.method554(var5, "db.A(" + var0 + ',' + var1 + ')');
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
				if (var1 < 3 && (Class14_Sub8_Sub4.tileFlags[1][var6][var5] & 2) == 2) {
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
			throw Class14_Sub8_Sub14.method554(var14, "db.K(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
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
				Class76.anIntArray1204[0], Class12.aByteArrayArray310[0], Static.anIntArray1114);
		Class129.method1761((byte) 23);
		if (i != 71)
			aClass20_495 = null;
		Class148_Sub2 class148_sub2_126_ = class148_sub2;
		return class148_sub2_126_;
	}

	public static void method1023(int i, int i_127_, int i_128_, Class94 class94, int i_129_) {
		Class138.method1946(139);
		Class25.method999(i, i_127_, i + class94.anInt1518, class94.anInt1545 + i_127_);
		if (Class14_Sub8_Sub33.anInt4633 != 2 && Class14_Sub8_Sub33.anInt4633 != 5
				&& Class133_Sub6.aClass14_Sub2_Sub19_3640 != null) {
			int i_130_ = Class14_Sub8_Sub19.anInt4408 + anInt696 & 0x7ff;
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
				Class79 class79 = Class79.method1377((byte) -106, (Class14_Sub8_Sub25.anIntArray4512[i_142_]));
				if (class79.anIntArray1276 != null) {
					class79 = class79.method1391(1);
					if (class79 == null || class79.anInt1262 == -1)
						continue;
				}
				Static2.method1513(i_144_, i_127_, i_143_, class94,
						(Class14_Sub8_Sub17.aClass14_Sub2_Sub19Array4366[class79.anInt1262]), 256, i);
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
			for (int i_149_ = 0; i_149_ < Class14_Sub8_Sub13.anInt4306; i_149_++) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[Static.anIntArray3965[i_149_]]);
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
				Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_152_]]);
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
							&& (class66.anInt1049 < (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474).length)) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[class66.anInt1049]);
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
				int i_165_ = (-(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 / 32) + Class14_Sub8_Sub15.anInt4335 * 4
						+ 2);
				Static2.method1513(i_165_, i_127_, i_164_, class94, Class149.aClass14_Sub2_Sub19_2384, 256, i);
			}
			Class25.method1004(i + class94.anInt1518 / 2 - 1, i_127_ - 1 + class94.anInt1545 / 2, 3, 3, 16777215);
		} else {
			Class14_Sub2_Sub19 class14_sub2_sub19 = class94.method1476(false, (byte) 61);
			if (class14_sub2_sub19 != null)
				class14_sub2_sub19.method391(i, i_127_);
		}
		Class14_Sub8_Sub36.aBooleanArray4698[i_128_] = true;
		Class7_Sub2_Sub1.aBooleanArray3703[i_128_] = true;
		if (i_129_ < 111)
			aClass124_499 = null;
	}

	public static PacketBuffer aClass14_Sub10_Sub1_891 = new PacketBuffer(5000);
	public static int anInt895 = 0;
	public static int anInt905;
	public static void method1222(Class9 class9, byte i) {
		Class14_Sub2_Sub21.anInt4088 = class9.method146(Static.aClass124_3926, 0);
		Class14_Sub8_Sub17.anInt4367 = class9.method146(Class128.aClass124_2128, 0);
		Class14_Sub8_Sub1.anInt4102 = class9.method146(Class14_Sub8_Sub21.aClass124_4434, 0);
		Class7_Sub3.anInt2681 = class9.method146(Class114.aClass124_1900, 0);
		Class149.anInt2389 = class9.method146(Class24.aClass124_470, 0);
		Class36.anInt629 = class9.method146(Class107.aClass124_1795, 0);
		Class14_Sub2_Sub3.anInt3787 = class9.method146(Class133_Sub3.aClass124_3570, 0);
		Class153.anInt2450 = class9.method146(Static2.aClass124_3944, 0);
		if (i > 35) {
			Class133_Sub4.anInt3584 = class9.method146(Class9.aClass124_207, 0);
			Static2.anInt5087 = class9.method146(SceneCluster.aClass124_1365, 0);
			SceneCluster.anInt1369 = class9.method146(Class14_Sub8_Sub22.aClass124_4462, 0);
			Class38.anInt2618 = class9.method146(Class9.aClass124_227, 0);
			Class58.anInt937 = class9.method146(Class7_Sub3.aClass124_2684, 0);
			Class111.anInt1857 = class9.method146(Class14_Sub8_Sub33.aClass124_4643, 0);
			Class14_Sub8_Sub38.anInt4735 = class9.method146(Static.aClass124_850, 0);
			Class82.anInt1334 = class9.method146(Class96.aClass124_1631, 0);
			Class9_Sub1.anInt2688 = class9.method146(Class69.aClass124_1068, 0);
			anInt2720 = class9.method146(Class17.aClass124_403, 0);
			Class14_Sub8_Sub13.anInt4310 = class9.method146(Class115.aClass124_1908, 0);
		}
	}

	public static void method1226(int i, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_9_ >= i_7_)
			Class51.method1201(Static2.anIntArrayArray4038[i_8_], i_7_, i_9_, -5973, i_10_);
		else
			Class51.method1201(Static2.anIntArrayArray4038[i_8_], i_9_, i_7_, -5973, i_10_);
		if (i != 4)
			Static.method1236((byte) -10);
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
				|| (Class14_Sub8_Sub4.tileFlags[0][i_33_][i_31_] & 0x2) != 0
				|| ((Class14_Sub8_Sub4.tileFlags[i_35_][i_33_][i_31_] & 0x10) == 0
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
						Class14_Sub8_Sub30.method642(i_35_, i_33_, i_31_, i_42_, class133, l, class79.aBoolean1299);
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
					long l_52_ = Static.method79(i_35_, i_33_, i_31_);
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
					long l_53_ = Static.method79(i_35_, i_33_, i_31_);
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
					long l_54_ = Static.method79(i_35_, i_33_, i_31_);
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

	public static void method1330(int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		Class133_Sub6.anInt3659 = i_7_ * Class14_Sub8_Sub15.anInt4332 / i_6_;
		Static.anInt427 = i_8_;
		Class14_Sub18.anInt3050 = -1;
		Class37.anInt644 = Class14_Sub2_Sub9.anInt3856 * i / i_5_;
		Static2.method1126((byte) -22);
	}

	public static void method1329(int i) {
		Class96.anApplet_Sub1_1632.method37(i ^ 0x5);
		if (i != 0)
			Static.anInt1132 = -44;
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

	public static void method1327(byte i) {
		Static.aClass124_1105 = null;
		Static.anIntArray1114 = null;
		if (i >= -97)
			method1329(46);
	}

	public static int[] anIntArray1114;
	public static boolean aBoolean1119 = false;
	public static Class124 aClass124_1105 = Class14_Sub2_Sub2.method263(1178, "titlebg");
	public static int anInt1108;
	public static int anInt1129 = 0;
	public static int anInt1132;
	public static void method462(int i, int i_36_, int i_37_, int i_38_, int i_39_, int i_40_) {
		long l = Static.method79(i_38_, i, i_37_);
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
		l = Class14_Sub8_Sub38.method675(i_38_, i, i_37_);
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
		l = Class14_Sub8_Sub19.method578(i_38_, i, i_37_);
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

	public static void method461(int i) {
		Static.anIntArrayArray2799 = null;
		Static.aClass124_2796 = null;
		Static.aClass9_2792 = null;
		if (i > -38)
			Static.anIntArrayArray2799 = null;
		Static.aClass124_2804 = null;
		Static.aClass124_2802 = null;
	}

	public static void method460(int i) {
		if (Class7_Sub2.anInt2675 > 1) {
			Class7_Sub2.anInt2675--;
			Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
		}
		if (Class62.anInt990 > 0)
			Class62.anInt990--;
		if (Class89.aBoolean1416) {
			Class89.aBoolean1416 = false;
			Static2.method1508((byte) 122);
		} else {
			for (int i_0_ = 0; i_0_ < 100 && Class14_Sub8_Sub35.method664(false); i_0_++) {
				/* empty */
			}
			if (Class14_Sub8_Sub16.anInt4356 == 30) {
				Static2.method1540(aClass14_Sub10_Sub1_891, 141, -15);
				Object object = Class14_Sub2_Sub11.aClass100_3878.synchronizedObject;
				synchronized (object) {
					if (Class14_Sub8_Sub10.aBoolean4249) {
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
									if (Class14_Sub8_Sub5.anInt4166 < 2047)
										Class14_Sub8_Sub5.anInt4166++;
								} else {
									int i_6_ = i_4_ - Class102.anInt1709;
									Class102.anInt1709 = i_4_;
									int i_7_ = -Class14_Sub17.anInt3020 + i_5_;
									Class14_Sub17.anInt3020 = i_5_;
									if (Class14_Sub8_Sub5.anInt4166 < 8 && i_7_ >= -32 && i_7_ <= 31 && i_6_ >= -32
											&& i_6_ <= 31) {
										i_6_ += 32;
										i_7_ += 32;
										aClass14_Sub10_Sub1_891.method833((byte) 86,
												(Class14_Sub8_Sub5.anInt4166 << 12) + (i_7_ << 6) + i_6_);
										Class14_Sub8_Sub5.anInt4166 = 0;
									} else if (Class14_Sub8_Sub5.anInt4166 < 32 && i_7_ >= -128 && i_7_ <= 127
											&& i_6_ >= -128 && i_6_ <= 127) {
										i_7_ += 128;
										i_6_ += 128;
										aClass14_Sub10_Sub1_891.method809(128 + (Class14_Sub8_Sub5.anInt4166));
										aClass14_Sub10_Sub1_891.method833((byte) 95, (i_7_ << 40) + i_6_);
										Class14_Sub8_Sub5.anInt4166 = 0;
									} else if (Class14_Sub8_Sub5.anInt4166 < 32) {
										aClass14_Sub10_Sub1_891.method809((Class14_Sub8_Sub5.anInt4166 + 192));
										if (bool)
											aClass14_Sub10_Sub1_891.method803(-2147483648, 119);
										else
											aClass14_Sub10_Sub1_891.method803(i_4_ << 16 | i_5_, 113);
										Class14_Sub8_Sub5.anInt4166 = 0;
									} else {
										aClass14_Sub10_Sub1_891.method833((byte) 98,
												(Class14_Sub8_Sub5.anInt4166 + 57344));
										if (!bool)
											aClass14_Sub10_Sub1_891.method803(i_4_ << 48 | i_5_, i + 127);
										else
											aClass14_Sub10_Sub1_891.method803(-2147483648, 101);
										Class14_Sub8_Sub5.anInt4166 = 0;
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
					long l = (-Static.aLong95 + Static.aLong2800) / 50L;
					int i_9_ = Class125_Sub1.anInt3367;
					Static.aLong95 = Static.aLong2800;
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
				if (Class14_Sub8_Sub29.aBooleanArray4581[96] || Class14_Sub8_Sub29.aBooleanArray4581[97]
						|| Class14_Sub8_Sub29.aBooleanArray4581[98] || Class14_Sub8_Sub29.aBooleanArray4581[99])
					Class47.aBoolean788 = true;
				if (Class47.aBoolean788 && Static2.anInt1685 <= 0) {
					Static2.anInt1685 = 20;
					Class47.aBoolean788 = false;
					aClass14_Sub10_Sub1_891.writeOpcode(99);
					aClass14_Sub10_Sub1_891.method801((byte) -89, Static.anInt102);
					aClass14_Sub10_Sub1_891.method792(Class14_Sub8_Sub19.anInt4408, (byte) -98);
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
				if (Class14_Sub8_Sub16.anInt4356 == 30) {
					Class9.method169(-1);
					Static2.method1318((byte) 112);
					Class96.anInt1636++;
					if (Class96.anInt1636 > 750)
						Static2.method1508((byte) 123);
					else {
						Class17.method957((byte) -93);
						Class14_Sub8_Sub11.method532(0);
						Class64.method1286((byte) 120);
						if (Class97.aClass94_1657 != null)
							Class36.method1106(-1);
						for (int i_13_ = client.method44(true, -1); i_13_ != -1; i_13_ = client.method44(false, -1)) {
							Class122.method1660(15237, i_13_);
							Class24.anIntArray467[Class14_Sub8_Sub26.method617(Class22.anInt461++, 31)] = i_13_;
						}
						for (Class14_Sub2_Sub13 class14_sub2_sub13 = Class14_Sub8_Sub20.method584(
								i - 11988); class14_sub2_sub13 != null; class14_sub2_sub13 = Class14_Sub8_Sub20
										.method584(i - 11988)) {
							int i_14_ = class14_sub2_sub13.method328();
							int i_15_ = class14_sub2_sub13.method331();
							if (i_14_ != 1) {
								if (i_14_ == 2) {
									Class14_Sub8_Sub24.aClass124Array4499[i_15_] = class14_sub2_sub13.aClass124_3925;
									Class5.anIntArray147[(Class14_Sub8_Sub26.method617(31,
											Class14_Sub2_Sub17.anInt4018++))] = i_15_;
								}
							} else {
								Class133_Sub1_Sub2.anIntArray4944[i_15_] = class14_sub2_sub13.anInt3920;
								Class141.anIntArray2246[(Class14_Sub8_Sub26.method617(Class14_Sub8_Sub17.anInt4378++,
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
							Class14_Sub8_Sub3.anInt4124++;
							if (Class14_Sub8_Sub3.anInt4124 >= 15) {
								Class103.method1531(Class94.aClass94_1469);
								Class94.aClass94_1469 = null;
							}
						}
						if (Class14_Sub8_Sub21.aClass94_4446 != null) {
							Class103.method1531((Class14_Sub8_Sub21.aClass94_4446));
							if ((Class133_Sub1_Sub1.anInt4936 + 5 < Class14_Sub8_Sub33.anInt4640)
									|| (Class14_Sub8_Sub33.anInt4640 < Class133_Sub1_Sub1.anInt4936 - 5)
									|| Class111.anInt1865 + 5 < Class107.anInt1804
									|| Class107.anInt1804 < Class111.anInt1865 - 5)
								Class14_Sub8_Sub8.aBoolean4221 = true;
							Class113.anInt1879++;
							if (Class14_Sub8_Sub30.anInt4599 == 0) {
								if (Class14_Sub8_Sub8.aBoolean4221 && Class113.anInt1879 >= 5) {
									if ((Class14_Sub8_Sub21.aClass94_4446 == Class141.aClass94_2239)
											&& (Class14_Sub8_Sub31.anInt4601 != Class122.anInt2054)) {
										Class94 class94 = Class14_Sub8_Sub21.aClass94_4446;
										int i_16_ = 0;
										if (Class14_Sub4.anInt2782 == 1 && class94.anInt1498 == 206)
											i_16_ = 1;
										if ((class94.anIntArray1452[Class14_Sub8_Sub31.anInt4601]) <= 0)
											i_16_ = 0;
										if (!Class14_Sub6.method468(i ^ 0x68, client.method46(class94))) {
											if (i_16_ != 1)
												class94.method1472((Class14_Sub8_Sub31.anInt4601), -10944,
														Class122.anInt2054);
											else {
												int i_17_ = Class122.anInt2054;
												int i_18_ = (Class14_Sub8_Sub31.anInt4601);
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
											int i_20_ = Class14_Sub8_Sub31.anInt4601;
											class94.anIntArray1452[i_20_] = (class94.anIntArray1452[i_19_]);
											class94.anIntArray1542[i_20_] = (class94.anIntArray1542[i_19_]);
											class94.anIntArray1452[i_19_] = -1;
											class94.anIntArray1542[i_19_] = 0;
										}
										aClass14_Sub10_Sub1_891.writeOpcode(167);
										aClass14_Sub10_Sub1_891.method801((byte) -64,
												Class14_Sub8_Sub31.anInt4601);
										aClass14_Sub10_Sub1_891.method823(i_16_, true);
										aClass14_Sub10_Sub1_891.method801((byte) -65, Class122.anInt2054);
										aClass14_Sub10_Sub1_891.method785(-102,
												(Class14_Sub8_Sub21.aClass94_4446.anInt1548));
									}
								} else if ((Class103.anInt1730 == 1
										|| (Class127.method1754(128, (Class14_Sub8_Sub38.anInt4729 - 1))))
										&& Class14_Sub8_Sub38.anInt4729 > 2)
									Static2.method382((byte) 124);
								else if (Class14_Sub8_Sub38.anInt4729 > 0)
									Class107.method1551(-23473);
								Class7_Sub3_Sub1.anInt3714 = 0;
								Class14_Sub8_Sub3.anInt4124 = 10;
								Class14_Sub8_Sub21.aClass94_4446 = null;
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
						for (/**/; (Class14_Sub8_Sub5.method503()
								&& Class152.anInt2440 < 128); Class152.anInt2440++) {
							Class14_Sub11.anIntArray2948[Class152.anInt2440] = Class36.anInt630;
							Class125_Sub3.anIntArray3398[Class152.anInt2440] = Class146.anInt2358;
						}
						Class97.aClass94_1657 = null;
						if (Class14_Sub2_Sub12.anInt3912 != -1)
							Class12.method218(i ^ ~0x7837, Class14_Sub20.anInt3094, 0, 0, Class14_Sub2_Sub12.anInt3912,
									0, 0, Class83.anInt1340);
						Class14_Sub8_Sub23.anInt4478++;
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
												if (Class152.anInt2439 > 0 && (Class14_Sub8_Sub29.aBooleanArray4581[82])
														&& (Class14_Sub8_Sub29.aBooleanArray4581[81])
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
													int i_23_ = (Class14_Sub8_Sub33.anInt4636);
													int i_24_ = Class66.anInt1039;
													if (Class152.anInt2439 > 0
															&& (Class14_Sub8_Sub29.aBooleanArray4581[82])
															&& (Class14_Sub8_Sub29.aBooleanArray4581[81]))
														Class7_Sub2.method125((i_24_ + (Class133_Sub6.anInt3676)),
																(i_23_ + (Class58.anInt947)), 63,
																(Class14_Sub2_Sub3.anInt3785));
													else {
														boolean bool = (Class14_Sub8_Sub35.method663(
																(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
																0, 0, 0, (byte) 109,
																(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]),
																true, 0, i_24_, 0, 0, i_23_));
														if (bool) {
															Class14_Sub2_Sub11.anInt3881 = 1;
															Class14_Sub8_Sub25.anInt4515 = (Class139.anInt2230);
															Class14_Sub8_Sub9.anInt4243 = (Class125_Sub1.anInt3367);
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
														&& ((Class14_Sub8_Sub39_Sub1.anInt5097) == (Class7_Sub3.anInt2683))) {
													if (class94_21_ != null)
														Class103.method1531(class94_21_);
													if (Class47.aClass94_784 != null)
														Class103.method1531((Class47.aClass94_784));
												}
												if (Class47.aClass94_784 == null) {
													if ((Class14_Sub8_Sub39_Sub1.anInt5097) > 0)
														Class14_Sub8_Sub39_Sub1.anInt5097--;
												} else if ((Class14_Sub8_Sub39_Sub1.anInt5097) < (Class7_Sub3.anInt2683)) {
													Class14_Sub8_Sub39_Sub1.anInt5097++;
													if (Class7_Sub3.anInt2683 == (Class14_Sub8_Sub39_Sub1.anInt5097))
														Class103.method1531((Class47.aClass94_784));
												}
												if (Class89.anInt1415 == 1)
													SceneCluster.method1415(i ^ 0x2);
												else if (Class89.anInt1415 != 2)
													Class14_Sub8_Sub7.method511(3);
												else
													Class53.method1216(i + 128);
												for (int i_25_ = i; i_25_ < 5; i_25_++)
													Class14_Sub8_Sub15.anIntArray4336[i_25_]++;
												int i_26_ = Static2.method244(107);
												int i_27_ = (Static2.method1172(i ^ 0x3a));
												if (i_26_ > 4500 && i_27_ > 4500) {
													Class62.anInt990 = 250;
													Static2.method245(4000, (byte) -42);
													aClass14_Sub10_Sub1_891.writeOpcode(47);
												}
												Class9.anInt246++;
												Class14_Sub8_Sub20.anInt4419++;
												Class58.anInt949++;
												if (Class58.anInt949 > 500) {
													Class58.anInt949 = 0;
													int i_28_ = (int) (Math.random() * 8.0);
													if ((i_28_ & 0x1) == 1)
														Class7_Sub1.anInt2655 += (Class116.anInt1929);
													if ((i_28_ & 0x4) == 4)
														Class142.anInt2307 += (Class14_Sub8_Sub8.anInt4217);
													if ((i_28_ & 0x2) == 2)
														Class14_Sub8_Sub25.anInt4520 += (Class97.anInt1652);
												}
												if (Class142.anInt2307 < -40)
													Class14_Sub8_Sub8.anInt4217 = 1;
												if ((Class14_Sub8_Sub25.anInt4520) < -55)
													Class97.anInt1652 = 2;
												if (Class142.anInt2307 > 40)
													Class14_Sub8_Sub8.anInt4217 = -1;
												if ((Class14_Sub8_Sub20.anInt4419) > 500) {
													int i_29_ = (int) (Math.random() * 8.0);
													Class14_Sub8_Sub20.anInt4419 = 0;
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
												if ((Class14_Sub8_Sub25.anInt4520) > 55)
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

	public static int[][] anIntArrayArray2799;
	public static int anInt2801 = -1;
	public static int anInt2797 = 0;
	public static long aLong2800 = 0L;
	public static Class124 aClass124_2804 = Class14_Sub2_Sub2.method263(1178, "Standort");
	public static Class124 aClass124_2796 = Class14_Sub2_Sub2.method263(1178, "Examine");
	public static Class124 aClass124_2802 = aClass124_2796;
	public static Class9 aClass9_2792;
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

	public static void method339(int i) {
		Static.anIntArray3955 = null;
		Static.aClass124_3956 = null;
		Static.anIntArray3965 = null;
		Static.aFrame3962 = null;
		Static.aClass124Array3959 = null;
		if (i != 15121)
			method339(59);
		Static.aClass14_Sub2_Sub19Array3958 = null;
	}

	public static int[] anIntArray3965 = new int[32768];
	public static int[] anIntArray3955;
	public static int anInt3960;
	public static Frame aFrame3962;
	public static int anInt3952 = 0;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3958;
	public static Class124[] aClass124Array3959 = new Class124[200];
	public static Class124 aClass124_3956 = Class14_Sub2_Sub2.method263(1178, "underlay");
	public static int anInt3954;
	public static void method89(int i) {
		Static.aClass124_100 = null;
		Static.aClass124_93 = null;
		if (i == 0) {
			Static.aClass55_92 = null;
			Static.aClass2_99 = null;
			Static.aClass124_94 = null;
			Static.aShortArrayArray98 = null;
		}
	}

	public static void method88(boolean bool, int i) {
		Class14_Sub8_Sub9.aClass52_4240.method1208(i);
	}

	public static void method86(int i) {
		if (Class14_Sub2_Sub5.aBoolean3803) {
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = null;
			Class133_Sub1_Sub1.aClass148_4915 = null;
			if (i > -9)
				Static.method75(106, 44, 51, -42, -7, -46, 88, 107, 84, 88, -48);
			Class14_Sub2_Sub5.aBoolean3803 = false;
		}
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
		Class14_Sub8_Sub18.aClass14_Sub2_Sub19Array4385 = Class125_Sub2.method1733((byte) 21, class9, 0,
				Class14_Sub2_Sub3.anInt3787);
		Class98.aClass14_Sub2_Sub19Array1669 = Class125_Sub2.method1733((byte) 118, class9, 0, Class153.anInt2450);
		Class35.aClass14_Sub2_Sub19Array596 = Class125_Sub2.method1733((byte) 43, class9, 0, Class133_Sub4.anInt3584);
		Class76.aClass14_Sub2_Sub19Array1191 = Class38.method1115(false, class9, 0, Static2.anInt5087);
		Class150.aClass14_Sub2_Sub19Array2417 = Class38.method1115(false, class9, 0, SceneCluster.anInt1369);
		Class149.aClass14_Sub2_Sub19_2384 = Class58.method1259(-106, class9, 0, Class38.anInt2618);
		aClass14_Sub2_Sub19Array3958 = Class38.method1115(false, class9, 0, Class58.anInt937);
		Class14_Sub20.aClass14_Sub2_Sub19Array3098 = Class38.method1115(false, class9, 0, Class111.anInt1857);
		Class110.aClass148Array1848 = Class126.method1747(0, Class14_Sub8_Sub38.anInt4735, 229, class9);
		Static2.aClass148Array1777 = Class126.method1747(0, Class82.anInt1334, 229, class9);
		Class56_Sub1.aClass14_Sub2_Sub16_3320.method352(Static2.aClass148Array1777, null);
		Class84.aClass14_Sub2_Sub16_1344.method352(Static2.aClass148Array1777, null);
		Class133_Sub3.aClass14_Sub2_Sub16_3567.method352(Static2.aClass148Array1777, null);
		ShadowManager.aClass148_Sub1Array2431 = Class125_Sub1.method1729(class9, Class9_Sub1.anInt2688, 0, (byte) 48);
		for (int i = 0; i < ShadowManager.aClass148_Sub1Array2431.length; i++)
			ShadowManager.aClass148_Sub1Array2431[i].method2009();
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = Class14_Sub8_Sub1.method485(-99, class9,
				anInt2720, 0);
		class14_sub2_sub19_sub1.method404();
		Class14_Sub8_Sub25.aClass14_Sub2_Sub19_4508 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
		Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s = Class90.method1446(Class14_Sub8_Sub13.anInt4310, class9,
				120, 0);
		for (int i = 0; i < class14_sub2_sub19_sub1s.length; i++)
			class14_sub2_sub19_sub1s[i].method404();
		Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013 = new Class14_Sub2_Sub19[class14_sub2_sub19_sub1s.length];
		for (int i = 0; i < class14_sub2_sub19_sub1s.length; i++)
			Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013[i] = new Class14_Sub2_Sub19_Sub2(
					class14_sub2_sub19_sub1s[i]);
		if (!bool)
			Static.anInt102 = -61;
		int i = (int) (Math.random() * 21.0) - 10;
		int i_46_ = (int) (Math.random() * 21.0) - 10;
		int i_47_ = (int) (Math.random() * 21.0) - 10;
		int i_48_ = (int) (Math.random() * 41.0) - 20;
		for (int i_49_ = 0; Class133.aClass14_Sub2_Sub19_Sub1Array2186.length > i_49_; i_49_++)
			Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_49_].method410(i_48_ + i, i_46_ + i_48_, i_47_ + i_48_);
		Class97.aClass148_Sub1Array1651[0].method2003(i_48_ + i, i_46_ + i_48_, i_48_ + i_47_);
		Class14_Sub8_Sub17.aClass14_Sub2_Sub19Array4366 = (new Class14_Sub2_Sub19[Class133.aClass14_Sub2_Sub19_Sub1Array2186.length]);
		for (int i_50_ = 0; Class133.aClass14_Sub2_Sub19_Sub1Array2186.length > i_50_; i_50_++)
			Class14_Sub8_Sub17.aClass14_Sub2_Sub19Array4366[i_50_] = (new Class14_Sub2_Sub19_Sub2(
					Class133.aClass14_Sub2_Sub19_Sub1Array2186[i_50_]));
	}

	public static int method82(int i, int i_37_) {
		if (i_37_ > -98)
			Static.anInt101 = -75;
		if (i == 16711935) {
			int i_38_ = -1;
			return i_38_;
		}
		int i_39_ = Class128.method1759(i, (byte) 48);
		return i_39_;
	}

	public static long method79(int i, int i_35_, int i_36_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_35_][i_36_];
		if (class14_sub29 == null || class14_sub29.aClass113_3250 == null)
			return 0L;
		return class14_sub29.aClass113_3250.aLong1887;
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

	public static short[][] aShortArrayArray98;
	public static int anInt97;
	public static int anInt96 = 0;
	public static Class124 aClass124_100 = Class14_Sub2_Sub2.method263(1178, "Allocating memory");
	public static Class124 aClass124_93 = Class14_Sub2_Sub2.method263(1178, "welle2:");
	public static Class124 aClass124_94 = aClass124_100;
	public static Deque aClass2_99 = new Deque();
	public static HashTable aClass55_92 = new HashTable(16);
	public static long aLong95 = 0L;
	public static int anInt101;
	public static int anInt102 = 128;
	public static Class124 aClass124_3926 = Class14_Sub2_Sub2.method263(1178, "p11_full");
	public static long[] aLongArray3924 = new long[500];
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
			if (Class134.anIntArray2590 != null && Class14_Sub8_Sub28.aByteArrayArray4556[i] == null
					&& Class134.anIntArray2590[i] != -1) {
				Class14_Sub8_Sub28.aByteArrayArray4556[i] = (Class14_Sub13.aClass9_Sub1_2958.method149(-23245, 0,
						Class125_Sub3.anIntArrayArray3391[i], Class134.anIntArray2590[i]));
				if (Class14_Sub8_Sub28.aByteArrayArray4556[i] == null) {
					bool_0_ = false;
					client.anInt2648++;
				}
			}
		}
		if (Class70.aClass14_Sub2_Sub5_1078 == null || !(Class7_Sub1.aClass9_Sub1_2657.method166((byte) -83,
				Class14_Sub8_Sub7.method515((new Class124[] { (Class70.aClass14_Sub2_Sub5_1078.aClass124_3804),
						(Class14_Sub8_Sub6.aClass124_4192) }), (byte) -109))))
			Class79.aClass146_1261 = null;
		else if (!Class7_Sub1.aClass9_Sub1_2657.method160(Class14_Sub8_Sub7.method515((new Class124[] {
				(Class70.aClass14_Sub2_Sub5_1078.aClass124_3804), (Class14_Sub8_Sub6.aClass124_4192) }), (byte) -34),
				(byte) -102)) {
			client.anInt2648++;
			bool_0_ = false;
		} else
			Class79.aClass146_1261 = (Class14_Sub8_Sub6.method507(bool,
					Class14_Sub8_Sub7.method515((new Class124[] { (Class70.aClass14_Sub2_Sub5_1078.aClass124_3804),
							(Class14_Sub8_Sub6.aClass124_4192) }), (byte) -69),
					Class7_Sub1.aClass9_Sub1_2657));
		if (!bool_0_)
			Class14_Sub18.anInt3064 = 1;
		else {
			Class149.anInt2383 = 0;
			bool_0_ = true;
			for (int i = 0; i < Class5.aByteArrayArray139.length; i++) {
				byte[] is = Class14_Sub20.aByteArrayArray3097[i];
				if (is != null) {
					int i_1_ = ((Class14_Sub8.anIntArray2858[i] & 0xff) * 64 - Class58.anInt947);
					int i_2_ = ((Class14_Sub8.anIntArray2858[i] >> 8) * 64 - Class133_Sub6.anInt3676);
					if (Class7_Sub2_Sub1.aBoolean3699) {
						i_2_ = 10;
						i_1_ = 10;
					}
					bool_0_ &= Class60.method1265((byte) -64, i_1_, is, i_2_);
				}
				is = Static2.aByteArrayArray362[i];
				if (is != null) {
					int i_3_ = ((Class14_Sub8.anIntArray2858[i] >> 40) * 64 - Class133_Sub6.anInt3676);
					int i_4_ = (-Class58.anInt947 + (Class14_Sub8.anIntArray2858[i] & 0xff) * 64);
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
							(Class14_Sub8_Sub7.method515(
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
							Class14_Sub8_Sub4.tileFlags[i][i_5_][i_6_] = (byte) 0;
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
					if (Class14_Sub8_Sub28.aByteArrayArray4556 != null)
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
					Class14_Sub8_Sub28.method627(true);
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
					Class14_Sub8_Sub28.method627(false);
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
				Class14_Sub8_Sub23.method602(-1);
				Class138.method1946(139);
				Class68.method1307((byte) -58);
				Class14_Sub3.method451(0);
				if (Class14_Sub14.aFrame2986 != null && Class14_Sub15.aClass36_2990 != null
						&& Class14_Sub8_Sub16.anInt4356 == 25) {
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
										(Class14_Sub8_Sub7.method515(
												(new Class124[] { Class35.aClass124_601, Class83.method1407(59, i_18_),
														Class111.aClass124_1866, Class83.method1407(114, i_19_) }),
												(byte) -10)));
								Class14_Sub13.aClass9_Sub1_2958.method162((byte) -106, (Class14_Sub8_Sub7.method515(
										(new Class124[] { Class111.aClass124_1863, Class83.method1407(92, i_18_),
												Class111.aClass124_1866, Class83.method1407(33, i_19_) }),
										(byte) -32)));
							}
						}
					}
				}
				if (Class14_Sub8_Sub16.anInt4356 == 28)
					Class126.method1743(27252, 10);
				else {
					Class126.method1743(27252, 30);
					if (Class14_Sub15.aClass36_2990 != null)
						aClass14_Sub10_Sub1_891.writeOpcode(60);
				}
				Class138.method1946(139);
				Class14_Sub8_Sub11.method531((byte) -112);
			}
		}
	}

	public static int anInt3933;
	public static int anInt3931 = 0;
	public static int anInt3930;
	public static int anInt3929 = -1;
	public static int anInt3928;
	public static int anInt3923;
	public static int anInt3921;
	public static int anInt3919;
	public static void method970(int i) {
		Static.aClass94_420 = null;
		Static.aClass124_422 = null;
		Static.aClass9_429 = null;
		if (i != 5)
			Static.anInt425 = 33;
		Static.overlayTypes = null;
	}

	public static void method969(int i, Class9_Sub1 class9_sub1, byte i_0_) {
		if (Class14_Sub2_Sub4.aClass14_Sub10_3796 != null) {
			Class14_Sub2_Sub4.aClass14_Sub10_3796.position = i * 8 + 5;
			int i_1_ = Class14_Sub2_Sub4.aClass14_Sub10_3796.getInt((byte) -126);
			int i_2_ = Class14_Sub2_Sub4.aClass14_Sub10_3796.getInt((byte) -98);
			class9_sub1.method180(-6, i_2_, i_1_);
		} else {
			Class14_Sub8_Sub29.method633((byte) 0, 115, null, 255, true, 0, 255);
			if (i_0_ < -27)
				Class141.aClass9_Sub1Array2253[i] = class9_sub1;
		}
	}

	public static byte[][][] overlayTypes;
	public static int anInt427 = -1;
	public static int anInt425;
	public static Class94 aClass94_420 = null;
	public static Class9 aClass9_429;
	public static Class124 aClass124_422 = Class14_Sub2_Sub2.method263(1178, "logo");
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
		Static.aClass87_858 = null;
		Static.aClass124_857 = null;
		Static.aClass124Array859 = null;
		int i_2_ = 115 % ((i + 18) / 45);
		Static.aClass124_850 = null;
		Static.aClass124_844 = null;
		Static.aClass120_854 = null;
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
							Class144.method1982((byte) 122, "openjs", (Class14_Sub8_Sub34.aClass43_4647.applet),
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

	public static int anInt853 = 0;
	public static boolean aBoolean845 = true;
	public static Class120 aClass120_854;
	public static Class124 aClass124_844 = Class14_Sub2_Sub2.method263(1178, "showingVideoAd");
	public static Class124 aClass124_850 = Class14_Sub2_Sub2.method263(1178, "scrollbar");
	public static Class124 aClass124_857 = Class14_Sub2_Sub2.method263(1178, "<col=ff7000>");
	public static Class124[] aClass124Array859;
	public static Class87 aClass87_858;
	public static int anInt847;
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
		if (Class14_Sub8_Sub32.anInt4616 < 100)
			Class45.method1161(60);
		Class25.method999(i_137_, i_135_, i + i_137_, i_134_ + i_135_);
		if (Class14_Sub8_Sub32.anInt4616 < 100) {
			int i_138_ = i / 2 + i_137_;
			int i_139_ = 20;
			int i_140_ = i_134_ / 2 + (i_135_ + (-i_139_ - 18));
			Class25.method1004(i_137_, i_135_, i, i_134_, 0);
			Class25.method1003(i_138_ - 152, i_140_, 304, 34, 9179409);
			Class25.method1003(i_138_ - 151, i_140_ + 1, 302, 32, 0);
			Class25.method1004(i_138_ - 150, i_140_ + 2, Class14_Sub8_Sub32.anInt4616 * 3, 30, 9179409);
			Class25.method1004(i_138_ + Class14_Sub8_Sub32.anInt4616 * 3 - 150, i_140_ + 2,
					-(Class14_Sub8_Sub32.anInt4616 * 3) + 300, 30, 0);
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
				Class14_Sub8_Sub23.method603(0, 0, i_141_, i_142_, i_143_, i_134_, i, -127, i_144_);
				Class14_Sub2_Sub8.aClass14_Sub2_Sub19_Sub1_Sub2_3836.method390(i_137_, i_135_);
				if (Static2.anInt365 > 0)
					Static2.anInt365--;
				if (Class133_Sub6.aBoolean3663) {
					int i_145_ = i_137_ + i - 5;
					int i_146_ = i_134_ - 8 + i_135_;
					Class84.aClass14_Sub2_Sub16_1344
							.method348(
									(Class14_Sub8_Sub7.method515(
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
							(Class14_Sub8_Sub7.method515(new Class124[] { Class1.aClass124_72,
									Class83.method1407(120, i_148_), Class62.aClass124_995 }, (byte) -128)),
							i_145_, i_146_, i_147_, -1);
					i_146_ -= 15;
				}
			}
		}
	}

	public static void method1403(int i) {
		Static.aClass124_1318 = null;
		if (i != 0)
			Static.aClass124_1326 = null;
		Static.aClass124_1326 = null;
		Static.aClass31_1328 = null;
	}

	public static int anInt1314 = 0;
	public static Class31 aClass31_1328;
	public static Class124 aClass124_1326 = Class14_Sub2_Sub2.method263(1178, "Abbrechen");
	public static Class124 aClass124_1318 = Class14_Sub2_Sub2.method263(1178, "sl_back");
}
