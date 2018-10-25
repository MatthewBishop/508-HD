/* Class10 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4.lights;

import javax.media.opengl.GL;

import com.jagex.rt4.AtmosphericEffects;
import com.jagex.rt4.RT4;
import com.jagex.rt4.RT4GL;

import rs.Class14_Sub29;
import rs.Class14_Sub9_Sub3;
import rs.Class7_Sub1;
import rs.JunkTex;

public class LightManager {
	public static Light[] lights = new Light[255];
	public static int lightCount = 0;
	
	private static int activeLightHeightLevel;
	private static int mapDepth;
	private static int activeLightX1;
	private static int[] activeVirtualLights = new int[4];
	private static boolean[] virtualLightAssigned = new boolean[4];
	private static int[][][] virtualLightsPerTile;
	private static boolean[] isLightEnabled = new boolean[4];
	private static int activeLightY1;
	private static float[] lightPositionBuffer = new float[] { 0.0F, 0.0F, 0.0F, 1.0F };
	private static int activeLightY2;
	private static int[] assignedVirtualLight = new int[4];
	private static int mapWidth;
	private static int activeLightX2;
	private static int mapHeight;

	
	public static void loadLightingForTile(int x_offset, int y_offset, int z_offset, int heightLevel, int tileX, int tileY) {
		if (RT4.useLighting
				&& (activeLightHeightLevel != heightLevel || activeLightX1 != tileX || activeLightY1 != tileY || activeLightX2 != tileX || activeLightY2 != tileY)) {
			for (int i_5_ = 0; i_5_ < 4; i_5_++)
				virtualLightAssigned[i_5_] = false;
			int activeVLCounter = 0;
			int tile_light_register = virtualLightsPerTile[heightLevel][tileX][tileY];
			while_74_: while (tile_light_register != 0) {
				int virtualLightID = (tile_light_register & 0xff) - 1;
				tile_light_register >>>= 8;
				for (int i_9_ = 0; i_9_ < 4; i_9_++) {
					if (virtualLightID == assignedVirtualLight[i_9_]) {
						virtualLightAssigned[i_9_] = true;
						continue while_74_;
					}
				}
				activeVirtualLights[activeVLCounter++] = virtualLightID;
			}
			for (int virtualLightID = 0; virtualLightID < activeVLCounter; virtualLightID++) {
				for (int glLightID = 0; glLightID < 4; glLightID++) {
					if (!virtualLightAssigned[glLightID]) {
						assignedVirtualLight[glLightID] = activeVirtualLights[virtualLightID];
						virtualLightAssigned[glLightID] = true;
						applyLight(glLightID, lights[activeVirtualLights[virtualLightID]], x_offset, y_offset, z_offset);
						break;
					}
				}
			}
			for (int glLightID = 0; glLightID < 4; glLightID++) {
				if (!virtualLightAssigned[glLightID]) {
					assignedVirtualLight[glLightID] = -1;
					disableGLLight(glLightID);
				}
			}
			activeLightHeightLevel = heightLevel;
			activeLightX1 = tileX;
			activeLightY1 = tileY;
			activeLightX2 = tileX;
			activeLightY2 = tileY;
		}
	}

	public static void disableAllGLLights() {
		for (int i = 0; i < 4; i++) {
			assignedVirtualLight[i] = -1;
			disableGLLight(i);
		}
	}

	public static void initializeLightMap(int height, int width, int depth) {
		mapHeight = height;
		mapWidth = width;
		mapDepth = depth;
		virtualLightsPerTile = new int[mapHeight][mapWidth][mapDepth];
	}

	public static void resetLights(int i, boolean bool) {
		for (int i_15_ = 0; i_15_ < lightCount; i_15_++)
			lights[i_15_].method1326(i, bool);
		activeLightHeightLevel = -1;
		activeLightX1 = -1;
		activeLightY1 = -1;
		activeLightX2 = -1;
		activeLightY2 = -1;
	}

	public static void destroy() {
		lights = null;
		virtualLightsPerTile = null;
		assignedVirtualLight = null;
		isLightEnabled = null;
		lightPositionBuffer = null;
		activeVirtualLights = null;
		virtualLightAssigned = null;
	}

	public static void loadclosestlights_wall(int direction, int x_offset, int y_offset, int z_offset, int heightLevel, int tileX, int tileY) {
		if (RT4.useLighting) {
			if (direction == 1 && tileX > 0)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX - 1, tileY);
			else if (direction == 4 && tileX < mapWidth - 1)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX + 1, tileY);
			else if (direction == 8 && tileY > 0)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX, tileY - 1);
			else if (direction == 2 && tileY < mapDepth - 1)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX, tileY + 1);
			else if (direction == 16 && tileX > 0 && tileY < mapDepth - 1)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX - 1, tileY + 1);
			else if (direction == 32 && tileX < mapWidth - 1 && tileY < mapDepth - 1)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX + 1, tileY + 1);
			else if (direction == 128 && tileX > 0 && tileY > 0)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX - 1, tileY - 1);
			else if (direction == 64 && tileX < mapWidth - 1 && tileY > 0)
				loadLightingForTile(x_offset, y_offset, z_offset, heightLevel, tileX + 1, tileY - 1);
		}
	}

	public static void loadLightingForTiles(int x_offset, int y_offset, int z_offset, int heightLevel, int tileXBegin, int tileYBegin, int tileXEnd, int tileYEnd) {
		if (RT4.useLighting && (activeLightHeightLevel != heightLevel || activeLightX1 != tileXBegin || activeLightY1 != tileYBegin
				|| activeLightX2 != tileXEnd || activeLightY2 != tileYEnd)) {
			for (int i = 0; i < 4; i++)
				virtualLightAssigned[i] = false;
			int counter = 0;
			int activeVLCounter = 0;
			while_76_: for (int i_32_ = tileXBegin; i_32_ <= tileXEnd; i_32_++) {
				for (int i_33_ = tileYBegin; i_33_ <= tileYEnd; i_33_++) {
					int i_34_ = virtualLightsPerTile[heightLevel][i_32_][i_33_];
					while_75_: while (i_34_ != 0) {
						int virtualLightID = (i_34_ & 0xff) - 1;
						i_34_ >>>= 8;
						for (int i_36_ = 0; i_36_ < activeVLCounter; i_36_++) {
							if (virtualLightID == activeVirtualLights[i_36_])
								continue while_75_;
						}
						for (int glLightID = 0; glLightID < 4; glLightID++) {
							if (virtualLightID == assignedVirtualLight[glLightID]) {
								if (!virtualLightAssigned[glLightID]) {
									virtualLightAssigned[glLightID] = true;
									if (++counter == 4)
										break while_76_;
								}
								continue while_75_;
							}
						}
						activeVirtualLights[activeVLCounter++] = virtualLightID;
						if (++counter == 4)
							break while_76_;
					}
				}
			}
			for (int virtualLightID = 0; virtualLightID < activeVLCounter; virtualLightID++) {
				for (int glLightID = 0; glLightID < 4; glLightID++) {
					if (!virtualLightAssigned[glLightID]) {
						assignedVirtualLight[glLightID] = activeVirtualLights[virtualLightID];
						virtualLightAssigned[glLightID] = true;
						applyLight(glLightID, lights[activeVirtualLights[virtualLightID]], x_offset, y_offset, z_offset);
						break;
					}
				}
			}
			for (int i_40_ = 0; i_40_ < 4; i_40_++) {
				if (!virtualLightAssigned[i_40_]) {
					assignedVirtualLight[i_40_] = -1;
					disableGLLight(i_40_);
				}
			}
			activeLightHeightLevel = heightLevel;
			activeLightX1 = tileXBegin;
			activeLightY1 = tileYBegin;
			activeLightX2 = tileXEnd;
			activeLightY2 = tileYEnd;
		}
	}

	public static void resetGLLights() {
		GL gl = RT4GL.gl;
		for (int lightID = 0; lightID < 4; lightID++) {
			int nativeLightID = lightID + 16388;
			gl.glLightfv(nativeLightID, 4608, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			gl.glLightf(nativeLightID, 4616, 0.0F);
			gl.glLightf(nativeLightID, 4615, 0.0F);
		}
	}

	public static void renderFloorGlow(int i, int i_42_, Class14_Sub29[][][] class14_sub29s) {
		if (RT4.useLighting) {
			GL gl = RT4GL.gl;
			RT4.method1778(0, 0);
			RT4GL.setRgbCombineMode(0);
			RT4GL.resetTextureMatrix();
			RT4GL.bindTexture2D(RT4GL.generated_texture_id);
			gl.glDepthMask(false);
			RT4GL.setLightingEnabled(false);
			gl.glBlendFunc(774, 1);
			gl.glFogfv(2918, new float[] { 0.0F, 0.0F, 0.0F, 0.0F }, 0);
			gl.glTexEnvi(8960, 34176, 34166);
			gl.glTexEnvi(8960, 34192, 770);
			for (int i_43_ = 0; i_43_ < lightCount; i_43_++) {
				Light light = lights[i_43_];
				if (light.glow != null) {
					int shape_ptr = 0;
					int tile_y_Begin = (light.z >> 7) - light.radius;
					int tile_y_End = (light.z >> 7) + light.radius;
					if (tile_y_End >= JunkTex.anInt4526)
						tile_y_End = JunkTex.anInt4526 - 1;
					if (tile_y_Begin < Class14_Sub9_Sub3.anInt4849) {
						shape_ptr += Class14_Sub9_Sub3.anInt4849 - tile_y_Begin;
						tile_y_Begin = Class14_Sub9_Sub3.anInt4849;
					}
					while_77_: for (int tile_y_C = tile_y_Begin; tile_y_C <= tile_y_End; tile_y_C++) {
						int widthPtr = light.shape[shape_ptr++];
						int light_x_Begin = ((light.x >> 7) - light.radius + (widthPtr >> 8));
						int light_x_End = light_x_Begin + (widthPtr & 0xff) - 1;
						if (light_x_Begin < Class7_Sub1.anInt2659)
							light_x_Begin = Class7_Sub1.anInt2659;
						if (light_x_End >= JunkTex.anInt4722)
							light_x_End = JunkTex.anInt4722 - 1;
						for (int tile_x_C = light_x_Begin; tile_x_C <= light_x_End; tile_x_C++) {
							Class14_Sub29 class14_sub29 = (class14_sub29s[light.heightLevel][tile_x_C][tile_y_C]);
							if (class14_sub29 != null && class14_sub29.aBoolean3235) {
								RT4GL.setupSomeCustomProjectionStub(201.5F - ((float) (light.heightLevel) * 50.0F) - 1.5F);
								gl.glTexEnvfv(8960, 8705, (new float[] { 0.0F, 0.0F, 0.0F, light.intensity }), 0);
								light.glow.render();
								break while_77_;
							}
						}
					}
				}
			}
			gl.glTexEnvi(8960, 34176, 5890);
			gl.glTexEnvi(8960, 34192, 768);
			gl.glBlendFunc(770, 771);
			gl.glDepthMask(true);
			gl.glFogfv(2918, AtmosphericEffects.fogColourComponents, 0);
			gl.glEnableClientState(32888);
			RT4GL.applyLightingSetting();
		}
	}

	public static void removeLightsNotOnTiles(int heightLevel, int tileX, int tileY, int tileX2, int tileY2) {
		if (RT4.useLighting) {
			int glLightID = 0;
			while_79_: for (/**/; glLightID < 4; glLightID++) {
				if (assignedVirtualLight[glLightID] != -1) {
					int tileLightMask = virtualLightsPerTile[heightLevel][tileX][tileY];
					while (tileLightMask != 0) {
						int virtualLightID = (tileLightMask & 0xff) - 1;
						tileLightMask >>>= 8;
						if (virtualLightID == assignedVirtualLight[glLightID])
							continue while_79_;
					}
					tileLightMask = virtualLightsPerTile[heightLevel][tileX2][tileY2];
					while (tileLightMask != 0) {
						int virtualLightID = (tileLightMask & 0xff) - 1;
						tileLightMask >>>= 8;
						if (virtualLightID == assignedVirtualLight[glLightID])
							continue while_79_;
					}
				}
				assignedVirtualLight[glLightID] = -1;
				disableGLLight(glLightID);
			}
		}
	}

	private static void applyLight(int glLightID, Light light, int x_offset, int y_offset, int z_offset) {
		int nativeLightID = glLightID + 16384 + 4;
		GL gl = RT4GL.gl;
		if (!isLightEnabled[glLightID]) {
			gl.glEnable(nativeLightID);
			isLightEnabled[glLightID] = true;
		}
		gl.glLightf(nativeLightID, 4617, light.quadraticAttenuation);
		gl.glLightfv(nativeLightID, 4609, light.diffuseColourComponents, 0);
		lightPositionBuffer[0] = (float) (light.x - x_offset);
		lightPositionBuffer[1] = (float) (light.y - y_offset);
		lightPositionBuffer[2] = (float) (light.z - z_offset);
		gl.glLightfv(nativeLightID, 4611, lightPositionBuffer, 0);
	}

	private static void disableGLLight(int glLightID) {
		if (isLightEnabled[glLightID]) {
			isLightEnabled[glLightID] = false;
			int nativeLightID = glLightID + 16384 + 4;
			GL gl = RT4GL.gl;
			gl.glDisable(nativeLightID);
		}
	}

	public static void generateLightMap() {
		for (int virtual_light_id = 0; virtual_light_id < lightCount; virtual_light_id++) {
			Light light = lights[virtual_light_id];
			int beginHL = light.heightLevel;
			if (light.fromGroundToHL)
				beginHL = 0;
			int endHL = light.heightLevel;
			if (light.fromHLToSky)
				endHL = 3;
			for (int hl = beginHL; hl <= endHL; hl++) {
				int shape_ptr = 0;
				int light_y_Begin = (light.z >> 7) - light.radius;
				if (light_y_Begin < 0) {
					shape_ptr -= light_y_Begin;
					light_y_Begin = 0;
				}
				int light_y_End = (light.z >> 7) + light.radius;
				if (light_y_End > mapDepth - 1)
					light_y_End = mapDepth - 1;
				for (int tile_y_C = light_y_Begin; tile_y_C <= light_y_End; tile_y_C++) {
					int shapeval = light.shape[shape_ptr++];
					int tile_x_Begin = ((light.x >> 7) - light.radius + (shapeval >> 8));
					int tile_x_End = tile_x_Begin + (shapeval & 0xff) - 1;
					if (tile_x_Begin < 0)
						tile_x_Begin = 0;
					if (tile_x_End > mapWidth - 1)
						tile_x_End = mapWidth - 1;
					for (int tile_x_C = tile_x_Begin; tile_x_C <= tile_x_End; tile_x_C++) {
						int old_light_register = virtualLightsPerTile[hl][tile_x_C][tile_y_C];
						if ((old_light_register & 0xff) == 0)
							virtualLightsPerTile[hl][tile_x_C][tile_y_C] = old_light_register | virtual_light_id + 1;
						else if ((old_light_register & 0xff00) == 0)
							virtualLightsPerTile[hl][tile_x_C][tile_y_C] = old_light_register | virtual_light_id + 1 << 8;
						else if ((old_light_register & 0xff0000) == 0)
							virtualLightsPerTile[hl][tile_x_C][tile_y_C] = old_light_register | virtual_light_id + 1 << 16;
						else if ((old_light_register & ~0xffffff) == 0)
							virtualLightsPerTile[hl][tile_x_C][tile_y_C] = old_light_register | virtual_light_id + 1 << 24;
					}
				}
			}
		}
	}

	public static void addLight(Light light) {
		if (lightCount >= 255)
			System.out.println("Number of lights added exceeds maximum!");
		else
			lights[lightCount++] = light;
	}

	public static void resetLightMap() {
		lightCount = 0;
		for (int hl = 0; hl < mapHeight; hl++) {
			for (int x = 0; x < mapWidth; x++) {
				for (int y = 0; y < mapDepth; y++)
					virtualLightsPerTile[hl][x][y] = 0;
			}
		}
	}
}
