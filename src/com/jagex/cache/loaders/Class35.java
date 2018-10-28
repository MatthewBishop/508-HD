/* Class35 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class Class35 {
	public int anInt587 = 0;
	public static int anInt2550;
	private static SoftCache aClass52_2370 = new SoftCache(64);
	private static FileSystem aFileSystem_332;

	public static void kill() {
		Class35.aClass52_2370 = null;
		Class35.aFileSystem_332 = null;
	}

	private void method1094(byte i, Buffer class14_sub10) {
		for (;;) {
			int i_13_ = class14_sub10.readUByte();
			if (i_13_ == 0)
				break;
			method1096(class14_sub10, i_13_);
		}
	}

	private void method1096(Buffer class14_sub10, int i) {
		if (i == 5)
			anInt587 = class14_sub10.readUShort();
	}

	public static void setup(FileSystem fileSystem) {
		aFileSystem_332 = fileSystem;
		Class35.anInt2550 = aFileSystem_332.method177(16);
	}

	public static void method991() {
		aClass52_2370.clearSoftReference();
	}

	public static void method1289() {
		aClass52_2370.clear();
	}

	public static void method1215(int i_15_) {
		aClass52_2370.method1208(i_15_);
	}

	public static Class35 list(int i_0_) {
		Class35 class35 = ((Class35) Class35.aClass52_2370.get(i_0_));
		if (class35 != null) {
			Class35 class35_1_ = class35;
			return class35_1_;
		}
		byte[] is = Class35.aFileSystem_332.method163(i_0_, 16);
		Class35 class35_2_ = new Class35();
		if (is != null)
			class35_2_.method1094((byte) 102, new Buffer(is));
		Class35.aClass52_2370.put(class35_2_, i_0_);
		Class35 class35_3_ = class35_2_;
		return class35_3_;
	}
}
