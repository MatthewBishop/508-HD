/* Class14_Sub8_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;

import rs.Class102;
import rs.Class112;
import rs.Class12;
import rs.Class124;
import rs.Class129;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub5;
import rs.Class14_Sub11;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub30;
import rs.Class14_Sub4;
import rs.Class14_Sub6;
import rs.Class17;
import rs.Class32;
import rs.Class40;
import rs.Class48;
import rs.Class76;

public class Class14_Sub8_Sub11 extends Class14_Sub8 {
	public static boolean[] aBooleanArray4271;
	public static Class124 aClass124_4264;
	public static Class124 aClass124_4265 = Class14_Sub2_Sub2.method263(1178, "<col=c0ff00>");
	public static Class124 aClass124_4272 = Class14_Sub2_Sub2.method263(1178, "; Expires=");
	public static Class124 aClass124_4274 = Class14_Sub2_Sub2.method263(1178, "Ok");
	public static int anInt4266;
	public static int[] anIntArray4275;

	static {
		aClass124_4264 = aClass124_4274;
		anIntArray4275 = new int[2000];
		aBooleanArray4271 = new boolean[8];
	}

	public static void method530(byte i) {
		if (i != -11)
			aBooleanArray4271 = null;
		Class14_Sub6.aClass52_2817.method1209();
	}

	public static void method531(byte i) {
		Class48.timer.reset();
		if (i != -112)
			method535(true);
		for (int i_0_ = 0; i_0_ < 32; i_0_++)
			Class14_Sub2_Sub12.aLongArray3914[i_0_] = 0L;
		for (int i_1_ = 0; i_1_ < 32; i_1_++)
			Class14_Sub8_Sub9.aLongArray4233[i_1_] = 0L;
		Class102.anInt1702 = 0;
	}

	public static void method532(int i) {
		for (int i_2_ = i; i_2_ < Class14_Sub8_Sub13.anInt4306; i_2_++) {
			int i_3_ = Static.anIntArray3965[i_2_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_3_];
			if (class133_sub1_sub2 != null)
				Class14_Sub8_Sub30.method637(class133_sub1_sub2, (class133_sub1_sub2.aClass12_4949.anInt334), -52);
		}
	}

	public static void method533(boolean bool) {
		aClass124_4272 = null;
		aBooleanArray4271 = null;
		if (!bool)
			aClass124_4274 = null;
		aClass124_4265 = null;
		aClass124_4264 = null;
		anIntArray4275 = null;
		aClass124_4274 = null;
	}

	public static Class14_Sub2_Sub19[] method535(boolean bool) {
		Class14_Sub2_Sub19[] class14_sub2_sub19s = new Class14_Sub2_Sub19[Class32.anInt547];
		if (!bool) {
			Class14_Sub2_Sub19[] class14_sub2_sub19s_4_ = null;
			return class14_sub2_sub19s_4_;
		}
		for (int i = 0; Class32.anInt547 > i; i++) {
			byte[] is = Class12.aByteArrayArray310[i];
			int i_5_ = Class17.anIntArray402[i] * Class76.anIntArray1204[i];
			int[] is_6_ = new int[i_5_];
			for (int i_7_ = 0; i_5_ > i_7_; i_7_++)
				is_6_[i_7_] = (Static.anIntArray1114[Class14_Sub8_Sub26.method617(255, is[i_7_])]);
			class14_sub2_sub19s[i] = new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[i], (Class14_Sub2_Sub12.anIntArray3918[i]), Class17.anIntArray402[i],
					Class76.anIntArray1204[i], is_6_);
		}
		Class129.method1761((byte) 81);
		Class14_Sub2_Sub19[] class14_sub2_sub19s_8_ = class14_sub2_sub19s;
		return class14_sub2_sub19s_8_;
	}

	public Class14_Sub8_Sub11() {
		super(0, true);
	}

	public int[] method484(int i, byte i_9_) {
		if (i_9_ >= -58)
			method532(48);
		int[] is = aClass149_2851.method2014(i, (byte) 107);
		if (aClass149_2851.aBoolean2402) {
			int i_10_ = Class133_Sub5.anIntArray3623[i];
			for (int i_11_ = 0; i_11_ < Class112.anInt1876; i_11_++)
				is[i_11_] = (method534(i_10_, (byte) 12, Class14_Sub8_Sub4.anIntArray4145[i_11_]) % 4096);
		}
		int[] is_12_ = is;
		return is_12_;
	}

	public int method534(int i, byte i_13_, int i_14_) {
		int i_15_ = i_14_ + i * 57;
		if (i_13_ < 6)
			aClass124_4265 = null;
		i_15_ = i_15_ << 1 ^ i_15_;
		int i_16_ = 4096 - (i_15_ * (i_15_ * i_15_ * 15731 + 789221) + 1376312589 & 0x7fffffff) / 262144;
		return i_16_;
	}
}
