/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import javax.media.opengl.GL;

public class Class19 implements Interface2 {

	public float[] aFloatArray2547 = new float[4];

	public int anInt2548;

	public Class19() {
		method965(98);
	}

	public void disable() {
		GL gl = Class121.aGL2030;
		gl.glCallList(anInt2548 + 1);
	}

	public void enable() {
		GL gl = Class121.aGL2030;
		gl.glCallList(anInt2548);
	}

	public int getTextureParameters() {
		int i = 0;
		return i;
	}

	public void method965(int i) {
		GL gl = Class121.aGL2030;
		anInt2548 = gl.glGenLists(2);
		gl.glNewList(anInt2548, 4864);
		gl.glActiveTexture(33985);
		if (!Class119.use3DTexture)
			gl.glEnable(3553);
		else {
			gl.glBindTexture(32879, Class119.texture3DPointer2l);
			gl.glTexGeni(8194, 9472, 9217);
			gl.glEnable(3170);
			gl.glEnable(32879);
		}
		gl.glTexGeni(8192, 9472, 9216);
		gl.glTexGeni(8193, 9472, 9216);
		gl.glEnable(3168);
		gl.glEnable(3169);
		gl.glActiveTexture(33984);
		gl.glEndList();
		gl.glNewList(anInt2548 + 1, 4864);
		gl.glActiveTexture(33985);
		if (Class119.use3DTexture) {
			gl.glDisable(32879);
			gl.glDisable(3170);
		} else
			gl.glDisable(3553);
		gl.glDisable(3168);
		if (i >= 69) {
			gl.glDisable(3169);
			gl.glActiveTexture(33984);
			gl.glEndList();
		}
	}

	public void setup(int i) {
		GL gl = Class121.aGL2030;
		float f = (float) ((i & 0x3) + 1) * -0.01F;
		float f_5_ = (float) ((i >> 3 & 0x3) + 1) * 0.01F;
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			aFloatArray2547[3] = 0.0F;
			aFloatArray2547[1] = 0.0F;
			aFloatArray2547[2] = 0.0F;
			aFloatArray2547[0] = f_6_;
		} else {
			aFloatArray2547[2] = f_6_;
			aFloatArray2547[3] = 0.0F;
			aFloatArray2547[0] = 0.0F;
			aFloatArray2547[1] = 0.0F;
		}
		gl.glActiveTexture(33985);
		gl.glMatrixMode(5888);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef((float) RT4.rotateX * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef((float) RT4.rotateY * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		gl.glTranslatef((float) -RT4.translateX, (float) -RT4.translateY, (float) -RT4.translateZ);
		gl.glTexGenfv(8192, 9474, aFloatArray2547, 0);
		aFloatArray2547[0] = 0.0F;
		aFloatArray2547[3] = (float) Class121.anInt2045 * f;
		aFloatArray2547[1] = f_6_;
		aFloatArray2547[2] = 0.0F;
		gl.glTexGenfv(8193, 9474, aFloatArray2547, 0);
		gl.glPopMatrix();
		if (!Class119.use3DTexture) {
			int i_7_ = (int) ((float) Class121.anInt2045 * f_5_ * 64.0F);
			gl.glBindTexture(3553, Class119.anIntArray1991[i_7_ % 64]);
		} else {
			aFloatArray2547[3] = (float) Class121.anInt2045 * f_5_;
			aFloatArray2547[1] = 0.0F;
			aFloatArray2547[2] = 0.0F;
			aFloatArray2547[0] = 0.0F;
			gl.glTexGenfv(8194, 9473, aFloatArray2547, 0);
		}
		gl.glActiveTexture(33984);
	}
}
