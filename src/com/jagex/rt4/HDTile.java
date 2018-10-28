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
import com.jagex.rt4.shader.WaterShader;
import com.jagex.sound.wip.DuplicateMethods;

import rs.Class14_Sub29;
import rs.SDRaster;

/*
 * Class14_Sub29 = GroundTile
 */
public class HDTile extends Linkable {
	public static ByteBuffer edgeElementBuffer;
	public static ByteBuffer elementBuffer;
	public static Buffer elementStream;
	public static Buffer edgeElementStream;
	public static void method923() {
		elementStream = null;
		edgeElementStream = null;
		elementBuffer = null;
		edgeElementBuffer = null;
	}

	public boolean hasEdges;
	public boolean useWTexcoord;
	public boolean[] writeTriangleToEdgeStream;
	public ByteBuffer vertexDataBuffer;
	public VertexBuffer vertexVBO;
	public HashTable vertexIDBuffer;
	public float textureSize;
	public float[] normalZ;
	public float[] texCoordW;
	public float[] normalY;
	public float[] normalX;
	public int maxTriangles = 0;
	public int maxVertices;
	public int triangleCount = 0;
	public int renderSettings;
	public int vertexCount;
	public int texture;
	public int indexCount;
	public int edgeIndexCount;
	public int[] vertexY;
	public int[] vertexZ;
	public int[] triangleTileHL;
	public int[] vertexX;
	public int[] triangleTileX;
	public int[] triangleTileZ;
	public int[] vertexColour;
	public int[][] triangleIndices;

	public int[][] edgeTriangleIndices;

	public HDTile(int _texture, float texCoordDivider, boolean _hasEdges, boolean _useWTexCoord, int i_16_) {
		maxVertices = 0;
		indexCount = 0;
		vertexCount = 0;
		edgeIndexCount = 0;
		texture = _texture;
		textureSize = texCoordDivider;
		hasEdges = _hasEdges;
		useWTexcoord = _useWTexCoord;
		renderSettings = i_16_;
	}

	public int addTriangle(int heightLevel, int tileX, int tileZ, int[] triIndices, int[] edgeIndices, boolean writeTriToEdgeStream) {
		if (hasEdges) {
			edgeTriangleIndices[triangleCount] = edgeIndices;
			writeTriangleToEdgeStream[triangleCount] = writeTriToEdgeStream;
			if (edgeIndices != null)
				edgeIndexCount += edgeIndices.length;
			if (writeTriToEdgeStream)
				edgeIndexCount += (triIndices.length - 2) * 3;
			else
				indexCount += (triIndices.length - 2) * 3;
		} else
			indexCount += (triIndices.length - 2) * 3;
		triangleTileHL[triangleCount] = heightLevel;
		triangleTileX[triangleCount] = tileX;
		triangleTileZ[triangleCount] = tileZ;
		triangleIndices[triangleCount] = triIndices;
		return triangleCount++;
	}

	public int addVertex(int v_x, int v_y, int v_z, float n_x, float n_y, float n_z, int color, float t_w) {
		long l = 0L;
		if ((v_x & 0x7f) == 0 || (v_z & 0x7f) == 0) {
			l = (long) (v_x + (v_z << 16)) + ((long) color << 32);
			IntegerNode integerNode = (IntegerNode) vertexIDBuffer.get(l);
			if (integerNode != null) {
				if (v_y < vertexY[integerNode.value])
					vertexY[integerNode.value] = v_y;
				return integerNode.value;
			}
		}
		vertexX[vertexCount] = v_x;
		vertexY[vertexCount] = v_y;
		vertexZ[vertexCount] = v_z;
		if (useWTexcoord)
			texCoordW[vertexCount] = t_w;
		normalX[vertexCount] = n_x;
		normalY[vertexCount] = n_y;
		normalZ[vertexCount] = n_z;
		vertexColour[vertexCount] = color;
		if (l != 0L)
			vertexIDBuffer.put(l, new IntegerNode(vertexCount));
		return vertexCount++;
	}

	public void render(Class14_Sub29[][][] class14_sub29s, float heightOffset, boolean noTextures) {
		if (elementStream == null || elementStream.payload.length < indexCount * 4)
			elementStream = new Buffer(indexCount * 4);
		else
			elementStream.position = 0;
		if (edgeElementStream == null || edgeElementStream.payload.length < edgeIndexCount * 4)
			edgeElementStream = new Buffer(edgeIndexCount * 4);
		else
			edgeElementStream.position = 0;
		if (RT4GL.byte_order_bigendian) {
			for (int i = 0; i < triangleCount; i++) {
				Class14_Sub29 class14_sub29 = (class14_sub29s[triangleTileHL[i]][triangleTileX[i]][triangleTileZ[i]]);
				if (class14_sub29 != null && class14_sub29.aBoolean3235) {
					int[] indices = triangleIndices[i];
					Buffer class14_sub10;
					if (hasEdges) {
						int[] is_9_ = edgeTriangleIndices[i];
						if (is_9_ != null) {
							for (int i_10_ = 0; i_10_ < is_9_.length; i_10_++)
								edgeElementStream.writeInt(is_9_[i_10_], 110);
						}
						class14_sub10 = (writeTriangleToEdgeStream[i] ? edgeElementStream : elementStream);
					} else
						class14_sub10 = elementStream;
					for (int i_11_ = 1; i_11_ < indices.length - 1; i_11_++) {
						class14_sub10.writeInt(indices[0], 121);
						class14_sub10.writeInt(indices[i_11_], 103);
						class14_sub10.writeInt(indices[i_11_ + 1], 111);
					}
				}
			}
		} else {
			for (int i = 0; i < triangleCount; i++) {
				Class14_Sub29 class14_sub29 = (class14_sub29s[triangleTileHL[i]][triangleTileX[i]][triangleTileZ[i]]);
				if (class14_sub29 != null && class14_sub29.aBoolean3235) {
					int[] indices = triangleIndices[i];
					Buffer class14_sub10;
					if (hasEdges) {
						int[] is_12_ = edgeTriangleIndices[i];
						if (is_12_ != null) {
							for (int i_13_ = 0; i_13_ < is_12_.length; i_13_++)
								edgeElementStream.writeIntLE(is_12_[i_13_]);
						}
						class14_sub10 = (writeTriangleToEdgeStream[i] ? edgeElementStream : elementStream);
					} else
						class14_sub10 = elementStream;
					for (int i_14_ = 1; i_14_ < indices.length - 1; i_14_++) {
						class14_sub10.writeIntLE(indices[0]);
						class14_sub10.writeIntLE(indices[i_14_]);
						class14_sub10.writeIntLE(indices[i_14_ + 1]);
					}
				}
			}
		}
		if (elementStream.position != 0 || edgeElementStream.position != 0) {
			GL gl = RT4GL.gl;
			if (texture == -1 || noTextures) {
				RT4GL.bindTexture2D(-1);
				RT4.method1778(0, 0);
			} else
				SDRaster.anInterface3_117.method16(texture);
			int i = useWTexcoord ? 40 : 36;
			if (vertexVBO != null) {
				vertexVBO.bindArray();
				gl.glVertexPointer(3, 5126, i, 0L);
				gl.glColorPointer(4, 5121, i, 12L);
				if (RT4.useLighting)
					gl.glNormalPointer(5126, i, 16L);
				gl.glTexCoordPointer(2, 5126, i, 28L);
				if (useWTexcoord) {
					gl.glClientActiveTexture(WaterShader.getActiveTexture());
					gl.glTexCoordPointer(1, 5126, i, 36L);
					gl.glClientActiveTexture(33984);
				}
			} else {
				if (RT4GL.has_vbo)
					gl.glBindBufferARB(34962, 0);
				vertexDataBuffer.position(0);
				gl.glVertexPointer(3, 5126, i, vertexDataBuffer);
				vertexDataBuffer.position(12);
				gl.glColorPointer(4, 5121, i, vertexDataBuffer);
				if (RT4.useLighting) {
					vertexDataBuffer.position(16);
					gl.glNormalPointer(5126, i, vertexDataBuffer);
				}
				vertexDataBuffer.position(28);
				gl.glTexCoordPointer(2, 5126, i, vertexDataBuffer);
				if (useWTexcoord) {
					gl.glClientActiveTexture(WaterShader.getActiveTexture());
					vertexDataBuffer.position(36);
					gl.glTexCoordPointer(1, 5126, i, vertexDataBuffer);
					gl.glClientActiveTexture(33984);
				}
			}
			if (RT4GL.has_vbo)
				gl.glBindBufferARB(34963, 0);
			if (elementStream.position != 0) {
				if (elementBuffer == null || (elementBuffer.capacity() < elementStream.position))
					elementBuffer = ByteBuffer.allocateDirect(elementStream.position)
							.order(ByteOrder.nativeOrder());
				else
					elementBuffer.clear();
				elementBuffer.put(elementStream.payload, 0, elementStream.position);
				elementBuffer.flip();
				RT4GL.setupSomeCustomProjectionStub(heightOffset);
				gl.glDrawElements(4, elementStream.position / 4, 5125, elementBuffer);
			}
			if (edgeElementStream.position != 0) {
				if (edgeElementBuffer == null || (edgeElementBuffer.capacity() < edgeElementStream.position))
					edgeElementBuffer = ByteBuffer.allocateDirect(edgeElementStream.position)
							.order(ByteOrder.nativeOrder());
				else
					edgeElementBuffer.clear();
				edgeElementBuffer.put(edgeElementStream.payload, 0, edgeElementStream.position);
				edgeElementBuffer.flip();
				RT4GL.setupSomeCustomProjectionStub(heightOffset - 100.0F);
				RT4GL.method1646();
				gl.glDrawElements(4, edgeElementStream.position / 4, 5125, edgeElementBuffer);
				RT4GL.enableDepthBufferWriting();
			}
		}
	}

	public void initialize() {
		vertexX = new int[maxVertices];
		vertexY = new int[maxVertices];
		vertexZ = new int[maxVertices];
		if (useWTexcoord)
			texCoordW = new float[maxVertices];
		vertexColour = new int[maxVertices];
		normalX = new float[maxVertices];
		normalY = new float[maxVertices];
		normalZ = new float[maxVertices];
		triangleTileX = new int[maxTriangles];
		triangleTileZ = new int[maxTriangles];
		triangleTileHL = new int[maxTriangles];
		triangleIndices = new int[maxTriangles][];
		vertexIDBuffer = new HashTable(DuplicateMethods.getFarestBitValue(maxVertices));
		if (hasEdges) {
			edgeTriangleIndices = new int[maxTriangles][];
			writeTriangleToEdgeStream = new boolean[maxTriangles];
		}
	}

	public void generateVertexData() {
		Buffer class14_sub10 = new Buffer((useWTexcoord ? 40 : 36) * vertexCount);
		for (int i = 0; i < vertexCount; i++) {
			if (RT4GL.byte_order_bigendian) {
				class14_sub10.writeFloat((float) vertexX[i]);
				class14_sub10.writeFloat((float) vertexY[i]);
				class14_sub10.writeFloat((float) vertexZ[i]);
				class14_sub10.writeInt(vertexColour[i], 103);
				class14_sub10.writeFloat(normalX[i]);
				class14_sub10.writeFloat(normalY[i]);
				class14_sub10.writeFloat(normalZ[i]);
				class14_sub10.writeFloat((float) vertexX[i] / textureSize);
				class14_sub10.writeFloat((float) vertexZ[i] / textureSize);
				if (useWTexcoord)
					class14_sub10.writeFloat(texCoordW[i]);
			} else {
				class14_sub10.writeFloatLE((float) vertexX[i]);
				class14_sub10.writeFloatLE((float) vertexY[i]);
				class14_sub10.writeFloatLE((float) vertexZ[i]);
				class14_sub10.writeInt(vertexColour[i], 119);
				class14_sub10.writeFloatLE(normalX[i]);
				class14_sub10.writeFloatLE(normalY[i]);
				class14_sub10.writeFloatLE(normalZ[i]);
				class14_sub10.writeFloatLE((float) vertexX[i] / textureSize);
				class14_sub10.writeFloatLE((float) vertexZ[i] / textureSize);
				if (useWTexcoord)
					class14_sub10.writeFloatLE(texCoordW[i]);
			}
		}
		if (RT4GL.has_vbo) {
			ByteBuffer bytebuffer = ByteBuffer.wrap(class14_sub10.payload, 0, class14_sub10.position);
			vertexVBO = new VertexBuffer();
			vertexVBO._setArrayData(bytebuffer);
		} else {
			vertexDataBuffer = ByteBuffer.allocateDirect(class14_sub10.position).order(ByteOrder.nativeOrder());
			vertexDataBuffer.put(class14_sub10.payload, 0, class14_sub10.position);
			vertexDataBuffer.flip();
		}
		vertexX = null;
		vertexY = null;
		vertexZ = null;
		vertexColour = null;
		normalX = null;
		normalY = null;
		normalZ = null;
		vertexIDBuffer = null;
		texCoordW = null;
	}
}
