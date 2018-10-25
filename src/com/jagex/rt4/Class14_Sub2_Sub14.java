/* Class14_Sub2_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import org.lwjgl.opengl.GL11;

import com.jagex.link.Cacheable;

import rs.SDRaster;

public class Class14_Sub2_Sub14 extends Cacheable {
	public int anInt3938;

	public int anInt3941 = -1;

	public int anInt3943 = 0;

	public Class14_Sub2_Sub14(int i) {
		GL gl = RT4GL.gl;
		int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		anInt3941 = is[0];
		anInt3938 = CardMemManager.memoryManagerId;
		RT4GL.bindTexture2D(anInt3941);
		int i_24_ = SDRaster.anIntArray119[i];
		byte[] is_25_ = { (byte) (i_24_ >> 48), (byte) (i_24_ >> 8), (byte) i_24_, -1 };
		ByteBuffer bytebuffer = ByteBuffer.wrap(is_25_);
		gl.glTexImage2D(3553, 0, 6408, 1, 1, 0, 6408, 5121, bytebuffer);
		gl.glTexParameteri(3553, GL11.GL_TEXTURE_MIN_FILTER, 9729);
		gl.glTexParameteri(3553, GL11.GL_TEXTURE_MAG_FILTER, 9729);
		CardMemManager.textureMemory += bytebuffer.limit() - anInt3943;
		anInt3943 = bytebuffer.limit();
	}

	public void finalize() throws Throwable {
		if (anInt3941 != -1) {
			CardMemManager.method202(anInt3941, anInt3943, anInt3938);
			anInt3941 = -1;
			anInt3943 = 0;
		}
		super.finalize();
	}

	public void method337(boolean bool) {
		int i = RT4.method1111(0);
			if ((i & 0x1) == 0)
				RT4GL.bindTexture2D(anInt3941);
			if ((i & 0x2) == 0)
				RT4GL.setRgbCombineMode(0);
			if ((i & 0x4) == 0)
				RT4GL.setAlphaCombineMode(0);
		}
}
