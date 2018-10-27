/* Class14_Sub29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.Deque;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.util.Util;

public class Class14_Sub29 extends Linkable {
	public static Class124 aClass124_3263;
	public static Class148_Sub1[] aClass148_Sub1Array3265;
	public static int anInt3238;
	public static int anInt3266;
	public static int anInt3267;
	public static int[] anIntArray3245 = new int[99];
	public static int[] anIntArray3264;
	public static short[] aShortArray3262;
	static {
		anInt3238 = -1;
		int i = 0;
		for (int i_0_ = 0; i_0_ < 99; i_0_++) {
			int i_1_ = i_0_ + 1;
			int i_2_ = (int) (i_1_ + Math.pow(2.0, i_1_ / 7.0) * 300.0);
			i += i_2_;
			anIntArray3245[i_0_] = i / 4;
		}
		aShortArray3262 = new short[500];
		anIntArray3264 = new int[5];
		anInt3266 = 127;
		aClass124_3263 = Class124.method263("::");
	}
	public static void method930(byte i) {
		try {
			if (i == -34) {
				aClass124_3263 = null;
				anIntArray3245 = null;
				anIntArray3264 = null;
				aShortArray3262 = null;
				aClass148_Sub1Array3265 = null;
			}
		} catch (Throwable throwable) {
			throw Util.error(throwable, new StringBuilder("ve.D(").append(i).append(')').toString());
		}
	}
	public static int method931(int var0, int var2) {
		try {
			byte var3 = 0;
			Class14_Sub25 var4 = (Class14_Sub25) Class132.aClass55_2167.get(var2);
			if (var4 == null) {
				return var3;
			} else {
				var3 = 0;
				if (var0 >= 0 && var4.anIntArray3177.length > var0) {
					int var5 = var4.anIntArray3177[var0];
					return var5;
				} else {
					return var3;
				}
			}
		} catch (Throwable var6) {
			throw Util.error(var6, "ve.G(" + var0 + ',' + var2 + ')');
		}
	}
	public static int method932(int i, int i_17_) {
		if (i_17_ != 21661)
			method932(-66, -87);
		int i_18_ = i >>> 40;
		return i_18_;
	}
	public static void method934(FileSystem fileSystem, int i) {
		JunkTex.aFileSystem_4371 = fileSystem;
	}
	public static void method935(int i, boolean bool) {
		Class7_Sub2.anInt2676 = 99;
		Class21.anIntArray442 = new int[104];
		Class115.anIntArray1917 = new int[104];
		Static2.anIntArray4023 = new int[104];
		JunkTex.anIntArray4020 = new int[104];
		Class14_Sub2_Sub3.anIntArray3773 = new int[104];
		int i_27_;
		if (!bool)
			i_27_ = 4;
		else
			i_27_ = 1;
		Static2.aByteArrayArrayArray3354 = new byte[i_27_][105][105];
		Class97.underlays = new byte[i_27_][104][104];
		JunkTex.overlayTypes = new byte[i_27_][104][104];
		Class15.overlayOrientations = new byte[i_27_][104][104];
		if (i != 5)
			method932(-78, -17);
		Class66.anIntArrayArrayArray135 = new int[i_27_][105][105];
		JunkTex.overlays = new byte[i_27_][104][104];
	}
	public static void method936(int i) {
		Class40.aClass2_664 = new Deque();
	}
	public boolean aBoolean3235;
	public boolean aBoolean3240;
	public boolean aBoolean3251;
	public Class113 aClass113_3250;
	public Class115 aClass115_3256;
	public Class14_Sub29 aClass14_Sub29_3260;
	public Class153 aClass153_3248;
	public Class37 aClass37_3255;
	public Class4 aClass4_3237;
	public Class40[] aClass40Array3257 = new Class40[5];
	public Class6 aClass6_3233;
	public int anInt3231;
	public int anInt3234;
	public int anInt3236;
	public int anInt3239;

	public int anInt3242;

	public int anInt3243;

	public int anInt3249;

	public int anInt3252;

	public int anInt3258;

	public int anInt3261;

	public int[] anIntArray3247 = new int[5];

	public Class14_Sub29(int i, int i_3_, int i_4_) {
		anInt3249 = 0;
		anInt3239 = i_4_;
		anInt3258 = i_3_;
		anInt3261 = anInt3243 = i;
	}
}
