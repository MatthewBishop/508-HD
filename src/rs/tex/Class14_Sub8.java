/* Class14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

import rs.Class149;
import rs.Class95;
import rs.JunkTex;

public abstract class Class14_Sub8 extends Linkable {

	public boolean aBoolean2862;

	public Class14_Sub8[] aClass14_Sub8Array2831;

	public Class149 aClass149_2851;

	public Class95 aClass95_2838;

	public int anInt2837;

	public Class14_Sub8(int i, boolean bool) {
		aClass14_Sub8Array2831 = new Class14_Sub8[i];
		aBoolean2862 = bool;
	}

	public void method472() {
	}

	public void method473(int i, int i_18_, int i_19_) {
		int i_20_ = anInt2837 != 255 ? anInt2837 : i;
		if (aBoolean2862)
			aClass149_2851 = new Class149(i_20_, i, i_18_);
		else
			aClass95_2838 = new Class95(i_20_, i, i_18_);
	}

	public int[][] method474(int i, int i_21_) {
		if (i_21_ > -4) {
			int[][] is = null;
			return is;
		}
		throw new IllegalStateException("This operation does not have a colour output");
	}

	public void method475(int i, int i_22_, Buffer class14_sub10) {
		if (i_22_ != 24777)
			method483(3, (byte) -125, -67);
	}

	public int method477() {
		int i_23_ = -1;
		return i_23_;
	}

	public void method478(int i) {
		if (i != 0)
			JunkTex.method471(null, null, null, null, null, -95, null);
		if (aBoolean2862) {
			aClass149_2851.method2015((byte) 87);
			aClass149_2851 = null;
		} else {
			aClass95_2838.method1483(2);
			aClass95_2838 = null;
		}
	}

	public int method479() {
		int i_24_ = -1;
		return i_24_;
	}

	public int[][] method480(int i, int i_25_, int i_26_) {
		if (i != 0)
			JunkTex.aClass124_2860 = null;
		if (aClass14_Sub8Array2831[i_25_].aBoolean2862) {
			int[] is = aClass14_Sub8Array2831[i_25_].method484(i_26_, (byte) -61);
			int[][] is_27_ = new int[3][];
			is_27_[2] = is;
			is_27_[1] = is;
			is_27_[0] = is;
			int[][] is_28_ = is_27_;
			return is_28_;
		}
		int[][] is = aClass14_Sub8Array2831[i_25_].method474(i_26_, -15);
		return is;
	}

	public int[] method483(int i, byte i_29_, int i_30_) {
		if (aClass14_Sub8Array2831[i].aBoolean2862) {
			int[] is = aClass14_Sub8Array2831[i].method484(i_30_, (byte) -90);
			return is;
		}
		int[] is = aClass14_Sub8Array2831[i].method474(i_30_, -98)[0];
		return is;
	}

	public int[] method484(int i, byte i_31_) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
