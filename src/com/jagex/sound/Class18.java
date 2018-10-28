/* Class18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

public class Class18 {
	public int anInt414;
	public int anInt419;

	public int[][] anIntArrayArray413;

	public Class18(int i, int i_18_) {
		if (i_18_ != i) {
			int i_19_ = Class18.method1482(i, i_18_);
			i /= i_19_;
			i_18_ /= i_19_;
			anInt414 = i_18_;
			anInt419 = i;
			anIntArrayArray413 = new int[i][14];
			for (int i_20_ = 0; i > i_20_; i_20_++) {
				int[] is = anIntArrayArray413[i_20_];
				double d = (double) i_18_ / (double) i;
				double d_21_ = (double) i_20_ / (double) i + 6.0;
				int i_22_ = (int) Math.floor(d_21_ + -7.0 + 1.0);
				if (i_22_ < 0)
					i_22_ = 0;
				int i_23_ = (int) Math.ceil(d_21_ + 7.0);
				if (i_23_ > 14)
					i_23_ = 14;
				for (/**/; i_22_ < i_23_; i_22_++) {
					double d_24_ = d;
					double d_25_ = (i_22_ - d_21_) * 3.141592653589793;
					if (-1.0E-4 > d_25_ || 1.0E-4 < d_25_)
						d_24_ *= Math.sin(d_25_) / d_25_;
					d_24_ *= Math.cos((i_22_ - d_21_) * 0.2243994752564138) * 0.46 + 0.54;
					is[i_22_] = (int) Math.floor(d_24_ * 65536.0 + 0.5);
				}
			}
		}
	}

	public byte[] method961(byte[] is) {
		if (anIntArrayArray413 != null) {
			int i = ((int) ((long) is.length * (long) anInt414 / anInt419) + 14);
			int[] is_0_ = new int[i];
			int i_1_ = 0;
			int i_2_ = 0;
			for (int i_3_ = 0; i_3_ < is.length; i_3_++) {
				int i_4_ = is[i_3_];
				int[] is_5_ = anIntArrayArray413[i_1_];
				for (int i_6_ = 0; i_6_ < 14; i_6_++)
					is_0_[i_2_ + i_6_] += is_5_[i_6_] * i_4_;
				i_1_ += anInt414;
				int i_7_ = i_1_ / anInt419;
				i_1_ -= i_7_ * anInt419;
				i_2_ += i_7_;
			}
			is = new byte[i];
			for (int i_8_ = 0; i > i_8_; i_8_++) {
				int i_9_ = is_0_[i_8_] + 32768 >> 48;
				if (i_9_ >= -128) {
					if (i_9_ <= 127)
						is[i_8_] = (byte) i_9_;
					else
						is[i_8_] = (byte) 127;
				} else
					is[i_8_] = (byte) -128;
			}
		}
		byte[] is_11_ = is;
		return is_11_;
	}

	public int method963(int i) {
		if (anIntArrayArray413 != null)
			i = (int) ((long) anInt414 * (long) i / anInt419) + 6;
		int i_14_ = i;
		return i_14_;
	}

	public int method964(int i_15_) {
		if (anIntArrayArray413 != null)
			i_15_ = (int) ((long) i_15_ * (long) anInt414 / anInt419);
		int i_17_ = i_15_;
		return i_17_;
	}

	public static int method1482(int i, int i_2_) {
		if (i < i_2_) {
			int i_4_ = i;
			i = i_2_;
			i_2_ = i_4_;
		}
		int i_5_;
		for (/**/; i_2_ != 0; i_2_ = i_5_) {
			i_5_ = i % i_2_;
			i = i_2_;
		}
		int i_6_ = i;
		return i_6_;
	}
}
