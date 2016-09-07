package com.njcb.oo3;

public class TestWrapper {
	public static void main(String args[]) {
		Integer obj = 10; // 自动装箱
		int temp = obj; // 自动拆箱
		System.out.println(temp * 2); // JDK 1.5 后可以直接利用包装类计算
		System.out.println(obj * 10);

		Double dou = 10.2;
		double num = dou;
		System.out.println(num * dou);

		// 将字符串变为 int 型数据
		String str1 = "123";
		int temp1 = Integer.parseInt(str1);
		System.out.println(temp1 * 2);

		// 将字符串变为 double 型数据
		String str2 = "12.3";
		double temp2 = Double.parseDouble(str2);
		System.out.println(temp2 * 2);

		// 如果现在字符串中设置的内容不是 true，也不是 false，则会按照 false 进行处理。
		String str3 = "true";
		boolean temp3 = Boolean.parseBoolean(str3);
		System.out.println(temp3);

		// 基本数据类型变为字符串
		//任何一个基本数据类型与字符串进行连接操作，都会变为字符串； 
		int num4 = 100;
		String str4 = num4 + "";
		System.out.println(str4.length());

		//利用 String 类之中提供的 valueOf()方法实现
		int num5 = 100;
		String str5 = String.valueOf(num5);
		System.out.println(str5.length());
	}
}
