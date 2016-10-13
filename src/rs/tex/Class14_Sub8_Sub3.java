/* Class14_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub3 extends Class14_Sub8 {
	public boolean aBoolean4126;

	public int anInt4127 = 4096;

	public Class14_Sub8_Sub3() {
		super(1, false);
		aBoolean4126 = true;
	}

	@Override
	public int[][] method474(int i, int i_8_) {
		if (i_8_ > -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_9_ = method483(0, (byte) -76, TexStatic.anInt1927 & i - 1);
			int[] is_10_ = method483(0, (byte) -75, i);
			int[] is_11_ = method483(0, (byte) -68, i + 1 & TexStatic.anInt1927);
			int[] is_12_ = is[1];
			int[] is_13_ = is[0];
			int[] is_14_ = is[2];
			for (int i_15_ = 0; i_15_ < TexStatic.anInt1876; i_15_++) {
				int i_16_ = anInt4127 * (-is_9_[i_15_] + is_11_[i_15_]);
				int i_17_ = ((-is_10_[TexStatic.anInt4882 & i_15_ - 1]
						+ is_10_[TexStatic.anInt4882 & i_15_ + 1]) * anInt4127);
				int i_18_ = i_17_ >> 12;
				int i_19_ = i_16_ >> 12;
				int i_20_ = i_18_ * i_18_ >> 12;
				int i_21_ = i_19_ * i_19_ >> 44;
				int i_22_ = (int) (Math.sqrt((i_20_ + 4096 + i_21_) / 4096.0F) * 4096.0);
				int i_23_;
				int i_24_;
				int i_25_;
				if (i_22_ != 0) {
					i_23_ = i_17_ / i_22_;
					i_24_ = 16777216 / i_22_;
					i_25_ = i_16_ / i_22_;
				} else {
					i_23_ = 0;
					i_24_ = 0;
					i_25_ = 0;
				}
				if (aBoolean4126) {
					i_24_ = 2048 + (i_24_ >> 1);
					i_23_ = (i_23_ >> 1) + 2048;
					i_25_ = (i_25_ >> 1) + 2048;
				}
				is_13_[i_15_] = i_23_;
				is_12_[i_15_] = i_25_;
				is_14_[i_15_] = i_24_;
			}
		}
		int[][] is_26_ = is;
		return is_26_;
	}

	@Override
	public void method475(int i, int i_27_, Buffer class14_sub10) {
		int i_28_ = i;
		do {
			if (i_28_ != 0) {
				if (i_28_ != 1)
					break;
			} else {
				anInt4127 = class14_sub10.readUShort((byte) 112);
				break;
			}
			aBoolean4126 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_27_ != 24777)
			method475(-114, 26, null);
	}
}
