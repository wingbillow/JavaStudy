package com.njcb.oo4;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Point {
	private Object x;
	private Object y;

	public void setX(Object x) {
		this.x = x;
	}

	public void setY(Object y) {
		this.y = y;
	}

	public Object getX() {
		return x;
	}

	public Object getY() {
		return y;
	}
}

class Point2<T> {
	private T x;
	private T y;

	public void setX(T x) {
		this.x = x;
	}

	public void setY(T y) {
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public T getY() {
		return y;
	}
}

public class TestGenericity {

	static <T> void test(Collection<T> a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}

	static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
		for (T o : a) {
			c.add(o);
		}
	}

	//关于泛型：http://www.infoq.com/cn/articles/cf-java-generics
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		Method method = list.getClass().getDeclaredMethod("add", Object.class);
		method.invoke(list, "hello");
		System.out.println(list);
		//这个例子说明，运行时，jvm只是知道List里面装的是Object，虽然定义的时候规定了只能往里面放Integer，实际上我们还是可以往里面放String

		List<Object> ao = new ArrayList<Object>();
		List<Object> ao1 = new ArrayList<Object>();
		test(ao, ao1);

		List<String> as = new ArrayList<String>();
		List<String> as1 = new ArrayList<String>();

		test(as, as1);

		// test(ao, as); //此处报错
		// String和Object可以是都是Object类型，但是Collection<String>和Collection<Object>不能都是Collection<Object>类型。
		List<?> a = new ArrayList<String>();
		List<Object> b = new ArrayList<Object>();

		Object[] oo = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		fromArrayToCollection(oo, co);

		String[] sa = new String[20];
		Collection<String> cs = new ArrayList<>();
		fromArrayToCollection(sa, cs);

		// Collection<Double> cd = new ArrayList<>();
		// 下面代码中T是Double类，但sa是String类型，编译错误。
		// fromArrayToCollection(sa, cd);

		// 下面代码中T是Object类型，sa是String类型，可以赋值成功。
		fromArrayToCollection(sa, co); // String[]和Object[]可以都是Object[]
		// 第一层次：设置坐标数据
		Point point1 = new Point();
		point1.setX(10); // 向上转型为Object
		point1.setY(20); // 向上转型为Object
		// 第二层次：取得坐标数据
		int x1 = (Integer) point1.getX(); // 向下转型
		int y1 = (Integer) point1.getY(); // 向下转型
		System.out.println("x = " + x1 + "，y = " + y1);

		Point point2 = new Point();
		point2.setX(10.2); // 向上转型为Object
		point2.setY(20.3); // 向上转型为Object
		// 第二层次：取得坐标数据
		double x2 = (Double) point2.getX(); // 向下转型
		double y2 = (Double) point2.getY(); // 向下转型
		System.out.println("x = " + x2 + "，y = " + y2);

		// 第一层次：设置坐标数据
		Point point3 = new Point();
		point3.setX("东经100度"); // 向上转型为Object
		point3.setY("北纬20度"); // 向上转型为Object
		// 第二层次：取得坐标数据
		String x3 = (String) point3.getX(); // 向下转型
		String y3 = (String) point3.getY(); // 向下转型
		System.out.println("x = " + x3 + "，y = " + y3);

		// 第一层次：设置坐标数据
		// Point point = new Point();
		// point.setX(10); // 向上转型为Object
		// point.setY("北纬20度"); // 向上转型为Object
		// // 第二层次：取得坐标数据
		// String x = (String) point.getX(); // 向下转型
		// String y = (String) point.getY(); // 向下转型
		// System.out.println("x = " + x + "，y = " + y);

		// 第一层次：设置坐标数据
		Point2<String> p4 = new Point2<String>();
		p4.setX("东经100度"); // 向上转型为Object
		p4.setY("北纬20度"); // 向上转型为Object
		// 第二层次：取得坐标数据
		String x4 = p4.getX(); // 向下转型
		String y4 = p4.getY(); // 向下转型
		System.out.println("x = " + x4 + "，y = " + y4);

		f(1);
		f(p4);
		f("xxx");

		// fp(1);
		fp(point2);

		ff(1);
		ff(p4);
		ff("xxx");
	}

	public static <T> void f(T x) {
		System.out.println(x.getClass().getName() + ":" + x);
	}

	public static <T extends Point> void fp(T x) {
		System.out.println(x.getClass().getName() + ":" + x);
	}

	public static void ff(Object x) {
		System.out.println(x.getClass().getName() + ":" + x);
	}
}
