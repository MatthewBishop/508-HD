/* Class125 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub38;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub6;
import rs.tex.Static;

public abstract class Class125 {
	public static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_2071;
	public static SoftCache aClass52_2075;
	public static short aShort2076 = 1;
	public static Class124 aClass124_2077;
	public int anInt2079;
	public static Class124 aClass124_2080;
	public static int[] anIntArray2081 = { 0, 0, 2, 0, 0, 2, 1, 1, 0 };
	public static Class124 aClass124_2082;
	public int anInt2083;
	public static Class124 aClass124_2084 = Class14_Sub2_Sub2.method263(1178, "scape main");
	public int anInt2086;

	static {
		aClass124_2082 = null;
		aClass124_2080 = Class14_Sub2_Sub2.method263(1178, "Unable to find ");
		aClass124_2077 = aClass124_2080;
		aClass52_2075 = new SoftCache(50);
	}

	public abstract void method1721(boolean bool, int i, int i_0_);

	public static void method1722(Class133_Sub1 class133_sub1, byte i) {
		class133_sub1.aBoolean3488 = false;
		if (class133_sub1.anInt3452 != -1) {
			Animation animation = Static.method1129(class133_sub1.anInt3452, 68);
			if (animation != null && animation.anIntArray768 != null) {
				class133_sub1.anInt3431++;
				if (animation.anIntArray768.length > class133_sub1.anInt3483
						&& (class133_sub1.anInt3431 > animation.anIntArray763[class133_sub1.anInt3483])) {
					class133_sub1.anInt3431 = 1;
					class133_sub1.anInt3483++;
					Class14_Sub8_Sub6.method509(class133_sub1.anInt3495, class133_sub1.anInt3483, -123,
							((Class14_Sub3.aClass133_Sub1_Sub1_2748) == class133_sub1), animation,
							class133_sub1.anInt3436);
				}
				if (animation.anIntArray768.length <= class133_sub1.anInt3483) {
					class133_sub1.anInt3483 = 0;
					class133_sub1.anInt3431 = 0;
					Class14_Sub8_Sub6.method509(class133_sub1.anInt3495, class133_sub1.anInt3483, -102,
							((Class14_Sub3.aClass133_Sub1_Sub1_2748) == class133_sub1), animation,
							class133_sub1.anInt3436);
				}
			} else
				class133_sub1.anInt3452 = -1;
		}
		if (i >= -82)
			aClass124_2080 = null;
		if (class133_sub1.anInt3487 != -1 && Class14_Sub2_Sub20.anInt4064 >= class133_sub1.anInt3485) {
			if (class133_sub1.anInt3470 < 0)
				class133_sub1.anInt3470 = 0;
			int i_1_ = (Class127.method1749(class133_sub1.anInt3487, (byte) 38).anInt966);
			if (i_1_ == -1)
				class133_sub1.anInt3487 = -1;
			else {
				Animation animation = Static.method1129(i_1_, -119);
				if (animation != null && animation.anIntArray768 != null) {
					class133_sub1.anInt3459++;
					if (class133_sub1.anInt3470 < animation.anIntArray768.length
							&& (class133_sub1.anInt3459 > (animation.anIntArray763[class133_sub1.anInt3470]))) {
						class133_sub1.anInt3470++;
						class133_sub1.anInt3459 = 1;
						Class14_Sub8_Sub6.method509(class133_sub1.anInt3495, class133_sub1.anInt3470, -102,
								(class133_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748), animation,
								class133_sub1.anInt3436);
					}
					if (animation.anIntArray768.length <= class133_sub1.anInt3470)
						class133_sub1.anInt3487 = -1;
				} else
					class133_sub1.anInt3487 = -1;
			}
		}
		if (class133_sub1.anInt3445 != -1 && class133_sub1.anInt3467 <= 1) {
			Animation animation = Static.method1129(class133_sub1.anInt3445, -12);
			if (animation.animatingPrecedence == 1 && class133_sub1.anInt3477 > 0
					&& Class14_Sub2_Sub20.anInt4064 >= class133_sub1.anInt3494
					&& Class14_Sub2_Sub20.anInt4064 > class133_sub1.anInt3455) {
				class133_sub1.anInt3467 = 1;
				return;
			}
		}
		if (class133_sub1.anInt3445 != -1 && class133_sub1.anInt3467 == 0) {
			Animation animation = Static.method1129(class133_sub1.anInt3445, 32);
			if (animation != null && animation.anIntArray768 != null) {
				class133_sub1.anInt3458++;
				if (class133_sub1.anInt3501 < animation.anIntArray768.length
						&& (animation.anIntArray763[class133_sub1.anInt3501] < class133_sub1.anInt3458)) {
					class133_sub1.anInt3501++;
					class133_sub1.anInt3458 = 1;
					Class14_Sub8_Sub6.method509(class133_sub1.anInt3495, class133_sub1.anInt3501, -111,
							((Class14_Sub3.aClass133_Sub1_Sub1_2748) == class133_sub1), animation,
							class133_sub1.anInt3436);
				}
				if (class133_sub1.anInt3501 >= animation.anIntArray768.length) {
					class133_sub1.anInt3501 -= animation.loopOffset;
					class133_sub1.anInt3482++;
					if (class133_sub1.anInt3482 >= animation.maximumLoops)
						class133_sub1.anInt3445 = -1;
					else if (class133_sub1.anInt3501 < 0 || (class133_sub1.anInt3501 >= animation.anIntArray768.length))
						class133_sub1.anInt3445 = -1;
					else
						Class14_Sub8_Sub6.method509(class133_sub1.anInt3495, class133_sub1.anInt3501, -125,
								(class133_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748), animation,
								class133_sub1.anInt3436);
				}
				class133_sub1.aBoolean3488 = animation.stretches;
			} else
				class133_sub1.anInt3445 = -1;
		}
		if (class133_sub1.anInt3467 > 0)
			class133_sub1.anInt3467--;
	}

	public static void method1723(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_) {
		if (i >= 0 && i_4_ >= 0 && i < 103 && i_4_ < 103) {
			if (i_2_ == 0) {
				Class113 class113 = Class14_Sub4.method458(i_3_, i, i_4_);
				if (class113 != null) {
					int i_9_ = (int) (class113.aLong1887 >>> 32) & 0x7fffffff;
					if (i_8_ != 2)
						class113.aClass133_1877 = new Class133_Sub4(i_9_, i_8_, i_6_, i_3_, i, i_4_, i_7_, false,
								class113.aClass133_1877);
					else {
						class113.aClass133_1877 = new Class133_Sub4(i_9_, 2, i_6_ + 4, i_3_, i, i_4_, i_7_, false,
								class113.aClass133_1877);
						class113.aClass133_1884 = new Class133_Sub4(i_9_, 2, i_6_ + 1 & 0x3, i_3_, i, i_4_, i_7_, false,
								class113.aClass133_1884);
					}
				}
			}
			if (i_2_ == 1) {
				Class37 class37 = Class14_Sub8_Sub4.method497(i_3_, i, i_4_);
				if (class37 != null) {
					int i_10_ = (int) (class37.aLong634 >>> 32) & 0x7fffffff;
					if (i_8_ != 4 && i_8_ != 5) {
						if (i_8_ != 6) {
							if (i_8_ != 7) {
								if (i_8_ == 8) {
									class37.aClass133_642 = new Class133_Sub4(i_10_, 4, i_6_ + 4, i_3_, i, i_4_, i_7_,
											false, (class37.aClass133_642));
									class37.aClass133_638 = new Class133_Sub4(i_10_, 4, ((i_6_ + 2 & 0x3) + 4), i_3_, i,
											i_4_, i_7_, false, (class37.aClass133_638));
								}
							} else
								class37.aClass133_642 = new Class133_Sub4(i_10_, 4, (i_6_ + 2 & 0x3) + 4, i_3_, i, i_4_,
										i_7_, false, class37.aClass133_642);
						} else
							class37.aClass133_642 = new Class133_Sub4(i_10_, 4, i_6_ + 4, i_3_, i, i_4_, i_7_, false,
									class37.aClass133_642);
					} else
						class37.aClass133_642 = new Class133_Sub4(i_10_, 4, i_6_, i_3_, i, i_4_, i_7_, false,
								class37.aClass133_642);
				}
			}
			if (i_2_ == 2) {
				if (i_8_ == 11)
					i_8_ = 10;
				Class40 class40 = Class65.method1291(i_3_, i, i_4_);
				if (class40 != null)
					class40.aClass133_679 = new Class133_Sub4(((int) (class40.aLong677 >>> 32) & 0x7fffffff), i_8_,
							i_6_, i_3_, i, i_4_, i_7_, false, class40.aClass133_679);
			}
			if (i_2_ == 3) {
				Class4 class4 = Class47.method1180(i_3_, i, i_4_);
				if (class4 != null)
					class4.aClass133_124 = new Class133_Sub4(((int) (class4.aLong132 >>> 32) & 0x7fffffff), 22, i_6_,
							i_3_, i, i_4_, i_7_, false, class4.aClass133_124);
			}
		}
		if (i_5_ != -1292647136)
			method1723(-62, -93, 80, 56, 86, 113, 1, -67);
	}

	public abstract void method1724(int i, int i_11_, int i_12_);

	public static void method1725(int i, int i_13_, int i_14_, int i_15_, int i_16_, byte i_17_) {
		int i_18_ = 70 % ((-8 - i_17_) / 32);
		Class33.anInt577 = i_16_;
		Class7.anInt177 = i_15_;
		Class117.anInt1948 = i_13_;
		Class14_Sub29.anInt3267 = i_14_;
		Class14_Sub2_Sub9.anInt3866 = i;
		if (Class7.anInt177 >= 100) {
			int i_19_ = Class117.anInt1948 * 128 + 64;
			int i_20_ = Class33.anInt577 * 128 + 64;
			int i_21_ = (Static.method1017(i_19_, Class14_Sub2_Sub3.anInt3785, (byte) -18, i_20_)
					- Class14_Sub2_Sub9.anInt3866);
			int i_22_ = -Static2.anInt2926 + i_21_;
			int i_23_ = i_19_ - Class14_Sub8_Sub38.anInt4741;
			int i_24_ = i_20_ - Class14_Sub30.anInt3271;
			int i_25_ = (int) Math.sqrt((double) (i_24_ * i_24_ + i_23_ * i_23_));
			Class7_Sub3_Sub1.anInt3719 = ((int) (Math.atan2((double) i_22_, (double) i_25_) * 325.949) & 0x7ff);
			Class69.anInt1072 = (int) (Math.atan2((double) i_23_, (double) i_24_) * -325.949) & 0x7ff;
			if (Class7_Sub3_Sub1.anInt3719 < 128)
				Class7_Sub3_Sub1.anInt3719 = 128;
			if (Class7_Sub3_Sub1.anInt3719 > 383)
				Class7_Sub3_Sub1.anInt3719 = 383;
		}
		Class89.anInt1415 = 2;
	}

	public abstract void method1726(int i, int i_26_, int i_27_);

	public static void method1727(int i) {
		aClass124_2080 = null;
		aClass124_2084 = null;
		anIntArray2081 = null;
		aClass124_2077 = null;
		aClass124_2082 = null;
		aClass14_Sub9_Sub1_2071 = null;
		if (i != 10)
			RT4.translateX = 98;
		aClass52_2075 = null;
	}

	public Class125(int i, int i_28_, int i_29_) {
		anInt2086 = i_29_;
		anInt2083 = i_28_;
		anInt2079 = i;
	}
}
