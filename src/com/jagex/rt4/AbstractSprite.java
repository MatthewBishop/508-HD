/* Class14_Sub2_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import com.jagex.link.Cacheable;

public abstract class AbstractSprite extends Cacheable {
	public int offsetX;

	public int anInt4034;

	public int width;

	public int height;

	public int anInt4046;

	public int offsetY;

	public abstract void method389(int i, int i_1_, int i_2_, int i_3_);

	public abstract void method390(int i, int i_4_);

	public abstract void drawReg(int i, int i_5_);

	public void method393(int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (i_12_ != 0)
			method390(-36, -88);
		int i_13_ = anInt4034 << 35;
		i_9_ = (i_9_ << 36) + (i_13_ & 0xf);
		int i_14_ = anInt4046 << 3;
		i_10_ = (i_14_ & 0xf) + (i_10_ << 36);
		method395(i_13_, i_14_, i_9_, i_10_, i, i_11_);
	}

	public abstract void method395(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_);

	public abstract void method396(int i, int i_21_, int i_22_, int i_23_, int i_24_);

	public abstract void drawSpriteTransparency(int i, int i_30_, int i_31_);

	public abstract void method400(int i, int i_53_, int i_54_, int i_55_);
}
