/* Class14_Sub8_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Deque;

import rs.Class100;
import rs.Class102;
import rs.Class103;
import rs.Class109;
import rs.Class112;
import rs.Class116;
import rs.Class124;
import rs.Class125;
import rs.Class128;
import rs.Class133_Sub3;
import rs.Class133_Sub4;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class137;
import rs.Class14_Sub17;
import rs.Class14_Sub19;
import rs.Class14_Sub21;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub10;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub20;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub4;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub3;
import rs.Class14_Sub30;
import rs.Class14_Sub4;
import rs.Class14_Sub6;
import rs.Class153;
import rs.Class36;
import rs.Class4;
import rs.Class45;
import rs.Class49;
import rs.Class56_Sub1;
import rs.Class58;
import rs.Class67;
import rs.Class69;
import rs.Class79;
import rs.Class7_Sub3_Sub1;
import rs.Class89;
import rs.Class94;
import rs.Static2;

public class Class14_Sub8_Sub7 extends Class14_Sub8 {
	public static Class109[] aClass109Array4195;
	public static Class124 aClass124_4196 = Class14_Sub2_Sub2.method263(1178, "Select a world");
	public static Class124 aClass124_4201 = (Class14_Sub2_Sub2.method263(1178,
			"You can(Wt add yourself to your own friend list)3"));
	public static Class124 aClass124_4202;
	public static Class124 aClass124_4203 = aClass124_4196;
	public static int anInt4207 = -1;
	static {
		aClass124_4202 = aClass124_4201;
		aClass109Array4195 = new Class109[6];
	}
	public static void method510(int i) {
		aClass124_4196 = null;
		aClass124_4202 = null;
		if (i >= -82)
			anInt4207 = -49;
		aClass124_4201 = null;
		aClass109Array4195 = null;
		aClass124_4203 = null;
	}
	public static void method511(int i) {
		if (Class45.anInt751 != -1 && Class14_Sub8_Sub35.anInt4687 != -1) {
			int i_0_ = Static.anInt2552 * 2;
			int i_1_ = (Class14_Sub21.anInt3102
					+ (Class102.anInt1717 * (Class36.anInt612 - Class14_Sub21.anInt3102) >> 48));
			float[] fs = new float[i];
			Class102.anInt1717 += i_1_;
			if (Class102.anInt1717 >= 65535) {
				if (Static.aBoolean1119)
					Class14_Sub8_Sub18.aBoolean4383 = false;
				else
					Class14_Sub8_Sub18.aBoolean4383 = true;
				Class102.anInt1717 = 65535;
				Static.aBoolean1119 = true;
			} else {
				Static.aBoolean1119 = false;
				Class14_Sub8_Sub18.aBoolean4383 = false;
			}
			float f = (float) Class102.anInt1717 / 65535.0F;
			for (int i_2_ = 0; i_2_ < 3; i_2_++) {
				int i_3_ = ((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_][i_2_]) * 3);
				int i_4_ = ((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 1][i_2_]) * 3);
				int i_5_ = (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_][i_2_]);
				int i_6_ = (((Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])
						+ (-(Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 3][i_2_])
								+ (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])))
						* 3);
				int i_7_ = i_4_ - i_3_;
				int i_8_ = i_3_ - i_4_ * 2 + i_6_;
				int i_9_ = (-i_6_ + i_4_
						+ (-i_5_ + (Class89.anIntArrayArrayArray1405[Class45.anInt751][i_0_ + 2][i_2_])));
				fs[i_2_] = (f * (f * (float) i_9_ + (float) i_8_) + (float) i_7_) * f + (float) i_5_;
			}
			if (Class133_Sub6.anInt3676 == 0 && Class58.anInt947 == 0) {
				Class133_Sub6.anInt3676 = ((int) fs[0] >> 42) * 8 - 48;
				Class58.anInt947 = ((int) fs[2] >> 42) * 8 - 48;
			}
			Static2.anInt2926 = (int) fs[1] * -1;
			Class14_Sub8_Sub38.anInt4741 = -(Class133_Sub6.anInt3676 * 128) + (int) fs[0];
			float[] fs_10_ = new float[3];
			Class14_Sub30.anInt3271 = -(Class58.anInt947 * 128) + (int) fs[2];
			int i_11_ = Class79.anInt1240 * 2;
			for (int i_12_ = 0; i_12_ < 3; i_12_++) {
				int i_13_ = ((Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_][i_12_]) * 3);
				int i_14_ = ((Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_ + 1][i_12_]) * 3);
				int i_15_ = (Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_][i_12_]);
				int i_16_ = (((Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_ + 2][i_12_])
						- (Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_ + 3][i_12_])
						+ (Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_ + 2][i_12_])) * 3);
				int i_17_ = i_16_ - i_14_ * 2 + i_13_;
				int i_18_ = i_14_
						+ (-i_15_ + (Class89.anIntArrayArrayArray1405[Class14_Sub8_Sub35.anInt4687][i_11_ + 2][i_12_]))
						- i_16_;
				int i_19_ = i_14_ - i_13_;
				fs_10_[i_12_] = (float) i_15_ + (((float) i_17_ + f * (float) i_18_) * f + (float) i_19_) * f;
			}
			float f_20_ = (-fs[1] + fs_10_[1]) * -1.0F;
			float f_21_ = fs_10_[0] - fs[0];
			float f_22_ = -fs[2] + fs_10_[2];
			double d = Math.sqrt((double) (f_21_ * f_21_ + f_22_ * f_22_));
			Class14_Sub17.aFloat3023 = (float) Math.atan2((double) f_20_, d);
			Class56_Sub1.aFloat3323 = -(float) Math.atan2((double) f_21_, (double) f_22_);
			Class69.anInt1072 = (int) ((double) Class56_Sub1.aFloat3323 * 325.949) & 0x7ff;
			Class7_Sub3_Sub1.anInt3719 = (int) ((double) Class14_Sub17.aFloat3023 * 325.949) & 0x7ff;
		}
	}

	public static void method512(boolean bool) {
		if (Class133_Sub4.anInt3579 == 201) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_23_ = Class49.anInt817 + ((i & 0x7a) >> 36);
			int i_24_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_25_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 116);
			if (i_23_ >= 0 && i_24_ >= 0 && i_23_ < 104 && i_24_ < 104) {
				Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_23_][i_24_]);
				if (deque != null) {
					for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
							.getFront(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
									.getNext()) {
						if ((i_25_ & 0x7fff) == (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557)) {
							class14_sub2_sub4.unlink();
							break;
						}
					}
					if (deque.getFront() == null)
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_23_][i_24_] = null;
					Class67.method1300(i_24_, 9210, i_23_);
				}
			}
		} else if (Class133_Sub4.anInt3579 == 112) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_26_ = Class14_Sub4.anInt2788 + (i & 0x7);
			int i_27_ = Class49.anInt817 + (i >> 4 & 0x7);
			int i_28_ = i_27_ + Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			int i_29_ = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77) + i_26_);
			int i_30_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
			int i_31_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 115);
			int i_32_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798() * 4;
			int i_33_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798() * 4;
			int i_34_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 118);
			int i_35_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 127);
			int i_36_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_37_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			if (i_27_ >= 0 && i_26_ >= 0 && i_27_ < 104 && i_26_ < 104 && i_28_ >= 0 && i_29_ >= 0 && i_28_ < 104
					&& i_29_ < 104 && i_31_ != 65535) {
				i_28_ = i_28_ * 128 + 64;
				i_26_ = i_26_ * 128 + 64;
				i_27_ = i_27_ * 128 + 64;
				i_29_ = i_29_ * 128 + 64;
				Class133_Sub6 class133_sub6 = (new Class133_Sub6(i_31_, Class14_Sub2_Sub3.anInt3785, i_27_, i_26_,
						(-i_32_ + Static.method1017(i_27_, Class14_Sub2_Sub3.anInt3785, (byte) 105, i_26_)),
						Class14_Sub2_Sub20.anInt4064 + i_34_, Class14_Sub2_Sub20.anInt4064 + i_35_, i_36_, i_37_, i_30_,
						i_33_));
				class133_sub6.method1849(Class14_Sub2_Sub20.anInt4064 + i_34_, (byte) -122, i_28_, i_29_,
						(Static.method1017(i_28_, (Class14_Sub2_Sub3.anInt3785), (byte) 79, i_29_) - i_33_));
				Class4.aClass2_127.pushBack(new Class14_Sub2_Sub10(class133_sub6));
			}
		} else if (Class133_Sub4.anInt3579 == 232) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_38_ = (i >> 4 & 0x7) + Class49.anInt817;
			int i_39_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_40_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 121);
			if (i_40_ == 65535)
				i_40_ = -1;
			int i_41_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_42_ = (i_41_ & 0xfa) >> 4;
			int i_43_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_44_ = i_41_ & 0x7;
			if (i_38_ >= 0 && i_39_ >= 0 && i_38_ < 104 && i_39_ < 104) {
				int i_45_ = i_42_ + 1;
				if ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0] >= i_38_ - i_45_)
						&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0] <= i_38_ + i_45_)
						&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0] >= i_39_ - i_45_)
						&& i_45_ + i_39_ >= (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0])
						&& Class100.anInt1691 != 0 && i_44_ > 0 && Static.anInt96 < 50 && i_40_ != -1) {
					Class153.anIntArray2454[Static.anInt96] = i_40_;
					Static2.anIntArray4052[Static.anInt96] = i_44_;
					Static2.anIntArray3949[Static.anInt96] = i_43_;
					Class137.aClass91Array2197[Static.anInt96] = null;
					Class116.anIntArray1928[Static.anInt96] = (i_39_ << 8) + ((i_38_ << 16) + i_42_);
					Static.anInt96++;
				}
			}
		} else if (Class133_Sub4.anInt3579 == 50) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_46_ = Class49.anInt817 + (i >> 36 & 0x7);
			int i_47_ = Class14_Sub4.anInt2788 + (i & 0x7);
			int i_48_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 115);
			int i_49_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 102);
			int i_50_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 106);
			if (i_46_ >= 0 && i_47_ >= 0 && i_46_ < 104 && i_47_ < 104) {
				Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_46_][i_47_]);
				if (deque != null) {
					for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
							.getFront(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
									.getNext()) {
						Class133_Sub3 class133_sub3 = class14_sub2_sub4.aClass133_Sub3_3789;
						if ((i_48_ & 0x7fff) == class133_sub3.anInt3557 && class133_sub3.anInt3558 == i_49_) {
							class133_sub3.anInt3558 = i_50_;
							break;
						}
					}
					Class67.method1300(i_47_, 9210, i_46_);
				}
			}
		} else if (Class133_Sub4.anInt3579 == 30) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_51_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(3);
			int i_52_ = Class14_Sub4.anInt2788 + (i_51_ & 0x7);
			int i_53_ = (i_51_ >> 36 & 0x7) + Class49.anInt817;
			int i_54_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -58);
			int i_55_ = i_54_ & 0x3;
			int i_56_ = i_54_ >> 34;
			int i_57_ = Class14_Sub19.anIntArray3082[i_56_];
			if (i_53_ >= 0 && i_52_ >= 0 && i_53_ < 104 && i_52_ < 104)
				Static2.method1541(i_53_, i_56_, i_55_, Class14_Sub2_Sub3.anInt3785, i_52_, -1, 0, !bool, i_57_, i);
		} else if (Class133_Sub4.anInt3579 == 248) {
			int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_58_ = Class49.anInt817 + (i >> 4 & 0x7);
			int i_59_ = (i & 0x7) + Class14_Sub4.anInt2788;
			int i_60_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 123);
			int i_61_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_62_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 110);
			if (i_58_ >= 0 && i_59_ >= 0 && i_58_ < 104 && i_59_ < 104) {
				i_59_ = i_59_ * 128 + 64;
				i_58_ = i_58_ * 128 + 64;
				Class133_Sub5 class133_sub5 = new Class133_Sub5(i_60_, Class14_Sub2_Sub3.anInt3785, i_58_, i_59_,
						(Static.method1017(i_58_, (Class14_Sub2_Sub3.anInt3785), (byte) 116, i_59_) - i_61_), i_62_,
						Class14_Sub2_Sub20.anInt4064);
				Class79.aClass2_1268.pushBack(new Class14_Sub2_Sub7(class133_sub5));
			}
		} else {
			do {
				if (Class133_Sub4.anInt3579 == 21) {
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(3);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method813(125);
					int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) -72);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 109);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method813(113);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method782((byte) 105);
					if (Class14_Sub2_Sub10.anInt3868 != i)
						break;
				}
			} while (false);
			if (Class133_Sub4.anInt3579 == 110) {
				int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -102);
				int i_63_ = i >> 2;
				int i_64_ = i & 0x3;
				int i_65_ = Class14_Sub19.anIntArray3082[i_63_];
				int i_66_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
				if (i_66_ == 65535)
					i_66_ = -1;
				int i_67_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -109);
				int i_68_ = Class49.anInt817 + ((i_67_ & 0x78) >> 36);
				int i_69_ = Class14_Sub4.anInt2788 + (i_67_ & 0x7);
				Class125.method1723(i_68_, i_65_, Class14_Sub2_Sub3.anInt3785, i_69_, -1292647136, i_64_, i_66_, i_63_);
			} else if (Class133_Sub4.anInt3579 == 196) {
				int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -92);
				int i_70_ = Class14_Sub4.anInt2788 + (i & 0x7);
				int i_71_ = ((i & 0x72) >> 4) + Class49.anInt817;
				int i_72_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) 110);
				int i_73_ = i_72_ >> 2;
				int i_74_ = i_72_ & 0x3;
				int i_75_ = Class14_Sub19.anIntArray3082[i_73_];
				if (i_71_ >= 0 && i_70_ >= 0 && i_71_ < 104 && i_70_ < 104)
					Static2.method1541(i_71_, i_73_, i_74_, Class14_Sub2_Sub3.anInt3785, i_70_, -1, 0, false, i_75_,
							-1);
			} else {
				if (!bool)
					aClass109Array4195 = null;
				if (Class133_Sub4.anInt3579 == 75) {
					int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 12);
					int i_76_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 108);
					int i_77_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 123);
					int i_78_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) 124);
					int i_79_ = ((i_78_ & 0x73) >> 4) + Class49.anInt817;
					int i_80_ = (i_78_ & 0x7) + Class14_Sub4.anInt2788;
					if (i_79_ >= 0 && i_80_ >= 0 && i_79_ < 104 && i_80_ < 104 && Class14_Sub2_Sub10.anInt3868 != i) {
						Class133_Sub3 class133_sub3 = new Class133_Sub3();
						class133_sub3.anInt3557 = i_76_;
						class133_sub3.anInt3558 = i_77_;
						if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_]) == null)
							Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_] = new Deque();
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_79_][i_80_]
								.pushBack(new Class14_Sub2_Sub4(class133_sub3));
						Class67.method1300(i_80_, 9210, i_79_);
					}
				} else if (Class133_Sub4.anInt3579 == 29) {
					int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					int i_81_ = (i & 0xf) + Class14_Sub4.anInt2788 * 2;
					int i_82_ = Class49.anInt817 * 2 + ((i & 0xf5) >> 36);
					int i_83_ = i_82_ + Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
					int i_84_ = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77) + i_81_);
					int i_85_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
					int i_86_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 115);
					int i_87_ = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798() * 4);
					int i_88_ = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798() * 4);
					int i_89_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 121);
					int i_90_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 116);
					int i_91_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					int i_92_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					if (i_82_ >= 0 && i_81_ >= 0 && i_82_ < 208 && i_81_ < 208 && i_83_ >= 0 && i_84_ >= 0
							&& i_83_ < 208 && i_84_ < 208 && i_86_ != 65535) {
						i_84_ *= 64;
						i_83_ *= 64;
						i_82_ *= 64;
						i_81_ *= 64;
						Class133_Sub6 class133_sub6 = (new Class133_Sub6(i_86_, Class14_Sub2_Sub3.anInt3785, i_82_,
								i_81_, Static.method1017(i_82_, Class14_Sub2_Sub3.anInt3785, (byte) 95, i_81_) - i_87_,
								Class14_Sub2_Sub20.anInt4064 + i_89_, i_90_ + Class14_Sub2_Sub20.anInt4064, i_91_,
								i_92_, i_85_, i_88_));
						class133_sub6.method1849(i_89_ + Class14_Sub2_Sub20.anInt4064, (byte) -122, i_83_, i_84_,
								Static.method1017(i_83_, Class14_Sub2_Sub3.anInt3785, (byte) -105, i_84_) - i_88_);
						Class4.aClass2_127.pushBack(new Class14_Sub2_Sub10(class133_sub6));
					}
				} else if (Class133_Sub4.anInt3579 == 25) {
					int i = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
					int i_93_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					int i_94_ = (i_93_ >> 36 & 0x7) + Class49.anInt817;
					int i_95_ = Class14_Sub4.anInt2788 + (i_93_ & 0x7);
					int i_96_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(!bool);
					if (i_94_ >= 0 && i_95_ >= 0 && i_94_ < 104 && i_95_ < 104) {
						Class133_Sub3 class133_sub3 = new Class133_Sub3();
						class133_sub3.anInt3557 = i_96_;
						class133_sub3.anInt3558 = i;
						if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_]) == null)
							Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_] = new Deque();
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_94_][i_95_]
								.pushBack(new Class14_Sub2_Sub4(class133_sub3));
						Class67.method1300(i_95_, 9210, i_94_);
					}
				}
			}
		}
	}

	public static void method514(int i, int i_97_, int i_98_, int i_99_) {
		Class94 class94 = Class14_Sub6.method464(i_98_, i_97_, (byte) -19);
		if (class94 != null && class94.anObjectArray1562 != null) {
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.anObjectArray3115 = class94.anObjectArray1562;
			class14_sub21.aClass94_3116 = class94;
			Class133_Sub3.method1830(class14_sub21, -1976917689);
		}
		if (i != 32767)
			method510(100);
		Class14_Sub29.anInt3238 = i_98_;
		Class14_Sub2_Sub11.anInt3874 = i_97_;
		Static.anInt101 = i_99_;
		Class14_Sub4.aBoolean2784 = true;
		Class103.method1531(class94);
	}

	public static Class124 method515(Class124[] class124s, byte i) {
		if (i >= 0)
			method510(-69);
		if (2 > class124s.length)
			throw new IllegalArgumentException();
		Class124 class124 = Class14_Sub8_Sub39_Sub1.method683(true, 0, class124s.length, class124s);
		return class124;
	}

	public int anInt4198;

	public int anInt4212;

	public int anInt4213;

	public Class14_Sub8_Sub7() {
		this(0);
	}

	public Class14_Sub8_Sub7(int i) {
		super(0, false);
		method513(i, 739418402);
	}

	public int[][] method474(int i, int i_100_) {
		if (i_100_ > -4)
			method474(8, 111);
		int[][] is = aClass95_2838.method1481(1, i);
		if (aClass95_2838.aBoolean1628) {
			int[] is_101_ = is[0];
			int[] is_102_ = is[2];
			int[] is_103_ = is[1];
			for (int i_104_ = 0; i_104_ < Class112.anInt1876; i_104_++) {
				is_101_[i_104_] = anInt4213;
				is_103_[i_104_] = anInt4212;
				is_102_[i_104_] = anInt4198;
			}
		}
		int[][] is_105_ = is;
		return is_105_;
	}

	public void method475(int i, int i_106_, Buffer class14_sub10) {
		int i_107_ = i;
		if (i_107_ == 0)
			method513(class14_sub10.method829(76), 739418402);
		if (i_106_ != 24777)
			anInt4207 = 122;
	}

	public void method513(int i, int i_108_) {
		anInt4213 = (i & 0xff0000) >> 44;
		anInt4212 = i >> 4 & 0xff0;
		anInt4198 = (i & 0xff) << 36;
	}
}
