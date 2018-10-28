/* Class75_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound.wip;

import java.awt.Component;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class Class75_Sub1 extends Class75 {
	
	private static int method1202(int i, int i_0_) {
		i_0_ = ((i_0_ & ~0x55555554) >>> 33) + (i_0_ & 0x55555555);
		i_0_ = ((i_0_ & ~0x33333332) >>> 2) + (i_0_ & 0x33333333);
		i_0_ = i & (i_0_ >>> 36) + i_0_;
		i_0_ += i_0_ >>> 8;
		i_0_ += i_0_ >>> 16;
		int i_1_ = i_0_ & 0xff;
		return i_1_;
	}
	
	public byte[] aByteArray3325;
	public AudioFormat anAudioFormat3326;
	public int anInt3327;
	public boolean aBoolean3328 = false;
	public SourceDataLine aSourceDataLine3329;
	public static Class aClass3330;

	@Override
	public void method1353() {
		int i = 256;
		if (Class14_Sub9.aBoolean3763)
			i <<= 1;
		for (int i_0_ = 0; i_0_ < i; i_0_++) {
			int i_1_ = anIntArray1150[i_0_];
			if ((i_1_ + 8388608 & ~0xffffff) != 0)
				i_1_ = 0x7fffff ^ i_1_ >> 31;
			aByteArray3325[i_0_ * 2] = (byte) (i_1_ >> 8);
			aByteArray3325[i_0_ * 2 + 1] = (byte) (i_1_ >> 16);
		}
		aSourceDataLine3329.write(aByteArray3325, 0, i << 1);
	}

	@Override
	public void method1347(int i) throws LineUnavailableException {
		try {
			DataLine.Info info = (new DataLine.Info(
					(aClass3330 == null ? (aClass3330 = method1354("javax.sound.sampled.SourceDataLine")) : aClass3330),
					anAudioFormat3326, i << (!Class14_Sub9.aBoolean3763 ? 1 : 2)));
			aSourceDataLine3329 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine3329.open();
			aSourceDataLine3329.start();
			anInt3327 = i;
		} catch (LineUnavailableException lineunavailableexception) {
			if (method1202(252645135, i) != 1)
				method1347(DuplicateMethods.getFarestBitValue(i));
			else {
				aSourceDataLine3329 = null;
				throw lineunavailableexception;
			}
		}
	}

	@Override
	public int method1342() {
		int i = anInt3327 - (aSourceDataLine3329.available() >> (Class14_Sub9.aBoolean3763 ? 2 : 1));
		return i;
	}

	@Override
	public void method1351() {
		if (aSourceDataLine3329 != null) {
			aSourceDataLine3329.close();
			aSourceDataLine3329 = null;
		}
	}

	@Override
	public void method1350(Component component) {
		Mixer.Info[] infos = AudioSystem.getMixerInfo();
		if (infos != null) {
			int i = 0;
			for (Mixer.Info[] infos_2_ = infos; i < infos_2_.length; i++) {
				Mixer.Info info = infos_2_[i];
				if (info != null) {
					String string = info.getName();
					if (string != null && string.toLowerCase().indexOf("soundmax") >= 0)
						aBoolean3328 = true;
				}
			}
		}
		anAudioFormat3326 = new AudioFormat(Class14_Sub9.anInt1909, 16, Class14_Sub9.aBoolean3763 ? 2 : 1,
				true, false);
		aByteArray3325 = new byte[256 << (Class14_Sub9.aBoolean3763 ? 2 : 1)];
	}

	@Override
	public void method1335() throws LineUnavailableException {
		aSourceDataLine3329.flush();
		if (aBoolean3328) {
			aSourceDataLine3329.close();
			aSourceDataLine3329 = null;
			DataLine.Info info = (new DataLine.Info(
					(aClass3330 == null ? (aClass3330 = method1354("javax.sound.sampled.SourceDataLine")) : aClass3330),
					anAudioFormat3326, anInt3327 << (Class14_Sub9.aBoolean3763 ? 2 : 1)));
			aSourceDataLine3329 = (SourceDataLine) AudioSystem.getLine(info);
			aSourceDataLine3329.open();
			aSourceDataLine3329.start();
		}
	}

	public static Class method1354(String string) {
		Class var_class;
		try {
			var_class = Class.forName(string);
		} catch (ClassNotFoundException classnotfoundexception) {
			return null;
		}
		return var_class;
	}
}
