/* Class146 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.util.Calendar;
import java.util.TimeZone;

import com.jagex.io.js5.Class9;
import com.jagex.rt4.Class148_Sub1;

public class Class146 {
	public int[] anIntArray2350;
	public static Calendar aCalendar2351;
	public int anInt2353;
	public short[] aShortArray2354;
	public byte[] aByteArray2355;
	public static int anInt2357 = 0;
	public static int anInt2358;
	public short[] aShortArray2361;
	public Class124[] aClass124Array2362;
	public static long aLong2364;
	public static int anInt2365;

	static {
		aCalendar2351 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInt2365 = 0;
	}

	public boolean method1990(int i, int i_0_) {
		if (i >= -66)
			anIntArray2350 = null;
		boolean bool = (aByteArray2355[i_0_] & 0x4) != 0;
		return bool;
	}

	public static Class14_Sub2_Sub16_Sub1 method1991(int i, Class9 class9, Class9 class9_1_, int i_2_, int i_3_) {
		if (!Class109.method1564(-2, i, i_3_, class9)) {
			Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = null;
			return class14_sub2_sub16_sub1;
		}
		if (i_2_ != -13824)
			anInt2357 = 59;
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = Static2.method336(4,
				class9_1_.method163(i, i_3_, 0));
		return class14_sub2_sub16_sub1;
	}

	public static Class148_Sub1[] method1992(byte i) {
		Class148_Sub1[] class148_sub1s = new Class148_Sub1[Class32.anInt547];
		for (int i_4_ = 0; i_4_ < Class32.anInt547; i_4_++)
			class148_sub1s[i_4_] = new Class148_Sub1(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[i_4_], Class14_Sub2_Sub12.anIntArray3918[i_4_], Class17.anIntArray402[i_4_],
					Class76.anIntArray1204[i_4_], Class12.aByteArrayArray310[i_4_], JunkTex.anIntArray1114);
		Class129.method1761((byte) 103);
		if (i != -111)
			method1995(71);
		Class148_Sub1[] class148_sub1s_5_ = class148_sub1s;
		return class148_sub1s_5_;
	}

	public static void method1993(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, Class32 class32) {
		long l = 0L;
		if (i_6_ != 0) {
			if (i_6_ == 1)
				l = Class14_Sub2_Sub12.method323(i_8_, i_10_, i_7_);
			else if (i_6_ == 2)
				l = JunkTex.method675(i_8_, i_10_, i_7_);
			else if (i_6_ == 3)
				l = JunkTex.method578(i_8_, i_10_, i_7_);
		} else
			l = JunkTex.method79(i_8_, i_10_, i_7_);
		int i_11_ = -1;
		i_11_ = (int) (l >>> 32) & 0x7fffffff;
		boolean bool = false;
		boolean bool_12_ = false;
		int i_13_ = (int) l >> 52 & 0x3;
		int i_14_ = (int) l >> 14 & 0x1f;
		if (i_9_ != 4)
			method1993(73, -127, 84, 72, 79, -102, null);
		Class79 class79 = Class79.method1377((byte) -106, i_11_);
		if (class79.method1392(-127))
			Class14_Sub2_Sub21.method434(i_10_, i_8_, class79, i_9_ ^ 0x84, i_7_);
		if (l != 0L) {
			Class133 class133 = null;
			Class133 class133_15_ = null;
			if (i_6_ == 0) {
				Class113 class113 = JunkTex.method681(i_8_, i_10_, i_7_);
				if (class113 != null) {
					class133_15_ = class113.aClass133_1884;
					class133 = class113.aClass133_1877;
				}
				if (class79.anInt1229 != 0)
					class32.method1077(i_14_, -1, class79.aBoolean1248, i_13_, i_7_, i_10_);
			} else if (i_6_ == 1) {
				Class37 class37 = Class86.method1418(i_8_, i_10_, i_7_);
				if (class37 != null) {
					class133_15_ = class37.aClass133_638;
					class133 = class37.aClass133_642;
				}
			} else if (i_6_ != 2) {
				if (i_6_ == 3) {
					Class4 class4 = JunkTex.method649(i_8_, i_10_, i_7_);
					if (class4 != null)
						class133 = class4.aClass133_124;
					if (class79.anInt1229 == 1)
						class32.method1069(i_9_ ^ ~0x40004, i_7_, i_10_);
				}
			} else {
				Class40 class40 = Class36.method1098(i_8_, i_10_, i_7_);
				if (class40 != null)
					class133 = class40.aClass133_679;
				if (class79.anInt1229 != 0 && class79.anInt1227 + i_10_ < 104 && class79.anInt1227 + i_7_ < 104
						&& class79.anInt1245 + i_10_ < 104 && i_7_ + class79.anInt1245 < 104)
					class32.method1068(class79.aBoolean1248, i_13_, (byte) -93, class79.anInt1245, class79.anInt1227,
							i_10_, i_7_);
			}
			if (class79.aBoolean1253) {
				if (i_14_ == 2) {
					if (!(class133 instanceof Class133_Sub4))
						Class68.method1305(i_10_, 4 + i_13_, 0, class79, i_14_, 0, i_7_, i, (byte) 93);
					else
						((Class133_Sub4) class133).method1836(true);
					if (!(class133_15_ instanceof Class133_Sub4))
						Class68.method1305(i_10_, i_13_ + 1 & 0x3, 0, class79, i_14_, 0, i_7_, i, (byte) 94);
					else
						((Class133_Sub4) class133_15_).method1836(true);
				} else if (i_14_ != 5) {
					if (i_14_ != 6) {
						if (i_14_ == 7) {
							if (!(class133 instanceof Class133_Sub4))
								Class68.method1305(i_10_, (i_13_ + 2 & 0x3) + 4, 0, class79, 4, 0, i_7_, i, (byte) 115);
							else
								((Class133_Sub4) class133).method1836(true);
						} else if (i_14_ == 8) {
							if (!(class133 instanceof Class133_Sub4))
								Class68.method1305(i_10_, i_13_ + 4, ((Class14_Sub2_Sub9.anIntArray3859[i_13_]) * 8),
										class79, 4, (Class114.anIntArray1893[i_13_]) * 8, i_7_, i, (byte) 107);
							else
								((Class133_Sub4) class133).method1836(true);
							if (class133_15_ instanceof Class133_Sub4)
								((Class133_Sub4) class133_15_).method1836(true);
							else
								Class68.method1305(i_10_, (i_13_ + 2 & 0x3) + 4,
										(Class14_Sub2_Sub9.anIntArray3859[i_13_] * 8), class79, 4,
										Class114.anIntArray1893[i_13_] * 8, i_7_, i, (byte) 125);
						} else if (i_14_ == 11) {
							if (class133 instanceof Class133_Sub4)
								((Class133_Sub4) class133).method1836(true);
							else
								Class68.method1305(i_10_, 4 + i_13_, 0, class79, 10, 0, i_7_, i, (byte) 110);
						} else if (class133 instanceof Class133_Sub4)
							((Class133_Sub4) class133).method1836(true);
						else
							Class68.method1305(i_10_, i_13_, 0, class79, i_14_, 0, i_7_, i, (byte) 86);
					} else if (!(class133 instanceof Class133_Sub4))
						Class68.method1305(i_10_, i_13_ + 4, (Class14_Sub2_Sub9.anIntArray3859[i_13_]) * 8, class79, 4,
								Class114.anIntArray1893[i_13_] * 8, i_7_, i, (byte) 107);
					else
						((Class133_Sub4) class133).method1836(true);
				} else if (class133 instanceof Class133_Sub4)
					((Class133_Sub4) class133).method1836(true);
				else
					Class68.method1305(i_10_, i_13_, Static2.anIntArray212[i_13_] * 8, class79, 4,
							Class14_Sub19.anIntArray3074[i_13_] * 8, i_7_, i, (byte) 100);
			}
		}
	}

	public int method1994(int i, boolean bool) {
		if (bool)
			method1993(51, -3, 103, -52, 116, -107, null);
		int i_16_ = aByteArray2355[i] & 0x3;
		return i_16_;
	}

	public static void method1995(int i) {
		int i_17_ = -15 % ((i + 32) / 54);
		aCalendar2351 = null;
	}

	public Class146(int i) {
		anInt2353 = i;
		aByteArray2355 = new byte[anInt2353];
		aShortArray2361 = new short[anInt2353];
		anIntArray2350 = new int[anInt2353];
		aClass124Array2362 = new Class124[anInt2353];
		aShortArray2354 = new short[anInt2353];
	}
}
