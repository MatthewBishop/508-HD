/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

public class Class63 {
	public int[] anIntArray1006;

	public Class63(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 33); i <<= 1) {
			/* empty */
		}
		anIntArray1006 = new int[i + i];
		for (int i_14_ = 0; i + i > i_14_; i_14_++)
			anIntArray1006[i_14_] = -1;
		for (int i_15_ = 0; is.length > i_15_; i_15_++) {
			int i_16_;
			for (i_16_ = is[i_15_] & i - 1; anIntArray1006[i_16_ + 1 + i_16_] != -1; i_16_ = i_16_ + 1 & i - 1) {
				/* empty */
			}
			anIntArray1006[i_16_ + i_16_] = is[i_15_];
			anIntArray1006[i_16_ + 1 + i_16_] = i_15_;
		}
	}

	public int method1283(int i, int i_9_) {
		int i_10_ = (anIntArray1006.length >> 1) - 1;
		int i_11_ = i_10_ & i_9_;
		if (i != -9)
			anIntArray1006 = null;
		for (;;) {
			int i_12_ = anIntArray1006[i_11_ + i_11_ + 1];
			if (i_12_ == -1)
				return -1;
			if (i_9_ == anIntArray1006[i_11_ + i_11_]) {
				int i_13_ = i_12_;
				return i_13_;
			}
			i_11_ = i_11_ + 1 & i_10_;
		}
	}
}
