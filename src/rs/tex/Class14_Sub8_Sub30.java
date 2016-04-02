/* Class14_Sub8_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.awt.Container;
import java.awt.Insets;

import com.jagex.io.Buffer;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.Class121;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.util.TimeUtil;

import rs.Class112;
import rs.Class12;
import rs.Class123;
import rs.Class125;
import rs.Class125_Sub1;
import rs.Class129;
import rs.Class132;
import rs.Class133;
import rs.Class133_Sub1;
import rs.Class14_Sub11;
import rs.Class14_Sub13;
import rs.Class14_Sub14;
import rs.Class14_Sub15;
import rs.Class14_Sub19;
import rs.Class14_Sub20;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub10;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub20;
import rs.Class14_Sub2_Sub21;
import rs.Class14_Sub2_Sub8;
import rs.Class14_Sub3;
import rs.Class14_Sub30;
import rs.Class17;
import rs.Class4;
import rs.Class40;
import rs.Class43;
import rs.Class47;
import rs.Class49;
import rs.Class56_Sub1;
import rs.Class76;
import rs.Class83;
import rs.Class88;

public class Class14_Sub8_Sub30 extends Class14_Sub8 {
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4595;
	public static SoftCache aClass52_4588 = new SoftCache(50);
	public static SoftCache aClass52_4596 = new SoftCache(4);
	public static int anInt4594 = -1;
	public static int anInt4597;
	public static int anInt4598;
	public static int anInt4599 = 0;
	static {
		anInt4598 = 0;
	}
	public static void method637(Class133_Sub1 class133_sub1, int i, int i_0_) {
		if (class133_sub1.anInt3494 > Class14_Sub2_Sub20.anInt4064)
			Class14_Sub8_Sub4.method498(class133_sub1, (byte) -82);
		else if (class133_sub1.anInt3455 < Class14_Sub2_Sub20.anInt4064)
			Class14_Sub2_Sub10.method307(-125, class133_sub1);
		else
			Class14_Sub8_Sub25.method613(class133_sub1, -120);
		if (i_0_ < -4) {
			if (class133_sub1.anInt3495 < 128 || class133_sub1.anInt3436 < 128 || class133_sub1.anInt3495 >= 13184
					|| class133_sub1.anInt3436 >= 13184) {
				class133_sub1.anInt3487 = -1;
				class133_sub1.anInt3495 = (class133_sub1.anIntArray3476[0] * 128 + class133_sub1.anInt3493 * 64);
				class133_sub1.anInt3455 = 0;
				class133_sub1.anInt3494 = 0;
				class133_sub1.anInt3445 = -1;
				class133_sub1.anInt3436 = (class133_sub1.anInt3493 * 64 + class133_sub1.anIntArray3443[0] * 128);
				class133_sub1.method1794(false);
			}
			if (class133_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748
					&& (class133_sub1.anInt3495 < 1536 || class133_sub1.anInt3436 < 1536
							|| class133_sub1.anInt3495 >= 11776 || class133_sub1.anInt3436 >= 11776)) {
				class133_sub1.anInt3494 = 0;
				class133_sub1.anInt3455 = 0;
				class133_sub1.anInt3445 = -1;
				class133_sub1.anInt3495 = (class133_sub1.anInt3493 * 64 + class133_sub1.anIntArray3476[0] * 128);
				class133_sub1.anInt3436 = (class133_sub1.anIntArray3443[0] * 128 + class133_sub1.anInt3493 * 64);
				class133_sub1.anInt3487 = -1;
				class133_sub1.method1794(false);
			}
			Class47.method1183((byte) 117, class133_sub1);
			Class125.method1722(class133_sub1, (byte) -87);
		}
	}

	public static void method639(int i) {
		Class14_Sub2_Sub8.anImage3830 = null;
		Class123.aFont2063 = null;
		Class14_Sub19.aFontMetrics3081 = null;
		if (i != -1)
			aClass52_4596 = null;
	}

	public static void method640(int i) {
		aClass14_Sub2_Sub19Array4595 = null;
		if (i < 118)
			method640(14);
		aClass52_4596 = null;
		aClass52_4588 = null;
	}

	public static Class14_Sub2_Sub19_Sub1 method641(byte i) {
		int i_1_ = 71 / ((i + 32) / 55);
		int i_2_ = Class17.anIntArray402[0] * Class76.anIntArray1204[0];
		byte[] is = Class12.aByteArrayArray310[0];
		int[] is_3_ = new int[i_2_];
		for (int i_4_ = 0; i_2_ > i_4_; i_4_++)
			is_3_[i_4_] = Static.anIntArray1114[Class14_Sub8_Sub26.method617(is[i_4_], 255)];
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(Class14_Sub11.anInt2952,
				Class14_Sub30.anInt3279, Class40.anIntArray675[0], Class14_Sub2_Sub12.anIntArray3918[0],
				Class17.anIntArray402[0], Class76.anIntArray1204[0], is_3_);
		Class129.method1761((byte) 95);
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_5_ = class14_sub2_sub19_sub1;
		return class14_sub2_sub19_sub1_5_;
	}

	public static void method642(int i, int i_6_, int i_7_, int i_8_, Class133 class133, long l, boolean bool) {
		if (class133 != null) {
			Class4 class4 = new Class4();
			class4.aClass133_124 = class133;
			class4.anInt136 = i_6_ * 128 + 64;
			class4.anInt122 = i_7_ * 128 + 64;
			class4.anInt121 = i_8_;
			class4.aLong132 = l;
			class4.aBoolean133 = bool;
			if (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_] == null)
				Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_] = new Class14_Sub29(i, i_6_, i_7_);
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_].aClass4_3237 = class4;
		}
	}

	public static void method643(int i, byte i_9_) {
		Container container;
		if (Static.aFrame3962 != null)
			container = Static.aFrame3962;
		else if (Class14_Sub14.aFrame2986 == null)
			container = Class14_Sub8_Sub34.aClass43_4647.anApplet712;
		else
			container = Class14_Sub14.aFrame2986;
		Class14_Sub8_Sub32.anInt4622 = container.getSize().width;
		Class14_Sub2_Sub21.anInt4086 = container.getSize().height;
		if (Class14_Sub14.aFrame2986 == container) {
			Insets insets = Class14_Sub14.aFrame2986.getInsets();
			Class14_Sub2_Sub21.anInt4086 -= insets.top + insets.bottom;
			Class14_Sub8_Sub32.anInt4622 -= insets.right + insets.left;
		}
		if (Static.aBoolean845 || Static.aFrame3962 != null) {
			Class14_Sub20.anInt3094 = -Class14_Sub13.anInt2964 + Class14_Sub2_Sub21.anInt4086;
			Class83.anInt1340 = Class14_Sub8_Sub32.anInt4622;
			Class76.anInt1197 = Class14_Sub13.anInt2964;
			Static.anInt895 = 0;
		} else {
			Class14_Sub20.anInt3094 = 503;
			Class83.anInt1340 = 765;
			Class76.anInt1197 = Class14_Sub13.anInt2964;
			Static.anInt895 = (Class14_Sub8_Sub32.anInt4622 - 765) / 2;
		}
		Class121.method1628(Class83.anInt1340, Class14_Sub20.anInt3094);
		Class49.aCanvas819.setSize(Class83.anInt1340, Class14_Sub20.anInt3094);
		if (container == Class14_Sub14.aFrame2986) {
			Insets insets = Class14_Sub14.aFrame2986.getInsets();
			Class49.aCanvas819.setLocation(insets.left + Static.anInt895, Class76.anInt1197 + insets.top);
		} else
			Class49.aCanvas819.setLocation(Static.anInt895, Class76.anInt1197);
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Static.method1032(true, -1291652884);
		Class132.method1779(0);
		if (Class43.aString705.startsWith("mac"))
			Class132.aLong2169 = TimeUtil.getTime() - -(long) i;
		if (i_9_ > -77)
			method643(-67, (byte) 80);
		Class56_Sub1.aLong3317 = TimeUtil.getTime() - -(long) i;
		if (i == 0 && Class14_Sub15.aClass36_2990 != null
				&& (Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 25))
			Class88.method1436((byte) -92);
	}

	public int anInt4591;

	public int anInt4593 = 4;

	public Class14_Sub8_Sub30() {
		super(1, false);
		anInt4591 = 4;
	}

	public int[][] method474(int i, int i_10_) {
		if (i_10_ > -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int i_11_ = Class17.anInt407 / anInt4593;
			int i_12_ = Class112.anInt1876 / anInt4591;
			int[][] is_13_;
			if (i_11_ <= 0)
				is_13_ = method480(0, 0, 0);
			else {
				int i_14_ = i % i_11_;
				is_13_ = method480(0, 0, i_14_ * Class17.anInt407 / i_11_);
			}
			int[] is_15_ = is_13_[0];
			int[] is_16_ = is[0];
			int[] is_17_ = is_13_[1];
			int[] is_18_ = is_13_[2];
			int[] is_19_ = is[1];
			int[] is_20_ = is[2];
			for (int i_21_ = 0; i_21_ < Class112.anInt1876; i_21_++) {
				int i_22_;
				if (i_12_ > 0) {
					int i_23_ = i_21_ % i_12_;
					i_22_ = i_23_ * Class112.anInt1876 / i_12_;
				} else
					i_22_ = 0;
				is_16_[i_21_] = is_15_[i_22_];
				is_19_[i_21_] = is_17_[i_22_];
				is_20_[i_21_] = is_18_[i_22_];
			}
		}
		int[][] is_24_ = is;
		return is_24_;
	}

	public void method475(int i, int i_25_, Buffer class14_sub10) {
		if (i_25_ != 24777)
			method637(null, -14, -32);
		int i_26_ = i;
		do {
			if (i_26_ != 0) {
				if (i_26_ != 1)
					break;
			} else {
				anInt4591 = class14_sub10.method798();
				break;
			}
			anInt4593 = class14_sub10.method798();
		} while (false);
	}

	public int[] method484(int i, byte i_27_) {
		if (i_27_ >= -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_28_ = Class17.anInt407 / anInt4593;
			int i_29_ = Class112.anInt1876 / anInt4591;
			int[] is_30_;
			if (i_28_ <= 0)
				is_30_ = method483(0, (byte) -104, 0);
			else {
				int i_31_ = i % i_28_;
				is_30_ = method483(0, (byte) -91, i_31_ * Class17.anInt407 / i_28_);
			}
			for (int i_32_ = 0; i_32_ < Class112.anInt1876; i_32_++) {
				if (i_29_ > 0) {
					int i_33_ = i_32_ % i_29_;
					is[i_32_] = is_30_[i_33_ * Class112.anInt1876 / i_29_];
				} else
					is[i_32_] = is_30_[0];
			}
		}
		int[] is_34_ = is;
		return is_34_;
	}
}
