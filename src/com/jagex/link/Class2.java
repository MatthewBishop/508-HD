/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Class2 {
	public Linkable aClass14_84 = new Linkable();

	public Linkable aClass14_90;

	public Class2() {
		aClass14_84.next = aClass14_84;
		aClass14_84.previous = aClass14_84;
	}

	public int method74() {
		int i_0_ = 0;
		Linkable linkable = aClass14_84.next;
		while (linkable != aClass14_84) {
			linkable = linkable.next;
			i_0_++;
		}
		int i_1_ = i_0_;
		return i_1_;
	}

	public Linkable method76() {
		Linkable linkable = aClass14_90;
		if (linkable == aClass14_84) {
			aClass14_90 = null;
			Linkable linkable_28_ = null;
			return linkable_28_;
		}
		aClass14_90 = linkable.previous;
		Linkable linkable_30_ = linkable;
		return linkable_30_;
	}

	public Linkable method77() {
		Linkable linkable = aClass14_84.next;
		if (linkable == aClass14_84) {
			aClass14_90 = null;
			Linkable linkable_31_ = null;
			return linkable_31_;
		}
		aClass14_90 = linkable.next;
		Linkable linkable_32_ = linkable;
		return linkable_32_;
	}

	public Linkable method78() {
		Linkable linkable = aClass14_84.next;
		if (aClass14_84 == linkable) {
			Linkable linkable_33_ = null;
			return linkable_33_;
		}
		linkable.unlink();
		Linkable linkable_34_ = linkable;
		return linkable_34_;
	}

	public void method80(Linkable linkable) {
		if (linkable.previous != null)
			linkable.unlink();
		linkable.next = aClass14_84;
		linkable.previous = aClass14_84.previous;
		linkable.previous.next = linkable;
		linkable.next.previous = linkable;
	}

	public void method81() {
			for (;;) {
				Linkable linkable = aClass14_84.next;
				if (aClass14_84 == linkable)
					break;
				linkable.unlink();
			}
			aClass14_90 = null;
	}

	public Linkable method83() {
		Linkable linkable = aClass14_84.previous;
		if (linkable == aClass14_84) {
			aClass14_90 = null;
			Linkable linkable_40_ = null;
			return linkable_40_;
		}
		aClass14_90 = linkable.previous;
		Linkable linkable_42_ = linkable;
		return linkable_42_;
	}

	public Linkable method84() {
		Linkable linkable = aClass14_90;
		if (aClass14_84 == linkable) {
			aClass14_90 = null;
			Linkable linkable_44_ = null;
			return linkable_44_;
		}
		aClass14_90 = linkable.next;
		Linkable linkable_45_ = linkable;
		return linkable_45_;
	}

	public void method87(Linkable linkable) {
		if (linkable.previous != null)
			linkable.unlink();
		linkable.previous = aClass14_84;
		linkable.next = aClass14_84.next;
		linkable.previous.next = linkable;
		linkable.next.previous = linkable;
	}
}
