package com.njcb.oo4;

class Book {
	
	
	@Override // ��ʾ�˷����Ǹ�д����
	public String toString() {
		return "����һ����";
	}
	
	@Deprecated
	public void print(){
		System.out.println("��������");
	}
}

public class TestAnntation {

	public static void main(String[] args) {
		Book book = new Book() ;
		book.print();
		
		@SuppressWarnings("unused")
		Book book2 = new Book() ;
		
	}

}
