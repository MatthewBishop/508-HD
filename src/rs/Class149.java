/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Deque;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub1;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub12;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub18;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub2;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub21;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Class14_Sub8_Sub25;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub37;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub39;
import rs.tex.Class14_Sub8_Sub39_Sub1;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub5;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub8;
import rs.tex.Class14_Sub8_Sub9;

public class Class149 {
	public static int anInt2383 = 0;
	public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_2384;
	public int anInt2385;
	public int[][] anIntArrayArray2386;
	public static int anInt2389;
	public static Class124 aClass124_2390 = Class14_Sub2_Sub2.method263(1178, "<)4col>");
	public static int[][][] anIntArrayArrayArray2391;
	public int anInt2392 = 0;
	public int anInt2393;
	public Deque aClass2_2394;
	public static Class124 aClass124_2395 = Class14_Sub2_Sub2.method263(1178, ":");
	public int anInt2399 = -1;
	public Class14_Sub6[] aClass14_Sub6Array2401;
	public boolean aBoolean2402;

	public int[] method2014(int i, byte i_0_) {
		if (i_0_ <= 101)
			method2015((byte) -69);
		if (anInt2393 != anInt2385) {
			if (anInt2385 == 1) {
				aBoolean2402 = anInt2399 != i;
				anInt2399 = i;
				int[] is = anIntArrayArray2386[0];
				return is;
			}
			Class14_Sub6 class14_sub6 = aClass14_Sub6Array2401[i];
			if (class14_sub6 == null) {
				aBoolean2402 = true;
				if (anInt2385 <= anInt2392) {
					Class14_Sub6 class14_sub6_1_ = (Class14_Sub6) aClass2_2394.getTail();
					class14_sub6 = new Class14_Sub6(i, class14_sub6_1_.anInt2813);
					aClass14_Sub6Array2401[class14_sub6_1_.anInt2814] = null;
					class14_sub6_1_.unlink();
				} else {
					class14_sub6 = new Class14_Sub6(i, anInt2392);
					anInt2392++;
				}
				aClass14_Sub6Array2401[i] = class14_sub6;
			} else
				aBoolean2402 = false;
			aClass2_2394.pushFront(class14_sub6);
			int[] is = anIntArrayArray2386[class14_sub6.anInt2813];
			return is;
		}
		aBoolean2402 = aClass14_Sub6Array2401[i] == null;
		aClass14_Sub6Array2401[i] = Class56_Sub1.aClass14_Sub6_3319;
		int[] is = anIntArrayArray2386[i];
		return is;
	}

	public void method2015(byte i) {
		if (i != 87)
			method2016(117, -110);
		for (int i_2_ = 0; anInt2385 > i_2_; i_2_++)
			anIntArrayArray2386[i_2_] = null;
		aClass14_Sub6Array2401 = null;
		anIntArrayArray2386 = null;
		aClass2_2394.clear();
		aClass2_2394 = null;
	}

	public static Class14_Sub8 method2016(int i, int i_3_) {
		if (i_3_ <= 93) {
			Class14_Sub8 class14_sub8 = null;
			return class14_sub8;
		}
		int i_4_ = i;
		while_165_: do {
			while_164_: do {
				while_163_: do {
					while_162_: do {
						while_161_: do {
							while_160_: do {
								while_159_: do {
									while_158_: do {
										while_157_: do {
											while_156_: do {
												while_155_: do {
													while_154_: do {
														while_153_: do {
															while_152_: do {
																while_151_: do {
																	while_150_: do {
																		while_149_: do {
																			while_148_: do {
																				while_147_: do {
																					while_146_: do {
																						while_145_: do {
																							while_144_: do {
																								while_143_: do {
																									while_142_: do {
																										while_141_: do {
																											while_140_: do {
																												while_139_: do {
																													while_138_: do {
																														while_137_: do {
																															while_136_: do {
																																while_135_: do {
																																	while_134_: do {
																																		while_133_: do {
																																			while_132_: do {
																																				while_131_: do {
																																					while_130_: do {
																																						while_129_: do {
																																							while_128_: do {
																																								do {
																																									if (i_4_ != 0) {
																																										if (i_4_ != 1) {
																																											if (i_4_ != 2) {
																																												if (i_4_ != 3) {
																																													if (i_4_ != 4) {
																																														if (i_4_ != 5) {
																																															if (i_4_ != 6) {
																																																if (i_4_ != 7) {
																																																	if (i_4_ != 8) {
																																																		if (i_4_ != 9) {
																																																			if (i_4_ != 10) {
																																																				if (i_4_ != 11) {
																																																					if (i_4_ != 12) {
																																																						if (i_4_ != 13) {
																																																							if (i_4_ != 14) {
																																																								if (i_4_ != 15) {
																																																									if (i_4_ != 16) {
																																																										if (i_4_ != 17) {
																																																											if (i_4_ != 18) {
																																																												if (i_4_ != 19) {
																																																													if (i_4_ != 20) {
																																																														if (i_4_ != 21) {
																																																															if (i_4_ != 22) {
																																																																if (i_4_ != 23) {
																																																																	if (i_4_ != 24) {
																																																																		if (i_4_ != 25) {
																																																																			if (i_4_ != 26) {
																																																																				if (i_4_ != 27) {
																																																																					if (i_4_ != 28) {
																																																																						if (i_4_ != 29) {
																																																																							if (i_4_ != 30) {
																																																																								if (i_4_ != 31) {
																																																																									if (i_4_ != 32) {
																																																																										if (i_4_ != 33) {
																																																																											if (i_4_ != 34) {
																																																																												if (i_4_ != 35) {
																																																																													if (i_4_ != 36) {
																																																																														if (i_4_ != 37) {
																																																																															if (i_4_ != 38) {
																																																																																if (i_4_ != 39)
																																																																																	break while_165_;
																																																																															} else
																																																																																break while_163_;
																																																																															break while_164_;
																																																																														}
																																																																													} else
																																																																														break while_161_;
																																																																													break while_162_;
																																																																												}
																																																																											} else
																																																																												break while_159_;
																																																																											break while_160_;
																																																																										}
																																																																									} else
																																																																										break while_157_;
																																																																									break while_158_;
																																																																								}
																																																																							} else
																																																																								break while_155_;
																																																																							break while_156_;
																																																																						}
																																																																					} else
																																																																						break while_153_;
																																																																					break while_154_;
																																																																				}
																																																																			} else
																																																																				break while_151_;
																																																																			break while_152_;
																																																																		}
																																																																	} else
																																																																		break while_149_;
																																																																	break while_150_;
																																																																}
																																																															} else
																																																																break while_147_;
																																																															break while_148_;
																																																														}
																																																													} else
																																																														break while_145_;
																																																													break while_146_;
																																																												}
																																																											} else
																																																												break while_143_;
																																																											break while_144_;
																																																										}
																																																									} else
																																																										break while_141_;
																																																									break while_142_;
																																																								}
																																																							} else
																																																								break while_139_;
																																																							break while_140_;
																																																						}
																																																					} else
																																																						break while_137_;
																																																					break while_138_;
																																																				}
																																																			} else
																																																				break while_135_;
																																																			break while_136_;
																																																		}
																																																	} else
																																																		break while_133_;
																																																	break while_134_;
																																																}
																																															} else
																																																break while_131_;
																																															break while_132_;
																																														}
																																													} else
																																														break while_129_;
																																													break while_130_;
																																												}
																																											} else
																																												break;
																																											break while_128_;
																																										}
																																									} else {
																																										Class14_Sub8_Sub23 class14_sub8_sub23 = new Class14_Sub8_Sub23();
																																										return class14_sub8_sub23;
																																									}
																																									Class14_Sub8_Sub7 class14_sub8_sub7 = new Class14_Sub8_Sub7();
																																									return class14_sub8_sub7;
																																								} while (false);
																																								Class14_Sub8_Sub22 class14_sub8_sub22 = new Class14_Sub8_Sub22();
																																								return class14_sub8_sub22;
																																							} while (false);
																																							Class14_Sub8_Sub14 class14_sub8_sub14 = new Class14_Sub8_Sub14();
																																							return class14_sub8_sub14;
																																						} while (false);
																																						Class14_Sub8_Sub34 class14_sub8_sub34 = new Class14_Sub8_Sub34();
																																						return class14_sub8_sub34;
																																					} while (false);
																																					Class14_Sub8_Sub25 class14_sub8_sub25 = new Class14_Sub8_Sub25();
																																					return class14_sub8_sub25;
																																				} while (false);
																																				Class14_Sub8_Sub5 class14_sub8_sub5 = new Class14_Sub8_Sub5();
																																				return class14_sub8_sub5;
																																			} while (false);
																																			Class14_Sub8_Sub2 class14_sub8_sub2 = new Class14_Sub8_Sub2();
																																			return class14_sub8_sub2;
																																		} while (false);
																																		Class14_Sub8_Sub21 class14_sub8_sub21 = new Class14_Sub8_Sub21();
																																		return class14_sub8_sub21;
																																	} while (false);
																																	Class14_Sub8_Sub27 class14_sub8_sub27 = new Class14_Sub8_Sub27();
																																	return class14_sub8_sub27;
																																} while (false);
																																Class14_Sub8_Sub17 class14_sub8_sub17 = new Class14_Sub8_Sub17();
																																return class14_sub8_sub17;
																															} while (false);
																															Class14_Sub8_Sub4 class14_sub8_sub4 = new Class14_Sub8_Sub4();
																															return class14_sub8_sub4;
																														} while (false);
																														Class14_Sub8_Sub37 class14_sub8_sub37 = new Class14_Sub8_Sub37();
																														return class14_sub8_sub37;
																													} while (false);
																													Class14_Sub8_Sub11 class14_sub8_sub11 = new Class14_Sub8_Sub11();
																													return class14_sub8_sub11;
																												} while (false);
																												Class14_Sub8_Sub15 class14_sub8_sub15 = new Class14_Sub8_Sub15();
																												return class14_sub8_sub15;
																											} while (false);
																											Class14_Sub8_Sub36 class14_sub8_sub36 = new Class14_Sub8_Sub36();
																											return class14_sub8_sub36;
																										} while (false);
																										Class14_Sub8_Sub38 class14_sub8_sub38 = new Class14_Sub8_Sub38();
																										return class14_sub8_sub38;
																									} while (false);
																									Class14_Sub8_Sub24 class14_sub8_sub24 = new Class14_Sub8_Sub24();
																									return class14_sub8_sub24;
																								} while (false);
																								Class14_Sub8_Sub39_Sub1 class14_sub8_sub39_sub1 = new Class14_Sub8_Sub39_Sub1();
																								return class14_sub8_sub39_sub1;
																							} while (false);
																							Class14_Sub8_Sub29 class14_sub8_sub29 = new Class14_Sub8_Sub29();
																							return class14_sub8_sub29;
																						} while (false);
																						Class14_Sub8_Sub30 class14_sub8_sub30 = new Class14_Sub8_Sub30();
																						return class14_sub8_sub30;
																					} while (false);
																					Class14_Sub8_Sub13 class14_sub8_sub13 = new Class14_Sub8_Sub13();
																					return class14_sub8_sub13;
																				} while (false);
																				Class14_Sub8_Sub26 class14_sub8_sub26 = new Class14_Sub8_Sub26();
																				return class14_sub8_sub26;
																			} while (false);
																			Class14_Sub8_Sub16 class14_sub8_sub16 = new Class14_Sub8_Sub16();
																			return class14_sub8_sub16;
																		} while (false);
																		Class14_Sub8_Sub31 class14_sub8_sub31 = new Class14_Sub8_Sub31();
																		return class14_sub8_sub31;
																	} while (false);
																	Class14_Sub8_Sub20 class14_sub8_sub20 = (new Class14_Sub8_Sub20());
																	return class14_sub8_sub20;
																} while (false);
																Class14_Sub8_Sub8 class14_sub8_sub8 = (new Class14_Sub8_Sub8());
																return class14_sub8_sub8;
															} while (false);
															Class14_Sub8_Sub10 class14_sub8_sub10 = (new Class14_Sub8_Sub10());
															return class14_sub8_sub10;
														} while (false);
														Class14_Sub8_Sub6 class14_sub8_sub6 = (new Class14_Sub8_Sub6());
														return class14_sub8_sub6;
													} while (false);
													Class14_Sub8_Sub18 class14_sub8_sub18 = (new Class14_Sub8_Sub18());
													return class14_sub8_sub18;
												} while (false);
												Class14_Sub8_Sub9 class14_sub8_sub9 = new Class14_Sub8_Sub9();
												return class14_sub8_sub9;
											} while (false);
											Class14_Sub8_Sub28 class14_sub8_sub28 = new Class14_Sub8_Sub28();
											return class14_sub8_sub28;
										} while (false);
										Class14_Sub8_Sub32 class14_sub8_sub32 = new Class14_Sub8_Sub32();
										return class14_sub8_sub32;
									} while (false);
									Class14_Sub8_Sub3 class14_sub8_sub3 = new Class14_Sub8_Sub3();
									return class14_sub8_sub3;
								} while (false);
								Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
								return class14_sub8_sub12;
							} while (false);
							Class14_Sub8_Sub33 class14_sub8_sub33 = new Class14_Sub8_Sub33();
							return class14_sub8_sub33;
						} while (false);
						Class14_Sub8_Sub19 class14_sub8_sub19 = new Class14_Sub8_Sub19();
						return class14_sub8_sub19;
					} while (false);
					Class14_Sub8_Sub35 class14_sub8_sub35 = new Class14_Sub8_Sub35();
					return class14_sub8_sub35;
				} while (false);
				Class14_Sub8_Sub1 class14_sub8_sub1 = new Class14_Sub8_Sub1();
				return class14_sub8_sub1;
			} while (false);
			Class14_Sub8_Sub39 class14_sub8_sub39 = new Class14_Sub8_Sub39();
			return class14_sub8_sub39;
		} while (false);
		Class14_Sub8 class14_sub8 = null;
		return class14_sub8;
	}

	public static void method2017(byte i) {
		aClass124_2390 = null;
		aClass14_Sub2_Sub19_2384 = null;
		aClass124_2395 = null;
		anIntArrayArrayArray2391 = null;
		if (i > -111)
			aClass14_Sub2_Sub19_2384 = null;
	}

	public static void method2018(Class9_Sub1 class9_sub1, int i, Class114 class114, boolean bool) {
		Class14_Sub19 class14_sub19 = new Class14_Sub19();
		if (!bool)
			aClass124_2395 = null;
		class14_sub19.key = (long) i;
		class14_sub19.aClass114_3077 = class114;
		class14_sub19.anInt3067 = 1;
		class14_sub19.aClass9_Sub1_3076 = class9_sub1;
		Deque deque = Class14_Sub8_Sub19.aClass2_4404;
		synchronized (deque) {
			Class14_Sub8_Sub19.aClass2_4404.pushBack(class14_sub19);
		}
		Class14_Sub9_Sub1.method696((byte) -119);
	}

	public int[][] method2019(boolean bool) {
		if (anInt2385 != anInt2393)
			throw new RuntimeException("Can only retrieve a full image cache");
		for (int i = 0; i < anInt2385; i++)
			aClass14_Sub6Array2401[i] = Class56_Sub1.aClass14_Sub6_3319;
		if (!bool)
			anIntArrayArrayArray2391 = null;
		int[][] is = anIntArrayArray2386;
		return is;
	}

	public Class149(int i, int i_5_, int i_6_) {
		aClass2_2394 = new Deque();
		aBoolean2402 = false;
		anInt2385 = i;
		anIntArrayArray2386 = new int[anInt2385][i_6_];
		anInt2393 = i_5_;
		aClass14_Sub6Array2401 = new Class14_Sub6[anInt2393];
	}
}
