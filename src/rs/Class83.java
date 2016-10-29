/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.io.js5.Class9;
import com.jagex.link.ref.SoftCache;

public class Class83 {
	public static Class9 aClass9_1335;
	public static int anInt1338;
	public static SoftCache aClass52_1339 = new SoftCache(20);
	public static int anInt1340;
	public static Class112[] aClass112Array1341 = new Class112[50];
	public static boolean aBoolean1342;

	public static Class124 method1407(int i, int i_0_) {
		if (i < 8)
			method1410(-29);
		Class124 class124 = Class54.method1220(i_0_, true, false, 10);
		return class124;
	}

	public static void method1408(Class133_Sub1_Sub1 class133_sub1_sub1, int i, boolean bool, int i_1_) {
		if (i_1_ == class133_sub1_sub1.anInt3445 && i_1_ != -1) {
			Animation animation = JunkTex.method1129(i_1_, -128);
			int i_2_ = animation.anInt753;
			if (i_2_ == 1) {
				class133_sub1_sub1.anInt3458 = 0;
				class133_sub1_sub1.anInt3467 = i;
				class133_sub1_sub1.anInt3501 = 0;
				class133_sub1_sub1.anInt3482 = 0;
				JunkTex.method509(class133_sub1_sub1.anInt3495, class133_sub1_sub1.anInt3501, 59,
						((Class14_Sub3.aClass133_Sub1_Sub1_2748) == class133_sub1_sub1), animation,
						class133_sub1_sub1.anInt3436);
			}
			if (i_2_ == 2)
				class133_sub1_sub1.anInt3482 = 0;
		} else if (i_1_ == -1 || class133_sub1_sub1.anInt3445 == -1 || (JunkTex.method1129(i_1_,
				-119).anInt777 >= (JunkTex.method1129(class133_sub1_sub1.anInt3445, 92).anInt777))) {
			class133_sub1_sub1.anInt3467 = i;
			class133_sub1_sub1.anInt3458 = 0;
			class133_sub1_sub1.anInt3501 = 0;
			class133_sub1_sub1.anInt3477 = class133_sub1_sub1.anInt3498;
			class133_sub1_sub1.anInt3482 = 0;
			class133_sub1_sub1.anInt3445 = i_1_;
			if (class133_sub1_sub1.anInt3445 != -1)
				JunkTex.method509(class133_sub1_sub1.anInt3495, class133_sub1_sub1.anInt3501, -115,
						(class133_sub1_sub1 == Class14_Sub3.aClass133_Sub1_Sub1_2748),
						JunkTex.method1129(class133_sub1_sub1.anInt3445, 87), class133_sub1_sub1.anInt3436);
		}
	}

	public static void method1410(int i) {
		if (i != -28990)
			method1410(-53);
		aClass9_1335 = null;
		aClass52_1339 = null;
		aClass112Array1341 = null;
	}
}
