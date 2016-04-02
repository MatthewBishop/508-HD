/* Class109 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.rt4.Class14_Sub2_Sub19_Sub1;

import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub19;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Class14_Sub8_Sub7;
import rs.tex.Static;

public class Class109 {
	public int anInt1829;
	public int anInt1830;
	public static Class124 aClass124_1831 = Class14_Sub2_Sub2.method263(1178, "null");
	public int anInt1833;
	public static Class9_Sub1 aClass9_Sub1_1834;
	public static Class14_Sub2_Sub19_Sub1[] aClass14_Sub2_Sub19_Sub1Array1835;
	public static Class124 aClass124_1836 = Class14_Sub2_Sub2.method263(1178, ")3)3)3");
	public byte aByte1838;
	public static Class124 aClass124_1839 = Class14_Sub2_Sub2.method263(1178, "::fpsoff");
	public int anInt1841;
	public int anInt1845;

	public static void method1563(int i, int i_0_) {
		if (Class126.method1741((byte) 108, i)) {
			Class94[] class94s = Class1.aClass94ArrayArray75[i];
			int i_1_ = -41 % ((43 - i_0_) / 47);
			for (int i_2_ = 0; i_2_ < class94s.length; i_2_++) {
				Class94 class94 = class94s[i_2_];
				if (class94 != null) {
					class94.anInt1603 = 0;
					class94.anInt1610 = 0;
				}
			}
		}
	}

	public static boolean method1564(int i, int i_3_, int i_4_, Class9 class9) {
		byte[] is = class9.method163(i_3_, i_4_, i + 2);
		if (is == null) {
			boolean bool = false;
			return bool;
		}
		Class14_Sub9_Sub1.method708(is, i ^ ~0x91);
		if (i != -2)
			aClass9_Sub1_1834 = null;
		boolean bool = true;
		return bool;
	}

	public static Class14_Sub2_Sub19 method1565(int i, int i_5_, boolean bool, int i_6_, byte i_7_, int i_8_) {
		int i_9_ = (i << 17) + i_6_ - (-(bool ? 65536 : 0) - (i_8_ << 51));
		if (i_7_ > -35) {
			Class14_Sub2_Sub19 class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		int i_10_ = i_5_;
		long l = (long) i_10_ * 3147483667L - -((long) i_9_ * 3849834839L);
		Class14_Sub2_Sub19 class14_sub2_sub19 = ((Class14_Sub2_Sub19) Class70.aClass52_1077.method1210(l));
		if (class14_sub2_sub19 != null) {
			Class14_Sub2_Sub19 class14_sub2_sub19_11_ = class14_sub2_sub19;
			return class14_sub2_sub19_11_;
		}
		Class3.aBoolean103 = false;
		Class14_Sub2_Sub19 class14_sub2_sub19_12_ = Class49.method1194(false, i, i_6_, false, bool, i_5_, true, i_8_);
		if (class14_sub2_sub19_12_ != null && !Class3.aBoolean103)
			Class70.aClass52_1077.put(class14_sub2_sub19_12_, l);
		Class14_Sub2_Sub19 class14_sub2_sub19_13_ = class14_sub2_sub19_12_;
		return class14_sub2_sub19_13_;
	}

	public static void method1566(int i) {
		Class14_Sub23.anInt3134 = i;
		for (int i_14_ = 0; i_14_ < Class99_Sub2.anInt3338; i_14_++) {
			for (int i_15_ = 0; i_15_ < Class14_Sub8_Sub15.anInt4337; i_15_++) {
				if ((Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_14_][i_15_]) == null)
					Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i][i_14_][i_15_] = new Class14_Sub29(i, i_14_,
							i_15_);
			}
		}
	}

	public static void method1568(byte i) {
		Class14_Sub2_Sub12.anInt3912 = Class14_Sub8_Sub6.anInt4187;
		Static.method1032(false, -1291652884);
		Class14_Sub2_Sub8.method297((byte) -36);
		Static.method1328(Class14_Sub2_Sub12.anInt3912, true);
		Class14_Sub3.aClass133_Sub1_Sub1_2748 = new Class133_Sub1_Sub1();
		Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3436 = 3000;
		Class14_Sub3.aClass133_Sub1_Sub1_2748.anInt3495 = 3000;
		if (Class89.anInt1415 == 2) {
			Class133_Sub6.anInt3676 = Class123.anInt2062 - 48;
			Class14_Sub8_Sub38.anInt4741 = (Class123.anInt2062 * 128 - Class133_Sub6.anInt3676 * 128 + 64);
			Class123.anInt2062 = Class14_Sub8_Sub38.anInt4741 >> 39;
			Class58.anInt947 = Class14_Sub8_Sub38.anInt4731 - 48;
			Class14_Sub30.anInt3271 = (Class14_Sub8_Sub38.anInt4731 * 128 + 64 - Class58.anInt947 * 128);
			Class14_Sub8_Sub38.anInt4731 = Class14_Sub30.anInt3271 >> 7;
		} else
			Class14_Sub8_Sub7.method511(3);
		Class14_Sub13.method858(-1);
		if (i > -25)
			aClass124_1836 = null;
		Class118.method1608(-13873);
		Class126.method1743(27252, 28);
	}

	public static void method1569(int i, int i_23_) {
		Class14_Sub29 class14_sub29 = Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][i][i_23_];
		for (int i_24_ = 0; i_24_ < 3; i_24_++) {
			Class14_Sub29 class14_sub29_25_ = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_24_][i][i_23_] = (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[i_24_
					+ 1][i][i_23_]));
			if (class14_sub29_25_ != null) {
				class14_sub29_25_.anInt3243--;
				for (int i_26_ = 0; i_26_ < class14_sub29_25_.anInt3242; i_26_++) {
					Class40 class40 = class14_sub29_25_.aClass40Array3257[i_26_];
					if ((class40.aLong677 >> 29 & 0x3L) == 2L && class40.anInt668 == i && class40.anInt678 == i_23_)
						class40.anInt672--;
				}
			}
		}
		if (Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][i][i_23_] == null)
			Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][i][i_23_] = new Class14_Sub29(0, i, i_23_);
		Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[0][i][i_23_].aClass14_Sub29_3260 = class14_sub29;
		Class125_Sub1.aClass14_Sub29ArrayArrayArray3368[3][i][i_23_] = null;
	}

	public static boolean method1570(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, Class133 class133,
			int i_32_, long l) {
		if (class133 == null)
			return true;
		int i_33_ = i_27_ * 128 + i_30_ * 64;
		int i_34_ = i_28_ * 128 + i_31_ * 64;
		return Class14_Sub8_Sub19.method580(i, i_27_, i_28_, i_30_, i_31_, i_33_, i_34_, i_29_, class133, i_32_, false,
				l);
	}

	public static void method1571(int i) {
		aClass124_1836 = null;
		if (i != 0)
			method1564(-99, 61, 81, null);
		aClass14_Sub2_Sub19_Sub1Array1835 = null;
		aClass124_1831 = null;
		aClass9_Sub1_1834 = null;
		aClass124_1839 = null;
	}

	public int method1572(byte i) {
		if (i != 42)
			aClass9_Sub1_1834 = null;
		int i_35_ = aByte1838 & 0x7;
		return i_35_;
	}

	public int method1573(boolean bool) {
		if (!bool)
			anInt1841 = -49;
		int i = (aByte1838 & 0x8) == 8 ? 1 : 0;
		return i;
	}

	public Class109() {
		/* empty */
	}

	public Class109(Buffer class14_sub10) {
		aByte1838 = class14_sub10.method780((byte) -77);
		anInt1830 = class14_sub10.method784((byte) 125);
		anInt1833 = class14_sub10.method812((byte) -99);
		anInt1841 = class14_sub10.method812((byte) -102);
		anInt1845 = class14_sub10.method812((byte) -117);
		anInt1829 = class14_sub10.method812((byte) -97);
	}
}
