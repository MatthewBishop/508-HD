/* Class14_Sub2_Sub9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub24;
import rs.tex.Class14_Sub8_Sub38;

public class Class14_Sub2_Sub9 extends Cacheable {
	public static byte[][][] aByteArrayArrayArray3864;
	public static Class124 aClass124_3861 = Class14_Sub2_Sub2.method263(1178, ")1j");
	public static int anInt3856;
	public static int anInt3866;
	public static int[] anIntArray3859 = { -1, -1, 1, 1 };
	public byte aByte3862;
	public Class9_Sub1 aClass9_Sub1_3857;
	public int anInt3865;

	public static void method302(byte i) {
		anIntArray3859 = null;
		aClass124_3861 = null;
		aByteArrayArrayArray3864 = null;
	}

	public static Class14_Sub8 method303(Buffer class14_sub10) {
		class14_sub10.readUByte();
		int i_0_ = class14_sub10.readUByte();
		Class14_Sub8 class14_sub8 = Class149.method2016(i_0_, 0 ^ 0x7d);
		class14_sub8.anInt2837 = class14_sub10.readUByte();
		int i_1_ = class14_sub10.readUByte();
		for (int i_2_ = 0; i_1_ > i_2_; i_2_++) {
			int i_3_ = class14_sub10.readUByte();
			class14_sub8.method475(i_3_, 0 ^ 0x60c9, class14_sub10);
		}
		class14_sub8.method472();
		Class14_Sub8 class14_sub8_4_ = class14_sub8;
		return class14_sub8_4_;
	}

	public static void method304() {
		for (int i = 0; i < Class14_Sub8_Sub38.anInt4727; i++) {
			Class40 class40 = Class14_Sub20.aClass40Array3093[i];
			Class63.method1279(class40);
			Class14_Sub20.aClass40Array3093[i] = null;
		}
		Class14_Sub8_Sub38.anInt4727 = 0;
	}

	public static void method305(Class9 class9, Class9 class9_5_, Class9 class9_6_, Class9 class9_7_, byte i) {
		Class134.aClass9_2598 = class9_6_;
		Class83.aClass9_1335 = class9_7_;
		if (i <= -48) {
			Class14_Sub8_Sub24.aClass9_4486 = class9_5_;
			Class51.aClass9_833 = class9;
			Class1.aClass94ArrayArray75 = new Class94[Class83.aClass9_1335.method155(6756)][];
			Class108.aBooleanArray1819 = new boolean[Class83.aClass9_1335.method155(6756)];
		}
	}
}
