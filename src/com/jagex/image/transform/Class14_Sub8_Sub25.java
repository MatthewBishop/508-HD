/* Class14_Sub8_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub25 extends Class14_Sub8 {
	public int anInt4506;

	public int anInt4507 = 1;

	public Class14_Sub8_Sub25() {
		super(1, false);
		anInt4506 = 1;
	}

	@Override
	public int[][] method474(int i) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int i_18_ = anInt4506 + 1 + anInt4506;
			int i_19_ = 65536 / i_18_;
			int[][][] is_20_ = new int[i_18_][][];
			int i_21_ = anInt4507 + 1 + anInt4507;
			int i_22_ = 65536 / i_21_;
			for (int i_23_ = i - anInt4506; anInt4506 + i >= i_23_; i_23_++) {
				int[][] is_24_ = method480(0, i_23_ & TexStatic.anInt1927);
				int[][] is_25_ = new int[3][TexStatic.anInt1876];
				int i_26_ = 0;
				int i_27_ = 0;
				int i_28_ = 0;
				int[] is_29_ = is_24_[0];
				int[] is_30_ = is_24_[1];
				int[] is_31_ = is_24_[2];
				for (int i_32_ = -anInt4507; anInt4507 >= i_32_; i_32_++) {
					int i_33_ = TexStatic.anInt4882 & i_32_;
					i_28_ += is_30_[i_33_];
					i_27_ += is_29_[i_33_];
					i_26_ += is_31_[i_33_];
				}
				int[] is_34_ = is_25_[1];
				int[] is_35_ = is_25_[2];
				int[] is_36_ = is_25_[0];
				int i_37_ = 0;
				while (i_37_ < TexStatic.anInt1876) {
					is_36_[i_37_] = i_27_ * i_22_ >> 48;
					is_34_[i_37_] = i_28_ * i_22_ >> 48;
					is_35_[i_37_] = i_26_ * i_22_ >> 48;
					int i_38_ = TexStatic.anInt4882 & i_37_ - anInt4507;
					i_37_++;
					i_26_ -= is_31_[i_38_];
					i_28_ -= is_30_[i_38_];
					i_27_ -= is_29_[i_38_];
					i_38_ = anInt4507 + i_37_ & TexStatic.anInt4882;
					i_27_ += is_29_[i_38_];
					i_26_ += is_31_[i_38_];
					i_28_ += is_30_[i_38_];
				}
				is_20_[anInt4506 + i_23_ - i] = is_25_;
			}
			int[] is_39_ = is[0];
			int[] is_40_ = is[1];
			int[] is_41_ = is[2];
			for (int i_42_ = 0; i_42_ < TexStatic.anInt1876; i_42_++) {
				int i_43_ = 0;
				int i_44_ = 0;
				int i_45_ = 0;
				for (int i_46_ = 0; i_18_ > i_46_; i_46_++) {
					int[][] is_47_ = is_20_[i_46_];
					i_44_ += is_47_[1][i_42_];
					i_43_ += is_47_[0][i_42_];
					i_45_ += is_47_[2][i_42_];
				}
				is_39_[i_42_] = i_43_ * i_19_ >> 16;
				is_40_[i_42_] = i_19_ * i_44_ >> 16;
				is_41_[i_42_] = i_45_ * i_19_ >> 48;
			}
		}
		int[][] is_48_ = is;
		return is_48_;
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_50_ = i;
		while_107_: do {
			do {
				if (i_50_ != 0) {
					if (i_50_ != 1) {
						if (i_50_ == 2)
							break;
						break while_107_;
					}
				} else {
					anInt4507 = class14_sub10.readUByte();
					break while_107_;
				}
				anInt4506 = class14_sub10.readUByte();
				break while_107_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int i_52_ = anInt4506 + (anInt4506 + 1);
			int i_53_ = anInt4507 + anInt4507 + 1;
			int i_54_ = 65536 / i_53_;
			int[][] is_55_ = new int[i_52_][];
			int i_56_ = 65536 / i_52_;
			for (int i_57_ = -anInt4506 + i; i_57_ <= anInt4506 + i; i_57_++) {
				int[] is_58_ = method483(0, TexStatic.anInt1927 & i_57_);
				int i_59_ = 0;
				for (int i_60_ = -anInt4507; anInt4507 >= i_60_; i_60_++)
					i_59_ += is_58_[i_60_ & TexStatic.anInt4882];
				int[] is_61_ = new int[TexStatic.anInt1876];
				int i_62_ = 0;
				while (TexStatic.anInt1876 > i_62_) {
					is_61_[i_62_] = i_54_ * i_59_ >> 48;
					i_59_ -= is_58_[(TexStatic.anInt4882 & i_62_ - anInt4507)];
					i_62_++;
					i_59_ += is_58_[(i_62_ + anInt4507 & TexStatic.anInt4882)];
				}
				is_55_[-i + (anInt4506 + i_57_)] = is_61_;
			}
			for (int i_63_ = 0; i_63_ < TexStatic.anInt1876; i_63_++) {
				int i_64_ = 0;
				for (int i_65_ = 0; i_65_ < i_52_; i_65_++)
					i_64_ += is_55_[i_65_][i_63_];
				is[i_63_] = i_64_ * i_56_ >> 48;
			}
		}
		int[] is_66_ = is;
		return is_66_;
	}
}
