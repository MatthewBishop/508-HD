/* Class14_Sub6 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Class52;
import com.jagex.link.Linkable;
import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub25;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class Class14_Sub6 extends Linkable {
	public static Class124 aClass124_2806;
	public static Class124 aClass124_2807;
	public static Class124 aClass124_2809;
	public static Class124 aClass124_2810;
	public static Class124 aClass124_2811 = Class14_Sub2_Sub2.method263(1178, "Fps:");
	public int anInt2813;
	public int anInt2814;
	public static Class52 aClass52_2817;

	static {
		aClass124_2809 = null;
		aClass124_2807 = Class14_Sub2_Sub2.method263(1178, "<br>");
		aClass124_2806 = Class14_Sub2_Sub2.method263(1178, "Select");
		aClass124_2810 = aClass124_2806;
		aClass52_2817 = new Class52(64);
	}

	public static int method463(byte i) {
		if (i != -124) {
			int i_0_ = 40;
			return i_0_;
		}
		int i_1_ = (((Class100.anInt1691 != 0 ? 1 : 0) << 22) + (((!Class14_Sub8_Sub26.aBoolean4528 ? 0 : 1) << 19)
				+ ((!Class14_Sub8_Sub20.aBoolean4420 ? 0
						: 1) << 16)
				+ (((!Class15.aBoolean374 ? 0 : 1) << 15)
						+ ((RT4.useLighting ? 1 : 0) << 45))
				+ (((Class89.anInt1413 & 0x3) << 43) + ((!Class28.aBoolean516 ? 0 : 1) << 41)
						+ ((!Class33.aBoolean584 ? 0 : 1) << 8))
				+ ((!Class135.aBoolean2190 ? 0 : 1) << 39)
				+ (((Class139.aBoolean2233 ? 1 : 0) << 4)
						+ ((Class14_Sub8_Sub6.anInt4190 & 0x7)
								- (-((Class53.aBoolean865 ? 1 : 0) << 35) - ((Static2.aBoolean2372 ? 1 : 0) << 37))
								+ ((!Class125_Sub3.aBoolean3397 ? 0 : 1) << 6))
						+ ((Class14_Sub8_Sub25.aBoolean4518 ? 1 : 0) << 10)
						+ ((Class135.anInt2189 << 17 & 0x60000) + ((Class14_Sub29.anInt3266 != 0 ? 1 : 0) << 52)))
				+ ((Class14_Sub23.anInt3135 != 0 ? 1 : 0) << 53)));
		return i_1_;
	}

	public static Class94 method464(int i, int i_2_, byte i_3_) {
		if (i_3_ != -19) {
			Class94 class94 = null;
			return class94;
		}
		Class94 class94 = Static.method1233(i_2_, 21803);
		if (i == -1) {
			Class94 class94_4_ = class94;
			return class94_4_;
		}
		if (class94 == null || class94.aClass94Array1486 == null || class94.aClass94Array1486.length <= i) {
			Class94 class94_5_ = null;
			return class94_5_;
		}
		Class94 class94_6_ = class94.aClass94Array1486[i];
		return class94_6_;
	}

	public static void method466(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		int i_13_ = Class67.method1301((byte) -91, i_7_, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_14_ = Class67.method1301((byte) -124, i_12_, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_15_ = Class67.method1301((byte) 105, i, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		int i_16_ = Class67.method1301((byte) -125, i_11_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		int i_17_ = Class67.method1301((byte) -74, i_7_ + i_10_, Class14_Sub17.anInt3005, Class59.anInt955);
		int i_18_ = Class67.method1301((byte) 61, -i_10_ + i_12_, Class14_Sub17.anInt3005, Class59.anInt955);
		for (int i_19_ = i_13_; i_19_ < i_17_; i_19_++)
			Class51.method1201(Static2.anIntArrayArray4038[i_19_], i_15_, i_16_, -5973, i_9_);
		for (int i_20_ = i_14_; i_18_ < i_20_; i_20_--)
			Class51.method1201(Static2.anIntArrayArray4038[i_20_], i_15_, i_16_, -5973, i_9_);
		int i_21_ = Class67.method1301((byte) -126, i + i_10_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		if (i_8_ != -32718)
			method467(-80);
		int i_22_ = Class67.method1301((byte) 47, i_11_ - i_10_, Class118.anInt1982, Class14_Sub8_Sub14.anInt4327);
		for (int i_23_ = i_17_; i_23_ <= i_18_; i_23_++) {
			int[] is = Static2.anIntArrayArray4038[i_23_];
			Class51.method1201(is, i_15_, i_21_, i_8_ ^ 0x6899, i_9_);
			Class51.method1201(is, i_22_, i_16_, -5973, i_9_);
		}
	}

	public static void method467(int i) {
		aClass124_2806 = null;
		aClass124_2810 = null;
		if (i == -270693430) {
			aClass124_2811 = null;
			aClass52_2817 = null;
			aClass124_2807 = null;
			aClass124_2809 = null;
		}
	}

	public Class14_Sub6(int i, int i_24_) {
		anInt2813 = i_24_;
		anInt2814 = i;
	}

	public static boolean method468(int i, int i_25_) {
		if (i <= 32)
			method467(104);
		boolean bool = (i_25_ >> 61 & 0x1) != 0;
		return bool;
	}
}
