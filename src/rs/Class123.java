/* Class123 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Font;

import com.jagex.link.Class14_Sub2_Sub13;
import com.jagex.rt4.Class25;

import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class Class123 {
	public static int anInt2062;
	public static Font aFont2063;
	public static Class124 aClass124_2064 = Class14_Sub2_Sub2.method263(1178, "Started 3d library");
	public static Class124 aClass124_2065 = Class14_Sub2_Sub2.method263(1178, ":duelstake:");
	public static float aFloat2067;
	public static Class124 aClass124_2068 = aClass124_2064;

	public static void method1661(int i) {
		aClass124_2065 = null;
		if (i != -19)
			method1661(14);
		aClass124_2064 = null;
		aFont2063 = null;
		aClass124_2068 = null;
	}

	public static void method1662(int i, Class124 class124, int i_0_) {
		Class14_Sub2_Sub13 class14_sub2_sub13 = Class14_Sub8_Sub28.method626(i_0_ - 115, i, i_0_);
		class14_sub2_sub13.method326();
		class14_sub2_sub13.aClass124_3925 = class124;
	}

	public static void method1663(byte i) {
		int i_1_ = Static.anInt500;
		int i_2_ = Class14_Sub8_Sub27.anInt4550;
		int i_3_ = Class14_Sub14.anInt2984;
		int i_4_ = Class14_Sub2_Sub8.anInt3832;
		int i_5_ = 6116423;
		Class25.method1004(i_1_, i_4_, i_3_, i_2_, i_5_);
		Class25.method1004(i_1_ + 1, i_4_ + 1, i_3_ - 2, 16, 0);
		Class25.method1003(i_1_ + 1, i_4_ + 18, i_3_ - 2, i_2_ - 19, 0);
		Class133_Sub3.aClass14_Sub2_Sub16_3567.method364(Class64.aClass124_1011, i_1_ + 3, i_4_ + 14, i_5_, -1);
		int i_6_ = Class14_Sub8_Sub33.anInt4640;
		int i_7_ = Class107.anInt1804;
		if (i <= 115)
			method1661(-17);
		for (int i_8_ = 0; i_8_ < Class14_Sub8_Sub38.anInt4729; i_8_++) {
			int i_9_ = (Class14_Sub8_Sub38.anInt4729 - 1 - i_8_) * 15 + (i_4_ + 31);
			int i_10_ = 16777215;
			if (i_1_ < i_6_ && i_6_ < i_3_ + i_1_ && i_9_ - 13 < i_7_ && i_7_ < i_9_ + 3)
				i_10_ = 16776960;
			Class133_Sub3.aClass14_Sub2_Sub16_3567.method364(Class46.method1170((byte) -99, i_8_), i_1_ + 3, i_9_,
					i_10_, 0);
		}
		Class71.method1317(Class14_Sub2_Sub8.anInt3832, Class14_Sub8_Sub27.anInt4550, Class14_Sub14.anInt2984, 127,
				Static.anInt500);
	}

	public static void method1664(Class9 class9, boolean bool, Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1, byte i,
			Class9 class9_11_) {
		Class14_Sub3.aBoolean2752 = bool;
		Class15.aClass9_384 = class9;
		if (i >= -12)
			method1662(87, null, 24);
		Class14_Sub8_Sub6.aClass9_4193 = class9_11_;
		int i_12_ = Class15.aClass9_384.method155(6756) - 1;
		Class108.anInt1816 = Class15.aClass9_384.method177(i_12_, 13537) + i_12_ * 256;
		Class4.aClass14_Sub2_Sub16_Sub1_137 = class14_sub2_sub16_sub1;
	}
}