/* Class40 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Deque;

public class Class40 {
	public static Class124 aClass124_665;
	public static Class124 aClass124_676 = Class124.method263("Use");
	public static Class124 aClass124_680;
	public static Class14_Sub29[][][] aClass14_Sub29ArrayArrayArray674;
	public static Deque aClass2_664;
	public static int[] spriteXOffsets;
	static {
		aClass124_665 = aClass124_676;
		aClass2_664 = new Deque();
		aClass124_680 = Class124.method263("gelb:");
	}
	public static void method1127(int i) {
		aClass124_676 = null;
		aClass124_680 = null;
		aClass124_665 = null;
		if (i != 0)
			aClass124_680 = null;
		aClass2_664 = null;
		spriteXOffsets = null;
		aClass14_Sub29ArrayArrayArray674 = null;
	}
	
	public SceneGraphNode aSceneGraphNode_679;
	public long bitPacked = 0L;
	public int anInt662;
	public int anInt663;
	public int z;
	public int x;
	public int anInt668;
	public int anInt669;
	public int anInt670;
	public int y;
	public int anInt672;

	public int anInt673;

	public int anInt678;

	public static Class40 method1291(int i, int i_5_, int i_6_) {
		Class14_Sub29 class14_sub29 = JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_5_][i_6_];
		if (class14_sub29 == null)
			return null;
		for (int i_7_ = 0; i_7_ < class14_sub29.anInt3242; i_7_++) {
			Class40 class40 = class14_sub29.aClass40Array3257[i_7_];
			if ((class40.bitPacked >> 29 & 0x3L) == 2L && class40.anInt668 == i_5_ && class40.anInt678 == i_6_)
				return class40;
		}
		return null;
	}
}
