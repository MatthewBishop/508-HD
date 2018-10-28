/* Class60 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.cache.anim.AnimLoader;
import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

import rs.SceneGraphNode_AbstractModelRenderer;
import rs.SceneGraphNode_Model;

public class SpotAnimType {

	public static void kill() {
		SpotAnimType.gfxCache = null;
		SpotAnimType.modelCache = null;
		SpotAnimType.modelFS = null;
		SpotAnimType.gfxFS = null;
	}
	
	private static SoftCache gfxCache = new SoftCache(64);
	private static SoftCache modelCache = new SoftCache(30);
	private static FileSystem modelFS;
	private static FileSystem gfxFS;

	public static void setup(FileSystem fileSystem, FileSystem fileSystem_41_) {
		SpotAnimType.gfxFS = fileSystem;
		SpotAnimType.modelFS = fileSystem_41_;
	}

	public static SpotAnimType list(int id) {
		SpotAnimType spotAnimType = (SpotAnimType) SpotAnimType.gfxCache.get(id);
		if (spotAnimType != null) {
			SpotAnimType spotAnimType_10_ = spotAnimType;
			return spotAnimType_10_;
		}
		byte[] is = (gfxFS.method163(id & 0xff, id >>> 8));
		SpotAnimType spotAnimType_11_ = new SpotAnimType();
		spotAnimType_11_.myId = id;
		if (is != null)
			spotAnimType_11_.decode(0, new Buffer(is));
		SpotAnimType.gfxCache.put(spotAnimType_11_, id);
		SpotAnimType spotAnimType_13_ = spotAnimType_11_;
		return spotAnimType_13_;
	}

	public static void method1960(int i) {
		gfxCache.method1208(i);
		modelCache.method1208(i);
	}

	public static void method560() {
		gfxCache.clearSoftReference();
		modelCache.clearSoftReference();
	}

	public boolean aBoolean978;

	public int animationId;

	public int lightness = 0;
	public int modelId;
	public int myId;
	public short[] recolorModified;
	public short[] recolorOriginal;

	public int resizeX = 128;

	public int resizeY;

	public short[] retextureModified;

	public short[] retextureOriginal;

	public int rotation;

	public int shading;

	public SpotAnimType() {
		rotation = 0;
		shading = 0;
		resizeY = 128;
		aBoolean978 = false;
		animationId = -1;
	}

	public void decode(Buffer class14_sub10, int i, boolean bool) {
		if (i == 1)
			modelId = class14_sub10.readUShort();
		else if (i == 2)
			animationId = class14_sub10.readUShort();
		else if (i == 4)
			resizeX = class14_sub10.readUShort();
		else if (i == 5)
			resizeY = class14_sub10.readUShort();
		else if (i == 6)
			rotation = class14_sub10.readUShort();
		else if (i == 7)
			lightness = class14_sub10.readUByte();
		else if (i == 8)
			shading = class14_sub10.readUByte();
		else if (i == 9) {
			aBoolean978 = true;
		} else if (i == 40) {
			int i_19_ = class14_sub10.readUByte();
			recolorModified = new short[i_19_];
			recolorOriginal = new short[i_19_];
			for (int i_20_ = 0; i_19_ > i_20_; i_20_++) {
				recolorOriginal[i_20_] = (short) class14_sub10.readUShort();
				recolorModified[i_20_] = (short) class14_sub10.readUShort();
			}
		} else if (i == 41) {
			int i_17_ = class14_sub10.readUByte();
			retextureOriginal = new short[i_17_];
			retextureModified = new short[i_17_];
			for (int i_18_ = 0; i_17_ > i_18_; i_18_++) {
				retextureOriginal[i_18_] = (short) (class14_sub10.readUShort((byte) 115));
				retextureModified[i_18_] = (short) (class14_sub10.readUShort((byte) 111));
			}
		}
	}

	public SceneGraphNode_AbstractModelRenderer constructModel(int frame) {
		SceneGraphNode_AbstractModelRenderer class133_sub7 = ((SceneGraphNode_AbstractModelRenderer) SpotAnimType.modelCache
				.get(myId));
		if (class133_sub7 == null) {
			SceneGraphNode_Model class133_sub2 = SceneGraphNode_Model.method1824(SpotAnimType.modelFS, modelId, 0);
			if (class133_sub2 == null) {
				SceneGraphNode_AbstractModelRenderer class133_sub7_22_ = null;
				return class133_sub7_22_;
			}
			if (recolorOriginal != null) {
				for (int i_23_ = 0; i_23_ < recolorOriginal.length; i_23_++)
					class133_sub2.recolor(recolorOriginal[i_23_], recolorModified[i_23_]);
			}
			if (retextureOriginal != null) {
				for (int i_24_ = 0; i_24_ < retextureOriginal.length; i_24_++)
					class133_sub2.retexture(retextureOriginal[i_24_], retextureModified[i_24_]);
			}
			class133_sub7 = class133_sub2.toRenderer(lightness + 64, shading + 850, -30, -50, -30);
			SpotAnimType.modelCache.put(class133_sub7, myId);
		}
		SceneGraphNode_AbstractModelRenderer class133_sub7_25_;
		if (animationId != -1 && frame != -1)
			class133_sub7_25_ = AnimLoader.method1129(animationId).method1173(frame, 65535, class133_sub7);
		else
			class133_sub7_25_ = class133_sub7.method1870(true, true);
		if (resizeX != 128 || resizeY != 128)
			class133_sub7_25_.method1869(resizeX, resizeY, resizeX);
		if (rotation != 0) {
			if (rotation == 90)
				class133_sub7_25_.method1871();
			if (rotation == 180)
				class133_sub7_25_.method1872();
			if (rotation == 270)
				class133_sub7_25_.method1875();
		}
		return class133_sub7_25_;
	}

	public void decode(int i, Buffer class14_sub10) {
		if (i == 0) {
			for (;;) {
				int i_26_ = class14_sub10.readUByte();
				if (i_26_ == 0)
					break;
				decode(class14_sub10, i_26_, false);
			}
		}
	}

	public static void method1025() {
		gfxCache.clear();
		modelCache.clear();
	}
}
