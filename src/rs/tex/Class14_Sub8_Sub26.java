/* Class14_Sub8_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.JunkTex;

public class Class14_Sub8_Sub26 extends Class14_Sub8 {
	public Class14_Sub8_Sub26() {
		super(1, false);
	}

	@Override
	public int[][] method474(int i, int i_23_) {
		if (i_23_ > -4)
			JunkTex.anInt4527 = -124;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_24_ = method480(0, 0, i);
			int[] is_25_ = is_24_[0];
			int[] is_26_ = is_24_[2];
			int[] is_27_ = is[2];
			int[] is_28_ = is[1];
			int[] is_29_ = is_24_[1];
			int[] is_30_ = is[0];
			for (int i_31_ = 0; i_31_ < TexStatic.anInt1876; i_31_++) {
				is_30_[i_31_] = -is_25_[i_31_] + 4096;
				is_28_[i_31_] = 4096 - is_29_[i_31_];
				is_27_[i_31_] = -is_26_[i_31_] + 4096;
			}
		}
		int[][] is_32_ = is;
		return is_32_;
	}

	@Override
	public void method475(int i, int i_33_, Buffer class14_sub10) {
		if (i_33_ != 24777)
			JunkTex.aClass124_4529 = null;
		if (i == 0)
			aBoolean2862 = class14_sub10.readUByte() == 1;
	}

	@Override
	public int[] method484(int i, byte i_34_) {
		if (i_34_ > -58)
			JunkTex.anInt4527 = 105;
		int[] is = aClass149_2851.method2014(i, (byte) 118);
		if (aClass149_2851.aBoolean2402) {
			int[] is_35_ = method483(0, (byte) -81, i);
			for (int i_36_ = 0; TexStatic.anInt1876 > i_36_; i_36_++)
				is[i_36_] = -is_35_[i_36_] + 4096;
		}
		int[] is_37_ = is;
		return is_37_;
	}
}
