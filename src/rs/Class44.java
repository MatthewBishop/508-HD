/* Class44 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.util.AbstractMouseWheelHandler;

public class Class44 {
	public static AbstractMouseWheelHandler aAbstractMouseWheelHandler_726;
	public static Class124 aClass124_728;
	public static Class124 aClass124_729;
	public static Class124 aClass124_730 = Class124.method263("Walk here");
	public static Class124 aClass124_732 = Class124.method263("sl_arrows");

	static {
		aClass124_729 = aClass124_730;
		aClass124_728 = Class124.method263("::rebuild");
	}

	public static void method1154(int i) {
		if (i != -10033)
			aClass124_732 = null;
		System.out.println(
				"Usage: worldid, <live/office/local>, <live/rc/wip>, <software/hardware>, <free/members>, <english/german>, <game0/game1> [safemode]");
		System.exit(1);
	}

	public static void method1155(int i, int i_0_) {
		JunkTex.anInt427 = i;
		Class37.anInt644 = i_0_;
		Static2.anInt3050 = -1;
		Static2.method1126((byte) -22);
	}

	public static void method1157(byte i) {
		aClass124_730 = null;
		aClass124_729 = null;
		aClass124_732 = null;
		if (i == 95) {
			aAbstractMouseWheelHandler_726 = null;
			aClass124_728 = null;
		}
	}

	public static int method1158(int i, boolean bool) {
		if (bool)
			aClass124_729 = null;
		int i_1_ = (i & 0x1f902) >> 43;
		return i_1_;
	}

}
