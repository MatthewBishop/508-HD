/* Class133_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.AnimLoader;
import com.jagex.cache.anim.Animation;
import com.jagex.cache.loaders.SpotAnimType;
import com.jagex.rt4.AbstractSprite;

public class SceneGraphNode_SpotAnimation extends SceneGraphNode {
	public static boolean aBoolean3628 = false;
	public static Class124 aClass124_3607;
	public static Class124 aClass124_3610;
	public static AbstractSprite[] aClass14_Sub2_Sub19Array3609;
	public static int anInt3612 = 0;
	static {
		aClass124_3607 = Class124.method263("Close");
		aClass124_3610 = aClass124_3607;
	}
	public static void method1843(int i, int i_0_, Class94 class94, int i_1_) {
		if (Class67.aClass94_1060 == null && !aBoolean3628 && class94 != null
				&& JunkTex.method341(0, class94) != null) {
			Class67.aClass94_1060 = class94;
			JunkTex.aClass94_420 = JunkTex.method341(0, class94);
			JunkTex.anInt4132 = i_1_;
			JunkTex.anInt3419 = 0;
			int i_2_ = 106 % ((i - 9) / 39);
			JunkTex.aBoolean4188 = false;
			Canvas_Sub2.anInt63 = i_0_;
		}
	}
	public static void method1846(boolean bool) {
		if (bool)
			aClass14_Sub2_Sub19Array3609 = null;
		aClass14_Sub2_Sub19Array3609 = null;
		aClass124_3610 = null;
		
		aClass124_3607 = null;
	}
	public boolean finishedAnimating = false;
	public Animation aClass46_3611;
	public int anInt3605;
	public int anInt3608 = 0;
	public int anInt3613 = 0;
	public int anInt3616;
	public int anInt3617;

	public int anInt3620;

	public int anInt3622;

	public int anInt3629;

	public int anInt3631;

	public SceneGraphNode_SpotAnimation(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		anInt3617 = -32768;
		anInt3620 = i_13_;
		anInt3622 = i_14_;
		anInt3616 = i_17_ + i_18_;
		anInt3631 = i_15_;
		anInt3605 = i;
		anInt3629 = i_16_;
		int i_19_ = SpotAnimType.list(anInt3605).animationId;
		if (i_19_ != -1) {
			finishedAnimating = false;
			aClass46_3611 = AnimLoader.method1129(i_19_);
		} else
			finishedAnimating = true;
	}

	@Override
	public int getMinYorMaxYCheckTHIS() {
		int i = anInt3617;
		return i;
	}

	public void method1845(byte i, int i_3_) {
		while_268_: do {
			if (i > 81 && !finishedAnimating) {
				anInt3608 += i_3_;
				do {
					if (anInt3608 <= aClass46_3611.anIntArray763[anInt3613])
						break while_268_;
					anInt3608 -= aClass46_3611.anIntArray763[anInt3613];
					anInt3613++;
				} while (anInt3613 < aClass46_3611.anIntArray768.length);
				finishedAnimating = true;
			}
		} while (false);
	}

	public SceneGraphNode_AbstractModelRenderer method1847(int i) {
		SpotAnimType spotAnimType = SpotAnimType.list(anInt3605);
		SceneGraphNode_AbstractModelRenderer class133_sub7;
		if (finishedAnimating)
			class133_sub7 = spotAnimType.constructModel(-1);
		else
			class133_sub7 = spotAnimType.constructModel(anInt3613);
		if (class133_sub7 == null) {
			SceneGraphNode_AbstractModelRenderer class133_sub7_4_ = null;
			return class133_sub7_4_;
		}
		SceneGraphNode_AbstractModelRenderer class133_sub7_5_ = class133_sub7;
		return class133_sub7_5_;
	}

	@Override
	public void render(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, long l) {
		SceneGraphNode_AbstractModelRenderer class133_sub7 = method1847(5);
		if (class133_sub7 != null) {
			class133_sub7.render(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, l);
			anInt3617 = class133_sub7.getMinYorMaxYCheckTHIS();
		}
	}
}
