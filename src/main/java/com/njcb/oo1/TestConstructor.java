package com.njcb.oo1;

//构造方法重载
class Human { // 定义类，类名称首字母大写
	private String name; // 定义属性，表示姓名
	private int age = 18; // 定义属性，表示年龄
	//构造方法是构造的最后一步,在构造方法执行的时候所有的内存空间都已经分配成功了，同时都已经为属性设置完内容了。

	// 定义没有参数的构造方法
	public Human() {
	}

	// 定义有参数的构造方法
	public Human(String n) {
		setName(n); // 调用本类方法,this.setName(n) ;
	}

	public Human(String n, int a) {               // 留给用户操作的   
		setName(n); // 调用本类方法,this.setName(n) ;
		setAge(a); // 调用本类方法,this.setAge(a) ;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		if (a >= 0 && a <= 250) {
			age = a;
		} // 如果不满足条件，age属性内容就是0
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public String toString() {
		return "姓名：" + name + "，年龄：" + age;
	}
}

public class TestConstructor {
	public static void main(String args[]) {
		Human per = new Human("张三", -30);
		System.out.println(per);
	}
}
