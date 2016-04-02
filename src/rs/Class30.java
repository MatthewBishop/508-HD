/* Class30 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Class30 {
	public long aLong521;
	public long aLong522;
	public File aFile523;
	public RandomAccessFile aRandomAccessFile524;

	public void method1056(int i, int i_0_, byte[] is, int i_1_) throws IOException {
		if (aLong522 + (long) i_0_ > aLong521) {
			aRandomAccessFile524.seek(aLong521 - -1L);
			aRandomAccessFile524.write(1);
			throw new EOFException();
		}
		aRandomAccessFile524.write(is, i, i_0_);
		if (i_1_ == -20563)
			aLong522 += (long) i_0_;
	}

	public void method1057(int i) throws IOException {
		if (aRandomAccessFile524 != null) {
			aRandomAccessFile524.close();
			aRandomAccessFile524 = null;
		}
		if (i != 25861)
			method1059((byte) -28);
	}

	public void method1058(int i, long l) throws IOException {
		aRandomAccessFile524.seek(l);
		aLong522 = l;
		if (i >= -66)
			method1059((byte) 97);
	}

	public File method1059(byte i) {
		if (i < 119)
			aRandomAccessFile524 = null;
		File file = aFile523;
		return file;
	}

	public void finalize() throws Throwable {
		if (aRandomAccessFile524 != null) {
			System.out.println(new StringBuilder("Warning! fileondisk ").append(aFile523)
					.append(" not closed correctly using close(). Auto-closing instead. ").toString());
			method1057(25861);
		}
	}

	public int method1060(byte[] is, int i, int i_2_, int i_3_) throws IOException {
		int i_4_ = aRandomAccessFile524.read(is, i_2_, i_3_);
		if (i != 0) {
			int i_5_ = 41;
			return i_5_;
		}
		if (i_4_ > 0)
			aLong522 += (long) i_4_;
		int i_6_ = i_4_;
		return i_6_;
	}

	public Class30(File file, String string, long l) throws IOException {
		if (-1L == l)
			l = 9223372036854775807L;
		if (l <= file.length())
			file.delete();
		aRandomAccessFile524 = new RandomAccessFile(file, string);
		aLong522 = 0L;
		aLong521 = l;
		aFile523 = file;
		int i = aRandomAccessFile524.read();
		if (i != -1 && !string.equals("r")) {
			aRandomAccessFile524.seek(0L);
			aRandomAccessFile524.write(i);
		}
		aRandomAccessFile524.seek(0L);
	}

	public long method1061(byte i) throws IOException {
		if (i > -44)
			aRandomAccessFile524 = null;
		long l = aRandomAccessFile524.length();
		return l;
	}
}
