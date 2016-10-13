/* Class14_Sub2_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Cacheable;
import com.jagex.rt4.Class14_Sub2_Sub19;

public class Class14_Sub2_Sub17 extends Cacheable {
	public static Class124 aClass124_4012;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4013;
	public byte[] aByteArray4014;
	public static int anInt4017;
	public static int anInt4018 = 0;
	public static Class124 aClass124_4019;
	public static int[] anIntArray4020;
	public static Class124 aClass124_4021;
	public static Class76 aClass76_4022;

	static {
		anInt4017 = 0;
		aClass124_4012 = Class14_Sub2_Sub2.method263(1178, "slide:");
		aClass124_4021 = aClass124_4012;
		aClass124_4019 = aClass124_4012;
	}

	public static void method374(byte i) {
		aClass124_4012 = null;
		aClass124_4019 = null;
		anIntArray4020 = null;
		aClass14_Sub2_Sub19Array4013 = null;
		int i_0_ = 91 % ((-25 - i) / 61);
		aClass76_4022 = null;
		aClass124_4021 = null;
	}

	public Class14_Sub2_Sub17(byte[] is) {
		aByteArray4014 = is;
	}

	public static void method375(int i) {
		if (JunkTex.aClass75_4682 != null)
			JunkTex.aClass75_4682.method1345(25065);
		if (Class134.aClass75_2588 != null)
			Class134.aClass75_2588.method1345(25065);
		Class131.method1772(JunkTex.aBoolean4528, 2, (byte) 26, 22050);
		JunkTex.aClass75_4682 = JunkTex.method235(22050, 68, JunkTex.aClass43_4647,
				Class49.aCanvas819, 0);
		JunkTex.aClass75_4682.method1352(Class125.aClass14_Sub9_Sub1_2071, false);
		int i_1_ = -48 % ((-26 - i) / 57);
		Class134.aClass75_2588 = JunkTex.method235(2048, 102, JunkTex.aClass43_4647, Class49.aCanvas819,
				1);
		Class134.aClass75_2588.method1352(Class33.aClass14_Sub9_Sub2_585, false);
	}

	public static void method376(byte i, Class9 class9) {
		Static2.anInt371 = class9.method146(JunkTex.aClass124_1318, 0);
		JunkTex.anInt5098 = class9.method146(Class14_Sub2_Sub4.aClass124_3795, 0);
		if (i < 19)
			aClass124_4019 = null;
		JunkTex.anInt4532 = class9.method146(Class44.aClass124_732, 0);
		Class127.anInt2118 = class9.method146(JunkTex.aClass124_697, 0);
	}
}
