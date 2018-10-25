/* Class14_Sub2_Sub19_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import rs.JunkTex;

public class AbstractSprite_Sub2_Sub1 extends AbstractSprite_Sub2 {
	public AbstractSprite_Sub2_Sub1(AbstractSprite_Sub1 class14_sub2_sub19_sub1) {
		super(class14_sub2_sub19_sub1);
	}

	public AbstractSprite_Sub2_Sub1(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int[] is) {
		super(i, i_0_, i_1_, i_2_, i_3_, i_4_, is);
	}

	@Override
	public void draw(int[] texels) {
		width_ = JunkTex.method653(width);
		height_ = JunkTex.method653(height);
		byte[] pix = new byte[width_ * height_ * 4];
		int pntr = 0;
		int cntr = 0;
		int x_factor = (width_ - width) * 4;
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
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
		RT4GL.bindTexture2D(texture);
		gl.glTexImage2D(3553, 0, 6408, width_, height_, 0, 6408, 5121, pixels);
		CardMemManager.memory2d += pixels.limit() - anInt5091;
		anInt5091 = pixels.limit();
	}
}
