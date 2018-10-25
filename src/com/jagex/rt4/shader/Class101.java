/* Class101 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.shader;

import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

public class Class101 implements ShaderInterface {
	
	public void disable() {
		if (RT4.useLighting)
			RT4GL.setLightingEnabled(true);
	}

	public void setup(int i) {
		/* empty */
	}

	public int getTextureParameters() {
		return 0;
	}

	public void enable() {
		if (RT4.useLighting)
			RT4GL.setLightingEnabled(false);
	}
}
