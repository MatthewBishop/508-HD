/* Class23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class Class23 implements Interface2 {
	public static int anInt2554;
	public static int anInt2556 = 96;
	public static int anInt2559;
	static {
		anInt2554 = 12;
		anInt2559 = 36;
	}
	public boolean aBoolean2555;
	public int anInt2558;

	public int[] anIntArray2557 = null;

	public Class23() {
		aBoolean2555 = false;
		anInt2558 = -1;
		if (RT4GL.aBoolean2026 && RT4GL.anInt2019 >= 2) {
			method989();
			GL gl = RT4GL.gl;
			gl.glBindTexture(34067, anIntArray2557[0]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, anIntArray2557[1]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			gl.glBindTexture(34067, anIntArray2557[2]);
			gl.glTexParameteri(34067, 10241, 9729);
			gl.glTexParameteri(34067, 10240, 9729);
			gl.glTexParameteri(34067, 32882, 33071);
			gl.glTexParameteri(34067, 10242, 33071);
			gl.glTexParameteri(34067, 10243, 33071);
			aBoolean2555 = RT4GL.anInt2019 < 3;
		}
		method990();
	}

	public void disable() {
		GL gl = RT4GL.gl;
		if (RT4.useLighting)
			gl.glCallList(anInt2558 + 1);
		else
			gl.glTexEnvi(8960, 34184, 5890);
	}

	public void enable() {
		GL gl = RT4GL.gl;
		if (RT4.useLighting) {
			RT4GL.method1656(1);
			gl.glCallList(anInt2558);
		} else
			gl.glTexEnvi(8960, 34184, 34167);
	}

	public int getTextureParameters() {
		return 4;
	}

	public void method989() {
		GL gl = RT4GL.gl;
		if (anIntArray2557 == null) {
			anIntArray2557 = new int[3];
			gl.glGenTextures(3, anIntArray2557, 0);
		}
		int i = 4096;
		byte[] is = new byte[i];
		byte[] is_0_ = new byte[i];
		byte[] is_1_ = new byte[i];
		for (int i_2_ = 0; i_2_ < 6; i_2_++) {
			int i_3_ = 0;
			for (int i_4_ = 0; i_4_ < 64; i_4_++) {
				for (int i_5_ = 0; i_5_ < 64; i_5_++) {
					float f = (float) i_5_ * 2.0F / 64.0F - 1.0F;
					float f_6_ = (float) i_4_ * 2.0F / 64.0F - 1.0F;
					float f_7_ = (float) (1.0 / Math.sqrt((double) (f * f + 1.0F + f_6_ * f_6_)));
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
						i_9_ = (int) (Math.pow((double) f_8_, (double) anInt2556) * 255.0);
						i_10_ = (int) (Math.pow((double) f_8_, (double) anInt2559) * 255.0);
						i_11_ = (int) (Math.pow((double) f_8_, (double) anInt2554) * 255.0);
					} else
						i_9_ = i_10_ = i_11_ = 0;
					if (RT4GL.anInt2019 < 3) {
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
			gl.glBindTexture(34067, anIntArray2557[0]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_0_));
			gl.glBindTexture(34067, anIntArray2557[1]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is_1_));
			gl.glBindTexture(34067, anIntArray2557[2]);
			gl.glTexImage2D(i_2_ + 34069, 0, 6406, 64, 64, 0, 6406, 5121, ByteBuffer.wrap(is));
			Class11.textureMemory += i * 3;
		}
	}

	public void method990() {
		GL gl = RT4GL.gl;
		anInt2558 = gl.glGenLists(2);
		gl.glNewList(anInt2558, 4864);
		if (anIntArray2557 != null) {
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
			if (!aBoolean2555) {
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
				gl.glBindTexture(3553, RT4GL.anInt2038);
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
		gl.glNewList(anInt2558 + 1, 4864);
		if (anIntArray2557 != null) {
			gl.glActiveTexture(33985);
			gl.glDisable(3168);
			gl.glDisable(3169);
			gl.glDisable(3170);
			gl.glDisable(34067);
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			if (!aBoolean2555) {
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
		if (RT4.useLighting && anIntArray2557 != null) {
			gl.glActiveTexture(33985);
			gl.glBindTexture(34067, anIntArray2557[i - 1]);
			gl.glActiveTexture(33984);
		}
	}
}
