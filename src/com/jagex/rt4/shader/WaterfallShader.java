/* Class19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.shader;

import javax.media.opengl.GL;

import com.jagex.rt4.Class119;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

public class WaterfallShader implements ShaderInterface {

	public float[] aFloatArray2547 = new float[4];

	public int anInt2548;

	public WaterfallShader() {
		this.method965(98);
	}

	public void disable() {
		GL gl = RT4GL.gl;
		gl.glCallList(this.anInt2548 + 1);
	}

	public void enable() {
		GL gl = RT4GL.gl;
		gl.glCallList(this.anInt2548);
	}

	public int getTextureParameters() {
		int i = 0;
		return i;
	}

	public void method965(int i) {
		GL gl = RT4GL.gl;
		this.anInt2548 = gl.glGenLists(2);
		gl.glNewList(this.anInt2548, 4864);
		gl.glActiveTexture(33985);
		if (!Class119.allows3DTextureMapping)
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
		gl.glNewList(this.anInt2548 + 1, 4864);
		gl.glActiveTexture(33985);
		if (Class119.allows3DTextureMapping) {
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
		GL gl = RT4GL.gl;
		float f = ((i & 0x3) + 1) * -0.01F;
		float f_5_ = ((i >> 3 & 0x3) + 1) * 0.01F;
		float f_6_ = (i & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		boolean bool = (i & 0x80) != 0;
		if (bool) {
			this.aFloatArray2547[3] = 0.0F;
			this.aFloatArray2547[1] = 0.0F;
			this.aFloatArray2547[2] = 0.0F;
			this.aFloatArray2547[0] = f_6_;
		} else {
			this.aFloatArray2547[2] = f_6_;
			this.aFloatArray2547[3] = 0.0F;
			this.aFloatArray2547[0] = 0.0F;
			this.aFloatArray2547[1] = 0.0F;
		}
		gl.glActiveTexture(33985);
		gl.glMatrixMode(5888);
		gl.glPushMatrix();
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef(RT4.rotateX * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
		gl.glRotatef(RT4.rotateY * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
		gl.glTranslatef(-RT4.translateX, -RT4.translateY, -RT4.translateZ);
		gl.glTexGenfv(8192, 9474, this.aFloatArray2547, 0);
		this.aFloatArray2547[0] = 0.0F;
		this.aFloatArray2547[3] = RT4GL.loopCycleWrapper * f;
		this.aFloatArray2547[1] = f_6_;
		this.aFloatArray2547[2] = 0.0F;
		gl.glTexGenfv(8193, 9474, this.aFloatArray2547, 0);
		gl.glPopMatrix();
		if (!Class119.allows3DTextureMapping) {
			int i_7_ = (int) (RT4GL.loopCycleWrapper * f_5_ * 64.0F);
			gl.glBindTexture(3553, Class119.anIntArray1991[i_7_ % 64]);
		} else {
			this.aFloatArray2547[3] = RT4GL.loopCycleWrapper * f_5_;
			this.aFloatArray2547[1] = 0.0F;
			this.aFloatArray2547[2] = 0.0F;
			this.aFloatArray2547[0] = 0.0F;
			gl.glTexGenfv(8194, 9473, this.aFloatArray2547, 0);
		}
		gl.glActiveTexture(33984);
	}
}
