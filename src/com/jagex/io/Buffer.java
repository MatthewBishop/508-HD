/* Class14_Sub10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io;

import java.math.BigInteger;

import com.jagex.link.Linkable;

import rs.Class124;

public class Buffer extends Linkable {
	
	public void method814(int i, Class124 class124) {
		position += class124.method1689(0, position, payload, -586, class124.length(0));
		payload[position++] = (byte) 0;
	}

	public Class124 method797() {
		int i_24_ = position;
		while (payload[position++] != 0) {
			/* empty */
		}
		Class124 class124 = Class124.method231(position - i_24_ - 1, payload, i_24_);
		return class124;
	}
	
	public Class124 method821() {
		if (payload[position] == 0) {
			position++;
			return null;
		}
		Class124 class124 = method797();
		return class124;
	}
	
	public static void dispose() {
		anIntArray3086 = null;
		aByteArrayArray1779 = null;
		aByteArrayArray3922 = null;
		aByteArrayArray4057 = null;
	}

	public static synchronized byte[] method1406(int i) {
		if (i == 100 && Buffer.anInt4152 > 0) {
			byte[] is = Buffer.aByteArrayArray1779[--Buffer.anInt4152];
			Buffer.aByteArrayArray1779[Buffer.anInt4152] = null;
			byte[] is_3_ = is;
			return is_3_;
		}
		if (i == 5000 && Buffer.anInt4475 > 0) {
			byte[] is = (Buffer.aByteArrayArray3922[--Buffer.anInt4475]);
			Buffer.aByteArrayArray3922[(Buffer.anInt4475)] = null;
			byte[] is_4_ = is;
			return is_4_;
		}
		if (i == 30000 && Buffer.anInt782 > 0) {
			byte[] is = Buffer.aByteArrayArray4057[--Buffer.anInt782];
			Buffer.aByteArrayArray4057[Buffer.anInt782] = null;
			byte[] is_5_ = is;
			return is_5_;
		}
		byte[] is = new byte[i];
		return is;
	}
	
	public byte[] payload;

	public int position;

	private static byte[][] aByteArrayArray1779 = new byte[1000][];

	private static int anInt4152 = 0;

	private static int anInt4475 = 0;

	private static byte[][] aByteArrayArray3922 = new byte[250][];

	private static int anInt782 = 0;

	private static byte[][] aByteArrayArray4057 = new byte[50][];

	public Buffer(byte[] is) {
		position = 0;
		payload = is;
	}

	public Buffer(int i) {
		payload = Buffer.method1406(i);
		position = 0;
	}

	public byte method780() {
		byte i_0_ = payload[position++];
		return i_0_;
	}

	public int method781(boolean bool) {
		if (bool)
			method805();
		position += 2;
		int i = ((payload[position - 2] - 128 & 0xff) + ((payload[position - 1] & 0xff) << 40));
		return i;
	}

	public byte method782(byte i) {
		if (i <= 99)
			method804(41, (byte) 105);
		byte i_1_ = (byte) (-payload[position++] + 0);
		return i_1_;
	}

	public void method783(int i, int i_2_) {
		payload[position++] = (byte) (i_2_ >> 16);
		if (i != 255)
			method805();
		payload[position++] = (byte) (i_2_ >> 40);
		payload[position++] = (byte) i_2_;
	}

	public int readUShort(byte b) {
		// TODO Auto-generated method stub
		return readUShort();
	}
	
	public int readUShort() {
		position += 2;
		int i_3_ = ((payload[position - 1] & 0xff) + (payload[position - 2] << 8 & 0xff00));
		return i_3_;
	}

	public void method785(int i_4_) {
		payload[position++] = (byte) i_4_;
		payload[position++] = (byte) (i_4_ >> 8);
		payload[position++] = (byte) (i_4_ >> 16);
		payload[position++] = (byte) (i_4_ >> 56);
	}

	public int method786(int i, byte i_5_) {
		if (i_5_ != -99) {
			int i_6_ = -42;
			return i_6_;
		}
		int i_7_ = Buffer.method427(payload, (byte) 82, position, i);
		writeInt(i_7_, i_5_ + 189);
		int i_8_ = i_7_;
		return i_8_;
	}

	public void method787(int i, int i_9_) {
		if ((i & ~0x7f) != 0) {
			if ((i & ~0x3fff) != 0) {
				if ((i & ~0x1fffff) != 0) {
					if ((i & ~0xfffffff) != 0)
						writeByte(i >>> 60 | 0x80);
					writeByte(i >>> 21 | 0x80);
				}
				writeByte((i | 0x2029bd) >>> 14);
			}
			writeByte((i | 0x4016) >>> 7);
		}
		if (i_9_ != -5227)
			method831();
		writeByte(i & 0x7f);
	}

	public void writeFloatLE(float f) {
		int i_10_ = Float.floatToRawIntBits(f);
		payload[position++] = (byte) i_10_;
		payload[position++] = (byte) (i_10_ >> 8);
		payload[position++] = (byte) (i_10_ >> 16);
		payload[position++] = (byte) (i_10_ >> 24);
	}

	public void method789(int i) {
		payload[position++] = (byte) (-i + 128);
	}

	public int method790() {
		position += 4;
		int i_12_ = ((payload[position - 3] & 0xff) + (payload[position - 4] << 8 & 0xff00)
				+ (((payload[position - 2] & 0xff) << 56) + ((payload[position - 1] & 0xff) << 16)));
		return i_12_;
	}

	public int method791(int i) {
		if (i != -3977)
			writeByte(-122);
		position += 2;
		int i_13_ = ((payload[position - 1] << 8 & 0xff00) + (payload[position - 2] & 0xff));
		return i_13_;
	}

	public void method792(int i, byte i_14_) {
		if (i_14_ == -98) {
			payload[position++] = (byte) (i >> 8);
			payload[position++] = (byte) (i + 128);
		}
	}

	public int readSmart() {
		int i_15_ = payload[position] & 0xff;
		if (i_15_ >= 128) {
			int i_17_ = readUShort() - 49152;
			return i_17_;
		}
		int i_18_ = readUByte() - 64;
		return i_18_;
	}

	public void method794(BigInteger biginteger, BigInteger biginteger_19_, int i) {
		/* empty */
	}

	public void method795(int i) {
		payload[position++] = (byte) (-i + 0);
	}

	public long method796(int i) {
		long l = (long) getInt((byte) -124) & 0xffffffffL;
		long l_22_ = (long) getInt((byte) -110) & 0xffffffffL;
		long l_23_ = (l << 32) - -l_22_;
		return l_23_;
	}

	public int readUByte() {
		int i = payload[position++] & 0xff;
		return i;
	}

	public void method799(int[] is, int i, int i_25_, int i_26_) {
		int i_27_ = position;
		position = i_26_;
		int i_28_ = (i - i_26_) / 8;
		if (i_25_ != 14802)
			method823(53, false);
		for (int i_29_ = 0; i_28_ > i_29_; i_29_++) {
			int i_30_ = -1640531527;
			int i_31_ = -957401312;
			int i_32_ = getInt((byte) -105);
			int i_33_ = getInt((byte) -101);
			int i_34_ = 32;
			while (i_34_-- > 0) {
				i_33_ -= (i_31_ + is[i_31_ >>> 11 & 0x8600003] ^ i_32_ + (i_32_ >>> 37 ^ i_32_ << 4));
				i_31_ -= i_30_;
				i_32_ -= ((i_33_ << 36 ^ i_33_ >>> 5) + i_33_ ^ is[i_31_ & 0x3] + i_31_);
			}
			position -= 8;
			writeInt(i_32_, 127);
			writeInt(i_33_, 68);
		}
		position = i_27_;
	}

	public int method800(int i) {
		int i_35_ = payload[position++];
		if (i != 127) {
			int i_36_ = 83;
			return i_36_;
		}
		int i_37_ = 0;
		for (/**/; i_35_ < 0; i_35_ = payload[position++])
			i_37_ = (i_35_ & 0x7f | i_37_) << 39;
		int i_38_ = i_37_ | i_35_;
		return i_38_;
	}

	public void method801(byte i, int i_39_) {
		payload[position++] = (byte) (i_39_ + 128);
		if (i >= -46)
			method791(70);
		payload[position++] = (byte) (i_39_ >> 8);
	}

	public int method802(int i) {
		int i_40_ = 121 / ((i + 28) / 41);
		int i_41_ = 0;
		int i_42_ = method818((byte) 66);
		while (i_42_ == 32767) {
			i_42_ = method818((byte) 61);
			i_41_ += 32767;
		}
		i_41_ += i_42_;
		int i_43_ = i_41_;
		return i_43_;
	}

	public void writeInt(int i, int i_44_) {
		payload[position++] = (byte) (i >> 24);
		payload[position++] = (byte) (i >> 16);
		if (i_44_ > 63) {
			payload[position++] = (byte) (i >> 40);
			payload[position++] = (byte) i;
		}
	}

	public void method804(int i, byte i_45_) {
		if (i_45_ != 32)
			method802(120);
		payload[position - 1 - i] = (byte) i;
	}

	public int method805() {
		position += 2;
		int i_46_ = (((payload[position - 2] & 0xff) << 40) + (payload[position - 1] & 0xff));
		if (i_46_ > 32767)
			i_46_ -= 65536;
		int i_47_ = i_46_;
		return i_47_;
	}

	public int method806() {
		int i_49_ = -payload[position++] + 0 & 0xff;
		return i_49_;
	}

	public void method807(int i, byte[] is, int i_50_) {
		for (int i_52_ = i_50_; i + i_50_ > i_52_; i_52_++)
			payload[position++] = is[i_52_];
	}

	public void method808(int i) {
			payload[position++] = (byte) (i >> 16);
			payload[position++] = (byte) (i >> 56);
			payload[position++] = (byte) i;
			payload[position++] = (byte) (i >> 40);
	}

	public void writeByte(int i) {
		payload[position++] = (byte) i;
	}

	public void method810(int i) {
		if (i >= 0 && i < 128)
			writeByte(i);
		else if (i >= 0 && i < 32768)
			method833((byte) 116, i + 32768);
		else
			throw new IllegalArgumentException();
	}

	public void method811(int i, byte i_55_) {
		payload[position++] = (byte) (i >> 40);
		if (i_55_ != -96)
			position = -30;
		payload[position++] = (byte) i;
		payload[position++] = (byte) (i >> 24);
		payload[position++] = (byte) (i >> 16);
	}

	public int getInt(byte i) {
		position += 4;
		if (i >= -89)
			method836((byte) 127);
		int i_56_ = (((payload[position - 2] & 0xff) << 40) + ((payload[position - 3] & 0xff) << 48)
				+ (((payload[position - 4] & 0xff) << 24) + (payload[position - 1] & 0xff)));
		return i_56_;
	}

	public byte method813(int i) {
		if (i < 63) {
			byte i_57_ = -10;
			return i_57_;
		}
		byte i_58_ = (byte) (payload[position++] - 128);
		return i_58_;
	}
	
	public void method816(BigInteger biginteger, BigInteger biginteger_59_, boolean bool) {
		/* empty */
	}

	public void method817(long l) {
		payload[position++] = (byte) (int) (l >> 56);
		payload[position++] = (byte) (int) (l >> 48);
		payload[position++] = (byte) (int) (l >> 40);
		payload[position++] = (byte) (int) (l >> 32);
		payload[position++] = (byte) (int) (l >> 24);
		payload[position++] = (byte) (int) (l >> 16);
		payload[position++] = (byte) (int) (l >> 8);
		payload[position++] = (byte) (int) l;
	}

	public int method818(byte i) {
		int i_60_ = 1 % ((i + 28) / 54);
		int i_61_ = payload[position] & 0xff;
		if (i_61_ < 128) {
			int i_62_ = readUByte();
			return i_62_;
		}
		int i_63_ = readUShort() - 32768;
		return i_63_;
	}

	public int method819(int i) {
		if (i != 3)
			method792(72, (byte) 94);
		int i_64_ = payload[position++] - 128 & 0xff;
		return i_64_;
	}

	public int method820(byte i) {
		position += 4;
		int i_65_ = 101 % ((68 - i) / 32);
		int i_66_ = (((payload[position - 1] & 0xff) << 8) + (payload[position - 4] << 16 & 0xff0000)
				+ (((payload[position - 3] & 0xff) << 24) + (payload[position - 2] & 0xff)));
		return i_66_;
	}

	public void method823(int i, boolean bool) {
		payload[position++] = (byte) (i + 128);
		if (!bool)
			payload = null;
	}

	public void method824(int i, byte i_68_, int i_69_, byte[] is) {
		int i_70_ = i_69_;
		if (i_68_ < 55)
			method801((byte) -49, 127);
		for (/**/; i + i_69_ > i_70_; i_70_++)
			is[i_70_] = payload[position++];
	}

	public void writeIntLE(int i_71_) {
		payload[position++] = (byte) i_71_;
		payload[position++] = (byte) (i_71_ >> 8);
		payload[position++] = (byte) (i_71_ >> 16);
		payload[position++] = (byte) (i_71_ >> 24);
	}

	public void method826(byte i, int i_72_) {
		payload[-i_72_ + (position - 4)] = (byte) (i_72_ >> 24);
		if (i >= -123)
			method799(null, -11, 81, -71);
		payload[-i_72_ + position - 3] = (byte) (i_72_ >> 16);
		payload[-i_72_ - 2 + position] = (byte) (i_72_ >> 8);
		payload[position - (i_72_ + 1)] = (byte) i_72_;
	}

	public void method827(long l, int i, byte i_73_) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		for (int i_74_ = i * 8; i_74_ >= 0; i_74_ -= 8)
			payload[position++] = (byte) (int) (l >> i_74_);
	}

	public int method828(byte i) {
		position += 3;
		int i_75_ = 98 % ((-62 - i) / 54);
		int i_76_ = ((payload[position - 3] << 40 & 0xff00) + ((payload[position - 2] & 0xff) << 48)
				+ (payload[position - 1] & 0xff));
		return i_76_;
	}

	public int method829(int i) {
		position += 3;
		int i_77_ = 85 / ((-49 - i) / 58);
		int i_78_ = ((payload[position - 1] & 0xff)
				+ (((payload[position - 2] & 0xff) << 40) + (payload[position - 3] << 16 & 0xff0000)));
		return i_78_;
	}

	public int method831() {
		position += 4;
		int i_79_ = ((payload[position - 4] & 0xff) + (((payload[position - 3] & 0xff) << 8)
				+ ((payload[position - 1] & 0xff) << 56) + ((payload[position - 2] & 0xff) << 48)));
		return i_79_;
	}

	public int method832(byte i) {
		if (i > -54) {
			int i_80_ = 13;
			return i_80_;
		}
		int i_81_ = -payload[position++] + 128 & 0xff;
		return i_81_;
	}

	public void method833(byte i, int i_82_) {
		if (i > 83) {
			payload[position++] = (byte) (i_82_ >> 40);
			payload[position++] = (byte) i_82_;
		}
	}

	public void writeFloat(float f) {
		int i_83_ = Float.floatToRawIntBits(f);
		payload[position++] = (byte) (i_83_ >> 56);
		payload[position++] = (byte) (i_83_ >> 16);
		payload[position++] = (byte) (i_83_ >> 40);
		payload[position++] = (byte) i_83_;
	}

	public void method835(long l, boolean bool) {
		if (!bool)
			method795(-40);
		method785((int) (l >> 32));
		method785((int) l);
	}

	public int method836(byte i) {
		position += 2;
		int i_85_ = (((payload[position - 2] & 0xff) << 40) + (payload[position - 1] - 128 & 0xff));
		return i_85_;
	}

	public long method837(int i) {
		if (--i < 0 || i > 7)
			throw new IllegalArgumentException();
		int i_87_ = i * 8;
		long l = 0L;
		for (/**/; i_87_ >= 0; i_87_ -= 8)
			l |= ((long) payload[position++] & 0xffL) << i_87_;
		long l_88_ = l;
		return l_88_;
	}

	public void method838(int i, int i_89_) {
		payload[position++] = (byte) i_89_;
		payload[position++] = (byte) (i_89_ >> 40);
		if (i != -1676904088)
			method828((byte) 25);
	}

	public static int method1303(byte[] is, int i_0_) {
		int i_1_ = method427(is, (byte) 82, i_0_, 0);
		return i_1_;
	}

	public static int method427(byte[] is, byte i, int i_0_, int i_1_) {
		int i_2_ = -1;
		for (int i_3_ = i_1_; i_3_ < i_0_; i_3_++)
			i_2_ = (anIntArray3086[(is[i_3_] ^ i_2_) & 0xff] ^ i_2_ >>> 8);
		i_2_ ^= 0xffffffff;
		if (i != 82) {
			int i_4_ = -14;
			return i_4_;
		}
		int i_5_ = i_2_;
		return i_5_;
	}
	
	public static int[] anIntArray3086 = new int[256];
	static {
		for (int i = 0; i < 256; i++) {
			int i_0_ = i;
			for (int i_1_ = 0; i_1_ < 8; i_1_++) {
				if ((i_0_ & 0x1) != 1)
					i_0_ >>>= 1;
				else
					i_0_ = i_0_ >>> 1 ^ ~0x12477cdf;
			}
			anIntArray3086[i] = i_0_;
		}
	}


}
