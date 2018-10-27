/* Class15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;

public class Class15 {
	public static Class124 aClass124_373;
	public static int anInt376;
	public static int anInt380 = 0;
	public static Class124 aClass124_381 = Class124.method263("cyan:");
	public static FileSystem aFileSystem_382;
	public static Class124 aClass124_383;
	public static FileSystem aFileSystem_384;
	public static byte[][][] overlayOrientations;

	static {
		aClass124_373 = aClass124_381;
		aClass124_383 = aClass124_381;
	}

	public static void method943(Class124 class124, boolean bool, Class124 class124_0_, int i) {
		if (bool)
			method943(null, true, null, 25);
		JunkTex.method493((byte) -57, null, class124_0_, i, class124, -1);
	}

	public static boolean method944(boolean bool, int i) {
		if (bool) {
			boolean bool_1_ = true;
			return bool_1_;
		}
		boolean bool_2_ = i >= 48 && i <= 57;
		return bool_2_;
	}

	public static void method945(int i) {
		aClass124_383 = null;
		aClass124_381 = null;
		aFileSystem_384 = null;
		aFileSystem_382 = null;
		aClass124_373 = null;
		overlayOrientations = null;
		if (i != 0)
			method946((byte) -84);
	}

	public static void method946(byte i) {
		SceneGraphNode_GameEntity_Sub1.aClass52_4926.clear();
		JunkTex.aClass52_2075.clear();
		Class70.aClass52_1077.clear();
		if (i != -2)
			method945(-17);
	}

	public static void method947(int i, int i_3_) {
		if (i_3_ == -14158) {
			Class14_Sub2_Sub13 class14_sub2_sub13 = JunkTex.method626(i_3_ + 14051, i, 2);
			class14_sub2_sub13.method327();
		}
	}
}
