/* AnimFrameBase - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.anim;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

public class AnimFrameBase extends Linkable {
	public boolean[] aBooleanArray2791;

	public int anInt2805;

	public int count;

	public int[][] labels;

	public int[] transformationType;

	public AnimFrameBase(int i, byte[] is) {
		anInt2805 = i;
		Buffer class14_sub10 = new Buffer(is);
		count = class14_sub10.readUByte();
		labels = new int[count][];
		transformationType = new int[count];
		aBooleanArray2791 = new boolean[count];
		for (int i_59_ = 0; i_59_ < count; i_59_++)
			transformationType[i_59_] = class14_sub10.readUByte();
		for (int i_60_ = 0; i_60_ < count; i_60_++)
			aBooleanArray2791[i_60_] = class14_sub10.readUByte() == 1;
		for (int i_61_ = 0; i_61_ < count; i_61_++)
			labels[i_61_] = new int[class14_sub10.readUByte()];
		for (int i_62_ = 0; i_62_ < count; i_62_++) {
			for (int i_63_ = 0; i_63_ < labels[i_62_].length; i_63_++)
				labels[i_62_][i_63_] = class14_sub10.readUByte();
		}
	}
}
