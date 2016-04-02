/* Applet_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

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

import com.jagex.io.Buffer;
import com.jagex.util.TimeUtil;

import rs.tex.Class14_Sub8_Sub14;
import rs.tex.Class14_Sub8_Sub18;
import rs.tex.Class14_Sub8_Sub26;
import rs.tex.Class14_Sub8_Sub32;
import rs.tex.Class14_Sub8_Sub34;
import rs.tex.Class14_Sub8_Sub36;
import rs.tex.Class14_Sub8_Sub9;
import rs.tex.Static;

public abstract class Applet_Sub1 extends Applet implements Runnable, FocusListener, WindowListener {
	public boolean aBoolean4 = false;
	public static volatile long aLong6 = 0L;
	public static boolean[] aBooleanArray20;
	public static short aShort22 = 32767;
	public static int anInt37;
	public static int anInt38;
	public static int anInt39;

	static {
		aBooleanArray20 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true,
				true, true, true, true, true, true, true, true, true, true, true, false };
	}

	public abstract void method25(int i);

	public void method26(int i) {
		if (i <= 113)
			method38(false);
		long l = Class14_Sub2_Sub12.aLongArray3914[Class14_Sub8_Sub26.anInt4530];
		long l_0_ = TimeUtil.getTime();
		Class14_Sub2_Sub12.aLongArray3914[Class14_Sub8_Sub26.anInt4530] = l_0_;
		if (0L != l && l < l_0_) {
			int i_1_ = (int) (l_0_ - l);
			Class14_Sub9_Sub3.anInt4843 = ((i_1_ >> 33) + 32000) / i_1_;
		}
		Class14_Sub8_Sub26.anInt4530 = Class14_Sub8_Sub26.anInt4530 + 1 & 0x1f;
		if (Class74.anInt1136++ > 50) {
			Class74.anInt1136 -= 50;
			Class141.aBoolean2244 = true;
			Class49.aCanvas819.setSize(Class83.anInt1340, Class14_Sub20.anInt3094);
			Class49.aCanvas819.setVisible(true);
			if (Class14_Sub14.aFrame2986 == null || Static.aFrame3962 != null)
				Class49.aCanvas819.setLocation(Static.anInt895, Class76.anInt1197);
			else {
				Insets insets = Class14_Sub14.aFrame2986.getInsets();
				Class49.aCanvas819.setLocation(Static.anInt895 + insets.left, Class76.anInt1197 + insets.top);
			}
		}
		method29(1);
	}

	public void windowDeactivated(WindowEvent windowevent) {
		/* empty */
	}

	public void focusGained(FocusEvent focusevent) {
		Class131.aBoolean2154 = true;
		Class141.aBoolean2244 = true;
	}

	public URL getCodeBase() {
		if (Class14_Sub14.aFrame2986 != null) {
			URL url = null;
			return url;
		}
		if (Class14_Sub8_Sub34.aClass43_4647 != null && this != Class14_Sub8_Sub34.aClass43_4647.anApplet712) {
			URL url = Class14_Sub8_Sub34.aClass43_4647.anApplet712.getCodeBase();
			return url;
		}
		URL url = super.getCodeBase();
		return url;
	}

	public void update(Graphics graphics) {
		paint(graphics);
	}

	public static Class21 method27(int var0, int var1) {
		try {
			Class21 var2 = (Class21) Class14_Sub6.aClass52_2817.method1210((byte) 64, (long) var0);
			if (var2 != null) {
				return var2;
			} else {
				byte[] var3 = Static.aClass9_2792.method163(var0, 3, 0);
				Class21 var4 = new Class21();
				if (var3 != null) {
					var4.method980(-29502, new Buffer(var3));
				}

				if (var1 != -4) {
					method30(-23, -113);
				}

				Class14_Sub6.aClass52_2817.method1205(var4, (long) var0);
				return var4;
			}
		} catch (Throwable var5) {
			throw Class14_Sub8_Sub14.method554(var5, "pb.JA(" + var0 + ',' + var1 + ')');
		}
	}

	public void start() {
		try {
			if (Class96.anApplet_Sub1_1632 == this && !Class14_Sub2_Sub5.aBoolean3818)
				Class14_Sub8_Sub36.aLong4704 = 0L;
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable, "pb.start()");
		}
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
				throw Class14_Sub8_Sub14.method554(throwable, new StringBuilder("pb.BA(")
						.append(string != null ? "{...}" : "null").append(',').append(i).append(')').toString());
			}
		} while (false);
	}

	public String getParameter(String var1) {
		try {
			String var2;
			if (Class14_Sub14.aFrame2986 != null) {
				var2 = null;
				return var2;
			} else if (Class14_Sub8_Sub34.aClass43_4647 != null
					&& this != Class14_Sub8_Sub34.aClass43_4647.anApplet712) {
				var2 = Class14_Sub8_Sub34.aClass43_4647.anApplet712.getParameter(var1);
				return var2;
			} else {
				var2 = super.getParameter(var1);
				return var2;
			}
		} catch (Throwable var3) {
			throw Class14_Sub8_Sub14.method554(var3, "pb.getParameter(" + (var1 != null ? "{...}" : "null") + ')');
		}
	}

	public abstract void method29(int i);

	public void windowIconified(WindowEvent windowevent) {
		/* empty */
	}

	public static void method30(int i, int i_18_) {
		Class65.anInt1025 = 1000 / i_18_;
	}

	public static void method31(Class9 class9, byte i, Interface5 interface5, Class9 class9_19_) {
		Class14_Sub8_Sub18.aClass9_4384 = class9;
		if (i != -4)
			method31(null, (byte) 11, null, null);
		Class14_Sub2_Sub8.aClass9_3850 = class9_19_;
		Canvas_Sub1.anInterface5_48 = interface5;
	}

	public abstract void init();

	public void method32(int i, int i_20_, int i_21_, int i_22_, String string, int i_23_, byte i_24_) {
		do {
			try {
				try {
					Class76.anInt1197 = 0;
					Class96.anApplet_Sub1_1632 = this;
					Class14_Sub2_Sub21.anInt4086 = Class14_Sub20.anInt3094 = i_21_;
					Class14_Sub8_Sub32.anInt4622 = Class83.anInt1340 = i_22_;
					Static.anInt895 = 0;
					Class14_Sub8_Sub32.anInt4614 = i_20_;
					Class14_Sub14.aFrame2986 = new Frame();
					Class14_Sub14.aFrame2986.setTitle("Jagex");
					Class14_Sub14.aFrame2986.setResizable(true);
					Class14_Sub14.aFrame2986.addWindowListener(this);
					Class14_Sub14.aFrame2986.setVisible(true);
					Class14_Sub14.aFrame2986.toFront();
					Insets insets = Class14_Sub14.aFrame2986.getInsets();
					Class14_Sub14.aFrame2986.setSize(Class14_Sub8_Sub32.anInt4622 + (insets.left + insets.right),
							insets.bottom + (insets.top + Class14_Sub2_Sub21.anInt4086));
					Static2.aClass43_358 = Class14_Sub8_Sub34.aClass43_4647 = new Class43(true, null, i_23_, string, i);
					Class14_Sub8_Sub34.aClass43_4647.method1143(5, this, 0);
				} catch (Exception exception) {
					Class14_Sub9_Sub3.method738(null, exception, 95);
				}
				if (i_24_ > 43)
					break;
			} catch (Throwable throwable) {
				throw Class14_Sub8_Sub14.method554(throwable,
						new StringBuilder("pb.W(").append(i).append(',').append(i_20_).append(',').append(i_21_)
								.append(',').append(i_22_).append(',').append(string != null ? "{...}" : "null")
								.append(',').append(i_23_).append(',').append(i_24_).append(')').toString());
			}
		} while (false);
	}

	public synchronized void paint(Graphics graphics) {
		try {
			if (Class96.anApplet_Sub1_1632 == this && !Class14_Sub2_Sub5.aBoolean3818) {
				Class141.aBoolean2244 = true;
				if (Class43.aString723 != null)
					Class43.aString723.startsWith("1.5");
			}
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable,
					new StringBuilder("pb.paint(").append(graphics != null ? "{...}" : "null").append(')').toString());
		}
	}

	public abstract void method33(int i);

	public void windowActivated(WindowEvent windowevent) {
		/* empty */
	}

	public void stop() {
		try {
			if (Class96.anApplet_Sub1_1632 == this && !Class14_Sub2_Sub5.aBoolean3818)
				Class14_Sub8_Sub36.aLong4704 = TimeUtil.getTime() + 4000L;
		} catch (Throwable throwable) {
			throw Class14_Sub8_Sub14.method554(throwable, "pb.stop()");
		}
	}

	public abstract void method34(boolean bool);

	public void windowDeiconified(WindowEvent windowevent) {
		/* empty */
	}

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
			if (Class14_Sub2_Sub5.aBoolean3818) {
				return;
			}

			Class14_Sub2_Sub5.aBoolean3818 = true;
			if (var2 >= -3) {
				aLong6 = 34L;
			}
		}

		if (Class14_Sub8_Sub34.aClass43_4647.anApplet712 != null) {
			Class14_Sub8_Sub34.aClass43_4647.anApplet712.destroy();
		}

		try {
			this.method38(true);
		} catch (Exception var7) {
			;
		}

		if (Class49.aCanvas819 != null) {
			try {
				Class49.aCanvas819.removeFocusListener(this);
				Class49.aCanvas819.getParent().remove(Class49.aCanvas819);
			} catch (Exception var6) {
				;
			}
		}

		if (Class14_Sub8_Sub34.aClass43_4647 != null) {
			try {
				Class14_Sub8_Sub34.aClass43_4647.method1150((byte) 8);
			} catch (Exception var5) {
				;
			}
		}

		this.method33(31);
		if (Class14_Sub14.aFrame2986 != null) {
			try {
				System.exit(0);
			} catch (Throwable var4) {
				;
			}
		}

		System.out.println("Shutdown complete - clean:" + var1);
	}

	public static void providesignlink(Class43 class43) {
		Static2.aClass43_358 = Class14_Sub8_Sub34.aClass43_4647 = class43;
	}

	public void windowClosing(WindowEvent windowevent) {
		destroy();
	}

	public void run() {
		label90: {
			label87: {
				label91: {
					String var1;
					try {
						if (Class43.aString721 == null) {
							break label87;
						}

						var1 = Class43.aString721.toLowerCase();
						if (var1.indexOf("sun") == -1 && var1.indexOf("apple") == -1) {
							if (var1.indexOf("ibm") != -1
									&& (Class43.aString723 == null || Class43.aString723.equals("1.4.2"))) {
								this.method28("wrongjava", -1);
								return;
							}
							break label87;
						}
					} catch (Exception var6) {
						break label91;
					}

					try {
						var1 = Class43.aString723;
						if (var1.equals("1.1") || var1.startsWith("1.1.") || var1.equals("1.2")
								|| var1.startsWith("1.2.")) {
							this.method28("wrongjava", -1);
							return;
						}
					} catch (Exception var5) {
						break label91;
					}

					try {
						Class59.anInt959 = 5;
						break label87;
					} catch (Exception var4) {
						;
					}
				}

				Throwable var7 = new Throwable();
				Class14_Sub9_Sub3.method738((String) null, var7, 95);
				this.method28("crash", -1);
				break label90;
			}

			if (Class14_Sub8_Sub34.aClass43_4647.anApplet712 != null) {
				Method var8 = Class43.aMethod702;
				if (var8 != null) {
					try {
						var8.invoke(Class14_Sub8_Sub34.aClass43_4647.anApplet712, new Object[] { Boolean.TRUE });
					} catch (Throwable var3) {
						;
					}
				}
			}

			this.method37(5);
			this.method25(-1);
			Class48.aClass99_804 = Class125_Sub3.method1736(123);

			while (Class14_Sub8_Sub36.aLong4704 == 0L
					|| Class14_Sub8_Sub36.aLong4704 > TimeUtil.getTime()) {
				Class102.anInt1702 = Class48.aClass99_804.method1501(Class59.anInt959, -1, Class65.anInt1025);

				for (int var9 = 0; var9 < Class102.anInt1702; ++var9) {
					this.method42((byte) 113);
				}

				this.method26(118);
				Class14_Sub8_Sub14.method555(41, Class14_Sub8_Sub34.aClass43_4647, Class49.aCanvas819);
			}
		}

		this.method36(true, (byte) -100);
	}

	public AppletContext getAppletContext() {
		try {
			AppletContext var1;
			if (Class14_Sub14.aFrame2986 != null) {
				var1 = null;
				return var1;
			} else if (Class14_Sub8_Sub34.aClass43_4647 != null
					&& this != Class14_Sub8_Sub34.aClass43_4647.anApplet712) {
				var1 = Class14_Sub8_Sub34.aClass43_4647.anApplet712.getAppletContext();
				return var1;
			} else {
				var1 = super.getAppletContext();
				return var1;
			}
		} catch (Throwable var2) {
			throw Class14_Sub8_Sub14.method554(var2, "pb.getAppletContext()");
		}
	}

	public synchronized void method37(int i) {
		if (Class49.aCanvas819 != null) {
			Class49.aCanvas819.removeFocusListener(this);
			Class49.aCanvas819.getParent().remove(Class49.aCanvas819);
		}
		Container container;
		if (Static.aFrame3962 == null) {
			if (Class14_Sub14.aFrame2986 == null)
				container = Class14_Sub8_Sub34.aClass43_4647.anApplet712;
			else
				container = Class14_Sub14.aFrame2986;
		} else
			container = Static.aFrame3962;
		container.setLayout(null);
		Class49.aCanvas819 = new Canvas_Sub1(this);
		Class49.aCanvas819.setIgnoreRepaint(true);
		if (i != 5)
			aBooleanArray20 = null;
		container.add(Class49.aCanvas819);
		Class49.aCanvas819.setSize(Class83.anInt1340, Class14_Sub20.anInt3094);
		Class49.aCanvas819.setVisible(true);
		if (Class14_Sub14.aFrame2986 == container) {
			Insets insets = Class14_Sub14.aFrame2986.getInsets();
			Class49.aCanvas819.setLocation(Static.anInt895 + insets.left, insets.top + Class76.anInt1197);
		} else
			Class49.aCanvas819.setLocation(Static.anInt895, Class76.anInt1197);
		Class49.aCanvas819.addFocusListener(this);
		Class49.aCanvas819.requestFocus();
		Class131.aBoolean2154 = true;
		Class83.aBoolean1342 = true;
		Class141.aBoolean2244 = true;
		Class54.aBoolean877 = false;
		Class14_Sub2_Sub18.aLong4029 = TimeUtil.getTime();
	}

	public void focusLost(FocusEvent focusevent) {
		Class131.aBoolean2154 = false;
	}

	public abstract void method38(boolean bool);

	public void destroy() {
		if (this == Class96.anApplet_Sub1_1632 && !Class14_Sub2_Sub5.aBoolean3818) {
			Class14_Sub8_Sub36.aLong4704 = TimeUtil.getTime();
			Class14_Sub13.method864(5000L, (byte) 64);
			Static2.aClass43_358 = null;
			method36(false, (byte) -67);
		}
	}

	public URL getDocumentBase() {
		try {
			URL var1;
			if (Class14_Sub14.aFrame2986 != null) {
				var1 = null;
				return var1;
			} else if (Class14_Sub8_Sub34.aClass43_4647 != null
					&& this != Class14_Sub8_Sub34.aClass43_4647.anApplet712) {
				var1 = Class14_Sub8_Sub34.aClass43_4647.anApplet712.getDocumentBase();
				return var1;
			} else {
				var1 = super.getDocumentBase();
				return var1;
			}
		} catch (Throwable var2) {
			throw Class14_Sub8_Sub14.method554(var2, "pb.getDocumentBase()");
		}
	}

	public static void method39(boolean bool) {
		aBooleanArray20 = null;
		if (!bool)
			aBooleanArray20 = null;
	}

	public void method40(int i, int i_46_, int i_47_, int i_48_, int i_49_) {
		try {
			if (Class96.anApplet_Sub1_1632 != null) {
				Class14_Sub8_Sub18.anInt4386++;
				if (Class14_Sub8_Sub18.anInt4386 >= 3)
					method28("alreadyloaded", -1);
				else
					getAppletContext().showDocument(getDocumentBase(), "_self");
			} else {
				Class14_Sub8_Sub32.anInt4614 = i_49_;
				Class14_Sub2_Sub21.anInt4086 = Class14_Sub20.anInt3094 = i_46_;
				if (i_47_ != 13062)
					aBooleanArray20 = null;
				Class96.anApplet_Sub1_1632 = this;
				Class76.anInt1197 = 0;
				Class14_Sub8_Sub32.anInt4622 = Class83.anInt1340 = i_48_;
				Static.anInt895 = 0;
				String string = getParameter("openwinjs");
				if (string == null || !string.equals("1"))
					Static2.aBoolean1783 = false;
				else
					Static2.aBoolean1783 = true;
				if (Class14_Sub8_Sub34.aClass43_4647 == null)
					Static2.aClass43_358 = Class14_Sub8_Sub34.aClass43_4647 = new Class43(false, this, i, null, 0);
				Class14_Sub8_Sub34.aClass43_4647.method1143(5, this, 0);
			}
		} catch (Exception exception) {
			Class14_Sub9_Sub3.method738(null, exception, 95);
			method28("crash", -1);
		}
	}

	public void windowClosed(WindowEvent windowevent) {
		/* empty */
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
			throw Class14_Sub8_Sub14.method554(var4, "pb.DA(" + var1 + ')');
		}
	}

	public void windowOpened(WindowEvent windowevent) {
		/* empty */
	}

	public void method42(byte i) {
		long l = TimeUtil.getTime();
		if (i >= 100) {
			long l_62_ = (Class14_Sub8_Sub9.aLongArray4233[Class14_Sub2_Sub7.anInt3820]);
			Class14_Sub8_Sub9.aLongArray4233[Class14_Sub2_Sub7.anInt3820] = l;
			Class14_Sub2_Sub7.anInt3820 = Class14_Sub2_Sub7.anInt3820 + 1 & 0x1f;
			synchronized (this) {
				Class83.aBoolean1342 = Class131.aBoolean2154;
			}
			method34(true);
		}
	}
}
