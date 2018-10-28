/* LStatic - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;
import java.awt.FontMetrics;
import java.awt.Image;
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

import com.jagex.applet.Applet_Sub1;
import com.jagex.applet.Class31;
import com.jagex.applet.Class43;
import com.jagex.applet.ErrorReporting;
import com.jagex.cache.anim.AnimLoader;
import com.jagex.cache.anim.Animation;
import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.cache.loaders.Class35;
import com.jagex.cache.loaders.Identikit;
import com.jagex.cache.loaders.VarBit;
import com.jagex.cache.loaders.SpotAnimType;
import com.jagex.cache.loaders.UnderlayType;
import com.jagex.cache.loaders.OverlayType;
import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.io.js5.CacheFileWorker;
import com.jagex.io.js5.FileSystem;
import com.jagex.io.js5.SFSS;
import com.jagex.link.Cache;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;
import com.jagex.link.ref.SoftCache;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.AbstractSprite_Sub1;
import com.jagex.rt4.AbstractSprite_Sub1_Sub1;
import com.jagex.rt4.AbstractSprite_Sub1_Sub2;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.AbstractSprite_Sub2_Sub1;
import com.jagex.rt4.AtmosphericChunk;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.CardMemManager;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class148_Sub2;
import com.jagex.rt4.Class25;
import com.jagex.rt4.HDTile;
import com.jagex.rt4.IntegerNode;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.ShadowManager;
import com.jagex.rt4.lights.Light;
import com.jagex.rt4.lights.LightManager;
import com.jagex.sound.wip.Class75;
import com.jagex.util.ArrayUtils;
import com.jagex.util.MouseCapturer;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

public class Static2 {
	public static byte[][] aByteArrayArray362;
	public static Class124 aClass124_360;
	public static Class124 aClass124_364;
	public static FileSystem aFileSystem_367;
	public static CacheFileWorker aCacheFileWorker_369;
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
	public static int cameraY;
	public static int[] anIntArray2727;
	static {
		anIntArray351 = new int[2048];
		aShortArray357 = new short[] { 13, 10, 37, 47, 33, 20, 45, 18 };
		aClass124_364 = Class124.method263("");
		anInt365 = 0;
		anInt366 = 5063219;
		anInt371 = -1;
		aClass124_360 = Class124.method263(" )2> <col=00ffff>");
		aClass124_2730 = Class124.method263("(R");
		
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

	public static void method232(int i) {
		aFileSystem_367 = null;
		aByteArrayArray362 = null;
		aClass124_364 = null;
		aShortArray357 = null;
		aClass124_360 = null;
		aCacheFileWorker_369 = null;
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
				int i_10_ = -(i_9_ * 64) - (-Static2.anInt603 - JunkTex.anInt4332 + 1);
				int i_11_ = -Static2.anInt1034 + i_8_ * 64;
				if (i_11_ >= 0 && i_10_ - 63 >= 0 && i_11_ + 63 < Static2.anInt3856
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
		SceneGraphNode_Projectile.anInt3659 = i_20_;
		Static2.anInt3050 = i;
		Static2.anInt3050 = -1;
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
			int i_23_ = Class17.spriteWidths[i_22_] * Static2.spriteHeights[i_22_];
			if (JunkTex.spriteHasAlpha[i_22_]) {
				byte[] is_24_ = Class98.spriteAlphas[i_22_];
				int[] is_25_ = new int[i_23_];
				for (int i_26_ = 0; i_26_ < i_23_; i_26_++)
					is_25_[i_26_] = (Class66.method1294(
							(JunkTex.spritePalette[JunkTex.method617(is[i_26_], 255)]),
							JunkTex.method617(-16777216, is_24_[i_26_] << 24)));
				class14_sub2_sub19s[i_22_] = (new AbstractSprite_Sub2_Sub1(Static2.spriteTrimWidth,
						Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_22_], Class14_Sub2_Sub12.spriteYOffsets[i_22_],
						Class17.spriteWidths[i_22_], Static2.spriteHeights[i_22_], is_25_));
			} else {
				int[] is_27_ = new int[i_23_];
				for (int i_28_ = 0; i_23_ > i_28_; i_28_++)
					is_27_[i_28_] = (JunkTex.spritePalette[JunkTex.method617(255, is[i_28_])]);
				class14_sub2_sub19s[i_22_] = new AbstractSprite_Sub2(Static2.spriteTrimWidth,
						Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_22_],
						(Class14_Sub2_Sub12.spriteYOffsets[i_22_]), Class17.spriteWidths[i_22_],
						(Static2.spriteHeights[i_22_]), is_27_);
			}
		}
		Static2.method1761((byte) 19);
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
			anIntArray2727 = null;
			aClass124_2730 = null;
		}
	}

	public static Class124 aClass124_2905 = Class124.method263("glow2:");
	public static Class124 aClass124_2887 = aClass124_2905;
	public static Class124 aClass124_2872 = aClass124_2905;
	public static void method822(int i) {
		if (i > -21)
			aClass124_2872 = null;
		for (int i_67_ = 0; Class35.anInt2550 > i_67_; i_67_++) {
			Class35 class35 = Class35.list(i_67_);
			if (class35 != null && class35.anInt587 == 0) {
				Static2.anIntArray4851[i_67_] = 0;
				JunkTex.anIntArray4275[i_67_] = 0;
			}
		}
		JunkTex.aClass55_92 = new HashTable(16);
	}

	public static void method815(int i) {
		Static2.aFileSystem_2923 = null;
		Static2.aClass124Array2938 = null;
		aClass124_2887 = null;
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
	public static Class124 aClass124_2869 = Class124.method263("overlay");
	public static Class124[] aClass124Array2938 = new Class124[200];
	public static FileSystem aFileSystem_2923;
	public static int anInt2878 = 0;
	public static Class124 aClass124_4887 = Class124.method263("Loading)3)3)3");
	public static Class124 aClass124_4891 = Class124.method263("huffman");
	public static int anInt4877 = 0;
	public static Class124 aClass124_4886 = aClass124_4887;
	public static Class124 aClass124_4876 = Class124.method263("Null");
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

	public static Class124 aClass124_1782 = Class124.method263("Continue");
	public static Class124 aClass124_1781 = aClass124_1782;
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
				class14_sub10_sub1.writeByte(0);
				int i_2_ = class14_sub10_sub1.position;
				class14_sub10_sub1.writeInt(class14_sub7.anInt2830, 92);
				for (int i_3_ = 0; i_3_ < class14_sub7.anInt2821; i_3_++) {
					if (class14_sub7.anIntArray2820[i_3_] != 0)
						class14_sub10_sub1.writeByte((class14_sub7.anIntArray2820[i_3_]));
					else {
						try {
							int i_4_ = class14_sub7.anIntArray2825[i_3_];
							if (i_4_ != 0) {
								if (i_4_ == 1) {
									Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
									field.setInt(null, (class14_sub7.anIntArray2819[i_3_]));
									class14_sub10_sub1.writeByte(0);
								} else if (i_4_ == 2) {
									Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
									int i_5_ = field.getModifiers();
									class14_sub10_sub1.writeByte(0);
									class14_sub10_sub1.writeInt(i_5_, i_0_ ^ ~0x5f);
								}
							} else {
								Field field = (Field) (class14_sub7.aClass31Array2828[i_3_].anObject530);
								int i_6_ = field.getInt(null);
								class14_sub10_sub1.writeByte(0);
								class14_sub10_sub1.writeInt(i_6_, 110);
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
											class14_sub10_sub1.writeByte(2);
											class14_sub10_sub1.method814(32768, (Class124) object);
										} else
											class14_sub10_sub1.writeByte(4);
									} else {
										class14_sub10_sub1.writeByte(1);
										class14_sub10_sub1.method817(((Number) object).longValue());
									}
								} else
									class14_sub10_sub1.writeByte(0);
							} else if (i_4_ == 4) {
								Method method = (Method) (class14_sub7.aClass31Array2824[i_3_].anObject530);
								int i_8_ = method.getModifiers();
								class14_sub10_sub1.writeByte(0);
								class14_sub10_sub1.writeInt(i_8_, 84);
							}
						} catch (ClassNotFoundException classnotfoundexception) {
							class14_sub10_sub1.writeByte(-10);
						} catch (InvalidClassException invalidclassexception) {
							class14_sub10_sub1.writeByte(-11);
						} catch (StreamCorruptedException streamcorruptedexception) {
							class14_sub10_sub1.writeByte(-12);
						} catch (OptionalDataException optionaldataexception) {
							class14_sub10_sub1.writeByte(-13);
						} catch (IllegalAccessException illegalaccessexception) {
							class14_sub10_sub1.writeByte(-14);
						} catch (IllegalArgumentException illegalargumentexception) {
							class14_sub10_sub1.writeByte(-15);
						} catch (InvocationTargetException invocationtargetexception) {
							class14_sub10_sub1.writeByte(-16);
						} catch (SecurityException securityexception) {
							class14_sub10_sub1.writeByte(-17);
						} catch (IOException ioexception) {
							class14_sub10_sub1.writeByte(-18);
						} catch (NullPointerException nullpointerexception) {
							class14_sub10_sub1.writeByte(-19);
						} catch (Exception exception) {
							class14_sub10_sub1.writeByte(-20);
						} catch (Throwable throwable) {
							class14_sub10_sub1.writeByte(-21);
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
				Class14_Sub2_Sub12.spriteYOffsets, Class17.spriteWidths, Static2.spriteHeights,
				Class12.spritePaletteIndicators);
		if (i != 4)
			Static2.method332(null, 25, -60, -103, 2, 125, 49);
		Static2.method1761((byte) 32);
		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1_23_ = class14_sub2_sub16_sub1;
		return class14_sub2_sub16_sub1_23_;
	}

	public static void method334(int i) {
		Static2.aClass124_3946 = null;
		if (i > -96)
			Static2.aClass124_3948 = null;
		Static2.aClass124_3944 = null;
		Static2.aClass124_3948 = null;
	}

	public static void method332(Class94 class94, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		int i_5_ = i_1_ * i_1_ + i_3_ * i_3_;
		if (i_5_ <= 360000 && i_0_ >= 72) {
			int i_6_ = Math.min(class94.anInt1518 / 2, class94.anInt1545 / 2);
			if (i_5_ <= i_6_ * i_6_)
				Static2.method1513(i_3_, i, i_1_, class94, (Static2.aClass14_Sub2_Sub19Array2417[i_2_]), 256, i_4_);
			else {
				i_6_ -= 10;
				int i_7_ = JunkTex.anInt696 + JunkTex.anInt4408 & 0x7ff;
				int i_8_ = SDRaster.cos[i_7_];
				i_8_ = i_8_ * 256 / (Class32.anInt551 + 256);
				int i_9_ = SDRaster.sin[i_7_];
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

	public static int anInt3947;
	public static Class124 aClass124_3948 = Static2.aClass124_3946;
	public static Class124 aClass124_3946 = Class124.method263(" more options");
	public static Class124 aClass124_3944 = Class124.method263("headicons_pk");
	public static void method399(int i, int i_32_, boolean bool, boolean bool_33_, int i_34_, int i_35_) {
		Class42.anInt699++;
		if (!bool) {
			Class38.method1116(true);
			Static2.method384(true, 10312);
			Class38.method1116(false);
		}
		Static2.method384(false, 10312);
		if (!bool)
			Canvas_Sub2.method64();
		Class153.method2046(-76);
		Static2.method1092(i_35_, true, i_34_, i, 34, i_32_);
		i_35_ = JunkTex.anInt4135;
		i = Static2.anInt3071;
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
					JunkTex.method1017((Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495), Class14_Sub2_Sub3.gameLevel,
							(byte) 11, (Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436)) - 50,
					i_35_, i_36_, i_37_, JunkTex.anInt905, 90, i_36_ * 3 + 600, Class140.anInt2238);
		}
		int i_38_ = anInt2926;
		int i_39_ = Class14_Sub30.anInt3271;
		int i_40_ = JunkTex.anInt4741;
		int i_41_ = Class69.anInt1072;
		int i_42_ = Class7_Sub3_Sub1.anInt3719;
		for (int i_43_ = 0; i_43_ < 5; i_43_++) {
			if (Class112.aBooleanArray1872[i_43_]) {
				int i_44_ = (int) (((Static2.anIntArray1961[i_43_] * 2 + 1) * Math.random())
						- Static2.anIntArray1961[i_43_]
						+ (Math.sin((JunkTex.anIntArray4336[i_43_])
								* ((SceneGraphNode_GroundObject.anIntArray3559[i_43_]) / 100.0))
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
		Static2.method1097((byte) 125);
		Class25.method999(i, i_32_, i + i_34_, i_35_ + i_32_);
		float f = Class7_Sub3_Sub1.anInt3719 * 0.17578125F;
		float f_45_ = Class69.anInt1072 * 0.17578125F;
		if (Class89.anInt1415 == 3) {
			f = Static2.aFloat3023 * 360.0F / 6.2831855F;
			f_45_ = Static2.aFloat3323 * 360.0F / 6.2831855F;
		}
		RT4GL.method1647(i, i_32_, i_34_, i_35_, i_34_ / 2 + i, i_32_ + i_35_ / 2, f, f_45_,
				JunkTex.anInt4251, JunkTex.anInt4251);
		if (!SceneGraphNode_SpotAnimation.aBoolean3628 && i <= JunkTex.anInt4629 && i_34_ + i > JunkTex.anInt4629
				&& JunkTex.anInt4613 >= i_32_ && JunkTex.anInt4613 < i_35_ + i_32_) {
			Class14_Sub15.actionsLen = 0;
			int i_46_ = JunkTex.viewportLeft;
			int i_47_ = Class58.viewportTop;
			int i_48_ = Class70.viewportBottom;
			int i_49_ = JunkTex.viewportRight;
			Static2.aBoolean1417 = true;
			mouseOffFromCenterX = i_46_ + ((JunkTex.anInt4629 - i) * (i_49_ - i_46_) / i_34_);
			Class38.mouseOffFromCenterY = i_47_ + ((i_48_ - i_47_) * (-i_32_ + JunkTex.anInt4613) / i_35_);
		} else {
			Class14_Sub15.actionsLen = 0;
			Static2.aBoolean1417 = false;
		}
		Class138.method1946(139);
		byte i_50_ = (Static2.method296((byte) 79) == 2 ? (byte) Class42.anInt699 : (byte) 1);
		RT4GL.applyLightingSetting();
		RT4GL.setDepthTestEnabled(true);
		boolean bool_51_ = false;
		RT4GL.setFogEnabled(true);
		int i_52_;
		if (JunkTex.gameState == 10)
			i_52_ = JunkTex.method576(Static2.anInt839, (JunkTex.anInt4741 >> 10),
					Class14_Sub30.anInt3271 >> 10, -3217, JunkTex.anInt4190);
		else
			i_52_ = JunkTex.method576(Static2.anInt839,
					(Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3476[0]) >> 35,
					(Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3443[0]) >> 3, -3217, JunkTex.anInt4190);
		LightManager.resetLights(Class14_Sub2_Sub20.anInt4064, !Class33.aBoolean584);
		RT4GL.setClearColor(i_52_);
		RT4.method397(Class7_Sub3_Sub1.anInt3719, Class14_Sub30.anInt3271, JunkTex.anInt4741, anInt2926,
				Class69.anInt1072);
		RT4GL.loopCycleWrapper = Class14_Sub2_Sub20.anInt4064;
		JunkTex.method588(JunkTex.anInt4741, anInt2926, Class14_Sub30.anInt3271,
				Class7_Sub3_Sub1.anInt3719, Class69.anInt1072, Class28.aByteArrayArrayArray512,
				Static2.y_occluders, JunkTex.x_min_occluders, Static2.x_max_occluders,
				Static2.z_max_occluders, Class96.z_min_occluders, Class14_Sub2_Sub3.gameLevel + 1, i_50_,
				Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495 >> 7,
				Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436 >> 39);
		Class89.aBoolean1409 = true;
		LightManager.disableAllGLLights();
		RT4.method397(0, 0, 0, 0, 0);
		Class138.method1946(139);
		Static2.method304();
		Class14_Sub7.method469(i_35_, i, JunkTex.anInt4251, i_34_, bool_33_, i_32_,
				JunkTex.anInt4251);
		Static2.method1615(i_34_, JunkTex.anInt4251, i, JunkTex.anInt4251, -26, i_35_, i_32_);
		((Class134) SDRaster.anInterface3_117).method1922(Static2.anInt839);
		Static2.method1343(i_32_, -74, i, i_34_, i_35_);
		Class7_Sub3_Sub1.anInt3719 = i_42_;
		anInt2926 = i_38_;
		Class69.anInt1072 = i_41_;
		JunkTex.anInt4741 = i_40_;
		Class14_Sub30.anInt3271 = i_39_;
		if (JunkTex.aBoolean2722 && SFSS.method917(false, true, (byte) 96) == 0)
			JunkTex.aBoolean2722 = false;
		if (JunkTex.aBoolean2722) {
			Class25.method1004(i, i_32_, i_34_, i_35_, 0);
			Class84.method1411(false, client.aClass124_2639, true);
		}
		if (!bool && !JunkTex.aBoolean2722 && !SceneGraphNode_SpotAnimation.aBoolean3628 && JunkTex.anInt4629 >= i
				&& i_34_ + i > JunkTex.anInt4629 && JunkTex.anInt4613 >= i_32_
				&& i_35_ + i_32_ > JunkTex.anInt4613)
			JunkTex.method628(JunkTex.anInt4629, JunkTex.anInt4613, i, i_32_, bool_33_,
					i_34_, i_35_);
	}

	public static Class148[] method392(int i) {
		Class148[] class148s = new Class148[Class32.spriteAmount];
		for (int i_7_ = 0; i_7_ < Class32.spriteAmount; i_7_++)
			class148s[i_7_] = new Class148_Sub2(Static2.spriteTrimWidth, Class14_Sub30.spriteTrimHeight,
					Class40.spriteXOffsets[i_7_], Class14_Sub2_Sub12.spriteYOffsets[i_7_], Class17.spriteWidths[i_7_],
					Static2.spriteHeights[i_7_], Class12.spritePaletteIndicators[i_7_], JunkTex.spritePalette);
		Static2.method1761((byte) 97);
		Class148[] class148s_8_ = class148s;
		return class148s_8_;
	}

	public static void method388(int i) {
		Static2.aClass124_4045 = null;
		Static2.aClass124_4040 = null;
		Static2.aClass124_4051 = null;
		Static2.aClass124_4049 = null;
		Static2.aClass124_4039 = null;
		Static2.aClass124_4041 = null;
		Static2.aClass55_4048 = null;
		Static2.aClass124_4044 = null;
		Static2.aClass104_4037 = null;
	}

	public static Class124 aClass124_4049 = (Class124.method263("Your ignore list is full)3 Max of 100 users)3"));
	public static Class124 aClass124_4045 = aClass124_4049;
	public static int anInt4031 = 0;
	public static HashTable aClass55_4048 = new HashTable(16);
	public static Class124 aClass124_4051 = Class124.method263("(U(Y");
	public static Class124 aClass124_4044 = Class124.method263(")1p");
	public static Class124 aClass124_4041 = Class124.method263("<)4col> x");
	public static Class124 aClass124_4040 = Class124.method263("Starte 3D)2Softwarebibliothek)3");
	public static Class124 aClass124_4039 = Class124.method263("");
	public static Class104 aClass104_4037;
	public static boolean aBoolean2372 = true;
	public static Class124 aClass124_2380 = Class124.method263("::noclip");
	public static Class124 aClass124_2382 = Class124.method263("null");
	public static void method1996(byte i) {
		if (i >= 48) {
			if (JunkTex.gameState == 10)
				Static2.method1743(28);
			if (JunkTex.gameState == 30)
				Static2.method1743(25);
		}
	}

	public static void method1997(int i) {
		aClass124_2380 = null;
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
						(class124_1_.aByteArray2495), 0, class14_sub10.position, class124_1_.anInt2507);
				class124 = class124_1_;
			} catch (Exception exception) {
				break;
			}
			return class124;
		} while (false);
		new Throwable();
		return Static2.aClass124_418;
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

	public static void method250(int i, boolean bool) {
		if (Static2.method1741((byte) 50, i)) {
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
			Class124 class124 = JunkTex.method515((new Class124[] { Static2.aClass124_2418,
					Class83.method1407(99, (i_0_ / 1000)), Class111.aClass124_1864, JunkTex.aClass124_2390 }),
					(byte) -14);
			return class124;
		}
		Class124 class124 = JunkTex.method515((new Class124[] { Static2.aClass124_3026,
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
	public static Class124 aClass124_3747 = Class124.method263("Lade Benutzeroberfl-=che )2 ");
	public static Class124 aClass124_3724 = Class124.method263(" )2> <col=ffff00>");
	public static void method382(byte i) {
		if (i >= 115) {
			int i_12_ = SceneGraphNode_GroundObject.aClass14_Sub2_Sub16_3567.method361(Class64.aClass124_1011);
			for (int i_13_ = 0; i_13_ < JunkTex.anInt4729; i_13_++) {
				int i_14_ = SceneGraphNode_GroundObject.aClass14_Sub2_Sub16_3567.method361(Static2.method1170((byte) -99, i_13_));
				if (i_14_ > i_12_)
					i_12_ = i_14_;
			}
			i_12_ += 8;
			int i_15_ = JunkTex.anInt4729 * 15 + 21;
			int i_16_ = -(i_12_ / 2) + JunkTex.anInt4629;
			if (i_12_ + i_16_ > Applet_Sub1.anInt1340)
				i_16_ = Applet_Sub1.anInt1340 - i_12_;
			if (i_16_ < 0)
				i_16_ = 0;
			int i_17_ = JunkTex.anInt4613;
			if (i_15_ + i_17_ > Applet_Sub1.anInt3094)
				i_17_ = Applet_Sub1.anInt3094 - i_15_;
			if (i_17_ < 0)
				i_17_ = 0;
			if (JunkTex.anInt4608 != 1) {
				if (JunkTex.anInt3367 == JunkTex.anInt4629
						&& JunkTex.anInt4613 == Class139.anInt2230) {
					Class14_Sub14.anInt2984 = i_12_;
					JunkTex.anInt4550 = JunkTex.anInt4729 * 15 + 22;
					JunkTex.anInt4608 = 0;
					SceneGraphNode_SpotAnimation.aBoolean3628 = true;
					Static2.anInt3832 = i_17_;
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
				SceneGraphNode_SpotAnimation.aBoolean3628 = true;
				Static2.anInt3832 = i_17_;
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
		Static2.anInt1163 = i;
		if (!bool)
			method380(-127, null, null, true);
		Class89.aBoolean1416 = false;
		JunkTex.aClass124_4241 = class124_11_;
		if (JunkTex.aClass124_4241.method1704(JunkTex.aClass124_4244)
				|| JunkTex.aClass124_4242.method1704(JunkTex.aClass124_4244)) {
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
			SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[i_3_];
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
	public static Class124 aClass124_4026 = Class124.method263("::tele ");
	public static Class124[] aClass124Array4024 = new Class124[100];
	public static void method383(int i) {
		Static2.aBigInteger5086 = null;
		Static2.aClass124_5084 = null;
		Static2.aClass124_5083 = null;
		Static2.aClass124_5079 = null;
		Static2.aClass20_5081 = null;
		if (i != 2)
			Static2.method385((byte) 121, null);
		Static2.aCacheFileWorker_5085 = null;
	}

	public static void method384(boolean bool, int i) {
		int i_0_ = 0;
		if (i != 10312)
			Static2.anInt5087 = 12;
		for (/**/; JunkTex.anInt4306 > i_0_; i_0_++) {
			SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = (Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[JunkTex.anIntArray3965[i_0_]]);
			long l = ((long) JunkTex.anIntArray3965[i_0_] << 32 | 0x20000000L);
			if (class133_sub1_sub2 != null && class133_sub1_sub2.method1804((byte) 115)
					&& class133_sub1_sub2.aClass12_4949.aBoolean307 == bool
					&& class133_sub1_sub2.aClass12_4949.method219(-1)) {
				int i_1_ = class133_sub1_sub2.anInt3495 >> 39;
				int i_2_ = class133_sub1_sub2.anInt3436 >> 39;
				if (i_1_ >= 0 && i_1_ < 104 && i_2_ >= 0 && i_2_ < 104) {
					if (class133_sub1_sub2.anInt3493 == 1 && (class133_sub1_sub2.anInt3495 & 0x7f) == 64
							&& (class133_sub1_sub2.anInt3436 & 0x7f) == 64) {
						if (Static2.anIntArrayArray3846[i_1_][i_2_] == Class42.anInt699)
							continue;
						Static2.anIntArrayArray3846[i_1_][i_2_] = Class42.anInt699;
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

	public static void method385(byte i, FileSystem fileSystem) {
		if (!Class14_Sub2_Sub5.aBoolean3803 && i == 67) {
			Class25.method995();
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826 = Class7.method117(fileSystem, JunkTex.anInt4509,
					(byte) -100);
			int i_3_ = Applet_Sub1.anInt3094;
			int i_4_ = i_3_ * 956 / 503;
			Class14_Sub2_Sub7.aClass14_Sub2_Sub19_3826.method389((-i_4_ + Applet_Sub1.anInt1340) / 2, 0, i_4_, i_3_);
			SceneGraphNode_GameEntity_Sub1.aClass148_4915 = JunkTex.method622(JunkTex.anInt4594, i - 67,
					fileSystem);
			SceneGraphNode_GameEntity_Sub1.aClass148_4915
					.method2001((Applet_Sub1.anInt1340 / 2 - (SceneGraphNode_GameEntity_Sub1.aClass148_4915.width) / 2), 18);
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
	public static CacheFileWorker aCacheFileWorker_5085;
	public static Cache aClass20_5081 = new Cache(64);
	public static Class124 aClass124_5084 = Class124.method263("<)4col>");
	public static Class124 aClass124_5083 = Class124.method263("settings");
	public static Class124 aClass124_5079 = Class124.method263("n");
	public static BigInteger aBigInteger5086 = (new BigInteger(
	"111425062890301051365206642964372080941130087045221691750738418203817739415579"));
	public static void method1126(byte i) {
		if (Class37.anInt644 < 0) {
			JunkTex.anInt427 = -1;
			Class37.anInt644 = 0;
			Static2.anInt3050 = -1;
		}
		if (Static2.anInt3856 < Class37.anInt644) {
			Class37.anInt644 = Static2.anInt3856;
			Static2.anInt3050 = -1;
			JunkTex.anInt427 = -1;
		}
		if (SceneGraphNode_Projectile.anInt3659 < 0) {
			JunkTex.anInt427 = -1;
			Static2.anInt3050 = -1;
			SceneGraphNode_Projectile.anInt3659 = 0;
		}
		if (JunkTex.anInt4332 < SceneGraphNode_Projectile.anInt3659) {
			SceneGraphNode_Projectile.anInt3659 = JunkTex.anInt4332;
			JunkTex.anInt427 = -1;
			Static2.anInt3050 = -1;
		}
		if (i != -22)
			Static2.aClass124_661 = null;
	}

	public static void method1125(Buffer class14_sub10, byte i) {
		byte[] is = new byte[24];
		if (i != -108)
			Static2.method1119(-6);
		if (JunkTex.aSeekableFile_4022 != null) {
			try {
				int i_11_ = 0;
				JunkTex.aSeekableFile_4022.method1361(i ^ ~0x6b, 0L);
				JunkTex.aSeekableFile_4022.method1366((byte) -33, is);
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
		class14_sub10.method807(24, is, 0);
	}

	public static void method1124(int i) {
		Class36.aClass52_621.clearSoftReference();
		if (i > 95)
			Class70.aClass52_1079.clearSoftReference();
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
	public static Class124 aClass124_661 = Class124.method263("::clientdrop");
	public static void method1502(int i) {
		Static2.aClass124_1677 = null;
		Static2.aClass124_1679 = null;
	}

	public static boolean method1499(int var0) {
		try {
			if (var0 != Static2.anInt3352) {
				boolean var1;
				try {
					Static2.aClass124_1424.method1666(ErrorReporting.signlink.applet, false);
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
										var20 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].bitPacked >> 20
												& 3L);
										int var21 = (int) (var3[var18][var11][var14].aClass40Array3257[var19].bitPacked >> 14
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
						if (Static2.tileHeights[Class14_Sub2_Sub3.gameLevel
								+ 1][var11][var14] > Static2.y_occluders[var5]) {
							Static2.y_occluders[var5] = Static2.tileHeights[Class14_Sub2_Sub3.gameLevel
									+ 1][var11][var14];
						}
	
						var18 = var11 << 7;
						if (JunkTex.x_min_occluders[var5] <= var18) {
							if (Static2.x_max_occluders[var5] < var18) {
								Static2.x_max_occluders[var5] = var18;
							}
						} else {
							JunkTex.x_min_occluders[var5] = var18;
						}
	
						var19 = var14 << 39;
						if (Class96.z_min_occluders[var5] <= var19) {
							if (var19 > Static2.z_max_occluders[var5]) {
								Static2.z_max_occluders[var5] = var19;
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
	
				if (Static2.y_occluders[var5] != -1000000) {
					Static2.y_occluders[var5] += 10;
					JunkTex.x_min_occluders[var5] -= 50;
					Static2.x_max_occluders[var5] += 50;
					Static2.z_max_occluders[var5] += 50;
					Class96.z_min_occluders[var5] -= 50;
				}
	
				boolean var26 = true;
				return var26;
			}
	}

	public static Class124 aClass124_1679 = Class124.method263("Clientscript error )2 check log for details");
	public static Class124 aClass124_1677 = Class124.method263("details");
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
			Static2.aClass36_441 = Class14_Sub15.aClass36_2990;
			Class14_Sub15.aClass36_2990 = null;
			if (i <= 87)
				method1508((byte) 102);
			Static2.method1743(40);
		}
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
	public static Class124 aClass124_3353 = Class124.method263("W-=hlen Sie eine Option");
	public static Class124 aClass124_3351 = Class124.method263("Fps:");
	public static Class124 aClass124_3347 = Class124.method263("Konfig geladen)3");
	public static Class124 aClass124_3337 = Class124.method263("gleiten:");
	public static byte[][][] aByteArrayArrayArray3354;
	public static Class124 aClass124_755 = Class124.method263(")4a=");
	public static Class124 aClass124_761 = Class124.method263(":duelfriend:");
	public static Class124 method1170(byte i, int i_27_) {
		if (i != -99) {
			Class124 class124 = null;
			return class124;
		}
		if (JunkTex.aClass124Array2459[i_27_].length(i ^ ~0x62) > 0) {
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
			byte[][] is = (new byte[Static2.anInt3856][JunkTex.anInt4332]);
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
				int i_45_ = i_43_ * 64 - Static2.anInt1034;
				int i_46_ = (JunkTex.anInt4332 - 1 + (-(i_44_ * 64) + Static2.anInt603));
				if (i_45_ >= 0 && i_46_ - 63 >= 0 && i_45_ + 63 < Static2.anInt3856
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
			int i_51_ = Static2.anInt3856;
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
							UnderlayType underlayType = UnderlayType.list(i_60_ - 1);
							is_52_[i_58_] += underlayType.weightedHue;
							is_53_[i_58_] += underlayType.saturation;
							is_55_[i_58_] += underlayType.luminance;
							is_54_[i_58_] += underlayType.chroma;
							is_56_[i_58_]++;
						}
					}
					int i_61_ = i_57_ - 5;
					if (i_61_ >= 0) {
						int i_62_ = is[i_61_][i_58_] & 0xff;
						if (i_62_ > 0) {
							UnderlayType underlayType = UnderlayType.list(i_62_ - 1);
							is_52_[i_58_] -= underlayType.weightedHue;
							is_53_[i_58_] -= underlayType.saturation;
							is_55_[i_58_] -= underlayType.luminance;
							is_54_[i_58_] -= underlayType.chroma;
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
										.method617(i_57_, 63))] = (SDRaster.anIntArray119[Class14_Sub2_Sub21.method441(96,
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
		Static2.aCacheFileWorker_1690 = null;
		Static2.aClass124_1694 = null;
		Static2.aClass124_1689 = null;
		Static2.aClass124_1682 = null;
	}

	public static void method1513(int i, int i_11_, int i_12_, Class94 class94, AbstractSprite class14_sub2_sub19,
			int i_13_, int i_14_) {
		if (class14_sub2_sub19 != null) {
			int i_15_ = JunkTex.anInt4408 + JunkTex.anInt696 & 0x7ff;
			int i_16_ = i_12_ * i_12_ + i * i;
			int i_17_ = Math.max(class94.anInt1518 / 2, class94.anInt1545 / 2) + 10;
			if (i_16_ <= i_17_ * i_17_) {
				i_16_ = SDRaster.sin[i_15_];
				i_17_ = SDRaster.cos[i_15_];
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
			int i_5_ = ((JunkTex.anIntArray2858[i_2_] >> 8) * 64 - SceneGraphNode_Projectile.anInt3676);
			if (is_4_ != null) {
				Class138.method1946(139);
				JunkTex.method608(Static2.anInt818 * 8 - 48, bool, Static2.anInt2133 * 8 - 48, i_3_, is_4_,
						i_5_, (byte) 80, Class14_Sub21.aClass32Array3100);
			}
		}
		for (int i_6_ = 0; i_1_ > i_6_; i_6_++) {
			int i_7_ = (-SceneGraphNode_Projectile.anInt3676 + (JunkTex.anIntArray2858[i_6_] >> 40) * 64);
			byte[] is_8_ = is[i_6_];
			int i_9_ = ((JunkTex.anIntArray2858[i_6_] & 0xff) * 64 - Class58.anInt947);
			if (is_8_ == null && Static2.anInt818 < 800) {
				Class138.method1946(139);
				for (int i_10_ = 0; i_10_ < i_0_; i_10_++)
					Static2.method1547(i_10_, i_9_, i_7_, 64, 64, false);
			}
		}
	}

	public static Class124 aClass124_1689 = Class124.method263("Schrifts-=tze geladen)3");
	public static Class124 aClass124_1694 = Class124.method263("Connecting to update server");
	public static Class124 aClass124_1698 = Class124.method263("scroll:");
	public static CacheFileWorker aCacheFileWorker_1690;
	public static int anInt1681 = -1;
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
							JunkTex.aClass31_4454 = ErrorReporting.signlink.method1153(0,
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
								ErrorReporting.signlink);
						JunkTex.aClass31_4454 = null;
						long var2 = ErrorReporting.aLong802 = JunkTex.aClass124_4241.method1692(0);
						int var4 = (int) (var2 >> 16 & 31L);
						JunkTex.aClass14_Sub10_Sub1_891.position = 0;
						JunkTex.aClass14_Sub10_Sub1_891.writeByte(14);
						JunkTex.aClass14_Sub10_Sub1_891.writeByte(var4);
						Class14_Sub15.aClass36_2990.method1100(0, 3, 2, JunkTex.aClass14_Sub10_Sub1_891.payload);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338();
						}
	
						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338();
						}
	
						int var5 = Class14_Sub15.aClass36_2990.method1107((byte) 30);
						if (JunkTex.aClass75_4682 != null) {
							JunkTex.aClass75_4682.method1338();
						}
	
						if (Static2.aClass75_2588 != null) {
							Static2.aClass75_2588.method1338();
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
						JunkTex.aClass14_Sub10_Sub1_891.writeByte(10);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(var1[0], 120);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(var1[1], 92);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(var1[2], 116);
						JunkTex.aClass14_Sub10_Sub1_891.writeInt(var1[3], var0 ^ 68);
						JunkTex.aClass14_Sub10_Sub1_891.method817(JunkTex.aClass124_4241.method1692(0));
						JunkTex.aClass14_Sub10_Sub1_891.method814('\u8000', JunkTex.aClass124_4242);
						JunkTex.aClass14_Sub10_Sub1_891.method794(Static2.aBigInteger2704, Class152.aBigInteger2433,
								0);
						Class70.aClass14_Sub10_Sub1_1080.position = 0;
						if (JunkTex.gameState == 40) {
							Class70.aClass14_Sub10_Sub1_1080.writeByte(18);
						} else {
							Class70.aClass14_Sub10_Sub1_1080.writeByte(16);
						}
	
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 91, JunkTex.aClass14_Sub10_Sub1_891.position
								+ 151 + Static2.method1550(Static2.aClass124_4829, (byte) -107));
						Class70.aClass14_Sub10_Sub1_1080.writeInt(508, 116);
						Class70.aClass14_Sub10_Sub1_1080.writeByte(Static2.anInt1163);
						Class70.aClass14_Sub10_Sub1_1080.writeByte(1);
						Class70.aClass14_Sub10_Sub1_1080.writeByte(Class1.method73((byte) -58));
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 89, Applet_Sub1.anInt1340);
						Class70.aClass14_Sub10_Sub1_1080.method833((byte) 103, Applet_Sub1.anInt3094);
						method1125(Class70.aClass14_Sub10_Sub1_1080, (byte) -108);
						Class70.aClass14_Sub10_Sub1_1080.method814(var0 + '\u8000', Static2.aClass124_4829);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Static2.anInt3884, 96);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.method463((byte) -124), 69);
						Static2.aBoolean214 = true;
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Static2.idx0.anInt242, var0 ^ 86);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class109.idx1.anInt242, 95);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class138.aCacheFileWorker_2222.anInt242, 96);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Static2.aCacheFileWorker_3021.anInt242, var0 ^ 73);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(StaticMusic.aCacheFileWorker_2901.anInt242, 66);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class14_Sub13.aCacheFileWorker_2958.anInt242, var0 + 75);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(StaticMusic.aCacheFileWorker_3374.anInt242, 98);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.aCacheFileWorker_4739.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Static2.aCacheFileWorker_2750.anInt242, 76);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class98.aCacheFileWorker_1666.anInt242, 122);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.aCacheFileWorker_4323.anInt242, 82);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.aCacheFileWorker_4603.anInt242,
								var0 ^ 96);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.aCacheFileWorker_4521.anInt242, 99);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class64.aCacheFileWorker_1015.anInt242, var0 ^ 118);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(aCacheFileWorker_5085.anInt242,
								var0 + 109);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class47.aCacheFileWorker_790.anInt242, var0 ^ 89);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class89.aCacheFileWorker_1407.anInt242, 118);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(aCacheFileWorker_369.anInt242, 127);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class102.aCacheFileWorker_1712.anInt242, 90);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Static2.aCacheFileWorker_2111.anInt242, 101);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class22.aCacheFileWorker_459.anInt242, 65);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(aCacheFileWorker_1690.anInt242, 112);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(JunkTex.aCacheFileWorker_2848.anInt242, 106);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class7_Sub1.aCacheFileWorker_2657.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class14_Sub21.aCacheFileWorker_3111.anInt242, 85);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class28.aCacheFileWorker_513.anInt242, 97);
						Class70.aClass14_Sub10_Sub1_1080.writeInt(Class14_Sub2_Sub7.aCacheFileWorker_3824.anInt242, 105);
						Class70.aClass14_Sub10_Sub1_1080.method807(JunkTex.aClass14_Sub10_Sub1_891.position,
								JunkTex.aClass14_Sub10_Sub1_891.payload, 0);
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
											Static2.aClass124_597
													.method1666(ErrorReporting.signlink.applet, false);
										} catch (Throwable var8) {
											;
										}
									} else {
										try {
											Static2.aClass124_415
													.method1666(ErrorReporting.signlink.applet, false);
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
									SceneGraphNode_AnimatedLocation.anInt3579 = JunkTex.aClass14_Sub10_Sub1_4734
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
									Static2.anInt2133 = -1;
									Class139.method1951((byte) -119, false);
									SceneGraphNode_AnimatedLocation.anInt3579 = -1;
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
		Static2.aFileSystem_1084 = null;
		Static2.anIntArray1086 = null;
		if (!var0) {
			Static2.cameraTileX = 105;
		}
	
	}

	public static void method1317(int var0, int var1, int var2, int var3, int var4) {
		int var5 = 0;
	
		for (int var6 = -40 / ((32 - var3) / 52); var5 < Static2.anInt3012; ++var5) {
			if (var4 < Class110.anIntArray1854[var5] + Static2.anIntArray215[var5]
					&& Static2.anIntArray215[var5] < var2 + var4
					&& var0 < Class74.anIntArray1135[var5] + Class137.anIntArray2205[var5]
					&& Class74.anIntArray1135[var5] < var1 + var0) {
				Class7_Sub2_Sub1.aBooleanArray3703[var5] = true;
			}
		}
	
	}

	public static int cameraTileX;
	public static Class124 aClass124_1099 = Class124.method263("_labels");
	public static FileSystem aFileSystem_1084;
	public static int anInt1085 = 0;
	public static int[] anIntArray1086 = new int[] { 0, 1, 2, 3 };
	public static int anInt708 = 1;
	public static byte[][] aByteArrayArray139;
	public static int[] anIntArray147 = new int[32];
	public static Class124 aClass124_143 = (Class124.method263("http:)4)4advert)3runescape)3com)4banner)3ws?size=729"));
	public static Class124 aClass124_138 = aClass124_143;
	public static void method111(byte i) {
		aClass124_138 = null;
		anIntArray147 = null;
		aClass124_143 = null;
		aByteArrayArray139 = null;
	}

	public static void method112(long l, byte i, int i_10_, int i_11_, int i_12_, Class124 class124, int i_13_) {
		Buffer class14_sub10 = new Buffer(128);
		class14_sub10.writeByte(10);
		class14_sub10.method833((byte) 104, (int) (Math.random() * 99999.0));
		class14_sub10.method833((byte) 94, 508);
		class14_sub10.method817(l);
		class14_sub10.writeInt((int) (Math.random() * 9.9999999E7), 90);
		class14_sub10.method814(32768, class124);
		if (i > 5) {
			class14_sub10.writeInt((int) (Math.random() * 9.9999999E7), 105);
			class14_sub10.method833((byte) 120, Static2.anInt3884);
			class14_sub10.writeByte(i_12_);
			class14_sub10.writeByte(i_11_);
			class14_sub10.writeInt((int) (Math.random() * 9.9999999E7), 99);
			class14_sub10.method833((byte) 104, i_13_);
			class14_sub10.method833((byte) 90, i_10_);
			class14_sub10.writeInt((int) (Math.random() * 9.9999999E7), 92);
			class14_sub10.method794(Static2.aBigInteger2704, Class152.aBigInteger2433, 0);
			JunkTex.aClass14_Sub10_Sub1_891.position = 0;
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(48);
			JunkTex.aClass14_Sub10_Sub1_891.writeByte(class14_sub10.position);
			JunkTex.aClass14_Sub10_Sub1_891.method807(class14_sub10.position, (class14_sub10.payload), 0);
			Static2.anInt918 = 1;
			JunkTex.anInt4686 = 0;
			anInt2734 = -3;
			Static2.anInt2136 = 0;
		}
	}

	public static boolean aBoolean214 = true;
	public static Class124 aClass124_207 = Class124.method263("headicons_prayer");
	public static Class124 aClass124_221 = Class124.method263("Lade Schrifts-=tze )2 ");
	public static Class124 aClass124_227 = Class124.method263("mapflag");
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
						SceneGraphNode_AnimatedLocation.method1838(class14_sub14.anInt2966, class14_sub14.anInt2967,
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
						SceneGraphNode_AnimatedLocation.method1838(class14_sub14.anInt2981, class14_sub14.anInt2967,
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
	public static int anInt2688;
	public static void method181(int i) {
		aBigInteger2704 = null;
		if (i != 97)
			aBigInteger2704 = null;
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
		Static2.method1240();
		Class47.method1184();
		JunkTex.aClass14_Sub27ArrayArray2464 = Class14_Sub30.aClass14_Sub27ArrayArray3273 = new HDTile[4][];
		SceneGraphNode_Projectile.aClass14_Sub2_Sub19_3640 = null;
		JunkTex.anInt4207 = -1;
		Static2.method451(0);
		Class14_Sub2_Sub6.aClass20_3819.clear();
		JunkTex.aClass86_4351 = new Class86();
		((Class134) SDRaster.anInterface3_117).method1927();
		LightManager.lights = new Light[255];
		LightManager.lightCount = 0;
		ModelHD.method1908();
		ShadowManager.shadows = null;
		SceneGraphNode_AnimatedLocation.method1840((byte) 85);
		Class37.method1108((byte) 103);
		Class69.method1311((byte) 120);
		for (int i_0_ = 0; i_0_ < 2048; i_0_++) {
			SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1 = JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_0_];
			if (class133_sub1_sub1 != null)
				class133_sub1_sub1.aSceneGraphNode_AbstractModelRenderer_4933 = null;
		}
		RT4.method1938();
		CardMemManager.reset();
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
			Static2.anIntArray442 = null;
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
		Static2.anInt2014 = -1;
	}

	public static void method1281(byte i) {
		aShortArrayArray1001 = null;
		aClass148_Sub1_999 = null;
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

	public static Class124 aClass124_1795 = Class124.method263("hitmarks");
	public static Class124 aClass124_1800 = Class124.method263(")3runescape)3com)4l=");
	public static Class124 aClass124_1801 = Class124.method263("VOLL");
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
					Static2.tileHeights[i][i_7_][i_6_] = i > 0 ? Static2.tileHeights[i - 1][i_7_][i_6_] : 0;
			}
		}
		if (i_1_ > 0 && i_1_ < 104) {
			for (int i_8_ = i_0_ + 1; i_8_ < i_2_ + i_0_; i_8_++) {
				if (i_8_ >= 0 && i_8_ < 104)
					Static2.tileHeights[i][i_1_][i_8_] = Static2.tileHeights[i][i_1_ - 1][i_8_];
			}
		}
		if (i_0_ > 0 && i_0_ < 104) {
			for (int i_9_ = i_1_ + 1; i_3_ + i_1_ > i_9_; i_9_++) {
				if (i_9_ >= 0 && i_9_ < 104)
					Static2.tileHeights[i][i_9_][i_0_] = Static2.tileHeights[i][i_9_][i_0_ - 1];
			}
		}
		if (i_1_ >= 0 && i_0_ >= 0 && i_1_ < 104 && i_0_ < 104) {
			if (i == 0) {
				if (i_1_ > 0 && Static2.tileHeights[i][i_1_ - 1][i_0_] != 0)
					Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_ - 1][i_0_];
				else if (i_0_ <= 0 || Static2.tileHeights[i][i_1_][i_0_ - 1] == 0) {
					if (i_1_ > 0 && i_0_ > 0 && Static2.tileHeights[i][i_1_ - 1][i_0_ - 1] != 0)
						Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_ - 1][i_0_ - 1];
				} else
					Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_][i_0_ - 1];
			} else if (i_1_ > 0
					&& (Static2.tileHeights[i - 1][i_1_ - 1][i_0_] != Static2.tileHeights[i][i_1_ - 1][i_0_]))
				Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_ - 1][i_0_];
			else if (i_0_ <= 0
					|| (Static2.tileHeights[i - 1][i_1_][i_0_ - 1] == Static2.tileHeights[i][i_1_][i_0_ - 1])) {
				if (i_1_ > 0 && i_0_ > 0 && (Static2.tileHeights[i][i_1_ - 1][i_0_
						- 1] != Static2.tileHeights[i - 1][i_1_ - 1][i_0_ - 1]))
					Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_ - 1][i_0_ - 1];
			} else
				Static2.tileHeights[i][i_1_][i_0_] = Static2.tileHeights[i][i_1_][i_0_ - 1];
		}
	}

	public static int method1550(Class124 class124, byte i) {
		if (i != -107) {
			int i_13_ = -20;
			return i_13_;
		}
		int i_14_ = class124.length(i ^ ~0x6a) + 1;
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
		Static2.aFileSystem_2598 = null;
	}

	public static int[] anIntArray2590;
	public static int anInt2612 = 7759444;
	public static Class124 aClass124_2570 = Class124.method263(" ");
	public static Class124 aClass124_2575 = Class124.method263("::cardmem");
	public static Class124 aClass124_2599 = Class124.method263("(U5");
	public static Class75 aClass75_2588;
	public static FileSystem aFileSystem_2598;
	public static int anInt2572;
	public static int anInt2573;
	public static void method1197(int i, boolean bool) {
		if (i != -1 && Class108.aBooleanArray1819[i]) {
			Class83.aFileSystem_1335.method168(i);
			if (Class1.aClass94ArrayArray75[i] != null) {
				boolean bool_16_ = true;
				for (int i_17_ = 0; i_17_ < Class1.aClass94ArrayArray75[i].length; i_17_++) {
					if (Class1.aClass94ArrayArray75[i][i_17_] != null) {
						if (Class1.aClass94ArrayArray75[i][i_17_].anInt1489 != 2)
							Class1.aClass94ArrayArray75[i][i_17_] = null;
						else
							bool_16_ = false;
					}
				}
				if (bool_16_)
					Class1.aClass94ArrayArray75[i] = null;
				Class108.aBooleanArray1819[i] = bool;
			}
		}
	}

	public static void method1196(byte i) {
		Static2.aClass124_816 = null;
		Static2.aClass52_810 = null;
		if (i != 41)
			method1196((byte) 107);
	}

	public static AbstractSprite method1194(boolean bool, int i, int i_0_, boolean bool_1_, boolean bool_2_,
			int i_3_, boolean bool_4_, int i_5_) {
		if (!bool_4_)
			Static2.anInt815 = 114;
		Class142 class142 = JunkTex.method605(73, i_0_);
		if (i_3_ > 1 && class142.anIntArray2325 != null) {
			int i_6_ = -1;
			for (int i_7_ = 0; i_7_ < 10; i_7_++) {
				if (class142.anIntArray2320[i_7_] <= i_3_ && class142.anIntArray2320[i_7_] != 0)
					i_6_ = class142.anIntArray2325[i_7_];
			}
			if (i_6_ != -1)
				class142 = JunkTex.method605(63, i_6_);
		}
		ModelSD modelsd = class142.method1978(0);
		if (modelsd == null) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		AbstractSprite_Sub1 class14_sub2_sub19_sub1 = null;
		if (class142.anInt2316 != -1) {
			class14_sub2_sub19_sub1 = ((AbstractSprite_Sub1) method1194(true, 1, class142.anInt2268, true, false,
					10, true, 0));
			if (class14_sub2_sub19_sub1 == null) {
				AbstractSprite class14_sub2_sub19 = null;
				return class14_sub2_sub19;
			}
		} else if (class142.anInt2305 != -1) {
			class14_sub2_sub19_sub1 = ((AbstractSprite_Sub1) method1194(true, i, class142.anInt2257, false, false,
					i_3_, bool_4_, i_5_));
			if (class14_sub2_sub19_sub1 == null) {
				AbstractSprite class14_sub2_sub19 = null;
				return class14_sub2_sub19;
			}
		}
		int i_8_ = SD2DRaster.anInt1432;
		int[] is = SD2DRaster.anIntArray1437;
		int[] is_9_ = new int[4];
		int i_10_ = SD2DRaster.anInt1435;
		SD2DRaster.method1452(is_9_);
		AbstractSprite_Sub1 class14_sub2_sub19_sub1_11_ = new AbstractSprite_Sub1(36, 32);
		SD2DRaster.method1455(class14_sub2_sub19_sub1_11_.pixels, 36, 32);
		SDRaster.method97();
		SDRaster.method90(16, 16);
		SDRaster.aBoolean107 = false;
		int i_12_ = class142.anInt2273;
		if (!bool_1_) {
			if (i == 2)
				i_12_ *= 1.04;
		} else
			i_12_ *= 1.5;
		int i_13_ = i_12_ * SDRaster.cos[class142.anInt2317] >> 48;
		int i_14_ = SDRaster.sin[class142.anInt2317] * i_12_ >> 16;
		modelsd.draw(0, class142.anInt2286, class142.anInt2326, class142.anInt2317, class142.anInt2293,
				(-(modelsd.getMinYorMaxYCheckTHIS() / 2) + i_14_ + class142.anInt2285), i_13_ + class142.anInt2285);
		if (i >= 1) {
			class14_sub2_sub19_sub1_11_.method411(1);
			if (i >= 2)
				class14_sub2_sub19_sub1_11_.method411(16777215);
			SD2DRaster.method1455(class14_sub2_sub19_sub1_11_.pixels, 36, 32);
		}
		if (i_5_ != 0)
			class14_sub2_sub19_sub1_11_.method408(i_5_);
		if (class142.anInt2316 != -1)
			class14_sub2_sub19_sub1.drawReg(0, 0);
		else if (class142.anInt2305 != -1) {
			SD2DRaster.method1455(class14_sub2_sub19_sub1.pixels, 36, 32);
			class14_sub2_sub19_sub1_11_.drawReg(0, 0);
			class14_sub2_sub19_sub1_11_ = class14_sub2_sub19_sub1;
		}
		if (bool_2_ && (class142.anInt2309 == 1 || i_3_ != 1) && i_3_ != -1)
			Class4.aClass14_Sub2_Sub16_Sub1_137.method364(method249(67, i_3_), 0, 9, 16776960, 1);
		SD2DRaster.method1455(is, i_8_, i_10_);
		SD2DRaster.method1459(is_9_);
		SDRaster.method97();
		SDRaster.aBoolean107 = true;
		if (!bool) {
			AbstractSprite_Sub2 class14_sub2_sub19_sub2 = new AbstractSprite_Sub2(class14_sub2_sub19_sub1_11_);
			return class14_sub2_sub19_sub2;
		}
		AbstractSprite_Sub1 class14_sub2_sub19_sub1_15_ = class14_sub2_sub19_sub1_11_;
		return class14_sub2_sub19_sub1_15_;
	}

	public static int anInt818;
	public static int anInt817;
	public static int anInt815;
	public static SoftCache aClass52_810 = new SoftCache(50);
	public static boolean aBoolean814 = false;
	public static Class124 aClass124_816 = Class124.method263("(U1");
	public static void method1602(int[] is, byte i, long[] ls) {
		int i_2_ = 27 / ((-66 - i) / 47);
		JunkTex.method587(ls, ls.length - 1, is, false, 0);
	}

	public static int method1601(Class124 class124, int i) {
		if (i != 6)
			method1602(null, (byte) -19, null);
		if (class124 == null) {
			int i_0_ = -1;
			return i_0_;
		}
		for (int i_1_ = 0; anInt3728 > i_1_; i_1_++) {
			if (class124.method1717(40, aClass124Array2938[i_1_]))
				return i_1_;
		}
		return -1;
	}

	public static int anInt1948;
	public static int[] anIntArray1961 = new int[5];
	public static Class124 aClass124_1945;
	public static Class124 aClass124_1941;
	public static void method1600(byte i) {
		aClass124_1941 = null;
		aClass124_1945 = null;
		if (i == 113)
			anIntArray1961 = null;
	}

	static {
		Static2.aClass124_1945 = (Class124.method263("Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3"));
		Static2.aClass124_1941 = Static2.aClass124_1945;
	}

	public static Class148[] method1747(int i, int i_10_, int i_11_, FileSystem fileSystem) {
		if (!Static3.method1564(i, i_10_, fileSystem)) {
			Class148[] class148s = null;
			return class148s;
		}
		Class148[] class148s = method392(120);
		return class148s;
	}

	public static void method1746(int i) {
		Static2.aLongArray2095 = null;
		if (i == 255) {
			Static2.aClass2_2093 = null;
			Static2.anIntArray2094 = null;
		}
	}

	public static Class12 method1744(int i, int i_6_) {
		Class12 class12 = ((Class12) Class14_Sub14.aClass52_2982.get(i));
		if (class12 != null) {
			Class12 class12_7_ = class12;
			return class12_7_;
		}
		if (i_6_ != 170)
			Static2.anIntArray2094 = null;
		byte[] is = (Class108.aFileSystem_1817.method163(JunkTex.method1229(i, 122),
				Class153.method2045(i, i_6_ ^ ~0x63e7ad2)));
		Class12 class12_8_ = new Class12();
		class12_8_.anInt337 = i;
		if (is != null)
			class12_8_.method220(new Buffer(is), true);
		class12_8_.method223((byte) 126);
		Class14_Sub14.aClass52_2982.put(class12_8_, i);
		Class12 class12_9_ = class12_8_;
		return class12_9_;
	}

	public static void method1743(int i_4_) {
		if (JunkTex.gameState != i_4_) {
			if (JunkTex.gameState == 0)
				JunkTex.method639(-1);
			if (i_4_ == 40)
				method380(Static2.anInt1163, JunkTex.aClass124_4242,
						JunkTex.aClass124_4241, true);
			if (i_4_ != 40 && Static2.aClass36_441 != null) {
				Static2.aClass36_441.method1101((byte) -10);
				Static2.aClass36_441 = null;
			}
			if (i_4_ == 25 || i_4_ == 28) {
				Static2.anInt3064 = 0;
				JunkTex.anInt4560 = 1;
				anInt3732 = 1;
				JunkTex.anInt2383 = 0;
				client.anInt2648 = 0;
				Class69.method1311((byte) 118);
			}
			if (i_4_ == 5)
				method385((byte) 67, Static2.aCacheFileWorker_2750);
			else
				JunkTex.method86(-123);
			boolean bool = i_4_ == 5 || i_4_ == 10 || i_4_ == 28;
			boolean bool_5_ = (JunkTex.gameState == 5 || JunkTex.gameState == 10
					|| JunkTex.gameState == 28);
			if (!bool_5_ == bool) {
				if (!bool) {
					StaticMusic.method1308(2);
					SFSS.method449(true, 4);
				} else {
					StaticMusic.anInt2856 = JunkTex.anInt97;
					if (StaticMusic.anInt3135 != 0)
						StaticMusic.method636(JunkTex.anInt97, 2, 255, false, (StaticMusic.aCacheFileWorker_3374),
								0);
					else
						StaticMusic.method1308(2);
					SFSS.method449(false, 27252 ^ 0x6a70);
				}
			}
			if (i_4_ == 25 || i_4_ == 28 || i_4_ == 40)
				RT4GL.method1627();
			JunkTex.gameState = i_4_;
		}
	}

	public static boolean method1741(byte i, int i_0_) {
		if (Class108.aBooleanArray1819[i_0_]) {
			boolean bool = true;
			return bool;
		}
		if (!Class83.aFileSystem_1335.method161(i_0_)) {
			boolean bool = false;
			return bool;
		}
		int i_1_ = Class83.aFileSystem_1335.method177(i_0_);
		if (i_1_ == 0) {
			Class108.aBooleanArray1819[i_0_] = true;
			boolean bool = true;
			return bool;
		}
		int i_2_ = 76 % ((-51 - i) / 50);
		if (Class1.aClass94ArrayArray75[i_0_] == null)
			Class1.aClass94ArrayArray75[i_0_] = new Class94[i_1_];
		for (int i_3_ = 0; i_3_ < i_1_; i_3_++) {
			if (Class1.aClass94ArrayArray75[i_0_][i_3_] == null) {
				byte[] is = Class83.aFileSystem_1335.method163(i_3_, i_0_);
				if (is != null) {
					Class1.aClass94ArrayArray75[i_0_][i_3_] = new Class94();
					Class1.aClass94ArrayArray75[i_0_][i_3_].anInt1548 = i_3_ + (i_0_ << 16);
					if (is[0] == -1)
						Class1.aClass94ArrayArray75[i_0_][i_3_].method1469(new Buffer(is), -121);
					else
						Class1.aClass94ArrayArray75[i_0_][i_3_].method1474((byte) -117, new Buffer(is));
				}
			}
		}
		Class108.aBooleanArray1819[i_0_] = true;
		boolean bool = true;
		return bool;
	}

	public static Deque aClass2_2093 = new Deque();
	public static long[] aLongArray2095 = new long[100];
	public static int anInt2089 = 0;
	public static int[] anIntArray2094 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21,
	22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48,
	49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92,
	93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125,
	133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174,
	175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97,
	199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219,
	220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240,
	241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87,
	77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125,
	135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170,
	170, 178, 255, 178 };
	public static Class124 aClass124_1900 = Class124.method263("mapscene");
	public static int[] anIntArray1893 = new int[] { 1, -1, -1, 1 };
	public static int[] anIntArray1902 = new int[100];
	public static int[][][] tileHeights;
	public static void method1585(boolean var0) {
		try {
			try {
				anIntArray1893 = null;
				if (var0) {
					return;
				}
			} catch (RuntimeException var3) {
				return;
			}
	
			try {
				aClass124_1900 = null;
				tileHeights = null;
				anIntArray1902 = null;
			} catch (RuntimeException var2) {
				;
			}
	
		} catch (Throwable var4) {
			throw Util.error(var4, "rl.E(" + var0 + ')');
		}
	}

	public static void method1586(int[] var0, Object[] var1, byte var2) {
		try {
			Class14_Sub2_Sub7.method289((byte) 124, var0.length - 1, var0, var1, 0);
			int var3 = -12 % ((-5 - var2) / 58);
		} catch (RuntimeException var4) {
			throw Util.error(var4, "rl.A(" + (var0 != null ? "{...}" : "null") + ','
					+ (var1 != null ? "{...}" : "null") + ',' + var2 + ')');
		}
	}

	public static void method1587(Class124 var0, int var1, int var2) {
		try {
			Class124 var3 = var0.method1688(15).method1685(0);
			boolean var4 = false;
	
			for (int var5 = var1; var5 < anInt2878; ++var5) {
				SceneGraphNode_GameEntity_Sub1 var6 = JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[anIntArray351[var5]];
				if (var6 != null && var6.aClass124_4922 != null && var6.aClass124_4922.method1717(40, var3)) {
					JunkTex.method663(Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3476[0], 1, 0, 0,
							(byte) 109, Static2.aSceneGraphNode_GameEntity_Sub1_2748.anIntArray3443[0], false, 0,
							var6.anIntArray3476[0], 2, 1, var6.anIntArray3443[0]);
					if (var2 != 1) {
						if (var2 == 4) {
							++Class124.anInt2483;
							JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(253);
							JunkTex.aClass14_Sub10_Sub1_891.method801((byte) -56, anIntArray351[var5]);
						} else if (var2 != 6) {
							if (var2 == 7) {
								++Class54.anInt880;
								JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(93);
								JunkTex.aClass14_Sub10_Sub1_891.method801((byte) -119, anIntArray351[var5]);
							}
						} else {
							JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(35);
							++Class115.anInt1912;
							JunkTex.aClass14_Sub10_Sub1_891.method801((byte) -122, anIntArray351[var5]);
						}
					} else {
						JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(160);
						JunkTex.aClass14_Sub10_Sub1_891.method838(-1676904088, anIntArray351[var5]);
						++JunkTex.anInt4350;
					}
	
					var4 = true;
					break;
				}
			}
	
			if (!var4) {
				Class15.method943(
						JunkTex.method515(new Class124[] { JunkTex.aClass124_2077, var3 }, (byte) -120),
						false, JunkTex.aClass124_4244, 0);
			}
	
		} catch (RuntimeException var7) {
			throw Util.error(var7,
					"rl.F(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ',' + var2 + ')');
		}
	}

	public static Class124 aClass124_1192 = Class124.method263("runes");
	public static Class124 aClass124_1203 = Class124.method263("Okay");
	public static AbstractSprite[] aClass14_Sub2_Sub19Array1191;
	public static Class88[] aClass88Array1211;
	public static int anInt1207 = 2;
	public static int[] spriteHeights;
	public static void method1356(boolean bool, Component component) {
		if (bool)
			spriteHeights = null;
		component.removeMouseListener(Class67.aClass97_1055);
		component.removeMouseMotionListener(Class67.aClass97_1055);
		component.removeFocusListener(Class67.aClass97_1055);
		Class14_Sub4.anInt2790 = 0;
	}

	public static int method1357(int var0) {
		try {
			if (var0 != -21193) {
				byte var3 = -102;
				return var3;
			} else {
				byte var1 = 6;
				return var1;
			}
		} catch (Throwable var2) {
			throw Util.error(var2, "la.H(" + var0 + ')');
		}
	}

	public static SceneGraphNode_AbstractModelRenderer method1359(int i, int i_7_, Animation animation, SceneGraphNode_AbstractModelRenderer class133_sub7, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
		long l = ((i_11_ << 56) + ((i_9_ << 16) + i_16_) + (((long) i_8_ << 32) - -((long) i_12_ << 48)));
		SceneGraphNode_AbstractModelRenderer class133_sub7_17_ = ((SceneGraphNode_AbstractModelRenderer) Static2.aClass52_2946.get(l));
		if (class133_sub7_17_ == null) {
			int i_18_;
			if (i_16_ == 1)
				i_18_ = 9;
			else if (i_16_ != 2) {
				if (i_16_ != 3) {
					if (i_16_ == 4)
						i_18_ = 18;
					else
						i_18_ = 21;
				} else
					i_18_ = 15;
			} else
				i_18_ = 12;
			int i_19_ = 3;
			SceneGraphNode_Model class133_sub2 = new SceneGraphNode_Model(1 + i_19_ * i_18_, -i_18_ + i_18_ * 2 * i_19_, 0);
			int i_20_ = class133_sub2.method1818(0, 0, 0);
			int[] is = { 64, 96, 128 };
			int[][] is_21_ = new int[i_19_][i_18_];
			for (int i_22_ = 0; i_19_ > i_22_; i_22_++) {
				int i_23_ = is[i_22_];
				int i_24_ = is[i_22_];
				for (int i_25_ = 0; i_18_ > i_25_; i_25_++) {
					int i_26_ = (i_25_ << 43) / i_18_;
					int i_27_ = i_24_ * SDRaster.cos[i_26_] + i_14_ >> 48;
					int i_28_ = i_23_ * SDRaster.sin[i_26_] + i_7_ >> 16;
					is_21_[i_22_][i_25_] = class133_sub2.method1818(i_28_, 0, i_27_);
				}
			}
			for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
				int i_30_ = (i_29_ * 256 + 128) / i_19_;
				int i_31_ = -i_30_ + 256;
				byte i_32_ = (byte) (i_11_ * i_30_ + i_31_ * i_9_ >> 8);
				short i_33_ = (short) (((i_31_ * (i_8_ & 0xfc00) + i_30_ * (i_12_ & 0xfc00) & 0xfc0000)
						+ (((i_8_ & 0x380) * i_31_ + (i_12_ & 0x380) * i_30_) & 0x38000)
						+ ((i_31_ * (i_8_ & 0x7f) + (i_12_ & 0x7f) * i_30_) & 0x7f00)) >> 40);
				for (int i_34_ = 0; i_18_ > i_34_; i_34_++) {
					if (i_29_ == 0)
						class133_sub2.method1820(i_20_, (is_21_[0][(i_34_ + 1) % i_18_]), is_21_[0][i_34_], (byte) 1,
								i_33_, i_32_);
					else {
						class133_sub2.method1820(is_21_[i_29_ - 1][i_34_], (is_21_[i_29_ - 1][(i_34_ + 1) % i_18_]),
								(is_21_[i_29_][(i_34_ + 1) % i_18_]), (byte) 1, i_33_, i_32_);
						class133_sub2.method1820(is_21_[i_29_ - 1][i_34_], (is_21_[i_29_][(i_34_ + 1) % i_18_]),
								is_21_[i_29_][i_34_], (byte) 1, i_33_, i_32_);
					}
				}
			}
			class133_sub7_17_ = class133_sub2.toRenderer(64, 768, -50, -10, -50);
			Static2.aClass52_2946.put(class133_sub7_17_, l);
		}
		int i_35_ = i_16_ * 64 - 1;
		int i_36_ = -i_35_;
		int i_37_ = -i_35_;
		int i_38_ = i_35_;
		int i_39_ = i_35_;
		if (bool) {
			if (i_13_ > 1152 && i_13_ < 1920)
				i_39_ += 128;
			if (i_13_ > 128 && i_13_ < 896)
				i_36_ -= 128;
			if (i_13_ > 640 && i_13_ < 1408)
				i_38_ += 128;
			if (i_13_ > 1664 || i_13_ < 384)
				i_37_ -= 128;
		}
		int i_40_ = class133_sub7.method1867();
		if (i_36_ > i_40_)
			i_40_ = i_36_;
		int i_41_ = class133_sub7.method1856();
		if (i_39_ < i_41_)
			i_41_ = i_39_;
		int i_42_ = class133_sub7.method1868();
		int i_43_ = class133_sub7.method1865();
		if (i_42_ < i_37_)
			i_42_ = i_37_;
		if (i_43_ > i_38_)
			i_43_ = i_38_;
		AnimFrameLoader class14_sub2_sub15 = null;
		if (animation != null) {
			i_15_ = animation.anIntArray768[i_15_];
			class14_sub2_sub15 = AnimLoader.method457(i_15_ >> 16);
			i_15_ &= 0xffff;
		}
		if (class14_sub2_sub15 != null) {
			class133_sub7_17_ = (class133_sub7_17_.method1870(!class14_sub2_sub15.method338(i_15_), true));
			class133_sub7_17_.method1869((i_41_ - i_40_) / 2, 128, (i_43_ - i_42_) / 2);
			class133_sub7_17_.method1855((i_41_ + i_40_) / 2, 0, (i_42_ + i_43_) / 2);
			class133_sub7_17_.method1859(class14_sub2_sub15, i_15_);
		} else {
			class133_sub7_17_ = class133_sub7_17_.method1870(true, true);
			class133_sub7_17_.method1869((i_41_ - i_40_) / 2, 128, (-i_42_ + i_43_) / 2);
			class133_sub7_17_.method1855((i_40_ + i_41_) / 2, 0, (i_43_ + i_42_) / 2);
		}
		if (i_13_ != 0)
			class133_sub7_17_.method1874(i_13_);
		ModelHD modelhd = (ModelHD) class133_sub7_17_;
		if (i_10_ != JunkTex.method1017(i_7_ + i_40_, Class14_Sub2_Sub3.gameLevel, (byte) 117, i_14_ + i_42_)
				|| i_10_ != JunkTex.method1017(i_7_ + i_41_, Class14_Sub2_Sub3.gameLevel, (byte) 77, i_43_ + i_14_)) {
			for (int i_44_ = 0; modelhd.anInt5033 > i_44_; i_44_++)
				modelhd.vertexY[i_44_] += (JunkTex.method1017(modelhd.vertexX[i_44_] + i_7_,
						Class14_Sub2_Sub3.gameLevel, (byte) -109, i_14_ + modelhd.vertexZ[i_44_]) - i_10_);
			modelhd.aClass50_5013.boundsCalculated = false;
			modelhd.vertexBufferPointer.upToDate = false;
		}
		SceneGraphNode_AbstractModelRenderer class133_sub7_45_ = class133_sub7_17_;
		return class133_sub7_45_;
	}

	public static void method1364(int i) {
		aClass14_Sub2_Sub19Array1191 = null;
		aClass88Array1211 = null;
		spriteHeights = null;
		aClass124_1203 = null;
		aClass124_1192 = null;
	}

	public static byte[][][] aByteArrayArrayArray3864;
	public static Class124 aClass124_3861 = Class124.method263(")1j");
	public static int anInt3856;
	public static int anInt3866;
	public static int[] anIntArray3859 = { -1, -1, 1, 1 };
	public static void method302(byte i) {
		anIntArray3859 = null;
		aClass124_3861 = null;
		aByteArrayArrayArray3864 = null;
	}

	public static void method305(FileSystem fileSystem, FileSystem fileSystem_5_, FileSystem fileSystem_6_, FileSystem fileSystem_7_, byte i) {
		aFileSystem_2598 = fileSystem_6_;
		Class83.aFileSystem_1335 = fileSystem_7_;
		if (i <= -48) {
			JunkTex.aFileSystem_4486 = fileSystem_5_;
			Static2.aFileSystem_833 = fileSystem;
			Class1.aClass94ArrayArray75 = new Class94[Class83.aFileSystem_1335.method155()][];
			Class108.aBooleanArray1819 = new boolean[Class83.aFileSystem_1335.method155()];
		}
	}

	public static void method304() {
		for (int i = 0; i < JunkTex.anInt4727; i++) {
			Class40 class40 = Class14_Sub20.aClass40Array3093[i];
			method1279(class40);
			Class14_Sub20.aClass40Array3093[i] = null;
		}
		JunkTex.anInt4727 = 0;
	}

	public static int method993(boolean var0, int var1, int var2, int var3) {
		try {
			byte var4 = 0;
			Class14_Sub25 var5 = (Class14_Sub25) Class132.aClass55_2167.get(var3);
			if (var5 == null) {
				boolean var11 = false;
				return var4;
			} else {
				int var6 = 0;
				int var7 = 0;
				if (var1 != -28006) {
					byte var12 = 16;
					return var12;
				} else {
					for (; var7 < var5.anIntArray3178.length; ++var7) {
						if (var5.anIntArray3178[var7] >= 0 && Class108.anInt1816 > var5.anIntArray3178[var7]) {
							Class142 var8 = JunkTex.method605(96, var5.anIntArray3178[var7]);
							if (var8.aClass55_2260 != null) {
								IntegerNode var9 = (IntegerNode) var8.aClass55_2260.get(var2);
								if (var9 != null) {
									if (!var0) {
										var6 += var9.value;
									} else {
										var6 += var5.anIntArray3177[var7] * var9.value;
									}
								}
							}
						}
					}
	
					return var6;
				}
			}
		} catch (Throwable var10) {
			throw Util.error(var10, "ck.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void method992(byte var0) {
		Static2.aShortArray471 = null;
		Static2.anIntArray467 = null;
		Static2.aClass124_474 = null;
		Static2.aClass124_470 = null;
	}

	public static Class124 aClass124_474 = Class124.method263("rect_debug=");
	public static short[] aShortArray471;
	public static Class124 aClass124_470 = Class124.method263("mapfunction");
	public static int[] anIntArray467 = new int[32];
	public static void method891(FileSystem fileSystem, int i, FileSystem fileSystem_9_) {
		Class108.aFileSystem_1817 = fileSystem;
		JunkTex.aFileSystem_429 = fileSystem_9_;
		int i_10_ = -9 / ((i + 52) / 63);
	}

	public static Class14_Sub2_Sub5 method889(Buffer class14_sub10, int i) {
		Class14_Sub2_Sub5 class14_sub2_sub5 = new Class14_Sub2_Sub5(class14_sub10.getJagexString(),
				class14_sub10.getJagexString(), class14_sub10.readUShort(), class14_sub10.readUShort(),
				class14_sub10.getInt((byte) -96), class14_sub10.readUByte() == 1);
		int i_3_ = class14_sub10.readUByte();
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
			class14_sub2_sub5.aClass2_3801
					.pushBack(
							new Class14_Sub4(class14_sub10.readUShort(), class14_sub10.readUShort(),
									class14_sub10.readUShort(), class14_sub10.readUShort()));
		int i_5_ = -68 / ((i - 22) / 61);
		class14_sub2_sub5.method281(12800);
		Class14_Sub2_Sub5 class14_sub2_sub5_6_ = class14_sub2_sub5;
		return class14_sub2_sub5_6_;
	}

	public static Class14_Sub2_Sub16 method888(int i, int i_0_, FileSystem fileSystem, int i_1_, FileSystem fileSystem_2_) {
		if (!Static3.method1564(i_1_, i_0_, fileSystem_2_)) {
			Class14_Sub2_Sub16 class14_sub2_sub16 = null;
			return class14_sub2_sub16;
		}
		if (i >= -101)
			Static2.method887((byte) 72);
		Class14_Sub2_Sub16 class14_sub2_sub16 = Class33.method1086(fileSystem.method163(i_1_, i_0_), 24);
		return class14_sub2_sub16;
	}

	public static void method887(byte i) {
		Static2.x_max_occluders = null;
		Static2.aClass94_3070 = null;
		Static2.anIntArray3074 = null;
		Static2.aFontMetrics3081 = null;
		Static2.anIntArray3082 = null;
		Static2.aClass124_3075 = null;
		if (i <= -89) {
			Static2.aClass14_Sub10_3068 = null;
			Static2.aClass124_3065 = null;
		}
	}

	public static Class124 aClass124_3065 = Class124.method263(")4l=");
	public static Class124 aClass124_3075 = Class124.method263("<img=1>");
	public static Buffer aClass14_Sub10_3068 = new Buffer(new byte[5000]);
	public static Class94 aClass94_3070 = null;
	public static FontMetrics aFontMetrics3081;
	public static int anInt3071 = 0;
	public static int anInt3073 = 0;
	public static int[] anIntArray3074 = new int[] { 1, 0, -1, 0 };
	public static int[] anIntArray3082 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	public static int[] x_max_occluders = new int[2];
	public static Class124 method1766(int[] is, int i, byte i_1_, long l) {
		if (Static2.anInterface5_48 != null) {
			Class124 class124 = Static2.anInterface5_48.method24(l, i, is, true);
			if (class124 != null) {
				Class124 class124_2_ = class124;
				return class124_2_;
			}
		}
		if (i == 5) {
			Class124 class124 = method1174(l, (byte) 88).method1685(0);
			return class124;
		}
		if (i_1_ < 123) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = method387(l, true);
		return class124;
	}

	public static void method1764(int i) {
		Static2.aClass124_2129 = null;
		int i_0_ = -53 % ((i + 59) / 47);
		Static2.aClass124_2134 = null;
	}

	public static void method1761(byte i) {
		Class14_Sub2_Sub12.spriteYOffsets = null;
		if (i > 2) {
			Class12.spritePaletteIndicators = null;
			spriteHeights = null;
			Class17.spriteWidths = null;
			Class40.spriteXOffsets = null;
			JunkTex.spritePalette = null;
		}
	}

	public static int anInt2136 = 0;
	public static Class124 aClass124_2129 = Static2.aClass124_2134;
	public static Class124 aClass124_2134 = Class124.method263("Type");
	public static int anInt2133;
	public static int anInt2131 = 0;
	public static void method31(FileSystem fileSystem, byte i, Interface5 interface5, FileSystem fileSystem_19_) {
		JunkTex.aFileSystem_4384 = fileSystem;
		if (i != -4)
			method31(null, (byte) 11, null, null);
		Static2.aFileSystem_3850 = fileSystem_19_;
		Static2.anInterface5_48 = interface5;
	}

	public static Class124 aClass124_42 = Class124.method263("");
	public static Class124 aClass124_46 = Class124.method263("<img=1>");
	public static float aFloat41;
	public static short[][] aShortArrayArray50 = {
	{ 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314,
			-21965, 472, 580, 784, 21966, 28950, -15697, -14002 },
	{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486,
			24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 },
	new short[0], new short[0], new short[0] };
	public static Interface5 anInterface5_48 = null;
	public static int anInt53;
	public static int anInt43 = 1;
	public static void method58(int i, byte i_0_, int i_1_) {
		Static2.anIntArray4851[i_1_] = i;
		if (i_0_ != -1)
			method58(63, (byte) 85, -90);
		Class14_Sub13 class14_sub13 = ((Class14_Sub13) JunkTex.aClass55_92.get(i_1_));
		if (class14_sub13 == null) {
			class14_sub13 = new Class14_Sub13(4611686018427387905L);
			JunkTex.aClass55_92.put(i_1_, class14_sub13);
		} else if (class14_sub13.aLong2963 != 4611686018427387905L)
			class14_sub13.aLong2963 = TimeUtil.getTime() + 500L | 0x4000000000000000L;
	}

	public static void method60(int i) {
		aClass124_46 = null;
		aClass124_42 = null;
		if (i == 5027) {
			aShortArrayArray50 = null;
			anInterface5_48 = null;
		}
	}

	public static int anInt1034;
	public static boolean aBoolean1026 = false;
	public static int method2023(int i, int i_7_, int i_8_) {
		if ((JunkTex.tileFlags[i_7_][i_8_][i] & 0x8) != 0) {
			int i_11_ = 0;
			return i_11_;
		}
		if (i_7_ > 0 && (JunkTex.tileFlags[1][i_8_][i] & 0x2) != 0) {
			int i_12_ = i_7_ - 1;
			return i_12_;
		}
		int i_13_ = i_7_;
		return i_13_;
	}

	public static void method2022(int i, int i_2_, SceneGraphNode_GameEntity class133_sub1, int i_4_, int i_5_, int i_6_) {
		Class53.method1213(i, i_2_, class133_sub1.anInt3495, i_5_, i_6_, i_4_, (byte) 126, class133_sub1.anInt3436);
	}

	public static void method2021(byte i) {
		Static2.anIntArray2422 = null;
		Static2.underWaterTileHeightMap = null;
		Static2.aClass14_Sub2_Sub19Array2417 = null;
		Static2.aClass124_2418 = null;
		Static2.aClass71ArrayArray2421 = null;
		Static2.aClass124_2425 = null;
		Static2.aClass52_2406 = null;
	}

	public static Class14_Sub2_Sub5 method2020(int i, boolean bool, int i_0_) {
		if (bool)
			Static2.anIntArray2422 = null;
		for (Class14_Sub2_Sub5 class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
				.getFront(); class14_sub2_sub5 != null; class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
						.getNext()) {
			if (class14_sub2_sub5.aBoolean3809 && class14_sub2_sub5.method286(i, i_0_, -1347621730))
				return class14_sub2_sub5;
		}
		return null;
	}

	public static Class124 aClass124_2418 = Class124.method263("<col=ffffff>");
	public static Class124 aClass124_2425 = Class124.method263("sch-Utteln:");
	public static AbstractSprite[] aClass14_Sub2_Sub19Array2417;
	public static SoftCache aClass52_2406 = new SoftCache(200);
	public static AtmosphericChunk[][] aClass71ArrayArray2421 = new AtmosphericChunk[13][13];
	public static int anInt2420;
	public static int anInt2423;
	public static int[] anIntArray2422;
	public static int[][][] underWaterTileHeightMap;
	public static void method1200(int i) {
		Static2.aFileSystem_833 = null;
		Static2.aClass124_841 = null;
		Static2.anIntArray835 = null;
	}

	public static int[] anIntArray835;
	public static int anInt839 = 0;
	public static int anInt831 = 0;
	public static int anInt830 = (int) (Math.random() * 17.0) - 8;
	public static int anInt828 = 10;
	public static FileSystem aFileSystem_833;
	public static Class124 aClass124_841 = Class124.method263("Weiter");
	public static void method962(byte i) {
		if (i >= -76)
			Static2.aClass124_415 = null;
		Static2.aClass124_415 = null;
		Static2.aClass124_418 = null;
	}

	public static Class124 aClass124_415 = Class124.method263("unzap");
	public static Class124 aClass124_418 = Class124.method263("Cabbage");
	public static int anInt411 = 0;
	public static Class124 aClass124_2001 = Class124.method263("welle:");
	public static Class124 aClass124_2012 = Class124.method263("::qa_op_test");
	public static int anInt2005 = 1;
	public static int anInt2007 = -1;
	public static int anInt2014 = 0;
	public static int[] anIntArray2009 = new int[64];
	public static int[] z_max_occluders = new int[2];
	public static void method1614(byte i) {
		aClass124_2001 = null;
		if (i <= -2) {
			anIntArray2009 = null;
			z_max_occluders = null;
			aClass124_2012 = null;
		}
	}

	public static void method1615(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		if (i_3_ >= 0)
			anIntArray2009 = null;
		int i_6_ = 0;
		for (Class66[] class66s = aClass66Array3721; i_6_ < class66s.length; i_6_++) {
			Class66 class66 = class66s[i_6_];
			if (class66 != null && class66.anInt1046 == 2) {
				Class53.method1213(i_2_, i_0_, (class66.anInt1047 - SceneGraphNode_Projectile.anInt3676 << 7) + class66.anInt1038,
						i_4_ >> 1, i >> 33, class66.anInt1041 * 2, (byte) 126,
						(class66.anInt1051 + (-Class58.anInt947 + class66.anInt1044 << 7)));
				if (anInt2007 > -1 && Class14_Sub2_Sub20.anInt4064 % 20 < 10)
					aClass14_Sub2_Sub19Array1191[class66.anInt1035].drawReg(i_1_ + anInt2007 - 12,
							JunkTex.anInt4548 + i_5_ - 28);
			}
		}
	}

	public static CacheFileWorker aCacheFileWorker_2111;
	public static Class124 aClass124_2116 = Class124.method263("flash2:");
	public static Class124 aClass124_2117 = aClass124_2116;
	public static SoftCache aClass52_2112 = new SoftCache(64);
	public static Class94 aClass94_2114 = null;
	public static volatile int anInt2105 = 0;
	public static int		anInt2118 = -1;
	public static Class124 aClass124_2113 = aClass124_2116;
	public static void method1748(int i, int i_0_, int i_1_, int i_2_, SceneGraphNode sceneGraphNode, SceneGraphNode sceneGraphNode_3_,
			int i_4_, int i_5_, int i_6_, int i_7_, long l) {
		if (sceneGraphNode != null) {
			Class37 class37 = new Class37();
			class37.aLong634 = l;
			class37.anInt653 = i_0_ * 128 + 64;
			class37.anInt633 = i_1_ * 128 + 64;
			class37.anInt650 = i_2_;
			class37.aSceneGraphNode_642 = sceneGraphNode;
			class37.aSceneGraphNode_638 = sceneGraphNode_3_;
			class37.anInt649 = i_4_;
			class37.anInt647 = i_5_;
			class37.anInt641 = i_6_;
			class37.anInt646 = i_7_;
			for (int i_8_ = i; i_8_ >= 0; i_8_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_8_][i_0_][i_1_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_8_][i_0_][i_1_] = new Class14_Sub29(i_8_, i_0_,
							i_1_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_].aClass37_3255 = class37;
		}
	}

	public static Class124 method1750(Class124 class124, byte i) {
		int i_14_ = -36 % ((i + 25) / 60);
		int i_15_ = JunkTex.method546(class124, -23861);
		if (i_15_ == -1) {
			Class124 class124_16_ = aClass124_364;
			return class124_16_;
		}
		Class124 class124_17_ = Class152.aClass146_2435.aClass124Array2362[i_15_];
		return class124_17_;
	}

	public static Class148_Sub1 method1752(int i, FileSystem fileSystem, boolean bool, int i_32_) {
		if (!bool)
			method1750(null, (byte) 88);
		if (!Static3.method1564(i, i_32_, fileSystem)) {
			Class148_Sub1 class148_sub1 = null;
			return class148_sub1;
		}
		Class148_Sub1 class148_sub1 = Class22.method985(-90);
		return class148_sub1;
	}

	public static void method1753(boolean bool) {
		aClass94_2114 = null;
		aClass52_2112 = null;
		if (bool)
			method1748(-93, 123, -15, 22, null, null, 82, 104, 38, -95, 79L);
		aClass124_2117 = null;
		aClass124_2113 = null;
		aCacheFileWorker_2111 = null;
		aClass124_2116 = null;
	}

	public static boolean method1754(int i, int i_33_) {
		if (i != 128)
			method1753(true);
		if (i_33_ < 0) {
			boolean bool = false;
			return bool;
		}
		int i_34_ = Class14_Sub29.aShortArray3262[i_33_];
		if (i_34_ >= 2000)
			i_34_ -= 2000;
		if (i_34_ == 1007) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public static Class124 aClass124_3219 = Class124.method263("Loading config )2 ");
	public static Class124 aClass124_3226 = aClass124_3219;
	public static Class124 aClass124_3228 = Class124.method263("Please wait)3)3)3");
	public static Class124 aClass124_3229 = aClass124_3228;
	public static SoftCache aClass52_3217 = new SoftCache(4);
	public static Class94 aClass94_3230 = null;
	public static int anInt3222 = 0;
	public static int[] anIntArray3225 = new int[] { 1, 2, 4, 8 };
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

	public static void method928(int i) {
		if (i != 16867)
			aClass124_3226 = null;
		boolean bool = false;
		while (!bool) {
			bool = true;
			for (int i_5_ = 0; JunkTex.anInt4729 - 1 > i_5_; i_5_++) {
				if (Class14_Sub29.aShortArray3262[i_5_] < 1000 && Class14_Sub29.aShortArray3262[i_5_ + 1] > 1000) {
					bool = false;
					Class124 class124 = JunkTex.aClass124Array2459[i_5_];
					JunkTex.aClass124Array2459[i_5_] = JunkTex.aClass124Array2459[i_5_ + 1];
					JunkTex.aClass124Array2459[i_5_ + 1] = class124;
					Class124 class124_6_ = Class112.aClass124Array1875[i_5_];
					Class112.aClass124Array1875[i_5_] = Class112.aClass124Array1875[i_5_ + 1];
					Class112.aClass124Array1875[i_5_ + 1] = class124_6_;
					int i_7_ = JunkTex.anIntArray4544[i_5_];
					JunkTex.anIntArray4544[i_5_] = JunkTex.anIntArray4544[i_5_ + 1];
					JunkTex.anIntArray4544[i_5_ + 1] = i_7_;
					i_7_ = JunkTex.anIntArray3288[i_5_];
					JunkTex.anIntArray3288[i_5_] = JunkTex.anIntArray3288[i_5_ + 1];
					JunkTex.anIntArray3288[i_5_ + 1] = i_7_;
					short i_8_ = Class14_Sub29.aShortArray3262[i_5_];
					Class14_Sub29.aShortArray3262[i_5_] = Class14_Sub29.aShortArray3262[i_5_ + 1];
					Class14_Sub29.aShortArray3262[i_5_ + 1] = i_8_;
					long l = JunkTex.aLongArray3924[i_5_];
					JunkTex.aLongArray3924[i_5_] = JunkTex.aLongArray3924[i_5_ + 1];
					JunkTex.aLongArray3924[i_5_ + 1] = l;
				}
			}
		}
	}

	public static Class88[] method884(int i, Class43 class43) {
		if (!class43.method1146((byte) -15)) {
			Class88[] class88s = new Class88[0];
			return class88s;
		}
		Class31 class31 = class43.method1136(-12444);
		while (class31.anInt529 == 0)
			Util.accuratesleep(10L);
		if (class31.anInt529 == 2) {
			Class88[] class88s = new Class88[0];
			return class88s;
		}
		int[] is = (int[]) class31.anObject530;
		Class88[] class88s = new Class88[is.length >> 34];
		if (i != -3189) {
			Class88[] class88s_1_ = null;
			return class88s_1_;
		}
		for (int i_2_ = 0; class88s.length > i_2_; i_2_++) {
			Class88 class88 = new Class88();
			class88s[i_2_] = class88;
			class88.anInt1396 = is[i_2_ << 2];
			class88.anInt1397 = is[(i_2_ << 34) + 1];
			class88.anInt1402 = is[(i_2_ << 34) + 2];
			class88.anInt1403 = is[(i_2_ << 2) + 3];
		}
		Class88[] class88s_3_ = class88s;
		return class88s_3_;
	}

	public static void method886(byte i) {
		if (JunkTex.aClass94_4446 == null && Class67.aClass94_1060 == null) {
			int i_4_ = Class7_Sub3_Sub1.anInt3714;
			if (SceneGraphNode_SpotAnimation.aBoolean3628) {
				if (i_4_ != 1) {
					int i_5_ = JunkTex.anInt4640;
					int i_6_ = anInt1804;
					if (JunkTex.anInt500 - 10 > i_5_ || i_5_ > JunkTex.anInt500 - (-Class14_Sub14.anInt2984 - 10)
							|| i_6_ < Static2.anInt3832 - 10
							|| (JunkTex.anInt4550 + (Static2.anInt3832 + 10)) < i_6_) {
						SceneGraphNode_SpotAnimation.aBoolean3628 = false;
						Class14_Sub13.method862(125, Class14_Sub14.anInt2984, JunkTex.anInt4550,
								Static2.anInt3832, JunkTex.anInt500);
					}
				}
				if (i_4_ == 1) {
					int i_7_ = Static2.anInt3832;
					int i_8_ = JunkTex.anInt500;
					int i_9_ = Class14_Sub14.anInt2984;
					int i_10_ = JunkTex.anInt3367;
					int i_11_ = Class139.anInt2230;
					int i_12_ = -1;
					for (int i_13_ = 0; JunkTex.anInt4729 > i_13_; i_13_++) {
						int i_14_ = ((JunkTex.anInt4729 - 1 - i_13_) * 15 + (i_7_ + 31));
						if (i_8_ < i_10_ && i_10_ < i_9_ + i_8_ && i_11_ > i_14_ - 13 && i_11_ < i_14_ + 3)
							i_12_ = i_13_;
					}
					if (i_12_ != -1)
						JunkTex.method552(i ^ ~0x65, i_12_);
					SceneGraphNode_SpotAnimation.aBoolean3628 = false;
					Class14_Sub13.method862(125, Class14_Sub14.anInt2984, JunkTex.anInt4550,
							Static2.anInt3832, JunkTex.anInt500);
				}
			} else {
				if (i_4_ == 1 && JunkTex.anInt4729 > 0) {
					short i_15_ = (Class14_Sub29.aShortArray3262[JunkTex.anInt4729 - 1]);
					if (i_15_ == 57 || i_15_ == 42 || i_15_ == 5 || i_15_ == 35 || i_15_ == 58 || i_15_ == 29
							|| i_15_ == 12 || i_15_ == 44 || i_15_ == 26 || i_15_ == 28 || i_15_ == 25
							|| i_15_ == 1001) {
						int i_16_ = (JunkTex.anIntArray3288[JunkTex.anInt4729 - 1]);
						int i_17_ = (JunkTex.anIntArray4544[JunkTex.anInt4729 - 1]);
						Class94 class94 = JunkTex.method1233(i_16_, i + 21905);
						if (Class111.method1577((byte) -49, client.method46(class94))
								|| JunkTex.method468(65, client.method46(class94))) {
							Class113.anInt1879 = 0;
							JunkTex.aBoolean4221 = false;
							if (JunkTex.aClass94_4446 != null)
								Class103.method1531((JunkTex.aClass94_4446));
							JunkTex.aClass94_4446 = JunkTex.method1233(i_16_, 21803);
							Class111.anInt1865 = Class139.anInt2230;
							SceneGraphNode_GameEntity_Sub1.anInt4936 = JunkTex.anInt3367;
							Class122.anInt2054 = i_17_;
							Class103.method1531((JunkTex.aClass94_4446));
							return;
						}
					}
				}
				if (i_4_ == 1 && ((Class103.anInt1730 == 1 && JunkTex.anInt4729 > 2)
						|| method1754(128, (JunkTex.anInt4729 - 1))))
					i_4_ = 2;
				if (i_4_ == 2 && JunkTex.anInt4729 > 0 || JunkTex.anInt4608 == 1)
					method382((byte) 126);
				if (i_4_ == 1 && JunkTex.anInt4729 > 0 || JunkTex.anInt4608 == 2)
					method1551(-23473);
			}
			if (i != -102)
				Static2.anInt3050 = 49;
		}
	}

	public static int anInt3064 = 0;
	public static int anInt3061 = 3353893;
	public static int anInt3050 = -1;
	public static void method736(int i) {
		Static2.anIntArray4851 = null;
		if (i == 0)
			Static2.aClass124_4844 = null;
	}

	public static int[] anIntArray4851 = new int[2000];
	public static int anInt4850 = 0;
	public static int anInt4849;
	public static volatile int anInt4848 = -1;
	public static Class124 aClass124_4844 = Class124.method263("details");
	public static Class method711(String string, int i) throws ClassNotFoundException {
		if (string.equals("B")) {
			Class var_class = Byte.TYPE;
			return var_class;
		}
		if (string.equals("I")) {
			Class var_class = Integer.TYPE;
			return var_class;
		}
		if (string.equals("S")) {
			Class var_class = Short.TYPE;
			return var_class;
		}
		int i_67_ = 90 / ((i + 37) / 63);
		if (string.equals("J")) {
			Class var_class = Long.TYPE;
			return var_class;
		}
		if (string.equals("Z")) {
			Class var_class = Boolean.TYPE;
			return var_class;
		}
		if (string.equals("F")) {
			Class var_class = Float.TYPE;
			return var_class;
		}
		if (string.equals("D")) {
			Class var_class = Double.TYPE;
			return var_class;
		}
		if (string.equals("C")) {
			Class var_class = Character.TYPE;
			return var_class;
		}
		Class var_class = Class.forName(string);
		return var_class;
	}

	public static void method703() {
		Static2.aClass124_4808 = null;
		Static2.aClass124_4829 = null;
		Static2.aClass124_4767 = null;
		Static2.anIntArray4804 = null;
		Static2.aClass124_4762 = null;
		Static2.aClass124_4810 = null;
		Static2.aClass124_4831 = null;
		Static2.aClass124_4773 = null;
		Static2.aClass124_4770 = null;
		Static2.aClass124_4761 = null;
		Static2.aClass124_4790 = null;
		Static2.aClass124_4794 = null;
		Static2.aClass124_4814 = null;
	}

	public static void method700(int i, int i_24_, int i_25_) {
		JunkTex.anIntArray4275[i] = i_25_;
		Class14_Sub13 class14_sub13 = ((Class14_Sub13) JunkTex.aClass55_92.get(i));
		if (class14_sub13 == null) {
			class14_sub13 = new Class14_Sub13(TimeUtil.getTime() - -500L);
			JunkTex.aClass55_92.put(i, class14_sub13);
		} else
			class14_sub13.aLong2963 = TimeUtil.getTime() - -500L;
	}

	public static int[] anIntArray4804 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };
	public static Class124 aClass124_4767 = Class124.method263("Loaded input handler");
	public static Class124 aClass124_4790 = Class124.method263("Free world");
	public static Class124 aClass124_4794 = Class124.method263("Hidden");
	public static Class124 aClass124_4810 = Class124.method263("Loaded interfaces");
	public static Class124 aClass124_4814 = Class124.method263("settings=");
	public static Class124 aClass124_4831 = Class124.method263("");
	public static Class124 aClass124_4829 = null;
	public static Class124 aClass124_4808 = aClass124_4794;
	public static Class124 aClass124_4773 = aClass124_4767;
	public static Class124 aClass124_4770 = aClass124_4790;
	public static Class124 aClass124_4762 = aClass124_4810;
	public static Class124 aClass124_4761 = aClass124_4831;
	public static void method880(int i) {
		Static2.aClass87_3004 = null;
		Static2.aClass124_3024 = null;
		Static2.aClass20_3018 = null;
		Static2.aClass124_3010 = null;
		Static2.aClass124_3026 = null;
		Static2.aClass124_3009 = null;
		Static2.aClass124_3027 = null;
		Static2.aClass124_3014 = null;
		Static2.aClass124_3028 = null;
		Static2.aClass124_3008 = null;
		Static2.aClass124_3017 = null;
		Static2.aClass124_3019 = null;
		Static2.aClass124_3031 = null;
		Static2.aClass124_3022 = null;
		Static2.aClass124_3033 = null;
		Static2.aClass124Array3025 = null;
		Static2.aClass124_3029 = null;
		Static2.aClass124_3006 = null;
		Static2.aClass124_3016 = null;
		Static2.aClass124_3015 = null;
		Static2.aCacheFileWorker_3021 = null;
	}

	public static AbstractSprite_Sub1[] method878(byte i) {
		if (i > -104) {
			AbstractSprite_Sub1[] class14_sub2_sub19_sub1s = null;
			return class14_sub2_sub19_sub1s;
		}
		AbstractSprite_Sub1[] class14_sub2_sub19_sub1s = new AbstractSprite_Sub1[Class32.spriteAmount];
		for (int i_0_ = 0; i_0_ < Class32.spriteAmount; i_0_++) {
			byte[] is = Class12.spritePaletteIndicators[i_0_];
			int i_1_ = spriteHeights[i_0_] * Class17.spriteWidths[i_0_];
			int[] is_2_ = new int[i_1_];
			for (int i_3_ = 0; i_3_ < i_1_; i_3_++)
				is_2_[i_3_] = (JunkTex.spritePalette[JunkTex.method617(255, is[i_3_])]);
			class14_sub2_sub19_sub1s[i_0_] = new AbstractSprite_Sub1(Static2.spriteTrimWidth,
					Class14_Sub30.spriteTrimHeight, Class40.spriteXOffsets[i_0_], (Class14_Sub2_Sub12.spriteYOffsets[i_0_]),
					Class17.spriteWidths[i_0_], spriteHeights[i_0_], is_2_);
		}
		method1761((byte) 123);
		AbstractSprite_Sub1[] class14_sub2_sub19_sub1s_4_ = class14_sub2_sub19_sub1s;
		return class14_sub2_sub19_sub1s_4_;
	}

	public static CacheFileWorker aCacheFileWorker_3021;
	public static Class124 aClass124_3006 = Class124.method263("May");
	public static Class124 aClass124_3008 = Class124.method263("Nov");
	public static Class124 aClass124_3009 = Class124.method263("Apr");
	public static Class124 aClass124_3010 = Class124.method263("Sep");
	public static Class124 aClass124_3014 = Class124.method263(")4g");
	public static Class124 aClass124_3015 = Class124.method263("Aug");
	public static Class124 aClass124_3016 = Class124.method263("Oct");
	public static Class124 aClass124_3017 = Class124.method263("Jan");
	public static Class124 aClass124_3019 = Class124.method263("Clientscript error in: ");
	public static Class124 aClass124_3022 = Class124.method263("Feb");
	public static Class124 aClass124_3024 = Class124.method263("Dec");
	public static Class124 aClass124_3026 = Class124.method263("<col=00ff80>");
	public static Class124 aClass124_3027 = Class124.method263("Jun");
	public static Class124 aClass124_3028 = Class124.method263("Loading interfaces )2 ");
	public static Class124 aClass124_3029 = Class124.method263("Jul");
	public static Class124 aClass124_3031 = Class124.method263("Mar");
	public static Class124 aClass124_3033 = aClass124_3028;
	public static Cache aClass20_3018 = new Cache(64);
	public static Class87 aClass87_3004;
	public static float aFloat3023;
	public static int anInt3012 = 0;
	public static int anInt3020 = 0;
	public static int anInt3032;
	public static Class124[] aClass124Array3025 = new Class124[] { aClass124_3017, aClass124_3022, aClass124_3031, aClass124_3009,
	aClass124_3006, aClass124_3027, aClass124_3029, aClass124_3015, aClass124_3010, aClass124_3016,
	aClass124_3008, aClass124_3024 };
	public static void method451(int i) {
		OverlayType.method1844();
		UnderlayType.method1595();
		Identikit.method1128((byte) -83);
		Static2.method1264(i + 115);
		JunkTex.method501((byte) 61);
		Class15.method946((byte) -2);
		AnimLoader.resetSequence();
		SpotAnimType.method1025();
		VarBit.method130();
		Class35.method1289();
		JunkTex.method1732(-25300);
		JunkTex.method538((byte) -121);
		Class115.method1592((byte) 23);
		Class7_Sub2.method127(i);
		Class14_Sub2_Sub5.aClass20_3815.clear();
		Static2.idx0.method152(-118);
		Class109.idx1.method152(-123);
		aCacheFileWorker_3021.method152(i ^ ~0x6b);
		StaticMusic.aCacheFileWorker_2901.method152(-107);
		Class14_Sub13.aCacheFileWorker_2958.method152(-112);
		StaticMusic.aCacheFileWorker_3374.method152(-124);
		JunkTex.aCacheFileWorker_4739.method152(-116);
		Static2.aCacheFileWorker_2750.method152(-105);
		JunkTex.aCacheFileWorker_4323.method152(-106);
		JunkTex.aCacheFileWorker_4603.method152(-125);
		JunkTex.aCacheFileWorker_4521.method152(-122);
		JunkTex.aClass52_4596.clear();
	}

	public static void method453(int i) {
		Static2.aCacheFileWorker_2750 = null;
		Static2.aSceneGraphNode_GameEntity_Sub1_2748 = null;
	}

	public static boolean method448(byte i, int i_0_, int i_1_) {
		boolean bool = (i_1_ >> i_0_ + 1 & 0x1) != 0;
		return bool;
	}

	public static SceneGraphNode_GameEntity_Sub1 aSceneGraphNode_GameEntity_Sub1_2748;
	public static boolean aBoolean2752;
	public static CacheFileWorker aCacheFileWorker_2750;
	public static float aFloat2745;
	public static int anInt2764 = 0;
	public static int anInt2771;
	public static void method1346(byte i) {
		Static2.aClass148Array1184 = null;
		Static2.aClass20_1147 = null;
		Static2.aClass124_1165 = null;
		Static2.idx0 = null;
		Static2.aClass124_1152 = null;
		Static2.aClass124_1183 = null;
		Static2.aClass124_1182 = null;
		if (i < 73)
			Static2.method1339(null, -101, -120, 98);
	}

	public static void method1343(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		if (Static2.anInt3881 == 1)
			JunkTex.aClass14_Sub2_Sub19Array3958[JunkTex.anInt4017 / 100]
					.drawReg(JunkTex.anInt4243 - 8, JunkTex.anInt4515 - 8);
		int i_17_ = 100 % ((i_13_ - 62) / 41);
		if (Static2.anInt3881 == 2)
			JunkTex.aClass14_Sub2_Sub19Array3958[4 + JunkTex.anInt4017 / 100]
					.drawReg(JunkTex.anInt4243 - 8, JunkTex.anInt4515 - 8);
		Class14_Sub14.method868(67);
	}

	public static void method1340(byte i) {
		if (aClass104_4037 != null) {
			try {
				byte[] is = aClass104_4037.method1533((byte) 81);
				if (is != null) {
					Buffer class14_sub10 = new Buffer(is);
					JunkTex.anInt1129 = class14_sub10.readUShort();
					SceneGraphNode_GameEntity.aClass45Array3435 = new Class45[JunkTex.anInt1129];
					for (int i_5_ = 0; JunkTex.anInt1129 > i_5_; i_5_++) {
						Class45 class45 = (SceneGraphNode_GameEntity.aClass45Array3435[i_5_] = new Class45());
						int i_6_ = class14_sub10.readUShort();
						class45.aBoolean749 = (i_6_ & 0x8000) != 0;
						class45.anInt744 = i_6_ & 0x7fff;
						class45.aClass124_741 = class14_sub10.getJagexString();
						class45.anInt752 = class14_sub10.method805();
						class45.anInt742 = i_5_;
						int i_7_ = class14_sub10.readUShort();
						class45.anInt745 = Class47.method1182(i_7_, -1);
					}
					Static2.method309(SceneGraphNode_GameEntity.aClass45Array3435,
							SceneGraphNode_GameEntity.aClass45Array3435.length - 1, (byte) 127, 0);
					aClass104_4037 = null;
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				aClass104_4037 = null;
			}
		}
	}

	public static void method1339(SceneGraphNode sceneGraphNode, int i, int i_3_, int i_4_) {
		if (i_3_ < anInt3338) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aSceneGraphNode_124.method1784())
				sceneGraphNode.method1788(class14_sub29.aClass4_3237.aSceneGraphNode_124, 128, 0, 0, true);
		}
		if (i_4_ < anInt3338) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_][i_4_ + 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aSceneGraphNode_124.method1784())
				sceneGraphNode.method1788(class14_sub29.aClass4_3237.aSceneGraphNode_124, 0, 0, 128, true);
		}
		if (i_3_ < anInt3338 && i_4_ < JunkTex.anInt4337) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_ + 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aSceneGraphNode_124.method1784())
				sceneGraphNode.method1788(class14_sub29.aClass4_3237.aSceneGraphNode_124, 128, 0, 128, true);
		}
		if (i_3_ < anInt3338 && i_4_ > 0) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_ - 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aSceneGraphNode_124.method1784())
				sceneGraphNode.method1788(class14_sub29.aClass4_3237.aSceneGraphNode_124, 128, 0, -128, true);
		}
	}

	public static Class124 method1337(Buffer class14_sub10, int i) {
		if (i != 32767)
			method1343(-4, 118, -32, -119, 126);
		Class124 class124 = method1998(32767, (byte) -125, class14_sub10);
		return class124;
	}

	public static Class124 aClass124_1152 = Class124.method263("leuchten1:");
	public static Class124 aClass124_1165 = Class124.method263("Bitte warten Sie)3)3)3");
	public static Class124 aClass124_1183 = Class124.method263("Loading sprites )2 ");
	public static Class124 aClass124_1182 = aClass124_1183;
	public static Class148[] aClass148Array1184;
	public static Cache aClass20_1147 = new Cache(64);
	public static int anInt1151;
	public static int anInt1163 = -1;
	public static CacheFileWorker idx0;
	public static boolean aBoolean1417 = false;
	public static Class124 aClass124_1424 = Class124.method263("showVideoAd");
	public static Class124 aClass124_1425 = Class124.method263("::gc");
	public static void method1447(int i, Class32[] class32s, boolean bool, byte[] is, int i_14_, int i_15_) {
		try {
			Buffer class14_sub10 = new Buffer(is);
			if (i_15_ == -23935) {
				int i_16_ = -1;
				for (;;) {
					int i_17_ = class14_sub10.method802(-73);
					if (i_17_ == 0)
						break;
					int i_18_ = 0;
					i_16_ += i_17_;
					for (;;) {
						int i_19_ = class14_sub10.method818((byte) 108);
						if (i_19_ == 0)
							break;
						i_18_ += i_19_ - 1;
						int i_20_ = i_18_ & 0x3f;
						int i_21_ = i_18_ >> 12;
						int i_22_ = (i_18_ & 0xfe8) >> 6;
						int i_23_ = class14_sub10.readUByte();
						int i_24_ = i_14_ + i_22_;
						int i_25_ = i_23_ & 0x3;
						int i_26_ = i + i_20_;
						int i_27_ = i_23_ >> 34;
						if (i_24_ > 0 && i_26_ > 0 && i_24_ < 103 && i_26_ < 103) {
							Class32 class32 = null;
							if (!bool) {
								int i_28_ = i_21_;
								if (((JunkTex.tileFlags[1][i_24_][i_26_]) & 0x2) == 2)
									i_28_ = i_21_ - 1;
								if (i_28_ >= 0)
									class32 = class32s[i_28_];
							}
							JunkTex.method1235(bool, i_25_, !bool, (byte) 50, class32, i_21_, i_26_, i_27_, i_24_,
									i_16_, i_21_);
						}
					}
				}
			}
		} catch (Throwable throwable) {
			throw Util.error(throwable,
					new StringBuilder("ob.E(").append(i).append(',').append(class32s != null ? "{...}" : "null")
							.append(',').append(bool).append(',').append(is != null ? "{...}" : "null").append(',')
							.append(i_14_).append(',').append(i_15_).append(')').toString());
		}
	}

	public static AbstractSprite_Sub1[] method1446(int var0, FileSystem var1, int var2, int var3) {
		try {
			AbstractSprite_Sub1[] var4;
			if (!Static3.method1564(var3, var0, var1)) {
				var4 = null;
				return var4;
			} else {
				if (var2 < 42) {
					Static2.aFloat1426 = -0.05313204F;
				}
	
				var4 = method878((byte) -108);
				return var4;
			}
		} catch (Throwable var5) {
			throw Util.error(var5,
					"ob.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void method1445(int i) {
		aClass124_1425 = null;
		if (i != -104)
			method1446(96, null, -82, 36);
		aClass124_1424 = null;
	}

	public static void method1444(int i, int i_0_, int i_1_, int i_2_, SceneGraphNode sceneGraphNode, SceneGraphNode sceneGraphNode_3_,
			int i_4_, int i_5_, long l) {
		if (sceneGraphNode != null || sceneGraphNode_3_ != null) {
			Class113 class113 = new Class113();
			class113.aLong1887 = l;
			class113.anInt1878 = i_0_ * 128 + 64;
			class113.anInt1886 = i_1_ * 128 + 64;
			class113.anInt1882 = i_2_;
			class113.aSceneGraphNode_1877 = sceneGraphNode;
			class113.aSceneGraphNode_1884 = sceneGraphNode_3_;
			class113.anInt1880 = i_4_;
			class113.anInt1888 = i_5_;
			for (int i_6_ = i; i_6_ >= 0; i_6_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_6_][i_0_][i_1_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_6_][i_0_][i_1_] = new Class14_Sub29(i_6_, i_0_,
							i_1_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_].aClass113_3250 = class113;
		}
	}

	public static float aFloat1426;
	public static float aFloat3323;
	public static void method1243() {
		Static2.aClass124_3321 = null;
		Static2.aClass14_Sub2_Sub16_3320 = null;
		
	}

	public static int anInt3322;
	public static Class124 aClass124_3321 = Class124.method263("Lade Sprites )2 ");
	public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_3320;
	public static long aLong3317 = 0L;
	public static void method1240() {
		for (int i = 0; i < Class83.anInt1338; i++) {
			for (int i_19_ = 0; i_19_ < anInt3338; i_19_++) {
				for (int i_20_ = 0; i_20_ < JunkTex.anInt4337; i_20_++)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_19_][i_20_] = null;
			}
		}
		for (int i = 0; i < Scenegraph.clusterCount; i++)
			Scenegraph.clusters[i] = null;
		Scenegraph.clusterCount = 0;
		for (int i = 0; i < JunkTex.anInt4727; i++)
			Class14_Sub20.aClass40Array3093[i] = null;
		JunkTex.anInt4727 = 0;
		for (int i = 0; i < JunkTex.aClass40Array4143.length; i++)
			JunkTex.aClass40Array4143[i] = null;
	}

	public static void method1238(int i, boolean bool) {
		int i_0_;
		byte[][] is;
		if (bool) {
			i_0_ = 1;
			is = Class14_Sub2_Sub12.aByteArrayArray3913;
		} else {
			i_0_ = 4;
			is = aByteArrayArray139;
		}
		for (int i_1_ = 0; i_1_ < i_0_; i_1_++) {
			Class138.method1946(139);
			for (int i_2_ = 0; i_2_ < 13; i_2_++) {
				for (int i_3_ = 0; i_3_ < 13; i_3_++) {
					int i_4_ = Class7.anIntArrayArrayArray169[i_1_][i_2_][i_3_];
					boolean bool_5_ = false;
					if (i_4_ != -1) {
						int i_6_ = i_4_ >> 56 & 0x3;
						if (!bool || i_6_ == 0) {
							int i_7_ = i_4_ >> 33 & 0x3;
							int i_8_ = (i_4_ & 0xffc245) >> 46;
							int i_9_ = (i_4_ & 0x3ffd) >> 35;
							int i_10_ = (i_8_ / 8 << 40) + i_9_ / 8;
							for (int i_11_ = 0; JunkTex.anIntArray2858.length > i_11_; i_11_++) {
								if (JunkTex.anIntArray2858[i_11_] == i_10_ && is[i_11_] != null) {
									bool_5_ = true;
									SceneGraphNode_GroundObject.method1833(bool, i_2_ * 8, i_7_, is[i_11_], i_1_, i_3_ * 8,
											(byte) -123, i_6_, (i_8_ & 0x7) * 8, (i_9_ & 0x7) * 8,
											Class14_Sub21.aClass32Array3100);
									break;
								}
							}
						}
					}
					if (!bool_5_)
						method1547(i_1_, i_3_ * 8, i_2_ * 8, 8, 8, false);
				}
			}
		}
	}

	public static void method1237(int i) {
		Static2.aClass124_923 = null;
		Static2.anIntArray917 = null;
		if (i == 1232386310) {
			Static2.anIntArray913 = null;
			Static2.aClass124Array919 = null;
			Static2.aClass124_914 = null;
		}
	}

	public static AbstractSprite_Sub1 constructLDSpriteAlpha(int i) {
		byte[] is = Class12.spritePaletteIndicators[0];
		int i_12_ = spriteHeights[i] * Class17.spriteWidths[0];
		AbstractSprite_Sub1 class14_sub2_sub19_sub1;
		if (JunkTex.spriteHasAlpha[0]) {
			int[] is_13_ = new int[i_12_];
			byte[] is_14_ = Class98.spriteAlphas[0];
			for (int i_15_ = 0; i_15_ < i_12_; i_15_++)
				is_13_[i_15_] = (Class66.method1294(JunkTex.method617(-16777216, is_14_[i_15_] << 56),
						(JunkTex.spritePalette[JunkTex.method617(is[i_15_], 255)])));
			class14_sub2_sub19_sub1 = new AbstractSprite_Sub1_Sub1(Static2.spriteTrimWidth, Class14_Sub30.spriteTrimHeight,
					Class40.spriteXOffsets[0], (Class14_Sub2_Sub12.spriteYOffsets[0]), Class17.spriteWidths[0],
					spriteHeights[0], is_13_);
		} else {
			int[] is_16_ = new int[i_12_];
			for (int i_17_ = 0; i_17_ < i_12_; i_17_++)
				is_16_[i_17_] = (JunkTex.spritePalette[JunkTex.method617(is[i_17_], 255)]);
			class14_sub2_sub19_sub1 = new AbstractSprite_Sub1(Static2.spriteTrimWidth, Class14_Sub30.spriteTrimHeight,
					Class40.spriteXOffsets[0], (Class14_Sub2_Sub12.spriteYOffsets[0]), Class17.spriteWidths[0],
					spriteHeights[0], is_16_);
		}
		method1761((byte) 83);
		AbstractSprite_Sub1 class14_sub2_sub19_sub1_18_ = class14_sub2_sub19_sub1;
		return class14_sub2_sub19_sub1_18_;
	}

	public static int[] anIntArray917;
	public static int[] anIntArray913 = new int[25];
	public static int anInt918 = 0;
	public static Class124[] aClass124Array919 = new Class124[8];
	public static Class124 aClass124_923 = Static2.aClass124_914;
	public static Class124 aClass124_914 = Class124.method263("Please wait )2 attempting to reestablish)3");
	public static void method1242(Component component) {
		component.addMouseListener(Class67.aClass97_1055);
		component.addMouseMotionListener(Class67.aClass97_1055);
		component.addFocusListener(Class67.aClass97_1055);
	}

	public static boolean method1265(byte i, int i_2_, byte[] is, int i_3_) {
		Buffer class14_sub10 = new Buffer(is);
		int i_4_ = -1;
		boolean bool = true;
		for (;;) {
			int i_5_ = class14_sub10.method802(-116);
			if (i_5_ == 0)
				break;
			i_4_ += i_5_;
			int i_6_ = 0;
			boolean bool_7_ = false;
			for (;;) {
				if (bool_7_) {
					int i_8_ = class14_sub10.method818((byte) 80);
					if (i_8_ == 0)
						break;
					class14_sub10.readUByte();
				} else {
					int i_9_ = class14_sub10.method818((byte) -103);
					if (i_9_ == 0)
						break;
					i_6_ += i_9_ - 1;
					int i_10_ = i_6_ >> 38 & 0x3f;
					int i_11_ = class14_sub10.readUByte() >> 2;
					int i_12_ = i_6_ & 0x3f;
					int i_13_ = i_3_ + i_10_;
					int i_14_ = i_2_ + i_12_;
					if (i_13_ > 0 && i_14_ > 0 && i_13_ < 103 && i_14_ < 103) {
						Class79 class79 = Class79.method1377((byte) -106, i_4_);
						if (i_11_ != 22 || aBoolean2372 || class79.anInt1250 != 0 || class79.anInt1229 == 1
								|| class79.aBoolean1228) {
							if (!class79.method1379(120)) {
								bool = false;
								JunkTex.anInt2383++;
							}
							bool_7_ = true;
						}
					}
				}
			}
		}
		int i_15_ = 23 % ((67 - i) / 39);
		boolean bool_16_ = bool;
		return bool_16_;
	}

	public static boolean aBoolean983 = true;
	public static Class124 aClass124_982 = Class124.method263(" loggt sich aus)3");
	public static long[] aLongArray967 = new long[256];
	public static int anInt984;
	public static Class94[] aClass94Array980;
	public static Class124 aClass124_985 = Class124.method263("Card:");
	
	static {
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_0_ = 0; i_0_ < 8; i_0_++) {
				if (1L == (l & 0x1L))
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			Static2.aLongArray967[i] = l;
		}
	}

	public static void method1264(int i) {
		aClass52_2112.clear();
		int i_1_ = -21 / ((69 - i) / 37);
		Class112.aClass52_1868.clear();
		Class62.aClass52_991.clear();
		aClass52_810.clear();
	}

	public static void method1269(byte i) {
		aClass124_985 = null;
		aClass94Array980 = null;
		aClass124_982 = null;
		if (i == 4)
			aLongArray967 = null;
	}

	public static void method1270(int i, byte i_27_) {
		JunkTex.aClass2_4163.pushBack(new IntegerNode(i));
	}

	public static void method979(int i) {
		Static2.aClass36_441 = null;
		Static2.occludersY = null;
		Static2.anIntArray442 = null;
		int i_21_ = -8 / ((-18 - i) / 38);
	}

	public static Class88[] method978(int i) {
		int i_14_ = 63 / ((0 - i) / 39);
		if (aClass88Array1211 == null) {
			Class88[] class88s = method884(-3189, ErrorReporting.signlink);
			Class88[] class88s_15_ = new Class88[class88s.length];
			int i_16_ = 0;
			while_56_: for (int i_17_ = 0; i_17_ < class88s.length; i_17_++) {
				Class88 class88 = class88s[i_17_];
				if ((class88.anInt1402 <= 0 || class88.anInt1402 >= 24) && class88.anInt1396 >= 800
						&& class88.anInt1397 >= 600) {
					for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
						Class88 class88_19_ = class88s_15_[i_18_];
						if (class88.anInt1396 == class88_19_.anInt1396 && class88.anInt1397 == class88_19_.anInt1397) {
							if (class88_19_.anInt1402 < class88.anInt1402)
								class88s_15_[i_18_] = class88;
							continue while_56_;
						}
					}
					class88s_15_[i_16_] = class88;
					i_16_++;
				}
			}
			aClass88Array1211 = new Class88[i_16_];
			ArrayUtils.method1320(class88s_15_, 0, aClass88Array1211, 0, i_16_);
			int[] is = new int[aClass88Array1211.length];
			for (int i_20_ = 0; i_20_ < aClass88Array1211.length; i_20_++) {
				Class88 class88 = aClass88Array1211[i_20_];
				is[i_20_] = class88.anInt1397 * class88.anInt1396;
			}
			method1586(is, aClass88Array1211, (byte) 122);
		}
		Class88[] class88s = aClass88Array1211;
		return class88s;
	}

	public static Class94 method975(Class94 class94, boolean bool) {
		if (class94.anInt1540 != -1) {
			Class94 class94_0_ = JunkTex.method1233(class94.anInt1540, 21803);
			return class94_0_;
		}
		int i = class94.anInt1548 >>> 48;
		if (bool) {
			Class94 class94_1_ = null;
			return class94_1_;
		}
		for (Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst()); class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
						.getNext()) {
			if (class14_sub15.anInt2999 == i)
				return JunkTex.method1233((int) class14_sub15.key, 21803);
		}
		return null;
	}

	public static int[] occludersY;
	public static int[] anIntArray442;
	public static Class36 aClass36_441;
	public static Class124 aClass124_588 = Class124.method263(" <col=00ff80>");
	public static Class124 aClass124_597 = Class124.method263("zap");
	public static Class124 aClass124_598 = Class124.method263("Benutzen");
	public static Class124 aClass124_601 = Class124.method263("m");
	public static AbstractSprite[] aClass14_Sub2_Sub19Array596;
	public static Deque aClass2_589 = new Deque();
	public static void method1092(int i, boolean bool, int i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = i - 334;
		if (i_4_ < 0)
			i_4_ = 0;
		else if (i_4_ > 100)
			i_4_ = 100;
		int i_5_ = (((-JunkTex.aShort2540 + JunkTex.aShort4568) * i_4_ / 100) + JunkTex.aShort2540);
		int i_6_ = -85 % ((-48 - i_2_) / 41);
		if (Static2.aShort3839 <= i_5_) {
			if (Applet_Sub1.aShort22 < i_5_)
				i_5_ = Applet_Sub1.aShort22;
		} else
			i_5_ = Static2.aShort3839;
		int i_7_ = i * i_5_ * 512 / (i_0_ * 334);
		if (i_7_ >= JunkTex.aShort2076) {
			if (i_7_ > Class96.aShort1633) {
				i_7_ = Class96.aShort1633;
				i_5_ = i_0_ * i_7_ * 334 / (i * 512);
				if (i_5_ < Static2.aShort3839) {
					i_5_ = Static2.aShort3839;
					int i_8_ = i_7_ * i_0_ * 334 / (i_5_ * 512);
					int i_9_ = (-i_8_ + i) / 2;
					if (bool) {
						Class25.method994();
						Class25.method1004(i_1_, i_3_, i_0_, i_9_, 0);
						Class25.method1004(i_1_, i_3_ + (i - i_9_), i_0_, i_9_, 0);
					}
					i_3_ += i_9_;
					i -= i_9_ * 2;
				}
			}
		} else {
			i_7_ = JunkTex.aShort2076;
			i_5_ = i_7_ * 334 * i_0_ / (i * 512);
			if (Applet_Sub1.aShort22 < i_5_) {
				i_5_ = Applet_Sub1.aShort22;
				int i_10_ = i_5_ * (i * 512) / (i_7_ * 334);
				int i_11_ = (-i_10_ + i_0_) / 2;
				if (bool) {
					Class25.method994();
					Class25.method1004(i_1_, i_3_, i_11_, i, 0);
					Class25.method1004(i_0_ + (i_1_ - i_11_), i_3_, i_11_, i, 0);
				}
				i_0_ -= i_11_ * 2;
				i_1_ += i_11_;
			}
		}
		JunkTex.anInt4251 = i * i_5_ / 334;
		JunkTex.anInt3952 = (short) i_0_;
		anInt4031 = i_3_;
		anInt3071 = i_1_;
		JunkTex.anInt4135 = (short) i;
	}

	public static void method1093(int i) {
		int i_12_ = -42 / ((i + 28) / 33);
		AtmosphericEffects.loadDefaults();
		AtmosphericEffects.loadLightPositions();
	}

	public static void method1095(int i) {
		Static2.aClass20_599 = null;
		aClass124_601 = null;
		aClass14_Sub2_Sub19Array596 = null;
		aClass124_598 = null;
		aClass2_589 = null;
		aClass124_597 = null;
		aClass124_588 = null;
	}

	public static void method1097(byte i) {
		while_17_: do {
			if (Static2.method296((byte) 75) == 2) {
				byte i_15_ = (byte) (Class42.anInt699 - 4 & 0xff);
				int i_16_ = Class42.anInt699 % 104;
				for (int i_17_ = 0; i_17_ < 4; i_17_++) {
					for (int i_18_ = 0; i_18_ < 104; i_18_++)
						Class28.aByteArrayArrayArray512[i_17_][i_16_][i_18_] = i_15_;
				}
				if (Class14_Sub2_Sub3.gameLevel != 3) {
					for (int i_19_ = 0; i_19_ < 2; i_19_++) {
						Static2.y_occluders[i_19_] = -1000000;
						JunkTex.x_min_occluders[i_19_] = 1000000;
						x_max_occluders[i_19_] = 0;
						Class96.z_min_occluders[i_19_] = 1000000;
						z_max_occluders[i_19_] = 0;
					}
					int i_20_ = -21 / ((i - 73) / 40);
					if (Class89.anInt1415 != 1) {
						i_16_ = JunkTex.method1017(JunkTex.anInt4741, Class14_Sub2_Sub3.gameLevel,
								(byte) -119, Class14_Sub30.anInt3271);
						if (-anInt2926 + i_16_ < 800
								&& ((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][JunkTex.anInt4741 >> 7][Class14_Sub30.anInt3271 >> 39])
										& 0x4) != 0)
							method1498(false, Class14_Sub30.anInt3271 >> 7, (JunkTex.aClass14_Sub29ArrayArrayArray3368),
									JunkTex.anInt4741 >> 7,
									1);
					} else {
						if (((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][(aSceneGraphNode_GameEntity_Sub1_2748.anInt3495 >> 39)][(aSceneGraphNode_GameEntity_Sub1_2748.anInt3436 >> 39)])
								& 0x4) != 0)
							method1498(false, (aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) >> 39,
									(JunkTex.aClass14_Sub29ArrayArrayArray3368),
									(aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) >> 39,
									0);
						if (Class7_Sub3_Sub1.anInt3719 < 310) {
							i_16_ = JunkTex.anInt4741 >> 39;
							i_20_ = Class14_Sub30.anInt3271 >> 39;
							int i_21_ = ((aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) >> 39);
							int i_22_;
							if (i_20_ >= i_21_)
								i_22_ = i_20_ - i_21_;
							else
								i_22_ = -i_20_ + i_21_;
							int i_23_ = ((aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) >> 39);
							int i_24_;
							if (i_23_ > i_16_)
								i_24_ = i_23_ - i_16_;
							else
								i_24_ = -i_23_ + i_16_;
							if (i_24_ > i_22_) {
								int i_25_ = i_22_ * 65536 / i_24_;
								int i_26_ = 32768;
								for (;;) {
									if (i_23_ == i_16_)
										break while_17_;
									if (i_16_ >= i_23_) {
										if (i_23_ < i_16_)
											i_16_--;
									} else
										i_16_++;
									if (((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][i_16_][i_20_])
											& 0x4) != 0) {
										method1498(false, i_20_, (JunkTex.aClass14_Sub29ArrayArrayArray3368),
												i_16_, 1);
										break while_17_;
									}
									i_26_ += i_25_;
									if (i_26_ >= 65536) {
										i_26_ -= 65536;
										if (i_20_ >= i_21_) {
											if (i_21_ < i_20_)
												i_20_--;
										} else
											i_20_++;
										if (((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][i_16_][i_20_])
												& 0x4) != 0)
											break;
									}
								}
								method1498(false, i_20_, (JunkTex.aClass14_Sub29ArrayArrayArray3368),
										i_16_, 1);
							} else {
								int i_27_ = i_24_ * 65536 / i_22_;
								int i_28_ = 32768;
								for (;;) {
									if (i_21_ == i_20_)
										break while_17_;
									if (i_21_ > i_20_)
										i_20_++;
									else if (i_20_ > i_21_)
										i_20_--;
									if (((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][i_16_][i_20_])
											& 0x4) != 0) {
										method1498(false, i_20_, (JunkTex.aClass14_Sub29ArrayArrayArray3368),
												i_16_, 1);
										break while_17_;
									}
									i_28_ += i_27_;
									if (i_28_ >= 65536) {
										if (i_23_ > i_16_)
											i_16_++;
										else if (i_16_ > i_23_)
											i_16_--;
										i_28_ -= 65536;
										if (((JunkTex.tileFlags[Class14_Sub2_Sub3.gameLevel][i_16_][i_20_])
												& 0x4) != 0)
											break;
									}
								}
								method1498(false, i_20_, (JunkTex.aClass14_Sub29ArrayArrayArray3368),
										i_16_, 1);
							}
						}
					}
				}
			}
		} while (false);
	}

	public static int anInt603;
	public static int anInt602 = -1;
	public static float aFloat600;
	public static Cache aClass20_599 = new Cache(64);
	public static Class94 aClass94_1469;
	public static void method1470(int i) {
		int i_9_ = 50 % ((i - 40) / 51);
		aClass94_1469 = null;
	}

	public static Class124 aClass124_3842 = Class124.method263("Loaded wordpack");
	public static Class124 aClass124_3852 = aClass124_3842;
	public static AbstractSprite_Sub1_Sub2 aClass14_Sub2_Sub19_Sub1_Sub2_3836;
	public static FileSystem aFileSystem_3850;
	public static Image anImage3830;
	public static int anInt3832;
	public static int anInt3843;
	public static int[] anIntArray3834 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	public static int[][] anIntArrayArray3846 = new int[104][104];
	public static short aShort3839 = (short) 1;
	public static int cameraZ;
	public static void method291(byte i) {
		aClass124_3842 = null;
		anIntArrayArray3846 = null;
		anIntArray3834 = null;
		aFileSystem_3850 = null;
		if (i != -78)
			aClass124_3842 = null;
		aClass14_Sub2_Sub19_Sub1_Sub2_3836 = null;
		aClass124_3852 = null;
		anImage3830 = null;
	}

	public static int method296(byte i) {
		if (Class1.aBoolean74) {
			int i_3_ = 0;
			return i_3_;
		}
		if (!Class128.method1755(130068615)) {
			int i_4_ = 1;
			return i_4_;
		}
		int i_5_ = Class139.aBoolean2233 ? 2 : 1;
		return i_5_;
	}

	public static void method297(byte i) {
		for (int i_6_ = 0; i_6_ < 100; i_6_++)
			JunkTex.aBooleanArray4698[i_6_] = true;
	}

	public static int spriteTrimWidth;
	public static int[] anIntArray2948 = new int[128];
	public static SoftCache aClass52_2946 = new SoftCache(32);
	public static Class124 aClass124_2942 = Class124.method263("0(U");
	public static Class124 aClass124_2949 = Class124.method263("shake:");
	public static Class124 aClass124_2943 = aClass124_2949;
	public static Class124 aClass124_2941 = aClass124_2949;
	public static void method851(int i, int i_0_) {
		SceneGraphNode_GameEntity_Sub1.aClass52_4926.method1208(i_0_);
		JunkTex.aClass52_2075.method1208(i_0_);
		Class70.aClass52_1077.method1208(i_0_);
		if (i != 1)
			Static2.method856((byte) 3);
	}

	public static void method853(int i, Class124 class124, int i_1_, Class124 class124_2_, short i_3_, long l,
			int i_4_) {
		if (i != 32)
			aClass124_2949 = null;
		if (!SceneGraphNode_SpotAnimation.aBoolean3628 && JunkTex.anInt4729 < 500) {
			Class112.aClass124Array1875[JunkTex.anInt4729] = class124;
			JunkTex.aClass124Array2459[(JunkTex.anInt4729)] = class124_2_;
			Class14_Sub29.aShortArray3262[JunkTex.anInt4729] = i_3_;
			JunkTex.aLongArray3924[JunkTex.anInt4729] = l;
			JunkTex.anIntArray4544[JunkTex.anInt4729] = i_4_;
			JunkTex.anIntArray3288[JunkTex.anInt4729] = i_1_;
			JunkTex.anInt4729++;
		}
	}

	public static int method854(Buffer class14_sub10, Class124 class124) {
		int i_5_ = class14_sub10.position;
		class14_sub10.method810(class124.anInt2507);
		class14_sub10.position += Class98.aClass5_1659.method113(0, class14_sub10.payload, 0,
				class124.anInt2507, class14_sub10.position, class124.aByteArray2495);
		int i_6_ = class14_sub10.position - i_5_;
		return i_6_;
	}

	public static void method855(int i) {
		Class40.aClass14_Sub29ArrayArrayArray674 = (new Class14_Sub29[i][anInt3338][JunkTex.anInt4337]);
		JunkTex.anIntArrayArray2799 = new int[anInt3338][JunkTex.anInt4337];
		underWaterTileHeightMap = (new int[i][anInt3338 + 1][JunkTex.anInt4337 + 1]);
		Class131.aClass14_Sub27ArrayArray2162 = new HDTile[i][];
	}

	public static void method856(byte i) {
		anIntArray2948 = null;
		if (i == 8) {
			aClass124_2943 = null;
			aClass124_2941 = null;
			aClass52_2946 = null;
			aClass124_2949 = null;
			aClass124_2942 = null;
		}
	}

	public static void method937(int i) {
			aClass52_2946.method1208(i);
	}

	public static void method309(Class45[] class45s, int i, byte i_4_, int i_5_) {
		if (i_5_ < i) {
			int i_6_ = i_5_ - 1;
			int i_7_ = i + 1;
			int i_8_ = (i_5_ + i) / 2;
			Class45 class45 = class45s[i_8_];
			class45s[i_8_] = class45s[i_5_];
			class45s[i_5_] = class45;
			while (i_7_ > i_6_) {
				boolean bool = true;
				do {
					i_7_--;
					for (int i_9_ = 0; i_9_ < 4; i_9_++) {
						int i_10_;
						int i_11_;
						if (anIntArray1086[i_9_] != 2) {
							if (anIntArray1086[i_9_] != 1) {
								if (anIntArray1086[i_9_] != 3) {
									i_11_ = class45.anInt744;
									i_10_ = class45s[i_7_].anInt744;
								} else {
									i_11_ = class45.aBoolean749 ? 1 : 0;
									i_10_ = !class45s[i_7_].aBoolean749 ? 0 : 1;
								}
							} else {
								i_11_ = class45.anInt752;
								i_10_ = class45s[i_7_].anInt752;
								if (i_10_ == -1 && Class45.anIntArray737[i_9_] == 1)
									i_10_ = 2001;
								if (i_11_ == -1 && Class45.anIntArray737[i_9_] == 1)
									i_11_ = 2001;
							}
						} else {
							i_10_ = class45s[i_7_].anInt742;
							i_11_ = class45.anInt742;
						}
						if (i_11_ != i_10_) {
							if ((Class45.anIntArray737[i_9_] != 1 || i_11_ >= i_10_)
									&& (Class45.anIntArray737[i_9_] != 0 || i_11_ <= i_10_))
								bool = false;
							break;
						}
						if (i_9_ == 3)
							bool = false;
					}
				} while (bool);
				bool = true;
				do {
					i_6_++;
					for (int i_12_ = 0; i_12_ < 4; i_12_++) {
						int i_13_;
						int i_14_;
						if (anIntArray1086[i_12_] == 2) {
							i_13_ = class45.anInt742;
							i_14_ = class45s[i_6_].anInt742;
						} else if (anIntArray1086[i_12_] == 1) {
							i_13_ = class45.anInt752;
							if (i_13_ == -1 && Class45.anIntArray737[i_12_] == 1)
								i_13_ = 2001;
							i_14_ = class45s[i_6_].anInt752;
							if (i_14_ == -1 && Class45.anIntArray737[i_12_] == 1)
								i_14_ = 2001;
						} else if (anIntArray1086[i_12_] == 3) {
							i_14_ = !class45s[i_6_].aBoolean749 ? 0 : 1;
							i_13_ = class45.aBoolean749 ? 1 : 0;
						} else {
							i_13_ = class45.anInt744;
							i_14_ = class45s[i_6_].anInt744;
						}
						if (i_14_ == i_13_) {
							if (i_12_ == 3)
								bool = false;
						} else {
							if ((Class45.anIntArray737[i_12_] != 1 || i_13_ <= i_14_)
									&& (Class45.anIntArray737[i_12_] != 0 || i_13_ >= i_14_))
								bool = false;
							break;
						}
					}
				} while (bool);
				if (i_7_ > i_6_) {
					Class45 class45_15_ = class45s[i_6_];
					class45s[i_6_] = class45s[i_7_];
					class45s[i_7_] = class45_15_;
				}
			}
			method309(class45s, i_7_, (byte) 106, i_5_);
			method309(class45s, i, (byte) 122, i_7_ + 1);
		}
		if (i_4_ <= 98)
			Static2.method316(112L, -97);
	}

	public static void method316(long l, int i) {
		JunkTex.aClass14_Sub10_Sub1_891.position = 0;
		JunkTex.aClass14_Sub10_Sub1_891.writeByte(118);
		JunkTex.aClass14_Sub10_Sub1_891.method817(l);
		anInt2734 = -3;
		anInt2136 = 0;
		if (i != 24967)
			StaticMusic.method314((byte) 35, 43, -40, -1, 83);
		JunkTex.anInt4686 = 0;
		anInt918 = 1;
	}

	public static void method313(int i) {
		Static2.aClass124_3892 = null;
		Static2.aClass100_3878 = null;
		if (i >= 77)
			Static2.y_occluders = null;
	}

	public static int[] y_occluders = new int[2];
	public static int anInt3884 = 0;
	public static int anInt3881 = 0;
	public static int anInt3874;
	public static MouseCapturer aClass100_3878;
	public static Class124 aClass124_3892 = Class124.method263("cookieprefix");
	
}
