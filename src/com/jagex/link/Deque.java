/* Class2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Deque {
	public Linkable current;

	public Linkable tail = new Linkable();

	public Deque() {
		tail.next = tail;
		tail.previous = tail;
	}

	public void clear() {
			for (;;) {
				Linkable linkable = tail.next;
				if (tail == linkable)
					break;
				linkable.unlink();
			}
			current = null;
	}

	public Linkable getNext() {
		Linkable linkable = current;
		if (tail == linkable) {
			current = null;
			return null;
		}
		current = linkable.next;
		return linkable;
	}

	public Linkable getPrevious() {
		Linkable linkable = current;
		if (linkable == tail) {
			current = null;
			return null;
		}
		current = linkable.previous;
		return linkable;
	}

	public Linkable getFront() {
		Linkable linkable = tail.next;
		if (linkable == tail) {
			current = null;
			return null;
		}
		current = linkable.next;
		return linkable;
	}

	public Linkable popFront() {
		Linkable linkable = tail.next;
		if (tail == linkable) {
			return null;
		}
		linkable.unlink();
		return linkable;
	}

	public Linkable getTail() {
		Linkable linkable = tail.previous;
		if (linkable == tail) {
			current = null;
			return null;
		}
		current = linkable.previous;
		return linkable;
	}

	public void pushBack(Linkable linkable) {
		if (linkable.previous != null)
			linkable.unlink();
		linkable.next = tail;
		linkable.previous = tail.previous;
		linkable.previous.next = linkable;
		linkable.next.previous = linkable;
	}

	public void pushFront(Linkable linkable) {
		if (linkable.previous != null)
			linkable.unlink();
		linkable.previous = tail;
		linkable.next = tail.next;
		linkable.previous.next = linkable;
		linkable.next.previous = linkable;
	}

	public int size() {
		int i_0_ = 0;
		Linkable linkable = tail.next;
		while (linkable != tail) {
			linkable = linkable.next;
			i_0_++;
		}
		return i_0_;
	}
}
