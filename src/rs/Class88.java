/* Class88 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.Applet_Sub1;
import com.jagex.cache.anim.AnimLoader;
import com.jagex.cache.loaders.VarBit;
import com.jagex.cache.loaders.SpotAnimType;
import com.jagex.cache.loaders.UnderlayType;
import com.jagex.cache.loaders.Class35;
import com.jagex.cache.loaders.Identikit;
import com.jagex.cache.loaders.OverlayType;

public class Class88 {
	public int anInt1396;
	public int anInt1397;
	public int anInt1402;
	public int anInt1403;

	public static void method1435(byte i) {
		OverlayType.method59();
		UnderlayType.method1156();
		Identikit.method530();
		Class124.method1718(48);
		Class96.method1488(2);
		JunkTex.method544((byte) 124);
		AnimLoader.method1598(58);
		SpotAnimType.method560();
		VarBit.method1443();
		int i_0_ = -49 / ((90 - i) / 36);
		Class35.method991();
		Static2.method1124(97);
		Class14_Sub30.method941((byte) 11);
		Class7_Sub3.method134(0);
		SceneGraphNode.method1789((byte) -115);
		JunkTex.aClass52_4596.clearSoftReference();
	}

	public static void method1436(byte i) {
		JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(129);
		if (i >= -50)
			method1439(11, -123, -108, 106);
		JunkTex.aClass14_Sub10_Sub1_891.writeByte(Class1.method73((byte) -58));
		JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 109, Applet_Sub1.anInt1340);
		JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 94, Applet_Sub1.anInt3094);
		Static2.aLong3317 = 0L;
	}

	public static void method1439(int i, int i_4_, int i_5_, int i_6_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_4_][i_5_];
		if (class14_sub29 != null) {
			Class37 class37 = class14_sub29.aClass37_3255;
			if (class37 != null) {
				class37.anInt641 = class37.anInt641 * i_6_ / 16;
				class37.anInt646 = class37.anInt646 * i_6_ / 16;
			}
		}
	}
}
