/* Class90 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.applet.Class43;
import com.jagex.applet.ErrorReporting;
import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.rt4.AbstractSprite_Sub1;
import com.jagex.util.Util;

public class Class90 implements Runnable {
	public static boolean aBoolean1417 = false;
	public volatile boolean aBoolean1419 = false;
	public Class43 aClass43_1421;
	public volatile Class75[] aClass75Array1422 = new Class75[2];
	public static Class124 aClass124_1424 = Class124.method263("showVideoAd");
	public static Class124 aClass124_1425 = Class124.method263("::gc");
	public static float aFloat1426;
	public volatile boolean aBoolean1428 = false;

	public static void method1443(int i) {
		JunkTex.aClass52_4240.clearSoftReference();
		if (i != 2)
			method1445(95);
	}

	public static void method1444(int i, int i_0_, int i_1_, int i_2_, SceneGraphNode sceneGraphNode, SceneGraphNode sceneGraphNode_3_,
			int i_4_, int i_5_, long l) {
		if (sceneGraphNode != null || sceneGraphNode_3_ != null) {
			Class113 class113 = new Class113();
			class113.aLong1887 = l;
			class113.anInt1878 = i_0_ * 128 + 64;
			class113.anInt1886 = i_1_ * 128 + 64;
			class113.anInt1882 = i_2_;
			class113.aSceneGraphNode_1877 = sceneGraphNode;
			class113.aSceneGraphNode_1884 = sceneGraphNode_3_;
			class113.anInt1880 = i_4_;
			class113.anInt1888 = i_5_;
			for (int i_6_ = i; i_6_ >= 0; i_6_--) {
				if ((JunkTex.aClass14_Sub29ArrayArrayArray3368[i_6_][i_0_][i_1_]) == null)
					JunkTex.aClass14_Sub29ArrayArrayArray3368[i_6_][i_0_][i_1_] = new Class14_Sub29(i_6_, i_0_,
							i_1_);
			}
			JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_0_][i_1_].aClass113_3250 = class113;
		}
	}

	public static void method1445(int i) {
		aClass124_1425 = null;
		if (i != -104)
			method1446(96, null, -82, 36);
		aClass124_1424 = null;
	}

	public void run() {
		aBoolean1419 = true;
		while_216_: do {
			do {
				try {
					try {
						while (!aBoolean1428) {
							for (int i = 0; i < 2; i++) {
								Class75 class75 = aClass75Array1422[i];
								if (class75 != null)
									class75.method1341(-82);
							}
							Util.accuratesleep(10L);
							ErrorReporting.method555(45, aClass43_1421, null);
						}
					} catch (Exception exception) {
						try {
							Throwable throwable = new Throwable();
							ErrorReporting.method738(null, throwable, 95);
						} catch (Throwable throwable) {
							RuntimeException runtimeexception = new RuntimeException();
							aBoolean1419 = false;
							throw runtimeexception;
						}
						aBoolean1419 = false;
						break;
					}
					break while_216_;
				} catch (Throwable throwable) {
					break while_216_;
				}
			} while (false);
			return;
		} while (false);
		aBoolean1419 = false;
	}

	public static AbstractSprite_Sub1[] method1446(int var0, FileSystem var1, int var2, int var3) {
		try {
			AbstractSprite_Sub1[] var4;
			if (!Static3.method1564(var3, var0, var1)) {
				var4 = null;
				return var4;
			} else {
				if (var2 < 42) {
					aFloat1426 = -0.05313204F;
				}

				var4 = Class14_Sub17.method878((byte) -108);
				return var4;
			}
		} catch (Throwable var5) {
			throw Util.error(var5,
					"ob.C(" + var0 + ',' + (var1 != null ? "{...}" : "null") + ',' + var2 + ',' + var3 + ')');
		}
	}

	public static void method1447(int i, Class32[] class32s, boolean bool, byte[] is, int i_14_, int i_15_) {
		try {
			Buffer class14_sub10 = new Buffer(is);
			if (i_15_ == -23935) {
				int i_16_ = -1;
				for (;;) {
					int i_17_ = class14_sub10.method802(-73);
					if (i_17_ == 0)
						break;
					int i_18_ = 0;
					i_16_ += i_17_;
					for (;;) {
						int i_19_ = class14_sub10.method818((byte) 108);
						if (i_19_ == 0)
							break;
						i_18_ += i_19_ - 1;
						int i_20_ = i_18_ & 0x3f;
						int i_21_ = i_18_ >> 12;
						int i_22_ = (i_18_ & 0xfe8) >> 6;
						int i_23_ = class14_sub10.readUByte();
						int i_24_ = i_14_ + i_22_;
						int i_25_ = i_23_ & 0x3;
						int i_26_ = i + i_20_;
						int i_27_ = i_23_ >> 34;
						if (i_24_ > 0 && i_26_ > 0 && i_24_ < 103 && i_26_ < 103) {
							Class32 class32 = null;
							if (!bool) {
								int i_28_ = i_21_;
								if (((JunkTex.tileFlags[1][i_24_][i_26_]) & 0x2) == 2)
									i_28_ = i_21_ - 1;
								if (i_28_ >= 0)
									class32 = class32s[i_28_];
							}
							JunkTex.method1235(bool, i_25_, !bool, (byte) 50, class32, i_21_, i_26_, i_27_, i_24_,
									i_16_, i_21_);
						}
					}
				}
			}
		} catch (Throwable throwable) {
			throw Util.error(throwable,
					new StringBuilder("ob.E(").append(i).append(',').append(class32s != null ? "{...}" : "null")
							.append(',').append(bool).append(',').append(is != null ? "{...}" : "null").append(',')
							.append(i_14_).append(',').append(i_15_).append(')').toString());
		}
	}
}
