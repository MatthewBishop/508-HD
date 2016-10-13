/* Class14_Sub8_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class72;
import rs.JunkTex;

public class Class14_Sub8_Sub27 extends Class14_Sub8 {

	public boolean aBoolean4540 = true;

	public boolean aBoolean4543 = true;

	public Class14_Sub8_Sub27() {
		super(1, false);
	}

	@Override
	public int[][] method474(int i, int i_3_) {
		if (i_3_ > -4)
			method484(80, (byte) 47);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_4_ = method480(0, 0, aBoolean4540 ? -i + TexStatic.anInt1927 : i);
			int[] is_5_ = is_4_[1];
			int[] is_6_ = is_4_[0];
			int[] is_7_ = is_4_[2];
			int[] is_8_ = is[1];
			int[] is_9_ = is[0];
			int[] is_10_ = is[2];
			if (aBoolean4543) {
				for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
					is_9_[i_11_] = is_6_[TexStatic.anInt4882 - i_11_];
					is_8_[i_11_] = is_5_[TexStatic.anInt4882 - i_11_];
					is_10_[i_11_] = is_7_[TexStatic.anInt4882 - i_11_];
				}
			} else {
				for (int i_12_ = 0; i_12_ < TexStatic.anInt1876; i_12_++) {
					is_9_[i_12_] = is_6_[i_12_];
					is_8_[i_12_] = is_5_[i_12_];
					is_10_[i_12_] = is_7_[i_12_];
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	@Override
	public void method475(int i, int i_14_, Buffer class14_sub10) {
		int i_15_ = i;
		while_97_: do {
			do {
				if (i_15_ != 0) {
					if (i_15_ != 1) {
						if (i_15_ == 2)
							break;
						break while_97_;
					}
				} else {
					aBoolean4543 = class14_sub10.readUByte() == 1;
					break while_97_;
				}
				aBoolean4540 = class14_sub10.readUByte() == 1;
				break while_97_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_14_ != 24777)
			JunkTex.aClass124_4552 = null;
	}

	@Override
	public int[] method484(int i, byte i_16_) {
		if (i_16_ > -58)
			aBoolean4543 = false;
		int[] is = aClass149_2851.method2014(i, (byte) 114);
		if (aClass149_2851.aBoolean2402) {
			int[] is_17_ = method483(0, (byte) -124, !aBoolean4540 ? i : -i + TexStatic.anInt1927);
			if (aBoolean4543) {
				for (int i_18_ = 0; TexStatic.anInt1876 > i_18_; i_18_++)
					is[i_18_] = is_17_[TexStatic.anInt4882 - i_18_];
			} else
				Class72.method1325(is_17_, 0, is, 0, TexStatic.anInt1876);
		}
		int[] is_19_ = is;
		return is_19_;
	}
}
