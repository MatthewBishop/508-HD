/* Class7_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class7_Sub1 extends Class7 {
	public static Class9 aClass9_2652;
	public static int anInt2653 = -1;
	public static int anInt2655;
	public static Class124 aClass124_2656 = Class14_Sub2_Sub2.method263(1178, "");
	public static Class9_Sub1 aClass9_Sub1_2657;
	public static int anInt2659;
	public static Class124 aClass124_2660;
	public static int anInt2662;
	public static short[] aShortArray2663;
	public static int anInt2664;
	public static Class14_Sub2_Sub5 aClass14_Sub2_Sub5_2665;

	static {
		anInt2655 = 0;
		aShortArray2663 = new short[256];
		aClass124_2660 = Class14_Sub2_Sub2.method263(1178, "rot:");
	}

	public static Class124 method121(int i, int i_0_) {
		Class124 class124 = new Class124();
		class124.aByteArray2495 = new byte[i];
		class124.anInt2507 = 0;
		int i_1_ = 72 / ((i_0_ + 74) / 34);
		Class124 class124_2_ = class124;
		return class124_2_;
	}

	public static void method122(boolean bool) {
		if (bool)
			method123((byte) -102);
		Class103.method1531(Class67.aClass94_1060);
		Class125_Sub4.anInt3419++;
		if (!Class122.aBoolean2056 || !Class59.aBoolean954) {
			if (Class125_Sub4.anInt3419 > 1)
				Class67.aClass94_1060 = null;
		} else {
			int i = Class107.anInt1804;
			i -= Canvas_Sub2.anInt63;
			int i_3_ = JunkTex.anInt4640;
			if (i < Class48.anInt798)
				i = Class48.anInt798;
			if (Class67.aClass94_1060.anInt1545 + i > JunkTex.aClass94_420.anInt1545 + Class48.anInt798)
				i = (-Class67.aClass94_1060.anInt1545 + (Class48.anInt798 + JunkTex.aClass94_420.anInt1545));
			i_3_ -= JunkTex.anInt4132;
			if (Class108.anInt1824 > i_3_)
				i_3_ = Class108.anInt1824;
			int i_4_ = -Class47.anInt796 + i;
			if (Class67.aClass94_1060.anInt1518 + i_3_ > JunkTex.aClass94_420.anInt1518 + Class108.anInt1824)
				i_3_ = (-Class67.aClass94_1060.anInt1518 + (JunkTex.aClass94_420.anInt1518 + Class108.anInt1824));
			int i_5_ = -Class35.anInt602 + i_3_;
			int i_6_ = Class67.aClass94_1060.anInt1580;
			if (Class67.aClass94_1060.anInt1549 < Class125_Sub4.anInt3419
					&& (i_6_ < i_5_ || i_5_ < -i_6_ || i_4_ > i_6_ || i_4_ < -i_6_))
				JunkTex.aBoolean4188 = true;
			int i_7_ = JunkTex.aClass94_420.anInt1547 - Class48.anInt798 + i;
			int i_8_ = JunkTex.aClass94_420.anInt1490 + i_3_ - Class108.anInt1824;
			if (Class67.aClass94_1060.anObjectArray1581 != null && JunkTex.aBoolean4188) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.anInt3114 = i_8_;
				class14_sub21.anObjectArray3115 = Class67.aClass94_1060.anObjectArray1581;
				class14_sub21.anInt3106 = i_7_;
				class14_sub21.aClass94_3116 = Class67.aClass94_1060;
				Class133_Sub3.method1830(class14_sub21, -1976917689);
			}
			if (JunkTex.anInt4599 == 0) {
				if (JunkTex.aBoolean4188) {
					if (Class67.aClass94_1060.anObjectArray1475 != null) {
						Class14_Sub21 class14_sub21 = new Class14_Sub21();
						class14_sub21.aClass94_3116 = Class67.aClass94_1060;
						class14_sub21.anInt3106 = i_7_;
						class14_sub21.aClass94_3105 = Class14_Sub19.aClass94_3070;
						class14_sub21.anObjectArray3115 = Class67.aClass94_1060.anObjectArray1475;
						class14_sub21.anInt3114 = i_8_;
						Class133_Sub3.method1830(class14_sub21, -1976917689);
					}
					if (Class14_Sub19.aClass94_3070 != null && client.method57(Class67.aClass94_1060) != null) {
						JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(179);
						JunkTex.aClass14_Sub10_Sub1_891.method803(Class14_Sub19.aClass94_3070.anInt1548, 88);
						JunkTex.aClass14_Sub10_Sub1_891.method803(Class67.aClass94_1060.anInt1548, 127);
						JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 117, Class67.aClass94_1060.anInt1478);
						JunkTex.aClass14_Sub10_Sub1_891.method838(-1676904088, Class14_Sub19.aClass94_3070.anInt1478);
					}
				} else if ((Class103.anInt1730 != 1 && !Class127.method1754(128, (JunkTex.anInt4729) - 1))
						|| JunkTex.anInt4729 <= 2) {
					if (JunkTex.anInt4729 > 0)
						Class107.method1551(-23473);
				} else
					Static2.method382((byte) 127);
				Class67.aClass94_1060 = null;
			}
		}
	}

	public static void method123(byte i) {
		if (i != -18)
			anInt2662 = 16;
		aClass14_Sub2_Sub5_2665 = null;
		aClass9_2652 = null;
		aClass9_Sub1_2657 = null;
		aClass124_2656 = null;
		aShortArray2663 = null;
		aClass124_2660 = null;
	}

	public static void method124(int i, int i_9_, int i_10_, int i_11_, int i_12_, byte i_13_) {
		int i_14_ = 0;
		int i_15_ = i_12_;
		int i_16_ = i * i;
		int i_17_ = i_12_ * i_12_;
		int i_18_ = i_17_ << 1;
		int i_19_ = i_12_ << 1;
		int i_20_ = i_16_ << 33;
		if (i_13_ >= 50) {
			int i_21_ = i_17_ - i_20_ * (i_19_ - 1);
			int i_22_ = (-i_19_ + 1) * i_16_ + i_18_;
			int i_23_ = i_17_ << 34;
			int i_24_ = i_16_ << 2;
			int i_25_ = i_18_ * ((i_14_ << 1) + 3);
			int i_26_ = i_23_ * (i_14_ + 1);
			int i_27_ = ((i_15_ << 1) - 3) * i_20_;
			if (i_11_ >= Class14_Sub17.anInt3005 && Class59.anInt955 >= i_11_) {
				int i_28_ = Class67.method1301((byte) 93, i_10_ + i, Class118.anInt1982, JunkTex.anInt4327);
				int i_29_ = Class67.method1301((byte) -122, -i + i_10_, Class118.anInt1982,
						JunkTex.anInt4327);
				Class51.method1201((Static2.anIntArrayArray4038[i_11_]), i_29_, i_28_, -5973, i_9_);
			}
			int i_30_ = (i_15_ - 1) * i_24_;
			while (i_15_ > 0) {
				if (i_22_ < 0) {
					while (i_22_ < 0) {
						i_21_ += i_26_;
						i_26_ += i_23_;
						i_14_++;
						i_22_ += i_25_;
						i_25_ += i_23_;
					}
				}
				if (i_21_ < 0) {
					i_22_ += i_25_;
					i_25_ += i_23_;
					i_21_ += i_26_;
					i_14_++;
					i_26_ += i_23_;
				}
				i_21_ -= i_27_;
				int i_31_ = --i_15_ + i_11_;
				int i_32_ = i_15_ + i_11_;
				if (i_32_ >= Class14_Sub17.anInt3005 && Class59.anInt955 >= i_31_) {
					int i_33_ = Class67.method1301((byte) -70, i_14_ + i_10_, Class118.anInt1982,
							JunkTex.anInt4327);
					int i_34_ = Class67.method1301((byte) 76, -i_14_ + i_10_, Class118.anInt1982,
							JunkTex.anInt4327);
					if (Class14_Sub17.anInt3005 <= i_31_)
						Class51.method1201((Static2.anIntArrayArray4038[i_31_]), i_34_, i_33_, -5973, i_9_);
					if (Class59.anInt955 >= i_32_)
						Class51.method1201((Static2.anIntArrayArray4038[i_32_]), i_34_, i_33_, -5973, i_9_);
				}
				i_22_ -= i_30_;
				i_27_ -= i_24_;
				i_30_ -= i_24_;
			}
		}
	}
}
