package com.njcb.oo3;

import java.util.Arrays;

public class TestArray {

	public static void main(String args[]) {
		
		// ��ʾ������һ��int �����飬����Ϊ3
		int[] data = new int[3];
		//int data[] = new int[4];	

		// Ĭ��ֵ
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);

		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		System.out.println("���鳤�ȣ�"+ data.length); // ���鳤��
		
		System.out.println("Ĭ�ϴ�ӡ��"+data);
		
		System.out.println("toString��ӡ"+Arrays.toString(data));
		
		System.out.println("�ֶ���ӡ");
		for (int x = 0; x < data.length; x++) {
			System.out.println(data[x]);
		}
		
		int data2[] = new int[] { 10, 20, 30, 70, 80, 90 };
		System.out.println("toString��ӡ"+Arrays.toString(data2));

		// ���ô���
		System.out.println("\r\r\n���ô���");
		int temp[] = data;
		temp[0] = 100; // �޸�һ������
		System.out.println("data��"+Arrays.toString(data));
		System.out.println("temp��"+Arrays.toString(temp));

		
		int data3[] = new int[10];
	    int[] arr = data3 ; // ���ô���
		init(data3);  
		print(data3);
		System.out.println("arr:"+Arrays.toString(arr));

		
		
		

	}

	// ר�Ŷ���һ����ʼ���������ݵķ���
	// Ҫ�������е�ÿ������Ϊ����������
	// ���ڶ���Ĳ����ͱ�ʾ��������
	public static void init(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			arr[x] = x; // ��������Ϊ����������
		}
	}

	public static void print(int temp[]) {
		for (int x = 0; x < temp.length; x++) {
			System.out.print(temp[x] + " ");
		}
		System.out.println();
	}
}
