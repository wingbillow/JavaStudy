package com.njcb.base;

//开关语句 switch
public class TestSwitch {
	public static void main(String args[]) {
		int i = 0;
		switch (i) {
			case 1: {
				System.out.println("结果为 1.");
			}
			case 2: {
				System.out.println("结果为 2.");
			}
			case 3: {
				System.out.println("结果为 3.");
			}
			default: {
				System.out.println("其他结果.");
			}
		}

		char c = 'A';
			switch (c) {
			case 'A': {
				System.out.println("结果为 A.");
				break;
			}
			case 'B': {
				System.out.println("结果为 B.");
				break;
			}
			default: {
				System.out.println("其他结果.");
				break;
			}
		}

		String str = "HELLO";
		switch (str) {
			case "HELLO": {
				System.out.println("结果为 HELLO.");
				break;
			}
			case "WORLD": {
				System.out.println("结果为 WORLD.");
				break;
			}
			default: {
				System.out.println("其他结果.");
				break;
			}
		}
	}
}
