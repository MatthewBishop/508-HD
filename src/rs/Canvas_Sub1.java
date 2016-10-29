/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

import com.jagex.util.TimeUtil;

public class Canvas_Sub1 extends Canvas {
	public static float aFloat41;
	public static Class124 aClass124_42 = Class124.method263(1178, "");
	public static int anInt43 = 1;
	public static Class124 aClass124_46;
	public static Interface5 anInterface5_48;
	public static short[][] aShortArrayArray50 = {
			{ 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314,
					-21965, 472, 580, 784, 21966, 28950, -15697, -14002 },
			{ 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486,
					24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 },
			new short[0], new short[0], new short[0] };
	public Component aComponent52;
	public static int anInt53;

	static {
		aClass124_46 = Class124.method263(1178, "<img=1>");
		anInterface5_48 = null;
	}

	public static void method58(int i, byte i_0_, int i_1_) {
		Class14_Sub9_Sub3.anIntArray4851[i_1_] = i;
		if (i_0_ != -1)
			method58(63, (byte) 85, -90);
		Class14_Sub13 class14_sub13 = ((Class14_Sub13) JunkTex.aClass55_92.get(i_1_));
		if (class14_sub13 == null) {
			class14_sub13 = new Class14_Sub13(4611686018427387905L);
			JunkTex.aClass55_92.put(i_1_, class14_sub13);
		} else if (class14_sub13.aLong2963 != 4611686018427387905L)
			class14_sub13.aLong2963 = TimeUtil.getTime() + 500L | 0x4000000000000000L;
	}

	public static void method59(byte i) {
		Static2.aClass52_3942.method1209();
	}

	@Override
	public void update(Graphics graphics) {
		aComponent52.update(graphics);
	}

	@Override
	public void paint(Graphics graphics) {
		aComponent52.paint(graphics);
	}

	public static void method60(int i) {
		aClass124_46 = null;
		aClass124_42 = null;
		if (i == 5027) {
			aShortArrayArray50 = null;
			anInterface5_48 = null;
		}
	}

	public Canvas_Sub1(Component component) {
		aComponent52 = component;
	}
}
