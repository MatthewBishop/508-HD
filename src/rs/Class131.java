/* Class131 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class14_Sub27;

public class Class131 {
	public static Class124 aClass124_2153;
	public static volatile boolean aBoolean2154;
	public static Class124 aClass124_2156 = (Class14_Sub2_Sub2.method263(1178,
			"Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3"));
	public static int anInt2159;
	public static Class14_Sub2_Sub16_Sub1 aClass14_Sub2_Sub16_Sub1_2160;
	public static Class124 aClass124_2161;
	public static Class14_Sub27[][] aClass14_Sub27ArrayArray2162;
	public static Class124 aClass124_2163;
	public static int anInt2164;

	static {
		aClass124_2153 = (Class14_Sub2_Sub2.method263(1178, " steht bereits auf Ihrer Freunde)2Liste(Q"));
		aBoolean2154 = true;
		aClass124_2163 = (Class14_Sub2_Sub2.method263(1178,
				"Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q"));
		aClass124_2161 = Class14_Sub2_Sub2.method263(1178, "loc");
	}

	public static void method1772(boolean bool, int i, byte i_0_, int i_1_) {
		int i_2_ = -121 / ((i_0_ + 68) / 43);
		if (i_1_ < 8000 || i_1_ > 48000)
			throw new IllegalArgumentException();
		Class115.anInt1909 = i_1_;
		Class14_Sub2_Sub2.aBoolean3763 = bool;
		Static2.anInt1674 = i;
	}

	public static int method1773(int i, byte i_3_) {
		int i_4_ = 30 / ((-73 - i_3_) / 49);
		int i_5_ = i >>> 8;
		return i_5_;
	}

	public static void method1774(int[] is, int i, int i_6_, int i_7_, int i_8_, boolean bool, int i_9_,
			boolean bool_10_, int i_11_, int i_12_, int i_13_) {
		int i_14_ = i_7_;
		if (i_14_ < Class92.anInt1434) {
			int i_15_ = i_9_ + i_7_;
			if (i_14_ < Class92.anInt1433)
				i_14_ = Class92.anInt1433;
			if (Class92.anInt1433 < i_15_) {
				int i_16_ = i_12_;
				if (Class92.anInt1434 < i_15_)
					i_15_ = Class92.anInt1434;
				if (i_16_ < Class92.anInt1436) {
					if (i_16_ < Class92.anInt1438)
						i_16_ = Class92.anInt1438;
					int i_17_ = i_13_ + i_12_;
					if (Class92.anInt1438 < i_17_) {
						if (i_8_ == 9) {
							i = i + 1 & 0x3;
							i_8_ = 1;
						}
						if (i_17_ > Class92.anInt1436)
							i_17_ = Class92.anInt1436;
						int i_18_ = i_16_ * Class92.anInt1432 + i_14_;
						i_17_ -= i_12_;
						if (bool_10_)
							aClass124_2163 = null;
						int i_19_ = -i_15_ + Class92.anInt1432 + i_14_;
						if (i_8_ == 10) {
							i = i + 3 & 0x3;
							i_8_ = 1;
						}
						i_14_ -= i_7_;
						if (i_8_ == 11) {
							i = i + 3 & 0x3;
							i_8_ = 8;
						}
						i_15_ -= i_7_;
						int i_20_ = -i_14_ + i_9_;
						i_16_ -= i_12_;
						int i_21_ = i_9_ - i_15_;
						int i_22_ = i_13_ - i_17_;
						int i_23_ = i_13_ - i_16_;
						if (i_8_ == 1) {
							if (i == 0) {
								for (int i_24_ = i_16_; i_24_ < i_17_; i_24_++) {
									for (int i_25_ = i_14_; i_15_ > i_25_; i_25_++) {
										if (i_25_ <= i_24_)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 1) {
								for (int i_26_ = i_23_ - 1; i_26_ >= i_22_; i_26_--) {
									for (int i_27_ = i_14_; i_27_ < i_15_; i_27_++) {
										if (i_27_ <= i_26_)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 2) {
								for (int i_28_ = i_16_; i_28_ < i_17_; i_28_++) {
									for (int i_29_ = i_14_; i_29_ < i_15_; i_29_++) {
										if (i_28_ > i_29_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 3) {
								for (int i_30_ = i_23_ - 1; i_30_ >= i_22_; i_30_--) {
									for (int i_31_ = i_14_; i_31_ < i_15_; i_31_++) {
										if (i_31_ < i_30_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							}
						} else if (i_8_ == 2) {
							if (i == 0) {
								for (int i_32_ = i_23_ - 1; i_22_ <= i_32_; i_32_--) {
									for (int i_33_ = i_14_; i_15_ > i_33_; i_33_++) {
										if (i_32_ >> 1 >= i_33_)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 1) {
								for (int i_34_ = i_16_; i_34_ < i_17_; i_34_++) {
									for (int i_35_ = i_14_; i_35_ < i_15_; i_35_++) {
										if (i_18_ < 0 || i_18_ >= is.length)
											i_18_++;
										else {
											if (i_34_ << 1 > i_35_) {
												if (bool)
													is[i_18_] = i_6_;
											} else
												is[i_18_] = i_11_;
											i_18_++;
										}
									}
									i_18_ += i_19_;
								}
							} else if (i == 2) {
								for (int i_36_ = i_16_; i_36_ < i_17_; i_36_++) {
									for (int i_37_ = i_20_ - 1; i_21_ <= i_37_; i_37_--) {
										if (i_37_ > i_36_ >> 1) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 3) {
								for (int i_38_ = i_23_ - 1; i_22_ <= i_38_; i_38_--) {
									for (int i_39_ = i_20_ - 1; i_39_ >= i_21_; i_39_--) {
										if (i_39_ >= i_38_ << 1)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							}
						} else if (i_8_ == 3) {
							if (i == 0) {
								for (int i_40_ = i_23_ - 1; i_22_ <= i_40_; i_40_--) {
									for (int i_41_ = i_20_ - 1; i_41_ >= i_21_; i_41_--) {
										if (i_40_ >> 33 >= i_41_)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 1) {
								for (int i_42_ = i_23_ - 1; i_22_ <= i_42_; i_42_--) {
									for (int i_43_ = i_14_; i_43_ < i_15_; i_43_++) {
										if (i_43_ >= i_42_ << 33)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 2) {
								for (int i_44_ = i_16_; i_44_ < i_17_; i_44_++) {
									for (int i_45_ = i_14_; i_15_ > i_45_; i_45_++) {
										if (i_44_ >> 33 < i_45_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 3) {
								for (int i_46_ = i_16_; i_46_ < i_17_; i_46_++) {
									for (int i_47_ = i_20_ - 1; i_21_ <= i_47_; i_47_--) {
										if (i_46_ << 1 > i_47_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							}
						} else if (i_8_ == 4) {
							if (i == 0) {
								for (int i_48_ = i_23_ - 1; i_22_ <= i_48_; i_48_--) {
									for (int i_49_ = i_14_; i_15_ > i_49_; i_49_++) {
										if (i_48_ >> 1 > i_49_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 1) {
								for (int i_50_ = i_16_; i_17_ > i_50_; i_50_++) {
									for (int i_51_ = i_14_; i_51_ < i_15_; i_51_++) {
										if (i_50_ << 1 < i_51_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 2) {
								for (int i_52_ = i_16_; i_17_ > i_52_; i_52_++) {
									for (int i_53_ = i_20_ - 1; i_53_ >= i_21_; i_53_--) {
										if (i_53_ < i_52_ >> 1) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 3) {
								for (int i_54_ = i_23_ - 1; i_22_ <= i_54_; i_54_--) {
									for (int i_55_ = i_20_ - 1; i_55_ >= i_21_; i_55_--) {
										if (i_54_ << 1 >= i_55_)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							}
						} else if (i_8_ == 5) {
							if (i == 0) {
								for (int i_56_ = i_23_ - 1; i_22_ <= i_56_; i_56_--) {
									for (int i_57_ = i_20_ - 1; i_21_ <= i_57_; i_57_--) {
										if (i_57_ >= i_56_ >> 1)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 1) {
								for (int i_58_ = i_23_ - 1; i_22_ <= i_58_; i_58_--) {
									for (int i_59_ = i_14_; i_59_ < i_15_; i_59_++) {
										if (i_59_ > i_58_ << 1) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 2) {
								for (int i_60_ = i_16_; i_17_ > i_60_; i_60_++) {
									for (int i_61_ = i_14_; i_61_ < i_15_; i_61_++) {
										if (i_61_ >= i_60_ >> 33)
											is[i_18_] = i_11_;
										else if (bool)
											is[i_18_] = i_6_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							} else if (i == 3) {
								for (int i_62_ = i_16_; i_17_ > i_62_; i_62_++) {
									for (int i_63_ = i_20_ - 1; i_63_ >= i_21_; i_63_--) {
										if (i_62_ << 1 < i_63_) {
											if (bool)
												is[i_18_] = i_6_;
										} else
											is[i_18_] = i_11_;
										i_18_++;
									}
									i_18_ += i_19_;
								}
							}
						} else {
							if (i_8_ == 6) {
								if (i == 0) {
									for (int i_64_ = i_16_; i_17_ > i_64_; i_64_++) {
										for (int i_65_ = i_14_; i_65_ < i_15_; i_65_++) {
											if (i_65_ > i_9_ / 2) {
												if (bool)
													is[i_18_] = i_6_;
											} else
												is[i_18_] = i_11_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 1) {
									for (int i_66_ = i_16_; i_17_ > i_66_; i_66_++) {
										for (int i_67_ = i_14_; i_67_ < i_15_; i_67_++) {
											if (i_66_ <= i_13_ / 2)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 2) {
									for (int i_68_ = i_16_; i_17_ > i_68_; i_68_++) {
										for (int i_69_ = i_14_; i_15_ > i_69_; i_69_++) {
											if (i_9_ / 2 <= i_69_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 3) {
									for (int i_70_ = i_16_; i_70_ < i_17_; i_70_++) {
										for (int i_71_ = i_14_; i_71_ < i_15_; i_71_++) {
											if (i_13_ / 2 <= i_70_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
							}
							if (i_8_ == 7) {
								if (i == 0) {
									for (int i_72_ = i_16_; i_72_ < i_17_; i_72_++) {
										for (int i_73_ = i_14_; i_73_ < i_15_; i_73_++) {
											if (i_72_ - i_13_ / 2 >= i_73_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 1) {
									for (int i_74_ = i_23_ - 1; i_22_ <= i_74_; i_74_--) {
										for (int i_75_ = i_14_; i_75_ < i_15_; i_75_++) {
											if (i_75_ <= i_74_ - i_13_ / 2)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 2) {
									for (int i_76_ = i_23_ - 1; i_22_ <= i_76_; i_76_--) {
										for (int i_77_ = i_20_ - 1; i_21_ <= i_77_; i_77_--) {
											if (i_77_ > -(i_13_ / 2) + i_76_) {
												if (bool)
													is[i_18_] = i_6_;
											} else
												is[i_18_] = i_11_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
								if (i == 3) {
									for (int i_78_ = i_16_; i_78_ < i_17_; i_78_++) {
										for (int i_79_ = i_20_ - 1; i_21_ <= i_79_; i_79_--) {
											if (-(i_13_ / 2) + i_78_ < i_79_) {
												if (bool)
													is[i_18_] = i_6_;
											} else
												is[i_18_] = i_11_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
									return;
								}
							}
							if (i_8_ == 8) {
								if (i == 0) {
									for (int i_80_ = i_16_; i_17_ > i_80_; i_80_++) {
										for (int i_81_ = i_14_; i_15_ > i_81_; i_81_++) {
											if (i_81_ < -(i_13_ / 2) + i_80_) {
												if (bool)
													is[i_18_] = i_6_;
											} else
												is[i_18_] = i_11_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
								} else if (i == 1) {
									for (int i_82_ = i_23_ - 1; i_82_ >= i_22_; i_82_--) {
										for (int i_83_ = i_14_; i_83_ < i_15_; i_83_++) {
											if (i_82_ - i_13_ / 2 <= i_83_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
								} else if (i == 2) {
									for (int i_84_ = i_23_ - 1; i_22_ <= i_84_; i_84_--) {
										for (int i_85_ = i_20_ - 1; i_21_ <= i_85_; i_85_--) {
											if (-(i_13_ / 2) + i_84_ <= i_85_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
								} else if (i == 3) {
									for (int i_86_ = i_16_; i_17_ > i_86_; i_86_++) {
										for (int i_87_ = i_20_ - 1; i_21_ <= i_87_; i_87_--) {
											if (i_86_ - i_13_ / 2 <= i_87_)
												is[i_18_] = i_11_;
											else if (bool)
												is[i_18_] = i_6_;
											i_18_++;
										}
										i_18_ += i_19_;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method1775(int i) {
		aClass14_Sub27ArrayArray2162 = null;
		aClass124_2163 = null;
		aClass124_2153 = null;
		aClass124_2161 = null;
		aClass124_2156 = null;
		aClass14_Sub2_Sub16_Sub1_2160 = null;
		if (i >= -38)
			method1775(127);
	}
}
