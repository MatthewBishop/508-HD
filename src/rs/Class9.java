/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.ref.SoftCache;

import rs.tex.Class14_Sub8_Sub6;

public abstract class Class9 {
	public static int[][] anIntArrayArray190 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
			{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
			{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
			{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	public Object[] anObjectArray192;
	public int[] anIntArray194;
	public int[] anIntArray197;
	public int[][] anIntArrayArray198;
	public int[] anIntArray202;
	public int[] anIntArray203;
	public static Class124 aClass124_207 = Class14_Sub2_Sub2.method263(1178, "headicons_prayer");
	public int[] anIntArray208;
	public int anInt211;
	public static int[] anIntArray212;
	public Class63[] aClass63Array213;
	public static boolean aBoolean214;
	public static int[] anIntArray215;
	public int[][] anIntArrayArray218;
	public Class63 aClass63_219;
	public boolean aBoolean220;
	public static Class124 aClass124_221;
	public int[] anIntArray223;
	public static Class124 aClass124_227 = Class14_Sub2_Sub2.method263(1178, "mapflag");
	public static SoftCache aClass52_236;
	public Object[][] anObjectArrayArray237;
	public int anInt242;
	public boolean aBoolean244;
	public static int anInt246;

	static {
		aBoolean214 = true;
		anIntArray212 = new int[] { 0, -1, 0, 1 };
		aClass124_221 = Class14_Sub2_Sub2.method263(1178, "Lade Schrifts-=tze )2 ");
		anIntArray215 = new int[100];
		aClass52_236 = new SoftCache(64);
		anInt246 = 0;
	}

	public int method146(Class124 class124, int i) {
		class124 = class124.method1716((byte) 63);
		int i_0_ = aClass63_219.method1283(-9, class124.method1709(86));
		if (i != 0)
			anIntArrayArray198 = null;
		if (!method153(i_0_, -1)) {
			int i_1_ = -1;
			return i_1_;
		}
		int i_2_ = i_0_;
		return i_2_;
	}

	public void method147(byte[] is, int i) {
		if (i != 15)
			anIntArray212 = null;
		anInt242 = Buffer.method1303(is, is.length);
		Buffer class14_sub10 = new Buffer(Class7_Sub3_Sub1.method139(-28009, is));
		int i_3_ = class14_sub10.method798();
		if (i_3_ != 5 && i_3_ != 6)
			throw new RuntimeException(new StringBuilder("Incorrect JS5 protocol number: ").append(i_3_).toString());
		if (i_3_ >= 6)
			class14_sub10.method812((byte) -102);
		int i_4_ = class14_sub10.method798();
		anInt211 = class14_sub10.method784((byte) 111);
		int i_5_ = 0;
		int i_6_ = -1;
		anIntArray223 = new int[anInt211];
		for (int i_7_ = 0; i_7_ < anInt211; i_7_++) {
			anIntArray223[i_7_] = i_5_ += class14_sub10.method784((byte) 104);
			if (i_6_ < anIntArray223[i_7_])
				i_6_ = anIntArray223[i_7_];
		}
		anIntArray194 = new int[i_6_ + 1];
		anIntArray202 = new int[i_6_ + 1];
		anObjectArray192 = new Object[i_6_ + 1];
		anIntArrayArray218 = new int[i_6_ + 1][];
		anIntArray203 = new int[i_6_ + 1];
		anObjectArrayArray237 = new Object[i_6_ + 1][];
		anIntArray208 = new int[i_6_ + 1];
		if (i_4_ != 0) {
			anIntArray197 = new int[i_6_ + 1];
			for (int i_8_ = 0; i_8_ < i_6_ + 1; i_8_++)
				anIntArray197[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < anInt211; i_9_++)
				anIntArray197[anIntArray223[i_9_]] = class14_sub10.method812((byte) -121);
			aClass63_219 = new Class63(anIntArray197);
		}
		for (int i_10_ = 0; i_10_ < anInt211; i_10_++)
			anIntArray202[anIntArray223[i_10_]] = class14_sub10.method812((byte) -108);
		for (int i_11_ = 0; anInt211 > i_11_; i_11_++)
			anIntArray194[anIntArray223[i_11_]] = class14_sub10.method812((byte) -102);
		for (int i_12_ = 0; anInt211 > i_12_; i_12_++)
			anIntArray203[anIntArray223[i_12_]] = class14_sub10.method784((byte) 122);
		for (int i_13_ = 0; i_13_ < anInt211; i_13_++) {
			i_5_ = 0;
			int i_14_ = anIntArray223[i_13_];
			int i_15_ = anIntArray203[i_14_];
			int i_16_ = -1;
			anIntArrayArray218[i_14_] = new int[i_15_];
			for (int i_17_ = 0; i_15_ > i_17_; i_17_++) {
				int i_18_ = (anIntArrayArray218[i_14_][i_17_] = i_5_ += class14_sub10.method784((byte) 112));
				if (i_18_ > i_16_)
					i_16_ = i_18_;
			}
			anIntArray208[i_14_] = i_16_ + 1;
			if (i_16_ + 1 == i_15_)
				anIntArrayArray218[i_14_] = null;
		}
		if (i_4_ != 0) {
			aClass63Array213 = new Class63[i_6_ + 1];
			anIntArrayArray198 = new int[i_6_ + 1][];
			for (int i_19_ = 0; anInt211 > i_19_; i_19_++) {
				int i_20_ = anIntArray223[i_19_];
				int i_21_ = anIntArray203[i_20_];
				anIntArrayArray198[i_20_] = new int[anIntArray208[i_20_]];
				for (int i_22_ = 0; anIntArray208[i_20_] > i_22_; i_22_++)
					anIntArrayArray198[i_20_][i_22_] = -1;
				for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
					int i_24_;
					if (anIntArrayArray218[i_20_] != null)
						i_24_ = anIntArrayArray218[i_20_][i_23_];
					else
						i_24_ = i_23_;
					anIntArrayArray198[i_20_][i_24_] = class14_sub10.method812((byte) -116);
				}
				aClass63Array213[i_20_] = new Class63(anIntArrayArray198[i_20_]);
			}
		}
	}

	public boolean method148(int i, int i_25_, int i_26_) {
		if (i_26_ < (i_25_ ^ 0xffffffff) || i < 0 || i_25_ >= anIntArray208.length || i >= anIntArray208[i_25_]) {
			if (Class133_Sub1.aBoolean3499)
				throw new IllegalArgumentException(
						new StringBuilder(String.valueOf(i_25_)).append(",").append(i).toString());
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public byte[] method149(int i, int i_27_, int[] is, int i_28_) {
		if (!method148(i_27_, i_28_, -1)) {
			byte[] is_29_ = null;
			return is_29_;
		}
		if (anObjectArrayArray237[i_28_] == null || anObjectArrayArray237[i_28_][i_27_] == null) {
			boolean bool = method156((byte) -17, i_28_, is);
			if (!bool) {
				method164(-128, i_28_);
				bool = method156((byte) -107, i_28_, is);
				if (!bool) {
					byte[] is_30_ = null;
					return is_30_;
				}
			}
		}
		if (i != -23245)
			anObjectArrayArray237 = null;
		byte[] is_31_ = Class63.method1282(anObjectArrayArray237[i_28_][i_27_], (byte) 91, false);
		if (aBoolean244) {
			anObjectArrayArray237[i_28_][i_27_] = null;
			if (anIntArray208[i_28_] == 1)
				anObjectArrayArray237[i_28_] = null;
		}
		byte[] is_32_ = is_31_;
		return is_32_;
	}

	public static void method150(int i) {
		aClass124_227 = null;
		aClass124_207 = null;
		aClass124_221 = null;
		aClass52_236 = null;
		anIntArray215 = null;
		anIntArray212 = null;
		anIntArrayArray190 = null;
	}

	public int method151(Class124 class124, int i) {
		class124 = class124.method1716((byte) 63);
		if (i >= -119)
			anIntArray208 = null;
		int i_33_ = aClass63_219.method1283(-9, class124.method1709(108));
		int i_34_ = method178(0, i_33_);
		return i_34_;
	}

	public void method152(int i) {
		for (int i_35_ = 0; i_35_ < anObjectArrayArray237.length; i_35_++)
			anObjectArrayArray237[i_35_] = null;
	}

	public boolean method153(int i, int i_36_) {
		if (i_36_ != -1)
			aClass52_236 = null;
		if (i < 0 || anIntArray208.length <= i || anIntArray208[i] == 0) {
			if (!Class133_Sub1.aBoolean3499) {
				boolean bool = false;
				return bool;
			}
			throw new IllegalArgumentException(Integer.toString(i));
		}
		return true;
	}

	public int method155(int i) {
		if (i != 6756) {
			int i_37_ = -40;
			return i_37_;
		}
		int i_38_ = anIntArray208.length;
		return i_38_;
	}

	public boolean method156(byte i, int i_39_, int[] is) {
		if (!method153(i_39_, -1)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArray192[i_39_] == null) {
			boolean bool = false;
			return bool;
		}
		int[] is_40_ = anIntArrayArray218[i_39_];
		int i_41_ = anIntArray203[i_39_];
		if (anObjectArrayArray237[i_39_] == null)
			anObjectArrayArray237[i_39_] = new Object[anIntArray208[i_39_]];
		Object[] objects = anObjectArrayArray237[i_39_];
		boolean bool = true;
		if (i > -10) {
			boolean bool_42_ = false;
			return bool_42_;
		}
		for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
			int i_44_;
			if (is_40_ != null)
				i_44_ = is_40_[i_43_];
			else
				i_44_ = i_43_;
			if (objects[i_44_] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			boolean bool_45_ = true;
			return bool_45_;
		}
		byte[] is_46_;
		if (is == null || is[0] == 0 && is[1] == 0 && is[2] == 0 && is[3] == 0)
			is_46_ = Class63.method1282(anObjectArray192[i_39_], (byte) 89, false);
		else {
			is_46_ = Class63.method1282(anObjectArray192[i_39_], (byte) 48, true);
			Buffer class14_sub10 = new Buffer(is_46_);
			class14_sub10.method799(is, class14_sub10.payload.length, 14802, 5);
		}
		byte[] is_47_ = Class7_Sub3_Sub1.method139(-28009, is_46_);
		if (aBoolean220)
			anObjectArray192[i_39_] = null;
		if (i_41_ > 1) {
			int i_48_ = is_47_.length;
			int[] is_49_ = new int[i_41_];
			int i_50_ = is_47_[--i_48_] & 0xff;
			i_48_ -= i_41_ * 4 * i_50_;
			Buffer class14_sub10 = new Buffer(is_47_);
			class14_sub10.position = i_48_;
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
				int i_52_ = 0;
				for (int i_53_ = 0; i_41_ > i_53_; i_53_++) {
					i_52_ += class14_sub10.method812((byte) -122);
					is_49_[i_53_] += i_52_;
				}
			}
			byte[][] is_54_ = new byte[i_41_][];
			for (int i_55_ = 0; i_55_ < i_41_; i_55_++) {
				is_54_[i_55_] = new byte[is_49_[i_55_]];
				is_49_[i_55_] = 0;
			}
			int i_56_ = 0;
			class14_sub10.position = i_48_;
			for (int i_57_ = 0; i_50_ > i_57_; i_57_++) {
				int i_58_ = 0;
				for (int i_59_ = 0; i_59_ < i_41_; i_59_++) {
					i_58_ += class14_sub10.method812((byte) -115);
					Class72.method1322(is_47_, i_56_, is_54_[i_59_], is_49_[i_59_], i_58_);
					i_56_ += i_58_;
					is_49_[i_59_] += i_58_;
				}
			}
			for (int i_60_ = 0; i_60_ < i_41_; i_60_++) {
				int i_61_;
				if (is_40_ != null)
					i_61_ = is_40_[i_60_];
				else
					i_61_ = i_60_;
				if (!aBoolean244)
					objects[i_61_] = Static2.method251(false, is_54_[i_60_], -125);
				else
					objects[i_61_] = is_54_[i_60_];
			}
		} else {
			int i_62_;
			if (is_40_ != null)
				i_62_ = is_40_[0];
			else
				i_62_ = 0;
			if (aBoolean244)
				objects[i_62_] = is_47_;
			else
				objects[i_62_] = Static2.method251(false, is_47_, -83);
		}
		boolean bool_63_ = true;
		return bool_63_;
	}

	public byte[] method157(int i, int i_64_, int i_65_) {
		if (i_65_ != 20983)
			aClass124_207 = null;
		if (!method148(i, i_64_, -1)) {
			byte[] is = null;
			return is;
		}
		if (anObjectArrayArray237[i_64_] == null || anObjectArrayArray237[i_64_][i] == null) {
			boolean bool = method156((byte) -19, i_64_, null);
			if (!bool) {
				method164(77, i_64_);
				bool = method156((byte) -88, i_64_, null);
				if (!bool) {
					byte[] is = null;
					return is;
				}
			}
		}
		byte[] is = Class63.method1282(anObjectArrayArray237[i_64_][i], (byte) 39, false);
		byte[] is_66_ = is;
		return is_66_;
	}

	public boolean method158(int i, int i_67_, byte i_68_) {
		if (!method148(i, i_67_, -1)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArrayArray237[i_67_] != null && anObjectArrayArray237[i_67_][i] != null) {
			boolean bool = true;
			return bool;
		}
		if (anObjectArray192[i_67_] != null) {
			boolean bool = true;
			return bool;
		}
		method164(108, i_67_);
		int i_69_ = 26 % ((i_68_ + 22) / 62);
		if (anObjectArray192[i_67_] != null) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public boolean method159(int i, Class124 class124, Class124 class124_70_) {
		class124_70_ = class124_70_.method1716((byte) 63);
		class124 = class124.method1716((byte) 63);
		int i_71_ = aClass63_219.method1283(i - 13, class124_70_.method1709(49));
		if (!method153(i_71_, -1)) {
			boolean bool = false;
			return bool;
		}
		int i_72_ = aClass63Array213[i_71_].method1283(-9, class124.method1709(93));
		if (i != 4)
			anIntArrayArray218 = null;
		boolean bool = method158(i_72_, i_71_, (byte) 79);
		return bool;
	}

	public boolean method160(Class124 class124, byte i) {
		class124 = class124.method1716((byte) 63);
		if (i != -102)
			anIntArray215 = null;
		int i_73_ = aClass63_219.method1283(-9, class124.method1709(111));
		boolean bool = method161((byte) 116, i_73_);
		return bool;
	}

	public boolean method161(byte i, int i_74_) {
		if (!method153(i_74_, -1)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArray192[i_74_] != null) {
			boolean bool = true;
			return bool;
		}
		method164(i - 243, i_74_);
		if (i != 116) {
			boolean bool = true;
			return bool;
		}
		if (anObjectArray192[i_74_] != null) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public void method162(byte i, Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_75_ = aClass63_219.method1283(-9, class124.method1709(57));
		method174((byte) -92, i_75_);
		if (i != -106)
			method168(97, (byte) -53);
	}

	public byte[] method163(int i, int i_76_, int i_77_) {
		if (i_77_ != 0)
			aClass124_221 = null;
		byte[] is = method149(-23245, i, null, i_76_);
		return is;
	}

	public void method164(int i, int i_78_) {
		int i_79_ = -111 % ((-86 - i) / 36);
	}

	public byte[] method165(int i, int i_80_) {
		if (anIntArray208.length == 1) {
			byte[] is = method163(i_80_, 0, 0);
			return is;
		}
		if (!method153(i_80_, -1)) {
			byte[] is = null;
			return is;
		}
		int i_81_ = 109 / ((-20 - i) / 56);
		if (anIntArray208[i_80_] == 1) {
			byte[] is = method163(0, i_80_, 0);
			return is;
		}
		throw new RuntimeException();
	}

	public boolean method166(byte i, Class124 class124) {
		int i_82_ = 41 % ((i - 56) / 58);
		class124 = class124.method1716((byte) 63);
		int i_83_ = aClass63_219.method1283(-9, class124.method1709(108));
		if (i_83_ < 0) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public byte[] method167(Class124 class124, Class124 class124_84_, int i) {
		class124 = class124.method1716((byte) 63);
		int i_85_ = 125 % ((i - 3) / 60);
		class124_84_ = class124_84_.method1716((byte) 63);
		int i_86_ = aClass63_219.method1283(-9, class124.method1709(99));
		if (!method153(i_86_, -1)) {
			byte[] is = null;
			return is;
		}
		i_85_ = aClass63Array213[i_86_].method1283(-9, class124_84_.method1709(74));
		byte[] is = method163(i_85_, i_86_, 0);
		return is;
	}

	public void method168(int i, byte i_87_) {
		if (method153(i, -1)) {
			anObjectArrayArray237[i] = null;
			if (i_87_ != -90)
				method160(null, (byte) -8);
		}
	}

	public static void method169(int i) {
		if (i == -1) {
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.method77(); class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.method84()) {
				if (class14_sub14.anInt2975 > 0)
					class14_sub14.anInt2975--;
				if (class14_sub14.anInt2975 == 0) {
					if (class14_sub14.anInt2979 < 0
							|| Class63.method1284((byte) -116, class14_sub14.anInt2966, class14_sub14.anInt2979)) {
						Class133_Sub4.method1838(class14_sub14.anInt2966, class14_sub14.anInt2967,
								class14_sub14.anInt2970, class14_sub14.anInt2969, class14_sub14.anInt2979, (byte) 74,
								class14_sub14.anInt2971, class14_sub14.anInt2968);
						class14_sub14.unlink();
					}
				} else {
					if (class14_sub14.anInt2980 > 0)
						class14_sub14.anInt2980--;
					if (class14_sub14.anInt2980 == 0 && class14_sub14.anInt2967 >= 1 && class14_sub14.anInt2970 >= 1
							&& class14_sub14.anInt2967 <= 102 && class14_sub14.anInt2970 <= 102
							&& (class14_sub14.anInt2976 < 0 || Class63.method1284((byte) -116, class14_sub14.anInt2981,
									class14_sub14.anInt2976))) {
						Class133_Sub4.method1838(class14_sub14.anInt2981, class14_sub14.anInt2967,
								class14_sub14.anInt2970, class14_sub14.anInt2969, class14_sub14.anInt2976, (byte) 74,
								class14_sub14.anInt2971, class14_sub14.anInt2965);
						class14_sub14.anInt2980 = -1;
						if (class14_sub14.anInt2979 != class14_sub14.anInt2976 || class14_sub14.anInt2979 != -1) {
							if ((class14_sub14.anInt2976 == class14_sub14.anInt2979)
									&& (class14_sub14.anInt2968 == class14_sub14.anInt2965)
									&& (class14_sub14.anInt2981 == class14_sub14.anInt2966))
								class14_sub14.unlink();
						} else
							class14_sub14.unlink();
					}
				}
			}
		}
	}

	public boolean method170(boolean bool) {
		if (bool)
			aClass124_227 = null;
		boolean bool_88_ = true;
		for (int i = 0; i < anIntArray223.length; i++) {
			int i_89_ = anIntArray223[i];
			if (anObjectArray192[i_89_] == null) {
				method164(126, i_89_);
				if (anObjectArray192[i_89_] == null)
					bool_88_ = false;
			}
		}
		boolean bool_90_ = bool_88_;
		return bool_90_;
	}

	public boolean method171(int i, int i_91_) {
		if (i != 29499)
			method168(43, (byte) 17);
		if (1 == anIntArray208.length) {
			boolean bool = method158(i_91_, 0, (byte) 100);
			return bool;
		}
		if (!method153(i_91_, i - 29500)) {
			boolean bool = false;
			return bool;
		}
		if (anIntArray208[i_91_] == 1) {
			boolean bool = method158(0, i_91_, (byte) 49);
			return bool;
		}
		throw new RuntimeException();
	}

	public static void method172(byte i) {
		if (i >= 96)
			Class14_Sub8_Sub6.aClass52_4186.clear();
	}

	public int method173(int i) {
		int i_92_ = 0;
		int i_93_ = 0;
		for (int i_94_ = 0; anObjectArray192.length > i_94_; i_94_++) {
			if (anIntArray203[i_94_] > 0) {
				i_93_ += method178(0, i_94_);
				i_92_ += 100;
			}
		}
		if (i_92_ == 0) {
			int i_95_ = 100;
			return i_95_;
		}
		int i_96_ = i_93_ * i / i_92_;
		int i_97_ = i_96_;
		return i_97_;
	}

	public void method174(byte i, int i_98_) {
		/* empty */
	}

	public void method175(byte i, boolean bool, boolean bool_99_) {
		if (i != -99)
			aClass52_236 = null;
		if (bool_99_) {
			aClass63_219 = null;
			anIntArray197 = null;
		}
		if (bool) {
			anIntArrayArray198 = null;
			aClass63Array213 = null;
		}
	}

	public int[] method176(byte i, int i_100_) {
		if (i < 1) {
			int[] is = null;
			return is;
		}
		if (!method153(i_100_, -1)) {
			int[] is = null;
			return is;
		}
		int[] is = anIntArrayArray218[i_100_];
		if (is == null) {
			is = new int[anIntArray203[i_100_]];
			for (int i_101_ = 0; is.length > i_101_; i_101_++)
				is[i_101_] = i_101_;
		}
		int[] is_102_ = is;
		return is_102_;
	}

	public int method177(int i, int i_103_) {
		if (i_103_ != 13537) {
			int i_104_ = -39;
			return i_104_;
		}
		if (!method153(i, i_103_ - 13538)) {
			int i_105_ = 0;
			return i_105_;
		}
		int i_106_ = anIntArray208[i];
		return i_106_;
	}

	public Class9(boolean bool, boolean bool_107_) {
		aBoolean244 = bool_107_;
		aBoolean220 = bool;
	}

	public int method178(int i, int i_108_) {
		if (!method153(i_108_, i ^ 0xffffffff)) {
			int i_109_ = 0;
			return i_109_;
		}
		if (i != 0)
			method175((byte) 16, false, true);
		if (anObjectArray192[i_108_] != null) {
			int i_110_ = 100;
			return i_110_;
		}
		int i_111_ = 0;
		return i_111_;
	}
}
