/* Class147 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

public class Class147 {
	public int anInt2366;
	public int[] anIntArray2367;
	public int anInt2368;
	public int[] anIntArray2369;

	public Class147() {
		Class14_Sub24.method906(16);
		anInt2368 = (Class14_Sub24.method908() != 0 ? Class14_Sub24.method906(4) + 1 : 1);
		if (Class14_Sub24.method908() != 0)
			Class14_Sub24.method906(8);
		Class14_Sub24.method906(2);
		if (anInt2368 > 1)
			anInt2366 = Class14_Sub24.method906(4);
		anIntArray2367 = new int[anInt2368];
		anIntArray2369 = new int[anInt2368];
		for (int i = 0; i < anInt2368; i++) {
			Class14_Sub24.method906(8);
			anIntArray2367[i] = Class14_Sub24.method906(8);
			anIntArray2369[i] = Class14_Sub24.method906(8);
		}
	}
}
