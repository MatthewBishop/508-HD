/* Class22 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import com.jagex.io.js5.Class9_Sub1;
import com.jagex.rt4.Class148_Sub1;

public class Class22 {
	public static Class9_Sub1 aClass9_Sub1_459;
	public static int anInt460;
	public static int anInt461 = 0;
	public static Class98 aClass98_464;

	public static void method984(int i, int i_0_, boolean bool, Color color, Class124 class124) {
		try {
			Graphics graphics = Static2.aCanvas819.getGraphics();
			if (Class123.aFont2063 == null) {
				Class123.aFont2063 = new Font("Helvetica", 1, 13);
				Static2.aFontMetrics3081 = Static2.aCanvas819.getFontMetrics(Class123.aFont2063);
			}
			if (bool) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Class83.anInt1340, Class14_Sub20.anInt3094);
			}
			if (color == null)
				color = new Color(140, 17, 17);
			try {
				if (Class14_Sub2_Sub8.anImage3830 == null)
					Class14_Sub2_Sub8.anImage3830 = Static2.aCanvas819.createImage(304, 34);
				Graphics graphics_1_ = Class14_Sub2_Sub8.anImage3830.getGraphics();
				graphics_1_.setColor(color);
				graphics_1_.drawRect(0, 0, 303, 33);
				graphics_1_.fillRect(2, 2, i * 3, 30);
				graphics_1_.setColor(Color.black);
				graphics_1_.drawRect(1, 1, 301, 31);
				graphics_1_.fillRect(2 + i * 3, 2, 300 - i * 3, 30);
				graphics_1_.setFont(Class123.aFont2063);
				graphics_1_.setColor(Color.white);
				if (i_0_ != -1644)
					method987(109, 6, -69, -24, 29, -66, 34, 77, 72, 117, 5, -23, -52, -27, 53, -13, -88, 5, 64, 110);
				class124.method1713(false,
						(-class124.method1695((Static2.aFontMetrics3081), (byte) -94) + 304) / 2, 22,
						graphics_1_);
				graphics.drawImage(Class14_Sub2_Sub8.anImage3830, Class83.anInt1340 / 2 - 152,
						Class14_Sub20.anInt3094 / 2 - 18, null);
			} catch (Exception exception) {
				int i_2_ = Class83.anInt1340 / 2 - 152;
				int i_3_ = Class14_Sub20.anInt3094 / 2 - 18;
				graphics.setColor(color);
				graphics.drawRect(i_2_, i_3_, 303, 33);
				graphics.fillRect(i_2_ + 2, i_3_ + 2, i * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_2_ + 1, i_3_ + 1, 301, 31);
				graphics.fillRect(i * 3 + i_2_ + 2, i_3_ + 2, 300 - i * 3, 30);
				graphics.setFont(Class123.aFont2063);
				graphics.setColor(Color.white);
				class124.method1713(false,
						i_2_ + (304 - class124.method1695((Static2.aFontMetrics3081), (byte) -91)) / 2, i_3_ + 22,
						graphics);
			}
			if (JunkTex.aClass124_5099 != null) {
				graphics.setFont(Class123.aFont2063);
				graphics.setColor(Color.white);
				JunkTex.aClass124_5099.method1713(false,
						(Class83.anInt1340 / 2 - (JunkTex.aClass124_5099
								.method1695(Static2.aFontMetrics3081, (byte) -106)) / 2),
						Class14_Sub20.anInt3094 / 2 - 26, graphics);
			}
		} catch (Exception exception) {
			Static2.aCanvas819.repaint();
		}
	}

	public static Class148_Sub1 method985(int i) {
		if (i > -51) {
			Class148_Sub1 class148_sub1 = null;
			return class148_sub1;
		}
		Class148_Sub1 class148_sub1 = new Class148_Sub1(Class14_Sub11.spriteTrimWidth, Class14_Sub30.spriteTrimHeight,
				Class40.spriteXOffsets[0], Class14_Sub2_Sub12.spriteYOffsets[0], Class17.spriteWidths[0],
				Static2.spriteHeights[0], Class12.spritePaletteIndicators[0], JunkTex.spritePalette);
		Class129.method1761((byte) 123);
		Class148_Sub1 class148_sub1_4_ = class148_sub1;
		return class148_sub1_4_;
	}

	public static void method986(Class124 class124, int i) {
		Class69.method1311((byte) -128);
		int i_5_ = 94 / ((i + 27) / 33);
		Class14_Sub2_Sub3.method274(class124, 100);
	}

	public static void method987(int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_,
			int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_,
			int i_22_, int i_23_, int i_24_) {
		if (i_8_ == 0) {
			Class153 class153 = new Class153(i_15_, i_16_, i_17_, i_18_, -1, i_23_, false);
			for (int i_25_ = i; i_25_ >= 0; i_25_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_25_][i_6_][i_7_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_25_][i_6_][i_7_] = new Class14_Sub29(i_25_, i_6_,
							i_7_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_].aClass153_3248 = class153;
		} else if (i_8_ == 1) {
			Class153 class153 = new Class153(i_19_, i_20_, i_21_, i_22_, i_10_, i_24_,
					(i_11_ == i_12_ && i_11_ == i_13_ && i_11_ == i_14_));
			for (int i_26_ = i; i_26_ >= 0; i_26_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_26_][i_6_][i_7_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_26_][i_6_][i_7_] = new Class14_Sub29(i_26_, i_6_,
							i_7_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_].aClass153_3248 = class153;
		} else {
			Class6 class6 = new Class6(i_8_, i_9_, i_10_, i_6_, i_7_, i_11_, i_12_, i_13_, i_14_, i_15_, i_16_, i_17_,
					i_18_, i_19_, i_20_, i_21_, i_22_, i_23_, i_24_);
			for (int i_27_ = i; i_27_ >= 0; i_27_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_27_][i_6_][i_7_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_27_][i_6_][i_7_] = new Class14_Sub29(i_27_, i_6_,
							i_7_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_6_][i_7_].aClass6_3233 = class6;
		}
	}

	public static void method988(byte i) {
		aClass9_Sub1_459 = null;
		aClass98_464 = null;
		int i_28_ = -50 % ((-31 - i) / 33);
	}
}
