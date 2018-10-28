/* Class120 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import com.jagex.io.js5.FileSystem;
import com.jagex.link.HashTable;
import com.jagex.sound.Class14_Sub12_Sub1;
import com.jagex.sound.Track;

public class Class120 {
	
	public HashTable aClass55_2004 = new HashTable(256);

	public HashTable aClass55_2015 = new HashTable(256);

	public FileSystem aFileSystem_2003;

	public FileSystem aFileSystem_2010;

	public Class120(FileSystem fileSystem, FileSystem fileSystem_21_) {
		aFileSystem_2003 = fileSystem_21_;
		aFileSystem_2010 = fileSystem;
	}

	public Class14_Sub12_Sub1 method1616(int i, int i_7_, int[] is, boolean bool) {
		int i_8_ = i_7_ ^ ((i & 0x40000fff) << 4 | i >>> 44);
		i_8_ |= i << 16;
		long l = i_8_;
		if (!bool) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass55_2015.get(l);
		if (class14_sub12_sub1 != null) {
			Class14_Sub12_Sub1 class14_sub12_sub1_9_ = class14_sub12_sub1;
			return class14_sub12_sub1_9_;
		}
		if (is != null && is[0] <= 0) {
			Class14_Sub12_Sub1 class14_sub12_sub1_10_ = null;
			return class14_sub12_sub1_10_;
		}
		Track track = Track.method1451(aFileSystem_2010, i, i_7_);
		if (track == null) {
			class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		Class14_Sub12_Sub1 class14_sub12_sub1_11_ = track.method1449();
		aClass55_2015.put(l, class14_sub12_sub1_11_);
		if (is != null)
			is[0] -= class14_sub12_sub1_11_.aByteArray4899.length;
		class14_sub12_sub1 = class14_sub12_sub1_11_;
		return class14_sub12_sub1;
	}

	public Class14_Sub12_Sub1 method1617(int i, int i_12_, int[] is, int i_13_) {
		int i_14_ = i_13_ ^ (i << 4 & 0xfffc | i >>> 44);
		i_14_ |= i << 48;
		long l = 0x100000000L ^ i_14_;
		Class14_Sub12_Sub1 class14_sub12_sub1 = (Class14_Sub12_Sub1) aClass55_2015.get(l);
		if (class14_sub12_sub1 != null) {
			Class14_Sub12_Sub1 class14_sub12_sub1_15_ = class14_sub12_sub1;
			return class14_sub12_sub1_15_;
		}
		if (is != null && is[0] <= 0) {
			Class14_Sub12_Sub1 class14_sub12_sub1_16_ = null;
			return class14_sub12_sub1_16_;
		}
		Class14_Sub24 class14_sub24 = (Class14_Sub24) aClass55_2004.get(l);
		if (class14_sub24 == null) {
			class14_sub24 = Class14_Sub24.method910(aFileSystem_2003, i, i_13_);
			if (class14_sub24 == null) {
				Class14_Sub12_Sub1 class14_sub12_sub1_17_ = null;
				return class14_sub12_sub1_17_;
			}
			aClass55_2004.put(l, class14_sub24);
		}
		Class14_Sub12_Sub1 class14_sub12_sub1_18_ = class14_sub24.method904(is);
		if (class14_sub12_sub1_18_ == null)
			return null;
		class14_sub24.unlink();
		aClass55_2015.put(l, class14_sub12_sub1_18_);
		if (i_12_ != 7711) {
			class14_sub12_sub1 = null;
			return class14_sub12_sub1;
		}
		class14_sub12_sub1 = class14_sub12_sub1_18_;
		return class14_sub12_sub1;
	}

	public Class14_Sub12_Sub1 method1618(int[] is, int i_19_) {
		if (aFileSystem_2003.method155() == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1617(0, 7711, is, i_19_);
			return class14_sub12_sub1;
		}
		if (aFileSystem_2003.method177(i_19_) == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1617(i_19_, 7711, is, 0);
			return class14_sub12_sub1;
		}
		throw new RuntimeException();
	}

	public Class14_Sub12_Sub1 method1619(int[] is, int i_20_) {
		if (aFileSystem_2010.method155() == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1616(0, i_20_, is, true);
			return class14_sub12_sub1;
		}
		if (aFileSystem_2010.method177(i_20_) == 1) {
			Class14_Sub12_Sub1 class14_sub12_sub1 = method1616(i_20_, 0, is, true);
			return class14_sub12_sub1;
		}
		throw new RuntimeException();
	}
}
