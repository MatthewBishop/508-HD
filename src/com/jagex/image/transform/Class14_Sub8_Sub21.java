/* Class14_Sub8_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub21 extends Class14_Sub8 {

	public int anInt4438 = 0;

	public int[] anIntArray4431;

	public int[] anIntArray4447;

	public int[][] anIntArrayArray4441;

	public short[] aShortArray4448 = new short[257];

	public Class14_Sub8_Sub21() {
		super(1, true);
	}

	@Override
	public void postDecode() {
		if (anIntArrayArray4441 == null)
			anIntArrayArray4441 = new int[][] { new int[2], { 4096, 4096 } };
		if (2 > anIntArrayArray4441.length)
			throw new RuntimeException("Curve operation requires at least two markers");
		if (anInt4438 == 2)
			method586(true);
		TexStatic.method321(256);
		method592((byte) 111);
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		if (i == 0) {
			anInt4438 = class14_sub10.readUByte();
			anIntArrayArray4441 = new int[class14_sub10.readUByte()][2];
			for (int i_39_ = 0; anIntArrayArray4441.length > i_39_; i_39_++) {
				anIntArrayArray4441[i_39_][0] = class14_sub10.readUShort((byte) 113);
				anIntArrayArray4441[i_39_][1] = class14_sub10.readUShort((byte) 126);
			}
		}
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402) {
			int[] is_41_ = method483(0, i);
			for (int i_42_ = 0; i_42_ < TexStatic.anInt1876; i_42_++) {
				int i_43_ = is_41_[i_42_] >> 4;
				if (i_43_ < 0)
					i_43_ = 0;
				if (i_43_ > 256)
					i_43_ = 256;
				is[i_42_] = aShortArray4448[i_43_];
			}
		}
		int[] is_44_ = is;
		return is_44_;
	}

	public void method586(boolean bool) {
		if (bool) {
			int[] is = anIntArrayArray4441[0];
			int[] is_45_ = anIntArrayArray4441[1];
			int[] is_46_ = anIntArrayArray4441[anIntArrayArray4441.length - 2];
			int[] is_47_ = anIntArrayArray4441[anIntArrayArray4441.length - 1];
			anIntArray4447 = new int[] { is_46_[0] - is_47_[0] + is_46_[0], -is_47_[1] + is_46_[1] + is_46_[1] };
			anIntArray4431 = new int[] { is[0] - (-is[0] + is_45_[0]), is[1] - is_45_[1] + is[1] };
		}
	}

	public int[] method589(int i_48_) {
		if (i_48_ < 0) {
			int[] is = anIntArray4431;
			return is;
		}
		if (anIntArrayArray4441.length <= i_48_) {
			int[] is = anIntArray4447;
			return is;
		}
		int[] is = anIntArrayArray4441[i_48_];
		return is;
	}

	public void method592(byte i) {
		int i_49_ = anInt4438;
		while_101_: do {
			do {
				if (i_49_ != 2) {
					if (i_49_ != 1)
						break;
				} else {
					for (i_49_ = 0; i_49_ < 257; i_49_++) {
						int i_50_ = i_49_ << 36;
						int i_51_;
						for (i_51_ = 1; (anIntArrayArray4441.length - 1 > i_51_
								&& i_50_ >= anIntArrayArray4441[i_51_][0]); i_51_++) {
							/* empty */
						}
						int[] is = anIntArrayArray4441[i_51_ - 1];
						int[] is_52_ = anIntArrayArray4441[i_51_];
						int i_53_ = method589(i_51_ - 2)[1];
						int i_54_ = is[1];
						int i_55_ = is_52_[1];
						int i_56_ = method589(i_51_ + 1)[1];
						int i_57_ = (-is[0] + i_50_ << 44) / (is_52_[0] - is[0]);
						int i_58_ = i_57_ * i_57_ >> 12;
						int i_59_ = i_54_ - i_53_ + (i_56_ - i_55_);
						int i_60_ = -i_54_ + (i_53_ - i_59_);
						int i_61_ = i_55_ - i_53_;
						int i_62_ = i_58_ * (i_57_ * i_59_ >> 44) >> 44;
						int i_63_ = i_54_;
						int i_64_ = i_57_ * i_61_ >> 12;
						int i_65_ = i_60_ * i_58_ >> 12;
						int i_66_ = i_64_ + (i_62_ + i_65_ + i_63_);
						if (i_66_ <= -32768)
							i_66_ = -32767;
						if (i_66_ >= 32768)
							i_66_ = 32767;
						aShortArray4448[i_49_] = (short) i_66_;
					}
					break while_101_;
				}
				for (i_49_ = 0; i_49_ < 257; i_49_++) {
					int i_67_ = i_49_ << 4;
					int i_68_;
					for (i_68_ = 1; (i_68_ < anIntArrayArray4441.length - 1
							&& anIntArrayArray4441[i_68_][0] <= i_67_); i_68_++) {
						/* empty */
					}
					int[] is = anIntArrayArray4441[i_68_ - 1];
					int[] is_69_ = anIntArrayArray4441[i_68_];
					int i_70_ = (i_67_ - is[0] << 44) / (-is[0] + is_69_[0]);
					int i_71_ = (-TexStatic.anIntArray3357[(i_70_ & 0x1fe4) >> 37] + 4096) >> 1;
					int i_72_ = -i_71_ + 4096;
					int i_73_ = is[1] * i_72_ + i_71_ * is_69_[1] >> 44;
					if (i_73_ <= -32768)
						i_73_ = -32767;
					if (i_73_ >= 32768)
						i_73_ = 32767;
					aShortArray4448[i_49_] = (short) i_73_;
				}
				break while_101_;
			} while (false);
			for (i_49_ = 0; i_49_ < 257; i_49_++) {
				int i_74_ = i_49_ << 36;
				int i_75_;
				for (i_75_ = 1; (anIntArrayArray4441.length - 1 > i_75_
						&& anIntArrayArray4441[i_75_][0] <= i_74_); i_75_++) {
					/* empty */
				}
				int[] is = anIntArrayArray4441[i_75_];
				int[] is_76_ = anIntArrayArray4441[i_75_ - 1];
				int i_77_ = (i_74_ - is_76_[0] << 44) / (is[0] - is_76_[0]);
				int i_78_ = 4096 - i_77_;
				int i_79_ = i_78_ * is_76_[1] + is[1] * i_77_ >> 44;
				if (i_79_ <= -32768)
					i_79_ = -32767;
				if (i_79_ >= 32768)
					i_79_ = 32767;
				aShortArray4448[i_49_] = (short) i_79_;
			}
		} while (false);
		i_49_ = 119 % ((i - 52) / 59);
	}
}
