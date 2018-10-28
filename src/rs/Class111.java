/* Class111 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class111 {
	public static Class124 aClass124_1856 = Class124.method263(":trade:");
	public static int anInt1857;
	public static Class124 aClass124_1858;
	public static int anInt1859;
	public static volatile int anInt1860 = 0;
	public static Class124 aClass124_1861 = Class124.method263("K");
	public static Class124 aClass124_1863;
	public static Class124 aClass124_1864 = aClass124_1861;
	public static int anInt1865 = 0;
	public static Class124 aClass124_1866;

	static {
		anInt1859 = 0;
		aClass124_1863 = Class124.method263("l");
		aClass124_1866 = Class124.method263("_");
		aClass124_1858 = aClass124_1861;
	}

	public static void method1576(int i) {
		aClass124_1866 = null;
		aClass124_1864 = null;
		aClass124_1858 = null;
		if (i >= 86) {
			aClass124_1861 = null;
			aClass124_1863 = null;
			aClass124_1856 = null;
		}
	}

	public static boolean method1577(byte i, int i_0_) {
		if (i > -30) {
			boolean bool = true;
			return bool;
		}
		boolean bool = (i_0_ & 0x19db8103) >> 60 != 0;
		return bool;
	}

	public static void method1578(int i) {
		SceneGraphNode_SpotAnimation.aBoolean3628 = false;
		Class146.anInt2357 = -1;
		JunkTex.anInt4280 = 0;
		Class96.anInt1636 = 0;
		Static2.anInt1085 = 0;
		JunkTex.anInt4729 = 0;
		Class7_Sub2.anInt2675 = 0;
		SceneGraphNode_AnimatedLocation.anInt3579 = -1;
		JunkTex.aClass14_Sub10_Sub1_891.position = 0;
		JunkTex.anInt4114 = -1;
		JunkTex.anInt4633 = 0;
		JunkTex.aClass14_Sub10_Sub1_4734.position = 0;
		JunkTex.anInt3931 = -1;
		for (int i_1_ = 0; i_1_ < JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474.length; i_1_++) {
			if (JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_1_] != null)
				JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_1_].anInt3453 = -1;
		}
		for (int i_2_ = 0; i_2_ < Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785.length; i_2_++) {
			if (Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_2_] != null)
				Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_2_].anInt3453 = -1;
		}
		Class33.method1088((byte) 127);
		Class89.anInt1415 = 1;
		Static2.method1743(30);
		int i_3_ = 68 % ((-21 - i) / 53);
		for (int i_4_ = 0; i_4_ < 100; i_4_++)
			JunkTex.aBooleanArray4698[i_4_] = true;
		JunkTex.aClass2_4163.clear();
		Class88.method1436((byte) -121);
	}
}
