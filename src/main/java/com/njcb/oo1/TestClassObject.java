package com.njcb.oo1;

class Person { // 定义类，类名称首字母大写
	String name; // 定义属性，表示姓名
	int age; // 定义属性，表示年龄
	
	// 此时的方法不是在主类中定义，并且不会由主方法直接调用
	public void tell() {
		System.out.println("姓名：" + name + "，年龄：" + age);
	}
}

//通过对象操作类
public class TestClassObject {
	public static void main(String args[]) {
        Person per = new Person() ;      // 声明并实例化对象
//       Person per = null ;               // 声明对象
//       per = new Person() ;     		   // 实例化对象(分步完成对象的实例化)
        per.name = "张三" ;  			 // 调用类中的name属性赋值
        per.age = 20 ;               // 调用类中的age属性赋值
        per.tell() ;
        
        //NullPointerException
//        Person per1 = null ;               // 声明对象
//        per1.name = "张三" ;      // 调用类中的name属性赋值
//        per1.age = 20 ;                // 调用类中的age属性赋值
//        per1.tell() ;
        
        System.out.println("\r\n\r\n实例化两个对象");
        Person perA = new Person() ;        // 实例化对象
        Person perB = new Person() ;        // 实例化对象
        perA.name = "张三" ;
        perA.age = 20 ;
        perB.name = "李四" ;
        perB.age = 30 ;
        perA.tell() ;
        perB.tell() ;
        System.out.println(perA == perB );
        
        System.out.println("\r\n\r\n引用关系，指的就是同一块堆内存空间被不同的 栈所指向");
        Person perC = new Person() ;         // 实例化对象
        Person perD = null ;     // 声明对象
        perC.name = "张三" ;
        perC.age = 20 ;
        // 这两个对象的类型是相同的
        perD = perC ;		// perC 有堆内存空间
        perD.name = "李四" ;
        perC.tell() ;
        System.out.println(perC == perD );
        
        System.out.println("\r\n\r\n引用传递");
        Person perE = new Person() ;         // 实例化对象
        Person perF = new Person() ;         // 实例化对象
        perE.name = "张三" ;
        perE.age = 20 ;
        perF.name = "李四" ;
        perF.age = 30 ;
        perF = perE ;			// 引用传递   原来的堆内存成为垃圾
        perF.name = "王五" ;
        perE.tell() ;
        System.out.println(perE == perF );
	}
	
	
}
