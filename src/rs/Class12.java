/* Class12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class14_Sub1;

import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub39;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class Class12 {
	public int anInt275;
	public int anInt276;
	public int anInt277;
	public static Class124 aClass124_278;
	public int anInt279;
	public short aShort280;
	public int anInt281;
	public static long aLong282;
	public int anInt284;
	public short aShort285;
	public int anInt286;
	public boolean aBoolean287 = true;
	public int anInt289;
	public byte aByte290;
	public Class124[] aClass124Array291;
	public int anInt292;
	public int anInt293;
	public static int anInt294;
	public int anInt295;
	public int anInt296 = -1;
	public int anInt297;
	public int anInt301;
	public Class124 aClass124_302;
	public int anInt303;
	public HashTable aClass55_304;
	public short[] aShortArray305;
	public int anInt306;
	public boolean aBoolean307;
	public boolean aBoolean308;
	public int[] anIntArray309;
	public static byte[][] aByteArrayArray310;
	public static Class124 aClass124_311;
	public short aShort313;
	public short[] aShortArray314;
	public short aShort315;
	public int[][] anIntArrayArray316;
	public short[] aShortArray317;
	public int anInt318;
	public short[] aShortArray319;
	public static short[] aShortArray320 = { 6798, 8741, 25238, 4626, 4550 };
	public byte aByte321;
	public int anInt323;
	public int anInt326;
	public static Class124 aClass124_328;
	public int[] anIntArray329;
	public boolean aBoolean330;
	public byte aByte331;
	public static Class9 aClass9_332;
	public byte[] aByteArray333;
	public int anInt334;
	public int anInt335;
	public int anInt337;
	public int[] anIntArray338;
	public int anInt339;
	public boolean aBoolean342;

	static {
		aClass124_278 = Class14_Sub2_Sub2.method263(1178, "flash1:");
		aClass124_311 = aClass124_278;
		aClass124_328 = aClass124_278;
	}

	public Class133_Sub7 method209(int var1, int var2, Class46 var3, Class46 var4, int var5) {
		try {
			if (var5 > -29) {
				method213(98, 38, (Class79) null, (byte) -10, -46, (Class133_Sub1_Sub1) null, (Class133_Sub1_Sub2) null,
						-116);
			}

			Class133_Sub7 var7;
			if (this.anIntArray329 != null) {
				Class12 var13 = this.method217((byte) -18);
				if (var13 == null) {
					var7 = null;
					return var7;
				} else {
					var7 = var13.method209(var1, var2, var3, var4, -30);
					return var7;
				}
			} else {
				Class133_Sub7 var6 = (Class133_Sub7) Class37.aClass52_635.method1210((long) this.anInt337);
				if (var6 == null) {
					boolean var8 = false;

					for (int var9 = 0; var9 < this.anIntArray309.length; ++var9) {
						if (!Static.aClass9_429.method158(0, this.anIntArray309[var9], (byte) 109)) {
							var8 = true;
						}
					}

					if (var8) {
						return null;
					}

					Class133_Sub2[] var14 = new Class133_Sub2[this.anIntArray309.length];

					for (int var10 = 0; var10 < this.anIntArray309.length; ++var10) {
						var14[var10] = Class133_Sub2.method1824(Static.aClass9_429, this.anIntArray309[var10], 0);
						if (this.anIntArrayArray316 != null && this.anIntArrayArray316[var10] != null
								&& var14[var10] != null) {
							var14[var10].method1825(this.anIntArrayArray316[var10][0],
									this.anIntArrayArray316[var10][1], this.anIntArrayArray316[var10][2]);
						}
					}

					Class133_Sub2 var15;
					if (var14.length == 1) {
						var15 = var14[0];
					} else {
						var15 = new Class133_Sub2(var14, var14.length);
					}

					int var11;
					if (this.aShortArray319 != null) {
						for (var11 = 0; var11 < this.aShortArray319.length; ++var11) {
							if (this.aByteArray333 != null && var11 < this.aByteArray333.length) {
								var15.method1813(this.aShortArray319[var11],
										Class14_Sub8_Sub39.aShortArray4747[this.aByteArray333[var11] & 255]);
							} else {
								var15.method1813(this.aShortArray319[var11], this.aShortArray317[var11]);
							}
						}
					}

					if (this.aShortArray314 != null) {
						for (var11 = 0; var11 < this.aShortArray314.length; ++var11) {
							var15.method1819(this.aShortArray314[var11], this.aShortArray305[var11]);
						}
					}

					var6 = var15.method1827(this.anInt275 + 64, this.anInt279 + 850, -30, -50, -30);
					((ModelHD) var6).method1895(false, false, false, true, false, false, true);
					Class37.aClass52_635.put(var6, (long) this.anInt337);
				}

				if (var3 != null && var4 != null) {
					var7 = var3.method1178(var1, (byte) 46, var2, var6, var4);
				} else if (var3 == null) {
					if (var4 != null) {
						var7 = var4.method1168((byte) 126, var1, var6);
					} else {
						var7 = var6.method1860(true, true);
					}
				} else {
					var7 = var3.method1168((byte) 122, var2, var6);
				}

				if (this.anInt335 != 128 || this.anInt297 != 128) {
					var7.method1869(this.anInt335, this.anInt297, this.anInt335);
				}

				return var7;
			}
		} catch (Throwable var12) {
			throw Class14_Sub8_Sub14.method554(var12, "bi.D(" + var1 + ',' + var2 + ','
					+ (var3 != null ? "{...}" : "null") + ',' + (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	public static void method210(Class6 class6, int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_,
			boolean bool) {
		int i_21_ = class6.anIntArray164.length;
		for (int i_22_ = 0; i_22_ < i_21_; i_22_++) {
			int i_23_ = class6.anIntArray164[i_22_] - Class4.anInt125;
			int i_24_ = class6.anIntArray158[i_22_] - Static2.anInt2741;
			int i_25_ = class6.anIntArray155[i_22_] - Class14_Sub2_Sub8.anInt3853;
			int i_26_ = i_25_ * i_17_ + i_23_ * i_18_ >> 16;
			i_25_ = i_25_ * i_18_ - i_23_ * i_17_ >> 16;
			i_23_ = i_26_;
			i_26_ = i_24_ * i_16_ - i_25_ * i >> 16;
			i_25_ = i_24_ * i + i_25_ * i_16_ >> 16;
			i_24_ = i_26_;
			if (i_25_ < 50)
				return;
			if (class6.anIntArray168 != null) {
				Class6.anIntArray153[i_22_] = i_23_;
				Class6.anIntArray159[i_22_] = i_24_;
				Class6.anIntArray162[i_22_] = i_25_;
			}
			Class6.anIntArray161[i_22_] = Class3.anInt118 + (i_23_ << 9) / i_25_;
			Class6.anIntArray148[i_22_] = Class3.anInt110 + (i_24_ << 9) / i_25_;
		}
		Class3.anInt116 = 0;
		i_21_ = class6.anIntArray163.length;
		for (int i_27_ = 0; i_27_ < i_21_; i_27_++) {
			int i_28_ = class6.anIntArray163[i_27_];
			int i_29_ = class6.anIntArray149[i_27_];
			int i_30_ = class6.anIntArray165[i_27_];
			int i_31_ = Class6.anIntArray161[i_28_];
			int i_32_ = Class6.anIntArray161[i_29_];
			int i_33_ = Class6.anIntArray161[i_30_];
			int i_34_ = Class6.anIntArray148[i_28_];
			int i_35_ = Class6.anIntArray148[i_29_];
			int i_36_ = Class6.anIntArray148[i_30_];
			if (((i_31_ - i_32_) * (i_36_ - i_35_) - (i_34_ - i_35_) * (i_33_ - i_32_)) > 0 && Class142.aBoolean2299
					&& Class14_Sub8_Sub13.method549((Class14_Sub19.anInt3073 + Class3.anInt118),
							(Class99_Sub2.anInt3334 + Class3.anInt110), i_34_, i_35_, i_36_, i_31_, i_32_, i_33_)) {
				Class66.anInt1039 = i_19_;
				Class14_Sub8_Sub33.anInt4636 = i_20_;
			}
		}
	}

	public static void method211(byte i) {
		if (i > -56)
			method218(-79, 11, -39, 15, -68, -65, 100, -45);
		aShortArray320 = null;
		aClass124_278 = null;
		aClass124_328 = null;
		aClass9_332 = null;
		aByteArrayArray310 = null;
		aClass124_311 = null;
	}

	public boolean method212(byte var1) {
		try {
			if (this.anIntArray329 == null) {
				boolean var5 = this.anInt289 != -1 || this.anInt301 != -1 || this.anInt292 != -1;
				return var5;
			} else {
				if (var1 >= -118) {
					this.method209(-80, -20, (Class46) null, (Class46) null, 21);
				}

				for (int var2 = 0; this.anIntArray329.length > var2; ++var2) {
					if (this.anIntArray329[var2] != -1) {
						Class12 var3 = Class126.method1744(this.anIntArray329[var2], 170);
						if (var3.anInt289 != -1 || var3.anInt301 != -1 || var3.anInt292 != -1) {
							return true;
						}
					}
				}

				return false;
			}
		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "bi.G(" + var1 + ')');
		}
	}

	public static void method213(int i, int i_44_, Class79 class79, byte i_45_, int i_46_,
			Class133_Sub1_Sub1 class133_sub1_sub1, Class133_Sub1_Sub2 class133_sub1_sub2, int i_47_) {
		Class14_Sub3 class14_sub3 = new Class14_Sub3();
		if (i_45_ != -35)
			method221(96, -74, (byte) 85);
		class14_sub3.anInt2767 = i_44_ * 128;
		class14_sub3.anInt2763 = i_46_;
		class14_sub3.anInt2774 = i * 128;
		if (class79 != null) {
			class14_sub3.anInt2772 = class79.anInt1289;
			class14_sub3.aClass79_2747 = class79;
			class14_sub3.anInt2765 = class79.anInt1271 * 128;
			int i_48_ = class79.anInt1227;
			class14_sub3.anInt2769 = class79.anInt1254;
			class14_sub3.anInt2753 = class79.anInt1294;
			class14_sub3.anIntArray2746 = class79.anIntArray1287;
			int i_49_ = class79.anInt1245;
			if (i_47_ == 1 || i_47_ == 3) {
				i_48_ = class79.anInt1245;
				i_49_ = class79.anInt1227;
			}
			class14_sub3.anInt2761 = (i_48_ + i) * 128;
			class14_sub3.anInt2751 = (i_49_ + i_44_) * 128;
			if (class79.anIntArray1276 != null) {
				class14_sub3.aBoolean2757 = true;
				class14_sub3.method452(18631);
			}
			if (class14_sub3.anIntArray2746 != null)
				class14_sub3.anInt2773 = ((int) (Math.random()
						* (double) (-class14_sub3.anInt2772 + class14_sub3.anInt2769)) + class14_sub3.anInt2772);
			Class152.aClass2_2438.method80(class14_sub3);
		} else if (class133_sub1_sub2 != null) {
			class14_sub3.aClass133_Sub1_Sub2_2762 = class133_sub1_sub2;
			Class12 class12 = class133_sub1_sub2.aClass12_4949;
			if (class12.anIntArray329 != null) {
				class14_sub3.aBoolean2757 = true;
				class12 = class12.method217((byte) -18);
			}
			if (class12 != null) {
				class14_sub3.anInt2751 = (class12.anInt334 + i_44_) * 128;
				class14_sub3.anInt2761 = (i + class12.anInt334) * 128;
				class14_sub3.anInt2753 = Class99.method1500(class133_sub1_sub2, -1);
				class14_sub3.anInt2765 = class12.anInt293 * 128;
			}
			Static.aClass2_683.method80(class14_sub3);
		} else if (class133_sub1_sub1 != null) {
			class14_sub3.anInt2751 = (class133_sub1_sub1.anInt3493 + i_44_) * 128;
			class14_sub3.aClass133_Sub1_Sub1_2755 = class133_sub1_sub1;
			class14_sub3.anInt2761 = (class133_sub1_sub1.anInt3493 + i) * 128;
			class14_sub3.anInt2753 = Class116.method1597(false, class133_sub1_sub1);
			class14_sub3.anInt2765 = class133_sub1_sub1.anInt4917 * 128;
			Class88.aClass55_1398.put(class133_sub1_sub1.aClass124_4922.method1692(0), class14_sub3);
		}
	}

	public int method214(int var1, int var2, int var3) {
		try {
			if (this.aClass55_304 == null) {
				return var2;
			} else {
				Class14_Sub1 var4 = (Class14_Sub1) this.aClass55_304.get((long) var3);
				if (var1 < 113) {
					this.aBoolean287 = false;
				}

				if (var4 == null) {
					return var2;
				} else {
					int var5 = var4.anInt2714;
					return var5;
				}
			}
		} catch (Throwable var6) {
			throw Class14_Sub8_Sub14.method554(var6, "bi.H(" + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public Class124 method215(int var1, Class124 var2, int var3) {
		try {
			if (this.aClass55_304 == null) {
				return var2;
			} else if (var1 != -103) {
				return null;
			} else {
				Class14_Sub30 var4 = (Class14_Sub30) this.aClass55_304.get((long) var3);
				if (var4 == null) {
					return var2;
				} else {
					Class124 var5 = var4.aClass124_3270;
					return var5;
				}
			}
		} catch (Throwable var6) {
			throw Class14_Sub8_Sub14.method554(var6,
					"bi.M(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	public void method216(byte i, Buffer class14_sub10, int i_70_) {
		try {
			if (i < -97) {
				if (i_70_ != 1) {
					if (i_70_ != 2) {
						if (i_70_ != 12) {
							if (i_70_ != 13) {
								if (i_70_ != 14) {
									if (i_70_ == 15)
										anInt286 = class14_sub10.method784((byte) 112);
									else if (i_70_ == 16)
										anInt318 = class14_sub10.method784((byte) 125);
									else if (i_70_ == 17) {
										anInt296 = class14_sub10.method784((byte) 103);
										anInt284 = class14_sub10.method784((byte) 116);
										anInt276 = class14_sub10.method784((byte) 105);
										anInt339 = class14_sub10.method784((byte) 113);
									} else if (i_70_ < 30 || i_70_ >= 35) {
										if (i_70_ != 40) {
											if (i_70_ == 41) {
												int i_71_ = class14_sub10.method798();
												aShortArray314 = new short[i_71_];
												aShortArray305 = new short[i_71_];
												for (int i_72_ = 0; i_71_ > i_72_; i_72_++) {
													aShortArray314[i_72_] = (short) (class14_sub10
															.method784((byte) 108));
													aShortArray305[i_72_] = (short) (class14_sub10
															.method784((byte) 119));
												}
											} else if (i_70_ == 42) {
												int i_73_ = class14_sub10.method798();
												aByteArray333 = new byte[i_73_];
												for (int i_74_ = 0; i_74_ < i_73_; i_74_++)
													aByteArray333[i_74_] = (class14_sub10.method780((byte) -77));
											} else if (i_70_ != 60) {
												if (i_70_ == 93)
													aBoolean342 = false;
												else if (i_70_ != 95) {
													if (i_70_ != 97) {
														if (i_70_ == 98)
															anInt297 = (class14_sub10.method784((byte) 119));
														else if (i_70_ != 99) {
															if (i_70_ == 100)
																anInt275 = (class14_sub10.method780((byte) -77));
															else if (i_70_ != 101) {
																if (i_70_ == 102)
																	anInt306 = (class14_sub10.method784((byte) 111));
																else if (i_70_ == 103)
																	anInt303 = (class14_sub10.method784((byte) 121));
																else if ((i_70_ == 106) || (i_70_ == 118)) {
																	anInt326 = (class14_sub10.method784((byte) 116));
																	if (anInt326 == 65535)
																		anInt326 = -1;
																	int i_75_ = -1;
																	anInt277 = (class14_sub10.method784((byte) 125));
																	if (anInt277 == 65535)
																		anInt277 = -1;
																	if (i_70_ == 118) {
																		i_75_ = class14_sub10.method784((byte) 106);
																		if (i_75_ == 65535)
																			i_75_ = -1;
																	}
																	int i_76_ = (class14_sub10.method798());
																	anIntArray329 = (new int[(i_76_ + 2)]);
																	for (int i_77_ = 0; (i_77_ <= i_76_); i_77_++) {
																		anIntArray329[i_77_] = class14_sub10
																				.method784((byte) 117);
																		if (anIntArray329[i_77_] == 65535)
																			anIntArray329[i_77_] = -1;
																	}
																	anIntArray329[(i_76_ + 1)] = i_75_;
																} else if (i_70_ == 107)
																	aBoolean308 = false;
																else if (i_70_ == 109)
																	aBoolean287 = false;
																else if (i_70_ == 111)
																	aBoolean330 = false;
																else if (i_70_ == 113) {
																	aShort313 = (short) class14_sub10
																			.method784((byte) 125);
																	aShort285 = (short) class14_sub10
																			.method784((byte) 123);
																} else if (i_70_ == 114) {
																	aByte321 = (class14_sub10.method780((byte) -77));
																	aByte331 = (class14_sub10.method780((byte) -77));
																} else if (i_70_ != 115) {
																	if (i_70_ == 119)
																		aByte290 = class14_sub10.method780((byte) -77);
																	else if (i_70_ == 120) {
																		anInt289 = class14_sub10.method784((byte) 126);
																		anInt301 = class14_sub10.method784((byte) 121);
																		anInt292 = class14_sub10.method784((byte) 109);
																		anInt293 = class14_sub10.method798();
																	} else if (i_70_ == 121) {
																		anIntArrayArray316 = new int[anIntArray309.length][];
																		int i_78_ = class14_sub10.method798();
																		for (int i_79_ = 0; i_78_ > i_79_; i_79_++) {
																			int i_80_ = class14_sub10.method798();
																			int[] is = anIntArrayArray316[i_80_] = new int[3];
																			is[0] = class14_sub10.method780((byte) -77);
																			is[1] = class14_sub10.method780((byte) -77);
																			is[2] = class14_sub10.method780((byte) -77);
																		}
																	} else if (i_70_ == 122)
																		anInt281 = class14_sub10.method784((byte) 113);
																	else if (i_70_ == 249) {
																		int i_81_ = class14_sub10.method798();
																		if (aClass55_304 == null) {
																			int i_82_ = Class14_Sub8_Sub33
																					.method653(i_81_);
																			aClass55_304 = new HashTable(i_82_);
																		}
																		for (int i_83_ = 0; i_83_ < i_81_; i_83_++) {
																			boolean bool = class14_sub10
																					.method798() == 1;
																			int i_84_ = class14_sub10.method829(-127);
																			Linkable linkable;
																			if (bool)
																				linkable = new Class14_Sub30(
																						class14_sub10.method797(9467));
																			else
																				linkable = new Class14_Sub1(
																						class14_sub10.method812(
																								(byte) -127));
																			aClass55_304.put((long) i_84_, linkable);
																		}
																	}
																} else {
																	aShort280 = (short) (class14_sub10.method798() * 4);
																	aShort315 = (short) (class14_sub10.method798() * 4);
																}
															} else
																anInt279 = ((class14_sub10.method780((byte) -77)) * 5);
														} else
															aBoolean307 = true;
													} else
														anInt335 = (class14_sub10.method784((byte) 121));
												} else
													anInt295 = (class14_sub10.method784((byte) 125));
											} else {
												int i_85_ = class14_sub10.method798();
												anIntArray338 = new int[i_85_];
												for (int i_86_ = 0; i_86_ < i_85_; i_86_++)
													anIntArray338[i_86_] = (class14_sub10.method784((byte) 126));
											}
										} else {
											int i_87_ = class14_sub10.method798();
											aShortArray319 = new short[i_87_];
											aShortArray317 = new short[i_87_];
											for (int i_88_ = 0; i_88_ < i_87_; i_88_++) {
												aShortArray319[i_88_] = (short) (class14_sub10.method784((byte) 106));
												aShortArray317[i_88_] = (short) (class14_sub10.method784((byte) 123));
											}
										}
									} else {
										aClass124Array291[i_70_ - 30] = class14_sub10.method797(9467);
										if (aClass124Array291[i_70_ - 30].method1717(40,
												Class14_Sub9_Sub1.aClass124_4808))
											aClass124Array291[i_70_ - 30] = null;
									}
								} else
									anInt296 = class14_sub10.method784((byte) 108);
							} else
								anInt323 = class14_sub10.method784((byte) 121);
						} else
							anInt334 = class14_sub10.method798();
					} else
						aClass124_302 = class14_sub10.method797(9467);
				} else {
					int i_89_ = class14_sub10.method798();
					anIntArray309 = new int[i_89_];
					for (int i_90_ = 0; i_89_ > i_90_; i_90_++)
						anIntArray309[i_90_] = class14_sub10.method784((byte) 120);
				}
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable, new StringBuilder("bi.N(").append(i).append(',')
					.append(class14_sub10 != null ? "{...}" : "null").append(',').append(i_70_).append(')').toString());
		}
	}

	public Class12 method217(byte var1) {
		try {
			if (var1 != -18) {
				Object var6 = null;
				return (Class12) var6;
			} else {
				int var2 = -1;
				if (this.anInt326 != -1) {
					var2 = Class104.method1534(this.anInt326, var1 + 143);
				} else if (this.anInt277 != -1) {
					var2 = Class14_Sub8_Sub11.anIntArray4275[this.anInt277];
				}

				if (var2 >= 0 && this.anIntArray329.length - 1 > var2 && this.anIntArray329[var2] != -1) {
					Class12 var7 = Class126.method1744(this.anIntArray329[var2], var1 + 188);
					return var7;
				} else {
					int var3 = this.anIntArray329[this.anIntArray329.length - 1];
					Class12 var4;
					if (var3 == -1) {
						var4 = null;
						return var4;
					} else {
						var4 = Class126.method1744(var3, 170);
						return var4;
					}
				}
			}
		} catch (Throwable var5) {
			throw Class14_Sub8_Sub14.method554(var5, "bi.A(" + var1 + ')');
		}
	}

	public static void method218(int i, int i_105_, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_,
			int i_111_) {
		try {
			if (Class126.method1741((byte) -113, i_108_)) {
				if (i != -30776)
					aClass124_328 = null;
				client.method55(Class1.aClass94ArrayArray75[i_108_], -1, i_110_, i_107_, i_111_, i_105_, i_106_,
						i_109_);
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable,
					new StringBuilder("bi.K(").append(i).append(',').append(i_105_).append(',').append(i_106_)
							.append(',').append(i_107_).append(',').append(i_108_).append(',').append(i_109_)
							.append(',').append(i_110_).append(',').append(i_111_).append(')').toString());
		}
	}

	public boolean method219(int var1) {
		try {
			if (this.anIntArray329 == null) {
				boolean var6 = true;
				return var6;
			} else {
				int var2 = var1;
				if (this.anInt326 == -1) {
					if (this.anInt277 != -1) {
						var2 = Class14_Sub8_Sub11.anIntArray4275[this.anInt277];
					}
				} else {
					var2 = Class104.method1534(this.anInt326, 118);
				}

				if (var2 >= 0 && var2 < this.anIntArray329.length - 1 && this.anIntArray329[var2] != -1) {
					boolean var7 = true;
					return var7;
				} else {
					int var3 = this.anIntArray329[this.anIntArray329.length - 1];
					boolean var4;
					if (var3 == -1) {
						var4 = false;
						return var4;
					} else {
						var4 = true;
						return var4;
					}
				}
			}
		} catch (Throwable var5) {
			throw Class14_Sub8_Sub14.method554(var5, "bi.I(" + var1 + ')');
		}
	}

	public void method220(Buffer var1, boolean var2) {
		while (true) {
			int var3 = var1.method798();
			if (var3 == 0) {
				if (!var2) {
					method213(-95, 93, (Class79) null, (byte) 88, 89, (Class133_Sub1_Sub1) null,
							(Class133_Sub1_Sub2) null, -46);
				}

				return;
			}

			this.method216((byte) -105, var1, var3);
		}
	}

	public static int method221(int var0, int var1, byte var2) {
		try {
			int var3;
			for (var3 = 1; var0 > 1; var1 *= var1) {
				if ((var0 & 1) != 0) {
					var3 *= var1;
				}

				var0 >>= 1;
			}

			if (var2 != -96) {
				aByteArrayArray310 = null;
			}

			if (var0 == 1) {
				int var4 = var1 * var3;
				return var4;
			} else {
				return var3;
			}
		} catch (Throwable var5) {
			throw Class14_Sub8_Sub14.method554(var5, "bi.P(" + var0 + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static Class129 method222(int i) {
		Class129 class129;
		try {
			if (i != -18108)
				aByteArrayArray310 = null;
			class129 = (Class129) Class.forName("rs.Class129_Sub1").newInstance();
		} catch (Throwable throwable) {
			Class129 class129_132_ = null;
			return class129_132_;
		}
		return class129;
	}

	public void method223(byte i) {
		if (i <= 94)
			anInt306 = 73;
	}

	public Class133_Sub7 method224(byte var1, Class46 var2, int var3) {
		try {
			if (this.anIntArray329 != null) {
				Class12 var11 = this.method217((byte) -18);
				Class133_Sub7 var10;
				if (var11 == null) {
					var10 = null;
					return var10;
				} else {
					var10 = var11.method224((byte) -117, var2, var3);
					return var10;
				}
			} else {
				Class133_Sub7 var4;
				if (this.anIntArray338 == null) {
					var4 = null;
					return var4;
				} else {
					var4 = (Class133_Sub7) Class14_Sub8_Sub6.aClass52_4186.method1210((long) this.anInt337);
					if (var1 > -93) {
						this.anInt279 = 41;
					}

					if (var4 == null) {
						boolean var5 = false;

						for (int var6 = 0; this.anIntArray338.length > var6; ++var6) {
							if (!Static.aClass9_429.method158(0, this.anIntArray338[var6], (byte) -121)) {
								var5 = true;
							}
						}

						if (var5) {
							return null;
						}

						Class133_Sub2[] var12 = new Class133_Sub2[this.anIntArray338.length];

						for (int var7 = 0; this.anIntArray338.length > var7; ++var7) {
							var12[var7] = Class133_Sub2.method1824(Static.aClass9_429, this.anIntArray338[var7], 0);
						}

						Class133_Sub2 var13;
						if (1 != var12.length) {
							var13 = new Class133_Sub2(var12, var12.length);
						} else {
							var13 = var12[0];
						}

						int var8;
						if (this.aShortArray319 != null) {
							for (var8 = 0; this.aShortArray319.length > var8; ++var8) {
								if (this.aByteArray333 != null && var8 < this.aByteArray333.length) {
									var13.method1813(this.aShortArray319[var8],
											Class14_Sub8_Sub39.aShortArray4747[this.aByteArray333[var8] & 255]);
								} else {
									var13.method1813(this.aShortArray319[var8], this.aShortArray317[var8]);
								}
							}
						}

						if (this.aShortArray314 != null) {
							for (var8 = 0; this.aShortArray314.length > var8; ++var8) {
								var13.method1819(this.aShortArray314[var8], this.aShortArray305[var8]);
							}
						}

						var4 = var13.method1827(64, 768, -50, -10, -50);
						Class14_Sub8_Sub6.aClass52_4186.put(var4, (long) this.anInt337);
					}

					if (var2 != null) {
						var4 = var2.method1167(var3, '\uffff', var4);
					}

					return var4;
				}
			}
		} catch (Throwable var9) {
			throw Class14_Sub8_Sub14.method554(var9,
					"bi.E(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ',' + var3 + ')');
		}
	}

	public Class12() {
		anInt277 = -1;
		anInt289 = -1;
		anInt279 = 0;
		anInt303 = 32;
		anInt293 = 0;
		anInt306 = -1;
		aByte290 = (byte) 0;
		aClass124Array291 = new Class124[5];
		anInt275 = 0;
		aBoolean307 = false;
		anInt295 = -1;
		aBoolean308 = true;
		anInt281 = -1;
		anInt286 = -1;
		aClass124_302 = Class125_Sub3.aClass124_3412;
		aShort285 = (short) 0;
		aByte321 = (byte) -96;
		anInt284 = -1;
		anInt323 = -1;
		aBoolean330 = true;
		anInt292 = -1;
		anInt318 = -1;
		anInt301 = -1;
		anInt276 = -1;
		aShort280 = (short) 0;
		anInt335 = 128;
		anInt334 = 1;
		aShort313 = (short) 0;
		anInt326 = -1;
		aShort315 = (short) 0;
		anInt339 = -1;
		aByte331 = (byte) -16;
		anInt297 = 128;
		aBoolean342 = true;
	}
}
