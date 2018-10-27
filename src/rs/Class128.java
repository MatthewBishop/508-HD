/* Class128 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Deque;

public class Class128 {
	public static Deque[][][] aClass2ArrayArrayArray2119 = new Deque[4][104][104];
	public static Class124 aClass124_2122;
	public static Class124 aClass124_2123 = Class124.method263("glow3:");
	public static Class124 aClass124_2126;
	public static Class124 aClass124_2128 = Class124.method263("p12_full");

	static {
		aClass124_2126 = aClass124_2123;
		aClass124_2122 = aClass124_2123;
	}

	public static boolean method1755(int i) {
		if (i != 130068615)
			method1755(-57);
		boolean bool = true;
		return bool;
	}

	public static void method1756(boolean bool) {
		if (!bool)
			aClass124_2128 = null;
		aClass2ArrayArrayArray2119 = null;
		aClass124_2128 = null;
		aClass124_2126 = null;
		aClass124_2122 = null;
		aClass124_2123 = null;
	}

	public static boolean method1757(int i, int i_0_, int i_1_, int i_2_, SceneGraphNode sceneGraphNode, int i_3_, long l, int i_4_,
			int i_5_, int i_6_, int i_7_) {
		if (sceneGraphNode == null)
			return true;
		return JunkTex.method580(i, i_4_, i_5_, i_6_ - i_4_ + 1, i_7_ - i_5_ + 1, i_0_, i_1_, i_2_, sceneGraphNode,
				i_3_, true, l);
	}

	public static int method1759(int i, byte i_10_) {
		double d = (i & 0xff) / 256.0;
		double d_11_ = ((i & 0xffe7f9) >> 48) / 256.0;
		double d_12_ = (i >> 8 & 0xff) / 256.0;
		if (i_10_ != 48) {
			int i_13_ = 42;
			return i_13_;
		}
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
}
