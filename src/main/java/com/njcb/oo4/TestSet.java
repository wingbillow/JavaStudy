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
		return "������" + this.name + "������ :" + this.age + "\n";
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
		hashSet.add("HELLO"); // �������ظ�����
		hashSet.add("WORLD");
		hashSet.add("С����");
		hashSet.add("Сл��");
		System.out.println(hashSet);

		Set treeSet = new TreeSet();
		treeSet.add("B");
		treeSet.add("D"); // �������ظ�����
		treeSet.add("E");
		treeSet.add("A");
		treeSet.add("C");
		System.out.println(treeSet);
		
		
		
		Set<Person> tree = new TreeSet<Person>() ;
        tree.add(new Person("����",20)) ;
        tree.add(new Person("����",21)) ;
        tree.add(new Person("����",21)) ; // �����ظ�
        tree.add(new Person("����",19)) ;
        tree.add(new Person("����",19)) ; // �����ظ�
        System.out.println(tree);
	}

}
