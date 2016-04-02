/* Class14_Sub8_Sub22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class1;
import rs.Class118;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class126;
import rs.Class137;
import rs.Class139;
import rs.Class14_Sub13;
import rs.Class14_Sub17;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub17;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub3;
import rs.Class30;
import rs.Class31;
import rs.Class42;
import rs.Class43;
import rs.Class51;
import rs.Class59;
import rs.Class60;
import rs.Class67;
import rs.Class79;
import rs.Class7_Sub3;
import rs.Static2;
import rs.client;

public class Class14_Sub8_Sub22 extends Class14_Sub8 {
	public static Class124 aClass124_4452;
	public static Class124 aClass124_4453;
	public static Class124 aClass124_4456 = Class14_Sub2_Sub2.method263(1178, "Loaded update list");
	public static Class124 aClass124_4462;
	public static Class31 aClass31_4454;

	static {
		aClass124_4453 = aClass124_4456;
		aClass124_4452 = Class14_Sub2_Sub2.method263(1178, "<col=40ff00>");
		aClass124_4462 = Class14_Sub2_Sub2.method263(1178, "hint_mapmarkers");
	}

	public static void method593(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i_2_;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = -i_4_ + i_0_;
		int i_11_ = i_2_ - i_4_;
		int i_12_ = i_0_ * i_0_;
		int i_13_ = i_2_ * i_2_;
		int i_14_ = i_10_ * i_10_;
		int i_15_ = i_12_ << 33;
		int i_16_ = i_11_ * i_11_;
		int i_17_ = i_13_ << 1;
		int i_18_ = i_16_ << 1;
		int i_19_ = i_14_ << 33;
		int i_20_ = i_2_ << 1;
		int i_21_ = i_12_ * (-i_20_ + 1) + i_17_;
		int i_22_ = i_11_ << 1;
		int i_23_ = -((i_20_ - 1) * i_15_) + i_13_;
		int i_24_ = i_14_ * (-i_22_ + 1) + i_18_;
		int i_25_ = i_16_ - i_19_ * (i_22_ - 1);
		int i_26_ = i_12_ << 34;
		int i_27_ = i_13_ << 34;
		int i_28_ = i_14_ << 2;
		int i_29_ = i_16_ << 34;
		int i_30_ = i_15_ * (i_20_ - 3);
		int i_31_ = i_18_ * 3;
		int i_32_ = i_17_ * 3;
		if (i_3_ > -67)
			aClass31_4454 = null;
		int i_33_ = i_19_ * (i_22_ - 3);
		int i_34_ = i_27_;
		int i_35_ = (i_2_ - 1) * i_26_;
		int i_36_ = i_29_;
		int i_37_ = i_28_ * (i_11_ - 1);
		if (i_5_ >= Class14_Sub17.anInt3005 && i_5_ <= Class59.anInt955) {
			int[] is = Static2.anIntArrayArray4038[i_5_];
			int i_38_ = Class67.method1301((byte) 72, -i_0_ + i, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_39_ = Class67.method1301((byte) -105, i + i_0_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_40_ = Class67.method1301((byte) -125, -i_10_ + i, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			int i_41_ = Class67.method1301((byte) 27, i + i_10_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
			Class51.method1201(is, i_38_, i_40_, -5973, i_1_);
			Class51.method1201(is, i_40_, i_41_, -5973, i_6_);
			Class51.method1201(is, i_41_, i_39_, -5973, i_1_);
		}
		while (i_7_ > 0) {
			if (i_21_ < 0) {
				while (i_21_ < 0) {
					i_21_ += i_32_;
					i_32_ += i_27_;
					i_8_++;
					i_23_ += i_34_;
					i_34_ += i_27_;
				}
			}
			if (i_23_ < 0) {
				i_23_ += i_34_;
				i_8_++;
				i_34_ += i_27_;
				i_21_ += i_32_;
				i_32_ += i_27_;
			}
			i_21_ -= i_35_;
			boolean bool = i_11_ >= i_7_;
			i_23_ -= i_30_;
			i_30_ -= i_26_;
			if (bool) {
				if (i_24_ < 0) {
					while (i_24_ < 0) {
						i_25_ += i_36_;
						i_36_ += i_29_;
						i_24_ += i_31_;
						i_31_ += i_29_;
						i_9_++;
					}
				}
				if (i_25_ < 0) {
					i_24_ += i_31_;
					i_31_ += i_29_;
					i_9_++;
					i_25_ += i_36_;
					i_36_ += i_29_;
				}
				i_25_ -= i_33_;
				i_33_ -= i_28_;
				i_24_ -= i_37_;
				i_37_ -= i_28_;
			}
			i_7_--;
			int i_42_ = i_5_ - i_7_;
			i_35_ -= i_26_;
			int i_43_ = i_5_ + i_7_;
			if (Class14_Sub17.anInt3005 <= i_43_ && Class59.anInt955 >= i_42_) {
				int i_44_ = Class67.method1301((byte) 40, i_8_ + i, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
				int i_45_ = Class67.method1301((byte) -112, -i_8_ + i, Class118.anInt1982,
						Class14_Sub8_Sub14.anInt4327);
				if (bool) {
					int i_46_ = Class67.method1301((byte) 35, i + i_9_, Class118.anInt1982,
							Class14_Sub8_Sub14.anInt4327);
					int i_47_ = Class67.method1301((byte) -81, -i_9_ + i, Class118.anInt1982,
							Class14_Sub8_Sub14.anInt4327);
					if (i_42_ >= Class14_Sub17.anInt3005) {
						int[] is = Static2.anIntArrayArray4038[i_42_];
						Class51.method1201(is, i_45_, i_47_, -5973, i_1_);
						Class51.method1201(is, i_47_, i_46_, -5973, i_6_);
						Class51.method1201(is, i_46_, i_44_, -5973, i_1_);
					}
					if (i_43_ <= Class59.anInt955) {
						int[] is = Static2.anIntArrayArray4038[i_43_];
						Class51.method1201(is, i_45_, i_47_, -5973, i_1_);
						Class51.method1201(is, i_47_, i_46_, -5973, i_6_);
						Class51.method1201(is, i_46_, i_44_, -5973, i_1_);
					}
				} else {
					if (Class14_Sub17.anInt3005 <= i_42_)
						Class51.method1201((Static2.anIntArrayArray4038[i_42_]), i_45_, i_44_, -5973, i_1_);
					if (i_43_ <= Class59.anInt955)
						Class51.method1201((Static2.anIntArrayArray4038[i_43_]), i_45_, i_44_, -5973, i_1_);
				}
			}
		}
	}

	public static void method594(int i, boolean bool, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, int i_53_,
			int i_54_) {
		if (bool) {
			if (!Class126.method1741((byte) 68, i_49_)) {
				if (i_50_ != -1)
					Class14_Sub8_Sub36.aBooleanArray4698[i_50_] = true;
				else {
					for (int i_55_ = 0; i_55_ < 100; i_55_++)
						Class14_Sub8_Sub36.aBooleanArray4698[i_55_] = true;
				}
			} else {
				Class60.aClass94Array980 = null;
				Class137.method1942(i_50_, i_54_, i_51_, -1, Class1.aClass94ArrayArray75[i_49_], i_53_, i_48_, i,
						(byte) 93, i_52_);
				if (Class60.aClass94Array980 != null) {
					Class137.method1942(i_50_, i_54_, i_51_, -1412584499, Class60.aClass94Array980, i_53_,
							Class14_Sub8_Sub17.anInt4379, i, (byte) 93, Class14_Sub8_Sub12.anInt4295);
					Class60.aClass94Array980 = null;
				}
			}
		}
	}

	public static void method595(int i, Class43 class43) {
		if (i != 257411150)
			method593(71, -18, -85, -23, -65, -90, 58, -123);
		Class30 class30 = null;
		try {
			Class31 class31 = class43.method1152("runescape", i - 257411150);
			while (class31.anInt529 == 0)
				Class14_Sub13.method864(1L, (byte) 64);
			if (class31.anInt529 == 1) {
				class30 = (Class30) class31.anObject530;
				Buffer class14_sub10 = Class7_Sub3.method132((byte) 63);
				class30.method1056(0, class14_sub10.position, class14_sub10.payload, -20563);
			}
		} catch (Exception exception) {
			/* empty */
		}
		try {
			if (class30 != null)
				class30.method1057(25861);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public static boolean method596(long l, int i, int i_56_, int i_57_) {
		int i_58_ = ((int) l & 0x7dba5) >> 14;
		int i_59_ = (int) (l >>> 32) & 0x7fffffff;
		int i_60_ = (int) l >> 52 & 0x3;
		if (i_58_ == 10 || i_58_ == 11 || i_58_ == 22) {
			Class79 class79 = Class79.method1377((byte) -106, i_59_);
			int i_61_;
			int i_62_;
			if (i_60_ == 0 || i_60_ == 2) {
				i_62_ = class79.anInt1227;
				i_61_ = class79.anInt1245;
			} else {
				i_61_ = class79.anInt1227;
				i_62_ = class79.anInt1245;
			}
			int i_63_ = class79.anInt1244;
			if (i_60_ != 0)
				i_63_ = (i_63_ << i_60_ & 0xf) + (i_63_ >> 4 - i_60_);
			Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), i_61_, 0, i_63_,
					(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, 0, i, 2, i_62_, i_56_);
		} else
			Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, i_60_, 0,
					(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, i_58_ + 1, i, 2, 0,
					i_56_);
		Class14_Sub2_Sub11.anInt3881 = 2;
		Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
		int i_64_ = 67 / ((-9 - i_57_) / 36);
		Class14_Sub2_Sub17.anInt4017 = 0;
		Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
		boolean bool = true;
		return bool;
	}

	public static boolean method597(Class124 class124, int i) {
		if (class124 == null) {
			boolean bool = false;
			return bool;
		}
		for (int i_65_ = i; i_65_ < Class42.anInt698; i_65_++) {
			if (class124.method1717(40, client.aClass124Array2645[i_65_]))
				return true;
		}
		return false;
	}

	public static boolean method598(int i, int i_66_) {
		if (i_66_ <= i && i <= 122) {
			boolean bool = true;
			return bool;
		}
		if (i >= 65 && i <= 90) {
			boolean bool = true;
			return bool;
		}
		if (i >= 48 && i <= 57) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public static void method599(boolean bool) {
		if (bool)
			method597(null, 104);
		aClass124_4452 = null;
		aClass124_4456 = null;
		aClass124_4462 = null;
		aClass124_4453 = null;
		aClass31_4454 = null;
	}

	public Class14_Sub8_Sub22() {
		super(0, true);
	}

	public int[] method484(int i, byte i_67_) {
		if (i_67_ >= -58)
			aClass124_4453 = null;
		int[] is = Class14_Sub8_Sub4.anIntArray4145;
		return is;
	}
}
