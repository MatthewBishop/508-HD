/* Class47 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.rt4.Class14_Sub27;

import rs.tex.Class14_Sub8_Sub1;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class47 {
	public static Class94 aClass94_784;
	public static Class124 aClass124_787;
	public static boolean aBoolean788 = true;
	public static Class9_Sub1 aClass9_Sub1_790;
	public static Class124 aClass124_793;
	public static int anInt796;

	static {
		aClass124_787 = Class14_Sub2_Sub2.method263(1178, "Sprites geladen)3");
		aClass124_793 = Class14_Sub2_Sub2.method263(1178, " <col=ffffff>");
		anInt796 = -1;
	}

	public static Class4 method1180(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null || class14_sub29.aClass4_3237 == null)
			return null;
		return class14_sub29.aClass4_3237;
	}

	public static void method1181(int i, int i_2_, int i_3_, byte i_4_) {
		if (Class14_Sub29.anInt3266 != 0 && i != 0 && Static.anInt96 < 50 && i_2_ != -1) {
			Class153.anIntArray2454[Static.anInt96] = i_2_;
			Static2.anIntArray4052[Static.anInt96] = i;
			Static2.anIntArray3949[Static.anInt96] = i_3_;
			Class137.aClass91Array2197[Static.anInt96] = null;
			Class116.anIntArray1928[Static.anInt96] = 0;
			Static.anInt96++;
		}
	}

	public static int method1182(int i, int i_5_) {
		if (Class125_Sub2.language == 1) {
			int i_6_ = 7;
			return i_6_;
		}
		if (Class125_Sub2.language == 2) {
			int i_7_ = 20;
			return i_7_;
		}
		int i_8_ = i;
		while_338_: do {
			while_337_: do {
				while_336_: do {
					while_335_: do {
						while_334_: do {
							while_333_: do {
								while_332_: do {
									while_331_: do {
										while_330_: do {
											while_329_: do {
												while_328_: do {
													while_327_: do {
														while_326_: do {
															while_325_: do {
																while_324_: do {
																	while_323_: do {
																		while_322_: do {
																			do {
																				if (i_8_ != 15) {
																					if (i_8_ != 16) {
																						if (i_8_ != 22) {
																							if (i_8_ != 31) {
																								if (i_8_ != 38) {
																									if (i_8_ != 43) {
																										if (i_8_ != 48) {
																											if (i_8_ != 58) {
																												if (i_8_ != 69) {
																													if (i_8_ != 74) {
																														if (i_8_ != 77) {
																															if (i_8_ != 101) {
																																if (i_8_ != 103) {
																																	if (i_8_ != 152) {
																																		if (i_8_ != 161) {
																																			if (i_8_ != 162) {
																																				if (i_8_ != 166) {
																																					if (i_8_ != 179) {
																																						if (i_8_ == 191)
																																							break while_337_;
																																						break while_338_;
																																					}
																																				} else
																																					break while_335_;
																																				break while_336_;
																																			}
																																		} else
																																			break while_333_;
																																		break while_334_;
																																	}
																																} else
																																	break while_331_;
																																break while_332_;
																															}
																														} else
																															break while_329_;
																														break while_330_;
																													}
																												} else
																													break while_327_;
																												break while_328_;
																											}
																										} else
																											break while_325_;
																										break while_326_;
																									}
																								} else
																									break while_323_;
																								break while_324_;
																							}
																						} else
																							break;
																						break while_322_;
																					}
																				} else {
																					int i_9_ = 13;
																					return i_9_;
																				}
																				int i_10_ = 3;
																				return i_10_;
																			} while (false);
																			int i_11_ = 8;
																			return i_11_;
																		} while (false);
																		int i_12_ = 14;
																		return i_12_;
																	} while (false);
																	int i_13_ = 2;
																	return i_13_;
																} while (false);
																int i_14_ = 15;
																return i_14_;
															} while (false);
															int i_15_ = 17;
															return i_15_;
														} while (false);
														int i_16_ = 11;
														return i_16_;
													} while (false);
													int i_17_ = 6;
													return i_17_;
												} while (false);
												int i_18_ = 20;
												return i_18_;
											} while (false);
											int i_19_ = 1;
											return i_19_;
										} while (false);
										int i_20_ = 12;
										return i_20_;
									} while (false);
									int i_21_ = 19;
									return i_21_;
								} while (false);
								int i_22_ = 16;
								return i_22_;
							} while (false);
							int i_23_ = 4;
							return i_23_;
						} while (false);
						int i_24_ = 9;
						return i_24_;
					} while (false);
					int i_25_ = 10;
					return i_25_;
				} while (false);
				int i_26_ = 18;
				return i_26_;
			} while (false);
			int i_27_ = 5;
			return i_27_;
		} while (false);
		if (i_5_ != -1)
			aClass9_Sub1_790 = null;
		int i_28_ = 0;
		return i_28_;
	}

	public static void method1183(byte i, Class133_Sub1 class133_sub1) {
		if (class133_sub1.anInt3492 != 0) {
			if (class133_sub1.anInt3453 != -1 && class133_sub1.anInt3453 < 32768) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[class133_sub1.anInt3453]);
				if (class133_sub1_sub2 != null) {
					int i_29_ = (class133_sub1.anInt3495 - class133_sub1_sub2.anInt3495);
					int i_30_ = (-class133_sub1_sub2.anInt3436 + class133_sub1.anInt3436);
					if (i_29_ != 0 || i_30_ != 0)
						class133_sub1.anInt3469 = (int) (Math.atan2((double) i_29_, (double) i_30_) * 325.949) & 0x7ff;
				}
			}
			if (class133_sub1.anInt3453 >= 32768) {
				int i_31_ = class133_sub1.anInt3453 - 32768;
				if (Class14_Sub2_Sub10.anInt3868 == i_31_)
					i_31_ = 2047;
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_31_];
				if (class133_sub1_sub1 != null) {
					int i_32_ = (class133_sub1.anInt3495 - class133_sub1_sub1.anInt3495);
					int i_33_ = (-class133_sub1_sub1.anInt3436 + class133_sub1.anInt3436);
					if (i_32_ != 0 || i_33_ != 0)
						class133_sub1.anInt3469 = (int) (Math.atan2((double) i_32_, (double) i_33_) * 325.949) & 0x7ff;
				}
			}
			if ((class133_sub1.anInt3504 != 0 || class133_sub1.anInt3480 != 0)
					&& (class133_sub1.anInt3498 == 0 || class133_sub1.anInt3437 > 0)) {
				int i_34_ = (class133_sub1.anInt3495 - 64 - (-(class133_sub1.anInt3493 * 64)
						+ (-Class133_Sub6.anInt3676 - Class133_Sub6.anInt3676 + class133_sub1.anInt3504) * 64));
				int i_35_ = (-((-Class58.anInt947 + (class133_sub1.anInt3480 - Class58.anInt947)) * 64)
						+ class133_sub1.anInt3436 - 64 + class133_sub1.anInt3493 * 64);
				if (i_34_ != 0 || i_35_ != 0)
					class133_sub1.anInt3469 = (int) (Math.atan2((double) i_34_, (double) i_35_) * 325.949) & 0x7ff;
				class133_sub1.anInt3480 = 0;
				class133_sub1.anInt3504 = 0;
			}
			int i_36_ = class133_sub1.anInt3469 - class133_sub1.anInt3461 & 0x7ff;
			if (i > 115) {
				if (i_36_ != 0) {
					class133_sub1.anInt3479++;
					if (i_36_ > 1024) {
						class133_sub1.anInt3461 -= class133_sub1.anInt3492;
						boolean bool = true;
						if (class133_sub1.anInt3492 > i_36_ || -class133_sub1.anInt3492 + 2048 < i_36_) {
							class133_sub1.anInt3461 = class133_sub1.anInt3469;
							bool = false;
						}
						if (class133_sub1.anInt3433 == class133_sub1.anInt3452
								&& (class133_sub1.anInt3479 > 25 || bool)) {
							if (class133_sub1.anInt3471 != -1)
								class133_sub1.anInt3452 = class133_sub1.anInt3471;
							else
								class133_sub1.anInt3452 = class133_sub1.anInt3457;
						}
					} else {
						class133_sub1.anInt3461 += class133_sub1.anInt3492;
						boolean bool = true;
						if (class133_sub1.anInt3492 > i_36_ || -class133_sub1.anInt3492 + 2048 < i_36_) {
							bool = false;
							class133_sub1.anInt3461 = class133_sub1.anInt3469;
						}
						if (class133_sub1.anInt3433 == class133_sub1.anInt3452
								&& (class133_sub1.anInt3479 > 25 || bool)) {
							if (class133_sub1.anInt3454 != -1)
								class133_sub1.anInt3452 = class133_sub1.anInt3454;
							else
								class133_sub1.anInt3452 = class133_sub1.anInt3457;
						}
					}
					class133_sub1.anInt3461 &= 0x7ff;
				} else
					class133_sub1.anInt3479 = 0;
			}
		}
	}

	public static void method1184() {
		Class40.aClass14_Sub29ArrayArrayArray674 = null;
		Static.anIntArrayArray2799 = null;
		Class150.anIntArrayArrayArray2419 = null;
		Class131.aClass14_Sub27ArrayArray2162 = null;
	}

	public static int method1185(Class9 class9, boolean bool, Class9 class9_37_) {
		int i = 0;
		if (class9_37_.method171(29499, Class14_Sub2_Sub21.anInt4088))
			i++;
		if (class9_37_.method171(29499, Class14_Sub8_Sub17.anInt4367))
			i++;
		if (class9_37_.method171(29499, Class14_Sub8_Sub1.anInt4102))
			i++;
		if (!bool)
			anInt796 = -113;
		if (class9.method171(29499, Class14_Sub2_Sub21.anInt4088))
			i++;
		if (class9.method171(29499, Class14_Sub8_Sub17.anInt4367))
			i++;
		if (class9.method171(29499, Class14_Sub8_Sub1.anInt4102))
			i++;
		int i_38_ = i;
		return i_38_;
	}

	public static void method1186(int i) {
		aClass124_787 = null;
		aClass124_793 = null;
		aClass9_Sub1_790 = null;
		if (i == -192)
			aClass94_784 = null;
	}

	public static Class51 method1187(int i, boolean bool) {
		if (!bool) {
			Class51 class51 = null;
			return class51;
		}
		Class51 class51 = (Class51) Class14_Sub8_Sub9.aClass52_4240.method1210((byte) 71, (long) i);
		if (class51 != null) {
			Class51 class51_39_ = class51;
			return class51_39_;
		}
		byte[] is = Class7_Sub1.aClass9_2652.method163(Class14_Sub15.method873(1023, i), Canvas_Sub2.method68(i, -1),
				0);
		Class51 class51_40_ = new Class51();
		if (is != null)
			class51_40_.method1198(new Buffer(is), 36);
		Class14_Sub8_Sub9.aClass52_4240.method1205(class51_40_, (long) i);
		Class51 class51_41_ = class51_40_;
		return class51_41_;
	}

	public static void method1188(int i, int i_42_) {
		if (i_42_ == Class14_Sub2_Sub11.anInt3889)
			Class133_Sub5.aClass14_Sub9_Sub1_3625.method710(i_42_ - 28225, i);
		else
			Static.anInt1132 = i;
	}

	public static Class14_Sub27[] method1189(float[][] fs, int[][] is, int[][] is_43_, float[][] fs_44_, byte i,
			byte[][][] is_45_, int i_46_, int[][] is_47_, byte[][] is_48_, byte[][] is_49_, byte[][] is_50_,
			int[][] is_51_, byte[][] is_52_, float[][] fs_53_, int[][] is_54_) {
		int[][] is_55_ = new int[105][105];
		for (int i_56_ = 1; i_56_ <= 103; i_56_++) {
			for (int i_57_ = 1; i_57_ <= 103; i_57_++) {
				int i_58_ = is_49_[i_56_][i_57_];
				if (i_58_ == 0)
					i_58_ = is_49_[i_56_ - 1][i_57_];
				if (i_58_ == 0)
					i_58_ = is_49_[i_56_][i_57_ - 1];
				if (i_58_ == 0)
					i_58_ = is_49_[i_56_ - 1][i_57_ - 1];
				if (i_58_ != 0) {
					Class65 class65 = Static2.method335(-65, (i_58_ & 0xff) - 1);
					is_55_[i_56_][i_57_] = (class65.anInt1030 + 1 << 16) + class65.anInt1019;
				}
			}
		}
		HashTable hashTable = new HashTable(128);
		for (int i_59_ = 1; i_59_ <= 102; i_59_++) {
			for (int i_60_ = 1; i_60_ <= 102; i_60_++) {
				if (is_49_[i_59_][i_60_] != 0) {
					int[] is_61_;
					if (is_50_[i_59_][i_60_] != 0) {
						is_61_ = Class21.anIntArrayArray452[is_52_[i_59_][i_60_]];
						if (is_61_.length == 0)
							continue;
					} else
						is_61_ = Static.anIntArrayArray2545[0];
					int i_62_ = is_55_[i_59_][i_60_];
					int i_63_ = is_55_[i_59_ + 1][i_60_];
					int i_64_ = 0;
					if (is_51_ != null)
						i_64_ = is_51_[i_59_][i_60_] & 0xffffff;
					int i_65_ = is_55_[i_59_ + 1][i_60_ + 1];
					long l = (long) i_63_ << 32 | (long) i_64_;
					long l_66_ = (long) i_62_ << 32 | (long) i_64_;
					long l_67_ = (long) i_64_ | (long) i_65_ << 32;
					int i_68_ = is_55_[i_59_][i_60_ + 1];
					long l_69_ = (long) i_64_ | (long) i_68_ << 32;
					int i_70_ = is_61_.length / 2;
					Class14_Sub27 class14_sub27 = ((Class14_Sub27) hashTable.get(l_66_));
					if (class14_sub27 == null) {
						class14_sub27 = new Class14_Sub27((i_62_ >> 16) - 1, (float) (i_62_ & 0xffff), false,
								is_43_ != null, i_64_);
						hashTable.put(l_66_, class14_sub27);
					}
					class14_sub27.anInt3180++;
					class14_sub27.anInt3181 += i_70_;
					if (l_66_ != l) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l);
						if (class14_sub27 == null) {
							class14_sub27 = new Class14_Sub27((i_63_ >> 48) - 1, (float) (i_63_ & 0xffff), false,
									is_43_ != null, i_64_);
							hashTable.put(l, class14_sub27);
						}
						class14_sub27.anInt3180++;
						class14_sub27.anInt3181 += i_70_;
					}
					if (l_67_ != l_66_ && l_67_ != l) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l_67_);
						if (class14_sub27 == null) {
							class14_sub27 = new Class14_Sub27((i_65_ >> 48) - 1, (float) (i_65_ & 0xffff), false,
									is_43_ != null, i_64_);
							hashTable.put(l_67_, class14_sub27);
						}
						class14_sub27.anInt3180++;
						class14_sub27.anInt3181 += i_70_;
					}
					if (l_69_ != l_66_ && l != l_69_ && l_69_ != l_67_) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l_69_);
						if (class14_sub27 == null) {
							class14_sub27 = new Class14_Sub27((i_68_ >> 48) - 1, (float) (i_68_ & 0xffff), false,
									is_43_ != null, i_64_);
							hashTable.put(l_69_, class14_sub27);
						}
						class14_sub27.anInt3181 += i_70_;
						class14_sub27.anInt3180++;
					}
				}
			}
		}
		for (Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (Class14_Sub27) hashTable.getNext())
			class14_sub27.method924();
		if (i > -69)
			aClass94_784 = null;
		for (int i_71_ = 1; i_71_ <= 102; i_71_++) {
			for (int i_72_ = 1; i_72_ <= 102; i_72_++) {
				if (is_49_[i_71_][i_72_] != 0) {
					int i_73_;
					if ((is_45_[i_46_][i_71_][i_72_] & 0x8) == 0) {
						if ((is_45_[1][i_71_][i_72_] & 0x2) != 2 || i_46_ <= 0)
							i_73_ = i_46_;
						else
							i_73_ = i_46_ - 1;
					} else
						i_73_ = 0;
					int i_74_ = 0;
					int i_75_ = 128;
					if (is_51_ != null) {
						i_75_ = is_51_[i_71_][i_72_] >>> 56 << 35;
						i_74_ = is_51_[i_71_][i_72_] & 0xffffff;
					}
					boolean[] bools = null;
					int[] is_76_;
					byte i_77_;
					if (is_50_[i_71_][i_72_] != 0) {
						i_77_ = is_48_[i_71_][i_72_];
						is_76_ = Class21.anIntArrayArray452[is_52_[i_71_][i_72_]];
						bools = (Class14_Sub25.aBooleanArrayArray3170[is_52_[i_71_][i_72_]]);
						if (is_76_.length == 0)
							continue;
					} else {
						is_76_ = Static.anIntArrayArray2545[0];
						i_77_ = (byte) 0;
					}
					int i_78_ = is_55_[i_71_][i_72_];
					int i_79_ = is_55_[i_71_ + 1][i_72_];
					int i_80_ = is_55_[i_71_ + 1][i_72_ + 1];
					long l = (long) i_74_ | (long) i_78_ << 32;
					int i_81_ = is_55_[i_71_][i_72_ + 1];
					long l_82_ = (long) i_79_ << 32 | (long) i_74_;
					long l_83_ = (long) i_74_ | (long) i_80_ << 32;
					long l_84_ = (long) i_81_ << 32 | (long) i_74_;
					int i_85_ = is_47_[i_71_][i_72_];
					int i_86_ = is_47_[i_71_ + 1][i_72_];
					int i_87_ = is_47_[i_71_][i_72_ + 1];
					int i_88_ = is_47_[i_71_ + 1][i_72_ + 1];
					int i_89_ = is[i_71_][i_72_];
					int i_90_ = is[i_71_ + 1][i_72_];
					int i_91_ = is[i_71_ + 1][i_72_ + 1];
					int i_92_ = is[i_71_][i_72_ + 1];
					int i_93_ = (i_80_ >> 48) - 1;
					int i_94_ = (i_78_ >> 16) - 1;
					int i_95_ = (i_79_ >> 48) - 1;
					int i_96_ = (i_81_ >> 48) - 1;
					Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.get(l);
					Class14_Sub8_Sub35.method665(is_43_, fs, (byte) 116, i_72_,
							Class141.method1961(i_90_, (byte) 127, i_94_, i_86_), i_73_,
							Class141.method1961(i_91_, (byte) 108, i_94_, i_88_), fs_44_, i_78_ <= i_79_,
							Class141.method1961(i_92_, (byte) 123, i_94_, i_87_), bools, i_77_, class14_sub27, i_75_,
							Class141.method1961(i_89_, (byte) 110, i_94_, i_85_), i_71_, i_78_ <= i_78_, i_81_ >= i_78_,
							i_80_ >= i_78_, is_54_, is_76_, fs_53_);
					if (l_82_ != l) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l_82_);
						Class14_Sub8_Sub35.method665(is_43_, fs, (byte) 105, i_72_,
								Class141.method1961(i_90_, (byte) 120, i_95_, i_86_), i_73_,
								Class141.method1961(i_91_, (byte) 114, i_95_, i_88_), fs_44_, i_79_ >= i_79_,
								Class141.method1961(i_92_, (byte) 112, i_95_, i_87_), bools, i_77_, class14_sub27,
								i_75_, Class141.method1961(i_89_, (byte) 127, i_95_, i_85_), i_71_, i_78_ >= i_79_,
								i_79_ <= i_81_, i_79_ <= i_80_, is_54_, is_76_, fs_53_);
					}
					if (l != l_83_ && l_82_ != l_83_) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l_83_);
						Class14_Sub8_Sub35.method665(is_43_, fs, (byte) -44, i_72_,
								Class141.method1961(i_90_, (byte) 123, i_93_, i_86_), i_73_,
								Class141.method1961(i_91_, (byte) 113, i_93_, i_88_), fs_44_, i_79_ >= i_80_,
								Class141.method1961(i_92_, (byte) 110, i_93_, i_87_), bools, i_77_, class14_sub27,
								i_75_, Class141.method1961(i_89_, (byte) 113, i_93_, i_85_), i_71_, i_80_ <= i_78_,
								i_81_ >= i_80_, i_80_ <= i_80_, is_54_, is_76_, fs_53_);
					}
					if (l_84_ != l && l_84_ != l_82_ && l_84_ != l_83_) {
						class14_sub27 = (Class14_Sub27) hashTable.get(l_84_);
						Class14_Sub8_Sub35.method665(is_43_, fs, (byte) 104, i_72_,
								Class141.method1961(i_90_, (byte) 106, i_96_, i_86_), i_73_,
								Class141.method1961(i_91_, (byte) 106, i_96_, i_88_), fs_44_, i_79_ >= i_81_,
								Class141.method1961(i_92_, (byte) 118, i_96_, i_87_), bools, i_77_, class14_sub27,
								i_75_, Class141.method1961(i_89_, (byte) 121, i_96_, i_85_), i_71_, i_81_ <= i_78_,
								i_81_ >= i_81_, i_80_ >= i_81_, is_54_, is_76_, fs_53_);
					}
				}
			}
		}
		for (Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.getFirst(); class14_sub27 != null; class14_sub27 = (Class14_Sub27) hashTable.getNext()) {
			if (class14_sub27.anInt3202 == 0)
				class14_sub27.unlink();
			else
				class14_sub27.method925();
		}
		int i_97_ = hashTable.size();
		Class14_Sub27[] class14_sub27s = new Class14_Sub27[i_97_];
		hashTable.toArray(class14_sub27s);
		long[] ls = new long[i_97_];
		for (int i_98_ = 0; i_98_ < i_97_; i_98_++)
			ls[i_98_] = class14_sub27s[i_98_].key;
		Class99_Sub2.method1506(class14_sub27s, ls, true);
		Class14_Sub27[] class14_sub27s_99_ = class14_sub27s;
		return class14_sub27s_99_;
	}

	public static boolean method1190(int i, int i_100_, int i_101_, int i_102_, int i_103_, boolean bool, int i_104_,
			int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_) {
		int i_111_ = -61 / ((60 - i_104_) / 60);
		for (int i_112_ = 0; i_112_ < 104; i_112_++) {
			for (int i_113_ = 0; i_113_ < 104; i_113_++) {
				Class33.anIntArrayArray575[i_112_][i_113_] = 0;
				Class137.anIntArrayArray2203[i_112_][i_113_] = 99999999;
			}
		}
		Class33.anIntArrayArray575[i_102_][i_100_] = 99;
		Class137.anIntArrayArray2203[i_102_][i_100_] = 0;
		i_111_ = i_100_;
		int i_114_ = i_102_;
		int i_115_ = 0;
		Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_102_;
		Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_100_;
		int i_116_ = 0;
		boolean bool_117_ = false;
		int[][] is = (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].anIntArrayArray546);
		while_346_: while (i_116_ != i_115_) {
			i_114_ = Class14_Sub8_Sub36.anIntArray4691[i_116_];
			i_111_ = Class14_Sub2_Sub21.anIntArray4078[i_116_];
			i_116_ = i_116_ + 1 & 0xfff;
			if (i_110_ == i_114_ && i == i_111_) {
				bool_117_ = true;
				break;
			}
			if (i_107_ != 0) {
				if (i_107_ >= 5 && i_107_ != 10 || !(Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785]
						.method1076(i_105_, i_106_, i_107_ - 1, i, i_110_, i_114_, i_111_, 18288))) {
					if (i_107_ < 10 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].method1066(i_106_,
							i_107_ - 1, i_114_, i, i_111_, (byte) -10, i_105_, i_110_))) {
						bool_117_ = true;
						break;
					}
				} else {
					bool_117_ = true;
					break;
				}
			}
			if (i_108_ != 0 && i_109_ != 0 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785]
					.method1078(i_111_, i_109_, i_114_, i_103_, (byte) -63, i_110_, i, i_106_, i_108_))) {
				bool_117_ = true;
				break;
			}
			int i_118_ = Class137.anIntArrayArray2203[i_114_][i_111_] + 1;
			while_339_: do {
				if (i_114_ > 0 && Class33.anIntArrayArray575[i_114_ - 1][i_111_] == 0
						&& (is[i_114_ - 1][i_111_] & 0x12c010e) == 0
						&& ((is[i_114_ - 1][i_106_ + i_111_ - 1] & 0x12c0138) == 0)) {
					for (int i_119_ = 1; i_106_ - 1 > i_119_; i_119_++) {
						if ((is[i_114_ - 1][i_119_ + i_111_] & 0x12c013e) != 0)
							break while_339_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_] = 2;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_] = i_118_;
				}
			} while (false);
			while_340_: do {
				if (i_114_ < 102 && Class33.anIntArrayArray575[i_114_ + 1][i_111_] == 0
						&& (is[i_106_ + i_114_][i_111_] & 0x12c0183) == 0
						&& ((is[i_114_ + i_106_][i_106_ + i_111_ - 1] & 0x12c01e0) == 0)) {
					for (int i_120_ = 1; i_106_ - 1 > i_120_; i_120_++) {
						if ((is[i_114_ + i_106_][i_120_ + i_111_] & 0x12c01e3) != 0)
							break while_340_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ + 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ + 1][i_111_] = 8;
					Class137.anIntArrayArray2203[i_114_ + 1][i_111_] = i_118_;
				}
			} while (false);
			while_341_: do {
				if (i_111_ > 0 && Class33.anIntArrayArray575[i_114_][i_111_ - 1] == 0
						&& (is[i_114_][i_111_ - 1] & 0x12c010e) == 0
						&& ((is[i_114_ + i_106_ - 1][i_111_ - 1] & 0x12c0183) == 0)) {
					for (int i_121_ = 1; i_106_ - 1 > i_121_; i_121_++) {
						if ((is[i_121_ + i_114_][i_111_ - 1] & 0x12c018f) != 0)
							break while_341_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_][i_111_ - 1] = 1;
					Class137.anIntArrayArray2203[i_114_][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_342_: do {
				if (i_111_ < 102 && Class33.anIntArrayArray575[i_114_][i_111_ + 1] == 0
						&& (is[i_114_][i_111_ + i_106_] & 0x12c0138) == 0
						&& ((is[i_106_ + i_114_ - 1][i_106_ + i_111_] & 0x12c01e0) == 0)) {
					for (int i_122_ = 1; i_106_ - 1 > i_122_; i_122_++) {
						if ((is[i_114_ + i_122_][i_106_ + i_111_] & 0x12c01f8) != 0)
							break while_342_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_][i_111_ + 1] = 4;
					Class137.anIntArrayArray2203[i_114_][i_111_ + 1] = i_118_;
				}
			} while (false);
			while_343_: do {
				if (i_114_ > 0 && i_111_ > 0 && Class33.anIntArrayArray575[i_114_ - 1][i_111_ - 1] == 0
						&& ((is[i_114_ - 1][i_111_ - 1 + (i_106_ - 1)] & 0x12c0138) == 0)
						&& (is[i_114_ - 1][i_111_ - 1] & 0x12c010e) == 0
						&& ((is[i_114_ - 1 - 1 + i_106_][i_111_ - 1] & 0x12c0183) == 0)) {
					for (int i_123_ = 1; i_106_ - 1 > i_123_; i_123_++) {
						if (((is[i_114_ - 1][i_111_ - 1 + i_123_] & 0x12c013e) != 0)
								|| (is[i_123_ + (i_114_ - 1)][i_111_ - 1] & 0x12c018f) != 0)
							break while_343_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_ - 1] = 3;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_344_: do {
				if (i_114_ < 102 && i_111_ > 0 && Class33.anIntArrayArray575[i_114_ + 1][i_111_ - 1] == 0
						&& (is[i_114_ + 1][i_111_ - 1] & 0x12c010e) == 0
						&& (is[i_114_ + i_106_][i_111_ - 1] & 0x12c0183) == 0
						&& (is[i_106_ + i_114_][i_106_ + (i_111_ - 2)] & 0x12c01e0) == 0) {
					for (int i_124_ = 1; i_124_ < i_106_ - 1; i_124_++) {
						if ((is[i_106_ + i_114_][i_124_ + (i_111_ - 1)] & 0x12c01e3) != 0
								|| (is[i_124_ + i_114_ + 1][i_111_ - 1] & 0x12c018f) != 0)
							break while_344_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ + 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ - 1;
					Class33.anIntArrayArray575[i_114_ + 1][i_111_ - 1] = 9;
					i_115_ = i_115_ + 1 & 0xfff;
					Class137.anIntArrayArray2203[i_114_ + 1][i_111_ - 1] = i_118_;
				}
			} while (false);
			while_345_: do {
				if (i_114_ > 0 && i_111_ < 102 && Class33.anIntArrayArray575[i_114_ - 1][i_111_ + 1] == 0
						&& (is[i_114_ - 1][i_111_ + 1] & 0x12c010e) == 0
						&& (is[i_114_ - 1][i_111_ + i_106_] & 0x12c0138) == 0
						&& (is[i_114_][i_111_ + i_106_] & 0x12c01e0) == 0) {
					for (int i_125_ = 1; i_106_ - 1 > i_125_; i_125_++) {
						if ((is[i_114_ - 1][i_125_ + (i_111_ + 1)] & 0x12c013e) != 0
								|| (is[i_125_ + (i_114_ - 1)][i_111_ + i_106_] & 0x12c01f8) != 0)
							break while_345_;
					}
					Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ - 1;
					Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
					i_115_ = i_115_ + 1 & 0xfff;
					Class33.anIntArrayArray575[i_114_ - 1][i_111_ + 1] = 6;
					Class137.anIntArrayArray2203[i_114_ - 1][i_111_ + 1] = i_118_;
				}
			} while (false);
			if (i_114_ < 102 && i_111_ < 102 && Class33.anIntArrayArray575[i_114_ + 1][i_111_ + 1] == 0
					&& (is[i_114_ + 1][i_106_ + i_111_] & 0x12c0138) == 0
					&& (is[i_106_ + i_114_][i_111_ + i_106_] & 0x12c01e0) == 0
					&& (is[i_114_ + i_106_][i_111_ + 1] & 0x12c0183) == 0) {
				for (int i_126_ = 1; i_126_ < i_106_ - 1; i_126_++) {
					if ((is[i_114_ - (-i_126_ - 1)][i_106_ + i_111_] & 0x12c01f8) != 0
							|| (is[i_106_ + i_114_][i_111_ + 1 + i_126_] & 0x12c01e3) != 0)
						continue while_346_;
				}
				Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_115_] = i_111_ + 1;
				i_115_ = i_115_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_114_ + 1][i_111_ + 1] = 12;
				Class137.anIntArrayArray2203[i_114_ + 1][i_111_ + 1] = i_118_;
			}
		}
		Static2.anInt2911 = 0;
		if (!bool_117_) {
			if (bool) {
				int i_127_ = 1000;
				int i_128_ = 10;
				int i_129_ = 100;
				for (int i_130_ = i_110_ - i_128_; i_110_ + i_128_ >= i_130_; i_130_++) {
					for (int i_131_ = i - i_128_; i + i_128_ >= i_131_; i_131_++) {
						if (i_130_ >= 0 && i_131_ >= 0 && i_130_ < 104 && i_131_ < 104
								&& (Class137.anIntArrayArray2203[i_130_][i_131_] < 100)) {
							int i_132_ = 0;
							int i_133_ = 0;
							if (i_130_ < i_110_)
								i_133_ = -i_130_ + i_110_;
							else if (i_110_ + i_108_ - 1 < i_130_)
								i_133_ = 1 - i_110_ - (i_108_ - i_130_);
							if (i > i_131_)
								i_132_ = -i_131_ + i;
							else if (i_109_ + (i - 1) < i_131_)
								i_132_ = i_131_ + 1 - i_109_ - i;
							int i_134_ = i_132_ * i_132_ + i_133_ * i_133_;
							if (i_127_ > i_134_
									|| (i_127_ == i_134_ && i_129_ > (Class137.anIntArrayArray2203[i_130_][i_131_]))) {
								i_111_ = i_131_;
								i_127_ = i_134_;
								i_114_ = i_130_;
								i_129_ = (Class137.anIntArrayArray2203[i_130_][i_131_]);
							}
						}
					}
				}
				if (i_127_ == 1000) {
					boolean bool_135_ = false;
					return bool_135_;
				}
				if (i_114_ == i_102_ && i_111_ == i_100_) {
					boolean bool_136_ = false;
					return bool_136_;
				}
				Static2.anInt2911 = 1;
			} else
				return false;
		}
		i_115_ = 0;
		Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_;
		Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_111_;
		int i_137_ = i_116_ = Class33.anIntArrayArray575[i_114_][i_111_];
		while (i_102_ != i_114_ || i_111_ != i_100_) {
			if (i_116_ != i_137_) {
				Class14_Sub8_Sub36.anIntArray4691[i_115_] = i_114_;
				i_116_ = i_137_;
				Class14_Sub2_Sub21.anIntArray4078[i_115_++] = i_111_;
			}
			if ((i_137_ & 0x2) == 0) {
				if ((i_137_ & 0x8) != 0)
					i_114_--;
			} else
				i_114_++;
			if ((i_137_ & 0x1) != 0)
				i_111_++;
			else if ((i_137_ & 0x4) != 0)
				i_111_--;
			i_137_ = Class33.anIntArrayArray575[i_114_][i_111_];
		}
		if (i_115_ > 0) {
			Class133.method1782(-20179, i_115_, i_101_);
			boolean bool_138_ = true;
			return bool_138_;
		}
		if (i_101_ == 1) {
			boolean bool_139_ = false;
			return bool_139_;
		}
		boolean bool_140_ = true;
		return bool_140_;
	}
}
