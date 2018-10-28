package rs;

import com.jagex.io.js5.CacheFileWorker;
import com.jagex.io.js5.FileSystem;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;
import com.jagex.map.SceneCluster;
import com.jagex.sound.Class14_Sub12_Sub1;
import com.jagex.sound.Track;
import com.jagex.sound.wip.Class120;
import com.jagex.sound.wip.Class14_Sub16;
import com.jagex.sound.wip.Class14_Sub9_Sub1;
import com.jagex.sound.wip.Class14_Sub9_Sub2;
import com.jagex.sound.wip.Class14_Sub9_Sub4;
import com.jagex.util.Util;

public class StaticMusic {

	private static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_3625;

	public static void kill() {
		aClass14_Sub9_Sub1_2071 = null;
		StaticMusic.aCacheFileWorker_2901 = null;
		StaticMusic.aClass2_683 = null;
		StaticMusic.aClass14_Sub9_Sub1_3625 = null;
		StaticMusic.aClass14_Sub16_4780 = null;
		StaticMusic.aClass91Array2197 = null;
		aClass14_Sub9_Sub2_585 = null;
		anIntArray1928 = null;
		StaticMusic.anIntArray3949 = null;
		StaticMusic.anIntArray4052 = null;
		anIntArray2454 = null;
		aFileSystem_2696 = null;
		StaticMusic.aClass120_854 = null;
		StaticMusic.aFileSystem_957 = null;
		StaticMusic.aFileSystem_725 = null;
		StaticMusic.aFileSystem_3945 = null;
		StaticMusic.aCacheFileWorker_3374 = null;
		StaticMusic.aClass2_2438 = null;
		aClass55_1398 = null;
	}

	public static boolean method1581() {
		label42: {
			label41: {
				boolean var5;
				try {
					if (StaticMusic.anInt3889 != 2) {
						break label42;
					}
	
					if (StaticMusic.aClass14_Sub16_4780 == null) {
						StaticMusic.aClass14_Sub16_4780 = Class14_Sub16.method875(StaticMusic.aFileSystem_2696,
								StaticMusic.anInt2624, StaticMusic.anInt3930);
						if (StaticMusic.aClass14_Sub16_4780 == null) {
							var5 = false;
							return var5;
						}
					}
				} catch (Exception var4) {
					break label41;
				}
	
				try {
					if (StaticMusic.aClass120_854 == null) {
						StaticMusic.aClass120_854 = new Class120(StaticMusic.aFileSystem_3945, StaticMusic.aFileSystem_725);
					}
	
					if (aClass14_Sub9_Sub1_3625.method706(22050, StaticMusic.aClass14_Sub16_4780,
							-67, StaticMusic.aFileSystem_957, StaticMusic.aClass120_854)) {
						aClass14_Sub9_Sub1_3625.method715(-22255);
						aClass14_Sub9_Sub1_3625.method710(-28225, StaticMusic.anInt1132);
						aClass14_Sub9_Sub1_3625.method719(0, StaticMusic.aBoolean593,
								StaticMusic.aClass14_Sub16_4780);
						StaticMusic.aFileSystem_2696 = null;
						StaticMusic.anInt3889 = 0;
						StaticMusic.aClass120_854 = null;
						StaticMusic.aClass14_Sub16_4780 = null;
						var5 = true;
						return var5;
					}
					break label42;
				} catch (Exception var3) {
					;
				}
			}
	
			Exception var1 = new Exception();
			var1.printStackTrace();
			aClass14_Sub9_Sub1_3625.method697(75);
			StaticMusic.aClass120_854 = null;
			StaticMusic.anInt3889 = 0;
			StaticMusic.aClass14_Sub16_4780 = null;
			StaticMusic.aFileSystem_2696 = null;
		}
		return false;
	}

	public static Class14_Sub16 aClass14_Sub16_4780;

	public static Track[] aClass91Array2197 = new Track[50];

	public static boolean method852() {
		if (StaticMusic.anInt3889 != 0) {
			boolean bool = true;
			return bool;
		}
		boolean bool = aClass14_Sub9_Sub1_3625.method721((byte) 109);
		return bool;
	}

	public static Class14_Sub9_Sub2 aClass14_Sub9_Sub2_585;

	public static void method434(int i, int i_3_, Class79 class79, int i_5_) {
		Class14_Sub3 class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_2438.getFront();
		for (/**/; class14_sub3 != null; class14_sub3 = ((Class14_Sub3) StaticMusic.aClass2_2438.getNext())) {
			if (class14_sub3.anInt2763 == i_3_ && i * 128 == class14_sub3.anInt2774
					&& i_5_ * 128 == class14_sub3.anInt2767
					&& class14_sub3.aClass79_2747.anInt1257 == class79.anInt1257) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
					class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				}
				class14_sub3.unlink();
				break;
			}
		}
	}

	public static void method1255(int i, Class14_Sub3 class14_sub3, int i_0_, int i_1_, int i_3_) {
		if (class14_sub3.anInt2753 != -1 || class14_sub3.anIntArray2746 != null) {
			int i_4_ = 0;
			if (i_3_ > class14_sub3.anInt2761)
				i_4_ += -class14_sub3.anInt2761 + i_3_;
			else if (i_3_ < class14_sub3.anInt2774)
				i_4_ += -i_3_ + class14_sub3.anInt2774;
			if (i_1_ > class14_sub3.anInt2751)
				i_4_ += -class14_sub3.anInt2751 + i_1_;
			else if (class14_sub3.anInt2767 > i_1_)
				i_4_ += class14_sub3.anInt2767 - i_1_;
			if (class14_sub3.anInt2765 == 0 || class14_sub3.anInt2765 < i_4_ - 64 || StaticMusic.anInt1691 == 0
					|| class14_sub3.anInt2763 != i_0_) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
					class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				}
			} else {
				i_4_ -= 64;
				if (i_4_ < 0)
					i_4_ = 0;
				int i_5_ = (StaticMusic.anInt1691 * (-i_4_ + class14_sub3.anInt2765) / class14_sub3.anInt2765);
				if (class14_sub3.aClass14_Sub9_Sub4_2775 == null) {
					if (class14_sub3.anInt2753 >= 0) {
						Track track = Track.method1451((StaticMusic.aCacheFileWorker_2901), class14_sub3.anInt2753,
								0);
						if (track != null) {
							Class14_Sub12_Sub1 class14_sub12_sub1 = track.method1449()
									.method857(SceneCluster.aClass18_1362);
							Class14_Sub9_Sub4 class14_sub9_sub4 = (Class14_Sub9_Sub4.method775(class14_sub12_sub1, 100,
									i_5_));
							class14_sub9_sub4.method765(-1);
							aClass14_Sub9_Sub2_585.method735(class14_sub9_sub4);
							class14_sub3.aClass14_Sub9_Sub4_2775 = class14_sub9_sub4;
						}
					}
				} else
					class14_sub3.aClass14_Sub9_Sub4_2775.method768(i_5_);
				if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
					class14_sub3.aClass14_Sub9_Sub4_2760.method768(i_5_);
					if (!class14_sub3.aClass14_Sub9_Sub4_2760.previousNotNull((byte) -109))
						class14_sub3.aClass14_Sub9_Sub4_2760 = null;
				} else if (class14_sub3.anIntArray2746 != null && (class14_sub3.anInt2773 -= i) <= 0) {
					int i_6_ = (int) (class14_sub3.anIntArray2746.length * Math.random());
					Track track = Track.method1451(StaticMusic.aCacheFileWorker_2901,
							class14_sub3.anIntArray2746[i_6_], 0);
					if (track != null) {
						Class14_Sub12_Sub1 class14_sub12_sub1 = track.method1449()
								.method857(SceneCluster.aClass18_1362);
						Class14_Sub9_Sub4 class14_sub9_sub4 = Class14_Sub9_Sub4.method775(class14_sub12_sub1, 100,
								i_5_);
						class14_sub9_sub4.method765(0);
						aClass14_Sub9_Sub2_585.method735(class14_sub9_sub4);
						class14_sub3.aClass14_Sub9_Sub4_2760 = class14_sub9_sub4;
						class14_sub3.anInt2773 = (int) ((class14_sub3.anInt2769 - class14_sub3.anInt2772)
								* Math.random()) + class14_sub3.anInt2772;
					}
				}
			}
		}
	}

	public static boolean method1438(Class14_Sub9_Sub1 class14_sub9_sub1, FileSystem fileSystem, boolean boola, FileSystem fileSystem_1_,
			FileSystem fileSystem_2_) {
		StaticMusic.aFileSystem_957 = fileSystem_1_;
		aClass14_Sub9_Sub1_3625 = class14_sub9_sub1;
		StaticMusic.aFileSystem_725 = fileSystem;
		StaticMusic.aFileSystem_3945 = fileSystem_2_;
		boolean bool_3_ = true;
		return bool_3_;
	}

	public static void method1318() {
		for (int var1 = 0; var1 < StaticMusic.anInt96; ++var1) {
			--StaticMusic.anIntArray3949[var1];
			if (StaticMusic.anIntArray3949[var1] < -10) {
				--StaticMusic.anInt96;
	
				for (int var2 = var1; var2 < StaticMusic.anInt96; ++var2) {
					StaticMusic.anIntArray2454[var2] = StaticMusic.anIntArray2454[var2 + 1];
					aClass91Array2197[var2] = aClass91Array2197[var2 + 1];
					StaticMusic.anIntArray4052[var2] = StaticMusic.anIntArray4052[var2 + 1];
					StaticMusic.anIntArray3949[var2] = StaticMusic.anIntArray3949[var2 + 1];
					StaticMusic.anIntArray1928[var2] = StaticMusic.anIntArray1928[var2 + 1];
				}
	
				--var1;
			} else {
				Track var10 = aClass91Array2197[var1];
				if (var10 == null) {
					var10 = Track.method1451(StaticMusic.aCacheFileWorker_2901, StaticMusic.anIntArray2454[var1], 0);
					if (var10 == null) {
						continue;
					}
	
					StaticMusic.anIntArray3949[var1] += var10.method1450();
					aClass91Array2197[var1] = var10;
				}
	
				if (StaticMusic.anIntArray3949[var1] < 0) {
					int var3;
					if (StaticMusic.anIntArray1928[var1] == 0) {
						var3 = StaticMusic.anInt3266;
					} else {
						int var4 = (StaticMusic.anIntArray1928[var1] & 255) * 128;
						int var5 = (StaticMusic.anIntArray1928[var1] & 16776284) >> 48;
						int var6 = -Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3495 + var5 * 128 + 64;
						int var7 = (StaticMusic.anIntArray1928[var1] & '\uff17') >> 8;
						if (var6 < 0) {
							var6 = -var6;
						}
	
						int var8 = -Static2.aSceneGraphNode_GameEntity_Sub1_2748.anInt3436 + var7 * 128 + 64;
						if (var8 < 0) {
							var8 = -var8;
						}
	
						int var9 = var8 + var6 - 128;
						if (var4 < var9) {
							StaticMusic.anIntArray3949[var1] = -100;
							continue;
						}
	
						if (var9 < 0) {
							var9 = 0;
						}
	
						var3 = StaticMusic.anInt1691 * (var4 - var9) / var4;
					}
	
					if (var3 > 0) {
						Class14_Sub12_Sub1 var11 = var10.method1449().method857(SceneCluster.aClass18_1362);
						Class14_Sub9_Sub4 var12 = Class14_Sub9_Sub4.method775(var11, 100, var3);
						var12.method765(StaticMusic.anIntArray4052[var1] - 1);
						aClass14_Sub9_Sub2_585.method735(var12);
					}
	
					StaticMusic.anIntArray3949[var1] = -100;
				}
			}
		}
	
		if (StaticMusic.aBoolean2827 && !method852()) {
			if (StaticMusic.anInt3135 != 0 && StaticMusic.anInt2856 != -1) {
				StaticMusic.method1087(0, false, StaticMusic.anInt2856, StaticMusic.aCacheFileWorker_3374, StaticMusic.anInt3135);
			}
	
			StaticMusic.aBoolean2827 = false;
		} else if (StaticMusic.anInt3135 != 0 && StaticMusic.anInt2856 != -1
				&& !method852()) {
			JunkTex.aClass14_Sub10_Sub1_891.writeOpcode(247);
			JunkTex.aClass14_Sub10_Sub1_891.writeInt(StaticMusic.anInt2856, 112 ^ 22);
			StaticMusic.anInt2856 = -1;
		}
	
	}

	public static void method1087(int i_10_, boolean bool, int i_11_, FileSystem fileSystem, int i_12_) {
		StaticMusic.anInt3930 = i_10_;
		StaticMusic.anInt3889 = 1;
		StaticMusic.anInt1132 = i_12_;
		StaticMusic.aBoolean593 = bool;
		StaticMusic.anInt2989 = 10000;
		StaticMusic.aFileSystem_2696 = fileSystem;
		StaticMusic.anInt2624 = i_11_;
	}

	public static int[] anIntArray1928 = new int[50];

	public static void method1181(int i, int i_2_, int i_3_, byte i_4_) {
		if (StaticMusic.anInt3266 != 0 && i != 0 && StaticMusic.anInt96 < 50 && i_2_ != -1) {
			StaticMusic.anIntArray2454[StaticMusic.anInt96] = i_2_;
			StaticMusic.anIntArray4052[StaticMusic.anInt96] = i;
			StaticMusic.anIntArray3949[StaticMusic.anInt96] = i_3_;
			aClass91Array2197[StaticMusic.anInt96] = null;
			anIntArray1928[StaticMusic.anInt96] = 0;
			StaticMusic.anInt96++;
		}
	}

	public static int[] anIntArray3949 = new int[50];
	public static int[] anIntArray4052 = new int[50];
	public static int[] anIntArray2454 = new int[50];
	public static int anInt3266 = 127;
	public static int anInt96 = 0;

	public static void method1308(int i) {
		StaticMusic.anInt1132 = 0;
		StaticMusic.anInt3889 = 1;
		StaticMusic.anInt2624 = -1;
		StaticMusic.anInt3930 = -1;
		StaticMusic.aBoolean593 = false;
		StaticMusic.anInt2989 = i;
		StaticMusic.aFileSystem_2696 = null;
	}

	public static void method636(int i, int i_12_, int i_14_, boolean bool, FileSystem fileSystem, int i_15_) {
		StaticMusic.anInt2624 = i;
		StaticMusic.anInt2989 = i_12_;
		StaticMusic.anInt3889 = 1;
		StaticMusic.aFileSystem_2696 = fileSystem;
		StaticMusic.anInt3930 = i_15_;
		StaticMusic.aBoolean593 = bool;
		StaticMusic.anInt1132 = i_14_;
	}

	private static int anInt2624;
	private static int anInt2989;
	private static int anInt3889 = 0;
	private static int anInt3930;
	private static boolean aBoolean593;
	private static int anInt1132;

	public static void method1188(int i, int i_42_) {
		if (i_42_ == anInt3889)
			aClass14_Sub9_Sub1_3625.method710(i_42_ - 28225, i);
		else
			anInt1132 = i;
	}

	public static void method569() {
		aClass14_Sub9_Sub1_3625.method697(11);
		anInt3889 = 1;
		StaticMusic.aFileSystem_2696 = null;
	}

	private static FileSystem aFileSystem_2696;

	public static void method48(byte vara0) {
		try {
			if (anInt3889 != 1) {
				return;
			}
	
			int var1 = aClass14_Sub9_Sub1_3625.method727(0);
			if (var1 > 0 && aClass14_Sub9_Sub1_3625.method721((byte) 111)) {
				var1 -= anInt2989;
				if (var1 < 0) {
					var1 = 0;
				}
	
				aClass14_Sub9_Sub1_3625.method710(-28225, var1);
				return;
			}
		} catch (Exception var3) {
			var3.printStackTrace();
			aClass14_Sub9_Sub1_3625.method697(116 - 43);
			aClass14_Sub16_4780 = null;
			anInt3889 = 0;
			aFileSystem_2696 = null;
			StaticMusic.aClass120_854 = null;
			return;
		}
		aClass14_Sub9_Sub1_3625.method697(76);
		aClass14_Sub9_Sub1_3625.method716((byte) -43);
		aClass14_Sub16_4780 = null;
		StaticMusic.aClass120_854 = null;
		if (aFileSystem_2696 == null) {
			anInt3889 = 0;
		} else {
			anInt3889 = 2;
		}
	}

	private static Class120 aClass120_854;
	private static FileSystem aFileSystem_957;
	private static FileSystem aFileSystem_725;
	private static FileSystem aFileSystem_3945;
	public static int anInt3135 = 255;
	public static boolean aBoolean2827 = false;

	public static void method1492(int i) {
		if (i == -1 && !aBoolean2827)
			method569();
		else if (i != -1 && (StaticMusic.anInt2856 != i || !method852())
				&& anInt3135 != 0 && !aBoolean2827)
			method636(i, 2, anInt3135, false, StaticMusic.aCacheFileWorker_3374, 0);
		StaticMusic.anInt2856 = i;
	}

	public static int anInt2856 = -1;
	public static CacheFileWorker aCacheFileWorker_3374;
	public static Deque aClass2_2438 = new Deque();

	public static void method1941(boolean bool) {
		Class14_Sub3 class14_sub3 = (Class14_Sub3) aClass2_2438.getFront();
		for (/**/; class14_sub3 != null; class14_sub3 = (Class14_Sub3) aClass2_2438.getNext()) {
			if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
				aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
				class14_sub3.aClass14_Sub9_Sub4_2775 = null;
			}
			if (class14_sub3.aClass14_Sub9_Sub4_2760 != null) {
				aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2760);
				class14_sub3.aClass14_Sub9_Sub4_2760 = null;
			}
			class14_sub3.unlink();
		}
		if (bool) {
			for (class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getNext()) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				class14_sub3.unlink();
			}
			for (class14_sub3 = ((Class14_Sub3) StaticMusic.aClass55_1398
					.getFirst()); class14_sub3 != null; class14_sub3 = (Class14_Sub3) StaticMusic.aClass55_1398
							.getNext()) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				class14_sub3.unlink();
			}
		}
	}

	public static HashTable aClass55_1398 = new HashTable(16);

	public static void method213(int i, int i_44_, Class79 class79, byte i_45_, int i_46_,
			SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1, SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2, int i_47_) {
		Class14_Sub3 class14_sub3 = new Class14_Sub3();
		class14_sub3.anInt2767 = i_44_ * 128;
		class14_sub3.anInt2763 = i_46_;
		class14_sub3.anInt2774 = i * 128;
		if (class79 != null) {
			class14_sub3.anInt2772 = class79.anInt1289;
			class14_sub3.aClass79_2747 = class79;
			class14_sub3.anInt2765 = class79.anInt1271 * 128;
			int i_48_ = class79.anInt1227;
			class14_sub3.anInt2769 = class79.anInt1254;
			class14_sub3.anInt2753 = class79.anInt1294;
			class14_sub3.anIntArray2746 = class79.anIntArray1287;
			int i_49_ = class79.anInt1245;
			if (i_47_ == 1 || i_47_ == 3) {
				i_48_ = class79.anInt1245;
				i_49_ = class79.anInt1227;
			}
			class14_sub3.anInt2761 = (i_48_ + i) * 128;
			class14_sub3.anInt2751 = (i_49_ + i_44_) * 128;
			if (class79.anIntArray1276 != null) {
				class14_sub3.aBoolean2757 = true;
				class14_sub3.method452(18631);
			}
			if (class14_sub3.anIntArray2746 != null)
				class14_sub3.anInt2773 = ((int) (Math.random()
						* (-class14_sub3.anInt2772 + class14_sub3.anInt2769)) + class14_sub3.anInt2772);
			aClass2_2438.pushBack(class14_sub3);
		} else if (class133_sub1_sub2 != null) {
			class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762 = class133_sub1_sub2;
			Class12 class12 = class133_sub1_sub2.aClass12_4949;
			if (class12.anIntArray329 != null) {
				class14_sub3.aBoolean2757 = true;
				class12 = class12.method217((byte) -18);
			}
			if (class12 != null) {
				class14_sub3.anInt2751 = (class12.anInt334 + i_44_) * 128;
				class14_sub3.anInt2761 = (i + class12.anInt334) * 128;
				class14_sub3.anInt2753 = StaticMusic.method1500(class133_sub1_sub2, -1);
				class14_sub3.anInt2765 = class12.anInt293 * 128;
			}
			StaticMusic.aClass2_683.pushBack(class14_sub3);
		} else if (class133_sub1_sub1 != null) {
			class14_sub3.anInt2751 = (class133_sub1_sub1.anInt3493 + i_44_) * 128;
			class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755 = class133_sub1_sub1;
			class14_sub3.anInt2761 = (class133_sub1_sub1.anInt3493 + i) * 128;
			class14_sub3.anInt2753 = StaticMusic.method1597(false, class133_sub1_sub1);
			class14_sub3.anInt2765 = class133_sub1_sub1.anInt4917 * 128;
			aClass55_1398.put(class133_sub1_sub1.aClass124_4922.method1692(0), class14_sub3);
		}
	}

	public static void method1112(SceneGraphNode_GameEntity_Sub2 class133_sub1_sub2, byte i) {
		for (Class14_Sub3 class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683
				.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getNext()) {
			if (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762 == class133_sub1_sub2) {
				if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
					aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
					class14_sub3.aClass14_Sub9_Sub4_2775 = null;
				}
				class14_sub3.unlink();
				return;
			}
		}
	}

	public static void method240(int i) {
		for (Class14_Sub3 class14_sub3 = (Class14_Sub3) aClass2_2438.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) aClass2_2438.getNext()) {
			if (class14_sub3.aBoolean2757)
				class14_sub3.method452(18631);
		}
		for (Class14_Sub3 class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getNext()) {
			if (class14_sub3.aBoolean2757)
				class14_sub3.method452(18631);
		}
	}

	public static void method314(byte i, int i_28_, int i_29_, int i_30_, int i_31_) {
		if (i > 61) {
			for (Class14_Sub3 class14_sub3 = (Class14_Sub3) aClass2_2438.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) aClass2_2438.getNext())
				method1255(i_30_, class14_sub3, i_29_, i_28_, i_31_);
			for (Class14_Sub3 class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getFront(); class14_sub3 != null; class14_sub3 = (Class14_Sub3) StaticMusic.aClass2_683.getNext()) {
				int i_32_ = 1;
				if (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3433 != class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3452) {
					if (class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3456 == class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762.anInt3452)
						i_32_ = 2;
				} else
					i_32_ = 0;
				if (i_32_ != class14_sub3.anInt2756) {
					int i_33_ = StaticMusic.method1500((class14_sub3.aSceneGraphNode_GameEntity_Sub2_2762), -1);
					if (class14_sub3.anInt2753 != i_33_) {
						if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
							aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
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
				method1255(i_30_, class14_sub3, i_29_, i_28_, i_31_);
			}
			for (Class14_Sub3 class14_sub3 = ((Class14_Sub3) aClass55_1398
					.getFirst()); class14_sub3 != null; class14_sub3 = (Class14_Sub3) aClass55_1398
							.getNext()) {
				int i_34_ = 1;
				if (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3433 == class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3452)
					i_34_ = 0;
				else if (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3456 == class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755.anInt3452)
					i_34_ = 2;
				if (i_34_ != class14_sub3.anInt2756) {
					int i_35_ = StaticMusic.method1597(false, (class14_sub3.aSceneGraphNode_GameEntity_Sub1_2755));
					if (class14_sub3.anInt2753 != i_35_) {
						if (class14_sub3.aClass14_Sub9_Sub4_2775 != null) {
							aClass14_Sub9_Sub2_585.method730(class14_sub3.aClass14_Sub9_Sub4_2775);
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
				method1255(i_30_, class14_sub3, i_29_, i_28_, i_31_);
			}
		}
	}

	public static Deque aClass2_683 = new Deque();
	public static CacheFileWorker aCacheFileWorker_2901;

	public static int method1597(boolean bool, SceneGraphNode_GameEntity_Sub1 class133_sub1_sub1) {
		int i = class133_sub1_sub1.anInt4940;
		if (class133_sub1_sub1.anInt3452 == class133_sub1_sub1.anInt3433)
			i = class133_sub1_sub1.anInt4909;
		else if (class133_sub1_sub1.anInt3456 == class133_sub1_sub1.anInt3452)
			i = class133_sub1_sub1.anInt4932;
		int i_332_ = i;
		return i_332_;
	}

	public static int method1500(SceneGraphNode_GameEntity_Sub2 var0, int var1) {
		try {
			Class12 var2 = var0.aClass12_4949;
			if (var2.anIntArray329 != null) {
				var2 = var2.method217((byte) -18);
				if (var2 == null) {
					byte var5 = -1;
					return var5;
				}
			}
	
			int var3 = var2.anInt301;
			if (var0.anInt3433 != var0.anInt3452) {
				if (var0.anInt3452 == var0.anInt3456) {
					var3 = var2.anInt292;
				}
			} else {
				var3 = var2.anInt289;
			}
	
			return var3;
		} catch (Throwable var4) {
			throw Util.error(var4, "pe.K(" + (var0 != null ? "{...}" : "null") + ',' + var1 + ')');
		}
	}

	public static int anInt1691 = 127;
	public static Class14_Sub9_Sub1 aClass14_Sub9_Sub1_2071;
}
