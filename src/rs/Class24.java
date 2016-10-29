package rs;

import com.jagex.link.Deque;
import com.jagex.rt4.Class14_Sub1;
import com.jagex.util.Util;

public class Class24 implements Runnable {

	public static int anInt465 = 0;
	public static int[] anIntArray467 = new int[32];
	public static Class124 aClass124_470 = Class124.method263(1178, "mapfunction");
	public static short[] aShortArray471;
	public static Class124 aClass124_474;

	static {
		aClass124_474 = Class124.method263(1178, "rect_debug=");
	}

	public void run() {
		try {
			try {
				while (true) {
					Deque var1 = JunkTex.aClass2_4404;
					Deque var2 = JunkTex.aClass2_4404;
					Class14_Sub19 var3;
					synchronized (var2) {
						var3 = (Class14_Sub19) JunkTex.aClass2_4404.getFront();
					}

					Object var4;
					Object var12;
					if (var3 != null) {
						Deque var13;
						if (var3.anInt3067 != 0) {
							if (var3.anInt3067 == 1) {
								var3.aByteArray3069 = var3.aClass114_3077.method1582(124, (int) var3.key);
								var1 = JunkTex.aClass2_4404;
								var13 = JunkTex.aClass2_4404;
								synchronized (var13) {
									JunkTex.aClass2_99.pushBack(var3);
								}
							}
						} else {
							var3.aClass114_3077.method1583((int) var3.key, var3.aByteArray3069, -1,
									var3.aByteArray3069.length);
							var1 = JunkTex.aClass2_4404;
							var13 = JunkTex.aClass2_4404;
							synchronized (var13) {
								var3.unlink();
							}
						}

						var12 = JunkTex.anObject4417;
						var4 = JunkTex.anObject4417;
						synchronized (var4) {
							if (Class138.anInt2223 <= 1) {
								Class138.anInt2223 = 0;
								JunkTex.anObject4417.notifyAll();
								return;
							}

							Class138.anInt2223 = 600;
						}
					} else {
						Util.sleep(100L);
						var12 = JunkTex.anObject4417;
						var4 = JunkTex.anObject4417;
						synchronized (var4) {
							if (Class138.anInt2223 <= 1) {
								Class138.anInt2223 = 0;
								JunkTex.anObject4417.notifyAll();
								return;
							}

							--Class138.anInt2223;
						}
					}
				}
			} catch (Exception var10) {
				Class14_Sub9_Sub3.method738((String) null, var10, 95);
			}
		} catch (RuntimeException var11) {
			throw Util.error(var11, "ck.run()");
		}
	}

	public static void method991(byte var0) {
		Static2.aClass52_2370.method1209();
		if (var0 != -2) {
			aClass124_474 = null;
		}

	}

	public static void method992(byte var0) {
		aShortArray471 = null;
		anIntArray467 = null;
		aClass124_474 = null;
		aClass124_470 = null;
		if (var0 != 64) {
			method991((byte) 83);
		}

	}

	public static int method993(boolean var0, int var1, int var2, int var3) {
		try {
			byte var4 = 0;
			Class14_Sub25 var5 = (Class14_Sub25) Class132.aClass55_2167.get(var3);
			if (var5 == null) {
				boolean var11 = false;
				return var4;
			} else {
				int var6 = 0;
				int var7 = 0;
				if (var1 != -28006) {
					byte var12 = 16;
					return var12;
				} else {
					for (; var7 < var5.anIntArray3178.length; ++var7) {
						if (var5.anIntArray3178[var7] >= 0 && Class108.anInt1816 > var5.anIntArray3178[var7]) {
							Class142 var8 = JunkTex.method605(96, var5.anIntArray3178[var7]);
							if (var8.aClass55_2260 != null) {
								Class14_Sub1 var9 = (Class14_Sub1) var8.aClass55_2260.get(var2);
								if (var9 != null) {
									if (!var0) {
										var6 += var9.anInt2714;
									} else {
										var6 += var5.anIntArray3177[var7] * var9.anInt2714;
									}
								}
							}
						}
					}

					return var6;
				}
			}
		} catch (Throwable var10) {
			throw Util.error(var10, "ck.B(" + var0 + ',' + var1 + ',' + var2 + ',' + var3 + ')');
		}
	}
}
