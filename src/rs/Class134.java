/* Class134 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9;
import com.jagex.link.Cache;
import com.jagex.rt4.Class14_Sub2_Sub1;
import com.jagex.rt4.Class14_Sub2_Sub14;
import com.jagex.rt4.RT4;
import com.jagex.util.TextureDefInterface;

public class Class134 implements TextureDefInterface {
	
	public boolean aBoolean2581 = false;
	public boolean[] materialActive;
	public boolean[] aBooleanArray2594;
	public boolean[] aBooleanArray2600;
	public boolean[] aBooleanArray2604;
	public boolean[] aBooleanArray2609;
	public byte[] aByteArray2571;
	public byte[] aByteArray2576;
	public byte[] aByteArray2602;
	public byte[] aByteArray2608;
	public Cache aClass20_2585;
	public Cache aClass20_2595;
	public Class9 aClass9_2580;
	public Class9 aClass9_2587;
	public int anInt2582 = 50;

	public short[] textureColors;

	public Class134(Class9 class9, Class9 class9_24_, Class9 class9_25_, int i, boolean bool) {
		aClass9_2580 = class9;
		aClass9_2587 = class9_25_;
		aBoolean2581 = bool;
		anInt2582 = i;
		aClass20_2595 = new Cache(anInt2582);
		aClass20_2585 = new Cache(anInt2582);
		Buffer class14_sub10 = new Buffer(class9_24_.method163(0, 0, 0));
		int amountMaterials = class14_sub10.readUShort();
		aByteArray2602 = new byte[amountMaterials];
		aBooleanArray2600 = new boolean[amountMaterials];
		textureColors = new short[amountMaterials];
		aByteArray2576 = new byte[amountMaterials];
		aBooleanArray2604 = new boolean[amountMaterials];
		aByteArray2571 = new byte[amountMaterials];
		aBooleanArray2594 = new boolean[amountMaterials];
		aBooleanArray2609 = new boolean[amountMaterials];
		materialActive = new boolean[amountMaterials];
		aByteArray2608 = new byte[amountMaterials];
		for (int i_27_ = 0; i_27_ < amountMaterials; i_27_++)
			materialActive[i_27_] = class14_sub10.readUByte() == 1;
		for (int i_28_ = 0; amountMaterials > i_28_; i_28_++) {
			if (materialActive[i_28_])
				aBooleanArray2594[i_28_] = class14_sub10.readUByte() == 1;
		}
		for (int i_29_ = 0; amountMaterials > i_29_; i_29_++) {
			if (materialActive[i_29_])
				aBooleanArray2600[i_29_] = class14_sub10.readUByte() == 1;
		}
		for (int i_30_ = 0; amountMaterials > i_30_; i_30_++) {
			if (materialActive[i_30_])
				aBooleanArray2604[i_30_] = class14_sub10.readUByte() == 1;
		}
		for (int i_31_ = 0; i_31_ < amountMaterials; i_31_++) {
			if (materialActive[i_31_])
				aBooleanArray2609[i_31_] = class14_sub10.readUByte() == 1;
		}
		for (int i_32_ = 0; amountMaterials > i_32_; i_32_++) {
			if (materialActive[i_32_])
				aByteArray2571[i_32_] = class14_sub10.method780();
		}
		for (int i_33_ = 0; i_33_ < amountMaterials; i_33_++) {
			if (materialActive[i_33_])
				aByteArray2576[i_33_] = class14_sub10.method780();
		}
		for (int i_34_ = 0; amountMaterials > i_34_; i_34_++) {
			if (materialActive[i_34_])
				aByteArray2608[i_34_] = class14_sub10.method780();
		}
		for (int i_35_ = 0; i_35_ < amountMaterials; i_35_++) {
			if (materialActive[i_35_])
				aByteArray2602[i_35_] = class14_sub10.method780();
		}
		for (int i_36_ = 0; i_36_ < amountMaterials; i_36_++) {
			if (materialActive[i_36_])
				textureColors[i_36_] = (short) class14_sub10.readUShort();
		}
	}

	public boolean method10(int i_19_) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i_19_);
		if (class14_sub2_sub1 == null) {
			boolean bool = false;
			return bool;
		}
		boolean bool = class14_sub2_sub1.method254(aClass9_2587, 255, this);
		return bool;
	}

	public int[] method11(float f, int i) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i);
		if (class14_sub2_sub1 == null) {
			return null;
		}
		class14_sub2_sub1.aBoolean3746 = true;
		int[] is = class14_sub2_sub1.method255(this, f, -1, aClass9_2587, (aBoolean2581 || aBooleanArray2604[i]));
		return is;
	}

	public int method12(int i) {
		return aByteArray2608[i] & 0xff;
	}

	public boolean method13(int i_14_) {
		return aBooleanArray2594[i_14_];
	}

	public int method14(int i) {
		return aByteArray2576[i] & 0xff;
	}

	public boolean method15(int i_0_) {
		if (aBoolean2581 || aBooleanArray2604[i_0_]) {
			return true;
		}
		return false;
	}

	public void method16(int i) {
		boolean bool = false;
		RT4.method1778(aByteArray2608[i] & 0xff, aByteArray2602[i] & 0xff);
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i);
		if (class14_sub2_sub1 != null)
			bool = class14_sub2_sub1.method252(this, (aBoolean2581 || aBooleanArray2604[i]), 110, aClass9_2587);
		if (!bool) {
			Class14_Sub2_Sub14 class14_sub2_sub14 = method1923(i);
			class14_sub2_sub14.method337(true);
		}
	}

	public int[] method17(int i_15_) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = method1926(i_15_);
		if (class14_sub2_sub1 == null) {
			int[] is = null;
			return is;
		}
		int[] is = class14_sub2_sub1.method257(false, aClass9_2587, (aBoolean2581 || aBooleanArray2604[i_15_]), this);
		return is;
	}

	public void method1922(int i) {
		for (Class14_Sub2_Sub1 class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595
				.getFirst(); class14_sub2_sub1 != null; class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595
						.getNext()) {
			if (class14_sub2_sub1.aBoolean3746) {
				class14_sub2_sub1.method253(i, false);
				class14_sub2_sub1.aBoolean3746 = false;
			}
		}
	}

	public Class14_Sub2_Sub14 method1923(int i) {
		Class14_Sub2_Sub14 class14_sub2_sub14 = (Class14_Sub2_Sub14) aClass20_2585.get(i);
		if (class14_sub2_sub14 != null) {
			Class14_Sub2_Sub14 class14_sub2_sub14_9_ = class14_sub2_sub14;
			return class14_sub2_sub14_9_;
		}
		class14_sub2_sub14 = new Class14_Sub2_Sub14(textureColors[i] & 0xffff);
		aClass20_2585.put(class14_sub2_sub14, i);
		Class14_Sub2_Sub14 class14_sub2_sub14_10_ = class14_sub2_sub14;
		return class14_sub2_sub14_10_;
	}

	public void method1924(boolean bool) {
		aBoolean2581 = bool;
		method1927();
	}

	private Class14_Sub2_Sub1 method1926(int i) {
		Class14_Sub2_Sub1 class14_sub2_sub1 = (Class14_Sub2_Sub1) aClass20_2595.get(i);
		if (class14_sub2_sub1 != null) {
			Class14_Sub2_Sub1 class14_sub2_sub1_16_ = class14_sub2_sub1;
			return class14_sub2_sub1_16_;
		}
		byte[] is = aClass9_2580.method163(0, i, 0);
		if (is == null) {
			class14_sub2_sub1 = null;
			return class14_sub2_sub1;
		}
		Buffer class14_sub10 = new Buffer(is);
		Class14_Sub2_Sub1 class14_sub2_sub1_17_ = new Class14_Sub2_Sub1(class14_sub10);
		aClass20_2595.put(class14_sub2_sub1_17_, i);
		class14_sub2_sub1 = class14_sub2_sub1_17_;
		return class14_sub2_sub1;
	}

	public void method1927() {
		aClass20_2595.clear();
		aClass20_2585.clear();
	}

	public int method5(int i) {
		return textureColors[i] & 0xffff;
	}

	public boolean method6(int i) {
		return aBooleanArray2600[i];
	}

	public boolean method7(int i) {
		return aBooleanArray2609[i];
	}

	public int method8(int i_11_) {
		return aByteArray2602[i_11_] & 0xff;
	}

	public int method9(int i) {
		return aByteArray2571[i] & 0xff;
	}
}
