/* Class14_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Class2;
import com.jagex.link.Linkable;

public class Class14_Sub9_Sub2 extends Class14_Sub9 {
	public Class2 aClass2_4839 = new Class2();
	public Class2 aClass2_4840 = new Class2();
	public int anInt4841 = -1;
	public int anInt4842 = 0;

	public Class14_Sub9 method688() {
		return (Class14_Sub9) aClass2_4839.method77();
	}

	public void method729(Linkable linkable, Class14_Sub26 class14_sub26) {
		for (/**/; (linkable != aClass2_4840.aClass14_84
				&& (((Class14_Sub26) linkable).anInt3179 <= class14_sub26.anInt3179)); linkable = linkable.next) {
			/* empty */
		}
		Class14_Sub18.method882(-17344, linkable, class14_sub26);
		anInt4841 = ((Class14_Sub26) aClass2_4840.aClass14_84.next).anInt3179;
	}

	public synchronized void method730(Class14_Sub9 class14_sub9) {
		class14_sub9.unlink();
	}

	public synchronized void method687(int[] is, int i, int i_0_) {
		do {
			if (anInt4841 < 0) {
				method732(is, i, i_0_);
				break;
			}
			if (anInt4842 + i_0_ < anInt4841) {
				anInt4842 += i_0_;
				method732(is, i, i_0_);
				break;
			}
			int i_1_ = anInt4841 - anInt4842;
			method732(is, i, i_1_);
			i += i_1_;
			i_0_ -= i_1_;
			anInt4842 += i_1_;
			method733();
			Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840.method77();
			synchronized (class14_sub26) {
				int i_2_ = class14_sub26.method918(this);
				if (i_2_ < 0) {
					class14_sub26.anInt3179 = 0;
					method731(class14_sub26);
				} else {
					class14_sub26.anInt3179 = i_2_;
					method729(class14_sub26.next, class14_sub26);
				}
			}
		} while (i_0_ != 0);
	}

	public synchronized void method692(int i) {
		do {
			if (anInt4841 < 0) {
				method734(i);
				break;
			}
			if (anInt4842 + i < anInt4841) {
				anInt4842 += i;
				method734(i);
				break;
			}
			int i_3_ = anInt4841 - anInt4842;
			method734(i_3_);
			i -= i_3_;
			anInt4842 += i_3_;
			method733();
			Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840.method77();
			synchronized (class14_sub26) {
				int i_4_ = class14_sub26.method918(this);
				if (i_4_ < 0) {
					class14_sub26.anInt3179 = 0;
					method731(class14_sub26);
				} else {
					class14_sub26.anInt3179 = i_4_;
					method729(class14_sub26.next, class14_sub26);
				}
			}
		} while (i != 0);
	}

	public int method690() {
		return 0;
	}

	public void method731(Class14_Sub26 class14_sub26) {
		class14_sub26.unlink();
		class14_sub26.method919();
		Linkable linkable = aClass2_4840.aClass14_84.next;
		if (linkable == aClass2_4840.aClass14_84)
			anInt4841 = -1;
		else
			anInt4841 = ((Class14_Sub26) linkable).anInt3179;
	}

	public void method732(int[] is, int i, int i_5_) {
		for (Class14_Sub9 class14_sub9 = (Class14_Sub9) aClass2_4839
				.method77(); class14_sub9 != null; class14_sub9 = (Class14_Sub9) aClass2_4839.method84())
			class14_sub9.method689(is, i, i_5_);
	}

	public Class14_Sub9 method686() {
		return (Class14_Sub9) aClass2_4839.method84();
	}

	public void method733() {
		if (anInt4842 > 0) {
			for (Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840
					.method77(); class14_sub26 != null; class14_sub26 = (Class14_Sub26) aClass2_4840.method84())
				class14_sub26.anInt3179 -= anInt4842;
			anInt4841 -= anInt4842;
			anInt4842 = 0;
		}
	}

	public void method734(int i) {
		for (Class14_Sub9 class14_sub9 = (Class14_Sub9) aClass2_4839
				.method77(); class14_sub9 != null; class14_sub9 = (Class14_Sub9) aClass2_4839.method84())
			class14_sub9.method692(i);
	}

	public synchronized void method735(Class14_Sub9 class14_sub9) {
		aClass2_4839.method87(class14_sub9);
	}
}
