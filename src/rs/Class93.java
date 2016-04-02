/* Class93 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.io.Buffer;

public class Class93 {
	public int anInt1441;
	public int[] anIntArray1442;
	public int anInt1443 = 2;
	public int anInt1444;
	public int[] anIntArray1445;
	public int anInt1446;
	public int anInt1447;
	public int anInt1448;
	public int anInt1449;
	public int anInt1450;
	public int anInt1451;

	public void method1464() {
		anInt1450 = 0;
		anInt1447 = 0;
		anInt1451 = 0;
		anInt1448 = 0;
		anInt1449 = 0;
	}

	public int method1465(int i) {
		if (anInt1449 >= anInt1450) {
			anInt1448 = anIntArray1445[anInt1447++] << 15;
			if (anInt1447 >= anInt1443)
				anInt1447 = anInt1443 - 1;
			anInt1450 = (int) ((double) anIntArray1442[anInt1447] / 65536.0 * (double) i);
			if (anInt1450 > anInt1449)
				anInt1451 = (((anIntArray1445[anInt1447] << 15) - anInt1448) / (anInt1450 - anInt1449));
		}
		anInt1448 += anInt1451;
		anInt1449++;
		return anInt1448 - anInt1451 >> 15;
	}

	public void method1466(Buffer class14_sub10) {
		anInt1443 = class14_sub10.method798();
		anIntArray1442 = new int[anInt1443];
		anIntArray1445 = new int[anInt1443];
		for (int i = 0; i < anInt1443; i++) {
			anIntArray1442[i] = class14_sub10.method784((byte) 112);
			anIntArray1445[i] = class14_sub10.method784((byte) 110);
		}
	}

	public void method1467(Buffer class14_sub10) {
		anInt1441 = class14_sub10.method798();
		anInt1444 = class14_sub10.method812((byte) -98);
		anInt1446 = class14_sub10.method812((byte) -90);
		method1466(class14_sub10);
	}

	public Class93() {
		anIntArray1442 = new int[2];
		anIntArray1445 = new int[2];
		anIntArray1442[0] = 0;
		anIntArray1442[1] = 65535;
		anIntArray1445[0] = 0;
		anIntArray1445[1] = 65535;
	}
}
