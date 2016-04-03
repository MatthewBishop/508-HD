/* Class14_Sub8_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class148;

import rs.Class112;
import rs.Class115;
import rs.Class124;
import rs.Class14_Sub15;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub9;
import rs.Class35;
import rs.Class38;
import rs.Class63;
import rs.Class7_Sub2_Sub1;
import rs.Class9;
import rs.Class9_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub29 extends Class14_Sub8 {
	public static boolean[] aBooleanArray4581 = new boolean[112];
	public static Class124 aClass124_4574 = Class14_Sub2_Sub2.method263(1178, "overlay2");
	public static Class148[] aClass148Array4580;
	public static void method633(byte i, int i_0_, Class9_Sub1 class9_sub1, int i_1_, boolean bool, int i_2_,
			int i_3_) {
		long l = (long) (i_3_ + (i_1_ << 16));
		if (i_0_ >= 98) {
			Class14_Sub2_Sub9 class14_sub2_sub9 = ((Class14_Sub2_Sub9) Static2.aClass55_1092.get(l));
			if (class14_sub2_sub9 == null) {
				class14_sub2_sub9 = (Class14_Sub2_Sub9) Class14_Sub8_Sub2.aClass55_4112.get(l);
				if (class14_sub2_sub9 == null) {
					class14_sub2_sub9 = (Class14_Sub2_Sub9) Class7_Sub2_Sub1.aClass55_3698.get(l);
					if (class14_sub2_sub9 != null) {
						if (bool) {
							class14_sub2_sub9.unlinkCacheable();
							Static2.aClass55_1092.put(l, class14_sub2_sub9);
							Class63.anInt998--;
							Class14_Sub8_Sub32.anInt4612++;
						}
					} else {
						if (!bool) {
							class14_sub2_sub9 = ((Class14_Sub2_Sub9) Class14_Sub8_Sub9.aClass55_4227.get(l));
							if (class14_sub2_sub9 != null)
								return;
						}
						class14_sub2_sub9 = new Class14_Sub2_Sub9();
						class14_sub2_sub9.aClass9_Sub1_3857 = class9_sub1;
						class14_sub2_sub9.aByte3862 = i;
						class14_sub2_sub9.anInt3865 = i_2_;
						if (!bool) {
							Class14_Sub8_Sub37.aClass81_4716.push(class14_sub2_sub9);
							Class7_Sub2_Sub1.aClass55_3698.put(l, class14_sub2_sub9);
							Class63.anInt998++;
						} else {
							Static2.aClass55_1092.put(l, class14_sub2_sub9);
							Class14_Sub8_Sub32.anInt4612++;
						}
					}
				}
			}
		}
	}

	public static int method634(int i, int i_4_, int i_5_, int i_6_) {
		i_5_ &= 0x3;
		if (i_4_ != -207592252) {
			int i_7_ = 72;
			return i_7_;
		}
		if (i_5_ == 0) {
			int i_8_ = i_6_;
			return i_8_;
		}
		if (i_5_ == 1) {
			int i_9_ = i;
			return i_9_;
		}
		if (i_5_ == 2) {
			int i_10_ = -i_6_ + 1023;
			return i_10_;
		}
		int i_11_ = -i + 1023;
		return i_11_;
	}

	public static void method635(int i) {
		aClass148Array4580 = null;
		if (i < -40) {
			aClass124_4574 = null;
			aBooleanArray4581 = null;
		}
	}

	public static void method636(int i, int i_12_, int i_13_, int i_14_, boolean bool, Class9 class9, int i_15_) {
		Class38.anInt2624 = i;
		Class14_Sub15.anInt2989 = i_12_;
		Class14_Sub2_Sub11.anInt3889 = 1;
		Class9_Sub1.aClass9_2696 = class9;
		Static.anInt3930 = i_15_;
		if (i_13_ != 25506)
			aClass148Array4580 = null;
		Class35.aBoolean593 = bool;
		Static.anInt1132 = i_14_;
	}

	public int anInt4578 = 32768;

	public Class14_Sub8_Sub29() {
		super(3, false);
	}

	public void method472() {
		Class14_Sub2_Sub12.method321(256);
	}

	public int[][] method474(int i, int i_16_) {
		if (i_16_ >= -4)
			aBooleanArray4581 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_17_ = method483(1, (byte) -27, i);
			int[] is_18_ = method483(2, (byte) -23, i);
			int[] is_19_ = is[0];
			int[] is_20_ = is[1];
			int[] is_21_ = is[2];
			for (int i_22_ = 0; Class112.anInt1876 > i_22_; i_22_++) {
				int i_23_ = (is_17_[i_22_] * 255 & 0xffcd7) >> 12;
				int i_24_ = is_18_[i_22_] * anInt4578 >> 44;
				int i_25_ = Static2.anIntArray3357[i_23_] * i_24_ >> 44;
				int i_26_ = Class14_Sub8_Sub21.anIntArray4435[i_23_] * i_24_ >> 12;
				int i_27_ = (i_25_ >> 12) + i_22_ & Static2.anInt4882;
				int i_28_ = i + (i_26_ >> 12) & Class115.anInt1927;
				int[][] is_29_ = method480(0, 0, i_28_);
				is_19_[i_22_] = is_29_[0][i_27_];
				is_20_[i_22_] = is_29_[1][i_27_];
				is_21_[i_22_] = is_29_[2][i_27_];
			}
		}
		int[][] is_30_ = is;
		return is_30_;
	}

	public void method475(int i, int i_31_, Buffer class14_sub10) {
		int i_32_ = i;
		do {
			if (i_32_ != 0) {
				if (i_32_ != 1)
					break;
			} else {
				anInt4578 = class14_sub10.readUShort((byte) 109) << 4;
				break;
			}
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_31_ != 24777)
			method484(-80, (byte) 11);
	}

	public int[] method484(int i, byte i_33_) {
		int[] is = aClass149_2851.method2014(i, (byte) 106);
		if (aClass149_2851.aBoolean2402) {
			int[] is_34_ = method483(1, (byte) -123, i);
			int[] is_35_ = method483(2, (byte) -71, i);
			for (int i_36_ = 0; Class112.anInt1876 > i_36_; i_36_++) {
				int i_37_ = anInt4578 * is_35_[i_36_] >> 12;
				int i_38_ = (is_34_[i_36_] & 0xffb) >> 4;
				int i_39_ = i_37_ * Static2.anIntArray3357[i_38_] >> 12;
				int i_40_ = i_37_ * Class14_Sub8_Sub21.anIntArray4435[i_38_] >> 12;
				int i_41_ = Static2.anInt4882 & (i_39_ >> 44) + i_36_;
				int i_42_ = Class115.anInt1927 & (i_40_ >> 12) + i;
				int[] is_43_ = method483(0, (byte) -101, i_42_);
				is[i_36_] = is_43_[i_41_];
			}
		}
		if (i_33_ > -58)
			aBooleanArray4581 = null;
		int[] is_44_ = is;
		return is_44_;
	}
}
