/* Class14_Sub8_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.JunkTex;

public class Class14_Sub8_Sub30 extends Class14_Sub8 {
	public int anInt4591;

	public int anInt4593 = 4;

	public Class14_Sub8_Sub30() {
		super(1, false);
		anInt4591 = 4;
	}

	@Override
	public int[][] method474(int i, int i_10_) {
		if (i_10_ > -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int i_11_ = TexStatic.anInt407 / anInt4593;
			int i_12_ = TexStatic.anInt1876 / anInt4591;
			int[][] is_13_;
			if (i_11_ <= 0)
				is_13_ = method480(0, 0, 0);
			else {
				int i_14_ = i % i_11_;
				is_13_ = method480(0, 0, i_14_ * TexStatic.anInt407 / i_11_);
			}
			int[] is_15_ = is_13_[0];
			int[] is_16_ = is[0];
			int[] is_17_ = is_13_[1];
			int[] is_18_ = is_13_[2];
			int[] is_19_ = is[1];
			int[] is_20_ = is[2];
			for (int i_21_ = 0; i_21_ < TexStatic.anInt1876; i_21_++) {
				int i_22_;
				if (i_12_ > 0) {
					int i_23_ = i_21_ % i_12_;
					i_22_ = i_23_ * TexStatic.anInt1876 / i_12_;
				} else
					i_22_ = 0;
				is_16_[i_21_] = is_15_[i_22_];
				is_19_[i_21_] = is_17_[i_22_];
				is_20_[i_21_] = is_18_[i_22_];
			}
		}
		int[][] is_24_ = is;
		return is_24_;
	}

	@Override
	public void method475(int i, int i_25_, Buffer class14_sub10) {
		if (i_25_ != 24777)
			JunkTex.method637(null, -14, -32);
		int i_26_ = i;
		do {
			if (i_26_ != 0) {
				if (i_26_ != 1)
					break;
			} else {
				anInt4591 = class14_sub10.readUByte();
				break;
			}
			anInt4593 = class14_sub10.readUByte();
		} while (false);
	}

	@Override
	public int[] method484(int i, byte i_27_) {
		if (i_27_ >= -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_28_ = TexStatic.anInt407 / anInt4593;
			int i_29_ = TexStatic.anInt1876 / anInt4591;
			int[] is_30_;
			if (i_28_ <= 0)
				is_30_ = method483(0, (byte) -104, 0);
			else {
				int i_31_ = i % i_28_;
				is_30_ = method483(0, (byte) -91, i_31_ * TexStatic.anInt407 / i_28_);
			}
			for (int i_32_ = 0; i_32_ < TexStatic.anInt1876; i_32_++) {
				if (i_29_ > 0) {
					int i_33_ = i_32_ % i_29_;
					is[i_32_] = is_30_[i_33_ * TexStatic.anInt1876 / i_29_];
				} else
					is[i_32_] = is_30_[0];
			}
		}
		int[] is_34_ = is;
		return is_34_;
	}
}
