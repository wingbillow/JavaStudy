package com.njcb.oo1;
//实现一个1 ~ 100的累加 —— 使用while循环实现
public class TestRecursion {
	public static void main(String args[]) {
        int x = 1 ;
        int sum = 0 ;
        while(x <= 100) {        // sum += x ++ ;
                 sum += x ;
                 x ++ ;
        }
        System.out.println(sum) ;
        
        
        //递归
        System.out.println(sum(100)) ;
	}
	
	
	public static int sum(int data){    // 递归是针对于方法调用
        if(data == 1) {    // 已经计算到最后一个了
                 return 1 ;
        }
        return data + sum(data - 1) ;
	}
	
	//第一次调用sum()（由主方法调用）：return 100 + sum(99)；
	//第二次调用sum()（自身调用）：return 99 + sum(98)；
	//第三次调用sum()（自身调用）：return 98 + sum(97)；
	//倒数第二次调用sum()（自身调用）：return 2 + sum(1)；
	//倒数第一次调用sum()（自身调用）：return 1；
	//最终：return 100 + 99 + 98 + ... + 3 + 2 + 1；

}
