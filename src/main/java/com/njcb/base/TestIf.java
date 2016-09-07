package com.njcb.base;

//条件分支if
public class TestIf {
	public static void main(String args[]) {
		int score = 92; // 简化操作
		if (score >= 90 && score <= 100) {
			System.out.println(score + "成绩为优秀!");
		} else if (score >= 60 && score < 90) {
			System.out.println(score + "成绩为中等!");
		} else if (score >= 30 && score < 60) {
			System.out.println(score + "成绩为差等!");
		} else if (score >= 0 && score < 30) {
			System.out.println(score + "成绩为极差等!");
		} else {
			System.out.println(score + "为不可能成绩");
		}
	}
}
