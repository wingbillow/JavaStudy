package com.njcb.base;

//定义整形变量
public class TestInteger {
	public static void main(String args[]) {
		int num; // 定义一个int型变量，定义的时候没设置数值
		num = 10; // 为变量设置内容
		System.out.println("定义整型变量  num = " + num);
		
		System.out.println("\r\n\r\n整型范围：" + Integer.MIN_VALUE + " < int < " + Integer.MAX_VALUE );

		
		// 超出范围 数据的溢出
		System.out.println("\r\n\r\n数据溢出");
		int max = Integer.MAX_VALUE; // 取得 int 的最大值
		int min = Integer.MIN_VALUE; // 取得 int 的最小值
		System.out.println("MAX + 1 = " + (max + 1)); // int + int = int
		System.out.println("MAX + 2 = " + (max + 2)); // int + int = int
		System.out.println("MIN - 1 = " + (min - 1)); // int - int = int
		System.out.println("MIN - 2 = " + (min - 2)); // int - int = int

		
		// 加上字母 L、使用强制类型转换的模式  利用long数据类型解决数据的溢出问题   向上转型
		System.out.println("\r\n\r\n强制类型转换（  向上转型）");
		System.out.println("MAX + 1 = " + (max + 1L)); // int + long = long
		System.out.println("MIN - 1 = " + ((long) min - 1)); // long - int = long
		System.out.println("范围小的数据类型与范围大的数据类型进行数学计算时，会将小的范围类型自动转型为大范围的数据类型");
		
		
		long num2 = 100L ; // 100 正好在 int 的范围内
		int temp2 = (int) num2 ; // int 的范围小于 long 范围,所以强制转换
		System.out.println("\r\n\r\n强制类型转换（向下转型）" + temp2) ;
		System.out.println("范围大的数据类型变为范围小的数据类型，必须采用强制转换的方式");
				
		long num3 = 2147483649L ; // 超过了 int 的范围
		int temp3 = (int) num3 ; // int 的范围小于 long 范围,所以强制转换
		System.out.println("\r\n\r\n强制类型转换（向下转型）" + temp3) ;
		System.out.println("操作的数据超过了目标类型的范围，会造成数据的溢出");
		
		
		System.out.println("\r\n\r\n整型Byte范围：" + Byte.MIN_VALUE + " < byte < " + Byte.MAX_VALUE );
		
        byte b = 10 ;    // int变为byte
        System.out.println("在范围内自动实现转型" + b) ;
        
        //byte的特殊处理
        byte bb = (byte) 1000 ;        // int变为byte,对于不在byte范围之中的整型常量，仍需要执行强制类型转换
        System.out.println("超过范围必须强制转换" + bb) ;
	}
}
