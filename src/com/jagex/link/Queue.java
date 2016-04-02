/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Queue {
	public Cacheable current;

	public Cacheable head = new Cacheable();

	public Queue() {
		head.previousCacheable = head;
		head.nextCacheable = head;
	}

	public void clear() {
		for (;;) {
			Cacheable cacheable = head.nextCacheable;
			if (head == cacheable)
				break;
			cacheable.unlinkCacheable();
		}
		current = null;
	}

	public Cacheable peek() {
		Cacheable cacheable = head.nextCacheable;
		if (cacheable == head) {
			current = null;
			Cacheable cacheable_149_ = null;
			return cacheable_149_;
		}
		current = cacheable.nextCacheable;
		Cacheable cacheable_150_ = cacheable;
		return cacheable_150_;
	}

	public Cacheable getNext() {
		Cacheable cacheable = current;
		if (cacheable == head) {
			current = null;
			Cacheable cacheable_151_ = null;
			return cacheable_151_;
		}
		current = cacheable.nextCacheable;
		Cacheable cacheable_152_ = cacheable;
		return cacheable_152_;
	}

	public Cacheable pop() {
		Cacheable cacheable = head.nextCacheable;
		if (head == cacheable) {
			Cacheable cacheable_3_ = null;
			return cacheable_3_;
		}
		cacheable.unlinkCacheable();
		Cacheable cacheable_4_ = cacheable;
		return cacheable_4_;
	}

	public void push(Cacheable cacheable) {
		if (cacheable.previousCacheable != null)
			cacheable.unlinkCacheable();
		cacheable.previousCacheable = head.previousCacheable;
		cacheable.nextCacheable = head;
		cacheable.previousCacheable.nextCacheable = cacheable;
		cacheable.nextCacheable.previousCacheable = cacheable;
	}
	
	public void pushFront(Cacheable cacheable) {
		if (cacheable.previousCacheable != null)
			cacheable.unlinkCacheable();
		cacheable.previousCacheable = head;
		cacheable.nextCacheable = head.nextCacheable;
		cacheable.previousCacheable.nextCacheable = cacheable;
		cacheable.nextCacheable.previousCacheable = cacheable;
	}

}
