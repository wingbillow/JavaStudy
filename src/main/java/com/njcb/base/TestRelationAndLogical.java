package com.njcb.base;

//�Աȡ�&���롰&&��
public class TestRelationAndLogical {
	public static void main(String args[]) {

		int x = 10;
		int y = 20;
		System.out.println(x > y); // false
		System.out.println(x < y); // true
		System.out.println(x == y); // false
		System.out.println(x >= y);// false
		System.out.println(x <= y);// true
		System.out.println(x != y);// true
		System.out.println(!(x > y)); // false

		if (1 == 2 & 10 / 0 == 0) {			//��ͨ��
			System.out.println("�������㣡");

		}

		if (1 == 2 && 10 / 0 == 0) {		//��·��
			System.out.println("�������㣡");
		}

		if (1 == 1 | 10 / 0 == 0) {			//��ͨ��
			System.out.println("�������㣡");
		}

		if (1 == 1 || 10 / 0 == 0) {		//��·��
			System.out.println("�������㣡");
		}
	}

}
