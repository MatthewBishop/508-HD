/* Class7_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.wip.Class14_Sub2_Sub11;
import com.jagex.io.Buffer;
import com.jagex.rt4.RT4;

public class Class7_Sub3 extends Class7 {
	public static int anInt2681;
	public static int anInt2682;
	public static int anInt2683 = 50;
	public static Class124 aClass124_2684;
	public static long[] actions;

	static {
		anInt2682 = 0;
		aClass124_2684 = Class124.method263("cross");
		actions = new long[1000];
	}

	public static void method131(int i, int i_0_) {
		Class36.aClass52_621.method1208(i);
		if (i_0_ > -42)
			method133(true);
		Class70.aClass52_1079.method1208(i);
	}

	public static Buffer method132(byte i) {
		Buffer class14_sub10 = new Buffer(24);
		class14_sub10.writeByte(3);
		class14_sub10.writeByte(JunkTex.anInt4190);
		class14_sub10.writeByte(Class53.aBoolean865 ? 1 : 0);
		class14_sub10.writeByte(Class139.aBoolean2233 ? 1 : 0);
		class14_sub10.writeByte(!Static2.aBoolean2372 ? 0 : 1);
		class14_sub10.writeByte(!JunkTex.aBoolean3397 ? 0 : 1);
		class14_sub10.writeByte(Class135.aBoolean2190 ? 1 : 0);
		class14_sub10.writeByte(Class33.aBoolean584 ? 1 : 0);
		class14_sub10.writeByte(Class28.aBoolean516 ? 1 : 0);
		class14_sub10.writeByte(!JunkTex.aBoolean4518 ? 0 : 1);
		class14_sub10.writeByte(Class89.anInt1413);
		class14_sub10.writeByte(RT4.useLighting ? 1 : 0);
		class14_sub10.writeByte(RT4.aBoolean374 ? 1 : 0);
		class14_sub10.writeByte(JunkTex.aBoolean4420 ? 1 : 0);
		int i_1_ = -35 / ((i + 6) / 48);
		class14_sub10.writeByte(Class135.anInt2189);
		class14_sub10.writeByte(!JunkTex.aBoolean4528 ? 0 : 1);
		class14_sub10.writeByte(StaticMusic.anInt3266);
		class14_sub10.writeByte(StaticMusic.anInt3135);
		class14_sub10.writeByte(StaticMusic.anInt1691);
		class14_sub10.method833((byte) 123, Class54.anInt887);
		class14_sub10.method833((byte) 103, Static2.anInt2725);
		class14_sub10.writeByte(JunkTex.aBoolean845 ? 1 : 0);
		Buffer class14_sub10_2_ = class14_sub10;
		return class14_sub10_2_;
	}

	public static void method133(boolean bool) {
		aClass124_2684 = null;
		actions = null;
		if (!bool)
			method131(28, -126);
	}

	public static void method134(int i) {
		Static2.aClass52_3217.clearSoftReference();
	}
}
