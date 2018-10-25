/* Class14_Sub14 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Frame;
import java.io.IOException;
import java.util.zip.CRC32;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileOnDisk;
import com.jagex.link.Linkable;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.RT4;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

public class Class14_Sub14 extends Linkable {
	public int anInt2965;
	public int anInt2966;
	public int anInt2967;
	public int anInt2968;
	public int anInt2969;
	public int anInt2970;
	public int anInt2971;
	public int anInt2975;
	public int anInt2976;
	public int anInt2979;
	public int anInt2980 = 0;
	public int anInt2981;
	public static SoftCache aClass52_2982 = new SoftCache(64);
	public static CRC32 aCRC32_2983 = new CRC32();
	public static int anInt2984;
	public static int[] anIntArray2985 = { 0, 3, 0, 0, 0, 0, 6, 0, 2, 0, 5, 0, 6, 0, 0, 0, 0, 0, 0, 0, 0, 14, 0, 0, 0,
			5, 0, 0, 0, 15, 4, 0, 0, 0, 0, 10, 0, 2, 0, 0, 4, 6, 4, 0, 0, 0, 0, -1, 0, 10, 7, 0, 0, 0, 0, 24, 0, 3, 0,
			5, 0, 0, 0, 0, 6, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 7,
			0, 0, 0, 0, 0, 1, 3, 4, 0, 0, 0, 0, 0, 0, 0, 6, 4, 0, 15, 0, 0, 1, 0, -2, 8, 5, 8, -1, 0, 0, -2, 0, 0, 0, 0,
			0, 8, 0, -1, 0, 0, -2, 0, 20, 0, -2, 10, 0, -2, 0, -1, 0, 2, 0, 0, -1, 0, 0, -2, 4, -1, 0, 8, 0, 0, 1, 0, 6,
			0, 0, 0, 0, 0, 0, 0, 0, -2, 1, 4, -2, 8, 0, -1, 2, -1, -2, 0, 0, 0, 0, 6, 0, 3, 0, 0, 0, 2, -1, 0, 6, 0, 7,
			2, 0, 0, 0, 0, 3, 0, 0, 0, -1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, -2, 6, -1, 4, 0, 0, -2, 12, 0, 0, 1, 9, 0, -1,
			0, 0, 5, 0, -1, 0, 0, 0, 0, 3, -2, 0, 0, 0, 0, 6, 4, 5, 6, 2, 0, 5, -1, 0, 0, -2 };
	public static Frame aFrame2986;
	public static Class14_Sub29[][][] aClass14_Sub29ArrayArrayArray2987;

	public static void method865(Class43 class43, boolean safemode, int i) {
		if (safemode) {
			JunkTex.anInt4190 = 3;
			JunkTex.method495((byte) -47, false);
			RT4.aBoolean374 = false;
			Class14_Sub29.anInt3266 = 127;
			Static2.aBoolean2372 = false;
			Class33.aBoolean584 = false;
			RT4.useLighting = false;
			Class139.aBoolean2233 = false;
			Static2.anInt1691 = 127;
			JunkTex.aBoolean845 = false;
			JunkTex.aBoolean4420 = false;
			Static2.anInt2725 = 0;
			Class135.aBoolean2190 = false;
			Class54.anInt887 = 0;
			JunkTex.aBoolean4528 = false;
			JunkTex.aBoolean4518 = false;
			Class89.anInt1413 = 0;
			Class28.aBoolean516 = false;
			Class135.anInt2189 = 0;
			JunkTex.aBoolean3397 = false;
			Class14_Sub23.anInt3135 = 255;
			JunkTex.method595(class43);
		} else {
			JunkTex.anInt4190 = 3;
			FileOnDisk fileOnDisk = null;
			JunkTex.method495((byte) -47, true);
			RT4.aBoolean374 = true;
			Static2.anInt1691 = 127;
			JunkTex.aBoolean4528 = true;
			Class33.aBoolean584 = true;
			Class14_Sub29.anInt3266 = 127;
			Class14_Sub23.anInt3135 = 255;
			Class28.aBoolean516 = true;
			Class139.aBoolean2233 = true;
			JunkTex.aBoolean4420 = true;
			Class135.anInt2189 = 0;
			JunkTex.aBoolean845 = true;
			Class54.anInt887 = 0;
			Class135.aBoolean2190 = true;
			JunkTex.aBoolean3397 = true;
			RT4.useLighting = true;
			JunkTex.aBoolean4518 = true;
			Class89.anInt1413 = 2;
			Static2.anInt2725 = 0;
			Static2.aBoolean2372 = true;
			try {
				Class31 class31 = class43.method1152("runescape", 0);
				while (class31.anInt529 == 0)
					Util.accuratesleep(1L);
				if (class31.anInt529 == 1) {
					fileOnDisk = (FileOnDisk) class31.anObject530;
					int i_0_ = 0;
					int i_1_;
					byte[] is;
					for (is = new byte[(int) fileOnDisk.method1061((byte) -111)]; is.length > i_0_; i_0_ += i_1_) {
						i_1_ = fileOnDisk.method1060(is, 0, i_0_, is.length - i_0_);
						if (i_1_ == -1)
							throw new IOException("EOF");
					}
					JunkTex.method611(i ^ 0xffffffff, new Buffer(is));
				}
			} catch (Exception exception) {
				/* empty */
			}
			try {
				if (fileOnDisk != null)
					fileOnDisk.method1057(25861);
			} catch (Exception exception) {
				/* empty */
			}
		}
		if (i != -2)
			method869((byte) -91);
	}

	public static void method866(boolean bool) {
		if (bool && Class4.aClass36_134 != null)
			Class4.aClass36_134.method1101((byte) 110);
	}

	public static void method867(byte i, Class124 class124, int i_2_) {
		JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(111);
		JunkTex.aClass14_Sub10_Sub1_891.writeByte(i_2_);
		if (i >= 81)
			JunkTex.aClass14_Sub10_Sub1_891.method835(class124.method1692(0), true);
	}

	public static void method868(int i) {
		int i_3_ = (Class133_Sub6.anInt3676 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7));
		JunkTex.anInt4754 = 0;
		int i_4_ = -6 % ((-28 - i) / 50);
		int i_5_ = (Class58.anInt947 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 7));
		if (i_3_ >= 3053 && i_3_ <= 3156 && i_5_ >= 3056 && i_5_ <= 3136)
			JunkTex.anInt4754 = 1;
		if (i_3_ >= 3072 && i_3_ <= 3118 && i_5_ >= 9492 && i_5_ <= 9535)
			JunkTex.anInt4754 = 1;
		if (JunkTex.anInt4754 == 1 && i_3_ >= 3139 && i_3_ <= 3199 && i_5_ >= 3008 && i_5_ <= 3062)
			JunkTex.anInt4754 = 0;
	}

	public static void method869(byte i) {
		int i_6_ = 47 / ((-11 - i) / 46);
		anIntArray2985 = null;
		aCRC32_2983 = null;
		aClass52_2982 = null;
		aFrame2986 = null;
		aClass14_Sub29ArrayArrayArray2987 = null;
	}

	public static void method870(int i, Class124 class124) {
		Class14_Sub9_Sub1.aClass124_4829 = class124;
		if (JunkTex.signlink.applet != null) {
			try {
				Class124 class124_7_ = (Class14_Sub2_Sub11.aClass124_3892
						.method1703(JunkTex.signlink.applet, (byte) -106));
				Class124 class124_8_ = (Class14_Sub15.aClass124_2995
						.method1703(JunkTex.signlink.applet, (byte) -33));
				Class124 class124_9_ = (JunkTex.method515((new Class124[] { class124_7_,
						Class14_Sub9_Sub1.aClass124_4814, class124, Class133_Sub1.aClass124_3502, class124_8_ }),
						(byte) -120));
				if (class124.length(i - 6346) == 0)
					class124_9_ = JunkTex
							.method515((new Class124[] { class124_9_, (Class98.aClass124_1661) }), (byte) -122);
				else
					class124_9_ = (JunkTex
							.method515(
									(new Class124[] { class124_9_, JunkTex.aClass124_4272,
											(JunkTex.method517((byte) 124,
													(TimeUtil.getTime() + 94608000000L))),
									Class118.aClass124_1989, Static2.method387(94608000L, true) }),
							(byte) -109));
				JunkTex
						.method515(new Class124[] { JunkTex.aClass124_691, class124_9_, Static2.aClass124_2730 },
								(byte) -34)
						.method1669(27664, JunkTex.signlink.applet);
			} catch (Throwable throwable) {
				/* empty */
			}
			if (i != 6346)
				aFrame2986 = null;
		}
	}

	public Class14_Sub14() {
		anInt2975 = -1;
	}
}
