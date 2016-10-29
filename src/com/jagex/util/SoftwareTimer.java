/* Class99_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

public class SoftwareTimer extends Timer {
	private long aLong3341;

	private long[] memory = new long[10];

	private int anInt3336;

	private int anInt3355 = 0;

	private int anInt3356;

	private int anInt3359;

	public SoftwareTimer() {
		anInt3336 = 1;
		anInt3359 = 256;
		aLong3341 = TimeUtil.getTime();
		for (int i = 0; i < 10; i++)
			memory[i] = aLong3341;
	}

	public int method1501(int i, int i_5_) {
		int i_6_ = anInt3336;
		int i_7_ = anInt3359;
		anInt3336 = 1;
		anInt3359 = 300;
		aLong3341 = TimeUtil.getTime();
		if (0L == memory[anInt3356]) {
			anInt3359 = i_7_;
			anInt3336 = i_6_;
		} else if (aLong3341 > memory[anInt3356])
			anInt3359 = (int) ((long) (i_5_ * 2560) / (-memory[anInt3356] + aLong3341));
		if (anInt3359 < 25)
			anInt3359 = 25;
		if (anInt3359 > 256) {
			anInt3359 = 256;
			anInt3336 = (int) (-((aLong3341 + -memory[anInt3356]) / 10L) + (long) i_5_);
		}
		if (anInt3336 > i_5_)
			anInt3336 = i_5_;
		memory[anInt3356] = aLong3341;
		anInt3356 = (anInt3356 + 1) % 10;
		if (anInt3336 > 1) {
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				if (memory[i_8_] != 0L)
					memory[i_8_] = memory[i_8_] - -(long) anInt3336;
			}
		}
		if (anInt3336 < i)
			anInt3336 = i;
		int i_9_ = 0;
		Util.sleep((long) anInt3336);
		for (/**/; anInt3355 < 256; anInt3355 += anInt3359)
			i_9_++;
		anInt3355 &= 0xff;
		return i_9_;
	}

	public void reset() {
		for (int i_11_ = 0; i_11_ < 10; i_11_++)
			memory[i_11_] = 0L;
	}
}
