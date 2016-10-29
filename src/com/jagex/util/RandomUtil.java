package com.jagex.util;

import java.util.Random;

public class RandomUtil {

	public static int method1949(Random random, int i) {
		if (i <= 0)
			throw new IllegalArgumentException();
		if (RandomUtil.method1594(i)) {
			int i_24_ = (int) (((long) random.nextInt() & 0xffffffffL) * (long) i >> 32);
			return i_24_;
		}
		int i_25_ = -(int) (4294967296L % (long) i) - -2147483648;
		int i_26_;
		do
			i_26_ = random.nextInt();
		while (i_25_ <= i_26_);
		int i_27_ = RandomUtil.method545((byte) -107, i, i_26_);
		return i_27_;
	}

	public static boolean method1594(int i) {
		boolean bool = i == (i & -i);
		return bool;
	}

	public static int method545(byte i, int i_0_, int i_1_) {
		int i_2_ = i_1_ >> 31 & i_0_ - 1;
		int i_4_ = (i_1_ + (i_1_ >>> 31)) % i_0_ + i_2_;
		return i_4_;
	}

}
