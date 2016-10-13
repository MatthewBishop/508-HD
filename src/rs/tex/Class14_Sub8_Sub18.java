/* Class14_Sub8_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;

import rs.Class125;
import rs.Class129;
import rs.Class14_Sub13;
import rs.Class53;
import rs.Class70;
import rs.Class76;
import rs.JunkTex;

public class Class14_Sub8_Sub18 extends Class14_Sub8 {
	public Class125[] aClass125Array4398;

	public Class14_Sub8_Sub18() {
		super(0, true);
	}

	@Override
	public int[][] method474(int i, int i_18_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int i_19_ = TexStatic.anInt1876;
			int i_20_ = TexStatic.anInt407;
			int[][] is_21_ = new int[i_20_][i_19_];
			int[][][] is_22_ = aClass95_2838.method1485((byte) 52);
			method575(is_21_, true);
			for (int i_23_ = 0; i_23_ < TexStatic.anInt407; i_23_++) {
				int[] is_24_ = is_21_[i_23_];
				int[][] is_25_ = is_22_[i_23_];
				int[] is_26_ = is_25_[1];
				int[] is_27_ = is_25_[0];
				int[] is_28_ = is_25_[2];
				for (int i_29_ = 0; i_29_ < TexStatic.anInt1876; i_29_++) {
					int i_30_ = is_24_[i_29_];
					is_28_[i_29_] = JunkTex.method617(i_30_ << 4, 4080);
					is_26_[i_29_] = JunkTex.method617(4080, i_30_ >> 4);
					is_27_[i_29_] = JunkTex.method617(i_30_ >> 12, 4080);
				}
			}
		}
		if (i_18_ >= -4) {
			int[][] is_31_ = null;
			return is_31_;
		}
		int[][] is_32_ = is;
		return is_32_;
	}

	@Override
	public void method475(int i, int i_33_, Buffer class14_sub10) {
		if (i != 0) {
			if (i == 1)
				aBoolean2862 = class14_sub10.readUByte() == 1;
		} else {
			aClass125Array4398 = new Class125[class14_sub10.readUByte()];
			int i_34_ = 0;
			while_87_: for (/**/; aClass125Array4398.length > i_34_; i_34_++) {
				int i_35_ = class14_sub10.readUByte();
				int i_36_ = i_35_;
				while_85_: do {
					do {
						if (i_36_ != 0) {
							if (i_36_ != 1) {
								if (i_36_ != 2) {
									if (i_36_ != 3)
										continue while_87_;
								} else
									break;
								break while_85_;
							}
						} else {
							aClass125Array4398[i_34_] = Class129.method1762((byte) 112, class14_sub10);
							continue while_87_;
						}
						aClass125Array4398[i_34_] = Class14_Sub13.method860(class14_sub10, true);
						continue while_87_;
					} while (false);
					aClass125Array4398[i_34_] = JunkTex.method523(class14_sub10, (byte) -24);
					continue while_87_;
				} while (false);
				aClass125Array4398[i_34_] = Class53.method1214(class14_sub10, (byte) -123);
			}
		}
		if (i_33_ != 24777)
			JunkTex.method576(-68, 77, -73, 50, -52);
	}

	@Override
	public int[] method484(int i, byte i_37_) {
		if (i_37_ > -58)
			JunkTex.method576(-98, -33, 18, -8, -107);
		int[] is = aClass149_2851.method2014(i, (byte) 127);
		if (aClass149_2851.aBoolean2402)
			method575(aClass149_2851.method2019(true), true);
		int[] is_38_ = is;
		return is_38_;
	}

	public void method575(int[][] is, boolean bool) {
		if (!bool)
			JunkTex.method576(49, 39, 41, 114, -26);
		int i = TexStatic.anInt1876;
		int i_39_ = TexStatic.anInt407;
		Class76.method1363(is, 0);
		Class70.method1314(0, 109, TexStatic.anInt1927, TexStatic.anInt4882, 0);
		if (aClass125Array4398 != null) {
			for (int i_40_ = 0; i_40_ < aClass125Array4398.length; i_40_++) {
				Class125 class125 = aClass125Array4398[i_40_];
				int i_41_ = class125.anInt2083;
				int i_42_ = class125.anInt2079;
				if (i_42_ >= 0) {
					if (i_41_ < 0)
						class125.method1726(65, i_39_, i);
					else
						class125.method1724(i_39_, -6, i);
				} else if (i_41_ >= 0)
					class125.method1721(true, i, i_39_);
			}
		}
	}
}
