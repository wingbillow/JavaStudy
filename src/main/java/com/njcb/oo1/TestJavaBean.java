package com.njcb.oo1;

class Emp  {  
	private int empno;
	private String ename;
	private String job;
	private double sal;

	public Emp() {
	} // �޲ι������ʼ�ձ�д

	public Emp(int eno, String ena, String j, double s, double c) {
		this.setEmpno(eno);
		this.setEname(ena);
		this.setJob(j);
		this.setSal(s);
	}


	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

//	@Override
//	public String toString() {
//		return "��Ա��Ϣ��" + "\n" + "\t|- ��Ա��ţ�" + empno + "\n" + "\t|- ��Ա������" + this.getEname() + "\n" + "\t|- ��Աְλ��"
//				+ this.getJob() + "\n" + "\t|- ��Ա���ʣ�" + this.getSal() + "\n"  ;
//	}
	
	
}

public class TestJavaBean {
	public static void main(String args[]) {
		System.out.println(new Emp(7369, "SMITH", "CLERK", 800.0, 0.0));
	}
}
