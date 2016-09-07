package com.njcb.oo1;

//ʹ��static�ؼ�����������
class Student {
	private String name;
	private int age;
	// String school = "�廪��ѧ" ; // �˴�Ϊ�˷��㣬�ݲ���װ
	static String school = "�廪��ѧ"; // �˴�Ϊ�˷��㣬�ݲ���װ

	private static int count = 1; // ͳ�Ƹ���
	
	public Student() {   //��һ����Ҫ�����ͳ�Ƴ���֮�в��������ٸ�ʵ����������Ϳ�������static����ͳ��
		System.out.println("Student���������" + count++ );
	}
	
	public Student(String name, int age) {
		this();
		this.name = name;
		this.age = age;
	}

	public String getInfo() {
		return "������" + this.name + "�����䣺" + this.age + "��ѧУ��" + this.school;
	}
	
 
	public static void fun1() {
	        System.out.println("����static������ֱ�ӵ���") ;
	}
	public void fun2() {
        System.out.println("��ͨ����ֻ��ͨ��ʵ�����������") ;
	}
}

public class TestStatic {
	public static void main(String args[]) {
		Student stuA = new Student("����", 20);
		Student stuB = new Student("����", 21);
		Student stuC = new Student("����", 22);
		System.out.println(stuA.getInfo());
		System.out.println(stuB.getInfo());
		System.out.println(stuC.getInfo());
		
		
		System.out.println("\r\n\r\n�޸�һ�������school���Ե�ʱ�����ж����school���Զ��޸���");
        Student stuD = new Student("����",20) ;
        Student stuE = new Student("����",20) ;
        Student stuF = new Student("����",20) ;
        stuD.school = "������ѧ" ;

        System.out.println(stuD.getInfo()) ;
        System.out.println(stuE.getInfo()) ;
        System.out.println(stuF.getInfo()) ;
        
        System.out.println("\r\n\r\nstatic���Կ�����һ����û��ʵ���������ʱ��ֱ�ӽ��з���");
        Student.school = "�廪��ѧ" ;
        System.out.println(stuD.getInfo()) ;
        System.out.println(stuE.getInfo()) ;
        System.out.println(stuF.getInfo()) ;
        
        
        
        // static����ֻ�ܹ�����static���Ի�����static����
        Student.fun1() ;         // ����static������ֱ�ӵ���
        new Student().fun2() ;	//��ͨ����ֻ��ͨ��ʵ�����������
	}
}
