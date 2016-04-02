/* Class39_Sub1 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link.ref;

public class SoftReferenceFactory extends ReferenceFactory {
	public ReferenceWrapper wrapReference(ReferenceWrapper ref) {
		return new SoftReferenceWrapper(ref.getReference());
	}
	
}
