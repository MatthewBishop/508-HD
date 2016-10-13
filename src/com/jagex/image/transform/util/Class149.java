/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform.util;

import com.jagex.image.transform.TexStatic;
import com.jagex.link.Deque;

public class Class149 {
	public boolean aBoolean2402;
	private Class14_Sub6[] aClass14_Sub6Array2401;
	private Deque aClass2_2394;
	private int anInt2385;
	private int anInt2392 = 0;
	private int anInt2393;

	private int anInt2399 = -1;

	private int[][] anIntArrayArray2386;

	public Class149(int i, int i_5_, int i_6_) {
		aClass2_2394 = new Deque();
		aBoolean2402 = false;
		anInt2385 = i;
		anIntArrayArray2386 = new int[anInt2385][i_6_];
		anInt2393 = i_5_;
		aClass14_Sub6Array2401 = new Class14_Sub6[anInt2393];
	}

	public int[] method2014(int i) {
		if (anInt2393 != anInt2385) {
			if (anInt2385 == 1) {
				aBoolean2402 = anInt2399 != i;
				anInt2399 = i;
				int[] is = anIntArrayArray2386[0];
				return is;
			}
			Class14_Sub6 class14_sub6 = aClass14_Sub6Array2401[i];
			if (class14_sub6 == null) {
				aBoolean2402 = true;
				if (anInt2385 <= anInt2392) {
					Class14_Sub6 class14_sub6_1_ = (Class14_Sub6) aClass2_2394.getTail();
					class14_sub6 = new Class14_Sub6(i, class14_sub6_1_.anInt2813);
					aClass14_Sub6Array2401[class14_sub6_1_.anInt2814] = null;
					class14_sub6_1_.unlink();
				} else {
					class14_sub6 = new Class14_Sub6(i, anInt2392);
					anInt2392++;
				}
				aClass14_Sub6Array2401[i] = class14_sub6;
			} else
				aBoolean2402 = false;
			aClass2_2394.pushFront(class14_sub6);
			int[] is = anIntArrayArray2386[class14_sub6.anInt2813];
			return is;
		}
		aBoolean2402 = aClass14_Sub6Array2401[i] == null;
		aClass14_Sub6Array2401[i] = TexStatic.aClass14_Sub6_3319;
		int[] is = anIntArrayArray2386[i];
		return is;
	}

	public void method2015() {
		for (int i_2_ = 0; anInt2385 > i_2_; i_2_++)
			anIntArrayArray2386[i_2_] = null;
		aClass14_Sub6Array2401 = null;
		anIntArrayArray2386 = null;
		aClass2_2394.clear();
		aClass2_2394 = null;
	}

	public int[][] method2019() {
		if (anInt2385 != anInt2393)
			throw new RuntimeException("Can only retrieve a full image cache");
		for (int i = 0; i < anInt2385; i++)
			aClass14_Sub6Array2401[i] = TexStatic.aClass14_Sub6_3319;
		int[][] is = anIntArrayArray2386;
		return is;
	}
}
