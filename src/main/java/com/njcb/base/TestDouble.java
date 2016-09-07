package com.njcb.base;

//观察double的使用
public class TestDouble {
	public static void main(String args[]) {
		
		System.out.println("浮点型float范围：" + Float.MIN_VALUE + " < float < " + Float.MAX_VALUE );
		float numf = (float) 10.2;	
		float numf1 = 10.2f;
		// float * int = float
		System.out.println(numf * 2);
		

		System.out.println("\r\n\r\n浮点型double范围：" + Double.MIN_VALUE + " < double < " + Double.MAX_VALUE );
		
        double num = 10.2 ;     // 小数为double类型
        System.out.println(num) ;
        // double型 * int型（变为double型） = double型
        System.out.println(num * 2) ;
        
        
        
        int numA = 10 ;
        int numB = 3 ;
        System.out.println(numA / numB) ;
        System.out.println(numA / (double)numB) ;    
        
        
        
	}
}
