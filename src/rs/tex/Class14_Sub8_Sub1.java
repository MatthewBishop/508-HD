/* Class14_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Random;

import com.jagex.io.Buffer;

import rs.Class138;

public class Class14_Sub8_Sub1 extends Class14_Sub8 {
	public int anInt4092;

	public int anInt4095 = 2000;

	public int anInt4097;

	public int anInt4103 = 0;

	public int anInt4106;

	public Class14_Sub8_Sub1() {
		super(0, true);
		anInt4092 = 4096;
		anInt4106 = 0;
		anInt4097 = 16;
	}

	@Override
	public void method472() {
		TexStatic.method321(256);
	}

	@Override
	public void method475(int i, int i_12_, Buffer class14_sub10) {
		int i_13_ = i;
		while_200_: do {
			while_199_: do {
				while_198_: do {
					do {
						if (i_13_ != 0) {
							if (i_13_ != 1) {
								if (i_13_ != 2) {
									if (i_13_ != 3) {
										if (i_13_ == 4)
											break while_199_;
										break while_200_;
									}
								} else
									break;
								break while_198_;
							}
						} else {
							anInt4106 = class14_sub10.readUByte();
							break while_200_;
						}
						anInt4095 = class14_sub10.readUShort((byte) 118);
						break while_200_;
					} while (false);
					anInt4097 = class14_sub10.readUByte();
					break while_200_;
				} while (false);
				anInt4103 = class14_sub10.readUShort((byte) 121);
				break while_200_;
			} while (false);
			anInt4092 = class14_sub10.readUShort((byte) 109);
		} while (false);
	}

	@Override
	public int[] method484(int i, byte i_14_) {
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_15_ = anInt4092 >> 1;
			int[][] is_16_ = aClass149_2851.method2019(true);
			Random random = new Random(anInt4106);
			for (int i_17_ = 0; i_17_ < anInt4095; i_17_++) {
				int i_18_ = (anInt4092 > 0 ? (anInt4103 - i_15_ + Class138.method1949(random, anInt4092))
						: anInt4103);
				int i_19_ = Class138.method1949(random, TexStatic.anInt1876);
				i_18_ = i_18_ >> 4 & 0xff;
				int i_20_ = Class138.method1949(random, TexStatic.anInt407);
				int i_21_ = i_19_ + (anInt4097 * TexStatic.anIntArray3357[i_18_] >> 12);
				int i_22_ = ((TexStatic.anIntArray4435[i_18_] * anInt4097 >> 12) + i_20_);
				int i_23_ = -i_20_ + i_22_;
				int i_24_ = i_21_ - i_19_;
				if (i_24_ != 0 || i_23_ != 0) {
					if (i_24_ < 0)
						i_24_ = -i_24_;
					if (i_23_ < 0)
						i_23_ = -i_23_;
					boolean bool = i_23_ > i_24_;
					if (bool) {
						int i_25_ = i_19_;
						i_19_ = i_20_;
						i_20_ = i_25_;
						int i_26_ = i_21_;
						i_21_ = i_22_;
						i_22_ = i_26_;
					}
					if (i_21_ < i_19_) {
						int i_27_ = i_19_;
						i_19_ = i_21_;
						i_21_ = i_27_;
						int i_28_ = i_20_;
						i_20_ = i_22_;
						i_22_ = i_28_;
					}
					int i_29_ = i_20_;
					int i_30_ = -i_19_ + i_21_;
					int i_31_ = i_22_ - i_20_;
					int i_32_ = (-(Class138.method1949(random, 4096) >> 2) + 1024);
					int i_33_ = i_22_ > i_20_ ? 1 : -1;
					int i_34_ = -i_30_ / 2;
					int i_35_ = 2048 / i_30_;
					if (i_31_ < 0)
						i_31_ = -i_31_;
					for (int i_36_ = i_19_; i_21_ > i_36_; i_36_++) {
						i_34_ += i_31_;
						int i_37_ = TexStatic.anInt4882 & i_36_;
						int i_38_ = i_32_ + ((-i_19_ + i_36_) * i_35_ + 1024);
						int i_39_ = TexStatic.anInt1927 & i_29_;
						if (!bool)
							is_16_[i_37_][i_39_] = i_38_;
						else
							is_16_[i_39_][i_37_] = i_38_;
						if (i_34_ > 0) {
							i_34_ = -i_30_ + i_34_;
							i_29_ += i_33_;
						}
					}
				}
			}
		}
		return is;
	}
}
