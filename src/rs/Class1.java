/* Class1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.ErrorReporting;
import com.jagex.link.Deque;

public class Class1 {
	public static int[] anIntArray69 = new int[32];
	public static Deque aClass2_70;
	public static Class124 aClass124_71;
	public static Class124 aClass124_72;
	public static int anInt73;
	public static boolean aBoolean74;
	public static Class94[][] aClass94ArrayArray75;

	static {
		int i = 2;
		for (int i_0_ = 0; i_0_ < 32; i_0_++) {
			anIntArray69[i_0_] = i - 1;
			i += i;
		}
		aClass124_71 = (Class124.method263("Ihre Freunde)2Liste ist voll(Q Maximale Eintr-=ge: Mitglieder 200)4freie Spieler 100"));
		aClass124_72 = Class124.method263("Mem:");
		aClass2_70 = new Deque();
		anInt73 = 0;
		aBoolean74 = false;
	}

	public static void method70(int i, int i_1_, int i_2_) {
		for (int i_3_ = 0; i_3_ < Class83.anInt1338; i_3_++) {
			for (int i_4_ = 0; i_4_ < Static2.anInt3338; i_4_++) {
				for (int i_5_ = 0; i_5_ < JunkTex.anInt4337; i_5_++) {
					Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i_3_][i_4_][i_5_]);
					if (class14_sub29 != null) {
						Class113 class113 = class14_sub29.aClass113_3250;
						if (class113 != null && class113.aSceneGraphNode_1877.method1784()) {
							SceneGraphNode_GameEntity.method1803(class113.aSceneGraphNode_1877, i_3_, i_4_, i_5_, 1, 1);
							if (class113.aSceneGraphNode_1884 != null && class113.aSceneGraphNode_1884.method1784()) {
								SceneGraphNode_GameEntity.method1803((class113.aSceneGraphNode_1884), i_3_, i_4_, i_5_, 1, 1);
								class113.aSceneGraphNode_1877.method1788(class113.aSceneGraphNode_1884, 0, 0, 0, false);
								class113.aSceneGraphNode_1884 = class113.aSceneGraphNode_1884.method1791(i, i_1_, i_2_);
							}
							class113.aSceneGraphNode_1877 = class113.aSceneGraphNode_1877.method1791(i, i_1_, i_2_);
						}
						for (int i_6_ = 0; i_6_ < class14_sub29.anInt3242; i_6_++) {
							Class40 class40 = class14_sub29.aClass40Array3257[i_6_];
							if (class40 != null && class40.aSceneGraphNode_679.method1784()) {
								SceneGraphNode_GameEntity.method1803(class40.aSceneGraphNode_679, i_3_, i_4_, i_5_,
										class40.anInt670 - class40.anInt668 + 1,
										class40.anInt669 - class40.anInt678 + 1);
								class40.aSceneGraphNode_679 = class40.aSceneGraphNode_679.method1791(i, i_1_, i_2_);
							}
						}
						Class4 class4 = class14_sub29.aClass4_3237;
						if (class4 != null && class4.aSceneGraphNode_124.method1784()) {
							Static2.method1339(class4.aSceneGraphNode_124, i_3_, i_4_, i_5_);
							class4.aSceneGraphNode_124 = class4.aSceneGraphNode_124.method1791(i, i_1_, i_2_);
						}
					}
				}
			}
		}
	}

	public static void method72(boolean bool) {
		anIntArray69 = null;
		aClass124_71 = null;
		aClass124_72 = null;
		aClass2_70 = null;
		if (bool)
			aClass94ArrayArray75 = null;
		aClass94ArrayArray75 = null;
	}

	public static int method73(byte i) {
		if (ErrorReporting.aFrame3962 != null) {
			int i_8_ = 2;
			return i_8_;
		}
		if (i != -58)
			aClass124_72 = null;
		if (JunkTex.aBoolean845) {
			int i_9_ = 1;
			return i_9_;
		}
		int i_10_ = 0;
		return i_10_;
	}
}
