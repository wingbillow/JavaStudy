package com.njcb.oo1;

class Book {
	private String title;
	private double price;
	private String auth;

	public Book() {
		System.out.print("һ��");
		System.out.print("�µ�Book");
		System.out.print("�����");
		System.out.println("����");
	}

	public Book(String title) {
		//System.out.println("") ;  ����
		this(); // ���ñ����޲ι���
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
		System.out.println("����:" + title + ",�۸�:" + price + ",����:" + auth);
		System.out.println("Book �����:" + this) ;
	}
}

public class TestThis {

	public static void main(String args[]) {
		Book book = new Book("Java ����", 79.8 , "njcb");
		book.getInfo();
		
		
		Book book1 = new Book("Java Web����");
		book1.getInfo();
	}
}
