/* Class91 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;

import rs.Class14_Sub12_Sub1;

public class Track {
	
	public static Track method1451(Class9 class9, int i, int i_11_) {
		byte[] is = class9.method163(i_11_, i, 0);
		if (is == null)
			return null;
		return new Track(new Buffer(is));
	}
	
	public Synthesizer[] synthesizers;
	public int loopStart;

	public int loopEnd;

	public Track() {
		synthesizers = new Synthesizer[10];
	}

	public Track(Buffer class14_sub10) {
		synthesizers = new Synthesizer[10];
		for (int i = 0; i < 10; i++) {
			int i_10_ = class14_sub10.readUByte();
			if (i_10_ != 0) {
				class14_sub10.position--;
				synthesizers[i] = new Synthesizer();
				synthesizers[i].decode(class14_sub10);
			}
		}
		loopStart = class14_sub10.readUShort((byte) 101);
		loopEnd = class14_sub10.readUShort((byte) 105);
	}

	private byte[] method1448() {
		int i = 0;
		for (int i_0_ = 0; i_0_ < 10; i_0_++) {
			if (synthesizers[i_0_] != null
					&& (synthesizers[i_0_].duration + synthesizers[i_0_].offset) > i)
				i = (synthesizers[i_0_].duration + synthesizers[i_0_].offset);
		}
		if (i == 0)
			return new byte[0];
		int i_1_ = i * 22050 / 1000;
		byte[] is = new byte[i_1_];
		for (int i_2_ = 0; i_2_ < 10; i_2_++) {
			if (synthesizers[i_2_] != null) {
				int i_3_ = synthesizers[i_2_].duration * 22050 / 1000;
				int i_4_ = synthesizers[i_2_].offset * 22050 / 1000;
				int[] is_5_ = synthesizers[i_2_].synthesize(i_3_, (synthesizers[i_2_].duration));
				for (int i_6_ = 0; i_6_ < i_3_; i_6_++) {
					int i_7_ = is[i_6_ + i_4_] + (is_5_[i_6_] >> 8);
					if ((i_7_ + 128 & ~0xff) != 0)
						i_7_ = i_7_ >> 31 ^ 0x7f;
					is[i_6_ + i_4_] = (byte) i_7_;
				}
			}
		}
		return is;
	}

	public Class14_Sub12_Sub1 method1449() {
		byte[] is = method1448();
		return new Class14_Sub12_Sub1(22050, is, loopStart * 22050 / 1000, loopEnd * 22050 / 1000);
	}

	public int method1450() {
		int i = 9999999;
		for (int i_8_ = 0; i_8_ < 10; i_8_++) {
			if (synthesizers[i_8_] != null && synthesizers[i_8_].offset / 20 < i)
				i = synthesizers[i_8_].offset / 20;
		}
		if (loopStart < loopEnd && loopStart / 20 < i)
			i = loopStart / 20;
		if (i == 9999999 || i == 0)
			return 0;
		for (int i_9_ = 0; i_9_ < 10; i_9_++) {
			if (synthesizers[i_9_] != null)
				synthesizers[i_9_].offset -= i * 20;
		}
		if (loopStart < loopEnd) {
			loopStart -= i * 20;
			loopEnd -= i * 20;
		}
		return i;
	}
}
