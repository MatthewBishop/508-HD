/* Class14_Sub2_Sub19_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import rs.tex.Class14_Sub8_Sub33;

public class Class14_Sub2_Sub19_Sub2_Sub1 extends Class14_Sub2_Sub19_Sub2 {
	public Class14_Sub2_Sub19_Sub2_Sub1(Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1) {
		super(class14_sub2_sub19_sub1);
	}

	public Class14_Sub2_Sub19_Sub2_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is) {
		super(i, i_0_, i_1_, i_2_, i_3_, i_4_, is);
	}

	@Override
	public void draw(int[] texels) {
		width = Class14_Sub8_Sub33.method653(anInt4035);
		height = Class14_Sub8_Sub33.method653(anInt4042);
		byte[] pix = new byte[width * height * 4];
		int pntr = 0;
		int cntr = 0;
		int x_factor = (width - anInt4035) * 4;
		for (int y = 0; y < anInt4042; y++) {
			for (int x = 0; x < anInt4035; x++) {
				int pixel = texels[cntr++];
				if (pixel != 0) {
					pix[pntr++] = (byte) (pixel >> 16);//r
					pix[pntr++] = (byte) (pixel >> 8);//g
					pix[pntr++] = (byte) pixel;//b
					pix[pntr++] = (byte) (pixel >> 24);//alpha
				} else
					pntr += 4;
			}
			pntr += x_factor;
		}
		ByteBuffer pixels = ByteBuffer.wrap(pix);
		GL gl = RT4GL.gl;
		if (texture == -1) {
			int[] textures = new int[1];
			gl.glGenTextures(1, textures, 0);
			texture = textures[0];
		}
		RT4GL.method1632(texture);
		gl.glTexImage2D(3553, 0, 6408, width, height, 0, 6408, 5121, pixels);
		Class11.anInt263 += pixels.limit() - anInt5091;
		anInt5091 = pixels.limit();
	}
}
