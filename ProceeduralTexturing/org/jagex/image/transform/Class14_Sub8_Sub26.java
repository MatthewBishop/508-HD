/* Class14_Sub8_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub26 extends Class14_Sub8 {
	public Class14_Sub8_Sub26() {
		super(1, false);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[][] is_24_ = method480(0, i);
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
	public void decode(int i, Buffer class14_sub10) {
		if (i == 0)
			monoChromatic = class14_sub10.readUByte() == 1;
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.empty) {
			int[] is_35_ = getOutput(0, i);
			for (int i_36_ = 0; TexStatic.anInt1876 > i_36_; i_36_++)
				is[i_36_] = -is_35_[i_36_] + 4096;
		}
		int[] is_37_ = is;
		return is_37_;
	}
}
