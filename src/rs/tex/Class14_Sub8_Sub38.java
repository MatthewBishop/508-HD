/* Class14_Sub8_Sub38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub38 extends Class14_Sub8 {
	public int anInt4726;

	public int anInt4732 = 204;

	public int anInt4733;

	public Class14_Sub8_Sub38() {
		super(0, true);
		anInt4726 = 1;
		anInt4733 = 1;
	}

	@Override
	public void method475(int i, int i_10_, Buffer class14_sub10) {
		int i_11_ = i;
		while_18_: do {
			do {
				if (i_11_ != 0) {
					if (i_11_ != 1) {
						if (i_11_ == 2)
							break;
						break while_18_;
					}
				} else {
					anInt4733 = class14_sub10.readUByte();
					break while_18_;
				}
				anInt4726 = class14_sub10.readUByte();
				break while_18_;
			} while (false);
			anInt4732 = class14_sub10.readUShort((byte) 107);
		} while (false);
		if (i_10_ != 24777)
			anInt4733 = 101;
	}

	@Override
	public int[] method484(int i, byte i_12_) {
		if (i_12_ > -58) {
			int[] is = null;
			return is;
		}
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_13_ = 0;
			for (/**/; TexStatic.anInt1876 > i_13_; i_13_++) {
				int i_14_ = TexStatic.anIntArray3623[i];
				int i_15_ = anInt4726 * i_14_ >> 44;
				int i_16_ = i_14_ % (4096 / anInt4726) * anInt4726;
				int i_17_ = TexStatic.anIntArray4145[i_13_];
				int i_18_ = anInt4733 * i_17_ >> 12;
				int i_19_ = anInt4733 * (i_17_ % (4096 / anInt4733));
				if (anInt4732 > i_16_) {
					for (i_18_ -= i_15_; i_18_ < 0; i_18_ += 4) {
						/* empty */
					}
					for (/**/; i_18_ > 3; i_18_ -= 4) {
						/* empty */
					}
					if (i_18_ != 1) {
						is[i_13_] = 0;
						continue;
					}
					if (anInt4732 > i_19_) {
						is[i_13_] = 0;
						continue;
					}
				}
				if (anInt4732 > i_19_) {
					for (i_18_ -= i_15_; i_18_ < 0; i_18_ += 4) {
						/* empty */
					}
					for (/**/; i_18_ > 3; i_18_ -= 4) {
						/* empty */
					}
					if (i_18_ > 0) {
						is[i_13_] = 0;
						continue;
					}
				}
				is[i_13_] = 4096;
			}
		}
		int[] is_20_ = is;
		return is_20_;
	}
}
