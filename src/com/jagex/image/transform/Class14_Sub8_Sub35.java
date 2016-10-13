/* Class14_Sub8_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub35 extends Class14_Sub8 {
	public int anInt4673 = 2048;
	public int anInt4674;
	public int anInt4680 = 0;

	public int anInt4685;

	public int anInt4688;

	public int anInt4689;

	public int anInt4690;

	public Class14_Sub8_Sub35() {
		super(0, true);
		anInt4674 = 8192;
		anInt4685 = 12288;
		anInt4689 = 0;
		anInt4688 = 4096;
		anInt4690 = 2048;
	}

	@Override
	public void method472() {
		TexStatic.method321(256);
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		while_28_: do {
				int i_41_ = i;
				while_27_: do {
					while_26_: do {
						while_25_: do {
							while_24_: do {
								do {
									if (i_41_ != 0) {
										if (i_41_ != 1) {
											if (i_41_ != 2) {
												if (i_41_ != 3) {
													if (i_41_ != 4) {
														if (i_41_ != 5) {
															if (i_41_ == 6)
																break while_27_;
															break while_28_;
														}
													} else
														break while_25_;
													break while_26_;
												}
											} else
												break;
											break while_24_;
										}
									} else {
										anInt4673 = class14_sub10.readUShort((byte) 114);
										break while_28_;
									}
									anInt4680 = class14_sub10.readUShort((byte) 120);
									break while_28_;
								} while (false);
								anInt4689 = class14_sub10.readUShort((byte) 104);
								break while_28_;
							} while (false);
							anInt4690 = class14_sub10.readUShort((byte) 111);
							break while_28_;
						} while (false);
						anInt4685 = class14_sub10.readUShort((byte) 111);
						break while_28_;
					} while (false);
					anInt4688 = class14_sub10.readUShort((byte) 113);
					break while_28_;
				} while (false);
				anInt4674 = class14_sub10.readUShort((byte) 122);
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int i_43_ = TexStatic.anIntArray3623[i] - 2048;
			for (int i_44_ = 0; i_44_ < TexStatic.anInt1876; i_44_++) {
				int i_45_ = i_43_ + anInt4680;
				i_45_ = i_45_ < -2048 ? i_45_ + 4096 : i_45_;
				int i_46_ = TexStatic.anIntArray4145[i_44_] - 2048;
				i_45_ = i_45_ <= 2048 ? i_45_ : i_45_ - 4096;
				int i_47_ = i_46_ + anInt4673;
				int i_48_ = anInt4690 + i_43_;
				int i_49_ = anInt4689 + i_46_;
				i_48_ = i_48_ >= -2048 ? i_48_ : i_48_ + 4096;
				i_48_ = i_48_ <= 2048 ? i_48_ : i_48_ - 4096;
				i_49_ = i_49_ < -2048 ? i_49_ + 4096 : i_49_;
				i_49_ = i_49_ <= 2048 ? i_49_ : i_49_ - 4096;
				i_47_ = i_47_ >= -2048 ? i_47_ : i_47_ + 4096;
				i_47_ = i_47_ > 2048 ? i_47_ - 4096 : i_47_;
				is[i_44_] = (!method667(i_45_, i_47_) && !method662(i_48_, i_49_)) ? 0 : 4096;
			}
		}
		int[] is_50_ = is;
		return is_50_;
	}

	public boolean method662(int i, int i_51_) {
		int i_53_ = anInt4685 * (i + i_51_) >> 44;
		int i_54_ = TexStatic.anIntArray3357[i_53_ * 255 >> 44 & 0xff];
		i_54_ = (i_54_ << 12) / anInt4685;
		i_54_ = (i_54_ << 44) / anInt4674;
		i_54_ = i_54_ * anInt4688 >> 44;
		boolean bool = i - i_51_ < i_54_ && -i_54_ < -i_51_ + i;
		return bool;
	}

	public boolean method667(int i, int i_56_) {
		int i_57_ = (-i_56_ + i) * anInt4685 >> 44;
		int i_58_ = TexStatic.anIntArray3357[(i_57_ * 255 & 0xff9a9) >> 12];
		i_58_ = (i_58_ << 12) / anInt4685;
		i_58_ = (i_58_ << 12) / anInt4674;
		i_58_ = anInt4688 * i_58_ >> 12;
		boolean bool = i_58_ > i + i_56_ && i_56_ + i > -i_58_;
		return bool;
	}
}
