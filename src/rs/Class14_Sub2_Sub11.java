/* Class14_Sub2_Sub11 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;
import com.jagex.util.MouseCapturer;

public class Class14_Sub2_Sub11 extends Cacheable {
	public static int[] y_occluders = new int[2];
	public static int anInt3874;
	public Class124 aClass124_3876;
	public static MouseCapturer aClass100_3878;
	public static int anInt3881 = 0;
	public int[] anIntArray3882;
	public static int anInt3884 = 0;
	public int[] anIntArray3885;
	public int[] anIntArray3886;
	public int[] anIntArray3888;
	public static int anInt3889 = 0;
	public static Class124 aClass124_3892 = Class124.method263("cookieprefix");

	public int method308(byte i, int i_0_) {
		if (anIntArray3885 == null) {
			int i_1_ = -1;
			return i_1_;
		}
		int i_2_ = 0;
		int i_3_ = 66 % ((i + 15) / 38);
		for (/**/; anIntArray3885.length > i_2_; i_2_++) {
			if (i_0_ == anIntArray3888[i_2_])
				return anIntArray3885[i_2_];
		}
		return -1;
	}

	public static void method309(Class45[] class45s, int i, byte i_4_, int i_5_) {
		if (i_5_ < i) {
			int i_6_ = i_5_ - 1;
			int i_7_ = i + 1;
			int i_8_ = (i_5_ + i) / 2;
			Class45 class45 = class45s[i_8_];
			class45s[i_8_] = class45s[i_5_];
			class45s[i_5_] = class45;
			while (i_7_ > i_6_) {
				boolean bool = true;
				do {
					i_7_--;
					for (int i_9_ = 0; i_9_ < 4; i_9_++) {
						int i_10_;
						int i_11_;
						if (Static2.anIntArray1086[i_9_] != 2) {
							if (Static2.anIntArray1086[i_9_] != 1) {
								if (Static2.anIntArray1086[i_9_] != 3) {
									i_11_ = class45.anInt744;
									i_10_ = class45s[i_7_].anInt744;
								} else {
									i_11_ = class45.aBoolean749 ? 1 : 0;
									i_10_ = !class45s[i_7_].aBoolean749 ? 0 : 1;
								}
							} else {
								i_11_ = class45.anInt752;
								i_10_ = class45s[i_7_].anInt752;
								if (i_10_ == -1 && Class45.anIntArray737[i_9_] == 1)
									i_10_ = 2001;
								if (i_11_ == -1 && Class45.anIntArray737[i_9_] == 1)
									i_11_ = 2001;
							}
						} else {
							i_10_ = class45s[i_7_].anInt742;
							i_11_ = class45.anInt742;
						}
						if (i_11_ != i_10_) {
							if ((Class45.anIntArray737[i_9_] != 1 || i_11_ >= i_10_)
									&& (Class45.anIntArray737[i_9_] != 0 || i_11_ <= i_10_))
								bool = false;
							break;
						}
						if (i_9_ == 3)
							bool = false;
					}
				} while (bool);
				bool = true;
				do {
					i_6_++;
					for (int i_12_ = 0; i_12_ < 4; i_12_++) {
						int i_13_;
						int i_14_;
						if (Static2.anIntArray1086[i_12_] == 2) {
							i_13_ = class45.anInt742;
							i_14_ = class45s[i_6_].anInt742;
						} else if (Static2.anIntArray1086[i_12_] == 1) {
							i_13_ = class45.anInt752;
							if (i_13_ == -1 && Class45.anIntArray737[i_12_] == 1)
								i_13_ = 2001;
							i_14_ = class45s[i_6_].anInt752;
							if (i_14_ == -1 && Class45.anIntArray737[i_12_] == 1)
								i_14_ = 2001;
						} else if (Static2.anIntArray1086[i_12_] == 3) {
							i_14_ = !class45s[i_6_].aBoolean749 ? 0 : 1;
							i_13_ = class45.aBoolean749 ? 1 : 0;
						} else {
							i_13_ = class45.anInt744;
							i_14_ = class45s[i_6_].anInt744;
						}
						if (i_14_ == i_13_) {
							if (i_12_ == 3)
								bool = false;
						} else {
							if ((Class45.anIntArray737[i_12_] != 1 || i_13_ <= i_14_)
									&& (Class45.anIntArray737[i_12_] != 0 || i_13_ >= i_14_))
								bool = false;
							break;
						}
					}
				} while (bool);
				if (i_7_ > i_6_) {
					Class45 class45_15_ = class45s[i_6_];
					class45s[i_6_] = class45s[i_7_];
					class45s[i_7_] = class45_15_;
				}
			}
			method309(class45s, i_7_, (byte) 106, i_5_);
			method309(class45s, i, (byte) 122, i_7_ + 1);
		}
		if (i_4_ <= 98)
			method316(112L, -97);
	}

	public void method310(int i) {
		if (anIntArray3882 != null) {
			for (int i_16_ = 0; i_16_ < anIntArray3882.length; i_16_++)
				anIntArray3882[i_16_] = Class66.method1294(anIntArray3882[i_16_], 32768);
		}
		if (anIntArray3885 != null) {
			for (int i_17_ = 0; anIntArray3885.length > i_17_; i_17_++)
				anIntArray3885[i_17_] = Class66.method1294(anIntArray3885[i_17_], 32768);
		}
		if (i != 18859)
			anInt3881 = 98;
	}

	public int method311(int i, int i_18_) {
		if (anIntArray3882 == null) {
			int i_19_ = -1;
			return i_19_;
		}
		for (int i_20_ = 0; i_20_ < anIntArray3882.length; i_20_++) {
			if (anIntArray3886[i_20_] == i)
				return anIntArray3882[i_20_];
		}
		if (i_18_ >= -116)
			method308((byte) 45, 111);
		return -1;
	}

	public void method312(Buffer class14_sub10, byte i, int i_21_) {
		if (i_21_ == 1)
			aClass124_3876 = class14_sub10.method797();
		else if (i_21_ == 2) {
			int i_22_ = class14_sub10.readUByte();
			anIntArray3885 = new int[i_22_];
			anIntArray3888 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				anIntArray3885[i_23_] = class14_sub10.readUShort();
				int i_24_ = class14_sub10.readUByte();
				if (i_24_ == 0)
					anIntArray3888[i_23_] = -1;
				else
					anIntArray3888[i_23_] = i_24_;
			}
		} else if (i_21_ == 3) {
			int i_25_ = class14_sub10.readUByte();
			anIntArray3886 = new int[i_25_];
			anIntArray3882 = new int[i_25_];
			for (int i_26_ = 0; i_26_ < i_25_; i_26_++) {
				anIntArray3882[i_26_] = class14_sub10.readUShort();
				int i_27_ = class14_sub10.readUByte();
				if (i_27_ != 0)
					anIntArray3886[i_26_] = i_27_;
				else
					anIntArray3886[i_26_] = -1;
			}
		}
	}

	public static void method313(int i) {
		aClass124_3892 = null;
		aClass100_3878 = null;
		if (i >= 77)
			y_occluders = null;
	}

	public static void method314(byte i, int i_28_, int i_29_, int i_30_, int i_31_) {
		if (i > 61) {
			for (Class14_Sub3 class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) Class152.aClass2_2438.getNext())
				Class58.method1255(i_30_, class14_sub3, i_29_, i_28_, -31083, i_31_);
			for (Class14_Sub3 class14_sub3 = (Class14_Sub3) JunkTex.aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) JunkTex.aClass2_683.getNext()) {
				int i_32_ = 1;
				if (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3433 != class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3452) {
					if (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3456 == class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3452)
						i_32_ = 2;
				} else
					i_32_ = 0;
				if (i_32_ != class14_sub3.anInt2756) {
					int i_33_ = Static2.method1500((class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762), -1);
					if (class14_sub3.anInt2753 != i_33_) {
						if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
							Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
							class14_sub3.aClass14_Sub9_Sub4_2775 = null;
						}
						class14_sub3.anInt2753 = i_33_;
					}
					class14_sub3.anInt2756 = i_32_;
				}
				class14_sub3.anInt2751 = (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3493 * 64
						+ class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3436);
				class14_sub3.anInt2774 = class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3495;
				class14_sub3.anInt2761 = (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3493 * 64
						+ class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3495);
				class14_sub3.anInt2767 = class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3436;
				Class58.method1255(i_30_, class14_sub3, i_29_, i_28_, -31083, i_31_);
			}
			for (Class14_Sub3 class14_sub3 = ((Class14_Sub3) Class88.aClass55_1398
					.getFirst()); class14_sub3 != null; class14_sub3 = (Class14_Sub3) Class88.aClass55_1398
							.getNext()) {
				int i_34_ = 1;
				if (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3433 == class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3452)
					i_34_ = 0;
				else if (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3456 == class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3452)
					i_34_ = 2;
				if (i_34_ != class14_sub3.anInt2756) {
					int i_35_ = Class116.method1597(false, (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755));
					if (class14_sub3.anInt2753 != i_35_) {
						if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
							Class33.aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
							class14_sub3.aClass14_Sub9_Sub4_2775 = null;
						}
						class14_sub3.anInt2753 = i_35_;
					}
					class14_sub3.anInt2756 = i_34_;
				}
				class14_sub3.anInt2767 = class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3436;
				class14_sub3.anInt2761 = (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3493 * 64
						+ class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3495);
				class14_sub3.anInt2774 = class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3495;
				class14_sub3.anInt2751 = (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3493 * 64
						+ class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3436);
				Class58.method1255(i_30_, class14_sub3, i_29_, i_28_, -31083, i_31_);
			}
		}
	}

	public void method315(byte i, Buffer class14_sub10) {
		for (;;) {
			int i_36_ = class14_sub10.readUByte();
			if (i_36_ == 0)
				break;
			method312(class14_sub10, (byte) 30, i_36_);
		}
		if (i > -118)
			aClass100_3878 = null;
	}

	public static void method316(long l, int i) {
		JunkTex.aClass14_Sub10_Sub1_891.position = 0;
		JunkTex.aClass14_Sub10_Sub1_891.writeByte(118);
		JunkTex.aClass14_Sub10_Sub1_891.method817(l);
		Static2.anInt2734 = -3;
		Static2.anInt2136 = 0;
		if (i != 24967)
			method314((byte) 35, 43, -40, -1, 83);
		JunkTex.anInt4686 = 0;
		Class56.anInt918 = 1;
	}
}
