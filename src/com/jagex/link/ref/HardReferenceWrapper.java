/* Class14_Sub2_Sub18_Sub2 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link.ref;

public class HardReferenceWrapper extends ReferenceWrapper {
	public Object reference;

	public HardReferenceWrapper(Object object) {
		reference = object;
	}

	public Object getReference() {
		return reference;
	}

	public boolean isSoft() {
		return false;
	}
}
