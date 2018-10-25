/* Class14_Sub2_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import rs.JunkTex;

public class AbstractSprite_Sub2 extends AbstractSprite {
	public int texture = -1;
	public int anInt5090;
	public int anInt5091;
	public int width_;
	public int height_;
	public int listId = -1;
	public int anInt5095;

	public AbstractSprite_Sub2(AbstractSprite_Sub1 class14_sub2_sub19_sub1) {
		anInt5090 = 0;
		anInt5091 = 0;
		anInt4034 = class14_sub2_sub19_sub1.anInt4034;
		anInt4046 = class14_sub2_sub19_sub1.anInt4046;
		offsetX = class14_sub2_sub19_sub1.offsetX;
		offsetY = class14_sub2_sub19_sub1.offsetY;
		width = class14_sub2_sub19_sub1.width;
		height = class14_sub2_sub19_sub1.height;
		draw(class14_sub2_sub19_sub1.pixels);
		method422();
	}

	public AbstractSprite_Sub2(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int[] is) {
		anInt5090 = 0;
		anInt5091 = 0;
		anInt4034 = i;
		anInt4046 = i_106_;
		offsetX = i_107_;
		offsetY = i_108_;
		width = i_109_;
		height = i_110_;
		draw(is);
		method422();
	}

	public void finalize() throws Throwable {
		if (texture != -1) {
			CardMemManager.method208(texture, anInt5091, anInt5095);
			texture = -1;
			anInt5091 = 0;
		}
		if (listId != -1) {
			CardMemManager.method206(listId, anInt5095);
			listId = -1;
		}
		super.finalize();
	}

	public void method389(int i, int i_73_, int i_74_, int i_75_) {
		if (i_74_ > 0 && i_75_ > 0) {
			RT4GL.method1622();
			int i_76_ = width;
			int i_77_ = height;
			int i_78_ = 0;
			int i_79_ = 0;
			int i_80_ = anInt4034;
			int i_81_ = anInt4046;
			int i_82_ = (i_80_ << 16) / i_74_;
			int i_83_ = (i_81_ << 16) / i_75_;
			if (offsetX > 0) {
				int i_84_ = ((offsetX << 16) + i_82_ - 1) / i_82_;
				i += i_84_;
				i_78_ += i_84_ * i_82_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_85_ = ((offsetY << 16) + i_83_ - 1) / i_83_;
				i_73_ += i_85_;
				i_79_ += i_85_ * i_83_ - (offsetY << 16);
			}
			if (i_76_ < i_80_)
				i_74_ = ((i_76_ << 16) - i_78_ + i_82_ - 1) / i_82_;
			if (i_77_ < i_81_)
				i_75_ = ((i_77_ << 16) - i_79_ + i_83_ - 1) / i_83_;
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(texture);
			method423(2);
			float f = (float) i;
			float f_86_ = f + (float) i_74_;
			float f_87_ = (float) (RT4GL.canvasHeight - i_73_);
			float f_88_ = f_87_ - (float) i_75_;
			float f_89_ = (float) width / (float) width_;
			float f_90_ = (float) height / (float) height_;
			gl.glBegin(6);
			gl.glTexCoord2f(f_89_, 0.0F);
			gl.glVertex2f(f_86_, f_87_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(f, f_87_);
			gl.glTexCoord2f(0.0F, f_90_);
			gl.glVertex2f(f, f_88_);
			gl.glTexCoord2f(f_89_, f_90_);
			gl.glVertex2f(f_86_, f_88_);
			gl.glEnd();
		}
	}

	public void method390(int i, int i_72_) {
		RT4GL.method1622();
		i += offsetX;
		i_72_ += offsetY;
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		gl.glTranslatef((float) i, (float) (RT4GL.canvasHeight - i_72_), 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	public void drawReg(int i, int i_46_) {
		RT4GL.method1622();
		i += offsetX;
		i_46_ += offsetY;
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		gl.glTranslatef((float) i, (float) (RT4GL.canvasHeight - i_46_), 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	public void method395(int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
		RT4GL.method1622();
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		i -= offsetX << 4;
		i_67_ -= offsetY << 4;
		gl.glTranslatef((float) i_68_ / 16.0F, (float) RT4GL.canvasHeight - (float) i_69_ / 16.0F, 0.0F);
		gl.glRotatef((float) i_70_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_71_ != 4096)
			gl.glScalef((float) i_71_ / 4096.0F, (float) i_71_ / 4096.0F, 0.0F);
		gl.glTranslatef((float) -i / 16.0F, (float) i_67_ / 16.0F, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	public void method396(int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		if (i_48_ > 0 && i_49_ > 0) {
			RT4GL.method1655();
			int i_51_ = width;
			int i_52_ = height;
			int i_53_ = 0;
			int i_54_ = 0;
			int i_55_ = anInt4034;
			int i_56_ = anInt4046;
			int i_57_ = (i_55_ << 16) / i_48_;
			int i_58_ = (i_56_ << 16) / i_49_;
			if (offsetX > 0) {
				int i_59_ = ((offsetX << 16) + i_57_ - 1) / i_57_;
				i += i_59_;
				i_53_ += i_59_ * i_57_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_60_ = ((offsetY << 16) + i_58_ - 1) / i_58_;
				i_47_ += i_60_;
				i_54_ += i_60_ * i_58_ - (offsetY << 16);
			}
			if (i_51_ < i_55_)
				i_48_ = ((i_51_ << 16) - i_53_ + i_57_ - 1) / i_57_;
			if (i_52_ < i_56_)
				i_49_ = ((i_52_ << 16) - i_54_ + i_58_ - 1) / i_58_;
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(texture);
			method423(1);
			float f = (float) i;
			float f_61_ = f + (float) i_48_;
			float f_62_ = (float) (RT4GL.canvasHeight - i_47_);
			float f_63_ = f_62_ - (float) i_49_;
			float f_64_ = (float) width / (float) width_;
			float f_65_ = (float) height / (float) height_;
			float f_66_ = (float) i_50_ / 256.0F;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, f_66_);
			gl.glTexCoord2f(f_64_, 0.0F);
			gl.glVertex2f(f_61_, f_62_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f(f, f_62_);
			gl.glTexCoord2f(0.0F, f_65_);
			gl.glVertex2f(f, f_63_);
			gl.glTexCoord2f(f_64_, f_65_);
			gl.glVertex2f(f_61_, f_63_);
			gl.glEnd();
		}
	}

	public void drawSpriteTransparency(int i, int i_0_, int i_1_) {
		RT4GL.method1655();
		i += offsetX;
		i_0_ += offsetY;
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) i_1_ / 256.0F);
		gl.glTranslatef((float) i, (float) (RT4GL.canvasHeight - i_0_), 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

	public void method400(int i, int i_9_, int i_10_, int i_11_) {
		if (i_10_ == 256)
			drawReg(i, i_9_);
		else {
			RT4GL.method1620();
			i += offsetX;
			i_9_ += offsetY;
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(texture);
			method423(1);
			gl.glColor3ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_);
			gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) i_10_ / 256.0F }, 0);
			gl.glTranslatef((float) i, (float) (RT4GL.canvasHeight - i_9_), 0.0F);
			gl.glCallList(listId);
			gl.glLoadIdentity();
		}
	}

	public void method419(int i, int i_2_, AbstractSprite_Sub2 class14_sub2_sub19_sub2_3_) {
		if (class14_sub2_sub19_sub2_3_ != null) {
			RT4GL.method1622();
			RT4GL.bindTexture2D(class14_sub2_sub19_sub2_3_.texture);
			class14_sub2_sub19_sub2_3_.method423(1);
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(texture);
			method423(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class14_sub2_sub19_sub2_3_.texture);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			float f = ((float) (i - Class25.anInt475) / (float) class14_sub2_sub19_sub2_3_.width_);
			float f_4_ = ((float) (i_2_ - Class25.anInt478) / (float) class14_sub2_sub19_sub2_3_.height_);
			float f_5_ = ((float) (i + width - Class25.anInt475) / (float) class14_sub2_sub19_sub2_3_.width_);
			float f_6_ = ((float) (i_2_ + height - Class25.anInt478) / (float) class14_sub2_sub19_sub2_3_.height_);
			i += offsetX;
			i_2_ += offsetY;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			float f_7_ = (float) width / (float) width_;
			float f_8_ = (float) height / (float) height_;
			gl.glMultiTexCoord2f(33985, f_5_, f_4_);
			gl.glTexCoord2f(f_7_, 0.0F);
			gl.glVertex2f((float) (i + width), (float) (RT4GL.canvasHeight - i_2_));
			gl.glMultiTexCoord2f(33985, f, f_4_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f((float) i, (float) (RT4GL.canvasHeight - i_2_));
			gl.glMultiTexCoord2f(33985, f, f_6_);
			gl.glTexCoord2f(0.0F, f_8_);
			gl.glVertex2f((float) i, (float) (RT4GL.canvasHeight - (i_2_ + height)));
			gl.glMultiTexCoord2f(33985, f_5_, f_6_);
			gl.glTexCoord2f(f_7_, f_8_);
			gl.glVertex2f((float) (i + width), (float) (RT4GL.canvasHeight - (i_2_ + height)));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	public void method420(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
			AbstractSprite_Sub2 class14_sub2_sub19_sub2_19_) {
		if (class14_sub2_sub19_sub2_19_ != null) {
			RT4GL.method1622();
			RT4GL.bindTexture2D(class14_sub2_sub19_sub2_19_.texture);
			class14_sub2_sub19_sub2_19_.method423(1);
			GL gl = RT4GL.gl;
			RT4GL.bindTexture2D(texture);
			method423(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class14_sub2_sub19_sub2_19_.texture);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			int i_20_ = -i_13_ / 2;
			int i_21_ = -i_14_ / 2;
			int i_22_ = -i_20_;
			int i_23_ = -i_21_;
			int i_24_ = (int) (Math.sin((double) i_17_ / 326.11) * 65536.0);
			int i_25_ = (int) (Math.cos((double) i_17_ / 326.11) * 65536.0);
			i_24_ = i_24_ * i_18_ >> 8;
			i_25_ = i_25_ * i_18_ >> 8;
			int i_26_ = (i_15_ << 16) + (i_21_ * i_24_ + i_20_ * i_25_);
			int i_27_ = (i_16_ << 16) + (i_21_ * i_25_ - i_20_ * i_24_);
			int i_28_ = (i_15_ << 16) + (i_21_ * i_24_ + i_22_ * i_25_);
			int i_29_ = (i_16_ << 16) + (i_21_ * i_25_ - i_22_ * i_24_);
			int i_30_ = (i_15_ << 16) + (i_23_ * i_24_ + i_20_ * i_25_);
			int i_31_ = (i_16_ << 16) + (i_23_ * i_25_ - i_20_ * i_24_);
			int i_32_ = (i_15_ << 16) + (i_23_ * i_24_ + i_22_ * i_25_);
			int i_33_ = (i_16_ << 16) + (i_23_ * i_25_ - i_22_ * i_24_);
			float f = ((float) class14_sub2_sub19_sub2_19_.width / (float) class14_sub2_sub19_sub2_19_.width_);
			float f_34_ = ((float) class14_sub2_sub19_sub2_19_.height
					/ (float) class14_sub2_sub19_sub2_19_.height_);
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			float f_35_ = (float) width_ * 65536.0F;
			float f_36_ = (float) (height_ * 65536);
			gl.glMultiTexCoord2f(33985, f, 0.0F);
			gl.glTexCoord2f((float) i_28_ / f_35_, (float) i_29_ / f_36_);
			gl.glVertex2f((float) (i + i_13_), (float) (RT4GL.canvasHeight - i_12_));
			gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			gl.glTexCoord2f((float) i_26_ / f_35_, (float) i_27_ / f_36_);
			gl.glVertex2f((float) i, (float) (RT4GL.canvasHeight - i_12_));
			gl.glMultiTexCoord2f(33985, 0.0F, f_34_);
			gl.glTexCoord2f((float) i_30_ / f_35_, (float) i_31_ / f_36_);
			gl.glVertex2f((float) i, (float) (RT4GL.canvasHeight - (i_12_ + i_14_)));
			gl.glMultiTexCoord2f(33985, f, f_34_);
			gl.glTexCoord2f((float) i_32_ / f_35_, (float) i_33_ / f_36_);
			gl.glVertex2f((float) (i + i_13_), (float) (RT4GL.canvasHeight - (i_12_ + i_14_)));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	public void method421(int i, int i_37_, int i_38_, int i_39_) {
		RT4GL.method1622();
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		float f = (float) width / (float) width_;
		float f_40_ = (float) height / (float) height_;
		f *= (float) i_38_;
		f_40_ *= (float) i_39_;
		int i_41_ = i + offsetX;
		int i_42_ = i_41_ + width * i_38_;
		int i_43_ = RT4GL.canvasHeight - i_37_ - offsetY;
		int i_44_ = i_43_ - height * i_39_;
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f((float) i_42_, (float) i_43_);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) i_41_, (float) i_43_);
		gl.glTexCoord2f(0.0F, f_40_);
		gl.glVertex2f((float) i_41_, (float) i_44_);
		gl.glTexCoord2f(f, f_40_);
		gl.glVertex2f((float) i_42_, (float) i_44_);
		gl.glEnd();
	}

	public void method422() {
		float f = (float) width / (float) width_;
		float f_45_ = (float) height / (float) height_;
		GL gl = RT4GL.gl;
		if (listId == -1) {
			listId = gl.glGenLists(1);
			anInt5095 = CardMemManager.memoryManagerId;
		}
		gl.glNewList(listId, 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f((float) width, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, f_45_);
		gl.glVertex2f(0.0F, (float) -height);
		gl.glTexCoord2f(f, f_45_);
		gl.glVertex2f((float) width, (float) -height);
		gl.glEnd();
		gl.glEndList();
	}

	public void method423(int i) {
		if (anInt5090 != i) {
			anInt5090 = i;
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

	public void method424(int i, int i_91_, int i_92_, int i_93_, int i_94_) {
		RT4GL.method1655();
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(1);
		float f = (float) width / (float) width_;
		float f_95_ = (float) height / (float) height_;
		f *= (float) i_93_;
		f_95_ *= (float) i_94_;
		int i_96_ = i + offsetX;
		int i_97_ = i_96_ + width * i_93_;
		int i_98_ = RT4GL.canvasHeight - i_91_ - offsetY;
		int i_99_ = i_98_ - height * i_94_;
		float f_100_ = (float) i_92_ / 256.0F;
		gl.glBegin(6);
		gl.glColor4f(1.0F, 1.0F, 1.0F, f_100_);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f((float) i_97_, (float) i_98_);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f((float) i_96_, (float) i_98_);
		gl.glTexCoord2f(0.0F, f_95_);
		gl.glVertex2f((float) i_96_, (float) i_99_);
		gl.glTexCoord2f(f, f_95_);
		gl.glVertex2f((float) i_97_, (float) i_99_);
		gl.glEnd();
	}

	public void method425(int i, int i_101_, int i_102_, int i_103_, int i_104_, int i_105_) {
		RT4GL.method1622();
		GL gl = RT4GL.gl;
		RT4GL.bindTexture2D(texture);
		method423(2);
		i -= offsetX << 4;
		i_101_ -= offsetY << 4;
		gl.glTranslatef((float) i_102_ / 16.0F, (float) RT4GL.canvasHeight - (float) i_103_ / 16.0F, 0.0F);
		gl.glRotatef((float) -i_104_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_105_ != 4096)
			gl.glScalef((float) i_105_ / 4096.0F, (float) i_105_ / 4096.0F, 0.0F);
		gl.glTranslatef((float) -i / 16.0F, (float) i_101_ / 16.0F, 0.0F);
		gl.glCallList(listId);
		gl.glLoadIdentity();
	}

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
					pix[pntr++] = (byte) (pixel >> 16);
					pix[pntr++] = (byte) (pixel >> 8);
					pix[pntr++] = (byte) pixel;
					pix[pntr++] = (byte) -1;
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
			anInt5095 = CardMemManager.memoryManagerId;
		}
		RT4GL.bindTexture2D(texture);
		gl.glTexImage2D(3553, 0, 6408, width_, height_, 0, 6408, 5121, pixels);
		CardMemManager.memory2d += pixels.limit() - anInt5091;
		anInt5091 = pixels.limit();
	}
}
