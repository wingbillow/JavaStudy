package com.njcb.base;

//使用for循环统计 1 ~ 100的累加
public class TestFor {
	public static void main(String args[]) {
		int sum = 0; // 保存循环的内容
		for (int x = 1; x <= 100; x++) {
			sum += x;
		}
		System.out.println("累加结果：" + sum);

		for (int x = 1; x <= 9; x++) { // 控制行
			for (int y = 1; y <= x; y++) { // 控制列
				System.out.print(x + "*" + y + "=" + x * y + "\t");
			} // 每行输出之后要换行
			System.out.println(); // 换行
		}

		for (int x = 0; x < 10; x++) {
			if (x == 3) {
				continue;
			}
			if (x == 8) {
				break;
			}
			System.out.print(x + "、");
		}

		System.out.println();
		String[] books = { "Java入门", "Java实战", "Java性能调优" };
		for (String book : books) {
			System.out.println(book);
		}

	}
}
