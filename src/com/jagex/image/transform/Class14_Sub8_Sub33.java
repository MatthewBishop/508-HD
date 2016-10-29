/* Class14_Sub8_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub33 extends Class14_Sub8 {

	public int anInt4637 = 4096;

	public Class14_Sub8_Sub33() {
		super(1, true);
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		if (i == 0)
			anInt4637 = class14_sub10.readUShort((byte) 113);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402) {
			int[] is_240_ = method483(0, i - 1 & TexStatic.anInt1927);
			int[] is_241_ = method483(0, i);
			int[] is_242_ = method483(0, TexStatic.anInt1927 & i + 1);
			for (int i_243_ = 0; TexStatic.anInt1876 > i_243_; i_243_++) {
				int i_244_ = (is_242_[i_243_] - is_240_[i_243_]) * anInt4637;
				int i_245_ = ((-is_241_[TexStatic.anInt4882 & i_243_ - 1]
						+ is_241_[TexStatic.anInt4882 & i_243_ + 1]) * anInt4637);
				int i_246_ = i_244_ >> 12;
				int i_247_ = i_245_ >> 12;
				int i_248_ = i_247_ * i_247_ >> 12;
				int i_249_ = i_246_ * i_246_ >> 12;
				int i_250_ = (int) (Math.sqrt((i_249_ + i_248_ + 4096) / 4096.0F) * 4096.0);
				int i_251_ = i_250_ == 0 ? 0 : 16777216 / i_250_;
				is[i_243_] = -i_251_ + 4096;
			}
		}
		int[] is_252_ = is;
		return is_252_;
	}
}
