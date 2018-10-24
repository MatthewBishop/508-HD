/* Class136 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.fs;

public class BZip2Decompressor {
	public static BZip2BlockEntry aClass117_2191 = new BZip2BlockEntry();

	public static void method1929() {
		anIntArray2473 = null;
		aClass117_2191 = null;
	}

	public static void method1930(BZip2BlockEntry class117) {
		boolean bool = false;
		boolean bool_0_ = false;
		boolean bool_1_ = false;
		boolean bool_2_ = false;
		boolean bool_3_ = false;
		boolean bool_4_ = false;
		boolean bool_5_ = false;
		boolean bool_6_ = false;
		boolean bool_7_ = false;
		boolean bool_8_ = false;
		boolean bool_9_ = false;
		boolean bool_10_ = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		boolean bool_16_ = false;
		int i = 0;
		int[] is = null;
		int[] is_17_ = null;
		int[] is_18_ = null;
		class117.anInt1947 = 1;
		if (BZip2Decompressor.anIntArray2473 == null)
			BZip2Decompressor.anIntArray2473 = new int[class117.anInt1947 * 100000];
		boolean bool_19_ = true;
		while (bool_19_) {
			byte i_20_ = method1937(class117);
			if (i_20_ == 23)
				break;
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1937(class117);
			i_20_ = method1935(class117);
			class117.anInt1942 = 0;
			int i_21_ = method1937(class117);
			class117.anInt1942 = class117.anInt1942 << 8 | i_21_ & 0xff;
			i_21_ = method1937(class117);
			class117.anInt1942 = class117.anInt1942 << 8 | i_21_ & 0xff;
			i_21_ = method1937(class117);
			class117.anInt1942 = class117.anInt1942 << 8 | i_21_ & 0xff;
			for (int i_22_ = 0; i_22_ < 16; i_22_++) {
				i_20_ = method1935(class117);
				if (i_20_ == 1)
					class117.aBooleanArray1957[i_22_] = true;
				else
					class117.aBooleanArray1957[i_22_] = false;
			}
			for (int i_23_ = 0; i_23_ < 256; i_23_++)
				class117.aBooleanArray1965[i_23_] = false;
			for (int i_24_ = 0; i_24_ < 16; i_24_++) {
				if (class117.aBooleanArray1957[i_24_]) {
					for (int i_25_ = 0; i_25_ < 16; i_25_++) {
						i_20_ = method1935(class117);
						if (i_20_ == 1)
							class117.aBooleanArray1965[i_24_ * 16 + i_25_] = true;
					}
				}
			}
			method1936(class117);
			int i_26_ = class117.anInt1940 + 2;
			int i_27_ = method1933(3, class117);
			int i_28_ = method1933(15, class117);
			for (int i_29_ = 0; i_29_ < i_28_; i_29_++) {
				int i_30_ = 0;
				for (;;) {
					i_20_ = method1935(class117);
					if (i_20_ == 0)
						break;
					i_30_++;
				}
				class117.aByteArray1962[i_29_] = (byte) i_30_;
			}
			byte[] is_31_ = new byte[6];
			for (byte i_32_ = 0; i_32_ < i_27_; i_32_++)
				is_31_[i_32_] = i_32_;
			for (int i_33_ = 0; i_33_ < i_28_; i_33_++) {
				byte i_34_ = class117.aByteArray1962[i_33_];
				byte i_35_ = is_31_[i_34_];
				for (/**/; i_34_ > 0; i_34_--)
					is_31_[i_34_] = is_31_[i_34_ - 1];
				is_31_[0] = i_35_;
				class117.aByteArray1936[i_33_] = i_35_;
			}
			for (int i_36_ = 0; i_36_ < i_27_; i_36_++) {
				int i_37_ = method1933(5, class117);
				for (int i_38_ = 0; i_38_ < i_26_; i_38_++) {
					for (;;) {
						i_20_ = method1935(class117);
						if (i_20_ == 0)
							break;
						i_20_ = method1935(class117);
						if (i_20_ == 0)
							i_37_++;
						else
							i_37_--;
					}
					class117.aByteArrayArray1967[i_36_][i_38_] = (byte) i_37_;
				}
			}
			for (int i_39_ = 0; i_39_ < i_27_; i_39_++) {
				int i_40_ = 32;
				byte i_41_ = 0;
				for (int i_42_ = 0; i_42_ < i_26_; i_42_++) {
					if (class117.aByteArrayArray1967[i_39_][i_42_] > i_41_)
						i_41_ = class117.aByteArrayArray1967[i_39_][i_42_];
					if (class117.aByteArrayArray1967[i_39_][i_42_] < i_40_)
						i_40_ = class117.aByteArrayArray1967[i_39_][i_42_];
				}
				method1931(class117.anIntArrayArray1955[i_39_], class117.anIntArrayArray1956[i_39_],
						class117.anIntArrayArray1937[i_39_], class117.aByteArrayArray1967[i_39_], i_40_, i_41_, i_26_);
				class117.anIntArray1969[i_39_] = i_40_;
			}
			int i_43_ = class117.anInt1940 + 1;
			int i_44_ = -1;
			int i_45_ = 0;
			for (int i_46_ = 0; i_46_ <= 255; i_46_++)
				class117.anIntArray1935[i_46_] = 0;
			int i_47_ = 4095;
			for (int i_48_ = 15; i_48_ >= 0; i_48_--) {
				for (int i_49_ = 15; i_49_ >= 0; i_49_--) {
					class117.aByteArray1966[i_47_] = (byte) (i_48_ * 16 + i_49_);
					i_47_--;
				}
				class117.anIntArray1968[i_48_] = i_47_ + 1;
			}
			int i_50_ = 0;
			if (i_45_ == 0) {
				i_44_++;
				i_45_ = 50;
				byte i_51_ = class117.aByteArray1936[i_44_];
				i = class117.anIntArray1969[i_51_];
				is = class117.anIntArrayArray1955[i_51_];
				is_18_ = class117.anIntArrayArray1937[i_51_];
				is_17_ = class117.anIntArrayArray1956[i_51_];
			}
			i_45_--;
			int i_52_ = i;
			int i_53_;
			int i_54_;
			for (i_54_ = method1933(i_52_, class117); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
				i_52_++;
				i_53_ = method1935(class117);
			}
			int i_55_ = is_18_[i_54_ - is_17_[i_52_]];
			while (i_55_ != i_43_) {
				if (i_55_ == 0 || i_55_ == 1) {
					int i_56_ = -1;
					int i_57_ = 1;
					do {
						if (i_55_ == 0)
							i_56_ += i_57_ * 1;
						else if (i_55_ == 1)
							i_56_ += i_57_ * 2;
						i_57_ *= 2;
						if (i_45_ == 0) {
							i_44_++;
							i_45_ = 50;
							byte i_58_ = class117.aByteArray1936[i_44_];
							i = class117.anIntArray1969[i_58_];
							is = class117.anIntArrayArray1955[i_58_];
							is_18_ = class117.anIntArrayArray1937[i_58_];
							is_17_ = class117.anIntArrayArray1956[i_58_];
						}
						i_45_--;
						i_52_ = i;
						for (i_54_ = method1933(i_52_, class117); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
							i_52_++;
							i_53_ = method1935(class117);
						}
						i_55_ = is_18_[i_54_ - is_17_[i_52_]];
					} while (i_55_ == 0 || i_55_ == 1);
					i_56_++;
					i_21_ = (class117.aByteArray1959[(class117.aByteArray1966[class117.anIntArray1968[0]]) & 0xff]);
					class117.anIntArray1935[i_21_ & 0xff] += i_56_;
					for (/**/; i_56_ > 0; i_56_--) {
						BZip2Decompressor.anIntArray2473[i_50_] = i_21_ & 0xff;
						i_50_++;
					}
				} else {
					int i_59_ = i_55_ - 1;
					if (i_59_ < 16) {
						int i_60_ = class117.anIntArray1968[0];
						i_20_ = class117.aByteArray1966[i_60_ + i_59_];
						for (/**/; i_59_ > 3; i_59_ -= 4) {
							int i_61_ = i_60_ + i_59_;
							class117.aByteArray1966[i_61_] = class117.aByteArray1966[i_61_ - 1];
							class117.aByteArray1966[i_61_ - 1] = class117.aByteArray1966[i_61_ - 2];
							class117.aByteArray1966[i_61_ - 2] = class117.aByteArray1966[i_61_ - 3];
							class117.aByteArray1966[i_61_ - 3] = class117.aByteArray1966[i_61_ - 4];
						}
						for (/**/; i_59_ > 0; i_59_--)
							class117.aByteArray1966[i_60_ + i_59_] = class117.aByteArray1966[i_60_ + i_59_ - 1];
						class117.aByteArray1966[i_60_] = i_20_;
					} else {
						int i_62_ = i_59_ / 16;
						int i_63_ = i_59_ % 16;
						int i_64_ = class117.anIntArray1968[i_62_] + i_63_;
						i_20_ = class117.aByteArray1966[i_64_];
						for (/**/; i_64_ > class117.anIntArray1968[i_62_]; i_64_--)
							class117.aByteArray1966[i_64_] = class117.aByteArray1966[i_64_ - 1];
						class117.anIntArray1968[i_62_]++;
						for (/**/; i_62_ > 0; i_62_--) {
							class117.anIntArray1968[i_62_]--;
							class117.aByteArray1966[(class117.anIntArray1968[i_62_])] = (class117.aByteArray1966[(class117.anIntArray1968[i_62_
									- 1] + 16 - 1)]);
						}
						class117.anIntArray1968[0]--;
						class117.aByteArray1966[class117.anIntArray1968[0]] = i_20_;
						if (class117.anIntArray1968[0] == 0) {
							i_47_ = 4095;
							for (int i_65_ = 15; i_65_ >= 0; i_65_--) {
								for (int i_66_ = 15; i_66_ >= 0; i_66_--) {
									class117.aByteArray1966[i_47_] = (class117.aByteArray1966[(class117.anIntArray1968[i_65_]
											+ i_66_)]);
									i_47_--;
								}
								class117.anIntArray1968[i_65_] = i_47_ + 1;
							}
						}
					}
					class117.anIntArray1935[class117.aByteArray1959[i_20_ & 0xff] & 0xff]++;
					BZip2Decompressor.anIntArray2473[i_50_] = class117.aByteArray1959[i_20_ & 0xff] & 0xff;
					i_50_++;
					if (i_45_ == 0) {
						i_44_++;
						i_45_ = 50;
						byte i_67_ = class117.aByteArray1936[i_44_];
						i = class117.anIntArray1969[i_67_];
						is = class117.anIntArrayArray1955[i_67_];
						is_18_ = class117.anIntArrayArray1937[i_67_];
						is_17_ = class117.anIntArrayArray1956[i_67_];
					}
					i_45_--;
					i_52_ = i;
					for (i_54_ = method1933(i_52_, class117); i_54_ > is[i_52_]; i_54_ = i_54_ << 1 | i_53_) {
						i_52_++;
						i_53_ = method1935(class117);
					}
					i_55_ = is_18_[i_54_ - is_17_[i_52_]];
				}
			}
			class117.anInt1970 = 0;
			class117.aByte1960 = (byte) 0;
			class117.anIntArray1938[0] = 0;
			for (int i_68_ = 1; i_68_ <= 256; i_68_++)
				class117.anIntArray1938[i_68_] = class117.anIntArray1935[i_68_ - 1];
			for (int i_69_ = 1; i_69_ <= 256; i_69_++)
				class117.anIntArray1938[i_69_] += class117.anIntArray1938[i_69_ - 1];
			for (int i_70_ = 0; i_70_ < i_50_; i_70_++) {
				i_21_ = (byte) (BZip2Decompressor.anIntArray2473[i_70_] & 0xff);
				BZip2Decompressor.anIntArray2473[class117.anIntArray1938[i_21_ & 0xff]] |= i_70_ << 8;
				class117.anIntArray1938[i_21_ & 0xff]++;
			}
			class117.anInt1946 = BZip2Decompressor.anIntArray2473[class117.anInt1942] >> 8;
			class117.anInt1939 = 0;
			class117.anInt1946 = BZip2Decompressor.anIntArray2473[class117.anInt1946];
			class117.anInt1953 = (byte) (class117.anInt1946 & 0xff);
			class117.anInt1946 >>= 8;
			class117.anInt1939++;
			class117.anInt1943 = i_50_;
			method1932(class117);
			if (class117.anInt1939 == class117.anInt1943 + 1 && class117.anInt1970 == 0)
				bool_19_ = true;
			else
				bool_19_ = false;
		}
	}

	public static void method1931(int[] is, int[] is_71_, int[] is_72_, byte[] is_73_, int i, int i_74_, int i_75_) {
		int i_76_ = 0;
		for (int i_77_ = i; i_77_ <= i_74_; i_77_++) {
			for (int i_78_ = 0; i_78_ < i_75_; i_78_++) {
				if (is_73_[i_78_] == i_77_) {
					is_72_[i_76_] = i_78_;
					i_76_++;
				}
			}
		}
		for (int i_79_ = 0; i_79_ < 23; i_79_++)
			is_71_[i_79_] = 0;
		for (int i_80_ = 0; i_80_ < i_75_; i_80_++)
			is_71_[is_73_[i_80_] + 1]++;
		for (int i_81_ = 1; i_81_ < 23; i_81_++)
			is_71_[i_81_] += is_71_[i_81_ - 1];
		for (int i_82_ = 0; i_82_ < 23; i_82_++)
			is[i_82_] = 0;
		int i_83_ = 0;
		for (int i_84_ = i; i_84_ <= i_74_; i_84_++) {
			i_83_ += is_71_[i_84_ + 1] - is_71_[i_84_];
			is[i_84_] = i_83_ - 1;
			i_83_ <<= 1;
		}
		for (int i_85_ = i + 1; i_85_ <= i_74_; i_85_++)
			is_71_[i_85_] = (is[i_85_ - 1] + 1 << 1) - is_71_[i_85_];
	}

	public static void method1932(BZip2BlockEntry class117) {
		byte i = class117.aByte1960;
		int i_86_ = class117.anInt1970;
		int i_87_ = class117.anInt1939;
		int i_88_ = class117.anInt1953;
		int[] is = BZip2Decompressor.anIntArray2473;
		int i_89_ = class117.anInt1946;
		byte[] is_90_ = class117.aByteArray1954;
		int i_91_ = class117.anInt1944;
		int i_92_ = class117.anInt1949;
		int i_93_ = i_92_;
		int i_94_ = class117.anInt1943 + 1;
		while_108_: for (;;) {
			if (i_86_ > 0) {
				for (;;) {
					if (i_92_ == 0)
						break while_108_;
					if (i_86_ == 1)
						break;
					is_90_[i_91_] = i;
					i_86_--;
					i_91_++;
					i_92_--;
				}
				if (i_92_ == 0) {
					i_86_ = 1;
					break;
				}
				is_90_[i_91_] = i;
				i_91_++;
				i_92_--;
			}
			boolean bool = true;
			while (bool) {
				bool = false;
				if (i_87_ == i_94_) {
					i_86_ = 0;
					break while_108_;
				}
				i = (byte) i_88_;
				i_89_ = is[i_89_];
				int i_95_ = (byte) (i_89_ & 0xff);
				i_89_ >>= 8;
				i_87_++;
				if (i_95_ != i_88_) {
					i_88_ = i_95_;
					if (i_92_ == 0) {
						i_86_ = 1;
						break while_108_;
					}
					is_90_[i_91_] = i;
					i_91_++;
					i_92_--;
					bool = true;
				} else if (i_87_ == i_94_) {
					if (i_92_ == 0) {
						i_86_ = 1;
						break while_108_;
					}
					is_90_[i_91_] = i;
					i_91_++;
					i_92_--;
					bool = true;
				}
			}
			i_86_ = 2;
			i_89_ = is[i_89_];
			int i_96_ = (byte) (i_89_ & 0xff);
			i_89_ >>= 8;
			if (++i_87_ != i_94_) {
				if (i_96_ != i_88_)
					i_88_ = i_96_;
				else {
					i_86_ = 3;
					i_89_ = is[i_89_];
					i_96_ = (byte) (i_89_ & 0xff);
					i_89_ >>= 8;
					if (++i_87_ != i_94_) {
						if (i_96_ != i_88_)
							i_88_ = i_96_;
						else {
							i_89_ = is[i_89_];
							i_96_ = (byte) (i_89_ & 0xff);
							i_89_ >>= 8;
							i_87_++;
							i_86_ = (i_96_ & 0xff) + 4;
							i_89_ = is[i_89_];
							i_88_ = (byte) (i_89_ & 0xff);
							i_89_ >>= 8;
							i_87_++;
						}
					}
				}
			}
		}
		int i_97_ = class117.anInt1963;
		class117.anInt1963 += i_93_ - i_92_;
		if (class117.anInt1963 != 0) {
			/* empty */
		}
		class117.aByte1960 = i;
		class117.anInt1970 = i_86_;
		class117.anInt1939 = i_87_;
		class117.anInt1953 = i_88_;
		BZip2Decompressor.anIntArray2473 = is;
		class117.anInt1946 = i_89_;
		class117.aByteArray1954 = is_90_;
		class117.anInt1944 = i_91_;
		class117.anInt1949 = i_92_;
	}

	public static int method1933(int i, BZip2BlockEntry class117) {
		int i_98_;
		for (;;) {
			if (class117.anInt1972 >= i) {
				int i_99_ = (class117.anInt1951 >> class117.anInt1972 - i & (1 << i) - 1);
				class117.anInt1972 -= i;
				i_98_ = i_99_;
				break;
			}
			class117.anInt1951 = (class117.anInt1951 << 8 | class117.aByteArray1971[class117.anInt1950] & 0xff);
			class117.anInt1972 += 8;
			class117.anInt1950++;
			class117.anInt1964++;
			if (class117.anInt1964 != 0) {
				/* empty */
			}
		}
		return i_98_;
	}

	public static int decompress(byte[] is, int i, byte[] is_100_, int i_101_, int i_102_) {
		BZip2BlockEntry class117 = aClass117_2191;
		int i_103_;
		synchronized (class117) {
			aClass117_2191.aByteArray1971 = is_100_;
			aClass117_2191.anInt1950 = i_102_;
			aClass117_2191.aByteArray1954 = is;
			aClass117_2191.anInt1944 = 0;
			aClass117_2191.anInt1949 = i;
			aClass117_2191.anInt1972 = 0;
			aClass117_2191.anInt1951 = 0;
			aClass117_2191.anInt1964 = 0;
			aClass117_2191.anInt1963 = 0;
			method1930(aClass117_2191);
			i -= aClass117_2191.anInt1949;
			aClass117_2191.aByteArray1971 = null;
			aClass117_2191.aByteArray1954 = null;
			i_103_ = i;
		}
		return i_103_;
	}

	public static byte method1935(BZip2BlockEntry class117) {
		return (byte) method1933(1, class117);
	}

	public static void method1936(BZip2BlockEntry class117) {
		class117.anInt1940 = 0;
		for (int i = 0; i < 256; i++) {
			if (class117.aBooleanArray1965[i]) {
				class117.aByteArray1959[class117.anInt1940] = (byte) i;
				class117.anInt1940++;
			}
		}
	}

	public static byte method1937(BZip2BlockEntry class117) {
		return (byte) method1933(8, class117);
	}

	public static int[] anIntArray2473;
}
