package com.njcb.oo1;

//使用static关键字声明属性
class Student {
	private String name;
	private int age;
	// String school = "清华大学" ; // 此处为了方便，暂不封装
	static String school = "清华大学"; // 此处为了方便，暂不封装

	private static int count = 1; // 统计个数
	
	public Student() {   //若一个类要求可以统计出类之中产生过多少个实例化对象，则就可以利用static进行统计
		System.out.println("Student对象个数：" + count++ );
	}
	
	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "姓名：" + this.name + "，年龄：" + this.age + "，学校：" + this.school;
	}
	
 
	public static void fun1() {
	        System.out.println("调用static方法，直接调用") ;
	}
	public void fun2() {
        System.out.println("普通方法只能通过实例化对象调用") ;
	}
}

public class TestStatic {
	public static void main(String args[]) {
		Student stuA = new Student("张三", 20);
		Student stuB = new Student("李四", 21);
		Student stuC = new Student("王五", 22);
		System.out.println(stuA.getInfo());
		System.out.println(stuB.getInfo());
		System.out.println(stuC.getInfo());
		
		
		System.out.println("\r\n\r\n修改一个对象的school属性的时候所有对象的school属性都修改了");
        Student stuD = new Student("张三",20) ;
        Student stuE = new Student("李四",20) ;
        Student stuF = new Student("王五",20) ;
        stuD.school = "北京大学" ;

        System.out.println(stuD.getInfo()) ;
        System.out.println(stuE.getInfo()) ;
        System.out.println(stuF.getInfo()) ;
        
        System.out.println("\r\n\r\nstatic属性可以在一个类没有实例化对象的时候直接进行访问");
        Student.school = "清华大学" ;
        System.out.println(stuD.getInfo()) ;
        System.out.println(stuE.getInfo()) ;
        System.out.println(stuF.getInfo()) ;
        
        
        
        // static方法只能够调用static属性或者是static方法
        Student.fun1() ;         // 调用static方法，直接调用
        new Student().fun2() ;	//普通方法只能通过实例化对象调用
	}
}
