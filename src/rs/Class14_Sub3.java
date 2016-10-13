/* Class14_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.IOException;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

public class Class14_Sub3 extends Linkable {
	public static float aFloat2745;
	public int[] anIntArray2746;
	public Class79 aClass79_2747;
	public static Class133_Sub1_Sub1 aClass133_Sub1_Sub1_2748;
	public static Class9_Sub1 aClass9_Sub1_2750;
	public int anInt2751;
	public static boolean aBoolean2752;
	public int anInt2753;
	public Class133_Sub1_Sub1 aClass133_Sub1_Sub1_2755;
	public int anInt2756 = 0;
	public boolean aBoolean2757;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2760;
	public int anInt2761;
	public Class133_Sub1_Sub2 aClass133_Sub1_Sub2_2762;
	public int anInt2763;
	public static int anInt2764 = 0;
	public int anInt2765;
	public int anInt2767;
	public int anInt2769;
	public static int anInt2771;
	public int anInt2772;
	public int anInt2773;
	public int anInt2774;
	public Class14_Sub9_Sub4 aClass14_Sub9_Sub4_2775;

	public static boolean method448(byte i, int i_0_, int i_1_) {
		if (i != 124)
			method450(50, -54, 83, -58);
		boolean bool = (i_1_ >> i_0_ + 1 & 0x1) != 0;
		return bool;
	}

	public static void method449(boolean bool, int i) {
		if (Class4.aClass36_134 != null) {
			try {
				Buffer class14_sub10 = new Buffer(4);
				class14_sub10.method809(!bool ? 3 : 2);
				class14_sub10.method783(255, 0);
				Class4.aClass36_134.method1100(0, 3, i, class14_sub10.payload);
			} catch (IOException ioexception) {
				try {
					Class4.aClass36_134.method1101((byte) 127);
				} catch (Exception exception) {
					/* empty */
				}
				Class4.aClass36_134 = null;
				Class51.anInt829++;
			}
		}
	}

	public static int method450(int i, int i_2_, int i_3_, int i_4_) {
		if (i != 5030)
			method448((byte) -48, 12, -71);
		if (i_2_ == i_4_) {
			int i_5_ = i_4_;
			return i_5_;
		}
		int i_6_ = -i_3_ + 128;
		int i_7_ = ((i_6_ * (i_4_ >>> 7 & 0x1fe01fe) + ((i_2_ & ~0xff00ff) >>> 39) * i_3_) & ~0xff00ff);
		int i_8_ = (i_4_ & 0xff00ff) * i_6_ + i_3_ * (i_2_ & 0xff00ff) & ~0xff00ff;
		int i_9_ = i_7_ + (i_8_ >> 39);
		return i_9_;
	}

	public static void method451(int i) {
		Class133_Sub5.method1844(-32768);
		Class116.method1595(i);
		JunkTex.method1128((byte) -83);
		Class60.method1264(i + 115);
		JunkTex.method501((byte) 61);
		Class15.method946((byte) -2);
		JunkTex.method1133((byte) -30);
		JunkTex.method1025(25192);
		Class7_Sub2_Sub1.method130((byte) 110);
		Class65.method1289(true);
		JunkTex.method1732(-25300);
		JunkTex.method538((byte) -121);
		Class115.method1592((byte) 23);
		Class7_Sub2.method127(i);
		Class14_Sub2_Sub5.aClass20_3815.clear();
		Class75.aClass9_Sub1_1167.method152(-118);
		Class109.aClass9_Sub1_1834.method152(-123);
		Class14_Sub17.aClass9_Sub1_3021.method152(i ^ ~0x6b);
		Static2.aClass9_Sub1_2901.method152(-107);
		Class14_Sub13.aClass9_Sub1_2958.method152(-112);
		JunkTex.aClass9_Sub1_3374.method152(-124);
		JunkTex.aClass9_Sub1_4739.method152(-116);
		aClass9_Sub1_2750.method152(-105);
		JunkTex.aClass9_Sub1_4323.method152(-106);
		JunkTex.aClass9_Sub1_4603.method152(-125);
		JunkTex.aClass9_Sub1_4521.method152(-122);
		JunkTex.aClass52_4596.clear();
	}

	public void method452(int i) {
		if (i != 18631)
			method450(109, 125, 60, -78);
		int i_10_ = anInt2753;
		if (aClass79_2747 == null) {
			if (aClass133_Sub1_Sub2_2762 != null) {
				int i_11_ = Static2.method1500(aClass133_Sub1_Sub2_2762, -1);
				if (i_11_ != i_10_) {
					Class12 class12 = aClass133_Sub1_Sub2_2762.aClass12_4949;
					anInt2753 = i_11_;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 == null)
						anInt2765 = 0;
					else
						anInt2765 = class12.anInt293 * 128;
				}
			} else if (aClass133_Sub1_Sub1_2755 != null) {
				anInt2753 = Class116.method1597(false, aClass133_Sub1_Sub1_2755);
				anInt2765 = aClass133_Sub1_Sub1_2755.anInt4917 * 128;
			}
		} else {
			Class79 class79 = aClass79_2747.method1391(i - 18630);
			if (class79 != null) {
				anInt2753 = class79.anInt1294;
				anInt2765 = class79.anInt1271 * 128;
				anInt2769 = class79.anInt1254;
				anInt2772 = class79.anInt1289;
				anIntArray2746 = class79.anIntArray1287;
			} else {
				anInt2753 = -1;
				anInt2769 = 0;
				anInt2772 = 0;
				anInt2765 = 0;
				anIntArray2746 = null;
			}
		}
		if (anInt2753 != i_10_ && aClass14_Sub9_Sub4_2775 != null) {
			Class33.aClass14_Sub9_Sub2_585.method730(aClass14_Sub9_Sub4_2775);
			aClass14_Sub9_Sub4_2775 = null;
		}
	}

	public static void method453(int i) {
		int i_12_ = 115 / ((i - 41) / 63);
		aClass9_Sub1_2750 = null;
		aClass133_Sub1_Sub1_2748 = null;
	}
}
