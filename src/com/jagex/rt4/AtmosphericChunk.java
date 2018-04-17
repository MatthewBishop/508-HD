package com.jagex.rt4;

import com.jagex.io.Buffer;

public class AtmosphericChunk {

	public float lightModelAmbient;
	public float light1Diffuse;
	public float light0Diffuse;
	public int lightX;
	public int screenColorRgb;

	public int lightZ;

	public int fogColorRgb;

	public int lightY;

	public int fogDepth;

	public AtmosphericChunk() {
		this.lightY = -60;
		this.light1Diffuse = 1.2F;
		this.light0Diffuse = 0.69921875F;
		this.fogDepth = 0;
		this.lightZ = -50;
		this.screenColorRgb = AtmosphericEffects.defaultSunColour;
		this.lightModelAmbient = 1.1523438F;
		this.fogColorRgb = AtmosphericEffects.defaultFogColour;
		this.lightX = -50;
	}

	public AtmosphericChunk(Buffer var1) {
		int var2 = var1.readUByte();
		if ((var2 & 1) == 0) {
			this.screenColorRgb = AtmosphericEffects.defaultSunColour;
		} else {
			this.screenColorRgb = var1.getInt((byte) -97);
		}

		if ((var2 & 2) == 0) {
			this.lightModelAmbient = 1.1523438F;
		} else {
			this.lightModelAmbient = (float) var1.readUShort() / 256.0F;
		}

		if ((var2 & 4) != 0) {
			this.light0Diffuse = (float) var1.readUShort() / 256.0F;
		} else {
			this.light0Diffuse = 0.69921875F;
		}

		if ((var2 & 8) == 0) {
			this.light1Diffuse = 1.2F;
		} else {
			this.light1Diffuse = (float) var1.readUShort() / 256.0F;
		}

		if ((var2 & 16) != 0) {
			this.lightX = var1.method805(0);
			this.lightY = var1.method805(0);
			this.lightZ = var1.method805(0);
		} else {
			this.lightY = -60;
			this.lightZ = -50;
			this.lightX = -50;
		}

		if ((var2 & 32) == 0) {
			this.fogColorRgb = AtmosphericEffects.defaultFogColour;
		} else {
			this.fogColorRgb = var1.getInt((byte) -96);
		}

		if ((var2 & 64) == 0) {
			this.fogDepth = 0;
		} else {
			this.fogDepth = var1.readUShort();
		}

	}
}
