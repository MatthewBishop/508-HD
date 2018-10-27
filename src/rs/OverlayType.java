/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.AbstractSprite;

public class OverlayType {
	public int anInt2405;
	public static SoftCache aClass52_2406 = new SoftCache(200);
	public boolean aBoolean2407;
	public boolean aBoolean2409;
	public boolean aBoolean2410 = true;
	public int anInt2411;
	public int anInt2413;
	public int anInt2414;
	public int anInt2416;
	public static AbstractSprite[] aClass14_Sub2_Sub19Array2417;
	public static Class124 aClass124_2418 = Class124.method263("<col=ffffff>");
	public static int[][][] underWaterTileHeightMap;
	public static int anInt2420;
	public static AtmosphericChunk[][] aClass71ArrayArray2421 = new AtmosphericChunk[13][13];
	public static int[] anIntArray2422;
	public static int anInt2423;
	public int anInt2424;
	public static Class124 aClass124_2425 = Class124.method263("sch-Utteln:");
	public int anInt2426;

	public static Class14_Sub2_Sub5 method2020(int i, boolean bool, int i_0_) {
		if (bool)
			anIntArray2422 = null;
		for (Class14_Sub2_Sub5 class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
				.getFront(); class14_sub2_sub5 != null; class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
						.getNext()) {
			if (class14_sub2_sub5.aBoolean3809 && class14_sub2_sub5.method286(i, i_0_, -1347621730))
				return class14_sub2_sub5;
		}
		return null;
	}

	public static void method2021(byte i) {
		int i_1_ = -116 / ((-5 - i) / 55);
		anIntArray2422 = null;
		underWaterTileHeightMap = null;
		aClass14_Sub2_Sub19Array2417 = null;
		aClass124_2418 = null;
		aClass71ArrayArray2421 = null;
		aClass124_2425 = null;
		aClass52_2406 = null;
	}

	public static void method2022(int i, int i_2_, int i_3_, SceneGraphNode_GameEntity class133_sub1, int i_4_, int i_5_,
			int i_6_) {
		if (i_3_ == -1)
			Class53.method1213(i, i_2_, class133_sub1.anInt3495, i_5_, i_6_, i_4_, (byte) 126, class133_sub1.anInt3436);
	}

	public static int method2023(int i, int i_7_, int i_8_, int i_9_) {
		if (i_9_ != -10403) {
			int i_10_ = -10;
			return i_10_;
		}
		if ((JunkTex.tileFlags[i_7_][i_8_][i] & 0x8) != 0) {
			int i_11_ = 0;
			return i_11_;
		}
		if (i_7_ > 0 && (JunkTex.tileFlags[1][i_8_][i] & 0x2) != 0) {
			int i_12_ = i_7_ - 1;
			return i_12_;
		}
		int i_13_ = i_7_;
		return i_13_;
	}

	public void method2024(int i, int i_14_, Buffer class14_sub10) {
		for (;;) {
			int i_15_ = class14_sub10.readUByte();
			if (i_15_ == 0)
				break;
			method2025(i, class14_sub10, i_15_, false);
		}
		if (i_14_ != 0)
			method2021((byte) -98);
	}

	public void method2025(int i, Buffer class14_sub10, int i_16_, boolean bool) {
		if (!bool) {
			if (i_16_ != 1) {
				if (i_16_ != 2) {
					if (i_16_ == 3) {
						anInt2414 = class14_sub10.readUShort();
						if (anInt2414 == 65535)
							anInt2414 = -1;
					} else if (i_16_ == 5)
						aBoolean2410 = false;
					else if (i_16_ != 7) {
						if (i_16_ == 8)
							Class4.anInt123 = i;
						else if (i_16_ != 9) {
							if (i_16_ != 10) {
								if (i_16_ == 11)
									anInt2416 = class14_sub10.readUByte();
								else if (i_16_ != 12) {
									if (i_16_ == 13)
										anInt2426 = class14_sub10.method829(-127);
									else if (i_16_ == 14)
										anInt2413 = class14_sub10.readUByte();
								} else
									aBoolean2409 = true;
							} else
								aBoolean2407 = false;
						} else
							anInt2424 = class14_sub10.readUShort();
					} else
						anInt2405 = JunkTex.method82(class14_sub10.method829(39), -108);
				} else
					anInt2414 = class14_sub10.readUByte();
			} else
				anInt2411 = JunkTex.method82(class14_sub10.method829(-126), -116);
		}
	}

	public static OverlayType list(int i) {
		OverlayType overlayType = (OverlayType) Static2.aClass52_3942.get(i);
		if (overlayType != null) {
			OverlayType class150_1_ = overlayType;
			return class150_1_;
		}
		byte[] is = Static2.aClass9_372.method163(i, 4);
		OverlayType class150_3_ = new OverlayType();
		if (is != null)
			class150_3_.method2024(i, 0, new Buffer(is));
		Static2.aClass52_3942.put(class150_3_, i);
		OverlayType class150_4_ = class150_3_;
		return class150_4_;
	}

	public OverlayType() {
		anInt2405 = -1;
		anInt2416 = 8;
		aBoolean2409 = false;
		aBoolean2407 = true;
		anInt2413 = 16;
		anInt2411 = 0;
		anInt2414 = -1;
		anInt2424 = 128;
		anInt2426 = 1190717;
	}
}
