package com.njcb.oo2;

public class Person {
	private String name;
	private int age;

	public Person() {
		System.out.println("Person�๹�췽����");
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void print() {
		System.out.println("Person�࣬public void print(){}");
	}
}
