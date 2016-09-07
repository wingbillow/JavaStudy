package com.njcb.oo2;

abstract class Abs { // 定义抽象类
	public void fun() {
		System.out.println("Hello World .");
	}

	// 抽象方法，里面没有定义方法体
	public abstract void get();
}

class BAbs extends Abs { // 定义抽象类的子类
	
	@Override
	public void get() { // 定义方法体
		this.fun();  	// fun()是继承而来
	}
}

public class TestAbstract {
	public static void main(String args[]) {
		//Abs a = new Abs();   // 抽象类无法实例化
		
		Abs a= new BAbs();		// 向上转型 
		a.get();
	}
}
