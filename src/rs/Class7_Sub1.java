/* Class7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;
import com.jagex.io.js5.CacheFileWorker;

public class Class7_Sub1 extends Class7 {
	public static FileSystem aFileSystem_2652;
	public static int anInt2653 = -1;
	public static int anInt2655;
	public static Class124 aClass124_2656 = Class124.method263("");
	public static CacheFileWorker aCacheFileWorker_2657;
	public static int anInt2659;
	public static Class124 aClass124_2660;

	public static short[] aShortArray2663;
	public static Class14_Sub2_Sub5 aClass14_Sub2_Sub5_2665;

	static {
		anInt2655 = 0;
		aShortArray2663 = new short[256];
		aClass124_2660 = Class124.method263("rot:");
	}

	public static Class124 method121(int i, int i_0_) {
		Class124 class124 = new Class124();
		class124.aByteArray2495 = new byte[i];
		class124.anInt2507 = 0;
		int i_1_ = 72 / ((i_0_ + 74) / 34);
		Class124 class124_2_ = class124;
		return class124_2_;
	}

	public static void method122(boolean bool) {
		if (bool)
			method123((byte) -102);
		Class103.method1531(Class67.aClass94_1060);
		JunkTex.anInt3419++;
		if (!Class122.aBoolean2056 || !Class59.aBoolean954) {
			if (JunkTex.anInt3419 > 1)
				Class67.aClass94_1060 = null;
		} else {
			int i = Static2.anInt1804;
			i -= Canvas_Sub2.anInt63;
			int i_3_ = JunkTex.anInt4640;
			if (i < Class48.anInt798)
				i = Class48.anInt798;
			if (Class67.aClass94_1060.anInt1545 + i > JunkTex.aClass94_420.anInt1545 + Class48.anInt798)
				i = (-Class67.aClass94_1060.anInt1545 + (Class48.anInt798 + JunkTex.aClass94_420.anInt1545));
			i_3_ -= JunkTex.anInt4132;
			if (Class108.anInt1824 > i_3_)
				i_3_ = Class108.anInt1824;
			int i_4_ = -Class47.anInt796 + i;
			if (Class67.aClass94_1060.anInt1518 + i_3_ > JunkTex.aClass94_420.anInt1518 + Class108.anInt1824)
				i_3_ = (-Class67.aClass94_1060.anInt1518 + (JunkTex.aClass94_420.anInt1518 + Class108.anInt1824));
			int i_5_ = -Class35.anInt602 + i_3_;
			int i_6_ = Class67.aClass94_1060.anInt1580;
			if (Class67.aClass94_1060.anInt1549 < JunkTex.anInt3419
					&& (i_6_ < i_5_ || i_5_ < -i_6_ || i_4_ > i_6_ || i_4_ < -i_6_))
				JunkTex.aBoolean4188 = true;
			int i_7_ = JunkTex.aClass94_420.anInt1547 - Class48.anInt798 + i;
			int i_8_ = JunkTex.aClass94_420.anInt1490 + i_3_ - Class108.anInt1824;
			if (Class67.aClass94_1060.anObjectArray1581 != null && JunkTex.aBoolean4188) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.anInt3114 = i_8_;
				class14_sub21.anObjectArray3115 = Class67.aClass94_1060.anObjectArray1581;
				class14_sub21.anInt3106 = i_7_;
				class14_sub21.aClass94_3116 = Class67.aClass94_1060;
				SceneGraphNode_GroundObject.method1830(class14_sub21, -1976917689);
			}
			if (JunkTex.anInt4599 == 0) {
				if (JunkTex.aBoolean4188) {
					if (Class67.aClass94_1060.anObjectArray1475 != null) {
						Class14_Sub21 class14_sub21 = new Class14_Sub21();
						class14_sub21.aClass94_3116 = Class67.aClass94_1060;
						class14_sub21.anInt3106 = i_7_;
						class14_sub21.aClass94_3105 = Static2.aClass94_3070;
						class14_sub21.anObjectArray3115 = Class67.aClass94_1060.anObjectArray1475;
						class14_sub21.anInt3114 = i_8_;
						SceneGraphNode_GroundObject.method1830(class14_sub21, -1976917689);
					}
					if (Static2.aClass94_3070 != null && client.method57(Class67.aClass94_1060) != null) {
						JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(179);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(Static2.aClass94_3070.anInt1548, 88);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(Class67.aClass94_1060.anInt1548, 127);
						JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 117, Class67.aClass94_1060.anInt1478);
						JunkTex.aClass14_Sub10_Sub1_891.method838(-1676904088, Static2.aClass94_3070.anInt1478);
					}
				} else if ((Class103.anInt1730 != 1 && !Class127.method1754(128, (JunkTex.anInt4729) - 1))
						|| JunkTex.anInt4729 <= 2) {
					if (JunkTex.anInt4729 > 0)
						Static2.method1551(-23473);
				} else
					Static2.method382((byte) 127);
				Class67.aClass94_1060 = null;
			}
		}
	}

	public static void method123(byte i) {
		aClass14_Sub2_Sub5_2665 = null;
		aFileSystem_2652 = null;
		aCacheFileWorker_2657 = null;
		aClass124_2656 = null;
		aShortArray2663 = null;
		aClass124_2660 = null;
	}
}
