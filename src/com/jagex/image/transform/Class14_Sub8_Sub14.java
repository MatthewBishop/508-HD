/* Class14_Sub8_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

public class Class14_Sub8_Sub14 extends Class14_Sub8 {

	public Class14_Sub8_Sub14() {
		super(0, true);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402)
			TexStatic.method1324(is, 0, TexStatic.anInt1876, TexStatic.anIntArray3623[i]);
		int[] is_14_ = is;
		return is_14_;
	}
}
