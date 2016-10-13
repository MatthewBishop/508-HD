/* Class26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.util.Random;

import com.jagex.image.transform.TexStatic;
import com.jagex.util.RandomUtil;

public abstract class Class26 {
	public int anInt483;

	public int anInt484;

	public int anInt485;

	public int anInt492;

	public int anInt498;

	public short[] aShortArray487 = new short[512];

	public short[] aShortArray496;

	public Class26(int i, int i_166_, int i_167_, int i_168_, int i_169_) {
		anInt485 = 0;
		anInt483 = 4;
		anInt492 = 4;
		anInt484 = 4;
		anInt498 = 4;
		anInt484 = i_166_;
		anInt492 = i_167_;
		anInt498 = i_169_;
		anInt485 = i;
		anInt483 = i_168_;
		method1019();
		method1015();
	}

	public abstract void method1011(int i, int i_29_, byte i_30_);

	public abstract void method1012(int i);

	public abstract void method1013(int i);

	public void method1015() {
		Random random = new Random((long) anInt485);
		for (int i_31_ = 0; i_31_ < 255; i_31_++)
			aShortArray487[i_31_] = (short) i_31_;
		for (int i_32_ = 0; i_32_ < 255; i_32_++) {
			int i_33_ = -i_32_ + 255;
			int i_34_ = RandomUtil.method1949(random, i_33_);
			short i_35_ = aShortArray487[i_34_];
			aShortArray487[i_34_] = aShortArray487[i_33_];
			aShortArray487[i_33_] = aShortArray487[i_33_ + 256] = i_35_;
		}
	}

	public void method1019() {
		aShortArray496 = new short[anInt484];
		for (int i_82_ = 0; anInt484 > i_82_; i_82_++)
			aShortArray496[i_82_] = (short) (int) Math.pow(2.0, (double) i_82_);
	}

	public void method1020(int i, int i_83_, int i_84_, int i_85_l) {
		int[] is = new int[i_84_];
		int[] is_86_ = new int[i];
		for (int i_87_ = 0; i_87_ < i_84_; i_87_++)
			is[i_87_] = (i_87_ << 12) / i_84_;
		for (int i_88_ = 0; i > i_88_; i_88_++)
			is_86_[i_88_] = (i_88_ << 12) / i;
		int[] is_89_ = new int[i_83_];
		for (int i_90_ = 0; i_83_ > i_90_; i_90_++)
			is_89_[i_90_] = (i_90_ << 44) / i_83_;
		method1013(-23880);
		for (int i_91_ = 0; i_91_ < i_83_; i_91_++) {
			for (int i_92_ = 0; i_92_ < i; i_92_++) {
				for (int i_93_ = 0; i_93_ < i_84_; i_93_++) {
					for (int i_94_ = 0; i_94_ < anInt484; i_94_++) {
						int i_95_ = aShortArray496[i_94_] << 12;
						int i_96_ = is_89_[i_91_] * i_95_ >> 12;
						i_96_ *= anInt498;
						int i_97_ = is[i_93_] * i_95_ >> 12;
						int i_98_ = anInt498 * i_95_ >> 12;
						int i_99_ = i_95_ * anInt483 >> 12;
						int i_100_ = i_95_ * is_86_[i_92_] >> 12;
						int i_101_ = i_96_ >> 44;
						int i_102_ = i_101_ + 1;
						i_100_ *= anInt483;
						i_97_ *= anInt492;
						int i_103_ = i_97_ >> 44;
						i_97_ &= 0xfff;
						if (i_98_ <= i_102_)
							i_102_ = 0;
						else
							i_102_ &= 0xff;
						int i_104_ = TexStatic.anIntArray468[i_97_];
						i_96_ &= 0xfff;
						i_101_ &= 0xff;
						int i_105_ = i_100_ >> 44;
						i_100_ &= 0xfff;
						int i_106_ = aShortArray487[i_102_];
						int i_107_ = i_96_ - 4096;
						int i_108_ = i_103_ + 1;
						int i_109_ = TexStatic.anIntArray468[i_96_];
						int i_110_ = aShortArray487[i_101_];
						int i_111_ = i_100_ - 4096;
						int i_112_ = TexStatic.anIntArray468[i_100_];
						i_103_ &= 0xff;
						int i_113_ = i_97_ - 4096;
						int i_114_ = i_105_ + 1;
						if (i_114_ >= i_99_)
							i_114_ = 0;
						else
							i_114_ &= 0xff;
						int i_115_ = anInt492 * i_95_ >> 12;
						i_105_ &= 0xff;
						int i_116_ = aShortArray487[i_114_ + i_110_];
						int i_117_ = aShortArray487[i_110_ + i_105_];
						if (i_115_ <= i_108_)
							i_108_ = 0;
						else
							i_108_ &= 0xff;
						int i_118_ = aShortArray487[i_114_ + i_106_];
						int i_119_ = aShortArray487[i_105_ + i_106_];
						int i_120_ = Class26.method1786(i_97_, (aShortArray487[i_103_ + i_117_]), i_100_, i_96_);
						int i_121_ = Class26.method1786(i_113_, (aShortArray487[i_108_ + i_117_]), i_100_, i_96_);
						int i_122_ = ((i_121_ - i_120_) * i_104_ >> 44) + i_120_;
						i_120_ = Class26.method1786(i_97_, (aShortArray487[i_103_ + i_116_]), i_111_, i_96_);
						i_121_ = Class26.method1786(i_113_, (aShortArray487[i_116_ + i_108_]), i_111_, i_96_);
						int i_123_ = i_120_ + ((-i_120_ + i_121_) * i_104_ >> 12);
						int i_124_ = ((i_123_ - i_122_) * i_112_ >> 12) + i_122_;
						i_120_ = Class26.method1786(i_97_, (aShortArray487[i_119_ + i_103_]), i_100_, i_107_);
						i_121_ = Class26.method1786(i_113_, (aShortArray487[i_119_ + i_108_]), i_100_, i_107_);
						i_122_ = i_120_ + ((i_121_ - i_120_) * i_104_ >> 12);
						i_120_ = Class26.method1786(i_97_, (aShortArray487[i_103_ + i_118_]), i_111_, i_107_);
						i_121_ = Class26.method1786(i_113_, (aShortArray487[i_118_ + i_108_]), i_111_, i_107_);
						i_123_ = i_120_ + (i_104_ * (i_121_ - i_120_) >> 12);
						int i_125_ = i_122_ + (i_112_ * (i_123_ - i_122_) >> 12);
						method1011(i_94_, (((-i_124_ + i_125_) * i_109_ >> 44) + i_124_), (byte) -113);
					}
					method1012(0);
				}
			}
		}
	}

	public static int method1786(int i, int i_11_, int i_13_, int i_14_) {
		int i_15_ = i_11_ & 0xf;
		int i_16_ = i_15_ < 8 ? i : i_13_;
		int i_18_ = i_15_ < 4 ? i_13_ : i_15_ == 12 || i_15_ == 14 ? i : i_14_;
		int i_19_ = (((i_15_ & 0x1) == 0 ? i_16_ : -i_16_) + ((i_15_ & 0x2) != 0 ? -i_18_ : i_18_));
		return i_19_;
	}
}
