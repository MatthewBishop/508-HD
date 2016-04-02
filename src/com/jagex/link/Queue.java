/* Class81 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Queue {
	public Cacheable aClass14_Sub2_1323 = new Cacheable();

	public Cacheable aClass14_Sub2_1325;

	public Queue() {
		aClass14_Sub2_1323.previousCacheable = aClass14_Sub2_1323;
		aClass14_Sub2_1323.nextCacheable = aClass14_Sub2_1323;
	}

	public void method1394(Cacheable cacheable) {
		if (cacheable.previousCacheable != null)
			cacheable.unlinkCacheable();
		cacheable.previousCacheable = aClass14_Sub2_1323;
		cacheable.nextCacheable = aClass14_Sub2_1323.nextCacheable;
		cacheable.previousCacheable.nextCacheable = cacheable;
		cacheable.nextCacheable.previousCacheable = cacheable;
	}

	public void method1395() {
		for (;;) {
			Cacheable cacheable = aClass14_Sub2_1323.nextCacheable;
			if (aClass14_Sub2_1323 == cacheable)
				break;
			cacheable.unlinkCacheable();
		}
		aClass14_Sub2_1325 = null;
	}

	public Cacheable pop() {
		Cacheable cacheable = aClass14_Sub2_1323.nextCacheable;
		if (aClass14_Sub2_1323 == cacheable) {
			Cacheable cacheable_3_ = null;
			return cacheable_3_;
		}
		cacheable.unlinkCacheable();
		Cacheable cacheable_4_ = cacheable;
		return cacheable_4_;
	}

	public Cacheable method1400() {
		Cacheable cacheable = aClass14_Sub2_1323.nextCacheable;
		if (cacheable == aClass14_Sub2_1323) {
			aClass14_Sub2_1325 = null;
			Cacheable cacheable_149_ = null;
			return cacheable_149_;
		}
		aClass14_Sub2_1325 = cacheable.nextCacheable;
		Cacheable cacheable_150_ = cacheable;
		return cacheable_150_;
	}

	public void push(Cacheable cacheable) {
		if (cacheable.previousCacheable != null)
			cacheable.unlinkCacheable();
		cacheable.previousCacheable = aClass14_Sub2_1323.previousCacheable;
		cacheable.nextCacheable = aClass14_Sub2_1323;
		cacheable.previousCacheable.nextCacheable = cacheable;
		cacheable.nextCacheable.previousCacheable = cacheable;
	}

	public Cacheable method1402() {
		Cacheable cacheable = aClass14_Sub2_1325;
		if (cacheable == aClass14_Sub2_1323) {
			aClass14_Sub2_1325 = null;
			Cacheable cacheable_151_ = null;
			return cacheable_151_;
		}
		aClass14_Sub2_1325 = cacheable.nextCacheable;
		Cacheable cacheable_152_ = cacheable;
		return cacheable_152_;
	}
}
