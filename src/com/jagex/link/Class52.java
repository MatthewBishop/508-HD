/* Class52 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package com.jagex.link;

import rs.Class14_Sub2_Sub18;
import rs.Class14_Sub2_Sub18_Sub2;
import rs.tex.Class14_Sub8_Sub3;
import rs.tex.Static;

public class Class52 {
	public HashTable table;

	public Queue history = new Queue();

	public int capacity;

	public int unused;

	public Class52(int i) {
		unused = i;
		capacity = i;
		int i_13_;
		for (i_13_ = 1; i_13_ + i_13_ < i; i_13_ += i_13_) {
			/* empty */
		}
		table = new HashTable(i_13_);
	}

	public void clear() {
		history.method1395((byte) 7);
		table.clear();
		unused = capacity;
	}

	public void method1204(long l) {
		Class14_Sub2_Sub18 class14_sub2_sub18 = (Class14_Sub2_Sub18) table.get(l);
		if (class14_sub2_sub18 != null) {
			class14_sub2_sub18.unlink();
			class14_sub2_sub18.unlinkCacheable();
			unused++;
		}
	}

	public void method1205(Object object, long l) {
		method1204(l);
		if (unused == 0) {
			Class14_Sub2_Sub18 class14_sub2_sub18 = (Class14_Sub2_Sub18) history.pop(-3);
			class14_sub2_sub18.unlink();
			class14_sub2_sub18.unlinkCacheable();
		} else
			unused--;
		Class14_Sub2_Sub18_Sub2 class14_sub2_sub18_sub2 = new Class14_Sub2_Sub18_Sub2(object);
		table.put(l, class14_sub2_sub18_sub2);
		history.push(false, class14_sub2_sub18_sub2);
		class14_sub2_sub18_sub2.keyCacheable = 0L;
	}

	public void method1208(byte ia, int i_8_) {
		if (Class14_Sub8_Sub3.aClass39_4137 != null) {
			for (Class14_Sub2_Sub18 class14_sub2_sub18 = (Class14_Sub2_Sub18) history.method1400(
					(byte) 19); class14_sub2_sub18 != null; class14_sub2_sub18 = ((Class14_Sub2_Sub18) history
							.method1402(-112 ^ 0x6de2))) {
				if (!class14_sub2_sub18.method379((byte) -82)) {
					if ((long) i_8_ < ++class14_sub2_sub18.keyCacheable) {
						Class14_Sub2_Sub18 class14_sub2_sub18_9_ = Class14_Sub8_Sub3.aClass39_4137
								.method1123(class14_sub2_sub18, -112 + 198);
						table.put(class14_sub2_sub18.key, class14_sub2_sub18_9_);
						Cacheable.method301(class14_sub2_sub18, class14_sub2_sub18_9_);
						class14_sub2_sub18.unlink();
						class14_sub2_sub18.unlinkCacheable();
					}
				} else if (class14_sub2_sub18.method377(true) == null) {
					class14_sub2_sub18.unlink();
					class14_sub2_sub18.unlinkCacheable();
					unused++;
				}
			}
		}
	}

	public void method1209(byte i) {
		Class14_Sub2_Sub18 class14_sub2_sub18 = (Class14_Sub2_Sub18) history.method1400((byte) 66);
		if (i != -96)
			Static.method1206((byte) 85);
		for (/**/; class14_sub2_sub18 != null; class14_sub2_sub18 = (Class14_Sub2_Sub18) history
				.method1402(-28046)) {
			if (class14_sub2_sub18.method379((byte) -72)) {
				class14_sub2_sub18.unlink();
				class14_sub2_sub18.unlinkCacheable();
				unused++;
			}
		}
	}

	public Object method1210(byte i, long l) {
		Class14_Sub2_Sub18 class14_sub2_sub18 = (Class14_Sub2_Sub18) table.get(l);
		if (i < 56) {
			Object object = null;
			return object;
		}
		if (class14_sub2_sub18 == null) {
			Object object = null;
			return object;
		}
		Object object = class14_sub2_sub18.method377(true);
		if (object == null) {
			class14_sub2_sub18.unlink();
			class14_sub2_sub18.unlinkCacheable();
			unused++;
			Object object_10_ = null;
			return object_10_;
		}
		if (!class14_sub2_sub18.method379((byte) -126)) {
			history.push(false, class14_sub2_sub18);
			class14_sub2_sub18.keyCacheable = 0L;
		} else {
			Class14_Sub2_Sub18_Sub2 class14_sub2_sub18_sub2 = new Class14_Sub2_Sub18_Sub2(object);
			table.put(class14_sub2_sub18.key, class14_sub2_sub18_sub2);
			history.push(false, class14_sub2_sub18_sub2);
			class14_sub2_sub18_sub2.keyCacheable = 0L;
			class14_sub2_sub18.unlink();
			class14_sub2_sub18.unlinkCacheable();
		}
		Object object_11_ = object;
		return object_11_;
	}
}
