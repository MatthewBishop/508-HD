/* Class9 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

import com.jagex.StringConstants;
import com.jagex.cache.fs.StaticFileSystem;
import com.jagex.io.Buffer;
import com.jagex.util.ArrayUtils;

import rs.Class124;

public abstract class FileSystem {
	public boolean aBoolean220;
	public boolean aBoolean244;
	public LookupTable aLookupTable_219;
	public LookupTable[] aLookupTableArray213;
	public int anInt211;
	public int anInt242;
	public int[] anIntArray194;
	public int[] anIntArray197;
	public int[] anIntArray202;
	public int[] anIntArray208;
	public int[] anIntArray223;
	public int[][] anIntArrayArray198;

	public int[][] anIntArrayArray218;

	public Object[] anObjectArray192;

	public Object[][] anObjectArrayArray237;

	public int[] groupFileCount;
	public static boolean aBoolean4245 = false;
	public static boolean aBoolean3499 = false;

	public FileSystem(boolean bool, boolean bool_107_) {
		aBoolean244 = bool_107_;
		aBoolean220 = bool;
	}

	public int getCompletion(int i_108_) {
		if (!method153(i_108_)) {
			int i_109_ = 0;
			return i_109_;
		}
		if (anObjectArray192[i_108_] != null) {
			int i_110_ = 100;
			return i_110_;
		}
		int i_111_ = 0;
		return i_111_;
	}

	public int method146(Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_0_ = aLookupTable_219.lookupIdentifier(class124.method1709(86));
		if (!method153(i_0_)) {
			int i_1_ = -1;
			return i_1_;
		}
		int i_2_ = i_0_;
		return i_2_;
	}

	public void method147(byte[] is) {
		anInt242 = Buffer.method1303(is, is.length);
		Buffer class14_sub10 = new Buffer(StaticFileSystem.unpackContainer(is));
		int i_3_ = class14_sub10.readUByte();
		if (i_3_ != 5 && i_3_ != 6)
			throw new RuntimeException(new StringBuilder("Incorrect JS5 protocol number: ").append(i_3_).toString());
		if (i_3_ >= 6)
			class14_sub10.getInt((byte) -102);
		int i_4_ = class14_sub10.readUByte();
		anInt211 = class14_sub10.readUShort();
		int i_5_ = 0;
		int i_6_ = -1;
		anIntArray223 = new int[anInt211];
		for (int i_7_ = 0; i_7_ < anInt211; i_7_++) {
			anIntArray223[i_7_] = i_5_ += class14_sub10.readUShort();
			if (i_6_ < anIntArray223[i_7_])
				i_6_ = anIntArray223[i_7_];
		}
		anIntArray194 = new int[i_6_ + 1];
		anIntArray202 = new int[i_6_ + 1];
		anObjectArray192 = new Object[i_6_ + 1];
		anIntArrayArray218 = new int[i_6_ + 1][];
		groupFileCount = new int[i_6_ + 1];
		anObjectArrayArray237 = new Object[i_6_ + 1][];
		anIntArray208 = new int[i_6_ + 1];
		if (i_4_ != 0) {
			anIntArray197 = new int[i_6_ + 1];
			for (int i_8_ = 0; i_8_ < i_6_ + 1; i_8_++)
				anIntArray197[i_8_] = -1;
			for (int i_9_ = 0; i_9_ < anInt211; i_9_++)
				anIntArray197[anIntArray223[i_9_]] = class14_sub10.getInt((byte) -121);
			aLookupTable_219 = new LookupTable(anIntArray197);
		}
		for (int i_10_ = 0; i_10_ < anInt211; i_10_++)
			anIntArray202[anIntArray223[i_10_]] = class14_sub10.getInt((byte) -108);
		for (int i_11_ = 0; anInt211 > i_11_; i_11_++)
			anIntArray194[anIntArray223[i_11_]] = class14_sub10.getInt((byte) -102);
		for (int i_12_ = 0; anInt211 > i_12_; i_12_++)
			groupFileCount[anIntArray223[i_12_]] = class14_sub10.readUShort();
		for (int i_13_ = 0; i_13_ < anInt211; i_13_++) {
			i_5_ = 0;
			int i_14_ = anIntArray223[i_13_];
			int i_15_ = groupFileCount[i_14_];
			int i_16_ = -1;
			anIntArrayArray218[i_14_] = new int[i_15_];
			for (int i_17_ = 0; i_15_ > i_17_; i_17_++) {
				int i_18_ = (anIntArrayArray218[i_14_][i_17_] = i_5_ += class14_sub10.readUShort());
				if (i_18_ > i_16_)
					i_16_ = i_18_;
			}
			anIntArray208[i_14_] = i_16_ + 1;
			if (i_16_ + 1 == i_15_)
				anIntArrayArray218[i_14_] = null;
		}
		if (i_4_ != 0) {
			aLookupTableArray213 = new LookupTable[i_6_ + 1];
			anIntArrayArray198 = new int[i_6_ + 1][];
			for (int i_19_ = 0; anInt211 > i_19_; i_19_++) {
				int i_20_ = anIntArray223[i_19_];
				int i_21_ = groupFileCount[i_20_];
				anIntArrayArray198[i_20_] = new int[anIntArray208[i_20_]];
				for (int i_22_ = 0; anIntArray208[i_20_] > i_22_; i_22_++)
					anIntArrayArray198[i_20_][i_22_] = -1;
				for (int i_23_ = 0; i_23_ < i_21_; i_23_++) {
					int i_24_;
					if (anIntArrayArray218[i_20_] != null)
						i_24_ = anIntArrayArray218[i_20_][i_23_];
					else
						i_24_ = i_23_;
					anIntArrayArray198[i_20_][i_24_] = class14_sub10.getInt((byte) -116);
				}
				aLookupTableArray213[i_20_] = new LookupTable(anIntArrayArray198[i_20_]);
			}
		}
	}

	public boolean method148(int i, int i_25_, int i_26_) {
		if (i_26_ < (i_25_ ^ 0xffffffff) || i < 0 || i_25_ >= anIntArray208.length || i >= anIntArray208[i_25_]) {
			if (FileSystem.aBoolean3499)
				throw new IllegalArgumentException(
						new StringBuilder(String.valueOf(i_25_)).append(",").append(i).toString());
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public byte[] method149(int i_27_, int[] is, int i_28_) {
		if (!method148(i_27_, i_28_, -1)) {
			byte[] is_29_ = null;
			return is_29_;
		}
		if (anObjectArrayArray237[i_28_] == null || anObjectArrayArray237[i_28_][i_27_] == null) {
			boolean bool = method156(i_28_, is);
			if (!bool) {
				method164(-128, i_28_);
				bool = method156(i_28_, is);
				if (!bool) {
					byte[] is_30_ = null;
					return is_30_;
				}
			}
		}
		byte[] is_31_ = FileSystem.method1282(anObjectArrayArray237[i_28_][i_27_], false);
		if (aBoolean244) {
			anObjectArrayArray237[i_28_][i_27_] = null;
			if (anIntArray208[i_28_] == 1)
				anObjectArrayArray237[i_28_] = null;
		}
		byte[] is_32_ = is_31_;
		return is_32_;
	}

	public int method151(Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_33_ = aLookupTable_219.lookupIdentifier(class124.method1709(108));
		int i_34_ = getCompletion(i_33_);
		return i_34_;
	}

	public void method152(int i) {
		for (int i_35_ = 0; i_35_ < anObjectArrayArray237.length; i_35_++)
			anObjectArrayArray237[i_35_] = null;
	}

	public boolean method153(int i) {
		if (i < 0 || anIntArray208.length <= i || anIntArray208[i] == 0) {
			if (!FileSystem.aBoolean3499) {
				boolean bool = false;
				return bool;
			}
			throw new IllegalArgumentException(Integer.toString(i));
		}
		return true;
	}

	public int method155() {
		int i_38_ = anIntArray208.length;
		return i_38_;
	}

	public boolean method156(int i_39_, int[] is) {
		if (!method153(i_39_)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArray192[i_39_] == null) {
			boolean bool = false;
			return bool;
		}
		int[] is_40_ = anIntArrayArray218[i_39_];
		int i_41_ = groupFileCount[i_39_];
		if (anObjectArrayArray237[i_39_] == null)
			anObjectArrayArray237[i_39_] = new Object[anIntArray208[i_39_]];
		Object[] objects = anObjectArrayArray237[i_39_];
		boolean bool = true;
		for (int i_43_ = 0; i_43_ < i_41_; i_43_++) {
			int i_44_;
			if (is_40_ != null)
				i_44_ = is_40_[i_43_];
			else
				i_44_ = i_43_;
			if (objects[i_44_] == null) {
				bool = false;
				break;
			}
		}
		if (bool) {
			boolean bool_45_ = true;
			return bool_45_;
		}
		byte[] is_46_;
		if (is == null || is[0] == 0 && is[1] == 0 && is[2] == 0 && is[3] == 0)
			is_46_ = FileSystem.method1282(anObjectArray192[i_39_], false);
		else {
			is_46_ = FileSystem.method1282(anObjectArray192[i_39_], true);
			Buffer class14_sub10 = new Buffer(is_46_);
			class14_sub10.method799(is, class14_sub10.payload.length, 14802, 5);
		}
		byte[] is_47_ = StaticFileSystem.unpackContainer(is_46_);
		if (aBoolean220)
			anObjectArray192[i_39_] = null;
		if (i_41_ > 1) {
			int i_48_ = is_47_.length;
			int[] is_49_ = new int[i_41_];
			int i_50_ = is_47_[--i_48_] & 0xff;
			i_48_ -= i_41_ * 4 * i_50_;
			Buffer class14_sub10 = new Buffer(is_47_);
			class14_sub10.position = i_48_;
			for (int i_51_ = 0; i_51_ < i_50_; i_51_++) {
				int i_52_ = 0;
				for (int i_53_ = 0; i_41_ > i_53_; i_53_++) {
					i_52_ += class14_sub10.getInt((byte) -122);
					is_49_[i_53_] += i_52_;
				}
			}
			byte[][] is_54_ = new byte[i_41_][];
			for (int i_55_ = 0; i_55_ < i_41_; i_55_++) {
				is_54_[i_55_] = new byte[is_49_[i_55_]];
				is_49_[i_55_] = 0;
			}
			int i_56_ = 0;
			class14_sub10.position = i_48_;
			for (int i_57_ = 0; i_50_ > i_57_; i_57_++) {
				int i_58_ = 0;
				for (int i_59_ = 0; i_59_ < i_41_; i_59_++) {
					i_58_ += class14_sub10.getInt((byte) -115);
					ArrayUtils.method1322(is_47_, i_56_, is_54_[i_59_], is_49_[i_59_], i_58_);
					i_56_ += i_58_;
					is_49_[i_59_] += i_58_;
				}
			}
			for (int i_60_ = 0; i_60_ < i_41_; i_60_++) {
				int i_61_;
				if (is_40_ != null)
					i_61_ = is_40_[i_60_];
				else
					i_61_ = i_60_;
				if (!aBoolean244)
					objects[i_61_] = FileSystem.wrapBuffer(false, is_54_[i_60_]);
				else
					objects[i_61_] = is_54_[i_60_];
			}
		} else {
			int i_62_;
			if (is_40_ != null)
				i_62_ = is_40_[0];
			else
				i_62_ = 0;
			if (aBoolean244)
				objects[i_62_] = is_47_;
			else
				objects[i_62_] = FileSystem.wrapBuffer(false, is_47_);
		}
		boolean bool_63_ = true;
		return bool_63_;
	}

	public byte[] method157(int i, int i_64_) {
		if (!method148(i, i_64_, -1)) {
			byte[] is = null;
			return is;
		}
		if (anObjectArrayArray237[i_64_] == null || anObjectArrayArray237[i_64_][i] == null) {
			boolean bool = method156(i_64_, null);
			if (!bool) {
				method164(77, i_64_);
				bool = method156(i_64_, null);
				if (!bool) {
					byte[] is = null;
					return is;
				}
			}
		}
		byte[] is = FileSystem.method1282(anObjectArrayArray237[i_64_][i], false);
		byte[] is_66_ = is;
		return is_66_;
	}

	public boolean method158(int i, int i_67_) {
		if (!method148(i, i_67_, -1)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArrayArray237[i_67_] != null && anObjectArrayArray237[i_67_][i] != null) {
			boolean bool = true;
			return bool;
		}
		if (anObjectArray192[i_67_] != null) {
			boolean bool = true;
			return bool;
		}
		method164(108, i_67_);
		if (anObjectArray192[i_67_] != null) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public boolean method159(Class124 class124, Class124 class124_70_) {
		class124_70_ = class124_70_.method1716((byte) 63);
		class124 = class124.method1716((byte) 63);
		int i_71_ = aLookupTable_219.lookupIdentifier(class124_70_.method1709(49));
		if (!method153(i_71_)) {
			boolean bool = false;
			return bool;
		}
		int i_72_ = aLookupTableArray213[i_71_].lookupIdentifier(class124.method1709(93));
		boolean bool = method158(i_72_, i_71_);
		return bool;
	}

	public boolean method160(Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_73_ = aLookupTable_219.lookupIdentifier(class124.method1709(111));
		boolean bool = method161(i_73_);
		return bool;
	}

	public boolean method161(int i_74_) {
		if (!method153(i_74_)) {
			boolean bool = false;
			return bool;
		}
		if (anObjectArray192[i_74_] != null) {
			boolean bool = true;
			return bool;
		}
		method164(116 - 243, i_74_);
		if (anObjectArray192[i_74_] != null) {
			boolean bool = true;
			return bool;
		}
		boolean bool = false;
		return bool;
	}

	public void method162(Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_75_ = aLookupTable_219.lookupIdentifier(class124.method1709(57));
		method174(i_75_);
	}

	public byte[] method163(int i, int i_76_) {
		byte[] is = method149(i, null, i_76_);
		return is;
	}

	public void method164(int i, int i_78_) {

	}

	public byte[] getFileSmart(int i_80_) {
		if (anIntArray208.length == 1) {
			byte[] is = method163(i_80_, 0);
			return is;
		}
		if (!method153(i_80_)) {
			byte[] is = null;
			return is;
		}
		if (anIntArray208[i_80_] == 1) {
			byte[] is = method163(0, i_80_);
			return is;
		}
		throw new RuntimeException();
	}

	public boolean method166(Class124 class124) {
		class124 = class124.method1716((byte) 63);
		int i_83_ = aLookupTable_219.lookupIdentifier(class124.method1709(108));
		if (i_83_ < 0) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	public byte[] method167(Class124 class124, Class124 class124_84_) {
		class124 = class124.method1716((byte) 63);
		class124_84_ = class124_84_.method1716((byte) 63);
		int i_86_ = aLookupTable_219.lookupIdentifier(class124.method1709(99));
		if (!method153(i_86_)) {
			byte[] is = null;
			return is;
		}
		int i_85_ = aLookupTableArray213[i_86_].lookupIdentifier(class124_84_.method1709(74));
		byte[] is = method163(i_85_, i_86_);
		return is;
	}

	public void method168(int i) {
		if (method153(i)) {
			anObjectArrayArray237[i] = null;
		}
	}

	public boolean method170() {
		boolean bool_88_ = true;
		for (int i = 0; i < anIntArray223.length; i++) {
			int i_89_ = anIntArray223[i];
			if (anObjectArray192[i_89_] == null) {
				method164(126, i_89_);
				if (anObjectArray192[i_89_] == null)
					bool_88_ = false;
			}
		}
		boolean bool_90_ = bool_88_;
		return bool_90_;
	}

	public boolean method171(int i_91_) {
		if (1 == anIntArray208.length) {
			boolean bool = method158(i_91_, 0);
			return bool;
		}
		if (!method153(i_91_)) {
			boolean bool = false;
			return bool;
		}
		if (anIntArray208[i_91_] == 1) {
			boolean bool = method158(0, i_91_);
			return bool;
		}
		throw new RuntimeException();
	}

	public int method173(int i) {
		int i_92_ = 0;
		int i_93_ = 0;
		for (int i_94_ = 0; anObjectArray192.length > i_94_; i_94_++) {
			if (groupFileCount[i_94_] > 0) {
				i_93_ += getCompletion(i_94_);
				i_92_ += 100;
			}
		}
		if (i_92_ == 0) {
			int i_95_ = 100;
			return i_95_;
		}
		int i_96_ = i_93_ * i / i_92_;
		int i_97_ = i_96_;
		return i_97_;
	}

	public void method174(int i_98_) {
		/* empty */
	}

	public void method175(boolean bool, boolean bool_99_) {
		if (bool_99_) {
			aLookupTable_219 = null;
			anIntArray197 = null;
		}
		if (bool) {
			anIntArrayArray198 = null;
			aLookupTableArray213 = null;
		}
	}

	public int[] method176(int i_100_) {
		if (!method153(i_100_)) {
			int[] is = null;
			return is;
		}
		int[] is = anIntArrayArray218[i_100_];
		if (is == null) {
			is = new int[groupFileCount[i_100_]];
			for (int i_101_ = 0; is.length > i_101_; i_101_++)
				is[i_101_] = i_101_;
		}
		int[] is_102_ = is;
		return is_102_;
	}

	public int method177(int i) {
		if (!method153(i)) {
			int i_105_ = 0;
			return i_105_;
		}
		int i_106_ = anIntArray208[i];
		return i_106_;
	}

	public static byte[] method616(byte[] is) {
		int i_1_ = is.length;
		byte[] is_2_ = new byte[i_1_];
		ArrayUtils.method1322(is, 0, is_2_, 0, i_1_);
		byte[] is_3_ = is_2_;
		return is_3_;
	}

	public static Object wrapBuffer(boolean booll, byte[] is) {
		if (is == null) {
			return null;
		}
		do {
			if (136 < is.length && !FileSystem.aBoolean4245) {
				DataWrapper class126;
				try {
					DataWrapper class126_1_ = ((DataWrapper) Class.forName(StringConstants.DATA_WRAPPER).newInstance());
					class126_1_.put(is);
					class126 = class126_1_;
				} catch (Throwable throwable) {
					Throwable throwable_2_ = new Throwable();
					FileSystem.aBoolean4245 = true;
					break;
				}
				return class126;
			}
		} while (false);
		return is;
	}

	public static byte[] method1282(Object object, boolean bool) {
		if (object == null) {
			byte[] is = null;
			return is;
		}
		if (object instanceof byte[]) {
			byte[] is = (byte[]) object;
			if (!bool) {
				byte[] is_7_ = is;
				return is_7_;
			}
			byte[] is_8_ = FileSystem.method616(is);
			return is_8_;
		}
		if (object instanceof DataWrapper) {
			DataWrapper class126 = (DataWrapper) object;
			byte[] is = class126.get();
			return is;
		}
		throw new IllegalArgumentException();
	}
}
