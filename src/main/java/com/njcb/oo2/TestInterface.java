package com.njcb.oo2;

interface IA { // 定义了一个接口 // 全局常量
	public static final String INFO = "HELLO WORLD";

	public abstract void printA(); // 抽象方法

}

interface IB { // 接口
	void printB();			//省略public abstract
}

// AB 类同时实现了 A B 两个接口
class AB implements IA, IB {
	
	@Override
	public void printA() {
		System.out.println("这是 A 接口的方法");
	}

	@Override
	public void printB() {
		System.out.println("这是 B 接口的方法");
	}
}

abstract class CC { // 抽象类
	public abstract void printC();
}


// ABC 类同时实现了 A B 两个接口,继承了抽象类
class ABC extends CC implements IA, IB {

	@Override
	public void printA() {
		System.out.println("这是 A 接口的方法");
		
	}

	@Override
	public void printB() {
		System.out.println("这是 B 接口的方法");
		
	}

	@Override
	public void printC() {
		System.out.println("这是 C抽象类的方法");
		
	}
}


interface IC extends IA, IB { // 接口多继承
	public void printC();
}



class Xabc implements IC {
	
	@Override
	public void printA() {
		System.out.println("这是 A 接口的方法");
	}

	@Override
	public void printB() {
		System.out.println("这是 B 接口的方法");
	}

	@Override
	public void printC() {
		System.out.println("这是 C 接口的方法");
	}


}

public class TestInterface {
	public static void main(String args[]) {
		System.out.println(IA.INFO);

		IA a = new AB(); // 子类为父接口实例化
		IB b = new AB(); // 子类为父接口实例化
		a.printA();
		b.printB();

		ABC abc = new ABC();
		abc.printA();
		abc.printB();
		abc.printC();
		
		IC xabc = new Xabc();
		xabc.printA();
		xabc.printB();
		xabc.printC();
	}
}
