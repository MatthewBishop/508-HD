/* Class125_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.class125;

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
		method1939(i_8_, anInt2083, i_13_, i_6_, i_11_, i_9_, i_7_, i_12_, i_10_);
	}

	public static void method1939(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_,
			int i_7_) {
		if (SC.anInt1982 > i_5_ || i_5_ > SC.anInt4327 || SC.anInt1982 > i
				|| SC.anInt4327 < i || i_7_ < SC.anInt1982 || i_7_ > SC.anInt4327
				|| i_6_ < SC.anInt1982 || i_6_ > SC.anInt4327 || i_2_ < SC.anInt3005
				|| i_2_ > SC.anInt955 || i_4_ < SC.anInt3005 || i_4_ > SC.anInt955
				|| i_3_ < SC.anInt3005 || SC.anInt955 < i_3_ || SC.anInt3005 > i_1_
				|| SC.anInt955 < i_1_)
			method1557(i_2_, i_0_, i, i_4_, i_3_, i_5_, i_7_, i_6_, i_1_);
		else
			method1159(i_1_, i_0_, i_6_, i, -13755, i_2_, i_5_, i_7_, i_4_, i_3_);
	}
	
	
	public static void method1557(int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			int i_8_) {
		if (i_2_ == i_5_ && i_0_ == i_3_ && i_7_ == i_6_ && i_4_ == i_8_)
			SC.method1510(i_8_, i_1_, i_7_, i_5_, i_0_);
		else {
			int i_9_ = i_5_;
			int i_10_ = i_0_;
			int i_11_ = i_2_ * 3;
			int i_12_ = i_0_ * 3;
			int i_13_ = i_5_ * 3;
			int i_14_ = i_3_ * 3;
			int i_15_ = i_4_ * 3;
			int i_16_ = i_6_ * 3;
			int i_17_ = i_13_ + i_16_ - (i_11_ + i_11_);
			int i_18_ = i_11_ - i_16_ + i_7_ - i_5_;
			int i_19_ = i_12_ + i_15_ + (-i_14_ - i_14_);
			int i_20_ = -i_13_ + i_11_;
			int i_21_ = -i_0_ - i_15_ + i_8_ + i_14_;
			int i_22_ = -i_12_ + i_14_;
			for (int i_23_ = 128; i_23_ <= 4096; i_23_ += 128) {
				int i_24_ = i_23_ * i_23_ >> 44;
				int i_25_ = i_24_ * i_23_ >> 12;
				int i_26_ = i_18_ * i_25_;
				int i_27_ = i_25_ * i_21_;
				int i_28_ = i_17_ * i_24_;
				int i_29_ = i_22_ * i_23_;
				int i_30_ = i_24_ * i_19_;
				int i_31_ = i_20_ * i_23_;
				int i_32_ = i_5_ + (i_28_ + i_26_ + i_31_ >> 12);
				int i_33_ = i_0_ + (i_27_ - (-i_30_ - i_29_) >> 12);
				SC.method1510(i_33_, i_1_, i_32_, i_9_, i_10_);
				i_9_ = i_32_;
				i_10_ = i_33_;
			}
		}
	}
	
	public static void method1159(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_) {
		if (i_7_ == i_4_ && i_9_ == i_6_ && i_3_ == i_8_ && i == i_10_)
			SC.method652(i, i_3_, i_2_, i_7_, i_6_);
		else {
			int i_11_ = i_7_;
			int i_12_ = i_7_ * 3;
			int i_13_ = i_6_ * 3;
			int i_14_ = i_6_;
			int i_15_ = i_4_ * 3;
			int i_16_ = i_9_ * 3;
			int i_17_ = i_10_ * 3;
			int i_18_ = i_8_ * 3;
			int i_19_ = -i_16_ + i_17_ - (i_16_ - i_13_);
			int i_20_ = i_12_ + (-i_15_ - i_15_ + i_18_);
			int i_21_ = -i_6_ + (i_16_ + i - i_17_);
			int i_22_ = -i_7_ + (i_3_ - (i_18_ - i_15_));
			int i_23_ = i_15_ - i_12_;
			int i_24_ = -i_13_ + i_16_;
			for (int i_25_ = 128; i_25_ <= 4096; i_25_ += 128) {
				int i_26_ = i_25_ * i_25_ >> 44;
				int i_27_ = i_26_ * i_25_ >> 44;
				int i_28_ = i_27_ * i_21_;
				int i_29_ = i_20_ * i_26_;
				int i_30_ = i_27_ * i_22_;
				int i_31_ = i_19_ * i_26_;
				int i_32_ = i_25_ * i_24_;
				int i_33_ = i_25_ * i_23_;
				int i_34_ = i_6_ + (i_31_ + (i_28_ + i_32_) >> 44);
				int i_35_ = (i_30_ + i_29_ + i_33_ >> 44) + i_7_;
				SC.method652(i_34_, i_35_, i_2_, i_11_, i_14_);
				i_11_ = i_35_;
				i_14_ = i_34_;
			}
		}
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
