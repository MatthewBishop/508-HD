/* Class14_Sub8_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Random;

import com.jagex.io.Buffer;
import com.jagex.link.Class52;

import rs.Class100;
import rs.Class112;
import rs.Class116;
import rs.Class124;
import rs.Class137;
import rs.Class138;
import rs.Class146;
import rs.Class14_Sub18;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub9;
import rs.Class152;
import rs.Class153;
import rs.Class17;
import rs.Class35;
import rs.Class46;
import rs.Class47;
import rs.Class65;
import rs.Class72;
import rs.Class9;
import rs.Class90;
import rs.Class97;
import rs.Static2;

public class Class14_Sub8_Sub6 extends Class14_Sub8 {
	public static boolean aBoolean4188;
	public static Class124 aClass124_4189;
	public static Class124 aClass124_4192;
	public static Class52 aClass52_4186 = new Class52(5);
	public static Class9 aClass9_4193;
	public static int anInt4187;
	public static int anInt4190 = 3;
	public static int[] anIntArray4191;
	public static byte[][][] overlays;
	static {
		aBoolean4188 = false;
		aClass124_4189 = Class14_Sub2_Sub2.method263(1178, ":chalreq:");
		aClass124_4192 = Class14_Sub2_Sub2.method263(1178, "_labels");
	}
	public static void method506(int i, Class124 class124) {
		if (i != 25514)
			anInt4190 = 28;
		int i_0_ = Class14_Sub8_Sub13.method546(class124, -23861);
		if (i_0_ != -1) {
			Static.anInt427 = (Class152.aClass146_2435.aShortArray2354[i_0_] - Class65.anInt1034);
			Class14_Sub18.anInt3050 = (Class14_Sub8_Sub15.anInt4332 - 1
					+ (-Class152.aClass146_2435.aShortArray2361[i_0_] + Class35.anInt603));
			int i_1_ = (Static.anInt427 - (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426));
			int i_2_ = (-(int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426)
					+ Class14_Sub18.anInt3050);
			int i_3_ = (Static.anInt427 + (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426));
			if (i_1_ < 0)
				Static.anInt427 = (int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426);
			if (i_3_ > Class14_Sub2_Sub9.anInt3856)
				Static.anInt427 = (-(int) ((float) Class97.aClass94_1657.anInt1518 / Class90.aFloat1426)
						+ Class14_Sub2_Sub9.anInt3856);
			int i_4_ = (Class14_Sub18.anInt3050 + (int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426));
			if (i_2_ < 0)
				Class14_Sub18.anInt3050 = (int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426);
			if (i_4_ > Class14_Sub8_Sub15.anInt4332)
				Class14_Sub18.anInt3050 = (-(int) ((float) Class97.aClass94_1657.anInt1545 / Class90.aFloat1426)
						+ Class14_Sub8_Sub15.anInt4332);
		}
	}
	public static Class146 method507(boolean bool, Class124 class124, Class9 class9) {
		int i = class9.method146(class124, 0);
		if (i == -1) {
			Class146 class146 = new Class146(0);
			return class146;
		}
		int[] is = class9.method176((byte) 78, i);
		if (!bool)
			anInt4190 = 7;
		Class146 class146 = new Class146(is.length);
		for (int i_5_ = 0; i_5_ < class146.anInt2353; i_5_++) {
			Buffer class14_sub10 = new Buffer(class9.method163(is[i_5_], i, 0));
			class146.aClass124Array2362[i_5_] = class14_sub10.method797(9467);
			class146.aByteArray2355[i_5_] = class14_sub10.method780((byte) -77);
			class146.aShortArray2354[i_5_] = (short) class14_sub10.method784((byte) 126);
			class146.aShortArray2361[i_5_] = (short) class14_sub10.method784((byte) 122);
			class146.anIntArray2350[i_5_] = class14_sub10.method812((byte) -108);
		}
		Class146 class146_6_ = class146;
		return class146_6_;
	}
	public static void method508(byte i) {
		if (i == -123) {
			aClass124_4189 = null;
			aClass124_4192 = null;
			aClass52_4186 = null;
			anIntArray4191 = null;
			overlays = null;
			aClass9_4193 = null;
		}
	}
	public static void method509(int i, int i_7_, int i_8_, boolean bool, Class46 class46, int i_9_) {
		if (Static.anInt96 < 50 && class46.anIntArrayArray776 != null && class46.anIntArrayArray776.length > i_7_
				&& class46.anIntArrayArray776[i_7_] != null) {
			int i_10_ = class46.anIntArrayArray776[i_7_][0];
			int i_11_ = i_10_ >> 8;
			int i_12_ = i_10_ & 0xf;
			int i_13_ = 31 / ((-39 - i_8_) / 61);
			int i_14_ = i_10_ >> 36 & 0x7;
			if (class46.anIntArrayArray776[i_7_].length > 1) {
				int i_15_ = (int) ((double) class46.anIntArrayArray776[i_7_].length * Math.random());
				if (i_15_ > 0)
					i_11_ = class46.anIntArrayArray776[i_7_][i_15_];
			}
			if (i_12_ == 0) {
				if (bool)
					Class47.method1181(i_14_, i_11_, 0, (byte) -125);
			} else if (Class100.anInt1691 != 0) {
				Class153.anIntArray2454[Static.anInt96] = i_11_;
				Static2.anIntArray4052[Static.anInt96] = i_14_;
				i_10_ = (i - 64) / 128;
				i_13_ = (i_9_ - 64) / 128;
				Static2.anIntArray3949[Static.anInt96] = 0;
				Class137.aClass91Array2197[Static.anInt96] = null;
				Class116.anIntArray1928[Static.anInt96] = i_12_ + (i_10_ << 48) + (i_13_ << 40);
				Static.anInt96++;
			}
		}
	}
	public int anInt4169;
	public int anInt4170;
	public int anInt4173;
	public int anInt4174;
	public int anInt4176 = 1024;

	public int anInt4177;

	public int anInt4178;

	public int anInt4179;

	public int anInt4180;

	public int anInt4185;

	public Class14_Sub8_Sub6() {
		super(0, true);
		anInt4174 = 2048;
		anInt4170 = 0;
		anInt4173 = 1024;
		anInt4178 = 1024;
		anInt4169 = 409;
		anInt4180 = 819;
		anInt4177 = 1024;
		anInt4185 = 0;
	}

	public void method472() {
	}

	public void method475(int i, int i_16_, Buffer class14_sub10) {
		int i_17_ = i;
		while_208_: do {
			while_207_: do {
				while_206_: do {
					while_205_: do {
						while_204_: do {
							while_203_: do {
								while_202_: do {
									do {
										if (i_17_ != 0) {
											if (i_17_ != 1) {
												if (i_17_ != 2) {
													if (i_17_ != 3) {
														if (i_17_ != 4) {
															if (i_17_ != 5) {
																if (i_17_ != 6) {
																	if (i_17_ != 7) {
																		if (i_17_ == 8)
																			break while_207_;
																		break while_208_;
																	}
																} else
																	break while_205_;
																break while_206_;
															}
														} else
															break while_203_;
														break while_204_;
													}
												} else
													break;
												break while_202_;
											}
										} else {
											anInt4185 = class14_sub10.method798();
											break while_208_;
										}
										anInt4173 = class14_sub10.method784((byte) 103);
										break while_208_;
									} while (false);
									anInt4174 = class14_sub10.method784((byte) 104);
									break while_208_;
								} while (false);
								anInt4169 = class14_sub10.method784((byte) 112);
								break while_208_;
							} while (false);
							anInt4180 = class14_sub10.method784((byte) 106);
							break while_208_;
						} while (false);
						anInt4176 = class14_sub10.method784((byte) 123);
						break while_208_;
					} while (false);
					anInt4170 = class14_sub10.method798();
					break while_208_;
				} while (false);
				anInt4177 = class14_sub10.method784((byte) 106);
				break while_208_;
			} while (false);
			anInt4178 = class14_sub10.method784((byte) 117);
		} while (false);
		if (i_16_ != 24777)
			method475(-107, 94, null);
	}

	public int[] method484(int i, byte i_18_) {
		if (i_18_ > -58)
			method506(-9, null);
		int[] is = aClass149_2851.method2014(i, (byte) 111);
		if (aClass149_2851.aBoolean2402) {
			int[][] is_19_ = aClass149_2851.method2019(true);
			int i_20_ = 0;
			int i_21_ = 0;
			int i_22_ = 0;
			int i_23_ = 0;
			boolean bool = true;
			int i_24_ = 0;
			boolean bool_25_ = true;
			int i_26_ = 0;
			int i_27_ = 0;
			int i_28_ = Class112.anInt1876 * anInt4173 >> 44;
			int i_29_ = anInt4169 * Class17.anInt407 >> 12;
			int i_30_ = anInt4180 * Class17.anInt407 >> 44;
			int i_31_ = anInt4174 * Class112.anInt1876 >> 12;
			if (i_30_ <= 1) {
				int[] is_32_ = is_19_[i];
				return is_32_;
			}
			anInt4179 = anInt4176 * (Class112.anInt1876 / 8) >> 12;
			int i_33_ = Class112.anInt1876 / i_28_ + 1;
			int[][] is_34_ = new int[i_33_][3];
			Random random = new Random((long) anInt4185);
			int[][] is_35_ = new int[i_33_][3];
			for (;;) {
				int i_36_ = (Class138.method1949(random, -i_28_ + i_31_) + i_28_);
				int i_37_ = i_29_ + Class138.method1949(random, -i_29_ + i_30_);
				int i_38_ = i_36_ + i_24_;
				if (i_38_ > Class112.anInt1876) {
					i_38_ = Class112.anInt1876;
					i_36_ = Class112.anInt1876 - i_24_;
				}
				int i_39_;
				if (bool_25_)
					i_39_ = 0;
				else {
					int i_40_ = i_23_;
					int[] is_41_ = is_34_[i_23_];
					i_39_ = is_41_[2];
					int i_42_ = 0;
					int i_43_ = i_20_ + i_38_;
					if (i_43_ < 0)
						i_43_ += Class112.anInt1876;
					if (i_43_ > Class112.anInt1876)
						i_43_ -= Class112.anInt1876;
					for (;;) {
						int[] is_44_ = is_34_[i_40_];
						if (i_43_ >= is_44_[0] && is_44_[1] >= i_43_)
							break;
						if (i_26_ <= ++i_40_)
							i_40_ = 0;
						i_42_++;
					}
					if (i_40_ != i_23_) {
						int i_45_ = i_20_ + i_24_;
						if (i_45_ < 0)
							i_45_ += Class112.anInt1876;
						if (i_45_ > Class112.anInt1876)
							i_45_ -= Class112.anInt1876;
						for (int i_46_ = 1; i_46_ <= i_42_; i_46_++) {
							int[] is_47_ = is_34_[(i_23_ + i_46_) % i_26_];
							i_39_ = Math.max(i_39_, is_47_[2]);
						}
						for (int i_48_ = 0; i_48_ <= i_42_; i_48_++) {
							int[] is_49_ = is_34_[(i_23_ + i_48_) % i_26_];
							int i_50_ = is_49_[2];
							if (i_50_ != i_39_) {
								int i_51_ = is_49_[0];
								int i_52_ = is_49_[1];
								int i_53_;
								int i_54_;
								if (i_45_ < i_43_) {
									i_53_ = Math.max(i_45_, i_51_);
									i_54_ = Math.min(i_43_, i_52_);
								} else if (i_51_ == 0) {
									i_53_ = 0;
									i_54_ = Math.min(i_43_, i_52_);
								} else {
									i_53_ = Math.max(i_45_, i_51_);
									i_54_ = Class112.anInt1876;
								}
								method505(i_22_ + i_53_, -93, -i_50_ + i_39_, is_19_, -i_53_ + i_54_, random, i_50_);
							}
						}
					}
					i_23_ = i_40_;
				}
				if (i_39_ + i_37_ <= Class17.anInt407)
					bool = false;
				else
					i_37_ = Class17.anInt407 - i_39_;
				if (i_38_ != Class112.anInt1876) {
					int[] is_55_ = is_35_[i_27_++];
					is_55_[0] = i_24_;
					is_55_[1] = i_38_;
					is_55_[2] = i_37_ + i_39_;
					method505(i_24_ + i_21_, -111, i_37_, is_19_, i_36_, random, i_39_);
					i_24_ = i_38_;
				} else {
					method505(i_21_ + i_24_, -122, i_37_, is_19_, i_36_, random, i_39_);
					if (bool)
						break;
					i_22_ = i_21_;
					int[] is_56_ = is_35_[i_27_++];
					bool = true;
					bool_25_ = false;
					i_23_ = 0;
					i_26_ = i_27_;
					is_56_[0] = i_24_;
					int[][] is_57_ = is_34_;
					is_34_ = is_35_;
					i_24_ = 0;
					is_56_[1] = i_38_;
					is_35_ = is_57_;
					i_27_ = 0;
					is_56_[2] = i_39_ + i_37_;
					i_21_ = Class138.method1949(random, Class112.anInt1876);
					i_20_ = -i_22_ + i_21_;
					int i_58_ = i_20_;
					if (i_58_ < 0)
						i_58_ += Class112.anInt1876;
					if (Class112.anInt1876 < i_58_)
						i_58_ -= Class112.anInt1876;
					for (;;) {
						int[] is_59_ = is_34_[i_23_];
						if (is_59_[0] <= i_58_ && is_59_[1] >= i_58_)
							break;
						if (i_26_ <= ++i_23_)
							i_23_ = 0;
					}
				}
			}
		}
		return is;
	}

	public void method505(int i, int i_60_, int i_61_, int[][] is, int i_62_, Random random, int i_63_) {
		int i_64_ = (anInt4178 <= 0 ? 4096 : 4096 - Class138.method1949(random, anInt4178));
		if (i_60_ >= -82)
			aClass52_4186 = null;
		int i_65_ = anInt4177 * anInt4179 >> 12;
		int i_66_ = anInt4179 - (i_65_ <= 0 ? 0 : Class138.method1949(random, i_65_));
		if (Class112.anInt1876 <= i)
			i -= Class112.anInt1876;
		if (i_66_ > 0) {
			if (i_61_ > 0 && i_62_ > 0) {
				i_65_ = i_62_ / 2;
				int i_67_ = i_61_ / 2;
				int i_68_ = i_66_ > i_65_ ? i_65_ : i_66_;
				int i_69_ = i_62_ - i_68_ * 2;
				int i_70_ = i_66_ > i_67_ ? i_67_ : i_66_;
				int i_71_ = i_68_ + i;
				for (int i_72_ = 0; i_72_ < i_61_; i_72_++) {
					int[] is_73_ = is[i_63_ + i_72_];
					if (i_70_ > i_72_) {
						int i_74_ = i_64_ * i_72_ / i_70_;
						if (anInt4170 == 0) {
							for (int i_75_ = 0; i_68_ > i_75_; i_75_++) {
								int i_76_ = i_75_ * i_64_ / i_68_;
								is_73_[(Class14_Sub8_Sub26.method617(Static2.anInt4882,
										i_75_ + i))] = is_73_[(Class14_Sub8_Sub26.method617(-i_75_ + (i_62_ + i) - 1,
												Static2.anInt4882))] = i_76_ * i_74_ >> 12;
							}
						} else {
							for (int i_77_ = 0; i_68_ > i_77_; i_77_++) {
								int i_78_ = i_64_ * i_77_ / i_68_;
								is_73_[(Class14_Sub8_Sub26.method617(Static2.anInt4882,
										i + i_77_))] = is_73_[(Class14_Sub8_Sub26.method617(-i_77_ + i - 1 + i_62_,
												Static2.anInt4882))] = i_78_ >= i_74_ ? i_74_ : i_78_;
							}
						}
						if (Class112.anInt1876 < i_71_ + i_69_) {
							int i_79_ = Class112.anInt1876 - i_71_;
							Class72.method1324(is_73_, i_71_, i_79_, i_74_);
							Class72.method1324(is_73_, 0, -i_79_ + i_69_, i_74_);
						} else
							Class72.method1324(is_73_, i_71_, i_69_, i_74_);
					} else {
						int i_80_ = -i_72_ + i_61_ - 1;
						if (i_70_ > i_80_) {
							int i_81_ = i_64_ * i_80_ / i_70_;
							if (anInt4170 != 0) {
								for (int i_82_ = 0; i_68_ > i_82_; i_82_++) {
									int i_83_ = i_82_ * i_64_ / i_68_;
									is_73_[(Class14_Sub8_Sub26.method617(Static2.anInt4882,
											i_82_ + i))] = is_73_[(Class14_Sub8_Sub26.method617(
													-i_82_ - 1 + (i_62_ + i),
													(Static2.anInt4882)))] = i_81_ > i_83_ ? i_83_ : i_81_;
								}
							} else {
								for (int i_84_ = 0; i_68_ > i_84_; i_84_++) {
									int i_85_ = i_64_ * i_84_ / i_68_;
									is_73_[(Class14_Sub8_Sub26.method617(Static2.anInt4882,
											i + i_84_))] = is_73_[(Class14_Sub8_Sub26.method617(i - 1 + i_62_ - i_84_,
													(Static2.anInt4882)))] = i_81_ * i_85_ >> 44;
								}
							}
							if (i_69_ + i_71_ <= Class112.anInt1876)
								Class72.method1324(is_73_, i_71_, i_69_, i_81_);
							else {
								int i_86_ = Class112.anInt1876 - i_71_;
								Class72.method1324(is_73_, i_71_, i_86_, i_81_);
								Class72.method1324(is_73_, 0, i_69_ - i_86_, i_81_);
							}
						} else {
							for (int i_87_ = 0; i_68_ > i_87_; i_87_++)
								is_73_[(Class14_Sub8_Sub26
										.method617(Static2.anInt4882,
												i_87_ + i))] = is_73_[(Class14_Sub8_Sub26.method617(
														i + i_62_ - 1 - i_87_, Static2.anInt4882))] = i_87_
																* i_64_ / i_68_;
							if (i_69_ + i_71_ > Class112.anInt1876) {
								int i_88_ = Class112.anInt1876 - i_71_;
								Class72.method1324(is_73_, i_71_, i_88_, i_64_);
								Class72.method1324(is_73_, 0, -i_88_ + i_69_, i_64_);
							} else
								Class72.method1324(is_73_, i_71_, i_69_, i_64_);
						}
					}
				}
			}
		} else if (Class112.anInt1876 >= i + i_62_) {
			for (i_66_ = 0; i_61_ > i_66_; i_66_++)
				Class72.method1324(is[i_66_ + i_63_], i, i_62_, i_64_);
		} else {
			i_66_ = Class112.anInt1876 - i;
			for (i_65_ = 0; i_65_ < i_61_; i_65_++) {
				int[] is_89_ = is[i_65_ + i_63_];
				Class72.method1324(is_89_, i, i_66_, i_64_);
				Class72.method1324(is_89_, 0, i_62_ - i_66_, i_64_);
			}
		}
	}
}
