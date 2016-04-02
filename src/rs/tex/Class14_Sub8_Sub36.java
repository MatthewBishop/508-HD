/* Class14_Sub8_Sub36 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.awt.event.KeyEvent;
import java.util.Random;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class124;
import rs.Class133_Sub2;
import rs.Class133_Sub5;
import rs.Class133_Sub7;
import rs.Class138;
import rs.Class141;
import rs.Class14_Sub28;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class7_Sub1;
import rs.ModelHD;

public class Class14_Sub8_Sub36 extends Class14_Sub8 {
	public static boolean[] aBooleanArray4698 = new boolean[100];
	public static Class124 aClass124_4694 = Class14_Sub2_Sub2.method263(1178, "<col=ffff00>");
	public static Class124 aClass124_4696;
	public static Class124 aClass124_4700;
	public static Class124 aClass124_4702;
	public static Class124 aClass124_4706;
	public static long aLong4704;
	public static int[] anIntArray4691 = new int[4096];
	static {
		aLong4704 = 0L;
		aClass124_4696 = Class14_Sub2_Sub2.method263(1178, " weitere Optionen");
		aClass124_4700 = Class14_Sub2_Sub2.method263(1178, "Allocated memory");
		aClass124_4706 = Class14_Sub2_Sub2.method263(1178, "Speicher wird zugewiesen)3");
		aClass124_4702 = aClass124_4700;
	}
	public static void method668(byte i) {
		aClass124_4700 = null;
		anIntArray4691 = null;
		aClass124_4706 = null;
		aBooleanArray4698 = null;
		if (i != -109)
			method672(45, 43, -12, 30, 57, null, -48);
		aClass124_4702 = null;
		aClass124_4696 = null;
		aClass124_4694 = null;
	}
	public static void method669(int i) {
		synchronized (Class14_Sub8_Sub20.anObject4417) {
			if (i > 61) {
				if (Class138.anInt2223 != 0)
					Class138.anInt2223 = 1;
				try {
					Class14_Sub8_Sub20.anObject4417.wait();
				} catch (InterruptedException interruptedexception) {
					/* empty */
				}
			}
		}
	}
	public static int method671(KeyEvent var0, int var1) {
		try {
			int var2 = var0.getKeyChar();
			if (var2 == 8364) {
				short var3 = 128;
				return var3;
			} else {
				if (var1 != 0) {
					aClass124_4700 = null;
				}

				if (var2 <= 0 || var2 >= 256) {
					var2 = -1;
				}

				return var2;
			}
		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "va.G(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}
	public static Class133_Sub7 method672(int var0, int var1, int var2, int var3, int var4, Class133_Sub7 var5,
			int var6) {
		try {
			long var7 = (long) var2;
			Class133_Sub7 var9 = (Class133_Sub7) Class14_Sub28.aClass52_3217.get(var7);
			if (var9 == null) {
				Class133_Sub2 var10 = Class133_Sub2.method1824(Class14_Sub8_Sub38.aClass9_Sub1_4739, var2, 0);
				if (var10 == null) {
					Object var19 = null;
					return (Class133_Sub7) var19;
				}

				var9 = var10.method1827(64, 768, -50, -10, -50);
				Class14_Sub28.aClass52_3217.put(var9, var7);
			}

			int var18 = var5.method1867();
			int var11 = var5.method1856();
			if (var3 != 4435) {
				return null;
			} else {
				int var12 = var5.method1868();
				int var13 = var5.method1865();
				var9 = var9.method1870(true, true);
				if (var4 != 0) {
					var9.method1874(var4);
				}

				ModelHD var14 = (ModelHD) var9;
				if (var1 != Static.method1017(var6 + var18, Class14_Sub2_Sub3.anInt3785, (byte) -114, var12 + var0)
						|| Static.method1017(var11 + var6, Class14_Sub2_Sub3.anInt3785, (byte) -106,
								var13 + var0) != var1) {
					for (int var15 = 0; var14.anInt5033 > var15; ++var15) {
						var14.vertexY[var15] += Static.method1017(var14.vertexX[var15] + var6,
								Class14_Sub2_Sub3.anInt3785, (byte) -5, var14.vertexZ[var15] + var0) - var1;
					}

					var14.aClass50_5013.aBoolean820 = false;
					var14.aClass41_5028.upToDate = false;
				}

				return var9;
			}
		} catch (Throwable var17) {
			throw Class14_Sub8_Sub14.method554(var17, "va.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ',' + var4
					+ ',' + (var5 != null ? "{...}" : "null") + ',' + var6 + ')');
		}
	}
	public byte[] aByteArray4699;
	public int anInt4692 = 1;
	public int anInt4701;

	public int anInt4705;

	public int anInt4710;

	public int anInt4712;

	public int anInt4714;

	public short[] aShortArray4703 = new short[512];

	public Class14_Sub8_Sub36() {
		super(0, true);
		aByteArray4699 = new byte[512];
		anInt4701 = 5;
		anInt4705 = 0;
		anInt4712 = 5;
		anInt4710 = 2048;
		anInt4714 = 2;
	}

	public void method472() {
		aByteArray4699 = Class14_Sub8_Sub10.method527(anInt4705, (byte) -84);
		method670(11672);
	}

	public void method475(int i, int i_24_, Buffer class14_sub10) {
		int i_25_ = i;
		while_43_: do {
			while_42_: do {
				while_41_: do {
					while_40_: do {
						while_39_: do {
							do {
								if (i_25_ != 0) {
									if (i_25_ != 1) {
										if (i_25_ != 2) {
											if (i_25_ != 3) {
												if (i_25_ != 4) {
													if (i_25_ != 5) {
														if (i_25_ == 6)
															break while_42_;
														break while_43_;
													}
												} else
													break while_40_;
												break while_41_;
											}
										} else
											break;
										break while_39_;
									}
								} else {
									anInt4701 = anInt4712 = class14_sub10.method798();
									break while_43_;
								}
								anInt4705 = class14_sub10.method798();
								break while_43_;
							} while (false);
							anInt4710 = class14_sub10.method784((byte) 125);
							break while_43_;
						} while (false);
						anInt4714 = class14_sub10.method798();
						break while_43_;
					} while (false);
					anInt4692 = class14_sub10.method798();
					break while_43_;
				} while (false);
				anInt4701 = class14_sub10.method798();
				break while_43_;
			} while (false);
			anInt4712 = class14_sub10.method798();
		} while (false);
		if (i_24_ != 24777)
			method472();
	}

	public int[] method484(int i, byte i_26_) {
		int[] is = aClass149_2851.method2014(i, (byte) 117);
		int[] is_27_ = aClass149_2851.method2014(i, (byte) 117);
		if (aClass149_2851.aBoolean2402) {
			int i_28_ = anInt4712 * Class133_Sub5.anIntArray3623[i] + 2048;
			int i_29_ = i_28_ >> 44;
			int i_30_ = i_29_ + 1;
			int i_31_ = 0;
			while_51_: for (/**/; Class112.anInt1876 > i_31_; i_31_++) {
				Class14_Sub8_Sub17.anInt4377 = Class141.anInt2252 = Class7_Sub1.anInt2664 = Class7_Sub1.anInt2662 = 2147483647;
				int i_32_ = (Class14_Sub8_Sub4.anIntArray4145[i_31_] * anInt4701 + 2048);
				int i_33_ = i_32_ >> 12;
				int i_34_ = i_33_ + 1;
				for (int i_35_ = i_29_ - 1; i_30_ >= i_35_; i_35_++) {
					int i_36_ = (aByteArray4699[(i_35_ >= anInt4712 ? i_35_ - anInt4712 : i_35_) & 0xff] & 0xff);
					for (int i_37_ = i_33_ - 1; i_37_ <= i_34_; i_37_++) {
						int i_38_ = ((aByteArray4699[(i_37_ >= anInt4701 ? i_37_ - anInt4701 : i_37_) + i_36_ & 0xff]
								& 0xff) * 2);
						int i_39_ = (-aShortArray4703[i_38_++] - ((i_37_ << 44) - i_32_));
						int i_40_ = (-(i_35_ << 44) + (-aShortArray4703[i_38_] + i_28_));
						int i_41_ = anInt4692;
						int i_42_;
						while_47_: do {
							while_46_: do {
								while_45_: do {
									while_44_: do {
										do {
											if (i_41_ != 1) {
												if (i_41_ != 3) {
													if (i_41_ != 4) {
														if (i_41_ != 5) {
															if (i_41_ == 2)
																break while_45_;
															break while_46_;
														}
													} else
														break;
													break while_44_;
												}
											} else {
												i_42_ = (i_39_ * i_39_ + i_40_ * i_40_) >> 44;
												break while_47_;
											}
											i_40_ = i_40_ < 0 ? -i_40_ : i_40_;
											i_39_ = i_39_ < 0 ? -i_39_ : i_39_;
											i_42_ = (i_40_ < i_39_ ? i_39_ : i_40_);
											break while_47_;
										} while (false);
										i_39_ = (int) ((Math
												.sqrt((double) ((float) ((i_39_ < 0) ? -i_39_ : i_39_) / 4096.0F)))
												* 4096.0);
										i_40_ = (int) ((Math
												.sqrt((double) ((float) ((i_40_ >= 0) ? i_40_ : -i_40_) / 4096.0F)))
												* 4096.0);
										i_42_ = i_39_ + i_40_;
										i_42_ = i_42_ * i_42_ >> 12;
										break while_47_;
									} while (false);
									i_40_ *= i_40_;
									i_39_ *= i_39_;
									i_42_ = (int) ((Math
											.sqrt(Math.sqrt((double) ((float) (i_39_ + i_40_) / 1.6777216E7F))))
											* 4096.0);
									break while_47_;
								} while (false);
								i_42_ = ((i_39_ < 0 ? -i_39_ : i_39_) + (i_40_ >= 0 ? i_40_ : -i_40_));
								break while_47_;
							} while (false);
							i_42_ = (int) ((Math
									.sqrt((double) ((float) (i_40_ * i_40_ + i_39_ * i_39_) / 1.6777216E7F))) * 4096.0);
						} while (false);
						if (Class14_Sub8_Sub17.anInt4377 > i_42_) {
							Class7_Sub1.anInt2662 = Class7_Sub1.anInt2664;
							Class7_Sub1.anInt2664 = Class141.anInt2252;
							Class141.anInt2252 = Class14_Sub8_Sub17.anInt4377;
							Class14_Sub8_Sub17.anInt4377 = i_42_;
						} else if (i_42_ >= Class141.anInt2252) {
							if (Class7_Sub1.anInt2664 <= i_42_) {
								if (i_42_ < Class7_Sub1.anInt2662)
									Class7_Sub1.anInt2662 = i_42_;
							} else {
								Class7_Sub1.anInt2662 = Class7_Sub1.anInt2664;
								Class7_Sub1.anInt2664 = i_42_;
							}
						} else {
							Class7_Sub1.anInt2662 = Class7_Sub1.anInt2664;
							Class7_Sub1.anInt2664 = Class141.anInt2252;
							Class141.anInt2252 = i_42_;
						}
					}
				}
				int i_43_ = anInt4714;
				while_49_: do {
					while_48_: do {
						do {
							if (i_43_ != 0) {
								if (i_43_ != 1) {
									if (i_43_ != 3) {
										if (i_43_ != 4) {
											if (i_43_ == 2)
												break while_49_;
											continue while_51_;
										}
									} else
										break;
									break while_48_;
								}
							} else {
								is_27_[i_31_] = Class14_Sub8_Sub17.anInt4377;
								continue while_51_;
							}
							is_27_[i_31_] = Class141.anInt2252;
							continue while_51_;
						} while (false);
						is_27_[i_31_] = Class7_Sub1.anInt2664;
						continue while_51_;
					} while (false);
					is_27_[i_31_] = Class7_Sub1.anInt2662;
					continue while_51_;
				} while (false);
				is_27_[i_31_] = -Class14_Sub8_Sub17.anInt4377 + Class141.anInt2252;
			}
		}
		if (i_26_ >= -58)
			method669(-115);
		is = is_27_;
		return is;
	}

	public void method670(int i) {
		try {
			if (i == 11672) {
				Random random = new Random((long) anInt4705);
				aShortArray4703 = new short[512];
				if (anInt4710 > 0) {
					for (int i_44_ = 0; i_44_ < 512; i_44_++)
						aShortArray4703[i_44_] = (short) Class138.method1949(random, anInt4710);
				}
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable, new StringBuilder("va.E(").append(i).append(')').toString());
		}
	}
}
