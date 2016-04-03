/* StaticGL - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import javax.media.opengl.GL;

import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.GLEffect3;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.Class10;

import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub37;
import rs.tex.Static;

public class StaticGL {
	public static void method1409() {
		GL gl = RT4GL.gl;
		gl.glDisableClientState(32886);
		RT4GL.method1639(false);
		gl.glDisable(2929);
		gl.glPushAttrib(128);
		gl.glFogf(2915, 3072.0F);
		RT4GL.method1646();
		for (int i = 0; i < Class14_Sub30.aClass14_Sub27ArrayArray3273[0].length; i++) {
			Class14_Sub27 class14_sub27 = Class14_Sub30.aClass14_Sub27ArrayArray3273[0][i];
			if (class14_sub27.anInt3204 >= 0
					&& (Class3.anInterface3_117.method12(true, class14_sub27.anInt3204) == 4)) {
				gl.glColor4fv(RT4.method657(81, class14_sub27.anInt3190), 0);
				float f = 201.5F - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F);
				class14_sub27.method922((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368), f, true);
			}
		}
		gl.glEnableClientState(32886);
		RT4GL.method1645();
		gl.glEnable(2929);
		gl.glPopAttrib();
		RT4GL.method1625();
	}

	public static void method67(int i, int i_19_, int i_20_, byte[][][] is, int i_21_, byte i_22_, int i_23_,
			int i_24_) {
		Class67.anInt1059++;
		Class107.anInt1806 = 0;
		int i_25_ = i_23_ - 16;
		int i_26_ = i_23_ + 16;
		int i_27_ = i_24_ - 16;
		int i_28_ = i_24_ + 16;
		for (int i_29_ = Class14_Sub23.anInt3134; i_29_ < Class83.anInt1338; i_29_++) {
			Class14_Sub29[][] class14_sub29s = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_29_];
			for (int i_30_ = Class7_Sub1.anInt2659; i_30_ < Class14_Sub8_Sub37.anInt4722; i_30_++) {
				for (int i_31_ = Class14_Sub9_Sub3.anInt4849; i_31_ < Class14_Sub8_Sub26.anInt4526; i_31_++) {
					Class14_Sub29 class14_sub29 = class14_sub29s[i_30_][i_31_];
					if (class14_sub29 != null) {
						if (!(Class53.visibilityMap[i_30_ - Class71.cameraTileX + Static.anInt1108][(i_31_
								- Class102.cameraTileZ + Static.anInt1108)])
								|| (is != null && i_29_ >= i_21_ && is[i_29_][i_30_][i_31_] == i_22_)) {
							class14_sub29.aBoolean3235 = false;
							class14_sub29.aBoolean3240 = false;
							class14_sub29.anInt3231 = 0;
							if (i_30_ >= i_25_ && i_30_ <= i_26_ && i_31_ >= i_27_ && i_31_ <= i_28_) {
								if (class14_sub29.aClass113_3250 != null) {
									Class113 class113 = class14_sub29.aClass113_3250;
									class113.aClass133_1877.method1790(class113.anInt1886, class113.anInt1886,
											class113.anInt1878, class113.anInt1878, 124);
									if (class113.aClass133_1884 != null)
										class113.aClass133_1884.method1790(class113.anInt1886, class113.anInt1886,
												class113.anInt1878, class113.anInt1878, -123);
								}
								if (class14_sub29.aClass37_3255 != null) {
									Class37 class37 = class14_sub29.aClass37_3255;
									class37.aClass133_642.method1790(class37.anInt633, class37.anInt633,
											class37.anInt653, class37.anInt653, -1);
									if (class37.aClass133_638 != null)
										class37.aClass133_638.method1790(class37.anInt633, class37.anInt633,
												class37.anInt653, class37.anInt653, -119);
								}
								if (class14_sub29.aClass4_3237 != null) {
									Class4 class4 = class14_sub29.aClass4_3237;
									class4.aClass133_124.method1790(class4.anInt122, class4.anInt122, class4.anInt136,
											class4.anInt136, -123);
								}
								if (class14_sub29.aClass40Array3257 != null) {
									for (int i_32_ = 0; i_32_ < class14_sub29.anInt3242; i_32_++) {
										Class40 class40 = (class14_sub29.aClass40Array3257[i_32_]);
										class40.aClass133_679.method1790(class40.anInt678, class40.anInt669,
												class40.anInt670, class40.anInt668, 69);
									}
								}
							}
						} else {
							class14_sub29.aBoolean3235 = true;
							class14_sub29.aBoolean3240 = true;
							if (class14_sub29.anInt3242 > 0)
								class14_sub29.aBoolean3251 = true;
							else
								class14_sub29.aBoolean3251 = false;
							Class107.anInt1806++;
						}
					}
				}
			}
		}
		boolean bool = Class114.tileHeights == Class150.anIntArrayArrayArray2419;
		GL gl = RT4GL.gl;
		gl.glPushMatrix();
		gl.glTranslatef((float) -i, (float) -i_19_, (float) -i_20_);
		if (bool) {
			method1409();
			RT4.method1778(3, -1);
			Class14_Sub30.aBoolean3269 = true;
			GLEffect3.enableTexCoordArray();
			Class7_Sub1.anInt2653 = -1;
			Class14_Sub8_Sub35.anInt4675 = -1;
			for (int i_33_ = 0; i_33_ < (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[0]).length; i_33_++) {
				Class14_Sub27 class14_sub27 = (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[0][i_33_]);
				float f = 251.5F - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F);
				if (class14_sub27.anInt3190 != Class7_Sub1.anInt2653) {
					Class7_Sub1.anInt2653 = class14_sub27.anInt3190;
					RT4.method1304(class14_sub27.anInt3190);
					AthmosphericEffects.setFogColour(RT4.method1590(false));
				}
				class14_sub27.method922((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368), f, false);
			}
			GLEffect3.disableTexCoordArray();
		} else {
			for (int i_34_ = Class14_Sub23.anInt3134; i_34_ < Class83.anInt1338; i_34_++) {
				for (int i_35_ = 0; i_35_ < (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[i_34_]).length; i_35_++) {
					Class14_Sub27 class14_sub27 = (RuntimeException_Sub1.aClass14_Sub27ArrayArray2464[i_34_][i_35_]);
					float f = (201.5F - (float) i_34_ * 50.0F - (class14_sub27.aBoolean3201 ? 1.0F : 0.5F));
					if (class14_sub27.anInt3204 != -1
							&& Class3.anInterface3_117.method12(true, class14_sub27.anInt3204) == 4
							&& Class15.aBoolean374)
						RT4.method1304(class14_sub27.anInt3190);
					class14_sub27.method922(Class125_Sub1.aClass14_Sub29ArrayArrayArray3368, f, false);
				}
				if (i_34_ == 0 && Class89.anInt1413 > 0) {
					RT4GL.method1640(101.5F);
					Class151.method2038(Class71.cameraTileX, Class102.cameraTileZ, Static.anInt1108, i_19_,
							Class53.visibilityMap, Class114.tileHeights[0]);
				}
			}
			Class10.method195(Class71.cameraTileX, Class102.cameraTileZ,
					Class125_Sub1.aClass14_Sub29ArrayArrayArray3368);
		}
		gl.glPopMatrix();
		for (int i_36_ = Class14_Sub23.anInt3134; i_36_ < Class83.anInt1338; i_36_++) {
			Class14_Sub29[][] class14_sub29s = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_36_];
			for (int i_37_ = -Static.anInt1108; i_37_ <= 0; i_37_++) {
				int i_38_ = Class71.cameraTileX + i_37_;
				int i_39_ = Class71.cameraTileX - i_37_;
				if (i_38_ >= Class7_Sub1.anInt2659 || i_39_ < Class14_Sub8_Sub37.anInt4722) {
					for (int i_40_ = -Static.anInt1108; i_40_ <= 0; i_40_++) {
						int i_41_ = Class102.cameraTileZ + i_40_;
						int i_42_ = Class102.cameraTileZ - i_40_;
						if (i_38_ >= Class7_Sub1.anInt2659) {
							if (i_41_ >= Class14_Sub9_Sub3.anInt4849) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_38_][i_41_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, true);
							}
							if (i_42_ < Class14_Sub8_Sub26.anInt4526) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_38_][i_42_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, true);
							}
						}
						if (i_39_ < Class14_Sub8_Sub37.anInt4722) {
							if (i_41_ >= Class14_Sub9_Sub3.anInt4849) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_39_][i_41_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, true);
							}
							if (i_42_ < Class14_Sub8_Sub26.anInt4526) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_39_][i_42_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, true);
							}
						}
						if (Class107.anInt1806 == 0) {
							if (!bool)
								Class142.aBoolean2299 = false;
							return;
						}
					}
				}
			}
		}
		for (int i_43_ = Class14_Sub23.anInt3134; i_43_ < Class83.anInt1338; i_43_++) {
			Class14_Sub29[][] class14_sub29s = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_43_];
			for (int i_44_ = -Static.anInt1108; i_44_ <= 0; i_44_++) {
				int i_45_ = Class71.cameraTileX + i_44_;
				int i_46_ = Class71.cameraTileX - i_44_;
				if (i_45_ >= Class7_Sub1.anInt2659 || i_46_ < Class14_Sub8_Sub37.anInt4722) {
					for (int i_47_ = -Static.anInt1108; i_47_ <= 0; i_47_++) {
						int i_48_ = Class102.cameraTileZ + i_47_;
						int i_49_ = Class102.cameraTileZ - i_47_;
						if (i_45_ >= Class7_Sub1.anInt2659) {
							if (i_48_ >= Class14_Sub9_Sub3.anInt4849) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_45_][i_48_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, false);
							}
							if (i_49_ < Class14_Sub8_Sub26.anInt4526) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_45_][i_49_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, false);
							}
						}
						if (i_46_ < Class14_Sub8_Sub37.anInt4722) {
							if (i_48_ >= Class14_Sub9_Sub3.anInt4849) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_46_][i_48_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, false);
							}
							if (i_49_ < Class14_Sub8_Sub26.anInt4526) {
								Class14_Sub29 class14_sub29 = class14_sub29s[i_46_][i_49_];
								if (class14_sub29 != null && class14_sub29.aBoolean3235)
									Class14_Sub4.method454(class14_sub29, false);
							}
						}
						if (Class107.anInt1806 == 0) {
							if (!bool)
								Class142.aBoolean2299 = false;
							return;
						}
					}
				}
			}
		}
		Class142.aBoolean2299 = false;
	}
}
