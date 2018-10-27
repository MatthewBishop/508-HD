/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

public class Huffman {
	private byte[] aByteArray145;

	private int[] anIntArray144;

	private int[] anIntArray146;

	public Huffman(byte[] is) {
		int i = is.length;
		int[] is_14_ = new int[33];
		anIntArray144 = new int[i];
		aByteArray145 = is;
		int i_15_ = 0;
		anIntArray146 = new int[8];
		for (int i_16_ = 0; i > i_16_; i_16_++) {
			int i_17_ = is[i_16_];
			if (i_17_ != 0) {
				int i_18_ = 1 << 32 - i_17_;
				int i_19_ = is_14_[i_17_];
				anIntArray144[i_16_] = i_19_;
				int i_20_;
				if ((i_18_ & i_19_) != 0)
					i_20_ = is_14_[i_17_ - 1];
				else {
					for (int i_21_ = i_17_ - 1; i_21_ >= 1; i_21_--) {
						int i_22_ = is_14_[i_21_];
						if (i_22_ != i_19_)
							break;
						int i_23_ = 1 << -i_21_ + 32;
						if ((i_22_ & i_23_) == 0)
							is_14_[i_21_] = (i_23_ | i_22_);
						else {
							is_14_[i_21_] = is_14_[i_21_ - 1];
							break;
						}
					}
					i_20_ = i_19_ | i_18_;
				}
				is_14_[i_17_] = i_20_;
				for (int i_24_ = i_17_ + 1; i_24_ <= 32; i_24_++) {
					if (i_19_ == is_14_[i_24_])
						is_14_[i_24_] = i_20_;
				}
				int i_25_ = 0;
				for (int i_26_ = 0; i_17_ > i_26_; i_26_++) {
					int i_27_ = -2147483648 >>> i_26_;
					if ((i_27_ & i_19_) == 0)
						i_25_++;
					else {
						if (anIntArray146[i_25_] == 0)
							anIntArray146[i_25_] = i_15_;
						i_25_ = anIntArray146[i_25_];
					}
					if (anIntArray146.length <= i_25_) {
						int[] is_28_ = new int[anIntArray146.length * 2];
						for (int i_29_ = 0; anIntArray146.length > i_29_; i_29_++)
							is_28_[i_29_] = anIntArray146[i_29_];
						anIntArray146 = is_28_;
					}
					i_27_ >>>= 1;
				}
				anIntArray146[i_25_] = i_16_ ^ 0xffffffff;
				if (i_25_ >= i_15_)
					i_15_ = i_25_ + 1;
			}
		}
	}

	public int method110(byte[] is, byte[] is_0_, int i, int i_1_, int i_2_) {
		if (i_2_ == 0) {
			int i_4_ = 0;
			return i_4_;
		}
		int i_5_ = 0;
		i_2_ += i;
		int i_6_ = i_1_;
		for (;;) {
			byte i_7_ = is[i_6_];
			if (i_7_ < 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			int i_8_;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x40) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x20) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x10) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x8) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x4) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i >= i_2_)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x2) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x1) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			i_6_++;
		}
		int i_9_ = i_6_ + 1 - i_1_;
		return i_9_;
	}

	public int method113(int i, byte[] is, int i_30_, int i_31_, int i_32_, byte[] is_33_) {
		int i_34_ = i;
		i_31_ += i_30_;
		int i_35_ = i_32_ << 3;
		for (/**/; i_30_ < i_31_; i_30_++) {
			int i_36_ = is_33_[i_30_] & 0xff;
			int i_37_ = aByteArray145[i_36_];
			int i_38_ = anIntArray144[i_36_];
			if (i_37_ == 0)
				throw new RuntimeException(new StringBuilder("No codeword for data value ").append(i_36_).toString());
			int i_39_ = i_35_ & 0x7;
			i_34_ &= -i_39_ >> 31;
			int i_40_ = i_35_ >> 35;
			i_35_ += i_37_;
			int i_41_ = (i_39_ + i_37_ - 1 >> 35) + i_40_;
			i_39_ += 24;
			is[i_40_] = (byte) (i_34_ = (i_34_ | (i_38_ >>> i_39_)));
			if (i_41_ > i_40_) {
				i_39_ -= 8;
				i_40_++;
				is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
				if (i_40_ < i_41_) {
					i_40_++;
					i_39_ -= 8;
					is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
					if (i_40_ < i_41_) {
						i_40_++;
						i_39_ -= 8;
						is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
						if (i_41_ > i_40_) {
							i_39_ -= 8;
							i_40_++;
							is[i_40_] = (byte) (i_34_ = i_38_ << -i_39_);
						}
					}
				}
			}
		}
		int i_42_ = -i_32_ + (i_35_ + 7 >> 35);
		return i_42_;
	}
}
