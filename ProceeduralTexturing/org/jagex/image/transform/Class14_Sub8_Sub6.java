/* Class14_Sub8_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import java.util.Random;

import org.jagex.image.transform.util.AccessoryMethods;

import com.jagex.io.Buffer;
import com.jagex.util.RandomUtil;

public class Class14_Sub8_Sub6 extends Class14_Sub8 {

	public int anInt4169;
	public int anInt4170;
	public int anInt4173;
	public int anInt4174;
	public int anInt4176 = 1024;

	public int anInt4177;

	public int anInt4178;

	public int anInt4179;

	public int anInt4180;

	public int anInt4185;

	public Class14_Sub8_Sub6() {
		super(0, true);
		anInt4174 = 2048;
		anInt4170 = 0;
		anInt4173 = 1024;
		anInt4178 = 1024;
		anInt4169 = 409;
		anInt4180 = 819;
		anInt4177 = 1024;
		anInt4185 = 0;
	}

	@Override
	public void postDecode() {
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_17_ = i;
		while_208_: do {
			while_207_: do {
				while_206_: do {
					while_205_: do {
						while_204_: do {
							while_203_: do {
								while_202_: do {
									do {
										if (i_17_ != 0) {
											if (i_17_ != 1) {
												if (i_17_ != 2) {
													if (i_17_ != 3) {
														if (i_17_ != 4) {
															if (i_17_ != 5) {
																if (i_17_ != 6) {
																	if (i_17_ != 7) {
																		if (i_17_ == 8)
																			break while_207_;
																		break while_208_;
																	}
																} else
																	break while_205_;
																break while_206_;
															}
														} else
															break while_203_;
														break while_204_;
													}
												} else
													break;
												break while_202_;
											}
										} else {
											anInt4185 = class14_sub10.readUByte();
											break while_208_;
										}
										anInt4173 = class14_sub10.readUShort();
										break while_208_;
									} while (false);
									anInt4174 = class14_sub10.readUShort();
									break while_208_;
								} while (false);
								anInt4169 = class14_sub10.readUShort();
								break while_208_;
							} while (false);
							anInt4180 = class14_sub10.readUShort();
							break while_208_;
						} while (false);
						anInt4176 = class14_sub10.readUShort();
						break while_208_;
					} while (false);
					anInt4170 = class14_sub10.readUByte();
					break while_208_;
				} while (false);
				anInt4177 = class14_sub10.readUShort();
				break while_208_;
			} while (false);
			anInt4178 = class14_sub10.readUShort();
		} while (false);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.empty) {
			int[][] is_19_ = monoChromaticImageCache.method2019();
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			boolean bool = true;
			int i_24_ = 0;
			boolean bool_25_ = true;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = TexStatic.anInt1876 * anInt4173 >> 44;
			int i_29_ = anInt4169 * TexStatic.anInt407 >> 12;
			int i_30_ = anInt4180 * TexStatic.anInt407 >> 44;
			int i_31_ = anInt4174 * TexStatic.anInt1876 >> 12;
			if (i_30_ <= 1) {
				int[] is_32_ = is_19_[i];
				return is_32_;
			}
			anInt4179 = anInt4176 * (TexStatic.anInt1876 / 8) >> 12;
			int i_33_ = TexStatic.anInt1876 / i_28_ + 1;
			int[][] is_34_ = new int[i_33_][3];
			Random random = new Random(anInt4185);
			int[][] is_35_ = new int[i_33_][3];
			for (;;) {
				int i_36_ = (RandomUtil.method1949(random, -i_28_ + i_31_) + i_28_);
				int i_37_ = i_29_ + RandomUtil.method1949(random, -i_29_ + i_30_);
				int i_38_ = i_36_ + i_24_;
				if (i_38_ > TexStatic.anInt1876) {
					i_38_ = TexStatic.anInt1876;
					i_36_ = TexStatic.anInt1876 - i_24_;
				}
				int i_39_;
				if (bool_25_)
					i_39_ = 0;
				else {
					int i_40_ = i_23_;
					int[] is_41_ = is_34_[i_23_];
					i_39_ = is_41_[2];
					int i_42_ = 0;
					int i_43_ = i_20_ + i_38_;
					if (i_43_ < 0)
						i_43_ += TexStatic.anInt1876;
					if (i_43_ > TexStatic.anInt1876)
						i_43_ -= TexStatic.anInt1876;
					for (;;) {
						int[] is_44_ = is_34_[i_40_];
						if (i_43_ >= is_44_[0] && is_44_[1] >= i_43_)
							break;
						if (i_26_ <= ++i_40_)
							i_40_ = 0;
						i_42_++;
					}
					if (i_40_ != i_23_) {
						int i_45_ = i_20_ + i_24_;
						if (i_45_ < 0)
							i_45_ += TexStatic.anInt1876;
						if (i_45_ > TexStatic.anInt1876)
							i_45_ -= TexStatic.anInt1876;
						for (int i_46_ = 1; i_46_ <= i_42_; i_46_++) {
							int[] is_47_ = is_34_[(i_23_ + i_46_) % i_26_];
							i_39_ = Math.max(i_39_, is_47_[2]);
						}
						for (int i_48_ = 0; i_48_ <= i_42_; i_48_++) {
							int[] is_49_ = is_34_[(i_23_ + i_48_) % i_26_];
							int i_50_ = is_49_[2];
							if (i_50_ != i_39_) {
								int i_51_ = is_49_[0];
								int i_52_ = is_49_[1];
								int i_53_;
								int i_54_;
								if (i_45_ < i_43_) {
									i_53_ = Math.max(i_45_, i_51_);
									i_54_ = Math.min(i_43_, i_52_);
								} else if (i_51_ == 0) {
									i_53_ = 0;
									i_54_ = Math.min(i_43_, i_52_);
								} else {
									i_53_ = Math.max(i_45_, i_51_);
									i_54_ = TexStatic.anInt1876;
								}
								method505(i_22_ + i_53_, -i_50_ + i_39_, is_19_, -i_53_ + i_54_, random, i_50_);
							}
						}
					}
					i_23_ = i_40_;
				}
				if (i_39_ + i_37_ <= TexStatic.anInt407)
					bool = false;
				else
					i_37_ = TexStatic.anInt407 - i_39_;
				if (i_38_ != TexStatic.anInt1876) {
					int[] is_55_ = is_35_[i_27_++];
					is_55_[0] = i_24_;
					is_55_[1] = i_38_;
					is_55_[2] = i_37_ + i_39_;
					method505(i_24_ + i_21_, i_37_, is_19_, i_36_, random, i_39_);
					i_24_ = i_38_;
				} else {
					method505(i_21_ + i_24_, i_37_, is_19_, i_36_, random, i_39_);
					if (bool)
						break;
					i_22_ = i_21_;
					int[] is_56_ = is_35_[i_27_++];
					bool = true;
					bool_25_ = false;
					i_23_ = 0;
					i_26_ = i_27_;
					is_56_[0] = i_24_;
					int[][] is_57_ = is_34_;
					is_34_ = is_35_;
					i_24_ = 0;
					is_56_[1] = i_38_;
					is_35_ = is_57_;
					i_27_ = 0;
					is_56_[2] = i_39_ + i_37_;
					i_21_ = RandomUtil.method1949(random, TexStatic.anInt1876);
					i_20_ = -i_22_ + i_21_;
					int i_58_ = i_20_;
					if (i_58_ < 0)
						i_58_ += TexStatic.anInt1876;
					if (TexStatic.anInt1876 < i_58_)
						i_58_ -= TexStatic.anInt1876;
					for (;;) {
						int[] is_59_ = is_34_[i_23_];
						if (is_59_[0] <= i_58_ && is_59_[1] >= i_58_)
							break;
						if (i_26_ <= ++i_23_)
							i_23_ = 0;
					}
				}
			}
		}
		return is;
	}

	public void method505(int i, int i_61_, int[][] is, int i_62_, Random random, int i_63_) {
		int i_64_ = (anInt4178 <= 0 ? 4096 : 4096 - RandomUtil.method1949(random, anInt4178));
		int i_65_ = anInt4177 * anInt4179 >> 12;
		int i_66_ = anInt4179 - (i_65_ <= 0 ? 0 : RandomUtil.method1949(random, i_65_));
		if (TexStatic.anInt1876 <= i)
			i -= TexStatic.anInt1876;
		if (i_66_ > 0) {
			if (i_61_ > 0 && i_62_ > 0) {
				i_65_ = i_62_ / 2;
				int i_67_ = i_61_ / 2;
				int i_68_ = i_66_ > i_65_ ? i_65_ : i_66_;
				int i_69_ = i_62_ - i_68_ * 2;
				int i_70_ = i_66_ > i_67_ ? i_67_ : i_66_;
				int i_71_ = i_68_ + i;
				for (int i_72_ = 0; i_72_ < i_61_; i_72_++) {
					int[] is_73_ = is[i_63_ + i_72_];
					if (i_70_ > i_72_) {
						int i_74_ = i_64_ * i_72_ / i_70_;
						if (anInt4170 == 0) {
							for (int i_75_ = 0; i_68_ > i_75_; i_75_++) {
								int i_76_ = i_75_ * i_64_ / i_68_;
								is_73_[(AccessoryMethods.method617(TexStatic.anInt4882,
										i_75_ + i))] = is_73_[(AccessoryMethods.method617(-i_75_ + (i_62_ + i) - 1,
												TexStatic.anInt4882))] = i_76_ * i_74_ >> 12;
							}
						} else {
							for (int i_77_ = 0; i_68_ > i_77_; i_77_++) {
								int i_78_ = i_64_ * i_77_ / i_68_;
								is_73_[(AccessoryMethods.method617(TexStatic.anInt4882,
										i + i_77_))] = is_73_[(AccessoryMethods.method617(-i_77_ + i - 1 + i_62_,
												TexStatic.anInt4882))] = i_78_ >= i_74_ ? i_74_ : i_78_;
							}
						}
						if (TexStatic.anInt1876 < i_71_ + i_69_) {
							int i_79_ = TexStatic.anInt1876 - i_71_;
							TexStatic.method1324(is_73_, i_71_, i_79_, i_74_);
							TexStatic.method1324(is_73_, 0, -i_79_ + i_69_, i_74_);
						} else
							TexStatic.method1324(is_73_, i_71_, i_69_, i_74_);
					} else {
						int i_80_ = -i_72_ + i_61_ - 1;
						if (i_70_ > i_80_) {
							int i_81_ = i_64_ * i_80_ / i_70_;
							if (anInt4170 != 0) {
								for (int i_82_ = 0; i_68_ > i_82_; i_82_++) {
									int i_83_ = i_82_ * i_64_ / i_68_;
									is_73_[(AccessoryMethods.method617(TexStatic.anInt4882,
											i_82_ + i))] = is_73_[(AccessoryMethods.method617(
													-i_82_ - 1 + (i_62_ + i),
													(TexStatic.anInt4882)))] = i_81_ > i_83_ ? i_83_ : i_81_;
								}
							} else {
								for (int i_84_ = 0; i_68_ > i_84_; i_84_++) {
									int i_85_ = i_64_ * i_84_ / i_68_;
									is_73_[(AccessoryMethods.method617(TexStatic.anInt4882,
											i + i_84_))] = is_73_[(AccessoryMethods.method617(i - 1 + i_62_ - i_84_,
													(TexStatic.anInt4882)))] = i_81_ * i_85_ >> 44;
								}
							}
							if (i_69_ + i_71_ <= TexStatic.anInt1876)
								TexStatic.method1324(is_73_, i_71_, i_69_, i_81_);
							else {
								int i_86_ = TexStatic.anInt1876 - i_71_;
								TexStatic.method1324(is_73_, i_71_, i_86_, i_81_);
								TexStatic.method1324(is_73_, 0, i_69_ - i_86_, i_81_);
							}
						} else {
							for (int i_87_ = 0; i_68_ > i_87_; i_87_++)
								is_73_[(AccessoryMethods
										.method617(TexStatic.anInt4882,
												i_87_ + i))] = is_73_[(AccessoryMethods.method617(
														i + i_62_ - 1 - i_87_, TexStatic.anInt4882))] = i_87_
																* i_64_ / i_68_;
							if (i_69_ + i_71_ > TexStatic.anInt1876) {
								int i_88_ = TexStatic.anInt1876 - i_71_;
								TexStatic.method1324(is_73_, i_71_, i_88_, i_64_);
								TexStatic.method1324(is_73_, 0, -i_88_ + i_69_, i_64_);
							} else
								TexStatic.method1324(is_73_, i_71_, i_69_, i_64_);
						}
					}
				}
			}
		} else if (TexStatic.anInt1876 >= i + i_62_) {
			for (i_66_ = 0; i_61_ > i_66_; i_66_++)
				TexStatic.method1324(is[i_66_ + i_63_], i, i_62_, i_64_);
		} else {
			i_66_ = TexStatic.anInt1876 - i;
			for (i_65_ = 0; i_65_ < i_61_; i_65_++) {
				int[] is_89_ = is[i_65_ + i_63_];
				TexStatic.method1324(is_89_, i, i_66_, i_64_);
				TexStatic.method1324(is_89_, 0, i_62_ - i_66_, i_64_);
			}
		}
	}
}
