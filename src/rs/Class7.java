/* Class7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;
import com.jagex.rt4.AbstractSprite;

public class Class7 {
	public static Class124 aClass124_174;
	public static Class124 aClass124_176 = Class124.method263("Sat");
	public static Class124 aClass124_180;
	public static Class124 aClass124_181;
	public static Class124 aClass124_184;
	public static Class124 aClass124_185 = Class124.method263("Wed");
	public static Class124 aClass124_186;
	public static Class124 aClass124_187;
	public static Class124 aClass124_188;
	public static Class124 aClass124_189;
	public static Class124[] aClass124Array178;
	public static int anInt177;
	public static int anInt179;
	public static int anInt182;
	public static int[][][] anIntArrayArrayArray169 = new int[4][13][13];
	public static short[] aShortArray183;

	static {
		anInt179 = 0;
		aClass124_184 = Class124.method263("Mon");
		aClass124_181 = Class124.method263("Sun");
		anInt182 = 0;
		aShortArray183 = new short[] { -10304, 9104, -1, -1, -1 };
		aClass124_187 = Class124.method263("Thu");
		aClass124_186 = Class124.method263("Cancel");
		aClass124_189 = Class124.method263("Tue");
		aClass124_188 = Class124.method263("Fri");
		aClass124Array178 = new Class124[] { aClass124_181, aClass124_184, aClass124_189, aClass124_185, aClass124_187,
				aClass124_188, aClass124_176 };
		aClass124_180 = aClass124_186;
	}

	public static int method115(byte i, int i_0_) {
		return i_0_ >>> 8;
	}

	public static int method116(int i, int i_2_) {
		int i_3_ = i & 0xff;
		return i_3_;
	}

	public static AbstractSprite method117(FileSystem fileSystem, int i, byte i_4_) {
		if (!Static3.decodedSprites(fileSystem, i, (byte) 126)) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		AbstractSprite class14_sub2_sub19 = Class67.method1302(false);
		return class14_sub2_sub19;
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
		}
	}
}
