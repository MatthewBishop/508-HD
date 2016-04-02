/* Class7_Sub3_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Static;

public class Class7_Sub3_Sub1 extends Class7_Sub3 {
	public static Class124 aClass124_3706 = Class14_Sub2_Sub2.method263(1178, "Hidden)2");
	public static Class124 aClass124_3710 = null;
	public static Class124 aClass124_3711 = Class14_Sub2_Sub2.method263(1178,
			" steht bereits auf Ihrer Ignorieren)2Liste(Q");
	public static int anInt3714 = 0;
	public static Class124 aClass124_3715 = Class14_Sub2_Sub2.method263(1178, "Welt");
	public static int anInt3718;
	public static int anInt3719;

	public static int method135(boolean bool, int i, int i_0_) {
		if (bool)
			aClass124_3715 = null;
		if (i_0_ == -2) {
			int i_1_ = 12345678;
			return i_1_;
		}
		if (i_0_ == -1) {
			if (i >= 2) {
				if (i > 126)
					i = 126;
			} else
				i = 2;
			int i_2_ = i;
			return i_2_;
		}
		i = (i_0_ & 0x7f) * i >> 7;
		if (i < 2)
			i = 2;
		else if (i > 126)
			i = 126;
		int i_3_ = i + (i_0_ & 0xff80);
		return i_3_;
	}

	public static void method136(boolean bool, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		Class123.anInt2062 = i_7_;
		Class14_Sub8_Sub23.anInt4480 = i;
		int i_9_ = 118 % ((i_6_ - 4) / 37);
		Class14_Sub8_Sub38.anInt4731 = i_5_;
		Class69.anInt1071 = i_4_;
		Class14_Sub20.anInt3095 = i_8_;
		if (bool && Class69.anInt1071 >= 100) {
			Class14_Sub8_Sub38.anInt4741 = Class123.anInt2062 * 128 + 64;
			Class14_Sub30.anInt3271 = Class14_Sub8_Sub38.anInt4731 * 128 + 64;
			Static2.anInt2926 = (Static.method1017(Class14_Sub8_Sub38.anInt4741, Class14_Sub2_Sub3.anInt3785,
					(byte) 80, Class14_Sub30.anInt3271) - Class14_Sub8_Sub23.anInt4480);
		}
		Class89.anInt1415 = 2;
	}

	public static void method137(int i) {
		aClass124_3706 = null;
		aClass124_3711 = null;
		aClass124_3715 = null;
		if (i != -8020)
			aClass124_3715 = null;
		aClass124_3710 = null;
	}

	public static void method138(boolean bool, Class9 class9, Class9 class9_10_, boolean bool_11_) {
		Class125_Sub2.aBoolean3375 = bool_11_;
		if (!bool) {
			Class15.aClass9_382 = class9;
			Static2.aClass9_2923 = class9_10_;
		}
	}

	public static byte[] method139(int i, byte[] is) {
		Buffer class14_sub10 = new Buffer(is);
		if (i != -28009)
			anInt3714 = 116;
		int i_12_ = class14_sub10.method798();
		int i_13_ = class14_sub10.method812((byte) -107);
		if (i_13_ < 0 || Static.anInt2797 != 0 && i_13_ > Static.anInt2797)
			throw new RuntimeException();
		if (i_12_ == 0) {
			byte[] is_14_ = new byte[i_13_];
			class14_sub10.method824(i_13_, (byte) 97, 0, is_14_);
			byte[] is_15_ = is_14_;
			return is_15_;
		}
		int i_16_ = class14_sub10.method812((byte) -120);
		if (i_16_ < 0 || Static.anInt2797 != 0 && i_16_ > Static.anInt2797)
			throw new RuntimeException();
		byte[] is_17_ = new byte[i_16_];
		if (i_12_ != 1)
			Class56.aClass49_922.method1195(is_17_, false, class14_sub10);
		else
			Class136.method1934(is_17_, i_16_, is, i_13_, 9);
		byte[] is_18_ = is_17_;
		return is_18_;
	}

	public static void method140(Applet_Sub1 applet_sub1, int i) {
		if (i != -29429)
			method135(false, -38, 10);
		Class75.method1340((byte) 78);
		if (Static2.aClass104_4037 == null) {
			if (!Class14_Sub8_Sub16.aBoolean4357)
				Class37.method1108((byte) 96);
			else if (anInt3714 == 1) {
				int i_19_ = Class150.anInt2423 / 5;
				int i_20_ = i_19_ + (Class14_Sub8_Sub11.anInt4266 + 140);
				if (i_20_ <= Class125_Sub1.anInt3367 && Class125_Sub1.anInt3367 <= i_20_ + 14
						&& Class134.anInt2573 + 4 <= Class139.anInt2230
						&& Class134.anInt2573 + 18 >= Class139.anInt2230)
					Class32.method1082(0, 0, 54);
				else if (Class125_Sub1.anInt3367 >= i_20_ + 15 && i_20_ + 80 >= Class125_Sub1.anInt3367
						&& Class139.anInt2230 >= Class134.anInt2573 + 4
						&& Class139.anInt2230 <= Class134.anInt2573 + 18)
					Class32.method1082(0, 1, i + 29310);
				else {
					int i_21_ = i_19_ + (Class14_Sub8_Sub11.anInt4266 + 250);
					if (i_21_ <= Class125_Sub1.anInt3367 && i_21_ + 14 >= Class125_Sub1.anInt3367
							&& Class139.anInt2230 >= Class134.anInt2573 + 4
							&& Class134.anInt2573 + 18 >= Class139.anInt2230)
						Class32.method1082(1, 0, -118);
					else if (i_21_ + 15 <= Class125_Sub1.anInt3367 && i_21_ + 80 >= Class125_Sub1.anInt3367
							&& Class139.anInt2230 >= Class134.anInt2573 + 4
							&& Class134.anInt2573 + 18 >= Class139.anInt2230)
						Class32.method1082(1, 1, -111);
					else {
						int i_22_ = Class14_Sub8_Sub11.anInt4266 - (-i_19_ - 360);
						if (Class125_Sub1.anInt3367 >= i_22_ && Class125_Sub1.anInt3367 <= i_22_ + 14
								&& Class134.anInt2573 + 4 <= Class139.anInt2230
								&& Class134.anInt2573 + 18 >= Class139.anInt2230)
							Class32.method1082(2, 0, i + 29476);
						else if (i_22_ + 15 <= Class125_Sub1.anInt3367 && Class125_Sub1.anInt3367 <= i_22_ + 80
								&& (Class134.anInt2573 + 4 <= Class139.anInt2230)
								&& (Class134.anInt2573 + 18 >= Class139.anInt2230))
							Class32.method1082(2, 1, -112);
						else {
							int i_23_ = Class14_Sub8_Sub11.anInt4266 + i_19_ + 470;
							if (i_23_ <= Class125_Sub1.anInt3367 && i_23_ + 14 >= Class125_Sub1.anInt3367
									&& Class134.anInt2573 + 4 <= Class139.anInt2230
									&& (Class134.anInt2573 + 18 >= Class139.anInt2230))
								Class32.method1082(3, 0, 51);
							else if (Class125_Sub1.anInt3367 >= i_23_ + 15 && Class125_Sub1.anInt3367 <= i_23_ + 80
									&& (Class139.anInt2230 >= Class134.anInt2573 + 4)
									&& (Class134.anInt2573 + 18 >= Class139.anInt2230))
								Class32.method1082(3, 1, i + 29514);
							else if (Static.anInt2801 != -1) {
								Class45 class45 = (Class133_Sub1.aClass45Array3435[Static.anInt2801]);
								if (!class45.aBoolean749 != Class132.aBoolean2170) {
									byte[] is = Class14_Sub8_Sub7.method515(
											(new Class124[] { class45.aClass124_741, Class54.aClass124_883 }),
											(byte) -78).method1681(-113);
									Class14_Sub8_Sub31.aString4605 = new String(is, 0, is.length);
									Class120.anInt2005 = class45.anInt744;
									if (Class7.anInt182 != 0) {
										Class84.anInt1346 = Class120.anInt2005 + 40000;
										Class99_Sub2.anInt3348 = Class120.anInt2005 + 50000;
										Class131.anInt2164 = Class84.anInt1346;
									}
									if (Class14_Sub28.aClass94_3230 != null) {
										Class14_Sub28.aClass94_3230.aBoolean1503 = true;
										Class103.method1531((Class14_Sub28.aClass94_3230));
									}
								} else {
									Class124 class124 = Static2.aClass124_4039;
									if (Class7.anInt182 != 0)
										class124 = (Class14_Sub8_Sub7.method515(
												(new Class124[] { Class149.aClass124_2395,
														(Class83.method1407(104, (class45.anInt744 + 7000))) }),
												(byte) -19));
									Class124 class124_24_ = (Class14_Sub8_Sub7.method515((new Class124[] {
											Class125_Sub3.aClass124_3408, class45.aClass124_741, Class54.aClass124_883,
											class124, Class14_Sub19.aClass124_3065,
											(Class83.method1407(20, Class125_Sub2.language)), Class46.aClass124_755,
											(Class83.method1407(28, (Class14_Sub2_Sub11.anInt3884))),
											Class14_Sub17.aClass124_3014, Class83.method1407(71, 1),
											(Static2.aClass124_4044),
											(Class83.method1407(i + 29452, Class14_Sub2_Sub3.anInt3771)),
											(Class14_Sub2_Sub9.aClass124_3861),
											(Class83.method1407(9, Class99_Sub2.anInt3352)) }), (byte) -4));
									try {
										applet_sub1.getAppletContext().showDocument(class124_24_.method1676((byte) -52),
												"_self");
									} catch (Exception exception) {
										/* empty */
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method141(int i, Class14_Sub14 class14_sub14) {
		long l = 0L;
		int i_25_ = 0;
		if (class14_sub14.anInt2971 == 0)
			l = Static.method79(class14_sub14.anInt2969, class14_sub14.anInt2967, class14_sub14.anInt2970);
		if (class14_sub14.anInt2971 == 1)
			l = Class14_Sub2_Sub12.method323(class14_sub14.anInt2969, class14_sub14.anInt2967, class14_sub14.anInt2970);
		int i_26_ = -1;
		int i_27_ = 0;
		if (class14_sub14.anInt2971 == 2)
			l = Class14_Sub8_Sub38.method675(class14_sub14.anInt2969, class14_sub14.anInt2967, class14_sub14.anInt2970);
		if (class14_sub14.anInt2971 == 3)
			l = Class14_Sub8_Sub19.method578(class14_sub14.anInt2969, class14_sub14.anInt2967, class14_sub14.anInt2970);
		if (l != 0L) {
			i_26_ = (int) (l >>> 32) & 0x7fffffff;
			i_25_ = (int) l >> 14 & 0x1f;
			i_27_ = (int) l >> 52 & 0x3;
		}
		class14_sub14.anInt2968 = i_27_;
		if (i == 4) {
			class14_sub14.anInt2966 = i_25_;
			class14_sub14.anInt2979 = i_26_;
		}
	}
}
