/* Class129_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class MouseWheelHandler extends AbstractMouseWheelHandler implements MouseWheelListener {
	private int rotation = 0;

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		rotation += mousewheelevent.getWheelRotation();
	}

	@Override
	public void addListener(Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public void removeListener(Component component) {
		component.removeMouseWheelListener(this);
	}

	/**
	 * Gets the net mouse wheel movement in a single game cycle.
	 */
	@Override
	public synchronized int getRotation() {
		int rot = rotation;
		rotation = 0;
		return rot;
	}
}
