package com.jagex.util;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Point;

import nativeadvert.browsercontrol;

public class BrowserControlUtil {

	public static void update(Canvas canvas, int var) {
		if (browsercontrol.iscreated() && var != 0) {
			try {
				Point point = canvas.getLocationOnScreen();
				Dimension dimension = canvas.getSize();
				browsercontrol.set_position(point.x, (-var + point.y), dimension.width, var);
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public static void destroy() {
		if (browsercontrol.iscreated())
			browsercontrol.destroy();
	}

	public static void hide() {
		if (browsercontrol.iscreated())
			browsercontrol.hide();
	}

	public static boolean cs6401(String string) {
		if (!browsercontrol.iscreated())
			browsercontrol.create("about:blank");
		if (browsercontrol.iscreated()) {
			browsercontrol.navigate(string);
			return true;
		}
		return false;
	}
	
	public static boolean cs6402() {
		if (browsercontrol.iscreated()) {
			browsercontrol.navigate("about:blank");
			browsercontrol.hide();
			return true;
		}
		return false;
	}

}
