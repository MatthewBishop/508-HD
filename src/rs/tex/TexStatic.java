package rs.tex;

public class TexStatic {

	public static void method1117(int il, int i_44_, int i_45_) {
		if (i_45_ != anInt1876) {
			anIntArray4145 = new int[i_45_];
			for (int i_46_ = 0; i_46_ < i_45_; i_46_++)
				anIntArray4145[i_46_] = (i_46_ << 12) / i_45_;
			anInt1876 = i_45_;
			anInt1288 = i_45_ != 64 ? 4096 : 2048;
			anInt4882 = i_45_ - 1;
		}
		if (anInt407 != i_44_) {
			if (anInt1876 != i_44_) {
				anIntArray3623 = new int[i_44_];
				for (int i_47_ = 0; i_44_ > i_47_; i_47_++)
					anIntArray3623[i_47_] = (i_47_ << 44) / i_44_;
			} else
				anIntArray3623 = anIntArray4145;
			anInt407 = i_44_;
			anInt1927 = i_44_ - 1;
		}
	}

	public static int anInt1876;
	public static int anInt1927;
	public static int anInt407;
	public static void kill() {
		anIntArray4145 = null;
		anIntArray3623 = null;

		anIntArray4435 = null;
		anIntArray3357 = null;
	}

	public static int[] anIntArray3623;
	public static int anInt4882;
	public static int anInt1288;
	public static int[] anIntArray4145;
	
	public static void method321(int i) {
		if (anIntArray4435 == null || anIntArray3357 == null) {
			anIntArray3357 = new int[256];
			anIntArray4435 = new int[256];
			for (int i_5_ = 0; i_5_ < 256; i_5_++) {
				double d = (double) i_5_ / 255.0 * 6.283185307179586;
				anIntArray4435[i_5_] = (int) (Math.sin(d) * 4096.0);
				anIntArray3357[i_5_] = (int) (Math.cos(d) * 4096.0);
			}
		}
	}

	public static int[] anIntArray4435;
	public static int[] anIntArray3357;

}
