/* Class14_Sub8_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class25;

import rs.Class108;
import rs.Class110;
import rs.Class112;
import rs.Class115;
import rs.Class12;
import rs.Class124;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class134;
import rs.Class142;
import rs.Class14_Sub18;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub9;
import rs.Class17;
import rs.Class71;
import rs.Class72;
import rs.Class86;
import rs.Class9;
import rs.Static2;

public class Class14_Sub8_Sub16 extends Class14_Sub8 {
	public static boolean aBoolean4357 = false;
	public static Class124 aClass124_4341 = Class14_Sub2_Sub2.method263(1178, ")4a=");
	public static Class124 aClass124_4353 = Class14_Sub2_Sub2.method263(1178, "(U2");
	public static Class14_Sub2_Sub9 aClass14_Sub2_Sub9_4354;
	public static Class86 aClass86_4351 = new Class86();
	public static int anInt4350;
	public static int anInt4352 = 0;
	public static int anInt4355;
	public static int anInt4356 = 0;

	public static void method559(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		Class110.aClass148Array1848[0].method2001(i_1_, i_3_);
		Class110.aClass148Array1848[1].method2001(i_1_, i_3_ + i_0_ - 16);
		int i_5_ = i_0_ * (i_0_ - 32) / i_4_;
		if (i_5_ < 8)
			i_5_ = 8;
		int i_6_ = (-i_5_ + (i_0_ - 32)) * i_2_ / (i_4_ - i_0_);
		Class25.method1004(i_1_, i_3_ + 16, 16, i_0_ - 32, Class14_Sub8_Sub21.anInt4439);
		Class25.method1004(i_1_, i_3_ + i_6_ + 16, 16, i_5_, Static2.anInt366);
		Class25.method1000(i_1_, i_6_ + (i_3_ + 16), i_5_, Class134.anInt2612);
		Class25.method1000(i_1_ + 1, i_3_ + 16 + i_6_, i_5_, Class134.anInt2612);
		Class25.method1007(i_1_, i_3_ + 16 + i_6_, 16, Class134.anInt2612);
		Class25.method1007(i_1_, i_6_ + i_3_ + 17, 16, Class134.anInt2612);
		Class25.method1000(i_1_ + 15, i_6_ + (i_3_ + 16), i_5_, Class14_Sub18.anInt3061);
		Class25.method1000(i_1_ + 14, i_3_ + 17 + i_6_, i_5_ - 1, Class14_Sub18.anInt3061);
		Class25.method1007(i_1_, i_5_ + (i_6_ + i_3_) + 15, 16, Class14_Sub18.anInt3061);
		if (i <= -21)
			Class25.method1007(i_1_ + 1, i_6_ + 14 + i_3_ + i_5_, 15, Class14_Sub18.anInt3061);
	}

	public static void method560(int i) {
		Class9.aClass52_236.method1209();
		if (i == -12501)
			Static2.aClass52_4053.method1209();
	}

	public static int[] method561(int[] is, int i) {
		if (is == null) {
			int[] is_7_ = null;
			return is_7_;
		}
		int[] is_8_ = new int[is.length];
		Class72.method1325(is, 0, is_8_, i, is.length);
		int[] is_9_ = is_8_;
		return is_9_;
	}

	public static void method562(int i) {
		aClass124_4353 = null;
		int i_10_ = -35 % ((i - 6) / 42);
		aClass124_4341 = null;
		aClass14_Sub2_Sub9_4354 = null;
		aClass86_4351 = null;
	}

	public static void method563(boolean bool, Class124 class124, byte i) {
		class124 = class124.method1716((byte) 63);
		if (i <= -112) {
			short[] is = new short[16];
			int i_11_ = 0;
			for (int i_12_ = 0; i_12_ < Class108.anInt1816; i_12_++) {
				Class142 class142 = Class14_Sub8_Sub24.method605(70, i_12_);
				if ((!bool || class142.aBoolean2275) && class142.anInt2316 == -1 && class142.anInt2305 == -1
						&& class142.anInt2265 == 0
						&& class142.aClass124_2296.method1716((byte) 63).method1700(-19928, class124) != -1) {
					if (i_11_ >= 250) {
						Class14_Sub8_Sub18.anInt4394 = -1;
						Class133_Sub6.aShortArray3675 = null;
						return;
					}
					if (i_11_ >= is.length) {
						short[] is_13_ = new short[is.length * 2];
						for (int i_14_ = 0; i_11_ > i_14_; i_14_++)
							is_13_[i_14_] = is[i_14_];
						is = is_13_;
					}
					is[i_11_++] = (short) i_12_;
				}
			}
			Class14_Sub8_Sub18.anInt4394 = i_11_;
			Class12.anInt294 = 0;
			Class133_Sub6.aShortArray3675 = is;
			Class124[] class124s = new Class124[Class14_Sub8_Sub18.anInt4394];
			for (int i_15_ = 0; Class14_Sub8_Sub18.anInt4394 > i_15_; i_15_++)
				class124s[i_15_] = (Class14_Sub8_Sub24.method605(93, is[i_15_]).aClass124_2296);
			Static2.method256(Class133_Sub6.aShortArray3675, class124s, 23);
		}
	}

	public Class14_Sub8_Sub16() {
		super(1, false);
	}

	public int[][] method474(int i, int i_16_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (i_16_ >= -4)
			method559(126, 39, -72, -98, 74, 115);
		if (aClass95_2838.aBoolean1628) {
			int[] is_17_ = is[0];
			int[] is_18_ = is[1];
			int[] is_19_ = is[2];
			for (int i_20_ = 0; i_20_ < Class112.anInt1876; i_20_++) {
				method564(-123, i_20_, i);
				int[][] is_21_ = method480(0, 0, Class14_Sub8_Sub20.anInt4429);
				is_17_[i_20_] = is_21_[0][Class71.anInt1083];
				is_18_[i_20_] = is_21_[1][Class71.anInt1083];
				is_19_[i_20_] = is_21_[2][Class71.anInt1083];
			}
		}
		int[][] is_22_ = is;
		return is_22_;
	}

	public void method475(int i, int i_23_, Buffer class14_sub10) {
		if (i == 0)
			aBoolean2862 = class14_sub10.method798() == 1;
		if (i_23_ != 24777)
			anInt4356 = 42;
	}

	public int[] method484(int i, byte i_24_) {
		if (i_24_ >= -58)
			aClass14_Sub2_Sub9_4354 = null;
		int[] is = aClass149_2851.method2014(i, (byte) 117);
		if (aClass149_2851.aBoolean2402) {
			for (int i_25_ = 0; i_25_ < Class112.anInt1876; i_25_++) {
				method564(-101, i_25_, i);
				int[] is_26_ = method483(0, (byte) -59, Class14_Sub8_Sub20.anInt4429);
				is[i_25_] = is_26_[Class71.anInt1083];
			}
		}
		int[] is_27_ = is;
		return is_27_;
	}

	public void method564(int i, int i_28_, int i_29_) {
		int i_30_ = -22 / ((i + 37) / 61);
		int i_31_ = Class14_Sub8_Sub4.anIntArray4145[i_28_];
		int i_32_ = Class133_Sub5.anIntArray3623[i_29_];
		float f = (float) Math.atan2((double) (i_31_ - 2048), (double) (i_32_ - 2048));
		if (!((double) f >= -3.141592653589793) || !(-2.356194490192345 >= (double) f)) {
			if (!(-1.5707963267948966 >= (double) f) || !(-2.356194490192345 <= (double) f)) {
				if (!((double) f <= -0.7853981633974483) || !(-1.5707963267948966 <= (double) f)) {
					if (f <= 0.0F && (double) f >= -0.7853981633974483) {
						Class71.anInt1083 = i_28_;
						Class14_Sub8_Sub20.anInt4429 = Class17.anInt407 - i_29_;
					} else if (0.0F <= f && (double) f <= 0.7853981633974483) {
						Class14_Sub8_Sub20.anInt4429 = Class17.anInt407 - i_29_;
						Class71.anInt1083 = -i_28_ + Class112.anInt1876;
					} else if (!(0.7853981633974483 <= (double) f) || !(1.5707963267948966 >= (double) f)) {
						if (!((double) f >= 1.5707963267948966) || !((double) f <= 2.356194490192345)) {
							if (2.356194490192345 <= (double) f && (double) f <= 3.141592653589793) {
								Class71.anInt1083 = Class112.anInt1876 - i_28_;
								Class14_Sub8_Sub20.anInt4429 = i_29_;
							}
						} else {
							Class71.anInt1083 = i_29_;
							Class14_Sub8_Sub20.anInt4429 = Class17.anInt407 - i_28_;
						}
					} else {
						Class71.anInt1083 = -i_29_ + Class112.anInt1876;
						Class14_Sub8_Sub20.anInt4429 = -i_28_ + Class17.anInt407;
					}
				} else {
					Class14_Sub8_Sub20.anInt4429 = i_28_;
					Class71.anInt1083 = -i_29_ + Class112.anInt1876;
				}
			} else {
				Class14_Sub8_Sub20.anInt4429 = i_28_;
				Class71.anInt1083 = i_29_;
			}
		} else {
			Class71.anInt1083 = i_28_;
			Class14_Sub8_Sub20.anInt4429 = i_29_;
		}
		Class71.anInt1083 &= Static2.anInt4882;
		Class14_Sub8_Sub20.anInt4429 &= Class115.anInt1927;
	}
}
