package com.njcb.base;

//�����ַ�������
public class TestString {
	public static void main(String args[]) {

		System.out.println("����+�����ַ������ݵ�����");
		String str = "Hello "; // ˫��������
		str = str + "World "; // ��+����ʾ�ַ�������
		str += "!!!";// ��ʾ�ַ�������
		System.out.println(str);

		int numA = 10;
		double numB = 20.1;
		String result = "10 + 20.1 = " + numA + numB;
		System.out.println(result);
		String result2 = "10 + 20.1 = " + (numA + numB);
		System.out.println(result2);

		System.out.println("ת�Ʒ���\\ ת���ַ�\\t\\'\\n");
		String str1 = "\t\"Hello \'World . \n��ã�";
		System.out.println(str1);

		String s0 = "hello";
		String s1 = "hello";
		String s2 = "he" + "llo";
		System.out.println(s0 == s1);
		System.out.println(s1 == s2);
		
		final String s ;
		s = "aaa";
		//s = "bbb";
		System.out.println("final ���ɸı�");
	}
}
