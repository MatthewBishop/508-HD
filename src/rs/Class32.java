/* Class32 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.ErrorReporting;
import com.jagex.io.js5.FileSystem;
import com.jagex.rt4.Class148_Sub1;

public class Class32 {
	public int anInt532;
	public static int[] anIntArray533;
	public static int[] anIntArray534;
	public static int[] anIntArray535;
	public static int[] anIntArray537;
	public static Class148_Sub1[] aClass148_Sub1Array540;
	public static Class124[] aClass124Array542;
	public int anInt545 = 0;
	public int[][] anIntArrayArray546;
	public static int spriteAmount;
	public int anInt548;
	public static int anInt549 = 50;
	public static int anInt551;
	public int anInt562;
	public static int anInt563;
	public static int[] anIntArray564;
	public static int[] anIntArray565;
	public static int anInt566;
	public static int[] anIntArray568;
	public static int anInt571;

	static {
		anIntArray535 = new int[anInt549];
		anInt551 = 0;
		anIntArray534 = new int[anInt549];
		anIntArray533 = new int[anInt549];
		aClass124Array542 = new Class124[anInt549];
		anInt566 = 0;
		anIntArray565 = new int[anInt549];
		anIntArray537 = new int[anInt549];
		anIntArray564 = new int[anInt549];
		anIntArray568 = new int[anInt549];
	}

	public boolean method1062(int i, int i_0_, byte i_1_, int i_2_, int i_3_) {
		if (i_0_ == i_2_ && i_3_ == i) {
			boolean bool = true;
			return bool;
		}
		if (i_1_ != 24)
			method1079(36, -22, 126, 46, -41, 112, 98, -42, (byte) 102);
		i_2_ -= anInt532;
		i -= anInt545;
		if (i_2_ < 0 || i_2_ >= anInt548 || i < 0 || anInt562 <= i) {
			boolean bool = false;
			return bool;
		}
		i_3_ -= anInt545;
		i_0_ -= anInt532;
		int i_4_;
		if (i_0_ < i_2_)
			i_4_ = -i_0_ + i_2_;
		else
			i_4_ = i_0_ - i_2_;
		int i_5_;
		if (i_3_ < i)
			i_5_ = i - i_3_;
		else
			i_5_ = i_3_ - i;
		if (i_4_ <= i_5_) {
			int i_6_ = i_4_ * 65536 / i_5_;
			int i_7_ = 32768;
			while (i_3_ != i) {
				if (i_3_ >= i) {
					if (i_3_ > i) {
						if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0120) != 0)
							return false;
						i_3_--;
					}
				} else if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0102) == 0)
					i_3_++;
				else
					return false;
				i_7_ += i_6_;
				if (i_7_ >= 65536) {
					i_7_ -= 65536;
					if (i_2_ <= i_0_) {
						if (i_2_ < i_0_) {
							if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0180) != 0) {
								boolean bool = false;
								return bool;
							}
							i_0_--;
						}
					} else {
						if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0108) != 0)
							return false;
						i_0_++;
					}
				}
			}
		} else {
			int i_8_ = i_5_ * 65536 / i_4_;
			int i_9_ = 32768;
			while (i_0_ != i_2_) {
				if (i_0_ < i_2_) {
					if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0108) == 0)
						i_0_++;
					else
						return false;
				} else if (i_0_ > i_2_) {
					if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0180) == 0)
						i_0_--;
					else {
						boolean bool = false;
						return bool;
					}
				}
				i_9_ += i_8_;
				if (i_9_ >= 65536) {
					i_9_ -= 65536;
					if (i <= i_3_) {
						if (i < i_3_) {
							if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0120) != 0) {
								boolean bool = false;
								return bool;
							}
							i_3_--;
						}
					} else {
						if ((anIntArrayArray546[i_0_][i_3_] & 0x12c0102) != 0)
							return false;
						i_3_++;
					}
				}
			}
		}
		if ((anIntArrayArray546[i_2_][i] & 0x1240100) != 0)
			return false;
		boolean bool = true;
		return bool;
	}

	public boolean method1063(int i, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_,
			int i_17_, int i_18_) {
		if (i_13_ != 2)
			anIntArray533 = null;
		int i_19_ = i_14_ + i_15_;
		int i_20_ = i_11_ + i;
		int i_21_ = i_18_ + i_17_;
		int i_22_ = i_10_ + i_16_;
		if (i_18_ < i_11_ || i_20_ <= i_18_) {
			if (i_11_ >= i_21_ || i_20_ < i_21_) {
				if (i_15_ < i_10_ || i_22_ <= i_15_) {
					if (i_10_ < i_19_ && i_22_ >= i_19_) {
						if (i_11_ == i_21_ && (i_12_ & 0x8) == 0) {
							for (int i_23_ = i_10_; i_23_ < i_19_; i_23_++) {
								if (((anIntArrayArray546[-anInt532 - 1 + i_21_][i_23_ - anInt545]) & 0x8) == 0)
									return true;
							}
						} else if (i_18_ == i_20_ && (i_12_ & 0x2) == 0) {
							for (int i_24_ = i_10_; i_19_ > i_24_; i_24_++) {
								if (((anIntArrayArray546[-anInt532 + i_18_][i_24_ - anInt545]) & 0x80) == 0)
									return true;
							}
						}
					}
				} else if (i_11_ == i_21_ && (i_12_ & 0x8) == 0) {
					int i_25_ = i_22_ < i_19_ ? i_22_ : i_19_;
					for (int i_26_ = i_15_; i_26_ < i_25_; i_26_++) {
						if (((anIntArrayArray546[-anInt532 + i_21_ - 1][i_26_ - anInt545]) & 0x8) == 0)
							return true;
					}
				} else if (i_18_ == i_20_ && (i_12_ & 0x2) == 0) {
					int i_27_ = i_22_ >= i_19_ ? i_19_ : i_22_;
					for (int i_28_ = i_15_; i_28_ < i_27_; i_28_++) {
						if (((anIntArrayArray546[-anInt532 + i_18_][-anInt545 + i_28_]) & 0x80) == 0)
							return true;
					}
				}
			} else if (i_10_ != i_19_ || (i_12_ & 0x4) != 0) {
				if (i_22_ == i_15_ && (i_12_ & 0x1) == 0) {
					for (int i_29_ = i_11_; i_29_ < i_21_; i_29_++) {
						if (((anIntArrayArray546[-anInt532 + i_29_][i_15_ - anInt545]) & 0x20) == 0)
							return true;
					}
				}
			} else {
				for (int i_30_ = i_11_; i_30_ < i_21_; i_30_++) {
					if (((anIntArrayArray546[-anInt532 + i_30_][i_19_ - 1 - anInt545]) & 0x2) == 0)
						return true;
				}
			}
		} else if (i_10_ == i_19_ && (i_12_ & 0x4) == 0) {
			int i_31_ = i_18_;
			for (int i_32_ = i_20_ >= i_21_ ? i_21_ : i_20_; i_32_ > i_31_; i_31_++) {
				if (((anIntArrayArray546[-anInt532 + i_31_][-anInt545 - 1 + i_19_]) & 0x2) == 0)
					return true;
			}
		} else if (i_22_ == i_15_ && (i_12_ & 0x1) == 0) {
			int i_33_ = i_21_ > i_20_ ? i_20_ : i_21_;
			for (int i_34_ = i_18_; i_34_ < i_33_; i_34_++) {
				if ((anIntArrayArray546[i_34_ - anInt532][i_15_ - anInt545] & 0x20) == 0)
					return true;
			}
		}
		return false;
	}

	public void method1065(int i, byte i_109_, int i_110_) {
		i_110_ -= anInt545;
		i -= anInt532;
		anIntArrayArray546[i][i_110_] = Class66.method1294(anIntArrayArray546[i][i_110_], 262144);
		int i_111_ = 114 / ((i_109_ + 9) / 58);
	}

	public boolean method1066(int i, int i_112_, int i_113_, int i_114_, int i_115_, byte i_116_, int i_117_,
			int i_118_) {
		if (i == 1) {
			if (i_118_ == i_113_ && i_114_ == i_115_) {
				boolean bool = true;
				return bool;
			}
		} else if (i_118_ >= i_113_ && i_118_ <= i + (i_113_ - 1) && i_114_ >= i_114_ && i_114_ <= i_114_ - 1 + i) {
			boolean bool = true;
			return bool;
		}
		i_113_ -= anInt532;
		i_114_ -= anInt545;
		i_115_ -= anInt545;
		int i_119_ = 112 / ((i_116_ - 61) / 56);
		i_118_ -= anInt532;
		if (i != 1) {
			int i_120_ = i + i_113_ - 1;
			int i_121_ = i_115_ - 1 + i;
			if (i_112_ == 6 || i_112_ == 7) {
				if (i_112_ == 7)
					i_117_ = i_117_ + 2 & 0x3;
				if (i_117_ == 0) {
					if (i_113_ == i_118_ + 1 && i_115_ <= i_114_ && i_114_ <= i_121_
							&& (anIntArrayArray546[i_113_][i_114_] & 0x80) == 0) {
						boolean bool = true;
						return bool;
					}
					if (i_118_ >= i_113_ && i_118_ <= i_120_ && i_115_ == i_114_ - i
							&& (anIntArrayArray546[i_118_][i_121_] & 0x2) == 0) {
						boolean bool = true;
						return bool;
					}
				} else if (i_117_ == 1) {
					if (-i + i_118_ == i_113_ && i_115_ <= i_114_ && i_121_ >= i_114_
							&& (anIntArrayArray546[i_120_][i_114_] & 0x8) == 0) {
						boolean bool = true;
						return bool;
					}
					if (i_113_ <= i_118_ && i_120_ >= i_118_ && -i + i_114_ == i_115_
							&& (anIntArrayArray546[i_118_][i_121_] & 0x2) == 0) {
						boolean bool = true;
						return bool;
					}
				} else if (i_117_ != 2) {
					if (i_117_ == 3) {
						if (i_118_ + 1 == i_113_ && i_115_ <= i_114_ && i_114_ <= i_121_
								&& ((anIntArrayArray546[i_113_][i_114_] & 0x80) == 0)) {
							boolean bool = true;
							return bool;
						}
						if (i_118_ >= i_113_ && i_118_ <= i_120_ && i_114_ + 1 == i_115_
								&& ((anIntArrayArray546[i_118_][i_115_] & 0x20) == 0)) {
							boolean bool = true;
							return bool;
						}
					}
				} else {
					if (i_113_ == i_118_ - i && i_115_ <= i_114_ && i_121_ >= i_114_
							&& (anIntArrayArray546[i_120_][i_114_] & 0x8) == 0) {
						boolean bool = true;
						return bool;
					}
					if (i_113_ <= i_118_ && i_118_ <= i_120_ && i_115_ == i_114_ + 1
							&& (anIntArrayArray546[i_118_][i_115_] & 0x20) == 0) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_112_ == 8) {
				if (i_113_ <= i_118_ && i_120_ >= i_118_ && i_115_ == i_114_ + 1
						&& (anIntArrayArray546[i_118_][i_115_] & 0x20) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_113_ <= i_118_ && i_118_ <= i_120_ && -i + i_114_ == i_115_
						&& (anIntArrayArray546[i_118_][i_121_] & 0x2) == 0) {
					boolean bool = true;
					return bool;
				}
				if (-i + i_118_ == i_113_ && i_114_ >= i_115_ && i_121_ >= i_114_
						&& (anIntArrayArray546[i_120_][i_114_] & 0x8) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_113_ == i_118_ + 1 && i_114_ >= i_115_ && i_114_ <= i_121_
						&& (anIntArrayArray546[i_113_][i_114_] & 0x80) == 0) {
					boolean bool = true;
					return bool;
				}
			}
		} else {
			if (i_112_ == 6 || i_112_ == 7) {
				if (i_112_ == 7)
					i_117_ = i_117_ + 2 & 0x3;
				if (i_117_ != 0) {
					if (i_117_ == 1) {
						if (i_113_ == i_118_ - 1 && i_114_ == i_115_ && (anIntArrayArray546[i_113_][i_115_] & 0x8) == 0)
							return true;
						if (i_118_ == i_113_ && i_115_ == i_114_ - 1
								&& ((anIntArrayArray546[i_113_][i_115_] & 0x2) == 0)) {
							boolean bool = true;
							return bool;
						}
					} else if (i_117_ != 2) {
						if (i_117_ == 3) {
							if (i_118_ + 1 == i_113_ && i_114_ == i_115_
									&& ((anIntArrayArray546[i_113_][i_115_] & 0x80) == 0)) {
								boolean bool = true;
								return bool;
							}
							if (i_118_ == i_113_ && i_114_ + 1 == i_115_
									&& ((anIntArrayArray546[i_113_][i_115_] & 0x20) == 0)) {
								boolean bool = true;
								return bool;
							}
						}
					} else {
						if (i_113_ == i_118_ - 1 && i_114_ == i_115_
								&& ((anIntArrayArray546[i_113_][i_115_] & 0x8) == 0)) {
							boolean bool = true;
							return bool;
						}
						if (i_113_ == i_118_ && i_114_ + 1 == i_115_
								&& ((anIntArrayArray546[i_113_][i_115_] & 0x20) == 0)) {
							boolean bool = true;
							return bool;
						}
					}
				} else {
					if (i_113_ == i_118_ + 1 && i_115_ == i_114_ && (anIntArrayArray546[i_113_][i_115_] & 0x80) == 0) {
						boolean bool = true;
						return bool;
					}
					if (i_113_ == i_118_ && i_115_ == i_114_ - 1 && (anIntArrayArray546[i_113_][i_115_] & 0x2) == 0) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_112_ == 8) {
				if (i_118_ == i_113_ && i_115_ == i_114_ + 1 && (anIntArrayArray546[i_113_][i_115_] & 0x20) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_118_ == i_113_ && i_115_ == i_114_ - 1 && (anIntArrayArray546[i_113_][i_115_] & 0x2) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_118_ - 1 == i_113_ && i_115_ == i_114_ && (anIntArrayArray546[i_113_][i_115_] & 0x8) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_118_ + 1 == i_113_ && i_114_ == i_115_ && (anIntArrayArray546[i_113_][i_115_] & 0x80) == 0) {
					boolean bool = true;
					return bool;
				}
			}
		}
		boolean bool = false;
		return bool;
	}

	public static void method1067(int i) {
		anIntArray535 = null;
		anIntArray537 = null;
		anIntArray568 = null;
		anIntArray564 = null;
		aClass148_Sub1Array540 = null;
		aClass124Array542 = null;
		anIntArray534 = null;
		anIntArray533 = null;
		anIntArray565 = null;
	}

	public void method1068(boolean bool, int i, byte i_122_, int i_123_, int i_124_, int i_125_, int i_126_) {
		i_125_ -= anInt532;
		if (i_122_ > -73)
			method1081((byte) 81);
		int i_127_ = 256;
		i_126_ -= anInt545;
		if (i == 1 || i == 3) {
			int i_128_ = i_124_;
			i_124_ = i_123_;
			i_123_ = i_128_;
		}
		if (bool)
			i_127_ += 131072;
		for (int i_129_ = i_125_; i_129_ < i_125_ + i_124_; i_129_++) {
			if (i_129_ >= 0 && i_129_ < anInt548) {
				for (int i_130_ = i_126_; i_126_ + i_123_ > i_130_; i_130_++) {
					if (i_130_ >= 0 && i_130_ < anInt562)
						method1083(i_127_, i_129_, (byte) 93, i_130_);
				}
			}
		}
	}

	public void method1069(int i, int i_131_, int i_132_) {
		i_131_ -= anInt545;
		i_132_ -= anInt532;
		anIntArrayArray546[i_132_][i_131_] = JunkTex.method617(anIntArrayArray546[i_132_][i_131_], i);
	}

	public void method1070(int i, int i_133_, int i_134_, int i_135_) {
		anIntArrayArray546[i_135_][i] = Class66.method1294(anIntArrayArray546[i_135_][i], i_134_);
		if (i_133_ != 31396)
			anInt548 = -117;
	}

	public void method1071(boolean bool) {
		if (bool) {
			for (int i = 0; i < anInt548; i++) {
				for (int i_136_ = 0; anInt562 > i_136_; i_136_++) {
					if (i != 0 && i_136_ != 0 && anInt548 - 5 > i && anInt562 - 5 > i_136_)
						anIntArrayArray546[i][i_136_] = 16777216;
					else
						anIntArrayArray546[i][i_136_] = 16777215;
				}
			}
		}
	}

	public static void method1072(FileSystem fileSystem, byte i) {
		Static2.aFileSystem_372 = fileSystem;
		Class131.anInt2159 = Static2.aFileSystem_372.method177(4);
		if (i >= -14)
			method1074(-76, -127);
	}

	public void method1073(int i, int i_137_, int i_138_, int i_139_, boolean bool, boolean bool_140_) {
		i_138_ -= anInt545;
		i_137_ -= anInt532;
		int i_141_ = 256;
		if (bool_140_)
			method1062(28, -22, (byte) 42, 27, -21);
		if (bool)
			i_141_ += 131072;
		for (int i_142_ = i_137_; i_137_ + i > i_142_; i_142_++) {
			if (i_142_ >= 0 && i_142_ < anInt548) {
				for (int i_143_ = i_138_; i_143_ < i_138_ + i_139_; i_143_++) {
					if (i_143_ >= 0 && anInt562 > i_143_)
						method1070(i_143_, 31396, i_141_, i_142_);
				}
			}
		}
	}

	public static void method1074(int i, int i_144_) {
		if (i > -74)
			anIntArray535 = null;
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get(i_144_));
		if (class14_sub25 != null)
			class14_sub25.unlink();
	}

	public void method1075(boolean bool, int i, int i_145_, int i_146_, int i_147_, byte i_148_) {
		i_146_ -= anInt545;
		i -= anInt532;
		if (i_145_ == 0) {
			if (i_147_ == 0) {
				method1070(i_146_, 31396, 128, i);
				method1070(i_146_, 31396, 8, i - 1);
			}
			if (i_147_ == 1) {
				method1070(i_146_, 31396, 2, i);
				method1070(i_146_ + 1, 31396, 32, i);
			}
			if (i_147_ == 2) {
				method1070(i_146_, 31396, 8, i);
				method1070(i_146_, 31396, 128, i + 1);
			}
			if (i_147_ == 3) {
				method1070(i_146_, 31396, 32, i);
				method1070(i_146_ - 1, 31396, 2, i);
			}
		}
		if (i_145_ == 1 || i_145_ == 3) {
			if (i_147_ == 0) {
				method1070(i_146_, 31396, 1, i);
				method1070(i_146_ + 1, 31396, 16, i - 1);
			}
			if (i_147_ == 1) {
				method1070(i_146_, 31396, 4, i);
				method1070(i_146_ + 1, 31396, 64, i + 1);
			}
			if (i_147_ == 2) {
				method1070(i_146_, 31396, 16, i);
				method1070(i_146_ - 1, 31396, 1, i + 1);
			}
			if (i_147_ == 3) {
				method1070(i_146_, 31396, 64, i);
				method1070(i_146_ - 1, 31396, 4, i - 1);
			}
		}
		if (i_145_ == 2) {
			if (i_147_ == 0) {
				method1070(i_146_, 31396, 130, i);
				method1070(i_146_, 31396, 8, i - 1);
				method1070(i_146_ + 1, 31396, 32, i);
			}
			if (i_147_ == 1) {
				method1070(i_146_, 31396, 10, i);
				method1070(i_146_ + 1, 31396, 32, i);
				method1070(i_146_, 31396, 128, i + 1);
			}
			if (i_147_ == 2) {
				method1070(i_146_, 31396, 40, i);
				method1070(i_146_, 31396, 128, i + 1);
				method1070(i_146_ - 1, 31396, 2, i);
			}
			if (i_147_ == 3) {
				method1070(i_146_, 31396, 160, i);
				method1070(i_146_ - 1, 31396, 2, i);
				method1070(i_146_, 31396, 8, i - 1);
			}
		}
		if (bool) {
			if (i_145_ == 0) {
				if (i_147_ == 0) {
					method1070(i_146_, 31396, 65536, i);
					method1070(i_146_, 31396, 4096, i - 1);
				}
				if (i_147_ == 1) {
					method1070(i_146_, 31396, 1024, i);
					method1070(i_146_ + 1, 31396, 16384, i);
				}
				if (i_147_ == 2) {
					method1070(i_146_, 31396, 4096, i);
					method1070(i_146_, 31396, 65536, i + 1);
				}
				if (i_147_ == 3) {
					method1070(i_146_, 31396, 16384, i);
					method1070(i_146_ - 1, 31396, 1024, i);
				}
			}
			if (i_145_ == 1 || i_145_ == 3) {
				if (i_147_ == 0) {
					method1070(i_146_, 31396, 512, i);
					method1070(i_146_ + 1, 31396, 8192, i - 1);
				}
				if (i_147_ == 1) {
					method1070(i_146_, 31396, 2048, i);
					method1070(i_146_ + 1, 31396, 32768, i + 1);
				}
				if (i_147_ == 2) {
					method1070(i_146_, 31396, 8192, i);
					method1070(i_146_ - 1, 31396, 512, i + 1);
				}
				if (i_147_ == 3) {
					method1070(i_146_, 31396, 32768, i);
					method1070(i_146_ - 1, 31396, 2048, i - 1);
				}
			}
			if (i_145_ == 2) {
				if (i_147_ == 0) {
					method1070(i_146_, 31396, 66560, i);
					method1070(i_146_, 31396, 4096, i - 1);
					method1070(i_146_ + 1, 31396, 16384, i);
				}
				if (i_147_ == 1) {
					method1070(i_146_, 31396, 5120, i);
					method1070(i_146_ + 1, 31396, 16384, i);
					method1070(i_146_, 31396, 65536, i + 1);
				}
				if (i_147_ == 2) {
					method1070(i_146_, 31396, 20480, i);
					method1070(i_146_, 31396, 65536, i + 1);
					method1070(i_146_ - 1, 31396, 1024, i);
				}
				if (i_147_ == 3) {
					method1070(i_146_, 31396, 81920, i);
					method1070(i_146_ - 1, 31396, 1024, i);
					method1070(i_146_, 31396, 4096, i - 1);
				}
			}
		}
		if (i_148_ < 102)
			method1068(false, -16, (byte) -102, 58, -85, -115, -94);
	}

	public boolean method1076(int i, int i_149_, int i_150_, int i_151_, int i_152_, int i_153_, int i_154_,
			int i_155_) {
		if (i_149_ != 1) {
			if (i_153_ <= i_152_ && i_149_ + (i_153_ - 1) >= i_152_ && i_151_ <= i_151_
					&& i_151_ + i_149_ - 1 >= i_151_) {
				boolean bool = true;
				return bool;
			}
		} else if (i_153_ == i_152_ && i_151_ == i_154_) {
			boolean bool = true;
			return bool;
		}
		i_152_ -= anInt532;
		i_154_ -= anInt545;
		i_153_ -= anInt532;
		i_151_ -= anInt545;
		if (i_149_ == 1) {
			if (i_150_ == 0) {
				if (i == 0) {
					if (i_152_ - 1 == i_153_ && i_154_ == i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ == i_153_ && i_154_ == i_151_ + 1
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ - 1 == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 1) {
					if (i_152_ == i_153_ && i_151_ + 1 == i_154_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ - 1 && i_154_ == i_151_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ + 1 && i_151_ == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 2) {
					if (i_153_ == i_152_ + 1 && i_154_ == i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ + 1 == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ - 1 == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 3) {
					if (i_153_ == i_152_ && i_154_ == i_151_ - 1) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ - 1 == i_153_ && i_151_ == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_151_ == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_150_ == 2) {
				if (i == 0) {
					if (i_153_ == i_152_ - 1 && i_151_ == i_154_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ == i_153_ && i_154_ == i_151_ + 1) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_151_ == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ == i_153_ && i_151_ - 1 == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 1) {
					if (i_152_ - 1 == i_153_ && i_151_ == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ + 1 == i_154_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ + 1 && i_154_ == i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ == i_153_ && i_154_ == i_151_ - 1
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 2) {
					if (i_152_ - 1 == i_153_ && i_154_ == i_151_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_154_ == i_151_ + 1
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_154_ == i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ == i_153_ && i_154_ == i_151_ - 1) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 3) {
					if (i_152_ - 1 == i_153_ && i_154_ == i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ + 1 == i_154_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_154_ == i_151_
							&& ((anIntArrayArray546[i_153_][i_154_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ && i_151_ - 1 == i_154_) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_150_ == 9) {
				if (i_153_ == i_152_ && i_154_ == i_151_ + 1 && (anIntArrayArray546[i_153_][i_154_] & 0x20) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_153_ == i_152_ && i_154_ == i_151_ - 1 && (anIntArrayArray546[i_153_][i_154_] & 0x2) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_152_ - 1 == i_153_ && i_154_ == i_151_ && (anIntArrayArray546[i_153_][i_154_] & 0x8) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_152_ + 1 == i_153_ && i_151_ == i_154_ && (anIntArrayArray546[i_153_][i_154_] & 0x80) == 0) {
					boolean bool = true;
					return bool;
				}
			}
		} else {
			int i_156_ = i_149_ + i_153_ - 1;
			int i_157_ = i_154_ - (-i_149_ + 1);
			if (i_150_ == 0) {
				if (i == 0) {
					if (i_152_ - i_149_ == i_153_ && i_154_ <= i_151_ && i_151_ <= i_157_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_152_ <= i_156_ && i_151_ + 1 == i_154_
							&& ((anIntArrayArray546[i_152_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ <= i_152_ && i_156_ >= i_152_ && -i_149_ + i_151_ == i_154_
							&& ((anIntArrayArray546[i_152_][i_157_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i != 1) {
					if (i != 2) {
						if (i == 3) {
							if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_154_ == -i_149_ + i_151_) {
								boolean bool = true;
								return bool;
							}
							if (-i_149_ + i_152_ == i_153_ && i_154_ <= i_151_ && i_151_ <= i_157_
									&& (anIntArrayArray546[i_156_][i_151_] & 0x12c0108) == 0) {
								boolean bool = true;
								return bool;
							}
							if (i_152_ + 1 == i_153_ && i_154_ <= i_151_ && i_151_ <= i_157_
									&& (anIntArrayArray546[i_153_][i_151_] & 0x12c0180) == 0) {
								boolean bool = true;
								return bool;
							}
						}
					} else {
						if (i_153_ == i_152_ + 1 && i_151_ >= i_154_ && i_151_ <= i_157_) {
							boolean bool = true;
							return bool;
						}
						if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_151_ + 1 == i_154_
								&& (anIntArrayArray546[i_152_][i_154_] & 0x12c0120) == 0) {
							boolean bool = true;
							return bool;
						}
						if (i_152_ >= i_153_ && i_152_ <= i_156_ && i_151_ - i_149_ == i_154_
								&& (anIntArrayArray546[i_152_][i_157_] & 0x12c0102) == 0) {
							boolean bool = true;
							return bool;
						}
					}
				} else {
					if (i_153_ <= i_152_ && i_156_ >= i_152_ && i_154_ == i_151_ + 1) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == -i_149_ + i_152_ && i_151_ >= i_154_ && i_151_ <= i_157_
							&& ((anIntArrayArray546[i_156_][i_151_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ + 1 && i_154_ <= i_151_ && i_151_ <= i_157_
							&& ((anIntArrayArray546[i_153_][i_151_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_150_ == 2) {
				if (i == 0) {
					if (i_152_ - i_149_ == i_153_ && i_154_ <= i_151_ && i_151_ <= i_157_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_151_ + 1 == i_154_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ + 1 && i_154_ <= i_151_ && i_157_ >= i_151_
							&& ((anIntArrayArray546[i_153_][i_151_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_152_ <= i_156_ && i_151_ - i_149_ == i_154_
							&& ((anIntArrayArray546[i_152_][i_157_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 1) {
					if (i_153_ == i_152_ - i_149_ && i_151_ >= i_154_ && i_151_ <= i_157_
							&& ((anIntArrayArray546[i_156_][i_151_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ <= i_152_ && i_156_ >= i_152_ && i_154_ == i_151_ + 1) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_151_ >= i_154_ && i_151_ <= i_157_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_152_ <= i_156_ && i_154_ == -i_149_ + i_151_
							&& ((anIntArrayArray546[i_152_][i_157_] & 0x12c0102) == 0)) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 2) {
					if (i_153_ == i_152_ - i_149_ && i_151_ >= i_154_ && i_157_ >= i_151_
							&& ((anIntArrayArray546[i_156_][i_151_] & 0x12c0108) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_154_ == i_151_ + 1
							&& ((anIntArrayArray546[i_152_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ == i_152_ + 1 && i_154_ <= i_151_ && i_157_ >= i_151_) {
						boolean bool = true;
						return bool;
					}
					if (i_153_ <= i_152_ && i_156_ >= i_152_ && i_151_ - i_149_ == i_154_) {
						boolean bool = true;
						return bool;
					}
				} else if (i == 3) {
					if (i_153_ == i_152_ - i_149_ && i_151_ >= i_154_ && i_151_ <= i_157_) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_152_ <= i_156_ && i_154_ == i_151_ + 1
							&& ((anIntArrayArray546[i_152_][i_154_] & 0x12c0120) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ + 1 == i_153_ && i_154_ <= i_151_ && i_151_ <= i_157_
							&& ((anIntArrayArray546[i_153_][i_151_] & 0x12c0180) == 0)) {
						boolean bool = true;
						return bool;
					}
					if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_154_ == i_151_ - i_149_) {
						boolean bool = true;
						return bool;
					}
				}
			}
			if (i_150_ == 9) {
				if (i_152_ >= i_153_ && i_156_ >= i_152_ && i_151_ + 1 == i_154_
						&& (anIntArrayArray546[i_152_][i_154_] & 0x12c0120) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_153_ <= i_152_ && i_156_ >= i_152_ && -i_149_ + i_151_ == i_154_
						&& (anIntArrayArray546[i_152_][i_157_] & 0x12c0102) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_153_ == -i_149_ + i_152_ && i_154_ <= i_151_ && i_151_ <= i_157_
						&& (anIntArrayArray546[i_156_][i_151_] & 0x12c0108) == 0) {
					boolean bool = true;
					return bool;
				}
				if (i_153_ == i_152_ + 1 && i_154_ <= i_151_ && i_151_ <= i_157_
						&& (anIntArrayArray546[i_153_][i_151_] & 0x12c0180) == 0) {
					boolean bool = true;
					return bool;
				}
			}
		}
		if (i_155_ != 18288) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public void method1077(int i, int i_158_, boolean bool, int i_159_, int i_160_, int i_161_) {
		i_160_ -= anInt545;
		if (i_158_ != -1)
			method1074(96, -126);
		i_161_ -= anInt532;
		if (i == 0) {
			if (i_159_ == 0) {
				method1083(128, i_161_, (byte) 99, i_160_);
				method1083(8, i_161_ - 1, (byte) 88, i_160_);
			}
			if (i_159_ == 1) {
				method1083(2, i_161_, (byte) 111, i_160_);
				method1083(32, i_161_, (byte) 92, i_160_ + 1);
			}
			if (i_159_ == 2) {
				method1083(8, i_161_, (byte) 100, i_160_);
				method1083(128, i_161_ + 1, (byte) 115, i_160_);
			}
			if (i_159_ == 3) {
				method1083(32, i_161_, (byte) 103, i_160_);
				method1083(2, i_161_, (byte) 94, i_160_ - 1);
			}
		}
		if (i == 1 || i == 3) {
			if (i_159_ == 0) {
				method1083(1, i_161_, (byte) 96, i_160_);
				method1083(16, i_161_ - 1, (byte) 73, i_160_ + 1);
			}
			if (i_159_ == 1) {
				method1083(4, i_161_, (byte) 99, i_160_);
				method1083(64, i_161_ + 1, (byte) 127, i_160_ + 1);
			}
			if (i_159_ == 2) {
				method1083(16, i_161_, (byte) 116, i_160_);
				method1083(1, i_161_ + 1, (byte) 109, i_160_ - 1);
			}
			if (i_159_ == 3) {
				method1083(64, i_161_, (byte) 109, i_160_);
				method1083(4, i_161_ - 1, (byte) 74, i_160_ - 1);
			}
		}
		if (i == 2) {
			if (i_159_ == 0) {
				method1083(130, i_161_, (byte) 118, i_160_);
				method1083(8, i_161_ - 1, (byte) 103, i_160_);
				method1083(32, i_161_, (byte) 92, i_160_ + 1);
			}
			if (i_159_ == 1) {
				method1083(10, i_161_, (byte) 80, i_160_);
				method1083(32, i_161_, (byte) 112, i_160_ + 1);
				method1083(128, i_161_ + 1, (byte) 99, i_160_);
			}
			if (i_159_ == 2) {
				method1083(40, i_161_, (byte) 120, i_160_);
				method1083(128, i_161_ + 1, (byte) 81, i_160_);
				method1083(2, i_161_, (byte) 98, i_160_ - 1);
			}
			if (i_159_ == 3) {
				method1083(160, i_161_, (byte) 85, i_160_);
				method1083(2, i_161_, (byte) 103, i_160_ - 1);
				method1083(8, i_161_ - 1, (byte) 89, i_160_);
			}
		}
		if (bool) {
			if (i == 0) {
				if (i_159_ == 0) {
					method1083(65536, i_161_, (byte) 125, i_160_);
					method1083(4096, i_161_ - 1, (byte) 96, i_160_);
				}
				if (i_159_ == 1) {
					method1083(1024, i_161_, (byte) 80, i_160_);
					method1083(16384, i_161_, (byte) 118, i_160_ + 1);
				}
				if (i_159_ == 2) {
					method1083(4096, i_161_, (byte) 96, i_160_);
					method1083(65536, i_161_ + 1, (byte) 77, i_160_);
				}
				if (i_159_ == 3) {
					method1083(16384, i_161_, (byte) 80, i_160_);
					method1083(1024, i_161_, (byte) 80, i_160_ - 1);
				}
			}
			if (i == 1 || i == 3) {
				if (i_159_ == 0) {
					method1083(512, i_161_, (byte) 110, i_160_);
					method1083(8192, i_161_ - 1, (byte) 105, i_160_ + 1);
				}
				if (i_159_ == 1) {
					method1083(2048, i_161_, (byte) 117, i_160_);
					method1083(32768, i_161_ + 1, (byte) 77, i_160_ + 1);
				}
				if (i_159_ == 2) {
					method1083(8192, i_161_, (byte) 104, i_160_);
					method1083(512, i_161_ + 1, (byte) 77, i_160_ - 1);
				}
				if (i_159_ == 3) {
					method1083(32768, i_161_, (byte) 127, i_160_);
					method1083(2048, i_161_ - 1, (byte) 100, i_160_ - 1);
				}
			}
			if (i == 2) {
				if (i_159_ == 0) {
					method1083(66560, i_161_, (byte) 78, i_160_);
					method1083(4096, i_161_ - 1, (byte) 105, i_160_);
					method1083(16384, i_161_, (byte) 104, i_160_ + 1);
				}
				if (i_159_ == 1) {
					method1083(5120, i_161_, (byte) 78, i_160_);
					method1083(16384, i_161_, (byte) 82, i_160_ + 1);
					method1083(65536, i_161_ + 1, (byte) 126, i_160_);
				}
				if (i_159_ == 2) {
					method1083(20480, i_161_, (byte) 88, i_160_);
					method1083(65536, i_161_ + 1, (byte) 103, i_160_);
					method1083(1024, i_161_, (byte) 88, i_160_ - 1);
				}
				if (i_159_ == 3) {
					method1083(81920, i_161_, (byte) 107, i_160_);
					method1083(1024, i_161_, (byte) 81, i_160_ - 1);
					method1083(4096, i_161_ - 1, (byte) 109, i_160_);
				}
			}
		}
	}

	public boolean method1078(int i, int i_162_, int i_163_, int i_164_, byte i_165_, int i_166_, int i_167_,
			int i_168_, int i_169_) {
		if (i_168_ > 1) {
			if (method1079(i_168_, i_163_, i_162_, i_169_, i_167_, i, i_166_, i_168_, (byte) -84)) {
				boolean bool = true;
				return bool;
			}
			boolean bool = method1063(i_169_, i_167_, i_166_, i_164_, 2, i_168_, i, i_162_, i_168_, i_163_);
			return bool;
		}
		int i_170_ = i_166_ - 1 + i_169_;
		int i_171_ = i_162_ - 1 + i_167_;
		if (i_163_ >= i_166_ && i_163_ <= i_170_ && i >= i_167_ && i <= i_171_) {
			boolean bool = true;
			return bool;
		}
		if (i_166_ - 1 == i_163_ && i_167_ <= i && i_171_ >= i
				&& ((anIntArrayArray546[-anInt532 + i_163_][i - anInt545] & 0x8) == 0) && (i_164_ & 0x8) == 0) {
			boolean bool = true;
			return bool;
		}
		if (i_170_ + 1 == i_163_ && i >= i_167_ && i <= i_171_
				&& ((anIntArrayArray546[-anInt532 + i_163_][i - anInt545] & 0x80) == 0) && (i_164_ & 0x2) == 0) {
			boolean bool = true;
			return bool;
		}
		if (i_165_ != -63) {
			boolean bool = false;
			return bool;
		}
		if (i == i_167_ - 1 && i_166_ <= i_163_ && i_170_ >= i_163_
				&& ((anIntArrayArray546[-anInt532 + i_163_][-anInt545 + i] & 0x2) == 0) && (i_164_ & 0x4) == 0) {
			boolean bool = true;
			return bool;
		}
		if (i == i_171_ + 1 && i_163_ >= i_166_ && i_170_ >= i_163_
				&& ((anIntArrayArray546[-anInt532 + i_163_][i - anInt545] & 0x20) == 0) && (i_164_ & 0x1) == 0) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public boolean method1079(int i, int i_172_, int i_173_, int i_174_, int i_175_, int i_176_, int i_177_, int i_178_,
			byte i_179_) {
		if (i_179_ >= 0) {
			boolean bool = false;
			return bool;
		}
		if (i_177_ + i_174_ <= i_172_ || i_177_ >= i_178_ + i_172_) {
			boolean bool = false;
			return bool;
		}
		if (i_176_ >= i_175_ + i_173_ || i + i_176_ <= i_175_) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public void method1080(int i, int i_180_, int i_181_) {
		i -= anInt532;
		i_181_ -= anInt545;
		anIntArrayArray546[i][i_181_] = Class66.method1294(anIntArrayArray546[i][i_181_], 2097152);
		if (i_180_ > -57)
			anIntArrayArray546 = null;
	}

	public Class32(int i, int i_182_) {
		anInt548 = i;
		anInt562 = i_182_;
		anInt532 = 0;
		anIntArrayArray546 = new int[anInt548][anInt562];
		method1071(true);
	}

	public static void method1081(byte i) {
		int i_183_ = -85 % ((45 - i) / 41);
		try {
			if (Static2.aClass104_4037 == null)
				Static2.aClass104_4037 = new Class104(ErrorReporting.signlink,
						JunkTex
								.method515((new Class124[] { Class86.method1419((byte) 127), Class59.aClass124_958 }),
										(byte) -103)
								.method1676((byte) -52));
		} catch (Exception exception) {
			exception.printStackTrace();
			Static2.aClass104_4037 = null;
		}
	}

	public static void method1082(int i, int i_184_, int i_185_) {
		int[] is = new int[4];
		int i_186_ = 125 % ((i_185_ + 29) / 60);
		is[0] = i;
		int[] is_187_ = new int[4];
		int i_188_ = 1;
		is_187_[0] = i_184_;
		for (int i_189_ = 0; i_189_ < 4; i_189_++) {
			if (Static2.anIntArray1086[i_189_] != i) {
				is[i_188_] = Static2.anIntArray1086[i_189_];
				is_187_[i_188_] = Class45.anIntArray737[i_189_];
				i_188_++;
			}
		}
		Class45.anIntArray737 = is_187_;
		Static2.anIntArray1086 = is;
		Class14_Sub2_Sub11.method309(SceneGraphNode_GameEntity.aClass45Array3435, (SceneGraphNode_GameEntity.aClass45Array3435.length - 1),
				(byte) 99, 0);
	}

	public void method1083(int i, int i_190_, byte i_191_, int i_192_) {
		if (i_191_ <= 69)
			method1069(114, -21, 84);
		anIntArrayArray546[i_190_][i_192_] = JunkTex.method617(anIntArrayArray546[i_190_][i_192_],
				i ^ 0xffffffff);
	}
}
