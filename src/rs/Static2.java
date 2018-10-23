/* LStatic - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;
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
import java.math.BigInteger;
import java.net.Socket;

import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.io.js5.Class9;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Cache;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;
import com.jagex.link.ref.SoftCache;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.Class11;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class148_Sub2;
import com.jagex.rt4.HDTile;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.AbstractSprite_Sub2_Sub1;
import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.ShadowManager;
import com.jagex.rt4.lights.Light;
import com.jagex.rt4.lights.LightManager;
import com.jagex.sound.Track;
import com.jagex.util.ArrayUtils;
import com.jagex.util.Util;

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
	public static int mouseOffFromCenterX;
	public static int anInt2734;
	public static int anInt2740;
	public static int anInt2741;
	public static int[] anIntArray2727;
	public static int[] anIntArray2731;

	static {
		anIntArray351 = new int[2048];
		aShortArray357 = new short[] { 13, 10, 37, 47, 33, 20, 45, 18 };
		aClass124_364 = Class124.method263(1178, "");
		anInt365 = 0;
		anInt366 = 5063219;
		anInt371 = -1;
		aClass124_360 = Class124.method263(1178, " )2> <col=00ffff>");
		aClass124_2730 = Class124.method263(1178, "(R");
		anIntArray2731 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };
		mouseOffFromCenterX = 0;
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
				if (class14_sub10.readUByte() == 1) {
					bool = true;
					i_6_ = class14_sub10.readUByte();
					i_7_ = class14_sub10.readUByte();
				}
				int i_8_ = class14_sub10.readUByte();
				int i_9_ = class14_sub10.readUByte();
				int i_10_ = -(i_9_ * 64) - (-Class35.anInt603 - JunkTex.anInt4332 + 1);
				int i_11_ = -Class65.anInt1034 + i_8_ * 64;
				if (i_11_ >= 0 && i_10_ - 63 >= 0 && i_11_ + 63 < Class14_Sub2_Sub9.anInt3856
						&& JunkTex.anInt4332 > i_10_) {
					int i_12_ = i_11_ >> 6;
					int i_13_ = i_10_ >> 6;
					for (int i_14_ = 0; i_14_ < 64; i_14_++) {
						for (int i_15_ = 0; i_15_ < 64; i_15_++) {
							if (!bool || (i_14_ >= i_6_ * 8 && i_6_ * 8 + 8 > i_14_ && i_15_ >= i_7_ * 8
									&& i_7_ * 8 + 8 > i_15_)) {
								byte i_16_ = class14_sub10.method780();
								if (i_16_ != 0) {
									if ((Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_]) == null)
										Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_] = new byte[4096];
									Class14_Sub2_Sub5.aByteArrayArrayArray3816[i_12_][i_13_][i_14_
											+ (-i_15_ + 63 << 38)] = i_16_;
									byte i_17_ = class14_sub10.method780();
									if ((Class86.aByteArrayArrayArray1383[i_12_][i_13_]) == null)
										Class86.aByteArrayArrayArray1383[i_12_][i_13_] = new byte[4096];
									Class86.aByteArrayArrayArray1383[i_12_][i_13_][i_14_ + (-i_15_ + 63 << 6)] = i_17_;
								}
							}
						}
					}
				} else {
					for (int i_18_ = 0; (!bool ? 4096 : 64) > i_18_; i_18_++) {
						byte i_19_ = class14_sub10.method780();
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
		Static2.method1126((byte) -22);
	}

	public static AbstractSprite[] constructTransparentSprites(byte i) {
		AbstractSprite[] class14_sub2_sub19s = new AbstractSprite[Class32.spriteAmount];
		if (i != 39) {
			AbstractSprite[] class14_sub2_sub19s_21_ = null;
			return class14_sub2_sub19s_21_;
		}
		for (int i_22_ = 0; Class32.spriteAmount > i_22_; i_22_++) {
			byte[] is = Class12.spritePaletteIndicators[i_22_];
			int i_23_ = Class17.spriteWidths[i_22_] * Class76.spriteHeights[i_22_];
			if (JunkTex.spriteHasAlpha[i_22_]) {
				byte[] is_24_ = Class98.spriteAlphas[i_22_];
				int[] is_25_ = new int[i_23_];
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++)
					is_25_[i_26_] = (Class66.method1294(
							(JunkTex.spritePalette[JunkTex.method617(is[i_26_], 255)]),
							JunkTex.method617(-16777216, is_24_[i_26_] << 24)));
				class14_sub2_sub19s[i_22_] = (new AbstractSprite_Sub2_Sub1(Class14_Sub11.spriteTrimWidth,
						Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_22_], Class14_Sub2_Sub12.spriteYOffsets[i_22_],
						Class17.spriteWidths[i_22_], Class76.spriteHeights[i_22_], is_25_));
			} else {
				int[] is_27_ = new int[i_23_];
				for (int i_28_ = 0; i_23_ > i_28_; i_28_++)
					is_27_[i_28_] = (JunkTex.spritePalette[JunkTex.method617(255, is[i_28_])]);
				class14_sub2_sub19s[i_22_] = new AbstractSprite_Sub2(Class14_Sub11.spriteTrimWidth,
						Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_22_],
						(Class14_Sub2_Sub12.spriteYOffsets[i_22_]), Class17.spriteWidths[i_22_],
						(Class76.spriteHeights[i_22_]), is_27_);
			}
		}
		Class129.method1761((byte) 19);
		AbstractSprite[] class14_sub2_sub19s_29_ = class14_sub2_sub19s;
		return class14_sub2_sub19s_29_;
	}

	public static int method244(int i) {
		if (i < 29)
			anInt2734 = 44;
		int i_30_ = JunkTex.anInt4602;
		return i_30_;
	}

	public static void method245(int i, byte i_31_) {
		rs.Class97 class97 = Class67.aClass97_1055;
		synchronized (class97) {
			JunkTex.anInt4602 = i;
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

	public static Class124 aClass124_2905 = Class124.method263(1178, "glow2:");
	public static Class124 aClass124_2887 = aClass124_2905;
	public static Class124 aClass124_2872 = aClass124_2905;
	public static void method822(int i) {
		if (i > -21)
			aClass124_2872 = null;
		for (int i_67_ = 0; JunkTex.anInt2550 > i_67_; i_67_++) {
			Class35 class35 = Class133.method1780((byte) 111, i_67_);
			if (class35 != null && class35.anInt587 == 0) {
				Class14_Sub9_Sub3.anIntArray4851[i_67_] = 0;
				JunkTex.anIntArray4275[i_67_] = 0;
			}
		}
		JunkTex.aClass55_92 = new HashTable(16);
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
	public static Class124 aClass124_2869 = Class124.method263(1178, "overlay");
	public static Class124[] aClass124Array2938 = new Class124[200];
	public static Class9 aClass9_2923;
	public static Class9_Sub1 aClass9_Sub1_2901;
	public static int anInt2878 = 0;
	public static Class124 aClass124_4887 = Class124.method263(1178, "Loading)3)3)3");
	public static Class124 aClass124_4891 = Class124.method263(1178, "huffman");
	public static int anInt4877 = 0;
	public static Class124 aClass124_4886 = aClass124_4887;
	public static Class124 aClass124_4876 = Class124.method263(1178, "Null");
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

	public static Class124 aClass124_1782 = Class124.method263(1178, "Continue");
	public static Class124 aClass124_1781 = aClass124_1782;
	public static boolean aBoolean1783;
	public static Class148[] aClass148Array1777;
	public static int anInt1791;
	public static int[] occludersMaxX;
	public static void method1541(int i, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, boolean bool,
			int i_15_, int i_16_) {
		Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getFront();
		Class14_Sub14 class14_sub14_17_ = null;
		for (/**/; class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getNext()) {
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
			Class33.aClass2_583.pushBack(class14_sub14_17_);
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
			class124s_22_[i_23_] = (JunkTex.method515((new Class124[] {
					Class83.method1407(Canvas_Sub2.method69(i, 101), i_23_), JunkTex.aClass124_2859 }),
					(byte) -25));
			if (class124s != null && class124s[i_23_] != null)
				class124s_22_[i_23_] = JunkTex
						.method515((new Class124[] { class124s_22_[i_23_], class124s[i_23_] }), (byte) -28);
		}
		Class124[] class124s_24_ = class124s_22_;
		return class124s_24_;
	}

	public static void method1542(int i) {
		aClass124_1782 = null;
		int i_18_ = -24 % ((28 - i) / 51);
		aClass124_1781 = null;
		occludersMaxX = null;
		aClass148Array1777 = null;
	}

	public static void method1540(PacketBuffer class14_sub10_sub1, int i, int i_0_) {
		if (i_0_ == -15) {
			for (;;) {
				Class14_Sub7 class14_sub7 = (Class14_Sub7) Class40.aClass2_664.getFront();
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
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(is, Class40.spriteXOffsets,
				Class14_Sub2_Sub12.spriteYOffsets, Class17.spriteWidths, Class76.spriteHeights,
				Class12.spritePaletteIndicators);
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
		Class65 class65 = ((Class65) Class139.aClass52_2229.get(i_19_));
		if (class65 != null) {
			Class65 class65_20_ = class65;
			return class65_20_;
		}
		byte[] is = Class14_Sub17.aClass9_3034.method163(i_19_, 1, 0);
		Class65 class65_21_ = new Class65();
		if (is != null)
			class65_21_.method1288(i_19_, (byte) -114, new Buffer(is));
		Class139.aClass52_2229.put(class65_21_, i_19_);
		Class65 class65_22_ = class65_21_;
		return class65_22_;
	}

	public static void method332(Class94 class94, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_1_ * i_1_ + i_3_ * i_3_;
		if (i_5_ <= 360000 && i_0_ >= 72) {
			int i_6_ = Math.min(class94.anInt1518 / 2, class94.anInt1545 / 2);
			if (i_5_ <= i_6_ * i_6_)
				Static2.method1513(i_3_, i, i_1_, class94, (OverlayType.aClass14_Sub2_Sub19Array2417[i_2_]), 256, i_4_);
			else {
				i_6_ -= 10;
				int i_7_ = JunkTex.anInt696 + JunkTex.anInt4408 & 0x7ff;
				int i_8_ = Class3.cos[i_7_];
				i_8_ = i_8_ * 256 / (Class32.anInt551 + 256);
				int i_9_ = Class3.sin[i_7_];
				i_9_ = i_9_ * 256 / (Class32.anInt551 + 256);
				int i_10_ = i_1_ * i_8_ + i_3_ * i_9_ >> 48;
				int i_11_ = -(i_9_ * i_1_) + i_8_ * i_3_ >> 48;
				double d = Math.atan2(i_10_, i_11_);
				int i_12_ = (int) (Math.sin(d) * i_6_);
				int i_13_ = (int) (Math.cos(d) * i_6_);
				((AbstractSprite_Sub2) JunkTex.aClass14_Sub2_Sub19Array4013[i_2_]).method425(240, 240,
						(i_12_ + (class94.anInt1518 / 2 + i_4_)) * 16, (-i_13_ + class94.anInt1545 / 2 + i) * 16,
						(int) (d * 10430.378), 4096);
			}
		}
	}

	public static int[] anIntArray3949 = new int[50];
	public static int anInt3947;
	public static Class9 aClass9_3945;
	public static SoftCache aClass52_3942 = new SoftCache(64);
	public static Class124 aClass124_3948 = Static2.aClass124_3946;
	public static Class124 aClass124_3946 = Class124.method263(1178, " more options");
	public static Class124 aClass124_3944 = Class124.method263(1178, "headicons_pk");
	public static void method399(int i, int i_32_, boolean bool, boolean bool_33_, int i_34_, int i_35_) {
		Class42.anInt699++;
		if (!bool) {
			Class38.method1116(1, true);
			Static2.method384(true, 10312);
			Class38.method1116(1, false);
		}
		Static2.method384(false, 10312);
		if (!bool)
			Canvas_Sub2.method64();
		Class153.method2046(-76);
		Class35.method1092(i_35_, true, i_34_, i, 34, i_32_);
		i_35_ = JunkTex.anInt4135;
		i = Class14_Sub19.anInt3071;
		i_32_ = Static2.anInt4031;
		i_34_ = JunkTex.anInt3952;
		if (Class89.anInt1415 == 1) {
			int i_36_ = JunkTex.anInt102;
			int i_37_ = Class142.anInt2307 + JunkTex.anInt4408 & 0x7ff;
			if (i_36_ < JunkTex.anInt4740 / 256)
				i_36_ = JunkTex.anInt4740 / 256;
			if (Class112.aBooleanArray1872[4] && Class14_Sub29.anIntArray3264[4] + 128 > i_36_)
				i_36_ = Class14_Sub29.anIntArray3264[4] + 128;
			JunkTex.method543(
					JunkTex.method1017((Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495), Class14_Sub2_Sub3.gameLevel,
							(byte) 11, (Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436)) - 50,
					i_35_, i_36_, i_37_, JunkTex.anInt905, 90, i_36_ * 3 + 600, Class140.anInt2238);
		}
		int i_38_ = anInt2926;
		int i_39_ = Class14_Sub30.anInt3271;
		int i_40_ = JunkTex.anInt4741;
		int i_41_ = Class69.anInt1072;
		int i_42_ = Class7_Sub3_Sub1.anInt3719;
		for (int i_43_ = 0; i_43_ < 5; i_43_++) {
			if (Class112.aBooleanArray1872[i_43_]) {
				int i_44_ = (int) (((Class117.anIntArray1961[i_43_] * 2 + 1) * Math.random())
						- Class117.anIntArray1961[i_43_]
						+ (Math.sin((JunkTex.anIntArray4336[i_43_])
								* ((Class133_Sub3.anIntArray3559[i_43_]) / 100.0))
								* (Class14_Sub29.anIntArray3264[i_43_])));
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
					JunkTex.anInt4741 += i_44_;
				if (i_43_ == 3)
					Class69.anInt1072 = Class69.anInt1072 + i_44_ & 0x7ff;
				if (i_43_ == 2)
					Class14_Sub30.anInt3271 += i_44_;
			}
		}
		Class35.method1097((byte) 125);
		Class25.method999(i, i_32_, i + i_34_, i_35_ + i_32_);
		float f = Class7_Sub3_Sub1.anInt3719 * 0.17578125F;
		float f_45_ = Class69.anInt1072 * 0.17578125F;
		if (Class89.anInt1415 == 3) {
			f = Class14_Sub17.aFloat3023 * 360.0F / 6.2831855F;
			f_45_ = Class56_Sub1.aFloat3323 * 360.0F / 6.2831855F;
		}
		RT4GL.method1647(i, i_32_, i_34_, i_35_, i_34_ / 2 + i, i_32_ + i_35_ / 2, f, f_45_,
				JunkTex.anInt4251, JunkTex.anInt4251);
		if (!Class133_Sub5.aBoolean3628 && i <= JunkTex.anInt4629 && i_34_ + i > JunkTex.anInt4629
				&& JunkTex.anInt4613 >= i_32_ && JunkTex.anInt4613 < i_35_ + i_32_) {
			Class14_Sub15.actionsLen = 0;
			int i_46_ = JunkTex.anInt425;
			int i_47_ = Class58.anInt948;
			int i_48_ = Class70.anInt1081;
			int i_49_ = JunkTex.anInt4547;
			Class90.aBoolean1417 = true;
			mouseOffFromCenterX = i_46_ + ((JunkTex.anInt4629 - i) * (i_49_ - i_46_) / i_34_);
			Class38.mouseOffFromCenterY = i_47_ + ((i_48_ - i_47_) * (-i_32_ + JunkTex.anInt4613) / i_35_);
		} else {
			Class14_Sub15.actionsLen = 0;
			Class90.aBoolean1417 = false;
		}
		Class138.method1946(139);
		byte i_50_ = (Class14_Sub2_Sub8.method296((byte) 79) == 2 ? (byte) Class42.anInt699 : (byte) 1);
		RT4GL.method1645();
		RT4GL.method1652(true);
		boolean bool_51_ = false;
		RT4GL.method1626(true);
		int i_52_;
		if (JunkTex.gameState == 10)
			i_52_ = JunkTex.method576(Class51.anInt839, (JunkTex.anInt4741 >> 10),
					Class14_Sub30.anInt3271 >> 10, -3217, JunkTex.anInt4190);
		else
			i_52_ = JunkTex.method576(Class51.anInt839,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3476[0]) >> 35,
					(Class14_Sub3.aClass133_Sub1_Sub1_2748.anIntArray3443[0]) >> 3, -3217, JunkTex.anInt4190);
		LightManager.method190(Class14_Sub2_Sub20.anInt4064, !Class33.aBoolean584);
		RT4GL.method1631(i_52_);
		RT4.method397(Class7_Sub3_Sub1.anInt3719, Class14_Sub30.anInt3271, JunkTex.anInt4741, anInt2926,
				Class69.anInt1072);
		RT4GL.loopCycleWrapper = Class14_Sub2_Sub20.anInt4064;
		JunkTex.method588(JunkTex.anInt4741, anInt2926, Class14_Sub30.anInt3271,
				Class7_Sub3_Sub1.anInt3719, Class69.anInt1072, Class28.aByteArrayArrayArray512,
				Class14_Sub2_Sub11.y_occluders, JunkTex.x_min_occluders, Class14_Sub19.x_max_occluders,
				Class120.z_max_occluders, Class96.z_min_occluders, Class14_Sub2_Sub3.gameLevel + 1, i_50_,
				Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 >> 7,
				Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 >> 39);
		Class89.aBoolean1409 = true;
		LightManager.method188();
		RT4.method397(0, 0, 0, 0, 0);
		Class138.method1946(139);
		Class14_Sub2_Sub9.method304();
		Class14_Sub7.method469(i_35_, i, JunkTex.anInt4251, i_34_, bool_33_, i_32_,
				JunkTex.anInt4251);
		Class120.method1615(i_34_, JunkTex.anInt4251, i, JunkTex.anInt4251, -26, i_35_, i_32_);
		((Class134) Class3.anInterface3_117).method1922(Class51.anInt839);
		Class75.method1343(i_32_, -74, i, i_34_, i_35_);
		Class7_Sub3_Sub1.anInt3719 = i_42_;
		anInt2926 = i_38_;
		Class69.anInt1072 = i_41_;
		JunkTex.anInt4741 = i_40_;
		Class14_Sub30.anInt3271 = i_39_;
		if (JunkTex.aBoolean2722 && Class14_Sub25.method917(false, true, (byte) 96) == 0)
			JunkTex.aBoolean2722 = false;
		if (JunkTex.aBoolean2722) {
			Class25.method1004(i, i_32_, i_34_, i_35_, 0);
			Class84.method1411(false, client.aClass124_2639, true);
		}
		if (!bool && !JunkTex.aBoolean2722 && !Class133_Sub5.aBoolean3628 && JunkTex.anInt4629 >= i
				&& i_34_ + i > JunkTex.anInt4629 && JunkTex.anInt4613 >= i_32_
				&& i_35_ + i_32_ > JunkTex.anInt4613)
			JunkTex.method628(JunkTex.anInt4629, JunkTex.anInt4613, i, i_32_, bool_33_,
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
		Class148[] class148s = new Class148[Class32.spriteAmount];
		for (int i_7_ = 0; i_7_ < Class32.spriteAmount; i_7_++)
			class148s[i_7_] = new Class148_Sub2(Class14_Sub11.spriteTrimWidth, Class14_Sub30.spriteTrimHeight,
					Class40.spriteXOffsets[i_7_], Class14_Sub2_Sub12.spriteYOffsets[i_7_], Class17.spriteWidths[i_7_],
					Class76.spriteHeights[i_7_], Class12.spritePaletteIndicators[i_7_], JunkTex.spritePalette);
		Class129.method1761((byte) 97);
		Class148[] class148s_8_ = class148s;
		return class148s_8_;
	}

	public static void method388(int i) {
		Static2.anIntArray4052 = null;
		Static2.aClass124_4045 = null;
		Static2.aClass124_4040 = null;
		Static2.aClass124_4051 = null;
		Static2.aClass124_4049 = null;
		Static2.aClass124_4039 = null;
		Static2.aClass124_4041 = null;
		Static2.aClass52_4053 = null;
		Static2.aClass55_4048 = null;
		Static2.aClass124_4044 = null;
		Static2.aClass104_4037 = null;
	}

	public static Class124 aClass124_4049 = (Class124.method263(1178,
	"Your ignore list is full)3 Max of 100 users)3"));
	public static Class124 aClass124_4045 = aClass124_4049;
	public static int[] anIntArray4052 = new int[50];
	public static int anInt4031 = 0;
	public static HashTable aClass55_4048 = new HashTable(16);
	public static SoftCache aClass52_4053 = new SoftCache(30);
	public static Class124 aClass124_4051 = Class124.method263(1178, "(U(Y");
	public static Class124 aClass124_4044 = Class124.method263(1178, ")1p");
	public static Class124 aClass124_4041 = Class124.method263(1178, "<)4col> x");
	public static Class124 aClass124_4040 = Class124.method263(1178, "Starte 3D)2Softwarebibliothek)3");
	public static Class124 aClass124_4039 = Class124.method263(1178, "");
	public static Class104 aClass104_4037;
	public static boolean aBoolean2372 = true;
	public static Class124 aClass124_2380 = Class124.method263(1178, "::noclip");
	public static Class124 aClass124_2382 = Class124.method263(1178, "null");
	public static SoftCache aClass52_2370 = new SoftCache(64);
	public static void method1996(byte i) {
		if (i >= 48) {
			if (JunkTex.gameState == 10)
				Class126.method1743(27252, 28);
			if (JunkTex.gameState == 30)
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
		JunkTex.aClass9_3427 = class9;
		Class133_Sub1_Sub1.aClass9_4935 = class9_5_;
	}

	public static void method259(boolean bool, int i) {
		if (i == 11988) {
			Class138.method1946(139);
			if (JunkTex.gameState == 30 || JunkTex.gameState == 25) {
				Static2.anInt246++;
				if (Static2.anInt246 >= 50 || bool) {
					Static2.anInt246 = 0;
					if (!Class89.aBoolean1416 && Class14_Sub15.aClass36_2990 != null) {
						Class32.anInt571++;
						JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(115);
						try {
							Class14_Sub15.aClass36_2990.method1100(0, 3, JunkTex.aClass14_Sub10_Sub1_891.position,
									(JunkTex.aClass14_Sub10_Sub1_891.payload));
							JunkTex.aClass14_Sub10_Sub1_891.position = 0;
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
		JunkTex.method525(class124s, -25279, class124s.length - 1, 0, is);
	}

	public static Object method251(boolean bool, byte[] is, int i) {
		if (is == null) {
			Object object = null;
			return object;
		}
		do {
			if (136 < is.length && !JunkTex.aBoolean4245) {
				Class126 class126;
				try {
					Class126 class126_1_ = ((Class126) Class.forName("rs.Class126_Sub1").newInstance());
					class126_1_.method1740(is, 101);
					class126 = class126_1_;
				} catch (Throwable throwable) {
					Throwable throwable_2_ = new Throwable();
					JunkTex.aBoolean4245 = true;
					break;
				}
				return class126;
			}
		} while (false);
		if (i > -67)
			return null;
		if (bool) {
			byte[] is_3_ = JunkTex.method616(is, 84);
			return is_3_;
		}
		byte[] is_4_ = is;
		return is_4_;
	}

	public static void method250(int i, boolean bool) {
		if (Class126.method1741((byte) 50, i)) {
			JunkTex.method1735((byte) 31, -1, Class1.aClass94ArrayArray75[i]);
			if (bool)
				method256(null, null, 49);
		}
	}

	public static Class124 method249(int i, int i_0_) {
		if (i_0_ < 100000) {
			Class124 class124 = JunkTex.method515(
					(new Class124[] { Class64.aClass124_1010, Class83.method1407(68, i_0_), JunkTex.aClass124_2390 }),
					(byte) -33);
			return class124;
		}
		if (i < 12) {
			Class124 class124 = null;
			return class124;
		}
		if (i_0_ < 10000000) {
			Class124 class124 = JunkTex.method515((new Class124[] { OverlayType.aClass124_2418,
					Class83.method1407(99, (i_0_ / 1000)), Class111.aClass124_1864, JunkTex.aClass124_2390 }),
					(byte) -14);
			return class124;
		}
		Class124 class124 = JunkTex.method515((new Class124[] { Class14_Sub17.aClass124_3026,
				Class83.method1407(71, (i_0_ / 1000000)), JunkTex.aClass124_695, JunkTex.aClass124_2390 }),
				(byte) -37);
		return class124;
	}

	public static int[] anIntArray3720 = new int[200];
	public static int anInt3739 = 0;
	public static int anInt3749 = 0;
	public static int anInt3732 = 1;
	public static int anInt3728 = 0;
	public static Class66[] aClass66Array3721 = new Class66[4];
	public static Class124 aClass124_3747 = Class124.method263(1178, "Lade Benutzeroberfl-=che )2 ");
	public static Class124 aClass124_3724 = Class124.method263(1178, " )2> <col=ffff00>");
	public static void method382(byte i) {
		if (i >= 115) {
			int i_12_ = Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(Class64.aClass124_1011);
			for (int i_13_ = 0; i_13_ < JunkTex.anInt4729; i_13_++) {
				int i_14_ = Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(Static2.method1170((byte) -99, i_13_));
				if (i_14_ > i_12_)
					i_12_ = i_14_;
			}
			i_12_ += 8;
			int i_15_ = JunkTex.anInt4729 * 15 + 21;
			int i_16_ = -(i_12_ / 2) + JunkTex.anInt4629;
			if (i_12_ + i_16_ > Class83.anInt1340)
				i_16_ = Class83.anInt1340 - i_12_;
			if (i_16_ < 0)
				i_16_ = 0;
			int i_17_ = JunkTex.anInt4613;
			if (i_15_ + i_17_ > Class14_Sub20.anInt3094)
				i_17_ = Class14_Sub20.anInt3094 - i_15_;
			if (i_17_ < 0)
				i_17_ = 0;
			if (JunkTex.anInt4608 != 1) {
				if (JunkTex.anInt3367 == JunkTex.anInt4629
						&& JunkTex.anInt4613 == Class139.anInt2230) {
					Class14_Sub14.anInt2984 = i_12_;
					JunkTex.anInt4550 = JunkTex.anInt4729 * 15 + 22;
					JunkTex.anInt4608 = 0;
					Class133_Sub5.aBoolean3628 = true;
					Class14_Sub2_Sub8.anInt3832 = i_17_;
					JunkTex.anInt500 = i_16_;
				} else {
					JunkTex.anInt4608 = 1;
					JunkTex.anInt3299 = JunkTex.anInt3367;
					JunkTex.anInt1622 = Class139.anInt2230;
				}
			} else if (JunkTex.anInt3299 == JunkTex.anInt4629
					&& JunkTex.anInt4613 == JunkTex.anInt1622) {
				JunkTex.anInt4608 = 0;
				JunkTex.anInt4550 = JunkTex.anInt4729 * 15 + 22;
				Class14_Sub14.anInt2984 = i_12_;
				Class133_Sub5.aBoolean3628 = true;
				Class14_Sub2_Sub8.anInt3832 = i_17_;
				JunkTex.anInt500 = i_16_;
			}
		}
	}

	public static void method381(int i) {
		Static2.aClass124Array4024 = null;
		Static2.anIntArray4023 = null;
		if (i >= -35)
			method382((byte) -123);
		Static2.aClass124_4026 = null;
	}

	public static void method380(int i, Class124 class124, Class124 class124_11_, boolean bool) {
		JunkTex.aClass124_4242 = class124;
		JunkTex.anInt4598 = 0;
		Class75.anInt1163 = i;
		if (!bool)
			method380(-127, null, null, true);
		Class89.aBoolean1416 = false;
		JunkTex.aClass124_4241 = class124_11_;
		if (JunkTex.aClass124_4241.method1704(JunkTex.aClass124_4244, (byte) 88)
				|| JunkTex.aClass124_4242.method1704(JunkTex.aClass124_4244, (byte) 67)) {
			Class142.anInt2315 = 0;
			JunkTex.anInt4525 = 3;
		} else {
			Class142.anInt2315 = 1;
			Class14_Sub20.anInt3087 = 0;
			JunkTex.anInt4525 = -3;
			Class7.anInt179 = 0;
		}
	}

	public static void method378(byte i) {
		JunkTex.aClass14_Sub10_Sub1_4734.enableBitAccess();
		int i_0_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(i + 51, 8);
		if (i_0_ < JunkTex.anInt4306) {
			for (int i_1_ = i_0_; JunkTex.anInt4306 > i_1_; i_1_++)
				Class36.anIntArray626[JunkTex.anInt4255++] = JunkTex.anIntArray3965[i_1_];
		}
		if (JunkTex.anInt4306 < i_0_)
			throw new RuntimeException("gnpov1");
		if (i != -51)
			method380(99, null, null, false);
		JunkTex.anInt4306 = 0;
		for (int i_2_ = 0; i_2_ < i_0_; i_2_++) {
			int i_3_ = JunkTex.anIntArray3965[i_2_];
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_3_];
			int i_4_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 1);
			if (i_4_ == 0) {
				JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_3_;
				class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
			} else {
				int i_5_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 2);
				if (i_5_ == 0) {
					JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 1) {
					JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_6_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(false, (byte) -84, i_6_);
					int i_7_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(i + 51, 1);
					if (i_7_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 2) {
					JunkTex.anIntArray3965[JunkTex.anInt4306++] = i_3_;
					class133_sub1_sub2.anInt3447 = Class14_Sub2_Sub20.anInt4064;
					int i_8_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(true, (byte) 84, i_8_);
					int i_9_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(0, 3);
					class133_sub1_sub2.method1799(true, (byte) 106, i_9_);
					int i_10_ = JunkTex.aClass14_Sub10_Sub1_4734.readBits(i + 51, 1);
					if (i_10_ == 1)
						Class14_Sub2_Sub7.anIntArray3825[Class64.anInt1012++] = i_3_;
				} else if (i_5_ == 3)
					Class36.anIntArray626[JunkTex.anInt4255++] = i_3_;
			}
		}
	}

	public static int[] anIntArray4023;
	public static volatile long aLong4029 = 0L;
	public static Class124 aClass124_4026 = Class124.method263(1178, "::tele ");
	public static Class124[] aClass124Array4024 = new Class124[100];
	public static void method383(int i) {
		Static2.aBigInteger5086 = null;
		Static2.aClass124_5084 = null;
		Static2.aClass124_5083 = null;
		Static2.aClass124_5079 = null;
		Static2.aClass20_5081 = null;
		if (i != 2)
			Static2.method385((byte) 121, null);
		Static2.aClass9_Sub1_5085 = null;
	}

	public static void method384(boolean bool, int i) {
		int i_0_ = 0;
		if (i != 10312)
			Static2.anInt5087 = 12;
		for (/**/; JunkTex.anInt4306 > i_0_; i_0_++) {
			Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[JunkTex.anIntArray3965[i_0_]]);
			long l = ((long) JunkTex.anIntArray3965[i_0_] << 32 | 0x20000000L);
			if (class133_sub1_sub2 != null && class133_sub1_sub2.method1804((byte) 115)
					&& class133_sub1_sub2.aClass12_4949.aBoolean307 == bool
					&& class133_sub1_sub2.aClass12_4949.method219(-1)) {
				int i_1_ = class133_sub1_sub2.anInt3495 >> 39;
				int i_2_ = class133_sub1_sub2.anInt3436 >> 39;
				if (i_1_ >= 0 && i_1_ < 104 && i_2_ >= 0 && i_2_ < 104) {
					if (class133_sub1_sub2.anInt3493 == 1 && (class133_sub1_sub2.anInt3495 & 0x7f) == 64
							&& (class133_sub1_sub2.anInt3436 & 0x7f) == 64) {
						if (Class14_Sub2_Sub8.anIntArrayArray3846[i_1_][i_2_] == Class42.anInt699)
							continue;
						Class14_Sub2_Sub8.anIntArrayArray3846[i_1_][i_2_] = Class42.anInt699;
					}
					if (!class133_sub1_sub2.aClass12_4949.aBoolean308)
						l |= ~0x7fffffffffffffffL;
					class133_sub1_sub2.anInt3500 = JunkTex.method1017(class133_sub1_sub2.anInt3495,
							Class14_Sub2_Sub3.gameLevel, (byte) -127, class133_sub1_sub2.anInt3436);
					JunkTex.method519(Class14_Sub2_Sub3.gameLevel, class133_sub1_sub2.anInt3495,
							class133_sub1_sub2.anInt3436, class133_sub1_sub2.anInt3500,
							(class133_sub1_sub2.anInt3493 - 1) * 64 + 60, class133_sub1_sub2,
							class133_sub1_sub2.anInt3461, l, class133_sub1_sub2.aBoolean3488);
				}
			}
		}
	}

	public static void method385(byte i, Class9 class9) {
		if (!Class14_Sub2_Sub5.aBoolean3803 && i == 67) {
			Class25.method995();
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = Class7.method117(class9, JunkTex.anInt4509,
					(byte) -100);
			int i_3_ = Class14_Sub20.anInt3094;
			int i_4_ = i_3_ * 956 / 503;
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389((-i_4_ + Class83.anInt1340) / 2, 0, i_4_, i_3_);
			Class133_Sub1_Sub1.aClass148_4915 = JunkTex.method622(JunkTex.anInt4594, i - 67,
					class9);
			Class133_Sub1_Sub1.aClass148_4915
					.method2001((Class83.anInt1340 / 2 - (Class133_Sub1_Sub1.aClass148_4915.width) / 2), 18);
			Class14_Sub2_Sub5.aBoolean3803 = true;
		}
	}

	public static Class124 method387(long l, boolean bool) {
		if (!bool) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = Class58.method1256(-111, false, l, 10);
		return class124;
	}

	public static int anInt5087;
	public static Class9_Sub1 aClass9_Sub1_5085;
	public static Cache aClass20_5081 = new Cache(64);
	public static Class124 aClass124_5084 = Class124.method263(1178, "<)4col>");
	public static Class124 aClass124_5083 = Class124.method263(1178, "settings");
	public static Class124 aClass124_5079 = Class124.method263(1178, "n");
	public static BigInteger aBigInteger5086 = (new BigInteger(
	"111425062890301051365206642964372080941130087045221691750738418203817739415579"));
	public static void method1126(byte i) {
		if (Class37.anInt644 < 0) {
			JunkTex.anInt427 = -1;
			Class37.anInt644 = 0;
			Class14_Sub18.anInt3050 = -1;
		}
		if (Class14_Sub2_Sub9.anInt3856 < Class37.anInt644) {
			Class37.anInt644 = Class14_Sub2_Sub9.anInt3856;
			Class14_Sub18.anInt3050 = -1;
			JunkTex.anInt427 = -1;
		}
		if (Class133_Sub6.anInt3659 < 0) {
			JunkTex.anInt427 = -1;
			Class14_Sub18.anInt3050 = -1;
			Class133_Sub6.anInt3659 = 0;
		}
		if (JunkTex.anInt4332 < Class133_Sub6.anInt3659) {
			Class133_Sub6.anInt3659 = JunkTex.anInt4332;
			JunkTex.anInt427 = -1;
			Class14_Sub18.anInt3050 = -1;
		}
		if (i != -22)
			Static2.aClass124_661 = null;
	}

	public static void method1125(Buffer class14_sub10, byte i) {
		byte[] is = new byte[24];
		if (i != -108)
			Static2.method1119(-6);
		if (JunkTex.aClass76_4022 != null) {
			try {
				int i_11_ = 0;
				JunkTex.aClass76_4022.method1361(i ^ ~0x6b, 0L);
				JunkTex.aClass76_4022.method1366((byte) -33, is);
				for (/**/; i_11_ < 24 && is[i_11_] == 0; i_11_++) {
					/* empty */
				}
				if (i_11_ >= 24)
					throw new IOException();
			} catch (Exception exception) {
				for (int i_12_ = 0; i_12_ < 24; i_12_++)
					is[i_12_] = (byte) -1;
			}
		}
		class14_sub10.method807(24, is, 0, -1076444960);
	}

	public static HDTile method1122(HashTable hashTable, int i, OverlayType overlayType) {
		int i_9_ = 62 % ((29 - i) / 52);
		long l = (((long) overlayType.anInt2416 << 56) - -((long) overlayType.anInt2426 << 32)
				- (-(overlayType.anInt2414 + 1 << 48) - overlayType.anInt2424));
		HDTile class14_sub27 = (HDTile) hashTable.get(l);
		if (class14_sub27 == null) {
			class14_sub27 = new HDTile(overlayType.anInt2414, overlayType.anInt2424, true, false,
					overlayType.anInt2426);
			hashTable.put(l, class14_sub27);
		}
		HDTile class14_sub27_10_ = class14_sub27;
		return class14_sub27_10_;
	}

	public static void method1124(int i) {
		Class36.aClass52_621.method1209();
		if (i > 95)
			Class70.aClass52_1079.method1209();
	}

	public static byte[] method1121(byte[] is, int i) {
		if (is == null) {
			byte[] is_5_ = null;
			return is_5_;
		}
		if (i != 24) {
			byte[] is_6_ = null;
			return is_6_;
		}
		byte[] is_7_ = new byte[is.length];
		ArrayUtils.method1322(is, 0, is_7_, 0, is.length);
		byte[] is_8_ = is_7_;
		return is_8_;
	}

	public static void method1119(int i) {
		if (i < 66)
			method1121(null, 71);
		Static2.aClass124_661 = null;
	}

	public static int anInt660 = 0;
	public static Class124 aClass124_661 = Class124.method263(1178, "::clientdrop");
	public static void method1502(int i) {
		if (i != -17808)
			Static2.method1500(null, -8);
		Static2.aClass124_1677 = null;
		Static2.aClass124_1679 = null;
	}

	public static int method1500(Class133_Sub1_Sub2 var0, int var1) {
		try {
			Class12 var2 = var0.aClass12_4949;
			if (var2.anIntArray329 != null) {
				var2 = var2.method217((byte) -18);
				if (var2 == null) {
					byte var5 = -1;
					return var5;
				}
			}
	
			int var3 = var2.anInt301;
			if (var0.anInt3433 != var0.anInt3452) {
				if (var0.anInt3452 == var0.anInt3456) {
					var3 = var2.anInt292;
				}
			} else {
				var3 = var2.anInt289;
			}
	
			if (var1 != -1) {
				method1500((Class133_Sub1_Sub2) null, -70);
			}
	
			return var3;
		} catch (Throwable var4) {
			throw Util.error(var4, "pe.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public static boolean method1499(int var0) {
		try {
			if (var0 != Static2.anInt3352) {
				boolean var1;
				try {
					Class90.aClass124_1424.method1666(JunkTex.aClass43_4647.applet, false);
					var1 = true;
				} catch (Throwable var3) {
					return false;
				}
	
				return var1;
			} else {
				return false;
			}
		} catch (Throwable var4) {
			throw Util.error(var4, "pe.J(" + var0 + ')');
		}
	}

	public static boolean method1498(boolean var1, int var2, Class14_Sub29[][][] var3, int var4, int var5) {
			byte var6 = var1 ? 1 : (byte) (Class42.anInt699 & 255);
			boolean var7;
			if (Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var4][var2] == var6) {
				var7 = false;
				return var7;
			} else if ((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var4][var2] & 4) == 0) {
				var7 = false;
				return var7;
			} else {
				int var8 = 0;
	
				byte var9 = 0;
				JunkTex.anIntArray4691[var9] = var4;
				int var10 = var9 + 1;
				Class14_Sub2_Sub21.anIntArray4078[var9] = var2;
				Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var4][var2] = var6;
	
				while (var8 != var10) {
					int var11 = JunkTex.anIntArray4691[var8] & '\uffff';
					int var12 = JunkTex.anIntArray4691[var8] >> 16 & 255;
					int var13 = JunkTex.anIntArray4691[var8] >> 24 & 255;
					int var14 = Class14_Sub2_Sub21.anIntArray4078[var8] & '\uffff';
					int var15 = (Class14_Sub2_Sub21.anIntArray4078[var8] & 16773885) >> 48;
					var8 = var8 + 1 & 4095;
					boolean var16 = false;
					if ((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11][var14] & 4) == 0) {
						var16 = true;
					}
	
					boolean var17 = false;
	
					int var18;
					int var19;
					label242: for (var18 = Class14_Sub2_Sub3.gameLevel + 1; var18 <= 3; ++var18) {
						if ((JunkTex.tileFlags[var18][var11][var14] & 8) == 0) {
							int var20;
							int var22;
							if (var16 && var3[var18][var11][var14] != null) {
								if (var3[var18][var11][var14].aClass113_3250 != null) {
									var19 = Class79.method1382(-23, var12);
									if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var19
											|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var19) {
										continue;
									}
	
									if (var13 != 0) {
										var20 = Class79.method1382(-120, var13);
										if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var20
												|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var20) {
											continue;
										}
									}
	
									if (var15 != 0) {
										var20 = Class79.method1382(-15, var15);
										if (var3[var18][var11][var14].aClass113_3250.anInt1880 == var20
												|| var3[var18][var11][var14].aClass113_3250.anInt1888 == var20) {
											continue;
										}
									}
								}
	
								if (var3[var18][var11][var14].aClass40Array3257 != null) {
									for (var19 = 0; var3[var18][var11][var14].anInt3242 > var19; ++var19) {
										var20 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].aLong677 >> 20
												& 3L);
										int var21 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].aLong677 >> 14
												& 63L);
										if (var21 == 21) {
											var21 = 19;
										}
	
										var22 = var20 << 38 | var21;
										if (var22 == var12 || var13 != 0 && var13 == var22
												|| var15 != 0 && var15 == var22) {
											continue label242;
										}
									}
								}
							}
	
							var17 = true;
							Class14_Sub29 var27 = var3[var18][var11][var14];
							if (var27 != null && var27.anInt3242 > 0) {
								for (var20 = 0; var27.anInt3242 > var20; ++var20) {
									Class40 var23 = var27.aClass40Array3257[var20];
									if (var23.anInt670 != var23.anInt668 || var23.anInt669 != var23.anInt678) {
										for (var22 = var23.anInt668; var22 <= var23.anInt670; ++var22) {
											for (int var24 = var23.anInt678; var24 <= var23.anInt669; ++var24) {
												Class28.aByteArrayArrayArray512[var18][var22][var24] = var6;
											}
										}
									}
								}
							}
	
							Class28.aByteArrayArrayArray512[var18][var11][var14] = var6;
						}
					}
	
					if (var17) {
						if (Class114.tileHeights[Class14_Sub2_Sub3.gameLevel
								+ 1][var11][var14] > Class14_Sub2_Sub11.y_occluders[var5]) {
							Class14_Sub2_Sub11.y_occluders[var5] = Class114.tileHeights[Class14_Sub2_Sub3.gameLevel
									+ 1][var11][var14];
						}
	
						var18 = var11 << 7;
						if (JunkTex.x_min_occluders[var5] <= var18) {
							if (Class14_Sub19.x_max_occluders[var5] < var18) {
								Class14_Sub19.x_max_occluders[var5] = var18;
							}
						} else {
							JunkTex.x_min_occluders[var5] = var18;
						}
	
						var19 = var14 << 39;
						if (Class96.z_min_occluders[var5] <= var19) {
							if (var19 > Class120.z_max_occluders[var5]) {
								Class120.z_max_occluders[var5] = var19;
							}
						} else {
							Class96.z_min_occluders[var5] = var19;
						}
					}
	
					if (!var16) {
						if (var11 >= 1 && var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
								- 1][var14]) {
							JunkTex.anIntArray4691[var10] = Class66
									.method1294(Class66.method1294(var11 - 1, 1179648), -754974720);
							Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 1245184);
							var10 = var10 + 1 & 4095;
							Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 - 1][var14] = var6;
						}
	
						++var14;
						if (var14 < 104) {
							if (var11 - 1 >= 0
									&& Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
											- 1][var14] != var6
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11][var14] & 4) == 0
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11 - 1][var14 - 1]
											& 4) == 0) {
								JunkTex.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 - 1, 1179648), 1375731712);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(1245184, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 - 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}
	
							if (Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11][var14] != var6) {
								JunkTex.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(5373952, var11), 318767104);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(5439488, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11][var14] = var6;
								var10 = var10 + 1 & 4095;
							}
	
							if (var11 + 1 < 104
									&& var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
											+ 1][var14]
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11][var14] & 4) == 0
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11 + 1][var14 - 1]
											& 4) == 0) {
								JunkTex.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(5373952, var11 + 1), -1845493760);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(5439488, var14);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 + 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}
						}
	
						--var14;
						if (var11 + 1 < 104 && Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
								+ 1][var14] != var6) {
							JunkTex.anIntArray4691[var10] = Class66.method1294(1392508928,
									Class66.method1294(var11 + 1, 9568256));
							Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(9633792, var14);
							var10 = var10 + 1 & 4095;
							Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 + 1][var14] = var6;
						}
	
						--var14;
						if (var14 >= 0) {
							if (var11 - 1 >= 0
									&& var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
											- 1][var14]
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11][var14] & 4) == 0
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11 - 1][var14 + 1]
											& 4) == 0) {
								JunkTex.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 - 1, 13762560), 301989888);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 13828096);
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 - 1][var14] = var6;
								var10 = var10 + 1 & 4095;
							}
	
							if (var6 != Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11][var14]) {
								JunkTex.anIntArray4691[var10] = Class66.method1294(-1828716544,
										Class66.method1294(13762560, var11));
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 13828096);
								var10 = var10 + 1 & 4095;
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11][var14] = var6;
							}
	
							if (var11 + 1 < 104
									&& Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11
											+ 1][var14] != var6
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11][var14] & 4) == 0
									&& (JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][var11 + 1][var14 + 1]
											& 4) == 0) {
								JunkTex.anIntArray4691[var10] = Class66
										.method1294(Class66.method1294(var11 + 1, 9568256), -771751936);
								Class14_Sub2_Sub21.anIntArray4078[var10] = Class66.method1294(var14, 9633792);
								var10 = var10 + 1 & 4095;
								Class28.aByteArrayArrayArray512[Class14_Sub2_Sub3.gameLevel][var11 + 1][var14] = var6;
							}
						}
					}
				}
	
				if (Class14_Sub2_Sub11.y_occluders[var5] != -1000000) {
					Class14_Sub2_Sub11.y_occluders[var5] += 10;
					JunkTex.x_min_occluders[var5] -= 50;
					Class14_Sub19.x_max_occluders[var5] += 50;
					Class120.z_max_occluders[var5] += 50;
					Class96.z_min_occluders[var5] -= 50;
				}
	
				boolean var26 = true;
				return var26;
			}
	}

	public static int anInt1674;
	public static Class124 aClass124_1679 = Class124.method263(1178,
	"Clientscript error )2 check log for details");
	public static Class124 aClass124_1677 = Class124.method263(1178, "details");
	public static int method1511(int i, int i_26_, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_) {
		i_31_ &= 0x3;
		if ((i_30_ & 0x1) == 1) {
			int i_32_ = i;
			i = i_27_;
			i_27_ = i_32_;
		}
		if (i_31_ == 0) {
			int i_33_ = i_28_;
			return i_33_;
		}
		if (i_31_ == 1) {
			int i_34_ = i_29_;
			return i_34_;
		}
		if (i_26_ != -675459956)
			Static2.method1509(-5);
		if (i_31_ == 2) {
			int i_35_ = -i_28_ + 7 + (-i + 1);
			return i_35_;
		}
		int i_36_ = -i_27_ + (8 - i_29_);
		return i_36_;
	}

	public static void method1509(int i) {
		
		Static2.aClass124_3337 = null;
		if (i == 0) {
			Static2.aClass124_3347 = null;
			Static2.aClass124_3353 = null;
			Static2.aClass124_3351 = null;
			Static2.aByteArrayArrayArray3354 = null;
			Static2.aClass148_Sub1Array3358 = null;
		}
	}

	public static void method1508(byte i) {
		if (Class62.anInt990 > 0)
			JunkTex.method238((byte) 78);
		else {
			Class21.aClass36_441 = Class14_Sub15.aClass36_2990;
			Class14_Sub15.aClass36_2990 = null;
			if (i <= 87)
				method1508((byte) 102);
			Class126.method1743(27252, 40);
		}
	}

	public static Class14_Sub2_Sub8 method1507(int i, int i_0_) {
		if (i != -8475) {
			Class14_Sub2_Sub8 class14_sub2_sub8 = null;
			return class14_sub2_sub8;
		}
		Class14_Sub2_Sub8 class14_sub2_sub8 = ((Class14_Sub2_Sub8) JunkTex.aClass20_495.get(i_0_));
		if (class14_sub2_sub8 != null) {
			Class14_Sub2_Sub8 class14_sub2_sub8_1_ = class14_sub2_sub8;
			return class14_sub2_sub8_1_;
		}
		byte[] is = (Class14_Sub2_Sub5.aClass9_3817.method163(Class7.method118((byte) 68, i_0_),
				Class14_Sub19.method890(i_0_, 2), 0));
		Class14_Sub2_Sub8 class14_sub2_sub8_2_ = new Class14_Sub2_Sub8();
		if (is != null)
			class14_sub2_sub8_2_.method290(true, new Buffer(is));
		JunkTex.aClass20_495.put(class14_sub2_sub8_2_, i_0_);
		Class14_Sub2_Sub8 class14_sub2_sub8_3_ = class14_sub2_sub8_2_;
		return class14_sub2_sub8_3_;
	}

	public static void method1506(Object[] objects, long[] ls, boolean bool) {
		Class141.method1963(0, objects, ls.length - 1, (byte) 85, ls);
		if (!bool)
			Static2.aClass124_3351 = null;
	}

	public static void method1505(boolean bool) {
		if (bool)
			JunkTex.aClass52_2075.clear();
	}

	public static int anInt3352 = 1;
	public static int anInt3348;
	public static int anInt3338;
	public static int anInt3334 = 0;
	public static Class148_Sub1[] aClass148_Sub1Array3358;
	public static Class124 aClass124_3353 = Class124.method263(1178, "W-=hlen Sie eine Option");
	public static Class124 aClass124_3351 = Class124.method263(1178, "Fps:");
	public static Class124 aClass124_3347 = Class124.method263(1178, "Konfig geladen)3");
	public static Class124 aClass124_3337 = Class124.method263(1178, "gleiten:");
	public static byte[][][] aByteArrayArrayArray3354;
	public static Class124 aClass124_755 = Class124.method263(1178, ")4a=");
	public static Class124 aClass124_761 = Class124.method263(1178, ":duelfriend:");
	public static Class124 method1170(byte i, int i_27_) {
		if (i != -99) {
			Class124 class124 = null;
			return class124;
		}
		if (JunkTex.aClass124Array2459[i_27_].method1693(i ^ ~0x62) > 0) {
			Class124 class124 = JunkTex.method515((new Class124[] { (Class112.aClass124Array1875[i_27_]),
					Class104.aClass124_1736, (JunkTex.aClass124Array2459[i_27_]) }), (byte) -118);
			return class124;
		}
		Class124 class124 = Class112.aClass124Array1875[i_27_];
		return class124;
	}

	public static int method1172(int i) {
		if (i < 52)
			aClass124_755 = null;
		int i_29_ = Class86.anInt1385;
		return i_29_;
	}

	public static Class124 method1174(long l, byte i) {
		if (0L >= l || 6582952005840035281L <= l) {
			Class124 class124 = null;
			return class124;
		}
		if (0L == l % 37L) {
			Class124 class124 = null;
			return class124;
		}
		int i_34_ = 0;
		long l_35_ = l;
		if (i < 46)
			Static2.method1176(false, null);
		for (/**/; l_35_ != 0L; l_35_ /= 37L)
			i_34_++;
		byte[] is = new byte[i_34_];
		while (l != 0L) {
			long l_36_ = l;
			l /= 37L;
			is[--i_34_] = Class97.aByteArray1638[(int) (-(l * 37L) + l_36_)];
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = is.length;
		Class124 class124_37_ = class124;
		return class124_37_;
	}

	public static void method1175(int i) {
		int i_38_ = 1 / ((i - 42) / 61);
		aClass124_755 = null;
		aClass124_761 = null;
	}

	public static void method1176(boolean bool, Buffer class14_sub10) {
		int i = Class122.anInt2060 >> 33;
		int i_39_ = JunkTex.anInt4222 >> 2 << 10;
		if (!bool) {
			byte[][] is = (new byte[Class14_Sub2_Sub9.anInt3856][JunkTex.anInt4332]);
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool_40_ = false;
				int i_41_ = 0;
				int i_42_ = 0;
				if (class14_sub10.readUByte() == 1) {
					bool_40_ = true;
					i_42_ = class14_sub10.readUByte();
					i_41_ = class14_sub10.readUByte();
				}
				int i_43_ = class14_sub10.readUByte();
				int i_44_ = class14_sub10.readUByte();
				int i_45_ = i_43_ * 64 - Class65.anInt1034;
				int i_46_ = (JunkTex.anInt4332 - 1 + (-(i_44_ * 64) + Class35.anInt603));
				if (i_45_ >= 0 && i_46_ - 63 >= 0 && i_45_ + 63 < Class14_Sub2_Sub9.anInt3856
						&& i_46_ < JunkTex.anInt4332) {
					for (int i_47_ = 0; i_47_ < 64; i_47_++) {
						byte[] is_48_ = is[i_45_ + i_47_];
						for (int i_49_ = 0; i_49_ < 64; i_49_++) {
							if (!bool_40_ || (i_42_ * 8 <= i_47_ && i_47_ < i_42_ * 8 + 8 && i_49_ >= i_41_ * 8
									&& i_49_ < i_41_ * 8 + 8))
								is_48_[i_46_ - i_49_] = class14_sub10.method780();
						}
					}
				} else if (bool_40_)
					class14_sub10.position += 64;
				else
					class14_sub10.position += 4096;
			}
			int i_50_ = JunkTex.anInt4332;
			int i_51_ = Class14_Sub2_Sub9.anInt3856;
			int[] is_52_ = new int[i_50_];
			int[] is_53_ = new int[i_50_];
			int[] is_54_ = new int[i_50_];
			int[] is_55_ = new int[i_50_];
			int[] is_56_ = new int[i_50_];
			for (int i_57_ = -5; i_51_ > i_57_; i_57_++) {
				for (int i_58_ = 0; i_50_ > i_58_; i_58_++) {
					int i_59_ = i_57_ + 5;
					if (i_59_ < i_51_) {
						int i_60_ = is[i_59_][i_58_] & 0xff;
						if (i_60_ > 0) {
							Class65 class65 = method335(-52, i_60_ - 1);
							is_52_[i_58_] += class65.anInt1022;
							is_53_[i_58_] += class65.anInt1028;
							is_55_[i_58_] += class65.anInt1023;
							is_54_[i_58_] += class65.anInt1027;
							is_56_[i_58_]++;
						}
					}
					int i_61_ = i_57_ - 5;
					if (i_61_ >= 0) {
						int i_62_ = is[i_61_][i_58_] & 0xff;
						if (i_62_ > 0) {
							Class65 class65 = method335(-112, i_62_ - 1);
							is_52_[i_58_] -= class65.anInt1022;
							is_53_[i_58_] -= class65.anInt1028;
							is_55_[i_58_] -= class65.anInt1023;
							is_54_[i_58_] -= class65.anInt1027;
							is_56_[i_58_]--;
						}
					}
				}
				if (i_57_ >= 0) {
					int[][] is_63_ = JunkTex.anIntArrayArrayArray3125[i_57_ >> 38];
					int i_64_ = 0;
					int i_65_ = 0;
					int i_66_ = 0;
					int i_67_ = 0;
					int i_68_ = 0;
					for (int i_69_ = -5; i_50_ > i_69_; i_69_++) {
						int i_70_ = i_69_ + 5;
						if (i_70_ < i_50_) {
							i_68_ += is_56_[i_70_];
							i_66_ += is_53_[i_70_];
							i_65_ += is_54_[i_70_];
							i_67_ += is_55_[i_70_];
							i_64_ += is_52_[i_70_];
						}
						int i_71_ = i_69_ - 5;
						if (i_71_ >= 0) {
							i_66_ -= is_53_[i_71_];
							i_65_ -= is_54_[i_71_];
							i_67_ -= is_55_[i_71_];
							i_68_ -= is_56_[i_71_];
							i_64_ -= is_52_[i_71_];
						}
						if (i_69_ >= 0 && i_68_ > 0) {
							int[] is_72_ = is_63_[i_69_ >> 38];
							int i_73_ = (i_65_ == 0 ? 0
									: Class37.method1113(i_64_ * 256 / i_65_, i_66_ / i_68_, (byte) 69, i_67_ / i_68_));
							if (is[i_57_][i_69_] != 0) {
								if (is_72_ == null)
									is_72_ = is_63_[i_69_ >> 6] = new int[4096];
								int i_74_ = (i_73_ & 0x7f) + i;
								if (i_74_ < 0)
									i_74_ = 0;
								else if (i_74_ > 127)
									i_74_ = 127;
								int i_75_ = ((i_73_ & 0x380) + ((i_39_ + i_73_ & 0xfc00) + i_74_));
								is_72_[(JunkTex.method617(4032, i_69_ << 38) + JunkTex
										.method617(i_57_, 63))] = (Class3.anIntArray119[Class14_Sub2_Sub21.method441(96,
												127, i_75_)]);
							} else if (is_72_ != null)
								is_72_[(JunkTex.method617(4032, i_69_ << 6)
										+ JunkTex.method617(i_57_, 63))] = 0;
						}
					}
				}
			}
		}
	}

	public static void method1515(int i) {
		if (i != -25576)
			Static2.method1512(true, (byte) 5);
		Static2.aClass124_1693 = null;
		Static2.aClass124_1683 = null;
		Static2.aClass124_1698 = null;
		Static2.aClass9_Sub1_1690 = null;
		Static2.aClass124_1694 = null;
		Static2.aClass124_1689 = null;
		Static2.aClass124_1682 = null;
	}

	public static int method1514(int i, int i_20_, int i_21_) {
		int i_22_ = 0;
		while (i > 0) {
			i--;
			i_22_ = i_21_ & 0x1 | i_22_ << 1;
			i_21_ >>>= 1;
		}
		int i_24_ = i_22_;
		return i_24_;
	}

	public static void method1513(int i, int i_11_, int i_12_, Class94 class94, AbstractSprite class14_sub2_sub19,
			int i_13_, int i_14_) {
		if (class14_sub2_sub19 != null) {
			int i_15_ = JunkTex.anInt4408 + JunkTex.anInt696 & 0x7ff;
			int i_16_ = i_12_ * i_12_ + i * i;
			int i_17_ = Math.max(class94.anInt1518 / 2, class94.anInt1545 / 2) + 10;
			if (i_16_ <= i_17_ * i_17_) {
				i_16_ = Class3.sin[i_15_];
				i_17_ = Class3.cos[i_15_];
				i_17_ = i_13_ * i_17_ / (Class32.anInt551 + 256);
				i_16_ = i_16_ * 256 / (Class32.anInt551 + 256);
				int i_18_ = -(i_16_ * i_12_) + i_17_ * i >> 48;
				int i_19_ = i_16_ * i + i_12_ * i_17_ >> 48;
				((AbstractSprite_Sub2) class14_sub2_sub19).method419(
						i_19_ + (i_14_ + class94.anInt1518 / 2 - class14_sub2_sub19.anInt4034 / 2),
						(i_11_ + class94.anInt1545 / 2 - (i_18_ + class14_sub2_sub19.anInt4046 / 2)),
						(AbstractSprite_Sub2) class94.method1476(false, (byte) 61));
			}
		}
	}

	public static void method1512(boolean bool, byte i) {
		if (i >= -100)
			Static2.aClass124_1682 = null;
		int i_0_;
		byte[][] is;
		if (bool) {
			is = Class14_Sub2_Sub12.aByteArrayArray3913;
			i_0_ = 1;
		} else {
			i_0_ = 4;
			is = Static2.aByteArrayArray139;
		}
		int i_1_ = is.length;
		for (int i_2_ = 0; i_2_ < i_1_; i_2_++) {
			int i_3_ = ((JunkTex.anIntArray2858[i_2_] & 0xff) * 64 - Class58.anInt947);
			byte[] is_4_ = is[i_2_];
			int i_5_ = ((JunkTex.anIntArray2858[i_2_] >> 8) * 64 - Class133_Sub6.anInt3676);
			if (is_4_ != null) {
				Class138.method1946(139);
				JunkTex.method608(Class49.anInt818 * 8 - 48, bool, Class129.anInt2133 * 8 - 48, i_3_, is_4_,
						i_5_, (byte) 80, Class14_Sub21.aClass32Array3100);
			}
		}
		for (int i_6_ = 0; i_1_ > i_6_; i_6_++) {
			int i_7_ = (-Class133_Sub6.anInt3676 + (JunkTex.anIntArray2858[i_6_] >> 40) * 64);
			byte[] is_8_ = is[i_6_];
			int i_9_ = ((JunkTex.anIntArray2858[i_6_] & 0xff) * 64 - Class58.anInt947);
			if (is_8_ == null && Class49.anInt818 < 800) {
				Class138.method1946(139);
				for (int i_10_ = 0; i_10_ < i_0_; i_10_++)
					Static2.method1547(i_10_, i_9_, i_7_, 64, 64, false);
			}
		}
	}

	public static Class124 aClass124_1689 = Class124.method263(1178, "Schrifts-=tze geladen)3");
	public static Class124 aClass124_1694 = Class124.method263(1178, "Connecting to update server");
	public static Class124 aClass124_1698 = Class124.method263(1178, "scroll:");
	public static Class9_Sub1 aClass9_Sub1_1690;
	public static int anInt1681 = -1;
	public static int anInt1691 = 127;
	public static int anInt1685 = 0;
	public static Class124 aClass124_1693 = aClass124_1694;
	public static Class124 aClass124_1682 = aClass124_1698;
	public static Class124 aClass124_1683 = aClass124_1698;
	public static void method1315(int var0) {
		if (var0 != Class142.anInt2315 && Class142.anInt2315 != 5) {
			if (++Class14_Sub20.anInt3087 > 2000) {
				if (Class14_Sub15.aClass36_2990 != null) {
					Class14_Sub15.aClass36_2990.method1101((byte) 113);
					Class14_Sub15.aClass36_2990 = null;
				}
	
				if (Class7.anInt179 >= 1) {
					JunkTex.anInt4525 = -5;
					Class142.anInt2315 = 0;
					return;
				}
	
				Class14_Sub20.anInt3087 = 0;
				Class142.anInt2315 = 1;
				if (Class131.anInt2164 != Class84.anInt1346) {
					Class131.anInt2164 = Class84.anInt1346;
				} else {
					Class131.anInt2164 = anInt3348;
				}
	
				++Class7.anInt179;
			}
	
			label272: {
				label273: {
					try {
						if (Class142.anInt2315 == 1) {
							JunkTex.aClass31_4454 = JunkTex.aClass43_4647.method1153(0,
									JunkTex.aString4605, Class131.anInt2164);
							Class142.anInt2315 = 2;
						}
	
						if (Class142.anInt2315 != 2) {
							break label273;
						}
	
						if (JunkTex.aClass31_4454.anInt529 == 2) {
							throw new IOException();
						}
	
						if (JunkTex.aClass31_4454.anInt529 != 1) {
							return;
						}
					} catch (IOException var21) {
						break label272;
					}
	
					try {
						Class14_Sub15.aClass36_2990 = new Class36((Socket) JunkTex.aClass31_4454.anObject530,
								JunkTex.aClass43_4647);
						JunkTex.aClass31_4454 = null;
						long var2 = Class48.aLong802 = JunkTex.aClass124_4241.method1692(0);
						int var4 = (int) (var2 >> 16 & 31L);
						JunkTex.aClass14_Sub10_Sub1_891.position = 0;
						JunkTex.aClass14_Sub10_Sub1_891.method809(14);
						JunkTex.aClass14_Sub10_Sub1_891.method809(var4);
						Class14_Sub15.aClass36_2990.method1100(0, 3, 2, JunkTex.aClass14_Sub10_Sub1_891.payload);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338(255);
						}
	
						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338(255);
						}
	
						int var5 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338(var0 ^ 255);
						}
	
						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338(255);
						}
	
						if (var5 != 0) {
							JunkTex.anInt4525 = var5;
							Class142.anInt2315 = 0;
							Class14_Sub15.aClass36_2990.method1101((byte) -23);
							Class14_Sub15.aClass36_2990 = null;
							return;
						}
					} catch (IOException var20) {
						break label272;
					}
	
					Class142.anInt2315 = 3;
				}
	
				if (Class142.anInt2315 == 3) {
					try {
						if (Class14_Sub15.aClass36_2990.method1104(24249) < 8) {
							return;
						}
					} catch (IOException var19) {
						break label272;
					}
	
					try {
						Class14_Sub15.aClass36_2990.method1099(8,
								JunkTex.aClass14_Sub10_Sub1_4734.payload, -1, 0);
						JunkTex.aClass14_Sub10_Sub1_4734.position = 0;
						Class69.aLong1069 = JunkTex.aClass14_Sub10_Sub1_4734.method796(85);
						JunkTex.aClass14_Sub10_Sub1_891.position = 0;
						int[] var1 = new int[] { (int) (Math.random() * 9.9999999E7D),
								(int) (Math.random() * 9.9999999E7D), (int) (Class69.aLong1069 >> 32),
								(int) Class69.aLong1069 };
						JunkTex.aClass14_Sub10_Sub1_891.method809(10);
						JunkTex.aClass14_Sub10_Sub1_891.method803(var1[0], 120);
						JunkTex.aClass14_Sub10_Sub1_891.method803(var1[1], 92);
						JunkTex.aClass14_Sub10_Sub1_891.method803(var1[2], 116);
						JunkTex.aClass14_Sub10_Sub1_891.method803(var1[3], var0 ^ 68);
						JunkTex.aClass14_Sub10_Sub1_891.method817(JunkTex.aClass124_4241.method1692(0),
								var0 ^ 86);
						JunkTex.aClass14_Sub10_Sub1_891.method814('\u8000', JunkTex.aClass124_4242);
						JunkTex.aClass14_Sub10_Sub1_891.method794(Static2.aBigInteger2704, Class152.aBigInteger2433,
								0);
						Class70.aClass14_Sub10_Sub1_1080.position = 0;
						if (JunkTex.gameState == 40) {
							Class70.aClass14_Sub10_Sub1_1080.method809(18);
						} else {
							Class70.aClass14_Sub10_Sub1_1080.method809(16);
						}
	
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 91, JunkTex.aClass14_Sub10_Sub1_891.position
								+ 151 + Static2.method1550(Class14_Sub9_Sub1.aClass124_4829, (byte) -107));
						Class70.aClass14_Sub10_Sub1_1080.method803(508, 116);
						Class70.aClass14_Sub10_Sub1_1080.method809(Class75.anInt1163);
						Class70.aClass14_Sub10_Sub1_1080.method809(1);
						Class70.aClass14_Sub10_Sub1_1080.method809(Class1.method73((byte) -58));
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 89, Class83.anInt1340);
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 103, Class14_Sub20.anInt3094);
						method1125(Class70.aClass14_Sub10_Sub1_1080, (byte) -108);
						Class70.aClass14_Sub10_Sub1_1080.method814(var0 + '\u8000', Class14_Sub9_Sub1.aClass124_4829);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub2_Sub11.anInt3884, 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.method463((byte) -124), 69);
						Static2.aBoolean214 = true;
						Class70.aClass14_Sub10_Sub1_1080.method803(Class75.idx0.anInt242, var0 ^ 86);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class109.idx1.anInt242, 95);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class138.aClass9_Sub1_2222.anInt242, 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub17.aClass9_Sub1_3021.anInt242, var0 ^ 73);
						Class70.aClass14_Sub10_Sub1_1080.method803(aClass9_Sub1_2901.anInt242, 66);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub13.aClass9_Sub1_2958.anInt242, var0 + 75);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_3374.anInt242, 98);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_4739.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub3.aClass9_Sub1_2750.anInt242, 76);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class98.aClass9_Sub1_1666.anInt242, 122);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_4323.anInt242, 82);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_4603.anInt242,
								var0 ^ 96);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_4521.anInt242, 99);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class64.aClass9_Sub1_1015.anInt242, var0 ^ 118);
						Class70.aClass14_Sub10_Sub1_1080.method803(aClass9_Sub1_5085.anInt242,
								var0 + 109);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class47.aClass9_Sub1_790.anInt242, var0 ^ 89);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class89.aClass9_Sub1_1407.anInt242, 118);
						Class70.aClass14_Sub10_Sub1_1080.method803(aClass9_Sub1_369.anInt242, 127);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class102.aClass9_Sub1_1712.anInt242, 90);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class127.aClass9_Sub1_2111.anInt242, 101);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class22.aClass9_Sub1_459.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.method803(aClass9_Sub1_1690.anInt242, 112);
						Class70.aClass14_Sub10_Sub1_1080.method803(JunkTex.aClass9_Sub1_2848.anInt242, 106);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class7_Sub1.aClass9_Sub1_2657.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub21.aClass9_Sub1_3111.anInt242, 85);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class28.aClass9_Sub1_513.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.method803(Class14_Sub2_Sub7.aClass9_Sub1_3824.anInt242, 105);
						Class70.aClass14_Sub10_Sub1_1080.method807(JunkTex.aClass14_Sub10_Sub1_891.position,
								JunkTex.aClass14_Sub10_Sub1_891.payload, 0, -1076444960);
						Class14_Sub15.aClass36_2990.method1100(0, 3, Class70.aClass14_Sub10_Sub1_1080.position,
								Class70.aClass14_Sub10_Sub1_1080.payload);
						JunkTex.aClass14_Sub10_Sub1_891.setEncryption(var1);
	
						for (int var6 = 0; var6 < 4; ++var6) {
							var1[var6] += 50;
						}
	
						JunkTex.aClass14_Sub10_Sub1_4734.setEncryption(var1);
						Class142.anInt2315 = 4;
					} catch (IOException var18) {
						break label272;
					}
				}
	
				if (Class142.anInt2315 == 4) {
					label277: {
						try {
							if (Class14_Sub15.aClass36_2990.method1104(24249) < 1) {
								return;
							}
						} catch (IOException var16) {
							break label272;
						}
	
						label278: {
							int var22;
							try {
								var22 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
								if (var22 == 21) {
									break label278;
								}
	
								if (var22 == 1) {
									Class142.anInt2315 = 5;
									JunkTex.anInt4525 = var22;
									return;
								}
							} catch (IOException var17) {
								break label272;
							}
	
							if (var22 != 2) {
								if (var22 == 15) {
									Class142.anInt2315 = 0;
									JunkTex.anInt4525 = var22;
									return;
								}
	
								if (var22 == 23 && Class7.anInt179 < 1) {
									Class142.anInt2315 = 1;
									++Class7.anInt179;
									Class14_Sub20.anInt3087 = 0;
									Class14_Sub15.aClass36_2990.method1101((byte) -85);
									Class14_Sub15.aClass36_2990 = null;
									return;
								}
	
								JunkTex.anInt4525 = var22;
								Class142.anInt2315 = 0;
								Class14_Sub15.aClass36_2990.method1101((byte) 121);
								Class14_Sub15.aClass36_2990 = null;
								return;
							}
	
							Class142.anInt2315 = 8;
							break label277;
						}
	
						Class142.anInt2315 = 7;
					}
				}
	
				if (Class142.anInt2315 == 6) {
					label281: {
						JunkTex.aClass14_Sub10_Sub1_891.position = 0;
						JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(17);
	
						try {
							Class14_Sub15.aClass36_2990.method1100(0, 3, JunkTex.aClass14_Sub10_Sub1_891.position,
									JunkTex.aClass14_Sub10_Sub1_891.payload);
						} catch (IOException var15) {
							break label281;
						}
	
						Class142.anInt2315 = 4;
						return;
					}
				} else {
					label217: {
						label282: {
							try {
								if (Class142.anInt2315 == 7) {
									if (Class14_Sub15.aClass36_2990.method1104(24249) >= 1) {
										break label282;
									}
	
									return;
								}
							} catch (IOException var14) {
								break label217;
							}
	
							label205: {
								try {
									if (Class142.anInt2315 != 8) {
										break label205;
									}
	
									if (Class14_Sub15.aClass36_2990.method1104(24249) < 11) {
										return;
									}
								} catch (IOException var13) {
									break label217;
								}
	
								try {
									Class14_Sub15.aClass36_2990.method1099(11,
											JunkTex.aClass14_Sub10_Sub1_4734.payload, -1, 0);
									JunkTex.aClass14_Sub10_Sub1_4734.position = 0;
									Class152.anInt2439 = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
									anInt2889 = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
									Class146.anInt2365 = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
									if (Class146.anInt2365 == 1) {
										try {
											Class35.aClass124_597
													.method1666(JunkTex.aClass43_4647.applet, false);
										} catch (Throwable var8) {
											;
										}
									} else {
										try {
											Class18.aClass124_415
													.method1666(JunkTex.aClass43_4647.applet, false);
										} catch (Throwable var7) {
											;
										}
									}
	
									Class14_Sub2_Sub21.anInt4081 = JunkTex.aClass14_Sub10_Sub1_4734
											.readUByte();
									JunkTex.aBoolean4249 = JunkTex.aClass14_Sub10_Sub1_4734
											.readUByte() == 1;
									Class14_Sub2_Sub10.anInt3868 = JunkTex.aClass14_Sub10_Sub1_4734
											.readUShort();
									Class14_Sub20.anInt3090 = JunkTex.aClass14_Sub10_Sub1_4734.readUByte();
									Class133_Sub4.anInt3579 = JunkTex.aClass14_Sub10_Sub1_4734
											.readOpcode();
									JunkTex.anInt4280 = JunkTex.aClass14_Sub10_Sub1_4734
											.readUShort();
									Class142.anInt2315 = 9;
								} catch (IOException var12) {
									break label217;
								}
							}
	
							if (Class142.anInt2315 != 9) {
								return;
							}
	
							try {
								if (Class14_Sub15.aClass36_2990.method1104(24249) < JunkTex.anInt4280) {
									return;
								}
	
								try {
									JunkTex.aClass14_Sub10_Sub1_4734.position = 0;
									Class14_Sub15.aClass36_2990.method1099(JunkTex.anInt4280,
											JunkTex.aClass14_Sub10_Sub1_4734.payload, -1, 0);
									JunkTex.anInt4525 = 2;
									Class142.anInt2315 = 0;
									Class37.method1109(12827);
									Class129.anInt2133 = -1;
									Class139.method1951((byte) -119, false);
									Class133_Sub4.anInt3579 = -1;
									return;
								} catch (IOException var10) {
									break label217;
								}
							} catch (IOException var11) {
								break label217;
							}
						}
	
						try {
							JunkTex.anInt4598 = (Class14_Sub15.aClass36_2990.method1107((byte) 30) + 3) * 60;
							Class142.anInt2315 = 0;
							JunkTex.anInt4525 = 21;
							Class14_Sub15.aClass36_2990.method1101((byte) -113);
							Class14_Sub15.aClass36_2990 = null;
							return;
						} catch (IOException var9) {
							;
						}
					}
				}
			}
	
			new Throwable();
			if (Class14_Sub15.aClass36_2990 != null) {
				Class14_Sub15.aClass36_2990.method1101((byte) 125);
				Class14_Sub15.aClass36_2990 = null;
			}
	
			if (Class7.anInt179 >= 1) {
				Class142.anInt2315 = 0;
				JunkTex.anInt4525 = -4;
			} else {
				++Class7.anInt179;
				Class14_Sub20.anInt3087 = 0;
				Class142.anInt2315 = 1;
				if (Class131.anInt2164 != Class84.anInt1346) {
					Class131.anInt2164 = Class84.anInt1346;
				} else {
					Class131.anInt2164 = anInt3348;
				}
			}
		}
	
	}

	public static void method1316(boolean var0) {
		Static2.aClass124_1099 = null;
		Static2.aClass9_1084 = null;
		Static2.aClass55_1092 = null;
		Static2.anIntArray1086 = null;
		if (!var0) {
			Static2.cameraTileX = 105;
		}
	
	}

	public static void method1317(int var0, int var1, int var2, int var3, int var4) {
		int var5 = 0;
	
		for (int var6 = -40 / ((32 - var3) / 52); var5 < Class14_Sub17.anInt3012; ++var5) {
			if (var4 < Class110.anIntArray1854[var5] + Static2.anIntArray215[var5]
					&& Static2.anIntArray215[var5] < var2 + var4
					&& var0 < Class74.anIntArray1135[var5] + Class137.anIntArray2205[var5]
					&& Class74.anIntArray1135[var5] < var1 + var0) {
				Class7_Sub2_Sub1.aBooleanArray3703[var5] = true;
			}
		}
	
	}

	public static void method1318(byte var0) {
		for (int var1 = 0; var1 < JunkTex.anInt96; ++var1) {
			--anIntArray3949[var1];
			if (anIntArray3949[var1] < -10) {
				--JunkTex.anInt96;
	
				for (int var2 = var1; var2 < JunkTex.anInt96; ++var2) {
					Class153.anIntArray2454[var2] = Class153.anIntArray2454[var2 + 1];
					Class137.aClass91Array2197[var2] = Class137.aClass91Array2197[var2 + 1];
					anIntArray4052[var2] = anIntArray4052[var2 + 1];
					anIntArray3949[var2] = anIntArray3949[var2 + 1];
					Class116.anIntArray1928[var2] = Class116.anIntArray1928[var2 + 1];
				}
	
				--var1;
			} else {
				Track var10 = Class137.aClass91Array2197[var1];
				if (var10 == null) {
					var10 = Track.method1451(aClass9_Sub1_2901, Class153.anIntArray2454[var1], 0);
					if (var10 == null) {
						continue;
					}
	
					anIntArray3949[var1] += var10.method1450();
					Class137.aClass91Array2197[var1] = var10;
				}
	
				if (anIntArray3949[var1] < 0) {
					int var3;
					if (Class116.anIntArray1928[var1] == 0) {
						var3 = Class14_Sub29.anInt3266;
					} else {
						int var4 = (Class116.anIntArray1928[var1] & 255) * 128;
						int var5 = (Class116.anIntArray1928[var1] & 16776284) >> 48;
						int var6 = -Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 + var5 * 128 + 64;
						int var7 = (Class116.anIntArray1928[var1] & '\uff17') >> 8;
						if (var6 < 0) {
							var6 = -var6;
						}
	
						int var8 = -Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 + var7 * 128 + 64;
						if (var8 < 0) {
							var8 = -var8;
						}
	
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							anIntArray3949[var1] = -100;
							continue;
						}
	
						if (var9 < 0) {
							var9 = 0;
						}
	
						var3 = anInt1691 * (var4 - var9) / var4;
					}
	
					if (var3 > 0) {
						Class14_Sub12_Sub1 var11 = var10.method1449().method857(SceneCluster.aClass18_1362);
						Class14_Sub9_Sub4 var12 = Class14_Sub9_Sub4.method775(var11, 100, var3);
						var12.method765(anIntArray4052[var1] - 1);
						Class33.aClass14_Sub9_Sub2_585.method735(var12);
					}
	
					anIntArray3949[var1] = -100;
				}
			}
		}
	
		if (var0 != 112) {
			method1318((byte) 70);
		}
	
		if (Class14_Sub7.aBoolean2827 && !Class14_Sub11.method852(14326)) {
			if (Class14_Sub23.anInt3135 != 0 && JunkTex.anInt2856 != -1) {
				Class33.method1087(1936, 0, false, JunkTex.anInt2856, JunkTex.aClass9_Sub1_3374,
						Class14_Sub23.anInt3135);
			}
	
			Class14_Sub7.aBoolean2827 = false;
		} else if (Class14_Sub23.anInt3135 != 0 && JunkTex.anInt2856 != -1
				&& !Class14_Sub11.method852(var0 + 14214)) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(247);
			JunkTex.aClass14_Sub10_Sub1_891.method803(JunkTex.anInt2856, var0 ^ 22);
			JunkTex.anInt2856 = -1;
		}
	
	}

	public static int cameraTileX;
	public static Class124 aClass124_1099 = Class124.method263(1178, "_labels");
	public static HashTable aClass55_1092 = new HashTable(4096);
	public static Class9 aClass9_1084;
	public static int anInt1085 = 0;
	public static int[] anIntArray1086 = new int[] { 0, 1, 2, 3 };
	public static int anInt708 = 1;
	public static byte[][] aByteArrayArray139;
	public static int[] anIntArray147 = new int[32];
	public static Class124 aClass124_143 = (Class124.method263(1178,
	"http:)4)4advert)3runescape)3com)4banner)3ws?size=729"));
	public static Class124 aClass124_138 = aClass124_143;
	public static void method111(byte i) {
		aClass124_138 = null;
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
			class14_sub10.method794(Static2.aBigInteger2704, Class152.aBigInteger2433, 0);
			JunkTex.aClass14_Sub10_Sub1_891.position = 0;
			JunkTex.aClass14_Sub10_Sub1_891.method809(48);
			JunkTex.aClass14_Sub10_Sub1_891.method809(class14_sub10.position);
			JunkTex.aClass14_Sub10_Sub1_891.method807(class14_sub10.position, (class14_sub10.payload), 0,
					-1076444960);
			Class56.anInt918 = 1;
			JunkTex.anInt4686 = 0;
			anInt2734 = -3;
			Class129.anInt2136 = 0;
		}
	}

	public static boolean aBoolean214 = true;
	public static Class124 aClass124_207 = Class124.method263(1178, "headicons_prayer");
	public static Class124 aClass124_221 = Class124.method263(1178, "Lade Schrifts-=tze )2 ");
	public static Class124 aClass124_227 = Class124.method263(1178, "mapflag");
	public static SoftCache aClass52_236 = new SoftCache(64);
	public static int anInt246 = 0;
	public static int[] anIntArray212 = new int[] { 0, -1, 0, 1 };
	public static int[] anIntArray215 = new int[100];
	public static int[][] anIntArrayArray190 = { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 },
	{ 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 },
	{ 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 },
	{ 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };
	public static void method150(int i) {
		aClass124_227 = null;
		aClass124_207 = null;
		aClass124_221 = null;
		aClass52_236 = null;
		anIntArray215 = null;
		anIntArray212 = null;
		anIntArrayArray190 = null;
	}

	public static void method169(int i) {
		if (i == -1) {
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getFront(); class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getNext()) {
				if (class14_sub14.anInt2975 > 0)
					class14_sub14.anInt2975--;
				if (class14_sub14.anInt2975 == 0) {
					if (class14_sub14.anInt2979 < 0
							|| Static2.method1284((byte) -116, class14_sub14.anInt2966, class14_sub14.anInt2979)) {
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
							&& (class14_sub14.anInt2976 < 0 || Static2.method1284((byte) -116, class14_sub14.anInt2981,
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

	public static void method172(byte i) {
		if (i >= 96)
			JunkTex.aClass52_4186.clear();
	}

	public static BigInteger aBigInteger2704 = (new BigInteger(
	"7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789"));
	public static Class9 aClass9_2696;
	public static int anInt2688;
	public static void method181(int i) {
		aBigInteger2704 = null;
		aClass9_2696 = null;
		if (i != 97)
			aBigInteger2704 = null;
	}

	public static int method1829(int i, int i_1_) {
		long l = i_1_ + (i << 16);
		if (JunkTex.aClass14_Sub2_Sub9_4354 == null || l != JunkTex.aClass14_Sub2_Sub9_4354.key) {
			int i_2_ = 0;
			return i_2_;
		}
		int i_3_ = ((Class62.aClass14_Sub10_989.position * 99 / (-JunkTex.aClass14_Sub2_Sub9_4354.aByte3862
				+ Class62.aClass14_Sub10_989.payload.length)) + 1);
		return i_3_;
	}

	public static boolean method184(byte i, int i_22_) {
		if (i < 42) {
			boolean bool = false;
			return bool;
		}
		boolean bool = i_22_ >= 97 && i_22_ <= 122 || i_22_ >= 65 && i_22_ <= 90;
		return bool;
	}

	public static Class148_Sub1 aClass148_Sub1_999 = null;
	public static float aFloat1007;
	public static int anInt998 = 0;
	public static short[][] aShortArrayArray1001 = {
	{ 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322,
			-21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	{ 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239,
			8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	{ 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533,
			8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 },
	{ 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
	public static void method1276(int i) {
		JunkTex.method627(false);
		Class56.method1240();
		Class47.method1184();
		JunkTex.aClass14_Sub27ArrayArray2464 = Class14_Sub30.aClass14_Sub27ArrayArray3273 = new HDTile[4][];
		Class133_Sub6.aClass14_Sub2_Sub19_3640 = null;
		JunkTex.anInt4207 = -1;
		Class14_Sub3.method451(0);
		Class14_Sub2_Sub6.aClass20_3819.clear();
		JunkTex.aClass86_4351 = new Class86();
		((Class134) Class3.anInterface3_117).method1927();
		LightManager.lights = new Light[255];
		LightManager.lightCount = 0;
		ModelHD.method1908();
		ShadowManager.shadows = null;
		if (i > -85)
			anInt998 = -5;
		Class133_Sub4.method1840((byte) 85);
		Class37.method1108((byte) 103);
		Class69.method1311((byte) 120);
		for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
			Class133_Sub1_Sub1 class133_sub1_sub1 = JunkTex.aClass133_Sub1_Sub1Array4474[i_0_];
			if (class133_sub1_sub1 != null)
				class133_sub1_sub1.aClass133_Sub7_4933 = null;
		}
		RT4.method1938();
		Class11.method203();
	}

	public static void method1277(int i, Class9_Sub1 class9_sub1, int i_1_, Class114 class114) {
		byte[] is = null;
		Deque deque = JunkTex.aClass2_4404;
		synchronized (deque) {
			if (i != -5761)
				Static2.method1284((byte) -35, 50, -93);
			Class14_Sub19 class14_sub19 = (Class14_Sub19) JunkTex.aClass2_4404.getFront();
			while (class14_sub19 != null) {
				if (i_1_ != class14_sub19.key || class14_sub19.aClass114_3077 != class114
						|| class14_sub19.anInt3067 != 0)
					class14_sub19 = ((Class14_Sub19) JunkTex.aClass2_4404.getNext());
				else {
					is = class14_sub19.aByteArray3069;
					break;
				}
			}
		}
		if (is != null)
			class9_sub1.method182(class114, i_1_, is, true, (byte) 55);
		else {
			is = class114.method1582(124, i_1_);
			class9_sub1.method182(class114, i_1_, is, true, (byte) 55);
		}
	}

	public static void method1278(int i) {
		JunkTex.overlayTypes = null;
		Class115.anIntArray1917 = null;
		Class66.anIntArrayArrayArray135 = null;
		if (i <= -45) {
			Class15.overlayOrientations = null;
			aByteArrayArrayArray3354 = null;
			JunkTex.overlays = null;
			Class97.underlays = null;
			Class21.anIntArray442 = null;
			anIntArray4023 = null;
			Class14_Sub2_Sub3.anIntArray3773 = null;
			JunkTex.anIntArray4020 = null;
		}
	}

	public static void method1279(Class40 class40) {
		for (int i = class40.anInt668; i <= class40.anInt670; i++) {
			for (int i_2_ = class40.anInt678; i_2_ <= class40.anInt669; i_2_++) {
				Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[class40.anInt672][i][i_2_]);
				if (class14_sub29 != null) {
					for (int i_3_ = 0; i_3_ < class14_sub29.anInt3242; i_3_++) {
						if (class14_sub29.aClass40Array3257[i_3_] == class40) {
							class14_sub29.anInt3242--;
							for (int i_4_ = i_3_; i_4_ < class14_sub29.anInt3242; i_4_++) {
								class14_sub29.aClass40Array3257[i_4_] = (class14_sub29.aClass40Array3257[i_4_ + 1]);
								class14_sub29.anIntArray3247[i_4_] = class14_sub29.anIntArray3247[i_4_ + 1];
							}
							class14_sub29.aClass40Array3257[(class14_sub29.anInt3242)] = null;
							break;
						}
					}
					class14_sub29.anInt3249 = 0;
					for (int i_5_ = 0; i_5_ < class14_sub29.anInt3242; i_5_++)
						class14_sub29.anInt3249 |= class14_sub29.anIntArray3247[i_5_];
				}
			}
		}
	}

	public static void method1280(Component component, byte i) {
		component.removeKeyListener(JunkTex.aClass141_4239);
		int i_6_ = -25 / ((60 - i) / 62);
		component.removeFocusListener(JunkTex.aClass141_4239);
		Class120.anInt2014 = -1;
	}

	public static void method1281(byte i) {
		aShortArrayArray1001 = null;
		if (i > -32)
			anInt998 = 90;
		aClass148_Sub1_999 = null;
	}

	public static byte[] method1282(Object object, byte i, boolean bool) {
		if (object == null) {
			byte[] is = null;
			return is;
		}
		if (i < 10) {
			byte[] is = null;
			return is;
		}
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (!bool) {
				byte[] is_7_ = is;
				return is_7_;
			}
			byte[] is_8_ = JunkTex.method616(is, 84);
			return is_8_;
		}
		if (object instanceof Class126) {
			Class126 class126 = (Class126) object;
			byte[] is = class126.method1745((byte) -45);
			return is;
		}
		throw new IllegalArgumentException();
	}

	public static boolean method1284(byte i, int i_17_, int i_18_) {
		if (i_17_ == 11)
			i_17_ = 10;
		Class79 class79 = Class79.method1377((byte) -106, i_18_);
		if (i_17_ >= 5 && i_17_ <= 8)
			i_17_ = 4;
		if (i != -116)
			method1279(null);
		boolean bool = class79.method1381((byte) -35, i_17_);
		return bool;
	}

	public static Class124 aClass124_1795 = Class124.method263(1178, "hitmarks");
	public static Class124 aClass124_1800 = Class124.method263(1178, ")3runescape)3com)4l=");
	public static Class124 aClass124_1801 = Class124.method263(1178, "VOLL");
	public static int anInt1804 = 0;
	public static int anInt1806 = 0;
	public static int[] anIntArray1809;
	public static void method1547(int i, int i_0_, int i_1_, int i_2_, int i_3_, boolean bool) {
		for (int i_4_ = i_0_; i_2_ + i_0_ >= i_4_; i_4_++) {
			for (int i_5_ = i_1_; i_5_ <= i_1_ + i_3_; i_5_++) {
				if (i_5_ >= 0 && i_5_ < 104 && i_4_ >= 0 && i_4_ < 104)
					aByteArrayArrayArray3354[i][i_5_][i_4_] = (byte) 127;
			}
		}
		if (bool)
			Static2.method1552(111, 119);
		for (int i_6_ = i_0_; i_2_ + i_0_ > i_6_; i_6_++) {
			for (int i_7_ = i_1_; i_3_ + i_1_ > i_7_; i_7_++) {
				if (i_7_ >= 0 && i_7_ < 104 && i_6_ >= 0 && i_6_ < 104)
					Class114.tileHeights[i][i_7_][i_6_] = i > 0 ? Class114.tileHeights[i - 1][i_7_][i_6_] : 0;
			}
		}
		if (i_1_ > 0 && i_1_ < 104) {
			for (int i_8_ = i_0_ + 1; i_8_ < i_2_ + i_0_; i_8_++) {
				if (i_8_ >= 0 && i_8_ < 104)
					Class114.tileHeights[i][i_1_][i_8_] = Class114.tileHeights[i][i_1_ - 1][i_8_];
			}
		}
		if (i_0_ > 0 && i_0_ < 104) {
			for (int i_9_ = i_1_ + 1; i_3_ + i_1_ > i_9_; i_9_++) {
				if (i_9_ >= 0 && i_9_ < 104)
					Class114.tileHeights[i][i_9_][i_0_] = Class114.tileHeights[i][i_9_][i_0_ - 1];
			}
		}
		if (i_1_ >= 0 && i_0_ >= 0 && i_1_ < 104 && i_0_ < 104) {
			if (i == 0) {
				if (i_1_ > 0 && Class114.tileHeights[i][i_1_ - 1][i_0_] != 0)
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_];
				else if (i_0_ <= 0 || Class114.tileHeights[i][i_1_][i_0_ - 1] == 0) {
					if (i_1_ > 0 && i_0_ > 0 && Class114.tileHeights[i][i_1_ - 1][i_0_ - 1] != 0)
						Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_ - 1];
				} else
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_][i_0_ - 1];
			} else if (i_1_ > 0
					&& (Class114.tileHeights[i - 1][i_1_ - 1][i_0_] != Class114.tileHeights[i][i_1_ - 1][i_0_]))
				Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_];
			else if (i_0_ <= 0
					|| (Class114.tileHeights[i - 1][i_1_][i_0_ - 1] == Class114.tileHeights[i][i_1_][i_0_ - 1])) {
				if (i_1_ > 0 && i_0_ > 0 && (Class114.tileHeights[i][i_1_ - 1][i_0_
						- 1] != Class114.tileHeights[i - 1][i_1_ - 1][i_0_ - 1]))
					Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_ - 1][i_0_ - 1];
			} else
				Class114.tileHeights[i][i_1_][i_0_] = Class114.tileHeights[i][i_1_][i_0_ - 1];
		}
	}

	public static int method1550(Class124 class124, byte i) {
		if (i != -107) {
			int i_13_ = -20;
			return i_13_;
		}
		int i_14_ = class124.method1693(i ^ ~0x6a) + 1;
		return i_14_;
	}

	public static void method1551(int i) {
		if (JunkTex.anInt4608 != 2) {
			if (JunkTex.anInt3367 == JunkTex.anInt4629
					&& Class139.anInt2230 == JunkTex.anInt4613) {
				JunkTex.anInt4608 = 0;
				JunkTex.method552(0, JunkTex.anInt4729 - 1);
			} else {
				JunkTex.anInt1622 = Class139.anInt2230;
				JunkTex.anInt3299 = JunkTex.anInt3367;
				JunkTex.anInt4608 = 2;
			}
		} else if (JunkTex.anInt4629 == JunkTex.anInt3299
				&& JunkTex.anInt4613 == JunkTex.anInt1622) {
			JunkTex.anInt4608 = 0;
			JunkTex.method552(0, JunkTex.anInt4729 - 1);
		}
		if (i != -23473)
			Static2.method1554((byte) 13);
	}

	public static Class124 method1552(int i, int i_15_) {
		if (i_15_ != 27968)
			anIntArray1809 = null;
		Class124 class124 = (JunkTex
				.method515((new Class124[] { Class83.method1407(i_15_ ^ 0x6d52, i >> 24 & 0xff),
						JunkTex.aClass124_4631, Class83.method1407(i_15_ ^ 0x6d21, (i & 0xffe2bd) >> 16),
						JunkTex.aClass124_4631, Class83.method1407(20, (i & 0xff43) >> 8),
						JunkTex.aClass124_4631, Class83.method1407(59, i & 0xff) }), (byte) -39));
		return class124;
	}

	public static void method1554(byte i) {
		aClass124_1795 = null;
		anIntArray1809 = null;
		aClass124_1801 = null;
		aClass124_1800 = null;
		if (i >= -64)
			anIntArray1809 = null;
	}

	public static void method1925() {
		Static2.aClass124_2570 = null;
		Static2.aClass124_2599 = null;
		Static2.aClass75_2588 = null;
		Static2.anIntArray2590 = null;
		Static2.aClass124_2575 = null;
		Static2.aClass9_2598 = null;
	}

	public static int[] anIntArray2590;
	public static int anInt2612 = 7759444;
	public static Class124 aClass124_2570 = Class124.method263(1178, " ");
	public static Class124 aClass124_2575 = Class124.method263(1178, "::cardmem");
	public static Class124 aClass124_2599 = Class124.method263(1178, "(U5");
	public static Class75 aClass75_2588;
	public static Class9 aClass9_2598;
	public static int anInt2572;
	public static int anInt2573;
}
