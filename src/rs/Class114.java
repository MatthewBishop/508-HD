package rs;

import java.io.EOFException;
import java.io.IOException;
import rs.Class115;
import rs.Class124;
import rs.Class125;
import rs.Class133_Sub1_Sub1;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub3;
import rs.Class15;
import rs.Class54;
import rs.Class76;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub39_Sub1;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class114 {

	public static int[] anIntArray1893 = new int[] { 1, -1, -1, 1 };
	public static int[][][] tileHeights;
	public int anInt1897 = '\ufde8';
	public int anInt1898;
	public static Class124 aClass124_1900 = Class14_Sub2_Sub2.method263(1178, "mapscene");
	public Class76 aClass76_1901 = null;
	public static int[] anIntArray1902 = new int[100];
	public Class76 aClass76_1905 = null;

	public byte[] method1582(int var1, int var2) {
		Object var3 = null;

		try {
			Class76 var4 = this.aClass76_1901;
			Class76 var5 = this.aClass76_1901;
			synchronized (var5) {
				byte[] var10000;
				label235: {
					try {
						try {
							if (this.aClass76_1905.method1360((byte) -94) >= (long) (var2 * 6 + 6)) {
								break label235;
							}

							var3 = null;
							var10000 = (byte[]) var3;
							return var10000;
						} catch (Exception var25) {
							var10000 = (byte[]) var3;
						}
					} catch (RuntimeException var26) {
						return (byte[]) var3;
					}

					return var10000;
				}

				label237: {
					int var6;
					int var7;
					label192: {
						try {
							try {
								this.aClass76_1905.method1361(0, (long) (var2 * 6));
								this.aClass76_1905.method1368(false, Class14_Sub8_Sub39_Sub1.aByteArray5102, 0, 6);
								var6 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[1] << 8 & '\uff00')
										+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[0] << 48 & 16711680)
										+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[2] & 255);
								var7 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[5] & 255)
										+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[4] & 255) << 40)
										+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[3] & 255) << 16);
								if (var6 >= 0 && var6 <= this.anInt1897) {
									break label192;
								}

								var3 = null;
								var10000 = (byte[]) var3;
							} catch (IOException var23) {
								break label237;
							}
						} catch (Exception var24) {
							return (byte[]) var3;
						}

						return var10000;
					}

					try {
						if (var7 <= 0 || (long) var7 > this.aClass76_1901.method1360((byte) -56) / 520L) {
							var3 = null;
							return (byte[]) var3;
						}
					} catch (Exception var22) {
						return (byte[]) var3;
					}

					int var8;
					byte[] var9;
					int var10;
					try {
						var8 = 0;
						if (var1 <= 122) {
							this.aClass76_1901 = null;
						}

						var9 = new byte[var6];
						var10 = 0;
					} catch (Exception var17) {
						return (byte[]) var3;
					}

					while (var6 > var8) {
						if (var7 == 0) {
							var3 = null;
							return (byte[]) var3;
						}

						int var11;
						int var12;
						int var14;
						try {
							try {
								this.aClass76_1901.method1361(0, (long) (var7 * 520));
								var11 = -var8 + var6;
								if (var11 > 512) {
									var11 = 512;
								}

								this.aClass76_1901.method1368(false, Class14_Sub8_Sub39_Sub1.aByteArray5102, 0,
										var11 + 8);
								var12 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[2] << 40 & '\uff00')
										+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[3] & 255);
								int var13 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[0] << 40 & '\uff00')
										+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[1] & 255);
								var14 = ((Class14_Sub8_Sub39_Sub1.aByteArray5102[5] & 255) << 40)
										+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[4] & 255) << 48)
										+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[6] & 255);
								int var15 = Class14_Sub8_Sub39_Sub1.aByteArray5102[7] & 255;
								if (var2 != var13 || var10 != var12 || this.anInt1898 != var15) {
									var3 = null;
									var10000 = (byte[]) var3;
									return var10000;
								}
							} catch (IOException var20) {
								break label237;
							}
						} catch (Exception var21) {
							return (byte[]) var3;
						}

						try {
							if (var14 < 0 || this.aClass76_1901.method1360((byte) -55) / 520L < (long) var14) {
								var3 = null;
								var10000 = (byte[]) var3;
								return var10000;
							}
						} catch (Exception var19) {
							return (byte[]) var3;
						}

						try {
							for (var12 = 0; var12 < var11; ++var12) {
								var9[var8++] = Class14_Sub8_Sub39_Sub1.aByteArray5102[var12 + 8];
							}

							var7 = var14;
							++var10;
						} catch (Exception var18) {
							return (byte[]) var3;
						}
					}

					return var9;
				}

				try {
					var3 = null;
				} catch (Exception var16) {
					return (byte[]) var3;
				}

				return (byte[]) var3;
			}
		} catch (Throwable var28) {
			throw Class14_Sub8_Sub14.method554(var28, "rl.D(" + var1 + ',' + var2 + ')');
		}
	}

	public boolean method1583(int var1, byte[] var2, int var3, int var4) {
		boolean var5 = this.method1584(var4, true, var1, var2, 91);

		try {
			Class76 var6 = this.aClass76_1901;
			Class76 var7 = this.aClass76_1901;
			synchronized (var7) {
				try {
					if (~var4 > var3 || this.anInt1897 < var4) {
						throw new IllegalArgumentException();
					}

					boolean var8 = this.method1584(var4, true, var1, var2, 91);
					if (!var8) {
						var8 = this.method1584(var4, false, var1, var2, 122);
					}

					var5 = var8;
				} catch (Exception var12) {
					try {
						try {
							RuntimeException var9 = new RuntimeException();
							throw var9;
						} catch (RuntimeException var10) {
							;
						}
					} catch (Throwable var11) {
						throw Class14_Sub8_Sub14.method554(var11, "rl.C(" + var1 + ','
								+ (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
					}
				}
			}
		} catch (RuntimeException var14) {
			;
		}

		return var5;
	}

	public boolean method1584(int var1, boolean var2, int var3, byte[] var4, int var5) {
		System.out.println("hi");
		boolean var6 = false;

		try {
			Class76 var7 = this.aClass76_1901;
			Class76 var8 = this.aClass76_1901;
			synchronized (var8) {
				label211: {
					int var9;
					label225: {
						label201: {
							boolean var10000;
							try {
								try {
									if (var5 < 86) {
										anIntArray1893 = null;
									}

									if (!var2) {
										var9 = (int) ((this.aClass76_1901.method1360((byte) -39) + 519L) / 520L);
										if (var9 == 0) {
											var9 = 1;
										}
										break label225;
									}

									if ((long) (var3 * 6 + 6) > this.aClass76_1905.method1360((byte) -103)) {
										var6 = false;
										var10000 = var6;
										return var10000;
									}
									break label201;
								} catch (Exception var26) {
									var10000 = var6;
								}
							} catch (RuntimeException var27) {
								return var6;
							}

							return var10000;
						}

						try {
							try {
								this.aClass76_1905.method1361(0, (long) (var3 * 6));
								this.aClass76_1905.method1368(false, Class14_Sub8_Sub39_Sub1.aByteArray5102, 0, 6);
								var9 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[5] & 255)
										+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[3] & 255) << 16)
										+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[4] & 255) << 8);
								if (var9 > 0 && (long) var9 <= this.aClass76_1901.method1360((byte) -116) / 520L) {
									break label225;
								}

								var6 = false;
							} catch (IOException var24) {
								break label211;
							}
						} catch (Exception var25) {
							return var6;
						}

						return var6;
					}

					int var10;
					int var11;
					try {
						try {
							Class14_Sub8_Sub39_Sub1.aByteArray5102[3] = (byte) (var9 >> 48);
							Class14_Sub8_Sub39_Sub1.aByteArray5102[1] = (byte) (var1 >> 40);
							Class14_Sub8_Sub39_Sub1.aByteArray5102[4] = (byte) (var9 >> 40);
							Class14_Sub8_Sub39_Sub1.aByteArray5102[2] = (byte) var1;
							Class14_Sub8_Sub39_Sub1.aByteArray5102[0] = (byte) (var1 >> 16);
							Class14_Sub8_Sub39_Sub1.aByteArray5102[5] = (byte) var9;
							this.aClass76_1905.method1361(0, (long) (var3 * 6));
							this.aClass76_1905.method1362(0, 6, (byte) 94, Class14_Sub8_Sub39_Sub1.aByteArray5102);
							var10 = 0;
							var11 = 0;
						} catch (IOException var22) {
							break label211;
						}
					} catch (Exception var23) {
						return var6;
					}

					while (true) {
						if (var10 < var1) {
							label171: {
								int var12 = 0;
								int var14;
								if (var2) {
									label214: {
										this.aClass76_1901.method1361(0, (long) (var9 * 520));

										try {
											this.aClass76_1901.method1368(false, Class14_Sub8_Sub39_Sub1.aByteArray5102,
													0, 8);
										} catch (EOFException var21) {
											break label171;
										}

										var14 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[1] & 255)
												+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[0] << 40 & '\uff00');
										var12 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[4] << 16 & 16711680)
												+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[5] << 40 & '\uff00')
												+ (Class14_Sub8_Sub39_Sub1.aByteArray5102[6] & 255);
										int var13 = (Class14_Sub8_Sub39_Sub1.aByteArray5102[3] & 255)
												+ ((Class14_Sub8_Sub39_Sub1.aByteArray5102[2] & 255) << 40);
										int var15 = Class14_Sub8_Sub39_Sub1.aByteArray5102[7] & 255;
										if (var3 == var14 && var11 == var13 && var15 == this.anInt1898) {
											try {
												if (var12 >= 0 && this.aClass76_1901.method1360((byte) -74)
														/ 520L >= (long) var12) {
													break label214;
												}

												var6 = false;
											} catch (Exception var18) {
												return var6;
											}

											return var6;
										}

										var6 = false;
										return var6;
									}
								}

								try {
									try {
										if (var12 == 0) {
											var2 = false;
											var12 = (int) ((this.aClass76_1901.method1360((byte) -54) + 519L) / 520L);
											if (var12 == 0) {
												++var12;
											}

											if (var9 == var12) {
												++var12;
											}
										}

										Class14_Sub8_Sub39_Sub1.aByteArray5102[3] = (byte) var11;
										Class14_Sub8_Sub39_Sub1.aByteArray5102[1] = (byte) var3;
										Class14_Sub8_Sub39_Sub1.aByteArray5102[0] = (byte) (var3 >> 40);
										Class14_Sub8_Sub39_Sub1.aByteArray5102[7] = (byte) this.anInt1898;
										var14 = var1 - var10;
										if (var14 > 512) {
											var14 = 512;
										}

										if (-var10 + var1 <= 512) {
											var12 = 0;
										}

										Class14_Sub8_Sub39_Sub1.aByteArray5102[5] = (byte) (var12 >> 8);
										Class14_Sub8_Sub39_Sub1.aByteArray5102[2] = (byte) (var11 >> 8);
										Class14_Sub8_Sub39_Sub1.aByteArray5102[4] = (byte) (var12 >> 16);
										++var11;
										Class14_Sub8_Sub39_Sub1.aByteArray5102[6] = (byte) var12;
										this.aClass76_1901.method1361(0, (long) (var9 * 520));
										this.aClass76_1901.method1362(0, 8, (byte) 45,
												Class14_Sub8_Sub39_Sub1.aByteArray5102);
										var9 = var12;
										this.aClass76_1901.method1362(var10, var14, (byte) 92, var4);
										var10 += var14;
										continue;
									} catch (IOException var19) {
										break;
									}
								} catch (Exception var20) {
									return var6;
								}
							}
						}

						var6 = true;
						return var6;
					}
				}

				try {
					var6 = false;
				} catch (Exception var17) {
					return var6;
				}

				return var6;
			}
		} catch (Throwable var29) {
			throw Class14_Sub8_Sub14.method554(var29, "rl.B(" + var1 + ',' + var2 + ',' + var3 + ','
					+ (var4 != null ? "{...}" : "null") + ',' + var5 + ')');
		}
	}

	public static void method1585(boolean var0) {
		try {
			try {
				anIntArray1893 = null;
				if (var0) {
					return;
				}
			} catch (RuntimeException var3) {
				return;
			}

			try {
				aClass124_1900 = null;
				tileHeights = null;
				anIntArray1902 = null;
			} catch (RuntimeException var2) {
				;
			}

		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "rl.E(" + var0 + ')');
		}
	}

	public static void method1586(int[] var0, Object[] var1, byte var2) {
		try {
			Class14_Sub2_Sub7.method289((byte) 124, var0.length - 1, var0, var1, 0);
			int var3 = -12 % ((-5 - var2) / 58);
		} catch (RuntimeException var4) {
			throw Class14_Sub8_Sub14.method554(var4, "rl.A(" + (var0 != null ? "{...}" : "null") + ','
					+ (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void method1587(Class124 var0, int var1, int var2) {
		try {
			Class124 var3 = var0.method1688(15).method1685(0);
			boolean var4 = false;

			for (int var5 = var1; var5 < Static2.anInt2878; ++var5) {
				Class133_Sub1_Sub1 var6 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[var5]];
				if (var6 != null && var6.aClass124_4922 != null && var6.aClass124_4922.method1717(40, var3)) {
					Class14_Sub8_Sub35.method663(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0], 1, 0, 0,
							(byte) 109, Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0], false, 0,
							var6.anIntArray3476[0], 2, 1, var6.anIntArray3443[0]);
					if (var2 != 1) {
						if (var2 == 4) {
							++Class124.anInt2483;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(253);
							Static.aClass14_Sub10_Sub1_891.method801((byte) -56, Static2.anIntArray351[var5]);
						} else if (var2 != 6) {
							if (var2 == 7) {
								++Class54.anInt880;
								Static.aClass14_Sub10_Sub1_891.writeOpcode(93);
								Static.aClass14_Sub10_Sub1_891.method801((byte) -119, Static2.anIntArray351[var5]);
							}
						} else {
							Static.aClass14_Sub10_Sub1_891.writeOpcode(35);
							++Class115.anInt1912;
							Static.aClass14_Sub10_Sub1_891.method801((byte) -122, Static2.anIntArray351[var5]);
						}
					} else {
						Static.aClass14_Sub10_Sub1_891.writeOpcode(160);
						Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Static2.anIntArray351[var5]);
						++Class14_Sub8_Sub16.anInt4350;
					}

					var4 = true;
					break;
				}
			}

			if (!var4) {
				Class15.method943(
						Class14_Sub8_Sub7.method515(new Class124[] { Class125.aClass124_2077, var3 }, (byte) -120),
						false, Class14_Sub8_Sub9.aClass124_4244, 0);
			}

		} catch (RuntimeException var7) {
			throw Class14_Sub8_Sub14.method554(var7,
					"rl.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public String toString() {
		try {
			String var1 = "Cache:" + this.anInt1898;
			return var1;
		} catch (RuntimeException var2) {
			throw Class14_Sub8_Sub14.method554(var2, "rl.toString()");
		}
	}

	public Class114(int var1, Class76 var2, Class76 var3, int var4) {
		try {
			this.anInt1897 = var4;
			this.anInt1898 = var1;
			this.aClass76_1905 = var3;
			this.aClass76_1901 = var2;
		} catch (RuntimeException var6) {
			throw Class14_Sub8_Sub14.method554(var6, "rl.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ','
					+ (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}
}
