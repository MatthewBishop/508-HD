/* Class14_Sub8_Sub39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.rt4.RT4;

import rs.Class112;
import rs.Class124;
import rs.Class72;
import rs.Static2;

public class Class14_Sub8_Sub39_Sub1 extends Class14_Sub8_Sub39 {
	public static byte[] aByteArray5102;
	public static Class124 aClass124_5099 = null;
	public static Class124[] aClass124Array5101 = new Class124[1000];
	public static int anInt5097 = 0;
	public static int anInt5098 = -1;

	static {
		aByteArray5102 = new byte[520];
	}

	public static Class124 method683(boolean bool, int i, int i_0_, Class124[] class124s) {
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			if (class124s[i + i_2_] == null)
				class124s[i + i_2_] = Static2.aClass124_2382;
			i_1_ += class124s[i_2_ + i].anInt2507;
		}
		int i_3_ = 0;
		byte[] is = new byte[i_1_];
		if (!bool) {
			Class124 class124 = null;
			return class124;
		}
		for (int i_4_ = 0; i_0_ > i_4_; i_4_++) {
			Class124 class124 = class124s[i_4_ + i];
			Class72.method1322(class124.aByteArray2495, 0, is, i_3_, class124.anInt2507);
			i_3_ += class124.anInt2507;
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = i_1_;
		Class124 class124_5_ = class124;
		return class124_5_;
	}

	public static void method684(int i) {
		if (i == 16711680) {
			aByteArray5102 = null;
			aClass124Array5101 = null;
			aClass124_5099 = null;
		}
	}

	public static void method685(int i) {
		RT4.method1778(0, 0);
		if (i > -25)
			method683(false, -66, -51, null);
	}

	public int[][] method474(int i, int i_6_) {
		if (i_6_ >= -4)
			method684(-110);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method679(true)) {
			int[] is_7_ = is[0];
			int[] is_8_ = is[1];
			int i_9_ = i % anInt4744 * anInt4744;
			int[] is_10_ = is[2];
			for (int i_11_ = 0; Class112.anInt1876 > i_11_; i_11_++) {
				int i_12_ = anIntArray4743[i_9_ + i_11_ % anInt4753];
				is_10_[i_11_] = Class14_Sub8_Sub26.method617(4080, i_12_ << 36);
				is_8_[i_11_] = Class14_Sub8_Sub26.method617(i_12_, 65280) >> 4;
				is_7_[i_11_] = Class14_Sub8_Sub26.method617(i_12_, 16711680) >> 12;
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}
}
