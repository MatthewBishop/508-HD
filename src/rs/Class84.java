/* Class84 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.rt4.Class25;
import com.jagex.rt4.RT4GL;

public class Class84 {
	public static Class14_Sub2_Sub16 aClass14_Sub2_Sub16_1344;
	public static Class124 aClass124_1345;
	public static int anInt1346;
	public static Class124 aClass124_1347;
	public static Class124 aClass124_1349;
	public static Class124 aClass124_1350 = Class14_Sub2_Sub2.method263(1178, "Lade Titelbild )2 ");
	public static Class124 aClass124_1352;

	static {
		aClass124_1349 = Class14_Sub2_Sub2.method263(1178, "Bitte entfernen Sie ");
		aClass124_1345 = Class14_Sub2_Sub2.method263(1178, "green:");
		aClass124_1352 = aClass124_1345;
		aClass124_1347 = aClass124_1345;
	}

	public static void method1411(boolean bool, Class124 class124, boolean bool_0_) {
		if (!bool_0_)
			aClass124_1345 = null;
		int i = 4;
		int i_1_ = 6 + i;
		int i_2_ = i + 6;
		int i_3_ = aClass14_Sub2_Sub16_1344.method344(class124, 250);
		int i_4_ = aClass14_Sub2_Sub16_1344.method358(class124, 250) * 13;
		Class25.method1004(-i + i_1_, i_2_ - i, i + i_3_ + i, i + i_4_ + i, 0);
		Class25.method1003(i_1_ - i, -i + i_2_, i + i + i_3_, i + (i + i_4_), 16777215);
		aClass14_Sub2_Sub16_1344.method359(class124, i_1_, i_2_, i_3_, i_4_, 16777215, -1, 1, 1, 0);
		Class14_Sub13.method862(125, i + (i_3_ + i), i_4_ + (i + i), -i + i_2_, -i + i_1_);
		if (!bool)
			Static2.method1317(i_2_, i_4_, i_3_, -91, i_1_);
		else
			RT4GL.method1657();
	}

	public static int method1412(byte i) {
		if (i > -124) {
			int i_5_ = -34;
			return i_5_;
		}
		int i_6_ = 16;
		return i_6_;
	}

	public static void method1414(boolean bool) {
		aClass124_1345 = null;
		aClass124_1349 = null;
		aClass124_1347 = null;
		aClass14_Sub2_Sub16_1344 = null;
		aClass124_1352 = null;
		aClass124_1350 = null;
		if (bool)
			aClass14_Sub2_Sub16_1344 = null;
	}
}
