/* Class144 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.applet.Applet;

import netscape.javascript.JSObject;

public class Class144 {
	public static Object method1982(byte i, String string, Applet applet, Object[] objects) throws Throwable {
		if (i <= 83) {
			Object object = null;
			return object;
		}
		Object object = JSObject.getWindow(applet).call(string, objects);
		return object;
	}

	public static void method1983(Applet applet, byte i, String string) throws Throwable {
		if (i <= -26)
			JSObject.getWindow(applet).eval(string);
	}
}
