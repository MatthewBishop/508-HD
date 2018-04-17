/* Class14_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Cache;
import com.jagex.link.Linkable;
import com.jagex.rt4.HDTile;
import com.jagex.rt4.AbstractSprite_Sub1;

public class Class14_Sub17 extends Linkable {
	public static Class87 aClass87_3004;
	public static Class124 aClass124_3006 = Class124.method263(1178, "May");
	public static Class124 aClass124_3008;
	public static Class124 aClass124_3009;
	public static Class124 aClass124_3010 = Class124.method263(1178, "Sep");
	public byte[] aByteArray3011;
	public static int anInt3012;
	public static Class124 aClass124_3014;
	public static Class124 aClass124_3015;
	public static Class124 aClass124_3016;
	public static Class124 aClass124_3017;
	public static Cache aClass20_3018;
	public static Class124 aClass124_3019;
	public static int anInt3020;
	public static Class9_Sub1 aClass9_Sub1_3021;
	public static Class124 aClass124_3022;
	public static float aFloat3023;
	public static Class124 aClass124_3024;
	public static Class124[] aClass124Array3025;
	public static Class124 aClass124_3026;
	public static Class124 aClass124_3027;
	public static Class124 aClass124_3028;
	public static Class124 aClass124_3029;
	public static Class124 aClass124_3031;
	public static int anInt3032;
	public static Class124 aClass124_3033;
	public static Class9 aClass9_3034;

	static {
		aClass124_3015 = Class124.method263(1178, "Aug");
		aClass124_3019 = Class124.method263(1178, "Clientscript error in: ");
		aClass124_3008 = Class124.method263(1178, "Nov");
		anInt3020 = 0;
		aClass124_3016 = Class124.method263(1178, "Oct");
		aClass124_3009 = Class124.method263(1178, "Apr");
		aClass124_3024 = Class124.method263(1178, "Dec");
		aClass124_3027 = Class124.method263(1178, "Jun");
		aClass124_3014 = Class124.method263(1178, ")4g");
		aClass124_3029 = Class124.method263(1178, "Jul");
		aClass124_3028 = Class124.method263(1178, "Loading interfaces )2 ");
		aClass124_3022 = Class124.method263(1178, "Feb");
		aClass124_3017 = Class124.method263(1178, "Jan");
		anInt3012 = 0;
		aClass124_3031 = Class124.method263(1178, "Mar");
		aClass124_3026 = Class124.method263(1178, "<col=00ff80>");
		aClass124_3033 = aClass124_3028;
		aClass124Array3025 = new Class124[] { aClass124_3017, aClass124_3022, aClass124_3031, aClass124_3009,
				aClass124_3006, aClass124_3027, aClass124_3029, aClass124_3015, aClass124_3010, aClass124_3016,
				aClass124_3008, aClass124_3024 };
		aClass20_3018 = new Cache(64);
	}

	public static AbstractSprite_Sub1[] method878(byte i) {
		if (i > -104) {
			AbstractSprite_Sub1[] class14_sub2_sub19_sub1s = null;
			return class14_sub2_sub19_sub1s;
		}
		AbstractSprite_Sub1[] class14_sub2_sub19_sub1s = new AbstractSprite_Sub1[Class32.spriteAmount];
		for (int i_0_ = 0; i_0_ < Class32.spriteAmount; i_0_++) {
			byte[] is = Class12.spritePaletteIndicators[i_0_];
			int i_1_ = Class76.spriteHeights[i_0_] * Class17.spriteWidths[i_0_];
			int[] is_2_ = new int[i_1_];
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
				is_2_[i_3_] = (JunkTex.spritePalette[JunkTex.method617(255, is[i_3_])]);
			class14_sub2_sub19_sub1s[i_0_] = new AbstractSprite_Sub1(Class14_Sub11.spriteTrimWidth,
					Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_0_], (Class14_Sub2_Sub12.spriteYOffsets[i_0_]),
					Class17.spriteWidths[i_0_], Class76.spriteHeights[i_0_], is_2_);
		}
		Class129.method1761((byte) 123);
		AbstractSprite_Sub1[] class14_sub2_sub19_sub1s_4_ = class14_sub2_sub19_sub1s;
		return class14_sub2_sub19_sub1s_4_;
	}

	public static void method880(int i) {
		aClass87_3004 = null;
		aClass124_3024 = null;
		aClass20_3018 = null;
		aClass124_3010 = null;
		aClass9_3034 = null;
		aClass124_3026 = null;
		aClass124_3009 = null;
		aClass124_3027 = null;
		aClass124_3014 = null;
		aClass124_3028 = null;
		aClass124_3008 = null;
		aClass124_3017 = null;
		aClass124_3019 = null;
		aClass124_3031 = null;
		aClass124_3022 = null;
		aClass124_3033 = null;
		aClass124Array3025 = null;
		aClass124_3029 = null;
		aClass124_3006 = null;
		aClass124_3016 = null;
		aClass124_3015 = null;
		aClass9_Sub1_3021 = null;
	}

	public static int method881(int i, int i_18_, HDTile class14_sub27, byte i_19_, int i_20_, int i_21_,
			int i_22_, boolean bool, float[][] fs, float[][] fs_23_, int i_24_, int i_25_, float[][] fs_26_, int[][] is,
			float f, int[][] is_27_, int i_28_, int i_29_) {
		if (i_22_ != 1) {
			if (i_22_ == 2) {
				i_24_ = -i_24_ + 128;
				i_29_ = -i_29_ + 128;
			} else if (i_22_ == 3) {
				int i_30_ = i_29_;
				i_29_ = 128 - i_24_;
				i_24_ = i_30_;
			}
		} else {
			int i_31_ = i_29_;
			i_29_ = i_24_;
			i_24_ = 128 - i_31_;
		}
		int i_32_;
		float f_33_;
		float f_34_;
		float f_35_;
		if (i_29_ == 0 && i_24_ == 0) {
			f_35_ = fs[i_28_][i_25_];
			i_32_ = i_21_;
			f_33_ = fs_26_[i_28_][i_25_];
			f_34_ = fs_23_[i_28_][i_25_];
		} else if (i_29_ != 128 || i_24_ != 0) {
			if (i_29_ == 128 && i_24_ == 128) {
				i_32_ = i_18_;
				f_33_ = fs_26_[i_28_ + 1][i_25_ + 1];
				f_34_ = fs_23_[i_28_ + 1][i_25_ + 1];
				f_35_ = fs[i_28_ + 1][i_25_ + 1];
			} else if (i_29_ != 0 || i_24_ != 128) {
				f_33_ = fs_26_[i_28_][i_25_];
				float f_36_ = i_29_ / 128.0F;
				f_34_ = fs_23_[i_28_][i_25_];
				f_33_ += f_36_ * (-f_33_ + fs_26_[i_28_ + 1][i_25_]);
				float f_37_ = i_24_ / 128.0F;
				float f_38_ = fs_26_[i_28_][i_25_ + 1];
				f_35_ = fs[i_28_][i_25_];
				f_34_ += f_36_ * (fs_23_[i_28_ + 1][i_25_] - f_34_);
				float f_39_ = fs_23_[i_28_][i_25_ + 1];
				f_35_ += f_36_ * (-f_35_ + fs[i_28_ + 1][i_25_]);
				f_39_ += f_36_ * (-f_39_ + fs_23_[i_28_ + 1][i_25_ + 1]);
				f_38_ += f_36_ * (-f_38_ + fs_26_[i_28_ + 1][i_25_ + 1]);
				f_33_ += (f_38_ - f_33_) * f_37_;
				f_34_ += (f_39_ - f_34_) * f_37_;
				float f_40_ = fs[i_28_][i_25_ + 1];
				f_40_ += (-f_40_ + fs[i_28_ + 1][i_25_ + 1]) * f_36_;
				int i_41_ = Class14_Sub3.method450(5030, i_20_, i_29_, i_21_);
				int i_42_ = Class14_Sub3.method450(5030, i_18_, i_29_, i);
				f_35_ += f_37_ * (f_40_ - f_35_);
				i_32_ = Class14_Sub3.method450(5030, i_42_, i_24_, i_41_);
			} else {
				f_34_ = fs_23_[i_28_][i_25_ + 1];
				f_33_ = fs_26_[i_28_][i_25_ + 1];
				f_35_ = fs[i_28_][i_25_ + 1];
				i_32_ = i;
			}
		} else {
			f_35_ = fs[i_28_ + 1][i_25_];
			f_34_ = fs_23_[i_28_ + 1][i_25_];
			f_33_ = fs_26_[i_28_ + 1][i_25_];
			i_32_ = i_20_;
		}
		if (i_19_ != 12) {
			int i_43_ = -22;
			return i_43_;
		}
		int i_44_ = JunkTex.method647(i_25_, -501955161, i_29_, i_24_, is_27_, i_28_);
		int i_45_ = (i_25_ << 7) + i_24_;
		int i_46_ = (i_28_ << 39) + i_29_;
		int i_47_ = (class14_sub27.method921(i_46_, i_44_, i_45_, f_33_, f_34_, f_35_, bool ? i_32_ & ~0xff : i_32_,
				(is == null ? 0.0F
						: (i_44_
								- JunkTex.method647(i_25_, i_19_ ^ ~0x1deb3a54, i_29_, i_24_, is, i_28_))
								/ f)));
		return i_47_;
	}

	public Class14_Sub17(byte[] is) {
		aByteArray3011 = is;
	}
}
