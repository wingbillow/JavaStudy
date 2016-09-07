package com.njcb.base;

//使用while循环统计 1 ~ 100的累加
public class TestWhile {
	public static void main(String args[]) {
		int x = 1; // 循环的初始化条件
		int sum = 0; // 保存循环的内容
		while (x <= 100) {
			sum += x; // 累加
			x++; // 修改循环变量
		}
		System.out.println("while累加结果：" + sum);

		
		int i = 1; // 循环的初始化条件
		int sum2 = 0; // 保存循环的内容
		do {
			sum2 += i; // 累加
			i++; // 修改循环变量
		} while (i <= 100);
		System.out.println("dowhile累加结果：" + sum2);
	}
}
