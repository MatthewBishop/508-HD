/* Class14_Sub24 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.Linkable;

public class Class14_Sub24 extends Linkable {
	public static int anInt3136;
	public static Class147[] aClass147Array3137;
	public static float[] aFloatArray3138;
	public int anInt3139;
	public static Class16[] aClass16Array3140;
	public static int[] anIntArray3141;
	public static float[] aFloatArray3142;
	public static int anInt3143;
	public static int anInt3144;
	public int anInt3145;
	public static int[] anIntArray3146;
	public float[] aFloatArray3147;
	public int anInt3148;
	public static float[] aFloatArray3149;
	public static float[] aFloatArray3150;
	public boolean aBoolean3151;
	public static float[] aFloatArray3152;
	public static float[] aFloatArray3153;
	public static boolean[] aBooleanArray3154;
	public static boolean aBoolean3155 = false;
	public boolean aBoolean3156;
	public static byte[] aByteArray3157;
	public static float[] aFloatArray3158;
	public static Class78[] aClass78Array3159;
	public byte[][] aByteArrayArray3160;
	public static int[] anIntArray3161;
	public int anInt3162;
	public static int anInt3163;
	public static Class80[] aClass80Array3164;
	public int anInt3165;
	public int anInt3166;
	public int anInt3167;
	public int anInt3168;
	public byte[] aByteArray3169;

	public Class14_Sub12_Sub1 method904(int[] is) {
		if (is != null && is[0] <= 0)
			return null;
		if (aByteArray3169 == null) {
			anInt3148 = 0;
			aFloatArray3147 = new float[anInt3163];
			aByteArray3169 = new byte[anInt3145];
			anInt3167 = 0;
			anInt3168 = 0;
		}
		for (/**/; anInt3168 < aByteArrayArray3160.length; anInt3168++) {
			if (is != null && is[0] <= 0)
				return null;
			float[] fs = method913(anInt3168);
			if (fs != null) {
				int i = anInt3167;
				int i_0_ = fs.length;
				if (i_0_ > anInt3145 - i)
					i_0_ = anInt3145 - i;
				for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
					int i_2_ = (int) (fs[i_1_] * 128.0F + 128.0F);
					if ((i_2_ & ~0xff) != 0)
						i_2_ = (i_2_ ^ 0xffffffff) >> 31;
					aByteArray3169[i++] = (byte) (i_2_ - 128);
				}
				if (is != null)
					is[0] -= i - anInt3167;
				anInt3167 = i;
			}
		}
		aFloatArray3147 = null;
		byte[] is_3_ = aByteArray3169;
		aByteArray3169 = null;
		return new Class14_Sub12_Sub1(anInt3139, is_3_, anInt3166, anInt3165, aBoolean3156);
	}

	public static void method905(byte[] is) {
		method911(is, 0);
		anInt3143 = 1 << method906(4);
		anInt3163 = 1 << method906(4);
		aFloatArray3153 = new float[anInt3163];
		for (int i = 0; i < 2; i++) {
			int i_4_ = i != 0 ? anInt3163 : anInt3143;
			int i_5_ = i_4_ >> 1;
			int i_6_ = i_4_ >> 2;
			int i_7_ = i_4_ >> 3;
			float[] fs = new float[i_5_];
			for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
				fs[i_8_ * 2] = (float) Math.cos(i_8_ * 4 * 3.141592653589793 / i_4_);
				fs[i_8_ * 2 + 1] = -(float) Math.sin(i_8_ * 4 * 3.141592653589793 / i_4_);
			}
			float[] fs_9_ = new float[i_5_];
			for (int i_10_ = 0; i_10_ < i_6_; i_10_++) {
				fs_9_[i_10_ * 2] = (float) Math.cos((i_10_ * 2 + 1) * 3.141592653589793 / (i_4_ * 2));
				fs_9_[i_10_ * 2 + 1] = (float) Math
						.sin((i_10_ * 2 + 1) * 3.141592653589793 / (i_4_ * 2));
			}
			float[] fs_11_ = new float[i_6_];
			for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
				fs_11_[i_12_ * 2] = (float) Math.cos((i_12_ * 4 + 2) * 3.141592653589793 / i_4_);
				fs_11_[i_12_ * 2 + 1] = -(float) Math.sin((i_12_ * 4 + 2) * 3.141592653589793 / i_4_);
			}
			int[] is_13_ = new int[i_7_];
			int i_14_ = Class48.method1192(i_7_ - 1, 25039);
			for (int i_15_ = 0; i_15_ < i_7_; i_15_++)
				is_13_[i_15_] = Static2.method1514(i_14_, -66, i_15_);
			if (i != 0) {
				aFloatArray3149 = fs;
				aFloatArray3152 = fs_9_;
				aFloatArray3138 = fs_11_;
				anIntArray3161 = is_13_;
			} else {
				aFloatArray3150 = fs;
				aFloatArray3158 = fs_9_;
				aFloatArray3142 = fs_11_;
				anIntArray3141 = is_13_;
			}
		}
		int i = method906(8) + 1;
		aClass78Array3159 = new Class78[i];
		for (int i_16_ = 0; i_16_ < i; i_16_++)
			aClass78Array3159[i_16_] = new Class78();
		int i_17_ = method906(6) + 1;
		for (int i_18_ = 0; i_18_ < i_17_; i_18_++)
			method906(16);
		i_17_ = method906(6) + 1;
		aClass16Array3140 = new Class16[i_17_];
		for (int i_19_ = 0; i_19_ < i_17_; i_19_++)
			aClass16Array3140[i_19_] = new Class16();
		int i_20_ = method906(6) + 1;
		aClass80Array3164 = new Class80[i_20_];
		for (int i_21_ = 0; i_21_ < i_20_; i_21_++)
			aClass80Array3164[i_21_] = new Class80();
		int i_22_ = method906(6) + 1;
		aClass147Array3137 = new Class147[i_22_];
		for (int i_23_ = 0; i_23_ < i_22_; i_23_++)
			aClass147Array3137[i_23_] = new Class147();
		int i_24_ = method906(6) + 1;
		aBooleanArray3154 = new boolean[i_24_];
		anIntArray3146 = new int[i_24_];
		for (int i_25_ = 0; i_25_ < i_24_; i_25_++) {
			aBooleanArray3154[i_25_] = method908() != 0;
			method906(16);
			method906(16);
			anIntArray3146[i_25_] = method906(8);
		}
	}

	public static int method906(int i) {
		int i_26_ = 0;
		int i_27_ = 0;
		int i_28_;
		for (/**/; i >= 8 - anInt3144; i -= i_28_) {
			i_28_ = 8 - anInt3144;
			int i_29_ = (1 << i_28_) - 1;
			i_26_ += (aByteArray3157[anInt3136] >> anInt3144 & i_29_) << i_27_;
			anInt3144 = 0;
			anInt3136++;
			i_27_ += i_28_;
		}
		if (i > 0) {
			i_28_ = (1 << i) - 1;
			i_26_ += (aByteArray3157[anInt3136] >> anInt3144 & i_28_) << i_27_;
			anInt3144 += i;
		}
		return i_26_;
	}

	public static float method907(int i) {
		int i_30_ = i & 0x1fffff;
		int i_31_ = i & ~0x7fffffff;
		int i_32_ = (i & 0x7fe00000) >> 21;
		if (i_31_ != 0)
			i_30_ = -i_30_;
		return (float) (i_30_ * Math.pow(2.0, i_32_ - 788));
	}

	public static int method908() {
		int i = aByteArray3157[anInt3136] >> anInt3144 & 0x1;
		anInt3144++;
		anInt3136 += anInt3144 >> 3;
		anInt3144 &= 0x7;
		return i;
	}

	public static boolean method909(Class9 class9) {
		if (!aBoolean3155) {
			byte[] is = class9.method163(0, 0);
			if (is == null)
				return false;
			method905(is);
			aBoolean3155 = true;
		}
		return true;
	}

	public static Class14_Sub24 method910(Class9 class9, int i, int i_33_) {
		if (!method909(class9)) {
			class9.method158(i_33_, i);
			return null;
		}
		byte[] is = class9.method163(i_33_, i);
		if (is == null)
			return null;
		return new Class14_Sub24(is);
	}

	public static void method911(byte[] is, int i) {
		aByteArray3157 = is;
		anInt3136 = i;
		anInt3144 = 0;
	}

	public void method912(byte[] is) {
		Buffer class14_sub10 = new Buffer(is);
		anInt3139 = class14_sub10.getInt((byte) -99);
		anInt3145 = class14_sub10.getInt((byte) -119);
		anInt3166 = class14_sub10.getInt((byte) -117);
		anInt3165 = class14_sub10.getInt((byte) -109);
		if (anInt3165 < 0) {
			anInt3165 ^= 0xffffffff;
			aBoolean3156 = true;
		}
		int i = class14_sub10.getInt((byte) -128);
		aByteArrayArray3160 = new byte[i][];
		for (int i_34_ = 0; i_34_ < i; i_34_++) {
			int i_35_ = 0;
			int i_36_;
			do {
				i_36_ = class14_sub10.readUByte();
				i_35_ += i_36_;
			} while (i_36_ >= 255);
			byte[] is_37_ = new byte[i_35_];
			class14_sub10.method824(i_35_, (byte) 75, 0, is_37_);
			aByteArrayArray3160[i_34_] = is_37_;
		}
	}

	public float[] method913(int i) {
		method911(aByteArrayArray3160[i], 0);
		method908();
		int i_38_ = method906(Class48.method1192(anIntArray3146.length - 1, 25039));
		boolean bool = aBooleanArray3154[i_38_];
		int i_39_ = bool ? anInt3163 : anInt3143;
		boolean bool_40_ = false;
		boolean bool_41_ = false;
		if (bool) {
			bool_40_ = method908() != 0;
			bool_41_ = method908() != 0;
		}
		int i_42_ = i_39_ >> 1;
		int i_43_;
		int i_44_;
		int i_45_;
		if (bool && !bool_40_) {
			i_43_ = (i_39_ >> 2) - (anInt3143 >> 2);
			i_44_ = (i_39_ >> 2) + (anInt3143 >> 2);
			i_45_ = anInt3143 >> 1;
		} else {
			i_43_ = 0;
			i_44_ = i_42_;
			i_45_ = i_39_ >> 1;
		}
		int i_46_;
		int i_47_;
		int i_48_;
		if (bool && !bool_41_) {
			i_46_ = i_39_ - (i_39_ >> 2) - (anInt3143 >> 2);
			i_47_ = i_39_ - (i_39_ >> 2) + (anInt3143 >> 2);
			i_48_ = anInt3143 >> 1;
		} else {
			i_46_ = i_42_;
			i_47_ = i_39_;
			i_48_ = i_39_ >> 1;
		}
		Class147 class147 = aClass147Array3137[anIntArray3146[i_38_]];
		int i_49_ = class147.anInt2366;
		int i_50_ = class147.anIntArray2367[i_49_];
		boolean bool_51_ = !aClass16Array3140[i_50_].method952();
		boolean bool_52_ = bool_51_;
		for (i_50_ = 0; i_50_ < class147.anInt2368; i_50_++) {
			Class80 class80 = aClass80Array3164[class147.anIntArray2369[i_50_]];
			float[] fs = aFloatArray3153;
			class80.method1393(fs, i_39_ >> 1, bool_52_);
		}
		if (!bool_51_) {
			i_50_ = class147.anInt2366;
			int i_53_ = class147.anIntArray2367[i_50_];
			aClass16Array3140[i_53_].method949(aFloatArray3153, i_39_ >> 1);
		}
		if (bool_51_) {
			for (i_50_ = i_39_ >> 1; i_50_ < i_39_; i_50_++)
				aFloatArray3153[i_50_] = 0.0F;
		} else {
			i_50_ = i_39_ >> 1;
			int i_54_ = i_39_ >> 2;
			int i_55_ = i_39_ >> 3;
			float[] fs = aFloatArray3153;
			for (int i_56_ = 0; i_56_ < i_50_; i_56_++)
				fs[i_56_] *= 0.5F;
			for (int i_57_ = i_50_; i_57_ < i_39_; i_57_++)
				fs[i_57_] = -fs[i_39_ - i_57_ - 1];
			float[] fs_58_ = bool ? aFloatArray3149 : aFloatArray3150;
			float[] fs_59_ = bool ? aFloatArray3152 : aFloatArray3158;
			float[] fs_60_ = bool ? aFloatArray3138 : aFloatArray3142;
			int[] is = bool ? anIntArray3161 : anIntArray3141;
			for (int i_61_ = 0; i_61_ < i_54_; i_61_++) {
				float f = fs[i_61_ * 4] - fs[i_39_ - i_61_ * 4 - 1];
				float f_62_ = fs[i_61_ * 4 + 2] - fs[i_39_ - i_61_ * 4 - 3];
				float f_63_ = fs_58_[i_61_ * 2];
				float f_64_ = fs_58_[i_61_ * 2 + 1];
				fs[i_39_ - i_61_ * 4 - 1] = f * f_63_ - f_62_ * f_64_;
				fs[i_39_ - i_61_ * 4 - 3] = f * f_64_ + f_62_ * f_63_;
			}
			for (int i_65_ = 0; i_65_ < i_55_; i_65_++) {
				float f = fs[i_50_ + 3 + i_65_ * 4];
				float f_66_ = fs[i_50_ + 1 + i_65_ * 4];
				float f_67_ = fs[i_65_ * 4 + 3];
				float f_68_ = fs[i_65_ * 4 + 1];
				fs[i_50_ + 3 + i_65_ * 4] = f + f_67_;
				fs[i_50_ + 1 + i_65_ * 4] = f_66_ + f_68_;
				float f_69_ = fs_58_[i_50_ - 4 - i_65_ * 4];
				float f_70_ = fs_58_[i_50_ - 3 - i_65_ * 4];
				fs[i_65_ * 4 + 3] = (f - f_67_) * f_69_ - (f_66_ - f_68_) * f_70_;
				fs[i_65_ * 4 + 1] = (f_66_ - f_68_) * f_69_ + (f - f_67_) * f_70_;
			}
			int i_71_ = Class48.method1192(i_39_ - 1, 25039);
			for (int i_72_ = 0; i_72_ < i_71_ - 3; i_72_++) {
				int i_73_ = i_39_ >> i_72_ + 2;
				int i_74_ = 8 << i_72_;
				for (int i_75_ = 0; i_75_ < 2 << i_72_; i_75_++) {
					int i_76_ = i_39_ - i_73_ * 2 * i_75_;
					int i_77_ = i_39_ - i_73_ * (i_75_ * 2 + 1);
					for (int i_78_ = 0; i_78_ < i_39_ >> i_72_ + 4; i_78_++) {
						int i_79_ = i_78_ * 4;
						float f = fs[i_76_ - 1 - i_79_];
						float f_80_ = fs[i_76_ - 3 - i_79_];
						float f_81_ = fs[i_77_ - 1 - i_79_];
						float f_82_ = fs[i_77_ - 3 - i_79_];
						fs[i_76_ - 1 - i_79_] = f + f_81_;
						fs[i_76_ - 3 - i_79_] = f_80_ + f_82_;
						float f_83_ = fs_58_[i_78_ * i_74_];
						float f_84_ = fs_58_[i_78_ * i_74_ + 1];
						fs[i_77_ - 1 - i_79_] = (f - f_81_) * f_83_ - (f_80_ - f_82_) * f_84_;
						fs[i_77_ - 3 - i_79_] = (f_80_ - f_82_) * f_83_ + (f - f_81_) * f_84_;
					}
				}
			}
			for (int i_85_ = 1; i_85_ < i_55_ - 1; i_85_++) {
				int i_86_ = is[i_85_];
				if (i_85_ < i_86_) {
					int i_87_ = i_85_ * 8;
					int i_88_ = i_86_ * 8;
					float f = fs[i_87_ + 1];
					fs[i_87_ + 1] = fs[i_88_ + 1];
					fs[i_88_ + 1] = f;
					f = fs[i_87_ + 3];
					fs[i_87_ + 3] = fs[i_88_ + 3];
					fs[i_88_ + 3] = f;
					f = fs[i_87_ + 5];
					fs[i_87_ + 5] = fs[i_88_ + 5];
					fs[i_88_ + 5] = f;
					f = fs[i_87_ + 7];
					fs[i_87_ + 7] = fs[i_88_ + 7];
					fs[i_88_ + 7] = f;
				}
			}
			for (int i_89_ = 0; i_89_ < i_50_; i_89_++)
				fs[i_89_] = fs[i_89_ * 2 + 1];
			for (int i_90_ = 0; i_90_ < i_55_; i_90_++) {
				fs[i_39_ - 1 - i_90_ * 2] = fs[i_90_ * 4];
				fs[i_39_ - 2 - i_90_ * 2] = fs[i_90_ * 4 + 1];
				fs[i_39_ - i_54_ - 1 - i_90_ * 2] = fs[i_90_ * 4 + 2];
				fs[i_39_ - i_54_ - 2 - i_90_ * 2] = fs[i_90_ * 4 + 3];
			}
			for (int i_91_ = 0; i_91_ < i_55_; i_91_++) {
				float f = fs_60_[i_91_ * 2];
				float f_92_ = fs_60_[i_91_ * 2 + 1];
				float f_93_ = fs[i_50_ + i_91_ * 2];
				float f_94_ = fs[i_50_ + i_91_ * 2 + 1];
				float f_95_ = fs[i_39_ - 2 - i_91_ * 2];
				float f_96_ = fs[i_39_ - 1 - i_91_ * 2];
				float f_97_ = f_92_ * (f_93_ - f_95_) + f * (f_94_ + f_96_);
				fs[i_50_ + i_91_ * 2] = (f_93_ + f_95_ + f_97_) * 0.5F;
				fs[i_39_ - 2 - i_91_ * 2] = (f_93_ + f_95_ - f_97_) * 0.5F;
				f_97_ = f_92_ * (f_94_ + f_96_) - f * (f_93_ - f_95_);
				fs[i_50_ + i_91_ * 2 + 1] = (f_94_ - f_96_ + f_97_) * 0.5F;
				fs[i_39_ - 1 - i_91_ * 2] = (-f_94_ + f_96_ + f_97_) * 0.5F;
			}
			for (int i_98_ = 0; i_98_ < i_54_; i_98_++) {
				fs[i_98_] = (fs[i_98_ * 2 + i_50_] * fs_59_[i_98_ * 2]
						+ fs[i_98_ * 2 + 1 + i_50_] * fs_59_[i_98_ * 2 + 1]);
				fs[i_50_ - 1 - i_98_] = (fs[i_98_ * 2 + i_50_] * fs_59_[i_98_ * 2 + 1]
						- fs[i_98_ * 2 + 1 + i_50_] * fs_59_[i_98_ * 2]);
			}
			for (int i_99_ = 0; i_99_ < i_54_; i_99_++)
				fs[i_39_ - i_54_ + i_99_] = -fs[i_99_];
			for (int i_100_ = 0; i_100_ < i_54_; i_100_++)
				fs[i_100_] = fs[i_54_ + i_100_];
			for (int i_101_ = 0; i_101_ < i_54_; i_101_++)
				fs[i_54_ + i_101_] = -fs[i_54_ - i_101_ - 1];
			for (int i_102_ = 0; i_102_ < i_54_; i_102_++)
				fs[i_50_ + i_102_] = fs[i_39_ - i_102_ - 1];
			for (int i_103_ = i_43_; i_103_ < i_44_; i_103_++) {
				float f = (float) Math
						.sin((i_103_ - i_43_ + 0.5) / i_45_ * 0.5 * 3.141592653589793);
				aFloatArray3153[i_103_] *= (float) Math.sin(f * 1.5707963267948966 * f);
			}
			for (int i_104_ = i_46_; i_104_ < i_47_; i_104_++) {
				float f = (float) Math
						.sin(((i_104_ - i_46_ + 0.5) / i_48_ * 0.5 * 3.141592653589793)
								+ 1.5707963267948966);
				aFloatArray3153[i_104_] *= (float) Math.sin(f * 1.5707963267948966 * f);
			}
		}
		float[] fs = null;
		if (anInt3148 > 0) {
			int i_105_ = anInt3148 + i_39_ >> 2;
			fs = new float[i_105_];
			if (!aBoolean3151) {
				for (int i_106_ = 0; i_106_ < anInt3162; i_106_++) {
					int i_107_ = (anInt3148 >> 1) + i_106_;
					fs[i_106_] += aFloatArray3147[i_107_];
				}
			}
			if (!bool_51_) {
				for (int i_108_ = i_43_; i_108_ < i_39_ >> 1; i_108_++) {
					int i_109_ = fs.length - (i_39_ >> 1) + i_108_;
					fs[i_109_] += aFloatArray3153[i_108_];
				}
			}
		}
		float[] fs_110_ = aFloatArray3147;
		aFloatArray3147 = aFloatArray3153;
		aFloatArray3153 = fs_110_;
		anInt3148 = i_39_;
		anInt3162 = i_47_ - (i_39_ >> 1);
		aBoolean3151 = bool_51_;
		return fs;
	}

	public static void method914() {
		aByteArray3157 = null;
		aClass78Array3159 = null;
		aClass16Array3140 = null;
		aClass80Array3164 = null;
		aClass147Array3137 = null;
		aBooleanArray3154 = null;
		anIntArray3146 = null;
		aFloatArray3153 = null;
		aFloatArray3150 = null;
		aFloatArray3158 = null;
		aFloatArray3142 = null;
		aFloatArray3149 = null;
		aFloatArray3152 = null;
		aFloatArray3138 = null;
		anIntArray3141 = null;
		anIntArray3161 = null;
	}

	public Class14_Sub24(byte[] is) {
		method912(is);
	}
}
