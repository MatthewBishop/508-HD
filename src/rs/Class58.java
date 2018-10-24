/* Class58 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.security.MessageDigest;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class76;
import com.jagex.io.js5.Class9;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.AbstractSprite;
import com.jagex.sound.Track;

public class Class58 {
	public static int anInt937;
	public static Class124 aClass124_939 = Class124.method263(1178, "red:");
	public static Class124 aClass124_941 = Class124.method263(1178, "::errortest");
	public static Class124 aClass124_942 = aClass124_939;
	public static Class124 aClass124_943;
	public static Class76[] aClass76Array944 = new Class76[27];
	public static int anInt947;
	public static int anInt948;
	public static int anInt949;
	public static boolean[] aBooleanArray950;

	static {
		aClass124_943 = aClass124_939;
		anInt949 = 0;
		aBooleanArray950 = new boolean[200];
	}

	public static void method1255(int i, Class14_Sub3 class14_sub3, int i_0_, int i_1_, int i_2_, int i_3_) {
		if (class14_sub3.anInt2753 != -1 || class14_sub3.anIntArray2746 != null) {
			int i_4_ = 0;
			if (i_2_ != -31083)
				method1255(-118, null, 96, 63, 22, -74);
			if (i_3_ > class14_sub3.anInt2761)
				i_4_ += -class14_sub3.anInt2761 + i_3_;
			else if (i_3_ < class14_sub3.anInt2774)
				i_4_ += -i_3_ + class14_sub3.anInt2774;
			if (i_1_ > class14_sub3.anInt2751)
				i_4_ += -class14_sub3.anInt2751 + i_1_;
			else if (class14_sub3.anInt2767 > i_1_)
				i_4_ += class14_sub3.anInt2767 - i_1_;
			if (class14_sub3.anInt2765 == 0 || class14_sub3.anInt2765 < i_4_ - 64 || Static2.anInt1691 == 0
					|| class14_sub3.anInt2763 != i_0_) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
					class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				}
			} else {
				i_4_ -= 64;
				if (i_4_ < 0)
					i_4_ = 0;
				int i_5_ = (Static2.anInt1691 * (-i_4_ + class14_sub3.anInt2765) / class14_sub3.anInt2765);
				if (class14_sub3.aClass14_Sub9_Sub4_2775 == null) {
					if (class14_sub3.anInt2753 >= 0) {
						Track track = Track.method1451((Static2.aClass9_Sub1_2901), class14_sub3.anInt2753,
								0);
						if (track != null) {
							Class14_Sub12_Sub1 class14_sub12_sub1 = track.method1449()
									.method857(SceneCluster.aClass18_1362);
							Class14_Sub9_Sub4 class14_sub9_sub4 = (Class14_Sub9_Sub4.method775(class14_sub12_sub1, 100,
									i_5_));
							class14_sub9_sub4.method765(-1);
							Class33.aClass14_Sub9_Sub2_585.method735(class14_sub9_sub4);
							class14_sub3.aClass14_Sub9_Sub4_2775 = class14_sub9_sub4;
						}
					}
				} else
					class14_sub3.aClass14_Sub9_Sub4_2775.method768(i_5_);
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					class14_sub3.aClass14_Sub9_Sub4_2760.method768(i_5_);
					if (!class14_sub3.aClass14_Sub9_Sub4_2760.previousNotNull((byte) -109))
						class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				} else if (class14_sub3.anIntArray2746 != null && (class14_sub3.anInt2773 -= i) <= 0) {
					int i_6_ = (int) (class14_sub3.anIntArray2746.length * Math.random());
					Track track = Track.method1451(Static2.aClass9_Sub1_2901,
							class14_sub3.anIntArray2746[i_6_], 0);
					if (track != null) {
						Class14_Sub12_Sub1 class14_sub12_sub1 = track.method1449()
								.method857(SceneCluster.aClass18_1362);
						Class14_Sub9_Sub4 class14_sub9_sub4 = Class14_Sub9_Sub4.method775(class14_sub12_sub1, 100,
								i_5_);
						class14_sub9_sub4.method765(0);
						Class33.aClass14_Sub9_Sub2_585.method735(class14_sub9_sub4);
						class14_sub3.aClass14_Sub9_Sub4_2760 = class14_sub9_sub4;
						class14_sub3.anInt2773 = (int) ((class14_sub3.anInt2769 - class14_sub3.anInt2772)
								* Math.random()) + class14_sub3.anInt2772;
					}
				}
			}
		}
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
					Class124 class124_17_ = class124.method1697(0, i_15_, (byte) -104);
					Class124 class124_18_ = class124.method1696(i_15_ + 1, 15);
					MessageDigest messagedigest = MessageDigest.getInstance("SHA");
					messagedigest.reset();
					messagedigest.update(class124_17_.method1681(-128));
					is = messagedigest.digest();
					byte[] is_19_ = class124_18_.method1673(46);
					class14_sub10 = new Buffer(5000);
					class14_sub10.method807(is_19_.length, is_19_, 0, i ^ ~0x40294fcc);
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
		aClass76Array944 = null;
		aClass124_943 = null;
		aBooleanArray950 = null;
		if (i != 1)
			anInt948 = 118;
	}

	public static AbstractSprite method1259(int i, Class9 class9, int i_22_, int i_23_) {
		if (i >= -80)
			method1257(null, -79);
		if (!Static3.method1564(i_22_, i_23_, class9)) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		AbstractSprite class14_sub2_sub19 = Class67.method1302(false);
		return class14_sub2_sub19;
	}
}
