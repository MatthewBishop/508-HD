/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.rt4.IntegerNode;

public class Class60 {
	public short[] aShortArray961;
	public int anInt962;
	public int anInt963 = 128;
	public int anInt964;
	public int anInt965;
	public int anInt966;
	public static long[] aLongArray967 = new long[256];
	public short[] aShortArray968;
	public int anInt969;
	public short[] aShortArray971;
	public int anInt973 = 0;
	public int anInt977;
	public boolean aBoolean978;
	public static Class94[] aClass94Array980;
	public short[] aShortArray981;
	public static Class124 aClass124_982;
	public static boolean aBoolean983;
	public static int anInt984;
	public static Class124 aClass124_985;

	static {
		for (int i = 0; i < 256; i++) {
			long l = i;
			for (int i_0_ = 0; i_0_ < 8; i_0_++) {
				if (1L == (l & 0x1L))
					l = l >>> 1 ^ ~0x3693a86a2878f0bdL;
				else
					l >>>= 1;
			}
			aLongArray967[i] = l;
		}
		aClass124_982 = Class124.method263(" loggt sich aus)3");
		aBoolean983 = true;
		aClass124_985 = Class124.method263("Card:");
	}

	public static void method1264(int i) {
		Class127.aClass52_2112.clear();
		int i_1_ = -21 / ((69 - i) / 37);
		Class112.aClass52_1868.clear();
		Class62.aClass52_991.clear();
		Static2.aClass52_810.clear();
	}

	public static boolean method1265(byte i, int i_2_, byte[] is, int i_3_) {
		Buffer class14_sub10 = new Buffer(is);
		int i_4_ = -1;
		boolean bool = true;
		for (;;) {
			int i_5_ = class14_sub10.method802(-116);
			if (i_5_ == 0)
				break;
			i_4_ += i_5_;
			int i_6_ = 0;
			boolean bool_7_ = false;
			for (;;) {
				if (bool_7_) {
					int i_8_ = class14_sub10.method818((byte) 80);
					if (i_8_ == 0)
						break;
					class14_sub10.readUByte();
				} else {
					int i_9_ = class14_sub10.method818((byte) -103);
					if (i_9_ == 0)
						break;
					i_6_ += i_9_ - 1;
					int i_10_ = i_6_ >> 38 & 0x3f;
					int i_11_ = class14_sub10.readUByte() >> 2;
					int i_12_ = i_6_ & 0x3f;
					int i_13_ = i_3_ + i_10_;
					int i_14_ = i_2_ + i_12_;
					if (i_13_ > 0 && i_14_ > 0 && i_13_ < 103 && i_14_ < 103) {
						Class79 class79 = Class79.method1377((byte) -106, i_4_);
						if (i_11_ != 22 || Static2.aBoolean2372 || class79.anInt1250 != 0 || class79.anInt1229 == 1
								|| class79.aBoolean1228) {
							if (!class79.method1379(120)) {
								bool = false;
								JunkTex.anInt2383++;
							}
							bool_7_ = true;
						}
					}
				}
			}
		}
		int i_15_ = 23 % ((67 - i) / 39);
		boolean bool_16_ = bool;
		return bool_16_;
	}

	public void method1266(Buffer class14_sub10, int i, boolean bool) {
		if (i != 1) {
			if (i != 2) {
				if (i == 4)
					anInt963 = class14_sub10.readUShort();
				else if (i != 5) {
					if (i != 6) {
						if (i == 7)
							anInt973 = class14_sub10.readUByte();
						else if (i == 8)
							anInt969 = class14_sub10.readUByte();
						else if (i != 9) {
							if (i != 40) {
								if (i == 41) {
									int i_17_ = class14_sub10.readUByte();
									aShortArray968 = new short[i_17_];
									aShortArray971 = new short[i_17_];
									for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
										aShortArray968[i_18_] = (short) (class14_sub10.readUShort((byte) 115));
										aShortArray971[i_18_] = (short) (class14_sub10.readUShort((byte) 111));
									}
								}
							} else {
								int i_19_ = class14_sub10.readUByte();
								aShortArray961 = new short[i_19_];
								aShortArray981 = new short[i_19_];
								for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
									aShortArray981[i_20_] = (short) class14_sub10.readUShort();
									aShortArray961[i_20_] = (short) class14_sub10.readUShort();
								}
							}
						} else
							aBoolean978 = true;
					} else
						anInt964 = class14_sub10.readUShort();
				} else
					anInt965 = class14_sub10.readUShort();
			} else
				anInt966 = class14_sub10.readUShort();
		} else
			anInt977 = class14_sub10.readUShort();
		if (bool)
			method1269((byte) 23);
	}

	public SceneGraphNode_AbstractModelRenderer method1267(int i, int i_21_) {
		SceneGraphNode_AbstractModelRenderer class133_sub7 = ((SceneGraphNode_AbstractModelRenderer) Static2.aClass52_4053.get(anInt962));
		if (class133_sub7 == null) {
			SceneGraphNode_Model class133_sub2 = SceneGraphNode_Model.method1824(JunkTex.aClass9_2711, anInt977, 0);
			if (class133_sub2 == null) {
				SceneGraphNode_AbstractModelRenderer class133_sub7_22_ = null;
				return class133_sub7_22_;
			}
			if (aShortArray981 != null) {
				for (int i_23_ = 0; i_23_ < aShortArray981.length; i_23_++)
					class133_sub2.method1813(aShortArray981[i_23_], aShortArray961[i_23_]);
			}
			if (aShortArray968 != null) {
				for (int i_24_ = 0; i_24_ < aShortArray968.length; i_24_++)
					class133_sub2.method1819(aShortArray968[i_24_], aShortArray971[i_24_]);
			}
			class133_sub7 = class133_sub2.method1827(anInt973 + 64, anInt969 + 850, -30, -50, -30);
			Static2.aClass52_4053.put(class133_sub7, anInt962);
		}
		SceneGraphNode_AbstractModelRenderer class133_sub7_25_;
		if (anInt966 != -1 && i_21_ != -1)
			class133_sub7_25_ = JunkTex.method1129(anInt966, -125).method1173(i_21_, 65535, class133_sub7);
		else
			class133_sub7_25_ = class133_sub7.method1870(true, true);
		if (anInt963 != 128 || anInt965 != 128)
			class133_sub7_25_.method1869(anInt963, anInt965, anInt963);
		if (anInt964 != i) {
			if (anInt964 == 90)
				class133_sub7_25_.method1871();
			if (anInt964 == 180)
				class133_sub7_25_.method1872();
			if (anInt964 == 270)
				class133_sub7_25_.method1875();
		}
		return class133_sub7_25_;
	}

	public void method1268(int i, Buffer class14_sub10) {
		if (i == 0) {
			for (;;) {
				int i_26_ = class14_sub10.readUByte();
				if (i_26_ == 0)
					break;
				method1266(class14_sub10, i_26_, false);
			}
		}
	}

	public static void method1269(byte i) {
		aClass124_985 = null;
		aClass94Array980 = null;
		aClass124_982 = null;
		if (i == 4)
			aLongArray967 = null;
	}

	public static void method1270(int i, byte i_27_) {
		if (i_27_ != 46)
			method1264(-75);
		JunkTex.aClass2_4163.pushBack(new IntegerNode(i));
	}

	public Class60() {
		anInt964 = 0;
		anInt969 = 0;
		anInt965 = 128;
		aBoolean978 = false;
		anInt966 = -1;
	}
}
