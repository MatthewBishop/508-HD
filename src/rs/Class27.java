/* Class27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class27 {
	public static byte[] aByteArray501 = { 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2,
			2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2,
			2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 0, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	public Buffer aClass14_Sub10_502;
	public long aLong503;
	public int anInt504;
	public int[] anIntArray505;
	public int anInt506;
	public int[] anIntArray507;
	public int[] anIntArray508;
	public int[] anIntArray509;

	public static void method1034() {
		aByteArray501 = null;
	}

	public void method1035(byte[] is) {
		aClass14_Sub10_502.payload = is;
		aClass14_Sub10_502.position = 10;
		int i = aClass14_Sub10_502.method784((byte) 102);
		anInt506 = aClass14_Sub10_502.method784((byte) 124);
		anInt504 = 500000;
		anIntArray509 = new int[i];
		int i_0_ = 0;
		while (i_0_ < i) {
			int i_1_ = aClass14_Sub10_502.method812((byte) -97);
			int i_2_ = aClass14_Sub10_502.method812((byte) -115);
			if (i_1_ == 1297379947) {
				anIntArray509[i_0_] = aClass14_Sub10_502.position;
				i_0_++;
			}
			aClass14_Sub10_502.position += i_2_;
		}
		aLong503 = 0L;
		anIntArray508 = new int[i];
		for (i_0_ = 0; i_0_ < i; i_0_++)
			anIntArray508[i_0_] = anIntArray509[i_0_];
		anIntArray507 = new int[i];
		anIntArray505 = new int[i];
	}

	public void method1036(int i) {
		anIntArray508[i] = aClass14_Sub10_502.position;
	}

	public void method1037(long l) {
		aLong503 = l;
		int i = anIntArray508.length;
		for (int i_3_ = 0; i_3_ < i; i_3_++) {
			anIntArray507[i_3_] = 0;
			anIntArray505[i_3_] = 0;
			aClass14_Sub10_502.position = anIntArray509[i_3_];
			method1042(i_3_);
			anIntArray508[i_3_] = aClass14_Sub10_502.position;
		}
	}

	public long method1038(int i) {
		return aLong503 + (long) i * (long) anInt504;
	}

	public int method1039(int i) {
		int i_4_ = method1047(i);
		return i_4_;
	}

	public int method1040(int i, int i_5_) {
		if (i_5_ == 255) {
			int i_6_ = aClass14_Sub10_502.method798();
			int i_7_ = aClass14_Sub10_502.method800(127);
			if (i_6_ == 47) {
				aClass14_Sub10_502.position += i_7_;
				return 1;
			}
			if (i_6_ == 81) {
				int i_8_ = aClass14_Sub10_502.method829(31);
				i_7_ -= 3;
				int i_9_ = anIntArray507[i];
				aLong503 += (long) i_9_ * (long) (anInt504 - i_8_);
				anInt504 = i_8_;
				aClass14_Sub10_502.position += i_7_;
				return 2;
			}
			aClass14_Sub10_502.position += i_7_;
			return 3;
		}
		byte i_10_ = aByteArray501[i_5_ - 128];
		int i_11_ = i_5_;
		if (i_10_ >= 1)
			i_11_ |= aClass14_Sub10_502.method798() << 8;
		if (i_10_ >= 2)
			i_11_ |= aClass14_Sub10_502.method798() << 16;
		return i_11_;
	}

	public boolean method1041() {
		int i = anIntArray508.length;
		for (int i_12_ = 0; i_12_ < i; i_12_++) {
			if (anIntArray508[i_12_] >= 0)
				return false;
		}
		return true;
	}

	public void method1042(int i) {
		int i_13_ = aClass14_Sub10_502.method800(127);
		anIntArray507[i] += i_13_;
	}

	public int method1043() {
		return anIntArray508.length;
	}

	public int method1044() {
		int i = anIntArray508.length;
		int i_14_ = -1;
		int i_15_ = 2147483647;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			if (anIntArray508[i_16_] >= 0 && anIntArray507[i_16_] < i_15_) {
				i_14_ = i_16_;
				i_15_ = anIntArray507[i_16_];
			}
		}
		return i_14_;
	}

	public void method1045() {
		aClass14_Sub10_502.position = -1;
	}

	public void method1046() {
		aClass14_Sub10_502.payload = null;
		anIntArray509 = null;
		anIntArray508 = null;
		anIntArray507 = null;
		anIntArray505 = null;
	}

	public int method1047(int i) {
		int i_17_ = aClass14_Sub10_502.payload[aClass14_Sub10_502.position];
		if (i_17_ < 0) {
			i_17_ &= 0xff;
			anIntArray505[i] = i_17_;
			aClass14_Sub10_502.position++;
		} else
			i_17_ = anIntArray505[i];
		if (i_17_ == 240 || i_17_ == 247) {
			int i_18_ = aClass14_Sub10_502.method800(127);
			if (i_17_ == 247 && i_18_ > 0) {
				int i_19_ = ((aClass14_Sub10_502.payload[aClass14_Sub10_502.position]) & 0xff);
				if (i_19_ >= 241 && i_19_ <= 243 || i_19_ == 246 || i_19_ == 248 || i_19_ >= 250 && i_19_ <= 252
						|| i_19_ == 254) {
					aClass14_Sub10_502.position++;
					anIntArray505[i] = i_19_;
					return method1040(i, i_19_);
				}
			}
			aClass14_Sub10_502.position += i_18_;
			return 0;
		}
		return method1040(i, i_17_);
	}

	public void method1048(int i) {
		aClass14_Sub10_502.position = anIntArray508[i];
	}

	public boolean method1049() {
		if (aClass14_Sub10_502.payload != null)
			return true;
		return false;
	}

	public Class27() {
		aClass14_Sub10_502 = new Buffer(null);
	}

	public Class27(byte[] is) {
		aClass14_Sub10_502 = new Buffer(null);
		method1035(is);
	}
}
