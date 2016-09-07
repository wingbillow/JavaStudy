package com.njcb.base;

//对比“&”与“&&”
public class TestRelationAndLogical {
	public static void main(String args[]) {

		int x = 10;
		int y = 20;
		System.out.println(x > y); // false
		System.out.println(x < y); // true
		System.out.println(x == y); // false
		System.out.println(x >= y);// false
		System.out.println(x <= y);// true
		System.out.println(x != y);// true
		System.out.println(!(x > y)); // false

		if (1 == 2 & 10 / 0 == 0) {			//普通与
			System.out.println("条件满足！");

		}

		if (1 == 2 && 10 / 0 == 0) {		//短路与
			System.out.println("条件满足！");
		}

		if (1 == 1 | 10 / 0 == 0) {			//普通或
			System.out.println("条件满足！");
		}

		if (1 == 1 || 10 / 0 == 0) {		//短路或
			System.out.println("条件满足！");
		}
	}

}
