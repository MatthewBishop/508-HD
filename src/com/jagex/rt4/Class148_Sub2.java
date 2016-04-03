/* Class148_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import rs.tex.Class14_Sub8_Sub33;

public class Class148_Sub2 extends Class148 {
	public int anInt3690;
	public int anInt3691;
	public int anInt3692 = 0;
	public int anInt3693;
	public int anInt3694;
	public int anInt3695;
	public int anInt3696;

	public void method2001(int i, int i_0_) {
		RT4GL.method1622();
		i += anInt2375;
		i_0_ += anInt2374;
		GL gl = RT4GL.gl;
		RT4GL.method1632(anInt3691);
		method2012(1);
		gl.glTranslatef((float) i, (float) (RT4GL.anInt2034 - i_0_), 0.0F);
		gl.glCallList(anInt3694);
		gl.glLoadIdentity();
	}

	public void method1999(int i, int i_1_, int i_2_) {
		RT4GL.method1655();
		i += anInt2375;
		i_1_ += anInt2374;
		GL gl = RT4GL.gl;
		RT4GL.method1632(anInt3691);
		method2012(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) i_2_ / 256.0F);
		gl.glTranslatef((float) i, (float) (RT4GL.anInt2034 - i_1_), 0.0F);
		gl.glCallList(anInt3694);
		gl.glLoadIdentity();
	}

	public void method2011() {
		float f = (float) width / (float) anInt3696;
		float f_3_ = (float) height / (float) anInt3693;
		GL gl = RT4GL.gl;
		if (anInt3694 == -1) {
			anInt3694 = gl.glGenLists(1);
			anInt3690 = Class11.anInt267;
		}
		gl.glNewList(anInt3694, 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f((float) width, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, f_3_);
		gl.glVertex2f(0.0F, (float) -height);
		gl.glTexCoord2f(f, f_3_);
		gl.glVertex2f((float) width, (float) -height);
		gl.glEnd();
		gl.glEndList();
	}

	public void method2012(int i) {
		if (anInt3692 != i) {
			anInt3692 = i;
			GL gl = RT4GL.gl;
			if (i == 2) {
				gl.glTexParameteri(3553, 10241, 9729);
				gl.glTexParameteri(3553, 10240, 9729);
			} else {
				gl.glTexParameteri(3553, 10241, 9728);
				gl.glTexParameteri(3553, 10240, 9728);
			}
		}
	}

	public void finalize() throws Throwable {
		if (anInt3691 != -1) {
			Class11.method208(anInt3691, anInt3695, anInt3690);
			anInt3691 = -1;
			anInt3695 = 0;
		}
		if (anInt3694 != -1) {
			Class11.method206(anInt3694, anInt3690);
			anInt3694 = -1;
		}
		super.finalize();
	}

	public void method2013(byte[] is, int[] is_4_) {
		anInt3696 = Class14_Sub8_Sub33.method653(width);
		anInt3693 = Class14_Sub8_Sub33.method653(height);
		byte[] is_5_ = new byte[anInt3696 * anInt3693 * 4];
		int i = 0;
		int i_6_ = 0;
		for (int i_7_ = 0; i_7_ < height; i_7_++) {
			for (int i_8_ = 0; i_8_ < width; i_8_++) {
				byte i_9_ = is[i_6_++];
				if (i_9_ != 0) {
					int i_10_ = is_4_[i_9_];
					is_5_[i++] = (byte) (i_10_ >> 16);
					is_5_[i++] = (byte) (i_10_ >> 8);
					is_5_[i++] = (byte) i_10_;
					is_5_[i++] = (byte) -1;
				} else
					i += 4;
			}
			i += (anInt3696 - width) * 4;
		}
		ByteBuffer bytebuffer = ByteBuffer.wrap(is_5_);
		GL gl = RT4GL.gl;
		if (anInt3691 == -1) {
			int[] is_11_ = new int[1];
			gl.glGenTextures(1, is_11_, 0);
			anInt3691 = is_11_[0];
			anInt3690 = Class11.anInt267;
		}
		RT4GL.method1632(anInt3691);
		gl.glTexImage2D(3553, 0, 6408, anInt3696, anInt3693, 0, 6408, 5121, bytebuffer);
		Class11.anInt263 += bytebuffer.limit() - anInt3695;
		anInt3695 = bytebuffer.limit();
	}

	public Class148_Sub2(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, byte[] is, int[] is_17_) {
		anInt3691 = -1;
		anInt3694 = -1;
		anInt3695 = 0;
		anInt2378 = i;
		anInt2373 = i_12_;
		anInt2375 = i_13_;
		anInt2374 = i_14_;
		width = i_15_;
		height = i_16_;
		method2013(is, is_17_);
		method2011();
	}
}
