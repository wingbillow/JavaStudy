package com.njcb.base;

//ʹ��forѭ��ͳ�� 1 ~ 100���ۼ�
public class TestFor {
	public static void main(String args[]) {
		int sum = 0; // ����ѭ��������
		for (int x = 1; x <= 100; x++) {
			sum += x;
		}
		System.out.println("�ۼӽ����" + sum);

		for (int x = 1; x <= 9; x++) { // ������
			for (int y = 1; y <= x; y++) { // ������
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			} // ÿ�����֮��Ҫ����
			System.out.println(); // ����
		}

		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				continue;
			}
			if (x == 8) {
				break;
			}
			System.out.print(x + "��");
		}

		System.out.println();
		String[] books = { "Java����", "Javaʵս", "Java���ܵ���" };
		for (String book : books) {
			System.out.println(book);
		}

	}
}
