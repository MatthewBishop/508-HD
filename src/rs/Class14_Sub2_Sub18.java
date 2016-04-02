/* Class14_Sub2_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Cacheable;

import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public abstract class Class14_Sub2_Sub18 extends Cacheable {
	public static int[] anIntArray4023;
	public static Class124[] aClass124Array4024 = new Class124[100];
	public static Class124 aClass124_4026 = Class14_Sub2_Sub2.method263(1178, "::tele ");
	public static volatile long aLong4029 = 0L;

	public abstract Object method377(boolean bool);

	public static void method378(byte i) {
		Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.enableBitAccess();
		int i_0_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(i + 51, 8);
		if (i_0_ < Class14_Sub8_Sub13.anInt4306) {
			for (int i_1_ = i_0_; Class14_Sub8_Sub13.anInt4306 > i_1_; i_1_++)
				Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++] = Static.anIntArray3965[i_1_];
		}
		if (Class14_Sub8_Sub13.anInt4306 < i_0_)
			throw new RuntimeException("gnpov1");
		if (i != -51)
			method380(99, null, null, false);
		Class14_Sub8_Sub13.anInt4306 = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = Static.anIntArray3965[i_2_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_3_];
			int i_4_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_4_ == 0) {
				Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_3_;
				class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			} else {
				int i_5_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 2);
				if (i_5_ == 0) {
					Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 1) {
					Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_6_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(false, (byte) -84, i_6_);
					int i_7_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(i + 51, 1);
					if (i_7_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 2) {
					Static.anIntArray3965[Class14_Sub8_Sub13.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_8_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(true, (byte) 84, i_8_);
					int i_9_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(true, (byte) 106, i_9_);
					int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readBits(i + 51, 1);
					if (i_10_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 3)
					Class36.anIntArray626[Class14_Sub8_Sub10.anInt4255++] = i_3_;
			}
		}
	}

	public abstract boolean method379(byte i);

	public static void method380(int i, Class124 class124, Class124 class124_11_, boolean bool) {
		Class14_Sub8_Sub9.aClass124_4242 = class124;
		Class14_Sub8_Sub30.anInt4598 = 0;
		Class75.anInt1163 = i;
		if (!bool)
			method380(-127, null, null, true);
		Class89.aBoolean1416 = false;
		Class14_Sub8_Sub9.aClass124_4241 = class124_11_;
		if (Class14_Sub8_Sub9.aClass124_4241.method1704(Class14_Sub8_Sub9.aClass124_4244, (byte) 88)
				|| Class14_Sub8_Sub9.aClass124_4242.method1704(Class14_Sub8_Sub9.aClass124_4244, (byte) 67)) {
			Class142.anInt2315 = 0;
			Class14_Sub8_Sub26.anInt4525 = 3;
		} else {
			Class142.anInt2315 = 1;
			Class14_Sub20.anInt3087 = 0;
			Class14_Sub8_Sub26.anInt4525 = -3;
			Class7.anInt179 = 0;
		}
	}

	public static void method381(int i) {
		aClass124Array4024 = null;
		anIntArray4023 = null;
		if (i >= -35)
			method382((byte) -123);
		aClass124_4026 = null;
	}

	public static void method382(byte i) {
		if (i >= 115) {
			int i_12_ = Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(Class64.aClass124_1011);
			for (int i_13_ = 0; i_13_ < Class14_Sub8_Sub38.anInt4729; i_13_++) {
				int i_14_ = Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(Class46.method1170((byte) -99, i_13_));
				if (i_14_ > i_12_)
					i_12_ = i_14_;
			}
			i_12_ += 8;
			int i_15_ = Class14_Sub8_Sub38.anInt4729 * 15 + 21;
			int i_16_ = -(i_12_ / 2) + Class14_Sub8_Sub33.anInt4629;
			if (i_12_ + i_16_ > Class83.anInt1340)
				i_16_ = Class83.anInt1340 - i_12_;
			if (i_16_ < 0)
				i_16_ = 0;
			int i_17_ = Class14_Sub8_Sub32.anInt4613;
			if (i_15_ + i_17_ > Class14_Sub20.anInt3094)
				i_17_ = Class14_Sub20.anInt3094 - i_15_;
			if (i_17_ < 0)
				i_17_ = 0;
			if (Class14_Sub8_Sub31.anInt4608 != 1) {
				if (Class125_Sub1.anInt3367 == Class14_Sub8_Sub33.anInt4629
						&& Class14_Sub8_Sub32.anInt4613 == Class139.anInt2230) {
					Class14_Sub14.anInt2984 = i_12_;
					Class14_Sub8_Sub27.anInt4550 = Class14_Sub8_Sub38.anInt4729 * 15 + 22;
					Class14_Sub8_Sub31.anInt4608 = 0;
					Class133_Sub5.aBoolean3628 = true;
					Class14_Sub2_Sub8.anInt3832 = i_17_;
					Static.anInt500 = i_16_;
				} else {
					Class14_Sub8_Sub31.anInt4608 = 1;
					Static.anInt3299 = Class125_Sub1.anInt3367;
					Class95.anInt1622 = Class139.anInt2230;
				}
			} else if (Static.anInt3299 == Class14_Sub8_Sub33.anInt4629
					&& Class14_Sub8_Sub32.anInt4613 == Class95.anInt1622) {
				Class14_Sub8_Sub31.anInt4608 = 0;
				Class14_Sub8_Sub27.anInt4550 = Class14_Sub8_Sub38.anInt4729 * 15 + 22;
				Class14_Sub14.anInt2984 = i_12_;
				Class133_Sub5.aBoolean3628 = true;
				Class14_Sub2_Sub8.anInt3832 = i_17_;
				Static.anInt500 = i_16_;
			}
		}
	}
}
