package com.njcb.oo1;

//���췽������
class Human { // �����࣬����������ĸ��д
	private String name; // �������ԣ���ʾ����
	private int age = 18; // �������ԣ���ʾ����
	//���췽���ǹ�������һ��,�ڹ��췽��ִ�е�ʱ�����е��ڴ�ռ䶼�Ѿ�����ɹ��ˣ�ͬʱ���Ѿ�Ϊ���������������ˡ�

	// ����û�в����Ĺ��췽��
	public Human() {
	}

	// �����в����Ĺ��췽��
	public Human(String n) {
		setName(n); // ���ñ��෽��,this.setName(n) ;
	}

	public Human(String n, int a) {               // �����û�������   
		setName(n); // ���ñ��෽��,this.setName(n) ;
		setAge(a); // ���ñ��෽��,this.setAge(a) ;
	}

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		if (a >= 0 && a <= 250) {
			age = a;
		} // ���������������age�������ݾ���0
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}


	public String toString() {
		return "������" + name + "�����䣺" + age;
	}
}

public class TestConstructor {
	public static void main(String args[]) {
		Human per = new Human("����", -30);
		System.out.println(per);
	}
}
