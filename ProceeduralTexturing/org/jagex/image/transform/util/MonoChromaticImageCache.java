/* Class149 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.util;

import org.jagex.image.transform.TexStatic;

import com.jagex.link.Deque;

public class MonoChromaticImageCache {
	public boolean empty;
	private MonoChromaticImageBuffer[] buffers;
	private Deque deque;
	private int texelSize;
	private int anInt2392 = 0;
	private int bufferSize;

	private int anInt2399 = -1;

	private int[][] texels;

	public MonoChromaticImageCache(int i, int size, int i_6_) {
		deque = new Deque();
		empty = false;
		texelSize = i;
		texels = new int[texelSize][i_6_];
		this.bufferSize = size;
		buffers = new MonoChromaticImageBuffer[this.bufferSize];
	}

	public int[] method2014(int i) {
		if (bufferSize != texelSize) {
			if (texelSize == 1) {
				empty = anInt2399 != i;
				anInt2399 = i;
				int[] is = texels[0];
				return is;
			}
			MonoChromaticImageBuffer buffer = buffers[i];
			if (buffer == null) {
				empty = true;
				if (texelSize <= anInt2392) {
					MonoChromaticImageBuffer tail = (MonoChromaticImageBuffer) deque.getTail();
					buffer = new MonoChromaticImageBuffer(i, tail.anInt2813);
					buffers[tail.anInt2814] = null;
					tail.unlink();
				} else {
					buffer = new MonoChromaticImageBuffer(i, anInt2392);
					anInt2392++;
				}
				buffers[i] = buffer;
			} else
				empty = false;
			deque.pushFront(buffer);
			int[] is = texels[buffer.anInt2813];
			return is;
		}
		empty = buffers[i] == null;
		buffers[i] = TexStatic.EMPTY_MONO_CACHE;
		int[] is = texels[i];
		return is;
	}

	public void method2015() {
		for (int i_2_ = 0; texelSize > i_2_; i_2_++)
			texels[i_2_] = null;
		buffers = null;
		texels = null;
		deque.clear();
		deque = null;
	}

	public int[][] method2019() {
		if (texelSize != bufferSize)
			throw new RuntimeException("Can only retrieve a full image cache");
		for (int i = 0; i < texelSize; i++)
			buffers[i] = TexStatic.EMPTY_MONO_CACHE;
		int[][] is = texels;
		return is;
	}
}
