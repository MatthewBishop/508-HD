/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class65 {
	public int anInt1019;
	public boolean aBoolean1020 = true;
	public int anInt1022;
	public int anInt1023;
	public int anInt1024;
	public static int anInt1025;
	public static boolean aBoolean1026 = false;
	public int anInt1027;
	public int anInt1028;
	public int anInt1030;
	public static int anInt1034;

	static {
		anInt1025 = 20;
	}

	public void method1288(int i, byte i_0_, Buffer class14_sub10) {
		for (;;) {
			int i_1_ = class14_sub10.method798();
			if (i_1_ == 0)
				break;
			method1290(class14_sub10, i, (byte) 70, i_1_);
		}
		int i_2_ = 16 / ((i_0_ + 53) / 55);
	}

	public static void method1289(boolean bool) {
		if (!bool)
			method1291(39, -31, 22);
		Static2.aClass52_2370.clear();
	}

	public void method1290(Buffer class14_sub10, int i, byte i_3_, int i_4_) {
		if (i_3_ >= 57) {
			if (i_4_ == 1) {
				anInt1024 = class14_sub10.method829(-109);
				method1292(anInt1024, (byte) 87);
			} else if (i_4_ == 2) {
				anInt1030 = class14_sub10.method784((byte) 109);
				if (anInt1030 == 65535)
					anInt1030 = -1;
			} else if (i_4_ == 3)
				anInt1019 = class14_sub10.method784((byte) 103);
			else if (i_4_ == 4)
				aBoolean1020 = false;
		}
	}

	public static Class40 method1291(int i, int i_5_, int i_6_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_5_][i_6_];
		if (class14_sub29 == null)
			return null;
		for (int i_7_ = 0; i_7_ < class14_sub29.anInt3242; i_7_++) {
			Class40 class40 = class14_sub29.aClass40Array3257[i_7_];
			if ((class40.aLong677 >> 29 & 0x3L) == 2L && class40.anInt668 == i_5_ && class40.anInt678 == i_6_)
				return class40;
		}
		return null;
	}

	public void method1292(int i, byte i_8_) {
		double d = (double) (i & 0xff) / 256.0;
		double d_9_ = (double) ((i & 0xff1d) >> 8) / 256.0;
		double d_10_ = (double) (i >> 48 & 0xff) / 256.0;
		double d_11_ = d_10_;
		if (d_9_ < d_11_)
			d_11_ = d_9_;
		if (d < d_11_)
			d_11_ = d;
		double d_12_ = 0.0;
		double d_13_ = d_10_;
		if (d_13_ < d_9_)
			d_13_ = d_9_;
		if (i_8_ < 43)
			anInt1028 = -76;
		if (d > d_13_)
			d_13_ = d;
		double d_14_ = 0.0;
		double d_15_ = (d_13_ + d_11_) / 2.0;
		anInt1023 = (int) (d_15_ * 256.0);
		if (d_13_ != d_11_) {
			if (d_15_ < 0.5)
				d_14_ = (-d_11_ + d_13_) / (d_13_ + d_11_);
			if (0.5 <= d_15_)
				d_14_ = (d_13_ - d_11_) / (-d_11_ + (-d_13_ + 2.0));
			if (d_10_ != d_13_) {
				if (d_13_ == d_9_)
					d_12_ = (-d_10_ + d) / (-d_11_ + d_13_) + 2.0;
				else if (d == d_13_)
					d_12_ = (-d_9_ + d_10_) / (d_13_ - d_11_) + 4.0;
			} else
				d_12_ = (d_9_ - d) / (-d_11_ + d_13_);
		}
		d_12_ /= 6.0;
		if (d_15_ > 0.5)
			anInt1027 = (int) (d_14_ * (1.0 - d_15_) * 512.0);
		else
			anInt1027 = (int) (d_14_ * d_15_ * 512.0);
		if (anInt1027 < 1)
			anInt1027 = 1;
		if (anInt1023 < 0)
			anInt1023 = 0;
		else if (anInt1023 > 255)
			anInt1023 = 255;
		anInt1022 = (int) ((double) anInt1027 * d_12_);
		anInt1028 = (int) (d_14_ * 256.0);
		if (anInt1028 >= 0) {
			if (anInt1028 > 255)
				anInt1028 = 255;
		} else
			anInt1028 = 0;
	}

	public Class65() {
		anInt1019 = 128;
		anInt1024 = 0;
		anInt1030 = -1;
	}
}
