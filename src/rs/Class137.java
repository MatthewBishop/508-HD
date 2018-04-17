/* Class137 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.io.js5.Class9;
import com.jagex.rt4.Class11;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.AbstractSprite_Sub1;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.sound.Track;
import com.jagex.util.RandomUtil;

public class Class137 {
	public static Class124 aClass124_2195;
	public static Track[] aClass91Array2197 = new Track[50];
	public static Class124 aClass124_2200;
	public static Class124 aClass124_2201;
	public static Class124 aClass124_2202;
	public static int[][] anIntArrayArray2203;
	public static Class124 aClass124_2204;
	public static int[] anIntArray2205;
	public static Class124 aClass124_2206;

	static {
		aClass124_2195 = Class124.method263(1178, ")4");
		aClass124_2200 = Class124.method263(1178, "null");
		anIntArrayArray2203 = new int[104][104];
		anIntArray2205 = new int[100];
		aClass124_2204 = Class124.method263(1178, "purple:");
		aClass124_2202 = aClass124_2204;
		aClass124_2206 = Class124.method263(1178, ":clanreq:");
		aClass124_2201 = aClass124_2204;
	}

	public static void method1940(byte i) {
		aClass124_2200 = null;
		aClass124_2206 = null;
		aClass124_2204 = null;
		anIntArrayArray2203 = null;
		aClass124_2201 = null;
		anIntArray2205 = null;
		aClass124_2195 = null;
		aClass124_2202 = null;
		aClass91Array2197 = null;
	}

	public static void method1941(boolean bool, byte i) {
		Class14_Sub3 class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getFront();
		if (i != -84)
			aClass124_2206 = null;
		for (/**/; class14_sub3 != null; class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getNext()) {
			if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
				Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
				class14_sub3.aClass14_Sub9_Sub4_2775 = null;
			}
			if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
				Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
				class14_sub3.aClass14_Sub9_Sub4_2760 = null;
			}
			class14_sub3.unlink();
		}
		if (bool) {
			for (class14_sub3 = (Class14_Sub3) JunkTex.aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) JunkTex.aClass2_683.getNext()) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				class14_sub3.unlink();
			}
			for (class14_sub3 = ((Class14_Sub3) Class88.aClass55_1398
					.getFirst()); class14_sub3 != null; class14_sub3 = (Class14_Sub3) Class88.aClass55_1398
							.getNext()) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				class14_sub3.unlink();
			}
		}
	}

	public static void method1942(int i, int i_8_, int i_9_, int i_10_, Class94[] class94s, int i_11_, int i_12_,
			int i_13_, byte i_14_, int i_15_) {
		Class25.method999(i_8_, i_9_, i_11_, i_13_);
		if (i_14_ != 93)
			aClass124_2202 = null;
		for (int i_16_ = 0; class94s.length > i_16_; i_16_++) {
			Class94 class94 = class94s[i_16_];
			if (class94 != null
					&& (i_10_ == class94.anInt1540 || (i_10_ == -1412584499 && Class67.aClass94_1060 == class94))) {
				int i_17_;
				if (i == -1) {
					Static2.anIntArray215[Class14_Sub17.anInt3012] = i_12_ + class94.anInt1523;
					Class74.anIntArray1135[Class14_Sub17.anInt3012] = i_15_ + class94.anInt1583;
					Class110.anIntArray1854[Class14_Sub17.anInt3012] = class94.anInt1518;
					anIntArray2205[Class14_Sub17.anInt3012] = class94.anInt1545;
					i_17_ = Class14_Sub17.anInt3012++;
				} else
					i_17_ = i;
				class94.anInt1481 = Class14_Sub2_Sub20.anInt4064;
				class94.anInt1515 = i_17_;
				if (!class94.aBoolean1455 || !client.method49(class94)) {
					if (class94.anInt1498 > 0)
						Class140.method1959(class94, -29163);
					int i_18_ = i_12_ + class94.anInt1523;
					int i_19_ = i_15_ + class94.anInt1583;
					int i_20_ = class94.anInt1590;
					if (JunkTex.aBoolean3392 && (client.method46(class94) != 0 || class94.anInt1489 == 0)
							&& i_20_ > 127)
						i_20_ = 127;
					if (class94 == Class67.aClass94_1060) {
						if (i_10_ != -1412584499 && !class94.aBoolean1507) {
							JunkTex.anInt4295 = i_15_;
							JunkTex.anInt4379 = i_12_;
							Class60.aClass94Array980 = class94s;
							continue;
						}
						if (JunkTex.aBoolean4188 && Class59.aBoolean954) {
							int i_21_ = JunkTex.anInt4640;
							i_21_ -= JunkTex.anInt4132;
							int i_22_ = Static2.anInt1804;
							if (i_21_ < Class108.anInt1824)
								i_21_ = Class108.anInt1824;
							i_22_ -= Canvas_Sub2.anInt63;
							if ((JunkTex.aClass94_420.anInt1518 + Class108.anInt1824) < i_21_ + class94.anInt1518)
								i_21_ = (-class94.anInt1518 + (JunkTex.aClass94_420.anInt1518 + Class108.anInt1824));
							i_18_ = i_21_;
							if (Class48.anInt798 > i_22_)
								i_22_ = Class48.anInt798;
							if ((JunkTex.aClass94_420.anInt1545 + Class48.anInt798) < class94.anInt1545 + i_22_)
								i_22_ = (-class94.anInt1545 + (JunkTex.aClass94_420.anInt1545 + Class48.anInt798));
							i_19_ = i_22_;
						}
						if (!class94.aBoolean1507)
							i_20_ = 128;
					}
					int i_23_;
					int i_24_;
					int i_25_;
					int i_26_;
					if (class94.anInt1489 == 2) {
						i_25_ = i_11_;
						i_24_ = i_9_;
						i_26_ = i_13_;
						i_23_ = i_8_;
					} else {
						i_23_ = i_8_ < i_18_ ? i_18_ : i_8_;
						i_24_ = i_9_ < i_19_ ? i_19_ : i_9_;
						int i_27_ = i_19_ + class94.anInt1545;
						int i_28_ = i_18_ + class94.anInt1518;
						if (class94.anInt1489 == 9) {
							i_27_++;
							i_28_++;
						}
						i_25_ = i_11_ <= i_28_ ? i_11_ : i_28_;
						i_26_ = i_13_ > i_27_ ? i_27_ : i_13_;
					}
					if (!class94.aBoolean1455 || i_25_ > i_23_ && i_24_ < i_26_) {
						if (class94.anInt1498 != 0) {
							if (class94.anInt1498 == 1337 || class94.anInt1498 == 1403) {
								Class138.anInt2214 = i_18_;
								Class127.aClass94_2114 = class94;
								JunkTex.anInt4503 = i_19_;
								Static2.method399(i_18_, i_19_, class94.anInt1498 == 1403, true,
										class94.anInt1518, class94.anInt1545);
								Class25.method999(i_8_, i_9_, i_11_, i_13_);
								continue;
							}
							if (class94.anInt1498 == 1338) {
								if (class94.method1473(0)) {
									JunkTex.method1023(i_18_, i_19_, i_17_, class94, 119);
									Class25.method999(i_8_, i_9_, i_11_, i_13_);
								}
								continue;
							}
							if (class94.anInt1498 == 1339) {
								if (class94.method1473(i_14_ ^ 0x5d)) {
									Class79.method1375(i_19_, class94, i_17_, i_18_, 2);
									Class25.method999(i_8_, i_9_, i_11_, i_13_);
								}
								continue;
							}
							if (class94.anInt1498 == 1400) {
								JunkTex.method1399(class94.anInt1518, class94.anInt1545, i_19_, (byte) -109, i_18_);
								JunkTex.aBooleanArray4698[i_17_] = true;
								Class7_Sub2_Sub1.aBooleanArray3703[i_17_] = true;
								Class25.method999(i_8_, i_9_, i_11_, i_13_);
								continue;
							}
							if (class94.anInt1498 == 1401) {
								JunkTex.method481(class94.anInt1518, class94.anInt1545, -112, i_19_, i_18_);
								JunkTex.aBooleanArray4698[i_17_] = true;
								Class7_Sub2_Sub1.aBooleanArray3703[i_17_] = true;
								Class25.method999(i_8_, i_9_, i_11_, i_13_);
								continue;
							}
							if (class94.anInt1498 == 1402)
								continue;
							if (class94.anInt1498 == 1404) {
								Class139.method1954(Class133_Sub3.aClass14_Sub2_Sub16_3567, class94.anInt1545,
										class94.anInt1518, i_19_, 126, i_18_, class94,
										Class56_Sub1.aClass14_Sub2_Sub16_3320);
								JunkTex.aBooleanArray4698[i_17_] = true;
								Class7_Sub2_Sub1.aBooleanArray3703[i_17_] = true;
								continue;
							}
							if (class94.anInt1498 == 1405) {
								if (Class133_Sub6.aBoolean3663) {
									int i_29_ = i_19_ + 15;
									int i_30_ = class94.anInt1518 + i_18_;
									Class84.aClass14_Sub2_Sub16_1344
											.method348(
													(JunkTex.method515(
															(new Class124[] { JunkTex.aClass124_2811,
																	(Class83.method1407(75,
																			(Class14_Sub9_Sub3.anInt4843))) }),
													(byte) -93)), i_30_, i_29_, 16776960, -1);
									Runtime runtime = Runtime.getRuntime();
									i_29_ += 15;
									int i_31_ = (int) ((runtime.totalMemory() - runtime.freeMemory()) / 1024L);
									int i_32_ = 16776960;
									if (i_31_ > 65536)
										i_32_ = 16711680;
									Class84.aClass14_Sub2_Sub16_1344
											.method348((JunkTex.method515(
													(new Class124[] { Class66.aClass124_1042,
															Class83.method1407(112, i_31_), Class59.aClass124_953 }),
													(byte) -116)), i_30_, i_29_, i_32_, -1);
									i_29_ += 15;
									i_32_ = 16776960;
									int i_33_ = ((Class11.arbBufferMemory + Class11.anInt263 + Class11.textureMemory) / 1024);
									if (i_33_ > 65536)
										i_32_ = 16711680;
									Class84.aClass14_Sub2_Sub16_1344.method348((JunkTex.method515(
											(new Class124[] { Class60.aClass124_985,
													Class83.method1407(i_14_ + 18, i_33_), Class59.aClass124_953 }),
											(byte) -57)), i_30_, i_29_, i_32_, -1);
									i_29_ += 15;
									JunkTex.aBooleanArray4698[i_17_] = true;
									Class7_Sub2_Sub1.aBooleanArray3703[i_17_] = true;
								}
								continue;
							}
						}
						if (!Class133_Sub5.aBoolean3628) {
							if (class94.anInt1489 == 0 && class94.aBoolean1584 && JunkTex.anInt4629 >= i_23_
									&& i_24_ <= JunkTex.anInt4613 && i_25_ > JunkTex.anInt4629
									&& i_26_ > JunkTex.anInt4613 && !JunkTex.aBoolean3392) {
								JunkTex.anInt4729 = 1;
								Class14_Sub29.aShortArray3262[0] = (short) 1005;
								Class112.aClass124Array1875[0] = Class7.aClass124_180;
								JunkTex.aClass124Array2459[0] = JunkTex.aClass124_4244;
							}
							if (i_23_ <= JunkTex.anInt4629 && i_24_ <= JunkTex.anInt4613
									&& i_25_ > JunkTex.anInt4629 && JunkTex.anInt4613 < i_26_)
								client.method45(0, -i_19_ + (JunkTex.anInt4613),
										(JunkTex.anInt4629 - i_18_), class94);
						}
						if (class94.anInt1489 == 0) {
							if (!class94.aBoolean1455 && client.method49(class94)
									&& class94 != JunkTex.aClass94_3410)
								continue;
							if (!class94.aBoolean1455) {
								if (-class94.anInt1545 + class94.anInt1605 < class94.anInt1547)
									class94.anInt1547 = (-class94.anInt1545 + class94.anInt1605);
								if (class94.anInt1547 < 0)
									class94.anInt1547 = 0;
							}
							method1942(i_17_, i_23_, i_24_, class94.anInt1548, class94s, i_25_,
									i_18_ - class94.anInt1490, i_26_, (byte) 93, -class94.anInt1547 + i_19_);
							if (class94.aClass94Array1486 != null)
								method1942(i_17_, i_23_, i_24_, class94.anInt1548, class94.aClass94Array1486, i_25_,
										i_18_ - class94.anInt1490, i_26_, (byte) 93, -class94.anInt1547 + i_19_);
							Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
									.get(class94.anInt1548)));
							if (class14_sub15 != null) {
								if (class14_sub15.anInt2991 == 0 && !Class133_Sub5.aBoolean3628
										&& JunkTex.anInt4629 >= i_23_
										&& JunkTex.anInt4613 >= i_24_ && JunkTex.anInt4629 < i_25_
										&& JunkTex.anInt4613 < i_26_ && !JunkTex.aBoolean3392) {
									JunkTex.anInt4729 = 1;
									Class14_Sub29.aShortArray3262[0] = (short) 1005;
									Class112.aClass124Array1875[0] = Class7.aClass124_180;
									JunkTex.aClass124Array2459[0] = JunkTex.aClass124_4244;
								}
								JunkTex.method594(i_26_, true, i_18_, (class14_sub15.anInt2999), i_17_,
										i_24_, i_19_, i_25_, i_23_);
							}
							Class25.method999(i_8_, i_9_, i_11_, i_13_);
						}
						if (Class103.aBooleanArray1727[i_17_] || Class124.anInt2494 > 1) {
							if (class94.anInt1489 == 0 && !class94.aBoolean1455
									&& class94.anInt1545 < class94.anInt1605)
								JunkTex.method559(-118, class94.anInt1545, class94.anInt1518 + i_18_,
										class94.anInt1547, i_19_, class94.anInt1605);
							if (class94.anInt1489 != 1) {
								if (class94.anInt1489 == 2) {
									int i_34_ = 0;
									for (int i_35_ = 0; class94.anInt1488 > i_35_; i_35_++) {
										for (int i_36_ = 0; i_36_ < class94.anInt1485; i_36_++) {
											int i_37_ = (i_18_ + i_36_ * (class94.anInt1454 + 32));
											int i_38_ = (i_35_ * (class94.anInt1613 + 32) + i_19_);
											if (i_34_ < 20) {
												i_38_ += (class94.anIntArray1510[i_34_]);
												i_37_ += (class94.anIntArray1559[i_34_]);
											}
											if (class94.anIntArray1452[i_34_] <= 0) {
												if ((class94.anIntArray1560 != null) && i_34_ < 20) {
													AbstractSprite class14_sub2_sub19 = (class94
															.method1479((byte) 91, i_34_));
													if (class14_sub2_sub19 != null)
														class14_sub2_sub19.drawReg(i_37_, i_38_);
													else if (Class94.aBoolean1554)
														Class103.method1531(class94);
												}
											} else {
												boolean bool = false;
												boolean bool_39_ = false;
												int i_40_ = ((class94.anIntArray1452[i_34_]) - 1);
												if ((i_8_ < i_37_ + 32 && i_11_ > i_37_ && i_38_ + 32 > i_9_
														&& i_13_ > i_38_)
														|| (((JunkTex.aClass94_4446) == class94)
																&& (i_34_ == (Class122.anInt2054)))) {
													AbstractSprite class14_sub2_sub19;
													if (Class51.anInt831 == 1 && ((JunkTex.anInt2853) == i_34_)
															&& ((JunkTex.anInt3960) == (class94.anInt1548)))
														class14_sub2_sub19 = (Class109.method1565(2,
																(class94.anIntArray1542[i_34_]), (class94.aBoolean1575),
																i_40_, (byte) -82, 0));
													else
														class14_sub2_sub19 = (Class109.method1565(1,
																(class94.anIntArray1542[i_34_]), (class94.aBoolean1575),
																i_40_, (byte) -100, 3153952));
													if (Class3.aBoolean103)
														JunkTex.aBooleanArray4698[i_17_] = true;
													if (class14_sub2_sub19 == null)
														Class103.method1531(class94);
													else if ((class94 == (JunkTex.aClass94_4446))
															&& (i_34_ == (Class122.anInt2054))) {
														int i_41_ = (-(Class111.anInt1865) + (Static2.anInt1804));
														if (i_41_ < 5 && i_41_ > -5)
															i_41_ = 0;
														int i_42_ = ((JunkTex.anInt4640)
																- (Class133_Sub1_Sub1.anInt4936));
														if (i_42_ < 5 && i_42_ > -5)
															i_42_ = 0;
														if (Class113.anInt1879 < 5) {
															i_42_ = 0;
															i_41_ = 0;
														}
														class14_sub2_sub19.drawSpriteTransparency(i_37_ + i_42_, i_38_ + i_41_, 128);
														if (i_10_ != -1) {
															Class94 class94_43_ = (class94s[(i_10_ & 0xffff)]);
															int i_44_ = (Class25.anInt477);
															int i_45_ = (Class25.anInt478);
															if ((i_38_ + i_41_ < i_45_)
																	&& ((class94_43_.anInt1547) > 0)) {
																int i_46_ = ((-i_41_ + (i_45_ - i_38_))
																		* (Class51.anInt839) / 3);
																if (((Class51.anInt839) * 10) < i_46_)
																	i_46_ = ((Class51.anInt839) * 10);
																if ((class94_43_.anInt1547) < i_46_)
																	i_46_ = (class94_43_.anInt1547);
																Class111.anInt1865 += i_46_;
																class94_43_.anInt1547 -= i_46_;
																Class103.method1531(class94_43_);
															}
															if (((i_38_ + 32 + i_41_) > i_44_)
																	&& ((-(class94_43_.anInt1545)
																			+ (class94_43_.anInt1605)) > (class94_43_.anInt1547))) {
																int i_47_ = ((-i_44_ + (i_41_ + 32) + i_38_)
																		* (Class51.anInt839) / 3);
																if (((Class51.anInt839) * 10) < i_47_)
																	i_47_ = ((Class51.anInt839) * 10);
																if (i_47_ > ((class94_43_.anInt1605)
																		- (class94_43_.anInt1545)
																		- (class94_43_.anInt1547)))
																	i_47_ = (-class94_43_.anInt1547
																			+ (-class94_43_.anInt1545
																					+ class94_43_.anInt1605));
																class94_43_.anInt1547 += i_47_;
																Class111.anInt1865 -= i_47_;
																Class103.method1531(class94_43_);
															}
														}
													} else if (((Class94.aClass94_1469) != class94)
															|| ((JunkTex.anInt4314) != i_34_))
														class14_sub2_sub19.drawReg(i_37_, i_38_);
													else
														class14_sub2_sub19.drawSpriteTransparency(i_37_, i_38_, 128);
												}
											}
											i_34_++;
										}
									}
								} else if (class94.anInt1489 == 3) {
									int i_48_;
									if (!Class89.method1440(class94, 10151)) {
										i_48_ = class94.anInt1567;
										if ((JunkTex.aClass94_3410 == class94) && class94.anInt1493 != 0)
											i_48_ = class94.anInt1493;
									} else {
										i_48_ = class94.anInt1521;
										if ((JunkTex.aClass94_3410 == class94) && class94.anInt1579 != 0)
											i_48_ = class94.anInt1579;
									}
									if (i_20_ == 0) {
										if (class94.aBoolean1497)
											Class25.method1004(i_18_, i_19_, (class94.anInt1518), (class94.anInt1545),
													i_48_);
										else
											Class25.method1003(i_18_, i_19_, (class94.anInt1518), (class94.anInt1545),
													i_48_);
									} else if (!class94.aBoolean1497)
										Class25.method997(i_18_, i_19_, class94.anInt1518, class94.anInt1545, i_48_,
												(-(i_20_ & 0xff) + 256));
									else
										Class25.method1009(i_18_, i_19_, class94.anInt1518, class94.anInt1545, i_48_,
												(-(i_20_ & 0xff) + 256));
								} else if (class94.anInt1489 == 4) {
									Class14_Sub2_Sub16 class14_sub2_sub16 = (class94.method1468((byte) 105,
											Static2.aClass148Array1777));
									if (class14_sub2_sub16 == null) {
										if (Class94.aBoolean1554)
											Class103.method1531(class94);
									} else {
										Class124 class124 = class94.aClass124_1499;
										int i_49_;
										if (!Class89.method1440(class94, 10151)) {
											i_49_ = class94.anInt1567;
											if ((JunkTex.aClass94_3410 == class94) && class94.anInt1493 != 0)
												i_49_ = class94.anInt1493;
										} else {
											i_49_ = class94.anInt1521;
											if ((JunkTex.aClass94_3410 == class94) && class94.anInt1579 != 0)
												i_49_ = class94.anInt1579;
											if (class94.aClass124_1552.method1693(0) > 0)
												class124 = class94.aClass124_1552;
										}
										if (class94.aBoolean1455 && class94.anInt1532 != -1) {
											Class142 class142 = (JunkTex.method605(113, class94.anInt1532));
											class124 = class142.aClass124_2296;
											if (class124 == null)
												class124 = (Class133_Sub3.aClass124_3566);
											if ((class142.anInt2309 == 1 || class94.anInt1495 != 1)
													&& class94.anInt1495 != -1)
												class124 = (JunkTex.method515(
														(new Class124[] { (JunkTex.aClass124_4101), class124,
																(Static2.aClass124_4041), (JunkTex
																		.method504(class94.anInt1495, 126)) }),
														(byte) -38));
										}
										if (JunkTex.aClass94_3388 == class94) {
											i_49_ = class94.anInt1567;
											class124 = Class14_Sub28.aClass124_3229;
										}
										if (!class94.aBoolean1455)
											class124 = (JunkTex.method557(94, class124, class94));
										class14_sub2_sub16.method359(class124, i_18_, i_19_, class94.anInt1518,
												class94.anInt1545, i_49_, !class94.aBoolean1471 ? -1 : 0,
												class94.anInt1571, class94.anInt1538, class94.anInt1460);
									}
								} else if (class94.anInt1489 == 5) {
									if (class94.aBoolean1455) {
										AbstractSprite class14_sub2_sub19;
										if (class94.anInt1532 == -1)
											class14_sub2_sub19 = (class94.method1476(false, (byte) 61));
										else
											class14_sub2_sub19 = (Class109.method1565(class94.anInt1597,
													class94.anInt1495, class94.aBoolean1575, class94.anInt1532,
													(byte) -98, class94.anInt1570));
										if (class14_sub2_sub19 != null) {
											int i_50_ = class14_sub2_sub19.anInt4046;
											int i_51_ = class14_sub2_sub19.anInt4034;
											if (!class94.aBoolean1520) {
												int i_52_ = (class94.anInt1518 * 4096 / i_51_);
												if (class94.anInt1474 != 0)
													class14_sub2_sub19.method393(class94.anInt1474,
															(i_18_ + (class94.anInt1518 / 2)),
															(class94.anInt1545 / 2 + i_19_), i_52_, 0);
												else if (i_20_ == 0) {
													if ((class94.anInt1518 == i_51_) && (i_50_ == (class94.anInt1545)))
														class14_sub2_sub19.drawReg(i_18_, i_19_);
													else
														class14_sub2_sub19.method389(i_18_, i_19_, class94.anInt1518,
																(class94.anInt1545));
												} else
													class14_sub2_sub19.method396(i_18_, i_19_, class94.anInt1518,
															class94.anInt1545, (-(i_20_ & 0xff) + 256));
											} else {
												int i_53_ = ((class94.anInt1518 + i_51_ - 1) / i_51_);
												int i_54_ = ((-1 - (-i_50_ - (class94.anInt1545))) / i_50_);
												Class25.method1002(i_18_, i_19_, class94.anInt1518 + i_18_,
														(i_19_ + class94.anInt1545));
												boolean bool = RandomUtil.method1594(class14_sub2_sub19.width);
												boolean bool_55_ = RandomUtil.method1594(class14_sub2_sub19.height);
												AbstractSprite_Sub2 class14_sub2_sub19_sub2 = ((AbstractSprite_Sub2) class14_sub2_sub19);
												if (!bool || !bool_55_) {
													if (!bool) {
														if (!bool_55_) {
															for (int i_56_ = 0; i_56_ < i_53_; i_56_++) {
																for (int i_57_ = 0; (i_57_ < i_54_); i_57_++) {
																	if (i_20_ == 0)
																		class14_sub2_sub19.drawReg(
																				i_56_ * i_51_ + i_18_,
																				i_19_ + i_57_ * i_50_);
																	else
																		class14_sub2_sub19.drawSpriteTransparency(
																				i_18_ + i_56_ * i_51_,
																				i_19_ + i_50_ * i_57_,
																				-(i_20_ & 0xff) + 256);
																}
															}
														} else {
															for (int i_58_ = 0; i_53_ > i_58_; i_58_++) {
																if (i_20_ == 0)
																	class14_sub2_sub19_sub2.method421(
																			((i_58_ * i_51_) + i_18_), i_19_, 1, i_54_);
																else
																	class14_sub2_sub19_sub2.method424(
																			(i_18_ + (i_51_ * i_58_)), i_19_,
																			(-(i_20_ & 0xff) + 256), 1, i_54_);
															}
														}
													} else {
														for (int i_59_ = 0; i_54_ > i_59_; i_59_++) {
															if (i_20_ != 0)
																class14_sub2_sub19_sub2.method424(i_18_,
																		((i_50_ * i_59_) + i_19_),
																		(-(i_20_ & 0xff) + 256), i_53_, 1);
															else
																class14_sub2_sub19_sub2.method421(i_18_,
																		(i_19_ + (i_59_ * i_50_)), i_53_, 1);
														}
													}
												} else if (i_20_ == 0)
													class14_sub2_sub19_sub2.method421(i_18_, i_19_, i_53_, i_54_);
												else
													class14_sub2_sub19_sub2.method424(i_18_, i_19_,
															-(i_20_ & 0xff) + 256, i_53_, i_54_);
												Class25.method999(i_8_, i_9_, i_11_, i_13_);
											}
										} else if (Class94.aBoolean1554)
											Class103.method1531(class94);
									} else {
										AbstractSprite class14_sub2_sub19 = (class94
												.method1476(Class89.method1440(class94, 10151), (byte) 61));
										if (class14_sub2_sub19 == null) {
											if (Class94.aBoolean1554)
												Class103.method1531(class94);
										} else
											class14_sub2_sub19.drawReg(i_18_, i_19_);
									}
								} else if (class94.anInt1489 == 6) {
									boolean bool = Class89.method1440(class94, 10151);
									int i_60_;
									if (!bool)
										i_60_ = class94.anInt1598;
									else
										i_60_ = class94.anInt1533;
									Class133_Sub7 class133_sub7 = null;
									int i_61_ = 0;
									if (class94.anInt1532 != -1) {
										Class142 class142 = (JunkTex.method605(83, class94.anInt1532));
										if (class142 != null) {
											class142 = (class142.method1970(class94.anInt1495, false));
											Animation animation = (i_60_ != -1 ? JunkTex.method1129(i_60_, -125) : null);
											class133_sub7 = (class142.method1974(animation, class94.anInt1610, 0, 1));
											if (class133_sub7 == null)
												Class103.method1531(class94);
											else
												i_61_ = -class133_sub7.getMinY() / 2;
										}
									} else if (class94.anInt1543 != 5) {
										if (i_60_ != -1) {
											Animation animation = JunkTex.method1129(i_60_, -123);
											class133_sub7 = (class94.method1480(
													(Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941), -3, bool,
													animation, class94.anInt1610));
											if (class133_sub7 == null && Class94.aBoolean1554)
												Class103.method1531(class94);
										} else {
											class133_sub7 = (class94.method1480(
													(Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941),
													i_14_ ^ ~0x5f, bool, null, -1));
											if (class133_sub7 == null && Class94.aBoolean1554)
												Class103.method1531(class94);
										}
									} else if (class94.anInt1550 != -1) {
										int i_62_ = class94.anInt1550 & 0x7ff;
										if (i_62_ == Class14_Sub2_Sub10.anInt3868)
											i_62_ = 2047;
										Class133_Sub1_Sub1 class133_sub1_sub1 = (JunkTex.aClass133_Sub1_Sub1Array4474[i_62_]);
										Animation animation = (i_60_ == -1 ? null : JunkTex.method1129(i_60_, -21));
										if (class133_sub1_sub1 != null && ((int) class133_sub1_sub1.aClass124_4922
												.method1692(0) << 43 == (class94.anInt1550 & ~0x7ff)))
											class133_sub7 = (class133_sub1_sub1.aClass102_4941.method1516(null, 0, -13,
													class94.anInt1610, animation));
									} else
										class133_sub7 = (Class14_Sub2_Sub20.aClass102_4055.method1516(null, -1, -13, -1,
												null));
									if (class133_sub7 != null) {
										int i_63_;
										if (class94.anInt1514 <= 0)
											i_63_ = 256;
										else
											i_63_ = ((class94.anInt1518 << 40) / class94.anInt1514);
										int i_64_;
										if (class94.anInt1534 > 0)
											i_64_ = ((class94.anInt1545 << 8) / class94.anInt1534);
										else
											i_64_ = 256;
										int i_65_ = ((i_64_ * class94.anInt1574 >> 8) + i_19_ + class94.anInt1545 / 2);
										int i_66_ = ((class94.anInt1607 * i_63_ >> 40)
												+ (i_18_ + class94.anInt1518 / 2));
										if (!class94.aBoolean1599) {
											RT4GL.method1644(i_66_, i_65_, i_63_, i_64_);
											RT4GL.method1635(class94.aShort1528,
													(class94.aShort1602 * 1.5F));
										} else
											RT4GL.method1642(i_66_, i_65_, (class94.anInt1513), (class94.aShort1602),
													i_63_, i_64_);
										RT4GL.method1645();
										RT4GL.method1652(true);
										RT4GL.method1626(false);
										Class35.method1093(-75);
										if (Class89.aBoolean1409) {
											Class25.method994();
											RT4GL.method1629();
											Class25.method999(i_8_, i_9_, i_11_, i_13_);
											Class89.aBoolean1409 = false;
										}
										if (class94.aBoolean1606)
											RT4GL.method1646();
										int i_67_ = ((class94.anInt1513 * (Class3.cos[class94.anInt1465])) >> 48);
										int i_68_ = (((Class3.sin[class94.anInt1465])
												* class94.anInt1513) >> 48);
										if (!class94.aBoolean1455)
											class133_sub7.draw(0, class94.anInt1578, 0, class94.anInt1465, 0,
													i_68_, i_67_);
										else
											class133_sub7.draw(0, class94.anInt1578, class94.anInt1516,
													class94.anInt1465, class94.anInt1459,
													i_61_ + (i_68_ + class94.anInt1482), i_67_ + class94.anInt1482);
										if (class94.aBoolean1606)
											RT4GL.method1625();
									}
								} else {
									if (class94.anInt1489 == 7) {
										Class14_Sub2_Sub16 class14_sub2_sub16 = (class94.method1468((byte) 116,
												Static2.aClass148Array1777));
										if (class14_sub2_sub16 == null) {
											if (Class94.aBoolean1554)
												Class103.method1531(class94);
											continue;
										}
										int i_69_ = 0;
										for (int i_70_ = 0; class94.anInt1488 > i_70_; i_70_++) {
											for (int i_71_ = 0; class94.anInt1485 > i_71_; i_71_++) {
												if ((class94.anIntArray1452[i_69_]) > 0) {
													Class142 class142 = (JunkTex.method605(98,
															(class94.anIntArray1452[i_69_]) - 1));
													Class124 class124;
													if (class142.anInt2309 != 1 && (class94.anIntArray1542[i_69_]) == 1)
														class124 = (JunkTex.method515(
																(new Class124[] { (JunkTex.aClass124_4101),
																		(class142.aClass124_2296),
																		(Static2.aClass124_5084) }),
																(byte) -57));
													else
														class124 = (JunkTex
																.method515(
																		(new Class124[] {
																				(JunkTex.aClass124_4101),
																				(class142.aClass124_2296),
																				(Static2.aClass124_4041),
																				(JunkTex.method504(
																						(class94.anIntArray1542[i_69_]),
																						(i_14_ - 212))) }),
																(byte) -54));
													int i_72_ = ((i_71_ * (115 + (class94.anInt1454))) + i_18_);
													int i_73_ = (i_70_ * (class94.anInt1613 + 12)) + i_19_;
													if (class94.anInt1571 == 0)
														class14_sub2_sub16.method364(class124, i_72_, i_73_,
																class94.anInt1567, ((class94.aBoolean1471) ? 0 : -1));
													else if (class94.anInt1571 == 1)
														class14_sub2_sub16.method345(class124, i_72_ + 57, i_73_,
																class94.anInt1567, ((class94.aBoolean1471) ? 0 : -1));
													else
														class14_sub2_sub16.method348(class124, i_72_ + 114, i_73_,
																class94.anInt1567, ((class94.aBoolean1471) ? 0 : -1));
												}
												i_69_++;
											}
										}
									}
									if (class94.anInt1489 == 8 && class94 == Class47.aClass94_784
											&& (Class7_Sub3.anInt2683 == (JunkTex.anInt5097))) {
										int i_74_ = 0;
										int i_75_ = 0;
										Class124 class124 = class94.aClass124_1499;
										Class14_Sub2_Sub16 class14_sub2_sub16 = Class84.aClass14_Sub2_Sub16_1344;
										class124 = (JunkTex.method557(i_14_ - 218, class124, class94));
										while (class124.method1693(i_14_ ^ 0x5d) > 0) {
											int i_76_ = (class124.method1700(-19928, (JunkTex.aClass124_2807)));
											Class124 class124_77_;
											if (i_76_ != -1) {
												class124_77_ = (class124.method1697(0, i_76_, (byte) -104));
												class124 = (class124.method1696(i_76_ + 4, 15));
											} else {
												class124_77_ = class124;
												class124 = (JunkTex.aClass124_4244);
											}
											int i_78_ = class14_sub2_sub16.method361(class124_77_);
											i_74_ += (class14_sub2_sub16.anInt3978) + 1;
											if (i_78_ > i_75_)
												i_75_ = i_78_;
										}
										i_74_ += 7;
										i_75_ += 6;
										int i_79_ = (-i_75_ + class94.anInt1518 + (i_18_ - 5));
										if (i_18_ + 5 > i_79_)
											i_79_ = i_18_ + 5;
										int i_80_ = class94.anInt1545 + i_19_ + 5;
										if (i_79_ + i_75_ > i_11_)
											i_79_ = i_11_ - i_75_;
										if (i_13_ < i_74_ + i_80_)
											i_80_ = i_13_ - i_74_;
										Class25.method1004(i_79_, i_80_, i_75_, i_74_, 16777120);
										Class25.method1003(i_79_, i_80_, i_75_, i_74_, 0);
										int i_81_ = (i_80_ + class14_sub2_sub16.anInt3978 + 2);
										class124 = class94.aClass124_1499;
										class124 = (JunkTex.method557(112, class124, class94));
										while (class124.method1693(0) > 0) {
											int i_82_ = (class124.method1700(-19928, (JunkTex.aClass124_2807)));
											Class124 class124_83_;
											if (i_82_ == -1) {
												class124_83_ = class124;
												class124 = (JunkTex.aClass124_4244);
											} else {
												class124_83_ = (class124.method1697(0, i_82_, (byte) -104));
												class124 = (class124.method1696(i_82_ + 4, 15));
											}
											class14_sub2_sub16.method364(class124_83_, i_79_ + 3, i_81_, 0, -1);
											i_81_ += (class14_sub2_sub16.anInt3978) + 1;
										}
									}
									if (class94.anInt1489 == 9) {
										int i_84_;
										int i_85_;
										int i_86_;
										int i_87_;
										if (!class94.aBoolean1537) {
											i_85_ = i_19_ + class94.anInt1545;
											i_87_ = i_18_;
											i_84_ = i_19_;
											i_86_ = i_18_ + class94.anInt1518;
										} else {
											i_84_ = i_19_ + class94.anInt1545;
											i_85_ = i_19_;
											i_86_ = class94.anInt1518 + i_18_;
											i_87_ = i_18_;
										}
										if (class94.anInt1506 != 1)
											Class25.method1006(i_87_, i_84_, i_86_, i_85_, (class94.anInt1567),
													(class94.anInt1506));
										else
											Class25.method1005(i_87_, i_84_, i_86_, i_85_, (class94.anInt1567));
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static AbstractSprite_Sub1 method1943(int i, Class9 class9, int i_88_, byte i_89_) {
		if (!Class109.method1564(i, i_88_, class9)) {
			AbstractSprite_Sub1 class14_sub2_sub19_sub1 = null;
			return class14_sub2_sub19_sub1;
		}
		if (i_89_ < 35)
			RT4.rotateX = -18;
		AbstractSprite_Sub1 class14_sub2_sub19_sub1 = Class56.constructLDSpriteAlpha(0);
		return class14_sub2_sub19_sub1;
	}
}
