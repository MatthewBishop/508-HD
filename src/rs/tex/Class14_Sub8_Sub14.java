/* Class14_Sub8_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.awt.event.ActionEvent;

import com.jagex.util.Util;

import rs.Canvas_Sub1;
import rs.Class103;
import rs.Class112;
import rs.Class115;
import rs.Class12;
import rs.Class122;
import rs.Class124;
import rs.Class125;
import rs.Class125_Sub1;
import rs.Class125_Sub2;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub3;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class139;
import rs.Class140;
import rs.Class14_Sub15;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub17;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub3;
import rs.Class14_Sub4;
import rs.Class14_Sub6;
import rs.Class15;
import rs.Class17;
import rs.Class33;
import rs.Class43;
import rs.Class44;
import rs.Class51;
import rs.Class54;
import rs.Class56_Sub1;
import rs.Class58;
import rs.Class72;
import rs.Class83;
import rs.Class88;
import rs.Class9;
import rs.Class94;
import rs.Class98;
import rs.Class9_Sub1;
import rs.RuntimeException_Sub1;
import rs.Static2;
import rs.client;

public class Class14_Sub8_Sub14 extends Class14_Sub8 {
	public static Class124 aClass124_4322;
	public static Class124 aClass124_4325;
	public static Class124 aClass124_4326 = Class14_Sub2_Sub2.method263(1178, "www");
	public static Class124 aClass124_4330;
	public static Class9_Sub1 aClass9_Sub1_4323;
	public static int anInt4327;

	static {
		aClass124_4325 = Class14_Sub2_Sub2.method263(1178, "leuchten3:");
		aClass124_4322 = Class14_Sub2_Sub2.method263(1178, " is already on your ignore list)3");
		anInt4327 = 100;
		aClass124_4330 = aClass124_4322;
	}

	public static int method550(Class9 class9, byte i) {
		if (i != 61)
			aClass124_4330 = null;
		int i_0_ = 0;
		if (class9.method171(i + 29438, Class14_Sub8_Sub25.anInt4509))
			i_0_++;
		if (class9.method171(i ^ 0x7306, Class14_Sub8_Sub30.anInt4594))
			i_0_++;
		int i_1_ = i_0_;
		return i_1_;
	}

	public static void method551(Class133_Sub1_Sub1 class133_sub1_sub1, int i) {
		Class14_Sub3 class14_sub3 = ((Class14_Sub3) Class88.aClass55_1398
				.get(class133_sub1_sub1.aClass124_4922.method1692(0)));
		if (i != -574)
			aClass124_4322 = null;
		if (class14_sub3 != null) {
			if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
				Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
				class14_sub3.aClass14_Sub9_Sub4_2775 = null;
			}
			class14_sub3.unlink();
		}
	}

	public static void method552(int i, int i_2_) {
		if (i_2_ >= 0) {
			int i_3_ = Class14_Sub8_Sub27.anIntArray4544[i_2_];
			int i_4_ = Static.anIntArray3288[i_2_];
			int i_5_ = Class14_Sub29.aShortArray3262[i_2_];
			if (i_5_ >= 2000)
				i_5_ -= 2000;
			long l = Static.aLongArray3924[i_2_];
			int i_6_ = (int) Static.aLongArray3924[i_2_];
			if (i_5_ == 39) {
				Class14_Sub8_Sub22.method596(l, i_3_, i_4_, -94);
				Static.aClass14_Sub10_Sub1_891.writeOpcode(158);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class133_Sub6.anInt3676 + i_3_);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 109, (int) (l >>> 32) & 0x7fffffff);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -49, Class58.anInt947 + i_4_);
			}
			if (i_5_ == 42) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(186);
				Static.aClass14_Sub10_Sub1_891.method785(i - 112, i_4_);
				Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -61, i_3_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 18) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(68);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -88, i_6_);
				}
			}
			if (i_5_ == 15) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(113);
				Static.aClass14_Sub10_Sub1_891.method803(i_4_, i ^ 0x4e);
				Class94 class94 = Static.method1233(i_4_, 21803);
				Class14_Sub3.anInt2771++;
				if (class94.anIntArrayArray1586 != null && class94.anIntArrayArray1586[0][0] == 5) {
					int i_7_ = class94.anIntArrayArray1586[0][1];
					Class14_Sub8_Sub11.anIntArray4275[i_7_] = -Class14_Sub8_Sub11.anIntArray4275[i_7_] + 1;
					Class122.method1660(15237, i_7_);
				}
			}
			if (i_5_ == 28) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(211);
				Static.aClass14_Sub10_Sub1_891.method785(i - 67, i_4_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -103, i_3_);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 123, i_6_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 36) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(154);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -106, i_6_);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub29.anInt3238);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				Static.aClass14_Sub10_Sub1_891.method785(i ^ ~0x4d, i_4_);
				Static.aClass14_Sub10_Sub1_891.method785(-124, Class14_Sub2_Sub11.anInt3874);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 58) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(137);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 95, i_6_);
				Static.aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 34) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(24);
					Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method811(Class14_Sub2_Sub11.anInt3874, (byte) -96);
					Static.aClass14_Sub10_Sub1_891.method792(Class14_Sub29.anInt3238, (byte) -98);
				}
			}
			if (i_5_ == 40) {
				Class14_Sub3.anInt2771++;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(113);
				Static.aClass14_Sub10_Sub1_891.method803(i_4_, 109);
				Class94 class94 = Static.method1233(i_4_, 21803);
				if (class94.anIntArrayArray1586 != null && class94.anIntArrayArray1586[0][0] == 5) {
					int i_8_ = class94.anIntArrayArray1586[0][1];
					if (Class14_Sub8_Sub11.anIntArray4275[i_8_] != class94.anIntArray1527[0]) {
						Class14_Sub8_Sub11.anIntArray4275[i_8_] = class94.anIntArray1527[0];
						Class122.method1660(15237, i_8_);
					}
				}
			}
			if (i_5_ == 30) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(12);
					Static.aClass14_Sub10_Sub1_891.method785(-94, Static.anInt3960);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 112, i_6_);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -49, Class14_Sub8.anInt2853);
					Static.aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
				}
			}
			if (i_5_ == 29) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(220);
				Static.aClass14_Sub10_Sub1_891.method785(i ^ ~0x37, i_4_);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				Static.aClass14_Sub10_Sub1_891.method792(i_3_, (byte) -98);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 9) {
				boolean bool = Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(9);
				Static.aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -65, i_6_);
				Static.aClass14_Sub10_Sub1_891.method808(Static.anInt3960, (byte) -108);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -85, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 96, Class14_Sub8.anInt2853);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class133_Sub6.anInt3676 + i_3_);
			}
			if (i_5_ == 3) {
				boolean bool = Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(39);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				Static.aClass14_Sub10_Sub1_891.method792(Class133_Sub6.anInt3676 + i_3_, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_4_ + Class58.anInt947);
			}
			if (i_5_ == 24) {
				boolean bool = Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(201);
				Static.aClass14_Sub10_Sub1_891.method792(Class58.anInt947 + i_4_, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 99, i_3_ + Class133_Sub6.anInt3676);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -60, i_6_);
			}
			if (i_5_ == 23 && Class14_Sub8_Sub22.method596(l, i_3_, i_4_, i + 57)) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(114);
				Static.aClass14_Sub10_Sub1_891.method838(i - 1676904088, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method792(i_3_ + Class133_Sub6.anInt3676, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method808(Class14_Sub2_Sub11.anInt3874, (byte) -76);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub29.anInt3238);
			}
			if (i_5_ == 14) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(199);
					Static.aClass14_Sub10_Sub1_891.method838(i - 1676904088, i_6_);
				}
			}
			if (i_5_ == 1002) {
				Class14_Sub2_Sub17.anInt4017 = 0;
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class12 class12 = class133_sub1_sub2.aClass12_4949;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 != null) {
						Static.aClass14_Sub10_Sub1_891.writeOpcode(88);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 116, class12.anInt337);
					}
				}
			}
			if (i_5_ == 35) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(185);
				Static.aClass14_Sub10_Sub1_891.method808(i_4_, (byte) -101);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 116, i_3_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -85, i_6_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 49) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(131);
					Static.aClass14_Sub10_Sub1_891.method785(-126, Static.anInt3960);
					Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub8.anInt2853);
					Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Canvas_Sub1.anInt53);
				}
			}
			if (i_5_ == 12) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(3);
				Static.aClass14_Sub10_Sub1_891.method808(i_4_, (byte) -82);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 10) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(37);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 115, i_6_);
				}
			}
			if (i_5_ == 7)
				Class140.method1958((byte) 111);
			if (i_5_ == 44) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(134);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 110, i_6_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -84, i_3_);
				Static.aClass14_Sub10_Sub1_891.method785(i ^ ~0x74, i_4_);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, i + 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 50) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(221);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -125, i_6_);
				}
			}
			if (i_5_ == 46) {
				Class14_Sub8_Sub22.method596(l, i_3_, i_4_, i ^ 0x3b);
				Static.aClass14_Sub10_Sub1_891.writeOpcode(228);
				Static.aClass14_Sub10_Sub1_891.method792(i_4_ + Class58.anInt947, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method838(i - 1676904088, (int) (l >>> 32) & 0x7fffffff);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -84, i_3_ + Class133_Sub6.anInt3676);
			}
			if (i_5_ == 1 || i_5_ == 1007)
				Class14_Sub8_Sub18.method574(i_6_, i_3_, 122, i_4_, (RuntimeException_Sub1.aClass124Array2459[i_2_]));
			if (i_5_ == 5) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(45);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 114, i_6_);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_3_);
				Static.aClass14_Sub10_Sub1_891.method803(i_4_, 105);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 16) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(70);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 111, Class14_Sub29.anInt3238);
					Static.aClass14_Sub10_Sub1_891.method838(i ^ ~0x63f38697, i_6_);
					Static.aClass14_Sub10_Sub1_891.method803(Class14_Sub2_Sub11.anInt3874, 105);
				}
			}
			if (i_5_ == 41) {
				boolean bool = Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(150);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 121, Class133_Sub6.anInt3676 + i_3_);
			}
			if (i_5_ == 47) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class124.anInt2483++;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(253);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -106, i_6_);
				}
			}
			if (i_5_ == 19) {
				Class14_Sub8_Sub22.method596(l, i_3_, i_4_, i - 100);
				Static.aClass14_Sub10_Sub1_891.writeOpcode(94);
				Static.aClass14_Sub10_Sub1_891.method792(i_3_ + Class133_Sub6.anInt3676, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method838(i - 1676904088, (int) (l >>> 32) & 0x7fffffff);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -113, Class58.anInt947 + i_4_);
			}
			if (i_5_ == 45) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class54.anInt880++;
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(93);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -94, i_6_);
				}
			}
			if (i_5_ == 13) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub8_Sub16.anInt4350++;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(160);
					Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
				}
			}
			if (i_5_ == 1003) {
				Class14_Sub8_Sub22.method596(l, i_3_, i_4_, i + 122);
				Static.aClass14_Sub10_Sub1_891.writeOpcode(190);
				Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -60, Class133_Sub6.anInt3676 + i_3_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -70, (int) (l >>> 32) & 0x7fffffff);
			}
			if (i_5_ == 2) {
				Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
				if (class133_sub1_sub2 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub2.anIntArray3476[0], 2, 1, class133_sub1_sub2.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(7);
					Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				}
			}
			if (i_5_ == 37) {
				Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_];
				if (class133_sub1_sub1 != null) {
					Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0,
							(byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0,
							class133_sub1_sub1.anIntArray3476[0], 2, 1, class133_sub1_sub1.anIntArray3443[0]);
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(227);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -109, i_6_);
				}
			}
			if (i_5_ == 1006) {
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class56_Sub1.anInt3322++;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(38);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -80, i_6_);
			}
			if (i_5_ == 51) {
				Class14_Sub8_Sub22.method596(l, i_3_, i_4_, 82);
				Static.aClass14_Sub10_Sub1_891.writeOpcode(46);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -107, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -63, i_3_ + Class133_Sub6.anInt3676);
				Static.aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
			}
			if (i_5_ == 26) {
				Static.aClass14_Sub10_Sub1_891.writeOpcode(152);
				Static.aClass14_Sub10_Sub1_891.method801((byte) -86, i_3_);
				Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
				Static.aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
				Class14_Sub8_Sub3.anInt4124 = 0;
				Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
				Class14_Sub8_Sub13.anInt4314 = i_3_;
			}
			if (i_5_ == 17) {
				boolean bool = Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
						0, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
						2, 0, i_4_);
				if (!bool)
					bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
							0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_,
							2, 1, i_4_));
				Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
				Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
				Class14_Sub2_Sub11.anInt3881 = 2;
				Class14_Sub2_Sub17.anInt4017 = 0;
				Static.aClass14_Sub10_Sub1_891.writeOpcode(191);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 118, Class133_Sub6.anInt3676 + i_3_);
				Static.aClass14_Sub10_Sub1_891.method833((byte) 105, Class58.anInt947 + i_4_);
				Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
			}
			if (i_5_ == 48) {
				Class94 class94 = Class14_Sub6.method464(i_3_, i_4_, (byte) -19);
				if (class94 != null) {
					Class14_Sub8_Sub28.method632(26423884);
					Class14_Sub8_Sub7.method514(i ^ 0x7fff, i_4_, i_3_,
							Class44.method1158(client.method46(class94), false));
					Class51.anInt831 = 0;
					Class125.aClass124_2082 = Class54.method1217(class94, i ^ ~0x72);
					if (Class125.aClass124_2082 == null)
						Class125.aClass124_2082 = Static2.aClass124_4876;
					if (!class94.aBoolean1455)
						Class17.aClass124_408 = (Class14_Sub8_Sub7.method515((new Class124[] {
								Class14_Sub8_Sub2.aClass124_4116, class94.aClass124_1483, Class17.aClass124_398 }),
								(byte) -43));
					else
						Class17.aClass124_408 = (Class14_Sub8_Sub7.method515(
								new Class124[] { class94.aClass124_1508, Class17.aClass124_398 }, (byte) -117));
				}
			} else {
				if (i_5_ == 32) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(40);
					Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
					Static.aClass14_Sub10_Sub1_891.method792(Canvas_Sub1.anInt53, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method811(Static.anInt3960, (byte) -96);
					Static.aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
					Static.aClass14_Sub10_Sub1_891.method792(i_3_, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method792(Class14_Sub8.anInt2853, (byte) -98);
					Class14_Sub8_Sub3.anInt4124 = 0;
					Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
					Class14_Sub8_Sub13.anInt4314 = i_3_;
				}
				if (i_5_ == 6) {
					boolean bool = (Class14_Sub8_Sub35.method663(
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 0, i_4_));
					if (!bool)
						bool = (Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]),
								1, 0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
								0, i_3_, 2, 1, i_4_));
					Class14_Sub2_Sub17.anInt4017 = 0;
					Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
					Class14_Sub2_Sub11.anInt3881 = 2;
					Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
					Static.aClass14_Sub10_Sub1_891.writeOpcode(81);
					Static.aClass14_Sub10_Sub1_891.method792(Class133_Sub6.anInt3676 + i_3_, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method803(Class14_Sub2_Sub11.anInt3874, i + 66);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 111, Class58.anInt947 + i_4_);
					Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					Static.aClass14_Sub10_Sub1_891.method838(i - 1676904088, Class14_Sub29.anInt3238);
				}
				if (i_5_ == 57) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(203);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -53, i_3_);
					Static.aClass14_Sub10_Sub1_891.method803(i_4_, 120);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 90, i_6_);
					Class14_Sub8_Sub3.anInt4124 = 0;
					Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
					Class14_Sub8_Sub13.anInt4314 = i_3_;
				}
				if (i_5_ == 43) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(136);
					Static.aClass14_Sub10_Sub1_891.method811(i_4_, (byte) -96);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 122, Class14_Sub29.anInt3238);
					Static.aClass14_Sub10_Sub1_891.method801((byte) -55, i_3_);
					Static.aClass14_Sub10_Sub1_891.method808(Class14_Sub2_Sub11.anInt3874, (byte) -103);
				}
				if (i_5_ == 4 && Class125_Sub2.aClass94_3388 == null) {
					Class115.method1591(i_3_, i_4_, i + 0);
					Class125_Sub2.aClass94_3388 = Class14_Sub6.method464(i_3_, i_4_, (byte) -19);
					Class103.method1531(Class125_Sub2.aClass94_3388);
				}
				if (i_5_ == 25) {
					Class14_Sub8_Sub28.method632(26423884);
					Class94 class94 = Static.method1233(i_4_, 21803);
					Class14_Sub8.anInt2853 = i_3_;
					Static.anInt3960 = i_4_;
					Class51.anInt831 = 1;
					Canvas_Sub1.anInt53 = i_6_;
					Class103.method1531(class94);
					Class14_Sub6.aClass124_2809 = (Class14_Sub8_Sub7.method515(
							new Class124[] { Class14_Sub8_Sub1.aClass124_4101,
									(Class14_Sub8_Sub24.method605(111, i_6_).aClass124_2296), Class17.aClass124_398 },
							(byte) -11));
					if (Class14_Sub6.aClass124_2809 == null)
						Class14_Sub6.aClass124_2809 = Class133_Sub3.aClass124_3566;
				} else {
					if (i_5_ == 38) {
						boolean bool = (Class14_Sub8_Sub35.method663(
								(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
								(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 0, i_4_));
						if (!bool)
							bool = (Class14_Sub8_Sub35.method663(
									(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1, 0, 0, (byte) 109,
									(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false, 0, i_3_, 2, 1,
									i_4_));
						Class14_Sub2_Sub17.anInt4017 = 0;
						Class14_Sub2_Sub11.anInt3881 = 2;
						Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
						Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
						Static.aClass14_Sub10_Sub1_891.writeOpcode(33);
						Static.aClass14_Sub10_Sub1_891.method801((byte) -87, i_4_ + Class58.anInt947);
						Static.aClass14_Sub10_Sub1_891.method838(i ^ ~0x63f38697, i_6_);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 89, Class133_Sub6.anInt3676 + i_3_);
					}
					if (i_5_ == 20) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_]);
						if (class133_sub1_sub1 != null) {
							Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub1.anIntArray3476[0], 2, 1,
									class133_sub1_sub1.anIntArray3443[0]);
							Class14_Sub2_Sub17.anInt4017 = 0;
							Class115.anInt1912++;
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
							Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(35);
							Static.aClass14_Sub10_Sub1_891.method801((byte) -118, i_6_);
						}
					}
					if (i_5_ == 21 && Class14_Sub8_Sub22.method596(l, i_3_, i_4_, -83)) {
						Static.aClass14_Sub10_Sub1_891.writeOpcode(224);
						Static.aClass14_Sub10_Sub1_891.method838(-1676904088, Class58.anInt947 + i_4_);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 106, Canvas_Sub1.anInt53);
						Static.aClass14_Sub10_Sub1_891.method811(Static.anInt3960, (byte) -96);
						Static.aClass14_Sub10_Sub1_891.method792(Class14_Sub8.anInt2853, (byte) -98);
						Static.aClass14_Sub10_Sub1_891.method792((int) (l >>> 32) & 0x7fffffff, (byte) -98);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 91, i_3_ + Class133_Sub6.anInt3676);
					}
					if (i_5_ == 1004) {
						Class14_Sub2_Sub17.anInt4017 = 0;
						Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
						Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
						Class14_Sub2_Sub11.anInt3881 = 2;
						Static.aClass14_Sub10_Sub1_891.writeOpcode(84);
						Static.aClass14_Sub10_Sub1_891.method792(i_6_, (byte) -98);
					}
					if (i_5_ == 22) {
						Class94 class94 = Static.method1233(i_4_, 21803);
						boolean bool = true;
						if (class94.anInt1498 > 0)
							bool = Class14_Sub15.method874((byte) -21, class94);
						if (bool) {
							Class14_Sub3.anInt2771++;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(113);
							Static.aClass14_Sub10_Sub1_891.method803(i_4_, 127);
						}
					}
					if (i_5_ == 11) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
						if (class133_sub1_sub2 != null) {
							Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub2.anIntArray3476[0], 2, 1,
									class133_sub1_sub2.anIntArray3443[0]);
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
							Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(123);
							Static.aClass14_Sub10_Sub1_891.method833((byte) 107, i_6_);
						}
					}
					if (i_5_ == 33) {
						Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_6_]);
						if (class133_sub1_sub1 != null) {
							Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub1.anIntArray3476[0], 2, 1,
									class133_sub1_sub1.anIntArray3443[0]);
							Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
							Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(183);
							Static.aClass14_Sub10_Sub1_891.method838(-1676904088, i_6_);
						}
					}
					if (i_5_ == 1001) {
						Class94 class94 = Static.method1233(i_4_, 21803);
						if (class94 != null && class94.anIntArray1542[i_3_] >= 100000)
							Class15.method943((Class14_Sub8_Sub7.method515(
									(new Class124[] { Class83.method1407(26, (class94.anIntArray1542[i_3_])),
											Class14_Sub8_Sub4.aClass124_4149,
											(Class14_Sub8_Sub24.method605(i + 121, i_6_).aClass124_2296) }),
									(byte) -111)), false, Class14_Sub8_Sub9.aClass124_4244, 0);
						else {
							Static.aClass14_Sub10_Sub1_891.writeOpcode(38);
							Class56_Sub1.anInt3322++;
							Static.aClass14_Sub10_Sub1_891.method801((byte) -48, i_6_);
						}
						Class14_Sub8_Sub3.anInt4124 = 0;
						Class94.aClass94_1469 = Static.method1233(i_4_, 21803);
						Class14_Sub8_Sub13.anInt4314 = i_3_;
					}
					if (i_5_ == 31) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_6_];
						if (class133_sub1_sub2 != null) {
							Class14_Sub8_Sub35.method663((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 1,
									0, 0, (byte) 109, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), false,
									0, class133_sub1_sub2.anIntArray3476[0], 2, 1,
									class133_sub1_sub2.anIntArray3443[0]);
							Class14_Sub2_Sub11.anInt3881 = 2;
							Class14_Sub2_Sub17.anInt4017 = 0;
							Class14_Sub8_Sub9.anInt4243 = Class125_Sub1.anInt3367;
							Class14_Sub8_Sub25.anInt4515 = Class139.anInt2230;
							Static.aClass14_Sub10_Sub1_891.writeOpcode(52);
							Static.aClass14_Sub10_Sub1_891.method801((byte) -111, i_6_);
						}
					}
					if (i_5_ == 8)
						Class98.method1496(Class14_Sub2_Sub3.anInt3785, i_3_, i_4_);
					if (Class51.anInt831 != i) {
						Class51.anInt831 = 0;
						Class103.method1531(Static.method1233(Static.anInt3960, 21803));
					}
					if (Class14_Sub4.aBoolean2784)
						Class14_Sub8_Sub28.method632(26423884);
					if (Class94.aClass94_1469 != null && Class14_Sub8_Sub3.anInt4124 == 0)
						Class103.method1531(Class94.aClass94_1469);
				}
			}
		}
	}

	public static void method553(int i) {
		aClass124_4325 = null;
		if (i != 0)
			method550(null, (byte) -71);
		aClass124_4326 = null;
		aClass9_Sub1_4323 = null;
		aClass124_4322 = null;
		aClass124_4330 = null;
	}

	public static RuntimeException_Sub1 method554(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (!(throwable instanceof RuntimeException_Sub1))
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		else {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuffer stringbuffer = new StringBuffer();
			RuntimeException_Sub1 runtimeexception_sub1_9_ = runtimeexception_sub1;
			runtimeexception_sub1_9_.aString2457 = stringbuffer.append(runtimeexception_sub1_9_.aString2457).append(' ')
					.append(string).toString();
		}
		RuntimeException_Sub1 runtimeexception_sub1_10_ = runtimeexception_sub1;
		return runtimeexception_sub1_10_;
	}

	public static void method555(int i, Class43 class43, Object object) {
		if (class43.anEventQueue713 != null) {
			int i_11_ = 0;
			if (i > 37) {
				for (/**/; i_11_ < 50 && class43.anEventQueue713.peekEvent() != null; i_11_++)
					Util.sleep(1L);
				if (object != null)
					class43.anEventQueue713.postEvent(new ActionEvent(object, 1001, "dummy"));
			}
		}
	}

	public Class14_Sub8_Sub14() {
		super(0, true);
	}

	public int[] method484(int i, byte i_12_) {
		int[] is = aClass149_2851.method2014(i, (byte) 127);
		if (i_12_ >= -58) {
			int[] is_13_ = null;
			return is_13_;
		}
		if (aClass149_2851.aBoolean2402)
			Class72.method1324(is, 0, Class112.anInt1876, Class133_Sub5.anIntArray3623[i]);
		int[] is_14_ = is;
		return is_14_;
	}
}
