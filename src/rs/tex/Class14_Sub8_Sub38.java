/* Class14_Sub8_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;

import rs.Class112;
import rs.Class125_Sub1;
import rs.Class133_Sub5;
import rs.Class14_Sub29;
import rs.Class40;
import rs.Class51;
import rs.Class67;
import rs.Class9_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub38 extends Class14_Sub8 {
	public static PacketBuffer aClass14_Sub10_Sub1_4734 = new PacketBuffer(5000);
	public static Class9_Sub1 aClass9_Sub1_4739;
	public static int anInt4727 = 0;
	public static int anInt4729 = 0;
	public static int anInt4731;
	public static int anInt4735;
	public static int anInt4740 = 0;
	public static int anInt4741;
	public static void method674(byte i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_3_;
		if (i != 92)
			method677(-98);
		for (/**/; i_5_ <= i_4_; i_5_++)
			Class51.method1201(Static2.anIntArrayArray4038[i_5_], i_2_, i_0_, -5973, i_1_);
	}
	public static long method675(int i, int i_6_, int i_7_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_];
		if (class14_sub29 == null)
			return 0L;
		for (int i_8_ = 0; i_8_ < class14_sub29.anInt3242; i_8_++) {
			Class40 class40 = class14_sub29.aClass40Array3257[i_8_];
			if ((class40.aLong677 >> 29 & 0x3L) == 2L && class40.anInt668 == i_6_ && class40.anInt678 == i_7_)
				return class40.aLong677;
		}
		return 0L;
	}
	public static void method676(int i) {
		if (Class67.aClass97_1055 != null) {
			rs.Class97 class97 = Class67.aClass97_1055;
			synchronized (class97) {
				Class67.aClass97_1055 = null;
			}
		}
		int i_9_ = 113 / ((-19 - i) / 58);
	}

	public static void method677(int i) {
		aClass14_Sub10_Sub1_4734 = null;
		if (i <= 55)
			anInt4727 = -94;
		aClass9_Sub1_4739 = null;
	}

	public int anInt4726;

	public int anInt4732 = 204;

	public int anInt4733;

	public Class14_Sub8_Sub38() {
		super(0, true);
		anInt4726 = 1;
		anInt4733 = 1;
	}

	public void method475(int i, int i_10_, Buffer class14_sub10) {
		int i_11_ = i;
		while_18_: do {
			do {
				if (i_11_ != 0) {
					if (i_11_ != 1) {
						if (i_11_ == 2)
							break;
						break while_18_;
					}
				} else {
					anInt4733 = class14_sub10.method798();
					break while_18_;
				}
				anInt4726 = class14_sub10.method798();
				break while_18_;
			} while (false);
			anInt4732 = class14_sub10.method784((byte) 107);
		} while (false);
		if (i_10_ != 24777)
			anInt4733 = 101;
	}

	public int[] method484(int i, byte i_12_) {
		if (i_12_ > -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_13_ = 0;
			for (/**/; Class112.anInt1876 > i_13_; i_13_++) {
				int i_14_ = Class133_Sub5.anIntArray3623[i];
				int i_15_ = anInt4726 * i_14_ >> 44;
				int i_16_ = i_14_ % (4096 / anInt4726) * anInt4726;
				int i_17_ = Class14_Sub8_Sub4.anIntArray4145[i_13_];
				int i_18_ = anInt4733 * i_17_ >> 12;
				int i_19_ = anInt4733 * (i_17_ % (4096 / anInt4733));
				if (anInt4732 > i_16_) {
					for (i_18_ -= i_15_; i_18_ < 0; i_18_ += 4) {
						/* empty */
					}
					for (/**/; i_18_ > 3; i_18_ -= 4) {
						/* empty */
					}
					if (i_18_ != 1) {
						is[i_13_] = 0;
						continue;
					}
					if (anInt4732 > i_19_) {
						is[i_13_] = 0;
						continue;
					}
				}
				if (anInt4732 > i_19_) {
					for (i_18_ -= i_15_; i_18_ < 0; i_18_ += 4) {
						/* empty */
					}
					for (/**/; i_18_ > 3; i_18_ -= 4) {
						/* empty */
					}
					if (i_18_ > 0) {
						is[i_13_] = 0;
						continue;
					}
				}
				is[i_13_] = 4096;
			}
		}
		int[] is_20_ = is;
		return is_20_;
	}
}
