/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub4;

public abstract class Class99 {
	public static int anInt1674;
	public static Class124 aClass124_1677 = Class14_Sub2_Sub2.method263(1178, "details");
	public static Class124 aClass124_1679 = Class14_Sub2_Sub2.method263(1178,
			"Clientscript error )2 check log for details");

	public static Class39 method1497(boolean bool) {
		if (!bool)
			return null;
		Class39 class39;
		try {
			class39 = (Class39) Class.forName("rs.Class39_Sub1").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
		return class39;
	}

	public static boolean method1498(boolean var1, int var2, Class14_Sub29[][][] var3, int var4, int var5) {
			byte var6 = var1 ? 1 : (byte) (Class42.anInt699 & 255);
			boolean var7;
			if (Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var4][var2] == var6) {
				var7 = false;
				return var7;
			} else if ((Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var4][var2] & 4) == 0) {
				var7 = false;
				return var7;
			} else {
				int var8 = 0;

				byte var9 = 0;
				Class14_Sub8_Sub36.anIntArray4691[var9] = var4;
				int var10 = var9 + 1;
				Class14_Sub2_Sub21.anIntArray4078[var9] = var2;
				Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var4][var2] = var6;

				while (var8 != var10) {
					int var11 = Class14_Sub8_Sub36.anIntArray4691[var8] & '\uffff';
					int var12 = Class14_Sub8_Sub36.anIntArray4691[var8] >> 16 & 255;
					int var13 = Class14_Sub8_Sub36.anIntArray4691[var8] >> 24 & 255;
					int var14 = Class14_Sub2_Sub21.anIntArray4078[var8] & '\uffff';
					int var15 = (Class14_Sub2_Sub21.anIntArray4078[var8] & 16773885) >> 48;
					var8 = var8 + 1 & 4095;
					boolean var16 = false;
					if ((Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11][var14] & 4) == 0) {
						var16 = true;
					}

					boolean var17 = false;

					int var18;
					int var19;
					label242: for (var18 = Class14_Sub2_Sub3.anInt3785 + 1; var18 <= 3; ++var18) {
						if ((Class14_Sub8_Sub4.tileFlags[var18][var11][var14] & 8) == 0) {
							int var20;
							int var22;
							if (var16 && var3[var18][var11][var14] != null) {
								if (var3[var18][var11][var14].aClass113_3250 != null) {
									var19 = Class79.method1382(-23, var12);
									if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var19
											|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var19) {
										continue;
									}

									if (var13 != 0) {
										var20 = Class79.method1382(-120, var13);
										if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var20
												|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var20) {
											continue;
										}
									}

									if (var15 != 0) {
										var20 = Class79.method1382(-15, var15);
										if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var20
												|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var20) {
											continue;
										}
									}
								}

								if (var3[var18][var11][var14].aClass40Array3257 != null) {
									for (var19 = 0; var3[var18][var11][var14].anInt3242 > var19; ++var19) {
										var20 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].aLong677 >> 20
												& 3L);
										int var21 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].aLong677 >> 14
												& 63L);
										if (var21 == 21) {
											var21 = 19;
										}

										var22 = var20 << 38 | var21;
										if (var22 == var12 || var13 != 0 && var13 == var22
												|| var15 != 0 && var15 == var22) {
											continue label242;
										}
									}
								}
							}

							var17 = true;
							Class14_Sub29 var27 = var3[var18][var11][var14];
							if (var27 != null && var27.anInt3242 > 0) {
								for (var20 = 0; var27.anInt3242 > var20; ++var20) {
									Class40 var23 = var27.aClass40Array3257[var20];
									if (var23.anInt670 != var23.anInt668 || var23.anInt669 != var23.anInt678) {
										for (var22 = var23.anInt668; var22 <= var23.anInt670; ++var22) {
											for (int var24 = var23.anInt678; var24 <= var23.anInt669; ++var24) {
												Class28.aByteArrayArrayArray512[var18][var22][var24] = var6;
											}
										}
									}
								}
							}

							Class28.aByteArrayArrayArray512[var18][var11][var14] = var6;
						}
					}

					if (var17) {
						if (Class114.tileHeights[Class14_Sub2_Sub3.anInt3785
								+ 1][var11][var14] > Class14_Sub2_Sub11.anIntArray3872[var5]) {
							Class14_Sub2_Sub11.anIntArray3872[var5] = Class114.tileHeights[Class14_Sub2_Sub3.anInt3785
									+ 1][var11][var14];
						}

						var18 = var11 << 7;
						if (Class14_Sub8_Sub20.anIntArray4422[var5] <= var18) {
							if (Class14_Sub19.anIntArray3079[var5] < var18) {
								Class14_Sub19.anIntArray3079[var5] = var18;
							}
						} else {
							Class14_Sub8_Sub20.anIntArray4422[var5] = var18;
						}

						var19 = var14 << 39;
						if (Class96.anIntArray1630[var5] <= var19) {
							if (var19 > Class120.anIntArray2008[var5]) {
								Class120.anIntArray2008[var5] = var19;
							}
						} else {
							Class96.anIntArray1630[var5] = var19;
						}
					}

					if (!var16) {
						if (var11 >= 1 && var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
								- 1][var14]) {
							Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
									.method1294(Class66.method1294(var11 - 1, 1179648), -754974720);
							Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 1245184);
							var10 = var10 + 1 & 4095;
							Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 - 1][var14] = var6;
						}

						++var14;
						if (var14 < 104) {
							if (var11 - 1 >= 0
									&& Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
											- 1][var14] != var6
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11][var14] & 4) == 0
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11 - 1][var14 - 1]
											& 4) == 0) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 - 1, 1179648), 1375731712);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(1245184, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 - 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}

							if (Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11][var14] != var6) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(5373952, var11), 318767104);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(5439488, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11][var14] = var6;
								var10 = var10 + 1 & 4095;
							}

							if (var11 + 1 < 104
									&& var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
											+ 1][var14]
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11][var14] & 4) == 0
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11 + 1][var14 - 1]
											& 4) == 0) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(5373952, var11 + 1), -1845493760);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(5439488, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 + 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}
						}

						--var14;
						if (var11 + 1 < 104 && Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
								+ 1][var14] != var6) {
							Class14_Sub8_Sub36.anIntArray4691[var10] = Class66.method1294(1392508928,
									Class66.method1294(var11 + 1, 9568256));
							Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(9633792, var14);
							var10 = var10 + 1 & 4095;
							Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 + 1][var14] = var6;
						}

						--var14;
						if (var14 >= 0) {
							if (var11 - 1 >= 0
									&& var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
											- 1][var14]
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11][var14] & 4) == 0
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11 - 1][var14 + 1]
											& 4) == 0) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 - 1, 13762560), 301989888);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 13828096);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 - 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}

							if (var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11][var14]) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66.method1294(-1828716544,
										Class66.method1294(13762560, var11));
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 13828096);
								var10 = var10 + 1 & 4095;
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11][var14] = var6;
							}

							if (var11 + 1 < 104
									&& Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11
											+ 1][var14] != var6
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11][var14] & 4) == 0
									&& (Class14_Sub8_Sub4.tileFlags[Class14_Sub2_Sub3.anInt3785][var11 + 1][var14 + 1]
											& 4) == 0) {
								Class14_Sub8_Sub36.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 + 1, 9568256), -771751936);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 9633792);
								var10 = var10 + 1 & 4095;
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.anInt3785][var11 + 1][var14] = var6;
							}
						}
					}
				}

				if (Class14_Sub2_Sub11.anIntArray3872[var5] != -1000000) {
					Class14_Sub2_Sub11.anIntArray3872[var5] += 10;
					Class14_Sub8_Sub20.anIntArray4422[var5] -= 50;
					Class14_Sub19.anIntArray3079[var5] += 50;
					Class120.anIntArray2008[var5] += 50;
					Class96.anIntArray1630[var5] -= 50;
				}

				boolean var26 = true;
				return var26;
			}
	}

	public static boolean method1499(int var0) {
		try {
			if (var0 != Class99_Sub2.anInt3352) {
				boolean var1;
				try {
					Class90.aClass124_1424.method1666(Class14_Sub8_Sub34.aClass43_4647.anApplet712, false);
					var1 = true;
				} catch (Throwable var3) {
					return false;
				}

				return var1;
			} else {
				return false;
			}
		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "pe.J(" + var0 + ')');
		}
	}

	public static int method1500(Class133_Sub1_Sub2 var0, int var1) {
		try {
			Class12 var2 = var0.aClass12_4949;
			if (var2.anIntArray329 != null) {
				var2 = var2.method217((byte) -18);
				if (var2 == null) {
					byte var5 = -1;
					return var5;
				}
			}

			int var3 = var2.anInt301;
			if (var0.anInt3433 != var0.anInt3452) {
				if (var0.anInt3452 == var0.anInt3456) {
					var3 = var2.anInt292;
				}
			} else {
				var3 = var2.anInt289;
			}

			if (var1 != -1) {
				method1500((Class133_Sub1_Sub2) null, -70);
			}

			return var3;
		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "pe.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public abstract int method1501(int i, int i_49_, int i_50_);

	public static void method1502(int i) {
		if (i != -17808)
			method1500(null, -8);
		aClass124_1677 = null;
		aClass124_1679 = null;
	}

	public abstract void method1504(byte i);
}
