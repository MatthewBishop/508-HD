/* Class14_Sub8_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

import rs.Class72;

public class Class14_Sub8_Sub27 extends Class14_Sub8 {

	public boolean aBoolean4540 = true;

	public boolean aBoolean4543 = true;

	public Class14_Sub8_Sub27() {
		super(1, false);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[][] is_4_ = method480(0, aBoolean4540 ? -i + TexStatic.anInt1927 : i);
			int[] is_5_ = is_4_[1];
			int[] is_6_ = is_4_[0];
			int[] is_7_ = is_4_[2];
			int[] is_8_ = is[1];
			int[] is_9_ = is[0];
			int[] is_10_ = is[2];
			if (aBoolean4543) {
				for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
					is_9_[i_11_] = is_6_[TexStatic.anInt4882 - i_11_];
					is_8_[i_11_] = is_5_[TexStatic.anInt4882 - i_11_];
					is_10_[i_11_] = is_7_[TexStatic.anInt4882 - i_11_];
				}
			} else {
				for (int i_12_ = 0; i_12_ < TexStatic.anInt1876; i_12_++) {
					is_9_[i_12_] = is_6_[i_12_];
					is_8_[i_12_] = is_5_[i_12_];
					is_10_[i_12_] = is_7_[i_12_];
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_15_ = i;
		while_97_: do {
			do {
				if (i_15_ != 0) {
					if (i_15_ != 1) {
						if (i_15_ == 2)
							break;
						break while_97_;
					}
				} else {
					aBoolean4543 = class14_sub10.readUByte() == 1;
					break while_97_;
				}
				aBoolean4540 = class14_sub10.readUByte() == 1;
				break while_97_;
			} while (false);
			monoChromatic = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402) {
			int[] is_17_ = method483(0, !aBoolean4540 ? i : -i + TexStatic.anInt1927);
			if (aBoolean4543) {
				for (int i_18_ = 0; TexStatic.anInt1876 > i_18_; i_18_++)
					is[i_18_] = is_17_[TexStatic.anInt4882 - i_18_];
			} else
				Class72.method1325(is_17_, 0, is, 0, TexStatic.anInt1876);
		}
		int[] is_19_ = is;
		return is_19_;
	}
}
