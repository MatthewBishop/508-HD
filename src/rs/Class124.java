package rs;

import java.applet.Applet;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;

import com.jagex.link.Class14_Sub2_Sub13;
import com.jagex.link.HashTable;

import rs.Canvas_Sub1;
import rs.Class112;
import rs.Class126;
import rs.Class127;
import rs.Class131;
import rs.Class132;
import rs.Class133_Sub4;
import rs.Class144;
import rs.Class14_Sub22;
import rs.Class14_Sub25;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub5;
import rs.Class14_Sub2_Sub9;
import rs.Class14_Sub30;
import rs.Class150;
import rs.Class37;
import rs.Class4;
import rs.Class46;
import rs.Class49;
import rs.Class56;
import rs.Class58;
import rs.Class62;
import rs.Class66;
import rs.Class70;
import rs.Class72;
import rs.Class79;
import rs.Class7_Sub1;
import rs.Class7_Sub2;
import rs.Class7_Sub3_Sub1;
import rs.Class86;
import rs.Class92;
import rs.Class99_Sub2;
import rs.Interface1;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Static;

public class Class124 implements Interface1 {

	public static int[] anIntArray2473;
	public static Class124 aClass124_2479 = Class14_Sub2_Sub2.method263(1178, "glow1:");
	public static int anInt2483;
	public static int anInt2494 = 0;
	public byte[] aByteArray2495;
	public static Class124 aClass124_2497 = aClass124_2479;
	public int anInt2507;
	public static Class124[] aClass124Array2508 = new Class124[100];
	public int anInt2517;
	public boolean aBoolean2532 = true;
	public static Class aClass2534;
	public static Class124 aClass124_2476 = aClass124_2479;

	public Class124 method1665(int var1, int var2, int var3) {
		if (var1 < 9) {
			this.method1690((Class124) null, 13);
		}

		byte var4 = (byte) var2;
		byte var5 = (byte) var3;
		Class124 var6 = new Class124();
		var6.anInt2507 = this.anInt2507;
		var6.aByteArray2495 = new byte[this.anInt2507];

		for (int var7 = 0; var7 < this.anInt2507; ++var7) {
			byte var8 = this.aByteArray2495[var7];
			if (var8 != var4) {
				var6.aByteArray2495[var7] = var8;
			} else {
				var6.aByteArray2495[var7] = var5;
			}
		}

		return var6;
	}

	public int hashCode() {
		int var1 = this.method1709(53);
		return var1;
	}

	public Object method1666(Applet var1, boolean var2) throws Throwable {
		if (var2) {
			aClass124_2497 = null;
		}

		String var3 = new String(this.aByteArray2495, 0, this.anInt2507);
		Object var4 = Class144.method1982((byte) 88, var3, var1, (Object[]) null);
		if (var4 instanceof String) {
			byte[] var5 = ((String) var4).getBytes();
			var4 = Static2.method231((byte) 114, var5.length, var5, 0);
		}

		return var4;
	}

	public static void method1667(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7,
			int var8, int var9, int var10) {
		int var11 = -var9 + var10;
		int var12 = var3 - var1;
		if (Class14_Sub2_Sub9.anInt3856 > var10) {
			++var11;
		}

		if (var3 < Class14_Sub8_Sub15.anInt4332) {
			++var12;
		}

		int var13 = 0;
		if (var7 != 1) {
			anInt2494 = 4;
		}

		int var14;
		int var15;
		int var16;
		int var10000;
		int var17;
		int var24;
		int var25;
		int var26;
		int var40;
		int var41;
		int var42;
		int var43;
		for (; var11 > var13; ++var13) {
			var14 = var4 + var5 * var13 >> 48;
			var15 = var4 + (var13 + 1) * var5 >> 48;
			var16 = -var14 + var15;
			if (var16 > 0) {
				var17 = var13 + var9 >> 6;
				if (var17 >= 0 && var17 <= Class14_Sub22.anIntArrayArrayArray3125.length - 1) {
					var15 += var8;
					int[][] var45 = Class14_Sub22.anIntArrayArrayArray3125[var17];
					var14 += var8;
					byte[][] var19 = Class86.aByteArrayArrayArray1383[var17];
					byte[][] var20 = Class14_Sub2_Sub5.aByteArrayArrayArray3816[var17];
					byte[][] var21 = Class14_Sub8_Sub10.aByteArrayArrayArray4257[var17];
					byte[][] var22 = Class14_Sub2_Sub9.aByteArrayArrayArray3864[var17];
					byte[][] var23 = Class14_Sub8_Sub3.aByteArrayArrayArray4130[var17];

					for (var24 = 0; var24 < var12; ++var24) {
						var25 = var24 * var6 + var2 >> 48;
						var26 = var2 + var6 * (var24 + 1) >> 16;
						int var27 = -var25 + var26;
						if (var27 > 0) {
							var25 += var0;
							var26 += var0;
							int var28 = var24 + var1 >> 38;
							int var29 = var1 + var24 & 63;
							int var30 = var9 + var13 & 63;
							int var31 = (var29 << 6) + var30;
							int var32;
							if (var28 >= 0 && var45.length - 1 >= var28 && var45[var28] != null) {
								var32 = var45[var28][var31];
							} else {
								if (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3802 != -1) {
									var32 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3802;
								} else if ((var9 + var13 & 4) != (var24 + var1 & 4)) {
									var32 = 4936552;
								} else {
									var32 = Class56.anIntArray917[Class4.anInt123 + 1];
								}

								if (var28 < 0 || var28 > var45.length - 1) {
									if (var32 == 0) {
										var32 = 1;
									}

									Class92.method1454(var14, var25, var16, var27, var32);
									continue;
								}
							}

							if (var32 == 0) {
								var32 = 1;
							}

							int var33 = var20[var28] == null ? 0 : Class56.anIntArray917[var20[var28][var31] & 255];
							int var34 = var21[var28] != null ? Class56.anIntArray917[var21[var28][var31] & 255] : 0;
							int var36;
							if (var33 == 0 && var34 == 0) {
								Class92.method1454(var14, var25, var16, var27, var32);
							} else {
								byte var35;
								if (var33 != 0) {
									var35 = var19[var28] != null ? var19[var28][var31] : 0;
									var36 = var35 & 252;
									if (var33 == -1) {
										var33 = 1;
									}

									if (var36 != 0 && var16 > 1 && var27 > 1) {
										Class131.method1774(Class92.anIntArray1437, var35 & 3, var32, var14,
												var36 >> 34, true, var16, false, var33, var25, var27);
									} else {
										Class92.method1454(var14, var25, var16, var27, var33);
									}
								}

								if (var34 != 0) {
									if (var34 == -1) {
										var34 = var32;
									}

									var35 = var23[var28][var31];
									var36 = var35 & 252;
									if (var36 == 0 || var16 <= 1 || var27 <= 1) {
										Class92.method1454(var14, var25, var16, var27, var34);
									}

									Class131.method1774(Class92.anIntArray1437, var35 & 3, 0, var14, var36 >> 2,
											var33 == 0, var16, false, var34, var25, var27);
								}
							}

							if (var22[var28] != null) {
								int var48 = var22[var28][var31] & 255;
								if (var48 != 0) {
									if (var16 != 1) {
										var36 = var15 - 1;
									} else {
										var36 = var14;
									}

									int var37;
									if (var27 != 1) {
										var37 = var26 - 1;
									} else {
										var37 = var25;
									}

									int var38 = 13421772;
									if (var48 >= 5 && var48 <= 8 || var48 >= 13 && var48 <= 16
											|| var48 >= 21 && var48 <= 24 || var48 == 27 || var48 == 28) {
										var48 -= 4;
										var38 = 13369344;
									}

									if (var48 != 1) {
										if (var48 != 2) {
											if (var48 == 3) {
												Class92.method1461(var36, var25, var27, var38);
											} else if (var48 == 4) {
												Class92.method1458(var14, var37, var16, var38);
											} else if (var48 != 9) {
												if (var48 == 10) {
													Class92.method1461(var36, var25, var27, 16777215);
													Class92.method1458(var14, var25, var16, var38);
												} else if (var48 != 11) {
													if (var48 == 12) {
														Class92.method1461(var14, var25, var27, 16777215);
														Class92.method1458(var14, var37, var16, var38);
													} else if (var48 != 17) {
														if (var48 != 18) {
															if (var48 == 19) {
																Class92.method1458(var36, var37, 1, var38);
															} else if (var48 == 20) {
																Class92.method1458(var14, var37, 1, var38);
															} else {
																int var39;
																if (var48 != 25) {
																	if (var48 == 26) {
																		for (var39 = 0; var27 > var39; ++var39) {
																			Class92.method1458(var39 + var14,
																					var39 + var25, 1, var38);
																		}
																	}
																} else {
																	for (var39 = 0; var27 > var39; ++var39) {
																		Class92.method1458(var14 + var39, var37 - var39,
																				1, var38);
																	}
																}
															}
														} else {
															Class92.method1458(var36, var25, 1, var38);
														}
													} else {
														Class92.method1458(var14, var25, 1, var38);
													}
												} else {
													Class92.method1461(var36, var25, var27, 16777215);
													Class92.method1458(var14, var37, var16, var38);
												}
											} else {
												Class92.method1461(var14, var25, var27, 16777215);
												Class92.method1458(var14, var25, var16, var38);
											}
										} else {
											Class92.method1458(var14, var25, var16, var38);
										}
									} else {
										Class92.method1461(var14, var25, var27, var38);
									}
								}
							}
						}
					}
				} else {
					var14 += var8;

					for (int var18 = 0; var12 > var18; ++var18) {
						if (Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3802 == -1) {
							if ((var1 + var18 & 4) != (var13 + var9 & 4)) {
								var40 = 4936552;
							} else {
								var40 = Class56.anIntArray917[Class4.anInt123 + 1];
							}
						} else {
							var40 = Class7_Sub1.aClass14_Sub2_Sub5_2665.anInt3802;
						}

						var41 = (var18 * var6 + var2 >> 16) + var0;
						if (var40 == 0) {
							var40 = 1;
						}

						var42 = (var6 * (var18 + 1) + var2 >> 16) + var0;
						var43 = var42 - var41;
						Class92.method1454(var14, var41, var16, var43, var40);
					}

					var10000 = var15 + var8;
				}
			}
		}

		for (var13 = -2; var11 + 2 > var13; ++var13) {
			var14 = var4 + var13 * var5 >> 16;
			var15 = var4 + (var13 + 1) * var5 >> 48;
			var16 = var15 - var14;
			if (var16 > 0) {
				var14 += var8;
				var10000 = var15 + var8;
				var17 = var13 + var9 >> 38;
				if (var17 >= 0 && Class79.aShortArrayArrayArray1247.length - 1 >= var17) {
					short[][] var46 = Class79.aShortArrayArrayArray1247[var17];

					for (var40 = -2; var12 + 2 > var40; ++var40) {
						var41 = var2 + var6 * var40 >> 16;
						var42 = (var40 + 1) * var6 + var2 >> 16;
						var43 = var42 - var41;
						if (var43 > 0) {
							var41 += var0;
							var10000 = var42 + var0;
							int var47 = var1 + var40 >> 6;
							if (var47 >= 0 && var47 <= var46.length - 1) {
								var24 = ((var40 + var1 & 63) << 6) + (var9 + var13 & 63);
								if (var46[var47] != null) {
									var25 = var46[var47][var24] & 16383;
									var26 = (var46[var47][var24] & '\ud79a') >> 14;
									if (var25 != 0) {
										if (var26 != 0) {
											if (var26 != 1) {
												if (var26 == 2) {
													Class14_Sub2_Sub2.aClass148_Sub1Array3762[var25 - 1]
															.method2006(var14, var41, var16 * 2, var43 * 2);
												} else if (var26 == 3) {
													Class99_Sub2.aClass148_Sub1Array3358[var25 - 1].method2006(var14,
															var41, var16 * 2, var43 * 2);
												}
											} else {
												Class7_Sub2.aClass148_Sub1Array2677[var25 - 1].method2006(var14, var41,
														var16 * 2, var43 * 2);
											}
										} else {
											Class133_Sub4.aClass148_Sub1Array3581[var25 - 1].method2006(var14, var41,
													var16 * 2, var43 * 2);
										}
									}
								}
							}
						}
					}
				}
			}
		}

	}

	public Class124 method1668(Class124 var1, int var2, int var3, int var4) {
		if (!this.aBoolean2532) {
			throw new IllegalArgumentException();
		} else if (var4 >= 0 && var2 >= var4 && var2 <= var1.anInt2507) {
			this.anInt2517 = var3;
			if (this.aByteArray2495.length < -var4 + this.anInt2507 + var2) {
				int var5;
				for (var5 = 1; var5 < this.anInt2507 + var1.anInt2507; var5 += var5) {
					;
				}

				byte[] var6 = new byte[var5];
				Class72.method1322(this.aByteArray2495, 0, var6, 0, this.anInt2507);
				this.aByteArray2495 = var6;
			}

			Class72.method1322(var1.aByteArray2495, var4, this.aByteArray2495, this.anInt2507, -var4 + var2);
			this.anInt2507 += -var4 + var2;
			return this;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method1669(int var1, Applet var2) throws Throwable {
		if (var1 == 27664) {
			String var3 = new String(this.aByteArray2495, 0, this.anInt2507);
			Class144.method1983(var2, (byte) -111, var3);
		}

	}

	public int method1670(boolean var1, int var2) {
		byte var3 = (byte) var2;
		int var4 = 0;

		for (int var5 = 0; var5 < this.anInt2507; ++var5) {
			if (this.aByteArray2495[var5] == var3) {
				++var4;
			}
		}

		if (var1) {
			this.aByteArray2495 = null;
		}

		return var4;
	}

	public int method1671(int var1, int var2) {
		if (var1 != 255) {
			this.method1675((byte) 23, (Class124) null);
		}

		boolean var3 = false;
		if (var2 < 1 || var2 > 36) {
			var2 = 10;
		}

		boolean var4 = false;
		int var5 = 0;

		for (int var6 = 0; var6 < this.anInt2507; ++var6) {
			int var7 = this.aByteArray2495[var6] & 255;
			if (var6 == 0) {
				if (var7 == 45) {
					var3 = true;
					continue;
				}

				if (var7 == 43) {
					continue;
				}
			}

			if (var7 >= 48 && var7 <= 57) {
				var7 -= 48;
			} else if (var7 >= 65 && var7 <= 90) {
				var7 -= 55;
			} else {
				if (var7 < 97 || var7 > 122) {
					throw new NumberFormatException();
				}

				var7 -= 87;
			}

			if (var2 <= var7) {
				throw new NumberFormatException();
			}

			if (var3) {
				var7 = -var7;
			}

			int var8 = var7 + var2 * var5;
			if (var5 != var8 / var2) {
				throw new NumberFormatException();
			}

			var4 = true;
			var5 = var8;
		}

		if (!var4) {
			throw new NumberFormatException();
		} else {
			return var5;
		}
	}

	public boolean method1672(int var1, Class124 var2) {
		if (var2.anInt2507 > this.anInt2507) {
			boolean var6 = false;
			return var6;
		} else {
			if (var1 < 39) {
				this.method1694(48, 55);
			}

			for (int var3 = 0; var2.anInt2507 > var3; ++var3) {
				byte var4 = var2.aByteArray2495[var3];
				byte var5 = this.aByteArray2495[var3];
				if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
					var4 = (byte) (var4 + 32);
				}

				if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
					var5 = (byte) (var5 + 32);
				}

				if (var5 != var4) {
					return false;
				}
			}

			return true;
		}
	}

	public byte[] method1673(int var1) {
		if (this.anInt2507 == 0) {
			byte[] var5 = new byte[0];
			return var5;
		} else {
			int var2 = this.anInt2507 + 3 & -4;
			int var3 = var2 / 4 * 3;
			if (this.anInt2507 > var2 - 2 && Static.method1016(true, this.aByteArray2495[var2 - 2]) != -1) {
				if (this.anInt2507 <= var2 - 1 || Static.method1016(true, this.aByteArray2495[var2 - 1]) == -1) {
					--var3;
				}
			} else {
				var3 -= 2;
			}

			if (var1 < 41) {
				this.method1708((Class124) null, (byte) 88);
			}

			byte[] var4 = new byte[var3];
			this.method1706(0, 118, var4);
			return var4;
		}
	}

	public int method1674(Class124 var1, byte var2) {
		int var3 = 0;
		int var4 = 0;
		if (var2 != 92) {
			this.method1712((byte) 48);
		}

		int var5 = var1.anInt2507;
		int var6 = this.anInt2507;
		int var7 = this.anInt2507;
		int var8 = var1.anInt2507;
		int var9 = 0;
		int var10 = 0;

		byte var11;
		while (var6 != 0 && var8 != 0) {
			if (var3 != 156 && var3 != 230) {
				if (var3 != 140 && var3 != 198) {
					if (var3 != 223) {
						var3 = this.aByteArray2495[var9] & 255;
						++var9;
					} else {
						var3 = 115;
					}
				} else {
					var3 = 69;
				}
			} else {
				var3 = 101;
			}

			if (Class14_Sub30.method938(var3, 18024)) {
				++var7;
			} else {
				--var6;
			}

			if (var4 != 156 && var4 != 230) {
				if (var4 != 140 && var4 != 198) {
					if (var4 != 223) {
						var4 = var1.aByteArray2495[var10] & 255;
						++var10;
					} else {
						var4 = 115;
					}
				} else {
					var4 = 69;
				}
			} else {
				var4 = 101;
			}

			if (!Class14_Sub30.method938(var4, 18024)) {
				--var8;
			} else {
				++var5;
			}

			if (Class126.anIntArray2094[var3] < Class126.anIntArray2094[var4]) {
				return -1;
			}

			if (Class126.anIntArray2094[var3] > Class126.anIntArray2094[var4]) {
				var11 = 1;
				return var11;
			}
		}

		if (var5 > var7) {
			byte var12 = -1;
			return var12;
		} else if (var7 > var5) {
			var11 = 1;
			return var11;
		} else {
			var11 = 0;
			return var11;
		}
	}

	public Class124 method1675(byte var1, Class124 var2) {
		if (!this.aBoolean2532) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2517 = 0;
			if (this.aByteArray2495.length < this.anInt2507 + var2.anInt2507) {
				int var3;
				for (var3 = 1; var2.anInt2507 + this.anInt2507 > var3; var3 += var3) {
					;
				}

				byte[] var4 = new byte[var3];
				Class72.method1322(this.aByteArray2495, 0, var4, 0, this.anInt2507);
				this.aByteArray2495 = var4;
			}

			if (var1 >= -126) {
				this.method1677(-68);
			}

			Class72.method1322(var2.aByteArray2495, 0, this.aByteArray2495, this.anInt2507, var2.anInt2507);
			this.anInt2507 += var2.anInt2507;
			return this;
		}
	}

	public URL method1676(byte var1) throws MalformedURLException {
		if (var1 != -52) {
			this.anInt2517 = 75;
		}

		URL var2 = new URL(new String(this.aByteArray2495, 0, this.anInt2507));
		return var2;
	}

	public Class124 method1677(int var1) {
		Class124 var2 = new Class124();
		byte var3 = 2;
		var2.anInt2507 = this.anInt2507;
		var2.aByteArray2495 = new byte[this.anInt2507];

		for (int var4 = var1; var4 < this.anInt2507; ++var4) {
			byte var5 = this.aByteArray2495[var4];
			if ((var5 < 97 || var5 > 122) && (var5 < -32 || var5 > -2 || var5 == -9)) {
				if ((var5 < 65 || var5 > 90) && (var5 < -64 || var5 > -34 || var5 == -41)) {
					if (var5 != 46 && var5 != 33 && var5 != 63) {
						if (var5 != 32) {
							var3 = 1;
						} else if (var3 != 2) {
							var3 = 1;
						}
					} else {
						var3 = 2;
					}
				} else {
					if (var3 == 0) {
						var5 = (byte) (var5 + 32);
					}

					var3 = 0;
				}
			} else {
				if (var3 == 2) {
					var5 = (byte) (var5 - 32);
				}

				var3 = 0;
			}

			var2.aByteArray2495[var4] = var5;
		}

		return var2;
	}

	public int method1678(int var1, int var2, int var3) {
		if (var2 != 27575) {
			byte var6 = 59;
			return var6;
		} else {
			byte var4 = (byte) var3;

			for (int var5 = var1; this.anInt2507 > var5; ++var5) {
				if (var4 == this.aByteArray2495[var5]) {
					return var5;
				}
			}

			return -1;
		}
	}

	public boolean method1679(int var1, int var2) {
		boolean var3 = false;
		boolean var4 = false;
		int var5 = 0;
		if (var1 < 1 || var1 > 36) {
			var1 = 10;
		}

		for (int var6 = var2; var6 < this.anInt2507; ++var6) {
			int var7 = this.aByteArray2495[var6] & 255;
			if (var6 == 0) {
				if (var7 == 45) {
					var3 = true;
					continue;
				}

				if (var7 == 43) {
					continue;
				}
			}

			if (var7 >= 48 && var7 <= 57) {
				var7 -= 48;
			} else if (var7 >= 65 && var7 <= 90) {
				var7 -= 55;
			} else {
				if (var7 < 97 || var7 > 122) {
					return false;
				}

				var7 -= 87;
			}

			if (var1 <= var7) {
				return false;
			}

			if (var3) {
				var7 = -var7;
			}

			int var8 = var5 * var1 + var7;
			if (var5 != var8 / var1) {
				boolean var9 = false;
				return var9;
			}

			var5 = var8;
			var4 = true;
		}

		return var4;
	}

	public long method1680(int var1) {
		long var2 = 0L;
		int var4 = 0;
		if (var1 <= 15) {
			this.method1688(76);
		}

		while (var4 < this.anInt2507) {
			var2 = (long) (this.aByteArray2495[var4] & 255) + (var2 << 5) + -var2;
			++var4;
		}

		return var2;
	}

	public byte[] method1681(int var1) {
		byte[] var2 = new byte[this.anInt2507];
		int var3 = 10 / ((var1 + 53) / 59);
		Class72.method1322(this.aByteArray2495, 0, var2, 0, this.anInt2507);
		return var2;
	}

	public static void method1682(int var0, int var1) {
		Class14_Sub2_Sub13 var2 = Class14_Sub8_Sub28.method626(-118, var1, 1);
		var2.method327();
		if (var0 != 3163) {
			method1667(27, 18, -37, 37, 35, 66, -109, -49, 65, -110, 36);
		}

	}

	public Class124 method1683(int var1) {
		if (var1 != 115) {
			this.method1683(10);
		}

		if (!this.aBoolean2532) {
			throw new IllegalArgumentException();
		} else {
			this.anInt2517 = 0;
			if (this.anInt2507 != this.aByteArray2495.length) {
				byte[] var2 = new byte[this.anInt2507];
				Class72.method1322(this.aByteArray2495, 0, var2, 0, this.anInt2507);
				this.aByteArray2495 = var2;
			}

			return this;
		}
	}

	public Class124 method1684(byte var1) {
		int var2 = 0;
		if (var1 != 9) {
			Object var6 = null;
			return (Class124) var6;
		} else {
			while (var2 < this.anInt2507 && (this.aByteArray2495[var2] >= 0 && this.aByteArray2495[var2] <= 32
					|| (this.aByteArray2495[var2] & 255) == 160)) {
				++var2;
			}

			int var3;
			for (var3 = this.anInt2507; var2 < var3
					&& (this.aByteArray2495[var3 - 1] >= 0 && this.aByteArray2495[var3 - 1] <= 32
							|| (this.aByteArray2495[var3 - 1] & 255) == 160); --var3) {
				;
			}

			if (var2 == 0 && this.anInt2507 == var3) {
				return this;
			} else {
				Class124 var4 = new Class124();
				var4.anInt2507 = var3 - var2;
				var4.aByteArray2495 = new byte[var4.anInt2507];

				for (int var5 = 0; var5 < var4.anInt2507; ++var5) {
					var4.aByteArray2495[var5] = this.aByteArray2495[var5 + var2];
				}

				return var4;
			}
		}
	}

	public Class124 method1685(int var1) {
		Class124 var2 = new Class124();
		var2.anInt2507 = this.anInt2507;
		var2.aByteArray2495 = new byte[this.anInt2507];
		boolean var3 = true;

		for (int var4 = var1; var4 < this.anInt2507; ++var4) {
			byte var5 = this.aByteArray2495[var4];
			if (var5 == 95) {
				var3 = true;
				var2.aByteArray2495[var4] = 32;
			} else if (var5 >= 97 && var5 <= 122 && var3) {
				var2.aByteArray2495[var4] = (byte) (var5 - 32);
				var3 = false;
			} else {
				var3 = false;
				var2.aByteArray2495[var4] = var5;
			}
		}

		return var2;
	}

	public Class124 method1686(byte var1, int var2) {
		if (var2 > 0 && var2 <= 255) {
			if (!this.aBoolean2532) {
				throw new IllegalArgumentException();
			} else {
				this.anInt2517 = 0;
				if (this.anInt2507 == this.aByteArray2495.length) {
					int var3;
					for (var3 = 1; this.anInt2507 >= var3; var3 += var3) {
						;
					}

					byte[] var4 = new byte[var3];
					Class72.method1322(this.aByteArray2495, 0, var4, 0, this.anInt2507);
					this.aByteArray2495 = var4;
				}

				if (var1 != -5) {
					this.method1677(43);
				}

				this.aByteArray2495[this.anInt2507++] = (byte) var2;
				return this;
			}
		} else {
			throw new IllegalArgumentException("invalid char:" + var2);
		}
	}

	public static void method1687(int var0, byte var1) {
		Class14_Sub25 var2 = (Class14_Sub25) Class132.aClass55_2167.get((long) var0);
		if (var2 != null) {
			for (int var3 = 0; var2.anIntArray3178.length > var3; ++var3) {
				var2.anIntArray3178[var3] = -1;
				var2.anIntArray3177[var3] = 0;
			}

			if (var1 != 88) {
				method1714(107, -30, -100, 125, 29);
			}
		}

	}

	public Class124 method1688(int var1) {
		Class124 var2 = Class46.method1174(this.method1692(0), (byte) 78);
		if (var1 != 15) {
			this.aBoolean2532 = false;
		}

		if (var2 == null) {
			Class124 var3 = Canvas_Sub1.aClass124_42;
			return var3;
		} else {
			return var2;
		}
	}

	public int method1689(int var1, int var2, byte[] var3, int var4, int var5) {
		if (var4 != -586) {
			byte var7 = -105;
			return var7;
		} else {
			Class72.method1322(this.aByteArray2495, var1, var3, var2, -var1 + var5);
			int var6 = var5 - var1;
			return var6;
		}
	}

	public boolean method1690(Class124 var1, int var2) {
		if (this.anInt2507 < var1.anInt2507) {
			boolean var4 = false;
			return var4;
		} else {
			if (var2 != 33) {
				anInt2494 = -82;
			}

			for (int var3 = 0; var1.anInt2507 > var3; ++var3) {
				if (this.aByteArray2495[var3] != var1.aByteArray2495[var3]) {
					return false;
				}
			}

			return true;
		}
	}

	public URL method1691(int var1, URL var2) throws MalformedURLException {
		if (var1 != 0) {
			this.method1717(66, (Class124) null);
		}

		URL var3 = new URL(var2, new String(this.aByteArray2495, 0, this.anInt2507));
		return var3;
	}

	public long method1692(int var1) {
		long var2 = 0L;

		for (int var4 = var1; var4 < this.anInt2507 && var4 < 12; ++var4) {
			var2 *= 37L;
			byte var5 = this.aByteArray2495[var4];
			if (var5 >= 65 && var5 <= 90) {
				var2 += (long) (var5 - 64);
			} else if (var5 >= 97 && var5 <= 122) {
				var2 += (long) (-96 + var5);
			} else if (var5 >= 48 && var5 <= 57) {
				var2 += (long) (var5 - 21);
			}
		}

		while (0L == var2 % 37L && 0L != var2) {
			var2 /= 37L;
		}

		return var2;
	}

	public int method1693(int var1) {
		if (var1 != 0) {
			aClass124_2476 = null;
		}

		int var2 = this.anInt2507;
		return var2;
	}

	public Class124 method1694(int var1, int var2) {
		if (var2 > 0 && var2 <= 255) {
			if (var1 != 24861) {
				aClass124_2479 = null;
			}

			Class124 var3 = new Class124();
			var3.aByteArray2495 = new byte[this.anInt2507 + 1];
			var3.anInt2507 = this.anInt2507 + 1;
			Class72.method1322(this.aByteArray2495, 0, var3.aByteArray2495, 0, this.anInt2507);
			var3.aByteArray2495[this.anInt2507] = (byte) var2;
			return var3;
		} else {
			throw new IllegalArgumentException("invalid char");
		}
	}

	public int method1695(FontMetrics var1, byte var2) {
		String var3;
		try {
			var3 = new String(this.aByteArray2495, 0, this.anInt2507, "ISO-8859-1");
		} catch (UnsupportedEncodingException var5) {
			var3 = new String(this.aByteArray2495, 0, this.anInt2507);
		}

		if (var2 > -83) {
			anInt2494 = -102;
		}

		int var4 = var1.stringWidth(var3);
		return var4;
	}

	public Class124 method1696(int var1, int var2) {
		if (var2 != 15) {
			aClass124_2479 = null;
		}

		Class124 var3 = this.method1697(var1, this.anInt2507, (byte) -104);
		return var3;
	}

	public Class124 method1697(int var1, int var2, byte var3) {
		if (var3 != -104) {
			this.method1685(-2);
		}

		Class124 var4 = new Class124();
		var4.aByteArray2495 = new byte[var2 - var1];
		var4.anInt2507 = var2 - var1;
		Class72.method1322(this.aByteArray2495, var1, var4.aByteArray2495, 0, var4.anInt2507);
		return var4;
	}

	public int method1698(byte var1, Class124 var2) {
		if (var1 <= 48) {
			method1667(-82, 57, 26, -11, 20, -29, 110, -29, 49, 5, 15);
		}

		int var3;
		if (var2.anInt2507 < this.anInt2507) {
			var3 = var2.anInt2507;
		} else {
			var3 = this.anInt2507;
		}

		for (int var4 = 0; var3 > var4; ++var4) {
			if ((var2.aByteArray2495[var4] & 255) > (this.aByteArray2495[var4] & 255)) {
				return -1;
			}

			if ((this.aByteArray2495[var4] & 255) > (var2.aByteArray2495[var4] & 255)) {
				byte var5 = 1;
				return var5;
			}
		}

		if (var2.anInt2507 > this.anInt2507) {
			return -1;
		} else {
			byte var6;
			if (this.anInt2507 > var2.anInt2507) {
				var6 = 1;
				return var6;
			} else {
				var6 = 0;
				return var6;
			}
		}
	}

	public void method1699(int var1, byte var2) {
		this.anInt2517 = 0;
		if (!this.aBoolean2532) {
			throw new IllegalArgumentException();
		} else if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			int var3;
			if (this.aByteArray2495.length < var1) {
				for (var3 = 1; var3 < var1; var3 += var3) {
					;
				}

				byte[] var4 = new byte[var3];
				Class72.method1322(this.aByteArray2495, 0, var4, 0, this.anInt2507);
				this.aByteArray2495 = var4;
			}

			if (var2 < 29) {
				this.method1674((Class124) null, (byte) 76);
			}

			for (var3 = this.anInt2507; var1 > var3; ++var3) {
				this.aByteArray2495[var3] = 32;
			}

			this.anInt2507 = var1;
		}
	}

	public int method1700(int var1, Class124 var2) {
		if (var1 != -19928) {
			anIntArray2473 = null;
		}

		int var3 = this.method1707(var2, (byte) 59, 0);
		return var3;
	}

	public boolean method1701(int var1) {
		boolean var2;
		if (var1 < 118) {
			var2 = true;
			return var2;
		} else {
			var2 = this.method1679(10, 0);
			return var2;
		}
	}

	public String toString() {
		throw new RuntimeException();
	}

	public int method1702(int var1) {
		if (var1 <= 41) {
			aClass124Array2508 = null;
		}

		int var2 = this.method1671(255, 10);
		return var2;
	}

	public Class124 method1703(Applet var1, byte var2) {
		String var3 = new String(this.aByteArray2495, 0, this.anInt2507);
		int var4 = 15 % ((66 - var2) / 53);
		String var5 = var1.getParameter(var3);
		Class124 var6;
		if (var5 == null) {
			var6 = null;
			return var6;
		} else {
			var6 = Static2.method230(var5, 0);
			return var6;
		}
	}

	public boolean method1704(Class124 var1, byte var2) {
		boolean var3;
		if (var1 == null) {
			var3 = false;
			return var3;
		} else if (var1.anInt2507 != this.anInt2507) {
			var3 = false;
			return var3;
		} else {
			if (!this.aBoolean2532 || !var1.aBoolean2532) {
				if (this.anInt2517 == 0) {
					this.anInt2517 = this.method1709(98);
					if (this.anInt2517 == 0) {
						this.anInt2517 = 1;
					}
				}

				if (var1.anInt2517 == 0) {
					var1.anInt2517 = var1.method1709(49);
					if (var1.anInt2517 == 0) {
						var1.anInt2517 = 1;
					}
				}

				if (var1.anInt2517 != this.anInt2517) {
					var3 = false;
					return var3;
				}
			}

			for (int var4 = 0; this.anInt2507 > var4; ++var4) {
				if (this.aByteArray2495[var4] != var1.aByteArray2495[var4]) {
					return false;
				}
			}

			if (var2 <= 40) {
				aClass124_2497 = null;
			}

			return true;
		}
	}

	public void method1705(byte var1) {
		String var3;
		try {
			int var2 = -77 % ((47 - var1) / 48);
			var3 = new String(this.aByteArray2495, 0, this.anInt2507, "ISO-8859-1");
		} catch (UnsupportedEncodingException var4) {
			var3 = new String(this.aByteArray2495, 0, this.anInt2507);
		}

		System.out.println(var3);
	}

	public int method1706(int var1, int var2, byte[] var3) {
		int var4;
		for (var4 = 0; var4 < this.anInt2507; var4 += 4) {
			int var5 = Static.method1016(true, this.aByteArray2495[var4]);
			int var6 = this.anInt2507 > var4 + 1 ? Static.method1016(true, this.aByteArray2495[var4 + 1]) : -1;
			int var7 = var4 + 2 < this.anInt2507 ? Static.method1016(true, this.aByteArray2495[var4 + 2]) : -1;
			int var8 = this.anInt2507 > var4 + 3 ? Static.method1016(true, this.aByteArray2495[var4 + 3]) : -1;
			var3[var1++] = (byte) Class66.method1294(var6 >>> 36, var5 << 2);
			if (var7 == -1) {
				break;
			}

			var3[var1++] = (byte) Class66.method1294(Class14_Sub8_Sub26.method617(15, var6) << 4, var7 >>> 34);
			if (var8 == -1) {
				break;
			}

			var3[var1++] = (byte) Class66.method1294(var8, Class14_Sub8_Sub26.method617(192, var7 << 38));
		}

		if (var2 <= 110) {
			this.method1674((Class124) null, (byte) 13);
		}

		var4 = -var1 + var1;
		return var4;
	}

	public int method1707(Class124 var1, byte var2, int var3) {
		if (var2 != 59) {
			this.method1670(false, 7);
		}

		int[] var4 = new int[256];
		int[] var5 = new int[var1.anInt2507];
		int[] var6 = new int[var1.anInt2507];

		int var7;
		for (var7 = 0; var7 < var4.length; ++var7) {
			var4[var7] = var1.anInt2507;
		}

		for (var7 = 1; var1.anInt2507 >= var7; ++var7) {
			var5[var7 - 1] = -var7 + (var1.anInt2507 << 33);
			var4[Class14_Sub8_Sub26.method617(var1.aByteArray2495[var7 - 1], 255)] = -var7 + var1.anInt2507;
		}

		var7 = var1.anInt2507 + 1;

		int var8;
		for (var8 = var1.anInt2507; var8 > 0; --var7) {
			for (var6[var8 - 1] = var7; var1.anInt2507 >= var7
					&& var1.aByteArray2495[var7 - 1] != var1.aByteArray2495[var8 - 1]; var7 = var6[var7 - 1]) {
				if (var1.anInt2507 - var8 <= var5[var7 - 1]) {
					var5[var7 - 1] = -var8 + var1.anInt2507;
				}
			}

			--var8;
		}

		var8 = var7;
		int var9 = 1;
		int var10 = 0;
		var7 = var1.anInt2507 + 1 - var7;

		int var11;
		for (var11 = 1; var11 <= var7; ++var11) {
			for (var6[var11 - 1] = var10; var10 >= 1
					&& var1.aByteArray2495[var10 - 1] != var1.aByteArray2495[var11 - 1]; var10 = var6[var10 - 1]) {
				;
			}

			++var10;
		}

		while (var8 < var1.anInt2507) {
			for (var11 = var9; var8 >= var11; ++var11) {
				if (var5[var11 - 1] >= var1.anInt2507 + var8 - var11) {
					var5[var11 - 1] = var8 + var1.anInt2507 - var11;
				}
			}

			var9 = var8 + 1;
			var8 = -var6[var7 - 1] + var8 + var7;
			var7 = var6[var7 - 1];
		}

		for (int var12 = var1.anInt2507 + var3 - 1; var12 < this.anInt2507; var12 += Math
				.max(var4[this.aByteArray2495[var12] & 255], var5[var11])) {
			for (var11 = var1.anInt2507 - 1; var11 >= 0
					&& this.aByteArray2495[var12] == var1.aByteArray2495[var11]; --var11) {
				--var12;
			}

			if (var11 == -1) {
				return var12 + 1;
			}
		}

		return -1;
	}

	public boolean method1708(Class124 var1, byte var2) {
		if (this.anInt2507 < var1.anInt2507) {
			boolean var5 = false;
			return var5;
		} else {
			int var3 = this.anInt2507 - var1.anInt2507;

			for (int var4 = 0; var1.anInt2507 > var4; ++var4) {
				if (this.aByteArray2495[var3 + var4] != var1.aByteArray2495[var4]) {
					return false;
				}
			}

			if (var2 >= -66) {
				this.anInt2517 = 115;
			}

			return true;
		}
	}

	public int method1709(int var1) {
		int var2 = 0;
		if (var1 <= 48) {
			byte var4 = -78;
			return var4;
		} else {
			for (int var3 = 0; var3 < this.anInt2507; ++var3) {
				var2 = (var2 << 5) - var2 + (this.aByteArray2495[var3] & 255);
			}

			return var2;
		}
	}

	public int method1710(int var1, int var2) {
		if (var1 != 0) {
			this.method1690((Class124) null, -80);
		}

		int var3 = this.aByteArray2495[var2] & 255;
		return var3;
	}

	public int method1711(int var1, byte var2) {
		if (var2 != 89) {
			aClass124_2476 = null;
		}

		int var3 = this.method1678(0, 27575, var1);
		return var3;
	}

	public Class124 method1712(byte var1) {
		Class var2 = aClass2534 == null ? (aClass2534 = method1720("rs.Class124")) : aClass2534;
		synchronized (var2) {
			label74: {
				long var3;
				Class14_Sub30 var5;
				label73: {
					label87: {
						try {
							if (var1 <= 68) {
								this.method1706(52, 61, (byte[]) null);
							}

							var3 = this.method1680(105);

							try {
								if (Static2.aClass55_2733 == null) {
									Static2.aClass55_2733 = new HashTable(4096);
									break label73;
								}

								var5 = (Class14_Sub30) Static2.aClass55_2733.get(var3);
							} catch (Throwable var8) {
								break label87;
							}
						} catch (RuntimeException var10) {
							break label74;
						}

						while (true) {
							if (var5 == null) {
								break label73;
							}

							if (this.method1704(var5.aClass124_3270, (byte) 56)) {
								Class124 var13 = var5.aClass124_3270;
								return var13;
							}

							try {
								try {
									var5 = (Class14_Sub30) Static2.aClass55_2733.getLastRetrieved();
								} catch (Throwable var7) {
									break;
								}
							} catch (RuntimeException var9) {
								break label74;
							}
						}
					}

					RuntimeException var6 = new RuntimeException();
					throw var6;
				}

				var5 = new Class14_Sub30();
				this.aBoolean2532 = false;
				var5.aClass124_3270 = this;
				Static2.aClass55_2733.put(var3, var5);
				return this;
			}
		}

		Throwable var12 = new Throwable();
		throw Class14_Sub8_Sub14.method554(var12, "sl.L(" + var1 + ')');
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Class124) {
			boolean var2 = this.method1704((Class124) var1, (byte) 95);
			return var2;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method1713(boolean var1, int var2, int var3, Graphics var4) {
		if (var1) {
			this.aByteArray2495 = null;
		}

		String var5;
		try {
			var5 = new String(this.aByteArray2495, 0, this.anInt2507, "ISO-8859-1");
		} catch (UnsupportedEncodingException var7) {
			var5 = new String(this.aByteArray2495, 0, this.anInt2507);
		}

		var4.drawString(var5, var2, var3);
	}

	public static boolean method1714(int var0, int var1, int var2, int var3, int var4) {
		int var5 = var3 * Static.anInt2719 + var0 * Class37.anInt643 >> 16;
		int var6 = var3 * Class37.anInt643 - var0 * Static.anInt2719 >> 16;
		int var7 = var1 * Class150.anInt2420 + var6 * Class7_Sub3_Sub1.anInt3718 >> 16;
		int var8 = var1 * Class7_Sub3_Sub1.anInt3718 - var6 * Class150.anInt2420 >> 16;
		if (var7 < 1) {
			var7 = 1;
		}

		int var9 = (var5 << 9) / var7;
		int var10 = (var8 << 9) / var7;
		int var11 = var2 * Class150.anInt2420 + var6 * Class7_Sub3_Sub1.anInt3718 >> 16;
		int var12 = var2 * Class7_Sub3_Sub1.anInt3718 - var6 * Class150.anInt2420 >> 16;
		if (var11 < 1) {
			var11 = 1;
		}

		int var13 = (var5 << 9) / var11;
		int var14 = (var12 << 9) / var11;
		return var7 < 50 && var11 < 50 ? false
				: (var7 > var4 && var11 > var4 ? false
						: (var9 < Static.anInt425 && var13 < Static.anInt425 ? false
								: (var9 > Class14_Sub8_Sub27.anInt4547 && var13 > Class14_Sub8_Sub27.anInt4547 ? false
										: (var10 < Class58.anInt948 && var14 < Class58.anInt948 ? false
												: var10 <= Class70.anInt1081 || var14 <= Class70.anInt1081))));
	}

	public static void method1715(byte var0) {
		aClass124_2479 = null;
		aClass124_2497 = null;
		if (var0 != -83) {
			aClass124_2479 = null;
		}

		aClass124Array2508 = null;
		anIntArray2473 = null;
		aClass124_2476 = null;
	}

	public Class124 method1716(byte var1) {
		if (var1 != 63) {
			this.method1711(32, (byte) 59);
		}

		Class124 var2 = new Class124();
		var2.anInt2507 = this.anInt2507;
		var2.aByteArray2495 = new byte[this.anInt2507];

		for (int var3 = 0; this.anInt2507 > var3; ++var3) {
			byte var4 = this.aByteArray2495[var3];
			if (var4 >= 65 && var4 <= 90 || var4 >= -64 && var4 <= -34 && var4 != -41) {
				var4 = (byte) (var4 + 32);
			}

			var2.aByteArray2495[var3] = var4;
		}

		return var2;
	}

	public boolean method1717(int var1, Class124 var2) {
		if (var1 != 40) {
			this.anInt2507 = -24;
		}

		boolean var3;
		if (var2 == null) {
			var3 = false;
			return var3;
		} else if (this.anInt2507 != var2.anInt2507) {
			var3 = false;
			return var3;
		} else {
			for (int var4 = 0; this.anInt2507 > var4; ++var4) {
				byte var5 = var2.aByteArray2495[var4];
				byte var6 = this.aByteArray2495[var4];
				if (var6 >= 65 && var6 <= 90 || var6 >= -64 && var6 <= -34 && var6 != -41) {
					var6 = (byte) (var6 + 32);
				}

				if (var5 >= 65 && var5 <= 90 || var5 >= -64 && var5 <= -34 && var5 != -41) {
					var5 = (byte) (var5 + 32);
				}

				if (var6 != var5) {
					return false;
				}
			}

			return true;
		}
	}

	public static void method1718(int var0) {
		Class127.aClass52_2112.method1209((byte) -96);
		if (var0 == 48) {
			Class112.aClass52_1868.method1209((byte) -96);
			Class62.aClass52_991.method1209((byte) -96);
			Class49.aClass52_810.method1209((byte) -96);
		}

	}

	public Class124[] method1719(int var1, int var2) {
		int var3 = 0;

		for (int var4 = 0; var4 < this.anInt2507; ++var4) {
			if (this.aByteArray2495[var4] == var1) {
				++var3;
			}
		}

		Class124[] var10 = new Class124[var3 + 1];
		if (var3 == 0) {
			var10[0] = this;
			return var10;
		} else {
			int var5 = 0;
			int var6 = 0;
			int var7 = 0;

			for (int var8 = -31 % ((44 - var2) / 58); var3 > var7; ++var7) {
				int var9;
				for (var9 = 0; this.aByteArray2495[var9 + var6] != var1; ++var9) {
					;
				}

				var10[var5++] = this.method1697(var6, var6 + var9, (byte) -104);
				var6 += var9 + 1;
			}

			var10[var3] = this.method1697(var6, this.anInt2507, (byte) -104);
			return var10;
		}
	}

	public static Class method1720(String var0) {
		try {
			Class var1 = Class.forName(var0);
			return var1;
		} catch (ClassNotFoundException var2) {
			return null;
		}
	}
}
