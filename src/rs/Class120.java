/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.link.HashTable;
import com.jagex.sound.Track;

public class Class120 {
	public static Class124 aClass124_2001 = Class124.method263(1178, "welle:");
	public static int[] anIntArray2002;
	public Class9 aClass9_2003;
	public HashTable aClass55_2004 = new HashTable(256);
	public static int anInt2005;
	public static int anInt2007 = -1;
	public static int[] z_max_occluders;
	public static int[] anIntArray2009;
	public Class9 aClass9_2010;
	public static Class124 aClass124_2012;
	public static int anInt2014;
	public HashTable aClass55_2015 = new HashTable(256);

	static {
		anInt2005 = 1;
		aClass124_2012 = Class124.method263(1178, "::qa_op_test");
		z_max_occluders = new int[2];
		anInt2014 = 0;
		anIntArray2009 = new int[64];
	}

	public static void method1614(byte i) {
		anIntArray2002 = null;
		aClass124_2001 = null;
		if (i <= -2) {
			anIntArray2009 = null;
			z_max_occluders = null;
			aClass124_2012 = null;
		}
	}

	public static void method1615(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i_3_ >= 0)
			anIntArray2009 = null;
		int i_6_ = 0;
		for (Class66[] class66s = Static2.aClass66Array3721; i_6_ < class66s.length; i_6_++) {
			Class66 class66 = class66s[i_6_];
			if (class66 != null && class66.anInt1046 == 2) {
				Class53.method1213(i_2_, i_0_, (class66.anInt1047 - Class133_Sub6.anInt3676 << 7) + class66.anInt1038,
						i_4_ >> 1, i >> 33, class66.anInt1041 * 2, (byte) 126,
						(class66.anInt1051 + (-Class58.anInt947 + class66.anInt1044 << 7)));
				if (anInt2007 > -1 && Class14_Sub2_Sub20.anInt4064 % 20 < 10)
					Static2.aClass14_Sub2_Sub19Array1191[class66.anInt1035].drawReg(i_1_ + anInt2007 - 12,
							JunkTex.anInt4548 + i_5_ - 28);
			}
		}
	}

	public Class14_Sub12_Sub1 method1616(int i, int i_7_, int[] is, boolean bool) {
		int i_8_ = i_7_ ^ ((i & 0x40000fff) << 4 | i >>> 44);
		i_8_ |= i << 16;
		long l = i_8_;
		if (!bool) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass55_2015.get(l);
		if (class14_sub12_sub1 != null) {
			Class14_Sub12_Sub1 class14_sub12_sub1_9_ = class14_sub12_sub1;
			return class14_sub12_sub1_9_;
		}
		if (is != null && is[0] <= 0) {
			Class14_Sub12_Sub1 class14_sub12_sub1_10_ = null;
			return class14_sub12_sub1_10_;
		}
		Track track = Track.method1451(aClass9_2010, i, i_7_);
		if (track == null) {
			class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		Class14_Sub12_Sub1 class14_sub12_sub1_11_ = track.method1449();
		aClass55_2015.put(l, class14_sub12_sub1_11_);
		if (is != null)
			is[0] -= class14_sub12_sub1_11_.aByteArray4899.length;
		class14_sub12_sub1 = class14_sub12_sub1_11_;
		return class14_sub12_sub1;
	}

	public Class14_Sub12_Sub1 method1617(int i, int i_12_, int[] is, int i_13_) {
		int i_14_ = i_13_ ^ (i << 4 & 0xfffc | i >>> 44);
		i_14_ |= i << 48;
		long l = 0x100000000L ^ i_14_;
		Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass55_2015.get(l);
		if (class14_sub12_sub1 != null) {
			Class14_Sub12_Sub1 class14_sub12_sub1_15_ = class14_sub12_sub1;
			return class14_sub12_sub1_15_;
		}
		if (is != null && is[0] <= 0) {
			Class14_Sub12_Sub1 class14_sub12_sub1_16_ = null;
			return class14_sub12_sub1_16_;
		}
		Class14_Sub24 class14_sub24 = (Class14_Sub24) aClass55_2004.get(l);
		if (class14_sub24 == null) {
			class14_sub24 = Class14_Sub24.method910(aClass9_2003, i, i_13_);
			if (class14_sub24 == null) {
				Class14_Sub12_Sub1 class14_sub12_sub1_17_ = null;
				return class14_sub12_sub1_17_;
			}
			aClass55_2004.put(l, class14_sub24);
		}
		Class14_Sub12_Sub1 class14_sub12_sub1_18_ = class14_sub24.method904(is);
		if (class14_sub12_sub1_18_ == null)
			return null;
		class14_sub24.unlink();
		aClass55_2015.put(l, class14_sub12_sub1_18_);
		if (i_12_ != 7711) {
			class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		class14_sub12_sub1 = class14_sub12_sub1_18_;
		return class14_sub12_sub1;
	}

	public Class14_Sub12_Sub1 method1618(int[] is, byte i, int i_19_) {
		if (aClass9_2003.method155() == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1617(0, 7711, is, i_19_);
			return class14_sub12_sub1;
		}
		if (aClass9_2003.method177(i_19_) == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1617(i_19_, 7711, is, 0);
			return class14_sub12_sub1;
		}
		if (i != -38)
			method1614((byte) -7);
		throw new RuntimeException();
	}

	public Class14_Sub12_Sub1 method1619(int[] is, int i, int i_20_) {
		if (aClass9_2010.method155() == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1616(0, i_20_, is, true);
			return class14_sub12_sub1;
		}
		if (aClass9_2010.method177(i_20_) == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1616(i_20_, 0, is, true);
			return class14_sub12_sub1;
		}
		if (i != 23698)
			method1615(-46, 50, 33, -16, -7, -102, -40);
		throw new RuntimeException();
	}

	public Class120(Class9 class9, Class9 class9_21_) {
		aClass9_2003 = class9_21_;
		aClass9_2010 = class9;
	}
}
