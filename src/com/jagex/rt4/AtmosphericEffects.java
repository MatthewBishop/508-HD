/* Class57 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import javax.media.opengl.GL;

public class AtmosphericEffects {
	public static int fogDistanceModifier = -1;
	public static float[] light1Position = new float[4];
	public static float ambientModelModifier;
	public static float[] light0Position;
	public static int anInt928;
	public static int defaultFogColour;
	public static float light2Modifier;
	public static int lightModelColour = -1;
	public static float light1Modifier;
	public static float[] fogColourComponents;
	public static int anInt934;
	public static int defaultSunColour;
	public static int fogColour;

	static {
		light0Position = new float[4];
		light1Modifier = -1.0F;
		light2Modifier = -1.0F;
		fogColourComponents = new float[4];
		defaultSunColour = 16777215;
		defaultFogColour = 13156520;
		fogColour = -1;
	}

	public static void dispose() {
		light0Position = null;
		light1Position = null;
		fogColourComponents = null;
	}

	public static void loadLightPositions() {
		GL gl = RT4GL.gl;
		gl.glLightfv(16384, 4611, light0Position, 0);
		gl.glLightfv(16385, 4611, light1Position, 0);
	}

	public static void setFogColour(float[] fs) {
		if (fs == null)
			fs = fogColourComponents;
		GL gl = RT4GL.gl;
		gl.glFogfv(2918, fs, 0);
	}

	public static float getAmbientModelModifier() {
		return ambientModelModifier;
	}

	public static void setLightModel(int i, float f, float f_0_, float f_1_) {
		if (lightModelColour != i || ambientModelModifier != f || light1Modifier != f_0_ || light2Modifier != f_1_) {
			lightModelColour = i;
			ambientModelModifier = f;
			light1Modifier = f_0_;
			light2Modifier = f_1_;
			GL gl = RT4GL.gl;
			float f_2_ = (float) (i >> 16 & 0xff) / 255.0F;
			float f_3_ = (float) (i >> 8 & 0xff) / 255.0F;
			float f_4_ = (float) (i & 0xff) / 255.0F;
			float[] fs = { f * f_2_, f * f_3_, f * f_4_, 1.0F };
			gl.glLightModelfv(2899, fs, 0);
			float[] fs_5_ = { f_0_ * f_2_, f_0_ * f_3_, f_0_ * f_4_, 1.0F };
			gl.glLightfv(16384, 4609, fs_5_, 0);
			float[] fs_6_ = { -f_1_ * f_2_, -f_1_ * f_3_, -f_1_ * f_4_, 1.0F };
			gl.glLightfv(16385, 4609, fs_6_, 0);
		}
	}

	public static float getLight1Modifier() {
		return light1Modifier;
	}

	public static void setFogProperties(int i, int i_7_) {
		if (fogColour != i || fogDistanceModifier != i_7_) {
			fogColour = i;
			fogDistanceModifier = i_7_;
			GL gl = RT4GL.gl;
			int i_8_ = 50;
			int i_9_ = 3584;
			fogColourComponents[0] = (float) (i >> 16 & 0xff) / 255.0F;
			fogColourComponents[1] = (float) (i >> 8 & 0xff) / 255.0F;
			fogColourComponents[2] = (float) (i & 0xff) / 255.0F;
			gl.glFogi(2917, 9729);
			gl.glFogf(2914, 0.95F);
			gl.glHint(3156, 4353);
			int i_10_ = i_9_ - 512 - i_7_;
			if (i_10_ < i_8_)
				i_10_ = i_8_;
			gl.glFogf(2915, (float) i_10_);
			gl.glFogf(2916, (float) (i_9_ - 256));
			gl.glFogfv(2918, fogColourComponents, 0);
		}
	}

	public static int getLightModelColour() {
		return lightModelColour;
	}

	public static void setSunPosition(float f, float f_11_, float f_12_) {
		if (light0Position[0] != f || light0Position[1] != f_11_ || light0Position[2] != f_12_) {
			light0Position[0] = f;
			light0Position[1] = f_11_;
			light0Position[2] = f_12_;
			light1Position[0] = -f;
			light1Position[1] = -f_11_;
			light1Position[2] = -f_12_;
			anInt934 = (int) (f * 256.0F / f_11_);
			anInt928 = (int) (f_12_ * 256.0F / f_11_);
		}
	}

	public static void setupLighting() {
		GL gl = RT4GL.gl;
		gl.glColorMaterial(1028, 5634);
		gl.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16384, 4608, fs, 0);
		gl.glEnable(16384);
		float[] fs_13_ = { 0.0F, 0.0F, 0.0F, 1.0F };
		gl.glLightfv(16385, 4608, fs_13_, 0);
		gl.glEnable(16385);
		lightModelColour = -1;
		fogColour = -1;
		loadDefaults();
	}

	public static void loadDefaults() {
		setLightModel(defaultSunColour, 1.1523438F, 0.69921875F, 1.2F);
		setSunPosition(-50.0F, -60.0F, -50.0F);
		setFogProperties(defaultFogColour, 0);
	}
}
