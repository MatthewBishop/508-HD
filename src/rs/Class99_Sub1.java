/* Class99_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

public class Class99_Sub1 extends Class99 {
	public long aLong3333 = System.nanoTime();

	public void method1504(byte i) {
		if (i <= -54)
			aLong3333 = System.nanoTime();
	}

	public int method1501(int i, int i_0_, int i_1_) {
		long l = aLong3333 - System.nanoTime();
		if (i_0_ != -1) {
			int i_2_ = 98;
			return i_2_;
		}
		long l_3_ = (long) i * 1000000L;
		if (l_3_ > l)
			l = l_3_;
		Class14_Sub13.method864(l / 1000000L, (byte) 64);
		long l_4_ = System.nanoTime();
		int i_5_;
		for (i_5_ = 0; i_5_ < 10 && (i_5_ < 1 || aLong3333 < l_4_); aLong3333 += (long) i_1_ * 1000000L)
			i_5_++;
		if (aLong3333 < l_4_)
			aLong3333 = l_4_;
		int i_6_ = i_5_;
		return i_6_;
	}
}
