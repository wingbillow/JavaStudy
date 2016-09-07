package com.njcb.base;

public class TestChar {
	public static void main(String args[]) {

		// java 使用的是 UNICODE 编码
		System.out.println("Char范围：" + Character.MIN_VALUE + " < char < " + Character.MAX_VALUE);
		System.out.println("Char数值范围：" + (int) Character.MIN_VALUE + " < char < " + (int) Character.MAX_VALUE);
		System.out.println("Char数值范围：" + (Character.MIN_VALUE + 0) + "<char<" + (Character.MAX_VALUE + 0));

		char c1 = 'A'; // 字符型数据必须使用单引号声明
		System.out.println("字符：" + c1);

		// 在 UNICODE 编码环境下，也可以在字符之中保存中文。
		char c2 = '王'; // 字符型数据必须使用单引号声明
		System.out.print("中文字符：" + c2);
		System.out.println(" 对应数值：" + (c2 + 0));

		// 在 Java 中的 UNICODE 编码下已经部分吸收了 ASCII 码
		char c3 = 'z'; // 字符变量
		int num2 = c3; // 将char变为int型
		System.out.println('z' + "字符转数值：" + num2);

		// 大小写转换
		char c4 = 'A'; // 字符变量
		int num4 = c4; // 将char变为int型
		num4 = num4 + 32; // 65 + 32 = 97，num为97
		System.out.print(c4 + " + 32 = ");
		System.out.print(num4);
		System.out.println("(" + (char) num4 + ")");

		// 字符 1、 2、 3 与数字的 1、 2、 3 是不同的
		int x = 49;
		char c = '1'; // 字符
		System.out.println("字符1对应数值：" + (int) c);
		System.out.println("字符1和数字49比较：" + (x == c));

		char c5 = '5'; // 字符变量
		if (c5 >= 48 && c5 <= 57) {
			System.out.println(c5 + "是一个数字！");
		} else {
			System.out.println(c5 + "不是一个数字！");
		}
		if (c5 >= '0' && c5 <= '9') {
			System.out.println(c5 + "是一个数字！");
		} else {
			System.out.println(c5 + "不是一个数字！");
		}

		//前128字节编码与ASCII兼容
		for (int i = 0; i < 128; i++) {
			 System.out.println( i + " = "+ ( (char) i ) ) ;
		}

	}
}
