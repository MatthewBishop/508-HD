package rs;

import java.io.IOException;
import java.net.Socket;

import com.jagex.applet.ErrorReporting;

public class Class115 {

	public static Class124 aClass124_1906 = Class124.method263("<col=ffffff> )4 ");
	public static Class124 aClass124_1908 = Class124.method263("hint_mapedge");
	public static int anInt1909;
	public static Class124 aClass124_1910 = Class124.method263("leuchten2:");
	public int anInt1911;
	public static int anInt1912;
	public int anInt1913;
	public int anInt1914;
	public long aLong1915;
	public static int[] anIntArray1916 = new int[] { 1, 4 };
	public static int[] anIntArray1917;
	public SceneGraphNode aSceneGraphNode_1919;
	public SceneGraphNode aSceneGraphNode_1921;
	public static Class124 aClass124_1924 = Class124.method263("Gegenstand f-Ur Mitglieder");
	public int anInt1925;
	public SceneGraphNode aSceneGraphNode_1926;
	public static void method1588(byte var0) {
		aClass124_1908 = null;
		anIntArray1917 = null;
		aClass124_1924 = null;
		aClass124_1910 = null;
		anIntArray1916 = null;
		if (var0 <= 83) {
			method1592((byte) -120);
		}

		aClass124_1906 = null;
	}

	public static int method1589(byte var0) {
		int var1 = 26 % ((73 - var0) / 47);
		byte var2 = 2;
		return var2;
	}

	public static void method1591(int var0, int var1, int var2) {
		JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(63);
		JunkTex.aClass14_Sub10_Sub1_891.method801((byte) -114, var0);
		JunkTex.aClass14_Sub10_Sub1_891.method785(var1);
	}

	public static void method1592(byte var0) {
		if (var0 != 23) {
			aClass124_1906 = null;
		}

		Class14_Sub28.aClass52_3217.clear();
	}

	public static void method1593(int var0) {
		if (Class56.anInt918 != 0) {
			if (++JunkTex.anInt4686 > 2000) {
				if (Class14_Sub15.aClass36_2990 != null) {
					Class14_Sub15.aClass36_2990.method1101((byte) 120);
					Class14_Sub15.aClass36_2990 = null;
				}

				if (Static2.anInt2136 >= 1) {
					Static2.anInt2734 = -5;
					Class56.anInt918 = 0;
					return;
				}

				Class56.anInt918 = 1;
				if (Class84.anInt1346 == Class131.anInt2164) {
					Class131.anInt2164 = Static2.anInt3348;
				} else {
					Class131.anInt2164 = Class84.anInt1346;
				}

				++Static2.anInt2136;
				JunkTex.anInt4686 = 0;
			}

			label147: {
				int var2;
				label139: {
					try {
						if (~Class56.anInt918 == var0) {
							JunkTex.aClass31_4454 = ErrorReporting.signlink.method1153(0,
									JunkTex.aString4605, Class131.anInt2164);
							Class56.anInt918 = 2;
						}

						if (Class56.anInt918 != 2) {
							break label139;
						}

						if (JunkTex.aClass31_4454.anInt529 == 2) {
							throw new IOException();
						}

						if (JunkTex.aClass31_4454.anInt529 != 1) {
							return;
						}
					} catch (IOException var8) {
						break label147;
					}

					try {
						Class14_Sub15.aClass36_2990 = new Class36((Socket) JunkTex.aClass31_4454.anObject530,
								ErrorReporting.signlink);
						JunkTex.aClass31_4454 = null;
						Class14_Sub15.aClass36_2990.method1100(0, 3, JunkTex.aClass14_Sub10_Sub1_891.position,
								JunkTex.aClass14_Sub10_Sub1_891.payload);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338(var0 ^ -255);
						}

						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338(255);
						}

						var2 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338(255);
						}

						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338(255);
						}

						if (var2 != 21) {
							Static2.anInt2734 = var2;
							Class56.anInt918 = 0;
							Class14_Sub15.aClass36_2990.method1101((byte) 119);
							Class14_Sub15.aClass36_2990 = null;
							return;
						}

						Class56.anInt918 = 3;
					} catch (IOException var7) {
						break label147;
					}
				}

				label126: {
					try {
						if (Class56.anInt918 != 3) {
							break label126;
						}

						if (Class14_Sub15.aClass36_2990.method1104(24249) < 1) {
							return;
						}
					} catch (IOException var6) {
						break label147;
					}

					try {
						JunkTex.aClass124Array4549 = new Class124[Class14_Sub15.aClass36_2990
								.method1107((byte) 30)];
						Class56.anInt918 = 4;
					} catch (IOException var5) {
						break label147;
					}
				}

				if (Class56.anInt918 != 4) {
					return;
				}

				try {
					if (Class14_Sub15.aClass36_2990.method1104(24249) < JunkTex.aClass124Array4549.length
							* 8) {
						return;
					}

					try {
						JunkTex.aClass14_Sub10_Sub1_4734.position = 0;
						Class14_Sub15.aClass36_2990.method1099(JunkTex.aClass124Array4549.length * 8,
								JunkTex.aClass14_Sub10_Sub1_4734.payload, var0 + 1, 0);

						for (var2 = 0; JunkTex.aClass124Array4549.length > var2; ++var2) {
							JunkTex.aClass124Array4549[var2] = Static2.method1174(
									JunkTex.aClass14_Sub10_Sub1_4734.method796(-128), (byte) 123);
						}

						Static2.anInt2734 = 21;
						Class56.anInt918 = 0;
						Class14_Sub15.aClass36_2990.method1101((byte) 116);
						Class14_Sub15.aClass36_2990 = null;
						return;
					} catch (IOException var3) {
						;
					}
				} catch (IOException var4) {
					;
				}
			}

			new Throwable();
			if (Class14_Sub15.aClass36_2990 != null) {
				Class14_Sub15.aClass36_2990.method1101((byte) 124);
				Class14_Sub15.aClass36_2990 = null;
			}

			if (Static2.anInt2136 >= 1) {
				Static2.anInt2734 = -4;
				Class56.anInt918 = 0;
			} else {
				++Static2.anInt2136;
				if (Class84.anInt1346 == Class131.anInt2164) {
					Class131.anInt2164 = Static2.anInt3348;
				} else {
					Class131.anInt2164 = Class84.anInt1346;
				}

				Class56.anInt918 = 1;
				JunkTex.anInt4686 = 0;
			}
		}

	}
}
