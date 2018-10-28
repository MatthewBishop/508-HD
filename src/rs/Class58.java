/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.security.MessageDigest;

import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.io.js5.SeekableFile;
import com.jagex.rt4.AbstractSprite;

public class Class58 {
	public static int anInt937;
	public static Class124 aClass124_939 = Class124.method263("red:");
	public static Class124 aClass124_941 = Class124.method263("::errortest");
	public static Class124 aClass124_942 = aClass124_939;
	public static Class124 aClass124_943;
	public static SeekableFile[] aSeekableFileArray944 = new SeekableFile[27];
	public static int anInt947;
	public static int viewportTop;
	public static int anInt949;
	public static boolean[] aBooleanArray950;

	static {
		aClass124_943 = aClass124_939;
		anInt949 = 0;
		aBooleanArray950 = new boolean[200];
	}

	public static Class124 method1256(int i, boolean bool, long l, int i_7_) {
		if (i_7_ < 2 || i_7_ > 36)
			throw new IllegalArgumentException(new StringBuilder("Invalid radix:").append(i_7_).toString());
		long l_8_ = l / i_7_;
		int i_9_ = 1;
		while (0L != l_8_) {
			l_8_ /= i_7_;
			i_9_++;
		}
		int i_10_ = i_9_;
		if (0L > l || bool)
			i_10_++;
		byte[] is = new byte[i_10_];
		if (0L > l)
			is[0] = (byte) 45;
		else if (bool)
			is[0] = (byte) 43;
		int i_11_ = -84 % ((i + 54) / 46);
		for (int i_12_ = 0; i_9_ > i_12_; i_12_++) {
			int i_13_ = (int) (l % i_7_);
			if (i_13_ < 0)
				i_13_ = -i_13_;
			l /= i_7_;
			if (i_13_ > 9)
				i_13_ += 39;
			is[i_10_ - i_12_ - 1] = (byte) (i_13_ + 48);
		}
		Class124 class124 = new Class124();
		class124.aByteArray2495 = is;
		class124.anInt2507 = i_10_;
		Class124 class124_14_ = class124;
		return class124_14_;
	}

	public static boolean method1257(Class124 class124, int i) {
		while_320_: do {
			int i_15_;
			do {
				boolean bool;
				try {
					i_15_ = class124.method1711(44, (byte) 89);
					if (i_15_ != -1)
						break;
					boolean bool_16_ = false;
					bool = bool_16_;
				} catch (Exception exception) {
					break while_320_;
				}
				return bool;
			} while (false);
			byte[] is;
			Buffer class14_sub10;
			do {
				boolean bool;
				try {
					Class124 class124_17_ = class124.substring(0, i_15_, (byte) -104);
					Class124 class124_18_ = class124.method1696(i_15_ + 1, 15);
					MessageDigest messagedigest = MessageDigest.getInstance("SHA");
					messagedigest.reset();
					messagedigest.update(class124_17_.method1681(-128));
					is = messagedigest.digest();
					byte[] is_19_ = class124_18_.method1673(46);
					class14_sub10 = new Buffer(5000);
					class14_sub10.method807(is_19_.length, is_19_, 0);
					class14_sub10.position = 0;
					class14_sub10.method816((Static2.aBigInteger5086), Class110.aBigInteger1852, false);
					if (class14_sub10.payload[0] == 1)
						break;
					boolean bool_20_ = false;
					bool = bool_20_;
				} catch (Exception exception) {
					break while_320_;
				}
				return bool;
			} while (false);
			int i_21_;
			try {
				if (i != 28883)
					method1258(-38);
				i_21_ = 0;
			} catch (Exception exception) {
				break;
			}
			for (;;) {
				if (i_21_ >= 20)
					return true;
				if (is[i_21_] != class14_sub10.payload[i_21_ + 1])
					return false;
				try {
					i_21_++;
				} catch (Exception exception) {
					break;
				}
			}
		} while (false);
		new Throwable();
		return false;
	}

	public static void method1258(int i) {
		aClass124_941 = null;
		aClass124_942 = null;
		aClass124_939 = null;
		aSeekableFileArray944 = null;
		aClass124_943 = null;
		aBooleanArray950 = null;
		if (i != 1)
			viewportTop = 118;
	}

	public static AbstractSprite method1259(int i, FileSystem fileSystem, int i_22_, int i_23_) {
		if (i >= -80)
			method1257(null, -79);
		if (!Static3.method1564(i_22_, i_23_, fileSystem)) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		AbstractSprite class14_sub2_sub19 = Class67.method1302(false);
		return class14_sub2_sub19;
	}
}
