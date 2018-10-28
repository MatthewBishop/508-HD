/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Deque;

public class Class128 {
	public static Deque[][][] aClass2ArrayArrayArray2119 = new Deque[4][104][104];
	public static Class124 aClass124_2122;
	public static Class124 aClass124_2123 = Class124.method263("glow3:");
	public static Class124 aClass124_2126;
	public static Class124 aClass124_2128 = Class124.method263("p12_full");

	static {
		aClass124_2126 = aClass124_2123;
		aClass124_2122 = aClass124_2123;
	}

	public static boolean method1755(int i) {
		if (i != 130068615)
			method1755(-57);
		boolean bool = true;
		return bool;
	}

	public static void method1756(boolean bool) {
		if (!bool)
			aClass124_2128 = null;
		aClass2ArrayArrayArray2119 = null;
		aClass124_2128 = null;
		aClass124_2126 = null;
		aClass124_2122 = null;
		aClass124_2123 = null;
	}

	public static boolean method1757(int i, int i_0_, int i_1_, int i_2_, SceneGraphNode sceneGraphNode, int i_3_, long l, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		if (sceneGraphNode == null)
			return true;
		return JunkTex.method580(i, i_4_, i_5_, i_6_ - i_4_ + 1, i_7_ - i_5_ + 1, i_0_, i_1_, i_2_, sceneGraphNode,
				i_3_, true, l);
	}
}
