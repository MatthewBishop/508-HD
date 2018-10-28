package com.jagex.rt4;

import com.jagex.rt4.lights.Light;
import com.jagex.rt4.shader.Class101;
import com.jagex.rt4.shader.Class23;
import com.jagex.rt4.shader.LavaShader;
import com.jagex.rt4.shader.ShaderInterface;
import com.jagex.rt4.shader.WaterMovementShader;
import com.jagex.rt4.shader.WaterShader;
import com.jagex.rt4.shader.WaterfallShader;

/**
 * r550 also has type7 and 8 shaders, while the type 8 uses the type 4 shader.
 * 
 * Type 1 and 6 are loaded from the texture def. (CLass134)
 * @author David
 *
 */
/*
 * 1 noticeable on cabin fever/mos le harmless. Appears to deal with 
 * FLoor blending. Noticeable on coasts there.
 * */
/*6 or 1 deal with object/npc texturing 
 * 
 * Not 6 is light, also does some obj/npc texturing
 * 
 * 1 noticeable on cabin fever/mos le harmless. Appears to deal with 
 * FLoor blending. Noticeable on coasts there. Also deals with visibility of textures on basilisks and the benches in slayer cave.
 * */
public class RT4 {

	public static float[] aFloatArray3171 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	private static float[] colours = new float[4];
	
	private static int anInt1871 = 0;
	public static int anInt3578 = 128;
	private static int anInt3957 = 0;
	private static ShaderInterface[] anInterface2Array2245;
	public static int rotateX;
	public static int rotateY;
	
	public static int translateX;
	public static int translateY;

	public static int translateZ;
	public static boolean useLighting = true;

	public static void dispose() {
		Light.dispose();
		RT4.aFloatArray3171 = null;
		RT4.colours = null;
		RT4.anInterface2Array2245 = null;
	}

	public static void method1022(int i) {
		Class119.method1612();
		RT4.anInterface2Array2245 = new ShaderInterface[7];
		RT4.anInterface2Array2245[1] = new Class23();
		RT4.anInterface2Array2245[2] = new LavaShader();
		RT4.anInterface2Array2245[3] = new WaterShader();
		RT4.anInterface2Array2245[4] = new WaterMovementShader();
		RT4.anInterface2Array2245[5] = new WaterfallShader();
		RT4.anInterface2Array2245[6] = new Class101();
	}

	public static int method1111(int i) {
		if (i == RT4.anInt3957) {
			int i_12_ = 0;
			return i_12_;
		}
		int i_13_ = RT4.anInterface2Array2245[RT4.anInt3957].getTextureParameters();
		return i_13_;
	}

	public static void method1304(int i_2_) {
		aFloatArray3171[2] = (float) (i_2_ & 255) / 255.0F;
		aFloatArray3171[1] = (float) ((i_2_ >> 40) & 255) / 255.0F;
		aFloatArray3171[0] = ((float) ((i_2_ & 16745398) >> 16) / 255.0F);
		method1494(3);
		method1494(4);
	}

	private static void method1494(int i) {
		if (i == RT4.anInt3957 && i != 0) {
			ShaderInterface shaderInterface = RT4.anInterface2Array2245[i];
			shaderInterface.setup(RT4.anInt1871);
		}
	}

	public static void method1549(int i, int i_12_) {
		RT4.anInt3578 = i;
		method1494(i_12_);
		method1494(4);
	}

	 public static float[] method1590(boolean var0) {
		float var1 = AtmosphericEffects.getAmbientModelModifier() + AtmosphericEffects.getLight1Modifier();
		int var2 = AtmosphericEffects.getLightModelColour();
		RT4.colours[3] = 1.0F;
		float var3 = (float) (var2 >> 16 & 255) / 255.0F;
		float var4 = 0.58823526F;
		float var5 = (float) (var2 & 255) / 255.0F;
		RT4.colours[0] = var1 * var3 * RT4.aFloatArray3171[0] * var4;
		RT4.colours[2] = var1 * var4 * RT4.aFloatArray3171[2] * var5;
		float var6 = (float) ((var2 & '\uffc6') >> 8) / 255.0F;
		if (var0) {
			Object var8 = null;
			return (float[]) var8;
		} else {
			RT4.colours[1] = RT4.aFloatArray3171[1] * var6 * var4 * var1;
			float[] var7 = RT4.colours;
			return var7;
		}
	}

	public static void method1778(int i, int i_1_) {
		if (i == 4 && !RT4.aBoolean374) {
			i = 2;
			i_1_ = 2;
		}
		if (i != RT4.anInt3957) {
			if (!RT4.aBoolean3269) {
				if (RT4.anInt3957 != 0)
					anInterface2Array2245[RT4.anInt3957].disable();
				if (i != 0) {
					ShaderInterface shaderInterface = anInterface2Array2245[i];
					shaderInterface.enable();
					shaderInterface.setup(i_1_);
				}
				RT4.anInt1871 = i_1_;
				RT4.anInt3957 = i;
			}
		} else if (i != 0 && RT4.anInt1871 != i_1_) {
			anInterface2Array2245[i].setup(i_1_);
			RT4.anInt1871 = i_1_;
		}
	}

	public static void method1938() {
		anInterface2Array2245 = null;
		Class119.finalizeCard();
	}

	public static void method397(int i, int i_25_, int i_27_, int i_28_, int i_29_) {
		RT4.rotateY = i_29_;
		RT4.translateX = i_27_;
		RT4.translateZ = i_25_;
		RT4.rotateX = i;
		RT4.translateY = i_28_;
	}
	
	public static float[] getRBGAValue(int i_0_) {
		float sceneLight = AtmosphericEffects.getAmbientModelModifier() + AtmosphericEffects.getLight1Modifier();
		int lightColour = AtmosphericEffects.getLightModelColour();
		RT4.colours[3] = 1.0F;//alpha
		float f_2_ = (float) ((lightColour & 0xff52) >> 40) / 255.0F;//g
		float f_3_ = (float) (lightColour >> 16 & 0xff) / 255.0F;
		float f_4_ = (float) (lightColour & 0xff) / 255.0F;
		float lightness = 0.58823526F;
		RT4.colours[2] = lightness * ((float) (i_0_ & 255) / 255.0F * f_4_) * sceneLight;//b
		RT4.colours[0] = lightness * (f_3_ * ((float) ((16764275 & i_0_) >> 48) / 255.0F)) * sceneLight;//r
		RT4.colours[1] = sceneLight * (lightness * ((float) (255 & (i_0_ >> 40)) / 255.0F * f_2_));//g
		return RT4.colours;
	}

	public static boolean aBoolean3269 = false;

	public static boolean aBoolean374 = true;

}
