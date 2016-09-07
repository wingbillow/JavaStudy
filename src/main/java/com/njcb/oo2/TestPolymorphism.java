package com.njcb.oo2;

class A {
	public void fun() {
		System.out.println("A  public void fun()");
	}
}

class B extends A {

	@Override
	public void fun() {
		System.out.println("B  public void fun()");
	}

	// 是子类扩充的方法
	public void printB() {
		System.out.println("B public void printB()");
	}
}

class C extends A {

	@Override
	public void fun() {
		System.out.println("C  public void fun()");
	}
}

public class TestPolymorphism {
	public static void main(String args[]) {
		B b1 = new B();
		C c1 = new C();
		b1.fun();
		c1.fun();

		// 对象向上转型
		// 父类 父类对象 = new 子类() ;
		A a2 = new B();
		a2.fun();

		// 实现向下转型
		B b2 = (B) a2;
		b2.fun();

		// 对象向下转型时是会存在有风险的
		// ClassCastException
		// A a3 = new A(); // 实例化父类对象
		// B b3 = (B) a3; // 向下转型
		// b3.fun();

		// 子类的主要功能是进行父类功能的扩充，所以下面就通过扩充来演示何为子 类的特殊操作需要进行向下转型
		A a4 = new B(); // 向上转型
		a4.fun();
		B b4 = (B) a4; // 向下转型
		b4.printB();

		
		A a5 = new B(); // 向上转型
		System.out.println(a5 instanceof A);
		System.out.println(a5 instanceof B);
		if (a5 instanceof B) { // 如果是 B 类实例
			B b5 = (B) a5; // 向下转型
			b5.printB();
		}
	}
}
