/* Class87 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.PixelGrabber;

import com.jagex.applet.ErrorReporting;

public class Class87 {
	public boolean aBoolean1390 = false;
	public int anInt1391 = 0;
	public static String aString1392 = new StringBuilder(
			"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\u00a3$%^&*()-_=+[{]};:'@#~,<.>/?\\| ")
					.append(String.valueOf('\u00c4')).append(String.valueOf('\u00cb')).append(String.valueOf('\u00cf'))
					.append(String.valueOf('\u00d6')).append(String.valueOf('\u00dc')).append(String.valueOf('\u00e4'))
					.append(String.valueOf('\u00eb')).append(String.valueOf('\u00ef')).append(String.valueOf('\u00f6'))
					.append(String.valueOf('\u00fc')).append(String.valueOf('\u00ff')).append(String.valueOf('\u00df'))
					.toString();
	public byte[] aByteArray1393 = new byte[100000];
	public static int anInt1394 = aString1392.length();
	public static int[] anIntArray1395 = new int[256];

	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = aString1392.indexOf(i);
			if (i_0_ == -1)
				i_0_ = 74;
			anIntArray1395[i] = i_0_ * 9;
		}
	}

	public int method1425() {
		return aByteArray1393[6];
	}

	public void method1426(int[] is, byte[] is_1_, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		for (int i_8_ = -i_5_; i_8_ < 0; i_8_++) {
			for (int i_9_ = -i_4_; i_9_ < 0; i_9_++) {
				int i_10_ = is_1_[i_2_++] & 0xff;
				if (i_10_ > 30) {
					if (i_10_ >= 230)
						is[i_3_++] = i;
					else {
						int i_11_ = is[i_3_];
						is[i_3_++] = ((((i & 0xff00ff) * i_10_ + (i_11_ & 0xff00ff) * (256 - i_10_)) & ~0xff00ff)
								+ (((i & 0xff00) * i_10_ + (i_11_ & 0xff00) * (256 - i_10_)) & 0xff0000)) >> 8;
					}
				} else
					i_3_++;
			}
			i_3_ += i_6_;
			i_2_ += i_7_;
		}
	}

	public void method1427(Class124 class124, int i, int i_12_, int i_13_, boolean bool) {
		if (aBoolean1390 || i_13_ == 0)
			bool = false;
		for (int i_14_ = 0; i_14_ < class124.length(0); i_14_++) {
			int i_15_ = anIntArray1395[class124.method1710(0, i_14_)];
			if (bool) {
				method1428(i_15_, i + 1, i_12_, 1, aByteArray1393);
				method1428(i_15_, i, i_12_ + 1, 1, aByteArray1393);
			}
			method1428(i_15_, i, i_12_, i_13_, aByteArray1393);
			i += aByteArray1393[i_15_ + 7];
		}
	}

	public void method1428(int i, int i_16_, int i_17_, int i_18_, byte[] is) {
		int i_19_ = i_16_ + is[i + 5];
		int i_20_ = i_17_ - is[i + 6];
		int i_21_ = is[i + 3];
		int i_22_ = is[i + 4];
		int i_23_ = is[i] * 16384 + is[i + 1] * 128 + is[i + 2];
		int i_24_ = i_19_ + i_20_ * SD2DRaster.anInt1432;
		int i_25_ = SD2DRaster.anInt1432 - i_21_;
		int i_26_ = 0;
		if (i_20_ < SD2DRaster.anInt1438) {
			int i_27_ = SD2DRaster.anInt1438 - i_20_;
			i_22_ -= i_27_;
			i_20_ = SD2DRaster.anInt1438;
			i_23_ += i_27_ * i_21_;
			i_24_ += i_27_ * SD2DRaster.anInt1432;
		}
		if (i_20_ + i_22_ >= SD2DRaster.anInt1436)
			i_22_ -= i_20_ + i_22_ - SD2DRaster.anInt1436 + 1;
		if (i_19_ < SD2DRaster.anInt1433) {
			int i_28_ = SD2DRaster.anInt1433 - i_19_;
			i_21_ -= i_28_;
			i_19_ = SD2DRaster.anInt1433;
			i_23_ += i_28_;
			i_24_ += i_28_;
			i_26_ += i_28_;
			i_25_ += i_28_;
		}
		if (i_19_ + i_21_ >= SD2DRaster.anInt1434) {
			int i_29_ = i_19_ + i_21_ - SD2DRaster.anInt1434 + 1;
			i_21_ -= i_29_;
			i_26_ += i_29_;
			i_25_ += i_29_;
		}
		if (i_21_ > 0 && i_22_ > 0) {
			if (aBoolean1390)
				method1426(SD2DRaster.anIntArray1437, is, i_18_, i_23_, i_24_, i_21_, i_22_, i_25_, i_26_);
			else
				method1430(SD2DRaster.anIntArray1437, is, i_18_, i_23_, i_24_, i_21_, i_22_, i_25_, i_26_);
		}
	}

	public void method1429(Class124 class124, int i, int i_30_, int i_31_, boolean bool) {
		int i_32_ = method1431(class124) / 2;
		int i_33_ = method1425();
		if (i - i_32_ <= SD2DRaster.anInt1434 && i + i_32_ >= SD2DRaster.anInt1433 && i_30_ - i_33_ <= SD2DRaster.anInt1436
				&& i_30_ >= 0)
			method1427(class124, i - i_32_, i_30_, i_31_, bool);
	}

	public void method1430(int[] is, byte[] is_34_, int i, int i_35_, int i_36_, int i_37_, int i_38_, int i_39_,
			int i_40_) {
		int i_41_ = -(i_37_ >> 2);
		i_37_ = -(i_37_ & 0x3);
		for (int i_42_ = -i_38_; i_42_ < 0; i_42_++) {
			for (int i_43_ = i_41_; i_43_ < 0; i_43_++) {
				if (is_34_[i_35_++] != 0)
					is[i_36_++] = i;
				else
					i_36_++;
				if (is_34_[i_35_++] != 0)
					is[i_36_++] = i;
				else
					i_36_++;
				if (is_34_[i_35_++] != 0)
					is[i_36_++] = i;
				else
					i_36_++;
				if (is_34_[i_35_++] != 0)
					is[i_36_++] = i;
				else
					i_36_++;
			}
			for (int i_44_ = i_37_; i_44_ < 0; i_44_++) {
				if (is_34_[i_35_++] != 0)
					is[i_36_++] = i;
				else
					i_36_++;
			}
			i_36_ += i_39_;
			i_35_ += i_40_;
		}
	}

	public int method1431(Class124 class124) {
		int i = 0;
		for (int i_45_ = 0; i_45_ < class124.length(0); i_45_++) {
			if (class124.method1710(0, i_45_) == 64 && i_45_ + 4 < class124.length(0)
					&& class124.method1710(0, i_45_ + 4) == 64)
				i_45_ += 4;
			else if (class124.method1710(0, i_45_) == 126 && i_45_ + 4 < class124.length(0)
					&& class124.method1710(0, i_45_ + 4) == 126)
				i_45_ += 4;
			else
				i += (aByteArray1393[anIntArray1395[class124.method1710(0, i_45_)] + 7]);
		}
		return i;
	}

	public int method1432() {
		return aByteArray1393[8] - 1;
	}

	public void method1433(Font font, FontMetrics fontmetrics, char c, int i, boolean bool) {
		int i_46_ = fontmetrics.charWidth(c);
		int i_47_ = i_46_;
		if (bool) {
			try {
				if (c == '/')
					bool = false;
				if (c == 'f' || c == 't' || c == 'w' || c == 'v' || c == 'k' || c == 'x' || c == 'y' || c == 'A'
						|| c == 'V' || c == 'W')
					i_46_++;
			} catch (Exception exception) {
				/* empty */
			}
		}
		int i_48_ = fontmetrics.getMaxAscent();
		int i_49_ = fontmetrics.getMaxAscent() + fontmetrics.getMaxDescent();
		int i_50_ = fontmetrics.getHeight();
		Image image = ErrorReporting.aCanvas819.createImage(i_46_, i_49_);
		Graphics graphics = image.getGraphics();
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, i_46_, i_49_);
		graphics.setColor(Color.white);
		graphics.setFont(font);
		graphics.drawString(new StringBuilder(String.valueOf(c)).toString(), 0, i_48_);
		if (bool)
			graphics.drawString(new StringBuilder(String.valueOf(c)).toString(), 1, i_48_);
		int[] is = new int[i_46_ * i_49_];
		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, i_46_, i_49_, is, 0, i_46_);
		try {
			pixelgrabber.grabPixels();
		} catch (Exception exception) {
			/* empty */
		}
		image.flush();
		Object object = null;
		int i_51_ = 0;
		int i_52_ = 0;
		int i_53_ = i_46_;
		int i_54_ = i_49_;
		while_262_: for (int i_55_ = 0; i_55_ < i_49_; i_55_++) {
			for (int i_56_ = 0; i_56_ < i_46_; i_56_++) {
				int i_57_ = is[i_56_ + i_55_ * i_46_];
				if ((i_57_ & 0xffffff) != 0) {
					i_52_ = i_55_;
					break while_262_;
				}
			}
		}
		while_263_: for (int i_58_ = 0; i_58_ < i_46_; i_58_++) {
			for (int i_59_ = 0; i_59_ < i_49_; i_59_++) {
				int i_60_ = is[i_58_ + i_59_ * i_46_];
				if ((i_60_ & 0xffffff) != 0) {
					i_51_ = i_58_;
					break while_263_;
				}
			}
		}
		while_264_: for (int i_61_ = i_49_ - 1; i_61_ >= 0; i_61_--) {
			for (int i_62_ = 0; i_62_ < i_46_; i_62_++) {
				int i_63_ = is[i_62_ + i_61_ * i_46_];
				if ((i_63_ & 0xffffff) != 0) {
					i_54_ = i_61_ + 1;
					break while_264_;
				}
			}
		}
		while_265_: for (int i_64_ = i_46_ - 1; i_64_ >= 0; i_64_--) {
			for (int i_65_ = 0; i_65_ < i_49_; i_65_++) {
				int i_66_ = is[i_64_ + i_65_ * i_46_];
				if ((i_66_ & 0xffffff) != 0) {
					i_53_ = i_64_ + 1;
					break while_265_;
				}
			}
		}
		aByteArray1393[i * 9 + 0] = (byte) (anInt1391 / 16384);
		aByteArray1393[i * 9 + 1] = (byte) (anInt1391 / 128 & 0x7f);
		aByteArray1393[i * 9 + 2] = (byte) (anInt1391 & 0x7f);
		aByteArray1393[i * 9 + 3] = (byte) (i_53_ - i_51_);
		aByteArray1393[i * 9 + 4] = (byte) (i_54_ - i_52_);
		aByteArray1393[i * 9 + 5] = (byte) i_51_;
		aByteArray1393[i * 9 + 6] = (byte) (i_48_ - i_52_);
		aByteArray1393[i * 9 + 7] = (byte) i_47_;
		aByteArray1393[i * 9 + 8] = (byte) i_50_;
		for (int i_67_ = i_52_; i_67_ < i_54_; i_67_++) {
			for (int i_68_ = i_51_; i_68_ < i_53_; i_68_++) {
				int i_69_ = is[i_68_ + i_67_ * i_46_] & 0xff;
				if (i_69_ > 30 && i_69_ < 230)
					aBoolean1390 = true;
				aByteArray1393[anInt1391++] = (byte) i_69_;
			}
		}
	}

	public Class87(int i, boolean bool, Component component) {
		anInt1391 = anInt1394 * 9;
		aBoolean1390 = false;
		Font font = new Font("Helvetica", bool ? 1 : 0, i);
		FontMetrics fontmetrics = component.getFontMetrics(font);
		for (int i_70_ = 0; i_70_ < anInt1394; i_70_++)
			method1433(font, fontmetrics, aString1392.charAt(i_70_), i_70_, false);
		if (bool && aBoolean1390) {
			anInt1391 = anInt1394 * 9;
			aBoolean1390 = false;
			font = new Font("Helvetica", 0, i);
			fontmetrics = component.getFontMetrics(font);
			for (int i_71_ = 0; i_71_ < anInt1394; i_71_++)
				method1433(font, fontmetrics, aString1392.charAt(i_71_), i_71_, false);
			if (!aBoolean1390) {
				anInt1391 = anInt1394 * 9;
				aBoolean1390 = false;
				for (int i_72_ = 0; i_72_ < anInt1394; i_72_++)
					method1433(font, fontmetrics, aString1392.charAt(i_72_), i_72_, true);
			}
		}
		byte[] is = new byte[anInt1391];
		for (int i_73_ = 0; i_73_ < anInt1391; i_73_++)
			is[i_73_] = aByteArray1393[i_73_];
		aByteArray1393 = is;
	}

	public static void method1434() {
		aString1392 = null;
		anIntArray1395 = null;
	}
}
