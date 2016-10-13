/* Class56_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;

public class Class56_Sub1 extends Class56 {
	public static long aLong3317 = 0L;
	public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_3320;
	public static Class124 aClass124_3321 = Class14_Sub2_Sub2.method263(1178, "Lade Sprites )2 ");
	public static int anInt3322;
	public static float aFloat3323;

	public static void method1241(int i, int i_0_, byte i_1_, int i_2_, int i_3_, int i_4_) {
		Class51.method1201(Static2.anIntArrayArray4038[i_4_++], i_0_, i, -5973, i_2_);
		int i_5_ = -65 % ((-73 - i_1_) / 33);
		Class51.method1201(Static2.anIntArrayArray4038[i_3_--], i_0_, i, -5973, i_2_);
		for (int i_6_ = i_4_; i_6_ <= i_3_; i_6_++) {
			int[] is = Static2.anIntArrayArray4038[i_6_];
			is[i_0_] = is[i] = i_2_;
		}
	}

	public static void method1242(Component component, int i) {
		component.addMouseListener(Class67.aClass97_1055);
		if (i != 0)
			aLong3317 = 25L;
		component.addMouseMotionListener(Class67.aClass97_1055);
		component.addFocusListener(Class67.aClass97_1055);
	}

	public static void method1243(byte i) {
		aClass124_3321 = null;
		if (i != -115)
			method1243((byte) -64);
		aClass14_Sub2_Sub16_3320 = null;
		
	}
}
