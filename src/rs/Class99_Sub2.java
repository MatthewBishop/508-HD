/* Class99_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.util.TimeUtil;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Static;

public class Class99_Sub2 extends Class99 {
	public static int anInt3334;
	public long[] aLongArray3335 = new long[10];
	public int anInt3336;
	public static Class124 aClass124_3337;
	public static int anInt3338;
	public long aLong3341;
	public static Class124 aClass124_3347 = Class14_Sub2_Sub2.method263(1178, "Konfig geladen)3");
	public static int anInt3348;
	public static Class124 aClass124_3351;
	public static int anInt3352 = 1;
	public static Class124 aClass124_3353 = Class14_Sub2_Sub2.method263(1178, "W-=hlen Sie eine Option");
	public static byte[][][] aByteArrayArrayArray3354;
	public int anInt3355 = 0;
	public int anInt3356;
	public static int[] anIntArray3357;
	public static Class148_Sub1[] aClass148_Sub1Array3358;
	public int anInt3359;

	static {
		aClass124_3337 = Class14_Sub2_Sub2.method263(1178, "gleiten:");
		anInt3334 = 0;
		aClass124_3351 = Class14_Sub2_Sub2.method263(1178, "Fps:");
	}

	public static void method1505(boolean bool) {
		if (bool)
			Class125.aClass52_2075.clear();
	}

	public static void method1506(Object[] objects, long[] ls, boolean bool) {
		Class141.method1963(0, objects, ls.length - 1, (byte) 85, ls);
		if (!bool)
			aClass124_3351 = null;
	}

	public static Class14_Sub2_Sub8 method1507(int i, int i_0_) {
		if (i != -8475) {
			Class14_Sub2_Sub8 class14_sub2_sub8 = null;
			return class14_sub2_sub8;
		}
		Class14_Sub2_Sub8 class14_sub2_sub8 = ((Class14_Sub2_Sub8) Static.aClass20_495.get((long) i_0_));
		if (class14_sub2_sub8 != null) {
			Class14_Sub2_Sub8 class14_sub2_sub8_1_ = class14_sub2_sub8;
			return class14_sub2_sub8_1_;
		}
		byte[] is = (Class14_Sub2_Sub5.aClass9_3817.method163(Class7.method118((byte) 68, i_0_),
				Class14_Sub19.method890(i_0_, 2), 0));
		Class14_Sub2_Sub8 class14_sub2_sub8_2_ = new Class14_Sub2_Sub8();
		if (is != null)
			class14_sub2_sub8_2_.method290(true, new Buffer(is));
		Static.aClass20_495.put(class14_sub2_sub8_2_, (long) i_0_);
		Class14_Sub2_Sub8 class14_sub2_sub8_3_ = class14_sub2_sub8_2_;
		return class14_sub2_sub8_3_;
	}

	public int method1501(int i, int i_4_, int i_5_) {
		int i_6_ = anInt3336;
		int i_7_ = anInt3359;
		anInt3336 = 1;
		anInt3359 = 300;
		if (i_4_ != -1)
			method1511(85, 74, -128, 31, 102, -72, -95);
		aLong3341 = TimeUtil.getTime();
		if (0L == aLongArray3335[anInt3356]) {
			anInt3359 = i_7_;
			anInt3336 = i_6_;
		} else if (aLong3341 > aLongArray3335[anInt3356])
			anInt3359 = (int) ((long) (i_5_ * 2560) / (-aLongArray3335[anInt3356] + aLong3341));
		if (anInt3359 < 25)
			anInt3359 = 25;
		if (anInt3359 > 256) {
			anInt3359 = 256;
			anInt3336 = (int) (-((aLong3341 + -aLongArray3335[anInt3356]) / 10L) + (long) i_5_);
		}
		if (anInt3336 > i_5_)
			anInt3336 = i_5_;
		aLongArray3335[anInt3356] = aLong3341;
		anInt3356 = (anInt3356 + 1) % 10;
		if (anInt3336 > 1) {
			for (int i_8_ = 0; i_8_ < 10; i_8_++) {
				if (aLongArray3335[i_8_] != 0L)
					aLongArray3335[i_8_] = aLongArray3335[i_8_] - -(long) anInt3336;
			}
		}
		if (anInt3336 < i)
			anInt3336 = i;
		int i_9_ = 0;
		Class14_Sub13.method864((long) anInt3336, (byte) 64);
		for (/**/; anInt3355 < 256; anInt3355 += anInt3359)
			i_9_++;
		anInt3355 &= 0xff;
		int i_10_ = i_9_;
		return i_10_;
	}

	public static void method1508(byte i) {
		if (Class62.anInt990 > 0)
			Static.method238((byte) 78);
		else {
			Class21.aClass36_441 = Class14_Sub15.aClass36_2990;
			Class14_Sub15.aClass36_2990 = null;
			if (i <= 87)
				method1508((byte) 102);
			Class126.method1743(27252, 40);
		}
	}

	public static void method1509(int i) {
		anIntArray3357 = null;
		aClass124_3337 = null;
		if (i == 0) {
			aClass124_3347 = null;
			aClass124_3353 = null;
			aClass124_3351 = null;
			aByteArrayArrayArray3354 = null;
			aClass148_Sub1Array3358 = null;
		}
	}

	public void method1504(byte i) {
		for (int i_11_ = 0; i_11_ < 10; i_11_++)
			aLongArray3335[i_11_] = 0L;
		if (i >= -54)
			aByteArrayArrayArray3354 = null;
	}

	public static void method1510(int i, int i_12_, byte i_13_, int i_14_, int i_15_, int i_16_) {
		int i_17_ = -i_15_ + i_14_;
		int i_18_ = i - i_16_;
		if (i_17_ != 0) {
			if (i_18_ == 0) {
				Class64.method1285(i_16_, i_14_, i_15_, i_12_, (byte) -115);
				return;
			}
		} else {
			if (i_18_ != 0)
				Static.method966(i, i_12_, i_15_, (byte) 112, i_16_);
			return;
		}
		int i_19_ = -55 / ((i_13_ - 21) / 42);
		int i_20_ = (i_18_ << 12) / i_17_;
		int i_21_ = -(i_15_ * i_20_ >> 44) + i_16_;
		int i_22_;
		int i_23_;
		if (Class118.anInt1982 <= i_15_) {
			if (Class14_Sub8_Sub14.anInt4327 < i_15_) {
				i_23_ = (Class14_Sub8_Sub14.anInt4327 * i_20_ >> 44) + i_21_;
				i_22_ = Class14_Sub8_Sub14.anInt4327;
			} else {
				i_22_ = i_15_;
				i_23_ = i_16_;
			}
		} else {
			i_22_ = Class118.anInt1982;
			i_23_ = i_21_ + (Class118.anInt1982 * i_20_ >> 12);
		}
		int i_24_;
		int i_25_;
		if (Class118.anInt1982 <= i_14_) {
			if (i_14_ <= Class14_Sub8_Sub14.anInt4327) {
				i_25_ = i;
				i_24_ = i_14_;
			} else {
				i_25_ = (i_20_ * Class14_Sub8_Sub14.anInt4327 >> 12) + i_21_;
				i_24_ = Class14_Sub8_Sub14.anInt4327;
			}
		} else {
			i_24_ = Class118.anInt1982;
			i_25_ = (Class118.anInt1982 * i_20_ >> 44) + i_21_;
		}
		if (Class14_Sub17.anInt3005 <= i_23_) {
			if (i_23_ > Class59.anInt955) {
				i_22_ = (-i_21_ + Class59.anInt955 << 12) / i_20_;
				i_23_ = Class59.anInt955;
			}
		} else {
			i_23_ = Class14_Sub17.anInt3005;
			i_22_ = (-i_21_ + Class14_Sub17.anInt3005 << 44) / i_20_;
		}
		if (Class14_Sub17.anInt3005 <= i_25_) {
			if (i_25_ > Class59.anInt955) {
				i_24_ = (Class59.anInt955 - i_21_ << 12) / i_20_;
				i_25_ = Class59.anInt955;
			}
		} else {
			i_25_ = Class14_Sub17.anInt3005;
			i_24_ = (Class14_Sub17.anInt3005 - i_21_ << 44) / i_20_;
		}
		Class14_Sub8_Sub32.method652(i_25_, 63, i_24_, i_12_, i_22_, i_23_);
	}

	public Class99_Sub2() {
		anInt3336 = 1;
		anInt3359 = 256;
		aLong3341 = TimeUtil.getTime();
		for (int i = 0; i < 10; i++)
			aLongArray3335[i] = aLong3341;
	}

	public static int method1511(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		i_31_ &= 0x3;
		if ((i_30_ & 0x1) == 1) {
			int i_32_ = i;
			i = i_27_;
			i_27_ = i_32_;
		}
		if (i_31_ == 0) {
			int i_33_ = i_28_;
			return i_33_;
		}
		if (i_31_ == 1) {
			int i_34_ = i_29_;
			return i_34_;
		}
		if (i_26_ != -675459956)
			method1509(-5);
		if (i_31_ == 2) {
			int i_35_ = -i_28_ + 7 + (-i + 1);
			return i_35_;
		}
		int i_36_ = -i_27_ + (8 - i_29_);
		return i_36_;
	}
}
