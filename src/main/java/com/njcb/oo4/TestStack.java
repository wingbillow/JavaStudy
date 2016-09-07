package com.njcb.oo4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		Stack all = new Stack();
		all.push("A");
		all.push("B");
		all.push("C");
		System.out.println(all.pop());
		System.out.println(all.pop());
		System.out.println(all.pop());
		//System.out.println(all.pop()); // û�����ˣ�EmptyStackException
		
		 //add()��remove()������ʧ�ܵ�ʱ����׳��쳣(���Ƽ�)
        Queue<String> queue = new LinkedList<String>();
        //���Ԫ��
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        queue.offer("e");
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("poll="+queue.poll()); //���ص�һ��Ԫ�أ����ڶ�����ɾ��
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("element="+queue.element()); //���ص�һ��Ԫ�� 
        for(String q : queue){
            System.out.println(q);
        }
        System.out.println("===");
        System.out.println("peek="+queue.peek()); //���ص�һ��Ԫ�� 
        for(String q : queue){
            System.out.println(q);
        }
        
        List list = new LinkedList();
        list.add("HELLO");
		list.add("HELLO"); // �������ظ�����
		list.add("WORLD");
		System.out.println(list);

        
	}

}
