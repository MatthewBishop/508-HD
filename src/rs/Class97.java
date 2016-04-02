/* Class97 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.jagex.io.Buffer;
import com.jagex.link.Class2;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.util.TimeUtil;

import rs.tex.Class14_Sub8_Sub30;
import rs.tex.Class14_Sub8_Sub31;
import rs.tex.Class14_Sub8_Sub37;

public class Class97 implements MouseListener, MouseMotionListener, FocusListener {
	public static Class124 aClass124_1637;
	public static byte[] aByteArray1638 = { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111,
			112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
	public static Class124 aClass124_1640;
	public static byte[][][] underlays;
	public static Class2 aClass2_1647;
	public static Class148_Sub1[] aClass148_Sub1Array1651;
	public static int anInt1652;
	public static int anInt1656;
	public static Class94 aClass94_1657;

	static {
		aClass124_1637 = Class14_Sub2_Sub2.method263(1178, " is already on your friend list)3");
		anInt1652 = 2;
		aClass124_1640 = aClass124_1637;
		aClass2_1647 = new Class2();
	}

	public static Class150 method1489(int i, int i_0_) {
		Class150 class150 = (Class150) Static2.aClass52_3942.method1210((long) i);
		if (class150 != null) {
			Class150 class150_1_ = class150;
			return class150_1_;
		}
		if (i_0_ != -9810) {
			Class150 class150_2_ = null;
			return class150_2_;
		}
		byte[] is = Static2.aClass9_372.method163(i, 4, 0);
		Class150 class150_3_ = new Class150();
		if (is != null)
			class150_3_.method2024(i, 0, new Buffer(is));
		Static2.aClass52_3942.put(class150_3_, (long) i);
		Class150 class150_4_ = class150_3_;
		return class150_4_;
	}

	public void mouseClicked(MouseEvent mouseevent) {
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseReleased(MouseEvent mouseevent) {
		do {
			if (Class67.aClass97_1055 != null) {
				Class14_Sub8_Sub31.anInt4602 = 0;
				Class14_Sub4.anInt2790 = 0;
				int i = mouseevent.getModifiers();
				if ((i & 0x10) == 0)
					break;
			}
		} while (false);
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseMoved(MouseEvent mouseevent) {
		if (Class67.aClass97_1055 != null) {
			Class14_Sub8_Sub31.anInt4602 = 0;
			Class14_Sub8_Sub37.anInt4724 = mouseevent.getX();
			Class14_Sub9_Sub3.anInt4848 = mouseevent.getY();
		}
	}

	public synchronized void mouseEntered(MouseEvent mouseevent) {
		if (Class67.aClass97_1055 != null) {
			Class14_Sub8_Sub31.anInt4602 = 0;
			Class14_Sub8_Sub37.anInt4724 = mouseevent.getX();
			Class14_Sub9_Sub3.anInt4848 = mouseevent.getY();
		}
	}

	public static void method1490() {
		aClass124_1640 = null;
		aByteArray1638 = null;
		aClass124_1637 = null;
		aClass148_Sub1Array1651 = null;
		underlays = null;
		aClass2_1647 = null;
		aClass94_1657 = null;
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void mouseExited(MouseEvent mouseevent) {
		if (Class67.aClass97_1055 != null) {
			Class14_Sub8_Sub31.anInt4602 = 0;
			Class14_Sub8_Sub37.anInt4724 = -1;
			Class14_Sub9_Sub3.anInt4848 = -1;
		}
	}

	public static void method1491(int i, int i_5_, int i_6_, int i_7_, boolean bool, int i_8_, int i_9_,
			Class94 class94) {
		if (Class54.aBoolean881)
			Static2.anInt3739 = 32;
		else
			Static2.anInt3739 = 0;
		Class54.aBoolean881 = false;
		if (Class14_Sub8_Sub30.anInt4599 != 0) {
			if (i > i_8_ || i_8_ >= i + 16 || i_6_ < i_5_ || i_5_ + 16 <= i_6_) {
				if (i > i_8_ || i_8_ >= i + 16 || i_5_ + i_9_ - 16 > i_6_ || i_5_ + i_9_ <= i_6_) {
					if (i_8_ >= -Static2.anInt3739 + i && i + (16 + Static2.anInt3739) > i_8_
							&& i_5_ + 16 <= i_6_ && i_9_ + (i_5_ - 16) > i_6_) {
						int i_10_ = (i_9_ - 32) * i_9_ / i_7_;
						if (i_10_ < 8)
							i_10_ = 8;
						int i_11_ = -i_10_ + (i_9_ - 32);
						int i_12_ = i_6_ - 16 - (i_5_ + i_10_ / 2);
						class94.anInt1547 = i_12_ * (i_7_ - i_9_) / i_11_;
						Class103.method1531(class94);
						Class54.aBoolean881 = true;
					}
				} else {
					class94.anInt1547 += 4;
					Class103.method1531(class94);
				}
			} else {
				class94.anInt1547 -= 4;
				Class103.method1531(class94);
			}
		}
		if (Class113.anInt1881 != 0) {
			int i_13_ = class94.anInt1518;
			if (-i_13_ + i <= i_8_ && i_5_ <= i_6_ && i_8_ < i + 16 && i_9_ + i_5_ >= i_6_) {
				class94.anInt1547 += Class113.anInt1881 * 45;
				Class103.method1531(class94);
			}
		}
		if (!bool)
			anInt1656 = -97;
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		if (Class67.aClass97_1055 != null)
			Class14_Sub4.anInt2790 = 0;
	}

	public synchronized void mousePressed(MouseEvent mouseevent) {
		do {
			if (Class67.aClass97_1055 != null) {
				Class14_Sub8_Sub31.anInt4602 = 0;
				Class111.anInt1860 = mouseevent.getX();
				Class118.anInt1976 = mouseevent.getY();
				Applet_Sub1.aLong6 = TimeUtil.getTime();
				if (mouseevent.isMetaDown()) {
					Class127.anInt2105 = 2;
					Class14_Sub4.anInt2790 = 2;
				} else {
					Class127.anInt2105 = 1;
					Class14_Sub4.anInt2790 = 1;
				}
				int i = mouseevent.getModifiers();
				if ((i & 0x10) != 0)
					break;
			}
		} while (false);
		if (mouseevent.isPopupTrigger())
			mouseevent.consume();
	}

	public synchronized void mouseDragged(MouseEvent mouseevent) {
		if (Class67.aClass97_1055 != null) {
			Class14_Sub8_Sub31.anInt4602 = 0;
			Class14_Sub8_Sub37.anInt4724 = mouseevent.getX();
			Class14_Sub9_Sub3.anInt4848 = mouseevent.getY();
		}
	}
}
