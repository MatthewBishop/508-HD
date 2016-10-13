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

	public static RuntimeException_Sub1 error(Throwable throwable, String string) {
		RuntimeException_Sub1 runtimeexception_sub1;
		if (!(throwable instanceof RuntimeException_Sub1))
			runtimeexception_sub1 = new RuntimeException_Sub1(throwable, string);
		else {
			runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			StringBuffer stringbuffer = new StringBuffer();
			RuntimeException_Sub1 runtimeexception_sub1_9_ = runtimeexception_sub1;
			runtimeexception_sub1_9_.aString2457 = stringbuffer.append(runtimeexception_sub1_9_.aString2457).append(' ')
					.append(string).toString();
		}
		RuntimeException_Sub1 runtimeexception_sub1_10_ = runtimeexception_sub1;
		return runtimeexception_sub1_10_;
	}

}
