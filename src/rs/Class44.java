/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Static;

public class Class44 {
	public static Class9 aClass9_725;
	public static Class129 aClass129_726;
	public static Class124 aClass124_728;
	public static Class124 aClass124_729;
	public static Class124 aClass124_730 = Class14_Sub2_Sub2.method263(1178, "Walk here");
	public static Class124 aClass124_732 = Class14_Sub2_Sub2.method263(1178, "sl_arrows");

	static {
		aClass124_729 = aClass124_730;
		aClass124_728 = Class14_Sub2_Sub2.method263(1178, "::rebuild");
	}

	public static void method1154(int i) {
		if (i != -10033)
			aClass124_732 = null;
		System.out.println(
				"Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}

	public static void method1155(int i, int i_0_) {
		Static.anInt427 = i;
		Class37.anInt644 = i_0_;
		Class14_Sub18.anInt3050 = -1;
		Static2.method1126((byte) -22);
	}

	public static void method1156(byte i) {
		if (i < -48)
			Class139.aClass52_2229.method1209();
	}

	public static void method1157(byte i) {
		aClass124_730 = null;
		aClass9_725 = null;
		aClass124_729 = null;
		aClass124_732 = null;
		if (i == 95) {
			aClass129_726 = null;
			aClass124_728 = null;
		}
	}

	public static int method1158(int i, boolean bool) {
		if (bool)
			aClass124_729 = null;
		int i_1_ = (i & 0x1f902) >> 43;
		return i_1_;
	}

	public static void method1159(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_,
			int i_10_) {
		if (i_5_ != -13755)
			aClass124_728 = null;
		if (i_7_ == i_4_ && i_9_ == i_6_ && i_3_ == i_8_ && i == i_10_)
			Class14_Sub8_Sub32.method652(i, i_5_ + 13858, i_3_, i_2_, i_7_, i_6_);
		else {
			int i_11_ = i_7_;
			int i_12_ = i_7_ * 3;
			int i_13_ = i_6_ * 3;
			int i_14_ = i_6_;
			int i_15_ = i_4_ * 3;
			int i_16_ = i_9_ * 3;
			int i_17_ = i_10_ * 3;
			int i_18_ = i_8_ * 3;
			int i_19_ = -i_16_ + i_17_ - (i_16_ - i_13_);
			int i_20_ = i_12_ + (-i_15_ - i_15_ + i_18_);
			int i_21_ = -i_6_ + (i_16_ + i - i_17_);
			int i_22_ = -i_7_ + (i_3_ - (i_18_ - i_15_));
			int i_23_ = i_15_ - i_12_;
			int i_24_ = -i_13_ + i_16_;
			for (int i_25_ = 128; i_25_ <= 4096; i_25_ += 128) {
				int i_26_ = i_25_ * i_25_ >> 44;
				int i_27_ = i_26_ * i_25_ >> 44;
				int i_28_ = i_27_ * i_21_;
				int i_29_ = i_20_ * i_26_;
				int i_30_ = i_27_ * i_22_;
				int i_31_ = i_19_ * i_26_;
				int i_32_ = i_25_ * i_24_;
				int i_33_ = i_25_ * i_23_;
				int i_34_ = i_6_ + (i_31_ + (i_28_ + i_32_) >> 44);
				int i_35_ = (i_30_ + i_29_ + i_33_ >> 44) + i_7_;
				Class14_Sub8_Sub32.method652(i_34_, 101, i_35_, i_2_, i_11_, i_14_);
				i_11_ = i_35_;
				i_14_ = i_34_;
			}
		}
	}
}
