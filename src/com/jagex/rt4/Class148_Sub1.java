/* Class148_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import rs.SD2DRaster;

public class Class148_Sub1 extends Class148 {
	private static void method2002(int[] is, byte[] is_0_, int[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = i;
		for (int i_11_ = -i_6_; i_11_ < 0; i_11_++) {
			int i_12_ = (i_2_ >> 16) * i_9_;
			for (int i_13_ = -i_5_; i_13_ < 0; i_13_++) {
				int i_14_ = is_0_[(i >> 16) + i_12_];
				if (i_14_ != 0)
					is[i_3_++] = is_1_[i_14_ & 0xff];
				else
					i_3_++;
				i += i_7_;
			}
			i_2_ += i_8_;
			i = i_10_;
			i_3_ += i_4_;
		}
	}
	private static void method2005(int[] is, byte[] is_35_, int[] is_36_, int i, int i_37_, int i_38_, int i_39_,
			int i_40_, int i_41_, int i_42_) {
		int i_43_ = -(i_39_ >> 2);
		i_39_ = -(i_39_ & 0x3);
		for (int i_44_ = -i_40_; i_44_ < 0; i_44_++) {
			for (int i_45_ = i_43_; i_45_ < 0; i_45_++) {
				i = is_35_[i_37_++];
				if (i != 0)
					is[i_38_++] = is_36_[i & 0xff];
				else
					i_38_++;
				i = is_35_[i_37_++];
				if (i != 0)
					is[i_38_++] = is_36_[i & 0xff];
				else
					i_38_++;
				i = is_35_[i_37_++];
				if (i != 0)
					is[i_38_++] = is_36_[i & 0xff];
				else
					i_38_++;
				i = is_35_[i_37_++];
				if (i != 0)
					is[i_38_++] = is_36_[i & 0xff];
				else
					i_38_++;
			}
			for (int i_46_ = i_39_; i_46_ < 0; i_46_++) {
				i = is_35_[i_37_++];
				if (i != 0)
					is[i_38_++] = is_36_[i & 0xff];
				else
					i_38_++;
			}
			i_38_ += i_41_;
			i_37_ += i_42_;
		}
	}

	private static void method2008(int[] is, byte[] is_67_, int[] is_68_, int i, int i_69_, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_) {
		int i_75_ = 256 - i_74_;
		for (int i_76_ = -i_71_; i_76_ < 0; i_76_++) {
			for (int i_77_ = -i_70_; i_77_ < 0; i_77_++) {
				int i_78_ = is_67_[i++];
				if (i_78_ != 0) {
					i_78_ = is_68_[i_78_ & 0xff];
					int i_79_ = is[i_69_];
					is[i_69_++] = ((((i_78_ & 0xff00ff) * i_74_ + (i_79_ & 0xff00ff) * i_75_) & ~0xff00ff)
							+ (((i_78_ & 0xff00) * i_74_ + (i_79_ & 0xff00) * i_75_) & 0xff0000)) >> 8;
				} else
					i_69_++;
			}
			i_69_ += i_72_;
			i += i_73_;
		}
	}

	public byte[] paletteIndicators;

	public int[] anIntArray3688;

	public Class148_Sub1(int i, int i_99_, int i_100_) {
		anInt2378 = width = i;
		anInt2373 = height = i_99_;
		anInt2375 = anInt2374 = 0;
		paletteIndicators = new byte[i * i_99_];
		anIntArray3688 = new int[i_100_];
	}

	public Class148_Sub1(int i, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, byte[] is, int[] is_97_) {
		anInt2378 = i;
		anInt2373 = i_92_;
		anInt2375 = i_93_;
		anInt2374 = i_94_;
		width = i_95_;
		height = i_96_;
		paletteIndicators = is;
		anIntArray3688 = is_97_;
	}

	public void method1999(int i, int i_24_, int i_25_) {
		i += anInt2375;
		i_24_ += anInt2374;
		int i_26_ = i + i_24_ * SD2DRaster.anInt1432;
		int i_27_ = 0;
		int i_28_ = height;
		int i_29_ = width;
		int i_30_ = SD2DRaster.anInt1432 - i_29_;
		int i_31_ = 0;
		if (i_24_ < SD2DRaster.anInt1438) {
			int i_32_ = SD2DRaster.anInt1438 - i_24_;
			i_28_ -= i_32_;
			i_24_ = SD2DRaster.anInt1438;
			i_27_ += i_32_ * i_29_;
			i_26_ += i_32_ * SD2DRaster.anInt1432;
		}
		if (i_24_ + i_28_ > SD2DRaster.anInt1436)
			i_28_ -= i_24_ + i_28_ - SD2DRaster.anInt1436;
		if (i < SD2DRaster.anInt1433) {
			int i_33_ = SD2DRaster.anInt1433 - i;
			i_29_ -= i_33_;
			i = SD2DRaster.anInt1433;
			i_27_ += i_33_;
			i_26_ += i_33_;
			i_31_ += i_33_;
			i_30_ += i_33_;
		}
		if (i + i_29_ > SD2DRaster.anInt1434) {
			int i_34_ = i + i_29_ - SD2DRaster.anInt1434;
			i_29_ -= i_34_;
			i_31_ += i_34_;
			i_30_ += i_34_;
		}
		if (i_29_ > 0 && i_28_ > 0)
			method2008(SD2DRaster.anIntArray1437, paletteIndicators, anIntArray3688, i_27_, i_26_, i_29_, i_28_, i_30_, i_31_,
					i_25_);
	}

	public void method2001(int i, int i_80_) {
		i += anInt2375;
		i_80_ += anInt2374;
		int i_81_ = i + i_80_ * SD2DRaster.anInt1432;
		int i_82_ = 0;
		int i_83_ = height;
		int i_84_ = width;
		int i_85_ = SD2DRaster.anInt1432 - i_84_;
		int i_86_ = 0;
		if (i_80_ < SD2DRaster.anInt1438) {
			int i_87_ = SD2DRaster.anInt1438 - i_80_;
			i_83_ -= i_87_;
			i_80_ = SD2DRaster.anInt1438;
			i_82_ += i_87_ * i_84_;
			i_81_ += i_87_ * SD2DRaster.anInt1432;
		}
		if (i_80_ + i_83_ > SD2DRaster.anInt1436)
			i_83_ -= i_80_ + i_83_ - SD2DRaster.anInt1436;
		if (i < SD2DRaster.anInt1433) {
			int i_88_ = SD2DRaster.anInt1433 - i;
			i_84_ -= i_88_;
			i = SD2DRaster.anInt1433;
			i_82_ += i_88_;
			i_81_ += i_88_;
			i_86_ += i_88_;
			i_85_ += i_88_;
		}
		if (i + i_84_ > SD2DRaster.anInt1434) {
			int i_89_ = i + i_84_ - SD2DRaster.anInt1434;
			i_84_ -= i_89_;
			i_86_ += i_89_;
			i_85_ += i_89_;
		}
		if (i_84_ > 0 && i_83_ > 0)
			method2005(SD2DRaster.anIntArray1437, paletteIndicators, anIntArray3688, 0, i_82_, i_81_, i_84_, i_83_, i_85_,
					i_86_);
	}

	public void method2003(int i, int i_15_, int i_16_) {
		for (int i_17_ = 0; i_17_ < anIntArray3688.length; i_17_++) {
			int i_18_ = anIntArray3688[i_17_] >> 16 & 0xff;
			i_18_ += i;
			if (i_18_ < 0)
				i_18_ = 0;
			else if (i_18_ > 255)
				i_18_ = 255;
			int i_19_ = anIntArray3688[i_17_] >> 8 & 0xff;
			i_19_ += i_15_;
			if (i_19_ < 0)
				i_19_ = 0;
			else if (i_19_ > 255)
				i_19_ = 255;
			int i_20_ = anIntArray3688[i_17_] & 0xff;
			i_20_ += i_16_;
			if (i_20_ < 0)
				i_20_ = 0;
			else if (i_20_ > 255)
				i_20_ = 255;
			anIntArray3688[i_17_] = (i_18_ << 16) + (i_19_ << 8) + i_20_;
		}
	}

	public void method2004() {
		byte[] is = new byte[width * height];
		int i = 0;
		for (int i_21_ = 0; i_21_ < width; i_21_++) {
			for (int i_22_ = height - 1; i_22_ >= 0; i_22_--)
				is[i++] = paletteIndicators[i_21_ + i_22_ * width];
		}
		paletteIndicators = is;
		int i_23_ = anInt2374;
		anInt2374 = anInt2375;
		anInt2375 = anInt2373 - height - i_23_;
		i_23_ = height;
		height = width;
		width = i_23_;
		i_23_ = anInt2373;
		anInt2373 = anInt2378;
		anInt2378 = i_23_;
	}

	public void method2006(int i, int i_47_, int i_48_, int i_49_) {
		int i_50_ = width;
		int i_51_ = height;
		int i_52_ = 0;
		int i_53_ = 0;
		int i_54_ = anInt2378;
		int i_55_ = anInt2373;
		int i_56_ = (i_54_ << 16) / i_48_;
		int i_57_ = (i_55_ << 16) / i_49_;
		if (anInt2375 > 0) {
			int i_58_ = ((anInt2375 << 16) + i_56_ - 1) / i_56_;
			i += i_58_;
			i_52_ += i_58_ * i_56_ - (anInt2375 << 16);
		}
		if (anInt2374 > 0) {
			int i_59_ = ((anInt2374 << 16) + i_57_ - 1) / i_57_;
			i_47_ += i_59_;
			i_53_ += i_59_ * i_57_ - (anInt2374 << 16);
		}
		if (i_50_ < i_54_)
			i_48_ = ((i_50_ << 16) - i_52_ + i_56_ - 1) / i_56_;
		if (i_51_ < i_55_)
			i_49_ = ((i_51_ << 16) - i_53_ + i_57_ - 1) / i_57_;
		int i_60_ = i + i_47_ * SD2DRaster.anInt1432;
		int i_61_ = SD2DRaster.anInt1432 - i_48_;
		if (i_47_ + i_49_ > SD2DRaster.anInt1436)
			i_49_ -= i_47_ + i_49_ - SD2DRaster.anInt1436;
		if (i_47_ < SD2DRaster.anInt1438) {
			int i_62_ = SD2DRaster.anInt1438 - i_47_;
			i_49_ -= i_62_;
			i_60_ += i_62_ * SD2DRaster.anInt1432;
			i_53_ += i_57_ * i_62_;
		}
		if (i + i_48_ > SD2DRaster.anInt1434) {
			int i_63_ = i + i_48_ - SD2DRaster.anInt1434;
			i_48_ -= i_63_;
			i_61_ += i_63_;
		}
		if (i < SD2DRaster.anInt1433) {
			int i_64_ = SD2DRaster.anInt1433 - i;
			i_48_ -= i_64_;
			i_60_ += i_64_;
			i_52_ += i_56_ * i_64_;
			i_61_ += i_64_;
		}
		method2002(SD2DRaster.anIntArray1437, paletteIndicators, anIntArray3688, i_52_, i_53_, i_60_, i_61_, i_48_, i_49_,
				i_56_, i_57_, i_50_);
	}

	public Class148_Sub1 method2007() {
		Class148_Sub1 class148_sub1_65_ = new Class148_Sub1(width, height, anIntArray3688.length);
		class148_sub1_65_.anInt2378 = anInt2378;
		class148_sub1_65_.anInt2373 = anInt2373;
		class148_sub1_65_.anInt2375 = anInt2375;
		class148_sub1_65_.anInt2374 = anInt2374;
		int i = paletteIndicators.length;
		for (int i_66_ = 0; i_66_ < i; i_66_++)
			class148_sub1_65_.paletteIndicators[i_66_] = paletteIndicators[i_66_];
		class148_sub1_65_.anIntArray3688 = anIntArray3688;
		return class148_sub1_65_;
	}

	public void method2009() {
		if (width != anInt2378 || height != anInt2373) {
			byte[] is = new byte[anInt2378 * anInt2373];
			int i = 0;
			for (int i_90_ = 0; i_90_ < height; i_90_++) {
				for (int i_91_ = 0; i_91_ < width; i_91_++)
					is[i_91_ + anInt2375 + (i_90_ + anInt2374) * anInt2378] = paletteIndicators[i++];
			}
			paletteIndicators = is;
			width = anInt2378;
			height = anInt2373;
			anInt2375 = 0;
			anInt2374 = 0;
		}
	}

	public void method2010() {
		int i = 0;
		int i_98_ = paletteIndicators.length - 7;
		while (i < i_98_) {
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
			paletteIndicators[i++] = (byte) 0;
		}
		i_98_ += 7;
		while (i < i_98_)
			paletteIndicators[i++] = (byte) 0;
	}
}
