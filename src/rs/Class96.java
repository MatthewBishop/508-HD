/* Class96 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class96 {
	public static int[] z_min_occluders = new int[2];
	public static Class124 aClass124_1631 = Class124.method263("name_icons");
	public static short aShort1633;
	public static Class124 aClass124_1634 = Class124.method263("Wordpack geladen)3");
	public static int anInt1636;

	static {
		aShort1633 = (short) 32767;
		anInt1636 = 0;
	}

	public static void method1487(boolean bool) {
		if (!bool) {
			aClass124_1634 = null;
			z_min_occluders = null;
			aClass124_1631 = null;
		}
	}

	public static void method1488(int i) {
		Class14_Sub14.aClass52_2982.clearSoftReference();
		if (i == 2) {
			Class37.aClass52_635.clearSoftReference();
			JunkTex.aClass52_4186.clearSoftReference();
		}
	}
}
