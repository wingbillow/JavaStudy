//实现继承
package com.njcb.oo2;

public class Student extends Person {
	// 可以不扩充任何的方法

	private String school;

	public Student() {
		// super(); // 不管写与不写，都存在
		System.out.println("Student类无参构造方法。");
	}

	public Student(String school) {
		this(); // 不让super()出现
		this.school = school;
		System.out.println("Student类有参构造方法。school=" + school);
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}

	// public void set() {
	// this.name = "Hello" ; // 子类不能访问父类私有操作，虽然不能访问，但是属性确实被继承下来了。
	// }

	@Override
	public void print() { // 方法名称与父类相同、参数类型及个数相同、返回值相同
							// 子类覆写的方法不能拥有比父类更为严格的访问控制权限
		super.print(); // 在子类中调用已经被子类所覆写的方法，使用“super.方法()”的形式
		System.out.println("Student类，public void print(){}");
	}
}
