package com.njcb.oo1;

public class TestMethod {
	public static void main(String args[]) {
		printMessage(); // ��������ֱ�ӵ���
		printMessage(); // ��������ֱ�ӵ���

		System.out.println(hello("world"));
		System.out.println(hello("everybody"));

		System.out.println(add(10, 20));
		int temp = add(100, 200);
		System.out.println(temp);

		fun(3);
		fun(5);
	}

	// ����һ��û�в���������û�з���ֵ�ķ���
	public static void printMessage() {
		System.out.println("Hello World .");
	}

	// ����һ���з���ֵ����һ�������ķ���
	public static String hello(String name) {
		return "hello : " + name;
	}

	// ��2�������� �з���ֵ���͵� ����һ���ӷ�����
	public static int add(int x, int y) {
		return x + y;
	}

	// ʹ��return������������
	public static void fun(int x) {
		if (x == 3) {
			return; // ֮��Ĵ��벻ִ����
		}
		System.out.println("x = " + x);
	}
}
