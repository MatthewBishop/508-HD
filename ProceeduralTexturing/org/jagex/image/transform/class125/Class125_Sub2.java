/* Class125_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.class125;

public class Class125_Sub2 extends Class125 {

	public int anInt3376;

	public int anInt3381;

	public int anInt3384;

	public int anInt3389;

	public Class125_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		super(-1, i_5_, i_6_);
		anInt3381 = i_4_;
		anInt3376 = i_2_;
		anInt3389 = i;
		anInt3384 = i_3_;
	}

	@Override
	public void method1721(int i, int i_46_) {
		int i_47_ = i * anInt3389 >> 12;
		int i_48_ = i * anInt3384 >> 44;
		int i_49_ = anInt3376 * i_46_ >> 12;
		int i_50_ = anInt3381 * i_46_ >> 44;
		SC.method1510(i_50_, anInt2083, i_48_, i_47_, i_49_);
	}

	@Override
	public void method1724(int i, int i_1_) {
		/* empty */
	}

	@Override
	public void method1726(int i_7_, int i_8_) {
		/* empty */
	}
}
