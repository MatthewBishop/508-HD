/* Class14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Linkable;
import com.jagex.sound.wip.Class14_Sub9_Sub4;

public class Class14_Sub3 extends Linkable {
	public boolean aBoolean2757;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2760;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2775;
	public Class79 aClass79_2747;
	public int anInt2751;
	public int anInt2753;
	public int anInt2756 = 0;
	public int anInt2761;
	public int anInt2763;
	public int anInt2765;
	public int anInt2767;
	public int anInt2769;
	public int anInt2772;
	public int anInt2773;
	public int anInt2774;

	public int[] anIntArray2746;

	public SceneGraphNode_GameEntity_Sub1 aSceneGraphNode_GameEntity_Sub1_2755;

	public SceneGraphNode_GameEntity_Sub2 aSceneGraphNode_GameEntity_Sub2_2762;

	public void method452(int i) {
		int i_10_ = anInt2753;
		if (aClass79_2747 == null) {
			if (aSceneGraphNode_GameEntity_Sub2_2762 != null) {
				int i_11_ = StaticMusic.method1500(aSceneGraphNode_GameEntity_Sub2_2762, -1);
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
				anInt2753 = StaticMusic.method1597(false, aSceneGraphNode_GameEntity_Sub1_2755);
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
			StaticMusic.aClass14_Sub9_Sub2_585.method730(aClass14_Sub9_Sub4_2775);
			aClass14_Sub9_Sub4_2775 = null;
		}
	}
}
