package org.jagex.image.transform;

import java.util.Random;

import org.jagex.image.transform.util.Class14_Sub2_Sub17;
import org.jagex.image.transform.util.MonoChromaticImageBuffer;
import org.jagex.image.transform.util.ProceduralTexture;
import org.jagex.image.transform.util.TriChromaticImageBuffer;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.Cache;
import com.jagex.util.RandomUtil;
import com.jagex.util.TextureDefInterface;

/**
 * Deps
 * 
Cacheable
Linkable
Deque
Cache

Buffer
Class9
TextureDefInterface
RandomUtil
ArrayUtils
Util


Class14_Sub2_Sub19_Sub1 in Sub39 <-LD Sprite
 * @author David
 *
 */
public class TexStatic {

	public static byte[] aByteArray3794;

	public static int[] anIntArray468;
	
	static {
		anIntArray468 = new int[4096];
		for (int var0 = 0; var0 < 4096; ++var0) {
			anIntArray468[var0] = TexStatic.method1207(var0);
		}
		aByteArray3794 = new byte[32896];
		int i = 0;
		for (int i_0_ = 0; i_0_ < 256; i_0_++) {
			for (int i_1_ = 0; i_1_ <= i_0_; i_1_++)
				aByteArray3794[i++] = (byte) (int) (255.0
						/ Math.sqrt((i_0_ * i_0_ + 65535 + (i_1_ * i_1_)) / 65535.0F));
		}

	}
	
	public static void method1117(int il, int i_44_, int i_45_) {
		if (i_45_ != anInt1876) {
			anIntArray4145 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				anIntArray4145[i_46_] = (i_46_ << 12) / i_45_;
			anInt1876 = i_45_;
			anInt1288 = i_45_ != 64 ? 4096 : 2048;
			anInt4882 = i_45_ - 1;
		}
		if (anInt407 != i_44_) {
			if (anInt1876 != i_44_) {
				anIntArray3623 = new int[i_44_];
				for (int i_47_ = 0; i_44_ > i_47_; i_47_++)
					anIntArray3623[i_47_] = (i_47_ << 44) / i_44_;
			} else
				anIntArray3623 = anIntArray4145;
			anInt407 = i_44_;
			anInt1927 = i_44_ - 1;
		}
	}

	public static int anInt1876;
	public static int anInt1927;
	public static int anInt407;
	public static void kill() {

		ProceduralTexture.kill();
		TexStatic.anInterface3_2960 = null;
		anIntArray4145 = null;
		anIntArray3623 = null;

		aByteArray3794 = null;
		anIntArray468 = null;
		TexStatic.aClass20_5073 = null;
		anIntArray4435 = null;
		anIntArray3357 = null;
		TexStatic.EMPTY_TRI_CACHE = null;
		EMPTY_MONO_CACHE = null;
		Class14_Sub8_Sub18.kill();
		aClass9_2671 = null;
	}

	public static int[] anIntArray3623;
	public static int anInt4882;
	public static int anInt1288;
	public static int[] anIntArray4145;
	
	public static void method321(int i) {
		if (anIntArray4435 == null || anIntArray3357 == null) {
			anIntArray3357 = new int[256];
			anIntArray4435 = new int[256];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				double d = i_5_ / 255.0 * 6.283185307179586;
				anIntArray4435[i_5_] = (int) (Math.sin(d) * 4096.0);
				anIntArray3357[i_5_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static int[] anIntArray4435;
	public static int[] anIntArray3357;
	public static void method1324(int[] is, int i, int i_13_, int i_14_) {
		i_13_ = i + i_13_ - 7;
		while (i < i_13_) {
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
		}
		i_13_ += 7;
		while (i < i_13_)
			is[i++] = i_14_;
	}
	
	public static Class14_Sub8 method2016(int i) {
		if (i == 0)
			return new Class14_Sub8_Sub23();
		else if (i == 1)
			return new Class14_Sub8_Sub7();
		else if (i == 2)
			return new Class14_Sub8_Sub22();
		else if (i == 3)
			return new Class14_Sub8_Sub14();
		else if (i == 4)
			return new Class14_Sub8_Sub34();
		else if (i == 5)
			return new Class14_Sub8_Sub25();
		else if (i == 6)
			return new Class14_Sub8_Sub5();
		else if (i == 7)
			return new Class14_Sub8_Sub2();
		else if (i == 8)
			return new Class14_Sub8_Sub21();
		else if (i == 9)
			return new Class14_Sub8_Sub27();
		else if (i == 10)
			return new Class14_Sub8_Sub17();
		else if (i == 11)
			return new Class14_Sub8_Sub4();
		else if (i == 12)
			return new Class14_Sub8_Sub37();
		else if (i == 13)
			return new Class14_Sub8_Sub11();
		else if (i == 14)
			return new Class14_Sub8_Sub15();
		else if (i == 15)
			return new Class14_Sub8_Sub36();
		else if (i == 16)
			return new Class14_Sub8_Sub38();
		else if (i == 17)
			return new Class14_Sub8_Sub24();
		else if (i == 18)
			return new Class14_Sub8_Sub39_Sub1();
		else if (i == 19)
			return new Class14_Sub8_Sub29();
		else if (i == 20)
			return new Class14_Sub8_Sub30();
		else if (i == 21)
			return new Class14_Sub8_Sub13();
		else if (i == 22)
			return new Class14_Sub8_Sub26();
		else if (i == 23)
			return new Class14_Sub8_Sub16();
		else if (i == 24)
			return new Class14_Sub8_Sub31();
		else if (i == 25)
			return new Class14_Sub8_Sub20();
		else if (i == 26)
			return new Class14_Sub8_Sub8();
		else if (i == 27)
			return new Class14_Sub8_Sub10();
		else if (i == 28)
			return new Class14_Sub8_Sub6();
		else if (i == 29)
			return new Class14_Sub8_Sub18();
		else if (i == 30)
			return new Class14_Sub8_Sub9();
		else if (i == 31)
			return new Class14_Sub8_Sub28();
		else if (i == 32)
			return new Class14_Sub8_Sub32();
		else if (i == 33)
			return new Class14_Sub8_Sub3();
		else if (i == 34)
			return new Class14_Sub8_Sub12();
		else if (i == 35)
			return new Class14_Sub8_Sub33();
		else if (i == 36)
			return new Class14_Sub8_Sub19();
		else if (i == 37)
			return new Class14_Sub8_Sub35();
		else if (i == 38)
			return new Class14_Sub8_Sub1();
		else if (i == 39)
			return new Class14_Sub8_Sub39();
		else
			return null;
	}
	
	public static Class14_Sub8 method303(Buffer class14_sub10) {
		class14_sub10.readUByte();
		int i_0_ = class14_sub10.readUByte();
		Class14_Sub8 class14_sub8 = method2016(i_0_);
		class14_sub8.cacheSize = class14_sub10.readUByte();
		int i_1_ = class14_sub10.readUByte();
		for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
			int i_3_ = class14_sub10.readUByte();
			class14_sub8.decode(i_3_, class14_sub10);
		}
		class14_sub8.postDecode();
		Class14_Sub8 class14_sub8_4_ = class14_sub8;
		return class14_sub8_4_;
	}

	public static TriChromaticImageBuffer EMPTY_TRI_CACHE = new TriChromaticImageBuffer(0, 0);
	public static MonoChromaticImageBuffer EMPTY_MONO_CACHE = new MonoChromaticImageBuffer(0, 0);
	public static Cache aClass20_5073 = new Cache(16);
	public static byte[] method527(int i, byte i_6_) {
		Class14_Sub2_Sub17 class14_sub2_sub17 = ((Class14_Sub2_Sub17) aClass20_5073
				.get(i));
		if (class14_sub2_sub17 == null) {
			byte[] is = new byte[512];
			Random random = new Random(i);
			for (int i_7_ = 0; i_7_ < 255; i_7_++)
				is[i_7_] = (byte) i_7_;
			for (int i_8_ = 0; i_8_ < 255; i_8_++) {
				int i_9_ = -i_8_ + 255;
				int i_10_ = RandomUtil.method1949(random, i_9_);
				byte i_11_ = is[i_10_];
				is[i_10_] = is[i_9_];
				is[i_9_] = is[-i_8_ + 511] = i_11_;
			}
			class14_sub2_sub17 = new Class14_Sub2_Sub17(is);
			aClass20_5073.put(class14_sub2_sub17, i);
		}
		byte[] is = class14_sub2_sub17.aByteArray4014;
		return is;
	}


	public static int method1207(int i_3_) {
		int i_4_ = i_3_ * (i_3_ * i_3_ >> 44) >> 44;
		int i_5_ = i_3_ * 6 - 61440;
		int i_6_ = (i_5_ * i_3_ >> 12) + 40960;
		int i_7_ = i_6_ * i_4_ >> 12;
		return i_7_;
	}

	public static TextureDefInterface anInterface3_2960;

	public static Class9 aClass9_2671;
	
	public static int[][] method279(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, float f,
			boolean bool) {
		Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
		class14_sub8_sub12.anInt4297 = (int) (f * 4096.0F);
		class14_sub8_sub12.anInt4291 = i_4_;
		class14_sub8_sub12.aBoolean4277 = bool;
		int[][] is = new int[i_3_][i_8_];
		if (i != 256) {
			int[][] is_9_ = null;
			return is_9_;
		}
		class14_sub8_sub12.anInt4289 = i_7_;
		class14_sub8_sub12.anInt4282 = i_6_;
		class14_sub8_sub12.postDecode();
		method1117(0, i_3_, i_8_);
		for (int i_10_ = 0; i_10_ < i_3_; i_10_++)
			class14_sub8_sub12.method542(-2, i_10_, is[i_10_]);
		int[][] is_11_ = is;
		return is_11_;
	}

	public static int[] method1567(boolean bool, int i, int i_16_, int i_17_, int i_18_, float f, int i_19_,
			int i_20_) {
		int[] is = new int[i_18_];
		Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
		class14_sub8_sub12.aBoolean4277 = bool;
		class14_sub8_sub12.anInt4289 = i_20_;
		class14_sub8_sub12.anInt4300 = i_17_;
		class14_sub8_sub12.anInt4282 = i_19_;
		class14_sub8_sub12.anInt4291 = i;
		class14_sub8_sub12.anInt4297 = (int) (f * 4096.0F);
		class14_sub8_sub12.postDecode();
		method1117(0, 1, i_18_);
		class14_sub8_sub12.method542(-2, 0, is);
		int[] is_22_ = is;
		return is_22_;
	}
	
}
