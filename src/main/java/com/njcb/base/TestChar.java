package com.njcb.base;

public class TestChar {
	public static void main(String args[]) {

		// java ʹ�õ��� UNICODE ����
		System.out.println("Char��Χ��" + Character.MIN_VALUE + " < char < " + Character.MAX_VALUE);
		System.out.println("Char��ֵ��Χ��" + (int) Character.MIN_VALUE + " < char < " + (int) Character.MAX_VALUE);
		System.out.println("Char��ֵ��Χ��" + (Character.MIN_VALUE + 0) + "<char<" + (Character.MAX_VALUE + 0));

		char c1 = 'A'; // �ַ������ݱ���ʹ�õ���������
		System.out.println("�ַ���" + c1);

		// �� UNICODE ���뻷���£�Ҳ�������ַ�֮�б������ġ�
		char c2 = '��'; // �ַ������ݱ���ʹ�õ���������
		System.out.print("�����ַ���" + c2);
		System.out.println(" ��Ӧ��ֵ��" + (c2 + 0));

		// �� Java �е� UNICODE �������Ѿ����������� ASCII ��
		char c3 = 'z'; // �ַ�����
		int num2 = c3; // ��char��Ϊint��
		System.out.println('z' + "�ַ�ת��ֵ��" + num2);

		// ��Сдת��
		char c4 = 'A'; // �ַ�����
		int num4 = c4; // ��char��Ϊint��
		num4 = num4 + 32; // 65 + 32 = 97��numΪ97
		System.out.print(c4 + " + 32 = ");
		System.out.print(num4);
		System.out.println("(" + (char) num4 + ")");

		// �ַ� 1�� 2�� 3 �����ֵ� 1�� 2�� 3 �ǲ�ͬ��
		int x = 49;
		char c = '1'; // �ַ�
		System.out.println("�ַ�1��Ӧ��ֵ��" + (int) c);
		System.out.println("�ַ�1������49�Ƚϣ�" + (x == c));

		char c5 = '5'; // �ַ�����
		if (c5 >= 48 && c5 <= 57) {
			System.out.println(c5 + "��һ�����֣�");
		} else {
			System.out.println(c5 + "����һ�����֣�");
		}
		if (c5 >= '0' && c5 <= '9') {
			System.out.println(c5 + "��һ�����֣�");
		} else {
			System.out.println(c5 + "����һ�����֣�");
		}

		//ǰ128�ֽڱ�����ASCII����
		for (int i = 0; i < 128; i++) {
			 System.out.println( i + " = "+ ( (char) i ) ) ;
		}

	}
}
