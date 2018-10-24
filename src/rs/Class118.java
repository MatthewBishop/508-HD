/* Class118 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.rt4.Class14_Sub1;

public class Class118 {
	public static Class124 aClass124_1973;
	public static Class124 aClass124_1975;
	public static volatile int anInt1976 = 0;
	public static Class124 aClass124_1978 = Class124.method263(1178, "white:");
	public static Class124 aClass124_1979 = aClass124_1978;
	public static Class124 aClass124_1981;
	public static Class124 aClass124_1985;
	public static Class124 aClass124_1988;
	public static Class124 aClass124_1989;

	static {
		aClass124_1975 = Class124.method263(1178, "Attack");
		aClass124_1985 = Class124.method263(1178, "Members only world");
		aClass124_1973 = aClass124_1975;
		aClass124_1988 = aClass124_1978;
		aClass124_1989 = Class124.method263(1178, "; Max)2Age=");
		aClass124_1981 = aClass124_1985;
	}

	public static void method1603(int i, Class133_Sub1_Sub1 class133_sub1_sub1, int i_0_, int i_1_) {
		if ((i_0_ & 0x100) != 0) {
			class133_sub1_sub1.anInt3451 = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) 118);
			class133_sub1_sub1.anInt3472 = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -94);
			class133_sub1_sub1.anInt3478 = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -76);
			class133_sub1_sub1.anInt3489 = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -91);
			class133_sub1_sub1.anInt3494 = JunkTex.aClass14_Sub10_Sub1_4734.readUShort()
					+ Class14_Sub2_Sub20.anInt4064;
			class133_sub1_sub1.anInt3455 = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) 122)
					+ Class14_Sub2_Sub20.anInt4064;
			class133_sub1_sub1.anInt3444 = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			class133_sub1_sub1.anInt3498 = 1;
			class133_sub1_sub1.anInt3477 = 0;
		}
		if ((i_0_ & 0x200) != 0) {
			int i_2_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -115);
			int i_3_ = JunkTex.aClass14_Sub10_Sub1_4734.method819(3);
			class133_sub1_sub1.method1801(0, i_3_, Class14_Sub2_Sub20.anInt4064, i_2_);
		}
		if ((i_0_ & 0x20) != 0) {
			class133_sub1_sub1.anInt3453 = JunkTex.aClass14_Sub10_Sub1_4734.readUShort();
			if (class133_sub1_sub1.anInt3453 == 65535)
				class133_sub1_sub1.anInt3453 = -1;
		}
		if ((i_0_ & 0x4) != 0) {
			class133_sub1_sub1.aClass124_3462 = JunkTex.aClass14_Sub10_Sub1_4734.method797(9467);
			if (class133_sub1_sub1.aClass124_3462.method1710(0, 0) == 126) {
				class133_sub1_sub1.aClass124_3462 = class133_sub1_sub1.aClass124_3462.method1696(1, 15);
				Class15.method943(class133_sub1_sub1.aClass124_3462, false, class133_sub1_sub1.method1808(true), 2);
			} else if (class133_sub1_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748)
				Class15.method943(class133_sub1_sub1.aClass124_3462, false, class133_sub1_sub1.method1808(true), 2);
			class133_sub1_sub1.anInt3439 = 0;
			class133_sub1_sub1.anInt3466 = 0;
			class133_sub1_sub1.anInt3473 = 150;
		}
		if ((i_0_ & 0x400) != 0) {
			class133_sub1_sub1.anInt3487 = JunkTex.aClass14_Sub10_Sub1_4734.readUShort();
			int i_4_ = JunkTex.aClass14_Sub10_Sub1_4734.method790(8);
			if (class133_sub1_sub1.anInt3487 == 65535)
				class133_sub1_sub1.anInt3487 = -1;
			class133_sub1_sub1.anInt3459 = 0;
			class133_sub1_sub1.anInt3485 = (i_4_ & 0xffff) + Class14_Sub2_Sub20.anInt4064;
			class133_sub1_sub1.anInt3470 = 0;
			if (class133_sub1_sub1.anInt3485 > Class14_Sub2_Sub20.anInt4064)
				class133_sub1_sub1.anInt3470 = -1;
			class133_sub1_sub1.anInt3475 = i_4_ >> 48;
		}
		if ((i_0_ & 0x40) != 0) {
			class133_sub1_sub1.anInt3504 = JunkTex.aClass14_Sub10_Sub1_4734.method791(-3977);
			class133_sub1_sub1.anInt3480 = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -91);
		}
		if ((i_0_ & 0x8) != 0) {
			int i_5_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -63);
			int i_6_ = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) -40);
			boolean bool = (i_5_ & 0x8000) != 0;
			int i_7_ = JunkTex.aClass14_Sub10_Sub1_4734.method806((byte) -114);
			int i_8_ = JunkTex.aClass14_Sub10_Sub1_4734.position;
			if (class133_sub1_sub1.aClass124_4922 != null && class133_sub1_sub1.aClass102_4941 != null) {
				long l = class133_sub1_sub1.aClass124_4922.method1692(0);
				boolean bool_9_ = false;
				if (i_6_ <= 1) {
					if (!bool && (Class146.anInt2365 == 1 || Class14_Sub2_Sub21.anInt4081 == 1))
						bool_9_ = true;
					else {
						for (int i_10_ = 0; i_10_ < Class42.anInt698; i_10_++) {
							if (Static2.aLongArray2095[i_10_] == l) {
								bool_9_ = true;
								break;
							}
						}
					}
				}
				if (!bool_9_ && JunkTex.anInt4754 == 0) {
					Static2.aClass14_Sub10_3068.position = 0;
					JunkTex.aClass14_Sub10_Sub1_4734.method824(i_7_, (byte) 76, 0,
							Static2.aClass14_Sub10_3068.payload);
					int i_11_ = -1;
					Static2.aClass14_Sub10_3068.position = 0;
					Class124 class124;
					if (bool) {
						Class98 class98 = Class86.method1422(i - 46, (Static2.aClass14_Sub10_3068));
						i_11_ = class98.anInt1663;
						i_5_ &= 0x7fff;
						class124 = (class98.aClass14_Sub2_Sub21_1662.method442(-103,
								Static2.aClass14_Sub10_3068));
					} else
						class124 = (Class14_Sub2_Sub16.method368(
								Class75.method1337(Static2.aClass14_Sub10_3068, 32767).method1677(i ^ 0x1)));
					class133_sub1_sub1.aClass124_3462 = class124.method1684((byte) 9);
					class133_sub1_sub1.anInt3473 = 150;
					class133_sub1_sub1.anInt3439 = i_5_ & 0xff;
					class133_sub1_sub1.anInt3466 = i_5_ >> 40;
					if (i_6_ != 2) {
						if (i_6_ != 1)
							JunkTex.method493((byte) -74, null, class133_sub1_sub1.method1808(true),
									bool ? 17 : 2, class124, i_11_);
						else
							JunkTex.method493((byte) -67, null,
									(JunkTex.method515((new Class124[] { Class14_Sub21.aClass124_3099,
											class133_sub1_sub1.method1808(true) }), (byte) -86)),
									bool ? 17 : 1, class124, i_11_);
					} else
						JunkTex.method493((byte) -95, null,
								(JunkTex.method515((new Class124[] { Static2.aClass124_3075,
										class133_sub1_sub1.method1808(true) }), (byte) -7)),
								!bool ? 1 : 17, class124, i_11_);
				}
			}
			JunkTex.aClass14_Sub10_Sub1_4734.position = i_7_ + i_8_;
		}
		if ((i_0_ & i) != 0) {
			int i_12_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort();
			if (i_12_ == 65535)
				i_12_ = -1;
			int i_13_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -104);
			Class83.method1408(class133_sub1_sub1, i_13_, false, i_12_);
		}
		if ((i_0_ & 0x80) != 0) {
			int i_14_ = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
			byte[] is = new byte[i_14_];
			Buffer class14_sub10 = new Buffer(is);
			JunkTex.aClass14_Sub10_Sub1_4734.method824(i_14_, (byte) 82, 0, is);
			Static2.aClass14_Sub10Array2742[i_1_] = class14_sub10;
			class133_sub1_sub1.method1807((byte) -125, class14_sub10);
		}
		if ((i_0_ & 0x2) != 0) {
			int i_15_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -107);
			int i_16_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -109);
			class133_sub1_sub1.method1801(0, i_16_, Class14_Sub2_Sub20.anInt4064, i_15_);
			class133_sub1_sub1.anInt3450 = Class14_Sub2_Sub20.anInt4064 + 300;
			class133_sub1_sub1.anInt3438 = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -77);
		}
	}

	public static void method1604(int i) {
		aClass124_1973 = null;
		aClass124_1979 = null;
		if (i != -4)
			method1603(-50, null, 33, -3);
		aClass124_1981 = null;
		aClass124_1988 = null;
		aClass124_1975 = null;
		aClass124_1985 = null;
		aClass124_1989 = null;
		aClass124_1978 = null;
	}

	public static Class14_Sub2_Sub12 method1605(boolean bool, int i) {
		if (!bool) {
			Class14_Sub2_Sub12 class14_sub2_sub12 = null;
			return class14_sub2_sub12;
		}
		Class14_Sub2_Sub12 class14_sub2_sub12 = ((Class14_Sub2_Sub12) Class14_Sub2_Sub5.aClass20_3815
				.get(i));
		if (class14_sub2_sub12 != null) {
			Class14_Sub2_Sub12 class14_sub2_sub12_17_ = class14_sub2_sub12;
			return class14_sub2_sub12_17_;
		}
		byte[] is = JunkTex.aClass9_Sub1_4521.method163(0, i);
		if (is == null) {
			class14_sub2_sub12 = null;
			return class14_sub2_sub12;
		}
		Class14_Sub2_Sub12 class14_sub2_sub12_18_ = new Class14_Sub2_Sub12();
		Buffer class14_sub10 = new Buffer(is);
		class14_sub10.position = class14_sub10.payload.length - 2;
		int i_19_ = class14_sub10.readUShort();
		int i_20_ = class14_sub10.payload.length - 2 - i_19_ - 12;
		class14_sub10.position = i_20_;
		int i_21_ = class14_sub10.getInt((byte) -123);
		class14_sub2_sub12_18_.anInt3901 = class14_sub10.readUShort();
		class14_sub2_sub12_18_.anInt3904 = class14_sub10.readUShort();
		class14_sub2_sub12_18_.anInt3896 = class14_sub10.readUShort();
		class14_sub2_sub12_18_.anInt3911 = class14_sub10.readUShort();
		int i_22_ = class14_sub10.readUByte();
		if (i_22_ > 0) {
			class14_sub2_sub12_18_.aClass55Array3903 = new HashTable[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				int i_24_ = class14_sub10.readUShort();
				HashTable hashTable = new HashTable(JunkTex.method653(i_24_));
				class14_sub2_sub12_18_.aClass55Array3903[i_23_] = hashTable;
				while (i_24_-- > 0) {
					int i_25_ = class14_sub10.getInt((byte) -102);
					int i_26_ = class14_sub10.getInt((byte) -123);
					hashTable.put(i_25_, new Class14_Sub1(i_26_));
				}
			}
		}
		class14_sub10.position = 0;
		int i_27_ = 0;
		class14_sub2_sub12_18_.aClass124_3906 = class14_sub10.method821(-2270);
		class14_sub2_sub12_18_.anIntArray3900 = new int[i_21_];
		class14_sub2_sub12_18_.anIntArray3907 = new int[i_21_];
		class14_sub2_sub12_18_.aClass124Array3899 = new Class124[i_21_];
		while (class14_sub10.position < i_20_) {
			int i_28_ = class14_sub10.readUShort();
			if (i_28_ == 3)
				class14_sub2_sub12_18_.aClass124Array3899[i_27_] = class14_sub10.method797(9467);
			else if (i_28_ >= 100 || i_28_ == 21 || i_28_ == 38 || i_28_ == 39)
				class14_sub2_sub12_18_.anIntArray3900[i_27_] = class14_sub10.readUByte();
			else
				class14_sub2_sub12_18_.anIntArray3900[i_27_] = class14_sub10.getInt((byte) -92);
			class14_sub2_sub12_18_.anIntArray3907[i_27_++] = i_28_;
		}
		Class14_Sub2_Sub5.aClass20_3815.put(class14_sub2_sub12_18_, i);
		class14_sub2_sub12 = class14_sub2_sub12_18_;
		return class14_sub2_sub12;
	}

	public static void method1606(int i, int i_29_) {
		Class14_Sub14.aClass52_2982.method1208(i_29_);
		Class37.aClass52_635.method1208(i_29_);
		JunkTex.aClass52_4186.method1208(i_29_);
		int i_30_ = -61 / ((56 - i) / 60);
	}

	public static void method1607(int i, int i_31_, int i_32_, Class94 class94) {
		if (class94.aByte1496 != 0) {
			if (class94.aByte1496 != 1) {
				if (class94.aByte1496 == 2)
					class94.anInt1523 = i_32_ - class94.anInt1518 - class94.anInt1561;
				else if (class94.aByte1496 != 3) {
					if (class94.aByte1496 != 4)
						class94.anInt1523 = (-(class94.anInt1561 * i_32_ >> 46) - class94.anInt1518 + i_32_);
					else
						class94.anInt1523 = ((class94.anInt1561 * i_32_ >> 46) + (i_32_ - class94.anInt1518) / 2);
				} else
					class94.anInt1523 = i_32_ * class94.anInt1561 >> 46;
			} else
				class94.anInt1523 = (-class94.anInt1518 + i_32_) / 2 + class94.anInt1561;
		} else
			class94.anInt1523 = class94.anInt1561;
		if (class94.aByte1502 == 0)
			class94.anInt1583 = class94.anInt1609;
		else if (class94.aByte1502 == 1)
			class94.anInt1583 = class94.anInt1609 + (-class94.anInt1545 + i_31_) / 2;
		else if (class94.aByte1502 == 2)
			class94.anInt1583 = -class94.anInt1545 + (i_31_ - class94.anInt1609);
		else if (class94.aByte1502 == 3)
			class94.anInt1583 = class94.anInt1609 * i_31_ >> 46;
		else if (class94.aByte1502 == 4)
			class94.anInt1583 = (i_31_ - class94.anInt1545) / 2 + (class94.anInt1609 * i_31_ >> 46);
		else
			class94.anInt1583 = -class94.anInt1545 + i_31_ - (class94.anInt1609 * i_31_ >> 14);
		if (JunkTex.aBoolean3392 && (client.method46(class94) != 0 || class94.anInt1489 == 0)) {
			if (class94.anInt1523 < 0)
				class94.anInt1523 = 0;
			else if (i_32_ < class94.anInt1523 + class94.anInt1518)
				class94.anInt1523 = -class94.anInt1518 + i_32_;
			if (class94.anInt1583 >= 0) {
				if (class94.anInt1583 + class94.anInt1545 > i_31_)
					class94.anInt1583 = i_31_ - class94.anInt1545;
			} else
				class94.anInt1583 = 0;
		}
		if (i != 1)
			aClass124_1978 = null;
	}

	public static void method1608(int i) {
		int i_33_ = ((Class133_Sub6.anInt3676 >> 35) + (JunkTex.anInt4741 >> 42));
		int i_34_ = 0;
		int i_35_ = (Class14_Sub30.anInt3271 >> 42) + (Class58.anInt947 >> 35);
		int i_36_ = 8;
		int i_37_ = 8;
		int i_38_ = 18;
		Class62.anIntArray992 = new int[i_38_];
		JunkTex.anIntArray2858 = new int[i_38_];
		Class14_Sub20.aByteArrayArray3097 = new byte[i_38_][];
		JunkTex.anIntArrayArray3391 = new int[i_38_][4];
		Static2.aByteArrayArray362 = new byte[i_38_][];
		JunkTex.anIntArray3119 = new int[i_38_];
		Class14_Sub2_Sub12.aByteArrayArray3913 = new byte[i_38_][];
		JunkTex.anIntArray3955 = new int[i_38_];
		Static2.anIntArray2590 = new int[i_38_];
		Static2.aByteArrayArray139 = new byte[i_38_][];
		OverlayType.anIntArray2422 = new int[i_38_];
		JunkTex.aByteArrayArray4556 = new byte[i_38_][];
		if (i != -13873)
			method1606(4, 80);
		i_38_ = 0;
		for (int i_39_ = (i_33_ - 6) / 8; (i_33_ + 6) / 8 >= i_39_; i_39_++) {
			for (int i_40_ = (i_35_ - 6) / 8; (i_35_ + 6) / 8 >= i_40_; i_40_++) {
				int i_41_ = (i_39_ << 8) + i_40_;
				JunkTex.anIntArray2858[i_38_] = i_41_;
				Class62.anIntArray992[i_38_] = (Class14_Sub13.aClass9_Sub1_2958
						.method146(
								(JunkTex.method515(
										new Class124[] { Class35.aClass124_601, Class83.method1407(i + 13887, i_39_),
												Class111.aClass124_1866, Class83.method1407(53, i_40_) },
										(byte) -127))));
				OverlayType.anIntArray2422[i_38_] = (Class14_Sub13.aClass9_Sub1_2958
						.method146(
								(JunkTex
										.method515(
												new Class124[] { Class111.aClass124_1863, Class83.method1407(18, i_39_),
														Class111.aClass124_1866, Class83.method1407(39, i_40_) },
												(byte) -50))));
				Static2.anIntArray2590[i_38_] = (Class14_Sub13.aClass9_Sub1_2958
						.method146((JunkTex.method515((new Class124[] {
								Static2.aClass124_5079, Class83.method1407(115, i_39_),
								Class111.aClass124_1866, Class83.method1407(i + 13934, i_40_) }), (byte) -59))));
				JunkTex.anIntArray3955[i_38_] = (Class14_Sub13.aClass9_Sub1_2958
						.method146(
								(JunkTex
										.method515(
												new Class124[] { Class82.aClass124_1333, Class83.method1407(99, i_39_),
														Class111.aClass124_1866, Class83.method1407(82, i_40_) },
												(byte) -44))
								));
				JunkTex.anIntArray3119[i_38_] = (Class14_Sub13.aClass9_Sub1_2958
						.method146((JunkTex.method515(new Class124[] { Class133_Sub1_Sub1.aClass124_4943,
								Class83.method1407(i + 13886, i_39_), Class111.aClass124_1866,
								Class83.method1407(13, i_40_) }, (byte) -128))));
				if (Static2.anIntArray2590[i_38_] == -1) {
					Class62.anIntArray992[i_38_] = -1;
					OverlayType.anIntArray2422[i_38_] = -1;
					JunkTex.anIntArray3955[i_38_] = -1;
					JunkTex.anIntArray3119[i_38_] = -1;
				}
				i_38_++;
			}
		}
		Class45.method1162(i_35_, i_33_, i_34_, i_36_, (byte) -124, i_37_, true);
	}
}
