/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.PacketBuffer;
import com.jagex.link.Class52;
import com.jagex.rt4.Class25;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub36;

public class Class70 {
	public static Class52 aClass52_1077 = new Class52(100);
	public static Class14_Sub2_Sub5 aClass14_Sub2_Sub5_1078;
	public static Class52 aClass52_1079 = new Class52(5);
	public static PacketBuffer aClass14_Sub10_Sub1_1080 = new PacketBuffer(5000);
	public static int anInt1081;
	public static int[] anIntArray1082 = { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1,
			7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

	public static void method1312(int i) {
		if (i != 0)
			aClass14_Sub2_Sub5_1078 = null;
		aClass14_Sub10_Sub1_1080 = null;
		aClass52_1077 = null;
		aClass14_Sub2_Sub5_1078 = null;
		aClass52_1079 = null;
		anIntArray1082 = null;
	}

	public static void method1313(int i) {
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Static2.method250(Class14_Sub2_Sub12.anInt3912, false);
		for (int i_0_ = 0; i_0_ < Class14_Sub17.anInt3012; i_0_++) {
			if (Class14_Sub8_Sub36.aBooleanArray4698[i_0_])
				Class7_Sub2_Sub1.aBooleanArray3703[i_0_] = true;
			Class103.aBooleanArray1727[i_0_] = Class14_Sub8_Sub36.aBooleanArray4698[i_0_];
			Class14_Sub8_Sub36.aBooleanArray4698[i_0_] = false;
		}
		Class138.anInt2214 = -1;
		Class14_Sub8_Sub34.anInt4666 = Class14_Sub2_Sub20.anInt4064;
		Class141.aClass94_2239 = null;
		Class14_Sub8_Sub24.anInt4503 = -1;
		Class89.aBoolean1409 = true;
		if (Class14_Sub2_Sub12.anInt3912 != -1) {
			Class14_Sub17.anInt3012 = 0;
			Class14_Sub8_Sub22.method594(Class14_Sub20.anInt3094, true, 0, Class14_Sub2_Sub12.anInt3912, -1, 0, 0,
					Class83.anInt1340, 0);
		}
		Class25.method994();
		Class51.anInt839 = 0;
		if (i != -11198)
			method1312(82);
	}

	public static void method1314(int i, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class14_Sub8_Sub14.anInt4327 = i_3_;
		Class14_Sub17.anInt3005 = i;
		Class118.anInt1982 = i_4_;
		Class59.anInt955 = i_2_;
		int i_5_ = 75 % ((35 - i_1_) / 35);
	}
}
