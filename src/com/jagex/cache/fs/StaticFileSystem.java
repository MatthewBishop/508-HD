package com.jagex.cache.fs;

import com.jagex.io.Buffer;

public class StaticFileSystem {

	public static GZipDecompressor gzipDecompressor = new GZipDecompressor();

	public static byte[] unpackContainer(byte[] is) {
		Buffer class14_sub10 = new Buffer(is);
		int i_12_ = class14_sub10.readUByte();
		int i_13_ = class14_sub10.getInt((byte) -107);
		if (i_13_ < 0 || StaticFileSystem.anInt2797 != 0 && i_13_ > StaticFileSystem.anInt2797)
			throw new RuntimeException();
		if (i_12_ == 0) {
			byte[] is_14_ = new byte[i_13_];
			class14_sub10.method824(i_13_, (byte) 97, 0, is_14_);
			byte[] is_15_ = is_14_;
			return is_15_;
		}
		int i_16_ = class14_sub10.getInt((byte) -120);
		if (i_16_ < 0 || StaticFileSystem.anInt2797 != 0 && i_16_ > StaticFileSystem.anInt2797)
			throw new RuntimeException();
		byte[] is_17_ = new byte[i_16_];
		if (i_12_ != 1)
			gzipDecompressor.decompress(is_17_, class14_sub10);
		else
			BZip2Decompressor.decompress(is_17_, i_16_, is, i_13_, 9);
		byte[] is_18_ = is_17_;
		return is_18_;
	}

	public static int anInt2797 = 0;

}
