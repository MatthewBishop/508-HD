/* Class99 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

import com.jagex.StringConstants;

public abstract class Timer {
	public abstract int method1501(int i, int i_50_);

	public abstract void reset();

	public static Timer create() {
		do {
			Timer timer;
			try {
				timer = (Timer) Class.forName(StringConstants.NANO_TIMER).newInstance();
			} catch (Throwable throwable) {
				break;
			}
			return timer;
		} while (false);
		return null;
	}
}
