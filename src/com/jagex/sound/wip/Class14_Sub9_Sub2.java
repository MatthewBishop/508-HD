/* Class14_Sub9_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.link.Deque;
import com.jagex.link.Linkable;

public class Class14_Sub9_Sub2 extends Class14_Sub9 {
	public Deque aClass2_4839 = new Deque();
	public Deque aClass2_4840 = new Deque();
	public int anInt4841 = -1;
	public int anInt4842 = 0;

	@Override
	public Class14_Sub9 method688() {
		return (Class14_Sub9) aClass2_4839.getFront();
	}

	public void method729(Linkable linkable, Class14_Sub26 class14_sub26) {
		for (/**/; (linkable != aClass2_4840.tail
				&& (((Class14_Sub26) linkable).anInt3179 <= class14_sub26.anInt3179)); linkable = linkable.next) {
			/* empty */
		}
		method882(linkable, class14_sub26);
		anInt4841 = ((Class14_Sub26) aClass2_4840.tail.next).anInt3179;
	}

	public static void method882(Linkable linkable, Linkable linkable_0_) {
		if (linkable_0_.previous != null)
			linkable_0_.unlink();
		linkable_0_.previous = linkable.previous;
		linkable_0_.next = linkable;
		linkable_0_.previous.next = linkable_0_;
		linkable_0_.next.previous = linkable_0_;
	}
	
	public synchronized void method730(Class14_Sub9 class14_sub9) {
		class14_sub9.unlink();
	}

	@Override
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
			Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840.getFront();
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

	@Override
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
			Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840.getFront();
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

	@Override
	public int method690() {
		return 0;
	}

	public void method731(Class14_Sub26 class14_sub26) {
		class14_sub26.unlink();
		class14_sub26.method919();
		Linkable linkable = aClass2_4840.tail.next;
		if (linkable == aClass2_4840.tail)
			anInt4841 = -1;
		else
			anInt4841 = ((Class14_Sub26) linkable).anInt3179;
	}

	public void method732(int[] is, int i, int i_5_) {
		for (Class14_Sub9 class14_sub9 = (Class14_Sub9) aClass2_4839
				.getFront(); class14_sub9 != null; class14_sub9 = (Class14_Sub9) aClass2_4839.getNext())
			class14_sub9.method689(is, i, i_5_);
	}

	@Override
	public Class14_Sub9 method686() {
		return (Class14_Sub9) aClass2_4839.getNext();
	}

	public void method733() {
		if (anInt4842 > 0) {
			for (Class14_Sub26 class14_sub26 = (Class14_Sub26) aClass2_4840
					.getFront(); class14_sub26 != null; class14_sub26 = (Class14_Sub26) aClass2_4840.getNext())
				class14_sub26.anInt3179 -= anInt4842;
			anInt4841 -= anInt4842;
			anInt4842 = 0;
		}
	}

	public void method734(int i) {
		for (Class14_Sub9 class14_sub9 = (Class14_Sub9) aClass2_4839
				.getFront(); class14_sub9 != null; class14_sub9 = (Class14_Sub9) aClass2_4839.getNext())
			class14_sub9.method692(i);
	}

	public synchronized void method735(Class14_Sub9 class14_sub9) {
		aClass2_4839.pushFront(class14_sub9);
	}
}
