/* Class66 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.HDTile;

public class Class66 {
	public int anInt1035;
	public static Class124 aClass124_1037 = Class124.method263(1178, ":clan:");
	public int anInt1038;
	public static int anInt1039 = -1;
	public int anInt1041;
	public static Class124 aClass124_1042 = Class124.method263(1178, "Mem:");
	public int anInt1043 = -1;
	public int anInt1044;
	public static int anInt1045;
	public int anInt1046;
	public int anInt1047;
	public int anInt1049;
	public static int[][][] anIntArrayArrayArray135;
	public int anInt1051;

	public static int method1294(int i, int i_25_) {
		int i_26_ = i | i_25_;
		return i_26_;
	}

	public static void method1295(int i) {
		anIntArrayArrayArray135 = null;
		if (i != -597398239)
			method1295(-108);
		aClass124_1042 = null;
		aClass124_1037 = null;
	}

	public static void method1296(int i, int i_27_, int i_28_, int i_29_) {
		Class14_Sub14.aClass14_Sub29ArrayArrayArray2987 = new Class14_Sub29[i][i_27_][i_28_];
		JunkTex.anIntArrayArrayArray2391 = new int[i][i_27_ + 1][i_28_ + 1];
		Class14_Sub30.aClass14_Sub27ArrayArray3273 = new HDTile[4][];
		JunkTex.method627(false);
		Static2.anInt3338 = i_27_;
		JunkTex.anInt4337 = i_28_;
		JunkTex.anIntArrayArrayArray2724 = new int[i][i_27_ + 1][i_28_ + 1];
		Class56.method1240();
		JunkTex.anInt1108 = i_29_;
		Class53.visibilityMap = (new boolean[JunkTex.anInt1108 + JunkTex.anInt1108 + 1][JunkTex.anInt1108
				+ JunkTex.anInt1108 + 1]);
		JunkTex.aBooleanArrayArray4138 = (new boolean[JunkTex.anInt1108 + JunkTex.anInt1108
				+ 2][JunkTex.anInt1108 + JunkTex.anInt1108 + 2]);
	}

	public static void method1297(int i, Class12 class12, int i_30_, int i_31_, byte i_32_) {
		if (JunkTex.anInt4729 < 400) {
			if (class12.anIntArray329 != null)
				class12 = class12.method217((byte) -18);
			if (class12 != null && i_32_ >= 76 && class12.aBoolean308) {
				Class124 class124 = class12.aClass124_302;
				if (class12.anInt295 != 0)
					class124 = (JunkTex.method515(
							(new Class124[] { class124,
									Class153.method2047(1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937),
											class12.anInt295),
									JunkTex.aClass124_4360, Class48.aClass124_797,
									Class83.method1407(76, class12.anInt295), JunkTex.aClass124_4552 }),
							(byte) -28));
				if (Class51.anInt831 != 1) {
					if (!Class14_Sub4.aBoolean2784) {
						Class124[] class124s = class12.aClass124Array291;
						if (Class49.aBoolean814)
							class124s = Static2.method1545(5, class124s);
						if (class124s != null) {
							for (int i_33_ = 4; i_33_ >= 0; i_33_--) {
								if (class124s[i_33_] != null && (Static2.anInt3749 != 0
										|| !(class124s[i_33_].method1717(40, Class118.aClass124_1973)))) {
									short i_34_ = 0;
									if (i_33_ == 0)
										i_34_ = (short) 2;
									if (i_33_ == 1)
										i_34_ = (short) 11;
									if (i_33_ == 2)
										i_34_ = (short) 31;
									if (i_33_ == 3)
										i_34_ = (short) 14;
									if (i_33_ == 4)
										i_34_ = (short) 50;
									Class14_Sub11
											.method853(32, class124s[i_33_], i,
													(JunkTex.method515(new Class124[] {
															(JunkTex.aClass124_4694), class124 },
													(byte) -93)), i_34_, i_31_, i_30_);
								}
							}
						}
						if (Static2.anInt3749 == 0 && class124s != null) {
							for (int i_35_ = 4; i_35_ >= 0; i_35_--) {
								if (class124s[i_35_] != null
										&& (class124s[i_35_].method1717(40, Class118.aClass124_1973))) {
									short i_36_ = 0;
									short i_37_ = 0;
									if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937) < class12.anInt295)
										i_36_ = (short) 2000;
									if (i_35_ == 0)
										i_37_ = (short) 2;
									if (i_35_ == 1)
										i_37_ = (short) 11;
									if (i_35_ == 2)
										i_37_ = (short) 31;
									if (i_35_ == 3)
										i_37_ = (short) 14;
									if (i_35_ == 4)
										i_37_ = (short) 50;
									if (i_37_ != 0)
										i_37_ += i_36_;
									Class14_Sub11
											.method853(32, class124s[i_35_], i,
													(JunkTex.method515(new Class124[] {
															(JunkTex.aClass124_4694), class124 },
													(byte) -97)), i_37_, i_31_, i_30_);
								}
							}
						}
						Class14_Sub11.method853(32, JunkTex.aClass124_2802, i,
								JunkTex.method515(
										(new Class124[] { (JunkTex.aClass124_4694), class124 }), (byte) -96),
								(short) 1002, i_31_, i_30_);
					} else if ((JunkTex.anInt101 & 0x2) == 2)
						Class14_Sub11.method853(32, JunkTex.aClass124_2082, i,
								JunkTex.method515((new Class124[] { (Class17.aClass124_408),
										(Static2.aClass124_3724), class124 }), (byte) -83),
								(short) 34, i_31_, i_30_);
				} else
					Class14_Sub11.method853(32, Class40.aClass124_665, i,
							(JunkTex.method515((new Class124[] { JunkTex.aClass124_2809,
									(Static2.aClass124_3724), class124 }), (byte) -123)),
							(short) 30, i_31_, i_30_);
			}
		}
	}
}
