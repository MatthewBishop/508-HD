/* Class14_Sub9_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.io.js5.FileSystem;
import com.jagex.link.HashTable;
import com.jagex.sound.Class14_Sub12_Sub1;

public class Class14_Sub9_Sub1 extends Class14_Sub9 {

	public static Class14_Sub28 method285(int i, FileSystem fileSystem) {
		byte[] is = fileSystem.getFileSmart(i);
		if (is == null) {
			Class14_Sub28 class14_sub28 = null;
			return class14_sub28;
		}
		Class14_Sub28 class14_sub28 = new Class14_Sub28(is);
		return class14_sub28;
	}

	
	public boolean aBoolean4837;
	public Class14_Sub18[][] aClass14_Sub18ArrayArray4823;
	public Class14_Sub18[][] aClass14_Sub18ArrayArray4825;
	public Class14_Sub9_Sub3 aClass14_Sub9_Sub3_4835;
	public Class27 aClass27_4789;
	public HashTable aClass55_4781;
	public long aLong4836;
	public long aLong4838;
	public int anInt4764;
	public int anInt4806;
	public int anInt4833;
	public int anInt4834;
	public int[] anIntArray4766 = new int[16];
	public int[] anIntArray4771 = new int[16];
	public int[] anIntArray4772;
	public int[] anIntArray4775;
	public int[] anIntArray4777;
	public int[] anIntArray4784;
	public int[] anIntArray4796;
	public int[] anIntArray4798;
	public int[] anIntArray4801;

	public int[] anIntArray4805;

	public int[] anIntArray4815;

	public int[] anIntArray4817;

	public int[] anIntArray4819;

	public int[] anIntArray4826;

	public int[] anIntArray4832;

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

	@Override
	public synchronized Class14_Sub9 method686() {
		Class14_Sub9 class14_sub9 = null;
		return class14_sub9;
	}

	@Override
	public synchronized void method687(int[] is, int i, int i_61_) {
		if (aClass27_4789.method1049()) {
			int i_62_ = aClass27_4789.anInt506 * anInt4806 / Class14_Sub9.anInt1909;
			do {
				long l = aLong4838 - -((long) i_61_ * (long) i_62_);
				if (aLong4836 + -l >= 0L) {
					aLong4838 = l;
					break;
				}
				int i_63_ = (int) ((i_62_ + aLong4836 + -aLong4838 + -1L) / i_62_);
				aLong4838 += (long) i_63_ * (long) i_62_;
				i_61_ -= i_63_;
				aClass14_Sub9_Sub3_4835.method687(is, i, i_63_);
				method704(-12887);
				i += i_63_;
			} while (aClass27_4789.method1049());
		}
		aClass14_Sub9_Sub3_4835.method687(is, i, i_61_);
	}

	@Override
	public synchronized Class14_Sub9 method688() {
		Class14_Sub9_Sub3 class14_sub9_sub3 = aClass14_Sub9_Sub3_4835;
		return class14_sub9_sub3;
	}

	@Override
	public synchronized int method690() {
		int i = 0;
		return i;
	}

	@Override
	public synchronized void method692(int i) {
		if (aClass27_4789.method1049()) {
			int i_4_ = aClass27_4789.anInt506 * anInt4806 / Class14_Sub9.anInt1909;
			do {
				long l = aLong4838 + (long) i * (long) i_4_;
				if (aLong4836 - l >= 0L) {
					aLong4838 = l;
					break;
				}
				int i_5_ = (int) ((i_4_ + aLong4836 + (-aLong4838 + -1L)) / i_4_);
				aLong4838 += (long) i_5_ * (long) i_4_;
				i -= i_5_;
				aClass14_Sub9_Sub3_4835.method692(i_5_);
				method704(-12887);
			} while (aClass27_4789.method1049());
		}
		aClass14_Sub9_Sub3_4835.method692(i);
	}

	public int method693(Class14_Sub18 class14_sub18) {
		int i = anIntArray4801[class14_sub18.anInt3053];
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

	public void method695(int i, int i_6_, int i_7_) {
		anIntArray4832[i] = i_7_;
		anIntArray4777[i] = DuplicateMethods.method617(i_7_, i_6_);
		method713(i_7_, i);
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
			i_8_ = (int) ((i_8_
					* Math.pow(0.5, (class127.anInt2097 * (class14_sub18.anInt3040 * 1.953125E-5))))
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
		method722(64, i_19_, i);
		if ((anIntArray4817[i_19_] & 0x2) != 0) {
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getTail()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.getPrevious())) {
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
		Class14_Sub28 class14_sub28 = ((Class14_Sub28) aClass55_4781.get(anIntArray4775[i_19_]));
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
							method693(class14_sub18));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = Class14_Sub9_Sub4.method763(class14_sub12_sub1,
							method718(class14_sub18, -113), 0, method693(class14_sub18));
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
				aClass14_Sub9_Sub3_4835.aClass2_4858.pushBack(class14_sub18);
				aClass14_Sub18ArrayArray4823[i_19_][i] = class14_sub18;
			}
		}
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

	public synchronized boolean method706(int i, Class14_Sub16 class14_sub16, int i_37_, FileSystem fileSystem,
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
			Class14_Sub28 class14_sub28 = ((Class14_Sub28) aClass55_4781.get(i_39_));
			if (class14_sub28 == null) {
				class14_sub28 = method285(i_39_, fileSystem);
				if (class14_sub28 == null) {
					bool = false;
					continue;
				}
				aClass55_4781.put(i_39_, class14_sub28);
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
		method720(-1);
		method724(-1, -25515);
		for (int i_41_ = 0; i_41_ < 16; i_41_++)
			anIntArray4775[i_41_] = anIntArray4832[i_41_];
		if (i == 2676) {
			for (int i_42_ = 0; i_42_ < 16; i_42_++)
				anIntArray4777[i_42_] = DuplicateMethods.method617(anIntArray4832[i_42_], -128);
		}
	}

	public void method709(int i, int i_64_) {
		if ((anIntArray4817[i_64_] & 0x4) != 0) {
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getFront()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.getNext())) {
				if (i_64_ == class14_sub18.anInt3053)
					class14_sub18.anInt3044 = 0;
			}
		}
		int i_65_ = 76 % ((i - 32) / 61);
	}

	public synchronized void method710(int i, int i_66_) {
		anInt4764 = i_66_;
	}

	public void method712(int i, int i_68_) {
		for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getFront()); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
						.getNext()) {
			if ((i < 0 || i == class14_sub18.anInt3053) && class14_sub18.anInt3041 < 0) {
				aClass14_Sub18ArrayArray4823[class14_sub18.anInt3053][class14_sub18.anInt3037] = null;
				class14_sub18.anInt3041 = 0;
			}
		}
	}

	public void method713(int i, int i_69_) {
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
			class14_sub28.method929();
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
			method722(i_78_, i_76_, i_77_);
		} else if (i_75_ == 144) {
			int i_79_ = i & 0xf;
			int i_80_ = (i & 0x7feb) >> 8;
			int i_81_ = (i & 0x7f6820) >> 48;
			if (i_81_ <= 0)
				method722(64, i_79_, i_80_);
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
							+ DuplicateMethods.method617(anIntArray4777[i_86_], -2080769));
				if (i_85_ == 32)
					anIntArray4777[i_86_] = DuplicateMethods.method617(anIntArray4777[i_86_], -16257) + (i_87_ << 7);
				if (i_85_ == 1)
					anIntArray4819[i_86_] = ((i_87_ << 7)
							+ DuplicateMethods.method617(anIntArray4819[i_86_], -16257));
				if (i_85_ == 33)
					anIntArray4819[i_86_] = (DuplicateMethods.method617(-128, anIntArray4819[i_86_]) + i_87_);
				if (i_85_ == 5)
					anIntArray4805[i_86_] = DuplicateMethods.method617(anIntArray4805[i_86_], -16257) + (i_87_ << 7);
				if (i_85_ == 37)
					anIntArray4805[i_86_] = DuplicateMethods.method617(anIntArray4805[i_86_], -128) + i_87_;
				if (i_85_ == 7)
					anIntArray4771[i_86_] = ((i_87_ << 7)
							+ DuplicateMethods.method617(anIntArray4771[i_86_], -16257));
				if (i_85_ == 39)
					anIntArray4771[i_86_] = i_87_ + DuplicateMethods.method617(anIntArray4771[i_86_], -128);
				if (i_85_ == 10)
					anIntArray4801[i_86_] = (DuplicateMethods.method617(-16257, anIntArray4801[i_86_])
							+ (i_87_ << 39));
				if (i_85_ == 42)
					anIntArray4801[i_86_] = (DuplicateMethods.method617(-128, anIntArray4801[i_86_]) + i_87_);
				if (i_85_ == 11)
					anIntArray4784[i_86_] = ((i_87_ << 7)
							+ DuplicateMethods.method617(anIntArray4784[i_86_], -16257));
				if (i_85_ == 43)
					anIntArray4784[i_86_] = (DuplicateMethods.method617(-128, anIntArray4784[i_86_]) + i_87_);
				if (i_85_ == 64) {
					if (i_87_ >= 64)
						anIntArray4817[i_86_] = DuplicateMethods.method1294(anIntArray4817[i_86_], 1);
					else
						anIntArray4817[i_86_] = DuplicateMethods.method617(anIntArray4817[i_86_], -2);
				}
				if (i_85_ == 65) {
					if (i_87_ < 64) {
						method728(101, i_86_);
						anIntArray4817[i_86_] = DuplicateMethods.method617(anIntArray4817[i_86_], -3);
					} else
						anIntArray4817[i_86_] = DuplicateMethods.method1294(anIntArray4817[i_86_], 2);
				}
				if (i_85_ == 99)
					anIntArray4772[i_86_] = DuplicateMethods.method617(anIntArray4772[i_86_], 127) + (i_87_ << 7);
				if (i_85_ == 98)
					anIntArray4772[i_86_] = i_87_ + DuplicateMethods.method617(16256, anIntArray4772[i_86_]);
				if (i_85_ == 101)
					anIntArray4772[i_86_] = (DuplicateMethods.method617(127, anIntArray4772[i_86_]) + 16384
							+ (i_87_ << 7));
				if (i_85_ == 100)
					anIntArray4772[i_86_] = (i_87_ + 16384
							+ DuplicateMethods.method617(16256, anIntArray4772[i_86_]));
				if (i_85_ == 120)
					method720(i_86_);
				if (i_85_ == 121)
					method724(i_86_, -25515);
				if (i_85_ == 123)
					method712(i_86_, -654583480);
				if (i_85_ == 6) {
					int i_88_ = anIntArray4772[i_86_];
					if (i_88_ == 16384)
						anIntArray4815[i_86_] = (DuplicateMethods.method617(anIntArray4815[i_86_], -16257)
								+ (i_87_ << 39));
				}
				if (i_85_ == 38) {
					int i_89_ = anIntArray4772[i_86_];
					if (i_89_ == 16384)
						anIntArray4815[i_86_] = (i_87_ + DuplicateMethods.method617(anIntArray4815[i_86_], -128));
				}
				if (i_85_ == 16)
					anIntArray4826[i_86_] = (DuplicateMethods.method617(-16257, anIntArray4826[i_86_])
							+ (i_87_ << 39));
				if (i_85_ == 48)
					anIntArray4826[i_86_] = (DuplicateMethods.method617(-128, anIntArray4826[i_86_]) + i_87_);
				if (i_85_ == 81) {
					if (i_87_ >= 64)
						anIntArray4817[i_86_] = DuplicateMethods.method1294(anIntArray4817[i_86_], 4);
					else {
						method709(-75, i_86_);
						anIntArray4817[i_86_] = DuplicateMethods.method617(anIntArray4817[i_86_], -5);
					}
				}
				if (i_85_ == 17)
					method723((byte) -63, (i_87_ << 39) + (anIntArray4766[i_86_] & ~0x3f80), i_86_);
				if (i_85_ == 49)
					method723((byte) 76, i_87_ + (anIntArray4766[i_86_] & ~0x7f), i_86_);
			} else if (i_75_ == 192) {
				int i_90_ = i & 0xf;
				int i_91_ = (i & 0x7f55) >> 8;
				method713(i_91_ + anIntArray4777[i_90_], i_90_);
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
			double d = Math.sin((class14_sub18.anInt3049 & 0x1ff) * 0.01227184630308513);
			i_96_ += (int) (d * i_98_);
		}
		int i_99_ = (int) (((class14_sub18.aClass14_Sub12_Sub1_3059.anInt4895) * 256
				* Math.pow(2.0, i_96_ * 3.255208333333333E-4) / Class14_Sub9.anInt1909) + 0.5);
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

	public void method720(int i) {
		for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getFront()); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
						.getNext()) {
			if (i < 0 || class14_sub18.anInt3053 == i) {
				if (class14_sub18.aClass14_Sub9_Sub4_3051 != null) {
					class14_sub18.aClass14_Sub9_Sub4_3051.method777(Class14_Sub9.anInt1909 / 100);
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
	}

	public synchronized boolean method721(byte i) {
		if (i < 108)
			anInt4833 = -1;
		boolean bool = aClass27_4789.method1049();
		return bool;
	}

	public void method722(int i_104_, int i_105_, int i_106_) {
		Class14_Sub18 class14_sub18 = aClass14_Sub18ArrayArray4823[i_105_][i_106_];
		if (class14_sub18 != null) {
			aClass14_Sub18ArrayArray4823[i_105_][i_106_] = null;
			if ((anIntArray4817[i_105_] & 0x2) != 0) {
				for (Class14_Sub18 class14_sub18_107_ = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getFront(); class14_sub18_107_ != null; class14_sub18_107_ = (Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
								.getNext()) {
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
		anIntArray4796[i_109_] = (int) ((Math.pow(2.0, i_108_ * 5.4931640625E-4) * 2097152.0) + 0.5);
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
		class14_sub18.anInt3048 = Class14_Sub9.anInt1909 / 100;
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
			i_114_ -= (int) (Math.pow(2.0, ((anIntArray4805[class14_sub18.anInt3053]) * 4.921259842519685E-4))
					* 16.0 + 0.5);
			if (i_114_ < 0)
				i_114_ = 0;
			class14_sub18.anInt3063 = i_114_;
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method741(method718(class14_sub18, -112));
		class14_sub18.anInt3043++;
		Class127 class127 = class14_sub18.aClass127_3062;
		class14_sub18.anInt3049 += class127.anInt2103;
		double d = (((class14_sub18.anInt3037 - 60 << 8)
				+ (class14_sub18.anInt3063 * class14_sub18.anInt3056 >> 12)) * 5.086263020833333E-6);
		boolean bool = false;
		if (class127.anInt2097 > 0) {
			if (class127.anInt2106 <= 0)
				class14_sub18.anInt3040 += 128;
			else
				class14_sub18.anInt3040 += (int) ((Math.pow(2.0, class127.anInt2106 * d) * 128.0) + 0.5);
			if (class14_sub18.anInt3040 * class127.anInt2097 >= 819200)
				bool = true;
		}
		if (class127.aByteArray2109 != null) {
			if (class127.anInt2096 <= 0)
				class14_sub18.anInt3058 += 128;
			else
				class14_sub18.anInt3058 += (int) ((Math.pow(2.0, d * class127.anInt2096) * 128.0) + 0.5);
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
				class14_sub18.anInt3041 += (int) ((Math.pow(2.0, class127.anInt2099 * d) * 128.0) + 0.5);
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
				method693(class14_sub18));
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
			for (Class14_Sub18 class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858.getFront()); class14_sub18 != null; class14_sub18 = ((Class14_Sub18) aClass14_Sub9_Sub3_4835.aClass2_4858
							.getNext())) {
				if (i_119_ == class14_sub18.anInt3053
						&& (aClass14_Sub18ArrayArray4823[i_119_][class14_sub18.anInt3037]) == null
						&& class14_sub18.anInt3041 < 0)
					class14_sub18.anInt3041 = 0;
			}
		}
	}
}
