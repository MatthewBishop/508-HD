/* Class14_Sub9_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class14_Sub9_Sub4 extends Class14_Sub9 {
	public int anInt4860;
	public boolean aBoolean4861;
	public int anInt4862;
	public int anInt4863;
	public int anInt4864;
	public int anInt4865;
	public int anInt4866;
	public int anInt4867;
	public int anInt4868;
	public int anInt4869;
	public int anInt4870;
	public int anInt4871;
	public int anInt4872;
	public int anInt4873;
	public int anInt4874;

	public Class14_Sub9 method686() {
		return null;
	}

	public synchronized void method687(int[] is, int i, int i_0_) {
		if (anInt4868 == 0 && anInt4867 == 0)
			method692(i_0_);
		else {
			Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass14_Sub12_2866;
			int i_1_ = anInt4860 << 8;
			int i_2_ = anInt4865 << 8;
			int i_3_ = class14_sub12_sub1.aByteArray4899.length << 8;
			int i_4_ = i_2_ - i_1_;
			if (i_4_ <= 0)
				anInt4871 = 0;
			int i_5_ = i;
			i_0_ += i;
			if (anInt4869 < 0) {
				if (anInt4873 > 0)
					anInt4869 = 0;
				else {
					method742();
					unlink();
					return;
				}
			}
			if (anInt4869 >= i_3_) {
				if (anInt4873 < 0)
					anInt4869 = i_3_ - 1;
				else {
					method742();
					unlink();
					return;
				}
			}
			if (anInt4871 < 0) {
				if (aBoolean4861) {
					if (anInt4873 < 0) {
						i_5_ = method766(is, i_5_, i_1_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
						if (anInt4869 >= i_1_)
							return;
						anInt4869 = i_1_ + i_1_ - 1 - anInt4869;
						anInt4873 = -anInt4873;
					}
					for (;;) {
						i_5_ = method770(is, i_5_, i_2_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4865 - 1]));
						if (anInt4869 < i_2_)
							break;
						anInt4869 = i_2_ + i_2_ - 1 - anInt4869;
						anInt4873 = -anInt4873;
						i_5_ = method766(is, i_5_, i_1_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
						if (anInt4869 >= i_1_)
							break;
						anInt4869 = i_1_ + i_1_ - 1 - anInt4869;
						anInt4873 = -anInt4873;
					}
				} else if (anInt4873 < 0) {
					for (;;) {
						i_5_ = method766(is, i_5_, i_1_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4865 - 1]));
						if (anInt4869 >= i_1_)
							break;
						anInt4869 = i_2_ - 1 - (i_2_ - 1 - anInt4869) % i_4_;
					}
				} else {
					for (;;) {
						i_5_ = method770(is, i_5_, i_2_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
						if (anInt4869 < i_2_)
							break;
						anInt4869 = i_1_ + (anInt4869 - i_1_) % i_4_;
					}
				}
			} else {
				do {
					if (anInt4871 > 0) {
						if (aBoolean4861) {
							if (anInt4873 < 0) {
								i_5_ = method766(is, i_5_, i_1_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
								if (anInt4869 >= i_1_)
									return;
								anInt4869 = i_1_ + i_1_ - 1 - anInt4869;
								anInt4873 = -anInt4873;
								if (--anInt4871 == 0)
									break;
							}
							do {
								i_5_ = method770(is, i_5_, i_2_, i_0_,
										(class14_sub12_sub1.aByteArray4899[anInt4865 - 1]));
								if (anInt4869 < i_2_)
									return;
								anInt4869 = i_2_ + i_2_ - 1 - anInt4869;
								anInt4873 = -anInt4873;
								if (--anInt4871 == 0)
									break;
								i_5_ = method766(is, i_5_, i_1_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
								if (anInt4869 >= i_1_)
									return;
								anInt4869 = i_1_ + i_1_ - 1 - anInt4869;
								anInt4873 = -anInt4873;
							} while (--anInt4871 != 0);
						} else if (anInt4873 < 0) {
							for (;;) {
								i_5_ = method766(is, i_5_, i_1_, i_0_,
										(class14_sub12_sub1.aByteArray4899[anInt4865 - 1]));
								if (anInt4869 >= i_1_)
									return;
								int i_6_ = (i_2_ - 1 - anInt4869) / i_4_;
								if (i_6_ >= anInt4871) {
									anInt4869 += i_4_ * anInt4871;
									anInt4871 = 0;
									break;
								}
								anInt4869 += i_4_ * i_6_;
								anInt4871 -= i_6_;
							}
						} else {
							for (;;) {
								i_5_ = method770(is, i_5_, i_2_, i_0_, (class14_sub12_sub1.aByteArray4899[anInt4860]));
								if (anInt4869 < i_2_)
									return;
								int i_7_ = (anInt4869 - i_1_) / i_4_;
								if (i_7_ >= anInt4871) {
									anInt4869 -= i_4_ * anInt4871;
									anInt4871 = 0;
									break;
								}
								anInt4869 -= i_4_ * i_7_;
								anInt4871 -= i_7_;
							}
						}
					}
				} while (false);
				if (anInt4873 < 0) {
					method766(is, i_5_, 0, i_0_, 0);
					if (anInt4869 < 0) {
						anInt4869 = -1;
						method742();
						unlink();
					}
				} else {
					method770(is, i_5_, i_3_, i_0_, 0);
					if (anInt4869 >= i_3_) {
						anInt4869 = i_3_;
						method742();
						unlink();
					}
				}
			}
		}
	}

	public static int method740(byte[] is, int[] is_8_, int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_,
			int i_14_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i >>= 8;
		i_14_ >>= 8;
		i_10_ <<= 2;
		i_11_ <<= 2;
		if ((i_12_ = i_9_ + i - (i_14_ - 1)) > i_13_)
			i_12_ = i_13_;
		class14_sub9_sub4.anInt4863 += class14_sub9_sub4.anInt4862 * (i_12_ - i_9_);
		class14_sub9_sub4.anInt4864 += class14_sub9_sub4.anInt4874 * (i_12_ - i_9_);
		i_12_ -= 3;
		while (i_9_ < i_12_) {
			is_8_[i_9_++] += is[i--] * i_10_;
			i_10_ += i_11_;
			is_8_[i_9_++] += is[i--] * i_10_;
			i_10_ += i_11_;
			is_8_[i_9_++] += is[i--] * i_10_;
			i_10_ += i_11_;
			is_8_[i_9_++] += is[i--] * i_10_;
			i_10_ += i_11_;
		}
		i_12_ += 3;
		while (i_9_ < i_12_) {
			is_8_[i_9_++] += is[i--] * i_10_;
			i_10_ += i_11_;
		}
		class14_sub9_sub4.anInt4870 = i_10_ >> 2;
		class14_sub9_sub4.anInt4869 = i << 8;
		return i_9_;
	}

	public synchronized void method741(int i) {
		if (anInt4873 < 0)
			anInt4873 = -i;
		else
			anInt4873 = i;
	}

	public void method742() {
		if (anInt4867 != 0) {
			if (anInt4868 == -2147483648)
				anInt4868 = 0;
			anInt4867 = 0;
			method745();
		}
	}

	public static int method743(int i, int i_15_, byte[] is, int[] is_16_, int i_17_, int i_18_, int i_19_, int i_20_,
			int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_26_,
			int i_27_) {
		class14_sub9_sub4.anInt4870 -= class14_sub9_sub4.anInt4872 * i_18_;
		if (i_26_ == 0 || (i_23_ = i_18_ + (i_25_ + 256 - i_17_ + i_26_) / i_26_) > i_24_)
			i_23_ = i_24_;
		i_18_ <<= 1;
		i_23_ <<= 1;
		while (i_18_ < i_23_) {
			i_15_ = i_17_ >> 8;
			i = is[i_15_ - 1];
			i = (i << 8) + (is[i_15_] - i) * (i_17_ & 0xff);
			is_16_[i_18_++] += i * i_19_ >> 6;
			i_19_ += i_21_;
			is_16_[i_18_++] += i * i_20_ >> 6;
			i_20_ += i_22_;
			i_17_ += i_26_;
		}
		if (i_26_ == 0 || ((i_23_ = (i_18_ >> 1) + (i_25_ - i_17_ + i_26_) / i_26_) > i_24_))
			i_23_ = i_24_;
		i_23_ <<= 1;
		i_15_ = i_27_;
		while (i_18_ < i_23_) {
			i = (i_15_ << 8) + (is[i_17_ >> 8] - i_15_) * (i_17_ & 0xff);
			is_16_[i_18_++] += i * i_19_ >> 6;
			i_19_ += i_21_;
			is_16_[i_18_++] += i * i_20_ >> 6;
			i_20_ += i_22_;
			i_17_ += i_26_;
		}
		i_18_ >>= 1;
		class14_sub9_sub4.anInt4870 += class14_sub9_sub4.anInt4872 * i_18_;
		class14_sub9_sub4.anInt4863 = i_19_;
		class14_sub9_sub4.anInt4864 = i_20_;
		class14_sub9_sub4.anInt4869 = i_17_;
		return i_18_;
	}

	public static int method744(int i, int i_28_, byte[] is, int[] is_29_, int i_30_, int i_31_, int i_32_, int i_33_,
			int i_34_, int i_35_, int i_36_, int i_37_, int i_38_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_39_,
			int i_40_) {
		class14_sub9_sub4.anInt4870 -= class14_sub9_sub4.anInt4872 * i_31_;
		if (i_39_ == 0 || (i_36_ = i_31_ + (i_38_ - i_30_ + i_39_ - 257) / i_39_) > i_37_)
			i_36_ = i_37_;
		i_31_ <<= 1;
		i_36_ <<= 1;
		while (i_31_ < i_36_) {
			i_28_ = i_30_ >> 8;
			i = is[i_28_];
			i = (i << 8) + (is[i_28_ + 1] - i) * (i_30_ & 0xff);
			is_29_[i_31_++] += i * i_32_ >> 6;
			i_32_ += i_34_;
			is_29_[i_31_++] += i * i_33_ >> 6;
			i_33_ += i_35_;
			i_30_ += i_39_;
		}
		if (i_39_ == 0 || ((i_36_ = (i_31_ >> 1) + (i_38_ - i_30_ + i_39_ - 1) / i_39_) > i_37_))
			i_36_ = i_37_;
		i_36_ <<= 1;
		i_28_ = i_40_;
		while (i_31_ < i_36_) {
			i = is[i_30_ >> 8];
			i = (i << 8) + (i_28_ - i) * (i_30_ & 0xff);
			is_29_[i_31_++] += i * i_32_ >> 6;
			i_32_ += i_34_;
			is_29_[i_31_++] += i * i_33_ >> 6;
			i_33_ += i_35_;
			i_30_ += i_39_;
		}
		i_31_ >>= 1;
		class14_sub9_sub4.anInt4870 += class14_sub9_sub4.anInt4872 * i_31_;
		class14_sub9_sub4.anInt4863 = i_32_;
		class14_sub9_sub4.anInt4864 = i_33_;
		class14_sub9_sub4.anInt4869 = i_30_;
		return i_31_;
	}

	public synchronized void method692(int i) {
		if (anInt4867 > 0) {
			if (i >= anInt4867) {
				if (anInt4868 == -2147483648) {
					anInt4868 = 0;
					anInt4870 = anInt4863 = anInt4864 = 0;
					unlink();
					i = anInt4867;
				}
				anInt4867 = 0;
				method745();
			} else {
				anInt4870 += anInt4872 * i;
				anInt4863 += anInt4862 * i;
				anInt4864 += anInt4874 * i;
				anInt4867 -= i;
			}
		}
		Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass14_Sub12_2866;
		int i_41_ = anInt4860 << 8;
		int i_42_ = anInt4865 << 8;
		int i_43_ = class14_sub12_sub1.aByteArray4899.length << 8;
		int i_44_ = i_42_ - i_41_;
		if (i_44_ <= 0)
			anInt4871 = 0;
		if (anInt4869 < 0) {
			if (anInt4873 > 0)
				anInt4869 = 0;
			else {
				method742();
				unlink();
				return;
			}
		}
		if (anInt4869 >= i_43_) {
			if (anInt4873 < 0)
				anInt4869 = i_43_ - 1;
			else {
				method742();
				unlink();
				return;
			}
		}
		anInt4869 += anInt4873 * i;
		if (anInt4871 < 0) {
			if (aBoolean4861) {
				if (anInt4873 < 0) {
					if (anInt4869 >= i_41_)
						return;
					anInt4869 = i_41_ + i_41_ - 1 - anInt4869;
					anInt4873 = -anInt4873;
				}
				while (anInt4869 >= i_42_) {
					anInt4869 = i_42_ + i_42_ - 1 - anInt4869;
					anInt4873 = -anInt4873;
					if (anInt4869 >= i_41_)
						break;
					anInt4869 = i_41_ + i_41_ - 1 - anInt4869;
					anInt4873 = -anInt4873;
				}
			} else if (anInt4873 < 0) {
				if (anInt4869 < i_41_)
					anInt4869 = i_42_ - 1 - (i_42_ - 1 - anInt4869) % i_44_;
			} else if (anInt4869 >= i_42_)
				anInt4869 = i_41_ + (anInt4869 - i_41_) % i_44_;
		} else {
			do {
				if (anInt4871 > 0) {
					if (aBoolean4861) {
						if (anInt4873 < 0) {
							if (anInt4869 >= i_41_)
								return;
							anInt4869 = i_41_ + i_41_ - 1 - anInt4869;
							anInt4873 = -anInt4873;
							if (--anInt4871 == 0)
								break;
						}
						do {
							if (anInt4869 < i_42_)
								return;
							anInt4869 = i_42_ + i_42_ - 1 - anInt4869;
							anInt4873 = -anInt4873;
							if (--anInt4871 == 0)
								break;
							if (anInt4869 >= i_41_)
								return;
							anInt4869 = i_41_ + i_41_ - 1 - anInt4869;
							anInt4873 = -anInt4873;
						} while (--anInt4871 != 0);
					} else {
						if (anInt4873 < 0) {
							if (anInt4869 < i_41_) {
								int i_45_ = (i_42_ - 1 - anInt4869) / i_44_;
								if (i_45_ >= anInt4871) {
									anInt4869 += i_44_ * anInt4871;
									anInt4871 = 0;
									break;
								}
								anInt4869 += i_44_ * i_45_;
								anInt4871 -= i_45_;
							}
						} else if (anInt4869 >= i_42_) {
							int i_46_ = (anInt4869 - i_41_) / i_44_;
							if (i_46_ >= anInt4871) {
								anInt4869 -= i_44_ * anInt4871;
								anInt4871 = 0;
								break;
							}
							anInt4869 -= i_44_ * i_46_;
							anInt4871 -= i_46_;
						}
						return;
					}
				}
			} while (false);
			if (anInt4873 < 0) {
				if (anInt4869 < 0) {
					anInt4869 = -1;
					method742();
					unlink();
				}
			} else if (anInt4869 >= i_43_) {
				anInt4869 = i_43_;
				method742();
				unlink();
			}
		}
	}

	public void method745() {
		anInt4870 = anInt4868;
		anInt4863 = method754(anInt4868, anInt4866);
		anInt4864 = method762(anInt4868, anInt4866);
	}

	public synchronized void method746(int i, int i_47_, int i_48_) {
		if (i == 0)
			method756(i_47_, i_48_);
		else {
			int i_49_ = method754(i_47_, i_48_);
			int i_50_ = method762(i_47_, i_48_);
			if (anInt4863 == i_49_ && anInt4864 == i_50_)
				anInt4867 = 0;
			else {
				int i_51_ = i_47_ - anInt4870;
				if (anInt4870 - i_47_ > i_51_)
					i_51_ = anInt4870 - i_47_;
				if (i_49_ - anInt4863 > i_51_)
					i_51_ = i_49_ - anInt4863;
				if (anInt4863 - i_49_ > i_51_)
					i_51_ = anInt4863 - i_49_;
				if (i_50_ - anInt4864 > i_51_)
					i_51_ = i_50_ - anInt4864;
				if (anInt4864 - i_50_ > i_51_)
					i_51_ = anInt4864 - i_50_;
				if (i > i_51_)
					i = i_51_;
				anInt4867 = i;
				anInt4868 = i_47_;
				anInt4866 = i_48_;
				anInt4872 = (i_47_ - anInt4870) / i;
				anInt4862 = (i_49_ - anInt4863) / i;
				anInt4874 = (i_50_ - anInt4864) / i;
			}
		}
	}

	public synchronized void method747(int i, int i_52_) {
		method746(i, i_52_, method758());
	}

	public boolean method748() {
		if (anInt4869 >= 0 && anInt4869 < (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899).length << 8)
			return false;
		return true;
	}

	public static int method749(int i, byte[] is, int[] is_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_,
			int i_59_, int i_60_, int i_61_, int i_62_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i_54_ >>= 8;
		i_62_ >>= 8;
		i_56_ <<= 2;
		i_57_ <<= 2;
		i_58_ <<= 2;
		i_59_ <<= 2;
		if ((i_60_ = i_55_ + i_54_ - (i_62_ - 1)) > i_61_)
			i_60_ = i_61_;
		class14_sub9_sub4.anInt4870 += class14_sub9_sub4.anInt4872 * (i_60_ - i_55_);
		i_55_ <<= 1;
		i_60_ <<= 1;
		i_60_ -= 6;
		while (i_55_ < i_60_) {
			i = is[i_54_--];
			is_53_[i_55_++] += i * i_56_;
			i_56_ += i_58_;
			is_53_[i_55_++] += i * i_57_;
			i_57_ += i_59_;
			i = is[i_54_--];
			is_53_[i_55_++] += i * i_56_;
			i_56_ += i_58_;
			is_53_[i_55_++] += i * i_57_;
			i_57_ += i_59_;
			i = is[i_54_--];
			is_53_[i_55_++] += i * i_56_;
			i_56_ += i_58_;
			is_53_[i_55_++] += i * i_57_;
			i_57_ += i_59_;
			i = is[i_54_--];
			is_53_[i_55_++] += i * i_56_;
			i_56_ += i_58_;
			is_53_[i_55_++] += i * i_57_;
			i_57_ += i_59_;
		}
		i_60_ += 6;
		while (i_55_ < i_60_) {
			i = is[i_54_--];
			is_53_[i_55_++] += i * i_56_;
			i_56_ += i_58_;
			is_53_[i_55_++] += i * i_57_;
			i_57_ += i_59_;
		}
		class14_sub9_sub4.anInt4863 = i_56_ >> 2;
		class14_sub9_sub4.anInt4864 = i_57_ >> 2;
		class14_sub9_sub4.anInt4869 = i_54_ << 8;
		return i_55_ >> 1;
	}

	public static int method750(int i, int i_63_, byte[] is, int[] is_64_, int i_65_, int i_66_, int i_67_, int i_68_,
			int i_69_, int i_70_, int i_71_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_72_, int i_73_) {
		class14_sub9_sub4.anInt4863 -= class14_sub9_sub4.anInt4862 * i_66_;
		class14_sub9_sub4.anInt4864 -= class14_sub9_sub4.anInt4874 * i_66_;
		if (i_72_ == 0 || (i_69_ = i_66_ + (i_71_ + 256 - i_65_ + i_72_) / i_72_) > i_70_)
			i_69_ = i_70_;
		while (i_66_ < i_69_) {
			i_63_ = i_65_ >> 8;
			i = is[i_63_ - 1];
			is_64_[i_66_++] += ((i << 8) + (is[i_63_] - i) * (i_65_ & 0xff)) * i_67_ >> 6;
			i_67_ += i_68_;
			i_65_ += i_72_;
		}
		if (i_72_ == 0 || (i_69_ = i_66_ + (i_71_ - i_65_ + i_72_) / i_72_) > i_70_)
			i_69_ = i_70_;
		i = i_73_;
		i_63_ = i_72_;
		while (i_66_ < i_69_) {
			is_64_[i_66_++] += (((i << 8) + (is[i_65_ >> 8] - i) * (i_65_ & 0xff)) * i_67_ >> 6);
			i_67_ += i_68_;
			i_65_ += i_63_;
		}
		class14_sub9_sub4.anInt4863 += class14_sub9_sub4.anInt4862 * i_66_;
		class14_sub9_sub4.anInt4864 += class14_sub9_sub4.anInt4874 * i_66_;
		class14_sub9_sub4.anInt4870 = i_67_;
		class14_sub9_sub4.anInt4869 = i_65_;
		return i_66_;
	}

	public static int method751(int i, int i_74_, byte[] is, int[] is_75_, int i_76_, int i_77_, int i_78_, int i_79_,
			int i_80_, int i_81_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_82_, int i_83_) {
		if (i_82_ == 0 || (i_79_ = i_77_ + (i_81_ + 256 - i_76_ + i_82_) / i_82_) > i_80_)
			i_79_ = i_80_;
		while (i_77_ < i_79_) {
			i_74_ = i_76_ >> 8;
			i = is[i_74_ - 1];
			is_75_[i_77_++] += ((i << 8) + (is[i_74_] - i) * (i_76_ & 0xff)) * i_78_ >> 6;
			i_76_ += i_82_;
		}
		if (i_82_ == 0 || (i_79_ = i_77_ + (i_81_ - i_76_ + i_82_) / i_82_) > i_80_)
			i_79_ = i_80_;
		i = i_83_;
		i_74_ = i_82_;
		while (i_77_ < i_79_) {
			is_75_[i_77_++] += (((i << 8) + (is[i_76_ >> 8] - i) * (i_76_ & 0xff)) * i_78_ >> 6);
			i_76_ += i_74_;
		}
		class14_sub9_sub4.anInt4869 = i_76_;
		return i_77_;
	}

	public static int method752(int i, int i_84_, byte[] is, int[] is_85_, int i_86_, int i_87_, int i_88_, int i_89_,
			int i_90_, int i_91_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_92_, int i_93_) {
		if (i_92_ == 0 || (i_89_ = i_87_ + (i_91_ - i_86_ + i_92_ - 257) / i_92_) > i_90_)
			i_89_ = i_90_;
		while (i_87_ < i_89_) {
			i_84_ = i_86_ >> 8;
			i = is[i_84_];
			is_85_[i_87_++] += (((i << 8) + (is[i_84_ + 1] - i) * (i_86_ & 0xff)) * i_88_ >> 6);
			i_86_ += i_92_;
		}
		if (i_92_ == 0 || (i_89_ = i_87_ + (i_91_ - i_86_ + i_92_ - 1) / i_92_) > i_90_)
			i_89_ = i_90_;
		i_84_ = i_93_;
		while (i_87_ < i_89_) {
			i = is[i_86_ >> 8];
			is_85_[i_87_++] += ((i << 8) + (i_84_ - i) * (i_86_ & 0xff)) * i_88_ >> 6;
			i_86_ += i_92_;
		}
		class14_sub9_sub4.anInt4869 = i_86_;
		return i_87_;
	}

	public static int method753(int i, int i_94_, byte[] is, int[] is_95_, int i_96_, int i_97_, int i_98_, int i_99_,
			int i_100_, int i_101_, int i_102_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_103_, int i_104_) {
		if (i_103_ == 0 || ((i_100_ = i_97_ + (i_102_ - i_96_ + i_103_ - 257) / i_103_) > i_101_))
			i_100_ = i_101_;
		i_97_ <<= 1;
		i_100_ <<= 1;
		while (i_97_ < i_100_) {
			i_94_ = i_96_ >> 8;
			i = is[i_94_];
			i = (i << 8) + (is[i_94_ + 1] - i) * (i_96_ & 0xff);
			is_95_[i_97_++] += i * i_98_ >> 6;
			is_95_[i_97_++] += i * i_99_ >> 6;
			i_96_ += i_103_;
		}
		if (i_103_ == 0 || (i_100_ = (i_97_ >> 1) + (i_102_ - i_96_ + i_103_ - 1) / i_103_) > i_101_)
			i_100_ = i_101_;
		i_100_ <<= 1;
		i_94_ = i_104_;
		while (i_97_ < i_100_) {
			i = is[i_96_ >> 8];
			i = (i << 8) + (i_94_ - i) * (i_96_ & 0xff);
			is_95_[i_97_++] += i * i_98_ >> 6;
			is_95_[i_97_++] += i * i_99_ >> 6;
			i_96_ += i_103_;
		}
		class14_sub9_sub4.anInt4869 = i_96_;
		return i_97_ >> 1;
	}

	public static int method754(int i, int i_105_) {
		return (i_105_ < 0 ? i : (int) ((double) i * Math.sqrt((double) (16384 - i_105_) * 1.220703125E-4) + 0.5));
	}

	public static int method755(int i, int i_106_, byte[] is, int[] is_107_, int i_108_, int i_109_, int i_110_,
			int i_111_, int i_112_, int i_113_, int i_114_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_115_,
			int i_116_) {
		if (i_115_ == 0 || ((i_112_ = i_109_ + (i_114_ + 256 - i_108_ + i_115_) / i_115_) > i_113_))
			i_112_ = i_113_;
		i_109_ <<= 1;
		i_112_ <<= 1;
		while (i_109_ < i_112_) {
			i_106_ = i_108_ >> 8;
			i = is[i_106_ - 1];
			i = (i << 8) + (is[i_106_] - i) * (i_108_ & 0xff);
			is_107_[i_109_++] += i * i_110_ >> 6;
			is_107_[i_109_++] += i * i_111_ >> 6;
			i_108_ += i_115_;
		}
		if (i_115_ == 0 || ((i_112_ = (i_109_ >> 1) + (i_114_ - i_108_ + i_115_) / i_115_) > i_113_))
			i_112_ = i_113_;
		i_112_ <<= 1;
		i_106_ = i_116_;
		while (i_109_ < i_112_) {
			i = (i_106_ << 8) + (is[i_108_ >> 8] - i_106_) * (i_108_ & 0xff);
			is_107_[i_109_++] += i * i_110_ >> 6;
			is_107_[i_109_++] += i * i_111_ >> 6;
			i_108_ += i_115_;
		}
		class14_sub9_sub4.anInt4869 = i_108_;
		return i_109_ >> 1;
	}

	public synchronized void method756(int i, int i_117_) {
		anInt4868 = i;
		anInt4866 = i_117_;
		anInt4867 = 0;
		method745();
	}

	public static int method757(byte[] is, int[] is_118_, int i, int i_119_, int i_120_, int i_121_, int i_122_,
			int i_123_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i >>= 8;
		i_123_ >>= 8;
		i_120_ <<= 2;
		if ((i_121_ = i_119_ + i_123_ - i) > i_122_)
			i_121_ = i_122_;
		i_121_ -= 3;
		while (i_119_ < i_121_) {
			is_118_[i_119_++] += is[i++] * i_120_;
			is_118_[i_119_++] += is[i++] * i_120_;
			is_118_[i_119_++] += is[i++] * i_120_;
			is_118_[i_119_++] += is[i++] * i_120_;
		}
		i_121_ += 3;
		while (i_119_ < i_121_)
			is_118_[i_119_++] += is[i++] * i_120_;
		class14_sub9_sub4.anInt4869 = i << 8;
		return i_119_;
	}

	public synchronized int method758() {
		return anInt4866 < 0 ? -1 : anInt4866;
	}

	public boolean method759() {
		int i = anInt4868;
		int i_124_;
		int i_125_;
		if (i == -2147483648)
			i = i_124_ = i_125_ = 0;
		else {
			i_124_ = method754(i, anInt4866);
			i_125_ = method762(i, anInt4866);
		}
		if (anInt4870 != i || anInt4863 != i_124_ || anInt4864 != i_125_) {
			if (anInt4870 < i) {
				anInt4872 = 1;
				anInt4867 = i - anInt4870;
			} else if (anInt4870 > i) {
				anInt4872 = -1;
				anInt4867 = anInt4870 - i;
			} else
				anInt4872 = 0;
			if (anInt4863 < i_124_) {
				anInt4862 = 1;
				if (anInt4867 == 0 || anInt4867 > i_124_ - anInt4863)
					anInt4867 = i_124_ - anInt4863;
			} else if (anInt4863 > i_124_) {
				anInt4862 = -1;
				if (anInt4867 == 0 || anInt4867 > anInt4863 - i_124_)
					anInt4867 = anInt4863 - i_124_;
			} else
				anInt4862 = 0;
			if (anInt4864 < i_125_) {
				anInt4874 = 1;
				if (anInt4867 == 0 || anInt4867 > i_125_ - anInt4864)
					anInt4867 = i_125_ - anInt4864;
			} else if (anInt4864 > i_125_) {
				anInt4874 = -1;
				if (anInt4867 == 0 || anInt4867 > anInt4864 - i_125_)
					anInt4867 = anInt4864 - i_125_;
			} else
				anInt4874 = 0;
			return false;
		}
		if (anInt4868 == -2147483648) {
			anInt4868 = 0;
			anInt4870 = anInt4863 = anInt4864 = 0;
			unlink();
			return true;
		}
		method745();
		return false;
	}

	public synchronized void method760(int i) {
		method756(i, method758());
	}

	public static int method761(int i, int i_126_, byte[] is, int[] is_127_, int i_128_, int i_129_, int i_130_,
			int i_131_, int i_132_, int i_133_, int i_134_, Class14_Sub9_Sub4 class14_sub9_sub4, int i_135_,
			int i_136_) {
		class14_sub9_sub4.anInt4863 -= class14_sub9_sub4.anInt4862 * i_129_;
		class14_sub9_sub4.anInt4864 -= class14_sub9_sub4.anInt4874 * i_129_;
		if (i_135_ == 0 || ((i_132_ = i_129_ + (i_134_ - i_128_ + i_135_ - 257) / i_135_) > i_133_))
			i_132_ = i_133_;
		while (i_129_ < i_132_) {
			i_126_ = i_128_ >> 8;
			i = is[i_126_];
			is_127_[i_129_++] += (((i << 8) + (is[i_126_ + 1] - i) * (i_128_ & 0xff)) * i_130_) >> 6;
			i_130_ += i_131_;
			i_128_ += i_135_;
		}
		if (i_135_ == 0 || ((i_132_ = i_129_ + (i_134_ - i_128_ + i_135_ - 1) / i_135_) > i_133_))
			i_132_ = i_133_;
		i_126_ = i_136_;
		while (i_129_ < i_132_) {
			i = is[i_128_ >> 8];
			is_127_[i_129_++] += ((i << 8) + (i_126_ - i) * (i_128_ & 0xff)) * i_130_ >> 6;
			i_130_ += i_131_;
			i_128_ += i_135_;
		}
		class14_sub9_sub4.anInt4863 += class14_sub9_sub4.anInt4862 * i_129_;
		class14_sub9_sub4.anInt4864 += class14_sub9_sub4.anInt4874 * i_129_;
		class14_sub9_sub4.anInt4870 = i_130_;
		class14_sub9_sub4.anInt4869 = i_128_;
		return i_129_;
	}

	public static int method762(int i, int i_137_) {
		return (i_137_ < 0 ? -i : (int) (((double) i * Math.sqrt((double) i_137_ * 1.220703125E-4)) + 0.5));
	}

	public static Class14_Sub9_Sub4 method763(Class14_Sub12_Sub1 class14_sub12_sub1, int i, int i_138_, int i_139_) {
		if (class14_sub12_sub1.aByteArray4899 == null || class14_sub12_sub1.aByteArray4899.length == 0)
			return null;
		return new Class14_Sub9_Sub4(class14_sub12_sub1, i, i_138_, i_139_);
	}

	public static int method764(byte[] is, int[] is_140_, int i, int i_141_, int i_142_, int i_143_, int i_144_,
			int i_145_, int i_146_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i >>= 8;
		i_146_ >>= 8;
		i_142_ <<= 2;
		i_143_ <<= 2;
		if ((i_144_ = i_141_ + i_146_ - i) > i_145_)
			i_144_ = i_145_;
		class14_sub9_sub4.anInt4863 += class14_sub9_sub4.anInt4862 * (i_144_ - i_141_);
		class14_sub9_sub4.anInt4864 += class14_sub9_sub4.anInt4874 * (i_144_ - i_141_);
		i_144_ -= 3;
		while (i_141_ < i_144_) {
			is_140_[i_141_++] += is[i++] * i_142_;
			i_142_ += i_143_;
			is_140_[i_141_++] += is[i++] * i_142_;
			i_142_ += i_143_;
			is_140_[i_141_++] += is[i++] * i_142_;
			i_142_ += i_143_;
			is_140_[i_141_++] += is[i++] * i_142_;
			i_142_ += i_143_;
		}
		i_144_ += 3;
		while (i_141_ < i_144_) {
			is_140_[i_141_++] += is[i++] * i_142_;
			i_142_ += i_143_;
		}
		class14_sub9_sub4.anInt4870 = i_142_ >> 2;
		class14_sub9_sub4.anInt4869 = i << 8;
		return i_141_;
	}

	public synchronized void method765(int i) {
		anInt4871 = i;
	}

	public int method766(int[] is, int i, int i_147_, int i_148_, int i_149_) {
		while (anInt4867 > 0) {
			int i_150_ = i + anInt4867;
			if (i_150_ > i_148_)
				i_150_ = i_148_;
			anInt4867 += i;
			if (anInt4873 == -256 && (anInt4869 & 0xff) == 0) {
				if (Class14_Sub2_Sub2.aBoolean3763)
					i = method749(0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
							anInt4863, anInt4864, anInt4862, anInt4874, 0, i_150_, i_147_, this);
				else
					i = method740((((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
							anInt4870, anInt4872, 0, i_150_, i_147_, this);
			} else if (Class14_Sub2_Sub2.aBoolean3763)
				i = method743(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4863, anInt4864, anInt4862, anInt4874, 0, i_150_, i_147_, this, anInt4873, i_149_);
			else
				i = method750(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4870, anInt4872, 0, i_150_, i_147_, this, anInt4873, i_149_);
			anInt4867 -= i;
			if (anInt4867 != 0)
				return i;
			if (method759())
				return i_148_;
		}
		if (anInt4873 == -256 && (anInt4869 & 0xff) == 0) {
			if (Class14_Sub2_Sub2.aBoolean3763)
				return method774(0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4863, anInt4864, 0, i_148_, i_147_, this);
			return method771((((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i, anInt4870,
					0, i_148_, i_147_, this);
		}
		if (Class14_Sub2_Sub2.aBoolean3763)
			return method755(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
					anInt4863, anInt4864, 0, i_148_, i_147_, this, anInt4873, i_149_);
		return method751(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i, anInt4870,
				0, i_148_, i_147_, this, anInt4873, i_149_);
	}

	public synchronized int method767() {
		return anInt4873 < 0 ? -anInt4873 : anInt4873;
	}

	public int method690() {
		if (anInt4868 == 0 && anInt4867 == 0)
			return 0;
		return 1;
	}

	public synchronized void method768(int i) {
		method756(i << 6, method758());
	}

	public synchronized int method769() {
		return anInt4868 == -2147483648 ? 0 : anInt4868;
	}

	public int method691() {
		int i = anInt4870 * 3 >> 6;
		i = (i ^ i >> 31) + (i >>> 31);
		if (anInt4871 == 0)
			i -= i * anInt4869 / ((((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899).length << 8);
		else if (anInt4871 >= 0)
			i -= i * anInt4860 / (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899).length;
		return i > 255 ? 255 : i;
	}

	public int method770(int[] is, int i, int i_151_, int i_152_, int i_153_) {
		while (anInt4867 > 0) {
			int i_154_ = i + anInt4867;
			if (i_154_ > i_152_)
				i_154_ = i_152_;
			anInt4867 += i;
			if (anInt4873 == 256 && (anInt4869 & 0xff) == 0) {
				if (Class14_Sub2_Sub2.aBoolean3763)
					i = method772(0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
							anInt4863, anInt4864, anInt4862, anInt4874, 0, i_154_, i_151_, this);
				else
					i = method764((((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
							anInt4870, anInt4872, 0, i_154_, i_151_, this);
			} else if (Class14_Sub2_Sub2.aBoolean3763)
				i = method744(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4863, anInt4864, anInt4862, anInt4874, 0, i_154_, i_151_, this, anInt4873, i_153_);
			else
				i = method761(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4870, anInt4872, 0, i_154_, i_151_, this, anInt4873, i_153_);
			anInt4867 -= i;
			if (anInt4867 != 0)
				return i;
			if (method759())
				return i_152_;
		}
		if (anInt4873 == 256 && (anInt4869 & 0xff) == 0) {
			if (Class14_Sub2_Sub2.aBoolean3763)
				return method773(0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
						anInt4863, anInt4864, 0, i_152_, i_151_, this);
			return method757((((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i, anInt4870,
					0, i_152_, i_151_, this);
		}
		if (Class14_Sub2_Sub2.aBoolean3763)
			return method753(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i,
					anInt4863, anInt4864, 0, i_152_, i_151_, this, anInt4873, i_153_);
		return method752(0, 0, (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899), is, anInt4869, i, anInt4870,
				0, i_152_, i_151_, this, anInt4873, i_153_);
	}

	public static int method771(byte[] is, int[] is_155_, int i, int i_156_, int i_157_, int i_158_, int i_159_,
			int i_160_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i >>= 8;
		i_160_ >>= 8;
		i_157_ <<= 2;
		if ((i_158_ = i_156_ + i - (i_160_ - 1)) > i_159_)
			i_158_ = i_159_;
		i_158_ -= 3;
		while (i_156_ < i_158_) {
			is_155_[i_156_++] += is[i--] * i_157_;
			is_155_[i_156_++] += is[i--] * i_157_;
			is_155_[i_156_++] += is[i--] * i_157_;
			is_155_[i_156_++] += is[i--] * i_157_;
		}
		i_158_ += 3;
		while (i_156_ < i_158_)
			is_155_[i_156_++] += is[i--] * i_157_;
		class14_sub9_sub4.anInt4869 = i << 8;
		return i_156_;
	}

	public static int method772(int i, byte[] is, int[] is_161_, int i_162_, int i_163_, int i_164_, int i_165_,
			int i_166_, int i_167_, int i_168_, int i_169_, int i_170_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i_162_ >>= 8;
		i_170_ >>= 8;
		i_164_ <<= 2;
		i_165_ <<= 2;
		i_166_ <<= 2;
		i_167_ <<= 2;
		if ((i_168_ = i_163_ + i_170_ - i_162_) > i_169_)
			i_168_ = i_169_;
		class14_sub9_sub4.anInt4870 += class14_sub9_sub4.anInt4872 * (i_168_ - i_163_);
		i_163_ <<= 1;
		i_168_ <<= 1;
		i_168_ -= 6;
		while (i_163_ < i_168_) {
			i = is[i_162_++];
			is_161_[i_163_++] += i * i_164_;
			i_164_ += i_166_;
			is_161_[i_163_++] += i * i_165_;
			i_165_ += i_167_;
			i = is[i_162_++];
			is_161_[i_163_++] += i * i_164_;
			i_164_ += i_166_;
			is_161_[i_163_++] += i * i_165_;
			i_165_ += i_167_;
			i = is[i_162_++];
			is_161_[i_163_++] += i * i_164_;
			i_164_ += i_166_;
			is_161_[i_163_++] += i * i_165_;
			i_165_ += i_167_;
			i = is[i_162_++];
			is_161_[i_163_++] += i * i_164_;
			i_164_ += i_166_;
			is_161_[i_163_++] += i * i_165_;
			i_165_ += i_167_;
		}
		i_168_ += 6;
		while (i_163_ < i_168_) {
			i = is[i_162_++];
			is_161_[i_163_++] += i * i_164_;
			i_164_ += i_166_;
			is_161_[i_163_++] += i * i_165_;
			i_165_ += i_167_;
		}
		class14_sub9_sub4.anInt4863 = i_164_ >> 2;
		class14_sub9_sub4.anInt4864 = i_165_ >> 2;
		class14_sub9_sub4.anInt4869 = i_162_ << 8;
		return i_163_ >> 1;
	}

	public static int method773(int i, byte[] is, int[] is_171_, int i_172_, int i_173_, int i_174_, int i_175_,
			int i_176_, int i_177_, int i_178_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i_172_ >>= 8;
		i_178_ >>= 8;
		i_174_ <<= 2;
		i_175_ <<= 2;
		if ((i_176_ = i_173_ + i_178_ - i_172_) > i_177_)
			i_176_ = i_177_;
		i_173_ <<= 1;
		i_176_ <<= 1;
		i_176_ -= 6;
		while (i_173_ < i_176_) {
			i = is[i_172_++];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_++];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_++];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
			i = is[i_172_++];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
		}
		i_176_ += 6;
		while (i_173_ < i_176_) {
			i = is[i_172_++];
			is_171_[i_173_++] += i * i_174_;
			is_171_[i_173_++] += i * i_175_;
		}
		class14_sub9_sub4.anInt4869 = i_172_ << 8;
		return i_173_ >> 1;
	}

	public Class14_Sub9_Sub4(Class14_Sub12_Sub1 class14_sub12_sub1, int i, int i_179_) {
		aClass14_Sub12_2866 = class14_sub12_sub1;
		anInt4860 = class14_sub12_sub1.anInt4896;
		anInt4865 = class14_sub12_sub1.anInt4898;
		aBoolean4861 = class14_sub12_sub1.aBoolean4897;
		anInt4873 = i;
		anInt4868 = i_179_;
		anInt4866 = 8192;
		anInt4869 = 0;
		method745();
	}

	public static int method774(int i, byte[] is, int[] is_180_, int i_181_, int i_182_, int i_183_, int i_184_,
			int i_185_, int i_186_, int i_187_, Class14_Sub9_Sub4 class14_sub9_sub4) {
		i_181_ >>= 8;
		i_187_ >>= 8;
		i_183_ <<= 2;
		i_184_ <<= 2;
		if ((i_185_ = i_182_ + i_181_ - (i_187_ - 1)) > i_186_)
			i_185_ = i_186_;
		i_182_ <<= 1;
		i_185_ <<= 1;
		i_185_ -= 6;
		while (i_182_ < i_185_) {
			i = is[i_181_--];
			is_180_[i_182_++] += i * i_183_;
			is_180_[i_182_++] += i * i_184_;
			i = is[i_181_--];
			is_180_[i_182_++] += i * i_183_;
			is_180_[i_182_++] += i * i_184_;
			i = is[i_181_--];
			is_180_[i_182_++] += i * i_183_;
			is_180_[i_182_++] += i * i_184_;
			i = is[i_181_--];
			is_180_[i_182_++] += i * i_183_;
			is_180_[i_182_++] += i * i_184_;
		}
		i_185_ += 6;
		while (i_182_ < i_185_) {
			i = is[i_181_--];
			is_180_[i_182_++] += i * i_183_;
			is_180_[i_182_++] += i * i_184_;
		}
		class14_sub9_sub4.anInt4869 = i_181_ << 8;
		return i_182_ >> 1;
	}

	public static Class14_Sub9_Sub4 method775(Class14_Sub12_Sub1 class14_sub12_sub1, int i, int i_188_) {
		if (class14_sub12_sub1.aByteArray4899 == null || class14_sub12_sub1.aByteArray4899.length == 0)
			return null;
		return new Class14_Sub9_Sub4(class14_sub12_sub1,
				(int) ((long) class14_sub12_sub1.anInt4895 * 256L * (long) i / (long) (Class115.anInt1909 * 100)),
				i_188_ << 6);
	}

	public boolean method776() {
		if (anInt4867 != 0)
			return true;
		return false;
	}

	public Class14_Sub9 method688() {
		return null;
	}

	public synchronized void method777(int i) {
		if (i == 0) {
			method760(0);
			unlink();
		} else if (anInt4863 == 0 && anInt4864 == 0) {
			anInt4867 = 0;
			anInt4868 = 0;
			anInt4870 = 0;
			unlink();
		} else {
			int i_189_ = -anInt4870;
			if (anInt4870 > i_189_)
				i_189_ = anInt4870;
			if (-anInt4863 > i_189_)
				i_189_ = -anInt4863;
			if (anInt4863 > i_189_)
				i_189_ = anInt4863;
			if (-anInt4864 > i_189_)
				i_189_ = -anInt4864;
			if (anInt4864 > i_189_)
				i_189_ = anInt4864;
			if (i > i_189_)
				i = i_189_;
			anInt4867 = i;
			anInt4868 = -2147483648;
			anInt4872 = -anInt4870 / i;
			anInt4862 = -anInt4863 / i;
			anInt4874 = -anInt4864 / i;
		}
	}

	public Class14_Sub9_Sub4(Class14_Sub12_Sub1 class14_sub12_sub1, int i, int i_190_, int i_191_) {
		aClass14_Sub12_2866 = class14_sub12_sub1;
		anInt4860 = class14_sub12_sub1.anInt4896;
		anInt4865 = class14_sub12_sub1.anInt4898;
		aBoolean4861 = class14_sub12_sub1.aBoolean4897;
		anInt4873 = i;
		anInt4868 = i_190_;
		anInt4866 = i_191_;
		anInt4869 = 0;
		method745();
	}

	public synchronized void method778(int i) {
		int i_192_ = (((Class14_Sub12_Sub1) aClass14_Sub12_2866).aByteArray4899.length << 8);
		if (i < -1)
			i = -1;
		if (i > i_192_)
			i = i_192_;
		anInt4869 = i;
	}

	public synchronized void method779(boolean bool) {
		anInt4873 = (anInt4873 ^ anInt4873 >> 31) + (anInt4873 >>> 31);
		if (bool)
			anInt4873 = -anInt4873;
	}
}
