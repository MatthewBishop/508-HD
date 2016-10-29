/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;

import com.jagex.io.Buffer;
import com.jagex.io.js5.Class9_Sub1;
import com.jagex.link.Cache;
import com.jagex.rt4.Class148;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

public class Class75 {
	public static Cache aClass20_1147;
	public int[] anIntArray1150;
	public static int anInt1151;
	public static Class124 aClass124_1152 = Class124.method263(1178, "leuchten1:");
	public Class14_Sub9 aClass14_Sub9_1154;
	public int anInt1158 = 32;
	public long aLong1160 = TimeUtil.getTime();
	public static int anInt1163;
	public static Class124 aClass124_1165 = Class124.method263(1178, "Bitte warten Sie)3)3)3");
	public static Class9_Sub1 idx0;
	public boolean aBoolean1169 = true;
	public int anInt1170;
	public int anInt1171;
	public int anInt1172;
	public int anInt1173;
	public int anInt1174;
	public long aLong1175 = 0L;
	public int anInt1176;
	public int anInt1178;
	public Class14_Sub9[] aClass14_Sub9Array1179;
	public Class14_Sub9[] aClass14_Sub9Array1180;
	public long aLong1181;
	public static Class124 aClass124_1182;
	public static Class124 aClass124_1183;
	public static Class148[] aClass148Array1184;

	static {
		anInt1163 = -1;
		aClass20_1147 = new Cache(64);
		aClass124_1183 = Class124.method263(1178, "Loading sprites )2 ");
		aClass124_1182 = aClass124_1183;
	}

	public void method1335() throws Exception {
		/* empty */
	}

	public void method1336(Class14_Sub9 class14_sub9, int i, int i_0_) {
		if (i_0_ != 15621)
			idx0 = null;
		int i_1_ = i >> 37;
		Class14_Sub9 class14_sub9_2_ = aClass14_Sub9Array1180[i_1_];
		if (class14_sub9_2_ == null)
			aClass14_Sub9Array1179[i_1_] = class14_sub9;
		else
			class14_sub9_2_.aClass14_Sub9_2867 = class14_sub9;
		aClass14_Sub9Array1180[i_1_] = class14_sub9;
		class14_sub9.anInt2865 = i;
	}

	public static Class124 method1337(Buffer class14_sub10, int i) {
		if (i != 32767)
			method1343(-4, 118, -32, -119, 126);
		Class124 class124 = Static2.method1998(32767, (byte) -125, class14_sub10);
		return class124;
	}

	public void method1338(int i) {
		aBoolean1169 = true;
		if (i != 255)
			anInt1174 = -99;
	}

	public static void method1339(Class133 class133, int i, int i_3_, int i_4_) {
		if (i_3_ < Static2.anInt3338) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aClass133_124.method1784())
				class133.method1788(class14_sub29.aClass4_3237.aClass133_124, 128, 0, 0, true);
		}
		if (i_4_ < Static2.anInt3338) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_][i_4_ + 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aClass133_124.method1784())
				class133.method1788(class14_sub29.aClass4_3237.aClass133_124, 0, 0, 128, true);
		}
		if (i_3_ < Static2.anInt3338 && i_4_ < JunkTex.anInt4337) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_ + 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aClass133_124.method1784())
				class133.method1788(class14_sub29.aClass4_3237.aClass133_124, 128, 0, 128, true);
		}
		if (i_3_ < Static2.anInt3338 && i_4_ > 0) {
			Class14_Sub29 class14_sub29 = (JunkTex.aClass14_Sub29ArrayArrayArray3368[i][i_3_ + 1][i_4_ - 1]);
			if (class14_sub29 != null && class14_sub29.aClass4_3237 != null
					&& class14_sub29.aClass4_3237.aClass133_124.method1784())
				class133.method1788(class14_sub29.aClass4_3237.aClass133_124, 128, 0, -128, true);
		}
	}

	public static void method1340(byte i) {
		if (Static2.aClass104_4037 != null) {
			try {
				byte[] is = Static2.aClass104_4037.method1533((byte) 81);
				if (is != null) {
					Buffer class14_sub10 = new Buffer(is);
					JunkTex.anInt1129 = class14_sub10.readUShort((byte) 111);
					Class133_Sub1.aClass45Array3435 = new Class45[JunkTex.anInt1129];
					for (int i_5_ = 0; JunkTex.anInt1129 > i_5_; i_5_++) {
						Class45 class45 = (Class133_Sub1.aClass45Array3435[i_5_] = new Class45());
						int i_6_ = class14_sub10.readUShort((byte) 127);
						class45.aBoolean749 = (i_6_ & 0x8000) != 0;
						class45.anInt744 = i_6_ & 0x7fff;
						class45.aClass124_741 = class14_sub10.method797(9467);
						class45.anInt752 = class14_sub10.method805(0);
						class45.anInt742 = i_5_;
						int i_7_ = class14_sub10.readUShort((byte) 121);
						class45.anInt745 = Class47.method1182(i_7_, -1);
					}
					Class14_Sub2_Sub11.method309(Class133_Sub1.aClass45Array3435,
							Class133_Sub1.aClass45Array3435.length - 1, (byte) 127, 0);
					Static2.aClass104_4037 = null;
				}
			} catch (Exception exception) {
				exception.printStackTrace();
				Static2.aClass104_4037 = null;
			}
		}
	}

	public synchronized void method1341(int var1) {
		if (this.anIntArray1150 != null) {
			long var2 = TimeUtil.getTime();

			label134: {
				int var5;
				label133: {
					label132: {
						label144: {
							label130: {
								try {
									if (this.aLong1181 == 0L) {
										break label130;
									}

									if (this.aLong1181 > var2) {
										return;
									}
								} catch (Exception var14) {
									break label144;
								}

								try {
									this.method1347(this.anInt1174);
									this.aLong1181 = 0L;
									this.aBoolean1169 = true;
								} catch (Exception var13) {
									break label144;
								}
							}

							if (var1 >= -43) {
								method1337((Buffer) null, 30);
							}

							boolean var4 = false;

							try {
								var5 = this.method1342();
							} catch (Exception var12) {
								break label144;
							}

							if (this.anInt1171 < -var5 + this.anInt1172) {
								this.anInt1171 = -var5 + this.anInt1172;
							}

							int var6 = this.anInt1173 + this.anInt1170;
							if (var6 + 256 > 16384) {
								var6 = 16128;
							}

							if (this.anInt1174 < var6 + 256) {
								var5 = 0;
								this.anInt1174 += 1024;
								if (this.anInt1174 > 16384) {
									this.anInt1174 = 16384;
								}

								this.method1351();

								try {
									this.method1347(this.anInt1174);
								} catch (Exception var11) {
									break label144;
								}

								this.aBoolean1169 = true;
								if (this.anInt1174 < var6 + 256) {
									var6 = this.anInt1174 - 256;
									this.anInt1170 = -this.anInt1173 + var6;
								}
							}

							while (var6 > var5) {
								var5 += 256;
								this.method1349(this.anIntArray1150, 256);

								try {
									this.method1353();
								} catch (Exception var9) {
									break;
								}
							}

							if (var2 <= this.aLong1175) {
								break label133;
							}

							if (this.aBoolean1169) {
								this.aBoolean1169 = false;
								break label132;
							}

							if (this.anInt1171 == 0 && this.anInt1178 == 0) {
								this.method1351();
								this.aLong1181 = var2 + 2000L;
								return;
							}

							try {
								this.anInt1170 = Math.min(this.anInt1178, this.anInt1171);
								this.anInt1178 = this.anInt1171;
								break label132;
							} catch (Exception var10) {
								;
							}
						}

						new Throwable();
						this.method1351();
						this.aLong1181 = var2 - -2000L;
						break label134;
					}

					this.aLong1175 = var2 + 2000L;
					this.anInt1171 = 0;
				}

				this.anInt1172 = var5;
			}

			try {
				if (var2 > this.aLong1160 - -500000L) {
					var2 = this.aLong1160;
				}

				while (this.aLong1160 + 5000L < var2) {
					this.method1348(0, 256);
					this.aLong1160 += 256000 / Class115.anInt1909;
				}
			} catch (Exception var8) {
				this.aLong1160 = var2;
			}
		}

	}

	public int method1342() throws Exception {
		int i = anInt1174;
		return i;
	}

	public static void method1343(int i, int i_13_, int i_14_, int i_15_, int i_16_) {
		if (Class14_Sub2_Sub11.anInt3881 == 1)
			JunkTex.aClass14_Sub2_Sub19Array3958[JunkTex.anInt4017 / 100]
					.drawReg(JunkTex.anInt4243 - 8, JunkTex.anInt4515 - 8);
		int i_17_ = 100 % ((i_13_ - 62) / 41);
		if (Class14_Sub2_Sub11.anInt3881 == 2)
			JunkTex.aClass14_Sub2_Sub19Array3958[4 + JunkTex.anInt4017 / 100]
					.drawReg(JunkTex.anInt4243 - 8, JunkTex.anInt4515 - 8);
		Class14_Sub14.method868(67);
	}

	public synchronized void method1344(boolean bool) {
		aBoolean1169 = bool;
		try {
			method1335();
		} catch (Exception exception) {
			method1351();
			aLong1181 = TimeUtil.getTime() + 2000L;
		}
	}

	public synchronized void method1345(int i) {
		if (Class69.aClass90_1070 != null) {
			boolean bool = true;
			for (int i_18_ = 0; i_18_ < 2; i_18_++) {
				if (this == Class69.aClass90_1070.aClass75Array1422[i_18_])
					Class69.aClass90_1070.aClass75Array1422[i_18_] = null;
				if (Class69.aClass90_1070.aClass75Array1422[i_18_] != null)
					bool = false;
			}
			if (bool) {
				Class69.aClass90_1070.aBoolean1428 = true;
				while (Class69.aClass90_1070.aBoolean1419)
					Util.sleep(50L);
				Class69.aClass90_1070 = null;
			}
		}
		method1351();
		if (i == 25065)
			anIntArray1150 = null;
	}

	public static void method1346(byte i) {
		aClass148Array1184 = null;
		aClass20_1147 = null;
		aClass124_1165 = null;
		idx0 = null;
		aClass124_1152 = null;
		aClass124_1183 = null;
		aClass124_1182 = null;
		if (i < 73)
			method1339(null, -101, -120, 98);
	}

	public void method1347(int i) throws Exception {
		/* empty */
	}

	public void method1348(int i, int i_19_) {
		anInt1176 -= i_19_;
		if (anInt1176 < i)
			anInt1176 = 0;
		if (aClass14_Sub9_1154 != null)
			aClass14_Sub9_1154.method692(i_19_);
	}

	public void method1349(int[] is, int i) {
		int i_20_ = i;
		if (Class14_Sub2_Sub2.aBoolean3763)
			i_20_ <<= 1;
		Class72.fillArray(is, 0, i_20_);
		anInt1176 -= i;
		if (aClass14_Sub9_1154 != null && anInt1176 <= 0) {
			anInt1176 += Class115.anInt1909 >> 4;
			Static2.method394((byte) -33, aClass14_Sub9_1154);
			method1336(aClass14_Sub9_1154, aClass14_Sub9_1154.method691(), 15621);
			int i_21_ = 0;
			int i_22_ = 255;
			int i_23_ = 7;
			while_311_: while (i_22_ != 0) {
				int i_24_;
				int i_25_;
				if (i_23_ < 0) {
					i_24_ = i_23_ & 0x3;
					i_25_ = -(i_23_ >> 2);
				} else {
					i_24_ = i_23_;
					i_25_ = 0;
				}
				for (int i_26_ = i_22_ >>> i_24_ & 0x11111111; i_26_ != 0; i_26_ >>>= 4) {
					if ((i_26_ & 0x1) != 0) {
						i_22_ &= 1 << i_24_ ^ 0xffffffff;
						Class14_Sub9 class14_sub9 = null;
						Class14_Sub9 class14_sub9_27_ = aClass14_Sub9Array1179[i_24_];
						while (class14_sub9_27_ != null) {
							Class14_Sub12 class14_sub12 = class14_sub9_27_.aClass14_Sub12_2866;
							if (class14_sub12 != null && class14_sub12.anInt2953 > i_25_) {
								i_22_ |= 1 << i_24_;
								class14_sub9 = class14_sub9_27_;
								class14_sub9_27_ = class14_sub9_27_.aClass14_Sub9_2867;
							} else {
								class14_sub9_27_.aBoolean2864 = true;
								int i_28_ = class14_sub9_27_.method690();
								i_21_ += i_28_;
								if (class14_sub12 != null)
									class14_sub12.anInt2953 += i_28_;
								if (i_21_ >= anInt1158)
									break while_311_;
								Class14_Sub9 class14_sub9_29_ = class14_sub9_27_.method688();
								if (class14_sub9_29_ != null) {
									int i_30_ = class14_sub9_27_.anInt2865;
									for (/**/; class14_sub9_29_ != null; class14_sub9_29_ = class14_sub9_27_
											.method686())
										method1336(class14_sub9_29_, (i_30_ * class14_sub9_29_.method691() >> 8),
												15621);
								}
								Class14_Sub9 class14_sub9_31_ = class14_sub9_27_.aClass14_Sub9_2867;
								class14_sub9_27_.aClass14_Sub9_2867 = null;
								if (class14_sub9 == null)
									aClass14_Sub9Array1179[i_24_] = class14_sub9_31_;
								else
									class14_sub9.aClass14_Sub9_2867 = class14_sub9_31_;
								if (class14_sub9_31_ == null)
									aClass14_Sub9Array1180[i_24_] = class14_sub9;
								class14_sub9_27_ = class14_sub9_31_;
							}
						}
					}
					i_24_ += 4;
					i_25_++;
				}
				i_23_--;
			}
			for (i_23_ = 0; i_23_ < 8; i_23_++) {
				Class14_Sub9 class14_sub9 = aClass14_Sub9Array1179[i_23_];
				aClass14_Sub9Array1179[i_23_] = aClass14_Sub9Array1180[i_23_] = null;
				Class14_Sub9 class14_sub9_32_;
				for (/**/; class14_sub9 != null; class14_sub9 = class14_sub9_32_) {
					class14_sub9_32_ = class14_sub9.aClass14_Sub9_2867;
					class14_sub9.aClass14_Sub9_2867 = null;
				}
			}
		}
		if (anInt1176 < 0)
			anInt1176 = 0;
		if (aClass14_Sub9_1154 != null)
			aClass14_Sub9_1154.method687(is, 0, i);
		aLong1160 = TimeUtil.getTime();
	}

	public void method1350(Component component) throws Exception {
		/* empty */
	}

	public void method1351() {
		/* empty */
	}

	public synchronized void method1352(Class14_Sub9 class14_sub9, boolean bool) {
		aClass14_Sub9_1154 = class14_sub9;
		if (bool)
			method1339(null, 29, -75, -79);
	}

	public void method1353() throws Exception {
		/* empty */
	}

	public Class75() {
		anInt1172 = 0;
		anInt1171 = 0;
		anInt1178 = 0;
		aClass14_Sub9Array1179 = new Class14_Sub9[8];
		anInt1176 = 0;
		aClass14_Sub9Array1180 = new Class14_Sub9[8];
		aLong1181 = 0L;
	}
}
