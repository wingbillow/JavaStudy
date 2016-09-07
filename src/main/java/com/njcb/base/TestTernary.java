package com.njcb.base;


public class TestTernary {
	public static void main(String[] args) {
		int numA = 10;
		int numB = 20;
		int result = numA > numB ? numA : numB;
		System.out.println(result);

		if (numA >numB){
			result = numA;
		}else{
			result = numB;
		}
		System.out.println(result);
	}
}
