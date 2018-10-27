package com.jagex.cache.anim;

import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class AnimLoader {

	public static void method2000(FileSystem fileSystem, FileSystem fileSystem_4_, byte i, FileSystem fileSystem_5_) {
		AnimLoader.aFileSystem_579 = fileSystem_4_;
		AnimLoader.aFileSystem_3427 = fileSystem;
		AnimLoader.aFileSystem_4935 = fileSystem_5_;
	}

	private static FileSystem aFileSystem_579;
	private static FileSystem aFileSystem_3427;
	private static FileSystem aFileSystem_4935;
	
	public static Animation method1129(int i) {
		Animation animation = (Animation) AnimLoader.sequenceCache.get(i);
		if (animation != null) {
			Animation class46_1_ = animation;
			return class46_1_;
		}
		byte[] is = aFileSystem_579.method163(AnimLoader.method1103(i), AnimLoader.method896(i));
		Animation class46_2_ = new Animation();
		if (is != null)
			class46_2_.decode(new Buffer(is));
		class46_2_.method1171(86);
		AnimLoader.sequenceCache.put(class46_2_, i);
		Animation class46_4_ = class46_2_;
		return class46_4_;
	}

	public static AnimFrameLoader method457(int i_76_) {
		AnimFrameLoader class14_sub2_sub15 = ((AnimFrameLoader) AnimLoader.animationCache
				.get(i_76_));
		if (class14_sub2_sub15 != null) {
			AnimFrameLoader class14_sub2_sub15_77_ = class14_sub2_sub15;
			return class14_sub2_sub15_77_;
		}
		class14_sub2_sub15 = AnimFrameLoader.method933(aFileSystem_4935, aFileSystem_3427, i_76_,
				(byte) -101, false);
		if (class14_sub2_sub15 != null)
			AnimLoader.animationCache.put(class14_sub2_sub15, i_76_);
		AnimFrameLoader class14_sub2_sub15_78_ = class14_sub2_sub15;
		return class14_sub2_sub15_78_;
	}

	private static SoftCache animationCache = new SoftCache(100);
	private static SoftCache sequenceCache = new SoftCache(64);

	public static void method1130(int i, int i_5_) {
		sequenceCache.method1208(i);
		animationCache.method1208(i);
	}

	public static void method1598(int i) {
		sequenceCache.clearSoftReference();
		animationCache.clearSoftReference();
	}

	public static void resetSequence() {
		sequenceCache.clear();
		animationCache.clear();
	}

	private static int method896(int i_5_) {
		return i_5_ >>> 7;
	}

	private static int method1103(int var1) {
		return var1 & 127;
	}

	public static void kill() {
		AnimLoader.animationCache = null;
		AnimLoader.aFileSystem_3427 = null;
		AnimLoader.aFileSystem_4935 = null;
		AnimLoader.aFileSystem_579 = null;
		AnimLoader.sequenceCache = null;
	}
}
