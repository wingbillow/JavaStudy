package com.njcb.base;

//�۲�double��ʹ��
public class TestDouble {
	public static void main(String args[]) {
		
		System.out.println("������float��Χ��" + Float.MIN_VALUE + " < float < " + Float.MAX_VALUE );
		float numf = (float) 10.2;	
		float numf1 = 10.2f;
		// float * int = float
		System.out.println(numf * 2);
		

		System.out.println("\r\n\r\n������double��Χ��" + Double.MIN_VALUE + " < double < " + Double.MAX_VALUE );
		
        double num = 10.2 ;     // С��Ϊdouble����
        System.out.println(num) ;
        // double�� * int�ͣ���Ϊdouble�ͣ� = double��
        System.out.println(num * 2) ;
        
        
        
        int numA = 10 ;
        int numB = 3 ;
        System.out.println(numA / numB) ;
        System.out.println(numA / (double)numB) ;    
        
        
        
	}
}
