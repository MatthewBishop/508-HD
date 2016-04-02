/* Class14_Sub8_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class124;
import rs.Class125;
import rs.Class133_Sub1_Sub1;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub6;
import rs.Class152;
import rs.Class70;

public class Class14_Sub8_Sub13 extends Class14_Sub8 {
	public static Class124 aClass124_4302;
	public static Class124 aClass124_4305 = Class14_Sub2_Sub2.method263(1178, " from your ignore list first)3");
	public static Class124 aClass124_4312;
	public static Class124 aClass124_4313 = Class14_Sub2_Sub2.method263(1178, "(U4");
	public static Class124 aClass124_4315;
	public static int anInt4306 = 0;
	public static int anInt4310;
	public static int anInt4314 = 0;

	static {
		aClass124_4312 = Class14_Sub2_Sub2.method263(1178, "Starting 3d library");
		aClass124_4315 = aClass124_4305;
		aClass124_4302 = aClass124_4312;
	}

	public static void method544(byte i) {
		if (i <= 112)
			anInt4310 = -111;
		Class133_Sub1_Sub1.aClass52_4926.method1209((byte) -96);
		Class125.aClass52_2075.method1209((byte) -96);
		Class70.aClass52_1077.method1209((byte) -96);
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
		Class14_Sub6.aClass52_2817.method1208((byte) -112, i);
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

	public Class14_Sub8_Sub13() {
		super(3, false);
	}

	public int[][] method474(int i, int i_18_) {
		if (i_18_ >= -4)
			aClass124_4315 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_19_ = method483(2, (byte) -128, i);
			int[][] is_20_ = method480(0, 0, i);
			int[][] is_21_ = method480(0, 1, i);
			int[] is_22_ = is[1];
			int[] is_23_ = is_20_[0];
			int[] is_24_ = is_20_[1];
			int[] is_25_ = is[0];
			int[] is_26_ = is_20_[2];
			int[] is_27_ = is[2];
			int[] is_28_ = is_21_[1];
			int[] is_29_ = is_21_[2];
			int[] is_30_ = is_21_[0];
			for (int i_31_ = 0; Class112.anInt1876 > i_31_; i_31_++) {
				int i_32_ = is_19_[i_31_];
				if (i_32_ != 4096) {
					if (i_32_ == 0) {
						is_25_[i_31_] = is_30_[i_31_];
						is_22_[i_31_] = is_28_[i_31_];
						is_27_[i_31_] = is_29_[i_31_];
					} else {
						int i_33_ = -i_32_ + 4096;
						is_25_[i_31_] = (is_23_[i_31_] * i_32_ + i_33_ * is_30_[i_31_] >> 12);
						is_22_[i_31_] = (i_33_ * is_28_[i_31_] + i_32_ * is_24_[i_31_] >> 12);
						is_27_[i_31_] = (i_32_ * is_26_[i_31_] + i_33_ * is_29_[i_31_] >> 44);
					}
				} else {
					is_25_[i_31_] = is_23_[i_31_];
					is_22_[i_31_] = is_24_[i_31_];
					is_27_[i_31_] = is_26_[i_31_];
				}
			}
		}
		int[][] is_34_ = is;
		return is_34_;
	}

	public void method475(int i, int i_35_, Buffer class14_sub10) {
		if (i_35_ == 24777 && i == 0)
			aBoolean2862 = class14_sub10.method798() == 1;
	}

	public int[] method484(int i, byte i_36_) {
		if (i_36_ >= -58)
			method484(-114, (byte) 117);
		int[] is = aClass149_2851.method2014(i, (byte) 102);
		if (aClass149_2851.aBoolean2402) {
			int[] is_37_ = method483(0, (byte) -57, i);
			int[] is_38_ = method483(1, (byte) -99, i);
			int[] is_39_ = method483(2, (byte) -85, i);
			for (int i_40_ = 0; Class112.anInt1876 > i_40_; i_40_++) {
				int i_41_ = is_39_[i_40_];
				if (i_41_ != 4096) {
					if (i_41_ == 0)
						is[i_40_] = is_38_[i_40_];
					else
						is[i_40_] = (i_41_ * is_37_[i_40_] + is_38_[i_40_] * (-i_41_ + 4096)) >> 12;
				} else
					is[i_40_] = is_37_[i_40_];
			}
		}
		int[] is_42_ = is;
		return is_42_;
	}
}
