/* Class7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cache;
import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub25;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public class Class7_Sub3 extends Class7 {
	public static Cache aClass20_2680 = new Cache(64);
	public static int anInt2681;
	public static int anInt2682;
	public static int anInt2683 = 50;
	public static Class124 aClass124_2684;
	public static long[] aLongArray2685;

	static {
		anInt2682 = 0;
		aClass124_2684 = Class14_Sub2_Sub2.method263(1178, "cross");
		aLongArray2685 = new long[1000];
	}

	public static void method131(int i, int i_0_) {
		Class36.aClass52_621.method1208((byte) -112, i);
		if (i_0_ > -42)
			method133(true);
		Class70.aClass52_1079.method1208((byte) -112, i);
	}

	public static Buffer method132(byte i) {
		Buffer class14_sub10 = new Buffer(24);
		class14_sub10.method809(3);
		class14_sub10.method809(Class14_Sub8_Sub6.anInt4190);
		class14_sub10.method809(Class53.aBoolean865 ? 1 : 0);
		class14_sub10.method809(Class139.aBoolean2233 ? 1 : 0);
		class14_sub10.method809(!Static2.aBoolean2372 ? 0 : 1);
		class14_sub10.method809(!Class125_Sub3.aBoolean3397 ? 0 : 1);
		class14_sub10.method809(Class135.aBoolean2190 ? 1 : 0);
		class14_sub10.method809(Class33.aBoolean584 ? 1 : 0);
		class14_sub10.method809(Class28.aBoolean516 ? 1 : 0);
		class14_sub10.method809(!Class14_Sub8_Sub25.aBoolean4518 ? 0 : 1);
		class14_sub10.method809(Class89.anInt1413);
		class14_sub10.method809(RT4.useLighting ? 1 : 0);
		class14_sub10.method809(Class15.aBoolean374 ? 1 : 0);
		class14_sub10.method809(Class14_Sub8_Sub20.aBoolean4420 ? 1 : 0);
		int i_1_ = -35 / ((i + 6) / 48);
		class14_sub10.method809(Class135.anInt2189);
		class14_sub10.method809(!Class14_Sub8_Sub26.aBoolean4528 ? 0 : 1);
		class14_sub10.method809(Class14_Sub29.anInt3266);
		class14_sub10.method809(Class14_Sub23.anInt3135);
		class14_sub10.method809(Class100.anInt1691);
		class14_sub10.method833((byte) 123, Class54.anInt887);
		class14_sub10.method833((byte) 103, Static2.anInt2725);
		class14_sub10.method809(Static.aBoolean845 ? 1 : 0);
		Buffer class14_sub10_2_ = class14_sub10;
		return class14_sub10_2_;
	}

	public static void method133(boolean bool) {
		aClass124_2684 = null;
		aLongArray2685 = null;
		if (!bool)
			method131(28, -126);
		aClass20_2680 = null;
	}

	public static void method134(int i) {
		Class14_Sub28.aClass52_3217.method1209((byte) -96);
	}
}
