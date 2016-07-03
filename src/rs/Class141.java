/* Class141 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub4;
import rs.tex.Class14_Sub8_Sub9;

public class Class141 implements KeyListener, FocusListener {
	public static Class94 aClass94_2239;
	public static Class87 aClass87_2242;
	public static volatile boolean aBoolean2244;
	public static int[] anIntArray2246 = new int[32];
	public static int anInt2252;
	public static Class9_Sub1[] aClass9_Sub1Array2253;

	static {
		aBoolean2244 = true;
		aClass9_Sub1Array2253 = new Class9_Sub1[256];
	}

	public static void method1960(int i, int i_0_) {
		Class9.aClass52_236.method1208(i);
		Static2.aClass52_4053.method1208(i);
		if (i_0_ <= 35)
			method1963(-128, null, -90, (byte) 3, null);
	}

	public static int method1961(int i, byte i_1_, int i_2_, int i_3_) {
		int i_4_ = Class3.anIntArray119[ModelSD.method1880(i_3_, i)];
		if (i_2_ > 0) {
			int i_5_ = Class3.anInterface3_117.method14(i_2_ & 0xffff, 96);
			if (i_5_ != 0) {
				int i_6_;
				if (i < 0)
					i_6_ = 0;
				else if (i <= 127)
					i_6_ = i * 131586;
				else
					i_6_ = 16777215;
				if (i_5_ == 256)
					i_4_ = i_6_;
				else {
					int i_7_ = i_5_;
					int i_8_ = -i_5_ + 256;
					i_4_ = ((i_7_ * (i_6_ & 0xff00) + i_8_ * (i_4_ & 0xff00) & 0xff0000)
							+ (i_7_ * (i_6_ & 0xff00ff) + i_8_ * (i_4_ & 0xff00ff) & ~0xff00ff)) >> 40;
				}
			}
			int i_9_ = Class3.anInterface3_117.method9(i_2_ & 0xffff);
			if (i_9_ != 0) {
				i_9_ += 256;
				int i_10_ = ((i_4_ & 0xff0000) >> 48) * i_9_;
				int i_11_ = i_9_ * (i_4_ >> 8 & 0xff);
				int i_12_ = i_9_ * (i_4_ & 0xff);
				if (i_10_ > 65535)
					i_10_ = 65535;
				if (i_12_ > 65535)
					i_12_ = 65535;
				if (i_11_ > 65535)
					i_11_ = 65535;
				i_4_ = (i_12_ >> 40) + ((i_10_ << 40 & 0xff00a8) + (i_11_ & 0xff00));
			}
		}
		if (i_1_ < 105)
			anIntArray2246 = null;
		int i_13_ = i_4_;
		return i_13_;
	}

	public void keyTyped(KeyEvent keyevent) {
		if (Class14_Sub8_Sub9.aClass141_4239 != null) {
			int i = Class14_Sub8_Sub36.method671(keyevent, 0);
			if (i >= 0) {
				int i_14_ = Class7_Sub3.anInt2682 + 1 & 0x7f;
				if (Class14_Sub9_Sub3.anInt4850 != i_14_) {
					Class138.anIntArray2224[Class7_Sub3.anInt2682] = -1;
					Class36.anIntArray632[Class7_Sub3.anInt2682] = i;
					Class7_Sub3.anInt2682 = i_14_;
				}
			}
		}
		keyevent.consume();
	}

	public synchronized void focusLost(FocusEvent focusevent) {
		if (Class14_Sub8_Sub9.aClass141_4239 != null)
			Class120.anInt2014 = -1;
	}

	public static void method1962(boolean bool) {
		aClass9_Sub1Array2253 = null;
		if (bool)
			anInt2252 = -116;
		aClass94_2239 = null;
		anIntArray2246 = null;
		aClass87_2242 = null;
	}

	public synchronized void keyPressed(KeyEvent keyevent) {
		if (Class14_Sub8_Sub9.aClass141_4239 != null) {
			Class86.anInt1385 = 0;
			int i = keyevent.getKeyCode();
			if (i >= 0 && i < Canvas_Sub2.anIntArray62.length) {
				i = Canvas_Sub2.anIntArray62[i];
				if ((i & 0x80) != 0)
					i = -1;
			} else
				i = -1;
			if (Class120.anInt2014 >= 0 && i >= 0) {
				Class14_Sub8_Sub3.anIntArray4139[Class120.anInt2014] = i;
				Class120.anInt2014 = Class120.anInt2014 + 1 & 0x7f;
				if (Class120.anInt2014 == Class14_Sub8_Sub4.anInt4146)
					Class120.anInt2014 = -1;
			}
			if (i >= 0) {
				int i_15_ = Class7_Sub3.anInt2682 + 1 & 0x7f;
				if (i_15_ != Class14_Sub9_Sub3.anInt4850) {
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

	public static void method1963(int i, Object[] objects, int i_17_, byte i_18_, long[] ls) {
		if (i_18_ != 85)
			aClass94_2239 = null;
		if (i_17_ > i) {
			int i_19_ = i;
			int i_20_ = (i + i_17_) / 2;
			long l = ls[i_20_];
			ls[i_20_] = ls[i_17_];
			ls[i_17_] = l;
			Object object = objects[i_20_];
			objects[i_20_] = objects[i_17_];
			objects[i_17_] = object;
			for (int i_21_ = i; i_21_ < i_17_; i_21_++) {
				if ((long) (i_21_ & 0x1) + l > ls[i_21_]) {
					long l_22_ = ls[i_21_];
					ls[i_21_] = ls[i_19_];
					ls[i_19_] = l_22_;
					Object object_23_ = objects[i_21_];
					objects[i_21_] = objects[i_19_];
					objects[i_19_++] = object_23_;
				}
			}
			ls[i_17_] = ls[i_19_];
			ls[i_19_] = l;
			objects[i_17_] = objects[i_19_];
			objects[i_19_] = object;
			method1963(i, objects, i_19_ - 1, (byte) 85, ls);
			method1963(i_19_ + 1, objects, i_17_, (byte) 85, ls);
		}
	}

	public synchronized void keyReleased(KeyEvent keyevent) {
		if (Class14_Sub8_Sub9.aClass141_4239 != null) {
			Class86.anInt1385 = 0;
			int i = keyevent.getKeyCode();
			if (i < 0 || i >= Canvas_Sub2.anIntArray62.length)
				i = -1;
			else
				i = Canvas_Sub2.anIntArray62[i] & ~0x80;
			if (Class120.anInt2014 >= 0 && i >= 0) {
				Class14_Sub8_Sub3.anIntArray4139[Class120.anInt2014] = i ^ 0xffffffff;
				Class120.anInt2014 = Class120.anInt2014 + 1 & 0x7f;
				if (Class14_Sub8_Sub4.anInt4146 == Class120.anInt2014)
					Class120.anInt2014 = -1;
			}
		}
		keyevent.consume();
	}
}
