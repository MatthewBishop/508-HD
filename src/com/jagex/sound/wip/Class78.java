/* Class78 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.util.Util;

public class Class78 {
	public int[] anIntArray1220;
	public int anInt1221;
	public float[][] aFloatArrayArray1222;
	public int[] anIntArray1223;
	public int anInt1224;
	public int[] anIntArray1225;

	public static int method1370(int i, int i_0_) {
		int i_1_;
		for (i_1_ = (int) Math.pow(i, 1.0 / i_0_) + 1; Class78.method221(i_0_, i_1_) > i; i_1_--) {
			/* empty */
		}
		return i_1_;
	}

	public int method1371() {
		int i;
		for (i = 0; anIntArray1225[i] >= 0; i = Class14_Sub24.method908() != 0 ? anIntArray1225[i] : i + 1) {
			/* empty */
		}
		return anIntArray1225[i] ^ 0xffffffff;
	}

	public void method1372() {
		int[] is = new int[anInt1221];
		int[] is_2_ = new int[33];
		for (int i = 0; i < anInt1221; i++) {
			int i_3_ = anIntArray1223[i];
			if (i_3_ != 0) {
				int i_4_ = 1 << 32 - i_3_;
				int i_5_ = is_2_[i_3_];
				is[i] = i_5_;
				int i_6_;
				if ((i_5_ & i_4_) != 0)
					i_6_ = is_2_[i_3_ - 1];
				else {
					i_6_ = i_5_ | i_4_;
					for (int i_7_ = i_3_ - 1; i_7_ >= 1; i_7_--) {
						int i_8_ = is_2_[i_7_];
						if (i_8_ != i_5_)
							break;
						int i_9_ = 1 << 32 - i_7_;
						if ((i_8_ & i_9_) != 0) {
							is_2_[i_7_] = is_2_[i_7_ - 1];
							break;
						}
						is_2_[i_7_] = i_8_ | i_9_;
					}
				}
				is_2_[i_3_] = i_6_;
				for (int i_10_ = i_3_ + 1; i_10_ <= 32; i_10_++) {
					int i_11_ = is_2_[i_10_];
					if (i_11_ == i_5_)
						is_2_[i_10_] = i_6_;
				}
			}
		}
		anIntArray1225 = new int[8];
		int i = 0;
		for (int i_12_ = 0; i_12_ < anInt1221; i_12_++) {
			int i_13_ = anIntArray1223[i_12_];
			if (i_13_ != 0) {
				int i_14_ = is[i_12_];
				int i_15_ = 0;
				for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
					int i_17_ = -2147483648 >>> i_16_;
					if ((i_14_ & i_17_) != 0) {
						if (anIntArray1225[i_15_] == 0)
							anIntArray1225[i_15_] = i;
						i_15_ = anIntArray1225[i_15_];
					} else
						i_15_++;
					if (i_15_ >= anIntArray1225.length) {
						int[] is_18_ = new int[anIntArray1225.length * 2];
						for (int i_19_ = 0; i_19_ < anIntArray1225.length; i_19_++)
							is_18_[i_19_] = anIntArray1225[i_19_];
						anIntArray1225 = is_18_;
					}
					i_17_ >>>= 1;
				}
				anIntArray1225[i_15_] = i_12_ ^ 0xffffffff;
				if (i_15_ >= i)
					i = i_15_ + 1;
			}
		}
	}

	public float[] method1373() {
		return aFloatArrayArray1222[method1371()];
	}

	public static int method221(int var0, int var1) {
		try {
			int var3;
			for (var3 = 1; var0 > 1; var1 *= var1) {
				if ((var0 & 1) != 0) {
					var3 *= var1;
				}
	
				var0 >>= 1;
			}
	
			if (var0 == 1) {
				int var4 = var1 * var3;
				return var4;
			} else {
				return var3;
			}
		} catch (Throwable var5) {
			throw Util.error(var5, "bi.P(" + var0 + ',' + var1 + ')');
		}
	}

	public Class78() {
		Class14_Sub24.method906(24);
		anInt1224 = Class14_Sub24.method906(16);
		anInt1221 = Class14_Sub24.method906(24);
		anIntArray1223 = new int[anInt1221];
		boolean bool = Class14_Sub24.method908() != 0;
		if (bool) {
			int i = 0;
			int i_20_ = Class14_Sub24.method906(5) + 1;
			while (i < anInt1221) {
				int i_21_ = Class14_Sub24.method906(Class14_Sub24.method1192(anInt1221 - i));
				for (int i_22_ = 0; i_22_ < i_21_; i_22_++)
					anIntArray1223[i++] = i_20_;
				i_20_++;
			}
		} else {
			boolean bool_23_ = Class14_Sub24.method908() != 0;
			for (int i = 0; i < anInt1221; i++) {
				if (bool_23_ && Class14_Sub24.method908() == 0)
					anIntArray1223[i] = 0;
				else
					anIntArray1223[i] = Class14_Sub24.method906(5) + 1;
			}
		}
		method1372();
		int i = Class14_Sub24.method906(4);
		if (i > 0) {
			float f = Class14_Sub24.method907(Class14_Sub24.method906(32));
			float f_24_ = Class14_Sub24.method907(Class14_Sub24.method906(32));
			int i_25_ = Class14_Sub24.method906(4) + 1;
			boolean bool_26_ = Class14_Sub24.method908() != 0;
			int i_27_;
			if (i == 1)
				i_27_ = method1370(anInt1221, anInt1224);
			else
				i_27_ = anInt1221 * anInt1224;
			anIntArray1220 = new int[i_27_];
			for (int i_28_ = 0; i_28_ < i_27_; i_28_++)
				anIntArray1220[i_28_] = Class14_Sub24.method906(i_25_);
			aFloatArrayArray1222 = new float[anInt1221][anInt1224];
			if (i == 1) {
				for (int i_29_ = 0; i_29_ < anInt1221; i_29_++) {
					float f_30_ = 0.0F;
					int i_31_ = 1;
					for (int i_32_ = 0; i_32_ < anInt1224; i_32_++) {
						int i_33_ = i_29_ / i_31_ % i_27_;
						float f_34_ = (anIntArray1220[i_33_] * f_24_ + f + f_30_);
						aFloatArrayArray1222[i_29_][i_32_] = f_34_;
						if (bool_26_)
							f_30_ = f_34_;
						i_31_ *= i_27_;
					}
				}
			} else {
				for (int i_35_ = 0; i_35_ < anInt1221; i_35_++) {
					float f_36_ = 0.0F;
					int i_37_ = i_35_ * anInt1224;
					for (int i_38_ = 0; i_38_ < anInt1224; i_38_++) {
						float f_39_ = (anIntArray1220[i_37_] * f_24_ + f + f_36_);
						aFloatArrayArray1222[i_35_][i_38_] = f_39_;
						if (bool_26_)
							f_36_ = f_39_;
						i_37_++;
					}
				}
			}
		}
	}
}
