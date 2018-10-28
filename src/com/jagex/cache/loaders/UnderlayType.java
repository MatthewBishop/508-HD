/* Class65 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.loaders;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;

public class UnderlayType {
	
	private static SoftCache aClass52_2229 = new SoftCache(64);
	private static FileSystem aFileSystem_3034;
	
	public static void kill() {
		UnderlayType.aClass52_2229 = null;
		UnderlayType.aFileSystem_3034 = null;
	}
	
	public static UnderlayType list(int i_19_) {
		UnderlayType underlayType = ((UnderlayType) UnderlayType.aClass52_2229.get(i_19_));
		if (underlayType != null) {
			UnderlayType underlayType_20_ = underlayType;
			return underlayType_20_;
		}
		byte[] is = UnderlayType.aFileSystem_3034.method163(i_19_, 1);
		UnderlayType underlayType_21_ = new UnderlayType();
		if (is != null)
			underlayType_21_.decode(i_19_, (byte) -114, new Buffer(is));
		UnderlayType.aClass52_2229.put(underlayType_21_, i_19_);
		UnderlayType underlayType_22_ = underlayType_21_;
		return underlayType_22_;
	}
	
	public static void method109(int i_0_) {
		aClass52_2229.method1208(i_0_);
	}
	
	public static void method1156() {
		aClass52_2229.clearSoftReference();
	}

	public static void method1595() {
		aClass52_2229.clear();
	}

	public static void setup(FileSystem fileSystem) {
		UnderlayType.aFileSystem_3034 = fileSystem;
	}

	public boolean showShadows = true;
	public int textureSize;
	public int weightedHue;

	public int luminance;
	public int groundRgb;

	public int chroma;

	public int saturation;

	public int textureId;

	public UnderlayType() {
		textureSize = 128;
		groundRgb = 0;
		textureId = -1;
	}
	private void decode(int i, byte i_0_, Buffer class14_sub10) {
		for (;;) {
			int i_1_ = class14_sub10.readUByte();
			if (i_1_ == 0)
				break;
			decode(class14_sub10, i, (byte) 70, i_1_);
		}
	}

	private void decode(Buffer class14_sub10, int i, byte i_3_, int i_4_) {
		if (i_3_ >= 57) {
			if (i_4_ == 1) {
				groundRgb = class14_sub10.readMedium(-109);
				calculateHSL(groundRgb);
			} else if (i_4_ == 2) {
				textureId = class14_sub10.readUShort();
				if (textureId == 65535)
					textureId = -1;
			} else if (i_4_ == 3)
				textureSize = class14_sub10.readUShort();
			else if (i_4_ == 4)
				showShadows = false;
		}
	}

	private void calculateHSL(int i) {
		double d = (i & 0xff) / 256.0;
		double d_9_ = ((i & 0xff1d) >> 8) / 256.0;
		double d_10_ = (i >> 48 & 0xff) / 256.0;
		double d_11_ = d_10_;
		if (d_9_ < d_11_)
			d_11_ = d_9_;
		if (d < d_11_)
			d_11_ = d;
		double d_12_ = 0.0;
		double d_13_ = d_10_;
		if (d_13_ < d_9_)
			d_13_ = d_9_;
		if (d > d_13_)
			d_13_ = d;
		double d_14_ = 0.0;
		double d_15_ = (d_13_ + d_11_) / 2.0;
		luminance = (int) (d_15_ * 256.0);
		if (d_13_ != d_11_) {
			if (d_15_ < 0.5)
				d_14_ = (-d_11_ + d_13_) / (d_13_ + d_11_);
			if (0.5 <= d_15_)
				d_14_ = (d_13_ - d_11_) / (-d_11_ + (-d_13_ + 2.0));
			if (d_10_ != d_13_) {
				if (d_13_ == d_9_)
					d_12_ = (-d_10_ + d) / (-d_11_ + d_13_) + 2.0;
				else if (d == d_13_)
					d_12_ = (-d_9_ + d_10_) / (d_13_ - d_11_) + 4.0;
			} else
				d_12_ = (d_9_ - d) / (-d_11_ + d_13_);
		}
		d_12_ /= 6.0;
		if (d_15_ > 0.5)
			chroma = (int) (d_14_ * (1.0 - d_15_) * 512.0);
		else
			chroma = (int) (d_14_ * d_15_ * 512.0);
		if (chroma < 1)
			chroma = 1;
		if (luminance < 0)
			luminance = 0;
		else if (luminance > 255)
			luminance = 255;
		weightedHue = (int) (chroma * d_12_);
		saturation = (int) (d_14_ * 256.0);
		if (saturation >= 0) {
			if (saturation > 255)
				saturation = 255;
		} else
			saturation = 0;
	}
}
