/* Class127 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.Class148_Sub1;

public class Class127 {
	public int anInt2096;
	public int anInt2097;
	public byte[] aByteArray2098;
	public int anInt2099;
	public int anInt2100;
	public int anInt2103;
	public static volatile int anInt2105 = 0;
	public int anInt2106;
	public int anInt2108;
	public byte[] aByteArray2109;
	public static Class9_Sub1 aClass9_Sub1_2111;
	public static SoftCache aClass52_2112 = new SoftCache(64);
	public static Class124 aClass124_2113;
	public static Class94 aClass94_2114 = null;
	public static Class124 aClass124_2116 = Class124.method263(1178, "flash2:");
	public static Class124 aClass124_2117;
	public static int anInt2118;

	static {
		aClass124_2113 = aClass124_2116;
		anInt2118 = -1;
		aClass124_2117 = aClass124_2116;
	}

	public static void method1748(int i, int i_0_, int i_1_, int i_2_, Class133 class133, Class133 class133_3_,
			int i_4_, int i_5_, int i_6_, int i_7_, long l) {
		if (class133 != null) {
			Class37 class37 = new Class37();
			class37.aLong634 = l;
			class37.anInt653 = i_0_ * 128 + 64;
			class37.anInt633 = i_1_ * 128 + 64;
			class37.anInt650 = i_2_;
			class37.aClass133_642 = class133;
			class37.aClass133_638 = class133_3_;
			class37.anInt649 = i_4_;
			class37.anInt647 = i_5_;
			class37.anInt641 = i_6_;
			class37.anInt646 = i_7_;
			for (int i_8_ = i; i_8_ >= 0; i_8_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_8_][i_0_][i_1_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_8_][i_0_][i_1_] = new Class14_Sub29(i_8_, i_0_,
							i_1_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_].aClass37_3255 = class37;
		}
	}

	public static Class60 method1749(int i, byte i_9_) {
		Class60 class60 = (Class60) Static2.aClass52_236.get(i);
		if (class60 != null) {
			Class60 class60_10_ = class60;
			return class60_10_;
		}
		byte[] is = (JunkTex.aClass9_4338.method163(Class79.method1378(i, 5823),
				Class131.method1773(i, (byte) -124), 0));
		Class60 class60_11_ = new Class60();
		class60_11_.anInt962 = i;
		if (is != null)
			class60_11_.method1268(0, new Buffer(is));
		Static2.aClass52_236.put(class60_11_, i);
		int i_12_ = -57 / ((-65 - i_9_) / 39);
		Class60 class60_13_ = class60_11_;
		return class60_13_;
	}

	public static Class124 method1750(Class124 class124, byte i) {
		int i_14_ = -36 % ((i + 25) / 60);
		int i_15_ = JunkTex.method546(class124, -23861);
		if (i_15_ == -1) {
			Class124 class124_16_ = Static2.aClass124_364;
			return class124_16_;
		}
		Class124 class124_17_ = Class152.aClass146_2435.aClass124Array2362[i_15_];
		return class124_17_;
	}



	public static Class148_Sub1 method1752(int i, Class9 class9, boolean bool, int i_32_) {
		if (!bool)
			method1750(null, (byte) 88);
		if (!Static3.method1564(i, i_32_, class9)) {
			Class148_Sub1 class148_sub1 = null;
			return class148_sub1;
		}
		Class148_Sub1 class148_sub1 = Class22.method985(-90);
		return class148_sub1;
	}

	public static void method1753(boolean bool) {
		aClass94_2114 = null;
		aClass52_2112 = null;
		if (bool)
			method1748(-93, 123, -15, 22, null, null, 82, 104, 38, -95, 79L);
		aClass124_2117 = null;
		aClass124_2113 = null;
		aClass9_Sub1_2111 = null;
		aClass124_2116 = null;
	}

	public static boolean method1754(int i, int i_33_) {
		if (i != 128)
			method1753(true);
		if (i_33_ < 0) {
			boolean bool = false;
			return bool;
		}
		int i_34_ = Class14_Sub29.aShortArray3262[i_33_];
		if (i_34_ >= 2000)
			i_34_ -= 2000;
		if (i_34_ == 1007) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}
}
