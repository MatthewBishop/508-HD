/* Class125_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class148_Sub1;

public class Class125_Sub1 extends Class125 {
	public int anInt3362;
	public static int anInt3363;
	public int anInt3366;
	public static int anInt3367 = 0;
	public static Class14_Sub29[][][] aClass14_Sub29ArrayArrayArray3368;
	public int anInt3370;
	public static short aShort3372;
	public int anInt3373;

	static {
		anInt3363 = 0;
		aShort3372 = (short) 256;
	}

	public void method1721(boolean bool, int i, int i_0_) {
		/* empty */
	}

	public void method1726(int i, int i_1_, int i_2_) {
		int i_3_ = anInt3370 * i_2_ >> 44;
		int i_4_ = i_1_ * anInt3373 >> 12;
		if (i <= 39)
			method1724(-2, 35, 47);
		int i_5_ = anInt3362 * i_1_ >> 44;
		int i_6_ = anInt3366 * i_2_ >> 12;
		Class14_Sub2_Sub3.method271((byte) 102, i_4_, i_3_, anInt2079, i_6_, i_5_);
	}

	public void method1724(int i, int i_7_, int i_8_) {
		int i_9_ = i_8_ * anInt3370 >> 44;
		int i_10_ = i_8_ * anInt3366 >> 44;
		int i_11_ = i * anInt3373 >> 12;
		int i_12_ = i * anInt3362 >> 12;
		Class14_Sub2_Sub5.method283(i_10_, anInt2083, i_7_ + 6, anInt2086, i_9_, i_11_, anInt2079, i_12_);
		if (i_7_ != -6)
			aShort3372 = (short) -30;
	}

	public static void method1728(byte i) {
		while (JunkTex.aClass14_Sub10_Sub1_4734.method840(JunkTex.anInt4280) >= 11) {
			int i_13_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 11);
			if (i_13_ == 2047)
				break;
			boolean bool = false;
			if (JunkTex.aClass133_Sub1_Sub1Array4474[i_13_] == null) {
				bool = true;
				JunkTex.aClass133_Sub1_Sub1Array4474[i_13_] = new Class133_Sub1_Sub1();
				if (Static2.aClass14_Sub10Array2742[i_13_] != null)
					JunkTex.aClass133_Sub1_Sub1Array4474[i_13_].method1807((byte) -123,
							Static2.aClass14_Sub10Array2742[i_13_]);
			}
			Static2.anIntArray351[Static2.anInt2878++] = i_13_;
			Class133_Sub1_Sub1 class133_sub1_sub1 = JunkTex.aClass133_Sub1_Sub1Array4474[i_13_];
			class133_sub1_sub1.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			int i_14_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 5);
			int i_15_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_14_ > 15)
				i_14_ -= 32;
			if (i_15_ == 1)
				Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_13_;
			int i_16_ = (Class133.anIntArray2179[JunkTex.aClass14_Sub10_Sub1_4734.readBits(i - 22, 3)]);
			if (bool)
				class133_sub1_sub1.anInt3469 = class133_sub1_sub1.anInt3461 = i_16_;
			int i_17_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			int i_18_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(i ^ 0x16, 5);
			if (i_18_ > 15)
				i_18_ -= 32;
			class133_sub1_sub1.method1800((byte) -76, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]) + i_18_,
					i_17_ == 1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) + i_14_);
		}
		JunkTex.aClass14_Sub10_Sub1_4734.disableBitAccess();
		if (i != 22)
			method1730(30);
	}

	public static Class148_Sub1[] method1729(Class9 class9, int i, int i_19_, byte i_20_) {
		if (i_20_ != 48)
			method1729(null, -104, -52, (byte) -6);
		if (!Class109.method1564(-2, i_19_, i, class9)) {
			Class148_Sub1[] class148_sub1s = null;
			return class148_sub1s;
		}
		Class148_Sub1[] class148_sub1s = Class146.method1992((byte) -111);
		return class148_sub1s;
	}

	public static void method1730(int i) {
		aClass14_Sub29ArrayArrayArray3368 = null;
		if (i > -37)
			anInt3367 = 14;
	}

	public Class125_Sub1(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_) {
		super(i_24_, i_25_, i_26_);
		anInt3370 = i;
		anInt3362 = i_23_;
		anInt3373 = i_21_;
		anInt3366 = i_22_;
	}
}
