/* Class55 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class HashTable {
	public int bucketCount;

	public Linkable[] buckets;

	public int currentBucket = 0;

	public Linkable lastIterated;

	public long lastKey;

	public Linkable lastRetrieved;

	public HashTable(int i) {
		bucketCount = i;
		buckets = new Linkable[i];
		for (int i_27_ = 0; i_27_ < i; i_27_++) {
			Linkable linkable = buckets[i_27_] = new Linkable();
			linkable.previous = linkable;
			linkable.next = linkable;
		}
	}

	public void clear() {
		for (int i_25_ = 0; bucketCount > i_25_; i_25_++) {
			Linkable linkable = buckets[i_25_];
			for (;;) {
				Linkable linkable_26_ = linkable.next;
				if (linkable_26_ == linkable)
					break;
				linkable_26_.unlink();
			}
		}
		lastIterated = null;
		lastRetrieved = null;
	}

	public Linkable get(long l) {
		lastKey = l;
		Linkable linkable = buckets[(int) (l & (long) (bucketCount - 1))];
		for (lastRetrieved = linkable.next; linkable != lastRetrieved; lastRetrieved = lastRetrieved.next) {
			if (l == lastRetrieved.key) {
				Linkable tmp = lastRetrieved;
				lastRetrieved = lastRetrieved.next;
				return tmp;
			}
		}
		lastRetrieved = null;
		return null;
	}

	public int getBucketCount() {
		int i_6_ = bucketCount;
		return i_6_;
	}

	public Linkable getFirst() {
		currentBucket = 0;
		Linkable linkable = getNext();
		return linkable;
	}

	public Linkable getNext() {
		if (currentBucket > 0 && lastIterated != buckets[currentBucket - 1]) {
			Linkable linkable = lastIterated;
			lastIterated = linkable.next;
			Linkable linkable_11_ = linkable;
			return linkable_11_;
		}
		while (bucketCount > currentBucket) {
			Linkable linkable = buckets[currentBucket++].next;
			if (buckets[currentBucket - 1] != linkable) {
				lastIterated = linkable.next;
				return linkable;
			}
		}
		return null;
	}

	public Linkable getLastRetrieved() {
		if (lastRetrieved == null) {
			return null;
		}
		for (Linkable linkable = buckets[(int) (lastKey
				& (long) (-1 + bucketCount))]; linkable != lastRetrieved; lastRetrieved = lastRetrieved.next) {
			if (lastKey == lastRetrieved.key) {
				Linkable tmp = lastRetrieved;
				lastRetrieved = lastRetrieved.next;
				return tmp;
			}
		}
		lastRetrieved = null;
		return null;
	}

	public void put(long l, Linkable linkable) {
		if (linkable.previous != null)
			linkable.unlink();
		Linkable linkable_4_ = buckets[(int) (l & (long) (bucketCount - 1))];
		linkable.key = l;
		linkable.previous = linkable_4_.previous;
		linkable.next = linkable_4_;
		linkable.previous.next = linkable;
		linkable.next.previous = linkable;
	}

	public int size() {
		int i_0_ = 0;
		for (int i_1_ = 0; bucketCount > i_1_; i_1_++) {
			Linkable linkable = buckets[i_1_];
			for (Linkable linkable_2_ = linkable.next; linkable_2_ != linkable; linkable_2_ = linkable_2_.next)
				i_0_++;
		}
		int i_3_ = i_0_;
		return i_3_;
	}

	public int toArray(Linkable[] linkables) {
		int i_18_ = 0;
		for (int i_19_ = 0; bucketCount > i_19_; i_19_++) {
			Linkable linkable = buckets[i_19_];
			for (Linkable linkable_20_ = linkable.next; linkable_20_ != linkable; linkable_20_ = linkable_20_.next)
				linkables[i_18_++] = linkable_20_;
		}
		int i_21_ = i_18_;
		return i_21_;
	}
}
