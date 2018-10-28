/* Class51 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class VarBit {
	
	public static VarBit list(int i) {
		VarBit varBit = (VarBit) VarBit.aClass52_4240.get(i);
		if (varBit != null) {
			VarBit varBit_39_ = varBit;
			return varBit_39_;
		}
		byte[] is = VarBit.aFileSystem_2652.method163(i & 0x3ff, i >>> 10);
		VarBit varBit_40_ = new VarBit();
		if (is != null)
			varBit_40_.decode(new Buffer(is));
		VarBit.aClass52_4240.put(varBit_40_, i);
		VarBit varBit_41_ = varBit_40_;
		return varBit_41_;
	}
	
	public int anInt832;

	public int anInt834;

	public int anInt842;

	private static FileSystem aFileSystem_2652;

	private static SoftCache aClass52_4240 = new SoftCache(64);

	private void decode(Buffer class14_sub10) {
		for (;;) {
			int i_1_ = class14_sub10.readUByte();
			if (i_1_ == 0)
				break;
			method1199(i_1_, class14_sub10);
		}
	}

	public void method1199(int i, Buffer class14_sub10) {
		if (i == 1) {
			anInt842 = class14_sub10.readUShort();
			anInt832 = class14_sub10.readUByte();
			anInt834 = class14_sub10.readUByte();
		}
	}

	public static void setup(FileSystem fileSystem) {
		aFileSystem_2652 = fileSystem;
	}

	public static void method88(int i) {
		aClass52_4240.method1208(i);
	}

	public static void method1443() {
		aClass52_4240.clearSoftReference();
	}

	public static void method130() {
		aClass52_4240.clear();
	}

	public static void kill() {
		VarBit.aClass52_4240 = null;
		VarBit.aFileSystem_2652 = null;
	}
}
