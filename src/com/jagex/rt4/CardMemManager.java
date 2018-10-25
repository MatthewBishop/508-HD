/* Class11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import javax.media.opengl.GL;

import com.jagex.link.Deque;
import com.jagex.util.TimeUtil;

public class CardMemManager {
	public static int memory2d;
	public static int arbBufferMemory = 0;
	public static int textureMemory;
	
	public static int memoryManagerId;
	
	private static long aLong265;
	private static Deque arbBuffersToDelete;
	private static Deque texturesToDelete;
	private static Deque texturesToDelete2;
	private static Deque listsToDelete;
	private static int[] glIdBuffer;

	static {
		memory2d = 0;
		textureMemory = 0;
		aLong265 = 0L;
		memoryManagerId = 0;
		arbBuffersToDelete = new Deque();
		texturesToDelete = new Deque();
		texturesToDelete2 = new Deque();
		listsToDelete = new Deque();
		glIdBuffer = new int[1000];
	}

	public static synchronized void method202(int i, int i_0_, int i_1_) {
		if (i_1_ == memoryManagerId) {
			IntegerNode class14_sub1 = new IntegerNode(i_0_);
			class14_sub1.key = (long) i;
			texturesToDelete2.pushBack(class14_sub1);
		}
	}

	public static synchronized void method206(int i, int i_5_) {
		if (i_5_ == memoryManagerId) {
			IntegerNode class14_sub1 = new IntegerNode();
			class14_sub1.key = (long) i;
			listsToDelete.pushBack(class14_sub1);
		}
	}

	public static synchronized void method208(int i, int i_6_, int i_7_) {
		if (i_7_ == memoryManagerId) {
			IntegerNode class14_sub1 = new IntegerNode(i_6_);
			class14_sub1.key = (long) i;
			texturesToDelete.pushBack(class14_sub1);
		}
	}

	public static synchronized void requestARBBufferDeletion(int i, int i_2_, int i_3_) {
		if (i_3_ == memoryManagerId) {
			IntegerNode class14_sub1 = new IntegerNode(i_2_);
			class14_sub1.key = (long) i;
			arbBuffersToDelete.pushBack(class14_sub1);
		}
	}
	
	public static synchronized void reset() {
		memoryManagerId++;
		arbBuffersToDelete.clear();
		texturesToDelete.clear();
		texturesToDelete2.clear();
		listsToDelete.clear();
		arbBufferMemory = 0;
		memory2d = 0;
		textureMemory = 0;
	}

	public static synchronized void process() {
		GL gl = RT4GL.gl;
		int i = 0;
		for (;;) {
			IntegerNode class14_sub1 = (IntegerNode) arbBuffersToDelete.popFront();
			if (class14_sub1 == null)
				break;
			glIdBuffer[i++] = (int) class14_sub1.key;
			arbBufferMemory -= class14_sub1.value;
			if (i == 1000) {
				gl.glDeleteBuffersARB(i, glIdBuffer, 0);
				i = 0;
			}
		}
		if (i > 0) {
			gl.glDeleteBuffersARB(i, glIdBuffer, 0);
			i = 0;
		}
		for (;;) {
			IntegerNode class14_sub1 = (IntegerNode) texturesToDelete.popFront();
			if (class14_sub1 == null)
				break;
			glIdBuffer[i++] = (int) class14_sub1.key;
			memory2d -= class14_sub1.value;
			if (i == 1000) {
				gl.glDeleteTextures(i, glIdBuffer, 0);
				i = 0;
			}
		}
		for (;;) {
			IntegerNode class14_sub1 = (IntegerNode) texturesToDelete2.popFront();
			if (class14_sub1 == null)
				break;
			glIdBuffer[i++] = (int) class14_sub1.key;
			textureMemory -= class14_sub1.value;
			if (i == 1000) {
				gl.glDeleteTextures(i, glIdBuffer, 0);
				i = 0;
			}
		}
		if (i > 0)
			gl.glDeleteTextures(i, glIdBuffer, 0);
		for (;;) {
			IntegerNode class14_sub1 = (IntegerNode) listsToDelete.popFront();
			if (class14_sub1 == null)
				break;
			int i_4_ = (int) class14_sub1.key;
			gl.glDeleteLists(i_4_, 1);
		}
		if (arbBufferMemory + memory2d + textureMemory > 100663296 && TimeUtil.getTime() > aLong265 + 60000L) {
			System.gc();
			aLong265 = TimeUtil.getTime();
		}
	}
	
	public static void kill() {
		arbBuffersToDelete = null;
		texturesToDelete = null;
		texturesToDelete2 = null;
		listsToDelete = null;
		glIdBuffer = null;
	}
}
