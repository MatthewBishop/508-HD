/* Class56 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.map.Scenegraph;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1_Sub1;

public class Class56 {
	public static int[] anIntArray913;
	public static Class124 aClass124_914 = Class14_Sub2_Sub2.method263(1178,
			"Please wait )2 attempting to reestablish)3");
	public static int[] anIntArray917;
	public static int anInt918;
	public static Class124[] aClass124Array919;
	public static Class49 aClass49_922;
	public static Class124 aClass124_923;

	static {
		anIntArray913 = new int[25];
		anInt918 = 0;
		aClass124Array919 = new Class124[8];
		aClass124_923 = aClass124_914;
		aClass49_922 = new Class49();
	}

	public static void method1237(int i) {
		aClass124_923 = null;
		aClass49_922 = null;
		anIntArray917 = null;
		if (i == 1232386310) {
			anIntArray913 = null;
			aClass124Array919 = null;
			aClass124_914 = null;
		}
	}

	public static void method1238(int i, boolean bool) {
		int i_0_;
		byte[][] is;
		if (bool) {
			i_0_ = 1;
			is = Class14_Sub2_Sub12.aByteArrayArray3913;
		} else {
			i_0_ = 4;
			is = Class5.aByteArrayArray139;
		}
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			Class138.method1946(139);
			for (int i_2_ = 0; i_2_ < 13; i_2_++) {
				for (int i_3_ = 0; i_3_ < 13; i_3_++) {
					int i_4_ = Class7.anIntArrayArrayArray169[i_1_][i_2_][i_3_];
					boolean bool_5_ = false;
					if (i_4_ != -1) {
						int i_6_ = i_4_ >> 56 & 0x3;
						if (!bool || i_6_ == 0) {
							int i_7_ = i_4_ >> 33 & 0x3;
							int i_8_ = (i_4_ & 0xffc245) >> 46;
							int i_9_ = (i_4_ & 0x3ffd) >> 35;
							int i_10_ = (i_8_ / 8 << 40) + i_9_ / 8;
							for (int i_11_ = 0; JunkTex.anIntArray2858.length > i_11_; i_11_++) {
								if (JunkTex.anIntArray2858[i_11_] == i_10_ && is[i_11_] != null) {
									bool_5_ = true;
									Class133_Sub3.method1833(bool, i_2_ * 8, i_7_, is[i_11_], i_1_, i_3_ * 8,
											(byte) -123, i_6_, (i_8_ & 0x7) * 8, (i_9_ & 0x7) * 8,
											Class14_Sub21.aClass32Array3100);
									break;
								}
							}
						}
					}
					if (!bool_5_)
						Class107.method1547(i_1_, i_3_ * 8, i_2_ * 8, 8, 8, false);
				}
			}
		}
	}

	public static Class14_Sub2_Sub19_Sub1 method1239(int i) {
		byte[] is = Class12.aByteArrayArray310[0];
		int i_12_ = Class76.anIntArray1204[i] * Class17.anIntArray402[0];
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1;
		if (JunkTex.aBooleanArray3416[0]) {
			int[] is_13_ = new int[i_12_];
			byte[] is_14_ = Class98.aByteArrayArray1667[0];
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++)
				is_13_[i_15_] = (Class66.method1294(JunkTex.method617(-16777216, is_14_[i_15_] << 56),
						(JunkTex.anIntArray1114[JunkTex.method617(is[i_15_], 255)])));
			class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1_Sub1(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[0], (Class14_Sub2_Sub12.anIntArray3918[0]), Class17.anIntArray402[0],
					Class76.anIntArray1204[0], is_13_);
		} else {
			int[] is_16_ = new int[i_12_];
			for (int i_17_ = 0; i_17_ < i_12_; i_17_++)
				is_16_[i_17_] = (JunkTex.anIntArray1114[JunkTex.method617(is[i_17_], 255)]);
			class14_sub2_sub19_sub1 = new Class14_Sub2_Sub19_Sub1(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[0], (Class14_Sub2_Sub12.anIntArray3918[0]), Class17.anIntArray402[0],
					Class76.anIntArray1204[0], is_16_);
		}
		Class129.method1761((byte) 83);
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_18_ = class14_sub2_sub19_sub1;
		return class14_sub2_sub19_sub1_18_;
	}

	public static void method1240() {
		for (int i = 0; i < Class83.anInt1338; i++) {
			for (int i_19_ = 0; i_19_ < Static2.anInt3338; i_19_++) {
				for (int i_20_ = 0; i_20_ < JunkTex.anInt4337; i_20_++)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_19_][i_20_] = null;
			}
		}
		for (int i = 0; i < Scenegraph.clusterCount; i++)
			Scenegraph.clusters[i] = null;
		Scenegraph.clusterCount = 0;
		for (int i = 0; i < JunkTex.anInt4727; i++)
			Class14_Sub20.aClass40Array3093[i] = null;
		JunkTex.anInt4727 = 0;
		for (int i = 0; i < JunkTex.aClass40Array4143.length; i++)
			JunkTex.aClass40Array4143[i] = null;
	}
}
