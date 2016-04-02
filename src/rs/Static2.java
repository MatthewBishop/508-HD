/* LStatic - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.link.Class52;
import com.jagex.link.HashTable;
import com.jagex.rt4.Class121;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub2;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2_Sub1;
import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.Class10;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub12;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub18;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub21;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class Static2 {
	public static byte[][] aByteArrayArray362;
	public static Class124 aClass124_360;
	public static Class124 aClass124_364;
	public static Class43 aClass43_358;
	public static Class9 aClass9_367;
	public static Class9 aClass9_372;
	public static Class9_Sub1 aClass9_Sub1_369;
	public static int anInt356;
	public static int anInt359;
	public static int anInt365;
	public static int anInt366;
	public static int anInt370;
	public static int anInt371;
	public static int[] anIntArray351;
	public static int[] anIntArray363 = new int[1000];
	public static short[] aShortArray357;
	public static boolean aBoolean2736;
	public static Class124 aClass124_2730;
	public static Buffer[] aClass14_Sub10Array2742;
	public static HashTable aClass55_2733;
	public static int anInt2725;
	public static int anInt2726;
	public static int anInt2734;
	public static int anInt2740;
	public static int anInt2741;
	public static int[] anIntArray2727;
	public static int[] anIntArray2731;

	static {
		anIntArray351 = new int[2048];
		aShortArray357 = new short[] { 13, 10, 37, 47, 33, 20, 45, 18 };
		aClass124_364 = Class14_Sub2_Sub2.method263(1178, "");
		anInt365 = 0;
		anInt366 = 5063219;
		anInt371 = -1;
		aClass124_360 = Class14_Sub2_Sub2.method263(1178, " )2> <col=00ffff>");
		aClass124_2730 = Class14_Sub2_Sub2.method263(1178, "(R");
		anIntArray2731 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
		anInt2726 = 0;
		anInt2725 = 0;
		anInt2734 = -2;
		anIntArray2727 = new int[32];
		aClass14_Sub10Array2742 = new Buffer[2048];
		aBoolean2736 = false;
	}

	public static Class124 method230(String string, int i) {
		byte[] is;
		try {
			is = string.getBytes("ISO-8859-1");
		} catch (UnsupportedEncodingException unsupportedencodingexception) {
			is = string.getBytes();
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = i;
		for (int i_0_ = 0; i_0_ < is.length; i_0_++) {
			if (is[i_0_] != 0)
				is[class124.anInt2507++] = is[i_0_];
		}
		Class124 class124_1_ = class124;
		return class124_1_;
	}

	public static Class124 method231(byte i, int i_2_, byte[] is, int i_3_) {
		Class124 class124 = new Class124();
		class124.anInt2507 = 0;
		class124.aByteArray2495 = new byte[i_2_];
		if (i <= 71)
			anIntArray351 = null;
		for (int i_4_ = i_3_; i_2_ + i_3_ > i_4_; i_4_++) {
			if (is[i_4_] != 0)
				class124.aByteArray2495[class124.anInt2507++] = is[i_4_];
		}
		Class124 class124_5_ = class124;
		return class124_5_;
	}

	public static void method232(int i) {
		aClass9_367 = null;
		aByteArrayArray362 = null;
		aClass124_364 = null;
		aShortArray357 = null;
		aClass124_360 = null;
		aClass9_Sub1_369 = null;
		aClass43_358 = null;
		aClass9_372 = null;
		if (i != -21518)
			method230(null, -53);
		anIntArray351 = null;
		anIntArray363 = null;
	}

	public static void method241(int i, Buffer class14_sub10) {
		if (i == 11075) {
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool = false;
				int i_6_ = 0;
				int i_7_ = 0;
				if (class14_sub10.method798() == 1) {
					bool = true;
					i_6_ = class14_sub10.method798();
					i_7_ = class14_sub10.method798();
				}
				int i_8_ = class14_sub10.method798();
				int i_9_ = class14_sub10.method798();
				int i_10_ = -(i_9_ * 64) - (-Class35.anInt603 - Class14_Sub8_Sub15.anInt4332 + 1);
				int i_11_ = -Class65.anInt1034 + i_8_ * 64;
				if (i_11_ >= 0 && i_10_ - 63 >= 0 && i_11_ + 63 < Class14_Sub2_Sub9.anInt3856
						&& Class14_Sub8_Sub15.anInt4332 > i_10_) {
					int i_12_ = i_11_ >> 6;
					int i_13_ = i_10_ >> 6;
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						for (int i_15_ = 0; i_15_ < 64; i_15_++) {
							if (!bool || (i_14_ >= i_6_ * 8 && i_6_ * 8 + 8 > i_14_ && i_15_ >= i_7_ * 8
									&& i_7_ * 8 + 8 > i_15_)) {
								byte i_16_ = class14_sub10.method780((byte) -77);
								if (i_16_ != 0) {
									if ((Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_]) == null)
										Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_] = new byte[4096];
									Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_][i_14_
											+ (-i_15_ + 63 << 38)] = i_16_;
									byte i_17_ = class14_sub10.method780((byte) -77);
									if ((Class86.aByteArrayArrayArray1383[i_12_][i_13_]) == null)
										Class86.aByteArrayArrayArray1383[i_12_][i_13_] = new byte[4096];
									Class86.aByteArrayArrayArray1383[i_12_][i_13_][i_14_ + (-i_15_ + 63 << 6)] = i_17_;
								}
							}
						}
					}
				} else {
					for (int i_18_ = 0; (!bool ? 4096 : 64) > i_18_; i_18_++) {
						byte i_19_ = class14_sub10.method780((byte) -77);
						if (i_19_ != 0)
							class14_sub10.position++;
					}
				}
			}
		}
	}

	public static void method242(int i, int i_20_) {
		Class133_Sub6.anInt3659 = i_20_;
		Class14_Sub18.anInt3050 = i;
		Class14_Sub18.anInt3050 = -1;
		Class39.method1126((byte) -22);
	}

	public static Class14_Sub2_Sub19[] method243(byte i) {
		Class14_Sub2_Sub19[] class14_sub2_sub19s = new Class14_Sub2_Sub19[Class32.anInt547];
		if (i != 39) {
			Class14_Sub2_Sub19[] class14_sub2_sub19s_21_ = null;
			return class14_sub2_sub19s_21_;
		}
		for (int i_22_ = 0; Class32.anInt547 > i_22_; i_22_++) {
			byte[] is = Class12.aByteArrayArray310[i_22_];
			int i_23_ = Class17.anIntArray402[i_22_] * Class76.anIntArray1204[i_22_];
			if (Class125_Sub4.aBooleanArray3416[i_22_]) {
				byte[] is_24_ = Class98.aByteArrayArray1667[i_22_];
				int[] is_25_ = new int[i_23_];
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++)
					is_25_[i_26_] = (Class66.method1294(
							(Static.anIntArray1114[Class14_Sub8_Sub26.method617(is[i_26_], 255)]),
							Class14_Sub8_Sub26.method617(-16777216, is_24_[i_26_] << 24)));
				class14_sub2_sub19s[i_22_] = (new Class14_Sub2_Sub19_Sub2_Sub1(Class14_Sub11.anInt2952,
						Class14_Sub30.anInt3279, Class40.anIntArray675[i_22_], Class14_Sub2_Sub12.anIntArray3918[i_22_],
						Class17.anIntArray402[i_22_], Class76.anIntArray1204[i_22_], is_25_));
			} else {
				int[] is_27_ = new int[i_23_];
				for (int i_28_ = 0; i_23_ > i_28_; i_28_++)
					is_27_[i_28_] = (Static.anIntArray1114[Class14_Sub8_Sub26.method617(255, is[i_28_])]);
				class14_sub2_sub19s[i_22_] = new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952,
						Class14_Sub30.anInt3279, Class40.anIntArray675[i_22_],
						(Class14_Sub2_Sub12.anIntArray3918[i_22_]), Class17.anIntArray402[i_22_],
						(Class76.anIntArray1204[i_22_]), is_27_);
			}
		}
		Class129.method1761((byte) 19);
		Class14_Sub2_Sub19[] class14_sub2_sub19s_29_ = class14_sub2_sub19s;
		return class14_sub2_sub19s_29_;
	}

	public static int method244(int i) {
		if (i < 29)
			anInt2734 = 44;
		int i_30_ = Class14_Sub8_Sub31.anInt4602;
		return i_30_;
	}

	public static void method245(int i, byte i_31_) {
		rs.Class97 class97 = Class67.aClass97_1055;
		synchronized (class97) {
			Class14_Sub8_Sub31.anInt4602 = i;
		}
	}

	public static void method247(byte i, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i_32_;
		int i_37_ = 0;
		Class51.method1201(Static2.anIntArrayArray4038[i_34_], -i_32_ + i_33_, i_33_ + i_32_, -5973, i_35_);
		int i_38_ = -i_32_;
		int i_39_ = -1;
		while (i_37_ < i_36_) {
			i_39_ += 2;
			i_37_++;
			i_38_ += i_39_;
			if (i_38_ >= 0) {
				i_36_--;
				int[] is = Static2.anIntArrayArray4038[i_34_ + i_36_];
				int[] is_40_ = Static2.anIntArrayArray4038[-i_36_ + i_34_];
				i_38_ -= i_36_ << 33;
				int i_41_ = i_33_ - i_37_;
				int i_42_ = i_33_ + i_37_;
				Class51.method1201(is, i_41_, i_42_, -5973, i_35_);
				Class51.method1201(is_40_, i_41_, i_42_, -5973, i_35_);
			}
			int i_43_ = i_33_ + i_36_;
			int i_44_ = i_33_ - i_36_;
			int[] is = Static2.anIntArrayArray4038[i_37_ + i_34_];
			int[] is_45_ = Static2.anIntArrayArray4038[i_34_ - i_37_];
			Class51.method1201(is, i_44_, i_43_, -5973, i_35_);
			Class51.method1201(is_45_, i_44_, i_43_, -5973, i_35_);
		}
	}

	public static void method248(int i) {
		if (i == 32) {
			aClass55_2733 = null;
			aClass14_Sub10Array2742 = null;
			anIntArray2731 = null;
			anIntArray2727 = null;
			aClass124_2730 = null;
		}
	}

	public static Class124 aClass124_2905 = Class14_Sub2_Sub2.method263(1178, "glow2:");
	public static Class124 aClass124_2887 = aClass124_2905;
	public static Class124 aClass124_2872 = aClass124_2905;
	public static void method822(int i) {
		if (i > -21)
			aClass124_2872 = null;
		for (int i_67_ = 0; Static.anInt2550 > i_67_; i_67_++) {
			Class35 class35 = Class133.method1780((byte) 111, i_67_);
			if (class35 != null && class35.anInt587 == 0) {
				Class14_Sub9_Sub3.anIntArray4851[i_67_] = 0;
				Class14_Sub8_Sub11.anIntArray4275[i_67_] = 0;
			}
		}
		Static.aClass55_92 = new HashTable(16);
	}

	public static void method815(int i) {
		Static2.aClass9_2923 = null;
		Static2.aClass124Array2938 = null;
		aClass124_2887 = null;
		Static2.aClass9_Sub1_2901 = null;
		if (i != 0)
			Static2.aClass9_Sub1_2901 = null;
		aClass124_2872 = null;
		aClass124_2905 = null;
		Static2.aClass124_2869 = null;
	}

	public static int anInt2926;
	public static int anInt2911 = 0;
	public static int anInt2890;
	public static int anInt2889 = 0;
	public static int anInt2884;
	public static boolean aBoolean2870 = false;
	public static Class124 aClass124_2869 = Class14_Sub2_Sub2.method263(1178, "overlay");
	public static Class124[] aClass124Array2938 = new Class124[200];
	public static Class9 aClass9_2923;
	public static Class9_Sub1 aClass9_Sub1_2901;
	public static int anInt2878 = 0;
	public static Class124 aClass124_4887 = Class14_Sub2_Sub2.method263(1178, "Loading)3)3)3");
	public static Class124 aClass124_4891 = Class14_Sub2_Sub2.method263(1178, "huffman");
	public static int anInt4877 = 0;
	public static Class124 aClass124_4886 = aClass124_4887;
	public static Class124 aClass124_4876 = Class14_Sub2_Sub2.method263(1178, "Null");
	public static int anInt4882;
	public static int anInt4892;
	public static void method839(int i) {
		Class37.aClass52_635.clear();
		if (i != 8)
			method839(53);
	}

	public static boolean method841(int i, int i_2_) {
		if (i < 32) {
			boolean bool = false;
			return bool;
		}
		if (i == 127) {
			boolean bool = false;
			return bool;
		}
		if (i_2_ < 67) {
			boolean bool = true;
			return bool;
		}
		if (i >= 129 && i <= 159) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public static void method846(byte i) {
		aClass124_4891 = null;
		aClass124_4887 = null;
		aClass124_4876 = null;
		aClass124_4886 = null;
		if (i != 0)
			aClass124_4887 = null;
	}

	public static void method849(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_) {
		if (i_16_ <= Class59.anInt955 && Class14_Sub17.anInt3005 <= i_13_) {
			boolean bool;
			if (i < Class118.anInt1982) {
				bool = false;
				i = Class118.anInt1982;
			} else if (Class14_Sub8_Sub14.anInt4327 >= i)
				bool = true;
			else {
				i = Class14_Sub8_Sub14.anInt4327;
				bool = false;
			}
			boolean bool_18_;
			if (i_17_ >= Class118.anInt1982) {
				if (Class14_Sub8_Sub14.anInt4327 < i_17_) {
					bool_18_ = false;
					i_17_ = Class14_Sub8_Sub14.anInt4327;
				} else
					bool_18_ = true;
			} else {
				i_17_ = Class118.anInt1982;
				bool_18_ = false;
			}
			if (Class14_Sub17.anInt3005 <= i_16_)
				Class51.method1201((Static2.anIntArrayArray4038[i_16_++]), i_17_, i, -5973, i_15_);
			else
				i_16_ = Class14_Sub17.anInt3005;
			if (i_13_ <= Class59.anInt955)
				Class51.method1201((Static2.anIntArrayArray4038[i_13_--]), i_17_, i, -5973, i_15_);
			else
				i_13_ = Class59.anInt955;
			if (!bool_18_ || !bool) {
				if (!bool_18_) {
					if (bool) {
						for (int i_19_ = i_16_; i_19_ <= i_13_; i_19_++)
							Static2.anIntArrayArray4038[i_19_][i] = i_15_;
					}
				} else {
					for (int i_20_ = i_16_; i_20_ <= i_13_; i_20_++)
						Static2.anIntArrayArray4038[i_20_][i_17_] = i_15_;
				}
			} else {
				for (int i_21_ = i_16_; i_21_ <= i_13_; i_21_++) {
					int[] is = Static2.anIntArrayArray4038[i_21_];
					is[i_17_] = is[i] = i_15_;
				}
			}
		}
		if (i_14_ != 0)
			method846((byte) -97);
	}

	public static Class124 aClass124_1782 = Class14_Sub2_Sub2.method263(1178, "Continue");
	public static Class124 aClass124_1781 = aClass124_1782;
	public static boolean aBoolean1783;
	public static Class148[] aClass148Array1777;
	public static int anInt1791;
	public static int[] anIntArray1790;
	public static void method1541(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool,
			int i_15_, int i_16_) {
		Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.method77();
		Class14_Sub14 class14_sub14_17_ = null;
		for (/**/; class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.method84()) {
			if (class14_sub14.anInt2969 == i_11_ && class14_sub14.anInt2967 == i && i_12_ == class14_sub14.anInt2970
					&& class14_sub14.anInt2971 == i_15_) {
				class14_sub14_17_ = class14_sub14;
				break;
			}
		}
		if (class14_sub14_17_ == null) {
			class14_sub14_17_ = new Class14_Sub14();
			class14_sub14_17_.anInt2971 = i_15_;
			class14_sub14_17_.anInt2970 = i_12_;
			class14_sub14_17_.anInt2967 = i;
			class14_sub14_17_.anInt2969 = i_11_;
			Class7_Sub3_Sub1.method141(4, class14_sub14_17_);
			Class33.aClass2_583.method80(class14_sub14_17_);
		}
		class14_sub14_17_.anInt2975 = i_13_;
		class14_sub14_17_.anInt2980 = i_14_;
		class14_sub14_17_.anInt2965 = i_10_;
		class14_sub14_17_.anInt2976 = i_16_;
		if (!bool)
			class14_sub14_17_.anInt2981 = i_9_;
	}

	public static Class124[] method1545(int i, Class124[] class124s) {
		if (i != 5)
			aClass124_1782 = null;
		Class124[] class124s_22_ = new Class124[5];
		for (int i_23_ = 0; i_23_ < 5; i_23_++) {
			class124s_22_[i_23_] = (Class14_Sub8_Sub7.method515((new Class124[] {
					Class83.method1407(Canvas_Sub2.method69(i, 101), i_23_), Class14_Sub8.aClass124_2859 }),
					(byte) -25));
			if (class124s != null && class124s[i_23_] != null)
				class124s_22_[i_23_] = Class14_Sub8_Sub7
						.method515((new Class124[] { class124s_22_[i_23_], class124s[i_23_] }), (byte) -28);
		}
		Class124[] class124s_24_ = class124s_22_;
		return class124s_24_;
	}

	public static void method1542(int i) {
		aClass124_1782 = null;
		int i_18_ = -24 % ((28 - i) / 51);
		aClass124_1781 = null;
		anIntArray1790 = null;
		aClass148Array1777 = null;
	}

	public static void method1540(PacketBuffer class14_sub10_sub1, int i, int i_0_) {
		if (i_0_ == -15) {
			for (;;) {
				Class14_Sub7 class14_sub7 = (Class14_Sub7) Class40.aClass2_664.method77();
				if (class14_sub7 == null)
					break;
				boolean bool = false;
				for (int i_1_ = 0; i_1_ < class14_sub7.anInt2821; i_1_++) {
					if (class14_sub7.aClass31Array2828[i_1_] != null) {
						if (class14_sub7.aClass31Array2828[i_1_].anInt529 == 2)
							class14_sub7.anIntArray2820[i_1_] = -5;
						if (class14_sub7.aClass31Array2828[i_1_].anInt529 == 0)
							bool = true;
					}
					if (class14_sub7.aClass31Array2824[i_1_] != null) {
						if (class14_sub7.aClass31Array2824[i_1_].anInt529 == 2)
							class14_sub7.anIntArray2820[i_1_] = -6;
						if (class14_sub7.aClass31Array2824[i_1_].anInt529 == 0)
							bool = true;
					}
				}
				if (bool)
					break;
				class14_sub10_sub1.writeOpcode(i);
				class14_sub10_sub1.method809(0);
				int i_2_ = class14_sub10_sub1.position;
				class14_sub10_sub1.method803(class14_sub7.anInt2830, 92);
				for (int i_3_ = 0; i_3_ < class14_sub7.anInt2821; i_3_++) {
					if (class14_sub7.anIntArray2820[i_3_] != 0)
						class14_sub10_sub1.method809((class14_sub7.anIntArray2820[i_3_]));
					else {
						try {
							int i_4_ = class14_sub7.anIntArray2825[i_3_];
							if (i_4_ != 0) {
								if (i_4_ == 1) {
									Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
									field.setInt(null, (class14_sub7.anIntArray2819[i_3_]));
									class14_sub10_sub1.method809(0);
								} else if (i_4_ == 2) {
									Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
									int i_5_ = field.getModifiers();
									class14_sub10_sub1.method809(0);
									class14_sub10_sub1.method803(i_5_, i_0_ ^ ~0x5f);
								}
							} else {
								Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
								int i_6_ = field.getInt(null);
								class14_sub10_sub1.method809(0);
								class14_sub10_sub1.method803(i_6_, 110);
							}
							if (i_4_ == 3) {
								Method method = (Method) (class14_sub7.aClass31Array2824[i_3_].anObject530);
								byte[][] is = (class14_sub7.aByteArrayArrayArray2823[i_3_]);
								Object[] objects = new Object[is.length];
								for (int i_7_ = 0; is.length > i_7_; i_7_++) {
									ObjectInputStream objectinputstream = (new ObjectInputStream(
											new ByteArrayInputStream(is[i_7_])));
									objects[i_7_] = objectinputstream.readObject();
								}
								Object object = method.invoke(null, objects);
								if (object != null) {
									if (!(object instanceof Number)) {
										if (object instanceof Class124) {
											class14_sub10_sub1.method809(2);
											class14_sub10_sub1.method814(32768, (Class124) object);
										} else
											class14_sub10_sub1.method809(4);
									} else {
										class14_sub10_sub1.method809(1);
										class14_sub10_sub1.method817(((Number) object).longValue(), 127);
									}
								} else
									class14_sub10_sub1.method809(0);
							} else if (i_4_ == 4) {
								Method method = (Method) (class14_sub7.aClass31Array2824[i_3_].anObject530);
								int i_8_ = method.getModifiers();
								class14_sub10_sub1.method809(0);
								class14_sub10_sub1.method803(i_8_, 84);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class14_sub10_sub1.method809(-10);
						} catch (InvalidClassException invalidclassexception) {
							class14_sub10_sub1.method809(-11);
						} catch (StreamCorruptedException streamcorruptedexception) {
							class14_sub10_sub1.method809(-12);
						} catch (OptionalDataException optionaldataexception) {
							class14_sub10_sub1.method809(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							class14_sub10_sub1.method809(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							class14_sub10_sub1.method809(-15);
						} catch (InvocationTargetException invocationtargetexception) {
							class14_sub10_sub1.method809(-16);
						} catch (SecurityException securityexception) {
							class14_sub10_sub1.method809(-17);
						} catch (IOException ioexception) {
							class14_sub10_sub1.method809(-18);
						} catch (NullPointerException nullpointerexception) {
							class14_sub10_sub1.method809(-19);
						} catch (Exception exception) {
							class14_sub10_sub1.method809(-20);
						} catch (Throwable throwable) {
							class14_sub10_sub1.method809(-21);
						}
					}
				}
				class14_sub10_sub1.method786(i_2_, (byte) -99);
				class14_sub10_sub1.method804(class14_sub10_sub1.position - i_2_, (byte) 32);
				class14_sub7.unlink();
			}
		}
	}

	public static Class14_Sub2_Sub16_Sub1 method336(int i, byte[] is) {
		if (is == null) {
			Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = null;
			return class14_sub2_sub16_sub1;
		}
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(is, Class40.anIntArray675,
				Class14_Sub2_Sub12.anIntArray3918, Class17.anIntArray402, Class76.anIntArray1204,
				Class12.aByteArrayArray310);
		if (i != 4)
			Static2.method332(null, 25, -60, -103, 2, 125, 49);
		Class129.method1761((byte) 32);
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1_23_ = class14_sub2_sub16_sub1;
		return class14_sub2_sub16_sub1_23_;
	}

	public static void method334(int i) {
		Static2.aClass9_3945 = null;
		Static2.aClass124_3946 = null;
		if (i > -96)
			Static2.aClass124_3948 = null;
		Static2.aClass52_3942 = null;
		Static2.aClass124_3944 = null;
		Static2.aClass124_3948 = null;
		Static2.anIntArray3949 = null;
	}

	public static Class65 method335(int i, int i_19_) {
		if (i >= -16)
			Static2.aClass9_3945 = null;
		Class65 class65 = ((Class65) Class139.aClass52_2229.method1210((byte) 122, (long) i_19_));
		if (class65 != null) {
			Class65 class65_20_ = class65;
			return class65_20_;
		}
		byte[] is = Class14_Sub17.aClass9_3034.method163(i_19_, 1, 0);
		Class65 class65_21_ = new Class65();
		if (is != null)
			class65_21_.method1288(i_19_, (byte) -114, new Buffer(is));
		Class139.aClass52_2229.method1205(class65_21_, (long) i_19_);
		Class65 class65_22_ = class65_21_;
		return class65_22_;
	}

	public static void method332(Class94 class94, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_1_ * i_1_ + i_3_ * i_3_;
		if (i_5_ <= 360000 && i_0_ >= 72) {
			int i_6_ = Math.min(class94.anInt1518 / 2, class94.anInt1545 / 2);
			if (i_5_ <= i_6_ * i_6_)
				Class100.method1513(i_3_, i, i_1_, class94, (Class150.aClass14_Sub2_Sub19Array2417[i_2_]), 256, i_4_);
			else {
				i_6_ -= 10;
				int i_7_ = Static.anInt696 + Class14_Sub8_Sub19.anInt4408 & 0x7ff;
				int i_8_ = Class3.cos[i_7_];
				i_8_ = i_8_ * 256 / (Class32.anInt551 + 256);
				int i_9_ = Class3.sin[i_7_];
				i_9_ = i_9_ * 256 / (Class32.anInt551 + 256);
				int i_10_ = i_1_ * i_8_ + i_3_ * i_9_ >> 48;
				int i_11_ = -(i_9_ * i_1_) + i_8_ * i_3_ >> 48;
				double d = Math.atan2((double) i_10_, (double) i_11_);
				int i_12_ = (int) (Math.sin(d) * (double) i_6_);
				int i_13_ = (int) (Math.cos(d) * (double) i_6_);
				((Class14_Sub2_Sub19_Sub2) Class14_Sub2_Sub17.aClass14_Sub2_Sub19Array4013[i_2_]).method425(240, 240,
						(i_12_ + (class94.anInt1518 / 2 + i_4_)) * 16, (-i_13_ + class94.anInt1545 / 2 + i) * 16,
						(int) (d * 10430.378), 4096);
			}
		}
	}

	public static int[] anIntArray3949 = new int[50];
	public static int anInt3947;
	public static Class9 aClass9_3945;
	public static Class52 aClass52_3942 = new Class52(64);
	public static Class124 aClass124_3948 = Static2.aClass124_3946;
	public static Class124 aClass124_3946 = Class14_Sub2_Sub2.method263(1178, " more options");
	public static Class124 aClass124_3944 = Class14_Sub2_Sub2.method263(1178, "headicons_pk");
	public static void method399(int i, int i_32_, boolean bool, boolean bool_33_, int i_34_, int i_35_) {
		Class42.anInt699++;
		if (!bool) {
			Class38.method1116(1, true);
			Class14_Sub2_Sub18_Sub2.method384(true, 10312);
			Class38.method1116(1, false);
		}
		Class14_Sub2_Sub18_Sub2.method384(false, 10312);
		if (!bool)
			Canvas_Sub2.method64();
		Class153.method2046(-76);
		Class35.method1092(i_35_, true, i_34_, i, 34, i_32_);
		i_35_ = Class14_Sub8_Sub3.anInt4135;
		i = Class14_Sub19.anInt3071;
		i_32_ = Static2.anInt4031;
		i_34_ = Static.anInt3952;
		if (Class89.anInt1415 == 1) {
			int i_36_ = Static.anInt102;
			int i_37_ = Class142.anInt2307 + Class14_Sub8_Sub19.anInt4408 & 0x7ff;
			if (i_36_ < Class14_Sub8_Sub38.anInt4740 / 256)
				i_36_ = Class14_Sub8_Sub38.anInt4740 / 256;
			if (Class112.aBooleanArray1872[4] && Class14_Sub29.anIntArray3264[4] + 128 > i_36_)
				i_36_ = Class14_Sub29.anIntArray3264[4] + 128;
			Class14_Sub8_Sub12.method543(
					Static.method1017((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495), Class14_Sub2_Sub3.anInt3785,
							(byte) 11, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436)) - 50,
					i_35_, i_36_, i_37_, Static.anInt905, 90, i_36_ * 3 + 600, Class140.anInt2238);
		}
		int i_38_ = anInt2926;
		int i_39_ = Class14_Sub30.anInt3271;
		int i_40_ = Class14_Sub8_Sub38.anInt4741;
		int i_41_ = Class69.anInt1072;
		int i_42_ = Class7_Sub3_Sub1.anInt3719;
		for (int i_43_ = 0; i_43_ < 5; i_43_++) {
			if (Class112.aBooleanArray1872[i_43_]) {
				int i_44_ = (int) (((double) (Class117.anIntArray1961[i_43_] * 2 + 1) * Math.random())
						- (double) Class117.anIntArray1961[i_43_]
						+ (Math.sin((double) (Class14_Sub8_Sub15.anIntArray4336[i_43_])
								* ((double) (Class133_Sub3.anIntArray3559[i_43_]) / 100.0))
								* (double) (Class14_Sub29.anIntArray3264[i_43_])));
				if (i_43_ == 1)
					anInt2926 += i_44_;
				if (i_43_ == 4) {
					Class7_Sub3_Sub1.anInt3719 += i_44_;
					if (Class7_Sub3_Sub1.anInt3719 < 128)
						Class7_Sub3_Sub1.anInt3719 = 128;
					if (Class7_Sub3_Sub1.anInt3719 > 383)
						Class7_Sub3_Sub1.anInt3719 = 383;
				}
				if (i_43_ == 0)
					Class14_Sub8_Sub38.anInt4741 += i_44_;
				if (i_43_ == 3)
					Class69.anInt1072 = Class69.anInt1072 + i_44_ & 0x7ff;
				if (i_43_ == 2)
					Class14_Sub30.anInt3271 += i_44_;
			}
		}
		Class35.method1097((byte) 125);
		Class25.method999(i, i_32_, i + i_34_, i_35_ + i_32_);
		float f = (float) Class7_Sub3_Sub1.anInt3719 * 0.17578125F;
		float f_45_ = (float) Class69.anInt1072 * 0.17578125F;
		if (Class89.anInt1415 == 3) {
			f = Class14_Sub17.aFloat3023 * 360.0F / 6.2831855F;
			f_45_ = Class56_Sub1.aFloat3323 * 360.0F / 6.2831855F;
		}
		Class121.method1647(i, i_32_, i_34_, i_35_, i_34_ / 2 + i, i_32_ + i_35_ / 2, f, f_45_,
				Class14_Sub8_Sub10.anInt4251, Class14_Sub8_Sub10.anInt4251);
		if (!Class133_Sub5.aBoolean3628 && i <= Class14_Sub8_Sub33.anInt4629 && i_34_ + i > Class14_Sub8_Sub33.anInt4629
				&& Class14_Sub8_Sub32.anInt4613 >= i_32_ && Class14_Sub8_Sub32.anInt4613 < i_35_ + i_32_) {
			Class14_Sub15.anInt2996 = 0;
			int i_46_ = Static.anInt425;
			int i_47_ = Class58.anInt948;
			int i_48_ = Class70.anInt1081;
			int i_49_ = Class14_Sub8_Sub27.anInt4547;
			Class90.aBoolean1417 = true;
			anInt2726 = i_46_ + ((Class14_Sub8_Sub33.anInt4629 - i) * (i_49_ - i_46_) / i_34_);
			Class38.anInt2622 = i_47_ + ((i_48_ - i_47_) * (-i_32_ + Class14_Sub8_Sub32.anInt4613) / i_35_);
		} else {
			Class14_Sub15.anInt2996 = 0;
			Class90.aBoolean1417 = false;
		}
		Class138.method1946(139);
		byte i_50_ = (Class14_Sub2_Sub8.method296((byte) 79) == 2 ? (byte) Class42.anInt699 : (byte) 1);
		Class121.method1645();
		Class121.method1652(true);
		boolean bool_51_ = false;
		Class121.method1626(true);
		int i_52_;
		if (Class14_Sub8_Sub16.anInt4356 == 10)
			i_52_ = Class14_Sub8_Sub18.method576(Class51.anInt839, (Class14_Sub8_Sub38.anInt4741 >> 10),
					Class14_Sub30.anInt3271 >> 10, -3217, Class14_Sub8_Sub6.anInt4190);
		else
			i_52_ = Class14_Sub8_Sub18.method576(Class51.anInt839,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) >> 35,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]) >> 3, -3217, Class14_Sub8_Sub6.anInt4190);
		Class10.method190(Class14_Sub2_Sub20.anInt4064, !Class33.aBoolean584);
		Class121.method1631(i_52_);
		RT4.method397(Class7_Sub3_Sub1.anInt3719, Class14_Sub30.anInt3271, Class14_Sub8_Sub38.anInt4741, anInt2926,
				Class69.anInt1072);
		Class121.anInt2045 = Class14_Sub2_Sub20.anInt4064;
		Class14_Sub8_Sub21.method588(Class14_Sub8_Sub38.anInt4741, anInt2926, Class14_Sub30.anInt3271,
				Class7_Sub3_Sub1.anInt3719, Class69.anInt1072, Class28.aByteArrayArrayArray512,
				Class14_Sub2_Sub11.anIntArray3872, Class14_Sub8_Sub20.anIntArray4422, Class14_Sub19.anIntArray3079,
				Class120.anIntArray2008, Class96.anIntArray1630, Class14_Sub2_Sub3.anInt3785 + 1, i_50_,
				Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7,
				Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 39);
		Class89.aBoolean1409 = true;
		Class10.method188();
		RT4.method397(0, 0, 0, 0, 0);
		Class138.method1946(139);
		Class14_Sub2_Sub9.method304();
		Class14_Sub7.method469(i_35_, i, Class14_Sub8_Sub10.anInt4251, i_34_, bool_33_, i_32_,
				Class14_Sub8_Sub10.anInt4251);
		Class120.method1615(i_34_, Class14_Sub8_Sub10.anInt4251, i, Class14_Sub8_Sub10.anInt4251, -26, i_35_, i_32_);
		((Class134) Class3.anInterface3_117).method1922(Class51.anInt839, (byte) -118);
		Class75.method1343(i_32_, -74, i, i_34_, i_35_);
		Class7_Sub3_Sub1.anInt3719 = i_42_;
		anInt2926 = i_38_;
		Class69.anInt1072 = i_41_;
		Class14_Sub8_Sub38.anInt4741 = i_40_;
		Class14_Sub30.anInt3271 = i_39_;
		if (Static.aBoolean2722 && Class14_Sub25.method917(false, true, (byte) 96) == 0)
			Static.aBoolean2722 = false;
		if (Static.aBoolean2722) {
			Class25.method1004(i, i_32_, i_34_, i_35_, 0);
			Class84.method1411(false, client.aClass124_2639, true);
		}
		if (!bool && !Static.aBoolean2722 && !Class133_Sub5.aBoolean3628 && Class14_Sub8_Sub33.anInt4629 >= i
				&& i_34_ + i > Class14_Sub8_Sub33.anInt4629 && Class14_Sub8_Sub32.anInt4613 >= i_32_
				&& i_35_ + i_32_ > Class14_Sub8_Sub32.anInt4613)
			Class14_Sub8_Sub28.method628(Class14_Sub8_Sub33.anInt4629, Class14_Sub8_Sub32.anInt4613, i, i_32_, bool_33_,
					i_34_, i_35_);
	}

	public static void method394(byte i, Class14_Sub9 class14_sub9) {
		if (class14_sub9.aClass14_Sub12_2866 != null)
			class14_sub9.aClass14_Sub12_2866.anInt2953 = 0;
		class14_sub9.aBoolean2864 = false;
		for (Class14_Sub9 class14_sub9_15_ = class14_sub9
				.method688(); class14_sub9_15_ != null; class14_sub9_15_ = class14_sub9.method686())
			method394((byte) -39, class14_sub9_15_);
	}

	public static Class148[] method392(int i) {
		Class148[] class148s = new Class148[Class32.anInt547];
		if (i <= 99) {
			Class148[] class148s_6_ = null;
			return class148s_6_;
		}
		for (int i_7_ = 0; i_7_ < Class32.anInt547; i_7_++)
			class148s[i_7_] = new Class148_Sub2(Class14_Sub11.anInt2952, Class14_Sub30.anInt3279,
					Class40.anIntArray675[i_7_], Class14_Sub2_Sub12.anIntArray3918[i_7_], Class17.anIntArray402[i_7_],
					Class76.anIntArray1204[i_7_], Class12.aByteArrayArray310[i_7_], Static.anIntArray1114);
		Class129.method1761((byte) 97);
		Class148[] class148s_8_ = class148s;
		return class148s_8_;
	}

	public static void method388(int i) {
		Static2.anIntArray4052 = null;
		Static2.aClass124_4045 = null;
		Static2.aClass124_4040 = null;
		Static2.anIntArrayArray4038 = null;
		Static2.aClass124_4051 = null;
		Static2.aClass124_4049 = null;
		Static2.aClass124_4039 = null;
		Static2.aClass124_4041 = null;
		Static2.aClass52_4053 = null;
		Static2.aClass55_4048 = null;
		Static2.aClass124_4044 = null;
		int i_0_ = 120 / ((-40 - i) / 41);
		Static2.aClass104_4037 = null;
	}

	public static Class124 aClass124_4049 = (Class14_Sub2_Sub2.method263(1178,
	"Your ignore list is full)3 Max of 100 users)3"));
	public static Class124 aClass124_4045 = aClass124_4049;
	public static int[][] anIntArrayArray4038;
	public static int[] anIntArray4052 = new int[50];
	public static int anInt4031 = 0;
	public static HashTable aClass55_4048 = new HashTable(16);
	public static Class52 aClass52_4053 = new Class52(30);
	public static Class124 aClass124_4051 = Class14_Sub2_Sub2.method263(1178, "(U(Y");
	public static Class124 aClass124_4044 = Class14_Sub2_Sub2.method263(1178, ")1p");
	public static Class124 aClass124_4041 = Class14_Sub2_Sub2.method263(1178, "<)4col> x");
	public static Class124 aClass124_4040 = Class14_Sub2_Sub2.method263(1178, "Starte 3D)2Softwarebibliothek)3");
	public static Class124 aClass124_4039 = Class14_Sub2_Sub2.method263(1178, "");
	public static Class104 aClass104_4037;
	public static boolean aBoolean2372 = true;
	public static Class124 aClass124_2380 = Class14_Sub2_Sub2.method263(1178, "::noclip");
	public static Class124 aClass124_2382 = Class14_Sub2_Sub2.method263(1178, "null");
	public static Class52 aClass52_2370 = new Class52(64);
	public static void method1996(byte i) {
		if (i >= 48) {
			if (Class14_Sub8_Sub16.anInt4356 == 10)
				Class126.method1743(27252, 28);
			if (Class14_Sub8_Sub16.anInt4356 == 30)
				Class126.method1743(27252, 25);
		}
	}

	public static void method1997(int i) {
		if (i != 64)
			aClass52_2370 = null;
		aClass124_2380 = null;
		aClass52_2370 = null;
		aClass124_2382 = null;
	}

	public static Class124 method1998(int i, byte i_0_, Buffer class14_sub10) {
		while_170_: do {
			do {
				Class124 class124;
				try {
					if (i_0_ < -122)
						break;
					Object object = null;
					class124 = (Class124) object;
				} catch (Exception exception) {
					break while_170_;
				}
				return class124;
			} while (false);
			Class124 class124;
			try {
				Class124 class124_1_ = new Class124();
				class124_1_.anInt2507 = class14_sub10.method818((byte) 76);
				if (i < class124_1_.anInt2507)
					class124_1_.anInt2507 = i;
				class124_1_.aByteArray2495 = new byte[class124_1_.anInt2507];
				class14_sub10.position += Class98.aClass5_1659.method110((class14_sub10.payload),
						(class124_1_.aByteArray2495), 0, class14_sub10.position, class124_1_.anInt2507, (byte) -30);
				class124 = class124_1_;
			} catch (Exception exception) {
				break;
			}
			return class124;
		} while (false);
		new Throwable();
		return Class18.aClass124_418;
	}

	public static void method2000(Class9 class9, Class9 class9_4_, byte i, Class9 class9_5_) {
		if (i >= -1)
			aClass124_2382 = null;
		Class33.aClass9_579 = class9_4_;
		Class125_Sub4.aClass9_3427 = class9;
		Class133_Sub1_Sub1.aClass9_4935 = class9_5_;
	}

	public static void method259(boolean bool, int i) {
		if (i == 11988) {
			Class138.method1946(139);
			if (Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 25) {
				Class9.anInt246++;
				if (Class9.anInt246 >= 50 || bool) {
					Class9.anInt246 = 0;
					if (!Class89.aBoolean1416 && Class14_Sub15.aClass36_2990 != null) {
						Class32.anInt571++;
						Static.aClass14_Sub10_Sub1_891.writeOpcode(115);
						try {
							Class14_Sub15.aClass36_2990.method1100(0, 3, Static.aClass14_Sub10_Sub1_891.position,
									(Static.aClass14_Sub10_Sub1_891.payload));
							Static.aClass14_Sub10_Sub1_891.position = 0;
						} catch (IOException ioexception) {
							Class89.aBoolean1416 = true;
						}
					}
					Class138.method1946(139);
				}
			}
		}
	}

	public static void method258(int i) {
		Static2.aClass66Array3721 = null;
		Static2.anIntArray3720 = null;
		Static2.aClass124_3747 = null;
		if (i == 1869706832)
			Static2.aClass124_3724 = null;
	}

	public static void method256(short[] is, Class124[] class124s, int i) {
		int i_51_ = 109 / ((i + 71) / 49);
		Class14_Sub8_Sub9.method525(class124s, -25279, class124s.length - 1, 0, is);
	}

	public static Object method251(boolean bool, byte[] is, int i) {
		if (is == null) {
			Object object = null;
			return object;
		}
		do {
			if (136 < is.length && !Class14_Sub8_Sub10.aBoolean4245) {
				Class126 class126;
				try {
					Class126 class126_1_ = ((Class126) Class.forName("rs.Class126_Sub1").newInstance());
					class126_1_.method1740(is, 101);
					class126 = class126_1_;
				} catch (Throwable throwable) {
					Throwable throwable_2_ = new Throwable();
					Class14_Sub8_Sub10.aBoolean4245 = true;
					break;
				}
				return class126;
			}
		} while (false);
		if (i > -67)
			return null;
		if (bool) {
			byte[] is_3_ = Class14_Sub8_Sub26.method616(is, 84);
			return is_3_;
		}
		byte[] is_4_ = is;
		return is_4_;
	}

	public static void method250(int i, boolean bool) {
		if (Class126.method1741((byte) 50, i)) {
			Class125_Sub3.method1735((byte) 31, -1, Class1.aClass94ArrayArray75[i]);
			if (bool)
				method256(null, null, 49);
		}
	}

	public static Class124 method249(int i, int i_0_) {
		if (i_0_ < 100000) {
			Class124 class124 = Class14_Sub8_Sub7.method515(
					(new Class124[] { Class64.aClass124_1010, Class83.method1407(68, i_0_), Class149.aClass124_2390 }),
					(byte) -33);
			return class124;
		}
		if (i < 12) {
			Class124 class124 = null;
			return class124;
		}
		if (i_0_ < 10000000) {
			Class124 class124 = Class14_Sub8_Sub7.method515((new Class124[] { Class150.aClass124_2418,
					Class83.method1407(99, (i_0_ / 1000)), Class111.aClass124_1864, Class149.aClass124_2390 }),
					(byte) -14);
			return class124;
		}
		Class124 class124 = Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub17.aClass124_3026,
				Class83.method1407(71, (i_0_ / 1000000)), Static.aClass124_695, Class149.aClass124_2390 }),
				(byte) -37);
		return class124;
	}

	public static int[] anIntArray3720 = new int[200];
	public static int anInt3739 = 0;
	public static int anInt3749 = 0;
	public static int anInt3732 = 1;
	public static int anInt3728 = 0;
	public static Class66[] aClass66Array3721 = new Class66[4];
	public static Class124 aClass124_3747 = Class14_Sub2_Sub2.method263(1178, "Lade Benutzeroberfl-=che )2 ");
	public static Class124 aClass124_3724 = Class14_Sub2_Sub2.method263(1178, " )2> <col=ffff00>");
	public static void method1117(int il, int i_44_, int i_45_) {
		if (i_45_ != Class112.anInt1876) {
			Class14_Sub8_Sub4.anIntArray4145 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				Class14_Sub8_Sub4.anIntArray4145[i_46_] = (i_46_ << 12) / i_45_;
			Class112.anInt1876 = i_45_;
			Class79.anInt1288 = i_45_ != 64 ? 4096 : 2048;
			anInt4882 = i_45_ - 1;
		}
		if (Class17.anInt407 != i_44_) {
			if (Class112.anInt1876 != i_44_) {
				Class133_Sub5.anIntArray3623 = new int[i_44_];
				for (int i_47_ = 0; i_44_ > i_47_; i_47_++)
					Class133_Sub5.anIntArray3623[i_47_] = (i_47_ << 44) / i_44_;
			} else
				Class133_Sub5.anIntArray3623 = Class14_Sub8_Sub4.anIntArray4145;
			Class17.anInt407 = i_44_;
			Class115.anInt1927 = i_44_ - 1;
		}
	}
}
