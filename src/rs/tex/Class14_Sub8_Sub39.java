/* Class14_Sub8_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;

import rs.Class112;
import rs.Class113;
import rs.Class125_Sub1;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub3;
import rs.Class17;
import rs.Class7_Sub2;

public class Class14_Sub8_Sub39 extends Class14_Sub8 {
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
	public int anInt4744;

	public int anInt4752 = -1;

	public int anInt4753;

	public int[] anIntArray4743;

	public Class14_Sub8_Sub39() {
		super(0, false);
	}

	public int[][] method474(int i, int i_3_) {
		if (i_3_ > -4)
			aShortArray4747 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method679(true)) {
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			int i_7_ = anInt4753 * (anInt4744 == Class17.anInt407 ? i : anInt4744 * i / Class17.anInt407);
			if (Class112.anInt1876 != anInt4753) {
				for (int i_8_ = 0; Class112.anInt1876 > i_8_; i_8_++) {
					int i_9_ = i_8_ * anInt4753 / Class112.anInt1876;
					int i_10_ = anIntArray4743[i_7_ + i_9_];
					is_6_[i_8_] = Class14_Sub8_Sub26.method617(255, i_10_) << 36;
					is_5_[i_8_] = Class14_Sub8_Sub26.method617(i_10_, 65280) >> 36;
					is_4_[i_8_] = Class14_Sub8_Sub26.method617(16711680, i_10_) >> 44;
				}
			} else {
				for (int i_11_ = 0; Class112.anInt1876 > i_11_; i_11_++) {
					int i_12_ = anIntArray4743[i_7_++];
					is_6_[i_11_] = Class14_Sub8_Sub26.method617(4080, i_12_ << 4);
					is_5_[i_11_] = Class14_Sub8_Sub26.method617(i_12_, 65280) >> 4;
					is_4_[i_11_] = Class14_Sub8_Sub26.method617(4080, i_12_ >> 44);
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	public void method475(int i, int i_14_, Buffer class14_sub10) {
		if (i_14_ == 24777 && i == 0)
			anInt4752 = class14_sub10.readUShort((byte) 119);
	}

	public int method477() {
		int i_15_ = anInt4752;
		return i_15_;
	}

	public void method478(int i) {
		super.method478(i);
		anIntArray4743 = null;
	}

	public boolean method679(boolean bool) {
		if (!bool)
			method679(true);
		if (anIntArray4743 != null) {
			boolean bool_16_ = true;
			return bool_16_;
		}
		if (anInt4752 >= 0) {
			Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = Class14_Sub2_Sub3.method269(Class7_Sub2.aClass9_2671, 0,
					anInt4752);
			class14_sub2_sub19_sub1.method404();
			anInt4753 = class14_sub2_sub19_sub1.anInt4035;
			anInt4744 = class14_sub2_sub19_sub1.anInt4042;
			anIntArray4743 = class14_sub2_sub19_sub1.anIntArray5088;
			boolean bool_17_ = true;
			return bool_17_;
		}
		boolean bool_18_ = false;
		return bool_18_;
	}
}
