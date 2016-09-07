package com.njcb.oo2;

class A {
	public void fun() {
		System.out.println("A  public void fun()");
	}
}

class B extends A {

	@Override
	public void fun() {
		System.out.println("B  public void fun()");
	}

	// ����������ķ���
	public void printB() {
		System.out.println("B public void printB()");
	}
}

class C extends A {

	@Override
	public void fun() {
		System.out.println("C  public void fun()");
	}
}

public class TestPolymorphism {
	public static void main(String args[]) {
		B b1 = new B();
		C c1 = new C();
		b1.fun();
		c1.fun();

		// ��������ת��
		// ���� ������� = new ����() ;
		A a2 = new B();
		a2.fun();

		// ʵ������ת��
		B b2 = (B) a2;
		b2.fun();

		// ��������ת��ʱ�ǻ�����з��յ�
		// ClassCastException
		// A a3 = new A(); // ʵ�����������
		// B b3 = (B) a3; // ����ת��
		// b3.fun();

		// �������Ҫ�����ǽ��и��๦�ܵ����䣬���������ͨ����������ʾ��Ϊ�� ������������Ҫ��������ת��
		A a4 = new B(); // ����ת��
		a4.fun();
		B b4 = (B) a4; // ����ת��
		b4.printB();

		
		A a5 = new B(); // ����ת��
		System.out.println(a5 instanceof A);
		System.out.println(a5 instanceof B);
		if (a5 instanceof B) { // ����� B ��ʵ��
			B b5 = (B) a5; // ����ת��
			b5.printB();
		}
	}
}
