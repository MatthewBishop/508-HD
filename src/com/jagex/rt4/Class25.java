/* Class25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import javax.media.opengl.GL;

public class Class25 {
	public static int anInt475 = 0;
	public static int anInt476 = 0;
	public static int anInt477 = 0;
	public static int anInt478 = 0;
	public static AbstractSprite_Sub2 aClass14_Sub2_Sub19_Sub2_479 = null;

	public static void method1008(AbstractSprite_Sub2 class14_sub2_sub19_sub2) {
		if (class14_sub2_sub19_sub2.height != anInt477 - anInt478)
			throw new IllegalArgumentException();
		aClass14_Sub2_Sub19_Sub2_479 = class14_sub2_sub19_sub2;
	}

	public static void method994() {
		anInt475 = 0;
		anInt478 = 0;
		anInt476 = RT4GL.canvasWidth;
		anInt477 = RT4GL.canvasHeight;
		GL gl = RT4GL.gl;
		gl.glDisable(3089);
		method996();
	}

	public static void method995() {
		RT4GL.gl.glClear(16640);
	}

	public static void method996() {
		aClass14_Sub2_Sub19_Sub2_479 = null;
	}

	public static void method997(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		RT4GL.method1637();
		float f = (float) i + 0.3F;
		float f_5_ = f + (float) (i_1_ - 1);
		float f_6_ = (float) RT4GL.canvasHeight - ((float) i_0_ + 0.3F);
		float f_7_ = f_6_ - (float) (i_2_ - 1);
		GL gl = RT4GL.gl;
		gl.glBegin(2);
		gl.glColor4ub((byte) (i_3_ >> 16), (byte) (i_3_ >> 8), (byte) i_3_, i_4_ > 255 ? (byte) -1 : (byte) i_4_);
		gl.glVertex2f(f, f_6_);
		gl.glVertex2f(f, f_7_);
		gl.glVertex2f(f_5_, f_7_);
		gl.glVertex2f(f_5_, f_6_);
		gl.glEnd();
	}

	public static void method998(int i, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		RT4GL.method1637();
		float f = (float) i;
		float f_13_ = f + (float) i_9_;
		float f_14_ = (float) (RT4GL.canvasHeight - i_8_);
		float f_15_ = f_14_ - (float) i_10_;
		GL gl = RT4GL.gl;
		gl.glBegin(6);
		gl.glColor3ub((byte) (i_11_ >> 16), (byte) (i_11_ >> 8), (byte) i_11_);
		gl.glVertex2f(f_13_, f_14_);
		gl.glVertex2f(f, f_14_);
		gl.glColor3ub((byte) (i_12_ >> 16), (byte) (i_12_ >> 8), (byte) i_12_);
		gl.glVertex2f(f, f_15_);
		gl.glVertex2f(f_13_, f_15_);
		gl.glEnd();
	}

	public static void method999(int i, int i_16_, int i_17_, int i_18_) {
		if (i < 0)
			i = 0;
		if (i_16_ < 0)
			i_16_ = 0;
		if (i_17_ > RT4GL.canvasWidth)
			i_17_ = RT4GL.canvasWidth;
		if (i_18_ > RT4GL.canvasHeight)
			i_18_ = RT4GL.canvasHeight;
		anInt475 = i;
		anInt478 = i_16_;
		anInt476 = i_17_;
		anInt477 = i_18_;
		GL gl = RT4GL.gl;
		gl.glEnable(3089);
		if (anInt475 > anInt476 || anInt478 > anInt477)
			gl.glScissor(0, 0, 0, 0);
		else
			gl.glScissor(anInt475, RT4GL.canvasHeight - anInt477, anInt476 - anInt475, anInt477 - anInt478);
		method996();
	}

	public static void method1000(int i, int i_19_, int i_20_, int i_21_) {
		RT4GL.method1637();
		float f = (float) i + 0.3F;
		float f_22_ = (float) RT4GL.canvasHeight - ((float) i_19_ + 0.3F);
		float f_23_ = f_22_ - (float) i_20_;
		GL gl = RT4GL.gl;
		gl.glBegin(1);
		gl.glColor3ub((byte) (i_21_ >> 16), (byte) (i_21_ >> 8), (byte) i_21_);
		gl.glVertex2f(f, f_22_);
		gl.glVertex2f(f, f_23_);
		gl.glEnd();
	}

	public static void method1001() {
		aClass14_Sub2_Sub19_Sub2_479 = null;
	}

	public static void method1002(int i, int i_24_, int i_25_, int i_26_) {
		if (anInt475 < i)
			anInt475 = i;
		if (anInt478 < i_24_)
			anInt478 = i_24_;
		if (anInt476 > i_25_)
			anInt476 = i_25_;
		if (anInt477 > i_26_)
			anInt477 = i_26_;
		GL gl = RT4GL.gl;
		gl.glEnable(3089);
		if (anInt475 > anInt476 || anInt478 > anInt477)
			gl.glScissor(0, 0, 0, 0);
		else
			gl.glScissor(anInt475, RT4GL.canvasHeight - anInt477, anInt476 - anInt475, anInt477 - anInt478);
		method996();
	}

	public static void method1003(int i, int i_27_, int i_28_, int i_29_, int i_30_) {
		RT4GL.method1637();
		float f = (float) i + 0.3F;
		float f_31_ = f + (float) (i_28_ - 1);
		float f_32_ = (float) RT4GL.canvasHeight - ((float) i_27_ + 0.3F);
		float f_33_ = f_32_ - (float) (i_29_ - 1);
		GL gl = RT4GL.gl;
		gl.glBegin(2);
		gl.glColor3ub((byte) (i_30_ >> 16), (byte) (i_30_ >> 8), (byte) i_30_);
		gl.glVertex2f(f, f_32_);
		gl.glVertex2f(f, f_33_);
		gl.glVertex2f(f_31_, f_33_);
		gl.glVertex2f(f_31_, f_32_);
		gl.glEnd();
	}

	public static void method1004(int i, int i_34_, int i_35_, int i_36_, int i_37_) {
		RT4GL.method1637();
		float f = (float) i;
		float f_38_ = f + (float) i_35_;
		float f_39_ = (float) (RT4GL.canvasHeight - i_34_);
		float f_40_ = f_39_ - (float) i_36_;
		GL gl = RT4GL.gl;
		gl.glBegin(6);
		gl.glColor3ub((byte) (i_37_ >> 16), (byte) (i_37_ >> 8), (byte) i_37_);
		gl.glVertex2f(f, f_39_);
		gl.glVertex2f(f, f_40_);
		gl.glVertex2f(f_38_, f_40_);
		gl.glVertex2f(f_38_, f_39_);
		gl.glEnd();
	}

	public static void method1005(int i, int i_41_, int i_42_, int i_43_, int i_44_) {
		RT4GL.method1637();
		float f = (float) i + 0.3F;
		float f_45_ = (float) i_42_ + 0.3F;
		float f_46_ = (float) RT4GL.canvasHeight - ((float) i_41_ + 0.3F);
		float f_47_ = (float) RT4GL.canvasHeight - ((float) i_43_ + 0.3F);
		GL gl = RT4GL.gl;
		gl.glBegin(2);
		gl.glColor3ub((byte) (i_44_ >> 16), (byte) (i_44_ >> 8), (byte) i_44_);
		gl.glVertex2f(f, f_46_);
		gl.glVertex2f(f_45_, f_47_);
		gl.glEnd();
	}

	public static void method1006(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_) {
		int i_53_ = i_49_ - i;
		int i_54_ = i_50_ - i_48_;
		int i_55_ = i_53_ >= 0 ? i_53_ : -i_53_;
		int i_56_ = i_54_ >= 0 ? i_54_ : -i_54_;
		int i_57_ = i_55_;
		if (i_57_ < i_56_)
			i_57_ = i_56_;
		if (i_57_ != 0) {
			int i_58_ = (i_53_ << 16) / i_57_;
			int i_59_ = (i_54_ << 16) / i_57_;
			if (i_59_ <= i_58_)
				i_58_ = -i_58_;
			else
				i_59_ = -i_59_;
			int i_60_ = i_52_ * i_59_ >> 17;
			int i_61_ = i_52_ * i_59_ + 1 >> 17;
			int i_62_ = i_52_ * i_58_ >> 17;
			int i_63_ = i_52_ * i_58_ + 1 >> 17;
			int i_64_ = i + i_60_;
			int i_65_ = i - i_61_;
			int i_66_ = i + i_53_ - i_61_;
			int i_67_ = i + i_53_ + i_60_;
			int i_68_ = i_48_ + i_62_;
			int i_69_ = i_48_ - i_63_;
			int i_70_ = i_48_ + i_54_ - i_63_;
			int i_71_ = i_48_ + i_54_ + i_62_;
			RT4GL.method1637();
			GL gl = RT4GL.gl;
			gl.glColor3ub((byte) (i_51_ >> 16), (byte) (i_51_ >> 8), (byte) i_51_);
			gl.glBegin(6);
			if (i_59_ <= i_58_) {
				gl.glVertex2f((float) i_67_, (float) (RT4GL.canvasHeight - i_71_));
				gl.glVertex2f((float) i_66_, (float) (RT4GL.canvasHeight - i_70_));
				gl.glVertex2f((float) i_65_, (float) (RT4GL.canvasHeight - i_69_));
				gl.glVertex2f((float) i_64_, (float) (RT4GL.canvasHeight - i_68_));
			} else {
				gl.glVertex2f((float) i_64_, (float) (RT4GL.canvasHeight - i_68_));
				gl.glVertex2f((float) i_65_, (float) (RT4GL.canvasHeight - i_69_));
				gl.glVertex2f((float) i_66_, (float) (RT4GL.canvasHeight - i_70_));
				gl.glVertex2f((float) i_67_, (float) (RT4GL.canvasHeight - i_71_));
			}
			gl.glEnd();
		}
	}

	public static void method1007(int i, int i_72_, int i_73_, int i_74_) {
		RT4GL.method1637();
		float f = (float) i + 0.3F;
		float f_75_ = f + (float) i_73_;
		float f_76_ = (float) RT4GL.canvasHeight - ((float) i_72_ + 0.3F);
		GL gl = RT4GL.gl;
		gl.glBegin(1);
		gl.glColor3ub((byte) (i_74_ >> 16), (byte) (i_74_ >> 8), (byte) i_74_);
		gl.glVertex2f(f, f_76_);
		gl.glVertex2f(f_75_, f_76_);
		gl.glEnd();
	}



	public static void method1009(int i, int i_77_, int i_78_, int i_79_, int i_80_, int i_81_) {
		RT4GL.method1637();
		float f = (float) i;
		float f_82_ = f + (float) i_78_;
		float f_83_ = (float) (RT4GL.canvasHeight - i_77_);
		float f_84_ = f_83_ - (float) i_79_;
		GL gl = RT4GL.gl;
		gl.glBegin(6);
		gl.glColor4ub((byte) (i_80_ >> 16), (byte) (i_80_ >> 8), (byte) i_80_, i_81_ > 255 ? (byte) -1 : (byte) i_81_);
		gl.glVertex2f(f, f_83_);
		gl.glVertex2f(f, f_84_);
		gl.glVertex2f(f_82_, f_84_);
		gl.glVertex2f(f_82_, f_83_);
		gl.glEnd();
	}
}
