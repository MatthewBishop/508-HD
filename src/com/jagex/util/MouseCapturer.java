/* Class100 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

import rs.Class107;
import rs.tex.Class14_Sub8_Sub33;

public class MouseCapturer implements Runnable {
	public boolean running = true;

	public int capturedCoordinateCount;

	public int[] coordinatesY = new int[500];

	public int[] coordinatesX = new int[500];

	public Object synchronizedObject = new Object();

	public MouseCapturer() {
		capturedCoordinateCount = 0;
	}

	public void run() {
		while (running) {
			Object object = synchronizedObject;
			synchronized (object) {
				if (capturedCoordinateCount < 500) {
					coordinatesX[capturedCoordinateCount] = Class14_Sub8_Sub33.anInt4640;
					coordinatesY[capturedCoordinateCount] = Class107.anInt1804;
					capturedCoordinateCount++;
				}
			}
			Util.sleep(50L);
		}
	}
}
