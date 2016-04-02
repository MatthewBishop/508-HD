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
}
