package com.njcb.oo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

class Student {
	private String name;
	private int age;

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "������" + this.name + "������ :" + this.age + "\n";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student per = (Student) obj;
		if (per.name.equals(this.name) && per.age == this.age) {
			return true;
		}
		return false;
	}
}

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("HELLO");
		list.add("HELLO"); // �������ظ�����
		list.add("WORLD");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get����
		}
		
		Iterator<String> iter = list.iterator() ;
        while (iter.hasNext()) {			//���õ��������
            String str = iter.next() ;
            System.out.println(str);
        }
        
        for (String str : list) {
            System.out.println(str);
        }
        

		System.out.println(list.isEmpty());
		list.set(0, "hello"); // �˷���Ҳ��List����
		list.remove("WORLD");
		System.out.println(list);

		List<Student> personList = new ArrayList<Student>();
		personList.add(new Student("����", 20));
		personList.add(new Student("����", 21));
		personList.add(new Student("����", 19));
		personList.remove(new Student("����", 19)); // ɾ��
		System.out.println(personList.contains(new Student("����", 21)));
		System.out.println(personList);

		List vetor = new Vector();
		//Vector vetor = new Vector();
		vetor.add("HELLO");
		vetor.add("HELLO"); // �������ظ�����
		vetor.add("WORLD");
		System.out.println(vetor);
		vetor.remove("HELLO");
		System.out.println(vetor);
		
		
		
	    List all = new ArrayList() ;
        Collections.addAll(all, "HELLO", "WORLD", "���");
        Collections.reverse(all);
        System.out.println(all);
	}
}
