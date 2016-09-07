package com.njcb.oo3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayArrays {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Class.forName("java.lang.String");   
        
        //����һ������Ϊ10���ַ������飬��Java������Ҳ������ΪObject����   
        Object array = Array.newInstance(clazz, 10);   
           
        //���ַ���������������λ��Ϊ5��Ԫ������Ϊ"hello"   
        Array.set(array, 5, "hello");   
           
        //����ַ���������������λ��Ϊ5��Ԫ�ص�ֵ   
        String str = (String)Array.get(array, 5);   
        System.out.println(str);//hello   
		
		
		int[] array1 = new int[5];
		// �������
		Arrays.fill(array1, 5);
		System.out.println("������飺Arrays.fill(array, 5)��");
		output(array1);

		// ������ĵ�2�͵�3��Ԫ�ظ�ֵΪ8
		Arrays.fill(array1, 2, 4, 8);
		System.out.println("������ĵ�2�͵�3��Ԫ�ظ�ֵΪ8��Arrays.fill(array, 2, 4, 8)��");
		output(array1);

		int[] array2 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
		// ������ĵ�2������6�����������������
		Arrays.sort(array2, 2, 7);
		System.out.println("������ĵ�2������6��Ԫ�ؽ��������������Arrays.sort(array,2,7)��");
		output(array2);

		// �����������������
		Arrays.sort(array2);
		System.out.println("�����������������Arrays.sort(array1)��");
		output(array2);

		// ʹ�ö��������㷨����ָ��Ԫ�����ڵ��±꣨����������õģ�����������ȷ��
		Arrays.sort(array2);
		System.out.println("Ԫ��3��array1�е�λ�ã�Arrays.binarySearch(array1, 3)��" + "\n" + Arrays.binarySearch(array2, 3));
		// ��������ھͷ��ظ���
		System.out.println("Ԫ��9��array1�е�λ�ã�Arrays.binarySearch(array1, 9)��" + "\n" + Arrays.binarySearch(array2, 9));
	}

	public static void output(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
