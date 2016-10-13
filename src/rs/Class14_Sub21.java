/* Class14_Sub21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Linkable;
import com.jagex.rt4.Class14_Sub27;
import com.jagex.rt4.RT4GL;
import com.jagex.util.BrowserControlUtil;

public class Class14_Sub21 extends Linkable {
	public static Class124 aClass124_3099;
	public static Class32[] aClass32Array3100;
	public Class124 aClass124_3101;
	public static int anInt3102 = 0;
	public int anInt3103;
	public static Class124 aClass124_3104;
	public Class94 aClass94_3105;
	public int anInt3106;
	public int anInt3108;
	public boolean aBoolean3109;
	public static Class9_Sub1 aClass9_Sub1_3111;
	public int anInt3113;
	public int anInt3114;
	public Object[] anObjectArray3115;
	public Class94 aClass94_3116;

	static {
		aClass124_3099 = Class14_Sub2_Sub2.method263(1178, "<img=0>");
		aClass124_3104 = Class14_Sub2_Sub2.method263(1178, "(U");
		aClass32Array3100 = new Class32[4];
	}

	public static void method893(byte i) {
		int i_0_ = -5 % ((i - 57) / 37);
		aClass9_Sub1_3111 = null;
		aClass124_3104 = null;
		aClass32Array3100 = null;
		aClass124_3099 = null;
	}

	public static void method894(Class94 class94, int i, boolean bool, int i_1_, int i_2_) {
		int i_3_ = class94.anInt1518;
		if (class94.aByte1509 == 0)
			class94.anInt1518 = class94.anInt1485;
		else if (class94.aByte1509 == 1)
			class94.anInt1518 = -class94.anInt1485 + i_1_;
		else if (class94.aByte1509 != 2) {
			if (class94.aByte1509 == 3) {
				if (class94.anInt1489 != 2) {
					if (class94.anInt1489 == 7)
						class94.anInt1518 = (class94.anInt1485 * 115 + class94.anInt1454 * (class94.anInt1485 - 1));
				} else
					class94.anInt1518 = ((class94.anInt1485 - 1) * class94.anInt1454 + class94.anInt1485 * 32);
			}
		} else
			class94.anInt1518 = class94.anInt1485 * i_1_ >> 46;
		if (i != 1)
			aClass9_Sub1_3111 = null;
		int i_4_ = class94.anInt1545;
		if (class94.aByte1536 == 0)
			class94.anInt1545 = class94.anInt1488;
		else if (class94.aByte1536 != 1) {
			if (class94.aByte1536 != 2) {
				if (class94.aByte1536 == 3) {
					if (class94.anInt1489 == 2)
						class94.anInt1545 = ((class94.anInt1488 - 1) * class94.anInt1613 + class94.anInt1488 * 32);
					else if (class94.anInt1489 == 7)
						class94.anInt1545 = (class94.anInt1613 * (class94.anInt1488 - 1) + class94.anInt1488 * 12);
				}
			} else
				class94.anInt1545 = i_2_ * class94.anInt1488 >> 46;
		} else
			class94.anInt1545 = -class94.anInt1488 + i_2_;
		if (class94.aByte1509 == 4)
			class94.anInt1518 = class94.anInt1467 * class94.anInt1545 / class94.anInt1464;
		if (class94.aByte1536 == 4)
			class94.anInt1545 = class94.anInt1464 * class94.anInt1518 / class94.anInt1467;
		if (JunkTex.aBoolean3392 && (client.method46(class94) != 0 || class94.anInt1489 == 0)) {
			if (class94.anInt1545 < 5 && class94.anInt1518 < 5) {
				class94.anInt1545 = 5;
				class94.anInt1518 = 5;
			} else {
				if (class94.anInt1518 <= 0)
					class94.anInt1518 = 5;
				if (class94.anInt1545 <= 0)
					class94.anInt1545 = 5;
			}
		}
		if (class94.anInt1498 == 1337)
			Class127.aClass94_2114 = class94;
		if (bool && class94.anObjectArray1604 != null && (class94.anInt1518 != i_3_ || i_4_ != class94.anInt1545)) {
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.aClass94_3116 = class94;
			class14_sub21.anObjectArray3115 = class94.anObjectArray1604;
			Class1.aClass2_70.pushBack(class14_sub21);
		}
	}

	public static void method895(int i, Class14_Sub27[] class14_sub27s) {
		JunkTex.aClass14_Sub27ArrayArray2464[i] = class14_sub27s;
	}

	public static int method896(int i, int i_5_) {
		if (i > -96) {
			int i_6_ = 123;
			return i_6_;
		}
		int i_7_ = i_5_ >>> 7;
		return i_7_;
	}

	public static void method897(int i) {
		RT4GL.method1630();
		if (i <= 108)
			method893((byte) 29);
		BrowserControlUtil.hide();
		Class63.method1280(Class49.aCanvas819, (byte) 123);
		Class76.method1356(false, Class49.aCanvas819);
		if (Class44.aClass129_726 != null)
			Class44.aClass129_726.method1765(true, Class49.aCanvas819);
		JunkTex.method1329(0);
		JunkTex.method572(Class49.aCanvas819, false);
		Class56_Sub1.method1242(Class49.aCanvas819, 0);
		if (Class44.aClass129_726 != null)
			Class44.aClass129_726.method1760(-14827, Class49.aCanvas819);
		Class63.method1276(-105);
		RT4GL.method1621(Class49.aCanvas819, Class135.anInt2189 * 2);
		Class14_Sub2_Sub12.method319(-31);
		Class132.method1779(0);
		Class132.aLong2169 = 0L;
	}
}
