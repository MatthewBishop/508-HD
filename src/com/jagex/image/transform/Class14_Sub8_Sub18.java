/* Class14_Sub8_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.image.transform.class125.Class125;
import com.jagex.image.transform.class125.Class125_Sub1;
import com.jagex.image.transform.class125.Class125_Sub2;
import com.jagex.image.transform.class125.Class125_Sub3;
import com.jagex.image.transform.class125.Class125_Sub4;
import com.jagex.image.transform.class125.SC;
import com.jagex.image.transform.util.AccessoryMethods;
import com.jagex.io.Buffer;

public class Class14_Sub8_Sub18 extends Class14_Sub8 {
	private static Class125_Sub3 method860(Buffer class14_sub10) {
		Class125_Sub3 class125_sub3 = new Class125_Sub3(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method829(-119), class14_sub10.readUByte());
		return class125_sub3;
	}
	
	private static Class125_Sub1 method1214(Buffer class14_sub10) {
		Class125_Sub1 class125_sub1 = new Class125_Sub1(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(115),
				class14_sub10.method829(100), class14_sub10.readUByte());
		return class125_sub1;
	}
	
	private static Class125_Sub4 method523(Buffer class14_sub10) {
		Class125_Sub4 class125_sub4 = new Class125_Sub4(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(46),
				class14_sub10.method829(-119), class14_sub10.readUByte());
		return class125_sub4;
	}
	
	private static Class125_Sub2 method1762(Buffer class14_sub10) {
		Class125_Sub2 class125_sub2 = new Class125_Sub2(class14_sub10.method805(0), class14_sub10.method805(0),
				class14_sub10.method805(0), class14_sub10.method805(0), class14_sub10.method829(47),
				class14_sub10.readUByte());
		return class125_sub2;
	}
	
	public Class125[] aClass125Array4398;

	public Class14_Sub8_Sub18() {
		super(0, true);
	}

	@Override
	public int[][] outputColour(int i) {
		int[][] is = triChromaticImageCache.method1481(1, i);
		if (triChromaticImageCache.aBoolean1628) {
			int i_19_ = TexStatic.anInt1876;
			int i_20_ = TexStatic.anInt407;
			int[][] is_21_ = new int[i_20_][i_19_];
			int[][][] is_22_ = triChromaticImageCache.method1485();
			method575(is_21_);
			for (int i_23_ = 0; i_23_ < TexStatic.anInt407; i_23_++) {
				int[] is_24_ = is_21_[i_23_];
				int[][] is_25_ = is_22_[i_23_];
				int[] is_26_ = is_25_[1];
				int[] is_27_ = is_25_[0];
				int[] is_28_ = is_25_[2];
				for (int i_29_ = 0; i_29_ < TexStatic.anInt1876; i_29_++) {
					int i_30_ = is_24_[i_29_];
 					is_28_[i_29_] = AccessoryMethods.method617(i_30_ << 4, 4080); 
 					is_26_[i_29_] = AccessoryMethods.method617(4080, i_30_ >> 4); 
 					is_27_[i_29_] = AccessoryMethods.method617(i_30_ >> 12, 4080); 
				}
			}
		}
		int[][] is_32_ = is;
		return is_32_;
	}

	@Override
	public void decode(int i, Buffer class14_sub10) {
		if (i != 0) {
			if (i == 1)
				monoChromatic = class14_sub10.readUByte() == 1;
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
							aClass125Array4398[i_34_] = method1762(class14_sub10);
							continue while_87_;
						}
						aClass125Array4398[i_34_] = method860(class14_sub10);
						continue while_87_;
					} while (false);
					aClass125Array4398[i_34_] = method523(class14_sub10);
					continue while_87_;
				} while (false);
				aClass125Array4398[i_34_] = method1214(class14_sub10);
			}
		}
	}

	@Override
	public int[] outputMonochrome(int i) {
		int[] is = monoChromaticImageCache.method2014(i);
		if (monoChromaticImageCache.aBoolean2402)
			method575(monoChromaticImageCache.method2019());
		int[] is_38_ = is;
		return is_38_;
	}

	public void method575(int[][] is) {
		int i = TexStatic.anInt1876;
		int i_39_ = TexStatic.anInt407;
		SC.method1363(is);
		SC.method1314(0, TexStatic.anInt1927, TexStatic.anInt4882, 0);
		if (aClass125Array4398 != null) {
			for (int i_40_ = 0; i_40_ < aClass125Array4398.length; i_40_++) {
				Class125 class125 = aClass125Array4398[i_40_];
				int i_41_ = class125.anInt2083;
				int i_42_ = class125.anInt2079;
				if (i_42_ >= 0) {
					if (i_41_ < 0)
						class125.method1726(i_39_, i);
					else
						class125.method1724(i_39_, i);
				} else if (i_41_ >= 0)
					class125.method1721(i, i_39_);
			}
		}
	}
}
