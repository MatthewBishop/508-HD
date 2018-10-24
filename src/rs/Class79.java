/* Class79 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.io.js5.SFSS;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class14_Sub1;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.Class25;

public class Class79 {
	public int anInt1226;
	public int anInt1227;
	public boolean aBoolean1228 = false;
	public int anInt1229 = 2;
	public short[] aShortArray1231;
	public int anInt1233;
	public short[] aShortArray1235;
	public int anInt1238;
	public int anInt1239;
	public static int anInt1240;
	public boolean aBoolean1241;
	public int anInt1242;
	public int anInt1243;
	public int anInt1244;
	public int anInt1245;
	public int anInt1246;
	public static short[][][] aShortArrayArrayArray1247;
	public boolean aBoolean1248;
	public int anInt1250;
	public int anInt1251 = -1;
	public int anInt1252;
	public boolean aBoolean1253;
	public int anInt1254;
	public static Class124 aClass124_1255;
	public int[] anIntArray1256;
	public int anInt1257;
	public boolean aBoolean1258;
	public boolean aBoolean1259;
	public int[] anIntArray1260;
	public static Class146 aClass146_1261;
	public int anInt1262;
	public short[] aShortArray1263;
	public boolean aBoolean1264;
	public static Class124 aClass124_1265 = Class124.method263(1178, "(Z");
	public HashTable aClass55_1266;
	public static Deque aClass2_1268;
	public boolean aBoolean1270;
	public int anInt1271;
	public boolean aBoolean1272;
	public int anInt1274;
	public int[] anIntArray1276;
	public int anInt1278;
	public int anInt1279;
	public int anInt1281;
	public Class124[] aClass124Array1282;
	public boolean aBoolean1283;
	public byte aByte1286;
	public int[] anIntArray1287;
	public int anInt1289;
	public Class124 aClass124_1290;
	public short[] aShortArray1291;
	public int anInt1292;
	public int anInt1294;
	public boolean aBoolean1296;
	public byte[] aByteArray1297;
	public static Class124 aClass124_1298;
	public boolean aBoolean1299;
	public boolean aBoolean1301;
	public boolean aBoolean1302;
	public short aShort1304;
	public static int[] anIntArray1305;
	public static Class124 aClass124_1306;

	static {
		anInt1240 = 0;
		aClass124_1298 = Class124.method263(1178, "Discard");
		aClass124_1255 = aClass124_1298;
		aClass2_1268 = new Deque();
		anIntArray1305 = new int[1000];
		aClass124_1306 = Class124.method263(1178, "event_opbase");
	}

	public void method1374(int i, Buffer class14_sub10) {
		if (i != -31564)
			anInt1262 = 32;
		for (;;) {
			int i_0_ = class14_sub10.readUByte();
			if (i_0_ == 0)
				break;
			method1389(i_0_, class14_sub10);
		}
	}

	public static void method1375(int i, Class94 class94, int i_1_, int i_2_, int i_3_) {
		Class25.method999(i_2_, i, i_2_ + class94.anInt1518, i + class94.anInt1545);
		if (i_3_ == 2) {
			if (JunkTex.anInt4633 < 3)
				((AbstractSprite_Sub2) JunkTex.aClass14_Sub2_Sub19_4508).method420(i_2_, i,
						class94.anInt1518, class94.anInt1545, JunkTex.aClass14_Sub2_Sub19_4508.width / 2,
						JunkTex.aClass14_Sub2_Sub19_4508.height / 2, JunkTex.anInt4408, 256,
						(AbstractSprite_Sub2) class94.method1476(false, (byte) 61));
			else {
				AbstractSprite class14_sub2_sub19 = class94.method1476(false, (byte) 61);
				if (class14_sub2_sub19 != null)
					class14_sub2_sub19.drawReg(i_2_, i);
			}
			Class7_Sub2_Sub1.aBooleanArray3703[i_1_] = true;
		}
	}

	public ModelHD method1376(int i, int i_4_, boolean bool, int i_5_) {
		Object object = null;
		int i_6_ = 64 + anInt1233;
		int i_7_ = anInt1238 * 5 + 768;
		ModelHD modelhd;
		if (anIntArray1256 == null) {
			if (i_5_ != 10) {
				ModelHD modelhd_8_ = null;
				return modelhd_8_;
			}
			if (anIntArray1260 == null) {
				ModelHD modelhd_9_ = null;
				return modelhd_9_;
			}
			int i_10_ = anIntArray1260.length;
			if (i_10_ == 0) {
				ModelHD modelhd_11_ = null;
				return modelhd_11_;
			}
			long l = 0L;
			for (int i_12_ = 0; i_12_ < i_10_; i_12_++)
				l = anIntArray1260[i_12_] + l * 67783L;
			if (bool)
				l ^= 0xffffffffffffffffL;
			modelhd = (ModelHD) Class112.aClass52_1868.get(l);
			if (modelhd == null) {
				Class133_Sub2 class133_sub2 = null;
				for (int i_13_ = 0; i_10_ > i_13_; i_13_++) {
					class133_sub2 = Class133_Sub2.method1824(Static2.aClass9_2923,
							(anIntArray1260[i_13_] & 0xffff), 0);
					if (class133_sub2 == null)
						return null;
					if (i_10_ > 1)
						Class74.aClass133_Sub2Array1134[i_13_] = class133_sub2;
				}
				if (i_10_ > 1)
					class133_sub2 = new Class133_Sub2(Class74.aClass133_Sub2Array1134, i_10_);
				modelhd = new ModelHD(class133_sub2, i_6_, i_7_, bool);
				Class112.aClass52_1868.put(modelhd, l);
			}
		} else {
			int i_14_ = -1;
			for (int i_15_ = 0; i_15_ < anIntArray1256.length; i_15_++) {
				if (i_5_ == anIntArray1256[i_15_]) {
					i_14_ = i_15_;
					break;
				}
			}
			if (i_14_ == -1)
				return null;
			int i_16_ = anIntArray1260[i_14_];
			if (bool)
				i_16_ += 65536;
			modelhd = (ModelHD) Class112.aClass52_1868.get(i_16_);
			if (modelhd == null) {
				Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(Static2.aClass9_2923, i_16_ & 0xffff, 0);
				if (class133_sub2 == null) {
					ModelHD modelhd_17_ = null;
					return modelhd_17_;
				}
				modelhd = new ModelHD(class133_sub2, i_6_, i_7_, bool);
				Class112.aClass52_1868.put(modelhd, i_16_);
			}
		}
		boolean bool_18_ = aBoolean1301;
		if (i_5_ == 2 && i > 3)
			bool_18_ = !bool_18_;
		boolean bool_19_ = anInt1252 == 128 && anInt1226 == 0;
		boolean bool_20_ = (i == 0 && anInt1239 == 128 && anInt1292 == 128 && anInt1279 == 0 && anInt1274 == 0
				&& !bool_18_);
		ModelHD modelhd_21_ = modelhd.method1903(bool_20_, bool_19_, aShortArray1235 == null, true,
				i_6_ == modelhd.method1896(), i_4_ == i && !bool_18_, true, modelhd.method1910() == i_7_, true,
				!bool_18_, aShortArray1291 == null);
		if (bool_18_)
			modelhd_21_.method1912();
		if (i_5_ == 4 && i > 3) {
			modelhd_21_.method1915(256);
			modelhd_21_.method1855(45, 0, -45);
		}
		i &= 0x3;
		if (i != 1) {
			if (i == 2)
				modelhd_21_.method1899();
			else if (i == 3)
				modelhd_21_.method1890();
		} else
			modelhd_21_.method1918();
		if (aShortArray1235 != null) {
			for (int i_22_ = 0; i_22_ < aShortArray1235.length; i_22_++)
				modelhd_21_.method1919(aShortArray1235[i_22_], aShortArray1231[i_22_]);
		}
		if (aShortArray1291 != null) {
			for (int i_23_ = 0; i_23_ < aShortArray1291.length; i_23_++)
				modelhd_21_.method1906(aShortArray1291[i_23_], aShortArray1263[i_23_]);
		}
		if (anInt1239 != 128 || anInt1252 != 128 || anInt1292 != 128)
			modelhd_21_.method1869(anInt1239, anInt1252, anInt1292);
		if (anInt1279 != 0 || anInt1226 != 0 || anInt1274 != 0)
			modelhd_21_.method1855(anInt1279, anInt1226, anInt1274);
		if (i_6_ != modelhd_21_.method1896())
			modelhd_21_.method1892(i_6_);
		if (i_7_ != modelhd_21_.method1910())
			modelhd_21_.method1900(i_7_);
		return modelhd_21_;
	}

	public static Class79 method1377(byte i, int i_24_) {
		Class79 class79 = ((Class79) Class127.aClass52_2112.get(i_24_));
		if (class79 != null) {
			Class79 class79_25_ = class79;
			return class79_25_;
		}
		byte[] is = Class15.aClass9_382.method163(JunkTex.method492(11604, i_24_),
				Class14_Sub29.method932(i_24_, 21661));
		Class79 class79_26_ = new Class79();
		class79_26_.anInt1257 = i_24_;
		if (is != null)
			class79_26_.method1374(i - 31458, new Buffer(is));
		class79_26_.method1385(80);
		if (class79_26_.aBoolean1302) {
			class79_26_.aBoolean1248 = false;
			class79_26_.anInt1229 = 0;
		}
		if (!JunkTex.aBoolean3375 && class79_26_.aBoolean1259)
			class79_26_.aClass124Array1282 = null;
		Class127.aClass52_2112.put(class79_26_, i_24_);
		if (i != -106) {
			class79 = null;
			return class79;
		}
		class79 = class79_26_;
		return class79;
	}

	public static int method1378(int i, int i_27_) {
		if (i_27_ != 5823)
			aClass124_1306 = null;
		int i_28_ = i & 0xff;
		return i_28_;
	}

	public boolean method1379(int i) {
		if (anIntArray1260 == null) {
			boolean bool = true;
			return bool;
		}
		boolean bool = true;
		for (int i_29_ = 0; i_29_ < anIntArray1260.length; i_29_++)
			bool &= Static2.aClass9_2923.method158(0, (anIntArray1260[i_29_] & 0xffff));
		if (i <= 29)
			aBoolean1302 = false;
		boolean bool_30_ = bool;
		return bool_30_;
	}

	public static void method1380(boolean bool) {
		anIntArray1305 = null;
		aClass124_1265 = null;
		aClass124_1306 = null;
		aClass124_1255 = null;
		if (bool) {
			aClass124_1298 = null;
			aShortArrayArrayArray1247 = null;
			aClass146_1261 = null;
			aClass2_1268 = null;
		}
	}

	public boolean method1381(byte i, int i_31_) {
		if (i >= 0) {
			boolean bool = true;
			return bool;
		}
		if (anIntArray1256 != null) {
			for (int i_32_ = 0; i_32_ < anIntArray1256.length; i_32_++) {
				if (i_31_ == anIntArray1256[i_32_])
					return (Static2.aClass9_2923.method158(0, anIntArray1260[i_32_] & 0xffff));
			}
			return true;
		}
		if (anIntArray1260 == null) {
			boolean bool = true;
			return bool;
		}
		if (i_31_ != 10) {
			boolean bool = true;
			return bool;
		}
		boolean bool = true;
		for (int i_33_ = 0; anIntArray1260.length > i_33_; i_33_++)
			bool &= Static2.aClass9_2923.method158(0, (anIntArray1260[i_33_] & 0xffff));
		boolean bool_34_ = bool;
		return bool_34_;
	}

	public static int method1382(int ia, int i_35_) {
		int i_36_ = i_35_ & 0x3f;
		int i_37_ = i_35_ >> 38 & 0x3;
		if (i_36_ == 18) {
			if (i_37_ == 0) {
				int i_38_ = 1;
				return i_38_;
			}
			if (i_37_ == 1) {
				int i_39_ = 2;
				return i_39_;
			}
			if (i_37_ == 2) {
				int i_40_ = 4;
				return i_40_;
			}
			if (i_37_ == 3) {
				int i_41_ = 8;
				return i_41_;
			}
		} else if (i_36_ == 19 || i_36_ == 21) {
			if (i_37_ == 0) {
				int i_42_ = 16;
				return i_42_;
			}
			if (i_37_ == 1) {
				int i_43_ = 32;
				return i_43_;
			}
			if (i_37_ == 2) {
				int i_44_ = 64;
				return i_44_;
			}
			if (i_37_ == 3) {
				int i_45_ = 128;
				return i_45_;
			}
		}
		i_36_ = 0;
		return i_36_;
	}

	public Class86 method1383(int i, int i_46_, int[][] is, int[][] is_47_, boolean bool, int i_48_, boolean bool_49_,
			boolean bool_50_, Class148_Sub1 class148_sub1, int i_51_, int i_52_) {
		long l;
		if (anIntArray1256 == null)
			l = i_48_ + (anInt1257 << 42);
		else
			l = i_48_ + (anInt1257 << 10) + (i_46_ << 3);
		Class86 class86 = (Class86) Class62.aClass52_991.get(l);
		ModelHD modelhd;
		Class148_Sub1 class148_sub1_53_;
		if (class86 != null) {
			class148_sub1_53_ = class86.aClass148_Sub1_1386;
			modelhd = (ModelHD) class86.aClass133_1379;
		} else {
			modelhd = method1376(i_48_, 0, false, i_46_);
			if (modelhd == null) {
				JunkTex.aClass86_4351.aClass133_1379 = null;
				JunkTex.aClass86_4351.aClass148_Sub1_1386 = null;
				Class86 class86_54_ = JunkTex.aClass86_4351;
				return class86_54_;
			}
			if (i_46_ == 10 && i_48_ > 3)
				modelhd.method1874(256);
			if (bool_50_)
				class148_sub1_53_ = modelhd.method1889(class148_sub1);
			else
				class148_sub1_53_ = null;
			Class86 class86_55_ = new Class86();
			class86_55_.aClass133_1379 = modelhd;
			class86_55_.aClass148_Sub1_1386 = class148_sub1_53_;
			Class62.aClass52_991.put(class86_55_, l);
		}
		boolean bool_56_ = bool & aBoolean1241;
		ModelHD modelhd_57_ = modelhd.method1903(aByte1286 != 3, aByte1286 == 0, bool_49_, true, true, true, !bool_56_,
				true, true, true, true);
		if (aByte1286 != 0)
			modelhd_57_.method1897(aByte1286, aShort1304, modelhd, is, is_47_, i_51_, i, i_52_);
		modelhd_57_.method1895(anInt1250 == 0, true, true, true, anInt1250 == 0, true, false);
		JunkTex.aClass86_4351.aClass133_1379 = modelhd_57_;
		JunkTex.aClass86_4351.aClass148_Sub1_1386 = class148_sub1_53_;
		modelhd_57_.aBoolean5009 = bool_56_;
		return JunkTex.aClass86_4351;
	}

	public Class86 method1384(int i, int i_58_, int i_59_, int[][] is, int i_60_, int i_61_, boolean bool,
			Class148_Sub1 class148_sub1, int i_62_, int[][] is_63_, Animation animation, int i_64_) {
		long l;
		if (anIntArray1256 == null)
			l = (anInt1257 << 10) + i_61_;
		else
			l = i_61_ + (anInt1257 << 10) + (i_58_ << 35);
		ModelHD modelhd = (ModelHD) Static2.aClass52_810.get(l);
		if (i_64_ != 0) {
			Class86 class86 = null;
			return class86;
		}
		if (modelhd == null) {
			modelhd = method1376(i_61_, 0, true, i_58_);
			if (modelhd == null) {
				Class86 class86 = null;
				return class86;
			}
			modelhd.method1913();
			modelhd.method1895(false, false, false, true, false, false, true);
			Static2.aClass52_810.put(modelhd, l);
		}
		ModelHD modelhd_65_ = modelhd;
		boolean bool_66_ = false;
		if (animation != null) {
			bool_66_ = true;
			modelhd_65_ = (ModelHD) animation.method1177((byte) -21, i_61_, i_59_, modelhd_65_);
		}
		if (i_58_ == 10 && i_61_ > 3) {
			if (!bool_66_) {
				modelhd_65_ = (ModelHD) modelhd_65_.method1860(true, true);
				bool_66_ = true;
			}
			modelhd_65_.method1874(256);
		}
		if (!bool)
			JunkTex.aClass86_4351.aClass148_Sub1_1386 = null;
		else
			JunkTex.aClass86_4351.aClass148_Sub1_1386 = modelhd_65_.method1889(class148_sub1);
		if (aByte1286 != 0) {
			if (!bool_66_) {
				bool_66_ = true;
				modelhd_65_ = (ModelHD) modelhd_65_.method1860(true, true);
			}
			modelhd_65_.method1897(aByte1286, aShort1304, modelhd, is_63_, is, i_60_, i, i_62_);
		}
		JunkTex.aClass86_4351.aClass133_1379 = modelhd_65_;
		return JunkTex.aClass86_4351;
	}

	public void method1385(int i) {
		if (anInt1250 == -1) {
			anInt1250 = 0;
			if (anIntArray1260 != null && (anIntArray1256 == null || anIntArray1256[0] == 10))
				anInt1250 = 1;
			for (int i_67_ = 0; i_67_ < 5; i_67_++) {
				if (aClass124Array1282[i_67_] != null) {
					anInt1250 = 1;
					break;
				}
			}
		}
		if (anInt1242 == -1)
			anInt1242 = anInt1229 != 0 ? 1 : 0;
		if (i < 18)
			method1392(-64);
	}

	public int method1388(int i, int i_91_, int i_92_) {
		int i_93_ = -109 % ((i_92_ + 15) / 46);
		if (aClass55_1266 == null) {
			int i_94_ = i_91_;
			return i_94_;
		}
		Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass55_1266.get(i);
		if (class14_sub1 == null) {
			i_93_ = i_91_;
			return i_93_;
		}
		i_93_ = class14_sub1.anInt2714;
		return i_93_;
	}

	public void method1389(int i, Buffer class14_sub10) {
		if (i == 1) {
			int i_96_ = class14_sub10.readUByte();
			if (i_96_ > 0) {
				if (anIntArray1260 == null || JunkTex.aBoolean2539) {
					anIntArray1256 = new int[i_96_];
					anIntArray1260 = new int[i_96_];
					for (int i_97_ = 0; i_96_ > i_97_; i_97_++) {
						anIntArray1260[i_97_] = class14_sub10.readUShort();
						anIntArray1256[i_97_] = class14_sub10.readUByte();
					}
				} else
					class14_sub10.position += i_96_ * 3;
			}
		} else if (i != 2) {
			if (i == 5) {
				int i_98_ = class14_sub10.readUByte();
				if (i_98_ > 0) {
					if (anIntArray1260 == null || JunkTex.aBoolean2539) {
						anIntArray1256 = null;
						anIntArray1260 = new int[i_98_];
						for (int i_99_ = 0; i_98_ > i_99_; i_99_++)
							anIntArray1260[i_99_] = class14_sub10.readUShort();
					} else
						class14_sub10.position += i_98_ * 2;
				}
			} else if (i == 14)
				anInt1227 = class14_sub10.readUByte();
			else if (i != 15) {
				if (i != 17) {
					if (i != 18) {
						if (i != 19) {
							if (i == 21)
								aByte1286 = (byte) 1;
							else if (i != 22) {
								if (i != 23) {
									if (i != 24) {
										if (i == 27)
											anInt1229 = 1;
										else if (i != 28) {
											if (i == 29)
												anInt1233 = (class14_sub10.method780());
											else if (i == 39)
												anInt1238 = (class14_sub10.method780()) * 5;
											else if (i < 30 || i >= 35) {
												if (i != 40) {
													if (i == 41) {
														int i_100_ = class14_sub10.readUByte();
														aShortArray1263 = (new short[i_100_]);
														aShortArray1291 = (new short[i_100_]);
														for (int i_101_ = 0; i_101_ < i_100_; i_101_++) {
															aShortArray1291[i_101_] = (short) (class14_sub10
																	.readUShort((byte) 124));
															aShortArray1263[i_101_] = (short) (class14_sub10
																	.readUShort((byte) 114));
														}
													} else if (i != 42) {
														if (i != 60) {
															if (i != 62) {
																if (i != 64) {
																	if (i == 65)
																		anInt1239 = class14_sub10.readUShort();
																	else if (i != 66) {
																		if (i == 67)
																			anInt1292 = class14_sub10
																					.readUShort();
																		else if (i != 68) {
																			if (i != 69) {
																				if (i != 70) {
																					if (i != 71) {
																						if (i != 72) {
																							if (i != 73) {
																								if (i != 74) {
																									if (i != 75) {
																										if (i != 77
																												&& i != 92) {
																											if (i == 78) {
																												anInt1294 = class14_sub10
																														.readUShort();
																												anInt1271 = class14_sub10
																														.readUByte();
																											} else if (i == 79) {
																												anInt1289 = class14_sub10
																														.readUShort();
																												anInt1254 = class14_sub10
																														.readUShort();
																												anInt1271 = class14_sub10
																														.readUByte();
																												int i_102_ = class14_sub10
																														.readUByte();
																												anIntArray1287 = new int[i_102_];
																												for (int i_103_ = 0; i_102_ > i_103_; i_103_++)
																													anIntArray1287[i_103_] = class14_sub10
																															.readUShort();
																											} else if (i != 81) {
																												if (i != 82) {
																													if (i == 88)
																														aBoolean1253 = false;
																													else if (i != 89) {
																														if (i != 90) {
																															if (i == 91)
																																aBoolean1259 = true;
																															else if (i == 93) {
																																aByte1286 = (byte) 3;
																																aShort1304 = (short) class14_sub10
																																		.readUShort();
																															} else if (i == 94)
																																aByte1286 = (byte) 4;
																															else if (i == 95)
																																aByte1286 = (byte) 5;
																															else if (i != 96) {
																																if (i != 97) {
																																	if (i == 249) {
																																		int i_104_ = class14_sub10
																																				.readUByte();
																																		if (aClass55_1266 == null) {
																																			int i_105_ = JunkTex
																																					.method653(
																																							i_104_);
																																			aClass55_1266 = new HashTable(
																																					i_105_);
																																		}
																																		for (int i_106_ = 0; i_104_ > i_106_; i_106_++) {
																																			boolean bool = class14_sub10
																																					.readUByte() == 1;
																																			int i_107_ = class14_sub10
																																					.method829(
																																							35 - 147);
																																			Linkable linkable;
																																			if (!bool)
																																				linkable = new Class14_Sub1(
																																						class14_sub10
																																								.getInt(
																																										(byte) -108));
																																			else
																																				linkable = new Class14_Sub30(
																																						class14_sub10
																																								.method797(
																																										9467));
																																			aClass55_1266
																																					.put(
																																							i_107_,
																																							linkable);
																																		}
																																	}
																																} else
																																	aBoolean1264 = true;
																															} else
																																aBoolean1283 = true;
																														} else
																															aBoolean1299 = true;
																													} else
																														aBoolean1258 = false;
																												} else
																													aBoolean1272 = true;
																											} else {
																												aByte1286 = (byte) 2;
																												aShort1304 = (short) (class14_sub10
																														.readUByte()
																														* 256);
																											}
																										} else {
																											anInt1243 = class14_sub10
																													.readUShort();
																											if (anInt1243 == 65535)
																												anInt1243 = -1;
																											anInt1251 = class14_sub10
																													.readUShort();
																											if (anInt1251 == 65535)
																												anInt1251 = -1;
																											int i_108_ = -1;
																											if (i == 92) {
																												i_108_ = class14_sub10
																														.readUShort();
																												if (i_108_ == 65535)
																													i_108_ = -1;
																											}
																											int i_109_ = class14_sub10
																													.readUByte();
																											anIntArray1276 = new int[i_109_
																													+ 2];
																											for (int i_110_ = 0; i_109_ >= i_110_; i_110_++) {
																												anIntArray1276[i_110_] = class14_sub10
																														.readUShort();
																												if (anIntArray1276[i_110_] == 65535)
																													anIntArray1276[i_110_] = -1;
																											}
																											anIntArray1276[i_109_
																													+ 1] = i_108_;
																										}
																									} else
																										anInt1242 = class14_sub10
																												.readUByte();
																								} else
																									aBoolean1302 = true;
																							} else
																								aBoolean1228 = true;
																						} else
																							anInt1274 = class14_sub10
																									.method805(0);
																					} else
																						anInt1226 = class14_sub10
																								.method805(0);
																				} else
																					anInt1279 = class14_sub10
																							.method805(0);
																			} else
																				anInt1244 = class14_sub10.readUByte();
																		} else
																			anInt1281 = class14_sub10
																					.readUShort();
																	} else
																		anInt1252 = class14_sub10.readUShort();
																} else
																	aBoolean1296 = false;
															} else
																aBoolean1301 = true;
														} else
															anInt1262 = (class14_sub10.readUShort((byte) 104));
													} else {
														int i_111_ = class14_sub10.readUByte();
														aByteArray1297 = new byte[i_111_];
														for (int i_112_ = 0; i_111_ > i_112_; i_112_++)
															aByteArray1297[i_112_] = (class14_sub10
																	.method780());
													}
												} else {
													int i_113_ = class14_sub10.readUByte();
													aShortArray1235 = new short[i_113_];
													aShortArray1231 = new short[i_113_];
													for (int i_114_ = 0; i_113_ > i_114_; i_114_++) {
														aShortArray1235[i_114_] = (short) (class14_sub10
																.readUShort((byte) 109));
														aShortArray1231[i_114_] = (short) (class14_sub10
																.readUShort((byte) 127));
													}
												}
											} else {
												aClass124Array1282[i - 30] = class14_sub10.method797(9467);
												if (aClass124Array1282[i - 30].method1717(40,
														(Class14_Sub9_Sub1.aClass124_4808)))
													aClass124Array1282[i - 30] = null;
											}
										} else
											anInt1246 = class14_sub10.readUByte();
									} else {
										anInt1278 = class14_sub10.readUShort();
										if (anInt1278 == 65535)
											anInt1278 = -1;
									}
								} else
									aBoolean1270 = true;
							} else
								aBoolean1241 = true;
						} else
							anInt1250 = class14_sub10.readUByte();
					} else
						aBoolean1248 = false;
				} else {
					aBoolean1248 = false;
					anInt1229 = 0;
				}
			} else
				anInt1245 = class14_sub10.readUByte();
		} else
			aClass124_1290 = class14_sub10.method797(9467);
	}

	public Class124 method1390(byte i, int i_115_, Class124 class124) {
		if (i > -117) {
			Class124 class124_116_ = null;
			return class124_116_;
		}
		if (aClass55_1266 == null) {
			Class124 class124_117_ = class124;
			return class124_117_;
		}
		Class14_Sub30 class14_sub30 = ((Class14_Sub30) aClass55_1266.get(i_115_));
		if (class14_sub30 == null) {
			Class124 class124_118_ = class124;
			return class124_118_;
		}
		Class124 class124_119_ = class14_sub30.aClass124_3270;
		return class124_119_;
	}

	public Class79 method1391(int i) {
		int i_120_ = -1;
		if (anInt1243 == -1) {
			if (anInt1251 != -1)
				i_120_ = JunkTex.anIntArray4275[anInt1251];
		} else
			i_120_ = Class104.method1534(anInt1243, 114);
		if (i_120_ < 0 || i_120_ >= anIntArray1276.length - 1 || anIntArray1276[i_120_] == -1) {
			int i_121_ = anIntArray1276[anIntArray1276.length - 1];
			if (i_121_ != -1) {
				Class79 class79_122_ = method1377((byte) -106, i_121_);
				return class79_122_;
			}
			Class79 class79_123_ = null;
			return class79_123_;
		}
		Class79 class79_124_ = method1377((byte) -106, anIntArray1276[i_120_]);
		return class79_124_;
	}

	public boolean method1392(int i) {
		if (anIntArray1276 == null) {
			boolean bool = anInt1294 != -1 || anIntArray1287 != null;
			return bool;
		}
		int i_125_ = 0;
		if (i >= -122)
			method1378(-101, 15);
		for (/**/; i_125_ < anIntArray1276.length; i_125_++) {
			if (anIntArray1276[i_125_] != -1) {
				Class79 class79_126_ = method1377((byte) -106, anIntArray1276[i_125_]);
				if (class79_126_.anInt1294 != -1 || class79_126_.anIntArray1287 != null)
					return true;
			}
		}
		return false;
	}

	public Class79() {
		anInt1227 = 1;
		anInt1254 = 0;
		aBoolean1272 = false;
		anInt1239 = 128;
		anInt1244 = 0;
		aBoolean1258 = true;
		anInt1226 = 0;
		anInt1238 = 0;
		anInt1245 = 1;
		anInt1233 = 0;
		anInt1252 = 128;
		anInt1246 = 16;
		anInt1274 = 0;
		anInt1281 = -1;
		aBoolean1283 = false;
		anInt1243 = -1;
		aByte1286 = (byte) 0;
		aClass124_1290 = JunkTex.aClass124_3420;
		aBoolean1270 = false;
		aBoolean1253 = true;
		aClass124Array1282 = new Class124[5];
		anInt1292 = 128;
		aBoolean1241 = false;
		anInt1294 = -1;
		anInt1242 = -1;
		aBoolean1264 = false;
		anInt1289 = 0;
		aBoolean1296 = true;
		anInt1262 = -1;
		anInt1279 = 0;
		aBoolean1301 = false;
		aBoolean1248 = true;
		aBoolean1259 = false;
		aBoolean1302 = false;
		aBoolean1299 = false;
		anInt1271 = 0;
		anInt1250 = -1;
		aShort1304 = (short) -1;
		anInt1278 = -1;
	}
}
