package com.jagex.io.js5;

import com.jagex.link.Deque;
import com.jagex.util.Util;

import rs.Class138;
import rs.Class14_Sub9_Sub3;
import rs.JunkTex;

public class Class24 implements Runnable {

	public void run() {
		try {
			try {
				while (true) {
					Deque var1 = SFSS.aClass2_4404;
					Deque var2 = SFSS.aClass2_4404;
					Class14_Sub19 var3;
					synchronized (var2) {
						var3 = (Class14_Sub19) SFSS.aClass2_4404.getFront();
					}

					Object var4;
					Object var12;
					if (var3 != null) {
						Deque var13;
						if (var3.anInt3067 != 0) {
							if (var3.anInt3067 == 1) {
								var3.aByteArray3069 = var3.aClass114_3077.method1582(124, (int) var3.key);
								var1 = SFSS.aClass2_4404;
								var13 = SFSS.aClass2_4404;
								synchronized (var13) {
									JunkTex.aClass2_99.pushBack(var3);
								}
							}
						} else {
							var3.aClass114_3077.method1583((int) var3.key, var3.aByteArray3069, -1,
									var3.aByteArray3069.length);
							var1 = SFSS.aClass2_4404;
							var13 = SFSS.aClass2_4404;
							synchronized (var13) {
								var3.unlink();
							}
						}

						var12 = JunkTex.anObject4417;
						var4 = JunkTex.anObject4417;
						synchronized (var4) {
							if (Class138.anInt2223 <= 1) {
								Class138.anInt2223 = 0;
								JunkTex.anObject4417.notifyAll();
								return;
							}

							Class138.anInt2223 = 600;
						}
					} else {
						Util.sleep(100L);
						var12 = JunkTex.anObject4417;
						var4 = JunkTex.anObject4417;
						synchronized (var4) {
							if (Class138.anInt2223 <= 1) {
								Class138.anInt2223 = 0;
								JunkTex.anObject4417.notifyAll();
								return;
							}

							--Class138.anInt2223;
						}
					}
				}
			} catch (Exception var10) {
				Class14_Sub9_Sub3.method738((String) null, var10, 95);
			}
		} catch (RuntimeException var11) {
			throw Util.error(var11, "ck.run()");
		}
	}
}
