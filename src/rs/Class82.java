/* Class82 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class82 {
	public static Class124 aClass124_1329;
	public static int anInt1330;
	public static Class124 aClass124_1333 = Class124.method263(1178, "um");
	public static int anInt1334;

	static {
		aClass124_1329 = Class124.method263(1178, "Freie Welt");
	}

	public static void method1404(byte i) {
		if (i >= -50)
			method1404((byte) -1);
		aClass124_1329 = null;
		aClass124_1333 = null;
	}

	public static Class124 method1405(byte i, Class94 class94, int i_0_) {
		if (!Class14_Sub3.method448((byte) 124, i_0_, client.method46(class94)) && class94.anObjectArray1535 == null) {
			Class124 class124 = null;
			return class124;
		}
		int i_1_ = 49 % ((i - 66) / 56);
		if (class94.aClass124Array1573 == null || class94.aClass124Array1573.length <= i_0_
				|| class94.aClass124Array1573[i_0_] == null
				|| class94.aClass124Array1573[i_0_].method1684((byte) 9).method1693(0) == 0) {
			if (JunkTex.aBoolean3392) {
				Class124 class124 = (JunkTex.method515(
						new Class124[] { Class7_Sub3_Sub1.aClass124_3706, Class83.method1407(61, i_0_) }, (byte) -102));
				return class124;
			}
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = class94.aClass124Array1573[i_0_];
		return class124;
	}
}
