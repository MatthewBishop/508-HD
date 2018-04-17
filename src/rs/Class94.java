/* Class94 - Decompiled by JODE
 * Visit http://jode.sourceforge.net/
 */
package rs;

import com.jagex.cache.anim.Animation;
import com.jagex.io.Buffer;
import com.jagex.rt4.Class148;
import com.jagex.rt4.Class148_Sub1;
import com.jagex.rt4.AbstractSprite;
import com.jagex.rt4.AbstractSprite_Sub1;
import com.jagex.rt4.AbstractSprite_Sub1_Sub1;
import com.jagex.rt4.AbstractSprite_Sub2;
import com.jagex.rt4.AbstractSprite_Sub2_Sub1;

public class Class94 {
	public int[] anIntArray1452;
	public int anInt1454;
	public boolean aBoolean1455;
	public Object[] anObjectArray1456;
	public Object[] anObjectArray1457;
	public Object[] anObjectArray1458;
	public int anInt1459;
	public int anInt1460 = 0;
	public Object[] anObjectArray1461;
	public boolean aBoolean1462;
	public Object[] anObjectArray1463;
	public int anInt1464;
	public int anInt1465;
	public int anInt1467 = 1;
	public Object[] anObjectArray1468;
	public static Class94 aClass94_1469;
	public int[] anIntArray1470;
	public boolean aBoolean1471;
	public boolean aBoolean1472;
	public Object[] anObjectArray1473;
	public int anInt1474;
	public Object[] anObjectArray1475;
	public int anInt1476;
	public int anInt1478;
	public Class124[] aClass124Array1479;
	public int anInt1481;
	public int anInt1482;
	public Class124 aClass124_1483;
	public Object[] anObjectArray1484;
	public int anInt1485;
	public Class94[] aClass94Array1486;
	public int anInt1487;
	public int anInt1488;
	public int anInt1489;
	public int anInt1490;
	public byte[] aByteArray1491;
	public Class94 aClass94_1492;
	public int anInt1493;
	public int anInt1494;
	public int anInt1495;
	public byte aByte1496;
	public boolean aBoolean1497;
	public int anInt1498;
	public Class124 aClass124_1499;
	public Object[] anObjectArray1500;
	public byte aByte1502;
	public boolean aBoolean1503;
	public Object[] anObjectArray1504;
	public int anInt1505;
	public int anInt1506;
	public boolean aBoolean1507;
	public Class124 aClass124_1508;
	public byte aByte1509;
	public int[] anIntArray1510;
	public boolean aBoolean1511;
	public int anInt1513;
	public int anInt1514;
	public int anInt1515;
	public int anInt1516;
	public Object[] anObjectArray1517;
	public int anInt1518;
	public Object[] anObjectArray1519;
	public boolean aBoolean1520;
	public int anInt1521;
	public int[] anIntArray1522;
	public int anInt1523;
	public Object[] anObjectArray1524;
	public int anInt1525;
	public Object[] anObjectArray1526;
	public int[] anIntArray1527;
	public short aShort1528;
	public Object[] anObjectArray1529;
	public int anInt1530;
	public int[] anIntArray1531;
	public int anInt1532;
	public int anInt1533;
	public int anInt1534;
	public Object[] anObjectArray1535;
	public byte aByte1536;
	public boolean aBoolean1537;
	public int anInt1538;
	public int[] anIntArray1539;
	public int anInt1540;
	public int[] anIntArray1542;
	public int anInt1543;
	public int anInt1544;
	public int anInt1545;
	public int[] anIntArray1546;
	public int anInt1547;
	public int anInt1548;
	public int anInt1549;
	public int anInt1550;
	public Class124 aClass124_1552;
	public int anInt1553;
	public static boolean aBoolean1554 = false;
	public Object[] anObjectArray1555;
	public Class124 aClass124_1556;
	public int[] anIntArray1557;
	public int[] anIntArray1559;
	public int[] anIntArray1560;
	public int anInt1561;
	public Object[] anObjectArray1562;
	public int anInt1563;
	public boolean aBoolean1564;
	public int anInt1565;
	public int[] anIntArray1566;
	public int anInt1567;
	public int anInt1568;
	public int anInt1570;
	public int anInt1571;
	public int anInt1572;
	public Class124[] aClass124Array1573;
	public int anInt1574;
	public boolean aBoolean1575;
	public Object[] anObjectArray1576;
	public boolean aBoolean1577;
	public int anInt1578;
	public int anInt1579;
	public int anInt1580;
	public Object[] anObjectArray1581;
	public int anInt1583;
	public boolean aBoolean1584;
	public Object[] anObjectArray1585;
	public int[][] anIntArrayArray1586;
	public int anInt1587;
	public int anInt1588;
	public Class124 aClass124_1589;
	public int anInt1590;
	public Object[] anObjectArray1591;
	public Object[] anObjectArray1592;
	public int anInt1593;
	public Object[] anObjectArray1594;
	public Object[] anObjectArray1596;
	public int anInt1597;
	public int anInt1598;
	public boolean aBoolean1599;
	public Object[] anObjectArray1600;
	public Object[] anObjectArray1601;
	public short aShort1602;
	public int anInt1603;
	public Object[] anObjectArray1604;
	public int anInt1605;
	public boolean aBoolean1606;
	public int anInt1607;
	public Object[] anObjectArray1608;
	public int anInt1609;
	public int anInt1610;
	public int anInt1611;
	public boolean aBoolean1612;
	public int anInt1613;
	public int[] anIntArray1614;

	public Class14_Sub2_Sub16 method1468(byte i, Class148[] class148s) {
		aBoolean1554 = false;
		if (anInt1588 == -1) {
			Class14_Sub2_Sub16 class14_sub2_sub16 = null;
			return class14_sub2_sub16;
		}
		Class14_Sub2_Sub16 class14_sub2_sub16 = ((Class14_Sub2_Sub16) Class83.aClass52_1339.get(anInt1588));
		if (class14_sub2_sub16 != null) {
			Class14_Sub2_Sub16 class14_sub2_sub16_0_ = class14_sub2_sub16;
			return class14_sub2_sub16_0_;
		}
		int i_1_ = 103 % ((-15 - i) / 47);
		Class14_Sub2_Sub16 class14_sub2_sub16_2_ = Class14_Sub19.method888(-113, anInt1588, Class51.aClass9_833, 0,
				Static2.aClass9_2598);
		if (class14_sub2_sub16_2_ != null) {
			class14_sub2_sub16_2_.method352(class148s, null);
			Class83.aClass52_1339.put(class14_sub2_sub16_2_, anInt1588);
		} else
			aBoolean1554 = true;
		Class14_Sub2_Sub16 class14_sub2_sub16_3_ = class14_sub2_sub16_2_;
		return class14_sub2_sub16_3_;
	}

	public void method1469(Buffer class14_sub10, int i) {
		class14_sub10.position++;
		aBoolean1455 = true;
		anInt1489 = class14_sub10.readUByte();
		anInt1498 = class14_sub10.readUShort();
		anInt1561 = class14_sub10.method805(0);
		anInt1609 = class14_sub10.method805(0);
		anInt1485 = class14_sub10.readUShort();
		anInt1488 = class14_sub10.readUShort();
		aByte1509 = class14_sub10.method780();
		aByte1536 = class14_sub10.method780();
		aByte1496 = class14_sub10.method780();
		aByte1502 = class14_sub10.method780();
		anInt1540 = class14_sub10.readUShort();
		if (anInt1540 != 65535)
			anInt1540 += anInt1548 & ~0xffff;
		else
			anInt1540 = -1;
		aBoolean1503 = class14_sub10.readUByte() == 1;
		if (anInt1489 == 0) {
			anInt1544 = class14_sub10.readUShort();
			anInt1605 = class14_sub10.readUShort();
			aBoolean1584 = class14_sub10.readUByte() == 1;
		}
		if (anInt1489 == 5) {
			anInt1487 = class14_sub10.getInt((byte) -105);
			anInt1474 = class14_sub10.readUShort();
			int i_4_ = class14_sub10.readUByte();
			aBoolean1577 = (i_4_ & 0x2) != 0;
			aBoolean1520 = (i_4_ & 0x1) != 0;
			anInt1590 = class14_sub10.readUByte();
			anInt1597 = class14_sub10.readUByte();
			anInt1570 = class14_sub10.getInt((byte) -108);
			aBoolean1472 = class14_sub10.readUByte() == 1;
			aBoolean1612 = class14_sub10.readUByte() == 1;
		}
		if (anInt1489 == 6) {
			anInt1543 = 1;
			anInt1550 = class14_sub10.readUShort();
			if (anInt1550 == 65535)
				anInt1550 = -1;
			anInt1607 = class14_sub10.method805(0);
			anInt1574 = class14_sub10.method805(0);
			anInt1465 = class14_sub10.readUShort();
			anInt1578 = class14_sub10.readUShort();
			anInt1516 = class14_sub10.readUShort();
			anInt1513 = class14_sub10.readUShort();
			anInt1598 = class14_sub10.readUShort();
			if (anInt1598 == 65535)
				anInt1598 = -1;
			aBoolean1599 = class14_sub10.readUByte() == 1;
			aShort1602 = (short) class14_sub10.readUShort();
			aShort1528 = (short) class14_sub10.readUShort();
			aBoolean1606 = class14_sub10.readUByte() == 1;
			if (aByte1509 != 0)
				anInt1514 = class14_sub10.readUShort();
			if (aByte1536 != 0)
				anInt1534 = class14_sub10.readUShort();
		}
		if (anInt1489 == 4) {
			anInt1588 = class14_sub10.readUShort();
			if (anInt1588 == 65535)
				anInt1588 = -1;
			aClass124_1499 = class14_sub10.method797(9467);
			anInt1460 = class14_sub10.readUByte();
			anInt1571 = class14_sub10.readUByte();
			anInt1538 = class14_sub10.readUByte();
			aBoolean1471 = class14_sub10.readUByte() == 1;
			anInt1567 = class14_sub10.getInt((byte) -117);
		}
		if (anInt1489 == 3) {
			anInt1567 = class14_sub10.getInt((byte) -102);
			aBoolean1497 = class14_sub10.readUByte() == 1;
			anInt1590 = class14_sub10.readUByte();
		}
		if (anInt1489 == 9) {
			anInt1506 = class14_sub10.readUByte();
			anInt1567 = class14_sub10.getInt((byte) -93);
			aBoolean1537 = class14_sub10.readUByte() == 1;
		}
		anInt1565 = class14_sub10.method829(41);
		int i_5_ = class14_sub10.readUByte();
		if (i_5_ > 0) {
			aByteArray1491 = new byte[i_5_];
			for (int i_6_ = 0; i_6_ < i_5_; i_6_++)
				aByteArray1491[i_6_] = class14_sub10.method780();
		}
		aClass124_1508 = class14_sub10.method797(9467);
		int i_7_ = class14_sub10.readUByte();
		if (i_7_ > 0) {
			aClass124Array1573 = new Class124[i_7_];
			for (int i_8_ = 0; i_7_ > i_8_; i_8_++)
				aClass124Array1573[i_8_] = class14_sub10.method797(9467);
		}
		anInt1580 = class14_sub10.readUByte();
		anInt1549 = class14_sub10.readUByte();
		aBoolean1507 = class14_sub10.readUByte() == 1;
		aClass124_1589 = class14_sub10.method797(9467);
		anObjectArray1529 = method1471(0, class14_sub10);
		anObjectArray1600 = method1471(0, class14_sub10);
		anObjectArray1576 = method1471(0, class14_sub10);
		anObjectArray1468 = method1471(0, class14_sub10);
		anObjectArray1562 = method1471(0, class14_sub10);
		if (i > -118)
			method1474((byte) 113, null);
		anObjectArray1585 = method1471(0, class14_sub10);
		anObjectArray1608 = method1471(0, class14_sub10);
		anObjectArray1504 = method1471(0, class14_sub10);
		anObjectArray1461 = method1471(0, class14_sub10);
		anObjectArray1535 = method1471(0, class14_sub10);
		anObjectArray1456 = method1471(0, class14_sub10);
		anObjectArray1458 = method1471(0, class14_sub10);
		anObjectArray1591 = method1471(0, class14_sub10);
		anObjectArray1592 = method1471(0, class14_sub10);
		anObjectArray1594 = method1471(0, class14_sub10);
		anObjectArray1581 = method1471(0, class14_sub10);
		anObjectArray1475 = method1471(0, class14_sub10);
		anObjectArray1463 = method1471(0, class14_sub10);
		anObjectArray1596 = method1471(0, class14_sub10);
		anObjectArray1517 = method1471(0, class14_sub10);
		anIntArray1557 = method1475((byte) 79, class14_sub10);
		anIntArray1470 = method1475((byte) 31, class14_sub10);
		anIntArray1539 = method1475((byte) 37, class14_sub10);
		anIntArray1566 = method1475((byte) 47, class14_sub10);
		anIntArray1546 = method1475((byte) 84, class14_sub10);
	}

	public static void method1470(int i) {
		int i_9_ = 50 % ((i - 40) / 51);
		aClass94_1469 = null;
	}

	public Object[] method1471(int i, Buffer class14_sub10) {
		int i_10_ = class14_sub10.readUByte();
		if (i_10_ == 0) {
			Object[] objects = null;
			return objects;
		}
		Object[] objects = new Object[i_10_];
		for (int i_11_ = i; i_11_ < i_10_; i_11_++) {
			int i_12_ = class14_sub10.readUByte();
			if (i_12_ == 0)
				objects[i_11_] = new Integer(class14_sub10.getInt((byte) -117));
			else if (i_12_ == 1)
				objects[i_11_] = class14_sub10.method797(9467);
		}
		aBoolean1564 = true;
		Object[] objects_13_ = objects;
		return objects_13_;
	}

	public void method1472(int i, int i_14_, int i_15_) {
		int i_16_ = anIntArray1452[i_15_];
		if (i_14_ == -10944) {
			anIntArray1452[i_15_] = anIntArray1452[i];
			anIntArray1452[i] = i_16_;
			i_16_ = anIntArray1542[i_15_];
			anIntArray1542[i_15_] = anIntArray1542[i];
			anIntArray1542[i] = i_16_;
		}
	}

	public boolean method1473(int i) {
		if (anIntArray1522 != null) {
			boolean bool = true;
			return bool;
		}
		Class148_Sub1 class148_sub1 = Class127.method1752(i, Static2.aClass9_2598, true, anInt1487);
		if (class148_sub1 == null) {
			boolean bool = false;
			return bool;
		}
		class148_sub1.method2009();
		anIntArray1614 = new int[class148_sub1.height];
		anIntArray1522 = new int[class148_sub1.height];
		for (int i_17_ = 0; i_17_ < class148_sub1.height; i_17_++) {
			int i_18_ = 0;
			for (int i_19_ = 0; i_19_ < class148_sub1.width; i_19_++) {
				if ((class148_sub1.paletteIndicators[i_19_ + class148_sub1.width * i_17_]) != 0) {
					i_18_ = i_19_;
					break;
				}
			}
			int i_20_ = class148_sub1.width;
			for (int i_21_ = i_18_; i_21_ < class148_sub1.width; i_21_++) {
				if ((class148_sub1.paletteIndicators[class148_sub1.width * i_17_ + i_21_]) == 0) {
					i_20_ = i_21_;
					break;
				}
			}
			anIntArray1522[i_17_] = i_18_;
			anIntArray1614[i_17_] = -i_18_ + i_20_;
		}
		boolean bool = true;
		return bool;
	}

	public void method1474(byte i, Buffer class14_sub10) {
		aBoolean1455 = false;
		anInt1489 = class14_sub10.readUByte();
		anInt1572 = class14_sub10.readUByte();
		anInt1498 = class14_sub10.readUShort();
		anInt1561 = class14_sub10.method805(0);
		anInt1609 = class14_sub10.method805(0);
		anInt1485 = class14_sub10.readUShort();
		anInt1488 = class14_sub10.readUShort();
		aByte1496 = (byte) 0;
		aByte1509 = (byte) 0;
		aByte1502 = (byte) 0;
		aByte1536 = (byte) 0;
		anInt1590 = class14_sub10.readUByte();
		anInt1540 = class14_sub10.readUShort();
		if (i >= -91)
			anObjectArray1529 = null;
		if (anInt1540 == 65535)
			anInt1540 = -1;
		else
			anInt1540 = (anInt1548 & ~0xffff) + anInt1540;
		anInt1563 = class14_sub10.readUShort();
		if (anInt1563 == 65535)
			anInt1563 = -1;
		int i_22_ = class14_sub10.readUByte();
		if (i_22_ > 0) {
			anIntArray1531 = new int[i_22_];
			anIntArray1527 = new int[i_22_];
			for (int i_23_ = 0; i_23_ < i_22_; i_23_++) {
				anIntArray1531[i_23_] = class14_sub10.readUByte();
				anIntArray1527[i_23_] = class14_sub10.readUShort();
			}
		}
		int i_24_ = class14_sub10.readUByte();
		if (i_24_ > 0) {
			anIntArrayArray1586 = new int[i_24_][];
			for (int i_25_ = 0; i_24_ > i_25_; i_25_++) {
				int i_26_ = class14_sub10.readUShort();
				anIntArrayArray1586[i_25_] = new int[i_26_];
				for (int i_27_ = 0; i_27_ < i_26_; i_27_++) {
					anIntArrayArray1586[i_25_][i_27_] = class14_sub10.readUShort();
					if (anIntArrayArray1586[i_25_][i_27_] == 65535)
						anIntArrayArray1586[i_25_][i_27_] = -1;
				}
			}
		}
		if (anInt1489 == 0) {
			anInt1605 = class14_sub10.readUShort();
			aBoolean1503 = class14_sub10.readUByte() == 1;
		}
		if (anInt1489 == 1) {
			class14_sub10.readUShort();
			class14_sub10.readUByte();
		}
		if (anInt1489 == 2) {
			anIntArray1542 = new int[anInt1488 * anInt1485];
			aByte1536 = (byte) 3;
			anIntArray1452 = new int[anInt1485 * anInt1488];
			aByte1509 = (byte) 3;
			int i_28_ = class14_sub10.readUByte();
			if (i_28_ == 1)
				anInt1565 |= 0x10000000;
			int i_29_ = class14_sub10.readUByte();
			if (i_29_ == 1)
				anInt1565 |= 0x40000000;
			int i_30_ = class14_sub10.readUByte();
			if (i_30_ == 1)
				anInt1565 |= ~0x7fffffff;
			int i_31_ = class14_sub10.readUByte();
			if (i_31_ == 1)
				anInt1565 |= 0x20000000;
			anInt1454 = class14_sub10.readUByte();
			anInt1613 = class14_sub10.readUByte();
			anIntArray1559 = new int[20];
			anIntArray1510 = new int[20];
			anIntArray1560 = new int[20];
			for (int i_32_ = 0; i_32_ < 20; i_32_++) {
				int i_33_ = class14_sub10.readUByte();
				if (i_33_ == 1) {
					anIntArray1559[i_32_] = class14_sub10.method805(0);
					anIntArray1510[i_32_] = class14_sub10.method805(0);
					anIntArray1560[i_32_] = class14_sub10.getInt((byte) -102);
				} else
					anIntArray1560[i_32_] = -1;
			}
			aClass124Array1479 = new Class124[5];
			for (int i_34_ = 0; i_34_ < 5; i_34_++) {
				Class124 class124 = class14_sub10.method797(9467);
				if (class124.method1693(0) > 0) {
					aClass124Array1479[i_34_] = class124;
					anInt1565 |= 1 << i_34_ + 23;
				}
			}
		}
		if (anInt1489 == 3)
			aBoolean1497 = class14_sub10.readUByte() == 1;
		if (anInt1489 == 4 || anInt1489 == 1) {
			anInt1571 = class14_sub10.readUByte();
			anInt1538 = class14_sub10.readUByte();
			anInt1460 = class14_sub10.readUByte();
			anInt1588 = class14_sub10.readUShort();
			if (anInt1588 == 65535)
				anInt1588 = -1;
			aBoolean1471 = class14_sub10.readUByte() == 1;
		}
		if (anInt1489 == 4) {
			aClass124_1499 = class14_sub10.method797(9467);
			aClass124_1552 = class14_sub10.method797(9467);
		}
		if (anInt1489 == 1 || anInt1489 == 3 || anInt1489 == 4)
			anInt1567 = class14_sub10.getInt((byte) -125);
		if (anInt1489 == 3 || anInt1489 == 4) {
			anInt1521 = class14_sub10.getInt((byte) -103);
			anInt1493 = class14_sub10.getInt((byte) -91);
			anInt1579 = class14_sub10.getInt((byte) -95);
		}
		if (anInt1489 == 5) {
			anInt1487 = class14_sub10.getInt((byte) -107);
			anInt1568 = class14_sub10.getInt((byte) -97);
		}
		if (anInt1489 == 6) {
			anInt1543 = 1;
			anInt1550 = class14_sub10.readUShort();
			if (anInt1550 == 65535)
				anInt1550 = -1;
			anInt1530 = 1;
			anInt1476 = class14_sub10.readUShort();
			if (anInt1476 == 65535)
				anInt1476 = -1;
			anInt1598 = class14_sub10.readUShort();
			if (anInt1598 == 65535)
				anInt1598 = -1;
			anInt1533 = class14_sub10.readUShort();
			if (anInt1533 == 65535)
				anInt1533 = -1;
			anInt1513 = class14_sub10.readUShort();
			anInt1465 = class14_sub10.readUShort();
			anInt1578 = class14_sub10.readUShort();
		}
		if (anInt1489 == 7) {
			aByte1536 = (byte) 3;
			aByte1509 = (byte) 3;
			anIntArray1542 = new int[anInt1485 * anInt1488];
			anIntArray1452 = new int[anInt1488 * anInt1485];
			anInt1571 = class14_sub10.readUByte();
			anInt1588 = class14_sub10.readUShort();
			if (anInt1588 == 65535)
				anInt1588 = -1;
			aBoolean1471 = class14_sub10.readUByte() == 1;
			anInt1567 = class14_sub10.getInt((byte) -107);
			anInt1454 = class14_sub10.method805(0);
			anInt1613 = class14_sub10.method805(0);
			int i_35_ = class14_sub10.readUByte();
			aClass124Array1479 = new Class124[5];
			if (i_35_ == 1)
				anInt1565 |= 0x40000000;
			for (int i_36_ = 0; i_36_ < 5; i_36_++) {
				Class124 class124 = class14_sub10.method797(9467);
				if (class124.method1693(0) > 0) {
					aClass124Array1479[i_36_] = class124;
					anInt1565 |= 1 << i_36_ + 23;
				}
			}
		}
		if (anInt1489 == 8)
			aClass124_1499 = class14_sub10.method797(9467);
		if (anInt1572 == 2 || anInt1489 == 2) {
			aClass124_1589 = class14_sub10.method797(9467);
			aClass124_1483 = class14_sub10.method797(9467);
			int i_37_ = class14_sub10.readUShort() & 0x3f;
			anInt1565 |= i_37_ << 11;
		}
		if (anInt1572 == 1 || anInt1572 == 4 || anInt1572 == 5 || anInt1572 == 6) {
			aClass124_1556 = class14_sub10.method797(9467);
			if (aClass124_1556.method1693(0) == 0) {
				if (anInt1572 == 1)
					aClass124_1556 = JunkTex.aClass124_4264;
				if (anInt1572 == 4)
					aClass124_1556 = JunkTex.aClass124_2810;
				if (anInt1572 == 5)
					aClass124_1556 = JunkTex.aClass124_2810;
				if (anInt1572 == 6)
					aClass124_1556 = Static2.aClass124_1781;
			}
		}
		if (anInt1572 == 1 || anInt1572 == 4 || anInt1572 == 5)
			anInt1565 |= 0x400000;
		if (anInt1572 == 6)
			anInt1565 |= 0x1;
	}

	public int[] method1475(byte i, Buffer class14_sub10) {
		if (i < 16) {
			int[] is = null;
			return is;
		}
		int i_38_ = class14_sub10.readUByte();
		if (i_38_ == 0) {
			int[] is = null;
			return is;
		}
		int[] is = new int[i_38_];
		for (int i_39_ = 0; i_39_ < i_38_; i_39_++)
			is[i_39_] = class14_sub10.getInt((byte) -106);
		int[] is_40_ = is;
		return is_40_;
	}

	public AbstractSprite method1476(boolean bool, byte i) {
		if (i != 61) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		int i_41_;
		if (!bool)
			i_41_ = anInt1487;
		else
			i_41_ = anInt1568;
		aBoolean1554 = false;
		if (i_41_ == -1) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		long l = (((aBoolean1612 ? 1L : 0L) << 39) + i_41_ - (-((aBoolean1577 ? 1L : 0L) << 35)
				- ((long) anInt1597 << 36) + -((aBoolean1472 ? 1L : 0L) << 38) + -((long) anInt1570 << 40)));
		AbstractSprite class14_sub2_sub19 = ((AbstractSprite) OverlayType.aClass52_2406.get(l));
		if (class14_sub2_sub19 != null) {
			AbstractSprite class14_sub2_sub19_42_ = class14_sub2_sub19;
			return class14_sub2_sub19_42_;
		}
		AbstractSprite_Sub1 class14_sub2_sub19_sub1;
		if (aBoolean1577)
			class14_sub2_sub19_sub1 = Class137.method1943(0, Static2.aClass9_2598, i_41_, (byte) 99);
		else
			class14_sub2_sub19_sub1 = JunkTex.method485(i + 29, Static2.aClass9_2598, i_41_, 0);
		if (class14_sub2_sub19_sub1 == null) {
			aBoolean1554 = true;
			class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		if (aBoolean1472)
			class14_sub2_sub19_sub1.method406();
		if (aBoolean1612)
			class14_sub2_sub19_sub1.method412();
		if (anInt1597 > 0)
			class14_sub2_sub19_sub1.method402(anInt1597);
		if (anInt1597 >= 1)
			class14_sub2_sub19_sub1.method411(1);
		if (anInt1597 >= 2)
			class14_sub2_sub19_sub1.method411(16777215);
		if (anInt1570 != 0)
			class14_sub2_sub19_sub1.method408(anInt1570);
		AbstractSprite_Sub2 class14_sub2_sub19_sub2;
		if (class14_sub2_sub19_sub1 instanceof AbstractSprite_Sub1_Sub1)
			class14_sub2_sub19_sub2 = new AbstractSprite_Sub2_Sub1(class14_sub2_sub19_sub1);
		else
			class14_sub2_sub19_sub2 = new AbstractSprite_Sub2(class14_sub2_sub19_sub1);
		OverlayType.aClass52_2406.put(class14_sub2_sub19_sub2, l);
		AbstractSprite_Sub2 class14_sub2_sub19_sub2_43_ = class14_sub2_sub19_sub2;
		return class14_sub2_sub19_sub2_43_;
	}

	public void method1477(Class124 class124, byte i, int i_44_) {
		if (i != 109)
			anObjectArray1585 = null;
		if (aClass124Array1573 == null || i_44_ >= aClass124Array1573.length) {
			Class124[] class124s = new Class124[i_44_ + 1];
			if (aClass124Array1573 != null) {
				for (int i_45_ = 0; aClass124Array1573.length > i_45_; i_45_++)
					class124s[i_45_] = aClass124Array1573[i_45_];
			}
			aClass124Array1573 = class124s;
		}
		aClass124Array1573[i_44_] = class124;
	}

	public AbstractSprite method1479(byte i, int i_51_) {
		aBoolean1554 = false;
		if (i_51_ < 0 || i_51_ >= anIntArray1560.length) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		int i_52_ = anIntArray1560[i_51_];
		if (i_52_ == -1) {
			AbstractSprite class14_sub2_sub19 = null;
			return class14_sub2_sub19;
		}
		AbstractSprite class14_sub2_sub19 = ((AbstractSprite) OverlayType.aClass52_2406.get(i_52_));
		if (i < 30) {
			AbstractSprite class14_sub2_sub19_53_ = null;
			return class14_sub2_sub19_53_;
		}
		if (class14_sub2_sub19 != null) {
			AbstractSprite class14_sub2_sub19_54_ = class14_sub2_sub19;
			return class14_sub2_sub19_54_;
		}
		class14_sub2_sub19 = Class58.method1259(-110, Static2.aClass9_2598, 0, i_52_);
		if (class14_sub2_sub19 == null)
			aBoolean1554 = true;
		else
			OverlayType.aClass52_2406.put(class14_sub2_sub19, i_52_);
		AbstractSprite class14_sub2_sub19_55_ = class14_sub2_sub19;
		return class14_sub2_sub19_55_;
	}

	public Class133_Sub7 method1480(Class102 class102, int i, boolean bool, Animation animation, int i_56_) {
		aBoolean1554 = false;
		int i_57_;
		int i_58_;
		if (!bool) {
			i_58_ = anInt1550;
			i_57_ = anInt1543;
		} else {
			i_57_ = anInt1530;
			i_58_ = anInt1476;
		}
		if (i_57_ == 0) {
			Class133_Sub7 class133_sub7 = null;
			return class133_sub7;
		}
		if (i_57_ == 1 && i_58_ == -1) {
			Class133_Sub7 class133_sub7 = null;
			return class133_sub7;
		}
		if (i_57_ == 1) {
			Class133_Sub7 class133_sub7 = ((Class133_Sub7) (JunkTex.aClass52_4588.get(i_58_ + (i_57_ << 48))));
			if (class133_sub7 == null) {
				Class133_Sub2 class133_sub2 = Class133_Sub2.method1824(JunkTex.aClass9_4486, i_58_, 0);
				if (class133_sub2 == null) {
					aBoolean1554 = true;
					Class133_Sub7 class133_sub7_59_ = null;
					return class133_sub7_59_;
				}
				class133_sub7 = class133_sub2.method1827(64, 768, -50, -10, -50);
				JunkTex.aClass52_4588.put(class133_sub7, (i_57_ << 48) + i_58_);
			}
			if (animation != null)
				class133_sub7 = animation.method1167(i_56_, 65535, class133_sub7);
			return class133_sub7;
		}
		if (i == (i_57_ ^ 0xffffffff)) {
			Class133_Sub7 class133_sub7 = Class126.method1744(i_58_, i ^ ~0xa8).method224((byte) -118, animation, i_56_);
			if (class133_sub7 == null) {
				aBoolean1554 = true;
				Class133_Sub7 class133_sub7_60_ = null;
				return class133_sub7_60_;
			}
			Class133_Sub7 class133_sub7_61_ = class133_sub7;
			return class133_sub7_61_;
		}
		if (i_57_ == 3) {
			if (class102 == null) {
				Class133_Sub7 class133_sub7 = null;
				return class133_sub7;
			}
			Class133_Sub7 class133_sub7 = class102.method1521(animation, 1073741823, i_56_);
			if (class133_sub7 == null) {
				aBoolean1554 = true;
				Class133_Sub7 class133_sub7_62_ = null;
				return class133_sub7_62_;
			}
			Class133_Sub7 class133_sub7_63_ = class133_sub7;
			return class133_sub7_63_;
		}
		if (i_57_ == 4) {
			Class142 class142 = JunkTex.method605(98, i_58_);
			Class133_Sub7 class133_sub7 = class142.method1974(animation, i_56_, 0, 10);
			if (class133_sub7 == null) {
				aBoolean1554 = true;
				Class133_Sub7 class133_sub7_64_ = null;
				return class133_sub7_64_;
			}
			Class133_Sub7 class133_sub7_65_ = class133_sub7;
			return class133_sub7_65_;
		}
		if (i_57_ == 6) {
			Class133_Sub7 class133_sub7 = Class126.method1744(i_58_, 170).method209(0, i_56_, animation, null, -67);
			if (class133_sub7 == null) {
				aBoolean1554 = true;
				Class133_Sub7 class133_sub7_66_ = null;
				return class133_sub7_66_;
			}
			Class133_Sub7 class133_sub7_67_ = class133_sub7;
			return class133_sub7_67_;
		}
		if (i_57_ == 7) {
			int i_68_ = anInt1550 >>> 48;
			int i_69_ = anInt1550 & 0xffff;
			Class133_Sub7 class133_sub7 = class102.method1524(i_68_, i_56_, i_69_, animation, i + 129);
			if (class133_sub7 == null) {
				aBoolean1554 = true;
				Class133_Sub7 class133_sub7_70_ = null;
				return class133_sub7_70_;
			}
			Class133_Sub7 class133_sub7_71_ = class133_sub7;
			return class133_sub7_71_;
		}
		Class133_Sub7 class133_sub7 = null;
		return class133_sub7;
	}

	public Class94() {
		aBoolean1455 = false;
		anInt1476 = -1;
		aBoolean1497 = false;
		anInt1485 = 0;
		anInt1488 = 0;
		aClass124_1499 = Class33.aClass124_578;
		anInt1478 = -1;
		anInt1474 = 0;
		anInt1490 = 0;
		anInt1482 = 0;
		anInt1454 = 0;
		anInt1513 = 100;
		aClass124_1483 = Class33.aClass124_578;
		anInt1506 = 1;
		anInt1493 = 0;
		aByte1509 = (byte) 0;
		anInt1538 = 0;
		aBoolean1503 = false;
		aByte1496 = (byte) 0;
		aBoolean1520 = false;
		anInt1544 = 0;
		anInt1534 = 0;
		anInt1518 = 0;
		aByte1536 = (byte) 0;
		aClass94_1492 = null;
		anInt1545 = 0;
		aClass124_1508 = Class33.aClass124_578;
		anInt1523 = 0;
		anInt1515 = -1;
		anInt1516 = 0;
		anInt1459 = 0;
		anInt1565 = 0;
		anInt1498 = 0;
		anInt1530 = 1;
		anInt1553 = 0;
		anInt1532 = -1;
		anInt1547 = 0;
		aBoolean1537 = false;
		anInt1549 = 0;
		aBoolean1507 = false;
		aByte1502 = (byte) 0;
		aBoolean1471 = false;
		anInt1550 = -1;
		anInt1514 = 0;
		anInt1543 = 1;
		aShort1528 = (short) 3000;
		anInt1533 = -1;
		aBoolean1577 = false;
		aBoolean1564 = false;
		anInt1579 = 0;
		anInt1494 = 0;
		anInt1578 = 0;
		anInt1561 = 0;
		anInt1583 = 0;
		anInt1465 = 0;
		anInt1571 = 0;
		anInt1495 = 0;
		anInt1481 = -1;
		anInt1590 = 0;
		anInt1487 = -1;
		anInt1567 = 0;
		aClass124_1589 = Class33.aClass124_578;
		anInt1598 = -1;
		aClass124_1552 = Class33.aClass124_578;
		anInt1540 = -1;
		aBoolean1599 = false;
		anInt1563 = -1;
		anInt1525 = 0;
		anInt1572 = 0;
		anInt1568 = -1;
		anInt1464 = 1;
		anInt1548 = -1;
		anInt1570 = 0;
		anInt1574 = 0;
		anInt1580 = 0;
		anInt1597 = 0;
		aBoolean1575 = true;
		aShort1602 = (short) 0;
		aBoolean1462 = false;
		anInt1588 = -1;
		anInt1505 = 0;
		aClass124_1556 = JunkTex.aClass124_4264;
		aBoolean1606 = false;
		anInt1603 = 0;
		anInt1611 = 0;
		anInt1607 = 0;
		aBoolean1584 = false;
		anInt1593 = 0;
		anInt1605 = 0;
		anInt1609 = 0;
		anInt1610 = 0;
		anInt1587 = -1;
		anInt1521 = 0;
		aBoolean1511 = false;
		anInt1613 = 0;
	}
}
