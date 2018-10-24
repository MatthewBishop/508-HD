/* Class133_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.map.MapRegion;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.lights.Light;
import com.jagex.rt4.lights.LightManager;

public class Class133_Sub3 extends Class133 {
	public int anInt3557;
	public int anInt3558;
	public static int[] anIntArray3559 = new int[5];
	public static Class124 aClass124_3563 = Class124.method263(1178, "Members object");
	public int anInt3564 = -32768;
	public static Class124 aClass124_3566 = Class124.method263(1178, "null");
	public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_3567;
	public static Class124 aClass124_3568;
	public static Class124 aClass124_3570 = Class124.method263(1178, "hitbar_default");

	static {
		aClass124_3568 = aClass124_3563;
	}

	@Override
	public void render(int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, long l) {
		Class133_Sub7 class133_sub7 = JunkTex.method605(114, anInt3557).method1974(null, 0, 0, anInt3558);
		if (class133_sub7 != null) {
			class133_sub7.render(i, i_4_, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_, l);
			anInt3564 = class133_sub7.getMinY();
		}
	}

	public static void method1830(Class14_Sub21 class14_sub21, int i) {
		if (i != -1976917689)
			aClass14_Sub2_Sub16_3567 = null;
		Class116.method1596(200000, (byte) 79, class14_sub21);
	}

	public static void method1831(byte i) {
		anIntArray3559 = null;
		aClass124_3568 = null;
		aClass124_3563 = null;
		aClass14_Sub2_Sub16_3567 = null;
		aClass124_3570 = null;
		if (i != -44)
			aClass124_3566 = null;
		aClass124_3566 = null;
	}

	@Override
	public int getMinY() {
		int i = anInt3564;
		return i;
	}

	public static void method1833(boolean bool, int i, int i_13_, byte[] is, int i_14_, int i_15_, byte i_16_,
			int i_17_, int i_18_, int i_19_, Class32[] class32s) {
		if (!bool) {
			for (int i_20_ = 0; i_20_ < 8; i_20_++) {
				for (int i_21_ = 0; i_21_ < 8; i_21_++) {
					if (i + i_20_ > 0 && i_20_ + i < 103 && i_15_ + i_21_ > 0 && i_15_ + i_21_ < 103)
						class32s[i_14_].anIntArrayArray546[i + i_20_][i_21_ + i_15_] = JunkTex
								.method617((class32s[i_14_].anIntArrayArray546[i + i_20_][i_21_ + i_15_]), -16777217);
				}
			}
		}
		Buffer class14_sub10 = new Buffer(is);
		int i_22_ = 68 % ((i_16_ + 64) / 55);
		int i_23_;
		if (!bool)
			i_23_ = 4;
		else
			i_23_ = 1;
		for (int i_24_ = 0; i_24_ < i_23_; i_24_++) {
			for (int i_25_ = 0; i_25_ < 64; i_25_++) {
				for (int i_26_ = 0; i_26_ < 64; i_26_++) {
					if (i_24_ != i_17_ || i_18_ > i_25_ || i_18_ + 8 <= i_25_ || i_26_ < i_19_ || i_26_ >= i_19_ + 8)
						MapRegion.decodeMapData(bool, 0, class14_sub10, 0, 0, 0, -1, -1);
					else
						MapRegion.decodeMapData(bool, i_14_, class14_sub10, i_13_, 0, 0,
								i + Scenegraph.method1528(i_25_ & 0x7, i_26_ & 0x7, i_13_),
								i_15_ + Class67.method1299(i_25_ & 0x7, i_13_, 88, i_26_ & 0x7));
				}
			}
		}
		if (!bool) {
			AtmosphericChunk atmosphericChunk = null;
			while (class14_sub10.payload.length > class14_sub10.position) {
				int i_27_ = class14_sub10.readUByte();
				if (i_27_ != 0) {
					if (i_27_ == 1) {
						int i_28_ = class14_sub10.readUByte();
						if (i_28_ > 0) {
							for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
								Light light = new Light(class14_sub10);
								int i_30_ = light.param1 >> 7;
								int i_31_ = light.param3 >> 7;
								if (light.anInt1125 == i_17_ && i_18_ <= i_30_ && i_30_ < i_18_ + 8 && i_19_ <= i_31_
										&& i_19_ + 8 > i_31_) {
									int i_32_ = ((i << 7) + (JunkTex.method634(light.param3 & 0x3ff,
											-207592252, i_13_, light.param1 & 0x3ff)));
									int i_33_ = ((JunkTex.method1028(i_13_, light.param1 & 0x3ff, -1,
											light.param3 & 0x3ff)) + (i_15_ << 7));
									light.param3 = i_33_;
									light.param1 = i_32_;
									i_31_ = light.param3 >> 39;
									i_30_ = light.param1 >> 7;
									if (i_30_ >= 0 && i_31_ >= 0 && i_30_ < 104 && i_31_ < 104) {
										light.param2 = (Static2.tileHeights[light.anInt1125][i_30_][i_31_])
												- light.param2;
										LightManager.method200(light);
									}
								}
							}
						}
					} else
						throw new IllegalStateException();
				} else
					atmosphericChunk = new AtmosphericChunk(class14_sub10);
			}
			if (atmosphericChunk == null)
				atmosphericChunk = new AtmosphericChunk();
			OverlayType.aClass71ArrayArray2421[i >> 3][i_15_ >> 35] = atmosphericChunk;
		}
	}
}
