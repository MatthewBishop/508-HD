/* Class14_Sub8_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub23 extends Class14_Sub8 {

	public int anInt4479 = 4096;

	public Class14_Sub8_Sub23() {
		this(4096);
	}

	public Class14_Sub8_Sub23(int i) {
		super(0, true);
		anInt4479 = i;
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_44_ = i;
		if (i_44_ == 0)
			anInt4479 = (class14_sub10.readUByte() << 12) / 255;
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402)
			TexStatic.method1324(is, 0, TexStatic.anInt1876, anInt4479);
		int[] is_46_ = is;
		return is_46_;
	}
}
