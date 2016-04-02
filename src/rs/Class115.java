package rs;

import java.io.IOException;
import java.net.Socket;
import rs.Class124;
import rs.Class129;
import rs.Class131;
import rs.Class133;
import rs.Class134;
import rs.Class14_Sub15;
import rs.Class14_Sub28;
import rs.Class14_Sub2_Sub2;
import rs.Class36;
import rs.Class46;
import rs.Class56;
import rs.Class84;
import rs.Class99_Sub2;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Static;

public class Class115 {

	public static Class124 aClass124_1906 = Class14_Sub2_Sub2.method263(1178, "<col=ffffff> )4 ");
	public static Class124 aClass124_1908 = Class14_Sub2_Sub2.method263(1178, "hint_mapedge");
	public static int anInt1909;
	public static Class124 aClass124_1910 = Class14_Sub2_Sub2.method263(1178, "leuchten2:");
	public int anInt1911;
	public static int anInt1912;
	public int anInt1913;
	public int anInt1914;
	public long aLong1915;
	public static int[] anIntArray1916 = new int[] { 1, 4 };
	public static int[] anIntArray1917;
	public Class133 aClass133_1919;
	public Class133 aClass133_1921;
	public static Class124 aClass124_1924 = Class14_Sub2_Sub2.method263(1178, "Gegenstand f-Ur Mitglieder");
	public int anInt1925;
	public Class133 aClass133_1926;
	public static int anInt1927;

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
		Static.aClass14_Sub10_Sub1_891.writeOpcode(63);
		Static.aClass14_Sub10_Sub1_891.method801((byte) -114, var0);
		Static.aClass14_Sub10_Sub1_891.method785(var2 ^ -86, var1);
	}

	public static void method1592(byte var0) {
		if (var0 != 23) {
			aClass124_1906 = null;
		}

		Class14_Sub28.aClass52_3217.clear();
	}

	public static void method1593(int var0) {
		if (Class56.anInt918 != 0) {
			if (++Class14_Sub8_Sub35.anInt4686 > 2000) {
				if (Class14_Sub15.aClass36_2990 != null) {
					Class14_Sub15.aClass36_2990.method1101((byte) 120);
					Class14_Sub15.aClass36_2990 = null;
				}

				if (Class129.anInt2136 >= 1) {
					Static2.anInt2734 = -5;
					Class56.anInt918 = 0;
					return;
				}

				Class56.anInt918 = 1;
				if (Class84.anInt1346 == Class131.anInt2164) {
					Class131.anInt2164 = Class99_Sub2.anInt3348;
				} else {
					Class131.anInt2164 = Class84.anInt1346;
				}

				++Class129.anInt2136;
				Class14_Sub8_Sub35.anInt4686 = 0;
			}

			label147: {
				int var2;
				label139: {
					try {
						if (~Class56.anInt918 == var0) {
							Class14_Sub8_Sub22.aClass31_4454 = Class14_Sub8_Sub34.aClass43_4647.method1153(0,
									Class14_Sub8_Sub31.aString4605, Class131.anInt2164);
							Class56.anInt918 = 2;
						}

						if (Class56.anInt918 != 2) {
							break label139;
						}

						if (Class14_Sub8_Sub22.aClass31_4454.anInt529 == 2) {
							throw new IOException();
						}

						if (Class14_Sub8_Sub22.aClass31_4454.anInt529 != 1) {
							return;
						}
					} catch (IOException var8) {
						break label147;
					}

					try {
						Class14_Sub15.aClass36_2990 = new Class36((Socket) Class14_Sub8_Sub22.aClass31_4454.anObject530,
								Class14_Sub8_Sub34.aClass43_4647);
						Class14_Sub8_Sub22.aClass31_4454 = null;
						Class14_Sub15.aClass36_2990.method1100(0, 3, Static.aClass14_Sub10_Sub1_891.position,
								Static.aClass14_Sub10_Sub1_891.payload);
						if (Class14_Sub8_Sub35.aClass75_4682 != null) {
							Class14_Sub8_Sub35.aClass75_4682.method1338(var0 ^ -255);
						}

						if (Class134.aClass75_2588 != null) {
							Class134.aClass75_2588.method1338(255);
						}

						var2 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
						if (Class14_Sub8_Sub35.aClass75_4682 != null) {
							Class14_Sub8_Sub35.aClass75_4682.method1338(255);
						}

						if (Class134.aClass75_2588 != null) {
							Class134.aClass75_2588.method1338(255);
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
						Class14_Sub8_Sub27.aClass124Array4549 = new Class124[Class14_Sub15.aClass36_2990
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
					if (Class14_Sub15.aClass36_2990.method1104(24249) < Class14_Sub8_Sub27.aClass124Array4549.length
							* 8) {
						return;
					}

					try {
						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
						Class14_Sub15.aClass36_2990.method1099(Class14_Sub8_Sub27.aClass124Array4549.length * 8,
								Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload, var0 + 1, 0);

						for (var2 = 0; Class14_Sub8_Sub27.aClass124Array4549.length > var2; ++var2) {
							Class14_Sub8_Sub27.aClass124Array4549[var2] = Class46.method1174(
									Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-128), (byte) 123);
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

			if (Class129.anInt2136 >= 1) {
				Static2.anInt2734 = -4;
				Class56.anInt918 = 0;
			} else {
				++Class129.anInt2136;
				if (Class84.anInt1346 == Class131.anInt2164) {
					Class131.anInt2164 = Class99_Sub2.anInt3348;
				} else {
					Class131.anInt2164 = Class84.anInt1346;
				}

				Class56.anInt918 = 1;
				Class14_Sub8_Sub35.anInt4686 = 0;
			}
		}

	}
}
