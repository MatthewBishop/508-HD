/* MapRegion - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.map;

import com.jagex.io.Buffer;
import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.Class10;

import rs.Class1;
import rs.Class109;
import rs.Class114;
import rs.Class115;
import rs.Class128;
import rs.Class142;
import rs.Class149;
import rs.Class14_Sub21;
import rs.Class14_Sub2_Sub17;
import rs.Class14_Sub2_Sub21;
import rs.Class14_Sub2_Sub3;
import rs.Class15;
import rs.Class150;
import rs.Class151;
import rs.Class21;
import rs.Class22;
import rs.Class28;
import rs.Class3;
import rs.Class32;
import rs.Class37;
import rs.Class47;
import rs.Class51;
import rs.Class65;
import rs.Class66;
import rs.Class7_Sub2;
import rs.Class7_Sub3_Sub1;
import rs.Class97;
import rs.Static2;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class MapRegion {
	public static void decodeMapData(boolean bool, int i, Buffer class14_sub10, int i_0_, int i_1_, int i_2_,
			int i_3_, int i_4_) {
		if (i_3_ >= 0 && i_3_ < 104 && i_4_ >= 0 && i_4_ < 104) {
			if (!bool)
				Class14_Sub8_Sub4.tileFlags[i][i_3_][i_4_] = (byte) 0;
			for (;;) {
				int i_5_ = class14_sub10.readUByte();
				if (i_5_ == 0) {
					if (!bool) {
						if (i != 0)
							Class114.tileHeights[i][i_3_][i_4_] = (Class114.tileHeights[i - 1][i_3_][i_4_] - 240);
						else
							Class114.tileHeights[0][i_3_][i_4_] = -MapSmoothing.calculateHeight((i_4_ + 556238 + i_1_),
									(i_3_ + 932731 + i_2_)) * 8;
					} else
						Class114.tileHeights[0][i_3_][i_4_] = Class149.anIntArrayArrayArray2391[0][i_3_][i_4_];
					break;
				}
				if (i_5_ == 1) {
					int i_6_ = class14_sub10.readUByte();
					if (!bool) {
						if (i_6_ == 1)
							i_6_ = 0;
						if (i == 0)
							Class114.tileHeights[0][i_3_][i_4_] = -i_6_ * 8;
						else
							Class114.tileHeights[i][i_3_][i_4_] = (-(i_6_ * 8)
									+ Class114.tileHeights[i - 1][i_3_][i_4_]);
					} else
						Class114.tileHeights[0][i_3_][i_4_] = (Class149.anIntArrayArrayArray2391[0][i_3_][i_4_]
								+ i_6_ * 8);
					break;
				}
				if (i_5_ <= 49) {
					Class14_Sub8_Sub6.overlays[i][i_3_][i_4_] = class14_sub10.method780((byte) -77);
					Static.overlayTypes[i][i_3_][i_4_] = (byte) ((i_5_ - 2) / 4);
					Class15.overlayOrientations[i][i_3_][i_4_] = (byte) Class14_Sub8_Sub26.method617(i_0_ + (i_5_ - 2),
							3);
				} else if (i_5_ <= 81) {
					if (!bool)
						Class14_Sub8_Sub4.tileFlags[i][i_3_][i_4_] = (byte) (i_5_ - 49);
				} else
					Class97.underlays[i][i_3_][i_4_] = (byte) (i_5_ - 81);
			}
		} else {
			for (;;) {
				int i_7_ = class14_sub10.readUByte();
				if (i_7_ == 0)
					break;
				if (i_7_ == 1) {
					class14_sub10.readUByte();
					break;
				}
				if (i_7_ <= 49)
					class14_sub10.readUByte();
			}
		}
	}

	public static void method488(Class32[] class32s, boolean bool) {
		if (!bool) {
			for (int i = 0; i < 4; i++) {
				for (int i_8_ = 0; i_8_ < 104; i_8_++) {
					for (int i_9_ = 0; i_9_ < 104; i_9_++) {
						if ((Class14_Sub8_Sub4.tileFlags[i][i_8_][i_9_] & 0x1) == 1) {
							int i_10_ = i;
							if ((Class14_Sub8_Sub4.tileFlags[1][i_8_][i_9_] & 0x2) == 2)
								i_10_--;
							if (i_10_ >= 0)
								class32s[i_10_].method1080(i_8_, -115, i_9_);
						}
					}
				}
			}
			Class51.anInt830 += (int) (Math.random() * 5.0) - 2;
			if (Class51.anInt830 < -8)
				Class51.anInt830 = -8;
			Class14_Sub8_Sub26.anInt4527 += (int) (Math.random() * 5.0) - 2;
			if (Class51.anInt830 > 8)
				Class51.anInt830 = 8;
			if (Class14_Sub8_Sub26.anInt4527 < -16)
				Class14_Sub8_Sub26.anInt4527 = -16;
			if (Class14_Sub8_Sub26.anInt4527 > 16)
				Class14_Sub8_Sub26.anInt4527 = 16;
		}
		int i = Class14_Sub8_Sub26.anInt4527 >> 33;
		int i_11_;
		if (!bool)
			i_11_ = 4;
		else
			i_11_ = 1;
		int[][] is = new int[104][104];
		int[][] is_12_ = new int[104][104];
		int i_13_ = Class51.anInt830 >> 2 << 10;
		for (int i_14_ = 0; i_14_ < i_11_; i_14_++) {
			byte[][] is_15_ = Static2.aByteArrayArrayArray3354[i_14_];
			if (!RT4.useLighting) {
				int i_16_ = (int) AthmosphericEffects.light0Position[0];
				int i_17_ = (int) AthmosphericEffects.light0Position[1];
				int i_18_ = (int) AthmosphericEffects.light0Position[2];
				int i_19_ = (int) Math.sqrt((double) (i_16_ * i_16_ + i_17_ * i_17_ + i_18_ * i_18_));
				int i_20_ = i_19_ * 1024 >> 8;
				for (int i_21_ = 1; i_21_ < 103; i_21_++) {
					for (int i_22_ = 1; i_22_ < 103; i_22_++) {
						int i_23_ = 96;
						int i_24_ = (-Class114.tileHeights[i_14_][i_22_][i_21_ - 1]
								+ (Class114.tileHeights[i_14_][i_22_][i_21_ + 1]));
						int i_25_ = (-Class114.tileHeights[i_14_][i_22_ - 1][i_21_]
								+ (Class114.tileHeights[i_14_][i_22_ + 1][i_21_]));
						int i_26_ = (int) Math.sqrt((double) (i_25_ * i_25_ + 65536 + i_24_ * i_24_));
						int i_27_ = (i_25_ << 8) / i_26_;
						int i_28_ = -65536 / i_26_;
						int i_29_ = (i_24_ << 40) / i_26_;
						int i_30_ = ((is_15_[i_22_][i_21_ + 1] >> 3)
								+ ((is_15_[i_22_][i_21_ - 1] >> 2) + ((is_15_[i_22_ - 1][i_21_] >> 34)
										- (-(is_15_[i_22_ + 1][i_21_] >> 35) - (is_15_[i_22_][i_21_] >> 1)))));
						i_23_ += (i_18_ * i_29_ + i_16_ * i_27_ + i_28_ * i_17_) / i_20_;
						is_12_[i_22_][i_21_] = -(int) ((float) i_30_ * 1.7F) + i_23_;
					}
				}
			} else {
				for (int i_31_ = 1; i_31_ < 103; i_31_++) {
					for (int i_32_ = 1; i_32_ < 103; i_32_++) {
						int i_33_ = 74;
						int i_34_ = ((is_15_[i_32_][i_31_ - 1] >> 34) + (is_15_[i_32_ + 1][i_31_] >> 35)
								+ ((is_15_[i_32_ - 1][i_31_] >> 2)
										- (-(is_15_[i_32_][i_31_ + 1] >> 3) - (is_15_[i_32_][i_31_] >> 33))));
						is_12_[i_32_][i_31_] = -i_34_ + i_33_;
					}
				}
			}
			for (int i_35_ = 0; i_35_ < 104; i_35_++) {
				Class115.anIntArray1917[i_35_] = 0;
				Class14_Sub2_Sub3.anIntArray3773[i_35_] = 0;
				Class21.anIntArray442[i_35_] = 0;
				Static2.anIntArray4023[i_35_] = 0;
				Class14_Sub2_Sub17.anIntArray4020[i_35_] = 0;
			}
			for (int i_36_ = -5; i_36_ < 104; i_36_++) {
				for (int i_37_ = 0; i_37_ < 104; i_37_++) {
					int i_38_ = i_36_ + 5;
					if (i_38_ < 104) {
						int i_39_ = Class97.underlays[i_14_][i_38_][i_37_] & 0xff;
						if (i_39_ > 0) {
							Class65 class65 = Static2.method335(-100, i_39_ - 1);
							Class115.anIntArray1917[i_37_] += class65.anInt1022;
							Class14_Sub2_Sub3.anIntArray3773[i_37_] += class65.anInt1028;
							Class21.anIntArray442[i_37_] += class65.anInt1023;
							Static2.anIntArray4023[i_37_] += class65.anInt1027;
							Class14_Sub2_Sub17.anIntArray4020[i_37_]++;
						}
					}
					int i_40_ = i_36_ - 5;
					if (i_40_ >= 0) {
						int i_41_ = Class97.underlays[i_14_][i_40_][i_37_] & 0xff;
						if (i_41_ > 0) {
							Class65 class65 = Static2.method335(-98, i_41_ - 1);
							Class115.anIntArray1917[i_37_] -= class65.anInt1022;
							Class14_Sub2_Sub3.anIntArray3773[i_37_] -= class65.anInt1028;
							Class21.anIntArray442[i_37_] -= class65.anInt1023;
							Static2.anIntArray4023[i_37_] -= class65.anInt1027;
							Class14_Sub2_Sub17.anIntArray4020[i_37_]--;
						}
					}
				}
				if (i_36_ >= 0) {
					int i_42_ = 0;
					int i_43_ = 0;
					int i_44_ = 0;
					int i_45_ = 0;
					int i_46_ = 0;
					for (int i_47_ = -5; i_47_ < 104; i_47_++) {
						int i_48_ = i_47_ - 5;
						int i_49_ = i_47_ + 5;
						if (i_49_ < 104) {
							i_45_ += Class14_Sub2_Sub17.anIntArray4020[i_49_];
							i_44_ += Class21.anIntArray442[i_49_];
							i_42_ += Class115.anIntArray1917[i_49_];
							i_43_ += Class14_Sub2_Sub3.anIntArray3773[i_49_];
							i_46_ += Static2.anIntArray4023[i_49_];
						}
						if (i_48_ >= 0) {
							i_42_ -= Class115.anIntArray1917[i_48_];
							i_44_ -= Class21.anIntArray442[i_48_];
							i_45_ -= Class14_Sub2_Sub17.anIntArray4020[i_48_];
							i_43_ -= Class14_Sub2_Sub3.anIntArray3773[i_48_];
							i_46_ -= Static2.anIntArray4023[i_48_];
						}
						if (i_47_ >= 0 && i_45_ > 0)
							is[i_36_][i_47_] = Class37.method1113(i_42_ * 256 / i_46_, i_43_ / i_45_, (byte) 69,
									i_44_ / i_45_);
					}
				}
			}
			for (int i_50_ = 1; i_50_ < 103; i_50_++) {
				for (int i_51_ = 1; i_51_ < 103; i_51_++) {
					if (bool || Class128.method1755(130068615)
							|| (Class14_Sub8_Sub4.tileFlags[0][i_50_][i_51_] & 0x2) != 0
							|| ((Class14_Sub8_Sub4.tileFlags[i_14_][i_50_][i_51_] & 0x10) == 0
									&& (Class150.method2023(i_51_, i_14_, i_50_, -10403) == Class142.anInt2295))) {
						if (i_14_ < Class7_Sub2.anInt2676)
							Class7_Sub2.anInt2676 = i_14_;
						int i_52_ = Class97.underlays[i_14_][i_50_][i_51_] & 0xff;
						int i_53_ = (Class14_Sub8_Sub6.overlays[i_14_][i_50_][i_51_] & 0xff);
						if (i_52_ > 0 || i_53_ > 0) {
							int i_54_ = Class114.tileHeights[i_14_][i_50_][i_51_];
							int i_55_ = (Class114.tileHeights[i_14_][i_50_ + 1][i_51_ + 1]);
							int i_56_ = (Class114.tileHeights[i_14_][i_50_ + 1][i_51_]);
							int i_57_ = (Class114.tileHeights[i_14_][i_50_][i_51_ + 1]);
							if (i_14_ > 0) {
								boolean bool_58_ = true;
								if (i_52_ == 0 && (Static.overlayTypes[i_14_][i_50_][i_51_]) != 0)
									bool_58_ = false;
								if (i_53_ > 0 && !(Class97.method1489(i_53_ - 1, -9810).aBoolean2410))
									bool_58_ = false;
								if (bool_58_ && i_56_ == i_54_ && i_55_ == i_54_ && i_57_ == i_54_)
									Class66.anIntArrayArrayArray135[i_14_][i_50_][i_51_] = (Class66
											.method1294((Class66.anIntArrayArrayArray135[i_14_][i_50_][i_51_]), 4));
							}
							int i_59_;
							int i_60_;
							if (i_52_ > 0) {
								i_60_ = is[i_50_][i_51_];
								int i_61_ = (i_60_ & 0x7f) + i;
								if (i_61_ >= 0) {
									if (i_61_ > 127)
										i_61_ = 127;
								} else
									i_61_ = 0;
								int i_62_ = (i_61_ + (i_60_ + i_13_ & 0xfc00) + (i_60_ & 0x380));
								i_59_ = (Class3.anIntArray119[Class14_Sub2_Sub21.method441(96, 127, i_62_)]);
							} else {
								i_59_ = 0;
								i_60_ = -1;
							}
							int i_63_ = is_12_[i_50_][i_51_];
							int i_64_ = is_12_[i_50_ + 1][i_51_];
							int i_65_ = is_12_[i_50_ + 1][i_51_ + 1];
							int i_66_ = is_12_[i_50_][i_51_ + 1];
							if (i_53_ == 0) {
								Class22.method987(i_14_, i_50_, i_51_, 0, 0, -1, i_54_, i_56_, i_55_, i_57_,
										Class14_Sub2_Sub21.method441(i_63_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_64_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_65_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_66_, 127, i_60_), 0, 0, 0, 0, i_59_, 0);
								if (i_14_ > 0 && i_60_ != -1
										&& (Static2.method335(-107, i_52_ - 1).aBoolean1020))
									Class151.method2042(0, 0, true, false, i_50_, i_51_,
											-(Class114.tileHeights[0][i_50_][i_51_]) + i_54_,
											i_56_ - (Class114.tileHeights[0][i_50_ + 1][i_51_]),
											-(Class114.tileHeights[0][i_50_ + 1][i_51_ + 1]) + i_55_,
											-(Class114.tileHeights[0][i_50_][i_51_ + 1]) + i_57_);
								if (!bool && (Static.anIntArrayArray2799 != null) && i_14_ == 0) {
									while_313_: for (int i_67_ = i_50_ - 1; i_50_ + 1 >= i_67_; i_67_++) {
										for (int i_68_ = i_51_ - 1; i_68_ <= i_51_ + 1; i_68_++) {
											if ((i_50_ != i_67_ || i_51_ != i_68_) && i_67_ >= 0 && i_67_ < 104
													&& i_68_ >= 0 && i_68_ < 104) {
												int i_69_ = ((Class14_Sub8_Sub6.overlays[i_14_][i_67_][i_68_]) & 0xff);
												if (i_69_ != 0) {
													Class150 class150 = (Class97.method1489(i_69_ - 1, -9810));
													if ((class150.anInt2414 != -1) && ((Class3.anInterface3_117
															.method12(true, (class150.anInt2414))) == 4)) {
														Static.anIntArrayArray2799[i_50_][i_51_] = ((class150.anInt2426)
																+ ((class150.anInt2413) << 56));
														break while_313_;
													}
												}
											}
										}
									}
								}
							} else {
								int i_70_ = ((Static.overlayTypes[i_14_][i_50_][i_51_]) + 1);
								byte i_71_ = (Class15.overlayOrientations[i_14_][i_50_][i_51_]);
								Class150 class150 = Class97.method1489(i_53_ - 1, -9810);
								if (!bool && (Static.anIntArrayArray2799 != null) && i_14_ == 0) {
									if (class150.anInt2414 == -1
											|| (Class3.anInterface3_117.method12(true, class150.anInt2414)) != 4) {
										while_312_: for (int i_72_ = i_50_ - 1; i_72_ <= i_50_ + 1; i_72_++) {
											for (int i_73_ = i_51_ - 1; i_51_ + 1 >= i_73_; i_73_++) {
												if ((i_72_ != i_50_ || i_73_ != i_51_) && i_72_ >= 0 && i_72_ < 104
														&& i_73_ >= 0 && i_73_ < 104) {
													int i_74_ = ((Class14_Sub8_Sub6.overlays[i_14_][i_72_][i_73_])
															& 0xff);
													if (i_74_ != 0) {
														Class150 class150_75_ = (Class97.method1489(i_74_ - 1, -9810));
														if ((class150_75_.anInt2414) != -1 && ((Class3.anInterface3_117
																.method12(true, (class150_75_.anInt2414))) == 4)) {
															Static.anIntArrayArray2799[i_50_][i_51_] = (((class150_75_.anInt2413) << 56)
																	+ (class150_75_.anInt2426));
															break while_312_;
														}
													}
												}
											}
										}
									} else
										Static.anIntArrayArray2799[i_50_][i_51_] = (class150.anInt2426
												+ (class150.anInt2413 << 24));
								}
								int i_76_ = class150.anInt2414;
								if (i_76_ >= 0 && !Class3.anInterface3_117.method13(0, i_76_))
									i_76_ = -1;
								int i_77_;
								int i_78_;
								if (i_76_ < 0) {
									if (class150.anInt2411 != -1) {
										i_77_ = class150.anInt2411;
										int i_79_ = (i_77_ & 0x7f) + i;
										if (i_79_ < 0)
											i_79_ = 0;
										else if (i_79_ > 127)
											i_79_ = 127;
										int i_80_ = ((i_13_ + i_77_ & 0xfc00) + ((i_77_ & 0x380) + i_79_));
										i_78_ = (Class3.anIntArray119[(Class7_Sub3_Sub1.method135(false, 96, i_80_))]);
									} else {
										i_77_ = -2;
										i_78_ = 0;
									}
								} else {
									i_77_ = -1;
									i_78_ = (Class3.anIntArray119[(Class7_Sub3_Sub1.method135(false, 96,
											(Class3.anInterface3_117.method5(i_76_, (byte) -116))))]);
								}
								if (class150.anInt2405 >= 0) {
									int i_81_ = class150.anInt2405;
									int i_82_ = i + (i_81_ & 0x7f);
									if (i_82_ >= 0) {
										if (i_82_ > 127)
											i_82_ = 127;
									} else
										i_82_ = 0;
									int i_83_ = (i_82_ + (i_81_ & 0x380) + (i_13_ + i_81_ & 0xfc00));
									i_78_ = (Class3.anIntArray119[Class7_Sub3_Sub1.method135(false, 96, i_83_)]);
								}
								Class22.method987(i_14_, i_50_, i_51_, i_70_, i_71_, i_76_, i_54_, i_56_, i_55_, i_57_,
										Class14_Sub2_Sub21.method441(i_63_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_64_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_65_, 127, i_60_),
										Class14_Sub2_Sub21.method441(i_66_, 127, i_60_),
										Class7_Sub3_Sub1.method135(false, i_63_, i_77_),
										Class7_Sub3_Sub1.method135(false, i_64_, i_77_),
										Class7_Sub3_Sub1.method135(false, i_65_, i_77_),
										Class7_Sub3_Sub1.method135(false, i_66_, i_77_), i_59_, i_78_);
								if (i_14_ > 0)
									Class151.method2042(i_70_, i_71_, i_77_ == -2 || !class150.aBoolean2407,
											(i_60_ == -1
													|| !(Static2.method335(-92, i_52_ - 1).aBoolean1020)),
											i_50_, i_51_, i_54_ - (Class114.tileHeights[0][i_50_][i_51_]),
											i_56_ - (Class114.tileHeights[0][i_50_ + 1][i_51_]),
											i_55_ - (Class114.tileHeights[0][i_50_ + 1][i_51_ + 1]),
											i_57_ - (Class114.tileHeights[0][i_50_][i_51_ + 1]));
							}
						}
					}
				}
			}
			float[][] fs = new float[105][105];
			float[][] fs_84_ = new float[105][105];
			int[][] is_85_ = Class114.tileHeights[i_14_];
			float[][] fs_86_ = new float[105][105];
			for (int i_87_ = 1; i_87_ <= 103; i_87_++) {
				for (int i_88_ = 1; i_88_ <= 103; i_88_++) {
					int i_89_ = -is_85_[i_88_ - 1][i_87_] + is_85_[i_88_ + 1][i_87_];
					int i_90_ = is_85_[i_88_][i_87_ + 1] - is_85_[i_88_][i_87_ - 1];
					float f = (float) Math.sqrt((double) (i_90_ * i_90_ + 65536 + i_89_ * i_89_));
					fs[i_88_][i_87_] = (float) i_89_ / f;
					fs_84_[i_88_][i_87_] = -256.0F / f;
					fs_86_[i_88_][i_87_] = (float) i_90_ / f;
				}
			}
			if (bool) {
				Class14_Sub27[] class14_sub27s = Class47.method1189(fs_84_, is_12_,
						Class149.anIntArrayArrayArray2391[0], fs, (byte) -125, Class14_Sub8_Sub4.tileFlags, i_14_, is,
						Class15.overlayOrientations[i_14_], Class97.underlays[i_14_], Class14_Sub8_Sub6.overlays[i_14_],
						Static.anIntArrayArray2799, Static.overlayTypes[i_14_], fs_86_,
						Class114.tileHeights[i_14_]);
				Class14_Sub21.method895(i_14_, class14_sub27s);
			} else {
				Class14_Sub27[] class14_sub27s = Class47.method1189(fs_84_, is_12_, null, fs, (byte) -109,
						Class14_Sub8_Sub4.tileFlags, i_14_, is, Class15.overlayOrientations[i_14_],
						Class97.underlays[i_14_], Class14_Sub8_Sub6.overlays[i_14_], null, Static.overlayTypes[i_14_],
						fs_86_, Class114.tileHeights[i_14_]);
				Class14_Sub27[] class14_sub27s_91_ = Static.method1398(Class114.tileHeights[i_14_],
						Class15.overlayOrientations[i_14_], 4, Class14_Sub8_Sub6.overlays[i_14_],
						Static.overlayTypes[i_14_], i_14_, fs, fs_84_, is_12_, Class14_Sub8_Sub4.tileFlags, fs_86_,
						Class97.underlays[i_14_]);
				Class14_Sub27[] class14_sub27s_92_ = (new Class14_Sub27[class14_sub27s.length
						+ class14_sub27s_91_.length]);
				for (int i_93_ = 0; i_93_ < class14_sub27s.length; i_93_++)
					class14_sub27s_92_[i_93_] = class14_sub27s[i_93_];
				for (int i_94_ = 0; class14_sub27s_91_.length > i_94_; i_94_++)
					class14_sub27s_92_[class14_sub27s.length + i_94_] = class14_sub27s_91_[i_94_];
				Class14_Sub21.method895(i_14_, class14_sub27s_92_);
				Class32.method1064(Class15.overlayOrientations[i_14_], Static.overlayTypes[i_14_], fs_84_,
						Class97.underlays[i_14_], fs_86_, Class10.lights, -46, i_14_,
						Class114.tileHeights[i_14_], Class14_Sub8_Sub6.overlays[i_14_], Class10.lightCount, fs);
			}
			Class97.underlays[i_14_] = null;
			Class14_Sub8_Sub6.overlays[i_14_] = null;
			Static.overlayTypes[i_14_] = null;
			Class15.overlayOrientations[i_14_] = null;
			Static2.aByteArrayArrayArray3354[i_14_] = null;
		}
		Class1.method70(-50, -10, -50);
		if (!bool) {
			for (int i_95_ = 0; i_95_ < 104; i_95_++) {
				for (int i_96_ = 0; i_96_ < 104; i_96_++) {
					if ((Class14_Sub8_Sub4.tileFlags[1][i_95_][i_96_] & 0x2) == 2)
						Class109.method1569(i_95_, i_96_);
				}
			}
			for (int i_97_ = 0; i_97_ < 4; i_97_++) {
				for (int i_98_ = 0; i_98_ <= 104; i_98_++) {
					for (int i_99_ = 0; i_99_ <= 104; i_99_++) {
						if (((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_98_]) & 0x1) != 0) {
							int i_100_;
							for (i_100_ = i_98_; (i_100_ > 0
									&& ((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_100_ - 1])
											& 0x1) != 0); i_100_--) {
								/* empty */
							}
							int i_101_;
							for (i_101_ = i_98_; (i_101_ < 104
									&& ((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_101_ + 1])
											& 0x1) != 0); i_101_++) {
								/* empty */
							}
							int i_102_;
							while_314_: for (i_102_ = i_97_; i_102_ > 0; i_102_--) {
								for (int i_103_ = i_100_; i_101_ >= i_103_; i_103_++) {
									if (((Class66.anIntArrayArrayArray135[i_102_ - 1][i_99_][i_103_]) & 0x1) == 0)
										break while_314_;
								}
							}
							int i_104_;
							while_315_: for (i_104_ = i_97_; i_104_ < 3; i_104_++) {
								for (int i_105_ = i_100_; i_105_ <= i_101_; i_105_++) {
									if (((Class66.anIntArrayArrayArray135[i_104_ + 1][i_99_][i_105_]) & 0x1) == 0)
										break while_315_;
								}
							}
							int i_106_ = ((-i_102_ + i_104_ + 1) * (i_101_ - i_100_ + 1));
							if (i_106_ >= 8) {
								int i_107_ = 240;
								int i_108_ = ((Class114.tileHeights[i_104_][i_99_][i_100_]) - i_107_);
								int i_109_ = (Class114.tileHeights[i_102_][i_99_][i_100_]);
								Scenegraph.method120(1, i_99_ * 128, i_99_ * 128, i_100_ * 128, i_101_ * 128 + 128,
										i_108_, i_109_);
								for (int i_110_ = i_102_; i_104_ >= i_110_; i_110_++) {
									for (int i_111_ = i_100_; i_111_ <= i_101_; i_111_++)
										Class66.anIntArrayArrayArray135[i_110_][i_99_][i_111_] = (Class14_Sub8_Sub26
												.method617((Class66.anIntArrayArrayArray135[i_110_][i_99_][i_111_]),
														-2));
								}
							}
						}
						if (((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_98_]) & 0x2) != 0) {
							int i_112_;
							for (i_112_ = i_99_; (i_112_ > 0
									&& ((Class66.anIntArrayArrayArray135[i_97_][i_112_ - 1][i_98_])
											& 0x2) != 0); i_112_--) {
								/* empty */
							}
							int i_113_;
							for (i_113_ = i_99_; (i_113_ < 104
									&& ((Class66.anIntArrayArrayArray135[i_97_][i_113_ + 1][i_98_])
											& 0x2) != 0); i_113_++) {
								/* empty */
							}
							int i_114_ = i_97_;
							int i_115_ = i_97_;
							while_316_: for (/**/; i_114_ > 0; i_114_--) {
								for (int i_116_ = i_112_; i_113_ >= i_116_; i_116_++) {
									if (((Class66.anIntArrayArrayArray135[i_114_ - 1][i_116_][i_98_]) & 0x2) == 0)
										break while_316_;
								}
							}
							while_317_: for (/**/; i_115_ < 3; i_115_++) {
								for (int i_117_ = i_112_; i_117_ <= i_113_; i_117_++) {
									if (((Class66.anIntArrayArrayArray135[i_115_ + 1][i_117_][i_98_]) & 0x2) == 0)
										break while_317_;
								}
							}
							int i_118_ = ((i_113_ + 1 - i_112_) * (i_115_ + 1 - i_114_));
							if (i_118_ >= 8) {
								int i_119_ = 240;
								int i_120_ = (Class114.tileHeights[i_114_][i_112_][i_98_]);
								int i_121_ = -i_119_ + (Class114.tileHeights[i_115_][i_112_][i_98_]);
								Scenegraph.method120(2, i_112_ * 128, i_113_ * 128 + 128, i_98_ * 128, i_98_ * 128,
										i_121_, i_120_);
								for (int i_122_ = i_114_; i_122_ <= i_115_; i_122_++) {
									for (int i_123_ = i_112_; i_113_ >= i_123_; i_123_++)
										Class66.anIntArrayArrayArray135[i_122_][i_123_][i_98_] = (Class14_Sub8_Sub26
												.method617((Class66.anIntArrayArrayArray135[i_122_][i_123_][i_98_]),
														-3));
								}
							}
						}
						if (((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_98_]) & 0x4) != 0) {
							int i_124_ = i_99_;
							int i_125_ = i_98_;
							int i_126_ = i_98_;
							int i_127_ = i_99_;
							for (/**/; i_125_ < 104; i_125_++) {
								if (((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_125_ + 1]) & 0x4) == 0)
									break;
							}
							for (/**/; i_126_ > 0; i_126_--) {
								if (((Class66.anIntArrayArrayArray135[i_97_][i_99_][i_126_ - 1]) & 0x4) == 0)
									break;
							}
							while_318_: for (/**/; i_124_ > 0; i_124_--) {
								for (int i_128_ = i_126_; i_128_ <= i_125_; i_128_++) {
									if (((Class66.anIntArrayArrayArray135[i_97_][i_124_ - 1][i_128_]) & 0x4) == 0)
										break while_318_;
								}
							}
							while_319_: for (/**/; i_127_ < 104; i_127_++) {
								for (int i_129_ = i_126_; i_129_ <= i_125_; i_129_++) {
									if (((Class66.anIntArrayArrayArray135[i_97_][i_127_ + 1][i_129_]) & 0x4) == 0)
										break while_319_;
								}
							}
							if ((-i_124_ + (i_127_ + 1)) * (i_125_ + (-i_126_ + 1)) >= 4) {
								int i_130_ = (Class114.tileHeights[i_97_][i_124_][i_126_]);
								Scenegraph.method120(4, i_124_ * 128, i_127_ * 128 + 128, i_126_ * 128,
										i_125_ * 128 + 128, i_130_, i_130_);
								for (int i_131_ = i_124_; i_131_ <= i_127_; i_131_++) {
									for (int i_132_ = i_126_; i_132_ <= i_125_; i_132_++)
										Class66.anIntArrayArrayArray135[i_97_][i_131_][i_132_] = (Class14_Sub8_Sub26
												.method617((Class66.anIntArrayArrayArray135[i_97_][i_131_][i_132_]),
														-5));
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method333(byte i, byte i_14_) {
		if (Class28.aByteArrayArrayArray512 == null)
			Class28.aByteArrayArrayArray512 = new byte[4][104][104];
		for (int i_15_ = 0; i_15_ < 4; i_15_++) {
			for (int i_16_ = 0; i_16_ < 104; i_16_++) {
				for (int i_17_ = 0; i_17_ < 104; i_17_++)
					Class28.aByteArrayArrayArray512[i_15_][i_16_][i_17_] = i;
			}
		}
	}
}
