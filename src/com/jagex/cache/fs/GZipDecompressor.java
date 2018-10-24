/* Class49 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.fs;

import java.util.zip.Inflater;

import com.jagex.io.Buffer;

public class GZipDecompressor {
	private Inflater inflater;

	public GZipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	public GZipDecompressor(int i, int i_18_, int i_19_) {
		/* empty */
	}

	public void decompress(byte[] is, Buffer class14_sub10) {
		if (class14_sub10.payload[class14_sub10.position] != 31
				|| (class14_sub10.payload[class14_sub10.position + 1] != -117))
			throw new RuntimeException("Invalid GZIP header!");
		if (inflater == null)
			inflater = new Inflater(true);
		try {
			inflater.setInput(class14_sub10.payload, class14_sub10.position + 10,
					(class14_sub10.payload.length - (class14_sub10.position + 10 + 8)));
			inflater.inflate(is);
		} catch (Exception exception) {
			inflater.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		inflater.reset();
	}
}
