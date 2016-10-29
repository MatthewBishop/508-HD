/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.io.js5;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileOnDisk {
	public long length;
	public long position;
	public File wrappedFile;
	public RandomAccessFile file;

	public void method1056(int i, int i_0_, byte[] is, int i_1_) throws IOException {
		if (position + (long) i_0_ > length) {
			file.seek(length - -1L);
			file.write(1);
			throw new EOFException();
		}
		file.write(is, i, i_0_);
		if (i_1_ == -20563)
			position += (long) i_0_;
	}

	public void method1057(int i) throws IOException {
		if (file != null) {
			file.close();
			file = null;
		}
		if (i != 25861)
			method1059((byte) -28);
	}

	public void method1058(int i, long l) throws IOException {
		file.seek(l);
		position = l;
		if (i >= -66)
			method1059((byte) 97);
	}

	public File method1059(byte i) {
		if (i < 119)
			file = null;
		File file = wrappedFile;
		return file;
	}

	public void finalize() throws Throwable {
		if (file != null) {
			System.out.println(new StringBuilder("Warning! fileondisk ").append(wrappedFile)
					.append(" not closed correctly using close(). Auto-closing instead. ").toString());
			method1057(25861);
		}
	}

	public int method1060(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		int i_4_ = file.read(is, i_2_, i_3_);
		if (i != 0) {
			int i_5_ = 41;
			return i_5_;
		}
		if (i_4_ > 0)
			position += (long) i_4_;
		int i_6_ = i_4_;
		return i_6_;
	}

	public FileOnDisk(File filea, String string, long l) throws IOException {
		if (-1L == l)
			l = 9223372036854775807L;
		if (l <= filea.length())
			filea.delete();
		file = new RandomAccessFile(filea, string);
		position = 0L;
		length = l;
		wrappedFile = filea;
		int i = file.read();
		if (i != -1 && !string.equals("r")) {
			file.seek(0L);
			file.write(i);
		}
		file.seek(0L);
	}

	public long method1061(byte i) throws IOException {
		if (i > -44)
			file = null;
		long l = file.length();
		return l;
	}
}
