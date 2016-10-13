/* Class14_Sub8_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import java.util.Random;

import com.jagex.io.Buffer;
import com.jagex.util.RandomUtil;
import com.jagex.util.Util;

public class Class14_Sub8_Sub36 extends Class14_Sub8 {

	private static int anInt2252;
	private static int anInt2662;
	private static int anInt2664;
	private static int anInt4377;
	
	public byte[] aByteArray4699;
	public int anInt4692 = 1;
	public int anInt4701;

	public int anInt4705;

	public int anInt4710;

	public int anInt4712;

	public int anInt4714;

	public short[] aShortArray4703 = new short[512];

	public Class14_Sub8_Sub36() {
		super(0, true);
		aByteArray4699 = new byte[512];
		anInt4701 = 5;
		anInt4705 = 0;
		anInt4712 = 5;
		anInt4710 = 2048;
		anInt4714 = 2;
	}

	@Override
	public void method472() {
		aByteArray4699 = TexStatic.method527(anInt4705, (byte) -84);
		method670();
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_25_ = i;
		while_43_: do {
			while_42_: do {
				while_41_: do {
					while_40_: do {
						while_39_: do {
							do {
								if (i_25_ != 0) {
									if (i_25_ != 1) {
										if (i_25_ != 2) {
											if (i_25_ != 3) {
												if (i_25_ != 4) {
													if (i_25_ != 5) {
														if (i_25_ == 6)
															break while_42_;
														break while_43_;
													}
												} else
													break while_40_;
												break while_41_;
											}
										} else
											break;
										break while_39_;
									}
								} else {
									anInt4701 = anInt4712 = class14_sub10.readUByte();
									break while_43_;
								}
								anInt4705 = class14_sub10.readUByte();
								break while_43_;
							} while (false);
							anInt4710 = class14_sub10.readUShort((byte) 125);
							break while_43_;
						} while (false);
						anInt4714 = class14_sub10.readUByte();
						break while_43_;
					} while (false);
					anInt4692 = class14_sub10.readUByte();
					break while_43_;
				} while (false);
				anInt4701 = class14_sub10.readUByte();
				break while_43_;
			} while (false);
			anInt4712 = class14_sub10.readUByte();
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		int[] is_27_ = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int i_28_ = anInt4712 * TexStatic.anIntArray3623[i] + 2048;
			int i_29_ = i_28_ >> 44;
			int i_30_ = i_29_ + 1;
			int i_31_ = 0;
			while_51_: for (/**/; TexStatic.anInt1876 > i_31_; i_31_++) {
				anInt4377 = anInt2252 = anInt2664 = anInt2662 = 2147483647;
				int i_32_ = (TexStatic.anIntArray4145[i_31_] * anInt4701 + 2048);
				int i_33_ = i_32_ >> 12;
				int i_34_ = i_33_ + 1;
				for (int i_35_ = i_29_ - 1; i_30_ >= i_35_; i_35_++) {
					int i_36_ = (aByteArray4699[(i_35_ >= anInt4712 ? i_35_ - anInt4712 : i_35_) & 0xff] & 0xff);
					for (int i_37_ = i_33_ - 1; i_37_ <= i_34_; i_37_++) {
						int i_38_ = ((aByteArray4699[(i_37_ >= anInt4701 ? i_37_ - anInt4701 : i_37_) + i_36_ & 0xff]
								& 0xff) * 2);
						int i_39_ = (-aShortArray4703[i_38_++] - ((i_37_ << 44) - i_32_));
						int i_40_ = (-(i_35_ << 44) + (-aShortArray4703[i_38_] + i_28_));
						int i_41_ = anInt4692;
						int i_42_;
						while_47_: do {
							while_46_: do {
								while_45_: do {
									while_44_: do {
										do {
											if (i_41_ != 1) {
												if (i_41_ != 3) {
													if (i_41_ != 4) {
														if (i_41_ != 5) {
															if (i_41_ == 2)
																break while_45_;
															break while_46_;
														}
													} else
														break;
													break while_44_;
												}
											} else {
												i_42_ = (i_39_ * i_39_ + i_40_ * i_40_) >> 44;
												break while_47_;
											}
											i_40_ = i_40_ < 0 ? -i_40_ : i_40_;
											i_39_ = i_39_ < 0 ? -i_39_ : i_39_;
											i_42_ = (i_40_ < i_39_ ? i_39_ : i_40_);
											break while_47_;
										} while (false);
										i_39_ = (int) ((Math
												.sqrt(((i_39_ < 0) ? -i_39_ : i_39_) / 4096.0F))
												* 4096.0);
										i_40_ = (int) ((Math
												.sqrt(((i_40_ >= 0) ? i_40_ : -i_40_) / 4096.0F))
												* 4096.0);
										i_42_ = i_39_ + i_40_;
										i_42_ = i_42_ * i_42_ >> 12;
										break while_47_;
									} while (false);
									i_40_ *= i_40_;
									i_39_ *= i_39_;
									i_42_ = (int) ((Math
											.sqrt(Math.sqrt((i_39_ + i_40_) / 1.6777216E7F)))
											* 4096.0);
									break while_47_;
								} while (false);
								i_42_ = ((i_39_ < 0 ? -i_39_ : i_39_) + (i_40_ >= 0 ? i_40_ : -i_40_));
								break while_47_;
							} while (false);
							i_42_ = (int) ((Math
									.sqrt((i_40_ * i_40_ + i_39_ * i_39_) / 1.6777216E7F)) * 4096.0);
						} while (false);
						if (anInt4377 > i_42_) {
							anInt2662 = anInt2664;
							anInt2664 = anInt2252;
							anInt2252 = anInt4377;
							anInt4377 = i_42_;
						} else if (i_42_ >= anInt2252) {
							if (anInt2664 <= i_42_) {
								if (i_42_ < anInt2662)
									anInt2662 = i_42_;
							} else {
								anInt2662 = anInt2664;
								anInt2664 = i_42_;
							}
						} else {
							anInt2662 = anInt2664;
							anInt2664 = anInt2252;
							anInt2252 = i_42_;
						}
					}
				}
				int i_43_ = anInt4714;
				while_49_: do {
					while_48_: do {
						do {
							if (i_43_ != 0) {
								if (i_43_ != 1) {
									if (i_43_ != 3) {
										if (i_43_ != 4) {
											if (i_43_ == 2)
												break while_49_;
											continue while_51_;
										}
									} else
										break;
									break while_48_;
								}
							} else {
								is_27_[i_31_] = anInt4377;
								continue while_51_;
							}
							is_27_[i_31_] = anInt2252;
							continue while_51_;
						} while (false);
						is_27_[i_31_] = anInt2664;
						continue while_51_;
					} while (false);
					is_27_[i_31_] = anInt2662;
					continue while_51_;
				} while (false);
				is_27_[i_31_] = -anInt4377 + anInt2252;
			}
		}
		is = is_27_;
		return is;
	}

	public void method670() {
		try {
				Random random = new Random(anInt4705);
				aShortArray4703 = new short[512];
				if (anInt4710 > 0) {
					for (int i_44_ = 0; i_44_ < 512; i_44_++)
						aShortArray4703[i_44_] = (short) RandomUtil.method1949(random, anInt4710);
				}
		} catch (Throwable throwable) {
			throw Util.error(throwable, new StringBuilder("va.E(").append(')').toString());
		}
	}
}
