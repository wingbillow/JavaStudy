package com.njcb.oo3;

import java.util.Arrays;

public class Test2Array {
	public static void main(String[] args) {
		// ��һ��3 ��4 �е�����
		int[][] data = new int[3][4];
		// ������������
		data[0][0] = 10;
		data[1][0] = 20;
		data[2][0] = 30;
		data[0][2] = 60;
		data[1][2] = 70;
		
		// ��һ��3 ��4 �е�����
		//int data[][] = new int[][] { { 1, 2, 3 }, { 6, 7, 8 }, { 10, 11, 12 } };
		
		System.out.println("Ĭ�ϴ�ӡ��"+data);
		System.out.println("toString��ӡ"+Arrays.toString(data));
		System.out.println("toString��ӡ"+Arrays.deepToString(data));
		System.out.println("�˹���ӡ");
		for (int x = 0; x < data.length; x++) {
			for (int y = 0; y < data[x].length; y++) {
				System.out.print(data[x][y] + "\t");
			}
			System.out.println();
		}


	}
	
}
