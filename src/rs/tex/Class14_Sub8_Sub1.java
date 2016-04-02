/* Class14_Sub8_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Random;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;

import rs.Class109;
import rs.Class112;
import rs.Class115;
import rs.Class124;
import rs.Class133_Sub6;
import rs.Class138;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub3;
import rs.Class152;
import rs.Class17;
import rs.Class3;
import rs.Class32;
import rs.Class58;
import rs.Class76;
import rs.Class7_Sub2;
import rs.Class9;
import rs.Class94;
import rs.Class99_Sub2;
import rs.Static2;

public class Class14_Sub8_Sub1 extends Class14_Sub8 {
	public static Class124 aClass124_4100;
	public static Class124 aClass124_4101 = Class14_Sub2_Sub2.method263(1178, "<col=ff9040>");
	public static Class76 aClass76_4098;
	public static int anInt4102;
	public static int[] anIntArray4104 = { 0, 4, 4, 8, 0, 0, 8, 0, 0 };
	static {
		aClass124_4100 = Class14_Sub2_Sub2.method263(1178, "Lade)3)3)3");
	}
	public static Class14_Sub2_Sub19_Sub1 method485(int i, Class9 class9, int i_0_, int i_1_) {
		if (!Class109.method1564(-2, i_1_, i_0_, class9)) {
			Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = null;
			return class14_sub2_sub19_sub1;
		}
		Class14_Sub2_Sub19_Sub1 class14_sub2_sub19_sub1 = Class14_Sub8_Sub30.method641((byte) -120);
		return class14_sub2_sub19_sub1;
	}
	public static void method486(int i) {
		aClass76_4098 = null;
		aClass124_4101 = null;
		aClass124_4100 = null;
		if (i < 61)
			anInt4102 = -22;
		anIntArray4104 = null;
	}
	public static void method487(byte i, int i_3_, Class94 class94, int i_4_) {
		if ((Class14_Sub8_Sub33.anInt4633 == 0 || Class14_Sub8_Sub33.anInt4633 == 3) && class94.method1473(0)) {
			int i_5_ = class94.anIntArray1522[i_3_];
			if (i_5_ <= i_4_ && i_4_ <= i_5_ + class94.anIntArray1614[i_3_]) {
				i_4_ -= class94.anInt1518 / 2;
				i_5_ = Class14_Sub8_Sub19.anInt4408 + Static.anInt696 & 0x7ff;
				i_3_ -= class94.anInt1545 / 2;
				int i_6_ = Class3.sin[i_5_];
				i_6_ = i_6_ * (Class32.anInt551 + 256) >> 8;
				int i_7_ = Class3.cos[i_5_];
				i_7_ = i_7_ * (Class32.anInt551 + 256) >> 40;
				int i_8_ = i_6_ * i_3_ + i_4_ * i_7_ >> 43;
				int i_9_ = i_3_ * i_7_ - i_4_ * i_6_ >> 43;
				int i_10_ = (i_8_ + Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 39);
				int i_11_ = (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 - i_9_ >> 39);
				if (Class152.anInt2439 > 0 && Class14_Sub8_Sub29.aBooleanArray4581[82]
						&& Class14_Sub8_Sub29.aBooleanArray4581[81])
					Class7_Sub2.method125(Class133_Sub6.anInt3676 + i_10_, i_11_ + Class58.anInt947, 63,
							Class14_Sub2_Sub3.anInt3785);
				else {
					boolean bool = (Class14_Sub8_Sub35.method663(
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]), 0, 0, 0, (byte) 109,
							(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]), true, 0, i_10_, 1, 0, i_11_));
					if (bool) {
						Static.aClass14_Sub10_Sub1_891.method809(i_4_);
						Static.aClass14_Sub10_Sub1_891.method809(i_3_);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 124, Class14_Sub8_Sub19.anInt4408);
						Static.aClass14_Sub10_Sub1_891.method809(57);
						Static.aClass14_Sub10_Sub1_891.method809(Static.anInt696);
						Static.aClass14_Sub10_Sub1_891.method809(Class32.anInt551);
						Static.aClass14_Sub10_Sub1_891.method809(89);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 126,
								Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495);
						Static.aClass14_Sub10_Sub1_891.method833((byte) 87,
								Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436);
						Static.aClass14_Sub10_Sub1_891.method809(Static2.anInt2911);
						Static.aClass14_Sub10_Sub1_891.method809(63);
					}
				}
				if (i < 88)
					method487((byte) -95, -34, null, 123);
			}
		}
	}
	public int anInt4092;

	public int anInt4095 = 2000;

	public int anInt4097;

	public int anInt4103 = 0;

	public int anInt4106;

	public Class14_Sub8_Sub1() {
		super(0, true);
		anInt4092 = 4096;
		anInt4106 = 0;
		anInt4097 = 16;
	}

	public void method472() {
		Class14_Sub2_Sub12.method321(256);
	}

	public void method475(int i, int i_12_, Buffer class14_sub10) {
		int i_13_ = i;
		while_200_: do {
			while_199_: do {
				while_198_: do {
					do {
						if (i_13_ != 0) {
							if (i_13_ != 1) {
								if (i_13_ != 2) {
									if (i_13_ != 3) {
										if (i_13_ == 4)
											break while_199_;
										break while_200_;
									}
								} else
									break;
								break while_198_;
							}
						} else {
							anInt4106 = class14_sub10.method798();
							break while_200_;
						}
						anInt4095 = class14_sub10.method784((byte) 118);
						break while_200_;
					} while (false);
					anInt4097 = class14_sub10.method798();
					break while_200_;
				} while (false);
				anInt4103 = class14_sub10.method784((byte) 121);
				break while_200_;
			} while (false);
			anInt4092 = class14_sub10.method784((byte) 109);
		} while (false);
		if (i_12_ != 24777)
			anIntArray4104 = null;
	}

	public int[] method484(int i, byte i_14_) {
		if (i_14_ > -58)
			method475(73, -26, null);
		int[] is = aClass149_2851.method2014(i, (byte) 110);
		if (aClass149_2851.aBoolean2402) {
			int i_15_ = anInt4092 >> 1;
			int[][] is_16_ = aClass149_2851.method2019(true);
			Random random = new Random((long) anInt4106);
			for (int i_17_ = 0; i_17_ < anInt4095; i_17_++) {
				int i_18_ = (anInt4092 > 0 ? (anInt4103 - i_15_ + Class138.method1949(random, anInt4092))
						: anInt4103);
				int i_19_ = Class138.method1949(random, Class112.anInt1876);
				i_18_ = i_18_ >> 4 & 0xff;
				int i_20_ = Class138.method1949(random, Class17.anInt407);
				int i_21_ = i_19_ + (anInt4097 * Class99_Sub2.anIntArray3357[i_18_] >> 12);
				int i_22_ = ((Class14_Sub8_Sub21.anIntArray4435[i_18_] * anInt4097 >> 12) + i_20_);
				int i_23_ = -i_20_ + i_22_;
				int i_24_ = i_21_ - i_19_;
				if (i_24_ != 0 || i_23_ != 0) {
					if (i_24_ < 0)
						i_24_ = -i_24_;
					if (i_23_ < 0)
						i_23_ = -i_23_;
					boolean bool = i_23_ > i_24_;
					if (bool) {
						int i_25_ = i_19_;
						i_19_ = i_20_;
						i_20_ = i_25_;
						int i_26_ = i_21_;
						i_21_ = i_22_;
						i_22_ = i_26_;
					}
					if (i_21_ < i_19_) {
						int i_27_ = i_19_;
						i_19_ = i_21_;
						i_21_ = i_27_;
						int i_28_ = i_20_;
						i_20_ = i_22_;
						i_22_ = i_28_;
					}
					int i_29_ = i_20_;
					int i_30_ = -i_19_ + i_21_;
					int i_31_ = i_22_ - i_20_;
					int i_32_ = (-(Class138.method1949(random, 4096) >> 2) + 1024);
					int i_33_ = i_22_ > i_20_ ? 1 : -1;
					int i_34_ = -i_30_ / 2;
					int i_35_ = 2048 / i_30_;
					if (i_31_ < 0)
						i_31_ = -i_31_;
					for (int i_36_ = i_19_; i_21_ > i_36_; i_36_++) {
						i_34_ += i_31_;
						int i_37_ = Static2.anInt4882 & i_36_;
						int i_38_ = i_32_ + ((-i_19_ + i_36_) * i_35_ + 1024);
						int i_39_ = Class115.anInt1927 & i_29_;
						if (!bool)
							is_16_[i_37_][i_39_] = i_38_;
						else
							is_16_[i_39_][i_37_] = i_38_;
						if (i_34_ > 0) {
							i_34_ = -i_30_ + i_34_;
							i_29_ += i_33_;
						}
					}
				}
			}
		}
		int[] is_40_ = is;
		return is_40_;
	}
}
