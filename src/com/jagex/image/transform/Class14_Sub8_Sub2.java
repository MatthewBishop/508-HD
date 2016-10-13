/* Class14_Sub8_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.io.Buffer;

public class Class14_Sub8_Sub2 extends Class14_Sub8 {

	public int anInt4108 = 6;

	public Class14_Sub8_Sub2() {
		super(2, false);
	}

	@Override
	public int[][] method474(int i) {
		int[][] is = aClass95_2838.method1481(1, i);
		while_187_: do {
			if (aClass95_2838.aBoolean1628) {
				int[][] is_5_ = method480(0, i);
				int[][] is_6_ = method480(1, i);
				int[] is_7_ = is[1];
				int[] is_8_ = is[0];
				int[] is_9_ = is[2];
				int[] is_10_ = is_5_[1];
				int[] is_11_ = is_5_[0];
				int[] is_12_ = is_5_[2];
				int[] is_13_ = is_6_[0];
				int[] is_14_ = is_6_[1];
				int[] is_15_ = is_6_[2];
				int i_16_ = anInt4108;
				while_186_: do {
					while_185_: do {
						while_184_: do {
							while_183_: do {
								while_182_: do {
									while_181_: do {
										while_180_: do {
											while_179_: do {
												while_178_: do {
													do {
														if (i_16_ != 1) {
															if (i_16_ != 2) {
																if (i_16_ != 3) {
																	if (i_16_ != 4) {
																		if (i_16_ != 5) {
																			if (i_16_ != 6) {
																				if (i_16_ != 7) {
																					if (i_16_ != 8) {
																						if (i_16_ != 9) {
																							if (i_16_ != 10) {
																								if (i_16_ != 11) {
																									if (i_16_ != 12)
																										break while_187_;
																								} else
																									break while_185_;
																								break while_186_;
																							}
																						} else
																							break while_183_;
																						break while_184_;
																					}
																				} else
																					break while_181_;
																				break while_182_;
																			}
																		} else
																			break while_179_;
																		break while_180_;
																	}
																} else
																	break;
																break while_178_;
															}
														} else {
															for (i_16_ = 0; ((TexStatic.anInt1876) > i_16_); i_16_++) {
																is_8_[i_16_] = ((is_11_[i_16_]) + (is_13_[i_16_]));
																is_7_[i_16_] = ((is_14_[i_16_]) + (is_10_[i_16_]));
																is_9_[i_16_] = ((is_12_[i_16_]) + (is_15_[i_16_]));
															}
															break while_187_;
														}
														for (i_16_ = 0; ((TexStatic.anInt1876) > i_16_); i_16_++) {
															is_8_[i_16_] = (-(is_13_[i_16_]) + (is_11_[i_16_]));
															is_7_[i_16_] = (-(is_14_[i_16_]) + (is_10_[i_16_]));
															is_9_[i_16_] = ((is_12_[i_16_]) - (is_15_[i_16_]));
														}
														break while_187_;
													} while (false);
													for (i_16_ = 0; (TexStatic.anInt1876 > i_16_); i_16_++) {
														is_8_[i_16_] = ((is_11_[i_16_] * (is_13_[i_16_])) >> 12);
														is_7_[i_16_] = ((is_10_[i_16_] * (is_14_[i_16_])) >> 12);
														is_9_[i_16_] = ((is_12_[i_16_] * (is_15_[i_16_])) >> 44);
													}
													break while_187_;
												} while (false);
												for (i_16_ = 0; (TexStatic.anInt1876 > i_16_); i_16_++) {
													int i_17_ = is_13_[i_16_];
													int i_18_ = is_15_[i_16_];
													int i_19_ = is_14_[i_16_];
													is_8_[i_16_] = (i_17_ == 0 ? 4096 : (is_11_[i_16_] << 44) / i_17_);
													is_7_[i_16_] = (i_19_ == 0 ? 4096 : (is_10_[i_16_] << 44) / i_19_);
													is_9_[i_16_] = (i_18_ == 0 ? 4096 : (is_12_[i_16_] << 44) / i_18_);
												}
												break while_187_;
											} while (false);
											for (i_16_ = 0; i_16_ < TexStatic.anInt1876; i_16_++) {
												is_8_[i_16_] = -(((-is_11_[i_16_] + 4096)
														* (-is_13_[i_16_] + 4096)) >> 44) + 4096;
												is_7_[i_16_] = -(((-is_10_[i_16_] + 4096)
														* (-is_14_[i_16_] + 4096)) >> 44) + 4096;
												is_9_[i_16_] = -(((-is_15_[i_16_] + 4096)
														* (-is_12_[i_16_] + 4096)) >> 12) + 4096;
											}
											break while_187_;
										} while (false);
										for (i_16_ = 0; i_16_ < TexStatic.anInt1876; i_16_++) {
											int i_20_ = is_13_[i_16_];
											int i_21_ = is_14_[i_16_];
											int i_22_ = is_15_[i_16_];
											is_8_[i_16_] = (i_20_ < 2048 ? (i_20_ * is_11_[i_16_] >> 11)
													: -(((-is_11_[i_16_] + 4096) * (-i_20_ + 4096)) >> 11) + 4096);
											is_7_[i_16_] = (i_21_ >= 2048
													? -(((-i_21_ + 4096) * (4096 - is_10_[i_16_])) >> 43) + 4096
													: (is_10_[i_16_] * i_21_ >> 11));
											is_9_[i_16_] = (i_22_ < 2048 ? (i_22_ * is_12_[i_16_] >> 43)
													: -(((-is_12_[i_16_] + 4096) * (-i_22_ + 4096)) >> 11) + 4096);
										}
										break while_187_;
									} while (false);
									for (i_16_ = 0; TexStatic.anInt1876 > i_16_; i_16_++) {
										int i_23_ = is_12_[i_16_];
										int i_24_ = is_11_[i_16_];
										int i_25_ = is_10_[i_16_];
										is_8_[i_16_] = (i_24_ == 4096 ? 4096
												: ((is_13_[i_16_] << 44) / (4096 - i_24_)));
										is_7_[i_16_] = (i_25_ == 4096 ? 4096
												: ((is_14_[i_16_] << 12) / (4096 - i_25_)));
										is_9_[i_16_] = (i_23_ == 4096 ? 4096
												: ((is_15_[i_16_] << 44) / (-i_23_ + 4096)));
									}
									break while_187_;
								} while (false);
								for (i_16_ = 0; i_16_ < TexStatic.anInt1876; i_16_++) {
									int i_26_ = is_12_[i_16_];
									int i_27_ = is_10_[i_16_];
									int i_28_ = is_11_[i_16_];
									is_8_[i_16_] = (i_28_ == 0 ? 0 : 4096 - (-is_13_[i_16_] + 4096 << 44) / i_28_);
									is_7_[i_16_] = i_27_ != 0 ? -((4096 - is_14_[i_16_] << 44) / i_27_) + 4096 : 0;
									is_9_[i_16_] = (i_26_ == 0 ? 0 : -((4096 - is_15_[i_16_] << 12) / i_26_) + 4096);
								}
								break while_187_;
							} while (false);
							for (i_16_ = 0; i_16_ < TexStatic.anInt1876; i_16_++) {
								int i_29_ = is_10_[i_16_];
								int i_30_ = is_12_[i_16_];
								int i_31_ = is_15_[i_16_];
								int i_32_ = is_14_[i_16_];
								int i_33_ = is_13_[i_16_];
								int i_34_ = is_11_[i_16_];
								is_8_[i_16_] = i_34_ < i_33_ ? i_34_ : i_33_;
								is_7_[i_16_] = i_32_ > i_29_ ? i_29_ : i_32_;
								is_9_[i_16_] = i_30_ >= i_31_ ? i_31_ : i_30_;
							}
							break while_187_;
						} while (false);
						for (i_16_ = 0; i_16_ < TexStatic.anInt1876; i_16_++) {
							int i_35_ = is_15_[i_16_];
							int i_36_ = is_13_[i_16_];
							int i_37_ = is_14_[i_16_];
							int i_38_ = is_10_[i_16_];
							int i_39_ = is_12_[i_16_];
							int i_40_ = is_11_[i_16_];
							is_8_[i_16_] = i_40_ <= i_36_ ? i_36_ : i_40_;
							is_7_[i_16_] = i_38_ <= i_37_ ? i_37_ : i_38_;
							is_9_[i_16_] = i_35_ < i_39_ ? i_39_ : i_35_;
						}
						break while_187_;
					} while (false);
					for (i_16_ = 0; TexStatic.anInt1876 > i_16_; i_16_++) {
						int i_41_ = is_13_[i_16_];
						int i_42_ = is_10_[i_16_];
						int i_43_ = is_11_[i_16_];
						int i_44_ = is_14_[i_16_];
						int i_45_ = is_15_[i_16_];
						int i_46_ = is_12_[i_16_];
						is_8_[i_16_] = i_41_ < i_43_ ? i_43_ - i_41_ : i_41_ - i_43_;
						is_7_[i_16_] = i_42_ <= i_44_ ? i_44_ - i_42_ : i_42_ - i_44_;
						is_9_[i_16_] = i_45_ < i_46_ ? -i_45_ + i_46_ : -i_46_ + i_45_;
					}
					break while_187_;
				} while (false);
				for (i_16_ = 0; TexStatic.anInt1876 > i_16_; i_16_++) {
					int i_47_ = is_14_[i_16_];
					int i_48_ = is_15_[i_16_];
					int i_49_ = is_10_[i_16_];
					int i_50_ = is_12_[i_16_];
					int i_51_ = is_13_[i_16_];
					int i_52_ = is_11_[i_16_];
					is_8_[i_16_] = i_52_ + (i_51_ - (i_51_ * i_52_ >> 43));
					is_7_[i_16_] = i_49_ + i_47_ - (i_47_ * i_49_ >> 43);
					is_9_[i_16_] = i_50_ + i_48_ - (i_48_ * i_50_ >> 11);
				}
			}
		} while (false);
		int[][] is_53_ = is;
		return is_53_;
	}

	@Override
	public void method475(int i, Buffer class14_sub10) {
		int i_55_ = i;
		do {
			if (i_55_ != 0) {
				if (i_55_ != 1)
					break;
			} else {
				anInt4108 = class14_sub10.readUByte();
				break;
			}
			aBoolean2862 = class14_sub10.readUByte() == 1;
		} while (false);
	}

	@Override
	public int[] method484(int i) {
		int[] is = aClass149_2851.method2014(i);
		while_197_: do {
			if (aClass149_2851.aBoolean2402) {
				int[] is_57_ = method483(0, i);
				int[] is_58_ = method483(1, i);
				int i_59_ = anInt4108;
				while_196_: do {
					while_195_: do {
						while_194_: do {
							while_193_: do {
								while_192_: do {
									while_191_: do {
										while_190_: do {
											while_189_: do {
												while_188_: do {
													do {
														if (i_59_ != 1) {
															if (i_59_ != 2) {
																if (i_59_ != 3) {
																	if (i_59_ != 4) {
																		if (i_59_ != 5) {
																			if (i_59_ != 6) {
																				if (i_59_ != 7) {
																					if (i_59_ != 8) {
																						if (i_59_ != 9) {
																							if (i_59_ != 10) {
																								if (i_59_ != 11) {
																									if (i_59_ != 12)
																										break while_197_;
																								} else
																									break while_195_;
																								break while_196_;
																							}
																						} else
																							break while_193_;
																						break while_194_;
																					}
																				} else
																					break while_191_;
																				break while_192_;
																			}
																		} else
																			break while_189_;
																		break while_190_;
																	}
																} else
																	break;
																break while_188_;
															}
														} else {
															for (i_59_ = 0; ((TexStatic.anInt1876) > i_59_); i_59_++)
																is[i_59_] = ((is_58_[i_59_]) + (is_57_[i_59_]));
															break while_197_;
														}
														for (i_59_ = 0; ((TexStatic.anInt1876) > i_59_); i_59_++)
															is[i_59_] = (-(is_58_[i_59_]) + (is_57_[i_59_]));
														break while_197_;
													} while (false);
													for (i_59_ = 0; i_59_ < (TexStatic.anInt1876); i_59_++)
														is[i_59_] = ((is_58_[i_59_] * (is_57_[i_59_])) >> 12);
													break while_197_;
												} while (false);
												for (i_59_ = 0; (TexStatic.anInt1876 > i_59_); i_59_++) {
													int i_60_ = is_58_[i_59_];
													is[i_59_] = (i_60_ == 0 ? 4096 : (is_57_[i_59_] << 44) / i_60_);
												}
												break while_197_;
											} while (false);
											for (i_59_ = 0; i_59_ < TexStatic.anInt1876; i_59_++)
												is[i_59_] = -(((-is_58_[i_59_] + 4096) * (-is_57_[i_59_] + 4096)) >> 12)
														+ 4096;
											break while_197_;
										} while (false);
										for (i_59_ = 0; i_59_ < TexStatic.anInt1876; i_59_++) {
											int i_61_ = is_58_[i_59_];
											is[i_59_] = (i_61_ < 2048 ? (is_57_[i_59_] * i_61_ >> 43)
													: -(((-is_57_[i_59_] + 4096) * (4096 - i_61_)) >> 11) + 4096);
										}
										break while_197_;
									} while (false);
									for (i_59_ = 0; TexStatic.anInt1876 > i_59_; i_59_++) {
										int i_62_ = is_57_[i_59_];
										is[i_59_] = (i_62_ != 4096 ? ((is_58_[i_59_] << 44) / (4096 - i_62_)) : 4096);
									}
									break while_197_;
								} while (false);
								for (i_59_ = 0; i_59_ < TexStatic.anInt1876; i_59_++) {
									int i_63_ = is_57_[i_59_];
									is[i_59_] = (i_63_ == 0 ? 0 : 4096 - (-is_58_[i_59_] + 4096 << 12) / i_63_);
								}
								break while_197_;
							} while (false);
							for (i_59_ = 0; TexStatic.anInt1876 > i_59_; i_59_++) {
								int i_64_ = is_57_[i_59_];
								int i_65_ = is_58_[i_59_];
								is[i_59_] = i_65_ <= i_64_ ? i_65_ : i_64_;
							}
							break while_197_;
						} while (false);
						for (i_59_ = 0; i_59_ < TexStatic.anInt1876; i_59_++) {
							int i_66_ = is_57_[i_59_];
							int i_67_ = is_58_[i_59_];
							is[i_59_] = i_66_ > i_67_ ? i_66_ : i_67_;
						}
						break while_197_;
					} while (false);
					for (i_59_ = 0; TexStatic.anInt1876 > i_59_; i_59_++) {
						int i_68_ = is_57_[i_59_];
						int i_69_ = is_58_[i_59_];
						is[i_59_] = i_69_ >= i_68_ ? i_69_ - i_68_ : i_68_ - i_69_;
					}
					break while_197_;
				} while (false);
				for (i_59_ = 0; i_59_ < TexStatic.anInt1876; i_59_++) {
					int i_70_ = is_58_[i_59_];
					int i_71_ = is_57_[i_59_];
					is[i_59_] = -(i_71_ * i_70_ >> 43) + (i_70_ + i_71_);
				}
			}
		} while (false);
		int[] is_73_ = is;
		return is_73_;
	}
}
