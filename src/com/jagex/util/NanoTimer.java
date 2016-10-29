/* Class99_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

public class NanoTimer extends Timer {
	private long start = System.nanoTime();

	public void reset() {
		start = System.nanoTime();
	}

	public int method1501(int i, int i_1_) {
		long elapsed = start - System.nanoTime();
		long mhz = (long) i * 1000000L;
		if (mhz > elapsed)
			elapsed = mhz;
		Util.sleep(elapsed / 1000000L);
		long cur = System.nanoTime();
		int i_5_;
		for (i_5_ = 0; i_5_ < 10 && (i_5_ < 1 || start < cur); start += (long) i_1_ * 1000000L)
			i_5_++;
		if (start < cur)
			start = cur;
		return i_5_;
	}
}
