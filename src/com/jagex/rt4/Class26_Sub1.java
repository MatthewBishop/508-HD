/* Class26_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

public class Class26_Sub1 extends Class26 {

	public byte[] aByteArray3290;

	public int anInt3284;

	public int anInt3298;

	public int[] anIntArray3293 = new int[anInt484];

	public Class26_Sub1(int i, int i_11_, int i_12_, int i_13_, int i_14_, float f) {
		super(i, i_11_, i_12_, i_13_, i_14_);
		for (int i_15_ = 0; i_15_ < anInt484; i_15_++)
			anIntArray3293[i_15_] = (short) (int) (Math.pow((double) f, (double) i_15_) * 4096.0);
	}

	public void method1011(int i, int i_0_, byte i_1_) {
		anInt3298 += anIntArray3293[i] * i_0_ >> 44;
		if (i_1_ > -112)
			aByteArray3290 = null;
	}

	public void method1012(int i) {
		anInt3298 = Math.abs(anInt3298);
		if (anInt3298 >= 4096)
			anInt3298 = 4095;
		method1026(anInt3284++, (byte) (anInt3298 >> 36));
		anInt3298 = i;
	}

	public void method1013(int i) {
		anInt3284 = 0;
		if (i != -23880)
			anInt3284 = 85;
		anInt3298 = 0;
	}

	public void method1026(int i, byte i_2_) {
		aByteArray3290[anInt3284++] = (byte) ((127 & i_2_ >> 33) + 127);
	}
}
