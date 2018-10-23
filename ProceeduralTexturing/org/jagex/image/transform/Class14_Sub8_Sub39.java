/* Class14_Sub8_Sub39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import org.jagex.image.transform.util.AccessoryMethods;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.rt4.AbstractSprite_Sub1;

import rs.JunkTex;
import rs.Static3;

public class Class14_Sub8_Sub39 extends Class14_Sub8 {
	public int height;

	public int anInt4752 = -1;

	public int width;

	public int[] pixels;

	public Class14_Sub8_Sub39() {
		super(0, false);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628 && method679(true)) {
			int[] is_4_ = is[0];
			int[] is_5_ = is[1];
			int[] is_6_ = is[2];
			int i_7_ = width * (height == TexStatic.anInt407 ? i : height * i / TexStatic.anInt407);
			if (TexStatic.anInt1876 != width) {
				for (int i_8_ = 0; TexStatic.anInt1876 > i_8_; i_8_++) {
					int i_9_ = i_8_ * width / TexStatic.anInt1876;
					int i_10_ = pixels[i_7_ + i_9_];
					is_6_[i_8_] = AccessoryMethods.method617(255, i_10_) << 36;
					is_5_[i_8_] = AccessoryMethods.method617(i_10_, 65280) >> 36;
					is_4_[i_8_] = AccessoryMethods.method617(16711680, i_10_) >> 44;
				}
			} else {
				for (int i_11_ = 0; TexStatic.anInt1876 > i_11_; i_11_++) {
					int i_12_ = pixels[i_7_++];
					is_6_[i_11_] = AccessoryMethods.method617(4080, i_12_ << 4);
					is_5_[i_11_] = AccessoryMethods.method617(i_12_, 65280) >> 4;
					is_4_[i_11_] = AccessoryMethods.method617(4080, i_12_ >> 44);
				}
			}
		}
		int[][] is_13_ = is;
		return is_13_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		if (i == 0)
			anInt4752 = class14_sub10.readUShort();
	}

	@Override
	public int method477() {
		int i_15_ = anInt4752;
		return i_15_;
	}

	@Override
	public void method478() {
		super.method478();
		pixels = null;
	}

	public boolean method679(boolean bool) {
		if (pixels != null) {
			return true;
		}
		if (anInt4752 >= 0) {
			AbstractSprite_Sub1 class14_sub2_sub19_sub1 = Class14_Sub8_Sub39.constructLDSprite(TexStatic.aClass9_2671, 0,
					anInt4752);
			class14_sub2_sub19_sub1.method404();
			this.width = class14_sub2_sub19_sub1.width;
			this.height = class14_sub2_sub19_sub1.height;
			this.pixels = class14_sub2_sub19_sub1.pixels;
			boolean bool_17_ = true;
			return bool_17_;
		}
		boolean bool_18_ = false;
		return bool_18_;
	}

	public static AbstractSprite_Sub1 constructLDSprite(Class9 class9, int i, int i_6_) {
		if (!Static3.decodedSprites(class9, i_6_, (byte) 67)) {
			return null;
		}
		return JunkTex.constructLDSprite((byte) -123);
	}
}
