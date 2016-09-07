package com.njcb.oo1;

class Emp  {  
	private int empno;
	private String ename;
	private String job;
	private double sal;

	public Emp() {
	} // 无参构造必须始终编写

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
//		return "雇员信息：" + "\n" + "\t|- 雇员编号：" + empno + "\n" + "\t|- 雇员姓名：" + this.getEname() + "\n" + "\t|- 雇员职位："
//				+ this.getJob() + "\n" + "\t|- 雇员工资：" + this.getSal() + "\n"  ;
//	}
	
	
}

public class TestJavaBean {
	public static void main(String args[]) {
		System.out.println(new Emp(7369, "SMITH", "CLERK", 800.0, 0.0));
	}
}
