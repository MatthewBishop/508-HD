/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class91 {
	public int anInt1429;
	public int anInt1430;
	public Class105[] aClass105Array1431;

	public byte[] method1448() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (aClass105Array1431[i_0_] != null
					&& (aClass105Array1431[i_0_].anInt1753 + aClass105Array1431[i_0_].anInt1776) > i)
				i = (aClass105Array1431[i_0_].anInt1753 + aClass105Array1431[i_0_].anInt1776);
		}
		if (i == 0)
			return new byte[0];
		int i_1_ = i * 22050 / 1000;
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (aClass105Array1431[i_2_] != null) {
				int i_3_ = aClass105Array1431[i_2_].anInt1753 * 22050 / 1000;
				int i_4_ = aClass105Array1431[i_2_].anInt1776 * 22050 / 1000;
				int[] is_5_ = aClass105Array1431[i_2_].method1536(i_3_, (aClass105Array1431[i_2_].anInt1753));
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0)
						i_7_ = i_7_ >> 31 ^ 0x7f;
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	public Class14_Sub12_Sub1 method1449() {
		byte[] is = method1448();
		return new Class14_Sub12_Sub1(22050, is, anInt1429 * 22050 / 1000, anInt1430 * 22050 / 1000);
	}

	public int method1450() {
		int i = 9999999;
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
			if (aClass105Array1431[i_8_] != null && aClass105Array1431[i_8_].anInt1776 / 20 < i)
				i = aClass105Array1431[i_8_].anInt1776 / 20;
		}
		if (anInt1429 < anInt1430 && anInt1429 / 20 < i)
			i = anInt1429 / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (aClass105Array1431[i_9_] != null)
				aClass105Array1431[i_9_].anInt1776 -= i * 20;
		}
		if (anInt1429 < anInt1430) {
			anInt1429 -= i * 20;
			anInt1430 -= i * 20;
		}
		return i;
	}

	public Class91(Buffer class14_sub10) {
		aClass105Array1431 = new Class105[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = class14_sub10.method798();
			if (i_10_ != 0) {
				class14_sub10.position--;
				aClass105Array1431[i] = new Class105();
				aClass105Array1431[i].method1538(class14_sub10);
			}
		}
		anInt1429 = class14_sub10.method784((byte) 101);
		anInt1430 = class14_sub10.method784((byte) 105);
	}

	public static Class91 method1451(Class9 class9, int i, int i_11_) {
		byte[] is = class9.method163(i_11_, i, 0);
		if (is == null)
			return null;
		return new Class91(new Buffer(is));
	}

	public Class91() {
		aClass105Array1431 = new Class105[10];
	}
}
