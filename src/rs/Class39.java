/* Class39 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.IOException;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.rt4.Class14_Sub27;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Static;

public abstract class Class39 {
	public static int anInt660 = 0;
	public static Class124 aClass124_661 = Class14_Sub2_Sub2.method263(1178, "::clientdrop");

	public static void method1119(int i) {
		if (i < 66)
			method1121(null, 71);
		aClass124_661 = null;
	}

	public static void method1120(int i, byte i_0_, int i_1_, int i_2_, int i_3_) {
		int i_4_ = 87 % ((i_0_ - 26) / 43);
		if (Class118.anInt1982 > i_2_ - i_3_ || Class14_Sub8_Sub14.anInt4327 < i_2_ + i_3_
				|| i_1_ - i_3_ < Class14_Sub17.anInt3005 || Class59.anInt955 < i_3_ + i_1_)
			Class127.method1751(i, (byte) -66, i_2_, i_1_, i_3_);
		else
			Static2.method247((byte) -127, i_3_, i_2_, i_1_, i);
	}

	public static byte[] method1121(byte[] is, int i) {
		if (is == null) {
			byte[] is_5_ = null;
			return is_5_;
		}
		if (i != 24) {
			byte[] is_6_ = null;
			return is_6_;
		}
		byte[] is_7_ = new byte[is.length];
		Class72.method1322(is, 0, is_7_, 0, is.length);
		byte[] is_8_ = is_7_;
		return is_8_;
	}

	public static Class14_Sub27 method1122(HashTable hashTable, int i, Class150 class150) {
		int i_9_ = 62 % ((29 - i) / 52);
		long l = (((long) class150.anInt2416 << 56) - -((long) class150.anInt2426 << 32)
				- (long) (-(class150.anInt2414 + 1 << 48) - class150.anInt2424));
		Class14_Sub27 class14_sub27 = (Class14_Sub27) hashTable.get(l);
		if (class14_sub27 == null) {
			class14_sub27 = new Class14_Sub27(class150.anInt2414, (float) class150.anInt2424, true, false,
					class150.anInt2426);
			hashTable.put(l, class14_sub27);
		}
		Class14_Sub27 class14_sub27_10_ = class14_sub27;
		return class14_sub27_10_;
	}

	public abstract Class14_Sub2_Sub18 method1123(Class14_Sub2_Sub18 class14_sub2_sub18, int i);

	public static void method1124(int i) {
		Class36.aClass52_621.method1209((byte) -96);
		if (i > 95)
			Class70.aClass52_1079.method1209((byte) -96);
	}

	public static void method1125(Buffer class14_sub10, byte i) {
		byte[] is = new byte[24];
		if (i != -108)
			method1119(-6);
		if (Class14_Sub2_Sub17.aClass76_4022 != null) {
			try {
				int i_11_ = 0;
				Class14_Sub2_Sub17.aClass76_4022.method1361(i ^ ~0x6b, 0L);
				Class14_Sub2_Sub17.aClass76_4022.method1366((byte) -33, is);
				for (/**/; i_11_ < 24 && is[i_11_] == 0; i_11_++) {
					/* empty */
				}
				if (i_11_ >= 24)
					throw new IOException();
			} catch (Exception exception) {
				for (int i_12_ = 0; i_12_ < 24; i_12_++)
					is[i_12_] = (byte) -1;
			}
		}
		class14_sub10.method807(24, is, 0, -1076444960);
	}

	public static void method1126(byte i) {
		if (Class37.anInt644 < 0) {
			Static.anInt427 = -1;
			Class37.anInt644 = 0;
			Class14_Sub18.anInt3050 = -1;
		}
		if (Class14_Sub2_Sub9.anInt3856 < Class37.anInt644) {
			Class37.anInt644 = Class14_Sub2_Sub9.anInt3856;
			Class14_Sub18.anInt3050 = -1;
			Static.anInt427 = -1;
		}
		if (Class133_Sub6.anInt3659 < 0) {
			Static.anInt427 = -1;
			Class14_Sub18.anInt3050 = -1;
			Class133_Sub6.anInt3659 = 0;
		}
		if (Class14_Sub8_Sub15.anInt4332 < Class133_Sub6.anInt3659) {
			Class133_Sub6.anInt3659 = Class14_Sub8_Sub15.anInt4332;
			Static.anInt427 = -1;
			Class14_Sub18.anInt3050 = -1;
		}
		if (i != -22)
			aClass124_661 = null;
	}
}
