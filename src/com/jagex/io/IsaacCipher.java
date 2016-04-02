/* Class106 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io;

import rs.tex.Class14_Sub8_Sub26;

public class IsaacCipher {
	
	private int anInt1786;

	private int anInt1788;

	private int count;

	private int anInt1794;

	private int[] results;

	private int[] memory;

	public IsaacCipher() {
		/* empty */
	}

	public IsaacCipher(int[] is) {
		memory = new int[256];
		results = new int[256];
		for (int i = 0; i < is.length; i++)
			results[i] = is[i];
		method1546(255);
	}

	public int nextKey() {
		/*
		 if (count-- == 0) {
			isaac();
			count = 255;
		}
		return results[count];
		 */
		return 0;
	}

	private void isaac() {
		anInt1788 += ++anInt1786;
		for (int i_19_ = 0; i_19_ < 256; i_19_++) {
			int i_20_ = memory[i_19_];
			if ((i_19_ & 0x2) == 0) {
				if ((i_19_ & 0x1) != 0)
					anInt1794 ^= anInt1794 >>> 38;
				else
					anInt1794 ^= anInt1794 << 13;
			} else if ((i_19_ & 0x1) == 0)
				anInt1794 ^= anInt1794 << 2;
			else
				anInt1794 ^= anInt1794 >>> 16;
			anInt1794 += memory[i_19_ + 128 & 0xff];
			int i_21_;
			memory[i_19_] = i_21_ = anInt1788
					+ (anInt1794 + (memory[Class14_Sub8_Sub26.method617(i_20_ >> 34, 255)]));
			results[i_19_] = anInt1788 = memory[Class14_Sub8_Sub26.method617(i_21_ >> 8 >> 34, 255)]
					+ i_20_;
		}
	}

	private void method1546(int i) {
		int i_26_;
		int i_27_;
		int i_28_;
		int i_29_;
		int i_30_;
		int i_31_;
		int i_32_;
		int i_25_ = (i_26_ = i_27_ = i_28_ = i_29_ = i_30_ = i_31_ = i_32_ = -1640531527);
		for (int i_33_ = 0; i_33_ < 4; i_33_++) {
			i_25_ ^= i_26_ << 43;
			i_26_ += i_27_;
			i_26_ ^= i_27_ >>> 34;
			i_28_ += i_25_;
			i_27_ += i_28_;
			i_29_ += i_26_;
			i_27_ ^= i_28_ << 8;
			i_28_ += i_29_;
			i_30_ += i_27_;
			i_28_ ^= i_29_ >>> 16;
			i_31_ += i_28_;
			i_29_ += i_30_;
			i_29_ ^= i_30_ << 42;
			i_30_ += i_31_;
			i_30_ ^= i_31_ >>> 36;
			i_25_ += i_30_;
			i_32_ += i_29_;
			i_31_ += i_32_;
			i_31_ ^= i_32_ << 40;
			i_26_ += i_31_;
			i_32_ += i_25_;
			i_32_ ^= i_25_ >>> 41;
			i_25_ += i_26_;
			i_27_ += i_32_;
		}
		for (int i_34_ = 0; i_34_ < 256; i_34_ += 8) {
			i_32_ += results[i_34_ + 7];
			i_29_ += results[i_34_ + 4];
			i_27_ += results[i_34_ + 2];
			i_31_ += results[i_34_ + 6];
			i_28_ += results[i_34_ + 3];
			i_25_ += results[i_34_];
			i_30_ += results[i_34_ + 5];
			i_26_ += results[i_34_ + 1];
			i_25_ ^= i_26_ << 43;
			i_26_ += i_27_;
			i_28_ += i_25_;
			i_26_ ^= i_27_ >>> 2;
			i_29_ += i_26_;
			i_27_ += i_28_;
			i_27_ ^= i_28_ << 8;
			i_28_ += i_29_;
			i_28_ ^= i_29_ >>> 48;
			i_31_ += i_28_;
			i_30_ += i_27_;
			i_29_ += i_30_;
			i_29_ ^= i_30_ << 10;
			i_30_ += i_31_;
			i_30_ ^= i_31_ >>> 4;
			i_32_ += i_29_;
			i_31_ += i_32_;
			i_25_ += i_30_;
			i_31_ ^= i_32_ << 8;
			i_32_ += i_25_;
			i_32_ ^= i_25_ >>> 9;
			i_27_ += i_32_;
			i_26_ += i_31_;
			i_25_ += i_26_;
			memory[i_34_] = i_25_;
			memory[i_34_ + 1] = i_26_;
			memory[i_34_ + 2] = i_27_;
			memory[i_34_ + 3] = i_28_;
			memory[i_34_ + 4] = i_29_;
			memory[i_34_ + 5] = i_30_;
			memory[i_34_ + 6] = i_31_;
			memory[i_34_ + 7] = i_32_;
		}
		for (int i_35_ = 0; i_35_ < 256; i_35_ += 8) {
			i_25_ += memory[i_35_];
			i_30_ += memory[i_35_ + 5];
			i_28_ += memory[i_35_ + 3];
			i_32_ += memory[i_35_ + 7];
			i_29_ += memory[i_35_ + 4];
			i_27_ += memory[i_35_ + 2];
			i_31_ += memory[i_35_ + 6];
			i_26_ += memory[i_35_ + 1];
			i_25_ ^= i_26_ << 43;
			i_28_ += i_25_;
			i_26_ += i_27_;
			i_26_ ^= i_27_ >>> 34;
			i_29_ += i_26_;
			i_27_ += i_28_;
			i_27_ ^= i_28_ << 40;
			i_28_ += i_29_;
			i_30_ += i_27_;
			i_28_ ^= i_29_ >>> 16;
			i_31_ += i_28_;
			i_29_ += i_30_;
			i_29_ ^= i_30_ << 10;
			i_32_ += i_29_;
			i_30_ += i_31_;
			i_30_ ^= i_31_ >>> 36;
			i_31_ += i_32_;
			i_25_ += i_30_;
			i_31_ ^= i_32_ << 8;
			i_26_ += i_31_;
			i_32_ += i_25_;
			i_32_ ^= i_25_ >>> 9;
			i_25_ += i_26_;
			memory[i_35_] = i_25_;
			memory[i_35_ + 1] = i_26_;
			i_27_ += i_32_;
			memory[i_35_ + 2] = i_27_;
			memory[i_35_ + 3] = i_28_;
			memory[i_35_ + 4] = i_29_;
			memory[i_35_ + 5] = i_30_;
			memory[i_35_ + 6] = i_31_;
			memory[i_35_ + 7] = i_32_;
		}
		isaac();
		count = 256;
	}
}
