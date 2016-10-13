/* Class14_Sub2_Sub20 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;
import com.jagex.link.Cacheable;
import com.jagex.rt4.RT4GL;
import com.jagex.util.BrowserControlUtil;

public class Class14_Sub2_Sub20 extends Cacheable {
	public static Class102 aClass102_4055;
	public int anInt4062 = 0;
	public static int anInt4064;

	static {
		aClass102_4055 = new Class102();
		anInt4064 = 0;
	}

	public static void method428(int i) {
		RT4GL.method1630();
		BrowserControlUtil.hide();
		if (JunkTex.aFrame3962 != null)
			Class14_Sub2_Sub4.method278(JunkTex.aClass43_4647, JunkTex.aFrame3962, 120);
		JunkTex.aFrame3962 = null;
		JunkTex.method643(0, (byte) -92);
		Class14_Sub21.method897(121);
	}

	public void method429(int i, Buffer class14_sub10) {
		int i_7_ = -3 % ((i + 30) / 62);
		for (;;) {
			int i_8_ = class14_sub10.readUByte();
			if (i_8_ == 0)
				break;
			method431(class14_sub10, i_8_);
		}
	}

	public static void method430(boolean bool) {
		aClass102_4055 = null;
	}

	public void method431(Buffer class14_sub10, int i_9_) {
		if (i_9_ == 2)
			anInt4062 = class14_sub10.readUShort((byte) 119);
	}

	public static Class14_Sub2_Sub5 method432(int i, Class124 class124) {
		if (i <= 16) {
			Class14_Sub2_Sub5 class14_sub2_sub5 = null;
			return class14_sub2_sub5;
		}
		for (Class14_Sub2_Sub5 class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
				.getFront(); class14_sub2_sub5 != null; class14_sub2_sub5 = (Class14_Sub2_Sub5) Class97.aClass2_1647
						.getNext()) {
			if (class14_sub2_sub5.aClass124_3804.method1704(class124, (byte) 67))
				return class14_sub2_sub5;
		}
		return null;
	}
}
