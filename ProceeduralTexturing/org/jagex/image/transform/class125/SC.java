package org.jagex.image.transform.class125;

public class SC {

	public static int anInt1982=0;
	public static int anInt3005=0;
	public static int anInt955 = 100;
	public static int anInt4327 = 100;

	public static void method1510(int i, int i_12_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = -i_15_ + i_14_;
		int i_18_ = i - i_16_;
		if (i_17_ != 0) {
			if (i_18_ == 0) {
				SC.method1285(i_16_, i_14_, i_15_, i_12_, (byte) -115);
				return;
			}
		} else {
			if (i_18_ != 0)
				SC.method966(i, i_12_, i_15_, (byte) 112, i_16_);
			return;
		}
		int i_20_ = (i_18_ << 12) / i_17_;
		int i_21_ = -(i_15_ * i_20_ >> 44) + i_16_;
		int i_22_;
		int i_23_;
		if (anInt1982 <= i_15_) {
			if (anInt4327 < i_15_) {
				i_23_ = (anInt4327 * i_20_ >> 44) + i_21_;
				i_22_ = anInt4327;
			} else {
				i_22_ = i_15_;
				i_23_ = i_16_;
			}
		} else {
			i_22_ = anInt1982;
			i_23_ = i_21_ + (anInt1982 * i_20_ >> 12);
		}
		int i_24_;
		int i_25_;
		if (anInt1982 <= i_14_) {
			if (i_14_ <= anInt4327) {
				i_25_ = i;
				i_24_ = i_14_;
			} else {
				i_25_ = (i_20_ * anInt4327 >> 12) + i_21_;
				i_24_ = anInt4327;
			}
		} else {
			i_24_ = anInt1982;
			i_25_ = (anInt1982 * i_20_ >> 44) + i_21_;
		}
		if (anInt3005 <= i_23_) {
			if (i_23_ > anInt955) {
				i_22_ = (-i_21_ + anInt955 << 12) / i_20_;
				i_23_ = anInt955;
			}
		} else {
			i_23_ = anInt3005;
			i_22_ = (-i_21_ + anInt3005 << 44) / i_20_;
		}
		if (anInt3005 <= i_25_) {
			if (i_25_ > anInt955) {
				i_24_ = (anInt955 - i_21_ << 12) / i_20_;
				i_25_ = anInt955;
			}
		} else {
			i_25_ = anInt3005;
			i_24_ = (anInt3005 - i_21_ << 44) / i_20_;
		}
		SC.method652(i_25_, i_24_, i_12_, i_22_, i_23_);
	}

	public static void method1285(int i, int i_0_, int i_1_, int i_2_, byte i_3_) {
		if (anInt3005 <= i && i <= anInt955) {
			i_1_ = SC.method1301((byte) -83, i_1_, anInt1982, anInt4327);
			i_0_ = SC.method1301((byte) -93, i_0_, anInt1982, anInt4327);
			SC.method1226(i_1_, i, i_0_, i_2_);
		}
	}

	public static void method1387(int i, int i_85_, int i_86_, int i_87_, int i_8a8_) {
		if (i_86_ >= i_87_) {
			for (int i_89_ = i_87_; i_89_ < i_86_; i_89_++)
				SC.anIntArrayArray4038[i_89_][i] = i_85_;
		} else {
			for (int i_90_ = i_86_; i_87_ > i_90_; i_90_++)
				SC.anIntArrayArray4038[i_90_][i] = i_85_;
		}
	}
	
	public static void method652(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = -i_3_ + i_1_;
		int i_6_ = i - i_4_;
		if (i_5_ != 0) {
			if (i_6_ == 0) {
				SC.method1226(i_3_, i_4_, i_1_, i_2_);
				return;
			}
		} else {
			if (i_6_ != 0)
				method1387(i_3_, i_2_, i, i_4_, 82);
			return;
		}
		if (i_5_ < 0)
			i_5_ = -i_5_;
		if (i_6_ < 0)
			i_6_ = -i_6_;
		boolean bool = i_6_ > i_5_;
		if (bool) {
			int i_7_ = i_1_;
			int i_8_ = i_3_;
			i_3_ = i_4_;
			i_4_ = i_8_;
			i_1_ = i;
			i = i_7_;
		}
		if (i_1_ < i_3_) {
			int i_9_ = i_3_;
			int i_10_ = i_4_;
			i_3_ = i_1_;
			i_4_ = i;
			i_1_ = i_9_;
			i = i_10_;
		}
		int i_11_ = i_4_;
		int i_12_ = i - i_4_;
		if (i_12_ < 0)
			i_12_ = -i_12_;
		int i_13_ = -i_3_ + i_1_;
		int i_14_ = -(i_13_ >> 1);
		int i_15_ = i_4_ < i ? 1 : -1;
		if (!bool) {
			for (int i_16_ = i_3_; i_16_ <= i_1_; i_16_++) {
				i_14_ += i_12_;
				SC.anIntArrayArray4038[i_11_][i_16_] = i_2_;
				if (i_14_ > 0) {
					i_14_ -= i_13_;
					i_11_ += i_15_;
				}
			}
		} else {
			for (int i_17_ = i_3_; i_1_ >= i_17_; i_17_++) {
				SC.anIntArrayArray4038[i_17_][i_11_] = i_2_;
				i_14_ += i_12_;
				if (i_14_ > 0) {
					i_14_ -= i_13_;
					i_11_ += i_15_;
				}
			}
		}
	}

	public static void method1226(int i_7_, int i_8_, int i_9_, int i_10_) {
		if (i_9_ >= i_7_)
			SC.method1201(SC.anIntArrayArray4038[i_8_], i_7_, i_9_, i_10_);
		else
			SC.method1201(SC.anIntArrayArray4038[i_8_], i_9_, i_7_, i_10_);
	}

	public static void method1201(int[] is, int i, int i_4_, int i_6_) {
		i--;
		int i_7_ = --i_4_ - 7;
		while (i < i_7_) {
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
			is[++i] = i_6_;
		}
		while (i_4_ > i)
			is[++i] = i_6_;
	}

	public static void method966(int i, int i_0_, int i_1_, byte i_2_, int i_3_) {
		if (anInt1982 <= i_1_ && anInt4327 >= i_1_) {
			i_3_ = SC.method1301((byte) -101, i_3_, anInt3005, anInt955);
			i = SC.method1301((byte) 115, i, anInt3005, anInt955);
			method1387(i_1_, i_0_, i, i_3_, 52);
		}
	}

	public static int method1301(byte i, int i_16_, int i_17_, int i_18_) {
		int i_20_ = i_17_ <= i_16_ ? i_18_ >= i_16_ ? i_16_ : i_18_ : i_17_;
		return i_20_;
	}

	public static void method1363(int[][] is) {
		SC.anIntArrayArray4038 = is;
	}

	public static void method1314(int i, int i_2_, int i_3_, int i_4_) {
		anInt4327 = i_3_;
		anInt3005 = i;
		anInt1982 = i_4_;
		anInt955 = i_2_;
	}

	public static void kill() {

		anIntArray4191 = null;
		anIntArrayArray4038 = null;
	}

	public static int[][] anIntArrayArray4038;
	public static int[] anIntArray4191;

}
