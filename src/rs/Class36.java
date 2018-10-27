package rs;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import com.jagex.applet.Class31;
import com.jagex.applet.Class43;
import com.jagex.applet.ErrorReporting;
import com.jagex.link.ref.SoftCache;
import com.jagex.util.Util;

public class Class36 implements Runnable {

	public static Class124 aClass124_628 = Class124.method263(" <col=ffff00>");
	public static SoftCache aClass52_621 = new SoftCache(260);
	public static int anInt612 = 0;
	public static int anInt629;
	public static int anInt630;
	public static int anInt631;
	public static int[] anIntArray626 = new int[1000];
	public static int[] anIntArray632 = new int[128];
	public static Class40 method1098(int var0, int var1, int var2) {
		Class14_Sub29 var3 = JunkTex.aClass14_Sub29ArrayArrayArray3368[var0][var1][var2];
		if (var3 == null) {
			return null;
		} else {
			for (int var4 = 0; var4 < var3.anInt3242; ++var4) {
				Class40 var5 = var3.aClass40Array3257[var4];
				if ((var5.bitPacked >> 29 & 3L) == 2L && var5.anInt668 == var1 && var5.anInt678 == var2) {
					Static2.method1279(var5);
					return var5;
				}
			}

			return null;
		}
	}
	public static void method1102(byte var0) {
		aClass124_628 = null;
		anIntArray626 = null;
		aClass52_621 = null;
		anIntArray632 = null;
		if (var0 != -40) {
			anInt612 = -95;
		}

	}
	public static int method1103(byte var0, int var1) {
		int var2 = var1 & 127;
		return var2;
	}
	public static boolean method1105(byte var0, int var1) {
		boolean var2 = (var1 >> 21 & 1) != 0;
		return var2;
	}
	public static void method1106(int var0) {
		if (JunkTex.aFloat2854 > Class90.aFloat1426) {
			Class90.aFloat1426 = (float) (Class90.aFloat1426 + Class90.aFloat1426 / 30.0D);
			if (JunkTex.aFloat2854 < Class90.aFloat1426) {
				Class90.aFloat1426 = JunkTex.aFloat2854;
			}

			Static2.method1126((byte) -22);
		} else if (JunkTex.aFloat2854 < Class90.aFloat1426) {
			Class90.aFloat1426 = (float) (Class90.aFloat1426 - Class90.aFloat1426 / 30.0D);
			if (Class90.aFloat1426 < JunkTex.aFloat2854) {
				Class90.aFloat1426 = JunkTex.aFloat2854;
			}

			Static2.method1126((byte) -22);
		}

		if (var0 != JunkTex.anInt427 && Class14_Sub18.anInt3050 != -1) {
			int var1 = JunkTex.anInt427 - Class37.anInt644;
			if (var1 < 2 || var1 > 2) {
				var1 >>= 4;
			}

			int var2 = Class14_Sub18.anInt3050 - SceneGraphNode_Projectile.anInt3659;
			Class37.anInt644 += var1;
			if (var2 < 2 || var2 > 2) {
				var2 >>= 4;
			}

			if (var1 == 0 && var2 == 0) {
				Class14_Sub18.anInt3050 = -1;
				JunkTex.anInt427 = -1;
			}

			SceneGraphNode_Projectile.anInt3659 += var2;
			Static2.method1126((byte) -22);
		}

	}
	public boolean aBoolean616 = false;
	public boolean aBoolean620 = false;
	public byte[] aByteArray622;
	public Class31 aClass31_606;
	public Class43 aClass43_611;

	public InputStream anInputStream617;

	public int anInt613 = 0;

	public int anInt619 = 0;

	public OutputStream anOutputStream604;

	public Socket aSocket609;

	public Class36(Socket var1, Class43 var2) throws IOException {
		this.aClass43_611 = var2;
		this.aSocket609 = var1;
		this.aSocket609.setSoTimeout(30000);
		this.aSocket609.setTcpNoDelay(true);
		this.anInputStream617 = this.aSocket609.getInputStream();
		this.anOutputStream604 = this.aSocket609.getOutputStream();
	}

	@Override
	public void finalize() {
		this.method1101((byte) 121);
	}

	public void method1099(int var1, byte[] var2, int var3, int var4) throws IOException {
		if (!this.aBoolean620) {
			if (var3 != -1) {
				method1106(9);
			}

			while (var1 > 0) {
				int var5 = this.anInputStream617.read(var2, var4, var1);
				if (var5 <= 0) {
					throw new EOFException();
				}

				var4 += var5;
				var1 -= var5;
			}
		}

	}

	public void method1100(int var1, int var2, int var3, byte[] var4) throws IOException {
		if (!this.aBoolean620) {
			if (this.aBoolean616) {
				this.aBoolean616 = false;
				throw new IOException();
			}

			if (this.aByteArray622 == null) {
				this.aByteArray622 = new byte[5000];
			}

			synchronized (this) {
				int var6 = 0;
				if (var2 != 3) {
					aClass52_621 = null;
				}

				while (var6 < var3) {
					this.aByteArray622[this.anInt619] = var4[var6 + var1];
					this.anInt619 = (this.anInt619 + 1) % 5000;
					if (this.anInt619 == (this.anInt613 + 4900) % 5000) {
						throw new IOException();
					}

					++var6;
				}

				if (this.aClass31_606 == null) {
					this.aClass31_606 = this.aClass43_611.method1143(3, this, 0);
				}

				this.notifyAll();
			}
		}

	}

	public void method1101(byte var1) {
		if (!this.aBoolean620) {
			synchronized (this) {
				this.aBoolean620 = true;
				this.notifyAll();
			}

			if (this.aClass31_606 != null) {
				while (this.aClass31_606.anInt529 == 0) {
					Util.accuratesleep(1L);
				}

				if (this.aClass31_606.anInt529 == 1) {
					try {
						((Thread) this.aClass31_606.anObject530).join();
					} catch (InterruptedException var3) {
						;
					}
				}
			}

			this.aClass31_606 = null;
		}

	}

	public int method1104(int var1) throws IOException {
		if (var1 != 24249) {
			byte var4 = -62;
			return var4;
		} else if (this.aBoolean620) {
			byte var3 = 0;
			return var3;
		} else {
			int var2 = this.anInputStream617.available();
			return var2;
		}
	}

	public int method1107(byte var1) throws IOException {
		if (var1 != 30) {
			this.aBoolean616 = false;
		}

		if (this.aBoolean620) {
			byte var3 = 0;
			return var3;
		} else {
			int var2 = this.anInputStream617.read();
			return var2;
		}
	}

	public void run() {
		try {
			try {
				while (true) {
					label103: {
						int var3;
						int var4;
						synchronized (this) {
							label92: {
								label91: {
									try {
										if (this.anInt619 != this.anInt613) {
											break label92;
										}

										if (this.aBoolean620) {
											break label103;
										}
									} catch (Throwable var10) {
										break label91;
									}

									try {
										try {
											this.wait();
										} catch (InterruptedException var8) {
											;
										}
										break label92;
									} catch (Throwable var9) {
										;
									}
								}

								RuntimeException var2 = new RuntimeException();
								throw var2;
							}

							if (this.anInt613 <= this.anInt619) {
								var3 = -this.anInt613 + this.anInt619;
							} else {
								var3 = -this.anInt613 + 5000;
							}

							var4 = this.anInt613;
						}

						if (var3 <= 0) {
							continue;
						}

						try {
							this.anOutputStream604.write(this.aByteArray622, var4, var3);
						} catch (IOException var7) {
							this.aBoolean616 = true;
						}

						this.anInt613 = (this.anInt613 + var3) % 5000;

						try {
							if (this.anInt619 == this.anInt613) {
								this.anOutputStream604.flush();
							}
						} catch (IOException var6) {
							this.aBoolean616 = true;
						}
						continue;
					}

					try {
						if (this.anInputStream617 != null) {
							this.anInputStream617.close();
						}

						if (this.anOutputStream604 != null) {
							this.anOutputStream604.close();
						}

						if (this.aSocket609 != null) {
							this.aSocket609.close();
						}
					} catch (IOException var5) {
						;
					}

					this.aByteArray622 = null;
					return;
				}
			} catch (Exception var12) {
				ErrorReporting.method738((String) null, var12, 95);
			}
		} catch (RuntimeException var13) {
			throw Util.error(var13, "ee.run()");
		}
	}
}
