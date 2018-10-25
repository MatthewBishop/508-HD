/* Class121 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.awt.Canvas;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Locale;

import javax.media.opengl.GL;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLContext;
import javax.media.opengl.GLDrawable;
import javax.media.opengl.GLDrawableFactory;
import javax.media.opengl.glu.GLU;

import com.jagex.rt4.lights.LightManager;
import com.jagex.util.Util;

import rs.Class58;
import rs.Class70;
import rs.JunkTex;
import rs550.AStringUtils;

public class RT4GL {
	public static int rgb_combine_mode;
	public static boolean fog_enabled = true;
	public static int version;
	public static int maxTextureUnits;
	public static float[] matrices;
	public static boolean has_vbo;
	public static int anInt2022;
	public static boolean using_gl_lighting;
	public static float defaultZoom = 0.09765625F;
	public static boolean has_cubemap;
	public static boolean normal_array_enabled;
	public static float aFloat2028;
	public static boolean ortho_2d_set = false;
	public static GL gl;
	public static String vendor;
	public static boolean aBoolean2032;
	public static int canvasWidth;
	public static int canvasHeight;
	public static float aFloat2035;
	public static int bound_texture_2d;
	public static String renderer;
	public static int generated_texture_id;
	public static boolean texture_matrix_dirty;
	public static GLContext glcontext;
	public static boolean aBoolean2041;
	public static boolean has_texture_3d;
	public static int maxTextureCoordinates;
	public static float aFloat2044;
	public static int loopCycleWrapper;
	public static boolean byte_order_bigendian;
	public static int maxTextureImageUnitsARB;
	public static boolean has_vertex_program;
	public static GLDrawable gldrawable;
	public static boolean has_multisample;
	public static boolean aBoolean2051;
	public static float aFloat2052;

	static {
		rgb_combine_mode = 0;
		using_gl_lighting = true;
		texture_matrix_dirty = false;
		matrices = new float[16];
		loopCycleWrapper = 0;
		anInt2022 = 0;
		aFloat2044 = 0.0F;
		aBoolean2041 = false;
		aBoolean2032 = true;
		normal_array_enabled = true;
		bound_texture_2d = -1;
		aFloat2052 = 0.0F;
	}

	public static void method1620() {
		RT4.method1778(0, 0);
		setupBasic2DOrthoProjection();
		setRgbCombineMode(5);
		setAlphaCombineMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();        
	}

	public static int createglcanvas(Canvas canvas, int samples) {
		if (!canvas.isDisplayable())
			throw new IllegalStateException("Supplied canvas not on screen");
		GLCapabilities glcapabilities = new GLCapabilities();
		if (samples > 0) {
			glcapabilities.setSampleBuffers(true);
			glcapabilities.setNumSamples(samples);
		}
		GLDrawableFactory gldrawablefactory = GLDrawableFactory.getFactory();
		gldrawable = gldrawablefactory.getGLDrawable(canvas, glcapabilities, null);
		gldrawable.setRealized(true);
		for (;;) {
			glcontext = gldrawable.createContext(null);
			try {
				int i_0_ = glcontext.makeCurrent();
				if (i_0_ != 0)
					break;
			} catch (Exception exception) {
				/* empty */
			}
			Util.accuratesleep(1000L);
		}
		gl = glcontext.getGL();
		new GLU();
		canvasWidth = canvas.getSize().width;
		canvasHeight = canvas.getSize().height;
		if (!aBoolean2041) {
			int i_1_ = loadCapabilitys();
			if (i_1_ != 0)
				return i_1_;
			aBoolean2041 = true;
		}
		generateTexture2D();
		method1643();
		gl.glClear(16384);
		int i_2_ = 0;
		while (i_2_ < 10) {
			try {
				gldrawable.swapBuffers();
			} catch (Exception exception) {
				Util.accuratesleep(100L);
				i_2_++;
				continue;
			}
			break;
		}
		gl.glClear(16384);
		return 0;
	}

	public static void method1622() {
		RT4.method1778(0, 0);
		setupBasic2DOrthoProjection();
		setRgbCombineMode(1);
		setAlphaCombineMode(1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	public static void method1623() {
		RT4.method1778(0, 0);
		setupBasic2DOrthoProjection();
		setRgbCombineMode(0);
		setAlphaCombineMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	public static float method1624() {
		return aFloat2044;
	}

	public static void enableDepthBufferWriting() {
		gl.glDepthMask(true);
	}

	public static void setFogEnabled(boolean bool) {
		if (bool != fog_enabled) {
			if (bool)
				gl.glEnable(2912);
			else
				gl.glDisable(2912);
			fog_enabled = bool;
		}
	}

	public static void method1627() {
		int[] is = new int[2];
		gl.glGetIntegerv(3073, is, 0);
		gl.glGetIntegerv(3074, is, 1);
		gl.glDrawBuffer(1026);
		gl.glReadBuffer(1024);
		bindTexture2D(-1);
		gl.glPushAttrib(8192);
		gl.glDisable(2912);
		gl.glDisable(3042);
		gl.glDisable(2929);
		gl.glDisable(3008);
		gl.glRasterPos2i(0, 0);
		gl.glCopyPixels(0, 0, canvasWidth, canvasHeight, 6144);
		gl.glPopAttrib();
		gl.glDrawBuffer(is[0]);
		gl.glReadBuffer(is[1]);
	}

	public static void setViewportSize(int width, int height) {
		canvasWidth = width;
		canvasHeight = height;
		ortho_2d_set = false;
	}

	public static void clearDepthBuffer() {
		gl.glClear(256);
	}

	public static void destroyGL() {
		if (glcontext != null) {
			if (GLContext.getCurrent() == glcontext)
				glcontext.release();
			glcontext.destroy();
			glcontext = null;
		}
		if (gldrawable != null) {
			gldrawable.setRealized(false);
			gldrawable = null;
		}
	}

	public static void setClearColor(int i) {
		gl.glClearColor((float) (i >> 16 & 0xff) / 255.0F, (float) (i >> 8 & 0xff) / 255.0F,
				(float) (i & 0xff) / 255.0F, 0.0F);
		gl.glClear(16640);
	}

	public static void bindTexture2D(int i) {
		if (i != bound_texture_2d) {
			if (i != -1) {
				if (bound_texture_2d == -1)
					gl.glEnable(3553);
				gl.glBindTexture(3553, i);
			} else
				gl.glDisable(3553);
			bound_texture_2d = i;
		}
	}

	public static void setNormalArrayEnabled(boolean bool) {
		if (bool != normal_array_enabled) {
			if (bool)
				gl.glEnableClientState(32885);
			else
				gl.glDisableClientState(32885);
			normal_array_enabled = bool;
		}
	}

	public static void setupSomeCustomProjection(float f, float height) {
		if (!ortho_2d_set && (f != aFloat2052 || height != aFloat2044)) {
			aFloat2052 = f;
			aFloat2044 = height;
			if (height != 0.0F) {
				float f_5_ = f / (height + f);
				float f_6_ = f_5_ * f_5_;
				float f_7_ = -aFloat2035 * (1.0F - f_5_) * (1.0F - f_5_) / height;
				matrices[10] = aFloat2028 + f_7_;
				matrices[14] = aFloat2035 * f_6_;
			} else {
				matrices[10] = aFloat2028;
				matrices[14] = aFloat2035;
			}
			gl.glMatrixMode(5889);
			gl.glLoadMatrixf(matrices, 0);
			gl.glMatrixMode(5888);
		}
	}

	public static int loadCapabilitys() {
		int result = 0;
		vendor = gl.glGetString(7936);
		renderer = gl.glGetString(7937);
		String string = vendor.toLowerCase();
		if (string.indexOf("microsoft") != -1)
			result |= 0x1;
		if (string.indexOf("brian paul") != -1 || string.indexOf("mesa") != -1)
			result |= 0x1;
		String versionString = gl.glGetString(7938);
		String[] version_parts = versionString.split("[. ]");
		if (version_parts.length >= 2) {
			try {
				int major = Integer.parseInt(version_parts[0]);
				int minor = Integer.parseInt(version_parts[1]);
				RT4GL.version = major * 10 + minor;
			} catch (NumberFormatException numberformatexception) {
				result |= 0x4;
			}
		} else
			result |= 0x4;
		if (RT4GL.version < 12)
			result |= 0x2;
		if (!gl.isExtensionAvailable("GL_ARB_multitexture"))
			result |= 0x8;
		if (!gl.isExtensionAvailable("GL_ARB_texture_env_combine"))
			result |= 0x20;
		int[] is = new int[1];
		gl.glGetIntegerv(34018, is, 0);
		maxTextureUnits = is[0];
		gl.glGetIntegerv(34929, is, 0);
		maxTextureCoordinates = is[0];
		gl.glGetIntegerv(34930, is, 0);
		maxTextureImageUnitsARB = is[0];
		if (maxTextureUnits < 2 || maxTextureCoordinates < 2 || maxTextureImageUnitsARB < 2)
			result |= 0x10;
		if (result != 0)
			return result;
		byte_order_bigendian = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
		has_vbo = gl.isExtensionAvailable("GL_ARB_vertex_buffer_object");
		has_multisample = gl.isExtensionAvailable("GL_ARB_multisample");
		has_cubemap = gl.isExtensionAvailable("GL_ARB_texture_cube_map");
		has_vertex_program = gl.isExtensionAvailable("GL_ARB_vertex_program");
		has_texture_3d = gl.isExtensionAvailable("GL_EXT_texture3D");
		
		final String rendererLowerCase = renderer.toLowerCase(Locale.ENGLISH);
		if (rendererLowerCase.indexOf("radeon") != -1) {
			int version = 0;
			final String[] strings_51_ = AStringUtils.splitString(rendererLowerCase.replace('/', ' '), ' ');
			for (int i_54_ = 0; i_54_ < strings_51_.length; i_54_++) {
				final String string_55_ = strings_51_[i_54_];
				if (string_55_.length() >= 4) {
					if (AStringUtils.isValidStringBase10(string_55_.substring(0, 4))) {
						version = AStringUtils.stringToBase10(string_55_.substring(0, 4));
						break;
					}
				}
			}
			if (version >= 7000 && version <= 7999)
				has_vbo = false;
			if (version >= 7000 && version <= 9250)
				has_texture_3d = false;
			aBoolean2051 = has_vbo;
		}
		
		return 0;
	}

	public static void method1637() {
		RT4.method1778(0, 0);
		setupBasic2DOrthoProjection();
		bindTexture2D(-1);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	public static void setRgbCombineMode(int i) {
		if (i != rgb_combine_mode) {
			if (i == 0)
				gl.glTexEnvi(8960, 34161, 8448);
			if (i == 1)
				gl.glTexEnvi(8960, 34161, 7681);
			if (i == 2)
				gl.glTexEnvi(8960, 34161, 260);
			if (i == 3)
				gl.glTexEnvi(8960, 34161, 34023);
			if (i == 4)
				gl.glTexEnvi(8960, 34161, 34164);
			if (i == 5)
				gl.glTexEnvi(8960, 34161, 34165);
			rgb_combine_mode = i;
		}
	}

	public static void setLightingEnabled(boolean enable) {
		if (enable != using_gl_lighting) {
			if (enable)
				gl.glEnable(2896);
			else
				gl.glDisable(2896);
			using_gl_lighting = enable;
		}
	}

	public static void setupSomeCustomProjectionStub(float f) {
		setupSomeCustomProjection(3000.0F, f * 1.5F);
	}

	public static void method1641(float f, float f_14_, float f_15_) {
		gl.glMatrixMode(5890);
		if (texture_matrix_dirty)
			gl.glLoadIdentity();
		gl.glTranslatef(f, f_14_, f_15_);
		gl.glMatrixMode(5888);
		texture_matrix_dirty = true;
	}

	public static void method1642(int i, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_) {
		int i_21_ = -i;
		int i_22_ = canvasWidth - i;
		int i_23_ = -i_16_;
		int i_24_ = canvasHeight - i_16_;
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		float f = (float) i_17_ / 512.0F;
		float f_25_ = f * (256.0F / (float) i_19_);
		float f_26_ = f * (256.0F / (float) i_20_);
		gl.glOrtho((double) ((float) i_21_ * f_25_), (double) ((float) i_22_ * f_25_),
				(double) ((float) -i_24_ * f_26_), (double) ((float) -i_23_ * f_26_), (double) (50 - i_18_),
				(double) (3584 - i_18_));
		gl.glViewport(0, 0, canvasWidth, canvasHeight);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		ortho_2d_set = false;
	}

	public static void method1643() {
		ortho_2d_set = false;
		gl.glDisable(3553);
		bound_texture_2d = -1;
		gl.glTexEnvi(8960, 8704, 34160);
		gl.glTexEnvi(8960, 34161, 8448);
		rgb_combine_mode = 0;
		gl.glTexEnvi(8960, 34162, 8448);
		anInt2022 = 0;
		gl.glEnable(2896);
		gl.glEnable(2912);
		gl.glEnable(2929);
		using_gl_lighting = true;
		aBoolean2032 = true;
		fog_enabled = true;
		JunkTex.method685(-53);
		gl.glActiveTexture(33985);
		gl.glTexEnvi(8960, 8704, 34160);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glActiveTexture(33984);
		gl.setSwapInterval(0);
		gl.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		gl.glShadeModel(7425);
		gl.glClearDepth(1.0);
		gl.glDepthFunc(515);
		enableDepthBufferWriting();
		gl.glMatrixMode(5890);
		gl.glLoadIdentity();
		gl.glPolygonMode(1028, 6914);
		gl.glEnable(2884);
		gl.glCullFace(1029);
		gl.glEnable(3042);
		gl.glBlendFunc(770, 771);
		gl.glEnable(3008);
		gl.glAlphaFunc(516, 0.0F);
		gl.glEnableClientState(32884);
		gl.glEnableClientState(32885);
		normal_array_enabled = true;
		gl.glEnableClientState(32886);
		gl.glEnableClientState(32888);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		AtmosphericEffects.setupLighting();
		LightManager.resetGLLights();
	}

	public static void method1644(int centerX, int centerY, int z1, int z2) {
		method1647(0, 0, canvasWidth, canvasHeight, centerX, centerY, 0.0F, 0.0F, z1, z2);
	}

	public static void applyLightingSetting() {
		if (RT4.useLighting) {
			setLightingEnabled(true);
			setNormalArrayEnabled(true);
		} else {
			setLightingEnabled(false);
			setNormalArrayEnabled(false);
		}
	}

	public static void method1646() {
		gl.glDepthMask(false);
	}

	public static void method1647(int x, int y, int width, int height, int centerX, int centerY, float pitch, float yaw,
			int z1, int z2) {
		//Values that hold pixel offset from screen center
		int left = (x - centerX << 8) / z1;
		int right = (x + width - centerX << 8) / z1;
		int top = (y - centerY << 8) / z2;
		int bottom = (y + height - centerY << 8) / z2;
		
		gl.glMatrixMode(5889);
		gl.glLoadIdentity();
		loadFrustumMatrix((float) left * defaultZoom, (float) right * defaultZoom, (float) -bottom * defaultZoom,
				(float) -top * defaultZoom, 50.0F, 3584.0F);
		gl.glViewport(x, canvasHeight - y - height, width, height);
		gl.glMatrixMode(5888);
		gl.glLoadIdentity();
		gl.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
		if (pitch != 0.0F)
			gl.glRotatef(pitch, 1.0F, 0.0F, 0.0F);
		if (yaw != 0.0F)
			gl.glRotatef(yaw, 0.0F, 1.0F, 0.0F);
		ortho_2d_set = false;
		JunkTex.viewportLeft = left;
		JunkTex.viewportRight = right;
		Class58.viewportTop = top;
		Class70.viewportBottom = bottom;
	}

	public static void setupBasic2DOrthoProjection() {
		if (!ortho_2d_set) {
			gl.glMatrixMode(5889);
			gl.glLoadIdentity();
			gl.glOrtho(0.0, (double) canvasWidth, 0.0, (double) canvasHeight, -1.0, 1.0);
			gl.glViewport(0, 0, canvasWidth, canvasHeight);
			gl.glMatrixMode(5888);
			gl.glLoadIdentity();
			ortho_2d_set = true;
		}
	}

	public static void loadFrustumMatrix(float left, float right, float bottom, float top, float nearMod, float far) {
		float near = nearMod * 2.0F;
		matrices[0] = near / (right - left);
		matrices[1] = 0.0F;
		matrices[2] = 0.0F;
		matrices[3] = 0.0F;
		matrices[4] = 0.0F;
		matrices[5] = near / (top - bottom);
		matrices[6] = 0.0F;
		matrices[7] = 0.0F;
		matrices[8] = (right + left) / (right - left);
		matrices[9] = (top + bottom) / (top - bottom);
		matrices[10] = aFloat2028 = -(far + nearMod) / (far - nearMod);
		matrices[11] = -1.0F;
		matrices[12] = 0.0F;
		matrices[13] = 0.0F;
		matrices[14] = aFloat2035 = -(near * far) / (far - nearMod);
		matrices[15] = 0.0F;
		gl.glLoadMatrixf(matrices, 0);
		aFloat2052 = 0.0F;
		aFloat2044 = 0.0F;
	}

	public static void generateTexture2D() {
		int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		generated_texture_id = is[0];
		gl.glBindTexture(3553, generated_texture_id);
		gl.glTexImage2D(3553, 0, 4, 1, 1, 0, 6408, 5121, IntBuffer.wrap(new int[] { -1 }));
		RT4.method1022(-124);
	}

	public static void resetTextureMatrix() {
		if (texture_matrix_dirty) {
			gl.glMatrixMode(5890);
			gl.glLoadIdentity();
			gl.glMatrixMode(5888);
			texture_matrix_dirty = false;
		}
	}

	public static void setDepthTestEnabled(boolean bool) {
		if (bool != aBoolean2032) {
			if (bool)
				gl.glEnable(2929);
			else
				gl.glDisable(2929);
			aBoolean2032 = bool;
		}
	}

	public static float method1653() {
		return aFloat2052;
	}

	public static void method1654() {
		renderer = null;
		vendor = null;
		gl = null;
		gldrawable = null;
		glcontext = null;
		matrices = null;
	}

	public static void method1655() {
		RT4.method1778(0, 0);
		setupBasic2DOrthoProjection();
		setRgbCombineMode(0);
		setAlphaCombineMode(0);
		setLightingEnabled(false);
		setDepthTestEnabled(false);
		setFogEnabled(false);
		resetTextureMatrix();
	}

	public static void setAlphaCombineMode(int i) {
		if (i != anInt2022) {
			if (i == 0)
				gl.glTexEnvi(8960, 34162, 8448);
			if (i == 1)
				gl.glTexEnvi(8960, 34162, 7681);
			if (i == 2)
				gl.glTexEnvi(8960, 34162, 260);
			anInt2022 = i;
		}
	}

	public static void method1657() {
		try {
			gldrawable.swapBuffers();
		} catch (Exception exception) {
			/* empty */
		}
	}
}
