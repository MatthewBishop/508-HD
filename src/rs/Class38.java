/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;
import com.jagex.rt4.AbstractSprite;

public class Class38 implements Interface5 {
	public static int anInt2616 = 0;
	public static int anInt2617;
	public static int anInt2618;
	public static int mouseOffFromCenterY = 0;
	public static int anInt2624;

	public Class124 method24(long l, int i, int[] is, boolean bool) {
		if (i == 0) {
			Class14_Sub2_Sub8 class14_sub2_sub8 = Static2.method1507(-8475, is[0]);
			Class124 class124 = class14_sub2_sub8.method295(-68, (int) l);
			return class124;
		}
		if (i == 1 || i == 10) {
			Class142 class142 = JunkTex.method605(102, (int) l);
			Class124 class124 = class142.aClass124_2296;
			return class124;
		}
		if (!bool)
			anInt2618 = 100;
		if (i == 6 || i == 7) {
			Class124 class124 = Static2.method1507(-8475, is[0]).method295(-76, (int) l);
			return class124;
		}
		Class124 class124 = null;
		return class124;
	}

	public static AbstractSprite[] method1115(boolean bool, FileSystem fileSystem, int i, int i_39_) {
		if (!Static3.method1564(i, i_39_, fileSystem)) {
			AbstractSprite[] class14_sub2_sub19s = null;
			return class14_sub2_sub19s;
		}
		if (bool)
			method1116(-87, true);
		AbstractSprite[] class14_sub2_sub19s = JunkTex.method535(!bool);
		return class14_sub2_sub19s;
	}

	public static void method1116(int i, boolean bool) {
		if ((Static2.anInt1085 == Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495 >> 7)
				&& (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436 >> 39 == JunkTex.anInt4335))
			Static2.anInt1085 = 0;
		int i_40_ = Static2.anInt2878;
		if (i != 1)
			anInt2624 = -52;
		if (bool)
			i_40_ = 1;
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
			long l;
			SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1;
			if (bool) {
				class133_sub1_sub1 = Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748;
				l = 8791798054912L;
			} else {
				l = (long) Static2.anIntArray351[i_41_] << 32;
				class133_sub1_sub1 = (JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[Static2.anIntArray351[i_41_]]);
			}
			if (class133_sub1_sub1 != null && class133_sub1_sub1.method1804((byte) 115)) {
				class133_sub1_sub1.aBoolean4921 = false;
				if ((Class135.aBoolean2190 && Static2.anInt2878 > 200 || Static2.anInt2878 > 50) && !bool
						&& (class133_sub1_sub1.anInt3452 == class133_sub1_sub1.anInt3433))
					class133_sub1_sub1.aBoolean4921 = true;
				int i_42_ = class133_sub1_sub1.anInt3495 >> 7;
				int i_43_ = class133_sub1_sub1.anInt3436 >> 39;
				if (i_42_ >= 0 && i_42_ < 104 && i_43_ >= 0 && i_43_ < 104) {
					if (class133_sub1_sub1.aSceneGraphNode_AbstractModelRenderer_4933 == null
							|| (class133_sub1_sub1.anInt4929 > Class14_Sub2_Sub20.anInt4064)
							|| (Class14_Sub2_Sub20.anInt4064 >= class133_sub1_sub1.anInt4910)) {
						if (class133_sub1_sub1.anInt3493 == 1 && (class133_sub1_sub1.anInt3495 & 0x7f) == 64
								&& (class133_sub1_sub1.anInt3436 & 0x7f) == 64) {
							if ((Class14_Sub2_Sub8.anIntArrayArray3846[i_42_][i_43_]) == Class42.anInt699)
								continue;
							Class14_Sub2_Sub8.anIntArrayArray3846[i_42_][i_43_] = Class42.anInt699;
						}
						class133_sub1_sub1.anInt3500 = JunkTex.method1017(class133_sub1_sub1.anInt3495,
								Class14_Sub2_Sub3.gameLevel, (byte) 85, class133_sub1_sub1.anInt3436);
						JunkTex.method519(Class14_Sub2_Sub3.gameLevel, class133_sub1_sub1.anInt3495,
								class133_sub1_sub1.anInt3436, class133_sub1_sub1.anInt3500,
								class133_sub1_sub1.anInt3493 * 64 + 60 - 64, class133_sub1_sub1,
								class133_sub1_sub1.anInt3461, l, class133_sub1_sub1.aBoolean3488);
					} else {
						class133_sub1_sub1.aBoolean4921 = false;
						class133_sub1_sub1.anInt3500 = JunkTex.method1017(class133_sub1_sub1.anInt3495,
								Class14_Sub2_Sub3.gameLevel, (byte) -112, class133_sub1_sub1.anInt3436);
						Class128.method1757(Class14_Sub2_Sub3.gameLevel, class133_sub1_sub1.anInt3495,
								class133_sub1_sub1.anInt3436, class133_sub1_sub1.anInt3500, class133_sub1_sub1,
								class133_sub1_sub1.anInt3461, l, class133_sub1_sub1.anInt4914,
								class133_sub1_sub1.anInt4908, class133_sub1_sub1.anInt4906,
								class133_sub1_sub1.anInt4924);
					}
				}
			}
		}
	}

	public static void method1118(int i, int i_48_) {
		if (i == 37)
			JunkTex.aFloat2854 = 3.0F;
		else if (i != 50) {
			if (i == 75)
				JunkTex.aFloat2854 = 6.0F;
			else
				JunkTex.aFloat2854 = 8.0F;
		} else
			JunkTex.aFloat2854 = 4.0F;
		Class14_Sub18.anInt3050 = -1;
		Class14_Sub18.anInt3050 = i_48_;
	}
}
