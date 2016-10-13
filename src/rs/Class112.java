/* Class112 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.ref.SoftCache;

public class Class112 {
	public static SoftCache aClass52_1868;
	public Class124[] aClass124Array1869;
	public int[] anIntArray1870;
	public static boolean[] aBooleanArray1872 = new boolean[5];
	public Class14_Sub2_Sub12 aClass14_Sub2_Sub12_1873;
	public int anInt1874 = -1;
	public static Class124[] aClass124Array1875;
	static {
		aClass52_1868 = new SoftCache(500);
		aClass124Array1875 = new Class124[500];
	}

	public static void method1579(byte i) {
		aBooleanArray1872 = null;
		aClass124Array1875 = null;
		aClass52_1868 = null;
		if (i > -125)
			aClass52_1868 = null;
	}
}
