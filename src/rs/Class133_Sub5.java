/* Class133_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class Class133_Sub5 extends Class133 {
	public int anInt3605;
	public static Class124 aClass124_3607;
	public int anInt3608 = 0;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array3609;
	public static Class124 aClass124_3610;
	public Animation aClass46_3611;
	public static int anInt3612 = 0;
	public int anInt3613 = 0;
	public int anInt3616;
	public int anInt3617;
	public int anInt3620;
	public boolean aBoolean3621 = false;
	public int anInt3622;
	public static int[] anIntArray3623;
	public static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_3625;
	public static boolean aBoolean3628 = false;
	public int anInt3629;
	public int anInt3631;

	static {
		aClass124_3607 = Class14_Sub2_Sub2.method263(1178, "Close");
		aClass124_3610 = aClass124_3607;
	}

	public static void method1843(int i, int i_0_, Class94 class94, int i_1_) {
		if (Class67.aClass94_1060 == null && !aBoolean3628 && class94 != null
				&& Static.method341(0, class94) != null) {
			Class67.aClass94_1060 = class94;
			Static.aClass94_420 = Static.method341(0, class94);
			Class14_Sub8_Sub3.anInt4132 = i_1_;
			Class125_Sub4.anInt3419 = 0;
			int i_2_ = 106 % ((i - 9) / 39);
			Class14_Sub8_Sub6.aBoolean4188 = false;
			Canvas_Sub2.anInt63 = i_0_;
		}
	}

	public static void method1844(int i) {
		Static2.aClass52_3942.clear();
		if (i != -32768)
			method1843(-36, 86, null, -1);
	}

	public void method1845(byte i, int i_3_) {
		while_268_: do {
			if (i > 81 && !aBoolean3621) {
				anInt3608 += i_3_;
				do {
					if (anInt3608 <= aClass46_3611.anIntArray763[anInt3613])
						break while_268_;
					anInt3608 -= aClass46_3611.anIntArray763[anInt3613];
					anInt3613++;
				} while (anInt3613 < aClass46_3611.anIntArray768.length);
				aBoolean3621 = true;
			}
		} while (false);
	}

	public static void method1846(boolean bool) {
		if (bool)
			aClass14_Sub2_Sub19Array3609 = null;
		aClass14_Sub2_Sub19Array3609 = null;
		aClass124_3610 = null;
		anIntArray3623 = null;
		aClass124_3607 = null;
		aClass14_Sub9_Sub1_3625 = null;
	}

	public Class133_Sub7 method1847(int i) {
		if (i <= 4)
			aClass14_Sub9_Sub1_3625 = null;
		Class60 class60 = Class127.method1749(anInt3605, (byte) -109);
		Class133_Sub7 class133_sub7;
		if (aBoolean3621)
			class133_sub7 = class60.method1267(0, -1);
		else
			class133_sub7 = class60.method1267(0, anInt3613);
		if (class133_sub7 == null) {
			Class133_Sub7 class133_sub7_4_ = null;
			return class133_sub7_4_;
		}
		Class133_Sub7 class133_sub7_5_ = class133_sub7;
		return class133_sub7_5_;
	}

	public int method1781() {
		int i = anInt3617;
		return i;
	}

	public void method1792(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, long l) {
		Class133_Sub7 class133_sub7 = method1847(5);
		if (class133_sub7 != null) {
			class133_sub7.method1792(i, i_6_, i_7_, i_8_, i_9_, i_10_, i_11_, i_12_, l);
			anInt3617 = class133_sub7.method1781();
		}
	}

	public Class133_Sub5(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		anInt3617 = -32768;
		anInt3620 = i_13_;
		anInt3622 = i_14_;
		anInt3616 = i_17_ + i_18_;
		anInt3631 = i_15_;
		anInt3605 = i;
		anInt3629 = i_16_;
		int i_19_ = Class127.method1749(anInt3605, (byte) 45).anInt966;
		if (i_19_ != -1) {
			aBoolean3621 = false;
			aClass46_3611 = Static.method1129(i_19_, -120);
		} else
			aBoolean3621 = true;
	}
}
