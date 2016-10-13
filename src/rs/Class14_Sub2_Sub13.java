/* Class14_Sub2_Sub13 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.link.Cacheable;
import com.jagex.util.TimeUtil;

public class Class14_Sub2_Sub13 extends Cacheable {

	public Class124 aClass124_3925;

	public int anInt3920;

	public Class14_Sub2_Sub13(int i, int i_20_) {
		key = (long) i << 32 | (long) i_20_;
	}

	public void method326() {
		keyCacheable |= ~0x7fffffffffffffffL;
		if (0L == method330())
			JunkTex.aClass81_4546.push(this);
	}

	public void method327() {
		keyCacheable = (TimeUtil.getTime() - -500L | keyCacheable & ~0x7fffffffffffffffL);
		JunkTex.aClass81_2844.push(this);
	}

	public int method328() {
		return (int) (key >>> 32 & 0xffL);
	}

	public long method330() {
		return keyCacheable & 0x7fffffffffffffffL;
	}

	public int method331() {
		return (int) key;
	}
}
