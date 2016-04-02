/* Cacheable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Cacheable extends Linkable {
	public Cacheable previousCacheable;
	public Cacheable nextCacheable;
	public long keyCacheable;

	public void unlinkCacheable() {
		if (previousCacheable != null) {
			previousCacheable.nextCacheable = nextCacheable;
			nextCacheable.previousCacheable = previousCacheable;
			nextCacheable = null;
			previousCacheable = null;
		}
	}

	public static void method301(Cacheable cacheable, Cacheable cacheable_0_) {
		if (cacheable_0_.previousCacheable != null)
			cacheable_0_.unlinkCacheable();
		cacheable_0_.previousCacheable = cacheable;
		cacheable_0_.nextCacheable = cacheable.nextCacheable;
		cacheable_0_.previousCacheable.nextCacheable = cacheable_0_;
		cacheable_0_.nextCacheable.previousCacheable = cacheable_0_;
	}
}
