/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Deque;
import com.jagex.link.Cache;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class25;

public class Class35 {
	public int anInt587 = 0;
	public static Class124 aClass124_588 = Class14_Sub2_Sub2.method263(1178, " <col=00ff80>");
	public static Deque aClass2_589;
	public static boolean aBoolean593;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array596;
	public static Class124 aClass124_597 = Class14_Sub2_Sub2.method263(1178, "zap");
	public static Class124 aClass124_598 = Class14_Sub2_Sub2.method263(1178, "Benutzen");
	public static Cache aClass20_599;
	public static float aFloat600;
	public static Class124 aClass124_601;
	public static int anInt602;
	public static int anInt603;

	static {
		aClass2_589 = new Deque();
		aClass20_599 = new Cache(64);
		aClass124_601 = Class14_Sub2_Sub2.method263(1178, "m");
		anInt602 = -1;
	}

	public static void method1092(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i - 334;
		if (i_4_ < 0)
			i_4_ = 0;
		else if (i_4_ > 100)
			i_4_ = 100;
		int i_5_ = (((-JunkTex.aShort2540 + JunkTex.aShort4568) * i_4_ / 100) + JunkTex.aShort2540);
		int i_6_ = -85 % ((-48 - i_2_) / 41);
		if (Class14_Sub2_Sub8.aShort3839 <= i_5_) {
			if (Applet_Sub1.aShort22 < i_5_)
				i_5_ = Applet_Sub1.aShort22;
		} else
			i_5_ = Class14_Sub2_Sub8.aShort3839;
		int i_7_ = i * i_5_ * 512 / (i_0_ * 334);
		if (i_7_ >= Class125.aShort2076) {
			if (i_7_ > Class96.aShort1633) {
				i_7_ = Class96.aShort1633;
				i_5_ = i_0_ * i_7_ * 334 / (i * 512);
				if (i_5_ < Class14_Sub2_Sub8.aShort3839) {
					i_5_ = Class14_Sub2_Sub8.aShort3839;
					int i_8_ = i_7_ * i_0_ * 334 / (i_5_ * 512);
					int i_9_ = (-i_8_ + i) / 2;
					if (bool) {
						Class25.method994();
						Class25.method1004(i_1_, i_3_, i_0_, i_9_, 0);
						Class25.method1004(i_1_, i_3_ + (i - i_9_), i_0_, i_9_, 0);
					}
					i_3_ += i_9_;
					i -= i_9_ * 2;
				}
			}
		} else {
			i_7_ = Class125.aShort2076;
			i_5_ = i_7_ * 334 * i_0_ / (i * 512);
			if (Applet_Sub1.aShort22 < i_5_) {
				i_5_ = Applet_Sub1.aShort22;
				int i_10_ = i_5_ * (i * 512) / (i_7_ * 334);
				int i_11_ = (-i_10_ + i_0_) / 2;
				if (bool) {
					Class25.method994();
					Class25.method1004(i_1_, i_3_, i_11_, i, 0);
					Class25.method1004(i_0_ + (i_1_ - i_11_), i_3_, i_11_, i, 0);
				}
				i_0_ -= i_11_ * 2;
				i_1_ += i_11_;
			}
		}
		JunkTex.anInt4251 = i * i_5_ / 334;
		JunkTex.anInt3952 = (short) i_0_;
		Static2.anInt4031 = i_3_;
		Class14_Sub19.anInt3071 = i_1_;
		JunkTex.anInt4135 = (short) i;
	}

	public static void method1093(int i) {
		int i_12_ = -42 / ((i + 28) / 33);
		AtmosphericEffects.loadDefaults();
		AtmosphericEffects.loadLightPositions();
	}

	public void method1094(byte i, Buffer class14_sub10) {
		for (;;) {
			int i_13_ = class14_sub10.readUByte();
			if (i_13_ == 0)
				break;
			method1096(class14_sub10, i_13_, -14431);
		}
		if (i != 102)
			aClass124_601 = null;
	}

	public static void method1095(int i) {
		if (i != -572)
			method1097((byte) -44);
		aClass20_599 = null;
		aClass124_601 = null;
		aClass14_Sub2_Sub19Array596 = null;
		aClass124_598 = null;
		aClass2_589 = null;
		aClass124_597 = null;
		aClass124_588 = null;
	}

	public void method1096(Buffer class14_sub10, int i, int i_14_) {
		if (i == 5)
			anInt587 = class14_sub10.readUShort((byte) 123);
		if (i_14_ != -14431)
			anInt602 = -105;
	}

	public static void method1097(byte i) {
		while_17_: do {
			if (Class14_Sub2_Sub8.method296((byte) 75) == 2) {
				byte i_15_ = (byte) (Class42.anInt699 - 4 & 0xff);
				int i_16_ = Class42.anInt699 % 104;
				for (int i_17_ = 0; i_17_ < 4; i_17_++) {
					for (int i_18_ = 0; i_18_ < 104; i_18_++)
						Class28.aByteArrayArrayArray512[i_17_][i_16_][i_18_] = i_15_;
				}
				if (Class14_Sub2_Sub3.anInt3785 != 3) {
					for (int i_19_ = 0; i_19_ < 2; i_19_++) {
						Class14_Sub2_Sub11.anIntArray3872[i_19_] = -1000000;
						JunkTex.anIntArray4422[i_19_] = 1000000;
						Class14_Sub19.anIntArray3079[i_19_] = 0;
						Class96.anIntArray1630[i_19_] = 1000000;
						Class120.anIntArray2008[i_19_] = 0;
					}
					int i_20_ = -21 / ((i - 73) / 40);
					if (Class89.anInt1415 != 1) {
						i_16_ = JunkTex.method1017(JunkTex.anInt4741, Class14_Sub2_Sub3.anInt3785,
								(byte) -119, Class14_Sub30.anInt3271);
						if (-Static2.anInt2926 + i_16_ < 800
								&& ((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][JunkTex.anInt4741 >> 7][Class14_Sub30.anInt3271 >> 39])
										& 0x4) != 0)
							Static2.method1498(false, Class14_Sub30.anInt3271 >> 7, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
									JunkTex.anInt4741 >> 7,
									1);
					} else {
						if (((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 39)][(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 39)])
								& 0x4) != 0)
							Static2.method1498(false, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) >> 39,
									(Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
									(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) >> 39,
									0);
						if (Class7_Sub3_Sub1.anInt3719 < 310) {
							i_16_ = JunkTex.anInt4741 >> 39;
							i_20_ = Class14_Sub30.anInt3271 >> 39;
							int i_21_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436) >> 39);
							int i_22_;
							if (i_20_ >= i_21_)
								i_22_ = i_20_ - i_21_;
							else
								i_22_ = -i_20_ + i_21_;
							int i_23_ = ((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495) >> 39);
							int i_24_;
							if (i_23_ > i_16_)
								i_24_ = i_23_ - i_16_;
							else
								i_24_ = -i_23_ + i_16_;
							if (i_24_ > i_22_) {
								int i_25_ = i_22_ * 65536 / i_24_;
								int i_26_ = 32768;
								for (;;) {
									if (i_23_ == i_16_)
										break while_17_;
									if (i_16_ >= i_23_) {
										if (i_23_ < i_16_)
											i_16_--;
									} else
										i_16_++;
									if (((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][i_16_][i_20_])
											& 0x4) != 0) {
										Static2.method1498(false, i_20_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
												i_16_, 1);
										break while_17_;
									}
									i_26_ += i_25_;
									if (i_26_ >= 65536) {
										i_26_ -= 65536;
										if (i_20_ >= i_21_) {
											if (i_21_ < i_20_)
												i_20_--;
										} else
											i_20_++;
										if (((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][i_16_][i_20_])
												& 0x4) != 0)
											break;
									}
								}
								Static2.method1498(false, i_20_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
										i_16_, 1);
							} else {
								int i_27_ = i_24_ * 65536 / i_22_;
								int i_28_ = 32768;
								for (;;) {
									if (i_21_ == i_20_)
										break while_17_;
									if (i_21_ > i_20_)
										i_20_++;
									else if (i_20_ > i_21_)
										i_20_--;
									if (((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][i_16_][i_20_])
											& 0x4) != 0) {
										Static2.method1498(false, i_20_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
												i_16_, 1);
										break while_17_;
									}
									i_28_ += i_27_;
									if (i_28_ >= 65536) {
										if (i_23_ > i_16_)
											i_16_++;
										else if (i_16_ > i_23_)
											i_16_--;
										i_28_ -= 65536;
										if (((JunkTex.tileFlags[Class14_Sub2_Sub3.anInt3785][i_16_][i_20_])
												& 0x4) != 0)
											break;
									}
								}
								Static2.method1498(false, i_20_, (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368),
										i_16_, 1);
							}
						}
					}
				}
			}
		} while (false);
	}
}
