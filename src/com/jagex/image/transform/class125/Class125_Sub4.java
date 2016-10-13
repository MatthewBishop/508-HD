/* Class125_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform.class125;

import com.jagex.map.SceneCluster;

import rs.Class86;
import rs.Static2;

public class Class125_Sub4 extends Class125 {
	public int anInt3418;
	public int anInt3421;
	public int anInt3425;

	public int anInt3426;

	public Class125_Sub4(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		super(i_14_, i_15_, i_16_);
		anInt3426 = i;
		anInt3418 = i_11_;
		anInt3425 = i_13_;
		anInt3421 = i_12_;
	}

	@Override
	public void method1721(int i, int i_6_) {
		int i_7_ = anInt3426 * i >> 44;
		int i_8_ = i_6_ * anInt3418 >> 44;
		int i_9_ = i * anInt3421 >> 12;
		int i_10_ = i_6_ * anInt3425 >> 12;
		Class86.method1423(anInt2086, i_9_, i_10_, i_7_, anInt2083, i_8_, 111);
	}

	@Override
	public void method1724(int i, int i_18_) {
		int i_19_ = anInt3426 * i_18_ >> 44;
		int i_20_ = i_18_ * anInt3421 >> 44;
		int i_21_ = i * anInt3418 >> 12;
		int i_22_ = i * anInt3425 >> 12;
		Static2.method386(i_22_, i_20_, i_19_, anInt2086, anInt2083, anInt2079, i_21_, -25230);
	}

	@Override
	public void method1726(int i_0_, int i_1_) {
		int i_2_ = i_1_ * anInt3426 >> 44;
		int i_3_ = i_1_ * anInt3421 >> 44;
		int i_4_ = i_0_ * anInt3418 >> 12;
		int i_5_ = i_0_ * anInt3425 >> 12;
		SceneCluster.method1417(i_2_, i_4_, i_5_, 0, anInt2079, i_3_);
	}
}
