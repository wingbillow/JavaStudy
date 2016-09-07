package com.njcb.oo2;

interface Shape {

	public double getPerimeter();

	public double getArea();

	public void printShape();

	public String getInfo();
}

class Circle implements Shape {

	private double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

	@Override
	public double getArea() {
		return radius * radius * Math.PI;
	}

	@Override
	public void printShape() {
		int r = 5;
		for (int y = 0; y <= 2 * r; y += 2) {
			long x = Math.round(r - Math.sqrt(2 * r * y - y * y));
			long longLength = 2 * (r - x);

			for (int i = 0; i <= x; i++) {
				System.out.print(' ');
			}
			System.out.print('*');

			for (int j = 0; j <= longLength; j++) {
				System.out.print(' ');
			}
			System.out.println('*');
		}
	}

	@Override
	public String getInfo() {
		return "圆形：" + "半径" + radius;
	}

}

class Rectangle implements Shape {

	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public double getPerimeter() {
		return 0;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public void printShape() {
		 
	}

	@Override
	public String getInfo() {
		return "矩形：长" + this.length + "宽" + this.width;
	}

}

public class TestShape {

	public static void main(String[] args) {
		Shape c = new Circle(3);
		c.printShape();
		printArea(c);

		printArea(new Circle(4));

		Shape r = new Rectangle(3, 4);
		r.printShape();
		printArea(r);

		printArea(new Rectangle(4, 5));
	}

	public static void printArea(Shape s) {
		System.out.println(s.getInfo() + "面积:" + s.getArea());
	}

	public static void printArea(Circle c) {
		System.out.println(c.getInfo() + "Area:" + c.getArea());
	}

	public static void printArea(Rectangle r) {
		System.out.println(r.getInfo() + "Area:" + r.getArea());
	}
}
