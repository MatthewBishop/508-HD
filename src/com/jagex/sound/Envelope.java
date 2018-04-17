/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

import com.jagex.io.Buffer;

public class Envelope {
	public int form;
	public int[] durations;
	public int segments = 2;
	public int start;
	public int[] peaks;
	public int end;
	public int segmentIndex;
	public int amplitude;
	public int ticks;
	public int threshold;
	public int step;

	public void reset() {
		threshold = 0;
		segmentIndex = 0;
		step = 0;
		amplitude = 0;
		ticks = 0;
	}

	public int step(int i) {
		if (ticks >= threshold) {
			amplitude = peaks[segmentIndex++] << 15;
			if (segmentIndex >= segments)
				segmentIndex = segments - 1;
			threshold = (int) ((double) durations[segmentIndex] / 65536.0 * (double) i);
			if (threshold > ticks)
				step = (((peaks[segmentIndex] << 15) - amplitude) / (threshold - ticks));
		}
		amplitude += step;
		ticks++;
		return amplitude - step >> 15;
	}

	public void decodeSegments(Buffer class14_sub10) {
		segments = class14_sub10.readUByte();
		durations = new int[segments];
		peaks = new int[segments];
		for (int i = 0; i < segments; i++) {
			durations[i] = class14_sub10.readUShort();
			peaks[i] = class14_sub10.readUShort();
		}
	}

	public void decode(Buffer class14_sub10) {
		form = class14_sub10.readUByte();
		start = class14_sub10.getInt((byte) -98);
		end = class14_sub10.getInt((byte) -90);
		decodeSegments(class14_sub10);
	}

	public Envelope() {
		durations = new int[2];
		peaks = new int[2];
		durations[0] = 0;
		durations[1] = 65535;
		peaks[0] = 0;
		peaks[1] = 65535;
	}
}
