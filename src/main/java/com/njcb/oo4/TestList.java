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
		return "姓名：" + this.name + "，年龄 :" + this.age + "\n";
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
		list.add("HELLO"); // 保存了重复数据
		list.add("WORLD");
		System.out.println(list);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i)); // get方法
		}
		
		Iterator<String> iter = list.iterator() ;
        while (iter.hasNext()) {			//采用迭代器输出
            String str = iter.next() ;
            System.out.println(str);
        }
        
        for (String str : list) {
            System.out.println(str);
        }
        

		System.out.println(list.isEmpty());
		list.set(0, "hello"); // 此方法也是List扩充
		list.remove("WORLD");
		System.out.println(list);

		List<Student> personList = new ArrayList<Student>();
		personList.add(new Student("张三", 20));
		personList.add(new Student("李四", 21));
		personList.add(new Student("王五", 19));
		personList.remove(new Student("王五", 19)); // 删除
		System.out.println(personList.contains(new Student("李四", 21)));
		System.out.println(personList);

		List vetor = new Vector();
		//Vector vetor = new Vector();
		vetor.add("HELLO");
		vetor.add("HELLO"); // 保存了重复数据
		vetor.add("WORLD");
		System.out.println(vetor);
		vetor.remove("HELLO");
		System.out.println(vetor);
		
		
		
	    List all = new ArrayList() ;
        Collections.addAll(all, "HELLO", "WORLD", "你好");
        Collections.reverse(all);
        System.out.println(all);
	}
}
