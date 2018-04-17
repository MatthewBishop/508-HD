/* Class14_Sub8_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub28 extends Class14_Sub8 {
	public int anInt4553;

	public int anInt4554 = 0;

	public int anInt4564;

	public int anInt4566;

	public Class14_Sub8_Sub28() {
		super(0, true);
		anInt4553 = 20;
		anInt4564 = 0;
		anInt4566 = 1365;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		while_96_: do {
				int i_37_ = i;
				while_95_: do {
					do {
						if (i_37_ != 0) {
							if (i_37_ != 1) {
								if (i_37_ != 2) {
									if (i_37_ != 3)
										break while_96_;
								} else
									break;
								break while_95_;
							}
						} else {
							anInt4566 = class14_sub10.readUShort();
							break while_96_;
						}
						anInt4553 = class14_sub10.readUShort();
						break while_96_;
					} while (false);
					anInt4564 = class14_sub10.readUShort();
					break while_96_;
				} while (false);
				anInt4554 = class14_sub10.readUShort();
		} while (false);
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.empty) {
			for (int i_39_ = 0; i_39_ < TexStatic.anInt1876; i_39_++) {
				int i_40_ = anInt4564 + (TexStatic.anIntArray4145[i_39_] << 44) / anInt4566;
				int i_41_ = i_40_;
				int i_42_ = (anInt4554 + (TexStatic.anIntArray3623[i] << 12) / anInt4566);
				int i_43_ = i_40_;
				int i_44_ = i_42_;
				int i_45_ = i_42_;
				int i_46_ = i_42_ * i_42_ >> 44;
				int i_47_ = i_40_ * i_40_ >> 12;
				int i_48_;
				for (i_48_ = 0; i_47_ + i_46_ < 16384 && anInt4553 > i_48_; i_46_ = i_45_ * i_45_ >> 12) {
					i_48_++;
					i_45_ = i_44_ + (i_45_ * i_43_ >> 12) * 2;
					i_43_ = i_41_ - i_46_ + i_47_;
					i_47_ = i_43_ * i_43_ >> 12;
				}
				is[i_39_] = anInt4553 - 1 > i_48_ ? (i_48_ << 44) / anInt4553 : 0;
			}
		}
		int[] is_49_ = is;
		return is_49_;
	}
}
