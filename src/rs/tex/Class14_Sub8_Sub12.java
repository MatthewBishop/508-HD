/* Class14_Sub8_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class125_Sub1;
import rs.Class126;
import rs.Class133_Sub3;
import rs.Class133_Sub5;
import rs.Class14_Sub15;
import rs.Class14_Sub21;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub30;
import rs.Class150;
import rs.Class24;
import rs.Class28;
import rs.Class3;
import rs.Class54;
import rs.Class62;
import rs.Class69;
import rs.Class74;
import rs.Class7_Sub3;
import rs.Class7_Sub3_Sub1;
import rs.Class83;
import rs.Class94;
import rs.Static2;

public class Class14_Sub8_Sub12 extends Class14_Sub8 {
	public static byte aByte4287 = 0;
	public static int anInt4280 = 0;
	public static int anInt4295;
	public static void method536(boolean bool) {
		if (!bool) {
			Class69.method1311((byte) 112);
			System.gc();
			Class126.method1743(27252, 25);
		}
	}
	public static void method538(byte i) {
		if (i > -120)
			anInt4295 = -101;
		Class150.aClass52_2406.clear();
		Class14_Sub8_Sub30.aClass52_4588.clear();
		Class83.aClass52_1339.clear();
	}
	public static void method539(int i, Class94[] class94s, int i_0_) {
		if (i != -2081454068)
			method541(-15, -103);
		for (int i_1_ = 0; i_1_ < class94s.length; i_1_++) {
			Class94 class94 = class94s[i_1_];
			if (class94 != null) {
				if (class94.anInt1489 == 0) {
					if (class94.aClass94Array1486 != null)
						method539(-2081454068, class94.aClass94Array1486, i_0_);
					Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
							.get((long) class94.anInt1548)));
					if (class14_sub15 != null)
						Class74.method1333(class14_sub15.anInt2999, (byte) 46, i_0_);
				}
				if (i_0_ == 0 && class94.anObjectArray1526 != null) {
					Class14_Sub21 class14_sub21 = new Class14_Sub21();
					class14_sub21.aClass94_3116 = class94;
					class14_sub21.anObjectArray3115 = class94.anObjectArray1526;
					Class133_Sub3.method1830(class14_sub21, -1976917689);
				}
				if (i_0_ == 1 && class94.anObjectArray1473 != null) {
					if (class94.anInt1478 >= 0) {
						Class94 class94_2_ = Static.method1233(class94.anInt1548, 21803);
						if (class94_2_ == null || class94_2_.aClass94Array1486 == null
								|| (class94_2_.aClass94Array1486.length <= class94.anInt1478)
								|| (class94_2_.aClass94Array1486[class94.anInt1478] != class94))
							continue;
					}
					Class14_Sub21 class14_sub21 = new Class14_Sub21();
					class14_sub21.aClass94_3116 = class94;
					class14_sub21.anObjectArray3115 = class94.anObjectArray1473;
					Class133_Sub3.method1830(class14_sub21, i ^ 0x9c5294b);
				}
			}
		}
	}
	public static Class14_Sub2_Sub11 method541(int i, int i_3_) {
		Class14_Sub2_Sub11 class14_sub2_sub11 = ((Class14_Sub2_Sub11) Class7_Sub3.aClass20_2680.get((long) i));
		if (class14_sub2_sub11 != null) {
			Class14_Sub2_Sub11 class14_sub2_sub11_4_ = class14_sub2_sub11;
			return class14_sub2_sub11_4_;
		}
		byte[] is;
		if (i >= 32768)
			is = Class62.aClass9_993.method163(i & 0x7fff, 0, 0);
		else
			is = Class54.aClass9_885.method163(i, 0, 0);
		if (i_3_ != 20083) {
			class14_sub2_sub11 = null;
			return class14_sub2_sub11;
		}
		Class14_Sub2_Sub11 class14_sub2_sub11_5_ = new Class14_Sub2_Sub11();
		if (is != null)
			class14_sub2_sub11_5_.method315((byte) -120, new Buffer(is));
		if (i >= 32768)
			class14_sub2_sub11_5_.method310(18859);
		Class7_Sub3.aClass20_2680.put(class14_sub2_sub11_5_, (long) i);
		class14_sub2_sub11 = class14_sub2_sub11_5_;
		return class14_sub2_sub11;
	}
	public static void method543(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = -16 / ((32 - i_10_) / 43);
		int i_14_ = i_6_ - 334;
		if (i_14_ < 0)
			i_14_ = 0;
		else if (i_14_ > 100)
			i_14_ = 100;
		int i_15_ = (i_14_ * (-Class125_Sub1.aShort3372 + Class28.aShort511) / 100 + Class125_Sub1.aShort3372);
		i_11_ = i_11_ * i_15_ >> 40;
		i_13_ = 2048 - i_7_ & 0x7ff;
		i_14_ = -i_8_ + 2048 & 0x7ff;
		int i_16_ = i_11_;
		int i_17_ = 0;
		if (i_13_ != 0) {
			int i_18_ = Class3.cos[i_13_];
			int i_19_ = Class3.sin[i_13_];
			i_17_ = i_19_ * -i_16_ >> 16;
			i_16_ = i_18_ * i_16_ >> 16;
		}
		i_15_ = 0;
		if (i_14_ != 0) {
			int i_20_ = Class3.cos[i_14_];
			int i_21_ = Class3.sin[i_14_];
			i_15_ = i_16_ * i_21_ >> 48;
			i_16_ = i_20_ * i_16_ >> 16;
		}
		Class69.anInt1072 = i_8_;
		Class14_Sub30.anInt3271 = -i_16_ + i_9_;
		Class14_Sub8_Sub38.anInt4741 = i_12_ - i_15_;
		Class7_Sub3_Sub1.anInt3719 = i_7_;
		Static2.anInt2926 = i - i_17_;
	}
	public boolean aBoolean4277 = true;
	public byte[] aByteArray4284 = new byte[512];
	public int anInt4282 = 4;
	public int anInt4289;

	public int anInt4291 = 4;

	public int anInt4297;

	public int anInt4300;

	public short[] aShortArray4288;

	public short[] aShortArray4298;

	public Class14_Sub8_Sub12() {
		super(0, true);
		anInt4289 = 4;
		anInt4297 = 1638;
		anInt4300 = 0;
	}

	public void method472() {
		aByteArray4284 = Class14_Sub8_Sub10.method527(anInt4300, (byte) -97);
		method540(125);
		for (int i_22_ = anInt4289 - 1; i_22_ >= 1; i_22_--) {
			short i_23_ = aShortArray4288[i_22_];
			if (i_23_ > 8 || i_23_ < -8)
				break;
			anInt4289--;
		}
	}

	public void method475(int i, int i_24_, Buffer class14_sub10) {
		int i_25_ = i;
		while_94_: do {
			while_93_: do {
				while_92_: do {
					while_91_: do {
						while_90_: do {
							do {
								if (i_25_ != 0) {
									if (i_25_ != 1) {
										if (i_25_ != 2) {
											if (i_25_ != 3) {
												if (i_25_ != 4) {
													if (i_25_ != 5) {
														if (i_25_ == 6)
															break while_93_;
														break while_94_;
													}
												} else
													break while_91_;
												break while_92_;
											}
										} else
											break;
										break while_90_;
									}
								} else {
									aBoolean4277 = class14_sub10.readUByte() == 1;
									break while_94_;
								}
								anInt4289 = class14_sub10.readUByte();
								break while_94_;
							} while (false);
							anInt4297 = class14_sub10.method805(0);
							if (anInt4297 < 0) {
								aShortArray4288 = new short[anInt4289];
								for (i_25_ = 0; anInt4289 > i_25_; i_25_++)
									aShortArray4288[i_25_] = (short) (class14_sub10.method805(i_24_ - 24777));
							}
							break while_94_;
						} while (false);
						anInt4282 = anInt4291 = class14_sub10.readUByte();
						break while_94_;
					} while (false);
					anInt4300 = class14_sub10.readUByte();
					break while_94_;
				} while (false);
				anInt4282 = class14_sub10.readUByte();
				break while_94_;
			} while (false);
			anInt4291 = class14_sub10.readUByte();
		} while (false);
		if (i_24_ != 24777)
			anInt4291 = 41;
	}

	public int[] method484(int i, byte i_26_) {
		if (i_26_ >= -58)
			anInt4289 = -91;
		int[] is = aClass149_2851.method2014(i, (byte) 122);
		if (aClass149_2851.aBoolean2402)
			method542(-2, i, is);
		int[] is_27_ = is;
		return is_27_;
	}

	public int method537(int i, int i_28_, int i_29_, boolean bool, int i_30_, int i_31_, int i_32_) {
		int i_33_ = i_28_ - 4096;
		int i_34_ = i_29_ >> 12;
		int i_35_ = i_34_ + 1;
		i_29_ &= 0xfff;
		if (i_31_ <= i_35_)
			i_35_ = 0;
		i_35_ &= 0xff;
		int i_36_ = i_29_ - 4096;
		int i_37_ = Class24.anIntArray468[i_29_];
		i_34_ &= 0xff;
		int i_38_ = aByteArray4284[i_34_ + i_32_] & 0x3;
		int i_39_;
		if (i_38_ > 1)
			i_39_ = i_38_ != 2 ? -i_29_ - i_28_ : i_29_ - i_28_;
		else
			i_39_ = i_38_ == 0 ? i_29_ + i_28_ : -i_29_ + i_28_;
		if (!bool)
			anInt4291 = -71;
		i_38_ = aByteArray4284[i_32_ + i_35_] & 0x3;
		int i_40_;
		if (i_38_ > 1)
			i_40_ = i_38_ != 2 ? -i_36_ - i_28_ : i_36_ - i_28_;
		else
			i_40_ = i_38_ == 0 ? i_36_ + i_28_ : i_28_ - i_36_;
		i_38_ = aByteArray4284[i + i_34_] & 0x3;
		int i_41_ = ((i_40_ - i_39_) * i_37_ >> 12) + i_39_;
		if (i_38_ > 1)
			i_39_ = i_38_ != 2 ? -i_33_ - i_29_ : -i_33_ + i_29_;
		else
			i_39_ = i_38_ != 0 ? -i_29_ + i_33_ : i_33_ + i_29_;
		i_38_ = aByteArray4284[i + i_35_] & 0x3;
		if (i_38_ <= 1)
			i_40_ = i_38_ != 0 ? i_33_ - i_36_ : i_33_ + i_36_;
		else
			i_40_ = i_38_ == 2 ? i_36_ - i_33_ : -i_33_ - i_36_;
		int i_42_ = i_39_ + (i_37_ * (i_40_ - i_39_) >> 44);
		int i_43_ = i_41_ + ((-i_41_ + i_42_) * i_30_ >> 44);
		return i_43_;
	}

	public void method540(int i) {
		if (i <= 117)
			aByteArray4284 = null;
		if (anInt4297 > 0) {
			aShortArray4298 = new short[anInt4289];
			aShortArray4288 = new short[anInt4289];
			for (int i_44_ = 0; i_44_ < anInt4289; i_44_++) {
				aShortArray4288[i_44_] = (short) (int) (Math.pow((double) ((float) anInt4297 / 4096.0F), (double) i_44_)
						* 4096.0);
				aShortArray4298[i_44_] = (short) (int) Math.pow(2.0, (double) i_44_);
			}
		} else if (aShortArray4288 != null && anInt4289 == aShortArray4288.length) {
			aShortArray4298 = new short[anInt4289];
			for (int i_45_ = 0; i_45_ < anInt4289; i_45_++)
				aShortArray4298[i_45_] = (short) (int) Math.pow(2.0, (double) i_45_);
		}
	}

	public void method542(int i, int i_46_, int[] is) {
		int i_47_ = Class133_Sub5.anIntArray3623[i_46_] * anInt4291;
		if (i != (anInt4289 ^ 0xffffffff)) {
			int i_48_ = aShortArray4288[0];
			if (i_48_ > 8 || i_48_ < -8) {
				int i_49_ = aShortArray4298[0] << 12;
				int i_50_ = i_49_ * anInt4291 >> 44;
				int i_51_ = i_49_ * i_47_ >> 44;
				int i_52_ = i_51_ >> 12;
				int i_53_ = i_52_ + 1;
				i_51_ &= 0xfff;
				int i_54_ = Class24.anIntArray468[i_51_];
				int i_55_ = aByteArray4284[i_52_ & 0xff] & 0xff;
				if (i_50_ <= i_53_)
					i_53_ = 0;
				int i_56_ = i_49_ * anInt4282 >> 12;
				int i_57_ = aByteArray4284[i_53_ & 0xff] & 0xff;
				for (int i_58_ = 0; i_58_ < Class112.anInt1876; i_58_++) {
					int i_59_ = Class14_Sub8_Sub4.anIntArray4145[i_58_] * anInt4282;
					int i_60_ = method537(i_57_, i_51_, i_59_ * i_49_ >> 44, true, i_54_, i_56_, i_55_);
					is[i_58_] = i_60_ * i_48_ >> 44;
				}
			}
			for (int i_61_ = 1; i_61_ < anInt4289; i_61_++) {
				i_48_ = aShortArray4288[i_61_];
				if (i_48_ > 8 || i_48_ < -8) {
					int i_62_ = aShortArray4298[i_61_] << 44;
					int i_63_ = i_62_ * i_47_ >> 12;
					int i_64_ = i_63_ >> 12;
					i_63_ &= 0xfff;
					int i_65_ = aByteArray4284[i_64_ & 0xff] & 0xff;
					int i_66_ = i_62_ * anInt4282 >> 44;
					int i_67_ = Class24.anIntArray468[i_63_];
					int i_68_ = i_64_ + 1;
					int i_69_ = i_62_ * anInt4291 >> 44;
					if (i_69_ <= i_68_)
						i_68_ = 0;
					int i_70_ = aByteArray4284[i_68_ & 0xff] & 0xff;
					if (aBoolean4277 && anInt4289 - 1 == i_61_) {
						for (int i_71_ = 0; Class112.anInt1876 > i_71_; i_71_++) {
							int i_72_ = (anInt4282 * Class14_Sub8_Sub4.anIntArray4145[i_71_]);
							int i_73_ = method537(i_70_, i_63_, i_62_ * i_72_ >> 44, true, i_67_, i_66_, i_65_);
							i_73_ = (i_73_ * i_48_ >> 44) + is[i_71_];
							is[i_71_] = 2048 + (i_73_ >> 33);
						}
					} else {
						for (int i_74_ = 0; Class112.anInt1876 > i_74_; i_74_++) {
							int i_75_ = (Class14_Sub8_Sub4.anIntArray4145[i_74_] * anInt4282);
							int i_76_ = method537(i_70_, i_63_, i_75_ * i_62_ >> 44, true, i_67_, i_66_, i_65_);
							is[i_74_] += i_76_ * i_48_ >> 12;
						}
					}
				}
			}
		} else {
			int i_77_ = aShortArray4298[0] << 44;
			int i_78_ = i_77_ * anInt4282 >> 44;
			int i_79_ = i_77_ * i_47_ >> 44;
			int i_80_ = anInt4291 * i_77_ >> 12;
			int i_81_ = aShortArray4288[0];
			int i_82_ = i_79_ >> 44;
			int i_83_ = aByteArray4284[i_82_ & 0xff] & 0xff;
			int i_84_ = i_82_ + 1;
			i_79_ &= 0xfff;
			if (i_80_ <= i_84_)
				i_84_ = 0;
			int i_85_ = aByteArray4284[i_84_ & 0xff] & 0xff;
			int i_86_ = Class24.anIntArray468[i_79_];
			if (aBoolean4277) {
				for (int i_87_ = 0; Class112.anInt1876 > i_87_; i_87_++) {
					int i_88_ = Class14_Sub8_Sub4.anIntArray4145[i_87_] * anInt4282;
					int i_89_ = method537(i_85_, i_79_, i_88_ * i_77_ >> 12, true, i_86_, i_78_, i_83_);
					i_89_ = i_89_ * i_81_ >> 44;
					is[i_87_] = (i_89_ >> 1) + 2048;
				}
			} else {
				for (int i_90_ = 0; i_90_ < Class112.anInt1876; i_90_++) {
					int i_91_ = Class14_Sub8_Sub4.anIntArray4145[i_90_] * anInt4282;
					int i_92_ = method537(i_85_, i_79_, i_91_ * i_77_ >> 44, true, i_86_, i_78_, i_83_);
					is[i_90_] = i_81_ * i_92_ >> 44;
				}
			}
		}
	}
}
