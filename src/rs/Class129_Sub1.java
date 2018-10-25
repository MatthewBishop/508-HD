/* Class129_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.Component;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class Class129_Sub1 extends Class129 implements MouseWheelListener {
	public int anInt3430 = 0;

	public synchronized void mouseWheelMoved(MouseWheelEvent mousewheelevent) {
		anInt3430 += mousewheelevent.getWheelRotation();
	}

	@Override
	public void addMouseWheelListener(Component component) {
		component.addMouseWheelListener(this);
	}

	@Override
	public void removeMouseWheelListener(Component component) {
		component.removeMouseWheelListener(this);
	}

	/**
	 * Gets the net mouse wheel movement in a single game cycle.
	 */
	@Override
	public synchronized int getWheelRotation() {
		int i_0_ = anInt3430;
		anInt3430 = 0;
		int i_1_ = i_0_;
		return i_1_;
	}
}
