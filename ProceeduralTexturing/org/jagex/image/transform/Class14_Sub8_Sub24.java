/* Class14_Sub8_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub24 extends Class14_Sub8 {
	public int anInt4484;
	public int anInt4485 = 0;
	public int anInt4487;

	public int anInt4490;

	public int anInt4492;

	public int anInt4495;

	public int anInt4497;

	public int anInt4498;

	public int anInt4504;

	public Class14_Sub8_Sub24() {
		super(1, false);
		anInt4484 = 0;
		anInt4504 = 0;
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int[][] is_66_ = method480(0, i);
			int[] is_67_ = is_66_[0];
			int[] is_68_ = is_66_[2];
			int[] is_69_ = is[1];
			int[] is_70_ = is[2];
			int[] is_71_ = is_66_[1];
			int[] is_72_ = is[0];
			for (int i_73_ = 0; i_73_ < TexStatic.anInt1876; i_73_++) {
				method609(is_71_[i_73_], is_67_[i_73_], is_68_[i_73_], (byte) 53);
				anInt4495 += anInt4504;
				anInt4498 += anInt4485;
				if (anInt4495 < 0)
					anInt4495 = 0;
				if (anInt4495 > 4096)
					anInt4495 = 4096;
				anInt4492 += anInt4484;
				if (anInt4492 < 0)
					anInt4492 = 0;
				if (anInt4492 > 4096)
					anInt4492 = 4096;
				for (/**/; anInt4498 < 0; anInt4498 += 4096) {
					/* empty */
				}
				for (/**/; anInt4498 > 4096; anInt4498 -= 4096) {
					/* empty */
				}
				method607(anInt4492, anInt4495, anInt4498);
				is_72_[i_73_] = anInt4490;
				is_69_[i_73_] = anInt4497;
				is_70_[i_73_] = anInt4487;
			}
		}
		int[][] is_74_ = is;
		return is_74_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		int i_76_ = i;
		while_102_: do {
			do {
				if (i_76_ != 0) {
					if (i_76_ != 1) {
						if (i_76_ == 2)
							break;
						break while_102_;
					}
				} else {
					anInt4485 = class14_sub10.method805(0);
					break while_102_;
				}
				anInt4504 = (class14_sub10.method780() << 12) / 100;
				break while_102_;
			} while (false);
			anInt4484 = (class14_sub10.method780() << 12) / 100;
		} while (false);
	}

	public void method607(int i, int i_77_, int i_79_) {
		int i_80_ = (i > 2048 ? -(i_77_ * i >> 12) + (i + i_77_) : (i_77_ + 4096) * i >> 12);
		while_106_: do {
			if (i_80_ > 0) {
				i_79_ *= 6;
				int i_81_ = i + (i - i_80_);
				int i_82_ = (-i_81_ + i_80_ << 44) / i_80_;
				int i_83_ = i_79_ >> 12;
				int i_84_ = i_79_ - (i_83_ << 12);
				int i_85_ = i_80_;
				i_85_ = i_85_ * i_82_ >> 12;
				i_85_ = i_85_ * i_84_ >> 44;
				int i_86_ = i_85_ + i_81_;
				int i_87_ = -i_85_ + i_80_;
				int i_88_ = i_83_;
				while_105_: do {
					while_104_: do {
						while_103_: do {
							do {
								if (i_88_ != 0) {
									if (i_88_ != 1) {
										if (i_88_ != 2) {
											if (i_88_ != 3) {
												if (i_88_ != 4) {
													if (i_88_ != 5)
														break while_106_;
												} else
													break while_104_;
												break while_105_;
											}
										} else
											break;
										break while_103_;
									}
								} else {
									anInt4487 = i_81_;
									anInt4490 = i_80_;
									anInt4497 = i_86_;
									break while_106_;
								}
								anInt4487 = i_81_;
								anInt4490 = i_87_;
								anInt4497 = i_80_;
								break while_106_;
							} while (false);
							anInt4490 = i_81_;
							anInt4497 = i_80_;
							anInt4487 = i_86_;
							break while_106_;
						} while (false);
						anInt4487 = i_80_;
						anInt4490 = i_81_;
						anInt4497 = i_87_;
						break while_106_;
					} while (false);
					anInt4497 = i_81_;
					anInt4487 = i_80_;
					anInt4490 = i_86_;
					break while_106_;
				} while (false);
				anInt4490 = i_80_;
				anInt4497 = i_81_;
				anInt4487 = i_87_;
			} else
				anInt4490 = anInt4497 = anInt4487 = i;
		} while (false);
	}

	public void method609(int i, int i_89_, int i_90_, byte i_91_) {
		int i_92_ = i <= i_89_ ? i : i_89_;
		if (i_91_ != 53)
			outputColour(92);
		i_92_ = i_92_ > i_90_ ? i_90_ : i_92_;
		int i_93_ = i_89_ > i ? i_89_ : i;
		i_93_ = i_90_ <= i_93_ ? i_93_ : i_90_;
		int i_94_ = -i_92_ + i_93_;
		anInt4492 = (i_93_ + i_92_) / 2;
		if (anInt4492 > 0 && anInt4492 < 4096)
			anInt4495 = (i_94_ << 12) / (anInt4492 > 2048 ? -(anInt4492 * 2) + 8192 : anInt4492 * 2);
		else
			anInt4495 = 0;
		if (i_94_ <= 0)
			anInt4498 = 0;
		else {
			int i_95_ = (-i_89_ + i_93_ << 12) / i_94_;
			int i_96_ = (i_93_ - i << 44) / i_94_;
			int i_97_ = (-i_90_ + i_93_ << 44) / i_94_;
			if (i_93_ == i_89_)
				anInt4498 = i == i_92_ ? 20480 + i_97_ : 4096 - i_96_;
			else if (i_93_ == i)
				anInt4498 = i_92_ == i_90_ ? i_95_ + 4096 : -i_97_ + 12288;
			else
				anInt4498 = i_89_ != i_92_ ? -i_95_ + 20480 : i_96_ + 12288;
			anInt4498 /= 6;
		}
	}
}
