/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.ref.SoftCache;

import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Static;

public class Class21 {
	public static int[] anIntArray437;
	public static Class36 aClass36_441;
	public static int[] anIntArray442;
	public static SoftCache aClass52_444 = new SoftCache(64);
	public short[] aShortArray445;
	public int anInt446 = -1;
	public int[] anIntArray447 = { -1, -1, -1, -1, -1 };
	public boolean aBoolean449 = false;
	public short[] aShortArray450;
	public static int[][] anIntArrayArray452 = { new int[0], { 128, 0, 128, 128, 0, 128 },
			{ 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 },
			{ 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 },
			{ 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 },
			{ 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 },
			{ 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };
	public short[] aShortArray453;
	public short[] aShortArray455;
	public int[] anIntArray457;

	public static Class94 method975(Class94 class94, boolean bool) {
		if (class94.anInt1540 != -1) {
			Class94 class94_0_ = Static.method1233(class94.anInt1540, 21803);
			return class94_0_;
		}
		int i = class94.anInt1548 >>> 48;
		if (bool) {
			Class94 class94_1_ = null;
			return class94_1_;
		}
		for (Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst()); class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
						.getNext()) {
			if (class14_sub15.anInt2999 == i)
				return Static.method1233((int) class14_sub15.key, 21803);
		}
		return null;
	}

	public void method976(Buffer class14_sub10, int i, int i_2_) {
		if (i_2_ != -71)
			method980(78, null);
		if (i == 1)
			anInt446 = class14_sub10.readUByte();
		else if (i == 2) {
			int i_3_ = class14_sub10.readUByte();
			anIntArray457 = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				anIntArray457[i_4_] = class14_sub10.readUShort((byte) 118);
		} else if (i != 3) {
			if (i == 40) {
				int i_5_ = class14_sub10.readUByte();
				aShortArray445 = new short[i_5_];
				aShortArray450 = new short[i_5_];
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					aShortArray445[i_6_] = (short) class14_sub10.readUShort((byte) 116);
					aShortArray450[i_6_] = (short) class14_sub10.readUShort((byte) 103);
				}
			} else if (i == 41) {
				int i_7_ = class14_sub10.readUByte();
				aShortArray453 = new short[i_7_];
				aShortArray455 = new short[i_7_];
				for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
					aShortArray453[i_8_] = (short) class14_sub10.readUShort((byte) 113);
					aShortArray455[i_8_] = (short) class14_sub10.readUShort((byte) 122);
				}
			} else if (i >= 60 && i < 70)
				anIntArray447[i - 60] = class14_sub10.readUShort((byte) 107);
		} else
			aBoolean449 = true;
	}

	public Class133_Sub2 method977(byte i) {
		Class133_Sub2[] class133_sub2s = new Class133_Sub2[5];
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < 5; i_10_++) {
			if (anIntArray447[i_10_] != -1)
				class133_sub2s[i_9_++] = Class133_Sub2.method1824(Class14_Sub2_Sub8.aClass9_3848, anIntArray447[i_10_],
						0);
		}
		if (i != 61)
			method977((byte) 61);
		Class133_Sub2 class133_sub2 = new Class133_Sub2(class133_sub2s, i_9_);
		if (aShortArray445 != null) {
			for (int i_11_ = 0; i_11_ < aShortArray445.length; i_11_++)
				class133_sub2.method1813(aShortArray445[i_11_], aShortArray450[i_11_]);
		}
		if (aShortArray453 != null) {
			for (int i_12_ = 0; aShortArray453.length > i_12_; i_12_++)
				class133_sub2.method1819(aShortArray453[i_12_], aShortArray455[i_12_]);
		}
		Class133_Sub2 class133_sub2_13_ = class133_sub2;
		return class133_sub2_13_;
	}

	public static Class88[] method978(int i) {
		int i_14_ = 63 / ((0 - i) / 39);
		if (Class76.aClass88Array1211 == null) {
			Class88[] class88s = Class14_Sub18.method884(-3189, Class14_Sub8_Sub34.aClass43_4647);
			Class88[] class88s_15_ = new Class88[class88s.length];
			int i_16_ = 0;
			while_56_: for (int i_17_ = 0; i_17_ < class88s.length; i_17_++) {
				Class88 class88 = class88s[i_17_];
				if ((class88.anInt1402 <= 0 || class88.anInt1402 >= 24) && class88.anInt1396 >= 800
						&& class88.anInt1397 >= 600) {
					for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
						Class88 class88_19_ = class88s_15_[i_18_];
						if (class88.anInt1396 == class88_19_.anInt1396 && class88.anInt1397 == class88_19_.anInt1397) {
							if (class88_19_.anInt1402 < class88.anInt1402)
								class88s_15_[i_18_] = class88;
							continue while_56_;
						}
					}
					class88s_15_[i_16_] = class88;
					i_16_++;
				}
			}
			Class76.aClass88Array1211 = new Class88[i_16_];
			Class72.method1320(class88s_15_, 0, Class76.aClass88Array1211, 0, i_16_);
			int[] is = new int[Class76.aClass88Array1211.length];
			for (int i_20_ = 0; i_20_ < Class76.aClass88Array1211.length; i_20_++) {
				Class88 class88 = Class76.aClass88Array1211[i_20_];
				is[i_20_] = class88.anInt1397 * class88.anInt1396;
			}
			Class114.method1586(is, Class76.aClass88Array1211, (byte) 122);
		}
		Class88[] class88s = Class76.aClass88Array1211;
		return class88s;
	}

	public static void method979(int i) {
		aClass52_444 = null;
		aClass36_441 = null;
		anIntArray437 = null;
		anIntArrayArray452 = null;
		anIntArray442 = null;
		int i_21_ = -8 / ((-18 - i) / 38);
	}

	public void method980(int i, Buffer class14_sub10) {
		for (;;) {
			int i_22_ = class14_sub10.readUByte();
			if (i_22_ == 0)
				break;
			method976(class14_sub10, i_22_, i + 29431);
		}
		if (i != -29502)
			anInt446 = 124;
	}

	public Class133_Sub2 method981(byte i) {
		if (anIntArray457 == null) {
			Class133_Sub2 class133_sub2 = null;
			return class133_sub2;
		}
		Class133_Sub2[] class133_sub2s = new Class133_Sub2[anIntArray457.length];
		for (int i_23_ = 0; anIntArray457.length > i_23_; i_23_++)
			class133_sub2s[i_23_] = Class133_Sub2.method1824(Class14_Sub2_Sub8.aClass9_3848, anIntArray457[i_23_], 0);
		if (i != -47) {
			Class133_Sub2 class133_sub2 = null;
			return class133_sub2;
		}
		Class133_Sub2 class133_sub2;
		if (class133_sub2s.length == 1)
			class133_sub2 = class133_sub2s[0];
		else
			class133_sub2 = new Class133_Sub2(class133_sub2s, class133_sub2s.length);
		if (aShortArray445 != null) {
			for (int i_24_ = 0; aShortArray445.length > i_24_; i_24_++)
				class133_sub2.method1813(aShortArray445[i_24_], aShortArray450[i_24_]);
		}
		if (aShortArray453 != null) {
			for (int i_25_ = 0; aShortArray453.length > i_25_; i_25_++)
				class133_sub2.method1819(aShortArray453[i_25_], aShortArray455[i_25_]);
		}
		Class133_Sub2 class133_sub2_26_ = class133_sub2;
		return class133_sub2_26_;
	}

	public boolean method982(boolean bool) {
		if (anIntArray457 == null) {
			boolean bool_27_ = true;
			return bool_27_;
		}
		if (bool)
			aClass52_444 = null;
		boolean bool_28_ = true;
		for (int i = 0; i < anIntArray457.length; i++) {
			if (!Class14_Sub2_Sub8.aClass9_3848.method158(0, anIntArray457[i], (byte) 124))
				bool_28_ = false;
		}
		boolean bool_29_ = bool_28_;
		return bool_29_;
	}

	public boolean method983(boolean bool) {
		boolean bool_30_ = true;
		for (int i = 0; i < 5; i++) {
			if (anIntArray447[i] != -1 && !Class14_Sub2_Sub8.aClass9_3848.method158(0, anIntArray447[i], (byte) 74))
				bool_30_ = false;
		}
		if (bool)
			anIntArray437 = null;
		boolean bool_31_ = bool_30_;
		return bool_31_;
	}
}
