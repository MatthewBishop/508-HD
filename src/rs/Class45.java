/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.ErrorReporting;
import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;

public class Class45 {
	public static Class124 aClass124_738 = Class124.method263("AUS");
	public static Class124 aClass124_750 = Class124.method263("::rect_debug");
	public static int anInt751 = -1;
	public static int[] anIntArray737 = { 1, 1, 1, 1 };
	public static int[] anIntArray743 = new int[200];
	public static void method1160(int i) {
		Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst());
		if (i != 0)
			method1166(true, false);
		for (/**/; class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
				.getNext()) {
			int i_0_ = class14_sub15.anInt2999;
			if (Static2.method1741((byte) 100, i_0_)) {
				boolean bool = true;
				Class94[] class94s = Class1.aClass94ArrayArray75[i_0_];
				for (int i_1_ = 0; i_1_ < class94s.length; i_1_++) {
					if (class94s[i_1_] != null) {
						bool = class94s[i_1_].aBoolean1455;
						break;
					}
				}
				if (!bool) {
					int i_2_ = (int) class14_sub15.key;
					Class94 class94 = JunkTex.method1233(i_2_, i + 21803);
					if (class94 != null)
						Class103.method1531(class94);
				}
			}
		}
	}
	public static void method1161(int i) {
		if (Class7_Sub1.aClass14_Sub2_Sub5_2665 != null) {
			if (JunkTex.anInt4616 < 10) {
				if (!(JunkTex.aFileSystem_4570.method160(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804))
						|| !(JunkTex.aFileSystem_4570.method160((JunkTex.method515(new Class124[] {
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Static2.aClass124_1099 },
								(byte) -79))))) {
					JunkTex.anInt4616 = (Class7_Sub1.aCacheFileWorker_2657
							.method151(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804)) / 10;
					return;
				}
				JunkTex.method568(i ^ 0x38);
				JunkTex.anInt4616 = 10;
			}
			if (JunkTex.anInt4616 == 10) {
				Class65.anInt1034 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3797 >> 6 << 6;
				Static2.anInt3856 = (-Class65.anInt1034
						+ (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3810 >> 6 << 38) + 64);
				int i_3_ = ((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495 >> 7)
						+ (SceneGraphNode_Projectile.anInt3676 - Class65.anInt1034));
				JunkTex.aFloat2854 = Class90.aFloat1426 = 8.0F;
				Class35.anInt603 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3806 >> 6 << 38;
				i_3_ += (int) (Math.random() * 10.0) - 5;
				JunkTex.anInt4332 = (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3805 >> 38 << 6)
						+ (-Class35.anInt603 + 64);
				int i_4_ = (Class35.anInt603 - Class58.anInt947 - (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436 >> 7)
						+ (JunkTex.anInt4332 - 1));
				i_4_ += (int) (Math.random() * 10.0) - 5;
				if (i_3_ < 0 || i_3_ >= Static2.anInt3856 || i_4_ < 0
						|| i_4_ >= JunkTex.anInt4332) {
					SceneGraphNode_Projectile.anInt3659 = (Class35.anInt603 - ((Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3812 * 64)
							- (JunkTex.anInt4332 - 1)));
					Class37.anInt644 = (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3813 * 64 - Class65.anInt1034);
				} else {
					Class37.anInt644 = i_3_;
					SceneGraphNode_Projectile.anInt3659 = i_4_;
				}
				Static2.method1126((byte) -22);
				int i_5_ = Static2.anInt3856 >> 6;
				Class56.anIntArray917 = new int[Class131.anInt2159 + 1];
				int i_6_ = JunkTex.anInt4332 >> 6;
				JunkTex.aByteArrayArrayArray4257 = new byte[i_5_][i_6_][];
				Static2.aByteArrayArrayArray3864 = new byte[i_5_][i_6_][];
				Class14_Sub2_Sub5.aByteArrayArrayArray3816 = new byte[i_5_][i_6_][];
				JunkTex.aByteArrayArrayArray4130 = new byte[i_5_][i_6_][];
				int i_7_ = JunkTex.anInt4527 >> 33;
				JunkTex.anIntArrayArrayArray3125 = new int[i_5_][i_6_][];
				Class86.aByteArrayArrayArray1383 = new byte[i_5_][i_6_][];
				Class14_Sub25.anIntArrayArrayArray3174 = new int[i_5_][i_6_][];
				Class79.aShortArrayArrayArray1247 = new short[i_5_][i_6_][];
				int i_8_ = Class51.anInt830 >> 2 << 42;
				Class54.method1221(i_7_, i_8_);
				JunkTex.anInt4616 = 20;
			} else if (JunkTex.anInt4616 == 20) {
				Static2.method1176(false,
						new Buffer(JunkTex.aFileSystem_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804),
								(JunkTex.aClass124_3956))));
				JunkTex.anInt4616 = 30;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 30) {
				Static2.method241(11075,
						new Buffer(JunkTex.aFileSystem_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), (Static2.aClass124_2869))));
				JunkTex.anInt4616 = 40;
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 40) {
				Class138.method1945((byte) -102,
						new Buffer(JunkTex.aFileSystem_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), JunkTex.aClass124_4574)));
				JunkTex.anInt4616 = 50;
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 50) {
				JunkTex
						.method601(-113,
								new Buffer(JunkTex.aFileSystem_4570.method167(
										(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Class131.aClass124_2161)));
				JunkTex.anInt4616 = 60;
				Static2.method259(true, i ^ 0x2ee8);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == i) {
				Class152.aClass146_2435 = (JunkTex.method507(true,
						(JunkTex.method515(new Class124[] {
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Static2.aClass124_1099 },
						(byte) -30)), JunkTex.aFileSystem_4570));
				JunkTex.anInt4616 = 70;
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 70) {
				Class14_Sub17.aClass87_3004 = new Class87(11, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 73;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 73) {
				Class48.aClass87_805 = new Class87(12, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 76;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 76) {
				Class54.aClass87_888 = new Class87(14, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 79;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 79) {
				JunkTex.aClass87_858 = new Class87(17, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 82;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 82) {
				JunkTex.aClass87_4672 = new Class87(19, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 85;
				Static2.method259(true, i + 11928);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 85) {
				Class141.aClass87_2242 = new Class87(22, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 88;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else if (JunkTex.anInt4616 == 88) {
				Class48.aClass87_803 = new Class87(26, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 91;
				Static2.method259(true, 11988);
				ErrorReporting.method531((byte) -112);
			} else {
				Class132.aClass87_2171 = new Class87(30, true, ErrorReporting.aCanvas819);
				JunkTex.anInt4616 = 100;
				Static2.method259(true, i ^ 0x2ee8);
				ErrorReporting.method531((byte) -112);
				Class14_Sub18.anInt3050 = -1;
				JunkTex.anInt427 = -1;
				System.gc();
			}
		}
	}
	public static void method1162(int i, int i_9_, int i_10_, int i_11_, byte i_12_, int i_13_, boolean bool) {
		if (i_9_ != Static2.anInt2133 || Static2.anInt818 != i
				|| (i_10_ != Class142.anInt2295 && !Class128.method1755(130068615))) {
			Static2.anInt818 = i;
			Static2.anInt2133 = i_9_;
			Class142.anInt2295 = i_10_;
			if (Class128.method1755(130068615))
				Class142.anInt2295 = 0;
			if (!bool)
				Static2.method1743(27252, 25);
			else
				Static2.method1743(27252, 28);
			Class84.method1411(true, client.aClass124_2639, true);
			int i_14_ = Class58.anInt947;
			int i_15_ = SceneGraphNode_Projectile.anInt3676;
			SceneGraphNode_Projectile.anInt3676 = (i_9_ - 6) * 8;
			Class58.anInt947 = i * 8 - 48;
			Class70.aClass14_Sub2_Sub5_1078 = OverlayType.method2020(Static2.anInt2133 * 8, false, Static2.anInt818 * 8);
			int i_16_ = SceneGraphNode_Projectile.anInt3676 - i_15_;
			int i_17_ = Class58.anInt947 - i_14_;
			i_15_ = SceneGraphNode_Projectile.anInt3676;
			i_14_ = Class58.anInt947;
			if (bool) {
				JunkTex.anInt4306 = 0;
				for (int i_18_ = 0; i_18_ < 32768; i_18_++) {
					SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_18_];
					if (class133_sub1_sub2 != null) {
						class133_sub1_sub2.anInt3436 -= i_17_ * 128;
						class133_sub1_sub2.anInt3495 -= i_16_ * 128;
						if (class133_sub1_sub2.anInt3495 >= 0 && class133_sub1_sub2.anInt3495 <= 13184
								&& class133_sub1_sub2.anInt3436 >= 0 && class133_sub1_sub2.anInt3436 <= 13184) {
							for (int i_19_ = 0; i_19_ < 10; i_19_++) {
								class133_sub1_sub2.anIntArray3476[i_19_] -= i_16_;
								class133_sub1_sub2.anIntArray3443[i_19_] -= i_17_;
							}
							JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_18_;
						} else {
							Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_18_].aClass12_4949 = null;
							Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_18_] = null;
						}
					}
				}
			} else {
				for (int i_20_ = 0; i_20_ < 32768; i_20_++) {
					SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_20_];
					if (class133_sub1_sub2 != null) {
						for (int i_21_ = 0; i_21_ < 10; i_21_++) {
							class133_sub1_sub2.anIntArray3476[i_21_] -= i_16_;
							class133_sub1_sub2.anIntArray3443[i_21_] -= i_17_;
						}
						class133_sub1_sub2.anInt3436 -= i_17_ * 128;
						class133_sub1_sub2.anInt3495 -= i_16_ * 128;
					}
				}
			}
			for (int i_22_ = 0; i_22_ < 2048; i_22_++) {
				SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1 = JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_22_];
				if (class133_sub1_sub1 != null) {
					for (int i_23_ = 0; i_23_ < 10; i_23_++) {
						class133_sub1_sub1.anIntArray3476[i_23_] -= i_16_;
						class133_sub1_sub1.anIntArray3443[i_23_] -= i_17_;
					}
					class133_sub1_sub1.anInt3436 -= i_17_ * 128;
					class133_sub1_sub1.anInt3495 -= i_16_ * 128;
				}
			}
			int i_24_ = 0;
			Class14_Sub2_Sub3.gameLevel = i_10_;
			if (i_12_ > -116)
				method1163(false, -63);
			Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.method1800((byte) -85, i_11_, false, i_13_);
			int i_25_ = 104;
			int i_26_ = 0;
			int i_27_ = 1;
			if (i_16_ < 0) {
				i_25_ = -1;
				i_27_ = -1;
				i_24_ = 103;
			}
			int i_28_ = 1;
			int i_29_ = 104;
			if (i_17_ < 0) {
				i_29_ = -1;
				i_26_ = 103;
				i_28_ = -1;
			}
			for (int i_30_ = i_24_; i_25_ != i_30_; i_30_ += i_27_) {
				for (int i_31_ = i_26_; i_31_ != i_29_; i_31_ += i_28_) {
					int i_32_ = i_30_ + i_16_;
					int i_33_ = i_31_ + i_17_;
					for (int i_34_ = 0; i_34_ < 4; i_34_++) {
						if (i_32_ < 0 || i_33_ < 0 || i_32_ >= 104 || i_33_ >= 104)
							Class128.aClass2ArrayArrayArray2119[i_34_][i_30_][i_31_] = null;
						else
							Class128.aClass2ArrayArrayArray2119[i_34_][i_30_][i_31_] = (Class128.aClass2ArrayArrayArray2119[i_34_][i_32_][i_33_]);
					}
				}
			}
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getFront(); class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getNext()) {
				class14_sub14.anInt2970 -= i_17_;
				class14_sub14.anInt2967 -= i_16_;
				if (class14_sub14.anInt2967 < 0 || class14_sub14.anInt2970 < 0 || class14_sub14.anInt2967 >= 104
						|| class14_sub14.anInt2970 >= 104)
					class14_sub14.unlink();
			}
			if (Static2.anInt1085 != 0) {
				JunkTex.anInt4335 -= i_17_;
				Static2.anInt1085 -= i_16_;
			}
			if (!bool)
				Class89.anInt1415 = 1;
			else {
				JunkTex.anInt4731 -= i_17_;
				Class33.anInt577 -= i_17_;
				Static2.anInt1948 -= i_16_;
				Class123.anInt2062 -= i_16_;
			}
			JunkTex.anInt96 = 0;
			if (bool && (Math.abs(i_16_) > 104 || Math.abs(i_17_) > 104))
				Class14_Sub13.method858(-1);
			JunkTex.anInt4207 = -1;
			Class79.aClass2_1268.clear();
			Class4.aClass2_127.clear();
		}
	}
	public static void method1163(boolean bool, int i) {
		byte[][] is;
		int i_35_;
		if (bool) {
			i_35_ = 1;
			is = Static2.aByteArrayArray362;
		} else {
			is = Class14_Sub20.aByteArrayArray3097;
			i_35_ = 4;
		}
		int i_36_ = 0;
		if (i > -16)
			anIntArray737 = null;
		for (/**/; i_36_ < i_35_; i_36_++) {
			Class138.method1946(139);
			for (int i_37_ = 0; i_37_ < 13; i_37_++) {
				for (int i_38_ = 0; i_38_ < 13; i_38_++) {
					int i_39_ = Class7.anIntArrayArrayArray169[i_36_][i_37_][i_38_];
					if (i_39_ != -1) {
						int i_40_ = (i_39_ & 0x383a193) >> 24;
						if (!bool || i_40_ == 0) {
							int i_41_ = i_39_ >> 46 & 0x3ff;
							int i_42_ = (i_39_ & 0x7) >> 33;
							int i_43_ = (i_39_ & 0x3ff8) >> 3;
							int i_44_ = (i_41_ / 8 << 40) + i_43_ / 8;
							for (int i_45_ = 0; i_45_ < JunkTex.anIntArray2858.length; i_45_++) {
								if (JunkTex.anIntArray2858[i_45_] == i_44_ && is[i_45_] != null) {
									JunkTex.method2053(Class14_Sub21.aClass32Array3100, is[i_45_], i_42_,
											bool, i_40_, false, i_37_ * 8, i_38_ * 8, (i_41_ & 0x7) * 8, i_36_,
											(i_43_ & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
	}
	public static void method1164(FileSystem fileSystem, int i) {
		Class14_Sub2_Sub5.aFileSystem_3817 = fileSystem;
		if (i <= 31)
			aClass124_738 = null;
	}
	public static void method1165(byte i) {
		anIntArray737 = null;
		anIntArray743 = null;
		if (i != -62)
			aClass124_750 = null;
		aClass124_750 = null;
		aClass124_738 = null;
	}

	public static void method1166(boolean bool, boolean bool_46_) {
		byte[][] is;
		if (!bool)
			is = Class14_Sub20.aByteArrayArray3097;
		else
			is = Static2.aByteArrayArray362;
		int i = Static2.aByteArrayArray139.length;
		if (bool_46_)
			anIntArray743 = null;
		for (int i_47_ = 0; i > i_47_; i_47_++) {
			byte[] is_48_ = is[i_47_];
			if (is_48_ != null) {
				int i_49_ = (-SceneGraphNode_Projectile.anInt3676 + (JunkTex.anIntArray2858[i_47_] >> 8) * 64);
				int i_50_ = ((JunkTex.anIntArray2858[i_47_] & 0xff) * 64 - Class58.anInt947);
				Class138.method1946(139);
				Class90.method1447(i_50_, Class14_Sub21.aClass32Array3100, bool, is_48_, i_49_, -23935);
			}
		}
	}

	public boolean aBoolean749;

	public Class124 aClass124_741;

	public int anInt742;

	public int anInt744;

	public int anInt745;

	public int anInt752;
}
