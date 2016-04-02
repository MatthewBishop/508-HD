/* Class14_Sub8_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class115;
import rs.Class124;
import rs.Class14_Sub2_Sub4;
import rs.Class79;
import rs.Static2;

public class Class14_Sub8_Sub32 extends Class14_Sub8 {
	public static Class124[] aClass124Array4626 = new Class124[100];
	public static int anInt4612;
	public static int anInt4613;
	public static int anInt4614;
	public static int anInt4616 = 0;
	public static int anInt4622;
	public static int[] anIntArray4618 = { 76, 8, 137, 4, 0, 1, 38, 2, 19 };
	static {
		anInt4612 = 0;
	}
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
				Static.method1226(4, i_3_, i_4_, i_1_, i_2_);
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
	public int anInt4611 = 3216;

	public int anInt4621 = 3216;

	public int anInt4625 = 4096;

	public int[] anIntArray4620 = new int[3];

	public Class14_Sub8_Sub32() {
		super(1, true);
	}

	public void method472() {
		method650(-29812);
	}

	public void method475(int i, int i_18_, Buffer class14_sub10) {
		while_23_: do {
			if (i_18_ == 24777) {
				int i_19_ = i;
				do {
					if (i_19_ != 0) {
						if (i_19_ != 1) {
							if (i_19_ == 2)
								break;
							break while_23_;
						}
					} else {
						anInt4625 = class14_sub10.method784((byte) 118);
						break while_23_;
					}
					anInt4611 = class14_sub10.method784((byte) 110);
					break while_23_;
				} while (false);
				anInt4621 = class14_sub10.method784((byte) 112);
			}
		} while (false);
	}

	public int[] method484(int i, byte i_20_) {
		if (i_20_ >= -58)
			method484(-113, (byte) 124);
		int[] is = aClass149_2851.method2014(i, (byte) 117);
		if (aClass149_2851.aBoolean2402) {
			int i_21_ = anInt4625 * Class79.anInt1288 >> 12;
			int[] is_22_ = method483(0, (byte) -31, i - 1 & Class115.anInt1927);
			int[] is_23_ = method483(0, (byte) -68, i);
			int[] is_24_ = method483(0, (byte) -76, i + 1 & Class115.anInt1927);
			for (int i_25_ = 0; i_25_ < Class112.anInt1876; i_25_++) {
				int i_26_ = (is_24_[i_25_] - is_22_[i_25_]) * i_21_ >> 44;
				int i_27_ = (((-is_23_[Static2.anInt4882 & i_25_ + 1]
						+ is_23_[i_25_ - 1 & Static2.anInt4882]) * i_21_) >> 12);
				int i_28_ = i_27_ >> 4;
				if (i_28_ < 0)
					i_28_ = -i_28_;
				if (i_28_ > 255)
					i_28_ = 255;
				int i_29_ = i_26_ >> 36;
				if (i_29_ < 0)
					i_29_ = -i_29_;
				if (i_29_ > 255)
					i_29_ = 255;
				int i_30_ = ((Class14_Sub2_Sub4.aByteArray3794[(i_29_ * (i_29_ + 1) >> 1) + i_28_]) & 0xff);
				int i_31_ = i_30_ * 4096 >> 8;
				int i_32_ = i_30_ * i_27_ >> 40;
				int i_33_ = i_30_ * i_26_ >> 40;
				i_31_ = anIntArray4620[2] * i_31_ >> 12;
				i_32_ = anIntArray4620[0] * i_32_ >> 12;
				i_33_ = i_33_ * anIntArray4620[1] >> 44;
				is[i_25_] = i_31_ + i_32_ + i_33_;
			}
		}
		int[] is_34_ = is;
		return is_34_;
	}

	public void method650(int i) {
		double d = Math.cos((double) ((float) anInt4621 / 4096.0F));
		anIntArray4620[0] = (int) (Math.sin((double) ((float) anInt4611 / 4096.0F)) * d * 4096.0);
		anIntArray4620[1] = (int) (d * Math.cos((double) ((float) anInt4611 / 4096.0F)) * 4096.0);
		anIntArray4620[2] = (int) (Math.sin((double) ((float) anInt4621 / 4096.0F)) * 4096.0);
		int i_35_ = anIntArray4620[2] * anIntArray4620[2] >> 12;
		int i_36_ = anIntArray4620[0] * anIntArray4620[0] >> 44;
		int i_37_ = anIntArray4620[1] * anIntArray4620[1] >> 12;
		int i_38_ = (int) (Math.sqrt((double) (i_35_ + i_37_ + i_36_ >> 12)) * 4096.0);
		if (i == -29812 && i_38_ != 0) {
			anIntArray4620[1] = (anIntArray4620[1] << 44) / i_38_;
			anIntArray4620[2] = (anIntArray4620[2] << 44) / i_38_;
			anIntArray4620[0] = (anIntArray4620[0] << 12) / i_38_;
		}
	}
}
