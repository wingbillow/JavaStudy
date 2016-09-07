package com.njcb.oo1;

class Book {
	private String title;
	private double price;
	private String auth;

	public Book() {
		System.out.print("一个");
		System.out.print("新的Book");
		System.out.print("类对象");
		System.out.println("产生");
	}

	public Book(String title) {
		//System.out.println("") ;  报错
		this(); // 调用本类无参构造
		this.title = title;
	}

	public Book(String title, double price) {
		this(title); 
		this.price = price;
	}

	public Book(String title, double price ,String auth) {
		this(title , price); 
		this.auth = auth;
	}

	public void getInfo() {
		System.out.println("书名:" + title + ",价格:" + price + ",作者:" + auth);
		System.out.println("Book 类输出:" + this) ;
	}
}

public class TestThis {

	public static void main(String args[]) {
		Book book = new Book("Java 开发", 79.8 , "njcb");
		book.getInfo();
		
		
		Book book1 = new Book("Java Web开发");
		book1.getInfo();
	}
}
