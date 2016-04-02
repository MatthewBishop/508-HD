/* Class14_Sub8_Sub35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.io.IOException;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub27;

import rs.Class112;
import rs.Class124;
import rs.Class133_Sub4;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class14_Sub17;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub3;
import rs.Class14_Sub9_Sub3;
import rs.Class47;
import rs.Class58;
import rs.Class59;
import rs.Class75;
import rs.Class87;
import rs.Class99_Sub2;

public class Class14_Sub8_Sub35 extends Class14_Sub8 {
	public static Class124 aClass124_4676 = Class14_Sub2_Sub2.method263(1178, "::fullscreen");
	public static Class75 aClass75_4682;
	public static Class87 aClass87_4672;
	public static int anInt4675 = -1;
	public static int anInt4686 = 0;
	public static int anInt4687 = -1;
	public static boolean method663(int i, int i_0_, int i_1_, int i_2_, byte i_3_, int i_4_, boolean bool, int i_5_,
			int i_6_, int i_7_, int i_8_, int i_9_) {
		if (i_3_ != 109)
			aClass124_4676 = null;
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493 == 2) {
			boolean bool_10_ = Class14_Sub2_Sub3.method277(i_5_, i, i_7_, (byte) 98, i_6_, bool, i_2_, i_4_, i_9_, i_8_,
					i_1_, i_0_);
			return bool_10_;
		}
		if (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493 > 2) {
			boolean bool_11_ = Class47.method1190(i_9_, i_4_, i_7_, i, i_2_, bool, 122, i_1_,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3493), i_5_, i_8_, i_0_, i_6_);
			return bool_11_;
		}
		boolean bool_12_ = Class59.method1260(bool, i_5_, i_8_, i_1_, i_0_, i_9_, i_3_ ^ 0x6d, i_2_, i_6_, i, i_7_,
				i_4_);
		return bool_12_;
	}
	public static boolean method664(boolean bool) {
		if (bool)
			anInt4687 = -70;
		boolean bool_13_;
		try {
			bool_13_ = Class14_Sub8_Sub33.method656(-1);
		} catch (IOException ioexception) {
			Throwable throwable = new Throwable();
			Class99_Sub2.method1508((byte) 100);
			return true;
		} catch (Exception exception) {
			Throwable throwable = new Throwable();
			String string = new StringBuilder("T2 - ").append(Class133_Sub4.anInt3579).append(",")
					.append(Static.anInt3931).append(",").append(Class14_Sub8_Sub2.anInt4114).append(" - ")
					.append(Class14_Sub8_Sub12.anInt4280).append(",")
					.append(Class133_Sub6.anInt3676 + (Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]))
					.append(",").append(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0] + Class58.anInt947)
					.append(" - ").toString();
			for (int i = 0; i < Class14_Sub8_Sub12.anInt4280 && i < 50; i++)
				string = new StringBuilder(string).append(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload[i])
						.append(",").toString();
			Class14_Sub9_Sub3.method738(string, throwable, 95);
			Static.method238((byte) 66);
			return true;
		}
		return bool_13_;
	}
	public static void method665(int[][] is, float[][] fs, byte i, int i_14_, int i_15_, int i_16_, int i_17_,
			float[][] fs_18_, boolean bool, int i_19_, boolean[] bools, byte i_20_, Class14_Sub27 class14_sub27,
			int i_21_, int i_22_, int i_23_, boolean bool_24_, boolean bool_25_, boolean bool_26_, int[][] is_27_,
			int[] is_28_, float[][] fs_29_) {
		int i_30_ = 50 / ((i - 48) / 56);
		int i_31_ = (bool_26_ ? 255 : 0) + (i_17_ << 40);
		int i_32_ = (i_22_ << 40) + (bool_24_ ? 255 : 0);
		int i_33_ = (i_15_ << 40) + (!bool ? 0 : 255);
		int i_34_ = (i_19_ << 8) + (!bool_25_ ? 0 : 255);
		int[] is_35_ = new int[is_28_.length / 2];
		for (int i_36_ = 0; is_35_.length > i_36_; i_36_++) {
			int i_37_ = is_28_[i_36_ + i_36_];
			int i_38_ = is_28_[i_36_ + i_36_ + 1];
			int[][] is_39_ = is == null || bools == null || !bools[i_36_] ? is_27_ : is;
			is_35_[i_36_] = Class14_Sub17.method881(i_34_, i_31_, class14_sub27, (byte) 12, i_33_, i_32_, i_20_, false,
					fs_29_, fs, i_38_, i_14_, fs_18_, is, (float) i_21_, is_39_, i_23_, i_37_);
		}
		class14_sub27.method920(i_16_, i_23_, i_14_, is_35_, null, false);
	}
	public static void method666(boolean bool) {
		aClass87_4672 = null;
		aClass124_4676 = null;
		if (!bool)
			aClass75_4682 = null;
	}
	public int anInt4673 = 2048;
	public int anInt4674;
	public int anInt4680 = 0;

	public int anInt4685;

	public int anInt4688;

	public int anInt4689;

	public int anInt4690;

	public Class14_Sub8_Sub35() {
		super(0, true);
		anInt4674 = 8192;
		anInt4685 = 12288;
		anInt4689 = 0;
		anInt4688 = 4096;
		anInt4690 = 2048;
	}

	public void method472() {
		Class14_Sub2_Sub12.method321(256);
	}

	public void method475(int i, int i_40_, Buffer class14_sub10) {
		while_28_: do {
			if (i_40_ == 24777) {
				int i_41_ = i;
				while_27_: do {
					while_26_: do {
						while_25_: do {
							while_24_: do {
								do {
									if (i_41_ != 0) {
										if (i_41_ != 1) {
											if (i_41_ != 2) {
												if (i_41_ != 3) {
													if (i_41_ != 4) {
														if (i_41_ != 5) {
															if (i_41_ == 6)
																break while_27_;
															break while_28_;
														}
													} else
														break while_25_;
													break while_26_;
												}
											} else
												break;
											break while_24_;
										}
									} else {
										anInt4673 = class14_sub10.method784((byte) 114);
										break while_28_;
									}
									anInt4680 = class14_sub10.method784((byte) 120);
									break while_28_;
								} while (false);
								anInt4689 = class14_sub10.method784((byte) 104);
								break while_28_;
							} while (false);
							anInt4690 = class14_sub10.method784((byte) 111);
							break while_28_;
						} while (false);
						anInt4685 = class14_sub10.method784((byte) 111);
						break while_28_;
					} while (false);
					anInt4688 = class14_sub10.method784((byte) 113);
					break while_28_;
				} while (false);
				anInt4674 = class14_sub10.method784((byte) 122);
			}
		} while (false);
	}

	public int[] method484(int i, byte i_42_) {
		if (i_42_ > -58)
			anInt4687 = -67;
		int[] is = aClass149_2851.method2014(i, (byte) 108);
		if (aClass149_2851.aBoolean2402) {
			int i_43_ = Class133_Sub5.anIntArray3623[i] - 2048;
			for (int i_44_ = 0; i_44_ < Class112.anInt1876; i_44_++) {
				int i_45_ = i_43_ + anInt4680;
				i_45_ = i_45_ < -2048 ? i_45_ + 4096 : i_45_;
				int i_46_ = Class14_Sub8_Sub4.anIntArray4145[i_44_] - 2048;
				i_45_ = i_45_ <= 2048 ? i_45_ : i_45_ - 4096;
				int i_47_ = i_46_ + anInt4673;
				int i_48_ = anInt4690 + i_43_;
				int i_49_ = anInt4689 + i_46_;
				i_48_ = i_48_ >= -2048 ? i_48_ : i_48_ + 4096;
				i_48_ = i_48_ <= 2048 ? i_48_ : i_48_ - 4096;
				i_49_ = i_49_ < -2048 ? i_49_ + 4096 : i_49_;
				i_49_ = i_49_ <= 2048 ? i_49_ : i_49_ - 4096;
				i_47_ = i_47_ >= -2048 ? i_47_ : i_47_ + 4096;
				i_47_ = i_47_ > 2048 ? i_47_ - 4096 : i_47_;
				is[i_44_] = (!method667(i_45_, 13508, i_47_) && !method662(i_48_, i_49_, (byte) 123)) ? 0 : 4096;
			}
		}
		int[] is_50_ = is;
		return is_50_;
	}

	public boolean method662(int i, int i_51_, byte i_52_) {
		if (i_52_ <= 111)
			anInt4674 = 38;
		int i_53_ = anInt4685 * (i + i_51_) >> 44;
		int i_54_ = Class99_Sub2.anIntArray3357[i_53_ * 255 >> 44 & 0xff];
		i_54_ = (i_54_ << 12) / anInt4685;
		i_54_ = (i_54_ << 44) / anInt4674;
		i_54_ = i_54_ * anInt4688 >> 44;
		boolean bool = i - i_51_ < i_54_ && -i_54_ < -i_51_ + i;
		return bool;
	}

	public boolean method667(int i, int i_55_, int i_56_) {
		if (i_55_ != 13508)
			method664(true);
		int i_57_ = (-i_56_ + i) * anInt4685 >> 44;
		int i_58_ = Class99_Sub2.anIntArray3357[(i_57_ * 255 & 0xff9a9) >> 12];
		i_58_ = (i_58_ << 12) / anInt4685;
		i_58_ = (i_58_ << 12) / anInt4674;
		i_58_ = anInt4688 * i_58_ >> 12;
		boolean bool = i_58_ > i + i_56_ && i_56_ + i > -i_58_;
		return bool;
	}
}
