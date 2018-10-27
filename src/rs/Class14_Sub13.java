/* Class14_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.js5.CacheFileWorker;
import com.jagex.link.Linkable;

public class Class14_Sub13 extends Linkable {
	public static Class124 aClass124_2955 = Class124.method263("Fallen lassen");
	public static CacheFileWorker aCacheFileWorker_2958;
	public long aLong2963;
	public static int anInt2964 = 0;

	public static void method858(int i) {
		Class60.aBoolean983 = true;
	}

	public static void method859(int i, int i_0_) {
		Static2.aClass52_3942.method1208(i_0_);
	}

	public static void method862(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		if (i <= 121)
			aClass124_2955 = null;
		for (int i_39_ = 0; i_39_ < Class14_Sub17.anInt3012; i_39_++) {
			if ((Class110.anIntArray1854[i_39_] + Static2.anIntArray215[i_39_] > i_38_)
					&& Static2.anIntArray215[i_39_] < i_38_ + i_35_
					&& i_37_ < (Class74.anIntArray1135[i_39_] + Class137.anIntArray2205[i_39_])
					&& Class74.anIntArray1135[i_39_] < i_37_ + i_36_)
				JunkTex.aBooleanArray4698[i_39_] = true;
		}
	}

	public static void method863() {
		aCacheFileWorker_2958 = null;
		aClass124_2955 = null;
	}

	public Class14_Sub13() {
		/* empty */
	}

	public Class14_Sub13(long l) {
		aLong2963 = l;
	}
}
