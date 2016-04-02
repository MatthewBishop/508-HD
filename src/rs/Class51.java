/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class51 {
	public static int anInt828;
	public static int anInt829 = 0;
	public static int anInt830;
	public static int anInt831;
	public int anInt832;
	public static Class9 aClass9_833;
	public int anInt834;
	public static int[] anIntArray835;
	public static int anInt839;
	public static Class124 aClass124_841;
	public int anInt842;

	static {
		anInt828 = 10;
		aClass124_841 = Class14_Sub2_Sub2.method263(1178, "Weiter");
		anInt839 = 0;
		anInt830 = (int) (Math.random() * 17.0) - 8;
		anInt831 = 0;
	}

	public void method1198(Buffer class14_sub10, int i) {
		int i_0_ = 121 % ((i + 61) / 53);
		for (;;) {
			int i_1_ = class14_sub10.method798();
			if (i_1_ == 0)
				break;
			method1199(i_1_, class14_sub10, (byte) -61);
		}
	}

	public void method1199(int i, Buffer class14_sub10, byte i_2_) {
		if (i == 1) {
			anInt842 = class14_sub10.method784((byte) 126);
			anInt832 = class14_sub10.method798();
			anInt834 = class14_sub10.method798();
		}
		int i_3_ = -46 / ((9 - i_2_) / 44);
	}

	public static void method1200(int i) {
		aClass9_833 = null;
		aClass124_841 = null;
		anIntArray835 = null;
	}

	public static void method1201(int[] is, int i, int i_4_, int i_5_, int i_6_) {
		if (i_5_ == -5973) {
			i--;
			int i_7_ = --i_4_ - 7;
			while (i < i_7_) {
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
				is[++i] = i_6_;
			}
			while (i_4_ > i)
				is[++i] = i_6_;
		}
	}
}
