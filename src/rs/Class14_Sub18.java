/* Class14_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub21;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub8;
import rs.tex.Static;

public class Class14_Sub18 extends Linkable {
	public int anInt3035;
	public static Buffer aClass14_Sub10_3036;
	public int anInt3037;
	public int anInt3038;
	public int anInt3039;
	public int anInt3040;
	public int anInt3041;
	public int anInt3043;
	public int anInt3044;
	public int anInt3045;
	public int anInt3046;
	public int anInt3048;
	public int anInt3049;
	public static int anInt3050 = -1;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_3051;
	public int anInt3052;
	public int anInt3053;
	public Class14_Sub28 aClass14_Sub28_3054;
	public int anInt3056;
	public int anInt3058;
	public Class14_Sub12_Sub1 aClass14_Sub12_Sub1_3059;
	public static int anInt3061;
	public Class127 aClass127_3062;
	public int anInt3063;
	public static int anInt3064;

	static {
		aClass14_Sub10_3036 = new Buffer(8);
		anInt3061 = 3353893;
		anInt3064 = 0;
	}

	public static void method882(int i, Linkable linkable, Linkable linkable_0_) {
		if (linkable_0_.previous != null)
			linkable_0_.unlink();
		linkable_0_.previous = linkable.previous;
		linkable_0_.next = linkable;
		linkable_0_.previous.next = linkable_0_;
		linkable_0_.next.previous = linkable_0_;
		if (i != -17344)
			anInt3064 = -8;
	}

	public static void method883(int i) {
		if (i == 1)
			aClass14_Sub10_3036 = null;
	}

	public static Class88[] method884(int i, Class43 class43) {
		if (!class43.method1146((byte) -15)) {
			Class88[] class88s = new Class88[0];
			return class88s;
		}
		Class31 class31 = class43.method1136(-12444);
		while (class31.anInt529 == 0)
			Class14_Sub13.method864(10L, (byte) 64);
		if (class31.anInt529 == 2) {
			Class88[] class88s = new Class88[0];
			return class88s;
		}
		int[] is = (int[]) class31.anObject530;
		Class88[] class88s = new Class88[is.length >> 34];
		if (i != -3189) {
			Class88[] class88s_1_ = null;
			return class88s_1_;
		}
		for (int i_2_ = 0; class88s.length > i_2_; i_2_++) {
			Class88 class88 = new Class88();
			class88s[i_2_] = class88;
			class88.anInt1396 = is[i_2_ << 2];
			class88.anInt1397 = is[(i_2_ << 34) + 1];
			class88.anInt1402 = is[(i_2_ << 34) + 2];
			class88.anInt1403 = is[(i_2_ << 2) + 3];
		}
		Class88[] class88s_3_ = class88s;
		return class88s_3_;
	}

	public void method885(boolean bool) {
		aClass14_Sub28_3054 = null;
		aClass14_Sub12_Sub1_3059 = null;
		aClass127_3062 = null;
		aClass14_Sub9_Sub4_3051 = null;
		if (bool)
			method885(true);
	}

	public static void method886(byte i) {
		if (Class14_Sub8_Sub21.aClass94_4446 == null && Class67.aClass94_1060 == null) {
			int i_4_ = Class7_Sub3_Sub1.anInt3714;
			if (Class133_Sub5.aBoolean3628) {
				if (i_4_ != 1) {
					int i_5_ = Class14_Sub8_Sub33.anInt4640;
					int i_6_ = Class107.anInt1804;
					if (Static.anInt500 - 10 > i_5_ || i_5_ > Static.anInt500 - (-Class14_Sub14.anInt2984 - 10)
							|| i_6_ < Class14_Sub2_Sub8.anInt3832 - 10
							|| (Class14_Sub8_Sub27.anInt4550 + (Class14_Sub2_Sub8.anInt3832 + 10)) < i_6_) {
						Class133_Sub5.aBoolean3628 = false;
						Class14_Sub13.method862(125, Class14_Sub14.anInt2984, Class14_Sub8_Sub27.anInt4550,
								Class14_Sub2_Sub8.anInt3832, Static.anInt500);
					}
				}
				if (i_4_ == 1) {
					int i_7_ = Class14_Sub2_Sub8.anInt3832;
					int i_8_ = Static.anInt500;
					int i_9_ = Class14_Sub14.anInt2984;
					int i_10_ = Class125_Sub1.anInt3367;
					int i_11_ = Class139.anInt2230;
					int i_12_ = -1;
					for (int i_13_ = 0; Class14_Sub8_Sub38.anInt4729 > i_13_; i_13_++) {
						int i_14_ = ((Class14_Sub8_Sub38.anInt4729 - 1 - i_13_) * 15 + (i_7_ + 31));
						if (i_8_ < i_10_ && i_10_ < i_9_ + i_8_ && i_11_ > i_14_ - 13 && i_11_ < i_14_ + 3)
							i_12_ = i_13_;
					}
					if (i_12_ != -1)
						Class14_Sub8_Sub14.method552(i ^ ~0x65, i_12_);
					Class133_Sub5.aBoolean3628 = false;
					Class14_Sub13.method862(125, Class14_Sub14.anInt2984, Class14_Sub8_Sub27.anInt4550,
							Class14_Sub2_Sub8.anInt3832, Static.anInt500);
				}
			} else {
				if (i_4_ == 1 && Class14_Sub8_Sub38.anInt4729 > 0) {
					short i_15_ = (Class14_Sub29.aShortArray3262[Class14_Sub8_Sub38.anInt4729 - 1]);
					if (i_15_ == 57 || i_15_ == 42 || i_15_ == 5 || i_15_ == 35 || i_15_ == 58 || i_15_ == 29
							|| i_15_ == 12 || i_15_ == 44 || i_15_ == 26 || i_15_ == 28 || i_15_ == 25
							|| i_15_ == 1001) {
						int i_16_ = (Static.anIntArray3288[Class14_Sub8_Sub38.anInt4729 - 1]);
						int i_17_ = (Class14_Sub8_Sub27.anIntArray4544[Class14_Sub8_Sub38.anInt4729 - 1]);
						Class94 class94 = Static.method1233(i_16_, i + 21905);
						if (Class111.method1577((byte) -49, client.method46(class94))
								|| Class14_Sub6.method468(65, client.method46(class94))) {
							Class113.anInt1879 = 0;
							Class14_Sub8_Sub8.aBoolean4221 = false;
							if (Class14_Sub8_Sub21.aClass94_4446 != null)
								Class103.method1531((Class14_Sub8_Sub21.aClass94_4446));
							Class14_Sub8_Sub21.aClass94_4446 = Static.method1233(i_16_, 21803);
							Class111.anInt1865 = Class139.anInt2230;
							Class133_Sub1_Sub1.anInt4936 = Class125_Sub1.anInt3367;
							Class122.anInt2054 = i_17_;
							Class103.method1531((Class14_Sub8_Sub21.aClass94_4446));
							return;
						}
					}
				}
				if (i_4_ == 1 && ((Class103.anInt1730 == 1 && Class14_Sub8_Sub38.anInt4729 > 2)
						|| Class127.method1754(128, (Class14_Sub8_Sub38.anInt4729 - 1))))
					i_4_ = 2;
				if (i_4_ == 2 && Class14_Sub8_Sub38.anInt4729 > 0 || Class14_Sub8_Sub31.anInt4608 == 1)
					Class14_Sub2_Sub18.method382((byte) 126);
				if (i_4_ == 1 && Class14_Sub8_Sub38.anInt4729 > 0 || Class14_Sub8_Sub31.anInt4608 == 2)
					Class107.method1551(-23473);
			}
			if (i != -102)
				anInt3050 = 49;
		}
	}
}
