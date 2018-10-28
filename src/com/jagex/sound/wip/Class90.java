/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.applet.Class43;
import com.jagex.applet.ErrorReporting;
import com.jagex.util.Util;

public class Class90 implements Runnable {
	public volatile boolean aBoolean1419 = false;

	public volatile boolean aBoolean1428 = false;

	public Class43 aClass43_1421;

	public volatile Class75[] aClass75Array1422 = new Class75[2];

	public void run() {
		aBoolean1419 = true;
		while_216_: do {
			do {
				try {
					try {
						while (!aBoolean1428) {
							for (int i = 0; i < 2; i++) {
								Class75 class75 = aClass75Array1422[i];
								if (class75 != null)
									class75.method1341();
							}
							Util.accuratesleep(10L);
							ErrorReporting.method555(45, aClass43_1421, null);
						}
					} catch (Exception exception) {
						try {
							Throwable throwable = new Throwable();
							ErrorReporting.method738(null, throwable, 95);
						} catch (Throwable throwable) {
							RuntimeException runtimeexception = new RuntimeException();
							aBoolean1419 = false;
							throw runtimeexception;
						}
						aBoolean1419 = false;
						break;
					}
					break while_216_;
				} catch (Throwable throwable) {
					break while_216_;
				}
			} while (false);
			return;
		} while (false);
		aBoolean1419 = false;
	}
}
