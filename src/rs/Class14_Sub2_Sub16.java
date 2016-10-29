/* Class14_Sub2_Sub16 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.util.Random;

import com.jagex.link.Cacheable;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class25;

public abstract class Class14_Sub2_Sub16 extends Cacheable {
	public static Class124 aClass124_3967;
	public static Class124 aClass124_3970;
	public static Class124 aClass124_3972;
	public static Class124 aClass124_3973;
	public static Class124 aClass124_3974;
	public static Class124 aClass124_3975;
	public static Class124 aClass124_3976 = Class124.method263(1178, "str=");
	public static Class124 aClass124_3977;
	public static Class124 aClass124_3979;
	public static Class124 aClass124_3981;
	public static Class124 aClass124_3982;
	public static Class124 aClass124_3983;
	public static Class124 aClass124_3984;
	public static Class124 aClass124_3985;
	public static Class124 aClass124_3986;
	public static Class124 aClass124_3987;
	public static Class124 aClass124_3988;
	public static Class124 aClass124_3990;
	public static Class124 aClass124_3992;
	public static Class124 aClass124_3994;
	public static Class124 aClass124_3995;
	public static Class124 aClass124_3997;
	public static Class124 aClass124_3998;
	public static Class124 aClass124_4000;
	public static Class124[] aClass124Array4011;
	public static int anInt4001;
	public static int anInt4002;
	public static int anInt4003;
	public static int anInt4004;
	public static int anInt4005;
	public static int anInt4006;
	public static int anInt4007;
	public static int anInt4008;
	public static int anInt4009;
	public static int anInt4010;
	static {
		aClass124_3974 = Class124.method263(1178, ")4trans");
		aClass124_3977 = Class124.method263(1178, "times");
		aClass124_3970 = Class124.method263(1178, "shad");
		aClass124_3983 = Class124.method263(1178, "u=");
		aClass124_3985 = Class124.method263(1178, "euro");
		aClass124_3986 = Class124.method263(1178, "nbsp");
		aClass124_3981 = Class124.method263(1178, "shad=");
		aClass124_3992 = Class124.method263(1178, "img=");
		aClass124_3987 = Class124.method263(1178, "str");
		aClass124_3973 = Class124.method263(1178, ")4shad");
		aClass124_3982 = Class124.method263(1178, "gt");
		aClass124_3988 = Class124.method263(1178, "br");
		aClass124_3984 = Class124.method263(1178, ")4str");
		aClass124_3979 = Class124.method263(1178, "col=");
		aClass124_3994 = Class124.method263(1178, "u");
		aClass124_3972 = Class124.method263(1178, ")4u");
		aClass124_3997 = Class124.method263(1178, "copy");
		aClass124_3990 = Class124.method263(1178, "reg");
		aClass124_3998 = Class124.method263(1178, ")4col");
		aClass124_3967 = Class124.method263(1178, "shy");
		aClass124_4000 = Class124.method263(1178, "trans=");
		aClass124_3995 = Class124.method263(1178, "lt");
		aClass124_3975 = Class7_Sub1.method121(100, -13);
		anInt4003 = 256;
		anInt4002 = -1;
		anInt4005 = 0;
		anInt4006 = 0;
		anInt4004 = -1;
		anInt4008 = 0;
		aClass124Array4011 = new Class124[100];
		anInt4009 = -1;
		anInt4001 = 256;
		anInt4007 = 0;
		anInt4010 = -1;
	}
	public static int method366(byte[][] is, byte[][] is_135_, int[] is_136_, int[] is_137_, int[] is_138_, int i,
			int i_139_) {
		int i_140_ = is_136_[i];
		int i_141_ = i_140_ + is_138_[i];
		int i_142_ = is_136_[i_139_];
		int i_143_ = i_142_ + is_138_[i_139_];
		int i_144_ = i_140_;
		if (i_142_ > i_140_)
			i_144_ = i_142_;
		int i_145_ = i_141_;
		if (i_143_ < i_141_)
			i_145_ = i_143_;
		int i_146_ = is_137_[i];
		if (is_137_[i_139_] < i_146_)
			i_146_ = is_137_[i_139_];
		byte[] is_147_ = is_135_[i];
		byte[] is_148_ = is[i_139_];
		int i_149_ = i_144_ - i_140_;
		int i_150_ = i_144_ - i_142_;
		for (int i_151_ = i_144_; i_151_ < i_145_; i_151_++) {
			int i_152_ = is_147_[i_149_++] + is_148_[i_150_++];
			if (i_152_ < i_146_)
				i_146_ = i_152_;
		}
		return -i_146_;
	}
	public static void method367() {
		aClass124_3995 = null;
		aClass124_3982 = null;
		aClass124_3986 = null;
		aClass124_3967 = null;
		aClass124_3977 = null;
		aClass124_3985 = null;
		aClass124_3997 = null;
		aClass124_3990 = null;
		aClass124_3992 = null;
		aClass124_3988 = null;
		aClass124_3979 = null;
		aClass124_3998 = null;
		aClass124_4000 = null;
		aClass124_3974 = null;
		aClass124_3983 = null;
		aClass124_3994 = null;
		aClass124_3972 = null;
		aClass124_3981 = null;
		aClass124_3970 = null;
		aClass124_3973 = null;
		aClass124_3976 = null;
		aClass124_3987 = null;
		aClass124_3984 = null;
		aClass124_3975 = null;
		aClass124Array4011 = null;
	}
	public static Class124 method368(Class124 class124) {
		int i = class124.method1693(0);
		int i_153_ = 0;
		for (int i_154_ = 0; i_154_ < i; i_154_++) {
			byte i_155_ = class124.aByteArray2495[i_154_];
			if (i_155_ == 60 || i_155_ == 62)
				i_153_ += 3;
		}
		Class124 class124_156_ = new Class124();
		class124_156_.anInt2507 = i + i_153_;
		class124_156_.aByteArray2495 = new byte[class124_156_.anInt2507];
		int i_157_ = 0;
		for (int i_158_ = 0; i_158_ < i; i_158_++) {
			byte i_159_ = class124.aByteArray2495[i_158_];
			if (i_159_ == 60) {
				class124_156_.aByteArray2495[i_157_++] = (byte) 60;
				class124_156_.aByteArray2495[i_157_++] = (byte) 108;
				class124_156_.aByteArray2495[i_157_++] = (byte) 116;
				class124_156_.aByteArray2495[i_157_++] = (byte) 62;
			} else if (i_159_ == 62) {
				class124_156_.aByteArray2495[i_157_++] = (byte) 60;
				class124_156_.aByteArray2495[i_157_++] = (byte) 103;
				class124_156_.aByteArray2495[i_157_++] = (byte) 116;
				class124_156_.aByteArray2495[i_157_++] = (byte) 62;
			} else
				class124_156_.aByteArray2495[i_157_++] = i_159_;
		}
		return class124_156_;
	}
	public byte[] aByteArray3980;
	public Class148[] aClass148Array3971;
	public int anInt3969;
	public int anInt3978 = 0;
	public int anInt3999;
	public int[] anIntArray3966;
	public int[] anIntArray3968;

	public int[] anIntArray3989;

	public int[] anIntArray3991;

	public int[] anIntArray3993;

	public int[] anIntArray3996;

	public Class14_Sub2_Sub16(byte[] is) {
		method360(is);
	}

	public Class14_Sub2_Sub16(byte[] is, int[] is_160_, int[] is_161_, int[] is_162_, int[] is_163_) {
		anIntArray3966 = is_160_;
		anIntArray3993 = is_161_;
		anIntArray3989 = is_162_;
		anIntArray3991 = is_163_;
		method360(is);
		int i = 2147483647;
		int i_164_ = -2147483648;
		for (int i_165_ = 0; i_165_ < 256; i_165_++) {
			if (anIntArray3993[i_165_] < i && anIntArray3991[i_165_] != 0)
				i = anIntArray3993[i_165_];
			if (anIntArray3993[i_165_] + anIntArray3991[i_165_] > i_164_)
				i_164_ = anIntArray3993[i_165_] + anIntArray3991[i_165_];
		}
		anInt3999 = anInt3978 - i;
		anInt3969 = i_164_ - anInt3978;
	}

	public int method342(int i) {
		return anIntArray3996[i & 0xff];
	}

	public void method343(Class124 class124, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		if (class124 != null) {
			method354(i_1_, i_2_);
			double d = 7.0 - i_4_ / 8.0;
			if (d < 0.0)
				d = 0.0;
			int[] is = new int[class124.anInt2507];
			for (int i_5_ = 0; i_5_ < class124.anInt2507; i_5_++)
				is[i_5_] = (int) (Math.sin(i_5_ / 1.5 + i_3_ / 1.0) * d);
			method355(class124, i - method361(class124) / 2, i_0_, null, is);
		}
	}

	public int method344(Class124 class124, int i) {
		int i_6_ = method351(class124, new int[] { i }, aClass124Array4011);
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < i_6_; i_8_++) {
			int i_9_ = method361(aClass124Array4011[i_8_]);
			if (i_9_ > i_7_)
				i_7_ = i_9_;
		}
		return i_7_;
	}

	public void method345(Class124 class124, int i, int i_10_, int i_11_, int i_12_) {
		if (class124 != null) {
			method354(i_11_, i_12_);
			method356(class124, i - method361(class124) / 2, i_10_);
		}
	}

	public void method346(int i, int i_13_, int i_14_) {
		anInt4010 = -1;
		anInt4009 = -1;
		anInt4002 = anInt4004 = i_13_;
		anInt4007 = anInt4005 = i;
		anInt4003 = anInt4001 = i_14_;
		anInt4006 = 0;
		anInt4008 = 0;
	}

	public void method347(Class124 class124) {
		try {
			if (class124.method1690(aClass124_3979, 33))
				anInt4007 = class124.method1696(4, 15).method1671(255, 16);
			else if (class124.method1704(aClass124_3998, (byte) 93))
				anInt4007 = anInt4005;
			else if (class124.method1690(aClass124_4000, 33))
				anInt4003 = class124.method1696(6, 15).method1702(126);
			else if (class124.method1704(aClass124_3974, (byte) 105))
				anInt4003 = anInt4001;
			else if (class124.method1690(aClass124_3976, 33))
				anInt4010 = class124.method1696(4, 15).method1671(255, 16);
			else if (class124.method1704(aClass124_3987, (byte) 112))
				anInt4010 = 8388608;
			else if (class124.method1704(aClass124_3984, (byte) 121))
				anInt4010 = -1;
			else if (class124.method1690(aClass124_3983, 33))
				anInt4009 = class124.method1696(2, 15).method1671(255, 16);
			else if (class124.method1704(aClass124_3994, (byte) 93))
				anInt4009 = 0;
			else if (class124.method1704(aClass124_3972, (byte) 69))
				anInt4009 = -1;
			else if (class124.method1690(aClass124_3981, 33))
				anInt4002 = class124.method1696(5, 15).method1671(255, 16);
			else if (class124.method1704(aClass124_3970, (byte) 64))
				anInt4002 = 0;
			else if (class124.method1704(aClass124_3973, (byte) 97))
				anInt4002 = anInt4004;
			else if (class124.method1704(aClass124_3988, (byte) 115))
				method346(anInt4005, anInt4004, anInt4001);
		} catch (Exception exception) {
			/* empty */
		}
	}

	public void method348(Class124 class124, int i, int i_15_, int i_16_, int i_17_) {
		if (class124 != null) {
			method354(i_16_, i_17_);
			method356(class124, i - method361(class124), i_15_);
		}
	}

	public abstract void method349(int i, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool);

	public int method350(Class124 class124, int i, int i_23_, int i_24_, int i_25_, Random random, int i_26_) {
		if (class124 == null)
			return 0;
		random.setSeed(i_26_);
		method346(i_24_, i_25_, (random.nextInt() & 0x1f) + 192);
		int[] is = new int[class124.anInt2507];
		int i_27_ = 0;
		for (int i_28_ = 0; i_28_ < class124.anInt2507; i_28_++) {
			is[i_28_] = i_27_;
			if ((random.nextInt() & 0x3) == 0)
				i_27_++;
		}
		method355(class124, i, i_23_, is, null);
		return i_27_;
	}

	public int method351(Class124 class124, int[] is, Class124[] class124s) {
		if (class124 == null)
			return 0;
		aClass124_3975.method1699(0, (byte) 42);
		int i = 0;
		int i_29_ = 0;
		int i_30_ = -1;
		int i_31_ = 0;
		int i_32_ = 0;
		int i_33_ = -1;
		int i_34_ = -1;
		int i_35_ = 0;
		int i_36_ = class124.method1693(0);
		for (int i_37_ = 0; i_37_ < i_36_; i_37_++) {
			int i_38_ = class124.method1710(0, i_37_);
			if (i_38_ == 60)
				i_33_ = i_37_;
			else {
				if (i_38_ == 62 && i_33_ != -1) {
					Class124 class124_39_ = class124.method1697(i_33_ + 1, i_37_, (byte) -104);
					i_33_ = -1;
					aClass124_3975.method1686((byte) -5, 60);
					aClass124_3975.method1675((byte) -128, class124_39_);
					aClass124_3975.method1686((byte) -5, 62);
					if (class124_39_.method1704(aClass124_3988, (byte) 97)) {
						if (class124s[i_35_] != null) {
							class124s[i_35_].method1699(0, (byte) 75);
							class124s[i_35_] = (class124s[i_35_].method1668(aClass124_3975,
									aClass124_3975.method1693(0), 0, i_29_));
						} else
							class124s[i_35_] = aClass124_3975.method1697(i_29_, aClass124_3975.method1693(0),
									(byte) -104);
						i_35_++;
						i_29_ = aClass124_3975.method1693(0);
						i = 0;
						i_30_ = -1;
						i_34_ = -1;
					} else if (class124_39_.method1704(aClass124_3995, (byte) 96)) {
						i += method342(60);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 60];
						i_34_ = 60;
					} else if (class124_39_.method1704(aClass124_3982, (byte) 69)) {
						i += method342(62);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 62];
						i_34_ = 62;
					} else if (class124_39_.method1704(aClass124_3986, (byte) 99)) {
						i += method342(160);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 160];
						i_34_ = 160;
					} else if (class124_39_.method1704(aClass124_3967, (byte) 63)) {
						i += method342(173);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 173];
						i_34_ = 173;
					} else if (class124_39_.method1704(aClass124_3977, (byte) 64)) {
						i += method342(215);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 215];
						i_34_ = 215;
					} else if (class124_39_.method1704(aClass124_3985, (byte) 51)) {
						i += method342(128);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 128];
						i_34_ = 128;
					} else if (class124_39_.method1704(aClass124_3997, (byte) 76)) {
						i += method342(169);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 169];
						i_34_ = 169;
					} else if (class124_39_.method1704(aClass124_3990, (byte) 120)) {
						i += method342(174);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + 174];
						i_34_ = 174;
					} else if (class124_39_.method1690(aClass124_3992, 33)) {
						try {
							int i_40_ = class124_39_.method1696(4, 15).method1702(106);
							i += aClass148Array3971[i_40_].anInt2378;
							i_34_ = -1;
						} catch (Exception exception) {
							/* empty */
						}
					}
					i_38_ = -1;
				}
				if (i_33_ == -1) {
					if (i_38_ != -1) {
						aClass124_3975.method1686((byte) -5, i_38_);
						i += method342(i_38_);
						if (aByteArray3980 != null && i_34_ != -1)
							i += aByteArray3980[(i_34_ << 8) + i_38_];
						i_34_ = i_38_;
					}
					if (i_38_ == 32) {
						i_30_ = aClass124_3975.method1693(0);
						i_31_ = i;
						i_32_ = 1;
					}
					if (is != null && i > is[i_35_ < is.length ? i_35_ : is.length - 1] && i_30_ >= 0) {
						if (class124s[i_35_] != null) {
							class124s[i_35_].method1699(0, (byte) 52);
							class124s[i_35_] = class124s[i_35_].method1668(aClass124_3975, i_30_ - i_32_, 0, i_29_);
						} else
							class124s[i_35_] = aClass124_3975.method1697(i_29_, i_30_ - i_32_, (byte) -104);
						i_35_++;
						i_29_ = i_30_;
						i_30_ = -1;
						i -= i_31_;
						i_34_ = -1;
					}
					if (i_38_ == 45) {
						i_30_ = aClass124_3975.method1693(0);
						i_31_ = i;
						i_32_ = 0;
					}
				}
			}
		}
		if (aClass124_3975.method1693(0) > i_29_) {
			if (class124s[i_35_] != null) {
				class124s[i_35_].method1699(0, (byte) 120);
				class124s[i_35_] = class124s[i_35_].method1668(aClass124_3975, aClass124_3975.method1693(0), 0, i_29_);
			} else
				class124s[i_35_] = aClass124_3975.method1697(i_29_, aClass124_3975.method1693(0), (byte) -104);
			i_35_++;
		}
		return i_35_;
	}

	public void method352(Class148[] class148s, int[] is) {
		if (is != null && is.length != class148s.length)
			throw new IllegalArgumentException();
		aClass148Array3971 = class148s;
		anIntArray3968 = is;
	}

	public void method353(Class124 class124, int i, int i_41_, int i_42_, int i_43_, int i_44_) {
		if (class124 != null) {
			method354(i_42_, i_43_);
			int[] is = new int[class124.anInt2507];
			for (int i_45_ = 0; i_45_ < class124.anInt2507; i_45_++)
				is[i_45_] = (int) (Math.sin(i_45_ / 2.0 + i_44_ / 5.0) * 5.0);
			method355(class124, i - method361(class124) / 2, i_41_, null, is);
		}
	}

	public void method354(int i, int i_46_) {
		anInt4010 = -1;
		anInt4009 = -1;
		anInt4002 = anInt4004 = i_46_;
		anInt4007 = anInt4005 = i;
		anInt4003 = anInt4001 = 256;
		anInt4006 = 0;
		anInt4008 = 0;
	}

	public void method355(Class124 class124, int i, int i_47_, int[] is, int[] is_48_) {
		i_47_ -= anInt3978;
		int i_49_ = -1;
		int i_50_ = -1;
		int i_51_ = 0;
		for (int i_52_ = 0; i_52_ < class124.anInt2507; i_52_++) {
			int i_53_ = class124.aByteArray2495[i_52_] & 0xff;
			if (i_53_ == 60)
				i_49_ = i_52_;
			else {
				if (i_53_ == 62 && i_49_ != -1) {
					Class124 class124_54_ = class124.method1697(i_49_ + 1, i_52_, (byte) -104);
					i_49_ = -1;
					if (class124_54_.method1704(aClass124_3995, (byte) 90))
						i_53_ = 60;
					else if (class124_54_.method1704(aClass124_3982, (byte) 116))
						i_53_ = 62;
					else if (class124_54_.method1704(aClass124_3986, (byte) 78))
						i_53_ = 160;
					else if (class124_54_.method1704(aClass124_3967, (byte) 127))
						i_53_ = 173;
					else if (class124_54_.method1704(aClass124_3977, (byte) 80))
						i_53_ = 215;
					else if (class124_54_.method1704(aClass124_3985, (byte) 111))
						i_53_ = 128;
					else if (class124_54_.method1704(aClass124_3997, (byte) 74))
						i_53_ = 169;
					else if (class124_54_.method1704(aClass124_3990, (byte) 114))
						i_53_ = 174;
					else {
						if (class124_54_.method1690(aClass124_3992, 33)) {
							try {
								int i_55_;
								if (is != null)
									i_55_ = is[i_51_];
								else
									i_55_ = 0;
								int i_56_;
								if (is_48_ != null)
									i_56_ = is_48_[i_51_];
								else
									i_56_ = 0;
								i_51_++;
								int i_57_ = class124_54_.method1696(4, 15).method1702(78);
								Class148 class148 = aClass148Array3971[i_57_];
								int i_58_ = (anIntArray3968 != null ? anIntArray3968[i_57_] : class148.anInt2373);
								if (anInt4003 == 256)
									class148.method2001(i + i_55_, (i_47_ + anInt3978 - i_58_ + i_56_));
								else
									class148.method1999(i + i_55_, (i_47_ + anInt3978 - i_58_ + i_56_), anInt4003);
								i += class148.anInt2378;
								i_50_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method347(class124_54_);
						continue;
					}
				}
				if (i_49_ == -1) {
					if (aByteArray3980 != null && i_50_ != -1)
						i += aByteArray3980[(i_50_ << 8) + i_53_];
					int i_59_ = anIntArray3989[i_53_];
					int i_60_ = anIntArray3991[i_53_];
					int i_61_;
					if (is != null)
						i_61_ = is[i_51_];
					else
						i_61_ = 0;
					int i_62_;
					if (is_48_ != null)
						i_62_ = is_48_[i_51_];
					else
						i_62_ = 0;
					i_51_++;
					if (i_53_ != 32) {
						if (anInt4003 == 256) {
							if (anInt4002 != -1)
								method349(i_53_, (i + anIntArray3966[i_53_] + 1 + i_61_),
										(i_47_ + anIntArray3993[i_53_] + 1 + i_62_), i_59_, i_60_, anInt4002, true);
							method349(i_53_, i + anIntArray3966[i_53_] + i_61_, i_47_ + anIntArray3993[i_53_] + i_62_,
									i_59_, i_60_, anInt4007, false);
						} else {
							if (anInt4002 != -1)
								method363(i_53_, (i + anIntArray3966[i_53_] + 1 + i_61_),
										(i_47_ + anIntArray3993[i_53_] + 1 + i_62_), i_59_, i_60_, anInt4002, anInt4003,
										true);
							method363(i_53_, i + anIntArray3966[i_53_] + i_61_, i_47_ + anIntArray3993[i_53_] + i_62_,
									i_59_, i_60_, anInt4007, anInt4003, false);
						}
					} else if (anInt4006 > 0) {
						anInt4008 += anInt4006;
						i += anInt4008 >> 8;
						anInt4008 &= 0xff;
					}
					int i_63_ = anIntArray3996[i_53_];
					if (anInt4010 != -1)
						Class25.method1007(i, i_47_ + (int) (anInt3978 * 0.7), i_63_, anInt4010);
					if (anInt4009 != -1)
						Class25.method1007(i, i_47_ + anInt3978, i_63_, anInt4009);
					i += i_63_;
					i_50_ = i_53_;
				}
			}
		}
	}

	public void method356(Class124 class124, int i, int i_64_) {
		i_64_ -= anInt3978;
		int i_65_ = -1;
		int i_66_ = -1;
		for (int i_67_ = 0; i_67_ < class124.anInt2507; i_67_++) {
			int i_68_ = class124.aByteArray2495[i_67_] & 0xff;
			if (i_68_ == 60)
				i_65_ = i_67_;
			else {
				if (i_68_ == 62 && i_65_ != -1) {
					Class124 class124_69_ = class124.method1697(i_65_ + 1, i_67_, (byte) -104);
					i_65_ = -1;
					if (class124_69_.method1704(aClass124_3995, (byte) 64))
						i_68_ = 60;
					else if (class124_69_.method1704(aClass124_3982, (byte) 115))
						i_68_ = 62;
					else if (class124_69_.method1704(aClass124_3986, (byte) 104))
						i_68_ = 160;
					else if (class124_69_.method1704(aClass124_3967, (byte) 85))
						i_68_ = 173;
					else if (class124_69_.method1704(aClass124_3977, (byte) 51))
						i_68_ = 215;
					else if (class124_69_.method1704(aClass124_3985, (byte) 44))
						i_68_ = 128;
					else if (class124_69_.method1704(aClass124_3997, (byte) 113))
						i_68_ = 169;
					else if (class124_69_.method1704(aClass124_3990, (byte) 85))
						i_68_ = 174;
					else {
						if (class124_69_.method1690(aClass124_3992, 33)) {
							try {
								int i_70_ = class124_69_.method1696(4, 15).method1702(126);
								Class148 class148 = aClass148Array3971[i_70_];
								int i_71_ = (anIntArray3968 != null ? anIntArray3968[i_70_] : class148.anInt2373);
								if (anInt4003 == 256)
									class148.method2001(i, (i_64_ + anInt3978 - i_71_));
								else
									class148.method1999(i, (i_64_ + anInt3978 - i_71_), anInt4003);
								i += class148.anInt2378;
								i_66_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						} else
							method347(class124_69_);
						continue;
					}
				}
				if (i_65_ == -1) {
					if (aByteArray3980 != null && i_66_ != -1)
						i += aByteArray3980[(i_66_ << 8) + i_68_];
					int i_72_ = anIntArray3989[i_68_];
					int i_73_ = anIntArray3991[i_68_];
					if (i_68_ != 32) {
						if (anInt4003 == 256) {
							if (anInt4002 != -1)
								method349(i_68_, i + anIntArray3966[i_68_] + 1, i_64_ + anIntArray3993[i_68_] + 1,
										i_72_, i_73_, anInt4002, true);
							method349(i_68_, i + anIntArray3966[i_68_], i_64_ + anIntArray3993[i_68_], i_72_, i_73_,
									anInt4007, false);
						} else {
							if (anInt4002 != -1)
								method363(i_68_, i + anIntArray3966[i_68_] + 1, i_64_ + anIntArray3993[i_68_] + 1,
										i_72_, i_73_, anInt4002, anInt4003, true);
							method363(i_68_, i + anIntArray3966[i_68_], i_64_ + anIntArray3993[i_68_], i_72_, i_73_,
									anInt4007, anInt4003, false);
						}
					} else if (anInt4006 > 0) {
						anInt4008 += anInt4006;
						i += anInt4008 >> 8;
						anInt4008 &= 0xff;
					}
					int i_74_ = anIntArray3996[i_68_];
					if (anInt4010 != -1)
						Class25.method1007(i, i_64_ + (int) (anInt3978 * 0.7), i_74_, anInt4010);
					if (anInt4009 != -1)
						Class25.method1007(i, i_64_ + anInt3978 + 1, i_74_, anInt4009);
					i += i_74_;
					i_66_ = i_68_;
				}
			}
		}
	}

	public void method357(Class124 class124, int i, int i_75_, int i_76_, int i_77_, int i_78_) {
		if (class124 != null) {
			method354(i_76_, i_77_);
			int[] is = new int[class124.anInt2507];
			int[] is_79_ = new int[class124.anInt2507];
			for (int i_80_ = 0; i_80_ < class124.anInt2507; i_80_++) {
				is[i_80_] = (int) (Math.sin(i_80_ / 5.0 + i_78_ / 5.0) * 5.0);
				is_79_[i_80_] = (int) (Math.sin(i_80_ / 3.0 + i_78_ / 5.0) * 5.0);
			}
			method355(class124, i - method361(class124) / 2, i_75_, is, is_79_);
		}
	}

	public int method358(Class124 class124, int i) {
		return method351(class124, new int[] { i }, aClass124Array4011);
	}

	public int method359(Class124 class124, int i, int i_81_, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_,
			int i_87_, int i_88_) {
		return method365(class124, i, i_81_, i_82_, i_83_, i_84_, i_85_, 256, i_86_, i_87_, i_88_);
	}

	public void method360(byte[] is) {
		anIntArray3996 = new int[256];
		if (is.length == 257) {
			for (int i = 0; i < anIntArray3996.length; i++)
				anIntArray3996[i] = is[i] & 0xff;
			anInt3978 = is[256] & 0xff;
		} else {
			int i = 0;
			for (int i_89_ = 0; i_89_ < 256; i_89_++)
				anIntArray3996[i_89_] = is[i++] & 0xff;
			int[] is_90_ = new int[256];
			int[] is_91_ = new int[256];
			for (int i_92_ = 0; i_92_ < 256; i_92_++)
				is_90_[i_92_] = is[i++] & 0xff;
			for (int i_93_ = 0; i_93_ < 256; i_93_++)
				is_91_[i_93_] = is[i++] & 0xff;
			byte[][] is_94_ = new byte[256][];
			for (int i_95_ = 0; i_95_ < 256; i_95_++) {
				is_94_[i_95_] = new byte[is_90_[i_95_]];
				byte i_96_ = 0;
				for (int i_97_ = 0; i_97_ < is_94_[i_95_].length; i_97_++) {
					i_96_ += is[i++];
					is_94_[i_95_][i_97_] = i_96_;
				}
			}
			byte[][] is_98_ = new byte[256][];
			for (int i_99_ = 0; i_99_ < 256; i_99_++) {
				is_98_[i_99_] = new byte[is_90_[i_99_]];
				byte i_100_ = 0;
				for (int i_101_ = 0; i_101_ < is_98_[i_99_].length; i_101_++) {
					i_100_ += is[i++];
					is_98_[i_99_][i_101_] = i_100_;
				}
			}
			aByteArray3980 = new byte[65536];
			for (int i_102_ = 0; i_102_ < 256; i_102_++) {
				if (i_102_ != 32 && i_102_ != 160) {
					for (int i_103_ = 0; i_103_ < 256; i_103_++) {
						if (i_103_ != 32 && i_103_ != 160)
							aByteArray3980[(i_102_ << 8) + i_103_] = (byte) method366(is_94_, is_98_, is_91_,
									anIntArray3996, is_90_, i_102_, i_103_);
					}
				}
			}
			anInt3978 = is_91_[32] + is_90_[32];
		}
	}

	public int method361(Class124 class124) {
		if (class124 == null)
			return 0;
		int i = -1;
		int i_104_ = -1;
		int i_105_ = 0;
		for (int i_106_ = 0; i_106_ < class124.anInt2507; i_106_++) {
			int i_107_ = class124.aByteArray2495[i_106_] & 0xff;
			if (i_107_ == 60)
				i = i_106_;
			else {
				if (i_107_ == 62 && i != -1) {
					Class124 class124_108_ = class124.method1697(i + 1, i_106_, (byte) -104);
					i = -1;
					if (class124_108_.method1704(aClass124_3995, (byte) 89))
						i_107_ = 60;
					else if (class124_108_.method1704(aClass124_3982, (byte) 127))
						i_107_ = 62;
					else if (class124_108_.method1704(aClass124_3986, (byte) 69))
						i_107_ = 160;
					else if (class124_108_.method1704(aClass124_3967, (byte) 66))
						i_107_ = 173;
					else if (class124_108_.method1704(aClass124_3977, (byte) 68))
						i_107_ = 215;
					else if (class124_108_.method1704(aClass124_3985, (byte) 125))
						i_107_ = 128;
					else if (class124_108_.method1704(aClass124_3997, (byte) 95))
						i_107_ = 169;
					else if (class124_108_.method1704(aClass124_3990, (byte) 124))
						i_107_ = 174;
					else {
						if (class124_108_.method1690(aClass124_3992, 33)) {
							try {
								int i_109_ = class124_108_.method1696(4, 15).method1702(60);
								i_105_ += aClass148Array3971[i_109_].anInt2378;
								i_104_ = -1;
							} catch (Exception exception) {
								/* empty */
							}
						}
						continue;
					}
				}
				if (i == -1) {
					i_105_ += anIntArray3996[i_107_];
					if (aByteArray3980 != null && i_104_ != -1)
						i_105_ += aByteArray3980[(i_104_ << 8) + i_107_];
					i_104_ = i_107_;
				}
			}
		}
		return i_105_;
	}

	public void method362(Class124 class124, int i) {
		int i_110_ = 0;
		boolean bool = false;
		for (int i_111_ = 0; i_111_ < class124.method1693(0); i_111_++) {
			int i_112_ = class124.method1710(0, i_111_);
			if (i_112_ == 60)
				bool = true;
			else if (i_112_ == 62)
				bool = false;
			else if (!bool && i_112_ == 32)
				i_110_++;
		}
		if (i_110_ > 0)
			anInt4006 = (i - method361(class124) << 8) / i_110_;
	}

	public abstract void method363(int i, int i_113_, int i_114_, int i_115_, int i_116_, int i_117_, int i_118_,
			boolean bool);

	public void method364(Class124 class124, int i, int i_119_, int i_120_, int i_121_) {
		if (class124 != null) {
			method354(i_120_, i_121_);
			method356(class124, i, i_119_);
		}
	}

	public int method365(Class124 class124, int i, int i_122_, int i_123_, int i_124_, int i_125_, int i_126_,
			int i_127_, int i_128_, int i_129_, int i_130_) {
		if (class124 == null)
			return 0;
		method346(i_125_, i_126_, i_127_);
		if (i_130_ == 0)
			i_130_ = anInt3978;
		int[] is = { i_123_ };
		if (i_124_ < anInt3999 + anInt3969 + i_130_ && i_124_ < i_130_ + i_130_)
			is = null;
		int i_131_ = method351(class124, is, aClass124Array4011);
		if (i_129_ == 3 && i_131_ == 1)
			i_129_ = 1;
		int i_132_;
		if (i_129_ == 0)
			i_132_ = i_122_ + anInt3999;
		else if (i_129_ == 1)
			i_132_ = i_122_ + anInt3999 + (i_124_ - anInt3999 - anInt3969 - (i_131_ - 1) * i_130_) / 2;
		else if (i_129_ == 2)
			i_132_ = i_122_ + i_124_ - anInt3969 - (i_131_ - 1) * i_130_;
		else {
			int i_133_ = ((i_124_ - anInt3999 - anInt3969 - (i_131_ - 1) * i_130_) / (i_131_ + 1));
			if (i_133_ < 0)
				i_133_ = 0;
			i_132_ = i_122_ + anInt3999 + i_133_;
			i_130_ += i_133_;
		}
		for (int i_134_ = 0; i_134_ < i_131_; i_134_++) {
			if (i_128_ == 0)
				method356(aClass124Array4011[i_134_], i, i_132_);
			else if (i_128_ == 1)
				method356(aClass124Array4011[i_134_], i + ((i_123_ - method361(aClass124Array4011[i_134_])) / 2),
						i_132_);
			else if (i_128_ == 2)
				method356(aClass124Array4011[i_134_], i + i_123_ - method361(aClass124Array4011[i_134_]), i_132_);
			else if (i_134_ == i_131_ - 1)
				method356(aClass124Array4011[i_134_], i, i_132_);
			else {
				method362(aClass124Array4011[i_134_], i_123_);
				method356(aClass124Array4011[i_134_], i, i_132_);
				anInt4006 = 0;
			}
			i_132_ += i_130_;
		}
		return i_131_;
	}
}
