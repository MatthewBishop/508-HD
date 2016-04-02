/* Class26_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

public class Class26_Sub2 extends Class26 {
	public byte[] aByteArray3305;
	public int anInt3300;
	public int anInt3302;
	public int anInt3303;
	public int anInt3304;
	public int anInt3306;

	public int anInt3307;

	public int anInt3308;

	public int anInt3312;

	public Class26_Sub2(int i, int i_0_, int i_1_, int i_2_, int i_3_, float f, float f_4_, float f_5_) {
		super(i, i_0_, i_1_, i_2_, i_3_);
		anInt3302 = (int) (f_5_ * 4096.0F);
		anInt3304 = (int) (f_4_ * 4096.0F);
		anInt3307 = anInt3300 = (int) (Math.pow(0.5, (double) -f) * 4096.0);
	}

	public void method1011(int i, int i_7_, byte i_8_) {
		if (i == 0) {
			anInt3312 = anInt3304 - (i_7_ >= 0 ? i_7_ : -i_7_);
			anInt3312 = anInt3312 * anInt3312 >> 44;
			anInt3308 = anInt3312;
			anInt3303 = 4096;
		} else {
			anInt3303 = anInt3312 * anInt3302 >> 44;
			anInt3312 = anInt3304 + (i_7_ < 0 ? i_7_ : i_7_);
			if (anInt3303 >= 0) {
				if (anInt3303 > 4096)
					anInt3303 = 4096;
			} else
				anInt3303 = 0;
			anInt3312 = anInt3312 * anInt3312 >> 12;
			anInt3312 = anInt3303 * anInt3312 >> 44;
			anInt3308 += anInt3312 * anInt3307 >> 44;
			anInt3307 = anInt3307 * anInt3300 >> 12;
		}
		if (i_8_ >= -112)
			anInt3312 = 42;
	}

	public void method1012(int i) {
		anInt3308 >>= 4;
		if (anInt3308 >= 0) {
			if (anInt3308 > 255)
				anInt3308 = 255;
		} else
			anInt3308 = 0;
		anInt3307 = anInt3300;
		method1031(anInt3306++, (byte) anInt3308);
		anInt3308 = i;
	}

	public void method1013(int i) {
		if (i == -23880) {
			anInt3306 = 0;
			anInt3308 = 0;
		}
	}

	public void method1031(int i, byte i_6_) {
		aByteArray3305[i] = i_6_;
	}
}
