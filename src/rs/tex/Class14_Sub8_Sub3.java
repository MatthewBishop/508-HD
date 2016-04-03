/* Class14_Sub8_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.ref.ReferenceFactory;
import com.jagex.util.Timer;

import rs.Class112;
import rs.Class114;
import rs.Class115;
import rs.Class124;
import rs.Class128;
import rs.Class133;
import rs.Class53;
import rs.Static2;

public class Class14_Sub8_Sub3 extends Class14_Sub8 {
	public static boolean[][] aBooleanArrayArray4138;
	public static byte[][][] aByteArrayArrayArray4130;
	public static int anInt4124 = 0;
	public static int anInt4128;
	public static int anInt4132 = 0;
	public static int anInt4135 = 0;
	public static int[] anIntArray4139 = new int[128];
	public static short[] aShortArray4133 = { -4160, -4163, -8256, -8259, 22461 };
	public static void method491(int i) {
		aByteArrayArrayArray4130 = null;
		if (i == 0) {
			anIntArray4139 = null;
			aShortArray4133 = null;
			aBooleanArrayArray4138 = null;
		}
	}
	public static int method492(int i, int i_0_) {
		if (i != 11604) {
			int i_1_ = 76;
			return i_1_;
		}
		int i_2_ = i_0_ & 0xff;
		return i_2_;
	}

	public static void method493(byte i, Class124 class124, Class124 class124_3_, int i_4_, Class124 class124_5_,
			int i_6_) {
		for (int i_7_ = 99; i_7_ > 0; i_7_--) {
			Class114.anIntArray1902[i_7_] = Class114.anIntArray1902[i_7_ - 1];
			Class14_Sub8_Sub32.aClass124Array4626[i_7_] = Class14_Sub8_Sub32.aClass124Array4626[i_7_ - 1];
			Static2.aClass124Array4024[i_7_] = Static2.aClass124Array4024[i_7_ - 1];
			Class124.aClass124Array2508[i_7_] = Class124.aClass124Array2508[i_7_ - 1];
			Class133.anIntArray2176[i_7_] = Class133.anIntArray2176[i_7_ - 1];
		}
		if (i > -46)
			aByteArrayArrayArray4130 = null;
		Class14_Sub8_Sub32.aClass124Array4626[0] = class124_3_;
		Class114.anIntArray1902[0] = i_4_;
		Static2.anInt4877 = Class14_Sub8_Sub23.anInt4478;
		Class53.anInt874++;
		Static2.aClass124Array4024[0] = class124_5_;
		Class133.anIntArray2176[0] = i_6_;
		Class124.aClass124Array2508[0] = class124;
	}

	public static void method494(byte i) {
		if (Class14_Sub8_Sub9.aClass141_4239 != null) {
			rs.Class141 class141 = Class14_Sub8_Sub9.aClass141_4239;
			synchronized (class141) {
				Class14_Sub8_Sub9.aClass141_4239 = null;
			}
		}
		if (i > -64)
			method491(-123);
	}

	public static void method495(byte i, boolean bool) {
		Class53.aBoolean865 = bool;
		if (i != -47)
			method491(-27);
		Static.aBoolean2539 = !Class128.method1755(130068615);
	}

	public boolean aBoolean4126;

	public int anInt4127 = 4096;

	public Class14_Sub8_Sub3() {
		super(1, false);
		aBoolean4126 = true;
	}

	public int[][] method474(int i, int i_8_) {
		if (i_8_ > -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_9_ = method483(0, (byte) -76, Class115.anInt1927 & i - 1);
			int[] is_10_ = method483(0, (byte) -75, i);
			int[] is_11_ = method483(0, (byte) -68, i + 1 & Class115.anInt1927);
			int[] is_12_ = is[1];
			int[] is_13_ = is[0];
			int[] is_14_ = is[2];
			for (int i_15_ = 0; i_15_ < Class112.anInt1876; i_15_++) {
				int i_16_ = anInt4127 * (-is_9_[i_15_] + is_11_[i_15_]);
				int i_17_ = ((-is_10_[Static2.anInt4882 & i_15_ - 1]
						+ is_10_[Static2.anInt4882 & i_15_ + 1]) * anInt4127);
				int i_18_ = i_17_ >> 12;
				int i_19_ = i_16_ >> 12;
				int i_20_ = i_18_ * i_18_ >> 12;
				int i_21_ = i_19_ * i_19_ >> 44;
				int i_22_ = (int) (Math.sqrt((double) ((float) (i_20_ + 4096 + i_21_) / 4096.0F)) * 4096.0);
				int i_23_;
				int i_24_;
				int i_25_;
				if (i_22_ != 0) {
					i_23_ = i_17_ / i_22_;
					i_24_ = 16777216 / i_22_;
					i_25_ = i_16_ / i_22_;
				} else {
					i_23_ = 0;
					i_24_ = 0;
					i_25_ = 0;
				}
				if (aBoolean4126) {
					i_24_ = 2048 + (i_24_ >> 1);
					i_23_ = (i_23_ >> 1) + 2048;
					i_25_ = (i_25_ >> 1) + 2048;
				}
				is_13_[i_15_] = i_23_;
				is_12_[i_15_] = i_25_;
				is_14_[i_15_] = i_24_;
			}
		}
		int[][] is_26_ = is;
		return is_26_;
	}

	public void method475(int i, int i_27_, Buffer class14_sub10) {
		int i_28_ = i;
		do {
			if (i_28_ != 0) {
				if (i_28_ != 1)
					break;
			} else {
				anInt4127 = class14_sub10.readUShort((byte) 112);
				break;
			}
			aBoolean4126 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_27_ != 24777)
			method475(-114, 26, null);
	}
}
