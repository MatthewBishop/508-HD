/* Class14_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Class52;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class14_Sub27;

import rs.tex.Class14_Sub8_Sub15;
import rs.tex.Class14_Sub8_Sub27;
import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Static;

public class Class14_Sub11 extends Linkable {
	public Class124 aClass124_2940;
	public static Class124 aClass124_2941;
	public static Class124 aClass124_2942 = Class14_Sub2_Sub2.method263(1178, "0(U");
	public static Class124 aClass124_2943;
	public static Class52 aClass52_2946;
	public static int[] anIntArray2948 = new int[128];
	public static Class124 aClass124_2949 = Class14_Sub2_Sub2.method263(1178, "shake:");
	public static int anInt2952;

	static {
		aClass124_2943 = aClass124_2949;
		aClass124_2941 = aClass124_2949;
		aClass52_2946 = new Class52(32);
	}

	public static void method851(int i, int i_0_) {
		Class133_Sub1_Sub1.aClass52_4926.method1208((byte) -112, i_0_);
		Class125.aClass52_2075.method1208((byte) -112, i_0_);
		Class70.aClass52_1077.method1208((byte) -112, i_0_);
		if (i != 1)
			method856((byte) 3);
	}

	public static boolean method852(int i) {
		if (i != 14326) {
			boolean bool = true;
			return bool;
		}
		if (Class14_Sub2_Sub11.anInt3889 != 0) {
			boolean bool = true;
			return bool;
		}
		boolean bool = Class133_Sub5.aClass14_Sub9_Sub1_3625.method721((byte) 109);
		return bool;
	}

	public static void method853(int i, Class124 class124, int i_1_, Class124 class124_2_, short i_3_, long l,
			int i_4_) {
		if (i != 32)
			aClass124_2949 = null;
		if (!Class133_Sub5.aBoolean3628 && Class14_Sub8_Sub38.anInt4729 < 500) {
			Class112.aClass124Array1875[Class14_Sub8_Sub38.anInt4729] = class124;
			RuntimeException_Sub1.aClass124Array2459[(Class14_Sub8_Sub38.anInt4729)] = class124_2_;
			Class14_Sub29.aShortArray3262[Class14_Sub8_Sub38.anInt4729] = i_3_;
			Static.aLongArray3924[Class14_Sub8_Sub38.anInt4729] = l;
			Class14_Sub8_Sub27.anIntArray4544[Class14_Sub8_Sub38.anInt4729] = i_4_;
			Static.anIntArray3288[Class14_Sub8_Sub38.anInt4729] = i_1_;
			Class14_Sub8_Sub38.anInt4729++;
		}
	}

	public static int method854(Buffer class14_sub10, Class124 class124) {
		int i_5_ = class14_sub10.position;
		class14_sub10.method810(class124.anInt2507);
		class14_sub10.position += Class98.aClass5_1659.method113(0, class14_sub10.payload, 0,
				class124.anInt2507, class14_sub10.position, class124.aByteArray2495);
		int i_6_ = class14_sub10.position - i_5_;
		return i_6_;
	}

	public static void method855(int i) {
		Class40.aClass14_Sub29ArrayArrayArray674 = (new Class14_Sub29[i][Class99_Sub2.anInt3338][Class14_Sub8_Sub15.anInt4337]);
		Static.anIntArrayArray2799 = new int[Class99_Sub2.anInt3338][Class14_Sub8_Sub15.anInt4337];
		Class150.anIntArrayArrayArray2419 = (new int[i][Class99_Sub2.anInt3338 + 1][Class14_Sub8_Sub15.anInt4337 + 1]);
		Class131.aClass14_Sub27ArrayArray2162 = new Class14_Sub27[i][];
	}

	public static void method856(byte i) {
		anIntArray2948 = null;
		if (i == 8) {
			aClass124_2943 = null;
			aClass124_2941 = null;
			aClass52_2946 = null;
			aClass124_2949 = null;
			aClass124_2942 = null;
		}
	}

	public Class14_Sub11() {
		/* empty */
	}

	public Class14_Sub11(Class124 class124, int i) {
		aClass124_2940 = class124;
	}
}