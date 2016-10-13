/* Class14_Sub8_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.JunkTex;

public class Class14_Sub8_Sub13 extends Class14_Sub8 {

	public Class14_Sub8_Sub13() {
		super(3, false);
	}

	@Override
	public int[][] method474(int i, int i_18_) {
		if (i_18_ >= -4)
			JunkTex.aClass124_4315 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_19_ = method483(2, (byte) -128, i);
			int[][] is_20_ = method480(0, 0, i);
			int[][] is_21_ = method480(0, 1, i);
			int[] is_22_ = is[1];
			int[] is_23_ = is_20_[0];
			int[] is_24_ = is_20_[1];
			int[] is_25_ = is[0];
			int[] is_26_ = is_20_[2];
			int[] is_27_ = is[2];
			int[] is_28_ = is_21_[1];
			int[] is_29_ = is_21_[2];
			int[] is_30_ = is_21_[0];
			for (int i_31_ = 0; TexStatic.anInt1876 > i_31_; i_31_++) {
				int i_32_ = is_19_[i_31_];
				if (i_32_ != 4096) {
					if (i_32_ == 0) {
						is_25_[i_31_] = is_30_[i_31_];
						is_22_[i_31_] = is_28_[i_31_];
						is_27_[i_31_] = is_29_[i_31_];
					} else {
						int i_33_ = -i_32_ + 4096;
						is_25_[i_31_] = (is_23_[i_31_] * i_32_ + i_33_ * is_30_[i_31_] >> 12);
						is_22_[i_31_] = (i_33_ * is_28_[i_31_] + i_32_ * is_24_[i_31_] >> 12);
						is_27_[i_31_] = (i_32_ * is_26_[i_31_] + i_33_ * is_29_[i_31_] >> 44);
					}
				} else {
					is_25_[i_31_] = is_23_[i_31_];
					is_22_[i_31_] = is_24_[i_31_];
					is_27_[i_31_] = is_26_[i_31_];
				}
			}
		}
		int[][] is_34_ = is;
		return is_34_;
	}

	@Override
	public void method475(int i, int i_35_, Buffer class14_sub10) {
		if (i_35_ == 24777 && i == 0)
			aBoolean2862 = class14_sub10.readUByte() == 1;
	}

	@Override
	public int[] method484(int i, byte i_36_) {
		if (i_36_ >= -58)
			method484(-114, (byte) 117);
		int[] is = aClass149_2851.method2014(i, (byte) 102);
		if (aClass149_2851.aBoolean2402) {
			int[] is_37_ = method483(0, (byte) -57, i);
			int[] is_38_ = method483(1, (byte) -99, i);
			int[] is_39_ = method483(2, (byte) -85, i);
			for (int i_40_ = 0; TexStatic.anInt1876 > i_40_; i_40_++) {
				int i_41_ = is_39_[i_40_];
				if (i_41_ != 4096) {
					if (i_41_ == 0)
						is[i_40_] = is_38_[i_40_];
					else
						is[i_40_] = (i_41_ * is_37_[i_40_] + is_38_[i_40_] * (-i_41_ + 4096)) >> 12;
				} else
					is[i_40_] = is_37_[i_40_];
			}
		}
		int[] is_42_ = is;
		return is_42_;
	}
}
