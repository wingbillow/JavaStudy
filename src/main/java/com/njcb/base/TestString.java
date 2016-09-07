package com.njcb.base;

//定义字符串变量
public class TestString {
	public static void main(String args[]) {

		System.out.println("利用+进行字符串数据的连接");
		String str = "Hello "; // 双引号声明
		str = str + "World "; // “+”表示字符串连接
		str += "!!!";// 表示字符串连接
		System.out.println(str);

		int numA = 10;
		double numB = 20.1;
		String result = "10 + 20.1 = " + numA + numB;
		System.out.println(result);
		String result2 = "10 + 20.1 = " + (numA + numB);
		System.out.println(result2);

		System.out.println("转移符号\\ 转移字符\\t\\'\\n");
		String str1 = "\t\"Hello \'World . \n你好！";
		System.out.println(str1);

		String s0 = "hello";
		String s1 = "hello";
		String s2 = "he" + "llo";
		System.out.println(s0 == s1);
		System.out.println(s1 == s2);
		
		final String s ;
		s = "aaa";
		//s = "bbb";
		System.out.println("final 不可改变");
	}
}
