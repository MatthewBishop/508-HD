package com.jagex.io.js5;

import com.jagex.applet.ErrorReporting;
import com.jagex.link.Deque;
import com.jagex.util.Util;

public class UpdateServerThread implements Runnable {

	public void run() {
		try {
			try {
				while (true) {
					Deque var1 = SFSS.aClass2_4404;
					Deque var2 = SFSS.aClass2_4404;
					UpdateServerNode var3;
					synchronized (var2) {
						var3 = (UpdateServerNode) SFSS.aClass2_4404.getFront();
					}

					Object var4;
					Object var12;
					if (var3 != null) {
						Deque var13;
						if (var3.anInt3067 != 0) {
							if (var3.anInt3067 == 1) {
								var3.data = var3.cache.method1582(124, (int) var3.key);
								var1 = SFSS.aClass2_4404;
								var13 = SFSS.aClass2_4404;
								synchronized (var13) {
									SFSS.aClass2_99.pushBack(var3);
								}
							}
						} else {
							var3.cache.method1583((int) var3.key, var3.data, -1,
									var3.data.length);
							var1 = SFSS.aClass2_4404;
							var13 = SFSS.aClass2_4404;
							synchronized (var13) {
								var3.unlink();
							}
						}

						var12 = SFSS.anObject4417;
						var4 = SFSS.anObject4417;
						synchronized (var4) {
							if (SFSS.anInt2223 <= 1) {
								SFSS.anInt2223 = 0;
								SFSS.anObject4417.notifyAll();
								return;
							}

							SFSS.anInt2223 = 600;
						}
					} else {
						Util.accuratesleep(100L);
						var12 = SFSS.anObject4417;
						var4 = SFSS.anObject4417;
						synchronized (var4) {
							if (SFSS.anInt2223 <= 1) {
								SFSS.anInt2223 = 0;
								SFSS.anObject4417.notifyAll();
								return;
							}

							--SFSS.anInt2223;
						}
					}
				}
			} catch (Exception var10) {
				ErrorReporting.method738((String) null, var10, 95);
			}
		} catch (RuntimeException var11) {
			throw Util.error(var11, "ck.run()");
		}
	}
}
