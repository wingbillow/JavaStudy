package com.njcb.oo4;

import com.njcb.oo4.Outer.SInner;

//�ڲ�����Է���ķ����ⲿ��֮�ж����˽�г�Ա,�ⲿ��Ҳ���Է���ķ����ڲ����˽�г�Ա��
class Outer { // �ⲿ��
	private String msg = "Hello World .";
	private int num = 30;

	class Inner { // �ڲ������������ڲ���
		 //���һ���ڲ��಻ϣ�����ⲿʹ�ã���ô��ʹ��private�����ڲ���
		private int num = 100; // �ڲ���˽�г�Ա

		public void print() { // �ڲ����ж���ķ���
			System.out.println(msg); // �������
			System.out.println(num); // �������
			System.out.println(Outer.this.num); // �������
			
			new B().say("B");
		}
		
		class B{
			void say(String s ){
				System.out.println(s);
			}
		}
	}
	
	static class SInner{
		
		void test(String s){
			System.out.println(s);
		}
		
		static void stest(String s){
			System.out.println(s);
		}
	}
	

	public void fun() {
		Inner in = new Inner();
		in.print();
		System.out.println(in.num); // �ڲ���˽��
	}
}

public class TestInner {
	public static void main(String args[]) {
		Outer out = new Outer();
		out.fun();
		

		
		Outer.Inner in = new Outer().new Inner(); // �ڲ���
		in.print();
		
		
		Outer.SInner os = new Outer.SInner();		//��̬�ڲ���
		os.test("Outer.SInner  ��̬�ڲ��� ");
		
		SInner.stest("SInner  ��̬�ڲ��ྲ̬����");		//��̬�ڲ��ྲ̬����
		
		class A{								//�����ڲ���
			void say(String s ){
				System.out.println(s);
			}
		}
		
		new A().say("�����ڲ���");
		
	}
}
