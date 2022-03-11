package com.springjdbcTwo.bean;

public class Student {
	
	private int rollnumber;
	private String name;
	private String lastname;
	private int PRN;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollnumber, String name, String lastname, int pRN) {
		super();
		this.rollnumber = rollnumber;
		this.name = name;
		this.lastname = lastname;
		PRN = pRN;
	}

	public int getRollnumber() {
		return rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getPRN() {
		return PRN;
	}

	public void setPRN(int pRN) {
		PRN = pRN;
	}

	@Override
	public String toString() {
		return "Student [rollnumber=" + rollnumber + ", name=" + name + ", lastname=" + lastname + ", PRN=" + PRN + "]";
	}
	
	

}
