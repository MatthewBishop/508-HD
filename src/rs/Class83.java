/* Class83 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.AnimLoader;
import com.jagex.cache.anim.Animation;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class Class83 {
	public static FileSystem aFileSystem_1335;
	public static int anInt1338;
	public static SoftCache aClass52_1339 = new SoftCache(20);
	public static Class112[] aClass112Array1341 = new Class112[50];
	
	public static Class124 method1407(int i, int i_0_) {
		if (i < 8)
			method1410(-29);
		Class124 class124 = Class54.method1220(i_0_, true, false, 10);
		return class124;
	}

	public static void method1408(SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1, int i, boolean bool, int i_1_) {
		if (i_1_ == class133_sub1_sub1.anInt3445 && i_1_ != -1) {
			Animation animation = AnimLoader.method1129(i_1_);
			int i_2_ = animation.anInt753;
			if (i_2_ == 1) {
				class133_sub1_sub1.anInt3458 = 0;
				class133_sub1_sub1.anInt3467 = i;
				class133_sub1_sub1.anInt3501 = 0;
				class133_sub1_sub1.anInt3482 = 0;
				JunkTex.method509(class133_sub1_sub1.anInt3495, class133_sub1_sub1.anInt3501, 59,
						((Static2.aSceneGraphNode_GameEntity_Sub1_2748) == class133_sub1_sub1), animation,
						class133_sub1_sub1.anInt3436);
			}
			if (i_2_ == 2)
				class133_sub1_sub1.anInt3482 = 0;
		} else if (i_1_ == -1 || class133_sub1_sub1.anInt3445 == -1 || (AnimLoader.method1129(i_1_).anInt777 >= (AnimLoader.method1129(class133_sub1_sub1.anInt3445).anInt777))) {
			class133_sub1_sub1.anInt3467 = i;
			class133_sub1_sub1.anInt3458 = 0;
			class133_sub1_sub1.anInt3501 = 0;
			class133_sub1_sub1.anInt3477 = class133_sub1_sub1.anInt3498;
			class133_sub1_sub1.anInt3482 = 0;
			class133_sub1_sub1.anInt3445 = i_1_;
			if (class133_sub1_sub1.anInt3445 != -1)
				JunkTex.method509(class133_sub1_sub1.anInt3495, class133_sub1_sub1.anInt3501, -115,
						(class133_sub1_sub1 == Static2.aSceneGraphNode_GameEntity_Sub1_2748),
						AnimLoader.method1129(class133_sub1_sub1.anInt3445), class133_sub1_sub1.anInt3436);
		}
	}

	public static void method1410(int i) {
		if (i != -28990)
			method1410(-53);
		aFileSystem_1335 = null;
		aClass52_1339 = null;
		aClass112Array1341 = null;
	}
}
