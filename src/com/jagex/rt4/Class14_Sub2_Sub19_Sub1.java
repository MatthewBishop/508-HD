/* Class14_Sub2_Sub19_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import rs.Class92;

public class Class14_Sub2_Sub19_Sub1 extends Class14_Sub2_Sub19 {
	public int[] anIntArray5088;

	public void method389(int i, int i_0_, int i_1_, int i_2_) {
		if (i_1_ > 0 && i_2_ > 0) {
			int i_3_ = anInt4035;
			int i_4_ = anInt4042;
			int i_5_ = 0;
			int i_6_ = 0;
			int i_7_ = anInt4034;
			int i_8_ = anInt4046;
			int i_9_ = (i_7_ << 16) / i_1_;
			int i_10_ = (i_8_ << 16) / i_2_;
			if (anInt4033 > 0) {
				int i_11_ = ((anInt4033 << 16) + i_9_ - 1) / i_9_;
				i += i_11_;
				i_5_ += i_11_ * i_9_ - (anInt4033 << 16);
			}
			if (anInt4050 > 0) {
				int i_12_ = ((anInt4050 << 16) + i_10_ - 1) / i_10_;
				i_0_ += i_12_;
				i_6_ += i_12_ * i_10_ - (anInt4050 << 16);
			}
			if (i_3_ < i_7_)
				i_1_ = ((i_3_ << 16) - i_5_ + i_9_ - 1) / i_9_;
			if (i_4_ < i_8_)
				i_2_ = ((i_4_ << 16) - i_6_ + i_10_ - 1) / i_10_;
			int i_13_ = i + i_0_ * Class92.anInt1432;
			int i_14_ = Class92.anInt1432 - i_1_;
			if (i_0_ + i_2_ > Class92.anInt1436)
				i_2_ -= i_0_ + i_2_ - Class92.anInt1436;
			if (i_0_ < Class92.anInt1438) {
				int i_15_ = Class92.anInt1438 - i_0_;
				i_2_ -= i_15_;
				i_13_ += i_15_ * Class92.anInt1432;
				i_6_ += i_10_ * i_15_;
			}
			if (i + i_1_ > Class92.anInt1434) {
				int i_16_ = i + i_1_ - Class92.anInt1434;
				i_1_ -= i_16_;
				i_14_ += i_16_;
			}
			if (i < Class92.anInt1433) {
				int i_17_ = Class92.anInt1433 - i;
				i_1_ -= i_17_;
				i_13_ += i_17_;
				i_5_ += i_9_ * i_17_;
				i_14_ += i_17_;
			}
			method414(Class92.anIntArray1437, anIntArray5088, 0, i_5_, i_6_, i_13_, i_14_, i_1_, i_2_, i_9_, i_10_,
					i_3_);
		}
	}

	public void method391(int i, int i_18_) {
		i += anInt4033;
		i_18_ += anInt4050;
		int i_19_ = i + i_18_ * Class92.anInt1432;
		int i_20_ = 0;
		int i_21_ = anInt4042;
		int i_22_ = anInt4035;
		int i_23_ = Class92.anInt1432 - i_22_;
		int i_24_ = 0;
		if (i_18_ < Class92.anInt1438) {
			int i_25_ = Class92.anInt1438 - i_18_;
			i_21_ -= i_25_;
			i_18_ = Class92.anInt1438;
			i_20_ += i_25_ * i_22_;
			i_19_ += i_25_ * Class92.anInt1432;
		}
		if (i_18_ + i_21_ > Class92.anInt1436)
			i_21_ -= i_18_ + i_21_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_26_ = Class92.anInt1433 - i;
			i_22_ -= i_26_;
			i = Class92.anInt1433;
			i_20_ += i_26_;
			i_19_ += i_26_;
			i_24_ += i_26_;
			i_23_ += i_26_;
		}
		if (i + i_22_ > Class92.anInt1434) {
			int i_27_ = i + i_22_ - Class92.anInt1434;
			i_22_ -= i_27_;
			i_24_ += i_27_;
			i_23_ += i_27_;
		}
		if (i_22_ > 0 && i_21_ > 0)
			method401(Class92.anIntArray1437, anIntArray5088, 0, i_20_, i_19_, i_22_, i_21_, i_23_, i_24_);
	}

	public static void method401(int[] is, int[] is_28_, int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_,
			int i_34_) {
		int i_35_ = -(i_31_ >> 2);
		i_31_ = -(i_31_ & 0x3);
		for (int i_36_ = -i_32_; i_36_ < 0; i_36_++) {
			for (int i_37_ = i_35_; i_37_ < 0; i_37_++) {
				i = is_28_[i_29_++];
				if (i != 0)
					is[i_30_++] = i;
				else
					i_30_++;
				i = is_28_[i_29_++];
				if (i != 0)
					is[i_30_++] = i;
				else
					i_30_++;
				i = is_28_[i_29_++];
				if (i != 0)
					is[i_30_++] = i;
				else
					i_30_++;
				i = is_28_[i_29_++];
				if (i != 0)
					is[i_30_++] = i;
				else
					i_30_++;
			}
			for (int i_38_ = i_31_; i_38_ < 0; i_38_++) {
				i = is_28_[i_29_++];
				if (i != 0)
					is[i_30_++] = i;
				else
					i_30_++;
			}
			i_30_ += i_33_;
			i_29_ += i_34_;
		}
	}

	public void method396(int i, int i_39_, int i_40_, int i_41_, int i_42_) {
		if (i_40_ > 0 && i_41_ > 0) {
			int i_43_ = anInt4035;
			int i_44_ = anInt4042;
			int i_45_ = 0;
			int i_46_ = 0;
			int i_47_ = anInt4034;
			int i_48_ = anInt4046;
			int i_49_ = (i_47_ << 16) / i_40_;
			int i_50_ = (i_48_ << 16) / i_41_;
			if (anInt4033 > 0) {
				int i_51_ = ((anInt4033 << 16) + i_49_ - 1) / i_49_;
				i += i_51_;
				i_45_ += i_51_ * i_49_ - (anInt4033 << 16);
			}
			if (anInt4050 > 0) {
				int i_52_ = ((anInt4050 << 16) + i_50_ - 1) / i_50_;
				i_39_ += i_52_;
				i_46_ += i_52_ * i_50_ - (anInt4050 << 16);
			}
			if (i_43_ < i_47_)
				i_40_ = ((i_43_ << 16) - i_45_ + i_49_ - 1) / i_49_;
			if (i_44_ < i_48_)
				i_41_ = ((i_44_ << 16) - i_46_ + i_50_ - 1) / i_50_;
			int i_53_ = i + i_39_ * Class92.anInt1432;
			int i_54_ = Class92.anInt1432 - i_40_;
			if (i_39_ + i_41_ > Class92.anInt1436)
				i_41_ -= i_39_ + i_41_ - Class92.anInt1436;
			if (i_39_ < Class92.anInt1438) {
				int i_55_ = Class92.anInt1438 - i_39_;
				i_41_ -= i_55_;
				i_53_ += i_55_ * Class92.anInt1432;
				i_46_ += i_50_ * i_55_;
			}
			if (i + i_40_ > Class92.anInt1434) {
				int i_56_ = i + i_40_ - Class92.anInt1434;
				i_40_ -= i_56_;
				i_54_ += i_56_;
			}
			if (i < Class92.anInt1433) {
				int i_57_ = Class92.anInt1433 - i;
				i_40_ -= i_57_;
				i_53_ += i_57_;
				i_45_ += i_49_ * i_57_;
				i_54_ += i_57_;
			}
			method409(Class92.anIntArray1437, anIntArray5088, 0, i_45_, i_46_, i_53_, i_54_, i_40_, i_41_, i_49_, i_50_,
					i_43_, i_42_);
		}
	}

	public void method402(int i) {
		if (anInt4035 != anInt4034 || anInt4042 != anInt4046) {
			int i_58_ = i;
			if (i_58_ > anInt4033)
				i_58_ = anInt4033;
			int i_59_ = i;
			if (i_59_ + anInt4033 + anInt4035 > anInt4034)
				i_59_ = anInt4034 - anInt4033 - anInt4035;
			int i_60_ = i;
			if (i_60_ > anInt4050)
				i_60_ = anInt4050;
			int i_61_ = i;
			if (i_61_ + anInt4050 + anInt4042 > anInt4046)
				i_61_ = anInt4046 - anInt4050 - anInt4042;
			int i_62_ = anInt4035 + i_58_ + i_59_;
			int i_63_ = anInt4042 + i_60_ + i_61_;
			int[] is = new int[i_62_ * i_63_];
			for (int i_64_ = 0; i_64_ < anInt4042; i_64_++) {
				for (int i_65_ = 0; i_65_ < anInt4035; i_65_++)
					is[(i_64_ + i_60_) * i_62_ + (i_65_ + i_58_)] = anIntArray5088[i_64_ * anInt4035 + i_65_];
			}
			anIntArray5088 = is;
			anInt4035 = i_62_;
			anInt4042 = i_63_;
			anInt4033 -= i_58_;
			anInt4050 -= i_60_;
		}
	}

	public static void method403(int[] is, int[] is_66_, int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_,
			int i_72_, int i_73_, int i_74_) {
		int i_75_ = 256 - i_73_;
		int i_76_ = (i_74_ & 0xff00ff) * i_75_ & ~0xff00ff;
		int i_77_ = (i_74_ & 0xff00) * i_75_ & 0xff0000;
		i_74_ = (i_76_ | i_77_) >>> 8;
		for (int i_78_ = -i_70_; i_78_ < 0; i_78_++) {
			for (int i_79_ = -i_69_; i_79_ < 0; i_79_++) {
				i = is_66_[i_67_++];
				if (i != 0) {
					i_76_ = (i & 0xff00ff) * i_73_ & ~0xff00ff;
					i_77_ = (i & 0xff00) * i_73_ & 0xff0000;
					is[i_68_++] = ((i_76_ | i_77_) >>> 8) + i_74_;
				} else
					i_68_++;
			}
			i_68_ += i_71_;
			i_67_ += i_72_;
		}
	}

	public void method404() {
		if (anInt4035 != anInt4034 || anInt4042 != anInt4046) {
			int[] is = new int[anInt4034 * anInt4046];
			for (int i = 0; i < anInt4042; i++) {
				for (int i_80_ = 0; i_80_ < anInt4035; i_80_++)
					is[(i + anInt4050) * anInt4034 + (i_80_ + anInt4033)] = anIntArray5088[i * anInt4035 + i_80_];
			}
			anIntArray5088 = is;
			anInt4035 = anInt4034;
			anInt4042 = anInt4046;
			anInt4033 = 0;
			anInt4050 = 0;
		}
	}

	public void method398(int i, int i_81_, int i_82_) {
		i += anInt4033;
		i_81_ += anInt4050;
		int i_83_ = i + i_81_ * Class92.anInt1432;
		int i_84_ = 0;
		int i_85_ = anInt4042;
		int i_86_ = anInt4035;
		int i_87_ = Class92.anInt1432 - i_86_;
		int i_88_ = 0;
		if (i_81_ < Class92.anInt1438) {
			int i_89_ = Class92.anInt1438 - i_81_;
			i_85_ -= i_89_;
			i_81_ = Class92.anInt1438;
			i_84_ += i_89_ * i_86_;
			i_83_ += i_89_ * Class92.anInt1432;
		}
		if (i_81_ + i_85_ > Class92.anInt1436)
			i_85_ -= i_81_ + i_85_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_90_ = Class92.anInt1433 - i;
			i_86_ -= i_90_;
			i = Class92.anInt1433;
			i_84_ += i_90_;
			i_83_ += i_90_;
			i_88_ += i_90_;
			i_87_ += i_90_;
		}
		if (i + i_86_ > Class92.anInt1434) {
			int i_91_ = i + i_86_ - Class92.anInt1434;
			i_86_ -= i_91_;
			i_88_ += i_91_;
			i_87_ += i_91_;
		}
		if (i_86_ > 0 && i_85_ > 0)
			method407(Class92.anIntArray1437, anIntArray5088, 0, i_84_, i_83_, i_86_, i_85_, i_87_, i_88_, i_82_);
	}

	public static void method405(int[] is, int[] is_92_, int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_) {
		for (int i_98_ = -i_95_; i_98_ < 0; i_98_++) {
			int i_99_ = i_93_ + i_94_ - 3;
			while (i_93_ < i_99_) {
				is[i_93_++] = is_92_[i++];
				is[i_93_++] = is_92_[i++];
				is[i_93_++] = is_92_[i++];
				is[i_93_++] = is_92_[i++];
			}
			i_99_ += 3;
			while (i_93_ < i_99_)
				is[i_93_++] = is_92_[i++];
			i_93_ += i_96_;
			i += i_97_;
		}
	}

	public void method406() {
		int[] is = new int[anInt4035 * anInt4042];
		int i = 0;
		for (int i_100_ = anInt4042 - 1; i_100_ >= 0; i_100_--) {
			for (int i_101_ = 0; i_101_ < anInt4035; i_101_++)
				is[i++] = anIntArray5088[i_101_ + i_100_ * anInt4035];
		}
		anIntArray5088 = is;
		anInt4050 = anInt4046 - anInt4042 - anInt4050;
	}

	public static void method407(int[] is, int[] is_102_, int i, int i_103_, int i_104_, int i_105_, int i_106_,
			int i_107_, int i_108_, int i_109_) {
		int i_110_ = 256 - i_109_;
		for (int i_111_ = -i_106_; i_111_ < 0; i_111_++) {
			for (int i_112_ = -i_105_; i_112_ < 0; i_112_++) {
				i = is_102_[i_103_++];
				if (i != 0) {
					int i_113_ = is[i_104_];
					is[i_104_++] = ((((i & 0xff00ff) * i_109_ + (i_113_ & 0xff00ff) * i_110_) & ~0xff00ff)
							+ (((i & 0xff00) * i_109_ + (i_113_ & 0xff00) * i_110_) & 0xff0000)) >> 8;
				} else
					i_104_++;
			}
			i_104_ += i_107_;
			i_103_ += i_108_;
		}
	}

	public void method408(int i) {
		for (int i_114_ = anInt4042 - 1; i_114_ > 0; i_114_--) {
			int i_115_ = i_114_ * anInt4035;
			for (int i_116_ = anInt4035 - 1; i_116_ > 0; i_116_--) {
				if (anIntArray5088[i_116_ + i_115_] == 0 && anIntArray5088[i_116_ + i_115_ - 1 - anInt4035] != 0)
					anIntArray5088[i_116_ + i_115_] = i;
			}
		}
	}

	public static void method409(int[] is, int[] is_117_, int i, int i_118_, int i_119_, int i_120_, int i_121_,
			int i_122_, int i_123_, int i_124_, int i_125_, int i_126_, int i_127_) {
		int i_128_ = 256 - i_127_;
		int i_129_ = i_118_;
		for (int i_130_ = -i_123_; i_130_ < 0; i_130_++) {
			int i_131_ = (i_119_ >> 16) * i_126_;
			for (int i_132_ = -i_122_; i_132_ < 0; i_132_++) {
				i = is_117_[(i_118_ >> 16) + i_131_];
				if (i != 0) {
					int i_133_ = is[i_120_];
					is[i_120_++] = ((((i & 0xff00ff) * i_127_ + (i_133_ & 0xff00ff) * i_128_) & ~0xff00ff)
							+ (((i & 0xff00) * i_127_ + (i_133_ & 0xff00) * i_128_) & 0xff0000)) >> 8;
				} else
					i_120_++;
				i_118_ += i_124_;
			}
			i_119_ += i_125_;
			i_118_ = i_129_;
			i_120_ += i_121_;
		}
	}

	public void method410(int i, int i_134_, int i_135_) {
		for (int i_136_ = 0; i_136_ < anIntArray5088.length; i_136_++) {
			int i_137_ = anIntArray5088[i_136_];
			if (i_137_ != 0) {
				int i_138_ = i_137_ >> 16 & 0xff;
				i_138_ += i;
				if (i_138_ < 1)
					i_138_ = 1;
				else if (i_138_ > 255)
					i_138_ = 255;
				int i_139_ = i_137_ >> 8 & 0xff;
				i_139_ += i_134_;
				if (i_139_ < 1)
					i_139_ = 1;
				else if (i_139_ > 255)
					i_139_ = 255;
				int i_140_ = i_137_ & 0xff;
				i_140_ += i_135_;
				if (i_140_ < 1)
					i_140_ = 1;
				else if (i_140_ > 255)
					i_140_ = 255;
				anIntArray5088[i_136_] = (i_138_ << 16) + (i_139_ << 8) + i_140_;
			}
		}
	}

	public void method390(int i, int i_141_) {
		i += anInt4033;
		i_141_ += anInt4050;
		int i_142_ = i + i_141_ * Class92.anInt1432;
		int i_143_ = 0;
		int i_144_ = anInt4042;
		int i_145_ = anInt4035;
		int i_146_ = Class92.anInt1432 - i_145_;
		int i_147_ = 0;
		if (i_141_ < Class92.anInt1438) {
			int i_148_ = Class92.anInt1438 - i_141_;
			i_144_ -= i_148_;
			i_141_ = Class92.anInt1438;
			i_143_ += i_148_ * i_145_;
			i_142_ += i_148_ * Class92.anInt1432;
		}
		if (i_141_ + i_144_ > Class92.anInt1436)
			i_144_ -= i_141_ + i_144_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_149_ = Class92.anInt1433 - i;
			i_145_ -= i_149_;
			i = Class92.anInt1433;
			i_143_ += i_149_;
			i_142_ += i_149_;
			i_147_ += i_149_;
			i_146_ += i_149_;
		}
		if (i + i_145_ > Class92.anInt1434) {
			int i_150_ = i + i_145_ - Class92.anInt1434;
			i_145_ -= i_150_;
			i_147_ += i_150_;
			i_146_ += i_150_;
		}
		if (i_145_ > 0 && i_144_ > 0)
			method405(Class92.anIntArray1437, anIntArray5088, i_143_, i_142_, i_145_, i_144_, i_146_, i_147_);
	}

	public void method411(int i) {
		int[] is = new int[anInt4035 * anInt4042];
		int i_151_ = 0;
		for (int i_152_ = 0; i_152_ < anInt4042; i_152_++) {
			for (int i_153_ = 0; i_153_ < anInt4035; i_153_++) {
				int i_154_ = anIntArray5088[i_151_];
				if (i_154_ == 0) {
					if (i_153_ > 0 && anIntArray5088[i_151_ - 1] != 0)
						i_154_ = i;
					else if (i_152_ > 0 && anIntArray5088[i_151_ - anInt4035] != 0)
						i_154_ = i;
					else if (i_153_ < anInt4035 - 1 && anIntArray5088[i_151_ + 1] != 0)
						i_154_ = i;
					else if (i_152_ < anInt4042 - 1 && anIntArray5088[i_151_ + anInt4035] != 0)
						i_154_ = i;
				}
				is[i_151_++] = i_154_;
			}
		}
		anIntArray5088 = is;
	}

	public void method412() {
		int[] is = new int[anInt4035 * anInt4042];
		int i = 0;
		for (int i_155_ = 0; i_155_ < anInt4042; i_155_++) {
			for (int i_156_ = anInt4035 - 1; i_156_ >= 0; i_156_--)
				is[i++] = anIntArray5088[i_156_ + i_155_ * anInt4035];
		}
		anIntArray5088 = is;
		anInt4033 = anInt4034 - anInt4035 - anInt4033;
	}

	public void method395(int i, int i_157_, int i_158_, int i_159_, int i_160_, int i_161_) {
		if (i_161_ != 0) {
			i -= anInt4033 << 4;
			i_157_ -= anInt4050 << 4;
			double d = (double) (i_160_ & 0xffff) * 9.587379924285257E-5;
			int i_162_ = (int) Math.floor(Math.sin(d) * (double) i_161_ + 0.5);
			int i_163_ = (int) Math.floor(Math.cos(d) * (double) i_161_ + 0.5);
			int i_164_ = -i * i_163_ + -i_157_ * i_162_;
			int i_165_ = --i * i_162_ + -i_157_ * i_163_;
			int i_166_ = ((anInt4035 << 4) - i) * i_163_ + -i_157_ * i_162_;
			int i_167_ = -((anInt4035 << 4) - i) * i_162_ + -i_157_ * i_163_;
			int i_168_ = -i * i_163_ + ((anInt4042 << 4) - i_157_) * i_162_;
			int i_169_ = --i * i_162_ + ((anInt4042 << 4) - i_157_) * i_163_;
			int i_170_ = (((anInt4035 << 4) - i) * i_163_ + ((anInt4042 << 4) - i_157_) * i_162_);
			int i_171_ = (-((anInt4035 << 4) - i) * i_162_ + ((anInt4042 << 4) - i_157_) * i_163_);
			int i_172_;
			int i_173_;
			if (i_164_ < i_166_) {
				i_172_ = i_164_;
				i_173_ = i_166_;
			} else {
				i_172_ = i_166_;
				i_173_ = i_164_;
			}
			if (i_168_ < i_172_)
				i_172_ = i_168_;
			if (i_170_ < i_172_)
				i_172_ = i_170_;
			if (i_168_ > i_173_)
				i_173_ = i_168_;
			if (i_170_ > i_173_)
				i_173_ = i_170_;
			int i_174_;
			int i_175_;
			if (i_165_ < i_167_) {
				i_174_ = i_165_;
				i_175_ = i_167_;
			} else {
				i_174_ = i_167_;
				i_175_ = i_165_;
			}
			if (i_169_ < i_174_)
				i_174_ = i_169_;
			if (i_171_ < i_174_)
				i_174_ = i_171_;
			if (i_169_ > i_175_)
				i_175_ = i_169_;
			if (i_171_ > i_175_)
				i_175_ = i_171_;
			i_172_ >>= 12;
			i_173_ = i_173_ + 4095 >> 12;
			i_174_ >>= 12;
			i_175_ = i_175_ + 4095 >> 12;
			i_172_ += i_158_;
			i_173_ += i_158_;
			i_174_ += i_159_;
			i_175_ += i_159_;
			i_172_ >>= 4;
			i_173_ = i_173_ + 15 >> 4;
			i_174_ >>= 4;
			i_175_ = i_175_ + 15 >> 4;
			if (i_172_ < Class92.anInt1433)
				i_172_ = Class92.anInt1433;
			if (i_173_ > Class92.anInt1434)
				i_173_ = Class92.anInt1434;
			if (i_174_ < Class92.anInt1438)
				i_174_ = Class92.anInt1438;
			if (i_175_ > Class92.anInt1436)
				i_175_ = Class92.anInt1436;
			i_173_ = i_172_ - i_173_;
			if (i_173_ < 0) {
				i_175_ = i_174_ - i_175_;
				if (i_175_ < 0) {
					int i_176_ = i_174_ * Class92.anInt1432 + i_172_;
					double d_177_ = 1.6777216E7 / (double) i_161_;
					int i_178_ = (int) Math.floor(Math.sin(d) * d_177_ + 0.5);
					int i_179_ = (int) Math.floor(Math.cos(d) * d_177_ + 0.5);
					int i_180_ = (i_172_ << 4) + 8 - i_158_;
					int i_181_ = (i_174_ << 4) + 8 - i_159_;
					int i_182_ = (i << 8) - (i_181_ * i_178_ >> 4);
					int i_183_ = (i_157_ << 8) + (i_181_ * i_179_ >> 4);
					if (i_179_ == 0) {
						if (i_178_ == 0) {
							int i_184_ = i_175_;
							while (i_184_ < 0) {
								int i_185_ = i_176_;
								int i_186_ = i_182_;
								int i_187_ = i_183_;
								int i_188_ = i_173_;
								if (i_186_ >= 0 && i_187_ >= 0 && i_186_ - (anInt4035 << 12) < 0
										&& i_187_ - (anInt4042 << 12) < 0) {
									for (/**/; i_188_ < 0; i_188_++) {
										int i_189_ = (anIntArray5088[((i_187_ >> 12) * anInt4035 + (i_186_ >> 12))]);
										if (i_189_ != 0)
											Class92.anIntArray1437[i_185_++] = i_189_;
										else
											i_185_++;
									}
								}
								i_184_++;
								i_176_ += Class92.anInt1432;
							}
						} else if (i_178_ < 0) {
							int i_190_ = i_175_;
							while (i_190_ < 0) {
								int i_191_ = i_176_;
								int i_192_ = i_182_;
								int i_193_ = i_183_ + (i_180_ * i_178_ >> 4);
								int i_194_ = i_173_;
								if (i_192_ >= 0 && i_192_ - (anInt4035 << 12) < 0) {
									int i_195_;
									if ((i_195_ = i_193_ - (anInt4042 << 12)) >= 0) {
										i_195_ = (i_178_ - i_195_) / i_178_;
										i_194_ += i_195_;
										i_193_ += i_178_ * i_195_;
										i_191_ += i_195_;
									}
									if ((i_195_ = (i_193_ - i_178_) / i_178_) > i_194_)
										i_194_ = i_195_;
									for (/**/; i_194_ < 0; i_194_++) {
										int i_196_ = (anIntArray5088[((i_193_ >> 12) * anInt4035 + (i_192_ >> 12))]);
										if (i_196_ != 0)
											Class92.anIntArray1437[i_191_++] = i_196_;
										else
											i_191_++;
										i_193_ += i_178_;
									}
								}
								i_190_++;
								i_182_ -= i_178_;
								i_176_ += Class92.anInt1432;
							}
						} else {
							int i_197_ = i_175_;
							while (i_197_ < 0) {
								int i_198_ = i_176_;
								int i_199_ = i_182_;
								int i_200_ = i_183_ + (i_180_ * i_178_ >> 4);
								int i_201_ = i_173_;
								if (i_199_ >= 0 && i_199_ - (anInt4035 << 12) < 0) {
									if (i_200_ < 0) {
										int i_202_ = (i_178_ - 1 - i_200_) / i_178_;
										i_201_ += i_202_;
										i_200_ += i_178_ * i_202_;
										i_198_ += i_202_;
									}
									int i_203_;
									if ((i_203_ = (i_200_ + 1 - (anInt4042 << 12) - i_178_) / i_178_) > i_201_)
										i_201_ = i_203_;
									for (/**/; i_201_ < 0; i_201_++) {
										int i_204_ = (anIntArray5088[((i_200_ >> 12) * anInt4035 + (i_199_ >> 12))]);
										if (i_204_ != 0)
											Class92.anIntArray1437[i_198_++] = i_204_;
										else
											i_198_++;
										i_200_ += i_178_;
									}
								}
								i_197_++;
								i_182_ -= i_178_;
								i_176_ += Class92.anInt1432;
							}
						}
					} else if (i_179_ < 0) {
						if (i_178_ == 0) {
							int i_205_ = i_175_;
							while (i_205_ < 0) {
								int i_206_ = i_176_;
								int i_207_ = i_182_ + (i_180_ * i_179_ >> 4);
								int i_208_ = i_183_;
								int i_209_ = i_173_;
								if (i_208_ >= 0 && i_208_ - (anInt4042 << 12) < 0) {
									int i_210_;
									if ((i_210_ = i_207_ - (anInt4035 << 12)) >= 0) {
										i_210_ = (i_179_ - i_210_) / i_179_;
										i_209_ += i_210_;
										i_207_ += i_179_ * i_210_;
										i_206_ += i_210_;
									}
									if ((i_210_ = (i_207_ - i_179_) / i_179_) > i_209_)
										i_209_ = i_210_;
									for (/**/; i_209_ < 0; i_209_++) {
										int i_211_ = (anIntArray5088[((i_208_ >> 12) * anInt4035 + (i_207_ >> 12))]);
										if (i_211_ != 0)
											Class92.anIntArray1437[i_206_++] = i_211_;
										else
											i_206_++;
										i_207_ += i_179_;
									}
								}
								i_205_++;
								i_183_ += i_179_;
								i_176_ += Class92.anInt1432;
							}
						} else if (i_178_ < 0) {
							int i_212_ = i_175_;
							while (i_212_ < 0) {
								int i_213_ = i_176_;
								int i_214_ = i_182_ + (i_180_ * i_179_ >> 4);
								int i_215_ = i_183_ + (i_180_ * i_178_ >> 4);
								int i_216_ = i_173_;
								int i_217_;
								if ((i_217_ = i_214_ - (anInt4035 << 12)) >= 0) {
									i_217_ = (i_179_ - i_217_) / i_179_;
									i_216_ += i_217_;
									i_214_ += i_179_ * i_217_;
									i_215_ += i_178_ * i_217_;
									i_213_ += i_217_;
								}
								if ((i_217_ = (i_214_ - i_179_) / i_179_) > i_216_)
									i_216_ = i_217_;
								if ((i_217_ = i_215_ - (anInt4042 << 12)) >= 0) {
									i_217_ = (i_178_ - i_217_) / i_178_;
									i_216_ += i_217_;
									i_214_ += i_179_ * i_217_;
									i_215_ += i_178_ * i_217_;
									i_213_ += i_217_;
								}
								if ((i_217_ = (i_215_ - i_178_) / i_178_) > i_216_)
									i_216_ = i_217_;
								for (/**/; i_216_ < 0; i_216_++) {
									int i_218_ = (anIntArray5088[((i_215_ >> 12) * anInt4035 + (i_214_ >> 12))]);
									if (i_218_ != 0)
										Class92.anIntArray1437[i_213_++] = i_218_;
									else
										i_213_++;
									i_214_ += i_179_;
									i_215_ += i_178_;
								}
								i_212_++;
								i_182_ -= i_178_;
								i_183_ += i_179_;
								i_176_ += Class92.anInt1432;
							}
						} else {
							int i_219_ = i_175_;
							while (i_219_ < 0) {
								int i_220_ = i_176_;
								int i_221_ = i_182_ + (i_180_ * i_179_ >> 4);
								int i_222_ = i_183_ + (i_180_ * i_178_ >> 4);
								int i_223_ = i_173_;
								int i_224_;
								if ((i_224_ = i_221_ - (anInt4035 << 12)) >= 0) {
									i_224_ = (i_179_ - i_224_) / i_179_;
									i_223_ += i_224_;
									i_221_ += i_179_ * i_224_;
									i_222_ += i_178_ * i_224_;
									i_220_ += i_224_;
								}
								if ((i_224_ = (i_221_ - i_179_) / i_179_) > i_223_)
									i_223_ = i_224_;
								if (i_222_ < 0) {
									i_224_ = (i_178_ - 1 - i_222_) / i_178_;
									i_223_ += i_224_;
									i_221_ += i_179_ * i_224_;
									i_222_ += i_178_ * i_224_;
									i_220_ += i_224_;
								}
								if ((i_224_ = (i_222_ + 1 - (anInt4042 << 12) - i_178_) / i_178_) > i_223_)
									i_223_ = i_224_;
								for (/**/; i_223_ < 0; i_223_++) {
									int i_225_ = (anIntArray5088[((i_222_ >> 12) * anInt4035 + (i_221_ >> 12))]);
									if (i_225_ != 0)
										Class92.anIntArray1437[i_220_++] = i_225_;
									else
										i_220_++;
									i_221_ += i_179_;
									i_222_ += i_178_;
								}
								i_219_++;
								i_182_ -= i_178_;
								i_183_ += i_179_;
								i_176_ += Class92.anInt1432;
							}
						}
					} else if (i_178_ == 0) {
						int i_226_ = i_175_;
						while (i_226_ < 0) {
							int i_227_ = i_176_;
							int i_228_ = i_182_ + (i_180_ * i_179_ >> 4);
							int i_229_ = i_183_;
							int i_230_ = i_173_;
							if (i_229_ >= 0 && i_229_ - (anInt4042 << 12) < 0) {
								if (i_228_ < 0) {
									int i_231_ = (i_179_ - 1 - i_228_) / i_179_;
									i_230_ += i_231_;
									i_228_ += i_179_ * i_231_;
									i_227_ += i_231_;
								}
								int i_232_;
								if ((i_232_ = (i_228_ + 1 - (anInt4035 << 12) - i_179_) / i_179_) > i_230_)
									i_230_ = i_232_;
								for (/**/; i_230_ < 0; i_230_++) {
									int i_233_ = (anIntArray5088[((i_229_ >> 12) * anInt4035 + (i_228_ >> 12))]);
									if (i_233_ != 0)
										Class92.anIntArray1437[i_227_++] = i_233_;
									else
										i_227_++;
									i_228_ += i_179_;
								}
							}
							i_226_++;
							i_183_ += i_179_;
							i_176_ += Class92.anInt1432;
						}
					} else if (i_178_ < 0) {
						int i_234_ = i_175_;
						while (i_234_ < 0) {
							int i_235_ = i_176_;
							int i_236_ = i_182_ + (i_180_ * i_179_ >> 4);
							int i_237_ = i_183_ + (i_180_ * i_178_ >> 4);
							int i_238_ = i_173_;
							if (i_236_ < 0) {
								int i_239_ = (i_179_ - 1 - i_236_) / i_179_;
								i_238_ += i_239_;
								i_236_ += i_179_ * i_239_;
								i_237_ += i_178_ * i_239_;
								i_235_ += i_239_;
							}
							int i_240_;
							if ((i_240_ = (i_236_ + 1 - (anInt4035 << 12) - i_179_) / i_179_) > i_238_)
								i_238_ = i_240_;
							if ((i_240_ = i_237_ - (anInt4042 << 12)) >= 0) {
								i_240_ = (i_178_ - i_240_) / i_178_;
								i_238_ += i_240_;
								i_236_ += i_179_ * i_240_;
								i_237_ += i_178_ * i_240_;
								i_235_ += i_240_;
							}
							if ((i_240_ = (i_237_ - i_178_) / i_178_) > i_238_)
								i_238_ = i_240_;
							for (/**/; i_238_ < 0; i_238_++) {
								int i_241_ = (anIntArray5088[(i_237_ >> 12) * anInt4035 + (i_236_ >> 12)]);
								if (i_241_ != 0)
									Class92.anIntArray1437[i_235_++] = i_241_;
								else
									i_235_++;
								i_236_ += i_179_;
								i_237_ += i_178_;
							}
							i_234_++;
							i_182_ -= i_178_;
							i_183_ += i_179_;
							i_176_ += Class92.anInt1432;
						}
					} else {
						int i_242_ = i_175_;
						while (i_242_ < 0) {
							int i_243_ = i_176_;
							int i_244_ = i_182_ + (i_180_ * i_179_ >> 4);
							int i_245_ = i_183_ + (i_180_ * i_178_ >> 4);
							int i_246_ = i_173_;
							if (i_244_ < 0) {
								int i_247_ = (i_179_ - 1 - i_244_) / i_179_;
								i_246_ += i_247_;
								i_244_ += i_179_ * i_247_;
								i_245_ += i_178_ * i_247_;
								i_243_ += i_247_;
							}
							int i_248_;
							if ((i_248_ = (i_244_ + 1 - (anInt4035 << 12) - i_179_) / i_179_) > i_246_)
								i_246_ = i_248_;
							if (i_245_ < 0) {
								i_248_ = (i_178_ - 1 - i_245_) / i_178_;
								i_246_ += i_248_;
								i_244_ += i_179_ * i_248_;
								i_245_ += i_178_ * i_248_;
								i_243_ += i_248_;
							}
							if ((i_248_ = (i_245_ + 1 - (anInt4042 << 12) - i_178_) / i_178_) > i_246_)
								i_246_ = i_248_;
							for (/**/; i_246_ < 0; i_246_++) {
								int i_249_ = (anIntArray5088[(i_245_ >> 12) * anInt4035 + (i_244_ >> 12)]);
								if (i_249_ != 0)
									Class92.anIntArray1437[i_243_++] = i_249_;
								else
									i_243_++;
								i_244_ += i_179_;
								i_245_ += i_178_;
							}
							i_242_++;
							i_182_ -= i_178_;
							i_183_ += i_179_;
							i_176_ += Class92.anInt1432;
						}
					}
				}
			}
		}
	}

	public void method413() {
		Class92.method1455(anIntArray5088, anInt4035, anInt4042);
	}

	public static void method414(int[] is, int[] is_250_, int i, int i_251_, int i_252_, int i_253_, int i_254_,
			int i_255_, int i_256_, int i_257_, int i_258_, int i_259_) {
		int i_260_ = i_251_;
		for (int i_261_ = -i_256_; i_261_ < 0; i_261_++) {
			int i_262_ = (i_252_ >> 16) * i_259_;
			for (int i_263_ = -i_255_; i_263_ < 0; i_263_++) {
				i = is_250_[(i_251_ >> 16) + i_262_];
				if (i != 0)
					is[i_253_++] = i;
				else
					i_253_++;
				i_251_ += i_257_;
			}
			i_252_ += i_258_;
			i_251_ = i_260_;
			i_253_ += i_254_;
		}
	}

	public Class14_Sub2_Sub19_Sub1(int i, int i_264_, int i_265_, int i_266_, int i_267_, int i_268_, int[] is) {
		anInt4034 = i;
		anInt4046 = i_264_;
		anInt4033 = i_265_;
		anInt4050 = i_266_;
		anInt4035 = i_267_;
		anInt4042 = i_268_;
		anIntArray5088 = is;
	}

	public Class14_Sub2_Sub19_Sub1(int i, int i_269_) {
		anIntArray5088 = new int[i * i_269_];
		anInt4035 = anInt4034 = i;
		anInt4042 = anInt4046 = i_269_;
		anInt4033 = anInt4050 = 0;
	}

	public void method400(int i, int i_270_, int i_271_, int i_272_) {
		if (i_271_ == 256)
			method391(i, i_270_);
		else {
			i += anInt4033;
			i_270_ += anInt4050;
			int i_273_ = i + i_270_ * Class92.anInt1432;
			int i_274_ = 0;
			int i_275_ = anInt4042;
			int i_276_ = anInt4035;
			int i_277_ = Class92.anInt1432 - i_276_;
			int i_278_ = 0;
			if (i_270_ < Class92.anInt1438) {
				int i_279_ = Class92.anInt1438 - i_270_;
				i_275_ -= i_279_;
				i_270_ = Class92.anInt1438;
				i_274_ += i_279_ * i_276_;
				i_273_ += i_279_ * Class92.anInt1432;
			}
			if (i_270_ + i_275_ > Class92.anInt1436)
				i_275_ -= i_270_ + i_275_ - Class92.anInt1436;
			if (i < Class92.anInt1433) {
				int i_280_ = Class92.anInt1433 - i;
				i_276_ -= i_280_;
				i = Class92.anInt1433;
				i_274_ += i_280_;
				i_273_ += i_280_;
				i_278_ += i_280_;
				i_277_ += i_280_;
			}
			if (i + i_276_ > Class92.anInt1434) {
				int i_281_ = i + i_276_ - Class92.anInt1434;
				i_276_ -= i_281_;
				i_278_ += i_281_;
				i_277_ += i_281_;
			}
			if (i_276_ > 0 && i_275_ > 0)
				method403(Class92.anIntArray1437, anIntArray5088, 0, i_274_, i_273_, i_276_, i_275_, i_277_, i_278_,
						i_271_, i_272_);
		}
	}
}
