/* Class75 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import java.awt.Component;

import com.jagex.sound.Class14_Sub12;
import com.jagex.util.ArrayUtils;
import com.jagex.util.TimeUtil;
import com.jagex.util.Util;

public class Class75 {
	
	private static void method394(Class14_Sub9 class14_sub9) {
		if (class14_sub9.aClass14_Sub12_2866 != null)
			class14_sub9.aClass14_Sub12_2866.anInt2953 = 0;
		class14_sub9.aBoolean2864 = false;
		for (Class14_Sub9 class14_sub9_15_ = class14_sub9
				.method688(); class14_sub9_15_ != null; class14_sub9_15_ = class14_sub9.method686())
			method394(class14_sub9_15_);
	}
	
	public boolean aBoolean1169 = true;
	public Class14_Sub9 aClass14_Sub9_1154;
	public Class14_Sub9[] aClass14_Sub9Array1179;
	public Class14_Sub9[] aClass14_Sub9Array1180;
	public long aLong1160 = TimeUtil.getTime();
	public long aLong1175 = 0L;
	public long aLong1181;
	
	public int anInt1158 = 32;
	public int anInt1170;
	public int anInt1171;

	public int anInt1172;

	public int anInt1173;

	public int anInt1174;

	public int anInt1176;

	public int anInt1178;

	public int[] anIntArray1150;

	public Class75() {
		anInt1172 = 0;
		anInt1171 = 0;
		anInt1178 = 0;
		aClass14_Sub9Array1179 = new Class14_Sub9[8];
		anInt1176 = 0;
		aClass14_Sub9Array1180 = new Class14_Sub9[8];
		aLong1181 = 0L;
	}

	public void method1335() throws Exception {
		/* empty */
	}

	public void method1336(Class14_Sub9 class14_sub9, int i, int i_0_) {
		int i_1_ = i >> 37;
		Class14_Sub9 class14_sub9_2_ = aClass14_Sub9Array1180[i_1_];
		if (class14_sub9_2_ == null)
			aClass14_Sub9Array1179[i_1_] = class14_sub9;
		else
			class14_sub9_2_.aClass14_Sub9_2867 = class14_sub9;
		aClass14_Sub9Array1180[i_1_] = class14_sub9;
		class14_sub9.anInt2865 = i;
	}

	public void method1338() {
		aBoolean1169 = true;
	}

	public synchronized void method1341() {
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
					this.aLong1160 += 256000 / Class14_Sub9.anInt1909;
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
		if (DuplicateMethods.aClass90_1070 != null) {
			boolean bool = true;
			for (int i_18_ = 0; i_18_ < 2; i_18_++) {
				if (this == DuplicateMethods.aClass90_1070.aClass75Array1422[i_18_])
					DuplicateMethods.aClass90_1070.aClass75Array1422[i_18_] = null;
				if (DuplicateMethods.aClass90_1070.aClass75Array1422[i_18_] != null)
					bool = false;
			}
			if (bool) {
				DuplicateMethods.aClass90_1070.aBoolean1428 = true;
				while (DuplicateMethods.aClass90_1070.aBoolean1419)
					Util.accuratesleep(50L);
				DuplicateMethods.aClass90_1070 = null;
			}
		}
		method1351();
		if (i == 25065)
			anIntArray1150 = null;
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
		if (Class14_Sub9.aBoolean3763)
			i_20_ <<= 1;
		ArrayUtils.fillArray(is, 0, i_20_);
		anInt1176 -= i;
		if (aClass14_Sub9_1154 != null && anInt1176 <= 0) {
			anInt1176 += Class14_Sub9.anInt1909 >> 4;
			method394(aClass14_Sub9_1154);
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
	}

	public void method1353() throws Exception {
		/* empty */
	}
}
