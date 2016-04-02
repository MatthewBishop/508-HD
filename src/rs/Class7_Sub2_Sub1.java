/* Class7_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.HashTable;

import rs.tex.Class14_Sub8;
import rs.tex.Class14_Sub8_Sub9;

public class Class7_Sub2_Sub1 extends Class7_Sub2 {
	public static HashTable aClass55_3698;
	public static boolean aBoolean3699;
	public static boolean[] aBooleanArray3703 = new boolean[100];
	public static int anInt3705;

	static {
		aBoolean3699 = false;
		aClass55_3698 = new HashTable(4096);
		anInt3705 = 0;
	}

	public static int method128(int i) {
		if (i != 1) {
			int i_0_ = -71;
			return i_0_;
		}
		if ((double) Class14_Sub8.aFloat2854 == 3.0) {
			int i_1_ = 37;
			return i_1_;
		}
		if ((double) Class14_Sub8.aFloat2854 == 4.0) {
			int i_2_ = 50;
			return i_2_;
		}
		if (6.0 == (double) Class14_Sub8.aFloat2854) {
			int i_3_ = 75;
			return i_3_;
		}
		int i_4_ = 100;
		return i_4_;
	}

	public static void method129(int i) {
		aBooleanArray3703 = null;
		aClass55_3698 = null;
		if (i != 75)
			method130((byte) 108);
	}

	public static void method130(byte i) {
		if (i != 110)
			aClass55_3698 = null;
		Class14_Sub8_Sub9.aClass52_4240.clear();
	}
}
