/* Class14_Sub2_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;

public class Class14_Sub2_Sub21 extends Cacheable {
	public static Class124 aClass124_4070;
	public int[] anIntArray4073;
	public int[][] anIntArrayArray4075;
	public static int[] anIntArray4077;
	public static int[] anIntArray4078;
	public Class124[] aClass124Array4080;
	public static int anInt4081 = 0;
	public int[] anIntArray4082;
	public static Class124 aClass124_4083;
	public static int anInt4084;
	public static int anInt4086;
	public static int anInt4088;

	static {
		anIntArray4077 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };
		anIntArray4078 = new int[4096];
		aClass124_4070 = Class14_Sub2_Sub2.method263(1178, "skill)2");
		aClass124_4083 = aClass124_4070;
	}

	public int method433(int i, int i_0_) {
		if (i > -49)
			anIntArray4073 = null;
		if (anIntArray4073 == null || i_0_ < 0 || anIntArray4073.length < i_0_) {
			int i_1_ = -1;
			return i_1_;
		}
		int i_2_ = anIntArray4073[i_0_];
		return i_2_;
	}

	public static void method434(int i, int i_3_, Class79 class79, int i_4_, int i_5_) {
		Class14_Sub3 class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getFront();
		if (i_4_ != 128)
			anIntArray4077 = null;
		for (/**/; class14_sub3 != null; class14_sub3 = ((Class14_Sub3) Class152.aClass2_2438.getNext())) {
			if (class14_sub3.anInt2763 == i_3_ && i * 128 == class14_sub3.anInt2774
					&& i_5_ * 128 == class14_sub3.anInt2767
					&& class14_sub3.aClass79_2747.anInt1257 == class79.anInt1257) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
					class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				}
				class14_sub3.unlink();
				break;
			}
		}
	}

	public int method435(int i, int i_6_, byte i_7_) {
		int i_8_ = -76 / ((i_7_ + 7) / 52);
		if (anIntArray4073 == null || i < 0 || i > anIntArray4073.length) {
			int i_9_ = -1;
			return i_9_;
		}
		if (anIntArrayArray4075[i] == null || i_6_ < 0 || anIntArrayArray4075[i].length < i_6_) {
			int i_10_ = -1;
			return i_10_;
		}
		int i_11_ = anIntArrayArray4075[i][i_6_];
		return i_11_;
	}

	public static void method436(int i) {
		aClass124_4070 = null;
		aClass124_4083 = null;
		anIntArray4078 = null;
		if (i >= -100)
			anInt4081 = -54;
		anIntArray4077 = null;
	}

	public void method437(Buffer class14_sub10, int i) {
		if (i <= 87)
			aClass124_4083 = null;
		for (;;) {
			int i_12_ = class14_sub10.readUByte();
			if (i_12_ == 0)
				break;
			method447(0, class14_sub10, i_12_);
		}
	}

	public Class124 method438(int i) {
		if (i < 116) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = Class7_Sub1.method121(80, 112);
		if (aClass124Array4080 == null) {
			Class124 class124_13_ = Class7_Sub1.aClass124_2656;
			return class124_13_;
		}
		class124.method1675((byte) -128, aClass124Array4080[0]);
		for (int i_14_ = 1; aClass124Array4080.length > i_14_; i_14_++) {
			class124.method1675((byte) -127, Class109.aClass124_1836);
			class124.method1675((byte) -128, aClass124Array4080[i_14_]);
		}
		Class124 class124_15_ = class124.method1683(115);
		return class124_15_;
	}

	public void method439(int i) {
		if (anIntArray4082 != null) {
			for (int i_16_ = 0; i_16_ < anIntArray4082.length; i_16_++)
				anIntArray4082[i_16_] = Class66.method1294(anIntArray4082[i_16_], 32768);
		}
		if (i != 19712)
			method439(19);
	}

	public static void method440(byte i) {
		Class97 class97 = Class67.aClass97_1055;
		synchronized (class97) {
			JunkTex.anInt4602++;
			JunkTex.anInt4599 = Class14_Sub4.anInt2790;
			JunkTex.anInt4640 = JunkTex.anInt4724;
			Class107.anInt1804 = Class14_Sub9_Sub3.anInt4848;
			Class7_Sub3_Sub1.anInt3714 = Class127.anInt2105;
			JunkTex.anInt3367 = Class111.anInt1860;
			Class139.anInt2230 = Class118.anInt1976;
			int i_17_ = -59 / ((-55 - i) / 58);
			JunkTex.aLong2800 = Applet_Sub1.aLong6;
			Class127.anInt2105 = 0;
		}
	}

	public static int method441(int i, int i_18_, int i_19_) {
		if (i_19_ == -1) {
			int i_20_ = 12345678;
			return i_20_;
		}
		i = (i_18_ & i_19_) * i >> 7;
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		int i_21_ = (i_19_ & 0xff80) + i;
		return i_21_;
	}

	public Class124 method442(int i, Buffer class14_sub10) {
		Class124 class124 = Class7_Sub1.method121(80, -122);
		int i_22_ = -22 / ((i + 45) / 42);
		if (anIntArray4073 != null) {
			for (int i_23_ = 0; i_23_ < anIntArray4073.length; i_23_++) {
				class124.method1675((byte) -127, aClass124Array4080[i_23_]);
				class124.method1675((byte) -128,
						(Class129.method1766(anIntArrayArray4075[i_23_], anIntArray4073[i_23_], (byte) 124,
								class14_sub10.method837((Class153.anIntArray2453[(anIntArray4073[i_23_])]), -115))));
			}
		}
		class124.method1675((byte) -128, aClass124Array4080[aClass124Array4080.length - 1]);
		Class124 class124_24_ = class124.method1683(115);
		return class124_24_;
	}

	public void method443(Buffer class14_sub10, byte i, int[] is) {
		if (anIntArray4073 != null) {
			if (i >= -27)
				method444(-65, null);
			for (int i_25_ = 0; i_25_ < anIntArray4073.length && is.length > i_25_; i_25_++) {
				int i_26_ = Class14_Sub2_Sub4.anIntArray3791[method433(-94, i_25_)];
				if (i_26_ > 0)
					class14_sub10.method827((long) is[i_25_], i_26_, (byte) 118);
			}
		}
	}

	public static void method444(int i, Class9 class9) {
		JunkTex.anInt4509 = class9.method146(JunkTex.aClass124_1105, i + 30451);
		if (i != -30451)
			method444(69, null);
		JunkTex.anInt4594 = class9.method146(JunkTex.aClass124_422, 0);
	}

	public static void method445(Class94 class94, int i, boolean bool) {
		int i_27_ = class94.anInt1544 == 0 ? class94.anInt1518 : class94.anInt1544;
		int i_28_ = class94.anInt1605 != 0 ? class94.anInt1605 : class94.anInt1545;
		if (i != 18559)
			anInt4086 = -91;
		JunkTex.method340((Class1.aClass94ArrayArray75[class94.anInt1548 >> 16]), bool, class94.anInt1548,
				i_27_, (byte) -73, i_28_);
		if (class94.aClass94Array1486 != null)
			JunkTex.method340(class94.aClass94Array1486, bool, class94.anInt1548, i_27_, (byte) -56, i_28_);
		Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) class94.anInt1548));
		if (class14_sub15 != null)
			JunkTex.method566(i_27_, class14_sub15.anInt2999, -1, i_28_, bool);
	}

	public int method446(byte i) {
		int i_29_ = 126 / ((-72 - i) / 50);
		if (anIntArray4073 == null) {
			int i_30_ = 0;
			return i_30_;
		}
		int i_31_ = anIntArray4073.length;
		return i_31_;
	}

	public void method447(int i, Buffer class14_sub10, int i_32_) {
		if (i != 0)
			anInt4088 = -124;
		if (i_32_ != 1) {
			if (i_32_ == 2) {
				int i_33_ = class14_sub10.readUByte();
				anIntArray4082 = new int[i_33_];
				for (int i_34_ = 0; i_33_ > i_34_; i_34_++)
					anIntArray4082[i_34_] = class14_sub10.readUShort((byte) 123);
			} else if (i_32_ == 3) {
				int i_35_ = class14_sub10.readUByte();
				anIntArrayArray4075 = new int[i_35_][];
				anIntArray4073 = new int[i_35_];
				for (int i_36_ = 0; i_35_ > i_36_; i_36_++) {
					int i_37_ = class14_sub10.readUShort((byte) 123);
					anIntArray4073[i_36_] = i_37_;
					anIntArrayArray4075[i_36_] = new int[Class14_Sub9_Sub1.anIntArray4804[i_37_]];
					for (int i_38_ = 0; Class14_Sub9_Sub1.anIntArray4804[i_37_] > i_38_; i_38_++)
						anIntArrayArray4075[i_36_][i_38_] = class14_sub10.readUShort((byte) 121);
				}
			}
		} else
			aClass124Array4080 = class14_sub10.method797(i ^ 0x24fb).method1719(60, 123);
	}
}
