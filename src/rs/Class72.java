/* Class72 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class72 {
	public static void method1319(short[] is, int i, short[] is_0_, int i_1_, int i_2_) {
		if (is == is_0_) {
			if (i == i_1_)
				return;
			if (i_1_ > i && i_1_ < i + i_2_) {
				i_2_--;
				i += i_2_;
				i_1_ += i_2_;
				i_2_ = i - i_2_;
				i_2_ += 7;
				while (i >= i_2_) {
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
					is_0_[i_1_--] = is[i--];
				}
				i_2_ -= 7;
				while (i >= i_2_)
					is_0_[i_1_--] = is[i--];
				return;
			}
		}
		i_2_ += i;
		i_2_ -= 7;
		while (i < i_2_) {
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
			is_0_[i_1_++] = is[i++];
		}
		i_2_ += 7;
		while (i < i_2_)
			is_0_[i_1_++] = is[i++];
	}

	public static void method1320(Object[] objects, int i, Object[] objects_3_, int i_4_, int i_5_) {
		if (objects == objects_3_) {
			if (i == i_4_)
				return;
			if (i_4_ > i && i_4_ < i + i_5_) {
				i_5_--;
				i += i_5_;
				i_4_ += i_5_;
				i_5_ = i - i_5_;
				i_5_ += 7;
				while (i >= i_5_) {
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
					objects_3_[i_4_--] = objects[i--];
				}
				i_5_ -= 7;
				while (i >= i_5_)
					objects_3_[i_4_--] = objects[i--];
				return;
			}
		}
		i_5_ += i;
		i_5_ -= 7;
		while (i < i_5_) {
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
			objects_3_[i_4_++] = objects[i++];
		}
		i_5_ += 7;
		while (i < i_5_)
			objects_3_[i_4_++] = objects[i++];
	}

	public static void method1321(int[] is, int i, int i_6_) {
		i_6_ = i + i_6_ - 7;
		while (i < i_6_) {
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
			is[i++] = 0;
		}
		i_6_ += 7;
		while (i < i_6_)
			is[i++] = 0;
	}

	public static void method1322(byte[] is, int i, byte[] is_7_, int i_8_, int i_9_) {
		if (is == is_7_) {
			if (i == i_8_)
				return;
			if (i_8_ > i && i_8_ < i + i_9_) {
				i_9_--;
				i += i_9_;
				i_8_ += i_9_;
				i_9_ = i - i_9_;
				i_9_ += 7;
				while (i >= i_9_) {
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
					is_7_[i_8_--] = is[i--];
				}
				i_9_ -= 7;
				while (i >= i_9_)
					is_7_[i_8_--] = is[i--];
				return;
			}
		}
		i_9_ += i;
		i_9_ -= 7;
		while (i < i_9_) {
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
			is_7_[i_8_++] = is[i++];
		}
		i_9_ += 7;
		while (i < i_9_)
			is_7_[i_8_++] = is[i++];
	}

	public static void method1323(float[] fs, int i, float[] fs_10_, int i_11_, int i_12_) {
		if (fs == fs_10_) {
			if (i == i_11_)
				return;
			if (i_11_ > i && i_11_ < i + i_12_) {
				i_12_--;
				i += i_12_;
				i_11_ += i_12_;
				i_12_ = i - i_12_;
				i_12_ += 7;
				while (i >= i_12_) {
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
					fs_10_[i_11_--] = fs[i--];
				}
				i_12_ -= 7;
				while (i >= i_12_)
					fs_10_[i_11_--] = fs[i--];
				return;
			}
		}
		i_12_ += i;
		i_12_ -= 7;
		while (i < i_12_) {
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
			fs_10_[i_11_++] = fs[i++];
		}
		i_12_ += 7;
		while (i < i_12_)
			fs_10_[i_11_++] = fs[i++];
	}

	public static void method1324(int[] is, int i, int i_13_, int i_14_) {
		i_13_ = i + i_13_ - 7;
		while (i < i_13_) {
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
			is[i++] = i_14_;
		}
		i_13_ += 7;
		while (i < i_13_)
			is[i++] = i_14_;
	}

	public static void method1325(int[] is, int i, int[] is_15_, int i_16_, int i_17_) {
		if (is == is_15_) {
			if (i == i_16_)
				return;
			if (i_16_ > i && i_16_ < i + i_17_) {
				i_17_--;
				i += i_17_;
				i_16_ += i_17_;
				i_17_ = i - i_17_;
				i_17_ += 7;
				while (i >= i_17_) {
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
					is_15_[i_16_--] = is[i--];
				}
				i_17_ -= 7;
				while (i >= i_17_)
					is_15_[i_16_--] = is[i--];
				return;
			}
		}
		i_17_ += i;
		i_17_ -= 7;
		while (i < i_17_) {
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
			is_15_[i_16_++] = is[i++];
		}
		i_17_ += 7;
		while (i < i_17_)
			is_15_[i_16_++] = is[i++];
	}
}
