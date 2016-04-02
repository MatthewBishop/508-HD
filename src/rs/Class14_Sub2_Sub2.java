/* Class14_Sub2_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;
import com.jagex.rt4.Class148_Sub1;

public class Class14_Sub2_Sub2 extends Cacheable {
	public static int anInt3754;
	public static int anInt3758 = 0;
	public Class124 aClass124_3760;
	public static Class148_Sub1[] aClass148_Sub1Array3762;
	public static boolean aBoolean3763;
	public int anInt3764;
	public int anInt3766;

	public void method260(int i, int i_0_, Buffer class14_sub10) {
		if (i != 1) {
			if (i != 2) {
				if (i == 5)
					aClass124_3760 = class14_sub10.method797(9467);
			} else
				anInt3766 = class14_sub10.method812((byte) -91);
		} else
			anInt3764 = class14_sub10.method798();
		if (i_0_ >= -11)
			anInt3758 = -76;
	}

	public boolean method261(byte i) {
		if (i < 9) {
			boolean bool = true;
			return bool;
		}
		boolean bool = anInt3764 == 115;
		return bool;
	}

	public static void method262(byte i) {
		aClass148_Sub1Array3762 = null;
		if (i != 111)
			aBoolean3763 = true;
	}

	public static Class124 method263(int i, String string) {
		byte[] is = string.getBytes();
		int i_1_ = is.length;
		Class124 class124 = new Class124();
		if (i != 1178)
			anInt3758 = -71;
		int i_2_ = 0;
		class124.aByteArray2495 = new byte[i_1_];
		while (i_2_ < i_1_) {
			int i_3_ = is[i_2_++] & 0xff;
			if (i_3_ <= 45 && i_3_ >= 40) {
				if (i_2_ >= i_1_)
					break;
				int i_4_ = is[i_2_++] & 0xff;
				class124.aByteArray2495[class124.anInt2507++] = (byte) ((i_3_ - 40) * 43 - 48 + i_4_);
			} else if (i_3_ != 0)
				class124.aByteArray2495[class124.anInt2507++] = (byte) i_3_;
		}
		class124.method1683(115);
		Class124 class124_5_ = class124.method1712((byte) 99);
		return class124_5_;
	}

	public static void method264(Buffer class14_sub10, boolean bool) {
		if (Class14_Sub2_Sub17.aClass76_4022 != null) {
			try {
				Class14_Sub2_Sub17.aClass76_4022.method1361(0, 0L);
				Class14_Sub2_Sub17.aClass76_4022.method1362((class14_sub10.position), 24, (byte) 105,
						(class14_sub10.payload));
			} catch (Exception exception) {
				/* empty */
			}
		}
		class14_sub10.position += 24;
		if (bool)
			aClass148_Sub1Array3762 = null;
	}

	public void method265(int i, Buffer class14_sub10) {
		for (;;) {
			int i_6_ = class14_sub10.method798();
			if (i_6_ == 0)
				break;
			method260(i_6_, -16, class14_sub10);
		}
		if (i != 0)
			method260(-19, 55, null);
	}

	public static int method266(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_) {
		i_12_ &= 0x3;
		if ((i_9_ & 0x1) == 1) {
			int i_13_ = i_8_;
			i_8_ = i_7_;
			i_7_ = i_13_;
		}
		if (i_12_ == 0) {
			int i_14_ = i_10_;
			return i_14_;
		}
		if (i_12_ == 1) {
			int i_15_ = -i_8_ + 1 + (-i + 7);
			return i_15_;
		}
		if (i_11_ != 7) {
			int i_16_ = -119;
			return i_16_;
		}
		if (i_12_ == 2) {
			int i_17_ = -i_7_ + (7 - i_10_) + 1;
			return i_17_;
		}
		int i_18_ = i;
		return i_18_;
	}
}
