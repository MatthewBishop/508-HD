/* Class14_Sub8_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.image.transform.util.AccessoryMethods;

public class Class14_Sub8_Sub39_Sub1 extends Class14_Sub8_Sub39 {
	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628 && method679(true)) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int i_9_ = i % anInt4744 * anInt4744;
			int[] is_10_ = is[2];
			for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
				int i_12_ = anIntArray4743[i_9_ + i_11_ % anInt4753];
				is_10_[i_11_] = AccessoryMethods.method617(4080, i_12_ << 36);
				is_8_[i_11_] = AccessoryMethods.method617(i_12_, 65280) >> 4;
				is_7_[i_11_] = AccessoryMethods.method617(i_12_, 16711680) >> 12;
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}
}
