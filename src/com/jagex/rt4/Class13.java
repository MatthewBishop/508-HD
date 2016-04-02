/* Class13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

import com.jagex.io.Buffer;

public class Class13 {
	public ByteBuffer aByteBuffer343;
	public static byte[] aByteArray344 = new byte[16384];
	public VertexBuffer aClass29_345;
	public boolean aBoolean346 = true;
	public VertexBuffer aClass29_347;
	public int anInt348;
	public int anInt349 = -1;
	public ByteBuffer aByteBuffer350;

	public static void method225() {
		aByteArray344 = null;
	}

	public boolean method226(Class148_Sub1 class148_sub1, int i, int i_0_) {
		byte[] is = class148_sub1.aByteArray3689;
		int i_1_ = class148_sub1.anInt2371;
		int i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * i_1_;
		int i_3_ = 0;
		for (int i_4_ = -128; i_4_ < 0; i_4_++) {
			i_3_ = (i_3_ << 8) - i_3_;
			for (int i_5_ = -128; i_5_ < 0; i_5_++) {
				if (is[i_2_++] != 0)
					i_3_++;
			}
			i_2_ += i_1_ - 128;
		}
		if (i_3_ == anInt349)
			return false;
		anInt349 = i_3_;
		i_2_ = i * 128 + 1 + (i_0_ * 128 + 1) * i_1_;
		int i_6_ = 0;
		for (int i_7_ = -128; i_7_ < 0; i_7_++) {
			for (int i_8_ = -128; i_8_ < 0; i_8_++) {
				if (is[i_2_] != 0)
					aByteArray344[i_6_++] = (byte) 68;
				else {
					int i_9_ = 0;
					if (is[i_2_ - 1] != 0)
						i_9_++;
					if (is[i_2_ + 1] != 0)
						i_9_++;
					if (is[i_2_ - i_1_] != 0)
						i_9_++;
					if (is[i_2_ + i_1_] != 0)
						i_9_++;
					aByteArray344[i_6_++] = (byte) (i_9_ * 17);
				}
				i_2_++;
			}
			i_2_ += i_1_ - 128;
		}
		GL gl = Class121.aGL2030;
		ByteBuffer bytebuffer = ByteBuffer.wrap(aByteArray344);
		bytebuffer.limit(16384);
		Class121.method1632(anInt348);
		gl.glTexImage2D(3553, 0, 6406, 128, 128, 0, 6406, 5121, bytebuffer);
		return true;
	}

	public void method227(int[][] is, int i, int i_10_) {
		Buffer class14_sub10 = new Buffer(1620);
		for (int i_11_ = 0; i_11_ <= 8; i_11_++) {
			for (int i_12_ = 0; i_12_ <= 8; i_12_++) {
				if (Class121.aBoolean2046) {
					class14_sub10.method834((float) i_12_ / 8.0F);
					class14_sub10.method834((float) i_11_ / 8.0F);
					class14_sub10.method834((float) (i_12_ * 128));
					class14_sub10.method834((float) (is[i_12_ + i][i_11_ + i_10_]));
					class14_sub10.method834((float) (i_11_ * 128));
				} else {
					class14_sub10.method788((float) i_12_ / 8.0F, 24671);
					class14_sub10.method788((float) i_11_ / 8.0F, 24671);
					class14_sub10.method788((float) (i_12_ * 128), 24671);
					class14_sub10.method788((float) (is[i_12_ + i][i_11_ + i_10_]), 24671);
					class14_sub10.method788((float) (i_11_ * 128), 24671);
				}
			}
		}
		if (Class121.aBoolean2021) {
			ByteBuffer bytebuffer = ByteBuffer.wrap(class14_sub10.payload, 0, class14_sub10.position);
			aClass29_345 = new VertexBuffer();
			aClass29_345._setArrayData(bytebuffer);
		} else {
			aByteBuffer350 = ByteBuffer.allocateDirect(class14_sub10.position).order(ByteOrder.nativeOrder());
			aByteBuffer350.put(class14_sub10.payload, 0, class14_sub10.position);
			aByteBuffer350.flip();
		}
		Buffer class14_sub10_13_ = new Buffer(1536);
		for (int i_14_ = 0; i_14_ < 8; i_14_++) {
			for (int i_15_ = 0; i_15_ < 8; i_15_++) {
				if (Class121.aBoolean2046) {
					class14_sub10_13_.method803(i_15_ + (i_14_ + 1) * 9, 107);
					class14_sub10_13_.method803(i_15_ + i_14_ * 9, 77);
					class14_sub10_13_.method803(i_15_ + 1 + i_14_ * 9, 65);
					class14_sub10_13_.method803(i_15_ + (i_14_ + 1) * 9, 122);
					class14_sub10_13_.method803(i_15_ + 1 + i_14_ * 9, 101);
					class14_sub10_13_.method803(i_15_ + 1 + (i_14_ + 1) * 9, 106);
				} else {
					class14_sub10_13_.method825(-47, i_15_ + (i_14_ + 1) * 9);
					class14_sub10_13_.method825(-76, i_15_ + i_14_ * 9);
					class14_sub10_13_.method825(-69, i_15_ + 1 + i_14_ * 9);
					class14_sub10_13_.method825(-21, i_15_ + (i_14_ + 1) * 9);
					class14_sub10_13_.method825(-27, i_15_ + 1 + i_14_ * 9);
					class14_sub10_13_.method825(-32, i_15_ + 1 + (i_14_ + 1) * 9);
				}
			}
		}
		if (Class121.aBoolean2021) {
			ByteBuffer bytebuffer = ByteBuffer.wrap(class14_sub10_13_.payload, 0, class14_sub10_13_.position);
			aClass29_347 = new VertexBuffer();
			aClass29_347.setElementData(bytebuffer);
		} else {
			aByteBuffer343 = ByteBuffer.allocateDirect(class14_sub10_13_.position).order(ByteOrder.nativeOrder());
			aByteBuffer343.put(class14_sub10_13_.payload, 0, class14_sub10_13_.position);
			aByteBuffer343.flip();
		}
	}

	public void method228() {
		GL gl = Class121.aGL2030;
		Class121.method1632(anInt348);
		if (aClass29_345 != null) {
			aClass29_345.bindArray();
			gl.glInterleavedArrays(10791, 20, 0L);
			Class121.aBoolean2027 = false;
		} else {
			if (Class121.aBoolean2021)
				gl.glBindBufferARB(34962, 0);
			gl.glInterleavedArrays(10791, 20, aByteBuffer350);
			Class121.aBoolean2027 = false;
		}
		if (aClass29_347 != null) {
			aClass29_347.method1055();
			gl.glDrawElements(4, 384, 5125, 0L);
		} else {
			if (Class121.aBoolean2021)
				gl.glBindBufferARB(34963, 0);
			gl.glDrawElements(4, 384, 5125, aByteBuffer343);
		}
	}

	public Class13() {
		GL gl = Class121.aGL2030;
		int[] is = new int[1];
		gl.glGenTextures(1, is, 0);
		anInt348 = is[0];
		Class11.textureMemory += 16384;
		Class121.method1632(anInt348);
		gl.glTexParameteri(3553, 10241, 9729);
		gl.glTexParameteri(3553, 10240, 9729);
		gl.glTexParameteri(3553, 10242, 33071);
		gl.glTexParameteri(3553, 10243, 33071);
	}
}
