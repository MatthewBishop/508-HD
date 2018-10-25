package com.jagex.util;

public class TimeUtil {

	public static synchronized long getTime() {
		long current = System.currentTimeMillis();
		if (current < TimeUtil.last)
			TimeUtil.timeDiff += -current + TimeUtil.last;
		TimeUtil.last = current;
		long l_8_ = TimeUtil.timeDiff + current;
		return l_8_;
	}

	private static long last;
	private static long timeDiff;

}
