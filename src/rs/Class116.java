/* Class116 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.UnsupportedEncodingException;
import java.util.Date;

import com.jagex.applet.Applet_Sub1;
import com.jagex.applet.ErrorReporting;
import com.jagex.link.HashTable;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.IntegerNode;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;
import com.jagex.util.BrowserControlUtil;
import com.jagex.util.TimeUtil;

public class Class116 {
	public static int[] anIntArray1928 = new int[50];
	public static int anInt1929 = 2;

	public static void method1595(int i) {
		Class139.aClass52_2229.clear();
		if (i != 0)
			method1597(false, null);
	}

	public static void method1596(int i, byte i_1_, Class14_Sub21 class14_sub21) {
		Object[] objects = class14_sub21.anObjectArray3115;
		int i_2_ = ((Integer) objects[0]).intValue();
		Class14_Sub2_Sub12 class14_sub2_sub12 = Class118.method1605(true, i_2_);
		if (class14_sub2_sub12 != null) {
			Class67.anInt1058 = 0;
			int i_3_ = 0;
			i_2_ = -1;
			int i_4_ = 0;
			int[] is = class14_sub2_sub12.anIntArray3900;
			int[] is_5_ = class14_sub2_sub12.anIntArray3907;
			int i_6_ = -1;
			while_226_: do {
				while_225_: do {
					do {
						try {
							JunkTex.aClass124Array3287 = new Class124[class14_sub2_sub12.anInt3904];
							Class51.anIntArray835 = new int[class14_sub2_sub12.anInt3901];
							if (i_1_ != 79)
								break;
						} catch (Exception exception) {
							break while_226_;
						}
						break while_225_;
					} while (false);
					return;
				} while (false);
				int i_7_;
				try {
					int i_8_ = 0;
					int i_9_ = 0;
					for (i_7_ = 1; i_7_ < objects.length; i_7_++) {
						if (!(objects[i_7_] instanceof Integer)) {
							if (objects[i_7_] instanceof Class124) {
								Class124 class124 = (Class124) objects[i_7_];
								if (class124.method1704(Class79.aClass124_1306, (byte) 65))
									class124 = class14_sub21.aClass124_3101;
								JunkTex.aClass124Array3287[i_9_++] = class124;
							}
						} else {
							int i_10_ = ((Integer) objects[i_7_]).intValue();
							if (i_10_ == -2147483647)
								i_10_ = class14_sub21.anInt3114;
							if (i_10_ == -2147483646)
								i_10_ = class14_sub21.anInt3106;
							if (i_10_ == -2147483645)
								i_10_ = (class14_sub21.aClass94_3116 != null ? class14_sub21.aClass94_3116.anInt1548
										: -1);
							if (i_10_ == -2147483644)
								i_10_ = class14_sub21.anInt3108;
							if (i_10_ == -2147483643)
								i_10_ = (class14_sub21.aClass94_3116 != null ? class14_sub21.aClass94_3116.anInt1478
										: -1);
							if (i_10_ == -2147483642)
								i_10_ = (class14_sub21.aClass94_3105 == null ? -1
										: (class14_sub21.aClass94_3105.anInt1548));
							if (i_10_ == -2147483641)
								i_10_ = (class14_sub21.aClass94_3105 != null ? class14_sub21.aClass94_3105.anInt1478
										: -1);
							if (i_10_ == -2147483640)
								i_10_ = class14_sub21.anInt3113;
							if (i_10_ == -2147483639)
								i_10_ = class14_sub21.anInt3103;
							Class51.anIntArray835[i_8_++] = i_10_;
						}
					}
					i_7_ = 0;
				} catch (Exception exception) {
					break;
				}
				for (;;) {
					if (++i_7_ > i)
						throw new RuntimeException("slow");
					i_6_ = is_5_[++i_2_];
					if (i_6_ < 100) {
						if (i_6_ == 0) {
							Class79.anIntArray1305[i_3_++] = is[i_2_];
							continue;
						}
						if (i_6_ == 1) {
							int i_11_ = is[i_2_];
							Class79.anIntArray1305[i_3_++] = JunkTex.anIntArray4275[i_11_];
							continue;
						}
						if (i_6_ == 2) {
							int i_12_ = is[i_2_];
							Class14_Sub9_Sub1.method700(i_12_, -105, (Class79.anIntArray1305[--i_3_]));
							continue;
						}
						if (i_6_ == 3) {
							JunkTex.aClass124Array5101[i_4_++] = class14_sub2_sub12.aClass124Array3899[i_2_];
							continue;
						}
						if (i_6_ == 6) {
							i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 7) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_ + 1] != Class79.anIntArray1305[i_3_])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 8) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_] == Class79.anIntArray1305[i_3_ + 1])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 9) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_] < Class79.anIntArray1305[i_3_ + 1])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 10) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_ + 1] < Class79.anIntArray1305[i_3_])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 21) {
							if (Class67.anInt1058 != 0) {
								try {
									Class112 class112 = (Class83.aClass112Array1341[--Class67.anInt1058]);
									Class51.anIntArray835 = class112.anIntArray1870;
									JunkTex.aClass124Array3287 = class112.aClass124Array1869;
									i_2_ = class112.anInt1874;
									class14_sub2_sub12 = class112.aClass14_Sub2_Sub12_1873;
									is_5_ = class14_sub2_sub12.anIntArray3907;
									is = class14_sub2_sub12.anIntArray3900;
								} catch (Exception exception) {
									break while_226_;
								}
							} else
								return;
							continue;
						}
						if (i_6_ == 25) {
							int i_13_ = is[i_2_];
							Class79.anIntArray1305[i_3_++] = Class104.method1534(i_13_, 94);
							continue;
						}
						if (i_6_ == 27) {
							int i_14_ = is[i_2_];
							Class110.method1574(i_1_ - 21, Class79.anIntArray1305[--i_3_], i_14_);
							continue;
						}
						if (i_6_ == 31) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_ + 1] >= Class79.anIntArray1305[i_3_])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 32) {
							i_3_ -= 2;
							if (Class79.anIntArray1305[i_3_ + 1] <= Class79.anIntArray1305[i_3_])
								i_2_ += is[i_2_];
							continue;
						}
						if (i_6_ == 33) {
							Class79.anIntArray1305[i_3_++] = Class51.anIntArray835[is[i_2_]];
							continue;
						}
						if (i_6_ == 34) {
							Class51.anIntArray835[is[i_2_]] = Class79.anIntArray1305[--i_3_];
							continue;
						}
						if (i_6_ == 35) {
							JunkTex.aClass124Array5101[i_4_++] = JunkTex.aClass124Array3287[is[i_2_]];
							continue;
						}
						if (i_6_ == 36) {
							JunkTex.aClass124Array3287[is[i_2_]] = (JunkTex.aClass124Array5101[--i_4_]);
							continue;
						}
						if (i_6_ == 37) {
							int i_15_ = is[i_2_];
							i_4_ -= i_15_;
							Class124 class124 = (JunkTex.method683(true, i_4_, i_15_,
									(JunkTex.aClass124Array5101)));
							JunkTex.aClass124Array5101[i_4_++] = class124;
							continue;
						}
						if (i_6_ == 38) {
							i_3_--;
							continue;
						}
						if (i_6_ == 39) {
							i_4_--;
							continue;
						}
						if (i_6_ == 40) {
							int i_16_ = is[i_2_];
							Class14_Sub2_Sub12 class14_sub2_sub12_17_ = Class118.method1605(true, i_16_);
							int[] is_18_ = new int[class14_sub2_sub12_17_.anInt3901];
							Class124[] class124s = (new Class124[class14_sub2_sub12_17_.anInt3904]);
							for (int i_19_ = 0; class14_sub2_sub12_17_.anInt3896 > i_19_; i_19_++)
								is_18_[i_19_] = (Class79.anIntArray1305[(i_19_
										+ (-class14_sub2_sub12_17_.anInt3896 + i_3_))]);
							for (int i_20_ = 0; i_20_ < class14_sub2_sub12_17_.anInt3911; i_20_++)
								class124s[i_20_] = (JunkTex.aClass124Array5101[(-class14_sub2_sub12_17_.anInt3911
										+ i_4_ + i_20_)]);
							i_4_ -= class14_sub2_sub12_17_.anInt3911;
							i_3_ -= class14_sub2_sub12_17_.anInt3896;
							Class112 class112 = new Class112();
							class112.aClass14_Sub2_Sub12_1873 = class14_sub2_sub12;
							class112.anInt1874 = i_2_;
							class112.anIntArray1870 = Class51.anIntArray835;
							class112.aClass124Array1869 = JunkTex.aClass124Array3287;
							if (Class83.aClass112Array1341.length <= Class67.anInt1058)
								throw new RuntimeException();
							class14_sub2_sub12 = class14_sub2_sub12_17_;
							Class83.aClass112Array1341[Class67.anInt1058++] = class112;
							JunkTex.aClass124Array3287 = class124s;
							Class51.anIntArray835 = is_18_;
							is = class14_sub2_sub12.anIntArray3900;
							is_5_ = class14_sub2_sub12.anIntArray3907;
							i_2_ = -1;
							continue;
						}
						if (i_6_ == 42) {
							Class79.anIntArray1305[i_3_++] = SceneGraphNode_GameEntity_Sub2.anIntArray4944[is[i_2_]];
							continue;
						}
						if (i_6_ == 43) {
							int i_21_ = is[i_2_];
							SceneGraphNode_GameEntity_Sub2.anIntArray4944[i_21_] = Class79.anIntArray1305[--i_3_];
							Class124.method1682(i_1_ ^ 0xc14, i_21_);
							continue;
						}
						if (i_6_ == 44) {
							int i_22_ = is[i_2_] & 0xffff;
							int i_23_ = is[i_2_] >> 16;
							int i_24_ = Class79.anIntArray1305[--i_3_];
							if (i_24_ < 0 || i_24_ > 5000)
								throw new RuntimeException();
							int i_25_ = -1;
							if (i_22_ == 105)
								i_25_ = 0;
							Class64.anIntArray1016[i_23_] = i_24_;
							for (int i_26_ = 0; i_24_ > i_26_; i_26_++)
								JunkTex.anIntArrayArray4261[i_23_][i_26_] = i_25_;
							continue;
						}
						if (i_6_ == 45) {
							int i_27_ = is[i_2_];
							int i_28_ = Class79.anIntArray1305[--i_3_];
							if (i_28_ < 0 || Class64.anIntArray1016[i_27_] <= i_28_)
								throw new RuntimeException();
							Class79.anIntArray1305[i_3_++] = (JunkTex.anIntArrayArray4261[i_27_][i_28_]);
							continue;
						}
						if (i_6_ == 46) {
							i_3_ -= 2;
							int i_29_ = is[i_2_];
							int i_30_ = Class79.anIntArray1305[i_3_];
							if (i_30_ < 0 || i_30_ >= Class64.anIntArray1016[i_29_])
								throw new RuntimeException();
							JunkTex.anIntArrayArray4261[i_29_][i_30_] = Class79.anIntArray1305[i_3_ + 1];
							continue;
						}
						if (i_6_ == 47) {
							Class124 class124 = (JunkTex.aClass124Array4499[is[i_2_]]);
							if (class124 == null)
								class124 = JunkTex.aClass124_4442;
							JunkTex.aClass124Array5101[i_4_++] = class124;
							continue;
						}
						if (i_6_ == 48) {
							int i_31_ = is[i_2_];
							JunkTex.aClass124Array4499[i_31_] = (JunkTex.aClass124Array5101[--i_4_]);
							Class15.method947(i_31_, i_1_ ^ ~0x3702);
							continue;
						}
						if (i_6_ == 51) {
							HashTable hashTable = (class14_sub2_sub12.aClass55Array3903[is[i_2_]]);
							IntegerNode class14_sub1 = ((IntegerNode) hashTable
									.get((Class79.anIntArray1305[--i_3_])));
							if (class14_sub1 != null)
								i_2_ += class14_sub1.value;
							continue;
						}
					}
					boolean bool;
					if (is[i_2_] == 1)
						bool = true;
					else
						bool = false;
					if (i_6_ >= 300) {
						if (i_6_ < 500) {
							if (i_6_ == 403) {
								i_3_ -= 2;
								int i_32_ = Class79.anIntArray1305[i_3_];
								if (i_32_ >= 7)
									i_32_ -= 7;
								int i_33_ = Class79.anIntArray1305[i_3_ + 1];
								Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941.method1518(i_32_, i_33_, 119);
							} else if (i_6_ == 404) {
								i_3_ -= 2;
								int i_34_ = Class79.anIntArray1305[i_3_];
								int i_35_ = Class79.anIntArray1305[i_3_ + 1];
								Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941.method1526(false, i_35_, i_34_);
							} else {
								if (i_6_ != 410)
									break;
								boolean bool_36_ = Class79.anIntArray1305[--i_3_] != 0;
								Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941.method1519(bool_36_, false);
							}
						} else if ((i_6_ < 1000 || i_6_ >= 1100) && (i_6_ < 2000 || i_6_ >= 2100)) {
							if ((i_6_ < 1100 || i_6_ >= 1200) && (i_6_ < 2100 || i_6_ >= 2200)) {
								if ((i_6_ < 1200 || i_6_ >= 1300) && (i_6_ < 2200 || i_6_ >= 2300)) {
									if ((i_6_ < 1300 || i_6_ >= 1400) && (i_6_ < 2300 || i_6_ >= 2400)) {
										if ((i_6_ < 1400 || i_6_ >= 1500) && (i_6_ < 2400 || i_6_ >= 2500)) {
											if (i_6_ >= 1600) {
												if (i_6_ >= 1700) {
													if (i_6_ < 1800) {
														Class94 class94 = (!bool ? (JunkTex.aClass94_4223)
																: (SceneCluster.aClass94_1372));
														if (i_6_ == 1700)
															Class79.anIntArray1305[i_3_++] = (class94.anInt1532);
														else if (i_6_ == 1701) {
															if ((class94.anInt1532) == -1)
																Class79.anIntArray1305[i_3_++] = 0;
															else
																Class79.anIntArray1305[i_3_++] = (class94.anInt1495);
														} else {
															if (i_6_ != 1702)
																break;
															Class79.anIntArray1305[i_3_++] = (class94.anInt1478);
														}
													} else if (i_6_ < 1900) {
														Class94 class94 = (bool ? (SceneCluster.aClass94_1372)
																: (JunkTex.aClass94_4223));
														if (i_6_ == 1800)
															Class79.anIntArray1305[i_3_++] = (Class44
																	.method1158((client.method46(class94)), false));
														else if (i_6_ == 1801) {
															int i_37_ = (Class79.anIntArray1305[--i_3_]);
															i_37_--;
															if (((class94.aClass124Array1573) == null)
																	|| (i_37_ >= (class94.aClass124Array1573).length)
																	|| ((class94.aClass124Array1573[i_37_]) == null))
																JunkTex.aClass124Array5101[i_4_++] = (Class140.aClass124_2234);
															else
																JunkTex.aClass124Array5101[i_4_++] = (class94.aClass124Array1573[i_37_]);
														} else {
															if (i_6_ != 1802)
																break;
															if ((class94.aClass124_1508) != null)
																JunkTex.aClass124Array5101[i_4_++] = (class94.aClass124_1508);
															else
																JunkTex.aClass124Array5101[i_4_++] = (Class140.aClass124_2234);
														}
													} else if (i_6_ >= 2600) {
														if (i_6_ < 2700) {
															Class94 class94 = (JunkTex.method1233(
																	(Class79.anIntArray1305[--i_3_]), 21803));
															if (i_6_ == 2600)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1490);
															else if (i_6_ == 2601)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1547);
															else if (i_6_ == 2602)
																JunkTex.aClass124Array5101[i_4_++] = (class94.aClass124_1499);
															else if (i_6_ == 2603)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1544);
															else if (i_6_ == 2604)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1605);
															else if (i_6_ == 2605)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1513);
															else if (i_6_ == 2606)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1465);
															else if (i_6_ == 2607)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1516);
															else if (i_6_ == 2608)
																Class79.anIntArray1305[i_3_++] = (class94.anInt1578);
															else {
																if (i_6_ != 2609)
																	break;
																Class79.anIntArray1305[i_3_++] = (class94.anInt1590);
															}
														} else if (i_6_ >= 2800) {
															if (i_6_ < 2900) {
																Class94 class94 = (JunkTex.method1233(
																		(Class79.anIntArray1305[--i_3_]), 21803));
																if (i_6_ == 2800)
																	Class79.anIntArray1305[i_3_++] = (Class44
																			.method1158(client.method46(class94),
																					false));
																else if (i_6_ == 2801) {
																	int i_38_ = (Class79.anIntArray1305[--i_3_]);
																	i_38_--;
																	if (((class94.aClass124Array1573) == null)
																			|| (i_38_ >= class94.aClass124Array1573.length)
																			|| (class94.aClass124Array1573[i_38_]) == null)
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																	else
																		JunkTex.aClass124Array5101[i_4_++] = class94.aClass124Array1573[i_38_];
																} else {
																	if (i_6_ != 2802)
																		break;
																	if ((class94.aClass124_1508) == null)
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																	else
																		JunkTex.aClass124Array5101[i_4_++] = class94.aClass124_1508;
																}
															} else if (i_6_ < 3200) {
																if (i_6_ == 3100) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	Class15.method943(class124, false,
																			(Class140.aClass124_2234), 0);
																} else if (i_6_ == 3101) {
																	i_3_ -= 2;
																	Class83.method1408(
																			(Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748),
																			(Class79.anIntArray1305[(i_3_ + 1)]), false,
																			(Class79.anIntArray1305[i_3_]));
																} else if (i_6_ == 3103)
																	Class140.method1958((byte) 81);
																else if (i_6_ == 3104) {
																	int i_39_ = 0;
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	if (class124.isValidStringBase10(124))
																		i_39_ = class124.stringToBase10(i_1_ ^ 0x38);
																	JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(43);
																	JunkTex.aClass14_Sub10_Sub1_891.writeInt(i_39_,
																			124);
																} else if (i_6_ == 3105) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(189);
																	JunkTex.aClass14_Sub10_Sub1_891.method817(
																			(class124.method1692(i_1_ - 79)));
																} else if (i_6_ == 3106) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(127);
																	JunkTex.aClass14_Sub10_Sub1_891.writeByte(((class124.length(i_1_ ^ 0x4f)) + 1));
																	JunkTex.aClass14_Sub10_Sub1_891
																			.method814((i_1_ + 32689), class124);
																} else if (i_6_ == 3107) {
																	int i_40_ = (Class79.anIntArray1305[--i_3_]);
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	Static2.method1587(class124, 0, i_40_);
																} else if (i_6_ == 3108) {
																	i_3_ -= 3;
																	int i_41_ = (Class79.anIntArray1305[i_3_]);
																	int i_42_ = (Class79.anIntArray1305[(i_3_ + 2)]);
																	int i_43_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class94 class94 = (JunkTex.method1233(i_42_,
																			21803));
																	SceneGraphNode_SpotAnimation.method1843((i_1_ - 179), i_43_,
																			class94, i_41_);
																} else if (i_6_ == 3109) {
																	i_3_ -= 2;
																	int i_44_ = (Class79.anIntArray1305[i_3_]);
																	Class94 class94 = (bool ? SceneCluster.aClass94_1372
																			: JunkTex.aClass94_4223);
																	int i_45_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	SceneGraphNode_SpotAnimation.method1843(104, i_45_, class94,
																			i_44_);
																} else {
																	if (i_6_ != 3110)
																		break;
																	int i_46_ = (Class79.anIntArray1305[--i_3_]);
																	JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(195);
																	JunkTex.aClass14_Sub10_Sub1_891
																			.method833((byte) 114, i_46_);
																}
															} else if (i_6_ < 3300) {
																if (i_6_ == 3200) {
																	i_3_ -= 3;
																	Class47.method1181(
																			(Class79.anIntArray1305[(i_3_ + 1)]),
																			(Class79.anIntArray1305[i_3_]),
																			(Class79.anIntArray1305[(i_3_ + 2)]),
																			(byte) -62);
																} else if (i_6_ == 3201)
																	Class98.method1492((Class79.anIntArray1305[--i_3_]),
																			(byte) -107);
																else {
																	if (i_6_ != 3202)
																		break;
																	i_3_ -= 2;
																	Class153.method2049((Class79.anIntArray1305[i_3_]),
																			(Class79.anIntArray1305[(i_3_ + 1)]),
																			(i_1_ ^ ~0x4f));
																}
															} else if (i_6_ < 3400) {
																if (i_6_ == 3300)
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub2_Sub20.anInt4064);
																else if (i_6_ == 3301) {
																	i_3_ -= 2;
																	int i_47_ = (Class79.anIntArray1305[i_3_]);
																	int i_48_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method526((byte) 117, i_48_, i_47_));
																} else if (i_6_ == 3302) {
																	i_3_ -= 2;
																	int i_49_ = (Class79.anIntArray1305[i_3_]);
																	int i_50_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub29
																			.method931(i_50_, (i_1_ + 3879), i_49_));
																} else if (i_6_ == 3303) {
																	i_3_ -= 2;
																	int i_51_ = (Class79.anIntArray1305[i_3_]);
																	int i_52_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub2_Sub12
																			.method322(i_51_, (byte) 55, i_52_));
																} else if (i_6_ == 3304) {
																	int i_53_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (Class17
																			.method960(24205, i_53_).anInt4062);
																} else if (i_6_ == 3305) {
																	int i_54_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex.anIntArray4444[i_54_]);
																} else if (i_6_ == 3306) {
																	int i_55_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (Class56.anIntArray913[i_55_]);
																} else if (i_6_ == 3307) {
																	int i_56_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub2_Sub12.anIntArray3916[i_56_]);
																} else if (i_6_ == 3308) {
																	int i_57_ = (((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) >> 7)
																			+ SceneGraphNode_Projectile.anInt3676);
																	int i_58_ = (Class14_Sub2_Sub3.gameLevel);
																	int i_59_ = (((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) >> 39)
																			+ Class58.anInt947);
																	Class79.anIntArray1305[i_3_++] = ((i_57_ << 46)
																			+ (i_58_ << 60) + i_59_);
																} else if (i_6_ == 3309) {
																	int i_60_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = ((JunkTex
																			.method617(268419723, i_60_)) >> 14);
																} else if (i_6_ == 3310) {
																	int i_61_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (i_61_ >> 60);
																} else if (i_6_ == 3311) {
																	int i_62_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method617(16383, i_62_));
																} else if (i_6_ == 3312)
																	Class79.anIntArray1305[i_3_++] = ((Class132.aBoolean2170)
																			? 1 : 0);
																else if (i_6_ == 3313) {
																	i_3_ -= 2;
																	int i_63_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_64_ = ((Class79.anIntArray1305[i_3_])
																			+ 32768);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method526((byte) -123, i_63_, i_64_));
																} else if (i_6_ == 3314) {
																	i_3_ -= 2;
																	int i_65_ = ((Class79.anIntArray1305[i_3_])
																			+ 32768);
																	int i_66_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub29
																			.method931(i_66_, 3958, i_65_));
																} else if (i_6_ == 3315) {
																	i_3_ -= 2;
																	int i_67_ = ((Class79.anIntArray1305[i_3_])
																			+ 32768);
																	int i_68_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub2_Sub12
																			.method322(i_67_, (byte) 55, i_68_));
																} else if (i_6_ == 3316) {
																	if ((Class152.anInt2439) < 2)
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = Class152.anInt2439;
																} else if (i_6_ == 3317)
																	Class79.anIntArray1305[i_3_++] = (Class7_Sub2.anInt2675);
																else if (i_6_ == 3318)
																	Class79.anIntArray1305[i_3_++] = (Class120.anInt2005);
																else if (i_6_ == 3321)
																	Class79.anIntArray1305[i_3_++] = (Class1.anInt73);
																else if (i_6_ == 3322)
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub4.anInt2789);
																else if (i_6_ == 3323) {
																	if (((Static2.anInt2889) < 5)
																			|| (Static2.anInt2889 > 9))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = 1;
																} else if (i_6_ == 3324) {
																	if (((Static2.anInt2889) < 5)
																			|| (Static2.anInt2889 > 9))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = Static2.anInt2889;
																} else if (i_6_ == 3325) {
																	if ((Class14_Sub20.anInt3090) > 0)
																		Class79.anIntArray1305[i_3_++] = 1;
																	else
																		Class79.anIntArray1305[i_3_++] = 0;
																} else if (i_6_ == 3326)
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt4937);
																else if (i_6_ == 3327)
																	Class79.anIntArray1305[i_3_++] = ((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941.aBoolean1711)
																			? 1 : 0);
																else if (i_6_ == 3328)
																	Class79.anIntArray1305[i_3_++] = (Class146.anInt2365);
																else if (i_6_ == 3329)
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub2_Sub21.anInt4081);
																else if (i_6_ == 3330) {
																	int i_69_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method658((byte) -111, i_69_));
																} else if (i_6_ == 3331) {
																	i_3_ -= 2;
																	int i_70_ = (Class79.anIntArray1305[i_3_]);
																	int i_71_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Static2
																			.method993(false, -28006, i_71_, i_70_));
																} else if (i_6_ == 3332) {
																	i_3_ -= 2;
																	int i_72_ = (Class79.anIntArray1305[i_3_]);
																	int i_73_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Static2
																			.method993(true, -28006, i_73_, i_72_));
																} else {
																	if (i_6_ != 3333)
																		break;
																	Class79.anIntArray1305[i_3_++] = (Class75.anInt1163);
																}
															} else if (i_6_ < 3500) {
																if (i_6_ == 3400) {
																	i_3_ -= 2;
																	int i_74_ = (Class79.anIntArray1305[i_3_]);
																	int i_75_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class14_Sub2_Sub8 class14_sub2_sub8 = (Static2
																			.method1507(-8475, i_74_));
																	if ((class14_sub2_sub8.anInt3845) != 0) {
																		/* empty */
																	}
																	JunkTex.aClass124Array5101[i_4_++] = (class14_sub2_sub8
																			.method295(-66, i_75_));
																} else if (i_6_ == 3408) {
																	i_3_ -= 4;
																	int i_76_ = (Class79.anIntArray1305[i_3_]);
																	int i_77_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_78_ = (Class79.anIntArray1305[(i_3_ + 2)]);
																	int i_79_ = (Class79.anIntArray1305[(i_3_ + 3)]);
																	Class14_Sub2_Sub8 class14_sub2_sub8 = (Static2
																			.method1507(-8475, i_78_));
																	if ((i_76_ != class14_sub2_sub8.anInt3851)
																			|| (class14_sub2_sub8.anInt3845 != i_77_))
																		throw new RuntimeException("C3408-1");
																	if (i_77_ == 115)
																		JunkTex.aClass124Array5101[i_4_++] = class14_sub2_sub8
																				.method295(
																						Canvas_Sub2.method69(i_1_, -60),
																						i_79_);
																	else
																		Class79.anIntArray1305[i_3_++] = class14_sub2_sub8
																				.method299(
																						Canvas_Sub2.method69(i_1_, 77),
																						i_79_);
																} else if (i_6_ == 3409) {
																	i_3_ -= 3;
																	int i_80_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_81_ = (Class79.anIntArray1305[i_3_]);
																	int i_82_ = (Class79.anIntArray1305[(i_3_ + 2)]);
																	Class14_Sub2_Sub8 class14_sub2_sub8 = (Static2
																			.method1507(-8475, i_80_));
																	if (i_81_ != (class14_sub2_sub8.anInt3845))
																		throw new RuntimeException("C3409-1");
																	Class79.anIntArray1305[i_3_++] = ((class14_sub2_sub8
																			.method294(i_82_, 96)) ? 1 : 0);
																} else {
																	if (i_6_ != 3410)
																		break;
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	int i_83_ = (Class79.anIntArray1305[--i_3_]);
																	Class14_Sub2_Sub8 class14_sub2_sub8 = (Static2
																			.method1507(-8475, i_83_));
																	if ((class14_sub2_sub8.anInt3845) != 115)
																		throw new RuntimeException("C3410-1");
																	Class79.anIntArray1305[i_3_++] = ((class14_sub2_sub8
																			.method300(class124, (byte) -98)) ? 1 : 0);
																}
															} else if (i_6_ < 3700) {
																if (i_6_ == 3600) {
																	if ((Class15.anInt380) == 0)
																		Class79.anIntArray1305[i_3_++] = -2;
																	else if (Class15.anInt380 == 1)
																		Class79.anIntArray1305[i_3_++] = -1;
																	else
																		Class79.anIntArray1305[i_3_++] = Static2.anInt3728;
																} else if (i_6_ == 3601) {
																	int i_84_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) != 2)
																			|| (i_84_ >= Static2.anInt3728))
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Static2.aClass124Array2938[i_84_];
																} else if (i_6_ == 3602) {
																	int i_85_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) == 2)
																			&& (i_85_ < Static2.anInt3728))
																		Class79.anIntArray1305[i_3_++] = Class45.anIntArray743[i_85_];
																	else
																		Class79.anIntArray1305[i_3_++] = 0;
																} else if (i_6_ == 3603) {
																	int i_86_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) != 2)
																			|| (i_86_ >= Static2.anInt3728))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = Static2.anIntArray3720[i_86_];
																} else if (i_6_ == 3604) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	int i_87_ = (Class79.anIntArray1305[--i_3_]);
																	Class14_Sub14.method867((byte) 123, class124,
																			i_87_);
																} else if (i_6_ == 3605) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.method630(1003,
																			(class124.method1692(i_1_ - 79)));
																} else if (i_6_ == 3606) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.method558(
																			(class124.method1692(0)), (byte) -17);
																} else if (i_6_ == 3607) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.method899((class124.method1692(0)),
																			-106);
																} else if (i_6_ == 3608) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	JunkTex.method520(1,
																			(class124.method1692(0)));
																} else if (i_6_ == 3609) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	if ((class124.method1690(
																			(Class14_Sub15.aClass124_2993), 33))
																			|| (class124.method1690(
																					Static2.aClass124_46, 33)))
																		class124 = class124.method1696(7, i_1_ - 64);
																	Class79.anIntArray1305[i_3_++] = (!(Class98
																			.method1493(-1, class124)) ? 0 : 1);
																} else if (i_6_ == 3610) {
																	int i_88_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) == 2)
																			&& (i_88_ < Static2.anInt3728))
																		JunkTex.aClass124Array5101[i_4_++] = JunkTex.aClass124Array3959[i_88_];
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																} else if (i_6_ == 3611) {
																	if ((Class7_Sub3_Sub1.aClass124_3710) == null)
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Class7_Sub3_Sub1.aClass124_3710
																				.method1685(0);
																} else if (i_6_ == 3612) {
																	if ((Class7_Sub3_Sub1.aClass124_3710) != null)
																		Class79.anIntArray1305[i_3_++] = Class14_Sub2_Sub21.anInt4084;
																	else
																		Class79.anIntArray1305[i_3_++] = 0;
																} else if (i_6_ == 3613) {
																	int i_89_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class7_Sub3_Sub1.aClass124_3710) != null)
																			&& (Class14_Sub2_Sub21.anInt4084 > i_89_))
																		JunkTex.aClass124Array5101[i_4_++] = SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945[i_89_].aClass124_3132
																				.method1685(0);
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																} else if (i_6_ == 3614) {
																	int i_90_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class7_Sub3_Sub1.aClass124_3710) != null)
																			&& (i_90_ < Class14_Sub2_Sub21.anInt4084))
																		Class79.anIntArray1305[i_3_++] = SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945[i_90_].anInt3128;
																	else
																		Class79.anIntArray1305[i_3_++] = 0;
																} else if (i_6_ == 3615) {
																	int i_91_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class7_Sub3_Sub1.aClass124_3710) == null)
																			|| (i_91_ >= Class14_Sub2_Sub21.anInt4084))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945[i_91_].aByte3131;
																} else if (i_6_ == 3616)
																	Class79.anIntArray1305[i_3_++] = (Class14_Sub30.aByte3283);
																else if (i_6_ == 3617) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	Class14_Sub4.method459(class124, 2);
																} else if (i_6_ == 3618)
																	Class79.anIntArray1305[i_3_++] = (Class153.aByte2442);
																else if (i_6_ == 3619) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	Class89.method1441((class124.method1692(0)), true);
																} else if (i_6_ == 3620)
																	SceneGraphNode_AnimatedLocation.method1835(-73);
																else if (i_6_ == 3621) {
																	if ((Class15.anInt380) == 0)
																		Class79.anIntArray1305[i_3_++] = -1;
																	else
																		Class79.anIntArray1305[i_3_++] = Class42.anInt698;
																} else if (i_6_ == 3622) {
																	int i_92_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) != 0)
																			&& (i_92_ < Class42.anInt698))
																		JunkTex.aClass124Array5101[i_4_++] = Static2
																				.method1174(
																						Static2.aLongArray2095[i_92_],
																						(byte) 76)
																				.method1685(0);
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																} else if (i_6_ == 3623) {
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	if ((class124.method1690(
																			(Class14_Sub15.aClass124_2993), 33))
																			|| (class124.method1690(
																					Static2.aClass124_46, 33)))
																		class124 = class124.method1696(7, i_1_ - 64);
																	Class79.anIntArray1305[i_3_++] = (!(JunkTex
																			.method597(class124, 0)) ? 0 : 1);
																} else if (i_6_ == 3624) {
																	int i_93_ = (Class79.anIntArray1305[--i_3_]);
																	if (((SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945) == null)
																			|| (i_93_ >= Class14_Sub2_Sub21.anInt4084)
																			|| !(SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945[i_93_].aClass124_3132
																					.method1717(40,
																							Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass124_4922)))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = 1;
																} else if (i_6_ == 3625) {
																	if ((Class4.aClass124_129) != null)
																		JunkTex.aClass124Array5101[i_4_++] = Class4.aClass124_129
																				.method1685(0);
																	else
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																} else if (i_6_ == 3626) {
																	int i_94_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class7_Sub3_Sub1.aClass124_3710) == null)
																			|| (Class14_Sub2_Sub21.anInt4084 <= i_94_))
																		JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																	else
																		JunkTex.aClass124Array5101[i_4_++] = SceneGraphNode_GameEntity_Sub2.aClass14_Sub23Array4945[i_94_].aClass124_3127;
																} else if (i_6_ == 3627) {
																	int i_95_ = (Class79.anIntArray1305[--i_3_]);
																	if (((Class15.anInt380) != 2) || (i_95_ < 0)
																			|| (i_95_ >= Static2.anInt3728))
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = !Class58.aBooleanArray950[i_95_]
																				? 0 : 1;
																} else {
																	if (i_6_ != 3628)
																		break;
																	Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
																	if ((class124.method1690(
																			(Class14_Sub15.aClass124_2993), 33))
																			|| (class124.method1690(
																					Static2.aClass124_46, 33)))
																		class124 = class124.method1696(7, 15);
																	Class79.anIntArray1305[i_3_++] = (Static2
																			.method1601(class124, 6));
																}
															} else if (i_6_ >= 4000) {
																if (i_6_ >= 4100) {
																	if (i_6_ >= 4200) {
																		if (i_6_ >= 4300) {
																			if (i_6_ >= 4400) {
																				if (i_6_ < 4500) {
																					if (i_6_ != 4400)
																						break;
																					i_3_ -= 2;
																					int i_96_ = Class79.anIntArray1305[i_3_
																							+ 1];
																					int i_97_ = Class79.anIntArray1305[i_3_];
																					Class14_Sub2_Sub2 class14_sub2_sub2 = Class17
																							.method958((byte) -15,
																									i_96_);
																					if (!class14_sub2_sub2
																							.method261((byte) 57))
																						Class79.anIntArray1305[i_3_++] = Class79
																								.method1377((byte) -106,
																										i_97_)
																								.method1388(i_96_,
																										class14_sub2_sub2.anInt3766,
																										92);
																					else
																						JunkTex.aClass124Array5101[i_4_++] = Class79
																								.method1377((byte) -106,
																										i_97_)
																								.method1390((byte) -120,
																										i_96_,
																										class14_sub2_sub2.aClass124_3760);
																				} else if (i_6_ < 4600) {
																					if (i_6_ != 4500)
																						break;
																					i_3_ -= 2;
																					int i_98_ = Class79.anIntArray1305[i_3_
																							+ 1];
																					int i_99_ = Class79.anIntArray1305[i_3_];
																					Class14_Sub2_Sub2 class14_sub2_sub2 = Class17
																							.method958((byte) -127,
																									i_98_);
																					if (!class14_sub2_sub2
																							.method261((byte) 92))
																						Class79.anIntArray1305[i_3_++] = JunkTex
																								.method661(true, i_99_)
																								.method267((byte) -109,
																										i_98_,
																										class14_sub2_sub2.anInt3766);
																					else
																						JunkTex.aClass124Array5101[i_4_++] = JunkTex
																								.method661(true, i_99_)
																								.method275(i_98_, 1,
																										class14_sub2_sub2.aClass124_3760);
																				} else if (i_6_ < 5100) {
																					if (i_6_ == 5000)
																						Class79.anIntArray1305[i_3_++] = Class14_Sub3.anInt2764;
																					else if (i_6_ == 5001) {
																						i_3_ -= 3;
																						Class14_Sub3.anInt2764 = Class79.anIntArray1305[i_3_];
																						JunkTex.anInt4505 = Class79.anIntArray1305[i_3_
																								+ 1];
																						Class32.anInt566 = Class79.anIntArray1305[i_3_
																								+ 2];
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(212);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(Class14_Sub3.anInt2764);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(JunkTex.anInt4505);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(Class32.anInt566);
																					} else if (i_6_ == 5002) {
																						i_3_ -= 2;
																						int i_100_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_101_ = Class79.anIntArray1305[i_3_];
																						Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(159);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method817(
																										class124.method1692(
																												i_1_ ^ 0x4f));
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(i_101_ - 1);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(i_100_);
																					} else if (i_6_ == 5003) {
																						Class124 class124 = null;
																						int i_102_ = Class79.anIntArray1305[--i_3_];
																						if (i_102_ < 100)
																							class124 = Static2.aClass124Array4024[i_102_];
																						if (class124 == null)
																							class124 = Class140.aClass124_2234;
																						JunkTex.aClass124Array5101[i_4_++] = class124;
																					} else if (i_6_ == 5004) {
																						int i_103_ = Class79.anIntArray1305[--i_3_];
																						int i_104_ = -1;
																						if (i_103_ < 100
																								&& Static2.aClass124Array4024[i_103_] != null)
																							i_104_ = Static2.anIntArray1902[i_103_];
																						Class79.anIntArray1305[i_3_++] = i_104_;
																					} else if (i_6_ == 5005)
																						Class79.anIntArray1305[i_3_++] = JunkTex.anInt4505;
																					else if (i_6_ == 5008) {
																						Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																						if (class124.method1690(
																								Class14_Sub29.aClass124_3263,
																								33))
																							SceneGraphNode_GameEntity.method1798(
																									class124, (byte) 7);
																						else if (Class152.anInt2439 != 0
																								|| Class146.anInt2365 != 1
																										&& Class14_Sub2_Sub21.anInt4081 != 1) {
																							Class124 class124_105_ = class124
																									.method1716(
																											(byte) 63);
																							int i_106_ = 0;
																							if (class124_105_
																									.method1690(
																											Class104.aClass124_1748,
																											33)) {
																								class124 = class124
																										.method1696(
																												Class104.aClass124_1748
																														.length(
																																0),
																												15);
																								i_106_ = 0;
																							} else if (class124_105_
																									.method1690(
																											Class58.aClass124_943,
																											33)) {
																								i_106_ = 1;
																								class124 = class124
																										.method1696(
																												Class58.aClass124_943
																														.length(
																																0),
																												15);
																							} else if (!class124_105_
																									.method1690(
																											Class84.aClass124_1347,
																											33)) {
																								if (class124_105_
																										.method1690(
																												Class15.aClass124_383,
																												33)) {
																									i_106_ = 3;
																									class124 = class124
																											.method1696(
																													Class15.aClass124_383
																															.length(
																																	0),
																													15);
																								} else if (class124_105_
																										.method1690(
																												Class137.aClass124_2202,
																												33)) {
																									i_106_ = 4;
																									class124 = class124
																											.method1696(
																													Class137.aClass124_2202
																															.length(
																																	0),
																													15);
																								} else if (class124_105_
																										.method1690(
																												Class118.aClass124_1979,
																												33)) {
																									class124 = class124
																											.method1696(
																													Class118.aClass124_1979
																															.length(
																																	i_1_ ^ 0x4f),
																													15);
																									i_106_ = 5;
																								} else if (!class124_105_
																										.method1690(
																												Class12.aClass124_311,
																												i_1_ - 46)) {
																									if (class124_105_
																											.method1690(
																													Class127.aClass124_2113,
																													33)) {
																										class124 = class124
																												.method1696(
																														Class127.aClass124_2113
																																.length(
																																		0),
																														i_1_ - 64);
																										i_106_ = 7;
																									} else if (!class124_105_
																											.method1690(
																													Class7_Sub2.aClass124_2670,
																													i_1_ - 46)) {
																										if (class124_105_
																												.method1690(
																														Class124.aClass124_2476,
																														33)) {
																											class124 = class124
																													.method1696(
																															Class124.aClass124_2476
																																	.length(
																																			0),
																															15);
																											i_106_ = 9;
																										} else if (class124_105_
																												.method1690(
																														Static2.aClass124_2887,
																														33)) {
																											i_106_ = 10;
																											class124 = class124
																													.method1696(
																															Static2.aClass124_2887
																																	.length(
																																			i_1_ - 79),
																															15);
																										} else if (!class124_105_
																												.method1690(
																														Class128.aClass124_2126,
																														i_1_ ^ 0x6e)) {
																											if (JunkTex.language != 0) {
																												if (!class124_105_
																														.method1690(
																																Class104.aClass124_1743,
																																33)) {
																													if (class124_105_
																															.method1690(
																																	Class58.aClass124_942,
																																	33)) {
																														i_106_ = 1;
																														class124 = class124
																																.method1696(
																																		Class58.aClass124_942
																																				.length(
																																						i_1_ ^ 0x4f),
																																		15);
																													} else if (!class124_105_
																															.method1690(
																																	Class84.aClass124_1352,
																																	33)) {
																														if (class124_105_
																																.method1690(
																																		Class15.aClass124_373,
																																		33)) {
																															class124 = class124
																																	.method1696(
																																			Class15.aClass124_373
																																					.length(
																																							i_1_ ^ 0x4f),
																																			15);
																															i_106_ = 3;
																														} else if (!class124_105_
																																.method1690(
																																		Class137.aClass124_2201,
																																		33)) {
																															if (class124_105_
																																	.method1690(
																																			Class118.aClass124_1988,
																																			33)) {
																																class124 = class124
																																		.method1696(
																																				Class118.aClass124_1988
																																						.length(
																																								0),
																																				15);
																																i_106_ = 5;
																															} else if (!class124_105_
																																	.method1690(
																																			Class12.aClass124_328,
																																			33)) {
																																if (class124_105_
																																		.method1690(
																																				Class127.aClass124_2117,
																																				33)) {
																																	class124 = class124
																																			.method1696(
																																					Class127.aClass124_2117
																																							.length(
																																									0),
																																					i_1_ - 64);
																																	i_106_ = 7;
																																} else if (!class124_105_
																																		.method1690(
																																				Class7_Sub2.aClass124_2672,
																																				33)) {
																																	if (!class124_105_
																																			.method1690(
																																					Class124.aClass124_2497,
																																					33)) {
																																		if (class124_105_
																																				.method1690(
																																						Static2.aClass124_2872,
																																						i_1_ ^ 0x6e)) {
																																			i_106_ = 10;
																																			class124 = class124
																																					.method1696(
																																							Static2.aClass124_2872
																																									.length(
																																											0),
																																							i_1_ ^ 0x40);
																																		} else if (class124_105_
																																				.method1690(
																																						Class128.aClass124_2122,
																																						33)) {
																																			class124 = class124
																																					.method1696(
																																							Class128.aClass124_2122
																																									.length(
																																											i_1_ ^ 0x4f),
																																							15);
																																			i_106_ = 11;
																																		}
																																	} else {
																																		class124 = class124
																																				.method1696(
																																						Class124.aClass124_2497
																																								.length(
																																										0),
																																						i_1_ ^ 0x40);
																																		i_106_ = 9;
																																	}
																																} else {
																																	i_106_ = 8;
																																	class124 = class124
																																			.method1696(
																																					Class7_Sub2.aClass124_2672
																																							.length(
																																									0),
																																					15);
																																}
																															} else {
																																class124 = class124
																																		.method1696(
																																				Class12.aClass124_328
																																						.length(
																																								0),
																																				i_1_ - 64);
																																i_106_ = 6;
																															}
																														} else {
																															i_106_ = 4;
																															class124 = class124
																																	.method1696(
																																			Class137.aClass124_2201
																																					.length(
																																							i_1_ ^ 0x4f),
																																			15);
																														}
																													} else {
																														i_106_ = 2;
																														class124 = class124
																																.method1696(
																																		Class84.aClass124_1352
																																				.length(
																																						i_1_ - 79),
																																		i_1_ ^ 0x40);
																													}
																												} else {
																													i_106_ = 0;
																													class124 = class124
																															.method1696(
																																	Class104.aClass124_1743
																																			.length(
																																					i_1_ ^ 0x4f),
																																	i_1_ ^ 0x40);
																												}
																											}
																										} else {
																											i_106_ = 11;
																											class124 = class124
																													.method1696(
																															Class128.aClass124_2126
																																	.length(
																																			i_1_ - 79),
																															15);
																										}
																									} else {
																										i_106_ = 8;
																										class124 = class124
																												.method1696(
																														Class7_Sub2.aClass124_2670
																																.length(
																																		0),
																														15);
																									}
																								} else {
																									class124 = class124
																											.method1696(
																													Class12.aClass124_311
																															.length(
																																	i_1_ - 79),
																													15);
																									i_106_ = 6;
																								}
																							} else {
																								i_106_ = 2;
																								class124 = class124
																										.method1696(
																												Class84.aClass124_1347
																														.length(
																																0),
																												15);
																							}
																							class124_105_ = class124
																									.method1716(
																											(byte) 63);
																							int i_107_ = 0;
																							if (class124_105_
																									.method1690(
																											JunkTex.aClass124_4545,
																											33)) {
																								class124 = class124
																										.method1696(
																												JunkTex.aClass124_4545
																														.length(
																																0),
																												15);
																								i_107_ = 1;
																							} else if (class124_105_
																									.method1690(
																											Class108.aClass124_1815,
																											33)) {
																								i_107_ = 2;
																								class124 = class124
																										.method1696(
																												Class108.aClass124_1815
																														.length(
																																i_1_ ^ 0x4f),
																												15);
																							} else if (class124_105_
																									.method1690(
																											Class14_Sub11.aClass124_2941,
																											33)) {
																								i_107_ = 3;
																								class124 = class124
																										.method1696(
																												Class14_Sub11.aClass124_2941
																														.length(
																																0),
																												15);
																							} else if (!class124_105_
																									.method1690(
																											Static2.aClass124_1682,
																											33)) {
																								if (class124_105_
																										.method1690(
																												JunkTex.aClass124_4021,
																												33)) {
																									i_107_ = 5;
																									class124 = class124
																											.method1696(
																													JunkTex.aClass124_4021
																															.length(
																																	0),
																													15);
																								} else if (JunkTex.language != 0) {
																									if (!class124_105_
																											.method1690(
																													JunkTex.aClass124_4538,
																													33)) {
																										if (class124_105_
																												.method1690(
																														Class108.aClass124_1821,
																														33)) {
																											i_107_ = 2;
																											class124 = class124
																													.method1696(
																															Class108.aClass124_1821
																																	.length(
																																			0),
																															15);
																										} else if (!class124_105_
																												.method1690(
																														Class14_Sub11.aClass124_2943,
																														33)) {
																											if (!class124_105_
																													.method1690(
																															Static2.aClass124_1683,
																															33)) {
																												if (class124_105_
																														.method1690(
																																JunkTex.aClass124_4019,
																																i_1_ - 46)) {
																													class124 = class124
																															.method1696(
																																	JunkTex.aClass124_4019
																																			.length(
																																					0),
																																	i_1_ ^ 0x40);
																													i_107_ = 5;
																												}
																											} else {
																												i_107_ = 4;
																												class124 = class124
																														.method1696(
																																Static2.aClass124_1683
																																		.length(
																																				i_1_ ^ 0x4f),
																																i_1_ - 64);
																											}
																										} else {
																											i_107_ = 3;
																											class124 = class124
																													.method1696(
																															Class14_Sub11.aClass124_2943
																																	.length(
																																			0),
																															15);
																										}
																									} else {
																										i_107_ = 1;
																										class124 = class124
																												.method1696(
																														JunkTex.aClass124_4538
																																.length(
																																		0),
																														15);
																									}
																								}
																							} else {
																								class124 = class124
																										.method1696(
																												Static2.aClass124_1682
																														.length(
																																i_1_ ^ 0x4f),
																												15);
																								i_107_ = 4;
																							}
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeOpcode(222);
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeByte(0);
																							int i_108_ = JunkTex.aClass14_Sub10_Sub1_891.position;
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeByte(i_106_);
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeByte(i_107_);
																							Class14_Sub11.method854(
																									JunkTex.aClass14_Sub10_Sub1_891,
																									class124);
																							JunkTex.aClass14_Sub10_Sub1_891
																									.method804(
																											JunkTex.aClass14_Sub10_Sub1_891.position
																													- i_108_,
																											(byte) 32);
																						}
																					} else if (i_6_ == 5009) {
																						i_4_ -= 2;
																						Class124 class124 = JunkTex.aClass124Array5101[i_4_
																								+ 1];
																						Class124 class124_109_ = JunkTex.aClass124Array5101[i_4_];
																						if (Class152.anInt2439 != 0
																								|| Class146.anInt2365 != 1
																										&& Class14_Sub2_Sub21.anInt4081 != 1) {
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeOpcode(178);
																							JunkTex.aClass14_Sub10_Sub1_891
																									.writeByte(0);
																							int i_110_ = JunkTex.aClass14_Sub10_Sub1_891.position;
																							JunkTex.aClass14_Sub10_Sub1_891
																									.method817(
																											class124_109_
																													.method1692(
																															0));
																							Class14_Sub11.method854(
																									JunkTex.aClass14_Sub10_Sub1_891,
																									class124);
																							JunkTex.aClass14_Sub10_Sub1_891
																									.method804(
																											-i_110_ + JunkTex.aClass14_Sub10_Sub1_891.position,
																											(byte) 32);
																						}
																					} else if (i_6_ == 5010) {
																						Class124 class124 = null;
																						int i_111_ = Class79.anIntArray1305[--i_3_];
																						if (i_111_ < 100)
																							class124 = JunkTex.aClass124Array4626[i_111_];
																						if (class124 == null)
																							class124 = Class140.aClass124_2234;
																						JunkTex.aClass124Array5101[i_4_++] = class124;
																					} else if (i_6_ == 5011) {
																						int i_112_ = Class79.anIntArray1305[--i_3_];
																						Class124 class124 = null;
																						if (i_112_ < 100)
																							class124 = Class124.aClass124Array2508[i_112_];
																						if (class124 == null)
																							class124 = Class140.aClass124_2234;
																						JunkTex.aClass124Array5101[i_4_++] = class124;
																					} else if (i_6_ == 5012) {
																						int i_113_ = Class79.anIntArray1305[--i_3_];
																						int i_114_ = -1;
																						if (i_113_ < 100)
																							i_114_ = SceneGraphNode.anIntArray2176[i_113_];
																						Class79.anIntArray1305[i_3_++] = i_114_;
																					} else if (i_6_ == 5015) {
																						Class124 class124;
																						if (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748 == null
																								|| Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass124_4922 == null)
																							class124 = JunkTex.aClass124_4241;
																						else
																							class124 = Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748
																									.method1808(true);
																						JunkTex.aClass124Array5101[i_4_++] = class124;
																					} else if (i_6_ == 5016)
																						Class79.anIntArray1305[i_3_++] = Class32.anInt566;
																					else if (i_6_ == 5017)
																						Class79.anIntArray1305[i_3_++] = Class53.anInt874;
																					else if (i_6_ == 5050) {
																						int i_115_ = Class79.anIntArray1305[--i_3_];
																						JunkTex.aClass124Array5101[i_4_++] = JunkTex
																								.method541(i_115_,
																										20083).aClass124_3876;
																					} else if (i_6_ == 5051) {
																						int i_116_ = Class79.anIntArray1305[--i_3_];
																						Class14_Sub2_Sub11 class14_sub2_sub11 = JunkTex
																								.method541(i_116_,
																										20083);
																						if (class14_sub2_sub11.anIntArray3885 == null)
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = class14_sub2_sub11.anIntArray3885.length;
																					} else if (i_6_ == 5052) {
																						i_3_ -= 2;
																						int i_117_ = Class79.anIntArray1305[i_3_];
																						int i_118_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						Class14_Sub2_Sub11 class14_sub2_sub11 = JunkTex
																								.method541(i_117_,
																										20083);
																						int i_119_ = class14_sub2_sub11.anIntArray3885[i_118_];
																						Class79.anIntArray1305[i_3_++] = i_119_;
																					} else if (i_6_ == 5053) {
																						int i_120_ = Class79.anIntArray1305[--i_3_];
																						Class14_Sub2_Sub11 class14_sub2_sub11 = JunkTex
																								.method541(i_120_,
																										20083);
																						if (class14_sub2_sub11.anIntArray3882 == null)
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = class14_sub2_sub11.anIntArray3882.length;
																					} else if (i_6_ == 5054) {
																						i_3_ -= 2;
																						int i_121_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_122_ = Class79.anIntArray1305[i_3_];
																						Class79.anIntArray1305[i_3_++] = JunkTex
																								.method541(i_122_,
																										20083).anIntArray3882[i_121_];
																					} else if (i_6_ == 5055) {
																						int i_123_ = Class79.anIntArray1305[--i_3_];
																						JunkTex.aClass124Array5101[i_4_++] = Class14_Sub2_Sub3
																								.method272(i_123_,
																										(byte) 74)
																								.method438(125);
																					} else if (i_6_ == 5056) {
																						int i_124_ = Class79.anIntArray1305[--i_3_];
																						Class14_Sub2_Sub21 class14_sub2_sub21 = Class14_Sub2_Sub3
																								.method272(i_124_,
																										(byte) 99);
																						if (class14_sub2_sub21.anIntArray4082 == null)
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = class14_sub2_sub21.anIntArray4082.length;
																					} else if (i_6_ == 5057) {
																						i_3_ -= 2;
																						int i_125_ = Class79.anIntArray1305[i_3_];
																						int i_126_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						Class79.anIntArray1305[i_3_++] = Class14_Sub2_Sub3
																								.method272(i_125_,
																										(byte) 119).anIntArray4082[i_126_];
																					} else if (i_6_ == 5058) {
																						Class22.aClass98_464 = new Class98();
																						Class22.aClass98_464.anInt1663 = Class79.anIntArray1305[--i_3_];
																						Class22.aClass98_464.aClass14_Sub2_Sub21_1662 = Class14_Sub2_Sub3
																								.method272(
																										Class22.aClass98_464.anInt1663,
																										(byte) 67);
																						Class22.aClass98_464.anIntArray1658 = new int[Class22.aClass98_464.aClass14_Sub2_Sub21_1662
																								.method446(
																										(byte) -124)];
																					} else if (i_6_ == 5059) {
																						Static2.anInt4892++;
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(250);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(0);
																						int i_127_ = JunkTex.aClass14_Sub10_Sub1_891.position;
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(0);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method833((byte) 114,
																										Class22.aClass98_464.anInt1663);
																						Class22.aClass98_464.aClass14_Sub2_Sub21_1662
																								.method443(
																										JunkTex.aClass14_Sub10_Sub1_891,
																										(byte) -103,
																										Class22.aClass98_464.anIntArray1658);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method804(
																										JunkTex.aClass14_Sub10_Sub1_891.position
																												- i_127_,
																										(byte) 32);
																					} else if (i_6_ == 5060) {
																						Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(78);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(0);
																						int i_128_ = JunkTex.aClass14_Sub10_Sub1_891.position;
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method817(
																										class124.method1692(
																												0));
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method833((byte) 121,
																										Class22.aClass98_464.anInt1663);
																						Class22.aClass98_464.aClass14_Sub2_Sub21_1662
																								.method443(
																										JunkTex.aClass14_Sub10_Sub1_891,
																										(byte) -64,
																										Class22.aClass98_464.anIntArray1658);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method804(
																										-i_128_ + JunkTex.aClass14_Sub10_Sub1_891.position,
																										(byte) 32);
																					} else if (i_6_ == 5061) {
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(250);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(0);
																						int i_129_ = JunkTex.aClass14_Sub10_Sub1_891.position;
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(1);
																						Static2.anInt4892++;
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method833((byte) 100,
																										Class22.aClass98_464.anInt1663);
																						Class22.aClass98_464.aClass14_Sub2_Sub21_1662
																								.method443(
																										JunkTex.aClass14_Sub10_Sub1_891,
																										(byte) -70,
																										Class22.aClass98_464.anIntArray1658);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method804(
																										JunkTex.aClass14_Sub10_Sub1_891.position
																												- i_129_,
																										(byte) 32);
																					} else if (i_6_ == 5062) {
																						i_3_ -= 2;
																						int i_130_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_131_ = Class79.anIntArray1305[i_3_];
																						Class79.anIntArray1305[i_3_++] = JunkTex
																								.method541(i_131_,
																										20083).anIntArray3888[i_130_];
																					} else if (i_6_ == 5063) {
																						i_3_ -= 2;
																						int i_132_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_133_ = Class79.anIntArray1305[i_3_];
																						Class79.anIntArray1305[i_3_++] = JunkTex
																								.method541(i_133_,
																										20083).anIntArray3886[i_132_];
																					} else if (i_6_ == 5064) {
																						i_3_ -= 2;
																						int i_134_ = Class79.anIntArray1305[i_3_];
																						int i_135_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						if (i_135_ != -1)
																							Class79.anIntArray1305[i_3_++] = JunkTex
																									.method541(i_134_,
																											20083)
																									.method308(
																											(byte) 27,
																											i_135_);
																						else
																							Class79.anIntArray1305[i_3_++] = -1;
																					} else if (i_6_ == 5065) {
																						i_3_ -= 2;
																						int i_136_ = Class79.anIntArray1305[i_3_];
																						int i_137_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						if (i_137_ == -1)
																							Class79.anIntArray1305[i_3_++] = -1;
																						else
																							Class79.anIntArray1305[i_3_++] = JunkTex
																									.method541(i_136_,
																											20083)
																									.method311(i_137_,
																											-128);
																					} else if (i_6_ == 5066) {
																						int i_138_ = Class79.anIntArray1305[--i_3_];
																						Class79.anIntArray1305[i_3_++] = Class14_Sub2_Sub3
																								.method272(i_138_,
																										(byte) 112)
																								.method446((byte) 75);
																					} else if (i_6_ == 5067) {
																						i_3_ -= 2;
																						int i_139_ = Class79.anIntArray1305[i_3_];
																						int i_140_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_141_ = Class14_Sub2_Sub3
																								.method272(i_139_,
																										(byte) 107)
																								.method433(-116,
																										i_140_);
																						Class79.anIntArray1305[i_3_++] = i_141_;
																					} else if (i_6_ == 5068) {
																						i_3_ -= 2;
																						int i_142_ = Class79.anIntArray1305[i_3_];
																						int i_143_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						Class22.aClass98_464.anIntArray1658[i_142_] = i_143_;
																					} else if (i_6_ == 5069) {
																						i_3_ -= 2;
																						int i_144_ = Class79.anIntArray1305[i_3_];
																						int i_145_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						Class22.aClass98_464.anIntArray1658[i_144_] = i_145_;
																					} else {
																						if (i_6_ != 5070)
																							break;
																						i_3_ -= 3;
																						int i_146_ = Class79.anIntArray1305[i_3_];
																						int i_147_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						int i_148_ = Class79.anIntArray1305[i_3_
																								+ 2];
																						Class14_Sub2_Sub21 class14_sub2_sub21 = Class14_Sub2_Sub3
																								.method272(i_146_,
																										(byte) 106);
																						if (class14_sub2_sub21
																								.method433(-51,
																										i_147_) != 0)
																							throw new RuntimeException(
																									"bad command");
																						Class79.anIntArray1305[i_3_++] = class14_sub2_sub21
																								.method435(i_147_,
																										i_148_,
																										(byte) -84);
																					}
																				} else if (i_6_ < 5200) {
																					if (i_6_ == 5100) {
																						if (!JunkTex.aBooleanArray4581[86])
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = 1;
																					} else if (i_6_ == 5101) {
																						if (!JunkTex.aBooleanArray4581[82])
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = 1;
																					} else {
																						if (i_6_ != 5102)
																							break;
																						if (!JunkTex.aBooleanArray4581[81])
																							Class79.anIntArray1305[i_3_++] = 0;
																						else
																							Class79.anIntArray1305[i_3_++] = 1;
																					}
																				} else if (i_6_ < 5300) {
																					if (i_6_ == 5200)
																						Class38.method1118(
																								Class79.anIntArray1305[--i_3_],
																								-1);
																					else if (i_6_ == 5201)
																						Class79.anIntArray1305[i_3_++] = Class7_Sub2_Sub1
																								.method128(1);
																					else if (i_6_ == 5202)
																						JunkTex.method631(
																								-118,
																								Class79.anIntArray1305[--i_3_]);
																					else if (i_6_ == 5203)
																						JunkTex.method506(
																								25514,
																								JunkTex.aClass124Array5101[--i_4_]);
																					else if (i_6_ == 5204)
																						JunkTex.aClass124Array5101[i_4_
																								- 1] = Class127
																										.method1750(
																												JunkTex.aClass124Array5101[i_4_
																														- 1],
																												(byte) 43);
																					else if (i_6_ == 5205)
																						Class22.method986(
																								JunkTex.aClass124Array5101[--i_4_],
																								i_1_ - 154);
																					else if (i_6_ == 5206) {
																						int i_149_ = Class79.anIntArray1305[--i_3_];
																						Class14_Sub2_Sub5 class14_sub2_sub5 = OverlayType
																								.method2020(
																										i_149_ >> 14
																												& 0x3fff,
																										false,
																										i_149_ & 0x3fff);
																						if (class14_sub2_sub5 == null)
																							JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																						else
																							JunkTex.aClass124Array5101[i_4_++] = class14_sub2_sub5.aClass124_3804;
																					} else {
																						if (i_6_ != 5207)
																							break;
																						Class14_Sub2_Sub5 class14_sub2_sub5 = Class14_Sub2_Sub20
																								.method432(101,
																										JunkTex.aClass124Array5101[--i_4_]);
																						if (class14_sub2_sub5 == null
																								|| class14_sub2_sub5.aClass124_3807 == null)
																							JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																						else
																							JunkTex.aClass124Array5101[i_4_++] = class14_sub2_sub5.aClass124_3807;
																					}
																				} else if (i_6_ < 5400) {
																					if (i_6_ == 5300) {
																						i_3_ -= 2;
																						int i_150_ = Class79.anIntArray1305[i_3_];
																						int i_151_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						if (ErrorReporting.aFrame3962 != null)
																							Class14_Sub2_Sub20
																									.method428(125);
																						SceneGraphNode_Projectile.method1854(i_150_,
																								i_151_, i_1_ - 45);
																						Class79.anIntArray1305[i_3_++] = ErrorReporting.aFrame3962 != null
																								? 1 : 0;
																					} else if (i_6_ == 5301) {
																						if (ErrorReporting.aFrame3962 != null)
																							Class14_Sub2_Sub20
																									.method428(-13);
																					} else if (i_6_ == 5302) {
																						Class88[] class88s = Class21
																								.method978(108);
																						Class79.anIntArray1305[i_3_++] = class88s.length;
																					} else if (i_6_ == 5303) {
																						int i_152_ = Class79.anIntArray1305[--i_3_];
																						Class88[] class88s = Class21
																								.method978(i_1_ - 153);
																						Class79.anIntArray1305[i_3_++] = class88s[i_152_].anInt1396;
																						Class79.anIntArray1305[i_3_++] = class88s[i_152_].anInt1397;
																					} else if (i_6_ == 5305) {
																						int i_153_ = -1;
																						int i_154_ = Class54.anInt887;
																						int i_155_ = Static2.anInt2725;
																						Class88[] class88s = Class21
																								.method978(98);
																						for (int i_156_ = 0; i_156_ < class88s.length; i_156_++) {
																							Class88 class88 = class88s[i_156_];
																							if (class88.anInt1396 == i_154_
																									&& class88.anInt1397 == i_155_) {
																								i_153_ = i_156_;
																								break;
																							}
																						}
																						Class79.anIntArray1305[i_3_++] = i_153_;
																					} else {
																						if (i_6_ != 5306)
																							break;
																						Class79.anIntArray1305[i_3_++] = Class1
																								.method73((byte) -58);
																					}
																				} else if (i_6_ < 5500) {
																					if (i_6_ == 5400) {
																						i_4_ -= 2;
																						Class124 class124 = JunkTex.aClass124Array5101[i_4_
																								+ 1];
																						int i_157_ = Class79.anIntArray1305[--i_3_];
																						Class124 class124_158_ = JunkTex.aClass124Array5101[i_4_];
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeOpcode(161);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(Static2.method1550(
																										class124_158_,
																										(byte) -107)
																										+ Static2
																												.method1550(
																														class124,
																														(byte) -107)
																										+ 1);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method814(i_1_ + 32689,
																										class124_158_);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.method814(32768,
																										class124);
																						JunkTex.aClass14_Sub10_Sub1_891
																								.writeByte(i_157_);
																					} else if (i_6_ == 5401) {
																						i_3_ -= 2;
																						Class33.aShortArray580[Class79.anIntArray1305[i_3_]] = (short) Class128
																								.method1759(
																										Class79.anIntArray1305[i_3_
																												+ 1],
																										(byte) 48);
																						Static2.method1505(true);
																						Class14_Sub23
																								.method903((byte) 54);
																						Static2.method839(8);
																						Static2.method172((byte) 98);
																						Class14_Sub2_Sub8
																								.method297((byte) -81);
																					} else if (i_6_ == 5405) {
																						i_3_ -= 2;
																						int i_159_ = Class79.anIntArray1305[i_3_];
																						int i_160_ = Class79.anIntArray1305[i_3_
																								+ 1];
																						if (i_159_ >= 0 && i_159_ < 2)
																							Class89.anIntArrayArrayArray1405[i_159_] = new int[i_160_ << 33][4];
																					} else if (i_6_ == 5406) {
																						i_3_ -= 7;
																						int i_161_ = Class79.anIntArray1305[i_3_
																								+ 1] << 33;
																						int i_162_ = Class79.anIntArray1305[i_3_
																								+ 2];
																						int i_163_ = Class79.anIntArray1305[i_3_];
																						int i_164_ = Class79.anIntArray1305[i_3_
																								+ 4];
																						int i_165_ = Class79.anIntArray1305[i_3_
																								+ 5];
																						int i_166_ = Class79.anIntArray1305[i_3_
																								+ 6];
																						int i_167_ = Class79.anIntArray1305[i_3_
																								+ 3];
																						if (i_163_ >= 0 && i_163_ < 2
																								&& Class89.anIntArrayArrayArray1405[i_163_] != null
																								&& i_161_ >= 0
																								&& i_161_ < Class89.anIntArrayArrayArray1405[i_163_].length) {
																							Class89.anIntArrayArrayArray1405[i_163_][i_161_] = new int[] {
																									JunkTex
																											.method617(
																													i_162_ >> 46,
																													16383)
																											* 128,
																									i_167_,
																									JunkTex
																											.method617(
																													16383,
																													i_162_)
																											* 128,
																									i_166_ };
																							Class89.anIntArrayArrayArray1405[i_163_][i_161_
																									+ 1] = new int[] {
																											(JunkTex
																													.method617(
																															i_164_,
																															268430875) >> 46)
																													* 128,
																											i_165_,
																											JunkTex
																													.method617(
																															i_164_,
																															16383)
																													* 128 };
																						}
																					} else if (i_6_ == 5407) {
																						int i_168_ = Class89.anIntArrayArrayArray1405[Class79.anIntArray1305[--i_3_]].length >> 33;
																						Class79.anIntArray1305[i_3_++] = i_168_;
																					} else if (i_6_ == 5408)
																						Class79.anIntArray1305[i_3_++] = 1;
																					else if (i_6_ == 5409)
																						Class32.method1081((byte) 96);
																					else if (i_6_ == 5411) {
																						if (ErrorReporting.aFrame3962 != null)
																							Class14_Sub2_Sub20
																									.method428(121);
																						if (ErrorReporting.aFrame2986 == null)
																							JunkTex.method1211(
																									Class86.method1419(
																											(byte) 125),
																									false, 87);
																						else
																							System.exit(0);
																					} else if (i_6_ == 5419) {
																						Class124 class124 = Class140.aClass124_2234;
																						if (JunkTex.aClass31_2458 != null) {
																							class124 = Static2
																									.method1552(
																											JunkTex.aClass31_2458.anInt526,
																											27968);
																							try {
																								if (JunkTex.aClass31_2458.anObject530 != null) {
																									byte[] is_169_ = ((String) JunkTex.aClass31_2458.anObject530)
																											.getBytes(
																													"ISO-8859-1");
																									class124 = Class124
																											.method231(
																													is_169_.length,
																													is_169_,
																													0);
																								}
																							} catch (UnsupportedEncodingException unsupportedencodingexception) {
																								/* empty */
																							}
																						}
																						JunkTex.aClass124Array5101[i_4_++] = class124;
																					} else if (i_6_ == 5420)
																						Class79.anIntArray1305[i_3_++] = Class14_Sub2_Sub3.anInt3771 == 2
																								? 1 : 0;
																					else if (i_6_ == 5421) {
																						if (ErrorReporting.aFrame3962 != null)
																							Class14_Sub2_Sub20
																									.method428(120);
																						Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																						boolean bool_170_ = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method1211(
																								JunkTex
																										.method515(
																												new Class124[] {
																														Class86.method1419(
																																(byte) 126),
																														class124 },
																												(byte) -59),
																								bool_170_, i_1_ ^ 0x67);
																					} else {
																						if (i_6_ != 5422)
																							break;
																						i_4_ -= 2;
																						Class124 class124 = JunkTex.aClass124Array5101[i_4_];
																						Class124 class124_171_ = JunkTex.aClass124Array5101[i_4_
																								+ 1];
																						int i_172_ = Class79.anIntArray1305[--i_3_];
																						if (class124
																								.length(0) > 0) {
																							if (Class7_Sub2.aClass124Array2674 == null)
																								Class7_Sub2.aClass124Array2674 = new Class124[Class115.anIntArray1916[Static2.anInt3749]];
																							Class7_Sub2.aClass124Array2674[i_172_] = class124;
																						}
																						if (class124_171_.length(
																								i_1_ ^ 0x4f) > 0) {
																							if (JunkTex.aClass124Array859 == null)
																								JunkTex.aClass124Array859 = new Class124[Class115.anIntArray1916[Static2.anInt3749]];
																							JunkTex.aClass124Array859[i_172_] = class124_171_;
																						}
																					}
																				} else if (i_6_ >= 5600) {
																					if (i_6_ < 5700) {
																						if (i_6_ == 5600) {
																							i_4_ -= 2;
																							Class124 class124 = JunkTex.aClass124Array5101[i_4_
																									+ 1];
																							Class124 class124_173_ = JunkTex.aClass124Array5101[i_4_];
																							int i_174_ = Class79.anIntArray1305[--i_3_];
																							if (JunkTex.gameState == 10
																									&& Class142.anInt2315 == 0
																									&& Class56.anInt918 == 0)
																								Static2
																										.method380(
																												i_174_,
																												class124,
																												class124_173_,
																												true);
																						} else if (i_6_ == 5601)
																							Class59.method1263(
																									(byte) -66);
																						else if (i_6_ == 5602) {
																							if (Class142.anInt2315 == 0)
																								JunkTex.anInt4525 = -2;
																						} else if (i_6_ == 5603) {
																							i_3_ -= 4;
																							if (JunkTex.gameState == 10
																									&& Class142.anInt2315 == 0
																									&& Class56.anInt918 == 0)
																								JunkTex
																										.method490(
																												Class79.anIntArray1305[i_3_
																														+ 1],
																												Class79.anIntArray1305[i_3_
																														+ 2],
																												Class79.anIntArray1305[i_3_
																														+ 3],
																												Class79.anIntArray1305[i_3_],
																												(byte) -28);
																						} else if (i_6_ == 5604) {
																							i_4_--;
																							if (JunkTex.gameState == 10
																									&& Class142.anInt2315 == 0
																									&& Class56.anInt918 == 0)
																								Class14_Sub2_Sub11
																										.method316(
																												JunkTex.aClass124Array5101[i_4_]
																														.method1692(
																																i_1_ - 79),
																												i_1_ + 24888);
																						} else if (i_6_ == 5605) {
																							i_4_ -= 2;
																							i_3_ -= 4;
																							if (JunkTex.gameState == 10
																									&& Class142.anInt2315 == 0
																									&& Class56.anInt918 == 0)
																								Static2.method112(
																										JunkTex.aClass124Array5101[i_4_]
																												.method1692(
																														0),
																										(byte) 120,
																										Class79.anIntArray1305[i_3_
																												+ 3],
																										Class79.anIntArray1305[i_3_
																												+ 1],
																										Class79.anIntArray1305[i_3_],
																										JunkTex.aClass124Array5101[i_4_
																												+ 1],
																										Class79.anIntArray1305[i_3_
																												+ 2]);
																						} else if (i_6_ == 5606) {
																							if (Class56.anInt918 == 0)
																								Static2.anInt2734 = -2;
																						} else if (i_6_ == 5607)
																							Class79.anIntArray1305[i_3_++] = JunkTex.anInt4525;
																						else if (i_6_ == 5608)
																							Class79.anIntArray1305[i_3_++] = JunkTex.anInt4598;
																						else if (i_6_ == 5609)
																							Class79.anIntArray1305[i_3_++] = Static2.anInt2734;
																						else {
																							if (i_6_ != 5610)
																								break;
																							for (int i_175_ = 0; i_175_ < 5; i_175_++)
																								JunkTex.aClass124Array5101[i_4_++] = JunkTex.aClass124Array4549.length > i_175_
																										? JunkTex.aClass124Array4549[i_175_]
																										: Class140.aClass124_2234;
																							JunkTex.aClass124Array4549 = null;
																						}
																					} else if (i_6_ >= 6100) {
																						if (i_6_ >= 6200) {
																							if (i_6_ < 6300) {
																								if (i_6_ == 6200) {
																									i_3_ -= 2;
																									JunkTex.aShort2540 = (short) Class79.anIntArray1305[i_3_];
																									if (JunkTex.aShort2540 <= 0)
																										JunkTex.aShort2540 = (short) 256;
																									JunkTex.aShort4568 = (short) Class79.anIntArray1305[i_3_
																											+ 1];
																									if (JunkTex.aShort4568 <= 0)
																										JunkTex.aShort4568 = (short) 205;
																								} else if (i_6_ == 6201) {
																									i_3_ -= 2;
																									JunkTex.aShort3372 = (short) Class79.anIntArray1305[i_3_];
																									if (JunkTex.aShort3372 <= 0)
																										JunkTex.aShort3372 = (short) 256;
																									Class28.aShort511 = (short) Class79.anIntArray1305[i_3_
																											+ 1];
																									if (Class28.aShort511 <= 0)
																										Class28.aShort511 = (short) 320;
																								} else if (i_6_ == 6202) {
																									i_3_ -= 4;
																									Class14_Sub2_Sub8.aShort3839 = (short) Class79.anIntArray1305[i_3_];
																									if (Class14_Sub2_Sub8.aShort3839 <= 0)
																										Class14_Sub2_Sub8.aShort3839 = (short) 1;
																									Applet_Sub1.aShort22 = (short) Class79.anIntArray1305[i_3_
																											+ 1];
																									if (Applet_Sub1.aShort22 <= 0)
																										Applet_Sub1.aShort22 = (short) 32767;
																									else if (Applet_Sub1.aShort22 < Class14_Sub2_Sub8.aShort3839)
																										Applet_Sub1.aShort22 = Class14_Sub2_Sub8.aShort3839;
																									JunkTex.aShort2076 = (short) Class79.anIntArray1305[i_3_
																											+ 2];
																									if (JunkTex.aShort2076 <= 0)
																										JunkTex.aShort2076 = (short) 1;
																									Class96.aShort1633 = (short) Class79.anIntArray1305[i_3_
																											+ 3];
																									if (Class96.aShort1633 > 0) {
																										if (JunkTex.aShort2076 > Class96.aShort1633)
																											Class96.aShort1633 = JunkTex.aShort2076;
																									} else
																										Class96.aShort1633 = (short) 32767;
																								} else if (i_6_ == 6203) {
																									Class35.method1092(
																											Class127.aClass94_2114.anInt1545,
																											false,
																											Class127.aClass94_2114.anInt1518,
																											0,
																											i_1_ ^ 0x64,
																											0);
																									Class79.anIntArray1305[i_3_++] = JunkTex.anInt3952;
																									Class79.anIntArray1305[i_3_++] = JunkTex.anInt4135;
																								} else if (i_6_ == 6204) {
																									Class79.anIntArray1305[i_3_++] = JunkTex.aShort3372;
																									Class79.anIntArray1305[i_3_++] = Class28.aShort511;
																								} else {
																									if (i_6_ != 6205)
																										break;
																									Class79.anIntArray1305[i_3_++] = JunkTex.aShort2540;
																									Class79.anIntArray1305[i_3_++] = JunkTex.aShort4568;
																								}
																							} else if (i_6_ >= 6400) {
																								if (i_6_ >= 6500)
																									break;
																								if (i_6_ == 6400)
																									Class79.anIntArray1305[i_3_++] = !Static2.aBoolean2870
																											? 0 : 1;
																								else if (i_6_ == 6401) {
																									Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																									int i_176_ = Class79.anIntArray1305[--i_3_];
																									String string;
																									try {
																										string = new String(
																												class124.method1681(
																														i_1_ - 204),
																												"ISO-8859-1");
																									} catch (UnsupportedEncodingException unsupportedencodingexception) {
																										string = new String(
																												class124.method1681(
																														i_1_ - 193));
																									}
																									if (Static2.aBoolean2870) {
																										if (BrowserControlUtil.cs6401(string)) {
																											Class14_Sub13.anInt2964 = i_176_;
																											JunkTex.method643(0,(byte) -116);
																										}
																									}
																								} else if (i_6_ == 6402) {
																									if (BrowserControlUtil.cs6402()) {
																										Class14_Sub13.anInt2964 = 0;
																										JunkTex.method643(0,(byte) -123);
																									}
																								} else if (i_6_ == 6403)
																									JunkTex.aClass124Array5101[i_4_++] = Static2.aClass124_138;
																								else if (i_6_ == 6404)
																									JunkTex.aClass124Array5101[i_4_++] = Class42.aClass124_700;
																								else if (i_6_ == 6405)
																									Class79.anIntArray1305[i_3_++] = Static2
																											.method1499(0) ? 1 : 0;
																								else {
																									if (i_6_ != 6406)
																										break;
																									Class79.anIntArray1305[i_3_++] = !JunkTex
																											.method625(
																													-128) ? 0
																															: 1;
																								}
																							} else if (i_6_ == 6300)
																								Class79.anIntArray1305[i_3_++] = (int) (TimeUtil
																										.getTime()
																										/ 60000L);
																							else if (i_6_ == 6301)
																								Class79.anIntArray1305[i_3_++] = (int) (TimeUtil
																										.getTime()
																										/ 86400000L)
																										- 11745;
																							else if (i_6_ == 6302) {
																								i_3_ -= 3;
																								int i_177_ = Class79.anIntArray1305[i_3_
																										+ 1];
																								int i_178_ = Class79.anIntArray1305[i_3_
																										+ 2];
																								int i_179_ = Class79.anIntArray1305[i_3_];
																								Class153.aCalendar2449
																										.clear();
																								Class153.aCalendar2449
																										.set(11, 12);
																								Class153.aCalendar2449
																										.set(i_178_,
																												i_177_,
																												i_179_);
																								Class79.anIntArray1305[i_3_++] = (int) (Class153.aCalendar2449
																										.getTime()
																										.getTime()
																										/ 86400000L)
																										- 11745;
																							} else if (i_6_ == 6303) {
																								Class153.aCalendar2449
																										.clear();
																								Class153.aCalendar2449
																										.setTime(
																												new Date(
																														TimeUtil.getTime()));
																								Class79.anIntArray1305[i_3_++] = Class153.aCalendar2449
																										.get(1);
																							} else {
																								if (i_6_ != 6304)
																									break;
																								boolean bool_180_ = true;
																								int i_181_ = Class79.anIntArray1305[--i_3_];
																								if (i_181_ < 0)
																									bool_180_ = (i_181_
																											+ 1)
																											% 4 == 0;
																								else if (i_181_ >= 1582) {
																									if (i_181_ % 4 != 0)
																										bool_180_ = false;
																									else if (i_181_
																											% 100 != 0)
																										bool_180_ = true;
																									else if (i_181_
																											% 400 != 0)
																										bool_180_ = false;
																								} else
																									bool_180_ = i_181_
																											% 4 == 0;
																								Class79.anIntArray1305[i_3_++] = bool_180_
																										? 1 : 0;
																							}
																						} else if (i_6_ == 6101)
																							Class79.anIntArray1305[i_3_++] = JunkTex.anInt4190;
																						else if (i_6_ == 6102)
																							Class79.anIntArray1305[i_3_++] = Class128
																									.method1755(
																											Canvas_Sub2
																													.method69(
																															i_1_,
																															130068680))
																																	? 1
																																	: 0;
																						else if (i_6_ == 6103)
																							Class79.anIntArray1305[i_3_++] = Class139.aBoolean2233
																									? 1 : 0;
																						else if (i_6_ == 6105)
																							Class79.anIntArray1305[i_3_++] = Static2.aBoolean2372
																									? 1 : 0;
																						else if (i_6_ == 6106)
																							Class79.anIntArray1305[i_3_++] = JunkTex.aBoolean3397
																									? 1 : 0;
																						else if (i_6_ == 6107)
																							Class79.anIntArray1305[i_3_++] = !Class135.aBoolean2190
																									? 0 : 1;
																						else if (i_6_ == 6108)
																							Class79.anIntArray1305[i_3_++] = Class33.aBoolean584
																									? 1 : 0;
																						else if (i_6_ == 6109)
																							Class79.anIntArray1305[i_3_++] = Class28.aBoolean516
																									? 1 : 0;
																						else if (i_6_ == 6110)
																							Class79.anIntArray1305[i_3_++] = !JunkTex.aBoolean4518
																									? 0 : 1;
																						else if (i_6_ == 6111)
																							Class79.anIntArray1305[i_3_++] = Class89.anInt1413;
																						else if (i_6_ == 6112)
																							Class79.anIntArray1305[i_3_++] = !RT4.useLighting
																									? 0 : 1;
																						else if (i_6_ == 6114)
																							Class79.anIntArray1305[i_3_++] = !RT4.aBoolean374
																									? 0 : 1;
																						else if (i_6_ == 6115)
																							Class79.anIntArray1305[i_3_++] = JunkTex.aBoolean4420
																									? 1 : 0;
																						else if (i_6_ == 6116)
																							Class79.anIntArray1305[i_3_++] = Class135.anInt2189;
																						else if (i_6_ == 6117)
																							Class79.anIntArray1305[i_3_++] = !JunkTex.aBoolean4528
																									? 0 : 1;
																						else if (i_6_ == 6118)
																							Class79.anIntArray1305[i_3_++] = Class14_Sub29.anInt3266;
																						else if (i_6_ == 6119)
																							Class79.anIntArray1305[i_3_++] = Class14_Sub23.anInt3135;
																						else if (i_6_ == 6120)
																							Class79.anIntArray1305[i_3_++] = Static2.anInt1691;
																						else if (i_6_ == 6121)
																							Class79.anIntArray1305[i_3_++] = RT4GL.has_multisample
																									? 1 : 0;
																						else {
																							if (i_6_ != 6122)
																								break;
																							Class79.anIntArray1305[i_3_++] = !JunkTex.aBoolean845
																									? 0 : 1;
																						}
																					} else if (i_6_ == 6001) {
																						int i_182_ = Class79.anIntArray1305[--i_3_];
																						if (i_182_ < 1)
																							i_182_ = 1;
																						if (i_182_ > 4)
																							i_182_ = 4;
																						JunkTex.anInt4190 = i_182_;
																						if (!RT4.useLighting) {
																							if (JunkTex.anInt4190 == 1)
																								SDRaster.method103(0.9F);
																							if (JunkTex.anInt4190 == 2)
																								SDRaster.method103(0.8F);
																							if (JunkTex.anInt4190 == 3)
																								SDRaster.method103(0.7F);
																							if (JunkTex.anInt4190 == 4)
																								SDRaster.method103(0.6F);
																						}
																						Class14_Sub13.method858(-1);
																						if (!RT4.useLighting)
																							Static2.method1996(
																									(byte) 74);
																						Class14_Sub23
																								.method903((byte) 54);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6002) {
																						JunkTex.method495(
																								(byte) -47,
																								Class79.anIntArray1305[--i_3_] == 1);
																						Class60.method1264(111);
																						Static2.method1996((byte) 91);
																						JunkTex
																								.method602(-1);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6003) {
																						Class139.aBoolean2233 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex
																								.method602(-1);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6005) {
																						Static2.aBoolean2372 = Class79.anIntArray1305[--i_3_] == 1;
																						Static2.method1996((byte) 83);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6006) {
																						JunkTex.aBoolean3397 = Class79.anIntArray1305[--i_3_] == 1;
																						((Class134) SDRaster.anInterface3_117)
																								.method1924(											!JunkTex.aBoolean3397);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6007) {
																						Class135.aBoolean2190 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6008) {
																						Class33.aBoolean584 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6009) {
																						Class28.aBoolean516 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6010) {
																						JunkTex.aBoolean4518 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6011) {
																						int i_183_ = Class79.anIntArray1305[--i_3_];
																						if (i_183_ < 0 || i_183_ > 2)
																							i_183_ = 0;
																						Class89.anInt1413 = i_183_;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6012) {
																						RT4.method1778(0,
																								0);
																						RT4.useLighting = Class79.anIntArray1305[--i_3_] == 1;
																						if (!RT4.useLighting) {
																							if (JunkTex.anInt4190 == 1)
																								SDRaster.method103(0.9F);
																							if (JunkTex.anInt4190 == 2)
																								SDRaster.method103(0.8F);
																							if (JunkTex.anInt4190 == 3)
																								SDRaster.method103(0.7F);
																							if (JunkTex.anInt4190 == 4)
																								SDRaster.method103(0.6F);
																						} else
																							SDRaster.method103(0.7F);
																						Static2.method1996((byte) 64);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6014) {
																						RT4.aBoolean374 = Class79.anIntArray1305[--i_3_] == 1;
																						Static2.method1996((byte) 111);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6015) {
																						JunkTex.aBoolean4420 = Class79.anIntArray1305[--i_3_] == 1;
																						Class14_Sub13.method858(-1);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6016) {
																						int i_184_ = Class79.anIntArray1305[--i_3_];
																						if (i_184_ < 0 || i_184_ > 2)
																							i_184_ = 0;
																						ErrorReporting.aBoolean877 = true;
																						Class135.anInt2189 = i_184_;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6017) {
																						JunkTex.aBoolean4528 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex
																								.method375(126);
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6018) {
																						int i_185_ = Class79.anIntArray1305[--i_3_];
																						if (i_185_ < 0)
																							i_185_ = 0;
																						if (i_185_ > 127)
																							i_185_ = 127;
																						Class14_Sub29.anInt3266 = i_185_;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6019) {
																						int i_186_ = Class79.anIntArray1305[--i_3_];
																						if (i_186_ < 0)
																							i_186_ = 0;
																						if (i_186_ > 255)
																							i_186_ = 255;
																						if (Class14_Sub23.anInt3135 != i_186_) {
																							if (Class14_Sub23.anInt3135 != 0
																									|| JunkTex.anInt2856 == -1) {
																								if (i_186_ == 0) {
																									JunkTex
																											.method569(
																													i_1_ - 183);
																									Class14_Sub7.aBoolean2827 = false;
																								} else
																									Class47.method1188(
																											i_186_, 0);
																							} else {
																								Class33.method1087(1936,
																										0, false,
																										JunkTex.anInt2856,
																										JunkTex.aClass9_Sub1_3374,
																										i_186_);
																								Class14_Sub7.aBoolean2827 = false;
																							}
																							Class14_Sub23.anInt3135 = i_186_;
																						}
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6020) {
																						int i_187_ = Class79.anIntArray1305[--i_3_];
																						if (i_187_ < 0)
																							i_187_ = 0;
																						if (i_187_ > 127)
																							i_187_ = 127;
																						Static2.anInt1691 = i_187_;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						Static2.aBoolean214 = false;
																					} else if (i_6_ == 6021) {
																						Class1.aBoolean74 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex
																								.method602(-1);
																					} else {
																						if (i_6_ != 6022)
																							break;
																						JunkTex.aBoolean845 = Class79.anIntArray1305[--i_3_] == 1;
																						JunkTex.method595(
																								ErrorReporting.signlink);
																						JunkTex.method643(0,
																								(byte) -126);
																					}
																				} else if (i_6_ == 5500) {
																					i_3_ -= 4;
																					int i_188_ = Class79.anIntArray1305[i_3_];
																					int i_189_ = Class79.anIntArray1305[i_3_
																							+ 1];
																					int i_190_ = Class79.anIntArray1305[i_3_
																							+ 2];
																					int i_191_ = Class79.anIntArray1305[i_3_
																							+ 3];
																					Class7_Sub3_Sub1.method136(false,
																							i_189_, i_191_,
																							-Class58.anInt947
																									+ (i_188_ & 0x3fff),
																							-86,
																							(i_188_ >> 14 & 0x3fff)
																									- SceneGraphNode_Projectile.anInt3676,
																							i_190_);
																				} else if (i_6_ == 5501) {
																					i_3_ -= 4;
																					int i_192_ = Class79.anIntArray1305[i_3_
																							+ 3];
																					int i_193_ = Class79.anIntArray1305[i_3_];
																					int i_194_ = Class79.anIntArray1305[i_3_
																							+ 1];
																					int i_195_ = Class79.anIntArray1305[i_3_
																							+ 2];
																					JunkTex.method1725(i_194_,
																							(i_193_ >> 14 & 0x3fff)
																									- SceneGraphNode_Projectile.anInt3676,
																							i_195_, i_192_,
																							(i_193_ & 0x3fff)
																									- Class58.anInt947,
																							(byte) 89);
																				} else if (i_6_ == 5502) {
																					i_3_ -= 6;
																					int i_196_ = Class79.anIntArray1305[i_3_];
																					if (i_196_ >= 2)
																						throw new RuntimeException();
																					Class45.anInt751 = i_196_;
																					int i_197_ = Class79.anIntArray1305[i_3_
																							+ 1];
																					if (i_197_
																							+ 1 >= Class89.anIntArrayArrayArray1405[Class45.anInt751].length >> 33)
																						throw new RuntimeException();
																					JunkTex.anInt2552 = i_197_;
																					Class102.anInt1717 = 0;
																					Class14_Sub21.anInt3102 = Class79.anIntArray1305[i_3_
																							+ 2];
																					Class36.anInt612 = Class79.anIntArray1305[i_3_
																							+ 3];
																					int i_198_ = Class79.anIntArray1305[i_3_
																							+ 4];
																					if (i_198_ >= 2)
																						throw new RuntimeException();
																					JunkTex.anInt4687 = i_198_;
																					int i_199_ = Class79.anIntArray1305[i_3_
																							+ 5];
																					if (Class89.anIntArrayArrayArray1405[JunkTex.anInt4687].length >> 33 <= i_199_
																							+ 1)
																						throw new RuntimeException();
																					Class79.anInt1240 = i_199_;
																					Class89.anInt1415 = 3;
																				} else if (i_6_ == 5503)
																					Class48.method1191((byte) 126);
																				else if (i_6_ == 5504) {
																					i_3_ -= 2;
																					JunkTex.anInt102 = Class79.anIntArray1305[i_3_];
																					JunkTex.anInt4408 = Class79.anIntArray1305[i_3_
																							+ 1];
																					Class33.method1084((byte) 113);
																				} else if (i_6_ == 5505)
																					Class79.anIntArray1305[i_3_++] = JunkTex.anInt102;
																				else {
																					if (i_6_ != 5506)
																						break;
																					Class79.anIntArray1305[i_3_++] = JunkTex.anInt4408;
																				}
																			} else {
																				if (i_6_ != 4300)
																					break;
																				i_3_ -= 2;
																				int i_200_ = Class79.anIntArray1305[i_3_
																						+ 1];
																				int i_201_ = Class79.anIntArray1305[i_3_];
																				Class14_Sub2_Sub2 class14_sub2_sub2 = Class17
																						.method958((byte) 6, i_200_);
																				if (class14_sub2_sub2
																						.method261((byte) 42))
																					JunkTex.aClass124Array5101[i_4_++] = Static2
																							.method1744(i_201_, 170)
																							.method215(-103,
																									class14_sub2_sub2.aClass124_3760,
																									i_200_);
																				else
																					Class79.anIntArray1305[i_3_++] = Static2
																							.method1744(i_201_,
																									i_1_ + 91)
																							.method214(i_1_ + 40,
																									class14_sub2_sub2.anInt3766,
																									i_200_);
																			}
																		} else if (i_6_ == 4200) {
																			int i_202_ = Class79.anIntArray1305[--i_3_];
																			JunkTex.aClass124Array5101[i_4_++] = JunkTex
																					.method605(69,
																							i_202_).aClass124_2296;
																		} else if (i_6_ == 4201) {
																			i_3_ -= 2;
																			int i_203_ = Class79.anIntArray1305[i_3_];
																			int i_204_ = Class79.anIntArray1305[i_3_
																					+ 1];
																			Class142 class142 = JunkTex
																					.method605(70, i_203_);
																			if (i_204_ >= 1 && i_204_ <= 5
																					&& class142.aClass124Array2263[i_204_
																							- 1] != null)
																				JunkTex.aClass124Array5101[i_4_++] = class142.aClass124Array2263[i_204_
																						- 1];
																			else
																				JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																		} else if (i_6_ == 4202) {
																			i_3_ -= 2;
																			int i_205_ = Class79.anIntArray1305[i_3_];
																			int i_206_ = Class79.anIntArray1305[i_3_
																					+ 1];
																			Class142 class142 = JunkTex
																					.method605(i_1_ - 19, i_205_);
																			if (i_206_ >= 1 && i_206_ <= 5
																					&& class142.aClass124Array2304[i_206_
																							- 1] != null)
																				JunkTex.aClass124Array5101[i_4_++] = class142.aClass124Array2304[i_206_
																						- 1];
																			else
																				JunkTex.aClass124Array5101[i_4_++] = Class140.aClass124_2234;
																		} else if (i_6_ == 4203) {
																			int i_207_ = Class79.anIntArray1305[--i_3_];
																			Class79.anIntArray1305[i_3_++] = JunkTex
																					.method605(
																							Canvas_Sub2.method69(i_1_,
																									21),
																							i_207_).anInt2288;
																		} else if (i_6_ == 4204) {
																			int i_208_ = Class79.anIntArray1305[--i_3_];
																			Class79.anIntArray1305[i_3_++] = JunkTex
																					.method605(96,
																							i_208_).anInt2309 != 1 ? 0
																									: 1;
																		} else if (i_6_ == 4205) {
																			int i_209_ = Class79.anIntArray1305[--i_3_];
																			Class142 class142 = JunkTex
																					.method605(73, i_209_);
																			if (class142.anInt2316 == -1
																					&& class142.anInt2268 >= 0)
																				Class79.anIntArray1305[i_3_++] = class142.anInt2268;
																			else
																				Class79.anIntArray1305[i_3_++] = i_209_;
																		} else if (i_6_ == 4206) {
																			int i_210_ = Class79.anIntArray1305[--i_3_];
																			Class142 class142 = JunkTex
																					.method605(77, i_210_);
																			if (class142.anInt2316 < 0
																					|| class142.anInt2268 < 0)
																				Class79.anIntArray1305[i_3_++] = i_210_;
																			else
																				Class79.anIntArray1305[i_3_++] = class142.anInt2268;
																		} else if (i_6_ == 4207) {
																			int i_211_ = Class79.anIntArray1305[--i_3_];
																			Class79.anIntArray1305[i_3_++] = !JunkTex
																					.method605(90, i_211_).aBoolean2306
																							? 0 : 1;
																		} else if (i_6_ == 4208) {
																			i_3_ -= 2;
																			int i_212_ = Class79.anIntArray1305[i_3_
																					+ 1];
																			int i_213_ = Class79.anIntArray1305[i_3_];
																			Class14_Sub2_Sub2 class14_sub2_sub2 = Class17
																					.method958((byte) -123, i_212_);
																			if (!class14_sub2_sub2.method261((byte) 55))
																				Class79.anIntArray1305[i_3_++] = JunkTex
																						.method605(114, i_213_)
																						.method1977(
																								class14_sub2_sub2.anInt3766,
																								i_212_, i_1_ + 46);
																			else
																				JunkTex.aClass124Array5101[i_4_++] = JunkTex
																						.method605(85, i_213_)
																						.method1979(i_212_,
																								class14_sub2_sub2.aClass124_3760,
																								(byte) 62);
																		} else if (i_6_ == 4210) {
																			Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																			int i_214_ = Class79.anIntArray1305[--i_3_];
																			JunkTex.method563(i_214_ == 1,
																					class124, (byte) -116);
																			Class79.anIntArray1305[i_3_++] = JunkTex.anInt4394;
																		} else if (i_6_ == 4211) {
																			if (SceneGraphNode_Projectile.aShortArray3675 == null
																					|| JunkTex.anInt4394 <= Class12.anInt294)
																				Class79.anIntArray1305[i_3_++] = -1;
																			else
																				Class79.anIntArray1305[i_3_++] = JunkTex
																						.method617(
																								SceneGraphNode_Projectile.aShortArray3675[Class12.anInt294++],
																								65535);
																		} else {
																			if (i_6_ != 4212)
																				break;
																			Class12.anInt294 = 0;
																		}
																	} else if (i_6_ == 4100) {
																		int i_215_ = Class79.anIntArray1305[--i_3_];
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		JunkTex.aClass124Array5101[i_4_++] = JunkTex
																				.method515(new Class124[] { class124,
																						Class83.method1407(
																								Canvas_Sub2.method69(
																										i_1_, 32),
																								i_215_) },
																						(byte) -115);
																	} else if (i_6_ == 4101) {
																		i_4_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[i_4_];
																		Class124 class124_216_ = JunkTex.aClass124Array5101[i_4_
																				+ 1];
																		JunkTex.aClass124Array5101[i_4_++] = JunkTex
																				.method515(
																						new Class124[] { class124,
																								class124_216_ },
																						(byte) -23);
																	} else if (i_6_ == 4102) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		int i_217_ = Class79.anIntArray1305[--i_3_];
																		JunkTex.aClass124Array5101[i_4_++] = JunkTex
																				.method515(
																						new Class124[] { class124,
																								Class122.method1658(
																										(byte) -54,
																										true, i_217_) },
																						(byte) -99);
																	} else if (i_6_ == 4103) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		JunkTex.aClass124Array5101[i_4_++] = class124
																				.method1716((byte) 63);
																	} else if (i_6_ == 4104) {
																		int i_218_ = Class79.anIntArray1305[--i_3_];
																		long l = (i_218_ + 11745L) * 86400000L;
																		Class153.aCalendar2449.setTime(new Date(l));
																		int i_219_ = Class153.aCalendar2449.get(5);
																		int i_220_ = Class153.aCalendar2449.get(2);
																		int i_221_ = Class153.aCalendar2449.get(1);
																		JunkTex.aClass124Array5101[i_4_++] = JunkTex
																				.method515(
																						new Class124[] {
																								Class83.method1407(32,
																										i_219_),
																								Class110.aClass124_1850,
																								Class14_Sub17.aClass124Array3025[i_220_],
																								Class110.aClass124_1850,
																								Class83.method1407(33,
																										i_221_) },
																						(byte) -116);
																	} else if (i_6_ == 4105) {
																		i_4_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[i_4_];
																		Class124 class124_222_ = JunkTex.aClass124Array5101[i_4_
																				+ 1];
																		if ((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941) == null
																				|| !Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941.aBoolean1711)
																			JunkTex.aClass124Array5101[i_4_++] = class124;
																		else
																			JunkTex.aClass124Array5101[i_4_++] = class124_222_;
																	} else if (i_6_ == 4106) {
																		int i_223_ = Class79.anIntArray1305[--i_3_];
																		JunkTex.aClass124Array5101[i_4_++] = Class83
																				.method1407(105, i_223_);
																	} else if (i_6_ == 4107) {
																		i_4_ -= 2;
																		Class79.anIntArray1305[i_3_++] = JunkTex.aClass124Array5101[i_4_]
																				.method1674(
																						JunkTex.aClass124Array5101[i_4_
																								+ 1],
																						(byte) 92);
																	} else if (i_6_ == 4108) {
																		i_3_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		int i_224_ = Class79.anIntArray1305[i_3_];
																		int i_225_ = Class79.anIntArray1305[i_3_ + 1];
																		byte[] is_226_ = Class64.aClass9_Sub1_1015
																				.method163(0, i_225_);
																		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(
																				is_226_);
																		class14_sub2_sub16_sub1.method352(
																				Static2.aClass148Array1777, null);
																		Class79.anIntArray1305[i_3_++] = class14_sub2_sub16_sub1
																				.method358(class124, i_224_);
																	} else if (i_6_ == 4109) {
																		i_3_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		int i_227_ = Class79.anIntArray1305[i_3_];
																		int i_228_ = Class79.anIntArray1305[i_3_ + 1];
																		byte[] is_229_ = Class64.aClass9_Sub1_1015
																				.method163(0, i_228_);
																		Class14_Sub2_Sub16_Sub1 class14_sub2_sub16_sub1 = new Class14_Sub2_Sub16_Sub1(
																				is_229_);
																		class14_sub2_sub16_sub1.method352(
																				Static2.aClass148Array1777, null);
																		Class79.anIntArray1305[i_3_++] = class14_sub2_sub16_sub1
																				.method344(class124, i_227_);
																	} else if (i_6_ == 4110) {
																		i_4_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[i_4_
																				+ 1];
																		Class124 class124_230_ = JunkTex.aClass124Array5101[i_4_];
																		if ((Class79.anIntArray1305[--i_3_]) == 1)
																			JunkTex.aClass124Array5101[i_4_++] = class124_230_;
																		else
																			JunkTex.aClass124Array5101[i_4_++] = class124;
																	} else if (i_6_ == 4111) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		JunkTex.aClass124Array5101[i_4_++] = Class14_Sub2_Sub16
																				.method368(class124);
																	} else if (i_6_ == 4112) {
																		int i_231_ = Class79.anIntArray1305[--i_3_];
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		if (i_231_ == -1)
																			throw new RuntimeException("null char");
																		JunkTex.aClass124Array5101[i_4_++] = class124
																				.method1694(24861, i_231_);
																	} else if (i_6_ == 4113) {
																		int i_232_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = Static2
																				.method841(i_232_, 127) ? 1 : 0;
																	} else if (i_6_ == 4114) {
																		int i_233_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = JunkTex
																				.method598(i_233_,
																						Canvas_Sub2.method69(i_1_, 46))
																								? 1 : 0;
																	} else if (i_6_ == 4115) {
																		int i_234_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = Static2
																				.method184((byte) 108, i_234_) ? 1 : 0;
																	} else if (i_6_ == 4116) {
																		int i_235_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = !Class15
																				.method944(false, i_235_) ? 0 : 1;
																	} else if (i_6_ == 4117) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		if (class124 == null)
																			Class79.anIntArray1305[i_3_++] = 0;
																		else
																			Class79.anIntArray1305[i_3_++] = class124
																					.length(0);
																	} else if (i_6_ == 4118) {
																		i_3_ -= 2;
																		int i_236_ = Class79.anIntArray1305[i_3_ + 1];
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		int i_237_ = Class79.anIntArray1305[i_3_];
																		JunkTex.aClass124Array5101[i_4_++] = class124
																				.substring(i_237_, i_236_,
																						(byte) -104);
																	} else if (i_6_ == 4119) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		Class124 class124_238_ = Class7_Sub1.method121(
																				class124.length(0), -127);
																		boolean bool_239_ = false;
																		for (int i_240_ = 0; i_240_ < class124
																				.length(0); i_240_++) {
																			int i_241_ = class124.method1710(0, i_240_);
																			if (i_241_ == 60)
																				bool_239_ = true;
																			else if (i_241_ != 62) {
																				if (!bool_239_)
																					class124_238_.method1686((byte) -5,
																							i_241_);
																			} else
																				bool_239_ = false;
																		}
																		class124_238_.method1683(i_1_ + 36);
																		JunkTex.aClass124Array5101[i_4_++] = class124_238_;
																	} else if (i_6_ == 4120) {
																		Class124 class124 = JunkTex.aClass124Array5101[--i_4_];
																		i_3_ -= 2;
																		int i_242_ = Class79.anIntArray1305[i_3_];
																		int i_243_ = Class79.anIntArray1305[i_3_ + 1];
																		Class79.anIntArray1305[i_3_++] = class124
																				.method1678(i_243_, 27575, i_242_);
																	} else if (i_6_ == 4121) {
																		i_4_ -= 2;
																		Class124 class124 = JunkTex.aClass124Array5101[i_4_];
																		Class124 class124_244_ = JunkTex.aClass124Array5101[i_4_
																				+ 1];
																		int i_245_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = class124
																				.method1707(class124_244_, (byte) 59,
																						i_245_);
																	} else if (i_6_ == 4122) {
																		int i_246_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = Class102
																				.method1523(i_246_, 6427);
																	} else {
																		if (i_6_ != 4123)
																			break;
																		int i_247_ = Class79.anIntArray1305[--i_3_];
																		Class79.anIntArray1305[i_3_++] = JunkTex
																				.method2052((byte) 120, i_247_);
																	}
																} else if (i_6_ == 4000) {
																	i_3_ -= 2;
																	int i_248_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_249_ = (Class79.anIntArray1305[i_3_]);
																	Class79.anIntArray1305[i_3_++] = (i_248_ + i_249_);
																} else if (i_6_ == 4001) {
																	i_3_ -= 2;
																	int i_250_ = (Class79.anIntArray1305[i_3_]);
																	int i_251_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (-i_251_ + i_250_);
																} else if (i_6_ == 4002) {
																	i_3_ -= 2;
																	int i_252_ = (Class79.anIntArray1305[i_3_]);
																	int i_253_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (i_253_ * i_252_);
																} else if (i_6_ == 4003) {
																	i_3_ -= 2;
																	int i_254_ = (Class79.anIntArray1305[i_3_]);
																	int i_255_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (i_254_ / i_255_);
																} else if (i_6_ == 4004) {
																	int i_256_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (int) (i_256_
																			* Math.random());
																} else if (i_6_ == 4005) {
																	int i_257_ = (Class79.anIntArray1305[--i_3_]);
																	Class79.anIntArray1305[i_3_++] = (int) (Math
																			.random() * (i_257_ + 1));
																} else if (i_6_ == 4006) {
																	i_3_ -= 5;
																	int i_258_ = (Class79.anIntArray1305[i_3_]);
																	int i_259_ = (Class79.anIntArray1305[(i_3_ + 2)]);
																	int i_260_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_261_ = (Class79.anIntArray1305[(i_3_ + 4)]);
																	int i_262_ = (Class79.anIntArray1305[(i_3_ + 3)]);
																	Class79.anIntArray1305[i_3_++] = ((i_261_ - i_259_)
																			* (-i_258_ + i_260_) / (-i_259_ + i_262_))
																			+ i_258_;
																} else if (i_6_ == 4007) {
																	i_3_ -= 2;
																	long l = Class79.anIntArray1305[i_3_];
																	long l_263_ = Class79.anIntArray1305[i_3_
																			+ 1];
																	Class79.anIntArray1305[i_3_++] = (int) (l
																			- -(l * l_263_ / 100L));
																} else if (i_6_ == 4008) {
																	i_3_ -= 2;
																	int i_264_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_265_ = (Class79.anIntArray1305[i_3_]);
																	Class79.anIntArray1305[i_3_++] = (Class66
																			.method1294(i_265_, 1 << i_264_));
																} else if (i_6_ == 4009) {
																	i_3_ -= 2;
																	int i_266_ = (Class79.anIntArray1305[i_3_]);
																	int i_267_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method617(-(1 << i_267_) - 1, i_266_));
																} else if (i_6_ == 4010) {
																	i_3_ -= 2;
																	int i_268_ = (Class79.anIntArray1305[i_3_]);
																	int i_269_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = ((JunkTex
																			.method617(1 << i_269_, i_268_)) != 0 ? 1
																					: 0);
																} else if (i_6_ == 4011) {
																	i_3_ -= 2;
																	int i_270_ = (Class79.anIntArray1305[i_3_]);
																	int i_271_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (i_270_ % i_271_);
																} else if (i_6_ == 4012) {
																	i_3_ -= 2;
																	int i_272_ = (Class79.anIntArray1305[i_3_]);
																	int i_273_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	if (i_272_ == 0)
																		Class79.anIntArray1305[i_3_++] = 0;
																	else
																		Class79.anIntArray1305[i_3_++] = (int) Math
																				.pow(i_272_, i_273_);
																} else if (i_6_ == 4013) {
																	i_3_ -= 2;
																	int i_274_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_275_ = (Class79.anIntArray1305[i_3_]);
																	if (i_275_ != 0) {
																		if (i_274_ == 0)
																			Class79.anIntArray1305[i_3_++] = 2147483647;
																		else
																			Class79.anIntArray1305[i_3_++] = (int) Math
																					.pow(i_275_,
																							1.0 / i_274_);
																	} else
																		Class79.anIntArray1305[i_3_++] = 0;
																} else if (i_6_ == 4014) {
																	i_3_ -= 2;
																	int i_276_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	int i_277_ = (Class79.anIntArray1305[i_3_]);
																	Class79.anIntArray1305[i_3_++] = (JunkTex
																			.method617(i_276_, i_277_));
																} else if (i_6_ == 4015) {
																	i_3_ -= 2;
																	int i_278_ = (Class79.anIntArray1305[i_3_]);
																	int i_279_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = (Class66
																			.method1294(i_278_, i_279_));
																} else if (i_6_ == 4016) {
																	i_3_ -= 2;
																	int i_280_ = (Class79.anIntArray1305[i_3_]);
																	int i_281_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = ((i_280_ >= i_281_)
																			? i_281_ : i_280_);
																} else if (i_6_ == 4017) {
																	i_3_ -= 2;
																	int i_282_ = (Class79.anIntArray1305[i_3_]);
																	int i_283_ = (Class79.anIntArray1305[(i_3_ + 1)]);
																	Class79.anIntArray1305[i_3_++] = ((i_282_ > i_283_)
																			? i_282_ : i_283_);
																} else {
																	if (i_6_ != 4018)
																		break;
																	i_3_ -= 3;
																	long l = Class79.anIntArray1305[i_3_ + 1];
																	long l_284_ = Class79.anIntArray1305[i_3_
																			+ 2];
																	long l_285_ = Class79.anIntArray1305[i_3_];
																	Class79.anIntArray1305[i_3_++] = (int) (l_284_
																			* l_285_ / l);
																}
															} else if (i_6_ == 3903) {
																int i_286_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_286_]
																		.method1573(true));
															} else if (i_6_ == 3904) {
																int i_287_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_287_].anInt1830);
															} else if (i_6_ == 3905) {
																int i_288_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_288_].anInt1833);
															} else if (i_6_ == 3906) {
																int i_289_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_289_].anInt1841);
															} else if (i_6_ == 3907) {
																int i_290_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_290_].anInt1845);
															} else if (i_6_ == 3908) {
																int i_291_ = (Class79.anIntArray1305[--i_3_]);
																Class79.anIntArray1305[i_3_++] = (JunkTex.aClass109Array4195[i_291_].anInt1829);
															} else if (i_6_ == 3910) {
																int i_292_ = (Class79.anIntArray1305[--i_3_]);
																int i_293_ = (JunkTex.aClass109Array4195[i_292_]
																		.method1572((byte) 42));
																Class79.anIntArray1305[i_3_++] = ((i_293_ != 0) ? 0
																		: 1);
															} else if (i_6_ == 3911) {
																int i_294_ = (Class79.anIntArray1305[--i_3_]);
																int i_295_ = (JunkTex.aClass109Array4195[i_294_]
																		.method1572((byte) 42));
																Class79.anIntArray1305[i_3_++] = ((i_295_ != 2) ? 0
																		: 1);
															} else if (i_6_ == 3912) {
																int i_296_ = (Class79.anIntArray1305[--i_3_]);
																int i_297_ = (JunkTex.aClass109Array4195[i_296_]
																		.method1572((byte) 42));
																Class79.anIntArray1305[i_3_++] = ((i_297_ != 5) ? 0
																		: 1);
															} else {
																if (i_6_ != 3913)
																	break;
																int i_298_ = (Class79.anIntArray1305[--i_3_]);
																int i_299_ = (JunkTex.aClass109Array4195[i_298_]
																		.method1572((byte) 42));
																Class79.anIntArray1305[i_3_++] = ((i_299_ != 1) ? 0
																		: 1);
															}
														} else if (i_6_ == 2700) {
															Class94 class94 = (JunkTex.method1233(
																	(Class79.anIntArray1305[--i_3_]), 21803));
															Class79.anIntArray1305[i_3_++] = (class94.anInt1532);
														} else if (i_6_ == 2701) {
															Class94 class94 = (JunkTex.method1233(
																	(Class79.anIntArray1305[--i_3_]), 21803));
															if ((class94.anInt1532) == -1)
																Class79.anIntArray1305[i_3_++] = 0;
															else
																Class79.anIntArray1305[i_3_++] = (class94.anInt1495);
														} else if (i_6_ == 2702) {
															int i_300_ = (Class79.anIntArray1305[--i_3_]);
															Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
																	.get(i_300_)));
															if (class14_sub15 == null)
																Class79.anIntArray1305[i_3_++] = 0;
															else
																Class79.anIntArray1305[i_3_++] = 1;
														} else if (i_6_ == 2703) {
															Class94 class94 = (JunkTex.method1233(
																	(Class79.anIntArray1305[--i_3_]), 21803));
															if ((class94.aClass94Array1486) == null)
																Class79.anIntArray1305[i_3_++] = 0;
															else {
																int i_301_ = (class94.aClass94Array1486).length;
																for (int i_302_ = 0; (i_302_ < (class94.aClass94Array1486).length); i_302_++) {
																	if ((class94.aClass94Array1486[i_302_]) == null) {
																		i_301_ = i_302_;
																		break;
																	}
																}
																Class79.anIntArray1305[i_3_++] = i_301_;
															}
														} else {
															if (i_6_ != 2704 && (i_6_ != 2705))
																break;
															i_3_ -= 2;
															int i_303_ = (Class79.anIntArray1305[i_3_]);
															int i_304_ = (Class79.anIntArray1305[i_3_ + 1]);
															Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
																	.get(i_303_)));
															if ((class14_sub15 == null)
																	|| (i_304_ != (class14_sub15.anInt2999)))
																Class79.anIntArray1305[i_3_++] = 0;
															else
																Class79.anIntArray1305[i_3_++] = 1;
														}
													} else {
														Class94 class94 = (JunkTex
																.method1233((Class79.anIntArray1305[--i_3_]), 21803));
														if (i_6_ == 2500)
															Class79.anIntArray1305[i_3_++] = (class94.anInt1523);
														else if (i_6_ == 2501)
															Class79.anIntArray1305[i_3_++] = (class94.anInt1583);
														else if (i_6_ == 2502)
															Class79.anIntArray1305[i_3_++] = (class94.anInt1518);
														else if (i_6_ == 2503)
															Class79.anIntArray1305[i_3_++] = (class94.anInt1545);
														else if (i_6_ == 2504)
															Class79.anIntArray1305[i_3_++] = (!(class94.aBoolean1503)
																	? 0 : 1);
														else {
															if (i_6_ != 2505)
																break;
															Class79.anIntArray1305[i_3_++] = (class94.anInt1540);
														}
													}
												} else {
													Class94 class94 = (bool ? (SceneCluster.aClass94_1372)
															: (JunkTex.aClass94_4223));
													if (i_6_ == 1600)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1490);
													else if (i_6_ == 1601)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1547);
													else if (i_6_ == 1602)
														JunkTex.aClass124Array5101[i_4_++] = (class94.aClass124_1499);
													else if (i_6_ == 1603)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1544);
													else if (i_6_ == 1604)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1605);
													else if (i_6_ == 1605)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1513);
													else if (i_6_ == 1606)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1465);
													else if (i_6_ == 1607)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1516);
													else if (i_6_ == 1608)
														Class79.anIntArray1305[i_3_++] = (class94.anInt1578);
													else {
														if (i_6_ != 1609)
															break;
														Class79.anIntArray1305[i_3_++] = (class94.anInt1590);
													}
												}
											} else {
												Class94 class94 = (!bool ? (JunkTex.aClass94_4223)
														: (SceneCluster.aClass94_1372));
												if (i_6_ == 1500)
													Class79.anIntArray1305[i_3_++] = class94.anInt1523;
												else if (i_6_ == 1501)
													Class79.anIntArray1305[i_3_++] = class94.anInt1583;
												else if (i_6_ == 1502)
													Class79.anIntArray1305[i_3_++] = class94.anInt1518;
												else if (i_6_ == 1503)
													Class79.anIntArray1305[i_3_++] = class94.anInt1545;
												else if (i_6_ == 1504)
													Class79.anIntArray1305[i_3_++] = (!(class94.aBoolean1503) ? 0 : 1);
												else {
													if (i_6_ != 1505)
														break;
													Class79.anIntArray1305[i_3_++] = class94.anInt1540;
												}
											}
										} else {
											Class94 class94;
											if (i_6_ < 2000)
												class94 = (!bool ? (JunkTex.aClass94_4223)
														: (SceneCluster.aClass94_1372));
											else {
												class94 = (JunkTex.method1233((Class79.anIntArray1305[--i_3_]), 21803));
												i_6_ -= 1000;
											}
											Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
											int[] is_305_ = null;
											if (class124.length(0) > 0
													&& (class124.method1710(0, (class124.length(0) - 1))) == 89) {
												int i_306_ = (Class79.anIntArray1305[--i_3_]);
												if (i_306_ > 0) {
													is_305_ = new int[i_306_];
													while (i_306_-- > 0)
														is_305_[i_306_] = (Class79.anIntArray1305[--i_3_]);
												}
												class124 = (class124.substring(0, (class124.length(0) - 1),
														(byte) -104));
											}
											Object[] objects_307_ = (new Object[(class124.length(i_1_ ^ 0x4f))
													+ 1]);
											for (int i_308_ = objects_307_.length - 1; i_308_ >= 1; i_308_--) {
												if (class124.method1710(0, (i_308_ - 1)) != 115)
													objects_307_[i_308_] = (new Integer(
															Class79.anIntArray1305[--i_3_]));
												else
													objects_307_[i_308_] = (JunkTex.aClass124Array5101[--i_4_]);
											}
											int i_309_ = (Class79.anIntArray1305[--i_3_]);
											if (i_309_ != -1)
												objects_307_[0] = new Integer(i_309_);
											else
												objects_307_ = null;
											if (i_6_ != 1400) {
												if (i_6_ == 1401)
													class94.anObjectArray1594 = objects_307_;
												else if (i_6_ == 1402)
													class94.anObjectArray1592 = objects_307_;
												else if (i_6_ == 1403)
													class94.anObjectArray1600 = objects_307_;
												else if (i_6_ != 1404) {
													if (i_6_ == 1405)
														class94.anObjectArray1581 = objects_307_;
													else if (i_6_ != 1406) {
														if (i_6_ != 1407) {
															if (i_6_ == 1408)
																class94.anObjectArray1461 = objects_307_;
															else if (i_6_ == 1409)
																class94.anObjectArray1535 = objects_307_;
															else if (i_6_ == 1410)
																class94.anObjectArray1475 = objects_307_;
															else if (i_6_ != 1411) {
																if (i_6_ != 1412) {
																	if (i_6_ == 1414) {
																		class94.anObjectArray1608 = objects_307_;
																		class94.anIntArray1470 = is_305_;
																	} else if (i_6_ != 1415) {
																		if (i_6_ != 1416) {
																			if (i_6_ != 1417) {
																				if (i_6_ == 1418)
																					class94.anObjectArray1524 = objects_307_;
																				else if (i_6_ != 1419) {
																					if (i_6_ != 1420) {
																						if (i_6_ == 1421)
																							class94.anObjectArray1457 = objects_307_;
																						else if (i_6_ != 1422) {
																							if (i_6_ == 1423)
																								class94.anObjectArray1526 = objects_307_;
																							else if (i_6_ != 1424) {
																								if (i_6_ == 1425)
																									class94.anObjectArray1555 = objects_307_;
																								else if (i_6_ != 1426) {
																									if (i_6_ == 1427)
																										class94.anObjectArray1604 = objects_307_;
																									else if (i_6_ != 1428) {
																										if (i_6_ == 1429) {
																											class94.anIntArray1546 = is_305_;
																											class94.anObjectArray1517 = objects_307_;
																										}
																									} else {
																										class94.anIntArray1566 = is_305_;
																										class94.anObjectArray1596 = objects_307_;
																									}
																								} else
																									class94.anObjectArray1601 = objects_307_;
																							} else
																								class94.anObjectArray1473 = objects_307_;
																						} else
																							class94.anObjectArray1484 = objects_307_;
																					} else
																						class94.anObjectArray1500 = objects_307_;
																				} else
																					class94.anObjectArray1519 = objects_307_;
																			} else
																				class94.anObjectArray1463 = objects_307_;
																		} else
																			class94.anObjectArray1562 = objects_307_;
																	} else {
																		class94.anObjectArray1504 = objects_307_;
																		class94.anIntArray1539 = is_305_;
																	}
																} else
																	class94.anObjectArray1456 = objects_307_;
															} else
																class94.anObjectArray1591 = objects_307_;
														} else {
															class94.anObjectArray1585 = objects_307_;
															class94.anIntArray1557 = is_305_;
														}
													} else
														class94.anObjectArray1468 = objects_307_;
												} else
													class94.anObjectArray1576 = objects_307_;
											} else
												class94.anObjectArray1458 = objects_307_;
											class94.aBoolean1564 = true;
										}
									} else {
										Class94 class94;
										if (i_6_ >= 2000) {
											class94 = (JunkTex.method1233((Class79.anIntArray1305[--i_3_]), 21803));
											i_6_ -= 1000;
										} else
											class94 = (bool ? SceneCluster.aClass94_1372
													: (JunkTex.aClass94_4223));
										if (i_6_ == 1300) {
											int i_310_ = ((Class79.anIntArray1305[--i_3_]) - 1);
											if (i_310_ < 0 || i_310_ > 9)
												i_4_--;
											else
												class94.method1477((JunkTex.aClass124Array5101[--i_4_]),
														(byte) 109, i_310_);
										} else if (i_6_ == 1301) {
											i_3_ -= 2;
											int i_311_ = Class79.anIntArray1305[i_3_];
											int i_312_ = (Class79.anIntArray1305[i_3_ + 1]);
											class94.aClass94_1492 = (JunkTex.method464(i_312_, i_311_,
													(byte) -19));
										} else if (i_6_ == 1302)
											class94.aBoolean1507 = (Class79.anIntArray1305[--i_3_]) == 1;
										else if (i_6_ == 1303)
											class94.anInt1580 = (Class79.anIntArray1305[--i_3_]);
										else if (i_6_ == 1304)
											class94.anInt1549 = (Class79.anIntArray1305[--i_3_]);
										else if (i_6_ == 1305)
											class94.aClass124_1508 = (JunkTex.aClass124Array5101[--i_4_]);
										else if (i_6_ == 1306)
											class94.aClass124_1589 = (JunkTex.aClass124Array5101[--i_4_]);
										else {
											if (i_6_ != 1307)
												break;
											class94.aClass124Array1573 = null;
										}
									}
								} else {
									Class94 class94;
									if (i_6_ >= 2000) {
										class94 = (JunkTex.method1233(Class79.anIntArray1305[--i_3_], 21803));
										i_6_ -= 1000;
									} else
										class94 = (bool ? SceneCluster.aClass94_1372
												: (JunkTex.aClass94_4223));
									Class103.method1531(class94);
									if (i_6_ == 1200 || i_6_ == 1205) {
										i_3_ -= 2;
										int i_313_ = Class79.anIntArray1305[i_3_];
										int i_314_ = Class79.anIntArray1305[i_3_ + 1];
										if (i_313_ == -1) {
											class94.anInt1550 = -1;
											class94.anInt1532 = -1;
											class94.anInt1543 = 1;
										} else {
											class94.anInt1495 = i_314_;
											class94.anInt1532 = i_313_;
											Class142 class142 = JunkTex.method605(121, i_313_);
											class94.anInt1516 = class142.anInt2326;
											class94.anInt1465 = class142.anInt2317;
											class94.anInt1482 = class142.anInt2285;
											if (i_6_ != 1205)
												class94.aBoolean1575 = true;
											else
												class94.aBoolean1575 = false;
											class94.anInt1459 = class142.anInt2293;
											class94.anInt1578 = class142.anInt2286;
											class94.anInt1513 = class142.anInt2273;
											if (class94.anInt1514 > 0)
												class94.anInt1513 = (class94.anInt1513 * 32 / class94.anInt1514);
											else if (class94.anInt1485 > 0)
												class94.anInt1513 = (class94.anInt1513 * 32 / class94.anInt1485);
										}
									} else if (i_6_ == 1201) {
										class94.anInt1543 = 2;
										class94.anInt1550 = Class79.anIntArray1305[--i_3_];
									} else if (i_6_ == 1202) {
										class94.anInt1543 = 3;
										class94.anInt1550 = Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.aClass102_4941
												.method1520(1073741824);
									} else if (i_6_ == 1203) {
										class94.anInt1543 = 6;
										class94.anInt1550 = Class79.anIntArray1305[--i_3_];
									} else {
										if (i_6_ != 1204)
											break;
										class94.anInt1543 = 5;
										class94.anInt1550 = Class79.anIntArray1305[--i_3_];
									}
								}
							} else {
								Class94 class94;
								if (i_6_ >= 2000) {
									i_6_ -= 1000;
									class94 = JunkTex.method1233((Class79.anIntArray1305[--i_3_]), i_1_ + 21724);
								} else
									class94 = (bool ? SceneCluster.aClass94_1372 : JunkTex.aClass94_4223);
								if (i_6_ == 1100) {
									i_3_ -= 2;
									class94.anInt1490 = Class79.anIntArray1305[i_3_];
									if (class94.anInt1490 > (class94.anInt1544 - class94.anInt1518))
										class94.anInt1490 = (class94.anInt1544 - class94.anInt1518);
									if (class94.anInt1490 < 0)
										class94.anInt1490 = 0;
									class94.anInt1547 = Class79.anIntArray1305[i_3_ + 1];
									if (-class94.anInt1545 + class94.anInt1605 < class94.anInt1547)
										class94.anInt1547 = (class94.anInt1605 - class94.anInt1545);
									if (class94.anInt1547 < 0)
										class94.anInt1547 = 0;
									Class103.method1531(class94);
								} else if (i_6_ == 1101) {
									class94.anInt1567 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1102) {
									class94.aBoolean1497 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1103) {
									class94.anInt1590 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1104) {
									class94.anInt1506 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1105) {
									class94.anInt1487 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1106) {
									class94.anInt1474 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1107) {
									class94.aBoolean1520 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1108) {
									class94.anInt1543 = 1;
									class94.anInt1550 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1109) {
									i_3_ -= 6;
									class94.anInt1459 = Class79.anIntArray1305[i_3_];
									class94.anInt1482 = Class79.anIntArray1305[i_3_ + 1];
									class94.anInt1465 = Class79.anIntArray1305[i_3_ + 2];
									class94.anInt1578 = Class79.anIntArray1305[i_3_ + 3];
									class94.anInt1516 = Class79.anIntArray1305[i_3_ + 4];
									class94.anInt1513 = Class79.anIntArray1305[i_3_ + 5];
									Class103.method1531(class94);
								} else if (i_6_ == 1110) {
									int i_315_ = Class79.anIntArray1305[--i_3_];
									if (i_315_ != class94.anInt1598) {
										class94.anInt1598 = i_315_;
										class94.anInt1610 = 0;
										class94.anInt1603 = 0;
										Class103.method1531(class94);
									}
								} else if (i_6_ == 1111) {
									class94.aBoolean1599 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1112) {
									Class124 class124 = (JunkTex.aClass124Array5101[--i_4_]);
									if (!class124.method1704((class94.aClass124_1499), (byte) 119)) {
										class94.aClass124_1499 = class124;
										Class103.method1531(class94);
									}
								} else if (i_6_ == 1113) {
									class94.anInt1588 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1114) {
									i_3_ -= 3;
									class94.anInt1571 = Class79.anIntArray1305[i_3_];
									class94.anInt1538 = Class79.anIntArray1305[i_3_ + 1];
									class94.anInt1460 = Class79.anIntArray1305[i_3_ + 2];
									Class103.method1531(class94);
								} else if (i_6_ == 1115) {
									class94.aBoolean1471 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1116) {
									class94.anInt1597 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1117) {
									class94.anInt1570 = Class79.anIntArray1305[--i_3_];
									Class103.method1531(class94);
								} else if (i_6_ == 1118) {
									class94.aBoolean1472 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1119) {
									class94.aBoolean1612 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								} else if (i_6_ == 1120) {
									i_3_ -= 2;
									class94.anInt1544 = Class79.anIntArray1305[i_3_];
									class94.anInt1605 = Class79.anIntArray1305[i_3_ + 1];
									Class103.method1531(class94);
									if (class94.anInt1489 == 0)
										Class14_Sub2_Sub21.method445(class94, 18559, false);
								} else if (i_6_ == 1121) {
									i_3_ -= 2;
									class94.aShort1602 = (short) Class79.anIntArray1305[i_3_];
									class94.aShort1528 = (short) (Class79.anIntArray1305[i_3_ + 1]);
									Class103.method1531(class94);
								} else {
									if (i_6_ != 1122)
										break;
									class94.aBoolean1577 = Class79.anIntArray1305[--i_3_] == 1;
									Class103.method1531(class94);
								}
							}
						} else {
							Class94 class94;
							if (i_6_ < 2000)
								class94 = (bool ? SceneCluster.aClass94_1372 : JunkTex.aClass94_4223);
							else {
								class94 = JunkTex.method1233((Class79.anIntArray1305[--i_3_]), 21803);
								i_6_ -= 1000;
							}
							if (i_6_ == 1000) {
								i_3_ -= 4;
								class94.anInt1561 = Class79.anIntArray1305[i_3_];
								class94.anInt1609 = Class79.anIntArray1305[i_3_ + 1];
								int i_316_ = Class79.anIntArray1305[i_3_ + 2];
								int i_317_ = Class79.anIntArray1305[i_3_ + 3];
								if (i_316_ < 0)
									i_316_ = 0;
								else if (i_316_ > 5)
									i_316_ = 5;
								if (i_317_ >= 0) {
									if (i_317_ > 5)
										i_317_ = 5;
								} else
									i_317_ = 0;
								class94.aByte1502 = (byte) i_317_;
								class94.aByte1496 = (byte) i_316_;
								Class103.method1531(class94);
								JunkTex.method582((byte) -124, class94);
							} else if (i_6_ == 1001) {
								i_3_ -= 4;
								class94.anInt1485 = Class79.anIntArray1305[i_3_];
								class94.anInt1488 = Class79.anIntArray1305[i_3_ + 1];
								class94.anInt1514 = 0;
								class94.anInt1534 = 0;
								int i_318_ = Class79.anIntArray1305[i_3_ + 3];
								int i_319_ = Class79.anIntArray1305[i_3_ + 2];
								if (i_319_ >= 0) {
									if (i_319_ > 4)
										i_319_ = 4;
								} else
									i_319_ = 0;
								if (i_318_ < 0)
									i_318_ = 0;
								else if (i_318_ > 4)
									i_318_ = 4;
								class94.aByte1536 = (byte) i_318_;
								class94.aByte1509 = (byte) i_319_;
								Class103.method1531(class94);
								JunkTex.method582((byte) -124, class94);
								if (class94.anInt1489 == 0)
									Class14_Sub2_Sub21.method445(class94, 18559, false);
							} else if (i_6_ == 1003) {
								boolean bool_320_ = Class79.anIntArray1305[--i_3_] == 1;
								if (!class94.aBoolean1503 != !bool_320_) {
									class94.aBoolean1503 = bool_320_;
									Class103.method1531(class94);
								}
							} else {
								if (i_6_ != 1004)
									break;
								i_3_ -= 2;
								class94.anInt1467 = Class79.anIntArray1305[i_3_];
								class94.anInt1464 = Class79.anIntArray1305[i_3_ + 1];
								Class103.method1531(class94);
								JunkTex.method582((byte) -124, class94);
								if (class94.anInt1489 == 0)
									Class14_Sub2_Sub21.method445(class94, 18559, false);
							}
						}
					} else if (i_6_ == 100) {
						i_3_ -= 3;
						int i_321_ = Class79.anIntArray1305[i_3_];
						int i_322_ = Class79.anIntArray1305[i_3_ + 1];
						int i_323_ = Class79.anIntArray1305[i_3_ + 2];
						if (i_322_ == 0)
							throw new RuntimeException();
						Class94 class94 = JunkTex.method1233(i_321_, 21803);
						if (class94.aClass94Array1486 == null)
							class94.aClass94Array1486 = new Class94[i_323_ + 1];
						if (i_323_ >= class94.aClass94Array1486.length) {
							Class94[] class94s = new Class94[i_323_ + 1];
							for (int i_324_ = 0; i_324_ < class94.aClass94Array1486.length; i_324_++)
								class94s[i_324_] = class94.aClass94Array1486[i_324_];
							class94.aClass94Array1486 = class94s;
						}
						if (i_323_ > 0 && class94.aClass94Array1486[i_323_ - 1] == null)
							throw new RuntimeException(new StringBuilder("Gap at:").append(i_323_ - 1).toString());
						Class94 class94_325_ = new Class94();
						class94_325_.aBoolean1455 = true;
						class94_325_.anInt1478 = i_323_;
						class94_325_.anInt1540 = class94_325_.anInt1548 = class94.anInt1548;
						class94_325_.anInt1489 = i_322_;
						class94.aClass94Array1486[i_323_] = class94_325_;
						if (bool)
							SceneCluster.aClass94_1372 = class94_325_;
						else
							JunkTex.aClass94_4223 = class94_325_;
						Class103.method1531(class94);
					} else if (i_6_ == 101) {
						Class94 class94 = (bool ? SceneCluster.aClass94_1372 : JunkTex.aClass94_4223);
						if (class94.anInt1478 == -1) {
							if (bool)
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						Class94 class94_326_ = JunkTex.method1233(class94.anInt1548, i_1_ ^ 0x5564);
						class94_326_.aClass94Array1486[class94.anInt1478] = null;
						Class103.method1531(class94_326_);
					} else if (i_6_ == 102) {
						Class94 class94 = JunkTex.method1233((Class79.anIntArray1305[--i_3_]), 21803);
						class94.aClass94Array1486 = null;
						Class103.method1531(class94);
					} else if (i_6_ == 200) {
						i_3_ -= 2;
						int i_327_ = Class79.anIntArray1305[i_3_ + 1];
						int i_328_ = Class79.anIntArray1305[i_3_];
						Class94 class94 = JunkTex.method464(i_327_, i_328_, (byte) -19);
						if (class94 == null || i_327_ == -1)
							Class79.anIntArray1305[i_3_++] = 0;
						else {
							Class79.anIntArray1305[i_3_++] = 1;
							if (!bool)
								JunkTex.aClass94_4223 = class94;
							else
								SceneCluster.aClass94_1372 = class94;
						}
					} else {
						if (i_6_ != 201)
							break;
						int i_329_ = Class79.anIntArray1305[--i_3_];
						Class94 class94 = JunkTex.method1233(i_329_, 21803);
						if (class94 != null) {
							Class79.anIntArray1305[i_3_++] = 1;
							if (bool)
								SceneCluster.aClass94_1372 = class94;
							else
								JunkTex.aClass94_4223 = class94;
						} else
							Class79.anIntArray1305[i_3_++] = 0;
					}
				}
				throw new IllegalStateException();
			} while (false);
			Throwable throwable = new Throwable();
			if (class14_sub2_sub12.aClass124_3906 != null) {
				Class124 class124 = Class7_Sub1.method121(30, 121);
				class124.method1675((byte) -127, Class132.aClass124_2172).method1675((byte) -127,
						class14_sub2_sub12.aClass124_3906);
				for (int i_330_ = Class67.anInt1058 - 1; i_330_ >= 0; i_330_--)
					class124.method1675((byte) -128, JunkTex.aClass124_3428).method1675((byte) -128,
							(Class83.aClass112Array1341[i_330_].aClass14_Sub2_Sub12_1873.aClass124_3906));
				if (i_6_ == 40) {
					int i_331_ = is[i_2_];
					class124.method1675((byte) -127, Class14_Sub2_Sub12.aClass124_3915).method1675((byte) -128,
							Class83.method1407(56, i_331_));
				}
				if (Class7.anInt182 != 0)
					Class15.method943(
							(JunkTex.method515((new Class124[] { Class14_Sub17.aClass124_3019,
									(class14_sub2_sub12.aClass124_3906) }), (byte) -75)),
							false, Class140.aClass124_2234, 0);
				ErrorReporting
						.method738(
								new StringBuilder("CS2 - scr:").append(class14_sub2_sub12.key).append(" op:")
										.append(i_6_).append(new String(class124.method1681(i_1_ - 27))).toString(),
						throwable, 95);
			} else {
				if (Class7.anInt182 != 0)
					Class15.method943(Static2.aClass124_1679, false, Class140.aClass124_2234, 0);
				ErrorReporting.method738(new StringBuilder("CS2 - scr:").append(class14_sub2_sub12.key)
						.append(" op:").append(i_6_).toString(), throwable, 95);
			}
		}
	}

	public static int method1597(boolean bool, SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1) {
		if (bool)
			method1597(false, null);
		int i = class133_sub1_sub1.anInt4940;
		if (class133_sub1_sub1.anInt3452 == class133_sub1_sub1.anInt3433)
			i = class133_sub1_sub1.anInt4909;
		else if (class133_sub1_sub1.anInt3456 == class133_sub1_sub1.anInt3452)
			i = class133_sub1_sub1.anInt4932;
		int i_332_ = i;
		return i_332_;
	}

	public static void method1598(int i) {
		if (i <= 46)
			anInt1929 = -62;
		Class21.aClass52_444.method1209();
		Class14_Sub2_Sub12.aClass52_3894.method1209();
	}

	public static void method1599(int i) {
		anIntArray1928 = null;
		if (i != -16844)
			method1597(true, null);
	}
}
