/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

public class Class101 implements Interface2 {
	public void disable() {
		if (RT4.useLighting)
			Class121.method1639(true);
	}

	public void setup(int i) {
		/* empty */
	}

	public int getTextureParameters() {
		return 0;
	}

	public void enable() {
		if (RT4.useLighting)
			Class121.method1639(false);
	}
}
