package com.njcb.oo3;

import java.util.Arrays;

class Book {
	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "书名:" + this.title + ",价格:" + this.price;
	}
}

public class TestArrayObject {
	public static void main(String args[]) {
		// String args[]：字符串对象数组，用于接收初始化参数。
		for (int x = 0; x < args.length; x++) {
			System.out.println(args[x]);
		}

		Book[] books = new Book[3];
		books[0] = new Book("Java 开发", 79.8);
		books[1] = new Book("Oracle 开发", 89.8);
		books[2] = new Book("JSP 开发", 69.8);
		for (int x = 0; x < books.length; x++) {
			System.out.println(books[x]);
		}

		System.out.println(Arrays.toString(books));
		
		Book books2[] = new Book[] { new Book("Java 开发", 79.8), new Book("Oracle 开发", 89.8), new Book("JSP 开发", 69.8) };
		System.out.println(Arrays.toString(books2));
	}
}
