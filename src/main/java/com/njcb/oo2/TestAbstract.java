package com.njcb.oo2;

abstract class Abs { // ���������
	public void fun() {
		System.out.println("Hello World .");
	}

	// ���󷽷�������û�ж��巽����
	public abstract void get();
}

class BAbs extends Abs { // ��������������
	
	@Override
	public void get() { // ���巽����
		this.fun();  	// fun()�Ǽ̳ж���
	}
}

public class TestAbstract {
	public static void main(String args[]) {
		//Abs a = new Abs();   // �������޷�ʵ����
		
		Abs a= new BAbs();		// ����ת�� 
		a.get();
	}
}
