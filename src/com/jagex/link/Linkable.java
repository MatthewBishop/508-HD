/* Linkable - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

public class Linkable {
	public Linkable previous;
	public Linkable next;
	public long key;

	public boolean previousNotNull(byte i) {
		if (previous == null)
			return false;
		return true;
	}

	public void unlink() {
		if (previous != null) {
			previous.next = next;
			next.previous = previous;
			next = null;
			previous = null;
		}
	}
}
