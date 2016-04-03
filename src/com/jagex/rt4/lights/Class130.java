/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.lights;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.Class14_Sub1;
import com.jagex.rt4.VertexBuffer;

import rs.tex.Class14_Sub8_Sub33;

public class Class130 {
	public byte[] aByteArray2141;
	public byte[] aByteArray2145;
	public byte[] aByteArray2146;
	public ByteBuffer aByteBuffer2139;
	public ByteBuffer aByteBuffer2147;
	public VertexBuffer aClass29_2137;
	public VertexBuffer aClass29_2142;
	public HashTable aClass55_2138;
	public int anInt2140;
	public int anInt2144;
	public int anInt2151;
	public int anInt2152;
	public int[] anIntArray2143;
	public int[] anIntArray2148;
	public int[] anIntArray2149;
	public int[] anIntArray2150;

	public void method1767() {
		Buffer class14_sub10 = new Buffer(anInt2152 * 4);
		Buffer class14_sub10_0_ = new Buffer(anInt2140 * 16);
		if (RT4GL.aBoolean2046) {
			for (int i = 0; i < anInt2140; i++) {
				class14_sub10_0_.method809(aByteArray2145[i]);
				class14_sub10_0_.method809(aByteArray2141[i]);
				class14_sub10_0_.method809(aByteArray2146[i]);
				class14_sub10_0_.method809(255);
				class14_sub10_0_.method834((float) anIntArray2143[i]);
				class14_sub10_0_.method834((float) anIntArray2148[i]);
				class14_sub10_0_.method834((float) anIntArray2150[i]);
			}
			for (int i = 0; i < anInt2152; i++)
				class14_sub10.method803(anIntArray2149[i], 107);
		} else {
			for (int i = 0; i < anInt2140; i++) {
				class14_sub10_0_.method809(aByteArray2145[i]);
				class14_sub10_0_.method809(aByteArray2141[i]);
				class14_sub10_0_.method809(aByteArray2146[i]);
				class14_sub10_0_.method809(255);
				class14_sub10_0_.method788((float) anIntArray2143[i], 24671);
				class14_sub10_0_.method788((float) anIntArray2148[i], 24671);
				class14_sub10_0_.method788((float) anIntArray2150[i], 24671);
			}
			for (int i = 0; i < anInt2152; i++)
				class14_sub10.method825(-99, anIntArray2149[i]);
		}
		if (RT4GL.aBoolean2021) {
			aClass29_2137 = new VertexBuffer();
			ByteBuffer bytebuffer = ByteBuffer.wrap(class14_sub10_0_.payload);
			aClass29_2137._setArrayData(bytebuffer);
			aClass29_2142 = new VertexBuffer();
			bytebuffer = ByteBuffer.wrap(class14_sub10.payload);
			aClass29_2142.setElementData(bytebuffer);
		} else {
			aByteBuffer2147 = ByteBuffer.allocateDirect(class14_sub10_0_.position);
			aByteBuffer2147.put(class14_sub10_0_.payload);
			aByteBuffer2147.flip();
			aByteBuffer2139 = ByteBuffer.allocateDirect(class14_sub10.position);
			aByteBuffer2139.put(class14_sub10.payload);
			aByteBuffer2139.flip();
		}
		anIntArray2143 = null;
		anIntArray2148 = null;
		anIntArray2150 = null;
		aByteArray2145 = null;
		aByteArray2141 = null;
		aByteArray2146 = null;
		anIntArray2149 = null;
		aClass55_2138 = null;
	}

	public void method1768() {
		GL gl = RT4GL.gl;
		if (RT4GL.aBoolean2021) {
			aClass29_2137.bindArray();
			gl.glInterleavedArrays(10787, 16, 0L);
			RT4GL.aBoolean2027 = false;
			aClass29_2142.method1055();
			gl.glDrawElements(4, anInt2152, 5125, 0L);
		} else {
			if (RT4GL.aBoolean2021) {
				gl.glBindBufferARB(34962, 0);
				gl.glBindBufferARB(34963, 0);
			}
			gl.glInterleavedArrays(10787, 16, aByteBuffer2147);
			RT4GL.aBoolean2027 = false;
			gl.glDrawElements(4, anInt2152, 5125, aByteBuffer2139);
		}
	}

	public int method1769(Light light, int i, int i_1_, int i_2_, float f, float f_3_, float f_4_) {
		long l = 0L;
		if ((i & 0x7f) == 0 || (i_2_ & 0x7f) == 0) {
			l = (long) (i + (i_2_ << 16));
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass55_2138.get(l);
			if (class14_sub1 != null)
				return class14_sub1.anInt2714;
		}
		int i_5_ = light.anInt1122;
		float f_6_ = (float) (light.param1 - i);
		float f_7_ = (float) (light.param2 - i_1_);
		float f_8_ = (float) (light.param3 - i_2_);
		float f_9_ = (float) Math.sqrt((double) (f_6_ * f_6_ + f_7_ * f_7_ + f_8_ * f_8_));
		float f_10_ = 1.0F / f_9_;
		f_6_ *= f_10_;
		f_7_ *= f_10_;
		f_8_ *= f_10_;
		float f_11_ = f_9_ / (float) ((light.anInt1120 << 7) + 64);
		float f_12_ = 1.0F - f_11_ * f_11_;
		if (f_12_ < 0.0F)
			f_12_ = 0.0F;
		float f_13_ = f_6_ * f + f_7_ * f_3_ + f_8_ * f_4_;
		if (f_13_ < 0.0F)
			f_13_ = 0.0F;
		float f_14_ = f_13_ * f_12_ * 2.0F;
		if (f_14_ > 1.0F)
			f_14_ = 1.0F;
		int i_15_ = (int) (f_14_ * (float) (i_5_ >> 16 & 0xff));
		if (i_15_ > 255)
			i_15_ = 255;
		int i_16_ = (int) (f_14_ * (float) (i_5_ >> 8 & 0xff));
		if (i_16_ > 255)
			i_16_ = 255;
		int i_17_ = (int) (f_14_ * (float) (i_5_ & 0xff));
		if (i_17_ > 255)
			i_17_ = 255;
		aByteArray2145[anInt2140] = (byte) i_15_;
		aByteArray2141[anInt2140] = (byte) i_16_;
		aByteArray2146[anInt2140] = (byte) i_17_;
		anIntArray2143[anInt2140] = i;
		anIntArray2148[anInt2140] = i_1_;
		anIntArray2150[anInt2140] = i_2_;
		aClass55_2138.put(l, new Class14_Sub1(anInt2140));
		return anInt2140++;
	}

	public void method1770(int[] is) {
		for (int i = 1; i < is.length - 1; i++) {
			anIntArray2149[anInt2152++] = is[0];
			anIntArray2149[anInt2152++] = is[i];
			anIntArray2149[anInt2152++] = is[i + 1];
		}
	}

	public void method1771() {
		anIntArray2149 = new int[anInt2144];
		anIntArray2143 = new int[anInt2151];
		anIntArray2148 = new int[anInt2151];
		anIntArray2150 = new int[anInt2151];
		aByteArray2145 = new byte[anInt2151];
		aByteArray2141 = new byte[anInt2151];
		aByteArray2146 = new byte[anInt2151];
		aClass55_2138 = new HashTable(Class14_Sub8_Sub33.method653(anInt2151));
	}
}
