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
	public void method1760(int i, Component component) {
		component.addMouseWheelListener(this);
		if (i != -14827)
			anInt3430 = -10;
	}

	@Override
	public void method1765(boolean bool, Component component) {
		if (!bool)
			anInt3430 = 123;
		component.removeMouseWheelListener(this);
	}

	@Override
	public synchronized int method1763(int i) {
		if (i > -122)
			method1763(-57);
		int i_0_ = anInt3430;
		anInt3430 = 0;
		int i_1_ = i_0_;
		return i_1_;
	}
}
