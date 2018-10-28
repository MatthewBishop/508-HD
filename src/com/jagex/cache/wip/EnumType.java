/* Class14_Sub2_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.wip;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.Cache;
import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.IntegerNode;
import com.jagex.sound.wip.DuplicateMethods;

import rs.Class124;
import rs.Class14_Sub30;

public class EnumType extends Cacheable {
	private static Class124 NULL = Class124.method263("null");
	private static Cache cache = new Cache(128);
	private static FileSystem aFileSystem_3817;
	
	public static void kill() {
		EnumType.aFileSystem_3817 = null;
		EnumType.cache = null;
		EnumType.NULL = null;
	}

	public static void setup(FileSystem fileSystem) {
		aFileSystem_3817 = fileSystem;
	}

	public static EnumType method1507(int i_0_) {
		EnumType class14_sub2_sub8 = ((EnumType) EnumType.cache.get(i_0_));
		if (class14_sub2_sub8 != null) {
			EnumType class14_sub2_sub8_1_ = class14_sub2_sub8;
			return class14_sub2_sub8_1_;
		}
		byte[] is = (EnumType.aFileSystem_3817.method163(i_0_ & 0xff, i_0_ >>> 8));
		EnumType class14_sub2_sub8_2_ = new EnumType();
		if (is != null)
			class14_sub2_sub8_2_.decode(new Buffer(is));
		EnumType.cache.put(class14_sub2_sub8_2_, i_0_);
		EnumType class14_sub2_sub8_3_ = class14_sub2_sub8_2_;
		return class14_sub2_sub8_3_;
	}

	public Class124 defaultString = EnumType.NULL;
	public HashTable params;
	public HashTable copyOfParams;

	public int anInt3845;
	public int anInt3851;

	public int defaultInteger;

	private void decode(Buffer class14_sub10) {
		for (;;) {
			int i = class14_sub10.readUByte();
			if (i == 0)
				break;
			decode(class14_sub10, i);
		}
	}

	private void method292() {
		copyOfParams = new HashTable(params.getBucketCount());
			for (IntegerNode class14_sub1 = (IntegerNode) params
					.getFirst(); class14_sub1 != null; class14_sub1 = (IntegerNode) params
							.getNext()) {
				IntegerNode class14_sub1_0_ = new IntegerNode((int) class14_sub1.key);
				copyOfParams.put(class14_sub1.value, class14_sub1_0_);
			}
	}

	public boolean method294(int i) {
		if (params == null) {
			boolean bool = false;
			return bool;
		}
		if (copyOfParams == null)
			method292();
		IntegerNode class14_sub1 = (IntegerNode) copyOfParams.get(i);
		if (class14_sub1 == null) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public Class124 getStringParamValue(int i_2_) {
		if (params == null) {
			Class124 class124 = defaultString;
			return class124;
		}
		Class14_Sub30 class14_sub30 = ((Class14_Sub30) params.get(i_2_));
		if (class14_sub30 == null) {
			Class124 class124 = defaultString;
			return class124;
		}
		Class124 class124 = class14_sub30.aClass124_3270;
		return class124;
	}

	public void decode(Buffer class14_sub10, int i_7_) {
		if (i_7_ == 1) {
			anInt3851 = class14_sub10.readUByte();
		} else if (i_7_ == 2) {
			anInt3845 = class14_sub10.readUByte();
		} else if (i_7_ == 3) {
			defaultString = class14_sub10.getJagexString();
		} else if (i_7_ == 4) {
			defaultInteger = class14_sub10.getInt((byte) -107);
		} else if (i_7_ == 5 || i_7_ == 6) {
			int i_8_ = class14_sub10.readUShort();
			params = new HashTable(DuplicateMethods.getFarestBitValue(i_8_));
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				int i_10_ = class14_sub10.getInt((byte) -115);
				Linkable linkable;
				if (i_7_ != 5)
					linkable = (new IntegerNode(class14_sub10.getInt((byte) -104)));
				else
					linkable = new Class14_Sub30(class14_sub10.getJagexString());
				params.put(i_10_, linkable);
			}
		}
	}

	public int getIntegerParamValue(int i_11_) {
		if (params == null) {
			int i_12_ = defaultInteger;
			return i_12_;
		}
		IntegerNode class14_sub1 = ((IntegerNode) params.get(i_11_));
		if (class14_sub1 == null) {
			int i_14_ = defaultInteger;
			return i_14_;
		}
		int i_15_ = class14_sub1.value;
		return i_15_;
	}

	private void copyParams() {
		copyOfParams = new HashTable(params.getBucketCount());
		for (Class14_Sub30 class14_sub30 = (Class14_Sub30) params
				.getFirst(); class14_sub30 != null; class14_sub30 = (Class14_Sub30) params
						.getNext()) {
			Class14_Sub11 class14_sub11 = new Class14_Sub11(class14_sub30.aClass124_3270, (int) class14_sub30.key);
			copyOfParams.put(class14_sub30.aClass124_3270.method1680(), class14_sub11);
		}
	}
	
	public boolean method300(Class124 class124) {
		if (params == null) {
			boolean bool = false;
			return bool;
		}
		if (copyOfParams == null)
			copyParams();
		for (Class14_Sub11 class14_sub11 = ((Class14_Sub11) copyOfParams.get(class124.method1680())); class14_sub11 != null; class14_sub11 = (Class14_Sub11) copyOfParams.getLastRetrieved()) {
			if (class14_sub11.aClass124_2940.method1704(class124))
				return true;
		}
		return false;
	}
}
