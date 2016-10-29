/* Class14_Sub8 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.image.transform;

import com.jagex.image.transform.util.MonoChromaticImageCache;
import com.jagex.image.transform.util.TriChromaticImageCache;
import com.jagex.io.Buffer;
import com.jagex.link.Linkable;

public abstract class Class14_Sub8 extends Linkable {

	public boolean monoChromatic;

	public Class14_Sub8[] samplers;

	public MonoChromaticImageCache monoChromaticImageCache;

	public TriChromaticImageCache triChromaticImageCache;

	public int cacheSize;

	public Class14_Sub8(int i, boolean bool) {
		samplers = new Class14_Sub8[i];
		monoChromatic = bool;
	}

	//TriChromaticImageCache triChromaticImageCache; 
	//   AbstractTextureSampler[] samplers; 
	//int cacheSize; 
	//16   MonoChromaticImageCache monoChromaticImageCache; 

	
	public void postDecode() {
	}

	public void method473(int i, int i_18_) {
		int i_20_ = cacheSize != 255 ? cacheSize : i;
		if (monoChromatic)
			monoChromaticImageCache = new MonoChromaticImageCache(i_20_, i, i_18_);
		else
			triChromaticImageCache = new TriChromaticImageCache(i_20_, i, i_18_);
	}

	public int[][] outputColour(int i) {
		throw new IllegalStateException("This operation does not have a colour output");
	}

	public void decode(int i, Buffer class14_sub10) {
	}

	public int method477() {
		return -1;
	}

	public void method478() {
		if (monoChromatic) {
			monoChromaticImageCache.method2015();
			monoChromaticImageCache = null;
		} else {
			triChromaticImageCache.method1483();
			triChromaticImageCache = null;
		}
	}

	public int method479() {
		return -1;
	}

	public int[][] method480(int i_25_, int i_26_) {
		if (samplers[i_25_].monoChromatic) {
			int[] is = samplers[i_25_].outputMonochrome(i_26_);
			int[][] is_27_ = new int[3][];
			is_27_[2] = is;
			is_27_[1] = is;
			is_27_[0] = is;
			return is_27_;
		}
		return samplers[i_25_].outputColour(i_26_);
	}

	public int[] method483(int i, int i_30_) {
		if (samplers[i].monoChromatic) {
			return samplers[i].outputMonochrome(i_30_);
		}
		return samplers[i].outputColour(i_30_)[0];
	}

	public int[] outputMonochrome(int i) {
		throw new IllegalStateException("This operation does not have a monochrome output");
	}
}
