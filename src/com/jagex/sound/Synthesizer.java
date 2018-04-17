/* Class105 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.sound;

import java.util.Random;

import com.jagex.io.Buffer;
import com.jagex.util.ArrayUtils;

public class Synthesizer {
	public static int[] SINE;
	public static int[] samples;
	public static int[] NOISE = new int[32768];
	public static int[] pitchBaseSteps;
	public static int[] volumeSteps;
	public static int[] delays;
	public static int[] pitchSteps;
	public static int[] phases;
	static {
		Random random = new Random(0L);
		for (int i = 0; i < 32768; i++)
			NOISE[i] = (random.nextInt() & 0x2) - 1;
		SINE = new int[32768];
		for (int i = 0; i < 32768; i++)
			SINE[i] = (int) (Math.sin((double) i / 5215.1903) * 16384.0);
		samples = new int[220500];
		pitchBaseSteps = new int[5];
		delays = new int[5];
		volumeSteps = new int[5];
		phases = new int[5];
		pitchSteps = new int[5];
	}
	public static void dispose() {
		samples = null;
		NOISE = null;
		SINE = null;
		phases = null;
		delays = null;
		volumeSteps = null;
		pitchSteps = null;
		pitchBaseSteps = null;
	}
	public Filter filter;
	public Envelope pitchModifierAmplitude;
	public Envelope pitch;
	public Envelope volumeMultiplier;
	public Envelope pitchModifier;
	public Envelope release;
	public Envelope volumeMultiplierAmplitude;
	public Envelope volume;
	public Envelope attack;
	public Envelope filterEnvelope;
	public int delayDecay;
	public int duration;
	public int delayTime = 0;
	public int offset;
	public int[] oscillatorVolume;

	public int[] anIntArray1760 = new int[5];

	public int[] anIntArray1764;

	public Synthesizer() {
		delayDecay = 100;
		oscillatorVolume = new int[5];
		anIntArray1764 = new int[5];
		offset = 0;
		duration = 500;
	}

	public int[] synthesize(int sampleCount, int duration) {
		ArrayUtils.fillArray(samples, 0, sampleCount);
		if (duration < 10)
			return samples;
		double d = (double) sampleCount / ((double) duration + 0.0);
		pitch.reset();
		volume.reset();
		int i_1_ = 0;
		int i_2_ = 0;
		int i_3_ = 0;
		if (pitchModifier != null) {
			pitchModifier.reset();
			pitchModifierAmplitude.reset();
			i_1_ = (int) ((double) (pitchModifier.end - pitchModifier.start) * 32.768 / d);
			i_2_ = (int) ((double) pitchModifier.start * 32.768 / d);
		}
		int i_4_ = 0;
		int i_5_ = 0;
		int i_6_ = 0;
		if (volumeMultiplier != null) {
			volumeMultiplier.reset();
			volumeMultiplierAmplitude.reset();
			i_4_ = (int) ((double) (volumeMultiplier.end - volumeMultiplier.start) * 32.768 / d);
			i_5_ = (int) ((double) volumeMultiplier.start * 32.768 / d);
		}
		for (int i_7_ = 0; i_7_ < 5; i_7_++) {
			if (oscillatorVolume[i_7_] != 0) {
				phases[i_7_] = 0;
				delays[i_7_] = (int) ((double) anIntArray1764[i_7_] * d);
				volumeSteps[i_7_] = (oscillatorVolume[i_7_] << 14) / 100;
				pitchSteps[i_7_] = (int) ((double) (pitch.end - pitch.start) * 32.768
						* Math.pow(1.0057929410678534, (double) anIntArray1760[i_7_]) / d);
				pitchBaseSteps[i_7_] = (int) ((double) pitch.start * 32.768 / d);
			}
		}
		for (int i_8_ = 0; i_8_ < sampleCount; i_8_++) {
			int i_9_ = pitch.step(sampleCount);
			int i_10_ = volume.step(sampleCount);
			if (pitchModifier != null) {
				int i_11_ = pitchModifier.step(sampleCount);
				int i_12_ = pitchModifierAmplitude.step(sampleCount);
				i_9_ += evaluateWave(i_3_, i_12_, pitchModifier.form) >> 1;
				i_3_ += (i_11_ * i_1_ >> 16) + i_2_;
			}
			if (volumeMultiplier != null) {
				int i_13_ = volumeMultiplier.step(sampleCount);
				int i_14_ = volumeMultiplierAmplitude.step(sampleCount);
				i_10_ = i_10_ * ((evaluateWave(i_6_, i_14_, volumeMultiplier.form) >> 1) + 32768) >> 15;
				i_6_ += (i_13_ * i_4_ >> 16) + i_5_;
			}
			for (int i_15_ = 0; i_15_ < 5; i_15_++) {
				if (oscillatorVolume[i_15_] != 0) {
					int i_16_ = i_8_ + delays[i_15_];
					if (i_16_ < sampleCount) {
						samples[i_16_] += evaluateWave(phases[i_15_], i_10_ * volumeSteps[i_15_] >> 15,
								pitch.form);
						phases[i_15_] += ((i_9_ * pitchSteps[i_15_] >> 16) + pitchBaseSteps[i_15_]);
					}
				}
			}
		}
		if (release != null) {
			release.reset();
			attack.reset();
			int i_17_ = 0;
			boolean bool = false;
			boolean bool_18_ = true;
			for (int i_19_ = 0; i_19_ < sampleCount; i_19_++) {
				int i_20_ = release.step(sampleCount);
				int i_21_ = attack.step(sampleCount);
				int i_22_;
				if (bool_18_)
					i_22_ = (release.start
							+ ((release.end - release.start) * i_20_ >> 8));
				else
					i_22_ = (release.start
							+ ((release.end - release.start) * i_21_ >> 8));
				i_17_ += 256;
				if (i_17_ >= i_22_) {
					i_17_ = 0;
					bool_18_ = !bool_18_;
				}
				if (bool_18_)
					samples[i_19_] = 0;
			}
		}
		if (delayTime > 0 && delayDecay > 0) {
			int i_23_ = (int) ((double) delayTime * d);
			for (int i_24_ = i_23_; i_24_ < sampleCount; i_24_++)
				samples[i_24_] += samples[i_24_ - i_23_] * delayDecay / 100;
		}
		if (filter.pairs[0] > 0 || filter.pairs[1] > 0) {
			filterEnvelope.reset();
			int i_25_ = filterEnvelope.step(sampleCount + 1);
			int i_26_ = filter.compute(0, (float) i_25_ / 65536.0F);
			int i_27_ = filter.compute(1, (float) i_25_ / 65536.0F);
			if (sampleCount >= i_26_ + i_27_) {
				int i_28_ = 0;
				int i_29_ = i_27_;
				if (i_29_ > sampleCount - i_26_)
					i_29_ = sampleCount - i_26_;
				for (/**/; i_28_ < i_29_; i_28_++) {
					int i_30_ = (int) (((long) samples[i_28_ + i_26_] * (long) Filter.forwardMultiplier) >> 16);
					for (int i_31_ = 0; i_31_ < i_26_; i_31_++)
						i_30_ += (int) (((long) (samples[i_28_ + i_26_ - 1 - i_31_])
								* (long) (Filter.coefficients[0][i_31_])) >> 16);
					for (int i_32_ = 0; i_32_ < i_28_; i_32_++)
						i_30_ -= (int) (((long) samples[i_28_ - 1 - i_32_]
								* (long) (Filter.coefficients[1][i_32_])) >> 16);
					samples[i_28_] = i_30_;
					i_25_ = filterEnvelope.step(sampleCount + 1);
				}
				i_29_ = 128;
				for (;;) {
					if (i_29_ > sampleCount - i_26_)
						i_29_ = sampleCount - i_26_;
					for (/**/; i_28_ < i_29_; i_28_++) {
						int i_33_ = (int) (((long) samples[i_28_ + i_26_] * (long) Filter.forwardMultiplier) >> 16);
						for (int i_34_ = 0; i_34_ < i_26_; i_34_++)
							i_33_ += (int) (((long) (samples[i_28_ + i_26_ - 1 - i_34_])
									* (long) (Filter.coefficients[0][i_34_])) >> 16);
						for (int i_35_ = 0; i_35_ < i_27_; i_35_++)
							i_33_ -= (int) (((long) (samples[i_28_ - 1 - i_35_])
									* (long) (Filter.coefficients[1][i_35_])) >> 16);
						samples[i_28_] = i_33_;
						i_25_ = filterEnvelope.step(sampleCount + 1);
					}
					if (i_28_ >= sampleCount - i_26_)
						break;
					i_26_ = filter.compute(0, (float) i_25_ / 65536.0F);
					i_27_ = filter.compute(1, (float) i_25_ / 65536.0F);
					i_29_ += 128;
				}
				for (/**/; i_28_ < sampleCount; i_28_++) {
					int i_36_ = 0;
					for (int i_37_ = i_28_ + i_26_ - sampleCount; i_37_ < i_26_; i_37_++)
						i_36_ += (int) (((long) (samples[i_28_ + i_26_ - 1 - i_37_])
								* (long) (Filter.coefficients[0][i_37_])) >> 16);
					for (int i_38_ = 0; i_38_ < i_27_; i_38_++)
						i_36_ -= (int) (((long) samples[i_28_ - 1 - i_38_]
								* (long) (Filter.coefficients[1][i_38_])) >> 16);
					samples[i_28_] = i_36_;
					i_25_ = filterEnvelope.step(sampleCount + 1);
				}
			}
		}
		for (int i_39_ = 0; i_39_ < sampleCount; i_39_++) {
			if (samples[i_39_] < -32768)
				samples[i_39_] = -32768;
			if (samples[i_39_] > 32767)
				samples[i_39_] = 32767;
		}
		return samples;
	}

	public void decode(Buffer class14_sub10) {
		pitch = new Envelope();
		pitch.decode(class14_sub10);
		volume = new Envelope();
		volume.decode(class14_sub10);
		int i = class14_sub10.readUByte();
		if (i != 0) {
			class14_sub10.position--;
			pitchModifier = new Envelope();
			pitchModifier.decode(class14_sub10);
			pitchModifierAmplitude = new Envelope();
			pitchModifierAmplitude.decode(class14_sub10);
		}
		i = class14_sub10.readUByte();
		if (i != 0) {
			class14_sub10.position--;
			volumeMultiplier = new Envelope();
			volumeMultiplier.decode(class14_sub10);
			volumeMultiplierAmplitude = new Envelope();
			volumeMultiplierAmplitude.decode(class14_sub10);
		}
		i = class14_sub10.readUByte();
		if (i != 0) {
			class14_sub10.position--;
			release = new Envelope();
			release.decode(class14_sub10);
			attack = new Envelope();
			attack.decode(class14_sub10);
		}
		for (int i_40_ = 0; i_40_ < 10; i_40_++) {
			int i_41_ = class14_sub10.method818((byte) 42);
			if (i_41_ == 0)
				break;
			oscillatorVolume[i_40_] = i_41_;
			anIntArray1760[i_40_] = class14_sub10.readSmart();
			anIntArray1764[i_40_] = class14_sub10.method818((byte) -90);
		}
		delayTime = class14_sub10.method818((byte) -97);
		delayDecay = class14_sub10.method818((byte) 108);
		duration = class14_sub10.readUShort();
		offset = class14_sub10.readUShort();
		filter = new Filter();
		filterEnvelope = new Envelope();
		filter.decode(class14_sub10, filterEnvelope);
	}

	public int evaluateWave(int i, int i_42_, int i_43_) {
		if (i_43_ == 1) {
			if ((i & 0x7fff) < 16384)
				return i_42_;
			return -i_42_;
		}
		if (i_43_ == 2)
			return SINE[i & 0x7fff] * i_42_ >> 14;
		if (i_43_ == 3)
			return ((i & 0x7fff) * i_42_ >> 14) - i_42_;
		if (i_43_ == 4)
			return NOISE[i / 2607 & 0x7fff] * i_42_;
		return 0;
	}
}
