/* Class14_Sub8_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub15 extends Class14_Sub8 {
	public int anInt4339 = 585;

	public Class14_Sub8_Sub15() {
		super(0, true);
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_12_ = i;
		if (i_12_ == 0)
			anInt4339 = class14_sub10.readUShort((byte) 115);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int i_14_ = TexStatic.anIntArray3623[i];
			for (int i_15_ = 0; TexStatic.anInt1876 > i_15_; i_15_++) {
				int i_16_ = TexStatic.anIntArray4145[i_15_];
				if (i_16_ > anInt4339 && i_16_ < -anInt4339 + 4096 && i_14_ > 2048 - anInt4339
						&& anInt4339 + 2048 > i_14_) {
					int i_17_ = -i_16_ + 2048;
					i_17_ = i_17_ >= 0 ? i_17_ : -i_17_;
					i_17_ <<= 12;
					i_17_ /= 2048 - anInt4339;
					is[i_15_] = -i_17_ + 4096;
				} else if (i_16_ > -anInt4339 + 2048 && anInt4339 + 2048 > i_16_) {
					int i_18_ = i_14_ - 2048;
					i_18_ = i_18_ >= 0 ? i_18_ : -i_18_;
					i_18_ -= anInt4339;
					i_18_ <<= 12;
					is[i_15_] = i_18_ / (-anInt4339 + 2048);
				} else if (i_14_ < anInt4339 || i_14_ > -anInt4339 + 4096) {
					int i_19_ = i_16_ - 2048;
					i_19_ = i_19_ >= 0 ? i_19_ : -i_19_;
					i_19_ -= anInt4339;
					i_19_ <<= 12;
					is[i_15_] = i_19_ / (-anInt4339 + 2048);
				} else if (i_16_ < anInt4339 || -anInt4339 + 4096 < i_16_) {
					int i_20_ = -i_14_ + 2048;
					i_20_ = i_20_ >= 0 ? i_20_ : -i_20_;
					i_20_ <<= 12;
					i_20_ /= -anInt4339 + 2048;
					is[i_15_] = 4096 - i_20_;
				} else
					is[i_15_] = 0;
			}
		}
		int[] is_21_ = is;
		return is_21_;
	}
}
