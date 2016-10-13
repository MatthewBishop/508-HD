/* SceneCluster - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.map;

import rs.Class118;
import rs.Class124;
import rs.Class138;
import rs.Class140;
import rs.Class14_Sub17;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub3;
import rs.Class18;
import rs.Class33;
import rs.Class59;
import rs.Class7_Sub1;
import rs.Class94;
import rs.JunkTex;

public class SceneCluster {
	public static Class124 aClass124_1365 = Class14_Sub2_Sub2.method263(1178, "hint_headicons");
	public static Class18 aClass18_1362;
	public static Class94 aClass94_1372;
	public static int anInt1355 = 0;
	public static int anInt1369;
	public int type;
	public int maxNormalX;
	public int maxNormalY;
	public int maxNormalZ;
	public int maxTileX;
	public int maxTileZ;
	public int maxX;
	public int maxY;
	public int maxZ;
	public int minNormalX;
	public int minNormalY;
	public int minNormalZ;
	public int minTileX;
	public int minTileZ;
	public int minX;
	public int minY;
	public int minZ;
	public int testDirection;

	public static void method1415(int i) {
		if (!JunkTex.aBooleanArray4581[98]) {
			if (!JunkTex.aBooleanArray4581[99])
				Class138.anInt2210 /= 2;
			else
				Class138.anInt2210 += (-Class138.anInt2210 - 12) / 2;
		} else
			Class138.anInt2210 += (-Class138.anInt2210 + 12) / 2;
		int i_0_ = (Class7_Sub1.anInt2655 + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
		if (JunkTex.aBooleanArray4581[96])
			JunkTex.anInt4382 += (-JunkTex.anInt4382 - 24) / 2;
		else if (!JunkTex.aBooleanArray4581[97])
			JunkTex.anInt4382 /= 2;
		else
			JunkTex.anInt4382 += (24 - JunkTex.anInt4382) / 2;
		JunkTex.anInt102 += Class138.anInt2210 / 2;
		JunkTex.anInt4408 += JunkTex.anInt4382 / i;
		int i_1_ = (JunkTex.anInt4520 + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436);
		if (-i_0_ + Class140.anInt2238 < -500 || -i_0_ + Class140.anInt2238 > 500 || JunkTex.anInt905 - i_1_ < -500
				|| -i_1_ + JunkTex.anInt905 > 500) {
			Class140.anInt2238 = i_0_;
			JunkTex.anInt905 = i_1_;
		}
		if (Class140.anInt2238 != i_0_)
			Class140.anInt2238 += (i_0_ - Class140.anInt2238) / 16;
		if (JunkTex.anInt905 != i_1_)
			JunkTex.anInt905 += (-JunkTex.anInt905 + i_1_) / 16;
		Class33.method1084((byte) 101);
	}

	public static void method1416(int i) {
		aClass94_1372 = null;
		if (i != 2)
			method1417(-97, -57, 88, -69, -59, -98);
		aClass124_1365 = null;
		aClass18_1362 = null;
	}

	public static void method1417(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (i_4_ != 0)
			method1415(-44);
		if (i < Class118.anInt1982 || JunkTex.anInt4327 < i_6_ || Class14_Sub17.anInt3005 > i_2_
				|| Class59.anInt955 < i_3_)
			Class14_Sub2_Sub12.method324(i, i_5_, i_3_, i_6_, (byte) -128, i_2_);
		else
			JunkTex.method674((byte) 92, i_6_, i_5_, i, i_2_, i_3_);
	}
}
