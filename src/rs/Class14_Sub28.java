/* Class14_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Linkable;
import com.jagex.link.ref.SoftCache;

import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Static;

public class Class14_Sub28 extends Linkable {
	public Class14_Sub12_Sub1[] aClass14_Sub12_Sub1Array3212;
	public byte[] aByteArray3213;
	public static SoftCache aClass52_3217;
	public int[] anIntArray3218;
	public static Class124 aClass124_3219 = Class14_Sub2_Sub2.method263(1178, "Loading config )2 ");
	public byte[] aByteArray3220;
	public Class127[] aClass127Array3221;
	public static int anInt3222 = 0;
	public short[] aShortArray3223;
	public int anInt3224;
	public static int[] anIntArray3225;
	public static Class124 aClass124_3226 = aClass124_3219;
	public byte[] aByteArray3227;
	public static Class124 aClass124_3228;
	public static Class124 aClass124_3229;
	public static Class94 aClass94_3230;

	static {
		anIntArray3225 = new int[] { 1, 2, 4, 8 };
		aClass52_3217 = new SoftCache(4);
		aClass124_3228 = Class14_Sub2_Sub2.method263(1178, "Please wait)3)3)3");
		aClass94_3230 = null;
		aClass124_3229 = aClass124_3228;
	}

	public static void method926(byte i) {
		aClass124_3228 = null;
		anIntArray3225 = null;
		if (i == 27) {
			aClass52_3217 = null;
			aClass124_3226 = null;
			aClass94_3230 = null;
			aClass124_3229 = null;
			aClass124_3219 = null;
		}
	}

	public boolean method927(int[] is, Class120 class120, boolean bool, byte[] is_0_) {
		boolean bool_1_ = bool;
		Class14_Sub12_Sub1 class14_sub12_sub1 = null;
		int i = 0;
		for (int i_2_ = 0; i_2_ < 128; i_2_++) {
			if (is_0_ == null || is_0_[i_2_] != 0) {
				int i_3_ = anIntArray3218[i_2_];
				if (i_3_ != 0) {
					if (i_3_ != i) {
						i = i_3_;
						if ((--i_3_ & 0x1) == 0)
							class14_sub12_sub1 = class120.method1619(is, 23698, i_3_ >> 34);
						else
							class14_sub12_sub1 = class120.method1618(is, (byte) -38, i_3_ >> 2);
						if (class14_sub12_sub1 == null)
							bool_1_ = false;
					}
					if (class14_sub12_sub1 != null) {
						aClass14_Sub12_Sub1Array3212[i_2_] = class14_sub12_sub1;
						anIntArray3218[i_2_] = 0;
					}
				}
			}
		}
		boolean bool_4_ = bool_1_;
		return bool_4_;
	}

	public static void method928(int i) {
		if (i != 16867)
			aClass124_3226 = null;
		boolean bool = false;
		while (!bool) {
			bool = true;
			for (int i_5_ = 0; Class14_Sub8_Sub38.anInt4729 - 1 > i_5_; i_5_++) {
				if (Class14_Sub29.aShortArray3262[i_5_] < 1000 && Class14_Sub29.aShortArray3262[i_5_ + 1] > 1000) {
					bool = false;
					Class124 class124 = RuntimeException_Sub1.aClass124Array2459[i_5_];
					RuntimeException_Sub1.aClass124Array2459[i_5_] = RuntimeException_Sub1.aClass124Array2459[i_5_ + 1];
					RuntimeException_Sub1.aClass124Array2459[i_5_ + 1] = class124;
					Class124 class124_6_ = Class112.aClass124Array1875[i_5_];
					Class112.aClass124Array1875[i_5_] = Class112.aClass124Array1875[i_5_ + 1];
					Class112.aClass124Array1875[i_5_ + 1] = class124_6_;
					int i_7_ = Class14_Sub8_Sub27.anIntArray4544[i_5_];
					Class14_Sub8_Sub27.anIntArray4544[i_5_] = Class14_Sub8_Sub27.anIntArray4544[i_5_ + 1];
					Class14_Sub8_Sub27.anIntArray4544[i_5_ + 1] = i_7_;
					i_7_ = Static.anIntArray3288[i_5_];
					Static.anIntArray3288[i_5_] = Static.anIntArray3288[i_5_ + 1];
					Static.anIntArray3288[i_5_ + 1] = i_7_;
					short i_8_ = Class14_Sub29.aShortArray3262[i_5_];
					Class14_Sub29.aShortArray3262[i_5_] = Class14_Sub29.aShortArray3262[i_5_ + 1];
					Class14_Sub29.aShortArray3262[i_5_ + 1] = i_8_;
					long l = Static.aLongArray3924[i_5_];
					Static.aLongArray3924[i_5_] = Static.aLongArray3924[i_5_ + 1];
					Static.aLongArray3924[i_5_ + 1] = l;
				}
			}
		}
	}

	public void method929(byte i) {
		anIntArray3218 = null;
		if (i > -53)
			method926((byte) 99);
	}

	public Class14_Sub28() {
		/* empty */
	}

	public Class14_Sub28(byte[] is) {
		aByteArray3227 = new byte[128];
		anIntArray3218 = new int[128];
		aClass14_Sub12_Sub1Array3212 = new Class14_Sub12_Sub1[128];
		aShortArray3223 = new short[128];
		aByteArray3213 = new byte[128];
		aClass127Array3221 = new Class127[128];
		aByteArray3220 = new byte[128];
		int i = 0;
		Buffer class14_sub10;
		for (class14_sub10 = new Buffer(
				is); class14_sub10.payload[i + class14_sub10.position] != 0; i++) {
			/* empty */
		}
		byte[] is_9_ = new byte[i];
		for (int i_10_ = 0; i > i_10_; i_10_++)
			is_9_[i_10_] = class14_sub10.method780((byte) -77);
		class14_sub10.position++;
		i++;
		int i_11_ = class14_sub10.position;
		class14_sub10.position += i;
		int i_12_;
		for (i_12_ = 0; (class14_sub10.payload[class14_sub10.position + i_12_] != 0); i_12_++) {
			/* empty */
		}
		byte[] is_13_ = new byte[i_12_];
		for (int i_14_ = 0; i_12_ > i_14_; i_14_++)
			is_13_[i_14_] = class14_sub10.method780((byte) -77);
		class14_sub10.position++;
		int i_15_ = class14_sub10.position;
		int i_16_ = 0;
		i_12_++;
		for (class14_sub10.position += i_12_; (class14_sub10.payload[class14_sub10.position
				+ i_16_] != 0); i_16_++) {
			/* empty */
		}
		byte[] is_17_ = new byte[i_16_];
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++)
			is_17_[i_18_] = class14_sub10.method780((byte) -77);
		i_16_++;
		class14_sub10.position++;
		byte[] is_19_ = new byte[i_16_];
		int i_20_;
		if (i_16_ > 1) {
			i_20_ = 2;
			is_19_[1] = (byte) 1;
			int i_21_ = 1;
			for (int i_22_ = 2; i_16_ > i_22_; i_22_++) {
				int i_23_ = class14_sub10.method798();
				if (i_23_ == 0)
					i_21_ = i_20_++;
				else {
					if (i_23_ <= i_21_)
						i_23_--;
					i_21_ = i_23_;
				}
				is_19_[i_22_] = (byte) i_21_;
			}
		} else
			i_20_ = i_16_;
		Class127[] class127s = new Class127[i_20_];
		for (int i_24_ = 0; class127s.length > i_24_; i_24_++) {
			Class127 class127 = class127s[i_24_] = new Class127();
			int i_25_ = class14_sub10.method798();
			if (i_25_ > 0)
				class127.aByteArray2109 = new byte[i_25_ * 2];
			i_25_ = class14_sub10.method798();
			if (i_25_ > 0) {
				class127.aByteArray2098 = new byte[i_25_ * 2 + 2];
				class127.aByteArray2098[1] = (byte) 64;
			}
		}
		int i_26_ = class14_sub10.method798();
		int i_27_ = 0;
		byte[] is_28_ = i_26_ <= 0 ? null : new byte[i_26_ * 2];
		i_26_ = class14_sub10.method798();
		for (/**/; (class14_sub10.payload[class14_sub10.position + i_27_] != 0); i_27_++) {
			/* empty */
		}
		byte[] is_29_ = new byte[i_27_];
		byte[] is_30_ = i_26_ <= 0 ? null : new byte[i_26_ * 2];
		for (int i_31_ = 0; i_27_ > i_31_; i_31_++)
			is_29_[i_31_] = class14_sub10.method780((byte) -77);
		class14_sub10.position++;
		i_27_++;
		int i_32_ = 0;
		for (int i_33_ = 0; i_33_ < 128; i_33_++) {
			i_32_ += class14_sub10.method798();
			aShortArray3223[i_33_] = (short) i_32_;
		}
		i_32_ = 0;
		for (int i_34_ = 0; i_34_ < 128; i_34_++) {
			i_32_ += class14_sub10.method798();
			aShortArray3223[i_34_] += i_32_ << 8;
		}
		int i_35_ = 0;
		int i_36_ = 0;
		int i_37_ = 0;
		for (int i_38_ = 0; i_38_ < 128; i_38_++) {
			if (i_36_ == 0) {
				if (i_35_ >= is_29_.length)
					i_36_ = -1;
				else
					i_36_ = is_29_[i_35_++];
				i_37_ = class14_sub10.method800(127);
			}
			i_36_--;
			aShortArray3223[i_38_] += Class14_Sub8_Sub26.method617(i_37_ - 1, 2) << 46;
			anIntArray3218[i_38_] = i_37_;
		}
		i_35_ = 0;
		i_36_ = 0;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < 128; i_40_++) {
			if (anIntArray3218[i_40_] != 0) {
				if (i_36_ == 0) {
					if (is_9_.length <= i_35_)
						i_36_ = -1;
					else
						i_36_ = is_9_[i_35_++];
					i_39_ = class14_sub10.payload[i_11_++] - 1;
				}
				aByteArray3220[i_40_] = (byte) i_39_;
				i_36_--;
			}
		}
		i_35_ = 0;
		int i_41_ = 0;
		i_36_ = 0;
		for (int i_42_ = 0; i_42_ < 128; i_42_++) {
			if (anIntArray3218[i_42_] != 0) {
				if (i_36_ == 0) {
					if (i_35_ >= is_13_.length)
						i_36_ = -1;
					else
						i_36_ = is_13_[i_35_++];
					i_41_ = class14_sub10.payload[i_15_++] + 16 << 2;
				}
				i_36_--;
				aByteArray3227[i_42_] = (byte) i_41_;
			}
		}
		Class127 class127 = null;
		i_35_ = 0;
		i_36_ = 0;
		for (int i_43_ = 0; i_43_ < 128; i_43_++) {
			if (anIntArray3218[i_43_] != 0) {
				if (i_36_ == 0) {
					class127 = class127s[is_19_[i_35_]];
					if (i_35_ >= is_17_.length)
						i_36_ = -1;
					else
						i_36_ = is_17_[i_35_++];
				}
				i_36_--;
				aClass127Array3221[i_43_] = class127;
			}
		}
		i_36_ = 0;
		i_35_ = 0;
		int i_44_ = 0;
		for (int i_45_ = 0; i_45_ < 128; i_45_++) {
			if (i_36_ == 0) {
				if (i_35_ >= is_29_.length)
					i_36_ = -1;
				else
					i_36_ = is_29_[i_35_++];
				if (anIntArray3218[i_45_] > 0)
					i_44_ = class14_sub10.method798() + 1;
			}
			i_36_--;
			aByteArray3213[i_45_] = (byte) i_44_;
		}
		anInt3224 = class14_sub10.method798() + 1;
		for (int i_46_ = 0; i_46_ < i_20_; i_46_++) {
			Class127 class127_47_ = class127s[i_46_];
			if (class127_47_.aByteArray2109 != null) {
				for (int i_48_ = 1; i_48_ < class127_47_.aByteArray2109.length; i_48_ += 2)
					class127_47_.aByteArray2109[i_48_] = class14_sub10.method780((byte) -77);
			}
			if (class127_47_.aByteArray2098 != null) {
				for (int i_49_ = 3; class127_47_.aByteArray2098.length - 2 > i_49_; i_49_ += 2)
					class127_47_.aByteArray2098[i_49_] = class14_sub10.method780((byte) -77);
			}
		}
		if (is_28_ != null) {
			for (int i_50_ = 1; is_28_.length > i_50_; i_50_ += 2)
				is_28_[i_50_] = class14_sub10.method780((byte) -77);
		}
		if (is_30_ != null) {
			for (int i_51_ = 1; i_51_ < is_30_.length; i_51_ += 2)
				is_30_[i_51_] = class14_sub10.method780((byte) -77);
		}
		for (int i_52_ = 0; i_20_ > i_52_; i_52_++) {
			Class127 class127_53_ = class127s[i_52_];
			if (class127_53_.aByteArray2098 != null) {
				i_32_ = 0;
				for (int i_54_ = 2; i_54_ < class127_53_.aByteArray2098.length; i_54_ += 2) {
					i_32_ = class14_sub10.method798() + (i_32_ + 1);
					class127_53_.aByteArray2098[i_54_] = (byte) i_32_;
				}
			}
		}
		for (int i_55_ = 0; i_55_ < i_20_; i_55_++) {
			Class127 class127_56_ = class127s[i_55_];
			if (class127_56_.aByteArray2109 != null) {
				i_32_ = 0;
				for (int i_57_ = 2; class127_56_.aByteArray2109.length > i_57_; i_57_ += 2) {
					i_32_ = class14_sub10.method798() + (i_32_ + 1);
					class127_56_.aByteArray2109[i_57_] = (byte) i_32_;
				}
			}
		}
		if (is_28_ != null) {
			i_32_ = class14_sub10.method798();
			is_28_[0] = (byte) i_32_;
			for (int i_58_ = 2; i_58_ < is_28_.length; i_58_ += 2) {
				i_32_ = i_32_ + class14_sub10.method798() + 1;
				is_28_[i_58_] = (byte) i_32_;
			}
			int i_59_ = is_28_[0];
			int i_60_ = is_28_[1];
			for (int i_61_ = 0; i_61_ < i_59_; i_61_++)
				aByteArray3213[i_61_] = (byte) (i_60_ * aByteArray3213[i_61_] + 32 >> 38);
			int i_62_ = 2;
			while (i_62_ < is_28_.length) {
				int i_63_ = is_28_[i_62_];
				int i_64_ = is_28_[i_62_ + 1];
				i_62_ += 2;
				int i_65_ = (i_63_ - i_59_) * i_60_ + (-i_59_ + i_63_) / 2;
				for (int i_66_ = i_59_; i_66_ < i_63_; i_66_++) {
					int i_67_ = Class14_Sub2_Sub3.method270(i_65_, 1, -i_59_ + i_63_);
					aByteArray3213[i_66_] = (byte) (aByteArray3213[i_66_] * i_67_ + 32 >> 6);
					i_65_ += i_64_ - i_60_;
				}
				i_59_ = i_63_;
				i_60_ = i_64_;
			}
			Object object = null;
			for (int i_68_ = i_59_; i_68_ < 128; i_68_++)
				aByteArray3213[i_68_] = (byte) (aByteArray3213[i_68_] * i_60_ + 32 >> 6);
		}
		if (is_30_ != null) {
			i_32_ = class14_sub10.method798();
			is_30_[0] = (byte) i_32_;
			for (int i_69_ = 2; is_30_.length > i_69_; i_69_ += 2) {
				i_32_ = class14_sub10.method798() + (i_32_ + 1);
				is_30_[i_69_] = (byte) i_32_;
			}
			int i_70_ = is_30_[0];
			int i_71_ = is_30_[1] << 33;
			for (int i_72_ = 0; i_72_ < i_70_; i_72_++) {
				int i_73_ = (aByteArray3227[i_72_] & 0xff) + i_71_;
				if (i_73_ < 0)
					i_73_ = 0;
				if (i_73_ > 128)
					i_73_ = 128;
				aByteArray3227[i_72_] = (byte) i_73_;
			}
			int i_74_ = 2;
			while (i_74_ < is_30_.length) {
				int i_75_ = is_30_[i_74_ + 1] << 1;
				int i_76_ = is_30_[i_74_];
				int i_77_ = (i_76_ - i_70_) * i_71_ + (-i_70_ + i_76_) / 2;
				for (int i_78_ = i_70_; i_76_ > i_78_; i_78_++) {
					int i_79_ = Class14_Sub2_Sub3.method270(i_77_, 1, i_76_ - i_70_);
					int i_80_ = (aByteArray3227[i_78_] & 0xff) + i_79_;
					if (i_80_ < 0)
						i_80_ = 0;
					if (i_80_ > 128)
						i_80_ = 128;
					aByteArray3227[i_78_] = (byte) i_80_;
					i_77_ += -i_71_ + i_75_;
				}
				i_74_ += 2;
				i_70_ = i_76_;
				i_71_ = i_75_;
			}
			for (int i_81_ = i_70_; i_81_ < 128; i_81_++) {
				int i_82_ = (aByteArray3227[i_81_] & 0xff) + i_71_;
				if (i_82_ < 0)
					i_82_ = 0;
				if (i_82_ > 128)
					i_82_ = 128;
				aByteArray3227[i_81_] = (byte) i_82_;
			}
			Object object = null;
		}
		for (int i_83_ = 0; i_83_ < i_20_; i_83_++)
			class127s[i_83_].anInt2097 = class14_sub10.method798();
		for (int i_84_ = 0; i_84_ < i_20_; i_84_++) {
			Class127 class127_85_ = class127s[i_84_];
			if (class127_85_.aByteArray2109 != null)
				class127_85_.anInt2096 = class14_sub10.method798();
			if (class127_85_.aByteArray2098 != null)
				class127_85_.anInt2099 = class14_sub10.method798();
			if (class127_85_.anInt2097 > 0)
				class127_85_.anInt2106 = class14_sub10.method798();
		}
		for (int i_86_ = 0; i_86_ < i_20_; i_86_++)
			class127s[i_86_].anInt2103 = class14_sub10.method798();
		for (int i_87_ = 0; i_87_ < i_20_; i_87_++) {
			Class127 class127_88_ = class127s[i_87_];
			if (class127_88_.anInt2103 > 0)
				class127_88_.anInt2108 = class14_sub10.method798();
		}
		for (int i_89_ = 0; i_89_ < i_20_; i_89_++) {
			Class127 class127_90_ = class127s[i_89_];
			if (class127_90_.anInt2108 > 0)
				class127_90_.anInt2100 = class14_sub10.method798();
		}
	}
}
