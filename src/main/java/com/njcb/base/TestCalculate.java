package com.njcb.base;

//������ѧ����
public class TestCalculate {
	public static void main(String args[]) {
		int x = 10; // ���ͱ���
		int y = 3; // ���ͱ���
		System.out.println(x + "+" + y + " = " + (x + y));
		System.out.println(x + "-" + y + " = " + (x - y));
		System.out.println(x + "*" + y + " = " + (x * y));
		System.out.println(x + "/" + y + " = " + (x / y));
		System.out.println(x + "%" + y + " = " + (x % y));

		x = x + y; // ���� x �� y ���������ݽ��мӷ�����
		System.out.println(x + "+" + y + " = " + x);

		// �򻯵�������� +=�� -=�� *=�� /=�� %=
		x += y; // ���� x �� y ���������ݽ��мӷ�����
		System.out.println(x + "+" + y + " = " + x);

	}
}
