/* Class14_Sub8_Sub28 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Deque;

import rs.Class103;
import rs.Class112;
import rs.Class114;
import rs.Class117;
import rs.Class124;
import rs.Class125;
import rs.Class125_Sub1;
import rs.Class126;
import rs.Class128;
import rs.Class131;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub3;
import rs.Class133_Sub5;
import rs.Class138;
import rs.Class139;
import rs.Class142;
import rs.Class149;
import rs.Class14_Sub11;
import rs.Class14_Sub14;
import rs.Class14_Sub15;
import rs.Class14_Sub20;
import rs.Class14_Sub21;
import rs.Class14_Sub25;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub11;
import rs.Class14_Sub2_Sub13;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub4;
import rs.Class14_Sub3;
import rs.Class14_Sub30;
import rs.Class14_Sub4;
import rs.Class14_Sub6;
import rs.Class15;
import rs.Class150;
import rs.Class17;
import rs.Class38;
import rs.Class40;
import rs.Class42;
import rs.Class45;
import rs.Class49;
import rs.Class51;
import rs.Class58;
import rs.Class66;
import rs.Class7;
import rs.Class70;
import rs.Class76;
import rs.Class79;
import rs.Class7_Sub3;
import rs.Class83;
import rs.Class9;
import rs.Class94;
import rs.Class97;
import rs.RuntimeException_Sub1;
import rs.Static2;

public class Class14_Sub8_Sub28 extends Class14_Sub8 {
	public static byte[][] aByteArrayArray4556;
	public static Class124 aClass124_4561 = Class14_Sub2_Sub2.method263(1178, "::fps ");
	public static Class76 aClass76_4569;
	public static Class9 aClass9_4570;
	public static int anInt4560 = 1;
	public static short aShort4568 = 205;
	public static boolean method625(int i) {
		int i_0_ = 32 % ((-69 - i) / 42);
		do {
			if (Static2.anInt3352 != 0) {
				boolean bool;
				try {
					bool = !((Boolean) (Static.aClass124_844.method1666(Class14_Sub8_Sub34.aClass43_4647.anApplet712,
							false))).booleanValue();
				} catch (Throwable throwable) {
					Throwable throwable_1_ = new Throwable();
					break;
				}
				return bool;
			}
		} while (false);
		return true;
	}
	public static Class14_Sub2_Sub13 method626(int i, int i_2_, int i_3_) {
		if (i >= -101) {
			Class14_Sub2_Sub13 class14_sub2_sub13 = null;
			return class14_sub2_sub13;
		}
		Class14_Sub2_Sub13 class14_sub2_sub13 = ((Class14_Sub2_Sub13) Static2.aClass55_4048
				.get((long) i_3_ << 32 | (long) i_2_));
		if (class14_sub2_sub13 == null) {
			class14_sub2_sub13 = new Class14_Sub2_Sub13(i_3_, i_2_);
			Static2.aClass55_4048.put(class14_sub2_sub13.key, class14_sub2_sub13);
		}
		Class14_Sub2_Sub13 class14_sub2_sub13_4_ = class14_sub2_sub13;
		return class14_sub2_sub13_4_;
	}
	public static void method627(boolean bool) {
		if (bool) {
			Class114.tileHeights = Class150.anIntArrayArrayArray2419;
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368 = Class40.aClass14_Sub29ArrayArrayArray674;
			RuntimeException_Sub1.aClass14_Sub27ArrayArray2464 = Class131.aClass14_Sub27ArrayArray2162;
		} else {
			Class114.tileHeights = Class149.anIntArrayArrayArray2391;
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368 = Class14_Sub14.aClass14_Sub29ArrayArrayArray2987;
			RuntimeException_Sub1.aClass14_Sub27ArrayArray2464 = Class14_Sub30.aClass14_Sub27ArrayArray3273;
		}
		Class83.anInt1338 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368.length;
	}
	public static void method628(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_) {
		if (Class51.anInt831 == 0 && !Class14_Sub4.aBoolean2784) {
			int i_10_ = Static.anInt425;
			int i_11_ = Class14_Sub8_Sub27.anInt4547;
			int i_12_ = Class58.anInt948;
			int i_13_ = (i_11_ - i_10_) * (-i_6_ + i) / i_8_ + i_10_;
			int i_14_ = Class70.anInt1081;
			int i_15_ = i_12_ + (-i_12_ + i_14_) * (-i_7_ + i_5_) / i_9_;
			Class14_Sub11.method853(32, Class7.aClass124_174, i_15_, Class14_Sub8_Sub9.aClass124_4244, (short) 8, 0L,
					i_13_);
		}
		if (!bool)
			method630(-27, -49L);
		long l = -1L;
		for (int i_16_ = 0; i_16_ < Class14_Sub15.anInt2996; i_16_++) {
			long l_17_ = Class7_Sub3.aLongArray2685[i_16_];
			int i_18_ = (int) l_17_ & 0x7f;
			int i_19_ = ((int) l_17_ & 0x3fb3) >> 39;
			int i_20_ = (int) l_17_ >> 29 & 0x3;
			int i_21_ = (int) (l_17_ >>> 32) & 0x7fffffff;
			if (l_17_ != l) {
				l = l_17_;
				if (i_20_ == 2 && Class139.method1952(Class14_Sub2_Sub3.anInt3785, i_18_, i_19_, l_17_)) {
					Class79 class79 = Class79.method1377((byte) -106, i_21_);
					if (class79.anIntArray1276 != null)
						class79 = class79.method1391(1);
					if (class79 == null)
						continue;
					if (Class51.anInt831 != 1) {
						if (Class14_Sub4.aBoolean2784) {
							if ((Static.anInt101 & 0x4) == 4)
								Class14_Sub11.method853(32, Class125.aClass124_2082, i_19_,
										(Class14_Sub8_Sub7.method515((new Class124[] { Class17.aClass124_408,
												Static2.aClass124_360, class79.aClass124_1290 }), (byte) -106)),
										(short) 23, l_17_, i_18_);
						} else {
							Class124[] class124s = class79.aClass124Array1282;
							if (Class49.aBoolean814)
								class124s = Static2.method1545(5, class124s);
							if (class124s != null) {
								for (int i_22_ = 4; i_22_ >= 0; i_22_--) {
									if (class124s[i_22_] != null) {
										short i_23_ = 0;
										if (i_22_ == 0)
											i_23_ = (short) 39;
										if (i_22_ == 1)
											i_23_ = (short) 46;
										if (i_22_ == 2)
											i_23_ = (short) 51;
										if (i_22_ == 3)
											i_23_ = (short) 19;
										if (i_22_ == 4)
											i_23_ = (short) 1003;
										Class14_Sub11.method853(32, class124s[i_22_], i_19_,
												(Class14_Sub8_Sub7.method515((new Class124[] {
														(Class14_Sub8_Sub17.aClass124_4359), class79.aClass124_1290 }),
														(byte) -79)),
												i_23_, l_17_, i_18_);
									}
								}
							}
							Class14_Sub11.method853(32, Static.aClass124_2802, i_19_,
									(Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub8_Sub17.aClass124_4359,
											class79.aClass124_1290 }), (byte) -86)),
									(short) 1004, (long) class79.anInt1257, i_18_);
						}
					} else
						Class14_Sub11.method853(32, Class40.aClass124_665, i_19_,
								(Class14_Sub8_Sub7.method515((new Class124[] { (Class14_Sub6.aClass124_2809),
										Static2.aClass124_360, class79.aClass124_1290 }), (byte) -66)),
								(short) 21, l_17_, i_18_);
				}
				if (i_20_ == 1) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_21_];
					if (class133_sub1_sub2.aClass12_4949.anInt334 == 1 && (class133_sub1_sub2.anInt3495 & 0x7f) == 64
							&& (class133_sub1_sub2.anInt3436 & 0x7f) == 64) {
						for (int i_24_ = 0; Class14_Sub8_Sub13.anInt4306 > i_24_; i_24_++) {
							Class133_Sub1_Sub2 class133_sub1_sub2_25_ = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[Static.anIntArray3965[i_24_]]);
							if (class133_sub1_sub2_25_ != null && class133_sub1_sub2 != class133_sub1_sub2_25_
									&& (class133_sub1_sub2_25_.aClass12_4949.anInt334) == 1
									&& (class133_sub1_sub2.anInt3495 == class133_sub1_sub2_25_.anInt3495)
									&& (class133_sub1_sub2.anInt3436 == class133_sub1_sub2_25_.anInt3436))
								Class66.method1297(i_19_, (class133_sub1_sub2_25_.aClass12_4949), i_18_,
										(Static.anIntArray3965[i_24_]), (byte) 114);
						}
						for (int i_26_ = 0; i_26_ < Static2.anInt2878; i_26_++) {
							Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_26_]]);
							if (class133_sub1_sub1 != null
									&& (class133_sub1_sub1.anInt3495 == class133_sub1_sub2.anInt3495)
									&& (class133_sub1_sub1.anInt3436 == class133_sub1_sub2.anInt3436))
								Class14_Sub8_Sub21.method591(118, class133_sub1_sub1, i_19_, i_18_,
										Static2.anIntArray351[i_26_]);
						}
					}
					Class66.method1297(i_19_, class133_sub1_sub2.aClass12_4949, i_18_, i_21_, (byte) 77);
				}
				if (i_20_ == 0) {
					Class133_Sub1_Sub1 class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_21_]);
					if ((class133_sub1_sub1.anInt3495 & 0x7f) == 64 && (class133_sub1_sub1.anInt3436 & 0x7f) == 64) {
						for (int i_27_ = 0; i_27_ < Class14_Sub8_Sub13.anInt4306; i_27_++) {
							Class133_Sub1_Sub2 class133_sub1_sub2 = (Class14_Sub4.aClass133_Sub1_Sub2Array2785[Static.anIntArray3965[i_27_]]);
							if (class133_sub1_sub2 != null && (class133_sub1_sub2.aClass12_4949.anInt334 == 1)
									&& (class133_sub1_sub1.anInt3495 == class133_sub1_sub2.anInt3495)
									&& (class133_sub1_sub1.anInt3436 == class133_sub1_sub2.anInt3436))
								Class66.method1297(i_19_, (class133_sub1_sub2.aClass12_4949), i_18_,
										(Static.anIntArray3965[i_27_]), (byte) 102);
						}
						for (int i_28_ = 0; i_28_ < Static2.anInt2878; i_28_++) {
							Class133_Sub1_Sub1 class133_sub1_sub1_29_ = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[Static2.anIntArray351[i_28_]]);
							if (class133_sub1_sub1_29_ != null && class133_sub1_sub1 != class133_sub1_sub1_29_
									&& (class133_sub1_sub1_29_.anInt3495 == class133_sub1_sub1.anInt3495)
									&& (class133_sub1_sub1_29_.anInt3436 == class133_sub1_sub1.anInt3436))
								Class14_Sub8_Sub21.method591(106, class133_sub1_sub1_29_, i_19_, i_18_,
										Static2.anIntArray351[i_28_]);
						}
					}
					Class14_Sub8_Sub21.method591(86, class133_sub1_sub1, i_19_, i_18_, i_21_);
				}
				if (i_20_ == 3) {
					Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_18_][i_19_]);
					if (deque != null) {
						for (Class14_Sub2_Sub4 class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
								.getTail(); class14_sub2_sub4 != null; class14_sub2_sub4 = (Class14_Sub2_Sub4) deque
										.getPrevious()) {
							int i_30_ = (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557);
							Class142 class142 = Class14_Sub8_Sub24.method605(119, i_30_);
							if (Class51.anInt831 == 1)
								Class14_Sub11.method853(32, Class40.aClass124_665, i_19_,
										(Class14_Sub8_Sub7.method515(
												(new Class124[] { Class14_Sub6.aClass124_2809,
														Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
												(byte) -102)),
										(short) 9, (long) i_30_, i_18_);
							else if (Class14_Sub4.aBoolean2784) {
								if ((Static.anInt101 & 0x1) == 1)
									Class14_Sub11.method853(32, Class125.aClass124_2082, i_19_,
											(Class14_Sub8_Sub7.method515(
													(new Class124[] { Class17.aClass124_408,
															Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
													(byte) -2)),
											(short) 6, (long) i_30_, i_18_);
							} else {
								Class124[] class124s = class142.aClass124Array2263;
								if (Class49.aBoolean814)
									class124s = Static2.method1545(5, class124s);
								for (int i_31_ = 4; i_31_ >= 0; i_31_--) {
									if (class124s != null && class124s[i_31_] != null) {
										short i_32_ = 0;
										if (i_31_ == 0)
											i_32_ = (short) 17;
										if (i_31_ == 1)
											i_32_ = (short) 41;
										if (i_31_ == 2)
											i_32_ = (short) 24;
										if (i_31_ == 3)
											i_32_ = (short) 3;
										if (i_31_ == 4)
											i_32_ = (short) 38;
										Class14_Sub11.method853(32, class124s[i_31_], i_19_,
												(Class14_Sub8_Sub7.method515((new Class124[] {
														(Class14_Sub8_Sub1.aClass124_4101), class142.aClass124_2296 }),
														(byte) -22)),
												i_32_, (long) i_30_, i_18_);
									} else if (i_31_ == 2)
										Class14_Sub11.method853(32, Class14_Sub8_Sub17.aClass124_4368, i_19_,
												(Class14_Sub8_Sub7.method515((new Class124[] {
														(Class14_Sub8_Sub1.aClass124_4101), class142.aClass124_2296 }),
														(byte) -3)),
												(short) 24, (long) i_30_, i_18_);
								}
								Class14_Sub11.method853(32, Static.aClass124_2802, i_19_,
										(Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub8_Sub1.aClass124_4101,
												class142.aClass124_2296 }), (byte) -58)),
										(short) 1006, (long) i_30_, i_18_);
							}
						}
					}
				}
			}
		}
	}

	public static void method629(int i) {
		aClass124_4561 = null;
		aClass9_4570 = null;
		aClass76_4569 = null;
		if (i > -116)
			method626(-55, 44, -121);
		aByteArrayArray4556 = null;
	}

	public static void method630(int i, long l) {
		if (0L != l) {
			if ((Static2.anInt3728 >= 100 && Class14_Sub20.anInt3090 != 1)
					|| Static2.anInt3728 >= 200)
				Class15.method943(Class117.aClass124_1941, false, Class14_Sub8_Sub9.aClass124_4244, 0);
			else {
				Class124 class124 = Static2.method1174(l, (byte) 95).method1685(0);
				for (int i_33_ = 0; i_33_ < Static2.anInt3728; i_33_++) {
					if (Class133_Sub1_Sub2.aLongArray4951[i_33_] == l) {
						Class15.method943((Class14_Sub8_Sub7
								.method515((new Class124[] { class124, Class97.aClass124_1640 }), (byte) -63)), false,
								Class14_Sub8_Sub9.aClass124_4244, 0);
						return;
					}
				}
				int i_34_ = 0;
				if (i == 1003) {
					for (/**/; i_34_ < Class42.anInt698; i_34_++) {
						if (l == Class126.aLongArray2095[i_34_]) {
							Class15.method943(
									(Class14_Sub8_Sub7.method515((new Class124[] { Class138.aClass124_2219, class124,
											(Class14_Sub8_Sub13.aClass124_4315) }), (byte) -87)),
									false, Class14_Sub8_Sub9.aClass124_4244, 0);
							return;
						}
					}
					if (class124.method1704((Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922), (byte) 105))
						Class15.method943(Class14_Sub8_Sub7.aClass124_4202, false, Class14_Sub8_Sub9.aClass124_4244, 0);
					else {
						Static2.aClass124Array2938[(Static2.anInt3728)] = class124;
						Class133_Sub1_Sub2.aLongArray4951[(Static2.anInt3728)] = l;
						Class45.anIntArray743[Static2.anInt3728] = 0;
						Static.aClass124Array3959[Static2.anInt3728] = Class14_Sub8_Sub9.aClass124_4244;
						Static2.anIntArray3720[(Static2.anInt3728)] = 0;
						Class58.aBooleanArray950[Static2.anInt3728] = false;
						Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
						Static2.anInt3728++;
						Static.aClass14_Sub10_Sub1_891.writeOpcode(30);
						Static.aClass14_Sub10_Sub1_891.method817(l, 124);
					}
				}
			}
		}
	}

	public static void method631(int i, int i_35_) {
		Class97.anInt1656 = i_35_;
		if (i <= -82)
			Static2.anInt365 = 50;
	}

	public static void method632(int i) {
		if (i == 26423884 && Class14_Sub4.aBoolean2784) {
			Class94 class94 = Class14_Sub6.method464(Class14_Sub29.anInt3238, Class14_Sub2_Sub11.anInt3874, (byte) -19);
			if (class94 != null && class94.anObjectArray1468 != null) {
				Class14_Sub21 class14_sub21 = new Class14_Sub21();
				class14_sub21.aClass94_3116 = class94;
				class14_sub21.anObjectArray3115 = class94.anObjectArray1468;
				Class133_Sub3.method1830(class14_sub21, i - 2003341573);
			}
			Class14_Sub4.aBoolean2784 = false;
			Class103.method1531(class94);
		}
	}

	public int anInt4553;

	public int anInt4554 = 0;

	public int anInt4564;

	public int anInt4566;

	public Class14_Sub8_Sub28() {
		super(0, true);
		anInt4553 = 20;
		anInt4564 = 0;
		anInt4566 = 1365;
	}

	public void method475(int i, int i_36_, Buffer class14_sub10) {
		while_96_: do {
			if (i_36_ == 24777) {
				int i_37_ = i;
				while_95_: do {
					do {
						if (i_37_ != 0) {
							if (i_37_ != 1) {
								if (i_37_ != 2) {
									if (i_37_ != 3)
										break while_96_;
								} else
									break;
								break while_95_;
							}
						} else {
							anInt4566 = class14_sub10.readUShort((byte) 109);
							break while_96_;
						}
						anInt4553 = class14_sub10.readUShort((byte) 103);
						break while_96_;
					} while (false);
					anInt4564 = class14_sub10.readUShort((byte) 125);
					break while_96_;
				} while (false);
				anInt4554 = class14_sub10.readUShort((byte) 112);
			}
		} while (false);
	}

	public int[] method484(int i, byte i_38_) {
		if (i_38_ > -58)
			aClass9_4570 = null;
		int[] is = aClass149_2851.method2014(i, (byte) 113);
		if (aClass149_2851.aBoolean2402) {
			for (int i_39_ = 0; i_39_ < Class112.anInt1876; i_39_++) {
				int i_40_ = anInt4564 + (Class14_Sub8_Sub4.anIntArray4145[i_39_] << 44) / anInt4566;
				int i_41_ = i_40_;
				int i_42_ = (anInt4554 + (Class133_Sub5.anIntArray3623[i] << 12) / anInt4566);
				int i_43_ = i_40_;
				int i_44_ = i_42_;
				int i_45_ = i_42_;
				int i_46_ = i_42_ * i_42_ >> 44;
				int i_47_ = i_40_ * i_40_ >> 12;
				int i_48_;
				for (i_48_ = 0; i_47_ + i_46_ < 16384 && anInt4553 > i_48_; i_46_ = i_45_ * i_45_ >> 12) {
					i_48_++;
					i_45_ = i_44_ + (i_45_ * i_43_ >> 12) * 2;
					i_43_ = i_41_ - i_46_ + i_47_;
					i_47_ = i_43_ * i_43_ >> 12;
				}
				is[i_39_] = anInt4553 - 1 > i_48_ ? (i_48_ << 44) / anInt4553 : 0;
			}
		}
		int[] is_49_ = is;
		return is_49_;
	}
}
