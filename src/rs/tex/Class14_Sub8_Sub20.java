/* Class14_Sub8_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Class14_Sub2_Sub13;
import com.jagex.util.TimeUtil;

import rs.Class107;
import rs.Class108;
import rs.Class112;
import rs.Class142;

public class Class14_Sub8_Sub20 extends Class14_Sub8 {
	public static boolean aBoolean4420;
	public static int anInt4419 = 0;
	public static int anInt4427;
	public static int anInt4429;
	public static int[] anIntArray4422 = new int[2];
	public static Object anObject4417;
	static {
		aBoolean4420 = true;
		anInt4429 = 0;
		anObject4417 = new Object();
	}
	public static void method583(int i) {
		int i_0_ = -88 / ((i + 14) / 47);
		int[] is = new int[Class108.anInt1816];
		int i_1_ = 0;
		for (int i_2_ = 0; i_2_ < Class108.anInt1816; i_2_++) {
			Class142 class142 = Class14_Sub8_Sub24.method605(63, i_2_);
			if (class142.anInt2274 >= 0 || class142.anInt2264 >= 0)
				is[i_1_++] = i_2_;
		}
		Class107.anIntArray1809 = new int[i_1_];
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
			Class107.anIntArray1809[i_3_] = is[i_3_];
	}
	public static Class14_Sub2_Sub13 method584(int i) {
		if (i != -11988)
			anObject4417 = null;
		Class14_Sub2_Sub13 class14_sub2_sub13 = ((Class14_Sub2_Sub13) Class14_Sub8_Sub27.aClass81_4546
				.method1400((byte) 79));
		if (class14_sub2_sub13 != null) {
			class14_sub2_sub13.unlink();
			class14_sub2_sub13.unlinkCacheable();
			Class14_Sub2_Sub13 class14_sub2_sub13_4_ = class14_sub2_sub13;
			return class14_sub2_sub13_4_;
		}
		Class14_Sub2_Sub13 class14_sub2_sub13_5_;
		do {
			class14_sub2_sub13_5_ = ((Class14_Sub2_Sub13) Class14_Sub8.aClass81_2844.method1400((byte) 40));
			if (class14_sub2_sub13_5_ == null) {
				class14_sub2_sub13 = null;
				return class14_sub2_sub13;
			}
			if (class14_sub2_sub13_5_.method330() > TimeUtil.getTime()) {
				class14_sub2_sub13 = null;
				return class14_sub2_sub13;
			}
			class14_sub2_sub13_5_.unlink();
			class14_sub2_sub13_5_.unlinkCacheable();
		} while ((class14_sub2_sub13_5_.keyCacheable & ~0x7fffffffffffffffL) == 0L);
		class14_sub2_sub13 = class14_sub2_sub13_5_;
		return class14_sub2_sub13;
	}
	public static void method585(byte i) {
		if (i <= 86)
			anObject4417 = null;
		anObject4417 = null;
		anIntArray4422 = null;
	}
	public int anInt4421 = 4096;

	public int anInt4423 = 4096;

	public int anInt4426;

	public int anInt4428 = 409;

	public int[] anIntArray4415 = new int[3];

	public Class14_Sub8_Sub20() {
		super(1, false);
		anInt4426 = 4096;
	}

	public int[][] method474(int i, int i_6_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_7_ = method480(0, 0, i);
			int[] is_8_ = is_7_[0];
			int[] is_9_ = is_7_[2];
			int[] is_10_ = is_7_[1];
			int[] is_11_ = is[0];
			int[] is_12_ = is[1];
			int[] is_13_ = is[2];
			for (int i_14_ = 0; i_14_ < Class112.anInt1876; i_14_++) {
				int i_15_ = is_8_[i_14_];
				int i_16_ = i_15_ - anIntArray4415[0];
				if (i_16_ < 0)
					i_16_ = -i_16_;
				if (i_16_ > anInt4428) {
					is_11_[i_14_] = i_15_;
					is_12_[i_14_] = is_10_[i_14_];
					is_13_[i_14_] = is_9_[i_14_];
				} else {
					int i_17_ = is_10_[i_14_];
					i_16_ = -anIntArray4415[1] + i_17_;
					if (i_16_ < 0)
						i_16_ = -i_16_;
					if (anInt4428 < i_16_) {
						is_11_[i_14_] = i_15_;
						is_12_[i_14_] = i_17_;
						is_13_[i_14_] = is_9_[i_14_];
					} else {
						int i_18_ = is_9_[i_14_];
						i_16_ = -anIntArray4415[2] + i_18_;
						if (i_16_ < 0)
							i_16_ = -i_16_;
						if (anInt4428 < i_16_) {
							is_11_[i_14_] = i_15_;
							is_12_[i_14_] = i_17_;
							is_13_[i_14_] = i_18_;
						} else {
							is_11_[i_14_] = i_15_ * anInt4423 >> 44;
							is_12_[i_14_] = i_17_ * anInt4426 >> 12;
							is_13_[i_14_] = i_18_ * anInt4421 >> 44;
						}
					}
				}
			}
		}
		if (i_6_ > -4) {
			int[][] is_19_ = null;
			return is_19_;
		}
		int[][] is_20_ = is;
		return is_20_;
	}

	public void method475(int i, int i_21_, Buffer class14_sub10) {
		int i_22_ = i;
		while_100_: do {
			while_99_: do {
				while_98_: do {
					do {
						if (i_22_ != 0) {
							if (i_22_ != 1) {
								if (i_22_ != 2) {
									if (i_22_ != 3) {
										if (i_22_ == 4)
											break while_99_;
										break while_100_;
									}
								} else
									break;
								break while_98_;
							}
						} else {
							anInt4428 = class14_sub10.method784((byte) 123);
							break while_100_;
						}
						anInt4421 = class14_sub10.method784((byte) 107);
						break while_100_;
					} while (false);
					anInt4426 = class14_sub10.method784((byte) 107);
					break while_100_;
				} while (false);
				anInt4423 = class14_sub10.method784((byte) 109);
				break while_100_;
			} while (false);
			int i_23_ = class14_sub10.method829(i_21_ ^ 0x609d);
			anIntArray4415[2] = Class14_Sub8_Sub26.method617(i_23_ >> 12, 0);
			anIntArray4415[0] = Class14_Sub8_Sub26.method617(267386880, i_23_ << 36);
			anIntArray4415[1] = Class14_Sub8_Sub26.method617(i_23_ >> 4, 4080);
		} while (false);
		if (i_21_ != 24777)
			method584(71);
	}
}
