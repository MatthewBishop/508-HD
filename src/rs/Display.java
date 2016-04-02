/* Display - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class Display {
	private GraphicsDevice agraphicsdevice;
	private DisplayMode adisplaymode;

	public int[] getDisPlayModes(byte i) {
		DisplayMode[] displaymodes = agraphicsdevice.getDisplayModes();
		int[] is = new int[displaymodes.length << 2];
		if (i != -82)
			adisplaymode = null;
		for (int i_0_ = 0; i_0_ < displaymodes.length; i_0_++) {
			is[i_0_ << 2] = displaymodes[i_0_].getWidth();
			is[(i_0_ << 34) + 1] = displaymodes[i_0_].getHeight();
			is[(i_0_ << 34) + 2] = displaymodes[i_0_].getBitDepth();
			is[(i_0_ << 2) + 3] = displaymodes[i_0_].getRefreshRate();
		}
		int[] is_1_ = is;
		return is_1_;
	}

	public Display() throws Exception {
		GraphicsEnvironment graphicsenvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		agraphicsdevice = graphicsenvironment.getDefaultScreenDevice();
		if (!agraphicsdevice.isFullScreenSupported()) {
			GraphicsDevice[] graphicsdevices = graphicsenvironment.getScreenDevices();
			int i = 0;
			for (GraphicsDevice[] graphicsdevices_2_ = graphicsdevices; graphicsdevices_2_.length > i; i++) {
				GraphicsDevice graphicsdevice = graphicsdevices_2_[i];
				if (graphicsdevice != null && graphicsdevice.isFullScreenSupported()) {
					agraphicsdevice = graphicsdevice;
					return;
				}
			}
			throw new Exception();
		}
	}

	public void goFullScreen(byte i, int i_3_, int i_4_, int i_5_, int i_6_, Frame frame) {
		adisplaymode = agraphicsdevice.getDisplayMode();
		if (adisplaymode == null)
			throw new NullPointerException();
		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		getGraphicsDevice(frame, (byte) -123);
		if (i == 16) {
			if (i_4_ == 0) {
				int i_7_ = adisplaymode.getRefreshRate();
				DisplayMode[] displaymodes = agraphicsdevice.getDisplayModes();
				boolean bool = false;
				for (int i_8_ = 0; i_8_ < displaymodes.length; i_8_++) {
					if (displaymodes[i_8_].getWidth() == i_3_ && i_5_ == displaymodes[i_8_].getHeight()
							&& displaymodes[i_8_].getBitDepth() == i_6_) {
						int i_9_ = displaymodes[i_8_].getRefreshRate();
						if (!bool || Math.abs(i_9_ - i_7_) < Math.abs(i_4_ - i_7_)) {
							i_4_ = i_9_;
							bool = true;
						}
					}
				}
				if (!bool)
					i_4_ = i_7_;
			}
			agraphicsdevice.setDisplayMode(new DisplayMode(i_3_, i_5_, i_6_, i_4_));
		}
	}

	public void setDisplayMode(byte i) {
		if (adisplaymode != null) {
			agraphicsdevice.setDisplayMode(adisplaymode);
			if (!agraphicsdevice.getDisplayMode().equals(adisplaymode))
				throw new RuntimeException("Did not return to correct resolution!");
			adisplaymode = null;
		}
		if (i > -89)
			adisplaymode = null;
		getGraphicsDevice(null, (byte) -128);
	}

	private void getGraphicsDevice(Frame frame, byte i) {
		boolean bool = false;
		try {
			Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			field.setAccessible(true);
			boolean bool_10_ = ((Boolean) field.get(agraphicsdevice)).booleanValue();
			if (bool_10_) {
				field.set(agraphicsdevice, Boolean.FALSE);
				bool = true;
			}
		} catch (Throwable throwable) {
			/* empty */
		}
		if (i > -113)
			adisplaymode = null;
		agraphicsdevice.setFullScreenWindow(frame);
		if (bool) {
			try {
				Field field = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
				field.set(agraphicsdevice, Boolean.TRUE);
			} catch (Throwable throwable) {
				/* empty */
			}
		}
	}
}
