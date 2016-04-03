/* Class14_Sub8_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.Class112;
import rs.Class115;
import rs.Class12;
import rs.Class124;
import rs.Class126;
import rs.Class133_Sub1;
import rs.Class133_Sub1_Sub2;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub20;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub4;
import rs.Class37;
import rs.Class64;
import rs.Static2;

public class Class14_Sub8_Sub25 extends Class14_Sub8 {
	public static boolean aBoolean4518;
	public static Class124 aClass124_4510;
	public static Class124 aClass124_4511;
	public static Class14_Sub2_Sub19 aClass14_Sub2_Sub19_4508;
	public static int anInt4505;
	public static int anInt4509;
	public static int anInt4515;
	public static int anInt4520;
	public static int[] anIntArray4512 = new int[1000];
	static {
		anInt4505 = 0;
		aBoolean4518 = true;
		anInt4509 = -1;
		aClass124_4510 = Class14_Sub2_Sub2.method263(1178, "Created gameworld");
		anInt4515 = 0;
		aClass124_4511 = aClass124_4510;
		anInt4520 = 0;
	}
	public static void method613(Class133_Sub1 class133_sub1, int i) {
		if (class133_sub1.anInt3455 == Class14_Sub2_Sub20.anInt4064 || class133_sub1.anInt3445 == -1
				|| class133_sub1.anInt3467 != 0 || (class133_sub1.anInt3458 + 1 > (Static
						.method1129(class133_sub1.anInt3445, 45).anIntArray763[class133_sub1.anInt3501]))) {
			int i_0_ = Class14_Sub2_Sub20.anInt4064 - class133_sub1.anInt3494;
			int i_1_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3451 * 128;
			int i_2_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3472 * 128;
			int i_3_ = -class133_sub1.anInt3494 + class133_sub1.anInt3455;
			int i_4_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3478 * 128;
			class133_sub1.anInt3495 = (i_4_ * i_0_ + (-i_0_ + i_3_) * i_1_) / i_3_;
			int i_5_ = class133_sub1.anInt3493 * 64 + class133_sub1.anInt3489 * 128;
			class133_sub1.anInt3436 = ((i_3_ - i_0_) * i_2_ + i_0_ * i_5_) / i_3_;
		}
		if (class133_sub1.anInt3444 == 0)
			class133_sub1.anInt3469 = 1024;
		class133_sub1.anInt3437 = 0;
		if (class133_sub1.anInt3444 == 1)
			class133_sub1.anInt3469 = 1536;
		if (i < -11) {
			if (class133_sub1.anInt3444 == 2)
				class133_sub1.anInt3469 = 0;
			if (class133_sub1.anInt3444 == 3)
				class133_sub1.anInt3469 = 512;
			class133_sub1.anInt3461 = class133_sub1.anInt3469;
		}
	}

	public static void method614(byte i) {
		aClass124_4511 = null;
		aClass14_Sub2_Sub19_4508 = null;
		aClass124_4510 = null;
		int i_6_ = -18 % ((37 - i) / 55);
		anIntArray4512 = null;
	}

	public static void method615(int i) {
		if (i != 300)
			anIntArray4512 = null;
		for (int i_7_ = 0; i_7_ < Class64.anInt1012; i_7_++) {
			int i_8_ = Class14_Sub2_Sub7.anIntArray3825[i_7_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_8_];
			int i_9_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
			if ((i_9_ & 0x10) != 0) {
				class133_sub1_sub2.anInt3453 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUShort((byte) 117);
				if (class133_sub1_sub2.anInt3453 == 65535)
					class133_sub1_sub2.anInt3453 = -1;
			}
			if ((i_9_ & 0x8) != 0) {
				if (class133_sub1_sub2.aClass12_4949.method212((byte) -121))
					Class37.method1112(class133_sub1_sub2, (byte) -26);
				class133_sub1_sub2.aClass12_4949 = Class126
						.method1744(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977), i ^ 0x186);
				class133_sub1_sub2.anInt3432 = class133_sub1_sub2.aClass12_4949.anInt339;
				class133_sub1_sub2.anInt3493 = class133_sub1_sub2.aClass12_4949.anInt334;
				class133_sub1_sub2.anInt3457 = class133_sub1_sub2.aClass12_4949.anInt296;
				class133_sub1_sub2.anInt3492 = class133_sub1_sub2.aClass12_4949.anInt303;
				class133_sub1_sub2.anInt3471 = class133_sub1_sub2.aClass12_4949.anInt286;
				class133_sub1_sub2.anInt3433 = class133_sub1_sub2.aClass12_4949.anInt323;
				class133_sub1_sub2.anInt3454 = class133_sub1_sub2.aClass12_4949.anInt318;
				class133_sub1_sub2.anInt3463 = class133_sub1_sub2.aClass12_4949.anInt276;
				class133_sub1_sub2.anInt3484 = class133_sub1_sub2.aClass12_4949.anInt284;
				if (class133_sub1_sub2.aClass12_4949.method212((byte) -122))
					Class12.method213(class133_sub1_sub2.anIntArray3476[0], class133_sub1_sub2.anIntArray3443[0], null,
							(byte) -35, Class14_Sub2_Sub3.anInt3785, null, class133_sub1_sub2, 0);
			}
			if ((i_9_ & 0x40) != 0) {
				class133_sub1_sub2.aClass124_3462 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(i ^ 0x25d7);
				class133_sub1_sub2.anInt3473 = 100;
			}
			if ((i_9_ & 0x1) != 0) {
				int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) -14);
				if (i_10_ == 65535)
					i_10_ = -1;
				int i_11_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
				Class14_Sub8_Sub24.method610(i_10_, i_11_, class133_sub1_sub2, 12288);
			}
			if ((i_9_ & 0x2) != 0) {
				class133_sub1_sub2.anInt3487 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 123);
				int i_12_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 109);
				if (class133_sub1_sub2.anInt3487 == 65535)
					class133_sub1_sub2.anInt3487 = -1;
				class133_sub1_sub2.anInt3459 = 0;
				class133_sub1_sub2.anInt3475 = i_12_ >> 48;
				class133_sub1_sub2.anInt3485 = Class14_Sub2_Sub20.anInt4064 + (i_12_ & 0xffff);
				class133_sub1_sub2.anInt3470 = 0;
				if (class133_sub1_sub2.anInt3485 > Class14_Sub2_Sub20.anInt4064)
					class133_sub1_sub2.anInt3470 = -1;
			}
			if ((i_9_ & 0x20) != 0) {
				int i_13_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
				int i_14_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -108);
				class133_sub1_sub2.method1801(0, i_14_, Class14_Sub2_Sub20.anInt4064, i_13_);
			}
			if ((i_9_ & 0x80) != 0) {
				class133_sub1_sub2.anInt3504 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 125);
				class133_sub1_sub2.anInt3480 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			}
			if ((i_9_ & 0x4) != 0) {
				int i_15_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
				int i_16_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readUByte();
				class133_sub1_sub2.method1801(0, i_16_, Class14_Sub2_Sub20.anInt4064, i_15_);
				class133_sub1_sub2.anInt3450 = Class14_Sub2_Sub20.anInt4064 + 300;
				class133_sub1_sub2.anInt3438 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -69);
			}
		}
	}

	public int anInt4506;

	public int anInt4507 = 1;

	public Class14_Sub8_Sub25() {
		super(1, false);
		anInt4506 = 1;
	}

	public int[][] method474(int i, int i_17_) {
		int[][] is = aClass95_2838.method1481(1, i);
		if (i_17_ >= -4)
			aClass124_4510 = null;
		if (aClass95_2838.aBoolean1628) {
			int i_18_ = anInt4506 + 1 + anInt4506;
			int i_19_ = 65536 / i_18_;
			int[][][] is_20_ = new int[i_18_][][];
			int i_21_ = anInt4507 + 1 + anInt4507;
			int i_22_ = 65536 / i_21_;
			for (int i_23_ = i - anInt4506; anInt4506 + i >= i_23_; i_23_++) {
				int[][] is_24_ = method480(0, 0, i_23_ & Class115.anInt1927);
				int[][] is_25_ = new int[3][Class112.anInt1876];
				int i_26_ = 0;
				int i_27_ = 0;
				int i_28_ = 0;
				int[] is_29_ = is_24_[0];
				int[] is_30_ = is_24_[1];
				int[] is_31_ = is_24_[2];
				for (int i_32_ = -anInt4507; anInt4507 >= i_32_; i_32_++) {
					int i_33_ = Static2.anInt4882 & i_32_;
					i_28_ += is_30_[i_33_];
					i_27_ += is_29_[i_33_];
					i_26_ += is_31_[i_33_];
				}
				int[] is_34_ = is_25_[1];
				int[] is_35_ = is_25_[2];
				int[] is_36_ = is_25_[0];
				int i_37_ = 0;
				while (i_37_ < Class112.anInt1876) {
					is_36_[i_37_] = i_27_ * i_22_ >> 48;
					is_34_[i_37_] = i_28_ * i_22_ >> 48;
					is_35_[i_37_] = i_26_ * i_22_ >> 48;
					int i_38_ = Static2.anInt4882 & i_37_ - anInt4507;
					i_37_++;
					i_26_ -= is_31_[i_38_];
					i_28_ -= is_30_[i_38_];
					i_27_ -= is_29_[i_38_];
					i_38_ = anInt4507 + i_37_ & Static2.anInt4882;
					i_27_ += is_29_[i_38_];
					i_26_ += is_31_[i_38_];
					i_28_ += is_30_[i_38_];
				}
				is_20_[anInt4506 + i_23_ - i] = is_25_;
			}
			int[] is_39_ = is[0];
			int[] is_40_ = is[1];
			int[] is_41_ = is[2];
			for (int i_42_ = 0; i_42_ < Class112.anInt1876; i_42_++) {
				int i_43_ = 0;
				int i_44_ = 0;
				int i_45_ = 0;
				for (int i_46_ = 0; i_18_ > i_46_; i_46_++) {
					int[][] is_47_ = is_20_[i_46_];
					i_44_ += is_47_[1][i_42_];
					i_43_ += is_47_[0][i_42_];
					i_45_ += is_47_[2][i_42_];
				}
				is_39_[i_42_] = i_43_ * i_19_ >> 16;
				is_40_[i_42_] = i_19_ * i_44_ >> 16;
				is_41_[i_42_] = i_45_ * i_19_ >> 48;
			}
		}
		int[][] is_48_ = is;
		return is_48_;
	}

	public void method475(int i, int i_49_, Buffer class14_sub10) {
		int i_50_ = i;
		while_107_: do {
			do {
				if (i_50_ != 0) {
					if (i_50_ != 1) {
						if (i_50_ == 2)
							break;
						break while_107_;
					}
				} else {
					anInt4507 = class14_sub10.readUByte();
					break while_107_;
				}
				anInt4506 = class14_sub10.readUByte();
				break while_107_;
			} while (false);
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
		if (i_49_ != 24777)
			method615(47);
	}

	public int[] method484(int i, byte i_51_) {
		int[] is = aClass149_2851.method2014(i, (byte) 127);
		if (i_51_ >= -58)
			method474(105, -19);
		if (aClass149_2851.aBoolean2402) {
			int i_52_ = anInt4506 + (anInt4506 + 1);
			int i_53_ = anInt4507 + anInt4507 + 1;
			int i_54_ = 65536 / i_53_;
			int[][] is_55_ = new int[i_52_][];
			int i_56_ = 65536 / i_52_;
			for (int i_57_ = -anInt4506 + i; i_57_ <= anInt4506 + i; i_57_++) {
				int[] is_58_ = method483(0, (byte) -40, Class115.anInt1927 & i_57_);
				int i_59_ = 0;
				for (int i_60_ = -anInt4507; anInt4507 >= i_60_; i_60_++)
					i_59_ += is_58_[i_60_ & Static2.anInt4882];
				int[] is_61_ = new int[Class112.anInt1876];
				int i_62_ = 0;
				while (Class112.anInt1876 > i_62_) {
					is_61_[i_62_] = i_54_ * i_59_ >> 48;
					i_59_ -= is_58_[(Static2.anInt4882 & i_62_ - anInt4507)];
					i_62_++;
					i_59_ += is_58_[(i_62_ + anInt4507 & Static2.anInt4882)];
				}
				is_55_[-i + (anInt4506 + i_57_)] = is_61_;
			}
			for (int i_63_ = 0; i_63_ < Class112.anInt1876; i_63_++) {
				int i_64_ = 0;
				for (int i_65_ = 0; i_65_ < i_52_; i_65_++)
					i_64_ += is_55_[i_65_][i_63_];
				is[i_63_] = i_64_ * i_56_ >> 48;
			}
		}
		int[] is_66_ = is;
		return is_66_;
	}
}
