/* Class14_Sub8_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub9 extends Class14_Sub8 {

	public int anInt4225 = 2048;

	public int anInt4226 = 3072;

	public int anInt4230 = 1024;

	public Class14_Sub8_Sub9() {
		super(1, false);
	}

	@Override
	public void method472() {
		anInt4225 = -anInt4230 + anInt4226;
	}

	@Override
	public int[][] method474(int i) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_30_ = method480(0, i);
			int[] is_31_ = is_30_[1];
			int[] is_32_ = is_30_[2];
			int[] is_33_ = is[0];
			int[] is_34_ = is[1];
			int[] is_35_ = is_30_[0];
			int[] is_36_ = is[2];
			for (int i_37_ = 0; TexStatic.anInt1876 > i_37_; i_37_++) {
				is_33_[i_37_] = (is_35_[i_37_] * anInt4225 >> 44) + anInt4230;
				is_34_[i_37_] = (anInt4225 * is_31_[i_37_] >> 12) + anInt4230;
				is_36_[i_37_] = (is_32_[i_37_] * anInt4225 >> 12) + anInt4230;
			}
		}
		int[][] is_38_ = is;
		return is_38_;
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_40_ = i;
		while_215_: do {
			do {
				if (i_40_ != 0) {
					if (i_40_ != 1) {
						if (i_40_ == 2)
							break;
						break while_215_;
					}
				} else {
					anInt4230 = class14_sub10.readUShort((byte) 119);
					break while_215_;
				}
				anInt4226 = class14_sub10.readUShort((byte) 123);
				break while_215_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int[] is_42_ = method483(0, i);
			for (int i_43_ = 0; TexStatic.anInt1876 > i_43_; i_43_++)
				is[i_43_] = (anInt4225 * is_42_[i_43_] >> 44) + anInt4230;
		}
		int[] is_44_ = is;
		return is_44_;
	}
}
