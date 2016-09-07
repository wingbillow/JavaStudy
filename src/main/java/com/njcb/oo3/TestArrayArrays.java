package com.njcb.oo3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestArrayArrays {

	public static void main(String[] args) throws Exception {
		
		Class<?> clazz = Class.forName("java.lang.String");   
        
        //创建一个长度为10的字符串数组，在Java中数组也可以作为Object对象   
        Object array = Array.newInstance(clazz, 10);   
           
        //把字符串数组对象的索引位置为5的元素设置为"hello"   
        Array.set(array, 5, "hello");   
           
        //获得字符串数组对象的索引位置为5的元素的值   
        String str = (String)Array.get(array, 5);   
        System.out.println(str);//hello   
		
		
		int[] array1 = new int[5];
		// 填充数组
		Arrays.fill(array1, 5);
		System.out.println("填充数组：Arrays.fill(array, 5)：");
		output(array1);

		// 将数组的第2和第3个元素赋值为8
		Arrays.fill(array1, 2, 4, 8);
		System.out.println("将数组的第2和第3个元素赋值为8：Arrays.fill(array, 2, 4, 8)：");
		output(array1);

		int[] array2 = { 7, 8, 3, 2, 12, 6, 3, 5, 4 };
		// 对数组的第2个到第6个进行排序进行排序
		Arrays.sort(array2, 2, 7);
		System.out.println("对数组的第2个到第6个元素进行排序进行排序：Arrays.sort(array,2,7)：");
		output(array2);

		// 对整个数组进行排序
		Arrays.sort(array2);
		System.out.println("对整个数组进行排序：Arrays.sort(array1)：");
		output(array2);

		// 使用二分搜索算法查找指定元素所在的下标（必须是排序好的，否则结果不正确）
		Arrays.sort(array2);
		System.out.println("元素3在array1中的位置：Arrays.binarySearch(array1, 3)：" + "\n" + Arrays.binarySearch(array2, 3));
		// 如果不存在就返回负数
		System.out.println("元素9在array1中的位置：Arrays.binarySearch(array1, 9)：" + "\n" + Arrays.binarySearch(array2, 9));
	}

	public static void output(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
