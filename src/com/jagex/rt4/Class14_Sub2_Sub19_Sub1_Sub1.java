/* Class14_Sub2_Sub19_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import rs.Class92;

public class Class14_Sub2_Sub19_Sub1_Sub1 extends Class14_Sub2_Sub19_Sub1 {
	public static void method415(int[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = i_1_;
		for (int i_12_ = -i_6_; i_12_ < 0; i_12_++) {
			int i_13_ = (i_2_ >> 16) * i_9_;
			for (int i_14_ = -i_5_; i_14_ < 0; i_14_++) {
				int i_15_ = is_0_[(i_1_ >> 16) + i_13_];
				int i_16_ = is[i_3_];
				int i_17_ = (i_15_ >>> 24) - (255 - i_10_);
				if (i_17_ < 0)
					i_17_ = 0;
				int i_18_ = 256 - i_17_;
				is[i_3_++] = (((i_15_ & 0xff00ff) * i_17_ + (i_16_ & 0xff00ff) * i_18_ & ~0xff00ff)
						+ ((i_15_ & 0xff00) * i_17_ + (i_16_ & 0xff00) * i_18_ & 0xff0000)) >> 8;
				i_1_ += i_7_;
			}
			i_2_ += i_8_;
			i_1_ = i_11_;
			i_3_ += i_4_;
		}
	}

	public void drawSpriteTransparency(int i, int i_19_, int i_20_) {
		i += offsetX;
		i_19_ += offsetY;
		int i_21_ = i + i_19_ * Class92.anInt1432;
		int i_22_ = 0;
		int i_23_ = anInt4042;
		int i_24_ = anInt4035;
		int i_25_ = Class92.anInt1432 - i_24_;
		int i_26_ = 0;
		if (i_19_ < Class92.anInt1438) {
			int i_27_ = Class92.anInt1438 - i_19_;
			i_23_ -= i_27_;
			i_19_ = Class92.anInt1438;
			i_22_ += i_27_ * i_24_;
			i_21_ += i_27_ * Class92.anInt1432;
		}
		if (i_19_ + i_23_ > Class92.anInt1436)
			i_23_ -= i_19_ + i_23_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_28_ = Class92.anInt1433 - i;
			i_24_ -= i_28_;
			i = Class92.anInt1433;
			i_22_ += i_28_;
			i_21_ += i_28_;
			i_26_ += i_28_;
			i_25_ += i_28_;
		}
		if (i + i_24_ > Class92.anInt1434) {
			int i_29_ = i + i_24_ - Class92.anInt1434;
			i_24_ -= i_29_;
			i_26_ += i_29_;
			i_25_ += i_29_;
		}
		if (i_24_ > 0 && i_23_ > 0)
			method418(Class92.anIntArray1437, anIntArray5088, 0, i_22_, i_21_, i_24_, i_23_, i_25_, i_26_, i_20_);
	}

	public void drawReg(int i, int i_30_) {
		i += offsetX;
		i_30_ += offsetY;
		int i_31_ = i + i_30_ * Class92.anInt1432;
		int i_32_ = 0;
		int i_33_ = anInt4042;
		int i_34_ = anInt4035;
		int i_35_ = Class92.anInt1432 - i_34_;
		int i_36_ = 0;
		if (i_30_ < Class92.anInt1438) {
			int i_37_ = Class92.anInt1438 - i_30_;
			i_33_ -= i_37_;
			i_30_ = Class92.anInt1438;
			i_32_ += i_37_ * i_34_;
			i_31_ += i_37_ * Class92.anInt1432;
		}
		if (i_30_ + i_33_ > Class92.anInt1436)
			i_33_ -= i_30_ + i_33_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_38_ = Class92.anInt1433 - i;
			i_34_ -= i_38_;
			i = Class92.anInt1433;
			i_32_ += i_38_;
			i_31_ += i_38_;
			i_36_ += i_38_;
			i_35_ += i_38_;
		}
		if (i + i_34_ > Class92.anInt1434) {
			int i_39_ = i + i_34_ - Class92.anInt1434;
			i_34_ -= i_39_;
			i_36_ += i_39_;
			i_35_ += i_39_;
		}
		if (i_34_ > 0 && i_33_ > 0)
			method417(Class92.anIntArray1437, anIntArray5088, 0, i_32_, i_31_, i_34_, i_33_, i_35_, i_36_);
	}

	public void method390(int i, int i_40_) {
		i += offsetX;
		i_40_ += offsetY;
		int i_41_ = i + i_40_ * Class92.anInt1432;
		int i_42_ = 0;
		int i_43_ = anInt4042;
		int i_44_ = anInt4035;
		int i_45_ = Class92.anInt1432 - i_44_;
		int i_46_ = 0;
		if (i_40_ < Class92.anInt1438) {
			int i_47_ = Class92.anInt1438 - i_40_;
			i_43_ -= i_47_;
			i_40_ = Class92.anInt1438;
			i_42_ += i_47_ * i_44_;
			i_41_ += i_47_ * Class92.anInt1432;
		}
		if (i_40_ + i_43_ > Class92.anInt1436)
			i_43_ -= i_40_ + i_43_ - Class92.anInt1436;
		if (i < Class92.anInt1433) {
			int i_48_ = Class92.anInt1433 - i;
			i_44_ -= i_48_;
			i = Class92.anInt1433;
			i_42_ += i_48_;
			i_41_ += i_48_;
			i_46_ += i_48_;
			i_45_ += i_48_;
		}
		if (i + i_44_ > Class92.anInt1434) {
			int i_49_ = i + i_44_ - Class92.anInt1434;
			i_44_ -= i_49_;
			i_46_ += i_49_;
			i_45_ += i_49_;
		}
		if (i_44_ > 0 && i_43_ > 0)
			method416(Class92.anIntArray1437, anIntArray5088, i_42_, i_41_, i_44_, i_43_, i_45_, i_46_);
	}

	public static void method416(int[] is, int[] is_50_, int i, int i_51_, int i_52_, int i_53_, int i_54_, int i_55_) {
		for (int i_56_ = -i_53_; i_56_ < 0; i_56_++) {
			int i_57_ = i_51_ + i_52_;
			while (i_51_ < i_57_) {
				int i_58_ = is_50_[i] >>> 24;
				int i_59_ = 256 - i_58_;
				int i_60_ = is_50_[i++];
				int i_61_ = is[i_51_];
				is[i_51_++] = (((i_60_ & 0xff00ff) * i_58_ + (i_61_ & 0xff00ff) * i_59_ & ~0xff00ff)
						+ ((i_60_ & 0xff00) * i_58_ + (i_61_ & 0xff00) * i_59_ & 0xff0000)) >> 8;
			}
			i_51_ += i_54_;
			i += i_55_;
		}
	}

	public static void method417(int[] is, int[] is_62_, int i, int i_63_, int i_64_, int i_65_, int i_66_, int i_67_,
			int i_68_) {
		int i_69_ = -i_65_;
		for (int i_70_ = -i_66_; i_70_ < 0; i_70_++) {
			for (int i_71_ = i_69_; i_71_ < 0; i_71_++) {
				int i_72_ = is_62_[i_63_] >>> 24;
				int i_73_ = 256 - i_72_;
				int i_74_ = is_62_[i_63_++];
				int i_75_ = is[i_64_];
				is[i_64_++] = (((i_74_ & 0xff00ff) * i_72_ + (i_75_ & 0xff00ff) * i_73_ & ~0xff00ff)
						+ ((i_74_ & 0xff00) * i_72_ + (i_75_ & 0xff00) * i_73_ & 0xff0000)) >> 8;
			}
			i_64_ += i_67_;
			i_63_ += i_68_;
		}
	}

	public Class14_Sub2_Sub19_Sub1_Sub1(int i, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_, int[] is) {
		super(i, i_76_, i_77_, i_78_, i_79_, i_80_, is);
	}

	public void method395(int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_) {
		if (i_85_ != 0) {
			i -= offsetX << 4;
			i_81_ -= offsetY << 4;
			double d = (double) (i_84_ & 0xffff) * 9.587379924285257E-5;
			int i_86_ = (int) Math.floor(Math.sin(d) * (double) i_85_ + 0.5);
			int i_87_ = (int) Math.floor(Math.cos(d) * (double) i_85_ + 0.5);
			int i_88_ = -i * i_87_ + -i_81_ * i_86_;
			int i_89_ = --i * i_86_ + -i_81_ * i_87_;
			int i_90_ = ((anInt4035 << 4) - i) * i_87_ + -i_81_ * i_86_;
			int i_91_ = -((anInt4035 << 4) - i) * i_86_ + -i_81_ * i_87_;
			int i_92_ = -i * i_87_ + ((anInt4042 << 4) - i_81_) * i_86_;
			int i_93_ = --i * i_86_ + ((anInt4042 << 4) - i_81_) * i_87_;
			int i_94_ = (((anInt4035 << 4) - i) * i_87_ + ((anInt4042 << 4) - i_81_) * i_86_);
			int i_95_ = (-((anInt4035 << 4) - i) * i_86_ + ((anInt4042 << 4) - i_81_) * i_87_);
			int i_96_;
			int i_97_;
			if (i_88_ < i_90_) {
				i_96_ = i_88_;
				i_97_ = i_90_;
			} else {
				i_96_ = i_90_;
				i_97_ = i_88_;
			}
			if (i_92_ < i_96_)
				i_96_ = i_92_;
			if (i_94_ < i_96_)
				i_96_ = i_94_;
			if (i_92_ > i_97_)
				i_97_ = i_92_;
			if (i_94_ > i_97_)
				i_97_ = i_94_;
			int i_98_;
			int i_99_;
			if (i_89_ < i_91_) {
				i_98_ = i_89_;
				i_99_ = i_91_;
			} else {
				i_98_ = i_91_;
				i_99_ = i_89_;
			}
			if (i_93_ < i_98_)
				i_98_ = i_93_;
			if (i_95_ < i_98_)
				i_98_ = i_95_;
			if (i_93_ > i_99_)
				i_99_ = i_93_;
			if (i_95_ > i_99_)
				i_99_ = i_95_;
			i_96_ >>= 12;
			i_97_ = i_97_ + 4095 >> 12;
			i_98_ >>= 12;
			i_99_ = i_99_ + 4095 >> 12;
			i_96_ += i_82_;
			i_97_ += i_82_;
			i_98_ += i_83_;
			i_99_ += i_83_;
			i_96_ >>= 4;
			i_97_ = i_97_ + 15 >> 4;
			i_98_ >>= 4;
			i_99_ = i_99_ + 15 >> 4;
			if (i_96_ < Class92.anInt1433)
				i_96_ = Class92.anInt1433;
			if (i_97_ > Class92.anInt1434)
				i_97_ = Class92.anInt1434;
			if (i_98_ < Class92.anInt1438)
				i_98_ = Class92.anInt1438;
			if (i_99_ > Class92.anInt1436)
				i_99_ = Class92.anInt1436;
			i_97_ = i_96_ - i_97_;
			if (i_97_ < 0) {
				i_99_ = i_98_ - i_99_;
				if (i_99_ < 0) {
					int i_100_ = i_98_ * Class92.anInt1432 + i_96_;
					double d_101_ = 1.6777216E7 / (double) i_85_;
					int i_102_ = (int) Math.floor(Math.sin(d) * d_101_ + 0.5);
					int i_103_ = (int) Math.floor(Math.cos(d) * d_101_ + 0.5);
					int i_104_ = (i_96_ << 4) + 8 - i_82_;
					int i_105_ = (i_98_ << 4) + 8 - i_83_;
					int i_106_ = (i << 8) - (i_105_ * i_102_ >> 4);
					int i_107_ = (i_81_ << 8) + (i_105_ * i_103_ >> 4);
					if (i_103_ == 0) {
						if (i_102_ == 0) {
							int i_108_ = i_99_;
							while (i_108_ < 0) {
								int i_109_ = i_100_;
								int i_110_ = i_106_;
								int i_111_ = i_107_;
								int i_112_ = i_97_;
								if (i_110_ >= 0 && i_111_ >= 0 && i_110_ - (anInt4035 << 12) < 0
										&& i_111_ - (anInt4042 << 12) < 0) {
									for (/**/; i_112_ < 0; i_112_++) {
										int i_113_ = (anIntArray5088[((i_111_ >> 12) * anInt4035 + (i_110_ >> 12))]);
										int i_114_ = Class92.anIntArray1437[i_109_];
										int i_115_ = i_113_ >>> 24;
										int i_116_ = 256 - i_115_;
										Class92.anIntArray1437[i_109_++] = ((((i_113_ & 0xff00ff) * i_115_
												+ ((i_114_ & 0xff00ff) * i_116_)) & ~0xff00ff)
												+ (((i_113_ & 0xff00) * i_115_ + ((i_114_ & 0xff00) * i_116_))
														& 0xff0000)) >> 8;
									}
								}
								i_108_++;
								i_100_ += Class92.anInt1432;
							}
						} else if (i_102_ < 0) {
							int i_117_ = i_99_;
							while (i_117_ < 0) {
								int i_118_ = i_100_;
								int i_119_ = i_106_;
								int i_120_ = i_107_ + (i_104_ * i_102_ >> 4);
								int i_121_ = i_97_;
								if (i_119_ >= 0 && i_119_ - (anInt4035 << 12) < 0) {
									int i_122_;
									if ((i_122_ = i_120_ - (anInt4042 << 12)) >= 0) {
										i_122_ = (i_102_ - i_122_) / i_102_;
										i_121_ += i_122_;
										i_120_ += i_102_ * i_122_;
										i_118_ += i_122_;
									}
									if ((i_122_ = (i_120_ - i_102_) / i_102_) > i_121_)
										i_121_ = i_122_;
									for (/**/; i_121_ < 0; i_121_++) {
										int i_123_ = (anIntArray5088[((i_120_ >> 12) * anInt4035 + (i_119_ >> 12))]);
										int i_124_ = Class92.anIntArray1437[i_118_];
										int i_125_ = i_123_ >>> 24;
										int i_126_ = 256 - i_125_;
										Class92.anIntArray1437[i_118_++] = ((((i_123_ & 0xff00ff) * i_125_
												+ ((i_124_ & 0xff00ff) * i_126_)) & ~0xff00ff)
												+ (((i_123_ & 0xff00) * i_125_ + ((i_124_ & 0xff00) * i_126_))
														& 0xff0000)) >> 8;
										i_120_ += i_102_;
									}
								}
								i_117_++;
								i_106_ -= i_102_;
								i_100_ += Class92.anInt1432;
							}
						} else {
							int i_127_ = i_99_;
							while (i_127_ < 0) {
								int i_128_ = i_100_;
								int i_129_ = i_106_;
								int i_130_ = i_107_ + (i_104_ * i_102_ >> 4);
								int i_131_ = i_97_;
								if (i_129_ >= 0 && i_129_ - (anInt4035 << 12) < 0) {
									if (i_130_ < 0) {
										int i_132_ = (i_102_ - 1 - i_130_) / i_102_;
										i_131_ += i_132_;
										i_130_ += i_102_ * i_132_;
										i_128_ += i_132_;
									}
									int i_133_;
									if ((i_133_ = (i_130_ + 1 - (anInt4042 << 12) - i_102_) / i_102_) > i_131_)
										i_131_ = i_133_;
									for (/**/; i_131_ < 0; i_131_++) {
										int i_134_ = (anIntArray5088[((i_130_ >> 12) * anInt4035 + (i_129_ >> 12))]);
										int i_135_ = Class92.anIntArray1437[i_128_];
										int i_136_ = i_134_ >>> 24;
										int i_137_ = 256 - i_136_;
										Class92.anIntArray1437[i_128_++] = ((((i_134_ & 0xff00ff) * i_136_
												+ ((i_135_ & 0xff00ff) * i_137_)) & ~0xff00ff)
												+ (((i_134_ & 0xff00) * i_136_ + ((i_135_ & 0xff00) * i_137_))
														& 0xff0000)) >> 8;
										i_130_ += i_102_;
									}
								}
								i_127_++;
								i_106_ -= i_102_;
								i_100_ += Class92.anInt1432;
							}
						}
					} else if (i_103_ < 0) {
						if (i_102_ == 0) {
							int i_138_ = i_99_;
							while (i_138_ < 0) {
								int i_139_ = i_100_;
								int i_140_ = i_106_ + (i_104_ * i_103_ >> 4);
								int i_141_ = i_107_;
								int i_142_ = i_97_;
								if (i_141_ >= 0 && i_141_ - (anInt4042 << 12) < 0) {
									int i_143_;
									if ((i_143_ = i_140_ - (anInt4035 << 12)) >= 0) {
										i_143_ = (i_103_ - i_143_) / i_103_;
										i_142_ += i_143_;
										i_140_ += i_103_ * i_143_;
										i_139_ += i_143_;
									}
									if ((i_143_ = (i_140_ - i_103_) / i_103_) > i_142_)
										i_142_ = i_143_;
									for (/**/; i_142_ < 0; i_142_++) {
										int i_144_ = (anIntArray5088[((i_141_ >> 12) * anInt4035 + (i_140_ >> 12))]);
										int i_145_ = Class92.anIntArray1437[i_139_];
										int i_146_ = i_144_ >>> 24;
										int i_147_ = 256 - i_146_;
										Class92.anIntArray1437[i_139_++] = ((((i_144_ & 0xff00ff) * i_146_
												+ ((i_145_ & 0xff00ff) * i_147_)) & ~0xff00ff)
												+ (((i_144_ & 0xff00) * i_146_ + ((i_145_ & 0xff00) * i_147_))
														& 0xff0000)) >> 8;
										i_140_ += i_103_;
									}
								}
								i_138_++;
								i_107_ += i_103_;
								i_100_ += Class92.anInt1432;
							}
						} else if (i_102_ < 0) {
							int i_148_ = i_99_;
							while (i_148_ < 0) {
								int i_149_ = i_100_;
								int i_150_ = i_106_ + (i_104_ * i_103_ >> 4);
								int i_151_ = i_107_ + (i_104_ * i_102_ >> 4);
								int i_152_ = i_97_;
								int i_153_;
								if ((i_153_ = i_150_ - (anInt4035 << 12)) >= 0) {
									i_153_ = (i_103_ - i_153_) / i_103_;
									i_152_ += i_153_;
									i_150_ += i_103_ * i_153_;
									i_151_ += i_102_ * i_153_;
									i_149_ += i_153_;
								}
								if ((i_153_ = (i_150_ - i_103_) / i_103_) > i_152_)
									i_152_ = i_153_;
								if ((i_153_ = i_151_ - (anInt4042 << 12)) >= 0) {
									i_153_ = (i_102_ - i_153_) / i_102_;
									i_152_ += i_153_;
									i_150_ += i_103_ * i_153_;
									i_151_ += i_102_ * i_153_;
									i_149_ += i_153_;
								}
								if ((i_153_ = (i_151_ - i_102_) / i_102_) > i_152_)
									i_152_ = i_153_;
								for (/**/; i_152_ < 0; i_152_++) {
									int i_154_ = (anIntArray5088[((i_151_ >> 12) * anInt4035 + (i_150_ >> 12))]);
									int i_155_ = Class92.anIntArray1437[i_149_];
									int i_156_ = i_154_ >>> 24;
									int i_157_ = 256 - i_156_;
									Class92.anIntArray1437[i_149_++] = ((((i_154_ & 0xff00ff) * i_156_
											+ (i_155_ & 0xff00ff) * i_157_) & ~0xff00ff)
											+ (((i_154_ & 0xff00) * i_156_ + (i_155_ & 0xff00) * i_157_)
													& 0xff0000)) >> 8;
									i_150_ += i_103_;
									i_151_ += i_102_;
								}
								i_148_++;
								i_106_ -= i_102_;
								i_107_ += i_103_;
								i_100_ += Class92.anInt1432;
							}
						} else {
							int i_158_ = i_99_;
							while (i_158_ < 0) {
								int i_159_ = i_100_;
								int i_160_ = i_106_ + (i_104_ * i_103_ >> 4);
								int i_161_ = i_107_ + (i_104_ * i_102_ >> 4);
								int i_162_ = i_97_;
								int i_163_;
								if ((i_163_ = i_160_ - (anInt4035 << 12)) >= 0) {
									i_163_ = (i_103_ - i_163_) / i_103_;
									i_162_ += i_163_;
									i_160_ += i_103_ * i_163_;
									i_161_ += i_102_ * i_163_;
									i_159_ += i_163_;
								}
								if ((i_163_ = (i_160_ - i_103_) / i_103_) > i_162_)
									i_162_ = i_163_;
								if (i_161_ < 0) {
									i_163_ = (i_102_ - 1 - i_161_) / i_102_;
									i_162_ += i_163_;
									i_160_ += i_103_ * i_163_;
									i_161_ += i_102_ * i_163_;
									i_159_ += i_163_;
								}
								if ((i_163_ = (i_161_ + 1 - (anInt4042 << 12) - i_102_) / i_102_) > i_162_)
									i_162_ = i_163_;
								for (/**/; i_162_ < 0; i_162_++) {
									int i_164_ = (anIntArray5088[((i_161_ >> 12) * anInt4035 + (i_160_ >> 12))]);
									int i_165_ = Class92.anIntArray1437[i_159_];
									int i_166_ = i_164_ >>> 24;
									int i_167_ = 256 - i_166_;
									Class92.anIntArray1437[i_159_++] = ((((i_164_ & 0xff00ff) * i_166_
											+ (i_165_ & 0xff00ff) * i_167_) & ~0xff00ff)
											+ (((i_164_ & 0xff00) * i_166_ + (i_165_ & 0xff00) * i_167_)
													& 0xff0000)) >> 8;
									i_160_ += i_103_;
									i_161_ += i_102_;
								}
								i_158_++;
								i_106_ -= i_102_;
								i_107_ += i_103_;
								i_100_ += Class92.anInt1432;
							}
						}
					} else if (i_102_ == 0) {
						int i_168_ = i_99_;
						while (i_168_ < 0) {
							int i_169_ = i_100_;
							int i_170_ = i_106_ + (i_104_ * i_103_ >> 4);
							int i_171_ = i_107_;
							int i_172_ = i_97_;
							if (i_171_ >= 0 && i_171_ - (anInt4042 << 12) < 0) {
								if (i_170_ < 0) {
									int i_173_ = (i_103_ - 1 - i_170_) / i_103_;
									i_172_ += i_173_;
									i_170_ += i_103_ * i_173_;
									i_169_ += i_173_;
								}
								int i_174_;
								if ((i_174_ = (i_170_ + 1 - (anInt4035 << 12) - i_103_) / i_103_) > i_172_)
									i_172_ = i_174_;
								for (/**/; i_172_ < 0; i_172_++) {
									int i_175_ = (anIntArray5088[((i_171_ >> 12) * anInt4035 + (i_170_ >> 12))]);
									int i_176_ = Class92.anIntArray1437[i_169_];
									int i_177_ = i_175_ >>> 24;
									int i_178_ = 256 - i_177_;
									Class92.anIntArray1437[i_169_++] = ((((i_175_ & 0xff00ff) * i_177_
											+ (i_176_ & 0xff00ff) * i_178_) & ~0xff00ff)
											+ (((i_175_ & 0xff00) * i_177_ + (i_176_ & 0xff00) * i_178_)
													& 0xff0000)) >> 8;
									i_170_ += i_103_;
								}
							}
							i_168_++;
							i_107_ += i_103_;
							i_100_ += Class92.anInt1432;
						}
					} else if (i_102_ < 0) {
						int i_179_ = i_99_;
						while (i_179_ < 0) {
							int i_180_ = i_100_;
							int i_181_ = i_106_ + (i_104_ * i_103_ >> 4);
							int i_182_ = i_107_ + (i_104_ * i_102_ >> 4);
							int i_183_ = i_97_;
							if (i_181_ < 0) {
								int i_184_ = (i_103_ - 1 - i_181_) / i_103_;
								i_183_ += i_184_;
								i_181_ += i_103_ * i_184_;
								i_182_ += i_102_ * i_184_;
								i_180_ += i_184_;
							}
							int i_185_;
							if ((i_185_ = (i_181_ + 1 - (anInt4035 << 12) - i_103_) / i_103_) > i_183_)
								i_183_ = i_185_;
							if ((i_185_ = i_182_ - (anInt4042 << 12)) >= 0) {
								i_185_ = (i_102_ - i_185_) / i_102_;
								i_183_ += i_185_;
								i_181_ += i_103_ * i_185_;
								i_182_ += i_102_ * i_185_;
								i_180_ += i_185_;
							}
							if ((i_185_ = (i_182_ - i_102_) / i_102_) > i_183_)
								i_183_ = i_185_;
							for (/**/; i_183_ < 0; i_183_++) {
								int i_186_ = (anIntArray5088[(i_182_ >> 12) * anInt4035 + (i_181_ >> 12)]);
								int i_187_ = Class92.anIntArray1437[i_180_];
								int i_188_ = i_186_ >>> 24;
								int i_189_ = 256 - i_188_;
								Class92.anIntArray1437[i_180_++] = ((((i_186_ & 0xff00ff) * i_188_
										+ (i_187_ & 0xff00ff) * i_189_) & ~0xff00ff)
										+ (((i_186_ & 0xff00) * i_188_ + (i_187_ & 0xff00) * i_189_) & 0xff0000)) >> 8;
								i_181_ += i_103_;
								i_182_ += i_102_;
							}
							i_179_++;
							i_106_ -= i_102_;
							i_107_ += i_103_;
							i_100_ += Class92.anInt1432;
						}
					} else {
						int i_190_ = i_99_;
						while (i_190_ < 0) {
							int i_191_ = i_100_;
							int i_192_ = i_106_ + (i_104_ * i_103_ >> 4);
							int i_193_ = i_107_ + (i_104_ * i_102_ >> 4);
							int i_194_ = i_97_;
							if (i_192_ < 0) {
								int i_195_ = (i_103_ - 1 - i_192_) / i_103_;
								i_194_ += i_195_;
								i_192_ += i_103_ * i_195_;
								i_193_ += i_102_ * i_195_;
								i_191_ += i_195_;
							}
							int i_196_;
							if ((i_196_ = (i_192_ + 1 - (anInt4035 << 12) - i_103_) / i_103_) > i_194_)
								i_194_ = i_196_;
							if (i_193_ < 0) {
								i_196_ = (i_102_ - 1 - i_193_) / i_102_;
								i_194_ += i_196_;
								i_192_ += i_103_ * i_196_;
								i_193_ += i_102_ * i_196_;
								i_191_ += i_196_;
							}
							if ((i_196_ = (i_193_ + 1 - (anInt4042 << 12) - i_102_) / i_102_) > i_194_)
								i_194_ = i_196_;
							for (/**/; i_194_ < 0; i_194_++) {
								int i_197_ = (anIntArray5088[(i_193_ >> 12) * anInt4035 + (i_192_ >> 12)]);
								int i_198_ = Class92.anIntArray1437[i_191_];
								int i_199_ = i_197_ >>> 24;
								int i_200_ = 256 - i_199_;
								Class92.anIntArray1437[i_191_++] = ((((i_197_ & 0xff00ff) * i_199_
										+ (i_198_ & 0xff00ff) * i_200_) & ~0xff00ff)
										+ (((i_197_ & 0xff00) * i_199_ + (i_198_ & 0xff00) * i_200_) & 0xff0000)) >> 8;
								i_192_ += i_103_;
								i_193_ += i_102_;
							}
							i_190_++;
							i_106_ -= i_102_;
							i_107_ += i_103_;
							i_100_ += Class92.anInt1432;
						}
					}
				}
			}
		}
	}

	public static void method418(int[] is, int[] is_201_, int i, int i_202_, int i_203_, int i_204_, int i_205_,
			int i_206_, int i_207_, int i_208_) {
		for (int i_209_ = -i_205_; i_209_ < 0; i_209_++) {
			for (int i_210_ = -i_204_; i_210_ < 0; i_210_++) {
				int i_211_ = (is_201_[i_202_] >>> 24) - (255 - i_208_);
				if (i_211_ < 0)
					i_211_ = 0;
				int i_212_ = 256 - i_211_;
				int i_213_ = is_201_[i_202_++];
				int i_214_ = is[i_203_];
				is[i_203_++] = ((((i_213_ & 0xff00ff) * i_211_ + (i_214_ & 0xff00ff) * i_212_) & ~0xff00ff)
						+ (((i_213_ & 0xff00) * i_211_ + (i_214_ & 0xff00) * i_212_) & 0xff0000)) >> 8;
			}
			i_203_ += i_206_;
			i_202_ += i_207_;
		}
	}

	public void method396(int i, int i_215_, int i_216_, int i_217_, int i_218_) {
		if (i_216_ > 0 && i_217_ > 0) {
			int i_219_ = anInt4035;
			int i_220_ = anInt4042;
			int i_221_ = 0;
			int i_222_ = 0;
			int i_223_ = anInt4034;
			int i_224_ = anInt4046;
			int i_225_ = (i_223_ << 16) / i_216_;
			int i_226_ = (i_224_ << 16) / i_217_;
			if (offsetX > 0) {
				int i_227_ = ((offsetX << 16) + i_225_ - 1) / i_225_;
				i += i_227_;
				i_221_ += i_227_ * i_225_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_228_ = ((offsetY << 16) + i_226_ - 1) / i_226_;
				i_215_ += i_228_;
				i_222_ += i_228_ * i_226_ - (offsetY << 16);
			}
			if (i_219_ < i_223_)
				i_216_ = ((i_219_ << 16) - i_221_ + i_225_ - 1) / i_225_;
			if (i_220_ < i_224_)
				i_217_ = ((i_220_ << 16) - i_222_ + i_226_ - 1) / i_226_;
			int i_229_ = i + i_215_ * Class92.anInt1432;
			int i_230_ = Class92.anInt1432 - i_216_;
			if (i_215_ + i_217_ > Class92.anInt1436)
				i_217_ -= i_215_ + i_217_ - Class92.anInt1436;
			if (i_215_ < Class92.anInt1438) {
				int i_231_ = Class92.anInt1438 - i_215_;
				i_217_ -= i_231_;
				i_229_ += i_231_ * Class92.anInt1432;
				i_222_ += i_226_ * i_231_;
			}
			if (i + i_216_ > Class92.anInt1434) {
				int i_232_ = i + i_216_ - Class92.anInt1434;
				i_216_ -= i_232_;
				i_230_ += i_232_;
			}
			if (i < Class92.anInt1433) {
				int i_233_ = Class92.anInt1433 - i;
				i_216_ -= i_233_;
				i_229_ += i_233_;
				i_221_ += i_225_ * i_233_;
				i_230_ += i_233_;
			}
			method415(Class92.anIntArray1437, anIntArray5088, 0, i_221_, i_222_, i_229_, i_230_, i_216_, i_217_, i_225_,
					i_226_, i_219_, i_218_);
		}
	}
}
