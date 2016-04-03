/* Class14_Sub8_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class120;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class133_Sub1;
import rs.Class14_Sub19;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub20;
import rs.Class37;
import rs.Class40;
import rs.Class96;

public class Class14_Sub8_Sub4 extends Class14_Sub8 {
	public static Class124 aClass124_4149 = Class14_Sub2_Sub2.method263(1178, " x ");
	public static Class40[] aClass40Array4143 = new Class40[100];
	public static int anInt4146 = 0;
	public static int[] anIntArray4145;
	public static byte[][][] tileFlags = new byte[4][104][104];
	public static void method496(byte i) {
		anIntArray4145 = null;
		aClass40Array4143 = null;
		if (i > 45) {
			tileFlags = null;
			aClass124_4149 = null;
		}
	}
	public static Class37 method497(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null)
			return null;
		return class14_sub29.aClass37_3255;
	}
	public static void method498(Class133_Sub1 class133_sub1, byte i) {
		int i_2_ = -Class14_Sub2_Sub20.anInt4064 + class133_sub1.anInt3494;
		class133_sub1.anInt3437 = 0;
		int i_3_ = class133_sub1.anInt3451 * 128 + class133_sub1.anInt3493 * 64;
		int i_4_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3472 * 128;
		if (class133_sub1.anInt3444 == 0)
			class133_sub1.anInt3469 = 1024;
		class133_sub1.anInt3495 += (-class133_sub1.anInt3495 + i_3_) / i_2_;
		if (class133_sub1.anInt3444 == 1)
			class133_sub1.anInt3469 = 1536;
		if (i != -82)
			method498(null, (byte) -105);
		if (class133_sub1.anInt3444 == 2)
			class133_sub1.anInt3469 = 0;
		if (class133_sub1.anInt3444 == 3)
			class133_sub1.anInt3469 = 512;
		class133_sub1.anInt3436 += (-class133_sub1.anInt3436 + i_4_) / i_2_;
	}

	public static void method499(boolean bool, int i) {
		Class96.anIntArray1630 = new int[i];
		Class120.anIntArray2008 = new int[i];
		Class14_Sub19.anIntArray3079 = new int[i];
		Class14_Sub2_Sub11.anIntArray3872 = new int[i];
		if (bool)
			method496((byte) 56);
		Class14_Sub8_Sub20.anIntArray4422 = new int[i];
	}

	public int anInt4140;

	public int anInt4144 = 4096;

	public int anInt4147 = 4096;

	public Class14_Sub8_Sub4() {
		super(1, false);
		anInt4140 = 4096;
	}

	public int[][] method474(int i, int i_5_) {
		if (i_5_ >= -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_6_ = method480(0, 0, i);
			int[] is_7_ = is_6_[1];
			int[] is_8_ = is_6_[0];
			int[] is_9_ = is[0];
			int[] is_10_ = is[1];
			int[] is_11_ = is_6_[2];
			int[] is_12_ = is[2];
			for (int i_13_ = 0; Class112.anInt1876 > i_13_; i_13_++) {
				int i_14_ = is_8_[i_13_];
				int i_15_ = is_7_[i_13_];
				int i_16_ = is_11_[i_13_];
				if (i_16_ == i_14_ && i_15_ == i_16_) {
					is_9_[i_13_] = anInt4140 * i_14_ >> 12;
					is_10_[i_13_] = anInt4144 * i_16_ >> 44;
					is_12_[i_13_] = i_15_ * anInt4147 >> 44;
				} else {
					is_9_[i_13_] = anInt4140;
					is_10_[i_13_] = anInt4144;
					is_12_[i_13_] = anInt4147;
				}
			}
		}
		int[][] is_17_ = is;
		return is_17_;
	}

	public void method475(int i, int i_18_, Buffer class14_sub10) {
		if (i_18_ != 24777)
			anInt4147 = 90;
		int i_19_ = i;
		while_201_: do {
			do {
				if (i_19_ != 0) {
					if (i_19_ != 1) {
						if (i_19_ == 2)
							break;
						break while_201_;
					}
				} else {
					anInt4140 = class14_sub10.readUShort((byte) 111);
					break while_201_;
				}
				anInt4144 = class14_sub10.readUShort((byte) 115);
				break while_201_;
			} while (false);
			anInt4147 = class14_sub10.readUShort((byte) 105);
		} while (false);
	}
}
