package com.njcb.base;

//ʹ��whileѭ��ͳ�� 1 ~ 100���ۼ�
public class TestWhile {
	public static void main(String args[]) {
		int x = 1; // ѭ���ĳ�ʼ������
		int sum = 0; // ����ѭ��������
		while (x <= 100) {
			sum += x; // �ۼ�
			x++; // �޸�ѭ������
		}
		System.out.println("while�ۼӽ����" + sum);

		
		int i = 1; // ѭ���ĳ�ʼ������
		int sum2 = 0; // ����ѭ��������
		do {
			sum2 += i; // �ۼ�
			i++; // �޸�ѭ������
		} while (i <= 100);
		System.out.println("dowhile�ۼӽ����" + sum2);
	}
}
