/* Class151 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import javax.media.opengl.GL;

import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.Class13;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.RT4;

public class Class151 {
	public static Class13[][] aClass13ArrayArray2427;
	public static Class148_Sub1 aClass148_Sub1_2428;
	public static int anInt2429;
	public static int anInt2430;
	public static Class148_Sub1[] aClass148_Sub1Array2431;

	public static void method2026(Class148_Sub1 class148_sub1, int i, int i_0_, int i_1_) {
		if (class148_sub1 != null) {
			int i_2_ = i - (i_0_ * AthmosphericEffects.anInt934 >> 8) >> 3;
			int i_3_ = i_1_ - (i_0_ * AthmosphericEffects.anInt928 >> 8) >> 3;
			method2028(class148_sub1, aClass148_Sub1_2428, i_2_ + 1, i_3_ + 1);
		}
	}

	public static void method2027(byte[] is, byte[] is_4_, int i, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (int i_9_ = -16; i_9_ < 0; i_9_++) {
			for (int i_10_ = -4; i_10_ < 0; i_10_++) {
				is[i_5_++] += is_4_[i];
				i += i_7_;
				is[i_5_++] += is_4_[i];
				i += i_7_;
				is[i_5_++] += is_4_[i];
				i += i_7_;
				is[i_5_++] += is_4_[i];
				i += i_7_;
			}
			i_5_ += i_6_;
			i += i_8_;
		}
	}

	public static void method2028(Class148_Sub1 class148_sub1, Class148_Sub1 class148_sub1_11_, int i, int i_12_) {
		i += class148_sub1.anInt2375;
		i_12_ += class148_sub1.anInt2374;
		int i_13_ = i + i_12_ * class148_sub1_11_.anInt2371;
		int i_14_ = 0;
		int i_15_ = class148_sub1.anInt2376;
		int i_16_ = class148_sub1.anInt2371;
		int i_17_ = class148_sub1_11_.anInt2371 - i_16_;
		int i_18_ = 0;
		if (i_12_ <= 0) {
			int i_19_ = 1 - i_12_;
			i_15_ -= i_19_;
			i_14_ += i_19_ * i_16_;
			i_13_ += i_19_ * class148_sub1_11_.anInt2371;
			i_12_ = 1;
		}
		if (i_12_ + i_15_ >= class148_sub1_11_.anInt2376) {
			int i_20_ = i_12_ + i_15_ + 1 - class148_sub1_11_.anInt2376;
			i_15_ -= i_20_;
		}
		if (i <= 0) {
			int i_21_ = 1 - i;
			i_16_ -= i_21_;
			i_14_ += i_21_;
			i_13_ += i_21_;
			i_18_ += i_21_;
			i_17_ += i_21_;
			i = 1;
		}
		if (i + i_16_ >= class148_sub1_11_.anInt2371) {
			int i_22_ = i + i_16_ + 1 - class148_sub1_11_.anInt2371;
			i_16_ -= i_22_;
			i_18_ += i_22_;
			i_17_ += i_22_;
		}
		if (i_16_ > 0 && i_15_ > 0) {
			method2033(class148_sub1_11_.aByteArray3689, class148_sub1.aByteArray3689, i_14_, i_13_, i_16_, i_15_,
					i_17_, i_18_);
			method2034(i, i_12_, i_16_, i_15_);
		}
	}

	public static void method2029(int i, int i_23_) {
		anInt2429 = i + 7 >> 3;
		anInt2430 = i_23_ + 7 >> 3;
		aClass148_Sub1_2428 = new Class148_Sub1(anInt2429 * 128 + 2, anInt2430 * 128 + 2, 0);
		aClass13ArrayArray2427 = new Class13[anInt2429][anInt2430];
		for (int i_24_ = 0; i_24_ < anInt2429; i_24_++) {
			for (int i_25_ = 0; i_25_ < anInt2430; i_25_++)
				aClass13ArrayArray2427[i_24_][i_25_] = new Class13();
		}
	}

	public static void method2030(Class148_Sub1 class148_sub1, int i, int i_26_, int i_27_) {
		if (class148_sub1 != null) {
			int i_28_ = i - (i_26_ * AthmosphericEffects.anInt934 >> 8) >> 3;
			int i_29_ = i_27_ - (i_26_ * AthmosphericEffects.anInt928 >> 8) >> 3;
			method2035(class148_sub1, aClass148_Sub1_2428, i_28_ + 1, i_29_ + 1);
		}
	}

	public static boolean method2031(Class148_Sub1 class148_sub1, Class148_Sub1 class148_sub1_30_, int i, int i_31_) {
		i += class148_sub1.anInt2375;
		i_31_ += class148_sub1.anInt2374;
		int i_32_ = i + i_31_ * class148_sub1_30_.anInt2371;
		int i_33_ = class148_sub1.anInt2376;
		int i_34_ = class148_sub1.anInt2371;
		int i_35_ = class148_sub1_30_.anInt2371 - i_34_;
		if (i_31_ <= 0) {
			int i_36_ = 1 - i_31_;
			i_33_ -= i_36_;
			i_32_ += i_36_ * class148_sub1_30_.anInt2371;
			i_31_ = 1;
		}
		if (i_31_ + i_33_ >= class148_sub1_30_.anInt2376) {
			int i_37_ = i_31_ + i_33_ + 1 - class148_sub1_30_.anInt2376;
			i_33_ -= i_37_;
		}
		if (i <= 0) {
			int i_38_ = 1 - i;
			i_34_ -= i_38_;
			i_32_ += i_38_;
			i_35_ += i_38_;
			i = 1;
		}
		if (i + i_34_ >= class148_sub1_30_.anInt2371) {
			int i_39_ = i + i_34_ + 1 - class148_sub1_30_.anInt2371;
			i_34_ -= i_39_;
			i_35_ += i_39_;
		}
		if (i_34_ <= 0 || i_33_ <= 0)
			return false;
		int i_40_ = 8;
		i_35_ += (i_40_ - 1) * class148_sub1_30_.anInt2371;
		method2034(i, i_31_, i_34_, i_33_);
		return method2039(class148_sub1_30_.aByteArray3689, i_32_, i_34_, i_33_, i_35_, i_40_);
	}

	public static boolean method2032(Class148_Sub1 class148_sub1, int i, int i_41_, int i_42_) {
		if (class148_sub1 == null)
			return false;
		int i_43_ = i - (i_41_ * AthmosphericEffects.anInt934 >> 8) >> 3;
		int i_44_ = i_42_ - (i_41_ * AthmosphericEffects.anInt928 >> 8) >> 3;
		return method2031(class148_sub1, aClass148_Sub1_2428, i_43_ + 1, i_44_ + 1);
	}

	public static void method2033(byte[] is, byte[] is_45_, int i, int i_46_, int i_47_, int i_48_, int i_49_,
			int i_50_) {
		int i_51_ = -(i_47_ >> 2);
		i_47_ = -(i_47_ & 0x3);
		for (int i_52_ = -i_48_; i_52_ < 0; i_52_++) {
			for (int i_53_ = i_51_; i_53_ < 0; i_53_++) {
				is[i_46_++] += is_45_[i++];
				is[i_46_++] += is_45_[i++];
				is[i_46_++] += is_45_[i++];
				is[i_46_++] += is_45_[i++];
			}
			for (int i_54_ = i_47_; i_54_ < 0; i_54_++)
				is[i_46_++] += is_45_[i++];
			i_46_ += i_49_;
			i += i_50_;
		}
	}

	public static void method2034(int i, int i_55_, int i_56_, int i_57_) {
		int i_58_ = i - 1 >> 7;
		int i_59_ = i - 1 + i_56_ - 1 >> 7;
		int i_60_ = i_55_ - 1 >> 7;
		int i_61_ = i_55_ - 1 + i_57_ - 1 >> 7;
		for (int i_62_ = i_58_; i_62_ <= i_59_; i_62_++) {
			for (int i_63_ = i_60_; i_63_ <= i_61_; i_63_++)
				aClass13ArrayArray2427[i_62_][i_63_].aBoolean346 = true;
		}
	}

	public static void method2035(Class148_Sub1 class148_sub1, Class148_Sub1 class148_sub1_64_, int i, int i_65_) {
		i += class148_sub1.anInt2375;
		i_65_ += class148_sub1.anInt2374;
		int i_66_ = i + i_65_ * class148_sub1_64_.anInt2371;
		int i_67_ = 0;
		int i_68_ = class148_sub1.anInt2376;
		int i_69_ = class148_sub1.anInt2371;
		int i_70_ = class148_sub1_64_.anInt2371 - i_69_;
		int i_71_ = 0;
		if (i_65_ <= 0) {
			int i_72_ = 1 - i_65_;
			i_68_ -= i_72_;
			i_67_ += i_72_ * i_69_;
			i_66_ += i_72_ * class148_sub1_64_.anInt2371;
			i_65_ = 1;
		}
		if (i_65_ + i_68_ >= class148_sub1_64_.anInt2376) {
			int i_73_ = i_65_ + i_68_ + 1 - class148_sub1_64_.anInt2376;
			i_68_ -= i_73_;
		}
		if (i <= 0) {
			int i_74_ = 1 - i;
			i_69_ -= i_74_;
			i_67_ += i_74_;
			i_66_ += i_74_;
			i_71_ += i_74_;
			i_70_ += i_74_;
			i = 1;
		}
		if (i + i_69_ >= class148_sub1_64_.anInt2371) {
			int i_75_ = i + i_69_ + 1 - class148_sub1_64_.anInt2371;
			i_69_ -= i_75_;
			i_71_ += i_75_;
			i_70_ += i_75_;
		}
		if (i_69_ > 0 && i_68_ > 0) {
			method2041(class148_sub1_64_.aByteArray3689, class148_sub1.aByteArray3689, i_67_, i_66_, i_69_, i_68_,
					i_70_, i_71_);
			method2034(i, i_65_, i_69_, i_68_);
		}
	}

	public static void method2036(byte[] is, byte[] is_76_, int i, int i_77_, int i_78_, int i_79_, int i_80_) {
		for (int i_81_ = -16; i_81_ < 0; i_81_++) {
			for (int i_82_ = -4; i_82_ < 0; i_82_++) {
				is[i_77_++] += 1 - is_76_[i];
				i += i_79_;
				is[i_77_++] += 1 - is_76_[i];
				i += i_79_;
				is[i_77_++] += 1 - is_76_[i];
				i += i_79_;
				is[i_77_++] += 1 - is_76_[i];
				i += i_79_;
			}
			i_77_ += i_78_;
			i += i_80_;
		}
	}

	public static void method2037(Class148_Sub1 class148_sub1, Class148_Sub1 class148_sub1_83_, int i, int i_84_,
			int i_85_, boolean bool) {
		if (i > 0 && i_84_ > 0 && i + 16 < class148_sub1_83_.anInt2371 && i_84_ + 16 < class148_sub1_83_.anInt2376) {
			int i_86_ = i + i_84_ * class148_sub1_83_.anInt2371;
			int i_87_ = class148_sub1_83_.anInt2371 - 16;
			int i_88_;
			int i_89_;
			int i_90_;
			if (i_85_ == 0) {
				i_88_ = 240;
				i_89_ = 1;
				i_90_ = -i_89_ * 16 - 16;
			} else if (i_85_ == 1) {
				i_88_ = 255;
				i_89_ = -16;
				i_90_ = -i_89_ * 16 - 1;
			} else if (i_85_ == 2) {
				i_88_ = 15;
				i_89_ = -1;
				i_90_ = -i_89_ * 16 + 16;
			} else {
				i_88_ = 0;
				i_89_ = 16;
				i_90_ = -i_89_ * 16 + 1;
			}
			if (bool)
				method2036(class148_sub1_83_.aByteArray3689, class148_sub1.aByteArray3689, i_88_, i_86_, i_87_, i_89_,
						i_90_);
			else
				method2027(class148_sub1_83_.aByteArray3689, class148_sub1.aByteArray3689, i_88_, i_86_, i_87_, i_89_,
						i_90_);
			method2034(i, i_84_, 16, 16);
		}
	}

	public static void method2038(int i, int i_91_, int i_92_, int i_93_, boolean[][] bools, int[][] is) {
		GL gl = RT4GL.gl;
		RT4GL.method1638(1);
		RT4GL.method1656(1);
		RT4GL.method1651();
		RT4GL.method1639(false);
		RT4.method1778(0, 0);
		gl.glDepthMask(false);
		for (int i_94_ = 0; i_94_ < anInt2429; i_94_++) {
			for (int i_95_ = 0; i_95_ < anInt2430; i_95_++) {
				while_176_: for (int i_96_ = i_94_ * 8; i_96_ < i_94_ * 8 + 8; i_96_++) {
					if (i_96_ - i >= -i_92_ && i_96_ - i <= i_92_) {
						for (int i_97_ = i_95_ * 8; i_97_ < i_95_ * 8 + 8; i_97_++) {
							if (i_97_ - i_91_ >= -i_92_ && i_97_ - i_91_ <= i_92_
									&& (bools[i_96_ - i + i_92_][i_97_ - i_91_ + i_92_])) {
								Class13 class13 = aClass13ArrayArray2427[i_94_][i_95_];
								if (class13.aBoolean346) {
									class13.method226(aClass148_Sub1_2428, i_94_, i_95_);
									class13.aBoolean346 = false;
								}
								gl.glPushMatrix();
								gl.glTranslatef((float) (i_94_ * 1024), 0.0F, (float) (i_95_ * 1024));
								class13.method228();
								gl.glPopMatrix();
								break while_176_;
							}
						}
					}
				}
			}
		}
		gl.glEnableClientState(32886);
		gl.glDepthMask(true);
		RT4GL.method1645();
	}

	public static boolean method2039(byte[] is, int i, int i_98_, int i_99_, int i_100_, int i_101_) {
		int i_102_ = i_98_ % i_101_;
		int i_103_;
		if (i_102_ != 0)
			i_103_ = i_101_ - i_102_;
		else
			i_103_ = 0;
		int i_104_ = -((i_99_ + i_101_ - 1) / i_101_);
		int i_105_ = -((i_98_ + i_101_ - 1) / i_101_);
		for (int i_106_ = i_104_; i_106_ < 0; i_106_++) {
			for (int i_107_ = i_105_; i_107_ < 0; i_107_++) {
				if (is[i] == 0)
					return true;
				i += i_101_;
			}
			i -= i_103_;
			if (is[i - 1] == 0)
				return true;
			i += i_100_;
		}
		return false;
	}

	public static void method2040() {
		aClass148_Sub1_2428 = null;
		aClass148_Sub1Array2431 = null;
		aClass13ArrayArray2427 = null;
	}

	public static void method2041(byte[] is, byte[] is_108_, int i, int i_109_, int i_110_, int i_111_, int i_112_,
			int i_113_) {
		int i_114_ = -(i_110_ >> 2);
		i_110_ = -(i_110_ & 0x3);
		for (int i_115_ = -i_111_; i_115_ < 0; i_115_++) {
			for (int i_116_ = i_114_; i_116_ < 0; i_116_++) {
				is[i_109_++] -= is_108_[i++];
				is[i_109_++] -= is_108_[i++];
				is[i_109_++] -= is_108_[i++];
				is[i_109_++] -= is_108_[i++];
			}
			for (int i_117_ = i_110_; i_117_ < 0; i_117_++)
				is[i_109_++] -= is_108_[i++];
			i_109_ += i_112_;
			i += i_113_;
		}
	}

	public static void method2042(int i, int i_118_, boolean bool, boolean bool_119_, int i_120_, int i_121_,
			int i_122_, int i_123_, int i_124_, int i_125_) {
		if ((!bool || !bool_119_) && (!bool || i != 1) && (!bool_119_ || i != 0)) {
			int i_126_ = i_120_ << 7;
			int i_127_ = i_122_ + i_123_ + i_124_ + i_125_ >> 2;
			int i_128_ = i_121_ << 7;
			int i_129_ = i_126_ - (i_127_ * AthmosphericEffects.anInt934 >> 8) >> 3;
			int i_130_ = i_128_ - (i_127_ * AthmosphericEffects.anInt928 >> 8) >> 3;
			if (i == 0 || i == 1 || !bool && !bool_119_)
				method2028(aClass148_Sub1Array2431[1], aClass148_Sub1_2428, i_129_ + 1, i_130_ + 1);
			else
				method2037(aClass148_Sub1Array2431[i], aClass148_Sub1_2428, i_129_ + 1, i_130_ + 1, i_118_, bool);
		}
	}
}
