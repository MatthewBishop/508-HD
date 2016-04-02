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

	public void method426(int[] is) {
		anInt5092 = Class14_Sub8_Sub33.method653(anInt4035);
		anInt5093 = Class14_Sub8_Sub33.method653(anInt4042);
		byte[] is_5_ = new byte[anInt5092 * anInt5093 * 4];
		int i = 0;
		int i_6_ = 0;
		int i_7_ = (anInt5092 - anInt4035) * 4;
		for (int i_8_ = 0; i_8_ < anInt4042; i_8_++) {
			for (int i_9_ = 0; i_9_ < anInt4035; i_9_++) {
				int i_10_ = is[i_6_++];
				if (i_10_ != 0) {
					is_5_[i++] = (byte) (i_10_ >> 16);
					is_5_[i++] = (byte) (i_10_ >> 8);
					is_5_[i++] = (byte) i_10_;
					is_5_[i++] = (byte) (i_10_ >> 24);
				} else
					i += 4;
			}
			i += i_7_;
		}
		ByteBuffer bytebuffer = ByteBuffer.wrap(is_5_);
		GL gl = Class121.aGL2030;
		if (anInt5089 == -1) {
			int[] is_11_ = new int[1];
			gl.glGenTextures(1, is_11_, 0);
			anInt5089 = is_11_[0];
		}
		Class121.method1632(anInt5089);
		gl.glTexImage2D(3553, 0, 6408, anInt5092, anInt5093, 0, 6408, 5121, bytebuffer);
		Class11.anInt263 += bytebuffer.limit() - anInt5091;
		anInt5091 = bytebuffer.limit();
	}
}
