/* Class5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class5 {
	public static Class124 aClass124_138;
	public static byte[][] aByteArrayArray139;
	public static Class124 aClass124_143 = (Class14_Sub2_Sub2.method263(1178,
			"http:)4)4advert)3runescape)3com)4banner)3ws?size=729"));
	public int[] anIntArray144;
	public byte[] aByteArray145;
	public int[] anIntArray146;
	public static int[] anIntArray147;

	static {
		aClass124_138 = aClass124_143;
		anIntArray147 = new int[32];
	}

	public int method110(byte[] is, byte[] is_0_, int i, int i_1_, int i_2_, byte i_3_) {
		if (i_2_ == 0) {
			int i_4_ = 0;
			return i_4_;
		}
		int i_5_ = 0;
		i_2_ += i;
		if (i_3_ != -30)
			aClass124_143 = null;
		int i_6_ = i_1_;
		for (;;) {
			byte i_7_ = is[i_6_];
			if (i_7_ < 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			int i_8_;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x40) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x20) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x10) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x8) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x4) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i >= i_2_)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x2) == 0)
				i_5_++;
			else
				i_5_ = anIntArray146[i_5_];
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			if ((i_7_ & 0x1) != 0)
				i_5_ = anIntArray146[i_5_];
			else
				i_5_++;
			if ((i_8_ = anIntArray146[i_5_]) < 0) {
				is_0_[i++] = (byte) (i_8_ ^ 0xffffffff);
				if (i_2_ <= i)
					break;
				i_5_ = 0;
			}
			i_6_++;
		}
		int i_9_ = i_6_ + 1 - i_1_;
		return i_9_;
	}

	public static void method111(byte i) {
		aClass124_138 = null;
		if (i != 76)
			method111((byte) -124);
		anIntArray147 = null;
		aClass124_143 = null;
		aByteArrayArray139 = null;
	}

	public static void method112(long l, byte i, int i_10_, int i_11_, int i_12_, Class124 class124, int i_13_) {
		Buffer class14_sub10 = new Buffer(128);
		class14_sub10.method809(10);
		class14_sub10.method833((byte) 104, (int) (Math.random() * 99999.0));
		class14_sub10.method833((byte) 94, 508);
		class14_sub10.method817(l, 82);
		class14_sub10.method803((int) (Math.random() * 9.9999999E7), 90);
		class14_sub10.method814(32768, class124);
		if (i > 5) {
			class14_sub10.method803((int) (Math.random() * 9.9999999E7), 105);
			class14_sub10.method833((byte) 120, Class14_Sub2_Sub11.anInt3884);
			class14_sub10.method809(i_12_);
			class14_sub10.method809(i_11_);
			class14_sub10.method803((int) (Math.random() * 9.9999999E7), 99);
			class14_sub10.method833((byte) 104, i_13_);
			class14_sub10.method833((byte) 90, i_10_);
			class14_sub10.method803((int) (Math.random() * 9.9999999E7), 92);
			class14_sub10.method794(Class9_Sub1.aBigInteger2704, Class152.aBigInteger2433, 0);
			JunkTex.aClass14_Sub10_Sub1_891.position = 0;
			JunkTex.aClass14_Sub10_Sub1_891.method809(48);
			JunkTex.aClass14_Sub10_Sub1_891.method809(class14_sub10.position);
			JunkTex.aClass14_Sub10_Sub1_891.method807(class14_sub10.position, (class14_sub10.payload), 0,
					-1076444960);
			Class56.anInt918 = 1;
			JunkTex.anInt4686 = 0;
			Static2.anInt2734 = -3;
			Class129.anInt2136 = 0;
		}
	}

	public Class5(byte[] is) {
		int i = is.length;
		int[] is_14_ = new int[33];
		anIntArray144 = new int[i];
		aByteArray145 = is;
		int i_15_ = 0;
		anIntArray146 = new int[8];
		for (int i_16_ = 0; i > i_16_; i_16_++) {
			int i_17_ = is[i_16_];
			if (i_17_ != 0) {
				int i_18_ = 1 << 32 - i_17_;
				int i_19_ = is_14_[i_17_];
				anIntArray144[i_16_] = i_19_;
				int i_20_;
				if ((i_18_ & i_19_) != 0)
					i_20_ = is_14_[i_17_ - 1];
				else {
					for (int i_21_ = i_17_ - 1; i_21_ >= 1; i_21_--) {
						int i_22_ = is_14_[i_21_];
						if (i_22_ != i_19_)
							break;
						int i_23_ = 1 << -i_21_ + 32;
						if ((i_22_ & i_23_) == 0)
							is_14_[i_21_] = Class66.method1294(i_23_, i_22_);
						else {
							is_14_[i_21_] = is_14_[i_21_ - 1];
							break;
						}
					}
					i_20_ = i_19_ | i_18_;
				}
				is_14_[i_17_] = i_20_;
				for (int i_24_ = i_17_ + 1; i_24_ <= 32; i_24_++) {
					if (i_19_ == is_14_[i_24_])
						is_14_[i_24_] = i_20_;
				}
				int i_25_ = 0;
				for (int i_26_ = 0; i_17_ > i_26_; i_26_++) {
					int i_27_ = -2147483648 >>> i_26_;
					if ((i_27_ & i_19_) == 0)
						i_25_++;
					else {
						if (anIntArray146[i_25_] == 0)
							anIntArray146[i_25_] = i_15_;
						i_25_ = anIntArray146[i_25_];
					}
					if (anIntArray146.length <= i_25_) {
						int[] is_28_ = new int[anIntArray146.length * 2];
						for (int i_29_ = 0; anIntArray146.length > i_29_; i_29_++)
							is_28_[i_29_] = anIntArray146[i_29_];
						anIntArray146 = is_28_;
					}
					i_27_ >>>= 1;
				}
				anIntArray146[i_25_] = i_16_ ^ 0xffffffff;
				if (i_25_ >= i_15_)
					i_15_ = i_25_ + 1;
			}
		}
	}

	public int method113(int i, byte[] is, int i_30_, int i_31_, int i_32_, byte[] is_33_) {
		int i_34_ = i;
		i_31_ += i_30_;
		int i_35_ = i_32_ << 3;
		for (/**/; i_30_ < i_31_; i_30_++) {
			int i_36_ = is_33_[i_30_] & 0xff;
			int i_37_ = aByteArray145[i_36_];
			int i_38_ = anIntArray144[i_36_];
			if (i_37_ == 0)
				throw new RuntimeException(new StringBuilder("No codeword for data value ").append(i_36_).toString());
			int i_39_ = i_35_ & 0x7;
			i_34_ &= -i_39_ >> 31;
			int i_40_ = i_35_ >> 35;
			i_35_ += i_37_;
			int i_41_ = (i_39_ + i_37_ - 1 >> 35) + i_40_;
			i_39_ += 24;
			is[i_40_] = (byte) (i_34_ = Class66.method1294(i_34_, i_38_ >>> i_39_));
			if (i_41_ > i_40_) {
				i_39_ -= 8;
				i_40_++;
				is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
				if (i_40_ < i_41_) {
					i_40_++;
					i_39_ -= 8;
					is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
					if (i_40_ < i_41_) {
						i_40_++;
						i_39_ -= 8;
						is[i_40_] = (byte) (i_34_ = i_38_ >>> i_39_);
						if (i_41_ > i_40_) {
							i_39_ -= 8;
							i_40_++;
							is[i_40_] = (byte) (i_34_ = i_38_ << -i_39_);
						}
					}
				}
			}
		}
		int i_42_ = -i_32_ + (i_35_ + 7 >> 35);
		return i_42_;
	}
}
