/* Class126 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Class2;
import com.jagex.rt4.Class121;
import com.jagex.rt4.Class148;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public abstract class Class126 {
	public static int anInt2089 = 0;
	public static Class2 aClass2_2093 = new Class2();
	public static int[] anIntArray2094 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
			22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
			49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92,
			93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125,
			133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174,
			175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97,
			199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219,
			220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240,
			241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87,
			77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125,
			135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170,
			170, 178, 255, 178 };
	public static long[] aLongArray2095 = new long[100];

	public abstract void method1740(byte[] is, int i);

	public static boolean method1741(byte i, int i_0_) {
		if (Class108.aBooleanArray1819[i_0_]) {
			boolean bool = true;
			return bool;
		}
		if (!Class83.aClass9_1335.method161((byte) 116, i_0_)) {
			boolean bool = false;
			return bool;
		}
		int i_1_ = Class83.aClass9_1335.method177(i_0_, 13537);
		if (i_1_ == 0) {
			Class108.aBooleanArray1819[i_0_] = true;
			boolean bool = true;
			return bool;
		}
		int i_2_ = 76 % ((-51 - i) / 50);
		if (Class1.aClass94ArrayArray75[i_0_] == null)
			Class1.aClass94ArrayArray75[i_0_] = new Class94[i_1_];
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
			if (Class1.aClass94ArrayArray75[i_0_][i_3_] == null) {
				byte[] is = Class83.aClass9_1335.method163(i_3_, i_0_, 0);
				if (is != null) {
					Class1.aClass94ArrayArray75[i_0_][i_3_] = new Class94();
					Class1.aClass94ArrayArray75[i_0_][i_3_].anInt1548 = i_3_ + (i_0_ << 16);
					if (is[0] == -1)
						Class1.aClass94ArrayArray75[i_0_][i_3_].method1469(new Buffer(is), -121);
					else
						Class1.aClass94ArrayArray75[i_0_][i_3_].method1474((byte) -117, new Buffer(is));
				}
			}
		}
		Class108.aBooleanArray1819[i_0_] = true;
		boolean bool = true;
		return bool;
	}

	public static void method1742(byte i, long l) {
		try {
			Thread.sleep(l);
			if (i >= -59)
				aClass2_2093 = null;
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static void method1743(int i, int i_4_) {
		if (Class14_Sub8_Sub16.anInt4356 != i_4_) {
			if (Class14_Sub8_Sub16.anInt4356 == 0)
				Class14_Sub8_Sub30.method639(-1);
			if (i_4_ == 40)
				Class14_Sub2_Sub18.method380(Class75.anInt1163, Class14_Sub8_Sub9.aClass124_4242,
						Class14_Sub8_Sub9.aClass124_4241, true);
			if (i_4_ != 40 && Class21.aClass36_441 != null) {
				Class21.aClass36_441.method1101((byte) -10);
				Class21.aClass36_441 = null;
			}
			if (i_4_ == 25 || i_4_ == 28) {
				Class14_Sub18.anInt3064 = 0;
				Class14_Sub8_Sub28.anInt4560 = 1;
				Static2.anInt3732 = 1;
				Class149.anInt2383 = 0;
				client.anInt2648 = 0;
				Class69.method1311((byte) 118);
			}
			if (i_4_ == 5)
				Class14_Sub2_Sub18_Sub2.method385((byte) 67, Class14_Sub3.aClass9_Sub1_2750);
			else
				Static.method86(-123);
			boolean bool = i_4_ == 5 || i_4_ == 10 || i_4_ == 28;
			if (i != 27252)
				method1746(58);
			boolean bool_5_ = (Class14_Sub8_Sub16.anInt4356 == 5 || Class14_Sub8_Sub16.anInt4356 == 10
					|| Class14_Sub8_Sub16.anInt4356 == 28);
			if (!bool_5_ == bool) {
				if (!bool) {
					Class69.method1308(2, (byte) -114);
					Class14_Sub3.method449(true, 4);
				} else {
					Class14_Sub8.anInt2856 = Static.anInt97;
					if (Class14_Sub23.anInt3135 != 0)
						Class14_Sub8_Sub29.method636(Static.anInt97, 2, i - 1746, 255, false,
								(Class125_Sub2.aClass9_Sub1_3374), 0);
					else
						Class69.method1308(2, (byte) -115);
					Class14_Sub3.method449(false, i ^ 0x6a70);
				}
			}
			if (i_4_ == 25 || i_4_ == 28 || i_4_ == 40)
				Class121.method1627();
			Class14_Sub8_Sub16.anInt4356 = i_4_;
		}
	}

	public static Class12 method1744(int i, int i_6_) {
		Class12 class12 = ((Class12) Class14_Sub14.aClass52_2982.method1210((byte) 68, (long) i));
		if (class12 != null) {
			Class12 class12_7_ = class12;
			return class12_7_;
		}
		if (i_6_ != 170)
			anIntArray2094 = null;
		byte[] is = (Class108.aClass9_1817.method163(Static.method1229(i, 122),
				Class153.method2045(i, i_6_ ^ ~0x63e7ad2), 0));
		Class12 class12_8_ = new Class12();
		class12_8_.anInt337 = i;
		if (is != null)
			class12_8_.method220(new Buffer(is), true);
		class12_8_.method223((byte) 126);
		Class14_Sub14.aClass52_2982.method1205(class12_8_, (long) i);
		Class12 class12_9_ = class12_8_;
		return class12_9_;
	}

	public abstract byte[] method1745(byte i);

	public static void method1746(int i) {
		aLongArray2095 = null;
		if (i == 255) {
			aClass2_2093 = null;
			anIntArray2094 = null;
		}
	}

	public static Class148[] method1747(int i, int i_10_, int i_11_, Class9 class9) {
		if (i_11_ != 229)
			anIntArray2094 = null;
		if (!Class109.method1564(-2, i, i_10_, class9)) {
			Class148[] class148s = null;
			return class148s;
		}
		Class148[] class148s = Static2.method392(120);
		return class148s;
	}
}
