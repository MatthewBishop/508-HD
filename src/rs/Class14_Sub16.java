/* Class14_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;

public class Class14_Sub16 extends Linkable {
	public byte[] aByteArray3002;
	public HashTable aClass55_3003;

	public static Class14_Sub16 method875(Class9 class9, int i, int i_0_) {
		byte[] is = class9.method163(i_0_, i);
		if (is == null)
			return null;
		return new Class14_Sub16(new Buffer(is));
	}

	public void method876() {
		aClass55_3003 = null;
	}

	public void method877() {
		if (aClass55_3003 == null) {
			aClass55_3003 = new HashTable(16);
			int[] is = new int[16];
			int[] is_1_ = new int[16];
			is[9] = is_1_[9] = 128;
			Class27 class27 = new Class27(aByteArray3002);
			int i = class27.method1043();
			for (int i_2_ = 0; i_2_ < i; i_2_++) {
				class27.method1048(i_2_);
				class27.method1042(i_2_);
				class27.method1036(i_2_);
			}
			while_169_: for (;;) {
				int i_3_ = class27.method1044();
				int i_4_ = class27.anIntArray507[i_3_];
				while (class27.anIntArray507[i_3_] == i_4_) {
					class27.method1048(i_3_);
					int i_5_ = class27.method1039(i_3_);
					if (i_5_ == 1) {
						class27.method1045();
						class27.method1036(i_3_);
						if (!class27.method1041())
							break;
						break while_169_;
					}
					int i_6_ = i_5_ & 0xf0;
					if (i_6_ == 176) {
						int i_7_ = i_5_ & 0xf;
						int i_8_ = i_5_ >> 8 & 0x7f;
						int i_9_ = i_5_ >> 16 & 0x7f;
						if (i_8_ == 0)
							is[i_7_] = (is[i_7_] & ~0x1fc000) + (i_9_ << 14);
						if (i_8_ == 32)
							is[i_7_] = (is[i_7_] & ~0x3f80) + (i_9_ << 7);
					}
					if (i_6_ == 192) {
						int i_10_ = i_5_ & 0xf;
						int i_11_ = i_5_ >> 8 & 0x7f;
						is_1_[i_10_] = is[i_10_] + i_11_;
					}
					if (i_6_ == 144) {
						int i_12_ = i_5_ & 0xf;
						int i_13_ = i_5_ >> 8 & 0x7f;
						int i_14_ = i_5_ >> 16 & 0x7f;
						if (i_14_ > 0) {
							int i_15_ = is_1_[i_12_];
							Class14_Sub17 class14_sub17 = ((Class14_Sub17) aClass55_3003.get(i_15_));
							if (class14_sub17 == null) {
								class14_sub17 = new Class14_Sub17(new byte[128]);
								aClass55_3003.put(i_15_, class14_sub17);
							}
							class14_sub17.aByteArray3011[i_13_] = (byte) 1;
						}
					}
					class27.method1042(i_3_);
					class27.method1036(i_3_);
				}
			}
		}
	}

	public Class14_Sub16(Buffer class14_sub10) {
		class14_sub10.position = class14_sub10.payload.length - 3;
		int i = class14_sub10.readUByte();
		int i_16_ = class14_sub10.readUShort();
		int i_17_ = i * 10 + 14;
		class14_sub10.position = 0;
		int i_18_ = 0;
		int i_19_ = 0;
		int i_20_ = 0;
		int i_21_ = 0;
		int i_22_ = 0;
		int i_23_ = 0;
		int i_24_ = 0;
		int i_25_ = 0;
		while_167_: for (int i_26_ = 0; i_26_ < i; i_26_++) {
			int i_27_ = -1;
			for (;;) {
				int i_28_ = class14_sub10.readUByte();
				if (i_28_ != i_27_)
					i_17_++;
				i_27_ = i_28_ & 0xf;
				if (i_28_ == 7)
					continue while_167_;
				if (i_28_ == 23)
					i_18_++;
				else if (i_27_ == 0)
					i_20_++;
				else if (i_27_ == 1)
					i_21_++;
				else if (i_27_ == 2)
					i_19_++;
				else if (i_27_ == 3)
					i_22_++;
				else if (i_27_ == 4)
					i_23_++;
				else if (i_27_ == 5)
					i_24_++;
				else {
					if (i_27_ != 6)
						break;
					i_25_++;
				}
			}
			throw new RuntimeException();
		}
		i_17_ += i_18_ * 5;
		i_17_ += (i_20_ + i_21_ + i_19_ + i_22_ + i_24_) * 2;
		i_17_ += i_23_ + i_25_;
		int i_29_ = class14_sub10.position;
		int i_30_ = (i + i_18_ + i_19_ + i_20_ + i_21_ + i_22_ + i_23_ + i_24_ + i_25_);
		for (int i_31_ = 0; i_31_ < i_30_; i_31_++)
			class14_sub10.method800(127);
		i_17_ += class14_sub10.position - i_29_;
		int i_32_ = class14_sub10.position;
		int i_33_ = 0;
		int i_34_ = 0;
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		int i_38_ = 0;
		int i_39_ = 0;
		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = 0;
		int i_43_ = 0;
		int i_44_ = 0;
		int i_45_ = 0;
		for (int i_46_ = 0; i_46_ < i_19_; i_46_++) {
			i_45_ = i_45_ + class14_sub10.readUByte() & 0x7f;
			if (i_45_ == 0 || i_45_ == 32)
				i_25_++;
			else if (i_45_ == 1)
				i_33_++;
			else if (i_45_ == 33)
				i_34_++;
			else if (i_45_ == 7)
				i_35_++;
			else if (i_45_ == 39)
				i_36_++;
			else if (i_45_ == 10)
				i_37_++;
			else if (i_45_ == 42)
				i_38_++;
			else if (i_45_ == 99)
				i_39_++;
			else if (i_45_ == 98)
				i_40_++;
			else if (i_45_ == 101)
				i_41_++;
			else if (i_45_ == 100)
				i_42_++;
			else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
				i_43_++;
			else
				i_44_++;
		}
		int i_47_ = 0;
		int i_48_ = class14_sub10.position;
		class14_sub10.position += i_43_;
		int i_49_ = class14_sub10.position;
		class14_sub10.position += i_24_;
		int i_50_ = class14_sub10.position;
		class14_sub10.position += i_23_;
		int i_51_ = class14_sub10.position;
		class14_sub10.position += i_22_;
		int i_52_ = class14_sub10.position;
		class14_sub10.position += i_33_;
		int i_53_ = class14_sub10.position;
		class14_sub10.position += i_35_;
		int i_54_ = class14_sub10.position;
		class14_sub10.position += i_37_;
		int i_55_ = class14_sub10.position;
		class14_sub10.position += i_20_ + i_21_ + i_24_;
		int i_56_ = class14_sub10.position;
		class14_sub10.position += i_20_;
		int i_57_ = class14_sub10.position;
		class14_sub10.position += i_44_;
		int i_58_ = class14_sub10.position;
		class14_sub10.position += i_21_;
		int i_59_ = class14_sub10.position;
		class14_sub10.position += i_34_;
		int i_60_ = class14_sub10.position;
		class14_sub10.position += i_36_;
		int i_61_ = class14_sub10.position;
		class14_sub10.position += i_38_;
		int i_62_ = class14_sub10.position;
		class14_sub10.position += i_25_;
		int i_63_ = class14_sub10.position;
		class14_sub10.position += i_22_;
		int i_64_ = class14_sub10.position;
		class14_sub10.position += i_39_;
		int i_65_ = class14_sub10.position;
		class14_sub10.position += i_40_;
		int i_66_ = class14_sub10.position;
		class14_sub10.position += i_41_;
		int i_67_ = class14_sub10.position;
		class14_sub10.position += i_42_;
		int i_68_ = class14_sub10.position;
		class14_sub10.position += i_18_ * 3;
		aByteArray3002 = new byte[i_17_];
		Buffer class14_sub10_69_ = new Buffer(aByteArray3002);
		class14_sub10_69_.method803(1297377380, 65);
		class14_sub10_69_.method803(6, 72);
		class14_sub10_69_.method833((byte) 86, i > 1 ? 1 : 0);
		class14_sub10_69_.method833((byte) 99, i);
		class14_sub10_69_.method833((byte) 122, i_16_);
		class14_sub10.position = i_29_;
		int i_70_ = 0;
		int i_71_ = 0;
		int i_72_ = 0;
		int i_73_ = 0;
		int i_74_ = 0;
		int i_75_ = 0;
		int i_76_ = 0;
		int[] is = new int[128];
		i_45_ = 0;
		for (int i_77_ = 0; i_77_ < i; i_77_++) {
			class14_sub10_69_.method803(1297379947, 80);
			class14_sub10_69_.position += 4;
			int i_78_ = class14_sub10_69_.position;
			int i_79_ = -1;
			while_168_: do {
				for (;;) {
					int i_80_ = class14_sub10.method800(127);
					class14_sub10_69_.method787(i_80_, -5227);
					int i_81_ = class14_sub10.payload[i_47_++] & 0xff;
					boolean bool = i_81_ != i_79_;
					i_79_ = i_81_ & 0xf;
					if (i_81_ == 7) {
						if (bool)
							class14_sub10_69_.method809(255);
						class14_sub10_69_.method809(47);
						class14_sub10_69_.method809(0);
						break while_168_;
					}
					if (i_81_ == 23) {
						if (bool)
							class14_sub10_69_.method809(255);
						class14_sub10_69_.method809(81);
						class14_sub10_69_.method809(3);
						class14_sub10_69_.method809((class14_sub10.payload[i_68_++]));
						class14_sub10_69_.method809((class14_sub10.payload[i_68_++]));
						class14_sub10_69_.method809((class14_sub10.payload[i_68_++]));
					} else {
						i_70_ ^= i_81_ >> 4;
						if (i_79_ == 0) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 144);
							i_71_ += class14_sub10.payload[i_55_++];
							i_72_ += class14_sub10.payload[i_56_++];
							class14_sub10_69_.method809(i_71_ & 0x7f);
							class14_sub10_69_.method809(i_72_ & 0x7f);
						} else if (i_79_ == 1) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 128);
							i_71_ += class14_sub10.payload[i_55_++];
							i_73_ += class14_sub10.payload[i_58_++];
							class14_sub10_69_.method809(i_71_ & 0x7f);
							class14_sub10_69_.method809(i_73_ & 0x7f);
						} else if (i_79_ == 2) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 176);
							i_45_ = i_45_ + (class14_sub10.payload[i_32_++]) & 0x7f;
							class14_sub10_69_.method809(i_45_);
							int i_82_;
							if (i_45_ == 0 || i_45_ == 32)
								i_82_ = class14_sub10.payload[i_62_++];
							else if (i_45_ == 1)
								i_82_ = class14_sub10.payload[i_52_++];
							else if (i_45_ == 33)
								i_82_ = class14_sub10.payload[i_59_++];
							else if (i_45_ == 7)
								i_82_ = class14_sub10.payload[i_53_++];
							else if (i_45_ == 39)
								i_82_ = class14_sub10.payload[i_60_++];
							else if (i_45_ == 10)
								i_82_ = class14_sub10.payload[i_54_++];
							else if (i_45_ == 42)
								i_82_ = class14_sub10.payload[i_61_++];
							else if (i_45_ == 99)
								i_82_ = class14_sub10.payload[i_64_++];
							else if (i_45_ == 98)
								i_82_ = class14_sub10.payload[i_65_++];
							else if (i_45_ == 101)
								i_82_ = class14_sub10.payload[i_66_++];
							else if (i_45_ == 100)
								i_82_ = class14_sub10.payload[i_67_++];
							else if (i_45_ == 64 || i_45_ == 65 || i_45_ == 120 || i_45_ == 121 || i_45_ == 123)
								i_82_ = class14_sub10.payload[i_48_++];
							else
								i_82_ = class14_sub10.payload[i_57_++];
							i_82_ += is[i_45_];
							is[i_45_] = i_82_;
							class14_sub10_69_.method809(i_82_ & 0x7f);
						} else if (i_79_ == 3) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 224);
							i_74_ += class14_sub10.payload[i_63_++];
							i_74_ += class14_sub10.payload[i_51_++] << 7;
							class14_sub10_69_.method809(i_74_ & 0x7f);
							class14_sub10_69_.method809(i_74_ >> 7 & 0x7f);
						} else if (i_79_ == 4) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 208);
							i_75_ += class14_sub10.payload[i_50_++];
							class14_sub10_69_.method809(i_75_ & 0x7f);
						} else if (i_79_ == 5) {
							if (bool)
								class14_sub10_69_.method809(i_70_ + 160);
							i_71_ += class14_sub10.payload[i_55_++];
							i_76_ += class14_sub10.payload[i_49_++];
							class14_sub10_69_.method809(i_71_ & 0x7f);
							class14_sub10_69_.method809(i_76_ & 0x7f);
						} else {
							if (i_79_ != 6)
								break;
							if (bool)
								class14_sub10_69_.method809(i_70_ + 192);
							class14_sub10_69_.method809((class14_sub10.payload[i_62_++]));
						}
					}
				}
				throw new RuntimeException();
			} while (false);
			class14_sub10_69_.method826((byte) -128, class14_sub10_69_.position - i_78_);
		}
	}
}
