/* Class14_Sub2_Sub3 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;
import com.jagex.link.HashTable;
import com.jagex.link.Linkable;
import com.jagex.rt4.IntegerNode;

public class Class14_Sub2_Sub3 extends Cacheable {
	public static int anInt3771 = 0;
	public static int[] anIntArray3773;
	public static Class124 aClass124_3774 = Class124.method263(":tradereq:");
	public static Class124 aClass124_3778 = Class124.method263("T");
	public HashTable aClass55_3783;
	public static int gameLevel;
	public static int anInt3787;

	public int method267(byte i, int i_0_, int i_1_) {
		if (aClass55_3783 == null) {
			int i_2_ = i_1_;
			return i_2_;
		}
		IntegerNode class14_sub1 = (IntegerNode) aClass55_3783.get(i_0_);
		if (class14_sub1 == null) {
			int i_3_ = i_1_;
			return i_3_;
		}
		int i_4_ = class14_sub1.value;
		return i_4_;
	}

	public void method268(Buffer class14_sub10, int i) {
		for (;;) {
			int i_5_ = class14_sub10.readUByte();
			if (i_5_ == 0)
				break;
			method273((byte) 127, i_5_, class14_sub10);
		}
		if (i != -1)
			method272(70, (byte) -7);
	}

	public static Class14_Sub2_Sub21 method272(int i, byte i_16_) {
		Class14_Sub2_Sub21 class14_sub2_sub21 = (Class14_Sub2_Sub21) Static2.aClass20_599.get(i);
		if (class14_sub2_sub21 != null) {
			Class14_Sub2_Sub21 class14_sub2_sub21_17_ = class14_sub2_sub21;
			return class14_sub2_sub21_17_;
		}
		byte[] is;
		if (i >= 32768)
			is = JunkTex.aFileSystem_4384.method163(i & 0x7fff, 1);
		else
			is = Static2.aFileSystem_3850.method163(i, 1);
		Class14_Sub2_Sub21 class14_sub2_sub21_18_ = new Class14_Sub2_Sub21();
		if (is != null)
			class14_sub2_sub21_18_.method437(new Buffer(is), 99);
		if (i_16_ < 30) {
			class14_sub2_sub21 = null;
			return class14_sub2_sub21;
		}
		if (i >= 32768)
			class14_sub2_sub21_18_.method439(19712);
		Static2.aClass20_599.put(class14_sub2_sub21_18_, i);
		class14_sub2_sub21 = class14_sub2_sub21_18_;
		return class14_sub2_sub21;
	}

	public void method273(byte i, int i_19_, Buffer class14_sub10) {
		if (i <= 31)
			method267((byte) -101, 92, -126);
		if (i_19_ == 249) {
			int i_20_ = class14_sub10.readUByte();
			if (aClass55_3783 == null) {
				int i_21_ = JunkTex.method653(i_20_);
				aClass55_3783 = new HashTable(i_21_);
			}
			for (int i_22_ = 0; i_20_ > i_22_; i_22_++) {
				boolean bool = class14_sub10.readUByte() == 1;
				int i_23_ = class14_sub10.readMedium(-119);
				Linkable linkable;
				if (bool)
					linkable = new Class14_Sub30(class14_sub10.getJagexString());
				else
					linkable = new IntegerNode(class14_sub10.getInt((byte) -112));
				aClass55_3783.put(i_23_, linkable);
			}
		}
	}

	public static void method274(Class124 class124, int i) {
		for (Class14_Sub2_Sub5 class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
				.getFront(); class14_sub2_sub5 != null; class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
						.getNext()) {
			if (class14_sub2_sub5.aClass124_3804.method1704(class124)) {
				Class7_Sub1.aClass14_Sub2_Sub5_2665 = class14_sub2_sub5;
				return;
			}
		}
		if (i <= 93)
			aClass124_3774 = null;
	}

	public Class124 method275(int i, int i_24_, Class124 class124) {
		if (i_24_ != 1)
			anInt3787 = 56;
		if (aClass55_3783 == null) {
			Class124 class124_25_ = class124;
			return class124_25_;
		}
		Class14_Sub30 class14_sub30 = (Class14_Sub30) aClass55_3783.get(i);
		if (class14_sub30 == null) {
			Class124 class124_26_ = class124;
			return class124_26_;
		}
		Class124 class124_27_ = class14_sub30.aClass124_3270;
		return class124_27_;
	}

	public static void method276(int i) {
		if (i == -15348) {
			anIntArray3773 = null;
			aClass124_3778 = null;
			aClass124_3774 = null;
		}
	}

	public static boolean method277(int i, int i_28_, int i_29_, int i_31_, boolean bool, int i_32_, int i_33_,
			int i_34_, int i_35_, int i_36_, int i_37_) {
		for (int i_38_ = 0; i_38_ < 104; i_38_++) {
			for (int i_39_ = 0; i_39_ < 104; i_39_++) {
				Class33.anIntArrayArray575[i_38_][i_39_] = 0;
				Class137.anIntArrayArray2203[i_38_][i_39_] = 99999999;
			}
		}
		Class33.anIntArrayArray575[i_28_][i_33_] = 99;
		Class137.anIntArrayArray2203[i_28_][i_33_] = 0;
		int i_40_ = i_28_;
		int i_41_ = i_33_;
		int i_42_ = 0;
		JunkTex.anIntArray4691[i_42_] = i_28_;
		int i_43_ = 0;
		boolean bool_44_ = false;
		Class14_Sub2_Sub21.anIntArray4078[i_42_++] = i_33_;
		int[][] is = Class14_Sub21.aClass32Array3100[gameLevel].anIntArrayArray546;
		while (i_42_ != i_43_) {
			i_40_ = JunkTex.anIntArray4691[i_43_];
			i_41_ = Class14_Sub2_Sub21.anIntArray4078[i_43_];
			i_43_ = i_43_ + 1 & 0xfff;
			if (i_31_ == i_40_ && i_41_ == i_34_) {
				bool_44_ = true;
				break;
			}
			if (i != 0) {
				if (i >= 5 && i != 10 || !(Class14_Sub21.aClass32Array3100[gameLevel].method1076(i_36_, 2, i - 1, i_34_,
						i_31_, i_40_, i_41_, 18288))) {
					if (i < 10 && (Class14_Sub21.aClass32Array3100[gameLevel].method1066(2, i - 1, i_40_, i_34_, i_41_,
							(byte) -120, i_36_, i_31_))) {
						bool_44_ = true;
						break;
					}
				} else {
					bool_44_ = true;
					break;
				}
			}
			if (i_35_ != 0 && i_37_ != 0 && (Class14_Sub21.aClass32Array3100[gameLevel].method1078(i_41_, i_37_, i_40_,
					i_32_, (byte) -63, i_31_, i_34_, 2, i_35_))) {
				bool_44_ = true;
				break;
			}
			int i_45_ = Class137.anIntArrayArray2203[i_40_][i_41_] + 1;
			if (i_40_ > 0 && Class33.anIntArrayArray575[i_40_ - 1][i_41_] == 0
					&& (is[i_40_ - 1][i_41_] & 0x12c010e) == 0 && (is[i_40_ - 1][i_41_ + 1] & 0x12c0138) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_;
				i_42_ = i_42_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_40_ - 1][i_41_] = 2;
				Class137.anIntArrayArray2203[i_40_ - 1][i_41_] = i_45_;
			}
			if (i_40_ < 102 && Class33.anIntArrayArray575[i_40_ + 1][i_41_] == 0
					&& (is[i_40_ + 2][i_41_] & 0x12c0183) == 0 && (is[i_40_ + 2][i_41_ + 1] & 0x12c01e0) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_;
				Class33.anIntArrayArray575[i_40_ + 1][i_41_] = 8;
				i_42_ = i_42_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_40_ + 1][i_41_] = i_45_;
			}
			if (i_41_ > 0 && Class33.anIntArrayArray575[i_40_][i_41_ - 1] == 0
					&& (is[i_40_][i_41_ - 1] & 0x12c010e) == 0 && (is[i_40_ + 1][i_41_ - 1] & 0x12c0183) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ - 1;
				Class33.anIntArrayArray575[i_40_][i_41_ - 1] = 1;
				i_42_ = i_42_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_40_][i_41_ - 1] = i_45_;
			}
			if (i_41_ < 102 && Class33.anIntArrayArray575[i_40_][i_41_ + 1] == 0
					&& (is[i_40_][i_41_ + 2] & 0x12c0138) == 0 && (is[i_40_ + 1][i_41_ + 2] & 0x12c01e0) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ + 1;
				Class33.anIntArrayArray575[i_40_][i_41_ + 1] = 4;
				i_42_ = i_42_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_40_][i_41_ + 1] = i_45_;
			}
			if (i_40_ > 0 && i_41_ > 0 && Class33.anIntArrayArray575[i_40_ - 1][i_41_ - 1] == 0
					&& (is[i_40_ - 1][i_41_] & 0x12c0138) == 0 && (is[i_40_ - 1][i_41_ - 1] & 0x12c010e) == 0
					&& (is[i_40_][i_41_ - 1] & 0x12c0183) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ - 1;
				Class33.anIntArrayArray575[i_40_ - 1][i_41_ - 1] = 3;
				i_42_ = i_42_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_40_ - 1][i_41_ - 1] = i_45_;
			}
			if (i_40_ < 102 && i_41_ > 0 && Class33.anIntArrayArray575[i_40_ + 1][i_41_ - 1] == 0
					&& (is[i_40_ + 1][i_41_ - 1] & 0x12c010e) == 0 && (is[i_40_ + 2][i_41_ - 1] & 0x12c0183) == 0
					&& (is[i_40_ + 2][i_41_] & 0x12c01e0) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ - 1;
				Class33.anIntArrayArray575[i_40_ + 1][i_41_ - 1] = 9;
				i_42_ = i_42_ + 1 & 0xfff;
				Class137.anIntArrayArray2203[i_40_ + 1][i_41_ - 1] = i_45_;
			}
			if (i_40_ > 0 && i_41_ < 102 && Class33.anIntArrayArray575[i_40_ - 1][i_41_ + 1] == 0
					&& (is[i_40_ - 1][i_41_ + 1] & 0x12c010e) == 0 && (is[i_40_ - 1][i_41_ + 2] & 0x12c0138) == 0
					&& (is[i_40_][i_41_ + 2] & 0x12c01e0) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ - 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ + 1;
				i_42_ = i_42_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_40_ - 1][i_41_ + 1] = 6;
				Class137.anIntArrayArray2203[i_40_ - 1][i_41_ + 1] = i_45_;
			}
			if (i_40_ < 102 && i_41_ < 102 && Class33.anIntArrayArray575[i_40_ + 1][i_41_ + 1] == 0
					&& (is[i_40_ + 1][i_41_ + 2] & 0x12c0138) == 0 && (is[i_40_ + 2][i_41_ + 2] & 0x12c01e0) == 0
					&& (is[i_40_ + 2][i_41_ + 1] & 0x12c0183) == 0) {
				JunkTex.anIntArray4691[i_42_] = i_40_ + 1;
				Class14_Sub2_Sub21.anIntArray4078[i_42_] = i_41_ + 1;
				i_42_ = i_42_ + 1 & 0xfff;
				Class33.anIntArrayArray575[i_40_ + 1][i_41_ + 1] = 12;
				Class137.anIntArrayArray2203[i_40_ + 1][i_41_ + 1] = i_45_;
			}
		}
		Static2.anInt2911 = 0;
		if (!bool_44_) {
			if (!bool) {
				boolean bool_46_ = false;
				return bool_46_;
			}
			i_42_ = 1000;
			i_43_ = 100;
			int i_47_ = 10;
			for (int i_48_ = -i_47_ + i_31_; i_48_ <= i_31_ + i_47_; i_48_++) {
				for (int i_49_ = i_34_ - i_47_; i_49_ <= i_47_ + i_34_; i_49_++) {
					if (i_48_ >= 0 && i_49_ >= 0 && i_48_ < 104 && i_49_ < 104
							&& Class137.anIntArrayArray2203[i_48_][i_49_] < 100) {
						int i_50_ = 0;
						if (i_31_ <= i_48_) {
							if (i_31_ - (-i_35_ + 1) < i_48_)
								i_50_ = -i_31_ - i_35_ + 1 + i_48_;
						} else
							i_50_ = -i_48_ + i_31_;
						int i_51_ = 0;
						if (i_34_ <= i_49_) {
							if (i_49_ > i_37_ + (i_34_ - 1))
								i_51_ = i_49_ - i_37_ + (-i_34_ + 1);
						} else
							i_51_ = -i_49_ + i_34_;
						int i_52_ = i_51_ * i_51_ + i_50_ * i_50_;
						if (i_42_ > i_52_ || i_42_ == i_52_ && (Class137.anIntArrayArray2203[i_48_][i_49_]) < i_43_) {
							i_40_ = i_48_;
							i_43_ = Class137.anIntArrayArray2203[i_48_][i_49_];
							i_42_ = i_52_;
							i_41_ = i_49_;
						}
					}
				}
			}
			if (i_42_ == 1000) {
				boolean bool_53_ = false;
				return bool_53_;
			}
			if (i_40_ == i_28_ && i_33_ == i_41_) {
				boolean bool_54_ = false;
				return bool_54_;
			}
			Static2.anInt2911 = 1;
		}
		int i_55_ = 0;
		JunkTex.anIntArray4691[i_55_] = i_40_;
		Class14_Sub2_Sub21.anIntArray4078[i_55_++] = i_41_;
		i_43_ = i_42_ = Class33.anIntArrayArray575[i_40_][i_41_];
		while (i_28_ != i_40_ || i_41_ != i_33_) {
			if (i_43_ != i_42_) {
				i_42_ = i_43_;
				JunkTex.anIntArray4691[i_55_] = i_40_;
				Class14_Sub2_Sub21.anIntArray4078[i_55_++] = i_41_;
			}
			if ((i_43_ & 0x2) == 0) {
				if ((i_43_ & 0x8) != 0)
					i_40_--;
			} else
				i_40_++;
			if ((i_43_ & 0x1) != 0)
				i_41_++;
			else if ((i_43_ & 0x4) != 0)
				i_41_--;
			i_43_ = Class33.anIntArrayArray575[i_40_][i_41_];
		}
		if (i_55_ > 0) {
			SceneGraphNode.method1782(-20179, i_55_, i_29_);
			return true;
		}
		if (i_29_ == 1) {
			bool_44_ = false;
			return bool_44_;
		}
		bool_44_ = true;
		return bool_44_;
	}
	
	
}
