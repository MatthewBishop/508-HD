/* Class14_Sub8_Sub18 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.AthmosphericEffects;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.Canvas_Sub1;
import rs.Class103;
import rs.Class112;
import rs.Class115;
import rs.Class123;
import rs.Class124;
import rs.Class125;
import rs.Class125_Sub2;
import rs.Class129;
import rs.Class133_Sub1;
import rs.Class133_Sub3;
import rs.Class133_Sub6;
import rs.Class138;
import rs.Class14_Sub13;
import rs.Class14_Sub15;
import rs.Class14_Sub21;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub3;
import rs.Class14_Sub6;
import rs.Class15;
import rs.Class150;
import rs.Class17;
import rs.Class22;
import rs.Class35;
import rs.Class49;
import rs.Class53;
import rs.Class60;
import rs.Class63;
import rs.Class69;
import rs.Class70;
import rs.Class71;
import rs.Class75;
import rs.Class76;
import rs.Class82;
import rs.Class9;
import rs.Class94;
import rs.RuntimeException_Sub1;
import rs.Static2;
import rs.client;

public class Class14_Sub8_Sub18 extends Class14_Sub8 {
	public static boolean aBoolean4383;
	public static Class124 aClass124_4393;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array4385;
	public static Class9 aClass9_4384;
	public static int anInt4382;
	public static int anInt4386 = 0;
	public static int anInt4394;
	public static int[][] anIntArrayArray4388;
	public static short[] aShortArray4392;
	static {
		aBoolean4383 = false;
		anIntArrayArray4388 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 },
				{ 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 },
				{ 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };
		anInt4382 = 0;
		aClass124_4393 = (Class14_Sub2_Sub2.method263(1178, "RuneScape is loading )2 please wait)3)3)3"));
		aShortArray4392 = new short[] { 960, 957, -21568, -21571, 22464 };
	}

	public static void method573(int i) {
		anIntArrayArray4388 = null;
		aClass9_4384 = null;
		aShortArray4392 = null;
		aClass124_4393 = null;
		if (i != 3)
			anInt4394 = -19;
		aClass14_Sub2_Sub19Array4385 = null;
	}

	public static void method574(int i, int i_0_, int i_1_, int i_2_, Class124 class124) {
		Class94 class94 = Class14_Sub6.method464(i_0_, i_2_, (byte) -19);
		if (class94 != null) {
			if (class94.anObjectArray1535 != null) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.anInt3108 = i;
				class14_sub21.aClass124_3101 = class124;
				class14_sub21.anObjectArray3115 = class94.anObjectArray1535;
				class14_sub21.aClass94_3116 = class94;
				Class133_Sub3.method1830(class14_sub21, -1976917689);
			}
			boolean bool = true;
			if (class94.anInt1498 > 0)
				bool = Class14_Sub15.method874((byte) 123, class94);
			if (i_1_ >= 118 && bool && Class14_Sub3.method448((byte) 124, i - 1, client.method46(class94))) {
				if (i == 1) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(233);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 93);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 92, i_0_);
				}
				if (i == 2) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(21);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 82);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 117, i_0_);
				}
				if (i == 3) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(169);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 71);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 85, i_0_);
				}
				if (i == 4) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(214);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 108);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 119, i_0_);
				}
				if (i == 5) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(173);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 89);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 124, i_0_);
				}
				if (i == 6) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(232);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 117);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 107, i_0_);
				}
				if (i == 7) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(133);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 116);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 96, i_0_);
				}
				if (i == 8) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(102);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 120);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 126, i_0_);
				}
				if (i == 9) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(226);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 104);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 103, i_0_);
				}
				if (i == 10) {
					Static.aClass14_Sub10_Sub1_891.writeOpcode(90);
					Static.aClass14_Sub10_Sub1_891.method803(i_2_, 114);
					Static.aClass14_Sub10_Sub1_891.method833((byte) 113, i_0_);
				}
			}
		}
	}

	public static int method576(int i, int i_3_, int i_4_, int i_5_, int i_6_) {
		if (Class60.aBoolean983) {
			i = 1000000;
			Class60.aBoolean983 = false;
		}
		Class71 class71 = Class150.aClass71ArrayArray2421[i_3_][i_4_];
		int i_7_ = class71.anInt1100;
		float f = class71.aFloat1095;
		if (!Class14_Sub8_Sub20.aBoolean4420)
			i_7_ = 0;
		float f_8_ = ((float) i_6_ * 0.1F + 0.7F) * class71.aFloat1089;
		int i_9_ = class71.anInt1088;
		float f_10_ = class71.aFloat1096;
		int i_11_ = class71.anInt1093;
		if (i_9_ != Class14_Sub8_Sub16.anInt4355 || f_8_ != Class138.aFloat2220 || f_10_ != Canvas_Sub1.aFloat41
				|| Class69.aFloat1066 != f || Class103.anInt1728 != i_11_ || i_7_ != Static2.anInt3947) {
			Class14_Sub3.aFloat2745 = Class35.aFloat600;
			Class75.anInt1151 = Class15.anInt376;
			Class14_Sub8_Sub16.anInt4355 = i_9_;
			Class22.anInt460 = Class133_Sub6.anInt3673;
			Class69.aFloat1066 = f;
			Class123.aFloat2067 = Class63.aFloat1007;
			Static2.anInt3947 = i_7_;
			RuntimeException_Sub1.anInt2463 = 0;
			Class138.aFloat2220 = f_8_;
			Class125_Sub2.aFloat3386 = Static.aFloat2709;
			Class14_Sub8_Sub30.anInt4597 = Class133_Sub1.anInt3490;
			Canvas_Sub1.aFloat41 = f_10_;
			Class103.anInt1728 = i_11_;
		}
		if (RuntimeException_Sub1.anInt2463 < 65536) {
			RuntimeException_Sub1.anInt2463 += i * 250;
			if (RuntimeException_Sub1.anInt2463 >= 65536)
				RuntimeException_Sub1.anInt2463 = 65536;
			int i_12_ = RuntimeException_Sub1.anInt2463 >> 40;
			int i_13_ = -RuntimeException_Sub1.anInt2463 + 65536 >> 8;
			Class133_Sub1.anInt3490 = (i_13_ * Class14_Sub8_Sub30.anInt4597
					+ i_12_ * Static2.anInt3947) >> 8;
			Class15.anInt376 = (((i_12_ * (Class14_Sub8_Sub16.anInt4355 & 0xff00)
					+ i_13_ * (Class75.anInt1151 & 0xff00)) & 0xff0000)
					+ ((i_12_ * (Class14_Sub8_Sub16.anInt4355 & 0xff00ff) + (Class75.anInt1151 & 0xff00ff) * i_13_)
							& ~0xff00ff)) >> 40;
			float f_14_ = (float) (65536 - RuntimeException_Sub1.anInt2463) / 65536.0F;
			float f_15_ = (float) RuntimeException_Sub1.anInt2463 / 65536.0F;
			Static.aFloat2709 = (f_14_ * Class125_Sub2.aFloat3386 + f_15_ * Class138.aFloat2220);
			Class35.aFloat600 = Class14_Sub3.aFloat2745 * f_14_ + Class69.aFloat1066 * f_15_;
			Class133_Sub6.anInt3673 = ((((Class22.anInt460 & 0xff00) * i_13_ + (Class103.anInt1728 & 0xff00) * i_12_)
					& 0xff0000)
					+ ((i_13_ * (Class22.anInt460 & 0xff00ff) + i_12_ * (Class103.anInt1728 & 0xff00ff))
							& ~0xff00ff)) >> 40;
			Class63.aFloat1007 = f_14_ * Class123.aFloat2067 + Canvas_Sub1.aFloat41 * f_15_;
		}
		AthmosphericEffects.setLightModel(Class15.anInt376, Static.aFloat2709, Class63.aFloat1007, Class35.aFloat600);
		AthmosphericEffects.setFogProperties(Class133_Sub6.anInt3673, Class133_Sub1.anInt3490);
		AthmosphericEffects.setSunPosition((float) Class82.anInt1330, (float) Class49.anInt815, (float) Static.anInt847);
		AthmosphericEffects.loadLightPositions();
		if (i_5_ != -3217) {
			int i_16_ = 2;
			return i_16_;
		}
		int i_17_ = Class133_Sub6.anInt3673;
		return i_17_;
	}

	public Class125[] aClass125Array4398;

	public Class14_Sub8_Sub18() {
		super(0, true);
	}

	public int[][] method474(int i, int i_18_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int i_19_ = Class112.anInt1876;
			int i_20_ = Class17.anInt407;
			int[][] is_21_ = new int[i_20_][i_19_];
			int[][][] is_22_ = aClass95_2838.method1485((byte) 52);
			method575(is_21_, true);
			for (int i_23_ = 0; i_23_ < Class17.anInt407; i_23_++) {
				int[] is_24_ = is_21_[i_23_];
				int[][] is_25_ = is_22_[i_23_];
				int[] is_26_ = is_25_[1];
				int[] is_27_ = is_25_[0];
				int[] is_28_ = is_25_[2];
				for (int i_29_ = 0; i_29_ < Class112.anInt1876; i_29_++) {
					int i_30_ = is_24_[i_29_];
					is_28_[i_29_] = Class14_Sub8_Sub26.method617(i_30_ << 4, 4080);
					is_26_[i_29_] = Class14_Sub8_Sub26.method617(4080, i_30_ >> 4);
					is_27_[i_29_] = Class14_Sub8_Sub26.method617(i_30_ >> 12, 4080);
				}
			}
		}
		if (i_18_ >= -4) {
			int[][] is_31_ = null;
			return is_31_;
		}
		int[][] is_32_ = is;
		return is_32_;
	}

	public void method475(int i, int i_33_, Buffer class14_sub10) {
		if (i != 0) {
			if (i == 1)
				aBoolean2862 = class14_sub10.method798() == 1;
		} else {
			aClass125Array4398 = new Class125[class14_sub10.method798()];
			int i_34_ = 0;
			while_87_: for (/**/; aClass125Array4398.length > i_34_; i_34_++) {
				int i_35_ = class14_sub10.method798();
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
							aClass125Array4398[i_34_] = Class129.method1762((byte) 112, class14_sub10);
							continue while_87_;
						}
						aClass125Array4398[i_34_] = Class14_Sub13.method860(class14_sub10, true);
						continue while_87_;
					} while (false);
					aClass125Array4398[i_34_] = Class14_Sub8_Sub9.method523(class14_sub10, (byte) -24);
					continue while_87_;
				} while (false);
				aClass125Array4398[i_34_] = Class53.method1214(class14_sub10, (byte) -123);
			}
		}
		if (i_33_ != 24777)
			method576(-68, 77, -73, 50, -52);
	}

	public int[] method484(int i, byte i_37_) {
		if (i_37_ > -58)
			method576(-98, -33, 18, -8, -107);
		int[] is = aClass149_2851.method2014(i, (byte) 127);
		if (aClass149_2851.aBoolean2402)
			method575(aClass149_2851.method2019(true), true);
		int[] is_38_ = is;
		return is_38_;
	}

	public void method575(int[][] is, boolean bool) {
		if (!bool)
			method576(49, 39, 41, 114, -26);
		int i = Class112.anInt1876;
		int i_39_ = Class17.anInt407;
		Class76.method1363(is, 0);
		Class70.method1314(0, 109, Class115.anInt1927, Static2.anInt4882, 0);
		if (aClass125Array4398 != null) {
			for (int i_40_ = 0; i_40_ < aClass125Array4398.length; i_40_++) {
				Class125 class125 = aClass125Array4398[i_40_];
				int i_41_ = class125.anInt2083;
				int i_42_ = class125.anInt2079;
				if (i_42_ >= 0) {
					if (i_41_ < 0)
						class125.method1726(65, i_39_, i);
					else
						class125.method1724(i_39_, -6, i);
				} else if (i_41_ >= 0)
					class125.method1721(true, i, i_39_);
			}
		}
	}
}
