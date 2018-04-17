/* Class14_Sub8_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub16 extends Class14_Sub8 {
	private static int anInt4429 = 0;
	private static int anInt1083 = 0;

	public Class14_Sub8_Sub16() {
		super(1, false);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < TexStatic.anInt1876; i_20_++) {
				method564(-123, i_20_, i);
				int[][] is_21_ = method480(0, anInt4429);
				is_17_[i_20_] = is_21_[0][anInt1083];
				is_18_[i_20_] = is_21_[1][anInt1083];
				is_19_[i_20_] = is_21_[2][anInt1083];
			}
		}
		int[][] is_22_ = is;
		return is_22_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		if (i == 0)
			monoChromatic = class14_sub10.readUByte() == 1;
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.empty) {
			for (int i_25_ = 0; i_25_ < TexStatic.anInt1876; i_25_++) {
				method564(-101, i_25_, i);
				int[] is_26_ = getOutput(0, anInt4429);
				is[i_25_] = is_26_[anInt1083];
			}
		}
		int[] is_27_ = is;
		return is_27_;
	}

	public void method564(int i, int i_28_, int i_29_) {
		int i_31_ = TexStatic.anIntArray4145[i_28_];
		int i_32_ = TexStatic.anIntArray3623[i_29_];
		float f = (float) Math.atan2(i_31_ - 2048, i_32_ - 2048);
		if (!(f >= -3.141592653589793) || !(-2.356194490192345 >= f)) {
			if (!(-1.5707963267948966 >= f) || !(-2.356194490192345 <= f)) {
				if (!(f <= -0.7853981633974483) || !(-1.5707963267948966 <= f)) {
					if (f <= 0.0F && f >= -0.7853981633974483) {
						anInt1083 = i_28_;
						anInt4429 = TexStatic.anInt407 - i_29_;
					} else if (0.0F <= f && f <= 0.7853981633974483) {
						anInt4429 = TexStatic.anInt407 - i_29_;
						anInt1083 = -i_28_ + TexStatic.anInt1876;
					} else if (!(0.7853981633974483 <= f) || !(1.5707963267948966 >= f)) {
						if (!(f >= 1.5707963267948966) || !(f <= 2.356194490192345)) {
							if (2.356194490192345 <= f && f <= 3.141592653589793) {
								anInt1083 = TexStatic.anInt1876 - i_28_;
								anInt4429 = i_29_;
							}
						} else {
							anInt1083 = i_29_;
							anInt4429 = TexStatic.anInt407 - i_28_;
						}
					} else {
						anInt1083 = -i_29_ + TexStatic.anInt1876;
						anInt4429 = -i_28_ + TexStatic.anInt407;
					}
				} else {
					anInt4429 = i_28_;
					anInt1083 = -i_29_ + TexStatic.anInt1876;
				}
			} else {
				anInt4429 = i_28_;
				anInt1083 = i_29_;
			}
		} else {
			anInt1083 = i_28_;
			anInt4429 = i_29_;
		}
		anInt1083 &= TexStatic.anInt4882;
		anInt4429 &= TexStatic.anInt1927;
	}
}
