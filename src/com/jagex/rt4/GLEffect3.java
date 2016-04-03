/* Class8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class GLEffect3 implements ShaderInterface {
	public int gradientAlpha = -1;
	public static boolean texture1or2 = false;
	public int listPointer;
	public float[] texGenParameters = new float[4];

	public void setup(int i) {
		GL gl = RT4GL.gl;
		gl.glActiveTexture(33985);
		if (texture1or2 || i >= 0) {
			gl.glPushMatrix();
			gl.glLoadIdentity();
			gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef((float) RT4.rotateX * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(((float) RT4.rotateY * 360.0F / 2048.0F), 0.0F, 1.0F, 0.0F);
			gl.glTranslatef((float) -RT4.translateX, (float) -RT4.translateY,
					(float) -RT4.translateZ);
			if (texture1or2) {
				texGenParameters[0] = 0.001F;
				texGenParameters[1] = 9.0E-4F;
				texGenParameters[2] = 0.0F;
				texGenParameters[3] = 0.0F;
				gl.glTexGenfv(8192, 9474, texGenParameters, 0);
				texGenParameters[0] = 0.0F;
				texGenParameters[1] = 9.0E-4F;
				texGenParameters[2] = 0.001F;
				texGenParameters[3] = 0.0F;
				gl.glTexGenfv(8193, 9474, texGenParameters, 0);
				texGenParameters[0] = 0.0F;
				texGenParameters[1] = 0.0F;
				texGenParameters[2] = 0.0F;
				texGenParameters[3] = (float) RT4GL.anInt2045 * 0.01F;
				gl.glTexGenfv(8194, 9474, texGenParameters, 0);
				gl.glActiveTexture(33986);
			}
			gl.glTexEnvfv(8960, 8705, RT4.method1590(false), 0);
			if (i >= 0) {
				texGenParameters[0] = 0.0F;
				texGenParameters[1] = 1.0F / (float) RT4.anInt3578;
				texGenParameters[2] = 0.0F;
				texGenParameters[3] = (float) i * 1.0F / (float) RT4.anInt3578;
				gl.glTexGenfv(8192, 9474, texGenParameters, 0);
				gl.glEnable(3168);
			} else
				gl.glDisable(3168);
			gl.glPopMatrix();
		} else
			gl.glDisable(3168);
		gl.glActiveTexture(33984);
	}

	public void disable() {
		GL gl = RT4GL.gl;
		gl.glCallList(listPointer + 1);
	}

	public static void enableTexCoordArray() {
		GL gl = RT4GL.gl;
		gl.glClientActiveTexture(getActiveTexture());
		gl.glEnableClientState(32888);
		gl.glClientActiveTexture(33984);
	}

	public static void disableTexCoordArray() {
		GL gl = RT4GL.gl;
		gl.glClientActiveTexture(getActiveTexture());
		gl.glDisableClientState(32888);
		gl.glClientActiveTexture(33984);
	}

	public void enable() {
		GL gl = RT4GL.gl;
		gl.glCallList(listPointer);
	}

	public int getTextureParameters() {
		return 0;
	}

	public static int getActiveTexture() {
		return texture1or2 ? 33986 : 33985;
	}

	public void createLists() {
		GL gl = RT4GL.gl;
		listPointer = gl.glGenLists(2);
		gl.glNewList(listPointer, 4864);
		gl.glActiveTexture(33985);
		if (texture1or2) {
			gl.glBindTexture(32879, Class119.texture3DPointer2);
			gl.glTexEnvi(8960, 34161, 260);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glTexEnvi(8960, 34162, 7681);
			gl.glTexEnvi(8960, 34184, 34168);
			gl.glTexGeni(8192, 9472, 9216);
			gl.glTexGeni(8194, 9472, 9216);
			gl.glTexGeni(8193, 9472, 9216);
			gl.glTexGeni(8195, 9472, 9217);
			gl.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(3171);
			gl.glEnable(32879);
			gl.glActiveTexture(33986);
			gl.glTexEnvi(8960, 8704, 34160);
		}
		gl.glBindTexture(3552, gradientAlpha);
		gl.glTexEnvi(8960, 34161, 34165);
		gl.glTexEnvi(8960, 34176, 34166);
		gl.glTexEnvi(8960, 34178, 5890);
		gl.glTexEnvi(8960, 34162, 7681);
		gl.glTexEnvi(8960, 34184, 34168);
		gl.glTexGeni(8192, 9472, 9216);
		gl.glEnable(3552);
		gl.glEnable(3168);
		gl.glActiveTexture(33984);
		gl.glEndList();
		gl.glNewList(listPointer + 1, 4864);
		gl.glActiveTexture(33985);
		if (texture1or2) {
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glTexEnvi(8960, 34162, 8448);
			gl.glTexEnvi(8960, 34184, 5890);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(3171);
			gl.glDisable(32879);
			gl.glActiveTexture(33986);
			gl.glTexEnvi(8960, 8704, 8448);
		}
		gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 1.0F, 0.0F, 1.0F }, 0);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34176, 5890);
		gl.glTexEnvi(8960, 34178, 34166);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glDisable(3552);
		gl.glDisable(3168);
		gl.glActiveTexture(33984);
		gl.glEndList();
	}

	public GLEffect3() {
		listPointer = -1;
		if (RT4GL.maxTextureUnits >= 2) {
			int[] is = new int[1];
			byte[] is_0_ = new byte[8];
			int i = 0;
			while (i < 8)
				is_0_[i++] = (byte) (i * 159 / 8 + 96);
			GL gl = RT4GL.gl;
			gl.glGenTextures(1, is, 0);
			gl.glBindTexture(3552, is[0]);
			gl.glTexImage1D(3552, 0, 6406, 8, 0, 6406, 5121, ByteBuffer.wrap(is_0_));
			gl.glTexParameteri(3552, 10241, 9729);
			gl.glTexParameteri(3552, 10240, 9729);
			gl.glTexParameteri(3552, 10242, 33071);
			gradientAlpha = is[0];
			texture1or2 = RT4GL.maxTextureUnits > 2 && RT4GL.aBoolean2042;
			createLists();
		}
	}
}
