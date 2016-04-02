/* Class133_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.loaders.AnimFrameLoader;

public abstract class Class133_Sub7 extends Class133 {
	public boolean aBoolean3687 = false;

	public abstract void method1855(int i, int i_0_, int i_1_);

	public abstract int method1856();

	public abstract void method1857(AnimFrameLoader class14_sub2_sub15, int i, boolean bool);

	public abstract void method1858(int i);

	public abstract void method1859(AnimFrameLoader class14_sub2_sub15, int i);

	public abstract Class133_Sub7 method1860(boolean bool, boolean bool_2_);

	public abstract void method1861(int i);

	public abstract void method1862(int i, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_);

	public void method1863(int[][] is, int i, int i_9_, int i_10_, int i_11_, int i_12_) {
		boolean bool = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		int i_15_ = -i_11_ / 2;
		int i_16_ = -i_12_ / 2;
		int i_17_ = method1864(is, i + i_15_, i_10_ + i_16_);
		int i_18_ = i_11_ / 2;
		int i_19_ = -i_12_ / 2;
		int i_20_ = method1864(is, i + i_18_, i_10_ + i_19_);
		int i_21_ = -i_11_ / 2;
		int i_22_ = i_12_ / 2;
		int i_23_ = method1864(is, i + i_21_, i_10_ + i_22_);
		int i_24_ = i_11_ / 2;
		int i_25_ = i_12_ / 2;
		int i_26_ = method1864(is, i + i_24_, i_10_ + i_25_);
		int i_27_ = i_17_ < i_20_ ? i_17_ : i_20_;
		int i_28_ = i_23_ < i_26_ ? i_23_ : i_26_;
		int i_29_ = i_20_ < i_26_ ? i_20_ : i_26_;
		int i_30_ = i_17_ < i_23_ ? i_17_ : i_23_;
		if (i_12_ != 0) {
			int i_31_ = ((int) (Math.atan2((double) (i_27_ - i_28_), (double) i_12_) * 325.95) & 0x7ff);
			if (i_31_ != 0)
				method1861(i_31_);
		}
		if (i_11_ != 0) {
			int i_32_ = ((int) (Math.atan2((double) (i_30_ - i_29_), (double) i_11_) * 325.95) & 0x7ff);
			if (i_32_ != 0)
				method1858(i_32_);
		}
		int i_33_ = i_17_ + i_26_;
		if (i_20_ + i_23_ < i_33_)
			i_33_ = i_20_ + i_23_;
		i_33_ = (i_33_ >> 1) - i_9_;
		if (i_33_ != 0)
			method1855(0, i_33_, 0);
	}

	public static int method1864(int[][] is, int i, int i_34_) {
		int i_35_ = i >> 7;
		int i_36_ = i_34_ >> 7;
		if (i_35_ < 0 || i_36_ < 0 || i_35_ >= is.length || i_36_ >= is[0].length)
			return 0;
		int i_37_ = i & 0x7f;
		int i_38_ = i_34_ & 0x7f;
		int i_39_ = (is[i_35_][i_36_] * (128 - i_37_) + is[i_35_ + 1][i_36_] * i_37_ >> 7);
		int i_40_ = ((is[i_35_][i_36_ + 1] * (128 - i_37_) + is[i_35_ + 1][i_36_ + 1] * i_37_) >> 7);
		return i_39_ * (128 - i_38_) + i_40_ * i_38_ >> 7;
	}

	public abstract int method1865();

	public abstract int method1866();

	public abstract int method1867();

	public abstract int method1868();

	public abstract void method1869(int i, int i_41_, int i_42_);

	public abstract int method1781();

	public abstract Class133_Sub7 method1870(boolean bool, boolean bool_43_);

	public abstract void method1871();

	public abstract void method1872();

	public abstract void method1873(AnimFrameLoader class14_sub2_sub15, int i,
			AnimFrameLoader class14_sub2_sub15_44_, int i_45_, int[] is, boolean bool);

	public abstract void method1792(int i, int i_46_, int i_47_, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_,
			long l);

	public abstract void method1874(int i);

	public abstract void method1875();
}
