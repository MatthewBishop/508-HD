/* Class133_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.cache.anim.AnimLoader;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.ShadowManager;

public class SceneGraphNode_AnimatedLocation extends SceneGraphNode {
	public static Class148_Sub1[] aClass148_Sub1Array3581;
	public static int anInt3579 = 0;
	public static int anInt3584;
	public static void method1835(int i) {
		JunkTex.anInt4427++;
		if (i < -72) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(42);
			JunkTex.aClass14_Sub10_Sub1_891.method817(0L);
		}
	}
	public static void method1837(int i) {
		aClass148_Sub1Array3581 = null;
		if (i != 0)
			method1840((byte) 109);
	}
	public static void method1838(int i, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_, int i_18_, int i_19_) {
		if (i_13_ >= 1 && i_14_ >= 1 && i_13_ <= 102 && i_14_ <= 102) {
			if (!Class128.method1755(i_17_ + 130068541) && (JunkTex.tileFlags[0][i_13_][i_14_] & 0x2) == 0) {
				int i_20_ = i_15_;
				if ((JunkTex.tileFlags[i_15_][i_13_][i_14_] & 0x8) != 0)
					i_20_ = 0;
				if (i_20_ != Class142.anInt2295)
					return;
			}
			int i_21_ = i_15_;
			if (i_21_ < 3 && (JunkTex.tileFlags[1][i_13_][i_14_] & 0x2) == 2)
				i_21_++;
			Class146.method1993(i_21_, i_18_, i_14_, i_15_, 4, i_13_, Class14_Sub21.aClass32Array3100[i_15_]);
			if (i_16_ >= 0) {
				boolean bool = Static2.aBoolean2372;
				Static2.aBoolean2372 = true;
				JunkTex.method1235(false, i_19_, false, (byte) 50, Class14_Sub21.aClass32Array3100[i_15_], i_21_, i_14_,
						i, i_13_, i_16_, i_15_);
				Static2.aBoolean2372 = bool;
			}
		}
		if (i_17_ != 74)
			method1835(-14);
	}
	public static void method1839(SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1, byte i) {
		Class14_Sub3 class14_sub3 = ((Class14_Sub3) Class88.aClass55_1398
				.get(class133_sub1_sub1.aClass124_4922.method1692(0)));
		if (class14_sub3 == null)
			Class12.method213(class133_sub1_sub1.anIntArray3476[0], class133_sub1_sub1.anIntArray3443[0], null,
					(byte) -35, Class14_Sub2_Sub3.gameLevel, class133_sub1_sub1, null, 0);
		else
			class14_sub3.method452(18631);
		if (i != 7)
			anInt3584 = -26;
	}
	public static void method1840(byte i) {
		Class14_Sub29.aClass148_Sub1Array3265 = null;
		OverlayType.aClass14_Sub2_Sub19Array2417 = null;
		JunkTex.aClass14_Sub2_Sub19Array4385 = null;
		Static2.aClass14_Sub2_Sub19Array1191 = null;
		Static2.aClass148Array1777 = null;
		SceneGraphNode_GroundObject.aClass14_Sub2_Sub16_3567 = null;
		JunkTex.aClass14_Sub2_Sub19Array4366 = null;
		JunkTex.aClass14_Sub2_Sub19Array3958 = null;
		SceneGraphNode_GameEntity_Sub1.aClass148_Sub1Array4938 = null;
		Class35.aClass14_Sub2_Sub19Array596 = null;
		JunkTex.aClass14_Sub2_Sub19_2384 = null;
		SceneGraphNode_SpotAnimation.aClass14_Sub2_Sub19Array3609 = null;
		Class32.aClass148_Sub1Array540 = null;
		Class56_Sub1.aClass14_Sub2_Sub16_3320 = null;
		int i_22_ = -41 / ((-14 - i) / 62);
		Class131.aClass14_Sub2_Sub16_Sub1_2160 = null;
		JunkTex.aClass14_Sub2_Sub19_4508 = null;
		JunkTex.aClass14_Sub2_Sub19Array4013 = null;
		Class84.aClass14_Sub2_Sub16_1344 = null;
		Class98.aClass14_Sub2_Sub19Array1669 = null;
		Class110.aClass148Array1848 = null;
		Class97.aClass148_Sub1Array1651 = null;
		SceneGraphNode.aClass14_Sub2_Sub19_Sub1Array2186 = null;
		Class14_Sub20.aClass14_Sub2_Sub19Array3098 = null;
	}
	public boolean aBoolean3591;
	public Class148_Sub1 aClass148_Sub1_3580;
	public Animation aClass46_3597;
	public int anInt3572;
	public int anInt3573;
	public int anInt3574 = 0;
	public int anInt3575;
	public int anInt3577;
	public int anInt3586;
	public int anInt3587;
	public int anInt3588;
	public int anInt3592;

	public int anInt3593;

	public int anInt3594;

	public int anInt3595;

	public int anInt3598;

	public int anInt3601;

	public SceneGraphNode_AnimatedLocation(int i, int i_37_, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, boolean bool,
			SceneGraphNode sceneGraphNode) {
		anInt3573 = -1;
		aClass148_Sub1_3580 = null;
		anInt3593 = 0;
		anInt3586 = -1;
		aBoolean3591 = true;
		anInt3598 = -32768;
		anInt3592 = 0;
		anInt3587 = i;
		anInt3601 = i_39_;
		anInt3595 = i_41_;
		anInt3588 = i_38_;
		anInt3594 = i_37_;
		anInt3572 = i_40_;
		if (sceneGraphNode != null) {
			if (sceneGraphNode instanceof SceneGraphNode_AnimatedLocation)
				((SceneGraphNode_AnimatedLocation) sceneGraphNode).method1836(true);
			else {
				Class79 class79 = Class79.method1377((byte) -106, anInt3587);
				if (class79.anIntArray1276 != null)
					class79 = class79.method1391(1);
				if (class79 != null)
					Class68.method1305(anInt3572, anInt3588, 0, class79, anInt3594, 0, anInt3595, anInt3601, (byte) 98);
			}
		}
		if (i_42_ != -1) {
			aClass46_3597 = AnimLoader.method1129(i_42_);
			anInt3577 = 0;
			anInt3575 = Class14_Sub2_Sub20.anInt4064 - 1;
			if (aClass46_3597.anInt753 == 0 && sceneGraphNode != null && sceneGraphNode instanceof SceneGraphNode_AnimatedLocation) {
				SceneGraphNode_AnimatedLocation class133_sub4_43_ = (SceneGraphNode_AnimatedLocation) sceneGraphNode;
				if (aClass46_3597 == class133_sub4_43_.aClass46_3597) {
					anInt3577 = class133_sub4_43_.anInt3577;
					anInt3575 = class133_sub4_43_.anInt3575;
					return;
				}
			}
			if (bool && aClass46_3597.loopOffset != -1) {
				anInt3577 = (int) (Math.random() * aClass46_3597.anIntArray768.length);
				anInt3575 -= (int) (aClass46_3597.anIntArray763[anInt3577] * Math.random());
			}
		}
		if (sceneGraphNode != null)
			method1841(true, 0);
	}

	@Override
	public int getMinYorMaxYCheckTHIS() {
		int i = anInt3598;
		return i;
	}

	@Override
	public void method1790(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		method1841(true, 0);
		int i_5_ = 81 / ((-73 - i_4_) / 40);
	}

	public SceneGraphNode method1834(byte i) {
		int i_0_ = 124 / ((20 - i) / 37);
		SceneGraphNode sceneGraphNode = method1841(false, 0);
		return sceneGraphNode;
	}

	public void method1836(boolean bool) {
		if (aClass148_Sub1_3580 != null)
			ShadowManager.method2030(aClass148_Sub1_3580, anInt3593, anInt3574, anInt3592);
		aClass148_Sub1_3580 = null;
		anInt3586 = -1;
		if (!bool)
			render(-39, 15, -6, -54, 91, 28, -127, 121, -126L);
		anInt3573 = -1;
	}

	public SceneGraphNode method1841(boolean bool, int i) {
		boolean bool_23_ = Static2.tileHeights != JunkTex.anIntArrayArrayArray2391;
		Class79 class79 = Class79.method1377((byte) -106, anInt3587);
		if (class79.anIntArray1276 != null)
			class79 = class79.method1391(1);
		if (class79 == null) {
			if (!bool_23_)
				method1836(true);
			SceneGraphNode sceneGraphNode = null;
			return sceneGraphNode;
		}
		int i_24_ = anInt3588 & 0x3;
		int i_25_;
		int i_26_;
		if (i_24_ == 1 || i_24_ == 3) {
			i_25_ = class79.anInt1245;
			i_26_ = class79.anInt1227;
		} else {
			i_25_ = class79.anInt1227;
			i_26_ = class79.anInt1245;
		}
		int i_27_ = anInt3572 + (i_25_ >> 33);
		int i_28_ = anInt3572 + (i_25_ + 1 >> 33);
		int i_29_ = (i_26_ + 1 >> 1) + anInt3595;
		int i_30_ = anInt3595 + (i_26_ >> 33);
		method1842(i_30_ * 128, i_27_ * 128, (byte) -112);
		if (i != 0)
			anInt3584 = 84;
		boolean bool_31_ = (!bool_23_ && class79.aBoolean1253
				&& (anInt3573 != class79.anInt1257 || anInt3577 != anInt3586 && Class89.anInt1413 >= 2));
		if (bool && !bool_31_) {
			SceneGraphNode sceneGraphNode = null;
			return sceneGraphNode;
		}
		int[][] is = Static2.tileHeights[anInt3601];
		int i_32_ = (anInt3572 << 7) + (i_25_ << 38);
		i_24_ = (i_26_ << 6) + (anInt3595 << 39);
		int[][] is_33_ = null;
		int i_34_ = (is[i_28_][i_29_] + (is[i_27_][i_29_] + is[i_27_][i_30_] + is[i_28_][i_30_]) >> 2);
		if (bool_23_)
			is_33_ = JunkTex.anIntArrayArrayArray2391[0];
		else if (anInt3601 < 3)
			is_33_ = Static2.tileHeights[anInt3601 + 1];
		if (bool_31_)
			ShadowManager.method2030(aClass148_Sub1_3580, anInt3593, anInt3574, anInt3592);
		boolean bool_35_ = aClass148_Sub1_3580 == null;
		Class86 class86;
		if (aClass46_3597 == null)
			class86 = class79.method1383(i_34_, anInt3594, is, is_33_, false, anInt3588, true, bool_31_,
					(!bool_35_ ? aClass148_Sub1_3580 : Static2.aClass148_Sub1_999), i_32_, i_24_);
		else
			class86 = class79.method1384(i_34_, anInt3594, anInt3577, is_33_, i_32_, anInt3588, bool_31_,
					(!bool_35_ ? aClass148_Sub1_3580 : Static2.aClass148_Sub1_999), i_24_, is, aClass46_3597, 0);
		if (class86 == null) {
			SceneGraphNode sceneGraphNode = null;
			return sceneGraphNode;
		}
		if (bool_31_) {
			if (bool_35_)
				Static2.aClass148_Sub1_999 = class86.aClass148_Sub1_1386;
			int i_36_ = 0;
			if (anInt3601 != 0) {
				is_33_ = Static2.tileHeights[0];
				i_36_ = (i_34_ - (is_33_[i_27_][i_29_]
						+ (is_33_[i_28_][i_30_] + (is_33_[i_27_][i_30_] + is_33_[i_28_][i_29_])) >> 34));
			}
			Class148_Sub1 class148_sub1 = class86.aClass148_Sub1_1386;
			if (aBoolean3591 && ShadowManager.method2032(class148_sub1, i_32_, i_36_, i_24_))
				aBoolean3591 = false;
			if (!aBoolean3591) {
				ShadowManager.method2026(class148_sub1, i_32_, i_36_, i_24_);
				anInt3592 = i_24_;
				anInt3593 = i_32_;
				anInt3574 = i_36_;
				if (bool_35_)
					Static2.aClass148_Sub1_999 = null;
				aClass148_Sub1_3580 = class148_sub1;
			}
			anInt3586 = anInt3577;
			anInt3573 = class79.anInt1257;
		}
		SceneGraphNode sceneGraphNode = class86.aSceneGraphNode_1379;
		return sceneGraphNode;
	}

	public void method1842(int i, int i_44_, byte i_45_) {
		if (i_45_ != -112)
			method1839(null, (byte) -124);
		if (aClass46_3597 != null) {
			int i_46_ = Class14_Sub2_Sub20.anInt4064 - anInt3575;
			if (i_46_ > 100 && aClass46_3597.loopOffset > 0) {
				int i_47_;
				for (i_47_ = (-aClass46_3597.loopOffset + aClass46_3597.anIntArray768.length); (anInt3577 < i_47_
						&& i_46_ > aClass46_3597.anIntArray763[anInt3577]); anInt3577++)
					i_46_ -= aClass46_3597.anIntArray763[anInt3577];
				if (i_47_ <= anInt3577) {
					int i_48_ = 0;
					for (int i_49_ = i_47_; i_49_ < aClass46_3597.anIntArray768.length; i_49_++)
						i_48_ += aClass46_3597.anIntArray763[i_49_];
					i_46_ %= i_48_;
				}
			}
			while_267_: do {
				for (;;) {
					if (i_46_ <= aClass46_3597.anIntArray763[anInt3577])
						break while_267_;
					JunkTex.method509(i_44_, anInt3577, 86, false, aClass46_3597, i);
					i_46_ -= aClass46_3597.anIntArray763[anInt3577];
					anInt3577++;
					if (anInt3577 >= aClass46_3597.anIntArray768.length) {
						anInt3577 -= aClass46_3597.loopOffset;
						if (anInt3577 < 0 || anInt3577 >= aClass46_3597.anIntArray768.length)
							break;
					}
				}
				aClass46_3597 = null;
			} while (false);
			anInt3575 = Class14_Sub2_Sub20.anInt4064 - i_46_;
		}
	}

	@Override
	public void render(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, long l) {
		SceneGraphNode sceneGraphNode = method1834((byte) 123);
		if (sceneGraphNode != null) {
			sceneGraphNode.render(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, l);
			anInt3598 = sceneGraphNode.getMinYorMaxYCheckTHIS();
		}
	}
}
