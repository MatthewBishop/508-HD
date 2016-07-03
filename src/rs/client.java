/* client - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.util.GregorianCalendar;

import com.jagex.cache.anim.AnimFrame;
import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.link.ref.SoftCache;
import com.jagex.map.SceneCluster;
import com.jagex.map.Scenegraph;
import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.Class11;
import com.jagex.rt4.Class119;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.Shadow;
import com.jagex.rt4.Class14_Sub1;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.ShadowManager;
import com.jagex.rt4.Class25;
import com.jagex.rt4.Class34;
import com.jagex.rt4.LavaShader;
import com.jagex.rt4.RT4;
import com.jagex.rt4.lights.LightManager;
import com.jagex.sound.Synthesizer;
import com.jagex.sound.Filter;
import com.jagex.util.BrowserControlUtil;
import com.jagex.util.MouseCapturer;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub1;
import rs.tex.Class14_Sub8_Sub10;
import rs.tex.Class14_Sub8_Sub11;
import rs.tex.Class14_Sub8_Sub13;
import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub16;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub18;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub2;
import rs.tex.Class14_Sub8_Sub20;
import rs.tex.Class14_Sub8_Sub21;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub23;
import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Class14_Sub8_Sub25;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub28;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub33;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub35;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub37;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub39;
import rs.tex.Class14_Sub8_Sub39_Sub1;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub5;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Class14_Sub8_Sub8;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public class client extends Applet_Sub1 {
	public static Class124 aClass124_2625;
	public static Class124 aClass124_2631;
	public static Class124 aClass124_2636 = Class14_Sub2_Sub2.method263(1178, "Loading )2 please wait)3");
	public static Class124 aClass124_2637 = Class14_Sub2_Sub2.method263(1178, "Loaded textures");
	public static Class124 aClass124_2639;
	public static int[] anIntArray2644;
	public static Class124[] aClass124Array2645;
	public static int anInt2648;
	public static boolean aBoolean2650;

	static {
		aClass124_2625 = Class14_Sub2_Sub2.method263(1178, "Lade Wordpack )2 ");
		aClass124_2639 = aClass124_2636;
		aClass124Array2645 = new Class124[100];
		anInt2648 = 0;
		aClass124_2631 = aClass124_2637;
		anIntArray2644 = new int[] { 8, 11, 4, 6, 9, 7, 10 };
	}

	public void method43(int var1) {
		try {
			if (Class24.anInt465 >= 4) {
				this.method28("js5crc", -1);
				Class14_Sub8_Sub16.anInt4356 = 1000;
			} else {
				if (Class51.anInt829 >= 4) {
					if (Class14_Sub8_Sub16.anInt4356 == 0 || Class14_Sub8_Sub16.anInt4356 == 5) {
						this.method28("js5io", -1);
						Class14_Sub8_Sub16.anInt4356 = 1000;
						return;
					}

					Class51.anInt829 = 3;
					Static.anInt1314 = 3000;
				}

				if (Static.anInt1314-- <= 0) {
					if (Static.anInt2721 == 0) {
						Static.aClass31_1328 = Class14_Sub8_Sub34.aClass43_4647.method1153(0,
								Class14_Sub8_Sub31.aString4605, Class131.anInt2164);
						++Static.anInt2721;
					}

					if (Static.anInt2721 == 1) {
						if (Static.aClass31_1328.anInt529 == 2) {
							this.method54(-1, (byte) -123);
							return;
						}

						if (Static.aClass31_1328.anInt529 == 1) {
							++Static.anInt2721;
						}
					}

					if (Static.anInt2721 == 2) {
						Class133_Sub1_Sub1.aClass36_4939 = new Class36((Socket) Static.aClass31_1328.anObject530,
								Class14_Sub8_Sub34.aClass43_4647);
						Buffer var2 = new Buffer(5);
						var2.method809(15);
						var2.method803(508, 112);
						Class133_Sub1_Sub1.aClass36_4939.method1100(0, 3, 5, var2.payload);
						++Static.anInt2721;
						Class12.aLong282 = TimeUtil.getTime();
					}

					if (var1 > -99) {
						aClass124_2637 = null;
					}

					if (Static.anInt2721 == 3) {
						if (Class14_Sub8_Sub16.anInt4356 != 0 && Class14_Sub8_Sub16.anInt4356 != 5
								&& Class133_Sub1_Sub1.aClass36_4939.method1104(24249) <= 0) {
							if (30000L < TimeUtil.getTime() + -Class12.aLong282) {
								this.method54(-2, (byte) -120);
								return;
							}
						} else {
							try {
								int var5 = Class133_Sub1_Sub1.aClass36_4939.method1107((byte) 30);
								if (var5 != 0) {
									this.method54(var5, (byte) -122);
									return;
								}
							} catch (IOException var3) {
								this.method54(-3, (byte) -123);
								return;
							}

							++Static.anInt2721;
						}
					}

					if (Static.anInt2721 == 4) {
						boolean var6 = Class14_Sub8_Sub16.anInt4356 == 5 || Class14_Sub8_Sub16.anInt4356 == 10
								|| Class14_Sub8_Sub16.anInt4356 == 28;
						Class133.method1783(Class133_Sub1_Sub1.aClass36_4939, (byte) 49, !var6);
						Static.aClass31_1328 = null;
						Class125_Sub1.anInt3363 = 0;
						Class133_Sub1_Sub1.aClass36_4939 = null;
						Static.anInt2721 = 0;
					}
				}
			}

		} catch (Throwable var4) {
			throw Class14_Sub8_Sub14.method554(var4, "client.C(" + var1 + ')');
		}
	}

	public void method29(int i) {
		try {
			if (Class14_Sub8_Sub16.anInt4356 != 1000) {
				boolean bool = Class113.method1581(0);
				if (bool && Class14_Sub7.aBoolean2827 && Class14_Sub8_Sub35.aClass75_4682 != null)
					Class14_Sub8_Sub35.aClass75_4682.method1344(true);
				if (Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 10) {
					if (Class54.aBoolean877)
						Class14_Sub21.method897(120);
					else if (Class132.aLong2169 != 0L && (Class132.aLong2169 < TimeUtil.getTime()))
						Class14_Sub21.method897(122);
				}
				if (0L != Class56_Sub1.aLong3317 && Class56_Sub1.aLong3317 < TimeUtil.getTime()
						&& Class14_Sub15.aClass36_2990 != null
						&& (Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 25))
					Class88.method1436((byte) -125);
				if (Static.aFrame3962 == null) {
					Container container;
					if (Static.aFrame3962 == null) {
						if (Class14_Sub14.aFrame2986 == null)
							container = Class14_Sub8_Sub34.aClass43_4647.applet;
						else
							container = Class14_Sub14.aFrame2986;
					} else
						container = Static.aFrame3962;
					int i_9_ = container.getSize().width;
					int i_10_ = container.getSize().height;
					if (container == Class14_Sub14.aFrame2986) {
						Insets insets = Class14_Sub14.aFrame2986.getInsets();
						i_9_ -= insets.right + insets.left;
						i_10_ -= insets.top + insets.bottom;
					}
					if (Class14_Sub8_Sub32.anInt4622 != i_9_ || Class14_Sub2_Sub21.anInt4086 != i_10_)
						Class14_Sub8_Sub30.method643(500, (byte) -93);
				}
				if (Static.aFrame3962 != null && !Class83.aBoolean1342
						&& (Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 10))
					Class14_Sub2_Sub20.method428(i - 7);
				if (i != 1)
					method43(-81);
				boolean bool_11_ = false;
				if (Class141.aBoolean2244) {
					bool_11_ = true;
					Class141.aBoolean2244 = false;
				}
				if (bool_11_)
					Class132.method1779(0);
				for (int i_12_ = 0; i_12_ < 100; i_12_++)
					Class14_Sub8_Sub36.aBooleanArray4698[i_12_] = true;
				if (Class14_Sub8_Sub16.anInt4356 != 0) {
					if (Class14_Sub8_Sub16.anInt4356 == 5)
						Class14_Sub8_Sub27.method623(false, Class133_Sub3.aClass14_Sub2_Sub16_3567);
					else if (Class14_Sub8_Sub16.anInt4356 != 10) {
						if (Class14_Sub8_Sub16.anInt4356 != 25 && Class14_Sub8_Sub16.anInt4356 != 28) {
							if (Class14_Sub8_Sub16.anInt4356 != 30) {
								if (Class14_Sub8_Sub16.anInt4356 == 40)
									Class84.method1411(false,
											(Class14_Sub8_Sub7.method515(
													(new Class124[] { (RuntimeException_Sub1.aClass124_2462),
															Class14_Sub6.aClass124_2807, Class56.aClass124_923 }),
													(byte) -15)),
											true);
							} else
								Class14_Sub8_Sub8.method516((byte) -107);
						} else if (Class14_Sub18.anInt3064 != 1) {
							if (Class14_Sub18.anInt3064 != 2)
								Class84.method1411(false, aClass124_2639, true);
							else {
								if (Class149.anInt2383 > Class14_Sub8_Sub28.anInt4560)
									Class14_Sub8_Sub28.anInt4560 = Class149.anInt2383;
								int i_13_ = 50 + ((-Class149.anInt2383 + Class14_Sub8_Sub28.anInt4560) * 50
										/ Class14_Sub8_Sub28.anInt4560);
								Class84.method1411(false, (Class14_Sub8_Sub7.method515(
										(new Class124[] { aClass124_2639, Class122.aClass124_2053,
												Class83.method1407(99, i_13_), Static2.aClass124_4051 }),
										(byte) -59)), true);
							}
						} else {
							if (anInt2648 > Static2.anInt3732)
								Static2.anInt3732 = anInt2648;
							int i_14_ = ((Static2.anInt3732 - anInt2648) * 50 / Static2.anInt3732);
							Class84.method1411(false, (Class14_Sub8_Sub7.method515(
									(new Class124[] { aClass124_2639, Class122.aClass124_2053,
											Class83.method1407(i + 45, i_14_), (Static2.aClass124_4051) }),
									(byte) -10)), true);
						}
					} else
						Class70.method1313(-11198);
				} else
					Class22.method984(Class51.anInt828, -1644, bool_11_, null, Class14_Sub9_Sub1.aClass124_4761);
				if (Class14_Sub8_Sub16.anInt4356 != 0) {
					RT4GL.method1657();
					for (int i_15_ = 0; Class14_Sub17.anInt3012 > i_15_; i_15_++)
						Class7_Sub2_Sub1.aBooleanArray3703[i_15_] = false;
				} else if ((Class14_Sub8_Sub16.anInt4356 == 30 || Class14_Sub8_Sub16.anInt4356 == 10)
						&& Class124.anInt2494 == 0 && !bool_11_) {
					try {
						Graphics graphics = Class49.aCanvas819.getGraphics();
						for (int i_16_ = 0; Class14_Sub17.anInt3012 > i_16_; i_16_++) {
							if (Class7_Sub2_Sub1.aBooleanArray3703[i_16_]) {
								Class122.aClass108_2059.method1560(Class74.anIntArray1135[i_16_], (byte) -128,
										Class110.anIntArray1854[i_16_], Class137.anIntArray2205[i_16_], graphics,
										Class9.anIntArray215[i_16_]);
								Class7_Sub2_Sub1.aBooleanArray3703[i_16_] = false;
							}
						}
					} catch (Exception exception) {
						Class49.aCanvas819.repaint();
					}
				} else if (Class14_Sub8_Sub16.anInt4356 != 0) {
					try {
						Graphics graphics = Class49.aCanvas819.getGraphics();
						Class122.aClass108_2059.method1558(0, (byte) 29, graphics, 0);
						for (int i_17_ = 0; i_17_ < Class14_Sub17.anInt3012; i_17_++)
							Class7_Sub2_Sub1.aBooleanArray3703[i_17_] = false;
					} catch (Exception exception) {
						Class49.aCanvas819.repaint();
					}
				}
				if (Class65.aBoolean1026)
					Class14_Sub8_Sub27.method621((byte) -55);
				BrowserControlUtil.update(Class49.aCanvas819, Class14_Sub13.anInt2964);
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable,
					new StringBuilder("client.A(").append(i).append(')').toString());
		}
	}

	public static int method44(boolean var0, int var1) {
		try {
			long var3 = TimeUtil.getTime();
			if (var1 != -1) {
				byte var9 = -126;
				return var9;
			} else {
				for (Class14_Sub13 var5 = !var0 ? (Class14_Sub13) Static.aClass55_92.getNext()
						: (Class14_Sub13) Static.aClass55_92
								.getFirst(); var5 != null; var5 = (Class14_Sub13) Static.aClass55_92
										.getNext()) {
					if ((var5.aLong2963 & 4611686018427387903L) < var3) {
						if (0L != (var5.aLong2963 & 4611686018427387904L)) {
							int var6 = (int) var5.key;
							Class14_Sub8_Sub11.anIntArray4275[var6] = Class14_Sub9_Sub3.anIntArray4851[var6];
							var5.unlink();
							return var6;
						}

						var5.unlink();
					}
				}

				return -1;
			}
		} catch (Throwable var8) {
			throw Class14_Sub8_Sub14.method554(var8, "client.O(" + var0 + ',' + var1 + ')');
		}
	}

	public static void method45(int i, int i_26_, int i_27_, Class94 class94) {
		if (class94.anInt1572 == 1)
			Class14_Sub11.method853(32, class94.aClass124_1556, class94.anInt1548, Class14_Sub8_Sub9.aClass124_4244,
					(short) 22, 0L, 0);
		if (class94.anInt1572 == 2 && !Class14_Sub4.aBoolean2784) {
			Class124 class124 = Class54.method1217(class94, -109);
			if (class124 != null) {
				Class14_Sub11.method853(32, class124, class94.anInt1548,
						(Class14_Sub8_Sub7.method515(
								(new Class124[] { Class14_Sub8_Sub2.aClass124_4116, class94.aClass124_1483 }),
								(byte) -116)),
						(short) 48, 0L, -1);
				Static.anInt3954++;
			}
		}
		if (class94.anInt1572 == 3)
			Class14_Sub11.method853(32, Class133_Sub5.aClass124_3610, class94.anInt1548,
					Class14_Sub8_Sub9.aClass124_4244, (short) 7, 0L, 0);
		if (class94.anInt1572 == 4)
			Class14_Sub11.method853(i + 32, class94.aClass124_1556, class94.anInt1548, Class14_Sub8_Sub9.aClass124_4244,
					(short) 15, 0L, 0);
		if (class94.anInt1572 == 5)
			Class14_Sub11.method853(32, class94.aClass124_1556, class94.anInt1548, Class14_Sub8_Sub9.aClass124_4244,
					(short) 40, 0L, 0);
		if (class94.anInt1572 == 6 && Class125_Sub2.aClass94_3388 == null) {
			Class66.anInt1045++;
			Class14_Sub11.method853(i + 32, class94.aClass124_1556, class94.anInt1548, Class14_Sub8_Sub9.aClass124_4244,
					(short) 4, 0L, -1);
		}
		if (class94.anInt1489 == 2) {
			int i_28_ = 0;
			for (int i_29_ = 0; i_29_ < class94.anInt1488; i_29_++) {
				for (int i_30_ = 0; i_30_ < class94.anInt1485; i_30_++) {
					int i_31_ = i_30_ * (class94.anInt1454 + 32);
					int i_32_ = (class94.anInt1613 + 32) * i_29_;
					if (i_28_ < 20) {
						i_32_ += class94.anIntArray1510[i_28_];
						i_31_ += class94.anIntArray1559[i_28_];
					}
					if (i_31_ <= i_27_ && i_26_ >= i_32_ && i_27_ < i_31_ + 32 && i_26_ < i_32_ + 32) {
						Class14_Sub8_Sub31.anInt4601 = i_28_;
						Class141.aClass94_2239 = class94;
						if (class94.anIntArray1452[i_28_] > 0) {
							Class142 class142 = Class14_Sub8_Sub24.method605(62, (class94.anIntArray1452[i_28_]) - 1);
							if (Class51.anInt831 != 1 || !Class14_Sub2_Sub5.method282(method46(class94), -1)) {
								if (Class14_Sub4.aBoolean2784
										&& (Class14_Sub2_Sub5.method282(method46(class94), i ^ 0xffffffff))) {
									if ((Static.anInt101 & 0x10) == 16)
										Class14_Sub11.method853(32, Class125.aClass124_2082, class94.anInt1548,
												(Class14_Sub8_Sub7.method515((new Class124[] { Class17.aClass124_408,
														Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
														(byte) -67)),
												(short) 36, (long) class142.anInt2276, i_28_);
								} else {
									Class124[] class124s = class142.aClass124Array2304;
									if (Class49.aBoolean814)
										class124s = Static2.method1545(5, class124s);
									if (Class14_Sub2_Sub5.method282(method46(class94), i ^ 0xffffffff)) {
										for (int i_33_ = 4; i_33_ >= 3; i_33_--) {
											if (class124s == null || class124s[i_33_] == null) {
												if (i_33_ == 4)
													Class14_Sub11
															.method853(32, (Class14_Sub8_Sub2.aClass124_4118),
																	class94.anInt1548,
																	(Class14_Sub8_Sub7.method515(
																			(new Class124[] {
																					(Class14_Sub8_Sub1.aClass124_4101),
																					(class142.aClass124_2296) }),
																			(byte) -8)),
																	(short) 28, (long) (class142.anInt2276), i_28_);
											} else {
												short i_34_;
												if (i_33_ == 3)
													i_34_ = (short) 26;
												else
													i_34_ = (short) 28;
												Class14_Sub11
														.method853(i + 32, class124s[i_33_], class94.anInt1548,
																(Class14_Sub8_Sub7.method515(
																		(new Class124[] {
																				(Class14_Sub8_Sub1.aClass124_4101),
																				(class142.aClass124_2296) }),
																		(byte) -86)),
																i_34_, (long) class142.anInt2276, i_28_);
											}
										}
									}
									if (Static.method1396(-124, method46(class94)))
										Class14_Sub11.method853(32, Class40.aClass124_665, class94.anInt1548,
												(Class14_Sub8_Sub7.method515((new Class124[] {
														(Class14_Sub8_Sub1.aClass124_4101), class142.aClass124_2296 }),
														(byte) -2)),
												(short) 25, (long) class142.anInt2276, i_28_);
									if (Class14_Sub2_Sub5.method282(method46(class94), -1) && class124s != null) {
										for (int i_35_ = 2; i_35_ >= 0; i_35_--) {
											if (class124s[i_35_] != null) {
												short i_36_ = 0;
												if (i_35_ == 0)
													i_36_ = (short) 29;
												if (i_35_ == 1)
													i_36_ = (short) 12;
												if (i_35_ == 2)
													i_36_ = (short) 44;
												Class14_Sub11
														.method853(32, class124s[i_35_], class94.anInt1548,
																(Class14_Sub8_Sub7.method515(
																		(new Class124[] {
																				(Class14_Sub8_Sub1.aClass124_4101),
																				(class142.aClass124_2296) }),
																		(byte) -52)),
																i_36_, (long) class142.anInt2276, i_28_);
											}
										}
									}
									class124s = class94.aClass124Array1479;
									if (Class49.aBoolean814)
										class124s = Static2.method1545(5, class124s);
									if (class124s != null) {
										for (int i_37_ = 4; i_37_ >= 0; i_37_--) {
											if (class124s[i_37_] != null) {
												short i_38_ = 0;
												if (i_37_ == 0)
													i_38_ = (short) 57;
												if (i_37_ == 1)
													i_38_ = (short) 42;
												if (i_37_ == 2)
													i_38_ = (short) 5;
												if (i_37_ == 3)
													i_38_ = (short) 35;
												if (i_37_ == 4)
													i_38_ = (short) 58;
												Class14_Sub11
														.method853(32, class124s[i_37_], class94.anInt1548,
																(Class14_Sub8_Sub7.method515(
																		(new Class124[] {
																				(Class14_Sub8_Sub1.aClass124_4101),
																				(class142.aClass124_2296) }),
																		(byte) -46)),
																i_38_, (long) class142.anInt2276, i_28_);
											}
										}
									}
									Class14_Sub11.method853(32, Static.aClass124_2802, class94.anInt1548,
											(Class14_Sub8_Sub7.method515((new Class124[] {
													Class14_Sub8_Sub1.aClass124_4101, class142.aClass124_2296 }),
													(byte) -105)),
											(short) 1001, (long) class142.anInt2276, i_28_);
								}
							} else if ((class94.anInt1548 != Static.anInt3960)
									|| Class14_Sub8.anInt2853 != i_28_)
								Class14_Sub11.method853(32, Class40.aClass124_665, class94.anInt1548,
										(Class14_Sub8_Sub7.method515(
												(new Class124[] { Class14_Sub6.aClass124_2809,
														Class14_Sub25.aClass124_3172, class142.aClass124_2296 }),
												(byte) -50)),
										(short) 32, (long) class142.anInt2276, i_28_);
						}
					}
					i_28_++;
				}
			}
		}
		if (i != 0)
			method44(true, 36);
		if (class94.aBoolean1455) {
			if (!Class14_Sub4.aBoolean2784) {
				for (int i_39_ = 9; i_39_ >= 5; i_39_--) {
					Class124 class124 = Class82.method1405((byte) -89, class94, i_39_);
					if (class124 != null) {
						Class14_Sub11.method853(32, class124, class94.anInt1548, class94.aClass124_1508, (short) 1007,
								(long) (i_39_ + 1), class94.anInt1478);
						Class125_Sub3.anInt3411++;
					}
				}
				Class124 class124 = Class54.method1217(class94, -99);
				if (class124 != null) {
					Class14_Sub11.method853(32, class124, class94.anInt1548, class94.aClass124_1508, (short) 48, 0L,
							class94.anInt1478);
					Static.anInt3954++;
				}
				for (int i_40_ = 4; i_40_ >= 0; i_40_--) {
					Class124 class124_41_ = Class82.method1405((byte) 124, class94, i_40_);
					if (class124_41_ != null) {
						Class125_Sub3.anInt3411++;
						Class14_Sub11.method853(32, class124_41_, class94.anInt1548, class94.aClass124_1508, (short) 1,
								(long) (i_40_ + 1), class94.anInt1478);
					}
				}
				if (Class14_Sub8_Sub39.method682(65280, method46(class94))) {
					Class14_Sub11.method853(32, Static2.aClass124_1781, class94.anInt1548,
							Class14_Sub8_Sub9.aClass124_4244, (short) 4, 0L, class94.anInt1478);
					Class66.anInt1045++;
				}
			} else if (Class36.method1105((byte) -105, method46(class94)) && (Static.anInt101 & 0x20) == 32)
				Class14_Sub11.method853(i + 32, Class125.aClass124_2082,
						class94.anInt1548, Class14_Sub8_Sub7.method515((new Class124[] { Class17.aClass124_408,
								Class54.aClass124_886, class94.aClass124_1508 }), (byte) -59),
						(short) 43, 0L, class94.anInt1478);
		}
	}

	public static int method46(Class94 class94) {
		Class14_Sub1 class14_sub1 = ((Class14_Sub1) (Class14_Sub8_Sub5.aClass55_4155
				.get(((long) class94.anInt1548 << 32) + (long) class94.anInt1478)));
		if (class14_sub1 != null)
			return class14_sub1.anInt2714;
		return class94.anInt1565;
	}

	public void method47(byte var1) {
		try {
			int var3;
			if (Class62.anInt988 == 0) {
				Runtime var2 = Runtime.getRuntime();
				var3 = (int) ((var2.totalMemory() + -var2.freeMemory()) / 1024L);
				long var4 = TimeUtil.getTime();
				if (Class64.aLong1014 == 0L) {
					Class64.aLong1014 = var4;
				}

				if (var3 > 16384 && var4 - Class64.aLong1014 < 5000L) {
					if (1000L < var4 - Class17.aLong410) {
						System.gc();
						Class17.aLong410 = var4;
					}

					Class51.anInt828 = 5;
					Class14_Sub9_Sub1.aClass124_4761 = Static.aClass124_94;
				} else {
					Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub36.aClass124_4702;
					Class51.anInt828 = 5;
					Class62.anInt988 = 10;
				}
			} else {
				int var13;
				if (Class62.anInt988 == 10) {
					Class66.method1296(4, 104, 104, 28);
					LightManager.method189(4, 104, 104);

					for (var13 = 0; var13 < 4; ++var13) {
						Class14_Sub21.aClass32Array3100[var13] = new Class32(104, 104);
					}

					Class62.anInt988 = 30;
					Class51.anInt828 = 10;
					Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub25.aClass124_4511;
				} else if (Class62.anInt988 == 30) {
					Class75.aClass9_Sub1_1167 = method51(true, 0, (byte) 10, true, false);
					Class109.aClass9_Sub1_1834 = method51(true, 1, (byte) -111, true, false);
					Class138.aClass9_Sub1_2222 = method51(false, 2, (byte) -102, true, true);
					Class14_Sub17.aClass9_Sub1_3021 = method51(true, 3, (byte) 98, true, false);
					Static2.aClass9_Sub1_2901 = method51(true, 4, (byte) -121, true, false);
					Class14_Sub13.aClass9_Sub1_2958 = method51(true, 5, (byte) 20, true, true);
					Class125_Sub2.aClass9_Sub1_3374 = method51(true, 6, (byte) -127, false, true);
					Class14_Sub8_Sub38.aClass9_Sub1_4739 = method51(true, 7, (byte) 61, true, false);
					Class14_Sub3.aClass9_Sub1_2750 = method51(true, 8, (byte) -104, true, false);
					Class98.aClass9_Sub1_1666 = method51(true, 9, (byte) 119, true, false);
					Class14_Sub8_Sub14.aClass9_Sub1_4323 = method51(true, 10, (byte) -84, true, false);
					Class14_Sub8_Sub31.aClass9_Sub1_4603 = method51(true, 11, (byte) 76, true, false);
					Class14_Sub8_Sub26.aClass9_Sub1_4521 = method51(true, 12, (byte) 9, true, false);
					Class64.aClass9_Sub1_1015 = method51(true, 13, (byte) 69, true, false);
					Static2.aClass9_Sub1_5085 = method51(true, 14, (byte) -89, false, false);
					Class47.aClass9_Sub1_790 = method51(true, 15, (byte) 58, true, false);
					Class89.aClass9_Sub1_1407 = method51(true, 16, (byte) -117, true, false);
					Static2.aClass9_Sub1_369 = method51(true, 17, (byte) -78, true, false);
					Class102.aClass9_Sub1_1712 = method51(true, 18, (byte) -76, true, false);
					Class127.aClass9_Sub1_2111 = method51(true, 19, (byte) -83, true, false);
					Class22.aClass9_Sub1_459 = method51(true, 20, (byte) 126, true, false);
					Static2.aClass9_Sub1_1690 = method51(true, 21, (byte) -99, true, false);
					Class14_Sub8.aClass9_Sub1_2848 = method51(true, 22, (byte) 22, true, false);
					Class7_Sub1.aClass9_Sub1_2657 = method51(true, 23, (byte) -127, true, true);
					Class14_Sub21.aClass9_Sub1_3111 = method51(true, 24, (byte) -128, true, false);
					Class28.aClass9_Sub1_513 = method51(true, 25, (byte) 73, true, false);
					Class14_Sub2_Sub7.aClass9_Sub1_3824 = method51(true, 26, (byte) -85, true, true);
					Class51.anInt828 = 15;
					Class62.anInt988 = 40;
					Class14_Sub9_Sub1.aClass124_4761 = Static2.aClass124_1693;
				} else {
					byte var6;
					if (Class62.anInt988 == 40) {
						var6 = 0;
						var13 = var6 + Class75.aClass9_Sub1_1167.method186((byte) 91) * 4 / 100;
						var13 += Class109.aClass9_Sub1_1834.method186((byte) 65) * 4 / 100;
						var13 += Class138.aClass9_Sub1_2222.method186((byte) 119) * 1 / 100;
						var13 += Class14_Sub17.aClass9_Sub1_3021.method186((byte) 75) * 2 / 100;
						var13 += Static2.aClass9_Sub1_2901.method186((byte) 61) * 6 / 100;
						var13 += Class14_Sub13.aClass9_Sub1_2958.method186((byte) 93) * 4 / 100;
						var13 += Class125_Sub2.aClass9_Sub1_3374.method186((byte) 103) * 2 / 100;
						var13 += Class14_Sub8_Sub38.aClass9_Sub1_4739.method186((byte) 106) * 50 / 100;
						var13 += Class14_Sub3.aClass9_Sub1_2750.method186((byte) 100) * 2 / 100;
						var13 += Class98.aClass9_Sub1_1666.method186((byte) 99) * 2 / 100;
						var13 += Class14_Sub8_Sub14.aClass9_Sub1_4323.method186((byte) 76) * 2 / 100;
						var13 += Class14_Sub8_Sub31.aClass9_Sub1_4603.method186((byte) 108) * 2 / 100;
						var13 += Class14_Sub8_Sub26.aClass9_Sub1_4521.method186((byte) 72) * 2 / 100;
						var13 += Class64.aClass9_Sub1_1015.method186((byte) 113) * 2 / 100;
						var13 += Static2.aClass9_Sub1_5085.method186((byte) 85) * 2 / 100;
						var13 += Class47.aClass9_Sub1_790.method186((byte) 111) * 2 / 100;
						var13 += Class89.aClass9_Sub1_1407.method186((byte) 104) * 1 / 100;
						var13 += Static2.aClass9_Sub1_369.method186((byte) 104) * 1 / 100;
						var13 += Class102.aClass9_Sub1_1712.method186((byte) 68) * 1 / 100;
						var13 += Class127.aClass9_Sub1_2111.method186((byte) 109) * 1 / 100;
						var13 += Class22.aClass9_Sub1_459.method186((byte) 96) * 1 / 100;
						var13 += Static2.aClass9_Sub1_1690.method186((byte) 97) * 1 / 100;
						var13 += Class14_Sub8.aClass9_Sub1_2848.method186((byte) 90) * 1 / 100;
						var13 += Class7_Sub1.aClass9_Sub1_2657.method186((byte) 95) * 1 / 100;
						var13 += Class14_Sub21.aClass9_Sub1_3111.method186((byte) 120) * 1 / 100;
						var13 += Class28.aClass9_Sub1_513.method186((byte) 119) * 1 / 100;
						var13 += Class14_Sub2_Sub7.aClass9_Sub1_3824.method186((byte) 81) * 1 / 100;
						if (var13 != 100) {
							if (var13 != 0) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(
										new Class124[] { Class17.aClass124_405, Class83.method1407(106, var13),
												Class14_Sub21.aClass124_3104 },
										(byte) -38);
							}

							Class51.anInt828 = 20;
						} else {
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub22.aClass124_4453;
							Class51.anInt828 = 20;
							Static.method1222(Class14_Sub3.aClass9_Sub1_2750, (byte) 89);
							Class14_Sub2_Sub21.method444(-30451, Class14_Sub3.aClass9_Sub1_2750);
							Class152.method2044(Class14_Sub3.aClass9_Sub1_2750, (byte) -126);
							Class14_Sub2_Sub17.method376((byte) 111, Class14_Sub3.aClass9_Sub1_2750);
							Class62.anInt988 = 45;
						}
					} else if (Class62.anInt988 == 45) {
						Class131.method1772(Class14_Sub8_Sub26.aBoolean4528, 2, (byte) 29, 22050);
						Class125.aClass14_Sub9_Sub1_2071 = new Class14_Sub9_Sub1();
						Class125.aClass14_Sub9_Sub1_2071.method702(0, 9, 128);
						Class14_Sub8_Sub35.aClass75_4682 = Static.method235(22050, 68,
								Class14_Sub8_Sub34.aClass43_4647, Class49.aCanvas819, 0);
						Class14_Sub8_Sub35.aClass75_4682.method1352(Class125.aClass14_Sub9_Sub1_2071, false);
						Class88.method1438(Class125.aClass14_Sub9_Sub1_2071, Static2.aClass9_Sub1_5085,
								false, Class47.aClass9_Sub1_790, Static2.aClass9_Sub1_2901);
						Class134.aClass75_2588 = Static.method235(2048, 97, Class14_Sub8_Sub34.aClass43_4647,
								Class49.aCanvas819, 1);
						Class33.aClass14_Sub9_Sub2_585 = new Class14_Sub9_Sub2();
						Class134.aClass75_2588.method1352(Class33.aClass14_Sub9_Sub2_585, false);
						SceneCluster.aClass18_1362 = new Class18(22050, Class115.anInt1909);
						Static.anInt97 = Class125_Sub2.aClass9_Sub1_3374.method146(Class125.aClass124_2084, 0);
						Class14_Sub9_Sub1.aClass124_4761 = Class4.aClass124_131;
						Class51.anInt828 = 30;
						Class62.anInt988 = 50;
					} else if (Class62.anInt988 == 50) {
						var13 = Class47.method1185(Class64.aClass9_Sub1_1015, true, Class14_Sub3.aClass9_Sub1_2750);
						var3 = Class76.method1357(-21193);
						if (var13 < var3) {
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(
									new Class124[] { Class110.aClass124_1853,
											Class83.method1407(53, var13 * 100 / var3), Class14_Sub21.aClass124_3104 },
									(byte) -82);
							Class51.anInt828 = 35;
						} else {
							Class51.anInt828 = 35;
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8.aClass124_2855;
							Class62.anInt988 = 60;
						}
					} else if (Class62.anInt988 == 60) {
						var13 = Class14_Sub8_Sub14.method550(Class14_Sub3.aClass9_Sub1_2750, (byte) 61);
						var3 = Class115.method1589((byte) -91);
						if (var13 < var3) {
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(
									new Class124[] { Class14_Sub8_Sub2.aClass124_4122,
											Class83.method1407(28, var13 * 100 / var3), Class14_Sub21.aClass124_3104 },
									(byte) -107);
							Class51.anInt828 = 40;
						} else {
							Class62.anInt988 = 65;
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub13.aClass124_4302;
							Class51.anInt828 = 40;
						}
					} else {
						var13 = 80 / ((21 - var1) / 38);
						if (Class62.anInt988 == 65) {
							for (var3 = 0; var3 < 6; ++var3) {
								Class31 var14 = Class14_Sub8_Sub34.aClass43_4647.method1142(this.getClass(), 10);

								while (var14.anInt529 == 0) {
									Util.sleep(100L);
								}

								if (var14.anInt529 == 1) {
									break;
								}

								if (var3 == 5) {
									this.method28("dll", -1);
									Class14_Sub8_Sub16.anInt4356 = 1000;
									return;
								}

								Util.sleep(1000L);
							}

							var3 = RT4GL.method1621(Class49.aCanvas819, Class135.anInt2189 * 2);
							if (var3 != 0) {
								String var15 = RT4GL.aString2031;
								String var7 = "unknown";
								String var8 = RT4GL.aString2037;
								String var9 = var15.toLowerCase();
								if (var9.indexOf("microsoft") != -1) {
									var7 = "vesa";
								} else if (var9.indexOf("nvidia") == -1) {
									if (var9.indexOf("intel") != -1) {
										var7 = "intel";
									} else if (var9.indexOf("s3") == -1) {
										if (var9.indexOf("ati") != -1) {
											var7 = "ati";
										}
									} else if (var8.toLowerCase().indexOf("unichrome") == -1) {
										var7 = "s3";
									} else {
										var7 = "via_s3";
									}
								} else {
									var7 = "nvidia";
								}

								String var10 = this.method50(true,
										Class43.os_name + " " + Class43.os_arch + " " + Class43.aString717);
								String var11 = this.method50(true, var15 + " " + var8);
								this.method35("os=" + var10 + "&gcard=" + var11 + "&error_code=" + var3, "caps_" + var7,
										(byte) 52);
								Class14_Sub8_Sub16.anInt4356 = 1000;
							} else {
								ShadowManager.method2029(104, 104);
								Class14_Sub15.method871(Class14_Sub3.aClass9_Sub1_2750, Class64.aClass9_Sub1_1015,
										-102);
								Class51.anInt828 = 45;
								Class14_Sub9_Sub1.aClass124_4761 = Class123.aClass124_2068;
								Class126.method1743(27252, 5);
								Class62.anInt988 = 70;
							}
						} else if (Class62.anInt988 == 70) {
							Class138.aClass9_Sub1_2222.method170(false);
							var6 = 0;
							var3 = var6 + Class138.aClass9_Sub1_2222.method173(100);
							Class89.aClass9_Sub1_1407.method170(false);
							var3 += Class89.aClass9_Sub1_1407.method173(100);
							Static2.aClass9_Sub1_369.method170(false);
							var3 += Static2.aClass9_Sub1_369.method173(100);
							Class102.aClass9_Sub1_1712.method170(false);
							var3 += Class102.aClass9_Sub1_1712.method173(100);
							Class127.aClass9_Sub1_2111.method170(false);
							var3 += Class127.aClass9_Sub1_2111.method173(100);
							Class22.aClass9_Sub1_459.method170(false);
							var3 += Class22.aClass9_Sub1_459.method173(100);
							Static2.aClass9_Sub1_1690.method170(false);
							var3 += Static2.aClass9_Sub1_1690.method173(100);
							Class14_Sub8.aClass9_Sub1_2848.method170(false);
							var3 += Class14_Sub8.aClass9_Sub1_2848.method173(100);
							Class14_Sub21.aClass9_Sub1_3111.method170(false);
							var3 += Class14_Sub21.aClass9_Sub1_3111.method173(100);
							Class28.aClass9_Sub1_513.method170(false);
							var3 += Class28.aClass9_Sub1_513.method173(100);
							if (var3 < 1000) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(
										new Class124[] { Class14_Sub28.aClass124_3226,
												Class83.method1407(28, var3 / 10), Class14_Sub21.aClass124_3104 },
										(byte) -57);
								Class51.anInt828 = 50;
							} else {
								Class86.method1424(-256, Class138.aClass9_Sub1_2222);
								Class32.method1072(Class138.aClass9_Sub1_2222, (byte) -104);
								Class133_Sub1.method1793(Class138.aClass9_Sub1_2222, 14555);
								Class14_Sub8_Sub19.method581(Class138.aClass9_Sub1_2222, false,
										Class14_Sub8_Sub38.aClass9_Sub1_4739);
								Class7_Sub3_Sub1.method138(false, Class89.aClass9_Sub1_1407,
										Class14_Sub8_Sub38.aClass9_Sub1_4739, Class132.aBoolean2170);
								Class14_Sub19.method891(Class102.aClass9_Sub1_1712, -127,
										Class14_Sub8_Sub38.aClass9_Sub1_4739);
								Class123.method1664(Class127.aClass9_Sub1_2111, Class132.aBoolean2170,
										Class131.aClass14_Sub2_Sub16_Sub1_2160, (byte) -26,
										Class14_Sub8_Sub38.aClass9_Sub1_4739);
								Class14_Sub29.method934(Class138.aClass9_Sub1_2222, 54);
								Static2.method2000(Class75.aClass9_Sub1_1167, Class22.aClass9_Sub1_459, (byte) -86,
										Class109.aClass9_Sub1_1834);
								Class108.method1561(Static2.aClass9_Sub1_1690, (byte) 127,
										Class14_Sub8_Sub38.aClass9_Sub1_4739);
								Static.method234(Class14_Sub8.aClass9_Sub1_2848, (byte) -77);
								Static.method1018((byte) -68, Class138.aClass9_Sub1_2222);
								Class14_Sub2_Sub9.method305(Class64.aClass9_Sub1_1015,
										Class14_Sub8_Sub38.aClass9_Sub1_4739, Class14_Sub3.aClass9_Sub1_2750,
										Class14_Sub17.aClass9_Sub1_3021, (byte) -97);
								Class132.method1777((byte) -57, Class138.aClass9_Sub1_2222);
								Class45.method1164(Static2.aClass9_Sub1_369, 35);
								Applet_Sub1.method31(Class28.aClass9_Sub1_513, (byte) -4, new Class38(),
										Class14_Sub21.aClass9_Sub1_3111);
								Class14_Sub30.method939(Class14_Sub21.aClass9_Sub1_3111, Class28.aClass9_Sub1_513, 16);
								Class14_Sub9_Sub1.aClass124_4761 = Class28.aClass124_514;
								Class51.anInt828 = 50;
								Class14_Sub8_Sub20.method583(-111);
								Class62.anInt988 = 80;
							}
						} else if (Class62.anInt988 == 80) {
							var3 = Class133_Sub1_Sub1.method1805(31673, Class14_Sub3.aClass9_Sub1_2750);
							var13 = Class84.method1412((byte) -125);
							if (var3 < var13) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(new Class124[] {
										Class75.aClass124_1182, Class83.method1407(72, var3 * 100 / var13),
										Class14_Sub21.aClass124_3104 }, (byte) -45);
								Class51.anInt828 = 60;
							} else {
								Static.method85(Class14_Sub3.aClass9_Sub1_2750, true);
								Class14_Sub9_Sub1.aClass124_4761 = Class108.aClass124_1814;
								Class62.anInt988 = 90;
								Class51.anInt828 = 60;
							}
						} else if (Class62.anInt988 == 90) {
							if (!Class14_Sub2_Sub7.aClass9_Sub1_3824.method170(false)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7
										.method515(new Class124[] { Class14_Sub2_Sub12.aClass124_3910,
												Class83.method1407(43,
														Class14_Sub2_Sub7.aClass9_Sub1_3824.method173(100)),
										Class14_Sub21.aClass124_3104 }, (byte) -32);
								Class51.anInt828 = 70;
							} else {
								Class134 var16 = new Class134(Class98.aClass9_Sub1_1666,
										Class14_Sub2_Sub7.aClass9_Sub1_3824, Class14_Sub3.aClass9_Sub1_2750, 200,
										!Class125_Sub3.aBoolean3397);
								Class3.method93(var16);
								if (!RT4.useLighting) {
									if (Class14_Sub8_Sub6.anInt4190 == 1) {
										Class3.method103(0.9F);
									}

									if (Class14_Sub8_Sub6.anInt4190 == 2) {
										Class3.method103(0.8F);
									}

									if (Class14_Sub8_Sub6.anInt4190 == 3) {
										Class3.method103(0.7F);
									}

									if (Class14_Sub8_Sub6.anInt4190 == 4) {
										Class3.method103(0.6F);
									}
								} else {
									Class3.method103(0.7F);
								}

								Class14_Sub9_Sub1.aClass124_4761 = aClass124_2631;
								Class51.anInt828 = 70;
								Class62.anInt988 = 100;
							}
						} else if (Class62.anInt988 == 100) {
							Class62.anInt988 = 110;
						} else if (Class62.anInt988 == 110) {
							Class14_Sub2_Sub11.aClass100_3878 = new MouseCapturer();
							Class14_Sub8_Sub34.aClass43_4647.method1143(10, Class14_Sub2_Sub11.aClass100_3878, 0);
							Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub9_Sub1.aClass124_4773;
							Class51.anInt828 = 75;
							Class62.anInt988 = 120;
						} else if (Class62.anInt988 == 120) {
							if (!Class14_Sub8_Sub14.aClass9_Sub1_4323.method159(4, Class14_Sub8_Sub9.aClass124_4244,
									Static2.aClass124_4891)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(new Class124[] {
										RuntimeException_Sub1.aClass124_2456, Class14_Sub11.aClass124_2942 },
										(byte) -59);
								Class51.anInt828 = 80;
							} else {
								Class5 var17 = new Class5(Class14_Sub8_Sub14.aClass9_Sub1_4323.method167(
										Static2.aClass124_4891, Class14_Sub8_Sub9.aClass124_4244, -65));
								Class139.method1955(-83, var17);
								Class51.anInt828 = 80;
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub2_Sub8.aClass124_3852;
								Class62.anInt988 = 130;
							}
						} else if (Class62.anInt988 == 130) {
							if (!Class14_Sub17.aClass9_Sub1_3021.method170(false)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7
										.method515(new Class124[] { Class14_Sub17.aClass124_3033,
												Class83.method1407(67,
														Class14_Sub17.aClass9_Sub1_3021.method173(100) * 3 / 4),
										Class14_Sub21.aClass124_3104 }, (byte) -64);
								Class51.anInt828 = 85;
							} else if (!Class14_Sub8_Sub26.aClass9_Sub1_4521.method170(false)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7
										.method515(
												new Class124[] { Class14_Sub17.aClass124_3033,
														Class83.method1407(71,
																75 + Class14_Sub8_Sub26.aClass9_Sub1_4521.method173(100)
																		/ 10),
														Class14_Sub21.aClass124_3104 },
												(byte) -11);
								Class51.anInt828 = 85;
							} else if (!Class64.aClass9_Sub1_1015.method170(false)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7
										.method515(new Class124[] { Class14_Sub17.aClass124_3033,
												Class83.method1407(85,
														Class64.aClass9_Sub1_1015.method173(100) / 20 + 85),
										Class14_Sub21.aClass124_3104 }, (byte) -8);
								Class51.anInt828 = 85;
							} else if (!Class7_Sub1.aClass9_Sub1_2657.method160(Class14_Sub9_Sub3.aClass124_4844,
									(byte) -102)) {
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub8_Sub7.method515(new Class124[] {
										Class14_Sub17.aClass124_3033,
										Class83.method1407(28,
												Class7_Sub1.aClass9_Sub1_2657
														.method151(Class14_Sub9_Sub3.aClass124_4844, -121) / 10 + 90),
										Class14_Sub21.aClass124_3104 }, (byte) -50);
								Class51.anInt828 = 85;
							} else {
								Class14_Sub8.method471(Class133_Sub1_Sub1.aClass148_Sub1Array4938,
										Class32.aClass148_Sub1Array540, Class97.aClass148_Sub1Array1651,
										Class133.aClass14_Sub2_Sub19_Sub1Array2186, Class7_Sub1.aClass9_Sub1_2657, 90,
										Class14_Sub29.aClass148_Sub1Array3265);
								Class14_Sub9_Sub1.aClass124_4761 = Class14_Sub9_Sub1.aClass124_4762;
								Class62.anInt988 = 140;
								Class51.anInt828 = 100;
							}
						} else if (Class62.anInt988 == 140) {
							Class14_Sub8_Sub6.anInt4187 = Class14_Sub17.aClass9_Sub1_3021
									.method146(Class14_Sub8_Sub21.aClass124_4445, 0);
							Class14_Sub13.aClass9_Sub1_2958.method175((byte) -99, true, false);
							Class125_Sub2.aClass9_Sub1_3374.method175((byte) -99, true, true);
							Class14_Sub3.aClass9_Sub1_2750.method175((byte) -99, true, true);
							Class64.aClass9_Sub1_1015.method175((byte) -99, true, true);
							Class14_Sub8_Sub14.aClass9_Sub1_4323.method175((byte) -99, true, true);
							Class14_Sub17.aClass9_Sub1_3021.method175((byte) -99, true, true);
							Class65.aBoolean1026 = true;
							Class109.method1568((byte) -55);
						}
					}
				}
			}

		} catch (Throwable var12) {
			throw Class14_Sub8_Sub14.method554(var12, "client.H(" + var1 + ')');
		}
	}

	public static void method48(byte vara0) {
		try {
			if (Class14_Sub2_Sub11.anInt3889 != 1) {
				return;
			}

			int var1 = Class133_Sub5.aClass14_Sub9_Sub1_3625.method727(0);
			if (var1 > 0 && Class133_Sub5.aClass14_Sub9_Sub1_3625.method721((byte) 111)) {
				var1 -= Class14_Sub15.anInt2989;
				if (var1 < 0) {
					var1 = 0;
				}

				Class133_Sub5.aClass14_Sub9_Sub1_3625.method710(-28225, var1);
				return;
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(116 - 43);
			Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
			Class14_Sub2_Sub11.anInt3889 = 0;
			Class9_Sub1.aClass9_2696 = null;
			Static.aClass120_854 = null;
			return;
		}
		Class133_Sub5.aClass14_Sub9_Sub1_3625.method697(76);
		Class133_Sub5.aClass14_Sub9_Sub1_3625.method716((byte) -43);
		Class14_Sub9_Sub1.aClass14_Sub16_4780 = null;
		Static.aClass120_854 = null;
		if (Class9_Sub1.aClass9_2696 == null) {
			Class14_Sub2_Sub11.anInt3889 = 0;
		} else {
			Class14_Sub2_Sub11.anInt3889 = 2;
		}
	}

	public static boolean method49(Class94 class94) {
		if (Class125_Sub3.aBoolean3392) {
			if (method46(class94) != 0)
				return false;
			if (class94.anInt1489 == 0)
				return false;
		}
		return class94.aBoolean1503;
	}

	public void method33(int i) {
		method52(121);
		Class124.method1715((byte) -83);
		Class56.method1237(1232386310);
		Class14_Sub2_Sub5.method284(12800);
		Class146.method1995(-103);
		Applet_Sub1.method39(true);
		RT4GL.method1654();
		Static2.method1502(-17808);
		Class108.method1556(false);
		Static2.method1515(-25576);
		Class66.method1295(-597398239);
		Static2.method815(0);
		Class36.method1102((byte) -40);
		Class9_Sub1.method181(97);
		Class76.method1364(53);
		Class114.method1585(false);
		Static.method1206((byte) -89);
		Class133_Sub1_Sub2.method1811(-1);
		Static2.method846((byte) 0);
		Static.method89(i - 31);
		Class32.method1067(i + 10795);
		Class94.method1470(-56);
		Class88.method1437(false);
		Class133_Sub1_Sub1.method1806(i + 86);
		Static.method1236((byte) -128);
		Class129.method1764(i ^ ~0x73);
		Class14_Sub23.method902(-7741);
		Class109.method1571(0);
		Static2.method388(-117);
		Class14_Sub9_Sub1.method703(false);
		Class75.method1346((byte) 78);
		Class18.method962((byte) -118);
		Class102.method1525(123);
		Static2.method1175(i - 153);
		Class133_Sub1.method1797(79);
		Class14_Sub29.method930((byte) -34);
		Class14_Sub14.method869((byte) 92);
		Class12.method211((byte) -83);
		Class14_Sub15.method872((byte) 114);
		Static2.method232(-21518);
		Static.method1403(0);
		Static2.method1542(-86);
		Class122.method1659(-103);
		Class33.method1085(i ^ 0x67e8c58);
		Class69.method1309(21954);
		RuntimeException_Sub1.method2051(-64);
		Class110.method1575(true);
		Class140.method1956((byte) 120);
		Class42.method1134(0);
		Class79.method1380(true);
		Class53.method1212(-1);
		AtmosphericEffects.dispose();
		Class22.method988((byte) -108);
		Class9.method150(3);
		Class133_Sub2.method1828();
		Class86.method1421((byte) 2);
		ModelHD.method1909();
		Class142.method1969(true);
		ModelSD.method1877();
		Class141.method1962(false);
		Class97.method1490();
		Class84.method1414(false);
		Class118.method1604(-4);
		Class24.method992((byte) 64);
		Class103.method1527((byte) 121);
		Class120.method1614((byte) -16);
		Class11.method207();
		Class90.method1445(-104);
		Class64.method1287(i - 12096);
		Static2.method1997(64);
		Class14_Sub2_Sub16.method367();
		Class15.method945(0);
		Class14_Sub27.method923();
		Class40.method1127(0);
		SceneCluster.method1416(2);
		Class133.method1785((byte) -78);
		Class37.method1110(i ^ i);
		Class4.method108((byte) 127);
		Class115.method1588((byte) 102);
		Class153.method2048(2);
		Class6.method114();
		Class14_Sub2_Sub6.method287();
		Static2.method248(32);
		Static.method970(5);
		Class134.method1925((byte) 32);
		Class3.method106();
		Class92.method1463();
		Static2.method258(1869706832);
		Static2.method334(-121);
		LightManager.dispose();
		Static.method1327((byte) -100);
		Static.method339(15121);
		Static.method1132(118);
		ShadowManager.method2040();
		Shadow.dispose();
		Class83.method1410(-28990);
		Class25.method1001();
		Class104.method1535((byte) -122);
		Class56_Sub1.method1243((byte) -115);
		Class87.method1434();
		Class116.method1599(-16844);
		Class63.method1281((byte) -122);
		Class49.method1196((byte) 41);
		Canvas_Sub2.method65((byte) -7);
		Class58.method1258(1);
		Class14_Sub2_Sub9.method302((byte) 118);
		Class14_Sub18.method883(1);
		Class27.method1034();
		Class14_Sub9_Sub3.method736(i - 31);
		Class14_Sub28.method926((byte) 27);
		Class48.method1193(50);
		Class47.method1186(-192);
		Class14_Sub2_Sub2.method262((byte) 111);
		Class150.method2021((byte) -85);
		Class137.method1940((byte) 103);
		Class21.method979(i ^ 0x45);
		Class14_Sub2_Sub3.method276(i ^ ~0x3bec);
		Class111.method1576(i + 84);
		Class67.method1298(i - 33);
		Class60.method1269((byte) 4);
		Class51.method1200(10);
		Class35.method1095(-572);
		Scenegraph.destroy();
		Class14_Sub2_Sub20.method430(true);
		Class14_Sub2_Sub8.method291((byte) -78);
		Class14_Sub2_Sub21.method436(-106);
		Class14_Sub2_Sub11.method313(112);
		Class5.method111((byte) 76);
		Class131.method1775(-93);
		Class44.method1157((byte) 95);
		Class112.method1579((byte) -128);
		Class98.method1495(115);
		Class14_Sub21.method893((byte) 113);
		Static2.method1316(true);
		Class139.method1953((byte) -98);
		Class59.method1261((byte) 16);
		Class54.method1219(123);
		Class14_Sub13.method863((byte) 92);
		Static.method325(8);
		Class14_Sub25.method916(-111);
		RT4.dispose();
		Class14_Sub3.method453(-24);
		Class70.method1312(0);
		Class14_Sub2_Sub12.method320((byte) -48);
		Class74.method1334((byte) -127);
		Synthesizer.dispose();
		Class62.method1274(124);
		Class96.method1487(false);
		Class123.method1661(-19);
		Class133_Sub6.method1852(112);
		Class133_Sub5.method1846(false);
		Static.method239(false);
		Class133_Sub3.method1831((byte) -44);
		Class133_Sub4.method1837(0);
		Class128.method1756(true);
		Class14_Sub30.method942(8);
		Class82.method1404((byte) -69);
		Class14_Sub4.method455(i ^ ~0x6a);
		Canvas_Sub1.method60(5027);
		Class17.method959(-1);
		Static2.method1509(0);
		Class138.method1948(i + 69);
		Class89.method1442(127);
		Class126.method1746(i ^ 0xe0);
		Static2.method381(i ^ ~0x5d);
		Static2.method383(2);
		Static2.method1119(127);
		Class14_Sub17.method880(i ^ 0x1e);
		Class127.method1753(false);
		Class75_Sub2.method1355();
		Filter.dispose();
		AnimFrame.dispose();
		Class1.method72(false);
		Class136.method1929();
		Class117.method1600((byte) 113);
		Static.method461(-61);
		Class14_Sub19.method887((byte) -103);
		Class14_Sub24.method914();
		Class16.method948();
		Class107.method1554((byte) -118);
		Class14_Sub8.method476((byte) -65);
		Class152.method2043(119);
		Static.method1014((byte) 116);
		Class95.method1484(i ^ 0x1d);
		Class149.method2017((byte) -115);
		Class119.method1613();
		LavaShader.method1271();
		Class34.method1090();
		Static.method967(-20514);
		Class14_Sub11.method856((byte) 8);
		Class68.method1306(-84);
		Class132.method1776(true);
		Class28.method1050((byte) 109);
		Class14_Sub8_Sub23.method600(1);
		Class14_Sub8_Sub39.method680((byte) -82);
		Class14_Sub8_Sub19.method579((byte) 95);
		Class14_Sub8_Sub7.method510(i ^ ~0x6b);
		Class14_Sub8_Sub22.method599(false);
		Class14_Sub8_Sub14.method553(0);
		Class14_Sub8_Sub34.method660(false);
		Class14_Sub8_Sub25.method614((byte) 119);
		Class14_Sub8_Sub5.method500((byte) 122);
		Class14_Sub8_Sub2.method489(-51);
		Class14_Sub8_Sub21.method590(true);
		Class14_Sub8_Sub27.method624(2);
		Class14_Sub8_Sub17.method570(4);
		Class14_Sub8_Sub4.method496((byte) 64);
		Class14_Sub8_Sub37.method673(false);
		Class14_Sub8_Sub11.method533(true);
		Class14_Sub8_Sub15.method556(127);
		Class14_Sub8_Sub36.method668((byte) -109);
		Class14_Sub8_Sub38.method677(127);
		Class14_Sub8_Sub24.method612((byte) 117);
		Class14_Sub8_Sub39_Sub1.method684(16711680);
		Class14_Sub8_Sub29.method635(-45);
		Class14_Sub8_Sub30.method640(127);
		Class14_Sub8_Sub13.method547((byte) 38);
		Class14_Sub8_Sub26.method620(false);
		Class14_Sub8_Sub16.method562(-84);
		Class14_Sub8_Sub31.method646(true);
		Class14_Sub8_Sub20.method585((byte) 127);
		Class14_Sub8_Sub8.method518((byte) 88);
		Class14_Sub8_Sub10.method528(512);
		Class14_Sub8_Sub6.method508((byte) -123);
		Class14_Sub8_Sub18.method573(3);
		Class14_Sub8_Sub9.method524(56800372);
		Class14_Sub8_Sub28.method629(-123);
		Class14_Sub8_Sub32.method651(-28268);
		Class14_Sub8_Sub3.method491(0);
		SoftCache.dispose();
		Class14_Sub8_Sub33.method654(i - 1);
		PacketBuffer.dispose();
		Class14_Sub8_Sub35.method666(false);
		Class14_Sub8_Sub1.method486(120);
		Static.method1030(i - 158);
		Static.method1024(4095);
		Class7_Sub2.method126(117);
		Class7.method119(i - 110);
		Class7_Sub2_Sub1.method129(75);
		Class7_Sub1.method123((byte) -18);
		Class7_Sub3_Sub1.method137(-8020);
		Class7_Sub3.method133(true);
		Class14_Sub2_Sub4.method280((byte) 106);
		Class14_Sub2_Sub10.method306(0);
		Class14_Sub2_Sub7.method288(1);
		Class14_Sub20.method892(15075);
		Class45.method1165((byte) -62);
		Class14_Sub2_Sub17.method374((byte) 73);
		Class14_Sub22.method900((byte) 127);
		Class14_Sub6.method467(-270693430);
		Class125.method1727(10);
		Class125_Sub2.method1731(-16888);
		Class125_Sub3.method1738(-1);
		Class125_Sub4.method1739(-23);
		Class125_Sub1.method1730(i ^ ~0x7a);
	}

	public String method50(boolean bool, String string) {
		StringBuffer stringbuffer = new StringBuffer();
		if (!bool)
			method29(-17);
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (c >= 48 && c <= 57 || c >= 97 && c <= 122 || c >= 65 && c <= 90)
				stringbuffer.append(c);
			else {
				stringbuffer.append('%');
				int i_69_ = (c & 0xfe) >> 36;
				if (i_69_ < 0 || i_69_ > 9) {
					if (i_69_ >= 10 && i_69_ <= 15)
						stringbuffer.append((char) (i_69_ + 65 - 10));
				} else
					stringbuffer.append((char) (i_69_ + 48));
				i_69_ = c & 0xf;
				if (i_69_ >= 0 && i_69_ <= 9)
					stringbuffer.append((char) (i_69_ + 48));
				else if (i_69_ >= 10 && i_69_ <= 15)
					stringbuffer.append((char) (i_69_ + 65 - 10));
			}
		}
		String string_70_ = stringbuffer.toString();
		return string_70_;
	}

	public static Class9_Sub1 method51(boolean bool, int i, byte i_71_, boolean bool_72_, boolean bool_73_) {
		Class114 class114 = null;
		int i_74_ = -104 / ((-31 - i_71_) / 40);
		if (Class14_Sub8_Sub1.aClass76_4098 != null)
			class114 = new Class114(i, Class14_Sub8_Sub1.aClass76_4098, Class58.aClass76Array944[i], 1000000);
		Class9_Sub1 class9_sub1 = new Class9_Sub1(class114, Class14_Sub23.aClass114_3126, i, bool_73_, bool, bool_72_);
		return class9_sub1;
	}

	public void method34(boolean bool) {
		try {
			if (Class14_Sub8_Sub16.anInt4356 != 1000) {
				Class14_Sub2_Sub20.anInt4064++;
				if (bool) {
					if (Class14_Sub2_Sub20.anInt4064 % 1000 == 1) {
						GregorianCalendar gregoriancalendar = new GregorianCalendar();
						Class32.anInt563 = (gregoriancalendar.get(11) * 600 + gregoriancalendar.get(12) * 10
								+ gregoriancalendar.get(13) / 6);
						Class104.aRandom1732.setSeed((long) Class32.anInt563);
					}
					method56(20);
					Class14_Sub8_Sub31.method648((byte) 74);
					method48((byte) 116);
					Class138.method1946(139);
					Class17.method956(false);
					Class14_Sub2_Sub21.method440((byte) -114);
					Class11.method205();
					if (Class44.aClass129_726 != null) {
						int i = Class44.aClass129_726.method1763(-128);
						Class113.anInt1881 = i;
					}
					if (Class14_Sub8_Sub16.anInt4356 == 0) {
						method47((byte) 119);
						Class14_Sub8_Sub11.method531((byte) -112);
					} else if (Class14_Sub8_Sub16.anInt4356 != 5) {
						if (Class14_Sub8_Sub16.anInt4356 == 25 || Class14_Sub8_Sub16.anInt4356 == 28)
							Static.method329(true);
					} else {
						method47((byte) 122);
						Class14_Sub8_Sub11.method531((byte) -112);
					}
					if (Class14_Sub8_Sub16.anInt4356 == 10) {
						method53((byte) 102);
						Class115.method1593(-2);
						Static2.method1315(0);
					} else if (Class14_Sub8_Sub16.anInt4356 != 30) {
						if (Class14_Sub8_Sub16.anInt4356 == 40) {
							Static2.method1315(0);
							if (Class14_Sub8_Sub26.anInt4525 != -3) {
								if (Class14_Sub8_Sub26.anInt4525 != 15) {
									if (Class14_Sub8_Sub26.anInt4525 != 2)
										Class109.method1568((byte) -96);
								} else
									Class111.method1578(86);
							}
						}
					} else
						Static.method460(0);
				}
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			throw Class14_Sub8_Sub14.method554(throwable,
					new StringBuilder("client.K(").append(bool).append(')').toString());
		}
	}

	public static void method52(int i) {
		aClass124Array2645 = null;
		if (i < 54)
			method49(null);
		aClass124_2625 = null;
		anIntArray2644 = null;
		aClass124_2639 = null;
		aClass124_2636 = null;
		aClass124_2637 = null;
		aClass124_2631 = null;
	}

	public void method38(boolean bool) {
		RT4GL.method1630();
		BrowserControlUtil.destroy();
		if (Static.aFrame3962 != null) {
			Class14_Sub2_Sub4.method278(Class14_Sub8_Sub34.aClass43_4647, Static.aFrame3962, -119);
			Static.aFrame3962 = null;
		}
		if (Class14_Sub8_Sub34.aClass43_4647 != null)
			Class14_Sub8_Sub34.aClass43_4647.method1151(this.getClass(), false);
		if (Class14_Sub2_Sub11.aClass100_3878 != null)
			Class14_Sub2_Sub11.aClass100_3878.running = false;
		Class14_Sub2_Sub11.aClass100_3878 = null;
		if (Class14_Sub15.aClass36_2990 != null) {
			Class14_Sub15.aClass36_2990.method1101((byte) -115);
			Class14_Sub15.aClass36_2990 = null;
		}
		Class63.method1280(Class49.aCanvas819, (byte) 127);
		Class76.method1356(false, Class49.aCanvas819);
		if (Class44.aClass129_726 != null)
			Class44.aClass129_726.method1765(true, Class49.aCanvas819);
		Class14_Sub8_Sub3.method494((byte) -94);
		Class14_Sub8_Sub38.method676(-96);
		Class44.aClass129_726 = null;
		if (Class14_Sub8_Sub35.aClass75_4682 != null)
			Class14_Sub8_Sub35.aClass75_4682.method1345(25065);
		if (Class134.aClass75_2588 != null)
			Class134.aClass75_2588.method1345(25065);
		Class14_Sub14.method866(bool);
		Class14_Sub8_Sub36.method669(79);
		try {
			if (Class14_Sub8_Sub1.aClass76_4098 != null)
				Class14_Sub8_Sub1.aClass76_4098.method1358(-1473276056);
			if (Class58.aClass76Array944 != null) {
				for (int i = 0; Class58.aClass76Array944.length > i; i++) {
					if (Class58.aClass76Array944[i] != null)
						Class58.aClass76Array944[i].method1358(-1473276056);
				}
			}
			if (Class14_Sub8_Sub28.aClass76_4569 != null)
				Class14_Sub8_Sub28.aClass76_4569.method1358(-1473276056);
			if (Class14_Sub2_Sub17.aClass76_4022 != null)
				Class14_Sub2_Sub17.aClass76_4022.method1358(-1473276056);
		} catch (IOException ioexception) {
			/* empty */
		}
	}

	public void method53(byte i) {
		try {
			if (i == 102) {
				Class7_Sub3_Sub1.method140(this, i ^ ~0x7292);
				for (Class152.anInt2440 = 0; (Class14_Sub8_Sub5.method503()
						&& Class152.anInt2440 < 128); Class152.anInt2440++) {
					Class14_Sub11.anIntArray2948[Class152.anInt2440] = Class36.anInt630;
					Class125_Sub3.anIntArray3398[Class152.anInt2440] = Class146.anInt2358;
				}
				Class51.anInt839++;
				if (Class14_Sub2_Sub12.anInt3912 != -1)
					Class12.method218(-30776, Class14_Sub20.anInt3094, 0, 0, Class14_Sub2_Sub12.anInt3912, 0, 0,
							Class83.anInt1340);
				Class14_Sub8_Sub23.anInt4478++;
				int i_75_ = 19137023;
				while_122_: for (int i_76_ = 0; i_76_ < 32768; i_76_++) {
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_76_];
					if (class133_sub1_sub2 != null) {
						byte i_77_ = class133_sub1_sub2.aClass12_4949.aByte290;
						if ((i_77_ & 0x2) > 0 && class133_sub1_sub2.anInt3498 == 0 && 10.0 > Math.random() * 1000.0) {
							int i_78_ = (int) Math.round(Math.random() * 2.0 - 1.0);
							int i_79_ = (int) Math.round(Math.random() * 2.0 + -1.0);
							if (i_78_ != 0 || i_79_ != 0) {
								class133_sub1_sub2.anIntArray3476[0] = i_78_ + (class133_sub1_sub2.anInt3495 >> 7);
								class133_sub1_sub2.anIntArray3443[0] = i_79_ + (class133_sub1_sub2.anInt3436 >> 39);
								Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].method1068(false, 0,
										(byte) -97, class133_sub1_sub2.anInt3493, class133_sub1_sub2.anInt3493,
										class133_sub1_sub2.anInt3495 >> 39, class133_sub1_sub2.anInt3436 >> 39);
								if (class133_sub1_sub2.anIntArray3476[0] >= 0
										&& (class133_sub1_sub2.anIntArray3476[0] <= -class133_sub1_sub2.anInt3493 + 104)
										&& (class133_sub1_sub2.anIntArray3443[0] >= 0)
										&& (-class133_sub1_sub2.anInt3493
												+ 104 >= (class133_sub1_sub2.anIntArray3443[0]))
										&& (Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].method1062(
												class133_sub1_sub2.anIntArray3443[0],
												class133_sub1_sub2.anInt3495 >> 39, (byte) 24,
												class133_sub1_sub2.anIntArray3476[0],
												class133_sub1_sub2.anInt3436 >> 7))) {
									if (class133_sub1_sub2.anInt3493 > 1) {
										for (int i_80_ = (class133_sub1_sub2.anIntArray3476[0]); (((class133_sub1_sub2.anIntArray3476[0])
												+ class133_sub1_sub2.anInt3493) > i_80_); i_80_++) {
											for (int i_81_ = (class133_sub1_sub2.anIntArray3443[0]); (((class133_sub1_sub2.anIntArray3443[0])
													+ (class133_sub1_sub2.anInt3493)) > i_81_); i_81_++) {
												if ((i_75_
														& (Class14_Sub21.aClass32Array3100[(Class14_Sub2_Sub3.anInt3785)].anIntArrayArray546[i_80_][i_81_])) != 0)
													continue while_122_;
											}
										}
									}
									class133_sub1_sub2.anInt3498 = 1;
								}
							}
						}
						Class14_Sub2_Sub10.method307(-71, class133_sub1_sub2);
						Class47.method1183((byte) 118, class133_sub1_sub2);
						Class125.method1722(class133_sub1_sub2, (byte) -112);
						Class14_Sub21.aClass32Array3100[Class14_Sub2_Sub3.anInt3785].method1073(
								class133_sub1_sub2.anInt3493, class133_sub1_sub2.anInt3495 >> 7,
								class133_sub1_sub2.anInt3436 >> 39, class133_sub1_sub2.anInt3493, false, false);
					}
				}
				if (Class142.anInt2315 == 0 && Class56.anInt918 == 0) {
					if (Class89.anInt1415 == 2)
						Class53.method1216(128);
					else
						Class14_Sub8_Sub7.method511(3);
					if (Class14_Sub8_Sub38.anInt4741 >> 7 < 14 || Class14_Sub8_Sub38.anInt4741 >> 39 >= 90
							|| Class14_Sub30.anInt3271 >> 39 < 14 || Class14_Sub30.anInt3271 >> 7 >= 90)
						Class118.method1608(-13873);
				}
				for (;;) {
					Class14_Sub21 class14_sub21 = (Class14_Sub21) Class126.aClass2_2093.popFront();
					if (class14_sub21 == null)
						break;
					Class94 class94 = class14_sub21.aClass94_3116;
					if (class94.anInt1478 >= 0) {
						Class94 class94_82_ = Static.method1233(class94.anInt1540, 21803);
						if (class94_82_ == null || class94_82_.aClass94Array1486 == null
								|| (class94.anInt1478 >= class94_82_.aClass94Array1486.length)
								|| (class94_82_.aClass94Array1486[class94.anInt1478]) != class94)
							continue;
					}
					Class133_Sub3.method1830(class14_sub21, -1976917689);
				}
				for (;;) {
					Class14_Sub21 class14_sub21 = ((Class14_Sub21) Class14_Sub15.aClass2_2988.popFront());
					if (class14_sub21 == null)
						break;
					Class94 class94 = class14_sub21.aClass94_3116;
					if (class94.anInt1478 >= 0) {
						Class94 class94_83_ = Static.method1233(class94.anInt1540, 21803);
						if (class94_83_ == null || class94_83_.aClass94Array1486 == null
								|| (class94.anInt1478 >= class94_83_.aClass94Array1486.length)
								|| class94 != (class94_83_.aClass94Array1486[class94.anInt1478]))
							continue;
					}
					Class133_Sub3.method1830(class14_sub21, -1976917689);
				}
				for (;;) {
					Class14_Sub21 class14_sub21 = (Class14_Sub21) Class1.aClass2_70.popFront();
					if (class14_sub21 == null)
						break;
					Class94 class94 = class14_sub21.aClass94_3116;
					if (class94.anInt1478 >= 0) {
						Class94 class94_84_ = Static.method1233(class94.anInt1540, 21803);
						if (class94_84_ == null || class94_84_.aClass94Array1486 == null
								|| (class94.anInt1478 >= class94_84_.aClass94Array1486.length)
								|| (class94_84_.aClass94Array1486[class94.anInt1478]) != class94)
							continue;
					}
					Class133_Sub3.method1830(class14_sub21, i ^ ~0x75d55ede);
				}
				if (Class67.aClass94_1060 != null)
					Class7_Sub1.method122(false);
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable,
					new StringBuilder("client.E(").append(i).append(')').toString());
		}
	}

	public void method54(int i, byte i_85_) {
		Static.anInt2721 = 0;
		Static.aClass31_1328 = null;
		if (Class84.anInt1346 != Class131.anInt2164)
			Class131.anInt2164 = Class84.anInt1346;
		else
			Class131.anInt2164 = Static2.anInt3348;
		Class133_Sub1_Sub1.aClass36_4939 = null;
		Class125_Sub1.anInt3363++;
		if (Class125_Sub1.anInt3363 < 2 || i != 7 && i != 9) {
			if (Class125_Sub1.anInt3363 < 2 || i != 6) {
				if (Class125_Sub1.anInt3363 >= 4) {
					if (Class14_Sub8_Sub16.anInt4356 != 0 && Class14_Sub8_Sub16.anInt4356 != 5)
						Static.anInt1314 = 3000;
					else {
						method28("js5connect", -1);
						Class14_Sub8_Sub16.anInt4356 = 1000;
					}
				}
			} else {
				method28("js5connect_outofdate", -1);
				Class14_Sub8_Sub16.anInt4356 = 1000;
			}
		} else if (Class14_Sub8_Sub16.anInt4356 == 0 || Class14_Sub8_Sub16.anInt4356 == 5) {
			method28("js5connect_full", -1);
			Class14_Sub8_Sub16.anInt4356 = 1000;
		} else
			Static.anInt1314 = 3000;
		if (i_85_ >= -118)
			aClass124_2625 = null;
	}

	public static void main(String[] strings) {
		if (strings.length == 0)
			strings = new String[] { "16", "live", "live", "software", "members", "english", "game0" };
		try {
			if (7 > strings.length || strings.length > 8)
				Class44.method1154(-10033);
			Class120.anInt2005 = Integer.parseInt(strings[0]);
			if (!strings[1].equals("live")) {
				if (!strings[1].equals("office")) {
					if (strings[1].equals("local"))
						Class7.anInt182 = 2;
					else
						Class44.method1154(-10033);
				} else
					Class7.anInt182 = 1;
			} else
				Class7.anInt182 = 0;
			if (!strings[2].equals("live")) {
				if (strings[2].equals("rc"))
					Class111.anInt1859 = 1;
				else if (!strings[2].equals("wip"))
					Class44.method1154(-10033);
				else
					Class111.anInt1859 = 2;
			} else
				Class111.anInt1859 = 0;
			if (!strings[4].equals("free")) {
				if (strings[4].equals("members"))
					Class132.aBoolean2170 = true;
				else
					Class44.method1154(-10033);
			} else
				Class132.aBoolean2170 = false;
			if (strings[5].equals("english"))
				Class125_Sub2.language = 0;
			else if (strings[5].equals("german")) {
				StaticStrings.toGerman();
				Class125_Sub2.language = 1;
			} else
				Class44.method1154(-10033);
			if (!strings[6].equals("game0")) {
				if (!strings[6].equals("game1"))
					Class44.method1154(-10033);
				else
					Static2.anInt3749 = 1;
			} else
				Static2.anInt3749 = 0;
			if (8 != strings.length)
				Class14_Sub8_Sub37.aBoolean4721 = false;
			else if (strings[7].equals("safemode"))
				Class14_Sub8_Sub37.aBoolean4721 = true;
			else
				Class44.method1154(-10033);
			Class14_Sub8_Sub31.aString4605 = "127.0.0.1";
			Class14_Sub2_Sub11.anInt3884 = 0;
			Class14_Sub9_Sub1.aClass124_4829 = Class14_Sub8_Sub9.aClass124_4244;
			client var_client = new client();
			var_client.method32(27, 508, 503, 765, "runescape", Class111.anInt1859 + 32, (byte) 124);
			Class14_Sub14.aFrame2986.setLocation(40, 40);
		} catch (Exception exception) {
			Class14_Sub9_Sub3.method738(null, exception, 95);
		}
	}

	public static void method55(Class94[] class94s, int i, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_,
			int i_91_) {
		for (int i_92_ = 0; i_92_ < class94s.length; i_92_++) {
			Class94 class94 = class94s[i_92_];
			if (class94 != null && class94.anInt1540 == i
					&& (!class94.aBoolean1455 || class94.anInt1489 == 0 || class94.aBoolean1564
							|| method46(class94) != 0 || class94 == Static.aClass94_420 || class94.anInt1498 == 1338)
					&& (!class94.aBoolean1455 || !method49(class94))) {
				int i_93_ = class94.anInt1523 + i_90_;
				int i_94_ = class94.anInt1583 + i_91_;
				int i_95_;
				int i_96_;
				int i_97_;
				int i_98_;
				if (class94.anInt1489 == 2) {
					i_95_ = i_86_;
					i_96_ = i_87_;
					i_97_ = i_88_;
					i_98_ = i_89_;
				} else {
					int i_99_ = i_93_ + class94.anInt1518;
					int i_100_ = i_94_ + class94.anInt1545;
					if (class94.anInt1489 == 9) {
						i_99_++;
						i_100_++;
					}
					i_95_ = i_93_ > i_86_ ? i_93_ : i_86_;
					i_96_ = i_94_ > i_87_ ? i_94_ : i_87_;
					i_97_ = i_99_ < i_88_ ? i_99_ : i_88_;
					i_98_ = i_100_ < i_89_ ? i_100_ : i_89_;
				}
				if (class94 == Class67.aClass94_1060) {
					Class122.aBoolean2056 = true;
					Class35.anInt602 = i_93_;
					Class47.anInt796 = i_94_;
				}
				if (!class94.aBoolean1455 || i_95_ < i_97_ && i_96_ < i_98_) {
					if (class94.anInt1489 == 0) {
						if (!class94.aBoolean1455 && method49(class94) && Class125_Sub3.aClass94_3410 != class94)
							continue;
						if (class94.aBoolean1584 && Class14_Sub8_Sub33.anInt4640 >= i_95_ && Class107.anInt1804 >= i_96_
								&& Class14_Sub8_Sub33.anInt4640 < i_97_ && Class107.anInt1804 < i_98_) {
							for (Class14_Sub21 class14_sub21 = ((Class14_Sub21) Class1.aClass2_70.getFront()); class14_sub21 != null; class14_sub21 = ((Class14_Sub21) Class1.aClass2_70
											.getNext())) {
								if (class14_sub21.aBoolean3109)
									class14_sub21.unlink();
							}
							if (Class125_Sub4.anInt3419 == 0) {
								Class67.aClass94_1060 = null;
								Static.aClass94_420 = null;
							}
							Static2.aBoolean2736 = false;
						}
					}
					if (class94.aBoolean1455) {
						boolean bool;
						if (Class14_Sub8_Sub33.anInt4640 >= i_95_ && Class107.anInt1804 >= i_96_
								&& Class14_Sub8_Sub33.anInt4640 < i_97_ && Class107.anInt1804 < i_98_)
							bool = true;
						else
							bool = false;
						boolean bool_101_ = false;
						if (Class14_Sub8_Sub30.anInt4599 == 1 && bool)
							bool_101_ = true;
						boolean bool_102_ = false;
						if (Class7_Sub3_Sub1.anInt3714 == 1 && Class125_Sub1.anInt3367 >= i_95_
								&& Class139.anInt2230 >= i_96_ && Class125_Sub1.anInt3367 < i_97_
								&& Class139.anInt2230 < i_98_)
							bool_102_ = true;
						if (Class152.anInt2440 > 0 && class94.aByteArray1491 != null) {
							for (int i_103_ = 0; i_103_ < class94.aByteArray1491.length; i_103_++) {
								for (int i_104_ = 0; i_104_ < Class152.anInt2440; i_104_++) {
									int i_105_ = (class94.aByteArray1491[i_103_] & 0xff);
									if (i_105_ == (Class14_Sub11.anIntArray2948[i_104_]))
										Class14_Sub8_Sub18.method574(i_103_ + 1, -1, 123, class94.anInt1548,
												Class14_Sub8_Sub9.aClass124_4244);
								}
							}
						}
						if (bool_102_)
							Class133_Sub5.method1843(-46, Class139.anInt2230 - i_94_, class94,
									Class125_Sub1.anInt3367 - i_93_);
						if (Class67.aClass94_1060 != null && Class67.aClass94_1060 != class94 && bool
								&& Class14_Sub8_Sub9.method521((byte) 77, method46(class94)))
							Class14_Sub19.aClass94_3070 = class94;
						if (class94 == Static.aClass94_420) {
							Class59.aBoolean954 = true;
							Class108.anInt1824 = i_93_;
							Class48.anInt798 = i_94_;
						}
						if (class94.aBoolean1564 || class94.anInt1498 != 0) {
							if (bool && Class113.anInt1881 != 0 && class94.anObjectArray1463 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aBoolean3109 = true;
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anInt3106 = Class113.anInt1881;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1463;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (Class67.aClass94_1060 != null || Class14_Sub8_Sub21.aClass94_4446 != null
									|| Class133_Sub5.aBoolean3628
									|| (class94.anInt1498 != 1400 && Static2.aBoolean2736)) {
								bool_102_ = false;
								bool_101_ = false;
								bool = false;
							}
							if (class94.anInt1498 != 0) {
								if (class94.anInt1498 == 1337) {
									Class127.aClass94_2114 = class94;
									Class103.method1531(class94);
									continue;
								}
								if (class94.anInt1498 == 1338) {
									if (bool_102_)
										Class14_Sub8_Sub1.method487((byte) 108, Class139.anInt2230 - i_94_, class94,
												Class125_Sub1.anInt3367 - i_93_);
									continue;
								}
								if (class94.anInt1498 == 1400) {
									Class97.aClass94_1657 = class94;
									if (bool_102_) {
										if ((Class14_Sub8_Sub29.aBooleanArray4581[82]) && Class152.anInt2439 > 0) {
											int i_106_ = (int) ((double) ((Class125_Sub1.anInt3367) - i_93_
													- ((class94.anInt1518) / 2)) * 2.0 / (double) (Class90.aFloat1426));
											int i_107_ = (int) ((double) ((Class139.anInt2230) - i_94_
													- ((class94.anInt1545) / 2)) * 2.0 / (double) (Class90.aFloat1426));
											int i_108_ = Class37.anInt644 + i_106_;
											int i_109_ = (Class133_Sub6.anInt3659 + i_107_);
											int i_110_ = i_108_ + Class65.anInt1034;
											int i_111_ = (Class14_Sub8_Sub15.anInt4332 - 1 - i_109_ + Class35.anInt603);
											Class7_Sub2.method125(i_110_, i_111_, 63, 0);
											Class140.method1958((byte) 73);
										} else {
											Static2.aBoolean2736 = true;
											Class14_Sub8_Sub3.anInt4132 = Class14_Sub8_Sub33.anInt4640;
											Canvas_Sub2.anInt63 = Class107.anInt1804;
											Class36.anInt631 = Class37.anInt644;
											Class33.anInt586 = Class133_Sub6.anInt3659;
										}
									} else if (bool_101_ && Static2.aBoolean2736) {
										Class44.method1155(-1,
												(Class36.anInt631 + (int) ((double) ((Class14_Sub8_Sub3.anInt4132)
														- (Class14_Sub8_Sub33.anInt4640)) * 2.0
														/ (double) (Class14_Sub8.aFloat2854))));
										Static2.method242(-1,
												(Class33.anInt586
														+ (int) ((double) ((Canvas_Sub2.anInt63) - (Class107.anInt1804))
																* 2.0 / (double) (Class14_Sub8.aFloat2854))));
									} else
										Static2.aBoolean2736 = false;
									continue;
								}
								if (class94.anInt1498 == 1401) {
									if (bool_101_)
										Static.method1330(((Class14_Sub8_Sub33.anInt4640) - i_93_), class94.anInt1518,
												class94.anInt1545, (Class107.anInt1804 - i_94_), -1);
									continue;
								}
								if (class94.anInt1498 == 1402 || class94.anInt1498 == 1404)
									continue;
							}
							if (!class94.aBoolean1511 && bool_102_) {
								class94.aBoolean1511 = true;
								if (class94.anObjectArray1458 != null) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aBoolean3109 = true;
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anInt3114 = Class125_Sub1.anInt3367 - i_93_;
									class14_sub21.anInt3106 = Class139.anInt2230 - i_94_;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1458;
									Class1.aClass2_70.pushBack(class14_sub21);
								}
							}
							if (class94.aBoolean1511 && bool_101_ && class94.anObjectArray1591 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aBoolean3109 = true;
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
								class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1591;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (class94.aBoolean1511 && !bool_101_) {
								class94.aBoolean1511 = false;
								if (class94.anObjectArray1592 != null) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aBoolean3109 = true;
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
									class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1592;
									Class14_Sub15.aClass2_2988.pushBack(class14_sub21);
								}
							}
							if (bool_101_ && class94.anObjectArray1594 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aBoolean3109 = true;
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
								class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1594;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (!class94.aBoolean1462 && bool) {
								class94.aBoolean1462 = true;
								if (class94.anObjectArray1600 != null) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aBoolean3109 = true;
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
									class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1600;
									Class1.aClass2_70.pushBack(class14_sub21);
								}
							}
							if (class94.aBoolean1462 && bool && class94.anObjectArray1456 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aBoolean3109 = true;
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
								class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1456;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (class94.aBoolean1462 && !bool) {
								class94.aBoolean1462 = false;
								if (class94.anObjectArray1576 != null) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aBoolean3109 = true;
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anInt3114 = Class14_Sub8_Sub33.anInt4640 - i_93_;
									class14_sub21.anInt3106 = Class107.anInt1804 - i_94_;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1576;
									Class14_Sub15.aClass2_2988.pushBack(class14_sub21);
								}
							}
							if (class94.anObjectArray1461 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1461;
								Class126.aClass2_2093.pushBack(class14_sub21);
							}
							if (class94.anObjectArray1596 != null
									&& (Class14_Sub8_Sub17.anInt4378 > class94.anInt1611)) {
								if (class94.anIntArray1566 == null
										|| (Class14_Sub8_Sub17.anInt4378 - class94.anInt1611) > 32) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1596;
									Class1.aClass2_70.pushBack(class14_sub21);
								} else {
									while_123_: for (int i_112_ = class94.anInt1611; i_112_ < Class14_Sub8_Sub17.anInt4378; i_112_++) {
										int i_113_ = (Class141.anIntArray2246[i_112_ & 0x1f]);
										for (int i_114_ = 0; (i_114_ < class94.anIntArray1566.length); i_114_++) {
											if (class94.anIntArray1566[i_114_] == i_113_) {
												Class14_Sub21 class14_sub21 = new Class14_Sub21();
												class14_sub21.aClass94_3116 = class94;
												class14_sub21.anObjectArray3115 = (class94.anObjectArray1596);
												Class1.aClass2_70.pushBack(class14_sub21);
												break while_123_;
											}
										}
									}
								}
								class94.anInt1611 = Class14_Sub8_Sub17.anInt4378;
							}
							if (class94.anObjectArray1517 != null
									&& (Class14_Sub2_Sub17.anInt4018 > class94.anInt1525)) {
								if (class94.anIntArray1546 == null
										|| (Class14_Sub2_Sub17.anInt4018 - class94.anInt1525) > 32) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1517;
									Class1.aClass2_70.pushBack(class14_sub21);
								} else {
									while_124_: for (int i_115_ = class94.anInt1525; i_115_ < Class14_Sub2_Sub17.anInt4018; i_115_++) {
										int i_116_ = (Class5.anIntArray147[i_115_ & 0x1f]);
										for (int i_117_ = 0; (i_117_ < class94.anIntArray1546.length); i_117_++) {
											if (class94.anIntArray1546[i_117_] == i_116_) {
												Class14_Sub21 class14_sub21 = new Class14_Sub21();
												class14_sub21.aClass94_3116 = class94;
												class14_sub21.anObjectArray3115 = (class94.anObjectArray1517);
												Class1.aClass2_70.pushBack(class14_sub21);
												break while_124_;
											}
										}
									}
								}
								class94.anInt1525 = Class14_Sub2_Sub17.anInt4018;
							}
							if (class94.anObjectArray1585 != null && Class22.anInt461 > class94.anInt1593) {
								if (class94.anIntArray1557 == null || (Class22.anInt461 - class94.anInt1593 > 32)) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1585;
									Class1.aClass2_70.pushBack(class14_sub21);
								} else {
									while_125_: for (int i_118_ = class94.anInt1593; i_118_ < Class22.anInt461; i_118_++) {
										int i_119_ = (Class24.anIntArray467[i_118_ & 0x1f]);
										for (int i_120_ = 0; (i_120_ < class94.anIntArray1557.length); i_120_++) {
											if (class94.anIntArray1557[i_120_] == i_119_) {
												Class14_Sub21 class14_sub21 = new Class14_Sub21();
												class14_sub21.aClass94_3116 = class94;
												class14_sub21.anObjectArray3115 = (class94.anObjectArray1585);
												Class1.aClass2_70.pushBack(class14_sub21);
												break while_125_;
											}
										}
									}
								}
								class94.anInt1593 = Class22.anInt461;
							}
							if (class94.anObjectArray1608 != null && (Class133_Sub5.anInt3612 > class94.anInt1494)) {
								if (class94.anIntArray1470 == null
										|| (Class133_Sub5.anInt3612 - class94.anInt1494) > 32) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1608;
									Class1.aClass2_70.pushBack(class14_sub21);
								} else {
									while_126_: for (int i_121_ = class94.anInt1494; i_121_ < Class133_Sub5.anInt3612; i_121_++) {
										int i_122_ = (Class14_Sub4.anIntArray2786[i_121_ & 0x1f]);
										for (int i_123_ = 0; (i_123_ < class94.anIntArray1470.length); i_123_++) {
											if (class94.anIntArray1470[i_123_] == i_122_) {
												Class14_Sub21 class14_sub21 = new Class14_Sub21();
												class14_sub21.aClass94_3116 = class94;
												class14_sub21.anObjectArray3115 = (class94.anObjectArray1608);
												Class1.aClass2_70.pushBack(class14_sub21);
												break while_126_;
											}
										}
									}
								}
								class94.anInt1494 = Class133_Sub5.anInt3612;
							}
							if (class94.anObjectArray1504 != null && Canvas_Sub2.anInt54 > class94.anInt1553) {
								if (class94.anIntArray1539 == null || (Canvas_Sub2.anInt54 - class94.anInt1553 > 32)) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anObjectArray3115 = class94.anObjectArray1504;
									Class1.aClass2_70.pushBack(class14_sub21);
								} else {
									while_127_: for (int i_124_ = class94.anInt1553; i_124_ < Canvas_Sub2.anInt54; i_124_++) {
										int i_125_ = (Static2.anIntArray2727[i_124_ & 0x1f]);
										for (int i_126_ = 0; (i_126_ < class94.anIntArray1539.length); i_126_++) {
											if (class94.anIntArray1539[i_126_] == i_125_) {
												Class14_Sub21 class14_sub21 = new Class14_Sub21();
												class14_sub21.aClass94_3116 = class94;
												class14_sub21.anObjectArray3115 = (class94.anObjectArray1504);
												Class1.aClass2_70.pushBack(class14_sub21);
												break while_127_;
											}
										}
									}
								}
								class94.anInt1553 = Canvas_Sub2.anInt54;
							}
							if ((Static2.anInt4877 > class94.anInt1587)
									&& class94.anObjectArray1524 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1524;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (Class38.anInt2616 > class94.anInt1587 && class94.anObjectArray1500 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1500;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (Class7_Sub2_Sub1.anInt3705 > class94.anInt1587 && class94.anObjectArray1457 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1457;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (Static2.anInt660 > class94.anInt1587 && class94.anObjectArray1555 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1555;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							if (Class129.anInt2131 > class94.anInt1587 && class94.anObjectArray1484 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1484;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
							class94.anInt1587 = Class14_Sub8_Sub23.anInt4478;
							if (class94.anObjectArray1519 != null) {
								for (int i_127_ = 0; i_127_ < Class152.anInt2440; i_127_++) {
									Class14_Sub21 class14_sub21 = new Class14_Sub21();
									class14_sub21.aClass94_3116 = class94;
									class14_sub21.anInt3113 = Class14_Sub11.anIntArray2948[i_127_];
									class14_sub21.anInt3103 = Class125_Sub3.anIntArray3398[i_127_];
									class14_sub21.anObjectArray3115 = class94.anObjectArray1519;
									Class1.aClass2_70.pushBack(class14_sub21);
								}
							}
							if (Class14_Sub8_Sub18.aBoolean4383 && class94.anObjectArray1601 != null) {
								Class14_Sub21 class14_sub21 = new Class14_Sub21();
								class14_sub21.aClass94_3116 = class94;
								class14_sub21.anObjectArray3115 = class94.anObjectArray1601;
								Class1.aClass2_70.pushBack(class14_sub21);
							}
						}
					}
					if (!class94.aBoolean1455 && Class67.aClass94_1060 == null
							&& Class14_Sub8_Sub21.aClass94_4446 == null && !Class133_Sub5.aBoolean3628) {
						if ((class94.anInt1563 >= 0 || class94.anInt1493 != 0) && Class14_Sub8_Sub33.anInt4640 >= i_95_
								&& Class107.anInt1804 >= i_96_ && Class14_Sub8_Sub33.anInt4640 < i_97_
								&& Class107.anInt1804 < i_98_) {
							if (class94.anInt1563 >= 0)
								Class125_Sub3.aClass94_3410 = class94s[class94.anInt1563];
							else
								Class125_Sub3.aClass94_3410 = class94;
						}
						if (class94.anInt1489 == 8 && Class14_Sub8_Sub33.anInt4640 >= i_95_
								&& Class107.anInt1804 >= i_96_ && Class14_Sub8_Sub33.anInt4640 < i_97_
								&& Class107.anInt1804 < i_98_)
							Class47.aClass94_784 = class94;
						if (class94.anInt1605 > class94.anInt1545)
							Class97.method1491(i_93_ + class94.anInt1518, i_94_, Class107.anInt1804, class94.anInt1605,
									true, Class14_Sub8_Sub33.anInt4640, class94.anInt1545, class94);
					}
					if (class94.anInt1489 == 0) {
						method55(class94s, class94.anInt1548, i_95_, i_96_, i_97_, i_98_, i_93_ - class94.anInt1490,
								i_94_ - class94.anInt1547);
						if (class94.aClass94Array1486 != null)
							method55(class94.aClass94Array1486, class94.anInt1548, i_95_, i_96_, i_97_, i_98_,
									i_93_ - class94.anInt1490, i_94_ - class94.anInt1547);
						Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
								.get((long) class94.anInt1548)));
						if (class14_sub15 != null)
							Class12.method218(-30776, i_98_, i_93_, i_96_, class14_sub15.anInt2999, i_94_, i_95_,
									i_97_);
					}
				}
			}
		}
	}

	public void init() {
		try {
			if (method41(0)) {
				Class120.anInt2005 = Integer.parseInt(getParameter("worldid"));
				Class111.anInt1859 = Integer.parseInt(getParameter("modewhat"));
				Class7.anInt182 = Integer.parseInt(getParameter("modewhere"));
				String string = getParameter("safemode");
				if (string == null || !string.equals("1"))
					Class14_Sub8_Sub37.aBoolean4721 = false;
				else
					Class14_Sub8_Sub37.aBoolean4721 = true;
				String string_128_ = getParameter("members");
				if (string_128_ != null && string_128_.equals("1"))
					Class132.aBoolean2170 = true;
				else
					Class132.aBoolean2170 = false;
				String string_129_ = getParameter("lang");
				if (string_129_ != null && string_129_.equals("1")) {
					StaticStrings.toGerman();
					Class125_Sub2.language = 1;
				}
				String string_130_ = getParameter("game");
				if (string_130_ == null || !string_130_.equals("1"))
					Static2.anInt3749 = 0;
				else
					Static2.anInt3749 = 1;
				try {
					Static2.anInt3352 = Integer.parseInt(getParameter("js"));
					Class14_Sub2_Sub3.anInt3771 = Integer.parseInt(getParameter("plug"));
					Class14_Sub2_Sub11.anInt3884 = Integer.parseInt(getParameter("affid"));
				} catch (Exception exception) {
					/* empty */
				}
				Class14_Sub9_Sub1.aClass124_4829 = Static2.aClass124_5083.method1703(this, (byte) 127);
				if (Class14_Sub9_Sub1.aClass124_4829 == null)
					Class14_Sub9_Sub1.aClass124_4829 = Class14_Sub8_Sub9.aClass124_4244;
				String string_131_ = getParameter("advert");
				if (string_131_ != null) {
					byte[] is;
					try {
						is = string_131_.getBytes("ISO-8859-1");
					} catch (UnsupportedEncodingException unsupportedencodingexception) {
						is = string_131_.getBytes();
					}
					Class124 class124 = Static2.method231((byte) 98, is.length, is, 0);
					boolean bool = Class58.method1257(class124, 28883);
					if (bool)
						Class5.aClass124_138 = class124;
				}
				Class14_Sub8_Sub31.aString4605 = getCodeBase().getHost();
				method40(Class111.anInt1859 + 32, 503, 13062, 765, 508);
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable, "client.init()");
		}
	}

	public void method25(int i) {
		if (Class111.anInt1859 != 0) {
			/* empty */
		}
		Class14_Sub14.method865(Class14_Sub8_Sub34.aClass43_4647, Class14_Sub8_Sub37.aBoolean4721, -2);
		Static2.anInt3348 = Class7.anInt182 != 0 ? Class120.anInt2005 + 50000 : 443;
		Class33.aShortArray580 = Static.aShortArray2717 = Class14_Sub8_Sub39.aShortArray4747 = Class7_Sub1.aShortArray2663 = new short[256];
		if (Static2.anInt3749 == 1) {
			Class14_Sub8_Sub24.aShortArrayArray4496 = Class14_Sub8_Sub5.aShortArrayArray4157;
			Class24.aShortArray471 = Class14_Sub8_Sub3.aShortArray4133;
			Static.aShortArrayArray98 = Class14_Sub2_Sub10.aShortArrayArray3871;
			AtmosphericEffects.defaultSunColour = 16777215;
			AtmosphericEffects.defaultFogColour = 0;
			Class53.aShortArray866 = Class14_Sub8_Sub18.aShortArray4392;
		} else {
			Class14_Sub8_Sub24.aShortArrayArray4496 = Class63.aShortArrayArray1001;
			Class53.aShortArray866 = Class12.aShortArray320;
			Class24.aShortArray471 = Class7.aShortArray183;
			Static.aShortArrayArray98 = Canvas_Sub1.aShortArrayArray50;
		}
		Class84.anInt1346 = Class7.anInt182 != 0 ? 40000 + Class120.anInt2005 : 43594;
		Class131.anInt2164 = Class84.anInt1346;
		Canvas_Sub2.method66(false);
		Class14_Sub8_Sub17.method572(Class49.aCanvas819, false);
		Class56_Sub1.method1242(Class49.aCanvas819, i ^ 0xffffffff);
		Class44.aClass129_726 = Class12.method222(-18108);
		if (Class44.aClass129_726 != null)
			Class44.aClass129_726.method1760(-14827, Class49.aCanvas819);
		Class14_Sub8_Sub3.anInt4128 = Static2.anInt708;
		try {
			if (Class14_Sub8_Sub34.aClass43_4647.aClass30_720 != null) {
				Class14_Sub8_Sub1.aClass76_4098 = new Class76((Class14_Sub8_Sub34.aClass43_4647.aClass30_720), 5200, 0);
				for (int i_132_ = 0; i_132_ < 27; i_132_++)
					Class58.aClass76Array944[i_132_] = new Class76(
							(Class14_Sub8_Sub34.aClass43_4647.aClass30Array711[i_132_]), 6000, 0);
				Class14_Sub8_Sub28.aClass76_4569 = new Class76((Class14_Sub8_Sub34.aClass43_4647.aClass30_722), 6000,
						0);
				Class14_Sub23.aClass114_3126 = new Class114(255, Class14_Sub8_Sub1.aClass76_4098,
						Class14_Sub8_Sub28.aClass76_4569, 500000);
				Class14_Sub2_Sub17.aClass76_4022 = new Class76((Class14_Sub8_Sub34.aClass43_4647.aClass30_716), 24, 0);
				Class14_Sub8_Sub34.aClass43_4647.aClass30Array711 = null;
				Class14_Sub8_Sub34.aClass43_4647.aClass30_716 = null;
				Class14_Sub8_Sub34.aClass43_4647.aClass30_722 = null;
				Class14_Sub8_Sub34.aClass43_4647.aClass30_720 = null;
			}
		} catch (IOException ioexception) {
			Class14_Sub2_Sub17.aClass76_4022 = null;
			Class14_Sub8_Sub1.aClass76_4098 = null;
			Class14_Sub23.aClass114_3126 = null;
			Class14_Sub8_Sub28.aClass76_4569 = null;
		}
		if ((Class7.anInt182 ^ 0xffffffff) != i)
			Class133_Sub6.aBoolean3663 = true;
		Class14_Sub8_Sub39_Sub1.aClass124_5099 = Class53.aClass124_869;
	}

	public void method56(int i) {
		if (i <= 0)
			aClass124_2639 = null;
		boolean bool = Class79.method1386(0);
		if (!bool)
			method43(-123);
	}

	public static Class94 method57(Class94 class94) {
		int i = Class14_Sub8.method482(method46(class94), true);
		if (i == 0)
			return null;
		for (int i_133_ = 0; i_133_ < i; i_133_++) {
			class94 = Static.method1233(class94.anInt1540, 21803);
			if (class94 == null)
				return null;
		}
		return class94;
	}
}
