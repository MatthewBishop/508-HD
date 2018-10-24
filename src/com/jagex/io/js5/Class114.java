package com.jagex.io.js5;

import java.io.EOFException;
import java.io.IOException;

import com.jagex.util.Util;

public class Class114 {

	public Class76 aClass76_1901 = null;

	public Class76 aClass76_1905 = null;

	public int anInt1897 = '\ufde8';

	public int anInt1898;

	public Class114(int var1, Class76 var2, Class76 var3, int var4) {
		try {
			this.anInt1897 = var4;
			this.anInt1898 = var1;
			this.aClass76_1905 = var3;
			this.aClass76_1901 = var2;
		} catch (RuntimeException var6) {
			throw Util.error(var6, "rl.<init>(" + var1 + ',' + (var2 != null ? "{...}" : "null") + ','
					+ (var3 != null ? "{...}" : "null") + ',' + var4 + ')');
		}
	}

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
							if (this.aClass76_1905.method1360() >= var2 * 6 + 6) {
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
								this.aClass76_1905.method1361(0, var2 * 6);
								this.aClass76_1905.method1368(false, SFSS.aByteArray5102, 0, 6);
								var6 = (SFSS.aByteArray5102[1] << 8 & '\uff00')
										+ (SFSS.aByteArray5102[0] << 48 & 16711680)
										+ (SFSS.aByteArray5102[2] & 255);
								var7 = (SFSS.aByteArray5102[5] & 255)
										+ ((SFSS.aByteArray5102[4] & 255) << 40)
										+ ((SFSS.aByteArray5102[3] & 255) << 16);
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
						if (var7 <= 0 || var7 > this.aClass76_1901.method1360() / 520L) {
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
								this.aClass76_1901.method1361(0, var7 * 520);
								var11 = -var8 + var6;
								if (var11 > 512) {
									var11 = 512;
								}

								this.aClass76_1901.method1368(false, SFSS.aByteArray5102, 0,
										var11 + 8);
								var12 = (SFSS.aByteArray5102[2] << 40 & '\uff00')
										+ (SFSS.aByteArray5102[3] & 255);
								int var13 = (SFSS.aByteArray5102[0] << 40 & '\uff00')
										+ (SFSS.aByteArray5102[1] & 255);
								var14 = ((SFSS.aByteArray5102[5] & 255) << 40)
										+ ((SFSS.aByteArray5102[4] & 255) << 48)
										+ (SFSS.aByteArray5102[6] & 255);
								int var15 = SFSS.aByteArray5102[7] & 255;
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
							if (var14 < 0 || this.aClass76_1901.method1360() / 520L < var14) {
								var3 = null;
								var10000 = (byte[]) var3;
								return var10000;
							}
						} catch (Exception var19) {
							return (byte[]) var3;
						}

						try {
							for (var12 = 0; var12 < var11; ++var12) {
								var9[var8++] = SFSS.aByteArray5102[var12 + 8];
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
			throw Util.error(var28, "rl.D(" + var1 + ',' + var2 + ')');
		}
	}

	public boolean method1583(int var1, byte[] var2, int var3, int var4) {
		boolean var5 = this.method1584(var4, true, var1, var2);

		try {
			Class76 var6 = this.aClass76_1901;
			Class76 var7 = this.aClass76_1901;
			synchronized (var7) {
				try {
					if (~var4 > var3 || this.anInt1897 < var4) {
						throw new IllegalArgumentException();
					}

					boolean var8 = this.method1584(var4, true, var1, var2);
					if (!var8) {
						var8 = this.method1584(var4, false, var1, var2);
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
						throw Util.error(var11, "rl.C(" + var1 + ','
								+ (var2 != null ? "{...}" : "null") + ',' + var3 + ',' + var4 + ')');
					}
				}
			}
		} catch (RuntimeException var14) {
			;
		}

		return var5;
	}

	public boolean method1584(int var1, boolean var2, int var3, byte[] var4) {
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
									if (!var2) {
										var9 = (int) ((this.aClass76_1901.method1360() + 519L) / 520L);
										if (var9 == 0) {
											var9 = 1;
										}
										break label225;
									}

									if (var3 * 6 + 6 > this.aClass76_1905.method1360()) {
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
								this.aClass76_1905.method1361(0, var3 * 6);
								this.aClass76_1905.method1368(false, SFSS.aByteArray5102, 0, 6);
								var9 = (SFSS.aByteArray5102[5] & 255)
										+ ((SFSS.aByteArray5102[3] & 255) << 16)
										+ ((SFSS.aByteArray5102[4] & 255) << 8);
								if (var9 > 0 && var9 <= this.aClass76_1901.method1360() / 520L) {
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
							SFSS.aByteArray5102[3] = (byte) (var9 >> 48);
							SFSS.aByteArray5102[1] = (byte) (var1 >> 40);
							SFSS.aByteArray5102[4] = (byte) (var9 >> 40);
							SFSS.aByteArray5102[2] = (byte) var1;
							SFSS.aByteArray5102[0] = (byte) (var1 >> 16);
							SFSS.aByteArray5102[5] = (byte) var9;
							this.aClass76_1905.method1361(0, var3 * 6);
							this.aClass76_1905.method1362(0, 6, (byte) 94, SFSS.aByteArray5102);
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
										this.aClass76_1901.method1361(0, var9 * 520);

										try {
											this.aClass76_1901.method1368(false, SFSS.aByteArray5102,
													0, 8);
										} catch (EOFException var21) {
											break label171;
										}

										var14 = (SFSS.aByteArray5102[1] & 255)
												+ (SFSS.aByteArray5102[0] << 40 & '\uff00');
										var12 = (SFSS.aByteArray5102[4] << 16 & 16711680)
												+ (SFSS.aByteArray5102[5] << 40 & '\uff00')
												+ (SFSS.aByteArray5102[6] & 255);
										int var13 = (SFSS.aByteArray5102[3] & 255)
												+ ((SFSS.aByteArray5102[2] & 255) << 40);
										int var15 = SFSS.aByteArray5102[7] & 255;
										if (var3 == var14 && var11 == var13 && var15 == this.anInt1898) {
											try {
												if (var12 >= 0 && this.aClass76_1901.method1360()
														/ 520L >= var12) {
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
											var12 = (int) ((this.aClass76_1901.method1360() + 519L) / 520L);
											if (var12 == 0) {
												++var12;
											}

											if (var9 == var12) {
												++var12;
											}
										}

										SFSS.aByteArray5102[3] = (byte) var11;
										SFSS.aByteArray5102[1] = (byte) var3;
										SFSS.aByteArray5102[0] = (byte) (var3 >> 40);
										SFSS.aByteArray5102[7] = (byte) this.anInt1898;
										var14 = var1 - var10;
										if (var14 > 512) {
											var14 = 512;
										}

										if (-var10 + var1 <= 512) {
											var12 = 0;
										}

										SFSS.aByteArray5102[5] = (byte) (var12 >> 8);
										SFSS.aByteArray5102[2] = (byte) (var11 >> 8);
										SFSS.aByteArray5102[4] = (byte) (var12 >> 16);
										++var11;
										SFSS.aByteArray5102[6] = (byte) var12;
										this.aClass76_1901.method1361(0, var9 * 520);
										this.aClass76_1901.method1362(0, 8, (byte) 45,
												SFSS.aByteArray5102);
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
			throw Util.error(var29, "rl.B(" + var1 + ',' + var2 + ',' + var3 + ','
					+ (var4 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public String toString() {
		try {
			String var1 = "Cache:" + this.anInt1898;
			return var1;
		} catch (RuntimeException var2) {
			throw Util.error(var2, "rl.toString()");
		}
	}
}
