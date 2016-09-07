package com.njcb.oo3;

class MyMath { // 之所以使用 throws 是因为让异常产生后可以交给被调用处处理
	public static int div(int x, int y) throws Exception {
		int result = 0;
		System.out.println("***** 1 除法计算开始 *****");
		try {
			result = x / y;
		} finally {
			System.out.println("***** 2 除法计算结束 *****");
		}
		return result;
	}
}

public class TestException {
	public static void main(String args[]) {
		try {
			System.out.println(MyMath.div(10, 1));
			int a = Integer.parseInt("s");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.err.println("finally~~~");
		}
	}
}
