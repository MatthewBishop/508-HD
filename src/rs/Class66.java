/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class14_Sub27;

import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Static;

public class Class66 {
	public int anInt1035;
	public static Class124 aClass124_1037 = Class14_Sub2_Sub2.method263(1178, ":clan:");
	public int anInt1038;
	public static int anInt1039 = -1;
	public int anInt1041;
	public static Class124 aClass124_1042 = Class14_Sub2_Sub2.method263(1178, "Mem:");
	public int anInt1043 = -1;
	public int anInt1044;
	public static int anInt1045;
	public int anInt1046;
	public int anInt1047;
	public int anInt1049;
	public static int[][][] anIntArrayArrayArray135;
	public int anInt1051;

	public static void method1293(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class51.method1201(Static2.anIntArrayArray4038[i], -i_1_ + i_0_, i_0_ + i_1_, -5973, i_4_);
		int i_5_ = 0;
		int i_6_ = i_1_ * i_1_;
		int i_7_ = i_3_;
		int i_8_ = i_3_ * i_3_;
		int i_9_ = i_8_ << 1;
		int i_10_ = i_6_ << 33;
		int i_11_ = 64 % ((85 - i_2_) / 32);
		int i_12_ = i_3_ << 33;
		int i_13_ = (-i_12_ + 1) * i_6_ + i_9_;
		int i_14_ = i_6_ << 2;
		int i_15_ = i_8_ - (i_12_ - 1) * i_10_;
		int i_16_ = i_8_ << 2;
		int i_17_ = ((i_7_ << 33) - 3) * i_10_;
		int i_18_ = ((i_5_ << 1) + 3) * i_9_;
		int i_19_ = (i_5_ + 1) * i_16_;
		int i_20_ = (i_7_ - 1) * i_14_;
		while (i_7_ > 0) {
			i_7_--;
			if (i_13_ < 0) {
				while (i_13_ < 0) {
					i_13_ += i_18_;
					i_18_ += i_16_;
					i_15_ += i_19_;
					i_19_ += i_16_;
					i_5_++;
				}
			}
			if (i_15_ < 0) {
				i_15_ += i_19_;
				i_13_ += i_18_;
				i_19_ += i_16_;
				i_18_ += i_16_;
				i_5_++;
			}
			int i_21_ = i - i_7_;
			i_13_ -= i_20_;
			i_15_ -= i_17_;
			i_20_ -= i_14_;
			i_17_ -= i_14_;
			int i_22_ = i + i_7_;
			int i_23_ = i_5_ + i_0_;
			int i_24_ = i_0_ - i_5_;
			Class51.method1201(Static2.anIntArrayArray4038[i_21_], i_24_, i_23_, -5973, i_4_);
			Class51.method1201(Static2.anIntArrayArray4038[i_22_], i_24_, i_23_, -5973, i_4_);
		}
	}

	public static int method1294(int i, int i_25_) {
		int i_26_ = i | i_25_;
		return i_26_;
	}

	public static void method1295(int i) {
		anIntArrayArrayArray135 = null;
		if (i != -597398239)
			method1295(-108);
		aClass124_1042 = null;
		aClass124_1037 = null;
	}

	public static void method1296(int i, int i_27_, int i_28_, int i_29_) {
		Class14_Sub14.aClass14_Sub29ArrayArrayArray2987 = new Class14_Sub29[i][i_27_][i_28_];
		Class149.anIntArrayArrayArray2391 = new int[i][i_27_ + 1][i_28_ + 1];
		Class14_Sub30.aClass14_Sub27ArrayArray3273 = new Class14_Sub27[4][];
		Class14_Sub8_Sub28.method627(false);
		Class99_Sub2.anInt3338 = i_27_;
		Class14_Sub8_Sub15.anInt4337 = i_28_;
		Static.anIntArrayArrayArray2724 = new int[i][i_27_ + 1][i_28_ + 1];
		Class56.method1240();
		Static.anInt1108 = i_29_;
		Class53.visibilityMap = (new boolean[Static.anInt1108 + Static.anInt1108 + 1][Static.anInt1108
				+ Static.anInt1108 + 1]);
		Class14_Sub8_Sub3.aBooleanArrayArray4138 = (new boolean[Static.anInt1108 + Static.anInt1108
				+ 2][Static.anInt1108 + Static.anInt1108 + 2]);
	}

	public static void method1297(int i, Class12 class12, int i_30_, int i_31_, byte i_32_) {
		if (Class14_Sub8_Sub38.anInt4729 < 400) {
			if (class12.anIntArray329 != null)
				class12 = class12.method217((byte) -18);
			if (class12 != null && i_32_ >= 76 && class12.aBoolean308) {
				Class124 class124 = class12.aClass124_302;
				if (class12.anInt295 != 0)
					class124 = (Class14_Sub8_Sub7.method515(
							(new Class124[] { class124,
									Class153.method2047(1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937),
											class12.anInt295),
									Class14_Sub8_Sub17.aClass124_4360, Class48.aClass124_797,
									Class83.method1407(76, class12.anInt295), Class14_Sub8_Sub27.aClass124_4552 }),
							(byte) -28));
				if (Class51.anInt831 != 1) {
					if (!Class14_Sub4.aBoolean2784) {
						Class124[] class124s = class12.aClass124Array291;
						if (Class49.aBoolean814)
							class124s = Static2.method1545(5, class124s);
						if (class124s != null) {
							for (int i_33_ = 4; i_33_ >= 0; i_33_--) {
								if (class124s[i_33_] != null && (Static2.anInt3749 != 0
										|| !(class124s[i_33_].method1717(40, Class118.aClass124_1973)))) {
									short i_34_ = 0;
									if (i_33_ == 0)
										i_34_ = (short) 2;
									if (i_33_ == 1)
										i_34_ = (short) 11;
									if (i_33_ == 2)
										i_34_ = (short) 31;
									if (i_33_ == 3)
										i_34_ = (short) 14;
									if (i_33_ == 4)
										i_34_ = (short) 50;
									Class14_Sub11
											.method853(32, class124s[i_33_], i,
													(Class14_Sub8_Sub7.method515(new Class124[] {
															(Class14_Sub8_Sub36.aClass124_4694), class124 },
													(byte) -93)), i_34_, (long) i_31_, i_30_);
								}
							}
						}
						if (Static2.anInt3749 == 0 && class124s != null) {
							for (int i_35_ = 4; i_35_ >= 0; i_35_--) {
								if (class124s[i_35_] != null
										&& (class124s[i_35_].method1717(40, Class118.aClass124_1973))) {
									short i_36_ = 0;
									short i_37_ = 0;
									if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937) < class12.anInt295)
										i_36_ = (short) 2000;
									if (i_35_ == 0)
										i_37_ = (short) 2;
									if (i_35_ == 1)
										i_37_ = (short) 11;
									if (i_35_ == 2)
										i_37_ = (short) 31;
									if (i_35_ == 3)
										i_37_ = (short) 14;
									if (i_35_ == 4)
										i_37_ = (short) 50;
									if (i_37_ != 0)
										i_37_ += i_36_;
									Class14_Sub11
											.method853(32, class124s[i_35_], i,
													(Class14_Sub8_Sub7.method515(new Class124[] {
															(Class14_Sub8_Sub36.aClass124_4694), class124 },
													(byte) -97)), i_37_, (long) i_31_, i_30_);
								}
							}
						}
						Class14_Sub11.method853(32, Static.aClass124_2802, i,
								Class14_Sub8_Sub7.method515(
										(new Class124[] { (Class14_Sub8_Sub36.aClass124_4694), class124 }), (byte) -96),
								(short) 1002, (long) i_31_, i_30_);
					} else if ((Static.anInt101 & 0x2) == 2)
						Class14_Sub11.method853(32, Class125.aClass124_2082, i,
								Class14_Sub8_Sub7.method515((new Class124[] { (Class17.aClass124_408),
										(Static2.aClass124_3724), class124 }), (byte) -83),
								(short) 34, (long) i_31_, i_30_);
				} else
					Class14_Sub11.method853(32, Class40.aClass124_665, i,
							(Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub6.aClass124_2809,
									(Static2.aClass124_3724), class124 }), (byte) -123)),
							(short) 30, (long) i_31_, i_30_);
			}
		}
	}
}
