/* Class14_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.link.Deque;
import com.jagex.link.Linkable;

public class Class14_Sub15 extends Linkable {
	public static Deque aClass2_2988;
	public static int anInt2989;
	public static Class36 aClass36_2990;
	public int anInt2991;
	public boolean aBoolean2992 = false;
	public static Class124 aClass124_2993 = Class124.method263(1178, "<img=0>");
	public static Class124 aClass124_2995 = Class124.method263(1178, "cookiehost");
	public static int actionsLen = 0;
	public int anInt2999;

	static {
		aClass2_2988 = new Deque();
	}

	public static void method871(Class9 class9, Class9 class9_0_, int i) {
		Class56_Sub1.aClass14_Sub2_Sub16_3320 = Class14_Sub19.method888(-107, Class14_Sub2_Sub21.anInt4088, class9_0_,
				0, class9);
		Class131.aClass14_Sub2_Sub16_Sub1_2160 = Class146.method1991(0, class9, class9_0_, -13824,
				Class14_Sub2_Sub21.anInt4088);
		Class84.aClass14_Sub2_Sub16_1344 = Class14_Sub19.method888(-110, JunkTex.anInt4367, class9_0_, 0,
				class9);
		if (i <= -83)
			Class133_Sub3.aClass14_Sub2_Sub16_3567 = Class14_Sub19.method888(-108, JunkTex.anInt4102,
					class9_0_, 0, class9);
	}

	public static void method872(byte i) {
		aClass124_2995 = null;
		aClass36_2990 = null;
		int i_1_ = -85 % ((i + 6) / 61);
		aClass2_2988 = null;
		aClass124_2993 = null;
	}

	public static int method873(int i, int i_2_) {
		if (i != 1023)
			method872((byte) -113);
		int i_3_ = i_2_ & 0x3ff;
		return i_3_;
	}

	public static boolean method874(byte i, Class94 class94) {
		int i_4_ = 4 % ((64 - i) / 48);
		if (class94.anInt1498 == 205) {
			Class62.anInt990 = 250;
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}
}
