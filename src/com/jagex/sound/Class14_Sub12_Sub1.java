/* Class14_Sub12_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

public class Class14_Sub12_Sub1 extends Class14_Sub12 {
	public int anInt4895;
	public int anInt4896;
	public boolean aBoolean4897;
	public int anInt4898;
	public byte[] aByteArray4899;

	public Class14_Sub12_Sub1 method857(Class18 class18) {
		aByteArray4899 = class18.method961(aByteArray4899);
		anInt4895 = class18.method964(anInt4895);
		if (anInt4896 == anInt4898)
			anInt4896 = anInt4898 = class18.method963(anInt4896);
		else {
			anInt4896 = class18.method963(anInt4896);
			anInt4898 = class18.method963(anInt4898);
			if (anInt4896 == anInt4898)
				anInt4896--;
		}
		return this;
	}

	public Class14_Sub12_Sub1(int i, byte[] is, int i_0_, int i_1_) {
		anInt4895 = i;
		aByteArray4899 = is;
		anInt4896 = i_0_;
		anInt4898 = i_1_;
	}

	public Class14_Sub12_Sub1(int i, byte[] is, int i_2_, int i_3_, boolean bool) {
		anInt4895 = i;
		aByteArray4899 = is;
		anInt4896 = i_2_;
		anInt4898 = i_3_;
		aBoolean4897 = bool;
	}
}
