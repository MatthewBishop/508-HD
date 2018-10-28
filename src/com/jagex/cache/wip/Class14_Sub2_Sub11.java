/* Class14_Sub2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.wip;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.Cache;
import com.jagex.link.Cacheable;

import rs.Class124;
import rs.Class66;
import rs.Static2;

public class Class14_Sub2_Sub11 extends Cacheable {
	private static Cache aClass20_2680 = new Cache(64);
	private static FileSystem aFileSystem_885;
	private static FileSystem aFileSystem_993;

	public static void kill() {
		Class14_Sub2_Sub11.aClass20_2680 = null;
		Class14_Sub2_Sub11.aFileSystem_885 = null;
		Class14_Sub2_Sub11.aFileSystem_993 = null;
	}
	
	public static Class14_Sub2_Sub11 method541(int i, int i_3_) {
		Class14_Sub2_Sub11 class14_sub2_sub11 = ((Class14_Sub2_Sub11) Class14_Sub2_Sub11.aClass20_2680.get(i));
		if (class14_sub2_sub11 != null) {
			Class14_Sub2_Sub11 class14_sub2_sub11_4_ = class14_sub2_sub11;
			return class14_sub2_sub11_4_;
		}
		byte[] is;
		if (i >= 32768)
			is = Class14_Sub2_Sub11.aFileSystem_993.method163(i & 0x7fff, 0);
		else
			is = Class14_Sub2_Sub11.aFileSystem_885.method163(i, 0);
		if (i_3_ != 20083) {
			class14_sub2_sub11 = null;
			return class14_sub2_sub11;
		}
		Class14_Sub2_Sub11 class14_sub2_sub11_5_ = new Class14_Sub2_Sub11();
		if (is != null)
			class14_sub2_sub11_5_.method315((byte) -120, new Buffer(is));
		if (i >= 32768)
			class14_sub2_sub11_5_.method310(18859);
		Class14_Sub2_Sub11.aClass20_2680.put(class14_sub2_sub11_5_, i);
		class14_sub2_sub11 = class14_sub2_sub11_5_;
		return class14_sub2_sub11;
	}

	public static void method939(FileSystem fileSystem, FileSystem fileSystem_1_, int i) {
		Class14_Sub2_Sub11.aFileSystem_885 = fileSystem;
		Class14_Sub2_Sub11.aFileSystem_993 = fileSystem_1_;
	}

	public Class124 aClass124_3876;
	public int[] anIntArray3882;
	public int[] anIntArray3885;
	public int[] anIntArray3886;

	public int[] anIntArray3888;

	public int method308(byte i, int i_0_) {
		if (anIntArray3885 == null) {
			int i_1_ = -1;
			return i_1_;
		}
		int i_2_ = 0;
		int i_3_ = 66 % ((i + 15) / 38);
		for (/**/; anIntArray3885.length > i_2_; i_2_++) {
			if (i_0_ == anIntArray3888[i_2_])
				return anIntArray3885[i_2_];
		}
		return -1;
	}

	public void method310(int i) {
		if (anIntArray3882 != null) {
			for (int i_16_ = 0; i_16_ < anIntArray3882.length; i_16_++)
				anIntArray3882[i_16_] = Class66.method1294(anIntArray3882[i_16_], 32768);
		}
		if (anIntArray3885 != null) {
			for (int i_17_ = 0; anIntArray3885.length > i_17_; i_17_++)
				anIntArray3885[i_17_] = Class66.method1294(anIntArray3885[i_17_], 32768);
		}
		if (i != 18859)
			Static2.anInt3881 = 98;
	}

	public int method311(int i, int i_18_) {
		if (anIntArray3882 == null) {
			int i_19_ = -1;
			return i_19_;
		}
		for (int i_20_ = 0; i_20_ < anIntArray3882.length; i_20_++) {
			if (anIntArray3886[i_20_] == i)
				return anIntArray3882[i_20_];
		}
		if (i_18_ >= -116)
			method308((byte) 45, 111);
		return -1;
	}

	public void method312(Buffer class14_sub10, byte i, int i_21_) {
		if (i_21_ == 1)
			aClass124_3876 = class14_sub10.getJagexString();
		else if (i_21_ == 2) {
			int i_22_ = class14_sub10.readUByte();
			anIntArray3885 = new int[i_22_];
			anIntArray3888 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				anIntArray3885[i_23_] = class14_sub10.readUShort();
				int i_24_ = class14_sub10.readUByte();
				if (i_24_ == 0)
					anIntArray3888[i_23_] = -1;
				else
					anIntArray3888[i_23_] = i_24_;
			}
		} else if (i_21_ == 3) {
			int i_25_ = class14_sub10.readUByte();
			anIntArray3886 = new int[i_25_];
			anIntArray3882 = new int[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				anIntArray3882[i_26_] = class14_sub10.readUShort();
				int i_27_ = class14_sub10.readUByte();
				if (i_27_ != 0)
					anIntArray3886[i_26_] = i_27_;
				else
					anIntArray3886[i_26_] = -1;
			}
		}
	}

	public void method315(byte i, Buffer class14_sub10) {
		for (;;) {
			int i_36_ = class14_sub10.readUByte();
			if (i_36_ == 0)
				break;
			method312(class14_sub10, (byte) 30, i_36_);
		}
		if (i > -118)
			Static2.aClass100_3878 = null;
	}
}
