/* Class122 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class122 {
	public static Class124 aClass124_2053;
	public static int anInt2054;
	public static boolean aBoolean2056 = false;
	public static Class124 aClass124_2058;
	public static Class108 aClass108_2059;
	public static int anInt2060;

	static {
		aClass124_2053 = Class14_Sub2_Sub2.method263(1178, "<br>(X");
		aClass124_2058 = Class14_Sub2_Sub2.method263(1178, "Musik)2Engine vorbereitet)3");
		anInt2054 = 0;
		anInt2060 = (int) (Math.random() * 33.0) - 16;
	}

	public static Class124 method1658(byte i, boolean bool, int i_0_) {
		if (i != -54)
			method1659(-61);
		Class124 class124 = Class54.method1220(i_0_, true, bool, 10);
		return class124;
	}

	public static void method1659(int i) {
		if (i <= -58) {
			aClass108_2059 = null;
			aClass124_2053 = null;
			aClass124_2058 = null;
		}
	}

	public static void method1660(int i, int i_1_) {
		Class45.method1160(0);
		JunkTex.method240(256);
		int i_2_ = Class133.method1780((byte) 111, i_1_).anInt587;
		if (i_2_ != 0) {
			int i_3_ = JunkTex.anIntArray4275[i_1_];
			if (i_2_ == 6)
				Class14_Sub28.anInt3222 = i_3_;
			if (i_2_ == 9)
				Class14_Sub4.anInt2782 = i_3_;
			if (i == 15237 && i_2_ == 5)
				Class103.anInt1730 = i_3_;
		}
	}
}
