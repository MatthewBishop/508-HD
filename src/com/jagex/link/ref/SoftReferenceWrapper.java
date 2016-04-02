/* Class14_Sub2_Sub18_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link.ref;

import java.lang.ref.SoftReference;

public class SoftReferenceWrapper extends ReferenceWrapper {
	public SoftReference reference;

	public Object getReference() {
		return reference.get();
	}

	public boolean isSoft() {
		return true;
	}

	public SoftReferenceWrapper(Object object) {
		reference = new SoftReference(object);
	}
}
