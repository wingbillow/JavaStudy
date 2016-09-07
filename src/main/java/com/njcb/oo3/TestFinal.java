package com.njcb.oo3;

final class MyClass {
	public final double f = Math.random();
	public static double s = Math.random();
	public int a;

}

public class TestFinal {

	public static void main(String[] args) {

		String a = "hello2";
		//final String b = "hello";		//编译器当做常量优化
		final String b = getHello();	//不当做常量优化
		String d = "hello";
		String c = b + 2;
		String e = d + 2;
		String f = "hell" + "o2"; 
		System.out.println((a == c));  	//true
		System.out.println((a == e));	//false
		System.out.println((a == f));	//true
		System.out.println((c == f));	//true
		System.out.println((e == f));	//false

		MyClass myClass1 = new MyClass();
		MyClass myClass2 = new MyClass();
		System.out.println("final:" + myClass1.f);
		System.out.println("static:" + myClass1.s);
		System.out.println("final:" + myClass2.f);
		System.out.println("static:" + myClass2.s);

	}

	private static String getHello() {
		return  "hello";
	}

}
