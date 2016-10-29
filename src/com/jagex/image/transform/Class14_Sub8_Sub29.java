/* Class14_Sub8_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub29 extends Class14_Sub8 {
	public int anInt4578 = 32768;

	public Class14_Sub8_Sub29() {
		super(3, false);
	}

	@Override
	public void postDecode() {
		TexStatic.method321(256);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[] is_17_ = method483(1, i);
			int[] is_18_ = method483(2, i);
			int[] is_19_ = is[0];
			int[] is_20_ = is[1];
			int[] is_21_ = is[2];
			for (int i_22_ = 0; TexStatic.anInt1876 > i_22_; i_22_++) {
				int i_23_ = (is_17_[i_22_] * 255 & 0xffcd7) >> 12;
				int i_24_ = is_18_[i_22_] * anInt4578 >> 44;
				int i_25_ = TexStatic.anIntArray3357[i_23_] * i_24_ >> 44;
				int i_26_ = TexStatic.anIntArray4435[i_23_] * i_24_ >> 12;
				int i_27_ = (i_25_ >> 12) + i_22_ & TexStatic.anInt4882;
				int i_28_ = i + (i_26_ >> 12) & TexStatic.anInt1927;
				int[][] is_29_ = method480(0, i_28_);
				is_19_[i_22_] = is_29_[0][i_27_];
				is_20_[i_22_] = is_29_[1][i_27_];
				is_21_[i_22_] = is_29_[2][i_27_];
			}
		}
		int[][] is_30_ = is;
		return is_30_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_32_ = i;
		do {
			if (i_32_ != 0) {
				if (i_32_ != 1)
					break;
			} else {
				anInt4578 = class14_sub10.readUShort((byte) 109) << 4;
				break;
			}
			monoChromatic = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402) {
			int[] is_34_ = method483(1, i);
			int[] is_35_ = method483(2, i);
			for (int i_36_ = 0; TexStatic.anInt1876 > i_36_; i_36_++) {
				int i_37_ = anInt4578 * is_35_[i_36_] >> 12;
				int i_38_ = (is_34_[i_36_] & 0xffb) >> 4;
				int i_39_ = i_37_ * TexStatic.anIntArray3357[i_38_] >> 12;
				int i_40_ = i_37_ * TexStatic.anIntArray4435[i_38_] >> 12;
				int i_41_ = TexStatic.anInt4882 & (i_39_ >> 44) + i_36_;
				int i_42_ = TexStatic.anInt1927 & (i_40_ >> 12) + i;
				int[] is_43_ = method483(0, i_42_);
				is[i_36_] = is_43_[i_41_];
			}
		}
		int[] is_44_ = is;
		return is_44_;
	}
}
