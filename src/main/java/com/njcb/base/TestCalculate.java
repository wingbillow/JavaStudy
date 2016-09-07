package com.njcb.base;

//进行数学计算
public class TestCalculate {
	public static void main(String args[]) {
		int x = 10; // 整型变量
		int y = 3; // 整型变量
		System.out.println(x + "+" + y + " = " + (x + y));
		System.out.println(x + "-" + y + " = " + (x - y));
		System.out.println(x + "*" + y + " = " + (x * y));
		System.out.println(x + "/" + y + " = " + (x / y));
		System.out.println(x + "%" + y + " = " + (x % y));

		x = x + y; // 利用 x 和 y 变量的内容进行加法计算
		System.out.println(x + "+" + y + " = " + x);

		// 简化的运算符： +=、 -=、 *=、 /=、 %=
		x += y; // 利用 x 和 y 变量的内容进行加法计算
		System.out.println(x + "+" + y + " = " + x);

	}
}
