/* Class14_Sub8_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

public class Class14_Sub8_Sub31 extends Class14_Sub8 {
	public Class14_Sub8_Sub31() {
		super(1, true);
	}

	@Override
	public int[] method484(int i, byte i_14_) {
		if (i_14_ >= -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 103);
		if (aClass149_2851.aBoolean2402) {
			int[][] is_15_ = method480(0, 0, i);
			int[] is_16_ = is_15_[0];
			int[] is_17_ = is_15_[1];
			int[] is_18_ = is_15_[2];
			for (int i_19_ = 0; TexStatic.anInt1876 > i_19_; i_19_++)
				is[i_19_] = (is_18_[i_19_] + (is_16_[i_19_] + is_17_[i_19_])) / 3;
		}
		int[] is_20_ = is;
		return is_20_;
	}
}
