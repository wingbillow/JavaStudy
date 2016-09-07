package com.njcb.oo2;

interface IA { // ������һ���ӿ� // ȫ�ֳ���
	public static final String INFO = "HELLO WORLD";

	public abstract void printA(); // ���󷽷�

}

interface IB { // �ӿ�
	void printB();			//ʡ��public abstract
}

// AB ��ͬʱʵ���� A B �����ӿ�
class AB implements IA, IB {
	
	@Override
	public void printA() {
		System.out.println("���� A �ӿڵķ���");
	}

	@Override
	public void printB() {
		System.out.println("���� B �ӿڵķ���");
	}
}

abstract class CC { // ������
	public abstract void printC();
}


// ABC ��ͬʱʵ���� A B �����ӿ�,�̳��˳�����
class ABC extends CC implements IA, IB {

	@Override
	public void printA() {
		System.out.println("���� A �ӿڵķ���");
		
	}

	@Override
	public void printB() {
		System.out.println("���� B �ӿڵķ���");
		
	}

	@Override
	public void printC() {
		System.out.println("���� C������ķ���");
		
	}
}


interface IC extends IA, IB { // �ӿڶ�̳�
	public void printC();
}



class Xabc implements IC {
	
	@Override
	public void printA() {
		System.out.println("���� A �ӿڵķ���");
	}

	@Override
	public void printB() {
		System.out.println("���� B �ӿڵķ���");
	}

	@Override
	public void printC() {
		System.out.println("���� C �ӿڵķ���");
	}


}

public class TestInterface {
	public static void main(String args[]) {
		System.out.println(IA.INFO);

		IA a = new AB(); // ����Ϊ���ӿ�ʵ����
		IB b = new AB(); // ����Ϊ���ӿ�ʵ����
		a.printA();
		b.printB();

		ABC abc = new ABC();
		abc.printA();
		abc.printB();
		abc.printC();
		
		IC xabc = new Xabc();
		xabc.printA();
		xabc.printB();
		xabc.printC();
	}
}
