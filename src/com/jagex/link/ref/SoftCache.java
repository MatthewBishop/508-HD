/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link.ref;

import com.jagex.StringConstants;
import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.Queue;

public class SoftCache {

	private static ReferenceFactory referenceFactory = create();
	
	public static void dispose() {
		referenceFactory = null;
	}

	private static ReferenceFactory create() {
		ReferenceFactory referenceFactory;
		try {
			referenceFactory = (ReferenceFactory) Class.forName(StringConstants.SOFT_REFERENCE_FACTORY).newInstance();
		} catch (Throwable throwable) {
			return null;
		}
		return referenceFactory;
	}
	
	private static void insert(Cacheable afterThis, Cacheable toInsert) {
		if (toInsert.previousCacheable != null)
			toInsert.unlinkCacheable();
		toInsert.previousCacheable = afterThis;
		toInsert.nextCacheable = afterThis.nextCacheable;
		toInsert.previousCacheable.nextCacheable = toInsert;
		toInsert.nextCacheable.previousCacheable = toInsert;
	}
	
	public HashTable table;

	public Queue history = new Queue();

	public int capacity;

	public int unused;


	public SoftCache(int count) {
		unused = count;
		capacity = count;
		int size;
		for (size = 1; size + size < count; size += size) {
			/* empty */
		}
		table = new HashTable(size);
	}

	public void clear() {
		history.clear();
		table.clear();
		unused = capacity;
	}

	public void remove(long l) {
		ReferenceWrapper ref = (ReferenceWrapper) table.get(l);
		if (ref != null) {
			ref.unlink();
			ref.unlinkCacheable();
			unused++;
		}
	}

	public void put(Object object, long l) {
		remove(l);
		if (unused == 0) {
			ReferenceWrapper class14_sub2_sub18 = (ReferenceWrapper) history.pop();
			class14_sub2_sub18.unlink();
			class14_sub2_sub18.unlinkCacheable();
		} else
			unused--;
		HardReferenceWrapper hard = new HardReferenceWrapper(object);
		table.put(l, hard);
		history.push(hard);
		hard.keyCacheable = 0L;
	}

	public void method1208(int id) {
		if (SoftCache.referenceFactory != null) {
			for (ReferenceWrapper ref = (ReferenceWrapper) history.peek(); ref != null; ref = ((ReferenceWrapper) history
							.getNext())) {
				if (!ref.isSoft()) {
					if ((long) id < ++ref.keyCacheable) {
						ReferenceWrapper soft = SoftCache.referenceFactory
								.wrapReference(ref);
						table.put(ref.key, soft);
						SoftCache.insert(ref, soft);
						ref.unlink();
						ref.unlinkCacheable();
					}
				} else if (ref.getReference() == null) {
					ref.unlink();
					ref.unlinkCacheable();
					unused++;
				}
			}
		}
	}

	public void clearSoftReference() {
		ReferenceWrapper class14_sub2_sub18 = (ReferenceWrapper) history.peek();
		for (/**/; class14_sub2_sub18 != null; class14_sub2_sub18 = (ReferenceWrapper) history
				.getNext()) {
			if (class14_sub2_sub18.isSoft()) {
				class14_sub2_sub18.unlink();
				class14_sub2_sub18.unlinkCacheable();
				unused++;
			}
		}
	}

	public Object get(long l) {
		ReferenceWrapper ref = (ReferenceWrapper) table.get(l);
		if (ref == null) {
			return null;
		}
		Object object = ref.getReference();
		if (object == null) {
			ref.unlink();
			ref.unlinkCacheable();
			unused++;
			return null;
		}
		if (!ref.isSoft()) {
			history.push(ref);
			ref.keyCacheable = 0L;
		} else {
			HardReferenceWrapper hard = new HardReferenceWrapper(object);
			table.put(ref.key, hard);
			history.push(hard);
			hard.keyCacheable = 0L;
			ref.unlink();
			ref.unlinkCacheable();
		}
		return object;
	}

}
