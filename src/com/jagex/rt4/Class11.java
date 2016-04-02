/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import javax.media.opengl.GL;

import com.jagex.link.Deque;
import com.jagex.util.TimeUtil;

public class Class11 {
	public static int anInt263;
	public static int arbBufferMemory = 0;
	public static long aLong265;
	public static int textureMemory;
	public static int anInt267;
	public static Deque aClass2_268;
	public static Deque aClass2_269;
	public static Deque aClass2_270;
	public static Deque aClass2_271;
	public static int[] ids;

	static {
		anInt263 = 0;
		textureMemory = 0;
		aLong265 = 0L;
		anInt267 = 0;
		aClass2_268 = new Deque();
		aClass2_269 = new Deque();
		aClass2_270 = new Deque();
		aClass2_271 = new Deque();
		ids = new int[1000];
	}

	public static synchronized void method202(int i, int i_0_, int i_1_) {
		if (i_1_ == anInt267) {
			Class14_Sub1 class14_sub1 = new Class14_Sub1(i_0_);
			class14_sub1.key = (long) i;
			aClass2_270.pushBack(class14_sub1);
		}
	}

	public static synchronized void method203() {
		anInt267++;
		aClass2_268.clear();
		aClass2_269.clear();
		aClass2_270.clear();
		aClass2_271.clear();
		arbBufferMemory = 0;
		anInt263 = 0;
		textureMemory = 0;
	}

	public static synchronized void requestARBBufferDeletion(int i, int i_2_, int i_3_) {
		if (i_3_ == anInt267) {
			Class14_Sub1 class14_sub1 = new Class14_Sub1(i_2_);
			class14_sub1.key = (long) i;
			aClass2_268.pushBack(class14_sub1);
		}
	}

	public static synchronized void method205() {
		GL gl = Class121.aGL2030;
		int i = 0;
		for (;;) {
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass2_268.popFront();
			if (class14_sub1 == null)
				break;
			ids[i++] = (int) class14_sub1.key;
			arbBufferMemory -= class14_sub1.anInt2714;
			if (i == 1000) {
				gl.glDeleteBuffersARB(i, ids, 0);
				i = 0;
			}
		}
		if (i > 0) {
			gl.glDeleteBuffersARB(i, ids, 0);
			i = 0;
		}
		for (;;) {
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass2_269.popFront();
			if (class14_sub1 == null)
				break;
			ids[i++] = (int) class14_sub1.key;
			anInt263 -= class14_sub1.anInt2714;
			if (i == 1000) {
				gl.glDeleteTextures(i, ids, 0);
				i = 0;
			}
		}
		for (;;) {
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass2_270.popFront();
			if (class14_sub1 == null)
				break;
			ids[i++] = (int) class14_sub1.key;
			textureMemory -= class14_sub1.anInt2714;
			if (i == 1000) {
				gl.glDeleteTextures(i, ids, 0);
				i = 0;
			}
		}
		if (i > 0)
			gl.glDeleteTextures(i, ids, 0);
		for (;;) {
			Class14_Sub1 class14_sub1 = (Class14_Sub1) aClass2_271.popFront();
			if (class14_sub1 == null)
				break;
			int i_4_ = (int) class14_sub1.key;
			gl.glDeleteLists(i_4_, 1);
		}
		if (arbBufferMemory + anInt263 + textureMemory > 100663296 && TimeUtil.getTime() > aLong265 + 60000L) {
			System.gc();
			aLong265 = TimeUtil.getTime();
		}
	}

	public static synchronized void method206(int i, int i_5_) {
		if (i_5_ == anInt267) {
			Class14_Sub1 class14_sub1 = new Class14_Sub1();
			class14_sub1.key = (long) i;
			aClass2_271.pushBack(class14_sub1);
		}
	}

	public static void method207() {
		aClass2_268 = null;
		aClass2_269 = null;
		aClass2_270 = null;
		aClass2_271 = null;
		ids = null;
	}

	public static synchronized void method208(int i, int i_6_, int i_7_) {
		if (i_7_ == anInt267) {
			Class14_Sub1 class14_sub1 = new Class14_Sub1(i_6_);
			class14_sub1.key = (long) i;
			aClass2_269.pushBack(class14_sub1);
		}
	}
}
