/* Class16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class16 {
	public int anInt386;
	public int[][] anIntArrayArray387;
	public int[] anIntArray388;
	public int[] anIntArray389;
	public static int[] anIntArray390;
	public int[] anIntArray391;
	public int[] anIntArray392;
	public static boolean[] aBooleanArray393;
	public int[] anIntArray394;
	public static int[] anIntArray395 = { 256, 128, 86, 64 };
	public static float[] aFloatArray396 = { 1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F,
			1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 1.998856E-7F, 2.128753E-7F,
			2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F,
			3.5226967E-7F, 3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F,
			5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 7.041359E-7F, 7.4989464E-7F, 7.98627E-7F,
			8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F,
			1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F,
			2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F,
			3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 4.6555283E-6F,
			4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F,
			7.704048E-6F, 8.2047E-6F, 8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F,
			1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 1.6400005E-5F, 1.7465769E-5F,
			1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F,
			2.890265E-5F, 3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F,
			4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 5.7772202E-5F, 6.152657E-5F, 6.552491E-5F,
			6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F,
			1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F,
			1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F,
			2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 3.8197188E-4F,
			4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F,
			6.320936E-4F, 6.731706E-4F, 7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F,
			9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 0.0013455702F, 0.0014330129F,
			0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F,
			0.0023713743F, 0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F,
			0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 0.004740033F, 0.005048067F, 0.0053761187F,
			0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F,
			0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F,
			0.013823725F, 0.014722068F, 0.015678791F, 0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F,
			0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 0.031339627F,
			0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F,
			0.05523159F, 0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F,
			0.09139818F, 0.097337745F, 0.1036633F, 0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F,
			0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 0.20720787F, 0.22067343F, 0.23501402F,
			0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 0.3889052F,
			0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F,
			0.6853896F, 0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
	public static int[] anIntArray397;

	public static void method948() {
		anIntArray395 = null;
		aFloatArray396 = null;
		anIntArray390 = null;
		anIntArray397 = null;
		aBooleanArray393 = null;
	}

	public void method949(float[] fs, int i) {
		int i_0_ = anIntArray391.length;
		int i_1_ = anIntArray395[anInt386 - 1];
		aBooleanArray393[0] = aBooleanArray393[1] = true;
		for (int i_2_ = 2; i_2_ < i_0_; i_2_++) {
			int i_3_ = method954(anIntArray390, i_2_);
			int i_4_ = method951(anIntArray390, i_2_);
			int i_5_ = method955(anIntArray390[i_3_], anIntArray397[i_3_], anIntArray390[i_4_], anIntArray397[i_4_],
					anIntArray390[i_2_]);
			int i_6_ = anIntArray397[i_2_];
			int i_7_ = i_1_ - i_5_;
			int i_8_ = i_5_;
			int i_9_ = (i_7_ < i_8_ ? i_7_ : i_8_) << 1;
			if (i_6_ != 0) {
				aBooleanArray393[i_3_] = aBooleanArray393[i_4_] = true;
				aBooleanArray393[i_2_] = true;
				if (i_6_ >= i_9_)
					anIntArray397[i_2_] = (i_7_ > i_8_ ? i_6_ - i_8_ + i_5_ : i_5_ - i_6_ + i_7_ - 1);
				else
					anIntArray397[i_2_] = ((i_6_ & 0x1) != 0 ? i_5_ - (i_6_ + 1) / 2 : i_5_ + i_6_ / 2);
			} else {
				aBooleanArray393[i_2_] = false;
				anIntArray397[i_2_] = i_5_;
			}
		}
		method950(0, i_0_ - 1);
		int i_10_ = 0;
		int i_11_ = anIntArray397[0] * anInt386;
		for (int i_12_ = 1; i_12_ < i_0_; i_12_++) {
			if (aBooleanArray393[i_12_]) {
				int i_13_ = anIntArray390[i_12_];
				int i_14_ = anIntArray397[i_12_] * anInt386;
				method953(i_10_, i_11_, i_13_, i_14_, fs, i);
				if (i_13_ >= i)
					return;
				i_10_ = i_13_;
				i_11_ = i_14_;
			}
		}
		float f = aFloatArray396[i_11_];
		for (int i_15_ = i_10_; i_15_ < i; i_15_++)
			fs[i_15_] *= f;
	}

	public void method950(int i, int i_16_) {
		if (i < i_16_) {
			int i_17_ = i;
			int i_18_ = anIntArray390[i_17_];
			int i_19_ = anIntArray397[i_17_];
			boolean bool = aBooleanArray393[i_17_];
			for (int i_20_ = i + 1; i_20_ <= i_16_; i_20_++) {
				int i_21_ = anIntArray390[i_20_];
				if (i_21_ < i_18_) {
					anIntArray390[i_17_] = i_21_;
					anIntArray397[i_17_] = anIntArray397[i_20_];
					aBooleanArray393[i_17_] = aBooleanArray393[i_20_];
					i_17_++;
					anIntArray390[i_20_] = anIntArray390[i_17_];
					anIntArray397[i_20_] = anIntArray397[i_17_];
					aBooleanArray393[i_20_] = aBooleanArray393[i_17_];
				}
			}
			anIntArray390[i_17_] = i_18_;
			anIntArray397[i_17_] = i_19_;
			aBooleanArray393[i_17_] = bool;
			method950(i, i_17_ - 1);
			method950(i_17_ + 1, i_16_);
		}
	}

	public static int method951(int[] is, int i) {
		int i_22_ = is[i];
		int i_23_ = -1;
		int i_24_ = 2147483647;
		for (int i_25_ = 0; i_25_ < i; i_25_++) {
			int i_26_ = is[i_25_];
			if (i_26_ > i_22_ && i_26_ < i_24_) {
				i_23_ = i_25_;
				i_24_ = i_26_;
			}
		}
		return i_23_;
	}

	public Class16() {
		int i = Class14_Sub24.method906(16);
		if (i != 1)
			throw new RuntimeException();
		int i_27_ = Class14_Sub24.method906(5);
		int i_28_ = 0;
		anIntArray388 = new int[i_27_];
		for (int i_29_ = 0; i_29_ < i_27_; i_29_++) {
			int i_30_ = Class14_Sub24.method906(4);
			anIntArray388[i_29_] = i_30_;
			if (i_30_ >= i_28_)
				i_28_ = i_30_ + 1;
		}
		anIntArray389 = new int[i_28_];
		anIntArray392 = new int[i_28_];
		anIntArray394 = new int[i_28_];
		anIntArrayArray387 = new int[i_28_][];
		for (int i_31_ = 0; i_31_ < i_28_; i_31_++) {
			anIntArray389[i_31_] = Class14_Sub24.method906(3) + 1;
			int i_32_ = anIntArray392[i_31_] = Class14_Sub24.method906(2);
			if (i_32_ != 0)
				anIntArray394[i_31_] = Class14_Sub24.method906(8);
			i_32_ = 1 << i_32_;
			int[] is = new int[i_32_];
			anIntArrayArray387[i_31_] = is;
			for (int i_33_ = 0; i_33_ < i_32_; i_33_++)
				is[i_33_] = Class14_Sub24.method906(8) - 1;
		}
		anInt386 = Class14_Sub24.method906(2) + 1;
		int i_34_ = Class14_Sub24.method906(4);
		int i_35_ = 2;
		for (int i_36_ = 0; i_36_ < i_27_; i_36_++)
			i_35_ += anIntArray389[anIntArray388[i_36_]];
		anIntArray391 = new int[i_35_];
		anIntArray391[0] = 0;
		anIntArray391[1] = 1 << i_34_;
		i_35_ = 2;
		for (int i_37_ = 0; i_37_ < i_27_; i_37_++) {
			int i_38_ = anIntArray388[i_37_];
			for (int i_39_ = 0; i_39_ < anIntArray389[i_38_]; i_39_++)
				anIntArray391[i_35_++] = Class14_Sub24.method906(i_34_);
		}
		if (anIntArray390 == null || anIntArray390.length < i_35_) {
			anIntArray390 = new int[i_35_];
			anIntArray397 = new int[i_35_];
			aBooleanArray393 = new boolean[i_35_];
		}
	}

	public boolean method952() {
		boolean bool = Class14_Sub24.method908() != 0;
		if (!bool)
			return false;
		int i = anIntArray391.length;
		for (int i_40_ = 0; i_40_ < i; i_40_++)
			anIntArray390[i_40_] = anIntArray391[i_40_];
		int i_41_ = anIntArray395[anInt386 - 1];
		int i_42_ = Class48.method1192(i_41_ - 1, 25039);
		anIntArray397[0] = Class14_Sub24.method906(i_42_);
		anIntArray397[1] = Class14_Sub24.method906(i_42_);
		int i_43_ = 2;
		for (int i_44_ = 0; i_44_ < anIntArray388.length; i_44_++) {
			int i_45_ = anIntArray388[i_44_];
			int i_46_ = anIntArray389[i_45_];
			int i_47_ = anIntArray392[i_45_];
			int i_48_ = (1 << i_47_) - 1;
			int i_49_ = 0;
			if (i_47_ > 0)
				i_49_ = Class14_Sub24.aClass78Array3159[anIntArray394[i_45_]].method1371();
			for (int i_50_ = 0; i_50_ < i_46_; i_50_++) {
				int i_51_ = anIntArrayArray387[i_45_][i_49_ & i_48_];
				i_49_ >>>= i_47_;
				anIntArray397[i_43_++] = (i_51_ >= 0 ? Class14_Sub24.aClass78Array3159[i_51_].method1371() : 0);
			}
		}
		return true;
	}

	public void method953(int i, int i_52_, int i_53_, int i_54_, float[] fs, int i_55_) {
		int i_56_ = i_54_ - i_52_;
		int i_57_ = i_53_ - i;
		int i_58_ = i_56_ < 0 ? -i_56_ : i_56_;
		int i_59_ = i_56_ / i_57_;
		int i_60_ = i_52_;
		int i_61_ = 0;
		int i_62_ = i_56_ < 0 ? i_59_ - 1 : i_59_ + 1;
		i_58_ = i_58_ - (i_59_ < 0 ? -i_59_ : i_59_) * i_57_;
		fs[i] *= aFloatArray396[i_60_];
		if (i_53_ > i_55_)
			i_53_ = i_55_;
		for (int i_63_ = i + 1; i_63_ < i_53_; i_63_++) {
			i_61_ += i_58_;
			if (i_61_ >= i_57_) {
				i_61_ -= i_57_;
				i_60_ += i_62_;
			} else
				i_60_ += i_59_;
			fs[i_63_] *= aFloatArray396[i_60_];
		}
	}

	public static int method954(int[] is, int i) {
		int i_64_ = is[i];
		int i_65_ = -1;
		int i_66_ = -2147483648;
		for (int i_67_ = 0; i_67_ < i; i_67_++) {
			int i_68_ = is[i_67_];
			if (i_68_ < i_64_ && i_68_ > i_66_) {
				i_65_ = i_67_;
				i_66_ = i_68_;
			}
		}
		return i_65_;
	}

	public int method955(int i, int i_69_, int i_70_, int i_71_, int i_72_) {
		int i_73_ = i_71_ - i_69_;
		int i_74_ = i_70_ - i;
		int i_75_ = i_73_ < 0 ? -i_73_ : i_73_;
		int i_76_ = i_75_ * (i_72_ - i);
		int i_77_ = i_76_ / i_74_;
		return i_73_ < 0 ? i_69_ - i_77_ : i_69_ + i_77_;
	}
}
