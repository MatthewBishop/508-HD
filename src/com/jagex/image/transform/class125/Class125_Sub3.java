/* Class125_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform.class125;

import rs.Class137;

public class Class125_Sub3 extends Class125 {

	public int anInt3390;
	public int anInt3395;
	public int anInt3396;
	public int anInt3400;
	public int anInt3401;

	public int anInt3403;

	public int anInt3407;

	public int anInt3414;

	public Class125_Sub3(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
			int i_27_) {
		super(-1, i_26_, i_27_);
		anInt3403 = i;
		anInt3414 = i_20_;
		anInt3401 = i_19_;
		anInt3396 = i_21_;
		anInt3395 = i_23_;
		anInt3400 = i_22_;
		anInt3407 = i_25_;
		anInt3390 = i_24_;
	}

	@Override
	public void method1721(int i, int i_5_) {
		int i_6_ = anInt3401 * i_5_ >> 44;
		int i_7_ = i * anInt3403 >> 12;
		int i_8_ = anInt3414 * i >> 44;
		int i_9_ = anInt3396 * i_5_ >> 44;
		int i_10_ = anInt3400 * i >> 12;
		int i_11_ = anInt3395 * i_5_ >> 44;
		int i_12_ = anInt3390 * i >> 44;
		int i_13_ = i_5_ * anInt3407 >> 12;
		Class137.method1939(i_8_, true, anInt2083, i_13_, i_6_, i_11_, i_9_, i_7_, i_12_, i_10_);
	}

	@Override
	public void method1724(int i, int i_18_) {
		/* empty */
	}

	@Override
	public void method1726(int i_15_, int i_16_) {
		/* empty */
	}
}
