package com.jagex.util;

public class Util {

	public static void method1742(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static void sleep(long l) {
		if (l > 0L) {
			if (0L != l % 10L)
				method1742(l);
			else {
				method1742(l - 1L);
				method1742(1L);
			}
		}
	}

}
