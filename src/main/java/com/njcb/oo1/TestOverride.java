package com.njcb.oo1;


public class TestOverride {
	public static void main(String args[]) {
		System.out.println(add1(10, 20));
		System.out.println(add2(10, 20, 30));
		System.out.println(add3(10.2, 30.5));
		
		
        System.out.println(add(10,20)) ;
        System.out.println(add(10,20,30)) ;
        System.out.println(add(10.2,30.5)) ;
        
        
        System.out.println("HELLO") ;
        System.out.println(10) ;
        System.out.println(10.2) ;
        System.out.println('A') ;
        System.out.println(true) ;
	}

	
	//��������������ʵ��������������������������С������Ӳ���
	public static int add1(int x, int y) {
		return x + y;
	}

	public static int add2(int x, int y, int z) {
		return x + y + z;
	}

	public static double add3(double x, double y) {
		return x + y;
	}

	////ʵ�ַ�������
	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static double add(double x, double y) {
		return x + y;
	}
}
