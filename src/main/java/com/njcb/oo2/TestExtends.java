//子类可以选择性对父类的功能进行扩充，如果不需要也可以不扩充任何的方法
package com.njcb.oo2;

public class TestExtends {
	public static void main(String args[]) {
		
		//子类对象在进行对象实例化之前，会默认调用父类构造（默认执行父类的无参构造方法），而后再调用子类构造。
		Student stu = new Student();
		stu.setName("XXX"); // 继承而来
		stu.setAge(30); // 继承而来
		System.out.println(stu.getName() + "，" + stu.getAge());
		stu.setSchool("南京大学"); // 扩充的方法
		System.out.println(stu.getName() + "，" + stu.getAge() + "，" + stu.getSchool());
		
		
	}
}
