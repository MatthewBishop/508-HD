/* Class14_Sub30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.HDTile;

public class Class14_Sub30 extends Linkable {
	public static byte aByte3283;

	public static Class124 aClass124_3278 = Class124.method263("wishes to trade with you)3");
	public static Class124 aClass124_3281 = Class124.method263("Mitglieder)2Welt");
	public static Class124 aClass124_3274 = aClass124_3278;
	public static HDTile[][] aClass14_Sub27ArrayArray3273;
	public static HashTable aClass55_3275 = new HashTable(8);
	public static int anInt3271;
	public static int spriteTrimHeight;

	public static void method940(Class153 class153, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_,
			boolean bool) {
		int i_9_;
		int i_8_ = i_9_ = (i_6_ << 7) - Class4.cameraX;
		int i_11_;
		int i_10_ = i_11_ = (i_7_ << 7) - Static2.cameraZ;
		int i_13_;
		int i_12_ = i_13_ = i_8_ + 128;
		int i_15_;
		int i_14_ = i_15_ = i_10_ + 128;
		int i_16_ = Static2.tileHeights[i][i_6_][i_7_] - Static2.cameraY;
		int i_17_ = Static2.tileHeights[i][i_6_ + 1][i_7_] - Static2.cameraY;
		int i_18_ = Static2.tileHeights[i][i_6_ + 1][i_7_ + 1] - Static2.cameraY;
		int i_19_ = Static2.tileHeights[i][i_6_][i_7_ + 1] - Static2.cameraY;
		int i_20_ = i_10_ * i_4_ + i_8_ * i_5_ >> 16;
		i_10_ = i_10_ * i_5_ - i_8_ * i_4_ >> 16;
		i_8_ = i_20_;
		i_20_ = i_16_ * i_3_ - i_10_ * i_2_ >> 16;
		i_10_ = i_16_ * i_2_ + i_10_ * i_3_ >> 16;
		i_16_ = i_20_;
		if (i_10_ >= 50) {
			i_20_ = i_11_ * i_4_ + i_12_ * i_5_ >> 16;
			i_11_ = i_11_ * i_5_ - i_12_ * i_4_ >> 16;
			i_12_ = i_20_;
			i_20_ = i_17_ * i_3_ - i_11_ * i_2_ >> 16;
			i_11_ = i_17_ * i_2_ + i_11_ * i_3_ >> 16;
			i_17_ = i_20_;
			if (i_11_ >= 50) {
				i_20_ = i_14_ * i_4_ + i_13_ * i_5_ >> 16;
				i_14_ = i_14_ * i_5_ - i_13_ * i_4_ >> 16;
				i_13_ = i_20_;
				i_20_ = i_18_ * i_3_ - i_14_ * i_2_ >> 16;
				i_14_ = i_18_ * i_2_ + i_14_ * i_3_ >> 16;
				i_18_ = i_20_;
				if (i_14_ >= 50) {
					i_20_ = i_15_ * i_4_ + i_9_ * i_5_ >> 16;
					i_15_ = i_15_ * i_5_ - i_9_ * i_4_ >> 16;
					i_9_ = i_20_;
					i_20_ = i_19_ * i_3_ - i_15_ * i_2_ >> 16;
					i_15_ = i_19_ * i_2_ + i_15_ * i_3_ >> 16;
					i_19_ = i_20_;
					if (i_15_ >= 50) {
						int i_21_ = SDRaster.anInt118 + (i_8_ << 9) / i_10_;
						int i_22_ = SDRaster.anInt110 + (i_16_ << 9) / i_10_;
						int i_23_ = SDRaster.anInt118 + (i_12_ << 9) / i_11_;
						int i_24_ = SDRaster.anInt110 + (i_17_ << 9) / i_11_;
						int i_25_ = SDRaster.anInt118 + (i_13_ << 9) / i_14_;
						int i_26_ = SDRaster.anInt110 + (i_18_ << 9) / i_14_;
						int i_27_ = SDRaster.anInt118 + (i_9_ << 9) / i_15_;
						int i_28_ = SDRaster.anInt110 + (i_19_ << 9) / i_15_;
						SDRaster.anInt116 = 0;
						if (((i_25_ - i_27_) * (i_24_ - i_28_) - (i_26_ - i_28_) * (i_23_ - i_27_)) > 0
								&& Class142.aBoolean2299
								&& (JunkTex.method549(Static2.anInt3073 + SDRaster.anInt118,
										Static2.anInt3334 + SDRaster.anInt110, i_26_, i_28_, i_24_, i_25_, i_27_,
										i_23_))) {
							Class66.anInt1039 = i_6_;
							JunkTex.anInt4636 = i_7_;
						}
						if (((i_21_ - i_23_) * (i_28_ - i_24_) - (i_22_ - i_24_) * (i_27_ - i_23_)) > 0
								&& Class142.aBoolean2299
								&& (JunkTex.method549(Static2.anInt3073 + SDRaster.anInt118,
										Static2.anInt3334 + SDRaster.anInt110, i_22_, i_24_, i_28_, i_21_, i_23_,
										i_27_))) {
							Class66.anInt1039 = i_6_;
							JunkTex.anInt4636 = i_7_;
						}
					}
				}
			}
		}
	}

	public static void method941(byte i) {
		Static2.aClass52_2406.clearSoftReference();
		JunkTex.aClass52_4588.clearSoftReference();
		if (i == 11)
			Class83.aClass52_1339.clearSoftReference();
	}

	public static void method942(int i) {
		aClass124_3281 = null;
		aClass124_3274 = null;
		aClass55_3275 = null;
		if (i != 8)
			method940(null, -60, 80, -16, -90, -43, -65, -108, false);
		aClass14_Sub27ArrayArray3273 = null;
		aClass124_3278 = null;
	}

	public Class124 aClass124_3270;

	public Class14_Sub30() {
		/* empty */
	}

	public Class14_Sub30(Class124 class124) {
		aClass124_3270 = class124;
	}
}
