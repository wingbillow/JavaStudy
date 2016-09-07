package com.njcb.oo1;

//构造代码块
class Block {
	public Block() {
		System.out.println("Block类的构造方法");
	}

	{ // 构造块
		System.out.println("Block类的构造块");
	}
	
	//静态块——在普通类之中定义静态块
	static { // 静态块
		System.out.println("Block类的静态块");
	}
}

//普通代码块
public class TestBlock {
	
	
	//静态块——在主类之中定义静态块
	static {
		System.out.println("主类中的静态块。");
	}
	
	
	public static void main(String args[]) {
		{ // 普通代码块
			int x = 10; // 局部
			System.out.println("局部变量 x = " + x);
		}
		int x = 100; // 全局
		System.out.println("全局变量 x = " + x);
		
		
		new Block();
		new Block();
		new Block();
	}
	
	
	

}
