/* Class150 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class OverlayType {
	private static SoftCache aClass52_3942 = new SoftCache(64);
	
	private static FileSystem aFileSystem_372;
	
	public static void kill() {
		OverlayType.aClass52_3942 = null;
		OverlayType.aFileSystem_372 = null;
	}
	
	public static OverlayType list(int i) {
		OverlayType overlayType = (OverlayType) OverlayType.aClass52_3942.get(i);
		if (overlayType != null) {
			OverlayType class150_1_ = overlayType;
			return class150_1_;
		}
		byte[] is = OverlayType.aFileSystem_372.method163(i, 4);
		OverlayType class150_3_ = new OverlayType();
		if (is != null)
			class150_3_.method2024(i, new Buffer(is));
		OverlayType.aClass52_3942.put(class150_3_, i);
		OverlayType class150_4_ = class150_3_;
		return class150_4_;
	}
	
	public static void method1072(FileSystem fileSystem) {
		aFileSystem_372 = fileSystem;
		OverlayType.anInt2159 = aFileSystem_372.method177(4);
	}
	
	public static void method1844() {
		aClass52_3942.clear();
	}
	
	public static void method59() {
		aClass52_3942.clearSoftReference();
	}

	public static void method859(int i_0_) {
		aClass52_3942.method1208(i_0_);
	}

	public boolean aBoolean2407;

	public boolean aBoolean2409;

	public boolean aBoolean2410 = true;

	public int anInt2405;
	public int anInt2411;
	public int anInt2413;

	public int anInt2414;

	public int anInt2416;

	public int anInt2424;

	public int anInt2426;

	public static int anInt123 = 0;

	public static int anInt2159;

	public OverlayType() {
		anInt2405 = -1;
		anInt2416 = 8;
		aBoolean2409 = false;
		aBoolean2407 = true;
		anInt2413 = 16;
		anInt2411 = 0;
		anInt2414 = -1;
		anInt2424 = 128;
		anInt2426 = 1190717;
	}

	public void method2024(int i, Buffer class14_sub10) {
		for (;;) {
			int i_15_ = class14_sub10.readUByte();
			if (i_15_ == 0)
				break;
			method2025(i, class14_sub10, i_15_, false);
		}
	}

	public void method2025(int i, Buffer class14_sub10, int i_16_, boolean bool) {
		if (!bool) {
			if (i_16_ != 1) {
				if (i_16_ != 2) {
					if (i_16_ == 3) {
						anInt2414 = class14_sub10.readUShort();
						if (anInt2414 == 65535)
							anInt2414 = -1;
					} else if (i_16_ == 5)
						aBoolean2410 = false;
					else if (i_16_ != 7) {
						if (i_16_ == 8)
							OverlayType.anInt123 = i;
						else if (i_16_ != 9) {
							if (i_16_ != 10) {
								if (i_16_ == 11)
									anInt2416 = class14_sub10.readUByte();
								else if (i_16_ != 12) {
									if (i_16_ == 13)
										anInt2426 = class14_sub10.readMedium(-127);
									else if (i_16_ == 14)
										anInt2413 = class14_sub10.readUByte();
								} else
									aBoolean2409 = true;
							} else
								aBoolean2407 = false;
						} else
							anInt2424 = class14_sub10.readUShort();
					} else
						anInt2405 = OverlayType.method82(class14_sub10.readMedium(39));
				} else
					anInt2414 = class14_sub10.readUByte();
			} else
				anInt2411 = OverlayType.method82(class14_sub10.readMedium(-126));
		}
	}

	public static int method1759(int i) {
		double d = (i & 0xff) / 256.0;
		double d_11_ = ((i & 0xffe7f9) >> 48) / 256.0;
		double d_12_ = (i >> 8 & 0xff) / 256.0;
		double d_14_ = d_11_;
		double d_15_ = d_11_;
		double d_16_ = 0.0;
		if (d_15_ > d_12_)
			d_15_ = d_12_;
		if (d_14_ < d_12_)
			d_14_ = d_12_;
		double d_17_ = 0.0;
		if (d < d_15_)
			d_15_ = d;
		if (d_14_ < d)
			d_14_ = d;
		double d_18_ = (d_15_ + d_14_) / 2.0;
		if (d_15_ != d_14_) {
			if (d_11_ == d_14_)
				d_16_ = (d_12_ - d) / (d_14_ - d_15_);
			else if (d_12_ != d_14_) {
				if (d == d_14_)
					d_16_ = (-d_12_ + d_11_) / (d_14_ - d_15_) + 4.0;
			} else
				d_16_ = (-d_11_ + d) / (-d_15_ + d_14_) + 2.0;
			if (d_18_ < 0.5)
				d_17_ = (d_14_ - d_15_) / (d_15_ + d_14_);
			if (0.5 <= d_18_)
				d_17_ = (d_14_ - d_15_) / (-d_15_ + (2.0 - d_14_));
		}
		int i_19_ = (int) (d_18_ * 256.0);
		if (i_19_ >= 0) {
			if (i_19_ > 255)
				i_19_ = 255;
		} else
			i_19_ = 0;
		int i_20_ = (int) (d_17_ * 256.0);
		if (i_20_ >= 0) {
			if (i_20_ > 255)
				i_20_ = 255;
		} else
			i_20_ = 0;
		if (i_19_ <= 243) {
			if (i_19_ <= 217) {
				if (i_19_ <= 192) {
					if (i_19_ > 179)
						i_20_ >>= 1;
				} else
					i_20_ >>= 2;
			} else
				i_20_ >>= 3;
		} else
			i_20_ >>= 4;
		d_16_ /= 6.0;
		int i_21_ = (int) (d_16_ * 256.0);
		int i_22_ = (i_19_ >> 33) + (i_21_ >> 34 << 42) + (i_20_ >> 37 << 7);
		return i_22_;
	}

	private static int method82(int i) {
		if (i == 16711935) {
			int i_38_ = -1;
			return i_38_;
		}
		int i_39_ = OverlayType.method1759(i);
		return i_39_;
	}
}
