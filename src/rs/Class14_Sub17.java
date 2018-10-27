/* Class14_Sub17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Cache;
import com.jagex.link.Linkable;
import com.jagex.rt4.AbstractSprite_Sub1;

public class Class14_Sub17 extends Linkable {
	public static Class87 aClass87_3004;
	public static Class124 aClass124_3006 = Class124.method263("May");
	public static Class124 aClass124_3008;
	public static Class124 aClass124_3009;
	public static Class124 aClass124_3010 = Class124.method263("Sep");
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
		aClass124_3015 = Class124.method263("Aug");
		aClass124_3019 = Class124.method263("Clientscript error in: ");
		aClass124_3008 = Class124.method263("Nov");
		anInt3020 = 0;
		aClass124_3016 = Class124.method263("Oct");
		aClass124_3009 = Class124.method263("Apr");
		aClass124_3024 = Class124.method263("Dec");
		aClass124_3027 = Class124.method263("Jun");
		aClass124_3014 = Class124.method263(")4g");
		aClass124_3029 = Class124.method263("Jul");
		aClass124_3028 = Class124.method263("Loading interfaces )2 ");
		aClass124_3022 = Class124.method263("Feb");
		aClass124_3017 = Class124.method263("Jan");
		anInt3012 = 0;
		aClass124_3031 = Class124.method263("Mar");
		aClass124_3026 = Class124.method263("<col=00ff80>");
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
			int i_1_ = Static2.spriteHeights[i_0_] * Class17.spriteWidths[i_0_];
			int[] is_2_ = new int[i_1_];
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
				is_2_[i_3_] = (JunkTex.spritePalette[JunkTex.method617(255, is[i_3_])]);
			class14_sub2_sub19_sub1s[i_0_] = new AbstractSprite_Sub1(Class14_Sub11.spriteTrimWidth,
					Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_0_], (Class14_Sub2_Sub12.spriteYOffsets[i_0_]),
					Class17.spriteWidths[i_0_], Static2.spriteHeights[i_0_], is_2_);
		}
		Static2.method1761((byte) 123);
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

	public Class14_Sub17(byte[] is) {
		aByteArray3011 = is;
	}
}
