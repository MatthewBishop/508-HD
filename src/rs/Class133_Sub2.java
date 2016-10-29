/* Class133_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;

public class Class133_Sub2 extends Class133 {
	public short aShort3506;
	public int[] anIntArray3507;
	public static int[] anIntArray3508;
	public int[][] anIntArrayArray3509;
	public int[] anIntArray3510;
	public short[] aShortArray3511;
	public short[] aShortArray3512;
	public int[] anIntArray3513;
	public byte[] aByteArray3514;
	public Class89[] aClass89Array3515;
	public byte[] aByteArray3516;
	public short aShort3517;
	public byte[] aByteArray3518;
	public static int[] anIntArray3519 = new int[10000];
	public short[] aShortArray3520;
	public int anInt3521 = 0;
	public short[] aShortArray3522;
	public static int[] anIntArray3523;
	public short aShort3524;
	public short aShort3525;
	public int[] anIntArray3526;
	public short[] aShortArray3527;
	public short[] aShortArray3528;
	public byte[] aByteArray3529;
	public int[] anIntArray3530;
	public short[] aShortArray3531;
	public int[] anIntArray3532;
	public short[] aShortArray3533;
	public byte[] aByteArray3534;
	public byte[] aByteArray3535;
	public Class138[] aClass138Array3536;
	public static int anInt3537;
	public short aShort3538;
	public short aShort3539;
	public int[] anIntArray3540;
	public byte[] aByteArray3541;
	public byte aByte3542;
	public boolean aBoolean3543 = false;
	public int anInt3544;
	public int[][] anIntArrayArray3545;
	public byte[] aByteArray3546;
	public int anInt3547;
	public byte[] aByteArray3548;
	public int[] anIntArray3549;
	public short aShort3550;
	public static int[] anIntArray3551;
	public Class89[] aClass89Array3552;
	public short aShort3553;
	public byte[] aByteArray3554;

	static {
		anIntArray3508 = Class3.cos;
		anInt3537 = 0;
		anIntArray3551 = new int[10000];
		anIntArray3523 = Class3.sin;
	}

	public void method1812() {
		if (!aBoolean3543) {
			aBoolean3543 = true;
			int i = 32767;
			int i_0_ = 32767;
			int i_1_ = 32767;
			int i_2_ = -32768;
			int i_3_ = -32768;
			int i_4_ = -32768;
			for (int i_5_ = 0; i_5_ < anInt3521; i_5_++) {
				int i_6_ = anIntArray3530[i_5_];
				int i_7_ = anIntArray3526[i_5_];
				int i_8_ = anIntArray3510[i_5_];
				if (i_6_ < i)
					i = i_6_;
				if (i_6_ > i_2_)
					i_2_ = i_6_;
				if (i_7_ < i_0_)
					i_0_ = i_7_;
				if (i_7_ > i_3_)
					i_3_ = i_7_;
				if (i_8_ < i_1_)
					i_1_ = i_8_;
				if (i_8_ > i_4_)
					i_4_ = i_8_;
			}
			aShort3524 = (short) i;
			aShort3538 = (short) i_2_;
			aShort3506 = (short) i_0_;
			aShort3550 = (short) i_3_;
			aShort3517 = (short) i_1_;
			aShort3553 = (short) i_4_;
		}
	}

	public void method1813(short i, short i_9_) {
		for (int i_10_ = 0; i_10_ < anInt3547; i_10_++) {
			if (aShortArray3533[i_10_] == i)
				aShortArray3533[i_10_] = i_9_;
		}
	}

	public int method1814(Class133_Sub2 class133_sub2_11_, int i) {
		int i_12_ = -1;
		int i_13_ = class133_sub2_11_.anIntArray3530[i];
		int i_14_ = class133_sub2_11_.anIntArray3526[i];
		int i_15_ = class133_sub2_11_.anIntArray3510[i];
		for (int i_16_ = 0; i_16_ < anInt3521; i_16_++) {
			if (i_13_ == anIntArray3530[i_16_] && i_14_ == anIntArray3526[i_16_] && i_15_ == anIntArray3510[i_16_]) {
				i_12_ = i_16_;
				break;
			}
		}
		if (i_12_ == -1) {
			anIntArray3530[anInt3521] = i_13_;
			anIntArray3526[anInt3521] = i_14_;
			anIntArray3510[anInt3521] = i_15_;
			if (class133_sub2_11_.anIntArray3513 != null)
				anIntArray3513[anInt3521] = class133_sub2_11_.anIntArray3513[i];
			i_12_ = anInt3521++;
		}
		return i_12_;
	}

	public void method1815(byte[] is) {
		boolean bool = false;
		boolean bool_17_ = false;
		Buffer class14_sub10 = new Buffer(is);
		Buffer class14_sub10_18_ = new Buffer(is);
		Buffer class14_sub10_19_ = new Buffer(is);
		Buffer class14_sub10_20_ = new Buffer(is);
		Buffer class14_sub10_21_ = new Buffer(is);
		class14_sub10.position = is.length - 18;
		int i = class14_sub10.readUShort((byte) 125);
		int i_22_ = class14_sub10.readUShort((byte) 125);
		int i_23_ = class14_sub10.readUByte();
		int i_24_ = class14_sub10.readUByte();
		int i_25_ = class14_sub10.readUByte();
		int i_26_ = class14_sub10.readUByte();
		int i_27_ = class14_sub10.readUByte();
		int i_28_ = class14_sub10.readUByte();
		int i_29_ = class14_sub10.readUShort((byte) 110);
		int i_30_ = class14_sub10.readUShort((byte) 109);
		int i_31_ = class14_sub10.readUShort((byte) 126);
		int i_32_ = class14_sub10.readUShort((byte) 107);
		int i_33_ = 0;
		int i_34_ = i_33_;
		i_33_ += i;
		int i_35_ = i_33_;
		i_33_ += i_22_;
		int i_36_ = i_33_;
		if (i_25_ == 255)
			i_33_ += i_22_;
		int i_37_ = i_33_;
		if (i_27_ == 1)
			i_33_ += i_22_;
		int i_38_ = i_33_;
		if (i_24_ == 1)
			i_33_ += i_22_;
		int i_39_ = i_33_;
		if (i_28_ == 1)
			i_33_ += i;
		int i_40_ = i_33_;
		if (i_26_ == 1)
			i_33_ += i_22_;
		int i_41_ = i_33_;
		i_33_ += i_32_;
		int i_42_ = i_33_;
		i_33_ += i_22_ * 2;
		int i_43_ = i_33_;
		i_33_ += i_23_ * 6;
		int i_44_ = i_33_;
		i_33_ += i_29_;
		int i_45_ = i_33_;
		i_33_ += i_30_;
		int i_46_ = i_33_;
		i_33_ += i_31_;
		anInt3521 = i;
		anInt3547 = i_22_;
		anInt3544 = i_23_;
		anIntArray3530 = new int[i];
		anIntArray3526 = new int[i];
		anIntArray3510 = new int[i];
		anIntArray3549 = new int[i_22_];
		anIntArray3507 = new int[i_22_];
		anIntArray3540 = new int[i_22_];
		if (i_23_ > 0) {
			aByteArray3514 = new byte[i_23_];
			aShortArray3520 = new short[i_23_];
			aShortArray3531 = new short[i_23_];
			aShortArray3511 = new short[i_23_];
		}
		if (i_28_ == 1)
			anIntArray3513 = new int[i];
		if (i_24_ == 1) {
			aByteArray3534 = new byte[i_22_];
			aByteArray3535 = new byte[i_22_];
			aShortArray3528 = new short[i_22_];
		}
		if (i_25_ == 255)
			aByteArray3546 = new byte[i_22_];
		else
			aByte3542 = (byte) i_25_;
		if (i_26_ == 1)
			aByteArray3541 = new byte[i_22_];
		if (i_27_ == 1)
			anIntArray3532 = new int[i_22_];
		aShortArray3533 = new short[i_22_];
		class14_sub10.position = i_34_;
		class14_sub10_18_.position = i_44_;
		class14_sub10_19_.position = i_45_;
		class14_sub10_20_.position = i_46_;
		class14_sub10_21_.position = i_39_;
		int i_47_ = 0;
		int i_48_ = 0;
		int i_49_ = 0;
		for (int i_50_ = 0; i_50_ < i; i_50_++) {
			int i_51_ = class14_sub10.readUByte();
			int i_52_ = 0;
			if ((i_51_ & 0x1) != 0)
				i_52_ = class14_sub10_18_.readSmart();
			int i_53_ = 0;
			if ((i_51_ & 0x2) != 0)
				i_53_ = class14_sub10_19_.readSmart();
			int i_54_ = 0;
			if ((i_51_ & 0x4) != 0)
				i_54_ = class14_sub10_20_.readSmart();
			anIntArray3530[i_50_] = i_47_ + i_52_;
			anIntArray3526[i_50_] = i_48_ + i_53_;
			anIntArray3510[i_50_] = i_49_ + i_54_;
			i_47_ = anIntArray3530[i_50_];
			i_48_ = anIntArray3526[i_50_];
			i_49_ = anIntArray3510[i_50_];
			if (i_28_ == 1)
				anIntArray3513[i_50_] = class14_sub10_21_.readUByte();
		}
		class14_sub10.position = i_42_;
		class14_sub10_18_.position = i_38_;
		class14_sub10_19_.position = i_36_;
		class14_sub10_20_.position = i_40_;
		class14_sub10_21_.position = i_37_;
		for (int i_55_ = 0; i_55_ < i_22_; i_55_++) {
			aShortArray3533[i_55_] = (short) class14_sub10.readUShort((byte) 113);
			if (i_24_ == 1) {
				int i_56_ = class14_sub10_18_.readUByte();
				if ((i_56_ & 0x1) == 1) {
					aByteArray3534[i_55_] = (byte) 1;
					bool = true;
				} else
					aByteArray3534[i_55_] = (byte) 0;
				if ((i_56_ & 0x2) == 2) {
					aByteArray3535[i_55_] = (byte) (i_56_ >> 2);
					aShortArray3528[i_55_] = aShortArray3533[i_55_];
					aShortArray3533[i_55_] = (short) 127;
					if (aShortArray3528[i_55_] != -1)
						bool_17_ = true;
				} else {
					aByteArray3535[i_55_] = (byte) -1;
					aShortArray3528[i_55_] = (short) -1;
				}
			}
			if (i_25_ == 255)
				aByteArray3546[i_55_] = class14_sub10_19_.method780((byte) -77);
			if (i_26_ == 1)
				aByteArray3541[i_55_] = class14_sub10_20_.method780((byte) -77);
			if (i_27_ == 1)
				anIntArray3532[i_55_] = class14_sub10_21_.readUByte();
		}
		class14_sub10.position = i_41_;
		class14_sub10_18_.position = i_35_;
		int i_57_ = 0;
		int i_58_ = 0;
		int i_59_ = 0;
		int i_60_ = 0;
		for (int i_61_ = 0; i_61_ < i_22_; i_61_++) {
			int i_62_ = class14_sub10_18_.readUByte();
			if (i_62_ == 1) {
				i_57_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_57_;
				i_58_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_58_;
				i_59_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_59_;
				anIntArray3549[i_61_] = i_57_;
				anIntArray3507[i_61_] = i_58_;
				anIntArray3540[i_61_] = i_59_;
			}
			if (i_62_ == 2) {
				i_58_ = i_59_;
				i_59_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_59_;
				anIntArray3549[i_61_] = i_57_;
				anIntArray3507[i_61_] = i_58_;
				anIntArray3540[i_61_] = i_59_;
			}
			if (i_62_ == 3) {
				i_57_ = i_59_;
				i_59_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_59_;
				anIntArray3549[i_61_] = i_57_;
				anIntArray3507[i_61_] = i_58_;
				anIntArray3540[i_61_] = i_59_;
			}
			if (i_62_ == 4) {
				int i_63_ = i_57_;
				i_57_ = i_58_;
				i_58_ = i_63_;
				i_59_ = class14_sub10.readSmart() + i_60_;
				i_60_ = i_59_;
				anIntArray3549[i_61_] = i_57_;
				anIntArray3507[i_61_] = i_58_;
				anIntArray3540[i_61_] = i_59_;
			}
		}
		class14_sub10.position = i_43_;
		for (int i_64_ = 0; i_64_ < i_23_; i_64_++) {
			aByteArray3514[i_64_] = (byte) 0;
			aShortArray3520[i_64_] = (short) class14_sub10.readUShort((byte) 127);
			aShortArray3531[i_64_] = (short) class14_sub10.readUShort((byte) 103);
			aShortArray3511[i_64_] = (short) class14_sub10.readUShort((byte) 123);
		}
		if (aByteArray3535 != null) {
			boolean bool_65_ = false;
			for (int i_66_ = 0; i_66_ < i_22_; i_66_++) {
				int i_67_ = aByteArray3535[i_66_] & 0xff;
				if (i_67_ != 255) {
					if (((aShortArray3520[i_67_] & 0xffff) == anIntArray3549[i_66_])
							&& ((aShortArray3531[i_67_] & 0xffff) == anIntArray3507[i_66_])
							&& ((aShortArray3511[i_67_] & 0xffff) == anIntArray3540[i_66_]))
						aByteArray3535[i_66_] = (byte) -1;
					else
						bool_65_ = true;
				}
			}
			if (!bool_65_)
				aByteArray3535 = null;
		}
		if (!bool_17_)
			aShortArray3528 = null;
		if (!bool)
			aByteArray3534 = null;
	}

	public void method1816() {
		aClass89Array3552 = null;
		aClass89Array3515 = null;
		aClass138Array3536 = null;
		aBoolean3543 = false;
	}

	public void method1817(int i, int i_68_, int i_69_) {
		if (i_69_ != 0) {
			int i_70_ = anIntArray3523[i_69_];
			int i_71_ = anIntArray3508[i_69_];
			for (int i_72_ = 0; i_72_ < anInt3521; i_72_++) {
				int i_73_ = ((anIntArray3526[i_72_] * i_70_ + anIntArray3530[i_72_] * i_71_) >> 16);
				anIntArray3526[i_72_] = (anIntArray3526[i_72_] * i_71_ - anIntArray3530[i_72_] * i_70_) >> 16;
				anIntArray3530[i_72_] = i_73_;
			}
		}
		if (i != 0) {
			int i_74_ = anIntArray3523[i];
			int i_75_ = anIntArray3508[i];
			for (int i_76_ = 0; i_76_ < anInt3521; i_76_++) {
				int i_77_ = ((anIntArray3526[i_76_] * i_75_ - anIntArray3510[i_76_] * i_74_) >> 16);
				anIntArray3510[i_76_] = (anIntArray3526[i_76_] * i_74_ + anIntArray3510[i_76_] * i_75_) >> 16;
				anIntArray3526[i_76_] = i_77_;
			}
		}
		if (i_68_ != 0) {
			int i_78_ = anIntArray3523[i_68_];
			int i_79_ = anIntArray3508[i_68_];
			for (int i_80_ = 0; i_80_ < anInt3521; i_80_++) {
				int i_81_ = ((anIntArray3510[i_80_] * i_78_ + anIntArray3530[i_80_] * i_79_) >> 16);
				anIntArray3510[i_80_] = (anIntArray3510[i_80_] * i_79_ - anIntArray3530[i_80_] * i_78_) >> 16;
				anIntArray3530[i_80_] = i_81_;
			}
		}
	}

	public int method1818(int i, int i_82_, int i_83_) {
		for (int i_84_ = 0; i_84_ < anInt3521; i_84_++) {
			if (anIntArray3530[i_84_] == i && anIntArray3526[i_84_] == i_82_ && anIntArray3510[i_84_] == i_83_)
				return i_84_;
		}
		anIntArray3530[anInt3521] = i;
		anIntArray3526[anInt3521] = i_82_;
		anIntArray3510[anInt3521] = i_83_;
		return anInt3521++;
	}

	@Override
	public void method1788(Class133 class133, int i, int i_85_, int i_86_, boolean bool) {
		Class133_Sub2 class133_sub2_87_ = (Class133_Sub2) class133;
		class133_sub2_87_.method1812();
		class133_sub2_87_.method1826();
		anInt3537++;
		int i_88_ = 0;
		int[] is = class133_sub2_87_.anIntArray3530;
		int i_89_ = class133_sub2_87_.anInt3521;
		for (int i_90_ = 0; i_90_ < anInt3521; i_90_++) {
			Class89 class89 = aClass89Array3552[i_90_];
			if (class89.anInt1410 != 0) {
				int i_91_ = anIntArray3526[i_90_] - i_85_;
				if (i_91_ >= class133_sub2_87_.aShort3506 && i_91_ <= class133_sub2_87_.aShort3550) {
					int i_92_ = anIntArray3530[i_90_] - i;
					if (i_92_ >= class133_sub2_87_.aShort3524 && i_92_ <= class133_sub2_87_.aShort3538) {
						int i_93_ = anIntArray3510[i_90_] - i_86_;
						if (i_93_ >= class133_sub2_87_.aShort3517 && i_93_ <= class133_sub2_87_.aShort3553) {
							for (int i_94_ = 0; i_94_ < i_89_; i_94_++) {
								Class89 class89_95_ = (class133_sub2_87_.aClass89Array3552[i_94_]);
								if (i_92_ == is[i_94_] && i_93_ == (class133_sub2_87_.anIntArray3510[i_94_])
										&& i_91_ == (class133_sub2_87_.anIntArray3526[i_94_])
										&& class89_95_.anInt1410 != 0) {
									if (aClass89Array3515 == null)
										aClass89Array3515 = new Class89[anInt3521];
									if (class133_sub2_87_.aClass89Array3515 == null)
										class133_sub2_87_.aClass89Array3515 = new Class89[i_89_];
									Class89 class89_96_ = aClass89Array3515[i_90_];
									if (class89_96_ == null)
										class89_96_ = aClass89Array3515[i_90_] = new Class89(class89);
									Class89 class89_97_ = (class133_sub2_87_.aClass89Array3515[i_94_]);
									if (class89_97_ == null)
										class89_97_ = class133_sub2_87_.aClass89Array3515[i_94_] = new Class89(
												class89_95_);
									class89_96_.anInt1414 += class89_95_.anInt1414;
									class89_96_.anInt1404 += class89_95_.anInt1404;
									class89_96_.anInt1406 += class89_95_.anInt1406;
									class89_96_.anInt1410 += class89_95_.anInt1410;
									class89_97_.anInt1414 += class89.anInt1414;
									class89_97_.anInt1404 += class89.anInt1404;
									class89_97_.anInt1406 += class89.anInt1406;
									class89_97_.anInt1410 += class89.anInt1410;
									i_88_++;
									anIntArray3519[i_90_] = anInt3537;
									anIntArray3551[i_94_] = anInt3537;
								}
							}
						}
					}
				}
			}
		}
		if (i_88_ >= 3 && bool) {
			for (int i_98_ = 0; i_98_ < anInt3547; i_98_++) {
				if (anIntArray3519[anIntArray3549[i_98_]] == anInt3537
						&& anIntArray3519[anIntArray3507[i_98_]] == anInt3537
						&& anIntArray3519[anIntArray3540[i_98_]] == anInt3537) {
					if (aByteArray3534 == null)
						aByteArray3534 = new byte[anInt3547];
					aByteArray3534[i_98_] = (byte) 2;
				}
			}
			for (int i_99_ = 0; i_99_ < class133_sub2_87_.anInt3547; i_99_++) {
				if ((anIntArray3551[class133_sub2_87_.anIntArray3549[i_99_]] == anInt3537)
						&& (anIntArray3551[class133_sub2_87_.anIntArray3507[i_99_]] == anInt3537)
						&& (anIntArray3551[class133_sub2_87_.anIntArray3540[i_99_]] == anInt3537)) {
					if (class133_sub2_87_.aByteArray3534 == null)
						class133_sub2_87_.aByteArray3534 = new byte[class133_sub2_87_.anInt3547];
					class133_sub2_87_.aByteArray3534[i_99_] = (byte) 2;
				}
			}
		}
	}

	public void method1819(short i, short i_100_) {
		if (aShortArray3528 != null) {
			for (int i_101_ = 0; i_101_ < anInt3547; i_101_++) {
				if (aShortArray3528[i_101_] == i)
					aShortArray3528[i_101_] = i_100_;
			}
		}
	}

	@Override
	public boolean method1784() {
		return true;
	}

	public int method1820(int i, int i_102_, int i_103_, byte i_104_, short i_105_, byte i_106_) {
		anIntArray3549[anInt3547] = i;
		anIntArray3507[anInt3547] = i_102_;
		anIntArray3540[anInt3547] = i_103_;
		aByteArray3534[anInt3547] = i_104_;
		aByteArray3535[anInt3547] = (byte) -1;
		aShortArray3533[anInt3547] = i_105_;
		aShortArray3528[anInt3547] = (short) -1;
		aByteArray3541[anInt3547] = i_106_;
		return anInt3547++;
	}

	public void method1821(byte[] is) {
		Buffer class14_sub10 = new Buffer(is);
		Buffer class14_sub10_107_ = new Buffer(is);
		Buffer class14_sub10_108_ = new Buffer(is);
		Buffer class14_sub10_109_ = new Buffer(is);
		Buffer class14_sub10_110_ = new Buffer(is);
		Buffer class14_sub10_111_ = new Buffer(is);
		Buffer class14_sub10_112_ = new Buffer(is);
		class14_sub10.position = is.length - 23;
		int i = class14_sub10.readUShort((byte) 120);
		int i_113_ = class14_sub10.readUShort((byte) 124);
		int i_114_ = class14_sub10.readUByte();
		int i_115_ = class14_sub10.readUByte();
		int i_116_ = class14_sub10.readUByte();
		int i_117_ = class14_sub10.readUByte();
		int i_118_ = class14_sub10.readUByte();
		int i_119_ = class14_sub10.readUByte();
		int i_120_ = class14_sub10.readUByte();
		int i_121_ = class14_sub10.readUShort((byte) 110);
		int i_122_ = class14_sub10.readUShort((byte) 116);
		int i_123_ = class14_sub10.readUShort((byte) 107);
		int i_124_ = class14_sub10.readUShort((byte) 115);
		int i_125_ = class14_sub10.readUShort((byte) 109);
		int i_126_ = 0;
		int i_127_ = 0;
		int i_128_ = 0;
		if (i_114_ > 0) {
			aByteArray3514 = new byte[i_114_];
			class14_sub10.position = 0;
			for (int i_129_ = 0; i_129_ < i_114_; i_129_++) {
				byte i_130_ = (aByteArray3514[i_129_] = class14_sub10.method780((byte) -77));
				if (i_130_ == 0)
					i_126_++;
				if (i_130_ >= 1 && i_130_ <= 3)
					i_127_++;
				if (i_130_ == 2)
					i_128_++;
			}
		}
		int i_131_ = i_114_;
		int i_132_ = i_131_;
		i_131_ += i;
		int i_133_ = i_131_;
		if (i_115_ == 1)
			i_131_ += i_113_;
		int i_134_ = i_131_;
		i_131_ += i_113_;
		int i_135_ = i_131_;
		if (i_116_ == 255)
			i_131_ += i_113_;
		int i_136_ = i_131_;
		if (i_118_ == 1)
			i_131_ += i_113_;
		int i_137_ = i_131_;
		if (i_120_ == 1)
			i_131_ += i;
		int i_138_ = i_131_;
		if (i_117_ == 1)
			i_131_ += i_113_;
		int i_139_ = i_131_;
		i_131_ += i_124_;
		int i_140_ = i_131_;
		if (i_119_ == 1)
			i_131_ += i_113_ * 2;
		int i_141_ = i_131_;
		i_131_ += i_125_;
		int i_142_ = i_131_;
		i_131_ += i_113_ * 2;
		int i_143_ = i_131_;
		i_131_ += i_121_;
		int i_144_ = i_131_;
		i_131_ += i_122_;
		int i_145_ = i_131_;
		i_131_ += i_123_;
		int i_146_ = i_131_;
		i_131_ += i_126_ * 6;
		int i_147_ = i_131_;
		i_131_ += i_127_ * 6;
		int i_148_ = i_131_;
		i_131_ += i_127_ * 6;
		int i_149_ = i_131_;
		i_131_ += i_127_;
		int i_150_ = i_131_;
		i_131_ += i_127_;
		int i_151_ = i_131_;
		i_131_ += i_127_ + i_128_ * 2;
		anInt3521 = i;
		anInt3547 = i_113_;
		anInt3544 = i_114_;
		anIntArray3530 = new int[i];
		anIntArray3526 = new int[i];
		anIntArray3510 = new int[i];
		anIntArray3549 = new int[i_113_];
		anIntArray3507 = new int[i_113_];
		anIntArray3540 = new int[i_113_];
		if (i_120_ == 1)
			anIntArray3513 = new int[i];
		if (i_115_ == 1)
			aByteArray3534 = new byte[i_113_];
		if (i_116_ == 255)
			aByteArray3546 = new byte[i_113_];
		else
			aByte3542 = (byte) i_116_;
		if (i_117_ == 1)
			aByteArray3541 = new byte[i_113_];
		if (i_118_ == 1)
			anIntArray3532 = new int[i_113_];
		if (i_119_ == 1)
			aShortArray3528 = new short[i_113_];
		if (i_119_ == 1 && i_114_ > 0)
			aByteArray3535 = new byte[i_113_];
		aShortArray3533 = new short[i_113_];
		if (i_114_ > 0) {
			aShortArray3520 = new short[i_114_];
			aShortArray3531 = new short[i_114_];
			aShortArray3511 = new short[i_114_];
			if (i_127_ > 0) {
				aShortArray3512 = new short[i_127_];
				aShortArray3522 = new short[i_127_];
				aShortArray3527 = new short[i_127_];
				aByteArray3516 = new byte[i_127_];
				aByteArray3548 = new byte[i_127_];
				aByteArray3554 = new byte[i_127_];
			}
			if (i_128_ > 0) {
				aByteArray3518 = new byte[i_128_];
				aByteArray3529 = new byte[i_128_];
			}
		}
		class14_sub10.position = i_132_;
		class14_sub10_107_.position = i_143_;
		class14_sub10_108_.position = i_144_;
		class14_sub10_109_.position = i_145_;
		class14_sub10_110_.position = i_137_;
		int i_152_ = 0;
		int i_153_ = 0;
		int i_154_ = 0;
		for (int i_155_ = 0; i_155_ < i; i_155_++) {
			int i_156_ = class14_sub10.readUByte();
			int i_157_ = 0;
			if ((i_156_ & 0x1) != 0)
				i_157_ = class14_sub10_107_.readSmart();
			int i_158_ = 0;
			if ((i_156_ & 0x2) != 0)
				i_158_ = class14_sub10_108_.readSmart();
			int i_159_ = 0;
			if ((i_156_ & 0x4) != 0)
				i_159_ = class14_sub10_109_.readSmart();
			anIntArray3530[i_155_] = i_152_ + i_157_;
			anIntArray3526[i_155_] = i_153_ + i_158_;
			anIntArray3510[i_155_] = i_154_ + i_159_;
			i_152_ = anIntArray3530[i_155_];
			i_153_ = anIntArray3526[i_155_];
			i_154_ = anIntArray3510[i_155_];
			if (i_120_ == 1)
				anIntArray3513[i_155_] = class14_sub10_110_.readUByte();
		}
		class14_sub10.position = i_142_;
		class14_sub10_107_.position = i_133_;
		class14_sub10_108_.position = i_135_;
		class14_sub10_109_.position = i_138_;
		class14_sub10_110_.position = i_136_;
		class14_sub10_111_.position = i_140_;
		class14_sub10_112_.position = i_141_;
		for (int i_160_ = 0; i_160_ < i_113_; i_160_++) {
			aShortArray3533[i_160_] = (short) class14_sub10.readUShort((byte) 113);
			if (i_115_ == 1)
				aByteArray3534[i_160_] = class14_sub10_107_.method780((byte) -77);
			if (i_116_ == 255)
				aByteArray3546[i_160_] = class14_sub10_108_.method780((byte) -77);
			if (i_117_ == 1)
				aByteArray3541[i_160_] = class14_sub10_109_.method780((byte) -77);
			if (i_118_ == 1)
				anIntArray3532[i_160_] = class14_sub10_110_.readUByte();
			if (i_119_ == 1)
				aShortArray3528[i_160_] = (short) (class14_sub10_111_.readUShort((byte) 118) - 1);
			if (aByteArray3535 != null) {
				if (aShortArray3528[i_160_] != -1)
					aByteArray3535[i_160_] = (byte) (class14_sub10_112_.readUByte() - 1);
				else
					aByteArray3535[i_160_] = (byte) -1;
			}
		}
		class14_sub10.position = i_139_;
		class14_sub10_107_.position = i_134_;
		int i_161_ = 0;
		int i_162_ = 0;
		int i_163_ = 0;
		int i_164_ = 0;
		for (int i_165_ = 0; i_165_ < i_113_; i_165_++) {
			int i_166_ = class14_sub10_107_.readUByte();
			if (i_166_ == 1) {
				i_161_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_161_;
				i_162_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_162_;
				i_163_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_163_;
				anIntArray3549[i_165_] = i_161_;
				anIntArray3507[i_165_] = i_162_;
				anIntArray3540[i_165_] = i_163_;
			}
			if (i_166_ == 2) {
				i_162_ = i_163_;
				i_163_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_163_;
				anIntArray3549[i_165_] = i_161_;
				anIntArray3507[i_165_] = i_162_;
				anIntArray3540[i_165_] = i_163_;
			}
			if (i_166_ == 3) {
				i_161_ = i_163_;
				i_163_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_163_;
				anIntArray3549[i_165_] = i_161_;
				anIntArray3507[i_165_] = i_162_;
				anIntArray3540[i_165_] = i_163_;
			}
			if (i_166_ == 4) {
				int i_167_ = i_161_;
				i_161_ = i_162_;
				i_162_ = i_167_;
				i_163_ = class14_sub10.readSmart() + i_164_;
				i_164_ = i_163_;
				anIntArray3549[i_165_] = i_161_;
				anIntArray3507[i_165_] = i_162_;
				anIntArray3540[i_165_] = i_163_;
			}
		}
		class14_sub10.position = i_146_;
		class14_sub10_107_.position = i_147_;
		class14_sub10_108_.position = i_148_;
		class14_sub10_109_.position = i_149_;
		class14_sub10_110_.position = i_150_;
		class14_sub10_111_.position = i_151_;
		for (int i_168_ = 0; i_168_ < i_114_; i_168_++) {
			int i_169_ = aByteArray3514[i_168_] & 0xff;
			if (i_169_ == 0) {
				aShortArray3520[i_168_] = (short) class14_sub10.readUShort((byte) 116);
				aShortArray3531[i_168_] = (short) class14_sub10.readUShort((byte) 112);
				aShortArray3511[i_168_] = (short) class14_sub10.readUShort((byte) 111);
			}
			if (i_169_ == 1) {
				aShortArray3520[i_168_] = (short) class14_sub10_107_.readUShort((byte) 108);
				aShortArray3531[i_168_] = (short) class14_sub10_107_.readUShort((byte) 126);
				aShortArray3511[i_168_] = (short) class14_sub10_107_.readUShort((byte) 116);
				aShortArray3512[i_168_] = (short) class14_sub10_108_.readUShort((byte) 109);
				aShortArray3522[i_168_] = (short) class14_sub10_108_.readUShort((byte) 115);
				aShortArray3527[i_168_] = (short) class14_sub10_108_.readUShort((byte) 127);
				aByteArray3516[i_168_] = class14_sub10_109_.method780((byte) -77);
				aByteArray3548[i_168_] = class14_sub10_110_.method780((byte) -77);
				aByteArray3554[i_168_] = class14_sub10_111_.method780((byte) -77);
			}
			if (i_169_ == 2) {
				aShortArray3520[i_168_] = (short) class14_sub10_107_.readUShort((byte) 101);
				aShortArray3531[i_168_] = (short) class14_sub10_107_.readUShort((byte) 109);
				aShortArray3511[i_168_] = (short) class14_sub10_107_.readUShort((byte) 125);
				aShortArray3512[i_168_] = (short) class14_sub10_108_.readUShort((byte) 101);
				aShortArray3522[i_168_] = (short) class14_sub10_108_.readUShort((byte) 117);
				aShortArray3527[i_168_] = (short) class14_sub10_108_.readUShort((byte) 125);
				aByteArray3516[i_168_] = class14_sub10_109_.method780((byte) -77);
				aByteArray3548[i_168_] = class14_sub10_110_.method780((byte) -77);
				aByteArray3554[i_168_] = class14_sub10_111_.method780((byte) -77);
				aByteArray3518[i_168_] = class14_sub10_111_.method780((byte) -77);
				aByteArray3529[i_168_] = class14_sub10_111_.method780((byte) -77);
			}
			if (i_169_ == 3) {
				aShortArray3520[i_168_] = (short) class14_sub10_107_.readUShort((byte) 122);
				aShortArray3531[i_168_] = (short) class14_sub10_107_.readUShort((byte) 122);
				aShortArray3511[i_168_] = (short) class14_sub10_107_.readUShort((byte) 103);
				aShortArray3512[i_168_] = (short) class14_sub10_108_.readUShort((byte) 123);
				aShortArray3522[i_168_] = (short) class14_sub10_108_.readUShort((byte) 118);
				aShortArray3527[i_168_] = (short) class14_sub10_108_.readUShort((byte) 118);
				aByteArray3516[i_168_] = class14_sub10_109_.method780((byte) -77);
				aByteArray3548[i_168_] = class14_sub10_110_.method780((byte) -77);
				aByteArray3554[i_168_] = class14_sub10_111_.method780((byte) -77);
			}
		}
	}

	public ModelSD method1822(int i, int i_170_, int i_171_, int i_172_, int i_173_) {
		return new ModelSD(this, i, i_170_, i_171_, i_172_, i_173_);
	}

	public void method1823() {
		if (anIntArray3513 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_174_ = 0; i_174_ < anInt3521; i_174_++) {
				int i_175_ = anIntArray3513[i_174_];
				is[i_175_]++;
				if (i_175_ > i)
					i = i_175_;
			}
			anIntArrayArray3545 = new int[i + 1][];
			for (int i_176_ = 0; i_176_ <= i; i_176_++) {
				anIntArrayArray3545[i_176_] = new int[is[i_176_]];
				is[i_176_] = 0;
			}
			for (int i_177_ = 0; i_177_ < anInt3521; i_177_++) {
				int i_178_ = anIntArray3513[i_177_];
				anIntArrayArray3545[i_178_][is[i_178_]++] = i_177_;
			}
			anIntArray3513 = null;
		}
		if (anIntArray3532 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_179_ = 0; i_179_ < anInt3547; i_179_++) {
				int i_180_ = anIntArray3532[i_179_];
				is[i_180_]++;
				if (i_180_ > i)
					i = i_180_;
			}
			anIntArrayArray3509 = new int[i + 1][];
			for (int i_181_ = 0; i_181_ <= i; i_181_++) {
				anIntArrayArray3509[i_181_] = new int[is[i_181_]];
				is[i_181_] = 0;
			}
			for (int i_182_ = 0; i_182_ < anInt3547; i_182_++) {
				int i_183_ = anIntArray3532[i_182_];
				anIntArrayArray3509[i_183_][is[i_183_]++] = i_182_;
			}
			anIntArray3532 = null;
		}
	}

	public static Class133_Sub2 method1824(Class9 class9, int i, int i_184_) {
		byte[] is = class9.method163(i_184_, i, 0);
		if (is == null)
			return null;
		return new Class133_Sub2(is);
	}

	@Override
	public Class133 method1791(int i, int i_185_, int i_186_) {
		return method1827(aShort3539, aShort3525, i, i_185_, i_186_);
	}

	public void method1825(int i, int i_187_, int i_188_) {
		for (int i_189_ = 0; i_189_ < anInt3521; i_189_++) {
			anIntArray3530[i_189_] += i;
			anIntArray3526[i_189_] += i_187_;
			anIntArray3510[i_189_] += i_188_;
		}
		method1816();
	}

	public void method1826() {
		if (aClass89Array3552 == null) {
			aClass89Array3552 = new Class89[anInt3521];
			for (int i = 0; i < anInt3521; i++)
				aClass89Array3552[i] = new Class89();
			for (int i = 0; i < anInt3547; i++) {
				int i_190_ = anIntArray3549[i];
				int i_191_ = anIntArray3507[i];
				int i_192_ = anIntArray3540[i];
				int i_193_ = anIntArray3530[i_191_] - anIntArray3530[i_190_];
				int i_194_ = anIntArray3526[i_191_] - anIntArray3526[i_190_];
				int i_195_ = anIntArray3510[i_191_] - anIntArray3510[i_190_];
				int i_196_ = anIntArray3530[i_192_] - anIntArray3530[i_190_];
				int i_197_ = anIntArray3526[i_192_] - anIntArray3526[i_190_];
				int i_198_ = anIntArray3510[i_192_] - anIntArray3510[i_190_];
				int i_199_ = i_194_ * i_198_ - i_197_ * i_195_;
				int i_200_ = i_195_ * i_196_ - i_198_ * i_193_;
				int i_201_;
				for (i_201_ = i_193_ * i_197_ - i_196_ * i_194_; (i_199_ > 8192 || i_200_ > 8192 || i_201_ > 8192
						|| i_199_ < -8192 || i_200_ < -8192 || i_201_ < -8192); i_201_ >>= 1) {
					i_199_ >>= 1;
					i_200_ >>= 1;
				}
				int i_202_ = (int) Math.sqrt(i_199_ * i_199_ + i_200_ * i_200_ + i_201_ * i_201_);
				if (i_202_ <= 0)
					i_202_ = 1;
				i_199_ = i_199_ * 256 / i_202_;
				i_200_ = i_200_ * 256 / i_202_;
				i_201_ = i_201_ * 256 / i_202_;
				byte i_203_;
				if (aByteArray3534 == null)
					i_203_ = (byte) 0;
				else
					i_203_ = aByteArray3534[i];
				if (i_203_ == 0) {
					Class89 class89 = aClass89Array3552[i_190_];
					class89.anInt1414 += i_199_;
					class89.anInt1404 += i_200_;
					class89.anInt1406 += i_201_;
					class89.anInt1410++;
					class89 = aClass89Array3552[i_191_];
					class89.anInt1414 += i_199_;
					class89.anInt1404 += i_200_;
					class89.anInt1406 += i_201_;
					class89.anInt1410++;
					class89 = aClass89Array3552[i_192_];
					class89.anInt1414 += i_199_;
					class89.anInt1404 += i_200_;
					class89.anInt1406 += i_201_;
					class89.anInt1410++;
				} else if (i_203_ == 1) {
					if (aClass138Array3536 == null)
						aClass138Array3536 = new Class138[anInt3547];
					Class138 class138 = aClass138Array3536[i] = new Class138();
					class138.anInt2208 = i_199_;
					class138.anInt2217 = i_200_;
					class138.anInt2209 = i_201_;
				}
			}
		}
	}

	public Class133_Sub7 method1827(int i, int i_204_, int i_205_, int i_206_, int i_207_) {
		ModelHD modelhd = new ModelHD(this, i, i_204_, true);
		modelhd.method1913();
		return modelhd;
	}

	public static void method1828() {
		anIntArray3519 = null;
		anIntArray3551 = null;
		anIntArray3523 = null;
		anIntArray3508 = null;
	}

	@Override
	public int getMinY() {
		if (!aBoolean3543)
			method1812();
		return aShort3506;
	}

	@Override
	public void render(int i, int i_208_, int i_209_, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_,
			long l) {
		/* empty */
	}

	public Class133_Sub2() {
		aByte3542 = (byte) 0;
		anInt3547 = 0;
	}

	public Class133_Sub2(byte[] is) {
		aByte3542 = (byte) 0;
		anInt3547 = 0;
		if (is[is.length - 1] == -1 && is[is.length - 2] == -1)
			method1821(is);
		else
			method1815(is);
	}

	public Class133_Sub2(int i, int i_215_, int i_216_) {
		aByte3542 = (byte) 0;
		anInt3547 = 0;
		anIntArray3530 = new int[i];
		anIntArray3526 = new int[i];
		anIntArray3510 = new int[i];
		anIntArray3513 = new int[i];
		anIntArray3549 = new int[i_215_];
		anIntArray3507 = new int[i_215_];
		anIntArray3540 = new int[i_215_];
		aByteArray3534 = new byte[i_215_];
		aByteArray3546 = new byte[i_215_];
		aByteArray3541 = new byte[i_215_];
		aShortArray3533 = new short[i_215_];
		aShortArray3528 = new short[i_215_];
		aByteArray3535 = new byte[i_215_];
		anIntArray3532 = new int[i_215_];
		if (i_216_ > 0) {
			aByteArray3514 = new byte[i_216_];
			aShortArray3520 = new short[i_216_];
			aShortArray3531 = new short[i_216_];
			aShortArray3511 = new short[i_216_];
			aShortArray3512 = new short[i_216_];
			aShortArray3522 = new short[i_216_];
			aShortArray3527 = new short[i_216_];
			aByteArray3516 = new byte[i_216_];
			aByteArray3548 = new byte[i_216_];
			aByteArray3554 = new byte[i_216_];
			aByteArray3518 = new byte[i_216_];
			aByteArray3529 = new byte[i_216_];
		}
	}

	public Class133_Sub2(Class133_Sub2[] class133_sub2s, int i) {
		aByte3542 = (byte) 0;
		anInt3547 = 0;
		boolean bool = false;
		boolean bool_217_ = false;
		boolean bool_218_ = false;
		boolean bool_219_ = false;
		boolean bool_220_ = false;
		boolean bool_221_ = false;
		anInt3521 = 0;
		anInt3547 = 0;
		anInt3544 = 0;
		aByte3542 = (byte) -1;
		for (int i_222_ = 0; i_222_ < i; i_222_++) {
			Class133_Sub2 class133_sub2_223_ = class133_sub2s[i_222_];
			if (class133_sub2_223_ != null) {
				anInt3521 += class133_sub2_223_.anInt3521;
				anInt3547 += class133_sub2_223_.anInt3547;
				anInt3544 += class133_sub2_223_.anInt3544;
				if (class133_sub2_223_.aByteArray3546 != null)
					bool_217_ = true;
				else {
					if (aByte3542 == -1)
						aByte3542 = class133_sub2_223_.aByte3542;
					if (aByte3542 != class133_sub2_223_.aByte3542)
						bool_217_ = true;
				}
				bool = bool | class133_sub2_223_.aByteArray3534 != null;
				bool_218_ = bool_218_ | class133_sub2_223_.aByteArray3541 != null;
				bool_219_ = bool_219_ | class133_sub2_223_.anIntArray3532 != null;
				bool_220_ = bool_220_ | class133_sub2_223_.aShortArray3528 != null;
				bool_221_ = bool_221_ | class133_sub2_223_.aByteArray3535 != null;
			}
		}
		anIntArray3530 = new int[anInt3521];
		anIntArray3526 = new int[anInt3521];
		anIntArray3510 = new int[anInt3521];
		anIntArray3513 = new int[anInt3521];
		anIntArray3549 = new int[anInt3547];
		anIntArray3507 = new int[anInt3547];
		anIntArray3540 = new int[anInt3547];
		if (bool)
			aByteArray3534 = new byte[anInt3547];
		if (bool_217_)
			aByteArray3546 = new byte[anInt3547];
		if (bool_218_)
			aByteArray3541 = new byte[anInt3547];
		if (bool_219_)
			anIntArray3532 = new int[anInt3547];
		if (bool_220_)
			aShortArray3528 = new short[anInt3547];
		if (bool_221_)
			aByteArray3535 = new byte[anInt3547];
		aShortArray3533 = new short[anInt3547];
		if (anInt3544 > 0) {
			aByteArray3514 = new byte[anInt3544];
			aShortArray3520 = new short[anInt3544];
			aShortArray3531 = new short[anInt3544];
			aShortArray3511 = new short[anInt3544];
			aShortArray3512 = new short[anInt3544];
			aShortArray3522 = new short[anInt3544];
			aShortArray3527 = new short[anInt3544];
			aByteArray3516 = new byte[anInt3544];
			aByteArray3548 = new byte[anInt3544];
			aByteArray3554 = new byte[anInt3544];
			aByteArray3518 = new byte[anInt3544];
			aByteArray3529 = new byte[anInt3544];
		}
		anInt3521 = 0;
		anInt3547 = 0;
		anInt3544 = 0;
		for (int i_224_ = 0; i_224_ < i; i_224_++) {
			Class133_Sub2 class133_sub2_225_ = class133_sub2s[i_224_];
			if (class133_sub2_225_ != null) {
				for (int i_226_ = 0; i_226_ < class133_sub2_225_.anInt3547; i_226_++) {
					if (bool && class133_sub2_225_.aByteArray3534 != null)
						aByteArray3534[anInt3547] = class133_sub2_225_.aByteArray3534[i_226_];
					if (bool_217_) {
						if (class133_sub2_225_.aByteArray3546 != null)
							aByteArray3546[anInt3547] = class133_sub2_225_.aByteArray3546[i_226_];
						else
							aByteArray3546[anInt3547] = class133_sub2_225_.aByte3542;
					}
					if (bool_218_ && class133_sub2_225_.aByteArray3541 != null)
						aByteArray3541[anInt3547] = class133_sub2_225_.aByteArray3541[i_226_];
					if (bool_219_ && class133_sub2_225_.anIntArray3532 != null)
						anIntArray3532[anInt3547] = class133_sub2_225_.anIntArray3532[i_226_];
					if (bool_220_) {
						if (class133_sub2_225_.aShortArray3528 != null)
							aShortArray3528[anInt3547] = class133_sub2_225_.aShortArray3528[i_226_];
						else
							aShortArray3528[anInt3547] = (short) -1;
					}
					if (bool_221_) {
						if (class133_sub2_225_.aByteArray3535 != null
								&& class133_sub2_225_.aByteArray3535[i_226_] != -1)
							aByteArray3535[anInt3547] = (byte) ((class133_sub2_225_.aByteArray3535[i_226_])
									+ anInt3544);
						else
							aByteArray3535[anInt3547] = (byte) -1;
					}
					aShortArray3533[anInt3547] = class133_sub2_225_.aShortArray3533[i_226_];
					anIntArray3549[anInt3547] = method1814(class133_sub2_225_,
							(class133_sub2_225_.anIntArray3549[i_226_]));
					anIntArray3507[anInt3547] = method1814(class133_sub2_225_,
							(class133_sub2_225_.anIntArray3507[i_226_]));
					anIntArray3540[anInt3547] = method1814(class133_sub2_225_,
							(class133_sub2_225_.anIntArray3540[i_226_]));
					anInt3547++;
				}
				for (int i_227_ = 0; i_227_ < class133_sub2_225_.anInt3544; i_227_++) {
					byte i_228_ = (aByteArray3514[anInt3544] = class133_sub2_225_.aByteArray3514[i_227_]);
					if (i_228_ == 0) {
						aShortArray3520[anInt3544] = (short) method1814(class133_sub2_225_,
								(class133_sub2_225_.aShortArray3520[i_227_]));
						aShortArray3531[anInt3544] = (short) method1814(class133_sub2_225_,
								(class133_sub2_225_.aShortArray3531[i_227_]));
						aShortArray3511[anInt3544] = (short) method1814(class133_sub2_225_,
								(class133_sub2_225_.aShortArray3511[i_227_]));
					}
					if (i_228_ >= 1 && i_228_ <= 3) {
						aShortArray3520[anInt3544] = class133_sub2_225_.aShortArray3520[i_227_];
						aShortArray3531[anInt3544] = class133_sub2_225_.aShortArray3531[i_227_];
						aShortArray3511[anInt3544] = class133_sub2_225_.aShortArray3511[i_227_];
						aShortArray3512[anInt3544] = class133_sub2_225_.aShortArray3512[i_227_];
						aShortArray3522[anInt3544] = class133_sub2_225_.aShortArray3522[i_227_];
						aShortArray3527[anInt3544] = class133_sub2_225_.aShortArray3527[i_227_];
						aByteArray3516[anInt3544] = class133_sub2_225_.aByteArray3516[i_227_];
						aByteArray3548[anInt3544] = class133_sub2_225_.aByteArray3548[i_227_];
						aByteArray3554[anInt3544] = class133_sub2_225_.aByteArray3554[i_227_];
					}
					if (i_228_ == 2) {
						aByteArray3518[anInt3544] = class133_sub2_225_.aByteArray3518[i_227_];
						aByteArray3529[anInt3544] = class133_sub2_225_.aByteArray3529[i_227_];
					}
					anInt3544++;
				}
			}
		}
	}
}
