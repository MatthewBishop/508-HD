/* Class14_Sub2_Sub16_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class14_Sub2_Sub16_Sub1 extends Class14_Sub2_Sub16 {
	private static void method369(int[] is, byte[] is_12_, int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_,
			int i_18_, int i_19_) {
		i = ((i & 0xff00ff) * i_19_ & ~0xff00ff) + ((i & 0xff00) * i_19_ & 0xff0000) >> 8;
		i_19_ = 256 - i_19_;
		for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
			for (int i_21_ = -i_15_; i_21_ < 0; i_21_++) {
				if (is_12_[i_13_++] != 0) {
					int i_22_ = is[i_14_];
					is[i_14_++] = ((((i_22_ & 0xff00ff) * i_19_ & ~0xff00ff)
							+ ((i_22_ & 0xff00) * i_19_ & 0xff0000)) >> 8) + i;
				} else
					i_14_++;
			}
			i_14_ += i_17_;
			i_13_ += i_18_;
		}
	}

	private static void method370(int[] is, byte[] is_23_, int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_,
			int i_29_, int i_30_, int i_31_, int[] is_32_, int[] is_33_) {
		int i_34_ = i - Class92.anInt1433;
		int i_35_ = i_24_ - Class92.anInt1438;
		for (int i_36_ = i_35_; i_36_ < i_35_ + i_26_; i_36_++) {
			int i_37_ = is_32_[i_36_];
			int i_38_ = is_33_[i_36_];
			int i_39_ = i_25_;
			if (i_34_ > i_37_) {
				int i_40_ = i_34_ - i_37_;
				if (i_40_ >= i_38_) {
					i_28_ += i_25_ + i_31_;
					i_29_ += i_25_ + i_30_;
					continue;
				}
				i_38_ -= i_40_;
			} else {
				int i_41_ = i_37_ - i_34_;
				if (i_41_ >= i_25_) {
					i_28_ += i_25_ + i_31_;
					i_29_ += i_25_ + i_30_;
					continue;
				}
				i_28_ += i_41_;
				i_39_ -= i_41_;
				i_29_ += i_41_;
			}
			int i_42_ = 0;
			if (i_39_ < i_38_)
				i_38_ = i_39_;
			else
				i_42_ = i_39_ - i_38_;
			for (int i_43_ = -i_38_; i_43_ < 0; i_43_++) {
				if (is_23_[i_28_++] != 0)
					Class92.anIntArray1437[i_29_++] = i_27_;
				else
					i_29_++;
			}
			i_28_ += i_42_ + i_31_;
			i_29_ += i_42_ + i_30_;
		}
	}

	private static void method371(int[] is, byte[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_,
			int i_68_) {
		int i_69_ = -(i_65_ >> 2);
		i_65_ = -(i_65_ & 0x3);
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
				if (is_62_[i_63_++] != 0)
					is[i_64_++] = i;
				else
					i_64_++;
				if (is_62_[i_63_++] != 0)
					is[i_64_++] = i;
				else
					i_64_++;
				if (is_62_[i_63_++] != 0)
					is[i_64_++] = i;
				else
					i_64_++;
				if (is_62_[i_63_++] != 0)
					is[i_64_++] = i;
				else
					i_64_++;
			}
			for (int i_72_ = i_65_; i_72_ < 0; i_72_++) {
				if (is_62_[i_63_++] != 0)
					is[i_64_++] = i;
				else
					i_64_++;
			}
			i_64_ += i_67_;
			i_63_ += i_68_;
		}
	}

	public byte[][] aByteArrayArray5065;

	public Class14_Sub2_Sub16_Sub1(byte[] is) {
		super(is);
		aByteArrayArray5065 = new byte[256][];
	}

	public Class14_Sub2_Sub16_Sub1(byte[] is, int[] is_57_, int[] is_58_, int[] is_59_, int[] is_60_, byte[][] is_61_) {
		super(is, is_57_, is_58_, is_59_, is_60_);
		aByteArrayArray5065 = new byte[256][];
		aByteArrayArray5065 = is_61_;
	}

	public void method349(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool) {
		int i_5_ = i_0_ + i_1_ * Class92.anInt1432;
		int i_6_ = Class92.anInt1432 - i_2_;
		int i_7_ = 0;
		int i_8_ = 0;
		if (i_1_ < Class92.anInt1438) {
			int i_9_ = Class92.anInt1438 - i_1_;
			i_3_ -= i_9_;
			i_1_ = Class92.anInt1438;
			i_8_ += i_9_ * i_2_;
			i_5_ += i_9_ * Class92.anInt1432;
		}
		if (i_1_ + i_3_ > Class92.anInt1436)
			i_3_ -= i_1_ + i_3_ - Class92.anInt1436;
		if (i_0_ < Class92.anInt1433) {
			int i_10_ = Class92.anInt1433 - i_0_;
			i_2_ -= i_10_;
			i_0_ = Class92.anInt1433;
			i_8_ += i_10_;
			i_5_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
		}
		if (i_0_ + i_2_ > Class92.anInt1434) {
			int i_11_ = i_0_ + i_2_ - Class92.anInt1434;
			i_2_ -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}
		if (i_2_ > 0 && i_3_ > 0) {
			if (Class92.anIntArray1440 != null)
				method370(Class92.anIntArray1437, aByteArrayArray5065[i], i_0_, i_1_, i_2_, i_3_, i_4_, i_8_, i_5_,
						i_6_, i_7_, Class92.anIntArray1440, Class92.anIntArray1439);
			else
				method371(Class92.anIntArray1437, aByteArrayArray5065[i], i_4_, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
		}
	}

	public void method363(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, boolean bool) {
		int i_50_ = i_44_ + i_45_ * Class92.anInt1432;
		int i_51_ = Class92.anInt1432 - i_46_;
		int i_52_ = 0;
		int i_53_ = 0;
		if (i_45_ < Class92.anInt1438) {
			int i_54_ = Class92.anInt1438 - i_45_;
			i_47_ -= i_54_;
			i_45_ = Class92.anInt1438;
			i_53_ += i_54_ * i_46_;
			i_50_ += i_54_ * Class92.anInt1432;
		}
		if (i_45_ + i_47_ > Class92.anInt1436)
			i_47_ -= i_45_ + i_47_ - Class92.anInt1436;
		if (i_44_ < Class92.anInt1433) {
			int i_55_ = Class92.anInt1433 - i_44_;
			i_46_ -= i_55_;
			i_44_ = Class92.anInt1433;
			i_53_ += i_55_;
			i_50_ += i_55_;
			i_52_ += i_55_;
			i_51_ += i_55_;
		}
		if (i_44_ + i_46_ > Class92.anInt1434) {
			int i_56_ = i_44_ + i_46_ - Class92.anInt1434;
			i_46_ -= i_56_;
			i_52_ += i_56_;
			i_51_ += i_56_;
		}
		if (i_46_ > 0 && i_47_ > 0)
			method369(Class92.anIntArray1437, aByteArrayArray5065[i], i_48_, i_53_, i_50_, i_46_, i_47_, i_51_, i_52_,
					i_49_);
	}
}
