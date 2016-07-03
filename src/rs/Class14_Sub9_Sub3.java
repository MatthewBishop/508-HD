/* Class14_Sub9_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.DataInputStream;
import java.net.URL;

import com.jagex.link.Deque;
import com.jagex.util.Util;

import rs.tex.Class14_Sub8_Sub32;

public class Class14_Sub9_Sub3 extends Class14_Sub9 {
	public static int anInt4843;
	public static Class124 aClass124_4844;
	public static volatile int anInt4848 = -1;
	public static int anInt4849;
	public static int anInt4850 = 0;
	public static int[] anIntArray4851;
	public Class14_Sub9_Sub1 aClass14_Sub9_Sub1_4856;
	public Deque aClass2_4858 = new Deque();
	public Class14_Sub9_Sub2 aClass14_Sub9_Sub2_4859 = new Class14_Sub9_Sub2();

	static {
		anInt4843 = 0;
		anIntArray4851 = new int[2000];
		aClass124_4844 = Class14_Sub2_Sub2.method263(1178, "details");
	}

	public void method687(int[] is, int i, int i_0_) {
		aClass14_Sub9_Sub2_4859.method687(is, i, i_0_);
		while_349_: for (Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858
				.getFront(); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass2_4858.getNext()) {
			if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
				int i_1_ = i;
				int i_2_ = i_0_;
				while_347_: do {
					do {
						if (class14_sub18.anInt3048 >= i_2_)
							break while_347_;
						method737(is, class14_sub18.anInt3048, i_1_, i_2_ + i_1_, class14_sub18, -78);
						i_2_ -= class14_sub18.anInt3048;
						i_1_ += class14_sub18.anInt3048;
					} while (!aClass14_Sub9_Sub1_4856.method725(is, class14_sub18, 81, i_2_, i_1_));
					continue while_349_;
				} while (false);
				method737(is, i_2_, i_1_, i_2_ + i_1_, class14_sub18, -82);
				class14_sub18.anInt3048 -= i_2_;
			}
		}
	}

	public Class14_Sub9 method686() {
		Class14_Sub18 class14_sub18;
		do {
			class14_sub18 = (Class14_Sub18) aClass2_4858.getNext();
			if (class14_sub18 == null)
				return null;
		} while (class14_sub18.aClass14_Sub9_Sub4_3051 == null);
		Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
		return class14_sub9_sub4;
	}

	public Class14_Sub9 method688() {
		Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858.getFront();
		if (class14_sub18 == null) {
			Class14_Sub9 class14_sub9 = null;
			return class14_sub9;
		}
		if (class14_sub18.aClass14_Sub9_Sub4_3051 != null) {
			Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
			return class14_sub9_sub4;
		}
		Class14_Sub9 class14_sub9 = method686();
		return class14_sub9;
	}

	public static void method736(int i) {
		anIntArray4851 = null;
		if (i == 0)
			aClass124_4844 = null;
	}

	public int method690() {
		int i = 0;
		return i;
	}

	public void method737(int[] is, int i, int i_3_, int i_4_, Class14_Sub18 class14_sub18, int i_5_) {
		int i_6_ = -56 % ((i_5_ + 15) / 48);
		if ((aClass14_Sub9_Sub1_4856.anIntArray4817[class14_sub18.anInt3053] & 0x4) != 0
				&& class14_sub18.anInt3041 < 0) {
			int i_7_ = ((aClass14_Sub9_Sub1_4856.anIntArray4796[class14_sub18.anInt3053]) / Class115.anInt1909);
			for (;;) {
				int i_8_ = (i_7_ + (-class14_sub18.anInt3044 + 1048575)) / i_7_;
				if (i < i_8_)
					break;
				class14_sub18.aClass14_Sub9_Sub4_3051.method687(is, i_3_, i_8_);
				int i_9_ = Class115.anInt1909 / 100;
				i -= i_8_;
				i_3_ += i_8_;
				int i_10_ = 262144 / i_7_;
				class14_sub18.anInt3044 += i_7_ * i_8_ - 1048576;
				Class14_Sub9_Sub4 class14_sub9_sub4 = class14_sub18.aClass14_Sub9_Sub4_3051;
				if (i_10_ < i_9_)
					i_9_ = i_10_;
				if ((aClass14_Sub9_Sub1_4856.anIntArray4826[class14_sub18.anInt3053]) == 0)
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub9_sub4.method767(),
							class14_sub9_sub4.method769(), class14_sub9_sub4.method758()));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub9_sub4.method767(), 0,
							class14_sub9_sub4.method758()));
					aClass14_Sub9_Sub1_4856.method705(114, class14_sub18,
							(class14_sub18.aClass14_Sub28_3054.aShortArray3223[(class14_sub18.anInt3037)]) < 0);
					class14_sub18.aClass14_Sub9_Sub4_3051.method747(i_9_, class14_sub9_sub4.method769());
				}
				if ((class14_sub18.aClass14_Sub28_3054.aShortArray3223[class14_sub18.anInt3037]) < 0)
					class14_sub18.aClass14_Sub9_Sub4_3051.method765(-1);
				class14_sub9_sub4.method777(i_9_);
				class14_sub9_sub4.method687(is, i_3_, i_4_ - i_3_);
				if (class14_sub9_sub4.method776())
					aClass14_Sub9_Sub2_4859.method735(class14_sub9_sub4);
			}
			class14_sub18.anInt3044 += i_7_ * i;
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method687(is, i_3_, i);
	}

	public static void method738(String string, Throwable throwable, int i) {
		while_352_: do {
			while_351_: do {
				String string_11_;
				while_350_: do {
					do {
						try {
							string_11_ = "";
							if (throwable != null)
								string_11_ = Class138.method1947(41, throwable);
							if (string != null) {
								if (throwable != null)
									string_11_ = new StringBuilder(string_11_).append(" | ").toString();
								string_11_ = new StringBuilder(string_11_).append(string).toString();
							}
							System.out.println(new StringBuilder("Error: ").append(string_11_).toString());
							string_11_ = string_11_.replace(':', '.');
							string_11_ = string_11_.replace('@', '_');
							string_11_ = string_11_.replace('&', '_');
							string_11_ = string_11_.replace('#', (char) i);
							if (Static2.aClass43_358.applet == null)
								break;
						} catch (Exception exception) {
							break while_351_;
						}
						break while_350_;
					} while (false);
					return;
				} while (false);
				try {
					Class31 class31 = (Static2.aClass43_358.method1147((byte) -119, new URL(
							Static2.aClass43_358.applet.getCodeBase(),
							new StringBuilder("clienterror.ws?c=").append(Class14_Sub8_Sub32.anInt4614).append("&u=")
									.append(Class48.aLong802).append("&v1=").append(Class43.java_vendor).append("&v2=")
									.append(Class43.java_version).append("&e=").append(string_11_).toString())));
					while (class31.anInt529 == 0)
						Util.sleep(1L);
					if (class31.anInt529 == 1) {
						DataInputStream datainputstream = (DataInputStream) class31.anObject530;
						datainputstream.read();
						datainputstream.close();
					}
				} catch (Exception exception) {
					break;
				}
				break while_352_;
			} while (false);
			Throwable throwable_12_ = new Throwable();
		} while (false);
	}

	public void method692(int i) {
		aClass14_Sub9_Sub2_4859.method692(i);
		while_355_: for (Class14_Sub18 class14_sub18 = (Class14_Sub18) aClass2_4858
				.getFront(); class14_sub18 != null; class14_sub18 = (Class14_Sub18) aClass2_4858.getNext()) {
			if (!aClass14_Sub9_Sub1_4856.method726(class14_sub18, 2)) {
				int i_13_ = i;
				while_353_: do {
					do {
						if (class14_sub18.anInt3048 >= i_13_)
							break while_353_;
						method739(class14_sub18, -39, class14_sub18.anInt3048);
						i_13_ -= class14_sub18.anInt3048;
					} while (!aClass14_Sub9_Sub1_4856.method725(null, class14_sub18, 107, i_13_, 0));
					continue while_355_;
				} while (false);
				method739(class14_sub18, -39, i_13_);
				class14_sub18.anInt3048 -= i_13_;
			}
		}
	}

	public void method739(Class14_Sub18 class14_sub18, int i, int i_14_) {
		int i_15_ = 14 / ((i - 31) / 54);
		if ((aClass14_Sub9_Sub1_4856.anIntArray4817[class14_sub18.anInt3053] & 0x4) != 0
				&& class14_sub18.anInt3041 < 0) {
			int i_16_ = ((aClass14_Sub9_Sub1_4856.anIntArray4796[class14_sub18.anInt3053]) / Class115.anInt1909);
			int i_17_ = (-class14_sub18.anInt3044 + (i_16_ + 1048575)) / i_16_;
			class14_sub18.anInt3044 = i_16_ * i_14_ + class14_sub18.anInt3044 & 0xfffff;
			if (i_14_ >= i_17_) {
				if ((aClass14_Sub9_Sub1_4856.anIntArray4826[class14_sub18.anInt3053]) == 0)
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub18.aClass14_Sub9_Sub4_3051.method767(),
							class14_sub18.aClass14_Sub9_Sub4_3051.method769(),
							class14_sub18.aClass14_Sub9_Sub4_3051.method758()));
				else {
					class14_sub18.aClass14_Sub9_Sub4_3051 = (Class14_Sub9_Sub4.method763(
							class14_sub18.aClass14_Sub12_Sub1_3059, class14_sub18.aClass14_Sub9_Sub4_3051.method767(),
							0, class14_sub18.aClass14_Sub9_Sub4_3051.method758()));
					aClass14_Sub9_Sub1_4856.method705(-6, class14_sub18,
							(class14_sub18.aClass14_Sub28_3054.aShortArray3223[(class14_sub18.anInt3037)]) < 0);
				}
				if ((class14_sub18.aClass14_Sub28_3054.aShortArray3223[class14_sub18.anInt3037]) < 0)
					class14_sub18.aClass14_Sub9_Sub4_3051.method765(-1);
				i_14_ = class14_sub18.anInt3044 / i_16_;
			}
		}
		class14_sub18.aClass14_Sub9_Sub4_3051.method692(i_14_);
	}

	public Class14_Sub9_Sub3(Class14_Sub9_Sub1 class14_sub9_sub1) {
		aClass14_Sub9_Sub1_4856 = class14_sub9_sub1;
	}
}
