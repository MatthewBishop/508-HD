package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;

public class Static3 {

	public static boolean decodedSprites(Class9 class9, int i, byte i_3_) {
		byte[] is = class9.getFileSmart(i);
		if (is == null) {
			boolean bool = false;
			return bool;
		}
		if (i_3_ <= 10) {
			boolean bool = false;
			return bool;
		}
		Static3.decodeSprites(is);
		boolean bool = true;
		return bool;
	}

	public static boolean method1564(int i_3_, int i_4_, Class9 class9) {
		byte[] is = class9.method163(i_3_, i_4_);
		if (is == null) {
			boolean bool = false;
			return bool;
		}
		Static3.decodeSprites(is);
		boolean bool = true;
		return bool;
	}

	public static void decodeSprites(byte[] is) {
		Buffer class14_sub10 = new Buffer(is);
		class14_sub10.position = is.length - 2;
		Class32.spriteAmount = class14_sub10.readUShort();
		Class98.spriteAlphas = new byte[Class32.spriteAmount][];
		Class12.spritePaletteIndicators = new byte[Class32.spriteAmount][];
		Class14_Sub2_Sub12.spriteYOffsets = new int[Class32.spriteAmount];
		Class40.spriteXOffsets = new int[Class32.spriteAmount];
		Static2.spriteHeights = new int[Class32.spriteAmount];
		JunkTex.spriteHasAlpha = new boolean[Class32.spriteAmount];
		Class17.spriteWidths = new int[Class32.spriteAmount];
		class14_sub10.position = is.length - (Class32.spriteAmount * 8 + 7);
		Class14_Sub11.spriteTrimWidth = class14_sub10.readUShort();
		Class14_Sub30.spriteTrimHeight = class14_sub10.readUShort();
		int i_43_ = (class14_sub10.readUByte() & 0xff) + 1;
		for (int i_44_ = 0; i_44_ < Class32.spriteAmount; i_44_++)
			Class40.spriteXOffsets[i_44_] = class14_sub10.readUShort();
		for (int i_45_ = 0; Class32.spriteAmount > i_45_; i_45_++)
			Class14_Sub2_Sub12.spriteYOffsets[i_45_] = class14_sub10.readUShort();
		int i_46_ = 0;
		for (/**/; i_46_ < Class32.spriteAmount; i_46_++)
			Class17.spriteWidths[i_46_] = class14_sub10.readUShort();
		for (i_46_ = 0; i_46_ < Class32.spriteAmount; i_46_++)
			Static2.spriteHeights[i_46_] = class14_sub10.readUShort();
		class14_sub10.position = -(Class32.spriteAmount * 8) + is.length - (7 + (i_43_ - 1) * 3);
		JunkTex.spritePalette = new int[i_43_];
		for (i_46_ = 1; i_46_ < i_43_; i_46_++) {
			JunkTex.spritePalette[i_46_] = class14_sub10.method829(144 - 30);
			if (JunkTex.spritePalette[i_46_] == 0)
				JunkTex.spritePalette[i_46_] = 1;
		}
		class14_sub10.position = 0;
		for (i_46_ = 0; Class32.spriteAmount > i_46_; i_46_++) {
			int i_47_ = Class17.spriteWidths[i_46_];
			boolean bool = false;
			int i_48_ = Static2.spriteHeights[i_46_];
			int i_49_ = i_48_ * i_47_;
			byte[] is_50_ = new byte[i_49_];
			byte[] _paletteIndicators = new byte[i_49_];
			Class12.spritePaletteIndicators[i_46_] = _paletteIndicators;
			Class98.spriteAlphas[i_46_] = is_50_;
			int i_52_ = class14_sub10.readUByte();
			if ((i_52_ & 0x1) == 0) {
				for (int i_53_ = 0; i_53_ < i_49_; i_53_++)
					_paletteIndicators[i_53_] = class14_sub10.method780();
				if ((i_52_ & 0x2) != 0) {
					for (int i_54_ = 0; i_54_ < i_49_; i_54_++) {
						byte i_55_ = (is_50_[i_54_] = class14_sub10.method780());
						bool = bool | i_55_ != -1;
					}
				}
			} else {
				for (int i_56_ = 0; i_47_ > i_56_; i_56_++) {
					for (int i_57_ = 0; i_48_ > i_57_; i_57_++)
						_paletteIndicators[i_56_ + i_57_ * i_47_] = class14_sub10.method780();
				}
				if ((i_52_ & 0x2) != 0) {
					for (int i_58_ = 0; i_47_ > i_58_; i_58_++) {
						for (int i_59_ = 0; i_48_ > i_59_; i_59_++) {
							byte i_60_ = (is_50_[i_47_ * i_59_ + i_58_] = class14_sub10.method780());
							bool = bool | i_60_ != -1;
						}
					}
				}
			}
			JunkTex.spriteHasAlpha[i_46_] = bool;
		}
	}

}
