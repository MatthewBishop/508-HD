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
	public static int lightZ;
	public static int defaultFogColour;
	public static float light2Modifier;
	public static int lightModelColour = -1;
	public static float light1Modifier;
	public static float[] fogColourComponents;
	public static int lightX;
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

	public static void setLightModel(int color, float _ambientModelModifier, float _light1Modifier, float _light2Modifier) {
		if (lightModelColour != color || ambientModelModifier != _ambientModelModifier || light1Modifier != _light1Modifier || light2Modifier != _light2Modifier) {
			lightModelColour = color;
			ambientModelModifier = _ambientModelModifier;
			light1Modifier = _light1Modifier;
			light2Modifier = _light2Modifier;
			GL gl = RT4GL.gl;
			float r = (float) (color >> 16 & 0xff) / 255.0F;
			float g = (float) (color >> 8 & 0xff) / 255.0F;
			float b = (float) (color & 0xff) / 255.0F;
			float[] fs = { _ambientModelModifier * r, _ambientModelModifier * g, _ambientModelModifier * b, 1.0F };
			gl.glLightModelfv(2899, fs, 0);
			float[] fs_5_ = { _light1Modifier * r, _light1Modifier * g, _light1Modifier * b, 1.0F };
			gl.glLightfv(16384, 4609, fs_5_, 0);
			float[] fs_6_ = { -_light2Modifier * r, -_light2Modifier * g, -_light2Modifier * b, 1.0F };
			gl.glLightfv(16385, 4609, fs_6_, 0);
		}
	}

	public static float getLight1Modifier() {
		return light1Modifier;
	}

	public static void setFogProperties(int fog_color_rgb, int fog_length) {
		if (fogColour != fog_color_rgb || fogDistanceModifier != fog_length) {
			fogColour = fog_color_rgb;
			fogDistanceModifier = fog_length;
			GL gl = RT4GL.gl;
			int i_8_ = 50;
			int fogEnd = 3584;
			fogColourComponents[0] = (float) (fog_color_rgb >> 16 & 0xff) / 255.0F;
			fogColourComponents[1] = (float) (fog_color_rgb >> 8 & 0xff) / 255.0F;
			fogColourComponents[2] = (float) (fog_color_rgb & 0xff) / 255.0F;
			gl.glFogi(2917, 9729);
			gl.glFogf(2914, 0.95F);
			gl.glHint(3156, 4353);
			int fogStart = fogEnd - 512 - fog_length;
			if (fogStart < i_8_)
				fogStart = i_8_;
			gl.glFogf(2915, (float) fogStart);
			gl.glFogf(2916, (float) (fogEnd - 256));
			gl.glFogfv(2918, fogColourComponents, 0);
		}
	}

	public static int getLightModelColour() {
		return lightModelColour;
	}

	public static void setSunPosition(float light_x, float light_y, float light_z) {
		if (light0Position[0] != light_x || light0Position[1] != light_y || light0Position[2] != light_z) {
			light0Position[0] = light_x;
			light0Position[1] = light_y;
			light0Position[2] = light_z;
			light1Position[0] = -light_x;
			light1Position[1] = -light_y;
			light1Position[2] = -light_z;
			lightX = (int) (light_x * 256.0F / light_y);
			lightZ = (int) (light_z * 256.0F / light_y);
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
