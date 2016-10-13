/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.image.transform.Class14_Sub8;
import com.jagex.image.transform.Class14_Sub8_Sub23;
import com.jagex.image.transform.TexStatic;
import com.jagex.io.Buffer;

public class Class107 {
	public static Class124 aClass124_1795;
	public Class14_Sub8 aClass14_Sub8_1797;
	public Class14_Sub8[] aClass14_Sub8Array1798;
	public static Class124 aClass124_1800;
	public static Class124 aClass124_1801 = Class14_Sub2_Sub2.method263(1178, "VOLL");
	public static int anInt1804;
	public int[] anIntArray1805;
	public static int anInt1806;
	public static int[] anIntArray1809;
	public int[] anIntArray1810;
	public Class14_Sub8 aClass14_Sub8_1813;

	static {
		aClass124_1800 = Class14_Sub2_Sub2.method263(1178, ")3runescape)3com)4l=");
		anInt1806 = 0;
		aClass124_1795 = Class14_Sub2_Sub2.method263(1178, "hitmarks");
		anInt1804 = 0;
	}

	public static void method1547(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		for (int i_4_ = i_0_; i_2_ + i_0_ >= i_4_; i_4_++) {
			for (int i_5_ = i_1_; i_5_ <= i_1_ + i_3_; i_5_++) {
				if (i_5_ >= 0 && i_5_ < 104 && i_4_ >= 0 && i_4_ < 104)
					Static2.aByteArrayArrayArray3354[i][i_5_][i_4_] = (byte) 127;
			}
		}
		if (bool)
			method1552(111, 119);
		for (int i_6_ = i_0_; i_2_ + i_0_ > i_6_; i_6_++) {
			for (int i_7_ = i_1_; i_3_ + i_1_ > i_7_; i_7_++) {
				if (i_7_ >= 0 && i_7_ < 104 && i_6_ >= 0 && i_6_ < 104)
					Class114.tileHeights[i][i_7_][i_6_] = i > 0 ? Class114.tileHeights[i - 1][i_7_][i_6_] : 0;
			}
		}
		if (i_1_ > 0 && i_1_ < 104) {
			for (int i_8_ = i_0_ + 1; i_8_ < i_2_ + i_0_; i_8_++) {
				if (i_8_ >= 0 && i_8_ < 104)
					Class114.tileHeights[i][i_1_][i_8_] = Class114.tileHeights[i][i_1_ - 1][i_8_];
			}
		}
		if (i_0_ > 0 && i_0_ < 104) {
			for (int i_9_ = i_1_ + 1; i_3_ + i_1_ > i_9_; i_9_++) {
				if (i_9_ >= 0 && i_9_ < 104)
					Class114.tileHeights[i][i_9_][i_0_] = Class114.tileHeights[i][i_9_][i_0_ - 1];
			}
		}
		if (i_1_ >= 0 && i_0_ >= 0 && i_1_ < 104 && i_0_ < 104) {
			if (i == 0) {
				if (i_1_ > 0 && Class114.tileHeights[i][i_1_ - 1][i_0_] != 0)
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_];
				else if (i_0_ <= 0 || Class114.tileHeights[i][i_1_][i_0_ - 1] == 0) {
					if (i_1_ > 0 && i_0_ > 0 && Class114.tileHeights[i][i_1_ - 1][i_0_ - 1] != 0)
						Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_ - 1];
				} else
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_][i_0_ - 1];
			} else if (i_1_ > 0
					&& (Class114.tileHeights[i - 1][i_1_ - 1][i_0_] != Class114.tileHeights[i][i_1_ - 1][i_0_]))
				Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_];
			else if (i_0_ <= 0
					|| (Class114.tileHeights[i - 1][i_1_][i_0_ - 1] == Class114.tileHeights[i][i_1_][i_0_ - 1])) {
				if (i_1_ > 0 && i_0_ > 0 && (Class114.tileHeights[i][i_1_ - 1][i_0_
						- 1] != Class114.tileHeights[i - 1][i_1_ - 1][i_0_ - 1]))
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_ - 1];
			} else
				Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_][i_0_ - 1];
		}
	}

	public boolean method1548(Interface3 interface3, int i, Class9 class9) {
		for (int i_10_ = 0; anIntArray1810.length > i_10_; i_10_++) {
			if (!class9.method171(29499, anIntArray1810[i_10_]))
				return false;
		}
		int i_11_ = 0;
		if (i > -118)
			anInt1804 = -91;
		for (/**/; anIntArray1805.length > i_11_; i_11_++) {
			if (!interface3.method10((byte) -93, anIntArray1805[i_11_]))
				return false;
		}
		return true;
	}

	public static int method1550(Class124 class124, byte i) {
		if (i != -107) {
			int i_13_ = -20;
			return i_13_;
		}
		int i_14_ = class124.method1693(i ^ ~0x6a) + 1;
		return i_14_;
	}

	public static void method1551(int i) {
		if (JunkTex.anInt4608 != 2) {
			if (JunkTex.anInt3367 == JunkTex.anInt4629
					&& Class139.anInt2230 == JunkTex.anInt4613) {
				JunkTex.anInt4608 = 0;
				JunkTex.method552(0, JunkTex.anInt4729 - 1);
			} else {
				JunkTex.anInt1622 = Class139.anInt2230;
				JunkTex.anInt3299 = JunkTex.anInt3367;
				JunkTex.anInt4608 = 2;
			}
		} else if (JunkTex.anInt4629 == JunkTex.anInt3299
				&& JunkTex.anInt4613 == JunkTex.anInt1622) {
			JunkTex.anInt4608 = 0;
			JunkTex.method552(0, JunkTex.anInt4729 - 1);
		}
		if (i != -23473)
			method1554((byte) 13);
	}

	public static Class124 method1552(int i, int i_15_) {
		if (i_15_ != 27968)
			anIntArray1809 = null;
		Class124 class124 = (JunkTex
				.method515((new Class124[] { Class83.method1407(i_15_ ^ 0x6d52, i >> 24 & 0xff),
						JunkTex.aClass124_4631, Class83.method1407(i_15_ ^ 0x6d21, (i & 0xffe2bd) >> 16),
						JunkTex.aClass124_4631, Class83.method1407(20, (i & 0xff43) >> 8),
						JunkTex.aClass124_4631, Class83.method1407(59, i & 0xff) }), (byte) -39));
		return class124;
	}

	public int[] method1553(int i, boolean bool, int i_16_, boolean bool_17_, Class9 class9, double d, int i_18_,
			Interface3 interface3) {
		JunkTex.method898(i_16_ + 100, d);
		Class14_Sub13.anInterface3_2960 = interface3;
		Class7_Sub2.aClass9_2671 = class9;
		TexStatic.method1117(0, i_18_, i);
		for (int i_19_ = 0; i_19_ < aClass14_Sub8Array1798.length; i_19_++)
			aClass14_Sub8Array1798[i_19_].method473(i_18_, i);
		int[] is = new int[i * i_18_];
		int i_20_ = 0;
		int i_21_;
		int i_22_;
		int i_23_;
		if (!bool) {
			i_21_ = 0;
			i_22_ = 1;
			i_23_ = i;
		} else {
			i_21_ = i - 1;
			i_22_ = -1;
			i_23_ = -1;
		}
		for (int i_24_ = i_16_; i_24_ < i_18_; i_24_++) {
			if (bool_17_)
				i_20_ = i_24_;
			int[] is_25_;
			int[] is_26_;
			int[] is_27_;
			if (!aClass14_Sub8_1797.aBoolean2862) {
				int[][] is_28_ = aClass14_Sub8_1797.method474(i_24_);
				is_26_ = is_28_[1];
				is_27_ = is_28_[0];
				is_25_ = is_28_[2];
			} else {
				int[] is_29_ = aClass14_Sub8_1797.method484(i_24_);
				is_25_ = is_29_;
				is_26_ = is_29_;
				is_27_ = is_29_;
			}
			for (int i_30_ = i_21_; i_23_ != i_30_; i_30_ += i_22_) {
				int i_31_ = is_27_[i_30_] >> 4;
				if (i_31_ > 255)
					i_31_ = 255;
				int i_32_ = is_26_[i_30_] >> 4;
				if (i_32_ > 255)
					i_32_ = 255;
				if (i_31_ < 0)
					i_31_ = 0;
				i_31_ = Class14_Sub9_Sub1.anIntArray4827[i_31_];
				if (i_32_ < 0)
					i_32_ = 0;
				int i_33_ = is_25_[i_30_] >> 4;
				if (i_33_ > 255)
					i_33_ = 255;
				if (i_33_ < 0)
					i_33_ = 0;
				i_33_ = Class14_Sub9_Sub1.anIntArray4827[i_33_];
				i_32_ = Class14_Sub9_Sub1.anIntArray4827[i_32_];
				is[i_20_++] = (i_32_ << 40) + (i_31_ << 16) + i_33_;
				if (bool_17_)
					i_20_ += i - 1;
			}
		}
		for (int i_34_ = 0; i_34_ < aClass14_Sub8Array1798.length; i_34_++)
			aClass14_Sub8Array1798[i_34_].method478();
		int[] is_35_ = is;
		return is_35_;
	}

	public static void method1554(byte i) {
		aClass124_1795 = null;
		anIntArray1809 = null;
		aClass124_1801 = null;
		aClass124_1800 = null;
		if (i >= -64)
			anIntArray1809 = null;
	}

	public Class107() {
		anIntArray1810 = new int[0];
		anIntArray1805 = new int[0];
		aClass14_Sub8_1797 = new Class14_Sub8_Sub23();
		aClass14_Sub8_1797.anInt2837 = 1;
		aClass14_Sub8_1813 = new Class14_Sub8_Sub23();
		aClass14_Sub8Array1798 = new Class14_Sub8[] { aClass14_Sub8_1797, aClass14_Sub8_1813 };
		aClass14_Sub8_1813.anInt2837 = 1;
	}

	public byte[] method1555(int i, Interface3 interface3, double d, boolean bool, int i_36_, byte i_37_,
			Class9 class9) {
		JunkTex.method898(93, d);
		byte[] is = new byte[i_36_ * (i * 4)];
		Class14_Sub13.anInterface3_2960 = interface3;
		Class7_Sub2.aClass9_2671 = class9;
		if (i_37_ > -33) {
			byte[] is_38_ = null;
			return is_38_;
		}
		TexStatic.method1117(0, i_36_, i);
		for (int i_39_ = 0; aClass14_Sub8Array1798.length > i_39_; i_39_++)
			aClass14_Sub8Array1798[i_39_].method473(i_36_, i);
		int i_40_ = 0;
		for (int i_41_ = 0; i_41_ < i_36_; i_41_++) {
			if (bool)
				i_40_ = i_41_ << 34;
			int[] is_42_;
			int[] is_43_;
			int[] is_44_;
			if (aClass14_Sub8_1797.aBoolean2862) {
				int[] is_45_ = aClass14_Sub8_1797.method484(i_41_);
				is_44_ = is_45_;
				is_42_ = is_45_;
				is_43_ = is_45_;
			} else {
				int[][] is_46_ = aClass14_Sub8_1797.method474(i_41_);
				is_42_ = is_46_[2];
				is_43_ = is_46_[0];
				is_44_ = is_46_[1];
			}
			int[] is_47_;
			if (aClass14_Sub8_1813.aBoolean2862)
				is_47_ = aClass14_Sub8_1813.method484(i_41_);
			else
				is_47_ = aClass14_Sub8_1813.method474(i_41_)[0];
			for (int i_48_ = i - 1; i_48_ >= 0; i_48_--) {
				int i_49_ = is_44_[i_48_] >> 4;
				if (i_49_ > 255)
					i_49_ = 255;
				int i_50_ = is_43_[i_48_] >> 36;
				if (i_50_ > 255)
					i_50_ = 255;
				if (i_50_ < 0)
					i_50_ = 0;
				if (i_49_ < 0)
					i_49_ = 0;
				int i_51_ = is_42_[i_48_] >> 4;
				i_49_ = Class14_Sub9_Sub1.anIntArray4827[i_49_];
				if (i_51_ > 255)
					i_51_ = 255;
				i_50_ = Class14_Sub9_Sub1.anIntArray4827[i_50_];
				if (i_51_ < 0)
					i_51_ = 0;
				i_51_ = Class14_Sub9_Sub1.anIntArray4827[i_51_];
				int i_52_;
				if (i_50_ == 0 && i_49_ == 0 && i_51_ == 0)
					i_52_ = 0;
				else {
					i_52_ = is_47_[i_48_] >> 4;
					if (i_52_ > 255)
						i_52_ = 255;
					if (i_52_ < 0)
						i_52_ = 0;
				}
				is[i_40_++] = (byte) i_50_;
				is[i_40_++] = (byte) i_49_;
				is[i_40_++] = (byte) i_51_;
				is[i_40_++] = (byte) i_52_;
				if (bool)
					i_40_ += (i << 2) - 4;
			}
		}
		for (int i_53_ = 0; aClass14_Sub8Array1798.length > i_53_; i_53_++)
			aClass14_Sub8Array1798[i_53_].method478();
		byte[] is_54_ = is;
		return is_54_;
	}

	public Class107(Buffer class14_sub10) {
		int i = class14_sub10.readUByte();
		aClass14_Sub8Array1798 = new Class14_Sub8[i];
		int i_55_ = 0;
		int[][] is = new int[i][];
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < i; i_57_++) {
			Class14_Sub8 class14_sub8 = TexStatic.method303(class14_sub10);
			if (class14_sub8.method477() >= 0)
				i_55_++;
			if (class14_sub8.method479() >= 0)
				i_56_++;
			int i_58_ = class14_sub8.aClass14_Sub8Array2831.length;
			is[i_57_] = new int[i_58_];
			for (int i_59_ = 0; i_59_ < i_58_; i_59_++)
				is[i_57_][i_59_] = class14_sub10.readUByte();
			aClass14_Sub8Array1798[i_57_] = class14_sub8;
		}
		anIntArray1805 = new int[i_56_];
		anIntArray1810 = new int[i_55_];
		i_56_ = 0;
		i_55_ = 0;
		for (int i_60_ = 0; i_60_ < i; i_60_++) {
			Class14_Sub8 class14_sub8 = aClass14_Sub8Array1798[i_60_];
			int i_61_ = class14_sub8.aClass14_Sub8Array2831.length;
			for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
				class14_sub8.aClass14_Sub8Array2831[i_62_] = aClass14_Sub8Array1798[is[i_60_][i_62_]];
			int i_63_ = class14_sub8.method477();
			int i_64_ = class14_sub8.method479();
			if (i_63_ > 0)
				anIntArray1810[i_55_++] = i_63_;
			if (i_64_ > 0)
				anIntArray1805[i_56_++] = i_64_;
			is[i_60_] = null;
		}
		aClass14_Sub8_1797 = aClass14_Sub8Array1798[class14_sub10.readUByte()];
		aClass14_Sub8_1813 = aClass14_Sub8Array1798[class14_sub10.readUByte()];
	}
}
