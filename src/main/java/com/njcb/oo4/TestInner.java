package com.njcb.oo4;

import com.njcb.oo4.Outer.SInner;

//内部类可以方便的访问外部类之中定义的私有成员,外部类也可以方便的访问内部类的私有成员。
class Outer { // 外部类
	private String msg = "Hello World .";
	private int num = 30;

	class Inner { // 内部定义的类就是内部类
		 //如果一个内部类不希望在外部使用，那么就使用private声明内部类
		private int num = 100; // 内部类私有成员

		public void print() { // 内部类中定义的方法
			System.out.println(msg); // 输出数据
			System.out.println(num); // 输出数据
			System.out.println(Outer.this.num); // 输出数据
			
			new B().say("B");
		}
		
		class B{
			void say(String s ){
				System.out.println(s);
			}
		}
	}
	
	static class SInner{
		
		void test(String s){
			System.out.println(s);
		}
		
		static void stest(String s){
			System.out.println(s);
		}
	}
	

	public void fun() {
		Inner in = new Inner();
		in.print();
		System.out.println(in.num); // 内部类私有
	}
}

public class TestInner {
	public static void main(String args[]) {
		Outer out = new Outer();
		out.fun();
		

		
		Outer.Inner in = new Outer().new Inner(); // 内部类
		in.print();
		
		
		Outer.SInner os = new Outer.SInner();		//静态内部类
		os.test("Outer.SInner  静态内部类 ");
		
		SInner.stest("SInner  静态内部类静态方法");		//静态内部类静态方法
		
		class A{								//方法内部类
			void say(String s ){
				System.out.println(s);
			}
		}
		
		new A().say("方法内部类");
		
	}
}
