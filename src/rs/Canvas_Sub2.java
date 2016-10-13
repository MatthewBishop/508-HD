/* Canvas_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Canvas;
import java.awt.event.FocusListener;

public abstract class Canvas_Sub2 extends Canvas implements FocusListener {
	public static int anInt54 = 0;
	public static int anInt55;
	public static int anInt58;
	public static int anInt60;
	public static int anInt63;
	public static int anInt66;
	public static int[] anIntArray62 = { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1,
			-1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1,
			-1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53,
			39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227,
			233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1,
			-1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
			-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
	public static int[] anIntArray65 = { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	static {
		anInt63 = 0;
	}

	public static void method61(int i, int i_0_, int i_1_, int i_2_, Class133 class133, long l, Class133 class133_3_,
			Class133 class133_4_) {
		Class115 class115 = new Class115();
		class115.aClass133_1919 = class133;
		class115.anInt1913 = i_0_ * 128 + 64;
		class115.anInt1925 = i_1_ * 128 + 64;
		class115.anInt1911 = i_2_;
		class115.aLong1915 = l;
		class115.aClass133_1926 = class133_3_;
		class115.aClass133_1921 = class133_4_;
		int i_5_ = 0;
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 != null) {
			for (int i_6_ = 0; i_6_ < class14_sub29.anInt3242; i_6_++) {
				Class40 class40 = class14_sub29.aClass40Array3257[i_6_];
				if ((class40.aLong677 & 0x400000L) == 4194304L) {
					int i_7_ = class40.aClass133_679.method1781();
					if (i_7_ != -32768 && i_7_ < i_5_)
						i_5_ = i_7_;
				}
			}
		}
		class115.anInt1914 = -i_5_;
		if (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_] == null)
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_] = new Class14_Sub29(i, i_0_, i_1_);
		JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_].aClass115_3256 = class115;
	}

	public static float[] method62(float[] fs, boolean bool) {
		if (bool) {
			float[] fs_8_ = null;
			return fs_8_;
		}
		if (fs == null) {
			float[] fs_9_ = null;
			return fs_9_;
		}
		float[] fs_10_ = new float[fs.length];
		Class72.method1323(fs, 0, fs_10_, 0, fs.length);
		float[] fs_11_ = fs_10_;
		return fs_11_;
	}

	public static void method63(byte i) {
		while (JunkTex.aClass14_Sub10_Sub1_4734.method840(JunkTex.anInt4280) >= 27) {
			int i_12_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 15);
			if (i_12_ == 32767)
				break;
			boolean bool = false;
			if (Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_] == null) {
				Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_] = new Class133_Sub1_Sub2();
				bool = true;
			}
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_];
			JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_12_;
			class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			class133_sub1_sub2.aClass12_4949 = Class126
					.method1744(JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 14), 170);
			int i_13_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_13_ == 1)
				Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_12_;
			int i_14_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 5);
			if (i_14_ > 15)
				i_14_ -= 32;
			int i_15_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 5);
			if (i_15_ > 15)
				i_15_ -= 32;
			int i_16_ = (Class133.anIntArray2179[JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3)]);
			if (bool)
				class133_sub1_sub2.anInt3469 = class133_sub1_sub2.anInt3461 = i_16_;
			int i_17_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			class133_sub1_sub2.anInt3457 = class133_sub1_sub2.aClass12_4949.anInt296;
			class133_sub1_sub2.anInt3433 = class133_sub1_sub2.aClass12_4949.anInt323;
			class133_sub1_sub2.anInt3463 = class133_sub1_sub2.aClass12_4949.anInt276;
			class133_sub1_sub2.anInt3493 = class133_sub1_sub2.aClass12_4949.anInt334;
			class133_sub1_sub2.anInt3484 = class133_sub1_sub2.aClass12_4949.anInt284;
			class133_sub1_sub2.anInt3454 = class133_sub1_sub2.aClass12_4949.anInt318;
			class133_sub1_sub2.anInt3492 = class133_sub1_sub2.aClass12_4949.anInt303;
			class133_sub1_sub2.anInt3432 = class133_sub1_sub2.aClass12_4949.anInt339;
			if (class133_sub1_sub2.anInt3492 == 0)
				class133_sub1_sub2.anInt3461 = 0;
			class133_sub1_sub2.anInt3471 = class133_sub1_sub2.aClass12_4949.anInt286;
			class133_sub1_sub2.method1800((byte) -79, i_14_ + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]),
					i_17_ == 1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) + i_15_);
			if (class133_sub1_sub2.aClass12_4949.method212((byte) -128))
				Class12.method213(class133_sub1_sub2.anIntArray3476[0], class133_sub1_sub2.anIntArray3443[0], null,
						(byte) -35, Class14_Sub2_Sub3.anInt3785, null, class133_sub1_sub2, 0);
		}
		JunkTex.aClass14_Sub10_Sub1_4734.disableBitAccess();
		if (i > -95)
			method63((byte) 49);
	}

	public static void method64() {
		for (Class14_Sub2_Sub10 class14_sub2_sub10 = (Class14_Sub2_Sub10) Class4.aClass2_127
				.getFront(); class14_sub2_sub10 != null; class14_sub2_sub10 = (Class14_Sub2_Sub10) Class4.aClass2_127
						.getNext()) {
			Class133_Sub6 class133_sub6 = class14_sub2_sub10.aClass133_Sub6_3870;
			if (Class14_Sub2_Sub3.anInt3785 != class133_sub6.anInt3655
					|| class133_sub6.anInt3644 < Class14_Sub2_Sub20.anInt4064)
				class14_sub2_sub10.unlink();
			else if (Class14_Sub2_Sub20.anInt4064 >= class133_sub6.anInt3679) {
				if (class133_sub6.anInt3669 > 0) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[class133_sub6.anInt3669
							- 1]);
					if (class133_sub1_sub2 != null && class133_sub1_sub2.anInt3495 >= 0
							&& class133_sub1_sub2.anInt3495 < 13312 && class133_sub1_sub2.anInt3436 >= 0
							&& class133_sub1_sub2.anInt3436 < 13312)
						class133_sub6.method1849(Class14_Sub2_Sub20.anInt4064, (byte) -122,
								class133_sub1_sub2.anInt3495, class133_sub1_sub2.anInt3436,
								(JunkTex.method1017(class133_sub1_sub2.anInt3495, class133_sub6.anInt3655, (byte) 6,
										class133_sub1_sub2.anInt3436) - class133_sub6.anInt3667));
				}
				if (class133_sub6.anInt3669 < 0) {
					int i_18_ = -class133_sub6.anInt3669 - 1;
					Class133_Sub1_Sub1 class133_sub1_sub1;
					if (i_18_ == Class14_Sub2_Sub10.anInt3868)
						class133_sub1_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
					else
						class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[i_18_]);
					if (class133_sub1_sub1 != null && class133_sub1_sub1.anInt3495 >= 0
							&& class133_sub1_sub1.anInt3495 < 13312 && class133_sub1_sub1.anInt3436 >= 0
							&& class133_sub1_sub1.anInt3436 < 13312)
						class133_sub6.method1849(Class14_Sub2_Sub20.anInt4064, (byte) -122,
								class133_sub1_sub1.anInt3495, class133_sub1_sub1.anInt3436,
								(JunkTex.method1017(class133_sub1_sub1.anInt3495, class133_sub6.anInt3655, (byte) 21,
										class133_sub1_sub1.anInt3436) - class133_sub6.anInt3667));
				}
				class133_sub6.method1851(-95, Class51.anInt839);
				JunkTex.method519(Class14_Sub2_Sub3.anInt3785, (int) class133_sub6.aDouble3678,
						(int) class133_sub6.aDouble3646, (int) class133_sub6.aDouble3633, 60, class133_sub6,
						class133_sub6.anInt3665, -1L, false);
			}
		}
	}

	public static void method65(byte i) {
		anIntArray65 = null;
		if (i != -7)
			anIntArray62 = null;
		anIntArray62 = null;
	}

	public static void method66(boolean bool) {
		if (!bool) {
			if (Class43.java_vendor.toLowerCase().indexOf("microsoft") != -1) {
				anIntArray62[223] = 28;
				anIntArray62[190] = 72;
				anIntArray62[220] = 74;
				anIntArray62[221] = 43;
				anIntArray62[186] = 57;
				anIntArray62[188] = 71;
				anIntArray62[219] = 42;
				anIntArray62[189] = 26;
				anIntArray62[192] = 58;
				anIntArray62[187] = 27;
				anIntArray62[191] = 73;
				anIntArray62[222] = 59;
			} else {
				anIntArray62[45] = 26;
				anIntArray62[46] = 72;
				anIntArray62[47] = 73;
				anIntArray62[92] = 74;
				anIntArray62[93] = 43;
				anIntArray62[91] = 42;
				anIntArray62[59] = 57;
				anIntArray62[44] = 71;
				anIntArray62[61] = 27;
				if (Class43.aMethod707 == null) {
					anIntArray62[222] = 59;
					anIntArray62[192] = 58;
				} else {
					anIntArray62[222] = 58;
					anIntArray62[192] = 28;
					anIntArray62[520] = 59;
				}
			}
		}
	}

	public static int method68(int i, int i_50_) {
		if (i_50_ != -1) {
			int i_51_ = -123;
			return i_51_;
		}
		int i_52_ = i >>> 10;
		return i_52_;
	}

	public static int method69(int i, int i_53_) {
		int i_54_ = i ^ i_53_;
		return i_54_;
	}
}
