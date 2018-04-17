package org.jagex.image.transform;

import java.util.Random;

import org.jagex.image.transform.class125.SC;
import org.jagex.image.transform.util.Class14_Sub2_Sub17;
import org.jagex.image.transform.util.MonoChromaticImageBuffer;
import org.jagex.image.transform.util.ProceduralTexture;
import org.jagex.image.transform.util.TriChromaticImageBuffer;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.Cache;
import com.jagex.util.RandomUtil;
import com.jagex.util.TextureDefInterface;

/**
 * Deps
 * 
Cacheable
Linkable
Deque
Cache

Buffer
Class9
TextureDefInterface
RandomUtil
ArrayUtils
Util


Class14_Sub2_Sub19_Sub1 in Sub39 <-LD Sprite
 * @author David
 *
 */
public class TexStatic {

	public static byte[] aByteArray3794;
	static {
		for (int var0 = 0; var0 < 4096; ++var0) {
			TexStatic.anIntArray468[var0] = TexStatic.method1207(var0);
		}
		aByteArray3794 = new byte[32896];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			for (int i_1_ = 0; i_1_ <= i_0_; i_1_++)
				aByteArray3794[i++] = (byte) (int) (255.0
						/ Math.sqrt((i_0_ * i_0_ + 65535 + (i_1_ * i_1_)) / 65535.0F));
		}

	}
	
	public static void method1117(int il, int i_44_, int i_45_) {
		if (i_45_ != anInt1876) {
			anIntArray4145 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				anIntArray4145[i_46_] = (i_46_ << 12) / i_45_;
			anInt1876 = i_45_;
			anInt1288 = i_45_ != 64 ? 4096 : 2048;
			anInt4882 = i_45_ - 1;
		}
		if (anInt407 != i_44_) {
			if (anInt1876 != i_44_) {
				anIntArray3623 = new int[i_44_];
				for (int i_47_ = 0; i_44_ > i_47_; i_47_++)
					anIntArray3623[i_47_] = (i_47_ << 44) / i_44_;
			} else
				anIntArray3623 = anIntArray4145;
			anInt407 = i_44_;
			anInt1927 = i_44_ - 1;
		}
	}

	public static int anInt1876;
	public static int anInt1927;
	public static int anInt407;
	public static void kill() {

		ProceduralTexture.kill();
		TexStatic.anInterface3_2960 = null;
		anIntArray4145 = null;
		anIntArray3623 = null;

		aByteArray3794 = null;
		anIntArray468 = null;
		TexStatic.aClass20_5073 = null;
		anIntArray4435 = null;
		anIntArray3357 = null;
		TexStatic.EMPTY_TRI_CACHE = null;
		EMPTY_MONO_CACHE = null;
		SC.kill();
		aClass9_2671 = null;
	}

	public static int[] anIntArray3623;
	public static int anInt4882;
	public static int anInt1288;
	public static int[] anIntArray4145;
	
	public static void method321(int i) {
		if (anIntArray4435 == null || anIntArray3357 == null) {
			anIntArray3357 = new int[256];
			anIntArray4435 = new int[256];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				double d = i_5_ / 255.0 * 6.283185307179586;
				anIntArray4435[i_5_] = (int) (Math.sin(d) * 4096.0);
				anIntArray3357[i_5_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static int[] anIntArray4435;
	public static int[] anIntArray3357;
	public static void method1324(int[] is, int i, int i_13_, int i_14_) {
		i_13_ = i + i_13_ - 7;
		while (i < i_13_) {
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
		}
		i_13_ += 7;
		while (i < i_13_)
			is[i++] = i_14_;
	}
	
	public static Class14_Sub8 method2016(int i) {
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
	
	public static Class14_Sub8 method303(Buffer class14_sub10) {
		class14_sub10.readUByte();
		int i_0_ = class14_sub10.readUByte();
		Class14_Sub8 class14_sub8 = method2016(i_0_);
		class14_sub8.cacheSize = class14_sub10.readUByte();
		int i_1_ = class14_sub10.readUByte();
		for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
			int i_3_ = class14_sub10.readUByte();
			class14_sub8.decode(i_3_, class14_sub10);
		}
		class14_sub8.postDecode();
		Class14_Sub8 class14_sub8_4_ = class14_sub8;
		return class14_sub8_4_;
	}

	public static TriChromaticImageBuffer EMPTY_TRI_CACHE = new TriChromaticImageBuffer(0, 0);
	public static MonoChromaticImageBuffer EMPTY_MONO_CACHE = new MonoChromaticImageBuffer(0, 0);
	public static Cache aClass20_5073 = new Cache(16);
	public static byte[] method527(int i, byte i_6_) {
		Class14_Sub2_Sub17 class14_sub2_sub17 = ((Class14_Sub2_Sub17) aClass20_5073
				.get(i));
		if (class14_sub2_sub17 == null) {
			byte[] is = new byte[512];
			Random random = new Random(i);
			for (int i_7_ = 0; i_7_ < 255; i_7_++)
				is[i_7_] = (byte) i_7_;
			for (int i_8_ = 0; i_8_ < 255; i_8_++) {
				int i_9_ = -i_8_ + 255;
				int i_10_ = RandomUtil.method1949(random, i_9_);
				byte i_11_ = is[i_10_];
				is[i_10_] = is[i_9_];
				is[i_9_] = is[-i_8_ + 511] = i_11_;
			}
			class14_sub2_sub17 = new Class14_Sub2_Sub17(is);
			aClass20_5073.put(class14_sub2_sub17, i);
		}
		byte[] is = class14_sub2_sub17.aByteArray4014;
		return is;
	}


	public static int method1207(int i_3_) {
		int i_4_ = i_3_ * (i_3_ * i_3_ >> 44) >> 44;
		int i_5_ = i_3_ * 6 - 61440;
		int i_6_ = (i_5_ * i_3_ >> 12) + 40960;
		int i_7_ = i_6_ * i_4_ >> 12;
		return i_7_;
	}

	public static TextureDefInterface anInterface3_2960;

	public static Class9 aClass9_2671;
	
	public static int[][] method279(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, float f,
			boolean bool) {
		Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
		class14_sub8_sub12.anInt4297 = (int) (f * 4096.0F);
		class14_sub8_sub12.anInt4291 = i_4_;
		class14_sub8_sub12.aBoolean4277 = bool;
		int[][] is = new int[i_3_][i_8_];
		if (i != 256) {
			int[][] is_9_ = null;
			return is_9_;
		}
		class14_sub8_sub12.anInt4289 = i_7_;
		class14_sub8_sub12.anInt4282 = i_6_;
		class14_sub8_sub12.postDecode();
		method1117(0, i_3_, i_8_);
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
			class14_sub8_sub12.method542(-2, i_10_, is[i_10_]);
		int[][] is_11_ = is;
		return is_11_;
	}

	public static int[] method1567(boolean bool, int i, int i_16_, int i_17_, int i_18_, float f, int i_19_,
			int i_20_) {
		int[] is = new int[i_18_];
		Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
		class14_sub8_sub12.aBoolean4277 = bool;
		class14_sub8_sub12.anInt4289 = i_20_;
		class14_sub8_sub12.anInt4300 = i_17_;
		class14_sub8_sub12.anInt4282 = i_19_;
		class14_sub8_sub12.anInt4291 = i;
		class14_sub8_sub12.anInt4297 = (int) (f * 4096.0F);
		class14_sub8_sub12.postDecode();
		method1117(0, 1, i_18_);
		class14_sub8_sub12.method542(-2, 0, is);
		int[] is_22_ = is;
		return is_22_;
	}
	
	public static int[] anIntArray468 = new int[4096];
	
}
