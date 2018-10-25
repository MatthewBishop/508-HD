/* Class29 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

public class VertexBuffer {
	public int anInt517;
	public int bufferSize = 0;
	public boolean isStream;
	public int bufferID = -1;

	public void _setArrayData(ByteBuffer bytebuffer) {
		GL gl = RT4GL.gl;
		gl.glBindBufferARB(34962, bufferID);
		gl.glBufferDataARB(34962, bytebuffer.limit(), bytebuffer, isStream ? 35040 : 35044);
		CardMemManager.arbBufferMemory += bytebuffer.limit() - bufferSize;
		bufferSize = bytebuffer.limit();
	}

	public void setArrayData(ByteBuffer bytebuffer) {
		if (bytebuffer.limit() <= bufferSize) {
			GL gl = RT4GL.gl;
			gl.glBindBufferARB(34962, bufferID);
			gl.glBufferSubDataARB(34962, 0, bytebuffer.limit(), bytebuffer);
		} else
			_setArrayData(bytebuffer);
	}

	public void bindArray() {
		GL gl = RT4GL.gl;
		gl.glBindBufferARB(34962, bufferID);
	}

	public VertexBuffer() {
		this(false);
	}

	public void finalize() throws Throwable {
		if (bufferID != -1) {
			CardMemManager.requestARBBufferDeletion(bufferID, bufferSize, anInt517);
			bufferID = -1;
			bufferSize = 0;
		}
		super.finalize();
	}

	public void setElementData(ByteBuffer bytebuffer) {
		GL gl = RT4GL.gl;
		gl.glBindBufferARB(34963, bufferID);
		gl.glBufferDataARB(34963, bytebuffer.limit(), bytebuffer, isStream ? 35040 : 35044);
		CardMemManager.arbBufferMemory += bytebuffer.limit() - bufferSize;
		bufferSize = bytebuffer.limit();
	}

	public void bindElement() {
		GL gl = RT4GL.gl;
		gl.glBindBufferARB(34963, bufferID);
	}

	public VertexBuffer(boolean bool) {
		GL gl = RT4GL.gl;
		int[] is = new int[1];
		gl.glGenBuffersARB(1, is, 0);
		isStream = bool;
		bufferID = is[0];
		anInt517 = CardMemManager.memoryManagerId;
	}
}
