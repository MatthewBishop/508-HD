/* Class133 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.IOException;

import com.jagex.io.Buffer;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;
import com.jagex.rt4.lights.Class130;
import com.jagex.rt4.lights.Light;
import com.jagex.util.TimeUtil;

import rs.tex.Class14_Sub8_Sub12;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub2;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub37;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public abstract class Class133 {
	public static Class124 aClass124_2175 = Class14_Sub2_Sub2.method263(1178, "Spieler");
	public static Class124 aClass124_2183;
	public static Class124 aClass124_2188 = Class14_Sub2_Sub2.method263(1178, "Players");
	public static Class14_Sub2_Sub19_Sub1[] aClass14_Sub2_Sub19_Sub1Array2186;
	public static int[] anIntArray2176 = new int[100];
	public static int[] anIntArray2179 = { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	static {
		aClass124_2183 = aClass124_2188;
	}

	public static Class35 method1780(byte i, int i_0_) {
		Class35 class35 = ((Class35) Static2.aClass52_2370.method1210((byte) 116, (long) i_0_));
		if (i != 111)
			method1785((byte) 101);
		if (class35 != null) {
			Class35 class35_1_ = class35;
			return class35_1_;
		}
		byte[] is = Class12.aClass9_332.method163(i_0_, 16, i - 111);
		Class35 class35_2_ = new Class35();
		if (is != null)
			class35_2_.method1094((byte) 102, new Buffer(is));
		Static2.aClass52_2370.method1205(class35_2_, (long) i_0_);
		Class35 class35_3_ = class35_2_;
		return class35_3_;
	}

	public static void method1782(int i, int i_4_, int i_5_) {
		int i_6_ = i_4_;
		if (i_6_ > 25)
			i_6_ = 25;
		i_4_--;
		int i_7_ = Class14_Sub8_Sub36.anIntArray4691[i_4_];
		int i_8_ = Class14_Sub2_Sub21.anIntArray4078[i_4_];
		if (i_5_ == 0) {
			Static.aClass14_Sub10_Sub1_891.writeOpcode(49);
			Static.aClass14_Sub10_Sub1_891.method809(i_6_ + 3 + i_6_);
		}
		if (i_5_ == 1) {
			Static.aClass14_Sub10_Sub1_891.writeOpcode(119);
			Static.aClass14_Sub10_Sub1_891.method809(i_6_ + 3 + (i_6_ + 14));
		}
		if (i_5_ == 2) {
			Static.aClass14_Sub10_Sub1_891.writeOpcode(138);
			Static.aClass14_Sub10_Sub1_891.method809(i_6_ + i_6_ + 3);
		}
		Static.aClass14_Sub10_Sub1_891.method801((byte) -86, i_7_ + Class133_Sub6.anInt3676);
		Static.aClass14_Sub10_Sub1_891.method792(i_8_ + Class58.anInt947, (byte) -98);
		Static.aClass14_Sub10_Sub1_891.method795((!(Class14_Sub8_Sub29.aBooleanArray4581[82]) ? 0 : 1),
				i - 1503987590);
		Class71.anInt1085 = Class14_Sub8_Sub36.anIntArray4691[0];
		Class14_Sub8_Sub15.anInt4335 = Class14_Sub2_Sub21.anIntArray4078[0];
		int i_9_ = 1;
		if (i != -20179)
			anIntArray2176 = null;
		for (/**/; i_9_ < i_6_; i_9_++) {
			i_4_--;
			Static.aClass14_Sub10_Sub1_891.method809(((Class14_Sub8_Sub36.anIntArray4691[i_4_]) - i_7_));
			Static.aClass14_Sub10_Sub1_891.method789(((Class14_Sub2_Sub21.anIntArray4078[i_4_]) - i_8_), 273558984);
		}
	}

	public static void method1783(Class36 class36, byte i, boolean bool) {
		if (Class4.aClass36_134 != null) {
			try {
				Class4.aClass36_134.method1101((byte) 122);
			} catch (Exception exception) {
				/* empty */
			}
			Class4.aClass36_134 = null;
		}
		Class4.aClass36_134 = class36;
		Class14_Sub3.method449(bool, i - 45);
		Class62.aClass14_Sub10_989 = null;
		Class14_Sub18.aClass14_Sub10_3036.position = 0;
		Class14_Sub8_Sub16.aClass14_Sub2_Sub9_4354 = null;
		Class14_Sub2_Sub3.anInt3769 = 0;
		for (;;) {
			Class14_Sub2_Sub9 class14_sub2_sub9 = ((Class14_Sub2_Sub9) Class14_Sub8_Sub2.aClass55_4112
					.getFirst());
			if (class14_sub2_sub9 == null)
				break;
			Class71.aClass55_1092.put(class14_sub2_sub9.key, class14_sub2_sub9);
			Class14_Sub2_Sub8.anInt3833--;
			Class14_Sub8_Sub32.anInt4612++;
		}
		for (;;) {
			Class14_Sub2_Sub9 class14_sub2_sub9 = ((Class14_Sub2_Sub9) Class14_Sub8_Sub9.aClass55_4227
					.getFirst());
			if (class14_sub2_sub9 == null)
				break;
			Class14_Sub8_Sub37.aClass81_4716.method1394(class14_sub2_sub9, (byte) -78);
			Class7_Sub2_Sub1.aClass55_3698.put(class14_sub2_sub9.key, class14_sub2_sub9);
			Class63.anInt998++;
			SceneCluster.anInt1355--;
		}
		if (Class14_Sub8_Sub12.aByte4287 != 0) {
			try {
				Buffer class14_sub10 = new Buffer(4);
				class14_sub10.method809(4);
				class14_sub10.method809(Class14_Sub8_Sub12.aByte4287);
				class14_sub10.method833((byte) 118, 0);
				Class4.aClass36_134.method1100(0, i - 46, 4, class14_sub10.payload);
			} catch (IOException ioexception) {
				try {
					Class4.aClass36_134.method1101((byte) 112);
				} catch (Exception exception) {
					/* empty */
				}
				Class51.anInt829++;
				Class4.aClass36_134 = null;
			}
		}
		Static.anInt853 = 0;
		if (i == 49)
			Class146.aLong2364 = TimeUtil.getTime();
	}

	public static void method1785(byte i) {
		anIntArray2176 = null;
		aClass124_2175 = null;
		anIntArray2179 = null;
		aClass124_2183 = null;
		aClass124_2188 = null;
		aClass14_Sub2_Sub19_Sub1Array2186 = null;
	}

	public static void method1787(int[] is, int i, float[][] fs, int i_20_, Class130 class130, float[][] fs_21_,
			int[][] is_22_, int i_23_, float[][] fs_24_, boolean bool, Light light) {
		int[] is_25_ = new int[is.length / 2];
		for (int i_26_ = 0; is_25_.length > i_26_; i_26_++) {
			int i_27_ = is[i_26_ + i_26_];
			int i_28_ = is[i_26_ + (i_26_ + 1)];
			if (i == 1) {
				int i_29_ = i_27_;
				i_27_ = i_28_;
				i_28_ = 128 - i_29_;
			} else if (i != 2) {
				if (i == 3) {
					int i_30_ = i_27_;
					i_27_ = 128 - i_28_;
					i_28_ = i_30_;
				}
			} else {
				i_27_ = -i_27_ + 128;
				i_28_ = -i_28_ + 128;
			}
			float f;
			float f_31_;
			float f_32_;
			if (i_27_ == 0 && i_28_ == 0) {
				f_31_ = fs_21_[i_23_][i_20_];
				f = fs[i_23_][i_20_];
				f_32_ = fs_24_[i_23_][i_20_];
			} else if (i_27_ != 128 || i_28_ != 0) {
				if (i_27_ != 128 || i_28_ != 128) {
					if (i_27_ != 0 || i_28_ != 128) {
						f = fs[i_23_][i_20_];
						f_31_ = fs_21_[i_23_][i_20_];
						float f_33_ = (float) i_27_ / 128.0F;
						f_32_ = fs_24_[i_23_][i_20_];
						float f_34_ = fs[i_23_][i_20_ + 1];
						f += (-f + fs[i_23_ + 1][i_20_]) * f_33_;
						f_32_ += f_33_ * (fs_24_[i_23_ + 1][i_20_] - f_32_);
						f_31_ += f_33_ * (fs_21_[i_23_ + 1][i_20_] - f_31_);
						f_34_ += f_33_ * (-f_34_ + fs[i_23_ + 1][i_20_ + 1]);
						float f_35_ = fs_21_[i_23_][i_20_ + 1];
						f_35_ += (fs_21_[i_23_ + 1][i_20_ + 1] - f_35_) * f_33_;
						float f_36_ = fs_24_[i_23_][i_20_ + 1];
						float f_37_ = (float) i_28_ / 128.0F;
						f_36_ += (-f_36_ + fs_24_[i_23_ + 1][i_20_ + 1]) * f_33_;
						f_31_ += (f_35_ - f_31_) * f_37_;
						f_32_ += (f_36_ - f_32_) * f_37_;
						f += (f_34_ - f) * f_37_;
					} else {
						f_32_ = fs_24_[i_23_][i_20_ + 1];
						f = fs[i_23_][i_20_ + 1];
						f_31_ = fs_21_[i_23_][i_20_ + 1];
					}
				} else {
					f_32_ = fs_24_[i_23_ + 1][i_20_ + 1];
					f = fs[i_23_ + 1][i_20_ + 1];
					f_31_ = fs_21_[i_23_ + 1][i_20_ + 1];
				}
			} else {
				f_32_ = fs_24_[i_23_ + 1][i_20_];
				f_31_ = fs_21_[i_23_ + 1][i_20_];
				f = fs[i_23_ + 1][i_20_];
			}
			int i_38_ = i_27_ + (i_23_ << 39);
			int i_39_ = Class14_Sub8_Sub31.method647(i_20_, -501955161, i_27_, i_28_, is_22_, i_23_);
			int i_40_ = i_28_ + (i_20_ << 7);
			is_25_[i_26_] = class130.method1769(light, i_38_, i_39_, i_40_, f, f_31_, f_32_);
		}
		class130.method1770(is_25_);
		if (!bool)
			anIntArray2176 = null;
	}

	public static void method1789(byte i) {
		Class14_Sub11.aClass52_2946.method1209((byte) -96);
	}

	public abstract int method1781();

	public boolean method1784() {
		boolean bool = false;
		return bool;
	}

	public void method1788(Class133 class133_42_, int i, int i_43_, int i_44_, boolean bool) {
		/* empty */
	}

	public void method1790(int i, int i_45_, int i_46_, int i_47_, int i_48_) {

	}

	public Class133 method1791(int i, int i_50_, int i_51_) {
		Class133 class133_52_ = this;
		return class133_52_;
	}

	public abstract void method1792(int i, int i_53_, int i_54_, int i_55_, int i_56_, int i_57_, int i_58_, int i_59_,
			long l);
}
