/* Class140 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import rs.tex.Static;

public class Class140 {
	public static Class124 aClass124_2234 = Class14_Sub2_Sub2.method263(1178, "");
	public static int anInt2238;

	public static void method1956(byte i) {
		if (i < 118)
			aClass124_2234 = null;
		aClass124_2234 = null;
	}

	public static void method1957(boolean bool, int i) {
		Class127.aClass52_2112.method1208(i);
		Class112.aClass52_1868.method1208(i);
		if (!bool)
			aClass124_2234 = null;
		Class62.aClass52_991.method1208(i);
		Class49.aClass52_810.method1208(i);
	}

	public static void method1958(byte i) {
		Static.aClass14_Sub10_Sub1_891.writeOpcode(108);
		for (Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst()); class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
						.getNext()) {
			if (class14_sub15.anInt2991 == 0)
				Static.method236(true, class14_sub15, (byte) -117);
		}
		if (i <= 67)
			method1959(null, -107);
		if (Class125_Sub2.aClass94_3388 != null) {
			Class103.method1531(Class125_Sub2.aClass94_3388);
			Class125_Sub2.aClass94_3388 = null;
		}
	}

	public static void method1959(Class94 class94, int i) {
		int i_0_ = class94.anInt1498;
		if (i != -29163)
			method1959(null, -38);
		if (i_0_ == 324) {
			if (Static2.anInt1681 == -1) {
				Static.anInt3929 = class94.anInt1568;
				Static2.anInt1681 = class94.anInt1487;
			}
			if (Class14_Sub2_Sub20.aClass102_4055.aBoolean1711)
				class94.anInt1487 = Static2.anInt1681;
			else
				class94.anInt1487 = Static.anInt3929;
		} else if (i_0_ == 325) {
			if (Static2.anInt1681 == -1) {
				Static.anInt3929 = class94.anInt1568;
				Static2.anInt1681 = class94.anInt1487;
			}
			if (Class14_Sub2_Sub20.aClass102_4055.aBoolean1711)
				class94.anInt1487 = Static.anInt3929;
			else
				class94.anInt1487 = Static2.anInt1681;
		} else if (i_0_ == 327) {
			class94.anInt1465 = 150;
			class94.anInt1578 = (int) (Math.sin((double) Class14_Sub2_Sub20.anInt4064 / 40.0) * 256.0) & 0x7ff;
			class94.anInt1543 = 5;
			class94.anInt1550 = -1;
		} else if (i_0_ == 328) {
			if (Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922 == null)
				class94.anInt1550 = 0;
			else {
				class94.anInt1465 = 150;
				class94.anInt1578 = (int) (Math.sin((double) Class14_Sub2_Sub20.anInt4064 / 40.0) * 256.0) & 0x7ff;
				class94.anInt1543 = 5;
				class94.anInt1550 = ((int) Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922
						.method1692(i + 29163) << 11) + 2047;
				class94.anInt1598 = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3452;
				class94.anInt1610 = Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3483;
			}
		}
	}
}
