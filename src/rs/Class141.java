/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Class141 implements KeyListener, FocusListener {
	public static Class94 aClass94_2239;
	public static Class87 aClass87_2242;
	public static int[] anIntArray2246 = new int[32];

	public void keyTyped(KeyEvent keyevent) {
		if (JunkTex.aClass141_4239 != null) {
			int i = JunkTex.method671(keyevent, 0);
			if (i >= 0) {
				int i_14_ = Class7_Sub3.anInt2682 + 1 & 0x7f;
				if (Static2.anInt4850 != i_14_) {
					Class138.anIntArray2224[Class7_Sub3.anInt2682] = -1;
					Class36.anIntArray632[Class7_Sub3.anInt2682] = i;
					Class7_Sub3.anInt2682 = i_14_;
				}
			}
		}
		keyevent.consume();
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		if (JunkTex.aClass141_4239 != null)
			Static2.anInt2014 = -1;
	}

	public static void method1962(boolean bool) {
		aClass94_2239 = null;
		anIntArray2246 = null;
		aClass87_2242 = null;
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		if (JunkTex.aClass141_4239 != null) {
			Class86.anInt1385 = 0;
			int i = keyevent.getKeyCode();
			if (i >= 0 && i < Canvas_Sub2.anIntArray62.length) {
				i = Canvas_Sub2.anIntArray62[i];
				if ((i & 0x80) != 0)
					i = -1;
			} else
				i = -1;
			if (Static2.anInt2014 >= 0 && i >= 0) {
				JunkTex.anIntArray4139[Static2.anInt2014] = i;
				Static2.anInt2014 = Static2.anInt2014 + 1 & 0x7f;
				if (Static2.anInt2014 == JunkTex.anInt4146)
					Static2.anInt2014 = -1;
			}
			if (i >= 0) {
				int i_15_ = Class7_Sub3.anInt2682 + 1 & 0x7f;
				if (i_15_ != Static2.anInt4850) {
					Class138.anIntArray2224[Class7_Sub3.anInt2682] = i;
					Class36.anIntArray632[Class7_Sub3.anInt2682] = -1;
					Class7_Sub3.anInt2682 = i_15_;
				}
			}
			int i_16_ = keyevent.getModifiers();
			if ((i_16_ & 0xa) != 0 || i == 85 || i == 10)
				keyevent.consume();
		}
	}

	public void focusGained(FocusEvent focusevent) {
		/* empty */
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		if (JunkTex.aClass141_4239 != null) {
			Class86.anInt1385 = 0;
			int i = keyevent.getKeyCode();
			if (i < 0 || i >= Canvas_Sub2.anIntArray62.length)
				i = -1;
			else
				i = Canvas_Sub2.anIntArray62[i] & ~0x80;
			if (Static2.anInt2014 >= 0 && i >= 0) {
				JunkTex.anIntArray4139[Static2.anInt2014] = i ^ 0xffffffff;
				Static2.anInt2014 = Static2.anInt2014 + 1 & 0x7f;
				if (JunkTex.anInt4146 == Static2.anInt2014)
					Static2.anInt2014 = -1;
			}
		}
		keyevent.consume();
	}
}
