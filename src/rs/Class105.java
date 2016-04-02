/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.util.Random;

import com.jagex.io.Buffer;

public class Class105 {
	public int anInt1752;
	public int anInt1753;
	public Class145 aClass145_1754;
	public static int[] anIntArray1755;
	public Class93 aClass93_1756;
	public int[] anIntArray1757;
	public Class93 aClass93_1758;
	public Class93 aClass93_1759;
	public int[] anIntArray1760 = new int[5];
	public static int[] anIntArray1761;
	public int anInt1762 = 0;
	public static int[] anIntArray1763 = new int[32768];
	public int[] anIntArray1764;
	public Class93 aClass93_1765;
	public Class93 aClass93_1766;
	public static int[] anIntArray1767;
	public Class93 aClass93_1768;
	public static int[] anIntArray1769;
	public Class93 aClass93_1770;
	public static int[] anIntArray1771;
	public Class93 aClass93_1772;
	public Class93 aClass93_1773;
	public static int[] anIntArray1774;
	public static int[] anIntArray1775;
	public int anInt1776;

	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			anIntArray1763[i] = (random.nextInt() & 0x2) - 1;
		anIntArray1755 = new int[32768];
		for (int i = 0; i < 32768; i++)
			anIntArray1755[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		anIntArray1761 = new int[220500];
		anIntArray1767 = new int[5];
		anIntArray1771 = new int[5];
		anIntArray1769 = new int[5];
		anIntArray1775 = new int[5];
		anIntArray1774 = new int[5];
	}

	public int[] method1536(int i, int i_0_) {
		Class72.method1321(anIntArray1761, 0, i);
		if (i_0_ < 10)
			return anIntArray1761;
		double d = (double) i / ((double) i_0_ + 0.0);
		aClass93_1758.method1464();
		aClass93_1770.method1464();
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (aClass93_1765 != null) {
			aClass93_1765.method1464();
			aClass93_1756.method1464();
			i_1_ = (int) ((double) (aClass93_1765.anInt1446 - aClass93_1765.anInt1444) * 32.768 / d);
			i_2_ = (int) ((double) aClass93_1765.anInt1444 * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (aClass93_1759 != null) {
			aClass93_1759.method1464();
			aClass93_1768.method1464();
			i_4_ = (int) ((double) (aClass93_1759.anInt1446 - aClass93_1759.anInt1444) * 32.768 / d);
			i_5_ = (int) ((double) aClass93_1759.anInt1444 * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (anIntArray1757[i_7_] != 0) {
				anIntArray1775[i_7_] = 0;
				anIntArray1771[i_7_] = (int) ((double) anIntArray1764[i_7_] * d);
				anIntArray1769[i_7_] = (anIntArray1757[i_7_] << 14) / 100;
				anIntArray1774[i_7_] = (int) ((double) (aClass93_1758.anInt1446 - aClass93_1758.anInt1444) * 32.768
						* Math.pow(1.0057929410678534, (double) anIntArray1760[i_7_]) / d);
				anIntArray1767[i_7_] = (int) ((double) aClass93_1758.anInt1444 * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < i; i_8_++) {
			int i_9_ = aClass93_1758.method1465(i);
			int i_10_ = aClass93_1770.method1465(i);
			if (aClass93_1765 != null) {
				int i_11_ = aClass93_1765.method1465(i);
				int i_12_ = aClass93_1756.method1465(i);
				i_9_ += method1539(i_3_, i_12_, aClass93_1765.anInt1441) >> 1;
				i_3_ += (i_11_ * i_1_ >> 16) + i_2_;
			}
			if (aClass93_1759 != null) {
				int i_13_ = aClass93_1759.method1465(i);
				int i_14_ = aClass93_1768.method1465(i);
				i_10_ = i_10_ * ((method1539(i_6_, i_14_, aClass93_1759.anInt1441) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (anIntArray1757[i_15_] != 0) {
					int i_16_ = i_8_ + anIntArray1771[i_15_];
					if (i_16_ < i) {
						anIntArray1761[i_16_] += method1539(anIntArray1775[i_15_], i_10_ * anIntArray1769[i_15_] >> 15,
								aClass93_1758.anInt1441);
						anIntArray1775[i_15_] += ((i_9_ * anIntArray1774[i_15_] >> 16) + anIntArray1767[i_15_]);
					}
				}
			}
		}
		if (aClass93_1766 != null) {
			aClass93_1766.method1464();
			aClass93_1772.method1464();
			int i_17_ = 0;
			boolean bool = false;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < i; i_19_++) {
				int i_20_ = aClass93_1766.method1465(i);
				int i_21_ = aClass93_1772.method1465(i);
				int i_22_;
				if (bool_18_)
					i_22_ = (aClass93_1766.anInt1444
							+ ((aClass93_1766.anInt1446 - aClass93_1766.anInt1444) * i_20_ >> 8));
				else
					i_22_ = (aClass93_1766.anInt1444
							+ ((aClass93_1766.anInt1446 - aClass93_1766.anInt1444) * i_21_ >> 8));
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					anIntArray1761[i_19_] = 0;
			}
		}
		if (anInt1762 > 0 && anInt1752 > 0) {
			int i_23_ = (int) ((double) anInt1762 * d);
			for (int i_24_ = i_23_; i_24_ < i; i_24_++)
				anIntArray1761[i_24_] += anIntArray1761[i_24_ - i_23_] * anInt1752 / 100;
		}
		if (aClass145_1754.anIntArray2346[0] > 0 || aClass145_1754.anIntArray2346[1] > 0) {
			aClass93_1773.method1464();
			int i_25_ = aClass93_1773.method1465(i + 1);
			int i_26_ = aClass145_1754.method1984(0, (float) i_25_ / 65536.0F);
			int i_27_ = aClass145_1754.method1984(1, (float) i_25_ / 65536.0F);
			if (i >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > i - i_26_)
					i_29_ = i - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) anIntArray1761[i_28_ + i_26_] * (long) Class145.anInt2347) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (anIntArray1761[i_28_ + i_26_ - 1 - i_31_])
								* (long) (Class145.anIntArrayArray2345[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) anIntArray1761[i_28_ - 1 - i_32_]
								* (long) (Class145.anIntArrayArray2345[1][i_32_])) >> 16);
					anIntArray1761[i_28_] = i_30_;
					i_25_ = aClass93_1773.method1465(i + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > i - i_26_)
						i_29_ = i - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) anIntArray1761[i_28_ + i_26_] * (long) Class145.anInt2347) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (anIntArray1761[i_28_ + i_26_ - 1 - i_34_])
									* (long) (Class145.anIntArrayArray2345[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (anIntArray1761[i_28_ - 1 - i_35_])
									* (long) (Class145.anIntArrayArray2345[1][i_35_])) >> 16);
						anIntArray1761[i_28_] = i_33_;
						i_25_ = aClass93_1773.method1465(i + 1);
					}
					if (i_28_ >= i - i_26_)
						break;
					i_26_ = aClass145_1754.method1984(0, (float) i_25_ / 65536.0F);
					i_27_ = aClass145_1754.method1984(1, (float) i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < i; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - i; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (anIntArray1761[i_28_ + i_26_ - 1 - i_37_])
								* (long) (Class145.anIntArrayArray2345[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) anIntArray1761[i_28_ - 1 - i_38_]
								* (long) (Class145.anIntArrayArray2345[1][i_38_])) >> 16);
					anIntArray1761[i_28_] = i_36_;
					i_25_ = aClass93_1773.method1465(i + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < i; i_39_++) {
			if (anIntArray1761[i_39_] < -32768)
				anIntArray1761[i_39_] = -32768;
			if (anIntArray1761[i_39_] > 32767)
				anIntArray1761[i_39_] = 32767;
		}
		return anIntArray1761;
	}

	public static void method1537() {
		anIntArray1761 = null;
		anIntArray1763 = null;
		anIntArray1755 = null;
		anIntArray1775 = null;
		anIntArray1771 = null;
		anIntArray1769 = null;
		anIntArray1774 = null;
		anIntArray1767 = null;
	}

	public void method1538(Buffer class14_sub10) {
		aClass93_1758 = new Class93();
		aClass93_1758.method1467(class14_sub10);
		aClass93_1770 = new Class93();
		aClass93_1770.method1467(class14_sub10);
		int i = class14_sub10.method798();
		if (i != 0) {
			class14_sub10.position--;
			aClass93_1765 = new Class93();
			aClass93_1765.method1467(class14_sub10);
			aClass93_1756 = new Class93();
			aClass93_1756.method1467(class14_sub10);
		}
		i = class14_sub10.method798();
		if (i != 0) {
			class14_sub10.position--;
			aClass93_1759 = new Class93();
			aClass93_1759.method1467(class14_sub10);
			aClass93_1768 = new Class93();
			aClass93_1768.method1467(class14_sub10);
		}
		i = class14_sub10.method798();
		if (i != 0) {
			class14_sub10.position--;
			aClass93_1766 = new Class93();
			aClass93_1766.method1467(class14_sub10);
			aClass93_1772 = new Class93();
			aClass93_1772.method1467(class14_sub10);
		}
		for (int i_40_ = 0; i_40_ < 10; i_40_++) {
			int i_41_ = class14_sub10.method818((byte) 42);
			if (i_41_ == 0)
				break;
			anIntArray1757[i_40_] = i_41_;
			anIntArray1760[i_40_] = class14_sub10.method793();
			anIntArray1764[i_40_] = class14_sub10.method818((byte) -90);
		}
		anInt1762 = class14_sub10.method818((byte) -97);
		anInt1752 = class14_sub10.method818((byte) 108);
		anInt1753 = class14_sub10.method784((byte) 119);
		anInt1776 = class14_sub10.method784((byte) 101);
		aClass145_1754 = new Class145();
		aClass93_1773 = new Class93();
		aClass145_1754.method1988(class14_sub10, aClass93_1773);
	}

	public int method1539(int i, int i_42_, int i_43_) {
		if (i_43_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_42_;
			return -i_42_;
		}
		if (i_43_ == 2)
			return anIntArray1755[i & 0x7fff] * i_42_ >> 14;
		if (i_43_ == 3)
			return ((i & 0x7fff) * i_42_ >> 14) - i_42_;
		if (i_43_ == 4)
			return anIntArray1763[i / 2607 & 0x7fff] * i_42_;
		return 0;
	}

	public Class105() {
		anInt1752 = 100;
		anIntArray1757 = new int[5];
		anIntArray1764 = new int[5];
		anInt1776 = 0;
		anInt1753 = 500;
	}
}
