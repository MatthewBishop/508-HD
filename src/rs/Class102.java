/* Class102 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;

import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Static;

public class Class102 {
	public static int anInt1702;
	public long aLong1706;
	public static boolean aBoolean1707;
	public static int anInt1709;
	public static Class124 aClass124_1710 = Class14_Sub2_Sub2.method263(1178, "Stufe)2");
	public boolean aBoolean1711;
	public static Class9_Sub1 aClass9_Sub1_1712;
	public long aLong1713;
	public int[] anIntArray1715;
	public static int anInt1717;
	public int anInt1720;
	public int[] anIntArray1722;
	public static int cameraTileZ;

	static {
		anInt1709 = 0;
		anInt1717 = 0;
	}

	public Class133_Sub7 method1516(Animation animation, int i, int i_0_, int i_1_, Animation class46_2_) {
		if (i_0_ != -13) {
			Class133_Sub7 class133_sub7 = null;
			return class133_sub7;
		}
		if (anInt1720 != -1) {
			Class133_Sub7 class133_sub7 = Class126.method1744(anInt1720, 170).method209(i, i_1_, class46_2_, animation,
					-110);
			return class133_sub7;
		}
		long l = aLong1713;
		int[] is = anIntArray1715;
		if (class46_2_ != null && (class46_2_.anInt771 >= 0 || class46_2_.playerMainhand >= 0)) {
			is = new int[12];
			for (int i_3_ = 0; i_3_ < 12; i_3_++)
				is[i_3_] = anIntArray1715[i_3_];
			if (class46_2_.anInt771 >= 0) {
				if (class46_2_.anInt771 == 65535) {
					is[5] = 0;
					l ^= ~0xffffffffL;
				} else {
					is[5] = Class66.method1294(1073741824, class46_2_.anInt771);
					l ^= (long) is[5] << 32;
				}
			}
			if (class46_2_.playerMainhand >= 0) {
				if (class46_2_.playerMainhand == 65535) {
					is[3] = 0;
					l ^= 0xffffffffL;
				} else {
					is[3] = Class66.method1294(1073741824, class46_2_.playerMainhand);
					l ^= (long) is[3];
				}
			}
		}
		Class133_Sub7 class133_sub7 = (Class133_Sub7) Class36.aClass52_621.get(l);
		if (class133_sub7 == null) {
			boolean bool = false;
			for (int i_4_ = 0; i_4_ < 12; i_4_++) {
				int i_5_ = is[i_4_];
				if ((i_5_ & 0x40000000) == 0) {
					if ((i_5_ & ~0x7fffffff) != 0 && !Applet_Sub1.method27(i_5_ & 0x3fffffff, -4).method982(false))
						bool = true;
				} else if (!Class14_Sub8_Sub24.method605(89, i_5_ & 0x3fffffff).method1964(aBoolean1711, (byte) -72))
					bool = true;
			}
			if (bool) {
				if (aLong1706 != -1L)
					class133_sub7 = ((Class133_Sub7) Class36.aClass52_621.get(aLong1706));
				if (class133_sub7 == null) {
					Class133_Sub7 class133_sub7_6_ = null;
					return class133_sub7_6_;
				}
			}
			if (class133_sub7 == null) {
				Class133_Sub2[] class133_sub2s = new Class133_Sub2[12];
				int i_7_ = 0;
				for (int i_8_ = 0; i_8_ < 12; i_8_++) {
					int i_9_ = is[i_8_];
					if ((i_9_ & 0x40000000) == 0) {
						if ((i_9_ & ~0x7fffffff) != 0) {
							Class133_Sub2 class133_sub2 = Applet_Sub1.method27(i_9_ & 0x3fffffff, -4)
									.method981((byte) -47);
							if (class133_sub2 != null)
								class133_sub2s[i_7_++] = class133_sub2;
						}
					} else {
						Class133_Sub2 class133_sub2 = Class14_Sub8_Sub24.method605(98, i_9_ & 0x3fffffff)
								.method1965(i_0_ + 52, aBoolean1711);
						if (class133_sub2 != null)
							class133_sub2s[i_7_++] = class133_sub2;
					}
				}
				int i_10_ = is[0];
				if ((i_10_ & 0x40000000) != 0) {
					Class142 class142 = Class14_Sub8_Sub24.method605(100, i_10_ & 0x3fffffff);
					if (class142.anIntArrayArray2289 != null) {
						for (int i_11_ = 0; class142.anIntArrayArray2289.length > i_11_; i_11_++) {
							if (class142.anIntArrayArray2289[i_11_] != null && class133_sub2s[i_11_ + 1] != null) {
								int i_12_ = class142.anIntArrayArray2289[i_11_][0];
								int i_13_ = class142.anIntArrayArray2289[i_11_][1];
								int i_14_ = class142.anIntArrayArray2289[i_11_][4];
								int i_15_ = class142.anIntArrayArray2289[i_11_][2];
								int i_16_ = class142.anIntArrayArray2289[i_11_][3];
								int i_17_ = class142.anIntArrayArray2289[i_11_][5];
								class133_sub2s[i_11_ + 1].method1825(i_12_, i_13_, i_15_);
								class133_sub2s[i_11_ + 1].method1817(i_16_, i_14_, i_17_);
							}
						}
					}
				}
				Class133_Sub2 class133_sub2 = new Class133_Sub2(class133_sub2s, i_7_);
				for (int i_18_ = 0; i_18_ < 5; i_18_++) {
					if (Class14_Sub8_Sub24.aShortArrayArray4496[i_18_].length > anIntArray1722[i_18_])
						class133_sub2.method1813(Class53.aShortArray866[i_18_],
								(Class14_Sub8_Sub24.aShortArrayArray4496[i_18_][anIntArray1722[i_18_]]));
					if (anIntArray1722[i_18_] < Static.aShortArrayArray98[i_18_].length)
						class133_sub2.method1813(Class24.aShortArray471[i_18_],
								(Static.aShortArrayArray98[i_18_][anIntArray1722[i_18_]]));
				}
				class133_sub7 = class133_sub2.method1827(64, 850, -30, -50, -30);
				((ModelHD) class133_sub7).method1895(false, false, true, true, false, false, true);
				Class36.aClass52_621.put(class133_sub7, l);
				aLong1706 = l;
			}
		}
		Class133_Sub7 class133_sub7_19_;
		if (class46_2_ != null || animation != null) {
			if (class46_2_ != null && animation != null)
				class133_sub7_19_ = class46_2_.method1178(i, (byte) 46, i_1_, class133_sub7, animation);
			else if (class46_2_ == null)
				class133_sub7_19_ = animation.method1168((byte) 123, i, class133_sub7);
			else
				class133_sub7_19_ = class46_2_.method1168((byte) 120, i_1_, class133_sub7);
		} else
			return class133_sub7;
		Class133_Sub7 class133_sub7_20_ = class133_sub7_19_;
		return class133_sub7_20_;
	}

	public void method1517(boolean bool) {
		long l = aLong1713;
		aLong1713 = -1L;
		long[] ls = Class60.aLongArray967;
		for (int i = 0; i < 12; i++) {
			aLong1713 = aLong1713 >>> 8 ^ ls[(int) (((long) (anIntArray1715[i] >> 56) ^ aLong1713) & 0xffL)];
			aLong1713 = aLong1713 >>> 8 ^ ls[(int) (((long) (anIntArray1715[i] >> 16) ^ aLong1713) & 0xffL)];
			aLong1713 = (aLong1713 >>> 8 ^ ls[(int) ((aLong1713 ^ (long) (anIntArray1715[i] >> 40)) & 0xffL)]);
			aLong1713 = aLong1713 >>> 8 ^ ls[(int) (((long) anIntArray1715[i] ^ aLong1713) & 0xffL)];
		}
		if (bool)
			anIntArray1722 = null;
		for (int i = 0; i < 5; i++)
			aLong1713 = aLong1713 >>> 8 ^ ls[(int) ((aLong1713 ^ (long) anIntArray1722[i]) & 0xffL)];
		aLong1713 = aLong1713 >>> 8 ^ ls[(int) (((long) (aBoolean1711 ? 1 : 0) ^ aLong1713) & 0xffL)];
		if (l != 0L && l != aLong1713)
			Class36.aClass52_621.remove(l);
	}

	public void method1518(int i, int i_21_, int i_22_) {
		int i_23_ = client.anIntArray2644[i];
		if (anIntArray1715[i_23_] != 0 && Applet_Sub1.method27(i_21_, -4) != null) {
			anIntArray1715[i_23_] = Class66.method1294(-2147483648, i_21_);
			if (i_22_ <= 112)
				method1526(true, 116, 35);
			method1517(false);
		}
	}

	public void method1519(boolean bool, boolean bool_24_) {
		aBoolean1711 = bool;
		method1517(bool_24_);
	}

	public int method1520(int i) {
		if (i != 1073741824)
			aLong1706 = 5L;
		if (anInt1720 == -1) {
			int i_25_ = ((anIntArray1715[11] << 5) + (anIntArray1715[0] << 15) + (anIntArray1722[0] << 57)
					- (-(anIntArray1722[4] << 52) - (anIntArray1715[8] << 42) - anIntArray1715[1]));
			return i_25_;
		}
		int i_26_ = (Class126.method1744(anInt1720, i ^ 0x400000aa).anInt337 + 305419896);
		return i_26_;
	}

	public Class133_Sub7 method1521(Animation animation, int i, int i_27_) {
		if (i != 1073741823)
			method1516(null, 5, -39, 66, null);
		if (anInt1720 != -1) {
			Class133_Sub7 class133_sub7 = Class126.method1744(anInt1720, 170).method224((byte) -113, animation, i_27_);
			return class133_sub7;
		}
		Class133_Sub7 class133_sub7 = ((Class133_Sub7) Class70.aClass52_1079.get(aLong1713));
		if (class133_sub7 == null) {
			boolean bool = false;
			for (int i_28_ = 0; i_28_ < 12; i_28_++) {
				int i_29_ = anIntArray1715[i_28_];
				if ((i_29_ & 0x40000000) != 0) {
					if (!Class14_Sub8_Sub24.method605(i - 1073741729, i_29_ & 0x3fffffff).method1975(0, aBoolean1711))
						bool = true;
				} else if ((i_29_ & ~0x7fffffff) != 0 && !Applet_Sub1.method27(i_29_ & 0x3fffffff, -4).method983(false))
					bool = true;
			}
			if (bool) {
				Class133_Sub7 class133_sub7_30_ = null;
				return class133_sub7_30_;
			}
			int i_31_ = 0;
			Class133_Sub2[] class133_sub2s = new Class133_Sub2[12];
			for (int i_32_ = 0; i_32_ < 12; i_32_++) {
				int i_33_ = anIntArray1715[i_32_];
				if ((i_33_ & 0x40000000) != 0) {
					Class133_Sub2 class133_sub2 = Class14_Sub8_Sub24.method605(i ^ 0x3fffffa8, i_33_ & 0x3fffffff)
							.method1973(-107, aBoolean1711);
					if (class133_sub2 != null)
						class133_sub2s[i_31_++] = class133_sub2;
				} else if ((i_33_ & ~0x7fffffff) != 0) {
					Class133_Sub2 class133_sub2 = Applet_Sub1.method27(i_33_ & 0x3fffffff, i ^ ~0x3ffffffc)
							.method977((byte) 61);
					if (class133_sub2 != null)
						class133_sub2s[i_31_++] = class133_sub2;
				}
			}
			Class133_Sub2 class133_sub2 = new Class133_Sub2(class133_sub2s, i_31_);
			for (int i_34_ = 0; i_34_ < 5; i_34_++) {
				if (anIntArray1722[i_34_] < Class14_Sub8_Sub24.aShortArrayArray4496[i_34_].length)
					class133_sub2.method1813(Class53.aShortArray866[i_34_],
							(Class14_Sub8_Sub24.aShortArrayArray4496[i_34_][anIntArray1722[i_34_]]));
				if (anIntArray1722[i_34_] < Static.aShortArrayArray98[i_34_].length)
					class133_sub2.method1813(Class24.aShortArray471[i_34_],
							(Static.aShortArrayArray98[i_34_][anIntArray1722[i_34_]]));
			}
			class133_sub7 = class133_sub2.method1827(64, 768, -50, -10, -50);
			Class70.aClass52_1079.put(class133_sub7, aLong1713);
		}
		if (animation != null)
			class133_sub7 = animation.method1167(i_27_, 65535, class133_sub7);
		return class133_sub7;
	}

	public void method1522(int[] is, int i, boolean bool, int[] is_35_, int i_36_) {
		if (is == null) {
			is = new int[12];
			for (int i_37_ = 0; i_37_ < 7; i_37_++) {
				for (int i_38_ = 0; Class38.anInt2617 > i_38_; i_38_++) {
					Class21 class21 = Applet_Sub1.method27(i_38_, -4);
					if (class21 != null && !class21.aBoolean449 && (bool ? 7 : 0) + i_37_ == class21.anInt446) {
						is[client.anIntArray2644[i_37_]] = Class66.method1294(i_38_, -2147483648);
						break;
					}
				}
			}
		}
		anIntArray1715 = is;
		anInt1720 = i;
		aBoolean1711 = bool;
		anIntArray1722 = is_35_;
		method1517(false);
	}

	public static int method1523(int i, int i_40_) {
		if (i >= 65 && i <= 90 || i >= 192 && i <= 222 && i != 215) {
			int i_41_ = i + 32;
			return i_41_;
		}
		if (i == 159) {
			int i_42_ = 255;
			return i_42_;
		}
		if (i_40_ != 6427)
			method1523(-60, 113);
		if (i == 140) {
			int i_43_ = 156;
			return i_43_;
		}
		int i_44_ = i;
		return i_44_;
	}

	public Class133_Sub7 method1524(int i, int i_45_, int i_46_, Animation animation, int i_47_) {
		long l = (long) i << 32 | (long) (i_46_ << 16) | (long) i;
		if (i_47_ < 46) {
			Class133_Sub7 class133_sub7 = null;
			return class133_sub7;
		}
		Class133_Sub7 class133_sub7 = (Class133_Sub7) Class70.aClass52_1079.get(l);
		if (class133_sub7 == null) {
			Class133_Sub2[] class133_sub2s = new Class133_Sub2[2];
			int i_48_ = 0;
			if (Applet_Sub1.method27(i, -4).method983(false) && Applet_Sub1.method27(i_46_, -4).method983(false)) {
				Class133_Sub2 class133_sub2 = Applet_Sub1.method27(i, -4).method977((byte) 61);
				if (class133_sub2 != null)
					class133_sub2s[i_48_++] = class133_sub2;
				class133_sub2 = Applet_Sub1.method27(i_46_, -4).method977((byte) 61);
				if (class133_sub2 != null)
					class133_sub2s[i_48_++] = class133_sub2;
				class133_sub2 = new Class133_Sub2(class133_sub2s, i_48_);
				for (int i_49_ = 0; i_49_ < 5; i_49_++) {
					if (Class14_Sub8_Sub24.aShortArrayArray4496[i_49_].length > anIntArray1722[i_49_])
						class133_sub2.method1813(Class53.aShortArray866[i_49_],
								(Class14_Sub8_Sub24.aShortArrayArray4496[i_49_][anIntArray1722[i_49_]]));
					if (Static.aShortArrayArray98[i_49_].length > anIntArray1722[i_49_])
						class133_sub2.method1813(Class24.aShortArray471[i_49_],
								(Static.aShortArrayArray98[i_49_][anIntArray1722[i_49_]]));
				}
				class133_sub7 = class133_sub2.method1827(64, 768, -50, -10, -50);
				Class70.aClass52_1079.put(class133_sub7, l);
			} else {
				Class133_Sub7 class133_sub7_50_ = null;
				return class133_sub7_50_;
			}
		}
		if (animation != null)
			class133_sub7 = animation.method1167(i_45_, 65535, class133_sub7);
		Class133_Sub7 class133_sub7_51_ = class133_sub7;
		return class133_sub7_51_;
	}

	public static void method1525(int i) {
		aClass9_Sub1_1712 = null;
		aClass124_1710 = null;
		int i_52_ = 103 % ((i - 67) / 47);
	}

	public void method1526(boolean bool, int i, int i_53_) {
		anIntArray1722[i_53_] = i;
		method1517(bool);
	}
}
