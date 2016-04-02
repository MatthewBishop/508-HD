/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Graphics;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub18;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Static;

public abstract class Class108 {
	public static Class124 aClass124_1814;
	public static Class124 aClass124_1815;
	public static int anInt1816;
	public static Class9 aClass9_1817;
	public static boolean[] aBooleanArray1819;
	public static Class124 aClass124_1821;
	public static Class124 aClass124_1822 = Class14_Sub2_Sub2.method263(1178, "Loaded sprites");
	public static Class124 aClass124_1823;
	public static int anInt1824 = -1;
	public static Class124 aClass124_1825;
	public static Class124 aClass124_1826;
	public static Class124 aClass124_1828;

	static {
		aClass124_1814 = aClass124_1822;
		aClass124_1823 = Class14_Sub2_Sub2.method263(1178, "wave2:");
		aClass124_1821 = aClass124_1823;
		aClass124_1815 = aClass124_1823;
		aClass124_1826 = Class14_Sub2_Sub2.method263(1178, "FULL");
		aClass124_1825 = aClass124_1826;
		aClass124_1828 = Class14_Sub2_Sub2.method263(1178, "Spielwelt erstellt)3");
	}

	public static void method1556(boolean bool) {
		aClass124_1822 = null;
		aClass9_1817 = null;
		aClass124_1821 = null;
		aClass124_1814 = null;
		aClass124_1823 = null;
		aClass124_1815 = null;
		if (bool)
			aClass124_1826 = null;
		aClass124_1825 = null;
		aBooleanArray1819 = null;
		aClass124_1828 = null;
		aClass124_1826 = null;
	}

	public static void method1557(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_, int i_8_) {
		if (i_2_ == i_5_ && i_0_ == i_3_ && i_7_ == i_6_ && i_4_ == i_8_)
			Class99_Sub2.method1510(i_8_, i_1_, (byte) -46, i_7_, i_5_, i_0_);
		else {
			int i_9_ = i_5_;
			int i_10_ = i_0_;
			int i_11_ = i_2_ * 3;
			int i_12_ = i_0_ * 3;
			int i_13_ = i_5_ * 3;
			int i_14_ = i_3_ * 3;
			int i_15_ = i_4_ * 3;
			int i_16_ = i_6_ * 3;
			int i_17_ = i_13_ + i_16_ - (i_11_ + i_11_);
			int i_18_ = i_11_ - i_16_ + i_7_ - i_5_;
			int i_19_ = i_12_ + i_15_ + (-i_14_ - i_14_);
			int i_20_ = -i_13_ + i_11_;
			int i_21_ = -i_0_ - i_15_ + i_8_ + i_14_;
			int i_22_ = -i_12_ + i_14_;
			for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
				int i_24_ = i_23_ * i_23_ >> 44;
				int i_25_ = i_24_ * i_23_ >> 12;
				int i_26_ = i_18_ * i_25_;
				int i_27_ = i_25_ * i_21_;
				int i_28_ = i_17_ * i_24_;
				int i_29_ = i_22_ * i_23_;
				int i_30_ = i_24_ * i_19_;
				int i_31_ = i_20_ * i_23_;
				int i_32_ = i_5_ + (i_28_ + i_26_ + i_31_ >> 12);
				int i_33_ = i_0_ + (i_27_ - (-i_30_ - i_29_) >> 12);
				Class99_Sub2.method1510(i_33_, i_1_, (byte) 65, i_32_, i_9_, i_10_);
				i_9_ = i_32_;
				i_10_ = i_33_;
			}
		}
		int i_34_ = 102 % ((-20 - i) / 33);
	}

	public abstract void method1558(int i, byte i_35_, Graphics graphics, int i_36_);

	public static void method1559(byte i) {
		Static2.aClass55_4048.clear();
		Class14_Sub8.aClass81_2844.method1395((byte) 127);
		if (i == -100)
			Class14_Sub8_Sub27.aClass81_4546.method1395((byte) 122);
	}

	public abstract void method1560(int i, byte i_37_, int i_38_, int i_39_, Graphics graphics, int i_40_);

	public static void method1561(Class9 class9, byte i, Class9 class9_41_) {
		if (i >= 22) {
			Class14_Sub8_Sub15.aClass9_4338 = class9;
			Static.aClass9_2711 = class9_41_;
		}
	}

	public static void method1562(int[] is, int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_43_][i_44_][i_45_]);
		if (class14_sub29 != null) {
			Class153 class153 = class14_sub29.aClass153_3248;
			if (class153 != null) {
				int i_46_ = class153.anInt2441;
				if (i_46_ != 0) {
					for (int i_47_ = 0; i_47_ < 4; i_47_++) {
						is[i] = i_46_;
						is[i + 1] = i_46_;
						is[i + 2] = i_46_;
						is[i + 3] = i_46_;
						i += i_42_;
					}
				}
			} else {
				Class6 class6 = class14_sub29.aClass6_3233;
				if (class6 != null) {
					int i_48_ = class6.anInt152;
					int i_49_ = class6.anInt151;
					int i_50_ = class6.anInt154;
					int i_51_ = class6.anInt156;
					int[] is_52_ = Class14_Sub8_Sub18.anIntArrayArray4388[i_48_];
					int[] is_53_ = Class9.anIntArrayArray190[i_49_];
					int i_54_ = 0;
					if (i_50_ != 0) {
						for (int i_55_ = 0; i_55_ < 4; i_55_++) {
							is[i] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 1] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 2] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 3] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							i += i_42_;
						}
					} else {
						for (int i_56_ = 0; i_56_ < 4; i_56_++) {
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 1] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 2] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 3] = i_51_;
							i += i_42_;
						}
					}
				}
			}
		}
	}
}
