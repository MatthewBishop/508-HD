/* Class53 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Static;

public class Class53 {
	public static boolean aBoolean865 = true;
	public static short[] aShortArray866;
	public static Class124 aClass124_867 = Class14_Sub2_Sub2.method263(1178, ")1");
	public static Class124 aClass124_868;
	public static Class124 aClass124_869;
	public static boolean[][] visibilityMap;
	public static int anInt874 = 0;

	static {
		aClass124_868 = (Class14_Sub2_Sub2.method263(1178, "RuneScape is loading )2 please wait)3)3)3"));
		aClass124_869 = aClass124_868;
	}

	public static void method1212(int i) {
		aClass124_867 = null;
		aClass124_869 = null;
		visibilityMap = null;
		if (i != -1)
			method1215(-92, 50);
		aClass124_868 = null;
		aShortArray866 = null;
	}

	public static void method1213(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_, int i_6_) {
		if (i_5_ != 126)
			aClass124_867 = null;
		if (i_1_ < 128 || i_6_ < 128 || i_1_ > 13056 || i_6_ > 13056) {
			Class120.anInt2007 = -1;
			Class14_Sub8_Sub27.anInt4548 = -1;
		} else {
			int i_7_ = -i_4_ + Static.method1017(i_1_, Class14_Sub2_Sub3.anInt3785, (byte) -8, i_6_);
			i_1_ -= Class14_Sub8_Sub38.anInt4741;
			i_6_ -= Class14_Sub30.anInt3271;
			int i_8_ = Class3.sin[Class7_Sub3_Sub1.anInt3719];
			int i_9_ = Class3.cos[Class7_Sub3_Sub1.anInt3719];
			int i_10_ = Class3.sin[Class69.anInt1072];
			int i_11_ = Class3.cos[Class69.anInt1072];
			i_7_ -= Static2.anInt2926;
			int i_12_ = i_6_ * i_10_ + i_11_ * i_1_ >> 48;
			i_6_ = -(i_10_ * i_1_) + i_6_ * i_11_ >> 16;
			i_1_ = i_12_;
			i_12_ = -(i_8_ * i_6_) + i_9_ * i_7_ >> 48;
			i_6_ = i_8_ * i_7_ + i_6_ * i_9_ >> 16;
			i_7_ = i_12_;
			if (i_6_ >= 50) {
				int i_13_ = i_0_ * 512 >> 40;
				int i_14_ = i * 512 >> 8;
				Class120.anInt2007 = i_13_ * i_1_ / i_6_ + i_3_;
				Class14_Sub8_Sub27.anInt4548 = i_7_ * i_14_ / i_6_ + i_2_;
			} else {
				Class120.anInt2007 = -1;
				Class14_Sub8_Sub27.anInt4548 = -1;
			}
		}
	}

	public static Class125_Sub1 method1214(Buffer class14_sub10, byte i) {
		if (i >= -83)
			method1212(40);
		Class125_Sub1 class125_sub1 = new Class125_Sub1(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(115),
				class14_sub10.method829(100), class14_sub10.method798());
		return class125_sub1;
	}

	public static void method1215(int i, int i_15_) {
		Static2.aClass52_2370.method1208(i_15_);
		if (i != -23980)
			method1216(49);
	}

	public static void method1216(int i) {
		int i_16_ = Class123.anInt2062 * i + 64;
		int i_17_ = Class14_Sub8_Sub38.anInt4731 * 128 + 64;
		int i_18_ = (Static.method1017(i_16_, Class14_Sub2_Sub3.anInt3785, (byte) -121, i_17_)
				- Class14_Sub8_Sub23.anInt4480);
		if (Class69.anInt1071 < 100) {
			if (i_18_ > Static2.anInt2926) {
				Static2.anInt2926 += (Class69.anInt1071 * (-Static2.anInt2926 + i_18_) / 1000)
						+ Class14_Sub20.anInt3095;
				if (Static2.anInt2926 > i_18_)
					Static2.anInt2926 = i_18_;
			}
			if (i_16_ > Class14_Sub8_Sub38.anInt4741) {
				Class14_Sub8_Sub38.anInt4741 += ((Class69.anInt1071 * (-Class14_Sub8_Sub38.anInt4741 + i_16_) / 1000)
						+ Class14_Sub20.anInt3095);
				if (Class14_Sub8_Sub38.anInt4741 > i_16_)
					Class14_Sub8_Sub38.anInt4741 = i_16_;
			}
			if (Static2.anInt2926 > i_18_) {
				Static2.anInt2926 -= Class14_Sub20.anInt3095
						+ ((Static2.anInt2926 - i_18_) * Class69.anInt1071 / 1000);
				if (i_18_ > Static2.anInt2926)
					Static2.anInt2926 = i_18_;
			}
			if (i_17_ > Class14_Sub30.anInt3271) {
				Class14_Sub30.anInt3271 += Class14_Sub20.anInt3095
						+ ((-Class14_Sub30.anInt3271 + i_17_) * Class69.anInt1071 / 1000);
				if (Class14_Sub30.anInt3271 > i_17_)
					Class14_Sub30.anInt3271 = i_17_;
			}
			if (Class14_Sub30.anInt3271 > i_17_) {
				Class14_Sub30.anInt3271 -= (Class14_Sub20.anInt3095
						+ (Class69.anInt1071 * (-i_17_ + Class14_Sub30.anInt3271) / 1000));
				if (i_17_ > Class14_Sub30.anInt3271)
					Class14_Sub30.anInt3271 = i_17_;
			}
			if (i_16_ < Class14_Sub8_Sub38.anInt4741) {
				Class14_Sub8_Sub38.anInt4741 -= (Class14_Sub20.anInt3095
						+ (Class69.anInt1071 * (-i_16_ + Class14_Sub8_Sub38.anInt4741) / 1000));
				if (Class14_Sub8_Sub38.anInt4741 < i_16_)
					Class14_Sub8_Sub38.anInt4741 = i_16_;
			}
		} else {
			Class14_Sub30.anInt3271 = Class14_Sub8_Sub38.anInt4731 * 128 + 64;
			Class14_Sub8_Sub38.anInt4741 = Class123.anInt2062 * 128 + 64;
			Static2.anInt2926 = (Static.method1017(Class14_Sub8_Sub38.anInt4741, Class14_Sub2_Sub3.anInt3785,
					(byte) -123, Class14_Sub30.anInt3271) - Class14_Sub8_Sub23.anInt4480);
		}
		i_17_ = Class33.anInt577 * 128 + 64;
		i_16_ = Class117.anInt1948 * 128 + 64;
		i_18_ = (Static.method1017(i_16_, Class14_Sub2_Sub3.anInt3785, (byte) -117, i_17_)
				- Class14_Sub2_Sub9.anInt3866);
		int i_19_ = -Class14_Sub30.anInt3271 + i_17_;
		int i_20_ = i_16_ - Class14_Sub8_Sub38.anInt4741;
		int i_21_ = i_18_ - Static2.anInt2926;
		int i_22_ = (int) Math.sqrt((double) (i_19_ * i_19_ + i_20_ * i_20_));
		int i_23_ = ((int) (Math.atan2((double) i_21_, (double) i_22_) * 325.949) & 0x7ff);
		int i_24_ = ((int) (Math.atan2((double) i_20_, (double) i_19_) * -325.949) & 0x7ff);
		int i_25_ = i_24_ - Class69.anInt1072;
		if (i_25_ > 1024)
			i_25_ -= 2048;
		if (i_23_ < 128)
			i_23_ = 128;
		if (i_25_ < -1024)
			i_25_ += 2048;
		if (i_23_ > 383)
			i_23_ = 383;
		if (i_23_ > Class7_Sub3_Sub1.anInt3719) {
			Class7_Sub3_Sub1.anInt3719 += ((-Class7_Sub3_Sub1.anInt3719 + i_23_) * Class7.anInt177 / 1000)
					+ Class14_Sub29.anInt3267;
			if (Class7_Sub3_Sub1.anInt3719 > i_23_)
				Class7_Sub3_Sub1.anInt3719 = i_23_;
		}
		if (Class7_Sub3_Sub1.anInt3719 > i_23_) {
			Class7_Sub3_Sub1.anInt3719 -= (Class7.anInt177 * (-i_23_ + Class7_Sub3_Sub1.anInt3719) / 1000)
					+ Class14_Sub29.anInt3267;
			if (i_23_ > Class7_Sub3_Sub1.anInt3719)
				Class7_Sub3_Sub1.anInt3719 = i_23_;
		}
		if (i_25_ > 0) {
			Class69.anInt1072 += i_25_ * Class7.anInt177 / 1000 + Class14_Sub29.anInt3267;
			Class69.anInt1072 &= 0x7ff;
		}
		if (i_25_ < 0) {
			Class69.anInt1072 -= -i_25_ * Class7.anInt177 / 1000 + Class14_Sub29.anInt3267;
			Class69.anInt1072 &= 0x7ff;
		}
		int i_26_ = i_24_ - Class69.anInt1072;
		if (i_26_ > 1024)
			i_26_ -= 2048;
		if (i_26_ < -1024)
			i_26_ += 2048;
		if (i_26_ < 0 && i_25_ > 0 || i_26_ > 0 && i_25_ < 0)
			Class69.anInt1072 = i_24_;
	}
}
