/* Class14_Sub8_Sub26 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.map.Scenegraph;

import rs.Class112;
import rs.Class114;
import rs.Class124;
import rs.Class125_Sub1;
import rs.Class14_Sub2_Sub2;
import rs.Class67;
import rs.Class72;
import rs.Class9_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub26 extends Class14_Sub8 {
	public static boolean aBoolean4528;
	public static Class124 aClass124_4529;
	public static Class9_Sub1 aClass9_Sub1_4521;
	public static int anInt4525;
	public static int anInt4526;
	public static int anInt4527 = (int) (Math.random() * 33.0) - 16;
	public static int anInt4530;
	public static int anInt4532;

	static {
		anInt4525 = -2;
		anInt4532 = -1;
		aClass124_4529 = Class14_Sub2_Sub2.method263(1178, ")1 ");
		aBoolean4528 = true;
	}

	public static byte[] method616(byte[] is, int i) {
		if (i <= 75) {
			byte[] is_0_ = null;
			return is_0_;
		}
		int i_1_ = is.length;
		byte[] is_2_ = new byte[i_1_];
		Class72.method1322(is, 0, is_2_, 0, i_1_);
		byte[] is_3_ = is_2_;
		return is_3_;
	}

	public static int method617(int i, int i_4_) {
		int i_5_ = i & i_4_;
		return i_5_;
	}

	public static void method618(int i) {
		if (i != 1)
			aClass124_4529 = null;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < 104; i_7_++) {
			for (int i_8_ = 0; i_8_ < 104; i_8_++) {
				if (Static2.method1498(true, i_8_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368), i_7_, i_6_))
					i_6_++;
				if (i_6_ >= 512)
					return;
			}
		}
	}

	public static boolean method619(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		if (i_9_ == i_10_ && i_11_ == i_12_) {
			if (!Scenegraph.method1529(i, i_9_, i_11_))
				return false;
			int i_14_ = i_9_ << 7;
			int i_15_ = i_11_ << 7;
			if (Scenegraph.method1310(i_14_ + 1, (Class114.tileHeights[i][i_9_][i_11_] + i_13_), i_15_ + 1)
					&& Scenegraph.method1310(i_14_ + 128 - 1, (Class114.tileHeights[i][i_9_ + 1][i_11_]) + i_13_,
							i_15_ + 1)
					&& Scenegraph.method1310(i_14_ + 128 - 1, (Class114.tileHeights[i][i_9_ + 1][i_11_ + 1]) + i_13_,
							i_15_ + 128 - 1)
					&& Scenegraph.method1310(i_14_ + 1, (Class114.tileHeights[i][i_9_][i_11_ + 1]) + i_13_,
							i_15_ + 128 - 1))
				return true;
			return false;
		}
		for (int i_16_ = i_9_; i_16_ <= i_10_; i_16_++) {
			for (int i_17_ = i_11_; i_17_ <= i_12_; i_17_++) {
				if (Static.anIntArrayArrayArray2724[i][i_16_][i_17_] == -Class67.anInt1059)
					return false;
			}
		}
		int i_18_ = (i_9_ << 7) + 1;
		int i_19_ = (i_11_ << 7) + 2;
		int i_20_ = Class114.tileHeights[i][i_9_][i_11_] + i_13_;
		if (!Scenegraph.method1310(i_18_, i_20_, i_19_))
			return false;
		int i_21_ = (i_10_ << 7) - 1;
		if (!Scenegraph.method1310(i_21_, i_20_, i_19_))
			return false;
		int i_22_ = (i_12_ << 7) - 1;
		if (!Scenegraph.method1310(i_18_, i_20_, i_22_))
			return false;
		if (!Scenegraph.method1310(i_21_, i_20_, i_22_))
			return false;
		return true;
	}

	public static void method620(boolean bool) {
		if (bool)
			method619(4, -52, 126, 78, -70, 66);
		aClass124_4529 = null;
		aClass9_Sub1_4521 = null;
	}

	public Class14_Sub8_Sub26() {
		super(1, false);
	}

	public int[][] method474(int i, int i_23_) {
		if (i_23_ > -4)
			anInt4527 = -124;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[][] is_24_ = method480(0, 0, i);
			int[] is_25_ = is_24_[0];
			int[] is_26_ = is_24_[2];
			int[] is_27_ = is[2];
			int[] is_28_ = is[1];
			int[] is_29_ = is_24_[1];
			int[] is_30_ = is[0];
			for (int i_31_ = 0; i_31_ < Class112.anInt1876; i_31_++) {
				is_30_[i_31_] = -is_25_[i_31_] + 4096;
				is_28_[i_31_] = 4096 - is_29_[i_31_];
				is_27_[i_31_] = -is_26_[i_31_] + 4096;
			}
		}
		int[][] is_32_ = is;
		return is_32_;
	}

	public void method475(int i, int i_33_, Buffer class14_sub10) {
		if (i_33_ != 24777)
			aClass124_4529 = null;
		if (i == 0)
			aBoolean2862 = class14_sub10.readUByte() == 1;
	}

	public int[] method484(int i, byte i_34_) {
		if (i_34_ > -58)
			anInt4527 = 105;
		int[] is = aClass149_2851.method2014(i, (byte) 118);
		if (aClass149_2851.aBoolean2402) {
			int[] is_35_ = method483(0, (byte) -81, i);
			for (int i_36_ = 0; Class112.anInt1876 > i_36_; i_36_++)
				is[i_36_] = -is_35_[i_36_] + 4096;
		}
		int[] is_37_ = is;
		return is_37_;
	}
}
