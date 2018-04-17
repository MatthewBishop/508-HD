/* Class34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.shader;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.rt4.Class119;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

public class WaterMovementShader implements ShaderInterface {
	private static float[] aFloatArray2560 = { 0.1F, 0.1F, 0.15F, 0.1F };
	private int anInt2561;
	private int anInt2562 = -1;
	private int anInt2563;
	private float[] aFloatArray2564;

	private void method1089() {
		GL gl = RT4GL.gl;
		this.anInt2562 = gl.glGenLists(2);
		gl.glNewList(this.anInt2562, 4864);
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
		if (Class119.allows3DTextureMapping) {
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
		gl.glBindTexture(3552, this.anInt2561);
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
		gl.glNewList(this.anInt2562 + 1, 4864);
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
		if (Class119.allows3DTextureMapping) {
			gl.glDisable(3170);
			gl.glDisable(3171);
			gl.glDisable(32879);
		}
		gl.glEndList();
	}

	public static void method1090() {
		WaterMovementShader.aFloatArray2560 = null;
	}

	public int getTextureParameters() {
		return 15;
	}

	public void setup(int i) {
		GL gl = RT4GL.gl;
		gl.glActiveTexture(33985);
		gl.glTexEnvfv(8960, 8705, RT4.aFloatArray3171, 0);
		gl.glActiveTexture(33984);
	}

	public void disable() {
		RT4GL.gl.glCallList(this.anInt2562 + 1);
	}

	public void enable() {
		GL gl = RT4GL.gl;
		RT4GL.method1638(2);
		RT4GL.method1656(2);
		RT4GL.method1651();
		gl.glCallList(this.anInt2562);
		float f = 2662.4001F;
		f += (RT4.rotateX - 128) * 0.5F;
		if (f >= 3328.0F)
			f = 3327.0F;
		this.aFloatArray2564[0] = 0.0F;
		this.aFloatArray2564[1] = 0.0F;
		this.aFloatArray2564[2] = 1.0F / (f - 3328.0F);
		this.aFloatArray2564[3] = f / (f - 3328.0F);
		gl.glTexGenfv(8192, 9474, this.aFloatArray2564, 0);
		gl.glPopMatrix();
		gl.glActiveTexture(33984);
		gl.glTexEnvfv(8960, 8705, WaterMovementShader.aFloatArray2560, 0);
		if (Class119.allows3DTextureMapping) {
			if (this.anInt2563 != RT4GL.loopCycleWrapper) {
				this.aFloatArray2564[0] = 0.0F;
				this.aFloatArray2564[1] = 0.0F;
				this.aFloatArray2564[2] = 0.0F;
				this.aFloatArray2564[3] = RT4GL.loopCycleWrapper * 0.005F;
				gl.glTexGenfv(8194, 9473, this.aFloatArray2564, 0);
				this.anInt2563 = RT4GL.loopCycleWrapper;
			}
		} else
			RT4GL.bindTexture2D(Class119.textureIds2[RT4GL.loopCycleWrapper * 64 / 100 % 64]);
	}

	private void method1091() {
		byte[] is = new byte[2];
		is[0] = (byte) 0;
		is[1] = (byte) -1;
		GL gl = RT4GL.gl;
		int[] is_0_ = new int[1];
		gl.glGenTextures(1, is_0_, 0);
		gl.glBindTexture(3552, is_0_[0]);
		gl.glTexImage1D(3552, 0, 6406, 2, 0, 6406, 5121, ByteBuffer.wrap(is));
		gl.glTexParameteri(3552, 10241, 9729);
		gl.glTexParameteri(3552, 10240, 9729);
		gl.glTexParameteri(3552, 10242, 33071);
		this.anInt2561 = is_0_[0];
	}

	public WaterMovementShader() {
		this.anInt2561 = -1;
		this.anInt2563 = -1;
		this.aFloatArray2564 = new float[4];
		this.method1091();
		this.method1089();
	}
}
