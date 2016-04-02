/* Class14_Sub2_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.math.BigInteger;

import com.jagex.link.Cache;
import com.jagex.rt4.Class25;

import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub25;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub8;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class14_Sub2_Sub18_Sub2 extends Class14_Sub2_Sub18 {
	public static Cache aClass20_5073;
	public Object anObject5077;
	public static Class124 aClass124_5079 = Class14_Sub2_Sub2.method263(1178, "n");
	public static Cache aClass20_5081;
	public static Class124 aClass124_5083;
	public static Class124 aClass124_5084;
	public static Class9_Sub1 aClass9_Sub1_5085;
	public static BigInteger aBigInteger5086;
	public static int anInt5087;

	static {
		aClass20_5073 = new Cache(16);
		aClass20_5081 = new Cache(64);
		aClass124_5084 = Class14_Sub2_Sub2.method263(1178, "<)4col>");
		aClass124_5083 = Class14_Sub2_Sub2.method263(1178, "settings");
		aBigInteger5086 = (new BigInteger(
				"111425062890301051365206642964372080941130087045221691750738418203817739415579"));
	}

	public static void method383(int i) {
		aBigInteger5086 = null;
		aClass124_5084 = null;
		aClass124_5083 = null;
		aClass124_5079 = null;
		aClass20_5081 = null;
		if (i != 2)
			method385((byte) 121, null);
		aClass20_5073 = null;
		aClass9_Sub1_5085 = null;
	}

	public static void method384(boolean bool, int i) {
		int i_0_ = 0;
		if (i != 10312)
			anInt5087 = 12;
		for (/**/; Class14_Sub8_Sub13.anInt4306 > i_0_; i_0_++) {
			Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[Static.anIntArray3965[i_0_]]);
			long l = ((long) Static.anIntArray3965[i_0_] << 32 | 0x20000000L);
			if (class133_sub1_sub2 != null && class133_sub1_sub2.method1804((byte) 115)
					&& class133_sub1_sub2.aClass12_4949.aBoolean307 == bool
					&& class133_sub1_sub2.aClass12_4949.method219(-1)) {
				int i_1_ = class133_sub1_sub2.anInt3495 >> 39;
				int i_2_ = class133_sub1_sub2.anInt3436 >> 39;
				if (i_1_ >= 0 && i_1_ < 104 && i_2_ >= 0 && i_2_ < 104) {
					if (class133_sub1_sub2.anInt3493 == 1 && (class133_sub1_sub2.anInt3495 & 0x7f) == 64
							&& (class133_sub1_sub2.anInt3436 & 0x7f) == 64) {
						if (Class14_Sub2_Sub8.anIntArrayArray3846[i_1_][i_2_] == Class42.anInt699)
							continue;
						Class14_Sub2_Sub8.anIntArrayArray3846[i_1_][i_2_] = Class42.anInt699;
					}
					if (!class133_sub1_sub2.aClass12_4949.aBoolean308)
						l |= ~0x7fffffffffffffffL;
					class133_sub1_sub2.anInt3500 = Static.method1017(class133_sub1_sub2.anInt3495,
							Class14_Sub2_Sub3.anInt3785, (byte) -127, class133_sub1_sub2.anInt3436);
					Class14_Sub8_Sub8.method519(Class14_Sub2_Sub3.anInt3785, class133_sub1_sub2.anInt3495,
							class133_sub1_sub2.anInt3436, class133_sub1_sub2.anInt3500,
							(class133_sub1_sub2.anInt3493 - 1) * 64 + 60, class133_sub1_sub2,
							class133_sub1_sub2.anInt3461, l, class133_sub1_sub2.aBoolean3488);
				}
			}
		}
	}

	public static void method385(byte i, Class9 class9) {
		if (!Class14_Sub2_Sub5.aBoolean3803 && i == 67) {
			Class25.method995();
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = Class7.method117(class9, Class14_Sub8_Sub25.anInt4509,
					(byte) -100);
			int i_3_ = Class14_Sub20.anInt3094;
			int i_4_ = i_3_ * 956 / 503;
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389((-i_4_ + Class83.anInt1340) / 2, 0, i_4_, i_3_);
			Class133_Sub1_Sub1.aClass148_4915 = Class14_Sub8_Sub27.method622(Class14_Sub8_Sub30.anInt4594, i - 67,
					class9);
			Class133_Sub1_Sub1.aClass148_4915
					.method2001((Class83.anInt1340 / 2 - (Class133_Sub1_Sub1.aClass148_4915.anInt2371) / 2), 18);
			Class14_Sub2_Sub5.aBoolean3803 = true;
		}
	}

	public Object method377(boolean bool) {
		if (!bool)
			method385((byte) 113, null);
		Object object = anObject5077;
		return object;
	}

	public static void method386(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		if (i_6_ < Class118.anInt1982 || Class14_Sub8_Sub14.anInt4327 < i_5_ || i_10_ < Class14_Sub17.anInt3005
				|| i > Class59.anInt955)
			Class14_Sub8_Sub9.method522(i_10_, i_9_, i_6_, i_8_, i, 0, i_5_, i_7_);
		else
			Class142.method1980(i_8_, i_10_, i_6_, i_5_, i_9_, i, 41, i_7_);
		if (i_11_ != -25230)
			method383(-108);
	}

	public static Class124 method387(long l, boolean bool) {
		if (!bool) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = Class58.method1256(-111, false, l, 10);
		return class124;
	}

	public boolean method379(byte i) {
		if (i >= -68) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public Class14_Sub2_Sub18_Sub2(Object object) {
		anObject5077 = object;
	}
}
