/* Class126_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

import java.nio.ByteBuffer;

public class ByteArrayWrapper extends DataWrapper {
	private ByteBuffer buffer;

	@Override
	public void put(byte[] is) {
		buffer = ByteBuffer.allocateDirect(is.length);
		buffer.position(0);
		buffer.put(is);
	}

	@Override
	public byte[] get() {
		byte[] is = new byte[buffer.capacity()];
		buffer.position(0);
		buffer.get(is);
		return is;
	}
}
