/* Class14_Sub19 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.FontMetrics;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Linkable;

public class Class14_Sub19 extends Linkable {
	public static Class124 aClass124_3065 = Class124.method263(1178, ")4l=");
	public int anInt3067;
	public static Buffer aClass14_Sub10_3068;
	public byte[] aByteArray3069;
	public static Class94 aClass94_3070;
	public static int anInt3071;
	public static int anInt3073 = 0;
	public static int[] anIntArray3074;
	public static Class124 aClass124_3075;
	public Class9_Sub1 aClass9_Sub1_3076;
	public Class114 aClass114_3077;
	public static int[] x_max_occluders;
	public static FontMetrics aFontMetrics3081;
	public static int[] anIntArray3082;

	static {
		anInt3071 = 0;
		aClass124_3075 = Class124.method263(1178, "<img=1>");
		aClass94_3070 = null;
		x_max_occluders = new int[2];
		anIntArray3074 = new int[] { 1, 0, -1, 0 };
		aClass14_Sub10_3068 = new Buffer(new byte[5000]);
		anIntArray3082 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
	}

	public static void method887(byte i) {
		x_max_occluders = null;
		aClass94_3070 = null;
		anIntArray3074 = null;
		aFontMetrics3081 = null;
		anIntArray3082 = null;
		aClass124_3075 = null;
		if (i <= -89) {
			aClass14_Sub10_3068 = null;
			aClass124_3065 = null;
		}
	}

	public static Class14_Sub2_Sub16 method888(int i, int i_0_, Class9 class9, int i_1_, Class9 class9_2_) {
		if (!Static3.method1564(i_1_, i_0_, class9_2_)) {
			Class14_Sub2_Sub16 class14_sub2_sub16 = null;
			return class14_sub2_sub16;
		}
		if (i >= -101)
			method887((byte) 72);
		Class14_Sub2_Sub16 class14_sub2_sub16 = Class33.method1086(class9.method163(i_1_, i_0_, 0), 24);
		return class14_sub2_sub16;
	}

	public static Class14_Sub2_Sub5 method889(Buffer class14_sub10, int i) {
		Class14_Sub2_Sub5 class14_sub2_sub5 = new Class14_Sub2_Sub5(class14_sub10.method797(9467),
				class14_sub10.method797(9467), class14_sub10.readUShort(), class14_sub10.readUShort(),
				class14_sub10.getInt((byte) -96), class14_sub10.readUByte() == 1);
		int i_3_ = class14_sub10.readUByte();
		for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
			class14_sub2_sub5.aClass2_3801
					.pushBack(
							new Class14_Sub4(class14_sub10.readUShort(), class14_sub10.readUShort(),
									class14_sub10.readUShort(), class14_sub10.readUShort()));
		int i_5_ = -68 / ((i - 22) / 61);
		class14_sub2_sub5.method281(12800);
		Class14_Sub2_Sub5 class14_sub2_sub5_6_ = class14_sub2_sub5;
		return class14_sub2_sub5_6_;
	}

	public static int method890(int i, int i_7_) {
		if (i_7_ != 2)
			aClass124_3065 = null;
		int i_8_ = i >>> 8;
		return i_8_;
	}

	public static void method891(Class9 class9, int i, Class9 class9_9_) {
		Class108.aClass9_1817 = class9;
		JunkTex.aClass9_429 = class9_9_;
		int i_10_ = -9 / ((i + 52) / 63);
	}
}
