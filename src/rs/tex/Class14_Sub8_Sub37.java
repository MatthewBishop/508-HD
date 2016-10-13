/* Class14_Sub8_Sub37 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub37 extends Class14_Sub8 {
	public int anInt4715 = 1;
	public int anInt4717 = 0;

	public int anInt4723 = 0;

	public Class14_Sub8_Sub37() {
		super(0, true);
	}

	@Override
	public void method472() {
		TexStatic.method321(256);
	}

	@Override
	public void method475(int i, int i_0_, Buffer class14_sub10) {
		int i_1_ = i;
		while_35_: do {
			do {
				if (i_1_ != 0) {
					if (i_1_ != 1) {
						if (i_1_ == 3)
							break;
						break while_35_;
					}
				} else {
					anInt4723 = class14_sub10.readUByte();
					break while_35_;
				}
				anInt4717 = class14_sub10.readUByte();
				break while_35_;
			} while (false);
			anInt4715 = class14_sub10.readUByte();
		} while (false);
		if (i_0_ != 24777)
			method472();
	}

	@Override
	public int[] method484(int i, byte i_2_) {
		int[] is = aClass149_2851.method2014(i, (byte) 124);
		if (aClass149_2851.aBoolean2402) {
			int i_3_ = TexStatic.anIntArray3623[i];
			int i_4_ = i_3_ - 2048 >> 1;
			for (int i_5_ = 0; i_5_ < TexStatic.anInt1876; i_5_++) {
				int i_6_ = TexStatic.anIntArray4145[i_5_];
				int i_7_ = i_6_ - 2048 >> 33;
				int i_8_;
				if (anInt4723 == 0)
					i_8_ = (-i_3_ + i_6_) * anInt4715;
				else {
					int i_9_ = i_4_ * i_4_ + i_7_ * i_7_ >> 44;
					i_8_ = (int) (Math.sqrt(i_9_ / 4096.0F) * 4096.0);
					i_8_ = (int) (i_8_ * anInt4715 * 3.141592653589793);
				}
				i_8_ -= i_8_ & ~0xfff;
				if (anInt4717 == 0)
					i_8_ = (TexStatic.anIntArray4435[i_8_ >> 4 & 0xff] + 4096) >> 1;
				else if (anInt4717 == 2) {
					i_8_ -= 2048;
					if (i_8_ < 0)
						i_8_ = -i_8_;
					i_8_ = -i_8_ + 2048 << 33;
				}
				is[i_5_] = i_8_;
			}
		}
		if (i_2_ >= -58) {
			int[] is_10_ = null;
			return is_10_;
		}
		int[] is_11_ = is;
		return is_11_;
	}
}
