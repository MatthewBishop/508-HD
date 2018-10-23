/* Class125_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.class125;

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
		method1423(anInt2086, i_9_, i_10_, i_7_, anInt2083, i_8_);
	}

	public static void method879(int i, int i_5_, int i_6_a, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = i_8_ + i;
		int i_12_ = -i_8_ + i_7_;
		int i_13_ = i_8_ + i_10_;
		for (int i_14_ = i; i_14_ < i_11_; i_14_++)
			SC.method1201(SC.anIntArrayArray4038[i_14_], i_10_, i_9_, i_5_);
		int i_15_ = i_9_ - i_8_;
		for (int i_16_ = i_7_; i_12_ < i_16_; i_16_--)
			SC.method1201(SC.anIntArrayArray4038[i_16_], i_10_, i_9_, i_5_);
		for (int i_17_ = i_11_; i_12_ >= i_17_; i_17_++) {
			int[] is = SC.anIntArrayArray4038[i_17_];
			SC.method1201(is, i_10_, i_13_, i_5_);
			SC.method1201(is, i_15_, i_9_, i_5_);
		}
	}
	
	public static void method1423(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		if (SC.anInt1982 <= i_10_ && SC.anInt4327 >= i_8_ && i_12_ >= SC.anInt3005
				&& SC.anInt955 >= i_9_) {
			if (i != 1)
				method879(i_12_, i_11_, 255, i_9_, i, i_8_, i_10_);
			else
				method1241(i_8_, i_10_, i_11_, i_9_, i_12_);
		} else if (i != 1)
			method466(i_10_, i_12_, -32718, i_11_, i, i_8_, i_9_);
		else
			method849(i_8_, i_9_, 0, i_11_, i_12_, i_10_);
	}

	public static void method849(int i, int i_13_, int i_14a_, int i_15_, int i_16_, int i_17_) {
		if (i_16_ <= SC.anInt955 && SC.anInt3005 <= i_13_) {
			boolean bool;
			if (i < SC.anInt1982) {
				bool = false;
				i = SC.anInt1982;
			} else if (SC.anInt4327 >= i)
				bool = true;
			else {
				i = SC.anInt4327;
				bool = false;
			}
			boolean bool_18_;
			if (i_17_ >= SC.anInt1982) {
				if (SC.anInt4327 < i_17_) {
					bool_18_ = false;
					i_17_ = SC.anInt4327;
				} else
					bool_18_ = true;
			} else {
				i_17_ = SC.anInt1982;
				bool_18_ = false;
			}
			if (SC.anInt3005 <= i_16_)
				SC.method1201((SC.anIntArrayArray4038[i_16_++]), i_17_, i, i_15_);
			else
				i_16_ = SC.anInt3005;
			if (i_13_ <= SC.anInt955)
				SC.method1201((SC.anIntArrayArray4038[i_13_--]), i_17_, i, i_15_);
			else
				i_13_ = SC.anInt955;
			if (!bool_18_ || !bool) {
				if (!bool_18_) {
					if (bool) {
						for (int i_19_ = i_16_; i_19_ <= i_13_; i_19_++)
							SC.anIntArrayArray4038[i_19_][i] = i_15_;
					}
				} else {
					for (int i_20_ = i_16_; i_20_ <= i_13_; i_20_++)
						SC.anIntArrayArray4038[i_20_][i_17_] = i_15_;
				}
			} else {
				for (int i_21_ = i_16_; i_21_ <= i_13_; i_21_++) {
					int[] is = SC.anIntArrayArray4038[i_21_];
					is[i_17_] = is[i] = i_15_;
				}
			}
		}
	}
	
	public static void method466(int i, int i_7_, int ia_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = SC.method1301(i_7_, SC.anInt3005, SC.anInt955);
		int i_14_ = SC.method1301(i_12_, SC.anInt3005, SC.anInt955);
		int i_15_ = SC.method1301(i, SC.anInt1982, SC.anInt4327);
		int i_16_ = SC.method1301(i_11_, SC.anInt1982, SC.anInt4327);
		int i_17_ = SC.method1301(i_7_ + i_10_, SC.anInt3005, SC.anInt955);
		int i_18_ = SC.method1301(-i_10_ + i_12_, SC.anInt3005, SC.anInt955);
		for (int i_19_ = i_13_; i_19_ < i_17_; i_19_++)
			SC.method1201(SC.anIntArrayArray4038[i_19_], i_15_, i_16_, i_9_);
		for (int i_20_ = i_14_; i_18_ < i_20_; i_20_--)
			SC.method1201(SC.anIntArrayArray4038[i_20_], i_15_, i_16_, i_9_);
		int i_21_ = SC.method1301(i + i_10_, SC.anInt1982, SC.anInt4327);
		int i_22_ = SC.method1301(i_11_ - i_10_, SC.anInt1982, SC.anInt4327);
		for (int i_23_ = i_17_; i_23_ <= i_18_; i_23_++) {
			int[] is = SC.anIntArrayArray4038[i_23_];
			SC.method1201(is, i_15_, i_21_,  i_9_);
			SC.method1201(is, i_22_, i_16_, i_9_);
		}
	}
	
	public static void method1241(int i, int i_0_, int i_2_, int i_3_, int i_4_) {
		SC.method1201(SC.anIntArrayArray4038[i_4_++], i_0_, i, i_2_);
		SC.method1201(SC.anIntArrayArray4038[i_3_--], i_0_, i, i_2_);
		for (int i_6_ = i_4_; i_6_ <= i_3_; i_6_++) {
			int[] is = SC.anIntArrayArray4038[i_6_];
			is[i_0_] = is[i] = i_2_;
		}
	}
	
	@Override
	public void method1724(int i, int i_18_) {
		int i_19_ = anInt3426 * i_18_ >> 44;
		int i_20_ = i_18_ * anInt3421 >> 44;
		int i_21_ = i * anInt3418 >> 12;
		int i_22_ = i * anInt3425 >> 12;
		method386(i_22_, i_20_, i_19_, anInt2086, anInt2083, anInt2079, i_21_);
	}

	public static void method386(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_6_ < SC.anInt1982 || SC.anInt4327 < i_5_ || i_10_ < SC.anInt3005
				|| i > SC.anInt955)
			method522(i_10_, i_9_, i_6_, i_8_, i, 0, i_5_, i_7_);
		else
			method1980(i_8_, i_10_, i_6_, i_5_, i_9_, i, i_7_);
	}
	
	public static void method522(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = SC.method1301(i, SC.anInt3005, SC.anInt955);
		int i_11_ = SC.method1301(i_6_, SC.anInt3005, SC.anInt955);
		if (i_7_ == 0) {
			int i_12_ = SC.method1301(i_4_, SC.anInt1982, SC.anInt4327);
			int i_13_ = SC.method1301(i_8_, SC.anInt1982, SC.anInt4327);
			int i_14_ = SC.method1301(i_9_ + i, SC.anInt3005, SC.anInt955);
			int i_15_ = SC.method1301(i_6_ - i_9_, SC.anInt3005, SC.anInt955);
			for (int i_16_ = i_10_; i_14_ > i_16_; i_16_++)
				SC.method1201((SC.anIntArrayArray4038[i_16_]), i_12_, i_13_, i_5_);
			for (int i_17_ = i_11_; i_17_ > i_15_; i_17_--)
				SC.method1201((SC.anIntArrayArray4038[i_17_]), i_12_, i_13_, i_5_);
			int i_18_ = SC.method1301(i_9_ + i_4_, SC.anInt1982, SC.anInt4327);
			int i_19_ = SC.method1301(i_8_ - i_9_, SC.anInt1982, SC.anInt4327);
			for (int i_20_ = i_14_; i_20_ <= i_15_; i_20_++) {
				int[] is = SC.anIntArrayArray4038[i_20_];
				SC.method1201(is, i_12_, i_18_, i_5_);
				SC.method1201(is, i_18_, i_19_, i_3_);
				SC.method1201(is, i_19_, i_13_, i_5_);
			}
		}
	}
	
	public static void method1980(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_76_) {
		int i_77_ = -i_76_ + i_74_;
		int i_78_ = i_70_ + i_76_;
		int i_79_ = -i_76_ + i_72_;
		for (int i_80_ = i_70_; i_78_ > i_80_; i_80_++)
			SC.method1201(SC.anIntArrayArray4038[i_80_], i_71_, i_72_, i);
		int i_81_ = i_71_ + i_76_;
		for (int i_82_ = i_74_; i_77_ < i_82_; i_82_--)
			SC.method1201(SC.anIntArrayArray4038[i_82_], i_71_, i_72_, i);
		for (int i_83_ = i_78_; i_77_ >= i_83_; i_83_++) {
			int[] is = SC.anIntArrayArray4038[i_83_];
			SC.method1201(is, i_71_, i_81_, i);
			SC.method1201(is, i_81_, i_79_, i_73_);
			SC.method1201(is, i_79_, i_72_, i);
		}
	}
	
	@Override
	public void method1726(int i_0_, int i_1_) {
		int i_2_ = i_1_ * anInt3426 >> 44;
		int i_3_ = i_1_ * anInt3421 >> 44;
		int i_4_ = i_0_ * anInt3418 >> 12;
		int i_5_ = i_0_ * anInt3425 >> 12;
		method1417(i_2_, i_4_, i_5_, anInt2079, i_3_);
	}
	
	public static void method1417(int i, int i_2_, int i_3_, int i_5_, int i_6_) {
		if (i < SC.anInt1982 || SC.anInt4327 < i_6_ || SC.anInt3005 > i_2_
				|| SC.anInt955 < i_3_)
			method324(i, i_5_, i_3_, i_6_, i_2_);
		else
			method674(i_6_, i_5_, i, i_2_, i_3_);
	}
	
	public static void method674(int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_3_;
		for (/**/; i_5_ <= i_4_; i_5_++)
			SC.method1201(SC.anIntArrayArray4038[i_5_], i_2_, i_0_, i_1_);
	}
	
	public static void method324(int i, int i_15_, int i_16_, int i_17_, int i_19_) {
		int i_21_ = SC.method1301(i_19_, SC.anInt3005, SC.anInt955);
		int i_22_ = SC.method1301(i_16_, SC.anInt3005, SC.anInt955);
		int i_23_ = SC.method1301(i, SC.anInt1982, SC.anInt4327);
		int i_24_ = SC.method1301(i_17_, SC.anInt1982, SC.anInt4327);
		for (int i_25_ = i_21_; i_22_ >= i_25_; i_25_++)
			SC.method1201(SC.anIntArrayArray4038[i_25_], i_23_, i_24_, i_15_);
	}
}
