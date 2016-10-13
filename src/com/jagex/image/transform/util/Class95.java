/* Class95 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform.util;

import com.jagex.image.transform.TexStatic;
import com.jagex.link.Deque;

public class Class95 {

	public boolean aBoolean1628 = false;
	private Class14_Sub22[] aClass14_Sub22Array1620;
	private Deque aClass2_1627 = new Deque();
	private int anInt1616 = 0;
	private int anInt1618 = -1;

	private int anInt1619;

	private int anInt1621;

	private int[][][] anIntArrayArrayArray1626;

	public Class95(int i, int i_9_, int i_10_) {
		anInt1619 = i_9_;
		aClass14_Sub22Array1620 = new Class14_Sub22[anInt1619];
		anInt1621 = i;
		anIntArrayArrayArray1626 = new int[anInt1621][3][i_10_];
	}

	public int[][] method1481(int i, int i_0_) {
		if (anInt1619 == anInt1621) {
			aBoolean1628 = aClass14_Sub22Array1620[i_0_] == null;
			aClass14_Sub22Array1620[i_0_] = TexStatic.aClass14_Sub22_652;
			int[][] is = anIntArrayArrayArray1626[i_0_];
			return is;
		}
		if (anInt1621 == 1) {
			aBoolean1628 = i_0_ != anInt1618;
			anInt1618 = i_0_;
			int[][] is = anIntArrayArrayArray1626[0];
			return is;
		}
		Class14_Sub22 class14_sub22 = aClass14_Sub22Array1620[i_0_];
		if (class14_sub22 == null) {
			aBoolean1628 = true;
			if (anInt1621 <= anInt1616) {
				Class14_Sub22 class14_sub22_1_ = (Class14_Sub22) aClass2_1627.getTail();
				class14_sub22 = new Class14_Sub22(i_0_, class14_sub22_1_.anInt3118);
				aClass14_Sub22Array1620[class14_sub22_1_.anInt3120] = null;
				class14_sub22_1_.unlink();
			} else {
				class14_sub22 = new Class14_Sub22(i_0_, anInt1616);
				anInt1616++;
			}
			aClass14_Sub22Array1620[i_0_] = class14_sub22;
		} else
			aBoolean1628 = false;
		aClass2_1627.pushFront(class14_sub22);
		int[][] is = anIntArrayArrayArray1626[class14_sub22.anInt3118];
		return is;
	}

	public void method1483() {
		for (int i_7_ = 0; anInt1621 > i_7_; i_7_++) {
			anIntArrayArrayArray1626[i_7_][0] = null;
			anIntArrayArrayArray1626[i_7_][1] = null;
			anIntArrayArrayArray1626[i_7_][2] = null;
			anIntArrayArrayArray1626[i_7_] = null;
		}
		anIntArrayArrayArray1626 = null;
		aClass14_Sub22Array1620 = null;
		aClass2_1627.clear();
		aClass2_1627 = null;
	}

	public int[][][] method1485() {
		if (anInt1621 != anInt1619)
			throw new RuntimeException("Can only retrieve a full image cache");
		for (int i_8_ = 0; i_8_ < anInt1621; i_8_++)
			aClass14_Sub22Array1620[i_8_] = TexStatic.aClass14_Sub22_652;
		int[][][] is = anIntArrayArrayArray1626;
		return is;
	}
}
