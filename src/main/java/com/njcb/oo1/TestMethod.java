package com.njcb.oo1;

public class TestMethod {
	public static void main(String args[]) {
		printMessage(); // 由主方法直接调用
		printMessage(); // 由主方法直接调用

		System.out.println(hello("world"));
		System.out.println(hello("everybody"));

		System.out.println(add(10, 20));
		int temp = add(100, 200);
		System.out.println(temp);

		fun(3);
		fun(5);
	}

	// 定义一个没有参数，并且没有返回值的方法
	public static void printMessage() {
		System.out.println("Hello World .");
	}

	// 定义一个有返回值，有一个参数的方法
	public static String hello(String name) {
		return "hello : " + name;
	}

	// 有2个参数的 有返回值类型的 定义一个加法操作
	public static int add(int x, int y) {
		return x + y;
	}

	// 使用return结束方法调用
	public static void fun(int x) {
		if (x == 3) {
			return; // 之后的代码不执行了
		}
		System.out.println("x = " + x);
	}
}
