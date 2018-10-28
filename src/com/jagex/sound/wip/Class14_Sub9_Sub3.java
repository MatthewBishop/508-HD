/* Class14_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.link.Deque;

public class Class14_Sub9_Sub3 extends Class14_Sub9 {
	public Class14_Sub9_Sub1 aClass14_Sub9_Sub1_4856;
	public Class14_Sub9_Sub2 aClass14_Sub9_Sub2_4859 = new Class14_Sub9_Sub2();

	public Deque aClass2_4858 = new Deque();

	public Class14_Sub9_Sub3(Class14_Sub9_Sub1 class14_sub9_sub1) {
		aClass14_Sub9_Sub1_4856 = class14_sub9_sub1;
	}

	@Override
	public Class14_Sub9 method686() {
		Class14_Sub18 class14_sub18;
		do {
			class14_sub18 = (Class14_Sub18) aClass2_4858.getNext();
			if (class14_sub18 == null)
				return null;
		} while (class14_sub18.aClass14_Sub9_Sub4_3051 == null);
		Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
		return class14_sub9_sub4;
	}

	@Override
	public void method687(int[] is, int i, int i_0_) {
		aClass14_Sub9_Sub2_4859.method687(is, i, i_0_);
		while_349_: for (Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858
				.getFront(); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass2_4858.getNext()) {
			if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
				int i_1_ = i;
				int i_2_ = i_0_;
				while_347_: do {
					do {
						if (class14_sub18.anInt3048 >= i_2_)
							break while_347_;
						method737(is, class14_sub18.anInt3048, i_1_, i_2_ + i_1_, class14_sub18, -78);
						i_2_ -= class14_sub18.anInt3048;
						i_1_ += class14_sub18.anInt3048;
					} while (!aClass14_Sub9_Sub1_4856.method725(is, class14_sub18, 81, i_2_, i_1_));
					continue while_349_;
				} while (false);
				method737(is, i_2_, i_1_, i_2_ + i_1_, class14_sub18, -82);
				class14_sub18.anInt3048 -= i_2_;
			}
		}
	}

	@Override
	public Class14_Sub9 method688() {
		Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858.getFront();
		if (class14_sub18 == null) {
			Class14_Sub9 class14_sub9 = null;
			return class14_sub9;
		}
		if (class14_sub18.aClass14_Sub9_Sub4_3051 != null) {
			Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
			return class14_sub9_sub4;
		}
		Class14_Sub9 class14_sub9 = method686();
		return class14_sub9;
	}

	@Override
	public int method690() {
		int i = 0;
		return i;
	}

	@Override
	public void method692(int i) {
		aClass14_Sub9_Sub2_4859.method692(i);
		while_355_: for (Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858
				.getFront(); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass2_4858.getNext()) {
			if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
				int i_13_ = i;
				while_353_: do {
					do {
						if (class14_sub18.anInt3048 >= i_13_)
							break while_353_;
						method739(class14_sub18, -39, class14_sub18.anInt3048);
						i_13_ -= class14_sub18.anInt3048;
					} while (!aClass14_Sub9_Sub1_4856.method725(null, class14_sub18, 107, i_13_, 0));
					continue while_355_;
				} while (false);
				method739(class14_sub18, -39, i_13_);
				class14_sub18.anInt3048 -= i_13_;
			}
		}
	}

	public void method737(int[] is, int i, int i_3_, int i_4_, Class14_Sub18 class14_sub18, int i_5_) {
		int i_6_ = -56 % ((i_5_ + 15) / 48);
		if ((aClass14_Sub9_Sub1_4856.anIntArray4817[class14_sub18.anInt3053] & 0x4) != 0
				&& class14_sub18.anInt3041 < 0) {
			int i_7_ = ((aClass14_Sub9_Sub1_4856.anIntArray4796[class14_sub18.anInt3053]) / Class14_Sub9.anInt1909);
			for (;;) {
				int i_8_ = (i_7_ + (-class14_sub18.anInt3044 + 1048575)) / i_7_;
				if (i < i_8_)
					break;
				class14_sub18.aClass14_Sub9_Sub4_3051.method687(is, i_3_, i_8_);
				int i_9_ = Class14_Sub9.anInt1909 / 100;
				i -= i_8_;
				i_3_ += i_8_;
				int i_10_ = 262144 / i_7_;
				class14_sub18.anInt3044 += i_7_ * i_8_ - 1048576;
				Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
				if (i_10_ < i_9_)
					i_9_ = i_10_;
				if ((aClass14_Sub9_Sub1_4856.anIntArray4826[class14_sub18.anInt3053]) == 0)
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub9_sub4.method767(),
							class14_sub9_sub4.method769(), class14_sub9_sub4.method758()));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub9_sub4.method767(), 0,
							class14_sub9_sub4.method758()));
					aClass14_Sub9_Sub1_4856.method705(114, class14_sub18,
							(class14_sub18.aClass14_Sub28_3054.aShortArray3223[(class14_sub18.anInt3037)]) < 0);
					class14_sub18.aClass14_Sub9_Sub4_3051.method747(i_9_, class14_sub9_sub4.method769());
				}
				if ((class14_sub18.aClass14_Sub28_3054.aShortArray3223[class14_sub18.anInt3037]) < 0)
					class14_sub18.aClass14_Sub9_Sub4_3051.method765(-1);
				class14_sub9_sub4.method777(i_9_);
				class14_sub9_sub4.method687(is, i_3_, i_4_ - i_3_);
				if (class14_sub9_sub4.method776())
					aClass14_Sub9_Sub2_4859.method735(class14_sub9_sub4);
			}
			class14_sub18.anInt3044 += i_7_ * i;
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method687(is, i_3_, i);
	}

	public void method739(Class14_Sub18 class14_sub18, int i, int i_14_) {
		int i_15_ = 14 / ((i - 31) / 54);
		if ((aClass14_Sub9_Sub1_4856.anIntArray4817[class14_sub18.anInt3053] & 0x4) != 0
				&& class14_sub18.anInt3041 < 0) {
			int i_16_ = ((aClass14_Sub9_Sub1_4856.anIntArray4796[class14_sub18.anInt3053]) / Class14_Sub9.anInt1909);
			int i_17_ = (-class14_sub18.anInt3044 + (i_16_ + 1048575)) / i_16_;
			class14_sub18.anInt3044 = i_16_ * i_14_ + class14_sub18.anInt3044 & 0xfffff;
			if (i_14_ >= i_17_) {
				if ((aClass14_Sub9_Sub1_4856.anIntArray4826[class14_sub18.anInt3053]) == 0)
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub18.aClass14_Sub9_Sub4_3051.method767(),
							class14_sub18.aClass14_Sub9_Sub4_3051.method769(),
							class14_sub18.aClass14_Sub9_Sub4_3051.method758()));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub18.aClass14_Sub9_Sub4_3051.method767(),
							0, class14_sub18.aClass14_Sub9_Sub4_3051.method758()));
					aClass14_Sub9_Sub1_4856.method705(-6, class14_sub18,
							(class14_sub18.aClass14_Sub28_3054.aShortArray3223[(class14_sub18.anInt3037)]) < 0);
				}
				if ((class14_sub18.aClass14_Sub28_3054.aShortArray3223[class14_sub18.anInt3037]) < 0)
					class14_sub18.aClass14_Sub9_Sub4_3051.method765(-1);
				i_14_ = class14_sub18.anInt3044 / i_16_;
			}
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method692(i_14_);
	}
}
