/* Class110 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.math.BigInteger;

import com.jagex.rt4.Class148;

public class Class110 {
	public static Class148[] aClass148Array1848;
	public static Class124 aClass124_1849;
	public static Class124 aClass124_1850 = Class124.method263(")2");
	public static BigInteger aBigInteger1852;
	public static Class124 aClass124_1853;
	public static int[] anIntArray1854;
	public static Class124 aClass124_1855;

	static {
		aClass124_1849 = Class124.method263("Nehmen");
		aBigInteger1852 = (new BigInteger(
				"9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083"));
		anIntArray1854 = new int[100];
		aClass124_1855 = Class124.method263("Loading fonts )2 ");
		aClass124_1853 = aClass124_1855;
	}

	public static void method1574(int i, int i_0_, int i_1_) {
		if (i <= 46)
			method1575(false);
		Class51 class51 = Class47.method1187(i_1_, true);
		int i_2_ = class51.anInt842;
		int i_3_ = class51.anInt832;
		int i_4_ = class51.anInt834;
		int i_5_ = Class1.anIntArray69[-i_3_ + i_4_];
		if (i_0_ < 0 || i_0_ > i_5_)
			i_0_ = 0;
		i_5_ <<= i_3_;
		Class14_Sub9_Sub1.method700(i_2_, -127,
				(i_0_ << i_3_ & i_5_ | ((i_5_ ^ 0xffffffff) & (JunkTex.anIntArray4275[i_2_]))));
	}

	public static void method1575(boolean bool) {
		aClass124_1850 = null;
		aClass148Array1848 = null;
		aClass124_1849 = null;
		aClass124_1855 = null;
		anIntArray1854 = null;
		aClass124_1853 = null;
		aBigInteger1852 = null;
		if (!bool)
			anIntArray1854 = null;
	}
}
