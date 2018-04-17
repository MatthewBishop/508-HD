/* Class142 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.Class14_Sub1;

public class Class142 {
	public int anInt2255;
	public int anInt2256;
	public int anInt2257;
	public int anInt2258;
	public HashTable aClass55_2260;
	public int anInt2261;
	public Class124[] aClass124Array2263;
	public int anInt2264;
	public int anInt2265;
	public int anInt2268;
	public short[] aShortArray2269;
	public static Class124 aClass124_2271;
	public int anInt2273 = 2000;
	public int anInt2274;
	public boolean aBoolean2275;
	public int anInt2276;
	public int anInt2277;
	public short[] aShortArray2278;
	public short[] aShortArray2279;
	public int anInt2281;
	public short[] aShortArray2283;
	public static int[] occludersMaxZ;
	public int anInt2285;
	public int anInt2286;
	public int anInt2288;
	public int[][] anIntArrayArray2289;
	public int anInt2290;
	public int anInt2291;
	public int anInt2292;
	public int anInt2293;
	public static int anInt2295;
	public Class124 aClass124_2296;
	public int anInt2297;
	public int anInt2298;
	public static boolean aBoolean2299;
	public int anInt2301;
	public int anInt2303;
	public Class124[] aClass124Array2304;
	public int anInt2305;
	public boolean aBoolean2306;
	public static int anInt2307 = 0;
	public int anInt2309;
	public int anInt2310;
	public int anInt2311;
	public int anInt2313;
	public static int anInt2315;
	public int anInt2316;
	public int anInt2317;
	public byte[] aByteArray2318;
	public int anInt2319;
	public int[] anIntArray2320;
	public static Class124 aClass124_2321;
	public int anInt2322;
	public int anInt2324;
	public int[] anIntArray2325;
	public int anInt2326;
	public int anInt2327;
	public int anInt2328;

	static {
		aClass124_2271 = Class124.method263(1178, "http:)4)4");
		anInt2295 = 0;
		aBoolean2299 = false;
		anInt2315 = 0;
		aClass124_2321 = Class124.method263(1178, "::fpson");
	}

	public boolean method1964(boolean bool, byte i) {
		int i_0_ = anInt2274;
		int i_1_ = anInt2255;
		int i_2_ = anInt2292;
		if (bool) {
			i_2_ = anInt2303;
			i_1_ = anInt2322;
			i_0_ = anInt2264;
		}
		if (i_0_ == -1) {
			boolean bool_3_ = true;
			return bool_3_;
		}
		if (i >= -54)
			method1979(114, null, (byte) -25);
		boolean bool_4_ = true;
		if (!JunkTex.aClass9_4193.method158(0, i_0_, (byte) 46))
			bool_4_ = false;
		if (i_1_ != -1 && !JunkTex.aClass9_4193.method158(0, i_1_, (byte) -112))
			bool_4_ = false;
		if (i_2_ != -1 && !JunkTex.aClass9_4193.method158(0, i_2_, (byte) 88))
			bool_4_ = false;
		boolean bool_5_ = bool_4_;
		return bool_5_;
	}

	public Class133_Sub2 method1965(int i, boolean bool) {
		int i_6_ = anInt2255;
		int i_7_ = anInt2274;
		int i_8_ = anInt2292;
		if (bool) {
			i_6_ = anInt2322;
			i_7_ = anInt2264;
			i_8_ = anInt2303;
		}
		if (i_7_ == -1) {
			Class133_Sub2 class133_sub2 = null;
			return class133_sub2;
		}
		Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(JunkTex.aClass9_4193, i_7_, 0);
		if (i_6_ != -1) {
			Class133_Sub2 class133_sub2_9_ = Class133_Sub2.method1824(JunkTex.aClass9_4193, i_6_, 0);
			if (i_8_ == -1) {
				Class133_Sub2[] class133_sub2s = { class133_sub2, class133_sub2_9_ };
				class133_sub2 = new Class133_Sub2(class133_sub2s, 2);
			} else {
				Class133_Sub2 class133_sub2_10_ = Class133_Sub2.method1824(JunkTex.aClass9_4193, i_8_, 0);
				Class133_Sub2[] class133_sub2s = { class133_sub2, class133_sub2_9_, class133_sub2_10_ };
				class133_sub2 = new Class133_Sub2(class133_sub2s, 3);
			}
		}
		if (!bool && (anInt2297 != 0 || anInt2256 != 0 || anInt2319 != 0))
			class133_sub2.method1825(anInt2297, anInt2256, anInt2319);
		if (bool && (anInt2258 != 0 || anInt2290 != 0 || anInt2324 != 0))
			class133_sub2.method1825(anInt2258, anInt2290, anInt2324);
		if (aShortArray2278 != null) {
			for (int i_11_ = 0; aShortArray2278.length > i_11_; i_11_++)
				class133_sub2.method1813(aShortArray2278[i_11_], aShortArray2269[i_11_]);
		}
		int i_12_ = -32 / ((i + 53) / 62);
		if (aShortArray2283 != null) {
			for (int i_13_ = 0; i_13_ < aShortArray2283.length; i_13_++)
				class133_sub2.method1819(aShortArray2283[i_13_], aShortArray2279[i_13_]);
		}
		Class133_Sub2 class133_sub2_14_ = class133_sub2;
		return class133_sub2_14_;
	}

	public void method1966(Class142 class142_15_, int i, Class142 class142_16_) {
		anInt2288 = 0;
		anInt2326 = class142_15_.anInt2326;
		anInt2258 = class142_16_.anInt2258;
		anInt2292 = class142_16_.anInt2292;
		aShortArray2278 = class142_16_.aShortArray2278;
		aClass124Array2304 = new Class124[5];
		aShortArray2269 = class142_16_.aShortArray2269;
		anInt2273 = class142_15_.anInt2273;
		aClass124_2296 = class142_16_.aClass124_2296;
		anInt2319 = class142_16_.anInt2319;
		anInt2298 = class142_16_.anInt2298;
		anInt2290 = class142_16_.anInt2290;
		anInt2285 = class142_15_.anInt2285;
		anInt2277 = class142_16_.anInt2277;
		if (i < -111) {
			anInt2293 = class142_15_.anInt2293;
			aClass124Array2263 = class142_16_.aClass124Array2263;
			aByteArray2318 = class142_16_.aByteArray2318;
			aShortArray2283 = class142_16_.aShortArray2283;
			anInt2311 = class142_15_.anInt2311;
			aClass55_2260 = class142_16_.aClass55_2260;
			anInt2256 = class142_16_.anInt2256;
			aShortArray2279 = class142_16_.aShortArray2279;
			aBoolean2306 = class142_16_.aBoolean2306;
			anInt2317 = class142_15_.anInt2317;
			anInt2297 = class142_16_.anInt2297;
			anInt2301 = class142_16_.anInt2301;
			anInt2313 = class142_16_.anInt2313;
			anInt2274 = class142_16_.anInt2274;
			anInt2264 = class142_16_.anInt2264;
			anInt2255 = class142_16_.anInt2255;
			anInt2322 = class142_16_.anInt2322;
			anInt2286 = class142_15_.anInt2286;
			anInt2310 = class142_16_.anInt2310;
			anInt2303 = class142_16_.anInt2303;
			anInt2324 = class142_16_.anInt2324;
			if (class142_16_.aClass124Array2304 != null) {
				for (int i_17_ = 0; i_17_ < 4; i_17_++)
					aClass124Array2304[i_17_] = class142_16_.aClass124Array2304[i_17_];
			}
			aClass124Array2304[4] = Class79.aClass124_1255;
		}
	}

	public void method1967(int i) {
		if (i <= 52)
			anInt2305 = -60;
	}

	public void method1968(Class142 class142_18_, Class142 class142_19_, int i) {
		aClass124_2296 = class142_19_.aClass124_2296;
		aShortArray2279 = class142_18_.aShortArray2279;
		aShortArray2269 = class142_18_.aShortArray2269;
		anInt2288 = class142_19_.anInt2288;
		anInt2273 = class142_18_.anInt2273;
		aByteArray2318 = class142_18_.aByteArray2318;
		if (i <= 116)
			method1976((byte) 29);
		anInt2326 = class142_18_.anInt2326;
		aShortArray2278 = class142_18_.aShortArray2278;
		anInt2309 = 1;
		anInt2293 = class142_18_.anInt2293;
		anInt2317 = class142_18_.anInt2317;
		aBoolean2306 = class142_19_.aBoolean2306;
		aShortArray2283 = class142_18_.aShortArray2283;
		anInt2286 = class142_18_.anInt2286;
		anInt2285 = class142_18_.anInt2285;
		anInt2311 = class142_18_.anInt2311;
	}

	public static void method1969(boolean bool) {
		if (bool) {
			occludersMaxZ = null;
			aClass124_2271 = null;
			aClass124_2321 = null;
		}
	}

	public Class142 method1970(int i, boolean bool) {
		if (anIntArray2325 != null && i > 1) {
			int i_20_ = -1;
			for (int i_21_ = 0; i_21_ < 10; i_21_++) {
				if (i >= anIntArray2320[i_21_] && anIntArray2320[i_21_] != 0)
					i_20_ = anIntArray2325[i_21_];
			}
			if (i_20_ != -1) {
				Class142 class142_22_ = JunkTex.method605(95, i_20_);
				return class142_22_;
			}
		}
		if (bool)
			method1974(null, 112, -121, -104);
		Class142 class142_23_ = this;
		return class142_23_;
	}

	public void method1971(Buffer class14_sub10, boolean bool) {
		if (!bool)
			method1969(true);
		for (;;) {
			int i = class14_sub10.readUByte();
			if (i == 0)
				break;
			method1972(i, -19943, class14_sub10);
		}
	}

	public void method1972(int i, int i_24_, Buffer class14_sub10) {
		if (i == 1)
			anInt2311 = class14_sub10.readUShort();
		else if (i == 2)
			aClass124_2296 = class14_sub10.method797(9467);
		else if (i != 4) {
			if (i == 5)
				anInt2317 = class14_sub10.readUShort();
			else if (i == 6)
				anInt2286 = class14_sub10.readUShort();
			else if (i != 7) {
				if (i != 8) {
					if (i == 11)
						anInt2309 = 1;
					else if (i == 12)
						anInt2288 = class14_sub10.getInt((byte) -112);
					else if (i != 16) {
						if (i == 23)
							anInt2274 = class14_sub10.readUShort();
						else if (i != 24) {
							if (i == 25)
								anInt2264 = class14_sub10.readUShort();
							else if (i != 26) {
								if (i >= 30 && i < 35) {
									aClass124Array2263[i - 30] = class14_sub10.method797(9467);
									if (aClass124Array2263[i - 30].method1717(i_24_ + 19983,
											Class14_Sub9_Sub1.aClass124_4808))
										aClass124Array2263[i - 30] = null;
								} else if (i < 35 || i >= 40) {
									if (i != 40) {
										if (i == 41) {
											int i_25_ = class14_sub10.readUByte();
											aShortArray2283 = new short[i_25_];
											aShortArray2279 = new short[i_25_];
											for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
												aShortArray2283[i_26_] = (short) (class14_sub10.readUShort((byte) 109));
												aShortArray2279[i_26_] = (short) (class14_sub10.readUShort((byte) 124));
											}
										} else if (i != 42) {
											if (i == 65)
												aBoolean2275 = true;
											else if (i != 78) {
												if (i == 79)
													anInt2303 = (class14_sub10.readUShort((byte) 114));
												else if (i != 90) {
													if (i != 91) {
														if (i != 92) {
															if (i == 93)
																anInt2277 = (class14_sub10.readUShort((byte) 121));
															else if (i != 95) {
																if (i == 96)
																	anInt2265 = (class14_sub10.readUByte());
																else if (i != 97) {
																	if (i != 98) {
																		if (i >= 100 && i < 110) {
																			if (anIntArray2325 == null) {
																				anIntArray2325 = new int[10];
																				anIntArray2320 = new int[10];
																			}
																			anIntArray2325[i - 100] = class14_sub10
																					.readUShort();
																			anIntArray2320[i - 100] = class14_sub10
																					.readUShort();
																		} else if (i != 110) {
																			if (i != 111) {
																				if (i != 112) {
																					if (i == 113)
																						anInt2281 = class14_sub10
																								.method780();
																					else if (i != 114) {
																						if (i == 115)
																							anInt2310 = class14_sub10
																									.readUByte();
																						else if (i != 121) {
																							if (i == 122)
																								anInt2305 = class14_sub10
																										.readUShort();
																							else if (i == 124) {
																								if (anIntArrayArray2289 == null)
																									anIntArrayArray2289 = new int[11][];
																								int i_27_ = class14_sub10
																										.readUByte();
																								anIntArrayArray2289[i_27_] = new int[6];
																								for (int i_28_ = 0; i_28_ < 6; i_28_++)
																									anIntArrayArray2289[i_27_][i_28_] = class14_sub10
																											.method805(
																													i_24_ + 19943);
																							} else if (i == 125) {
																								anInt2297 = class14_sub10
																										.method780();
																								anInt2256 = class14_sub10
																										.method780();
																								anInt2319 = class14_sub10
																										.method780();
																							} else if (i != 126) {
																								if (i == 249) {
																									int i_29_ = class14_sub10
																											.readUByte();
																									if (aClass55_2260 == null) {
																										int i_30_ = JunkTex
																												.method653(
																														i_29_);
																										aClass55_2260 = new HashTable(
																												i_30_);
																									}
																									for (int i_31_ = 0; i_29_ > i_31_; i_31_++) {
																										boolean bool = class14_sub10
																												.readUByte() == 1;
																										int i_32_ = class14_sub10
																												.method829(
																														71);
																										Linkable linkable;
																										if (bool)
																											linkable = new Class14_Sub30(
																													class14_sub10
																															.method797(
																																	9467));
																										else
																											linkable = new Class14_Sub1(
																													class14_sub10
																															.getInt(
																																	(byte) -110));
																										aClass55_2260
																												.put(
																														i_32_,
																														linkable);
																									}
																								}
																							} else {
																								anInt2258 = class14_sub10
																										.method780();
																								anInt2290 = class14_sub10
																										.method780();
																								anInt2324 = class14_sub10
																										.method780();
																							}
																						} else
																							anInt2257 = class14_sub10
																									.readUShort();
																					} else
																						anInt2261 = class14_sub10
																								.method780()
																								* 5;
																				} else
																					anInt2327 = class14_sub10
																							.readUShort();
																			} else
																				anInt2291 = class14_sub10
																						.readUShort();
																		} else
																			anInt2328 = class14_sub10
																					.readUShort();
																	} else
																		anInt2316 = class14_sub10.readUShort();
																} else
																	anInt2268 = (class14_sub10.readUShort((byte) 120));
															} else
																anInt2326 = (class14_sub10.readUShort((byte) 117));
														} else
															anInt2298 = (class14_sub10.readUShort((byte) 114));
													} else
														anInt2301 = (class14_sub10.readUShort((byte) 115));
												} else
													anInt2313 = (class14_sub10.readUShort((byte) 102));
											} else
												anInt2292 = (class14_sub10.readUShort((byte) 125));
										} else {
											int i_33_ = class14_sub10.readUByte();
											aByteArray2318 = new byte[i_33_];
											for (int i_34_ = 0; i_34_ < i_33_; i_34_++)
												aByteArray2318[i_34_] = (class14_sub10.method780());
										}
									} else {
										int i_35_ = class14_sub10.readUByte();
										aShortArray2278 = new short[i_35_];
										aShortArray2269 = new short[i_35_];
										for (int i_36_ = 0; i_35_ > i_36_; i_36_++) {
											aShortArray2278[i_36_] = (short) (class14_sub10.readUShort((byte) 114));
											aShortArray2269[i_36_] = (short) (class14_sub10.readUShort((byte) 113));
										}
									}
								} else
									aClass124Array2304[i - 35] = class14_sub10.method797(i_24_ + 29410);
							} else
								anInt2322 = class14_sub10.readUShort();
						} else
							anInt2255 = class14_sub10.readUShort();
					} else
						aBoolean2306 = true;
				} else {
					anInt2285 = class14_sub10.readUShort();
					if (anInt2285 > 32767)
						anInt2285 -= 65536;
				}
			} else {
				anInt2293 = class14_sub10.readUShort();
				if (anInt2293 > 32767)
					anInt2293 -= 65536;
			}
		} else
			anInt2273 = class14_sub10.readUShort();
		if (i_24_ != -19943)
			anInt2293 = -62;
	}

	public Class133_Sub2 method1973(int i, boolean bool) {
		if (i >= -34) {
			Class133_Sub2 class133_sub2 = null;
			return class133_sub2;
		}
		int i_37_ = anInt2298;
		int i_38_ = anInt2313;
		if (bool) {
			i_38_ = anInt2301;
			i_37_ = anInt2277;
		}
		if (i_38_ == -1) {
			Class133_Sub2 class133_sub2 = null;
			return class133_sub2;
		}
		Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(JunkTex.aClass9_4193, i_38_, 0);
		if (i_37_ != -1) {
			Class133_Sub2 class133_sub2_39_ = Class133_Sub2.method1824(JunkTex.aClass9_4193, i_37_, 0);
			Class133_Sub2[] class133_sub2s = { class133_sub2, class133_sub2_39_ };
			class133_sub2 = new Class133_Sub2(class133_sub2s, 2);
		}
		if (aShortArray2278 != null) {
			for (int i_40_ = 0; i_40_ < aShortArray2278.length; i_40_++)
				class133_sub2.method1813(aShortArray2278[i_40_], aShortArray2269[i_40_]);
		}
		if (aShortArray2283 != null) {
			for (int i_41_ = 0; i_41_ < aShortArray2283.length; i_41_++)
				class133_sub2.method1819(aShortArray2283[i_41_], aShortArray2279[i_41_]);
		}
		Class133_Sub2 class133_sub2_42_ = class133_sub2;
		return class133_sub2_42_;
	}

	public Class133_Sub7 method1974(Animation animation, int i, int i_43_, int i_44_) {
		if (i_43_ != 0) {
			Class133_Sub7 class133_sub7 = null;
			return class133_sub7;
		}
		if (anIntArray2325 != null && i_44_ > 1) {
			int i_45_ = -1;
			for (int i_46_ = 0; i_46_ < 10; i_46_++) {
				if (i_44_ >= anIntArray2320[i_46_] && anIntArray2320[i_46_] != 0)
					i_45_ = anIntArray2325[i_46_];
			}
			if (i_45_ != -1) {
				Class133_Sub7 class133_sub7 = JunkTex.method605(96, i_45_).method1974(animation, i, 0, 1);
				return class133_sub7;
			}
		}
		Class133_Sub7 class133_sub7 = ((Class133_Sub7) JunkTex.aClass52_2075.get(anInt2276));
		if (class133_sub7 == null) {
			Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(JunkTex.aClass9_4193, anInt2311, 0);
			if (class133_sub2 == null) {
				Class133_Sub7 class133_sub7_47_ = null;
				return class133_sub7_47_;
			}
			if (aShortArray2278 != null) {
				for (int i_48_ = 0; i_48_ < aShortArray2278.length; i_48_++) {
					if (aByteArray2318 != null && i_48_ < aByteArray2318.length)
						class133_sub2.method1813(aShortArray2278[i_48_],
								(Class7_Sub1.aShortArray2663[(aByteArray2318[i_48_] & 0xff)]));
					else
						class133_sub2.method1813(aShortArray2278[i_48_], aShortArray2269[i_48_]);
				}
			}
			if (aShortArray2283 != null) {
				for (int i_49_ = 0; i_49_ < aShortArray2283.length; i_49_++)
					class133_sub2.method1819(aShortArray2283[i_49_], aShortArray2279[i_49_]);
			}
			class133_sub7 = class133_sub2.method1827(anInt2281 + 64, 768 + anInt2261, -50, -10, -50);
			if (anInt2328 != 128 || anInt2291 != 128 || anInt2327 != 128)
				class133_sub7.method1869(anInt2328, anInt2291, anInt2327);
			class133_sub7.haveActions = true;
			((ModelHD) class133_sub7).method1895(false, false, false, true, false, false, true);
			JunkTex.aClass52_2075.put(class133_sub7, anInt2276);
		}
		if (animation != null)
			class133_sub7 = animation.method1167(i, 65535, class133_sub7);
		return class133_sub7;
	}

	public boolean method1975(int i, boolean bool) {
		int i_50_ = anInt2313;
		int i_51_ = anInt2298;
		if (bool) {
			i_51_ = anInt2277;
			i_50_ = anInt2301;
		}
		if ((i_50_ ^ 0xffffffff) == i) {
			boolean bool_52_ = true;
			return bool_52_;
		}
		boolean bool_53_ = true;
		if (!JunkTex.aClass9_4193.method158(0, i_50_, (byte) 76))
			bool_53_ = false;
		if (i_51_ != -1 && !JunkTex.aClass9_4193.method158(0, i_51_, (byte) -90))
			bool_53_ = false;
		boolean bool_54_ = bool_53_;
		return bool_54_;
	}

	public static void method1976(byte i) {
		AtmosphericChunk atmosphericChunk = new AtmosphericChunk();
		int i_55_ = 0;
		int i_56_ = 60 % ((-46 - i) / 63);
		for (/**/; i_55_ < 13; i_55_++) {
			for (int i_57_ = 0; i_57_ < 13; i_57_++)
				OverlayType.aClass71ArrayArray2421[i_55_][i_57_] = atmosphericChunk;
		}
	}

	public int method1977(int i, int i_58_, int i_59_) {
		if (i_59_ != 125)
			anInt2293 = 63;
		if (aClass55_2260 == null) {
			int i_60_ = i;
			return i_60_;
		}
		Class14_Sub1 class14_sub1 = ((Class14_Sub1) aClass55_2260.get(i_58_));
		if (class14_sub1 == null) {
			int i_61_ = i;
			return i_61_;
		}
		int i_62_ = class14_sub1.anInt2714;
		return i_62_;
	}

	public ModelSD method1978(int i) {
		Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(JunkTex.aClass9_4193, anInt2311, i);
		if (class133_sub2 == null) {
			ModelSD modelsd = null;
			return modelsd;
		}
		if (aShortArray2278 != null) {
			for (int i_63_ = 0; i_63_ < aShortArray2278.length; i_63_++) {
				if (aByteArray2318 != null && aByteArray2318.length > i_63_)
					class133_sub2.method1813(aShortArray2278[i_63_],
							(Class7_Sub1.aShortArray2663[aByteArray2318[i_63_] & 0xff]));
				else
					class133_sub2.method1813(aShortArray2278[i_63_], aShortArray2269[i_63_]);
			}
		}
		if (aShortArray2283 != null) {
			for (int i_64_ = 0; i_64_ < aShortArray2283.length; i_64_++)
				class133_sub2.method1819(aShortArray2283[i_64_], aShortArray2279[i_64_]);
		}
		ModelSD modelsd = class133_sub2.method1822(anInt2281 + 64, anInt2261 + 768, -50, -10, -50);
		if (anInt2328 != 128 || anInt2291 != 128 || anInt2327 != 128)
			modelsd.method1869(anInt2328, anInt2291, anInt2327);
		ModelSD modelsd_65_ = modelsd;
		return modelsd_65_;
	}

	public Class124 method1979(int i, Class124 class124, byte i_66_) {
		if (i_66_ <= 37)
			anInt2295 = -114;
		if (aClass55_2260 == null) {
			Class124 class124_67_ = class124;
			return class124_67_;
		}
		Class14_Sub30 class14_sub30 = (Class14_Sub30) aClass55_2260.get(i);
		if (class14_sub30 == null) {
			Class124 class124_68_ = class124;
			return class124_68_;
		}
		Class124 class124_69_ = class14_sub30.aClass124_3270;
		return class124_69_;
	}

	public Class142() {
		anInt2268 = -1;
		anInt2265 = 0;
		anInt2281 = 0;
		anInt2255 = -1;
		anInt2286 = 0;
		aBoolean2275 = false;
		anInt2288 = 1;
		anInt2292 = -1;
		anInt2291 = 128;
		anInt2293 = 0;
		anInt2285 = 0;
		anInt2290 = 0;
		anInt2256 = 0;
		anInt2303 = -1;
		anInt2301 = -1;
		anInt2297 = 0;
		anInt2298 = -1;
		aBoolean2306 = false;
		aClass124Array2304 = new Class124[] { null, null, null, null, JunkTex.aClass124_4118 };
		anInt2264 = -1;
		anInt2261 = 0;
		aClass124_2296 = Class137.aClass124_2200;
		anInt2305 = -1;
		anInt2274 = -1;
		anInt2310 = 0;
		anInt2319 = 0;
		anInt2317 = 0;
		aClass124Array2263 = new Class124[] { null, null, JunkTex.aClass124_4368, null, null };
		anInt2258 = 0;
		anInt2257 = -1;
		anInt2277 = -1;
		anInt2324 = 0;
		anInt2313 = -1;
		anInt2309 = 0;
		anInt2316 = -1;
		anInt2326 = 0;
		anInt2327 = 128;
		anInt2328 = 128;
		anInt2322 = -1;
	}
}
