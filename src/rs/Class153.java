/* Class153 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.util.Calendar;

public class Class153 {
	public int anInt2441;
	public static byte aByte2442;
	public int anInt2443;
	public static Calendar aCalendar2449 = Calendar.getInstance();
	public static int anInt2450;
	public static int[] anIntArray2453 = { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };
	public static int method2045(int i, int i_0_) {
		if (i_0_ != -104757881) {
			int i_1_ = 51;
			return i_1_;
		}
		int i_2_ = i >>> 7;
		return i_2_;
	}

	public static void method2046(int i) {
		if (i > -30)
			anInt2450 = -106;
		for (Class14_Sub2_Sub7 class14_sub2_sub7 = (Class14_Sub2_Sub7) Class79.aClass2_1268
				.getFront(); class14_sub2_sub7 != null; class14_sub2_sub7 = (Class14_Sub2_Sub7) Class79.aClass2_1268
						.getNext()) {
			SceneGraphNode_SpotAnimation class133_sub5 = class14_sub2_sub7.aSceneGraphNode_SpotAnimation_3822;
			if (class133_sub5.anInt3620 == Class14_Sub2_Sub3.gameLevel && !class133_sub5.finishedAnimating) {
				if (Class14_Sub2_Sub20.anInt4064 >= class133_sub5.anInt3616) {
					class133_sub5.method1845((byte) 94, Static2.anInt839);
					if (class133_sub5.finishedAnimating)
						class14_sub2_sub7.unlink();
					else
						JunkTex.method519(class133_sub5.anInt3620, class133_sub5.anInt3622,
								class133_sub5.anInt3631, class133_sub5.anInt3629, 60, class133_sub5, 0, -1L, false);
				}
			} else
				class14_sub2_sub7.unlink();
		}
	}

	public static Class124 method2047(int i, int i_3_, int i_4_) {
		int i_5_ = i_3_ - i_4_;
		if (i_5_ < -9) {
			Class124 class124 = JunkTex.aClass124_4634;
			return class124;
		}
		if (i_5_ < -6) {
			Class124 class124 = JunkTex.aClass124_4653;
			return class124;
		}
		if (i_5_ < -3) {
			Class124 class124 = JunkTex.aClass124_857;
			return class124;
		}
		if (i_5_ < 0) {
			Class124 class124 = Class48.aClass124_801;
			return class124;
		}
		if (i != 1) {
			Class124 class124 = null;
			return class124;
		}
		if (i_5_ > 9) {
			Class124 class124 = JunkTex.aClass124_4116;
			return class124;
		}
		if (i_5_ > 6) {
			Class124 class124 = JunkTex.aClass124_4452;
			return class124;
		}
		if (i_5_ > 3) {
			Class124 class124 = Class104.aClass124_1750;
			return class124;
		}
		if (i_5_ > 0) {
			Class124 class124 = JunkTex.aClass124_4265;
			return class124;
		}
		Class124 class124 = JunkTex.aClass124_4694;
		return class124;
	}

	public static void method2048(int i) {
		anIntArray2453 = null;
		if (i == 2) {

			aCalendar2449 = null;
		}
	}

	public static void method2049(int i, int i_6_, int i_7_) {
		if (i_7_ != (StaticMusic.anInt3135 ^ 0xffffffff) && i != -1) {
			StaticMusic.method1087(0, false, i, JunkTex.aCacheFileWorker_4603, StaticMusic.anInt3135);
			StaticMusic.aBoolean2827 = true;
		}
	}

	public static void method2050(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_,
			int i_15_) {
		int i_16_ = -i_13_ + i_15_;
		int i_17_ = -i + i_8_;
		if (i_10_ != 1)
			method2048(98);
		int i_18_ = (-i_12_ + i_9_ << 16) / i_16_;
		int i_19_ = (-i_14_ + i_11_ << 16) / i_17_;
		JunkTex.method75(0, i, i_8_, i_19_, i_15_, i_14_, i_12_, i_18_, 83, i_13_, 0);
	}

	public Class153(int i, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, boolean bool) {
		anInt2441 = i_24_;
		anInt2443 = i_21_;
	}
}
