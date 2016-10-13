/* Class14_Sub8_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub10 extends Class14_Sub8 {
	public int anInt4254 = 2048;

	public int anInt4258 = 10;

	public int anInt4263 = 0;

	public int[] anIntArray4252;

	public int[] anIntArray4253;

	public Class14_Sub8_Sub10() {
		super(0, true);
	}

	@Override
	public void method472() {
		method529(255);
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_13_ = i;
		while_88_: do {
			do {
				if (i_13_ != 0) {
					if (i_13_ != 1) {
						if (i_13_ == 2)
							break;
						break while_88_;
					}
				} else {
					anInt4258 = class14_sub10.readUByte();
					break while_88_;
				}
				anInt4254 = class14_sub10.readUShort((byte) 124);
				break while_88_;
			} while (false);
			anInt4263 = class14_sub10.readUByte();
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		if (aClass149_2851.aBoolean2402) {
			int i_15_ = TexStatic.anIntArray3623[i];
			if (anInt4263 == 0) {
				int i_16_ = 0;
				for (int i_17_ = 0; i_17_ < anInt4258; i_17_++) {
					if (i_15_ >= anIntArray4253[i_17_] && i_15_ < anIntArray4253[i_17_ + 1]) {
						if (anIntArray4252[i_17_] > i_15_)
							i_16_ = 4096;
						break;
					}
				}
				TexStatic.method1324(is, 0, TexStatic.anInt1876, i_16_);
			} else {
				for (int i_18_ = 0; TexStatic.anInt1876 > i_18_; i_18_++) {
					int i_19_ = 0;
					int i_20_ = 0;
					int i_21_ = TexStatic.anIntArray4145[i_18_];
					int i_22_ = anInt4263;
					while_89_: do {
						do {
							if (i_22_ != 1) {
								if (i_22_ != 2) {
									if (i_22_ == 3)
										break;
									break while_89_;
								}
							} else {
								i_19_ = i_21_;
								break while_89_;
							}
							i_19_ = (i_21_ - (4096 - i_15_) >> 1) + 2048;
							break while_89_;
						} while (false);
						i_19_ = (-i_15_ + i_21_ >> 1) + 2048;
					} while (false);
					for (i_22_ = 0; anInt4258 > i_22_; i_22_++) {
						if (i_19_ >= anIntArray4253[i_22_] && i_19_ < anIntArray4253[i_22_ + 1]) {
							if (i_19_ < anIntArray4252[i_22_])
								i_20_ = 4096;
							break;
						}
					}
					is[i_18_] = i_20_;
				}
			}
		}
		int[] is_23_ = is;
		return is_23_;
	}

	public void method529(int i) {
		if (i == 255) {
			anIntArray4253 = new int[anInt4258 + 1];
			int i_24_ = 4096 / anInt4258;
			int i_25_ = 0;
			anIntArray4252 = new int[anInt4258 + 1];
			int i_26_ = anInt4254 * i_24_ >> 44;
			for (int i_27_ = 0; anInt4258 > i_27_; i_27_++) {
				anIntArray4253[i_27_] = i_25_;
				anIntArray4252[i_27_] = i_26_ + i_25_;
				i_25_ += i_24_;
			}
			anIntArray4253[anInt4258] = 4096;
			anIntArray4252[anInt4258] = anIntArray4252[0] + 4096;
		}
	}
}
