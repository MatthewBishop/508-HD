/* Class14_Sub8_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Deque;

import rs.Class112;
import rs.Class114;
import rs.Class118;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class133;
import rs.Class14_Sub13;
import rs.Class14_Sub20;
import rs.Class14_Sub21;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub8;
import rs.Class150;
import rs.Class17;
import rs.Class21;
import rs.Class38;
import rs.Class40;
import rs.Class83;
import rs.Class9;
import rs.Class94;
import rs.Class99_Sub2;
import rs.Static2;

public class Class14_Sub8_Sub19 extends Class14_Sub8 {
	public static Class124 aClass124_4409;
	public static Class124 aClass124_4412 = Class14_Sub2_Sub2.method263(1178, "Zugewiesener Speicher)3");
	public static Deque aClass2_4404;
	public static int anInt4408 = 0;

	static {
		aClass124_4409 = Class14_Sub2_Sub2.method263(1178, ")2");
		aClass2_4404 = new Deque();
	}

	public static long method578(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null || class14_sub29.aClass4_3237 == null)
			return 0L;
		return class14_sub29.aClass4_3237.aLong132;
	}

	public static void method579(byte i) {
		aClass124_4412 = null;
		aClass2_4404 = null;
		aClass124_4409 = null;
	}

	public static boolean method580(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			Class133 class133, int i_10_, boolean bool, long l) {
		boolean bool_11_ = Class114.tileHeights == Class150.anIntArrayArrayArray2419;
		int i_12_ = 0;
		for (int i_13_ = i_3_; i_13_ < i_3_ + i_5_; i_13_++) {
			for (int i_14_ = i_4_; i_14_ < i_4_ + i_6_; i_14_++) {
				if (i_13_ < 0 || i_14_ < 0 || i_13_ >= Class99_Sub2.anInt3338 || i_14_ >= Class14_Sub8_Sub15.anInt4337)
					return false;
				Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_13_][i_14_]);
				if (class14_sub29 != null && class14_sub29.anInt3242 >= 5)
					return false;
			}
		}
		Class40 class40 = new Class40();
		class40.aLong677 = l;
		class40.anInt672 = i;
		class40.anInt667 = i_7_;
		class40.anInt666 = i_8_;
		class40.anInt671 = i_9_;
		class40.aClass133_679 = class133;
		class40.anInt663 = i_10_;
		class40.anInt668 = i_3_;
		class40.anInt678 = i_4_;
		class40.anInt670 = i_3_ + i_5_ - 1;
		class40.anInt669 = i_4_ + i_6_ - 1;
		for (int i_15_ = i_3_; i_15_ < i_3_ + i_5_; i_15_++) {
			for (int i_16_ = i_4_; i_16_ < i_4_ + i_6_; i_16_++) {
				int i_17_ = 0;
				if (i_15_ > i_3_)
					i_17_++;
				if (i_15_ < i_3_ + i_5_ - 1)
					i_17_ += 4;
				if (i_16_ > i_4_)
					i_17_ += 8;
				if (i_16_ < i_4_ + i_6_ - 1)
					i_17_ += 2;
				for (int i_18_ = i; i_18_ >= 0; i_18_--) {
					if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_18_][i_15_][i_16_]) == null)
						Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_18_][i_15_][i_16_] = new Class14_Sub29(i_18_,
								i_15_, i_16_);
				}
				Class14_Sub29 class14_sub29 = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_15_][i_16_]);
				class14_sub29.aClass40Array3257[class14_sub29.anInt3242] = class40;
				class14_sub29.anIntArray3247[class14_sub29.anInt3242] = i_17_;
				class14_sub29.anInt3249 |= i_17_;
				class14_sub29.anInt3242++;
				if (bool_11_ && Static.anIntArrayArray2799[i_15_][i_16_] != 0)
					i_12_ = Static.anIntArrayArray2799[i_15_][i_16_];
			}
		}
		if (bool_11_ && i_12_ != 0) {
			for (int i_19_ = i_3_; i_19_ < i_3_ + i_5_; i_19_++) {
				for (int i_20_ = i_4_; i_20_ < i_4_ + i_6_; i_20_++) {
					if (Static.anIntArrayArray2799[i_19_][i_20_] == 0)
						Static.anIntArrayArray2799[i_19_][i_20_] = i_12_;
				}
			}
		}
		if (bool)
			Class14_Sub20.aClass40Array3093[Class14_Sub8_Sub38.anInt4727++] = class40;
		return true;
	}

	public static void method581(Class9 class9, boolean bool, Class9 class9_21_) {
		Static.aClass9_2792 = class9;
		if (!bool) {
			Class14_Sub2_Sub8.aClass9_3848 = class9_21_;
			Class38.anInt2617 = Static.aClass9_2792.method177(3, 13537);
		}
	}

	public static void method582(byte i, Class94 class94) {
		if (i != -124)
			aClass124_4409 = null;
		Class94 class94_22_ = Class21.method975(class94, false);
		int i_23_;
		int i_24_;
		if (class94_22_ == null) {
			i_24_ = Class14_Sub20.anInt3094;
			i_23_ = Class83.anInt1340;
		} else {
			i_23_ = class94_22_.anInt1518;
			i_24_ = class94_22_.anInt1545;
		}
		Class14_Sub21.method894(class94, 1, false, i_23_, i_24_);
		Class118.method1607(1, i_24_, i_23_, class94);
	}

	public int anInt4399;

	public int anInt4410;

	public int anInt4413 = -1;

	public int[] anIntArray4414;

	public Class14_Sub8_Sub19() {
		super(0, false);
	}

	public int[][] method474(int i, int i_25_) {
		if (i_25_ > -4)
			aClass124_4412 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method577(110)) {
			int[] is_26_ = is[0];
			int[] is_27_ = is[1];
			int i_28_ = anInt4399 * (Class17.anInt407 == anInt4410 ? i : anInt4410 * i / Class17.anInt407);
			int[] is_29_ = is[2];
			if (anInt4399 != Class112.anInt1876) {
				for (int i_30_ = 0; i_30_ < Class112.anInt1876; i_30_++) {
					int i_31_ = anInt4399 * i_30_ / Class112.anInt1876;
					int i_32_ = anIntArray4414[i_28_ + i_31_];
					is_29_[i_30_] = Class14_Sub8_Sub26.method617(255, i_32_) << 4;
					is_27_[i_30_] = Class14_Sub8_Sub26.method617(i_32_ >> 36, 4080);
					is_26_[i_30_] = Class14_Sub8_Sub26.method617(4080, i_32_ >> 12);
				}
			} else {
				for (int i_33_ = 0; Class112.anInt1876 > i_33_; i_33_++) {
					int i_34_ = anIntArray4414[i_28_++];
					is_29_[i_33_] = Class14_Sub8_Sub26.method617(i_34_, 255) << 4;
					is_27_[i_33_] = Class14_Sub8_Sub26.method617(i_34_ >> 36, 4080);
					is_26_[i_33_] = Class14_Sub8_Sub26.method617(16711680, i_34_) >> 44;
				}
			}
		}
		int[][] is_35_ = is;
		return is_35_;
	}

	public void method475(int i, int i_36_, Buffer class14_sub10) {
		if (i == 0)
			anInt4413 = class14_sub10.method784((byte) 110);
		if (i_36_ != 24777)
			method582((byte) 116, null);
	}

	public void method478(int i) {
		super.method478(i);
		anIntArray4414 = null;
	}

	public int method479() {
		int i_37_ = anInt4413;
		return i_37_;
	}

	public boolean method577(int i) {
		if (anIntArray4414 != null) {
			boolean bool = true;
			return bool;
		}
		if (anInt4413 >= 0) {
			int i_38_ = Class112.anInt1876;
			int i_39_ = Class17.anInt407;
			int i_40_ = (Class14_Sub13.anInterface3_2960.method15(1, anInt4413) ? 64 : 128);
			anIntArray4414 = Class14_Sub13.anInterface3_2960.method17(-16210, anInt4413);
			anInt4399 = i_40_;
			anInt4410 = i_40_;
			Static2.method1117(0, i_39_, i_38_);
			boolean bool = anIntArray4414 != null;
			return bool;
		}
		if (i < 91)
			method474(-30, 4);
		boolean bool = false;
		return bool;
	}
}
