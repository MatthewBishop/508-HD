/* Class38 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.rt4.HDTile;
import com.jagex.rt4.AbstractSprite;

public class Class38 implements Interface5 {
	public static int anInt2616 = 0;
	public static int anInt2617;
	public static int anInt2618;
	public static int mouseOffFromCenterY = 0;
	public static int anInt2624;

	public Class124 method24(long l, int i, int[] is, boolean bool) {
		if (i == 0) {
			Class14_Sub2_Sub8 class14_sub2_sub8 = Static2.method1507(-8475, is[0]);
			Class124 class124 = class14_sub2_sub8.method295(-68, (int) l);
			return class124;
		}
		if (i == 1 || i == 10) {
			Class142 class142 = JunkTex.method605(102, (int) l);
			Class124 class124 = class142.aClass124_2296;
			return class124;
		}
		if (!bool)
			anInt2618 = 100;
		if (i == 6 || i == 7) {
			Class124 class124 = Static2.method1507(-8475, is[0]).method295(-76, (int) l);
			return class124;
		}
		Class124 class124 = null;
		return class124;
	}

	public static void method1114(int i, int i_0_, float[][] fs, int[][] is, boolean bool, HDTile class14_sub27,
			float[][] fs_1_, int i_2_, int i_3_, int i_4_, float[][] fs_5_, byte i_6_, int i_7_, int i_8_, byte i_9_,
			int i_10_) {
		int i_11_ = (i_4_ << 40) + 255;
		int i_12_ = (i_0_ << 8) + 255;
		int i_13_ = (i << 8) + 255;
		int i_14_ = (i_7_ << 8) + 255;
		if (i_3_ < 12)
			mouseOffFromCenterY = -101;
		int[] is_15_ = null;
		int[] is_16_ = JunkTex.anIntArrayArray2545[i_9_];
		int[] is_17_ = new int[is_16_.length >> 33];
		for (int i_18_ = 0; is_17_.length > i_18_; i_18_++)
			is_17_[i_18_] = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_, false,
					fs_1_, fs_5_, is_16_[i_18_ + i_18_ + 1], i_10_, fs, null, 0.0F, is, i_2_, is_16_[i_18_ + i_18_]);
		while_8_: do {
			if (bool) {
				byte i_19_ = i_9_;
				while_7_: do {
					while_6_: do {
						while_5_: do {
							while_4_: do {
								while_3_: do {
									while_2_: do {
										while_1_: do {
											while_0_: do {
												do {
													if (i_19_ != 1) {
														if (i_19_ != 2) {
															if (i_19_ != 3) {
																if (i_19_ != 4) {
																	if (i_19_ != 5) {
																		if (i_19_ != 6) {
																			if (i_19_ != 7) {
																				if (i_19_ != 8) {
																					if (i_19_ != 9) {
																						if (i_19_ != 10) {
																							if (i_19_ == 11)
																								break while_7_;
																							break while_8_;
																						}
																					} else
																						break while_5_;
																					break while_6_;
																				}
																			} else
																				break while_3_;
																			break while_4_;
																		}
																	} else
																		break while_1_;
																	break while_2_;
																}
															} else
																break;
															break while_0_;
														}
													} else {
														is_15_ = new int[6];
														int i_20_ = (Class14_Sub17.method881(i_14_, i_13_,
																class14_sub27, (byte) 12, i_11_, i_12_, i_6_, true,
																fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_,
																64));
														int i_21_ = (Class14_Sub17.method881(i_14_, i_13_,
																class14_sub27, (byte) 12, i_11_, i_12_, i_6_, true,
																fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_,
																128));
														is_15_[2] = is_17_[2];
														is_15_[1] = i_20_;
														is_15_[0] = i_21_;
														is_15_[3] = i_20_;
														is_15_[5] = is_17_[2];
														is_15_[4] = is_17_[0];
														break while_8_;
													}
													is_15_ = new int[6];
													int i_22_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27,
															(byte) 12, i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128,
															i_10_, fs, null, 0.0F, is, i_2_, 128));
													int i_23_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27,
															(byte) 12, i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_,
															fs, null, 0.0F, is, i_2_, 64));
													is_15_[2] = i_22_;
													is_15_[1] = i_23_;
													is_15_[3] = i_22_;
													is_15_[0] = is_17_[0];
													is_15_[4] = is_17_[1];
													is_15_[5] = is_17_[0];
													break while_8_;
												} while (false);
												is_15_ = new int[6];
												int i_24_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27,
														(byte) 12, i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_,
														fs, null, 0.0F, is, i_2_, 0));
												int i_25_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27,
														(byte) 12, i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_, fs,
														null, 0.0F, is, i_2_, 64));
												is_15_[1] = is_17_[1];
												is_15_[0] = is_17_[2];
												is_15_[3] = i_24_;
												is_15_[2] = i_24_;
												is_15_[5] = is_17_[2];
												is_15_[4] = i_25_;
												break while_8_;
											} while (false);
											is_15_ = new int[3];
											int i_26_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12,
													i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F,
													is, i_2_, 0));
											is_15_[0] = is_17_[3];
											is_15_[2] = is_17_[0];
											is_15_[1] = i_26_;
											break while_8_;
										} while (false);
										is_15_ = new int[3];
										int i_27_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12,
												i_11_, i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is,
												i_2_, 128));
										is_15_[1] = i_27_;
										is_15_[0] = is_17_[2];
										is_15_[2] = is_17_[3];
										break while_8_;
									} while (false);
									is_15_ = new int[6];
									int i_28_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_,
											i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 128));
									int i_29_ = (Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_,
											i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_,
											128));
									is_15_[1] = i_28_;
									is_15_[2] = i_29_;
									is_15_[0] = is_17_[3];
									is_15_[4] = is_17_[0];
									is_15_[3] = i_29_;
									is_15_[5] = is_17_[3];
									break while_8_;
								} while (false);
								is_15_ = new int[6];
								int i_30_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_,
										i_12_, i_6_, true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_, 0);
								int i_31_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_,
										i_12_, i_6_, true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 128);
								is_15_[2] = i_30_;
								is_15_[4] = is_17_[2];
								is_15_[3] = i_30_;
								is_15_[0] = is_17_[1];
								is_15_[1] = i_31_;
								is_15_[5] = is_17_[1];
								break while_8_;
							} while (false);
							is_15_ = new int[3];
							int i_32_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_,
									i_6_, true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 0);
							is_15_[1] = i_32_;
							is_15_[0] = is_17_[3];
							is_15_[2] = is_17_[4];
							break while_8_;
						} while (false);
						is_15_ = new int[15];
						int i_33_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_,
								true, fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 128);
						int i_34_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_,
								true, fs_1_, fs_5_, 32, i_10_, fs, null, 0.0F, is, i_2_, 96);
						int i_35_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_,
								true, fs_1_, fs_5_, 0, i_10_, fs, null, 0.0F, is, i_2_, 64);
						is_15_[1] = i_33_;
						is_15_[3] = i_34_;
						is_15_[7] = is_17_[3];
						is_15_[5] = is_17_[3];
						is_15_[9] = i_34_;
						is_15_[2] = is_17_[4];
						is_15_[13] = is_17_[1];
						is_15_[12] = i_34_;
						is_15_[11] = is_17_[1];
						is_15_[6] = i_34_;
						is_15_[8] = is_17_[2];
						is_15_[4] = is_17_[4];
						is_15_[0] = i_34_;
						is_15_[14] = i_35_;
						is_15_[10] = is_17_[2];
						break while_8_;
					} while (false);
					is_15_ = new int[9];
					int i_36_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_,
							true, fs_1_, fs_5_, 128, i_10_, fs, null, 0.0F, is, i_2_, 0);
					is_15_[0] = is_17_[2];
					is_15_[2] = is_17_[3];
					is_15_[4] = i_36_;
					is_15_[1] = i_36_;
					is_15_[8] = is_17_[0];
					is_15_[3] = is_17_[3];
					is_15_[6] = is_17_[4];
					is_15_[5] = is_17_[4];
					is_15_[7] = i_36_;
					break while_8_;
				} while (false);
				is_15_ = new int[12];
				int i_37_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_, true,
						fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 0);
				int i_38_ = Class14_Sub17.method881(i_14_, i_13_, class14_sub27, (byte) 12, i_11_, i_12_, i_6_, true,
						fs_1_, fs_5_, 64, i_10_, fs, null, 0.0F, is, i_2_, 128);
				is_15_[5] = i_37_;
				is_15_[8] = i_37_;
				is_15_[0] = is_17_[3];
				is_15_[3] = is_17_[3];
				is_15_[1] = i_37_;
				is_15_[7] = i_38_;
				is_15_[2] = is_17_[0];
				is_15_[4] = is_17_[2];
				is_15_[10] = is_17_[1];
				is_15_[11] = i_38_;
				is_15_[9] = is_17_[2];
				is_15_[6] = is_17_[2];
			}
		} while (false);
		class14_sub27.method920(i_8_, i_2_, i_10_, is_17_, is_15_, false);
	}

	public static AbstractSprite[] method1115(boolean bool, Class9 class9, int i, int i_39_) {
		if (!Static3.method1564(i, i_39_, class9)) {
			AbstractSprite[] class14_sub2_sub19s = null;
			return class14_sub2_sub19s;
		}
		if (bool)
			method1116(-87, true);
		AbstractSprite[] class14_sub2_sub19s = JunkTex.method535(!bool);
		return class14_sub2_sub19s;
	}

	public static void method1116(int i, boolean bool) {
		if ((Static2.anInt1085 == Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7)
				&& (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 39 == JunkTex.anInt4335))
			Static2.anInt1085 = 0;
		int i_40_ = Static2.anInt2878;
		if (i != 1)
			anInt2624 = -52;
		if (bool)
			i_40_ = 1;
		for (int i_41_ = 0; i_41_ < i_40_; i_41_++) {
			long l;
			Class133_Sub1_Sub1 class133_sub1_sub1;
			if (bool) {
				class133_sub1_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
				l = 8791798054912L;
			} else {
				l = (long) Static2.anIntArray351[i_41_] << 32;
				class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_41_]]);
			}
			if (class133_sub1_sub1 != null && class133_sub1_sub1.method1804((byte) 115)) {
				class133_sub1_sub1.aBoolean4921 = false;
				if ((Class135.aBoolean2190 && Static2.anInt2878 > 200 || Static2.anInt2878 > 50) && !bool
						&& (class133_sub1_sub1.anInt3452 == class133_sub1_sub1.anInt3433))
					class133_sub1_sub1.aBoolean4921 = true;
				int i_42_ = class133_sub1_sub1.anInt3495 >> 7;
				int i_43_ = class133_sub1_sub1.anInt3436 >> 39;
				if (i_42_ >= 0 && i_42_ < 104 && i_43_ >= 0 && i_43_ < 104) {
					if (class133_sub1_sub1.aClass133_Sub7_4933 == null
							|| (class133_sub1_sub1.anInt4929 > Class14_Sub2_Sub20.anInt4064)
							|| (Class14_Sub2_Sub20.anInt4064 >= class133_sub1_sub1.anInt4910)) {
						if (class133_sub1_sub1.anInt3493 == 1 && (class133_sub1_sub1.anInt3495 & 0x7f) == 64
								&& (class133_sub1_sub1.anInt3436 & 0x7f) == 64) {
							if ((Class14_Sub2_Sub8.anIntArrayArray3846[i_42_][i_43_]) == Class42.anInt699)
								continue;
							Class14_Sub2_Sub8.anIntArrayArray3846[i_42_][i_43_] = Class42.anInt699;
						}
						class133_sub1_sub1.anInt3500 = JunkTex.method1017(class133_sub1_sub1.anInt3495,
								Class14_Sub2_Sub3.gameLevel, (byte) 85, class133_sub1_sub1.anInt3436);
						JunkTex.method519(Class14_Sub2_Sub3.gameLevel, class133_sub1_sub1.anInt3495,
								class133_sub1_sub1.anInt3436, class133_sub1_sub1.anInt3500,
								class133_sub1_sub1.anInt3493 * 64 + 60 - 64, class133_sub1_sub1,
								class133_sub1_sub1.anInt3461, l, class133_sub1_sub1.aBoolean3488);
					} else {
						class133_sub1_sub1.aBoolean4921 = false;
						class133_sub1_sub1.anInt3500 = JunkTex.method1017(class133_sub1_sub1.anInt3495,
								Class14_Sub2_Sub3.gameLevel, (byte) -112, class133_sub1_sub1.anInt3436);
						Class128.method1757(Class14_Sub2_Sub3.gameLevel, class133_sub1_sub1.anInt3495,
								class133_sub1_sub1.anInt3436, class133_sub1_sub1.anInt3500, class133_sub1_sub1,
								class133_sub1_sub1.anInt3461, l, class133_sub1_sub1.anInt4914,
								class133_sub1_sub1.anInt4908, class133_sub1_sub1.anInt4906,
								class133_sub1_sub1.anInt4924);
					}
				}
			}
		}
	}

	public static void method1118(int i, int i_48_) {
		if (i == 37)
			JunkTex.aFloat2854 = 3.0F;
		else if (i != 50) {
			if (i == 75)
				JunkTex.aFloat2854 = 6.0F;
			else
				JunkTex.aFloat2854 = 8.0F;
		} else
			JunkTex.aFloat2854 = 4.0F;
		Class14_Sub18.anInt3050 = -1;
		Class14_Sub18.anInt3050 = i_48_;
	}
}
