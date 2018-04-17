/* Class14_Sub2_Sub19_Sub1_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class AbstractSprite_Sub1_Sub2 extends AbstractSprite_Sub1 {
	public byte[] aByteArray5104;
	public ByteBuffer aByteBuffer5105;

	public void method390(int i, int i_0_) {
		RT4GL.method1637();
		if (aByteArray5104 == null) {
			aByteArray5104 = new byte[width * height * 4];
			aByteBuffer5105 = ByteBuffer.wrap(aByteArray5104);
		}
		int i_1_ = 0;
		for (int i_2_ = height - 1; i_2_ >= 0; i_2_--) {
			int i_3_ = i_2_ * width;
			for (int i_4_ = 0; i_4_ < width; i_4_++) {
				int i_5_ = pixels[i_3_++];
				if (i_5_ != 0) {
					aByteArray5104[i_1_++] = (byte) (i_5_ >> 16);
					aByteArray5104[i_1_++] = (byte) (i_5_ >> 8);
					aByteArray5104[i_1_++] = (byte) i_5_;
					aByteArray5104[i_1_++] = (byte) -1;
				} else {
					aByteArray5104[i_1_++] = (byte) 0;
					aByteArray5104[i_1_++] = (byte) 0;
					aByteArray5104[i_1_++] = (byte) 0;
					aByteArray5104[i_1_++] = (byte) 0;
				}
			}
		}
		GL gl = RT4GL.gl;
		gl.glRasterPos2i(i + offsetX, RT4GL.canvasHeight - (i_0_ + offsetY) - height);
		gl.glDrawPixels(width, height, 6408, 5121, aByteBuffer5105);
	}

	public void drawReg(int i, int i_6_) {
		method390(i, i_6_);
	}

	public AbstractSprite_Sub1_Sub2(int i, int i_7_) {
		super(i, i_7_);
	}
}
