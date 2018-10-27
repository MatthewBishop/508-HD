/* Class59 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;

public class Class59 {
	public static Class124 aClass124_953;
	public static boolean aBoolean954 = false;
	public static Class124 aClass124_956;
	public static FileSystem aFileSystem_957;
	public static Class124 aClass124_958;
	static {
		aClass124_953 = Class124.method263("k");
		aClass124_956 = Class124.method263("M");
		aClass124_958 = Class124.method263("slr2)3ws?order=LPWM");
		
	}

	public static boolean method1260(boolean bool, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_) {
		for (int i_10_ = 0; i_10_ < 104; i_10_++) {
			for (int i_11_ = 0; i_11_ < 104; i_11_++) {
				Class33.anIntArrayArray575[i_10_][i_11_] = 0;
				Class137.anIntArrayArray2203[i_10_][i_11_] = 99999999;
			}
		}
		int i_12_ = i_9_;
		int i_13_ = i_7_;
		Class33.anIntArrayArray575[i_7_][i_9_] = 99;
		Class137.anIntArrayArray2203[i_7_][i_9_] = 0;
		int i_14_ = 0;
		int i_15_ = 0;
		boolean bool_16_ = false;
		JunkTex.anIntArray4691[i_15_] = i_7_;
		Class14_Sub2_Sub21.anIntArray4078[i_15_++] = i_9_;
		int[][] is = (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel].anIntArrayArray546);
		while (i_14_ != i_15_) {
			i_12_ = Class14_Sub2_Sub21.anIntArray4078[i_14_];
			i_13_ = JunkTex.anIntArray4691[i_14_];
			i_14_ = i_14_ + 1 & 0xfff;
			if (i_6_ == i_13_ && i_12_ == i_3_) {
				bool_16_ = true;
				break;
			}
			if (i != 0) {
				if (i >= 5 && i != 10 || !(Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel].method1076(i_1_,
						1, i - 1, i_3_, i_6_, i_13_, i_12_, i_4_ + 18288))) {
					if (i < 10 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel].method1066(1, i - 1,
							i_13_, i_3_, i_12_, (byte) -39, i_1_, i_6_))) {
						bool_16_ = true;
						break;
					}
				} else {
					bool_16_ = true;
					break;
				}
			}
			if (i_0_ != 0 && i_2_ != 0 && (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.gameLevel]
					.method1078(i_12_, i_2_, i_13_, i_5_, (byte) -63, i_6_, i_3_, 1, i_0_))) {
				bool_16_ = true;
				break;
			}
			int i_17_ = Class137.anIntArrayArray2203[i_13_][i_12_] + 1;
			if (i_13_ > 0 && Class33.anIntArrayArray575[i_13_ - 1][i_12_] == 0
					&& (is[i_13_ - 1][i_12_] & 0x12c0108) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_;
				Class33.anIntArrayArray575[i_13_ - 1][i_12_] = 2;
				i_15_ = i_15_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_13_ - 1][i_12_] = i_17_;
			}
			if (i_13_ < 103 && Class33.anIntArrayArray575[i_13_ + 1][i_12_] == 0
					&& (is[i_13_ + 1][i_12_] & 0x12c0180) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_;
				Class33.anIntArrayArray575[i_13_ + 1][i_12_] = 8;
				Class137.anIntArrayArray2203[i_13_ + 1][i_12_] = i_17_;
				i_15_ = i_15_ + 1 & 0xfff;
			}
			if (i_12_ > 0 && Class33.anIntArrayArray575[i_13_][i_12_ - 1] == 0
					&& (is[i_13_][i_12_ - 1] & 0x12c0102) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ - 1;
				Class33.anIntArrayArray575[i_13_][i_12_ - 1] = 1;
				i_15_ = i_15_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_13_][i_12_ - 1] = i_17_;
			}
			if (i_12_ < 103 && Class33.anIntArrayArray575[i_13_][i_12_ + 1] == 0
					&& (is[i_13_][i_12_ + 1] & 0x12c0120) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ + 1;
				i_15_ = i_15_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_13_][i_12_ + 1] = 4;
				Class137.anIntArrayArray2203[i_13_][i_12_ + 1] = i_17_;
			}
			if (i_13_ > 0 && i_12_ > 0 && Class33.anIntArrayArray575[i_13_ - 1][i_12_ - 1] == 0
					&& (is[i_13_ - 1][i_12_ - 1] & 0x12c010e) == 0 && (is[i_13_ - 1][i_12_] & 0x12c0108) == 0
					&& (is[i_13_][i_12_ - 1] & 0x12c0102) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ - 1;
				Class33.anIntArrayArray575[i_13_ - 1][i_12_ - 1] = 3;
				i_15_ = i_15_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_13_ - 1][i_12_ - 1] = i_17_;
			}
			if (i_13_ < 103 && i_12_ > 0 && Class33.anIntArrayArray575[i_13_ + 1][i_12_ - 1] == 0
					&& (is[i_13_ + 1][i_12_ - 1] & 0x12c0183) == 0 && (is[i_13_ + 1][i_12_] & 0x12c0180) == 0
					&& (is[i_13_][i_12_ - 1] & 0x12c0102) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ - 1;
				Class33.anIntArrayArray575[i_13_ + 1][i_12_ - 1] = 9;
				i_15_ = i_15_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_13_ + 1][i_12_ - 1] = i_17_;
			}
			if (i_13_ > 0 && i_12_ < 103 && Class33.anIntArrayArray575[i_13_ - 1][i_12_ + 1] == 0
					&& (is[i_13_ - 1][i_12_ + 1] & 0x12c0138) == 0 && (is[i_13_ - 1][i_12_] & 0x12c0108) == 0
					&& (is[i_13_][i_12_ + 1] & 0x12c0120) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ + 1;
				i_15_ = i_15_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_13_ - 1][i_12_ + 1] = 6;
				Class137.anIntArrayArray2203[i_13_ - 1][i_12_ + 1] = i_17_;
			}
			if (i_13_ < 103 && i_12_ < 103 && Class33.anIntArrayArray575[i_13_ + 1][i_12_ + 1] == 0
					&& (is[i_13_ + 1][i_12_ + 1] & 0x12c01e0) == 0 && (is[i_13_ + 1][i_12_] & 0x12c0180) == 0
					&& (is[i_13_][i_12_ + 1] & 0x12c0120) == 0) {
				JunkTex.anIntArray4691[i_15_] = i_13_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_15_] = i_12_ + 1;
				Class33.anIntArrayArray575[i_13_ + 1][i_12_ + 1] = 12;
				Class137.anIntArrayArray2203[i_13_ + 1][i_12_ + 1] = i_17_;
				i_15_ = i_15_ + 1 & 0xfff;
			}
		}
		Static2.anInt2911 = i_4_;
		if (!bool_16_) {
			if (!bool) {
				boolean bool_18_ = false;
				return bool_18_;
			}
			i_14_ = 1000;
			i_15_ = 100;
			int i_19_ = 10;
			for (int i_20_ = i_6_ - i_19_; i_6_ + i_19_ >= i_20_; i_20_++) {
				for (int i_21_ = -i_19_ + i_3_; i_3_ + i_19_ >= i_21_; i_21_++) {
					if (i_20_ >= 0 && i_21_ >= 0 && i_20_ < 104 && i_21_ < 104
							&& Class137.anIntArrayArray2203[i_20_][i_21_] < 100) {
						int i_22_ = 0;
						if (i_20_ >= i_6_) {
							if (i_6_ + (i_0_ - 1) < i_20_)
								i_22_ = i_20_ - (i_6_ + i_0_ - 1);
						} else
							i_22_ = i_6_ - i_20_;
						int i_23_ = 0;
						if (i_21_ < i_3_)
							i_23_ = -i_21_ + i_3_;
						else if (i_21_ > i_3_ + (i_2_ - 1))
							i_23_ = -i_3_ - i_2_ + 1 + i_21_;
						int i_24_ = i_22_ * i_22_ + i_23_ * i_23_;
						if (i_24_ < i_14_ || i_14_ == i_24_ && (Class137.anIntArrayArray2203[i_20_][i_21_]) < i_15_) {
							i_14_ = i_24_;
							i_12_ = i_21_;
							i_15_ = Class137.anIntArrayArray2203[i_20_][i_21_];
							i_13_ = i_20_;
						}
					}
				}
			}
			if (i_14_ == 1000) {
				boolean bool_25_ = false;
				return bool_25_;
			}
			if (i_13_ == i_7_ && i_12_ == i_9_) {
				boolean bool_26_ = false;
				return bool_26_;
			}
			Static2.anInt2911 = 1;
		}
		int i_27_ = 0;
		JunkTex.anIntArray4691[i_27_] = i_13_;
		Class14_Sub2_Sub21.anIntArray4078[i_27_++] = i_12_;
		i_15_ = i_14_ = Class33.anIntArrayArray575[i_13_][i_12_];
		while (i_13_ != i_7_ || i_12_ != i_9_) {
			if (i_14_ != i_15_) {
				JunkTex.anIntArray4691[i_27_] = i_13_;
				i_14_ = i_15_;
				Class14_Sub2_Sub21.anIntArray4078[i_27_++] = i_12_;
			}
			if ((i_15_ & 0x1) != 0)
				i_12_++;
			else if ((i_15_ & 0x4) != 0)
				i_12_--;
			if ((i_15_ & 0x2) != 0)
				i_13_++;
			else if ((i_15_ & 0x8) != 0)
				i_13_--;
			i_15_ = Class33.anIntArrayArray575[i_13_][i_12_];
		}
		if (i_27_ > 0) {
			SceneGraphNode.method1782(-20179, i_27_, i_8_);
			return true;
		}
		if (i_8_ == 1) {
			bool_16_ = false;
			return bool_16_;
		}
		bool_16_ = true;
		return bool_16_;
	}

	public static void method1261(byte i) {
		if (i == 16) {
			aClass124_958 = null;
			aFileSystem_957 = null;
			aClass124_953 = null;
			aClass124_956 = null;
		}
	}

	public static void method1262() {
		JunkTex.aClass14_Sub10_Sub1_4734.enableBitAccess();
		int i = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
		if (i != 0) {
			i = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 2);
			if (i == 0)
				Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = 2047;
			else if (i == 1) {
				int i_28_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
				Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.method1799(false, (byte) 127, i_28_);
				int i_29_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
				if (i_29_ == 1)
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = 2047;
			} else if (i == 2) {
				int i_30_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
				Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.method1799(true, (byte) 100, i_30_);
				int i_31_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
				Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.method1799(true, (byte) 123, i_31_);
				int i_32_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
				if (i_32_ == 1)
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = 2047;
			} else if (i == 3) {
				int i_33_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 7);
				int i_34_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
				Class14_Sub2_Sub3.gameLevel = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 2);
				int i_35_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
				if (i_35_ == 1)
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = 2047;
				int i_36_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 7);
				Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.method1800((byte) -87, i_36_, i_34_ == 1, i_33_);
			}
		}
	}

	public static void method1263(byte i) {
		if (i != -66)
			method1261((byte) -34);
		if (Class142.anInt2315 == 5)
			Class142.anInt2315 = 6;
	}
}
