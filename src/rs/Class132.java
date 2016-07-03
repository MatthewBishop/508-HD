/* Class132 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

import com.jagex.link.HashTable;
import com.jagex.rt4.RT4;

import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Static;

public class Class132 {
	public static HashTable aClass55_2167;
	public static long aLong2169 = 0L;
	public static boolean aBoolean2170;
	public static Class87 aClass87_2171;
	public static Class124 aClass124_2172;

	static {
		aClass55_2167 = new HashTable(32);
		aBoolean2170 = false;
		aClass124_2172 = Class14_Sub2_Sub2.method263(1178, "(U0a )2 in: ");
	}

	public static void method1776(boolean bool) {
		aClass124_2172 = null;
		aClass55_2167 = null;
		if (!bool)
			RT4.method1778(-36, -50);
		aClass87_2171 = null;
	}

	public static void method1777(byte i, Class9 class9) {
		if (i == -57)
			Static2.aClass9_1084 = class9;
	}

	public static void method1779(int i) {
		int i_3_ = Static.anInt895;
		int i_4_ = Class76.anInt1197;
		int i_5_ = Class14_Sub8_Sub32.anInt4622 - Class83.anInt1340 - i_3_;
		if (i == 0) {
			int i_6_ = (-Class14_Sub20.anInt3094 + (Class14_Sub2_Sub21.anInt4086 - i_4_));
			if (i_3_ > 0 || i_5_ > 0 || i_4_ > 0 || i_6_ > 0) {
				try {
					Container container;
					if (Static.aFrame3962 != null)
						container = Static.aFrame3962;
					else if (Class14_Sub14.aFrame2986 == null)
						container = Class14_Sub8_Sub34.aClass43_4647.applet;
					else
						container = Class14_Sub14.aFrame2986;
					int i_7_ = 0;
					int i_8_ = 0;
					if (container == Class14_Sub14.aFrame2986) {
						Insets insets = Class14_Sub14.aFrame2986.getInsets();
						i_8_ = insets.left;
						i_7_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_3_ > 0)
						graphics.fillRect(i_8_, i_7_, i_3_, Class14_Sub2_Sub21.anInt4086);
					if (i_4_ > 0)
						graphics.fillRect(i_8_, i_7_, Class14_Sub8_Sub32.anInt4622, i_4_);
					if (i_5_ > 0)
						graphics.fillRect((Class14_Sub8_Sub32.anInt4622 + (i_8_ - i_5_)), i_7_, i_5_,
								Class14_Sub2_Sub21.anInt4086);
					if (i_6_ > 0)
						graphics.fillRect(i_8_, (-i_6_ + i_7_ + Class14_Sub2_Sub21.anInt4086),
								Class14_Sub8_Sub32.anInt4622, i_6_);
				} catch (Exception exception) {
					/* empty */
				}
			}
		}
	}
}
