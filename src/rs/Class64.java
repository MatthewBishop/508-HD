/* Class64 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9_Sub1;

public class Class64 {
	public static Class124 aClass124_1009;
	public static Class124 aClass124_1010 = Class124.method263(1178, "<col=ffff00>");
	public static Class124 aClass124_1011;
	public static int anInt1012;
	public static long aLong1014;
	public static Class9_Sub1 aClass9_Sub1_1015;
	public static int[] anIntArray1016;
	public static Class124 aClass124_1017;

	static {
		aClass124_1009 = Class124.method263(1178, "Versteckt");
		anIntArray1016 = new int[5];
		aClass124_1017 = Class124.method263(1178, "Choose Option");
		aLong1014 = 0L;
		anInt1012 = 0;
		aClass124_1011 = aClass124_1017;
	}

	public static void method1286(byte i) {
		for (int i_4_ = -1; i_4_ < Static2.anInt2878; i_4_++) {
			int i_5_;
			if (i_4_ != -1)
				i_5_ = Static2.anIntArray351[i_4_];
			else
				i_5_ = 2047;
			Class133_Sub1_Sub1 class133_sub1_sub1 = JunkTex.aClass133_Sub1_Sub1Array4474[i_5_];
			if (class133_sub1_sub1 != null && class133_sub1_sub1.anInt3473 > 0) {
				Class133_Sub1_Sub1 class133_sub1_sub1_6_ = class133_sub1_sub1;
				class133_sub1_sub1_6_.anInt3473 = class133_sub1_sub1_6_.anInt3473 - 1;
				if (class133_sub1_sub1.anInt3473 == 0)
					class133_sub1_sub1.aClass124_3462 = null;
			}
		}
		for (int i_7_ = 0; i_7_ < JunkTex.anInt4306; i_7_++) {
			int i_8_ = JunkTex.anIntArray3965[i_7_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_8_];
			if (class133_sub1_sub2 != null && class133_sub1_sub2.anInt3473 > 0) {
				Class133_Sub1_Sub2 class133_sub1_sub2_9_ = class133_sub1_sub2;
				class133_sub1_sub2_9_.anInt3473 = class133_sub1_sub2_9_.anInt3473 - 1;
				if (class133_sub1_sub2.anInt3473 == 0)
					class133_sub1_sub2.aClass124_3462 = null;
			}
		}
		if (i <= 29)
			aClass124_1017 = null;
	}

	public static void method1287(int i) {
		aClass9_Sub1_1015 = null;
		aClass124_1010 = null;
		anIntArray1016 = null;
		aClass124_1017 = null;
		aClass124_1011 = null;
		aClass124_1009 = null;
	}
}
