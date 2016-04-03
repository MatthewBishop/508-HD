/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.lights;

import javax.media.opengl.GL;

import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.RT4;

import rs.Class14_Sub29;
import rs.Class14_Sub9_Sub3;
import rs.Class7_Sub1;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub37;

public class Class10 {
	public static Light[] lights = new Light[255];
	public static int lightCount = 0;
	
	private static int anInt248;
	private static int anInt249;
	private static int anInt250;
	private static int[] anIntArray252 = new int[4];
	private static boolean[] aBooleanArray253 = new boolean[4];
	private static int[][][] anIntArrayArrayArray254;
	private static boolean[] aBooleanArray255;
	private static int anInt256;
	private static float[] params;
	private static int anInt258;
	private static int[] anIntArray259 = new int[4];
	private static int anInt260;
	private static int anInt261;
	private static int anInt262;

	static {
		aBooleanArray255 = new boolean[4];
		params = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
	}

	public static void method187(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (RT4.useLighting
				&& (anInt248 != i_2_ || anInt250 != i_3_ || anInt256 != i_4_ || anInt261 != i_3_ || anInt258 != i_4_)) {
			for (int i_5_ = 0; i_5_ < 4; i_5_++)
				aBooleanArray253[i_5_] = false;
			int i_6_ = 0;
			int i_7_ = anIntArrayArrayArray254[i_2_][i_3_][i_4_];
			while_74_: while (i_7_ != 0) {
				int i_8_ = (i_7_ & 0xff) - 1;
				i_7_ >>>= 8;
				for (int i_9_ = 0; i_9_ < 4; i_9_++) {
					if (i_8_ == anIntArray259[i_9_]) {
						aBooleanArray253[i_9_] = true;
						continue while_74_;
					}
				}
				anIntArray252[i_6_++] = i_8_;
			}
			for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
				for (int i_11_ = 0; i_11_ < 4; i_11_++) {
					if (!aBooleanArray253[i_11_]) {
						anIntArray259[i_11_] = anIntArray252[i_10_];
						aBooleanArray253[i_11_] = true;
						method197(i_11_, lights[anIntArray252[i_10_]], i, i_0_, i_1_);
						break;
					}
				}
			}
			for (int i_12_ = 0; i_12_ < 4; i_12_++) {
				if (!aBooleanArray253[i_12_]) {
					anIntArray259[i_12_] = -1;
					method198(i_12_);
				}
			}
			anInt248 = i_2_;
			anInt250 = i_3_;
			anInt256 = i_4_;
			anInt261 = i_3_;
			anInt258 = i_4_;
		}
	}

	public static void method188() {
		for (int i = 0; i < 4; i++) {
			anIntArray259[i] = -1;
			method198(i);
		}
	}

	public static void method189(int i, int i_13_, int i_14_) {
		anInt262 = i;
		anInt260 = i_13_;
		anInt249 = i_14_;
		anIntArrayArrayArray254 = new int[anInt262][anInt260][anInt249];
	}

	public static void method190(int i, boolean bool) {
		for (int i_15_ = 0; i_15_ < lightCount; i_15_++)
			lights[i_15_].method1326(i, bool);
		anInt248 = -1;
		anInt250 = -1;
		anInt256 = -1;
		anInt261 = -1;
		anInt258 = -1;
	}

	public static void dispose() {
		lights = null;
		anIntArrayArrayArray254 = null;
		anIntArray259 = null;
		aBooleanArray255 = null;
		params = null;
		anIntArray252 = null;
		aBooleanArray253 = null;
	}

	public static void method192(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_) {
		if (RT4.useLighting) {
			if (i == 1 && i_20_ > 0)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ - 1, i_21_);
			else if (i == 4 && i_20_ < anInt260 - 1)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ + 1, i_21_);
			else if (i == 8 && i_21_ > 0)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_, i_21_ - 1);
			else if (i == 2 && i_21_ < anInt249 - 1)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_, i_21_ + 1);
			else if (i == 16 && i_20_ > 0 && i_21_ < anInt249 - 1)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ - 1, i_21_ + 1);
			else if (i == 32 && i_20_ < anInt260 - 1 && i_21_ < anInt249 - 1)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ + 1, i_21_ + 1);
			else if (i == 128 && i_20_ > 0 && i_21_ > 0)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ - 1, i_21_ - 1);
			else if (i == 64 && i_20_ < anInt260 - 1 && i_21_ > 0)
				method187(i_16_, i_17_, i_18_, i_19_, i_20_ + 1, i_21_ - 1);
		}
	}

	public static void method193(int i, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_) {
		if (RT4.useLighting && (anInt248 != i_24_ || anInt250 != i_25_ || anInt256 != i_26_
				|| anInt261 != i_27_ || anInt258 != i_28_)) {
			for (int i_29_ = 0; i_29_ < 4; i_29_++)
				aBooleanArray253[i_29_] = false;
			int i_30_ = 0;
			int i_31_ = 0;
			while_76_: for (int i_32_ = i_25_; i_32_ <= i_27_; i_32_++) {
				for (int i_33_ = i_26_; i_33_ <= i_28_; i_33_++) {
					int i_34_ = anIntArrayArrayArray254[i_24_][i_32_][i_33_];
					while_75_: while (i_34_ != 0) {
						int i_35_ = (i_34_ & 0xff) - 1;
						i_34_ >>>= 8;
						for (int i_36_ = 0; i_36_ < i_31_; i_36_++) {
							if (i_35_ == anIntArray252[i_36_])
								continue while_75_;
						}
						for (int i_37_ = 0; i_37_ < 4; i_37_++) {
							if (i_35_ == anIntArray259[i_37_]) {
								if (!aBooleanArray253[i_37_]) {
									aBooleanArray253[i_37_] = true;
									if (++i_30_ == 4)
										break while_76_;
								}
								continue while_75_;
							}
						}
						anIntArray252[i_31_++] = i_35_;
						if (++i_30_ == 4)
							break while_76_;
					}
				}
			}
			for (int i_38_ = 0; i_38_ < i_31_; i_38_++) {
				for (int i_39_ = 0; i_39_ < 4; i_39_++) {
					if (!aBooleanArray253[i_39_]) {
						anIntArray259[i_39_] = anIntArray252[i_38_];
						aBooleanArray253[i_39_] = true;
						method197(i_39_, lights[anIntArray252[i_38_]], i, i_22_, i_23_);
						break;
					}
				}
			}
			for (int i_40_ = 0; i_40_ < 4; i_40_++) {
				if (!aBooleanArray253[i_40_]) {
					anIntArray259[i_40_] = -1;
					method198(i_40_);
				}
			}
			anInt248 = i_24_;
			anInt250 = i_25_;
			anInt256 = i_26_;
			anInt261 = i_27_;
			anInt258 = i_28_;
		}
	}

	public static void method194() {
		GL gl = RT4GL.gl;
		for (int i = 0; i < 4; i++) {
			int i_41_ = i + 16388;
			gl.glLightfv(i_41_, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glLightf(i_41_, 4616, 0.0F);
			gl.glLightf(i_41_, 4615, 0.0F);
		}
	}

	public static void method195(int i, int i_42_, Class14_Sub29[][][] class14_sub29s) {
		if (RT4.useLighting) {
			GL gl = RT4GL.gl;
			RT4.method1778(0, 0);
			RT4GL.method1638(0);
			RT4GL.method1651();
			RT4GL.method1632(RT4GL.anInt2038);
			gl.glDepthMask(false);
			RT4GL.method1639(false);
			gl.glBlendFunc(774, 1);
			gl.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
			gl.glTexEnvi(8960, 34176, 34166);
			gl.glTexEnvi(8960, 34192, 770);
			for (int i_43_ = 0; i_43_ < lightCount; i_43_++) {
				Light light = lights[i_43_];
				if (light.aClass130_1103 != null) {
					int i_44_ = 0;
					int i_45_ = (light.param3 >> 7) - light.anInt1120;
					int i_46_ = (light.param3 >> 7) + light.anInt1120;
					if (i_46_ >= Class14_Sub8_Sub26.anInt4526)
						i_46_ = Class14_Sub8_Sub26.anInt4526 - 1;
					if (i_45_ < Class14_Sub9_Sub3.anInt4849) {
						i_44_ += Class14_Sub9_Sub3.anInt4849 - i_45_;
						i_45_ = Class14_Sub9_Sub3.anInt4849;
					}
					while_77_: for (int i_47_ = i_45_; i_47_ <= i_46_; i_47_++) {
						int i_48_ = light.aShortArray1106[i_44_++];
						int i_49_ = ((light.param1 >> 7) - light.anInt1120 + (i_48_ >> 8));
						int i_50_ = i_49_ + (i_48_ & 0xff) - 1;
						if (i_49_ < Class7_Sub1.anInt2659)
							i_49_ = Class7_Sub1.anInt2659;
						if (i_50_ >= Class14_Sub8_Sub37.anInt4722)
							i_50_ = Class14_Sub8_Sub37.anInt4722 - 1;
						for (int i_51_ = i_49_; i_51_ <= i_50_; i_51_++) {
							Class14_Sub29 class14_sub29 = (class14_sub29s[light.anInt1125][i_51_][i_47_]);
							if (class14_sub29 != null && class14_sub29.aBoolean3235) {
								RT4GL.method1640(201.5F - ((float) (light.anInt1125) * 50.0F) - 1.5F);
								gl.glTexEnvfv(8960, 8705, (new float[] { 0.0F, 0.0F, 0.0F, light.aFloat1107 }), 0);
								light.aClass130_1103.method1768();
								break while_77_;
							}
						}
					}
				}
			}
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glBlendFunc(770, 771);
			gl.glDepthMask(true);
			gl.glFogfv(2918, AthmosphericEffects.fogColourComponents, 0);
			gl.glEnableClientState(32888);
			RT4GL.method1645();
		}
	}

	public static void method196(int i, int i_52_, int i_53_, int i_54_, int i_55_) {
		if (RT4.useLighting) {
			int i_56_ = 0;
			while_79_: for (/**/; i_56_ < 4; i_56_++) {
				if (anIntArray259[i_56_] != -1) {
					int i_57_ = anIntArrayArrayArray254[i][i_52_][i_53_];
					while (i_57_ != 0) {
						int i_58_ = (i_57_ & 0xff) - 1;
						i_57_ >>>= 8;
						if (i_58_ == anIntArray259[i_56_])
							continue while_79_;
					}
					i_57_ = anIntArrayArrayArray254[i][i_54_][i_55_];
					while (i_57_ != 0) {
						int i_59_ = (i_57_ & 0xff) - 1;
						i_57_ >>>= 8;
						if (i_59_ == anIntArray259[i_56_])
							continue while_79_;
					}
				}
				anIntArray259[i_56_] = -1;
				method198(i_56_);
			}
		}
	}

	private static void method197(int i, Light light, int param1, int param2, int param3) {
		int i_63_ = i + 16384 + 4;
		GL gl = RT4GL.gl;
		if (!aBooleanArray255[i]) {
			gl.glEnable(i_63_);
			aBooleanArray255[i] = true;
		}
		gl.glLightf(i_63_, 4617, light.aFloat1111);
		gl.glLightfv(i_63_, 4609, light.params, 0);
		params[0] = (float) (light.param1 - param1);
		params[1] = (float) (light.param2 - param2);
		params[2] = (float) (light.param3 - param3);
		gl.glLightfv(i_63_, 4611, params, 0);
	}

	private static void method198(int i) {
		if (aBooleanArray255[i]) {
			aBooleanArray255[i] = false;
			int i_64_ = i + 16384 + 4;
			GL gl = RT4GL.gl;
			gl.glDisable(i_64_);
		}
	}

	public static void method199() {
		for (int i = 0; i < lightCount; i++) {
			Light light = lights[i];
			int i_65_ = light.anInt1125;
			if (light.aBoolean1112)
				i_65_ = 0;
			int i_66_ = light.anInt1125;
			if (light.aBoolean1123)
				i_66_ = 3;
			for (int i_67_ = i_65_; i_67_ <= i_66_; i_67_++) {
				int i_68_ = 0;
				int i_69_ = (light.param3 >> 7) - light.anInt1120;
				if (i_69_ < 0) {
					i_68_ -= i_69_;
					i_69_ = 0;
				}
				int i_70_ = (light.param3 >> 7) + light.anInt1120;
				if (i_70_ > anInt249 - 1)
					i_70_ = anInt249 - 1;
				for (int i_71_ = i_69_; i_71_ <= i_70_; i_71_++) {
					int i_72_ = light.aShortArray1106[i_68_++];
					int i_73_ = ((light.param1 >> 7) - light.anInt1120 + (i_72_ >> 8));
					int i_74_ = i_73_ + (i_72_ & 0xff) - 1;
					if (i_73_ < 0)
						i_73_ = 0;
					if (i_74_ > anInt260 - 1)
						i_74_ = anInt260 - 1;
					for (int i_75_ = i_73_; i_75_ <= i_74_; i_75_++) {
						int i_76_ = anIntArrayArrayArray254[i_67_][i_75_][i_71_];
						if ((i_76_ & 0xff) == 0)
							anIntArrayArrayArray254[i_67_][i_75_][i_71_] = i_76_ | i + 1;
						else if ((i_76_ & 0xff00) == 0)
							anIntArrayArrayArray254[i_67_][i_75_][i_71_] = i_76_ | i + 1 << 8;
						else if ((i_76_ & 0xff0000) == 0)
							anIntArrayArrayArray254[i_67_][i_75_][i_71_] = i_76_ | i + 1 << 16;
						else if ((i_76_ & ~0xffffff) == 0)
							anIntArrayArrayArray254[i_67_][i_75_][i_71_] = i_76_ | i + 1 << 24;
					}
				}
			}
		}
	}

	public static void method200(Light light) {
		if (lightCount >= 255)
			System.out.println("Number of lights added exceeds maximum!");
		else
			lights[lightCount++] = light;
	}

	public static void method201() {
		lightCount = 0;
		for (int i = 0; i < anInt262; i++) {
			for (int i_77_ = 0; i_77_ < anInt260; i_77_++) {
				for (int i_78_ = 0; i_78_ < anInt249; i_78_++)
					anIntArrayArrayArray254[i][i_77_][i_78_] = 0;
			}
		}
	}
}
