/* Class14_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class14_Sub22 extends Linkable {
	public static int[] anIntArray3117 = { 19, 55, 38, 155, 255, 110, 137, 205, 76 };
	public int anInt3118;
	public static int[] anIntArray3119;
	public int anInt3120;
	public static Class124 aClass124_3124 = Class14_Sub2_Sub2.method263(1178, "Schlie-8en");
	public static int[][][] anIntArrayArrayArray3125;

	public static void method898(int i, double d) {
		if (d != Class14_Sub9_Sub1.aDouble4756) {
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				int i_1_ = (int) (Math.pow((double) i_0_ / 255.0, d) * 255.0);
				Class14_Sub9_Sub1.anIntArray4827[i_0_] = i_1_ > 255 ? 255 : i_1_;
			}
			Class14_Sub9_Sub1.aDouble4756 = d;
		}
		if (i < 64)
			anIntArray3119 = null;
	}

	public static void method899(long l, int i) {
		if (l != 0L) {
			if (Class42.anInt698 >= 100)
				Class15.method943(Static2.aClass124_4045, false, Class14_Sub8_Sub9.aClass124_4244, 0);
			else {
				Class124 class124 = Class46.method1174(l, (byte) 64).method1685(0);
				int i_2_ = -33 / ((79 - i) / 38);
				for (int i_3_ = 0; Class42.anInt698 > i_3_; i_3_++) {
					if (Class126.aLongArray2095[i_3_] == l) {
						Class15.method943((Class14_Sub8_Sub7.method515(
								(new Class124[] { class124, (Class14_Sub8_Sub14.aClass124_4330) }), (byte) -14)), false,
								Class14_Sub8_Sub9.aClass124_4244, 0);
						return;
					}
				}
				for (int i_4_ = 0; Static2.anInt3728 > i_4_; i_4_++) {
					if (l == Class133_Sub1_Sub2.aLongArray4951[i_4_]) {
						Class15.method943(
								(Class14_Sub8_Sub7.method515((new Class124[] { Class138.aClass124_2226, class124,
										Class125_Sub3.aClass124_3409 }), (byte) -80)),
								false, Class14_Sub8_Sub9.aClass124_4244, 0);
						return;
					}
				}
				if (class124.method1704((Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922), (byte) 60))
					Class15.method943(Static.aClass124_3291, false, Class14_Sub8_Sub9.aClass124_4244, 0);
				else {
					Class126.aLongArray2095[Class42.anInt698] = l;
					client.aClass124Array2645[Class42.anInt698++] = Class46.method1174(l, (byte) 109);
					Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(61);
					Static.aClass14_Sub10_Sub1_891.method817(l, 117);
				}
			}
		}
	}

	public Class14_Sub22(int i, int i_5_) {
		anInt3118 = i_5_;
		anInt3120 = i;
	}

	public static void method900(byte i) {
		anIntArray3119 = null;
		anIntArray3117 = null;
		anIntArrayArrayArray3125 = null;
		int i_6_ = -13 % ((70 - i) / 55);
		aClass124_3124 = null;
	}

	public static void method901(byte i) {
		int i_7_ = Class14_Sub8_Sub28.aByteArrayArray4556.length;
		for (int i_8_ = 0; i_8_ < i_7_; i_8_++) {
			if (Class14_Sub8_Sub28.aByteArrayArray4556[i_8_] != null) {
				int i_9_ = -1;
				for (int i_10_ = 0; Class14_Sub2_Sub2.anInt3758 > i_10_; i_10_++) {
					if (Class14_Sub8.anIntArray2858[i_8_] == Class120.anIntArray2009[i_10_]) {
						i_9_ = i_10_;
						break;
					}
				}
				if (i_9_ == -1) {
					Class120.anIntArray2009[Class14_Sub2_Sub2.anInt3758] = Class14_Sub8.anIntArray2858[i_8_];
					i_9_ = Class14_Sub2_Sub2.anInt3758++;
				}
				int i_11_ = 0;
				Buffer class14_sub10 = new Buffer(Class14_Sub8_Sub28.aByteArrayArray4556[i_8_]);
				while ((Class14_Sub8_Sub28.aByteArrayArray4556[i_8_].length > class14_sub10.position) && i_11_ < 511) {
					int i_12_ = i_9_ | i_11_++ << 6;
					int i_13_ = class14_sub10.method784((byte) 108);
					int i_14_ = i_13_ >> 7 & 0x3f;
					int i_15_ = (i_14_ + (Class14_Sub8.anIntArray2858[i_8_] >> 8) * 64 - Class133_Sub6.anInt3676);
					int i_16_ = i_13_ & 0x3f;
					int i_17_ = ((Class14_Sub8.anIntArray2858[i_8_] & 0xff) * 64 + (-Class58.anInt947 + i_16_));
					Class12 class12 = Class126.method1744(class14_sub10.method784((byte) 115), 170);
					int i_18_ = i_13_ >> 46;
					if ((Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_] == null) && (class12.aByte290 & 0x1) > 0
							&& i_18_ == Class142.anInt2295 && i_15_ >= 0 && i_15_ + class12.anInt334 < 104 && i_17_ >= 0
							&& class12.anInt334 + i_17_ < 104) {
						Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_] = new Class133_Sub1_Sub2();
						Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_12_];
						Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_12_;
						class133_sub1_sub2.aClass12_4949 = class12;
						class133_sub1_sub2.anInt3457 = class133_sub1_sub2.aClass12_4949.anInt296;
						class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
						class133_sub1_sub2.anInt3492 = class133_sub1_sub2.aClass12_4949.anInt303;
						class133_sub1_sub2.anInt3463 = class133_sub1_sub2.aClass12_4949.anInt276;
						class133_sub1_sub2.anInt3433 = class133_sub1_sub2.aClass12_4949.anInt323;
						class133_sub1_sub2.anInt3493 = class133_sub1_sub2.aClass12_4949.anInt334;
						if (class133_sub1_sub2.anInt3492 == 0)
							class133_sub1_sub2.anInt3461 = 0;
						class133_sub1_sub2.anInt3454 = class133_sub1_sub2.aClass12_4949.anInt318;
						class133_sub1_sub2.anInt3484 = class133_sub1_sub2.aClass12_4949.anInt284;
						class133_sub1_sub2.anInt3471 = class133_sub1_sub2.aClass12_4949.anInt286;
						class133_sub1_sub2.anInt3432 = class133_sub1_sub2.aClass12_4949.anInt339;
						class133_sub1_sub2.method1800((byte) -112, i_17_, true, i_15_);
					}
				}
			}
		}
		int i_19_ = 7 % ((60 - i) / 43);
	}
}
