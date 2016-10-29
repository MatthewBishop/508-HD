/* Class104 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Random;

import com.jagex.io.Buffer;
import com.jagex.util.TimeUtil;

public class Class104 {
	public static Class124 aClass124_1736;
	public static Class124 aClass124_1739 = Class124.method263(1178, " ");
	public static Class124 aClass124_1743;
	public static Class124 aClass124_1748;
	public static Class124 aClass124_1749;
	public static Class124 aClass124_1750;
	public static int[] anIntArray1737;
	public static Random aRandom1732 = new Random();
	static {
		aClass124_1736 = aClass124_1739;
		aClass124_1749 = Class124.method263(1178, "yellow:");
		aClass124_1748 = aClass124_1749;
		aClass124_1743 = aClass124_1749;
		aClass124_1750 = Class124.method263(1178, "<col=80ff00>");
	}
	public static Class124 method1532(int i, int i_0_) {
		if (i != 4)
			aClass124_1739 = null;
		if (i_0_ < 999999999) {
			Class124 class124 = Class83.method1407(75, i_0_);
			return class124;
		}
		Class124 class124 = Class79.aClass124_1265;
		return class124;
	}
	public static int method1534(int i, int i_4_) {
		Class51 class51 = Class47.method1187(i, true);
		int i_5_ = class51.anInt842;
		if (i_4_ < 77) {
			int i_6_ = 63;
			return i_6_;
		}
		int i_7_ = class51.anInt832;
		int i_8_ = class51.anInt834;
		int i_9_ = Class1.anIntArray69[i_8_ - i_7_];
		int i_10_ = i_9_ & JunkTex.anIntArray4275[i_5_] >> i_7_;
		return i_10_;
	}
	public static void method1535(byte i) {
		aClass124_1739 = null;
		aClass124_1736 = null;
		aRandom1732 = null;
		aClass124_1743 = null;
		int i_11_ = -58 % ((i + 43) / 41);
		aClass124_1749 = null;
		aClass124_1748 = null;
		aClass124_1750 = null;
		anIntArray1737 = null;
	}
	public byte[] aByteArray1744 = new byte[4];
	public byte[] aByteArray1747;
	public Class31 aClass31_1735;
	public DataInputStream aDataInputStream1733;

	public long aLong1740;

	public int anInt1734;

	public int anInt1746;

	public int anInt1751;

	public Class104(Class43 class43, URL url) {
		aClass31_1735 = class43.method1147((byte) -109, url);
		anInt1734 = 0;
		aLong1740 = TimeUtil.getTime() - -30000L;
	}

	public byte[] method1533(byte i) throws IOException {
		if (aLong1740 < TimeUtil.getTime())
			throw new IOException("fdt");
		if (i != 81) {
			byte[] is = null;
			return is;
		}
		if (anInt1734 == 0) {
			if (aClass31_1735.anInt529 == 2)
				throw new IOException("fds");
			if (aClass31_1735.anInt529 == 1) {
				aDataInputStream1733 = (DataInputStream) aClass31_1735.anObject530;
				anInt1734 = 1;
			}
		}
		if (anInt1734 == 1) {
			int i_1_ = aDataInputStream1733.available();
			if (i_1_ > 0) {
				if (i_1_ + anInt1751 > 4)
					i_1_ = -anInt1751 + 4;
				anInt1751 += aDataInputStream1733.read(aByteArray1744, anInt1751, i_1_);
				if (anInt1751 == 4) {
					int i_2_ = new Buffer(aByteArray1744).getInt((byte) -92);
					anInt1734 = 2;
					aByteArray1747 = new byte[i_2_];
				}
			}
		}
		if (anInt1734 == 2) {
			int i_3_ = aDataInputStream1733.available();
			if (i_3_ > 0) {
				if (aByteArray1747.length < i_3_ + anInt1746)
					i_3_ = -anInt1746 + aByteArray1747.length;
				anInt1746 += aDataInputStream1733.read(aByteArray1747, anInt1746, i_3_);
				if (anInt1746 == aByteArray1747.length) {
					byte[] is = aByteArray1747;
					return is;
				}
			}
		}
		byte[] is = null;
		return is;
	}
}
