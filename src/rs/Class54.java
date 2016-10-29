/* Class54 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9;

public class Class54 {
	public static volatile boolean aBoolean877 = false;
	public static boolean aBoolean879 = true;
	public static int anInt880;
	public static boolean aBoolean881 = false;
	public static Class124 aClass124_883 = Class124.method263(1178, ")3google)3com");
	public static Class9 aClass9_885;
	public static Class124 aClass124_886 = Class124.method263(1178, " )2> ");
	public static int anInt887 = 0;
	public static Class87 aClass87_888;

	public static Class124 method1217(Class94 class94, int i) {
		if (i > -97)
			method1218(-119, -82, -81);
		if (Class44.method1158(client.method46(class94), false) == 0) {
			Class124 class124 = null;
			return class124;
		}
		if (class94.aClass124_1589 == null || (class94.aClass124_1589.method1684((byte) 9).method1693(0) == 0)) {
			if (JunkTex.aBoolean3392) {
				Class124 class124 = JunkTex.aClass124_4607;
				return class124;
			}
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = class94.aClass124_1589;
		return class124;
	}

	public static void method1218(int i, int i_0_, int i_1_) {
		if (JunkTex.anInt4729 >= 2 || Class51.anInt831 != 0 || Class14_Sub4.aBoolean2784) {
			Class124 class124;
			if (Class51.anInt831 != 1 || JunkTex.anInt4729 >= 2) {
				if (!Class14_Sub4.aBoolean2784 || JunkTex.anInt4729 >= 2)
					class124 = Static2.method1170((byte) -99, JunkTex.anInt4729 - 1);
				else
					class124 = (JunkTex.method515((new Class124[] { JunkTex.aClass124_2082,
							Class104.aClass124_1736, Class17.aClass124_408, JunkTex.aClass124_4165 }),
							(byte) -42));
			} else
				class124 = JunkTex
						.method515(
								(new Class124[] { Class40.aClass124_665, Class104.aClass124_1736,
										(JunkTex.aClass124_2809), (JunkTex.aClass124_4165) }),
								(byte) -41);
			if (JunkTex.anInt4729 > 2)
				class124 = (JunkTex.method515((new Class124[] { class124, Class115.aClass124_1906,
						Class83.method1407(81, (JunkTex.anInt4729 - 2)),
						Static2.aClass124_3948 }), (byte) -83));
			int i_2_ = (Class133_Sub3.aClass14_Sub2_Sub16_3567.method350(class124, i + 4, i_1_ + 15, 16777215, 0,
					Class104.aRandom1732, Class32.anInt563));
			if (i_0_ > -44)
				method1220(-54, true, false, -79);
			Class14_Sub13.method862(124, i_2_ + Class133_Sub3.aClass14_Sub2_Sub16_3567.method361(class124), 15, i_1_,
					i + 4);
		}
	}

	public static void method1219(int i) {
		aClass124_886 = null;
		aClass87_888 = null;
		aClass124_883 = null;
		if (i > 38)
			aClass9_885 = null;
	}

	public static Class124 method1220(int i, boolean bool, boolean bool_3_, int i_4_) {
		if (i_4_ < 2 || i_4_ > 36)
			throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(i_4_).toString());
		int i_5_ = i / i_4_;
		int i_6_ = 1;
		while (i_5_ != 0) {
			i_5_ /= i_4_;
			i_6_++;
		}
		int i_7_ = i_6_;
		if (i < 0 || bool_3_)
			i_7_++;
		byte[] is = new byte[i_7_];
		if (i < 0)
			is[0] = (byte) 45;
		else if (bool_3_)
			is[0] = (byte) 43;
		for (int i_8_ = 0; i_6_ > i_8_; i_8_++) {
			int i_9_ = i % i_4_;
			i /= i_4_;
			if (i_9_ < 0)
				i_9_ = -i_9_;
			if (i_9_ > 9)
				i_9_ += 39;
			is[-i_8_ + i_7_ - 1] = (byte) (i_9_ + 48);
		}
		Class124 class124 = new Class124();
		class124.anInt2507 = i_7_;
		class124.aByteArray2495 = is;
		if (!bool)
			aClass124_886 = null;
		Class124 class124_10_ = class124;
		return class124_10_;
	}

	public static void method1221(int i, boolean bool, int i_11_) {
		if (!bool)
			method1220(-109, false, false, -28);
		for (int i_12_ = 0; Class131.anInt2159 > i_12_; i_12_++) {
			Class150 class150 = Class97.method1489(i_12_, -9810);
			if (class150 != null) {
				int i_13_ = class150.anInt2414;
				if (i_13_ >= 0 && !Class3.anInterface3_117.method13(0, i_13_))
					i_13_ = -1;
				int i_14_;
				if (class150.anInt2405 < 0) {
					if (i_13_ >= 0)
						i_14_ = (Class3.anIntArray119[(Class7_Sub3_Sub1.method135(false, 96,
								Class3.anInterface3_117.method5(i_13_, (byte) -113)))]);
					else if (class150.anInt2411 != -1) {
						int i_15_ = class150.anInt2411;
						int i_16_ = i + (i_15_ & 0x7f);
						if (i_16_ < 0)
							i_16_ = 0;
						else if (i_16_ > 127)
							i_16_ = 127;
						int i_17_ = (i_16_ + (i_15_ & 0x380) + (i_15_ + i_11_ & 0xfc00));
						i_14_ = (Class3.anIntArray119[Class7_Sub3_Sub1.method135(false, 96, i_17_)]);
					} else
						i_14_ = -1;
				} else {
					int i_18_ = class150.anInt2405;
					int i_19_ = i + (i_18_ & 0x7f);
					if (i_19_ < 0)
						i_19_ = 0;
					else if (i_19_ > 127)
						i_19_ = 127;
					int i_20_ = i_19_ + (i_11_ + i_18_ & 0xfc00) + (i_18_ & 0x380);
					i_14_ = (Class3.anIntArray119[Class7_Sub3_Sub1.method135(false, 96, i_20_)]);
				}
				Class56.anIntArray917[i_12_ + 1] = i_14_;
			}
		}
	}
}
