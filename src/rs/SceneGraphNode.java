/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.AbstractSprite_Sub1;

public abstract class SceneGraphNode {
	public static Class124 aClass124_2175 = Class124.method263("Spieler");

	public static Class124 aClass124_2188 = Class124.method263("Players");
	public static AbstractSprite_Sub1[] aClass14_Sub2_Sub19_Sub1Array2186;
	public static int[] anIntArray2176 = new int[100];
	public static int[] anIntArray2179 = { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
	public static Class124 aClass124_2183 = aClass124_2188;

	public static void method1782(int i, int i_4_, int i_5_) {
		int i_6_ = i_4_;
		if (i_6_ > 25)
			i_6_ = 25;
		i_4_--;
		int i_7_ = JunkTex.anIntArray4691[i_4_];
		int i_8_ = Class14_Sub2_Sub21.anIntArray4078[i_4_];
		if (i_5_ == 0) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(49);
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(i_6_ + 3 + i_6_);
		}
		if (i_5_ == 1) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(119);
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(i_6_ + 3 + (i_6_ + 14));
		}
		if (i_5_ == 2) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(138);
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(i_6_ + i_6_ + 3);
		}
		JunkTex.aClass14_Sub10_Sub1_891.method801((byte) -86, i_7_ + SceneGraphNode_Projectile.anInt3676);
		JunkTex.aClass14_Sub10_Sub1_891.method792(i_8_ + Class58.anInt947, (byte) -98);
		JunkTex.aClass14_Sub10_Sub1_891.method795((!(JunkTex.aBooleanArray4581[82]) ? 0 : 1));
		Static2.anInt1085 = JunkTex.anIntArray4691[0];
		JunkTex.anInt4335 = Class14_Sub2_Sub21.anIntArray4078[0];
		int i_9_ = 1;
		if (i != -20179)
			anIntArray2176 = null;
		for (/**/; i_9_ < i_6_; i_9_++) {
			i_4_--;
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(((JunkTex.anIntArray4691[i_4_]) - i_7_));
			JunkTex.aClass14_Sub10_Sub1_891.method789(((Class14_Sub2_Sub21.anIntArray4078[i_4_]) - i_8_));
		}
	}

	public static void method1785(byte i) {
		anIntArray2176 = null;
		aClass124_2175 = null;
		anIntArray2179 = null;
		aClass124_2183 = null;
		aClass124_2188 = null;
		aClass14_Sub2_Sub19_Sub1Array2186 = null;
	}

	public static void method1789(byte i) {
		Static2.aClass52_2946.clearSoftReference();
	}

	public abstract int getMinYorMaxYCheckTHIS();

	public boolean method1784() {
		boolean bool = false;
		return bool;
	}

	public void method1788(SceneGraphNode sceneGraphNode_42_, int i, int i_43_, int i_44_, boolean bool) {
		/* empty */
	}

	public void method1790(int i, int i_45_, int i_46_, int i_47_, int i_48_) {

	}

	public SceneGraphNode method1791(int i, int i_50_, int i_51_) {
		SceneGraphNode sceneGraphNode_52_ = this;
		return sceneGraphNode_52_;
	}

	public abstract void render(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_,
			long l);
}
