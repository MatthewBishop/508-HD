/* Class98 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class14_Sub2_Sub19;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub17;
import rs.tex.Class14_Sub8_Sub29;
import rs.tex.Class14_Sub8_Sub33;

public class Class98 {
	public int[] anIntArray1658;
	public static Class5 aClass5_1659;
	public static int[] anIntArray1660;
	public static Class124 aClass124_1661 = (Class14_Sub2_Sub2.method263(1178,
			"; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0"));
	public Class14_Sub2_Sub21 aClass14_Sub2_Sub21_1662;
	public int anInt1663;
	public static long[] aLongArray1665 = new long[100];
	public static Class9_Sub1 aClass9_Sub1_1666;
	public static byte[][] aByteArrayArray1667;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array1669;
	public static int anInt1671;
	public static Class124 aClass124_1673 = Class14_Sub2_Sub2.method263(1178, "3D)2Softwarebibliothek gestartet)3");

	public static void method1492(int i, byte i_0_) {
		if (i_0_ >= -43)
			method1492(38, (byte) 76);
		if (i == -1 && !Class14_Sub7.aBoolean2827)
			Class14_Sub8_Sub17.method569(-80);
		else if (i != -1 && (Class14_Sub8.anInt2856 != i || !Class14_Sub11.method852(14326))
				&& Class14_Sub23.anInt3135 != 0 && !Class14_Sub7.aBoolean2827)
			Class14_Sub8_Sub29.method636(i, 2, 25506, Class14_Sub23.anInt3135, false, Class125_Sub2.aClass9_Sub1_3374,
					0);
		Class14_Sub8.anInt2856 = i;
	}

	public static boolean method1493(int i, Class124 class124) {
		if (class124 == null) {
			boolean bool = false;
			return bool;
		}
		for (int i_1_ = 0; Static2.anInt3728 > i_1_; i_1_++) {
			if (class124.method1717(i ^ ~0x28, Static2.aClass124Array2938[i_1_]))
				return true;
		}
		if (class124.method1717(40, (Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass124_4922)))
			return true;
		boolean bool = false;
		return bool;
	}

	public static void method1495(int i) {
		if (i < 112)
			aClass124_1673 = null;
		aClass9_Sub1_1666 = null;
		aLongArray1665 = null;
		aClass124_1673 = null;
		anIntArray1660 = null;
		aClass124_1661 = null;
		aByteArrayArray1667 = null;
		aClass5_1659 = null;
		aClass14_Sub2_Sub19Array1669 = null;
	}

	public static void method1496(int i, int i_3_, int i_4_) {
		Class142.aBoolean2299 = true;
		Class86.anInt1389 = i;
		Class14_Sub19.anInt3073 = i_3_;
		Class99_Sub2.anInt3334 = i_4_;
		Class66.anInt1039 = -1;
		Class14_Sub8_Sub33.anInt4636 = -1;
	}
}
