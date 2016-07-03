/* ModelHD - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.cache.anim.AnimFrame;
import com.jagex.cache.anim.AnimFrameBase;
import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.Buffer;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.RT4;
import com.jagex.rt4.VertexBuffer;
import com.jagex.rt4.VertexBufferPointer;

import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Static;

public class ModelHD extends Class133_Sub7 {
	public static ByteBuffer aByteBuffer5050;
	public static ModelHD aClass133_Sub7_Sub2_5049 = new ModelHD();
	public static ModelHD aClass133_Sub7_Sub2_5051 = new ModelHD();
	public static ModelHD aClass133_Sub7_Sub2_5052 = new ModelHD();
	public static ModelHD aClass133_Sub7_Sub2_5053 = new ModelHD();
	public static Buffer aClass14_Sub10_5011 = new Buffer(10000);
	public static float aFloat5056;
	public static float aFloat5058;
	public static float aFloat5060;
	public static float aFloat5062;
	public static float aFloat5063;
	public static float aFloat5064;
	public static long[] aLongArray5048;
	public static int[] anIntArray5057;
	public static int[] anIntArray5061 = new int[1];
	public static int centroidX;
	public static int centroidY;
	public static int centroidZ;
	public boolean aBoolean5009;
	public byte aByte5023;
	public byte aByte5026;
	public byte[] aByteArray5016;
	public VertexBuffer aClass29_5020;
	public VertexBufferPointer aClass41_5018;
	public VertexBufferPointer aClass41_5028;
	public VertexBufferPointer aClass41_5029;
	public VertexBufferPointer aClass41_5030;
	public VertexBufferPointer aClass41_5046;
	public Class50 aClass50_5013;
	public Class77 aClass77_5039;
	public float[] aFloatArray5012;
	public float[] aFloatArray5047;
	public int anInt5014 = 0;
	public int anInt5033;
	public int anInt5040;
	public int[] anIntArray5031;
	public int[] anIntArray5034;
	public int[] anIntArray5035;
	public int[][] anIntArrayArray5015;
	public short aShort5024;
	public short aShort5032;
	public short[] aShortArray5017;
	public short[] aShortArray5019;
	public short[] aShortArray5021;
	public short[] aShortArray5025;
	public short[] aShortArray5036;
	public short[] aShortArray5037;
	public short[] aShortArray5038;
	public short[] aShortArray5041;
	public short[] aShortArray5042;
	public short[] aShortArray5045;
	public byte[] faceAlphas;
	public int[][] vertexGroups;
	public int[] vertexX;
	public int[] vertexY;
	public int[] vertexZ;

	static {
		anIntArray5057 = new int[1];
	}

	public static void method1888(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, float[] fs,
			int i_6_, float f, float f_7_, float f_8_) {
		i -= i_2_;
		i_0_ -= i_3_;
		i_1_ -= i_4_;
		float f_9_ = (float) i * fs[0] + (float) i_0_ * fs[1] + (float) i_1_ * fs[2];
		float f_10_ = (float) i * fs[3] + (float) i_0_ * fs[4] + (float) i_1_ * fs[5];
		float f_11_ = (float) i * fs[6] + (float) i_0_ * fs[7] + (float) i_1_ * fs[8];
		float f_12_;
		float f_13_;
		if (i_5_ == 0) {
			f_12_ = f_9_ + f + 0.5F;
			f_13_ = -f_11_ + f_8_ + 0.5F;
		} else if (i_5_ == 1) {
			f_12_ = f_9_ + f + 0.5F;
			f_13_ = f_11_ + f_8_ + 0.5F;
		} else if (i_5_ == 2) {
			f_12_ = -f_9_ + f + 0.5F;
			f_13_ = -f_10_ + f_7_ + 0.5F;
		} else if (i_5_ == 3) {
			f_12_ = f_9_ + f + 0.5F;
			f_13_ = -f_10_ + f_7_ + 0.5F;
		} else if (i_5_ == 4) {
			f_12_ = f_11_ + f_8_ + 0.5F;
			f_13_ = -f_10_ + f_7_ + 0.5F;
		} else {
			f_12_ = -f_11_ + f_8_ + 0.5F;
			f_13_ = -f_10_ + f_7_ + 0.5F;
		}
		if (i_6_ == 1) {
			float f_14_ = f_12_;
			f_12_ = -f_13_;
			f_13_ = f_14_;
		} else if (i_6_ == 2) {
			f_12_ = -f_12_;
			f_13_ = -f_13_;
		} else if (i_6_ == 3) {
			float f_15_ = f_12_;
			f_12_ = f_13_;
			f_13_ = -f_15_;
		}
		aFloat5056 = f_12_;
		aFloat5063 = f_13_;
	}

	public static float[] method1894(float[] fs, int i) {
		float[] fs_16_ = new float[i];
		Class72.method1323(fs, 0, fs_16_, 0, i);
		return fs_16_;
	}

	public static int method1898(float f, float f_17_, float f_18_) {
		float f_19_ = f < 0.0F ? -f : f;
		float f_20_ = f_17_ < 0.0F ? -f_17_ : f_17_;
		float f_21_ = f_18_ < 0.0F ? -f_18_ : f_18_;
		if (f_20_ > f_19_ && f_20_ > f_21_) {
			if (f_17_ > 0.0F)
				return 0;
			return 1;
		}
		if (f_21_ > f_19_ && f_21_ > f_20_) {
			if (f_18_ > 0.0F)
				return 2;
			return 3;
		}
		if (f > 0.0F)
			return 4;
		return 5;
	}

	public static int method1904(int i, short i_22_, int i_23_, byte i_24_) {
		int i_25_ = Class3.anIntArray119[ModelSD.method1880(i, i_23_)];
		if (i_22_ != -1) {
			int i_26_ = Class3.anInterface3_117.method14(i_22_ & 0xffff, 25);
			if (i_26_ != 0) {
				int i_27_;
				if (i_23_ < 0)
					i_27_ = 0;
				else if (i_23_ > 127)
					i_27_ = 16777215;
				else
					i_27_ = i_23_ * 131586;
				if (i_26_ == 256)
					i_25_ = i_27_;
				else {
					int i_28_ = i_26_;
					int i_29_ = 256 - i_26_;
					i_25_ = ((((i_27_ & 0xff00ff) * i_28_ + (i_25_ & 0xff00ff) * i_29_) & ~0xff00ff)
							+ (((i_27_ & 0xff00) * i_28_ + (i_25_ & 0xff00) * i_29_) & 0xff0000)) >> 8;
				}
			}
			int i_30_ = Class3.anInterface3_117.method9(i_22_ & 0xffff);
			if (i_30_ != 0) {
				i_30_ += 256;
				int i_31_ = ((i_25_ & 0xff0000) >> 16) * i_30_;
				if (i_31_ > 65535)
					i_31_ = 65535;
				int i_32_ = ((i_25_ & 0xff00) >> 8) * i_30_;
				if (i_32_ > 65535)
					i_32_ = 65535;
				int i_33_ = (i_25_ & 0xff) * i_30_;
				if (i_33_ > 65535)
					i_33_ = 65535;
				i_25_ = (i_31_ << 8 & 0xff0000) + (i_32_ & 0xff00) + (i_33_ >> 8);
			}
		}
		return (i_25_ << 8) + (255 - (i_24_ & 0xff));
	}

	public static void method1908() {
		aClass133_Sub7_Sub2_5049 = new ModelHD();
		aClass133_Sub7_Sub2_5051 = new ModelHD();
		aClass133_Sub7_Sub2_5052 = new ModelHD();
		aClass133_Sub7_Sub2_5053 = new ModelHD();
	}

	public static void method1909() {
		aLongArray5048 = null;
		aClass14_Sub10_5011 = null;
		aByteBuffer5050 = null;
		aClass133_Sub7_Sub2_5049 = null;
		aClass133_Sub7_Sub2_5051 = null;
		aClass133_Sub7_Sub2_5052 = null;
		aClass133_Sub7_Sub2_5053 = null;
		anIntArray5061 = null;
		anIntArray5057 = null;
	}

	public static float[] method1911(int i, int i_34_, int i_35_, int i_36_, float f, float f_37_, float f_38_) {
		float[] fs = new float[9];
		float[] fs_39_ = new float[9];
		float f_40_ = (float) Math.cos((double) ((float) i_36_ * 0.024543693F));
		float f_41_ = (float) Math.sin((double) ((float) i_36_ * 0.024543693F));
		float f_42_ = 1.0F - f_40_;
		fs[0] = f_40_;
		fs[1] = 0.0F;
		fs[2] = f_41_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_41_;
		fs[7] = 0.0F;
		fs[8] = f_40_;
		float[] fs_43_ = new float[9];
		float f_44_ = 1.0F;
		float f_45_ = 0.0F;
		f_40_ = (float) i_34_ / 32767.0F;
		f_41_ = -(float) Math.sqrt((double) (1.0F - f_40_ * f_40_));
		f_42_ = 1.0F - f_40_;
		float f_46_ = (float) Math.sqrt((double) (i * i + i_35_ * i_35_));
		if (f_46_ == 0.0F && f_40_ == 0.0F)
			fs_39_ = fs;
		else {
			if (f_46_ != 0.0F) {
				f_44_ = (float) -i_35_ / f_46_;
				f_45_ = (float) i / f_46_;
			}
			fs_43_[0] = f_40_ + f_44_ * f_44_ * f_42_;
			fs_43_[1] = f_45_ * f_41_;
			fs_43_[2] = f_45_ * f_44_ * f_42_;
			fs_43_[3] = -f_45_ * f_41_;
			fs_43_[4] = f_40_;
			fs_43_[5] = f_44_ * f_41_;
			fs_43_[6] = f_44_ * f_45_ * f_42_;
			fs_43_[7] = -f_44_ * f_41_;
			fs_43_[8] = f_40_ + f_45_ * f_45_ * f_42_;
			fs_39_[0] = fs[0] * fs_43_[0] + fs[1] * fs_43_[3] + fs[2] * fs_43_[6];
			fs_39_[1] = fs[0] * fs_43_[1] + fs[1] * fs_43_[4] + fs[2] * fs_43_[7];
			fs_39_[2] = fs[0] * fs_43_[2] + fs[1] * fs_43_[5] + fs[2] * fs_43_[8];
			fs_39_[3] = fs[3] * fs_43_[0] + fs[4] * fs_43_[3] + fs[5] * fs_43_[6];
			fs_39_[4] = fs[3] * fs_43_[1] + fs[4] * fs_43_[4] + fs[5] * fs_43_[7];
			fs_39_[5] = fs[3] * fs_43_[2] + fs[4] * fs_43_[5] + fs[5] * fs_43_[8];
			fs_39_[6] = fs[6] * fs_43_[0] + fs[7] * fs_43_[3] + fs[8] * fs_43_[6];
			fs_39_[7] = fs[6] * fs_43_[1] + fs[7] * fs_43_[4] + fs[8] * fs_43_[7];
			fs_39_[8] = fs[6] * fs_43_[2] + fs[7] * fs_43_[5] + fs[8] * fs_43_[8];
		}
		fs_39_[0] *= f;
		fs_39_[1] *= f;
		fs_39_[2] *= f;
		fs_39_[3] *= f_37_;
		fs_39_[4] *= f_37_;
		fs_39_[5] *= f_37_;
		fs_39_[6] *= f_38_;
		fs_39_[7] *= f_38_;
		fs_39_[8] *= f_38_;
		return fs_39_;
	}

	public static short[] method1914(short[] is, int i) {
		short[] is_47_ = new short[i];
		Class72.method1319(is, 0, is_47_, 0, i);
		return is_47_;
	}

	public static void method1916(int i, int i_48_, int i_49_, int i_50_, int i_51_, int i_52_, float[] fs, int i_53_,
			float f) {
		i -= i_50_;
		i_48_ -= i_51_;
		i_49_ -= i_52_;
		float f_54_ = ((float) i * fs[0] + (float) i_48_ * fs[1] + (float) i_49_ * fs[2]);
		float f_55_ = ((float) i * fs[3] + (float) i_48_ * fs[4] + (float) i_49_ * fs[5]);
		float f_56_ = ((float) i * fs[6] + (float) i_48_ * fs[7] + (float) i_49_ * fs[8]);
		float f_57_ = (float) Math.sqrt((double) (f_54_ * f_54_ + f_55_ * f_55_ + f_56_ * f_56_));
		float f_58_ = ((float) Math.atan2((double) f_54_, (double) f_56_) / 6.2831855F + 0.5F);
		float f_59_ = ((float) Math.asin((double) (f_55_ / f_57_)) / 3.1415927F + 0.5F + f);
		if (i_53_ == 1) {
			float f_60_ = f_58_;
			f_58_ = -f_59_;
			f_59_ = f_60_;
		} else if (i_53_ == 2) {
			f_58_ = -f_58_;
			f_59_ = -f_59_;
		} else if (i_53_ == 3) {
			float f_61_ = f_58_;
			f_58_ = f_59_;
			f_59_ = -f_61_;
		}
		aFloat5062 = f_58_;
		aFloat5058 = f_59_;
	}

	public static void method1921(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_, float[] fs, float f,
			int i_67_, float f_68_) {
		i -= i_64_;
		i_62_ -= i_65_;
		i_63_ -= i_66_;
		float f_69_ = ((float) i * fs[0] + (float) i_62_ * fs[1] + (float) i_63_ * fs[2]);
		float f_70_ = ((float) i * fs[3] + (float) i_62_ * fs[4] + (float) i_63_ * fs[5]);
		float f_71_ = ((float) i * fs[6] + (float) i_62_ * fs[7] + (float) i_63_ * fs[8]);
		float f_72_ = ((float) Math.atan2((double) f_69_, (double) f_71_) / 6.2831855F + 0.5F);
		if (f != 1.0F)
			f_72_ *= f;
		float f_73_ = f_70_ + 0.5F + f_68_;
		if (i_67_ == 1) {
			float f_74_ = f_72_;
			f_72_ = -f_73_;
			f_73_ = f_74_;
		} else if (i_67_ == 2) {
			f_72_ = -f_72_;
			f_73_ = -f_73_;
		} else if (i_67_ == 3) {
			float f_75_ = f_72_;
			f_72_ = f_73_;
			f_73_ = -f_75_;
		}
		aFloat5064 = f_72_;
		aFloat5060 = f_73_;
	}

	public ModelHD() {
		aBoolean5009 = false;
		aByte5023 = (byte) 0;
		anInt5040 = 0;
		aByte5026 = (byte) 0;
		anInt5033 = 0;
	}

	public ModelHD(Class133_Sub2 class133_sub2, int i, int i_76_, boolean bool) {
		aBoolean5009 = false;
		aByte5023 = (byte) 0;
		anInt5040 = 0;
		aByte5026 = (byte) 0;
		anInt5033 = 0;
		int[] is = new int[class133_sub2.anInt3547];
		anIntArray5031 = new int[class133_sub2.anInt3521 + 1];
		for (int i_77_ = 0; i_77_ < class133_sub2.anInt3547; i_77_++) {
			if ((class133_sub2.aByteArray3534 == null || class133_sub2.aByteArray3534[i_77_] != 2)
					&& (class133_sub2.aShortArray3528 == null || class133_sub2.aShortArray3528[i_77_] == -1
							|| !Class3.anInterface3_117.method7((class133_sub2.aShortArray3528[i_77_]) & 0xffff))) {
				is[anInt5014++] = i_77_;
				anIntArray5031[class133_sub2.anIntArray3549[i_77_]]++;
				anIntArray5031[class133_sub2.anIntArray3507[i_77_]]++;
				anIntArray5031[class133_sub2.anIntArray3540[i_77_]]++;
			}
		}
		long[] ls = new long[anInt5014];
		for (int i_78_ = 0; i_78_ < anInt5014; i_78_++) {
			int i_79_ = is[i_78_];
			int i_80_ = 0;
			int i_81_ = 0;
			int i_82_ = 0;
			int i_83_ = 0;
			int i_84_ = -1;
			if (class133_sub2.aShortArray3528 != null) {
				i_84_ = class133_sub2.aShortArray3528[i_79_];
				if (i_84_ != -1) {
					i_82_ = Class3.anInterface3_117.method12(true, i_84_ & 0xffff);
					i_83_ = Class3.anInterface3_117.method8(i_84_ & 0xffff);
				}
			}
			boolean bool_85_ = ((class133_sub2.aByteArray3541 != null && class133_sub2.aByteArray3541[i_79_] != 0)
					|| i_84_ != -1 && !Class3.anInterface3_117.method6(i_84_ & 0xffff, -98));
			if ((bool || bool_85_) && class133_sub2.aByteArray3546 != null)
				i_80_ += class133_sub2.aByteArray3546[i_79_] << 17;
			if (bool_85_)
				i_80_ += 65536;
			i_80_ += (i_82_ & 0xff) << 8;
			i_80_ += i_83_ & 0xff;
			i_81_ += (i_84_ & 0xffff) << 16;
			i_81_ += i_78_ & 0xffff;
			ls[i_78_] = ((long) i_80_ << 32) + (long) i_81_;
		}
		Class117.method1602(is, (byte) 125, ls);
		anInt5033 = class133_sub2.anInt3521;
		vertexX = class133_sub2.anIntArray3530;
		vertexY = class133_sub2.anIntArray3526;
		vertexZ = class133_sub2.anIntArray3510;
		anIntArray5034 = class133_sub2.anIntArray3513;
		int i_86_ = anInt5014 * 3;
		aShortArray5041 = new short[i_86_];
		aShortArray5019 = new short[i_86_];
		aShortArray5042 = new short[i_86_];
		aShortArray5017 = new short[i_86_];
		aFloatArray5047 = new float[i_86_];
		aFloatArray5012 = new float[i_86_];
		aShortArray5045 = new short[anInt5014];
		faceAlphas = new byte[anInt5014];
		aShortArray5021 = new short[anInt5014];
		aShortArray5025 = new short[anInt5014];
		aShortArray5038 = new short[anInt5014];
		aShortArray5037 = new short[anInt5014];
		if (class133_sub2.anIntArray3532 != null)
			aByteArray5016 = new byte[anInt5014];
		aClass50_5013 = new Class50();
		aClass41_5028 = new VertexBufferPointer();
		aClass41_5030 = new VertexBufferPointer();
		if (RT4.useLighting)
			aClass41_5018 = new VertexBufferPointer();
		aClass41_5029 = new VertexBufferPointer();
		aClass41_5046 = new VertexBufferPointer();
		aShort5032 = (short) i;
		aShort5024 = (short) i_76_;
		aShortArray5036 = new short[i_86_];
		aLongArray5048 = new long[i_86_];
		int i_87_ = 0;
		for (int i_88_ = 0; i_88_ < class133_sub2.anInt3521; i_88_++) {
			int i_89_ = anIntArray5031[i_88_];
			anIntArray5031[i_88_] = i_87_;
			i_87_ += i_89_;
		}
		anIntArray5031[class133_sub2.anInt3521] = i_87_;
		int[] is_90_ = null;
		int[] is_91_ = null;
		int[] is_92_ = null;
		float[][] fs = null;
		if (class133_sub2.aByteArray3535 != null) {
			int i_93_ = class133_sub2.anInt3544;
			int[] is_94_ = new int[i_93_];
			int[] is_95_ = new int[i_93_];
			int[] is_96_ = new int[i_93_];
			int[] is_97_ = new int[i_93_];
			int[] is_98_ = new int[i_93_];
			int[] is_99_ = new int[i_93_];
			for (int i_100_ = 0; i_100_ < i_93_; i_100_++) {
				is_94_[i_100_] = 2147483647;
				is_95_[i_100_] = -2147483647;
				is_96_[i_100_] = 2147483647;
				is_97_[i_100_] = -2147483647;
				is_98_[i_100_] = 2147483647;
				is_99_[i_100_] = -2147483647;
			}
			for (int i_101_ = 0; i_101_ < anInt5014; i_101_++) {
				int i_102_ = is[i_101_];
				if (class133_sub2.aByteArray3535[i_102_] != -1) {
					int i_103_ = class133_sub2.aByteArray3535[i_102_] & 0xff;
					for (int i_104_ = 0; i_104_ < 3; i_104_++) {
						int i_105_;
						if (i_104_ == 0)
							i_105_ = class133_sub2.anIntArray3549[i_102_];
						else if (i_104_ == 1)
							i_105_ = class133_sub2.anIntArray3507[i_102_];
						else
							i_105_ = class133_sub2.anIntArray3540[i_102_];
						int i_106_ = class133_sub2.anIntArray3530[i_105_];
						int i_107_ = class133_sub2.anIntArray3526[i_105_];
						int i_108_ = class133_sub2.anIntArray3510[i_105_];
						if (i_106_ < is_94_[i_103_])
							is_94_[i_103_] = i_106_;
						if (i_106_ > is_95_[i_103_])
							is_95_[i_103_] = i_106_;
						if (i_107_ < is_96_[i_103_])
							is_96_[i_103_] = i_107_;
						if (i_107_ > is_97_[i_103_])
							is_97_[i_103_] = i_107_;
						if (i_108_ < is_98_[i_103_])
							is_98_[i_103_] = i_108_;
						if (i_108_ > is_99_[i_103_])
							is_99_[i_103_] = i_108_;
					}
				}
			}
			is_90_ = new int[i_93_];
			is_91_ = new int[i_93_];
			is_92_ = new int[i_93_];
			fs = new float[i_93_][];
			for (int i_109_ = 0; i_109_ < i_93_; i_109_++) {
				byte i_110_ = class133_sub2.aByteArray3514[i_109_];
				if (i_110_ > 0) {
					is_90_[i_109_] = (is_94_[i_109_] + is_95_[i_109_]) / 2;
					is_91_[i_109_] = (is_96_[i_109_] + is_97_[i_109_]) / 2;
					is_92_[i_109_] = (is_98_[i_109_] + is_99_[i_109_]) / 2;
					float f;
					float f_111_;
					float f_112_;
					if (i_110_ == 1) {
						int i_113_ = class133_sub2.aShortArray3512[i_109_];
						if (i_113_ == 0) {
							f = 1.0F;
							f_112_ = 1.0F;
						} else if (i_113_ > 0) {
							f = 1.0F;
							f_112_ = (float) i_113_ / 1024.0F;
						} else {
							f_112_ = 1.0F;
							f = (float) -i_113_ / 1024.0F;
						}
						f_111_ = 64.0F / (float) ((class133_sub2.aShortArray3522[i_109_]) & 0xffff);
					} else if (i_110_ == 2) {
						f = (64.0F / (float) (class133_sub2.aShortArray3512[i_109_] & 0xffff));
						f_111_ = 64.0F / (float) ((class133_sub2.aShortArray3522[i_109_]) & 0xffff);
						f_112_ = 64.0F / (float) ((class133_sub2.aShortArray3527[i_109_]) & 0xffff);
					} else {
						f = ((float) class133_sub2.aShortArray3512[i_109_] / 1024.0F);
						f_111_ = ((float) class133_sub2.aShortArray3522[i_109_] / 1024.0F);
						f_112_ = ((float) class133_sub2.aShortArray3527[i_109_] / 1024.0F);
					}
					fs[i_109_] = method1911(class133_sub2.aShortArray3520[i_109_],
							class133_sub2.aShortArray3531[i_109_], class133_sub2.aShortArray3511[i_109_],
							(class133_sub2.aByteArray3516[i_109_] & 0xff), f, f_111_, f_112_);
				}
			}
		}
		for (int i_114_ = 0; i_114_ < anInt5014; i_114_++) {
			int i_115_ = is[i_114_];
			int i_116_ = class133_sub2.aShortArray3533[i_115_] & 0xffff;
			short i_117_;
			if (class133_sub2.aShortArray3528 == null)
				i_117_ = (short) -1;
			else
				i_117_ = class133_sub2.aShortArray3528[i_115_];
			int i_118_;
			if (class133_sub2.aByteArray3535 == null)
				i_118_ = -1;
			else
				i_118_ = class133_sub2.aByteArray3535[i_115_];
			int i_119_;
			if (class133_sub2.aByteArray3541 == null)
				i_119_ = 0;
			else
				i_119_ = class133_sub2.aByteArray3541[i_115_] & 0xff;
			float f = 0.0F;
			float f_120_ = 0.0F;
			float f_121_ = 0.0F;
			float f_122_ = 0.0F;
			float f_123_ = 0.0F;
			float f_124_ = 0.0F;
			int i_125_ = 0;
			int i_126_ = 0;
			int i_127_ = 0;
			if (i_117_ != -1) {
				if (i_118_ == -1) {
					f = 0.0F;
					f_120_ = 1.0F;
					f_121_ = 1.0F;
					f_122_ = 1.0F;
					i_125_ = 1;
					f_123_ = 0.0F;
					f_124_ = 0.0F;
					i_126_ = 2;
				} else {
					i_118_ &= 0xff;
					byte i_128_ = class133_sub2.aByteArray3514[i_118_];
					if (i_128_ == 0) {
						int i_129_ = class133_sub2.anIntArray3549[i_115_];
						int i_130_ = class133_sub2.anIntArray3507[i_115_];
						int i_131_ = class133_sub2.anIntArray3540[i_115_];
						short i_132_ = class133_sub2.aShortArray3520[i_118_];
						short i_133_ = class133_sub2.aShortArray3531[i_118_];
						short i_134_ = class133_sub2.aShortArray3511[i_118_];
						float f_135_ = (float) class133_sub2.anIntArray3530[i_132_];
						float f_136_ = (float) class133_sub2.anIntArray3526[i_132_];
						float f_137_ = (float) class133_sub2.anIntArray3510[i_132_];
						float f_138_ = ((float) class133_sub2.anIntArray3530[i_133_] - f_135_);
						float f_139_ = ((float) class133_sub2.anIntArray3526[i_133_] - f_136_);
						float f_140_ = ((float) class133_sub2.anIntArray3510[i_133_] - f_137_);
						float f_141_ = ((float) class133_sub2.anIntArray3530[i_134_] - f_135_);
						float f_142_ = ((float) class133_sub2.anIntArray3526[i_134_] - f_136_);
						float f_143_ = ((float) class133_sub2.anIntArray3510[i_134_] - f_137_);
						float f_144_ = ((float) class133_sub2.anIntArray3530[i_129_] - f_135_);
						float f_145_ = ((float) class133_sub2.anIntArray3526[i_129_] - f_136_);
						float f_146_ = ((float) class133_sub2.anIntArray3510[i_129_] - f_137_);
						float f_147_ = ((float) class133_sub2.anIntArray3530[i_130_] - f_135_);
						float f_148_ = ((float) class133_sub2.anIntArray3526[i_130_] - f_136_);
						float f_149_ = ((float) class133_sub2.anIntArray3510[i_130_] - f_137_);
						float f_150_ = ((float) class133_sub2.anIntArray3530[i_131_] - f_135_);
						float f_151_ = ((float) class133_sub2.anIntArray3526[i_131_] - f_136_);
						float f_152_ = ((float) class133_sub2.anIntArray3510[i_131_] - f_137_);
						float f_153_ = f_139_ * f_143_ - f_140_ * f_142_;
						float f_154_ = f_140_ * f_141_ - f_138_ * f_143_;
						float f_155_ = f_138_ * f_142_ - f_139_ * f_141_;
						float f_156_ = f_142_ * f_155_ - f_143_ * f_154_;
						float f_157_ = f_143_ * f_153_ - f_141_ * f_155_;
						float f_158_ = f_141_ * f_154_ - f_142_ * f_153_;
						float f_159_ = 1.0F / (f_156_ * f_138_ + f_157_ * f_139_ + f_158_ * f_140_);
						f = (f_156_ * f_144_ + f_157_ * f_145_ + f_158_ * f_146_) * f_159_;
						f_121_ = (f_156_ * f_147_ + f_157_ * f_148_ + f_158_ * f_149_) * f_159_;
						f_123_ = (f_156_ * f_150_ + f_157_ * f_151_ + f_158_ * f_152_) * f_159_;
						f_156_ = f_139_ * f_155_ - f_140_ * f_154_;
						f_157_ = f_140_ * f_153_ - f_138_ * f_155_;
						f_158_ = f_138_ * f_154_ - f_139_ * f_153_;
						f_159_ = 1.0F / (f_156_ * f_141_ + f_157_ * f_142_ + f_158_ * f_143_);
						f_120_ = (f_156_ * f_144_ + f_157_ * f_145_ + f_158_ * f_146_) * f_159_;
						f_122_ = (f_156_ * f_147_ + f_157_ * f_148_ + f_158_ * f_149_) * f_159_;
						f_124_ = (f_156_ * f_150_ + f_157_ * f_151_ + f_158_ * f_152_) * f_159_;
					} else {
						int i_160_ = class133_sub2.anIntArray3549[i_115_];
						int i_161_ = class133_sub2.anIntArray3507[i_115_];
						int i_162_ = class133_sub2.anIntArray3540[i_115_];
						int i_163_ = is_90_[i_118_];
						int i_164_ = is_91_[i_118_];
						int i_165_ = is_92_[i_118_];
						float[] fs_166_ = fs[i_118_];
						byte i_167_ = class133_sub2.aByteArray3548[i_118_];
						float f_168_ = ((float) class133_sub2.aByteArray3554[i_118_] / 256.0F);
						if (i_128_ == 1) {
							float f_169_ = ((float) ((class133_sub2.aShortArray3527[i_118_]) & 0xffff) / 1024.0F);
							method1921(class133_sub2.anIntArray3530[i_160_], class133_sub2.anIntArray3526[i_160_],
									class133_sub2.anIntArray3510[i_160_], i_163_, i_164_, i_165_, fs_166_, f_169_,
									i_167_, f_168_);
							f = aFloat5064;
							f_120_ = aFloat5060;
							method1921(class133_sub2.anIntArray3530[i_161_], class133_sub2.anIntArray3526[i_161_],
									class133_sub2.anIntArray3510[i_161_], i_163_, i_164_, i_165_, fs_166_, f_169_,
									i_167_, f_168_);
							f_121_ = aFloat5064;
							f_122_ = aFloat5060;
							method1921(class133_sub2.anIntArray3530[i_162_], class133_sub2.anIntArray3526[i_162_],
									class133_sub2.anIntArray3510[i_162_], i_163_, i_164_, i_165_, fs_166_, f_169_,
									i_167_, f_168_);
							f_123_ = aFloat5064;
							f_124_ = aFloat5060;
							float f_170_ = f_169_ / 2.0F;
							if ((i_167_ & 0x1) == 0) {
								if (f_121_ - f > f_170_) {
									f_121_ -= f_169_;
									i_125_ = 1;
								} else if (f - f_121_ > f_170_) {
									f_121_ += f_169_;
									i_125_ = 2;
								}
								if (f_123_ - f > f_170_) {
									f_123_ -= f_169_;
									i_126_ = 1;
								} else if (f - f_123_ > f_170_) {
									f_123_ += f_169_;
									i_126_ = 2;
								}
							} else {
								if (f_122_ - f_120_ > f_170_) {
									f_122_ -= f_169_;
									i_125_ = 1;
								} else if (f_120_ - f_122_ > f_170_) {
									f_122_ += f_169_;
									i_125_ = 2;
								}
								if (f_124_ - f_120_ > f_170_) {
									f_124_ -= f_169_;
									i_126_ = 1;
								} else if (f_120_ - f_124_ > f_170_) {
									f_124_ += f_169_;
									i_126_ = 2;
								}
							}
						} else if (i_128_ == 2) {
							float f_171_ = ((float) class133_sub2.aByteArray3518[i_118_] / 256.0F);
							float f_172_ = ((float) class133_sub2.aByteArray3529[i_118_] / 256.0F);
							int i_173_ = (class133_sub2.anIntArray3530[i_161_] - class133_sub2.anIntArray3530[i_160_]);
							int i_174_ = (class133_sub2.anIntArray3526[i_161_] - class133_sub2.anIntArray3526[i_160_]);
							int i_175_ = (class133_sub2.anIntArray3510[i_161_] - class133_sub2.anIntArray3510[i_160_]);
							int i_176_ = (class133_sub2.anIntArray3530[i_162_] - class133_sub2.anIntArray3530[i_160_]);
							int i_177_ = (class133_sub2.anIntArray3526[i_162_] - class133_sub2.anIntArray3526[i_160_]);
							int i_178_ = (class133_sub2.anIntArray3510[i_162_] - class133_sub2.anIntArray3510[i_160_]);
							int i_179_ = i_174_ * i_178_ - i_177_ * i_175_;
							int i_180_ = i_175_ * i_176_ - i_178_ * i_173_;
							int i_181_ = i_173_ * i_177_ - i_176_ * i_174_;
							float f_182_ = 64.0F / (float) ((class133_sub2.aShortArray3512[i_118_]) & 0xffff);
							float f_183_ = 64.0F / (float) ((class133_sub2.aShortArray3522[i_118_]) & 0xffff);
							float f_184_ = 64.0F / (float) ((class133_sub2.aShortArray3527[i_118_]) & 0xffff);
							float f_185_ = (((float) i_179_ * fs_166_[0] + (float) i_180_ * fs_166_[1]
									+ (float) i_181_ * fs_166_[2]) / f_182_);
							float f_186_ = (((float) i_179_ * fs_166_[3] + (float) i_180_ * fs_166_[4]
									+ (float) i_181_ * fs_166_[5]) / f_183_);
							float f_187_ = (((float) i_179_ * fs_166_[6] + (float) i_180_ * fs_166_[7]
									+ (float) i_181_ * fs_166_[8]) / f_184_);
							i_127_ = method1898(f_185_, f_186_, f_187_);
							method1888(class133_sub2.anIntArray3530[i_160_], class133_sub2.anIntArray3526[i_160_],
									class133_sub2.anIntArray3510[i_160_], i_163_, i_164_, i_165_, i_127_, fs_166_,
									i_167_, f_168_, f_171_, f_172_);
							f = aFloat5056;
							f_120_ = aFloat5063;
							method1888(class133_sub2.anIntArray3530[i_161_], class133_sub2.anIntArray3526[i_161_],
									class133_sub2.anIntArray3510[i_161_], i_163_, i_164_, i_165_, i_127_, fs_166_,
									i_167_, f_168_, f_171_, f_172_);
							f_121_ = aFloat5056;
							f_122_ = aFloat5063;
							method1888(class133_sub2.anIntArray3530[i_162_], class133_sub2.anIntArray3526[i_162_],
									class133_sub2.anIntArray3510[i_162_], i_163_, i_164_, i_165_, i_127_, fs_166_,
									i_167_, f_168_, f_171_, f_172_);
							f_123_ = aFloat5056;
							f_124_ = aFloat5063;
						} else if (i_128_ == 3) {
							method1916(class133_sub2.anIntArray3530[i_160_], class133_sub2.anIntArray3526[i_160_],
									class133_sub2.anIntArray3510[i_160_], i_163_, i_164_, i_165_, fs_166_, i_167_,
									f_168_);
							f = aFloat5062;
							f_120_ = aFloat5058;
							method1916(class133_sub2.anIntArray3530[i_161_], class133_sub2.anIntArray3526[i_161_],
									class133_sub2.anIntArray3510[i_161_], i_163_, i_164_, i_165_, fs_166_, i_167_,
									f_168_);
							f_121_ = aFloat5062;
							f_122_ = aFloat5058;
							method1916(class133_sub2.anIntArray3530[i_162_], class133_sub2.anIntArray3526[i_162_],
									class133_sub2.anIntArray3510[i_162_], i_163_, i_164_, i_165_, fs_166_, i_167_,
									f_168_);
							f_123_ = aFloat5062;
							f_124_ = aFloat5058;
							if ((i_167_ & 0x1) == 0) {
								if (f_121_ - f > 0.5F) {
									f_121_--;
									i_125_ = 1;
								} else if (f - f_121_ > 0.5F) {
									f_121_++;
									i_125_ = 2;
								}
								if (f_123_ - f > 0.5F) {
									f_123_--;
									i_126_ = 1;
								} else if (f - f_123_ > 0.5F) {
									f_123_++;
									i_126_ = 2;
								}
							} else {
								if (f_122_ - f_120_ > 0.5F) {
									f_122_--;
									i_125_ = 1;
								} else if (f_120_ - f_122_ > 0.5F) {
									f_122_++;
									i_125_ = 2;
								}
								if (f_124_ - f_120_ > 0.5F) {
									f_124_--;
									i_126_ = 1;
								} else if (f_120_ - f_124_ > 0.5F) {
									f_124_++;
									i_126_ = 2;
								}
							}
						}
					}
				}
			}
			class133_sub2.method1826();
			byte i_188_;
			if (class133_sub2.aByteArray3534 == null)
				i_188_ = (byte) 0;
			else
				i_188_ = class133_sub2.aByteArray3534[i_115_];
			if (i_188_ == 0) {
				long l = ((long) (i_118_ << 2)
						+ (((long) (i_127_ << 24) + (long) (i_116_ << 8) + (long) i_119_) << 32));
				int i_189_ = class133_sub2.anIntArray3549[i_115_];
				Class89 class89 = class133_sub2.aClass89Array3552[i_189_];
				aShortArray5021[i_114_] = method1901(class133_sub2, i_189_, l, class89.anInt1414, class89.anInt1404,
						class89.anInt1406, class89.anInt1410, f, f_120_);
				int i_190_ = class133_sub2.anIntArray3507[i_115_];
				Class89 class89_191_ = class133_sub2.aClass89Array3552[i_190_];
				aShortArray5025[i_114_] = method1901(class133_sub2, i_190_, l + (long) i_125_, class89_191_.anInt1414,
						class89_191_.anInt1404, class89_191_.anInt1406, class89_191_.anInt1410, f_121_, f_122_);
				int i_192_ = class133_sub2.anIntArray3540[i_115_];
				Class89 class89_193_ = class133_sub2.aClass89Array3552[i_192_];
				aShortArray5038[i_114_] = method1901(class133_sub2, i_192_, l + (long) i_126_, class89_193_.anInt1414,
						class89_193_.anInt1404, class89_193_.anInt1406, class89_193_.anInt1410, f_123_, f_124_);
			} else if (i_188_ == 1) {
				Class138 class138 = class133_sub2.aClass138Array3536[i_115_];
				long l = ((long) ((i_118_ << 2) + (class138.anInt2208 > 0 ? 1024 : 2048)
						+ (class138.anInt2217 + 256 << 12) + (class138.anInt2209 + 256 << 22))
						+ (((long) (i_127_ << 24) + (long) (i_116_ << 8) + (long) i_119_) << 32));
				aShortArray5021[i_114_] = method1901(class133_sub2, class133_sub2.anIntArray3549[i_115_], l,
						class138.anInt2208, class138.anInt2217, class138.anInt2209, 0, f, f_120_);
				aShortArray5025[i_114_] = method1901(class133_sub2, class133_sub2.anIntArray3507[i_115_],
						l + (long) i_125_, class138.anInt2208, class138.anInt2217, class138.anInt2209, 0, f_121_,
						f_122_);
				aShortArray5038[i_114_] = method1901(class133_sub2, class133_sub2.anIntArray3540[i_115_],
						l + (long) i_126_, class138.anInt2208, class138.anInt2217, class138.anInt2209, 0, f_123_,
						f_124_);
			}
			if (class133_sub2.aShortArray3528 != null)
				aShortArray5037[i_114_] = class133_sub2.aShortArray3528[i_115_];
			else
				aShortArray5037[i_114_] = (short) -1;
			if (aByteArray5016 != null)
				aByteArray5016[i_114_] = (byte) class133_sub2.anIntArray3532[i_115_];
			aShortArray5045[i_114_] = class133_sub2.aShortArray3533[i_115_];
			if (class133_sub2.aByteArray3541 != null)
				faceAlphas[i_114_] = class133_sub2.aByteArray3541[i_115_];
		}
		int i_194_ = 0;
		short i_195_ = -10000;
		for (int i_196_ = 0; i_196_ < anInt5014; i_196_++) {
			short i_197_ = aShortArray5037[i_196_];
			if (i_197_ != i_195_) {
				i_194_++;
				i_195_ = i_197_;
			}
		}
		anIntArray5035 = new int[i_194_ + 1];
		i_194_ = 0;
		i_195_ = (short) -10000;
		for (int i_198_ = 0; i_198_ < anInt5014; i_198_++) {
			short i_199_ = aShortArray5037[i_198_];
			if (i_199_ != i_195_) {
				anIntArray5035[i_194_++] = i_198_;
				i_195_ = i_199_;
			}
		}
		anIntArray5035[i_194_] = anInt5014;
		aLongArray5048 = null;
		aShortArray5041 = method1914(aShortArray5041, anInt5040);
		aShortArray5019 = method1914(aShortArray5019, anInt5040);
		aShortArray5042 = method1914(aShortArray5042, anInt5040);
		aShortArray5017 = method1914(aShortArray5017, anInt5040);
		aFloatArray5047 = method1894(aFloatArray5047, anInt5040);
		aFloatArray5012 = method1894(aFloatArray5012, anInt5040);
	}

	public int method1781() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort825;
	}

	public boolean method1784() {
		if (aBoolean5009 && vertexX != null && aShortArray5041 != null)
			return true;
		return false;
	}

	public void method1788(Class133 class133, int i, int i_200_, int i_201_, boolean bool) {
		ModelHD modelhd_202_ = (ModelHD) class133;
		if (anInt5014 != 0 && modelhd_202_.anInt5014 != 0) {
			int i_203_ = modelhd_202_.anInt5033;
			int[] is = modelhd_202_.vertexX;
			int[] is_204_ = modelhd_202_.vertexY;
			int[] is_205_ = modelhd_202_.vertexZ;
			short[] is_206_ = modelhd_202_.aShortArray5041;
			short[] is_207_ = modelhd_202_.aShortArray5019;
			short[] is_208_ = modelhd_202_.aShortArray5042;
			short[] is_209_ = modelhd_202_.aShortArray5017;
			short[] is_210_;
			short[] is_211_;
			short[] is_212_;
			short[] is_213_;
			if (aClass77_5039 != null) {
				is_210_ = aClass77_5039.aShortArray1219;
				is_211_ = aClass77_5039.aShortArray1216;
				is_212_ = aClass77_5039.aShortArray1218;
				is_213_ = aClass77_5039.aShortArray1217;
			} else {
				is_210_ = null;
				is_211_ = null;
				is_212_ = null;
				is_213_ = null;
			}
			short[] is_214_;
			short[] is_215_;
			short[] is_216_;
			short[] is_217_;
			if (modelhd_202_.aClass77_5039 != null) {
				is_214_ = modelhd_202_.aClass77_5039.aShortArray1219;
				is_215_ = modelhd_202_.aClass77_5039.aShortArray1216;
				is_216_ = modelhd_202_.aClass77_5039.aShortArray1218;
				is_217_ = modelhd_202_.aClass77_5039.aShortArray1217;
			} else {
				is_214_ = null;
				is_215_ = null;
				is_216_ = null;
				is_217_ = null;
			}
			int[] is_218_ = modelhd_202_.anIntArray5031;
			short[] is_219_ = modelhd_202_.aShortArray5036;
			if (!modelhd_202_.aClass50_5013.aBoolean820)
				modelhd_202_.method1891();
			int i_220_ = modelhd_202_.aClass50_5013.aShort825;
			int i_221_ = modelhd_202_.aClass50_5013.aShort826;
			int i_222_ = modelhd_202_.aClass50_5013.aShort827;
			int i_223_ = modelhd_202_.aClass50_5013.aShort824;
			int i_224_ = modelhd_202_.aClass50_5013.aShort822;
			int i_225_ = modelhd_202_.aClass50_5013.aShort821;
			for (int i_226_ = 0; i_226_ < anInt5033; i_226_++) {
				int i_227_ = vertexY[i_226_] - i_200_;
				if (i_227_ >= i_220_ && i_227_ <= i_221_) {
					int i_228_ = vertexX[i_226_] - i;
					if (i_228_ >= i_222_ && i_228_ <= i_223_) {
						int i_229_ = vertexZ[i_226_] - i_201_;
						if (i_229_ >= i_224_ && i_229_ <= i_225_) {
							int i_230_ = -1;
							int i_231_ = anIntArray5031[i_226_];
							int i_232_ = anIntArray5031[i_226_ + 1];
							for (int i_233_ = i_231_; i_233_ < i_232_; i_233_++) {
								i_230_ = aShortArray5036[i_233_] - 1;
								if (i_230_ == -1 || aShortArray5017[i_230_] != 0)
									break;
							}
							if (i_230_ != -1) {
								for (int i_234_ = 0; i_234_ < i_203_; i_234_++) {
									if (i_228_ == is[i_234_] && i_229_ == is_205_[i_234_]
											&& i_227_ == is_204_[i_234_]) {
										int i_235_ = -1;
										i_231_ = is_218_[i_234_];
										i_232_ = is_218_[i_234_ + 1];
										for (int i_236_ = i_231_; i_236_ < i_232_; i_236_++) {
											i_235_ = is_219_[i_236_] - 1;
											if (i_235_ == -1 || is_209_[i_235_] != 0)
												break;
										}
										if (i_235_ != -1) {
											if (is_210_ == null) {
												aClass77_5039 = new Class77();
												is_210_ = aClass77_5039.aShortArray1219 = (Class14_Sub8_Sub33
														.method655(8111, aShortArray5041));
												is_211_ = aClass77_5039.aShortArray1216 = (Class14_Sub8_Sub33
														.method655(8111, aShortArray5019));
												is_212_ = aClass77_5039.aShortArray1218 = (Class14_Sub8_Sub33
														.method655(8111, aShortArray5042));
												is_213_ = aClass77_5039.aShortArray1217 = (Class14_Sub8_Sub33
														.method655(8111, aShortArray5017));
											}
											if (is_214_ == null) {
												Class77 class77 = (modelhd_202_.aClass77_5039 = new Class77());
												is_214_ = class77.aShortArray1219 = (Class14_Sub8_Sub33.method655(8111,
														is_206_));
												is_215_ = class77.aShortArray1216 = (Class14_Sub8_Sub33.method655(8111,
														is_207_));
												is_216_ = class77.aShortArray1218 = (Class14_Sub8_Sub33.method655(8111,
														is_208_));
												is_217_ = class77.aShortArray1217 = (Class14_Sub8_Sub33.method655(8111,
														is_209_));
											}
											short i_237_ = aShortArray5041[i_230_];
											short i_238_ = aShortArray5019[i_230_];
											short i_239_ = aShortArray5042[i_230_];
											short i_240_ = aShortArray5017[i_230_];
											i_231_ = is_218_[i_234_];
											i_232_ = is_218_[i_234_ + 1];
											for (int i_241_ = i_231_; i_241_ < i_232_; i_241_++) {
												int i_242_ = is_219_[i_241_] - 1;
												if (i_242_ == -1)
													break;
												if (is_217_[i_242_] != 0) {
													is_214_[i_242_] += i_237_;
													is_215_[i_242_] += i_238_;
													is_216_[i_242_] += i_239_;
													is_217_[i_242_] += i_240_;
												}
											}
											i_237_ = is_206_[i_235_];
											i_238_ = is_207_[i_235_];
											i_239_ = is_208_[i_235_];
											i_240_ = is_209_[i_235_];
											i_231_ = anIntArray5031[i_226_];
											i_232_ = anIntArray5031[i_226_ + 1];
											for (int i_243_ = i_231_; i_243_ < i_232_; i_243_++) {
												int i_244_ = (aShortArray5036[i_243_] - 1);
												if (i_244_ == -1)
													break;
												if (is_213_[i_244_] != 0) {
													is_210_[i_244_] += i_237_;
													is_211_[i_244_] += i_238_;
													is_212_[i_244_] += i_239_;
													is_213_[i_244_] += i_240_;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public Class133 method1791(int i, int i_245_, int i_246_) {
		aBoolean5009 = false;
		if (aClass77_5039 != null) {
			aShortArray5041 = aClass77_5039.aShortArray1219;
			aShortArray5019 = aClass77_5039.aShortArray1216;
			aShortArray5042 = aClass77_5039.aShortArray1218;
			aShortArray5017 = aClass77_5039.aShortArray1217;
			aClass77_5039 = null;
		}
		return this;
	}

	public void method1792(int i, int i_247_, int i_248_, int i_249_, int i_250_, int i_251_, int i_252_, int i_253_,
			long l) {
		if (anInt5040 != 0) {
			if (!aClass50_5013.aBoolean820)
				method1891();
			int i_254_ = aClass50_5013.aShort823;
			int i_255_ = aClass50_5013.aShort825;
			int i_256_ = aClass50_5013.aShort826;
			int i_257_ = i_253_ * i_250_ - i_251_ * i_249_ >> 16;
			int i_258_ = i_252_ * i_247_ + i_257_ * i_248_ >> 16;
			int i_259_ = i_258_ + (i_254_ * i_248_ + i_256_ * i_247_ >> 16);
			if (i_259_ > 50) {
				int i_260_ = i_258_ + (-i_254_ * i_248_ + i_255_ * i_247_ >> 16);
				if (i_260_ < 3584) {
					int i_261_ = i_253_ * i_249_ + i_251_ * i_250_ >> 16;
					int i_262_ = i_261_ + i_254_ << 9;
					if (i_262_ / i_259_ > Static.anInt425) {
						int i_263_ = i_261_ - i_254_ << 9;
						if (i_263_ / i_259_ < Class14_Sub8_Sub27.anInt4547) {
							int i_264_ = i_252_ * i_248_ - i_257_ * i_247_ >> 16;
							int i_265_ = (i_264_ + (i_254_ * i_247_ + i_256_ * i_248_ >> 16) << 9);
							if (i_265_ / i_259_ > Class58.anInt948) {
								int i_266_ = (i_264_ + ((-i_254_ * i_247_ + i_255_ * i_248_) >> 16) << 9);
								if (i_266_ / i_259_ < Class70.anInt1081) {
									int i_267_ = 0;
									int i_268_ = 0;
									if (i != 0) {
										i_267_ = Class3.sin[i];
										i_268_ = Class3.cos[i];
									}
									while_321_: do {
										if (l > 0L && Class90.aBoolean1417 && i_260_ > 0) {
											int i_269_;
											int i_270_;
											if (i_261_ > 0) {
												i_269_ = i_263_ / i_259_;
												i_270_ = i_262_ / i_260_;
											} else {
												i_269_ = i_263_ / i_260_;
												i_270_ = i_262_ / i_259_;
											}
											int i_271_;
											int i_272_;
											if (i_264_ > 0) {
												i_271_ = i_266_ / i_259_;
												i_272_ = i_265_ / i_260_;
											} else {
												i_271_ = i_266_ / i_260_;
												i_272_ = i_265_ / i_259_;
											}
											if (Static2.anInt2726 >= i_269_ && Static2.anInt2726 <= i_270_
													&& Class38.anInt2622 >= i_271_ && (Class38.anInt2622 <= i_272_)) {
												i_269_ = 999999;
												i_270_ = -999999;
												i_271_ = 999999;
												i_272_ = -999999;
												int i_273_ = aClass50_5013.aShort827;
												int i_274_ = aClass50_5013.aShort824;
												int i_275_ = aClass50_5013.aShort822;
												int i_276_ = aClass50_5013.aShort821;
												int[] is = { i_273_, i_274_, i_273_, i_274_, i_273_, i_274_, i_273_,
														i_274_ };
												int[] is_277_ = { i_275_, i_275_, i_276_, i_276_, i_275_, i_275_,
														i_276_, i_276_ };
												int[] is_278_ = { i_255_, i_255_, i_255_, i_255_, i_256_, i_256_,
														i_256_, i_256_ };
												for (int i_279_ = 0; i_279_ < 8; i_279_++) {
													int i_280_ = is[i_279_];
													int i_281_ = is_278_[i_279_];
													int i_282_ = is_277_[i_279_];
													if (i != 0) {
														int i_283_ = ((i_282_ * i_267_ + (i_280_ * i_268_)) >> 16);
														i_282_ = ((i_282_ * i_268_ - (i_280_ * i_267_)) >> 16);
														i_280_ = i_283_;
													}
													i_280_ += i_251_;
													i_281_ += i_252_;
													i_282_ += i_253_;
													int i_284_ = ((i_282_ * i_249_ + i_280_ * i_250_) >> 16);
													i_282_ = ((i_282_ * i_250_ - i_280_ * i_249_) >> 16);
													i_280_ = i_284_;
													i_284_ = ((i_281_ * i_248_ - i_282_ * i_247_) >> 16);
													i_282_ = ((i_281_ * i_247_ + i_282_ * i_248_) >> 16);
													i_281_ = i_284_;
													if (i_282_ > 0) {
														int i_285_ = ((i_280_ << 9) / i_282_);
														int i_286_ = ((i_281_ << 9) / i_282_);
														if (i_285_ < i_269_)
															i_269_ = i_285_;
														if (i_285_ > i_270_)
															i_270_ = i_285_;
														if (i_286_ < i_271_)
															i_271_ = i_286_;
														if (i_286_ > i_272_)
															i_272_ = i_286_;
													}
												}
												if (Static2.anInt2726 >= i_269_ && (Static2.anInt2726 <= i_270_)
														&& (Class38.anInt2622 >= i_271_)
														&& (Class38.anInt2622 <= i_272_)) {
													if (aBoolean3687)
														Class7_Sub3.aLongArray2685[Class14_Sub15.anInt2996++] = l;
													else {
														if (anIntArray5061.length < anInt5040) {
															anIntArray5061 = (new int[anInt5040]);
															anIntArray5057 = (new int[anInt5040]);
														}
														for (int i_287_ = 0; (i_287_ < anInt5033); i_287_++) {
															int i_288_ = (vertexX[i_287_]);
															int i_289_ = (vertexY[i_287_]);
															int i_290_ = (vertexZ[i_287_]);
															if (i != 0) {
																int i_291_ = (((i_290_ * i_267_)
																		+ (i_288_ * i_268_)) >> 16);
																i_290_ = (((i_290_ * i_268_)
																		- (i_288_ * i_267_)) >> 16);
																i_288_ = i_291_;
															}
															i_288_ += i_251_;
															i_289_ += i_252_;
															i_290_ += i_253_;
															int i_292_ = (((i_290_ * i_249_)
																	+ (i_288_ * i_250_)) >> 16);
															i_290_ = (((i_290_ * i_250_) - (i_288_ * i_249_)) >> 16);
															i_288_ = i_292_;
															i_292_ = (((i_289_ * i_248_) - (i_290_ * i_247_)) >> 16);
															i_290_ = (((i_289_ * i_247_) + (i_290_ * i_248_)) >> 16);
															i_289_ = i_292_;
															if (i_290_ < 50)
																break while_321_;
															int i_293_ = ((i_288_ << 9) / i_290_);
															int i_294_ = ((i_289_ << 9) / i_290_);
															int i_295_ = (anIntArray5031[i_287_]);
															int i_296_ = (anIntArray5031[(i_287_ + 1)]);
															for (int i_297_ = i_295_; (i_297_ < i_296_); i_297_++) {
																int i_298_ = ((aShortArray5036[i_297_]) - 1);
																if (i_298_ == -1)
																	break;
																anIntArray5061[i_298_] = i_293_;
																anIntArray5057[i_298_] = i_294_;
															}
														}
														for (int i_299_ = 0; (i_299_ < anInt5014); i_299_++) {
															short i_300_ = (aShortArray5021[i_299_]);
															short i_301_ = (aShortArray5025[i_299_]);
															short i_302_ = (aShortArray5038[i_299_]);
															if (method1920((Static2.anInt2726), (Class38.anInt2622),
																	(anIntArray5057[i_300_]), (anIntArray5057[i_301_]),
																	(anIntArray5057[i_302_]), (anIntArray5061[i_300_]),
																	(anIntArray5061[i_301_]),
																	(anIntArray5061[i_302_]))) {
																Class7_Sub3.aLongArray2685[Class14_Sub15.anInt2996++] = l;
																break;
															}
														}
													}
												}
											}
										}
									} while (false);
									GL gl = RT4GL.gl;
									gl.glPushMatrix();
									gl.glTranslatef((float) i_251_, (float) i_252_, (float) i_253_);
									gl.glRotatef((float) i * 0.17578125F, 0.0F, 1.0F, 0.0F);
									method1887();
									gl.glPopMatrix();
								}
							}
						}
					}
				}
			}
		}
	}

	public void method1855(int i, int i_303_, int i_304_) {
		for (int i_305_ = 0; i_305_ < anInt5033; i_305_++) {
			vertexX[i_305_] += i;
			vertexY[i_305_] += i_303_;
			vertexZ[i_305_] += i_304_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public int method1856() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort824;
	}

	public void method1857(AnimFrameLoader class14_sub2_sub15, int i, boolean bool) {
		if (vertexGroups != null && i != -1) {
			AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
			AnimFrameBase animframebase = animframe.base;
			for (int i_306_ = 0; i_306_ < anInt5033; i_306_++) {
				vertexX[i_306_] <<= 4;
				vertexY[i_306_] <<= 4;
				vertexZ[i_306_] <<= 4;
			}
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;
			for (int i_307_ = 0; i_307_ < animframe.transformationCount; i_307_++) {
				short i_308_ = animframe.transformationIndices[i_307_];
				if (animframe.aShortArray2338[i_307_] != -1)
					transform(0, (animframebase.labels[animframe.aShortArray2338[i_307_]]), 0, 0, 0, bool);
				transform(animframebase.transformationType[i_308_], animframebase.labels[i_308_],
						animframe.transformX[i_307_], animframe.transformY[i_307_],
						animframe.transformZ[i_307_], bool);
			}
			for (int i_309_ = 0; i_309_ < anInt5033; i_309_++) {
				vertexX[i_309_] >>= 4;
				vertexY[i_309_] >>= 4;
				vertexZ[i_309_] >>= 4;
			}
			aClass50_5013.aBoolean820 = false;
			aClass41_5028.upToDate = false;
		}
	}

	public void method1858(int i) {
		int i_310_ = Class3.sin[i];
		int i_311_ = Class3.cos[i];
		for (int i_312_ = 0; i_312_ < anInt5033; i_312_++) {
			int i_313_ = vertexY[i_312_] * i_310_ + vertexX[i_312_] * i_311_ >> 16;
			vertexY[i_312_] = vertexY[i_312_] * i_311_ - vertexX[i_312_] * i_310_ >> 16;
			vertexX[i_312_] = i_313_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1859(AnimFrameLoader class14_sub2_sub15, int i) {
		if (vertexGroups != null && i != -1) {
			AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
			AnimFrameBase animframebase = animframe.base;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;
			for (int i_314_ = 0; i_314_ < animframe.transformationCount; i_314_++) {
				short i_315_ = animframe.transformationIndices[i_314_];
				if (animframebase.aBooleanArray2791[i_315_]) {
					if (animframe.aShortArray2338[i_314_] != -1)
						method1893(0, 0, 0, 0);
					method1893(animframebase.transformationType[i_315_], animframe.transformX[i_314_],
							animframe.transformY[i_314_], animframe.transformZ[i_314_]);
				}
			}
			aClass41_5028.upToDate = false;
			aClass50_5013.aBoolean820 = false;
		}
	}

	public Class133_Sub7 method1860(boolean bool, boolean bool_316_) {
		return method1907(bool, bool_316_, aClass133_Sub7_Sub2_5051, aClass133_Sub7_Sub2_5049);
	}

	public void method1861(int i) {
		int i_317_ = Class3.sin[i];
		int i_318_ = Class3.cos[i];
		for (int i_319_ = 0; i_319_ < anInt5033; i_319_++) {
			int i_320_ = vertexY[i_319_] * i_318_ - vertexZ[i_319_] * i_317_ >> 16;
			vertexZ[i_319_] = vertexY[i_319_] * i_317_ + vertexZ[i_319_] * i_318_ >> 16;
			vertexY[i_319_] = i_320_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1862(int i, int i_321_, int i_322_, int i_323_, int i_324_, int i_325_, int i_326_) {
		if (anInt5040 != 0) {
			GL gl = RT4GL.gl;
			gl.glPushMatrix();
			if (i_323_ != 0)
				gl.glRotatef((float) i_323_ * 0.17578125F, 1.0F, 0.0F, 0.0F);
			gl.glTranslatef((float) i_324_, (float) i_325_, (float) i_326_);
			if (i_321_ != 0)
				gl.glRotatef((float) i_321_ * 0.17578125F, 0.0F, 1.0F, 0.0F);
			if (i != 0)
				gl.glRotatef((float) i * 0.17578125F, 1.0F, 0.0F, 0.0F);
			if (i_322_ != 0)
				gl.glRotatef((float) -i_322_ * 0.17578125F, 0.0F, 0.0F, 1.0F);
			method1887();
			gl.glPopMatrix();
		}
	}

	public int method1865() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort821;
	}

	public int method1866() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort823;
	}

	public int method1867() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort827;
	}

	public int method1868() {
		if (!aClass50_5013.aBoolean820)
			method1891();
		return aClass50_5013.aShort822;
	}

	public void method1869(int i, int i_327_, int i_328_) {
		for (int i_329_ = 0; i_329_ < anInt5033; i_329_++) {
			vertexX[i_329_] = vertexX[i_329_] * i >> 7;
			vertexY[i_329_] = vertexY[i_329_] * i_327_ >> 7;
			vertexZ[i_329_] = vertexZ[i_329_] * i_328_ >> 7;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public Class133_Sub7 method1870(boolean bool, boolean bool_330_) {
		return method1907(bool, bool_330_, aClass133_Sub7_Sub2_5053, aClass133_Sub7_Sub2_5052);
	}

	public void method1871() {
		for (int i = 0; i < anInt5033; i++) {
			int i_331_ = vertexX[i];
			vertexX[i] = vertexZ[i];
			vertexZ[i] = -i_331_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1872() {
		for (int i = 0; i < anInt5033; i++) {
			vertexX[i] = -vertexX[i];
			vertexZ[i] = -vertexZ[i];
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1873(AnimFrameLoader class14_sub2_sub15, int i, AnimFrameLoader class14_sub2_sub15_332_,
			int i_333_, int[] is, boolean bool) {
		if (i != -1) {
			if (is == null || i_333_ == -1)
				method1857(class14_sub2_sub15, i, bool);
			else {
				AnimFrame animframe = class14_sub2_sub15.aClass143Array3951[i];
				AnimFrame animframe_334_ = class14_sub2_sub15_332_.aClass143Array3951[i_333_];
				AnimFrameBase animframebase = animframe.base;
				for (int i_335_ = 0; i_335_ < anInt5033; i_335_++) {
					vertexX[i_335_] <<= 4;
					vertexY[i_335_] <<= 4;
					vertexZ[i_335_] <<= 4;
				}
				centroidX = 0;
				centroidY = 0;
				centroidZ = 0;
				int i_336_ = 0;
				int i_337_ = is[i_336_++];
				for (int i_338_ = 0; i_338_ < animframe.transformationCount; i_338_++) {
					int i_339_;
					for (i_339_ = animframe.transformationIndices[i_338_]; i_339_ > i_337_; i_337_ = is[i_336_++]) {
						/* empty */
					}
					if (i_339_ != i_337_ || animframebase.transformationType[i_339_] == 0) {
						if (animframe.aShortArray2338[i_338_] != -1)
							transform(0, (animframebase.labels[animframe.aShortArray2338[i_338_]]), 0, 0, 0, bool);
						transform(animframebase.transformationType[i_339_], animframebase.labels[i_339_],
								animframe.transformX[i_338_], animframe.transformY[i_338_],
								animframe.transformZ[i_338_], bool);
					}
				}
				centroidX = 0;
				centroidY = 0;
				centroidZ = 0;
				i_336_ = 0;
				i_337_ = is[i_336_++];
				for (int i_340_ = 0; i_340_ < animframe_334_.transformationCount; i_340_++) {
					int i_341_;
					for (i_341_ = animframe_334_.transformationIndices[i_340_]; i_341_ > i_337_; i_337_ = is[i_336_++]) {
						/* empty */
					}
					if (i_341_ == i_337_ || animframebase.transformationType[i_341_] == 0) {
						if (animframe_334_.aShortArray2338[i_340_] != -1)
							transform(0, animframebase.labels[(animframe_334_.aShortArray2338[i_340_])], 0, 0, 0, bool);
						transform(animframebase.transformationType[i_341_], animframebase.labels[i_341_],
								animframe_334_.transformX[i_340_], animframe_334_.transformY[i_340_],
								animframe_334_.transformZ[i_340_], bool);
					}
				}
				for (int i_342_ = 0; i_342_ < anInt5033; i_342_++) {
					vertexX[i_342_] >>= 4;
					vertexY[i_342_] >>= 4;
					vertexZ[i_342_] >>= 4;
				}
				aClass50_5013.aBoolean820 = false;
				aClass41_5028.upToDate = false;
			}
		}
	}

	public void method1874(int i) {
		int i_343_ = Class3.sin[i];
		int i_344_ = Class3.cos[i];
		for (int i_345_ = 0; i_345_ < anInt5033; i_345_++) {
			int i_346_ = vertexZ[i_345_] * i_343_ + vertexX[i_345_] * i_344_ >> 16;
			vertexZ[i_345_] = vertexZ[i_345_] * i_344_ - vertexX[i_345_] * i_343_ >> 16;
			vertexX[i_345_] = i_346_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1875() {
		for (int i = 0; i < anInt5033; i++) {
			int i_347_ = vertexZ[i];
			vertexZ[i] = vertexX[i];
			vertexX[i] = -i_347_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
	}

	public void method1887() {
		GL gl = RT4GL.gl;
		if (anInt5014 != 0) {
			if (aByte5026 != 0)
				method1905(true, (!aClass41_5028.upToDate && (aByte5026 & 0x1) != 0),
						(!aClass41_5030.upToDate && (aByte5026 & 0x2) != 0),
						(aClass41_5018 != null && !aClass41_5018.upToDate && (aByte5026 & 0x4) != 0), false);
			method1905(false, !aClass41_5028.upToDate, !aClass41_5030.upToDate,
					aClass41_5018 != null && !aClass41_5018.upToDate, !aClass41_5029.upToDate);
			if (!aClass41_5046.upToDate)
				method1902();
			if (aByte5023 != 0) {
				if ((aByte5023 & 0x1) != 0) {
					vertexX = null;
					vertexY = null;
					vertexZ = null;
					aShortArray5036 = null;
					anIntArray5031 = null;
				}
				if ((aByte5023 & 0x2) != 0) {
					aShortArray5045 = null;
					faceAlphas = null;
				}
				if ((aByte5023 & 0x4) != 0) {
					aShortArray5041 = null;
					aShortArray5019 = null;
					aShortArray5042 = null;
					aShortArray5017 = null;
				}
				if ((aByte5023 & 0x8) != 0) {
					aFloatArray5047 = null;
					aFloatArray5012 = null;
				}
				if ((aByte5023 & 0x10) != 0) {
					aShortArray5021 = null;
					aShortArray5025 = null;
					aShortArray5038 = null;
				}
				aByte5023 = (byte) 0;
			}
			VertexBuffer vertexBuffer = null;
			if (aClass41_5028.aClass29_692 != null) {
				aClass41_5028.aClass29_692.bindArray();
				vertexBuffer = aClass41_5028.aClass29_692;
				gl.glVertexPointer(3, 5126, aClass41_5028.anInt687, (long) aClass41_5028.anInt686);
			}
			if (aClass41_5030.aClass29_692 != null) {
				if (vertexBuffer != aClass41_5030.aClass29_692) {
					aClass41_5030.aClass29_692.bindArray();
					vertexBuffer = aClass41_5030.aClass29_692;
				}
				gl.glColorPointer(4, 5121, aClass41_5030.anInt687, (long) aClass41_5030.anInt686);
			}
			if (RT4.useLighting && aClass41_5018.aClass29_692 != null) {
				if (vertexBuffer != aClass41_5018.aClass29_692) {
					aClass41_5018.aClass29_692.bindArray();
					vertexBuffer = aClass41_5018.aClass29_692;
				}
				gl.glNormalPointer(5126, aClass41_5018.anInt687, (long) aClass41_5018.anInt686);
			}
			if (aClass41_5029.aClass29_692 != null) {
				if (vertexBuffer != aClass41_5029.aClass29_692) {
					aClass41_5029.aClass29_692.bindArray();
					vertexBuffer = aClass41_5029.aClass29_692;
				}
				gl.glTexCoordPointer(2, 5126, aClass41_5029.anInt687, (long) aClass41_5029.anInt686);
			}
			if (aClass41_5046.aClass29_692 != null)
				aClass41_5046.aClass29_692.method1055();
			if (aClass41_5028.aClass29_692 == null || aClass41_5030.aClass29_692 == null
					|| (RT4.useLighting && aClass41_5018.aClass29_692 == null)
					|| aClass41_5029.aClass29_692 == null) {
				if (RT4GL.vertexBufferAsObject)
					gl.glBindBufferARB(34962, 0);
				if (aClass41_5028.aClass29_692 == null) {
					aClass41_5028.aByteBuffer684.position(aClass41_5028.anInt686);
					gl.glVertexPointer(3, 5126, aClass41_5028.anInt687, aClass41_5028.aByteBuffer684);
				}
				if (aClass41_5030.aClass29_692 == null) {
					aClass41_5030.aByteBuffer684.position(aClass41_5030.anInt686);
					gl.glColorPointer(4, 5121, aClass41_5030.anInt687, aClass41_5030.aByteBuffer684);
				}
				if (RT4.useLighting && aClass41_5018.aClass29_692 == null) {
					aClass41_5018.aByteBuffer684.position(aClass41_5018.anInt686);
					gl.glNormalPointer(5126, aClass41_5018.anInt687, aClass41_5018.aByteBuffer684);
				}
				if (aClass41_5029.aClass29_692 == null) {
					aClass41_5029.aByteBuffer684.position(aClass41_5029.anInt686);
					gl.glTexCoordPointer(2, 5126, aClass41_5029.anInt687, aClass41_5029.aByteBuffer684);
				}
			}
			if (aClass41_5046.aClass29_692 == null && RT4GL.vertexBufferAsObject)
				gl.glBindBufferARB(34963, 0);
			int i = anIntArray5035.length - 1;
			for (int i_348_ = 0; i_348_ < i; i_348_++) {
				int i_349_ = anIntArray5035[i_348_];
				int i_350_ = anIntArray5035[i_348_ + 1];
				int i_351_ = aShortArray5037[i_349_];
				if (i_351_ == -1) {
					RT4GL.method1632(-1);
					RT4.method1778(0, 0);
				} else
					Class3.anInterface3_117.method16(i_351_ & 0xffff, (byte) 97);
				if (aClass41_5046.aClass29_692 != null)
					gl.glDrawElements(4, (i_350_ - i_349_) * 3, 5125, (long) (i_349_ * 12));
				else {
					aClass41_5046.aByteBuffer684.position(i_349_ * 12);
					gl.glDrawElements(4, (i_350_ - i_349_) * 3, 5125, aClass41_5046.aByteBuffer684);
				}
			}
		}
	}

	public Class148_Sub1 method1889(Class148_Sub1 class148_sub1) {
		if (anInt5040 == 0)
			return null;
		if (!aClass50_5013.aBoolean820)
			method1891();
		int i;
		int i_352_;
		if (AtmosphericEffects.anInt934 > 0) {
			i = (aClass50_5013.aShort827 - (aClass50_5013.aShort826 * AtmosphericEffects.anInt934 >> 8)) >> 3;
			i_352_ = (aClass50_5013.aShort824 - (aClass50_5013.aShort825 * AtmosphericEffects.anInt934 >> 8)) >> 3;
		} else {
			i = (aClass50_5013.aShort827 - (aClass50_5013.aShort825 * AtmosphericEffects.anInt934 >> 8)) >> 3;
			i_352_ = (aClass50_5013.aShort824 - (aClass50_5013.aShort826 * AtmosphericEffects.anInt934 >> 8)) >> 3;
		}
		int i_353_;
		int i_354_;
		if (AtmosphericEffects.anInt928 > 0) {
			i_353_ = (aClass50_5013.aShort822 - (aClass50_5013.aShort826 * AtmosphericEffects.anInt928 >> 8)) >> 3;
			i_354_ = (aClass50_5013.aShort821 - (aClass50_5013.aShort825 * AtmosphericEffects.anInt928 >> 8)) >> 3;
		} else {
			i_353_ = (aClass50_5013.aShort822 - (aClass50_5013.aShort825 * AtmosphericEffects.anInt928 >> 8)) >> 3;
			i_354_ = (aClass50_5013.aShort821 - (aClass50_5013.aShort826 * AtmosphericEffects.anInt928 >> 8)) >> 3;
		}
		int i_355_ = i_352_ - i + 1;
		int i_356_ = i_354_ - i_353_ + 1;
		Class148_Sub1 class148_sub1_357_;
		if (class148_sub1 != null && class148_sub1.paletteIndicators.length >= i_355_ * i_356_) {
			class148_sub1_357_ = class148_sub1;
			class148_sub1_357_.anInt2378 = class148_sub1_357_.width = i_355_;
			class148_sub1_357_.anInt2373 = class148_sub1_357_.height = i_356_;
			class148_sub1_357_.method2010();
		} else
			class148_sub1_357_ = new Class148_Sub1(i_355_, i_356_, 0);
		class148_sub1_357_.anInt2375 = i;
		class148_sub1_357_.anInt2374 = i_353_;
		if (anIntArray5061.length < anInt5040) {
			anIntArray5061 = new int[anInt5040];
			anIntArray5057 = new int[anInt5040];
		}
		for (int i_358_ = 0; i_358_ < anInt5033; i_358_++) {
			int i_359_ = ((vertexX[i_358_] - (vertexY[i_358_] * AtmosphericEffects.anInt934 >> 8) >> 3) - i);
			int i_360_ = ((vertexZ[i_358_] - (vertexY[i_358_] * AtmosphericEffects.anInt928 >> 8) >> 3) - i_353_);
			int i_361_ = anIntArray5031[i_358_];
			int i_362_ = anIntArray5031[i_358_ + 1];
			for (int i_363_ = i_361_; i_363_ < i_362_; i_363_++) {
				int i_364_ = aShortArray5036[i_363_] - 1;
				if (i_364_ == -1)
					break;
				anIntArray5061[i_364_] = i_359_;
				anIntArray5057[i_364_] = i_360_;
			}
		}
		for (int i_365_ = 0; i_365_ < anInt5014; i_365_++) {
			if (faceAlphas[i_365_] <= 128) {
				short i_366_ = aShortArray5021[i_365_];
				short i_367_ = aShortArray5025[i_365_];
				short i_368_ = aShortArray5038[i_365_];
				int i_369_ = anIntArray5061[i_366_];
				int i_370_ = anIntArray5061[i_367_];
				int i_371_ = anIntArray5061[i_368_];
				int i_372_ = anIntArray5057[i_366_];
				int i_373_ = anIntArray5057[i_367_];
				int i_374_ = anIntArray5057[i_368_];
				if (((i_369_ - i_370_) * (i_373_ - i_374_) - (i_373_ - i_372_) * (i_371_ - i_370_)) > 0)
					Class3.method91(class148_sub1_357_.paletteIndicators, i_372_, i_373_, i_374_, i_369_, i_370_, i_371_,
							i_355_);
			}
		}
		return class148_sub1_357_;
	}

	public void method1890() {
		if (aShortArray5041 == null)
			method1875();
		else {
			for (int i = 0; i < anInt5033; i++) {
				int i_375_ = vertexZ[i];
				vertexZ[i] = vertexX[i];
				vertexX[i] = -i_375_;
			}
			for (int i = 0; i < anInt5040; i++) {
				int i_376_ = aShortArray5042[i];
				aShortArray5042[i] = aShortArray5041[i];
				aShortArray5041[i] = (short) -i_376_;
			}
			aClass50_5013.aBoolean820 = false;
			aClass41_5028.upToDate = false;
			if (aClass41_5018 != null)
				aClass41_5018.upToDate = false;
		}
	}

	public void method1891() {
		int i = 32767;
		int i_377_ = 32767;
		int i_378_ = 32767;
		int i_379_ = -32768;
		int i_380_ = -32768;
		int i_381_ = -32768;
		int i_382_ = 0;
		int i_383_ = 0;
		for (int i_384_ = 0; i_384_ < anInt5033; i_384_++) {
			int i_385_ = vertexX[i_384_];
			int i_386_ = vertexY[i_384_];
			int i_387_ = vertexZ[i_384_];
			if (i_385_ < i)
				i = i_385_;
			if (i_385_ > i_379_)
				i_379_ = i_385_;
			if (i_386_ < i_377_)
				i_377_ = i_386_;
			if (i_386_ > i_380_)
				i_380_ = i_386_;
			if (i_387_ < i_378_)
				i_378_ = i_387_;
			if (i_387_ > i_381_)
				i_381_ = i_387_;
			int i_388_ = i_385_ * i_385_ + i_387_ * i_387_;
			if (i_388_ > i_382_)
				i_382_ = i_388_;
			i_388_ = i_385_ * i_385_ + i_387_ * i_387_ + i_386_ * i_386_;
			if (i_388_ > i_383_)
				i_383_ = i_388_;
		}
		aClass50_5013.aShort827 = (short) i;
		aClass50_5013.aShort824 = (short) i_379_;
		aClass50_5013.aShort825 = (short) i_377_;
		aClass50_5013.aShort826 = (short) i_380_;
		aClass50_5013.aShort822 = (short) i_378_;
		aClass50_5013.aShort821 = (short) i_381_;
		aClass50_5013.aShort823 = (short) (int) (Math.sqrt((double) i_382_) + 0.99);
		Math.sqrt((double) i_383_);
		aClass50_5013.aBoolean820 = true;
	}

	public void method1892(int i) {
		aShort5032 = (short) i;
		aClass41_5030.upToDate = false;
	}

	public void method1893(int i, int i_389_, int i_390_, int i_391_) {
		if (i == 0) {
			int i_392_ = 0;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;
			for (int i_393_ = 0; i_393_ < anInt5033; i_393_++) {
				centroidX += vertexX[i_393_];
				centroidY += vertexY[i_393_];
				centroidZ += vertexZ[i_393_];
				i_392_++;
			}
			if (i_392_ > 0) {
				centroidX = centroidX / i_392_ + i_389_;
				centroidY = centroidY / i_392_ + i_390_;
				centroidZ = centroidZ / i_392_ + i_391_;
			} else {
				centroidX = i_389_;
				centroidY = i_390_;
				centroidZ = i_391_;
			}
		} else if (i == 1) {
			for (int i_394_ = 0; i_394_ < anInt5033; i_394_++) {
				vertexX[i_394_] += i_389_;
				vertexY[i_394_] += i_390_;
				vertexZ[i_394_] += i_391_;
			}
		} else if (i == 2) {
			for (int i_395_ = 0; i_395_ < anInt5033; i_395_++) {
				vertexX[i_395_] -= centroidX;
				vertexY[i_395_] -= centroidY;
				vertexZ[i_395_] -= centroidZ;
				if (i_391_ != 0) {
					int i_396_ = Class3.sin[i_391_];
					int i_397_ = Class3.cos[i_391_];
					int i_398_ = ((vertexY[i_395_] * i_396_ + vertexX[i_395_] * i_397_ + 32767) >> 16);
					vertexY[i_395_] = (vertexY[i_395_] * i_397_ - vertexX[i_395_] * i_396_ + 32767) >> 16;
					vertexX[i_395_] = i_398_;
				}
				if (i_389_ != 0) {
					int i_399_ = Class3.sin[i_389_];
					int i_400_ = Class3.cos[i_389_];
					int i_401_ = ((vertexY[i_395_] * i_400_ - vertexZ[i_395_] * i_399_ + 32767) >> 16);
					vertexZ[i_395_] = (vertexY[i_395_] * i_399_ + vertexZ[i_395_] * i_400_ + 32767) >> 16;
					vertexY[i_395_] = i_401_;
				}
				if (i_390_ != 0) {
					int i_402_ = Class3.sin[i_390_];
					int i_403_ = Class3.cos[i_390_];
					int i_404_ = ((vertexZ[i_395_] * i_402_ + vertexX[i_395_] * i_403_ + 32767) >> 16);
					vertexZ[i_395_] = (vertexZ[i_395_] * i_403_ - vertexX[i_395_] * i_402_ + 32767) >> 16;
					vertexX[i_395_] = i_404_;
				}
				vertexX[i_395_] += centroidX;
				vertexY[i_395_] += centroidY;
				vertexZ[i_395_] += centroidZ;
			}
		} else if (i == 3) {
			for (int i_405_ = 0; i_405_ < anInt5033; i_405_++) {
				vertexX[i_405_] -= centroidX;
				vertexY[i_405_] -= centroidY;
				vertexZ[i_405_] -= centroidZ;
				vertexX[i_405_] = vertexX[i_405_] * i_389_ / 128;
				vertexY[i_405_] = vertexY[i_405_] * i_390_ / 128;
				vertexZ[i_405_] = vertexZ[i_405_] * i_391_ / 128;
				vertexX[i_405_] += centroidX;
				vertexY[i_405_] += centroidY;
				vertexZ[i_405_] += centroidZ;
			}
		} else if (i == 5) {
			for (int i_406_ = 0; i_406_ < anInt5014; i_406_++) {
				int i_407_ = (faceAlphas[i_406_] & 0xff) + i_389_ * 8;
				if (i_407_ < 0)
					i_407_ = 0;
				else if (i_407_ > 255)
					i_407_ = 255;
				faceAlphas[i_406_] = (byte) i_407_;
			}
			aClass41_5030.upToDate = false;
		}
	}

	public void method1895(boolean bool, boolean bool_408_, boolean bool_409_, boolean bool_410_, boolean bool_411_,
			boolean bool_412_, boolean bool_413_) {
		if (aByte5026 != 0)
			throw new IllegalArgumentException();
		if (anInt5040 != 0) {
			if (bool_413_) {
				boolean bool_414_ = (!aClass41_5030.upToDate
						&& (bool_408_ || bool_409_ && !RT4.useLighting));
				method1905(false, !aClass41_5028.upToDate && bool, bool_414_,
						(aClass41_5018 != null && !aClass41_5018.upToDate && bool_409_),
						!aClass41_5029.upToDate && bool_410_);
				if (!aClass41_5046.upToDate && bool_411_ && bool_408_)
					method1902();
			}
			if (bool) {
				if (aClass41_5028.upToDate) {
					vertexX = null;
					vertexY = null;
					vertexZ = null;
					aShortArray5036 = null;
					anIntArray5031 = null;
				} else
					aByte5023 |= 0x1;
			}
			if (bool_408_) {
				if (aClass41_5030.upToDate) {
					aShortArray5045 = null;
					faceAlphas = null;
				} else
					aByte5023 |= 0x2;
			}
			if (bool_409_ && RT4.useLighting) {
				if (aClass41_5018.upToDate) {
					aShortArray5041 = null;
					aShortArray5019 = null;
					aShortArray5042 = null;
					aShortArray5017 = null;
				} else
					aByte5023 |= 0x4;
			}
			if (bool_410_) {
				if (aClass41_5029.upToDate) {
					aFloatArray5047 = null;
					aFloatArray5012 = null;
				} else
					aByte5023 |= 0x8;
			}
			if (bool_411_ && bool_408_) {
				if (aClass41_5046.upToDate && aClass41_5030.upToDate) {
					aShortArray5021 = null;
					aShortArray5025 = null;
					aShortArray5038 = null;
				} else
					aByte5023 |= 0x10;
			}
			if (bool_412_) {
				anIntArray5034 = null;
				aByteArray5016 = null;
				vertexGroups = null;
				anIntArrayArray5015 = null;
			}
		}
	}

	public int method1896() {
		return aShort5032;
	}

	public void method1897(int i, int i_415_, ModelHD modelhd_416_, int[][] is, int[][] is_417_, int i_418_, int i_419_,
			int i_420_) {
		if (!modelhd_416_.aClass50_5013.aBoolean820)
			modelhd_416_.method1891();
		int i_421_ = i_418_ + modelhd_416_.aClass50_5013.aShort827;
		int i_422_ = i_418_ + modelhd_416_.aClass50_5013.aShort824;
		int i_423_ = i_420_ + modelhd_416_.aClass50_5013.aShort822;
		int i_424_ = i_420_ + modelhd_416_.aClass50_5013.aShort821;
		if (i != 1 && i != 2 && i != 3 && i != 5
				|| (i_421_ >= 0 && i_422_ + 128 >> 7 < is.length && i_423_ >= 0 && i_424_ + 128 >> 7 < is[0].length)) {
			if (i == 4 || i == 5) {
				if (is_417_ == null || i_421_ < 0 || i_422_ + 128 >> 7 >= is_417_.length || i_423_ < 0
						|| i_424_ + 128 >> 7 >= is_417_[0].length)
					return;
			} else {
				i_421_ >>= 7;
				i_422_ = i_422_ + 127 >> 7;
				i_423_ >>= 7;
				i_424_ = i_424_ + 127 >> 7;
				if (is[i_421_][i_423_] == i_419_ && is[i_422_][i_423_] == i_419_ && is[i_421_][i_424_] == i_419_
						&& is[i_422_][i_424_] == i_419_)
					return;
			}
			if (i == 1) {
				for (int i_425_ = 0; i_425_ < anInt5033; i_425_++) {
					int i_426_ = vertexX[i_425_] + i_418_;
					int i_427_ = vertexZ[i_425_] + i_420_;
					int i_428_ = i_426_ & 0x7f;
					int i_429_ = i_427_ & 0x7f;
					int i_430_ = i_426_ >> 7;
					int i_431_ = i_427_ >> 7;
					int i_432_ = ((is[i_430_][i_431_] * (128 - i_428_) + is[i_430_ + 1][i_431_] * i_428_) >> 7);
					int i_433_ = ((is[i_430_][i_431_ + 1] * (128 - i_428_) + is[i_430_ + 1][i_431_ + 1] * i_428_) >> 7);
					int i_434_ = i_432_ * (128 - i_429_) + i_433_ * i_429_ >> 7;
					vertexY[i_425_] = vertexY[i_425_] + i_434_ - i_419_;
				}
			} else if (i == 2) {
				int i_435_ = modelhd_416_.aClass50_5013.aShort825;
				for (int i_436_ = 0; i_436_ < anInt5033; i_436_++) {
					int i_437_ = (vertexY[i_436_] << 16) / i_435_;
					if (i_437_ < i_415_) {
						int i_438_ = vertexX[i_436_] + i_418_;
						int i_439_ = vertexZ[i_436_] + i_420_;
						int i_440_ = i_438_ & 0x7f;
						int i_441_ = i_439_ & 0x7f;
						int i_442_ = i_438_ >> 7;
						int i_443_ = i_439_ >> 7;
						int i_444_ = ((is[i_442_][i_443_] * (128 - i_440_) + is[i_442_ + 1][i_443_] * i_440_) >> 7);
						int i_445_ = ((is[i_442_][i_443_ + 1] * (128 - i_440_)
								+ is[i_442_ + 1][i_443_ + 1] * i_440_) >> 7);
						int i_446_ = i_444_ * (128 - i_441_) + i_445_ * i_441_ >> 7;
						vertexY[i_436_] = vertexY[i_436_] + ((i_446_ - i_419_) * (i_415_ - i_437_) / i_415_);
					}
				}
			} else if (i == 3) {
				int i_447_ = (i_415_ & 0xff) * 4;
				int i_448_ = (i_415_ >> 8 & 0xff) * 4;
				method1863(is, i_418_, i_419_, i_420_, i_447_, i_448_);
			} else if (i == 4) {
				int i_449_ = (modelhd_416_.aClass50_5013.aShort826 - modelhd_416_.aClass50_5013.aShort825);
				for (int i_450_ = 0; i_450_ < anInt5033; i_450_++) {
					int i_451_ = vertexX[i_450_] + i_418_;
					int i_452_ = vertexZ[i_450_] + i_420_;
					int i_453_ = i_451_ & 0x7f;
					int i_454_ = i_452_ & 0x7f;
					int i_455_ = i_451_ >> 7;
					int i_456_ = i_452_ >> 7;
					int i_457_ = ((is_417_[i_455_][i_456_] * (128 - i_453_)
							+ is_417_[i_455_ + 1][i_456_] * i_453_) >> 7);
					int i_458_ = ((is_417_[i_455_][i_456_ + 1] * (128 - i_453_)
							+ is_417_[i_455_ + 1][i_456_ + 1] * i_453_) >> 7);
					int i_459_ = i_457_ * (128 - i_454_) + i_458_ * i_454_ >> 7;
					vertexY[i_450_] = vertexY[i_450_] + (i_459_ - i_419_) + i_449_;
				}
			} else if (i == 5) {
				int i_460_ = (modelhd_416_.aClass50_5013.aShort826 - modelhd_416_.aClass50_5013.aShort825);
				for (int i_461_ = 0; i_461_ < anInt5033; i_461_++) {
					int i_462_ = vertexX[i_461_] + i_418_;
					int i_463_ = vertexZ[i_461_] + i_420_;
					int i_464_ = i_462_ & 0x7f;
					int i_465_ = i_463_ & 0x7f;
					int i_466_ = i_462_ >> 7;
					int i_467_ = i_463_ >> 7;
					int i_468_ = ((is[i_466_][i_467_] * (128 - i_464_) + is[i_466_ + 1][i_467_] * i_464_) >> 7);
					int i_469_ = ((is[i_466_][i_467_ + 1] * (128 - i_464_) + is[i_466_ + 1][i_467_ + 1] * i_464_) >> 7);
					int i_470_ = i_468_ * (128 - i_465_) + i_469_ * i_465_ >> 7;
					i_468_ = (is_417_[i_466_][i_467_] * (128 - i_464_) + is_417_[i_466_ + 1][i_467_] * i_464_) >> 7;
					i_469_ = (is_417_[i_466_][i_467_ + 1] * (128 - i_464_)
							+ is_417_[i_466_ + 1][i_467_ + 1] * i_464_) >> 7;
					int i_471_ = i_468_ * (128 - i_465_) + i_469_ * i_465_ >> 7;
					int i_472_ = i_470_ - i_471_;
					vertexY[i_461_] = ((vertexY[i_461_] << 8) / i_460_ * i_472_ >> 8) - (i_419_ - i_470_);
				}
			}
			aClass41_5028.upToDate = false;
			aClass50_5013.aBoolean820 = false;
		}
	}

	public void method1899() {
		if (aShortArray5041 == null)
			method1872();
		else {
			for (int i = 0; i < anInt5033; i++) {
				vertexX[i] = -vertexX[i];
				vertexZ[i] = -vertexZ[i];
			}
			for (int i = 0; i < anInt5040; i++) {
				aShortArray5041[i] = (short) -aShortArray5041[i];
				aShortArray5042[i] = (short) -aShortArray5042[i];
			}
			aClass50_5013.aBoolean820 = false;
			aClass41_5028.upToDate = false;
			if (aClass41_5018 != null)
				aClass41_5018.upToDate = false;
		}
	}

	public void method1900(int i) {
		aShort5024 = (short) i;
		if (aClass41_5018 != null)
			aClass41_5018.upToDate = false;
	}

	public short method1901(Class133_Sub2 class133_sub2, int i, long l, int i_473_, int i_474_, int i_475_, int i_476_,
			float f, float f_477_) {
		int i_478_ = anIntArray5031[i];
		int i_479_ = anIntArray5031[i + 1];
		int i_480_ = 0;
		for (int i_481_ = i_478_; i_481_ < i_479_; i_481_++) {
			short i_482_ = aShortArray5036[i_481_];
			if (i_482_ == 0) {
				i_480_ = i_481_;
				break;
			}
			if (aLongArray5048[i_481_] == l)
				return (short) (i_482_ - 1);
		}
		aShortArray5036[i_480_] = (short) (anInt5040 + 1);
		aLongArray5048[i_480_] = l;
		aShortArray5041[anInt5040] = (short) i_473_;
		aShortArray5019[anInt5040] = (short) i_474_;
		aShortArray5042[anInt5040] = (short) i_475_;
		aShortArray5017[anInt5040] = (short) i_476_;
		aFloatArray5047[anInt5040] = f;
		aFloatArray5012[anInt5040] = f_477_;
		return (short) anInt5040++;
	}

	public void method1902() {
		if (aClass14_Sub10_5011.payload.length < anInt5040 * 12)
			aClass14_Sub10_5011 = new Buffer((anInt5040 + 100) * 12);
		else
			aClass14_Sub10_5011.position = 0;
		if (RT4GL.usingBigEndian) {
			for (int i = 0; i < anInt5014; i++) {
				aClass14_Sub10_5011.method803(aShortArray5021[i], 116);
				aClass14_Sub10_5011.method803(aShortArray5025[i], 74);
				aClass14_Sub10_5011.method803(aShortArray5038[i], 79);
			}
		} else {
			for (int i = 0; i < anInt5014; i++) {
				aClass14_Sub10_5011.method825(-70, aShortArray5021[i]);
				aClass14_Sub10_5011.method825(-82, aShortArray5025[i]);
				aClass14_Sub10_5011.method825(-65, aShortArray5038[i]);
			}
		}
		if (RT4GL.vertexBufferAsObject) {
			VertexBuffer vertexBuffer = new VertexBuffer();
			ByteBuffer bytebuffer = ByteBuffer.wrap(aClass14_Sub10_5011.payload, 0,
					aClass14_Sub10_5011.position);
			vertexBuffer._setArrayData(bytebuffer);
			aClass41_5046.upToDate = true;
			aClass41_5046.aByteBuffer684 = null;
			aClass41_5046.aClass29_692 = vertexBuffer;
		} else {
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(aClass14_Sub10_5011.position);
			bytebuffer.put(aClass14_Sub10_5011.payload, 0, aClass14_Sub10_5011.position);
			bytebuffer.flip();
			aClass41_5046.upToDate = true;
			aClass41_5046.aByteBuffer684 = bytebuffer;
			aClass41_5046.aClass29_692 = null;
		}
	}

	public ModelHD method1903(boolean bool, boolean bool_483_, boolean bool_484_, boolean bool_485_, boolean bool_486_,
			boolean bool_487_, boolean bool_488_, boolean bool_489_, boolean bool_490_, boolean bool_491_,
			boolean bool_492_) {
		ModelHD modelhd_493_ = new ModelHD();
		modelhd_493_.anInt5033 = anInt5033;
		modelhd_493_.anInt5040 = anInt5040;
		modelhd_493_.anInt5014 = anInt5014;
		if (bool) {
			modelhd_493_.vertexX = vertexX;
			modelhd_493_.vertexZ = vertexZ;
		} else {
			modelhd_493_.vertexX = Class14_Sub8_Sub16.method561(vertexX, 0);
			modelhd_493_.vertexZ = Class14_Sub8_Sub16.method561(vertexZ, 0);
		}
		if (bool_483_)
			modelhd_493_.vertexY = vertexY;
		else
			modelhd_493_.vertexY = Class14_Sub8_Sub16.method561(vertexY, 0);
		if (bool && bool_483_) {
			modelhd_493_.aClass41_5028 = aClass41_5028;
			modelhd_493_.aClass50_5013 = aClass50_5013;
		} else {
			modelhd_493_.aClass41_5028 = new VertexBufferPointer();
			modelhd_493_.aClass50_5013 = new Class50();
		}
		if (bool_484_)
			modelhd_493_.aShortArray5045 = aShortArray5045;
		else
			modelhd_493_.aShortArray5045 = Class14_Sub8_Sub33.method655(8111, aShortArray5045);
		if (bool_485_)
			modelhd_493_.faceAlphas = faceAlphas;
		else
			modelhd_493_.faceAlphas = Static2.method1121(faceAlphas, 24);
		if (bool_484_ && bool_485_ && bool_486_ && (bool_489_ && bool_487_ || RT4.useLighting))
			modelhd_493_.aClass41_5030 = aClass41_5030;
		else
			modelhd_493_.aClass41_5030 = new VertexBufferPointer();
		if (bool_487_) {
			modelhd_493_.aShortArray5041 = aShortArray5041;
			modelhd_493_.aShortArray5019 = aShortArray5019;
			modelhd_493_.aShortArray5042 = aShortArray5042;
			modelhd_493_.aShortArray5017 = aShortArray5017;
		} else {
			modelhd_493_.aShortArray5041 = Class14_Sub8_Sub33.method655(8111, aShortArray5041);
			modelhd_493_.aShortArray5019 = Class14_Sub8_Sub33.method655(8111, aShortArray5019);
			modelhd_493_.aShortArray5042 = Class14_Sub8_Sub33.method655(8111, aShortArray5042);
			modelhd_493_.aShortArray5017 = Class14_Sub8_Sub33.method655(8111, aShortArray5017);
		}
		if (RT4.useLighting) {
			if (bool_487_ && bool_488_ && bool_489_)
				modelhd_493_.aClass41_5018 = aClass41_5018;
			else
				modelhd_493_.aClass41_5018 = new VertexBufferPointer();
		} else
			modelhd_493_.aClass41_5018 = null;
		if (bool_490_) {
			modelhd_493_.aFloatArray5047 = aFloatArray5047;
			modelhd_493_.aFloatArray5012 = aFloatArray5012;
			modelhd_493_.aClass41_5029 = aClass41_5029;
		} else {
			modelhd_493_.aFloatArray5047 = Canvas_Sub2.method62(aFloatArray5047, false);
			modelhd_493_.aFloatArray5012 = Canvas_Sub2.method62(aFloatArray5012, false);
			modelhd_493_.aClass41_5029 = new VertexBufferPointer();
		}
		if (bool_491_) {
			modelhd_493_.aShortArray5021 = aShortArray5021;
			modelhd_493_.aShortArray5025 = aShortArray5025;
			modelhd_493_.aShortArray5038 = aShortArray5038;
			modelhd_493_.aClass41_5046 = aClass41_5046;
		} else {
			modelhd_493_.aShortArray5021 = Class14_Sub8_Sub33.method655(8111, aShortArray5021);
			modelhd_493_.aShortArray5025 = Class14_Sub8_Sub33.method655(8111, aShortArray5025);
			modelhd_493_.aShortArray5038 = Class14_Sub8_Sub33.method655(8111, aShortArray5038);
			modelhd_493_.aClass41_5046 = new VertexBufferPointer();
		}
		if (bool_492_)
			modelhd_493_.aShortArray5037 = aShortArray5037;
		else
			modelhd_493_.aShortArray5037 = Class14_Sub8_Sub33.method655(8111, aShortArray5037);
		modelhd_493_.anIntArray5034 = anIntArray5034;
		modelhd_493_.vertexGroups = vertexGroups;
		modelhd_493_.aByteArray5016 = aByteArray5016;
		modelhd_493_.anIntArrayArray5015 = anIntArrayArray5015;
		modelhd_493_.anIntArray5035 = anIntArray5035;
		modelhd_493_.aShortArray5036 = aShortArray5036;
		modelhd_493_.anIntArray5031 = anIntArray5031;
		modelhd_493_.aShort5032 = aShort5032;
		modelhd_493_.aShort5024 = aShort5024;
		return modelhd_493_;
	}

	public void method1905(boolean bool, boolean bool_494_, boolean bool_495_, boolean bool_496_, boolean bool_497_) {
		int i = 0;
		if (bool_494_) {
			aClass41_5028.anInt686 = i;
			i += 12;
		}
		if (bool_495_) {
			aClass41_5030.anInt686 = i;
			i += 4;
		}
		if (bool_496_) {
			aClass41_5018.anInt686 = i;
			i += 12;
		}
		if (bool_497_) {
			aClass41_5029.anInt686 = i;
			i += 8;
		}
		if (i != 0) {
			if (aClass14_Sub10_5011.payload.length < anInt5040 * i)
				aClass14_Sub10_5011 = new Buffer((anInt5040 + 100) * i);
			else
				aClass14_Sub10_5011.position = 0;
			if (bool_494_) {
				if (RT4GL.usingBigEndian) {
					for (int i_498_ = 0; i_498_ < anInt5033; i_498_++) {
						int i_499_ = Float.floatToRawIntBits((float) vertexX[i_498_]);
						int i_500_ = Float.floatToRawIntBits((float) vertexY[i_498_]);
						int i_501_ = Float.floatToRawIntBits((float) vertexZ[i_498_]);
						int i_502_ = anIntArray5031[i_498_];
						int i_503_ = anIntArray5031[i_498_ + 1];
						for (int i_504_ = i_502_; i_504_ < i_503_; i_504_++) {
							int i_505_ = aShortArray5036[i_504_] - 1;
							if (i_505_ == -1)
								break;
							aClass14_Sub10_5011.position = i_505_ * i;
							aClass14_Sub10_5011.method803(i_499_, 123);
							aClass14_Sub10_5011.method803(i_500_, 90);
							aClass14_Sub10_5011.method803(i_501_, 85);
						}
					}
				} else {
					for (int i_506_ = 0; i_506_ < anInt5033; i_506_++) {
						int i_507_ = Float.floatToRawIntBits((float) vertexX[i_506_]);
						int i_508_ = Float.floatToRawIntBits((float) vertexY[i_506_]);
						int i_509_ = Float.floatToRawIntBits((float) vertexZ[i_506_]);
						int i_510_ = anIntArray5031[i_506_];
						int i_511_ = anIntArray5031[i_506_ + 1];
						for (int i_512_ = i_510_; i_512_ < i_511_; i_512_++) {
							int i_513_ = aShortArray5036[i_512_] - 1;
							if (i_513_ == -1)
								break;
							aClass14_Sub10_5011.position = i_513_ * i;
							aClass14_Sub10_5011.method825(-32, i_507_);
							aClass14_Sub10_5011.method825(-79, i_508_);
							aClass14_Sub10_5011.method825(-99, i_509_);
						}
					}
				}
			}
			if (bool_495_) {
				if (!RT4.useLighting) {
					int i_514_ = (int) AtmosphericEffects.light0Position[0];
					int i_515_ = (int) AtmosphericEffects.light0Position[1];
					int i_516_ = (int) AtmosphericEffects.light0Position[2];
					int i_517_ = (int) Math.sqrt((double) (i_514_ * i_514_ + i_515_ * i_515_ + i_516_ * i_516_));
					int i_518_ = (int) ((float) aShort5032 * 1.3F);
					int i_519_ = aShort5024 * i_517_ >> 8;
					for (int i_520_ = 0; i_520_ < anInt5014; i_520_++) {
						int i_521_ = aShortArray5021[i_520_];
						int i_522_ = aShortArray5017[i_521_];
						int i_523_;
						if (i_522_ < 0)
							i_523_ = -1 - i_522_;
						else {
							if (i_522_ != 0)
								i_523_ = (i_518_ + ((i_514_ * aShortArray5041[i_521_] + i_515_ * aShortArray5019[i_521_]
										+ i_516_ * aShortArray5042[i_521_]) / (i_519_ * i_522_)));
							else
								i_523_ = (i_518_ + ((i_514_ * aShortArray5041[i_521_] + i_515_ * aShortArray5019[i_521_]
										+ i_516_ * aShortArray5042[i_521_]) / (i_519_ + i_519_ / 2)));
							if (i_523_ < 0)
								i_523_ = 0;
							else if (i_523_ > 16384)
								i_523_ = 16384;
							aShortArray5017[i_521_] = (short) (-1 - i_523_);
						}
						int i_524_ = aShortArray5025[i_520_];
						int i_525_ = aShortArray5017[i_524_];
						int i_526_;
						if (i_525_ < 0)
							i_526_ = -1 - i_525_;
						else {
							if (i_525_ != 0)
								i_526_ = (i_518_ + ((i_514_ * aShortArray5041[i_524_] + i_515_ * aShortArray5019[i_524_]
										+ i_516_ * aShortArray5042[i_524_]) / (i_519_ * i_525_)));
							else
								i_526_ = (i_518_ + ((i_514_ * aShortArray5041[i_524_] + i_515_ * aShortArray5019[i_524_]
										+ i_516_ * aShortArray5042[i_524_]) / (i_519_ + i_519_ / 2)));
							if (i_526_ < 0)
								i_526_ = 0;
							else if (i_526_ > 16384)
								i_526_ = 16384;
							aShortArray5017[i_524_] = (short) (-1 - i_526_);
						}
						int i_527_ = aShortArray5038[i_520_];
						int i_528_ = aShortArray5017[i_527_];
						int i_529_;
						if (i_528_ < 0)
							i_529_ = -1 - i_528_;
						else {
							if (i_528_ != 0)
								i_529_ = (i_518_ + ((i_514_ * aShortArray5041[i_527_] + i_515_ * aShortArray5019[i_527_]
										+ i_516_ * aShortArray5042[i_527_]) / (i_519_ * i_528_)));
							else
								i_529_ = (i_518_ + ((i_514_ * aShortArray5041[i_527_] + i_515_ * aShortArray5019[i_527_]
										+ i_516_ * aShortArray5042[i_527_]) / (i_519_ + i_519_ / 2)));
							if (i_529_ < 0)
								i_529_ = 0;
							else if (i_529_ > 16384)
								i_529_ = 16384;
							aShortArray5017[i_527_] = (short) (-1 - i_529_);
						}
						int i_530_ = method1904(aShortArray5045[i_520_], aShortArray5037[i_520_], i_523_,
								faceAlphas[i_520_]);
						int i_531_ = method1904(aShortArray5045[i_520_], aShortArray5037[i_520_], i_526_,
								faceAlphas[i_520_]);
						int i_532_ = method1904(aShortArray5045[i_520_], aShortArray5037[i_520_], i_529_,
								faceAlphas[i_520_]);
						aClass14_Sub10_5011.position = aClass41_5030.anInt686 + i_521_ * i;
						aClass14_Sub10_5011.method803(i_530_, 118);
						aClass14_Sub10_5011.position = aClass41_5030.anInt686 + i_524_ * i;
						aClass14_Sub10_5011.method803(i_531_, 105);
						aClass14_Sub10_5011.position = aClass41_5030.anInt686 + i_527_ * i;
						aClass14_Sub10_5011.method803(i_532_, 90);
					}
					aShortArray5041 = null;
					aShortArray5019 = null;
					aShortArray5042 = null;
				} else {
					for (int i_533_ = 0; i_533_ < anInt5014; i_533_++) {
						int i_534_ = method1904(aShortArray5045[i_533_], aShortArray5037[i_533_], aShort5032,
								faceAlphas[i_533_]);
						aClass14_Sub10_5011.position = (aClass41_5030.anInt686 + aShortArray5021[i_533_] * i);
						aClass14_Sub10_5011.method803(i_534_, 90);
						aClass14_Sub10_5011.position = (aClass41_5030.anInt686 + aShortArray5025[i_533_] * i);
						aClass14_Sub10_5011.method803(i_534_, 108);
						aClass14_Sub10_5011.position = (aClass41_5030.anInt686 + aShortArray5038[i_533_] * i);
						aClass14_Sub10_5011.method803(i_534_, 91);
					}
				}
			}
			if (bool_496_) {
				float f = 3.0F / (float) aShort5024;
				float f_535_ = 3.0F / (float) (aShort5024 + aShort5024 / 2);
				aClass14_Sub10_5011.position = aClass41_5018.anInt686;
				if (RT4GL.usingBigEndian) {
					for (int i_536_ = 0; i_536_ < anInt5040; i_536_++) {
						short i_537_ = aShortArray5017[i_536_];
						if (i_537_ == 0) {
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5041[i_536_] * f_535_);
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5019[i_536_] * f_535_);
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5042[i_536_] * f_535_);
						} else {
							float f_538_ = f / (float) i_537_;
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5041[i_536_] * f_538_);
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5019[i_536_] * f_538_);
							aClass14_Sub10_5011.putFloatAsInt((float) aShortArray5042[i_536_] * f_538_);
						}
						aClass14_Sub10_5011.position += i - 12;
					}
				} else {
					for (int i_539_ = 0; i_539_ < anInt5040; i_539_++) {
						short i_540_ = aShortArray5017[i_539_];
						if (i_540_ == 0) {
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5041[i_539_] * f_535_, 24671);
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5019[i_539_] * f_535_, 24671);
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5042[i_539_] * f_535_, 24671);
						} else {
							float f_541_ = f / (float) i_540_;
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5041[i_539_] * f_541_, 24671);
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5019[i_539_] * f_541_, 24671);
							aClass14_Sub10_5011.putFloatAsLEInt((float) aShortArray5042[i_539_] * f_541_, 24671);
						}
						aClass14_Sub10_5011.position += i - 12;
					}
				}
			}
			if (bool_497_) {
				aClass14_Sub10_5011.position = aClass41_5029.anInt686;
				if (RT4GL.usingBigEndian) {
					for (int i_542_ = 0; i_542_ < anInt5040; i_542_++) {
						aClass14_Sub10_5011.putFloatAsInt(aFloatArray5047[i_542_]);
						aClass14_Sub10_5011.putFloatAsInt(aFloatArray5012[i_542_]);
						aClass14_Sub10_5011.position += i - 8;
					}
				} else {
					for (int i_543_ = 0; i_543_ < anInt5040; i_543_++) {
						aClass14_Sub10_5011.putFloatAsLEInt(aFloatArray5047[i_543_], 24671);
						aClass14_Sub10_5011.putFloatAsLEInt(aFloatArray5012[i_543_], 24671);
						aClass14_Sub10_5011.position += i - 8;
					}
				}
			}
			aClass14_Sub10_5011.position = i * anInt5040;
			if (bool) {
				if (RT4GL.aBoolean2051) {
					ByteBuffer bytebuffer = ByteBuffer.wrap(aClass14_Sub10_5011.payload, 0,
							aClass14_Sub10_5011.position);
					if (aClass29_5020 == null) {
						aClass29_5020 = new VertexBuffer(true);
						aClass29_5020._setArrayData(bytebuffer);
					} else
						aClass29_5020.setArrayData(bytebuffer);
					if (bool_494_) {
						aClass41_5028.upToDate = true;
						aClass41_5028.aByteBuffer684 = null;
						aClass41_5028.aClass29_692 = aClass29_5020;
						aClass41_5028.anInt687 = i;
					}
					if (bool_495_) {
						aClass41_5030.upToDate = true;
						aClass41_5030.aByteBuffer684 = null;
						aClass41_5030.aClass29_692 = aClass29_5020;
						aClass41_5030.anInt687 = i;
					}
					if (bool_496_) {
						aClass41_5018.upToDate = true;
						aClass41_5018.aByteBuffer684 = null;
						aClass41_5018.aClass29_692 = aClass29_5020;
						aClass41_5018.anInt687 = i;
					}
					if (bool_497_) {
						aClass41_5029.upToDate = true;
						aClass41_5029.aByteBuffer684 = null;
						aClass41_5029.aClass29_692 = aClass29_5020;
						aClass41_5029.anInt687 = i;
					}
				} else {
					if (aByteBuffer5050 == null || (aByteBuffer5050.capacity() < aClass14_Sub10_5011.position))
						aByteBuffer5050 = ByteBuffer.allocateDirect((aClass14_Sub10_5011.position) + i * 100);
					else
						aByteBuffer5050.clear();
					aByteBuffer5050.put(aClass14_Sub10_5011.payload, 0, aClass14_Sub10_5011.position);
					aByteBuffer5050.flip();
					if (bool_494_) {
						aClass41_5028.upToDate = true;
						aClass41_5028.aByteBuffer684 = aByteBuffer5050;
						aClass41_5028.aClass29_692 = null;
						aClass41_5028.anInt687 = i;
					}
					if (bool_495_) {
						aClass41_5030.upToDate = true;
						aClass41_5030.aByteBuffer684 = aByteBuffer5050;
						aClass41_5028.aClass29_692 = null;
						aClass41_5030.anInt687 = i;
					}
					if (bool_496_) {
						aClass41_5018.upToDate = true;
						aClass41_5018.aByteBuffer684 = aByteBuffer5050;
						aClass41_5018.aClass29_692 = null;
						aClass41_5018.anInt687 = i;
					}
					if (bool_497_) {
						aClass41_5029.upToDate = true;
						aClass41_5029.aByteBuffer684 = aByteBuffer5050;
						aClass41_5029.aClass29_692 = null;
						aClass41_5029.anInt687 = i;
					}
				}
			} else if (RT4GL.vertexBufferAsObject) {
				VertexBuffer vertexBuffer = new VertexBuffer();
				ByteBuffer bytebuffer = ByteBuffer.wrap(aClass14_Sub10_5011.payload, 0,
						aClass14_Sub10_5011.position);
				vertexBuffer._setArrayData(bytebuffer);
				if (bool_494_) {
					aClass41_5028.upToDate = true;
					aClass41_5028.aByteBuffer684 = null;
					aClass41_5028.aClass29_692 = vertexBuffer;
					aClass41_5028.anInt687 = i;
				}
				if (bool_495_) {
					aClass41_5030.upToDate = true;
					aClass41_5030.aByteBuffer684 = null;
					aClass41_5030.aClass29_692 = vertexBuffer;
					aClass41_5030.anInt687 = i;
				}
				if (bool_496_) {
					aClass41_5018.upToDate = true;
					aClass41_5018.aByteBuffer684 = null;
					aClass41_5018.aClass29_692 = vertexBuffer;
					aClass41_5018.anInt687 = i;
				}
				if (bool_497_) {
					aClass41_5029.upToDate = true;
					aClass41_5029.aByteBuffer684 = null;
					aClass41_5029.aClass29_692 = vertexBuffer;
					aClass41_5029.anInt687 = i;
				}
			} else {
				ByteBuffer bytebuffer = ByteBuffer.allocateDirect(aClass14_Sub10_5011.position);
				bytebuffer.put(aClass14_Sub10_5011.payload, 0, aClass14_Sub10_5011.position);
				bytebuffer.flip();
				if (bool_494_) {
					aClass41_5028.upToDate = true;
					aClass41_5028.aByteBuffer684 = bytebuffer;
					aClass41_5028.aClass29_692 = null;
					aClass41_5028.anInt687 = i;
				}
				if (bool_495_) {
					aClass41_5030.upToDate = true;
					aClass41_5030.aByteBuffer684 = bytebuffer;
					aClass41_5028.aClass29_692 = null;
					aClass41_5030.anInt687 = i;
				}
				if (bool_496_) {
					aClass41_5018.upToDate = true;
					aClass41_5018.aByteBuffer684 = bytebuffer;
					aClass41_5018.aClass29_692 = null;
					aClass41_5018.anInt687 = i;
				}
				if (bool_497_) {
					aClass41_5029.upToDate = true;
					aClass41_5029.aByteBuffer684 = bytebuffer;
					aClass41_5029.aClass29_692 = null;
					aClass41_5029.anInt687 = i;
				}
			}
		}
	}

	public void method1906(short i, short i_544_) {
		for (int i_545_ = 0; i_545_ < anInt5014; i_545_++) {
			if (aShortArray5037[i_545_] == i)
				aShortArray5037[i_545_] = i_544_;
		}
		int i_546_ = 0;
		int i_547_ = 0;
		if (i != -1) {
			i_546_ = Class3.anInterface3_117.method14(i & 0xffff, 82);
			i_547_ = Class3.anInterface3_117.method9(i & 0xffff);
		}
		int i_548_ = 0;
		int i_549_ = 0;
		if (i_544_ != -1) {
			i_548_ = Class3.anInterface3_117.method14(i_544_ & 0xffff, 70);
			i_549_ = Class3.anInterface3_117.method9(i_544_ & 0xffff);
		}
		if (i_546_ != i_548_ || i_547_ != i_549_)
			aClass41_5030.upToDate = false;
	}

	public Class133_Sub7 method1907(boolean bool, boolean bool_550_, ModelHD modelhd_551_, ModelHD modelhd_552_) {
		modelhd_551_.anInt5033 = anInt5033;
		modelhd_551_.anInt5040 = anInt5040;
		modelhd_551_.anInt5014 = anInt5014;
		modelhd_551_.aShort5032 = aShort5032;
		modelhd_551_.aShort5024 = aShort5024;
		modelhd_551_.aByte5026 = (byte) (0x1 | (bool ? 0 : 2) | (bool_550_ ? 0 : 4));
		if (modelhd_551_.vertexX == null || modelhd_551_.vertexX.length < anInt5033) {
			modelhd_551_.vertexX = new int[anInt5033 + 100];
			modelhd_551_.vertexY = new int[anInt5033 + 100];
			modelhd_551_.vertexZ = new int[anInt5033 + 100];
		}
		for (int i = 0; i < anInt5033; i++) {
			modelhd_551_.vertexX[i] = vertexX[i];
			modelhd_551_.vertexY[i] = vertexY[i];
			modelhd_551_.vertexZ[i] = vertexZ[i];
		}
		if (modelhd_551_.aClass41_5028 == null)
			modelhd_551_.aClass41_5028 = new VertexBufferPointer();
		modelhd_551_.aClass41_5028.upToDate = false;
		if (modelhd_551_.aClass50_5013 == null)
			modelhd_551_.aClass50_5013 = new Class50();
		modelhd_551_.aClass50_5013.aBoolean820 = false;
		if (bool) {
			modelhd_551_.faceAlphas = faceAlphas;
			modelhd_551_.aClass41_5030 = aClass41_5030;
		} else {
			if (modelhd_552_.faceAlphas == null || modelhd_552_.faceAlphas.length < anInt5014)
				modelhd_552_.faceAlphas = new byte[anInt5014 + 100];
			modelhd_551_.faceAlphas = modelhd_552_.faceAlphas;
			for (int i = 0; i < anInt5014; i++)
				modelhd_551_.faceAlphas[i] = faceAlphas[i];
			if (modelhd_552_.aClass41_5030 == null)
				modelhd_552_.aClass41_5030 = new VertexBufferPointer();
			modelhd_551_.aClass41_5030 = modelhd_552_.aClass41_5030;
			modelhd_551_.aClass41_5030.upToDate = false;
		}
		if (bool_550_) {
			modelhd_551_.aShortArray5041 = aShortArray5041;
			modelhd_551_.aShortArray5019 = aShortArray5019;
			modelhd_551_.aShortArray5042 = aShortArray5042;
			modelhd_551_.aShortArray5017 = aShortArray5017;
			modelhd_551_.aClass41_5018 = aClass41_5018;
		} else {
			if (modelhd_552_.aShortArray5041 == null || modelhd_552_.aShortArray5041.length < anInt5040) {
				modelhd_552_.aShortArray5041 = new short[anInt5040 + 100];
				modelhd_552_.aShortArray5019 = new short[anInt5040 + 100];
				modelhd_552_.aShortArray5042 = new short[anInt5040 + 100];
				modelhd_552_.aShortArray5017 = new short[anInt5040 + 100];
			}
			modelhd_551_.aShortArray5041 = modelhd_552_.aShortArray5041;
			modelhd_551_.aShortArray5019 = modelhd_552_.aShortArray5019;
			modelhd_551_.aShortArray5042 = modelhd_552_.aShortArray5042;
			modelhd_551_.aShortArray5017 = modelhd_552_.aShortArray5017;
			for (int i = 0; i < anInt5040; i++) {
				modelhd_551_.aShortArray5041[i] = aShortArray5041[i];
				modelhd_551_.aShortArray5019[i] = aShortArray5019[i];
				modelhd_551_.aShortArray5042[i] = aShortArray5042[i];
				modelhd_551_.aShortArray5017[i] = aShortArray5017[i];
			}
			if (RT4.useLighting) {
				if (modelhd_552_.aClass41_5018 == null)
					modelhd_552_.aClass41_5018 = new VertexBufferPointer();
				modelhd_551_.aClass41_5018 = modelhd_552_.aClass41_5018;
				modelhd_551_.aClass41_5018.upToDate = false;
			} else
				modelhd_551_.aClass41_5018 = null;
		}
		modelhd_551_.aFloatArray5047 = aFloatArray5047;
		modelhd_551_.aFloatArray5012 = aFloatArray5012;
		modelhd_551_.anIntArray5034 = anIntArray5034;
		modelhd_551_.vertexGroups = vertexGroups;
		modelhd_551_.aShortArray5045 = aShortArray5045;
		modelhd_551_.aShortArray5021 = aShortArray5021;
		modelhd_551_.aShortArray5025 = aShortArray5025;
		modelhd_551_.aShortArray5038 = aShortArray5038;
		modelhd_551_.aShortArray5037 = aShortArray5037;
		modelhd_551_.aByteArray5016 = aByteArray5016;
		modelhd_551_.anIntArrayArray5015 = anIntArrayArray5015;
		modelhd_551_.aClass41_5029 = aClass41_5029;
		modelhd_551_.aClass41_5046 = aClass41_5046;
		modelhd_551_.anIntArray5035 = anIntArray5035;
		modelhd_551_.aShortArray5036 = aShortArray5036;
		modelhd_551_.anIntArray5031 = anIntArray5031;
		modelhd_551_.aBoolean3687 = aBoolean3687;
		return modelhd_551_;
	}

	public int method1910() {
		return aShort5024;
	}

	public void method1912() {
		for (int i = 0; i < anInt5033; i++)
			vertexZ[i] = -vertexZ[i];
		if (aShortArray5042 != null) {
			for (int i = 0; i < anInt5040; i++)
				aShortArray5042[i] = (short) -aShortArray5042[i];
		}
		for (int i = 0; i < anInt5014; i++) {
			short i_553_ = aShortArray5021[i];
			aShortArray5021[i] = aShortArray5038[i];
			aShortArray5038[i] = i_553_;
		}
		aClass50_5013.aBoolean820 = false;
		aClass41_5028.upToDate = false;
		if (aClass41_5018 != null)
			aClass41_5018.upToDate = false;
		aClass41_5046.upToDate = false;
	}

	public void method1913() {
		if (anIntArray5034 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_554_ = 0; i_554_ < anInt5033; i_554_++) {
				int i_555_ = anIntArray5034[i_554_] & 0xff;
				is[i_555_]++;
				if (i_555_ > i)
					i = i_555_;
			}
			vertexGroups = new int[i + 1][];
			for (int i_556_ = 0; i_556_ <= i; i_556_++) {
				vertexGroups[i_556_] = new int[is[i_556_]];
				is[i_556_] = 0;
			}
			for (int i_557_ = 0; i_557_ < anInt5033; i_557_++) {
				int i_558_ = anIntArray5034[i_557_] & 0xff;
				vertexGroups[i_558_][is[i_558_]++] = i_557_;
			}
			anIntArray5034 = null;
		}
		if (aByteArray5016 != null) {
			int[] is = new int[256];
			int i = 0;
			for (int i_559_ = 0; i_559_ < anInt5014; i_559_++) {
				int i_560_ = aByteArray5016[i_559_] & 0xff;
				is[i_560_]++;
				if (i_560_ > i)
					i = i_560_;
			}
			anIntArrayArray5015 = new int[i + 1][];
			for (int i_561_ = 0; i_561_ <= i; i_561_++) {
				anIntArrayArray5015[i_561_] = new int[is[i_561_]];
				is[i_561_] = 0;
			}
			for (int i_562_ = 0; i_562_ < anInt5014; i_562_++) {
				int i_563_ = aByteArray5016[i_562_] & 0xff;
				anIntArrayArray5015[i_563_][is[i_563_]++] = i_562_;
			}
			aByteArray5016 = null;
		}
	}

	public void method1915(int i) {
		if (aShortArray5041 == null)
			method1874(i);
		else {
			int i_564_ = Class3.sin[i];
			int i_565_ = Class3.cos[i];
			for (int i_566_ = 0; i_566_ < anInt5033; i_566_++) {
				int i_567_ = (vertexZ[i_566_] * i_564_ + vertexX[i_566_] * i_565_ >> 16);
				vertexZ[i_566_] = (vertexZ[i_566_] * i_565_ - vertexX[i_566_] * i_564_ >> 16);
				vertexX[i_566_] = i_567_;
			}
			for (int i_568_ = 0; i_568_ < anInt5040; i_568_++) {
				int i_569_ = ((aShortArray5042[i_568_] * i_564_ + aShortArray5041[i_568_] * i_565_) >> 16);
				aShortArray5042[i_568_] = (short) ((aShortArray5042[i_568_] * i_565_
						- aShortArray5041[i_568_] * i_564_) >> 16);
				aShortArray5041[i_568_] = (short) i_569_;
			}
			aClass50_5013.aBoolean820 = false;
			aClass41_5028.upToDate = false;
			if (aClass41_5018 != null)
				aClass41_5018.upToDate = false;
		}
	}

	public void method1918() {
		if (aShortArray5041 == null)
			method1871();
		else {
			for (int i = 0; i < anInt5033; i++) {
				int i_570_ = vertexX[i];
				vertexX[i] = vertexZ[i];
				vertexZ[i] = -i_570_;
			}
			for (int i = 0; i < anInt5040; i++) {
				int i_571_ = aShortArray5041[i];
				aShortArray5041[i] = aShortArray5042[i];
				aShortArray5042[i] = (short) -i_571_;
			}
			aClass50_5013.aBoolean820 = false;
			aClass41_5028.upToDate = false;
			if (aClass41_5018 != null)
				aClass41_5018.upToDate = false;
		}
	}

	public void method1919(short i, short i_572_) {
		for (int i_573_ = 0; i_573_ < anInt5014; i_573_++) {
			if (aShortArray5045[i_573_] == i)
				aShortArray5045[i_573_] = i_572_;
		}
		aClass41_5030.upToDate = false;
	}

	public boolean method1920(int i, int i_574_, int i_575_, int i_576_, int i_577_, int i_578_, int i_579_,
			int i_580_) {
		if (i_574_ < i_575_ && i_574_ < i_576_ && i_574_ < i_577_)
			return false;
		if (i_574_ > i_575_ && i_574_ > i_576_ && i_574_ > i_577_)
			return false;
		if (i < i_578_ && i < i_579_ && i < i_580_)
			return false;
		if (i > i_578_ && i > i_579_ && i > i_580_)
			return false;
		return true;
	}

	public void transform(int i, int[] is, int i_581_, int i_582_, int i_583_, boolean bool) {
		int i_584_ = is.length;
		if (i == 0) {
			i_581_ <<= 4;
			i_582_ <<= 4;
			i_583_ <<= 4;
			int i_585_ = 0;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;
			for (int i_586_ = 0; i_586_ < i_584_; i_586_++) {
				int i_587_ = is[i_586_];
				if (i_587_ < vertexGroups.length) {
					int[] is_588_ = vertexGroups[i_587_];
					for (int i_589_ = 0; i_589_ < is_588_.length; i_589_++) {
						int i_590_ = is_588_[i_589_];
						centroidX += vertexX[i_590_];
						centroidY += vertexY[i_590_];
						centroidZ += vertexZ[i_590_];
						i_585_++;
					}
				}
			}
			if (i_585_ > 0) {
				centroidX = centroidX / i_585_ + i_581_;
				centroidY = centroidY / i_585_ + i_582_;
				centroidZ = centroidZ / i_585_ + i_583_;
			} else {
				centroidX = i_581_;
				centroidY = i_582_;
				centroidZ = i_583_;
			}
		} else if (i == 1) {
			i_581_ <<= 4;
			i_582_ <<= 4;
			i_583_ <<= 4;
			for (int i_591_ = 0; i_591_ < i_584_; i_591_++) {
				int i_592_ = is[i_591_];
				if (i_592_ < vertexGroups.length) {
					int[] is_593_ = vertexGroups[i_592_];
					for (int i_594_ = 0; i_594_ < is_593_.length; i_594_++) {
						int i_595_ = is_593_[i_594_];
						vertexX[i_595_] += i_581_;
						vertexY[i_595_] += i_582_;
						vertexZ[i_595_] += i_583_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_596_ = 0; i_596_ < i_584_; i_596_++) {
				int i_597_ = is[i_596_];
				if (i_597_ < vertexGroups.length) {
					int[] is_598_ = vertexGroups[i_597_];
					for (int i_599_ = 0; i_599_ < is_598_.length; i_599_++) {
						int i_600_ = is_598_[i_599_];
						vertexX[i_600_] -= centroidX;
						vertexY[i_600_] -= centroidY;
						vertexZ[i_600_] -= centroidZ;
						if (i_583_ != 0) {
							int i_601_ = Class3.sin[i_583_];
							int i_602_ = Class3.cos[i_583_];
							int i_603_ = ((vertexY[i_600_] * i_601_ + vertexX[i_600_] * i_602_ + 32767) >> 16);
							vertexY[i_600_] = (vertexY[i_600_] * i_602_ - vertexX[i_600_] * i_601_ + 32767) >> 16;
							vertexX[i_600_] = i_603_;
						}
						if (i_581_ != 0) {
							int i_604_ = Class3.sin[i_581_];
							int i_605_ = Class3.cos[i_581_];
							int i_606_ = ((vertexY[i_600_] * i_605_ - vertexZ[i_600_] * i_604_ + 32767) >> 16);
							vertexZ[i_600_] = (vertexY[i_600_] * i_604_ + vertexZ[i_600_] * i_605_ + 32767) >> 16;
							vertexY[i_600_] = i_606_;
						}
						if (i_582_ != 0) {
							int i_607_ = Class3.sin[i_582_];
							int i_608_ = Class3.cos[i_582_];
							int i_609_ = ((vertexZ[i_600_] * i_607_ + vertexX[i_600_] * i_608_ + 32767) >> 16);
							vertexZ[i_600_] = (vertexZ[i_600_] * i_608_ - vertexX[i_600_] * i_607_ + 32767) >> 16;
							vertexX[i_600_] = i_609_;
						}
						vertexX[i_600_] += centroidX;
						vertexY[i_600_] += centroidY;
						vertexZ[i_600_] += centroidZ;
					}
				}
			}
			if (bool && aShortArray5041 != null) {
				for (int i_610_ = 0; i_610_ < i_584_; i_610_++) {
					int i_611_ = is[i_610_];
					if (i_611_ < vertexGroups.length) {
						int[] is_612_ = vertexGroups[i_611_];
						for (int i_613_ = 0; i_613_ < is_612_.length; i_613_++) {
							int i_614_ = is_612_[i_613_];
							int i_615_ = anIntArray5031[i_614_];
							int i_616_ = anIntArray5031[i_614_ + 1];
							for (int i_617_ = i_615_; i_617_ < i_616_; i_617_++) {
								int i_618_ = aShortArray5036[i_617_] - 1;
								if (i_618_ == -1)
									break;
								if (i_583_ != 0) {
									int i_619_ = Class3.sin[i_583_];
									int i_620_ = Class3.cos[i_583_];
									int i_621_ = ((aShortArray5019[i_618_] * i_619_ + aShortArray5041[i_618_] * i_620_
											+ 32767) >> 16);
									aShortArray5019[i_618_] = (short) (((aShortArray5019[i_618_] * i_620_)
											- (aShortArray5041[i_618_] * i_619_) + 32767) >> 16);
									aShortArray5041[i_618_] = (short) i_621_;
								}
								if (i_581_ != 0) {
									int i_622_ = Class3.sin[i_581_];
									int i_623_ = Class3.cos[i_581_];
									int i_624_ = ((aShortArray5019[i_618_] * i_623_ - aShortArray5042[i_618_] * i_622_
											+ 32767) >> 16);
									aShortArray5042[i_618_] = (short) (((aShortArray5019[i_618_] * i_622_)
											+ (aShortArray5042[i_618_] * i_623_) + 32767) >> 16);
									aShortArray5019[i_618_] = (short) i_624_;
								}
								if (i_582_ != 0) {
									int i_625_ = Class3.sin[i_582_];
									int i_626_ = Class3.cos[i_582_];
									int i_627_ = ((aShortArray5042[i_618_] * i_625_ + aShortArray5041[i_618_] * i_626_
											+ 32767) >> 16);
									aShortArray5042[i_618_] = (short) (((aShortArray5042[i_618_] * i_626_)
											- (aShortArray5041[i_618_] * i_625_) + 32767) >> 16);
									aShortArray5041[i_618_] = (short) i_627_;
								}
							}
						}
					}
				}
				if (aClass41_5018 != null)
					aClass41_5018.upToDate = false;
			}
		} else if (i == 3) {
			for (int i_628_ = 0; i_628_ < i_584_; i_628_++) {
				int i_629_ = is[i_628_];
				if (i_629_ < vertexGroups.length) {
					int[] is_630_ = vertexGroups[i_629_];
					for (int i_631_ = 0; i_631_ < is_630_.length; i_631_++) {
						int i_632_ = is_630_[i_631_];
						vertexX[i_632_] -= centroidX;
						vertexY[i_632_] -= centroidY;
						vertexZ[i_632_] -= centroidZ;
						vertexX[i_632_] = vertexX[i_632_] * i_581_ >> 7;
						vertexY[i_632_] = vertexY[i_632_] * i_582_ >> 7;
						vertexZ[i_632_] = vertexZ[i_632_] * i_583_ >> 7;
						vertexX[i_632_] += centroidX;
						vertexY[i_632_] += centroidY;
						vertexZ[i_632_] += centroidZ;
					}
				}
			}
		} else if (i == 5 && anIntArrayArray5015 != null && faceAlphas != null) {
			for (int i_633_ = 0; i_633_ < i_584_; i_633_++) {
				int i_634_ = is[i_633_];
				if (i_634_ < anIntArrayArray5015.length) {
					int[] is_635_ = anIntArrayArray5015[i_634_];
					for (int i_636_ = 0; i_636_ < is_635_.length; i_636_++) {
						int i_637_ = is_635_[i_636_];
						int i_638_ = (faceAlphas[i_637_] & 0xff) + i_581_ * 8;
						if (i_638_ < 0)
							i_638_ = 0;
						else if (i_638_ > 255)
							i_638_ = 255;
						faceAlphas[i_637_] = (byte) i_638_;
					}
					if (is_635_.length > 0)
						aClass41_5030.upToDate = false;
				}
			}
		}
	}
}
