package com.jagex.io.js5;

import java.io.IOException;
import java.util.zip.CRC32;

import com.jagex.applet.ErrorReporting;
import com.jagex.io.Buffer;
import com.jagex.link.Deque;
import com.jagex.link.HashTable;
import com.jagex.link.Queue;
import com.jagex.util.TimeUtil;

import rs.Class36;

public class SFSS {
	
	public static void method1832(int i, byte i_11_, int i_12_) {
		if (i_11_ == -73) {
			long l = i + (i_12_ << 48);
			BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_3698.get(l));
			if (class14_sub2_sub9 != null)
				SFSS.aClass81_4716.pushFront(class14_sub2_sub9);
		}
	}

	public static void method71(CacheFile cacheFile, int i, byte i_7_, byte[] is) {
		UpdateServerNode class14_sub19 = new UpdateServerNode();
		class14_sub19.key = i;
		class14_sub19.anInt3067 = 0;
		class14_sub19.cache = cacheFile;
		class14_sub19.data = is;
		Deque deque = SFSS.aClass2_4404;
		synchronized (deque) {
			SFSS.aClass2_4404.pushBack(class14_sub19);
		}
		SFSS.method696();
	}

	public static void kill() {
		aCRC32_171 = null;
		SFSS.aByteArray5102 = null;
		SFSS.aClass81_4716 = null;
		SFSS.aClass55_3698 = null;
		SFSS.aClass2_4404 = null;
		aBufferedRequest_4354 = null;
		SFSS.aClass14_Sub10_989 = null;
		SFSS.aClass14_Sub10_3796 = null;
		SFSS.aCacheFileWorkerArray2253 = null;
		aClass55_4112 = null;
		aCRC32_2983 = null;
		SFSS.aClass55_4227 = null;
		aClass14_Sub10_3036 = null;
		aClass55_1092 = null;
		anObject4417 = null;
		SFSS.aClass2_99 = null;
		aClass36_134 = null;
	}

	public static CRC32 aCRC32_171 = new CRC32();

	public static int method1829(int i, int i_1_) {
		long l = i_1_ + (i << 16);
		if (SFSS.aBufferedRequest_4354 == null || l != SFSS.aBufferedRequest_4354.key) {
			int i_2_ = 0;
			return i_2_;
		}
		int i_3_ = ((SFSS.aClass14_Sub10_989.position * 99 / (-SFSS.aBufferedRequest_4354.padding
				+ SFSS.aClass14_Sub10_989.payload.length)) + 1);
		return i_3_;
	}

	public static void method1277(int i, CacheFileWorker class9_sub1, int i_1_, CacheFile cacheFile) {
		byte[] is = null;
		Deque deque = SFSS.aClass2_4404;
		synchronized (deque) {
			UpdateServerNode class14_sub19 = (UpdateServerNode) SFSS.aClass2_4404.getFront();
			while (class14_sub19 != null) {
				if (i_1_ != class14_sub19.key || class14_sub19.cache != cacheFile
						|| class14_sub19.anInt3067 != 0)
					class14_sub19 = ((UpdateServerNode) SFSS.aClass2_4404.getNext());
				else {
					is = class14_sub19.data;
					break;
				}
			}
		}
		if (is != null)
			class9_sub1.method182(cacheFile, i_1_, is, true, (byte) 55);
		else {
			is = cacheFile.method1582(124, i_1_);
			class9_sub1.method182(cacheFile, i_1_, is, true, (byte) 55);
		}
	}

	public static void method969(int i, CacheFileWorker class9_sub1, byte i_0_) {
		if (SFSS.aClass14_Sub10_3796 != null) {
			SFSS.aClass14_Sub10_3796.position = i * 8 + 5;
			int i_1_ = SFSS.aClass14_Sub10_3796.getInt((byte) -126);
			int i_2_ = SFSS.aClass14_Sub10_3796.getInt((byte) -98);
			class9_sub1.method180(-6, i_2_, i_1_);
		} else {
			SFSS.method633((byte) 0, 115, null, 255, true, 0, 255);
			if (-71 < -27)
				SFSS.aCacheFileWorkerArray2253[i] = class9_sub1;
		}
	}

	public static void method633(byte i, int i_0_, CacheFileWorker class9_sub1, int i_1_, boolean bool, int i_2_,
			int i_3_) {
		long l = i_3_ + (i_1_ << 16);
		if (i_0_ >= 98) {
			BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_1092.get(l));
			if (class14_sub2_sub9 == null) {
				class14_sub2_sub9 = (BufferedRequest) SFSS.aClass55_4112.get(l);
				if (class14_sub2_sub9 == null) {
					class14_sub2_sub9 = (BufferedRequest) SFSS.aClass55_3698.get(l);
					if (class14_sub2_sub9 != null) {
						if (bool) {
							class14_sub2_sub9.unlinkCacheable();
							SFSS.aClass55_1092.put(l, class14_sub2_sub9);
							SFSS.anInt998--;
							SFSS.anInt4612++;
						}
					} else {
						if (!bool) {
							class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_4227.get(l));
							if (class14_sub2_sub9 != null)
								return;
						}
						class14_sub2_sub9 = new BufferedRequest();
						class14_sub2_sub9.worker = class9_sub1;
						class14_sub2_sub9.padding = i;
						class14_sub2_sub9.blockPosition = i_2_;
						if (!bool) {
							SFSS.aClass81_4716.push(class14_sub2_sub9);
							SFSS.aClass55_3698.put(l, class14_sub2_sub9);
							SFSS.anInt998++;
						} else {
							SFSS.aClass55_1092.put(l, class14_sub2_sub9);
							SFSS.anInt4612++;
						}
					}
				}
			}
		}
	}

	public static void method2018(CacheFileWorker class9_sub1, int i, CacheFile cacheFile) {
		UpdateServerNode class14_sub19 = new UpdateServerNode();
		class14_sub19.key = i;
		class14_sub19.cache = cacheFile;
		class14_sub19.anInt3067 = 1;
		class14_sub19.worker = class9_sub1;
		Deque deque = SFSS.aClass2_4404;
		synchronized (deque) {
			SFSS.aClass2_4404.pushBack(class14_sub19);
		}
		SFSS.method696();
	}

	public static byte[] aByteArray5102 = new byte[520];

	public static void method1783(Class36 class36, boolean bool) {
		if (SFSS.aClass36_134 != null) {
			try {
				SFSS.aClass36_134.method1101((byte) 122);
			} catch (Exception exception) {
				/* empty */
			}
			SFSS.aClass36_134 = null;
		}
		SFSS.aClass36_134 = class36;
		SFSS.method449(bool, 4);
		SFSS.aClass14_Sub10_989 = null;
		SFSS.aClass14_Sub10_3036.position = 0;
		SFSS.aBufferedRequest_4354 = null;
		SFSS.anInt3769 = 0;
		for (;;) {
			BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_4112
					.getFirst());
			if (class14_sub2_sub9 == null)
				break;
			SFSS.aClass55_1092.put(class14_sub2_sub9.key, class14_sub2_sub9);
			SFSS.anInt3833--;
			SFSS.anInt4612++;
		}
		for (;;) {
			BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_4227
					.getFirst());
			if (class14_sub2_sub9 == null)
				break;
			SFSS.aClass81_4716.pushFront(class14_sub2_sub9);
			SFSS.aClass55_3698.put(class14_sub2_sub9.key, class14_sub2_sub9);
			SFSS.anInt998++;
			SFSS.anInt1355--;
		}
		if (SFSS.aByte4287 != 0) {
			try {
				Buffer class14_sub10 = new Buffer(4);
				class14_sub10.writeByte(4);
				class14_sub10.writeByte(SFSS.aByte4287);
				class14_sub10.method833((byte) 118, 0);
				SFSS.aClass36_134.method1100(0, 3, 4, class14_sub10.payload);
			} catch (IOException ioexception) {
				try {
					SFSS.aClass36_134.method1101((byte) 112);
				} catch (Exception exception) {
					/* empty */
				}
				SFSS.anInt829++;
				SFSS.aClass36_134 = null;
			}
		}
		SFSS.anInt853 = 0;
		SFSS.aLong2364 = TimeUtil.getTime();
	}

	public static boolean method1386() {
		long l = TimeUtil.getTime();
		int i_68_ = (int) (l + -SFSS.aLong2364);
		SFSS.aLong2364 = l;
		if (i_68_ > 200)
			i_68_ = 200;
		SFSS.anInt853 += i_68_;
		if (SFSS.anInt1355 == 0 && SFSS.anInt3833 == 0 && SFSS.anInt998 == 0
				&& SFSS.anInt4612 == 0) {
			boolean bool = true;
			return bool;
		}
		if (SFSS.aClass36_134 == null) {
			boolean bool = false;
			return bool;
		}
		do {
			int i_69_;
			try {
				if (SFSS.anInt853 > 30000)
					throw new IOException();
				while (SFSS.anInt3833 < 20) {
					if (SFSS.anInt4612 <= 0)
						break;
					BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_1092
							.getFirst());
					Buffer class14_sub10 = new Buffer(4);
					class14_sub10.writeByte(1);
					class14_sub10.method783(0 ^ 0xff, (int) class14_sub2_sub9.key);
					SFSS.aClass36_134.method1100(0, 3, 4, class14_sub10.payload);
					SFSS.aClass55_4112.put(class14_sub2_sub9.key, class14_sub2_sub9);
					SFSS.anInt3833++;
					SFSS.anInt4612--;
				}
				for (/**/; SFSS.anInt1355 < 20 && SFSS.anInt998 > 0; SFSS.anInt998--) {
					BufferedRequest class14_sub2_sub9 = (BufferedRequest) SFSS.aClass81_4716
							.peek();
					Buffer class14_sub10 = new Buffer(4);
					class14_sub10.writeByte(0);
					class14_sub10.method783(0 + 255, (int) class14_sub2_sub9.key);
					SFSS.aClass36_134.method1100(0, 3, 4, class14_sub10.payload);
					class14_sub2_sub9.unlinkCacheable();
					SFSS.aClass55_4227.put(class14_sub2_sub9.key, class14_sub2_sub9);
					SFSS.anInt1355++;
				}
				i_69_ = 0;
			} catch (IOException ioexception) {
				break;
			}
			for (/**/; i_69_ < 100; i_69_++) {
				boolean bool = false;
				int i_70_;
				try {
					i_70_ = SFSS.aClass36_134.method1104(24249);
				} catch (IOException ioexception) {
					break;
				}
				try {
					if (i_70_ < 0)
						throw new IOException();
				} catch (IOException ioexception) {
					break;
				}
				if (i_70_ == 0)
					break;
				int i_71_ = 0;
				SFSS.anInt853 = 0;
				if (SFSS.aBufferedRequest_4354 == null)
					i_71_ = 8;
				else if (SFSS.anInt3769 == 0)
					i_71_ = 1;
				if (i_71_ <= 0) {
					i_68_ = (-(SFSS.aBufferedRequest_4354.padding)
							+ SFSS.aClass14_Sub10_989.payload.length);
					int i_72_ = 512 - SFSS.anInt3769;
					if (i_72_ > -SFSS.aClass14_Sub10_989.position + i_68_)
						i_72_ = -SFSS.aClass14_Sub10_989.position + i_68_;
					if (i_70_ < i_72_)
						i_72_ = i_70_;
					try {
						SFSS.aClass36_134.method1099(i_72_, SFSS.aClass14_Sub10_989.payload, -1,
								SFSS.aClass14_Sub10_989.position);
					} catch (IOException ioexception) {
						break;
					}
					if (SFSS.aByte4287 != 0) {
						for (int i_73_ = 0; i_73_ < i_72_; i_73_++)
							SFSS.aClass14_Sub10_989.payload[SFSS.aClass14_Sub10_989.position
									+ i_73_] = (byte) (((SFSS.aClass14_Sub10_989.payload[(SFSS.aClass14_Sub10_989.position)
											+ i_73_]) ^ SFSS.aByte4287));
					}
					SFSS.aClass14_Sub10_989.position += i_72_;
					SFSS.anInt3769 += i_72_;
					if (SFSS.aClass14_Sub10_989.position != i_68_) {
						if (SFSS.anInt3769 != 512)
							break;
						SFSS.anInt3769 = 0;
					} else {
						if (16711935L != (SFSS.aBufferedRequest_4354.key)) {
							SFSS.aCRC32_2983.reset();
							SFSS.aCRC32_2983.update(SFSS.aClass14_Sub10_989.payload, 0, i_68_);
							int i_74_ = (int) SFSS.aCRC32_2983.getValue();
							if ((SFSS.aBufferedRequest_4354.blockPosition) != i_74_) {
								try {
									SFSS.aClass36_134.method1101((byte) -44);
								} catch (Exception exception) {
									/* empty */
								}
								SFSS.aClass36_134 = null;
								SFSS.anInt465++;
								SFSS.aByte4287 = (byte) (int) (Math.random() * 255.0 + 1.0);
								return false;
							}
							SFSS.anInt829 = 0;
							SFSS.anInt465 = 0;
							SFSS.aBufferedRequest_4354.worker.method183(
									(int) ((SFSS.aBufferedRequest_4354.key) & 0xffffL),
									SFSS.aClass14_Sub10_989.payload,
									16711680L == ((SFSS.aBufferedRequest_4354.key) & 0xff0000L),
									(byte) -128, SFSS.aBoolean1707);
						} else {
							SFSS.aClass14_Sub10_3796 = SFSS.aClass14_Sub10_989;
							for (int i_75_ = 0; i_75_ < 256; i_75_++) {
								CacheFileWorker class9_sub1 = SFSS.aCacheFileWorkerArray2253[i_75_];
								if (class9_sub1 != null) {
									SFSS.aClass14_Sub10_3796.position = i_75_ * 8 + 5;
									int i_76_ = SFSS.aClass14_Sub10_3796.getInt((byte) -110);
									int i_77_ = SFSS.aClass14_Sub10_3796.getInt((byte) -96);
									class9_sub1.method180(-6, i_77_, i_76_);
								}
							}
						}
						SFSS.aBufferedRequest_4354.unlink();
						SFSS.aClass14_Sub10_989 = null;
						SFSS.anInt3769 = 0;
						if (!SFSS.aBoolean1707)
							SFSS.anInt1355--;
						else
							SFSS.anInt3833--;
						SFSS.aBufferedRequest_4354 = null;
					}
				} else {
					i_68_ = i_71_ - SFSS.aClass14_Sub10_3036.position;
					if (i_70_ < i_68_)
						i_68_ = i_70_;
					try {
						SFSS.aClass36_134.method1099(i_68_, SFSS.aClass14_Sub10_3036.payload, -1,
								SFSS.aClass14_Sub10_3036.position);
					} catch (IOException ioexception) {
						break;
					}
					if (SFSS.aByte4287 != 0) {
						for (int i_78_ = 0; i_78_ < i_68_; i_78_++)
							SFSS.aClass14_Sub10_3036.payload[(SFSS.aClass14_Sub10_3036.position
									+ i_78_)] = (byte) (((SFSS.aClass14_Sub10_3036.payload[(SFSS.aClass14_Sub10_3036.position)
											+ i_78_]) ^ SFSS.aByte4287));
					}
					SFSS.aClass14_Sub10_3036.position += i_68_;
					if (SFSS.aClass14_Sub10_3036.position < i_71_)
						break;
					if (SFSS.aBufferedRequest_4354 == null) {
						SFSS.aClass14_Sub10_3036.position = 0;
						int i_79_ = SFSS.aClass14_Sub10_3036.readUByte();
						int i_80_ = SFSS.aClass14_Sub10_3036.readUShort();
						int i_81_ = SFSS.aClass14_Sub10_3036.readUByte();
						long l_82_ = (i_79_ << 16) + i_80_;
						int i_83_ = SFSS.aClass14_Sub10_3036.getInt((byte) -96);
						BufferedRequest class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_4112
								.get(l_82_));
						SFSS.aBoolean1707 = true;
						if (class14_sub2_sub9 == null) {
							class14_sub2_sub9 = ((BufferedRequest) SFSS.aClass55_4227.get(l_82_));
							SFSS.aBoolean1707 = false;
						}
						try {
							if (class14_sub2_sub9 == null)
								throw new IOException();
						} catch (IOException ioexception) {
							break;
						}
						SFSS.aBufferedRequest_4354 = class14_sub2_sub9;
						int i_84_ = i_81_ == 0 ? 5 : 9;
						SFSS.aClass14_Sub10_989 = new Buffer(
								(SFSS.aBufferedRequest_4354.padding) + i_83_ + i_84_);
						SFSS.aClass14_Sub10_989.writeByte(i_81_);
						SFSS.aClass14_Sub10_989.writeInt(i_83_, 0 + 74);
						SFSS.aClass14_Sub10_3036.position = 0;
						SFSS.anInt3769 = 8;
					} else if (SFSS.anInt3769 == 0) {
						if (SFSS.aClass14_Sub10_3036.payload[0] != -1)
							SFSS.aBufferedRequest_4354 = null;
						else {
							SFSS.anInt3769 = 1;
							SFSS.aClass14_Sub10_3036.position = 0;
						}
					}
				}
			}
			return true;
		} while (false);
		Throwable throwable = new Throwable();
		try {
			SFSS.aClass36_134.method1101((byte) 127);
		} catch (Exception exception) {
			/* empty */
		}
		SFSS.anInt829++;
		SFSS.aClass36_134 = null;
		return false;
	}

	public static HashTable aClass55_3698 = new HashTable(4096);
	public static Queue aClass81_4716 = new Queue();

	public static void method696() {
		Object object = SFSS.anObject4417;
		synchronized (object) {
			if (SFSS.anInt2223 == 0)
				ErrorReporting.signlink.method1143(5, new UpdateServerThread(), 0);
			SFSS.anInt2223 = 600;
		}
	}

	public static void method648(byte i) {
		int i_11_ = 52 % ((-23 - i) / 47);
		for (;;) {
			Deque deque = SFSS.aClass2_4404;
			UpdateServerNode class14_sub19;
			synchronized (deque) {
				class14_sub19 = (UpdateServerNode) SFSS.aClass2_99.popFront();
			}
			if (class14_sub19 == null)
				break;
			class14_sub19.worker.method182(class14_sub19.cache, (int) class14_sub19.key,
					class14_sub19.data, false, (byte) 55);
		}
	}

	public static Deque aClass2_4404 = new Deque();
	public static BufferedRequest aBufferedRequest_4354;
	public static Buffer aClass14_Sub10_989;
	public static Buffer aClass14_Sub10_3796;
	public static CacheFileWorker[] aCacheFileWorkerArray2253 = new CacheFileWorker[256];

	public static void method669() {
		synchronized (SFSS.anObject4417) {
			if (SFSS.anInt2223 != 0)
				SFSS.anInt2223 = 1;
			try {
				SFSS.anObject4417.wait();
			} catch (InterruptedException interruptedexception) {
				/* empty */
			}
		}
	}

	public static int anInt2223 = 0;
	public static boolean aBoolean1707;
	public static long aLong2364;
	public static HashTable aClass55_4112;
	public static HashTable aClass55_4227 = new HashTable(4096);
	public static CRC32 aCRC32_2983 = new CRC32();
	public static Buffer aClass14_Sub10_3036 = new Buffer(8);
	public static int anInt3769 = 0;
	public static int anInt3833 = 0;
	public static int anInt829 = 0;
	public static int anInt998 = 0;

	public static int method917(boolean bool, boolean bool_1_, byte i) {
		int i_2_ = 0;
		if (i != 96) {
			int i_3_ = 45;
			return i_3_;
		}
		if (bool_1_)
			i_2_ += SFSS.anInt4612 + anInt3833;
		if (bool)
			i_2_ += anInt998 + SFSS.anInt1355;
		int i_4_ = i_2_;
		return i_4_;
	}

	public static int anInt465 = 0;
	public static HashTable aClass55_1092 = new HashTable(4096);
	public static int anInt4612 = 0;
	public static int anInt1355 = 0;
	public static byte aByte4287 = 0;
	public static int anInt853 = 0;
	public static Object anObject4417 = new Object();
	public static Deque aClass2_99 = new Deque();
	public static Class36 aClass36_134;

	public static void method449(boolean bool, int i) {
		if (aClass36_134 != null) {
			try {
				Buffer class14_sub10 = new Buffer(4);
				class14_sub10.writeByte(!bool ? 3 : 2);
				class14_sub10.method783(255, 0);
				aClass36_134.method1100(0, 3, i, class14_sub10.payload);
			} catch (IOException ioexception) {
				try {
					aClass36_134.method1101((byte) 127);
				} catch (Exception exception) {
					/* empty */
				}
				aClass36_134 = null;
				anInt829++;
			}
		}
	}

	public static void method866(boolean bool) {
		if (bool && aClass36_134 != null)
			aClass36_134.method1101((byte) 110);
	}

}
