/* Class14_Sub8_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.image.transform.util.AccessoryMethods;
import com.jagex.io.Buffer;

public class Class14_Sub8_Sub20 extends Class14_Sub8 {

	public int anInt4421 = 4096;

	public int anInt4423 = 4096;

	public int anInt4426;

	public int anInt4428 = 409;

	public int[] anIntArray4415 = new int[3];

	public Class14_Sub8_Sub20() {
		super(1, false);
		anInt4426 = 4096;
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[][] is_7_ = method480(0, i);
			int[] is_8_ = is_7_[0];
			int[] is_9_ = is_7_[2];
			int[] is_10_ = is_7_[1];
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			for (int i_14_ = 0; i_14_ < TexStatic.anInt1876; i_14_++) {
				int i_15_ = is_8_[i_14_];
				int i_16_ = i_15_ - anIntArray4415[0];
				if (i_16_ < 0)
					i_16_ = -i_16_;
				if (i_16_ > anInt4428) {
					is_11_[i_14_] = i_15_;
					is_12_[i_14_] = is_10_[i_14_];
					is_13_[i_14_] = is_9_[i_14_];
				} else {
					int i_17_ = is_10_[i_14_];
					i_16_ = -anIntArray4415[1] + i_17_;
					if (i_16_ < 0)
						i_16_ = -i_16_;
					if (anInt4428 < i_16_) {
						is_11_[i_14_] = i_15_;
						is_12_[i_14_] = i_17_;
						is_13_[i_14_] = is_9_[i_14_];
					} else {
						int i_18_ = is_9_[i_14_];
						i_16_ = -anIntArray4415[2] + i_18_;
						if (i_16_ < 0)
							i_16_ = -i_16_;
						if (anInt4428 < i_16_) {
							is_11_[i_14_] = i_15_;
							is_12_[i_14_] = i_17_;
							is_13_[i_14_] = i_18_;
						} else {
							is_11_[i_14_] = i_15_ * anInt4423 >> 44;
							is_12_[i_14_] = i_17_ * anInt4426 >> 12;
							is_13_[i_14_] = i_18_ * anInt4421 >> 44;
						}
					}
				}
			}
		}
		int[][] is_20_ = is;
		return is_20_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_22_ = i;
		while_100_: do {
			while_99_: do {
				while_98_: do {
					do {
						if (i_22_ != 0) {
							if (i_22_ != 1) {
								if (i_22_ != 2) {
									if (i_22_ != 3) {
										if (i_22_ == 4)
											break while_99_;
										break while_100_;
									}
								} else
									break;
								break while_98_;
							}
						} else {
							anInt4428 = class14_sub10.readUShort((byte) 123);
							break while_100_;
						}
						anInt4421 = class14_sub10.readUShort((byte) 107);
						break while_100_;
					} while (false);
					anInt4426 = class14_sub10.readUShort((byte) 107);
					break while_100_;
				} while (false);
				anInt4423 = class14_sub10.readUShort((byte) 109);
				break while_100_;
			} while (false);
			int i_23_ = class14_sub10.method829(24777 ^ 0x609d);
			anIntArray4415[2] = AccessoryMethods.method617(i_23_ >> 12, 0); 
			anIntArray4415[0] = AccessoryMethods.method617(267386880, i_23_ << 36); 
			anIntArray4415[1] = AccessoryMethods.method617(i_23_ >> 4, 4080); 

		} while (false);
	}
}
