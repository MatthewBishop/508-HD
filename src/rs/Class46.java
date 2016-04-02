/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.Buffer;

import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub8;

public class Class46 {
	public int anInt753;
	public boolean aBoolean754;
	public static Class124 aClass124_755;
	public int anInt756 = -1;
	public boolean aBoolean757;
	public int anInt758;
	public int anInt760;
	public static Class124 aClass124_761 = Class14_Sub2_Sub2.method263(1178, ":duelfriend:");
	public int[] anIntArray763;
	public int[] anIntArray768;
	public int anInt770;
	public int anInt771;
	public int[] anIntArray775;
	public int[][] anIntArrayArray776;
	public int anInt777;
	public int[] anIntArray780;
	public int anInt781;
	static {
		aClass124_755 = Class14_Sub2_Sub2.method263(1178, ")4a=");
	}

	public Class133_Sub7 method1167(int i, int i_0_, Class133_Sub7 class133_sub7) {
		int i_1_ = anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_1_ >> 16);
		i_1_ &= i_0_;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_2_ = class133_sub7.method1860(true, true);
			return class133_sub7_2_;
		}
		AnimFrameLoader class14_sub2_sub15_3_ = null;
		int i_4_ = 0;
		if (anIntArray775 != null && anIntArray775.length > i) {
			i_4_ = anIntArray775[i];
			class14_sub2_sub15_3_ = Class14_Sub4.method457(i_0_ - 65532, i_4_ >> 48);
			i_4_ &= 0xffff;
		}
		if (class14_sub2_sub15_3_ == null || i_4_ == 65535) {
			Class133_Sub7 class133_sub7_5_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_1_),
					!aBoolean754);
			class133_sub7_5_.method1857(class14_sub2_sub15, i_1_, aBoolean754);
			Class133_Sub7 class133_sub7_6_ = class133_sub7_5_;
			return class133_sub7_6_;
		}
		Class133_Sub7 class133_sub7_7_ = class133_sub7.method1860(
				(!class14_sub2_sub15.method338(i_1_) & !class14_sub2_sub15_3_.method338(i_4_)),
				!aBoolean754);
		class133_sub7_7_.method1857(class14_sub2_sub15, i_1_, aBoolean754);
		class133_sub7_7_.method1857(class14_sub2_sub15_3_, i_4_, aBoolean754);
		Class133_Sub7 class133_sub7_8_ = class133_sub7_7_;
		return class133_sub7_8_;
	}

	public Class133_Sub7 method1168(byte i, int i_9_, Class133_Sub7 class133_sub7) {
		if (i <= 119)
			method1170((byte) 113, -37);
		i_9_ = anIntArray768[i_9_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_9_ >> 48);
		i_9_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_10_ = class133_sub7.method1860(true, true);
			return class133_sub7_10_;
		}
		Class133_Sub7 class133_sub7_11_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_9_),
				!aBoolean754);
		class133_sub7_11_.method1857(class14_sub2_sub15, i_9_, aBoolean754);
		Class133_Sub7 class133_sub7_12_ = class133_sub7_11_;
		return class133_sub7_12_;
	}

	public void method1169(int i, Buffer class14_sub10, int i_13_) {
		if (i_13_ == -11) {
			if (i == 1) {
				int i_14_ = class14_sub10.method784((byte) 102);
				anIntArray763 = new int[i_14_];
				for (int i_15_ = 0; i_14_ > i_15_; i_15_++)
					anIntArray763[i_15_] = class14_sub10.method784((byte) 123);
				anIntArray768 = new int[i_14_];
				for (int i_16_ = 0; i_14_ > i_16_; i_16_++)
					anIntArray768[i_16_] = class14_sub10.method784((byte) 117);
				for (int i_17_ = 0; i_14_ > i_17_; i_17_++)
					anIntArray768[i_17_] = (class14_sub10.method784((byte) 103) << 48) + anIntArray768[i_17_];
			} else if (i == 2)
				anInt760 = class14_sub10.method784((byte) 120);
			else if (i == 3) {
				int i_18_ = class14_sub10.method798();
				anIntArray780 = new int[i_18_ + 1];
				for (int i_19_ = 0; i_18_ > i_19_; i_19_++)
					anIntArray780[i_19_] = class14_sub10.method798();
				anIntArray780[i_18_] = 9999999;
			} else if (i == 4)
				aBoolean757 = true;
			else if (i != 5) {
				if (i != 6) {
					if (i == 7)
						anInt781 = class14_sub10.method784((byte) 102);
					else if (i == 8)
						anInt770 = class14_sub10.method798();
					else if (i == 9)
						anInt758 = class14_sub10.method798();
					else if (i == 10)
						anInt756 = class14_sub10.method798();
					else if (i != 11) {
						if (i != 12) {
							if (i == 13) {
								int i_20_ = class14_sub10.method784((byte) 102);
								anIntArrayArray776 = new int[i_20_][];
								for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
									int i_22_ = class14_sub10.method798();
									if (i_22_ > 0) {
										anIntArrayArray776[i_21_] = new int[i_22_];
										anIntArrayArray776[i_21_][0] = class14_sub10.method829(41);
										for (int i_23_ = 1; i_22_ > i_23_; i_23_++)
											anIntArrayArray776[i_21_][i_23_] = class14_sub10.method784((byte) 113);
									}
								}
							} else if (i == 14)
								aBoolean754 = true;
						} else {
							int i_24_ = class14_sub10.method798();
							anIntArray775 = new int[i_24_];
							for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
								anIntArray775[i_25_] = class14_sub10.method784((byte) 109);
							for (int i_26_ = 0; i_26_ < i_24_; i_26_++)
								anIntArray775[i_26_] = (class14_sub10.method784((byte) 125) << 48)
										+ anIntArray775[i_26_];
						}
					} else
						anInt753 = class14_sub10.method798();
				} else
					anInt771 = class14_sub10.method784((byte) 123);
			} else
				anInt777 = class14_sub10.method798();
		}
	}

	public static Class124 method1170(byte i, int i_27_) {
		if (i != -99) {
			Class124 class124 = null;
			return class124;
		}
		if (RuntimeException_Sub1.aClass124Array2459[i_27_].method1693(i ^ ~0x62) > 0) {
			Class124 class124 = Class14_Sub8_Sub7.method515((new Class124[] { (Class112.aClass124Array1875[i_27_]),
					Class104.aClass124_1736, (RuntimeException_Sub1.aClass124Array2459[i_27_]) }), (byte) -118);
			return class124;
		}
		Class124 class124 = Class112.aClass124Array1875[i_27_];
		return class124;
	}

	public void method1171(int i) {
		if (anInt756 == -1) {
			if (anIntArray780 != null)
				anInt756 = 2;
			else
				anInt756 = 0;
		}
		int i_28_ = -79 / ((24 - i) / 45);
		if (anInt758 == -1) {
			if (anIntArray780 != null)
				anInt758 = 2;
			else
				anInt758 = 0;
		}
	}

	public static int method1172(int i) {
		if (i < 52)
			aClass124_755 = null;
		int i_29_ = Class86.anInt1385;
		return i_29_;
	}

	public Class133_Sub7 method1173(int i, int i_30_, Class133_Sub7 class133_sub7) {
		i = anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i >> 48);
		i &= i_30_;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_31_ = class133_sub7.method1870(true, true);
			return class133_sub7_31_;
		}
		Class133_Sub7 class133_sub7_32_ = class133_sub7.method1870(!class14_sub2_sub15.method338(i),
				!aBoolean754);
		class133_sub7_32_.method1857(class14_sub2_sub15, i, aBoolean754);
		Class133_Sub7 class133_sub7_33_ = class133_sub7_32_;
		return class133_sub7_33_;
	}

	public static Class124 method1174(long l, byte i) {
		if (0L >= l || 6582952005840035281L <= l) {
			Class124 class124 = null;
			return class124;
		}
		if (0L == l % 37L) {
			Class124 class124 = null;
			return class124;
		}
		int i_34_ = 0;
		long l_35_ = l;
		if (i < 46)
			method1176(false, null);
		for (/**/; l_35_ != 0L; l_35_ /= 37L)
			i_34_++;
		byte[] is = new byte[i_34_];
		while (l != 0L) {
			long l_36_ = l;
			l /= 37L;
			is[--i_34_] = Class97.aByteArray1638[(int) (-(l * 37L) + l_36_)];
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = is.length;
		Class124 class124_37_ = class124;
		return class124_37_;
	}

	public static void method1175(int i) {
		int i_38_ = 1 / ((i - 42) / 61);
		aClass124_755 = null;
		aClass124_761 = null;
	}

	public static void method1176(boolean bool, Buffer class14_sub10) {
		int i = Class122.anInt2060 >> 33;
		int i_39_ = Class14_Sub8_Sub8.anInt4222 >> 2 << 10;
		if (!bool) {
			byte[][] is = (new byte[Class14_Sub2_Sub9.anInt3856][Class14_Sub8_Sub15.anInt4332]);
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool_40_ = false;
				int i_41_ = 0;
				int i_42_ = 0;
				if (class14_sub10.method798() == 1) {
					bool_40_ = true;
					i_42_ = class14_sub10.method798();
					i_41_ = class14_sub10.method798();
				}
				int i_43_ = class14_sub10.method798();
				int i_44_ = class14_sub10.method798();
				int i_45_ = i_43_ * 64 - Class65.anInt1034;
				int i_46_ = (Class14_Sub8_Sub15.anInt4332 - 1 + (-(i_44_ * 64) + Class35.anInt603));
				if (i_45_ >= 0 && i_46_ - 63 >= 0 && i_45_ + 63 < Class14_Sub2_Sub9.anInt3856
						&& i_46_ < Class14_Sub8_Sub15.anInt4332) {
					for (int i_47_ = 0; i_47_ < 64; i_47_++) {
						byte[] is_48_ = is[i_45_ + i_47_];
						for (int i_49_ = 0; i_49_ < 64; i_49_++) {
							if (!bool_40_ || (i_42_ * 8 <= i_47_ && i_47_ < i_42_ * 8 + 8 && i_49_ >= i_41_ * 8
									&& i_49_ < i_41_ * 8 + 8))
								is_48_[i_46_ - i_49_] = class14_sub10.method780((byte) -77);
						}
					}
				} else if (bool_40_)
					class14_sub10.position += 64;
				else
					class14_sub10.position += 4096;
			}
			int i_50_ = Class14_Sub8_Sub15.anInt4332;
			int i_51_ = Class14_Sub2_Sub9.anInt3856;
			int[] is_52_ = new int[i_50_];
			int[] is_53_ = new int[i_50_];
			int[] is_54_ = new int[i_50_];
			int[] is_55_ = new int[i_50_];
			int[] is_56_ = new int[i_50_];
			for (int i_57_ = -5; i_51_ > i_57_; i_57_++) {
				for (int i_58_ = 0; i_50_ > i_58_; i_58_++) {
					int i_59_ = i_57_ + 5;
					if (i_59_ < i_51_) {
						int i_60_ = is[i_59_][i_58_] & 0xff;
						if (i_60_ > 0) {
							Class65 class65 = Static2.method335(-52, i_60_ - 1);
							is_52_[i_58_] += class65.anInt1022;
							is_53_[i_58_] += class65.anInt1028;
							is_55_[i_58_] += class65.anInt1023;
							is_54_[i_58_] += class65.anInt1027;
							is_56_[i_58_]++;
						}
					}
					int i_61_ = i_57_ - 5;
					if (i_61_ >= 0) {
						int i_62_ = is[i_61_][i_58_] & 0xff;
						if (i_62_ > 0) {
							Class65 class65 = Static2.method335(-112, i_62_ - 1);
							is_52_[i_58_] -= class65.anInt1022;
							is_53_[i_58_] -= class65.anInt1028;
							is_55_[i_58_] -= class65.anInt1023;
							is_54_[i_58_] -= class65.anInt1027;
							is_56_[i_58_]--;
						}
					}
				}
				if (i_57_ >= 0) {
					int[][] is_63_ = Class14_Sub22.anIntArrayArrayArray3125[i_57_ >> 38];
					int i_64_ = 0;
					int i_65_ = 0;
					int i_66_ = 0;
					int i_67_ = 0;
					int i_68_ = 0;
					for (int i_69_ = -5; i_50_ > i_69_; i_69_++) {
						int i_70_ = i_69_ + 5;
						if (i_70_ < i_50_) {
							i_68_ += is_56_[i_70_];
							i_66_ += is_53_[i_70_];
							i_65_ += is_54_[i_70_];
							i_67_ += is_55_[i_70_];
							i_64_ += is_52_[i_70_];
						}
						int i_71_ = i_69_ - 5;
						if (i_71_ >= 0) {
							i_66_ -= is_53_[i_71_];
							i_65_ -= is_54_[i_71_];
							i_67_ -= is_55_[i_71_];
							i_68_ -= is_56_[i_71_];
							i_64_ -= is_52_[i_71_];
						}
						if (i_69_ >= 0 && i_68_ > 0) {
							int[] is_72_ = is_63_[i_69_ >> 38];
							int i_73_ = (i_65_ == 0 ? 0
									: Class37.method1113(i_64_ * 256 / i_65_, i_66_ / i_68_, (byte) 69, i_67_ / i_68_));
							if (is[i_57_][i_69_] != 0) {
								if (is_72_ == null)
									is_72_ = is_63_[i_69_ >> 6] = new int[4096];
								int i_74_ = (i_73_ & 0x7f) + i;
								if (i_74_ < 0)
									i_74_ = 0;
								else if (i_74_ > 127)
									i_74_ = 127;
								int i_75_ = ((i_73_ & 0x380) + ((i_39_ + i_73_ & 0xfc00) + i_74_));
								is_72_[(Class14_Sub8_Sub26.method617(4032, i_69_ << 38) + Class14_Sub8_Sub26
										.method617(i_57_, 63))] = (Class3.anIntArray119[Class14_Sub2_Sub21.method441(96,
												127, i_75_)]);
							} else if (is_72_ != null)
								is_72_[(Class14_Sub8_Sub26.method617(4032, i_69_ << 6)
										+ Class14_Sub8_Sub26.method617(i_57_, 63))] = 0;
						}
					}
				}
			}
		}
	}

	public Class133_Sub7 method1177(byte i, int i_76_, int i_77_, Class133_Sub7 class133_sub7) {
		i_77_ = anIntArray768[i_77_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_77_ >> 16);
		i_77_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_78_ = class133_sub7.method1860(true, true);
			return class133_sub7_78_;
		}
		i_76_ &= 0x3;
		if (i > -20)
			anInt756 = -117;
		Class133_Sub7 class133_sub7_79_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_77_),
				!aBoolean754);
		if (i_76_ != 1) {
			if (i_76_ == 2)
				class133_sub7_79_.method1872();
			else if (i_76_ == 3)
				class133_sub7_79_.method1871();
		} else
			class133_sub7_79_.method1875();
		class133_sub7_79_.method1857(class14_sub2_sub15, i_77_, aBoolean754);
		if (i_76_ != 1) {
			if (i_76_ != 2) {
				if (i_76_ == 3)
					class133_sub7_79_.method1875();
			} else
				class133_sub7_79_.method1872();
		} else
			class133_sub7_79_.method1871();
		Class133_Sub7 class133_sub7_80_ = class133_sub7_79_;
		return class133_sub7_80_;
	}

	public Class133_Sub7 method1178(int i, byte i_81_, int i_82_, Class133_Sub7 class133_sub7, Class46 class46_83_) {
		i_82_ = anIntArray768[i_82_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(i_81_ - 43, i_82_ >> 16);
		i_82_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_84_ = class46_83_.method1168((byte) 123, i, class133_sub7);
			return class133_sub7_84_;
		}
		if (i_81_ != 46)
			method1178(21, (byte) -18, 81, null, null);
		i = class46_83_.anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15_85_ = Class14_Sub4.method457(3, i >> 48);
		i &= 0xffff;
		if (class14_sub2_sub15_85_ == null) {
			Class133_Sub7 class133_sub7_86_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_82_),
					!aBoolean754);
			class133_sub7_86_.method1857(class14_sub2_sub15, i_82_, aBoolean754);
			Class133_Sub7 class133_sub7_87_ = class133_sub7_86_;
			return class133_sub7_87_;
		}
		Class133_Sub7 class133_sub7_88_ = (class133_sub7.method1860(
				(!class14_sub2_sub15.method338(i_82_) & !class14_sub2_sub15_85_.method338(i)),
				!class46_83_.aBoolean754 & !aBoolean754));
		class133_sub7_88_.method1873(class14_sub2_sub15, i_82_, class14_sub2_sub15_85_, i, anIntArray780,
				class46_83_.aBoolean754 | aBoolean754);
		Class133_Sub7 class133_sub7_89_ = class133_sub7_88_;
		return class133_sub7_89_;
	}

	public void method1179(Buffer class14_sub10, byte i) {
		for (;;) {
			int i_90_ = class14_sub10.method798();
			if (i_90_ == 0)
				break;
			method1169(i_90_, class14_sub10, -11);
		}
		if (i < 73)
			anIntArray775 = null;
	}

	public Class46() {
		aBoolean754 = false;
		aBoolean757 = false;
		anInt758 = -1;
		anInt760 = -1;
		anInt770 = 99;
		anInt777 = 5;
		anInt771 = -1;
		anInt753 = 2;
		anInt781 = -1;
	}
}
