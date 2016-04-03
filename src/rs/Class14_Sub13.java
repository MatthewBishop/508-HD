/* Class14_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;
import com.jagex.util.Util;

import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub6;

public class Class14_Sub13 extends Linkable {
	public static Class124 aClass124_2955 = Class14_Sub2_Sub2.method263(1178, "Fallen lassen");
	public static Class9_Sub1 aClass9_Sub1_2958;
	public static Interface3 anInterface3_2960;
	public long aLong2963;
	public static int anInt2964 = 0;

	public static void method858(int i) {
		if (i != -1)
			method861(-123, 57, (byte) -1, 25, 48, 31, 123);
		Class60.aBoolean983 = true;
	}

	public static void method859(int i, int i_0_) {
		Static2.aClass52_3942.method1208(i_0_);
		if (i != 0)
			method861(103, -45, (byte) 72, -58, 112, -24, 116);
	}

	public static Class125_Sub3 method860(Buffer class14_sub10, boolean bool) {
		if (!bool)
			method861(-50, 110, (byte) 88, 69, 33, 3, 63);
		Class125_Sub3 class125_sub3 = new Class125_Sub3(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method829(-119), class14_sub10.readUByte());
		return class125_sub3;
	}

	public static void method861(int i, int i_1_, byte i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		Class128.method1758(i_3_, (byte) 98);
		int i_7_ = 0;
		int i_8_ = i_3_ - i_6_;
		int i_9_ = -i_3_;
		if (i_8_ < 0)
			i_8_ = 0;
		int i_10_ = i_3_;
		int i_11_ = i_8_;
		int i_12_ = -1;
		int i_13_ = -i_8_;
		if (i_2_ != -100)
			Util.sleep(-32L);
		int i_14_ = -1;
		int[] is = Static2.anIntArrayArray4038[i_4_];
		int i_15_ = i - i_8_;
		int i_16_ = i_8_ + i;
		Class51.method1201(is, -i_3_ + i, i_15_, -5973, i_5_);
		Class51.method1201(is, i_15_, i_16_, -5973, i_1_);
		Class51.method1201(is, i_16_, i + i_3_, -5973, i_5_);
		while (i_7_ < i_10_) {
			i_12_ += 2;
			i_9_ += i_12_;
			i_14_ += 2;
			i_13_ += i_14_;
			if (i_13_ >= 0 && i_11_ >= 1) {
				Class14_Sub8_Sub6.anIntArray4191[i_11_] = i_7_;
				i_11_--;
				i_13_ -= i_11_ << 1;
			}
			i_7_++;
			if (i_9_ >= 0) {
				i_10_--;
				i_9_ -= i_10_ << 1;
				if (i_8_ <= i_10_) {
					int[] is_17_ = Static2.anIntArrayArray4038[i_4_ - i_10_];
					int i_18_ = i_7_ + i;
					int[] is_19_ = Static2.anIntArrayArray4038[i_4_ + i_10_];
					int i_20_ = -i_7_ + i;
					Class51.method1201(is_19_, i_20_, i_18_, -5973, i_5_);
					Class51.method1201(is_17_, i_20_, i_18_, i_2_ - 5873, i_5_);
				} else {
					int[] is_21_ = Static2.anIntArrayArray4038[i_4_ - i_10_];
					int i_22_ = i + i_7_;
					int[] is_23_ = Static2.anIntArrayArray4038[i_10_ + i_4_];
					int i_24_ = Class14_Sub8_Sub6.anIntArray4191[i_10_];
					int i_25_ = i - i_24_;
					int i_26_ = -i_7_ + i;
					int i_27_ = i_24_ + i;
					Class51.method1201(is_23_, i_26_, i_25_, -5973, i_5_);
					Class51.method1201(is_23_, i_25_, i_27_, -5973, i_1_);
					Class51.method1201(is_23_, i_27_, i_22_, -5973, i_5_);
					Class51.method1201(is_21_, i_26_, i_25_, -5973, i_5_);
					Class51.method1201(is_21_, i_25_, i_27_, -5973, i_1_);
					Class51.method1201(is_21_, i_27_, i_22_, -5973, i_5_);
				}
			}
			int[] is_28_ = Static2.anIntArrayArray4038[i_4_ + i_7_];
			int[] is_29_ = Static2.anIntArrayArray4038[-i_7_ + i_4_];
			int i_30_ = i_10_ + i;
			int i_31_ = i - i_10_;
			if (i_8_ > i_7_) {
				int i_32_ = (i_11_ >= i_7_ ? i_11_ : Class14_Sub8_Sub6.anIntArray4191[i_7_]);
				int i_33_ = i + i_32_;
				int i_34_ = -i_32_ + i;
				Class51.method1201(is_28_, i_31_, i_34_, -5973, i_5_);
				Class51.method1201(is_28_, i_34_, i_33_, -5973, i_1_);
				Class51.method1201(is_28_, i_33_, i_30_, -5973, i_5_);
				Class51.method1201(is_29_, i_31_, i_34_, -5973, i_5_);
				Class51.method1201(is_29_, i_34_, i_33_, -5973, i_1_);
				Class51.method1201(is_29_, i_33_, i_30_, -5973, i_5_);
			} else {
				Class51.method1201(is_28_, i_31_, i_30_, -5973, i_5_);
				Class51.method1201(is_29_, i_31_, i_30_, -5973, i_5_);
			}
		}
	}

	public static void method862(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		if (i <= 121)
			aClass124_2955 = null;
		for (int i_39_ = 0; i_39_ < Class14_Sub17.anInt3012; i_39_++) {
			if ((Class110.anIntArray1854[i_39_] + Class9.anIntArray215[i_39_] > i_38_)
					&& Class9.anIntArray215[i_39_] < i_38_ + i_35_
					&& i_37_ < (Class74.anIntArray1135[i_39_] + Class137.anIntArray2205[i_39_])
					&& Class74.anIntArray1135[i_39_] < i_37_ + i_36_)
				Class14_Sub8_Sub36.aBooleanArray4698[i_39_] = true;
		}
	}

	public static void method863(byte i) {
		anInterface3_2960 = null;
		aClass9_Sub1_2958 = null;
		aClass124_2955 = null;
		if (i < 66)
			anInterface3_2960 = null;
	}

	public Class14_Sub13() {
		/* empty */
	}

	public Class14_Sub13(long l) {
		aLong2963 = l;
	}
}
