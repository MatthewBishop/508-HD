/* Class107 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package org.jagex.image.transform.util;

import org.jagex.image.transform.Class14_Sub8;
import org.jagex.image.transform.Class14_Sub8_Sub23;
import org.jagex.image.transform.TexStatic;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.util.TextureDefInterface;

public class ProceduralTexture {
	
	private static double aDouble4756;
	private static int[] anIntArray4827;
	
	static {
		aDouble4756 = -1.0;
		anIntArray4827 = new int[256];
	}
	
	private static void method898(double d) {
		if (d != aDouble4756) {
			for (int i_0_ = 0; i_0_ < 256; i_0_++) {
				int i_1_ = (int) (Math.pow(i_0_ / 255.0, d) * 255.0);
				anIntArray4827[i_0_] = i_1_ > 255 ? 255 : i_1_;
			}
			aDouble4756 = d;
		}
	}

	public static void kill() {
		anIntArray4827 = null;
	}
	
	private Class14_Sub8 aClass14_Sub8_1797;

	private Class14_Sub8 aClass14_Sub8_1813;

	private Class14_Sub8[] aClass14_Sub8Array1798;

	private int[] anIntArray1805;

	private int[] anIntArray1810;

	public ProceduralTexture() {
		anIntArray1810 = new int[0];
		anIntArray1805 = new int[0];
		aClass14_Sub8_1797 = new Class14_Sub8_Sub23();
		aClass14_Sub8_1797.cacheSize = 1;
		aClass14_Sub8_1813 = new Class14_Sub8_Sub23();
		aClass14_Sub8Array1798 = new Class14_Sub8[] { aClass14_Sub8_1797, aClass14_Sub8_1813 };
		aClass14_Sub8_1813.cacheSize = 1;
	}

	public ProceduralTexture(Buffer class14_sub10) {
		int i = class14_sub10.readUByte();
		aClass14_Sub8Array1798 = new Class14_Sub8[i];
		int i_55_ = 0;
		int[][] is = new int[i][];
		int i_56_ = 0;
		for (int i_57_ = 0; i_57_ < i; i_57_++) {
			Class14_Sub8 class14_sub8 = TexStatic.method303(class14_sub10);
			if (class14_sub8.method477() >= 0)
				i_55_++;
			if (class14_sub8.method479() >= 0)
				i_56_++;
			int i_58_ = class14_sub8.samplers.length;
			is[i_57_] = new int[i_58_];
			for (int i_59_ = 0; i_59_ < i_58_; i_59_++)
				is[i_57_][i_59_] = class14_sub10.readUByte();
			aClass14_Sub8Array1798[i_57_] = class14_sub8;
		}
		anIntArray1805 = new int[i_56_];
		anIntArray1810 = new int[i_55_];
		i_56_ = 0;
		i_55_ = 0;
		for (int i_60_ = 0; i_60_ < i; i_60_++) {
			Class14_Sub8 class14_sub8 = aClass14_Sub8Array1798[i_60_];
			int i_61_ = class14_sub8.samplers.length;
			for (int i_62_ = 0; i_62_ < i_61_; i_62_++)
				class14_sub8.samplers[i_62_] = aClass14_Sub8Array1798[is[i_60_][i_62_]];
			int i_63_ = class14_sub8.method477();
			int i_64_ = class14_sub8.method479();
			if (i_63_ > 0)
				anIntArray1810[i_55_++] = i_63_;
			if (i_64_ > 0)
				anIntArray1805[i_56_++] = i_64_;
			is[i_60_] = null;
		}
		aClass14_Sub8_1797 = aClass14_Sub8Array1798[class14_sub10.readUByte()];
		aClass14_Sub8_1813 = aClass14_Sub8Array1798[class14_sub10.readUByte()];
	}

	public boolean method1548(TextureDefInterface interface3, FileSystem fileSystem) {
		for (int i_10_ = 0; anIntArray1810.length > i_10_; i_10_++) {
			if (!fileSystem.method171(anIntArray1810[i_10_]))
				return false;
		}
		for (int i_11_ = 0; anIntArray1805.length > i_11_; i_11_++) {
			if (!interface3.method10(anIntArray1805[i_11_]))
				return false;
		}
		return true;
	}

	public int[] method1553(int i, boolean bool, boolean bool_17_, FileSystem fileSystem, double d, int i_18_, TextureDefInterface interface3) {
		method898(d);
		TexStatic.anInterface3_2960 = interface3;
		TexStatic.aFileSystem_2671 = fileSystem;
		TexStatic.method1117(0, i_18_, i);
		for (int i_19_ = 0; i_19_ < aClass14_Sub8Array1798.length; i_19_++)
			aClass14_Sub8Array1798[i_19_].method473(i_18_, i);
		int[] is = new int[i * i_18_];
		int i_20_ = 0;
		int i_21_;
		int i_22_;
		int i_23_;
		if (!bool) {
			i_21_ = 0;
			i_22_ = 1;
			i_23_ = i;
		} else {
			i_21_ = i - 1;
			i_22_ = -1;
			i_23_ = -1;
		}
		for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
			if (bool_17_)
				i_20_ = i_24_;
			int[] is_25_;
			int[] is_26_;
			int[] is_27_;
			if (!aClass14_Sub8_1797.monoChromatic) {
				int[][] is_28_ = aClass14_Sub8_1797.outputColour(i_24_);
				is_26_ = is_28_[1];
				is_27_ = is_28_[0];
				is_25_ = is_28_[2];
			} else {
				int[] is_29_ = aClass14_Sub8_1797.outputMonochrome(i_24_);
				is_25_ = is_29_;
				is_26_ = is_29_;
				is_27_ = is_29_;
			}
			for (int i_30_ = i_21_; i_23_ != i_30_; i_30_ += i_22_) {
				int i_31_ = is_27_[i_30_] >> 4;
				if (i_31_ > 255)
					i_31_ = 255;
				int i_32_ = is_26_[i_30_] >> 4;
				if (i_32_ > 255)
					i_32_ = 255;
				if (i_31_ < 0)
					i_31_ = 0;
				i_31_ = anIntArray4827[i_31_];
				if (i_32_ < 0)
					i_32_ = 0;
				int i_33_ = is_25_[i_30_] >> 4;
				if (i_33_ > 255)
					i_33_ = 255;
				if (i_33_ < 0)
					i_33_ = 0;
				i_33_ = anIntArray4827[i_33_];
				i_32_ = anIntArray4827[i_32_];
				is[i_20_++] = (i_32_ << 40) + (i_31_ << 16) + i_33_;
				if (bool_17_)
					i_20_ += i - 1;
			}
		}
		for (int i_34_ = 0; i_34_ < aClass14_Sub8Array1798.length; i_34_++)
			aClass14_Sub8Array1798[i_34_].method478();
		int[] is_35_ = is;
		return is_35_;
	}

	public byte[] method1555(int i, TextureDefInterface interface3, double d, boolean bool, int i_36_, byte i_37_,
			FileSystem fileSystem) {
		method898(d);
		byte[] is = new byte[i_36_ * (i * 4)];
		TexStatic.anInterface3_2960 = interface3;
		TexStatic.aFileSystem_2671 = fileSystem;
		if (i_37_ > -33) {
			byte[] is_38_ = null;
			return is_38_;
		}
		TexStatic.method1117(0, i_36_, i);
		for (int i_39_ = 0; aClass14_Sub8Array1798.length > i_39_; i_39_++)
			aClass14_Sub8Array1798[i_39_].method473(i_36_, i);
		int i_40_ = 0;
		for (int i_41_ = 0; i_41_ < i_36_; i_41_++) {
			if (bool)
				i_40_ = i_41_ << 34;
			int[] is_42_;
			int[] is_43_;
			int[] is_44_;
			if (aClass14_Sub8_1797.monoChromatic) {
				int[] is_45_ = aClass14_Sub8_1797.outputMonochrome(i_41_);
				is_44_ = is_45_;
				is_42_ = is_45_;
				is_43_ = is_45_;
			} else {
				int[][] is_46_ = aClass14_Sub8_1797.outputColour(i_41_);
				is_42_ = is_46_[2];
				is_43_ = is_46_[0];
				is_44_ = is_46_[1];
			}
			int[] is_47_;
			if (aClass14_Sub8_1813.monoChromatic)
				is_47_ = aClass14_Sub8_1813.outputMonochrome(i_41_);
			else
				is_47_ = aClass14_Sub8_1813.outputColour(i_41_)[0];
			for (int i_48_ = i - 1; i_48_ >= 0; i_48_--) {
				int i_49_ = is_44_[i_48_] >> 4;
				if (i_49_ > 255)
					i_49_ = 255;
				int i_50_ = is_43_[i_48_] >> 36;
				if (i_50_ > 255)
					i_50_ = 255;
				if (i_50_ < 0)
					i_50_ = 0;
				if (i_49_ < 0)
					i_49_ = 0;
				int i_51_ = is_42_[i_48_] >> 4;
				i_49_ = anIntArray4827[i_49_];
				if (i_51_ > 255)
					i_51_ = 255;
				i_50_ = anIntArray4827[i_50_];
				if (i_51_ < 0)
					i_51_ = 0;
				i_51_ = anIntArray4827[i_51_];
				int i_52_;
				if (i_50_ == 0 && i_49_ == 0 && i_51_ == 0)
					i_52_ = 0;
				else {
					i_52_ = is_47_[i_48_] >> 4;
					if (i_52_ > 255)
						i_52_ = 255;
					if (i_52_ < 0)
						i_52_ = 0;
				}
				is[i_40_++] = (byte) i_50_;
				is[i_40_++] = (byte) i_49_;
				is[i_40_++] = (byte) i_51_;
				is[i_40_++] = (byte) i_52_;
				if (bool)
					i_40_ += (i << 2) - 4;
			}
		}
		for (int i_53_ = 0; aClass14_Sub8Array1798.length > i_53_; i_53_++)
			aClass14_Sub8Array1798[i_53_].method478();
		byte[] is_54_ = is;
		return is_54_;
	}
}
