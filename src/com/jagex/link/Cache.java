/* Class20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Cache {
	public int capacity;
	public Cacheable empty = new Cacheable();
	public Queue history = new Queue();

	public HashTable table;

	public int unused;

	public Cache(int count) {
		unused = count;
		capacity = count;
		int size;
		for (size = 1; size + size < count; size += size) {
		}
		
		table = new HashTable(size);
	}

	public void clear() {
		history.clear();
		table.clear();
		empty = new Cacheable();
		unused = capacity;
	}

	public Cacheable get(long l) {
		Cacheable cacheable = (Cacheable) table.get(l);
		if (cacheable != null)
			history.push(cacheable);
		Cacheable cacheable_4_ = cacheable;
		return cacheable_4_;
	}

	public Linkable getFirst() {
		Linkable linkable = table.getFirst();
		return linkable;
	}

	public Linkable getNext() {
		Linkable linkable = table.getNext();
		return linkable;
	}

	public void put(Cacheable cacheable, long l) {
		if (unused == 0) {
			Cacheable cacheable_3_ = history.pop();
			cacheable_3_.unlink();
			cacheable_3_.unlinkCacheable();
			if (cacheable_3_ == empty) {
				cacheable_3_ = history.pop();
				cacheable_3_.unlink();
				cacheable_3_.unlinkCacheable();
			}
		} else
			unused--;
		table.put(l, cacheable);
		history.push(cacheable);
	}
}
