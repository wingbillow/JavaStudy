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

	//���ڷ��ͣ�http://www.infoq.com/cn/articles/cf-java-generics
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		Method method = list.getClass().getDeclaredMethod("add", Object.class);
		method.invoke(list, "hello");
		System.out.println(list);
		//�������˵��������ʱ��jvmֻ��֪��List����װ����Object����Ȼ�����ʱ��涨��ֻ���������Integer��ʵ�������ǻ��ǿ����������String

		List<Object> ao = new ArrayList<Object>();
		List<Object> ao1 = new ArrayList<Object>();
		test(ao, ao1);

		List<String> as = new ArrayList<String>();
		List<String> as1 = new ArrayList<String>();

		test(as, as1);

		// test(ao, as); //�˴�����
		// String��Object�����Ƕ���Object���ͣ�����Collection<String>��Collection<Object>���ܶ���Collection<Object>���͡�
		List<?> a = new ArrayList<String>();
		List<Object> b = new ArrayList<Object>();

		Object[] oo = new Object[100];
		Collection<Object> co = new ArrayList<Object>();
		fromArrayToCollection(oo, co);

		String[] sa = new String[20];
		Collection<String> cs = new ArrayList<>();
		fromArrayToCollection(sa, cs);

		// Collection<Double> cd = new ArrayList<>();
		// ���������T��Double�࣬��sa��String���ͣ��������
		// fromArrayToCollection(sa, cd);

		// ���������T��Object���ͣ�sa��String���ͣ����Ը�ֵ�ɹ���
		fromArrayToCollection(sa, co); // String[]��Object[]���Զ���Object[]
		// ��һ��Σ�������������
		Point point1 = new Point();
		point1.setX(10); // ����ת��ΪObject
		point1.setY(20); // ����ת��ΪObject
		// �ڶ���Σ�ȡ����������
		int x1 = (Integer) point1.getX(); // ����ת��
		int y1 = (Integer) point1.getY(); // ����ת��
		System.out.println("x = " + x1 + "��y = " + y1);

		Point point2 = new Point();
		point2.setX(10.2); // ����ת��ΪObject
		point2.setY(20.3); // ����ת��ΪObject
		// �ڶ���Σ�ȡ����������
		double x2 = (Double) point2.getX(); // ����ת��
		double y2 = (Double) point2.getY(); // ����ת��
		System.out.println("x = " + x2 + "��y = " + y2);

		// ��һ��Σ�������������
		Point point3 = new Point();
		point3.setX("����100��"); // ����ת��ΪObject
		point3.setY("��γ20��"); // ����ת��ΪObject
		// �ڶ���Σ�ȡ����������
		String x3 = (String) point3.getX(); // ����ת��
		String y3 = (String) point3.getY(); // ����ת��
		System.out.println("x = " + x3 + "��y = " + y3);

		// ��һ��Σ�������������
		// Point point = new Point();
		// point.setX(10); // ����ת��ΪObject
		// point.setY("��γ20��"); // ����ת��ΪObject
		// // �ڶ���Σ�ȡ����������
		// String x = (String) point.getX(); // ����ת��
		// String y = (String) point.getY(); // ����ת��
		// System.out.println("x = " + x + "��y = " + y);

		// ��һ��Σ�������������
		Point2<String> p4 = new Point2<String>();
		p4.setX("����100��"); // ����ת��ΪObject
		p4.setY("��γ20��"); // ����ת��ΪObject
		// �ڶ���Σ�ȡ����������
		String x4 = p4.getX(); // ����ת��
		String y4 = p4.getY(); // ����ת��
		System.out.println("x = " + x4 + "��y = " + y4);

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
