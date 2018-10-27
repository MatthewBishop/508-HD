/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.applet;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.lang.reflect.Method;
import java.net.URL;

import com.jagex.util.TimeUtil;
import com.jagex.util.Timer;
import com.jagex.util.Util;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {

	public static boolean aBoolean3818 = false;
	public static boolean[] aBooleanArray20;
	public static volatile long aLong6 = 0L;
	public static int anInt1136 = 500;
	
	public static int anInt37;
	public static int anInt38;
	public static int anInt39;
	public static int anInt4614;
	public static int anInt4843 = 0;
	public static short aShort22 = 32767;
	static {
		aBooleanArray20 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true, true, false };
	}

	public static void method30(int i, int i_18_) {
		ErrorReporting.anInt1025 = 1000 / i_18_;
	}

	public static void method39(boolean bool) {
		aBooleanArray20 = null;
		if (!bool)
			aBooleanArray20 = null;
	}

	public static void providesignlink(Class43 class43) {
		ErrorReporting.aClass43_358 = ErrorReporting.signlink = class43;
	}

	public boolean aBoolean4 = false;
	public static int anInt4622;
	public static long aLong4704 = 0L;
	public static boolean aBoolean1783;
	public static int anInt1197 = 0;
	public static int anInt4086;
	public static volatile boolean aBoolean2244 = true;
	public static volatile boolean aBoolean2154 = true;
	public static int anInt3820;
	public static int anInt1702;
	public static Applet_Sub1 anApplet_Sub1_1632 = null;
	public static boolean aBoolean1342;
	public static int anInt1340;
	public static int anInt3094;
	public static int anInt959 = 1;

	@Override
	public void destroy() {
		if (this == Applet_Sub1.anApplet_Sub1_1632 && !Applet_Sub1.aBoolean3818) {
			Applet_Sub1.aLong4704 = TimeUtil.getTime();
			Util.accuratesleep(5000L);
			ErrorReporting.aClass43_358 = null;
			method36(false, (byte) -67);
		}
	}

	public void focusGained(FocusEvent focusevent) {
		Applet_Sub1.aBoolean2154 = true;
		Applet_Sub1.aBoolean2244 = true;
	}

	public void focusLost(FocusEvent focusevent) {
		Applet_Sub1.aBoolean2154 = false;
	}

	@Override
	public AppletContext getAppletContext() {
		try {
			AppletContext var1;
			if (ErrorReporting.aFrame2986 != null) {
				var1 = null;
				return var1;
			} else if (ErrorReporting.signlink != null
					&& this != ErrorReporting.signlink.applet) {
				var1 = ErrorReporting.signlink.applet.getAppletContext();
				return var1;
			} else {
				var1 = super.getAppletContext();
				return var1;
			}
		} catch (Throwable var2) {
			throw Util.error(var2, "pb.getAppletContext()");
		}
	}

	@Override
	public URL getCodeBase() {
		if (ErrorReporting.aFrame2986 != null) {
			URL url = null;
			return url;
		}
		if (ErrorReporting.signlink != null && this != ErrorReporting.signlink.applet) {
			URL url = ErrorReporting.signlink.applet.getCodeBase();
			return url;
		}
		URL url = super.getCodeBase();
		return url;
	}

	@Override
	public URL getDocumentBase() {
		try {
			URL var1;
			if (ErrorReporting.aFrame2986 != null) {
				var1 = null;
				return var1;
			} else if (ErrorReporting.signlink != null
					&& this != ErrorReporting.signlink.applet) {
				var1 = ErrorReporting.signlink.applet.getDocumentBase();
				return var1;
			} else {
				var1 = super.getDocumentBase();
				return var1;
			}
		} catch (Throwable var2) {
			throw Util.error(var2, "pb.getDocumentBase()");
		}
	}

	@Override
	public String getParameter(String var1) {
		try {
			String var2;
			if (ErrorReporting.aFrame2986 != null) {
				var2 = null;
				return var2;
			} else if (ErrorReporting.signlink != null
					&& this != ErrorReporting.signlink.applet) {
				var2 = ErrorReporting.signlink.applet.getParameter(var1);
				return var2;
			} else {
				var2 = super.getParameter(var1);
				return var2;
			}
		} catch (Throwable var3) {
			throw Util.error(var3, "pb.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	@Override
	public abstract void init();

	public abstract void method25(int i);

	public void method26(int i) {
		if (i <= 113)
			method38(false);
		long l = ErrorReporting.aLongArray3914[ErrorReporting.anInt4530];
		long l_0_ = TimeUtil.getTime();
		ErrorReporting.aLongArray3914[ErrorReporting.anInt4530] = l_0_;
		if (0L != l && l < l_0_) {
			int i_1_ = (int) (l_0_ - l);
			Applet_Sub1.anInt4843 = ((i_1_ >> 33) + 32000) / i_1_;
		}
		ErrorReporting.anInt4530 = ErrorReporting.anInt4530 + 1 & 0x1f;
		if (Applet_Sub1.anInt1136++ > 50) {
			Applet_Sub1.anInt1136 -= 50;
			Applet_Sub1.aBoolean2244 = true;
			ErrorReporting.aCanvas819.setSize(Applet_Sub1.anInt1340, Applet_Sub1.anInt3094);
			ErrorReporting.aCanvas819.setVisible(true);
			if (ErrorReporting.aFrame2986 == null || ErrorReporting.aFrame3962 != null)
				ErrorReporting.aCanvas819.setLocation(ErrorReporting.anInt895, Applet_Sub1.anInt1197);
			else {
				Insets insets = ErrorReporting.aFrame2986.getInsets();
				ErrorReporting.aCanvas819.setLocation(ErrorReporting.anInt895 + insets.left, Applet_Sub1.anInt1197 + insets.top);
			}
		}
		method29(1);
	}

	public void method28(String string, int i) {
		do {
			try {
				if (!aBoolean4) {
					aBoolean4 = true;
					if (i == -1) {
						System.out.println(new StringBuilder("error_game_").append(string).toString());
						try {
							getAppletContext().showDocument(
									new URL(getCodeBase(),
											new StringBuilder("error_game_").append(string).append(".ws").toString()),
									"_top");
						} catch (Exception exception) {
							break;
						}
					}
				}
				break;
			} catch (Throwable throwable) {
				throw Util.error(throwable, new StringBuilder("pb.BA(")
						.append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
			}
		} while (false);
	}

	public abstract void method29(int i);

	public void method32(int i, int i_20_, int i_21_, int i_22_, String string, int i_23_, byte i_24_) {
		do {
			try {
				try {
					Applet_Sub1.anInt1197 = 0;
					Applet_Sub1.anApplet_Sub1_1632 = this;
					Applet_Sub1.anInt4086 = Applet_Sub1.anInt3094 = i_21_;
					Applet_Sub1.anInt4622 = Applet_Sub1.anInt1340 = i_22_;
					ErrorReporting.anInt895 = 0;
					Applet_Sub1.anInt4614 = i_20_;
					ErrorReporting.aFrame2986 = new Frame();
					ErrorReporting.aFrame2986.setTitle("Jagex");
					ErrorReporting.aFrame2986.setResizable(true);
					ErrorReporting.aFrame2986.addWindowListener(this);
					ErrorReporting.aFrame2986.setVisible(true);
					ErrorReporting.aFrame2986.toFront();
					Insets insets = ErrorReporting.aFrame2986.getInsets();
					ErrorReporting.aFrame2986.setSize(Applet_Sub1.anInt4622 + (insets.left + insets.right),
							insets.bottom + (insets.top + Applet_Sub1.anInt4086));
					ErrorReporting.aClass43_358 = ErrorReporting.signlink = new Class43(true, null, i_23_, string, i);
					ErrorReporting.signlink.method1143(5, this, 0);
				} catch (Exception exception) {
					ErrorReporting.method738(null, exception, 95);
				}
				if (i_24_ > 43)
					break;
			} catch (Throwable throwable) {
				throw Util.error(throwable,
						new StringBuilder("pb.W(").append(i).append(',').append(i_20_).append(',').append(i_21_)
								.append(',').append(i_22_).append(',').append(string != null ? "{...}" : "null")
								.append(',').append(i_23_).append(',').append(i_24_).append(')').toString());
			}
		} while (false);
	}

	public abstract void method33(int i);

	public abstract void method34(boolean bool);

	public void method35(String string, String string_25_, byte i) {
		if (!aBoolean4) {
			aBoolean4 = true;
			System.out.println(new StringBuilder("error_game_").append(string_25_).toString());
			try {
				getAppletContext().showDocument(new URL(getCodeBase(),
						new StringBuilder("error_game_").append(string_25_).append(".ws?").append(string).toString()),
						"_top");
			} catch (Exception exception) {
				/* empty */
			}
		}
	}

	public void method36(boolean var1, byte var2) {
		synchronized (this) {
			if (Applet_Sub1.aBoolean3818) {
				return;
			}

			Applet_Sub1.aBoolean3818 = true;
			if (var2 >= -3) {
				aLong6 = 34L;
			}
		}

		if (ErrorReporting.signlink.applet != null) {
			ErrorReporting.signlink.applet.destroy();
		}

		try {
			this.method38(true);
		} catch (Exception var7) {
			;
		}

		if (ErrorReporting.aCanvas819 != null) {
			try {
				ErrorReporting.aCanvas819.removeFocusListener(this);
				ErrorReporting.aCanvas819.getParent().remove(ErrorReporting.aCanvas819);
			} catch (Exception var6) {
				;
			}
		}

		if (ErrorReporting.signlink != null) {
			try {
				ErrorReporting.signlink.method1150((byte) 8);
			} catch (Exception var5) {
				;
			}
		}

		this.method33(31);
		if (ErrorReporting.aFrame2986 != null) {
			try {
				System.exit(0);
			} catch (Throwable var4) {
				;
			}
		}

		System.out.println("Shutdown complete - clean:" + var1);
	}

	public synchronized void method37(int i) {
		if (ErrorReporting.aCanvas819 != null) {
			ErrorReporting.aCanvas819.removeFocusListener(this);
			ErrorReporting.aCanvas819.getParent().remove(ErrorReporting.aCanvas819);
		}
		Container container;
		if (ErrorReporting.aFrame3962 == null) {
			if (ErrorReporting.aFrame2986 == null)
				container = ErrorReporting.signlink.applet;
			else
				container = ErrorReporting.aFrame2986;
		} else
			container = ErrorReporting.aFrame3962;
		container.setLayout(null);
		ErrorReporting.aCanvas819 = new Canvas_Sub1(this);
		ErrorReporting.aCanvas819.setIgnoreRepaint(true);
		if (i != 5)
			aBooleanArray20 = null;
		container.add(ErrorReporting.aCanvas819);
		ErrorReporting.aCanvas819.setSize(Applet_Sub1.anInt1340, Applet_Sub1.anInt3094);
		ErrorReporting.aCanvas819.setVisible(true);
		if (ErrorReporting.aFrame2986 == container) {
			Insets insets = ErrorReporting.aFrame2986.getInsets();
			ErrorReporting.aCanvas819.setLocation(ErrorReporting.anInt895 + insets.left, insets.top + Applet_Sub1.anInt1197);
		} else
			ErrorReporting.aCanvas819.setLocation(ErrorReporting.anInt895, Applet_Sub1.anInt1197);
		ErrorReporting.aCanvas819.addFocusListener(this);
		ErrorReporting.aCanvas819.requestFocus();
		Applet_Sub1.aBoolean2154 = true;
		Applet_Sub1.aBoolean1342 = true;
		Applet_Sub1.aBoolean2244 = true;
		ErrorReporting.aBoolean877 = false;
		ErrorReporting.aLong4029 = TimeUtil.getTime();
	}

	public abstract void method38(boolean bool);

	public void method40(int i, int i_46_, int i_47_, int i_48_, int i_49_) {
		try {
			if (Applet_Sub1.anApplet_Sub1_1632 != null) {
				ErrorReporting.anInt4386++;
				if (ErrorReporting.anInt4386 >= 3)
					method28("alreadyloaded", -1);
				else
					getAppletContext().showDocument(getDocumentBase(), "_self");
			} else {
				Applet_Sub1.anInt4614 = i_49_;
				Applet_Sub1.anInt4086 = Applet_Sub1.anInt3094 = i_46_;
				if (i_47_ != 13062)
					aBooleanArray20 = null;
				Applet_Sub1.anApplet_Sub1_1632 = this;
				Applet_Sub1.anInt1197 = 0;
				Applet_Sub1.anInt4622 = Applet_Sub1.anInt1340 = i_48_;
				ErrorReporting.anInt895 = 0;
				String string = getParameter("openwinjs");
				if (string == null || !string.equals("1"))
					Applet_Sub1.aBoolean1783 = false;
				else
					Applet_Sub1.aBoolean1783 = true;
				if (ErrorReporting.signlink == null)
					ErrorReporting.aClass43_358 = ErrorReporting.signlink = new Class43(false, this, i, null, 0);
				ErrorReporting.signlink.method1143(5, this, 0);
			}
		} catch (Exception exception) {
			ErrorReporting.method738(null, exception, 95);
			method28("crash", -1);
		}
	}

	public boolean method41(int var1) {
		try {
			String var2 = this.getDocumentBase().getHost().toLowerCase();
			boolean var3;
			if (var2.equals("InevitableIP") && !var2.endsWith("InevitableIP")) {
				if (!var2.equals("rsjserver.com") && !var2.endsWith(".rsjserver.com")) {
					if (var2.endsWith("127.0.0.1")) {
						var3 = true;
						return var3;
					} else if (var1 != 0) {
						var3 = false;
						return var3;
					} else {
						while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= 48
								&& var2.charAt(var2.length() - 1) <= 57) {
							var2 = var2.substring(0, var2.length() - 1);
						}

						if (var2.endsWith("192.168.1.")) {
							var3 = true;
							return var3;
						} else {
							this.method28("invalidhost", ~var1);
							var3 = false;
							return var3;
						}
					}
				} else {
					var3 = true;
					return var3;
				}
			} else {
				var3 = true;
				return var3;
			}
		} catch (Throwable var4) {
			throw Util.error(var4, "pb.DA(" + var1 + ')');
		}
	}

	public void method42(byte i) {
		long l = TimeUtil.getTime();
		if (i >= 100) {
			long l_62_ = (ErrorReporting.aLongArray4233[Applet_Sub1.anInt3820]);
			ErrorReporting.aLongArray4233[Applet_Sub1.anInt3820] = l;
			Applet_Sub1.anInt3820 = Applet_Sub1.anInt3820 + 1 & 0x1f;
			synchronized (this) {
				Applet_Sub1.aBoolean1342 = Applet_Sub1.aBoolean2154;
			}
			method34(true);
		}
	}

	@Override
	public synchronized void paint(Graphics graphics) {
		try {
			if (Applet_Sub1.anApplet_Sub1_1632 == this && !Applet_Sub1.aBoolean3818) {
				Applet_Sub1.aBoolean2244 = true;
				if (Class43.java_version != null)
					Class43.java_version.startsWith("1.5");
			}
		} catch (Throwable throwable) {
			throw Util.error(throwable,
					new StringBuilder("pb.paint(").append(graphics != null ? "{...}" : "null").append(')').toString());
		}
	}

	public void run() {
		label90: {
			label87: {
				label91: {
					String var1;
					try {
						if (Class43.java_vendor == null) {
							break label87;
						}

						var1 = Class43.java_vendor.toLowerCase();
						if (var1.indexOf("sun") == -1 && var1.indexOf("apple") == -1) {
							if (var1.indexOf("ibm") != -1
									&& (Class43.java_version == null || Class43.java_version.equals("1.4.2"))) {
								this.method28("wrongjava", -1);
								return;
							}
							break label87;
						}
					} catch (Exception var6) {
						break label91;
					}

					try {
						var1 = Class43.java_version;
						if (var1.equals("1.1") || var1.startsWith("1.1.") || var1.equals("1.2")
								|| var1.startsWith("1.2.")) {
							this.method28("wrongjava", -1);
							return;
						}
					} catch (Exception var5) {
						break label91;
					}

					try {
						Applet_Sub1.anInt959 = 5;
						break label87;
					} catch (Exception var4) {
						;
					}
				}

				Throwable var7 = new Throwable();
				ErrorReporting.method738((String) null, var7, 95);
				this.method28("crash", -1);
				break label90;
			}

			if (ErrorReporting.signlink.applet != null) {
				Method var8 = Class43.aMethod702;
				if (var8 != null) {
					try {
						var8.invoke(ErrorReporting.signlink.applet, new Object[] { Boolean.TRUE });
					} catch (Throwable var3) {
						;
					}
				}
			}

			this.method37(5);
			this.method25(-1);
			ErrorReporting.timer = Timer.create();

			while (Applet_Sub1.aLong4704 == 0L
					|| Applet_Sub1.aLong4704 > TimeUtil.getTime()) {
				Applet_Sub1.anInt1702 = ErrorReporting.timer.method1501(Applet_Sub1.anInt959, ErrorReporting.anInt1025);

				for (int var9 = 0; var9 < Applet_Sub1.anInt1702; ++var9) {
					this.method42((byte) 113);
				}

				this.method26(118);
				ErrorReporting.method555(41, ErrorReporting.signlink, ErrorReporting.aCanvas819);
			}
		}

		this.method36(true, (byte) -100);
	}

	@Override
	public void start() {
		try {
			if (Applet_Sub1.anApplet_Sub1_1632 == this && !Applet_Sub1.aBoolean3818)
				Applet_Sub1.aLong4704 = 0L;
		} catch (Throwable throwable) {
			throw Util.error(throwable, "pb.start()");
		}
	}

	@Override
	public void stop() {
		try {
			if (Applet_Sub1.anApplet_Sub1_1632 == this && !Applet_Sub1.aBoolean3818)
				Applet_Sub1.aLong4704 = TimeUtil.getTime() + 4000L;
		} catch (Throwable throwable) {
			throw Util.error(throwable, "pb.stop()");
		}
	}

	@Override
	public void update(Graphics graphics) {
		paint(graphics);
	}

	public void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	public void windowClosed(WindowEvent windowevent) {
		/* empty */
	}

	public void windowClosing(WindowEvent windowevent) {
		destroy();
	}

	public void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

	public void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public void windowOpened(WindowEvent windowevent) {
		/* empty */
	}
}
