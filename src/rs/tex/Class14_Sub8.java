/* Class14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Queue;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;
import com.jagex.rt4.Class25;

import rs.Class109;
import rs.Class124;
import rs.Class133_Sub1;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub4;
import rs.Class134;
import rs.Class149;
import rs.Class14_Sub19;
import rs.Class14_Sub20;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub9;
import rs.Class35;
import rs.Class60;
import rs.Class7_Sub2;
import rs.Class9;
import rs.Class92;
import rs.Class95;
import rs.Class97;
import rs.Class98;
import rs.Class99;
import rs.Class99_Sub2;
import rs.Class9_Sub1;
import rs.Static2;

public abstract class Class14_Sub8 extends Linkable {
	public static Class124 aClass124_2852;
	public static Class124 aClass124_2855;
	public static Class124 aClass124_2857 = Class14_Sub2_Sub2.method263(1178, "Ladevorgang )2 bitte warten Sie)3");
	public static Class124 aClass124_2859;
	public static Class124 aClass124_2860 = Class14_Sub2_Sub2.method263(1178, "Loaded fonts");
	public static Class124 aClass124_2863;
	public static Queue aClass81_2844 = new Queue();
	public static Class9_Sub1 aClass9_Sub1_2848;
	public static float aFloat2854;
	public static int anInt2853;
	public static int anInt2856 = -1;
	public static int[] anIntArray2858;
	static {
		aClass124_2859 = Class14_Sub2_Sub2.method263(1178, ": ");
		aClass124_2855 = aClass124_2860;
		aClass124_2863 = Class14_Sub2_Sub2.method263(1178, "World");
		aClass124_2852 = aClass124_2863;
	}
	public static void method471(Class148_Sub1[] class148_sub1s, Class148_Sub1[] class148_sub1s_0_,
			Class148_Sub1[] class148_sub1s_1_, Class14_Sub2_Sub19_Sub1[] class14_sub2_sub19_sub1s, Class9 class9, int i,
			Class148_Sub1[] class148_sub1s_2_) {
		Class7_Sub2.aClass148_Sub1Array2677 = class148_sub1s_0_;
		Class133_Sub4.aClass148_Sub1Array3581 = class148_sub1s_1_;
		Class14_Sub2_Sub2.aClass148_Sub1Array3762 = class148_sub1s_2_;
		Class109.aClass14_Sub2_Sub19_Sub1Array1835 = class14_sub2_sub19_sub1s;
		Class14_Sub8_Sub28.aClass9_4570 = class9;
		Class99_Sub2.aClass148_Sub1Array3358 = class148_sub1s;
		Class97.aClass2_1647.method81();
		int i_3_ = Class14_Sub8_Sub28.aClass9_4570.method146(Class99.aClass124_1677, 0);
		int[] is = Class14_Sub8_Sub28.aClass9_4570.method176((byte) 90, i_3_);
		for (int i_4_ = 0; is.length > i_4_; i_4_++)
			Class97.aClass2_1647.method80(
					(Class14_Sub19.method889(
							new Buffer(Class14_Sub8_Sub28.aClass9_4570.method163(is[i_4_], i_3_, 0)), -60)));
		int i_5_ = 60 % ((17 - i) / 58);
	}
	public static void method476(byte i) {
		aClass124_2852 = null;
		aClass124_2857 = null;
		anIntArray2858 = null;
		aClass124_2863 = null;
		if (i <= -50) {
			aClass124_2855 = null;
			aClass124_2859 = null;
			aClass81_2844 = null;
			aClass124_2860 = null;
			aClass9_Sub1_2848 = null;
		}
	}
	public static void method481(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		Class25.method999(i_9_, i_8_, i_9_ + i, i_8_ + i_6_);
		Class25.method1004(i_9_, i_8_, i, i_6_, 0);
		if (i_7_ > -101)
			method471(null, null, null, null, null, -85, null);
		if (Class14_Sub8_Sub32.anInt4616 >= 100) {
			if (Class133_Sub1.aClass14_Sub2_Sub19_3505 == null || Class133_Sub1.aClass14_Sub2_Sub19_3505.anInt4035 != i
					|| i_6_ != Class133_Sub1.aClass14_Sub2_Sub19_3505.anInt4042) {
				Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(i, i_6_);
				Class92.method1455(class14_sub2_sub19_sub1.anIntArray5088, i, i_6_);
				Class133_Sub1_Sub1.method1810(Class14_Sub8_Sub15.anInt4332, 0, -18, 0, i_6_, 0, i,
						Class14_Sub2_Sub9.anInt3856, 0);
				Class133_Sub1.aClass14_Sub2_Sub19_3505 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1);
				Class92.anIntArray1437 = null;
			}
			Class133_Sub1.aClass14_Sub2_Sub19_3505.method390(i_9_, i_8_);
			int i_10_ = Static2.anInt356 * i / Class14_Sub2_Sub9.anInt3856;
			int i_11_ = i_9_ + i * Class98.anInt1671 / Class14_Sub2_Sub9.anInt3856;
			int i_12_ = Class134.anInt2572 * i_6_ / Class14_Sub8_Sub15.anInt4332;
			int i_13_ = (i_6_ * Class60.anInt984 / Class14_Sub8_Sub15.anInt4332 + i_8_);
			Class25.method1009(i_11_, i_13_, i_10_, i_12_, 16711680, 128);
			Class25.method1003(i_11_, i_13_, i_10_, i_12_, 16711680);
			if (Static2.anInt365 > 0 && Static2.anInt365 % 10 < 5) {
				for (Class14_Sub20 class14_sub20 = (Class14_Sub20) Class35.aClass2_589.method77(); class14_sub20 != null; class14_sub20 = (Class14_Sub20) Class35.aClass2_589.method84()) {
					if (Class97.anInt1656 == class14_sub20.anInt3085) {
						int i_14_ = ((i * class14_sub20.anInt3083 / Class14_Sub2_Sub9.anInt3856) + i_9_);
						int i_15_ = ((i_6_ * class14_sub20.anInt3084 / Class14_Sub8_Sub15.anInt4332) + i_8_);
						Class25.method1004(i_14_ - 2, i_15_ - 2, 4, 4, 16776960);
					}
				}
			}
		}
	}
	public static int method482(int i, boolean bool) {
		if (!bool) {
			int i_16_ = 127;
			return i_16_;
		}
		int i_17_ = (i & 0xf9bc7) >> 49;
		return i_17_;
	}

	public boolean aBoolean2862;

	public Class14_Sub8[] aClass14_Sub8Array2831;

	public Class149 aClass149_2851;

	public Class95 aClass95_2838;

	public int anInt2837;

	public Class14_Sub8(int i, boolean bool) {
		aClass14_Sub8Array2831 = new Class14_Sub8[i];
		aBoolean2862 = bool;
	}

	public void method472() {
	}

	public void method473(int i, int i_18_, int i_19_) {
		int i_20_ = anInt2837 != 255 ? anInt2837 : i;
		if (i_19_ >= -47)
			method476((byte) 15);
		if (aBoolean2862)
			aClass149_2851 = new Class149(i_20_, i, i_18_);
		else
			aClass95_2838 = new Class95(i_20_, i, i_18_);
	}

	public int[][] method474(int i, int i_21_) {
		if (i_21_ > -4) {
			int[][] is = null;
			return is;
		}
		throw new IllegalStateException("This operation does not have a colour output");
	}

	public void method475(int i, int i_22_, Buffer class14_sub10) {
		if (i_22_ != 24777)
			method483(3, (byte) -125, -67);
	}

	public int method477() {
		int i_23_ = -1;
		return i_23_;
	}

	public void method478(int i) {
		if (i != 0)
			method471(null, null, null, null, null, -95, null);
		if (aBoolean2862) {
			aClass149_2851.method2015((byte) 87);
			aClass149_2851 = null;
		} else {
			aClass95_2838.method1483(2);
			aClass95_2838 = null;
		}
	}

	public int method479() {
		int i_24_ = -1;
		return i_24_;
	}

	public int[][] method480(int i, int i_25_, int i_26_) {
		if (i != 0)
			aClass124_2860 = null;
		if (aClass14_Sub8Array2831[i_25_].aBoolean2862) {
			int[] is = aClass14_Sub8Array2831[i_25_].method484(i_26_, (byte) -61);
			int[][] is_27_ = new int[3][];
			is_27_[2] = is;
			is_27_[1] = is;
			is_27_[0] = is;
			int[][] is_28_ = is_27_;
			return is_28_;
		}
		int[][] is = aClass14_Sub8Array2831[i_25_].method474(i_26_, -15);
		return is;
	}

	public int[] method483(int i, byte i_29_, int i_30_) {
		if (i_29_ >= -11)
			aClass124_2855 = null;
		if (aClass14_Sub8Array2831[i].aBoolean2862) {
			int[] is = aClass14_Sub8Array2831[i].method484(i_30_, (byte) -90);
			return is;
		}
		int[] is = aClass14_Sub8Array2831[i].method474(i_30_, -98)[0];
		return is;
	}

	public int[] method484(int i, byte i_31_) {
		if (i_31_ > -58)
			aClass124_2857 = null;
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
