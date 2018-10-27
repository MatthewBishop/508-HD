/* Class62 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;
import com.jagex.rt4.AtmosphericEffects;

public class Class62 {
	public static int anInt988 = 0;
	public static int anInt990 = 0;
	public static SoftCache aClass52_991 = new SoftCache(30);
	public static int[] anIntArray992;
	public static FileSystem aFileSystem_993;
	public static Class124 aClass124_994 = Class124.method263(":");
	public static Class124 aClass124_995 = Class124.method263("k");

	public static void method1274(int i) {
		aClass52_991 = null;
		aClass124_994 = null;
		anIntArray992 = null;
		aClass124_995 = null;
		if (i > 33) {
			aFileSystem_993 = null;
		}
	}

	public static void method1275(int i, int i_0_, int i_1_) {
		Class82.anInt1330 = OverlayType.aClass71ArrayArray2421[i][i_0_].lightX;
		Static2.anInt815 = OverlayType.aClass71ArrayArray2421[i][i_0_].lightY;
		if (i_1_ == 1) {
			JunkTex.anInt847 = OverlayType.aClass71ArrayArray2421[i][i_0_].lightZ;
			AtmosphericEffects.setSunPosition(Class82.anInt1330, Static2.anInt815, JunkTex.anInt847);
		}
	}
}
