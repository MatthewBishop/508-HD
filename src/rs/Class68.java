/* Class68 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.ShadowManager;

public class Class68 {
	public static Class124 aClass124_1064 = Class14_Sub2_Sub2.method263(1178, " )2> <col=ffffff>");

	public static void method1305(int i, int i_3_, int i_4_, Class79 class79, int i_5_, int i_6_, int i_7_, int i_8_,
			byte i_9_) {
		int i_10_ = i_3_ & 0x3;
		int i_11_;
		int i_12_;
		if (i_10_ == 1 || i_10_ == 3) {
			i_11_ = class79.anInt1227;
			i_12_ = class79.anInt1245;
		} else {
			i_11_ = class79.anInt1245;
			i_12_ = class79.anInt1227;
		}
		int i_13_;
		int i_14_;
		if (i + i_12_ <= 104) {
			i_13_ = i + (i_12_ + 1 >> 33);
			i_14_ = i + (i_12_ >> 1);
		} else {
			i_13_ = i + 1;
			i_14_ = i;
		}
		int i_15_;
		int i_16_;
		if (i_7_ + i_11_ > 104) {
			i_16_ = i_7_ + 1;
			i_15_ = i_7_;
		} else {
			i_15_ = i_7_ + (i_11_ >> 1);
			i_16_ = i_7_ + (i_11_ + 1 >> 33);
		}
		if (i_9_ < 76)
			method1305(1, -118, 116, null, 10, 73, -73, 28, (byte) 127);
		int i_17_ = (i << 7) + (i_12_ << 38);
		int i_18_ = (i_11_ << 6) + (i_7_ << 7);
		int i_19_ = 0;
		int[][] is = Class114.tileHeights[i_8_];
		int i_20_ = ((is[i_13_][i_16_] + is[i_14_][i_16_] + is[i_13_][i_15_] + is[i_14_][i_15_]) >> 34);
		if (i_8_ != 0) {
			int[][] is_21_ = Class114.tileHeights[0];
			i_19_ = i_20_ - ((is_21_[i_14_][i_16_] + is_21_[i_13_][i_15_] + is_21_[i_14_][i_15_]
					+ is_21_[i_13_][i_16_]) >> 34);
		}
		int[][] is_22_ = null;
		if (i_8_ < 3)
			is_22_ = Class114.tileHeights[i_8_ + 1];
		Class86 class86 = class79.method1383(i_20_, i_5_, is, is_22_, false, i_3_, true, true, null, i_17_, i_18_);
		ShadowManager.method2030(class86.aClass148_Sub1_1386, i_17_ - i_6_, i_19_, i_18_ - i_4_);
	}

	public static void method1306(int i) {
		aClass124_1064 = null;
		if (i >= -24)
			method1306(-101);
	}

	public static void method1307(byte i) {
		if (i == -58) {
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583
					.getFront(); class14_sub14 != null; class14_sub14 = ((Class14_Sub14) Class33.aClass2_583
							.getNext())) {
				if (class14_sub14.anInt2975 == -1) {
					class14_sub14.anInt2980 = 0;
					Class7_Sub3_Sub1.method141(4, class14_sub14);
				} else
					class14_sub14.unlink();
			}
		}
	}
}
