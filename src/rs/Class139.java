/* Class139 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.Class25;
import com.jagex.util.Huffman;

public class Class139 {
	public static SoftCache aClass52_2229;
	public static int anInt2230 = 0;
	public static boolean aBoolean2233;

	static {
		aClass52_2229 = new SoftCache(64);
		aBoolean2233 = true;
	}

	public static void method1951(byte i, boolean bool) {
		Class7_Sub2_Sub1.aBoolean3699 = bool;
		if (!Class7_Sub2_Sub1.aBoolean3699) {
			int i_0_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) 125);
			int i_1_ = JunkTex.aClass14_Sub10_Sub1_4734.method781(false);
			int i_2_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -113);
			int i_3_ = ((JunkTex.anInt4280 - JunkTex.aClass14_Sub10_Sub1_4734.position) / 16);
			JunkTex.anIntArrayArray3391 = new int[i_3_][4];
			for (int i_4_ = 0; i_3_ > i_4_; i_4_++) {
				for (int i_5_ = 0; i_5_ < 4; i_5_++)
					JunkTex.anIntArrayArray3391[i_4_][i_5_] = JunkTex.aClass14_Sub10_Sub1_4734
							.getInt((byte) -108);
			}
			int i_6_ = JunkTex.aClass14_Sub10_Sub1_4734.method806();
			int i_7_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort();
			boolean bool_8_ = false;
			if ((i_0_ / 8 == 48 || i_0_ / 8 == 49) && i_7_ / 8 == 48)
				bool_8_ = true;
			Class14_Sub20.aByteArrayArray3097 = new byte[i_3_][];
			Class62.anIntArray992 = new int[i_3_];
			JunkTex.aByteArrayArray4556 = null;
			Static2.anIntArray2590 = null;
			JunkTex.anIntArray2858 = new int[i_3_];
			OverlayType.anIntArray2422 = new int[i_3_];
			if (i_0_ / 8 == 48 && i_7_ / 8 == 148)
				bool_8_ = true;
			Static2.aByteArrayArray139 = new byte[i_3_][];
			Class14_Sub2_Sub12.aByteArrayArray3913 = new byte[i_3_][];
			JunkTex.anIntArray3119 = new int[i_3_];
			JunkTex.anIntArray3955 = new int[i_3_];
			Static2.aByteArrayArray362 = new byte[i_3_][];
			i_3_ = 0;
			for (int i_9_ = (i_0_ - 6) / 8; (i_0_ + 6) / 8 >= i_9_; i_9_++) {
				for (int i_10_ = (i_7_ - 6) / 8; i_10_ <= (i_7_ + 6) / 8; i_10_++) {
					int i_11_ = (i_9_ << 40) + i_10_;
					if (bool_8_ && (i_10_ == 49 || i_10_ == 149 || i_10_ == 147 || i_9_ == 50
							|| i_9_ == 49 && i_10_ == 47)) {
						JunkTex.anIntArray2858[i_3_] = i_11_;
						Class62.anIntArray992[i_3_] = -1;
						OverlayType.anIntArray2422[i_3_] = -1;
						JunkTex.anIntArray3955[i_3_] = -1;
						JunkTex.anIntArray3119[i_3_] = -1;
					} else {
						JunkTex.anIntArray2858[i_3_] = i_11_;
						Class62.anIntArray992[i_3_] = (Class14_Sub13.aCacheFileWorker_2958
								.method146((JunkTex.method515(
										(new Class124[] { Class35.aClass124_601, Class83.method1407(43, i_9_),
												Class111.aClass124_1866, Class83.method1407(81, i_10_) }),
										(byte) -103))));
						OverlayType.anIntArray2422[i_3_] = (Class14_Sub13.aCacheFileWorker_2958.method146(
								(JunkTex.method515(
										(new Class124[] { Class111.aClass124_1863, Class83.method1407(112, i_9_),
												Class111.aClass124_1866, Class83.method1407(47, i_10_) }),
										(byte) -21))));
						JunkTex.anIntArray3955[i_3_] = (Class14_Sub13.aCacheFileWorker_2958
								.method146((JunkTex.method515(
										(new Class124[] { Class82.aClass124_1333, Class83.method1407(41, i_9_),
												Class111.aClass124_1866, Class83.method1407(87, i_10_) }),
										(byte) -123))));
						JunkTex.anIntArray3119[i_3_] = (Class14_Sub13.aCacheFileWorker_2958
								.method146(
										(JunkTex.method515((new Class124[] {
												SceneGraphNode_GameEntity_Sub1.aClass124_4943, Class83.method1407(94, i_9_),
												Class111.aClass124_1866, Class83.method1407(47, i_10_) }), (byte) -39))));
					}
					i_3_++;
				}
			}
			Class45.method1162(i_7_, i_0_, i_6_, i_1_, (byte) -118, i_2_, false);
		} else {
			int i_12_ = JunkTex.aClass14_Sub10_Sub1_4734.method832((byte) -72);
			int i_13_ = JunkTex.aClass14_Sub10_Sub1_4734.readUShort();
			int i_14_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -57);
			JunkTex.aClass14_Sub10_Sub1_4734.enableBitAccess();
			for (int i_15_ = 0; i_15_ < 4; i_15_++) {
				for (int i_16_ = 0; i_16_ < 13; i_16_++) {
					for (int i_17_ = 0; i_17_ < 13; i_17_++) {
						int i_18_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
						if (i_18_ != 1)
							Class7.anIntArrayArrayArray169[i_15_][i_16_][i_17_] = -1;
						else
							Class7.anIntArrayArrayArray169[i_15_][i_16_][i_17_] = JunkTex.aClass14_Sub10_Sub1_4734
									.readBits(0, 26);
					}
				}
			}
			JunkTex.aClass14_Sub10_Sub1_4734.disableBitAccess();
			int i_19_ = ((JunkTex.anInt4280 - JunkTex.aClass14_Sub10_Sub1_4734.position) / 16);
			JunkTex.anIntArrayArray3391 = new int[i_19_][4];
			for (int i_20_ = 0; i_20_ < i_19_; i_20_++) {
				for (int i_21_ = 0; i_21_ < 4; i_21_++)
					JunkTex.anIntArrayArray3391[i_20_][i_21_] = JunkTex.aClass14_Sub10_Sub1_4734
							.method831();
			}
			int i_22_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) -19);
			int i_23_ = JunkTex.aClass14_Sub10_Sub1_4734.method836((byte) 126);
			Class62.anIntArray992 = new int[i_19_];
			Class14_Sub2_Sub12.aByteArrayArray3913 = new byte[i_19_][];
			JunkTex.anIntArray3955 = new int[i_19_];
			Static2.aByteArrayArray362 = new byte[i_19_][];
			JunkTex.anIntArray3119 = new int[i_19_];
			JunkTex.anIntArray2858 = new int[i_19_];
			OverlayType.anIntArray2422 = new int[i_19_];
			JunkTex.aByteArrayArray4556 = null;
			Static2.anIntArray2590 = null;
			Class14_Sub20.aByteArrayArray3097 = new byte[i_19_][];
			Static2.aByteArrayArray139 = new byte[i_19_][];
			i_19_ = 0;
			for (int i_24_ = 0; i_24_ < 4; i_24_++) {
				for (int i_25_ = 0; i_25_ < 13; i_25_++) {
					for (int i_26_ = 0; i_26_ < 13; i_26_++) {
						int i_27_ = (Class7.anIntArrayArrayArray169[i_24_][i_25_][i_26_]);
						if (i_27_ != -1) {
							int i_28_ = i_27_ >> 35 & 0x7ff;
							int i_29_ = i_27_ >> 14 & 0x3ff;
							int i_30_ = (i_29_ / 8 << 8) + i_28_ / 8;
							for (int i_31_ = 0; i_19_ > i_31_; i_31_++) {
								if (JunkTex.anIntArray2858[i_31_] == i_30_) {
									i_30_ = -1;
									break;
								}
							}
							if (i_30_ != -1) {
								JunkTex.anIntArray2858[i_19_] = i_30_;
								int i_32_ = (i_30_ & 0xff04) >> 8;
								int i_33_ = i_30_ & 0xff;
								Class62.anIntArray992[i_19_] = (Class14_Sub13.aCacheFileWorker_2958
										.method146((JunkTex.method515(
												(new Class124[] { Class35.aClass124_601, Class83.method1407(62, i_32_),
														Class111.aClass124_1866, Class83.method1407(81, i_33_) }),
												(byte) -40))));
								OverlayType.anIntArray2422[i_19_] = (Class14_Sub13.aCacheFileWorker_2958.method146(
										(JunkTex.method515((new Class124[] { Class111.aClass124_1863,
												Class83.method1407(105, i_32_), Class111.aClass124_1866,
												Class83.method1407(79, i_33_) }), (byte) -42))));
								JunkTex.anIntArray3955[i_19_] = (Class14_Sub13.aCacheFileWorker_2958
										.method146((JunkTex.method515(
												(new Class124[] { Class82.aClass124_1333, Class83.method1407(29, i_32_),
														Class111.aClass124_1866, Class83.method1407(14, i_33_) }),
												(byte) -88))));
								JunkTex.anIntArray3119[i_19_] = (Class14_Sub13.aCacheFileWorker_2958.method146(
										(JunkTex.method515((new Class124[] {
												SceneGraphNode_GameEntity_Sub1.aClass124_4943, Class83.method1407(13, i_32_),
												Class111.aClass124_1866, Class83.method1407(55, i_33_) }), (byte) -6))));
								i_19_++;
							}
						}
					}
				}
			}
			Class45.method1162(i_13_, i_23_, i_12_, i_22_, (byte) -121, i_14_, false);
		}
		int i_34_ = 125 % ((-45 - i) / 57);
	}

	public static boolean method1952(int i, int i_35_, int i_36_, long l) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_35_][i_36_];
		if (class14_sub29 == null)
			return false;
		if (class14_sub29.aClass113_3250 != null && class14_sub29.aClass113_3250.aLong1887 == l)
			return true;
		if (class14_sub29.aClass37_3255 != null && class14_sub29.aClass37_3255.aLong634 == l)
			return true;
		if (class14_sub29.aClass4_3237 != null && class14_sub29.aClass4_3237.aLong132 == l)
			return true;
		for (int i_37_ = 0; i_37_ < class14_sub29.anInt3242; i_37_++) {
			if (class14_sub29.aClass40Array3257[i_37_].bitPacked == l)
				return true;
		}
		return false;
	}

	public static void method1953(byte i) {
		aClass52_2229 = null;
		if (i != -98)
			anInt2230 = -45;
	}

	public static void method1954(Class14_Sub2_Sub16 class14_sub2_sub16, int i, int i_38_, int i_39_, int i_40_,
			int i_41_, Class94 class94, Class14_Sub2_Sub16 class14_sub2_sub16_42_) {
		Class14_Sub28.aClass94_3230 = class94;
		int i_43_ = -21 / ((i_40_ - 0) / 61);
		JunkTex.anInt4266 = i_41_;
		Class14_Sub17.anInt3032 = i;
		Static2.anInt2573 = i_39_;
		OverlayType.anInt2423 = i_38_;
		if (Static2.aClass104_4037 == null) {
			JunkTex.aBoolean4357 = true;
			if (JunkTex.aClass14_Sub2_Sub19Array4595 == null)
				JunkTex.aClass14_Sub2_Sub19Array4595 = Class38.method1115(false,
						Class14_Sub3.aCacheFileWorker_2750, 0, Static2.anInt371);
			if (JunkTex.aClass148Array4580 == null)
				JunkTex.aClass148Array4580 = Static2.method1747(0, JunkTex.anInt5098, 229,
						Class14_Sub3.aCacheFileWorker_2750);
			if (Class75.aClass148Array1184 == null)
				Class75.aClass148Array1184 = Static2.method1747(0, JunkTex.anInt4532, 229,
						Class14_Sub3.aCacheFileWorker_2750);
			if (JunkTex.aClass148Array4473 == null)
				JunkTex.aClass148Array4473 = Static2.method1747(0, Class127.anInt2118, 229,
						Class14_Sub3.aCacheFileWorker_2750);
			i_43_ = OverlayType.anInt2423 / 5;
			int i_44_ = OverlayType.anInt2423 / 5 * 4;
			Class25.method1009(JunkTex.anInt4266, Static2.anInt2573, OverlayType.anInt2423,
					Class14_Sub17.anInt3032, 0, 168);
			Class25.method998(JunkTex.anInt4266, Static2.anInt2573, i_43_, 23, 12425273, 9135624);
			Class25.method998(i_43_ + JunkTex.anInt4266, Static2.anInt2573, i_44_, 23, 5197647, 2697513);
			class14_sub2_sub16.method345(JunkTex.aClass124_4203, (i_43_ / 2 + JunkTex.anInt4266),
					Static2.anInt2573 + 15, 0, -1);
			if (JunkTex.aClass148Array4473 != null) {
				JunkTex.aClass148Array4473[1].method2001(JunkTex.anInt4266 - (-i_43_ - 2),
						Static2.anInt2573 + 1);
				class14_sub2_sub16_42_.method364(Class118.aClass124_1981, i_43_ + (JunkTex.anInt4266) + 12,
						Static2.anInt2573 + 10, 16777215, -1);
				JunkTex.aClass148Array4473[0].method2001(i_43_ + JunkTex.anInt4266 + 2,
						Static2.anInt2573 + 12);
				class14_sub2_sub16_42_.method364((Class14_Sub9_Sub1.aClass124_4770),
						(JunkTex.anInt4266 - (-i_43_ - 12)), Static2.anInt2573 + 21, 16777215, -1);
			}
			if (Class75.aClass148Array1184 != null) {
				int i_45_ = JunkTex.anInt4266 + 140 + i_43_;
				if (Static2.anIntArray1086[0] == 0 && Class45.anIntArray737[0] == 0)
					Class75.aClass148Array1184[2].method2001(i_45_, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[0].method2001(i_45_, Static2.anInt2573 + 4);
				if (Static2.anIntArray1086[0] == 0 && Class45.anIntArray737[0] == 1)
					Class75.aClass148Array1184[3].method2001(i_45_ + 15, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[1].method2001(i_45_ + 15, Static2.anInt2573 + 4);
				class14_sub2_sub16.method364(JunkTex.aClass124_2852, i_45_ + 32, Static2.anInt2573 + 17, 16777215,
						-1);
				int i_46_ = i_43_ + JunkTex.anInt4266 + 250;
				if (Static2.anIntArray1086[0] != 1 || Class45.anIntArray737[0] != 0)
					Class75.aClass148Array1184[0].method2001(i_46_, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[2].method2001(i_46_, Static2.anInt2573 + 4);
				if (Static2.anIntArray1086[0] == 1 && Class45.anIntArray737[0] == 1)
					Class75.aClass148Array1184[3].method2001(i_46_ + 15, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[1].method2001(i_46_ + 15, Static2.anInt2573 + 4);
				class14_sub2_sub16.method364(SceneGraphNode.aClass124_2183, i_46_ + 32, Static2.anInt2573 + 17, 16777215,
						-1);
				int i_47_ = i_43_ + 360 + JunkTex.anInt4266;
				if (Static2.anIntArray1086[0] != 2 || Class45.anIntArray737[0] != 0)
					Class75.aClass148Array1184[0].method2001(i_47_, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[2].method2001(i_47_, Static2.anInt2573 + 4);
				if (Static2.anIntArray1086[0] != 2 || Class45.anIntArray737[0] != 1)
					Class75.aClass148Array1184[1].method2001(i_47_ + 15, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[3].method2001(i_47_ + 15, Static2.anInt2573 + 4);
				class14_sub2_sub16.method364(JunkTex.aClass124_4167, i_47_ + 32, Static2.anInt2573 + 17,
						16777215, -1);
				int i_48_ = i_43_ + JunkTex.anInt4266 + 470;
				if (Static2.anIntArray1086[0] != 3 || Class45.anIntArray737[0] != 0)
					Class75.aClass148Array1184[0].method2001(i_48_, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[2].method2001(i_48_, Static2.anInt2573 + 4);
				if (Static2.anIntArray1086[0] != 3 || Class45.anIntArray737[0] != 1)
					Class75.aClass148Array1184[1].method2001(i_48_ + 15, Static2.anInt2573 + 4);
				else
					Class75.aClass148Array1184[3].method2001(i_48_ + 15, Static2.anInt2573 + 4);
				class14_sub2_sub16.method364(Static2.aClass124_2129, i_48_ + 32, Static2.anInt2573 + 17, 16777215,
						-1);
			}
			Class25.method1004(OverlayType.anInt2423 - 58 - 10, Static2.anInt2573 + 4, 58, 16, 0);
			JunkTex.anInt2801 = -1;
			if (JunkTex.aClass14_Sub2_Sub19Array4595 != null) {
				int i_49_ = 88;
				int i_50_ = OverlayType.anInt2423 / (i_49_ + 1);
				int i_51_ = 19;
				int i_52_ = (Class14_Sub17.anInt3032 - 23) / (i_51_ + 1);
				int i_53_;
				int i_54_;
				do {
					i_53_ = i_52_;
					i_54_ = i_50_;
					if ((i_50_ - 1) * i_52_ >= JunkTex.anInt1129)
						i_50_--;
					if (JunkTex.anInt1129 <= (i_52_ - 1) * i_50_)
						i_52_--;
					if (JunkTex.anInt1129 <= (i_52_ - 1) * i_50_)
						i_52_--;
				} while (i_52_ != i_53_ || i_50_ != i_54_);
				i_53_ = (-(i_50_ * i_49_) + OverlayType.anInt2423) / (i_50_ + 1);
				if (i_53_ > 5)
					i_53_ = 5;
				i_54_ = ((-(i_52_ * i_51_) + (Class14_Sub17.anInt3032 - 23)) / (i_52_ + 1));
				if (i_54_ > 5)
					i_54_ = 5;
				int i_55_ = ((-((i_52_ - 1) * i_54_) + (Class14_Sub17.anInt3032 - i_52_ * i_51_ - 23)) / 2);
				int i_56_ = 23 + i_55_;
				int i_57_ = ((-(i_53_ * (i_50_ - 1)) + (-(i_50_ * i_49_) + OverlayType.anInt2423)) / 2);
				int i_58_ = 0;
				int i_59_ = i_57_;
				for (int i_60_ = 0; i_60_ < JunkTex.anInt1129; i_60_++) {
					boolean bool = true;
					Class45 class45 = SceneGraphNode_GameEntity.aClass45Array3435[i_60_];
					Class124 class124 = Class83.method1407(81, class45.anInt752);
					if (class45.anInt752 != -1) {
						if (class45.anInt752 > 1980) {
							class124 = Class108.aClass124_1825;
							bool = false;
						}
					} else {
						class124 = Class7_Sub2.aClass124_2669;
						bool = false;
					}
					if (i_59_ > JunkTex.anInt4640 || Static2.anInt1804 < i_56_
							|| JunkTex.anInt4640 >= i_59_ + i_49_ || Static2.anInt1804 >= i_56_ + i_51_
							|| !bool)
						JunkTex.aClass14_Sub2_Sub19Array4595[class45.aBoolean749 ? 1 : 0]
								.drawReg(i_59_ + JunkTex.anInt4266, i_56_ + Static2.anInt2573);
					else {
						JunkTex.anInt2801 = i_60_;
						JunkTex.aClass14_Sub2_Sub19Array4595[class45.aBoolean749 ? 1 : 0].method400(
								i_59_ + JunkTex.anInt4266, i_56_ + Static2.anInt2573, 128, 16777215);
					}
					if (JunkTex.aClass148Array4580 != null)
						JunkTex.aClass148Array4580[(!class45.aBoolean749 ? 0
								: (JunkTex.aClass148Array4580.length / 2)) + class45.anInt745].method2001(
										i_59_ + JunkTex.anInt4266 + 29, i_56_ + Static2.anInt2573);
					class14_sub2_sub16.method345(Class83.method1407(45, class45.anInt744),
							i_59_ + 15 + JunkTex.anInt4266, i_56_ + Static2.anInt2573 + (i_51_ / 2 + 5), 0,
							-1);
					class14_sub2_sub16_42_.method345(class124, i_59_ + 60 + JunkTex.anInt4266,
							i_51_ / 2 + 5 + Static2.anInt2573 + i_56_, 268435455, -1);
					i_56_ += i_54_ + i_51_;
					if (++i_58_ >= i_52_) {
						i_59_ += i_53_ + i_49_;
						i_58_ = 0;
						i_56_ = i_55_ + 23;
					}
				}
			}
		}
	}

	public static void method1955(int i, Huffman huffman) {
		if (i < -58)
			Class98.aClass5_1659 = huffman;
	}
}
