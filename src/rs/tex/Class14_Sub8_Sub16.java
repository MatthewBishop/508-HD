/* Class14_Sub8_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.JunkTex;
import rs.Static2;

public class Class14_Sub8_Sub16 extends Class14_Sub8 {
	public Class14_Sub8_Sub16() {
		super(1, false);
	}

	@Override
	public int[][] method474(int i, int i_16_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (i_16_ >= -4)
			JunkTex.method559(126, 39, -72, -98, 74, 115);
		if (aClass95_2838.aBoolean1628) {
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < TexStatic.anInt1876; i_20_++) {
				method564(-123, i_20_, i);
				int[][] is_21_ = method480(0, 0, JunkTex.anInt4429);
				is_17_[i_20_] = is_21_[0][Static2.anInt1083];
				is_18_[i_20_] = is_21_[1][Static2.anInt1083];
				is_19_[i_20_] = is_21_[2][Static2.anInt1083];
			}
		}
		int[][] is_22_ = is;
		return is_22_;
	}

	@Override
	public void method475(int i, int i_23_, Buffer class14_sub10) {
		if (i == 0)
			aBoolean2862 = class14_sub10.readUByte() == 1;
		if (i_23_ != 24777)
			JunkTex.anInt4356 = 42;
	}

	@Override
	public int[] method484(int i, byte i_24_) {
		if (i_24_ >= -58)
			JunkTex.aClass14_Sub2_Sub9_4354 = null;
		int[] is = aClass149_2851.method2014(i, (byte) 117);
		if (aClass149_2851.aBoolean2402) {
			for (int i_25_ = 0; i_25_ < TexStatic.anInt1876; i_25_++) {
				method564(-101, i_25_, i);
				int[] is_26_ = method483(0, (byte) -59, JunkTex.anInt4429);
				is[i_25_] = is_26_[Static2.anInt1083];
			}
		}
		int[] is_27_ = is;
		return is_27_;
	}

	public void method564(int i, int i_28_, int i_29_) {
		int i_30_ = -22 / ((i + 37) / 61);
		int i_31_ = TexStatic.anIntArray4145[i_28_];
		int i_32_ = TexStatic.anIntArray3623[i_29_];
		float f = (float) Math.atan2(i_31_ - 2048, i_32_ - 2048);
		if (!(f >= -3.141592653589793) || !(-2.356194490192345 >= f)) {
			if (!(-1.5707963267948966 >= f) || !(-2.356194490192345 <= f)) {
				if (!(f <= -0.7853981633974483) || !(-1.5707963267948966 <= f)) {
					if (f <= 0.0F && f >= -0.7853981633974483) {
						Static2.anInt1083 = i_28_;
						JunkTex.anInt4429 = TexStatic.anInt407 - i_29_;
					} else if (0.0F <= f && f <= 0.7853981633974483) {
						JunkTex.anInt4429 = TexStatic.anInt407 - i_29_;
						Static2.anInt1083 = -i_28_ + TexStatic.anInt1876;
					} else if (!(0.7853981633974483 <= f) || !(1.5707963267948966 >= f)) {
						if (!(f >= 1.5707963267948966) || !(f <= 2.356194490192345)) {
							if (2.356194490192345 <= f && f <= 3.141592653589793) {
								Static2.anInt1083 = TexStatic.anInt1876 - i_28_;
								JunkTex.anInt4429 = i_29_;
							}
						} else {
							Static2.anInt1083 = i_29_;
							JunkTex.anInt4429 = TexStatic.anInt407 - i_28_;
						}
					} else {
						Static2.anInt1083 = -i_29_ + TexStatic.anInt1876;
						JunkTex.anInt4429 = -i_28_ + TexStatic.anInt407;
					}
				} else {
					JunkTex.anInt4429 = i_28_;
					Static2.anInt1083 = -i_29_ + TexStatic.anInt1876;
				}
			} else {
				JunkTex.anInt4429 = i_28_;
				Static2.anInt1083 = i_29_;
			}
		} else {
			Static2.anInt1083 = i_28_;
			JunkTex.anInt4429 = i_29_;
		}
		Static2.anInt1083 &= TexStatic.anInt4882;
		JunkTex.anInt4429 &= TexStatic.anInt1927;
	}
}
