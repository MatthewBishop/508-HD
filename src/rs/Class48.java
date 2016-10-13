/* Class48 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.util.Timer;

public class Class48 {
	public static Class124 aClass124_797;
	public static int anInt798 = -1;
	public static Class124 aClass124_799 = Class14_Sub2_Sub2.method263(1178, "level)2");
	public static Class124 aClass124_801;
	public static long aLong802;
	public static Class87 aClass87_803;
	public static Timer timer;
	public static Class87 aClass87_805;
	static {
		aClass124_797 = aClass124_799;
		aClass124_801 = Class14_Sub2_Sub2.method263(1178, "<col=ffb000>");
	}

	public static void method1191(byte i) {
		int i_0_ = 0;
		if (i <= 122)
			method1192(-124, 3);
		for (/**/; i_0_ < 5; i_0_++)
			Class112.aBooleanArray1872[i_0_] = false;
		JunkTex.anInt4687 = -1;
		Class45.anInt751 = -1;
		Class89.anInt1415 = 1;
	}

	public static int method1192(int i, int i_1_) {
		if (i_1_ != 25039)
			aClass87_805 = null;
		int i_2_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_2_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_2_ += 8;
		}
		if (i >= 16) {
			i_2_ += 4;
			i >>>= 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_2_ += 2;
		}
		if (i >= 1) {
			i_2_++;
			i >>>= 1;
		}
		int i_3_ = i + i_2_;
		return i_3_;
	}

	public static void method1193(int i) {
		aClass87_803 = null;
		aClass87_805 = null;
		aClass124_801 = null;
		aClass124_797 = null;
		aClass124_799 = null;
		timer = null;
		if (i != 50)
			aClass124_797 = null;
	}
}
