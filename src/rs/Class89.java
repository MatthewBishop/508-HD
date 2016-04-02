/* Class89 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Static;

public class Class89 {
	public int anInt1404;
	public static int[][][] anIntArrayArrayArray1405 = new int[2][][];
	public int anInt1406;
	public static Class9_Sub1 aClass9_Sub1_1407;
	public static Class124 aClass124_1408;
	public static boolean aBoolean1409 = false;
	public int anInt1410;
	public static int anInt1413;
	public int anInt1414;
	public static int anInt1415;
	public static boolean aBoolean1416 = false;

	static {
		aClass124_1408 = Class14_Sub2_Sub2.method263(1178, "Hierhin gehen");
		anInt1413 = 2;
	}

	public static boolean method1440(Class94 class94, int i) {
		if (i != 10151) {
			boolean bool = false;
			return bool;
		}
		if (class94.anIntArray1531 == null) {
			boolean bool = false;
			return bool;
		}
		for (int i_0_ = 0; i_0_ < class94.anIntArray1531.length; i_0_++) {
			int i_1_ = Static.method1010(i_0_, class94, (byte) 75);
			int i_2_ = class94.anIntArray1527[i_0_];
			if (class94.anIntArray1531[i_0_] != 2) {
				if (class94.anIntArray1531[i_0_] != 3) {
					if (class94.anIntArray1531[i_0_] != 4) {
						if (i_1_ != i_2_)
							return false;
					} else if (i_2_ == i_1_) {
						boolean bool = false;
						return bool;
					}
				} else if (i_2_ >= i_1_) {
					boolean bool = false;
					return bool;
				}
			} else if (i_1_ >= i_2_) {
				boolean bool = false;
				return bool;
			}
		}
		return true;
	}

	public static void method1441(long l, boolean bool) {
		if (l != 0L) {
			Class14_Sub8_Sub20.anInt4427++;
			if (!bool)
				method1441(-111L, false);
			Static.aClass14_Sub10_Sub1_891.writeOpcode(42);
			Static.aClass14_Sub10_Sub1_891.method817(l, 110);
		}
	}

	public Class89() {
		/* empty */
	}

	public Class89(Class89 class89_3_) {
		anInt1410 = class89_3_.anInt1410;
		anInt1414 = class89_3_.anInt1414;
		anInt1406 = class89_3_.anInt1406;
		anInt1404 = class89_3_.anInt1404;
	}

	public static void method1442(int i) {
		aClass124_1408 = null;
		if (i <= 81)
			aBoolean1409 = false;
		anIntArrayArrayArray1405 = null;
		aClass9_Sub1_1407 = null;
	}
}
