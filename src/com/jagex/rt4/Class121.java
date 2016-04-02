/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.awt.Canvas;
import java.io.UnsupportedEncodingException;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;

import com.jagex.rt4.lights.Class10;

import rs.Class124;
import rs.Class14_Sub13;
import rs.Class14_Sub2_Sub2;
import rs.Class58;
import rs.Class70;
import rs.Static2;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub39_Sub1;
import rs.tex.Static;

public class Class121 {
	public static int anInt2016;
	public static boolean aBoolean2017 = true;
	public static int anInt2018;
	public static int anInt2019;
	public static float[] aFloatArray2020;
	public static boolean aBoolean2021;
	public static int anInt2022;
	public static boolean aBoolean2023;
	public static Class124 aClass124_2024;
	public static float aFloat2025 = 0.09765625F;
	public static boolean aBoolean2026;
	public static boolean aBoolean2027;
	public static float aFloat2028;
	public static boolean aBoolean2029 = false;
	public static GL aGL2030;
	public static String aString2031;
	public static boolean aBoolean2032;
	public static int anInt2033;
	public static int anInt2034;
	public static float aFloat2035;
	public static int anInt2036;
	public static String aString2037;
	public static int anInt2038;
	public static boolean aBoolean2039;
	public static GLContext aGLContext2040;
	public static boolean aBoolean2041;
	public static boolean aBoolean2042;
	public static int anInt2043;
	public static float aFloat2044;
	public static int anInt2045;
	public static boolean aBoolean2046;
	public static int anInt2047;
	public static boolean aBoolean2048;
	public static GLDrawable aGLDrawable2049;
	public static boolean aBoolean2050;
	public static boolean aBoolean2051;
	public static float aFloat2052;

	static {
		anInt2016 = 0;
		aClass124_2024 = Class14_Sub2_Sub2.method263(1178, "radeon");
		aBoolean2023 = true;
		aBoolean2039 = false;
		aFloatArray2020 = new float[16];
		anInt2045 = 0;
		anInt2022 = 0;
		aFloat2044 = 0.0F;
		aBoolean2041 = false;
		aBoolean2032 = true;
		aBoolean2027 = true;
		anInt2036 = -1;
		aFloat2052 = 0.0F;
	}

	public static void method1620() {
		RT4.method1778(0, 0);
		method1648();
		method1638(5);
		method1656(0);
		method1639(false);
		method1652(false);
		method1626(false);
		method1651();
	}

	public static int method1621(Canvas canvas, int i) {
		if (!canvas.isDisplayable())
			throw new IllegalStateException("Supplied canvas not on screen");
		GLCapabilities glcapabilities = new GLCapabilities();
		if (i > 0) {
			glcapabilities.setSampleBuffers(true);
			glcapabilities.setNumSamples(i);
		}
		GLDrawableFactory gldrawablefactory = GLDrawableFactory.getFactory();
		aGLDrawable2049 = gldrawablefactory.getGLDrawable(canvas, glcapabilities, null);
		aGLDrawable2049.setRealized(true);
		for (;;) {
			aGLContext2040 = aGLDrawable2049.createContext(null);
			try {
				int i_0_ = aGLContext2040.makeCurrent();
				if (i_0_ != 0)
					break;
			} catch (Exception exception) {
				/* empty */
			}
			Class14_Sub13.method864(1000L, (byte) 64);
		}
		aGL2030 = aGLContext2040.getGL();
		new GLU();
		anInt2033 = canvas.getSize().width;
		anInt2034 = canvas.getSize().height;
		if (!aBoolean2041) {
			int i_1_ = method1636();
			if (i_1_ != 0)
				return i_1_;
			aBoolean2041 = true;
		}
		method1650();
		method1643();
		aGL2030.glClear(16384);
		int i_2_ = 0;
		while (i_2_ < 10) {
			try {
				aGLDrawable2049.swapBuffers();
			} catch (Exception exception) {
				Class14_Sub13.method864(100L, (byte) 64);
				i_2_++;
				continue;
			}
			break;
		}
		aGL2030.glClear(16384);
		return 0;
	}

	public static void method1622() {
		RT4.method1778(0, 0);
		method1648();
		method1638(1);
		method1656(1);
		method1639(false);
		method1652(false);
		method1626(false);
		method1651();
	}

	public static void method1623() {
		RT4.method1778(0, 0);
		method1648();
		method1638(0);
		method1656(0);
		method1639(false);
		method1652(false);
		method1626(false);
		method1651();
	}

	public static float method1624() {
		return aFloat2044;
	}

	public static void method1625() {
		aGL2030.glDepthMask(true);
	}

	public static void method1626(boolean bool) {
		if (bool != aBoolean2017) {
			if (bool)
				aGL2030.glEnable(2912);
			else
				aGL2030.glDisable(2912);
			aBoolean2017 = bool;
		}
	}

	public static void method1627() {
		int[] is = new int[2];
		aGL2030.glGetIntegerv(3073, is, 0);
		aGL2030.glGetIntegerv(3074, is, 1);
		aGL2030.glDrawBuffer(1026);
		aGL2030.glReadBuffer(1024);
		method1632(-1);
		aGL2030.glPushAttrib(8192);
		aGL2030.glDisable(2912);
		aGL2030.glDisable(3042);
		aGL2030.glDisable(2929);
		aGL2030.glDisable(3008);
		aGL2030.glRasterPos2i(0, 0);
		aGL2030.glCopyPixels(0, 0, anInt2033, anInt2034, 6144);
		aGL2030.glPopAttrib();
		aGL2030.glDrawBuffer(is[0]);
		aGL2030.glReadBuffer(is[1]);
	}

	public static void method1628(int i, int i_3_) {
		anInt2033 = i;
		anInt2034 = i_3_;
		aBoolean2029 = false;
	}

	public static void method1629() {
		aGL2030.glClear(256);
	}

	public static void method1630() {
		if (aGLContext2040 != null) {
			if (GLContext.getCurrent() == aGLContext2040)
				aGLContext2040.release();
			aGLContext2040.destroy();
			aGLContext2040 = null;
		}
		if (aGLDrawable2049 != null) {
			aGLDrawable2049.setRealized(false);
			aGLDrawable2049 = null;
		}
	}

	public static void method1631(int i) {
		aGL2030.glClearColor((float) (i >> 16 & 0xff) / 255.0F, (float) (i >> 8 & 0xff) / 255.0F,
				(float) (i & 0xff) / 255.0F, 0.0F);
		aGL2030.glClear(16640);
	}

	public static void method1632(int i) {
		if (i != anInt2036) {
			if (i != -1) {
				if (anInt2036 == -1)
					aGL2030.glEnable(3553);
				aGL2030.glBindTexture(3553, i);
			} else
				aGL2030.glDisable(3553);
			anInt2036 = i;
		}
	}

	public static Class124 method1633(String string) {
		byte[] is;
		try {
			is = string.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException unsupportedencodingexception) {
			is = string.getBytes();
		}
		return Static2.method231((byte) 120, is.length, is, 0);
	}

	public static void method1634(boolean bool) {
		if (bool != aBoolean2027) {
			if (bool)
				aGL2030.glEnableClientState(32885);
			else
				aGL2030.glDisableClientState(32885);
			aBoolean2027 = bool;
		}
	}

	public static void method1635(float f, float f_4_) {
		if (!aBoolean2029 && (f != aFloat2052 || f_4_ != aFloat2044)) {
			aFloat2052 = f;
			aFloat2044 = f_4_;
			if (f_4_ != 0.0F) {
				float f_5_ = f / (f_4_ + f);
				float f_6_ = f_5_ * f_5_;
				float f_7_ = -aFloat2035 * (1.0F - f_5_) * (1.0F - f_5_) / f_4_;
				aFloatArray2020[10] = aFloat2028 + f_7_;
				aFloatArray2020[14] = aFloat2035 * f_6_;
			} else {
				aFloatArray2020[10] = aFloat2028;
				aFloatArray2020[14] = aFloat2035;
			}
			aGL2030.glMatrixMode(5889);
			aGL2030.glLoadMatrixf(aFloatArray2020, 0);
			aGL2030.glMatrixMode(5888);
		}
	}

	public static int method1636() {
		int i = 0;
		aString2031 = aGL2030.glGetString(7936);
		aString2037 = aGL2030.glGetString(7937);
		String string = aString2031.toLowerCase();
		if (string.indexOf("microsoft") != -1)
			i |= 0x1;
		if (string.indexOf("brian paul") != -1 || string.indexOf("mesa") != -1)
			i |= 0x1;
		String string_8_ = aGL2030.glGetString(7938);
		String[] strings = string_8_.split("[. ]");
		if (strings.length >= 2) {
			try {
				int i_9_ = Integer.parseInt(strings[0]);
				int i_10_ = Integer.parseInt(strings[1]);
				anInt2018 = i_9_ * 10 + i_10_;
			} catch (NumberFormatException numberformatexception) {
				i |= 0x4;
			}
		} else
			i |= 0x4;
		if (anInt2018 < 12)
			i |= 0x2;
		if (!aGL2030.isExtensionAvailable("GL_ARB_multitexture"))
			i |= 0x8;
		if (!aGL2030.isExtensionAvailable("GL_ARB_texture_env_combine"))
			i |= 0x20;
		int[] is = new int[1];
		aGL2030.glGetIntegerv(34018, is, 0);
		anInt2019 = is[0];
		aGL2030.glGetIntegerv(34929, is, 0);
		anInt2043 = is[0];
		aGL2030.glGetIntegerv(34930, is, 0);
		anInt2047 = is[0];
		if (anInt2019 < 2 || anInt2043 < 2 || anInt2047 < 2)
			i |= 0x10;
		if (i != 0)
			return i;
		aBoolean2046 = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		aBoolean2021 = aGL2030.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		aBoolean2050 = aGL2030.isExtensionAvailable("GL_ARB_multisample");
		aBoolean2026 = aGL2030.isExtensionAvailable("GL_ARB_texture_cube_map");
		aBoolean2048 = aGL2030.isExtensionAvailable("GL_ARB_vertex_program");
		aBoolean2042 = aGL2030.isExtensionAvailable("GL_EXT_texture3D");
		Class124 class124 = method1633(aString2037).method1716((byte) 63);
		if (class124.method1700(-19928, aClass124_2024) != -1) {
			int i_11_ = 0;
			Class124[] class124s = class124.method1665(14, 47, 32).method1719(32, -88);
			for (int i_12_ = 0; i_12_ < class124s.length; i_12_++) {
				Class124 class124_13_ = class124s[i_12_];
				if (class124_13_.method1693(0) >= 4 && class124_13_.method1697(0, 4, (byte) -104).method1701(119)) {
					i_11_ = class124_13_.method1697(0, 4, (byte) -104).method1702(80);
					break;
				}
			}
			if (i_11_ >= 7000 && i_11_ <= 7999)
				aBoolean2021 = false;
			if (i_11_ >= 7000 && i_11_ <= 9250)
				aBoolean2042 = false;
			aBoolean2051 = aBoolean2021;
		}
		return 0;
	}

	public static void method1637() {
		RT4.method1778(0, 0);
		method1648();
		method1632(-1);
		method1639(false);
		method1652(false);
		method1626(false);
		method1651();
	}

	public static void method1638(int i) {
		if (i != anInt2016) {
			if (i == 0)
				aGL2030.glTexEnvi(8960, 34161, 8448);
			if (i == 1)
				aGL2030.glTexEnvi(8960, 34161, 7681);
			if (i == 2)
				aGL2030.glTexEnvi(8960, 34161, 260);
			if (i == 3)
				aGL2030.glTexEnvi(8960, 34161, 34023);
			if (i == 4)
				aGL2030.glTexEnvi(8960, 34161, 34164);
			if (i == 5)
				aGL2030.glTexEnvi(8960, 34161, 34165);
			anInt2016 = i;
		}
	}

	public static void method1639(boolean bool) {
		if (bool != aBoolean2023) {
			if (bool)
				aGL2030.glEnable(2896);
			else
				aGL2030.glDisable(2896);
			aBoolean2023 = bool;
		}
	}

	public static void method1640(float f) {
		method1635(3000.0F, f * 1.5F);
	}

	public static void method1641(float f, float f_14_, float f_15_) {
		aGL2030.glMatrixMode(5890);
		if (aBoolean2039)
			aGL2030.glLoadIdentity();
		aGL2030.glTranslatef(f, f_14_, f_15_);
		aGL2030.glMatrixMode(5888);
		aBoolean2039 = true;
	}

	public static void method1642(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		int i_21_ = -i;
		int i_22_ = anInt2033 - i;
		int i_23_ = -i_16_;
		int i_24_ = anInt2034 - i_16_;
		aGL2030.glMatrixMode(5889);
		aGL2030.glLoadIdentity();
		float f = (float) i_17_ / 512.0F;
		float f_25_ = f * (256.0F / (float) i_19_);
		float f_26_ = f * (256.0F / (float) i_20_);
		aGL2030.glOrtho((double) ((float) i_21_ * f_25_), (double) ((float) i_22_ * f_25_),
				(double) ((float) -i_24_ * f_26_), (double) ((float) -i_23_ * f_26_), (double) (50 - i_18_),
				(double) (3584 - i_18_));
		aGL2030.glViewport(0, 0, anInt2033, anInt2034);
		aGL2030.glMatrixMode(5888);
		aGL2030.glLoadIdentity();
		aGL2030.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		aBoolean2029 = false;
	}

	public static void method1643() {
		aBoolean2029 = false;
		aGL2030.glDisable(3553);
		anInt2036 = -1;
		aGL2030.glTexEnvi(8960, 8704, 34160);
		aGL2030.glTexEnvi(8960, 34161, 8448);
		anInt2016 = 0;
		aGL2030.glTexEnvi(8960, 34162, 8448);
		anInt2022 = 0;
		aGL2030.glEnable(2896);
		aGL2030.glEnable(2912);
		aGL2030.glEnable(2929);
		aBoolean2023 = true;
		aBoolean2032 = true;
		aBoolean2017 = true;
		Class14_Sub8_Sub39_Sub1.method685(-53);
		aGL2030.glActiveTexture(33985);
		aGL2030.glTexEnvi(8960, 8704, 34160);
		aGL2030.glTexEnvi(8960, 34161, 8448);
		aGL2030.glTexEnvi(8960, 34162, 8448);
		aGL2030.glActiveTexture(33984);
		aGL2030.setSwapInterval(0);
		aGL2030.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		aGL2030.glShadeModel(7425);
		aGL2030.glClearDepth(1.0);
		aGL2030.glDepthFunc(515);
		method1625();
		aGL2030.glMatrixMode(5890);
		aGL2030.glLoadIdentity();
		aGL2030.glPolygonMode(1028, 6914);
		aGL2030.glEnable(2884);
		aGL2030.glCullFace(1029);
		aGL2030.glEnable(3042);
		aGL2030.glBlendFunc(770, 771);
		aGL2030.glEnable(3008);
		aGL2030.glAlphaFunc(516, 0.0F);
		aGL2030.glEnableClientState(32884);
		aGL2030.glEnableClientState(32885);
		aBoolean2027 = true;
		aGL2030.glEnableClientState(32886);
		aGL2030.glEnableClientState(32888);
		aGL2030.glMatrixMode(5888);
		aGL2030.glLoadIdentity();
		AthmosphericEffects.setupLighting();
		Class10.method194();
	}

	public static void method1644(int i, int i_27_, int i_28_, int i_29_) {
		method1647(0, 0, anInt2033, anInt2034, i, i_27_, 0.0F, 0.0F, i_28_, i_29_);
	}

	public static void method1645() {
		if (RT4.useLighting) {
			method1639(true);
			method1634(true);
		} else {
			method1639(false);
			method1634(false);
		}
	}

	public static void method1646() {
		aGL2030.glDepthMask(false);
	}

	public static void method1647(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, float f, float f_35_,
			int i_36_, int i_37_) {
		int i_38_ = (i - i_33_ << 8) / i_36_;
		int i_39_ = (i + i_31_ - i_33_ << 8) / i_36_;
		int i_40_ = (i_30_ - i_34_ << 8) / i_37_;
		int i_41_ = (i_30_ + i_32_ - i_34_ << 8) / i_37_;
		aGL2030.glMatrixMode(5889);
		aGL2030.glLoadIdentity();
		method1649((float) i_38_ * aFloat2025, (float) i_39_ * aFloat2025, (float) -i_41_ * aFloat2025,
				(float) -i_40_ * aFloat2025, 50.0F, 3584.0F);
		aGL2030.glViewport(i, anInt2034 - i_30_ - i_32_, i_31_, i_32_);
		aGL2030.glMatrixMode(5888);
		aGL2030.glLoadIdentity();
		aGL2030.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (f != 0.0F)
			aGL2030.glRotatef(f, 1.0F, 0.0F, 0.0F);
		if (f_35_ != 0.0F)
			aGL2030.glRotatef(f_35_, 0.0F, 1.0F, 0.0F);
		aBoolean2029 = false;
		Static.anInt425 = i_38_;
		Class14_Sub8_Sub27.anInt4547 = i_39_;
		Class58.anInt948 = i_40_;
		Class70.anInt1081 = i_41_;
	}

	public static void method1648() {
		if (!aBoolean2029) {
			aGL2030.glMatrixMode(5889);
			aGL2030.glLoadIdentity();
			aGL2030.glOrtho(0.0, (double) anInt2033, 0.0, (double) anInt2034, -1.0, 1.0);
			aGL2030.glViewport(0, 0, anInt2033, anInt2034);
			aGL2030.glMatrixMode(5888);
			aGL2030.glLoadIdentity();
			aBoolean2029 = true;
		}
	}

	public static void method1649(float f, float f_42_, float f_43_, float f_44_, float f_45_, float f_46_) {
		float f_47_ = f_45_ * 2.0F;
		aFloatArray2020[0] = f_47_ / (f_42_ - f);
		aFloatArray2020[1] = 0.0F;
		aFloatArray2020[2] = 0.0F;
		aFloatArray2020[3] = 0.0F;
		aFloatArray2020[4] = 0.0F;
		aFloatArray2020[5] = f_47_ / (f_44_ - f_43_);
		aFloatArray2020[6] = 0.0F;
		aFloatArray2020[7] = 0.0F;
		aFloatArray2020[8] = (f_42_ + f) / (f_42_ - f);
		aFloatArray2020[9] = (f_44_ + f_43_) / (f_44_ - f_43_);
		aFloatArray2020[10] = aFloat2028 = -(f_46_ + f_45_) / (f_46_ - f_45_);
		aFloatArray2020[11] = -1.0F;
		aFloatArray2020[12] = 0.0F;
		aFloatArray2020[13] = 0.0F;
		aFloatArray2020[14] = aFloat2035 = -(f_47_ * f_46_) / (f_46_ - f_45_);
		aFloatArray2020[15] = 0.0F;
		aGL2030.glLoadMatrixf(aFloatArray2020, 0);
		aFloat2052 = 0.0F;
		aFloat2044 = 0.0F;
	}

	public static void method1650() {
		int[] is = new int[1];
		aGL2030.glGenTextures(1, is, 0);
		anInt2038 = is[0];
		aGL2030.glBindTexture(3553, anInt2038);
		aGL2030.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		RT4.method1022(-124);
	}

	public static void method1651() {
		if (aBoolean2039) {
			aGL2030.glMatrixMode(5890);
			aGL2030.glLoadIdentity();
			aGL2030.glMatrixMode(5888);
			aBoolean2039 = false;
		}
	}

	public static void method1652(boolean bool) {
		if (bool != aBoolean2032) {
			if (bool)
				aGL2030.glEnable(2929);
			else
				aGL2030.glDisable(2929);
			aBoolean2032 = bool;
		}
	}

	public static float method1653() {
		return aFloat2052;
	}

	public static void method1654() {
		aClass124_2024 = null;
		aString2037 = null;
		aString2031 = null;
		aGL2030 = null;
		aGLDrawable2049 = null;
		aGLContext2040 = null;
		aFloatArray2020 = null;
	}

	public static void method1655() {
		RT4.method1778(0, 0);
		method1648();
		method1638(0);
		method1656(0);
		method1639(false);
		method1652(false);
		method1626(false);
		method1651();
	}

	public static void method1656(int i) {
		if (i != anInt2022) {
			if (i == 0)
				aGL2030.glTexEnvi(8960, 34162, 8448);
			if (i == 1)
				aGL2030.glTexEnvi(8960, 34162, 7681);
			if (i == 2)
				aGL2030.glTexEnvi(8960, 34162, 260);
			anInt2022 = i;
		}
	}

	public static void method1657() {
		try {
			aGLDrawable2049.swapBuffers();
		} catch (Exception exception) {
			/* empty */
		}
	}
}
