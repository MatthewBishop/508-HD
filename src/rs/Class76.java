/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import com.jagex.cache.anim.Animation;
import com.jagex.cache.loaders.AnimFrameLoader;
import com.jagex.io.js5.FileOnDisk;
import com.jagex.rt4.Class14_Sub2_Sub19;
import com.jagex.util.Util;

public class Class76 {
	public byte[] aByteArray1186;
	public long aLong1187;
	public long aLong1188;
	public long aLong1190 = -1L;
	public static Class14_Sub2_Sub19[] aClass14_Sub2_Sub19Array1191;
	public static Class124 aClass124_1192 = Class124.method263(1178, "runes");
	public static int anInt1197;
	public long aLong1198;
	public long aLong1200;
	public FileOnDisk aClass30_1202;
	public static Class124 aClass124_1203;
	public static int[] anIntArray1204;
	public long aLong1205 = -1L;
	public static int anInt1207 = 2;
	public byte[] aByteArray1208;
	public int anInt1210;
	public static Class88[] aClass88Array1211;
	public int anInt1214 = 0;

	static {
		anInt1197 = 0;
		aClass124_1203 = Class124.method263(1178, "Okay");
	}

	public static void method1356(boolean bool, Component component) {
		if (bool)
			anIntArray1204 = null;
		component.removeMouseListener(Class67.aClass97_1055);
		component.removeMouseMotionListener(Class67.aClass97_1055);
		component.removeFocusListener(Class67.aClass97_1055);
		Class14_Sub4.anInt2790 = 0;
	}

	public static int method1357(int var0) {
		try {
			if (var0 != -21193) {
				byte var3 = -102;
				return var3;
			} else {
				byte var1 = 6;
				return var1;
			}
		} catch (Throwable var2) {
			throw Util.error(var2, "la.H(" + var0 + ')');
		}
	}

	public void method1358(int i) throws IOException {
		try {
			if (i == -1473276056) {
				method1369(-98);
				aClass30_1202.method1057(25861);
			}
		} catch (Throwable throwable) {
			throw Util.error(throwable, new StringBuilder("la.L(").append(i).append(')').toString());
		}
	}

	public static Class133_Sub7 method1359(int i, int i_7_, Animation animation, Class133_Sub7 class133_sub7, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, int i_13_, int i_14_, int i_15_, int i_16_, boolean bool) {
		long l = ((i_11_ << 56) + ((i_9_ << 16) + i_16_) + (((long) i_8_ << 32) - -((long) i_12_ << 48)));
		Class133_Sub7 class133_sub7_17_ = ((Class133_Sub7) Class14_Sub11.aClass52_2946.get(l));
		if (class133_sub7_17_ == null) {
			int i_18_;
			if (i_16_ == 1)
				i_18_ = 9;
			else if (i_16_ != 2) {
				if (i_16_ != 3) {
					if (i_16_ == 4)
						i_18_ = 18;
					else
						i_18_ = 21;
				} else
					i_18_ = 15;
			} else
				i_18_ = 12;
			int i_19_ = 3;
			Class133_Sub2 class133_sub2 = new Class133_Sub2(1 + i_19_ * i_18_, -i_18_ + i_18_ * 2 * i_19_, 0);
			int i_20_ = class133_sub2.method1818(0, 0, 0);
			int[] is = { 64, 96, 128 };
			int[][] is_21_ = new int[i_19_][i_18_];
			for (int i_22_ = 0; i_19_ > i_22_; i_22_++) {
				int i_23_ = is[i_22_];
				int i_24_ = is[i_22_];
				for (int i_25_ = 0; i_18_ > i_25_; i_25_++) {
					int i_26_ = (i_25_ << 43) / i_18_;
					int i_27_ = i_24_ * Class3.cos[i_26_] + i_14_ >> 48;
					int i_28_ = i_23_ * Class3.sin[i_26_] + i_7_ >> 16;
					is_21_[i_22_][i_25_] = class133_sub2.method1818(i_28_, 0, i_27_);
				}
			}
			for (int i_29_ = 0; i_29_ < i_19_; i_29_++) {
				int i_30_ = (i_29_ * 256 + 128) / i_19_;
				int i_31_ = -i_30_ + 256;
				byte i_32_ = (byte) (i_11_ * i_30_ + i_31_ * i_9_ >> 8);
				short i_33_ = (short) (((i_31_ * (i_8_ & 0xfc00) + i_30_ * (i_12_ & 0xfc00) & 0xfc0000)
						+ (((i_8_ & 0x380) * i_31_ + (i_12_ & 0x380) * i_30_) & 0x38000)
						+ ((i_31_ * (i_8_ & 0x7f) + (i_12_ & 0x7f) * i_30_) & 0x7f00)) >> 40);
				for (int i_34_ = 0; i_18_ > i_34_; i_34_++) {
					if (i_29_ == 0)
						class133_sub2.method1820(i_20_, (is_21_[0][(i_34_ + 1) % i_18_]), is_21_[0][i_34_], (byte) 1,
								i_33_, i_32_);
					else {
						class133_sub2.method1820(is_21_[i_29_ - 1][i_34_], (is_21_[i_29_ - 1][(i_34_ + 1) % i_18_]),
								(is_21_[i_29_][(i_34_ + 1) % i_18_]), (byte) 1, i_33_, i_32_);
						class133_sub2.method1820(is_21_[i_29_ - 1][i_34_], (is_21_[i_29_][(i_34_ + 1) % i_18_]),
								is_21_[i_29_][i_34_], (byte) 1, i_33_, i_32_);
					}
				}
			}
			class133_sub7_17_ = class133_sub2.method1827(64, 768, -50, -10, -50);
			Class14_Sub11.aClass52_2946.put(class133_sub7_17_, l);
		}
		int i_35_ = i_16_ * 64 - 1;
		int i_36_ = -i_35_;
		int i_37_ = -i_35_;
		int i_38_ = i_35_;
		int i_39_ = i_35_;
		if (bool) {
			if (i_13_ > 1152 && i_13_ < 1920)
				i_39_ += 128;
			if (i_13_ > 128 && i_13_ < 896)
				i_36_ -= 128;
			if (i_13_ > 640 && i_13_ < 1408)
				i_38_ += 128;
			if (i_13_ > 1664 || i_13_ < 384)
				i_37_ -= 128;
		}
		int i_40_ = class133_sub7.method1867();
		if (i_36_ > i_40_)
			i_40_ = i_36_;
		int i_41_ = class133_sub7.method1856();
		if (i_39_ < i_41_)
			i_41_ = i_39_;
		int i_42_ = class133_sub7.method1868();
		int i_43_ = class133_sub7.method1865();
		if (i_42_ < i_37_)
			i_42_ = i_37_;
		if (i_43_ > i_38_)
			i_43_ = i_38_;
		AnimFrameLoader class14_sub2_sub15 = null;
		if (animation != null) {
			i_15_ = animation.anIntArray768[i_15_];
			class14_sub2_sub15 = Class14_Sub4.method457(3, i_15_ >> 16);
			i_15_ &= 0xffff;
		}
		if (class14_sub2_sub15 != null) {
			class133_sub7_17_ = (class133_sub7_17_.method1870(!class14_sub2_sub15.method338(i_15_), true));
			class133_sub7_17_.method1869((i_41_ - i_40_) / 2, 128, (i_43_ - i_42_) / 2);
			class133_sub7_17_.method1855((i_41_ + i_40_) / 2, 0, (i_42_ + i_43_) / 2);
			class133_sub7_17_.method1859(class14_sub2_sub15, i_15_);
		} else {
			class133_sub7_17_ = class133_sub7_17_.method1870(true, true);
			class133_sub7_17_.method1869((i_41_ - i_40_) / 2, 128, (-i_42_ + i_43_) / 2);
			class133_sub7_17_.method1855((i_40_ + i_41_) / 2, 0, (i_43_ + i_42_) / 2);
		}
		if (i_13_ != 0)
			class133_sub7_17_.method1874(i_13_);
		ModelHD modelhd = (ModelHD) class133_sub7_17_;
		if (i_10_ != JunkTex.method1017(i_7_ + i_40_, Class14_Sub2_Sub3.anInt3785, (byte) 117, i_14_ + i_42_)
				|| i_10_ != JunkTex.method1017(i_7_ + i_41_, Class14_Sub2_Sub3.anInt3785, (byte) 77, i_43_ + i_14_)) {
			for (int i_44_ = 0; modelhd.anInt5033 > i_44_; i_44_++)
				modelhd.vertexY[i_44_] += (JunkTex.method1017(modelhd.vertexX[i_44_] + i_7_,
						Class14_Sub2_Sub3.anInt3785, (byte) -109, i_14_ + modelhd.vertexZ[i_44_]) - i_10_);
			modelhd.aClass50_5013.boundsCalculated = false;
			modelhd.vertexBufferPointer.upToDate = false;
		}
		Class133_Sub7 class133_sub7_45_ = class133_sub7_17_;
		return class133_sub7_45_;
	}

	public long method1360(byte i) {
		if (i >= -27)
			method1359(-30, 41, null, null, -34, -47, -89, -20, 121, 6, -86, 6, -58, false);
		long l = aLong1198;
		return l;
	}

	public void method1361(int i, long l) throws IOException {
		if (l < i)
			throw new IOException(new StringBuilder("Invalid seek to ").append(l).append(" in file ")
					.append(method1367(-1)).toString());
		aLong1187 = l;
	}

	public void method1362(int var1, int var2, byte var3, byte[] var4) throws IOException {
		try {
			try {
				if (var2 + this.aLong1187 > this.aLong1198) {
					this.aLong1198 = this.aLong1187 + var2;
				}

				if (this.aLong1205 != -1L && (this.aLong1205 > this.aLong1187
						|| this.anInt1214 + this.aLong1205 < this.aLong1187)) {
					this.method1369(-41);
				}

				if (-1L != this.aLong1205
						&& this.aByteArray1186.length + this.aLong1205 < var2 + this.aLong1187) {
					int var5 = (int) (this.aLong1205 - this.aLong1187 + this.aByteArray1186.length);
					Class72.method1322(var4, var1, this.aByteArray1186, (int) (this.aLong1187 + -this.aLong1205), var5);
					var2 -= var5;
					var1 += var5;
					this.aLong1187 += var5;
					this.anInt1214 = this.aByteArray1186.length;
					this.method1369(122);
				}

				if (var2 > this.aByteArray1186.length) {
					if (this.aLong1200 != this.aLong1187) {
						this.aClass30_1202.method1058(-118, this.aLong1187);
						this.aLong1200 = this.aLong1187;
					}

					this.aClass30_1202.method1056(var1, var2, var4, -20563);
					long var6 = -1L;
					this.aLong1200 += var2;
					if (this.aLong1200 > this.aLong1188) {
						this.aLong1188 = this.aLong1200;
					}

					if (this.aLong1187 >= this.aLong1190 && this.aLong1187 < this.aLong1190 + this.anInt1210) {
						var6 = this.aLong1187;
					} else if (this.aLong1187 <= this.aLong1190 && this.aLong1187 - -((long) var2) > this.aLong1190) {
						var6 = this.aLong1190;
					}

					long var8 = -1L;
					if (this.aLong1190 < var2 + this.aLong1187
							&& this.aLong1190 - -((long) this.anInt1210) >= this.aLong1187 - -((long) var2)) {
						var8 = var2 + this.aLong1187;
					} else if (this.aLong1187 < this.anInt1210 + this.aLong1190
							&& this.anInt1210 + this.aLong1190 <= var2 + this.aLong1187) {
						var8 = this.aLong1190 + this.anInt1210;
					}

					if (-1L < var6 && var6 < var8) {
						int var10 = (int) (-var6 + var8);
						Class72.method1322(var4, (int) (-this.aLong1187 + var6 + var1), this.aByteArray1208,
								(int) (-this.aLong1190 + var6), var10);
					}

					this.aLong1187 += var2;
					return;
				}
			} catch (IOException var12) {
				RuntimeException var11 = new RuntimeException();
				this.aLong1200 = -1L;
				throw var11;
			}

			if (var2 > 0) {
				if (-1L == this.aLong1205) {
					this.aLong1205 = this.aLong1187;
				}

				Class72.method1322(var4, var1, this.aByteArray1186, (int) (-this.aLong1205 + this.aLong1187), var2);
				this.aLong1187 += var2;
				if (this.aLong1187 + -this.aLong1205 > this.anInt1214) {
					this.anInt1214 = (int) (this.aLong1187 + -this.aLong1205);
				}
			} else if (var3 < 40) {
				this.method1367(57);
			}

		} catch (Throwable var13) {
			throw Util.error(var13,
					"la.J(" + var1 + ',' + var2 + ',' + var3 + ',' + (var4 != null ? "{...}" : "null") + ')');
		}
	}

	public static void method1364(int i) {
		aClass14_Sub2_Sub19Array1191 = null;
		aClass88Array1211 = null;
		anIntArray1204 = null;
		aClass124_1203 = null;
		aClass124_1192 = null;
	}

	public void method1365(boolean bool) throws IOException {
		anInt1210 = 0;
		if (!bool)
			anInt1214 = 73;
		if (aLong1187 != aLong1200) {
			aClass30_1202.method1058(-94, aLong1187);
			aLong1200 = aLong1187;
		}
		aLong1190 = aLong1187;
		while (anInt1210 < aByteArray1208.length) {
			int i = aByteArray1208.length - anInt1210;
			if (i > 200000000)
				i = 200000000;
			int i_55_ = aClass30_1202.method1060(aByteArray1208, 0, anInt1210, i);
			if (i_55_ == -1)
				break;
			anInt1210 += i_55_;
			aLong1200 += i_55_;
		}
	}

	public void method1366(byte i, byte[] is) throws IOException {
		method1368(false, is, 0, is.length);
		if (i != -33)
			anInt1210 = -89;
	}

	public File method1367(int var1) {
		try {
			File var2;
			if (var1 != -1) {
				var2 = null;
				return var2;
			} else {
				var2 = this.aClass30_1202.method1059((byte) 121);
				return var2;
			}
		} catch (Throwable var3) {
			throw Util.error(var3, "la.M(" + var1 + ')');
		}
	}

	public void method1368(boolean bool, byte[] is, int i, int i_61_) throws IOException {
		if (!bool) {
			if (i_61_ + i > is.length)
				throw new ArrayIndexOutOfBoundsException(i_61_ + i - is.length);
			if (aLong1205 != -1L && aLong1187 >= aLong1205
					&& anInt1214 + aLong1205 >= aLong1187 - -(long) i_61_) {
				Class72.method1322(aByteArray1186, (int) (-aLong1205 + aLong1187), is, i, i_61_);
				aLong1187 += i_61_;
			} else {
				try {
					long l = aLong1187;
					int i_62_ = i;
					int i_63_ = i_61_;
					if (aLong1187 >= aLong1190 && aLong1190 - -(long) anInt1210 > aLong1187) {
						int i_64_ = (int) (anInt1210 + (aLong1190 + -aLong1187));
						if (i_61_ < i_64_)
							i_64_ = i_61_;
						i_61_ -= i_64_;
						Class72.method1322(aByteArray1208, (int) (-aLong1190 + aLong1187), is, i, i_64_);
						i += i_64_;
						aLong1187 += i_64_;
					}
					if (i_61_ > aByteArray1208.length) {
						aClass30_1202.method1058(-78, aLong1187);
						aLong1200 = aLong1187;
						while (i_61_ > 0) {
							int i_65_ = aClass30_1202.method1060(is, 0, i, i_61_);
							if (i_65_ == -1)
								break;
							aLong1200 += i_65_;
							i += i_65_;
							i_61_ -= i_65_;
							aLong1187 += i_65_;
						}
					} else if (i_61_ > 0) {
						method1365(true);
						int i_66_ = i_61_;
						if (anInt1210 < i_66_)
							i_66_ = anInt1210;
						i_61_ -= i_66_;
						Class72.method1322(aByteArray1208, 0, is, i, i_66_);
						aLong1187 += i_66_;
						i += i_66_;
					}
					if (aLong1205 != -1L) {
						if (aLong1187 < aLong1205 && i_61_ > 0) {
							int i_67_ = i + (int) (-aLong1187 + aLong1205);
							if (i_67_ > i_61_ + i)
								i_67_ = i_61_ + i;
							while (i_67_ > i) {
								i_61_--;
								is[i++] = (byte) 0;
								aLong1187++;
							}
						}
						long l_68_ = -1L;
						if (l < anInt1214 + aLong1205 && (anInt1214 + aLong1205 <= l - -(long) i_63_))
							l_68_ = aLong1205 - -(long) anInt1214;
						else if (aLong1205 < l - -(long) i_63_ && (anInt1214 + aLong1205 >= i_63_ + l))
							l_68_ = l + i_63_;
						long l_69_ = -1L;
						if (l <= aLong1205 && i_63_ + l > aLong1205)
							l_69_ = aLong1205;
						else if (aLong1205 <= l && anInt1214 + aLong1205 > l)
							l_69_ = l;
						if (-1L < l_69_ && l_68_ > l_69_) {
							int i_70_ = (int) (-l_69_ + l_68_);
							Class72.method1322(aByteArray1186, (int) (-aLong1205 + l_69_), is,
									(int) (-l + l_69_) + i_62_, i_70_);
							if (aLong1187 < l_68_) {
								i_61_ -= -aLong1187 + l_68_;
								aLong1187 = l_68_;
							}
						}
					}
				} catch (IOException ioexception) {
					aLong1200 = -1L;
					throw ioexception;
				}
				if (i_61_ > 0)
					throw new EOFException();
			}
		}
	}

	public void method1369(int i) throws IOException {
		int i_71_ = -15 / ((67 - i) / 54);
		if (-1L != aLong1205) {
			long l = -1L;
			long l_72_ = -1L;
			if (aLong1205 != aLong1200) {
				aClass30_1202.method1058(-106, aLong1205);
				aLong1200 = aLong1205;
			}
			aClass30_1202.method1056(0, anInt1214, aByteArray1186, -20563);
			if (anInt1214 + aLong1205 > aLong1190
					&& (aLong1190 - -(long) anInt1210 >= anInt1214 + aLong1205))
				l = aLong1205 - -(long) anInt1214;
			else if (aLong1205 < aLong1190 - -(long) anInt1210
					&& (aLong1190 + anInt1210 <= aLong1205 + anInt1214))
				l = aLong1190 - -(long) anInt1210;
			aLong1200 += anInt1214;
			if (aLong1188 < aLong1200)
				aLong1188 = aLong1200;
			if (aLong1190 > aLong1205 || aLong1205 >= aLong1190 - -(long) anInt1210) {
				if (aLong1205 <= aLong1190 && anInt1214 + aLong1205 > aLong1190)
					l_72_ = aLong1190;
			} else
				l_72_ = aLong1205;
			if (-1L < l_72_ && l > l_72_) {
				int i_73_ = (int) (l - l_72_);
				Class72.method1322(aByteArray1186, (int) (l_72_ - aLong1205), aByteArray1208,
						(int) (-aLong1190 + l_72_), i_73_);
			}
			aLong1205 = -1L;
			anInt1214 = 0;
		}
	}

	public Class76(FileOnDisk fileOnDisk, int i, int i_74_) throws IOException {
		aClass30_1202 = fileOnDisk;
		aLong1198 = aLong1188 = fileOnDisk.method1061((byte) -68);
		aLong1187 = 0L;
		aByteArray1208 = new byte[i];
		aByteArray1186 = new byte[i_74_];
	}
}
