/* Class14_Sub8_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import rs.JunkTex;

public class Class14_Sub8_Sub11 extends Class14_Sub8 {


	public Class14_Sub8_Sub11() {
		super(0, true);
	}

	@Override
	public int[] method484(int i, byte i_9_) {
		if (i_9_ >= -58)
			JunkTex.method532(48);
		int[] is = aClass149_2851.method2014(i, (byte) 107);
		if (aClass149_2851.aBoolean2402) {
			int i_10_ = TexStatic.anIntArray3623[i];
			for (int i_11_ = 0; i_11_ < TexStatic.anInt1876; i_11_++)
				is[i_11_] = (method534(i_10_, (byte) 12, TexStatic.anIntArray4145[i_11_]) % 4096);
		}
		int[] is_12_ = is;
		return is_12_;
	}

	public int method534(int i, byte i_13_, int i_14_) {
		int i_15_ = i_14_ + i * 57;
		if (i_13_ < 6)
			JunkTex.aClass124_4265 = null;
		i_15_ = i_15_ << 1 ^ i_15_;
		int i_16_ = 4096 - (i_15_ * (i_15_ * i_15_ * 15731 + 789221) + 1376312589 & 0x7fffffff) / 262144;
		return i_16_;
	}
}
