/* Class14_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.link.Linkable;
import com.jagex.sound.Class14_Sub12;

public abstract class Class14_Sub9 extends Linkable {
	public volatile boolean aBoolean2864 = true;
	public Class14_Sub12 aClass14_Sub12_2866;
	public Class14_Sub9 aClass14_Sub9_2867;
	public int anInt2865;
	public static boolean aBoolean3763;
	public static int anInt1909;

	public abstract Class14_Sub9 method686();

	public abstract void method687(int[] is, int i, int i_0_);

	public abstract Class14_Sub9 method688();

	public void method689(int[] is, int i, int i_1_) {
		if (aBoolean2864)
			method687(is, i, i_1_);
		else
			method692(i_1_);
	}

	public abstract int method690();

	public int method691() {
		return 255;
	}

	public abstract void method692(int i);
}
