/* Class133_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.rt4.CardMemManager;
import com.jagex.rt4.AbstractSprite;

public abstract class Class133_Sub1 extends Class133 {
	public int anInt3431;
	public int anInt3432;
	public int anInt3433;
	public static Class45[] aClass45Array3435;
	public int anInt3436;
	public int anInt3437;
	public int anInt3438;
	public int anInt3439 = 0;
	public int[] anIntArray3442;
	public int[] anIntArray3443;
	public int anInt3444;
	public int anInt3445;
	public int anInt3447;
	public int anInt3449;
	public int anInt3450;
	public int anInt3451;
	public int anInt3452;
	public int anInt3453;
	public int anInt3454 = -1;
	public int anInt3455;
	public int anInt3456;
	public int anInt3457;
	public int anInt3458 = 0;
	public int anInt3459;
	public int anInt3461;
	public Class124 aClass124_3462;
	public int anInt3463;
	public boolean[] aBooleanArray3465;
	public int anInt3466;
	public int anInt3467;
	public int anInt3469;
	public int anInt3470;
	public int anInt3471;
	public int anInt3472;
	public int anInt3473;
	public int anInt3475;
	public int[] anIntArray3476;
	public int anInt3477;
	public int anInt3478;
	public int anInt3479;
	public int anInt3480;
	public int anInt3482;
	public int anInt3483;
	public int anInt3484;
	public int anInt3485;
	public int[] anIntArray3486;
	public int anInt3487;
	public boolean aBoolean3488;
	public int anInt3489;
	public static int anInt3490;
	public int anInt3492;
	public int anInt3493;
	public int anInt3494;
	public int anInt3495;
	public int[] anIntArray3496;
	public int anInt3498;
	public int anInt3500;
	public int anInt3501;
	public static Class124 aClass124_3502 = Class124.method263(1178, "; version=1; path=)4; domain=");
	public int anInt3504;
	public static AbstractSprite aClass14_Sub2_Sub19_3505;

	public static void method1793(Class9 class9, int i) {
		if (i == 14555)
			Class14_Sub17.aClass9_3034 = class9;
	}

	public void method1794(boolean bool) {
		if (!bool) {
			anInt3477 = 0;
			anInt3498 = 0;
		}
	}

	public int method1795(int i) {
		if (i != 12806)
			anInt3480 = -28;
		if (anInt3449 == -32768) {
			int i_0_ = 200;
			return i_0_;
		}
		int i_1_ = -anInt3449;
		return i_1_;
	}

	public static void method1796(byte i, Class43 class43, int i_2_, Buffer class14_sub10) {
		Class14_Sub7 class14_sub7 = new Class14_Sub7();
		class14_sub7.anInt2821 = class14_sub10.readUByte();
		class14_sub7.anInt2830 = class14_sub10.getInt((byte) -112);
		class14_sub7.aClass31Array2824 = new Class31[class14_sub7.anInt2821];
		class14_sub7.aClass31Array2828 = new Class31[class14_sub7.anInt2821];
		class14_sub7.anIntArray2820 = new int[class14_sub7.anInt2821];
		class14_sub7.anIntArray2819 = new int[class14_sub7.anInt2821];
		class14_sub7.aByteArrayArrayArray2823 = new byte[class14_sub7.anInt2821][][];
		class14_sub7.anIntArray2825 = new int[class14_sub7.anInt2821];
		for (int i_3_ = 0; i_3_ < class14_sub7.anInt2821; i_3_++) {
			try {
				int i_4_ = class14_sub10.readUByte();
				if (i_4_ == 0 || i_4_ == 1 || i_4_ == 2) {
					String string = new String(class14_sub10.method797(i ^ 0x24e3).method1681(86));
					int i_5_ = 0;
					String string_6_ = new String(class14_sub10.method797(9467).method1681(-126));
					if (i_4_ == 1)
						i_5_ = class14_sub10.getInt((byte) -107);
					class14_sub7.anIntArray2825[i_3_] = i_4_;
					class14_sub7.anIntArray2819[i_3_] = i_5_;
					class14_sub7.aClass31Array2828[i_3_] = class43.method1140(123,
							Class14_Sub9_Sub1.method711(string, 45), string_6_);
				} else if (i_4_ == 3 || i_4_ == 4) {
					String string = new String(class14_sub10.method797(9467).method1681(-114));
					String string_7_ = new String(class14_sub10.method797(9467).method1681(i + 91));
					int i_8_ = class14_sub10.readUByte();
					String[] strings = new String[i_8_];
					for (int i_9_ = 0; i_8_ > i_9_; i_9_++)
						strings[i_9_] = new String(class14_sub10.method797(i + 9443).method1681(33));
					byte[][] is = new byte[i_8_][];
					if (i_4_ == 3) {
						for (int i_10_ = 0; i_8_ > i_10_; i_10_++) {
							int i_11_ = class14_sub10.getInt((byte) -111);
							is[i_10_] = new byte[i_11_];
							class14_sub10.method824(i_11_, (byte) 97, 0, is[i_10_]);
						}
					}
					class14_sub7.anIntArray2825[i_3_] = i_4_;
					Class[] var_classes = new Class[i_8_];
					for (int i_12_ = 0; i_8_ > i_12_; i_12_++)
						var_classes[i_12_] = (Class14_Sub9_Sub1.method711(strings[i_12_], Canvas_Sub2.method69(i, 58)));
					class14_sub7.aClass31Array2824[i_3_] = class43.method1149(string_7_, var_classes,
							Class14_Sub9_Sub1.method711(string, 100), -109);
					class14_sub7.aByteArrayArrayArray2823[i_3_] = is;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				class14_sub7.anIntArray2820[i_3_] = -1;
			} catch (SecurityException securityexception) {
				class14_sub7.anIntArray2820[i_3_] = -2;
			} catch (NullPointerException nullpointerexception) {
				class14_sub7.anIntArray2820[i_3_] = -3;
			} catch (Exception exception) {
				class14_sub7.anIntArray2820[i_3_] = -4;
			} catch (Throwable throwable) {
				class14_sub7.anIntArray2820[i_3_] = -5;
			}
		}
		if (i != 24)
			aClass45Array3435 = null;
		Class40.aClass2_664.pushBack(class14_sub7);
	}

	public static void method1797(int i) {
		if (i >= 75) {
			aClass124_3502 = null;
			aClass14_Sub2_Sub19_3505 = null;
			aClass45Array3435 = null;
		}
	}

	public static void method1798(Class124 class124, byte i) {
		if (Class152.anInt2439 >= 2) {
			if (class124.method1717(40, Class90.aClass124_1425)) {
				Class88.method1435((byte) 126);
				for (int i_13_ = 0; i_13_ < 10; i_13_++)
					System.gc();
				Runtime runtime = Runtime.getRuntime();
				int i_14_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
				Class15.method943((JunkTex.method515((new Class124[] { JunkTex.aClass124_4362,
						Class83.method1407(120, i_14_), Class59.aClass124_953 }), (byte) -82)), false, null, 0);
			}
			if (class124.method1717(i + 33, Static2.aClass124_2575)) {
				System.out.println(new StringBuilder("oncard_geometry:").append(CardMemManager.arbBufferMemory).toString());
				System.out.println(new StringBuilder("oncard_2d:").append(CardMemManager.memory2d).toString());
				System.out.println(new StringBuilder("oncard_texture:").append(CardMemManager.textureMemory).toString());
			}
			if (class124.method1717(40, Static2.aClass124_661))
				Static2.method1508((byte) 90);
			if (class124.method1717(40, Class44.aClass124_728))
				Static2.method1743(i + 27245, 25);
			if (class124.method1717(i + 33, Class142.aClass124_2321))
				Class133_Sub6.aBoolean3663 = true;
			if (class124.method1717(40, Class109.aClass124_1839))
				Class133_Sub6.aBoolean3663 = false;
			if (class124.method1717(40, Static2.aClass124_2380)) {
				for (int i_15_ = 0; i_15_ < 4; i_15_++) {
					for (int i_16_ = 1; i_16_ < 103; i_16_++) {
						for (int i_17_ = 1; i_17_ < 103; i_17_++)
							Class14_Sub21.aClass32Array3100[i_15_].anIntArrayArray546[i_16_][i_17_] = 0;
					}
				}
			}
			if (class124.method1690(JunkTex.aClass124_4561, 33) && Class7.anInt182 != 0)
				Applet_Sub1.method30(-104, class124.method1696(6, i ^ 0x8).stringToBase10(82));
			if (class124.method1717(40, Class58.aClass124_941) && Class7.anInt182 == 2)
				throw new RuntimeException();
			if (class124.method1690(Class45.aClass124_750, 33)) {
				Class124.anInt2494 = class124.method1696(12, 15).method1684((byte) 9).stringToBase10(124);
				Class15.method943((JunkTex.method515(
						(new Class124[] { Static2.aClass124_474, Class83.method1407(108, (Class124.anInt2494)) }),
						(byte) -53)), false, null, 0);
			}
			if (class124.method1717(40, Class120.aClass124_2012))
				JunkTex.aBoolean3392 = true;
			if (class124.method1704(JunkTex.aClass124_4676, (byte) 58)) {
				if (JunkTex.aFrame3962 != null)
					Class14_Sub2_Sub20.method428(124);
				else
					Class133_Sub6.method1854(1024, 768, 39);
			}
		}
		if (i != 7)
			aClass45Array3435 = null;
		JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(107);
		JunkTex.aClass14_Sub10_Sub1_891.writeByte(class124.length(0) - 1);
		JunkTex.aClass14_Sub10_Sub1_891.method814(32768, class124.method1696(2, 15));
	}

	public void method1799(boolean bool, byte i, int i_18_) {
		int i_19_ = anIntArray3443[0];
		int i_20_ = anIntArray3476[0];
		if (i_18_ == 0) {
			i_19_++;
			i_20_--;
		}
		if (anInt3445 != -1 && JunkTex.method1129(anInt3445, 105).walkingPrecedence == 1)
			anInt3445 = -1;
		int i_21_ = -122 % ((i - 18) / 56);
		if (anInt3498 < 9)
			anInt3498++;
		if (i_18_ == 1)
			i_19_++;
		if (i_18_ == 2) {
			i_20_++;
			i_19_++;
		}
		for (int i_22_ = anInt3498; i_22_ > 0; i_22_--) {
			anIntArray3476[i_22_] = anIntArray3476[i_22_ - 1];
			anIntArray3443[i_22_] = anIntArray3443[i_22_ - 1];
			aBooleanArray3465[i_22_] = aBooleanArray3465[i_22_ - 1];
		}
		aBooleanArray3465[0] = bool;
		if (i_18_ == 3)
			i_20_--;
		if (i_18_ == 4)
			i_20_++;
		if (i_18_ == 5) {
			i_19_--;
			i_20_--;
		}
		if (i_18_ == 6)
			i_19_--;
		if (i_18_ == 7) {
			i_20_++;
			i_19_--;
		}
		anIntArray3476[0] = i_20_;
		anIntArray3443[0] = i_19_;
	}

	public void method1800(byte i, int i_23_, boolean bool, int i_24_) {
		if (anInt3445 != -1 && JunkTex.method1129(anInt3445, -128).walkingPrecedence == 1)
			anInt3445 = -1;
		if (!bool) {
			int i_25_ = i_24_ - anIntArray3476[0];
			int i_26_ = -anIntArray3443[0] + i_23_;
			if (i_25_ >= -8 && i_25_ <= 8 && i_26_ >= -8 && i_26_ <= 8) {
				if (anInt3498 < 9)
					anInt3498++;
				for (int i_27_ = anInt3498; i_27_ > 0; i_27_--) {
					anIntArray3476[i_27_] = anIntArray3476[i_27_ - 1];
					anIntArray3443[i_27_] = anIntArray3443[i_27_ - 1];
					aBooleanArray3465[i_27_] = aBooleanArray3465[i_27_ - 1];
				}
				anIntArray3476[0] = i_24_;
				aBooleanArray3465[0] = false;
				anIntArray3443[0] = i_23_;
				return;
			}
		}
		anInt3498 = 0;
		anInt3477 = 0;
		anIntArray3476[0] = i_24_;
		anIntArray3443[0] = i_23_;
		anInt3495 = anInt3493 * 64 + anIntArray3476[0] * 128;
		anInt3436 = anInt3493 * 64 + anIntArray3443[0] * 128;
		if (i >= -68)
			anInt3484 = 111;
		anInt3437 = 0;
		if (this == Class14_Sub3.aClass133_Sub1_Sub1_2748)
			Class14_Sub13.method858(-1);
	}

	public void method1801(int i, int i_28_, int i_29_, int i_30_) {
		for (int i_31_ = i; i_31_ < 4; i_31_++) {
			if (i_29_ >= anIntArray3442[i_31_]) {
				anIntArray3486[i_31_] = i_30_;
				anIntArray3496[i_31_] = i_28_;
				anIntArray3442[i_31_] = i_29_ + 70;
				break;
			}
		}
	}

	public static void method1803(Class133 class133, int i, int i_38_, int i_39_, int i_40_, int i_41_) {
		boolean bool = true;
		int i_42_ = i_38_;
		int i_43_ = i_38_ + i_40_;
		int i_44_ = i_39_ - 1;
		int i_45_ = i_39_ + i_41_;
		for (int i_46_ = i; i_46_ <= i + 1; i_46_++) {
			if (i_46_ != Class83.anInt1338) {
				for (int i_47_ = i_42_; i_47_ <= i_43_; i_47_++) {
					if (i_47_ >= 0 && i_47_ < Static2.anInt3338) {
						for (int i_48_ = i_44_; i_48_ <= i_45_; i_48_++) {
							if (i_48_ >= 0 && i_48_ < JunkTex.anInt4337
									&& (!bool || i_47_ >= i_43_ || i_48_ >= i_45_ || i_48_ < i_39_ && i_47_ != i_38_)) {
								Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i_46_][i_47_][i_48_]);
								if (class14_sub29 != null) {
									int i_49_ = (((Static2.tileHeights[i_46_][i_47_][i_48_])
											+ (Static2.tileHeights[i_46_][i_47_ + 1][i_48_])
											+ (Static2.tileHeights[i_46_][i_47_][i_48_ + 1])
											+ (Static2.tileHeights[i_46_][i_47_ + 1][i_48_ + 1])) / 4
											- ((Static2.tileHeights[i][i_38_][i_39_])
													+ (Static2.tileHeights[i][i_38_ + 1][i_39_])
													+ (Static2.tileHeights[i][i_38_][i_39_ + 1])
													+ (Static2.tileHeights[i][i_38_ + 1][i_39_ + 1])) / 4);
									Class113 class113 = class14_sub29.aClass113_3250;
									if (class113 != null) {
										if (class113.aClass133_1877.method1784())
											class133.method1788(class113.aClass133_1877,
													((i_47_ - i_38_) * 128 + (1 - i_40_) * 64), i_49_,
													((i_48_ - i_39_) * 128 + (1 - i_41_) * 64), bool);
										if (class113.aClass133_1884 != null && class113.aClass133_1884.method1784())
											class133.method1788(class113.aClass133_1884,
													((i_47_ - i_38_) * 128 + (1 - i_40_) * 64), i_49_,
													((i_48_ - i_39_) * 128 + (1 - i_41_) * 64), bool);
									}
									for (int i_50_ = 0; i_50_ < class14_sub29.anInt3242; i_50_++) {
										Class40 class40 = (class14_sub29.aClass40Array3257[i_50_]);
										if (class40 != null && class40.aClass133_679.method1784()
												&& (i_47_ == class40.anInt668 || i_47_ == i_42_)
												&& (i_48_ == class40.anInt678 || i_48_ == i_44_)) {
											int i_51_ = (class40.anInt670 - class40.anInt668 + 1);
											int i_52_ = (class40.anInt669 - class40.anInt678 + 1);
											class133.method1788(class40.aClass133_679,
													(((class40.anInt668 - i_38_) * 128) + (i_51_ - i_40_) * 64), i_49_,
													(((class40.anInt678 - i_39_) * 128) + (i_52_ - i_41_) * 64), bool);
										}
									}
								}
							}
						}
					}
				}
				i_42_--;
				bool = false;
			}
		}
	}

	public boolean method1804(byte i) {
		if (i != 115) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public Class133_Sub1() {
		anInt3456 = -1;
		anInt3459 = 0;
		anInt3437 = 0;
		anInt3449 = -32768;
		anIntArray3443 = new int[10];
		anInt3452 = -1;
		anInt3453 = -1;
		anIntArray3442 = new int[4];
		aBooleanArray3465 = new boolean[10];
		anInt3432 = -1;
		anInt3431 = 0;
		anInt3470 = 0;
		aClass124_3462 = null;
		anIntArray3476 = new int[10];
		anInt3466 = 0;
		anInt3463 = -1;
		anInt3473 = 100;
		anInt3477 = 0;
		anInt3480 = 0;
		anInt3445 = -1;
		anInt3457 = -1;
		anInt3450 = -1000;
		anInt3483 = 0;
		aBoolean3488 = false;
		anInt3487 = -1;
		anIntArray3486 = new int[4];
		anInt3484 = -1;
		anInt3447 = 0;
		anInt3471 = -1;
		anInt3493 = 1;
		anInt3492 = 32;
		anInt3479 = 0;
		anIntArray3496 = new int[4];
		anInt3482 = 0;
		anInt3433 = -1;
		anInt3498 = 0;
		anInt3467 = 0;
		anInt3501 = 0;
		anInt3504 = 0;
	}
}
