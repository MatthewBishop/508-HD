/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class34 implements Interface2 {
	public static float[] aFloatArray2560 = { 0.1F, 0.1F, 0.15F, 0.1F };
	public int anInt2561;
	public int anInt2562 = -1;
	public int anInt2563;
	public float[] aFloatArray2564;

	public void method1089() {
		GL gl = Class121.aGL2030;
		anInt2562 = gl.glGenLists(2);
		gl.glNewList(anInt2562, 4864);
		gl.glTexEnvi(8960, 34192, 768);
		gl.glTexEnvi(8960, 34177, 34166);
		gl.glTexEnvf(8960, 34163, 2.0F);
		gl.glTexEnvi(8960, 34185, 34166);
		gl.glTexGeni(8192, 9472, 9217);
		gl.glTexGeni(8193, 9472, 9217);
		gl.glTexGenfv(8192, 9473, new float[] { 9.765625E-4F, 0.0F, 0.0F, 0.0F }, 0);
		gl.glTexGenfv(8193, 9473, new float[] { 0.0F, 0.0F, 9.765625E-4F, 0.0F }, 0);
		gl.glEnable(3168);
		gl.glEnable(3169);
		if (Class119.use3DTexture) {
			gl.glBindTexture(32879, Class119.texture3DPointer2);
			gl.glTexGeni(8194, 9472, 9217);
			gl.glTexGeni(8195, 9472, 9217);
			gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(3170);
			gl.glEnable(3171);
			gl.glEnable(32879);
		}
		gl.glActiveTexture(33985);
		gl.glEnable(3552);
		gl.glBindTexture(3552, anInt2561);
		gl.glTexEnvi(8960, 34161, 34165);
		gl.glTexEnvi(8960, 34176, 34166);
		gl.glTexEnvi(8960, 34178, 5890);
		gl.glTexEnvi(8960, 34162, 34165);
		gl.glTexEnvi(8960, 34184, 34166);
		gl.glTexEnvi(8960, 34186, 5890);
		gl.glEnable(3168);
		gl.glTexGeni(8192, 9472, 9216);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glEndList();
		gl.glNewList(anInt2562 + 1, 4864);
		gl.glActiveTexture(33985);
		gl.glDisable(3552);
		gl.glDisable(3168);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34176, 5890);
		gl.glTexEnvi(8960, 34178, 34166);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glTexEnvi(8960, 34186, 34166);
		gl.glActiveTexture(33984);
		gl.glTexEnvi(8960, 34192, 768);
		gl.glTexEnvi(8960, 34177, 34168);
		gl.glTexEnvf(8960, 34163, 1.0F);
		gl.glTexEnvi(8960, 34185, 34168);
		gl.glDisable(3168);
		gl.glDisable(3169);
		if (Class119.use3DTexture) {
			gl.glDisable(3170);
			gl.glDisable(3171);
			gl.glDisable(32879);
		}
		gl.glEndList();
	}

	public static void method1090() {
		aFloatArray2560 = null;
	}

	public int getTextureParameters() {
		return 15;
	}

	public void setup(int i) {
		GL gl = Class121.aGL2030;
		gl.glActiveTexture(33985);
		gl.glTexEnvfv(8960, 8705, RT4.aFloatArray3171, 0);
		gl.glActiveTexture(33984);
	}

	public void disable() {
		Class121.aGL2030.glCallList(anInt2562 + 1);
	}

	public void enable() {
		GL gl = Class121.aGL2030;
		Class121.method1638(2);
		Class121.method1656(2);
		Class121.method1651();
		gl.glCallList(anInt2562);
		float f = 2662.4001F;
		f += (float) (RT4.rotateX - 128) * 0.5F;
		if (f >= 3328.0F)
			f = 3327.0F;
		aFloatArray2564[0] = 0.0F;
		aFloatArray2564[1] = 0.0F;
		aFloatArray2564[2] = 1.0F / (f - 3328.0F);
		aFloatArray2564[3] = f / (f - 3328.0F);
		gl.glTexGenfv(8192, 9474, aFloatArray2564, 0);
		gl.glPopMatrix();
		gl.glActiveTexture(33984);
		gl.glTexEnvfv(8960, 8705, aFloatArray2560, 0);
		if (Class119.use3DTexture) {
			if (anInt2563 != Class121.anInt2045) {
				aFloatArray2564[0] = 0.0F;
				aFloatArray2564[1] = 0.0F;
				aFloatArray2564[2] = 0.0F;
				aFloatArray2564[3] = (float) Class121.anInt2045 * 0.005F;
				gl.glTexGenfv(8194, 9473, aFloatArray2564, 0);
				anInt2563 = Class121.anInt2045;
			}
		} else
			Class121.method1632(Class119.textureIds2[Class121.anInt2045 * 64 / 100 % 64]);
	}

	public void method1091() {
		byte[] is = new byte[2];
		is[0] = (byte) 0;
		is[1] = (byte) -1;
		GL gl = Class121.aGL2030;
		int[] is_0_ = new int[1];
		gl.glGenTextures(1, is_0_, 0);
		gl.glBindTexture(3552, is_0_[0]);
		gl.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(is));
		gl.glTexParameteri(3552, 10241, 9729);
		gl.glTexParameteri(3552, 10240, 9729);
		gl.glTexParameteri(3552, 10242, 33071);
		anInt2561 = is_0_[0];
	}

	public Class34() {
		anInt2561 = -1;
		anInt2563 = -1;
		aFloatArray2564 = new float[4];
		method1091();
		method1089();
	}
}
