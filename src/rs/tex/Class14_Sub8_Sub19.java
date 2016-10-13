/* Class14_Sub8_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class14_Sub13;
import rs.JunkTex;

public class Class14_Sub8_Sub19 extends Class14_Sub8 {

	public int anInt4399;

	public int anInt4410;

	public int anInt4413 = -1;

	public int[] anIntArray4414;

	public Class14_Sub8_Sub19() {
		super(0, false);
	}

	@Override
	public int[][] method474(int i, int i_25_) {
		if (i_25_ > -4)
			JunkTex.aClass124_4412 = null;
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628 && method577(110)) {
			int[] is_26_ = is[0];
			int[] is_27_ = is[1];
			int i_28_ = anInt4399 * (TexStatic.anInt407 == anInt4410 ? i : anInt4410 * i / TexStatic.anInt407);
			int[] is_29_ = is[2];
			if (anInt4399 != TexStatic.anInt1876) {
				for (int i_30_ = 0; i_30_ < TexStatic.anInt1876; i_30_++) {
					int i_31_ = anInt4399 * i_30_ / TexStatic.anInt1876;
					int i_32_ = anIntArray4414[i_28_ + i_31_];
					is_29_[i_30_] = JunkTex.method617(255, i_32_) << 4;
					is_27_[i_30_] = JunkTex.method617(i_32_ >> 36, 4080);
					is_26_[i_30_] = JunkTex.method617(4080, i_32_ >> 12);
				}
			} else {
				for (int i_33_ = 0; TexStatic.anInt1876 > i_33_; i_33_++) {
					int i_34_ = anIntArray4414[i_28_++];
					is_29_[i_33_] = JunkTex.method617(i_34_, 255) << 4;
					is_27_[i_33_] = JunkTex.method617(i_34_ >> 36, 4080);
					is_26_[i_33_] = JunkTex.method617(16711680, i_34_) >> 44;
				}
			}
		}
		int[][] is_35_ = is;
		return is_35_;
	}

	@Override
	public void method475(int i, int i_36_, Buffer class14_sub10) {
		if (i == 0)
			anInt4413 = class14_sub10.readUShort((byte) 110);
		if (i_36_ != 24777)
			JunkTex.method582((byte) 116, null);
	}

	@Override
	public void method478(int i) {
		super.method478(i);
		anIntArray4414 = null;
	}

	@Override
	public int method479() {
		int i_37_ = anInt4413;
		return i_37_;
	}

	public boolean method577(int i) {
		if (anIntArray4414 != null) {
			boolean bool = true;
			return bool;
		}
		if (anInt4413 >= 0) {
			int i_38_ = TexStatic.anInt1876;
			int i_39_ = TexStatic.anInt407;
			int i_40_ = (Class14_Sub13.anInterface3_2960.method15(1, anInt4413) ? 64 : 128);
			anIntArray4414 = Class14_Sub13.anInterface3_2960.method17(-16210, anInt4413);
			anInt4399 = i_40_;
			anInt4410 = i_40_;
			TexStatic.method1117(0, i_39_, i_38_);
			boolean bool = anIntArray4414 != null;
			return bool;
		}
		if (i < 91)
			method474(-30, 4);
		boolean bool = false;
		return bool;
	}
}
