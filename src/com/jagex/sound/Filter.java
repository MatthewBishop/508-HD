/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

import com.jagex.io.Buffer;

public class Filter {
	public static float forwardMinimisedCoefficientMultiplier;
	public static float[][] minimisedCoefficients = new float[2][8];
	public static int forwardMultiplier;
	public static int[][] coefficients = new int[2][8];
	public static void dispose() {
		minimisedCoefficients = null;
		coefficients = null;
	}
	public static float normalise(float f) {
		float f_17_ = (float) Math.pow(2.0, (double) f) * 32.703197F;
		return f_17_ * 3.1415927F / 11025.0F;
	}
	public int[] unity = new int[2];
	public int[] pairs = new int[2];

	public int[][][] phases = new int[2][2][4];

	public int[][][] magnitudes = new int[2][2][4];

	public int compute(int i, float f) {
		if (i == 0) {
			float f_0_ = ((float) unity[0] + (float) (unity[1] - unity[0]) * f);
			f_0_ *= 0.0030517578F;
			forwardMinimisedCoefficientMultiplier = (float) Math.pow(0.1, (double) (f_0_ / 20.0F));
			forwardMultiplier = (int) (forwardMinimisedCoefficientMultiplier * 65536.0F);
		}
		if (pairs[i] == 0)
			return 0;
		float f_1_ = interpolateMagnitude(i, 0, f);
		minimisedCoefficients[i][0] = f_1_ * -2.0F * (float) Math.cos((double) interpolatePhase(i, 0, f));
		minimisedCoefficients[i][1] = f_1_ * f_1_;
		for (int i_2_ = 1; i_2_ < pairs[i]; i_2_++) {
			f_1_ = interpolateMagnitude(i, i_2_, f);
			float f_3_ = (f_1_ * -2.0F * (float) Math.cos((double) interpolatePhase(i, i_2_, f)));
			float f_4_ = f_1_ * f_1_;
			minimisedCoefficients[i][i_2_ * 2 + 1] = minimisedCoefficients[i][i_2_ * 2 - 1] * f_4_;
			minimisedCoefficients[i][i_2_ * 2] = (minimisedCoefficients[i][i_2_ * 2 - 1] * f_3_
					+ minimisedCoefficients[i][i_2_ * 2 - 2] * f_4_);
			for (int i_5_ = i_2_ * 2 - 1; i_5_ >= 2; i_5_--)
				minimisedCoefficients[i][i_5_] += (minimisedCoefficients[i][i_5_ - 1] * f_3_
						+ minimisedCoefficients[i][i_5_ - 2] * f_4_);
			minimisedCoefficients[i][1] += minimisedCoefficients[i][0] * f_3_ + f_4_;
			minimisedCoefficients[i][0] += f_3_;
		}
		if (i == 0) {
			for (int i_6_ = 0; i_6_ < pairs[0] * 2; i_6_++)
				minimisedCoefficients[0][i_6_] *= forwardMinimisedCoefficientMultiplier;
		}
		for (int i_7_ = 0; i_7_ < pairs[i] * 2; i_7_++)
			coefficients[i][i_7_] = (int) (minimisedCoefficients[i][i_7_] * 65536.0F);
		return pairs[i] * 2;
	}

	public float interpolatePhase(int i, int i_8_, float f) {
		float f_9_ = ((float) phases[i][0][i_8_]
				+ f * (float) (phases[i][1][i_8_] - phases[i][0][i_8_]));
		f_9_ *= 1.2207031E-4F;
		return normalise(f_9_);
	}

	public float interpolateMagnitude(int i, int i_10_, float f) {
		float f_11_ = ((float) magnitudes[i][0][i_10_]
				+ f * (float) (magnitudes[i][1][i_10_] - magnitudes[i][0][i_10_]));
		f_11_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_11_ / 20.0F));
	}

	public void decode(Buffer class14_sub10, Envelope envelope) {
		int i = class14_sub10.readUByte();
		pairs[0] = i >> 4;
		pairs[1] = i & 0xf;
		if (i != 0) {
			unity[0] = class14_sub10.readUShort();
			unity[1] = class14_sub10.readUShort();
			int i_12_ = class14_sub10.readUByte();
			for (int i_13_ = 0; i_13_ < 2; i_13_++) {
				for (int i_14_ = 0; i_14_ < pairs[i_13_]; i_14_++) {
					phases[i_13_][0][i_14_] = class14_sub10.readUShort();
					magnitudes[i_13_][0][i_14_] = class14_sub10.readUShort();
				}
			}
			for (int i_15_ = 0; i_15_ < 2; i_15_++) {
				for (int i_16_ = 0; i_16_ < pairs[i_15_]; i_16_++) {
					if ((i_12_ & 1 << i_15_ * 4 << i_16_) != 0) {
						phases[i_15_][1][i_16_] = class14_sub10.readUShort();
						magnitudes[i_15_][1][i_16_] = class14_sub10.readUShort();
					} else {
						phases[i_15_][1][i_16_] = phases[i_15_][0][i_16_];
						magnitudes[i_15_][1][i_16_] = magnitudes[i_15_][0][i_16_];
					}
				}
			}
			if (i_12_ != 0 || unity[1] != unity[0])
				envelope.decodeSegments(class14_sub10);
		} else
			unity[0] = unity[1] = 0;
	}
}
