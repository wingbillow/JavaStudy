package com.njcb.oo3;

class Phone {
	private String name;
	private double price;

	public Phone(String title, double price) {
		this.name = title;
		this.price = price;
	}

	public String getTitle() {
		return name;
	}

	public void setTitle(String title) {
		this.name = title;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Ãû³Æ:" + this.name + ",¼Û¸ñ:" + this.price;
	}
	
	
	public boolean equals(Object phone2){
		if(super.equals(phone2) ){
			return true;
		}
		
		if(phone2 !=null && phone2.getClass() ==  this.getClass() ){
			Phone p2 = (Phone)phone2;
			if( this.getTitle().equals(p2.getTitle()) && this.getPrice() == p2.getPrice()){
				return true;
			}
		}
		
		return false;
	}
}

public class TestEquals {

	public static void main(String[] args) {
		
		Phone a = new Phone("iphone", 6000);
		Phone b = new Phone("T2", 1500);
		Phone c = new Phone("iphone", 6000);
		
		System.out.println(a.equals(b) );
		System.out.println(a.equals(c) );
	}

}
