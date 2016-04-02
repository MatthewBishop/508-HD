/* Class14_Sub2_Sub19_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import rs.tex.Class14_Sub8_Sub33;

public class Class14_Sub2_Sub19_Sub2 extends Class14_Sub2_Sub19 {
	public int anInt5089 = -1;
	public int anInt5090;
	public int anInt5091;
	public int anInt5092;
	public int anInt5093;
	public int anInt5094 = -1;
	public int anInt5095;

	public Class14_Sub2_Sub19_Sub2(Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1) {
		anInt5090 = 0;
		anInt5091 = 0;
		anInt4034 = class14_sub2_sub19_sub1.anInt4034;
		anInt4046 = class14_sub2_sub19_sub1.anInt4046;
		anInt4033 = class14_sub2_sub19_sub1.anInt4033;
		anInt4050 = class14_sub2_sub19_sub1.anInt4050;
		anInt4035 = class14_sub2_sub19_sub1.anInt4035;
		anInt4042 = class14_sub2_sub19_sub1.anInt4042;
		method426(class14_sub2_sub19_sub1.anIntArray5088);
		method422();
	}

	public Class14_Sub2_Sub19_Sub2(int i, int i_106_, int i_107_, int i_108_, int i_109_, int i_110_, int[] is) {
		anInt5090 = 0;
		anInt5091 = 0;
		anInt4034 = i;
		anInt4046 = i_106_;
		anInt4033 = i_107_;
		anInt4050 = i_108_;
		anInt4035 = i_109_;
		anInt4042 = i_110_;
		method426(is);
		method422();
	}

	public void finalize() throws Throwable {
		if (anInt5089 != -1) {
			Class11.method208(anInt5089, anInt5091, anInt5095);
			anInt5089 = -1;
			anInt5091 = 0;
		}
		if (anInt5094 != -1) {
			Class11.method206(anInt5094, anInt5095);
			anInt5094 = -1;
		}
		super.finalize();
	}

	public void method389(int i, int i_73_, int i_74_, int i_75_) {
		if (i_74_ > 0 && i_75_ > 0) {
			Class121.method1622();
			int i_76_ = anInt4035;
			int i_77_ = anInt4042;
			int i_78_ = 0;
			int i_79_ = 0;
			int i_80_ = anInt4034;
			int i_81_ = anInt4046;
			int i_82_ = (i_80_ << 16) / i_74_;
			int i_83_ = (i_81_ << 16) / i_75_;
			if (anInt4033 > 0) {
				int i_84_ = ((anInt4033 << 16) + i_82_ - 1) / i_82_;
				i += i_84_;
				i_78_ += i_84_ * i_82_ - (anInt4033 << 16);
			}
			if (anInt4050 > 0) {
				int i_85_ = ((anInt4050 << 16) + i_83_ - 1) / i_83_;
				i_73_ += i_85_;
				i_79_ += i_85_ * i_83_ - (anInt4050 << 16);
			}
			if (i_76_ < i_80_)
				i_74_ = ((i_76_ << 16) - i_78_ + i_82_ - 1) / i_82_;
			if (i_77_ < i_81_)
				i_75_ = ((i_77_ << 16) - i_79_ + i_83_ - 1) / i_83_;
			GL gl = Class121.aGL2030;
			Class121.method1632(anInt5089);
			method423(2);
			float f = (float) i;
			float f_86_ = f + (float) i_74_;
			float f_87_ = (float) (Class121.anInt2034 - i_73_);
			float f_88_ = f_87_ - (float) i_75_;
			float f_89_ = (float) anInt4035 / (float) anInt5092;
			float f_90_ = (float) anInt4042 / (float) anInt5093;
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
		Class121.method1622();
		i += anInt4033;
		i_72_ += anInt4050;
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		gl.glTranslatef((float) i, (float) (Class121.anInt2034 - i_72_), 0.0F);
		gl.glCallList(anInt5094);
		gl.glLoadIdentity();
	}

	public void method391(int i, int i_46_) {
		Class121.method1622();
		i += anInt4033;
		i_46_ += anInt4050;
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		gl.glTranslatef((float) i, (float) (Class121.anInt2034 - i_46_), 0.0F);
		gl.glCallList(anInt5094);
		gl.glLoadIdentity();
	}

	public void method395(int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_) {
		Class121.method1622();
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		i -= anInt4033 << 4;
		i_67_ -= anInt4050 << 4;
		gl.glTranslatef((float) i_68_ / 16.0F, (float) Class121.anInt2034 - (float) i_69_ / 16.0F, 0.0F);
		gl.glRotatef((float) i_70_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_71_ != 4096)
			gl.glScalef((float) i_71_ / 4096.0F, (float) i_71_ / 4096.0F, 0.0F);
		gl.glTranslatef((float) -i / 16.0F, (float) i_67_ / 16.0F, 0.0F);
		gl.glCallList(anInt5094);
		gl.glLoadIdentity();
	}

	public void method396(int i, int i_47_, int i_48_, int i_49_, int i_50_) {
		if (i_48_ > 0 && i_49_ > 0) {
			Class121.method1655();
			int i_51_ = anInt4035;
			int i_52_ = anInt4042;
			int i_53_ = 0;
			int i_54_ = 0;
			int i_55_ = anInt4034;
			int i_56_ = anInt4046;
			int i_57_ = (i_55_ << 16) / i_48_;
			int i_58_ = (i_56_ << 16) / i_49_;
			if (anInt4033 > 0) {
				int i_59_ = ((anInt4033 << 16) + i_57_ - 1) / i_57_;
				i += i_59_;
				i_53_ += i_59_ * i_57_ - (anInt4033 << 16);
			}
			if (anInt4050 > 0) {
				int i_60_ = ((anInt4050 << 16) + i_58_ - 1) / i_58_;
				i_47_ += i_60_;
				i_54_ += i_60_ * i_58_ - (anInt4050 << 16);
			}
			if (i_51_ < i_55_)
				i_48_ = ((i_51_ << 16) - i_53_ + i_57_ - 1) / i_57_;
			if (i_52_ < i_56_)
				i_49_ = ((i_52_ << 16) - i_54_ + i_58_ - 1) / i_58_;
			GL gl = Class121.aGL2030;
			Class121.method1632(anInt5089);
			method423(1);
			float f = (float) i;
			float f_61_ = f + (float) i_48_;
			float f_62_ = (float) (Class121.anInt2034 - i_47_);
			float f_63_ = f_62_ - (float) i_49_;
			float f_64_ = (float) anInt4035 / (float) anInt5092;
			float f_65_ = (float) anInt4042 / (float) anInt5093;
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

	public void method398(int i, int i_0_, int i_1_) {
		Class121.method1655();
		i += anInt4033;
		i_0_ += anInt4050;
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		gl.glColor4f(1.0F, 1.0F, 1.0F, (float) i_1_ / 256.0F);
		gl.glTranslatef((float) i, (float) (Class121.anInt2034 - i_0_), 0.0F);
		gl.glCallList(anInt5094);
		gl.glLoadIdentity();
	}

	public void method400(int i, int i_9_, int i_10_, int i_11_) {
		if (i_10_ == 256)
			method391(i, i_9_);
		else {
			Class121.method1620();
			i += anInt4033;
			i_9_ += anInt4050;
			GL gl = Class121.aGL2030;
			Class121.method1632(anInt5089);
			method423(1);
			gl.glColor3ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_);
			gl.glTexEnvfv(8960, 8705, new float[] { 0.0F, 0.0F, 0.0F, (float) i_10_ / 256.0F }, 0);
			gl.glTranslatef((float) i, (float) (Class121.anInt2034 - i_9_), 0.0F);
			gl.glCallList(anInt5094);
			gl.glLoadIdentity();
		}
	}

	public void method419(int i, int i_2_, Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2_3_) {
		if (class14_sub2_sub19_sub2_3_ != null) {
			Class121.method1622();
			Class121.method1632(class14_sub2_sub19_sub2_3_.anInt5089);
			class14_sub2_sub19_sub2_3_.method423(1);
			GL gl = Class121.aGL2030;
			Class121.method1632(anInt5089);
			method423(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class14_sub2_sub19_sub2_3_.anInt5089);
			gl.glTexEnvi(8960, 34161, 7681);
			gl.glTexEnvi(8960, 34176, 34168);
			float f = ((float) (i - Class25.anInt475) / (float) class14_sub2_sub19_sub2_3_.anInt5092);
			float f_4_ = ((float) (i_2_ - Class25.anInt478) / (float) class14_sub2_sub19_sub2_3_.anInt5093);
			float f_5_ = ((float) (i + anInt4035 - Class25.anInt475) / (float) class14_sub2_sub19_sub2_3_.anInt5092);
			float f_6_ = ((float) (i_2_ + anInt4042 - Class25.anInt478) / (float) class14_sub2_sub19_sub2_3_.anInt5093);
			i += anInt4033;
			i_2_ += anInt4050;
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			float f_7_ = (float) anInt4035 / (float) anInt5092;
			float f_8_ = (float) anInt4042 / (float) anInt5093;
			gl.glMultiTexCoord2f(33985, f_5_, f_4_);
			gl.glTexCoord2f(f_7_, 0.0F);
			gl.glVertex2f((float) (i + anInt4035), (float) (Class121.anInt2034 - i_2_));
			gl.glMultiTexCoord2f(33985, f, f_4_);
			gl.glTexCoord2f(0.0F, 0.0F);
			gl.glVertex2f((float) i, (float) (Class121.anInt2034 - i_2_));
			gl.glMultiTexCoord2f(33985, f, f_6_);
			gl.glTexCoord2f(0.0F, f_8_);
			gl.glVertex2f((float) i, (float) (Class121.anInt2034 - (i_2_ + anInt4042)));
			gl.glMultiTexCoord2f(33985, f_5_, f_6_);
			gl.glTexCoord2f(f_7_, f_8_);
			gl.glVertex2f((float) (i + anInt4035), (float) (Class121.anInt2034 - (i_2_ + anInt4042)));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	public void method420(int i, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
			Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2_19_) {
		if (class14_sub2_sub19_sub2_19_ != null) {
			Class121.method1622();
			Class121.method1632(class14_sub2_sub19_sub2_19_.anInt5089);
			class14_sub2_sub19_sub2_19_.method423(1);
			GL gl = Class121.aGL2030;
			Class121.method1632(anInt5089);
			method423(1);
			gl.glActiveTexture(33985);
			gl.glEnable(3553);
			gl.glBindTexture(3553, class14_sub2_sub19_sub2_19_.anInt5089);
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
			float f = ((float) class14_sub2_sub19_sub2_19_.anInt4035 / (float) class14_sub2_sub19_sub2_19_.anInt5092);
			float f_34_ = ((float) class14_sub2_sub19_sub2_19_.anInt4042
					/ (float) class14_sub2_sub19_sub2_19_.anInt5093);
			gl.glBegin(6);
			gl.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			float f_35_ = (float) anInt5092 * 65536.0F;
			float f_36_ = (float) (anInt5093 * 65536);
			gl.glMultiTexCoord2f(33985, f, 0.0F);
			gl.glTexCoord2f((float) i_28_ / f_35_, (float) i_29_ / f_36_);
			gl.glVertex2f((float) (i + i_13_), (float) (Class121.anInt2034 - i_12_));
			gl.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			gl.glTexCoord2f((float) i_26_ / f_35_, (float) i_27_ / f_36_);
			gl.glVertex2f((float) i, (float) (Class121.anInt2034 - i_12_));
			gl.glMultiTexCoord2f(33985, 0.0F, f_34_);
			gl.glTexCoord2f((float) i_30_ / f_35_, (float) i_31_ / f_36_);
			gl.glVertex2f((float) i, (float) (Class121.anInt2034 - (i_12_ + i_14_)));
			gl.glMultiTexCoord2f(33985, f, f_34_);
			gl.glTexCoord2f((float) i_32_ / f_35_, (float) i_33_ / f_36_);
			gl.glVertex2f((float) (i + i_13_), (float) (Class121.anInt2034 - (i_12_ + i_14_)));
			gl.glEnd();
			gl.glTexEnvi(8960, 34161, 8448);
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glDisable(3553);
			gl.glActiveTexture(33984);
		}
	}

	public void method421(int i, int i_37_, int i_38_, int i_39_) {
		Class121.method1622();
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		float f = (float) anInt4035 / (float) anInt5092;
		float f_40_ = (float) anInt4042 / (float) anInt5093;
		f *= (float) i_38_;
		f_40_ *= (float) i_39_;
		int i_41_ = i + anInt4033;
		int i_42_ = i_41_ + anInt4035 * i_38_;
		int i_43_ = Class121.anInt2034 - i_37_ - anInt4050;
		int i_44_ = i_43_ - anInt4042 * i_39_;
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
		float f = (float) anInt4035 / (float) anInt5092;
		float f_45_ = (float) anInt4042 / (float) anInt5093;
		GL gl = Class121.aGL2030;
		if (anInt5094 == -1) {
			anInt5094 = gl.glGenLists(1);
			anInt5095 = Class11.anInt267;
		}
		gl.glNewList(anInt5094, 4864);
		gl.glBegin(6);
		gl.glTexCoord2f(f, 0.0F);
		gl.glVertex2f((float) anInt4035, 0.0F);
		gl.glTexCoord2f(0.0F, 0.0F);
		gl.glVertex2f(0.0F, 0.0F);
		gl.glTexCoord2f(0.0F, f_45_);
		gl.glVertex2f(0.0F, (float) -anInt4042);
		gl.glTexCoord2f(f, f_45_);
		gl.glVertex2f((float) anInt4035, (float) -anInt4042);
		gl.glEnd();
		gl.glEndList();
	}

	public void method423(int i) {
		if (anInt5090 != i) {
			anInt5090 = i;
			GL gl = Class121.aGL2030;
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
		Class121.method1655();
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(1);
		float f = (float) anInt4035 / (float) anInt5092;
		float f_95_ = (float) anInt4042 / (float) anInt5093;
		f *= (float) i_93_;
		f_95_ *= (float) i_94_;
		int i_96_ = i + anInt4033;
		int i_97_ = i_96_ + anInt4035 * i_93_;
		int i_98_ = Class121.anInt2034 - i_91_ - anInt4050;
		int i_99_ = i_98_ - anInt4042 * i_94_;
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
		Class121.method1622();
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt5089);
		method423(2);
		i -= anInt4033 << 4;
		i_101_ -= anInt4050 << 4;
		gl.glTranslatef((float) i_102_ / 16.0F, (float) Class121.anInt2034 - (float) i_103_ / 16.0F, 0.0F);
		gl.glRotatef((float) -i_104_ * 0.005493164F, 0.0F, 0.0F, 1.0F);
		if (i_105_ != 4096)
			gl.glScalef((float) i_105_ / 4096.0F, (float) i_105_ / 4096.0F, 0.0F);
		gl.glTranslatef((float) -i / 16.0F, (float) i_101_ / 16.0F, 0.0F);
		gl.glCallList(anInt5094);
		gl.glLoadIdentity();
	}

	public void method426(int[] is) {
		anInt5092 = Class14_Sub8_Sub33.method653(anInt4035);
		anInt5093 = Class14_Sub8_Sub33.method653(anInt4042);
		byte[] is_111_ = new byte[anInt5092 * anInt5093 * 4];
		int i = 0;
		int i_112_ = 0;
		int i_113_ = (anInt5092 - anInt4035) * 4;
		for (int i_114_ = 0; i_114_ < anInt4042; i_114_++) {
			for (int i_115_ = 0; i_115_ < anInt4035; i_115_++) {
				int i_116_ = is[i_112_++];
				if (i_116_ != 0) {
					is_111_[i++] = (byte) (i_116_ >> 16);
					is_111_[i++] = (byte) (i_116_ >> 8);
					is_111_[i++] = (byte) i_116_;
					is_111_[i++] = (byte) -1;
				} else
					i += 4;
			}
			i += i_113_;
		}
		ByteBuffer bytebuffer = ByteBuffer.wrap(is_111_);
		GL gl = Class121.aGL2030;
		if (anInt5089 == -1) {
			int[] is_117_ = new int[1];
			gl.glGenTextures(1, is_117_, 0);
			anInt5089 = is_117_[0];
			anInt5095 = Class11.anInt267;
		}
		Class121.method1632(anInt5089);
		gl.glTexImage2D(3553, 0, 6408, anInt5092, anInt5093, 0, 6408, 5121, bytebuffer);
		Class11.anInt263 += bytebuffer.limit() - anInt5091;
		anInt5091 = bytebuffer.limit();
	}
}
