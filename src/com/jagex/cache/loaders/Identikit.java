/* Class21 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;
import com.jagex.util.Util;

import rs.SceneGraphNode_Model;

public class Identikit {

	private static SoftCache recent = new SoftCache(64);

	private static FileSystem configFS;

	private static FileSystem modelFS;
	public static int count;
	
	public static void kill() {
		Identikit.recent = null;
		Identikit.configFS = null;
		Identikit.modelFS = null;
	}
	
	public static void method1128(byte i) {
		recent.clear();
	}

	public static Identikit list(int var0) {
		try {
			Identikit var2 = (Identikit) Identikit.recent.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = Identikit.configFS.method163(var0, 3);
				Identikit var4 = new Identikit();
				if (var3 != null) {
					var4.decode(new Buffer(var3));
				}

				Identikit.recent.put(var4, var0);
				return var4;
			}
		} catch (Throwable var5) {
			throw Util.error(var5, "pb.JA(" + var0 + ')');
		}
	}

	public static void method530() {
		recent.clearSoftReference();
	}

	public static void method548(int i) {
		recent.method1208(i);
	}

	public static void setup(FileSystem fileSystem, boolean bool, FileSystem fileSystem_21_) {
		Identikit.configFS = fileSystem;
		modelFS = fileSystem_21_;
		Identikit.count = Identikit.configFS.method177(3);
	}

	public boolean isNotDefault = false;//TODO new name
	public int partId = -1;
	public int[] headModelIds = { -1, -1, -1, -1, -1 };
	public int[] modelIds;

	public short[] recolorOriginal;

	public short[] recolorModified;

	public short[] retextureOriginal;

	public short[] retextureModified;

	public void decode(Buffer class14_sub10, int i) {
		if (i == 1)
			partId = class14_sub10.readUByte();
		else if (i == 2) {
			int i_3_ = class14_sub10.readUByte();
			modelIds = new int[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++)
				modelIds[i_4_] = class14_sub10.readUShort();
		} else if (i == 3) {
			isNotDefault = true;
		} else if (i == 40) {
			int i_5_ = class14_sub10.readUByte();
			recolorOriginal = new short[i_5_];
			recolorModified = new short[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
				recolorOriginal[i_6_] = (short) class14_sub10.readUShort();
				recolorModified[i_6_] = (short) class14_sub10.readUShort();
			}
		} else if (i == 41) {
			int i_7_ = class14_sub10.readUByte();
			retextureOriginal = new short[i_7_];
			retextureModified = new short[i_7_];
			for (int i_8_ = 0; i_7_ > i_8_; i_8_++) {
				retextureOriginal[i_8_] = (short) class14_sub10.readUShort();
				retextureModified[i_8_] = (short) class14_sub10.readUShort();
			}
		} else if (i >= 60 && i < 70)
			headModelIds[i - 60] = class14_sub10.readUShort();
	}

	public SceneGraphNode_Model constructHeadModel() {
		SceneGraphNode_Model[] class133_sub2s = new SceneGraphNode_Model[5];
		int i_9_ = 0;
		for (int i_10_ = 0; i_10_ < 5; i_10_++) {
			if (headModelIds[i_10_] != -1)
				class133_sub2s[i_9_++] = SceneGraphNode_Model.method1824(Identikit.modelFS, headModelIds[i_10_],
						0);
		}
		SceneGraphNode_Model class133_sub2 = new SceneGraphNode_Model(class133_sub2s, i_9_);
		if (recolorOriginal != null) {
			for (int i_11_ = 0; i_11_ < recolorOriginal.length; i_11_++)
				class133_sub2.recolor(recolorOriginal[i_11_], recolorModified[i_11_]);
		}
		if (retextureOriginal != null) {
			for (int i_12_ = 0; retextureOriginal.length > i_12_; i_12_++)
				class133_sub2.retexture(retextureOriginal[i_12_], retextureModified[i_12_]);
		}
		SceneGraphNode_Model class133_sub2_13_ = class133_sub2;
		return class133_sub2_13_;
	}

	public void decode(Buffer class14_sub10) {
		for (;;) {
			int i_22_ = class14_sub10.readUByte();
			if (i_22_ == 0)
				break;
			decode(class14_sub10, i_22_);
		}
	}

	public SceneGraphNode_Model constructModel() {
		if (modelIds == null) {
			SceneGraphNode_Model class133_sub2 = null;
			return class133_sub2;
		}
		SceneGraphNode_Model[] class133_sub2s = new SceneGraphNode_Model[modelIds.length];
		for (int i_23_ = 0; modelIds.length > i_23_; i_23_++)
			class133_sub2s[i_23_] = SceneGraphNode_Model.method1824(Identikit.modelFS, modelIds[i_23_], 0);
		SceneGraphNode_Model class133_sub2;
		if (class133_sub2s.length == 1)
			class133_sub2 = class133_sub2s[0];
		else
			class133_sub2 = new SceneGraphNode_Model(class133_sub2s, class133_sub2s.length);
		if (recolorOriginal != null) {
			for (int i_24_ = 0; recolorOriginal.length > i_24_; i_24_++)
				class133_sub2.recolor(recolorOriginal[i_24_], recolorModified[i_24_]);
		}
		if (retextureOriginal != null) {
			for (int i_25_ = 0; retextureOriginal.length > i_25_; i_25_++)
				class133_sub2.retexture(retextureOriginal[i_25_], retextureModified[i_25_]);
		}
		SceneGraphNode_Model class133_sub2_26_ = class133_sub2;
		return class133_sub2_26_;
	}

	public boolean modelsDownloaded() {
		if (modelIds == null) {
			boolean bool_27_ = true;
			return bool_27_;
		}
		boolean bool_28_ = true;
		for (int i = 0; i < modelIds.length; i++) {
			if (!Identikit.modelFS.method158(0, modelIds[i]))
				bool_28_ = false;
		}
		boolean bool_29_ = bool_28_;
		return bool_29_;
	}

	public boolean headModelsDownloaded() {
		boolean bool_30_ = true;
		for (int i = 0; i < 5; i++) {
			if (headModelIds[i] != -1 && !Identikit.modelFS.method158(0, headModelIds[i]))
				bool_30_ = false;
		}
		boolean bool_31_ = bool_30_;
		return bool_31_;
	}
}
