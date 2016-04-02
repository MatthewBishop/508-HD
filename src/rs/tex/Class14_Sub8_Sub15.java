/* Class14_Sub8_Sub15 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.io.UnsupportedEncodingException;

import com.jagex.io.Buffer;

import rs.Class104;
import rs.Class107;
import rs.Class112;
import rs.Class124;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub5;
import rs.Class134;
import rs.Class138;
import rs.Class14_Sub21;
import rs.Class38;
import rs.Class45;
import rs.Class49;
import rs.Class58;
import rs.Class9;
import rs.Class94;
import rs.RuntimeException_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub15 extends Class14_Sub8 {
	public static Class9 aClass9_4338;
	public static int anInt4332;
	public static int anInt4335 = 0;
	public static int anInt4337;
	public static int[] anIntArray4336 = new int[5];
	public static void method556(int i) {
		anIntArray4336 = null;
		aClass9_4338 = null;
		if (i <= 44)
			method558(78L, (byte) 109);
	}

	public static Class124 method557(int i, Class124 class124, Class94 class94) {
		int i_0_ = 78 / ((i - 23) / 54);
		if (class124.method1700(-19928, Class14_Sub21.aClass124_3104) != -1) {
			for (;;) {
				int i_1_ = class124.method1700(-19928, Class49.aClass124_816);
				if (i_1_ == -1)
					break;
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_1_, (byte) -104),
						Class104.method1532(4, Static.method1010(0, class94, (byte) 78)),
						class124.method1696(i_1_ + 2, 15) }), (byte) -16));
			}
			for (;;) {
				int i_2_ = class124.method1700(-19928, Class14_Sub8_Sub16.aClass124_4353);
				if (i_2_ == -1)
					break;
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_2_, (byte) -104),
						Class104.method1532(4, Static.method1010(1, class94, (byte) 76)),
						class124.method1696(i_2_ + 2, 15) }), (byte) -111));
			}
			for (;;) {
				int i_3_ = class124.method1700(-19928, Class138.aClass124_2207);
				if (i_3_ == -1)
					break;
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_3_, (byte) -104),
						Class104.method1532(4, Static.method1010(2, class94, (byte) 110)),
						class124.method1696(i_3_ + 2, 15) }), (byte) -15));
			}
			for (;;) {
				int i_4_ = class124.method1700(-19928, Class14_Sub8_Sub13.aClass124_4313);
				if (i_4_ == -1)
					break;
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_4_, (byte) -104),
						Class104.method1532(4, Static.method1010(3, class94, (byte) 103)),
						class124.method1696(i_4_ + 2, 15) }), (byte) -60));
			}
			for (;;) {
				int i_5_ = class124.method1700(-19928, Class134.aClass124_2599);
				if (i_5_ == -1)
					break;
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_5_, (byte) -104),
						Class104.method1532(4, Static.method1010(4, class94, (byte) 123)),
						class124.method1696(i_5_ + 2, 15) }), (byte) -93));
			}
			for (;;) {
				int i_6_ = class124.method1700(-19928, Static.aClass124_3314);
				if (i_6_ == -1)
					break;
				Class124 class124_7_ = Class14_Sub8_Sub9.aClass124_4244;
				if (RuntimeException_Sub1.aClass31_2458 != null) {
					class124_7_ = Class107.method1552((RuntimeException_Sub1.aClass31_2458.anInt526), 27968);
					try {
						if (RuntimeException_Sub1.aClass31_2458.anObject530 != null) {
							byte[] is = ((String) (RuntimeException_Sub1.aClass31_2458.anObject530))
									.getBytes("ISO-8859-1");
							class124_7_ = Static2.method231((byte) 114, is.length, is, 0);
						}
					} catch (UnsupportedEncodingException unsupportedencodingexception) {
						/* empty */
					}
				}
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class124.method1697(0, i_6_, (byte) -104),
						class124_7_, class124.method1696(i_6_ + 4, 15) }), (byte) -104));
			}
		}
		Class124 class124_8_ = class124;
		return class124_8_;
	}

	public static void method558(long l, byte i) {
		if (0L != l) {
			if (i != -17)
				method557(114, null, null);
			for (int i_9_ = 0; i_9_ < Static2.anInt3728; i_9_++) {
				if (Class133_Sub1_Sub2.aLongArray4951[i_9_] == l) {
					Static2.anInt3728--;
					for (int i_10_ = i_9_; Static2.anInt3728 > i_10_; i_10_++) {
						Static2.aClass124Array2938[i_10_] = Static2.aClass124Array2938[i_10_ + 1];
						Class45.anIntArray743[i_10_] = Class45.anIntArray743[i_10_ + 1];
						Static.aClass124Array3959[i_10_] = Static.aClass124Array3959[i_10_ + 1];
						Class133_Sub1_Sub2.aLongArray4951[i_10_] = Class133_Sub1_Sub2.aLongArray4951[i_10_ + 1];
						Static2.anIntArray3720[i_10_] = Static2.anIntArray3720[i_10_ + 1];
						Class58.aBooleanArray950[i_10_] = Class58.aBooleanArray950[i_10_ + 1];
					}
					Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(132);
					Static.aClass14_Sub10_Sub1_891.method817(l, i ^ ~0x49);
					break;
				}
			}
		}
	}

	public int anInt4339 = 585;

	public Class14_Sub8_Sub15() {
		super(0, true);
	}

	public void method475(int i, int i_11_, Buffer class14_sub10) {
		int i_12_ = i;
		if (i_12_ == 0)
			anInt4339 = class14_sub10.method784((byte) 115);
		if (i_11_ != 24777)
			anInt4339 = 19;
	}

	public int[] method484(int i, byte i_13_) {
		int[] is = aClass149_2851.method2014(i, (byte) 125);
		if (i_13_ > -58)
			method475(-113, -55, null);
		if (aClass149_2851.aBoolean2402) {
			int i_14_ = Class133_Sub5.anIntArray3623[i];
			for (int i_15_ = 0; Class112.anInt1876 > i_15_; i_15_++) {
				int i_16_ = Class14_Sub8_Sub4.anIntArray4145[i_15_];
				if (i_16_ > anInt4339 && i_16_ < -anInt4339 + 4096 && i_14_ > 2048 - anInt4339
						&& anInt4339 + 2048 > i_14_) {
					int i_17_ = -i_16_ + 2048;
					i_17_ = i_17_ >= 0 ? i_17_ : -i_17_;
					i_17_ <<= 12;
					i_17_ /= 2048 - anInt4339;
					is[i_15_] = -i_17_ + 4096;
				} else if (i_16_ > -anInt4339 + 2048 && anInt4339 + 2048 > i_16_) {
					int i_18_ = i_14_ - 2048;
					i_18_ = i_18_ >= 0 ? i_18_ : -i_18_;
					i_18_ -= anInt4339;
					i_18_ <<= 12;
					is[i_15_] = i_18_ / (-anInt4339 + 2048);
				} else if (i_14_ < anInt4339 || i_14_ > -anInt4339 + 4096) {
					int i_19_ = i_16_ - 2048;
					i_19_ = i_19_ >= 0 ? i_19_ : -i_19_;
					i_19_ -= anInt4339;
					i_19_ <<= 12;
					is[i_15_] = i_19_ / (-anInt4339 + 2048);
				} else if (i_16_ < anInt4339 || -anInt4339 + 4096 < i_16_) {
					int i_20_ = -i_14_ + 2048;
					i_20_ = i_20_ >= 0 ? i_20_ : -i_20_;
					i_20_ <<= 12;
					i_20_ /= -anInt4339 + 2048;
					is[i_15_] = 4096 - i_20_;
				} else
					is[i_15_] = 0;
			}
		}
		int[] is_21_ = is;
		return is_21_;
	}
}
