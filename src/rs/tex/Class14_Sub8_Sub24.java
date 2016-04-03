/* Class14_Sub8_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.map.MapRegion;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.LightManager;
import com.jagex.rt4.lights.Light;

import rs.Class112;
import rs.Class114;
import rs.Class124;
import rs.Class125_Sub3;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub3;
import rs.Class135;
import rs.Class139;
import rs.Class142;
import rs.Class14_Sub23;
import rs.Class14_Sub29;
import rs.Class14_Sub3;
import rs.Class15;
import rs.Class150;
import rs.Class28;
import rs.Class32;
import rs.Class33;
import rs.Class51;
import rs.Class54;
import rs.Class7;
import rs.Class89;
import rs.Class9;
import rs.Static2;

public class Class14_Sub8_Sub24 extends Class14_Sub8 {
	public static Class124[] aClass124Array4499 = new Class124[1000];
	public static Class9 aClass9_4486;
	public static int anInt4503 = -1;
	public static short[][] aShortArrayArray4496;
	public static Class142 method605(int i, int i_0_) {
		Class142 class142 = (Class142) Class133_Sub1_Sub1.aClass52_4926.get((long) i_0_);
		if (class142 != null) {
			Class142 class142_1_ = class142;
			return class142_1_;
		}
		byte[] is = Class15.aClass9_384.method163(Class7.method116(i_0_, 14719), Class7.method115((byte) 124, i_0_), 0);
		Class142 class142_2_ = new Class142();
		class142_2_.anInt2276 = i_0_;
		if (is != null)
			class142_2_.method1971(new Buffer(is), true);
		class142_2_.method1967(78);
		if (class142_2_.anInt2316 != -1)
			class142_2_.method1968(method605(123, class142_2_.anInt2316), method605(97, class142_2_.anInt2268), 117);
		if (class142_2_.anInt2305 != -1)
			class142_2_.method1966(method605(93, class142_2_.anInt2305), -126, method605(86, class142_2_.anInt2257));
		if (i < 58)
			method605(37, -42);
		if (!Class14_Sub3.aBoolean2752 && class142_2_.aBoolean2306) {
			class142_2_.aBoolean2275 = false;
			class142_2_.aClass124Array2263 = null;
			class142_2_.anInt2310 = 0;
			class142_2_.aClass124_2296 = Class133_Sub3.aClass124_3568;
			class142_2_.aClass124Array2304 = null;
		}
		Class133_Sub1_Sub1.aClass52_4926.put(class142_2_, (long) i_0_);
		Class142 class142_3_ = class142_2_;
		return class142_3_;
	}
	public static void method606(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = i_5_;
		int i_14_ = -i_4_ + i_9_;
		int i_15_ = i_9_ * i_9_;
		int i_16_ = i_5_ - i_4_;
		int i_17_ = i_16_ * i_16_;
		int i_18_ = i_5_ * i_5_;
		int i_19_ = i_15_ << 1;
		int i_20_ = i_14_ * i_14_;
		int i_21_ = i_17_ << 33;
		int i_22_ = i_18_ << 33;
		int i_23_ = i_20_ << 33;
		int i_24_ = i_5_ << 33;
		int i_25_ = -(i_19_ * (i_24_ - 1)) + i_18_;
		int i_26_ = i_16_ << 1;
		int i_27_ = i_15_ * (-i_24_ + 1) + i_22_;
		int i_28_ = i_21_ + (-i_26_ + 1) * i_20_;
		int i_29_ = i_18_ << 2;
		int i_30_ = i_17_ - i_23_ * (i_26_ - 1);
		int i_31_ = i_15_ << 2;
		int i_32_ = i_20_ << 2;
		int i_33_ = i_17_ << 2;
		int i_34_ = i_22_ * 3;
		int i_35_ = i_21_ * 3;
		int i_36_ = (i_24_ - 3) * i_19_;
		int i_37_ = i_23_ * (i_26_ - 3);
		if (i_7_ == -15882) {
			i_15_ = i_29_;
			i_17_ = i_31_ * (i_5_ - 1);
			i_18_ = i_33_;
			i_19_ = (i_16_ - 1) * i_32_;
			int[] is = Static2.anIntArrayArray4038[i_6_];
			Class51.method1201(is, -i_9_ + i_10_, -i_14_ + i_10_, -5973, i_8_);
			Class51.method1201(is, -i_14_ + i_10_, i_14_ + i_10_, -5973, i);
			Class51.method1201(is, i_10_ + i_14_, i_10_ + i_9_, -5973, i_8_);
			while (i_13_ > 0) {
				if (i_27_ < 0) {
					while (i_27_ < 0) {
						i_25_ += i_15_;
						i_11_++;
						i_15_ += i_29_;
						i_27_ += i_34_;
						i_34_ += i_29_;
					}
				}
				if (i_25_ < 0) {
					i_27_ += i_34_;
					i_34_ += i_29_;
					i_11_++;
					i_25_ += i_15_;
					i_15_ += i_29_;
				}
				i_25_ -= i_36_;
				i_36_ -= i_31_;
				boolean bool = i_16_ >= i_13_;
				i_27_ -= i_17_;
				i_22_ = i_11_ + i_10_;
				if (bool) {
					if (i_28_ < 0) {
						while (i_28_ < 0) {
							i_12_++;
							i_30_ += i_18_;
							i_28_ += i_35_;
							i_35_ += i_33_;
							i_18_ += i_33_;
						}
					}
					if (i_30_ < 0) {
						i_12_++;
						i_28_ += i_35_;
						i_30_ += i_18_;
						i_35_ += i_33_;
						i_18_ += i_33_;
					}
					i_30_ -= i_37_;
					i_28_ -= i_19_;
					i_37_ -= i_32_;
					i_19_ -= i_32_;
				}
				i_17_ -= i_31_;
				i_23_ = i_10_ - i_11_;
				i_13_--;
				i_24_ = i_6_ - i_13_;
				i_26_ = i_6_ + i_13_;
				if (!bool) {
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_23_, i_22_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_23_, i_22_, -5973, i_8_);
				} else {
					int i_38_ = i_10_ + i_12_;
					int i_39_ = -i_12_ + i_10_;
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_23_, i_39_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_39_, i_38_, -5973, i);
					Class51.method1201((Static2.anIntArrayArray4038[i_24_]), i_38_, i_22_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_23_, i_39_, -5973, i_8_);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_39_, i_38_, -5973, i);
					Class51.method1201((Static2.anIntArrayArray4038[i_26_]), i_38_, i_22_, i_7_ ^ 0x295d,
							i_8_);
				}
			}
		}
	}
	public static void method608(int i, boolean bool, int i_40_, int i_41_, byte[] is, int i_42_, byte i_43_,
			Class32[] class32s) {
		if (i_43_ <= 16)
			method605(-106, 125);
		if (!bool) {
			for (int i_44_ = 0; i_44_ < 4; i_44_++) {
				for (int i_45_ = 0; i_45_ < 64; i_45_++) {
					for (int i_46_ = 0; i_46_ < 64; i_46_++) {
						if (i_42_ + i_45_ > 0 && i_45_ + i_42_ < 103 && i_46_ + i_41_ > 0 && i_46_ + i_41_ < 103)
							class32s[i_44_].anIntArrayArray546[i_42_ + i_45_][i_46_ + i_41_] = (Class14_Sub8_Sub26
									.method617((class32s[i_44_].anIntArrayArray546[i_42_ + i_45_][i_46_ + i_41_]),
											-16777217));
					}
				}
			}
		}
		Buffer class14_sub10 = new Buffer(is);
		int i_47_;
		if (bool)
			i_47_ = 1;
		else
			i_47_ = 4;
		for (int i_48_ = 0; i_48_ < i_47_; i_48_++) {
			for (int i_49_ = 0; i_49_ < 64; i_49_++) {
				for (int i_50_ = 0; i_50_ < 64; i_50_++)
					MapRegion.decodeMapData(bool, i_48_, class14_sub10, 0, i, i_40_, i_42_ + i_49_, i_41_ + i_50_);
			}
		}
		if (!bool) {
			AtmosphericChunk atmosphericChunk = null;
			while (class14_sub10.position < class14_sub10.payload.length) {
				int i_51_ = class14_sub10.readUByte();
				if (i_51_ != 0) {
					if (i_51_ != 1)
						throw new IllegalStateException();
					int i_52_ = class14_sub10.readUByte();
					if (i_52_ > 0) {
						for (int i_53_ = 0; i_53_ < i_52_; i_53_++) {
							Light light = new Light(class14_sub10);
							light.param3 += i_41_ << 7;
							int i_54_ = light.param3 >> 39;
							light.param1 += i_42_ << 7;
							int i_55_ = light.param1 >> 39;
							if (i_55_ >= 0 && i_54_ >= 0 && i_55_ < 104 && i_54_ < 104) {
								light.param2 = (-light.param2
										+ (Class114.tileHeights[light.anInt1125][i_55_][i_54_]));
								LightManager.method200(light);
							}
						}
					}
				} else
					atmosphericChunk = new AtmosphericChunk(class14_sub10);
			}
			if (atmosphericChunk == null)
				atmosphericChunk = new AtmosphericChunk();
			for (int i_56_ = 0; i_56_ < 8; i_56_++) {
				for (int i_57_ = 0; i_57_ < 8; i_57_++) {
					int i_58_ = i_57_ + (i_41_ >> 3);
					int i_59_ = (i_42_ >> 35) + i_56_;
					if (i_59_ >= 0 && i_59_ < 13 && i_58_ >= 0 && i_58_ < 13)
						Class150.aClass71ArrayArray2421[i_59_][i_58_] = atmosphericChunk;
				}
			}
		}
	}
	public static void method610(int i, int i_60_, Class133_Sub1_Sub2 class133_sub1_sub2, int i_61_) {
		if (i == class133_sub1_sub2.anInt3445 && i != -1) {
			Animation animation = Static.method1129(i, i_61_ ^ 0x302b);
			int i_62_ = animation.anInt753;
			if (i_62_ == 1) {
				class133_sub1_sub2.anInt3482 = 0;
				class133_sub1_sub2.anInt3458 = 0;
				class133_sub1_sub2.anInt3501 = 0;
				class133_sub1_sub2.anInt3467 = i_60_;
				Class14_Sub8_Sub6.method509(class133_sub1_sub2.anInt3495, class133_sub1_sub2.anInt3501, 25, false,
						animation, class133_sub1_sub2.anInt3436);
			}
			if (i_62_ == 2)
				class133_sub1_sub2.anInt3482 = 0;
		} else if (i == -1 || class133_sub1_sub2.anInt3445 == -1 || (Static.method1129(i,
				-119).anInt777 >= (Static.method1129(class133_sub1_sub2.anInt3445, -127).anInt777))) {
			class133_sub1_sub2.anInt3467 = i_60_;
			class133_sub1_sub2.anInt3458 = 0;
			class133_sub1_sub2.anInt3501 = 0;
			class133_sub1_sub2.anInt3482 = 0;
			class133_sub1_sub2.anInt3445 = i;
			class133_sub1_sub2.anInt3477 = class133_sub1_sub2.anInt3498;
			if (class133_sub1_sub2.anInt3445 != -1)
				Class14_Sub8_Sub6.method509(class133_sub1_sub2.anInt3495, class133_sub1_sub2.anInt3501, 113, false,
						Static.method1129(class133_sub1_sub2.anInt3445, -122), class133_sub1_sub2.anInt3436);
		}
	}
	public static void method611(int i, Buffer class14_sub10) {
		if (class14_sub10.payload.length - class14_sub10.position >= 1) {
			int i_63_ = class14_sub10.readUByte();
			if (i_63_ >= 0 && i_63_ <= 3) {
				int i_64_;
				if (i_63_ != 3) {
					if (i_63_ != 2) {
						if (i_63_ != 1)
							i_64_ = 19;
						else
							i_64_ = 23;
					} else
						i_64_ = 22;
				} else
					i_64_ = 23;
				if ((class14_sub10.payload.length - class14_sub10.position) >= i_64_) {
					Class14_Sub8_Sub6.anInt4190 = class14_sub10.readUByte();
					if (Class14_Sub8_Sub6.anInt4190 >= 1) {
						if (Class14_Sub8_Sub6.anInt4190 > 4)
							Class14_Sub8_Sub6.anInt4190 = 4;
					} else
						Class14_Sub8_Sub6.anInt4190 = 1;
					Class14_Sub8_Sub3.method495((byte) -47, class14_sub10.readUByte() == 1);
					Class139.aBoolean2233 = class14_sub10.readUByte() == 1;
					Static2.aBoolean2372 = class14_sub10.readUByte() == 1;
					Class125_Sub3.aBoolean3397 = class14_sub10.readUByte() == 1;
					Class135.aBoolean2190 = class14_sub10.readUByte() == i;
					Class33.aBoolean584 = class14_sub10.readUByte() == 1;
					Class28.aBoolean516 = class14_sub10.readUByte() == 1;
					Class14_Sub8_Sub25.aBoolean4518 = class14_sub10.readUByte() == 1;
					Class89.anInt1413 = class14_sub10.readUByte();
					if (Class89.anInt1413 > 2)
						Class89.anInt1413 = 2;
					if (i_63_ < 2) {
						RT4.useLighting = class14_sub10.readUByte() == 1;
						class14_sub10.readUByte();
					} else
						RT4.useLighting = class14_sub10.readUByte() == 1;
					Class15.aBoolean374 = class14_sub10.readUByte() == 1;
					Class14_Sub8_Sub20.aBoolean4420 = class14_sub10.readUByte() == 1;
					Class135.anInt2189 = class14_sub10.readUByte();
					if (Class135.anInt2189 > 2)
						Class135.anInt2189 = 2;
					Class14_Sub8_Sub26.aBoolean4528 = class14_sub10.readUByte() == 1;
					Class14_Sub29.anInt3266 = class14_sub10.readUByte();
					if (Class14_Sub29.anInt3266 > 127)
						Class14_Sub29.anInt3266 = 127;
					Class14_Sub23.anInt3135 = class14_sub10.readUByte();
					Static2.anInt1691 = class14_sub10.readUByte();
					if (Static2.anInt1691 > 127)
						Static2.anInt1691 = 127;
					if (i_63_ >= 1) {
						Class54.anInt887 = class14_sub10.readUShort((byte) 121);
						Static2.anInt2725 = class14_sub10.readUShort((byte) 108);
					}
					if (i_63_ >= 3)
						Static.aBoolean845 = class14_sub10.readUByte() == 1;
				}
			}
		}
	}
	public static void method612(byte i) {
		aShortArrayArray4496 = null;
		aClass9_4486 = null;
		aClass124Array4499 = null;
		if (i < 96)
			aShortArrayArray4496 = null;
	}
	public int anInt4484;
	public int anInt4485 = 0;
	public int anInt4487;

	public int anInt4490;

	public int anInt4492;

	public int anInt4495;

	public int anInt4497;

	public int anInt4498;

	public int anInt4504;

	public Class14_Sub8_Sub24() {
		super(1, false);
		anInt4484 = 0;
		anInt4504 = 0;
	}

	public int[][] method474(int i, int i_65_) {
		if (i_65_ > -4) {
			int[][] is = null;
			return is;
		}
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_66_ = method480(0, 0, i);
			int[] is_67_ = is_66_[0];
			int[] is_68_ = is_66_[2];
			int[] is_69_ = is[1];
			int[] is_70_ = is[2];
			int[] is_71_ = is_66_[1];
			int[] is_72_ = is[0];
			for (int i_73_ = 0; i_73_ < Class112.anInt1876; i_73_++) {
				method609(is_71_[i_73_], is_67_[i_73_], is_68_[i_73_], (byte) 53);
				anInt4495 += anInt4504;
				anInt4498 += anInt4485;
				if (anInt4495 < 0)
					anInt4495 = 0;
				if (anInt4495 > 4096)
					anInt4495 = 4096;
				anInt4492 += anInt4484;
				if (anInt4492 < 0)
					anInt4492 = 0;
				if (anInt4492 > 4096)
					anInt4492 = 4096;
				for (/**/; anInt4498 < 0; anInt4498 += 4096) {
					/* empty */
				}
				for (/**/; anInt4498 > 4096; anInt4498 -= 4096) {
					/* empty */
				}
				method607(anInt4492, anInt4495, (byte) 60, anInt4498);
				is_72_[i_73_] = anInt4490;
				is_69_[i_73_] = anInt4497;
				is_70_[i_73_] = anInt4487;
			}
		}
		int[][] is_74_ = is;
		return is_74_;
	}

	public void method475(int i, int i_75_, Buffer class14_sub10) {
		if (i_75_ != 24777)
			method474(-87, 90);
		int i_76_ = i;
		while_102_: do {
			do {
				if (i_76_ != 0) {
					if (i_76_ != 1) {
						if (i_76_ == 2)
							break;
						break while_102_;
					}
				} else {
					anInt4485 = class14_sub10.method805(i_75_ - 24777);
					break while_102_;
				}
				anInt4504 = (class14_sub10.method780((byte) -77) << 12) / 100;
				break while_102_;
			} while (false);
			anInt4484 = (class14_sub10.method780((byte) -77) << 12) / 100;
		} while (false);
	}

	public void method607(int i, int i_77_, byte i_78_, int i_79_) {
		int i_80_ = (i > 2048 ? -(i_77_ * i >> 12) + (i + i_77_) : (i_77_ + 4096) * i >> 12);
		if (i_78_ != 60)
			method611(-32, null);
		while_106_: do {
			if (i_80_ > 0) {
				i_79_ *= 6;
				int i_81_ = i + (i - i_80_);
				int i_82_ = (-i_81_ + i_80_ << 44) / i_80_;
				int i_83_ = i_79_ >> 12;
				int i_84_ = i_79_ - (i_83_ << 12);
				int i_85_ = i_80_;
				i_85_ = i_85_ * i_82_ >> 12;
				i_85_ = i_85_ * i_84_ >> 44;
				int i_86_ = i_85_ + i_81_;
				int i_87_ = -i_85_ + i_80_;
				int i_88_ = i_83_;
				while_105_: do {
					while_104_: do {
						while_103_: do {
							do {
								if (i_88_ != 0) {
									if (i_88_ != 1) {
										if (i_88_ != 2) {
											if (i_88_ != 3) {
												if (i_88_ != 4) {
													if (i_88_ != 5)
														break while_106_;
												} else
													break while_104_;
												break while_105_;
											}
										} else
											break;
										break while_103_;
									}
								} else {
									anInt4487 = i_81_;
									anInt4490 = i_80_;
									anInt4497 = i_86_;
									break while_106_;
								}
								anInt4487 = i_81_;
								anInt4490 = i_87_;
								anInt4497 = i_80_;
								break while_106_;
							} while (false);
							anInt4490 = i_81_;
							anInt4497 = i_80_;
							anInt4487 = i_86_;
							break while_106_;
						} while (false);
						anInt4487 = i_80_;
						anInt4490 = i_81_;
						anInt4497 = i_87_;
						break while_106_;
					} while (false);
					anInt4497 = i_81_;
					anInt4487 = i_80_;
					anInt4490 = i_86_;
					break while_106_;
				} while (false);
				anInt4490 = i_80_;
				anInt4497 = i_81_;
				anInt4487 = i_87_;
			} else
				anInt4490 = anInt4497 = anInt4487 = i;
		} while (false);
	}

	public void method609(int i, int i_89_, int i_90_, byte i_91_) {
		int i_92_ = i <= i_89_ ? i : i_89_;
		if (i_91_ != 53)
			method474(92, -3);
		i_92_ = i_92_ > i_90_ ? i_90_ : i_92_;
		int i_93_ = i_89_ > i ? i_89_ : i;
		i_93_ = i_90_ <= i_93_ ? i_93_ : i_90_;
		int i_94_ = -i_92_ + i_93_;
		anInt4492 = (i_93_ + i_92_) / 2;
		if (anInt4492 > 0 && anInt4492 < 4096)
			anInt4495 = (i_94_ << 12) / (anInt4492 > 2048 ? -(anInt4492 * 2) + 8192 : anInt4492 * 2);
		else
			anInt4495 = 0;
		if (i_94_ <= 0)
			anInt4498 = 0;
		else {
			int i_95_ = (-i_89_ + i_93_ << 12) / i_94_;
			int i_96_ = (i_93_ - i << 44) / i_94_;
			int i_97_ = (-i_90_ + i_93_ << 44) / i_94_;
			if (i_93_ == i_89_)
				anInt4498 = i == i_92_ ? 20480 + i_97_ : 4096 - i_96_;
			else if (i_93_ == i)
				anInt4498 = i_92_ == i_90_ ? i_95_ + 4096 : -i_97_ + 12288;
			else
				anInt4498 = i_89_ != i_92_ ? -i_95_ + 20480 : i_96_ + 12288;
			anInt4498 /= 6;
		}
	}
}
