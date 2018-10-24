/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.link.HashTable;

public class Class88 {
	public int anInt1396;
	public int anInt1397;
	public static HashTable aClass55_1398 = new HashTable(16);
	public int anInt1402;
	public int anInt1403;

	public static void method1435(byte i) {
		Canvas_Sub1.method59((byte) -115);
		Class44.method1156((byte) -54);
		JunkTex.method530((byte) -11);
		Class124.method1718(48);
		Class96.method1488(2);
		JunkTex.method544((byte) 124);
		Class116.method1598(58);
		JunkTex.method560(-12501);
		Class90.method1443(2);
		int i_0_ = -49 / ((90 - i) / 36);
		Static2.method991((byte) -2);
		Static2.method1124(97);
		Class14_Sub30.method941((byte) 11);
		Class7_Sub3.method134(0);
		Class133.method1789((byte) -115);
		JunkTex.aClass52_4596.method1209();
	}

	public static void method1436(byte i) {
		JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(129);
		if (i >= -50)
			method1439(11, -123, -108, 106);
		JunkTex.aClass14_Sub10_Sub1_891.method809(Class1.method73((byte) -58));
		JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 109, Class83.anInt1340);
		JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 94, Class14_Sub20.anInt3094);
		Class56_Sub1.aLong3317 = 0L;
	}

	public static void method1437(boolean bool) {
		if (bool)
			aClass55_1398 = null;
		aClass55_1398 = null;
	}

	public static boolean method1438(Class14_Sub9_Sub1 class14_sub9_sub1, Class9 class9, boolean bool, Class9 class9_1_,
			Class9 class9_2_) {
		Class59.aClass9_957 = class9_1_;
		Class133_Sub5.aClass14_Sub9_Sub1_3625 = class14_sub9_sub1;
		if (bool)
			aClass55_1398 = null;
		Class44.aClass9_725 = class9;
		Static2.aClass9_3945 = class9_2_;
		boolean bool_3_ = true;
		return bool_3_;
	}

	public static void method1439(int i, int i_4_, int i_5_, int i_6_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_4_][i_5_];
		if (class14_sub29 != null) {
			Class37 class37 = class14_sub29.aClass37_3255;
			if (class37 != null) {
				class37.anInt641 = class37.anInt641 * i_6_ / 16;
				class37.anInt646 = class37.anInt646 * i_6_ / 16;
			}
		}
	}
}
