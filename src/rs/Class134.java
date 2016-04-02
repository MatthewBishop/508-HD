/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cache;
import com.jagex.rt4.Class14_Sub2_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub14;
import com.jagex.rt4.RT4;

public class Class134 implements Interface3 {
	public static Class124 aClass124_2570;
	public byte[] aByteArray2571;
	public static int anInt2572;
	public static int anInt2573;
	public static Class124 aClass124_2575 = Class14_Sub2_Sub2.method263(1178, "::cardmem");
	public byte[] aByteArray2576;
	public Class9 aClass9_2580;
	public boolean aBoolean2581 = false;
	public int anInt2582 = 50;
	public boolean[] aBooleanArray2583;
	public Cache aClass20_2585;
	public Class9 aClass9_2587;
	public static Class75 aClass75_2588;
	public static int[] anIntArray2590;
	public boolean[] aBooleanArray2594;
	public Cache aClass20_2595;
	public static Class9 aClass9_2598;
	public static Class124 aClass124_2599;
	public boolean[] aBooleanArray2600;
	public byte[] aByteArray2602;
	public short[] aShortArray2603;
	public boolean[] aBooleanArray2604;
	public byte[] aByteArray2608;
	public boolean[] aBooleanArray2609;
	public static int anInt2612;

	static {
		aClass124_2570 = Class14_Sub2_Sub2.method263(1178, " ");
		aClass124_2599 = Class14_Sub2_Sub2.method263(1178, "(U5");
		anInt2612 = 7759444;
	}

	public boolean method15(int i, int i_0_) {
		if (aBoolean2581 || aBooleanArray2604[i_0_]) {
			boolean bool = true;
			return bool;
		}
		if (i != 1) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public void method16(int i, byte i_1_) {
		boolean bool = false;
		RT4.method1778(aByteArray2608[i] & 0xff, aByteArray2602[i] & 0xff);
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i, false);
		if (class14_sub2_sub1 != null)
			bool = class14_sub2_sub1.method252(this, (aBoolean2581 || aBooleanArray2604[i]), 110, aClass9_2587);
		if (!bool) {
			Class14_Sub2_Sub14 class14_sub2_sub14 = method1923(false, i);
			class14_sub2_sub14.method337(true);
		}
		if (i_1_ != 97)
			method6(114, 26);
	}

	public int method14(int i, int i_2_) {
		if (i_2_ < 2)
			method13(17, 68);
		int i_3_ = aByteArray2576[i] & 0xff;
		return i_3_;
	}

	public boolean method6(int i, int i_4_) {
		if (i_4_ > -90) {
			boolean bool = true;
			return bool;
		}
		boolean bool = aBooleanArray2600[i];
		return bool;
	}

	public int method5(int i, byte i_5_) {
		if (i_5_ > -94)
			method10((byte) -53, 13);
		int i_6_ = aShortArray2603[i] & 0xffff;
		return i_6_;
	}

	public void method1922(int i, byte i_7_) {
		for (Class14_Sub2_Sub1 class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595
				.getFirst(); class14_sub2_sub1 != null; class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595
						.getNext()) {
			if (class14_sub2_sub1.aBoolean3746) {
				class14_sub2_sub1.method253(i, false);
				class14_sub2_sub1.aBoolean3746 = false;
			}
		}
		if (i_7_ >= -81)
			method10((byte) -68, -111);
	}

	public boolean method7(int i, boolean bool) {
		if (bool)
			method16(-97, (byte) 58);
		boolean bool_8_ = aBooleanArray2609[i];
		return bool_8_;
	}

	public Class14_Sub2_Sub14 method1923(boolean bool, int i) {
		Class14_Sub2_Sub14 class14_sub2_sub14 = (Class14_Sub2_Sub14) aClass20_2585.get((long) i);
		if (class14_sub2_sub14 != null) {
			Class14_Sub2_Sub14 class14_sub2_sub14_9_ = class14_sub2_sub14;
			return class14_sub2_sub14_9_;
		}
		if (bool)
			anInt2612 = -54;
		class14_sub2_sub14 = new Class14_Sub2_Sub14(aShortArray2603[i] & 0xffff);
		aClass20_2585.put(class14_sub2_sub14, (long) i);
		Class14_Sub2_Sub14 class14_sub2_sub14_10_ = class14_sub2_sub14;
		return class14_sub2_sub14_10_;
	}

	public void method1924(boolean bool, int i) {
		if (i > -8)
			method5(-90, (byte) -62);
		aBoolean2581 = bool;
		method1927(0);
	}

	public int method8(byte i, int i_11_) {
		int i_12_ = 74 / ((-41 - i) / 58);
		int i_13_ = aByteArray2602[i_11_] & 0xff;
		return i_13_;
	}

	public boolean method13(int i, int i_14_) {
		if (i != 0)
			aClass20_2585 = null;
		boolean bool = aBooleanArray2594[i_14_];
		return bool;
	}

	public int[] method17(int i, int i_15_) {
		if (i != -16210) {
			int[] is = null;
			return is;
		}
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i_15_, false);
		if (class14_sub2_sub1 == null) {
			int[] is = null;
			return is;
		}
		int[] is = class14_sub2_sub1.method257(false, aClass9_2587, (aBoolean2581 || aBooleanArray2604[i_15_]), this);
		return is;
	}

	public static void method1925(byte i) {
		aClass124_2570 = null;
		aClass124_2599 = null;
		aClass75_2588 = null;
		anIntArray2590 = null;
		aClass124_2575 = null;
		aClass9_2598 = null;
		if (i <= 0)
			aClass124_2599 = null;
	}

	public Class14_Sub2_Sub1 method1926(int i, boolean bool) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595.get((long) i);
		if (class14_sub2_sub1 != null) {
			Class14_Sub2_Sub1 class14_sub2_sub1_16_ = class14_sub2_sub1;
			return class14_sub2_sub1_16_;
		}
		byte[] is = aClass9_2580.method163(0, i, 0);
		if (is == null) {
			class14_sub2_sub1 = null;
			return class14_sub2_sub1;
		}
		if (bool)
			method1922(-51, (byte) -71);
		Buffer class14_sub10 = new Buffer(is);
		Class14_Sub2_Sub1 class14_sub2_sub1_17_ = new Class14_Sub2_Sub1(class14_sub10);
		aClass20_2595.put(class14_sub2_sub1_17_, (long) i);
		class14_sub2_sub1 = class14_sub2_sub1_17_;
		return class14_sub2_sub1;
	}

	public int method12(boolean bool, int i) {
		if (!bool)
			method5(6, (byte) -53);
		int i_18_ = aByteArray2608[i] & 0xff;
		return i_18_;
	}

	public void method1927(int i) {
		aClass20_2595.clear();
		if (i == 0)
			aClass20_2585.clear();
	}

	public boolean method10(byte i, int i_19_) {
		if (i > -79)
			method17(24, -98);
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i_19_, false);
		if (class14_sub2_sub1 == null) {
			boolean bool = false;
			return bool;
		}
		boolean bool = class14_sub2_sub1.method254(aClass9_2587, 255, this);
		return bool;
	}

	public int[] method11(float f, int i, int i_20_) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i, false);
		if (class14_sub2_sub1 == null) {
			int[] is = null;
			return is;
		}
		class14_sub2_sub1.aBoolean3746 = true;
		if (i_20_ < 16) {
			int[] is = null;
			return is;
		}
		int[] is = class14_sub2_sub1.method255(this, f, -1, aClass9_2587, (aBoolean2581 || aBooleanArray2604[i]));
		return is;
	}

	public int method9(int i, int i_21_) {
		if (i_21_ >= -2) {
			int i_22_ = 49;
			return i_22_;
		}
		int i_23_ = aByteArray2571[i] & 0xff;
		return i_23_;
	}

	public Class134(Class9 class9, Class9 class9_24_, Class9 class9_25_, int i, boolean bool) {
		aClass9_2580 = class9;
		aClass9_2587 = class9_25_;
		aBoolean2581 = bool;
		anInt2582 = i;
		aClass20_2595 = new Cache(anInt2582);
		aClass20_2585 = new Cache(anInt2582);
		Buffer class14_sub10 = new Buffer(class9_24_.method163(0, 0, 0));
		int i_26_ = class14_sub10.method784((byte) 126);
		aByteArray2602 = new byte[i_26_];
		aBooleanArray2600 = new boolean[i_26_];
		aShortArray2603 = new short[i_26_];
		aByteArray2576 = new byte[i_26_];
		aBooleanArray2604 = new boolean[i_26_];
		aByteArray2571 = new byte[i_26_];
		aBooleanArray2594 = new boolean[i_26_];
		aBooleanArray2609 = new boolean[i_26_];
		aBooleanArray2583 = new boolean[i_26_];
		aByteArray2608 = new byte[i_26_];
		for (int i_27_ = 0; i_27_ < i_26_; i_27_++)
			aBooleanArray2583[i_27_] = class14_sub10.method798() == 1;
		for (int i_28_ = 0; i_26_ > i_28_; i_28_++) {
			if (aBooleanArray2583[i_28_])
				aBooleanArray2594[i_28_] = class14_sub10.method798() == 1;
		}
		for (int i_29_ = 0; i_26_ > i_29_; i_29_++) {
			if (aBooleanArray2583[i_29_])
				aBooleanArray2600[i_29_] = class14_sub10.method798() == 1;
		}
		for (int i_30_ = 0; i_26_ > i_30_; i_30_++) {
			if (aBooleanArray2583[i_30_])
				aBooleanArray2604[i_30_] = class14_sub10.method798() == 1;
		}
		for (int i_31_ = 0; i_31_ < i_26_; i_31_++) {
			if (aBooleanArray2583[i_31_])
				aBooleanArray2609[i_31_] = class14_sub10.method798() == 1;
		}
		for (int i_32_ = 0; i_26_ > i_32_; i_32_++) {
			if (aBooleanArray2583[i_32_])
				aByteArray2571[i_32_] = class14_sub10.method780((byte) -77);
		}
		for (int i_33_ = 0; i_33_ < i_26_; i_33_++) {
			if (aBooleanArray2583[i_33_])
				aByteArray2576[i_33_] = class14_sub10.method780((byte) -77);
		}
		for (int i_34_ = 0; i_26_ > i_34_; i_34_++) {
			if (aBooleanArray2583[i_34_])
				aByteArray2608[i_34_] = class14_sub10.method780((byte) -77);
		}
		for (int i_35_ = 0; i_35_ < i_26_; i_35_++) {
			if (aBooleanArray2583[i_35_])
				aByteArray2602[i_35_] = class14_sub10.method780((byte) -77);
		}
		for (int i_36_ = 0; i_36_ < i_26_; i_36_++) {
			if (aBooleanArray2583[i_36_])
				aShortArray2603[i_36_] = (short) class14_sub10.method784((byte) 115);
		}
	}
}
