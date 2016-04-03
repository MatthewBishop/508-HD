/* AnimFrame - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.cache.anim;

import com.jagex.io.Buffer;

public class AnimFrame {
	private static short[] translationIndices_ = new short[500];
	private static short[] transformX_ = new short[500];
	private static short[] transformZ_ = new short[500];
	private static short[] transformY_ = new short[500];
	private static short[] aShortArray2341 = new short[500];

	public static void dispose() {
		translationIndices_ = null;
		transformX_ = null;
		transformY_ = null;
		transformZ_ = null;
		aShortArray2341 = null;
	}
	
	public boolean opaque = false;
	public AnimFrameBase base;
	public int transformationCount;
	public short[] transformX;
	public short[] transformZ;
	public short[] transformationIndices;

	public short[] aShortArray2338;

	public short[] transformY;

	public AnimFrame(byte[] is, AnimFrameBase animframebase) {
		base = null;
		transformationCount = -1;
		base = animframebase;
		Buffer class14_sub10 = new Buffer(is);
		Buffer class14_sub10_0_ = new Buffer(is);
		class14_sub10.position = 2;
		int i = class14_sub10.readUByte();
		int i_1_ = 0;
		int i_2_ = -1;
		int i_3_ = -1;
		class14_sub10_0_.position = class14_sub10.position + i;
		for (int i_4_ = 0; i_4_ < i; i_4_++) {
			if (base.transformationType[i_4_] == 0)
				i_2_ = i_4_;
			int i_5_ = class14_sub10.readUByte();
			if (i_5_ > 0) {
				if (base.transformationType[i_4_] == 0)
					i_3_ = i_4_;
				translationIndices_[i_1_] = (short) i_4_;
				short i_6_ = 0;
				if (base.transformationType[i_4_] == 3)
					i_6_ = (short) 128;
				if ((i_5_ & 0x1) != 0)
					transformX_[i_1_] = (short) class14_sub10_0_.readSmart();
				else
					transformX_[i_1_] = i_6_;
				if ((i_5_ & 0x2) != 0)
					transformY_[i_1_] = (short) class14_sub10_0_.readSmart();
				else
					transformY_[i_1_] = i_6_;
				if ((i_5_ & 0x4) != 0)
					transformZ_[i_1_] = (short) class14_sub10_0_.readSmart();
				else
					transformZ_[i_1_] = i_6_;
				if (base.transformationType[i_4_] == 2) {
					transformX_[i_1_] = (short) (((transformX_[i_1_] & 0xff) << 3)
							+ (transformX_[i_1_] >> 8 & 0x7));
					transformY_[i_1_] = (short) (((transformY_[i_1_] & 0xff) << 3)
							+ (transformY_[i_1_] >> 8 & 0x7));
					transformZ_[i_1_] = (short) (((transformZ_[i_1_] & 0xff) << 3)
							+ (transformZ_[i_1_] >> 8 & 0x7));
				}
				aShortArray2341[i_1_] = (short) -1;
				if (base.transformationType[i_4_] >= 1 && base.transformationType[i_4_] <= 3
						&& i_2_ > i_3_) {
					aShortArray2341[i_1_] = (short) i_2_;
					i_3_ = i_2_;
				}
				i_1_++;
				if (base.transformationType[i_4_] == 5)
					opaque = true;
			}
		}
		if (class14_sub10_0_.position != is.length)
			throw new RuntimeException();
		transformationCount = i_1_;
		transformationIndices = new short[i_1_];
		transformX = new short[i_1_];
		transformY = new short[i_1_];
		transformZ = new short[i_1_];
		aShortArray2338 = new short[i_1_];
		for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
			transformationIndices[i_7_] = translationIndices_[i_7_];
			transformX[i_7_] = transformX_[i_7_];
			transformY[i_7_] = transformY_[i_7_];
			transformZ[i_7_] = transformZ_[i_7_];
			aShortArray2338[i_7_] = aShortArray2341[i_7_];
		}
	}
}
