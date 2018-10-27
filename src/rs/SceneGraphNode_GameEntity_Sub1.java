/* Class133_Sub1_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.cache.anim.AnimLoader;
import com.jagex.io.Buffer;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.ref.SoftCache;
import com.jagex.map.SceneCluster;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.RT4GL;

public class SceneGraphNode_GameEntity_Sub1 extends SceneGraphNode_GameEntity {
	public int anInt4902;
	public int anInt4904 = -1;
	public int anInt4905;
	public int anInt4906;
	public int anInt4908;
	public int anInt4909 = -1;
	public int anInt4910;
	public short aShort4913;
	public int anInt4914;
	public static Class148 aClass148_4915;
	public int anInt4916 = 0;
	public int anInt4917;
	public int anInt4920;
	public boolean aBoolean4921 = false;
	public Class124 aClass124_4922;
	public int anInt4924;
	public static SoftCache aClass52_4926 = new SoftCache(64);
	public short aShort4927;
	public int anInt4928;
	public int anInt4929;
	public int anInt4931;
	public int anInt4932;
	public SceneGraphNode_AbstractModelRenderer aSceneGraphNode_AbstractModelRenderer_4933;
	public int anInt4934;
	public static int anInt4936 = 0;
	public int anInt4937;
	public static Class148_Sub1[] aClass148_Sub1Array4938;
	public static Class36 aClass36_4939;
	public int anInt4940;
	public Class102 aClass102_4941;
	public static Class124 aClass124_4942 = Class124.method263("blaugr-Un:");
	public static Class124 aClass124_4943 = Class124.method263("ul");

	public static int method1805(int i, FileSystem fileSystem) {
		int i_0_ = 0;
		if (i != 31673)
			method1805(-105, null);
		if (fileSystem.method171(Class7_Sub3.anInt2681))
			i_0_++;
		if (fileSystem.method171(JunkTex.anInt2389))
			i_0_++;
		if (fileSystem.method171(Class36.anInt629))
			i_0_++;
		if (fileSystem.method171(Class14_Sub2_Sub3.anInt3787))
			i_0_++;
		if (fileSystem.method171(Class153.anInt2450))
			i_0_++;
		if (fileSystem.method171(SceneGraphNode_AnimatedLocation.anInt3584))
			i_0_++;
		if (fileSystem.method171(Static2.anInt5087))
			i_0_++;
		if (fileSystem.method171(SceneCluster.anInt1369))
			i_0_++;
		if (fileSystem.method171(Class38.anInt2618))
			i_0_++;
		if (fileSystem.method171(Class58.anInt937))
			i_0_++;
		if (fileSystem.method171(Class111.anInt1857))
			i_0_++;
		if (fileSystem.method171(JunkTex.anInt4735))
			i_0_++;
		if (fileSystem.method171(Class82.anInt1334))
			i_0_++;
		if (fileSystem.method171(Static2.anInt2688))
			i_0_++;
		if (fileSystem.method171(JunkTex.anInt2720))
			i_0_++;
		if (fileSystem.method171(JunkTex.anInt4310))
			i_0_++;
		int i_1_ = i_0_;
		return i_1_;
	}

	public static void method1806(int i) {
		aClass52_4926 = null;
		aClass124_4943 = null;
		aClass148_Sub1Array4938 = null;
		aClass124_4942 = null;
		aClass36_4939 = null;
		aClass148_4915 = null;
		if (i < 112)
			aClass124_4943 = null;
	}

	@Override
	public boolean method1804(byte i) {
		if (i != 115)
			method1808(true);
		if (aClass102_4941 == null) {
			boolean bool = false;
			return bool;
		}
		boolean bool = true;
		return bool;
	}

	@Override
	public void render(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, long l) {
		if (aClass102_4941 != null) {
			Animation animation = (anInt3445 != -1 && anInt3467 == 0 ? AnimLoader.method1129(anInt3445) : null);
			Animation class46_9_ = (anInt3452 != -1 && !aBoolean4921 && (anInt3452 != anInt3433 || animation == null)
					? AnimLoader.method1129(anInt3452) : null);
			SceneGraphNode_AbstractModelRenderer class133_sub7 = aClass102_4941.method1516(class46_9_, anInt3483, -13, anInt3501, animation);
			if (class133_sub7 != null) {
				anInt3449 = class133_sub7.getMinYorMaxYCheckTHIS();
				if (JunkTex.aBoolean4518 && (aClass102_4941.anInt1720 == -1
						|| (Static2.method1744(aClass102_4941.anInt1720, 170).aBoolean330))) {
					SceneGraphNode_AbstractModelRenderer class133_sub7_10_ = Static2.method1359(-10345, anInt3495,
							(class46_9_ == null ? animation : class46_9_), class133_sub7, 0, 160, anInt3500, 240, 0, i,
							anInt3436, (class46_9_ != null ? anInt3483 : anInt3501), 1, aBoolean3488);
					float f = RT4GL.method1653();
					float f_11_ = RT4GL.method1624();
					RT4GL.method1646();
					RT4GL.setupSomeCustomProjection(f, f_11_ - 150.0F);
					class133_sub7_10_.render(0, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, -1L);
					RT4GL.enableDepthBufferWriting();
					RT4GL.setupSomeCustomProjection(f, f_11_);
				}
				if (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748 == this) {
					for (int i_12_ = Static2.aClass66Array3721.length - 1; i_12_ >= 0; i_12_--) {
						Class66 class66 = Static2.aClass66Array3721[i_12_];
						if (class66 != null && class66.anInt1043 != -1) {
							if (class66.anInt1046 == 1 && class66.anInt1049 >= 0
									&& ((Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785).length > class66.anInt1049)) {
								SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2 = (Class14_Sub4.aSceneGraphNode_GameEntity_Sub2Array2785[class66.anInt1049]);
								if (class133_sub1_sub2 != null) {
									int i_13_ = (-((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) / 32)
											+ (class133_sub1_sub2.anInt3495 / 32));
									int i_14_ = (-((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) / 32)
											+ (class133_sub1_sub2.anInt3436 / 32));
									method1809(i_4_, i_2_, class133_sub7, class66.anInt1043, i, i_3_, i_8_, i_6_,
											-14498, i_5_, i_13_, i_14_, i_7_);
								}
							}
							if (class66.anInt1046 == 2) {
								int i_15_ = ((-SceneGraphNode_Projectile.anInt3676 + class66.anInt1047) * 4
										+ (-((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) / 32) + 2));
								int i_16_ = ((-Class58.anInt947 + class66.anInt1044) * 4
										+ (-((Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) / 32) + 2));
								method1809(i_4_, i_2_, class133_sub7, class66.anInt1043, i, i_3_, i_8_, i_6_, -14498,
										i_5_, i_15_, i_16_, i_7_);
							}
							if (class66.anInt1046 == 10 && class66.anInt1049 >= 0
									&& (class66.anInt1049 < (JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474).length)) {
								SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1_17_ = (JunkTex.aSceneGraphNode_GameEntity_Sub1Array4474[class66.anInt1049]);
								if (class133_sub1_sub1_17_ != null) {
									int i_18_ = ((class133_sub1_sub1_17_.anInt3495 / 32)
											- (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495) / 32);
									int i_19_ = ((class133_sub1_sub1_17_.anInt3436 / 32)
											- (Class14_Sub3.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436) / 32);
									method1809(i_4_, i_2_, class133_sub7, class66.anInt1043, i, i_3_, i_8_, i_6_,
											-14498, i_5_, i_18_, i_19_, i_7_);
								}
							}
						}
					}
				}
				int i_20_ = 0;
				int i_21_ = 0;
				int i_22_ = 0;
				if (aShort4927 != 0 && aShort4913 != 0) {
					int i_23_ = SDRaster.cos[i];
					int i_24_ = SDRaster.sin[i];
					int i_25_ = aShort4913;
					int i_26_ = aShort4927;
					int i_27_ = -i_26_ / 2;
					int i_28_ = -i_25_ / 2;
					int i_29_ = i_24_ * i_28_ + i_27_ * i_23_ >> 48;
					int i_30_ = -(i_27_ * i_24_) + i_28_ * i_23_ >> 48;
					int i_31_ = -i_25_ / 2;
					int i_32_ = i_26_ / 2;
					int i_33_ = -i_26_ / 2;
					int i_34_ = -(i_32_ * i_24_) + i_23_ * i_31_ >> 48;
					int i_35_ = JunkTex.method1017(i_29_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) -125,
							i_30_ + anInt3436);
					int i_36_ = i_31_ * i_24_ + i_23_ * i_32_ >> 16;
					int i_37_ = JunkTex.method1017(i_36_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) 92,
							i_34_ + anInt3436);
					int i_38_ = i_25_ / 2;
					int i_39_ = i_38_ * i_24_ + i_33_ * i_23_ >> 16;
					int i_40_ = i_38_ * i_23_ - i_33_ * i_24_ >> 48;
					int i_41_ = i_26_ / 2;
					int i_42_ = JunkTex.method1017(i_39_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) 15,
							i_40_ + anInt3436);
					int i_43_ = i_25_ / 2;
					int i_44_ = i_23_ * i_41_ + i_43_ * i_24_ >> 48;
					int i_45_ = i_23_ * i_43_ - i_41_ * i_24_ >> 16;
					int i_46_ = i_37_ <= i_35_ ? i_37_ : i_35_;
					int i_47_ = JunkTex.method1017(i_44_ + anInt3495, Class14_Sub2_Sub3.gameLevel, (byte) -127,
							anInt3436 + i_45_);
					i_22_ = i_47_ + i_35_;
					if (i_22_ > i_42_ + i_37_)
						i_22_ = i_42_ + i_37_;
					int i_48_ = i_47_ <= i_37_ ? i_47_ : i_37_;
					int i_49_ = i_42_ <= i_35_ ? i_42_ : i_35_;
					int i_50_ = i_42_ >= i_47_ ? i_47_ : i_42_;
					i_21_ = (int) (Math.atan2(i_46_ - i_50_, i_25_) * 325.95) & 0x7ff;
					if (i_21_ != 0)
						class133_sub7.method1861(i_21_);
					i_20_ = (int) (Math.atan2(-i_48_ + i_49_, i_26_) * 325.95) & 0x7ff;
					if (i_20_ != 0)
						class133_sub7.method1858(i_20_);
					i_22_ = (i_22_ >> 1) - anInt3500;
					if (i_22_ != 0)
						class133_sub7.method1855(0, i_22_, 0);
				}
				SceneGraphNode_AbstractModelRenderer class133_sub7_51_ = null;
				if (!aBoolean4921 && anInt3487 != -1 && anInt3470 != -1) {
					Class60 class60 = Class127.method1749(anInt3487, (byte) -123);
					class133_sub7_51_ = class60.method1267(0, anInt3470);
					if (class133_sub7_51_ != null) {
						class133_sub7_51_.method1855(0, -anInt3475, 0);
						if (class60.aBoolean978) {
							if (i_21_ != 0)
								class133_sub7_51_.method1861(i_21_);
							if (i_20_ != 0)
								class133_sub7_51_.method1858(i_20_);
							if (i_22_ != 0)
								class133_sub7_51_.method1855(0, i_22_, 0);
						}
					}
				}
				SceneGraphNode_AbstractModelRenderer class133_sub7_52_ = null;
				if (!aBoolean4921 && aSceneGraphNode_AbstractModelRenderer_4933 != null) {
					if (anInt4910 <= Class14_Sub2_Sub20.anInt4064)
						aSceneGraphNode_AbstractModelRenderer_4933 = null;
					if (anInt4929 <= Class14_Sub2_Sub20.anInt4064 && anInt4910 > Class14_Sub2_Sub20.anInt4064) {
						class133_sub7_52_ = aSceneGraphNode_AbstractModelRenderer_4933;
						class133_sub7_52_.method1855(-anInt3495 + anInt4934, -anInt3500 + anInt4931,
								anInt4920 - anInt3436);
						if (anInt3469 == 512)
							class133_sub7_52_.method1875();
						else if (anInt3469 != 1024) {
							if (anInt3469 == 1536)
								class133_sub7_52_.method1871();
						} else
							class133_sub7_52_.method1872();
					}
				}
				class133_sub7.haveActions = true;
				class133_sub7.render(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, l);
				if (class133_sub7_51_ != null) {
					class133_sub7_51_.haveActions = true;
					class133_sub7_51_.render(i, i_2_, i_3_, i_4_, i_5_, i_6_, i_7_, i_8_, l);
				}
				if (class133_sub7_52_ != null) {
					if (anInt3469 == 512)
						class133_sub7_52_.method1871();
					else if (anInt3469 == 1024)
						class133_sub7_52_.method1872();
					else if (anInt3469 == 1536)
						class133_sub7_52_.method1875();
					class133_sub7_52_.method1855(anInt3495 - anInt4934, -anInt4931 + anInt3500, -anInt4920 + anInt3436);
				}
			}
		}
	}

	@Override
	public int getMinYorMaxYCheckTHIS() {
		int i = anInt3449;
		return i;
	}

	public void method1807(byte i, Buffer class14_sub10) {
		class14_sub10.position = 0;
		int i_53_ = class14_sub10.readUByte();
		if ((i_53_ & 0x2) != 2) {
			aShort4927 = (short) 0;
			aShort4913 = (short) 0;
		} else {
			aShort4927 = (short) (class14_sub10.readUByte() << 34);
			aShort4913 = (short) (class14_sub10.readUByte() << 34);
		}
		anInt4905 = (i_53_ & 0xc3) >> 6;
		int i_54_ = i_53_ & 0x1;
		boolean bool = (i_53_ & 0x4) != 0;
		int i_55_ = -1;
		int[] is = new int[12];
		int i_56_ = anInt3493;
		anInt3493 = ((i_53_ & 0x3f) >> 3) + 1;
		anInt3436 += (-i_56_ + anInt3493) * 64;
		anInt3495 += (anInt3493 - i_56_) * 64;
		anInt4902 = class14_sub10.method780();
		anInt4904 = class14_sub10.method780();
		anInt4916 = 0;
		for (int i_57_ = 0; i_57_ < 12; i_57_++) {
			int i_58_ = class14_sub10.readUByte();
			if (i_58_ == 0)
				is[i_57_] = 0;
			else {
				int i_59_ = class14_sub10.readUByte();
				int i_60_ = i_59_ + (i_58_ << 8);
				if (i_57_ == 0 && i_60_ == 65535) {
					i_55_ = class14_sub10.readUShort();
					break;
				}
				if (i_60_ >= 32768) {
					i_60_ = Static2.anIntArray1809[i_60_ - 32768];
					is[i_57_] = Class66.method1294(i_60_, 1073741824);
					int i_61_ = JunkTex.method605(78, i_60_).anInt2310;
					if (i_61_ != 0)
						anInt4916 = i_61_;
				} else
					is[i_57_] = Class66.method1294(i_60_ - 256, -2147483648);
			}
		}
		int[] is_62_ = new int[5];
		for (int i_63_ = 0; i_63_ < 5; i_63_++) {
			int i_64_ = class14_sub10.readUByte();
			if (i_64_ < 0 || i_64_ >= (JunkTex.aShortArrayArray4496[i_63_]).length)
				i_64_ = 0;
			is_62_[i_63_] = i_64_;
		}
		anInt3433 = class14_sub10.readUShort();
		if (anInt3433 == 65535)
			anInt3433 = -1;
		if (i >= -115)
			method1804((byte) -20);
		anInt3471 = class14_sub10.readUShort();
		if (anInt3471 == 65535)
			anInt3471 = -1;
		anInt3454 = anInt3471;
		anInt3457 = class14_sub10.readUShort();
		if (anInt3457 == 65535)
			anInt3457 = -1;
		anInt3484 = class14_sub10.readUShort();
		if (anInt3484 == 65535)
			anInt3484 = -1;
		anInt3463 = class14_sub10.readUShort();
		if (anInt3463 == 65535)
			anInt3463 = -1;
		anInt3432 = class14_sub10.readUShort();
		if (anInt3432 == 65535)
			anInt3432 = -1;
		anInt3456 = class14_sub10.readUShort();
		if (anInt3456 == 65535)
			anInt3456 = -1;
		aClass124_4922 = Static2.method1174(class14_sub10.method796(31), (byte) 94).method1685(0);
		anInt4937 = class14_sub10.readUByte();
		if (!bool)
			anInt4928 = 0;
		else
			anInt4928 = class14_sub10.readUShort();
		int i_65_ = anInt4917;
		anInt4917 = class14_sub10.readUByte();
		if (anInt4917 == 0)
			JunkTex.method551(this, -574);
		else {
			int i_66_ = anInt4909;
			int i_67_ = anInt4940;
			int i_68_ = anInt4932;
			anInt4909 = class14_sub10.readUShort();
			anInt4940 = class14_sub10.readUShort();
			anInt4932 = class14_sub10.readUShort();
			if (i_65_ != anInt4917 || anInt4909 != i_66_ || i_67_ != anInt4940 || anInt4932 != i_68_)
				SceneGraphNode_AnimatedLocation.method1839(this, (byte) 7);
		}
		if (aClass102_4941 == null)
			aClass102_4941 = new Class102();
		aClass102_4941.method1522(is, i_55_, i_54_ == 1, is_62_, -82);
	}

	public Class124 method1808(boolean bool) {
		if (!bool) {
			Class124 class124 = null;
			return class124;
		}
		Class124 class124 = aClass124_4922;
		if (Class7_Sub2.aClass124Array2674 != null)
			class124 = JunkTex
					.method515((new Class124[] { (Class7_Sub2.aClass124Array2674[anInt4905]), class124 }), (byte) -20);
		if (JunkTex.aClass124Array859 != null)
			class124 = JunkTex
					.method515((new Class124[] { class124, (JunkTex.aClass124Array859[anInt4905]) }), (byte) -1);
		Class124 class124_69_ = class124;
		return class124_69_;
	}

	public void method1809(int i, int i_70_, SceneGraphNode_AbstractModelRenderer class133_sub7, int i_71_, int i_72_, int i_73_, int i_74_,
			int i_75_, int i_76_, int i_77_, int i_78_, int i_79_, int i_80_) {
		if (i_76_ == -14498) {
			int i_81_ = i_79_ * i_79_ + i_78_ * i_78_;
			if (i_81_ >= 16 && i_81_ <= 360000) {
				i_81_ = (int) (Math.atan2(i_78_, i_79_) * 325.949) & 0x7ff;
				SceneGraphNode_AbstractModelRenderer class133_sub7_82_ = JunkTex.method672(anInt3436, anInt3500, i_71_, 4435, i_81_,
						class133_sub7, anInt3495);
				if (class133_sub7_82_ != null) {
					float f = RT4GL.method1653();
					float f_83_ = RT4GL.method1624();
					RT4GL.method1646();
					RT4GL.setupSomeCustomProjection(f, f_83_ - 150.0F);
					class133_sub7_82_.render(0, i_70_, i_73_, i, i_77_, i_75_, i_80_, i_74_, -1L);
					RT4GL.enableDepthBufferWriting();
					RT4GL.setupSomeCustomProjection(f, f_83_);
				}
			}
		}
	}

	public static void method1810(int i, int i_84_, int i_85_, int i_86_, int i_87_, int i_88_, int i_89_, int i_90_,
			int i_91_) {
		if (i_85_ <= -11) {
			int i_92_ = -i_86_ + i;
			int i_93_ = i_90_ - i_88_;
			int i_94_ = (i_87_ - i_91_ << 48) / i_92_;
			int i_95_ = (-i_84_ + i_89_ << 48) / i_93_;
			Class124.method1667(i_91_, i_86_, 0, i, 0, i_95_, i_94_, 1, i_84_, i_88_, i_90_);
		}
	}

	public SceneGraphNode_GameEntity_Sub1() {
		anInt4905 = 0;
		aShort4913 = (short) 0;
		anInt4917 = 0;
		anInt4929 = 0;
		aShort4927 = (short) 0;
		anInt4928 = 0;
		anInt4910 = 0;
		anInt4932 = -1;
		anInt4902 = -1;
		anInt4937 = 0;
		anInt4940 = -1;
	}
}
