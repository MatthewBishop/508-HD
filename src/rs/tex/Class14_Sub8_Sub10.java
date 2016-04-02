/* Class14_Sub8_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.util.Random;

import com.jagex.io.Buffer;

import rs.Class112;
import rs.Class124;
import rs.Class132;
import rs.Class133_Sub5;
import rs.Class138;
import rs.Class14_Sub25;
import rs.Class14_Sub2_Sub17;
import rs.Class14_Sub2_Sub18_Sub2;
import rs.Class14_Sub2_Sub2;
import rs.Class72;

public class Class14_Sub8_Sub10 extends Class14_Sub8 {
	public static boolean aBoolean4245;
	public static boolean aBoolean4249;
	public static byte[][][] aByteArrayArrayArray4257;
	public static Class124 aClass124_4259 = Class14_Sub2_Sub2.method263(1178, "Lade Konfiguration )2 ");
	public static int anInt4251 = 0;
	public static int anInt4255 = 0;
	public static int[][] anIntArrayArray4261;
	static {
		aBoolean4249 = false;
		anIntArrayArray4261 = new int[5][5000];
		aBoolean4245 = false;
	}
	public static int method526(byte i, int i_0_, int i_1_) {
		int i_2_ = 57 / ((i + 55) / 62);
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_1_));
		if (class14_sub25 == null) {
			int i_3_ = -1;
			return i_3_;
		}
		if (i_0_ < 0 || class14_sub25.anIntArray3178.length <= i_0_) {
			int i_4_ = -1;
			return i_4_;
		}
		int i_5_ = class14_sub25.anIntArray3178[i_0_];
		return i_5_;
	}
	public static byte[] method527(int i, byte i_6_) {
		Class14_Sub2_Sub17 class14_sub2_sub17 = ((Class14_Sub2_Sub17) Class14_Sub2_Sub18_Sub2.aClass20_5073
				.get((long) i));
		if (i_6_ > -77)
			method528(24);
		if (class14_sub2_sub17 == null) {
			byte[] is = new byte[512];
			Random random = new Random((long) i);
			for (int i_7_ = 0; i_7_ < 255; i_7_++)
				is[i_7_] = (byte) i_7_;
			for (int i_8_ = 0; i_8_ < 255; i_8_++) {
				int i_9_ = -i_8_ + 255;
				int i_10_ = Class138.method1949(random, i_9_);
				byte i_11_ = is[i_10_];
				is[i_10_] = is[i_9_];
				is[i_9_] = is[-i_8_ + 511] = i_11_;
			}
			class14_sub2_sub17 = new Class14_Sub2_Sub17(is);
			Class14_Sub2_Sub18_Sub2.aClass20_5073.put(class14_sub2_sub17, (long) i);
		}
		byte[] is = class14_sub2_sub17.aByteArray4014;
		return is;
	}
	public static void method528(int i) {
		aClass124_4259 = null;
		if (i == 512) {
			anIntArrayArray4261 = null;
			aByteArrayArrayArray4257 = null;
		}
	}
	public int anInt4254 = 2048;

	public int anInt4258 = 10;

	public int anInt4263 = 0;

	public int[] anIntArray4252;

	public int[] anIntArray4253;

	public Class14_Sub8_Sub10() {
		super(0, true);
	}

	public void method472() {
		method529(255);
	}

	public void method475(int i, int i_12_, Buffer class14_sub10) {
		int i_13_ = i;
		while_88_: do {
			do {
				if (i_13_ != 0) {
					if (i_13_ != 1) {
						if (i_13_ == 2)
							break;
						break while_88_;
					}
				} else {
					anInt4258 = class14_sub10.method798();
					break while_88_;
				}
				anInt4254 = class14_sub10.method784((byte) 124);
				break while_88_;
			} while (false);
			anInt4263 = class14_sub10.method798();
		} while (false);
		if (i_12_ != 24777)
			aBoolean4249 = false;
	}

	public int[] method484(int i, byte i_14_) {
		int[] is = aClass149_2851.method2014(i, (byte) 121);
		if (i_14_ >= -58)
			anInt4258 = -19;
		if (aClass149_2851.aBoolean2402) {
			int i_15_ = Class133_Sub5.anIntArray3623[i];
			if (anInt4263 == 0) {
				int i_16_ = 0;
				for (int i_17_ = 0; i_17_ < anInt4258; i_17_++) {
					if (i_15_ >= anIntArray4253[i_17_] && i_15_ < anIntArray4253[i_17_ + 1]) {
						if (anIntArray4252[i_17_] > i_15_)
							i_16_ = 4096;
						break;
					}
				}
				Class72.method1324(is, 0, Class112.anInt1876, i_16_);
			} else {
				for (int i_18_ = 0; Class112.anInt1876 > i_18_; i_18_++) {
					int i_19_ = 0;
					int i_20_ = 0;
					int i_21_ = Class14_Sub8_Sub4.anIntArray4145[i_18_];
					int i_22_ = anInt4263;
					while_89_: do {
						do {
							if (i_22_ != 1) {
								if (i_22_ != 2) {
									if (i_22_ == 3)
										break;
									break while_89_;
								}
							} else {
								i_19_ = i_21_;
								break while_89_;
							}
							i_19_ = (i_21_ - (4096 - i_15_) >> 1) + 2048;
							break while_89_;
						} while (false);
						i_19_ = (-i_15_ + i_21_ >> 1) + 2048;
					} while (false);
					for (i_22_ = 0; anInt4258 > i_22_; i_22_++) {
						if (i_19_ >= anIntArray4253[i_22_] && i_19_ < anIntArray4253[i_22_ + 1]) {
							if (i_19_ < anIntArray4252[i_22_])
								i_20_ = 4096;
							break;
						}
					}
					is[i_18_] = i_20_;
				}
			}
		}
		int[] is_23_ = is;
		return is_23_;
	}

	public void method529(int i) {
		if (i == 255) {
			anIntArray4253 = new int[anInt4258 + 1];
			int i_24_ = 4096 / anInt4258;
			int i_25_ = 0;
			anIntArray4252 = new int[anInt4258 + 1];
			int i_26_ = anInt4254 * i_24_ >> 44;
			for (int i_27_ = 0; anInt4258 > i_27_; i_27_++) {
				anIntArray4253[i_27_] = i_25_;
				anIntArray4252[i_27_] = i_26_ + i_25_;
				i_25_ += i_24_;
			}
			anIntArray4253[anInt4258] = 4096;
			anIntArray4252[anInt4258] = anIntArray4252[0] + 4096;
		}
	}
}
