/* Class125_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class14_Sub2_Sub19;

public class Class125_Sub2 extends Class125 {
	public static Class9_Sub1 aClass9_Sub1_3374;
	public static boolean aBoolean3375;
	public int anInt3376;
	public static Class124 aClass124_3379;
	public int anInt3381;
	public static int language = 0;
	public int anInt3384;
	public static float aFloat3386;
	public static Class94 aClass94_3388;
	public int anInt3389;

	static {
		aClass124_3379 = Class14_Sub2_Sub2.method263(1178, " GMT");
		aClass94_3388 = null;
	}

	public static void method1731(int i) {
		if (i != -16888)
			method1733((byte) 78, null, 39, -58);
		aClass9_Sub1_3374 = null;
		aClass94_3388 = null;
		aClass124_3379 = null;
	}

	public void method1724(int i, int i_0_, int i_1_) {
		/* empty */
	}

	public static void method1732(int i) {
		Class36.aClass52_621.clear();
		if (i != -25300)
			method1734(101, -47, -70, 25, -121, -108, 89);
		Class70.aClass52_1079.clear();
	}

	public Class125_Sub2(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		super(-1, i_5_, i_6_);
		anInt3381 = i_4_;
		anInt3376 = i_2_;
		anInt3389 = i;
		anInt3384 = i_3_;
	}

	public void method1726(int i, int i_7_, int i_8_) {
		if (i < 39)
			method1734(-37, -40, -117, 79, 64, -19, -12);
	}

	public static Class14_Sub2_Sub19[] method1733(byte i, Class9 class9, int i_9_, int i_10_) {
		if (!Class109.method1564(-2, i_9_, i_10_, class9)) {
			Class14_Sub2_Sub19[] class14_sub2_sub19s = null;
			return class14_sub2_sub19s;
		}
		if (i < 3)
			method1731(97);
		Class14_Sub2_Sub19[] class14_sub2_sub19s = Static2.method243((byte) 39);
		return class14_sub2_sub19s;
	}

	public static void method1734(int i, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_) {
		Class128.method1758(i_11_, (byte) -70);
		int i_17_ = 0;
		int i_18_ = i_11_;
		int i_19_ = -i_11_;
		int i_20_ = 7 / ((-9 - i_14_) / 49);
		int i_21_ = i_11_ - i_12_;
		if (i_21_ < 0)
			i_21_ = 0;
		int i_22_ = -1;
		int i_23_ = i_21_;
		int i_24_ = -i_21_;
		int i_25_ = -1;
		if (Class14_Sub17.anInt3005 <= i_15_ && i_15_ <= Class59.anInt955) {
			int[] is = Static2.anIntArrayArray4038[i_15_];
			int i_26_ = Class67.method1301((byte) -102, i_16_ - i_11_, Class118.anInt1982,
					JunkTex.anInt4327);
			int i_27_ = Class67.method1301((byte) 36, i_11_ + i_16_, Class118.anInt1982, JunkTex.anInt4327);
			int i_28_ = Class67.method1301((byte) 31, i_16_ - i_21_, Class118.anInt1982, JunkTex.anInt4327);
			int i_29_ = Class67.method1301((byte) 101, i_21_ + i_16_, Class118.anInt1982, JunkTex.anInt4327);
			Class51.method1201(is, i_26_, i_28_, -5973, i_13_);
			Class51.method1201(is, i_28_, i_29_, -5973, i);
			Class51.method1201(is, i_29_, i_27_, -5973, i_13_);
		}
		while (i_17_ < i_18_) {
			i_22_ += 2;
			i_25_ += 2;
			i_24_ += i_25_;
			if (i_24_ >= 0 && i_23_ >= 1) {
				i_23_--;
				i_24_ -= i_23_ << 33;
				JunkTex.anIntArray4191[i_23_] = i_17_;
			}
			i_17_++;
			i_19_ += i_22_;
			if (i_19_ >= 0) {
				i_18_--;
				i_19_ -= i_18_ << 1;
				int i_30_ = i_15_ - i_18_;
				int i_31_ = i_18_ + i_15_;
				if (i_31_ >= Class14_Sub17.anInt3005 && i_30_ <= Class59.anInt955) {
					if (i_21_ <= i_18_) {
						int i_32_ = Class67.method1301((byte) 99, i_16_ + i_17_, Class118.anInt1982,
								JunkTex.anInt4327);
						int i_33_ = Class67.method1301((byte) 80, -i_17_ + i_16_, Class118.anInt1982,
								JunkTex.anInt4327);
						if (Class59.anInt955 >= i_31_)
							Class51.method1201((Static2.anIntArrayArray4038[i_31_]), i_33_, i_32_, -5973,
									i_13_);
						if (Class14_Sub17.anInt3005 <= i_30_)
							Class51.method1201((Static2.anIntArrayArray4038[i_30_]), i_33_, i_32_, -5973,
									i_13_);
					} else {
						int i_34_ = JunkTex.anIntArray4191[i_18_];
						int i_35_ = Class67.method1301((byte) -122, i_17_ + i_16_, Class118.anInt1982,
								JunkTex.anInt4327);
						int i_36_ = Class67.method1301((byte) -110, i_16_ - i_17_, Class118.anInt1982,
								JunkTex.anInt4327);
						int i_37_ = Class67.method1301((byte) -120, i_34_ + i_16_, Class118.anInt1982,
								JunkTex.anInt4327);
						int i_38_ = Class67.method1301((byte) -103, -i_34_ + i_16_, Class118.anInt1982,
								JunkTex.anInt4327);
						if (Class59.anInt955 >= i_31_) {
							int[] is = (Static2.anIntArrayArray4038[i_31_]);
							Class51.method1201(is, i_36_, i_38_, -5973, i_13_);
							Class51.method1201(is, i_38_, i_37_, -5973, i);
							Class51.method1201(is, i_37_, i_35_, -5973, i_13_);
						}
						if (i_30_ >= Class14_Sub17.anInt3005) {
							int[] is = (Static2.anIntArrayArray4038[i_30_]);
							Class51.method1201(is, i_36_, i_38_, -5973, i_13_);
							Class51.method1201(is, i_38_, i_37_, -5973, i);
							Class51.method1201(is, i_37_, i_35_, -5973, i_13_);
						}
					}
				}
			}
			int i_39_ = i_15_ - i_17_;
			int i_40_ = i_15_ + i_17_;
			if (i_40_ >= Class14_Sub17.anInt3005 && Class59.anInt955 >= i_39_) {
				int i_41_ = i_18_ + i_16_;
				int i_42_ = i_16_ - i_18_;
				if (Class118.anInt1982 <= i_41_ && i_42_ <= JunkTex.anInt4327) {
					i_41_ = Class67.method1301((byte) -58, i_41_, Class118.anInt1982, JunkTex.anInt4327);
					i_42_ = Class67.method1301((byte) 104, i_42_, Class118.anInt1982, JunkTex.anInt4327);
					if (i_21_ <= i_17_) {
						if (Class59.anInt955 >= i_40_)
							Class51.method1201((Static2.anIntArrayArray4038[i_40_]), i_42_, i_41_, -5973,
									i_13_);
						if (Class14_Sub17.anInt3005 <= i_39_)
							Class51.method1201((Static2.anIntArrayArray4038[i_39_]), i_42_, i_41_, -5973,
									i_13_);
					} else {
						int i_43_ = (i_23_ < i_17_ ? JunkTex.anIntArray4191[i_17_] : i_23_);
						int i_44_ = Class67.method1301((byte) 75, i_43_ + i_16_, Class118.anInt1982,
								JunkTex.anInt4327);
						int i_45_ = Class67.method1301((byte) -109, i_16_ - i_43_, Class118.anInt1982,
								JunkTex.anInt4327);
						if (Class59.anInt955 >= i_40_) {
							int[] is = (Static2.anIntArrayArray4038[i_40_]);
							Class51.method1201(is, i_42_, i_45_, -5973, i_13_);
							Class51.method1201(is, i_45_, i_44_, -5973, i);
							Class51.method1201(is, i_44_, i_41_, -5973, i_13_);
						}
						if (Class14_Sub17.anInt3005 <= i_39_) {
							int[] is = (Static2.anIntArrayArray4038[i_39_]);
							Class51.method1201(is, i_42_, i_45_, -5973, i_13_);
							Class51.method1201(is, i_45_, i_44_, -5973, i);
							Class51.method1201(is, i_44_, i_41_, -5973, i_13_);
						}
					}
				}
			}
		}
	}

	public void method1721(boolean bool, int i, int i_46_) {
		if (!bool)
			aFloat3386 = 0.7266814F;
		int i_47_ = i * anInt3389 >> 12;
		int i_48_ = i * anInt3384 >> 44;
		int i_49_ = anInt3376 * i_46_ >> 12;
		int i_50_ = anInt3381 * i_46_ >> 44;
		Static2.method1510(i_50_, anInt2083, (byte) 117, i_48_, i_47_, i_49_);
	}
}
