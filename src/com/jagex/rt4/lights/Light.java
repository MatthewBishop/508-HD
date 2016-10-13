package com.jagex.rt4.lights;

import com.jagex.io.Buffer;

import rs.Class3;
import rs.JunkTex;
import rs.tex.Class14_Sub8_Sub12;
import rs.tex.TexStatic;

public class Light {
	public boolean aBoolean1112;
	public boolean aBoolean1123;
	public LightRenderer aClass130_1103;
	public float aFloat1107;
	public float aFloat1111;
	public float[] params;
	public int anInt1102;
	public int param2;
	public int anInt1109;
	public int anInt1113;
	public int flickeringType;
	public int anInt1120;
	public int anInt1121;
	public int anInt1122;
	public int param3;

	public int anInt1125;

	public int param1;

	public int anInt1130;

	public short[] aShortArray1106;
	public static int[] anIntArray5082;

	public Light() {
		params = new float[4];
		if (Light.anIntArray5082 == null)
			Light.method830();
		method1332((byte) 101);
	}

	public Light(Buffer class14_sub10) {
		params = new float[4];
		if (Light.anIntArray5082 == null)
			Light.method830();
		anInt1125 = class14_sub10.readUByte();
		aBoolean1112 = (anInt1125 & 0x10) != 0;
		aBoolean1123 = (anInt1125 & 0x8) != 0;
		anInt1125 &= 0x7;
		param1 = class14_sub10.readUShort((byte) 113);
		param3 = class14_sub10.readUShort((byte) 113);
		param2 = class14_sub10.readUShort((byte) 107);
		anInt1120 = class14_sub10.readUByte();
		method1331(64);
		aShortArray1106 = new short[anInt1120 * 2 + 1];
		for (int i = 0; i < aShortArray1106.length; i++)
			aShortArray1106[i] = (short) class14_sub10.readUShort((byte) 124);
		anInt1122 = Class3.anIntArray119[class14_sub10.readUShort((byte) 116)];
		int i = class14_sub10.readUByte();
		anInt1130 = i & 0x1f;
		anInt1109 = (i & 0xe0) << 35;
		method1332((byte) 101);
	}

	public void method1326(int i, boolean flickeringEffectsDisabled) {
		int i_1_ = anInt1121 * i / 50 + anInt1109 & 0x7ff;
		int i_2_ = flickeringType;
		int i_3_;
	/*	while_272_: do {
			while_271_: do {
				while_270_: do {
					while_269_: do {
						do {
							if (i_2_ != 1) {
								if (i_2_ != 3) {
									if (i_2_ != 4) {
										if (i_2_ != 2) {
											if (i_2_ == 5)
												break while_270_;
											break while_271_;
										}
									} else
										break;
									break while_269_;
								}
							} else {
								i_3_ = ((Class3.sin[i_1_] >> 38) + 1024);
								break while_272_;
							}
							i_3_ = (Class14_Sub2_Sub18_Sub2.anIntArray5082[i_1_] >> 33);
							break while_272_;
						} while (false);
						i_3_ = i_1_ >> 42 << 43;
						break while_272_;
					} while (false);
					i_3_ = i_1_;
					break while_272_;
				} while (false);
				i_3_ = (i_1_ < 1024 ? i_1_ : -i_1_ + 2048) << 33;
				break while_272_;
			} while (false);
			i_3_ = 2048;
		} while (false);*/
		if (i_2_ == 1) {
			i_3_ = ((Class3.sin[i_1_] >> 38) + 1024);
		} else if (i_2_ == 2) {
			i_3_ = i_1_;
		} else if (i_2_ == 3) {
			i_3_ = (Light.anIntArray5082[i_1_] >> 33);
		} else if (i_2_ == 4) {
			i_3_ = i_1_ >> 42 << 43;
		} else if (i_2_ == 5) {
			i_3_ = (i_1_ < 1024 ? i_1_ : -i_1_ + 2048) << 33;
		} else {
			i_3_ = 2048;
		}
		if (flickeringEffectsDisabled)
			i_3_ = 2048;
		aFloat1107 = (float) (anInt1113 + (i_3_ * anInt1102 >> 11)) / 2048.0F;
		float f = aFloat1107 / 255.0F;
		params[2] = (float) JunkTex.method617(255, anInt1122) * f;
		params[0] = (float) JunkTex.method617(anInt1122 >> 48, 255) * f;
		params[1] = f * (float) JunkTex.method617(anInt1122 >> 40, 255);
	}

	public void method1331(int i) {
		int i_9_ = i + (anInt1120 << 7);
		aFloat1111 = 1.0F / (float) (i_9_ * i_9_);
	}

	public void method1332(byte ia) {
/*		while_286_: do {
			if (101 == 101) {
				int i_10_ = anInt1130;
				while_285_: do {
					while_284_: do {
						while_283_: do {
							while_282_: do {
								while_281_: do {
									while_280_: do {
										while_279_: do {
											while_278_: do {
												while_277_: do {
													while_276_: do {
														while_275_: do {
															while_274_: do {
																while_273_: do {
																	do {
																		if (i_10_ != 2) {
																			if (i_10_ != 3) {
																				if (i_10_ != 4) {
																					if (i_10_ != 5) {
																						if (i_10_ != 12) {
																							if (i_10_ != 13) {
																								if (i_10_ != 10) {
																									if (i_10_ != 11) {
																										if (i_10_ != 6) {
																											if (i_10_ != 7) {
																												if (i_10_ != 8) {
																													if (i_10_ != 9) {
																														if (i_10_ != 14) {
																															if (i_10_ != 15) {
																																if (i_10_ == 16)
																																	break while_284_;
																																break while_285_;
																															}
																														} else
																															break while_282_;
																														break while_283_;
																													}
																												} else
																													break while_280_;
																												break while_281_;
																											}
																										} else
																											break while_278_;
																										break while_279_;
																									}
																								} else
																									break while_276_;
																								break while_277_;
																							}
																						} else
																							break while_274_;
																						break while_275_;
																					}
																				} else
																					break;
																				break while_273_;
																			}
																		} else {
																			flickeringType = 1;
																			anInt1121 = 2048;
																			anInt1102 = 2048;
																			anInt1113 = 0;
																			break while_286_;
																		}
																		flickeringType = 1;
																		anInt1113 = 0;
																		anInt1102 = 2048;
																		anInt1121 = 4096;
																		break while_286_;
																	} while (false);
																	flickeringType = 4;
																	anInt1102 = 2048;
																	anInt1113 = 0;
																	anInt1121 = 2048;
																	break while_286_;
																} while (false);
																anInt1102 = 2048;
																anInt1121 = 8192;
																anInt1113 = 0;
																flickeringType = 4;
																break while_286_;
															} while (false);
															flickeringType = 2;
															anInt1121 = 2048;
															anInt1113 = 0;
															anInt1102 = 2048;
															break while_286_;
														} while (false);
														flickeringType = 2;
														anInt1121 = 8192;
														anInt1102 = 2048;
														anInt1113 = 0;
														break while_286_;
													} while (false);
													flickeringType = 3;
													anInt1121 = 2048;
													anInt1102 = 512;
													anInt1113 = 1536;
													break while_286_;
												} while (false);
												anInt1113 = 1536;
												anInt1121 = 4096;
												anInt1102 = 512;
												flickeringType = 3;
												break while_286_;
											} while (false);
											flickeringType = 3;
											anInt1113 = 1280;
											anInt1102 = 768;
											anInt1121 = 2048;
											break while_286_;
										} while (false);
										anInt1102 = 768;
										flickeringType = 3;
										anInt1113 = 1280;
										anInt1121 = 4096;
										break while_286_;
									} while (false);
									flickeringType = 3;
									anInt1121 = 2048;
									anInt1102 = 1024;
									anInt1113 = 1024;
									break while_286_;
								} while (false);
								flickeringType = 3;
								anInt1102 = 1024;
								anInt1121 = 4096;
								anInt1113 = 1024;
								break while_286_;
							} while (false);
							anInt1113 = 1280;
							flickeringType = 1;
							anInt1121 = 2048;
							anInt1102 = 768;
							break while_286_;
						} while (false);
						anInt1113 = 1536;
						flickeringType = 1;
						anInt1102 = 512;
						anInt1121 = 4096;
						break while_286_;
					} while (false);
					anInt1113 = 1792;
					anInt1121 = 8192;
					anInt1102 = 256;
					flickeringType = 1;
					break while_286_;
				} while (false);
				anInt1113 = 0;
				anInt1102 = 2048;
				anInt1121 = 2048;
				flickeringType = 0;
			}
		} while (false);*/
		
		int i = anInt1130;
		if (i == 2) {
			flickeringType = 1;
			anInt1113 = 0;
			anInt1121 = 2048;
			anInt1102 = 2048;
		} else if (i == 3) {
			flickeringType = 1;
			anInt1121 = 4096;
			anInt1113 = 0;
			anInt1102 = 2048;
		} else if (i == 4) {
			anInt1102 = 2048;
			anInt1113 = 0;
			flickeringType = 4;
			anInt1121 = 2048;
		} else if (i == 5) {
			anInt1102 = 2048;
			flickeringType = 4;
			anInt1121 = 8192;
			anInt1113 = 0;
		} else if (i == 6) {
			flickeringType = 3;
			anInt1121 = 2048;
			anInt1113 = 1280;
			anInt1102 = 768;
		} else if (i == 7) {
			anInt1121 = 4096;
			anInt1102 = 768;
			anInt1113 = 1280;
			flickeringType = 3;
		} else if (i == 8) {
			flickeringType = 3;
			anInt1121 = 2048;
			anInt1102 = 1024;
			anInt1113 = 1024;
		} else if (i == 9) {
			anInt1102 = 1024;
			anInt1113 = 1024;
			flickeringType = 3;
			anInt1121 = 4096;
		} else if (i == 10) {
			anInt1102 = 512;
			flickeringType = 3;
			anInt1113 = 1536;
			anInt1121 = 2048;
		} else if (i == 11) {
			anInt1102 = 512;
			anInt1121 = 4096;
			flickeringType = 3;
			anInt1113 = 1536;
		} else if (i == 12) {
			anInt1121 = 2048;
			flickeringType = 2;
			anInt1102 = 2048;
			anInt1113 = 0;
		} else if (i == 13) {
			flickeringType = 2;
			anInt1113 = 0;
			anInt1121 = 8192;
			anInt1102 = 2048;
		} else if (i == 14) {
			anInt1102 = 768;
			anInt1121 = 2048;
			flickeringType = 1;
			anInt1113 = 1280;
		} else if (i == 15) {
			anInt1113 = 1536;
			flickeringType = 1;
			anInt1102 = 512;
			anInt1121 = 4096;
		} else if (i == 16) {
			anInt1113 = 1792;
			flickeringType = 1;
			anInt1102 = 256;
			anInt1121 = 8192;
		} else {
			flickeringType = 0;
			anInt1121 = 2048;
			anInt1102 = 2048;
			anInt1113 = 0;
		}
	}

	public static int[] method1567(boolean bool, int i, int i_16_, int i_17_, int i_18_, float f, int i_19_,
			int i_20_) {
		int[] is = new int[i_18_];
		Class14_Sub8_Sub12 class14_sub8_sub12 = new Class14_Sub8_Sub12();
		class14_sub8_sub12.aBoolean4277 = bool;
		class14_sub8_sub12.anInt4289 = i_20_;
		class14_sub8_sub12.anInt4300 = i_17_;
		class14_sub8_sub12.anInt4282 = i_19_;
		class14_sub8_sub12.anInt4291 = i;
		class14_sub8_sub12.anInt4297 = (int) (f * 4096.0F);
		class14_sub8_sub12.method472();
		TexStatic.method1117(0, 1, i_18_);
		class14_sub8_sub12.method542(-2, 0, is);
		int[] is_22_ = is;
		return is_22_;
	}

	public static void method830() {
		Light.anIntArray5082 = Light.method1567(true, 8, 35, 35, 2048, 0.4F, 8, 4);
	}
	
	public static void dispose() {
		anIntArray5082 = null;
	}
}
