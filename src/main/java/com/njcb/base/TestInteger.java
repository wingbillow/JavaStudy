package com.njcb.base;

//�������α���
public class TestInteger {
	public static void main(String args[]) {
		int num; // ����һ��int�ͱ����������ʱ��û������ֵ
		num = 10; // Ϊ������������
		System.out.println("�������ͱ���  num = " + num);
		
		System.out.println("\r\n\r\n���ͷ�Χ��" + Integer.MIN_VALUE + " < int < " + Integer.MAX_VALUE );

		
		// ������Χ ���ݵ����
		System.out.println("\r\n\r\n�������");
		int max = Integer.MAX_VALUE; // ȡ�� int �����ֵ
		int min = Integer.MIN_VALUE; // ȡ�� int ����Сֵ
		System.out.println("MAX + 1 = " + (max + 1)); // int + int = int
		System.out.println("MAX + 2 = " + (max + 2)); // int + int = int
		System.out.println("MIN - 1 = " + (min - 1)); // int - int = int
		System.out.println("MIN - 2 = " + (min - 2)); // int - int = int

		
		// ������ĸ L��ʹ��ǿ������ת����ģʽ  ����long�������ͽ�����ݵ��������   ����ת��
		System.out.println("\r\n\r\nǿ������ת����  ����ת�ͣ�");
		System.out.println("MAX + 1 = " + (max + 1L)); // int + long = long
		System.out.println("MIN - 1 = " + ((long) min - 1)); // long - int = long
		System.out.println("��ΧС�����������뷶Χ����������ͽ�����ѧ����ʱ���ὫС�ķ�Χ�����Զ�ת��Ϊ��Χ����������");
		
		
		long num2 = 100L ; // 100 ������ int �ķ�Χ��
		int temp2 = (int) num2 ; // int �ķ�ΧС�� long ��Χ,����ǿ��ת��
		System.out.println("\r\n\r\nǿ������ת��������ת�ͣ�" + temp2) ;
		System.out.println("��Χ����������ͱ�Ϊ��ΧС���������ͣ��������ǿ��ת���ķ�ʽ");
				
		long num3 = 2147483649L ; // ������ int �ķ�Χ
		int temp3 = (int) num3 ; // int �ķ�ΧС�� long ��Χ,����ǿ��ת��
		System.out.println("\r\n\r\nǿ������ת��������ת�ͣ�" + temp3) ;
		System.out.println("���������ݳ�����Ŀ�����͵ķ�Χ����������ݵ����");
		
		
		System.out.println("\r\n\r\n����Byte��Χ��" + Byte.MIN_VALUE + " < byte < " + Byte.MAX_VALUE );
		
        byte b = 10 ;    // int��Ϊbyte
        System.out.println("�ڷ�Χ���Զ�ʵ��ת��" + b) ;
        
        //byte�����⴦��
        byte bb = (byte) 1000 ;        // int��Ϊbyte,���ڲ���byte��Χ֮�е����ͳ���������Ҫִ��ǿ������ת��
        System.out.println("������Χ����ǿ��ת��" + bb) ;
	}
}
