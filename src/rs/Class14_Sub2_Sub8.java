/* Class14_Sub2_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Image;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.IntegerNode;
import com.jagex.rt4.AbstractSprite_Sub1_Sub2;

public class Class14_Sub2_Sub8 extends Cacheable {
	public HashTable aClass55_3829;
	public static Image anImage3830;
	public static int anInt3832;
	public static int[] anIntArray3834 = { 160, 192, 80, 96, 0, 144, 80, 48, 160 };
	public static AbstractSprite_Sub1_Sub2 aClass14_Sub2_Sub19_Sub1_Sub2_3836;
	public static short aShort3839;
	public static Class124 aClass124_3842 = Class124.method263("Loaded wordpack");
	public static int anInt3843;
	public int anInt3845;
	public static int[][] anIntArrayArray3846;
	public Class124 aClass124_3847 = Class109.aClass124_1831;
	public static Class9 aClass9_3848;
	public static Class9 aClass9_3850;
	public int anInt3851;
	public static Class124 aClass124_3852;
	public static int cameraZ;
	public HashTable aClass55_3854;
	public int anInt3855;

	static {
		aShort3839 = (short) 1;
		anIntArrayArray3846 = new int[104][104];
		aClass124_3852 = aClass124_3842;
	}

	public void method290(boolean bool, Buffer class14_sub10) {
		for (;;) {
			int i = class14_sub10.readUByte();
			if (i == 0)
				break;
			method298(class14_sub10, 192, i);
		}
	}

	public static void method291(byte i) {
		aClass124_3842 = null;
		anIntArrayArray3846 = null;
		anIntArray3834 = null;
		aClass9_3850 = null;
		aClass9_3848 = null;
		if (i != -78)
			aClass124_3842 = null;
		aClass14_Sub2_Sub19_Sub1_Sub2_3836 = null;
		aClass124_3852 = null;
		anImage3830 = null;
	}

	public void method292(boolean bool) {
		aClass55_3854 = new HashTable(aClass55_3829.getBucketCount());
		if (!bool) {
			for (IntegerNode class14_sub1 = (IntegerNode) aClass55_3829
					.getFirst(); class14_sub1 != null; class14_sub1 = (IntegerNode) aClass55_3829
							.getNext()) {
				IntegerNode class14_sub1_0_ = new IntegerNode((int) class14_sub1.key);
				aClass55_3854.put(class14_sub1.value, class14_sub1_0_);
			}
		}
	}

	public void method293(byte i) {
		aClass55_3854 = new HashTable(aClass55_3829.getBucketCount());
		for (Class14_Sub30 class14_sub30 = (Class14_Sub30) aClass55_3829
				.getFirst(); class14_sub30 != null; class14_sub30 = (Class14_Sub30) aClass55_3829
						.getNext()) {
			Class14_Sub11 class14_sub11 = new Class14_Sub11(class14_sub30.aClass124_3270, (int) class14_sub30.key);
			aClass55_3854.put(class14_sub30.aClass124_3270.method1680(i ^ 0x43), class14_sub11);
		}
		if (i != 95)
			method290(false, null);
	}

	public boolean method294(int i, int i_1_) {
		if (aClass55_3829 == null) {
			boolean bool = false;
			return bool;
		}
		if (i_1_ != 96)
			aClass14_Sub2_Sub19_Sub1_Sub2_3836 = null;
		if (aClass55_3854 == null)
			method292(false);
		IntegerNode class14_sub1 = (IntegerNode) aClass55_3854.get(i);
		if (class14_sub1 == null) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public Class124 method295(int i, int i_2_) {
		if (aClass55_3829 == null) {
			Class124 class124 = aClass124_3847;
			return class124;
		}
		Class14_Sub30 class14_sub30 = ((Class14_Sub30) aClass55_3829.get(i_2_));
		if (i >= -48) {
			Class124 class124 = null;
			return class124;
		}
		if (class14_sub30 == null) {
			Class124 class124 = aClass124_3847;
			return class124;
		}
		Class124 class124 = class14_sub30.aClass124_3270;
		return class124;
	}

	public static int method296(byte i) {
		if (Class1.aBoolean74) {
			int i_3_ = 0;
			return i_3_;
		}
		if (!Class128.method1755(130068615)) {
			int i_4_ = 1;
			return i_4_;
		}
		int i_5_ = Class139.aBoolean2233 ? 2 : 1;
		return i_5_;
	}

	public static void method297(byte i) {
		for (int i_6_ = 0; i_6_ < 100; i_6_++)
			JunkTex.aBooleanArray4698[i_6_] = true;
	}

	public void method298(Buffer class14_sub10, int i, int i_7_) {
		if (i_7_ != 1) {
			if (i_7_ != 2) {
				if (i_7_ != 3) {
					if (i_7_ == 4)
						anInt3855 = class14_sub10.getInt((byte) -107);
					else if (i_7_ == 5 || i_7_ == 6) {
						int i_8_ = class14_sub10.readUShort();
						aClass55_3829 = new HashTable(JunkTex.method653(i_8_));
						for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
							int i_10_ = class14_sub10.getInt((byte) -115);
							Linkable linkable;
							if (i_7_ != 5)
								linkable = (new IntegerNode(class14_sub10.getInt((byte) -104)));
							else
								linkable = new Class14_Sub30(class14_sub10.method797());
							aClass55_3829.put(i_10_, linkable);
						}
					}
				} else
					aClass124_3847 = class14_sub10.method797();
			} else
				anInt3845 = class14_sub10.readUByte();
		} else
			anInt3851 = class14_sub10.readUByte();
		if (i != 192)
			aClass124_3852 = null;
	}

	public int method299(int i, int i_11_) {
		if (aClass55_3829 == null) {
			int i_12_ = anInt3855;
			return i_12_;
		}
		if (i != 2) {
			int i_13_ = 57;
			return i_13_;
		}
		IntegerNode class14_sub1 = ((IntegerNode) aClass55_3829.get(i_11_));
		if (class14_sub1 == null) {
			int i_14_ = anInt3855;
			return i_14_;
		}
		int i_15_ = class14_sub1.value;
		return i_15_;
	}

	public boolean method300(Class124 class124, byte i) {
		if (i >= -87)
			cameraZ = -32;
		if (aClass55_3829 == null) {
			boolean bool = false;
			return bool;
		}
		if (aClass55_3854 == null)
			method293((byte) 95);
		for (Class14_Sub11 class14_sub11 = ((Class14_Sub11) aClass55_3854.get(class124.method1680(60))); class14_sub11 != null; class14_sub11 = (Class14_Sub11) aClass55_3854.getLastRetrieved()) {
			if (class14_sub11.aClass124_2940.method1704(class124, (byte) 54))
				return true;
		}
		return false;
	}
}
