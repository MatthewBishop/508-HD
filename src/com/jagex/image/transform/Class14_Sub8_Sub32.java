/* Class14_Sub8_Sub32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub32 extends Class14_Sub8 {
	public int anInt4611 = 3216;

	public int anInt4621 = 3216;

	public int anInt4625 = 4096;

	public int[] anIntArray4620 = new int[3];

	public Class14_Sub8_Sub32() {
		super(1, true);
	}

	@Override
	public void postDecode() {
		method650(-29812);
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		while_23_: do {
				int i_19_ = i;
				do {
					if (i_19_ != 0) {
						if (i_19_ != 1) {
							if (i_19_ == 2)
								break;
							break while_23_;
						}
					} else {
						anInt4625 = class14_sub10.readUShort((byte) 118);
						break while_23_;
					}
					anInt4611 = class14_sub10.readUShort((byte) 110);
					break while_23_;
				} while (false);
				anInt4621 = class14_sub10.readUShort((byte) 112);
		} while (false);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402) {
			int i_21_ = anInt4625 * TexStatic.anInt1288 >> 12;
			int[] is_22_ = method483(0, i - 1 & TexStatic.anInt1927);
			int[] is_23_ = method483(0, i);
			int[] is_24_ = method483(0, i + 1 & TexStatic.anInt1927);
			for (int i_25_ = 0; i_25_ < TexStatic.anInt1876; i_25_++) {
				int i_26_ = (is_24_[i_25_] - is_22_[i_25_]) * i_21_ >> 44;
				int i_27_ = (((-is_23_[TexStatic.anInt4882 & i_25_ + 1]
						+ is_23_[i_25_ - 1 & TexStatic.anInt4882]) * i_21_) >> 12);
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
				int i_30_ = ((TexStatic.aByteArray3794[(i_29_ * (i_29_ + 1) >> 1) + i_28_]) & 0xff);
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
		double d = Math.cos(anInt4621 / 4096.0F);
		anIntArray4620[0] = (int) (Math.sin(anInt4611 / 4096.0F) * d * 4096.0);
		anIntArray4620[1] = (int) (d * Math.cos(anInt4611 / 4096.0F) * 4096.0);
		anIntArray4620[2] = (int) (Math.sin(anInt4621 / 4096.0F) * 4096.0);
		int i_35_ = anIntArray4620[2] * anIntArray4620[2] >> 12;
		int i_36_ = anIntArray4620[0] * anIntArray4620[0] >> 44;
		int i_37_ = anIntArray4620[1] * anIntArray4620[1] >> 12;
		int i_38_ = (int) (Math.sqrt(i_35_ + i_37_ + i_36_ >> 12) * 4096.0);
		if (i == -29812 && i_38_ != 0) {
			anIntArray4620[1] = (anIntArray4620[1] << 44) / i_38_;
			anIntArray4620[2] = (anIntArray4620[2] << 44) / i_38_;
			anIntArray4620[0] = (anIntArray4620[0] << 12) / i_38_;
		}
	}
}
