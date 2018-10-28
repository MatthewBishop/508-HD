/* Class7_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class148_Sub1;

public class Class7_Sub2 extends Class7 {
	public static Class124 aClass124_2667;
	public static Class124 aClass124_2668 = Class124.method263("flash3:");
	public static Class124 aClass124_2669;
	public static Class124 aClass124_2670;
	public static Class124 aClass124_2672;
	public static Class124[] aClass124Array2674;
	public static int anInt2675;
	public static int anInt2676;
	public static Class148_Sub1[] aClass148_Sub1Array2677;

	static {
		aClass124_2667 = Class124.method263("OFF");
		aClass124_2670 = aClass124_2668;
		aClass124_2672 = aClass124_2668;
		aClass124_2669 = aClass124_2667;
		anInt2676 = 99;
		anInt2675 = 0;
	}

	public static void method125(int i, int i_0_, int i_1_, int i_2_) {
		Class124 class124 = (JunkTex.method515((new Class124[] { Static2.aClass124_4026,
				Class83.method1407(108, i_2_), Class53.aClass124_867, Class83.method1407(i_1_ - 44, i >> 38),
				Class53.aClass124_867, Class83.method1407(99, i_0_ >> 38), Class53.aClass124_867,
				Class83.method1407(i_1_ + 32, i & 0x3f), Class53.aClass124_867, Class83.method1407(37, i_1_ & i_0_) }),
				(byte) -82));
		class124.method1705((byte) 116);
		SceneGraphNode_GameEntity.method1798(class124, (byte) 7);
	}

	public static void method126(int i) {
		aClass124Array2674 = null;
		aClass124_2669 = null;
		aClass124_2672 = null;
		aClass124_2667 = null;

		aClass148_Sub1Array2677 = null;
		if (i > 96) {
			aClass124_2668 = null;
			aClass124_2670 = null;
		}
	}

	public static void method127(int i) {
		Static2.aClass52_2946.clear();
		if (i != 0)
			method127(30);
	}
}
