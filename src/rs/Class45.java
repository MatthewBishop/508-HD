/* Class45 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Static;

public class Class45 {
	public static int[] anIntArray737 = { 1, 1, 1, 1 };
	public static Class124 aClass124_738 = Class14_Sub2_Sub2.method263(1178, "AUS");
	public Class124 aClass124_741;
	public int anInt742;
	public static int[] anIntArray743 = new int[200];
	public int anInt744;
	public int anInt745;
	public boolean aBoolean749;
	public static Class124 aClass124_750 = Class14_Sub2_Sub2.method263(1178, "::rect_debug");
	public static int anInt751 = -1;
	public int anInt752;

	public static void method1160(int i) {
		Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst());
		if (i != 0)
			method1166(true, false);
		for (/**/; class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
				.getNext()) {
			int i_0_ = class14_sub15.anInt2999;
			if (Class126.method1741((byte) 100, i_0_)) {
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
					Class94 class94 = Static.method1233(i_2_, i + 21803);
					if (class94 != null)
						Class103.method1531(class94);
				}
			}
		}
	}

	public static void method1161(int i) {
		if (Class7_Sub1.aClass14_Sub2_Sub5_2665 != null) {
			if (Class14_Sub8_Sub32.anInt4616 < 10) {
				if (!(Class14_Sub8_Sub28.aClass9_4570.method160(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804,
						(byte) -102))
						|| !(Class14_Sub8_Sub28.aClass9_4570.method160((Class14_Sub8_Sub7.method515(new Class124[] {
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Class71.aClass124_1099 },
								(byte) -79)), (byte) -102))) {
					Class14_Sub8_Sub32.anInt4616 = (Class7_Sub1.aClass9_Sub1_2657
							.method151(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804, i ^ ~0x46)) / 10;
					return;
				}
				Class14_Sub8_Sub17.method568(i ^ 0x38);
				Class14_Sub8_Sub32.anInt4616 = 10;
			}
			if (Class14_Sub8_Sub32.anInt4616 == 10) {
				Class65.anInt1034 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3797 >> 6 << 6;
				Class14_Sub2_Sub9.anInt3856 = (-Class65.anInt1034
						+ (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3810 >> 6 << 38) + 64);
				int i_3_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7)
						+ (Class133_Sub6.anInt3676 - Class65.anInt1034));
				Class14_Sub8.aFloat2854 = Class90.aFloat1426 = 8.0F;
				Class35.anInt603 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3806 >> 6 << 38;
				i_3_ += (int) (Math.random() * 10.0) - 5;
				Class14_Sub8_Sub15.anInt4332 = (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3805 >> 38 << 6)
						+ (-Class35.anInt603 + 64);
				int i_4_ = (Class35.anInt603 - Class58.anInt947 - (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 7)
						+ (Class14_Sub8_Sub15.anInt4332 - 1));
				i_4_ += (int) (Math.random() * 10.0) - 5;
				if (i_3_ < 0 || i_3_ >= Class14_Sub2_Sub9.anInt3856 || i_4_ < 0
						|| i_4_ >= Class14_Sub8_Sub15.anInt4332) {
					Class133_Sub6.anInt3659 = (Class35.anInt603 - ((Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3812 * 64)
							- (Class14_Sub8_Sub15.anInt4332 - 1)));
					Class37.anInt644 = (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3813 * 64 - Class65.anInt1034);
				} else {
					Class37.anInt644 = i_3_;
					Class133_Sub6.anInt3659 = i_4_;
				}
				Static2.method1126((byte) -22);
				int i_5_ = Class14_Sub2_Sub9.anInt3856 >> 6;
				Class56.anIntArray917 = new int[Class131.anInt2159 + 1];
				int i_6_ = Class14_Sub8_Sub15.anInt4332 >> 6;
				Class14_Sub8_Sub10.aByteArrayArrayArray4257 = new byte[i_5_][i_6_][];
				Class14_Sub2_Sub9.aByteArrayArrayArray3864 = new byte[i_5_][i_6_][];
				Class14_Sub2_Sub5.aByteArrayArrayArray3816 = new byte[i_5_][i_6_][];
				Class14_Sub8_Sub3.aByteArrayArrayArray4130 = new byte[i_5_][i_6_][];
				int i_7_ = Class14_Sub8_Sub26.anInt4527 >> 33;
				Class14_Sub22.anIntArrayArrayArray3125 = new int[i_5_][i_6_][];
				Class86.aByteArrayArrayArray1383 = new byte[i_5_][i_6_][];
				Class14_Sub25.anIntArrayArrayArray3174 = new int[i_5_][i_6_][];
				Class79.aShortArrayArrayArray1247 = new short[i_5_][i_6_][];
				int i_8_ = Class51.anInt830 >> 2 << 42;
				Class54.method1221(i_7_, true, i_8_);
				Class14_Sub8_Sub32.anInt4616 = 20;
			} else if (Class14_Sub8_Sub32.anInt4616 == 20) {
				Class46.method1176(false,
						new Buffer(Class14_Sub8_Sub28.aClass9_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804),
								(Static.aClass124_3956), -128)));
				Class14_Sub8_Sub32.anInt4616 = 30;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 30) {
				Static2.method241(11075,
						new Buffer(Class14_Sub8_Sub28.aClass9_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), (Static2.aClass124_2869),
								104)));
				Class14_Sub8_Sub32.anInt4616 = 40;
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 40) {
				Class138.method1945((byte) -102,
						new Buffer(Class14_Sub8_Sub28.aClass9_4570.method167(
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Class14_Sub8_Sub29.aClass124_4574,
								i - 133)));
				Class14_Sub8_Sub32.anInt4616 = 50;
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 50) {
				Class14_Sub8_Sub23
						.method601(-113,
								new Buffer(Class14_Sub8_Sub28.aClass9_4570.method167(
										(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Class131.aClass124_2161,
										-70)));
				Class14_Sub8_Sub32.anInt4616 = 60;
				Static2.method259(true, i ^ 0x2ee8);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == i) {
				Class152.aClass146_2435 = (Class14_Sub8_Sub6.method507(true,
						(Class14_Sub8_Sub7.method515(new Class124[] {
								(Class7_Sub1.aClass14_Sub2_Sub5_2665.aClass124_3804), Class71.aClass124_1099 },
						(byte) -30)), Class14_Sub8_Sub28.aClass9_4570));
				Class14_Sub8_Sub32.anInt4616 = 70;
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 70) {
				Class14_Sub17.aClass87_3004 = new Class87(11, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 73;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 73) {
				Class48.aClass87_805 = new Class87(12, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 76;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 76) {
				Class54.aClass87_888 = new Class87(14, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 79;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 79) {
				Static.aClass87_858 = new Class87(17, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 82;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 82) {
				Class14_Sub8_Sub35.aClass87_4672 = new Class87(19, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 85;
				Static2.method259(true, i + 11928);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 85) {
				Class141.aClass87_2242 = new Class87(22, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 88;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else if (Class14_Sub8_Sub32.anInt4616 == 88) {
				Class48.aClass87_803 = new Class87(26, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 91;
				Static2.method259(true, 11988);
				Class14_Sub8_Sub11.method531((byte) -112);
			} else {
				Class132.aClass87_2171 = new Class87(30, true, Class49.aCanvas819);
				Class14_Sub8_Sub32.anInt4616 = 100;
				Static2.method259(true, i ^ 0x2ee8);
				Class14_Sub8_Sub11.method531((byte) -112);
				Class14_Sub18.anInt3050 = -1;
				Static.anInt427 = -1;
				System.gc();
			}
		}
	}

	public static void method1162(int i, int i_9_, int i_10_, int i_11_, byte i_12_, int i_13_, boolean bool) {
		if (i_9_ != Class129.anInt2133 || Class49.anInt818 != i
				|| (i_10_ != Class142.anInt2295 && !Class128.method1755(130068615))) {
			Class49.anInt818 = i;
			Class129.anInt2133 = i_9_;
			Class142.anInt2295 = i_10_;
			if (Class128.method1755(130068615))
				Class142.anInt2295 = 0;
			if (!bool)
				Class126.method1743(27252, 25);
			else
				Class126.method1743(27252, 28);
			Class84.method1411(true, client.aClass124_2639, true);
			int i_14_ = Class58.anInt947;
			int i_15_ = Class133_Sub6.anInt3676;
			Class133_Sub6.anInt3676 = (i_9_ - 6) * 8;
			Class58.anInt947 = i * 8 - 48;
			Class70.aClass14_Sub2_Sub5_1078 = Class150.method2020(Class129.anInt2133 * 8, false, Class49.anInt818 * 8);
			int i_16_ = Class133_Sub6.anInt3676 - i_15_;
			int i_17_ = Class58.anInt947 - i_14_;
			i_15_ = Class133_Sub6.anInt3676;
			i_14_ = Class58.anInt947;
			if (bool) {
				Class14_Sub8_Sub13.anInt4306 = 0;
				for (int i_18_ = 0; i_18_ < 32768; i_18_++) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_18_];
					if (class133_sub1_sub2 != null) {
						class133_sub1_sub2.anInt3436 -= i_17_ * 128;
						class133_sub1_sub2.anInt3495 -= i_16_ * 128;
						if (class133_sub1_sub2.anInt3495 >= 0 && class133_sub1_sub2.anInt3495 <= 13184
								&& class133_sub1_sub2.anInt3436 >= 0 && class133_sub1_sub2.anInt3436 <= 13184) {
							for (int i_19_ = 0; i_19_ < 10; i_19_++) {
								class133_sub1_sub2.anIntArray3476[i_19_] -= i_16_;
								class133_sub1_sub2.anIntArray3443[i_19_] -= i_17_;
							}
							Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_18_;
						} else {
							Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_18_].aClass12_4949 = null;
							Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_18_] = null;
						}
					}
				}
			} else {
				for (int i_20_ = 0; i_20_ < 32768; i_20_++) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_20_];
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
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_22_];
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
			Class14_Sub2_Sub3.anInt3785 = i_10_;
			if (i_12_ > -116)
				method1163(false, -63);
			Class14_Sub3.aClass133_Sub1_Sub1_2748.method1800((byte) -85, i_11_, false, i_13_);
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
			if (Class71.anInt1085 != 0) {
				Class14_Sub8_Sub15.anInt4335 -= i_17_;
				Class71.anInt1085 -= i_16_;
			}
			if (!bool)
				Class89.anInt1415 = 1;
			else {
				Class14_Sub8_Sub38.anInt4731 -= i_17_;
				Class33.anInt577 -= i_17_;
				Class117.anInt1948 -= i_16_;
				Class123.anInt2062 -= i_16_;
			}
			Static.anInt96 = 0;
			if (bool && (Math.abs(i_16_) > 104 || Math.abs(i_17_) > 104))
				Class14_Sub13.method858(-1);
			Class14_Sub8_Sub7.anInt4207 = -1;
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
							for (int i_45_ = 0; i_45_ < Class14_Sub8.anIntArray2858.length; i_45_++) {
								if (Class14_Sub8.anIntArray2858[i_45_] == i_44_ && is[i_45_] != null) {
									RuntimeException_Sub1.method2053(Class14_Sub21.aClass32Array3100, is[i_45_], i_42_,
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

	public static void method1164(Class9 class9, int i) {
		Class14_Sub2_Sub5.aClass9_3817 = class9;
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
		int i = Class5.aByteArrayArray139.length;
		if (bool_46_)
			anIntArray743 = null;
		for (int i_47_ = 0; i > i_47_; i_47_++) {
			byte[] is_48_ = is[i_47_];
			if (is_48_ != null) {
				int i_49_ = (-Class133_Sub6.anInt3676 + (Class14_Sub8.anIntArray2858[i_47_] >> 8) * 64);
				int i_50_ = ((Class14_Sub8.anIntArray2858[i_47_] & 0xff) * 64 - Class58.anInt947);
				Class138.method1946(139);
				Class90.method1447(i_50_, Class14_Sub21.aClass32Array3100, bool, is_48_, i_49_, -23935);
			}
		}
	}
}
