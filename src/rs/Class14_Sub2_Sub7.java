/* Class14_Sub2_Sub7 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Cacheable;
import com.jagex.rt4.AbstractSprite;

public class Class14_Sub2_Sub7 extends Cacheable {
	public static int anInt3820;
	public static Class124 aClass124_3821;
	public Class133_Sub5 aClass133_Sub5_3822;
	public static Class9_Sub1 aClass9_Sub1_3824;
	public static int[] anIntArray3825 = new int[2048];
	public static AbstractSprite aClass14_Sub2_Sub19_3826;

	static {
		aClass124_3821 = Class124.method263(1178, "blinken1:");
	}

	public static void method288(int i) {
		if (i != 1)
			method289((byte) 0, -63, null, null, 35);
		aClass14_Sub2_Sub19_3826 = null;
		aClass124_3821 = null;
		anIntArray3825 = null;
		aClass9_Sub1_3824 = null;
	}

	public static void method289(byte i, int i_0_, int[] is, Object[] objects, int i_1_) {
		if (i_1_ < i_0_) {
			int i_2_ = (i_0_ + i_1_) / 2;
			int i_3_ = i_1_;
			int i_4_ = is[i_2_];
			is[i_2_] = is[i_0_];
			is[i_0_] = i_4_;
			Object object = objects[i_2_];
			objects[i_2_] = objects[i_0_];
			objects[i_0_] = object;
			for (int i_5_ = i_1_; i_0_ > i_5_; i_5_++) {
				if (is[i_5_] < (i_5_ & 0x1) + i_4_) {
					int i_6_ = is[i_5_];
					is[i_5_] = is[i_3_];
					is[i_3_] = i_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_3_];
					objects[i_3_++] = object_7_;
				}
			}
			is[i_0_] = is[i_3_];
			is[i_3_] = i_4_;
			objects[i_0_] = objects[i_3_];
			objects[i_3_] = object;
			method289((byte) 127, i_3_ - 1, is, objects, i_1_);
			method289((byte) 127, i_0_, is, objects, i_3_ + 1);
		}
		if (i <= 123)
			method289((byte) -96, 52, null, null, 107);
	}

	public Class14_Sub2_Sub7(Class133_Sub5 class133_sub5) {
		aClass133_Sub5_3822 = class133_sub5;
	}
}
