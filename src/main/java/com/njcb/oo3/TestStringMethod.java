package com.njcb.oo3;

public class TestStringMethod {

	public static void main(String[] args) {

		String str = "helloworld";

		p("字符串：" + str);
		p("charAt(5):" + str.charAt(5));
		p("字符串变为字符数组");
		char data[] = str.toCharArray();
		for (int x = 0; x < data.length; x++) {
			data[x] -= 32;
		}
		p(new String(data));
		p(new String(data, 0, 5));

		p("Hello&World 转小写".toLowerCase());
		p("Hello&World 转大写".toUpperCase());

		p("字符串变为字节数组");
		byte data2[] = str.getBytes();
		for (int x = 0; x < data2.length; x++) {
			data2[x] -= 32;
		}
		p(new String(data2));

		String str1 = "Hello";
		String str2 = "hello";
		p("忽略大小写比较：" + str1.equalsIgnoreCase(str2));

		p("compareTo：" + str1.compareTo(str2));

		p("indexOf:" + str.indexOf("l", 6));
		if (str.indexOf("hello") != -1) {
			p("内容找到了.");
		}

		if (str.contains("hello")) {
			p("内容找到了.");
		}

		p(str.replaceAll("l", "X"));

		p(str.substring(6));
		p(str.substring(0, 5));

		String strSplit = "hello world hello nihao";
		String result[] = strSplit.split(" ");
		for (int x = 0; x < result.length; x++) {
			p(result[x]);
		}

		String strIp = "192.168.1.1";
		String ipResult[] = strIp.split("\\.");
		for (int x = 0; x < ipResult.length; x++) {
			p(ipResult[x]);
		}

		String strTrim = " hello world     ";
		p("内容:[" + strTrim.trim() + "]");
		p(strTrim.length());
	}

	public static void p(Object o) {
		System.out.println(o);
	}
}
