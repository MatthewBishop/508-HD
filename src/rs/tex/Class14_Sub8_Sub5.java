/* Class14_Sub8_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Class2;
import com.jagex.link.HashTable;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;

import rs.Class108;
import rs.Class111;
import rs.Class112;
import rs.Class124;
import rs.Class133_Sub6;
import rs.Class138;
import rs.Class141;
import rs.Class146;
import rs.Class14_Sub14;
import rs.Class14_Sub21;
import rs.Class14_Sub2_Sub18_Sub2;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub5;
import rs.Class14_Sub9_Sub3;
import rs.Class17;
import rs.Class18;
import rs.Class35;
import rs.Class36;
import rs.Class37;
import rs.Class47;
import rs.Class53;
import rs.Class79;
import rs.Class83;
import rs.Class92;
import rs.Static2;

public class Class14_Sub8_Sub5 extends Class14_Sub8 {
	public static Class124 aClass124_4165;
	public static Class124 aClass124_4167;
	public static Class124 aClass124_4168;
	public static Class2 aClass2_4163 = new Class2();
	public static HashTable aClass55_4155;
	public static int anInt4166;
	public static short[][] aShortArrayArray4157 = {
			{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
					-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
					5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
					-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
					61, 74, 86, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341, 21433, 27581, 30651,
					-31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128, 17940, 30614, -30952,
					-26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101, 10178, 14272, 17341,
					21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020, 7062, 1160, 15128,
					17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 955, 1845, 4032, 7101,
					10178, 14272, 17341, 21433, 27581, 30651, -31811, -27717, -24640, -21581, -17603, -13383, 794, 5020,
					7062, 1160, 15128, 17940, 30614, -30952, -26728, -23662, -18536, -14440, -9324, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
					-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
					5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
					-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
					61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325,
					4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796,
					2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402,
					30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980,
					-18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969,
					-28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866,
					10347, 10582, 10429, 10407, 10359, 8414, 9540, 10456, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0 },
			{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
					-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
					5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
					-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
					61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099,
					11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916,
					-25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318,
					21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732,
					8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749,
					2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379,
					29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005,
					-18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196,
					-21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66,
					39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008,
					18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824,
					-22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570,
					8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686,
					-22623, -23014, 14866 },
			{ 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911,
					4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217,
					-32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861,
					-10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466,
					7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809,
					796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196,
					30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980,
					-18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969,
					-28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866,
					13766, 13745, 13726, 13890, 13743, 13852, 17602, 18605, 21660, 24000, 24997, 24088, 27972, 25903,
					26904, 27193, 27175, 27156, 30020, 28975, 29976, 12482, 13485, 10392, 10692, 10669, 10776, 6717,
					6695, 7830, 6971, 6951, 5910, 3389, 3369, 3356, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
					0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
			{ 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412,
					-21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936,
					5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630,
					-5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49,
					61, 74, 86, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099,
					11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916,
					-25933, -25956, -21824, -22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318,
					21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732,
					8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66, 39, 20, 4, 823, 809, 796, 2749,
					2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008, 18231, 18339, 18196, 30402, 30379,
					29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824, -22869, -21864, -17980, -18005,
					-18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570, 8670, 13788, 25827, 31969, -28196,
					-21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686, -22623, -23014, 14866, 119, 92, 66,
					39, 20, 4, 823, 809, 796, 2749, 2733, 2712, 4934, 4911, 4888, 8004, 8099, 11078, 11053, 10008,
					18231, 18339, 18196, 30402, 30379, 29458, -31168, -32217, -32238, -25916, -25933, -25956, -21824,
					-22869, -21864, -17980, -18005, -18026, -11838, -11861, -10858, 23318, 21910, 21776, 1502, 4570,
					8670, 13788, 25827, 31969, -28196, -21028, -15908, -7466, 7977, 8732, 8596, 4894, 5908, 794, 1686,
					-22623, -23014, 14866 } };
	static {
		aClass55_4155 = new HashTable(512);
		aClass124_4165 = Class14_Sub2_Sub2.method263(1178, " )2>");
		anInt4166 = 0;
		aClass124_4168 = Class14_Sub2_Sub2.method263(1178, "Location");
		aClass124_4167 = aClass124_4168;
	}
	public static void method500(byte i) {
		aShortArrayArray4157 = null;
		aClass55_4155 = null;
		aClass2_4163 = null;
		aClass124_4167 = null;
		int i_0_ = 26 / ((i + 56) / 61);
		aClass124_4165 = null;
		aClass124_4168 = null;
	}

	public static void method501(byte i) {
		int i_1_ = -2 / ((-31 - i) / 45);
		Class14_Sub14.aClass52_2982.clear();
		Class37.aClass52_635.clear();
		Class14_Sub8_Sub6.aClass52_4186.clear();
	}

	public static void method502(boolean bool, int i) {
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(512, 512);
		int[] is = class14_sub2_sub19_sub1.anIntArray5088;
		if (bool)
			aClass124_4167 = null;
		int i_2_ = is.length;
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++)
			is[i_3_] = 1;
		for (int i_4_ = 1; i_4_ < 103; i_4_++) {
			int i_5_ = (52736 - i_4_ * 512) * 4 + 24628;
			for (int i_6_ = 1; i_6_ < 103; i_6_++) {
				if ((Class14_Sub8_Sub4.tileFlags[i][i_6_][i_4_] & 0x18) == 0)
					Class108.method1562(is, i_5_, 512, i, i_6_, i_4_);
				if (i < 3 && (Class14_Sub8_Sub4.tileFlags[i + 1][i_6_][i_4_] & 0x8) != 0)
					Class108.method1562(is, i_5_, 512, i + 1, i_6_, i_4_);
				i_5_ += 4;
			}
		}
		class14_sub2_sub19_sub1.method413();
		int i_7_ = (int) (Math.random() * 20.0) + 238 - 10 << 48;
		int i_8_ = ((int) (Math.random() * 20.0) + 228 + ((int) (Math.random() * 20.0) - 10 + 238 << 16)
				+ ((int) (Math.random() * 20.0) + 238 - 10 << 40));
		for (int i_9_ = 1; i_9_ < 103; i_9_++) {
			for (int i_10_ = 1; i_10_ < 103; i_10_++) {
				if ((Class14_Sub8_Sub4.tileFlags[i][i_10_][i_9_] & 0x18) == 0)
					Static.method462(i_10_, i_8_, i_9_, i, 0, i_7_);
				if (i < 3 && (Class14_Sub8_Sub4.tileFlags[i + 1][i_10_][i_9_] & 0x8) != 0)
					Static.method462(i_10_, i_8_, i_9_, i + 1, 0, i_7_);
			}
		}
		Class18.anInt411 = 0;
		for (int i_11_ = 0; i_11_ < 104; i_11_++) {
			for (int i_12_ = 0; i_12_ < 104; i_12_++) {
				long l = Class14_Sub8_Sub19.method578(Class14_Sub2_Sub3.anInt3785, i_11_, i_12_);
				if (l != 0L) {
					Class79 class79 = Class79.method1377((byte) -106, (int) (l >>> 32) & 0x7fffffff);
					int i_13_ = class79.anInt1262;
					if (class79.anIntArray1276 != null) {
						for (int i_14_ = 0; i_14_ < class79.anIntArray1276.length; i_14_++) {
							if (class79.anIntArray1276[i_14_] != -1) {
								Class79 class79_15_ = Class79.method1377((byte) -106, (class79.anIntArray1276[i_14_]));
								if (class79_15_.anInt1262 >= 0) {
									i_13_ = class79_15_.anInt1262;
									break;
								}
							}
						}
					}
					if (i_13_ >= 0) {
						int i_16_ = i_11_;
						int i_17_ = i_12_;
						if (i_13_ != 22 && i_13_ != 29 && i_13_ != 34 && i_13_ != 36 && i_13_ != 46 && i_13_ != 47
								&& i_13_ != 48) {
							int[][] is_18_ = (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].anIntArrayArray546);
							for (int i_19_ = 0; i_19_ < 10; i_19_++) {
								int i_20_ = (int) (Math.random() * 4.0);
								if (i_20_ == 0 && i_16_ > 0 && i_16_ > i_11_ - 3
										&& ((is_18_[i_16_ - 1][i_17_] & 0x12c0108) == 0))
									i_16_--;
								if (i_20_ == 1 && i_16_ < 103 && i_11_ + 3 > i_16_
										&& ((is_18_[i_16_ + 1][i_17_] & 0x12c0180) == 0))
									i_16_++;
								if (i_20_ == 2 && i_17_ > 0 && i_12_ - 3 < i_17_
										&& ((is_18_[i_16_][i_17_ - 1] & 0x12c0102) == 0))
									i_17_--;
								if (i_20_ == 3 && i_17_ < 103 && i_17_ < i_12_ + 3
										&& ((is_18_[i_16_][i_17_ + 1] & 0x12c0120) == 0))
									i_17_++;
							}
						}
						Class14_Sub8_Sub25.anIntArray4512[Class18.anInt411] = class79.anInt1257;
						Static2.anIntArray363[Class18.anInt411] = i_16_;
						Class17.anIntArray400[Class18.anInt411] = i_17_;
						Class18.anInt411++;
					}
				}
			}
		}
		for (int i_21_ = 0; i_21_ < i_2_; i_21_++) {
			if (is[i_21_] == 0)
				is[i_21_] = 1;
		}
		Class133_Sub6.aClass14_Sub2_Sub19_3640 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
		Class92.anIntArray1437 = null;
	}

	public static boolean method503() {
		synchronized (Class14_Sub8_Sub9.aClass141_4239) {
			if (Class14_Sub8_Sub21.anInt4436 != Class14_Sub9_Sub3.anInt4850) {
				Class36.anInt630 = Class138.anIntArray2224[Class14_Sub9_Sub3.anInt4850];
				Class146.anInt2358 = Class36.anIntArray632[Class14_Sub9_Sub3.anInt4850];
				Class14_Sub9_Sub3.anInt4850 = Class14_Sub9_Sub3.anInt4850 + 1 & 127;
				return true;
			}
			return false;
		}
	}

	public static Class124 method504(int i, int i_33_) {
		Class124 class124 = Class83.method1407(10, i);
		for (int i_34_ = class124.method1693(0) - 3; i_34_ > 0; i_34_ -= 3)
			class124 = (Class14_Sub8_Sub7.method515(new Class124[] { class124.method1697(0, i_34_, (byte) -104),
					Class53.aClass124_867, class124.method1696(i_34_, 15) }, (byte) -128));
		int i_35_ = -45 % ((-73 - i_33_) / 43);
		if (class124.method1693(0) > 9) {
			Class124 class124_36_ = (Class14_Sub8_Sub7.method515(
					(new Class124[] { Class35.aClass124_588,
							class124.method1697(0, class124.method1693(0) - 8, (byte) -104), Static.aClass124_694,
							Class14_Sub8_Sub17.aClass124_4360, class124, Class14_Sub2_Sub5.aClass124_3814 }),
					(byte) -19));
			return class124_36_;
		}
		if (class124.method1693(0) > 6) {
			Class124 class124_37_ = (Class14_Sub8_Sub7.method515(
					(new Class124[] { Class47.aClass124_793,
							class124.method1697(0, class124.method1693(0) - 4, (byte) -104), Class111.aClass124_1858,
							Class14_Sub8_Sub17.aClass124_4360, class124, Class14_Sub2_Sub5.aClass124_3814 }),
					(byte) -91));
			return class124_37_;
		}
		Class124 class124_38_ = Class14_Sub8_Sub7.method515(
				(new Class124[] { Class36.aClass124_628, class124, (Class14_Sub2_Sub18_Sub2.aClass124_5084) }),
				(byte) -13);
		return class124_38_;
	}

	public int anInt4154 = 4096;

	public int anInt4161 = 0;

	public Class14_Sub8_Sub5() {
		super(1, false);
	}

	public int[][] method474(int i, int i_39_) {
		if (i_39_ > -4)
			method474(-8, -45);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_40_ = method480(0, 0, i);
			int[] is_41_ = is_40_[0];
			int[] is_42_ = is_40_[1];
			int[] is_43_ = is[0];
			int[] is_44_ = is[1];
			int[] is_45_ = is_40_[2];
			int[] is_46_ = is[2];
			for (int i_47_ = 0; Class112.anInt1876 > i_47_; i_47_++) {
				int i_48_ = is_41_[i_47_];
				int i_49_ = is_45_[i_47_];
				int i_50_ = is_42_[i_47_];
				if (i_48_ >= anInt4161) {
					if (i_48_ <= anInt4154)
						is_43_[i_47_] = i_48_;
					else
						is_43_[i_47_] = anInt4154;
				} else
					is_43_[i_47_] = anInt4161;
				if (i_50_ >= anInt4161) {
					if (i_50_ <= anInt4154)
						is_44_[i_47_] = i_50_;
					else
						is_44_[i_47_] = anInt4154;
				} else
					is_44_[i_47_] = anInt4161;
				if (anInt4161 > i_49_)
					is_46_[i_47_] = anInt4161;
				else if (i_49_ > anInt4154)
					is_46_[i_47_] = anInt4154;
				else
					is_46_[i_47_] = i_49_;
			}
		}
		int[][] is_51_ = is;
		return is_51_;
	}

	public void method475(int i, int i_52_, Buffer class14_sub10) {
		int i_53_ = i;
		while_214_: do {
			do {
				if (i_53_ != 0) {
					if (i_53_ != 1) {
						if (i_53_ == 2)
							break;
						break while_214_;
					}
				} else {
					anInt4161 = class14_sub10.method784((byte) 104);
					break while_214_;
				}
				anInt4154 = class14_sub10.method784((byte) 103);
				break while_214_;
			} while (false);
			aBoolean2862 = class14_sub10.method798() == 1;
		} while (false);
		if (i_52_ != 24777)
			anInt4166 = 48;
	}

	public int[] method484(int i, byte i_54_) {
		if (i_54_ > -58)
			method484(-1, (byte) -29);
		int[] is = aClass149_2851.method2014(i, (byte) 108);
		if (aClass149_2851.aBoolean2402) {
			int[] is_55_ = method483(0, (byte) -128, i);
			for (int i_56_ = 0; Class112.anInt1876 > i_56_; i_56_++) {
				int i_57_ = is_55_[i_56_];
				if (anInt4161 <= i_57_) {
					if (i_57_ <= anInt4154)
						is[i_56_] = i_57_;
					else
						is[i_56_] = anInt4154;
				} else
					is[i_56_] = anInt4161;
			}
		}
		int[] is_58_ = is;
		return is_58_;
	}
}
