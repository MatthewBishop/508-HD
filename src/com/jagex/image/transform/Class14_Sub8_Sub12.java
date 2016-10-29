/* Class14_Sub8_Sub12 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub12 extends Class14_Sub8 {
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

	@Override
	public void postDecode() {
		aByteArray4284 = TexStatic.method527(anInt4300, (byte) -97);
		method540(125);
		for (int i_22_ = anInt4289 - 1; i_22_ >= 1; i_22_--) {
			short i_23_ = aShortArray4288[i_22_];
			if (i_23_ > 8 || i_23_ < -8)
				break;
			anInt4289--;
		}
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
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
									aShortArray4288[i_25_] = (short) (class14_sub10.method805(0));
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
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402)
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
		int i_37_ = TexStatic.anIntArray468[i_29_];
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
				aShortArray4288[i_44_] = (short) (int) (Math.pow(anInt4297 / 4096.0F, i_44_)
						* 4096.0);
				aShortArray4298[i_44_] = (short) (int) Math.pow(2.0, i_44_);
			}
		} else if (aShortArray4288 != null && anInt4289 == aShortArray4288.length) {
			aShortArray4298 = new short[anInt4289];
			for (int i_45_ = 0; i_45_ < anInt4289; i_45_++)
				aShortArray4298[i_45_] = (short) (int) Math.pow(2.0, i_45_);
		}
	}

	public void method542(int i, int i_46_, int[] is) {
		int i_47_ = TexStatic.anIntArray3623[i_46_] * anInt4291;
		if (i != (anInt4289 ^ 0xffffffff)) {
			int i_48_ = aShortArray4288[0];
			if (i_48_ > 8 || i_48_ < -8) {
				int i_49_ = aShortArray4298[0] << 12;
				int i_50_ = i_49_ * anInt4291 >> 44;
				int i_51_ = i_49_ * i_47_ >> 44;
				int i_52_ = i_51_ >> 12;
				int i_53_ = i_52_ + 1;
				i_51_ &= 0xfff;
				int i_54_ = TexStatic.anIntArray468[i_51_];
				int i_55_ = aByteArray4284[i_52_ & 0xff] & 0xff;
				if (i_50_ <= i_53_)
					i_53_ = 0;
				int i_56_ = i_49_ * anInt4282 >> 12;
				int i_57_ = aByteArray4284[i_53_ & 0xff] & 0xff;
				for (int i_58_ = 0; i_58_ < TexStatic.anInt1876; i_58_++) {
					int i_59_ = TexStatic.anIntArray4145[i_58_] * anInt4282;
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
					int i_67_ = TexStatic.anIntArray468[i_63_];
					int i_68_ = i_64_ + 1;
					int i_69_ = i_62_ * anInt4291 >> 44;
					if (i_69_ <= i_68_)
						i_68_ = 0;
					int i_70_ = aByteArray4284[i_68_ & 0xff] & 0xff;
					if (aBoolean4277 && anInt4289 - 1 == i_61_) {
						for (int i_71_ = 0; TexStatic.anInt1876 > i_71_; i_71_++) {
							int i_72_ = (anInt4282 * TexStatic.anIntArray4145[i_71_]);
							int i_73_ = method537(i_70_, i_63_, i_62_ * i_72_ >> 44, true, i_67_, i_66_, i_65_);
							i_73_ = (i_73_ * i_48_ >> 44) + is[i_71_];
							is[i_71_] = 2048 + (i_73_ >> 33);
						}
					} else {
						for (int i_74_ = 0; TexStatic.anInt1876 > i_74_; i_74_++) {
							int i_75_ = (TexStatic.anIntArray4145[i_74_] * anInt4282);
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
			int i_86_ = TexStatic.anIntArray468[i_79_];
			if (aBoolean4277) {
				for (int i_87_ = 0; TexStatic.anInt1876 > i_87_; i_87_++) {
					int i_88_ = TexStatic.anIntArray4145[i_87_] * anInt4282;
					int i_89_ = method537(i_85_, i_79_, i_88_ * i_77_ >> 12, true, i_86_, i_78_, i_83_);
					i_89_ = i_89_ * i_81_ >> 44;
					is[i_87_] = (i_89_ >> 1) + 2048;
				}
			} else {
				for (int i_90_ = 0; i_90_ < TexStatic.anInt1876; i_90_++) {
					int i_91_ = TexStatic.anIntArray4145[i_90_] * anInt4282;
					int i_92_ = method537(i_85_, i_79_, i_91_ * i_77_ >> 44, true, i_86_, i_78_, i_83_);
					is[i_90_] = i_81_ * i_92_ >> 44;
				}
			}
		}
	}
}
