package com.njcb.oo3;

public class TestWrapper {
	public static void main(String args[]) {
		Integer obj = 10; // �Զ�װ��
		int temp = obj; // �Զ�����
		System.out.println(temp * 2); // JDK 1.5 �����ֱ�����ð�װ�����
		System.out.println(obj * 10);

		Double dou = 10.2;
		double num = dou;
		System.out.println(num * dou);

		// ���ַ�����Ϊ int ������
		String str1 = "123";
		int temp1 = Integer.parseInt(str1);
		System.out.println(temp1 * 2);

		// ���ַ�����Ϊ double ������
		String str2 = "12.3";
		double temp2 = Double.parseDouble(str2);
		System.out.println(temp2 * 2);

		// ��������ַ��������õ����ݲ��� true��Ҳ���� false����ᰴ�� false ���д���
		String str3 = "true";
		boolean temp3 = Boolean.parseBoolean(str3);
		System.out.println(temp3);

		// �����������ͱ�Ϊ�ַ���
		//�κ�һ�����������������ַ����������Ӳ����������Ϊ�ַ����� 
		int num4 = 100;
		String str4 = num4 + "";
		System.out.println(str4.length());

		//���� String ��֮���ṩ�� valueOf()����ʵ��
		int num5 = 100;
		String str5 = String.valueOf(num5);
		System.out.println(str5.length());
	}
}
