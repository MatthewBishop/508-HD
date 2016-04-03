/* Class14_Sub27 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

import javax.media.opengl.GL;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;

import rs.Class14_Sub29;
import rs.Class3;
import rs.tex.Class14_Sub8_Sub33;

public class Class14_Sub27 extends Linkable {
	public static ByteBuffer aByteBuffer3192;
	public static ByteBuffer aByteBuffer3200;
	public static Buffer aClass14_Sub10_3186;
	public static Buffer aClass14_Sub10_3189;
	public static void method923() {
		aClass14_Sub10_3186 = null;
		aClass14_Sub10_3189 = null;
		aByteBuffer3200 = null;
		aByteBuffer3192 = null;
	}

	public boolean aBoolean3201;
	public boolean aBoolean3209;
	public boolean[] aBooleanArray3194;
	public ByteBuffer aByteBuffer3206;
	public VertexBuffer aClass29_3182;
	public HashTable aClass55_3195;
	public float aFloat3211;
	public float[] aFloatArray3185;
	public float[] aFloatArray3188;
	public float[] aFloatArray3193;
	public float[] aFloatArray3198;
	public int anInt3180 = 0;
	public int anInt3181;
	public int anInt3187 = 0;
	public int anInt3190;
	public int anInt3202;
	public int anInt3204;
	public int anInt3208;
	public int anInt3210;
	public int[] anIntArray3183;
	public int[] anIntArray3191;
	public int[] anIntArray3196;
	public int[] anIntArray3197;
	public int[] anIntArray3199;
	public int[] anIntArray3205;
	public int[] anIntArray3207;
	public int[][] anIntArrayArray3184;

	public int[][] anIntArrayArray3203;

	public Class14_Sub27(int i, float f, boolean bool, boolean bool_15_, int i_16_) {
		anInt3181 = 0;
		anInt3208 = 0;
		anInt3202 = 0;
		anInt3210 = 0;
		anInt3204 = i;
		aFloat3211 = f;
		aBoolean3201 = bool;
		aBoolean3209 = bool_15_;
		anInt3190 = i_16_;
	}

	public int method920(int i, int i_0_, int i_1_, int[] is, int[] is_2_, boolean bool) {
		if (aBoolean3201) {
			anIntArrayArray3203[anInt3187] = is_2_;
			aBooleanArray3194[anInt3187] = bool;
			if (is_2_ != null)
				anInt3210 += is_2_.length;
			if (bool)
				anInt3210 += (is.length - 2) * 3;
			else
				anInt3208 += (is.length - 2) * 3;
		} else
			anInt3208 += (is.length - 2) * 3;
		anIntArray3196[anInt3187] = i;
		anIntArray3199[anInt3187] = i_0_;
		anIntArray3205[anInt3187] = i_1_;
		anIntArrayArray3184[anInt3187] = is;
		return anInt3187++;
	}

	public int method921(int i, int i_3_, int i_4_, float f, float f_5_, float f_6_, int i_7_, float f_8_) {
		long l = 0L;
		if ((i & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = (long) (i + (i_4_ << 16)) + ((long) i_7_ << 32);
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass55_3195.get(l);
			if (class14_sub1 != null) {
				if (i_3_ < anIntArray3183[class14_sub1.anInt2714])
					anIntArray3183[class14_sub1.anInt2714] = i_3_;
				return class14_sub1.anInt2714;
			}
		}
		anIntArray3197[anInt3202] = i;
		anIntArray3183[anInt3202] = i_3_;
		anIntArray3191[anInt3202] = i_4_;
		if (aBoolean3209)
			aFloatArray3188[anInt3202] = f_8_;
		aFloatArray3198[anInt3202] = f;
		aFloatArray3193[anInt3202] = f_5_;
		aFloatArray3185[anInt3202] = f_6_;
		anIntArray3207[anInt3202] = i_7_;
		if (l != 0L)
			aClass55_3195.put(l, new Class14_Sub1(anInt3202));
		return anInt3202++;
	}

	public void method922(Class14_Sub29[][][] class14_sub29s, float f, boolean bool) {
		if (aClass14_Sub10_3186 == null || aClass14_Sub10_3186.payload.length < anInt3208 * 4)
			aClass14_Sub10_3186 = new Buffer(anInt3208 * 4);
		else
			aClass14_Sub10_3186.position = 0;
		if (aClass14_Sub10_3189 == null || aClass14_Sub10_3189.payload.length < anInt3210 * 4)
			aClass14_Sub10_3189 = new Buffer(anInt3210 * 4);
		else
			aClass14_Sub10_3189.position = 0;
		if (RT4GL.aBoolean2046) {
			for (int i = 0; i < anInt3187; i++) {
				Class14_Sub29 class14_sub29 = (class14_sub29s[anIntArray3196[i]][anIntArray3199[i]][anIntArray3205[i]]);
				if (class14_sub29 != null && class14_sub29.aBoolean3235) {
					int[] is = anIntArrayArray3184[i];
					Buffer class14_sub10;
					if (aBoolean3201) {
						int[] is_9_ = anIntArrayArray3203[i];
						if (is_9_ != null) {
							for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++)
								aClass14_Sub10_3189.method803(is_9_[i_10_], 110);
						}
						class14_sub10 = (aBooleanArray3194[i] ? aClass14_Sub10_3189 : aClass14_Sub10_3186);
					} else
						class14_sub10 = aClass14_Sub10_3186;
					for (int i_11_ = 1; i_11_ < is.length - 1; i_11_++) {
						class14_sub10.method803(is[0], 121);
						class14_sub10.method803(is[i_11_], 103);
						class14_sub10.method803(is[i_11_ + 1], 111);
					}
				}
			}
		} else {
			for (int i = 0; i < anInt3187; i++) {
				Class14_Sub29 class14_sub29 = (class14_sub29s[anIntArray3196[i]][anIntArray3199[i]][anIntArray3205[i]]);
				if (class14_sub29 != null && class14_sub29.aBoolean3235) {
					int[] is = anIntArrayArray3184[i];
					Buffer class14_sub10;
					if (aBoolean3201) {
						int[] is_12_ = anIntArrayArray3203[i];
						if (is_12_ != null) {
							for (int i_13_ = 0; i_13_ < is_12_.length; i_13_++)
								aClass14_Sub10_3189.method825(-73, is_12_[i_13_]);
						}
						class14_sub10 = (aBooleanArray3194[i] ? aClass14_Sub10_3189 : aClass14_Sub10_3186);
					} else
						class14_sub10 = aClass14_Sub10_3186;
					for (int i_14_ = 1; i_14_ < is.length - 1; i_14_++) {
						class14_sub10.method825(-117, is[0]);
						class14_sub10.method825(-94, is[i_14_]);
						class14_sub10.method825(-85, is[i_14_ + 1]);
					}
				}
			}
		}
		if (aClass14_Sub10_3186.position != 0 || aClass14_Sub10_3189.position != 0) {
			GL gl = RT4GL.gl;
			if (anInt3204 == -1 || bool) {
				RT4GL.method1632(-1);
				RT4.method1778(0, 0);
			} else
				Class3.anInterface3_117.method16(anInt3204, (byte) 97);
			int i = aBoolean3209 ? 40 : 36;
			if (aClass29_3182 != null) {
				aClass29_3182.bindArray();
				gl.glVertexPointer(3, 5126, i, 0L);
				gl.glColorPointer(4, 5121, i, 12L);
				if (RT4.useLighting)
					gl.glNormalPointer(5126, i, 16L);
				gl.glTexCoordPointer(2, 5126, i, 28L);
				if (aBoolean3209) {
					gl.glClientActiveTexture(GLEffect3.getActiveTexture());
					gl.glTexCoordPointer(1, 5126, i, 36L);
					gl.glClientActiveTexture(33984);
				}
			} else {
				if (RT4GL.aBoolean2021)
					gl.glBindBufferARB(34962, 0);
				aByteBuffer3206.position(0);
				gl.glVertexPointer(3, 5126, i, aByteBuffer3206);
				aByteBuffer3206.position(12);
				gl.glColorPointer(4, 5121, i, aByteBuffer3206);
				if (RT4.useLighting) {
					aByteBuffer3206.position(16);
					gl.glNormalPointer(5126, i, aByteBuffer3206);
				}
				aByteBuffer3206.position(28);
				gl.glTexCoordPointer(2, 5126, i, aByteBuffer3206);
				if (aBoolean3209) {
					gl.glClientActiveTexture(GLEffect3.getActiveTexture());
					aByteBuffer3206.position(36);
					gl.glTexCoordPointer(1, 5126, i, aByteBuffer3206);
					gl.glClientActiveTexture(33984);
				}
			}
			if (RT4GL.aBoolean2021)
				gl.glBindBufferARB(34963, 0);
			if (aClass14_Sub10_3186.position != 0) {
				if (aByteBuffer3200 == null || (aByteBuffer3200.capacity() < aClass14_Sub10_3186.position))
					aByteBuffer3200 = ByteBuffer.allocateDirect(aClass14_Sub10_3186.position)
							.order(ByteOrder.nativeOrder());
				else
					aByteBuffer3200.clear();
				aByteBuffer3200.put(aClass14_Sub10_3186.payload, 0, aClass14_Sub10_3186.position);
				aByteBuffer3200.flip();
				RT4GL.method1640(f);
				gl.glDrawElements(4, aClass14_Sub10_3186.position / 4, 5125, aByteBuffer3200);
			}
			if (aClass14_Sub10_3189.position != 0) {
				if (aByteBuffer3192 == null || (aByteBuffer3192.capacity() < aClass14_Sub10_3189.position))
					aByteBuffer3192 = ByteBuffer.allocateDirect(aClass14_Sub10_3189.position)
							.order(ByteOrder.nativeOrder());
				else
					aByteBuffer3192.clear();
				aByteBuffer3192.put(aClass14_Sub10_3189.payload, 0, aClass14_Sub10_3189.position);
				aByteBuffer3192.flip();
				RT4GL.method1640(f - 100.0F);
				RT4GL.method1646();
				gl.glDrawElements(4, aClass14_Sub10_3189.position / 4, 5125, aByteBuffer3192);
				RT4GL.method1625();
			}
		}
	}

	public void method924() {
		anIntArray3197 = new int[anInt3181];
		anIntArray3183 = new int[anInt3181];
		anIntArray3191 = new int[anInt3181];
		if (aBoolean3209)
			aFloatArray3188 = new float[anInt3181];
		anIntArray3207 = new int[anInt3181];
		aFloatArray3198 = new float[anInt3181];
		aFloatArray3193 = new float[anInt3181];
		aFloatArray3185 = new float[anInt3181];
		anIntArray3199 = new int[anInt3180];
		anIntArray3205 = new int[anInt3180];
		anIntArray3196 = new int[anInt3180];
		anIntArrayArray3184 = new int[anInt3180][];
		aClass55_3195 = new HashTable(Class14_Sub8_Sub33.method653(anInt3181));
		if (aBoolean3201) {
			anIntArrayArray3203 = new int[anInt3180][];
			aBooleanArray3194 = new boolean[anInt3180];
		}
	}

	public void method925() {
		Buffer class14_sub10 = new Buffer((aBoolean3209 ? 40 : 36) * anInt3202);
		for (int i = 0; i < anInt3202; i++) {
			if (RT4GL.aBoolean2046) {
				class14_sub10.method834((float) anIntArray3197[i]);
				class14_sub10.method834((float) anIntArray3183[i]);
				class14_sub10.method834((float) anIntArray3191[i]);
				class14_sub10.method803(anIntArray3207[i], 103);
				class14_sub10.method834(aFloatArray3198[i]);
				class14_sub10.method834(aFloatArray3193[i]);
				class14_sub10.method834(aFloatArray3185[i]);
				class14_sub10.method834((float) anIntArray3197[i] / aFloat3211);
				class14_sub10.method834((float) anIntArray3191[i] / aFloat3211);
				if (aBoolean3209)
					class14_sub10.method834(aFloatArray3188[i]);
			} else {
				class14_sub10.method788((float) anIntArray3197[i], 24671);
				class14_sub10.method788((float) anIntArray3183[i], 24671);
				class14_sub10.method788((float) anIntArray3191[i], 24671);
				class14_sub10.method803(anIntArray3207[i], 119);
				class14_sub10.method788(aFloatArray3198[i], 24671);
				class14_sub10.method788(aFloatArray3193[i], 24671);
				class14_sub10.method788(aFloatArray3185[i], 24671);
				class14_sub10.method788((float) anIntArray3197[i] / aFloat3211, 24671);
				class14_sub10.method788((float) anIntArray3191[i] / aFloat3211, 24671);
				if (aBoolean3209)
					class14_sub10.method788(aFloatArray3188[i], 24671);
			}
		}
		if (RT4GL.aBoolean2021) {
			ByteBuffer bytebuffer = ByteBuffer.wrap(class14_sub10.payload, 0, class14_sub10.position);
			aClass29_3182 = new VertexBuffer();
			aClass29_3182._setArrayData(bytebuffer);
		} else {
			aByteBuffer3206 = ByteBuffer.allocateDirect(class14_sub10.position).order(ByteOrder.nativeOrder());
			aByteBuffer3206.put(class14_sub10.payload, 0, class14_sub10.position);
			aByteBuffer3206.flip();
		}
		anIntArray3197 = null;
		anIntArray3183 = null;
		anIntArray3191 = null;
		anIntArray3207 = null;
		aFloatArray3198 = null;
		aFloatArray3193 = null;
		aFloatArray3185 = null;
		aClass55_3195 = null;
		aFloatArray3188 = null;
	}
}
