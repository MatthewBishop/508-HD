/* Class76 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;

import com.jagex.util.ArrayUtils;
import com.jagex.util.Util;

public class Class76 {
	
	public byte[] aByteArray1186;
	public byte[] aByteArray1208;
	public FileOnDisk aClass30_1202;
	public long aLong1187;
	public long aLong1188;
	public long aLong1190 = -1L;

	public long aLong1198;

	public long aLong1200;

	public long aLong1205 = -1L;

	public int anInt1210;

	public int anInt1214 = 0;

	public Class76(FileOnDisk fileOnDisk, int i, int i_74_) throws IOException {
		aClass30_1202 = fileOnDisk;
		aLong1198 = aLong1188 = fileOnDisk.method1061((byte) -68);
		aLong1187 = 0L;
		aByteArray1208 = new byte[i];
		aByteArray1186 = new byte[i_74_];
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

	public long method1360() {
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
					ArrayUtils.method1322(var4, var1, this.aByteArray1186, (int) (this.aLong1187 + -this.aLong1205), var5);
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
						ArrayUtils.method1322(var4, (int) (-this.aLong1187 + var6 + var1), this.aByteArray1208,
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

				ArrayUtils.method1322(var4, var1, this.aByteArray1186, (int) (-this.aLong1205 + this.aLong1187), var2);
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
				ArrayUtils.method1322(aByteArray1186, (int) (-aLong1205 + aLong1187), is, i, i_61_);
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
						ArrayUtils.method1322(aByteArray1208, (int) (-aLong1190 + aLong1187), is, i, i_64_);
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
						ArrayUtils.method1322(aByteArray1208, 0, is, i, i_66_);
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
							ArrayUtils.method1322(aByteArray1186, (int) (-aLong1205 + l_69_), is,
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
				ArrayUtils.method1322(aByteArray1186, (int) (l_72_ - aLong1205), aByteArray1208,
						(int) (-aLong1190 + l_72_), i_73_);
			}
			aLong1205 = -1L;
			anInt1214 = 0;
		}
	}
}
