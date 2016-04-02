/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;

import com.jagex.io.Buffer;

import rs.tex.Static;

public abstract class Class129 {
	public static Class124 aClass124_2129;
	public static int anInt2131 = 0;
	public static int anInt2133;
	public static Class124 aClass124_2134;
	public static int anInt2136 = 0;

	static {
		aClass124_2134 = Class14_Sub2_Sub2.method263(1178, "Type");
		aClass124_2129 = aClass124_2134;
	}

	public abstract void method1760(int i, Component component);

	public static void method1761(byte i) {
		Class14_Sub2_Sub12.anIntArray3918 = null;
		if (i > 2) {
			Class12.aByteArrayArray310 = null;
			Class76.anIntArray1204 = null;
			Class17.anIntArray402 = null;
			Class40.anIntArray675 = null;
			Static.anIntArray1114 = null;
		}
	}

	public static Class125_Sub2 method1762(byte i, Buffer class14_sub10) {
		if (i <= 93) {
			Class125_Sub2 class125_sub2 = null;
			return class125_sub2;
		}
		Class125_Sub2 class125_sub2 = new Class125_Sub2(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(47),
				class14_sub10.method798());
		return class125_sub2;
	}

	public abstract int method1763(int i);

	public static void method1764(int i) {
		aClass124_2129 = null;
		int i_0_ = -53 % ((i + 59) / 47);
		aClass124_2134 = null;
	}

	public abstract void method1765(boolean bool, Component component);

	public static Class124 method1766(int[] is, int i, byte i_1_, long l) {
		if (Canvas_Sub1.anInterface5_48 != null) {
			Class124 class124 = Canvas_Sub1.anInterface5_48.method24(l, i, is, true);
			if (class124 != null) {
				Class124 class124_2_ = class124;
				return class124_2_;
			}
		}
		if (i == 5) {
			Class124 class124 = Class46.method1174(l, (byte) 88).method1685(0);
			return class124;
		}
		if (i_1_ < 123) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = Class14_Sub2_Sub18_Sub2.method387(l, true);
		return class124;
	}
}
