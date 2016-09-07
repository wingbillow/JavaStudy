/**
 * 
 */
package com.njcb.oo3;

/**
 * @author njcb
 *
 */
public class TestString {
 
 
	public static void main(String[] args) {
		String str = "Hello" ;
		System.out.println(str) ;
		
		String str1 = new String("Hello") ;
		System.out.println(str1) ;
		
		
		String strA = "Hello" ;
		String strB = new String("Hello") ;
		String strC = strB ; // 引用传递
		System.out.println(strA == strB) ; // false
		System.out.println(strB == strC) ; // true
		System.out.println(strA == strC) ; // false
		System.out.println(strA.equals(strB)) ; // true
		System.out.println(strB.equals(strC)) ; // true
		System.out.println(strA.equals(strC)) ; // true
		
		
		//手工的方式实现入池  基本不用
		String str2 = new String("Hello").intern() ;
		String str3 = "Hello" ;
		System.out.println(str2 == str3) ;
		
	}

}
