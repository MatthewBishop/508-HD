package com.jagex.applet;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;

import com.jagex.util.RuntimeException_Sub1;
import com.jagex.util.Timer;
import com.jagex.util.Util;

public class ErrorReporting {

	public static void method738(String string, Throwable throwable, int i) {
		while_352_: do {
			while_351_: do {
				String string_11_;
				while_350_: do {
					do {
						try {
							string_11_ = "";
							if (throwable != null)
								string_11_ = ErrorReporting.method1947(throwable);
							if (string != null) {
								if (throwable != null)
									string_11_ = new StringBuilder(string_11_).append(" | ").toString();
								string_11_ = new StringBuilder(string_11_).append(string).toString();
							}
							System.out.println(new StringBuilder("Error: ").append(string_11_).toString());
							string_11_ = string_11_.replace(':', '.');
							string_11_ = string_11_.replace('@', '_');
							string_11_ = string_11_.replace('&', '_');
							string_11_ = string_11_.replace('#', (char) i);
							if (ErrorReporting.aClass43_358.applet == null)
								break;
						} catch (Exception exception) {
							break while_351_;
						}
						break while_350_;
					} while (false);
					return;
				} while (false);
				try {
					Class31 class31 = (ErrorReporting.aClass43_358.method1147((byte) -119, new URL(
							ErrorReporting.aClass43_358.applet.getCodeBase(),
							new StringBuilder("clienterror.ws?c=").append(Applet_Sub1.anInt4614).append("&u=")
									.append(ErrorReporting.aLong802).append("&v1=").append(Class43.java_vendor).append("&v2=")
									.append(Class43.java_version).append("&e=").append(string_11_).toString())));
					while (class31.anInt529 == 0)
						Util.accuratesleep(1L);
					if (class31.anInt529 == 1) {
						DataInputStream datainputstream = (DataInputStream) class31.anObject530;
						datainputstream.read();
						datainputstream.close();
					}
				} catch (Exception exception) {
					break;
				}
				break while_352_;
			} while (false);
			Throwable throwable_12_ = new Throwable();
		} while (false);
	}

	public static String method1947(Throwable throwable) throws IOException {
		String string;
		if (!(throwable instanceof RuntimeException_Sub1))
			string = "";
		else {
			RuntimeException_Sub1 runtimeexception_sub1 = (RuntimeException_Sub1) throwable;
			throwable = runtimeexception_sub1.aThrowable2461;
			string = new StringBuilder(runtimeexception_sub1.aString2457).append(" | ").toString();
		}
		StringWriter stringwriter = new StringWriter();
		PrintWriter printwriter = new PrintWriter(stringwriter);
		throwable.printStackTrace(printwriter);
		printwriter.close();
		String string_15_ = stringwriter.toString();
		BufferedReader bufferedreader = new BufferedReader(new StringReader(string_15_));
		String string_16_ = bufferedreader.readLine();
		for (;;) {
			String string_17_ = bufferedreader.readLine();
			if (string_17_ == null)
				break;
			int i_18_ = string_17_.indexOf('(');
			int i_19_ = string_17_.indexOf(')', i_18_ + 1);
			if (i_18_ >= 0 && i_19_ >= 0) {
				String string_20_ = string_17_.substring(i_18_ + 1, i_19_);
				int i_21_ = string_20_.indexOf(".java:");
				if (i_21_ >= 0) {
					string_20_ = new StringBuilder(string_20_.substring(0, i_21_))
							.append(string_20_.substring(i_21_ + 5)).toString();
					string = new StringBuilder(string).append(string_20_).append(' ').toString();
					continue;
				}
				string_17_ = string_17_.substring(0, i_18_);
			}
			string_17_ = string_17_.trim();
			string_17_ = string_17_.substring(string_17_.lastIndexOf(' ') + 1);
			string_17_ = string_17_.substring(string_17_.lastIndexOf('\t') + 1);
			string = new StringBuilder(string).append(string_17_).append(' ').toString();
		}
		string = new StringBuilder(string).append("| ").append(string_16_).toString();
		String string_22_ = string;
		return string_22_;
	}

	public static long aLong802;
	public static Class43 aClass43_358;
	public static Class43 signlink;
	
	public static void destroy() {
		ErrorReporting.aClass43_358 = null;
		ErrorReporting.signlink = null;
		timer = null;
		aCanvas819 = null;
		aLongArray3914 = null;
		aLongArray4233 = null;
		aFrame2986 = null;
		ErrorReporting.aFrame3962 = null;
	}

	public static volatile boolean aBoolean877 = false;
	public static int anInt1025 = 20;
	public static Timer timer;
	public static Canvas aCanvas819;
	public static long[] aLongArray3914 = new long[32];

	public static void method531(byte i) {
		timer.reset();
		for (int i_0_ = 0; i_0_ < 32; i_0_++)
			aLongArray3914[i_0_] = 0L;
		for (int i_1_ = 0; i_1_ < 32; i_1_++)
			ErrorReporting.aLongArray4233[i_1_] = 0L;
		Applet_Sub1.anInt1702 = 0;
	}

	public static long[] aLongArray4233 = new long[32];
	public static Frame aFrame2986;
	public static volatile long aLong4029 = 0L;
	public static int anInt4530;
	public static int anInt895 = 0;
	public static int anInt4386 = 0;
	public static Frame aFrame3962;

	public static void method555(int i, Class43 class43, Object object) {
		if (class43.eventQueue != null) {
			int i_11_ = 0;
			if (i > 37) {
				for (/**/; i_11_ < 50 && class43.eventQueue.peekEvent() != null; i_11_++)
					Util.accuratesleep(1L);
				if (object != null)
					class43.eventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
			}
		}
	}
}
