/* Class145 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class145 {
	public static float[][] aFloatArrayArray2342 = new float[2][8];
	public int[] anIntArray2343 = new int[2];
	public static float aFloat2344;
	public static int[][] anIntArrayArray2345 = new int[2][8];
	public int[] anIntArray2346 = new int[2];
	public static int anInt2347;
	public int[][][] anIntArrayArrayArray2348;
	public int[][][] anIntArrayArrayArray2349 = new int[2][2][4];

	public int method1984(int i, float f) {
		if (i == 0) {
			float f_0_ = ((float) anIntArray2343[0] + (float) (anIntArray2343[1] - anIntArray2343[0]) * f);
			f_0_ *= 0.0030517578F;
			aFloat2344 = (float) Math.pow(0.1, (double) (f_0_ / 20.0F));
			anInt2347 = (int) (aFloat2344 * 65536.0F);
		}
		if (anIntArray2346[i] == 0)
			return 0;
		float f_1_ = method1986(i, 0, f);
		aFloatArrayArray2342[i][0] = f_1_ * -2.0F * (float) Math.cos((double) method1985(i, 0, f));
		aFloatArrayArray2342[i][1] = f_1_ * f_1_;
		for (int i_2_ = 1; i_2_ < anIntArray2346[i]; i_2_++) {
			f_1_ = method1986(i, i_2_, f);
			float f_3_ = (f_1_ * -2.0F * (float) Math.cos((double) method1985(i, i_2_, f)));
			float f_4_ = f_1_ * f_1_;
			aFloatArrayArray2342[i][i_2_ * 2 + 1] = aFloatArrayArray2342[i][i_2_ * 2 - 1] * f_4_;
			aFloatArrayArray2342[i][i_2_ * 2] = (aFloatArrayArray2342[i][i_2_ * 2 - 1] * f_3_
					+ aFloatArrayArray2342[i][i_2_ * 2 - 2] * f_4_);
			for (int i_5_ = i_2_ * 2 - 1; i_5_ >= 2; i_5_--)
				aFloatArrayArray2342[i][i_5_] += (aFloatArrayArray2342[i][i_5_ - 1] * f_3_
						+ aFloatArrayArray2342[i][i_5_ - 2] * f_4_);
			aFloatArrayArray2342[i][1] += aFloatArrayArray2342[i][0] * f_3_ + f_4_;
			aFloatArrayArray2342[i][0] += f_3_;
		}
		if (i == 0) {
			for (int i_6_ = 0; i_6_ < anIntArray2346[0] * 2; i_6_++)
				aFloatArrayArray2342[0][i_6_] *= aFloat2344;
		}
		for (int i_7_ = 0; i_7_ < anIntArray2346[i] * 2; i_7_++)
			anIntArrayArray2345[i][i_7_] = (int) (aFloatArrayArray2342[i][i_7_] * 65536.0F);
		return anIntArray2346[i] * 2;
	}

	public float method1985(int i, int i_8_, float f) {
		float f_9_ = ((float) anIntArrayArrayArray2348[i][0][i_8_]
				+ f * (float) (anIntArrayArrayArray2348[i][1][i_8_] - anIntArrayArrayArray2348[i][0][i_8_]));
		f_9_ *= 1.2207031E-4F;
		return method1989(f_9_);
	}

	public float method1986(int i, int i_10_, float f) {
		float f_11_ = ((float) anIntArrayArrayArray2349[i][0][i_10_]
				+ f * (float) (anIntArrayArrayArray2349[i][1][i_10_] - anIntArrayArrayArray2349[i][0][i_10_]));
		f_11_ *= 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0, (double) (-f_11_ / 20.0F));
	}

	public static void method1987() {
		aFloatArrayArray2342 = null;
		anIntArrayArray2345 = null;
	}

	public void method1988(Buffer class14_sub10, Class93 class93) {
		int i = class14_sub10.method798();
		anIntArray2346[0] = i >> 4;
		anIntArray2346[1] = i & 0xf;
		if (i != 0) {
			anIntArray2343[0] = class14_sub10.method784((byte) 107);
			anIntArray2343[1] = class14_sub10.method784((byte) 103);
			int i_12_ = class14_sub10.method798();
			for (int i_13_ = 0; i_13_ < 2; i_13_++) {
				for (int i_14_ = 0; i_14_ < anIntArray2346[i_13_]; i_14_++) {
					anIntArrayArrayArray2348[i_13_][0][i_14_] = class14_sub10.method784((byte) 108);
					anIntArrayArrayArray2349[i_13_][0][i_14_] = class14_sub10.method784((byte) 121);
				}
			}
			for (int i_15_ = 0; i_15_ < 2; i_15_++) {
				for (int i_16_ = 0; i_16_ < anIntArray2346[i_15_]; i_16_++) {
					if ((i_12_ & 1 << i_15_ * 4 << i_16_) != 0) {
						anIntArrayArrayArray2348[i_15_][1][i_16_] = class14_sub10.method784((byte) 108);
						anIntArrayArrayArray2349[i_15_][1][i_16_] = class14_sub10.method784((byte) 125);
					} else {
						anIntArrayArrayArray2348[i_15_][1][i_16_] = anIntArrayArrayArray2348[i_15_][0][i_16_];
						anIntArrayArrayArray2349[i_15_][1][i_16_] = anIntArrayArrayArray2349[i_15_][0][i_16_];
					}
				}
			}
			if (i_12_ != 0 || anIntArray2343[1] != anIntArray2343[0])
				class93.method1466(class14_sub10);
		} else
			anIntArray2343[0] = anIntArray2343[1] = 0;
	}

	public static float method1989(float f) {
		float f_17_ = (float) Math.pow(2.0, (double) f) * 32.703197F;
		return f_17_ * 3.1415927F / 11025.0F;
	}

	public Class145() {
		anIntArrayArrayArray2348 = new int[2][2][4];
	}
}
