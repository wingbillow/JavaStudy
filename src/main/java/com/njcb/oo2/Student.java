//ʵ�ּ̳�
package com.njcb.oo2;

public class Student extends Person {
	// ���Բ������κεķ���

	private String school;

	public Student() {
		// super(); // ����д�벻д��������
		System.out.println("Student���޲ι��췽����");
	}

	public Student(String school) {
		this(); // ����super()����
		this.school = school;
		System.out.println("Student���вι��췽����school=" + school);
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getSchool() {
		return this.school;
	}

	// public void set() {
	// this.name = "Hello" ; // ���಻�ܷ��ʸ���˽�в�������Ȼ���ܷ��ʣ���������ȷʵ���̳������ˡ�
	// }

	@Override
	public void print() { // ���������븸����ͬ���������ͼ�������ͬ������ֵ��ͬ
							// ���าд�ķ�������ӵ�бȸ����Ϊ�ϸ�ķ��ʿ���Ȩ��
		super.print(); // �������е����Ѿ�����������д�ķ�����ʹ�á�super.����()������ʽ
		System.out.println("Student�࣬public void print(){}");
	}
}
