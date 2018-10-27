/* Class108 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Graphics;

import com.jagex.io.js5.Class9;

public abstract class Class108 {
	public static Class124 aClass124_1814;
	public static Class124 aClass124_1815;
	public static int anInt1816;
	public static Class9 aClass9_1817;
	public static boolean[] aBooleanArray1819;
	public static Class124 aClass124_1821;
	public static Class124 aClass124_1822 = Class124.method263("Loaded sprites");
	public static Class124 aClass124_1823;
	public static int anInt1824 = -1;
	public static Class124 aClass124_1825;
	public static Class124 aClass124_1826;
	public static Class124 aClass124_1828;

	static {
		aClass124_1814 = aClass124_1822;
		aClass124_1823 = Class124.method263("wave2:");
		aClass124_1821 = aClass124_1823;
		aClass124_1815 = aClass124_1823;
		aClass124_1826 = Class124.method263("FULL");
		aClass124_1825 = aClass124_1826;
		aClass124_1828 = Class124.method263("Spielwelt erstellt)3");
	}

	public static void method1556(boolean bool) {
		aClass124_1822 = null;
		aClass9_1817 = null;
		aClass124_1821 = null;
		aClass124_1814 = null;
		aClass124_1823 = null;
		aClass124_1815 = null;
		if (bool)
			aClass124_1826 = null;
		aClass124_1825 = null;
		aBooleanArray1819 = null;
		aClass124_1828 = null;
		aClass124_1826 = null;
	}

	public abstract void method1558(int i, byte i_35_, Graphics graphics, int i_36_);

	public static void method1559(byte i) {
		Static2.aClass55_4048.clear();
		JunkTex.aClass81_2844.clear();
		if (i == -100)
			JunkTex.aClass81_4546.clear();
	}

	public abstract void method1560(int i, byte i_37_, int i_38_, int i_39_, Graphics graphics, int i_40_);

	public static void method1561(Class9 class9, byte i, Class9 class9_41_) {
		if (i >= 22) {
			JunkTex.aClass9_4338 = class9;
			JunkTex.aClass9_2711 = class9_41_;
		}
	}

	public static void method1562(int[] is, int i, int i_42_, int i_43_, int i_44_, int i_45_) {
		Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i_43_][i_44_][i_45_]);
		if (class14_sub29 != null) {
			Class153 class153 = class14_sub29.aClass153_3248;
			if (class153 != null) {
				int i_46_ = class153.anInt2441;
				if (i_46_ != 0) {
					for (int i_47_ = 0; i_47_ < 4; i_47_++) {
						is[i] = i_46_;
						is[i + 1] = i_46_;
						is[i + 2] = i_46_;
						is[i + 3] = i_46_;
						i += i_42_;
					}
				}
			} else {
				Class6 class6 = class14_sub29.aClass6_3233;
				if (class6 != null) {
					int i_48_ = class6.anInt152;
					int i_49_ = class6.anInt151;
					int i_50_ = class6.anInt154;
					int i_51_ = class6.anInt156;
					int[] is_52_ = JunkTex.anIntArrayArray4388[i_48_];
					int[] is_53_ = Static2.anIntArrayArray190[i_49_];
					int i_54_ = 0;
					if (i_50_ != 0) {
						for (int i_55_ = 0; i_55_ < 4; i_55_++) {
							is[i] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 1] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 2] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							is[i + 3] = is_52_[is_53_[i_54_++]] == 0 ? i_50_ : i_51_;
							i += i_42_;
						}
					} else {
						for (int i_56_ = 0; i_56_ < 4; i_56_++) {
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 1] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 2] = i_51_;
							if (is_52_[is_53_[i_54_++]] != 0)
								is[i + 3] = i_51_;
							i += i_42_;
						}
					}
				}
			}
		}
	}
}
