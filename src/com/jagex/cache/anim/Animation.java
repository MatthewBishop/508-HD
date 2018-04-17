/* Class46 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.anim;

import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.Buffer;

import rs.Class133_Sub7;
import rs.Class14_Sub4;

public class Animation {
	public boolean aBoolean754;
	public int animatingPrecedence;
	public int anInt753;
	public int anInt771;
	public int anInt777;
	public int[] anIntArray763;
	public int[] anIntArray768;
	public int[] anIntArray775;
	public int[][] anIntArrayArray776;
	public int[] interleaveOrder;

	public int loopOffset;

	public int maximumLoops;

	public int playerMainhand;

	public boolean stretches;

	public int walkingPrecedence = -1;

	public Animation() {
		aBoolean754 = false;
		stretches = false;
		animatingPrecedence = -1;
		loopOffset = -1;
		maximumLoops = 99;
		anInt777 = 5;
		anInt771 = -1;
		anInt753 = 2;
		playerMainhand = -1;
	}

	public void decode(Buffer class14_sub10) {
		for (;;) {
			int i_90_ = class14_sub10.readUByte();
			if (i_90_ == 0)
				break;
			decode(i_90_, class14_sub10, -11);
		}
	}

	public void decode(int i, Buffer class14_sub10, int i_13_) {
		if (i_13_ == -11) {
			if (i == 1) {
				int i_14_ = class14_sub10.readUShort();
				anIntArray763 = new int[i_14_];
				for (int i_15_ = 0; i_14_ > i_15_; i_15_++)
					anIntArray763[i_15_] = class14_sub10.readUShort();
				anIntArray768 = new int[i_14_];
				for (int i_16_ = 0; i_14_ > i_16_; i_16_++)
					anIntArray768[i_16_] = class14_sub10.readUShort();
				for (int i_17_ = 0; i_14_ > i_17_; i_17_++)
					anIntArray768[i_17_] = (class14_sub10.readUShort() << 48) + anIntArray768[i_17_];
			} else if (i == 2)
				loopOffset = class14_sub10.readUShort();
			else if (i == 3) {
				int i_18_ = class14_sub10.readUByte();
				interleaveOrder = new int[i_18_ + 1];
				for (int i_19_ = 0; i_18_ > i_19_; i_19_++)
					interleaveOrder[i_19_] = class14_sub10.readUByte();
				interleaveOrder[i_18_] = 9999999;
			} else if (i == 4)
				stretches = true;
			else if (i != 5) {
				if (i != 6) {
					if (i == 7)
						playerMainhand = class14_sub10.readUShort();
					else if (i == 8)
						maximumLoops = class14_sub10.readUByte();
					else if (i == 9)
						animatingPrecedence = class14_sub10.readUByte();
					else if (i == 10)
						walkingPrecedence = class14_sub10.readUByte();
					else if (i != 11) {
						if (i != 12) {
							if (i == 13) {
								int i_20_ = class14_sub10.readUShort();
								anIntArrayArray776 = new int[i_20_][];
								for (int i_21_ = 0; i_20_ > i_21_; i_21_++) {
									int i_22_ = class14_sub10.readUByte();
									if (i_22_ > 0) {
										anIntArrayArray776[i_21_] = new int[i_22_];
										anIntArrayArray776[i_21_][0] = class14_sub10.method829(41);
										for (int i_23_ = 1; i_22_ > i_23_; i_23_++)
											anIntArrayArray776[i_21_][i_23_] = class14_sub10.readUShort();
									}
								}
							} else if (i == 14)
								aBoolean754 = true;
						} else {
							int i_24_ = class14_sub10.readUByte();
							anIntArray775 = new int[i_24_];
							for (int i_25_ = 0; i_24_ > i_25_; i_25_++)
								anIntArray775[i_25_] = class14_sub10.readUShort();
							for (int i_26_ = 0; i_26_ < i_24_; i_26_++)
								anIntArray775[i_26_] = (class14_sub10.readUShort() << 48)
										+ anIntArray775[i_26_];
						}
					} else
						anInt753 = class14_sub10.readUByte();
				} else
					anInt771 = class14_sub10.readUShort();
			} else
				anInt777 = class14_sub10.readUByte();
		}
	}

	public Class133_Sub7 method1167(int i, int i_0_, Class133_Sub7 class133_sub7) {
		int i_1_ = anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_1_ >> 16);
		i_1_ &= i_0_;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_2_ = class133_sub7.method1860(true, true);
			return class133_sub7_2_;
		}
		AnimFrameLoader class14_sub2_sub15_3_ = null;
		int i_4_ = 0;
		if (anIntArray775 != null && anIntArray775.length > i) {
			i_4_ = anIntArray775[i];
			class14_sub2_sub15_3_ = Class14_Sub4.method457(i_0_ - 65532, i_4_ >> 48);
			i_4_ &= 0xffff;
		}
		if (class14_sub2_sub15_3_ == null || i_4_ == 65535) {
			Class133_Sub7 class133_sub7_5_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_1_),
					!aBoolean754);
			class133_sub7_5_.method1857(class14_sub2_sub15, i_1_, aBoolean754);
			Class133_Sub7 class133_sub7_6_ = class133_sub7_5_;
			return class133_sub7_6_;
		}
		Class133_Sub7 class133_sub7_7_ = class133_sub7.method1860(
				(!class14_sub2_sub15.method338(i_1_) & !class14_sub2_sub15_3_.method338(i_4_)),
				!aBoolean754);
		class133_sub7_7_.method1857(class14_sub2_sub15, i_1_, aBoolean754);
		class133_sub7_7_.method1857(class14_sub2_sub15_3_, i_4_, aBoolean754);
		Class133_Sub7 class133_sub7_8_ = class133_sub7_7_;
		return class133_sub7_8_;
	}

	public Class133_Sub7 method1168(byte i, int i_9_, Class133_Sub7 class133_sub7) {
		i_9_ = anIntArray768[i_9_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_9_ >> 48);
		i_9_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_10_ = class133_sub7.method1860(true, true);
			return class133_sub7_10_;
		}
		Class133_Sub7 class133_sub7_11_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_9_),
				!aBoolean754);
		class133_sub7_11_.method1857(class14_sub2_sub15, i_9_, aBoolean754);
		Class133_Sub7 class133_sub7_12_ = class133_sub7_11_;
		return class133_sub7_12_;
	}

	public void method1171(int i) {
		if (walkingPrecedence == -1) {
			if (interleaveOrder != null)
				walkingPrecedence = 2;
			else
				walkingPrecedence = 0;
		}
		if (animatingPrecedence == -1) {
			if (interleaveOrder != null)
				animatingPrecedence = 2;
			else
				animatingPrecedence = 0;
		}
	}

	public Class133_Sub7 method1173(int i, int i_30_, Class133_Sub7 class133_sub7) {
		i = anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i >> 48);
		i &= i_30_;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_31_ = class133_sub7.method1870(true, true);
			return class133_sub7_31_;
		}
		Class133_Sub7 class133_sub7_32_ = class133_sub7.method1870(!class14_sub2_sub15.method338(i),
				!aBoolean754);
		class133_sub7_32_.method1857(class14_sub2_sub15, i, aBoolean754);
		Class133_Sub7 class133_sub7_33_ = class133_sub7_32_;
		return class133_sub7_33_;
	}

	public Class133_Sub7 method1177(byte i, int i_76_, int i_77_, Class133_Sub7 class133_sub7) {
		i_77_ = anIntArray768[i_77_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(3, i_77_ >> 16);
		i_77_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_78_ = class133_sub7.method1860(true, true);
			return class133_sub7_78_;
		}
		i_76_ &= 0x3;
		if (i > -20)
			walkingPrecedence = -117;
		Class133_Sub7 class133_sub7_79_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_77_),
				!aBoolean754);
		if (i_76_ != 1) {
			if (i_76_ == 2)
				class133_sub7_79_.method1872();
			else if (i_76_ == 3)
				class133_sub7_79_.method1871();
		} else
			class133_sub7_79_.method1875();
		class133_sub7_79_.method1857(class14_sub2_sub15, i_77_, aBoolean754);
		if (i_76_ != 1) {
			if (i_76_ != 2) {
				if (i_76_ == 3)
					class133_sub7_79_.method1875();
			} else
				class133_sub7_79_.method1872();
		} else
			class133_sub7_79_.method1871();
		Class133_Sub7 class133_sub7_80_ = class133_sub7_79_;
		return class133_sub7_80_;
	}

	public Class133_Sub7 method1178(int i, byte i_81_, int i_82_, Class133_Sub7 class133_sub7, Animation class46_83_) {
		i_82_ = anIntArray768[i_82_];
		AnimFrameLoader class14_sub2_sub15 = Class14_Sub4.method457(i_81_ - 43, i_82_ >> 16);
		i_82_ &= 0xffff;
		if (class14_sub2_sub15 == null) {
			Class133_Sub7 class133_sub7_84_ = class46_83_.method1168((byte) 123, i, class133_sub7);
			return class133_sub7_84_;
		}
		if (i_81_ != 46)
			method1178(21, (byte) -18, 81, null, null);
		i = class46_83_.anIntArray768[i];
		AnimFrameLoader class14_sub2_sub15_85_ = Class14_Sub4.method457(3, i >> 48);
		i &= 0xffff;
		if (class14_sub2_sub15_85_ == null) {
			Class133_Sub7 class133_sub7_86_ = class133_sub7.method1860(!class14_sub2_sub15.method338(i_82_),
					!aBoolean754);
			class133_sub7_86_.method1857(class14_sub2_sub15, i_82_, aBoolean754);
			Class133_Sub7 class133_sub7_87_ = class133_sub7_86_;
			return class133_sub7_87_;
		}
		Class133_Sub7 class133_sub7_88_ = (class133_sub7.method1860(
				(!class14_sub2_sub15.method338(i_82_) & !class14_sub2_sub15_85_.method338(i)),
				!class46_83_.aBoolean754 & !aBoolean754));
		class133_sub7_88_.method1873(class14_sub2_sub15, i_82_, class14_sub2_sub15_85_, i, interleaveOrder,
				class46_83_.aBoolean754 | aBoolean754);
		Class133_Sub7 class133_sub7_89_ = class133_sub7_88_;
		return class133_sub7_89_;
	}
}