/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Canvas;
import java.util.zip.Inflater;

import com.jagex.io.Buffer;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;

public class Class49 {
	public static SoftCache aClass52_810 = new SoftCache(50);
	public Inflater anInflater812;
	public static boolean aBoolean814 = false;
	public static int anInt815;
	public static Class124 aClass124_816 = Class124.method263(1178, "(U1");
	public static int anInt817;
	public static int anInt818;
	public static Canvas aCanvas819;

	public Class49() {
		this(-1, 1000000, 1000000);
	}

	public static Class14_Sub2_Sub19 method1194(boolean bool, int i, int i_0_, boolean bool_1_, boolean bool_2_,
			int i_3_, boolean bool_4_, int i_5_) {
		if (!bool_4_)
			anInt815 = 114;
		Class142 class142 = JunkTex.method605(73, i_0_);
		if (i_3_ > 1 && class142.anIntArray2325 != null) {
			int i_6_ = -1;
			for (int i_7_ = 0; i_7_ < 10; i_7_++) {
				if (class142.anIntArray2320[i_7_] <= i_3_ && class142.anIntArray2320[i_7_] != 0)
					i_6_ = class142.anIntArray2325[i_7_];
			}
			if (i_6_ != -1)
				class142 = JunkTex.method605(63, i_6_);
		}
		ModelSD modelsd = class142.method1978(0);
		if (modelsd == null) {
			Class14_Sub2_Sub19 class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = null;
		if (class142.anInt2316 != -1) {
			class14_sub2_sub19_sub1 = ((Class14_Sub2_Sub19_Sub1) method1194(true, 1, class142.anInt2268, true, false,
					10, true, 0));
			if (class14_sub2_sub19_sub1 == null) {
				Class14_Sub2_Sub19 class14_sub2_sub19 = null;
				return class14_sub2_sub19;
			}
		} else if (class142.anInt2305 != -1) {
			class14_sub2_sub19_sub1 = ((Class14_Sub2_Sub19_Sub1) method1194(true, i, class142.anInt2257, false, false,
					i_3_, bool_4_, i_5_));
			if (class14_sub2_sub19_sub1 == null) {
				Class14_Sub2_Sub19 class14_sub2_sub19 = null;
				return class14_sub2_sub19;
			}
		}
		int i_8_ = Class92.anInt1432;
		int[] is = Class92.anIntArray1437;
		int[] is_9_ = new int[4];
		int i_10_ = Class92.anInt1435;
		Class92.method1452(is_9_);
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_11_ = new Class14_Sub2_Sub19_Sub1(36, 32);
		Class92.method1455(class14_sub2_sub19_sub1_11_.anIntArray5088, 36, 32);
		Class3.method97();
		Class3.method90(16, 16);
		Class3.aBoolean107 = false;
		int i_12_ = class142.anInt2273;
		if (!bool_1_) {
			if (i == 2)
				i_12_ *= 1.04;
		} else
			i_12_ *= 1.5;
		int i_13_ = i_12_ * Class3.cos[class142.anInt2317] >> 48;
		int i_14_ = Class3.sin[class142.anInt2317] * i_12_ >> 16;
		modelsd.draw(0, class142.anInt2286, class142.anInt2326, class142.anInt2317, class142.anInt2293,
				(-(modelsd.getMinY() / 2) + i_14_ + class142.anInt2285), i_13_ + class142.anInt2285);
		if (i >= 1) {
			class14_sub2_sub19_sub1_11_.method411(1);
			if (i >= 2)
				class14_sub2_sub19_sub1_11_.method411(16777215);
			Class92.method1455(class14_sub2_sub19_sub1_11_.anIntArray5088, 36, 32);
		}
		if (i_5_ != 0)
			class14_sub2_sub19_sub1_11_.method408(i_5_);
		if (class142.anInt2316 != -1)
			class14_sub2_sub19_sub1.drawReg(0, 0);
		else if (class142.anInt2305 != -1) {
			Class92.method1455(class14_sub2_sub19_sub1.anIntArray5088, 36, 32);
			class14_sub2_sub19_sub1_11_.drawReg(0, 0);
			class14_sub2_sub19_sub1_11_ = class14_sub2_sub19_sub1;
		}
		if (bool_2_ && (class142.anInt2309 == 1 || i_3_ != 1) && i_3_ != -1)
			Class4.aClass14_Sub2_Sub16_Sub1_137.method364(Static2.method249(67, i_3_), 0, 9, 16776960, 1);
		Class92.method1455(is, i_8_, i_10_);
		Class92.method1459(is_9_);
		Class3.method97();
		Class3.aBoolean107 = true;
		if (!bool) {
			Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2 = new Class14_Sub2_Sub19_Sub2(class14_sub2_sub19_sub1_11_);
			return class14_sub2_sub19_sub2;
		}
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1_15_ = class14_sub2_sub19_sub1_11_;
		return class14_sub2_sub19_sub1_15_;
	}

	public void method1195(byte[] is, boolean bool, Buffer class14_sub10) {
		if (class14_sub10.payload[class14_sub10.position] != 31
				|| (class14_sub10.payload[class14_sub10.position + 1] != -117))
			throw new RuntimeException("Invalid GZIP header!");
		if (anInflater812 == null)
			anInflater812 = new Inflater(true);
		try {
			anInflater812.setInput(class14_sub10.payload, class14_sub10.position + 10,
					(class14_sub10.payload.length - (class14_sub10.position + 10 + 8)));
			anInflater812.inflate(is);
		} catch (Exception exception) {
			anInflater812.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		if (bool)
			aBoolean814 = true;
		anInflater812.reset();
	}

	public static void method1196(byte i) {
		aClass124_816 = null;
		aCanvas819 = null;
		aClass52_810 = null;
		if (i != 41)
			method1196((byte) 107);
	}

	public static void method1197(int i, boolean bool) {
		if (i != -1 && Class108.aBooleanArray1819[i]) {
			Class83.aClass9_1335.method168(i, (byte) -90);
			if (Class1.aClass94ArrayArray75[i] != null) {
				boolean bool_16_ = true;
				for (int i_17_ = 0; i_17_ < Class1.aClass94ArrayArray75[i].length; i_17_++) {
					if (Class1.aClass94ArrayArray75[i][i_17_] != null) {
						if (Class1.aClass94ArrayArray75[i][i_17_].anInt1489 != 2)
							Class1.aClass94ArrayArray75[i][i_17_] = null;
						else
							bool_16_ = false;
					}
				}
				if (bool_16_)
					Class1.aClass94ArrayArray75[i] = null;
				Class108.aBooleanArray1819[i] = bool;
			}
		}
	}

	public Class49(int i, int i_18_, int i_19_) {
		/* empty */
	}
}
