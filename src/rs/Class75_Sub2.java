/* Class75_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;

public class Class75_Sub2 extends Class75 {
	public static Interface4 anInterface4_3331;
	public int anInt3332;

	public void method1335() {
		anInterface4_3331.method20(anInt3332, (byte) -44);
	}

	public static void method1355() {
		anInterface4_3331 = null;
	}

	public void method1351() {
		anInterface4_3331.method22(anInt3332, true);
	}

	public void method1350(Component component) throws Exception {
		anInterface4_3331.method18(component, Class115.anInt1909, -87, Class14_Sub2_Sub2.aBoolean3763);
	}

	public int method1342() {
		return anInterface4_3331.method19(69, anInt3332);
	}

	public void method1347(int i) throws Exception {
		if (i > 32768)
			throw new IllegalArgumentException();
		anInterface4_3331.method21(-3038, i, anInt3332);
	}

	public Class75_Sub2(Class43 class43, int i) {
		anInterface4_3331 = class43.method1139((byte) 76);
		anInt3332 = i;
	}

	public void method1353() {
		anInterface4_3331.method23(anInt3332, anIntArray1150);
	}
}
