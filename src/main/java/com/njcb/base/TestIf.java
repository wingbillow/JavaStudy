package com.njcb.base;

//������֧if
public class TestIf {
	public static void main(String args[]) {
		int score = 92; // �򻯲���
		if (score >= 90 && score <= 100) {
			System.out.println(score + "�ɼ�Ϊ����!");
		} else if (score >= 60 && score < 90) {
			System.out.println(score + "�ɼ�Ϊ�е�!");
		} else if (score >= 30 && score < 60) {
			System.out.println(score + "�ɼ�Ϊ���!");
		} else if (score >= 0 && score < 30) {
			System.out.println(score + "�ɼ�Ϊ�����!");
		} else {
			System.out.println(score + "Ϊ�����ܳɼ�");
		}
	}
}
