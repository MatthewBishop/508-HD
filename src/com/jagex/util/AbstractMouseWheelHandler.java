/* Class129 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.util;

import java.awt.Component;

public abstract class AbstractMouseWheelHandler {

	public abstract void addListener(Component component);

	public abstract int getRotation();

	public abstract void removeListener(Component component);
}
