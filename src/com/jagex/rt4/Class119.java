/* Class119 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import org.lwjgl.opengl.GL11;

public class Class119 {
	private static ByteBuffer textureData2;
	private static ByteBuffer textureData2l;
	
	public static int texture3DPointer2l = -1;
	public static int[] anIntArray1991 = null;

	public static int texture3DPointer2 = -1;
	public static int[] textureIds2 = null;

	public static boolean allows3DTextureMapping;

	public static void finalizeCard() {
		if (texture3DPointer2 != -1) {
			GL gl = RT4GL.gl;
			int[] is = { texture3DPointer2 };
			gl.glDeleteTextures(1, is, 0);
			texture3DPointer2 = -1;
			CardMemManager.textureMemory -= textureData2.limit() * 2;
		}
		if (textureIds2 != null) {
			GL gl = RT4GL.gl;
			gl.glDeleteTextures(64, textureIds2, 0);
			textureIds2 = null;
			CardMemManager.textureMemory -= textureData2.limit() * 2;
		}
		if (texture3DPointer2l != -1) {
			GL gl = RT4GL.gl;
			int[] is = { texture3DPointer2l };
			gl.glDeleteTextures(1, is, 0);
			texture3DPointer2l = -1;
			CardMemManager.textureMemory -= textureData2l.limit() * 2;
		}
		if (anIntArray1991 != null) {
			GL gl = RT4GL.gl;
			gl.glDeleteTextures(64, anIntArray1991, 0);
			anIntArray1991 = null;
			CardMemManager.textureMemory -= textureData2l.limit() * 2;
		}
	}

	private static void method1610() {
		GL gl = RT4GL.gl;
		if (allows3DTextureMapping) {
			int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			gl.glBindTexture(32879, is[0]);
			textureData2l.position(0);
			gl.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, textureData2l);
			gl.glTexParameteri(32879, GL11.GL_TEXTURE_MIN_FILTER, 9729);
			gl.glTexParameteri(32879, GL11.GL_TEXTURE_MAG_FILTER, 9729);
			texture3DPointer2l = is[0];
			CardMemManager.textureMemory += textureData2l.limit() * 2;
		} else {
			anIntArray1991 = new int[64];
			gl.glGenTextures(64, anIntArray1991, 0);
			for (int i = 0; i < 64; i++) {
				RT4GL.bindTexture2D(anIntArray1991[i]);
				textureData2l.position(i * 64 * 64 * 2);
				gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, textureData2l);
				gl.glTexParameteri(3553, GL11.GL_TEXTURE_MIN_FILTER, 9729);
				gl.glTexParameteri(3553, GL11.GL_TEXTURE_MAG_FILTER, 9729);
			}
			CardMemManager.textureMemory += textureData2l.limit() * 2;
		}
	}

	private static void method1611() {
		GL gl = RT4GL.gl;
		if (allows3DTextureMapping) {
			int[] is = new int[1];
			gl.glGenTextures(1, is, 0);
			gl.glBindTexture(32879, is[0]);
			textureData2.position(0);
			gl.glTexImage3D(32879, 0, 6410, 128, 128, 32, 0, 6410, 5121, textureData2);
			gl.glTexParameteri(32879, GL11.GL_TEXTURE_MIN_FILTER, 9729);
			gl.glTexParameteri(32879, GL11.GL_TEXTURE_MAG_FILTER, 9729);
			texture3DPointer2 = is[0];
			CardMemManager.textureMemory += textureData2.limit() * 2;
		} else {
			textureIds2 = new int[64];
			gl.glGenTextures(64, textureIds2, 0);
			for (int i = 0; i < 64; i++) {
				RT4GL.bindTexture2D(textureIds2[i]);
				textureData2.position(i * 64 * 64 * 2);
				gl.glTexImage2D(3553, 0, 6410, 64, 64, 0, 6410, 5121, textureData2);
				gl.glTexParameteri(3553, GL11.GL_TEXTURE_MIN_FILTER, 9729);
				gl.glTexParameteri(3553, GL11.GL_TEXTURE_MAG_FILTER, 9729);
			}
			CardMemManager.textureMemory += textureData2.limit() * 2;
		}
	}

	public static void method1612() {
		allows3DTextureMapping = RT4GL.has_texture_3d;
		if (textureData2 == null) {
			Class26_Sub2_Sub1 class26_sub2_sub1 = new Class26_Sub2_Sub1();
			byte[] is;
			if (allows3DTextureMapping)
				is = class26_sub2_sub1.method1033(128, 128, 32);
			else
				is = class26_sub2_sub1.method1033(64, 64, 64);
			textureData2 = ByteBuffer.allocateDirect(is.length);
			textureData2.position(0);
			textureData2.put(is);
			textureData2.flip();
		}
		if (textureData2l == null) {
			Class26_Sub1_Sub1 class26_sub1_sub1 = new Class26_Sub1_Sub1();
			byte[] is;
			if (allows3DTextureMapping)
				is = class26_sub1_sub1.method1029(128, 128, 32);
			else
				is = class26_sub1_sub1.method1029(64, 64, 64);
			textureData2l = ByteBuffer.allocateDirect(is.length);
			textureData2l.position(0);
			textureData2l.put(is);
			textureData2l.flip();
		}
		method1611();
		method1610();
	}

	public static void kill() {
		textureIds2 = null;
		anIntArray1991 = null;
		textureData2 = null;
		textureData2l = null;
	}
}
