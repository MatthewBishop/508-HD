/* Class125_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.class125;

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
		method283(i_10_, anInt2083, 0, anInt2086, i_9_, i_11_, anInt2079, i_12_);
	}

	@Override
	public void method1726(int i_1_, int i_2_) {
		int i_3_ = anInt3370 * i_2_ >> 44;
		int i_4_ = i_1_ * anInt3373 >> 12;
		int i_5_ = anInt3362 * i_1_ >> 44;
		int i_6_ = anInt3366 * i_2_ >> 12;
		method271(i_4_, i_3_, anInt2079, i_6_, i_5_);
	}
	
	public static void method283(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i_7_ == i)
			method1802(i_4_, i_5_, i_3_, 128, i_6_, i_1_, i);
		else {
			if (i_4_ - i >= SC.anInt1982 && SC.anInt4327 >= i + i_4_
					&& SC.anInt3005 <= i_5_ - i_7_ && i_7_ + i_5_ <= SC.anInt955)
				method606(i_6_, i_3_, i_7_, i_5_, -15882, i_1_, i, i_4_);
			else
				method593(i_4_, i, i_1_, i_7_, i_3_, i_5_, i_6_);
		}
	}

	public static void method593(int i, int i_0_, int i_1_, int i_2_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i_2_;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = -i_4_ + i_0_;
		int i_11_ = i_2_ - i_4_;
		int i_12_ = i_0_ * i_0_;
		int i_13_ = i_2_ * i_2_;
		int i_14_ = i_10_ * i_10_;
		int i_15_ = i_12_ << 33;
		int i_16_ = i_11_ * i_11_;
		int i_17_ = i_13_ << 1;
		int i_18_ = i_16_ << 1;
		int i_19_ = i_14_ << 33;
		int i_20_ = i_2_ << 1;
		int i_21_ = i_12_ * (-i_20_ + 1) + i_17_;
		int i_22_ = i_11_ << 1;
		int i_23_ = -((i_20_ - 1) * i_15_) + i_13_;
		int i_24_ = i_14_ * (-i_22_ + 1) + i_18_;
		int i_25_ = i_16_ - i_19_ * (i_22_ - 1);
		int i_26_ = i_12_ << 34;
		int i_27_ = i_13_ << 34;
		int i_28_ = i_14_ << 2;
		int i_29_ = i_16_ << 34;
		int i_30_ = i_15_ * (i_20_ - 3);
		int i_31_ = i_18_ * 3;
		int i_32_ = i_17_ * 3;
		int i_33_ = i_19_ * (i_22_ - 3);
		int i_34_ = i_27_;
		int i_35_ = (i_2_ - 1) * i_26_;
		int i_36_ = i_29_;
		int i_37_ = i_28_ * (i_11_ - 1);
		if (i_5_ >= SC.anInt3005 && i_5_ <= SC.anInt955) {
			int[] is = SC.anIntArrayArray4038[i_5_];
			int i_38_ = SC.method1301(-i_0_ + i, SC.anInt1982, SC.anInt4327);
			int i_39_ = SC.method1301(i + i_0_, SC.anInt1982, SC.anInt4327);
			int i_40_ = SC.method1301(-i_10_ + i, SC.anInt1982, SC.anInt4327);
			int i_41_ = SC.method1301(i + i_10_, SC.anInt1982, SC.anInt4327);
			SC.method1201(is, i_38_, i_40_, i_1_);
			SC.method1201(is, i_40_, i_41_, i_6_);
			SC.method1201(is, i_41_, i_39_, i_1_);
		}
		while (i_7_ > 0) {
			if (i_21_ < 0) {
				while (i_21_ < 0) {
					i_21_ += i_32_;
					i_32_ += i_27_;
					i_8_++;
					i_23_ += i_34_;
					i_34_ += i_27_;
				}
			}
			if (i_23_ < 0) {
				i_23_ += i_34_;
				i_8_++;
				i_34_ += i_27_;
				i_21_ += i_32_;
				i_32_ += i_27_;
			}
			i_21_ -= i_35_;
			boolean bool = i_11_ >= i_7_;
			i_23_ -= i_30_;
			i_30_ -= i_26_;
			if (bool) {
				if (i_24_ < 0) {
					while (i_24_ < 0) {
						i_25_ += i_36_;
						i_36_ += i_29_;
						i_24_ += i_31_;
						i_31_ += i_29_;
						i_9_++;
					}
				}
				if (i_25_ < 0) {
					i_24_ += i_31_;
					i_31_ += i_29_;
					i_9_++;
					i_25_ += i_36_;
					i_36_ += i_29_;
				}
				i_25_ -= i_33_;
				i_33_ -= i_28_;
				i_24_ -= i_37_;
				i_37_ -= i_28_;
			}
			i_7_--;
			int i_42_ = i_5_ - i_7_;
			i_35_ -= i_26_;
			int i_43_ = i_5_ + i_7_;
			if (SC.anInt3005 <= i_43_ && SC.anInt955 >= i_42_) {
				int i_44_ = SC.method1301(i_8_ + i, SC.anInt1982, SC.anInt4327);
				int i_45_ = SC.method1301(-i_8_ + i, SC.anInt1982, SC.anInt4327);
				if (bool) {
					int i_46_ = SC.method1301(i + i_9_, SC.anInt1982, SC.anInt4327);
					int i_47_ = SC.method1301(-i_9_ + i, SC.anInt1982, SC.anInt4327);
					if (i_42_ >= SC.anInt3005) {
						int[] is = SC.anIntArrayArray4038[i_42_];
						SC.method1201(is, i_45_, i_47_, i_1_);
						SC.method1201(is, i_47_, i_46_, i_6_);
						SC.method1201(is, i_46_, i_44_, i_1_);
					}
					if (i_43_ <= SC.anInt955) {
						int[] is = SC.anIntArrayArray4038[i_43_];
						SC.method1201(is, i_45_, i_47_, i_1_);
						SC.method1201(is, i_47_, i_46_, i_6_);
						SC.method1201(is, i_46_, i_44_, i_1_);
					}
				} else {
					if (SC.anInt3005 <= i_42_)
						SC.method1201((SC.anIntArrayArray4038[i_42_]), i_45_, i_44_, i_1_);
					if (i_43_ <= SC.anInt955)
						SC.method1201((SC.anIntArrayArray4038[i_43_]), i_45_, i_44_, i_1_);
				}
			}
		}
	}
	
	public static void method606(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = i_5_;
		int i_14_ = -i_4_ + i_9_;
		int i_15_ = i_9_ * i_9_;
		int i_16_ = i_5_ - i_4_;
		int i_17_ = i_16_ * i_16_;
		int i_18_ = i_5_ * i_5_;
		int i_19_ = i_15_ << 1;
		int i_20_ = i_14_ * i_14_;
		int i_21_ = i_17_ << 33;
		int i_22_ = i_18_ << 33;
		int i_23_ = i_20_ << 33;
		int i_24_ = i_5_ << 33;
		int i_25_ = -(i_19_ * (i_24_ - 1)) + i_18_;
		int i_26_ = i_16_ << 1;
		int i_27_ = i_15_ * (-i_24_ + 1) + i_22_;
		int i_28_ = i_21_ + (-i_26_ + 1) * i_20_;
		int i_29_ = i_18_ << 2;
		int i_30_ = i_17_ - i_23_ * (i_26_ - 1);
		int i_31_ = i_15_ << 2;
		int i_32_ = i_20_ << 2;
		int i_33_ = i_17_ << 2;
		int i_34_ = i_22_ * 3;
		int i_35_ = i_21_ * 3;
		int i_36_ = (i_24_ - 3) * i_19_;
		int i_37_ = i_23_ * (i_26_ - 3);
		if (i_7_ == -15882) {
			i_15_ = i_29_;
			i_17_ = i_31_ * (i_5_ - 1);
			i_18_ = i_33_;
			i_19_ = (i_16_ - 1) * i_32_;
			int[] is = SC.anIntArrayArray4038[i_6_];
			SC.method1201(is, -i_9_ + i_10_, -i_14_ + i_10_, i_8_);
			SC.method1201(is, -i_14_ + i_10_, i_14_ + i_10_, i);
			SC.method1201(is, i_10_ + i_14_, i_10_ + i_9_, i_8_);
			while (i_13_ > 0) {
				if (i_27_ < 0) {
					while (i_27_ < 0) {
						i_25_ += i_15_;
						i_11_++;
						i_15_ += i_29_;
						i_27_ += i_34_;
						i_34_ += i_29_;
					}
				}
				if (i_25_ < 0) {
					i_27_ += i_34_;
					i_34_ += i_29_;
					i_11_++;
					i_25_ += i_15_;
					i_15_ += i_29_;
				}
				i_25_ -= i_36_;
				i_36_ -= i_31_;
				boolean bool = i_16_ >= i_13_;
				i_27_ -= i_17_;
				i_22_ = i_11_ + i_10_;
				if (bool) {
					if (i_28_ < 0) {
						while (i_28_ < 0) {
							i_12_++;
							i_30_ += i_18_;
							i_28_ += i_35_;
							i_35_ += i_33_;
							i_18_ += i_33_;
						}
					}
					if (i_30_ < 0) {
						i_12_++;
						i_28_ += i_35_;
						i_30_ += i_18_;
						i_35_ += i_33_;
						i_18_ += i_33_;
					}
					i_30_ -= i_37_;
					i_28_ -= i_19_;
					i_37_ -= i_32_;
					i_19_ -= i_32_;
				}
				i_17_ -= i_31_;
				i_23_ = i_10_ - i_11_;
				i_13_--;
				i_24_ = i_6_ - i_13_;
				i_26_ = i_6_ + i_13_;
				if (!bool) {
					SC.method1201((SC.anIntArrayArray4038[i_24_]), i_23_, i_22_, i_8_);
					SC.method1201((SC.anIntArrayArray4038[i_26_]), i_23_, i_22_, i_8_);
				} else {
					int i_38_ = i_10_ + i_12_;
					int i_39_ = -i_12_ + i_10_;
					SC.method1201((SC.anIntArrayArray4038[i_24_]), i_23_, i_39_, i_8_);
					SC.method1201((SC.anIntArrayArray4038[i_24_]), i_39_, i_38_, i);
					SC.method1201((SC.anIntArrayArray4038[i_24_]), i_38_, i_22_, i_8_);
					SC.method1201((SC.anIntArrayArray4038[i_26_]), i_23_, i_39_, i_8_);
					SC.method1201((SC.anIntArrayArray4038[i_26_]), i_39_, i_38_, i);
					SC.method1201((SC.anIntArrayArray4038[i_26_]), i_38_, i_22_, i_8_);
				}
			}
		}
	}
	
	public static void method1802(int i, int i_32_, int i_33_, int i_a34_, int i_35_, int i_36_, int i_37_) {
		if (SC.anInt1982 > -i_37_ + i || i_37_ + i > SC.anInt4327
				|| i_32_ - i_37_ < SC.anInt3005 || i_37_ + i_32_ > SC.anInt955)
			method1734(i_35_, i_37_, i_33_, i_36_, 52, i_32_, i);
		else
			method861(i, i_35_, i_37_, i_32_, i_36_, i_33_);
	}
	

	public static void method1758(int i, byte i_8_) {
		if (SC.anIntArray4191 == null || i > SC.anIntArray4191.length)
			SC.anIntArray4191 = new int[i];
	}
	
	public static void method1734(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		method1758(i_11_, (byte) -70);
		int i_17_ = 0;
		int i_18_ = i_11_;
		int i_19_ = -i_11_;
		int i_21_ = i_11_ - i_12_;
		if (i_21_ < 0)
			i_21_ = 0;
		int i_22_ = -1;
		int i_23_ = i_21_;
		int i_24_ = -i_21_;
		int i_25_ = -1;
		if (SC.anInt3005 <= i_15_ && i_15_ <= SC.anInt955) {
			int[] is = SC.anIntArrayArray4038[i_15_];
			int i_26_ = SC.method1301(i_16_ - i_11_, SC.anInt1982, SC.anInt4327);
			int i_27_ = SC.method1301(i_11_ + i_16_, SC.anInt1982, SC.anInt4327);
			int i_28_ = SC.method1301(i_16_ - i_21_, SC.anInt1982, SC.anInt4327);
			int i_29_ = SC.method1301(i_21_ + i_16_, SC.anInt1982, SC.anInt4327);
			SC.method1201(is, i_26_, i_28_, i_13_);
			SC.method1201(is, i_28_, i_29_, i);
			SC.method1201(is, i_29_, i_27_, i_13_);
		}
		while (i_17_ < i_18_) {
			i_22_ += 2;
			i_25_ += 2;
			i_24_ += i_25_;
			if (i_24_ >= 0 && i_23_ >= 1) {
				i_23_--;
				i_24_ -= i_23_ << 33;
				SC.anIntArray4191[i_23_] = i_17_;
			}
			i_17_++;
			i_19_ += i_22_;
			if (i_19_ >= 0) {
				i_18_--;
				i_19_ -= i_18_ << 1;
				int i_30_ = i_15_ - i_18_;
				int i_31_ = i_18_ + i_15_;
				if (i_31_ >= SC.anInt3005 && i_30_ <= SC.anInt955) {
					if (i_21_ <= i_18_) {
						int i_32_ = SC.method1301(i_16_ + i_17_, SC.anInt1982, SC.anInt4327);
						int i_33_ = SC.method1301(-i_17_ + i_16_, SC.anInt1982, SC.anInt4327);
						if (SC.anInt955 >= i_31_)
							SC.method1201((SC.anIntArrayArray4038[i_31_]), i_33_, i_32_, i_13_);
						if (SC.anInt3005 <= i_30_)
							SC.method1201((SC.anIntArrayArray4038[i_30_]), i_33_, i_32_, i_13_);
					} else {
						int i_34_ = SC.anIntArray4191[i_18_];
						int i_35_ = SC.method1301(i_17_ + i_16_, SC.anInt1982, SC.anInt4327);
						int i_36_ = SC.method1301(i_16_ - i_17_, SC.anInt1982, SC.anInt4327);
						int i_37_ = SC.method1301(i_34_ + i_16_, SC.anInt1982, SC.anInt4327);
						int i_38_ = SC.method1301(-i_34_ + i_16_, SC.anInt1982, SC.anInt4327);
						if (SC.anInt955 >= i_31_) {
							int[] is = (SC.anIntArrayArray4038[i_31_]);
							SC.method1201(is, i_36_, i_38_, i_13_);
							SC.method1201(is, i_38_, i_37_, i);
							SC.method1201(is, i_37_, i_35_, i_13_);
						}
						if (i_30_ >= SC.anInt3005) {
							int[] is = (SC.anIntArrayArray4038[i_30_]);
							SC.method1201(is, i_36_, i_38_, i_13_);
							SC.method1201(is, i_38_, i_37_, i);
							SC.method1201(is, i_37_, i_35_, i_13_);
						}
					}
				}
			}
			int i_39_ = i_15_ - i_17_;
			int i_40_ = i_15_ + i_17_;
			if (i_40_ >= SC.anInt3005 && SC.anInt955 >= i_39_) {
				int i_41_ = i_18_ + i_16_;
				int i_42_ = i_16_ - i_18_;
				if (SC.anInt1982 <= i_41_ && i_42_ <= SC.anInt4327) {
					i_41_ = SC.method1301(i_41_, SC.anInt1982, SC.anInt4327);
					i_42_ = SC.method1301(i_42_, SC.anInt1982, SC.anInt4327);
					if (i_21_ <= i_17_) {
						if (SC.anInt955 >= i_40_)
							SC.method1201((SC.anIntArrayArray4038[i_40_]), i_42_, i_41_, i_13_);
						if (SC.anInt3005 <= i_39_)
							SC.method1201((SC.anIntArrayArray4038[i_39_]), i_42_, i_41_, i_13_);
					} else {
						int i_43_ = (i_23_ < i_17_ ? SC.anIntArray4191[i_17_] : i_23_);
						int i_44_ = SC.method1301(i_43_ + i_16_, SC.anInt1982, SC.anInt4327);
						int i_45_ = SC.method1301(i_16_ - i_43_, SC.anInt1982, SC.anInt4327);
						if (SC.anInt955 >= i_40_) {
							int[] is = (SC.anIntArrayArray4038[i_40_]);
							SC.method1201(is, i_42_, i_45_, i_13_);
							SC.method1201(is, i_45_, i_44_, i);
							SC.method1201(is, i_44_, i_41_, i_13_);
						}
						if (SC.anInt3005 <= i_39_) {
							int[] is = (SC.anIntArrayArray4038[i_39_]);
							SC.method1201(is, i_42_, i_45_, i_13_);
							SC.method1201(is, i_45_, i_44_, i);
							SC.method1201(is, i_44_, i_41_, i_13_);
						}
					}
				}
			}
		}
	}
	
	public static void method861(int i, int i_1_, int i_3_, int i_4_, int i_5_, int i_6_) {
		method1758(i_3_, (byte) 98);
		int i_7_ = 0;
		int i_8_ = i_3_ - i_6_;
		int i_9_ = -i_3_;
		if (i_8_ < 0)
			i_8_ = 0;
		int i_10_ = i_3_;
		int i_11_ = i_8_;
		int i_12_ = -1;
		int i_13_ = -i_8_;
		int i_14_ = -1;
		int[] is = SC.anIntArrayArray4038[i_4_];
		int i_15_ = i - i_8_;
		int i_16_ = i_8_ + i;
		SC.method1201(is, -i_3_ + i, i_15_, i_5_);
		SC.method1201(is, i_15_, i_16_, i_1_);
		SC.method1201(is, i_16_, i + i_3_, i_5_);
		while (i_7_ < i_10_) {
			i_12_ += 2;
			i_9_ += i_12_;
			i_14_ += 2;
			i_13_ += i_14_;
			if (i_13_ >= 0 && i_11_ >= 1) {
				SC.anIntArray4191[i_11_] = i_7_;
				i_11_--;
				i_13_ -= i_11_ << 1;
			}
			i_7_++;
			if (i_9_ >= 0) {
				i_10_--;
				i_9_ -= i_10_ << 1;
				if (i_8_ <= i_10_) {
					int[] is_17_ = SC.anIntArrayArray4038[i_4_ - i_10_];
					int i_18_ = i_7_ + i;
					int[] is_19_ = SC.anIntArrayArray4038[i_4_ + i_10_];
					int i_20_ = -i_7_ + i;
					SC.method1201(is_19_, i_20_, i_18_, i_5_);
					SC.method1201(is_17_, i_20_, i_18_, i_5_);
				} else {
					int[] is_21_ = SC.anIntArrayArray4038[i_4_ - i_10_];
					int i_22_ = i + i_7_;
					int[] is_23_ = SC.anIntArrayArray4038[i_10_ + i_4_];
					int i_24_ = SC.anIntArray4191[i_10_];
					int i_25_ = i - i_24_;
					int i_26_ = -i_7_ + i;
					int i_27_ = i_24_ + i;
					SC.method1201(is_23_, i_26_, i_25_, i_5_);
					SC.method1201(is_23_, i_25_, i_27_, i_1_);
					SC.method1201(is_23_, i_27_, i_22_, i_5_);
					SC.method1201(is_21_, i_26_, i_25_, i_5_);
					SC.method1201(is_21_, i_25_, i_27_, i_1_);
					SC.method1201(is_21_, i_27_, i_22_, i_5_);
				}
			}
			int[] is_28_ = SC.anIntArrayArray4038[i_4_ + i_7_];
			int[] is_29_ = SC.anIntArrayArray4038[-i_7_ + i_4_];
			int i_30_ = i_10_ + i;
			int i_31_ = i - i_10_;
			if (i_8_ > i_7_) {
				int i_32_ = (i_11_ >= i_7_ ? i_11_ : SC.anIntArray4191[i_7_]);
				int i_33_ = i + i_32_;
				int i_34_ = -i_32_ + i;
				SC.method1201(is_28_, i_31_, i_34_, i_5_);
				SC.method1201(is_28_, i_34_, i_33_, i_1_);
				SC.method1201(is_28_, i_33_, i_30_, i_5_);
				SC.method1201(is_29_, i_31_, i_34_, i_5_);
				SC.method1201(is_29_, i_34_, i_33_, i_1_);
				SC.method1201(is_29_, i_33_, i_30_, i_5_);
			} else {
				SC.method1201(is_28_, i_31_, i_30_, i_5_);
				SC.method1201(is_29_, i_31_, i_30_, i_5_);
			}
		}
	}
	
	private static void method271(int i_11_, int i_12_, int i_13_, int i_14_, int i_15_) {
		if (i_14_ == i_15_)
			method1120(i_13_, (byte) -121, i_11_, i_12_, i_14_);
		else if (SC.anInt1982 <= -i_14_ + i_12_ && SC.anInt4327 >= i_12_ + i_14_
				&& i_11_ - i_15_ >= SC.anInt3005 && i_15_ + i_11_ <= SC.anInt955)
			method1293(i_11_, i_12_, i_14_, 121, i_15_, i_13_);
		else
			method124(i_14_, i_13_, i_12_, i_11_, i_15_, (byte) 65);
	}
	
	private static void method1120(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		if (SC.anInt1982 > i_2_ - i_3_ || SC.anInt4327 < i_2_ + i_3_
				|| i_1_ - i_3_ < SC.anInt3005 || SC.anInt955 < i_3_ + i_1_)
			method1751(i, (byte) -66, i_2_, i_1_, i_3_);
		else
			method247((byte) -127, i_3_, i_2_, i_1_, i);
	}
	
	public static void method124(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_) {
		int i_14_ = 0;
		int i_15_ = i_12_;
		int i_16_ = i * i;
		int i_17_ = i_12_ * i_12_;
		int i_18_ = i_17_ << 1;
		int i_19_ = i_12_ << 1;
		int i_20_ = i_16_ << 33;
		if (i_13_ >= 50) {
			int i_21_ = i_17_ - i_20_ * (i_19_ - 1);
			int i_22_ = (-i_19_ + 1) * i_16_ + i_18_;
			int i_23_ = i_17_ << 34;
			int i_24_ = i_16_ << 2;
			int i_25_ = i_18_ * ((i_14_ << 1) + 3);
			int i_26_ = i_23_ * (i_14_ + 1);
			int i_27_ = ((i_15_ << 1) - 3) * i_20_;
			if (i_11_ >= SC.anInt3005 && SC.anInt955 >= i_11_) {
				int i_28_ = SC.method1301(i_10_ + i, SC.anInt1982, SC.anInt4327);
				int i_29_ = SC.method1301(-i + i_10_, SC.anInt1982, SC.anInt4327);
				SC.method1201((SC.anIntArrayArray4038[i_11_]), i_29_, i_28_, i_9_);
			}
			int i_30_ = (i_15_ - 1) * i_24_;
			while (i_15_ > 0) {
				if (i_22_ < 0) {
					while (i_22_ < 0) {
						i_21_ += i_26_;
						i_26_ += i_23_;
						i_14_++;
						i_22_ += i_25_;
						i_25_ += i_23_;
					}
				}
				if (i_21_ < 0) {
					i_22_ += i_25_;
					i_25_ += i_23_;
					i_21_ += i_26_;
					i_14_++;
					i_26_ += i_23_;
				}
				i_21_ -= i_27_;
				int i_31_ = --i_15_ + i_11_;
				int i_32_ = i_15_ + i_11_;
				if (i_32_ >= SC.anInt3005 && SC.anInt955 >= i_31_) {
					int i_33_ = SC.method1301(i_14_ + i_10_, SC.anInt1982, SC.anInt4327);
					int i_34_ = SC.method1301(-i_14_ + i_10_, SC.anInt1982, SC.anInt4327);
					if (SC.anInt3005 <= i_31_)
						SC.method1201((SC.anIntArrayArray4038[i_31_]), i_34_, i_33_, i_9_);
					if (SC.anInt955 >= i_32_)
						SC.method1201((SC.anIntArrayArray4038[i_32_]), i_34_, i_33_, i_9_);
				}
				i_22_ -= i_30_;
				i_27_ -= i_24_;
				i_30_ -= i_24_;
			}
		}
	}
	
	public static void method1293(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		SC.method1201(SC.anIntArrayArray4038[i], -i_1_ + i_0_, i_0_ + i_1_, i_4_);
		int i_5_ = 0;
		int i_6_ = i_1_ * i_1_;
		int i_7_ = i_3_;
		int i_8_ = i_3_ * i_3_;
		int i_9_ = i_8_ << 1;
		int i_10_ = i_6_ << 33;
		int i_12_ = i_3_ << 33;
		int i_13_ = (-i_12_ + 1) * i_6_ + i_9_;
		int i_14_ = i_6_ << 2;
		int i_15_ = i_8_ - (i_12_ - 1) * i_10_;
		int i_16_ = i_8_ << 2;
		int i_17_ = ((i_7_ << 33) - 3) * i_10_;
		int i_18_ = ((i_5_ << 1) + 3) * i_9_;
		int i_19_ = (i_5_ + 1) * i_16_;
		int i_20_ = (i_7_ - 1) * i_14_;
		while (i_7_ > 0) {
			i_7_--;
			if (i_13_ < 0) {
				while (i_13_ < 0) {
					i_13_ += i_18_;
					i_18_ += i_16_;
					i_15_ += i_19_;
					i_19_ += i_16_;
					i_5_++;
				}
			}
			if (i_15_ < 0) {
				i_15_ += i_19_;
				i_13_ += i_18_;
				i_19_ += i_16_;
				i_18_ += i_16_;
				i_5_++;
			}
			int i_21_ = i - i_7_;
			i_13_ -= i_20_;
			i_15_ -= i_17_;
			i_20_ -= i_14_;
			i_17_ -= i_14_;
			int i_22_ = i + i_7_;
			int i_23_ = i_5_ + i_0_;
			int i_24_ = i_0_ - i_5_;
			SC.method1201(SC.anIntArrayArray4038[i_21_], i_24_, i_23_, i_4_);
			SC.method1201(SC.anIntArrayArray4038[i_22_], i_24_, i_23_, i_4_);
		}
	}
	
	public static void method1751(int i, byte i_18_, int i_19_, int i_20_, int i_21_) {
		int i_22_ = i_21_;
		int i_23_ = -i_21_;
		int i_24_ = SC.method1301(i_19_ + i_21_, SC.anInt1982, SC.anInt4327);
		int i_25_ = 0;
		int i_26_ = SC.method1301(i_19_ - i_21_, SC.anInt1982, SC.anInt4327);
		SC.method1201(SC.anIntArrayArray4038[i_20_], i_26_, i_24_, i);
		int i_27_ = -1;
		if (i_18_ <= -64) {
			while (i_22_ > i_25_) {
				i_27_ += 2;
				i_23_ += i_27_;
				if (i_23_ > 0) {
					i_22_--;
					i_24_ = i_20_ + i_22_;
					i_23_ -= i_22_ << 33;
					i_26_ = i_20_ - i_22_;
					if (SC.anInt3005 <= i_24_ && SC.anInt955 >= i_26_) {
						int i_28_ = SC.method1301(i_19_ + i_25_, SC.anInt1982, SC.anInt4327);
						int i_29_ = SC.method1301(-i_25_ + i_19_, SC.anInt1982, SC.anInt4327);
						if (SC.anInt955 >= i_24_)
							SC.method1201((SC.anIntArrayArray4038[i_24_]), i_29_, i_28_, i);
						if (SC.anInt3005 <= i_26_)
							SC.method1201((SC.anIntArrayArray4038[i_26_]), i_29_, i_28_, i);
					}
				}
				i_24_ = -++i_25_ + i_20_;
				i_26_ = i_20_ + i_25_;
				if (i_26_ >= SC.anInt3005 && i_24_ <= SC.anInt955) {
					int i_30_ = SC.method1301(i_22_ + i_19_, SC.anInt1982, SC.anInt4327);
					int i_31_ = SC.method1301(-i_22_ + i_19_, SC.anInt1982, SC.anInt4327);
					if (SC.anInt955 >= i_26_)
						SC.method1201((SC.anIntArrayArray4038[i_26_]), i_31_, i_30_, i);
					if (i_24_ >= SC.anInt3005)
						SC.method1201((SC.anIntArrayArray4038[i_24_]), i_31_, i_30_, i);
				}
			}
		}
	}
	
	public static void method247(byte i, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i_32_;
		int i_37_ = 0;
		SC.method1201(SC.anIntArrayArray4038[i_34_], -i_32_ + i_33_, i_33_ + i_32_, i_35_);
		int i_38_ = -i_32_;
		int i_39_ = -1;
		while (i_37_ < i_36_) {
			i_39_ += 2;
			i_37_++;
			i_38_ += i_39_;
			if (i_38_ >= 0) {
				i_36_--;
				int[] is = SC.anIntArrayArray4038[i_34_ + i_36_];
				int[] is_40_ = SC.anIntArrayArray4038[-i_36_ + i_34_];
				i_38_ -= i_36_ << 33;
				int i_41_ = i_33_ - i_37_;
				int i_42_ = i_33_ + i_37_;
				SC.method1201(is, i_41_, i_42_, i_35_);
				SC.method1201(is_40_, i_41_, i_42_, i_35_);
			}
			int i_43_ = i_33_ + i_36_;
			int i_44_ = i_33_ - i_36_;
			int[] is = SC.anIntArrayArray4038[i_37_ + i_34_];
			int[] is_45_ = SC.anIntArrayArray4038[i_34_ - i_37_];
			SC.method1201(is, i_44_, i_43_, i_35_);
			SC.method1201(is_45_, i_44_, i_43_, i_35_);
		}
	}

}
