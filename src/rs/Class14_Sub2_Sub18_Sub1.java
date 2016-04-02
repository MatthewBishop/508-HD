/* Class14_Sub2_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import java.lang.ref.SoftReference;

public class Class14_Sub2_Sub18_Sub1 extends Class14_Sub2_Sub18 {
	public SoftReference aSoftReference5071;

	public Object method377(boolean bool) {
		if (!bool)
			aSoftReference5071 = null;
		Object object = aSoftReference5071.get();
		return object;
	}

	public boolean method379(byte i) {
		if (i >= -68)
			aSoftReference5071 = null;
		boolean bool = true;
		return bool;
	}

	public Class14_Sub2_Sub18_Sub1(Object object) {
		aSoftReference5071 = new SoftReference(object);
	}
}
