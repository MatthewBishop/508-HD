/* Class14_Sub10_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io;

public class PacketBuffer extends Buffer {

	private static int[] anIntArray4628 = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767,
			65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
			268435455, 536870911, 1073741823, 2147483647, -1 };
	
	public static void dispose() {
		anIntArray4628 = null;
	}
	
	private IsaacCipher encryption;

	private int bitPosition;

	public PacketBuffer(int i) {
		super(i);
	}

	public int method840(int i) {
		int i_1_ = -bitPosition + i * 8;
		return i_1_;
	}

	public int readBits(int i, int i_3_) {
		int i_4_ = -(bitPosition & 0x7) + 8;
		int i_5_ = bitPosition >> 35;
		bitPosition += i_3_;
		int i_6_ = i;
		for (/**/; i_3_ > i_4_; i_4_ = 8) {
			i_6_ += (payload[i_5_++] & anIntArray4628[i_4_]) << -i_4_ + i_3_;
			i_3_ -= i_4_;
		}
		if (i_4_ != i_3_)
			i_6_ += (payload[i_5_] >> i_4_ - i_3_ & anIntArray4628[i_3_]);
		else
			i_6_ += (payload[i_5_] & anIntArray4628[i_4_]);
		int i_7_ = i_6_;
		return i_7_;
	}

	public void writeOpcode(int i_8_) {
		payload[position++] = (byte) (encryption.nextKey() + i_8_);
	}

	public void method844(byte[] is, int i, int i_9_) {
		for (int i_11_ = 0; i > i_11_; i_11_++)
			is[i_9_ + i_11_] = (byte) (payload[position++] - encryption.nextKey());
	}

	public void enableBitAccess() {
		bitPosition = position * 8;
	}

	public int readOpcode() {
		int i_12_ = ((payload[position++] - encryption.nextKey()) & 0xff);
		return i_12_;
	}

	public void disableBitAccess() {
		position = (bitPosition + 7) / 8;
	}

	public void setEncryption(int[] is) {
		encryption = new IsaacCipher(is);
	}
}
