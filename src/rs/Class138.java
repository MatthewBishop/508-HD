/* Class138 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.util.RuntimeException_Sub1;
import com.jagex.util.Util;

public class Class138 {
	public static Class124 aClass124_2207 = Class124.method263(1178, "(U3");
	public int anInt2208;
	public int anInt2209;
	public static int anInt2210;
	public static int anInt2214;
	public static Class124 aClass124_2215 = Class124.method263(1178, "Angreifen");
	public int anInt2217;
	public static Class124 aClass124_2218;
	public static Class124 aClass124_2219;
	public static float aFloat2220;
	public static Class9_Sub1 aClass9_Sub1_2222;
	public static int[] anIntArray2224;
	public static Class124 aClass124_2226;
	public static Class124 aClass124_2227;

	static {
		anInt2210 = 0;
		anInt2214 = -1;
		
		aClass124_2227 = Class124.method263(1178, "Ausw-=hlen");
		aClass124_2218 = Class124.method263(1178, "Please remove ");
		anIntArray2224 = new int[128];
		aClass124_2219 = aClass124_2218;
		aClass124_2226 = aClass124_2218;
	}

	public static void method1944(boolean bool) {
		JunkTex.anInt4255 = 0;
		Class64.anInt1012 = 0;
		Static2.method378((byte) -51);
		Canvas_Sub2.method63((byte) -110);
		JunkTex.method615(300);
		for (int i = 0; i < JunkTex.anInt4255; i++) {
			int i_0_ = Class36.anIntArray626[i];
			if (Class14_Sub2_Sub20.anInt4064 != Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_].anInt3447) {
				if (Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_].aClass12_4949.method212((byte) -128))
					Class37.method1112((Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_]), (byte) -26);
				Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_].aClass12_4949 = null;
				Class14_Sub4.aClass133_Sub1_Sub2Array2785[i_0_] = null;
			}
		}
		if (JunkTex.aClass14_Sub10_Sub1_4734.position != JunkTex.anInt4280)
			throw new RuntimeException(
					new StringBuilder("gnp1 pos:").append(JunkTex.aClass14_Sub10_Sub1_4734.position)
							.append(" psize:").append(JunkTex.anInt4280).toString());
		for (int i = 0; JunkTex.anInt4306 > i; i++) {
			if ((Class14_Sub4.aClass133_Sub1_Sub2Array2785[JunkTex.anIntArray3965[i]]) == null)
				throw new RuntimeException(new StringBuilder("gnp2 pos:").append(i).append(" size:")
						.append(JunkTex.anInt4306).toString());
		}
		if (bool)
			aClass124_2207 = null;
	}

	public static void method1945(byte i, Buffer class14_sub10) {
		if (i == -102) {
			while (class14_sub10.payload.length > class14_sub10.position) {
				boolean bool = false;
				int i_1_ = 0;
				int i_2_ = 0;
				if (class14_sub10.readUByte() == 1) {
					bool = true;
					i_1_ = class14_sub10.readUByte();
					i_2_ = class14_sub10.readUByte();
				}
				int i_3_ = class14_sub10.readUByte();
				int i_4_ = class14_sub10.readUByte();
				int i_5_ = -Class65.anInt1034 + i_3_ * 64;
				int i_6_ = (-(i_4_ * 64) + Class35.anInt603 + (JunkTex.anInt4332 - 1));
				if (i_5_ >= 0 && i_6_ - 63 >= 0 && i_5_ + 63 < Static2.anInt3856
						&& i_6_ < JunkTex.anInt4332) {
					int i_7_ = i_5_ >> 38;
					int i_8_ = i_6_ >> 6;
					for (int i_9_ = 0; i_9_ < 64; i_9_++) {
						for (int i_10_ = 0; i_10_ < 64; i_10_++) {
							if (!bool || (i_9_ >= i_1_ * 8 && i_9_ < i_1_ * 8 + 8 && i_2_ * 8 <= i_10_
									&& i_2_ * 8 + 8 > i_10_)) {
								byte i_11_ = class14_sub10.method780();
								if (i_11_ != 0) {
									if ((JunkTex.aByteArrayArrayArray4257[i_7_][i_8_]) == null)
										JunkTex.aByteArrayArrayArray4257[i_7_][i_8_] = new byte[4096];
									JunkTex.aByteArrayArrayArray4257[i_7_][i_8_][i_9_
											+ (-i_10_ + 63 << 38)] = i_11_;
									byte i_12_ = class14_sub10.method780();
									if ((JunkTex.aByteArrayArrayArray4130[i_7_][i_8_]) == null)
										JunkTex.aByteArrayArrayArray4130[i_7_][i_8_] = new byte[4096];
									JunkTex.aByteArrayArrayArray4130[i_7_][i_8_][i_9_
											+ (63 - i_10_ << 38)] = i_12_;
								}
							}
						}
					}
				} else {
					for (int i_13_ = 0; (!bool ? 4096 : 64) > i_13_; i_13_++) {
						byte i_14_ = class14_sub10.method780();
						if (i_14_ != 0)
							class14_sub10.position++;
					}
				}
			}
		}
	}

	public static void method1946(int i) {
		if (i != 139)
			aClass124_2227 = null;
		if (Static2.aClass75_2588 != null)
			Static2.aClass75_2588.method1341(i ^ ~0xfb);
		if (JunkTex.aClass75_4682 != null)
			JunkTex.aClass75_4682.method1341(-50);
	}

	public static String method1947(int i, Throwable throwable) throws IOException {
		String string;
		if (!(throwable instanceof RuntimeException_Sub1))
			string = "";
		else {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			throwable = runtimeexception_sub1.aThrowable2461;
			string = new StringBuilder(runtimeexception_sub1.aString2457).append(" | ").toString();
		}
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_15_ = stringwriter.toString();
		if (i != 41)
			method1948(-37);
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_15_));
		String string_16_ = bufferedreader.readLine();
		for (;;) {
			String string_17_ = bufferedreader.readLine();
			if (string_17_ == null)
				break;
			int i_18_ = string_17_.indexOf('(');
			int i_19_ = string_17_.indexOf(')', i_18_ + 1);
			if (i_18_ >= 0 && i_19_ >= 0) {
				String string_20_ = string_17_.substring(i_18_ + 1, i_19_);
				int i_21_ = string_20_.indexOf(".java:");
				if (i_21_ >= 0) {
					string_20_ = new StringBuilder(string_20_.substring(0, i_21_))
							.append(string_20_.substring(i_21_ + 5)).toString();
					string = new StringBuilder(string).append(string_20_).append(' ').toString();
					continue;
				}
				string_17_ = string_17_.substring(0, i_18_);
			}
			string_17_ = string_17_.trim();
			string_17_ = string_17_.substring(string_17_.lastIndexOf(' ') + 1);
			string_17_ = string_17_.substring(string_17_.lastIndexOf('\t') + 1);
			string = new StringBuilder(string).append(string_17_).append(' ').toString();
		}
		string = new StringBuilder(string).append("| ").append(string_16_).toString();
		String string_22_ = string;
		return string_22_;
	}

	public static void method1948(int i) {
		aClass124_2207 = null;
		aClass124_2227 = null;
		aClass124_2219 = null;
		aClass124_2215 = null;
		aClass124_2218 = null;
		if (i < 19)
			method1950(-26, 122, 124, 44, null, 84);
		aClass124_2226 = null;
		anIntArray2224 = null;
		aClass9_Sub1_2222 = null;
	}

	public static Frame method1950(int i, int i_28_, int i_29_, int i_30_, Class43 class43, int i_31_) {
		if (!class43.method1146((byte) -89)) {
			Frame frame = null;
			return frame;
		}
		if (i_31_ == 0) {
			Class88[] class88s = Class14_Sub18.method884(-3189, class43);
			if (class88s == null) {
				Frame frame = null;
				return frame;
			}
			boolean bool = false;
			for (int i_32_ = 0; i_32_ < class88s.length; i_32_++) {
				if (class88s[i_32_].anInt1396 == i_30_ && class88s[i_32_].anInt1397 == i
						&& (i_29_ == 0 || i_29_ == class88s[i_32_].anInt1403)
						&& (!bool || i_31_ < class88s[i_32_].anInt1402)) {
					i_31_ = class88s[i_32_].anInt1402;
					bool = true;
				}
			}
			if (!bool) {
				Frame frame = null;
				return frame;
			}
		}
		Class31 class31 = class43.method1137(i, (byte) 112, i_31_, i_29_, i_30_);
		while (class31.anInt529 == 0)
			Util.accuratesleep(10L);
		Frame frame = (Frame) class31.anObject530;
		if (frame == null) {
			Frame frame_33_ = null;
			return frame_33_;
		}
		if (class31.anInt529 == 2) {
			Class14_Sub2_Sub4.method278(class43, frame, 121);
			Frame frame_34_ = null;
			return frame_34_;
		}
		if (i_28_ < 75)
			method1944(true);
		Frame frame_35_ = frame;
		return frame_35_;
	}
}
