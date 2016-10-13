/* Class14_Sub8_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub5 extends Class14_Sub8 {

	public int anInt4154 = 4096;

	public int anInt4161 = 0;

	public Class14_Sub8_Sub5() {
		super(1, false);
	}

	@Override
	public int[][] method474(int i) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_40_ = method480(0, i);
			int[] is_41_ = is_40_[0];
			int[] is_42_ = is_40_[1];
			int[] is_43_ = is[0];
			int[] is_44_ = is[1];
			int[] is_45_ = is_40_[2];
			int[] is_46_ = is[2];
			for (int i_47_ = 0; TexStatic.anInt1876 > i_47_; i_47_++) {
				int i_48_ = is_41_[i_47_];
				int i_49_ = is_45_[i_47_];
				int i_50_ = is_42_[i_47_];
				if (i_48_ >= anInt4161) {
					if (i_48_ <= anInt4154)
						is_43_[i_47_] = i_48_;
					else
						is_43_[i_47_] = anInt4154;
				} else
					is_43_[i_47_] = anInt4161;
				if (i_50_ >= anInt4161) {
					if (i_50_ <= anInt4154)
						is_44_[i_47_] = i_50_;
					else
						is_44_[i_47_] = anInt4154;
				} else
					is_44_[i_47_] = anInt4161;
				if (anInt4161 > i_49_)
					is_46_[i_47_] = anInt4161;
				else if (i_49_ > anInt4154)
					is_46_[i_47_] = anInt4154;
				else
					is_46_[i_47_] = i_49_;
			}
		}
		int[][] is_51_ = is;
		return is_51_;
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_53_ = i;
		while_214_: do {
			do {
				if (i_53_ != 0) {
					if (i_53_ != 1) {
						if (i_53_ == 2)
							break;
						break while_214_;
					}
				} else {
					anInt4161 = class14_sub10.readUShort((byte) 104);
					break while_214_;
				}
				anInt4154 = class14_sub10.readUShort((byte) 103);
				break while_214_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int[] is_55_ = method483(0, i);
			for (int i_56_ = 0; TexStatic.anInt1876 > i_56_; i_56_++) {
				int i_57_ = is_55_[i_56_];
				if (anInt4161 <= i_57_) {
					if (i_57_ <= anInt4154)
						is[i_56_] = i_57_;
					else
						is[i_56_] = anInt4154;
				} else
					is[i_56_] = anInt4161;
			}
		}
		int[] is_58_ = is;
		return is_58_;
	}
}
