package com.njcb.oo1;

class Person { // �����࣬����������ĸ��д
	String name; // �������ԣ���ʾ����
	int age; // �������ԣ���ʾ����
	
	// ��ʱ�ķ��������������ж��壬���Ҳ�����������ֱ�ӵ���
	public void tell() {
		System.out.println("������" + name + "�����䣺" + age);
	}
}

//ͨ�����������
public class TestClassObject {
	public static void main(String args[]) {
        Person per = new Person() ;      // ������ʵ��������
//       Person per = null ;               // ��������
//       per = new Person() ;     		   // ʵ��������(�ֲ���ɶ����ʵ����)
        per.name = "����" ;  			 // �������е�name���Ը�ֵ
        per.age = 20 ;               // �������е�age���Ը�ֵ
        per.tell() ;
        
        //NullPointerException
//        Person per1 = null ;               // ��������
//        per1.name = "����" ;      // �������е�name���Ը�ֵ
//        per1.age = 20 ;                // �������е�age���Ը�ֵ
//        per1.tell() ;
        
        System.out.println("\r\n\r\nʵ������������");
        Person perA = new Person() ;        // ʵ��������
        Person perB = new Person() ;        // ʵ��������
        perA.name = "����" ;
        perA.age = 20 ;
        perB.name = "����" ;
        perB.age = 30 ;
        perA.tell() ;
        perB.tell() ;
        System.out.println(perA == perB );
        
        System.out.println("\r\n\r\n���ù�ϵ��ָ�ľ���ͬһ����ڴ�ռ䱻��ͬ�� ջ��ָ��");
        Person perC = new Person() ;         // ʵ��������
        Person perD = null ;     // ��������
        perC.name = "����" ;
        perC.age = 20 ;
        // �������������������ͬ��
        perD = perC ;		// perC �ж��ڴ�ռ�
        perD.name = "����" ;
        perC.tell() ;
        System.out.println(perC == perD );
        
        System.out.println("\r\n\r\n���ô���");
        Person perE = new Person() ;         // ʵ��������
        Person perF = new Person() ;         // ʵ��������
        perE.name = "����" ;
        perE.age = 20 ;
        perF.name = "����" ;
        perF.age = 30 ;
        perF = perE ;			// ���ô���   ԭ���Ķ��ڴ��Ϊ����
        perF.name = "����" ;
        perE.tell() ;
        System.out.println(perE == perF );
	}
	
	
}
