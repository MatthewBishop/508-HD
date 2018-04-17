/* Class17 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class17 {
	public static Class124 aClass124_398;
	public static Class124 aClass124_399 = Class124.method263(1178, "Checking for updates )2 ");
	public static int[] anIntArray400;
	public static int[] spriteWidths;
	public static Class124 aClass124_403 = Class124.method263(1178, "compass");
	public static Class124 aClass124_405;
	public static Class124 aClass124_408;
	public static long aLong410;

	static {
		anIntArray400 = new int[1000];
		aClass124_405 = aClass124_399;
		aClass124_398 = Class124.method263(1178, "<col=ffffff>");
		aClass124_408 = null;
		aLong410 = 0L;
	}

	public static void method956(boolean bool) {
		Class141 class141 = JunkTex.aClass141_4239;
		synchronized (class141) {
			Class86.anInt1385++;
			Class14_Sub9_Sub3.anInt4850 = JunkTex.anInt4436;
			if (Class120.anInt2014 >= 0) {
				while (Class120.anInt2014 != JunkTex.anInt4146) {
					int i = (JunkTex.anIntArray4139[JunkTex.anInt4146]);
					JunkTex.anInt4146 = JunkTex.anInt4146 + 1 & 0x7f;
					if (i < 0)
						JunkTex.aBooleanArray4581[i ^ 0xffffffff] = false;
					else
						JunkTex.aBooleanArray4581[i] = true;
				}
			} else {
				for (int i = 0; i < 112; i++)
					JunkTex.aBooleanArray4581[i] = false;
				Class120.anInt2014 = JunkTex.anInt4146;
			}
			JunkTex.anInt4436 = Class7_Sub3.anInt2682;
		}
	}

	public static void method957(byte i) {
		for (int i_0_ = -1; i_0_ < Static2.anInt2878; i_0_++) {
			int i_1_;
			if (i_0_ == -1)
				i_1_ = 2047;
			else
				i_1_ = Static2.anIntArray351[i_0_];
			Class133_Sub1_Sub1 class133_sub1_sub1 = JunkTex.aClass133_Sub1_Sub1Array4474[i_1_];
			if (class133_sub1_sub1 != null)
				JunkTex.method637(class133_sub1_sub1, class133_sub1_sub1.anInt3493, -116);
		}
		if (i >= -41)
			method958((byte) -58, -94);
	}

	public static Class14_Sub2_Sub2 method958(byte i, int i_2_) {
		Class14_Sub2_Sub2 class14_sub2_sub2 = ((Class14_Sub2_Sub2) Static2.aClass20_5081
				.get(i_2_));
		if (class14_sub2_sub2 != null) {
			Class14_Sub2_Sub2 class14_sub2_sub2_3_ = class14_sub2_sub2;
			return class14_sub2_sub2_3_;
		}
		byte[] is = Static2.aClass9_367.method163(i_2_, 11, 0);
		int i_4_ = -45 / ((-70 - i) / 53);
		Class14_Sub2_Sub2 class14_sub2_sub2_5_ = new Class14_Sub2_Sub2();
		if (is != null)
			class14_sub2_sub2_5_.method265(0, new Buffer(is));
		Static2.aClass20_5081.put(class14_sub2_sub2_5_, i_2_);
		Class14_Sub2_Sub2 class14_sub2_sub2_6_ = class14_sub2_sub2_5_;
		return class14_sub2_sub2_6_;
	}

	public static void method959(int i) {
		spriteWidths = null;
		aClass124_405 = null;
		aClass124_408 = null;
		aClass124_398 = null;
		aClass124_403 = null;
		anIntArray400 = null;
		aClass124_399 = null;
		if (i != -1)
			method958((byte) 56, 36);
	}

	public static Class14_Sub2_Sub20 method960(int i, int i_7_) {
		Class14_Sub2_Sub20 class14_sub2_sub20 = ((Class14_Sub2_Sub20) Class14_Sub17.aClass20_3018.get(i_7_));
		if (class14_sub2_sub20 != null) {
			Class14_Sub2_Sub20 class14_sub2_sub20_8_ = class14_sub2_sub20;
			return class14_sub2_sub20_8_;
		}
		if (i != 24205)
			aClass124_399 = null;
		byte[] is = Static2.aClass9_1084.method163(i_7_, 5, i - 24205);
		Class14_Sub2_Sub20 class14_sub2_sub20_9_ = new Class14_Sub2_Sub20();
		if (is != null)
			class14_sub2_sub20_9_.method429(96, new Buffer(is));
		Class14_Sub17.aClass20_3018.put(class14_sub2_sub20_9_, i_7_);
		Class14_Sub2_Sub20 class14_sub2_sub20_10_ = class14_sub2_sub20_9_;
		return class14_sub2_sub20_10_;
	}
}
