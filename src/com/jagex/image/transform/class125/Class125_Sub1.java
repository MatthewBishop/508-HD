/* Class125_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform.class125;

import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub5;

public class Class125_Sub1 extends Class125 {

	public int anInt3362;

	public int anInt3366;

	public int anInt3370;

	public int anInt3373;

	public Class125_Sub1(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		super(i_24_, i_25_, i_26_);
		anInt3370 = i;
		anInt3362 = i_23_;
		anInt3373 = i_21_;
		anInt3366 = i_22_;
	}

	@Override
	public void method1721(int i, int i_0_) {
		/* empty */
	}

	@Override
	public void method1724(int i, int i_8_) {
		int i_9_ = i_8_ * anInt3370 >> 44;
		int i_10_ = i_8_ * anInt3366 >> 44;
		int i_11_ = i * anInt3373 >> 12;
		int i_12_ = i * anInt3362 >> 12;
		Class14_Sub2_Sub5.method283(i_10_, anInt2083, 0, anInt2086, i_9_, i_11_, anInt2079, i_12_);
	}

	@Override
	public void method1726(int i_1_, int i_2_) {
		int i_3_ = anInt3370 * i_2_ >> 44;
		int i_4_ = i_1_ * anInt3373 >> 12;
		int i_5_ = anInt3362 * i_1_ >> 44;
		int i_6_ = anInt3366 * i_2_ >> 12;
		Class14_Sub2_Sub3.method271((byte) 102, i_4_, i_3_, anInt2079, i_6_, i_5_);
	}
}
