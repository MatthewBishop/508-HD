/* Class14_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.link.Deque;
import com.jagex.link.Linkable;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.lights.LightManager;

public class Class14_Sub4 extends Linkable {
	public int anInt2776;
	public int anInt2777;
	public int anInt2778;
	public int anInt2779;
	public static int anInt2782;
	public static boolean aBoolean2784;
	public static Class133_Sub1_Sub2[] aClass133_Sub1_Sub2Array2785;
	public static int[] anIntArray2786 = new int[32];
	public static Deque aClass2_2787;
	public static int anInt2788;
	public static int anInt2789;
	public static volatile int anInt2790;

	static {
		anInt2782 = 0;
		aBoolean2784 = false;
		aClass133_Sub1_Sub2Array2785 = new Class133_Sub1_Sub2[32768];
		anInt2790 = 0;
		anInt2789 = 0;
		aClass2_2787 = new Deque();
	}

	public static void method454(Class14_Sub29 class14_sub29, boolean bool) {
		JunkTex.aClass2_4477.pushBack(class14_sub29);
		for (;;) {
			Class14_Sub29 class14_sub29_0_ = ((Class14_Sub29) JunkTex.aClass2_4477.popFront());
			if (class14_sub29_0_ == null)
				break;
			if (class14_sub29_0_.aBoolean3240) {
				int i = class14_sub29_0_.anInt3258;
				int i_1_ = class14_sub29_0_.anInt3239;
				int i_2_ = class14_sub29_0_.anInt3243;
				int i_3_ = class14_sub29_0_.anInt3261;
				Class14_Sub29[][] class14_sub29s = JunkTex.aClass14_Sub29ArrayArrayArray3368[i_2_];
				float f = 0.0F;
				if (Class150.anIntArrayArrayArray2419 == Class114.tileHeights) {
					int i_4_ = JunkTex.anIntArrayArray2799[i][i_1_];
					int i_5_ = i_4_ & 0xffffff;
					if (i_5_ != Class7_Sub1.anInt2653) {
						Class7_Sub1.anInt2653 = i_5_;
						RT4.method1304(i_5_);
						AtmosphericEffects.setFogColour(RT4.method1590(false));
					}
					int i_6_ = i_4_ >>> 24 << 3;
					if (i_6_ != JunkTex.anInt4675) {
						JunkTex.anInt4675 = i_6_;
						RT4.method1549(i_6_, 3);
					}
					int i_7_ = ((JunkTex.anIntArrayArrayArray2391[0][i][i_1_]
							+ JunkTex.anIntArrayArrayArray2391[0][i + 1][i_1_]
							+ JunkTex.anIntArrayArrayArray2391[0][i][i_1_ + 1]
							+ (JunkTex.anIntArrayArrayArray2391[0][i + 1][i_1_ + 1])) >> 2);
					RT4.method1778(3, -i_7_);
					f = 201.5F;
					RT4GL.method1640(f);
				} else {
					f = 201.5F - (float) (i_3_ + 1) * 50.0F;
					RT4GL.method1640(f);
				}
				if (class14_sub29_0_.aBoolean3235) {
					if (bool) {
						if (i_2_ > 0) {
							Class14_Sub29 class14_sub29_8_ = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i_2_
									- 1][i][i_1_]);
							if (class14_sub29_8_ != null && class14_sub29_8_.aBoolean3240)
								continue;
						}
						if (i <= Static2.cameraTileX && i > Class7_Sub1.anInt2659) {
							Class14_Sub29 class14_sub29_9_ = class14_sub29s[i - 1][i_1_];
							if (class14_sub29_9_ != null && class14_sub29_9_.aBoolean3240
									&& (class14_sub29_9_.aBoolean3235 || ((class14_sub29_0_.anInt3249 & 0x1) == 0)))
								continue;
						}
						if (i >= Static2.cameraTileX && i < JunkTex.anInt4722 - 1) {
							Class14_Sub29 class14_sub29_10_ = class14_sub29s[i + 1][i_1_];
							if (class14_sub29_10_ != null && class14_sub29_10_.aBoolean3240
									&& (class14_sub29_10_.aBoolean3235 || ((class14_sub29_0_.anInt3249 & 0x4) == 0)))
								continue;
						}
						if (i_1_ <= Class102.cameraTileZ && i_1_ > Class14_Sub9_Sub3.anInt4849) {
							Class14_Sub29 class14_sub29_11_ = class14_sub29s[i][i_1_ - 1];
							if (class14_sub29_11_ != null && class14_sub29_11_.aBoolean3240
									&& (class14_sub29_11_.aBoolean3235 || ((class14_sub29_0_.anInt3249 & 0x8) == 0)))
								continue;
						}
						if (i_1_ >= Class102.cameraTileZ && i_1_ < JunkTex.anInt4526 - 1) {
							Class14_Sub29 class14_sub29_12_ = class14_sub29s[i][i_1_ + 1];
							if (class14_sub29_12_ != null && class14_sub29_12_.aBoolean3240
									&& (class14_sub29_12_.aBoolean3235 || ((class14_sub29_0_.anInt3249 & 0x2) == 0)))
								continue;
						}
					} else
						bool = true;
					class14_sub29_0_.aBoolean3235 = false;
					if (class14_sub29_0_.aClass14_Sub29_3260 != null) {
						Class14_Sub29 class14_sub29_13_ = class14_sub29_0_.aClass14_Sub29_3260;
						RT4GL.method1640(201.5F - (float) ((class14_sub29_13_.anInt3261) + 1) * 50.0F);
						if (class14_sub29_13_.aClass153_3248 != null) {
							if (!Scenegraph.method1529(0, i, i_1_))
								Class14_Sub30.method940((class14_sub29_13_.aClass153_3248), 0, Class150.anInt2420,
										(Class7_Sub3_Sub1.anInt3718), JunkTex.anInt2719, Class37.anInt643, i, i_1_,
										false);
							else
								Class14_Sub30.method940((class14_sub29_13_.aClass153_3248), 0, Class150.anInt2420,
										(Class7_Sub3_Sub1.anInt3718), JunkTex.anInt2719, Class37.anInt643, i, i_1_,
										true);
						} else if (class14_sub29_13_.aClass6_3233 != null) {
							if (!Scenegraph.method1529(0, i, i_1_))
								Class12.method210((class14_sub29_13_.aClass6_3233), Class150.anInt2420,
										Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
										false);
							else
								Class12.method210((class14_sub29_13_.aClass6_3233), Class150.anInt2420,
										Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
										true);
						}
						Class113 class113 = class14_sub29_13_.aClass113_3250;
						if (class113 != null) {
							if ((class113.anInt1880 & class14_sub29_0_.anInt3236) != 0)
								LightManager.method192(class113.anInt1880, Class4.anInt125, Static2.anInt2741,
										Class14_Sub2_Sub8.anInt3853, i_3_, i, i_1_);
							else
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
							class113.aClass133_1877.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
									class113.anInt1882 - Static2.anInt2741,
									(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
						}
						for (int i_14_ = 0; i_14_ < class14_sub29_13_.anInt3242; i_14_++) {
							Class40 class40 = class14_sub29_13_.aClass40Array3257[i_14_];
							if (class40 != null) {
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
								class40.aClass133_679.method1792(class40.anInt663, Class150.anInt2420,
										Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643,
										class40.anInt667 - Class4.anInt125, class40.anInt671 - Static2.anInt2741,
										(class40.anInt666 - Class14_Sub2_Sub8.anInt3853), class40.aLong677);
							}
						}
						RT4GL.method1640(f);
					}
					boolean bool_15_ = false;
					if (class14_sub29_0_.aClass153_3248 != null) {
						if (!Scenegraph.method1529(i_3_, i, i_1_)) {
							bool_15_ = true;
							if ((class14_sub29_0_.aClass153_3248.anInt2443 != 12345678)
									|| (Class142.aBoolean2299 && i_2_ <= Class86.anInt1389))
								Class14_Sub30.method940(class14_sub29_0_.aClass153_3248, i_3_, Class150.anInt2420,
										Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
										false);
						} else
							Class14_Sub30.method940((class14_sub29_0_.aClass153_3248), i_3_, Class150.anInt2420,
									Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
									true);
					} else if (class14_sub29_0_.aClass6_3233 != null) {
						if (!Scenegraph.method1529(i_3_, i, i_1_)) {
							bool_15_ = true;
							Class12.method210(class14_sub29_0_.aClass6_3233, Class150.anInt2420,
									Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
									false);
						} else
							Class12.method210(class14_sub29_0_.aClass6_3233, Class150.anInt2420,
									Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643, i, i_1_,
									true);
					}
					if (bool_15_) {
						Class4 class4 = class14_sub29_0_.aClass4_3237;
						if (class4 != null && (class4.aLong132 & 0x80000000L) != 0L) {
							if (class4.aBoolean133)
								RT4GL.method1640(f + 50.0F - 1.5F);
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							class4.aClass133_124.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class4.anInt136 - Class4.anInt125,
									class4.anInt121 - Static2.anInt2741, class4.anInt122 - Class14_Sub2_Sub8.anInt3853,
									class4.aLong132);
							if (class4.aBoolean133)
								RT4GL.method1640(f);
						}
					}
					int i_16_ = 0;
					int i_17_ = 0;
					Class113 class113 = class14_sub29_0_.aClass113_3250;
					Class37 class37 = class14_sub29_0_.aClass37_3255;
					if (class113 != null || class37 != null) {
						if (Static2.cameraTileX == i)
							i_16_++;
						else if (Static2.cameraTileX < i)
							i_16_ += 2;
						if (Class102.cameraTileZ == i_1_)
							i_16_ += 3;
						else if (Class102.cameraTileZ > i_1_)
							i_16_ += 6;
						i_17_ = JunkTex.anIntArray3117[i_16_];
						class14_sub29_0_.anInt3236 = JunkTex.anIntArray4618[i_16_];
					}
					if (class113 != null) {
						if ((class113.anInt1880 & Class14_Sub2_Sub8.anIntArray3834[i_16_]) != 0) {
							if (class113.anInt1880 == 16) {
								class14_sub29_0_.anInt3231 = 3;
								class14_sub29_0_.anInt3252 = JunkTex.anIntArray2081[i_16_];
								class14_sub29_0_.anInt3234 = 3 - class14_sub29_0_.anInt3252;
							} else if (class113.anInt1880 == 32) {
								class14_sub29_0_.anInt3231 = 6;
								class14_sub29_0_.anInt3252 = Class14_Sub2_Sub21.anIntArray4077[i_16_];
								class14_sub29_0_.anInt3234 = 6 - class14_sub29_0_.anInt3252;
							} else if (class113.anInt1880 == 64) {
								class14_sub29_0_.anInt3231 = 12;
								class14_sub29_0_.anInt3252 = JunkTex.anIntArray4104[i_16_];
								class14_sub29_0_.anInt3234 = 12 - class14_sub29_0_.anInt3252;
							} else {
								class14_sub29_0_.anInt3231 = 9;
								class14_sub29_0_.anInt3252 = Canvas_Sub2.anIntArray65[i_16_];
								class14_sub29_0_.anInt3234 = 9 - class14_sub29_0_.anInt3252;
							}
						} else
							class14_sub29_0_.anInt3231 = 0;
						if ((class113.anInt1880 & i_17_) != 0
								&& !Scenegraph.method1530(i_3_, i, i_1_, class113.anInt1880)) {
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							class113.aClass133_1877.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
									class113.anInt1882 - Static2.anInt2741,
									(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
						}
						if ((class113.anInt1888 & i_17_) != 0
								&& !Scenegraph.method1530(i_3_, i, i_1_, class113.anInt1888)) {
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							class113.aClass133_1884.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
									class113.anInt1882 - Static2.anInt2741,
									(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
						}
					}
					if (class37 != null && !Scenegraph.method1478(i_3_, i, i_1_, class37.aClass133_642.method1781())) {
						RT4GL.method1640(f - 0.5F);
						if ((class37.anInt649 & i_17_) != 0) {
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							class37.aClass133_642.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643,
									(class37.anInt653 - Class4.anInt125 + class37.anInt641),
									class37.anInt650 - Static2.anInt2741,
									(class37.anInt633 - Class14_Sub2_Sub8.anInt3853 + class37.anInt646),
									class37.aLong634);
						} else if (class37.anInt649 == 256) {
							int i_18_ = class37.anInt653 - Class4.anInt125;
							int i_19_ = class37.anInt650 - Static2.anInt2741;
							int i_20_ = (class37.anInt633 - Class14_Sub2_Sub8.anInt3853);
							int i_21_ = class37.anInt647;
							int i_22_;
							if (i_21_ == 1 || i_21_ == 2)
								i_22_ = -i_18_;
							else
								i_22_ = i_18_;
							int i_23_;
							if (i_21_ == 2 || i_21_ == 3)
								i_23_ = -i_20_;
							else
								i_23_ = i_20_;
							if (i_23_ < i_22_) {
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
								class37.aClass133_642.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, i_18_ + class37.anInt641, i_19_,
										i_20_ + class37.anInt646, class37.aLong634);
							} else if (class37.aClass133_638 != null) {
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
								class37.aClass133_638.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, i_18_, i_19_, i_20_,
										class37.aLong634);
							}
						}
						RT4GL.method1640(f);
					}
					if (bool_15_) {
						Class4 class4 = class14_sub29_0_.aClass4_3237;
						if (class4 != null && (class4.aLong132 & 0x80000000L) == 0L) {
							if (class4.aBoolean133)
								RT4GL.method1640(f + 50.0F - 1.5F);
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							class4.aClass133_124.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class4.anInt136 - Class4.anInt125,
									class4.anInt121 - Static2.anInt2741, class4.anInt122 - Class14_Sub2_Sub8.anInt3853,
									class4.aLong132);
							if (class4.aBoolean133)
								RT4GL.method1640(f);
						}
						Class115 class115 = class14_sub29_0_.aClass115_3256;
						if (class115 != null && class115.anInt1914 == 0) {
							LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
									i_1_);
							if (class115.aClass133_1926 != null)
								class115.aClass133_1926.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
										class115.anInt1911 - Static2.anInt2741,
										(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
							if (class115.aClass133_1921 != null)
								class115.aClass133_1921.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
										class115.anInt1911 - Static2.anInt2741,
										(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
							if (class115.aClass133_1919 != null)
								class115.aClass133_1919.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
										class115.anInt1911 - Static2.anInt2741,
										(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
						}
					}
					int i_24_ = class14_sub29_0_.anInt3249;
					if (i_24_ != 0) {
						if (i < Static2.cameraTileX && (i_24_ & 0x4) != 0) {
							Class14_Sub29 class14_sub29_25_ = class14_sub29s[i + 1][i_1_];
							if (class14_sub29_25_ != null && class14_sub29_25_.aBoolean3240)
								JunkTex.aClass2_4477.pushBack(class14_sub29_25_);
						}
						if (i_1_ < Class102.cameraTileZ && (i_24_ & 0x2) != 0) {
							Class14_Sub29 class14_sub29_26_ = class14_sub29s[i][i_1_ + 1];
							if (class14_sub29_26_ != null && class14_sub29_26_.aBoolean3240)
								JunkTex.aClass2_4477.pushBack(class14_sub29_26_);
						}
						if (i > Static2.cameraTileX && (i_24_ & 0x1) != 0) {
							Class14_Sub29 class14_sub29_27_ = class14_sub29s[i - 1][i_1_];
							if (class14_sub29_27_ != null && class14_sub29_27_.aBoolean3240)
								JunkTex.aClass2_4477.pushBack(class14_sub29_27_);
						}
						if (i_1_ > Class102.cameraTileZ && (i_24_ & 0x8) != 0) {
							Class14_Sub29 class14_sub29_28_ = class14_sub29s[i][i_1_ - 1];
							if (class14_sub29_28_ != null && class14_sub29_28_.aBoolean3240)
								JunkTex.aClass2_4477.pushBack(class14_sub29_28_);
						}
					}
				}
				if (class14_sub29_0_.anInt3231 != 0) {
					boolean bool_29_ = true;
					for (int i_30_ = 0; i_30_ < class14_sub29_0_.anInt3242; i_30_++) {
						if ((class14_sub29_0_.aClass40Array3257[i_30_].anInt662 != Class67.anInt1059)
								&& ((class14_sub29_0_.anIntArray3247[i_30_]
										& class14_sub29_0_.anInt3231) == class14_sub29_0_.anInt3252)) {
							bool_29_ = false;
							break;
						}
					}
					if (bool_29_) {
						Class113 class113 = class14_sub29_0_.aClass113_3250;
						if (!Scenegraph.method1530(i_3_, i, i_1_, class113.anInt1880)) {
							do {
								if ((class113.aLong1887 & 0xfc000L) == 16384L) {
									int i_31_ = class113.anInt1878 - Class4.anInt125;
									int i_32_ = (class113.anInt1886 - Class14_Sub2_Sub8.anInt3853);
									int i_33_ = (int) (class113.aLong1887 >> 20 & 0x3L);
									if (i_33_ == 0) {
										i_31_ -= 64;
										i_32_ += 64;
										if (i_32_ < i_31_ && i > 0 && i_1_ < (JunkTex.anInt4337) - 1) {
											LightManager.method187(Class4.anInt125, Static2.anInt2741,
													Class14_Sub2_Sub8.anInt3853, i_2_, i - 1, i_1_ + 1);
											break;
										}
									} else if (i_33_ == 1) {
										i_31_ += 64;
										i_32_ += 64;
										if (i_32_ < -i_31_ && i < Static2.anInt3338 - 1
												&& i_1_ < (JunkTex.anInt4337) - 1) {
											LightManager.method187(Class4.anInt125, Static2.anInt2741,
													Class14_Sub2_Sub8.anInt3853, i_2_, i + 1, i_1_ + 1);
											break;
										}
									} else if (i_33_ == 2) {
										i_31_ += 64;
										i_32_ -= 64;
										if (i_32_ > i_31_ && i < Static2.anInt3338 - 1 && i_1_ > 0) {
											LightManager.method187(Class4.anInt125, Static2.anInt2741,
													Class14_Sub2_Sub8.anInt3853, i_2_, i + 1, i_1_ - 1);
											break;
										}
									} else if (i_33_ == 3) {
										i_31_ -= 64;
										i_32_ -= 64;
										if (i_32_ > -i_31_ && i > 0 && i_1_ > 0) {
											LightManager.method187(Class4.anInt125, Static2.anInt2741,
													Class14_Sub2_Sub8.anInt3853, i_2_, i - 1, i_1_ - 1);
											break;
										}
									}
								}
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
							} while (false);
							class113.aClass133_1877.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
									class113.anInt1882 - Static2.anInt2741,
									(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
						}
						class14_sub29_0_.anInt3231 = 0;
					}
				}
				if (class14_sub29_0_.aBoolean3251) {
					try {
						int i_34_ = class14_sub29_0_.anInt3242;
						class14_sub29_0_.aBoolean3251 = false;
						int i_35_ = 0;
						while_53_: for (int i_36_ = 0; i_36_ < i_34_; i_36_++) {
							Class40 class40 = class14_sub29_0_.aClass40Array3257[i_36_];
							if (class40.anInt662 != Class67.anInt1059) {
								for (int i_37_ = class40.anInt668; i_37_ <= class40.anInt670; i_37_++) {
									for (int i_38_ = class40.anInt678; i_38_ <= class40.anInt669; i_38_++) {
										Class14_Sub29 class14_sub29_39_ = class14_sub29s[i_37_][i_38_];
										if (class14_sub29_39_.aBoolean3235) {
											class14_sub29_0_.aBoolean3251 = true;
											continue while_53_;
										}
										if (class14_sub29_39_.anInt3231 != 0) {
											int i_40_ = 0;
											if (i_37_ > class40.anInt668)
												i_40_++;
											if (i_37_ < class40.anInt670)
												i_40_ += 4;
											if (i_38_ > class40.anInt678)
												i_40_ += 8;
											if (i_38_ < class40.anInt669)
												i_40_ += 2;
											if ((i_40_ & class14_sub29_39_.anInt3231) == (class14_sub29_0_.anInt3234)) {
												class14_sub29_0_.aBoolean3251 = true;
												continue while_53_;
											}
										}
									}
								}
								JunkTex.aClass40Array4143[i_35_++] = class40;
								int i_41_ = Static2.cameraTileX - class40.anInt668;
								int i_42_ = class40.anInt670 - Static2.cameraTileX;
								if (i_42_ > i_41_)
									i_41_ = i_42_;
								int i_43_ = Class102.cameraTileZ - class40.anInt678;
								int i_44_ = class40.anInt669 - Class102.cameraTileZ;
								if (i_44_ > i_43_)
									class40.anInt673 = i_41_ + i_44_;
								else
									class40.anInt673 = i_41_ + i_43_;
							}
						}
						while (i_35_ > 0) {
							int i_45_ = -50;
							int i_46_ = -1;
							for (int i_47_ = 0; i_47_ < i_35_; i_47_++) {
								Class40 class40 = (JunkTex.aClass40Array4143[i_47_]);
								if (class40.anInt662 != Class67.anInt1059) {
									if (class40.anInt673 > i_45_) {
										i_45_ = class40.anInt673;
										i_46_ = i_47_;
									} else if (class40.anInt673 == i_45_) {
										int i_48_ = (class40.anInt667 - Class4.anInt125);
										int i_49_ = (class40.anInt666 - Class14_Sub2_Sub8.anInt3853);
										int i_50_ = ((JunkTex.aClass40Array4143[i_46_].anInt667)
												- Class4.anInt125);
										int i_51_ = ((JunkTex.aClass40Array4143[i_46_].anInt666)
												- Class14_Sub2_Sub8.anInt3853);
										if (i_48_ * i_48_ + i_49_ * i_49_ > i_50_ * i_50_ + i_51_ * i_51_)
											i_46_ = i_47_;
									}
								}
							}
							if (i_46_ == -1)
								break;
							Class40 class40 = JunkTex.aClass40Array4143[i_46_];
							class40.anInt662 = Class67.anInt1059;
							if (!JunkTex.method619(i_3_, class40.anInt668, class40.anInt670,
									class40.anInt678, class40.anInt669, class40.aClass133_679.method1781())) {
								if ((class40.aLong677 & 0xfc000L) == 147456L) {
									LightManager.method187(Class4.anInt125, Static2.anInt2741, (Class14_Sub2_Sub8.anInt3853),
											i_2_, i, i_1_);
									int i_52_ = class40.anInt667 - Class4.anInt125;
									int i_53_ = (class40.anInt666 - Class14_Sub2_Sub8.anInt3853);
									int i_54_ = (int) (class40.aLong677 >> 20 & 0x3L);
									if (i_54_ == 1 || i_54_ == 3) {
										if (i_53_ > -i_52_)
											LightManager.method196(i_2_, i, i_1_ - 1, i - 1, i_1_);
										else
											LightManager.method196(i_2_, i, i_1_ + 1, i + 1, i_1_);
									} else if (i_53_ > i_52_)
										LightManager.method196(i_2_, i, i_1_ - 1, i + 1, i_1_);
									else
										LightManager.method196(i_2_, i, i_1_ + 1, i - 1, i_1_);
								} else
									LightManager.method193(Class4.anInt125, Static2.anInt2741, (Class14_Sub2_Sub8.anInt3853),
											i_2_, class40.anInt668, class40.anInt678, class40.anInt670,
											class40.anInt669);
								class40.aClass133_679.method1792(class40.anInt663, Class150.anInt2420,
										Class7_Sub3_Sub1.anInt3718, JunkTex.anInt2719, Class37.anInt643,
										class40.anInt667 - Class4.anInt125, class40.anInt671 - Static2.anInt2741,
										(class40.anInt666 - Class14_Sub2_Sub8.anInt3853), class40.aLong677);
							}
							for (int i_55_ = class40.anInt668; i_55_ <= class40.anInt670; i_55_++) {
								for (int i_56_ = class40.anInt678; i_56_ <= class40.anInt669; i_56_++) {
									Class14_Sub29 class14_sub29_57_ = class14_sub29s[i_55_][i_56_];
									if (class14_sub29_57_.anInt3231 != 0)
										JunkTex.aClass2_4477.pushBack(class14_sub29_57_);
									else if ((i_55_ != i || i_56_ != i_1_) && class14_sub29_57_.aBoolean3240)
										JunkTex.aClass2_4477.pushBack(class14_sub29_57_);
								}
							}
						}
						if (class14_sub29_0_.aBoolean3251)
							continue;
					} catch (Exception exception) {
						class14_sub29_0_.aBoolean3251 = false;
					}
				}
				if (class14_sub29_0_.aBoolean3240 && class14_sub29_0_.anInt3231 == 0) {
					if (i <= Static2.cameraTileX && i > Class7_Sub1.anInt2659) {
						Class14_Sub29 class14_sub29_58_ = class14_sub29s[i - 1][i_1_];
						if (class14_sub29_58_ != null && class14_sub29_58_.aBoolean3240)
							continue;
					}
					if (i >= Static2.cameraTileX && i < JunkTex.anInt4722 - 1) {
						Class14_Sub29 class14_sub29_59_ = class14_sub29s[i + 1][i_1_];
						if (class14_sub29_59_ != null && class14_sub29_59_.aBoolean3240)
							continue;
					}
					if (i_1_ <= Class102.cameraTileZ && i_1_ > Class14_Sub9_Sub3.anInt4849) {
						Class14_Sub29 class14_sub29_60_ = class14_sub29s[i][i_1_ - 1];
						if (class14_sub29_60_ != null && class14_sub29_60_.aBoolean3240)
							continue;
					}
					if (i_1_ >= Class102.cameraTileZ && i_1_ < JunkTex.anInt4526 - 1) {
						Class14_Sub29 class14_sub29_61_ = class14_sub29s[i][i_1_ + 1];
						if (class14_sub29_61_ != null && class14_sub29_61_.aBoolean3240)
							continue;
					}
					class14_sub29_0_.aBoolean3240 = false;
					Class107.anInt1806--;
					Class115 class115 = class14_sub29_0_.aClass115_3256;
					if (class115 != null && class115.anInt1914 != 0) {
						LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_, i,
								i_1_);
						if (class115.aClass133_1926 != null)
							class115.aClass133_1926.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
									(class115.anInt1911 - Static2.anInt2741 - class115.anInt1914),
									(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
						if (class115.aClass133_1921 != null)
							class115.aClass133_1921.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
									(class115.anInt1911 - Static2.anInt2741 - class115.anInt1914),
									(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
						if (class115.aClass133_1919 != null)
							class115.aClass133_1919.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
									JunkTex.anInt2719, Class37.anInt643, class115.anInt1913 - Class4.anInt125,
									(class115.anInt1911 - Static2.anInt2741 - class115.anInt1914),
									(class115.anInt1925 - Class14_Sub2_Sub8.anInt3853), class115.aLong1915);
					}
					if (class14_sub29_0_.anInt3236 != 0) {
						Class37 class37 = class14_sub29_0_.aClass37_3255;
						if (class37 != null && !Scenegraph.method1478(i_3_, i, i_1_, class37.aClass133_642.method1781())) {
							if ((class37.anInt649 & class14_sub29_0_.anInt3236) != 0) {
								LightManager.method187(Class4.anInt125, Static2.anInt2741, Class14_Sub2_Sub8.anInt3853, i_2_,
										i, i_1_);
								class37.aClass133_642.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643,
										(class37.anInt653 - Class4.anInt125 + class37.anInt641),
										class37.anInt650 - Static2.anInt2741,
										(class37.anInt633 - Class14_Sub2_Sub8.anInt3853 + class37.anInt646),
										class37.aLong634);
							} else if (class37.anInt649 == 256) {
								int i_62_ = class37.anInt653 - Class4.anInt125;
								int i_63_ = class37.anInt650 - Static2.anInt2741;
								int i_64_ = (class37.anInt633 - Class14_Sub2_Sub8.anInt3853);
								int i_65_ = class37.anInt647;
								int i_66_;
								if (i_65_ == 1 || i_65_ == 2)
									i_66_ = -i_62_;
								else
									i_66_ = i_62_;
								int i_67_;
								if (i_65_ == 2 || i_65_ == 3)
									i_67_ = -i_64_;
								else
									i_67_ = i_64_;
								if (i_67_ >= i_66_) {
									LightManager.method187(Class4.anInt125, Static2.anInt2741, (Class14_Sub2_Sub8.anInt3853),
											i_2_, i, i_1_);
									class37.aClass133_642.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
											JunkTex.anInt2719, Class37.anInt643, i_62_ + class37.anInt641, i_63_,
											i_64_ + class37.anInt646, class37.aLong634);
								} else if (class37.aClass133_638 != null) {
									LightManager.method187(Class4.anInt125, Static2.anInt2741, (Class14_Sub2_Sub8.anInt3853),
											i_2_, i, i_1_);
									class37.aClass133_638.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
											JunkTex.anInt2719, Class37.anInt643, i_62_, i_63_, i_64_,
											class37.aLong634);
								}
							}
						}
						Class113 class113 = class14_sub29_0_.aClass113_3250;
						if (class113 != null) {
							if ((class113.anInt1888 & class14_sub29_0_.anInt3236) != 0
									&& !Scenegraph.method1530(i_3_, i, i_1_, class113.anInt1888)) {
								LightManager.method192(class113.anInt1888, Class4.anInt125, Static2.anInt2741,
										Class14_Sub2_Sub8.anInt3853, i_3_, i, i_1_);
								class113.aClass133_1884.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
										class113.anInt1882 - Static2.anInt2741,
										(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
							}
							if ((class113.anInt1880 & class14_sub29_0_.anInt3236) != 0
									&& !Scenegraph.method1530(i_3_, i, i_1_, class113.anInt1880)) {
								LightManager.method192(class113.anInt1880, Class4.anInt125, Static2.anInt2741,
										Class14_Sub2_Sub8.anInt3853, i_3_, i, i_1_);
								class113.aClass133_1877.method1792(0, Class150.anInt2420, Class7_Sub3_Sub1.anInt3718,
										JunkTex.anInt2719, Class37.anInt643, class113.anInt1878 - Class4.anInt125,
										class113.anInt1882 - Static2.anInt2741,
										(class113.anInt1886 - Class14_Sub2_Sub8.anInt3853), class113.aLong1887);
							}
						}
					}
					if (i_2_ < Class83.anInt1338 - 1) {
						Class14_Sub29 class14_sub29_68_ = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i_2_
								+ 1][i][i_1_]);
						if (class14_sub29_68_ != null && class14_sub29_68_.aBoolean3240)
							JunkTex.aClass2_4477.pushBack(class14_sub29_68_);
					}
					if (i < Static2.cameraTileX) {
						Class14_Sub29 class14_sub29_69_ = class14_sub29s[i + 1][i_1_];
						if (class14_sub29_69_ != null && class14_sub29_69_.aBoolean3240)
							JunkTex.aClass2_4477.pushBack(class14_sub29_69_);
					}
					if (i_1_ < Class102.cameraTileZ) {
						Class14_Sub29 class14_sub29_70_ = class14_sub29s[i][i_1_ + 1];
						if (class14_sub29_70_ != null && class14_sub29_70_.aBoolean3240)
							JunkTex.aClass2_4477.pushBack(class14_sub29_70_);
					}
					if (i > Static2.cameraTileX) {
						Class14_Sub29 class14_sub29_71_ = class14_sub29s[i - 1][i_1_];
						if (class14_sub29_71_ != null && class14_sub29_71_.aBoolean3240)
							JunkTex.aClass2_4477.pushBack(class14_sub29_71_);
					}
					if (i_1_ > Class102.cameraTileZ) {
						Class14_Sub29 class14_sub29_72_ = class14_sub29s[i][i_1_ - 1];
						if (class14_sub29_72_ != null && class14_sub29_72_.aBoolean3240)
							JunkTex.aClass2_4477.pushBack(class14_sub29_72_);
					}
				}
			}
		}
	}

	public static void method455(int i) {
		aClass2_2787 = null;
		anIntArray2786 = null;
		aClass133_Sub1_Sub2Array2785 = null;
		if (i >= -108)
			method454(null, false);
	}

	public boolean method456(int i, int i_73_, boolean bool) {
		if (!bool)
			aBoolean2784 = false;
		if (i < anInt2779 || anInt2777 < i || anInt2776 > i_73_ || anInt2778 < i_73_) {
			boolean bool_74_ = false;
			return bool_74_;
		}
		boolean bool_75_ = true;
		return bool_75_;
	}

	public static AnimFrameLoader method457(int i, int i_76_) {
		AnimFrameLoader class14_sub2_sub15 = ((AnimFrameLoader) Class14_Sub2_Sub12.aClass52_3894
				.get((long) i_76_));
		if (class14_sub2_sub15 != null) {
			AnimFrameLoader class14_sub2_sub15_77_ = class14_sub2_sub15;
			return class14_sub2_sub15_77_;
		}
		class14_sub2_sub15 = AnimFrameLoader.method933(Class133_Sub1_Sub1.aClass9_4935, JunkTex.aClass9_3427, i_76_,
				(byte) -101, false);
		if (i != 3)
			method459(null, 52);
		if (class14_sub2_sub15 != null)
			Class14_Sub2_Sub12.aClass52_3894.put(class14_sub2_sub15, (long) i_76_);
		AnimFrameLoader class14_sub2_sub15_78_ = class14_sub2_sub15;
		return class14_sub2_sub15_78_;
	}

	public static Class113 method458(int i, int i_79_, int i_80_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_79_][i_80_];
		if (class14_sub29 == null)
			return null;
		return class14_sub29.aClass113_3250;
	}

	public Class14_Sub4(int i, int i_81_, int i_82_, int i_83_) {
		anInt2776 = i_81_;
		anInt2778 = i_83_;
		anInt2779 = i;
		anInt2777 = i_82_;
	}

	public static void method459(Class124 class124, int i) {
		if (i != 2)
			aBoolean2784 = false;
		if (Class133_Sub1_Sub2.aClass14_Sub23Array4945 != null) {
			long l = class124.method1692(0);
			int i_84_ = 0;
			if (l != 0L) {
				for (/**/; (Class133_Sub1_Sub2.aClass14_Sub23Array4945.length > i_84_
						&& l != (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_84_].key)); i_84_++) {
					/* empty */
				}
				if (Class133_Sub1_Sub2.aClass14_Sub23Array4945.length > i_84_
						&& (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_84_] != null)) {
					JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(200);
					JunkTex.aClass14_Sub10_Sub1_891.method817(Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_84_].key,
							112);
				}
			}
		}
	}
}
