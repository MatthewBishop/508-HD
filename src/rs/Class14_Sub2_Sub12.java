/* Class14_Sub2_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.loaders.VarBit;
import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.rt4.ShadowManager;

public class Class14_Sub2_Sub12 extends Cacheable {
	public static Class124 aClass124_3895 = Class124.method263("blinken2:");
	public int anInt3896;
	public static Class124 aClass124_3897 = Class124.method263("Loading textures )2 ");
	public Class124[] aClass124Array3899;
	public int[] anIntArray3900;
	public int anInt3901;
	public HashTable[] aClass55Array3903;
	public int anInt3904;
	public Class124 aClass124_3906;
	public int[] anIntArray3907;
	public static Class124 aClass124_3910 = aClass124_3897;
	public int anInt3911;
	public static int anInt3912;
	public static byte[][] aByteArrayArray3913;
	public static Class124 aClass124_3915;
	public static int[] anIntArray3916;
	public static int[] anIntArray3917;
	public static int[] spriteYOffsets;

	static {
		
		anInt3912 = -1;
		
		anIntArray3916 = new int[25];
		aClass124_3915 = (Class124.method263("(U0a )2 non)2existant gosub script)2num: "));
		anIntArray3917 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	}

	public static void method317(byte i) {
		if (!Class128.method1755(130068615) && Class142.anInt2295 != Class14_Sub2_Sub3.gameLevel)
			Class45.method1162(Static2.anInt818, Static2.anInt2133, Class14_Sub2_Sub3.gameLevel,
					(Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3443[0]), (byte) -117,
					(Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3476[0]), false);
		else {
			if (i > -116)
				anIntArray3917 = null;
			if (JunkTex.anInt4207 != Class14_Sub2_Sub3.gameLevel) {
				JunkTex.anInt4207 = Class14_Sub2_Sub3.gameLevel;
				JunkTex.method502(false, Class14_Sub2_Sub3.gameLevel);
				JunkTex.method602(-1);
			}
		}
	}

	public static void method318(int i, int i_0_, boolean bool) {
		VarBit varBit = VarBit.list(i);
		if (bool)
			method323(75, 25, 72);
		int i_1_ = varBit.anInt842;
		int i_2_ = varBit.anInt834;
		int i_3_ = varBit.anInt832;
		int i_4_ = Class1.anIntArray69[i_2_ - i_3_];
		if (i_0_ < 0 || i_0_ > i_4_)
			i_0_ = 0;
		i_4_ <<= i_3_;
		Static2.method58((i_4_ & i_0_ << i_3_ | (Static2.anIntArray4851[i_1_] & (i_4_ ^ 0xffffffff))),
				(byte) -1, i_1_);
	}

	public static void method319(int i) {
		ShadowManager.method2029(104, 104);
		Class14_Sub15.method871(Static2.aCacheFileWorker_2750, Class64.aCacheFileWorker_1015, -125);
		JunkTex.method85(Static2.aCacheFileWorker_2750, true);
		if (JunkTex.gameState == 10)
			Static2.method1743(28);
		if ((JunkTex.gameState ^ 0xffffffff) == i)
			Static2.method1743(25);
	}

	public static void method320(byte i) {
		anIntArray3917 = null;
		aClass124_3895 = null;
		aClass124_3915 = null;
		aClass124_3897 = null;
		anIntArray3916 = null;
		aByteArrayArray3913 = null;
		aClass124_3910 = null;
		if (i != -48)
			aClass124_3897 = null;
		spriteYOffsets = null;
	}

	public static int method322(int i, byte i_6_, int i_7_) {
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get(i));
		if (class14_sub25 == null) {
			int i_8_ = 0;
			return i_8_;
		}
		if (i_7_ == -1) {
			int i_9_ = 0;
			return i_9_;
		}
		int i_10_ = 0;
		if (i_6_ != 55)
			anIntArray3916 = null;
		for (int i_11_ = 0; class14_sub25.anIntArray3177.length > i_11_; i_11_++) {
			if (i_7_ == class14_sub25.anIntArray3178[i_11_])
				i_10_ += class14_sub25.anIntArray3177[i_11_];
		}
		int i_12_ = i_10_;
		return i_12_;
	}

	public static long method323(int i, int i_13_, int i_14_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_13_][i_14_];
		if (class14_sub29 == null || class14_sub29.aClass37_3255 == null)
			return 0L;
		return class14_sub29.aClass37_3255.aLong634;
	}

}
