//�������ѡ���ԶԸ���Ĺ��ܽ������䣬�������ҪҲ���Բ������κεķ���
package com.njcb.oo2;

public class TestExtends {
	public static void main(String args[]) {
		
		//��������ڽ��ж���ʵ����֮ǰ����Ĭ�ϵ��ø��๹�죨Ĭ��ִ�и�����޲ι��췽�����������ٵ������๹�졣
		Student stu = new Student();
		stu.setName("XXX"); // �̳ж���
		stu.setAge(30); // �̳ж���
		System.out.println(stu.getName() + "��" + stu.getAge());
		stu.setSchool("�Ͼ���ѧ"); // ����ķ���
		System.out.println(stu.getName() + "��" + stu.getAge() + "��" + stu.getSchool());
		
		
	}
}
