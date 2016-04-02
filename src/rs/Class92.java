/* Class92 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class92 {
	public static int anInt1432;
	public static int anInt1433;
	public static int anInt1434;
	public static int anInt1435;
	public static int anInt1436 = 0;
	public static int[] anIntArray1437;
	public static int anInt1438;
	public static int[] anIntArray1439;
	public static int[] anIntArray1440;

	static {
		anInt1433 = 0;
		anInt1434 = 0;
		anInt1438 = 0;
	}

	public static void method1452(int[] is) {
		is[0] = anInt1433;
		is[1] = anInt1438;
		is[2] = anInt1434;
		is[3] = anInt1436;
	}

	public static void method1453(int i, int i_0_, int i_1_, int i_2_) {
		if (i < 0)
			i = 0;
		if (i_0_ < 0)
			i_0_ = 0;
		if (i_1_ > anInt1432)
			i_1_ = anInt1432;
		if (i_2_ > anInt1435)
			i_2_ = anInt1435;
		anInt1433 = i;
		anInt1438 = i_0_;
		anInt1434 = i_1_;
		anInt1436 = i_2_;
		method1456();
	}

	public static void method1454(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (i < anInt1433) {
			i_4_ -= anInt1433 - i;
			i = anInt1433;
		}
		if (i_3_ < anInt1438) {
			i_5_ -= anInt1438 - i_3_;
			i_3_ = anInt1438;
		}
		if (i + i_4_ > anInt1434)
			i_4_ = anInt1434 - i;
		if (i_3_ + i_5_ > anInt1436)
			i_5_ = anInt1436 - i_3_;
		int i_7_ = anInt1432 - i_4_;
		int i_8_ = i + i_3_ * anInt1432;
		for (int i_9_ = -i_5_; i_9_ < 0; i_9_++) {
			for (int i_10_ = -i_4_; i_10_ < 0; i_10_++)
				anIntArray1437[i_8_++] = i_6_;
			i_8_ += i_7_;
		}
	}

	public static void method1455(int[] is, int i, int i_11_) {
		anIntArray1437 = is;
		anInt1432 = i;
		anInt1435 = i_11_;
		method1453(0, 0, i, i_11_);
	}

	public static void method1456() {
		anIntArray1440 = null;
		anIntArray1439 = null;
	}

	public static void method1457(int i, int i_12_, int i_13_) {
		if (i >= anInt1433 && i_12_ >= anInt1438 && i < anInt1434 && i_12_ < anInt1436)
			anIntArray1437[i + i_12_ * anInt1432] = i_13_;
	}

	public static void method1458(int i, int i_14_, int i_15_, int i_16_) {
		if (i_14_ >= anInt1438 && i_14_ < anInt1436) {
			if (i < anInt1433) {
				i_15_ -= anInt1433 - i;
				i = anInt1433;
			}
			if (i + i_15_ > anInt1434)
				i_15_ = anInt1434 - i;
			int i_17_ = i + i_14_ * anInt1432;
			for (int i_18_ = 0; i_18_ < i_15_; i_18_++)
				anIntArray1437[i_17_ + i_18_] = i_16_;
		}
	}

	public static void method1459(int[] is) {
		anInt1433 = is[0];
		anInt1438 = is[1];
		anInt1434 = is[2];
		anInt1436 = is[3];
		method1456();
	}

	public static void method1460(int i, int i_19_, int i_20_, int i_21_, int i_22_) {
		if (i_22_ != 0) {
			if (i_22_ == 256)
				method1462(i, i_19_, i_20_, i_21_);
			else {
				if (i_20_ < 0)
					i_20_ = -i_20_;
				int i_23_ = 256 - i_22_;
				int i_24_ = (i_21_ >> 16 & 0xff) * i_22_;
				int i_25_ = (i_21_ >> 8 & 0xff) * i_22_;
				int i_26_ = (i_21_ & 0xff) * i_22_;
				int i_27_ = i_19_ - i_20_;
				if (i_27_ < anInt1438)
					i_27_ = anInt1438;
				int i_28_ = i_19_ + i_20_ + 1;
				if (i_28_ > anInt1436)
					i_28_ = anInt1436;
				int i_29_ = i_27_;
				int i_30_ = i_20_ * i_20_;
				int i_31_ = 0;
				int i_32_ = i_19_ - i_29_;
				int i_33_ = i_32_ * i_32_;
				int i_34_ = i_33_ - i_32_;
				if (i_19_ > i_28_)
					i_19_ = i_28_;
				while (i_29_ < i_19_) {
					for (/**/; i_34_ <= i_30_ || i_33_ <= i_30_; i_34_ += i_31_++ + i_31_)
						i_33_ += i_31_ + i_31_;
					int i_35_ = i - i_31_ + 1;
					if (i_35_ < anInt1433)
						i_35_ = anInt1433;
					int i_36_ = i + i_31_;
					if (i_36_ > anInt1434)
						i_36_ = anInt1434;
					int i_37_ = i_35_ + i_29_ * anInt1432;
					for (int i_38_ = i_35_; i_38_ < i_36_; i_38_++) {
						int i_39_ = (anIntArray1437[i_37_] >> 16 & 0xff) * i_23_;
						int i_40_ = (anIntArray1437[i_37_] >> 8 & 0xff) * i_23_;
						int i_41_ = (anIntArray1437[i_37_] & 0xff) * i_23_;
						int i_42_ = ((i_24_ + i_39_ >> 8 << 16) + (i_25_ + i_40_ >> 8 << 8) + (i_26_ + i_41_ >> 8));
						anIntArray1437[i_37_++] = i_42_;
					}
					i_29_++;
					i_33_ -= i_32_-- + i_32_;
					i_34_ -= i_32_ + i_32_;
				}
				i_31_ = i_20_;
				i_32_ = -i_32_;
				i_34_ = i_32_ * i_32_ + i_30_;
				i_33_ = i_34_ - i_31_;
				i_34_ -= i_32_;
				while (i_29_ < i_28_) {
					for (/**/; i_34_ > i_30_ && i_33_ > i_30_; i_33_ -= i_31_ + i_31_)
						i_34_ -= i_31_-- + i_31_;
					int i_43_ = i - i_31_;
					if (i_43_ < anInt1433)
						i_43_ = anInt1433;
					int i_44_ = i + i_31_;
					if (i_44_ > anInt1434 - 1)
						i_44_ = anInt1434 - 1;
					int i_45_ = i_43_ + i_29_ * anInt1432;
					for (int i_46_ = i_43_; i_46_ <= i_44_; i_46_++) {
						int i_47_ = (anIntArray1437[i_45_] >> 16 & 0xff) * i_23_;
						int i_48_ = (anIntArray1437[i_45_] >> 8 & 0xff) * i_23_;
						int i_49_ = (anIntArray1437[i_45_] & 0xff) * i_23_;
						int i_50_ = ((i_24_ + i_47_ >> 8 << 16) + (i_25_ + i_48_ >> 8 << 8) + (i_26_ + i_49_ >> 8));
						anIntArray1437[i_45_++] = i_50_;
					}
					i_29_++;
					i_34_ += i_32_ + i_32_;
					i_33_ += i_32_++ + i_32_;
				}
			}
		}
	}

	public static void method1461(int i, int i_51_, int i_52_, int i_53_) {
		if (i >= anInt1433 && i < anInt1434) {
			if (i_51_ < anInt1438) {
				i_52_ -= anInt1438 - i_51_;
				i_51_ = anInt1438;
			}
			if (i_51_ + i_52_ > anInt1436)
				i_52_ = anInt1436 - i_51_;
			int i_54_ = i + i_51_ * anInt1432;
			for (int i_55_ = 0; i_55_ < i_52_; i_55_++)
				anIntArray1437[i_54_ + i_55_ * anInt1432] = i_53_;
		}
	}

	public static void method1462(int i, int i_56_, int i_57_, int i_58_) {
		if (i_57_ == 0)
			method1457(i, i_56_, i_58_);
		else {
			if (i_57_ < 0)
				i_57_ = -i_57_;
			int i_59_ = i_56_ - i_57_;
			if (i_59_ < anInt1438)
				i_59_ = anInt1438;
			int i_60_ = i_56_ + i_57_ + 1;
			if (i_60_ > anInt1436)
				i_60_ = anInt1436;
			int i_61_ = i_59_;
			int i_62_ = i_57_ * i_57_;
			int i_63_ = 0;
			int i_64_ = i_56_ - i_61_;
			int i_65_ = i_64_ * i_64_;
			int i_66_ = i_65_ - i_64_;
			if (i_56_ > i_60_)
				i_56_ = i_60_;
			while (i_61_ < i_56_) {
				for (/**/; i_66_ <= i_62_ || i_65_ <= i_62_; i_66_ += i_63_++ + i_63_)
					i_65_ += i_63_ + i_63_;
				int i_67_ = i - i_63_ + 1;
				if (i_67_ < anInt1433)
					i_67_ = anInt1433;
				int i_68_ = i + i_63_;
				if (i_68_ > anInt1434)
					i_68_ = anInt1434;
				int i_69_ = i_67_ + i_61_ * anInt1432;
				for (int i_70_ = i_67_; i_70_ < i_68_; i_70_++)
					anIntArray1437[i_69_++] = i_58_;
				i_61_++;
				i_65_ -= i_64_-- + i_64_;
				i_66_ -= i_64_ + i_64_;
			}
			i_63_ = i_57_;
			i_64_ = i_61_ - i_56_;
			i_66_ = i_64_ * i_64_ + i_62_;
			i_65_ = i_66_ - i_63_;
			i_66_ -= i_64_;
			while (i_61_ < i_60_) {
				for (/**/; i_66_ > i_62_ && i_65_ > i_62_; i_65_ -= i_63_ + i_63_)
					i_66_ -= i_63_-- + i_63_;
				int i_71_ = i - i_63_;
				if (i_71_ < anInt1433)
					i_71_ = anInt1433;
				int i_72_ = i + i_63_;
				if (i_72_ > anInt1434 - 1)
					i_72_ = anInt1434 - 1;
				int i_73_ = i_71_ + i_61_ * anInt1432;
				for (int i_74_ = i_71_; i_74_ <= i_72_; i_74_++)
					anIntArray1437[i_73_++] = i_58_;
				i_61_++;
				i_66_ += i_64_ + i_64_;
				i_65_ += i_64_++ + i_64_;
			}
		}
	}

	public static void method1463() {
		anIntArray1437 = null;
		anIntArray1440 = null;
		anIntArray1439 = null;
	}
}
