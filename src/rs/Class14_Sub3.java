/* Class14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.AnimLoader;
import com.jagex.io.js5.CacheFileWorker;
import com.jagex.link.Linkable;

public class Class14_Sub3 extends Linkable {
	public static float aFloat2745;
	public int[] anIntArray2746;
	public Class79 aClass79_2747;
	public static SceneGraphNode_GameEntity_Sub1 aSceneGraphNode_GameEntity_Sub1_2748;
	public static CacheFileWorker aCacheFileWorker_2750;
	public int anInt2751;
	public static boolean aBoolean2752;
	public int anInt2753;
	public SceneGraphNode_GameEntity_Sub1 aSceneGraphNode_GameEntity_Sub1_2755;
	public int anInt2756 = 0;
	public boolean aBoolean2757;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2760;
	public int anInt2761;
	public SceneGraphNode_GameEntity_Sub2 aSceneGraphNode_GameEntity_Sub2_2762;
	public int anInt2763;
	public static int anInt2764 = 0;
	public int anInt2765;
	public int anInt2767;
	public int anInt2769;
	public static int anInt2771;
	public int anInt2772;
	public int anInt2773;
	public int anInt2774;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2775;

	public static boolean method448(byte i, int i_0_, int i_1_) {
		boolean bool = (i_1_ >> i_0_ + 1 & 0x1) != 0;
		return bool;
	}

	public static void method451(int i) {
		SceneGraphNode_SpotAnimation.method1844(-32768);
		Class116.method1595(i);
		JunkTex.method1128((byte) -83);
		Class60.method1264(i + 115);
		JunkTex.method501((byte) 61);
		Class15.method946((byte) -2);
		AnimLoader.resetSequence();
		JunkTex.method1025(25192);
		Class7_Sub2_Sub1.method130((byte) 110);
		Class65.method1289(true);
		JunkTex.method1732(-25300);
		JunkTex.method538((byte) -121);
		Class115.method1592((byte) 23);
		Class7_Sub2.method127(i);
		Class14_Sub2_Sub5.aClass20_3815.clear();
		Class75.idx0.method152(-118);
		Class109.idx1.method152(-123);
		Class14_Sub17.aCacheFileWorker_3021.method152(i ^ ~0x6b);
		Static2.aCacheFileWorker_2901.method152(-107);
		Class14_Sub13.aCacheFileWorker_2958.method152(-112);
		JunkTex.aCacheFileWorker_3374.method152(-124);
		JunkTex.aCacheFileWorker_4739.method152(-116);
		aCacheFileWorker_2750.method152(-105);
		JunkTex.aCacheFileWorker_4323.method152(-106);
		JunkTex.aCacheFileWorker_4603.method152(-125);
		JunkTex.aCacheFileWorker_4521.method152(-122);
		JunkTex.aClass52_4596.clear();
	}

	public void method452(int i) {
		int i_10_ = anInt2753;
		if (aClass79_2747 == null) {
			if (aSceneGraphNode_GameEntity_Sub2_2762 != null) {
				int i_11_ = Static2.method1500(aSceneGraphNode_GameEntity_Sub2_2762, -1);
				if (i_11_ != i_10_) {
					Class12 class12 = aSceneGraphNode_GameEntity_Sub2_2762.aClass12_4949;
					anInt2753 = i_11_;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 == null)
						anInt2765 = 0;
					else
						anInt2765 = class12.anInt293 * 128;
				}
			} else if (aSceneGraphNode_GameEntity_Sub1_2755 != null) {
				anInt2753 = Class116.method1597(false, aSceneGraphNode_GameEntity_Sub1_2755);
				anInt2765 = aSceneGraphNode_GameEntity_Sub1_2755.anInt4917 * 128;
			}
		} else {
			Class79 class79 = aClass79_2747.method1391(i - 18630);
			if (class79 != null) {
				anInt2753 = class79.anInt1294;
				anInt2765 = class79.anInt1271 * 128;
				anInt2769 = class79.anInt1254;
				anInt2772 = class79.anInt1289;
				anIntArray2746 = class79.anIntArray1287;
			} else {
				anInt2753 = -1;
				anInt2769 = 0;
				anInt2772 = 0;
				anInt2765 = 0;
				anIntArray2746 = null;
			}
		}
		if (anInt2753 != i_10_ && aClass14_Sub9_Sub4_2775 != null) {
			Class33.aClass14_Sub9_Sub2_585.method730(aClass14_Sub9_Sub4_2775);
			aClass14_Sub9_Sub4_2775 = null;
		}
	}

	public static void method453(int i) {
		int i_12_ = 115 / ((i - 41) / 63);
		aCacheFileWorker_2750 = null;
		aSceneGraphNode_GameEntity_Sub1_2748 = null;
	}
}
