package com.njcb.base;

//������� switch
public class TestSwitch {
	public static void main(String args[]) {
		int i = 0;
		switch (i) {
			case 1: {
				System.out.println("���Ϊ 1.");
			}
			case 2: {
				System.out.println("���Ϊ 2.");
			}
			case 3: {
				System.out.println("���Ϊ 3.");
			}
			default: {
				System.out.println("�������.");
			}
		}

		char c = 'A';
			switch (c) {
			case 'A': {
				System.out.println("���Ϊ A.");
				break;
			}
			case 'B': {
				System.out.println("���Ϊ B.");
				break;
			}
			default: {
				System.out.println("�������.");
				break;
			}
		}

		String str = "HELLO";
		switch (str) {
			case "HELLO": {
				System.out.println("���Ϊ HELLO.");
				break;
			}
			case "WORLD": {
				System.out.println("���Ϊ WORLD.");
				break;
			}
			default: {
				System.out.println("�������.");
				break;
			}
		}
	}
}
