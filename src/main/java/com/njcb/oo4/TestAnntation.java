package com.njcb.oo4;

class Book {
	
	
	@Override // 表示此方法是覆写而来
	public String toString() {
		return "这是一本书";
	}
	
	@Deprecated
	public void print(){
		System.out.println("废弃方法");
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
