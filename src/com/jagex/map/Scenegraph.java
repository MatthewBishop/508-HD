/* Scenegraph - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.map;

import rs.Class102;
import rs.Class104;
import rs.Class114;
import rs.Class133_Sub6;
import rs.Class142;
import rs.Class14_Sub2_Sub8;
import rs.Class21;
import rs.Class4;
import rs.Class53;
import rs.Class67;
import rs.Class98;
import rs.JunkTex;
import rs.Static2;

public class Scenegraph {
	public static SceneCluster[] clusters = new SceneCluster[500];
	public static int clusterCount;
	public static SceneCluster[] activeOccluders = new SceneCluster[500];

	public static void method120(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		SceneCluster scenecluster = new SceneCluster();
		scenecluster.minTileX = i_0_ / 128;
		scenecluster.maxTileX = i_1_ / 128;
		scenecluster.minTileZ = i_2_ / 128;
		scenecluster.maxTileZ = i_3_ / 128;
		scenecluster.type = i;
		scenecluster.minX = i_0_;
		scenecluster.maxX = i_1_;
		scenecluster.minZ = i_2_;
		scenecluster.maxZ = i_3_;
		scenecluster.minY = i_4_;
		scenecluster.maxY = i_5_;
		clusters[clusterCount++] = scenecluster;
	}

	public static void destroy() {
		activeOccluders = null;
		clusters = null;
	}

	public static void method1503() {
		Class133_Sub6.activeOccluderCount = 0;
		while_175_: 
		for (int i = 0; i < clusterCount; i++) {
			SceneCluster scenecluster = clusters[i];
			if (Class21.occludersY != null) {
				for (int pos = 0; pos < Class21.occludersY.length; pos++) {
					if (Class21.occludersY[pos] != -1000000
							&& (scenecluster.minY <= Class21.occludersY[pos]
									|| (scenecluster.maxY <= Class21.occludersY[pos]))
							&& (scenecluster.minX <= Static2.occludersMaxX[pos]
									|| (scenecluster.maxX <= Static2.occludersMaxX[pos]))
							&& (scenecluster.minX >= Class98.occludersMinX[pos]
									|| (scenecluster.maxX >= Class98.occludersMinX[pos]))
							&& (scenecluster.minZ <= Class142.occludersMaxZ[pos]
									|| (scenecluster.maxZ <= Class142.occludersMaxZ[pos]))
							&& (scenecluster.minZ >= Class104.occludersMinZ[pos]
									|| (scenecluster.maxZ >= Class104.occludersMinZ[pos])))
						continue while_175_;
				}
			}
			if (scenecluster.type == 1) {
				int i_7_ = (scenecluster.minTileX - Static2.cameraTileX + JunkTex.anInt1108);
				if (i_7_ >= 0 && i_7_ <= JunkTex.anInt1108 + JunkTex.anInt1108) {
					int i_8_ = (scenecluster.minTileZ - Class102.cameraTileZ + JunkTex.anInt1108);
					if (i_8_ < 0)
						i_8_ = 0;
					int i_9_ = (scenecluster.maxTileZ - Class102.cameraTileZ + JunkTex.anInt1108);
					if (i_9_ > JunkTex.anInt1108 + JunkTex.anInt1108)
						i_9_ = JunkTex.anInt1108 + JunkTex.anInt1108;
					boolean bool = false;
					while_171_: do {
						do {
							if (i_8_ > i_9_)
								break while_171_;
						} while (!Class53.visibilityMap[i_7_][i_8_++]);
						bool = true;
					} while (false);
					if (bool) {
						int i_10_ = Class4.anInt125 - scenecluster.minX;
						if (i_10_ > 32)
							scenecluster.testDirection = 1;
						else {
							if (i_10_ >= -32)
								continue;
							scenecluster.testDirection = 2;
							i_10_ = -i_10_;
						}
						scenecluster.minNormalZ = (scenecluster.minZ - Class14_Sub2_Sub8.anInt3853 << 8) / i_10_;
						scenecluster.maxNormalZ = (scenecluster.maxZ - Class14_Sub2_Sub8.anInt3853 << 8) / i_10_;
						scenecluster.minNormalY = ((scenecluster.minY - Static2.anInt2741 << 8) / i_10_);
						scenecluster.maxNormalY = ((scenecluster.maxY - Static2.anInt2741 << 8) / i_10_);
						activeOccluders[Class133_Sub6.activeOccluderCount++] = scenecluster;
					}
				}
			} else if (scenecluster.type == 2) {
				int i_11_ = (scenecluster.minTileZ - Class102.cameraTileZ + JunkTex.anInt1108);
				if (i_11_ >= 0 && i_11_ <= JunkTex.anInt1108 + JunkTex.anInt1108) {
					int i_12_ = (scenecluster.minTileX - Static2.cameraTileX + JunkTex.anInt1108);
					if (i_12_ < 0)
						i_12_ = 0;
					int i_13_ = (scenecluster.maxTileX - Static2.cameraTileX + JunkTex.anInt1108);
					if (i_13_ > JunkTex.anInt1108 + JunkTex.anInt1108)
						i_13_ = JunkTex.anInt1108 + JunkTex.anInt1108;
					boolean bool = false;
					while_172_: do {
						do {
							if (i_12_ > i_13_)
								break while_172_;
						} while (!Class53.visibilityMap[i_12_++][i_11_]);
						bool = true;
					} while (false);
					if (bool) {
						int i_14_ = Class14_Sub2_Sub8.anInt3853 - scenecluster.minZ;
						if (i_14_ > 32)
							scenecluster.testDirection = 3;
						else {
							if (i_14_ >= -32)
								continue;
							scenecluster.testDirection = 4;
							i_14_ = -i_14_;
						}
						scenecluster.minNormalX = ((scenecluster.minX - Class4.anInt125 << 8) / i_14_);
						scenecluster.maxNormalX = ((scenecluster.maxX - Class4.anInt125 << 8) / i_14_);
						scenecluster.minNormalY = ((scenecluster.minY - Static2.anInt2741 << 8) / i_14_);
						scenecluster.maxNormalY = ((scenecluster.maxY - Static2.anInt2741 << 8) / i_14_);
						activeOccluders[Class133_Sub6.activeOccluderCount++] = scenecluster;
					}
				}
			} else if (scenecluster.type == 4) {
				int i_15_ = scenecluster.minY - Static2.anInt2741;
				if (i_15_ > 128) {
					int i_16_ = (scenecluster.minTileZ - Class102.cameraTileZ + JunkTex.anInt1108);
					if (i_16_ < 0)
						i_16_ = 0;
					int i_17_ = (scenecluster.maxTileZ - Class102.cameraTileZ + JunkTex.anInt1108);
					if (i_17_ > JunkTex.anInt1108 + JunkTex.anInt1108)
						i_17_ = JunkTex.anInt1108 + JunkTex.anInt1108;
					if (i_16_ <= i_17_) {
						int i_18_ = (scenecluster.minTileX - Static2.cameraTileX + JunkTex.anInt1108);
						if (i_18_ < 0)
							i_18_ = 0;
						int i_19_ = (scenecluster.maxTileX - Static2.cameraTileX + JunkTex.anInt1108);
						if (i_19_ > JunkTex.anInt1108 + JunkTex.anInt1108)
							i_19_ = JunkTex.anInt1108 + JunkTex.anInt1108;
						boolean bool = false;
						while_173_: for (int i_20_ = i_18_; i_20_ <= i_19_; i_20_++) {
							for (int i_21_ = i_16_; i_21_ <= i_17_; i_21_++) {
								if (Class53.visibilityMap[i_20_][i_21_]) {
									bool = true;
									break while_173_;
								}
							}
						}
						if (bool) {
							scenecluster.testDirection = 5;
							scenecluster.minNormalX = ((scenecluster.minX - Class4.anInt125 << 8) / i_15_);
							scenecluster.maxNormalX = ((scenecluster.maxX - Class4.anInt125 << 8) / i_15_);
							scenecluster.minNormalZ = ((scenecluster.minZ - Class14_Sub2_Sub8.anInt3853) << 8) / i_15_;
							scenecluster.maxNormalZ = ((scenecluster.maxZ - Class14_Sub2_Sub8.anInt3853) << 8) / i_15_;
							activeOccluders[Class133_Sub6.activeOccluderCount++] = scenecluster;
						}
					}
				}
			}
		}
	}

	public static boolean method1310(int i, int i_22_, int i_23_) {
		for (int i_24_ = 0; i_24_ < Class133_Sub6.activeOccluderCount; i_24_++) {
			SceneCluster scenecluster = activeOccluders[i_24_];
			if (scenecluster.testDirection == 1) {
				int i_25_ = scenecluster.minX - i;
				if (i_25_ > 0) {
					int i_26_ = (scenecluster.minZ + (scenecluster.minNormalZ * i_25_ >> 8));
					int i_27_ = (scenecluster.maxZ + (scenecluster.maxNormalZ * i_25_ >> 8));
					int i_28_ = (scenecluster.minY + (scenecluster.minNormalY * i_25_ >> 8));
					int i_29_ = (scenecluster.maxY + (scenecluster.maxNormalY * i_25_ >> 8));
					if (i_23_ >= i_26_ && i_23_ <= i_27_ && i_22_ >= i_28_ && i_22_ <= i_29_)
						return true;
				}
			} else if (scenecluster.testDirection == 2) {
				int i_30_ = i - scenecluster.minX;
				if (i_30_ > 0) {
					int i_31_ = (scenecluster.minZ + (scenecluster.minNormalZ * i_30_ >> 8));
					int i_32_ = (scenecluster.maxZ + (scenecluster.maxNormalZ * i_30_ >> 8));
					int i_33_ = (scenecluster.minY + (scenecluster.minNormalY * i_30_ >> 8));
					int i_34_ = (scenecluster.maxY + (scenecluster.maxNormalY * i_30_ >> 8));
					if (i_23_ >= i_31_ && i_23_ <= i_32_ && i_22_ >= i_33_ && i_22_ <= i_34_)
						return true;
				}
			} else if (scenecluster.testDirection == 3) {
				int i_35_ = scenecluster.minZ - i_23_;
				if (i_35_ > 0) {
					int i_36_ = (scenecluster.minX + (scenecluster.minNormalX * i_35_ >> 8));
					int i_37_ = (scenecluster.maxX + (scenecluster.maxNormalX * i_35_ >> 8));
					int i_38_ = (scenecluster.minY + (scenecluster.minNormalY * i_35_ >> 8));
					int i_39_ = (scenecluster.maxY + (scenecluster.maxNormalY * i_35_ >> 8));
					if (i >= i_36_ && i <= i_37_ && i_22_ >= i_38_ && i_22_ <= i_39_)
						return true;
				}
			} else if (scenecluster.testDirection == 4) {
				int i_40_ = i_23_ - scenecluster.minZ;
				if (i_40_ > 0) {
					int i_41_ = (scenecluster.minX + (scenecluster.minNormalX * i_40_ >> 8));
					int i_42_ = (scenecluster.maxX + (scenecluster.maxNormalX * i_40_ >> 8));
					int i_43_ = (scenecluster.minY + (scenecluster.minNormalY * i_40_ >> 8));
					int i_44_ = (scenecluster.maxY + (scenecluster.maxNormalY * i_40_ >> 8));
					if (i >= i_41_ && i <= i_42_ && i_22_ >= i_43_ && i_22_ <= i_44_)
						return true;
				}
			} else if (scenecluster.testDirection == 5) {
				int i_45_ = i_22_ - scenecluster.minY;
				if (i_45_ > 0) {
					int i_46_ = (scenecluster.minX + (scenecluster.minNormalX * i_45_ >> 8));
					int i_47_ = (scenecluster.maxX + (scenecluster.maxNormalX * i_45_ >> 8));
					int i_48_ = (scenecluster.minZ + (scenecluster.minNormalZ * i_45_ >> 8));
					int i_49_ = (scenecluster.maxZ + (scenecluster.maxNormalZ * i_45_ >> 8));
					if (i >= i_46_ && i <= i_47_ && i_23_ >= i_48_ && i_23_ <= i_49_)
						return true;
				}
			}
		}
		return false;
	}

	public static boolean method1478(int i, int i_46_, int i_47_, int i_48_) {
		if (!Scenegraph.method1529(i, i_46_, i_47_))
			return false;
		int i_49_ = i_46_ << 7;
		int i_50_ = i_47_ << 7;
		if (method1310(i_49_ + 1, (Class114.tileHeights[i][i_46_][i_47_] + i_48_), i_50_ + 1)
				&& method1310(i_49_ + 128 - 1, (Class114.tileHeights[i][i_46_ + 1][i_47_] + i_48_),
						i_50_ + 1)
				&& method1310(i_49_ + 128 - 1, (Class114.tileHeights[i][i_46_ + 1][i_47_ + 1]) + i_48_,
						i_50_ + 128 - 1)
				&& method1310(i_49_ + 1, (Class114.tileHeights[i][i_46_][i_47_ + 1] + i_48_),
						i_50_ + 128 - 1))
			return true;
		return false;
	}

	public static boolean method1529(int i, int i_7_, int i_8_) {
		int i_9_ = JunkTex.anIntArrayArrayArray2724[i][i_7_][i_8_];
		if (i_9_ == -Class67.anInt1059)
			return false;
		if (i_9_ == Class67.anInt1059)
			return true;
		int i_10_ = i_7_ << 7;
		int i_11_ = i_8_ << 7;
		if (method1310(i_10_ + 1, Class114.tileHeights[i][i_7_][i_8_], i_11_ + 1)
				&& method1310(i_10_ + 128 - 1, Class114.tileHeights[i][i_7_ + 1][i_8_], i_11_ + 1)
				&& method1310(i_10_ + 128 - 1, (Class114.tileHeights[i][i_7_ + 1][i_8_ + 1]),
						i_11_ + 128 - 1)
				&& method1310(i_10_ + 1, Class114.tileHeights[i][i_7_][i_8_ + 1], i_11_ + 128 - 1)) {
			JunkTex.anIntArrayArrayArray2724[i][i_7_][i_8_] = Class67.anInt1059;
			return true;
		}
		JunkTex.anIntArrayArrayArray2724[i][i_7_][i_8_] = -Class67.anInt1059;
		return false;
	}

	public static boolean method1530(int i, int i_12_, int i_13_, int i_14_) {
		if (!method1529(i, i_12_, i_13_))
			return false;
		int i_15_ = i_12_ << 7;
		int i_16_ = i_13_ << 7;
		int i_17_ = Class114.tileHeights[i][i_12_][i_13_] - 1;
		int i_18_ = i_17_ - 120;
		int i_19_ = i_17_ - 230;
		int i_20_ = i_17_ - 238;
		if (i_14_ < 16) {
			if (i_14_ == 1) {
				if (i_15_ > Class4.anInt125) {
					if (!method1310(i_15_, i_17_, i_16_))
						return false;
					if (!method1310(i_15_, i_17_, i_16_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1310(i_15_, i_18_, i_16_))
						return false;
					if (!method1310(i_15_, i_18_, i_16_ + 128))
						return false;
				}
				if (!method1310(i_15_, i_19_, i_16_))
					return false;
				if (!method1310(i_15_, i_19_, i_16_ + 128))
					return false;
				return true;
			}
			if (i_14_ == 2) {
				if (i_16_ < Class14_Sub2_Sub8.anInt3853) {
					if (!method1310(i_15_, i_17_, i_16_ + 128))
						return false;
					if (!method1310(i_15_ + 128, i_17_, i_16_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1310(i_15_, i_18_, i_16_ + 128))
						return false;
					if (!method1310(i_15_ + 128, i_18_, i_16_ + 128))
						return false;
				}
				if (!method1310(i_15_, i_19_, i_16_ + 128))
					return false;
				if (!method1310(i_15_ + 128, i_19_, i_16_ + 128))
					return false;
				return true;
			}
			if (i_14_ == 4) {
				if (i_15_ < Class4.anInt125) {
					if (!method1310(i_15_ + 128, i_17_, i_16_))
						return false;
					if (!method1310(i_15_ + 128, i_17_, i_16_ + 128))
						return false;
				}
				if (i > 0) {
					if (!method1310(i_15_ + 128, i_18_, i_16_))
						return false;
					if (!method1310(i_15_ + 128, i_18_, i_16_ + 128))
						return false;
				}
				if (!method1310(i_15_ + 128, i_19_, i_16_))
					return false;
				if (!method1310(i_15_ + 128, i_19_, i_16_ + 128))
					return false;
				return true;
			}
			if (i_14_ == 8) {
				if (i_16_ > Class14_Sub2_Sub8.anInt3853) {
					if (!method1310(i_15_, i_17_, i_16_))
						return false;
					if (!method1310(i_15_ + 128, i_17_, i_16_))
						return false;
				}
				if (i > 0) {
					if (!method1310(i_15_, i_18_, i_16_))
						return false;
					if (!method1310(i_15_ + 128, i_18_, i_16_))
						return false;
				}
				if (!method1310(i_15_, i_19_, i_16_))
					return false;
				if (!method1310(i_15_ + 128, i_19_, i_16_))
					return false;
				return true;
			}
		}
		if (!method1310(i_15_ + 64, i_20_, i_16_ + 64))
			return false;
		if (i_14_ == 16) {
			if (!method1310(i_15_, i_19_, i_16_ + 128))
				return false;
			return true;
		}
		if (i_14_ == 32) {
			if (!method1310(i_15_ + 128, i_19_, i_16_ + 128))
				return false;
			return true;
		}
		if (i_14_ == 64) {
			if (!method1310(i_15_ + 128, i_19_, i_16_))
				return false;
			return true;
		}
		if (i_14_ == 128) {
			if (!method1310(i_15_, i_19_, i_16_))
				return false;
			return true;
		}
		return true;
	}

	public static int method1528(int i, int i_0_, int i_1_) {
		i_1_ &= 0x3;
		if (i_1_ == 0) {
			int i_3_ = i;
			return i_3_;
		}
		if (i_1_ == 1) {
			int i_4_ = i_0_;
			return i_4_;
		}
		if (i_1_ == 2) {
			int i_5_ = 7 - i;
			return i_5_;
		}
		int i_6_ = -i_0_ + 7;
		return i_6_;
	}
}
