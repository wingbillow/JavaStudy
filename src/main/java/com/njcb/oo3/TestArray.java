package com.njcb.oo3;

import java.util.Arrays;

public class TestArray {

	public static void main(String args[]) {
		
		// 表示定义了一个int 型数组，长度为3
		int[] data = new int[3];
		//int data[] = new int[4];	

		// 默认值
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);

		data[0] = 10;
		data[1] = 20;
		data[2] = 30;
		System.out.println("数组长度："+ data.length); // 数组长度
		
		System.out.println("默认打印："+data);
		
		System.out.println("toString打印"+Arrays.toString(data));
		
		System.out.println("手动打印");
		for (int x = 0; x < data.length; x++) {
			System.out.println(data[x]);
		}
		
		int data2[] = new int[] { 10, 20, 30, 70, 80, 90 };
		System.out.println("toString打印"+Arrays.toString(data2));

		// 引用传递
		System.out.println("\r\r\n引用传递");
		int temp[] = data;
		temp[0] = 100; // 修改一个内容
		System.out.println("data："+Arrays.toString(data));
		System.out.println("temp："+Arrays.toString(temp));

		
		int data3[] = new int[10];
	    int[] arr = data3 ; // 引用传递
		init(data3);  
		print(data3);
		System.out.println("arr:"+Arrays.toString(arr));

		
		
		

	}

	// 专门定义一个初始化数组数据的方法
	// 要求数组中的每个内容为其索引内容
	// 现在定义的参数就表示接收数组
	public static void init(int[] arr) {
		for (int x = 0; x < arr.length; x++) {
			arr[x] = x; // 数组内容为其索引内容
		}
	}

	public static void print(int temp[]) {
		for (int x = 0; x < temp.length; x++) {
			System.out.print(temp[x] + " ");
		}
		System.out.println();
	}
}
