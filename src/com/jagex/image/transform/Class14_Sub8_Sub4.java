/* Class14_Sub8_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub4 extends Class14_Sub8 {
	public int anInt4140;

	public int anInt4144 = 4096;

	public int anInt4147 = 4096;

	public Class14_Sub8_Sub4() {
		super(1, false);
		anInt4140 = 4096;
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[][] is_6_ = method480(0, i);
			int[] is_7_ = is_6_[1];
			int[] is_8_ = is_6_[0];
			int[] is_9_ = is[0];
			int[] is_10_ = is[1];
			int[] is_11_ = is_6_[2];
			int[] is_12_ = is[2];
			for (int i_13_ = 0; TexStatic.anInt1876 > i_13_; i_13_++) {
				int i_14_ = is_8_[i_13_];
				int i_15_ = is_7_[i_13_];
				int i_16_ = is_11_[i_13_];
				if (i_16_ == i_14_ && i_15_ == i_16_) {
					is_9_[i_13_] = anInt4140 * i_14_ >> 12;
					is_10_[i_13_] = anInt4144 * i_16_ >> 44;
					is_12_[i_13_] = i_15_ * anInt4147 >> 44;
				} else {
					is_9_[i_13_] = anInt4140;
					is_10_[i_13_] = anInt4144;
					is_12_[i_13_] = anInt4147;
				}
			}
		}
		int[][] is_17_ = is;
		return is_17_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_19_ = i;
		while_201_: do {
			do {
				if (i_19_ != 0) {
					if (i_19_ != 1) {
						if (i_19_ == 2)
							break;
						break while_201_;
					}
				} else {
					anInt4140 = class14_sub10.readUShort((byte) 111);
					break while_201_;
				}
				anInt4144 = class14_sub10.readUShort((byte) 115);
				break while_201_;
			} while (false);
			anInt4147 = class14_sub10.readUShort((byte) 105);
		} while (false);
	}
}
