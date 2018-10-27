/* Class70 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.Applet_Sub1;
import com.jagex.io.PacketBuffer;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.Class25;

public class Class70 {
	public static SoftCache aClass52_1077 = new SoftCache(100);
	public static Class14_Sub2_Sub5 aClass14_Sub2_Sub5_1078;
	public static SoftCache aClass52_1079 = new SoftCache(5);
	public static PacketBuffer aClass14_Sub10_Sub1_1080 = new PacketBuffer(5000);
	public static int viewportBottom;
	public static void method1312(int i) {
		if (i != 0)
			aClass14_Sub2_Sub5_1078 = null;
		aClass14_Sub10_Sub1_1080 = null;
		aClass52_1077 = null;
		aClass14_Sub2_Sub5_1078 = null;
		aClass52_1079 = null;
	}

	public static void method1313(int i) {
		if (Class14_Sub2_Sub12.anInt3912 != -1)
			Static2.method250(Class14_Sub2_Sub12.anInt3912, false);
		for (int i_0_ = 0; i_0_ < Class14_Sub17.anInt3012; i_0_++) {
			if (JunkTex.aBooleanArray4698[i_0_])
				Class7_Sub2_Sub1.aBooleanArray3703[i_0_] = true;
			Class103.aBooleanArray1727[i_0_] = JunkTex.aBooleanArray4698[i_0_];
			JunkTex.aBooleanArray4698[i_0_] = false;
		}
		Class138.anInt2214 = -1;
		JunkTex.anInt4666 = Class14_Sub2_Sub20.anInt4064;
		Class141.aClass94_2239 = null;
		JunkTex.anInt4503 = -1;
		Class89.aBoolean1409 = true;
		if (Class14_Sub2_Sub12.anInt3912 != -1) {
			Class14_Sub17.anInt3012 = 0;
			JunkTex.method594(Applet_Sub1.anInt3094, true, 0, Class14_Sub2_Sub12.anInt3912, -1, 0, 0,
					Applet_Sub1.anInt1340, 0);
		}
		Class25.method994();
		Class51.anInt839 = 0;
		if (i != -11198)
			method1312(82);
	}

}
