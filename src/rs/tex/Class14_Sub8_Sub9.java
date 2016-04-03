/* Class14_Sub8_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.link.ref.SoftCache;

import rs.Class112;
import rs.Class118;
import rs.Class124;
import rs.Class125_Sub4;
import rs.Class126;
import rs.Class141;
import rs.Class14_Sub17;
import rs.Class14_Sub2_Sub2;
import rs.Class38;
import rs.Class42;
import rs.Class51;
import rs.Class59;
import rs.Class67;
import rs.Static2;
import rs.client;

public class Class14_Sub8_Sub9 extends Class14_Sub8 {
	public static Class124 aClass124_4241;
	public static Class124 aClass124_4242;
	public static Class124 aClass124_4244 = Class14_Sub2_Sub2.method263(1178, "");
	public static Class141 aClass141_4239 = new Class141();
	public static SoftCache aClass52_4240 = new SoftCache(64);
	public static HashTable aClass55_4227 = new HashTable(4096);
	public static long[] aLongArray4233 = new long[32];
	public static int anInt4243 = 0;
	static {
		aClass124_4242 = aClass124_4244;
		aClass124_4241 = aClass124_4244;
	}
	public static void method520(int i, long l) {
		if (0L != l && i == 1) {
			for (int i_0_ = 0; Class42.anInt698 > i_0_; i_0_++) {
				if (l == Class126.aLongArray2095[i_0_]) {
					Class42.anInt698--;
					for (int i_1_ = i_0_; i_1_ < Class42.anInt698; i_1_++) {
						Class126.aLongArray2095[i_1_] = Class126.aLongArray2095[i_1_ + 1];
						client.aClass124Array2645[i_1_] = client.aClass124Array2645[i_1_ + 1];
					}
					Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(2);
					Static.aClass14_Sub10_Sub1_891.method817(l, 91);
					break;
				}
			}
		}
	}
	public static boolean method521(byte i, int i_2_) {
		if (i != 77) {
			boolean bool = false;
			return bool;
		}
		boolean bool = (i_2_ & 0x10236d) >> 52 != 0;
		return bool;
	}

	public static void method522(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		int i_10_ = Class67.method1301((byte) -122, i, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_11_ = Class67.method1301((byte) 116, i_6_, Class14_Sub17.anInt3005, Class59.anInt955);
		if (i_7_ == 0) {
			int i_12_ = Class67.method1301((byte) -95, i_4_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_13_ = Class67.method1301((byte) 40, i_8_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_14_ = Class67.method1301((byte) -124, i_9_ + i, Class14_Sub17.anInt3005, Class59.anInt955);
			int i_15_ = Class67.method1301((byte) 106, i_6_ - i_9_, Class14_Sub17.anInt3005, Class59.anInt955);
			for (int i_16_ = i_10_; i_14_ > i_16_; i_16_++)
				Class51.method1201((Static2.anIntArrayArray4038[i_16_]), i_12_, i_13_, i_7_ ^ ~0x1754, i_5_);
			for (int i_17_ = i_11_; i_17_ > i_15_; i_17_--)
				Class51.method1201((Static2.anIntArrayArray4038[i_17_]), i_12_, i_13_, i_7_ - 5973, i_5_);
			int i_18_ = Class67.method1301((byte) 67, i_9_ + i_4_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_19_ = Class67.method1301((byte) -74, i_8_ - i_9_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			for (int i_20_ = i_14_; i_20_ <= i_15_; i_20_++) {
				int[] is = Static2.anIntArrayArray4038[i_20_];
				Class51.method1201(is, i_12_, i_18_, i_7_ - 5973, i_5_);
				Class51.method1201(is, i_18_, i_19_, i_7_ ^ ~0x1754, i_3_);
				Class51.method1201(is, i_19_, i_13_, -5973, i_5_);
			}
		}
	}

	public static Class125_Sub4 method523(Buffer class14_sub10, byte i) {
		if (i >= -17)
			aClass52_4240 = null;
		Class125_Sub4 class125_sub4 = new Class125_Sub4(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(46),
				class14_sub10.method829(-119), class14_sub10.readUByte());
		return class125_sub4;
	}

	public static void method524(int i) {
		aClass124_4242 = null;
		if (i == 56800372) {
			aLongArray4233 = null;
			aClass141_4239 = null;
			aClass124_4244 = null;
			aClass52_4240 = null;
			aClass124_4241 = null;
			aClass55_4227 = null;
		}
	}

	public static void method525(Class124[] class124s, int i, int i_21_, int i_22_, short[] is) {
		if (i != -25279)
			anInt4243 = -24;
		if (i_22_ < i_21_) {
			int i_23_ = i_22_;
			int i_24_ = (i_22_ + i_21_) / 2;
			Class124 class124 = class124s[i_24_];
			class124s[i_24_] = class124s[i_21_];
			class124s[i_21_] = class124;
			short i_25_ = is[i_24_];
			is[i_24_] = is[i_21_];
			is[i_21_] = i_25_;
			for (int i_26_ = i_22_; i_26_ < i_21_; i_26_++) {
				if (class124 == null || (class124s[i_26_] != null
						&& (class124s[i_26_].method1698((byte) 86, class124) < (i_26_ & 0x1)))) {
					Class124 class124_27_ = class124s[i_26_];
					class124s[i_26_] = class124s[i_23_];
					class124s[i_23_] = class124_27_;
					short i_28_ = is[i_26_];
					is[i_26_] = is[i_23_];
					is[i_23_++] = i_28_;
				}
			}
			class124s[i_21_] = class124s[i_23_];
			class124s[i_23_] = class124;
			is[i_21_] = is[i_23_];
			is[i_23_] = i_25_;
			method525(class124s, i, i_23_ - 1, i_22_, is);
			method525(class124s, i + 0, i_21_, i_23_ + 1, is);
		}
	}

	public int anInt4225 = 2048;

	public int anInt4226 = 3072;

	public int anInt4230 = 1024;

	public Class14_Sub8_Sub9() {
		super(1, false);
	}

	public void method472() {
		anInt4225 = -anInt4230 + anInt4226;
	}

	public int[][] method474(int i, int i_29_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (i_29_ >= -4)
			aClass124_4244 = null;
		if (aClass95_2838.aBoolean1628) {
			int[][] is_30_ = method480(0, 0, i);
			int[] is_31_ = is_30_[1];
			int[] is_32_ = is_30_[2];
			int[] is_33_ = is[0];
			int[] is_34_ = is[1];
			int[] is_35_ = is_30_[0];
			int[] is_36_ = is[2];
			for (int i_37_ = 0; Class112.anInt1876 > i_37_; i_37_++) {
				is_33_[i_37_] = (is_35_[i_37_] * anInt4225 >> 44) + anInt4230;
				is_34_[i_37_] = (anInt4225 * is_31_[i_37_] >> 12) + anInt4230;
				is_36_[i_37_] = (is_32_[i_37_] * anInt4225 >> 12) + anInt4230;
			}
		}
		int[][] is_38_ = is;
		return is_38_;
	}

	public void method475(int i, int i_39_, Buffer class14_sub10) {
		int i_40_ = i;
		while_215_: do {
			do {
				if (i_40_ != 0) {
					if (i_40_ != 1) {
						if (i_40_ == 2)
							break;
						break while_215_;
					}
				} else {
					anInt4230 = class14_sub10.readUShort((byte) 119);
					break while_215_;
				}
				anInt4226 = class14_sub10.readUShort((byte) 123);
				break while_215_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_39_ != 24777)
			aClass141_4239 = null;
	}

	public int[] method484(int i, byte i_41_) {
		if (i_41_ >= -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 112);
		if (aClass149_2851.aBoolean2402) {
			int[] is_42_ = method483(0, (byte) -21, i);
			for (int i_43_ = 0; Class112.anInt1876 > i_43_; i_43_++)
				is[i_43_] = (anInt4225 * is_42_[i_43_] >> 44) + anInt4230;
		}
		int[] is_44_ = is;
		return is_44_;
	}
}
