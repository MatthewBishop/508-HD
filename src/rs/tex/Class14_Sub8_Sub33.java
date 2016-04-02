/* Class14_Sub8_Sub33 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs.tex;

import java.io.IOException;

import com.jagex.io.Buffer;
import com.jagex.io.PacketBuffer;
import com.jagex.link.Linkable;
import com.jagex.rt4.Class14_Sub1;

import rs.Canvas_Sub1;
import rs.Canvas_Sub2;
import rs.Class1;
import rs.Class103;
import rs.Class109;
import rs.Class111;
import rs.Class112;
import rs.Class113;
import rs.Class115;
import rs.Class117;
import rs.Class120;
import rs.Class122;
import rs.Class123;
import rs.Class124;
import rs.Class125;
import rs.Class125_Sub2;
import rs.Class126;
import rs.Class128;
import rs.Class129;
import rs.Class133_Sub1;
import rs.Class133_Sub1_Sub1;
import rs.Class133_Sub1_Sub2;
import rs.Class133_Sub3;
import rs.Class133_Sub4;
import rs.Class133_Sub5;
import rs.Class133_Sub6;
import rs.Class137;
import rs.Class138;
import rs.Class139;
import rs.Class142;
import rs.Class146;
import rs.Class14_Sub14;
import rs.Class14_Sub15;
import rs.Class14_Sub19;
import rs.Class14_Sub21;
import rs.Class14_Sub23;
import rs.Class14_Sub29;
import rs.Class14_Sub2_Sub10;
import rs.Class14_Sub2_Sub12;
import rs.Class14_Sub2_Sub16;
import rs.Class14_Sub2_Sub2;
import rs.Class14_Sub2_Sub20;
import rs.Class14_Sub2_Sub21;
import rs.Class14_Sub2_Sub3;
import rs.Class14_Sub2_Sub7;
import rs.Class14_Sub3;
import rs.Class14_Sub30;
import rs.Class14_Sub4;
import rs.Class14_Sub7;
import rs.Class14_Sub9_Sub3;
import rs.Class15;
import rs.Class152;
import rs.Class153;
import rs.Class22;
import rs.Class24;
import rs.Class32;
import rs.Class33;
import rs.Class38;
import rs.Class4;
import rs.Class42;
import rs.Class44;
import rs.Class45;
import rs.Class46;
import rs.Class47;
import rs.Class48;
import rs.Class49;
import rs.Class56;
import rs.Class58;
import rs.Class60;
import rs.Class62;
import rs.Class66;
import rs.Class67;
import rs.Class7;
import rs.Class71;
import rs.Class72;
import rs.Class74;
import rs.Class75;
import rs.Class76;
import rs.Class79;
import rs.Class7_Sub2;
import rs.Class7_Sub2_Sub1;
import rs.Class7_Sub3_Sub1;
import rs.Class94;
import rs.Class96;
import rs.Class98;
import rs.RuntimeException_Sub1;
import rs.Static2;
import rs.client;

public class Class14_Sub8_Sub33 extends Class14_Sub8 {
	public static Class124 aClass124_4631;
	public static Class124 aClass124_4632 = Class14_Sub2_Sub2.method263(1178, "blinken3:");
	public static Class124 aClass124_4634;
	public static Class124 aClass124_4635;
	public static Class124 aClass124_4643;
	public static Class124 aClass124_4644;
	public static int anInt4629;
	public static int anInt4633;
	public static int anInt4636;
	public static int anInt4640;

	static {
		anInt4633 = 0;
		aClass124_4635 = Class14_Sub2_Sub2.method263(1178, "Benutzeroberfl-=che geladen)3");
		anInt4640 = 0;
		aClass124_4631 = Class14_Sub2_Sub2.method263(1178, ")3");
		anInt4636 = -1;
		aClass124_4634 = Class14_Sub2_Sub2.method263(1178, "<col=ff0000>");
		aClass124_4643 = Class14_Sub2_Sub2.method263(1178, "mapdots");
		aClass124_4644 = Class14_Sub2_Sub2.method263(1178, "Suche nach Updates )2 ");
	}

	public static int method653(int i) {
		i = --i | i >>> 33;
		i |= i >>> 2;
		i |= i >>> 4;
		i |= i >>> 8;
		i |= i >>> 48;
		int i_1_ = i + 1;
		return i_1_;
	}

	public static void method654(int i) {
		aClass124_4634 = null;
		aClass124_4635 = null;
		aClass124_4644 = null;
		aClass124_4631 = null;
		aClass124_4643 = null;
		if (i != 30)
			method654(-7);
		aClass124_4632 = null;
	}

	public static short[] method655(int i, short[] is) {
		if (i != 8111) {
			short[] is_2_ = null;
			return is_2_;
		}
		if (is == null) {
			short[] is_3_ = null;
			return is_3_;
		}
		short[] is_4_ = new short[is.length];
		Class72.method1319(is, 0, is_4_, 0, is.length);
		short[] is_5_ = is_4_;
		return is_5_;
	}

	public static boolean method656(int i) throws IOException {
		if (Class14_Sub15.aClass36_2990 == null) {
			boolean bool = false;
			return bool;
		}
		int i_6_ = Class14_Sub15.aClass36_2990.method1104(24249);
		if (i_6_ == 0) {
			boolean bool = false;
			return bool;
		}
		if (i == Class133_Sub4.anInt3579) {
			Class14_Sub15.aClass36_2990.method1099(1, (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload),
					i + 0, 0);
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
			i_6_--;
			Class133_Sub4.anInt3579 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.readOpcode();
			Class14_Sub8_Sub12.anInt4280 = Class14_Sub14.anIntArray2985[Class133_Sub4.anInt3579];
		}
		if (Class14_Sub8_Sub12.anInt4280 == -1) {
			if (i_6_ <= 0) {
				boolean bool = false;
				return bool;
			}
			Class14_Sub15.aClass36_2990.method1099(1, (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload), i,
					0);
			i_6_--;
			Class14_Sub8_Sub12.anInt4280 = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload[0]) & 0xff;
		}
		if (Class14_Sub8_Sub12.anInt4280 == -2) {
			if (i_6_ <= 1)
				return false;
			Class14_Sub15.aClass36_2990.method1099(2, (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload), -1,
					0);
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
			Class14_Sub8_Sub12.anInt4280 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 115);
			i_6_ -= 2;
		}
		if (i_6_ < Class14_Sub8_Sub12.anInt4280)
			return false;
		Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position = 0;
		Class14_Sub15.aClass36_2990.method1099(Class14_Sub8_Sub12.anInt4280,
				(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.payload), i + 0, 0);
		Class14_Sub8_Sub2.anInt4114 = Static.anInt3931;
		Static.anInt3931 = Class146.anInt2357;
		Class146.anInt2357 = Class133_Sub4.anInt3579;
		Class96.anInt1636 = 0;
		if (Class133_Sub4.anInt3579 == 156) {
			int i_7_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method831(128);
			int i_8_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 127);
			int i_9_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 113);
			Class60.method1270(i_9_, (byte) 46);
			Class14_Sub8_Sub31.method645((byte) -26, i_8_, i_7_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 246) {
			int i_10_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -112);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_10_));
			if (class14_sub15 != null)
				Static.method236(true, class14_sub15, (byte) -127);
			if (Class125_Sub2.aClass94_3388 != null) {
				Class103.method1531(Class125_Sub2.aClass94_3388);
				Class125_Sub2.aClass94_3388 = null;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 211) {
			int i_11_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_12_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_13_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 120);
			int i_14_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_15_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class7_Sub3_Sub1.method136(true, i_13_, i_15_, i_12_, 96, i_11_, i_14_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 172) {
			int i_16_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -107);
			RuntimeException_Sub1.aClass31_2458 = Class14_Sub8_Sub34.aClass43_4647.method1141((byte) 48, i_16_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 89) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-127);
			Class124 class124 = (Class14_Sub2_Sub16.method368(
					Class75.method1337(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734, 32767).method1677(i + 1)));
			Class15.method943(class124, false, Class46.method1174(l, (byte) 53).method1685(i + 1), 6);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 117) {
			int i_17_ = (Class14_Sub8_Sub12.anInt4280 + Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position);
			int i_18_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 108);
			int i_19_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 122);
			if (Class14_Sub2_Sub12.anInt3912 != i_18_) {
				Class14_Sub2_Sub12.anInt3912 = i_18_;
				Class109.method1563(Class14_Sub2_Sub12.anInt3912, 106);
				Static.method1032(false, -1291652884);
				Static.method1328(Class14_Sub2_Sub12.anInt3912, true);
				for (int i_20_ = 0; i_20_ < 100; i_20_++)
					Class14_Sub8_Sub36.aBooleanArray4698[i_20_] = true;
			}
			while (i_19_-- > 0) {
				int i_21_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -90);
				int i_22_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 126);
				int i_23_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
				Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_21_));
				if (class14_sub15 != null && class14_sub15.anInt2999 != i_22_) {
					Static.method236(true, class14_sub15, (byte) -127);
					class14_sub15 = null;
				}
				if (class14_sub15 == null)
					class14_sub15 = Static.method237(1, i_21_, i_23_, i_22_);
				class14_sub15.aBoolean2992 = true;
			}
			for (Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.getFirst()); class14_sub15 != null; class14_sub15 = (Class14_Sub15) Class14_Sub30.aClass55_3275
							.getNext()) {
				if (!class14_sub15.aBoolean2992)
					Static.method236(true, class14_sub15, (byte) -123);
				else
					class14_sub15.aBoolean2992 = false;
			}
			Class14_Sub8_Sub5.aClass55_4155.clear();
			while (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position < i_17_) {
				int i_24_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -107);
				int i_25_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 103);
				int i_26_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 109);
				int i_27_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -115);
				for (int i_28_ = i_25_; i_26_ >= i_28_; i_28_++) {
					long l = ((long) i_24_ << 32) - -(long) i_28_;
					Class14_Sub8_Sub5.aClass55_4155.put(l, new Class14_Sub1(i_27_));
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 132) {
			Class14_Sub14.method870(6346, Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467));
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 178) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-126);
			long l_29_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 117);
			long l_30_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method829(53);
			int i_31_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			long l_32_ = l_30_ + (l_29_ << 32);
			boolean bool = false;
			while_19_: do {
				for (int i_33_ = 0; i_33_ < 100; i_33_++) {
					if (Class98.aLongArray1665[i_33_] == l_32_) {
						bool = true;
						break while_19_;
					}
				}
				if (i_31_ <= 1) {
					if (Class146.anInt2365 == 1 || Class14_Sub2_Sub21.anInt4081 == 1)
						bool = true;
					else {
						for (int i_34_ = 0; Class42.anInt698 > i_34_; i_34_++) {
							if (l == Class126.aLongArray2095[i_34_]) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && Class14_Sub8_Sub39.anInt4754 == 0) {
				Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352] = l_32_;
				Class14_Sub8_Sub16.anInt4352 = (Class14_Sub8_Sub16.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub16.method368(
						Class75.method1337(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734, 32767).method1677(0)));
				if (i_31_ == 2 || i_31_ == 3)
					Class15.method943(class124, false,
							(Class14_Sub8_Sub7
									.method515(
											(new Class124[] { Class14_Sub19.aClass124_3075,
													Class46.method1174(l, (byte) 67).method1685(i + 1) }),
											(byte) -111)),
							7);
				else if (i_31_ == 1)
					Class15.method943(class124, false,
							(Class14_Sub8_Sub7.method515((new Class124[] { Class14_Sub21.aClass124_3099,
									Class46.method1174(l, (byte) 91).method1685(0) }), (byte) -93)),
							7);
				else
					Class15.method943(class124, false, Class46.method1174(l, (byte) 112).method1685(0), 3);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_35_ = true;
			return bool_35_;
		}
		if (Class133_Sub4.anInt3579 == 37) {
			Class45.method1160(0);
			Class14_Sub4.anInt2789 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 173) {
			Class139.method1951((byte) 76, true);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 121) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(i + 32);
			int i_36_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 116);
			byte i_37_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			boolean bool = false;
			if (0L != (l & ~0x7fffffffffffffffL))
				bool = true;
			if (!bool) {
				Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(i ^ ~0x24fb);
				Class14_Sub23 class14_sub23 = new Class14_Sub23();
				class14_sub23.key = l;
				class14_sub23.aClass124_3132 = Class46.method1174(class14_sub23.key, (byte) 101);
				class14_sub23.aByte3131 = i_37_;
				class14_sub23.anInt3128 = i_36_;
				class14_sub23.aClass124_3127 = class124;
				int i_38_;
				for (i_38_ = Class14_Sub2_Sub21.anInt4084 - 1; i_38_ >= 0; i_38_--) {
					int i_39_ = (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aClass124_3132.method1698((byte) 81,
							class14_sub23.aClass124_3132));
					if (i_39_ == 0) {
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].anInt3128 = i_36_;
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aByte3131 = i_37_;
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_].aClass124_3127 = class124;
						if (Class48.aLong802 == l)
							Class153.aByte2442 = i_37_;
						Class133_Sub4.anInt3579 = -1;
						Class7_Sub2_Sub1.anInt3705 = Class14_Sub8_Sub23.anInt4478;
						return true;
					}
					if (i_39_ < 0)
						break;
				}
				if (Class14_Sub2_Sub21.anInt4084 >= Class133_Sub1_Sub2.aClass14_Sub23Array4945.length) {
					Class133_Sub4.anInt3579 = -1;
					return true;
				}
				for (int i_40_ = Class14_Sub2_Sub21.anInt4084 - 1; i_38_ < i_40_; i_40_--)
					Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_40_
							+ 1] = Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_40_];
				if (Class14_Sub2_Sub21.anInt4084 == 0)
					Class133_Sub1_Sub2.aClass14_Sub23Array4945 = new Class14_Sub23[100];
				Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_38_ + 1] = class14_sub23;
				if (Class48.aLong802 == l)
					Class153.aByte2442 = i_37_;
				Class14_Sub2_Sub21.anInt4084++;
			} else {
				if (Class14_Sub2_Sub21.anInt4084 == 0) {
					Class133_Sub4.anInt3579 = -1;
					return true;
				}
				l &= 0x7fffffffffffffffL;
				boolean bool_41_ = false;
				int i_42_;
				for (i_42_ = 0; (i_42_ < Class14_Sub2_Sub21.anInt4084
						&& ((Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_].key) != l
								|| i_36_ != (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_].anInt3128))); i_42_++) {
					/* empty */
				}
				if (i_42_ < Class14_Sub2_Sub21.anInt4084) {
					for (/**/; Class14_Sub2_Sub21.anInt4084 - 1 > i_42_; i_42_++)
						Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_] = (Class133_Sub1_Sub2.aClass14_Sub23Array4945[i_42_
								+ 1]);
					Class14_Sub2_Sub21.anInt4084--;
					Class133_Sub1_Sub2.aClass14_Sub23Array4945[Class14_Sub2_Sub21.anInt4084] = null;
				}
			}
			Class7_Sub2_Sub1.anInt3705 = Class14_Sub8_Sub23.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			return true;
		}
		if (Class133_Sub4.anInt3579 == 114) {
			for (int i_43_ = 0; (i_43_ < Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474.length); i_43_++) {
				if (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_43_] != null)
					Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_43_].anInt3445 = -1;
			}
			for (int i_44_ = 0; i_44_ < Class14_Sub4.aClass133_Sub1_Sub2Array2785.length; i_44_++) {
				if (Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_44_] != null)
					Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_44_].anInt3445 = -1;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 6) {
			int i_45_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 116);
			int i_46_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(i - 3976);
			if (i_46_ == 65535)
				i_46_ = -1;
			Class94 class94 = Static.method1233(i_45_, 21803);
			if (class94.anInt1543 != 2 || i_46_ != class94.anInt1550) {
				class94.anInt1543 = 2;
				class94.anInt1550 = i_46_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 64) {
			int i_47_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			if (i_47_ == 65535)
				i_47_ = -1;
			int i_48_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = Static.method1233(i_48_, i ^ ~0x552b);
			if (class94.anInt1543 != 1 || class94.anInt1550 != i_47_) {
				class94.anInt1543 = 1;
				class94.anInt1550 = i_47_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 118) {
			int i_49_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -109);
			int i_50_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -113);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_49_));
			Class14_Sub15 class14_sub15_51_ = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_50_));
			if (class14_sub15_51_ != null)
				Static.method236(
						(class14_sub15 == null || (class14_sub15.anInt2999 != class14_sub15_51_.anInt2999)),
						class14_sub15_51_, (byte) -119);
			if (class14_sub15 != null) {
				class14_sub15.unlink();
				Class14_Sub30.aClass55_3275.put((long) i_50_, class14_sub15);
			}
			Class94 class94 = Static.method1233(i_49_, 21803);
			if (class94 != null)
				Class103.method1531(class94);
			class94 = Static.method1233(i_50_, 21803);
			if (class94 != null) {
				Class103.method1531(class94);
				Class14_Sub2_Sub21.method445(class94, 18559, true);
			}
			if (Class14_Sub2_Sub12.anInt3912 != -1)
				Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 1);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 174) {
			int i_52_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 110);
			int i_53_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_54_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 118);
			Class94 class94 = Static.method1233(i_54_, 21803);
			Class133_Sub4.anInt3579 = -1;
			class94.anInt1505 = i_53_ + (i_52_ << 16);
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 82) {
			Class7_Sub2_Sub1.anInt3705 = Class14_Sub8_Sub23.anInt4478;
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-118);
			if (l == 0L) {
				Class14_Sub2_Sub21.anInt4084 = 0;
				Class7_Sub3_Sub1.aClass124_3710 = null;
				Class133_Sub1_Sub2.aClass14_Sub23Array4945 = null;
				Class133_Sub4.anInt3579 = -1;
				Class4.aClass124_129 = null;
				boolean bool = true;
				return bool;
			}
			long l_55_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(59);
			Class7_Sub3_Sub1.aClass124_3710 = Class46.method1174(l_55_, (byte) 55);
			Class4.aClass124_129 = Class46.method1174(l, (byte) 119);
			Class14_Sub30.aByte3283 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			int i_56_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			if (i_56_ == 255) {
				Class133_Sub4.anInt3579 = -1;
				boolean bool = true;
				return bool;
			}
			Class14_Sub2_Sub21.anInt4084 = i_56_;
			Class14_Sub23[] class14_sub23s = new Class14_Sub23[100];
			for (int i_57_ = 0; Class14_Sub2_Sub21.anInt4084 > i_57_; i_57_++) {
				class14_sub23s[i_57_] = new Class14_Sub23();
				class14_sub23s[i_57_].key = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-23);
				class14_sub23s[i_57_].aClass124_3132 = Class46.method1174(class14_sub23s[i_57_].key, (byte) 89);
				class14_sub23s[i_57_].anInt3128 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 124);
				class14_sub23s[i_57_].aByte3131 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
				class14_sub23s[i_57_].aClass124_3127 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(i + 9468);
				if (class14_sub23s[i_57_].key == Class48.aLong802)
					Class153.aByte2442 = class14_sub23s[i_57_].aByte3131;
			}
			boolean bool = false;
			int i_58_ = Class14_Sub2_Sub21.anInt4084;
			while (i_58_ > 0) {
				i_58_--;
				bool = true;
				for (int i_59_ = 0; i_58_ > i_59_; i_59_++) {
					if ((class14_sub23s[i_59_].aClass124_3132.method1698((byte) 52,
							class14_sub23s[i_59_ + 1].aClass124_3132)) > 0) {
						Class14_Sub23 class14_sub23 = class14_sub23s[i_59_];
						bool = false;
						class14_sub23s[i_59_] = class14_sub23s[i_59_ + 1];
						class14_sub23s[i_59_ + 1] = class14_sub23;
					}
				}
				if (bool)
					break;
			}
			Class133_Sub1_Sub2.aClass14_Sub23Array4945 = class14_sub23s;
			Class133_Sub4.anInt3579 = -1;
			boolean bool_60_ = true;
			return bool_60_;
		}
		if (Class133_Sub4.anInt3579 == 99) {
			Class45.method1160(0);
			Class1.anInt73 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 176) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(30);
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			long l_61_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(26);
			long l_62_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 113);
			long l_63_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method829(i - 118);
			int i_64_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_65_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 111);
			long l_66_ = (l_62_ << 32) + l_63_;
			boolean bool = false;
			while_20_: do {
				for (int i_67_ = 0; i_67_ < 100; i_67_++) {
					if (l_66_ == Class98.aLongArray1665[i_67_]) {
						bool = true;
						break while_20_;
					}
				}
				if (i_64_ <= 1) {
					for (int i_68_ = 0; i_68_ < Class42.anInt698; i_68_++) {
						if (Class126.aLongArray2095[i_68_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && Class14_Sub8_Sub39.anInt4754 == 0) {
				Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352] = l_66_;
				Class14_Sub8_Sub16.anInt4352 = (Class14_Sub8_Sub16.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub3.method272(i_65_, (byte) 63).method442(-1,
						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
				if (i_64_ != 2 && i_64_ != 3) {
					if (i_64_ != 1)
						Class14_Sub8_Sub3.method493((byte) -71, Class46.method1174(l_61_, (byte) 47).method1685(0),
								Class46.method1174(l, (byte) 104).method1685(0), 20, class124, i_65_);
					else
						Class14_Sub8_Sub3
								.method493((byte) -89,
										Class46.method1174(l_61_, (byte) 102)
												.method1685(
														0),
										(Class14_Sub8_Sub7.method515(
												(new Class124[] { Class14_Sub21.aClass124_3099,
														Class46.method1174(l, (byte) 50).method1685(i ^ 0xffffffff) }),
												(byte) -33)),
										20, class124, i_65_);
				} else
					Class14_Sub8_Sub3
							.method493(
									(byte) -61, Class46
											.method1174(l_61_,
													(byte) 127)
											.method1685(0),
									Class14_Sub8_Sub7
											.method515(
													(new Class124[] { (Class14_Sub19.aClass124_3075),
															Class46.method1174(l, (byte) 125).method1685(0) }),
													(byte) -104),
									20, class124, i_65_);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_69_ = true;
			return bool_69_;
		}
		if (Class133_Sub4.anInt3579 == 245) {
			int i_70_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 5);
			int i_71_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
			Class94 class94 = Static.method1233(i_70_, 21803);
			if (i_71_ != class94.anInt1598 || i_71_ == -1) {
				class94.anInt1598 = i_71_;
				class94.anInt1610 = 0;
				class94.anInt1603 = 0;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 104) {
			Static.method238((byte) 55);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = false;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 239) {
			int i_72_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 110);
			int i_73_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(i + 4);
			if (i_73_ == 2)
				Class14_Sub8_Sub12.method536(false);
			Class14_Sub2_Sub12.anInt3912 = i_72_;
			Class109.method1563(i_72_, i ^ ~0x7c);
			Static.method1032(false, -1291652884);
			Static.method1328(Class14_Sub2_Sub12.anInt3912, true);
			for (int i_74_ = 0; i_74_ < 100; i_74_++)
				Class14_Sub8_Sub36.aBooleanArray4698[i_74_] = true;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 8) {
			Class7_Sub2.anInt2675 = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false) * 30);
			Class133_Sub4.anInt3579 = -1;
			Class129.anInt2131 = Class14_Sub8_Sub23.anInt4478;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 101) {
			int i_75_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -114);
			Class94 class94 = Static.method1233(i_75_, i ^ ~0x552b);
			class94.anInt1543 = 3;
			class94.anInt1550 = Class14_Sub3.aClass133_Sub1_Sub1_2748.aClass102_4941.method1520(1073741824);
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 146) {
			int i_76_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			if (i_76_ == 65535)
				i_76_ = -1;
			Class98.method1492(i_76_, (byte) -85);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 251) {
			int i_77_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			if (i_77_ == 65535)
				i_77_ = -1;
			int i_78_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method828((byte) -120);
			Class153.method2049(i_77_, i_78_, -1);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 255) {
			int i_79_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -92);
			int i_80_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 111);
			Class94 class94;
			if (i_79_ < 0)
				class94 = null;
			else
				class94 = Static.method1233(i_79_, 21803);
			if (class94 != null) {
				for (int i_81_ = 0; class94.anIntArray1452.length > i_81_; i_81_++) {
					class94.anIntArray1452[i_81_] = 0;
					class94.anIntArray1542[i_81_] = 0;
				}
			}
			if (i_79_ < -70000)
				i_80_ += 32768;
			Class124.method1687(i_80_, (byte) 88);
			int i_82_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 111);
			for (int i_83_ = 0; i_82_ > i_83_; i_83_++) {
				int i_84_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -76);
				if (i_84_ == 255)
					i_84_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 115);
				int i_85_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
				if (class94 != null && i_83_ < class94.anIntArray1452.length) {
					class94.anIntArray1452[i_83_] = i_85_;
					class94.anIntArray1542[i_83_] = i_84_;
				}
				Class14_Sub8_Sub23.method604(i_83_, i_85_ - 1, i_80_, i_84_, -48);
			}
			if (class94 != null)
				Class103.method1531(class94);
			Class45.method1160(i ^ 0xffffffff);
			Class14_Sub4.anIntArray2786[Class14_Sub8_Sub26.method617(Class133_Sub5.anInt3612++,
					31)] = Class14_Sub8_Sub26.method617(i_80_, 32767);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 184) {
			int i_86_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -97);
			int i_87_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			int i_88_ = i_87_ >> 42 & 0x1f;
			int i_89_ = i_87_ & 0x1f;
			int i_90_ = (i_87_ & 0x3ef) >> 37;
			int i_91_ = (i_89_ << 35) + ((i_90_ << 11) + (i_88_ << 19));
			Class94 class94 = Static.method1233(i_86_, 21803);
			if (class94.anInt1567 != i_91_) {
				class94.anInt1567 = i_91_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 109) {
			int i_92_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -114);
			int i_93_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			Class14_Sub2_Sub12.method318(i_93_, i_92_, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 252) {
			int i_94_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) 115);
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			int i_95_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -128);
			if (i_95_ >= 1 && i_95_ <= 8) {
				if (class124.method1717(40, Class133_Sub3.aClass124_3566))
					class124 = null;
				Class56.aClass124Array919[i_95_ - 1] = class124;
				Class14_Sub8_Sub11.aBooleanArray4271[i_95_ - 1] = i_94_ == 0;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 120) {
			int i_96_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
			int i_97_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 127);
			int i_98_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method805(0);
			Class94 class94 = Static.method1233(i_97_, 21803);
			class94.anInt1583 = class94.anInt1609 = i_98_;
			class94.aByte1496 = (byte) 0;
			class94.aByte1502 = (byte) 0;
			class94.anInt1523 = class94.anInt1561 = i_96_;
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 135) {
			int i_99_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -127);
			int i_100_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 115);
			Class94 class94;
			if (i_99_ < 0)
				class94 = null;
			else
				class94 = Static.method1233(i_99_, 21803);
			if (i_99_ < -70000)
				i_100_ += 32768;
			while (Class14_Sub8_Sub12.anInt4280 > Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position) {
				int i_101_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method818((byte) 58);
				int i_102_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 120);
				int i_103_ = 0;
				if (i_102_ != 0) {
					i_103_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					if (i_103_ == 255)
						i_103_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -93);
				}
				if (class94 != null && i_101_ >= 0 && i_101_ < class94.anIntArray1452.length) {
					class94.anIntArray1452[i_101_] = i_102_;
					class94.anIntArray1542[i_101_] = i_103_;
				}
				Class14_Sub8_Sub23.method604(i_101_, i_102_ - 1, i_100_, i_103_, -109);
			}
			if (class94 != null)
				Class103.method1531(class94);
			Class45.method1160(0);
			Class14_Sub4.anIntArray2786[Class14_Sub8_Sub26.method617(Class133_Sub5.anInt3612++,
					31)] = Class14_Sub8_Sub26.method617(i_100_, 32767);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 161) {
			int i_104_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 123);
			int i_105_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			Canvas_Sub1.method58(i_105_, (byte) -1, i_104_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 55) {
			Class14_Sub2_Sub2.method264(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 186) {
			Class14_Sub3.anInt2764 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class14_Sub8_Sub25.anInt4505 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class32.anInt566 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 108) {
			Static2.method822(-99);
			Class45.method1160(i + 1);
			Class22.anInt461 += 32;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 29 || Class133_Sub4.anInt3579 == 232 || Class133_Sub4.anInt3579 == 50
				|| Class133_Sub4.anInt3579 == 21 || Class133_Sub4.anInt3579 == 75 || Class133_Sub4.anInt3579 == 248
				|| Class133_Sub4.anInt3579 == 112 || Class133_Sub4.anInt3579 == 201 || Class133_Sub4.anInt3579 == 25
				|| Class133_Sub4.anInt3579 == 110 || Class133_Sub4.anInt3579 == 196 || Class133_Sub4.anInt3579 == 30) {
			Class14_Sub8_Sub7.method512(true);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 177) {
			Class14_Sub4.anInt2788 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class49.anInt817 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -99);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 142) {
			Class139.method1951((byte) -113, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 137) {
			int i_106_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			if (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798() != 0) {
				PacketBuffer class14_sub10_sub1 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734;
				class14_sub10_sub1.position = class14_sub10_sub1.position - 1;
				Class14_Sub8_Sub7.aClass109Array4195[i_106_] = new Class109(
						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734);
			} else
				Class14_Sub8_Sub7.aClass109Array4195[i_106_] = new Class109();
			Static2.anInt660 = Class14_Sub8_Sub23.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 223) {
			int i_107_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 125);
			if (i_107_ == 65535)
				i_107_ = -1;
			int i_108_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			int i_109_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method831(128);
			if (i_108_ == 65535)
				i_108_ = -1;
			int i_110_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method831(i ^ ~0x80);
			for (int i_111_ = i_108_; i_111_ <= i_107_; i_111_++) {
				long l = (long) i_111_ + ((long) i_109_ << 32);
				Linkable linkable = Class14_Sub8_Sub5.aClass55_4155.get(l);
				if (linkable != null)
					linkable.unlink();
				Class14_Sub8_Sub5.aClass55_4155.put(l, new Class14_Sub1(i_110_));
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 222) {
			Class138.method1944(false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 93) {
			int i_112_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 123);
			int i_113_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(3);
			int i_114_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -95);
			Class14_Sub15 class14_sub15 = ((Class14_Sub15) Class14_Sub30.aClass55_3275.get((long) i_114_));
			if (class14_sub15 != null)
				Static.method236(i_112_ != class14_sub15.anInt2999, class14_sub15, (byte) -122);
			Static.method237(1, i_114_, i_113_, i_112_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 100) {
			int i_115_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 3);
			byte i_116_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method813(i + 90);
			Canvas_Sub1.method58(i_116_, (byte) -1, i_115_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 3) {
			Class133_Sub4.anInt3579 = -1;
			Class71.anInt1085 = 0;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 59) {
			boolean bool = (Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) 110) == 1);
			int i_117_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(i + 9);
			Class94 class94 = Static.method1233(i_117_, 21803);
			if (!bool == class94.aBoolean1503) {
				class94.aBoolean1503 = bool;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_118_ = true;
			return bool_118_;
		}
		if (Class133_Sub4.anInt3579 == 41) {
			int i_119_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			int i_120_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) -1);
			Class94 class94 = Static.method1233(i_119_, 21803);
			if (class94 != null && class94.anInt1489 == 0) {
				if (i_120_ > class94.anInt1605 - class94.anInt1545)
					i_120_ = class94.anInt1605 - class94.anInt1545;
				if (i_120_ < 0)
					i_120_ = 0;
				if (class94.anInt1547 != i_120_) {
					class94.anInt1547 = i_120_;
					Class103.method1531(class94);
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 249) {
			Class14_Sub4.anInt2788 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class49.anInt817 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			for (int i_121_ = Class49.anInt817; i_121_ < Class49.anInt817 + 8; i_121_++) {
				for (int i_122_ = Class14_Sub4.anInt2788; Class14_Sub4.anInt2788 + 8 > i_122_; i_122_++) {
					if ((Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_121_][i_122_]) != null) {
						Class128.aClass2ArrayArrayArray2119[Class14_Sub2_Sub3.anInt3785][i_121_][i_122_] = null;
						Class67.method1300(i_122_, i ^ ~0x23fa, i_121_);
					}
				}
			}
			for (Class14_Sub14 class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getFront(); class14_sub14 != null; class14_sub14 = (Class14_Sub14) Class33.aClass2_583.getNext()) {
				if (Class49.anInt817 <= class14_sub14.anInt2967 && Class49.anInt817 + 8 > class14_sub14.anInt2967
						&& class14_sub14.anInt2970 >= Class14_Sub4.anInt2788
						&& Class14_Sub4.anInt2788 + 8 > class14_sub14.anInt2970
						&& Class14_Sub2_Sub3.anInt3785 == class14_sub14.anInt2969)
					class14_sub14.anInt2975 = 0;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 57) {
			int i_123_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -58);
			int i_124_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(i ^ ~0x3);
			int i_125_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method819(3);
			Class14_Sub2_Sub3.anInt3785 = i_123_ >> 1;
			Class14_Sub3.aClass133_Sub1_Sub1_2748.method1800((byte) -108, i_124_, (i_123_ & 0x1) == 1, i_125_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 49) {
			int i_126_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(i - 3976);
			int i_127_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 112);
			int i_128_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method831(128);
			int i_129_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			Class94 class94 = Static.method1233(i_128_, i ^ ~0x552b);
			if (class94.anInt1465 != i_126_ || i_129_ != class94.anInt1578 || class94.anInt1513 != i_127_) {
				class94.anInt1465 = i_126_;
				class94.anInt1513 = i_127_;
				class94.anInt1578 = i_129_;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 210) {
			if (Class14_Sub2_Sub12.anInt3912 != -1)
				Class74.method1333(Class14_Sub2_Sub12.anInt3912, (byte) 46, 0);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 205) {
			if (Class14_Sub8_Sub12.anInt4280 != 0)
				Class7.aClass124_174 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			else
				Class7.aClass124_174 = Class44.aClass124_729;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 195) {
			int i_130_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			int i_131_ = i_130_ & 0x3fff;
			int i_132_ = (i_130_ & 0x34e9799e) >> 60;
			int i_133_ = (i_130_ & 0xfffcac2) >> 14;
			int i_134_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 110);
			int i_135_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			i_133_ -= Class133_Sub6.anInt3676;
			int i_136_ = i_135_ & 0x3;
			i_131_ -= Class58.anInt947;
			int i_137_ = i_135_ >> 2;
			if (i_134_ == 65535)
				i_134_ = -1;
			int i_138_ = Class14_Sub19.anIntArray3082[i_137_];
			Class125.method1723(i_133_, i_138_, i_132_, i_131_, -1292647136, i_136_, i_134_, i_137_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 144) {
			if (Static.aFrame3962 != null)
				Class14_Sub2_Sub20.method428(i ^ 0x79);
			byte[] is = new byte[Class14_Sub8_Sub12.anInt4280];
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method844(is, Class14_Sub8_Sub12.anInt4280, 0);
			Static.method1211(Static2.method231((byte) 120, Class14_Sub8_Sub12.anInt4280, is, 0), true, i + 123);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 226) {
			anInt4633 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 139) {
			Class133_Sub1.method1796((byte) 24, Class14_Sub8_Sub34.aClass43_4647, Class14_Sub8_Sub12.anInt4280,
					(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 170) {
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(i ^ ~0x24fb);
			int i_139_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			int i_140_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_139_, (byte) 46);
			Class123.method1662(i_140_, class124, 2);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 179) {
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(i + 9468);
			int i_141_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = Static.method1233(i_141_, i + 21804);
			if (!class124.method1704(class94.aClass124_1499, (byte) 108)) {
				class94.aClass124_1499 = class124;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 247) {
			int i_142_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method836((byte) 123);
			int i_143_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -20);
			int i_144_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_142_, (byte) 46);
			Class14_Sub8_Sub31.method645((byte) -61, i_144_, i_143_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 227) {
			int i_145_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class66 class66 = new Class66();
			class66.anInt1046 = i_145_ & 0x3f;
			class66.anInt1035 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_146_ = i_145_ >> 38;
			if (class66.anInt1035 >= 0 && (Class76.aClass14_Sub2_Sub19Array1191.length > class66.anInt1035)) {
				if (class66.anInt1046 != 1 && class66.anInt1046 != 10) {
					if (class66.anInt1046 >= 2 && class66.anInt1046 <= 6) {
						if (class66.anInt1046 == 2) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 64;
						}
						if (class66.anInt1046 == 3) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 0;
						}
						if (class66.anInt1046 == 4) {
							class66.anInt1051 = 64;
							class66.anInt1038 = 128;
						}
						if (class66.anInt1046 == 5) {
							class66.anInt1051 = 0;
							class66.anInt1038 = 64;
						}
						if (class66.anInt1046 == 6) {
							class66.anInt1038 = 64;
							class66.anInt1051 = 128;
						}
						class66.anInt1046 = 2;
						class66.anInt1047 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 118);
						class66.anInt1044 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 114);
						class66.anInt1041 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
					}
				} else {
					class66.anInt1049 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 104);
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position += 3;
				}
				class66.anInt1043 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 121);
				if (class66.anInt1043 == 65535)
					class66.anInt1043 = -1;
				Static2.aClass66Array3721[i_146_] = class66;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 218) {
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			if (!class124.method1708(Class14_Sub2_Sub3.aClass124_3774, (byte) -93)) {
				if (class124.method1708(Class14_Sub8_Sub6.aClass124_4189, (byte) -72)) {
					boolean bool = false;
					Class124 class124_147_ = (class124.method1697(0,
							class124.method1700(i - 19927, Class62.aClass124_994), (byte) -104));
					long l = class124_147_.method1692(0);
					for (int i_148_ = 0; i_148_ < Class42.anInt698; i_148_++) {
						if (Class126.aLongArray2095[i_148_] == l) {
							bool = true;
							break;
						}
					}
					if (!bool && Class14_Sub8_Sub39.anInt4754 == 0) {
						Class124 class124_149_ = (class124.method1697(
								class124.method1700(-19928, Class62.aClass124_994) + 1, class124.method1693(0) - 9,
								(byte) -104));
						Class15.method943(class124_149_, false, class124_147_, 8);
					}
				} else if (class124.method1708(Class152.aClass124_2432, (byte) -107)) {
					Class124 class124_150_ = (class124.method1697(0, class124.method1700(-19928, Class62.aClass124_994),
							(byte) -104));
					long l = class124_150_.method1692(0);
					boolean bool = false;
					for (int i_151_ = 0; i_151_ < Class42.anInt698; i_151_++) {
						if (l == Class126.aLongArray2095[i_151_]) {
							bool = true;
							break;
						}
					}
					if (!bool && Class14_Sub8_Sub39.anInt4754 == 0)
						Class15.method943(Class14_Sub8_Sub9.aClass124_4244, false, class124_150_, 10);
				} else if (class124.method1708(Class66.aClass124_1037, (byte) -126)) {
					Class124 class124_152_ = (class124.method1697(0,
							class124.method1700(-19928, Class66.aClass124_1037), (byte) -104));
					Class15.method943(class124_152_, false, Class14_Sub8_Sub9.aClass124_4244, 11);
				} else if (!class124.method1708(Class111.aClass124_1856, (byte) -97)) {
					if (class124.method1708(Static.aClass124_3316, (byte) -99)) {
						Class124 class124_153_ = (class124.method1697(0,
								class124.method1700(-19928, (Static.aClass124_3316)), (byte) -104));
						if (Class14_Sub8_Sub39.anInt4754 == 0)
							Class15.method943(class124_153_, false, Class14_Sub8_Sub9.aClass124_4244, 13);
					} else if (!class124.method1708(Class123.aClass124_2065, (byte) -76)) {
						if (class124.method1708(Class46.aClass124_761, (byte) -124)) {
							Class124 class124_154_ = (class124.method1697(0,
									class124.method1700(i ^ 0x4dd7, Class62.aClass124_994), (byte) -104));
							boolean bool = false;
							long l = class124_154_.method1692(0);
							for (int i_155_ = 0; i_155_ < Class42.anInt698; i_155_++) {
								if (Class126.aLongArray2095[i_155_] == l) {
									bool = true;
									break;
								}
							}
							if (!bool && Class14_Sub8_Sub39.anInt4754 == 0)
								Class15.method943((Class14_Sub8_Sub9.aClass124_4244), false, class124_154_, 15);
						} else if (!class124.method1708((Class137.aClass124_2206), (byte) -100))
							Class15.method943(class124, false, Class14_Sub8_Sub9.aClass124_4244, 0);
						else {
							Class124 class124_156_ = (class124.method1697(0,
									class124.method1700(-19928, Class62.aClass124_994), (byte) -104));
							boolean bool = false;
							long l = class124_156_.method1692(0);
							for (int i_157_ = 0; Class42.anInt698 > i_157_; i_157_++) {
								if (l == Class126.aLongArray2095[i_157_]) {
									bool = true;
									break;
								}
							}
							if (!bool && Class14_Sub8_Sub39.anInt4754 == 0)
								Class15.method943((Class14_Sub8_Sub9.aClass124_4244), false, class124_156_, 16);
						}
					} else {
						Class124 class124_158_ = (class124.method1697(0,
								class124.method1700(-19928, Class62.aClass124_994), (byte) -104));
						boolean bool = false;
						long l = class124_158_.method1692(0);
						for (int i_159_ = 0; i_159_ < Class42.anInt698; i_159_++) {
							if (l == Class126.aLongArray2095[i_159_]) {
								bool = true;
								break;
							}
						}
						if (!bool && Class14_Sub8_Sub39.anInt4754 == 0)
							Class15.method943(Class14_Sub8_Sub9.aClass124_4244, false, class124_158_, 14);
					}
				} else {
					Class124 class124_160_ = (class124.method1697(0,
							class124.method1700(-19928, Class111.aClass124_1856), (byte) -104));
					if (Class14_Sub8_Sub39.anInt4754 == 0)
						Class15.method943(class124_160_, false, Class14_Sub8_Sub9.aClass124_4244, 12);
				}
			} else {
				Class124 class124_161_ = (class124.method1697(0, class124.method1700(-19928, Class62.aClass124_994),
						(byte) -104));
				boolean bool = false;
				long l = class124_161_.method1692(i + 1);
				for (int i_162_ = 0; Class42.anInt698 > i_162_; i_162_++) {
					if (l == Class126.aLongArray2095[i_162_]) {
						bool = true;
						break;
					}
				}
				if (!bool && Class14_Sub8_Sub39.anInt4754 == 0)
					Class15.method943(Class14_Sub30.aClass124_3274, false, class124_161_, 4);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 115) {
			Class15.anInt380 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 219) {
			int i_163_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method790(8);
			Class94 class94 = Static.method1233(i_163_, 21803);
			for (int i_164_ = 0; class94.anIntArray1452.length > i_164_; i_164_++) {
				class94.anIntArray1452[i_164_] = -1;
				class94.anIntArray1452[i_164_] = 0;
			}
			Class103.method1531(class94);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 124) {
			Class14_Sub4.anInt2788 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -110);
			Class49.anInt817 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -122);
			while (Class14_Sub8_Sub12.anInt4280 > Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.position) {
				Class133_Sub4.anInt3579 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
				Class14_Sub8_Sub7.method512(true);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 1) {
			int i_165_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -57);
			int i_166_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class14_Sub2_Sub12.method318(i_166_, i_165_, false);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 38) {
			for (int i_167_ = 0; Class14_Sub8_Sub11.anIntArray4275.length > i_167_; i_167_++) {
				if (Class14_Sub9_Sub3.anIntArray4851[i_167_] != Class14_Sub8_Sub11.anIntArray4275[i_167_]) {
					Class14_Sub8_Sub11.anIntArray4275[i_167_] = Class14_Sub9_Sub3.anIntArray4851[i_167_];
					Class122.method1660(i + 15238, i_167_);
					Class24.anIntArray467[Class14_Sub8_Sub26.method617(31, Class22.anInt461++)] = i_167_;
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 216) {
			Class113.method1580();
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 35) {
			int i_168_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) 100);
			int i_169_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method831(i + 129);
			int i_170_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class94 class94 = Static.method1233(i_168_, 21803);
			if (i_170_ == 65535)
				i_170_ = -1;
			if (!class94.aBoolean1455) {
				if (i_170_ == -1) {
					class94.anInt1543 = 0;
					Class133_Sub4.anInt3579 = -1;
					boolean bool = true;
					return bool;
				}
				Class142 class142 = Class14_Sub8_Sub24.method605(i ^ ~0x62, i_170_);
				class94.anInt1513 = class142.anInt2273 * 100 / i_169_;
				class94.anInt1578 = class142.anInt2286;
				class94.anInt1550 = i_170_;
				class94.anInt1543 = 4;
				class94.anInt1465 = class142.anInt2317;
				Class103.method1531(class94);
			} else {
				class94.anInt1495 = i_169_;
				class94.anInt1532 = i_170_;
				Class142 class142 = Class14_Sub8_Sub24.method605(i ^ ~0x49, i_170_);
				class94.anInt1465 = class142.anInt2317;
				class94.anInt1516 = class142.anInt2326;
				class94.anInt1482 = class142.anInt2285;
				class94.anInt1459 = class142.anInt2293;
				class94.anInt1578 = class142.anInt2286;
				class94.anInt1513 = class142.anInt2273;
				if (class94.anInt1514 <= 0) {
					if (class94.anInt1485 > 0)
						class94.anInt1513 = class94.anInt1513 * 32 / class94.anInt1485;
				} else
					class94.anInt1513 = class94.anInt1513 * 32 / class94.anInt1514;
				Class103.method1531(class94);
			}
			Class133_Sub4.anInt3579 = -1;
			return true;
		}
		if (Class133_Sub4.anInt3579 == 119) {
			int i_171_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 119);
			if (i_171_ == 65535)
				i_171_ = -1;
			int i_172_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_173_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 109);
			Class47.method1181(i_172_, i_171_, i_173_, (byte) -10);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 240) {
			Class42.anInt698 = Class14_Sub8_Sub12.anInt4280 / 8;
			for (int i_174_ = 0; i_174_ < Class42.anInt698; i_174_++) {
				Class126.aLongArray2095[i_174_] = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-115);
				client.aClass124Array2645[i_174_] = Class46.method1174(Class126.aLongArray2095[i_174_], (byte) 84);
			}
			Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 229) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(i - 23);
			Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method780((byte) -77);
			long l_175_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-111);
			long l_176_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 104);
			long l_177_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method829(99);
			int i_178_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			boolean bool = false;
			long l_179_ = (l_176_ << 32) + l_177_;
			while_21_: do {
				for (int i_180_ = 0; i_180_ < 100; i_180_++) {
					if (Class98.aLongArray1665[i_180_] == l_179_) {
						bool = true;
						break while_21_;
					}
				}
				if (i_178_ <= 1) {
					if (Class146.anInt2365 == 1 || Class14_Sub2_Sub21.anInt4081 == 1)
						bool = true;
					else {
						for (int i_181_ = 0; Class42.anInt698 > i_181_; i_181_++) {
							if (Class126.aLongArray2095[i_181_] == l) {
								bool = true;
								break;
							}
						}
					}
				}
			} while (false);
			if (!bool && Class14_Sub8_Sub39.anInt4754 == 0) {
				Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352] = l_179_;
				Class14_Sub8_Sub16.anInt4352 = (Class14_Sub8_Sub16.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub16.method368(
						Class75.method1337(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734, 32767).method1677(0)));
				if (i_178_ == 2 || i_178_ == 3)
					Class14_Sub7
							.method470(Class46.method1174(l_175_, (byte) 73).method1685(0), class124, -126,
									(Class14_Sub8_Sub7
											.method515(
													new Class124[] { Class14_Sub19.aClass124_3075,
															Class46.method1174(l, (byte) 64).method1685(i + 1) },
													(byte) -128)),
									9);
				else if (i_178_ == 1)
					Class14_Sub7
							.method470(Class46.method1174(l_175_, (byte) 117).method1685(0), class124, -125,
									(Class14_Sub8_Sub7
											.method515(
													new Class124[] { Class14_Sub21.aClass124_3099,
															Class46.method1174(l, (byte) 66).method1685(i + 1) },
													(byte) -50)),
									9);
				else
					Class14_Sub7.method470(Class46.method1174(l_175_, (byte) 67).method1685(0), class124, -125,
							Class46.method1174(l, (byte) 119).method1685(0), 9);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_182_ = true;
			return bool_182_;
		}
		if (Class133_Sub4.anInt3579 == 191) {
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			int i_183_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			int i_184_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class60.method1270(i_184_, (byte) 46);
			Class123.method1662(i_183_, class124, 2);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 190) {
			int i_185_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 112);
			Class32.method1074(i ^ 0x5e, i_185_);
			Class14_Sub4.anIntArray2786[Class14_Sub8_Sub26.method617(Class133_Sub5.anInt3612++,
					31)] = Class14_Sub8_Sub26.method617(32767, i_185_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 12) {
			int i_186_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_187_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_188_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_189_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_190_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 109);
			Class112.aBooleanArray1872[i_186_] = true;
			Class117.anIntArray1961[i_186_] = i_187_;
			Class14_Sub29.anIntArray3264[i_186_] = i_188_;
			Class133_Sub3.anIntArray3559[i_186_] = i_189_;
			Class14_Sub8_Sub15.anIntArray4336[i_186_] = i_190_;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 40) {
			int i_191_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 120);
			int i_192_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(-3977);
			Class14_Sub8_Sub19.anInt4408 = i_191_;
			Static.anInt102 = i_192_;
			Class33.method1084((byte) -35);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 234) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-114);
			int i_193_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 111);
			Class124 class124 = (Class14_Sub2_Sub3.method272(i_193_, (byte) 122).method442(81,
					Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
			Class14_Sub8_Sub3.method493((byte) -83, null, Class46.method1174(l, (byte) 75).method1685(0), 19, class124,
					i_193_);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 154) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-117);
			boolean bool = true;
			if (l < 0L) {
				l &= 0x7fffffffffffffffL;
				bool = false;
			}
			int i_194_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 111);
			int i_195_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class124 class124 = Class14_Sub8_Sub9.aClass124_4244;
			if (i_194_ > 0)
				class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			Class124 class124_196_ = Class46.method1174(l, (byte) 62).method1685(i + 1);
			for (int i_197_ = 0; Static2.anInt3728 > i_197_; i_197_++) {
				if (Class133_Sub1_Sub2.aLongArray4951[i_197_] == l) {
					if (i_194_ != Class45.anIntArray743[i_197_]) {
						Class45.anIntArray743[i_197_] = i_194_;
						if (i_194_ > 0)
							Class15.method943(
									(Class14_Sub8_Sub7.method515(
											(new Class124[] { class124_196_, Class74.aClass124_1142 }), (byte) -73)),
									false, Class14_Sub8_Sub9.aClass124_4244, 5);
						if (i_194_ == 0)
							Class15.method943((Class14_Sub8_Sub7.method515(
									(new Class124[] { class124_196_, (Class14_Sub8_Sub2.aClass124_4113) }),
									(byte) -52)), false, Class14_Sub8_Sub9.aClass124_4244, 5);
					}
					Static.aClass124Array3959[i_197_] = class124;
					class124_196_ = null;
					Static2.anIntArray3720[i_197_] = i_195_;
					Class58.aBooleanArray950[i_197_] = bool;
					break;
				}
			}
			if (class124_196_ != null && Static2.anInt3728 < 200) {
				Class133_Sub1_Sub2.aLongArray4951[Static2.anInt3728] = l;
				Static2.aClass124Array2938[Static2.anInt3728] = class124_196_;
				Class45.anIntArray743[Static2.anInt3728] = i_194_;
				Static.aClass124Array3959[(Static2.anInt3728)] = class124;
				Static2.anIntArray3720[Static2.anInt3728] = i_195_;
				Class58.aBooleanArray950[Static2.anInt3728] = bool;
				Static2.anInt3728++;
			}
			int i_198_ = Static2.anInt3728;
			boolean bool_199_ = false;
			Class38.anInt2616 = Class14_Sub8_Sub23.anInt4478;
			while (i_198_ > 0) {
				i_198_--;
				bool_199_ = true;
				for (int i_200_ = 0; i_200_ < i_198_; i_200_++) {
					if ((Class45.anIntArray743[i_200_] != Class120.anInt2005
							&& (Class45.anIntArray743[i_200_ + 1] == Class120.anInt2005))
							|| (Class45.anIntArray743[i_200_] == 0 && Class45.anIntArray743[i_200_ + 1] != 0)) {
						bool_199_ = false;
						int i_201_ = Class45.anIntArray743[i_200_];
						Class45.anIntArray743[i_200_] = Class45.anIntArray743[i_200_ + 1];
						Class45.anIntArray743[i_200_ + 1] = i_201_;
						Class124 class124_202_ = Static.aClass124Array3959[i_200_];
						Static.aClass124Array3959[i_200_] = (Static.aClass124Array3959[i_200_
								+ 1]);
						Static.aClass124Array3959[i_200_ + 1] = class124_202_;
						Class124 class124_203_ = Static2.aClass124Array2938[i_200_];
						Static2.aClass124Array2938[i_200_] = Static2.aClass124Array2938[i_200_ + 1];
						Static2.aClass124Array2938[i_200_ + 1] = class124_203_;
						long l_204_ = Class133_Sub1_Sub2.aLongArray4951[i_200_];
						Class133_Sub1_Sub2.aLongArray4951[i_200_] = Class133_Sub1_Sub2.aLongArray4951[i_200_ + 1];
						Class133_Sub1_Sub2.aLongArray4951[i_200_ + 1] = l_204_;
						int i_205_ = Static2.anIntArray3720[i_200_];
						Static2.anIntArray3720[i_200_] = Static2.anIntArray3720[i_200_ + 1];
						Static2.anIntArray3720[i_200_ + 1] = i_205_;
						boolean bool_206_ = Class58.aBooleanArray950[i_200_];
						Class58.aBooleanArray950[i_200_] = Class58.aBooleanArray950[i_200_ + 1];
						Class58.aBooleanArray950[i_200_ + 1] = bool_206_;
					}
				}
				if (bool_199_)
					break;
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_207_ = true;
			return bool_207_;
		}
		if (Class133_Sub4.anInt3579 == 10) {
			int i_208_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method832((byte) -96);
			int i_209_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			int i_210_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method781(false);
			Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_210_];
			if (class133_sub1_sub2 != null)
				Class14_Sub8_Sub24.method610(i_209_, i_208_, class133_sub1_sub2, 12288);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 217) {
			Class45.method1160(0);
			int i_211_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -61);
			int i_212_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method820((byte) -100);
			int i_213_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method806((byte) -111);
			Class14_Sub2_Sub12.anIntArray3916[i_213_] = i_212_;
			Class14_Sub8_Sub21.anIntArray4444[i_213_] = i_211_;
			Class56.anIntArray913[i_213_] = 1;
			for (int i_214_ = 0; i_214_ < 98; i_214_++) {
				if (Class14_Sub29.anIntArray3245[i_214_] <= i_212_)
					Class56.anIntArray913[i_213_] = i_214_ + 2;
			}
			Static2.anIntArray2727[Class14_Sub8_Sub26.method617(31, Canvas_Sub2.anInt54++)] = i_213_;
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 140) {
			int i_215_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 119);
			int i_216_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -120);
			int i_217_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method791(i ^ 0xf88);
			int i_218_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 118);
			if (i_216_ >> 30 == 0) {
				if (i_216_ >> 29 == 0) {
					if (i_216_ >> 60 != 0) {
						int i_219_ = i_216_ & 0xffff;
						Class133_Sub1_Sub1 class133_sub1_sub1;
						if (i_219_ != Class14_Sub2_Sub10.anInt3868)
							class133_sub1_sub1 = (Class14_Sub8_Sub23.aClass133_Sub1_Sub1Array4474[i_219_]);
						else
							class133_sub1_sub1 = Class14_Sub3.aClass133_Sub1_Sub1_2748;
						if (class133_sub1_sub1 != null) {
							class133_sub1_sub1.anInt3485 = i_215_ + Class14_Sub2_Sub20.anInt4064;
							class133_sub1_sub1.anInt3459 = 0;
							class133_sub1_sub1.anInt3487 = i_217_;
							class133_sub1_sub1.anInt3475 = i_218_;
							if (class133_sub1_sub1.anInt3487 == 65535)
								class133_sub1_sub1.anInt3487 = -1;
							class133_sub1_sub1.anInt3470 = 0;
							if (class133_sub1_sub1.anInt3485 > Class14_Sub2_Sub20.anInt4064)
								class133_sub1_sub1.anInt3470 = -1;
						}
					}
				} else {
					int i_220_ = i_216_ & 0xffff;
					Class133_Sub1_Sub2 class133_sub1_sub2 = Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_220_];
					if (class133_sub1_sub2 != null) {
						class133_sub1_sub2.anInt3485 = Class14_Sub2_Sub20.anInt4064 + i_215_;
						class133_sub1_sub2.anInt3475 = i_218_;
						class133_sub1_sub2.anInt3470 = 0;
						class133_sub1_sub2.anInt3487 = i_217_;
						class133_sub1_sub2.anInt3459 = 0;
						if (class133_sub1_sub2.anInt3485 > Class14_Sub2_Sub20.anInt4064)
							class133_sub1_sub2.anInt3470 = -1;
						if (class133_sub1_sub2.anInt3487 == 65535)
							class133_sub1_sub2.anInt3487 = -1;
					}
				}
			} else {
				int i_221_ = -Class133_Sub6.anInt3676 + (i_216_ >> 46 & 0x3fff);
				int i_222_ = (i_216_ & 0x36213ad7) >> 28;
				int i_223_ = -Class58.anInt947 + (i_216_ & 0x3fff);
				if (i_221_ >= 0 && i_223_ >= 0 && i_221_ < 104 && i_223_ < 104) {
					i_223_ = i_223_ * 128 + 64;
					i_221_ = i_221_ * 128 + 64;
					Class133_Sub5 class133_sub5 = new Class133_Sub5(i_217_, i_222_, i_221_, i_223_,
							(-i_218_ + Static.method1017(i_221_, i_222_, (byte) -127, i_223_)), i_215_,
							Class14_Sub2_Sub20.anInt4064);
					Class79.aClass2_1268.pushBack(new Class14_Sub2_Sub7(class133_sub5));
				}
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 193) {
			int i_224_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_225_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_226_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 112);
			int i_227_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			int i_228_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			Class125.method1725(i_226_, i_224_, i_227_, i_228_, i_225_, (byte) 86);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 149) {
			long l = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method796(-124);
			long l_229_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 114);
			long l_230_ = (long) Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method829(103);
			long l_231_ = l_230_ + (l_229_ << 32);
			int i_232_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method798();
			boolean bool = false;
			int i_233_ = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method784((byte) 109);
			while_22_: do {
				for (int i_234_ = 0; i_234_ < 100; i_234_++) {
					if (Class98.aLongArray1665[i_234_] == l_231_) {
						bool = true;
						break while_22_;
					}
				}
				if (i_232_ <= 1) {
					for (int i_235_ = 0; Class42.anInt698 > i_235_; i_235_++) {
						if (Class126.aLongArray2095[i_235_] == l) {
							bool = true;
							break;
						}
					}
				}
			} while (false);
			if (!bool && Class14_Sub8_Sub39.anInt4754 == 0) {
				Class98.aLongArray1665[Class14_Sub8_Sub16.anInt4352] = l_231_;
				Class14_Sub8_Sub16.anInt4352 = (Class14_Sub8_Sub16.anInt4352 + 1) % 100;
				Class124 class124 = (Class14_Sub2_Sub3.method272(i_233_, (byte) 70).method442(-118,
						Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734));
				if (i_232_ == 2)
					Class14_Sub8_Sub3.method493((byte) -60, null,
							Class14_Sub8_Sub7.method515((new Class124[] { (Class14_Sub19.aClass124_3075),
									Class46.method1174(l, (byte) 121).method1685(0) }), (byte) -7),
							18, class124, i_233_);
				else if (i_232_ == 1)
					Class14_Sub8_Sub3.method493((byte) -85, null,
							Class14_Sub8_Sub7.method515((new Class124[] { (Class14_Sub21.aClass124_3099),
									Class46.method1174(l, (byte) 94).method1685(0) }), (byte) -127),
							18, class124, i_233_);
				else
					Class14_Sub8_Sub3.method493((byte) -62, null, Class46.method1174(l, (byte) 78).method1685(0), 18,
							class124, i_233_);
			}
			Class133_Sub4.anInt3579 = -1;
			boolean bool_236_ = true;
			return bool_236_;
		}
		if (Class133_Sub4.anInt3579 == 152) {
			Class124 class124 = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method797(9467);
			Object[] objects = new Object[class124.method1693(i + 1) + 1];
			for (int i_237_ = class124.method1693(0) - 1; i_237_ >= 0; i_237_--) {
				if (class124.method1710(i + 1, i_237_) != 115)
					objects[i_237_ + 1] = new Integer(
							Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -110));
				else
					objects[i_237_ + 1] = Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734
							.method797(Canvas_Sub2.method69(i, -9468));
			}
			objects[0] = new Integer(Class14_Sub8_Sub38.aClass14_Sub10_Sub1_4734.method812((byte) -108));
			Class14_Sub21 class14_sub21 = new Class14_Sub21();
			class14_sub21.anObjectArray3115 = objects;
			Class133_Sub3.method1830(class14_sub21, i - 1976917688);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		if (Class133_Sub4.anInt3579 == 56) {
			Class48.method1191((byte) 124);
			Class133_Sub4.anInt3579 = -1;
			boolean bool = true;
			return bool;
		}
		Class14_Sub9_Sub3.method738(new StringBuilder("T1 - ").append(Class133_Sub4.anInt3579).append(",")
				.append(Static.anInt3931).append(",").append(Class14_Sub8_Sub2.anInt4114).append(" - ")
				.append(Class14_Sub8_Sub12.anInt4280).toString(), null, 95);
		Static.method238((byte) 123);
		boolean bool = true;
		return bool;
	}

	public int anInt4637 = 4096;

	public Class14_Sub8_Sub33() {
		super(1, true);
	}

	public void method475(int i, int i_238_, Buffer class14_sub10) {
		if (i == 0)
			anInt4637 = class14_sub10.method784((byte) 113);
		if (i_238_ != 24777)
			method654(-71);
	}

	public int[] method484(int i, byte i_239_) {
		if (i_239_ > -58)
			aClass124_4632 = null;
		int[] is = aClass149_2851.method2014(i, (byte) 104);
		if (aClass149_2851.aBoolean2402) {
			int[] is_240_ = method483(0, (byte) -120, i - 1 & Class115.anInt1927);
			int[] is_241_ = method483(0, (byte) -23, i);
			int[] is_242_ = method483(0, (byte) -64, Class115.anInt1927 & i + 1);
			for (int i_243_ = 0; Class112.anInt1876 > i_243_; i_243_++) {
				int i_244_ = (is_242_[i_243_] - is_240_[i_243_]) * anInt4637;
				int i_245_ = ((-is_241_[Static2.anInt4882 & i_243_ - 1]
						+ is_241_[Static2.anInt4882 & i_243_ + 1]) * anInt4637);
				int i_246_ = i_244_ >> 12;
				int i_247_ = i_245_ >> 12;
				int i_248_ = i_247_ * i_247_ >> 12;
				int i_249_ = i_246_ * i_246_ >> 12;
				int i_250_ = (int) (Math.sqrt((double) ((float) (i_249_ + i_248_ + 4096) / 4096.0F)) * 4096.0);
				int i_251_ = i_250_ == 0 ? 0 : 16777216 / i_250_;
				is[i_243_] = -i_251_ + 4096;
			}
		}
		int[] is_252_ = is;
		return is_252_;
	}
}
