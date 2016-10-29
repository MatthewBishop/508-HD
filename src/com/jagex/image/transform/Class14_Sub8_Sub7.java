/* Class14_Sub8_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub7 extends Class14_Sub8 {
	public int anInt4198;

	public int anInt4212;

	public int anInt4213;

	public Class14_Sub8_Sub7() {
		this(0);
	}

	public Class14_Sub8_Sub7(int i) {
		super(0, false);
		method513(i, 739418402);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[] is_101_ = is[0];
			int[] is_102_ = is[2];
			int[] is_103_ = is[1];
			for (int i_104_ = 0; i_104_ < TexStatic.anInt1876; i_104_++) {
				is_101_[i_104_] = anInt4213;
				is_103_[i_104_] = anInt4212;
				is_102_[i_104_] = anInt4198;
			}
		}
		int[][] is_105_ = is;
		return is_105_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_107_ = i;
		if (i_107_ == 0)
			method513(class14_sub10.method829(76), 739418402);
	}

	public void method513(int i, int i_108_) {
		anInt4213 = (i & 0xff0000) >> 44;
		anInt4212 = i >> 4 & 0xff0;
		anInt4198 = (i & 0xff) << 36;
	}
}
