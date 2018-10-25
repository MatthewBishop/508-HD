/* Class130 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.lights;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;

import com.jagex.io.Buffer;
import com.jagex.link.HashTable;
import com.jagex.rt4.IntegerNode;
import com.jagex.rt4.RT4GL;
import com.jagex.rt4.VertexBuffer;

import rs.JunkTex;

public class LightRenderer {
	public byte[] vertexGreen;
	public byte[] vertexRed;
	public byte[] vertexBlue;
	public ByteBuffer elementByteBuffer;
	public ByteBuffer arrayByteBuffer;
	public VertexBuffer arrayVBO;
	public VertexBuffer elementVBO;
	public HashTable vertexList;
	public int vertexCount;
	public int maxTriangles;
	public int maxVertices;
	public int triangleCount;
	public int[] vertexX;
	public int[] vertexY;
	public int[] triIndex;
	public int[] vertexZ;

	public void generateData() {
		Buffer elementStream = new Buffer(triangleCount * 4);
		Buffer arrayStream = new Buffer(vertexCount * 16);
		if (RT4GL.byte_order_bigendian) {
			for (int i = 0; i < vertexCount; i++) {
				arrayStream.writeByte(vertexRed[i]);
				arrayStream.writeByte(vertexGreen[i]);
				arrayStream.writeByte(vertexBlue[i]);
				arrayStream.writeByte(255);
				arrayStream.writeFloat((float) vertexX[i]);
				arrayStream.writeFloat((float) vertexY[i]);
				arrayStream.writeFloat((float) vertexZ[i]);
			}
			for (int i = 0; i < triangleCount; i++)
				elementStream.writeInt(triIndex[i], 107);
		} else {
			for (int i = 0; i < vertexCount; i++) {
				arrayStream.writeByte(vertexRed[i]);
				arrayStream.writeByte(vertexGreen[i]);
				arrayStream.writeByte(vertexBlue[i]);
				arrayStream.writeByte(255);
				arrayStream.writeFloatLE((float) vertexX[i], 24671);
				arrayStream.writeFloatLE((float) vertexY[i], 24671);
				arrayStream.writeFloatLE((float) vertexZ[i], 24671);
			}
			for (int i = 0; i < triangleCount; i++)
				elementStream.writeIntLE(-99, triIndex[i]);
		}
		if (RT4GL.has_vbo) {
			arrayVBO = new VertexBuffer();
			ByteBuffer bytebuffer = ByteBuffer.wrap(arrayStream.payload);
			arrayVBO._setArrayData(bytebuffer);
			elementVBO = new VertexBuffer();
			bytebuffer = ByteBuffer.wrap(elementStream.payload);
			elementVBO.setElementData(bytebuffer);
		} else {
			arrayByteBuffer = ByteBuffer.allocateDirect(arrayStream.position);
			arrayByteBuffer.put(arrayStream.payload);
			arrayByteBuffer.flip();
			elementByteBuffer = ByteBuffer.allocateDirect(elementStream.position);
			elementByteBuffer.put(elementStream.payload);
			elementByteBuffer.flip();
		}
		vertexX = null;
		vertexY = null;
		vertexZ = null;
		vertexRed = null;
		vertexGreen = null;
		vertexBlue = null;
		triIndex = null;
		vertexList = null;
	}

	public void render() {
		GL gl = RT4GL.gl;
		if (RT4GL.has_vbo) {
			arrayVBO.bindArray();
			gl.glInterleavedArrays(10787, 16, 0L);
			RT4GL.normal_array_enabled = false;
			elementVBO.bindElement();
			gl.glDrawElements(4, triangleCount, 5125, 0L);
		} else {
			if (RT4GL.has_vbo) {
				gl.glBindBufferARB(34962, 0);
				gl.glBindBufferARB(34963, 0);
			}
			gl.glInterleavedArrays(10787, 16, arrayByteBuffer);
			RT4GL.normal_array_enabled = false;
			gl.glDrawElements(4, triangleCount, 5125, elementByteBuffer);
		}
	}

	public int addVertex(Light light, int x, int y, int z, float v2_x, float v2_y, float v2_z) {
		long l = 0L;
		if ((x & 0x7f) == 0 || (z & 0x7f) == 0) {
			l = (long) (x + (z << 16));
			IntegerNode integerNode = (IntegerNode) vertexList.get(l);
			if (integerNode != null)
				return integerNode.value;
		}
		int rgb = light.diffuseColour;
		float direction_x = (float) (light.x - x);
		float direction_y = (float) (light.y - y);
		float direction_z = (float) (light.z - z);
		float distance_from_center = (float) Math.sqrt((double) (direction_x * direction_x + direction_y * direction_y + direction_z * direction_z));
		float oneDividedByDistance = 1.0F / distance_from_center;
		direction_x *= oneDividedByDistance;
		direction_y *= oneDividedByDistance;
		direction_z *= oneDividedByDistance;
		float unit_distance = distance_from_center / (float) ((light.radius << 7) + 64);
		float one_minus_unit_distance_squared = 1.0F - unit_distance * unit_distance;
		if (one_minus_unit_distance_squared < 0.0F)
			one_minus_unit_distance_squared = 0.0F;
		float dot_of_distance_and_v2 = direction_x * v2_x + direction_y * v2_y + direction_z * v2_z;
		if (dot_of_distance_and_v2 < 0.0F)
			dot_of_distance_and_v2 = 0.0F;
		float colour_modifier = dot_of_distance_and_v2 * one_minus_unit_distance_squared * 2.0F;
		if (colour_modifier > 1.0F)
			colour_modifier = 1.0F;
		int r = (int) (colour_modifier * (float) (rgb >> 16 & 0xff));
		if (r > 255)
			r = 255;
		int g = (int) (colour_modifier * (float) (rgb >> 8 & 0xff));
		if (g > 255)
			g = 255;
		int b = (int) (colour_modifier * (float) (rgb & 0xff));
		if (b > 255)
			b = 255;
		vertexRed[vertexCount] = (byte) r;
		vertexGreen[vertexCount] = (byte) g;
		vertexBlue[vertexCount] = (byte) b;
		vertexX[vertexCount] = x;
		vertexY[vertexCount] = y;
		vertexZ[vertexCount] = z;
		vertexList.put(l, new IntegerNode(vertexCount));
		return vertexCount++;
	}

	public void addTriangle(int[] is) {
		for (int i = 1; i < is.length - 1; i++) {
			triIndex[triangleCount++] = is[0];
			triIndex[triangleCount++] = is[i];
			triIndex[triangleCount++] = is[i + 1];
		}
	}

	public void method1771() {
		triIndex = new int[maxTriangles];
		vertexX = new int[maxVertices];
		vertexY = new int[maxVertices];
		vertexZ = new int[maxVertices];
		vertexRed = new byte[maxVertices];
		vertexGreen = new byte[maxVertices];
		vertexBlue = new byte[maxVertices];
		vertexList = new HashTable(JunkTex.method653(maxVertices));
	}
}
