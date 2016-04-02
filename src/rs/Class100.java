/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Static;

public class Class100 implements Runnable {
	public static int anInt1681 = -1;
	public static Class124 aClass124_1682;
	public static Class124 aClass124_1683;
	public static int anInt1685;
	public boolean aBoolean1686 = true;
	public Object anObject1688 = new Object();
	public static Class124 aClass124_1689;
	public static Class9_Sub1 aClass9_Sub1_1690;
	public static int anInt1691 = 127;
	public static Class124 aClass124_1693;
	public static Class124 aClass124_1694;
	public int anInt1696;
	public int[] anIntArray1697 = new int[500];
	public static Class124 aClass124_1698;
	public int[] anIntArray1700 = new int[500];

	static {
		anInt1685 = 0;
		aClass124_1698 = Class14_Sub2_Sub2.method263(1178, "scroll:");
		aClass124_1683 = aClass124_1698;
		aClass124_1689 = Class14_Sub2_Sub2.method263(1178, "Schrifts-=tze geladen)3");
		aClass124_1682 = aClass124_1698;
		aClass124_1694 = Class14_Sub2_Sub2.method263(1178, "Connecting to update server");
		aClass124_1693 = aClass124_1694;
	}

	public void run() {
		while (aBoolean1686) {
			Object object = anObject1688;
			synchronized (object) {
				if (anInt1696 < 500) {
					anIntArray1700[anInt1696] = Class14_Sub8_Sub33.anInt4640;
					anIntArray1697[anInt1696] = Class107.anInt1804;
					anInt1696++;
				}
			}
			Class14_Sub13.method864(50L, (byte) 64);
		}
	}

	public static void method1512(boolean bool, byte i) {
		if (i >= -100)
			aClass124_1682 = null;
		int i_0_;
		byte[][] is;
		if (bool) {
			is = Class14_Sub2_Sub12.aByteArrayArray3913;
			i_0_ = 1;
		} else {
			i_0_ = 4;
			is = Class5.aByteArrayArray139;
		}
		int i_1_ = is.length;
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			int i_3_ = ((Class14_Sub8.anIntArray2858[i_2_] & 0xff) * 64 - Class58.anInt947);
			byte[] is_4_ = is[i_2_];
			int i_5_ = ((Class14_Sub8.anIntArray2858[i_2_] >> 8) * 64 - Class133_Sub6.anInt3676);
			if (is_4_ != null) {
				Class138.method1946(139);
				Class14_Sub8_Sub24.method608(Class49.anInt818 * 8 - 48, bool, Class129.anInt2133 * 8 - 48, i_3_, is_4_,
						i_5_, (byte) 80, Class14_Sub21.aClass32Array3100);
			}
		}
		for (int i_6_ = 0; i_1_ > i_6_; i_6_++) {
			int i_7_ = (-Class133_Sub6.anInt3676 + (Class14_Sub8.anIntArray2858[i_6_] >> 40) * 64);
			byte[] is_8_ = is[i_6_];
			int i_9_ = ((Class14_Sub8.anIntArray2858[i_6_] & 0xff) * 64 - Class58.anInt947);
			if (is_8_ == null && Class49.anInt818 < 800) {
				Class138.method1946(139);
				for (int i_10_ = 0; i_10_ < i_0_; i_10_++)
					Class107.method1547(i_10_, i_9_, i_7_, 64, 64, false);
			}
		}
	}

	public static void method1513(int i, int i_11_, int i_12_, Class94 class94, Class14_Sub2_Sub19 class14_sub2_sub19,
			int i_13_, int i_14_) {
		if (class14_sub2_sub19 != null) {
			int i_15_ = Class14_Sub8_Sub19.anInt4408 + Static.anInt696 & 0x7ff;
			int i_16_ = i_12_ * i_12_ + i * i;
			int i_17_ = Math.max(class94.anInt1518 / 2, class94.anInt1545 / 2) + 10;
			if (i_16_ <= i_17_ * i_17_) {
				i_16_ = Class3.sin[i_15_];
				i_17_ = Class3.cos[i_15_];
				i_17_ = i_13_ * i_17_ / (Class32.anInt551 + 256);
				i_16_ = i_16_ * 256 / (Class32.anInt551 + 256);
				int i_18_ = -(i_16_ * i_12_) + i_17_ * i >> 48;
				int i_19_ = i_16_ * i + i_12_ * i_17_ >> 48;
				((Class14_Sub2_Sub19_Sub2) class14_sub2_sub19).method419(
						i_19_ + (i_14_ + class94.anInt1518 / 2 - class14_sub2_sub19.anInt4034 / 2),
						(i_11_ + class94.anInt1545 / 2 - (i_18_ + class14_sub2_sub19.anInt4046 / 2)),
						(Class14_Sub2_Sub19_Sub2) class94.method1476(false, (byte) 61));
			}
		}
	}

	public static int method1514(int i, int i_20_, int i_21_) {
		int i_22_ = 0;
		int i_23_ = 63 % ((30 - i_20_) / 34);
		while (i > 0) {
			i--;
			i_22_ = i_21_ & 0x1 | i_22_ << 1;
			i_21_ >>>= 1;
		}
		int i_24_ = i_22_;
		return i_24_;
	}

	public static void method1515(int i) {
		if (i != -25576)
			method1512(true, (byte) 5);
		aClass124_1693 = null;
		aClass124_1683 = null;
		aClass124_1698 = null;
		aClass9_Sub1_1690 = null;
		aClass124_1694 = null;
		aClass124_1689 = null;
		aClass124_1682 = null;
	}

	public Class100() {
		anInt1696 = 0;
	}
}
