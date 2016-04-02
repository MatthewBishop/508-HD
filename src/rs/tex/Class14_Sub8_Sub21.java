/* Class14_Sub8_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.Class10;

import rs.Class102;
import rs.Class104;
import rs.Class112;
import rs.Class118;
import rs.Class124;
import rs.Class125;
import rs.Class133_Sub1_Sub1;
import rs.Class142;
import rs.Class149;
import rs.Class14_Sub11;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub21;
import rs.Class14_Sub2_Sub8;
import rs.Class14_Sub3;
import rs.Class14_Sub30;
import rs.Class14_Sub4;
import rs.Class14_Sub6;
import rs.Class14_Sub9_Sub3;
import rs.Class150;
import rs.Class153;
import rs.Class17;
import rs.Class21;
import rs.Class3;
import rs.Class37;
import rs.Class4;
import rs.Class40;
import rs.Class48;
import rs.Class51;
import rs.Class53;
import rs.Class56;
import rs.Class68;
import rs.Class71;
import rs.Class7_Sub1;
import rs.Class7_Sub3_Sub1;
import rs.Class83;
import rs.Class94;
import rs.Class98;
import rs.Class99_Sub2;
import rs.RuntimeException_Sub1;
import rs.Static2;
import rs.StaticGL;

public class Class14_Sub8_Sub21 extends Class14_Sub8 {
	public static Class124 aClass124_4434 = Class14_Sub2_Sub2.method263(1178, "b12_full");
	public static Class124 aClass124_4442;
	public static Class124 aClass124_4445;
	public static Class94 aClass94_4446;
	public static int anInt4436;
	public static int anInt4439 = 2301979;
	public static int[] anIntArray4435;
	public static int[] anIntArray4444;
	static {
		anInt4436 = 0;
		aClass124_4442 = Class14_Sub2_Sub2.method263(1178, "null");
		aClass124_4445 = Class14_Sub2_Sub2.method263(1178, "loginscreen");
		anIntArray4444 = new int[25];
	}
	public static void method587(long[] ls, int i, int[] is, boolean bool, int i_0_) {
		if (i > i_0_) {
			int i_1_ = i_0_;
			int i_2_ = (i + i_0_) / 2;
			long l = ls[i_2_];
			ls[i_2_] = ls[i];
			ls[i] = l;
			int i_3_ = is[i_2_];
			is[i_2_] = is[i];
			is[i] = i_3_;
			for (int i_4_ = i_0_; i_4_ < i; i_4_++) {
				if (ls[i_4_] < (long) (i_4_ & 0x1) + l) {
					long l_5_ = ls[i_4_];
					ls[i_4_] = ls[i_1_];
					ls[i_1_] = l_5_;
					int i_6_ = is[i_4_];
					is[i_4_] = is[i_1_];
					is[i_1_++] = i_6_;
				}
			}
			ls[i] = ls[i_1_];
			ls[i_1_] = l;
			is[i] = is[i_1_];
			is[i_1_] = i_3_;
			method587(ls, i_1_ - 1, is, false, i_0_);
			method587(ls, i, is, false, i_1_ + 1);
		}
		if (bool)
			method587(null, 67, null, true, 8);
	}
	public static void method588(int i, int i_7_, int i_8_, int i_9_, int i_10_, byte[][][] is, int[] is_11_,
			int[] is_12_, int[] is_13_, int[] is_14_, int[] is_15_, int i_16_, byte i_17_, int i_18_, int i_19_) {
		if (i < 0)
			i = 0;
		else if (i >= Class99_Sub2.anInt3338 * 128)
			i = Class99_Sub2.anInt3338 * 128 - 1;
		if (i_8_ < 0)
			i_8_ = 0;
		else if (i_8_ >= Class14_Sub8_Sub15.anInt4337 * 128)
			i_8_ = Class14_Sub8_Sub15.anInt4337 * 128 - 1;
		Class150.anInt2420 = Class3.sin[i_9_];
		Class7_Sub3_Sub1.anInt3718 = Class3.cos[i_9_];
		Static.anInt2719 = Class3.sin[i_10_];
		Class37.anInt643 = Class3.cos[i_10_];
		Class4.anInt125 = i;
		Static2.anInt2741 = i_7_;
		Class14_Sub2_Sub8.anInt3853 = i_8_;
		Class71.cameraTileX = i / 128;
		Class102.cameraTileZ = i_8_ / 128;
		Class7_Sub1.anInt2659 = Class71.cameraTileX - Static.anInt1108;
		if (Class7_Sub1.anInt2659 < 0)
			Class7_Sub1.anInt2659 = 0;
		Class14_Sub9_Sub3.anInt4849 = Class102.cameraTileZ - Static.anInt1108;
		if (Class14_Sub9_Sub3.anInt4849 < 0)
			Class14_Sub9_Sub3.anInt4849 = 0;
		Class14_Sub8_Sub37.anInt4722 = Class71.cameraTileX + Static.anInt1108;
		if (Class14_Sub8_Sub37.anInt4722 > Class99_Sub2.anInt3338)
			Class14_Sub8_Sub37.anInt4722 = Class99_Sub2.anInt3338;
		Class14_Sub8_Sub26.anInt4526 = Class102.cameraTileZ + Static.anInt1108;
		if (Class14_Sub8_Sub26.anInt4526 > Class14_Sub8_Sub15.anInt4337)
			Class14_Sub8_Sub26.anInt4526 = Class14_Sub8_Sub15.anInt4337;
		int i_20_ = 3584;
		for (int i_21_ = 0; i_21_ < Static.anInt1108 + Static.anInt1108 + 2; i_21_++) {
			for (int i_22_ = 0; i_22_ < Static.anInt1108 + Static.anInt1108 + 2; i_22_++) {
				int i_23_ = ((i_21_ - Static.anInt1108 << 7) - (Class4.anInt125 & 0x7f));
				int i_24_ = ((i_22_ - Static.anInt1108 << 7) - (Class14_Sub2_Sub8.anInt3853 & 0x7f));
				int i_25_ = Class71.cameraTileX - Static.anInt1108 + i_21_;
				int i_26_ = Class102.cameraTileZ - Static.anInt1108 + i_22_;
				if (i_25_ >= 0 && i_26_ >= 0 && i_25_ < Class99_Sub2.anInt3338
						&& i_26_ < Class14_Sub8_Sub15.anInt4337) {
					int i_27_;
					if (Class150.anIntArrayArrayArray2419 != null)
						i_27_ = (Class150.anIntArrayArrayArray2419[0][i_25_][i_26_]) - Static2.anInt2741 + 128;
					else
						i_27_ = (Class149.anIntArrayArrayArray2391[0][i_25_][i_26_]) - Static2.anInt2741 + 128;
					int i_28_ = (Class149.anIntArrayArrayArray2391[3][i_25_][i_26_] - Static2.anInt2741 - 1000);
					Class14_Sub8_Sub3.aBooleanArrayArray4138[i_21_][i_22_] = Class124.method1714(i_23_, i_28_, i_27_,
							i_24_, i_20_);
				} else
					Class14_Sub8_Sub3.aBooleanArrayArray4138[i_21_][i_22_] = false;
			}
		}
		for (int i_29_ = 0; i_29_ < Static.anInt1108 + Static.anInt1108 + 1; i_29_++) {
			for (int i_30_ = 0; i_30_ < Static.anInt1108 + Static.anInt1108 + 1; i_30_++)
				Class53.visibilityMap[i_29_][i_30_] = (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_29_][i_30_]
						|| (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_29_ + 1][i_30_])
						|| (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_29_][i_30_ + 1])
						|| (Class14_Sub8_Sub3.aBooleanArrayArray4138[i_29_ + 1][i_30_ + 1]));
		}
		Class21.anIntArray437 = is_11_;
		Class98.anIntArray1660 = is_12_;
		Static2.anIntArray1790 = is_13_;
		Class142.anIntArray2284 = is_14_;
		Class104.anIntArray1737 = is_15_;
		Scenegraph.method1503();
		if (Class40.aClass14_Sub29ArrayArrayArray674 != null) {
			Class14_Sub8_Sub28.method627(true);
			StaticGL.method67(i, i_7_, i_8_, null, 0, (byte) 0, i_18_, i_19_);
			Class14_Sub30.aBoolean3269 = false;
			RT4.method1778(0, 0);
			AthmosphericEffects.setFogColour(null);
			Class10.method188();
			Class14_Sub8_Sub28.method627(false);
		}
		StaticGL.method67(i, i_7_, i_8_, is, i_16_, i_17_, i_18_, i_19_);
	}
	public static void method590(boolean bool) {
		aClass94_4446 = null;
		aClass124_4445 = null;
		aClass124_4434 = null;
		if (!bool)
			anIntArray4435 = null;
		anIntArray4435 = null;
		aClass124_4442 = null;
		anIntArray4444 = null;
	}
	public static void method591(int i, Class133_Sub1_Sub1 class133_sub1_sub1, int i_31_, int i_32_, int i_33_) {
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748 != class133_sub1_sub1 && Class14_Sub8_Sub38.anInt4729 < 400) {
			Class124 class124;
			if (class133_sub1_sub1.anInt4928 == 0)
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class133_sub1_sub1.method1808(true),
						Class153.method2047(1, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937),
								class133_sub1_sub1.anInt4937),
						Class14_Sub8_Sub17.aClass124_4360, Class48.aClass124_797,
						Class83.method1407(52, class133_sub1_sub1.anInt4937), Class14_Sub8_Sub27.aClass124_4552 }),
						(byte) -95));
			else
				class124 = (Class14_Sub8_Sub7.method515((new Class124[] { class133_sub1_sub1.method1808(true),
						Class14_Sub8_Sub17.aClass124_4360, Class14_Sub2_Sub21.aClass124_4083,
						Class83.method1407(90, class133_sub1_sub1.anInt4928), Class14_Sub8_Sub27.aClass124_4552 }),
						(byte) -98));
			if (i < 73)
				method587(null, 36, null, false, 106);
			if (Class51.anInt831 != 1) {
				if (!Class14_Sub4.aBoolean2784) {
					for (int i_34_ = 7; i_34_ >= 0; i_34_--) {
						if (Class56.aClass124Array919[i_34_] != null) {
							short i_35_ = 0;
							if (Static2.anInt3749 == 0
									&& (Class56.aClass124Array919[i_34_].method1717(40, Class118.aClass124_1973))) {
								if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4937) < class133_sub1_sub1.anInt4937)
									i_35_ = (short) 2000;
								if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916) != 0
										&& class133_sub1_sub1.anInt4916 != 0) {
									if (class133_sub1_sub1.anInt4916 != (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt4916))
										i_35_ = (short) 0;
									else
										i_35_ = (short) 2000;
								}
							} else if (Class14_Sub8_Sub11.aBooleanArray4271[i_34_])
								i_35_ = (short) 2000;
							boolean bool = false;
							short i_36_ = Static2.aShortArray357[i_34_];
							i_36_ += i_35_;
							Class14_Sub11
									.method853(32, Class56.aClass124Array919[i_34_], i_31_,
											(Class14_Sub8_Sub7.method515(
													new Class124[] { Class17.aClass124_398, class124 }, (byte) -127)),
									i_36_, (long) i_33_, i_32_);
						}
					}
				} else if ((Static.anInt101 & 0x8) == 8)
					Class14_Sub11
							.method853(32, Class125.aClass124_2082, i_31_,
									Class14_Sub8_Sub7.method515((new Class124[] { Class17.aClass124_408,
											Class68.aClass124_1064, class124 }), (byte) -16),
									(short) 16, (long) i_33_, i_32_);
			} else
				Class14_Sub11
						.method853(32, Class40.aClass124_665, i_31_,
								(Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub6.aClass124_2809,
										Class68.aClass124_1064, class124 }), (byte) -97)),
								(short) 49, (long) i_33_, i_32_);
			for (int i_37_ = 0; i_37_ < Class14_Sub8_Sub38.anInt4729; i_37_++) {
				if (Class14_Sub29.aShortArray3262[i_37_] == 8) {
					RuntimeException_Sub1.aClass124Array2459[i_37_] = Class14_Sub8_Sub7
							.method515((new Class124[] { Class17.aClass124_398, class124 }), (byte) -124);
					break;
				}
			}
		}
	}

	public int anInt4438 = 0;

	public int[] anIntArray4431;

	public int[] anIntArray4447;

	public int[][] anIntArrayArray4441;

	public short[] aShortArray4448 = new short[257];

	public Class14_Sub8_Sub21() {
		super(1, true);
	}

	public void method472() {
		if (anIntArrayArray4441 == null)
			anIntArrayArray4441 = new int[][] { new int[2], { 4096, 4096 } };
		if (2 > anIntArrayArray4441.length)
			throw new RuntimeException("Curve operation requires at least two markers");
		if (anInt4438 == 2)
			method586(true);
		Class14_Sub2_Sub12.method321(256);
		method592((byte) 111);
	}

	public void method475(int i, int i_38_, Buffer class14_sub10) {
		if (i_38_ == 24777 && i == 0) {
			anInt4438 = class14_sub10.method798();
			anIntArrayArray4441 = new int[class14_sub10.method798()][2];
			for (int i_39_ = 0; anIntArrayArray4441.length > i_39_; i_39_++) {
				anIntArrayArray4441[i_39_][0] = class14_sub10.method784((byte) 113);
				anIntArrayArray4441[i_39_][1] = class14_sub10.method784((byte) 126);
			}
		}
	}

	public int[] method484(int i, byte i_40_) {
		if (i_40_ > -58)
			anInt4439 = 20;
		int[] is = aClass149_2851.method2014(i, (byte) 104);
		if (aClass149_2851.aBoolean2402) {
			int[] is_41_ = method483(0, (byte) -120, i);
			for (int i_42_ = 0; i_42_ < Class112.anInt1876; i_42_++) {
				int i_43_ = is_41_[i_42_] >> 4;
				if (i_43_ < 0)
					i_43_ = 0;
				if (i_43_ > 256)
					i_43_ = 256;
				is[i_42_] = aShortArray4448[i_43_];
			}
		}
		int[] is_44_ = is;
		return is_44_;
	}

	public void method586(boolean bool) {
		if (bool) {
			int[] is = anIntArrayArray4441[0];
			int[] is_45_ = anIntArrayArray4441[1];
			int[] is_46_ = anIntArrayArray4441[anIntArrayArray4441.length - 2];
			int[] is_47_ = anIntArrayArray4441[anIntArrayArray4441.length - 1];
			anIntArray4447 = new int[] { is_46_[0] - is_47_[0] + is_46_[0], -is_47_[1] + is_46_[1] + is_46_[1] };
			anIntArray4431 = new int[] { is[0] - (-is[0] + is_45_[0]), is[1] - is_45_[1] + is[1] };
		}
	}

	public int[] method589(int i, int i_48_) {
		if (i < 10)
			aClass124_4442 = null;
		if (i_48_ < 0) {
			int[] is = anIntArray4431;
			return is;
		}
		if (anIntArrayArray4441.length <= i_48_) {
			int[] is = anIntArray4447;
			return is;
		}
		int[] is = anIntArrayArray4441[i_48_];
		return is;
	}

	public void method592(byte i) {
		int i_49_ = anInt4438;
		while_101_: do {
			do {
				if (i_49_ != 2) {
					if (i_49_ != 1)
						break;
				} else {
					for (i_49_ = 0; i_49_ < 257; i_49_++) {
						int i_50_ = i_49_ << 36;
						int i_51_;
						for (i_51_ = 1; (anIntArrayArray4441.length - 1 > i_51_
								&& i_50_ >= anIntArrayArray4441[i_51_][0]); i_51_++) {
							/* empty */
						}
						int[] is = anIntArrayArray4441[i_51_ - 1];
						int[] is_52_ = anIntArrayArray4441[i_51_];
						int i_53_ = method589(114, i_51_ - 2)[1];
						int i_54_ = is[1];
						int i_55_ = is_52_[1];
						int i_56_ = method589(106, i_51_ + 1)[1];
						int i_57_ = (-is[0] + i_50_ << 44) / (is_52_[0] - is[0]);
						int i_58_ = i_57_ * i_57_ >> 12;
						int i_59_ = i_54_ - i_53_ + (i_56_ - i_55_);
						int i_60_ = -i_54_ + (i_53_ - i_59_);
						int i_61_ = i_55_ - i_53_;
						int i_62_ = i_58_ * (i_57_ * i_59_ >> 44) >> 44;
						int i_63_ = i_54_;
						int i_64_ = i_57_ * i_61_ >> 12;
						int i_65_ = i_60_ * i_58_ >> 12;
						int i_66_ = i_64_ + (i_62_ + i_65_ + i_63_);
						if (i_66_ <= -32768)
							i_66_ = -32767;
						if (i_66_ >= 32768)
							i_66_ = 32767;
						aShortArray4448[i_49_] = (short) i_66_;
					}
					break while_101_;
				}
				for (i_49_ = 0; i_49_ < 257; i_49_++) {
					int i_67_ = i_49_ << 4;
					int i_68_;
					for (i_68_ = 1; (i_68_ < anIntArrayArray4441.length - 1
							&& anIntArrayArray4441[i_68_][0] <= i_67_); i_68_++) {
						/* empty */
					}
					int[] is = anIntArrayArray4441[i_68_ - 1];
					int[] is_69_ = anIntArrayArray4441[i_68_];
					int i_70_ = (i_67_ - is[0] << 44) / (-is[0] + is_69_[0]);
					int i_71_ = (-Class99_Sub2.anIntArray3357[(i_70_ & 0x1fe4) >> 37] + 4096) >> 1;
					int i_72_ = -i_71_ + 4096;
					int i_73_ = is[1] * i_72_ + i_71_ * is_69_[1] >> 44;
					if (i_73_ <= -32768)
						i_73_ = -32767;
					if (i_73_ >= 32768)
						i_73_ = 32767;
					aShortArray4448[i_49_] = (short) i_73_;
				}
				break while_101_;
			} while (false);
			for (i_49_ = 0; i_49_ < 257; i_49_++) {
				int i_74_ = i_49_ << 36;
				int i_75_;
				for (i_75_ = 1; (anIntArrayArray4441.length - 1 > i_75_
						&& anIntArrayArray4441[i_75_][0] <= i_74_); i_75_++) {
					/* empty */
				}
				int[] is = anIntArrayArray4441[i_75_];
				int[] is_76_ = anIntArrayArray4441[i_75_ - 1];
				int i_77_ = (i_74_ - is_76_[0] << 44) / (is[0] - is_76_[0]);
				int i_78_ = 4096 - i_77_;
				int i_79_ = i_78_ * is_76_[1] + is[1] * i_77_ >> 44;
				if (i_79_ <= -32768)
					i_79_ = -32767;
				if (i_79_ >= 32768)
					i_79_ = 32767;
				aShortArray4448[i_49_] = (short) i_79_;
			}
		} while (false);
		i_49_ = 119 % ((i - 52) / 59);
	}
}
