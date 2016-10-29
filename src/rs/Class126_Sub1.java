/* Class126_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.nio.ByteBuffer;

public class Class126_Sub1 extends Class126 {
	public ByteBuffer aByteBuffer3429;

	@Override
	public void method1740(byte[] is, int i) {
		aByteBuffer3429 = ByteBuffer.allocateDirect(is.length);
		aByteBuffer3429.position(0);
		aByteBuffer3429.put(is);
		if (i <= 91)
			method1740(null, 121);
	}

	@Override
	public byte[] method1745(byte i) {
		byte[] is = new byte[aByteBuffer3429.capacity()];
		if (i != -45)
			method1740(null, -47);
		aByteBuffer3429.position(0);
		aByteBuffer3429.get(is);
		byte[] is_0_ = is;
		return is_0_;
	}
}
