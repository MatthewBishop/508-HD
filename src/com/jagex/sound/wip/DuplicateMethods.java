package com.jagex.sound.wip;

import java.awt.Component;

import com.jagex.StringConstants;
import com.jagex.applet.Class43;

public class DuplicateMethods {

	public static int method617(int i, int i_4_) {
		return i & i_4_;
	}
	
	public static int method1294(int i, int i_25_) {
		int i_26_ = i | i_25_;
		return i_26_;
	}
	
	public static int getFarestBitValue(int i) {
		i = --i | i >>> 1;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 16;
		return 1 + i;
	}

	public static Class75 method235(int i, int i_0_, Class43 signlink, Component component, int i_1_) {
		if (Class14_Sub9.anInt1909 == 0)
			throw new IllegalStateException();
		if (i_1_ < 0 || i_1_ >= 2) {
			throw new IllegalArgumentException();
		}
		if (i < 256)
			i = 256;
		while_54_: do {
			do {
				Class75 class75;
				try {
					if (i_0_ >= 38)
						break;
					Object object = null;
					class75 = (Class75) object;
				} catch (Throwable throwable) {
					break while_54_;
				}
				return class75;
			} while (false);
			Class75 class75;
			try {
				Class75 class75_2_ = ((Class75) Class.forName(StringConstants.CLASS75_SUB1).newInstance());
				class75_2_.anIntArray1150 = new int[256 * (!Class14_Sub9.aBoolean3763 ? 1 : 2)];
				class75_2_.anInt1173 = i;
				class75_2_.method1350(component);
				class75_2_.anInt1174 = (i & ~0x3ff) + 1024;
				if (class75_2_.anInt1174 > 16384)
					class75_2_.anInt1174 = 16384;
				class75_2_.method1347(class75_2_.anInt1174);
				if (DuplicateMethods.anInt1674 > 0 && DuplicateMethods.aClass90_1070 == null) {
					DuplicateMethods.aClass90_1070 = new Class90();
					DuplicateMethods.aClass90_1070.aClass43_1421 = signlink;
					signlink.method1143(DuplicateMethods.anInt1674, DuplicateMethods.aClass90_1070, 0);
				}
				if (DuplicateMethods.aClass90_1070 != null) {
					if (DuplicateMethods.aClass90_1070.aClass75Array1422[i_1_] != null)
						throw new IllegalArgumentException();
					DuplicateMethods.aClass90_1070.aClass75Array1422[i_1_] = class75_2_;
				}
				class75 = class75_2_;
			} catch (Throwable throwable) {
				break;
			}
			return class75;
		} while (false);
		Class75_Sub2 class75_sub2;
		try {
			Class75_Sub2 class75_sub2_3_ = new Class75_Sub2(signlink, i_1_);
			class75_sub2_3_.anInt1173 = i;
			class75_sub2_3_.anIntArray1150 = new int[256 * (Class14_Sub9.aBoolean3763 ? 2 : 1)];
			class75_sub2_3_.method1350(component);
			class75_sub2_3_.anInt1174 = 16384;
			class75_sub2_3_.method1347(class75_sub2_3_.anInt1174);
			if (DuplicateMethods.anInt1674 > 0 && DuplicateMethods.aClass90_1070 == null) {
				DuplicateMethods.aClass90_1070 = new Class90();
				DuplicateMethods.aClass90_1070.aClass43_1421 = signlink;
				signlink.method1143(DuplicateMethods.anInt1674, DuplicateMethods.aClass90_1070, 0);
			}
			if (DuplicateMethods.aClass90_1070 != null) {
				if (DuplicateMethods.aClass90_1070.aClass75Array1422[i_1_] != null)
					throw new IllegalArgumentException();
				DuplicateMethods.aClass90_1070.aClass75Array1422[i_1_] = class75_sub2_3_;
			}
			class75_sub2 = class75_sub2_3_;
		} catch (Throwable throwable) {
			return null;
		}
		return class75_sub2;
	}

	public static Class90 aClass90_1070;

	public static void kill() {
		DuplicateMethods.aClass90_1070 = null;
	}

	public static void method1772(boolean bool, int i, int i_1_) {
		if (i_1_ < 8000 || i_1_ > 48000)
			throw new IllegalArgumentException();
		Class14_Sub9.anInt1909 = i_1_;
		Class14_Sub9.aBoolean3763 = bool;
		DuplicateMethods.anInt1674 = i;
	}

	public static int anInt1674;
}
