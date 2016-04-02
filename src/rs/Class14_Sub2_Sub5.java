/* Class14_Sub2_Sub5 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Cacheable;
import com.jagex.link.Deque;
import com.jagex.link.Cache;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub22;
import rs.tex.Class14_Sub8_Sub24;

public class Class14_Sub2_Sub5 extends Cacheable {
	public int anInt3797 = 12800;
	public Deque aClass2_3801;
	public int anInt3802;
	public static boolean aBoolean3803;
	public Class124 aClass124_3804;
	public int anInt3805 = 0;
	public int anInt3806 = 12800;
	public Class124 aClass124_3807;
	public boolean aBoolean3809;
	public int anInt3810 = 0;
	public int anInt3812;
	public int anInt3813;
	public static Class124 aClass124_3814 = Class14_Sub2_Sub2.method263(1178, "(Y<)4col>");
	public static Cache aClass20_3815 = new Cache(128);
	public static byte[][][] aByteArrayArrayArray3816;
	public static Class9 aClass9_3817;
	public static boolean aBoolean3818 = false;

	public void method281(int i) {
		anInt3797 = i;
		anInt3810 = 0;
		anInt3805 = 0;
		anInt3806 = 12800;
		for (Class14_Sub4 class14_sub4 = (Class14_Sub4) aClass2_3801.getFront(); class14_sub4 != null; class14_sub4 = (Class14_Sub4) aClass2_3801.getNext()) {
			if (class14_sub4.anInt2779 < anInt3797)
				anInt3797 = class14_sub4.anInt2779;
			if (class14_sub4.anInt2776 < anInt3806)
				anInt3806 = class14_sub4.anInt2776;
			if (anInt3810 < class14_sub4.anInt2777)
				anInt3810 = class14_sub4.anInt2777;
			if (anInt3805 < class14_sub4.anInt2778)
				anInt3805 = class14_sub4.anInt2778;
		}
	}

	public static boolean method282(int i, int i_0_) {
		if (i_0_ != -1)
			aBoolean3803 = false;
		boolean bool = (i >> 30 & 0x1) != 0;
		return bool;
	}

	public static void method283(int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_) {
		if (i_7_ == i)
			Class133_Sub1.method1802(i_4_, i_5_, i_3_, 128, i_6_, i_1_, i);
		else {
			if (i_4_ - i >= Class118.anInt1982 && Class14_Sub8_Sub14.anInt4327 >= i + i_4_
					&& Class14_Sub17.anInt3005 <= i_5_ - i_7_ && i_7_ + i_5_ <= Class59.anInt955)
				Class14_Sub8_Sub24.method606(i_6_, i_3_, i_7_, i_5_, -15882, i_1_, i, i_4_);
			else
				Class14_Sub8_Sub22.method593(i_4_, i, i_1_, i_7_, i_2_ ^ ~0x77, i_3_, i_5_, i_6_);
			if (i_2_ != 0)
				aClass20_3815 = null;
		}
	}

	public static void method284(int i) {
		aClass9_3817 = null;
		aClass20_3815 = null;
		aByteArrayArrayArray3816 = null;
		aClass124_3814 = null;
		if (i != 12800)
			method284(41);
	}

	public static Class14_Sub28 method285(int i, Class9 class9, byte i_8_) {
		if (i_8_ <= 51) {
			Class14_Sub28 class14_sub28 = null;
			return class14_sub28;
		}
		byte[] is = class9.method165(83, i);
		if (is == null) {
			Class14_Sub28 class14_sub28 = null;
			return class14_sub28;
		}
		Class14_Sub28 class14_sub28 = new Class14_Sub28(is);
		return class14_sub28;
	}

	public boolean method286(int i, int i_9_, int i_10_) {
		if (i_10_ != -1347621730) {
			boolean bool = false;
			return bool;
		}
		if (anInt3797 > i || i > anInt3810 || i_9_ < anInt3806 || anInt3805 < i_9_) {
			boolean bool = false;
			return bool;
		}
		for (Class14_Sub4 class14_sub4 = (Class14_Sub4) aClass2_3801
				.getFront(); class14_sub4 != null; class14_sub4 = (Class14_Sub4) aClass2_3801.getNext()) {
			if (class14_sub4.method456(i, i_9_, true))
				return true;
		}
		return false;
	}

	public Class14_Sub2_Sub5(Class124 class124, Class124 class124_11_, int i, int i_12_, int i_13_, boolean bool) {
		anInt3802 = -1;
		aBoolean3809 = true;
		anInt3813 = i;
		aClass124_3804 = class124;
		anInt3812 = i_12_;
		anInt3802 = i_13_;
		aBoolean3809 = bool;
		aClass124_3807 = class124_11_;
		aClass2_3801 = new Deque();
	}
}
