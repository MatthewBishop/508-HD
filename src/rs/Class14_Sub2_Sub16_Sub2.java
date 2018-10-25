/* Class14_Sub2_Sub16_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.rt4.CardMemManager;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4GL;

public class Class14_Sub2_Sub16_Sub2 extends Class14_Sub2_Sub16 {
	public int anInt5066;
	public int anInt5067;
	public int anInt5068 = 0;
	public int[] anIntArray5069;
	public int anInt5070 = -1;

	public void method372(byte[][] is) {
		if (anInt5070 == -1) {
			anInt5067 = 0;
			for (int i = 0; i < 256; i++) {
				if (anIntArray3991[i] > anInt5067)
					anInt5067 = anIntArray3991[i];
				if (anIntArray3989[i] > anInt5067)
					anInt5067 = anIntArray3989[i];
			}
			anInt5067 *= 16;
			anInt5067 = JunkTex.method653(anInt5067);
			int i = anInt5067 / 16;
			byte[] is_0_ = new byte[anInt5067 * anInt5067 * 2];
			for (int i_1_ = 0; i_1_ < 256; i_1_++) {
				int i_2_ = i_1_ % 16 * i;
				int i_3_ = i_1_ / 16 * i;
				int i_4_ = (i_3_ * anInt5067 + i_2_) * 2;
				int i_5_ = 0;
				int i_6_ = anIntArray3991[i_1_];
				int i_7_ = anIntArray3989[i_1_];
				byte[] is_8_ = is[i_1_];
				for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
					for (int i_10_ = 0; i_10_ < i_7_; i_10_++) {
						if (is_8_[i_5_++] != 0) {
							is_0_[i_4_++] = (byte) -1;
							is_0_[i_4_++] = (byte) -1;
						} else
							i_4_ += 2;
					}
					i_4_ += (anInt5067 - i_7_) * 2;
				}
			}
			ByteBuffer bytebuffer = ByteBuffer.wrap(is_0_);
			GL gl = RT4GL.gl;
			if (anInt5070 == -1) {
				int[] is_11_ = new int[1];
				gl.glGenTextures(1, is_11_, 0);
				anInt5070 = is_11_[0];
				anInt5066 = CardMemManager.memoryManagerId;
			}
			RT4GL.bindTexture2D(anInt5070);
			gl.glTexImage2D(3553, 0, 6410, anInt5067, anInt5067, 0, 6410, 5121, bytebuffer);
			CardMemManager.memory2d += bytebuffer.limit() - anInt5068;
			anInt5068 = bytebuffer.limit();
			gl.glTexParameteri(3553, 10241, 9728);
			gl.glTexParameteri(3553, 10240, 9728);
		}
	}

	public void method373() {
		if (anIntArray5069 == null) {
			anIntArray5069 = new int[256];
			GL gl = RT4GL.gl;
			for (int i = 0; i < 256; i++) {
				float f = i % 16 / 16.0F;
				float f_12_ = i / 16 / 16.0F;
				float f_13_ = f + (float) anIntArray3989[i] / (float) anInt5067;
				float f_14_ = f_12_ + (float) anIntArray3991[i] / (float) anInt5067;
				anIntArray5069[i] = gl.glGenLists(1);
				gl.glNewList(anIntArray5069[i], 4864);
				gl.glBegin(6);
				gl.glTexCoord2f(f_13_, f_12_);
				gl.glVertex2f(anIntArray3989[i], 0.0F);
				gl.glTexCoord2f(f, f_12_);
				gl.glVertex2f(0.0F, 0.0F);
				gl.glTexCoord2f(f, f_14_);
				gl.glVertex2f(0.0F, -anIntArray3991[i]);
				gl.glTexCoord2f(f_13_, f_14_);
				gl.glVertex2f(anIntArray3989[i], -anIntArray3991[i]);
				gl.glEnd();
				gl.glEndList();
			}
			anInt5066 = CardMemManager.memoryManagerId;
		}
	}

	@Override
	public void finalize() throws Throwable {
		if (anInt5070 != -1) {
			CardMemManager.method208(anInt5070, anInt5068, anInt5066);
			anInt5070 = -1;
			anInt5068 = 0;
		}
		if (anIntArray5069 != null) {
			for (int i = 0; i < anIntArray5069.length; i++)
				CardMemManager.method206(anIntArray5069[i], anInt5066);
			anIntArray5069 = null;
		}
		super.finalize();
	}

	@Override
	public void method349(int i, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, boolean bool) {
		if (Class25.aClass14_Sub2_Sub19_Sub2_479 != null) {
			RT4GL.method1623();
			GL gl = RT4GL.gl;
			gl.glColor3ub((byte) (i_19_ >> 16), (byte) (i_19_ >> 8), (byte) i_19_);
			gl.glTranslatef(i_15_, RT4GL.canvasHeight - i_16_, 0.0F);
			float f = i % 16 / 16.0F;
			float f_20_ = i / 16 / 16.0F;
			float f_21_ = f + (float) anIntArray3989[i] / (float) anInt5067;
			float f_22_ = f_20_ + (float) anIntArray3991[i] / (float) anInt5067;
			RT4GL.bindTexture2D(anInt5070);
			AbstractSprite_Sub2 class14_sub2_sub19_sub2 = Class25.aClass14_Sub2_Sub19_Sub2_479;
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class14_sub2_sub19_sub2.texture);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			float f_23_ = ((float) (i_15_ - Class25.anInt475) / (float) class14_sub2_sub19_sub2.width_);
			float f_24_ = ((float) (i_16_ - Class25.anInt478) / (float) class14_sub2_sub19_sub2.height_);
			float f_25_ = ((float) (i_15_ + i_17_ - Class25.anInt475) / (float) class14_sub2_sub19_sub2.width_);
			float f_26_ = ((float) (i_16_ + i_18_ - Class25.anInt478) / (float) class14_sub2_sub19_sub2.height_);
			gl.glBegin(6);
			gl.glMultiTexCoord2f(33985, f_25_, f_24_);
			gl.glTexCoord2f(f_21_, f_20_);
			gl.glVertex2f(anIntArray3989[i], 0.0F);
			gl.glMultiTexCoord2f(33985, f_23_, f_24_);
			gl.glTexCoord2f(f, f_20_);
			gl.glVertex2f(0.0F, 0.0F);
			gl.glMultiTexCoord2f(33985, f_23_, f_26_);
			gl.glTexCoord2f(f, f_22_);
			gl.glVertex2f(0.0F, -anIntArray3991[i]);
			gl.glMultiTexCoord2f(33985, f_25_, f_26_);
			gl.glTexCoord2f(f_21_, f_22_);
			gl.glVertex2f(anIntArray3989[i], -anIntArray3991[i]);
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
			gl.glLoadIdentity();
		} else {
			RT4GL.method1623();
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(anInt5070);
			gl.glColor3ub((byte) (i_19_ >> 16), (byte) (i_19_ >> 8), (byte) i_19_);
			gl.glTranslatef(i_15_, RT4GL.canvasHeight - i_16_, 0.0F);
			gl.glCallList(anIntArray5069[i]);
			gl.glLoadIdentity();
		}
	}

	public Class14_Sub2_Sub16_Sub2(byte[] is, int[] is_27_, int[] is_28_, int[] is_29_, int[] is_30_, byte[][] is_31_) {
		super(is, is_27_, is_28_, is_29_, is_30_);
		method372(is_31_);
		method373();
	}

	@Override
	public void method363(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_, int i_37_, boolean bool) {
		RT4GL.method1623();
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(anInt5070);
		gl.glColor4ub((byte) (i_36_ >> 16), (byte) (i_36_ >> 8), (byte) i_36_, i_37_ > 255 ? (byte) -1 : (byte) i_37_);
		gl.glTranslatef(i_32_, RT4GL.canvasHeight - i_33_, 0.0F);
		gl.glCallList(anIntArray5069[i]);
		gl.glLoadIdentity();
	}
}
