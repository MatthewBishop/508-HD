/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;

public class Class51 {
	public static int anInt828;
	public static int anInt830;
	public static int anInt831;
	public int anInt832;
	public static FileSystem aFileSystem_833;
	public int anInt834;
	public static int[] anIntArray835;
	public static int anInt839;
	public static Class124 aClass124_841;
	public int anInt842;

	static {
		anInt828 = 10;
		aClass124_841 = Class124.method263("Weiter");
		anInt839 = 0;
		anInt830 = (int) (Math.random() * 17.0) - 8;
		anInt831 = 0;
	}

	public void method1198(Buffer class14_sub10, int i) {
		int i_0_ = 121 % ((i + 61) / 53);
		for (;;) {
			int i_1_ = class14_sub10.readUByte();
			if (i_1_ == 0)
				break;
			method1199(i_1_, class14_sub10, (byte) -61);
		}
	}

	public void method1199(int i, Buffer class14_sub10, byte i_2_) {
		if (i == 1) {
			anInt842 = class14_sub10.readUShort();
			anInt832 = class14_sub10.readUByte();
			anInt834 = class14_sub10.readUByte();
		}
		int i_3_ = -46 / ((9 - i_2_) / 44);
	}

	public static void method1200(int i) {
		aFileSystem_833 = null;
		aClass124_841 = null;
		anIntArray835 = null;
	}
}
