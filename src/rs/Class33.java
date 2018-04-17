/* Class33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;

public class Class33 {
	public static int[][] anIntArrayArray575 = new int[104][104];
	public static int anInt577;
	public static Class124 aClass124_578 = Class124.method263(1178, "");
	public static Class9 aClass9_579;
	public static short[] aShortArray580;
	public static Deque aClass2_583;
	public static boolean aBoolean584 = true;
	public static Class14_Sub9_Sub2 aClass14_Sub9_Sub2_585;
	public static int anInt586;

	static {
		aClass2_583 = new Deque();
	}

	public static void method1084(byte i) {
		if (JunkTex.anInt102 < 128)
			JunkTex.anInt102 = 128;
		JunkTex.anInt4408 &= 0x7ff;
		if (JunkTex.anInt102 > 383)
			JunkTex.anInt102 = 383;
		int i_0_ = JunkTex.anInt905 >> 7;
		int i_1_ = Class140.anInt2238 >> 39;
		int i_2_ = JunkTex.method1017(Class140.anInt2238, Class14_Sub2_Sub3.gameLevel, (byte) 90, JunkTex.anInt905);
		int i_3_ = 0;
		if (i_1_ > 3 && i_0_ > 3 && i_1_ < 100 && i_0_ < 100) {
			for (int i_4_ = i_1_ - 4; i_1_ + 4 >= i_4_; i_4_++) {
				for (int i_5_ = i_0_ - 4; i_0_ + 4 >= i_5_; i_5_++) {
					int i_6_ = Class14_Sub2_Sub3.gameLevel;
					if (i_6_ < 3 && (JunkTex.tileFlags[1][i_4_][i_5_] & 0x2) == 2)
						i_6_++;
					int i_7_ = -Class114.tileHeights[i_6_][i_4_][i_5_] + i_2_;
					if (i_7_ > i_3_)
						i_3_ = i_7_;
				}
			}
		}
		int i_8_ = i_3_ * 192;
		if (i_8_ > 98048)
			i_8_ = 98048;
		if (i_8_ < 32768)
			i_8_ = 32768;
		if (JunkTex.anInt4740 >= i_8_) {
			if (i_8_ < JunkTex.anInt4740)
				JunkTex.anInt4740 += (i_8_ - JunkTex.anInt4740) / 80;
		} else
			JunkTex.anInt4740 += (-JunkTex.anInt4740 + i_8_) / 24;
	}

	public static void method1085(int i) {
		aShortArray580 = null;
		if (i != 108956743)
			method1084((byte) 52);
		aClass2_583 = null;
		aClass14_Sub9_Sub2_585 = null;
		anIntArrayArray575 = null;
		aClass124_578 = null;
		aClass9_579 = null;
	}

	public static Class14_Sub2_Sub16 method1086(byte[] is, int i) {
		if (i != 24)
			aBoolean584 = false;
		if (is == null) {
			Class14_Sub2_Sub16 class14_sub2_sub16 = null;
			return class14_sub2_sub16;
		}
		Class14_Sub2_Sub16_Sub2 class14_sub2_sub16_sub2 = new Class14_Sub2_Sub16_Sub2(is, Class40.spriteXOffsets,
				Class14_Sub2_Sub12.spriteYOffsets, Class17.spriteWidths, Class76.spriteHeights,
				Class12.spritePaletteIndicators);
		Class129.method1761((byte) 5);
		Class14_Sub2_Sub16_Sub2 class14_sub2_sub16_sub2_9_ = class14_sub2_sub16_sub2;
		return class14_sub2_sub16_sub2_9_;
	}

	public static void method1087(int i, int i_10_, boolean bool, int i_11_, Class9 class9, int i_12_) {
		JunkTex.anInt3930 = i_10_;
		if (i != 1936)
			anIntArrayArray575 = null;
		Class14_Sub2_Sub11.anInt3889 = 1;
		JunkTex.anInt1132 = i_12_;
		Class35.aBoolean593 = bool;
		Class14_Sub15.anInt2989 = 10000;
		Static2.aClass9_2696 = class9;
		Class38.anInt2624 = i_11_;
	}

	public static void method1088(byte i) {
		Class132.aClass55_2167 = new HashTable(32);
		if (i != 127)
			method1088((byte) -62);
	}
}
