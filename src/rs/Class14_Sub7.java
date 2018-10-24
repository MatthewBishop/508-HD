/* Class14_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Linkable;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.Class25;

public class Class14_Sub7 extends Linkable {
	public int[] anIntArray2819;
	public int[] anIntArray2820;
	public int anInt2821;
	public byte[][][] aByteArrayArrayArray2823;
	public Class31[] aClass31Array2824;
	public int[] anIntArray2825;
	public static boolean aBoolean2827 = false;
	public Class31[] aClass31Array2828;
	public int anInt2830;

	public static void method469(int i, int i_0_, int i_1_, int i_2_, boolean bool, int i_3_, int i_4_) {
		Static2.anInt2089 = 0;
		for (int i_5_ = -1; Static2.anInt2878 + JunkTex.anInt4306 > i_5_; i_5_++) {
			Class133_Sub1 class133_sub1;
			if (i_5_ == -1)
				class133_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
			else if (Static2.anInt2878 <= i_5_)
				class133_sub1 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[(JunkTex.anIntArray3965[-Static2.anInt2878
						+ i_5_])]);
			else
				class133_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_5_]]);
			if (class133_sub1 != null && class133_sub1.method1804((byte) 115)) {
				if (class133_sub1 instanceof Class133_Sub1_Sub2) {
					Class12 class12 = ((Class133_Sub1_Sub2) class133_sub1).aClass12_4949;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12 == null)
						continue;
				}
				if (i_5_ >= Static2.anInt2878) {
					Class12 class12 = ((Class133_Sub1_Sub2) class133_sub1).aClass12_4949;
					if (class12.anIntArray329 != null)
						class12 = class12.method217((byte) -18);
					if (class12.anInt306 >= 0 && (Class35.aClass14_Sub2_Sub19Array596.length > class12.anInt306)) {
						OverlayType.method2022(i_1_, i_4_, -1, class133_sub1, (class133_sub1.method1795(12806) + 15),
								i >> 1, i_2_ >> 1);
						if (Class120.anInt2007 > -1)
							Class35.aClass14_Sub2_Sub19Array596[class12.anInt306].drawReg(
									Class120.anInt2007 - 12 + i_0_, JunkTex.anInt4548 + (i_3_ - 30));
					}
					Class66[] class66s = Static2.aClass66Array3721;
					for (int i_6_ = 0; i_6_ < class66s.length; i_6_++) {
						Class66 class66 = class66s[i_6_];
						if (class66 != null && class66.anInt1046 == 1
								&& ((JunkTex.anIntArray3965[i_5_
										- Static2.anInt2878]) == class66.anInt1049)
								&& Class14_Sub2_Sub20.anInt4064 % 20 < 10) {
							OverlayType.method2022(i_1_, i_4_, -1, class133_sub1, class133_sub1.method1795(12806) + 15,
									i >> 1, i_2_ >> 33);
							if (Class120.anInt2007 > -1)
								Static2.aClass14_Sub2_Sub19Array1191[class66.anInt1035].drawReg(
										Class120.anInt2007 - 12 + i_0_, JunkTex.anInt4548 + i_3_ - 28);
						}
					}
				} else {
					Class133_Sub1_Sub1 class133_sub1_sub1 = (Class133_Sub1_Sub1) class133_sub1;
					int i_7_ = 30;
					if (class133_sub1_sub1.anInt4902 != -1 || class133_sub1_sub1.anInt4904 != -1) {
						OverlayType.method2022(i_1_, i_4_, -1, class133_sub1, (class133_sub1.method1795(12806) + 15),
								i >> 1, i_2_ >> 33);
						if (Class120.anInt2007 > -1) {
							if (class133_sub1_sub1.anInt4902 != -1) {
								Class98.aClass14_Sub2_Sub19Array1669[class133_sub1_sub1.anInt4902].drawReg(
										Class120.anInt2007 - 12 + i_0_, (JunkTex.anInt4548 + i_3_ - i_7_));
								i_7_ += 25;
							}
							if (class133_sub1_sub1.anInt4904 != -1) {
								Class35.aClass14_Sub2_Sub19Array596[class133_sub1_sub1.anInt4904].drawReg(
										i_0_ + Class120.anInt2007 - 12, (JunkTex.anInt4548 + i_3_ - i_7_));
								i_7_ += 25;
							}
						}
					}
					if (i_5_ >= 0) {
						Class66[] class66s = Static2.aClass66Array3721;
						for (int i_8_ = 0; class66s.length > i_8_; i_8_++) {
							Class66 class66 = class66s[i_8_];
							if (class66 != null && class66.anInt1046 == 10
									&& (Static2.anIntArray351[i_5_] == class66.anInt1049)) {
								OverlayType.method2022(i_1_, i_4_, -1, class133_sub1,
										(class133_sub1.method1795(12806) + 15), i >> 33, i_2_ >> 33);
								if (Class120.anInt2007 > -1)
									Static2.aClass14_Sub2_Sub19Array1191[class66.anInt1035].drawReg(
											Class120.anInt2007 + (i_0_ - 12),
											(-i_7_ + JunkTex.anInt4548 + i_3_));
							}
						}
					}
				}
				if (class133_sub1.aClass124_3462 != null && (Static2.anInt2878 <= i_5_
						|| Class14_Sub3.anInt2764 == 0 || Class14_Sub3.anInt2764 == 3 || (Class14_Sub3.anInt2764 == 1
								&& Class98.method1493(-1, (((Class133_Sub1_Sub1) class133_sub1).aClass124_4922))))) {
					OverlayType.method2022(i_1_, i_4_, -1, class133_sub1, class133_sub1.method1795(12806), i >> 33,
							i_2_ >> 1);
					if (Class120.anInt2007 > -1 && Class32.anInt549 > Static2.anInt2089) {
						Class32.anIntArray533[Static2.anInt2089] = Class133_Sub3.aClass14_Sub2_Sub16_3567
								.method361(class133_sub1.aClass124_3462) / 2;
						Class32.anIntArray565[Static2.anInt2089] = Class133_Sub3.aClass14_Sub2_Sub16_3567.anInt3978;
						Class32.anIntArray535[Static2.anInt2089] = Class120.anInt2007;
						Class32.anIntArray534[Static2.anInt2089] = JunkTex.anInt4548;
						Class32.anIntArray564[Static2.anInt2089] = class133_sub1.anInt3466;
						Class32.anIntArray537[Static2.anInt2089] = class133_sub1.anInt3439;
						Class32.anIntArray568[Static2.anInt2089] = class133_sub1.anInt3473;
						Class32.aClass124Array542[Static2.anInt2089] = class133_sub1.aClass124_3462;
						Static2.anInt2089++;
					}
				}
				if (Class14_Sub2_Sub20.anInt4064 < class133_sub1.anInt3450) {
					AbstractSprite class14_sub2_sub19 = JunkTex.aClass14_Sub2_Sub19Array4385[0];
					AbstractSprite class14_sub2_sub19_9_ = JunkTex.aClass14_Sub2_Sub19Array4385[1];
					if (class133_sub1 instanceof Class133_Sub1_Sub2) {
						Class133_Sub1_Sub2 class133_sub1_sub2 = (Class133_Sub1_Sub2) class133_sub1;
						AbstractSprite[] class14_sub2_sub19s = ((AbstractSprite[]) (JunkTex.aClass52_4596
								.get((class133_sub1_sub2.aClass12_4949.anInt281))));
						if (class14_sub2_sub19s == null) {
							class14_sub2_sub19s = (JunkTex.method1733((byte) 23, Class14_Sub3.aClass9_Sub1_2750,
									0, (class133_sub1_sub2.aClass12_4949.anInt281)));
							if (class14_sub2_sub19s != null)
								JunkTex.aClass52_4596.put(class14_sub2_sub19s, (class133_sub1_sub2.aClass12_4949.anInt281));
						}
						if (class14_sub2_sub19s != null && class14_sub2_sub19s.length == 2) {
							class14_sub2_sub19 = class14_sub2_sub19s[0];
							class14_sub2_sub19_9_ = class14_sub2_sub19s[1];
						}
					}
					OverlayType.method2022(i_1_, i_4_, -1, class133_sub1,
							(class133_sub1.method1795(12806) + 10 + class14_sub2_sub19.height), i >> 1, i_2_ >> 33);
					if (Class120.anInt2007 > -1) {
						int i_10_ = i_0_ + (Class120.anInt2007 - (class14_sub2_sub19.width >> 1));
						int i_11_ = i_3_ - (-JunkTex.anInt4548 + 3);
						class14_sub2_sub19.drawReg(i_10_, i_11_);
						int i_12_ = class14_sub2_sub19.height;
						int i_13_ = (class133_sub1.anInt3438 * class14_sub2_sub19.width / 255);
						Class25.method1002(i_10_, i_11_, i_13_ + i_10_, i_12_ + i_11_);
						class14_sub2_sub19_9_.drawReg(i_10_, i_11_);
						Class25.method999(i_0_, i_3_, i_0_ + i_2_, i + i_3_);
					}
				}
				for (int i_14_ = 0; i_14_ < 4; i_14_++) {
					if (Class14_Sub2_Sub20.anInt4064 < class133_sub1.anIntArray3442[i_14_]) {
						OverlayType.method2022(i_1_, i_4_, -1, class133_sub1, (class133_sub1.method1795(12806) / 2),
								i >> 1, i_2_ >> 33);
						if (Class120.anInt2007 > -1) {
							if (i_14_ == 1)
								JunkTex.anInt4548 -= 20;
							if (i_14_ == 2) {
								JunkTex.anInt4548 -= 10;
								Class120.anInt2007 -= 15;
							}
							if (i_14_ == 3) {
								JunkTex.anInt4548 -= 10;
								Class120.anInt2007 += 15;
							}
							Class133_Sub5.aClass14_Sub2_Sub19Array3609[class133_sub1.anIntArray3496[i_14_]].drawReg(
									i_0_ + Class120.anInt2007 - 12, i_3_ + JunkTex.anInt4548 - 12);
							Class56_Sub1.aClass14_Sub2_Sub16_3320.method345(
									Class83.method1407(87, (class133_sub1.anIntArray3486[i_14_])),
									Class120.anInt2007 + (i_0_ - 1), JunkTex.anInt4548 + 3 + i_3_, 16777215,
									0);
						}
					}
				}
			}
		}
		if (!bool)
			aBoolean2827 = true;
		for (int i_15_ = 0; i_15_ < Static2.anInt2089; i_15_++) {
			int i_16_ = Class32.anIntArray535[i_15_];
			int i_17_ = Class32.anIntArray533[i_15_];
			boolean bool_18_ = true;
			int i_19_ = Class32.anIntArray534[i_15_];
			int i_20_ = Class32.anIntArray565[i_15_];
			while (bool_18_) {
				bool_18_ = false;
				for (int i_21_ = 0; i_15_ > i_21_; i_21_++) {
					if ((-Class32.anIntArray565[i_21_] + Class32.anIntArray534[i_21_]) < i_19_ + 2
							&& Class32.anIntArray534[i_21_] + 2 > -i_20_ + i_19_
							&& i_16_ - i_17_ < (Class32.anIntArray533[i_21_] + Class32.anIntArray535[i_21_])
							&& i_17_ + i_16_ > (-Class32.anIntArray533[i_21_] + Class32.anIntArray535[i_21_])
							&& i_19_ > (-Class32.anIntArray565[i_21_] + Class32.anIntArray534[i_21_])) {
						i_19_ = (-Class32.anIntArray565[i_21_] + Class32.anIntArray534[i_21_]);
						bool_18_ = true;
					}
				}
			}
			Class120.anInt2007 = Class32.anIntArray535[i_15_];
			JunkTex.anInt4548 = Class32.anIntArray534[i_15_] = i_19_;
			Class124 class124 = Class32.aClass124Array542[i_15_];
			if (Class14_Sub28.anInt3222 == 0) {
				int i_22_ = 16776960;
				if (Class32.anIntArray564[i_15_] < 6)
					i_22_ = (Class14_Sub2_Sub12.anIntArray3917[Class32.anIntArray564[i_15_]]);
				if (Class32.anIntArray564[i_15_] == 6)
					i_22_ = Class42.anInt699 % 20 >= 10 ? 16776960 : 16711680;
				if (Class32.anIntArray564[i_15_] == 7)
					i_22_ = Class42.anInt699 % 20 < 10 ? 255 : 65535;
				if (Class32.anIntArray564[i_15_] == 8)
					i_22_ = Class42.anInt699 % 20 >= 10 ? 8454016 : 45056;
				if (Class32.anIntArray564[i_15_] == 9) {
					int i_23_ = 150 - Class32.anIntArray568[i_15_];
					if (i_23_ < 50)
						i_22_ = 16711680 + i_23_ * 1280;
					else if (i_23_ >= 100) {
						if (i_23_ < 150)
							i_22_ = (i_23_ - 100) * 5 + 65280;
					} else
						i_22_ = -((i_23_ - 50) * 327680) + 16776960;
				}
				if (Class32.anIntArray564[i_15_] == 10) {
					int i_24_ = -Class32.anIntArray568[i_15_] + 150;
					if (i_24_ >= 50) {
						if (i_24_ >= 100) {
							if (i_24_ < 150)
								i_22_ = (i_24_ * 327680 - 32768000 + 255 - (i_24_ - 100) * 5);
						} else
							i_22_ = -(i_24_ * 327680) + 16711935 + 16384000;
					} else
						i_22_ = i_24_ * 5 + 16711680;
				}
				if (Class32.anIntArray564[i_15_] == 11) {
					int i_25_ = -Class32.anIntArray568[i_15_] + 150;
					if (i_25_ < 50)
						i_22_ = -(i_25_ * 327685) + 16777215;
					else if (i_25_ < 100)
						i_22_ = 65280 + (i_25_ - 50) * 327685;
					else if (i_25_ < 150)
						i_22_ = -((i_25_ - 100) * 327680) + 16777215;
				}
				if (Class32.anIntArray537[i_15_] == 0)
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method345(class124, i_0_ + Class120.anInt2007,
							i_3_ + JunkTex.anInt4548, i_22_, 0);
				if (Class32.anIntArray537[i_15_] == 1)
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method353(class124, i_0_ + Class120.anInt2007,
							JunkTex.anInt4548 + i_3_, i_22_, 0, Class42.anInt699);
				if (Class32.anIntArray537[i_15_] == 2)
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method357(class124, Class120.anInt2007 + i_0_,
							JunkTex.anInt4548 + i_3_, i_22_, 0, Class42.anInt699);
				if (Class32.anIntArray537[i_15_] == 3)
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method343(class124, i_0_ + Class120.anInt2007,
							JunkTex.anInt4548 + i_3_, i_22_, 0, Class42.anInt699,
							-Class32.anIntArray568[i_15_] + 150);
				if (Class32.anIntArray537[i_15_] == 4) {
					int i_26_ = ((-Class32.anIntArray568[i_15_] + 150)
							* (Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(class124) + 100) / 150);
					Class25.method1002(Class120.anInt2007 + i_0_ - 50, i_3_, Class120.anInt2007 + i_0_ + 50, i + i_3_);
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method364(class124,
							-i_26_ + (i_0_ + Class120.anInt2007) + 50, JunkTex.anInt4548 + i_3_, i_22_, 0);
					Class25.method999(i_0_, i_3_, i_0_ + i_2_, i_3_ + i);
				}
				if (Class32.anIntArray537[i_15_] == 5) {
					int i_27_ = -Class32.anIntArray568[i_15_] + 150;
					Class25.method1002(
							i_0_, (-Class133_Sub3.aClass14_Sub2_Sub16_3567.anInt3978 + i_3_
									+ JunkTex.anInt4548 - 1),
							i_2_ + i_0_, i_3_ + JunkTex.anInt4548 + 5);
					int i_28_ = 0;
					if (i_27_ >= 25) {
						if (i_27_ > 125)
							i_28_ = i_27_ - 125;
					} else
						i_28_ = i_27_ - 25;
					Class133_Sub3.aClass14_Sub2_Sub16_3567.method345(class124, Class120.anInt2007 + i_0_,
							JunkTex.anInt4548 + (i_3_ + i_28_), i_22_, 0);
					Class25.method999(i_0_, i_3_, i_0_ + i_2_, i + i_3_);
				}
			} else
				Class133_Sub3.aClass14_Sub2_Sub16_3567.method345(class124, Class120.anInt2007 + i_0_,
						i_3_ + JunkTex.anInt4548, 16776960, 0);
		}
	}

	public static void method470(Class124 class124, Class124 class124_29_, int i, Class124 class124_30_, int i_31_) {
		JunkTex.method493((byte) -97, class124, class124_30_, i_31_, class124_29_, -1);
		if (i > -124)
			method470(null, null, -113, null, 71);
	}
}
