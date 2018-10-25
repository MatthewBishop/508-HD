/* Class61 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.shader;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.media.opengl.GL;

import org.jagex.image.transform.TexStatic;

import com.jagex.io.Buffer;
import com.jagex.rt4.Class119;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

public class LavaShader implements ShaderInterface {
	private int anInt2565 = -1;
	private int anInt2566;
	private static float[] aFloatArray2567 = new float[4];
	private int anInt2568 = -1;
	private FloatBuffer aFloatBuffer2569;

	public int getTextureParameters() {
		return 0;
	}

	public static void method1271() {
		LavaShader.aFloatArray2567 = null;
	}

	public void disable() {
		if (this.anInt2565 >= 0) {
			GL gl = RT4GL.gl;
			gl.glCallList(this.anInt2565 + 1);
		}
	}

	public void enable() {
		if (this.anInt2565 >= 0) {
			GL gl = RT4GL.gl;
			gl.glCallList(this.anInt2565);
			gl.glActiveTexture(33985);
			gl.glMatrixMode(5890);
			gl.glTranslatef(RT4.translateX, RT4.translateY,
					RT4.translateZ);
			gl.glRotatef((-(RT4.rotateY * 360.0F) / 2048.0F), 0.0F, 1.0F, 0.0F);
			gl.glRotatef(-(RT4.rotateX * 360.0F) / 2048.0F, 1.0F, 0.0F, 0.0F);
			gl.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
			gl.glMatrixMode(5888);
			if (!Class119.allows3DTextureMapping)
				gl.glBindTexture(3553,
						(Class119.textureIds2[(int) (RT4GL.loopCycleWrapper * 64 * 0.005F) % 64]));
			gl.glActiveTexture(33984);
			if (this.anInt2568 != RT4GL.loopCycleWrapper) {
				int i = (RT4GL.loopCycleWrapper & 0xff) * 256;
				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					this.aFloatBuffer2569.position(i);
					gl.glProgramLocalParameter4fvARB(34336, i_0_, this.aFloatBuffer2569);
					i += 4;
				}
				if (Class119.allows3DTextureMapping)
					gl.glProgramLocalParameter4fARB(34336, 65, (RT4GL.loopCycleWrapper * 0.005F), 0.0F, 0.0F, 1.0F);
				else
					gl.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				this.anInt2568 = RT4GL.loopCycleWrapper;
			}
		}
	}

	public void method1272() {
		GL gl = RT4GL.gl;
		this.anInt2565 = gl.glGenLists(2);
		gl.glNewList(this.anInt2565, 4864);
		gl.glActiveTexture(33985);
		if (Class119.allows3DTextureMapping)
			gl.glBindTexture(32879, Class119.texture3DPointer2);
		gl.glTexEnvi(8960, 34161, 260);
		gl.glTexEnvi(8960, 34162, 7681);
		gl.glTexEnvi(8960, 34184, 34168);
		gl.glActiveTexture(33984);
		gl.glBindProgramARB(34336, this.anInt2566);
		gl.glEnable(34336);
		gl.glEndList();
		gl.glNewList(this.anInt2565 + 1, 4864);
		gl.glActiveTexture(33985);
		gl.glMatrixMode(5890);
		gl.glLoadIdentity();
		gl.glMatrixMode(5888);
		gl.glTexEnvi(8960, 34161, 8448);
		gl.glTexEnvi(8960, 34162, 8448);
		gl.glTexEnvi(8960, 34184, 5890);
		gl.glDisable(Class119.allows3DTextureMapping ? 32879 : 3553);
		gl.glActiveTexture(33984);
		gl.glBindProgramARB(34336, 0);
		gl.glDisable(34336);
		gl.glDisable(34820);
		gl.glEndList();
	}

	public void method1273() {
		do {
			if (this.anInt2565 >= 0) {
				GL gl = RT4GL.gl;
				int[] is = new int[1];
				gl.glBindProgramARB(34336, this.anInt2566);
				gl.glProgramStringARB(34336, 34933,
						"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND"
								.length(),
						"!!ARBvp1.0\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nOUTPUT  oPos         = result.position;\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, clipPos, viewPos, worldPos;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nMAD   oTexCoord0, worldPos.xzww, 0.0078125, noise;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, worldPos.xzww, 0.0009765625;\nMOV   oTexCoord1.zw, time.xxxw;\nDP4   clipPos.x, pMatrix[0], viewPos;\nDP4   clipPos.y, pMatrix[1], viewPos;\nDP4   clipPos.z, pMatrix[2], viewPos;\nDP4   clipPos.w, pMatrix[3], viewPos;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, 1;\nMOV   oFogCoord.x, clipPos.z;\nMOV   oPos, clipPos; \nEND");
				gl.glGetIntegerv(34379, is, 0);
				if (is[0] != -1)
					break;
			}
		} while (false);
	}

	public void setup(int i) {
		if (this.anInt2565 >= 0) {
			GL gl = RT4GL.gl;
			gl.glActiveTexture(33985);
			if ((i & 0x80) == 0)
				gl.glEnable(Class119.allows3DTextureMapping ? 32879 : 3553);
			else
				gl.glDisable(Class119.allows3DTextureMapping ? 32879 : 3553);
			gl.glActiveTexture(33984);
			if ((i & 0x40) == 0) {
				gl.glGetFloatv(2899, LavaShader.aFloatArray2567, 0);
				gl.glProgramLocalParameter4fvARB(34336, 66, LavaShader.aFloatArray2567, 0);
			} else
				gl.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			int i_1_ = i & 0x3;
			if (i_1_ == 2)
				gl.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			else if (i_1_ == 3)
				gl.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			else
				gl.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
		}
	}

	public LavaShader() {
		if (this.anInt2565 < 0 && RT4GL.has_vertex_program && RT4GL.maxTextureUnits >= 2) {
			int[] is = new int[1];
			GL gl = RT4GL.gl;
			gl.glGenProgramsARB(1, is, 0);
			this.anInt2566 = is[0];
			int[][] is_2_ = TexStatic.prepareLavaShader(256, 256, 4, 0, 8, 3, 64, 0.4F, false);
			int[][] is_3_ = TexStatic.prepareLavaShader(256, 256, 4, 8, 8, 3, 64, 0.4F, false);
			Buffer class14_sub10 = new Buffer(262144);
			for (int i = 0; i < 256; i++) {
				int[] is_4_ = is_2_[i];
				int[] is_5_ = is_3_[i];
				for (int i_6_ = 0; i_6_ < 64; i_6_++) {
					if (RT4GL.byte_order_bigendian) {
						class14_sub10.writeFloat(is_4_[i_6_] / 4096.0F);
						class14_sub10.writeFloat(is_5_[i_6_] / 4096.0F);
						class14_sub10.writeFloat(1.0F);
						class14_sub10.writeFloat(1.0F);
					} else {
						class14_sub10.writeFloatLE(is_4_[i_6_] / 4096.0F, 24671);
						class14_sub10.writeFloatLE(is_5_[i_6_] / 4096.0F, 24671);
						class14_sub10.writeFloatLE(1.0F, 24671);
						class14_sub10.writeFloatLE(1.0F, 24671);
					}
				}
			}
			ByteBuffer bytebuffer = ByteBuffer.allocateDirect(class14_sub10.position).order(ByteOrder.nativeOrder());
			bytebuffer.put(class14_sub10.payload, 0, class14_sub10.position);
			bytebuffer.flip();
			this.aFloatBuffer2569 = bytebuffer.asFloatBuffer().asReadOnlyBuffer();
			this.method1272();
			this.method1273();
		}
	}
}
