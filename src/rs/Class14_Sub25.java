/* Class14_Sub25 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Linkable;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub32;

public class Class14_Sub25 extends Linkable {
	public static boolean[][] aBooleanArrayArray3170;
	public static Class124 aClass124_3172 = Class14_Sub2_Sub2.method263(1178, " )2> <col=ff9040>");
	public static int[][][] anIntArrayArrayArray3174;
	public static Class124 aClass124_3175 = Class14_Sub2_Sub2.method263(1178, "Lade Texturen )2 ");
	public int[] anIntArray3177;
	public int[] anIntArray3178 = { -1 };

	static {
		aBooleanArrayArray3170 = (new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true },
				{ false, false, true, true }, { true, true, false }, { false, true, true },
				{ true, false, false, true }, { false, false, false, true, true }, { false, true, true },
				{ true, false, true, true, true }, { false, true, true, true, true },
				{ false, true, true, true, true, false } });
	}

	public static void method915(int i, int i_0_) {
		if (i_0_ != 28091)
			aClass124_3172 = null;
		Class14_Sub28.aClass52_3217.method1208((byte) -112, i);
	}

	public static void method916(int i) {
		aClass124_3172 = null;
		anIntArrayArrayArray3174 = null;
		aClass124_3175 = null;
		aBooleanArrayArray3170 = null;
	}

	public static int method917(boolean bool, boolean bool_1_, byte i) {
		int i_2_ = 0;
		if (i != 96) {
			int i_3_ = 45;
			return i_3_;
		}
		if (bool_1_)
			i_2_ += Class14_Sub8_Sub32.anInt4612 + Class14_Sub2_Sub8.anInt3833;
		if (bool)
			i_2_ += Class63.anInt998 + SceneCluster.anInt1355;
		int i_4_ = i_2_;
		return i_4_;
	}

	public Class14_Sub25() {
		anIntArray3177 = new int[1];
	}
}
