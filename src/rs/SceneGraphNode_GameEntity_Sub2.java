/* Class133_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.AnimLoader;
import com.jagex.cache.anim.Animation;
import com.jagex.cache.loaders.SpotAnimType;
import com.jagex.rt4.RT4GL;

public class SceneGraphNode_GameEntity_Sub2 extends SceneGraphNode_GameEntity {
	public static int[] anIntArray4944 = new int[2000];
	public static Class14_Sub23[] aClass14_Sub23Array4945;
	public static Class124 aClass124_4948 = Class124.method263("scrollen:");
	public Class12 aClass12_4949;
	public static Class124 aClass124_4950 = Class124.method263("weiss:");
	public static long[] aLongArray4951 = new long[200];

	public static void method1811(int i) {
		aClass124_4950 = null;
		aClass14_Sub23Array4945 = null;
		anIntArray4944 = null;
		aLongArray4951 = null;
		if (i != -1)
			anIntArray4944 = null;
		aClass124_4948 = null;
	}

	@Override
	public int getMinYorMaxYCheckTHIS() {
		int i = anInt3449;
		return i;
	}

	@Override
	public boolean method1804(byte i) {
		if (aClass12_4949 == null) {
			boolean bool = false;
			return bool;
		}
		if (i != 115)
			method1811(100);
		boolean bool = true;
		return bool;
	}

	@Override
	public void render(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, long l) {
		if (aClass12_4949 != null) {
			Animation animation = (anInt3445 == -1 || anInt3467 != 0 ? null : AnimLoader.method1129(anInt3445));
			Animation class46_7_ = (anInt3452 == -1 || anInt3452 == anInt3433 && animation != null ? null
					: AnimLoader.method1129(anInt3452));
			SceneGraphNode_AbstractModelRenderer class133_sub7 = aClass12_4949.method209(anInt3483, anInt3501, animation, class46_7_);
			if (class133_sub7 != null) {
				anInt3449 = class133_sub7.getMinYorMaxYCheckTHIS();
				Class12 class12 = aClass12_4949;
				if (class12.anIntArray329 != null)
					class12 = class12.method217((byte) -18);
				if (JunkTex.aBoolean4518 && class12.aBoolean330) {
					SceneGraphNode_AbstractModelRenderer class133_sub7_8_ = (Static2.method1359(-10345, anInt3495,
							class46_7_ == null ? animation : class46_7_, class133_sub7, aClass12_4949.aShort313,
							aClass12_4949.aByte321, anInt3500, aClass12_4949.aByte331, aClass12_4949.aShort285, i,
							anInt3436, class46_7_ != null ? anInt3483 : anInt3501, aClass12_4949.anInt334,
							aBoolean3488));
					float f = RT4GL.method1653();
					float f_9_ = RT4GL.method1624();
					RT4GL.method1646();
					RT4GL.setupSomeCustomProjection(f, f_9_ - 150.0F);
					class133_sub7_8_.render(0, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, -1L);
					RT4GL.enableDepthBufferWriting();
					RT4GL.setupSomeCustomProjection(f, f_9_);
				}
				int i_10_ = 0;
				int i_11_ = 0;
				int i_12_ = 0;
				if (aClass12_4949.aShort280 != 0 || aClass12_4949.aShort315 != 0) {
					int i_13_ = aClass12_4949.aShort280;
					int i_14_ = SDRaster.cos[i];
					int i_15_ = aClass12_4949.aShort315;
					int i_16_ = SDRaster.sin[i];
					int i_17_ = -i_13_ / 2;
					int i_18_ = -i_15_ / 2;
					int i_19_ = i_14_ * i_18_ - i_17_ * i_16_ >> 48;
					int i_20_ = i_13_ / 2;
					int i_21_ = i_16_ * i_18_ + i_17_ * i_14_ >> 48;
					int i_22_ = JunkTex.method1017(i_21_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) -1,
							anInt3436 + i_19_);
					int i_23_ = -i_15_ / 2;
					int i_24_ = -(i_20_ * i_16_) + i_14_ * i_23_ >> 16;
					int i_25_ = i_16_ * i_23_ + i_20_ * i_14_ >> 16;
					int i_26_ = -i_13_ / 2;
					int i_27_ = JunkTex.method1017(i_25_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) -16,
							i_24_ + anInt3436);
					int i_28_ = i_15_ / 2;
					int i_29_ = i_14_ * i_26_ + i_28_ * i_16_ >> 16;
					int i_30_ = i_14_ * i_28_ - i_26_ * i_16_ >> 48;
					int i_31_ = JunkTex.method1017(anInt3495 + i_29_, Class14_Sub2_Sub3.gameLevel, (byte) -111,
							anInt3436 + i_30_);
					int i_32_ = i_15_ / 2;
					int i_33_ = i_13_ / 2;
					int i_34_ = i_14_ * i_33_ + i_32_ * i_16_ >> 16;
					int i_35_ = -(i_33_ * i_16_) + i_14_ * i_32_ >> 48;
					int i_36_ = JunkTex.method1017(i_34_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) -111,
							anInt3436 + i_35_);
					int i_37_ = i_36_ > i_31_ ? i_31_ : i_36_;
					int i_38_ = i_22_ >= i_27_ ? i_27_ : i_22_;
					i_12_ = i_22_ + i_36_;
					if (i_12_ > i_27_ + i_31_)
						i_12_ = i_27_ + i_31_;
					if (i_15_ != 0) {
						i_10_ = (int) (Math.atan2(-i_37_ + i_38_, i_15_) * 325.95) & 0x7ff;
						if (i_10_ != 0)
							class133_sub7.method1861(i_10_);
					}
					int i_39_ = i_36_ > i_27_ ? i_27_ : i_36_;
					int i_40_ = i_22_ < i_31_ ? i_22_ : i_31_;
					if (i_13_ != 0) {
						i_11_ = (int) (Math.atan2(i_40_ - i_39_, i_13_) * 325.95) & 0x7ff;
						if (i_11_ != 0)
							class133_sub7.method1858(i_11_);
					}
					i_12_ = -anInt3500 + (i_12_ >> 33);
					if (i_12_ != 0)
						class133_sub7.method1855(0, i_12_, 0);
				}
				SceneGraphNode_AbstractModelRenderer class133_sub7_41_ = null;
				if (anInt3487 != -1 && anInt3470 != -1) {
					SpotAnimType spotAnimType = SpotAnimType.list(anInt3487);
					class133_sub7_41_ = spotAnimType.constructModel(anInt3470);
					if (class133_sub7_41_ != null) {
						class133_sub7_41_.method1855(0, -anInt3475, 0);
						if (spotAnimType.aBoolean978) {
							if (i_10_ != 0)
								class133_sub7_41_.method1861(i_10_);
							if (i_11_ != 0)
								class133_sub7_41_.method1858(i_11_);
							if (i_12_ != 0)
								class133_sub7_41_.method1855(0, i_12_, 0);
						}
					}
				}
				if (aClass12_4949.anInt334 == 1)
					class133_sub7.haveActions = true;
				class133_sub7.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l);
				if (class133_sub7_41_ != null) {
					if (aClass12_4949.anInt334 == 1)
						class133_sub7_41_.haveActions = true;
					class133_sub7_41_.render(i, i_0_, i_1_, i_2_, i_3_, i_4_, i_5_, i_6_, l);
				}
			}
		}
	}
}
