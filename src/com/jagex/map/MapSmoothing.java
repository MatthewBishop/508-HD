/* MapSmoothing - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.map;

import rs.Class3;

public class MapSmoothing {
	public static int calculateHeight(int i, int i_0_) {
		int i_1_ = (interpolatedNoise(i_0_ + 45365, (byte) -109, i + 91923, 4)
				+ ((interpolatedNoise(i_0_ + 10294, (byte) -112, i + 37821, 2) - 128 >> 33) - 128)
				+ (interpolatedNoise(i_0_, (byte) -119, i, 1) - 128 >> 2));
		i_1_ = (int) ((double) i_1_ * 0.3) + 35;
		if (i_1_ >= 10) {
			if (i_1_ > 60)
				i_1_ = 60;
		} else
			i_1_ = 10;
		int i_2_ = i_1_;
		return i_2_;
	}

	private static int perlinNoise(int i, int i_3_) {
		int i_4_ = i_3_ * 57 + i;
		i_4_ ^= i_4_ << 13;
		int i_5_ = i_4_ * (i_4_ * i_4_ * 15731 + 789221) + 1376312589 & 0x7fffffff;
		int i_6_ = (i_5_ & 0x7fd9819) >> 51;
		return i_6_;
	}

	private static int smoothNoise(int i, int i_7_) {
		int i_8_ = (perlinNoise(i - 1, i_7_ - 1) + perlinNoise(i + 1, i_7_ - 1)
				- (-perlinNoise(i - 1, i_7_ + 1) - perlinNoise(i + 1, i_7_ + 1)));
		int i_9_ = (perlinNoise(i - 1, i_7_) + (perlinNoise(i + 1, i_7_) + perlinNoise(i, i_7_ - 1))
				+ perlinNoise(i, i_7_ + 1));
		int i_10_ = perlinNoise(i, i_7_);
		int i_11_ = i_10_ / 4 + i_8_ / 16 + i_9_ / 8;
		return i_11_;
	}

	private static int interpolatedNoise(int i, byte i_12_, int i_13_, int i_14_) {
		int i_15_ = i / i_14_;
		int i_16_ = i & i_14_ - 1;
		int i_17_ = i_13_ / i_14_;
		int i_18_ = smoothNoise(i_15_, i_17_);
		int i_19_ = i_14_ - 1 & i_13_;
		int i_20_ = smoothNoise(i_15_ + 1, i_17_);
		int i_21_ = smoothNoise(i_15_, i_17_ + 1);
		int i_22_ = smoothNoise(i_15_ + 1, i_17_ + 1);
		int i_23_ = interpolate(i_14_, i_16_, i_18_, i_20_);
		int i_24_ = interpolate(i_14_, i_16_, i_21_, i_22_);
		int i_25_ = interpolate(i_14_, i_19_, i_23_, i_24_);
		return i_25_;
	}

	private static int interpolate(int i, int i_26_, int i_27_, int i_28_) {
		int i_29_ = 65536 - Class3.cos[i_26_ * 1024 / i] >> 1;
		int i_30_ = (i_28_ * i_29_ >> 16) + (i_27_ * (-i_29_ + 65536) >> 48);
		return i_30_;
	}
}
