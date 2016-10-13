/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.util.zip.CRC32;

import com.jagex.rt4.Class14_Sub2_Sub19;

public class Class7 {
	public static Class124 aClass124_174;
	public static Class124 aClass124_176 = Class14_Sub2_Sub2.method263(1178, "Sat");
	public static Class124 aClass124_180;
	public static Class124 aClass124_181;
	public static Class124 aClass124_184;
	public static Class124 aClass124_185 = Class14_Sub2_Sub2.method263(1178, "Wed");
	public static Class124 aClass124_186;
	public static Class124 aClass124_187;
	public static Class124 aClass124_188;
	public static Class124 aClass124_189;
	public static Class124[] aClass124Array178;
	public static CRC32 aCRC32_171 = new CRC32();
	public static int anInt177;
	public static int anInt179;
	public static int anInt182;
	public static int[][][] anIntArrayArrayArray169 = new int[4][13][13];
	public static short[] aShortArray183;

	static {
		anInt179 = 0;
		aClass124_184 = Class14_Sub2_Sub2.method263(1178, "Mon");
		aClass124_181 = Class14_Sub2_Sub2.method263(1178, "Sun");
		anInt182 = 0;
		aShortArray183 = new short[] { -10304, 9104, -1, -1, -1 };
		aClass124_187 = Class14_Sub2_Sub2.method263(1178, "Thu");
		aClass124_186 = Class14_Sub2_Sub2.method263(1178, "Cancel");
		aClass124_189 = Class14_Sub2_Sub2.method263(1178, "Tue");
		aClass124_188 = Class14_Sub2_Sub2.method263(1178, "Fri");
		aClass124Array178 = new Class124[] { aClass124_181, aClass124_184, aClass124_189, aClass124_185, aClass124_187,
				aClass124_188, aClass124_176 };
		aClass124_180 = aClass124_186;
	}

	public static int method115(byte i, int i_0_) {
		if (i < 115)
			method117(null, -42, (byte) 126);
		int i_1_ = i_0_ >>> 8;
		return i_1_;
	}

	public static int method116(int i, int i_2_) {
		if (i_2_ != 14719)
			method117(null, -104, (byte) 88);
		int i_3_ = i & 0xff;
		return i_3_;
	}

	public static Class14_Sub2_Sub19 method117(Class9 class9, int i, byte i_4_) {
		if (!JunkTex.method1027(class9, i, (byte) 126)) {
			Class14_Sub2_Sub19 class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		Class14_Sub2_Sub19 class14_sub2_sub19 = Class67.method1302(false);
		return class14_sub2_sub19;
	}

	public static int method118(byte i, int i_6_) {
		if (i != 68) {
			int i_7_ = -59;
			return i_7_;
		}
		int i_8_ = i_6_ & 0xff;
		return i_8_;
	}

	public static void method119(int i) {
		aClass124Array178 = null;
		aClass124_189 = null;
		aClass124_187 = null;
		aClass124_185 = null;
		aClass124_176 = null;
		aClass124_188 = null;
		if (i < -1) {
			aClass124_180 = null;
			aClass124_184 = null;
			aClass124_174 = null;
			anIntArrayArrayArray169 = null;
			aShortArray183 = null;
			aClass124_181 = null;
			aClass124_186 = null;
			aCRC32_171 = null;
		}
	}
}
