/* RuntimeException_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub27;

public class RuntimeException_Sub1 extends RuntimeException {
	public static Class124 aClass124_2455 = Class14_Sub2_Sub2.method263(1178, "Loading wordpack )2 ");
	public static Class124 aClass124_2456;
	public String aString2457;
	public static Class31 aClass31_2458;
	public static Class124[] aClass124Array2459;
	public Throwable aThrowable2461;
	public static Class124 aClass124_2462;
	public static int anInt2463 = 0;
	public static Class14_Sub27[][] aClass14_Sub27ArrayArray2464;
	public static Class124 aClass124_2466;

	static {
		aClass124Array2459 = new Class124[500];
		aClass124_2466 = Class14_Sub2_Sub2.method263(1178, "Connection lost)3");
		aClass124_2462 = aClass124_2466;
		aClass124_2456 = aClass124_2455;
	}

	public static void method2051(int i) {
		aClass124_2462 = null;
		aClass14_Sub27ArrayArray2464 = null;
		aClass124_2466 = null;
		aClass124_2456 = null;
		aClass124_2455 = null;
		if (i < -51) {
			aClass124Array2459 = null;
			aClass31_2458 = null;
		}
	}

	public static int method2052(byte i, int i_0_) {
		if (i_0_ >= 97 && i_0_ <= 122 || i_0_ >= 224 && i_0_ <= 254 && i_0_ != 247) {
			int i_1_ = i_0_ - 32;
			return i_1_;
		}
		if (i <= 108)
			aClass124_2456 = null;
		if (i_0_ == 255) {
			int i_2_ = 159;
			return i_2_;
		}
		if (i_0_ == 156) {
			int i_3_ = 140;
			return i_3_;
		}
		int i_4_ = i_0_;
		return i_4_;
	}

	public RuntimeException_Sub1(Throwable throwable, String string) {
		aThrowable2461 = throwable;
		aString2457 = string;
	}

	public static void method2053(Class32[] class32s, byte[] is, int i, boolean bool, int i_5_, boolean bool_6_,
			int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		Buffer class14_sub10 = new Buffer(is);
		int i_12_ = -1;
		if (!bool_6_) {
			for (;;) {
				int i_13_ = class14_sub10.method802(-85);
				if (i_13_ == 0)
					break;
				i_12_ += i_13_;
				int i_14_ = 0;
				for (;;) {
					int i_15_ = class14_sub10.method818((byte) -110);
					if (i_15_ == 0)
						break;
					i_14_ += i_15_ - 1;
					int i_16_ = (i_14_ & 0xfde) >> 6;
					int i_17_ = i_14_ & 0x3f;
					int i_18_ = i_14_ >> 12;
					int i_19_ = class14_sub10.readUByte();
					int i_20_ = i_19_ >> 2;
					int i_21_ = i_19_ & 0x3;
					if (i_5_ == i_18_ && i_9_ <= i_16_ && i_16_ < i_9_ + 8 && i_17_ >= i_11_ && i_17_ < i_11_ + 8) {
						Class79 class79 = Class79.method1377((byte) -106, i_12_);
						int i_22_ = (Static2.method1511(class79.anInt1227, -675459956, class79.anInt1245,
								i_16_ & 0x7, i_17_ & 0x7, i_21_, i) + i_7_);
						int i_23_ = (Class14_Sub2_Sub2.method266(i_16_ & 0x7, class79.anInt1245, class79.anInt1227,
								i_21_, i_17_ & 0x7, 7, i) + i_8_);
						if (i_22_ > 0 && i_23_ > 0 && i_22_ < 103 && i_23_ < 103) {
							Class32 class32 = null;
							if (!bool) {
								int i_24_ = i_10_;
								if (((JunkTex.tileFlags[1][i_22_][i_23_]) & 0x2) == 2)
									i_24_--;
								if (i_24_ >= 0)
									class32 = class32s[i_24_];
							}
							JunkTex.method1235(bool, i_21_ + i & 0x3, !bool, (byte) 50, class32, i_10_, i_23_, i_20_,
									i_22_, i_12_, i_10_);
						}
					}
				}
			}
		}
	}
}
