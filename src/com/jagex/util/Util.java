package com.jagex.util;

import com.jagex.StringConstants;

public class Util {

	public static void sleep(long l) {
		try {
			Thread.sleep(l);
		} catch (InterruptedException interruptedexception) {
			/* empty */
		}
	}

	public static void accuratesleep(long l) {
		if (l > 0L) {
			if (0L != l % 10L)
				sleep(l);
			else {
				sleep(l - 1L);
				sleep(1L);
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

	public static AbstractMouseWheelHandler createMouseWheelHandler() {
		AbstractMouseWheelHandler abstractMouseWheelHandler;
		try {
			abstractMouseWheelHandler = (AbstractMouseWheelHandler) Class.forName(StringConstants.CLASS129_SUB1).newInstance();
		} catch (Throwable throwable) {
			AbstractMouseWheelHandler abstractMouseWheelHandler_132_ = null;
			return abstractMouseWheelHandler_132_;
		}
		return abstractMouseWheelHandler;
	}

}
