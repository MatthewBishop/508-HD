/* Class14_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.util.TimeUtil;

import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Static;

public class Class14_Sub9_Sub1 extends Class14_Sub9 {
	public static double aDouble4756;
	public static Class124 aClass124_4761;
	public static Class124 aClass124_4762;
	public int anInt4764;
	public int[] anIntArray4766 = new int[16];
	public static Class124 aClass124_4767;
	public static Class124 aClass124_4770;
	public int[] anIntArray4771 = new int[16];
	public int[] anIntArray4772;
	public static Class124 aClass124_4773;
	public int[] anIntArray4775;
	public int[] anIntArray4777;
	public static Class14_Sub16 aClass14_Sub16_4780;
	public HashTable aClass55_4781;
	public int[] anIntArray4784;
	public Class27 aClass27_4789;
	public static Class124 aClass124_4790 = Class14_Sub2_Sub2.method263(1178, "Free world");
	public static Class124 aClass124_4794;
	public int[] anIntArray4796;
	public int[] anIntArray4798;
	public int[] anIntArray4801;
	public static int[] anIntArray4804;
	public int[] anIntArray4805;
	public int anInt4806;
	public static Class124 aClass124_4808;
	public static Class124 aClass124_4810;
	public static Class124 aClass124_4814;
	public int[] anIntArray4815;
	public int[] anIntArray4817;
	public int[] anIntArray4819;
	public Class14_Sub18[][] aClass14_Sub18ArrayArray4823;
	public Class14_Sub18[][] aClass14_Sub18ArrayArray4825;
	public int[] anIntArray4826;
	public static int[] anIntArray4827;
	public static Class124 aClass124_4829;
	public static Class124 aClass124_4831;
	public int[] anIntArray4832;
	public int anInt4833;
	public int anInt4834;
	public Class14_Sub9_Sub3 aClass14_Sub9_Sub3_4835;
	public long aLong4836;
	public boolean aBoolean4837;
	public long aLong4838;

	static {
		aClass124_4770 = aClass124_4790;
		anIntArray4804 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
		aClass124_4794 = Class14_Sub2_Sub2.method263(1178, "Hidden");
		aClass124_4810 = Class14_Sub2_Sub2.method263(1178, "Loaded interfaces");
		aClass124_4767 = Class14_Sub2_Sub2.method263(1178, "Loaded input handler");
		aClass124_4762 = aClass124_4810;
		aClass124_4808 = aClass124_4794;
		anIntArray4827 = new int[256];
		aClass124_4814 = Class14_Sub2_Sub2.method263(1178, "settings=");
		aClass124_4773 = aClass124_4767;
		aClass124_4829 = null;
		aDouble4756 = -1.0;
		aClass124_4831 = Class14_Sub2_Sub2.method263(1178, "");
		aClass124_4761 = aClass124_4831;
	}

	public synchronized Class14_Sub9 method686() {
		Class14_Sub9 class14_sub9 = null;
		return class14_sub9;
	}

	public int method693(Class14_Sub18 class14_sub18, boolean bool) {
		int i = anIntArray4801[class14_sub18.anInt3053];
		if (!bool)
			method696((byte) 3);
		if (i >= 8192) {
			int i_0_ = (-((-class14_sub18.anInt3038 + 128) * (16384 - i) + 32 >> 6) + 16384);
			return i_0_;
		}
		int i_1_ = i * class14_sub18.anInt3038 + 32 >> 38;
		return i_1_;
	}

	public void method694(int i, int i_2_, int i_3_) {
		anIntArray4798[i_2_] = i;
		if (i_3_ < 13)
			aClass55_4781 = null;
	}

	public synchronized void method692(int i) {
		if (aClass27_4789.method1049()) {
			int i_4_ = aClass27_4789.anInt506 * anInt4806 / Class115.anInt1909;
			do {
				long l = aLong4838 + (long) i * (long) i_4_;
				if (aLong4836 - l >= 0L) {
					aLong4838 = l;
					break;
				}
				int i_5_ = (int) (((long) i_4_ + aLong4836 + (-aLong4838 + -1L)) / (long) i_4_);
				aLong4838 += (long) i_5_ * (long) i_4_;
				i -= i_5_;
				aClass14_Sub9_Sub3_4835.method692(i_5_);
				method704(-12887);
			} while (aClass27_4789.method1049());
		}
		aClass14_Sub9_Sub3_4835.method692(i);
	}

	public synchronized Class14_Sub9 method688() {
		Class14_Sub9_Sub3 class14_sub9_sub3 = aClass14_Sub9_Sub3_4835;
		return class14_sub9_sub3;
	}

	public void method695(int i, int i_6_, int i_7_) {
		anIntArray4832[i] = i_7_;
		anIntArray4777[i] = Class14_Sub8_Sub26.method617(i_7_, i_6_);
		method713(i_7_, i, 0);
	}

	public static void method696(byte i) {
		Object object = Class14_Sub8_Sub20.anObject4417;
		synchronized (object) {
			if (Class138.anInt2223 == 0)
				Class14_Sub8_Sub34.aClass43_4647.method1143(5, new Class24(), 0);
			Class138.anInt2223 = 600;
		}
		if (i != -119)
			aClass124_4790 = null;
	}

	public synchronized void method697(int i) {
		aClass27_4789.method1046();
		method707(2676);
	}

	public int method698(int i, Class14_Sub18 class14_sub18) {
		int i_8_ = ((anIntArray4771[class14_sub18.anInt3053] * anIntArray4784[class14_sub18.anInt3053]) + 4096 >> 13);
		i_8_ = i_8_ * i_8_ + 16384 >> 47;
		i_8_ = class14_sub18.anInt3046 * i_8_ + 16384 >> 15;
		Class127 class127 = class14_sub18.aClass127_3062;
		i_8_ = i_8_ * anInt4764 + 128 >> 40;
		if (i != -627246801) {
			int i_9_ = -49;
			return i_9_;
		}
		if (class127.anInt2097 > 0)
			i_8_ = (int) (((double) i_8_
					* Math.pow(0.5, ((double) class127.anInt2097 * ((double) class14_sub18.anInt3040 * 1.953125E-5))))
					+ 0.5);
		if (class127.aByteArray2109 != null) {
			int i_10_ = class14_sub18.anInt3058;
			int i_11_ = class127.aByteArray2109[class14_sub18.anInt3045 + 1];
			if (class127.aByteArray2109.length - 2 > class14_sub18.anInt3045) {
				int i_12_ = ((class127.aByteArray2109[class14_sub18.anInt3045 + 2] << 40) & 0xff00);
				int i_13_ = ((class127.aByteArray2109[class14_sub18.anInt3045] & 0xff) << 8);
				i_11_ += ((-i_11_ + (class127.aByteArray2109[class14_sub18.anInt3045 + 3])) * (-i_13_ + i_10_)
						/ (-i_13_ + i_12_));
			}
			i_8_ = i_11_ * i_8_ + 32 >> 6;
		}
		if (class14_sub18.anInt3041 > 0 && class127.aByteArray2098 != null) {
			int i_14_ = class14_sub18.anInt3041;
			int i_15_ = class127.aByteArray2098[class14_sub18.anInt3035 + 1];
			if (class127.aByteArray2098.length - 2 > class14_sub18.anInt3035) {
				int i_16_ = ((class127.aByteArray2098[class14_sub18.anInt3035 + 2] & 0xff) << 8);
				int i_17_ = (class127.aByteArray2098[class14_sub18.anInt3035] << 8 & 0xff00);
				i_15_ += ((-i_17_ + i_14_) * (-i_15_ + (class127.aByteArray2098[class14_sub18.anInt3035 + 3]))
						/ (-i_17_ + i_16_));
			}
			i_8_ = i_8_ * i_15_ + 32 >> 6;
		}
		int i_18_ = i_8_;
		return i_18_;
	}

	public void method699(int i, int i_19_, int i_20_, int i_21_) {
		method722(-31396, 64, i_19_, i);
		if ((anIntArray4817[i_19_] & 0x2) != 0) {
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method83()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.method76())) {
				if (i_19_ == class14_sub18.anInt3053 && class14_sub18.anInt3041 < 0) {
					aClass14_Sub18ArrayArray4823[i_19_][(class14_sub18.anInt3037)] = null;
					aClass14_Sub18ArrayArray4823[i_19_][i] = class14_sub18;
					int i_22_ = ((class14_sub18.anInt3056 * class14_sub18.anInt3063 >> 44) + class14_sub18.anInt3052);
					class14_sub18.anInt3052 += i - class14_sub18.anInt3037 << 40;
					class14_sub18.anInt3056 = -class14_sub18.anInt3052 + i_22_;
					class14_sub18.anInt3063 = 4096;
					class14_sub18.anInt3037 = i;
					return;
				}
			}
		}
		Class14_Sub28 class14_sub28 = ((Class14_Sub28) aClass55_4781.get((long) anIntArray4775[i_19_]));
		if (class14_sub28 != null) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = class14_sub28.aClass14_Sub12_Sub1Array3212[i];
			if (class14_sub12_sub1 != null) {
				Class14_Sub18 class14_sub18 = new Class14_Sub18();
				class14_sub18.anInt3053 = i_19_;
				class14_sub18.aClass14_Sub12_Sub1_3059 = class14_sub12_sub1;
				class14_sub18.aClass14_Sub28_3054 = class14_sub28;
				class14_sub18.aClass127_3062 = class14_sub28.aClass127Array3221[i];
				class14_sub18.anInt3039 = class14_sub28.aByteArray3220[i];
				class14_sub18.anInt3037 = i;
				class14_sub18.anInt3046 = (class14_sub28.aByteArray3213[i] * i_21_ * (i_21_ * class14_sub28.anInt3224))
						+ 1024 >> 43;
				class14_sub18.anInt3038 = class14_sub28.aByteArray3227[i] & 0xff;
				if (i_20_ <= 77)
					method694(-62, -34, -49);
				class14_sub18.anInt3052 = (i << 8) - (class14_sub28.aShortArray3223[i] & 0x7fff);
				class14_sub18.anInt3058 = 0;
				class14_sub18.anInt3045 = 0;
				class14_sub18.anInt3040 = 0;
				class14_sub18.anInt3035 = 0;
				class14_sub18.anInt3041 = -1;
				if (anIntArray4826[i_19_] == 0)
					class14_sub18.aClass14_Sub9_Sub4_3051 = Class14_Sub9_Sub4.method763(class14_sub12_sub1,
							method718(class14_sub18, -128), method698(-627246801, class14_sub18),
							method693(class14_sub18, true));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = Class14_Sub9_Sub4.method763(class14_sub12_sub1,
							method718(class14_sub18, -113), 0, method693(class14_sub18, true));
					method705(106, class14_sub18, class14_sub28.aShortArray3223[i] < 0);
				}
				if (class14_sub28.aShortArray3223[i] < 0)
					class14_sub18.aClass14_Sub9_Sub4_3051.method765(-1);
				if (class14_sub18.anInt3039 >= 0) {
					Class14_Sub18 class14_sub18_23_ = (aClass14_Sub18ArrayArray4825[i_19_][class14_sub18.anInt3039]);
					if (class14_sub18_23_ != null && class14_sub18_23_.anInt3041 < 0) {
						aClass14_Sub18ArrayArray4823[i_19_][(class14_sub18_23_.anInt3037)] = null;
						class14_sub18_23_.anInt3041 = 0;
					}
					aClass14_Sub18ArrayArray4825[i_19_][(class14_sub18.anInt3039)] = class14_sub18;
				}
				aClass14_Sub9_Sub3_4835.aClass2_4858.method80(class14_sub18);
				aClass14_Sub18ArrayArray4823[i_19_][i] = class14_sub18;
			}
		}
	}

	public static void method700(int i, int i_24_, int i_25_) {
		if (i_24_ >= -100)
			aDouble4756 = -0.8864850902319418;
		Class14_Sub8_Sub11.anIntArray4275[i] = i_25_;
		Class14_Sub13 class14_sub13 = ((Class14_Sub13) Static.aClass55_92.get((long) i));
		if (class14_sub13 == null) {
			class14_sub13 = new Class14_Sub13(TimeUtil.getTime() - -500L);
			Static.aClass55_92.put((long) i, class14_sub13);
		} else
			class14_sub13.aLong2963 = TimeUtil.getTime() - -500L;
	}

	public void method701(byte i, int i_26_, int i_27_) {
		if (i != 73)
			anIntArray4826 = null;
	}

	public synchronized void method702(int i, int i_28_, int i_29_) {
		method695(i_28_, -128, i_29_);
		if (i != 0)
			aClass55_4781 = null;
	}

	public static void method703(boolean bool) {
		if (bool)
			aDouble4756 = -0.6316306604150126;
		aClass124_4808 = null;
		aClass124_4829 = null;
		aClass124_4767 = null;
		anIntArray4804 = null;
		aClass124_4762 = null;
		aClass124_4810 = null;
		aClass124_4831 = null;
		aClass124_4773 = null;
		anIntArray4827 = null;
		aClass124_4770 = null;
		aClass14_Sub16_4780 = null;
		aClass124_4761 = null;
		aClass124_4790 = null;
		aClass124_4794 = null;
		aClass124_4814 = null;
	}

	public void method704(int i) {
		if (i != -12887)
			anInt4764 = -71;
		int i_30_ = anInt4834;
		int i_31_ = anInt4833;
		long l = aLong4836;
		while (anInt4833 == i_31_) {
			while (aClass27_4789.anIntArray507[i_30_] == i_31_) {
				aClass27_4789.method1048(i_30_);
				int i_32_ = aClass27_4789.method1039(i_30_);
				if (i_32_ == 1) {
					aClass27_4789.method1045();
					aClass27_4789.method1036(i_30_);
					if (aClass27_4789.method1041()) {
						if (aBoolean4837 && i_31_ != 0)
							aClass27_4789.method1037(l);
						else {
							method707(2676);
							aClass27_4789.method1046();
							return;
						}
					}
					break;
				}
				if ((i_32_ & 0x80) != 0)
					method717(true, i_32_);
				aClass27_4789.method1042(i_30_);
				aClass27_4789.method1036(i_30_);
			}
			i_30_ = aClass27_4789.method1044();
			i_31_ = aClass27_4789.anIntArray507[i_30_];
			l = aClass27_4789.method1038(i_31_);
		}
		anInt4833 = i_31_;
		aLong4836 = l;
		anInt4834 = i_30_;
	}

	public void method705(int i, Class14_Sub18 class14_sub18, boolean bool) {
		int i_33_ = 10 % ((70 - i) / 35);
		int i_34_ = class14_sub18.aClass14_Sub12_Sub1_3059.aByteArray4899.length;
		int i_35_;
		if (!bool || !class14_sub18.aClass14_Sub12_Sub1_3059.aBoolean4897)
			i_35_ = (int) (((long) anIntArray4826[class14_sub18.anInt3053] * (long) i_34_) >> 6);
		else {
			int i_36_ = (i_34_ + i_34_ - class14_sub18.aClass14_Sub12_Sub1_3059.anInt4896);
			i_34_ <<= 8;
			i_35_ = (int) (((long) i_36_ * (long) anIntArray4826[class14_sub18.anInt3053]) >> 6);
			if (i_35_ >= i_34_) {
				class14_sub18.aClass14_Sub9_Sub4_3051.method779(true);
				i_35_ = i_34_ + i_34_ - 1 - i_35_;
			}
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method778(i_35_);
	}

	public synchronized boolean method706(int i, Class14_Sub16 class14_sub16, int i_37_, Class9 class9,
			Class120 class120) {
		int i_38_ = 91 / ((24 - i_37_) / 62);
		class14_sub16.method877();
		boolean bool = true;
		int[] is = null;
		if (i > 0)
			is = new int[] { i };
		for (Class14_Sub17 class14_sub17 = ((Class14_Sub17) class14_sub16.aClass55_3003.getFirst()); class14_sub17 != null; class14_sub17 = (Class14_Sub17) class14_sub16.aClass55_3003
						.getNext()) {
			int i_39_ = (int) class14_sub17.key;
			Class14_Sub28 class14_sub28 = ((Class14_Sub28) aClass55_4781.get((long) i_39_));
			if (class14_sub28 == null) {
				class14_sub28 = Class14_Sub2_Sub5.method285(i_39_, class9, (byte) 98);
				if (class14_sub28 == null) {
					bool = false;
					continue;
				}
				aClass55_4781.put((long) i_39_, class14_sub28);
			}
			if (!class14_sub28.method927(is, class120, true, class14_sub17.aByteArray3011))
				bool = false;
		}
		if (bool)
			class14_sub16.method876();
		boolean bool_40_ = bool;
		return bool_40_;
	}

	public void method707(int i) {
		method720(-1, 121);
		method724(-1, -25515);
		for (int i_41_ = 0; i_41_ < 16; i_41_++)
			anIntArray4775[i_41_] = anIntArray4832[i_41_];
		if (i == 2676) {
			for (int i_42_ = 0; i_42_ < 16; i_42_++)
				anIntArray4777[i_42_] = Class14_Sub8_Sub26.method617(anIntArray4832[i_42_], -128);
		}
	}

	public synchronized int method690() {
		int i = 0;
		return i;
	}

	public static void method708(byte[] is, int i) {
		Buffer class14_sub10 = new Buffer(is);
		class14_sub10.position = is.length - 2;
		Class32.anInt547 = class14_sub10.method784((byte) 123);
		Class98.aByteArrayArray1667 = new byte[Class32.anInt547][];
		Class12.aByteArrayArray310 = new byte[Class32.anInt547][];
		Class14_Sub2_Sub12.anIntArray3918 = new int[Class32.anInt547];
		Class40.anIntArray675 = new int[Class32.anInt547];
		Class76.anIntArray1204 = new int[Class32.anInt547];
		Class125_Sub4.aBooleanArray3416 = new boolean[Class32.anInt547];
		Class17.anIntArray402 = new int[Class32.anInt547];
		class14_sub10.position = is.length - (Class32.anInt547 * 8 + 7);
		Class14_Sub11.anInt2952 = class14_sub10.method784((byte) 105);
		Class14_Sub30.anInt3279 = class14_sub10.method784((byte) 116);
		int i_43_ = (class14_sub10.method798() & 0xff) + 1;
		for (int i_44_ = 0; i_44_ < Class32.anInt547; i_44_++)
			Class40.anIntArray675[i_44_] = class14_sub10.method784((byte) 123);
		for (int i_45_ = 0; Class32.anInt547 > i_45_; i_45_++)
			Class14_Sub2_Sub12.anIntArray3918[i_45_] = class14_sub10.method784((byte) 112);
		int i_46_ = 0;
		if (i != 144)
			method703(true);
		for (/**/; i_46_ < Class32.anInt547; i_46_++)
			Class17.anIntArray402[i_46_] = class14_sub10.method784((byte) 126);
		for (i_46_ = 0; i_46_ < Class32.anInt547; i_46_++)
			Class76.anIntArray1204[i_46_] = class14_sub10.method784((byte) 114);
		class14_sub10.position = -(Class32.anInt547 * 8) + is.length - (7 + (i_43_ - 1) * 3);
		Static.anIntArray1114 = new int[i_43_];
		for (i_46_ = 1; i_46_ < i_43_; i_46_++) {
			Static.anIntArray1114[i_46_] = class14_sub10.method829(i - 30);
			if (Static.anIntArray1114[i_46_] == 0)
				Static.anIntArray1114[i_46_] = 1;
		}
		class14_sub10.position = 0;
		for (i_46_ = 0; Class32.anInt547 > i_46_; i_46_++) {
			int i_47_ = Class17.anIntArray402[i_46_];
			boolean bool = false;
			int i_48_ = Class76.anIntArray1204[i_46_];
			int i_49_ = i_48_ * i_47_;
			byte[] is_50_ = new byte[i_49_];
			byte[] is_51_ = new byte[i_49_];
			Class12.aByteArrayArray310[i_46_] = is_51_;
			Class98.aByteArrayArray1667[i_46_] = is_50_;
			int i_52_ = class14_sub10.method798();
			if ((i_52_ & 0x1) == 0) {
				for (int i_53_ = 0; i_53_ < i_49_; i_53_++)
					is_51_[i_53_] = class14_sub10.method780((byte) -77);
				if ((i_52_ & 0x2) != 0) {
					for (int i_54_ = 0; i_54_ < i_49_; i_54_++) {
						byte i_55_ = (is_50_[i_54_] = class14_sub10.method780((byte) -77));
						bool = bool | i_55_ != -1;
					}
				}
			} else {
				for (int i_56_ = 0; i_47_ > i_56_; i_56_++) {
					for (int i_57_ = 0; i_48_ > i_57_; i_57_++)
						is_51_[i_56_ + i_57_ * i_47_] = class14_sub10.method780((byte) -77);
				}
				if ((i_52_ & 0x2) != 0) {
					for (int i_58_ = 0; i_47_ > i_58_; i_58_++) {
						for (int i_59_ = 0; i_48_ > i_59_; i_59_++) {
							byte i_60_ = (is_50_[i_47_ * i_59_ + i_58_] = class14_sub10.method780((byte) -77));
							bool = bool | i_60_ != -1;
						}
					}
				}
			}
			Class125_Sub4.aBooleanArray3416[i_46_] = bool;
		}
	}

	public synchronized void method687(int[] is, int i, int i_61_) {
		if (aClass27_4789.method1049()) {
			int i_62_ = aClass27_4789.anInt506 * anInt4806 / Class115.anInt1909;
			do {
				long l = aLong4838 - -((long) i_61_ * (long) i_62_);
				if (aLong4836 + -l >= 0L) {
					aLong4838 = l;
					break;
				}
				int i_63_ = (int) (((long) i_62_ + aLong4836 + -aLong4838 + -1L) / (long) i_62_);
				aLong4838 += (long) i_63_ * (long) i_62_;
				i_61_ -= i_63_;
				aClass14_Sub9_Sub3_4835.method687(is, i, i_63_);
				method704(-12887);
				i += i_63_;
			} while (aClass27_4789.method1049());
		}
		aClass14_Sub9_Sub3_4835.method687(is, i, i_61_);
	}

	public void method709(int i, int i_64_) {
		if ((anIntArray4817[i_64_] & 0x4) != 0) {
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method77()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.method84())) {
				if (i_64_ == class14_sub18.anInt3053)
					class14_sub18.anInt3044 = 0;
			}
		}
		int i_65_ = 76 % ((i - 32) / 61);
	}

	public synchronized void method710(int i, int i_66_) {
		anInt4764 = i_66_;
	}

	public static Class method711(String string, int i) throws ClassNotFoundException {
		if (string.equals("B")) {
			Class var_class = Byte.TYPE;
			return var_class;
		}
		if (string.equals("I")) {
			Class var_class = Integer.TYPE;
			return var_class;
		}
		if (string.equals("S")) {
			Class var_class = Short.TYPE;
			return var_class;
		}
		int i_67_ = 90 / ((i + 37) / 63);
		if (string.equals("J")) {
			Class var_class = Long.TYPE;
			return var_class;
		}
		if (string.equals("Z")) {
			Class var_class = Boolean.TYPE;
			return var_class;
		}
		if (string.equals("F")) {
			Class var_class = Float.TYPE;
			return var_class;
		}
		if (string.equals("D")) {
			Class var_class = Double.TYPE;
			return var_class;
		}
		if (string.equals("C")) {
			Class var_class = Character.TYPE;
			return var_class;
		}
		Class var_class = Class.forName(string);
		return var_class;
	}

	public void method712(int i, int i_68_) {
		for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method77()); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
						.method84()) {
			if ((i < 0 || i == class14_sub18.anInt3053) && class14_sub18.anInt3041 < 0) {
				aClass14_Sub18ArrayArray4823[class14_sub18.anInt3053][class14_sub18.anInt3037] = null;
				class14_sub18.anInt3041 = 0;
			}
		}
	}

	public void method713(int i, int i_69_, int i_70_) {
		if (i_70_ != 0)
			aClass124_4829 = null;
		if (i != anIntArray4775[i_69_]) {
			anIntArray4775[i_69_] = i;
			for (int i_71_ = 0; i_71_ < 128; i_71_++)
				aClass14_Sub18ArrayArray4825[i_69_][i_71_] = null;
		}
	}

	public void method714(int i, int i_72_, int i_73_, int i_74_) {
		if (i_74_ != 2)
			method728(45, -59);
	}

	public synchronized void method715(int i) {
		for (Class14_Sub28 class14_sub28 = (Class14_Sub28) aClass55_4781
				.getFirst(); class14_sub28 != null; class14_sub28 = (Class14_Sub28) aClass55_4781
						.getNext())
			class14_sub28.method929((byte) -104);
		if (i != -22255)
			method704(83);
	}

	public synchronized void method716(byte i) {
		for (Class14_Sub28 class14_sub28 = (Class14_Sub28) aClass55_4781
				.getFirst(); class14_sub28 != null; class14_sub28 = (Class14_Sub28) aClass55_4781
						.getNext())
			class14_sub28.unlink();
		if (i >= -42)
			method694(-113, 27, -27);
	}

	public void method717(boolean bool, int i) {
		int i_75_ = i & 0xf0;
		if (i_75_ == 128) {
			int i_76_ = i & 0xf;
			int i_77_ = i >> 8 & 0x7f;
			int i_78_ = (i & 0x7f070a) >> 16;
			method722(-31396, i_78_, i_76_, i_77_);
		} else if (i_75_ == 144) {
			int i_79_ = i & 0xf;
			int i_80_ = (i & 0x7feb) >> 8;
			int i_81_ = (i & 0x7f6820) >> 48;
			if (i_81_ <= 0)
				method722(-31396, 64, i_79_, i_80_);
			else
				method699(i_80_, i_79_, 115, i_81_);
		} else if (i_75_ == 160) {
			int i_82_ = i & 0xf;
			int i_83_ = (i & 0x7fdc) >> 40;
			int i_84_ = i >> 48 & 0x7f;
			method714(i_82_, i_83_, i_84_, 2);
		} else if (bool) {
			if (i_75_ == 176) {
				int i_85_ = (i & 0x7ff2) >> 40;
				int i_86_ = i & 0xf;
				int i_87_ = i >> 16 & 0x7f;
				if (i_85_ == 0)
					anIntArray4777[i_86_] = ((i_87_ << 14)
							+ Class14_Sub8_Sub26.method617(anIntArray4777[i_86_], -2080769));
				if (i_85_ == 32)
					anIntArray4777[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4777[i_86_], -16257) + (i_87_ << 7);
				if (i_85_ == 1)
					anIntArray4819[i_86_] = ((i_87_ << 7)
							+ Class14_Sub8_Sub26.method617(anIntArray4819[i_86_], -16257));
				if (i_85_ == 33)
					anIntArray4819[i_86_] = (Class14_Sub8_Sub26.method617(-128, anIntArray4819[i_86_]) + i_87_);
				if (i_85_ == 5)
					anIntArray4805[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4805[i_86_], -16257) + (i_87_ << 7);
				if (i_85_ == 37)
					anIntArray4805[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4805[i_86_], -128) + i_87_;
				if (i_85_ == 7)
					anIntArray4771[i_86_] = ((i_87_ << 7)
							+ Class14_Sub8_Sub26.method617(anIntArray4771[i_86_], -16257));
				if (i_85_ == 39)
					anIntArray4771[i_86_] = i_87_ + Class14_Sub8_Sub26.method617(anIntArray4771[i_86_], -128);
				if (i_85_ == 10)
					anIntArray4801[i_86_] = (Class14_Sub8_Sub26.method617(-16257, anIntArray4801[i_86_])
							+ (i_87_ << 39));
				if (i_85_ == 42)
					anIntArray4801[i_86_] = (Class14_Sub8_Sub26.method617(-128, anIntArray4801[i_86_]) + i_87_);
				if (i_85_ == 11)
					anIntArray4784[i_86_] = ((i_87_ << 7)
							+ Class14_Sub8_Sub26.method617(anIntArray4784[i_86_], -16257));
				if (i_85_ == 43)
					anIntArray4784[i_86_] = (Class14_Sub8_Sub26.method617(-128, anIntArray4784[i_86_]) + i_87_);
				if (i_85_ == 64) {
					if (i_87_ >= 64)
						anIntArray4817[i_86_] = Class66.method1294(anIntArray4817[i_86_], 1);
					else
						anIntArray4817[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4817[i_86_], -2);
				}
				if (i_85_ == 65) {
					if (i_87_ < 64) {
						method728(101, i_86_);
						anIntArray4817[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4817[i_86_], -3);
					} else
						anIntArray4817[i_86_] = Class66.method1294(anIntArray4817[i_86_], 2);
				}
				if (i_85_ == 99)
					anIntArray4772[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4772[i_86_], 127) + (i_87_ << 7);
				if (i_85_ == 98)
					anIntArray4772[i_86_] = i_87_ + Class14_Sub8_Sub26.method617(16256, anIntArray4772[i_86_]);
				if (i_85_ == 101)
					anIntArray4772[i_86_] = (Class14_Sub8_Sub26.method617(127, anIntArray4772[i_86_]) + 16384
							+ (i_87_ << 7));
				if (i_85_ == 100)
					anIntArray4772[i_86_] = (i_87_ + 16384
							+ Class14_Sub8_Sub26.method617(16256, anIntArray4772[i_86_]));
				if (i_85_ == 120)
					method720(i_86_, 110);
				if (i_85_ == 121)
					method724(i_86_, -25515);
				if (i_85_ == 123)
					method712(i_86_, -654583480);
				if (i_85_ == 6) {
					int i_88_ = anIntArray4772[i_86_];
					if (i_88_ == 16384)
						anIntArray4815[i_86_] = (Class14_Sub8_Sub26.method617(anIntArray4815[i_86_], -16257)
								+ (i_87_ << 39));
				}
				if (i_85_ == 38) {
					int i_89_ = anIntArray4772[i_86_];
					if (i_89_ == 16384)
						anIntArray4815[i_86_] = (i_87_ + Class14_Sub8_Sub26.method617(anIntArray4815[i_86_], -128));
				}
				if (i_85_ == 16)
					anIntArray4826[i_86_] = (Class14_Sub8_Sub26.method617(-16257, anIntArray4826[i_86_])
							+ (i_87_ << 39));
				if (i_85_ == 48)
					anIntArray4826[i_86_] = (Class14_Sub8_Sub26.method617(-128, anIntArray4826[i_86_]) + i_87_);
				if (i_85_ == 81) {
					if (i_87_ >= 64)
						anIntArray4817[i_86_] = Class66.method1294(anIntArray4817[i_86_], 4);
					else {
						method709(-75, i_86_);
						anIntArray4817[i_86_] = Class14_Sub8_Sub26.method617(anIntArray4817[i_86_], -5);
					}
				}
				if (i_85_ == 17)
					method723((byte) -63, (i_87_ << 39) + (anIntArray4766[i_86_] & ~0x3f80), i_86_);
				if (i_85_ == 49)
					method723((byte) 76, i_87_ + (anIntArray4766[i_86_] & ~0x7f), i_86_);
			} else if (i_75_ == 192) {
				int i_90_ = i & 0xf;
				int i_91_ = (i & 0x7f55) >> 8;
				method713(i_91_ + anIntArray4777[i_90_], i_90_, 0);
			} else if (i_75_ == 208) {
				int i_92_ = i & 0xf;
				int i_93_ = i >> 8 & 0x7f;
				method701((byte) 73, i_92_, i_93_);
			} else if (i_75_ == 224) {
				int i_94_ = i & 0xf;
				int i_95_ = (i >> 9 & 0x3f80) + ((i & 0x7f57) >> 8);
				method694(i_95_, i_94_, 72);
			} else {
				i_75_ = i & 0xff;
				if (i_75_ == 255)
					method707(2676);
			}
		}
	}

	public int method718(Class14_Sub18 class14_sub18, int i) {
		int i_96_ = (class14_sub18.anInt3052 + (class14_sub18.anInt3063 * class14_sub18.anInt3056 >> 12));
		if (i >= -109)
			method698(-56, null);
		i_96_ += (anIntArray4815[class14_sub18.anInt3053] * (anIntArray4798[class14_sub18.anInt3053] - 8192)) >> 44;
		Class127 class127 = class14_sub18.aClass127_3062;
		if (class127.anInt2103 > 0 && (class127.anInt2108 > 0 || anIntArray4819[class14_sub18.anInt3053] > 0)) {
			int i_97_ = class127.anInt2100 << 1;
			int i_98_ = class127.anInt2108 << 34;
			if (i_97_ > class14_sub18.anInt3043)
				i_98_ = i_98_ * class14_sub18.anInt3043 / i_97_;
			i_98_ += anIntArray4819[class14_sub18.anInt3053] >> 39;
			double d = Math.sin((double) (class14_sub18.anInt3049 & 0x1ff) * 0.01227184630308513);
			i_96_ += (int) (d * (double) i_98_);
		}
		int i_99_ = (int) (((double) ((class14_sub18.aClass14_Sub12_Sub1_3059.anInt4895) * 256)
				* Math.pow(2.0, (double) i_96_ * 3.255208333333333E-4) / (double) Class115.anInt1909) + 0.5);
		int i_100_ = i_99_ >= 1 ? i_99_ : 1;
		return i_100_;
	}

	public synchronized void method719(int i, boolean bool, Class14_Sub16 class14_sub16) {
		method697(-120);
		aClass27_4789.method1035(class14_sub16.aByteArray3002);
		aBoolean4837 = bool;
		aLong4838 = 0L;
		int i_101_ = aClass27_4789.method1043();
		for (int i_102_ = i; i_101_ > i_102_; i_102_++) {
			aClass27_4789.method1048(i_102_);
			aClass27_4789.method1042(i_102_);
			aClass27_4789.method1036(i_102_);
		}
		anInt4834 = aClass27_4789.method1044();
		anInt4833 = aClass27_4789.anIntArray507[anInt4834];
		aLong4836 = aClass27_4789.method1038(anInt4833);
	}

	public void method720(int i, int i_103_) {
		for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method77()); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
						.method84()) {
			if (i < 0 || class14_sub18.anInt3053 == i) {
				if (class14_sub18.aClass14_Sub9_Sub4_3051 != null) {
					class14_sub18.aClass14_Sub9_Sub4_3051.method777(Class115.anInt1909 / 100);
					if (class14_sub18.aClass14_Sub9_Sub4_3051.method776())
						aClass14_Sub9_Sub3_4835.aClass14_Sub9_Sub2_4859
								.method735(class14_sub18.aClass14_Sub9_Sub4_3051);
					class14_sub18.method885(false);
				}
				if (class14_sub18.anInt3041 < 0)
					aClass14_Sub18ArrayArray4823[class14_sub18.anInt3053][class14_sub18.anInt3037] = null;
				class14_sub18.unlink();
			}
		}
		if (i_103_ <= 89)
			aDouble4756 = -2.1490784692665255;
	}

	public synchronized boolean method721(byte i) {
		if (i < 108)
			anInt4833 = -1;
		boolean bool = aClass27_4789.method1049();
		return bool;
	}

	public void method722(int i, int i_104_, int i_105_, int i_106_) {
		if (i != -31396)
			method703(true);
		Class14_Sub18 class14_sub18 = aClass14_Sub18ArrayArray4823[i_105_][i_106_];
		if (class14_sub18 != null) {
			aClass14_Sub18ArrayArray4823[i_105_][i_106_] = null;
			if ((anIntArray4817[i_105_] & 0x2) != 0) {
				for (Class14_Sub18 class14_sub18_107_ = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method77(); class14_sub18_107_ != null; class14_sub18_107_ = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
								.method84()) {
					if (class14_sub18_107_.anInt3053 == class14_sub18.anInt3053 && class14_sub18_107_.anInt3041 < 0
							&& class14_sub18 != class14_sub18_107_) {
						class14_sub18.anInt3041 = 0;
						break;
					}
				}
			} else
				class14_sub18.anInt3041 = 0;
		}
	}

	public void method723(byte i, int i_108_, int i_109_) {
		anIntArray4766[i_109_] = i_108_;
		int i_110_ = -111 % ((i - 17) / 39);
		anIntArray4796[i_109_] = (int) ((Math.pow(2.0, (double) i_108_ * 5.4931640625E-4) * 2097152.0) + 0.5);
	}

	public void method724(int i, int i_111_) {
		if (i < 0) {
			for (i = 0; i < 16; i++)
				method724(i, -25515);
		} else {
			anIntArray4771[i] = 12800;
			anIntArray4801[i] = 8192;
			anIntArray4784[i] = 16383;
			if (i_111_ != -25515)
				method699(3, 23, 13, -58);
			anIntArray4798[i] = 8192;
			anIntArray4819[i] = 0;
			anIntArray4805[i] = 8192;
			method728(85, i);
			method709(102, i);
			anIntArray4817[i] = 0;
			anIntArray4772[i] = 32767;
			anIntArray4815[i] = 256;
			anIntArray4826[i] = 0;
			method723((byte) 87, 8192, i);
		}
	}

	public boolean method725(int[] is, Class14_Sub18 class14_sub18, int i, int i_112_, int i_113_) {
		class14_sub18.anInt3048 = Class115.anInt1909 / 100;
		if (class14_sub18.anInt3041 >= 0 && (class14_sub18.aClass14_Sub9_Sub4_3051 == null
				|| class14_sub18.aClass14_Sub9_Sub4_3051.method748())) {
			class14_sub18.method885(false);
			class14_sub18.unlink();
			if (class14_sub18.anInt3039 > 0
					&& (aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039]) == class14_sub18)
				aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039] = null;
			boolean bool = true;
			return bool;
		}
		if (i < 69) {
			boolean bool = true;
			return bool;
		}
		int i_114_ = class14_sub18.anInt3063;
		if (i_114_ > 0) {
			i_114_ -= (int) (Math.pow(2.0, ((double) (anIntArray4805[class14_sub18.anInt3053]) * 4.921259842519685E-4))
					* 16.0 + 0.5);
			if (i_114_ < 0)
				i_114_ = 0;
			class14_sub18.anInt3063 = i_114_;
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method741(method718(class14_sub18, -112));
		class14_sub18.anInt3043++;
		Class127 class127 = class14_sub18.aClass127_3062;
		class14_sub18.anInt3049 += class127.anInt2103;
		double d = ((double) ((class14_sub18.anInt3037 - 60 << 8)
				+ (class14_sub18.anInt3063 * class14_sub18.anInt3056 >> 12)) * 5.086263020833333E-6);
		boolean bool = false;
		if (class127.anInt2097 > 0) {
			if (class127.anInt2106 <= 0)
				class14_sub18.anInt3040 += 128;
			else
				class14_sub18.anInt3040 += (int) ((Math.pow(2.0, (double) class127.anInt2106 * d) * 128.0) + 0.5);
			if (class14_sub18.anInt3040 * class127.anInt2097 >= 819200)
				bool = true;
		}
		if (class127.aByteArray2109 != null) {
			if (class127.anInt2096 <= 0)
				class14_sub18.anInt3058 += 128;
			else
				class14_sub18.anInt3058 += (int) ((Math.pow(2.0, d * (double) class127.anInt2096) * 128.0) + 0.5);
			for (/**/; (class14_sub18.anInt3045 < class127.aByteArray2109.length - 2
					&& (class14_sub18.anInt3058 > ((class127.aByteArray2109[class14_sub18.anInt3045 + 2] << 8)
							& 0xff00))); class14_sub18.anInt3045 += 2) {
				/* empty */
			}
			if (class127.aByteArray2109.length - 2 == class14_sub18.anInt3045
					&& class127.aByteArray2109[class14_sub18.anInt3045 + 1] == 0)
				bool = true;
		}
		if (class14_sub18.anInt3041 >= 0 && class127.aByteArray2098 != null
				&& (anIntArray4817[class14_sub18.anInt3053] & 0x1) == 0 && (class14_sub18.anInt3039 < 0
						|| class14_sub18 != (aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039]))) {
			if (class127.anInt2099 > 0)
				class14_sub18.anInt3041 += (int) ((Math.pow(2.0, (double) class127.anInt2099 * d) * 128.0) + 0.5);
			else
				class14_sub18.anInt3041 += 128;
			for (/**/; (class14_sub18.anInt3035 < class127.aByteArray2098.length - 2
					&& (class14_sub18.anInt3041 > ((class127.aByteArray2098[class14_sub18.anInt3035 + 2] << 40)
							& 0xff00))); class14_sub18.anInt3035 += 2) {
				/* empty */
			}
			if (class127.aByteArray2098.length - 2 == class14_sub18.anInt3035)
				bool = true;
		}
		if (bool) {
			class14_sub18.aClass14_Sub9_Sub4_3051.method777(class14_sub18.anInt3048);
			if (is == null)
				class14_sub18.aClass14_Sub9_Sub4_3051.method692(i_112_);
			else
				class14_sub18.aClass14_Sub9_Sub4_3051.method687(is, i_113_, i_112_);
			if (class14_sub18.aClass14_Sub9_Sub4_3051.method776())
				aClass14_Sub9_Sub3_4835.aClass14_Sub9_Sub2_4859.method735(class14_sub18.aClass14_Sub9_Sub4_3051);
			class14_sub18.method885(false);
			if (class14_sub18.anInt3041 >= 0) {
				class14_sub18.unlink();
				if (class14_sub18.anInt3039 > 0
						&& (aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039]) == class14_sub18)
					aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039] = null;
			}
			boolean bool_115_ = true;
			return bool_115_;
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method746(class14_sub18.anInt3048, method698(-627246801, class14_sub18),
				method693(class14_sub18, true));
		boolean bool_116_ = false;
		return bool_116_;
	}

	public boolean method726(Class14_Sub18 class14_sub18, int i) {
		if (i != 2)
			method709(50, -89);
		if (class14_sub18.aClass14_Sub9_Sub4_3051 == null) {
			if (class14_sub18.anInt3041 >= 0) {
				class14_sub18.unlink();
				if (class14_sub18.anInt3039 > 0
						&& class14_sub18 == (aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039]))
					aClass14_Sub18ArrayArray4825[class14_sub18.anInt3053][class14_sub18.anInt3039] = null;
			}
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public int method727(int i) {
		if (i != 0) {
			int i_117_ = 61;
			return i_117_;
		}
		int i_118_ = anInt4764;
		return i_118_;
	}

	public void method728(int i, int i_119_) {
		if (i < 61)
			aClass27_4789 = null;
		if ((anIntArray4817[i_119_] & 0x2) != 0) {
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.method77()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.method84())) {
				if (i_119_ == class14_sub18.anInt3053
						&& (aClass14_Sub18ArrayArray4823[i_119_][class14_sub18.anInt3037]) == null
						&& class14_sub18.anInt3041 < 0)
					class14_sub18.anInt3041 = 0;
			}
		}
	}

	public Class14_Sub9_Sub1() {
		anInt4764 = 256;
		anIntArray4777 = new int[16];
		anIntArray4784 = new int[16];
		anIntArray4798 = new int[16];
		aClass14_Sub18ArrayArray4825 = new Class14_Sub18[16][128];
		anInt4806 = 1000000;
		anIntArray4805 = new int[16];
		aClass14_Sub18ArrayArray4823 = new Class14_Sub18[16][128];
		anIntArray4815 = new int[16];
		anIntArray4772 = new int[16];
		anIntArray4826 = new int[16];
		anIntArray4796 = new int[16];
		anIntArray4817 = new int[16];
		anIntArray4801 = new int[16];
		anIntArray4775 = new int[16];
		anIntArray4832 = new int[16];
		anIntArray4819 = new int[16];
		aClass27_4789 = new Class27();
		aClass14_Sub9_Sub3_4835 = new Class14_Sub9_Sub3(this);
		aClass55_4781 = new HashTable(128);
		method707(2676);
	}
}
