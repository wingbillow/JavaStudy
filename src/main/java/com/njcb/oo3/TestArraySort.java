package com.njcb.oo3;

import java.util.Arrays;

public class TestArraySort {

	public static void main(String[] args) {

		int data1[] = new int[] { 8, 1, 3, 0, 9, 2, 6, 7 };
		Arrays.sort(data1); // ≈≈–Ú
		print(data1);

		int data2[] = new int[] { 7, 9, 8, 0, 1, 2, 5, 4, 3 };
		sort(data2);
		print(data2);
	}

	public static void sort(int array[]) {
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array.length - 1; y++) {
				if (array[y] > array[y + 1]) {
					int temp = array[y];
					array[y] = array[y + 1];
					array[y + 1] = temp;
				}
			}
		}
	}

	public static void print(int temp[]) {
		for (int x = 0; x < temp.length; x++) {
			System.out.print(temp[x] + "\t");
		}
		System.out.println(); // ªª––
	}
}
