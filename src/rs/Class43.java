package rs;

import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Vector;

public class Class43 implements Runnable {

	public static Method aMethod702;
	public static Method aMethod707;
	public static String os_arch;
	public static String os_name_lc;
	public static String aString706;
	public static String os_name;
	public static String aString717;
	public static String java_vendor;
	public static String java_version;
	public boolean aBoolean703 = false;
	public Class30 aClass30_716 = null;
	public Class30 aClass30_720 = null;
	public Class30 aClass30_722 = null;
	public Class30[] aClass30Array711;
	public Class31 aClass31_714 = null;
	public Class31 aClass31_715 = null;
	public Display aDisplay;
	public File aFile719 = null;
	public File aFile724 = null;
	public Applet applet = null;
	public EventQueue eventQueue;
	public Interface4 anInterface4_701;
	public Thread aThread718;

	public Class43(boolean var1, Applet var2, int var3, String var4, int var5) {
		java_vendor = "Unknown";
		this.applet = var2;
		java_version = "1.1";

		try {
			java_vendor = System.getProperty("java.vendor");
			java_version = System.getProperty("java.version");
		} catch (Exception var18) {
			;
		}

		try {
			os_name = System.getProperty("os.name");
		} catch (Exception var17) {
			os_name = "Unknown";
		}

		os_name_lc = os_name.toLowerCase();

		try {
			os_arch = System.getProperty("os.arch").toLowerCase();
		} catch (Exception var16) {
			os_arch = "";
		}

		try {
			aString717 = System.getProperty("os.version").toLowerCase();
		} catch (Exception var15) {
			aString717 = "";
		}

		try {
			aString706 = System.getProperty("user.home");
			if (aString706 != null) {
				aString706 = aString706 + "/";
			}
		} catch (Exception var14) {
			;
		}

		if (aString706 == null) {
			aString706 = "~/";
		}

		try {
			this.eventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var13) {
			;
		}

		try {
			if (var2 == null) {
				aMethod707 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled",
						new Class[] { Boolean.TYPE });
			} else {
				aMethod707 = var2.getClass().getMethod("setFocusTraversalKeysEnabled", new Class[] { Boolean.TYPE });
			}
		} catch (Exception var12) {
			;
		}

		try {
			if (var2 != null) {
				aMethod702 = var2.getClass().getMethod("setFocusCycleRoot", new Class[] { Boolean.TYPE });
			} else {
				aMethod702 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot",
						new Class[] { Boolean.TYPE });
			}
		} catch (Exception var11) {
			;
		}

		if (var1) {
			this.method1144(var3, -101, var5, var4);

			try {
				this.aDisplay = new Display();
			} catch (Throwable var10) {
				;
			}
		}

		if (var1) {
			ThreadGroup var6 = Thread.currentThread().getThreadGroup();
			ThreadGroup var7 = var6.getParent();

			Thread[] var8;
			for (var8 = new Thread[1000]; var7 != null; var7 = var7.getParent()) {
				var6 = var7;
			}

			var6.enumerate(var8);

			for (int var9 = 0; var8.length > var9; ++var9) {
				if (var8[var9] != null && var8[var9].getName().startsWith("AWT")) {
					var8[var9].setPriority(1);
				}
			}
		}

		this.aBoolean703 = false;
		this.aThread718 = new Thread(this);
		this.aThread718.setPriority(10);
		this.aThread718.setDaemon(true);
		this.aThread718.start();
	}

	public Class31 method1135(Frame var1, int var2) {
		Class31 var3;
		if (var2 != -30170) {
			var3 = null;
			return var3;
		} else {
			var3 = this.method1138(7, var1, 0, 0, -127);
			return var3;
		}
	}

	public Class31 method1136(int var1) {
		if (var1 != -12444) {
			os_name = null;
		}

		Class31 var2 = this.method1138(5, (Object) null, 0, 0, -126);
		return var2;
	}

	public Class31 method1137(int var1, byte var2, int var3, int var4, int var5) {
		Class31 var6;
		if (var2 < 101) {
			var6 = null;
			return var6;
		} else {
			var6 = this.method1138(6, (Object) null, var1 + (var5 << 48), var4 + (var3 << 16), -126);
			return var6;
		}
	}

	public Class31 method1138(int var1, Object var2, int var3, int var4, int var5) {
		Class31 var6 = new Class31();
		var6.anInt526 = var3;
		var6.anObject528 = var2;
		var6.anInt527 = var4;
		if (var5 >= -125) {
			Object var7 = null;
			return (Class31) var7;
		} else {
			var6.anInt525 = var1;
			synchronized (this) {
				if (this.aClass31_714 != null) {
					this.aClass31_714.aClass31_531 = var6;
					this.aClass31_714 = var6;
				} else {
					this.aClass31_714 = this.aClass31_715 = var6;
				}

				this.notify();
				return var6;
			}
		}
	}

	public Interface4 method1139(byte var1) {
		Interface4 var3 = this.anInterface4_701;
		return var3;
	}

	public Class31 method1140(int var1, Class var2, String var3) {
		Class31 var5 = this.method1138(9, new Object[] { var2, var3 }, 0, 0, -126);
		return var5;
	}

	public Class31 method1141(byte var1, int var2) {
		if (var1 != 48) {
			this.method1147((byte) 68, (URL) null);
		}

		Class31 var3 = this.method1138(3, (Object) null, var2, 0, -127);
		return var3;
	}

	public Class31 method1142(Class var1, int var2) {
		Class31 var3;
		if (var2 != 10) {
			var3 = null;
			return var3;
		} else {
			var3 = this.method1138(10, var1, 0, 0, -128);
			return var3;
		}
	}

	public Class31 method1143(int var1, Runnable var2, int var3) {
		Class31 var4;
		if (var3 != 0) {
			var4 = null;
			return var4;
		} else {
			var4 = this.method1138(2, var2, var1, 0, -126);
			return var4;
		}
	}

	public void method1144(int var1, int var2, int var3, String var4) {
		if (var1 < 32 && var1 > 34) {
			var1 = 32;
		}

		String[] var5 = new String[] { "./" };
		String[] var6 = new String[] { "cache", ".file_store_" + var1 };
		int var7 = 0;
		if (var2 <= -72) {
			while (var7 < 2) {
				for (int var8 = 0; var6.length > var8; ++var8) {
					for (int var9 = 0; var9 < var5.length; ++var9) {
						try {
							String var10 = var5[var9];
							if (var10.length() > 0 && !(new File(var10)).exists()) {
								continue;
							}

							File var11 = new File(var10 + var6[var8]);
							boolean var12;
							if (var7 == 1 && !var11.exists()) {
								var12 = var11.mkdir();
								if (!var12) {
									continue;
								}
							}

							File var13;
							if (this.aClass30_716 == null) {
								try {
									var13 = new File(var11, "random.dat");
									if (var7 == 1 || var13.exists()) {
										this.aClass30_716 = new Class30(var13, "rw", 25L);
									}
								} catch (Exception var18) {
									this.aClass30_716 = null;
								}
							}

							if (this.aFile724 == null) {
								int var14;
								try {
									var11 = new File(var11, var4);
									if (var7 == 1 && !var11.exists()) {
										var12 = var11.mkdir();
										if (!var12) {
											continue;
										}
									}

									var13 = new File(var11, "main_file_cache.dat2");
									if (var7 == 0 && !var13.exists()) {
										continue;
									}

									this.aClass30_720 = new Class30(var13, "rw", 104857600L);
									this.aClass30Array711 = new Class30[var3];

									for (var14 = 0; var3 > var14; ++var14) {
										this.aClass30Array711[var14] = new Class30(
												new File(var11, "main_file_cache.idx" + var14), "rw", 1048576L);
									}

									this.aClass30_722 = new Class30(new File(var11, "main_file_cache.idx255"), "rw",
											1048576L);
									this.aFile719 = this.aFile724 = var11;
								} catch (Exception var19) {
									try {
										this.aClass30_720.method1057(25861);

										for (var14 = 0; var3 > var14; ++var14) {
											this.aClass30Array711[var14].method1057(25861);
										}

										this.aClass30_722.method1057(25861);
									} catch (Exception var17) {
										;
									}

									this.aClass30_720 = this.aClass30_722 = null;
									this.aClass30Array711 = null;
									this.aFile719 = this.aFile724 = null;
								}
							}
						} catch (Exception var20) {
							;
						}

						if (this.aClass30_716 != null && this.aFile724 != null) {
							return;
						}
					}
				}

				++var7;
			}

			if (this.aFile724 == null) {
				throw new RuntimeException();
			}
		}

	}

	public Class31 method1145(Class var1, byte var2) {
		if (var2 < 26) {
			this.method1138(21, (Object) null, 101, -52, 109);
		}

		Class31 var3 = this.method1138(13, var1, 0, 0, -126);
		return var3;
	}

	public boolean method1146(byte var1) {
		int var2 = -57 / ((var1 - 52) / 61);
		boolean var3 = this.aDisplay != null;
		return var3;
	}

	public Class31 method1147(byte var1, URL var2) {
		if (var1 > -83) {
			this.method1143(-61, (Runnable) null, 2);
		}

		Class31 var3 = this.method1138(4, var2, 0, 0, -127);
		return var3;
	}

	public Class30 method1148(int var1, String var2) {
		if (var1 != 5) {
			return null;
		} else {
			String[] var3 = new String[] { "c:/tscache/", "/tscache/", aString706, "c:/windows/", "c:/winnt/", "c:/",
					"/tmp/", "" };

			for (int var4 = 0; var3.length > var4; ++var4) {
				String var5 = var3[var4];
				if (var5.length() <= 0 || (new File(var5)).exists()) {
					try {
						Class30 var6 = new Class30(new File(var5, "jagex_" + var2 + "_preferences.dat"), "rw", 10000L);
						return var6;
					} catch (Exception var7) {
						;
					}
				}
			}

			return null;
		}
	}

	public Class31 method1149(String var1, Class[] var2, Class var3, int var4) {
		Class31 var5;
		if (var4 >= -100) {
			var5 = null;
			return var5;
		} else {
			var5 = this.method1138(8, new Object[] { var3, var1, var2 }, 0, 0, -128);
			return var5;
		}
	}

	public void method1150(byte var1) {
		synchronized (this) {
			if (var1 <= 3) {
				this.method1146((byte) 103);
			}

			this.aBoolean703 = true;
			this.notifyAll();
		}

		try {
			this.aThread718.join();
		} catch (InterruptedException var8) {
			;
		}

		if (this.aClass30_720 != null) {
			try {
				this.aClass30_720.method1057(25861);
			} catch (IOException var7) {
				;
			}
		}

		if (this.aClass30_722 != null) {
			try {
				this.aClass30_722.method1057(25861);
			} catch (IOException var6) {
				;
			}
		}

		if (this.aClass30Array711 != null) {
			for (int var2 = 0; var2 < this.aClass30Array711.length; ++var2) {
				if (this.aClass30Array711[var2] != null) {
					try {
						this.aClass30Array711[var2].method1057(25861);
					} catch (IOException var5) {
						;
					}
				}
			}
		}

		if (this.aClass30_716 != null) {
			try {
				this.aClass30_716.method1057(25861);
			} catch (IOException var4) {
				;
			}
		}

	}

	public Class31 method1151(Class var1, boolean var2) {
		Class31 var3;
		if (var2) {
			var3 = null;
			return var3;
		} else {
			var3 = this.method1138(11, var1, 0, 0, -127);
			return var3;
		}
	}

	public Class31 method1152(String var1, int var2) {
		Class31 var3;
		if (var2 != 0) {
			var3 = null;
			return var3;
		} else {
			var3 = this.method1138(12, var1, 0, 0, -126);
			return var3;
		}
	}

	public Class31 method1153(int var1, String var2, int var3) {
		if (var1 != 0) {
			this.aClass30_716 = null;
		}

		Class31 var4 = this.method1138(1, var2, var3, 0, -126);
		return var4;
	}

	public void run() {
		while (true) {
			try {
				if (this.aBoolean703) {
					break;
				}
			} catch (Throwable var17) {
				break;
			}

			Class31 var1 = null;
			synchronized (this) {
				try {
					if (this.aClass31_715 == null) {
						try {
							this.wait();
						} catch (InterruptedException var13) {
							;
						}
						continue;
					}

					var1 = this.aClass31_715;
					this.aClass31_715 = this.aClass31_715.aClass31_531;
					if (this.aClass31_715 == null) {
						this.aClass31_714 = null;
					}
				} catch (Throwable var15) {
					;
				}
			}

			try {
				int var2 = var1.anInt525;
				if (var2 == 1) {
					var1.anObject530 = new Socket(InetAddress.getByName((String) var1.anObject528), var1.anInt526);
				} else if (var2 != 2) {
					if (var2 != 4) {
						Object[] var3;
						if (var2 != 8) {
							if (var2 == 9) {
								var3 = (Object[]) var1.anObject528;
								if (((Class) var3[0]).getClassLoader() == null) {
									throw new SecurityException();
								}

								var1.anObject530 = ((Class) var3[0]).getDeclaredField((String) var3[1]);
							} else {
								String var12;
								if (var2 != 3) {
									if (var2 != 5) {
										if (var2 != 6) {
											if (var2 == 7) {
												this.aDisplay.setDisplayMode((byte) -125);
											} else {
												Class[] var4;
												Runtime var5;
												Method var6;
												if (var2 == 10) {
													var4 = new Class[] { Class.forName("java.lang.Class"),
															Class.forName("java.lang.String") };
													var5 = Runtime.getRuntime();
													if (!os_name_lc.startsWith("mac")) {
														var6 = Class.forName("java.lang.Runtime")
																.getDeclaredMethod("loadLibrary0", var4);
														var6.setAccessible(true);
														var6.invoke(var5, new Object[] { var1.anObject528, "jawt" });
														var6.setAccessible(false);
													}

													var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0",
															var4);
													var6.setAccessible(true);
													if (!os_name_lc.startsWith("linux")
															&& !os_name_lc.startsWith("sunos")) {
														if (os_name_lc.startsWith("mac")) {
															var6.invoke(var5,
																	new Object[] { var1.anObject528,
																			(new File(this.aFile719, "libjogl.jnilib"))
																					.getAbsoluteFile().toString() });
															var6.invoke(var5,
																	new Object[] { var1.anObject528,
																			(new File(this.aFile719,
																					"libjogl_awt.jnilib"))
																							.getAbsoluteFile()
																							.toString() });
														} else {
															if (!os_name_lc.startsWith("win")) {
																throw new Exception();
															}

															var6.invoke(var5,
																	new Object[] { var1.anObject528,
																			(new File(this.aFile719, "jogl.dll"))
																					.getAbsoluteFile().toString() });
															var6.invoke(var5,
																	new Object[] { var1.anObject528,
																			(new File(this.aFile719, "jogl_awt.dll"))
																					.getAbsoluteFile().toString() });
														}
													} else {
														var6.invoke(var5,
																new Object[] { var1.anObject528,
																		(new File(this.aFile719, "libgluegen-rt.so"))
																				.toString() });
														Class var7 = ((Class) var1.anObject528).getClassLoader()
																.loadClass("com.sun.opengl.impl.x11.DRIHack");
														var7.getMethod("begin", new Class[0]).invoke((Object) null,
																new Object[0]);
														var6.invoke(var5,
																new Object[] { var1.anObject528,
																		(new File(this.aFile719, "libjogl.so"))
																				.getAbsoluteFile().toString() });
														var7.getMethod("end", new Class[0]).invoke((Object) null,
																new Object[0]);
														var6.invoke(var5,
																new Object[] { var1.anObject528,
																		(new File(this.aFile719, "libjogl_awt.so"))
																				.getAbsoluteFile().toString() });
													}

													var6.setAccessible(false);
												} else if (var2 == 13) {
													var4 = new Class[] { Class.forName("java.lang.Class"),
															Class.forName("java.lang.String") };
													var5 = Runtime.getRuntime();
													var6 = Class.forName("java.lang.Runtime").getDeclaredMethod("load0",
															var4);
													var6.setAccessible(true);
													var6.invoke(var5,
															new Object[] { var1.anObject528,
																	(new File(this.aFile719, "browsercontrol.dll"))
																			.getAbsoluteFile().toString() });
													var6.setAccessible(false);
												} else if (var2 == 11) {
													Field var20 = Class.forName("java.lang.ClassLoader")
															.getDeclaredField("nativeLibraries");
													var20.setAccessible(true);
													Vector var8 = (Vector) var20
															.get(((Class) var1.anObject528).getClassLoader());

													for (int var9 = 0; var9 < var8.size(); ++var9) {
														Object var10 = var8.elementAt(var9);
														Method var11 = var10.getClass().getDeclaredMethod("finalize",
																new Class[0]);
														var11.setAccessible(true);
														var11.invoke(var10, new Object[0]);
														var11.setAccessible(false);
													}

													var20.setAccessible(false);
												} else {
													if (var2 != 12) {
														throw new Exception();
													}

													var12 = (String) var1.anObject528;
													Class30 var21 = this.method1148(5, var12);
													var1.anObject530 = var21;
												}
											}
										} else {
											Frame var19 = new Frame("Jagex Full Screen");
											var1.anObject530 = var19;
											var19.setResizable(false);
											this.aDisplay.goFullScreen((byte) 16, var1.anInt526 >>> 16,
													var1.anInt527 & '\uffff', var1.anInt526 & '\uffff',
													var1.anInt527 >> 16, var19);
										}
									} else {
										var1.anObject530 = this.aDisplay.getDisPlayModes((byte) -82);
									}
								} else {
									var12 = (var1.anInt526 >> 56 & 255) + "." + ((var1.anInt526 & 16737928) >> 16) + "."
											+ (var1.anInt526 >> 40 & 255) + "." + (var1.anInt526 & 255);
									var1.anObject530 = InetAddress.getByName(var12).getHostName();
								}
							}
						} else {
							var3 = (Object[]) var1.anObject528;
							if (((Class) var3[0]).getClassLoader() == null) {
								throw new SecurityException();
							}

							var1.anObject530 = ((Class) var3[0]).getDeclaredMethod((String) var3[1], (Class[]) var3[2]);
						}
					} else {
						var1.anObject530 = new DataInputStream(((URL) var1.anObject528).openStream());
					}
				} else {
					Thread var18 = new Thread((Runnable) var1.anObject528);
					var18.setDaemon(true);
					var18.start();
					var18.setPriority(var1.anInt526);
					var1.anObject530 = var18;
				}

				var1.anInt529 = 1;
			} catch (Throwable var14) {
				var1.anInt529 = 2;
			}
		}

	}
}
