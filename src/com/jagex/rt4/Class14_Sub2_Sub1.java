/* Class14_Sub2_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.rt4;

import java.nio.ByteBuffer;

import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;

import rs.Class107;
import rs.Class120;
import rs.Class66;
import rs.Class9;
import rs.Interface3;
import rs.JunkTex;
import rs.Static2;

public class Class14_Sub2_Sub1 extends Cacheable {
	public boolean aBoolean3726;
	public boolean aBoolean3730;
	public boolean aBoolean3738;
	public boolean aBoolean3743;
	public boolean aBoolean3746 = false;
	public Class107 aClass107_3742;
	public float aFloat3750;
	public int anInt3725;

	public int anInt3731;

	public int anInt3735;

	public int anInt3744;

	public int anInt3751;

	public int anInt3752;

	public int anInt3753;

	public int[] anIntArray3745;

	public Class14_Sub2_Sub1(Buffer class14_sub10) {
		anInt3744 = -1;
		anInt3753 = 0;
		aClass107_3742 = new Class107(class14_sub10);
		aBoolean3730 = class14_sub10.readUByte() == 1;
		aBoolean3738 = class14_sub10.readUByte() == 1;
		aBoolean3743 = class14_sub10.readUByte() == 1;
		aBoolean3726 = class14_sub10.readUByte() == 1;
		int i = class14_sub10.readUByte() & 0x3;
		anInt3735 = class14_sub10.method780((byte) -77);
		anInt3751 = class14_sub10.method780((byte) -77);
		int i_53_ = class14_sub10.readUByte();
		class14_sub10.readUByte();
		if (i == 1)
			anInt3725 = 2;
		else if (i != 2) {
			if (i != 3)
				anInt3725 = 0;
			else
				anInt3725 = 4;
		} else
			anInt3725 = 3;
		anInt3752 = i_53_ >> 4 & 0xf;
	}

	public void finalize() throws Throwable {
		if (anInt3744 != -1) {
			Class11.method202(anInt3744, anInt3753, anInt3731);
			anInt3753 = 0;
			anInt3744 = -1;
		}
		super.finalize();
	}

	public boolean method252(Interface3 interface3, boolean bool, int i, Class9 class9) {
		if (!aClass107_3742.method1548(interface3, -122, class9)) {
			boolean bool_5_ = false;
			return bool_5_;
		}
		GL gl = RT4GL.gl;
		int i_6_ = bool ? 64 : 128;
		int i_7_ = RT4.method1111(0);
		if ((i_7_ & 0x1) == 0) {
			if (anInt3744 != -1)
				RT4GL.method1632(anInt3744);
			else {
				int[] is = new int[1];
				gl.glGenTextures(1, is, 0);
				anInt3731 = Class11.anInt267;
				anInt3744 = is[0];
				RT4GL.method1632(anInt3744);
				ByteBuffer bytebuffer = ByteBuffer
						.wrap(aClass107_3742.method1555(i_6_, interface3, 0.7, aBoolean3738, i_6_, (byte) -94, class9));
				if (anInt3752 != 2) {
					if (anInt3752 != 1) {
						gl.glTexImage2D(3553, 0, 6408, i_6_, i_6_, 0, 6408, 5121, bytebuffer);
						gl.glTexParameteri(3553, 10241, 9729);
						gl.glTexParameteri(3553, 10240, 9729);
						Class11.textureMemory += bytebuffer.limit() - anInt3753;
						anInt3753 = bytebuffer.limit();
					} else {
						int i_8_ = 0;
						for (;;) {
							gl.glTexImage2D(3553, i_8_++, 6408, i_6_, i_6_, 0, 6408, 5121, bytebuffer);
							i_6_ >>= 1;
							if (i_6_ == 0)
								break;
							bytebuffer = ByteBuffer.wrap(aClass107_3742.method1555(i_6_, interface3, 0.7, aBoolean3738,
									i_6_, (byte) -84, class9));
						}
						gl.glTexParameteri(3553, 10241, 9987);
						gl.glTexParameteri(3553, 10240, 9729);
						Class11.textureMemory += bytebuffer.limit() * 4 / 3 - anInt3753;
						anInt3753 = bytebuffer.limit() * 4 / 3;
					}
				} else {
					GLU glu = new GLU();
					glu.gluBuild2DMipmaps(3553, 6408, i_6_, i_6_, 6408, 5121, bytebuffer);
					gl.glTexParameteri(3553, 10241, 9987);
					gl.glTexParameteri(3553, 10240, 9729);
					Class11.textureMemory += bytebuffer.limit() * 4 / 3 - anInt3753;
					anInt3753 = bytebuffer.limit() * 4 / 3;
				}
				gl.glTexParameteri(3553, 10242, !aBoolean3743 ? 33071 : 10497);
				gl.glTexParameteri(3553, 10243, aBoolean3726 ? 10497 : 33071);
			}
		}
		if ((i_7_ & 0x2) == 0)
			RT4GL.method1638(anInt3725);
		if (i <= 99)
			Static2.method258(12);
		if ((i_7_ & 0x4) == 0)
			RT4GL.method1656(0);
		if ((i_7_ & 0x8) == 0) {
			if (anInt3751 == 0 && anInt3735 == 0)
				RT4GL.method1651();
			else {
				float f = (float) (anInt3751 * RT4GL.anInt2045) / (float) i_6_;
				float f_9_ = (float) (anInt3735 * RT4GL.anInt2045) / (float) i_6_;
				RT4GL.method1641(f_9_, f, 0.0F);
			}
		}
		boolean bool_10_ = true;
		return bool_10_;
	}

	public void method253(int i, boolean bool) {
		if (anIntArray3745 != null) {
			if (bool)
				Static2.aClass124_3747 = null;
			if (anInt3751 != 0 || anInt3735 != 0) {
				if (Class120.anIntArray2002 == null || anIntArray3745.length > Class120.anIntArray2002.length)
					Class120.anIntArray2002 = new int[anIntArray3745.length];
				int i_11_ = 4096 != anIntArray3745.length ? 128 : 64;
				int i_12_ = anIntArray3745.length;
				int i_13_ = i_11_ - 1;
				int i_14_ = anInt3735 * i;
				int i_15_ = i_11_ * i * anInt3751;
				int i_16_ = i_12_ - 1;
				for (int i_17_ = 0; i_12_ > i_17_; i_17_ += i_11_) {
					int i_18_ = i_16_ & i_15_ + i_17_;
					for (int i_19_ = 0; i_19_ < i_11_; i_19_++) {
						int i_20_ = i_17_ + i_19_;
						int i_21_ = i_18_ + (i_13_ & i_14_ + i_19_);
						Class120.anIntArray2002[i_20_] = anIntArray3745[i_21_];
					}
				}
				int[] is = anIntArray3745;
				anIntArray3745 = Class120.anIntArray2002;
				Class120.anIntArray2002 = is;
			}
		}
	}

	public boolean method254(Class9 class9, int i, Interface3 interface3) {
		if (i != 255)
			method254(null, -71, null);
		boolean bool = aClass107_3742.method1548(interface3, -120, class9);
		return bool;
	}

	public int[] method255(Interface3 interface3, float f, int i, Class9 class9, boolean bool) {
		if (anIntArray3745 == null || f != aFloat3750) {
			if (!aClass107_3742.method1548(interface3, -119, class9)) {
				int[] is = null;
				return is;
			}
			int i_22_ = !bool ? 128 : 64;
			anIntArray3745 = aClass107_3742.method1553(i_22_, true, 0, aBoolean3738, class9, (double) f, i_22_,
					interface3);
			aFloat3750 = f;
			if (aBoolean3730) {
				int[] is = new int[i_22_];
				int[] is_23_ = new int[i_22_];
				int[] is_24_ = new int[i_22_];
				int[] is_25_ = new int[i_22_ * i_22_];
				int i_26_ = i_22_;
				int i_27_ = i_22_;
				int i_29_;
				int i_28_ = i_29_ = i_27_ * 1;
				int i_30_ = i_27_ - 1;
				int i_31_ = i_27_ * i_26_;
				int i_32_ = i_26_ - 1;
				for (int i_33_ = 2; i_33_ >= 0; i_33_--) {
					for (int i_34_ = i_30_; i_34_ >= 0; i_34_--) {
						int i_35_ = anIntArray3745[--i_29_];
						is[i_34_] += (JunkTex.method617(i_35_, 16770996) >> 16);
						is_23_[i_34_] += (JunkTex.method617(i_35_, 65357) >> 40);
						is_24_[i_34_] += JunkTex.method617(i_35_, 255);
					}
					if (i_29_ == 0)
						i_29_ = i_31_;
				}
				int i_36_ = i_31_;
				for (int i_37_ = i_32_; i_37_ >= 0; i_37_--) {
					int i_38_ = 1;
					int i_40_;
					int i_41_;
					int i_39_ = i_40_ = i_41_ = 0;
					for (int i_42_ = 2; i_42_ >= 0; i_42_--) {
						i_38_--;
						i_39_ += is[i_38_];
						i_41_ += is_23_[i_38_];
						i_40_ += is_24_[i_38_];
						if (i_38_ == 0)
							i_38_ = i_27_;
					}
					int i_43_ = 1;
					for (int i_44_ = i_30_; i_44_ >= 0; i_44_--) {
						i_38_--;
						i_43_--;
						int i_45_ = i_41_ / 9;
						int i_46_ = i_39_ / 9;
						int i_47_ = i_40_ / 9;
						is_25_[--i_36_] = Class66.method1294(i_47_, Class66.method1294((i_46_ << 16), (i_45_ << 40)));
						i_39_ += -is[i_43_] + is[i_38_];
						i_40_ += -is_24_[i_43_] + is_24_[i_38_];
						i_41_ += -is_23_[i_43_] + is_23_[i_38_];
						if (i_38_ == 0)
							i_38_ = i_27_;
						if (i_43_ == 0)
							i_43_ = i_27_;
					}
					for (int i_48_ = i_30_; i_48_ >= 0; i_48_--) {
						int i_49_ = anIntArray3745[--i_28_];
						int i_50_ = anIntArray3745[--i_29_];
						is[i_48_] += (-JunkTex.method617(i_49_ >> 48, 255)
								+ JunkTex.method617(i_50_ >> 16, 255));
						is_23_[i_48_] += (-JunkTex.method617(i_49_ >> 40, 255)
								+ JunkTex.method617(255, i_50_ >> 8));
						is_24_[i_48_] += (JunkTex.method617(255, i_50_)
								- JunkTex.method617(255, i_49_));
					}
					if (i_29_ == 0)
						i_29_ = i_31_;
					if (i_28_ == 0)
						i_28_ = i_31_;
				}
				anIntArray3745 = is_25_;
			}
		}
		if (i != -1)
			return null;
		int[] is = anIntArray3745;
		return is;
	}

	public int[] method257(boolean bool, Class9 class9, boolean bool_52_, Interface3 interface3) {
		if (!aClass107_3742.method1548(interface3, -120, class9)) {
			int[] is = null;
			return is;
		}
		int i = bool_52_ ? 64 : 128;
		if (bool)
			method253(-104, true);
		int[] is = aClass107_3742.method1553(i, false, 0, aBoolean3738, class9, 1.0, i, interface3);
		return is;
	}
}
