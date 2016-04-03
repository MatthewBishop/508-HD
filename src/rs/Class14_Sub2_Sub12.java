/* Class14_Sub2_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.ShadowManager;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub21;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub5;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Static;

public class Class14_Sub2_Sub12 extends Cacheable {
	public static SoftCache aClass52_3894;
	public static Class124 aClass124_3895 = Class14_Sub2_Sub2.method263(1178, "blinken2:");
	public int anInt3896;
	public static Class124 aClass124_3897 = Class14_Sub2_Sub2.method263(1178, "Loading textures )2 ");
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
	public static long[] aLongArray3914;
	public static Class124 aClass124_3915;
	public static int[] anIntArray3916;
	public static int[] anIntArray3917;
	public static int[] anIntArray3918;

	static {
		aClass52_3894 = new SoftCache(100);
		anInt3912 = -1;
		aLongArray3914 = new long[32];
		anIntArray3916 = new int[25];
		aClass124_3915 = (Class14_Sub2_Sub2.method263(1178, "(U0a )2 non)2existant gosub script)2num: "));
		anIntArray3917 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
	}

	public static void method317(byte i) {
		if (!Class128.method1755(130068615) && Class142.anInt2295 != Class14_Sub2_Sub3.anInt3785)
			Class45.method1162(Class49.anInt818, Class129.anInt2133, Class14_Sub2_Sub3.anInt3785,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), (byte) -117,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), false);
		else {
			if (i > -116)
				anIntArray3917 = null;
			if (Class14_Sub8_Sub7.anInt4207 != Class14_Sub2_Sub3.anInt3785) {
				Class14_Sub8_Sub7.anInt4207 = Class14_Sub2_Sub3.anInt3785;
				Class14_Sub8_Sub5.method502(false, Class14_Sub2_Sub3.anInt3785);
				Class14_Sub8_Sub23.method602(-1);
			}
		}
	}

	public static void method318(int i, int i_0_, boolean bool) {
		Class51 class51 = Class47.method1187(i, true);
		if (bool)
			method323(75, 25, 72);
		int i_1_ = class51.anInt842;
		int i_2_ = class51.anInt834;
		int i_3_ = class51.anInt832;
		int i_4_ = Class1.anIntArray69[i_2_ - i_3_];
		if (i_0_ < 0 || i_0_ > i_4_)
			i_0_ = 0;
		i_4_ <<= i_3_;
		Canvas_Sub1.method58((i_4_ & i_0_ << i_3_ | (Class14_Sub9_Sub3.anIntArray4851[i_1_] & (i_4_ ^ 0xffffffff))),
				(byte) -1, i_1_);
	}

	public static void method319(int i) {
		ShadowManager.method2029(104, 104);
		Class14_Sub15.method871(Class14_Sub3.aClass9_Sub1_2750, Class64.aClass9_Sub1_1015, -125);
		Static.method85(Class14_Sub3.aClass9_Sub1_2750, true);
		if (Class14_Sub8_Sub16.anInt4356 == 10)
			Class126.method1743(27252, 28);
		if ((Class14_Sub8_Sub16.anInt4356 ^ 0xffffffff) == i)
			Class126.method1743(27252, 25);
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
		aClass52_3894 = null;
		aLongArray3914 = null;
		anIntArray3918 = null;
	}

	public static void method321(int i) {
		if (Class14_Sub8_Sub21.anIntArray4435 == null || Static2.anIntArray3357 == null) {
			Static2.anIntArray3357 = new int[256];
			Class14_Sub8_Sub21.anIntArray4435 = new int[256];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				double d = (double) i_5_ / 255.0 * 6.283185307179586;
				Class14_Sub8_Sub21.anIntArray4435[i_5_] = (int) (Math.sin(d) * 4096.0);
				Static2.anIntArray3357[i_5_] = (int) (Math.cos(d) * 4096.0);
			}
		}
		if (i != 256)
			method323(-23, 57, 56);
	}

	public static int method322(int i, byte i_6_, int i_7_) {
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i));
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
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_13_][i_14_];
		if (class14_sub29 == null || class14_sub29.aClass37_3255 == null)
			return 0L;
		return class14_sub29.aClass37_3255.aLong634;
	}

	public static void method324(int i, int i_15_, int i_16_, int i_17_, byte i_18_, int i_19_) {
		int i_20_ = 71 % ((i_18_ + 91) / 32);
		int i_21_ = Class67.method1301((byte) -84, i_19_, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_22_ = Class67.method1301((byte) -112, i_16_, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_23_ = Class67.method1301((byte) -103, i, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		int i_24_ = Class67.method1301((byte) -60, i_17_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		for (int i_25_ = i_21_; i_22_ >= i_25_; i_25_++)
			Class51.method1201(Static2.anIntArrayArray4038[i_25_], i_23_, i_24_, -5973, i_15_);
	}
}
