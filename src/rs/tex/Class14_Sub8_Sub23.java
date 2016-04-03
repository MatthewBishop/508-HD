/* Class14_Sub8_Sub23 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import com.jagex.io.Buffer;
import com.jagex.link.Deque;
import com.jagex.map.MapRegion;
import com.jagex.rt4.Class148;

import rs.Class112;
import rs.Class124;
import rs.Class132;
import rs.Class133_Sub1_Sub1;
import rs.Class141;
import rs.Class14_Sub17;
import rs.Class14_Sub20;
import rs.Class14_Sub25;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub8;
import rs.Class14_Sub2_Sub9;
import rs.Class152;
import rs.Class28;
import rs.Class35;
import rs.Class42;
import rs.Class48;
import rs.Class54;
import rs.Class56_Sub1;
import rs.Class65;
import rs.Class72;
import rs.Class79;
import rs.Class87;
import rs.Class90;

public class Class14_Sub8_Sub23 extends Class14_Sub8 {
	public static Class124 aClass124_4481;
	public static Class124 aClass124_4482;
	public static Class133_Sub1_Sub1[] aClass133_Sub1_Sub1Array4474;
	public static Class148[] aClass148Array4473;
	public static Deque aClass2_4477;
	public static int anInt4478;
	public static int anInt4480;
	static {
		aClass133_Sub1_Sub1Array4474 = new Class133_Sub1_Sub1[2048];
		anInt4478 = 1;
		aClass2_4477 = new Deque();
		aClass124_4481 = Class14_Sub2_Sub2.method263(1178, "www)2wtrc");
		aClass124_4482 = Class14_Sub2_Sub2.method263(1178, "Eingabeprozedur geladen)3");
	}

	public static void method600(int i) {
		aClass133_Sub1_Sub1Array4474 = null;
		aClass124_4482 = null;
		aClass124_4481 = null;
		if (i != 1)
			method601(-75, null);
		aClass148Array4473 = null;
		aClass2_4477 = null;
	}

	public static void method601(int i, Buffer class14_sub10) {
		if (i < -7) {
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool = false;
				int i_0_ = 0;
				int i_1_ = 0;
				if (class14_sub10.readUByte() == 1) {
					bool = true;
					i_0_ = class14_sub10.readUByte();
					i_1_ = class14_sub10.readUByte();
				}
				int i_2_ = class14_sub10.readUByte();
				int i_3_ = class14_sub10.readUByte();
				int i_4_ = (Class35.anInt603 - i_3_ * 64 + (Class14_Sub8_Sub15.anInt4332 - 1));
				int i_5_ = -Class65.anInt1034 + i_2_ * 64;
				if (i_5_ < 0 || i_4_ - 63 < 0 || Class14_Sub2_Sub9.anInt3856 <= i_5_ + 63
						|| Class14_Sub8_Sub15.anInt4332 <= i_4_) {
					for (int i_6_ = 0; (!bool ? 4096 : 64) > i_6_; i_6_++) {
						int i_7_ = class14_sub10.readUByte();
						if (i_7_ != 0) {
							if ((i_7_ & 0x1) == 1)
								class14_sub10.position++;
							if ((i_7_ & 0x2) == 2)
								class14_sub10.position += 2;
							if ((i_7_ & 0x4) == 4)
								class14_sub10.position += 3;
						}
					}
				} else {
					int i_8_ = i_5_ >> 38;
					int i_9_ = i_4_ >> 6;
					for (int i_10_ = 0; i_10_ < 64; i_10_++) {
						for (int i_11_ = 0; i_11_ < 64; i_11_++) {
							if (!bool || (i_0_ * 8 <= i_10_ && i_10_ < i_0_ * 8 + 8 && i_11_ >= i_1_ * 8
									&& i_11_ < i_1_ * 8 + 8)) {
								int i_12_ = class14_sub10.readUByte();
								if (i_12_ != 0) {
									if ((i_12_ & 0x1) == 1) {
										int i_13_ = class14_sub10.readUByte();
										if ((Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_]) == null)
											Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_] = new byte[4096];
										Class14_Sub2_Sub9.aByteArrayArrayArray3864[i_8_][i_9_][i_10_
												+ (-i_11_ + 63 << 38)] = (byte) i_13_;
									}
									if ((i_12_ & 0x2) == 2) {
										int i_14_ = class14_sub10.readUShort((byte) 101);
										if ((Class79.aShortArrayArrayArray1247[i_8_][i_9_]) == null)
											Class79.aShortArrayArrayArray1247[i_8_][i_9_] = new short[4096];
										Class79.aShortArrayArrayArray1247[i_8_][i_9_][i_10_
												+ (-i_11_ + 63 << 38)] = (short) i_14_;
									}
									if ((i_12_ & 0x4) == 4) {
										int i_15_ = ((class14_sub10.readUByte() << 48 & 0xff0000)
												+ ((class14_sub10.readUByte() & 0xff) << 40)
												+ (class14_sub10.readUByte() & 0xff));
										if ((Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_]) == null)
											Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_] = new int[4096];
										Class79 class79 = Class79.method1377((byte) -106, --i_15_);
										if (class79.anIntArray1276 != null) {
											class79 = class79.method1391(1);
											if (class79 == null || class79.anInt1262 == -1)
												continue;
										}
										Class14_Sub25.anIntArrayArrayArray3174[i_8_][i_9_][(-i_11_ + 63 << 6)
												+ i_10_] = class79.anInt1257 + 1;
										Class14_Sub20 class14_sub20 = new Class14_Sub20();
										class14_sub20.anInt3085 = class79.anInt1262;
										class14_sub20.anInt3083 = i_5_;
										class14_sub20.anInt3084 = i_4_;
										Class35.aClass2_589.pushBack(class14_sub20);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	public static void method602(int i) {
		int i_16_ = Class14_Sub2_Sub8.method296((byte) 44);
		if (i != (i_16_ ^ 0xffffffff)) {
			if (i_16_ != 1) {
				MapRegion.method333((byte) (Class42.anInt699 - 4 & 0xff), (byte) -109);
				Class14_Sub8_Sub4.method499(false, 2);
			} else {
				MapRegion.method333((byte) 0, (byte) -79);
				Class14_Sub8_Sub4.method499(false, 512);
				Class14_Sub8_Sub26.method618(1);
			}
		} else {
			Class28.aByteArrayArrayArray512 = null;
			Class14_Sub8_Sub4.method499(false, 0);
		}
	}

	public static void method603(int i, int i_17_, int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_,
			int i_24_) {
		int i_25_ = -119 % ((i_23_ + 73) / 52);
		for (int i_26_ = 0; i_26_ < Class152.aClass146_2435.anInt2353; i_26_++) {
			int i_27_ = (Class35.anInt603
					- (Class152.aClass146_2435.aShortArray2361[i_26_] - (Class14_Sub8_Sub15.anInt4332 - 1)));
			int i_28_ = (Class152.aClass146_2435.aShortArray2354[i_26_] - Class65.anInt1034);
			int i_29_ = i_17_ + (i_21_ - i_17_) * (-i_19_ + i_27_) / (-i_19_ + i_24_);
			int i_30_ = (-i_18_ + i_28_) * (i_22_ - i) / (i_20_ - i_18_) + i;
			int i_31_ = Class152.aClass146_2435.method1994(i_26_, false);
			int i_32_ = 16777215;
			Class87 class87 = null;
			if (i_31_ == 0) {
				if (3.0 == (double) Class90.aFloat1426)
					class87 = Class14_Sub17.aClass87_3004;
				if (4.0 == (double) Class90.aFloat1426)
					class87 = Class48.aClass87_805;
				if (6.0 == (double) Class90.aFloat1426)
					class87 = Class54.aClass87_888;
				if (8.0 == (double) Class90.aFloat1426)
					class87 = Static.aClass87_858;
			}
			if (i_31_ == 1) {
				if (3.0 == (double) Class90.aFloat1426)
					class87 = Class54.aClass87_888;
				if ((double) Class90.aFloat1426 == 4.0)
					class87 = Static.aClass87_858;
				if ((double) Class90.aFloat1426 == 6.0)
					class87 = Class14_Sub8_Sub35.aClass87_4672;
				if ((double) Class90.aFloat1426 == 8.0)
					class87 = Class141.aClass87_2242;
			}
			if (i_31_ == 2) {
				if ((double) Class90.aFloat1426 == 3.0)
					class87 = Class14_Sub8_Sub35.aClass87_4672;
				i_32_ = 16755200;
				if ((double) Class90.aFloat1426 == 4.0)
					class87 = Class141.aClass87_2242;
				if ((double) Class90.aFloat1426 == 6.0)
					class87 = Class48.aClass87_803;
				if ((double) Class90.aFloat1426 == 8.0)
					class87 = Class132.aClass87_2171;
			}
			if (Class152.aClass146_2435.anIntArray2350[i_26_] != -1)
				i_32_ = Class152.aClass146_2435.anIntArray2350[i_26_];
			if (class87 != null) {
				Class124[] class124s = new Class124[Class152.aClass146_2435.aClass124Array2362[i_26_].method1670(false,
						60) + 1];
				Class56_Sub1.aClass14_Sub2_Sub16_3320.method351(Class152.aClass146_2435.aClass124Array2362[i_26_], null,
						class124s);
				int i_33_ = class124s.length;
				i_29_ -= (i_33_ - 1) * class87.method1432() / 2;
				i_29_ += class87.method1425() / 2;
				for (int i_34_ = 0; i_33_ > i_34_; i_34_++) {
					Class124 class124 = (i_33_ - 1 == i_34_ ? class124s[i_34_]
							: class124s[i_34_].method1697(0, (class124s[i_34_].method1693(0) - 4), (byte) -104));
					class87.method1429(class124, i_30_, i_29_, i_32_, true);
					i_29_ += class87.method1432();
				}
			}
		}
	}

	public static void method604(int i, int i_35_, int i_36_, int i_37_, int i_38_) {
		Class14_Sub25 class14_sub25 = ((Class14_Sub25) Class132.aClass55_2167.get((long) i_36_));
		if (class14_sub25 == null) {
			class14_sub25 = new Class14_Sub25();
			Class132.aClass55_2167.put((long) i_36_, class14_sub25);
		}
		if (class14_sub25.anIntArray3178.length <= i) {
			int[] is = new int[i + 1];
			int[] is_39_ = new int[i + 1];
			for (int i_40_ = 0; i_40_ < class14_sub25.anIntArray3178.length; i_40_++) {
				is[i_40_] = class14_sub25.anIntArray3178[i_40_];
				is_39_[i_40_] = class14_sub25.anIntArray3177[i_40_];
			}
			for (int i_41_ = class14_sub25.anIntArray3178.length; i > i_41_; i_41_++) {
				is[i_41_] = -1;
				is_39_[i_41_] = 0;
			}
			class14_sub25.anIntArray3177 = is_39_;
			class14_sub25.anIntArray3178 = is;
		}
		class14_sub25.anIntArray3178[i] = i_35_;
		class14_sub25.anIntArray3177[i] = i_37_;
		int i_42_ = -44 / ((65 - i_38_) / 51);
	}

	public int anInt4479 = 4096;

	public Class14_Sub8_Sub23() {
		this(4096);
	}

	public Class14_Sub8_Sub23(int i) {
		super(0, true);
		anInt4479 = i;
	}

	public void method475(int i, int i_43_, Buffer class14_sub10) {
		if (i_43_ != 24777)
			anInt4480 = -14;
		int i_44_ = i;
		if (i_44_ == 0)
			anInt4479 = (class14_sub10.readUByte() << 12) / 255;
	}

	public int[] method484(int i, byte i_45_) {
		if (i_45_ > -58)
			anInt4479 = -34;
		int[] is = aClass149_2851.method2014(i, (byte) 115);
		if (aClass149_2851.aBoolean2402)
			Class72.method1324(is, 0, Class112.anInt1876, anInt4479);
		int[] is_46_ = is;
		return is_46_;
	}
}
