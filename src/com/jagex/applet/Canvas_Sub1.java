/* Canvas_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.applet;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;

public class Canvas_Sub1 extends Canvas {

	public Component aComponent52;

	public Canvas_Sub1(Component component) {
		aComponent52 = component;
	}

	@Override
	public void paint(Graphics graphics) {
		aComponent52.paint(graphics);
	}

	@Override
	public void update(Graphics graphics) {
		aComponent52.update(graphics);
	}
}
