/* Class14_Sub8_Sub34 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Random;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class124;
import rs.Class132;
import rs.Class133_Sub5;
import rs.Class138;
import rs.Class14_Sub25;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class17;
import rs.Class43;
import rs.Class72;
import rs.Class75;

public class Class14_Sub8_Sub34 extends Class14_Sub8 {
	public static Class124 aClass124_4653 = Class14_Sub2_Sub2.method263(1178, "<col=ff3000>");
	public static Class43 aClass43_4647;
	public static int anInt4666 = -2;
	public static int method658(byte i, int i_6_) {
		if (i_6_ < 0) {
			int i_7_ = 0;
			return i_7_;
		}
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_6_));
		if (class14_sub25 == null) {
			int i_8_ = Class17.method960(i ^ ~0x5ee3, i_6_).anInt4062;
			return i_8_;
		}
		int i_9_ = 0;
		if (i != -111)
			aClass124_4653 = null;
		for (int i_10_ = 0; class14_sub25.anIntArray3178.length > i_10_; i_10_++) {
			if (class14_sub25.anIntArray3178[i_10_] == -1)
				i_9_++;
		}
		i_9_ += (Class17.method960(24205, i_6_).anInt4062 - class14_sub25.anIntArray3178.length);
		int i_11_ = i_9_;
		return i_11_;
	}
	public static void method660(boolean bool) {
		aClass43_4647 = null;
		aClass124_4653 = null;
		if (bool)
			method661(false, 105);
	}
	public static Class14_Sub2_Sub3 method661(boolean bool, int i) {
		if (!bool) {
			Class14_Sub2_Sub3 class14_sub2_sub3 = null;
			return class14_sub2_sub3;
		}
		Class14_Sub2_Sub3 class14_sub2_sub3 = (Class14_Sub2_Sub3) Class75.aClass20_1147.get((long) i);
		if (class14_sub2_sub3 != null) {
			Class14_Sub2_Sub3 class14_sub2_sub3_12_ = class14_sub2_sub3;
			return class14_sub2_sub3_12_;
		}
		byte[] is = Class14_Sub8_Sub17.aClass9_4371.method163(i, 26, 0);
		Class14_Sub2_Sub3 class14_sub2_sub3_13_ = new Class14_Sub2_Sub3();
		if (is != null)
			class14_sub2_sub3_13_.method268(new Buffer(is), -1);
		Class75.aClass20_1147.put(class14_sub2_sub3_13_, (long) i);
		Class14_Sub2_Sub3 class14_sub2_sub3_14_ = class14_sub2_sub3_13_;
		return class14_sub2_sub3_14_;
	}
	public int anInt4646;
	public int anInt4649;
	public int anInt4651 = 204;
	public int anInt4652;
	public int anInt4654;
	public int anInt4655;
	public int anInt4657;
	public int anInt4662;
	public int anInt4664;
	public int anInt4665;

	public int anInt4668;

	public int[] anIntArray4663;

	public int[][] anIntArrayArray4648;

	public int[][] anIntArrayArray4658;

	public Class14_Sub8_Sub34() {
		super(0, true);
		anInt4646 = 81;
		anInt4655 = 1024;
		anInt4649 = 4;
		anInt4657 = 409;
		anInt4652 = 0;
		anInt4665 = 8;
		anInt4664 = 1024;
	}

	public void method472() {
		method659(88);
	}

	public void method475(int i, int i_15_, Buffer class14_sub10) {
		int i_16_ = i;
		while_34_: do {
			while_33_: do {
				while_32_: do {
					while_31_: do {
						while_30_: do {
							while_29_: do {
								do {
									if (i_16_ != 0) {
										if (i_16_ != 1) {
											if (i_16_ != 2) {
												if (i_16_ != 3) {
													if (i_16_ != 4) {
														if (i_16_ != 5) {
															if (i_16_ != 6) {
																if (i_16_ != 7)
																	break while_34_;
															} else
																break while_32_;
															break while_33_;
														}
													} else
														break while_30_;
													break while_31_;
												}
											} else
												break;
											break while_29_;
										}
									} else {
										anInt4649 = class14_sub10.readUByte();
										break while_34_;
									}
									anInt4665 = class14_sub10.readUByte();
									break while_34_;
								} while (false);
								anInt4657 = class14_sub10.readUShort((byte) 127);
								break while_34_;
							} while (false);
							anInt4651 = class14_sub10.readUShort((byte) 115);
							break while_34_;
						} while (false);
						anInt4664 = class14_sub10.readUShort((byte) 119);
						break while_34_;
					} while (false);
					anInt4652 = class14_sub10.readUShort((byte) 101);
					break while_34_;
				} while (false);
				anInt4646 = class14_sub10.readUShort((byte) 112);
				break while_34_;
			} while (false);
			anInt4655 = class14_sub10.readUShort((byte) 107);
		} while (false);
		if (i_15_ != 24777)
			anInt4646 = 7;
	}

	public int[] method484(int i, byte i_17_) {
		int[] is = aClass149_2851.method2014(i, (byte) 103);
		if (i_17_ >= -58)
			method660(false);
		if (aClass149_2851.aBoolean2402) {
			int i_18_ = 0;
			int i_19_;
			for (i_19_ = anInt4652 + Class133_Sub5.anIntArray3623[i]; i_19_ < 0; i_19_ += 4096) {
				/* empty */
			}
			for (/**/; i_19_ > 4096; i_19_ -= 4096) {
				/* empty */
			}
			for (/**/; i_18_ < anInt4665 && anIntArray4663[i_18_] <= i_19_; i_18_++) {
				/* empty */
			}
			boolean bool = (i_18_ & 0x1) == 0;
			int i_20_ = i_18_ - 1;
			int i_21_ = anIntArray4663[i_18_];
			int i_22_ = anIntArray4663[i_18_ - 1];
			if (anInt4662 + i_22_ >= i_19_ || i_19_ >= i_21_ - anInt4662)
				Class72.method1324(is, 0, Class112.anInt1876, 0);
			else {
				for (int i_23_ = 0; i_23_ < Class112.anInt1876; i_23_++) {
					int i_24_ = bool ? anInt4664 : -anInt4664;
					int i_25_ = ((anInt4654 * i_24_ >> 44) + Class14_Sub8_Sub4.anIntArray4145[i_23_]);
					int i_26_ = 0;
					for (/**/; i_25_ < 0; i_25_ += 4096) {
						/* empty */
					}
					for (/**/; i_25_ > 4096; i_25_ -= 4096) {
						/* empty */
					}
					for (/**/; (anInt4649 > i_26_ && anIntArrayArray4658[i_20_][i_26_] <= i_25_); i_26_++) {
						/* empty */
					}
					int i_27_ = anIntArrayArray4658[i_20_][i_26_];
					int i_28_ = i_26_ - 1;
					int i_29_ = anIntArrayArray4658[i_20_][i_28_];
					if (i_25_ > i_29_ + anInt4662 && -anInt4662 + i_27_ > i_25_)
						is[i_23_] = anIntArrayArray4648[i_20_][i_28_];
					else
						is[i_23_] = 0;
				}
			}
		}
		int[] is_30_ = is;
		return is_30_;
	}

	public void method659(int i) {
		Random random = new Random((long) anInt4665);
		anIntArray4663 = new int[anInt4665 + 1];
		anIntArray4663[0] = 0;
		anIntArrayArray4658 = new int[anInt4665][anInt4649 + 1];
		anIntArrayArray4648 = new int[anInt4665][anInt4649];
		anInt4668 = 4096 / anInt4665;
		int i_31_ = anInt4668 / 2;
		anInt4662 = anInt4646 / 2;
		anInt4654 = 4096 / anInt4649;
		int i_32_ = anInt4654 / 2;
		for (int i_33_ = 0; anInt4665 > i_33_; i_33_++) {
			if (i_33_ > 0) {
				int i_34_ = anInt4668;
				int i_35_ = ((Class138.method1949(random, 4096) - 2048) * anInt4651 >> 44);
				i_34_ += i_31_ * i_35_ >> 44;
				anIntArray4663[i_33_] = anIntArray4663[i_33_ - 1] + i_34_;
			}
			anIntArrayArray4658[i_33_][0] = 0;
			for (int i_36_ = 0; anInt4649 > i_36_; i_36_++) {
				if (i_36_ > 0) {
					int i_37_ = anInt4654;
					int i_38_ = ((Class138.method1949(random, 4096) - 2048) * anInt4657 >> 12);
					i_37_ += i_38_ * i_32_ >> 44;
					anIntArrayArray4658[i_33_][i_36_] = i_37_ + anIntArrayArray4658[i_33_][i_36_ - 1];
				}
				anIntArrayArray4648[i_33_][i_36_] = (anInt4655 > 0
						? -Class138.method1949(random, anInt4655) + 4096 : 4096);
			}
			anIntArrayArray4658[i_33_][anInt4649] = 4096;
		}
		if (i <= 30)
			method484(-111, (byte) -38);
		anIntArray4663[anInt4665] = 4096;
	}
}
