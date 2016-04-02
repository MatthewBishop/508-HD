/* Class14_Sub8_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Queue;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class25;

import rs.Class112;
import rs.Class115;
import rs.Class118;
import rs.Class124;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub6;
import rs.Class140;
import rs.Class141;
import rs.Class14_Sub11;
import rs.Class14_Sub13;
import rs.Class14_Sub20;
import rs.Class14_Sub25;
import rs.Class14_Sub2_Sub16;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub30;
import rs.Class14_Sub9_Sub1;
import rs.Class4;
import rs.Class51;
import rs.Class53;
import rs.Class72;
import rs.Class7_Sub3;
import rs.Class83;
import rs.Class9;
import rs.Static2;

public class Class14_Sub8_Sub27 extends Class14_Sub8 {
	public static Class124 aClass124_4538;
	public static Class124 aClass124_4541;
	public static Class124 aClass124_4545;
	public static Class124 aClass124_4552;
	public static Class124[] aClass124Array4549;
	public static Queue aClass81_4546;
	public static int anInt4547;
	public static int anInt4548;
	public static int anInt4550;
	public static int[] anIntArray4544 = new int[500];
	static {
		aClass124_4541 = Class14_Sub2_Sub2.method263(1178, "wave:");
		aClass124_4538 = aClass124_4541;
		anInt4548 = -1;
		aClass124_4545 = aClass124_4541;
		aClass124_4552 = Class14_Sub2_Sub2.method263(1178, "(Y");
		aClass81_4546 = new Queue();
	}
	public static void method621(byte i) {
		Class14_Sub13.method859(0, 5);
		Class4.method109(16, 5);
		Class14_Sub8_Sub13.method548(5, 1);
		Class140.method1957(true, 5);
		Class118.method1606(123, 5);
		Class14_Sub11.method851(1, 5);
		int i_0_ = 116 % ((i - 44) / 63);
		Static.method1130(5, 11300);
		Class141.method1960(5, 74);
		Static.method88(true, 5);
		Class53.method1215(-23980, 5);
		Class7_Sub3.method131(5, -54);
		Class133_Sub6.method1853(50, -32768);
		Class14_Sub25.method915(5, 28091);
		Class14_Sub30.method937(5, false);
		Class14_Sub8_Sub30.aClass52_4596.method1208(5);
	}

	public static Class148 method622(int i, int i_1_, Class9 class9) {
		if (i_1_ != 0) {
			Class148 class148 = null;
			return class148;
		}
		if (!Static.method1027(class9, i, (byte) 100)) {
			Class148 class148 = null;
			return class148;
		}
		Class148 class148 = Static.method1021((byte) 71);
		return class148;
	}

	public static void method623(boolean bool, Class14_Sub2_Sub16 class14_sub2_sub16) {
		if (bool)
			anInt4550 = -16;
		int i = Class14_Sub20.anInt3094;
		int i_2_ = i * 956 / 503;
		Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389((Class83.anInt1340 - i_2_) / 2, 0, i_2_, i);
		Class133_Sub1_Sub1.aClass148_4915
				.method2001((Class83.anInt1340 / 2 - (Class133_Sub1_Sub1.aClass148_4915.anInt2371) / 2), 18);
		class14_sub2_sub16.method345(Class53.aClass124_869, Class83.anInt1340 / 2, Class14_Sub20.anInt3094 / 2 - 26,
				16777215, -1);
		i = Class14_Sub20.anInt3094 / 2 - 18;
		Class25.method1003(Class83.anInt1340 / 2 - 152, i, 304, 34, 9179409);
		Class25.method1003(Class83.anInt1340 / 2 - 151, i + 1, 302, 32, 0);
		Class25.method1004(Class83.anInt1340 / 2 - 150, i + 2, Class51.anInt828 * 3, 30, 9179409);
		Class25.method1004(Class51.anInt828 * 3 + Class83.anInt1340 / 2 - 150, i + 2, -(Class51.anInt828 * 3) + 300, 30,
				0);
		class14_sub2_sub16.method345(Class14_Sub9_Sub1.aClass124_4761, Class83.anInt1340 / 2,
				Class14_Sub20.anInt3094 / 2 + 4, 16777215, -1);
	}

	public static void method624(int i) {
		aClass124_4541 = null;
		if (i != 2)
			method624(-69);
		aClass124_4552 = null;
		aClass124_4538 = null;
		aClass124Array4549 = null;
		aClass124_4545 = null;
		aClass81_4546 = null;
		anIntArray4544 = null;
	}

	public boolean aBoolean4540 = true;

	public boolean aBoolean4543 = true;

	public Class14_Sub8_Sub27() {
		super(1, false);
	}

	public int[][] method474(int i, int i_3_) {
		if (i_3_ > -4)
			method484(80, (byte) 47);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_4_ = method480(0, 0, aBoolean4540 ? -i + Class115.anInt1927 : i);
			int[] is_5_ = is_4_[1];
			int[] is_6_ = is_4_[0];
			int[] is_7_ = is_4_[2];
			int[] is_8_ = is[1];
			int[] is_9_ = is[0];
			int[] is_10_ = is[2];
			if (aBoolean4543) {
				for (int i_11_ = 0; Class112.anInt1876 > i_11_; i_11_++) {
					is_9_[i_11_] = is_6_[Static2.anInt4882 - i_11_];
					is_8_[i_11_] = is_5_[Static2.anInt4882 - i_11_];
					is_10_[i_11_] = is_7_[Static2.anInt4882 - i_11_];
				}
			} else {
				for (int i_12_ = 0; i_12_ < Class112.anInt1876; i_12_++) {
					is_9_[i_12_] = is_6_[i_12_];
					is_8_[i_12_] = is_5_[i_12_];
					is_10_[i_12_] = is_7_[i_12_];
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	public void method475(int i, int i_14_, Buffer class14_sub10) {
		int i_15_ = i;
		while_97_: do {
			do {
				if (i_15_ != 0) {
					if (i_15_ != 1) {
						if (i_15_ == 2)
							break;
						break while_97_;
					}
				} else {
					aBoolean4543 = class14_sub10.method798() == 1;
					break while_97_;
				}
				aBoolean4540 = class14_sub10.method798() == 1;
				break while_97_;
			} while (false);
			aBoolean2862 = class14_sub10.method798() == 1;
		} while (false);
		if (i_14_ != 24777)
			aClass124_4552 = null;
	}

	public int[] method484(int i, byte i_16_) {
		if (i_16_ > -58)
			aBoolean4543 = false;
		int[] is = aClass149_2851.method2014(i, (byte) 114);
		if (aClass149_2851.aBoolean2402) {
			int[] is_17_ = method483(0, (byte) -124, !aBoolean4540 ? i : -i + Class115.anInt1927);
			if (aBoolean4543) {
				for (int i_18_ = 0; Class112.anInt1876 > i_18_; i_18_++)
					is[i_18_] = is_17_[Static2.anInt4882 - i_18_];
			} else
				Class72.method1325(is_17_, 0, is, 0, Class112.anInt1876);
		}
		int[] is_19_ = is;
		return is_19_;
	}
}
