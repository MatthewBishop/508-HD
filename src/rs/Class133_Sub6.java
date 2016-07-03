/* Class133_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.RT4GL;
import com.jagex.util.BrowserControlUtil;
import com.jagex.cache.anim.Animation;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Static;

public class Class133_Sub6 extends Class133 {
	public static Class124 aClass124_3632;
	public double aDouble3633;
	public static int activeOccluderCount = 0;
	public static Class124 aClass124_3635;
	public static Class124 aClass124_3636;
	public static Class124 aClass124_3637;
	public Animation aClass46_3638;
	public static Class124 aClass124_3639;
	public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_3640;
	public int anInt3641;
	public static Class124[] aClass124Array3642;
	public boolean aBoolean3643 = false;
	public int anInt3644;
	public double aDouble3646;
	public static Class124 aClass124_3649;
	public double aDouble3650;
	public static Class124 aClass124_3651 = Class14_Sub2_Sub2.method263(1178, "Oct");
	public int anInt3652;
	public static Class124 aClass124_3654;
	public int anInt3655;
	public int anInt3656 = 0;
	public static Class124 aClass124_3657;
	public int anInt3658;
	public static int anInt3659;
	public static Class124 aClass124_3660 = Class14_Sub2_Sub2.method263(1178, "Dec");
	public double aDouble3661;
	public int anInt3662;
	public static boolean aBoolean3663;
	public static Class124 aClass124_3664;
	public int anInt3665;
	public static Class124 aClass124_3666;
	public int anInt3667;
	public int anInt3669;
	public int anInt3670;
	public double aDouble3672;
	public static int anInt3673;
	public double aDouble3674;
	public static short[] aShortArray3675;
	public static int anInt3676;
	public static Class124 aClass124_3677;
	public double aDouble3678;
	public int anInt3679;
	public double aDouble3680;
	public static Class124 aClass124_3681;
	public int anInt3682;
	public int anInt3683;
	public int anInt3685;
	public int anInt3686;

	static {
		aClass124_3635 = Class14_Sub2_Sub2.method263(1178, "gr-Un:");
		aClass124_3639 = Class14_Sub2_Sub2.method263(1178, "Mar");
		aClass124_3636 = Class14_Sub2_Sub2.method263(1178, "Nov");
		aClass124_3664 = Class14_Sub2_Sub2.method263(1178, "Apr");
		aBoolean3663 = false;
		aClass124_3666 = Class14_Sub2_Sub2.method263(1178, "Texturen geladen)3");
		aClass124_3649 = Class14_Sub2_Sub2.method263(1178, "Jul");
		aClass124_3632 = Class14_Sub2_Sub2.method263(1178, "May");
		aClass124_3637 = Class14_Sub2_Sub2.method263(1178, "Feb");
		aClass124_3681 = Class14_Sub2_Sub2.method263(1178, "Jan");
		aClass124_3654 = Class14_Sub2_Sub2.method263(1178, "Aug");
		aClass124_3677 = Class14_Sub2_Sub2.method263(1178, "Sep");
		aClass124_3657 = Class14_Sub2_Sub2.method263(1178, "Jun");
		aClass124Array3642 = new Class124[] { aClass124_3681, aClass124_3637, aClass124_3639, aClass124_3664,
				aClass124_3632, aClass124_3657, aClass124_3649, aClass124_3654, aClass124_3677, aClass124_3651,
				aClass124_3636, aClass124_3660 };
	}

	public void method1849(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		if (!aBoolean3643) {
			double d = (double) (-anInt3686 + i_1_);
			double d_4_ = (double) (i_2_ - anInt3683);
			double d_5_ = Math.sqrt(d_4_ * d_4_ + d * d);
			aDouble3633 = (double) anInt3685;
			aDouble3678 = (double) anInt3686 + d * (double) anInt3658 / d_5_;
			aDouble3646 = (double) anInt3683 + d_4_ * (double) anInt3658 / d_5_;
		}
		double d = (double) (anInt3644 + 1 - i);
		aDouble3650 = ((double) i_2_ - aDouble3646) / d;
		aDouble3672 = ((double) i_1_ - aDouble3678) / d;
		aDouble3674 = Math.sqrt(aDouble3650 * aDouble3650 + aDouble3672 * aDouble3672);
		if (i_0_ == -122) {
			if (!aBoolean3643)
				aDouble3680 = -aDouble3674 * Math.tan((double) anInt3682 * 0.02454369);
			aDouble3661 = ((-aDouble3633 + (double) i_3_ - d * aDouble3680) * 2.0 / (d * d));
		}
	}

	public int method1781() {
		int i = anInt3670;
		return i;
	}

	public Class133_Sub7 method1850(int i) {
		Class60 class60 = Class127.method1749(anInt3652, (byte) 42);
		if (i >= -114)
			method1853(73, -56);
		Class133_Sub7 class133_sub7 = class60.method1267(0, anInt3641);
		if (class133_sub7 == null) {
			Class133_Sub7 class133_sub7_6_ = null;
			return class133_sub7_6_;
		}
		class133_sub7.method1861(anInt3662);
		Class133_Sub7 class133_sub7_7_ = class133_sub7;
		return class133_sub7_7_;
	}

	public void method1851(int i, int i_8_) {
		aDouble3646 += aDouble3650 * (double) i_8_;
		aDouble3678 += aDouble3672 * (double) i_8_;
		aDouble3633 += aDouble3680 * (double) i_8_ + (double) i_8_ * (aDouble3661 * 0.5 * (double) i_8_);
		aDouble3680 += (double) i_8_ * aDouble3661;
		if (i > -87)
			method1781();
		aBoolean3643 = true;
		anInt3665 = ((int) (Math.atan2(aDouble3672, aDouble3650) * 325.949) + 1024 & 0x7ff);
		anInt3662 = (int) (Math.atan2(aDouble3680, aDouble3674) * 325.949) & 0x7ff;
		if (aClass46_3638 != null) {
			anInt3656 += i_8_;
			while (aClass46_3638.anIntArray763[anInt3641] < anInt3656) {
				anInt3656 -= aClass46_3638.anIntArray763[anInt3641];
				anInt3641++;
				if (aClass46_3638.anIntArray768.length <= anInt3641) {
					anInt3641 -= aClass46_3638.loopOffset;
					if (anInt3641 < 0 || aClass46_3638.anIntArray768.length <= anInt3641)
						anInt3641 = 0;
				}
			}
		}
	}

	public static void method1852(int i) {
		aClass124_3635 = null;
		aClass124_3666 = null;
		aClass124_3660 = null;
		aClass124_3632 = null;
		aClass124_3637 = null;
		aClass124_3677 = null;
		aClass124_3639 = null;
		aClass124_3649 = null;
		aClass124_3654 = null;
		aClass124_3681 = null;
		aClass124_3657 = null;
		aShortArray3675 = null;
		aClass124_3651 = null;
		aClass124_3664 = null;
		aClass14_Sub2_Sub19_3640 = null;
		if (i <= 75)
			method1853(97, 113);
		aClass124Array3642 = null;
		aClass124_3636 = null;
	}

	public static void method1853(int i, int i_9_) {
		Class150.aClass52_2406.method1208(i);
		Class14_Sub8_Sub30.aClass52_4588.method1208(i);
		if (i_9_ != -32768)
			method1854(-5, -101, 81);
		Class83.aClass52_1339.method1208(i);
	}

	public void method1792(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, long l) {
		Class133_Sub7 class133_sub7 = method1850(-126);
		if (class133_sub7 != null) {
			class133_sub7.method1792(i, i_10_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, l);
			anInt3670 = class133_sub7.method1781();
		}
	}

	public static void method1854(int i, int i_17_, int i_18_) {
		RT4GL.method1630();
		BrowserControlUtil.hide();
		if (i_18_ >= 32) {
			Static.aFrame3962 = Class138.method1950(i_17_, 95, 0, i, Class14_Sub8_Sub34.aClass43_4647, 0);
			if (Static.aFrame3962 != null) {
				Static2.anInt2725 = i_17_;
				Class54.anInt887 = i;
				Class14_Sub8_Sub22.method595(257411150, Class14_Sub8_Sub34.aClass43_4647);
				Class14_Sub8_Sub30.method643(0, (byte) -82);
				Class14_Sub21.method897(110);
			} else
				Class14_Sub2_Sub20.method428(121);
		}
	}

	public Class133_Sub6(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
			int i_27_, int i_28_) {
		anInt3641 = 0;
		anInt3670 = -32768;
		anInt3669 = i_27_;
		anInt3658 = i_26_;
		anInt3644 = i_24_;
		aBoolean3643 = false;
		anInt3655 = i_19_;
		anInt3686 = i_20_;
		anInt3679 = i_23_;
		anInt3652 = i;
		anInt3682 = i_25_;
		anInt3685 = i_22_;
		anInt3683 = i_21_;
		anInt3667 = i_28_;
		int i_29_ = Class127.method1749(anInt3652, (byte) 66).anInt966;
		if (i_29_ != -1)
			aClass46_3638 = Static.method1129(i_29_, -124);
		else
			aClass46_3638 = null;
	}
}
