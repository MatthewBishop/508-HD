/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link.ref;

import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.Queue;

import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Static;

public class SoftCache {

	private static ReferenceFactory referenceFactory = create();
	
	public static void dispose() {
		referenceFactory = null;
	}

	private static ReferenceFactory create() {
		ReferenceFactory referenceFactory;
		try {
			referenceFactory = (ReferenceFactory) Class.forName("com.jagex.link.ref.SoftReferenceFactory").newInstance();
		} catch (Throwable throwable) {
			return null;
		}
		return referenceFactory;
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
		history.method1395();
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
		HardReferenceWrapper class14_sub2_sub18_sub2 = new HardReferenceWrapper(object);
		table.put(l, class14_sub2_sub18_sub2);
		history.push(class14_sub2_sub18_sub2);
		class14_sub2_sub18_sub2.keyCacheable = 0L;
	}

	public void method1208(int i_8_) {
		if (SoftCache.referenceFactory != null) {
			for (ReferenceWrapper class14_sub2_sub18 = (ReferenceWrapper) history.method1400(); class14_sub2_sub18 != null; class14_sub2_sub18 = ((ReferenceWrapper) history
							.method1402())) {
				if (!class14_sub2_sub18.isSoft()) {
					if ((long) i_8_ < ++class14_sub2_sub18.keyCacheable) {
						ReferenceWrapper class14_sub2_sub18_9_ = SoftCache.referenceFactory
								.wrapReference(class14_sub2_sub18);
						table.put(class14_sub2_sub18.key, class14_sub2_sub18_9_);
						Cacheable.method301(class14_sub2_sub18, class14_sub2_sub18_9_);
						class14_sub2_sub18.unlink();
						class14_sub2_sub18.unlinkCacheable();
					}
				} else if (class14_sub2_sub18.getReference() == null) {
					class14_sub2_sub18.unlink();
					class14_sub2_sub18.unlinkCacheable();
					unused++;
				}
			}
		}
	}

	public void method1209() {
		ReferenceWrapper class14_sub2_sub18 = (ReferenceWrapper) history.method1400();
		for (/**/; class14_sub2_sub18 != null; class14_sub2_sub18 = (ReferenceWrapper) history
				.method1402()) {
			if (class14_sub2_sub18.isSoft()) {
				class14_sub2_sub18.unlink();
				class14_sub2_sub18.unlinkCacheable();
				unused++;
			}
		}
	}

	public Object method1210(long l) {
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
