package rs;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.AthmosphericEffects;

import java.io.IOException;
import java.net.Socket;
import rs.Class1;
import rs.Class100;
import rs.Class102;
import rs.Class107;
import rs.Class109;
import rs.Class110;
import rs.Class116;
import rs.Class124;
import rs.Class125_Sub2;
import rs.Class127;
import rs.Class129;
import rs.Class131;
import rs.Class133_Sub4;
import rs.Class134;
import rs.Class137;
import rs.Class138;
import rs.Class139;
import rs.Class142;
import rs.Class146;
import rs.Class14_Sub11;
import rs.Class14_Sub12_Sub1;
import rs.Class14_Sub13;
import rs.Class14_Sub15;
import rs.Class14_Sub17;
import rs.Class14_Sub20;
import rs.Class14_Sub21;
import rs.Class14_Sub23;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub10;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub21;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub3;
import rs.Class14_Sub6;
import rs.Class14_Sub7;
import rs.Class14_Sub9_Sub1;
import rs.Class14_Sub9_Sub4;
import rs.Class152;
import rs.Class153;
import rs.Class18;
import rs.Class22;
import rs.Class28;
import rs.Class33;
import rs.Class35;
import rs.Class36;
import rs.Class37;
import rs.Class47;
import rs.Class48;
import rs.Class64;
import rs.Class69;
import rs.Class7;
import rs.Class70;
import rs.Class74;
import rs.Class75;
import rs.Class7_Sub1;
import rs.Class7_Sub2_Sub1;
import rs.Class83;
import rs.Class84;
import rs.Class89;
import rs.Class9;
import rs.Class91;
import rs.Class98;
import rs.Class99_Sub2;
import rs.Class9_Sub1;
import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub12;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class71 {

	public static int anInt1083 = 0;
	public static Class9 aClass9_1084;
	public static int anInt1085 = 0;
	public static int[] anIntArray1086 = new int[] { 0, 1, 2, 3 };
	public int anInt1087;
	public int anInt1088;
	public float aFloat1089;
	public int anInt1090;
	public static HashTable aClass55_1092 = new HashTable(4096);
	public int anInt1093;
	public float aFloat1095;
	public float aFloat1096;
	public int anInt1097;
	public static Class124 aClass124_1099 = Class14_Sub2_Sub2.method263(1178, "_labels");
	public int anInt1100;
	public static int cameraTileX;

	public static void method1315(int var0) {
		if (var0 != Class142.anInt2315 && Class142.anInt2315 != 5) {
			if (++Class14_Sub20.anInt3087 > 2000) {
				if (Class14_Sub15.aClass36_2990 != null) {
					Class14_Sub15.aClass36_2990.method1101((byte) 113);
					Class14_Sub15.aClass36_2990 = null;
				}

				if (Class7.anInt179 >= 1) {
					Class14_Sub8_Sub26.anInt4525 = -5;
					Class142.anInt2315 = 0;
					return;
				}

				Class14_Sub20.anInt3087 = 0;
				Class142.anInt2315 = 1;
				if (Class131.anInt2164 != Class84.anInt1346) {
					Class131.anInt2164 = Class84.anInt1346;
				} else {
					Class131.anInt2164 = Class99_Sub2.anInt3348;
				}

				++Class7.anInt179;
			}

			label272: {
				label273: {
					try {
						if (Class142.anInt2315 == 1) {
							Class14_Sub8_Sub22.aClass31_4454 = Class14_Sub8_Sub34.aClass43_4647.method1153(0,
									Class14_Sub8_Sub31.aString4605, Class131.anInt2164);
							Class142.anInt2315 = 2;
						}

						if (Class142.anInt2315 != 2) {
							break label273;
						}

						if (Class14_Sub8_Sub22.aClass31_4454.anInt529 == 2) {
							throw new IOException();
						}

						if (Class14_Sub8_Sub22.aClass31_4454.anInt529 != 1) {
							return;
						}
					} catch (IOException var21) {
						break label272;
					}

					try {
						Class14_Sub15.aClass36_2990 = new Class36((Socket) Class14_Sub8_Sub22.aClass31_4454.anObject530,
								Class14_Sub8_Sub34.aClass43_4647);
						Class14_Sub8_Sub22.aClass31_4454 = null;
						long var2 = Class48.aLong802 = Class14_Sub8_Sub9.aClass124_4241.method1692(0);
						int var4 = (int) (var2 >> 16 & 31L);
						Static.aClass14_Sub10_Sub1_891.position = 0;
						Static.aClass14_Sub10_Sub1_891.method809(14);
						Static.aClass14_Sub10_Sub1_891.method809(var4);
						Class14_Sub15.aClass36_2990.method1100(0, 3, 2, Static.aClass14_Sub10_Sub1_891.payload);
						if (Class14_Sub8_Sub35.aClass75_4682 != null) {
							Class14_Sub8_Sub35.aClass75_4682.method1338(255);
						}

						if (Class134.aClass75_2588 != null) {
							Class134.aClass75_2588.method1338(255);
						}

						int var5 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
						if (Class14_Sub8_Sub35.aClass75_4682 != null) {
							Class14_Sub8_Sub35.aClass75_4682.method1338(var0 ^ 255);
						}

						if (Class134.aClass75_2588 != null) {
							Class134.aClass75_2588.method1338(255);
						}

						if (var5 != 0) {
							Class14_Sub8_Sub26.anInt4525 = var5;
							Class142.anInt2315 = 0;
							Class14_Sub15.aClass36_2990.method1101((byte) -23);
							Class14_Sub15.aClass36_2990 = null;
							return;
						}
					} catch (IOException var20) {
						break label272;
					}

					Class142.anInt2315 = 3;
				}

				if (Class142.anInt2315 == 3) {
					try {
						if (Class14_Sub15.aClass36_2990.method1104(24249) < 8) {
							return;
						}
					} catch (IOException var19) {
						break label272;
					}

					try {
						Class14_Sub15.aClass36_2990.method1099(8,
								Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload, -1, 0);
						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
						Class69.aLong1069 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(85);
						Static.aClass14_Sub10_Sub1_891.position = 0;
						int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D),
								(int) (Math.random() * 9.9999999E7D), (int) (Class69.aLong1069 >> 32),
								(int) Class69.aLong1069 };
						Static.aClass14_Sub10_Sub1_891.method809(10);
						Static.aClass14_Sub10_Sub1_891.method803(var1[0], 120);
						Static.aClass14_Sub10_Sub1_891.method803(var1[1], 92);
						Static.aClass14_Sub10_Sub1_891.method803(var1[2], 116);
						Static.aClass14_Sub10_Sub1_891.method803(var1[3], var0 ^ 68);
						Static.aClass14_Sub10_Sub1_891.method817(Class14_Sub8_Sub9.aClass124_4241.method1692(0),
								var0 ^ 86);
						Static.aClass14_Sub10_Sub1_891.method814('\u8000', Class14_Sub8_Sub9.aClass124_4242);
						Static.aClass14_Sub10_Sub1_891.method794(Class9_Sub1.aBigInteger2704, Class152.aBigInteger2433,
								0);
						Class70.aClass14_Sub10_Sub1_1080.position = 0;
						if (Class14_Sub8_Sub16.anInt4356 == 40) {
							Class70.aClass14_Sub10_Sub1_1080.method809(18);
						} else {
							Class70.aClass14_Sub10_Sub1_1080.method809(16);
						}

						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 91, Static.aClass14_Sub10_Sub1_891.position
								+ 151 + Class107.method1550(Class14_Sub9_Sub1.aClass124_4829, (byte) -107));
						Class70.aClass14_Sub10_Sub1_1080.method803(508, 116);
						Class70.aClass14_Sub10_Sub1_1080.method809(Class75.anInt1163);
						Class70.aClass14_Sub10_Sub1_1080.method809(1);
						Class70.aClass14_Sub10_Sub1_1080.method809(Class1.method73((byte) -58));
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 89, Class83.anInt1340);
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 103, Class14_Sub20.anInt3094);
						Static2.method1125(Class70.aClass14_Sub10_Sub1_1080, (byte) -108);
						Class70.aClass14_Sub10_Sub1_1080.method814(var0 + '\u8000', Class14_Sub9_Sub1.aClass124_4829);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub2_Sub11.anInt3884, 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub6.method463((byte) -124), 69);
						Class9.aBoolean214 = true;
						Class70.aClass14_Sub10_Sub1_1080.method803(Class75.aClass9_Sub1_1167.anInt242, var0 ^ 86);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class109.aClass9_Sub1_1834.anInt242, 95);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class138.aClass9_Sub1_2222.anInt242, 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub17.aClass9_Sub1_3021.anInt242, var0 ^ 73);
						Class70.aClass14_Sub10_Sub1_1080.method803(Static2.aClass9_Sub1_2901.anInt242, 66);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub13.aClass9_Sub1_2958.anInt242, var0 + 75);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class125_Sub2.aClass9_Sub1_3374.anInt242, 98);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub8_Sub38.aClass9_Sub1_4739.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub3.aClass9_Sub1_2750.anInt242, 76);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class98.aClass9_Sub1_1666.anInt242, 122);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub8_Sub14.aClass9_Sub1_4323.anInt242, 82);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub8_Sub31.aClass9_Sub1_4603.anInt242,
								var0 ^ 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub8_Sub26.aClass9_Sub1_4521.anInt242, 99);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class64.aClass9_Sub1_1015.anInt242, var0 ^ 118);
						Class70.aClass14_Sub10_Sub1_1080.method803(Static2.aClass9_Sub1_5085.anInt242,
								var0 + 109);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class47.aClass9_Sub1_790.anInt242, var0 ^ 89);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class89.aClass9_Sub1_1407.anInt242, 118);
						Class70.aClass14_Sub10_Sub1_1080.method803(Static2.aClass9_Sub1_369.anInt242, 127);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class102.aClass9_Sub1_1712.anInt242, 90);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class127.aClass9_Sub1_2111.anInt242, 101);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class22.aClass9_Sub1_459.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class100.aClass9_Sub1_1690.anInt242, 112);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub8.aClass9_Sub1_2848.anInt242, 106);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class7_Sub1.aClass9_Sub1_2657.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub21.aClass9_Sub1_3111.anInt242, 85);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class28.aClass9_Sub1_513.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub2_Sub7.aClass9_Sub1_3824.anInt242, 105);
						Class70.aClass14_Sub10_Sub1_1080.method807(Static.aClass14_Sub10_Sub1_891.position,
								Static.aClass14_Sub10_Sub1_891.payload, 0, -1076444960);
						Class14_Sub15.aClass36_2990.method1100(0, 3, Class70.aClass14_Sub10_Sub1_1080.position,
								Class70.aClass14_Sub10_Sub1_1080.payload);
						Static.aClass14_Sub10_Sub1_891.setEncryption(var1);

						for (int var6 = 0; var6 < 4; ++var6) {
							var1[var6] += 50;
						}

						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.setEncryption(var1);
						Class142.anInt2315 = 4;
					} catch (IOException var18) {
						break label272;
					}
				}

				if (Class142.anInt2315 == 4) {
					label277: {
						try {
							if (Class14_Sub15.aClass36_2990.method1104(24249) < 1) {
								return;
							}
						} catch (IOException var16) {
							break label272;
						}

						label278: {
							int var22;
							try {
								var22 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
								if (var22 == 21) {
									break label278;
								}

								if (var22 == 1) {
									Class142.anInt2315 = 5;
									Class14_Sub8_Sub26.anInt4525 = var22;
									return;
								}
							} catch (IOException var17) {
								break label272;
							}

							if (var22 != 2) {
								if (var22 == 15) {
									Class142.anInt2315 = 0;
									Class14_Sub8_Sub26.anInt4525 = var22;
									return;
								}

								if (var22 == 23 && Class7.anInt179 < 1) {
									Class142.anInt2315 = 1;
									++Class7.anInt179;
									Class14_Sub20.anInt3087 = 0;
									Class14_Sub15.aClass36_2990.method1101((byte) -85);
									Class14_Sub15.aClass36_2990 = null;
									return;
								}

								Class14_Sub8_Sub26.anInt4525 = var22;
								Class142.anInt2315 = 0;
								Class14_Sub15.aClass36_2990.method1101((byte) 121);
								Class14_Sub15.aClass36_2990 = null;
								return;
							}

							Class142.anInt2315 = 8;
							break label277;
						}

						Class142.anInt2315 = 7;
					}
				}

				if (Class142.anInt2315 == 6) {
					label281: {
						Static.aClass14_Sub10_Sub1_891.position = 0;
						Static.aClass14_Sub10_Sub1_891.writeOpcode(17);

						try {
							Class14_Sub15.aClass36_2990.method1100(0, 3, Static.aClass14_Sub10_Sub1_891.position,
									Static.aClass14_Sub10_Sub1_891.payload);
						} catch (IOException var15) {
							break label281;
						}

						Class142.anInt2315 = 4;
						return;
					}
				} else {
					label217: {
						label282: {
							try {
								if (Class142.anInt2315 == 7) {
									if (Class14_Sub15.aClass36_2990.method1104(24249) >= 1) {
										break label282;
									}

									return;
								}
							} catch (IOException var14) {
								break label217;
							}

							label205: {
								try {
									if (Class142.anInt2315 != 8) {
										break label205;
									}

									if (Class14_Sub15.aClass36_2990.method1104(24249) < 11) {
										return;
									}
								} catch (IOException var13) {
									break label217;
								}

								try {
									Class14_Sub15.aClass36_2990.method1099(11,
											Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload, -1, 0);
									Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
									Class152.anInt2439 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
									Static2.anInt2889 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
									Class146.anInt2365 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
									if (Class146.anInt2365 == 1) {
										try {
											Class35.aClass124_597
													.method1666(Class14_Sub8_Sub34.aClass43_4647.anApplet712, false);
										} catch (Throwable var8) {
											;
										}
									} else {
										try {
											Class18.aClass124_415
													.method1666(Class14_Sub8_Sub34.aClass43_4647.anApplet712, false);
										} catch (Throwable var7) {
											;
										}
									}

									Class14_Sub2_Sub21.anInt4081 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
											.method798();
									Class14_Sub8_Sub10.aBoolean4249 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
											.method798() == 1;
									Class14_Sub2_Sub10.anInt3868 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
											.method784((byte) 117);
									Class14_Sub20.anInt3090 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
									Class133_Sub4.anInt3579 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
											.readOpcode();
									Class14_Sub8_Sub12.anInt4280 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
											.method784((byte) 121);
									Class142.anInt2315 = 9;
								} catch (IOException var12) {
									break label217;
								}
							}

							if (Class142.anInt2315 != 9) {
								return;
							}

							try {
								if (Class14_Sub15.aClass36_2990.method1104(24249) < Class14_Sub8_Sub12.anInt4280) {
									return;
								}

								try {
									Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
									Class14_Sub15.aClass36_2990.method1099(Class14_Sub8_Sub12.anInt4280,
											Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload, -1, 0);
									Class14_Sub8_Sub26.anInt4525 = 2;
									Class142.anInt2315 = 0;
									Class37.method1109(12827);
									Class129.anInt2133 = -1;
									Class139.method1951((byte) -119, false);
									Class133_Sub4.anInt3579 = -1;
									return;
								} catch (IOException var10) {
									break label217;
								}
							} catch (IOException var11) {
								break label217;
							}
						}

						try {
							Class14_Sub8_Sub30.anInt4598 = (Class14_Sub15.aClass36_2990.method1107((byte) 30) + 3) * 60;
							Class142.anInt2315 = 0;
							Class14_Sub8_Sub26.anInt4525 = 21;
							Class14_Sub15.aClass36_2990.method1101((byte) -113);
							Class14_Sub15.aClass36_2990 = null;
							return;
						} catch (IOException var9) {
							;
						}
					}
				}
			}

			new Throwable();
			if (Class14_Sub15.aClass36_2990 != null) {
				Class14_Sub15.aClass36_2990.method1101((byte) 125);
				Class14_Sub15.aClass36_2990 = null;
			}

			if (Class7.anInt179 >= 1) {
				Class142.anInt2315 = 0;
				Class14_Sub8_Sub26.anInt4525 = -4;
			} else {
				++Class7.anInt179;
				Class14_Sub20.anInt3087 = 0;
				Class142.anInt2315 = 1;
				if (Class131.anInt2164 != Class84.anInt1346) {
					Class131.anInt2164 = Class84.anInt1346;
				} else {
					Class131.anInt2164 = Class99_Sub2.anInt3348;
				}
			}
		}

	}

	public static void method1316(boolean var0) {
		aClass124_1099 = null;
		aClass9_1084 = null;
		aClass55_1092 = null;
		anIntArray1086 = null;
		if (!var0) {
			cameraTileX = 105;
		}

	}

	public static void method1317(int var0, int var1, int var2, int var3, int var4) {
		int var5 = 0;

		for (int var6 = -40 / ((32 - var3) / 52); var5 < Class14_Sub17.anInt3012; ++var5) {
			if (var4 < Class110.anIntArray1854[var5] + Class9.anIntArray215[var5]
					&& Class9.anIntArray215[var5] < var2 + var4
					&& var0 < Class74.anIntArray1135[var5] + Class137.anIntArray2205[var5]
					&& Class74.anIntArray1135[var5] < var1 + var0) {
				Class7_Sub2_Sub1.aBooleanArray3703[var5] = true;
			}
		}

	}

	public static void method1318(byte var0) {
		for (int var1 = 0; var1 < Static.anInt96; ++var1) {
			--Static2.anIntArray3949[var1];
			if (Static2.anIntArray3949[var1] < -10) {
				--Static.anInt96;

				for (int var2 = var1; var2 < Static.anInt96; ++var2) {
					Class153.anIntArray2454[var2] = Class153.anIntArray2454[var2 + 1];
					Class137.aClass91Array2197[var2] = Class137.aClass91Array2197[var2 + 1];
					Static2.anIntArray4052[var2] = Static2.anIntArray4052[var2 + 1];
					Static2.anIntArray3949[var2] = Static2.anIntArray3949[var2 + 1];
					Class116.anIntArray1928[var2] = Class116.anIntArray1928[var2 + 1];
				}

				--var1;
			} else {
				Class91 var10 = Class137.aClass91Array2197[var1];
				if (var10 == null) {
					var10 = Class91.method1451(Static2.aClass9_Sub1_2901, Class153.anIntArray2454[var1], 0);
					if (var10 == null) {
						continue;
					}

					Static2.anIntArray3949[var1] += var10.method1450();
					Class137.aClass91Array2197[var1] = var10;
				}

				if (Static2.anIntArray3949[var1] < 0) {
					int var3;
					if (Class116.anIntArray1928[var1] == 0) {
						var3 = Class14_Sub29.anInt3266;
					} else {
						int var4 = (Class116.anIntArray1928[var1] & 255) * 128;
						int var5 = (Class116.anIntArray1928[var1] & 16776284) >> 48;
						int var6 = -Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 + var5 * 128 + 64;
						int var7 = (Class116.anIntArray1928[var1] & '\uff17') >> 8;
						if (var6 < 0) {
							var6 = -var6;
						}

						int var8 = -Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 + var7 * 128 + 64;
						if (var8 < 0) {
							var8 = -var8;
						}

						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							Static2.anIntArray3949[var1] = -100;
							continue;
						}

						if (var9 < 0) {
							var9 = 0;
						}

						var3 = Class100.anInt1691 * (var4 - var9) / var4;
					}

					if (var3 > 0) {
						Class14_Sub12_Sub1 var11 = var10.method1449().method857(SceneCluster.aClass18_1362);
						Class14_Sub9_Sub4 var12 = Class14_Sub9_Sub4.method775(var11, 100, var3);
						var12.method765(Static2.anIntArray4052[var1] - 1);
						Class33.aClass14_Sub9_Sub2_585.method735(var12);
					}

					Static2.anIntArray3949[var1] = -100;
				}
			}
		}

		if (var0 != 112) {
			method1318((byte) 70);
		}

		if (Class14_Sub7.aBoolean2827 && !Class14_Sub11.method852(14326)) {
			if (Class14_Sub23.anInt3135 != 0 && Class14_Sub8.anInt2856 != -1) {
				Class33.method1087(1936, 0, false, Class14_Sub8.anInt2856, Class125_Sub2.aClass9_Sub1_3374,
						Class14_Sub23.anInt3135);
			}

			Class14_Sub7.aBoolean2827 = false;
		} else if (Class14_Sub23.anInt3135 != 0 && Class14_Sub8.anInt2856 != -1
				&& !Class14_Sub11.method852(var0 + 14214)) {
			Static.aClass14_Sub10_Sub1_891.writeOpcode(247);
			Static.aClass14_Sub10_Sub1_891.method803(Class14_Sub8.anInt2856, var0 ^ 22);
			Class14_Sub8.anInt2856 = -1;
		}

	}

	public Class71() {
		this.anInt1097 = -60;
		this.aFloat1095 = 1.2F;
		this.aFloat1096 = 0.69921875F;
		this.anInt1100 = 0;
		this.anInt1090 = -50;
		this.anInt1088 = AthmosphericEffects.defaultSunColour;
		this.aFloat1089 = 1.1523438F;
		this.anInt1093 = AthmosphericEffects.defaultFogColour;
		this.anInt1087 = -50;
	}

	public Class71(Buffer var1) {
		int var2 = var1.method798();
		if ((var2 & 1) == 0) {
			this.anInt1088 = AthmosphericEffects.defaultSunColour;
		} else {
			this.anInt1088 = var1.method812((byte) -97);
		}

		if ((var2 & 2) == 0) {
			this.aFloat1089 = 1.1523438F;
		} else {
			this.aFloat1089 = (float) var1.method784((byte) 110) / 256.0F;
		}

		if ((var2 & 4) != 0) {
			this.aFloat1096 = (float) var1.method784((byte) 122) / 256.0F;
		} else {
			this.aFloat1096 = 0.69921875F;
		}

		if ((var2 & 8) == 0) {
			this.aFloat1095 = 1.2F;
		} else {
			this.aFloat1095 = (float) var1.method784((byte) 120) / 256.0F;
		}

		if ((var2 & 16) != 0) {
			this.anInt1087 = var1.method805(0);
			this.anInt1097 = var1.method805(0);
			this.anInt1090 = var1.method805(0);
		} else {
			this.anInt1097 = -60;
			this.anInt1090 = -50;
			this.anInt1087 = -50;
		}

		if ((var2 & 32) == 0) {
			this.anInt1093 = AthmosphericEffects.defaultFogColour;
		} else {
			this.anInt1093 = var1.method812((byte) -96);
		}

		if ((var2 & 64) == 0) {
			this.anInt1100 = 0;
		} else {
			this.anInt1100 = var1.method784((byte) 111);
		}

	}
}
