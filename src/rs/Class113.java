/* Class113 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class113 {
	public static int anInt1879;
	public static int anInt1881 = 0;
	static {
		anInt1879 = 0;
	}
	public static void method1580() {
		Class64.anInt1012 = 0;
		JunkTex.anInt4255 = 0;
		Class59.method1262();
		JunkTex.method1131(-128);
		JunkTex.method1728((byte) 22);
		JunkTex.method571(false);
		for (int i = 0; JunkTex.anInt4255 > i; i++) {
			int i_0_ = Class36.anIntArray626[i];
			if (Class14_Sub2_Sub20.anInt4064 != (JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_0_].anInt3447)) {
				if ((JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_0_].anInt4917) > 0)
					JunkTex.method551((JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_0_]), -574);
				JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[i_0_] = null;
			}
		}
		if (JunkTex.anInt4280 != JunkTex.aClass14_Sub10_Sub1_4734.position)
			throw new RuntimeException(
					new StringBuilder("gpp1 pos:").append(JunkTex.aClass14_Sub10_Sub1_4734.position)
							.append(" psize:").append(JunkTex.anInt4280).toString());
		for (int i = 0; i < Static2.anInt2878; i++) {
			if ((JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[Static2.anIntArray351[i]]) == null)
				throw new RuntimeException(new StringBuilder("gpp2 pos:").append(i).append(" size:")
						.append(Static2.anInt2878).toString());
		}
	}
	public SceneGraphNode aSceneGraphNode_1877;
	public SceneGraphNode aSceneGraphNode_1884;
	public long aLong1887 = 0L;
	public int anInt1878;
	public int anInt1880;

	public int anInt1882;

	public int anInt1886;

	public int anInt1888;
}
