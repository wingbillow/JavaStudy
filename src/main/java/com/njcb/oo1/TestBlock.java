package com.njcb.oo1;

//��������
class Block {
	public Block() {
		System.out.println("Block��Ĺ��췽��");
	}

	{ // �����
		System.out.println("Block��Ĺ����");
	}
	
	//��̬�顪������ͨ��֮�ж��徲̬��
	static { // ��̬��
		System.out.println("Block��ľ�̬��");
	}
}

//��ͨ�����
public class TestBlock {
	
	
	//��̬�顪��������֮�ж��徲̬��
	static {
		System.out.println("�����еľ�̬�顣");
	}
	
	
	public static void main(String args[]) {
		{ // ��ͨ�����
			int x = 10; // �ֲ�
			System.out.println("�ֲ����� x = " + x);
		}
		int x = 100; // ȫ��
		System.out.println("ȫ�ֱ��� x = " + x);
		
		
		new Block();
		new Block();
		new Block();
	}
	
	
	

}
