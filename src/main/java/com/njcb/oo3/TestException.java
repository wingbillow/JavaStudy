package com.njcb.oo3;

class MyMath { // ֮����ʹ�� throws ����Ϊ���쳣��������Խ��������ô�����
	public static int div(int x, int y) throws Exception {
		int result = 0;
		System.out.println("***** 1 �������㿪ʼ *****");
		try {
			result = x / y;
		} finally {
			System.out.println("***** 2 ����������� *****");
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
