/* Class14_Sub2_Sub4 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Frame;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;
import com.jagex.util.Util;

public class Class14_Sub2_Sub4 extends Cacheable {
	public Class133_Sub3 aClass133_Sub3_3789;
	public static int[] anIntArray3791;
	public static Class124 aClass124_3793;
	public static Class124 aClass124_3795 = Class124.method263(1178, "sl_flags");
	public static Buffer aClass14_Sub10_3796;

	static {
		aClass124_3793 = Class124.method263(1178, " zuerst von Ihrer Freunde)2Liste(Q");
		anIntArray3791 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };
	}

	public Class14_Sub2_Sub4(Class133_Sub3 class133_sub3) {
		aClass133_Sub3_3789 = class133_sub3;
	}

	public static void method278(Class43 class43, Frame frame, int i) {
		for (;;) {
			Class31 class31 = class43.method1135(frame, -30170);
			while (class31.anInt529 == 0)
				Util.sleep(10L);
			if (class31.anInt529 == 1)
				break;
			Util.sleep(100L);
		}
		frame.setVisible(false);
		frame.dispose();
	}

	public static void method280(byte i) {
		anIntArray3791 = null;
		aClass124_3793 = null;
		aClass14_Sub10_3796 = null;
		aClass124_3795 = null;
	}
}
