/* Class14_Sub8_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Date;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class25;

import rs.Class103;
import rs.Class107;
import rs.Class110;
import rs.Class112;
import rs.Class123;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class125_Sub2;
import rs.Class133;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class134;
import rs.Class137;
import rs.Class138;
import rs.Class139;
import rs.Class141;
import rs.Class146;
import rs.Class14_Sub17;
import rs.Class14_Sub20;
import rs.Class14_Sub28;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub20;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub3;
import rs.Class51;
import rs.Class54;
import rs.Class62;
import rs.Class7;
import rs.Class74;
import rs.Class7_Sub2_Sub1;
import rs.Class7_Sub3_Sub1;
import rs.Class83;
import rs.Class89;
import rs.Class9;
import rs.Class94;
import rs.Class95;
import rs.RuntimeException_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub8 extends Class14_Sub8 {
	public static boolean aBoolean4221 = false;
	public static Class124 aClass124_4224 = Class14_Sub2_Sub2.method263(1178, "m-Ochte mit Ihnen handeln)3");
	public static Class94 aClass94_4223;
	public static int anInt4217 = 1;
	public static int anInt4222 = (int) (Math.random() * 17.0) - 8;
	public static void method516(byte i) {
		if (!Class133_Sub5.aBoolean3628) {
			Class112.aClass124Array1875[0] = Class7.aClass124_180;
			Class14_Sub8_Sub38.anInt4729 = 1;
			Class14_Sub29.aShortArray3262[0] = (short) 1005;
			RuntimeException_Sub1.aClass124Array2459[0] = Class14_Sub8_Sub9.aClass124_4244;
			if (Class14_Sub8_Sub31.anInt4608 == 0) {
				if (Class7_Sub3_Sub1.anInt3714 == 0) {
					Class14_Sub8_Sub32.anInt4613 = Class107.anInt1804;
					Class14_Sub8_Sub33.anInt4629 = Class14_Sub8_Sub33.anInt4640;
				} else {
					Class14_Sub8_Sub33.anInt4629 = Class125_Sub1.anInt3367;
					Class14_Sub8_Sub32.anInt4613 = Class139.anInt2230;
				}
			} else {
				Class14_Sub8_Sub32.anInt4613 = Class95.anInt1622;
				Class14_Sub8_Sub33.anInt4629 = Static.anInt3299;
			}
		}
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Static2.method250(Class14_Sub2_Sub12.anInt3912, false);
		for (int i_0_ = 0; i_0_ < Class14_Sub17.anInt3012; i_0_++) {
			if (Class14_Sub8_Sub36.aBooleanArray4698[i_0_])
				Class7_Sub2_Sub1.aBooleanArray3703[i_0_] = true;
			Class103.aBooleanArray1727[i_0_] = Class14_Sub8_Sub36.aBooleanArray4698[i_0_];
			Class14_Sub8_Sub36.aBooleanArray4698[i_0_] = false;
		}
		Class89.aBoolean1409 = true;
		Class14_Sub8_Sub34.anInt4666 = Class14_Sub2_Sub20.anInt4064;
		Class14_Sub8_Sub24.anInt4503 = -1;
		Class138.anInt2214 = -1;
		Class141.aClass94_2239 = null;
		if (i == -107) {
			if (Class14_Sub2_Sub12.anInt3912 != -1) {
				Class14_Sub17.anInt3012 = 0;
				Class14_Sub8_Sub22.method594(Class14_Sub20.anInt3094, true, 0, Class14_Sub2_Sub12.anInt3912, -1, 0, 0,
						Class83.anInt1340, 0);
			}
			Class25.method994();
			Class14_Sub28.method928(16867);
			if (!Class133_Sub5.aBoolean3628) {
				if (Class138.anInt2214 != -1)
					Class54.method1218(Class138.anInt2214, -52, Class14_Sub8_Sub24.anInt4503);
			} else
				Class123.method1663((byte) 118);
			if (Class124.anInt2494 == 3) {
				for (int i_1_ = 0; Class14_Sub17.anInt3012 > i_1_; i_1_++) {
					if (!Class103.aBooleanArray1727[i_1_]) {
						if (Class7_Sub2_Sub1.aBooleanArray3703[i_1_])
							Class25.method1009(Class9.anIntArray215[i_1_], Class74.anIntArray1135[i_1_],
									Class110.anIntArray1854[i_1_], Class137.anIntArray2205[i_1_], 16711680, 128);
					} else
						Class25.method1009(Class9.anIntArray215[i_1_], Class74.anIntArray1135[i_1_],
								Class110.anIntArray1854[i_1_], Class137.anIntArray2205[i_1_], 16711935, 128);
				}
			}
			Class14_Sub2_Sub11.method314((byte) 64, Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436,
					Class14_Sub2_Sub3.anInt3785, Class51.anInt839, Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
			Class51.anInt839 = 0;
		}
	}
	public static Class124 method517(byte i, long l) {
		Class146.aCalendar2351.setTime(new Date(l));
		int i_2_ = Class146.aCalendar2351.get(7);
		int i_3_ = Class146.aCalendar2351.get(5);
		int i_4_ = Class146.aCalendar2351.get(2);
		int i_5_ = Class146.aCalendar2351.get(1);
		int i_6_ = Class146.aCalendar2351.get(11);
		if (i <= 122) {
			Class124 class124 = null;
			return class124;
		}
		int i_7_ = Class146.aCalendar2351.get(12);
		int i_8_ = Class146.aCalendar2351.get(13);
		Class124 class124 = (Class14_Sub8_Sub7.method515((new Class124[] { Class7.aClass124Array178[i_2_ - 1],
				Class14_Sub8_Sub26.aClass124_4529, Class83.method1407(30, i_3_ / 10),
				Class83.method1407(115, i_3_ % 10), Class14_Sub8_Sub19.aClass124_4409,
				Class133_Sub6.aClass124Array3642[i_4_], Class14_Sub8_Sub19.aClass124_4409,
				Class83.method1407(102, i_5_), Class134.aClass124_2570, Class83.method1407(12, i_6_ / 10),
				Class83.method1407(84, i_6_ % 10), Class62.aClass124_994, Class83.method1407(29, i_7_ / 10),
				Class83.method1407(48, i_7_ % 10), Class62.aClass124_994, Class83.method1407(109, i_8_ / 10),
				Class83.method1407(49, i_8_ % 10), Class125_Sub2.aClass124_3379 }), (byte) -31));
		return class124;
	}

	public static void method518(byte i) {
		aClass94_4223 = null;
		aClass124_4224 = null;
		if (i != 88)
			aClass124_4224 = null;
	}

	public static boolean method519(int i, int i_9_, int i_10_, int i_11_, int i_12_, Class133 class133, int i_13_,
			long l, boolean bool) {
		if (class133 == null)
			return true;
		int i_14_ = i_9_ - i_12_;
		int i_15_ = i_10_ - i_12_;
		int i_16_ = i_9_ + i_12_;
		int i_17_ = i_10_ + i_12_;
		if (bool) {
			if (i_13_ > 640 && i_13_ < 1408)
				i_17_ += 128;
			if (i_13_ > 1152 && i_13_ < 1920)
				i_16_ += 128;
			if (i_13_ > 1664 || i_13_ < 384)
				i_15_ -= 128;
			if (i_13_ > 128 && i_13_ < 896)
				i_14_ -= 128;
		}
		i_14_ /= 128;
		i_15_ /= 128;
		i_16_ /= 128;
		i_17_ /= 128;
		return Class14_Sub8_Sub19.method580(i, i_14_, i_15_, i_16_ - i_14_ + 1, i_17_ - i_15_ + 1, i_9_, i_10_, i_11_,
				class133, i_13_, true, l);
	}

	public int anInt4216 = 4096;

	public int anInt4220 = 0;

	public Class14_Sub8_Sub8() {
		super(1, true);
	}

	public void method475(int i, int i_18_, Buffer class14_sub10) {
		if (i_18_ != 24777)
			aClass94_4223 = null;
		int i_19_ = i;
		do {
			if (i_19_ != 0) {
				if (i_19_ != 1)
					break;
			} else {
				anInt4220 = class14_sub10.readUShort((byte) 111);
				break;
			}
			anInt4216 = class14_sub10.readUShort((byte) 107);
		} while (false);
	}

	public int[] method484(int i, byte i_20_) {
		int[] is = aClass149_2851.method2014(i, (byte) 106);
		if (i_20_ > -58)
			aClass124_4224 = null;
		if (aClass149_2851.aBoolean2402) {
			int[] is_21_ = method483(0, (byte) -16, i);
			for (int i_22_ = 0; Class112.anInt1876 > i_22_; i_22_++) {
				int i_23_ = is_21_[i_22_];
				is[i_22_] = anInt4220 > i_23_ || anInt4216 < i_23_ ? 0 : 4096;
			}
		}
		int[] is_24_ = is;
		return is_24_;
	}
}
