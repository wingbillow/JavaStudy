package com.njcb.oo1;
//ʵ��һ��1 ~ 100���ۼ� ���� ʹ��whileѭ��ʵ��
public class TestRecursion {
	public static void main(String args[]) {
        int x = 1 ;
        int sum = 0 ;
        while(x <= 100) {        // sum += x ++ ;
                 sum += x ;
                 x ++ ;
        }
        System.out.println(sum) ;
        
        
        //�ݹ�
        System.out.println(sum(100)) ;
	}
	
	
	public static int sum(int data){    // �ݹ�������ڷ�������
        if(data == 1) {    // �Ѿ����㵽���һ����
                 return 1 ;
        }
        return data + sum(data - 1) ;
	}
	
	//��һ�ε���sum()�������������ã���return 100 + sum(99)��
	//�ڶ��ε���sum()��������ã���return 99 + sum(98)��
	//�����ε���sum()��������ã���return 98 + sum(97)��
	//�����ڶ��ε���sum()��������ã���return 2 + sum(1)��
	//������һ�ε���sum()��������ã���return 1��
	//���գ�return 100 + 99 + 98 + ... + 3 + 2 + 1��

}
