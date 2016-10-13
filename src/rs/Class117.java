/* Class117 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class117 {
	public int[] anIntArray1935;
	public byte[] aByteArray1936;
	public int[][] anIntArrayArray1937 = new int[6][258];
	public int[] anIntArray1938;
	public int anInt1939;
	public int anInt1940;
	public static Class124 aClass124_1941;
	public int anInt1942;
	public int anInt1943;
	public int anInt1944;
	public static Class124 aClass124_1945;
	public int anInt1946;
	public int anInt1947;
	public static int anInt1948;
	public int anInt1949;
	public int anInt1950;
	public int anInt1951;
	public int anInt1953;
	public byte[] aByteArray1954;
	public int[][] anIntArrayArray1955;
	public int[][] anIntArrayArray1956;
	public boolean[] aBooleanArray1957;
	public byte[] aByteArray1959;
	public byte aByte1960;
	public static int[] anIntArray1961 = new int[5];
	public byte[] aByteArray1962;
	public int anInt1963;
	public int anInt1964;
	public boolean[] aBooleanArray1965;
	public byte[] aByteArray1966;
	public byte[][] aByteArrayArray1967;
	public int[] anIntArray1968;
	public int[] anIntArray1969;
	public int anInt1970;
	public byte[] aByteArray1971;
	public int anInt1972;

	static {
		aClass124_1945 = (Class14_Sub2_Sub2.method263(1178,
				"Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3"));
		aClass124_1941 = aClass124_1945;
	}

	public static void method1600(byte i) {
		aClass124_1941 = null;
		aClass124_1945 = null;
		if (i == 113)
			anIntArray1961 = null;
	}

	public static int method1601(Class124 class124, int i) {
		if (i != 6)
			method1602(null, (byte) -19, null);
		if (class124 == null) {
			int i_0_ = -1;
			return i_0_;
		}
		for (int i_1_ = 0; Static2.anInt3728 > i_1_; i_1_++) {
			if (class124.method1717(40, Static2.aClass124Array2938[i_1_]))
				return i_1_;
		}
		return -1;
	}

	public static void method1602(int[] is, byte i, long[] ls) {
		int i_2_ = 27 / ((-66 - i) / 47);
		JunkTex.method587(ls, ls.length - 1, is, false, 0);
	}

	public Class117() {
		aByteArray1936 = new byte[18002];
		anIntArray1935 = new int[256];
		anIntArray1938 = new int[257];
		anIntArrayArray1956 = new int[6][258];
		anInt1950 = 0;
		aBooleanArray1965 = new boolean[256];
		aByteArray1962 = new byte[18002];
		aByteArrayArray1967 = new byte[6][258];
		aBooleanArray1957 = new boolean[16];
		anInt1944 = 0;
		aByteArray1966 = new byte[4096];
		aByteArray1959 = new byte[256];
		anIntArrayArray1955 = new int[6][258];
		anIntArray1969 = new int[6];
		anIntArray1968 = new int[16];
	}
}
