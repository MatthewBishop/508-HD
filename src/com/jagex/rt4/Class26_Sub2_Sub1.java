/* Class26_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

public class Class26_Sub2_Sub1 extends Class26_Sub2 {
	public byte[] aByteArray4901;

	public byte[] method1033(int i, int i_0_, int i_1_) {
		aByteArray4901 = new byte[i * i_0_ * i_1_ * 2];
		method1020(i_0_, i_1_, i, 0);
		return aByteArray4901;
	}

	public Class26_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	public void method1031(int i, byte i_2_) {
		int i_3_ = i * 2;
		int i_4_ = i_2_ & 0xff;
		aByteArray4901[i_3_++] = (byte) (i_4_ * 3 >> 5);
		aByteArray4901[i_3_] = (byte) (i_4_ >> 2);
	}
}
