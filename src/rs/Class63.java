/* Class63 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;

import com.jagex.link.Class2;
import com.jagex.rt4.Class11;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.Class10;
import com.jagex.rt4.lights.Light;

import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Class63 {
	public static int anInt998;
	public static Class148_Sub1 aClass148_Sub1_999 = null;
	public static short[][] aShortArrayArray1001 = {
			{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322,
					-21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
			{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239,
					8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
			{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533,
					8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
			{ 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	public int[] anIntArray1006;
	public static float aFloat1007;

	static {
		anInt998 = 0;
	}

	public static void method1276(int i) {
		Class14_Sub8_Sub28.method627(false);
		Class56.method1240();
		Class47.method1184();
		RuntimeException_Sub1.aClass14_Sub27ArrayArray2464 = Class14_Sub30.aClass14_Sub27ArrayArray3273 = new Class14_Sub27[4][];
		Class133_Sub6.aClass14_Sub2_Sub19_3640 = null;
		Class14_Sub8_Sub7.anInt4207 = -1;
		Class14_Sub3.method451(0);
		Class14_Sub2_Sub6.aClass20_3819.clear();
		Class14_Sub8_Sub16.aClass86_4351 = new Class86();
		((Class134) Class3.anInterface3_117).method1927(0);
		Class10.lights = new Light[255];
		Class10.lightCount = 0;
		ModelHD.method1908();
		Class151.aClass13ArrayArray2427 = null;
		if (i > -85)
			anInt998 = -5;
		Class133_Sub4.method1840((byte) 85);
		Class37.method1108((byte) 103);
		Class69.method1311((byte) 120);
		for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
			Class133_Sub1_Sub1 class133_sub1_sub1 = Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_0_];
			if (class133_sub1_sub1 != null)
				class133_sub1_sub1.aClass133_Sub7_4933 = null;
		}
		RT4.method1938();
		Class11.method203();
	}

	public static void method1277(int i, Class9_Sub1 class9_sub1, int i_1_, Class114 class114) {
		byte[] is = null;
		Class2 class2 = Class14_Sub8_Sub19.aClass2_4404;
		synchronized (class2) {
			if (i != -5761)
				method1284((byte) -35, 50, -93);
			Class14_Sub19 class14_sub19 = (Class14_Sub19) Class14_Sub8_Sub19.aClass2_4404.method77();
			while (class14_sub19 != null) {
				if ((long) i_1_ != class14_sub19.key || class14_sub19.aClass114_3077 != class114
						|| class14_sub19.anInt3067 != 0)
					class14_sub19 = ((Class14_Sub19) Class14_Sub8_Sub19.aClass2_4404.method84());
				else {
					is = class14_sub19.aByteArray3069;
					break;
				}
			}
		}
		if (is != null)
			class9_sub1.method182(class114, i_1_, is, true, (byte) 55);
		else {
			is = class114.method1582(124, i_1_);
			class9_sub1.method182(class114, i_1_, is, true, (byte) 55);
		}
	}

	public static void method1278(int i) {
		Static.overlayTypes = null;
		Class115.anIntArray1917 = null;
		Class66.anIntArrayArrayArray135 = null;
		if (i <= -45) {
			Class15.overlayOrientations = null;
			Class99_Sub2.aByteArrayArrayArray3354 = null;
			Class14_Sub8_Sub6.overlays = null;
			Class97.underlays = null;
			Class21.anIntArray442 = null;
			Class14_Sub2_Sub18.anIntArray4023 = null;
			Class14_Sub2_Sub3.anIntArray3773 = null;
			Class14_Sub2_Sub17.anIntArray4020 = null;
		}
	}

	public static void method1279(Class40 class40) {
		for (int i = class40.anInt668; i <= class40.anInt670; i++) {
			for (int i_2_ = class40.anInt678; i_2_ <= class40.anInt669; i_2_++) {
				Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[class40.anInt672][i][i_2_]);
				if (class14_sub29 != null) {
					for (int i_3_ = 0; i_3_ < class14_sub29.anInt3242; i_3_++) {
						if (class14_sub29.aClass40Array3257[i_3_] == class40) {
							class14_sub29.anInt3242--;
							for (int i_4_ = i_3_; i_4_ < class14_sub29.anInt3242; i_4_++) {
								class14_sub29.aClass40Array3257[i_4_] = (class14_sub29.aClass40Array3257[i_4_ + 1]);
								class14_sub29.anIntArray3247[i_4_] = class14_sub29.anIntArray3247[i_4_ + 1];
							}
							class14_sub29.aClass40Array3257[(class14_sub29.anInt3242)] = null;
							break;
						}
					}
					class14_sub29.anInt3249 = 0;
					for (int i_5_ = 0; i_5_ < class14_sub29.anInt3242; i_5_++)
						class14_sub29.anInt3249 |= class14_sub29.anIntArray3247[i_5_];
				}
			}
		}
	}

	public static void method1280(Component component, byte i) {
		component.removeKeyListener(Class14_Sub8_Sub9.aClass141_4239);
		int i_6_ = -25 / ((60 - i) / 62);
		component.removeFocusListener(Class14_Sub8_Sub9.aClass141_4239);
		Class120.anInt2014 = -1;
	}

	public static void method1281(byte i) {
		aShortArrayArray1001 = null;
		if (i > -32)
			anInt998 = 90;
		aClass148_Sub1_999 = null;
	}

	public static byte[] method1282(Object object, byte i, boolean bool) {
		if (object == null) {
			byte[] is = null;
			return is;
		}
		if (i < 10) {
			byte[] is = null;
			return is;
		}
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (!bool) {
				byte[] is_7_ = is;
				return is_7_;
			}
			byte[] is_8_ = Class14_Sub8_Sub26.method616(is, 84);
			return is_8_;
		}
		if (object instanceof Class126) {
			Class126 class126 = (Class126) object;
			byte[] is = class126.method1745((byte) -45);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public int method1283(int i, int i_9_) {
		int i_10_ = (anIntArray1006.length >> 1) - 1;
		int i_11_ = i_10_ & i_9_;
		if (i != -9)
			anIntArray1006 = null;
		for (;;) {
			int i_12_ = anIntArray1006[i_11_ + i_11_ + 1];
			if (i_12_ == -1)
				return -1;
			if (i_9_ == anIntArray1006[i_11_ + i_11_]) {
				int i_13_ = i_12_;
				return i_13_;
			}
			i_11_ = i_11_ + 1 & i_10_;
		}
	}

	public Class63(int[] is) {
		int i;
		for (i = 1; i <= is.length + (is.length >> 33); i <<= 1) {
			/* empty */
		}
		anIntArray1006 = new int[i + i];
		for (int i_14_ = 0; i + i > i_14_; i_14_++)
			anIntArray1006[i_14_] = -1;
		for (int i_15_ = 0; is.length > i_15_; i_15_++) {
			int i_16_;
			for (i_16_ = is[i_15_] & i - 1; anIntArray1006[i_16_ + 1 + i_16_] != -1; i_16_ = i_16_ + 1 & i - 1) {
				/* empty */
			}
			anIntArray1006[i_16_ + i_16_] = is[i_15_];
			anIntArray1006[i_16_ + 1 + i_16_] = i_15_;
		}
	}

	public static boolean method1284(byte i, int i_17_, int i_18_) {
		if (i_17_ == 11)
			i_17_ = 10;
		Class79 class79 = Class79.method1377((byte) -106, i_18_);
		if (i_17_ >= 5 && i_17_ <= 8)
			i_17_ = 4;
		if (i != -116)
			method1279(null);
		boolean bool = class79.method1381((byte) -35, i_17_);
		return bool;
	}
}
