/* Class125_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;

public class Class125_Sub3 extends Class125 {
	public int anInt3390;
	public static int[][] anIntArrayArray3391;
	public static boolean aBoolean3392;
	public static Class124 aClass124_3394;
	public int anInt3395;
	public int anInt3396;
	public static boolean aBoolean3397;
	public static int[] anIntArray3398 = new int[128];
	public int anInt3400;
	public int anInt3401;
	public int anInt3403;
	public int anInt3407;
	public static Class124 aClass124_3408 = Class14_Sub2_Sub2.method263(1178, "http:)4)4");
	public static Class124 aClass124_3409;
	public static Class94 aClass94_3410;
	public static int anInt3411;
	public static Class124 aClass124_3412;
	public int anInt3414;

	static {
		aBoolean3392 = false;
		aClass124_3394 = Class14_Sub2_Sub2.method263(1178, " from your friend list first)3");
		aClass124_3409 = aClass124_3394;
		aBoolean3397 = true;
		aClass124_3412 = Class14_Sub2_Sub2.method263(1178, "null");
	}

	public static void method1735(byte i, int i_0_, Class94[] class94s) {
		if (i == 31) {
			int i_1_ = 0;
			for (/**/; class94s.length > i_1_; i_1_++) {
				Class94 class94 = class94s[i_1_];
				if (class94 != null && i_0_ == class94.anInt1540
						&& (!class94.aBoolean1455 || !client.method49(class94))) {
					if (class94.anInt1489 == 0) {
						if (!class94.aBoolean1455 && client.method49(class94) && aClass94_3410 != class94)
							continue;
						method1735((byte) 31, class94.anInt1548, class94s);
						if (class94.aClass94Array1486 != null)
							method1735((byte) 31, class94.anInt1548, class94.aClass94Array1486);
						Class14_Sub15 class14_sub15 = ((Class14_Sub15) (Class14_Sub30.aClass55_3275
								.get((long) class94.anInt1548)));
						if (class14_sub15 != null)
							Static2.method250(class14_sub15.anInt2999, false);
					}
					if (class94.anInt1489 == 6) {
						if (class94.anInt1598 != -1 || class94.anInt1533 != -1) {
							boolean bool = Class89.method1440(class94, i ^ 0x27b8);
							int i_2_;
							if (!bool)
								i_2_ = class94.anInt1598;
							else
								i_2_ = class94.anInt1533;
							if (i_2_ != -1) {
								Animation animation = JunkTex.method1129(i_2_, -16);
								if (animation != null) {
									class94.anInt1603 += Class51.anInt839;
									while (class94.anInt1603 > (animation.anIntArray763[class94.anInt1610])) {
										class94.anInt1603 -= (animation.anIntArray763[class94.anInt1610]);
										class94.anInt1610++;
										if (class94.anInt1610 >= animation.anIntArray768.length) {
											class94.anInt1610 -= animation.loopOffset;
											if (class94.anInt1610 < 0
													|| ((animation.anIntArray768).length <= class94.anInt1610))
												class94.anInt1610 = 0;
										}
										Class103.method1531(class94);
									}
								}
							}
						}
						if (class94.anInt1505 != 0 && !class94.aBoolean1455) {
							int i_3_ = class94.anInt1505 >> 48;
							i_3_ *= Class51.anInt839;
							int i_4_ = class94.anInt1505 << 16 >> 16;
							class94.anInt1465 = i_3_ + class94.anInt1465 & 0x7ff;
							i_4_ *= Class51.anInt839;
							class94.anInt1578 = i_4_ + class94.anInt1578 & 0x7ff;
							Class103.method1531(class94);
						}
					}
				}
			}
		}
	}

	public void method1721(boolean bool, int i, int i_5_) {
		int i_6_ = anInt3401 * i_5_ >> 44;
		int i_7_ = i * anInt3403 >> 12;
		int i_8_ = anInt3414 * i >> 44;
		int i_9_ = anInt3396 * i_5_ >> 44;
		int i_10_ = anInt3400 * i >> 12;
		int i_11_ = anInt3395 * i_5_ >> 44;
		int i_12_ = anInt3390 * i >> 44;
		int i_13_ = i_5_ * anInt3407 >> 12;
		Class137.method1939(i_8_, bool, anInt2083, i_13_, i_6_, i_11_, i_9_, i_7_, i_12_, i_10_);
	}

	public void method1726(int i, int i_15_, int i_16_) {
		if (i < 39)
			method1726(67, 44, -69);
	}

	public void method1724(int i, int i_17_, int i_18_) {
		if (i_17_ != -6)
			aClass124_3394 = null;
	}

	public Class125_Sub3(int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_, int i_26_,
			int i_27_) {
		super(-1, i_26_, i_27_);
		anInt3403 = i;
		anInt3414 = i_20_;
		anInt3401 = i_19_;
		anInt3396 = i_21_;
		anInt3395 = i_23_;
		anInt3400 = i_22_;
		anInt3407 = i_25_;
		anInt3390 = i_24_;
	}

	public static void method1738(int i) {
		anIntArrayArray3391 = null;
		anIntArray3398 = null;
		aClass124_3394 = null;
		aClass124_3412 = null;
		aClass124_3408 = null;
		aClass124_3409 = null;
		aClass94_3410 = null;
		if (i != -1)
			aClass124_3408 = null;
	}
}
