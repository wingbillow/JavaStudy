package com.njcb.oo4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名：" + this.name + "，年龄 :" + this.age + "\n";
	}

	@Override
	public int compareTo(Person o) {
		if (this.age > o.age) {
			return -1;
		} else if (this.age < o.age) {
			return 1;
		}
		return this.name.compareTo(o.name);
	}

}

public class TestSet {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<String>();
		hashSet.add("HELLO");
		hashSet.add("HELLO"); // 保存了重复数据
		hashSet.add("WORLD");
		hashSet.add("小金子");
		hashSet.add("小谢子");
		System.out.println(hashSet);

		Set treeSet = new TreeSet();
		treeSet.add("B");
		treeSet.add("D"); // 保存了重复数据
		treeSet.add("E");
		treeSet.add("A");
		treeSet.add("C");
		System.out.println(treeSet);
		
		
		
		Set<Person> tree = new TreeSet<Person>() ;
        tree.add(new Person("张三",20)) ;
        tree.add(new Person("李四",21)) ;
        tree.add(new Person("赵六",21)) ; // 年龄重复
        tree.add(new Person("王五",19)) ;
        tree.add(new Person("王五",19)) ; // 彻底重复
        System.out.println(tree);
	}

}
