/* Class14_Sub8_Sub31 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.link.Class14_Sub2_Sub13;
import com.jagex.link.Class2;
import com.jagex.rt4.Class14_Sub1;

import rs.Class112;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class14_Sub19;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub2;
import rs.Class4;
import rs.Class9_Sub1;

public class Class14_Sub8_Sub31 extends Class14_Sub8 {
	public static Class124 aClass124_4607 = Class14_Sub2_Sub2.method263(1178, "Hidden)2use");
	public static Class9_Sub1 aClass9_Sub1_4603;
	public static int anInt4601;
	public static volatile int anInt4602;
	public static int anInt4608 = 0;
	public static String aString4605;

	static {
		anInt4601 = 0;
		anInt4602 = 0;
	}

	public static void method644(int i, byte i_0_) {
		Class14_Sub1 class14_sub1 = ((Class14_Sub1) Class14_Sub8_Sub5.aClass55_4155.getFirst());
		if (i_0_ <= 24)
			method647(-118, -4, -122, -121, null, 59);
		for (/**/; class14_sub1 != null; class14_sub1 = (Class14_Sub1) Class14_Sub8_Sub5.aClass55_4155
				.getNext()) {
			if ((class14_sub1.key >> 48 & 0xffffL) == (long) i)
				class14_sub1.unlink();
		}
	}

	public static void method645(byte i, int i_1_, int i_2_) {
		if (i > -9)
			anInt4602 = 17;
		Class14_Sub2_Sub13 class14_sub2_sub13 = Class14_Sub8_Sub28.method626(-121, i_1_, 1);
		class14_sub2_sub13.method326();
		class14_sub2_sub13.anInt3920 = i_2_;
	}

	public static void method646(boolean bool) {
		aClass124_4607 = null;
		aClass9_Sub1_4603 = null;
		aString4605 = null;
		if (!bool)
			method645((byte) 36, 112, 118);
	}

	public static int method647(int i, int i_3_, int i_4_, int i_5_, int[][] is, int i_6_) {
		if (i_3_ != -501955161) {
			int i_7_ = 114;
			return i_7_;
		}
		int i_8_ = i_4_ * is[i_6_ + 1][i] + (-i_4_ + 128) * is[i_6_][i] >> 39;
		int i_9_ = (i_4_ * is[i_6_ + 1][i + 1] + is[i_6_][i + 1] * (-i_4_ + 128) >> 39);
		int i_10_ = i_9_ * i_5_ + i_8_ * (128 - i_5_) >> 7;
		return i_10_;
	}

	public static void method648(byte i) {
		int i_11_ = 52 % ((-23 - i) / 47);
		for (;;) {
			Class2 class2 = Class14_Sub8_Sub19.aClass2_4404;
			Class14_Sub19 class14_sub19;
			synchronized (class2) {
				class14_sub19 = (Class14_Sub19) Static.aClass2_99.method78();
			}
			if (class14_sub19 == null)
				break;
			class14_sub19.aClass9_Sub1_3076.method182(class14_sub19.aClass114_3077, (int) class14_sub19.key,
					class14_sub19.aByteArray3069, false, (byte) 55);
		}
	}

	public static Class4 method649(int i, int i_12_, int i_13_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_12_][i_13_];
		if (class14_sub29 == null)
			return null;
		Class4 class4 = class14_sub29.aClass4_3237;
		class14_sub29.aClass4_3237 = null;
		return class4;
	}

	public Class14_Sub8_Sub31() {
		super(1, true);
	}

	public int[] method484(int i, byte i_14_) {
		if (i_14_ >= -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 103);
		if (aClass149_2851.aBoolean2402) {
			int[][] is_15_ = method480(0, 0, i);
			int[] is_16_ = is_15_[0];
			int[] is_17_ = is_15_[1];
			int[] is_18_ = is_15_[2];
			for (int i_19_ = 0; Class112.anInt1876 > i_19_; i_19_++)
				is[i_19_] = (is_18_[i_19_] + (is_16_[i_19_] + is_17_[i_19_])) / 3;
		}
		int[] is_20_ = is;
		return is_20_;
	}
}
