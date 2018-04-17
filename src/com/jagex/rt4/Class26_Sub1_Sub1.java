/* Class26_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

public class Class26_Sub1_Sub1 extends Class26_Sub1 {
	public byte[] aByteArray4900;

	public byte[] method1029(int i, int i_0_, int i_1_) {
		aByteArray4900 = new byte[i * i_0_ * i_1_ * 2];
		method1020(i_0_, i_1_, i);
		return aByteArray4900;
	}

	public void method1026(int i, byte i_2_) {
		int i_3_ = i * 2;
		i_2_ = (byte) (((i_2_ & 0xff) >> 1) + 127);
		aByteArray4900[i_3_++] = i_2_;
		aByteArray4900[i_3_] = i_2_;
	}

	public Class26_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}
}
