/* Class86 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.Class14_Sub1;

public class Class86 {
	public Class133 aClass133_1379;
	public static byte[][][] aByteArrayArrayArray1383;
	public static Class124 aClass124_1384;
	public static volatile int anInt1385 = 0;
	public Class148_Sub1 aClass148_Sub1_1386;
	public static int anInt1389 = 0;

	static {
		aClass124_1384 = Class124.method263(1178, "Verbindung abgebrochen)3");
	}

	public static Class37 method1418(int i, int i_0_, int i_1_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_];
		if (class14_sub29 == null)
			return null;
		Class37 class37 = class14_sub29.aClass37_3255;
		class14_sub29.aClass37_3255 = null;
		return class37;
	}

	public static Class124 method1419(byte i) {
		Class124 class124 = JunkTex.aClass124_4326;
		if (i <= 124)
			aClass124_1384 = null;
		if (Class7.anInt182 != 0)
			class124 = JunkTex.aClass124_4481;
		Class124 class124_2_ = (JunkTex
				.method515(
						(new Class124[] { Class142.aClass124_2271, class124, ProceduralTexture.aClass124_1800,
								Class83.method1407(102, JunkTex.language), JunkTex.aClass124_4341,
								Class83.method1407(111, Class14_Sub2_Sub11.anInt3884), Class137.aClass124_2195 }),
						(byte) -24));
		return class124_2_;
	}

	public static void method1420(int i) {
		int i_3_ = JunkTex.aClass2_4163.size();
		if (i_3_ != 0) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(67);
			JunkTex.aClass14_Sub10_Sub1_891.method809(0);
			i_3_ = JunkTex.aClass14_Sub10_Sub1_891.position;
			Class14_Sub1 class14_sub1 = (Class14_Sub1) JunkTex.aClass2_4163.popFront();
			JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 108, class14_sub1.anInt2714);
			int i_4_ = class14_sub1.anInt2714;
			if (i <= 73)
				method1422(29, null);
			int i_5_ = 0;
			while ((class14_sub1 = ((Class14_Sub1) JunkTex.aClass2_4163.popFront())) != null) {
				if (i_5_ >= 255 || class14_sub1.anInt2714 != i_4_ + 1) {
					JunkTex.aClass14_Sub10_Sub1_891.method809(i_5_);
					i_5_ = 0;
					JunkTex.aClass14_Sub10_Sub1_891.method833((byte) 122, class14_sub1.anInt2714);
				} else
					i_5_++;
				i_4_ = class14_sub1.anInt2714;
			}
			JunkTex.aClass14_Sub10_Sub1_891.method809(i_5_);
			JunkTex.aClass14_Sub10_Sub1_891.method804((JunkTex.aClass14_Sub10_Sub1_891.position) - i_3_, (byte) 32);
		}
	}

	public static void method1421(byte i) {
		if (i != 2)
			aByteArrayArrayArray1383 = null;
		aClass124_1384 = null;
		aByteArrayArrayArray1383 = null;
	}

	public static Class98 method1422(int i, Buffer class14_sub10) {
		int i_6_ = 52 % ((3 - i) / 36);
		Class98 class98 = new Class98();
		class98.anInt1663 = class14_sub10.readUShort((byte) 102);
		class98.aClass14_Sub2_Sub21_1662 = Class14_Sub2_Sub3.method272(class98.anInt1663, (byte) 46);
		Class98 class98_7_ = class98;
		return class98_7_;
	}

	public static void method1424(int i, Class9 class9) {
		if (i == -256)
			Static2.aClass9_367 = class9;
	}
}
