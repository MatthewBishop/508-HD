/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.shader;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.rt4.CardMemManager;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

public class Class23 implements ShaderInterface {
	private static int C12 = 12;
	private static int C96 = 96;
	private static int C36 = 36;

	private boolean aBoolean2555;
	private int listIndex;

	private int[] anIntArray2557 = null;

	public Class23() {
		this.aBoolean2555 = false;
		this.listIndex = -1;
		if (RT4GL.has_cubemap && RT4GL.maxTextureUnits >= 2) {
			this.method989();
			GL gl = RT4GL.gl;
			gl.glBindTexture(34067, this.anIntArray2557[0]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, this.anIntArray2557[1]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, this.anIntArray2557[2]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			this.aBoolean2555 = RT4GL.maxTextureUnits < 3;
		}
		this.method990();
	}

	public void disable() {
		GL gl = RT4GL.gl;
		if (RT4.useLighting)
			gl.glCallList(this.listIndex + 1);
		else
			gl.glTexEnvi(8960, 34184, 5890);
	}

	public void enable() {
		GL gl = RT4GL.gl;
		if (RT4.useLighting) {
			RT4GL.setAlphaCombineMode(1);
			gl.glCallList(this.listIndex);
		} else
			gl.glTexEnvi(8960, 34184, 34167);
	}

	public int getTextureParameters() {
		return 4;
	}

	private void method989() {
		GL gl = RT4GL.gl;
		if (this.anIntArray2557 == null) {
			this.anIntArray2557 = new int[3];
			gl.glGenTextures(3, this.anIntArray2557, 0);
		}
		int i = 4096;
		byte[] is = new byte[i];
		byte[] is_0_ = new byte[i];
		byte[] is_1_ = new byte[i];
		for (int i_2_ = 0; i_2_ < 6; i_2_++) {
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					float f = i_5_ * 2.0F / 64.0F - 1.0F;
					float f_6_ = i_4_ * 2.0F / 64.0F - 1.0F;
					float f_7_ = (float) (1.0 / Math.sqrt(f * f + 1.0F + f_6_ * f_6_));
					f *= f_7_;
					f_6_ *= f_7_;
					float f_8_;
					if (i_2_ == 0)
						f_8_ = -f;
					else if (i_2_ == 1)
						f_8_ = f;
					else if (i_2_ == 2)
						f_8_ = f_6_;
					else if (i_2_ == 3)
						f_8_ = -f_6_;
					else if (i_2_ == 4)
						f_8_ = f_7_;
					else
						f_8_ = -f_7_;
					int i_9_;
					int i_10_;
					int i_11_;
					if (f_8_ > 0.0F) {
						i_9_ = (int) (Math.pow(f_8_, Class23.C96) * 255.0);
						i_10_ = (int) (Math.pow(f_8_, Class23.C36) * 255.0);
						i_11_ = (int) (Math.pow(f_8_, Class23.C12) * 255.0);
					} else
						i_9_ = i_10_ = i_11_ = 0;
					if (RT4GL.maxTextureUnits < 3) {
						i_9_ /= 5;
						i_10_ /= 5;
						i_11_ /= 5;
					} else {
						i_9_ /= 2;
						i_10_ /= 2;
						i_11_ /= 2;
					}
					is_0_[i_3_] = (byte) i_9_;
					is_1_[i_3_] = (byte) i_10_;
					is[i_3_] = (byte) i_11_;
					i_3_++;
				}
			}
			gl.glBindTexture(34067, this.anIntArray2557[0]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_0_));
			gl.glBindTexture(34067, this.anIntArray2557[1]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_1_));
			gl.glBindTexture(34067, this.anIntArray2557[2]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is));
			CardMemManager.textureMemory += i * 3;
		}
	}

	private void method990() {
		GL gl = RT4GL.gl;
		this.listIndex = gl.glGenLists(2);
		gl.glNewList(this.listIndex, 4864);
		if (this.anIntArray2557 != null) {
			gl.glActiveTexture(33985);
			gl.glTexGeni(8192, 9472, 34065);
			gl.glTexGeni(8193, 9472, 34065);
			gl.glTexGeni(8194, 9472, 34065);
			gl.glEnable(3168);
			gl.glEnable(3169);
			gl.glEnable(3170);
			gl.glEnable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
			gl.glMatrixMode(5888);
			if (!this.aBoolean2555) {
				gl.glTexEnvi(8960, 34161, 7681);
				gl.glTexEnvi(8960, 34176, 34168);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glActiveTexture(33986);
				gl.glTexEnvi(8960, 8704, 34160);
				gl.glTexEnvi(8960, 34161, 260);
				gl.glTexEnvi(8960, 34176, 34168);
				gl.glTexEnvi(8960, 34177, 34168);
				gl.glTexEnvi(8960, 34193, 770);
				gl.glTexEnvi(8960, 34162, 7681);
				gl.glTexEnvi(8960, 34184, 34167);
				gl.glBindTexture(3553, RT4GL.generated_texture_id);
				gl.glEnable(3553);
			} else {
				gl.glTexEnvi(8960, 34161, 260);
				gl.glTexEnvi(8960, 34192, 770);
				gl.glTexEnvi(8960, 34162, 7681);
				gl.glTexEnvi(8960, 34184, 34167);
			}
			gl.glActiveTexture(33984);
		} else
			gl.glTexEnvi(8960, 34184, 34167);
		gl.glEndList();
		gl.glNewList(this.listIndex + 1, 4864);
		if (this.anIntArray2557 != null) {
			gl.glActiveTexture(33985);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			if (!this.aBoolean2555) {
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34176, 5890);
				gl.glActiveTexture(33986);
				gl.glTexEnvi(8960, 8704, 8448);
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34176, 5890);
				gl.glTexEnvi(8960, 34193, 768);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glTexEnvi(8960, 34184, 5890);
				gl.glDisable(3553);
			} else {
				gl.glTexEnvi(8960, 34161, 8448);
				gl.glTexEnvi(8960, 34192, 768);
				gl.glTexEnvi(8960, 34162, 8448);
				gl.glTexEnvi(8960, 34184, 5890);
			}
			gl.glActiveTexture(33984);
		} else
			gl.glTexEnvi(8960, 34184, 5890);
		gl.glEndList();
	}

	public void setup(int i) {
		GL gl = RT4GL.gl;
		if (RT4.useLighting && this.anIntArray2557 != null) {
			gl.glActiveTexture(33985);
			gl.glBindTexture(34067, this.anIntArray2557[i - 1]);
			gl.glActiveTexture(33984);
		}
	}
}
