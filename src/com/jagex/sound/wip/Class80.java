/* Class80 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

public class Class80 {
	public int anInt1307;
	public int anInt1308;
	public int[] anIntArray1309;
	public int anInt1310 = Class14_Sub24.method906(16);
	public int anInt1311;
	public int anInt1312;
	public int anInt1313;

	public void method1393(float[] fs, int i, boolean bool) {
		for (int i_0_ = 0; i_0_ < i; i_0_++)
			fs[i_0_] = 0.0F;
		if (!bool) {
			int i_1_ = Class14_Sub24.aClass78Array3159[anInt1308].anInt1224;
			int i_2_ = anInt1313 - anInt1307;
			int i_3_ = i_2_ / anInt1312;
			int[] is = new int[i_3_];
			for (int i_4_ = 0; i_4_ < 8; i_4_++) {
				int i_5_ = 0;
				while (i_5_ < i_3_) {
					if (i_4_ == 0) {
						int i_6_ = Class14_Sub24.aClass78Array3159[anInt1308].method1371();
						for (int i_7_ = i_1_ - 1; i_7_ >= 0; i_7_--) {
							if (i_5_ + i_7_ < i_3_)
								is[i_5_ + i_7_] = i_6_ % anInt1311;
							i_6_ /= anInt1311;
						}
					}
					for (int i_8_ = 0; i_8_ < i_1_; i_8_++) {
						int i_9_ = is[i_5_];
						int i_10_ = anIntArray1309[i_9_ * 8 + i_4_];
						if (i_10_ >= 0) {
							int i_11_ = anInt1307 + i_5_ * anInt1312;
							Class78 class78 = Class14_Sub24.aClass78Array3159[i_10_];
							if (anInt1310 == 0) {
								int i_12_ = anInt1312 / class78.anInt1224;
								for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
									float[] fs_14_ = class78.method1373();
									for (int i_15_ = 0; i_15_ < class78.anInt1224; i_15_++)
										fs[i_11_ + i_13_ + i_15_ * i_12_] += fs_14_[i_15_];
								}
							} else {
								int i_16_ = 0;
								while (i_16_ < anInt1312) {
									float[] fs_17_ = class78.method1373();
									for (int i_18_ = 0; i_18_ < class78.anInt1224; i_18_++) {
										fs[i_11_ + i_16_] += fs_17_[i_18_];
										i_16_++;
									}
								}
							}
						}
						if (++i_5_ >= i_3_)
							break;
					}
				}
			}
		}
	}

	public Class80() {
		anInt1307 = Class14_Sub24.method906(24);
		anInt1313 = Class14_Sub24.method906(24);
		anInt1312 = Class14_Sub24.method906(24) + 1;
		anInt1311 = Class14_Sub24.method906(6) + 1;
		anInt1308 = Class14_Sub24.method906(8);
		int[] is = new int[anInt1311];
		for (int i = 0; i < anInt1311; i++) {
			int i_19_ = 0;
			int i_20_ = Class14_Sub24.method906(3);
			boolean bool = Class14_Sub24.method908() != 0;
			if (bool)
				i_19_ = Class14_Sub24.method906(5);
			is[i] = i_19_ << 3 | i_20_;
		}
		anIntArray1309 = new int[anInt1311 * 8];
		for (int i = 0; i < anInt1311 * 8; i++)
			anIntArray1309[i] = ((is[i >> 3] & 1 << (i & 0x7)) != 0 ? Class14_Sub24.method906(8) : -1);
	}
}
