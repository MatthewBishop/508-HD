/* Class67 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Deque;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub2;

public class Class67 {
	public static Class97 aClass97_1055 = new Class97();
	public static int anInt1058 = 0;
	public static int anInt1059;
	public static Class94 aClass94_1060 = null;

	public static void method1298(int i) {
		aClass97_1055 = null;
		aClass94_1060 = null;
		if (i != -2)
			aClass94_1060 = null;
	}

	public static int method1299(int i, int i_0_, int i_1_, int i_2_) {
		i_0_ &= 0x3;
		if (i_1_ <= 71) {
			int i_3_ = 109;
			return i_3_;
		}
		if (i_0_ == 0) {
			int i_4_ = i_2_;
			return i_4_;
		}
		if (i_0_ == 1) {
			int i_5_ = 7 - i;
			return i_5_;
		}
		if (i_0_ == 2) {
			int i_6_ = -i_2_ + 7;
			return i_6_;
		}
		int i_7_ = i;
		return i_7_;
	}

	public static void method1300(int i, int i_8_, int i_9_) {
		Deque deque = (Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_9_][i]);
		if (deque == null)
			Class135.method1928(Class14_Sub2_Sub3.anInt3785, i_9_, i);
		else {
			int i_10_ = -99999999;
			Class14_Sub2_Sub4 class14_sub2_sub4 = null;
			for (Class14_Sub2_Sub4 class14_sub2_sub4_11_ = (Class14_Sub2_Sub4) deque.getFront(); class14_sub2_sub4_11_ != null; class14_sub2_sub4_11_ = (Class14_Sub2_Sub4) deque
							.getNext()) {
				Class142 class142 = JunkTex.method605(63,
						(class14_sub2_sub4_11_.aClass133_Sub3_3789.anInt3557));
				int i_12_ = class142.anInt2288;
				if (class142.anInt2309 == 1)
					i_12_ *= (class14_sub2_sub4_11_.aClass133_Sub3_3789.anInt3558 + 1);
				if (i_10_ < i_12_) {
					i_10_ = i_12_;
					class14_sub2_sub4 = class14_sub2_sub4_11_;
				}
			}
			if (class14_sub2_sub4 == null)
				Class135.method1928(Class14_Sub2_Sub3.anInt3785, i_9_, i);
			else {
				Class133_Sub3 class133_sub3 = null;
				if (i_8_ != 9210)
					anInt1059 = -106;
				deque.pushFront(class14_sub2_sub4);
				Class133_Sub3 class133_sub3_13_ = null;
				for (Class14_Sub2_Sub4 class14_sub2_sub4_14_ = (Class14_Sub2_Sub4) deque
						.getFront(); class14_sub2_sub4_14_ != null; class14_sub2_sub4_14_ = (Class14_Sub2_Sub4) deque
								.getNext()) {
					Class133_Sub3 class133_sub3_15_ = class14_sub2_sub4_14_.aClass133_Sub3_3789;
					if (class14_sub2_sub4.aClass133_Sub3_3789.anInt3557 != class133_sub3_15_.anInt3557) {
						if (class133_sub3 == null)
							class133_sub3 = class133_sub3_15_;
						if ((class133_sub3.anInt3557 != class133_sub3_15_.anInt3557) && class133_sub3_13_ == null)
							class133_sub3_13_ = class133_sub3_15_;
					}
				}
				long l = (long) ((i << 39) + (i_9_ + 1610612736));
				Canvas_Sub2.method61(Class14_Sub2_Sub3.anInt3785, i_9_, i,
						JunkTex.method1017(i_9_ * 128 + 64, (Class14_Sub2_Sub3.anInt3785), (byte) -119, i * 128 + 64),
						class14_sub2_sub4.aClass133_Sub3_3789, l, class133_sub3, class133_sub3_13_);
			}
		}
	}

	public static int method1301(byte i, int i_16_, int i_17_, int i_18_) {
		int i_19_ = -42 / ((i + 17) / 41);
		int i_20_ = i_17_ <= i_16_ ? i_18_ >= i_16_ ? i_16_ : i_18_ : i_17_;
		return i_20_;
	}

	public static Class14_Sub2_Sub19 method1302(boolean bool) {
		byte[] is = Class12.aByteArrayArray310[0];
		int i = Class17.anIntArray402[0] * Class76.anIntArray1204[0];
		int[] is_21_ = new int[i];
		if (bool) {
			Class14_Sub2_Sub19 class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		for (int i_22_ = 0; i_22_ < i; i_22_++)
			is_21_[i_22_] = (JunkTex.anIntArray1114[JunkTex.method617(is[i_22_], 255)]);
		Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2 = new Class14_Sub2_Sub19_Sub2(Class14_Sub11.anInt2952,
				Class14_Sub30.anInt3279, Class40.anIntArray675[0], Class14_Sub2_Sub12.anIntArray3918[0],
				Class17.anIntArray402[0], Class76.anIntArray1204[0], is_21_);
		Class129.method1761((byte) 12);
		Class14_Sub2_Sub19_Sub2 class14_sub2_sub19_sub2_23_ = class14_sub2_sub19_sub2;
		return class14_sub2_sub19_sub2_23_;
	}
}
